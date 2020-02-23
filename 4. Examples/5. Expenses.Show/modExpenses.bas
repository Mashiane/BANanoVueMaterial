B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "expensescode"
	Public Mode As String
	Public mdlExpenses As VMDialog
	Private BANano As BANano
	Private expenses As VMGijgoTable
End Sub

Sub Code
	Log("modExpenses.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 1 columns each spanning 12 columns
	cont.AddRows(1).AddColumns12
	'
	expenses = vm.CreateGijgoTable("expensetable", "id", Me)
	expenses.SetTitle("Expenses")
	expenses.AddColumn("expense_date","Date")   
	expenses.AddColumn("expense_category","Category")
	expenses.AddColumn("expense_type","Type")   
	expenses.AddColumn("expense_description","Description")  
	expenses.AddColumn("expense_amount","Amount")
	expenses.AddEditTrash
	expenses.AddClone
	expenses.SetMoneyColumns(Array("expense_amount"))
	expenses.SetDataSource(Array())
	cont.AddComponent(1,1, expenses.tostring)
	
	'add container to the page content
	vm.AddContainer(cont)
	'
	'create a modal to add an expense type
	mdlExpenses = vm.CreateDialog("mdlExpenses",Me)
	mdlExpenses.settitle("New Expense")
	mdlExpenses.AddCancel("btnCancelExpense", "Cancel")
	mdlExpenses.AddOK("btnSaveExpense", "Save")
	'
	Dim expense_id As VMInputControl = vm.NewText("id","#","",False,"",0,"","",0).SetVisible(False).SetInt
	Dim expense_date As VMInputControl = vm.NewDatePicker("expense_date", "Date", True, False, True, "","","The expense date should be specified!",0)
	Dim expense_category As VMInputControl = vm.NewSelect("expense_category","Category",True,False,"","categories","id","text","","The category should be specified!",0).SetInt
	Dim expense_type As VMInputControl = vm.NewSelect("expense_type","Type",True,False,"","types","id","text","","The type should be specified!",0).SetInt
	Dim expense_amount As VMInputControl = vm.NewTel("expense_amount", "Amount", "", True, "", "","The amount should be specified!",0).SetDouble
	Dim expense_description As VMInputControl = vm.NewTextArea("expense_description", "Description", "", False, False, "",100, "","",0)
	'
	mdlExpenses.Container.AddControl(expense_id, 1, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	mdlExpenses.Container.AddControl(expense_date, 2, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	mdlExpenses.Container.AddControl(expense_category, 2, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	mdlExpenses.Container.AddControl(expense_type, 3, 1, 0, 0, 0, 0, 12, 6, 6, 6)
	mdlExpenses.Container.AddControl(expense_amount, 3, 2, 0, 0, 0, 0, 12, 6, 6, 6)
	mdlExpenses.Container.AddControl(expense_description, 4, 1, 0, 0, 0, 0, 12, 12, 12, 12)
	'
	mdlExpenses.SetClickOutsideToClose(False)
	mdlExpenses.SetCloseOnEsc(False)
	mdlExpenses.SetWidth("700px")
	vm.AddDialog(mdlExpenses)
	
End Sub

Sub btnCancelExpense_click(e As BANanoEvent)
	vm.hidedialog("mdlExpenses")
End Sub

Sub btnSaveExpense_click(e As BANanoEvent)
	'get the data
	Dim expense As Map = mdlExpenses.Container.GetData
	'validate the data
	Dim bValid As Boolean = vm.Validate(expense, mdlExpenses.Container.Required)
	If bValid = False Then Return
	'
	'expense is valid
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.SchemaFromDesign(mdlExpenses.Container)
	Select Case Mode
	Case "A"
		dbsql.RecordFromMap(expense)
		dbsql.Insert
		dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
		dbsql.FromJSON
		If dbsql.OK Then
			vm.ShowSnackBar("Expense added successfully!")
			vm.HideDialog("mdlExpenses")
			Refresh
		Else
			Log("modExpenses.btnSaveExpense_click: Error - " & dbsql.error)
			vm.ShowSnackBar(dbsql.error)
		End If
	Case "E"
		Dim sid As String = expense.Get("id")
		dbsql.RecordFromMap(expense)
		dbsql.Update(sid)
		dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
		dbsql.FromJSON
		If dbsql.OK Then
			vm.ShowSnackBar("Expense updated successfully!")
			vm.HideDialog("mdlExpenses")
			Refresh
		Else
			Log("modExpenses.btnSaveExpense_click: Error - " & dbsql.error)
			vm.ShowSnackBar(dbsql.error)
		End If
	End Select
End Sub

'a button to add a new record is clicked
Sub Add
	Mode = "A"
	vm.CallMethod("LoadTypes")
	vm.CallMethod("LoadCategories")
	mdlExpenses.Container.SetDefaults
	mdlExpenses.SetTitle("New Expense")
	vm.ShowDialog("mdlExpenses")
End Sub


'load all existing expenses
Sub Refresh
	vm.pagepause
	Dim qry As String = "select expenses.id, expenses.expense_date, expenses.expense_description, expenses.expense_amount, expensecategories.text as expense_category,"
	qry = qry & "expensetypes.text As expense_type from expenses, expensecategories, expensetypes where expenses.expense_category = expensecategories.id and expenses.expense_type = "
	qry = qry & "expensetypes.id order by id"
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Execute(qry)
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		expenses.SetDataSource(dbsql.result)
		expenses.refresh
	Else
		Log("modExpenses.Refresh: Error - " & dbsql.error)
	End If
	vm.pageresume
End Sub

Sub expensetable_edit(e As BANanoEvent)
	'get the record corresponding to the row
	Dim rec As Map = expenses.GetRecordFromEvent(e)
	Dim sid As String = rec.GetDefault("id","")
	If sid = "" Then Return
	'turn the mode to edit
	Mode = "E"
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Read(sid)
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		Dim rec As Map = dbsql.result.get(0)
		vm.CallMethod("LoadTypes")
		vm.CallMethod("LoadCategories")
		mdlExpenses.Container.SetDefaults
		mdlExpenses.SetTitle("Edit Expense")
		vm.SetState(rec)
		vm.ShowDialog("mdlExpenses")
	Else
		Log("modExpenses.expensetable_edit: Error - " & dbsql.error)
	End If
End Sub

Sub expensetable_clone(e As BANanoEvent)
	'get the record corresponding to the row
	Dim rec As Map = expenses.GetRecordFromEvent(e)
	Dim sid As String = rec.GetDefault("id","")
	If sid = "" Then Return
	'turn the mode to edit
	Mode = "A"
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expenses", "id")
	dbsql.Read(sid)
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		Dim rec As Map = dbsql.result.get(0)
		rec.put("id", Null)
		vm.CallMethod("LoadTypes")
		vm.CallMethod("LoadCategories")
		mdlExpenses.Container.SetDefaults
		mdlExpenses.SetTitle("New Expense")
		vm.SetState(rec)
		vm.ShowDialog("mdlExpenses")
	Else
		Log("modExpenses.expensetable_clone: Error - " & dbsql.error)
	End If
End Sub

Sub expensetable_delete(e As BANanoEvent)
	'get the record corresponding to the row
	Dim rec As Map = expenses.GetRecordFromEvent(e)
	Dim sid As String = rec.GetDefault("id","")
	If sid = "" Then Return
	'save the category id to delete
	vm.SetStateSingle("expenseid", sid)
	'indicate confirm dialog
	vm.ShowConfirm("delete_expense", $"Confirm Delete: ${sid}"$, _
	"Are you sure that you want to delete this expense. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub