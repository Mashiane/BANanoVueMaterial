B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "dashboardcode"
	Public expcont As VMContainer   ' container for Add Expense
	Private BANano As BANano
End Sub

Sub Code
	Log("modDashboard.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 1 columns each spanning 12 columns
	cont.AddRows(1).AddColumns2x6
	'
	Dim ec As VMContainer = AddExpense
	Dim bcm As VMContainer = AddBudgetCurrentMonth
	
	cont.AddComponent(1, 1, ec.tostring)
	cont.AddComponent(1,2, bcm.tostring)
	
	'add container to the page content
	vm.AddContainer(cont)
End Sub

Sub AddExpense As VMContainer
	expcont = vm.CreateContainer("expcont", Me)
	expcont.SetElevation(2)
	expcont.SetPaddingAll("20px")
	
	Dim expense_label As VMInputControl = expcont.NewH1("expense_label", "Add Expense")
	expcont.AddControl(expense_label, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	
	Dim expense_id As VMInputControl = expcont.NewText("id","#","",False,"",0,"","",0)
	expense_id.SetVisible(False).SetInt
	expcont.AddControl(expense_id, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	Dim expense_date As VMInputControl = expcont.NewDatePicker("expense_date", "Date", True, False, True, "",0)
	expcont.AddControl(expense_date, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim expense_category As VMInputControl = expcont.NewSelect("expense_category","Category",True,False,"","categories","id","text","","The category should be specified!",0)
	expense_category.setint
	expcont.AddControl(expense_category, 2, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim expense_type As VMInputControl = expcont.NewSelect("expense_type","Type",True,False,"","types","id","text","","The type should be specified!",0)
	expense_type.setint
	expcont.AddControl(expense_type, 3, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim expense_amount As VMInputControl = expcont.NewTel("expense_amount", "Amount", "", True, "", "","The amount should be specified!",0)
	expense_amount.setdouble
	expcont.AddControl(expense_amount, 3, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	'
	Dim expense_description As VMInputControl = expcont.NewTextArea("expense_description", "Description", "", False, False, "",100, "","",0)
	expcont.AddControl(expense_description, 4, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	Dim labelx As VMInputControl = expcont.NewP("labelx", "Labelx").SetVisible(False)
	expcont.AddControl(labelx, 5, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	
	Dim btnSubmitExpense As VMInputControl = expcont.NewButton("btnSubmitExpense", "Submit", "", True, True, False, True)
	expcont.AddControl(btnSubmitExpense, 5, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	'these should not be processed
	expcont.AddExclusion(Array("expense_label","labelx"))
	Return expcont
End Sub

Sub btnSubmitExpense_click(e As BANanoEvent)
	'get the data
	Dim expense As Map = expcont.GetData
	'validate the data
	Dim bValid As Boolean = vm.Validate(expense, expcont.Required)
	If bValid = False Then Return
	'
	'expense is valid
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.SchemaFromDesign(expcont)
	dbsql.RecordFromMap(expense)
	dbsql.Insert
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		expcont.setdefaults
		vm.ShowSnackBar("Expense added successfully!")
	Else
		Log("modDashboard.btnSubmitExpense_click: Error - " & dbsql.error)
		vm.ShowSnackBar(dbsql.error)
	End If
End Sub


Sub AddBudgetCurrentMonth As VMContainer
	Dim bcont As VMContainer = vm.CreateContainer("budgetcurrmonthcont", Me)
	bcont.SetElevation(2)
	bcont.SetPaddingAll("20px")
	
	Dim lblx As VMInputControl = expcont.NewH1("lblx", "Budget (Current Month)")
	bcont.AddControl(lblx, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	
	
	
	Return bcont
End Sub