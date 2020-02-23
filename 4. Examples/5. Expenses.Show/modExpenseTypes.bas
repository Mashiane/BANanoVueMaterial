B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "expensetypecode"
	Private expenseType As VMGijgoTable
	Public Mode As String
	Public mdlExpenseType As VMDialog
	Private BANano As BANano
End Sub

Sub Code
	Mode = ""
	Log("modExpenseTypes.Code")
	vm = pgIndex.vm
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 1 columns each spanning 12 columns
	cont.AddRows(1).AddColumns12
	'
	expenseType = vm.CreateGijgoTable("expensetype", "id", Me)
	expenseType.SetTitle("Expense Types")
	expenseType.AddColumn("text","Name")   ' 20
	expenseType.AddColumn("description","Description")   '100
	expenseType.AddEditTrash
	expenseType.autoLoad = True
	expenseType.SetDataSource(Array())
	cont.AddComponent(1,1, expenseType.tostring)
	'add container to the page content
	vm.AddContainer(cont)
	'
	'create a modal to add an expense type
	mdlExpenseType = vm.CreateDialog("mdlExpenseType",Me)
	mdlExpenseType.settitle("New Expense Type")
	mdlExpenseType.AddCancel("btnCancelExpenseType", "Cancel")
	mdlExpenseType.AddOK("btnSaveExpenseType", "Save")
	'
	Dim etID As VMInputControl = vm.NewText("id","#","",False,"",0,"","",0)
	etID.SetVisible(False).SetInt
	Dim etText As VMInputControl = vm.NewText("text","Name","",True,"",20,"","The expense type is required!",0)
	Dim etDescription As VMInputControl = vm.NewTextArea("description","Description","",False,False,"",100,"","",0)
	
	
	mdlExpenseType.Container.AddControlS(etID, 1, 1, 12, 12, 12, 12)
	mdlExpenseType.Container.AddControlS(etText, 2, 1, 12, 12, 12, 12)
	mdlExpenseType.Container.AddControlS(etDescription, 3, 1, 12, 12, 12, 12)
	'
	mdlExpenseType.SetClickOutsideToClose(False)
	mdlExpenseType.SetCloseOnEsc(False)
	mdlExpenseType.SetWidth("500px")
	vm.AddDialog(mdlExpenseType)
End Sub

'a button to add a new record is clicked
Sub Add
	Mode = "A"
	mdlExpenseType.Container.SetDefaults
	mdlExpenseType.SetTitle("New Expense Type")
	vm.ShowDialog("mdlExpenseType")
End Sub

'load all existing expense types
Sub Refresh
	vm.pagepause
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expensetypes", "id")
	dbsql.SelectAll(Array("*"), Array("text"))
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		expenseType.SetDataSource(dbsql.result)
		expenseType.refresh
	Else
		Log("modExpenseTypes.Refresh: Error - " & dbsql.error)
	End If
	vm.pageresume
End Sub

Sub btnCancelExpenseType_click(e As BANanoEvent)
	vm.HideDialog("mdlExpenseType")
End Sub

Sub btnSaveExpenseType_click(e As BANanoEvent)
	'get the category
	Dim rec As Map = mdlExpenseType.Container.GetData
	'validate
	Dim bValid As Boolean = vm.validate(rec, mdlExpenseType.Container.Required)
	If bValid = False Then Return
			
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expensetypes", "id")
	dbsql.SchemaFromDesign(mdlExpenseType.Container)
	Select Case Mode
		Case "A"
			dbsql.RecordFromMap(rec)
			dbsql.Insert
			dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
			dbsql.FromJSON
			If dbsql.OK Then
				vm.ShowSnackBar("Expense Type added successfully!")
				vm.HideDialog("mdlExpenseType")
				Refresh
			Else
				Log("modExpenseTypes.btnSaveExpenseType_click: Error - " & dbsql.error)
				vm.ShowSnackBar(dbsql.error)
			End If
		Case "E"
			Dim sid As String = rec.Get("id")
			dbsql.RecordFromMap(rec)
			dbsql.Update(sid)
			dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
			dbsql.FromJSON
			If dbsql.OK Then
				vm.ShowSnackBar("Expense Type updated successfully!")
				vm.HideDialog("mdlExpenseType")
				Refresh
			Else
				Log("modExpenseTypes.btnSaveExpenseType_click: Error - " & dbsql.error)
				vm.ShowSnackBar(dbsql.error)
			End If
	End Select
End Sub

'an edit button is clicked on the table
Sub expensetype_edit(e As BANanoEvent)
	'get the record corresponding to the row
	Dim rec As Map = expenseType.GetRecordFromEvent(e)
	Dim sid As String = rec.GetDefault("id","")
	If sid = "" Then Return
	'turn the mode to edit
	Mode = "E"
	'update the title of the modal dialog
	mdlExpenseType.SetTitle("Edit Expense Type")
	'set the default values for the modal
	mdlExpenseType.Container.setdefaults
	'update the states for the modeal
	vm.SetState(rec)
	'show the modal with new states
	vm.showdialog("mdlExpenseType")
End Sub

'table delete record is clicked
Sub expensetype_delete(e As BANanoEvent)
	'get the record for the row
	Dim rec As Map = expenseType.GetRecordFromEvent(e)
	Dim sid As String = rec.GetDefault("id","")
	Dim stext As String = rec.getdefault("text","")
	If sid = "" Then Return
	'save the category id to delete
	vm.SetStateSingle("expensetypeid", sid)
	'indicate confirm dialog
	vm.ShowConfirm("delete_expensetype", $"Confirm Delete: ${stext}"$, _
	"Are you sure that you want to delete this expense type. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub