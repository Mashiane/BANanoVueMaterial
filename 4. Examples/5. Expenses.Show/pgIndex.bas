B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano  'ignore
	Public vm As BANanoVM
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	vm.NavBar.SetTitle("Expenses.Show")
	vm.Drawer.SetTitle("Expenses.Show")
	vm.Drawer.SetPersistentFull(True)
	'the navbar will be visible
	vm.NavBar.Show
	'set primary color for the navbar
	vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	'hide the back button
	vm.NavBar.SetHasBackButton(False)
	'show the hamburger button
	vm.NavBar.SetHasMenuButton(True)
	vm.NavBar.AddIcon("btnAddExpenseType", "add", "Add expense type", "")
	vm.NavBar.AddIcon("btnAddExpenseCategory", "add", "Add expense category", "")
	vm.NavBar.AddIcon("btnAddExpense", "add", "Add expense", "")
	'
	'build the page
	vm.SetMethod(Me, "LoadTypes")
	vm.SetMethod(Me, "LoadCategories")
	'
	BuildDrawer
	AddPages
	HideButtons
	
	vm.ux
	'
	ShowDashboard
End Sub

Sub LoadTypes
	vm.SetStateSingle("types", Array())
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expensetypes", "id")
	dbsql.SelectAll(Array("id","text"), Array("text"))
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		vm.SetStateSingle("types", dbsql.result)
	End If
End Sub

Sub LoadCategories
	vm.SetStateSingle("categories", Array())
	Dim dbsql As BANanoMySQL
	dbsql.Initialize(Main.dbase, "expensecategories", "id")
	dbsql.SelectAll(Array("id","text"), Array("text"))
	dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
	dbsql.FromJSON
	If dbsql.OK Then
		vm.SetStateSingle("categories", dbsql.result)
	End If	
End Sub

Sub btnAddExpense_click(e As BANanoEvent)
	modExpenses.add 
End Sub

Sub btnAddExpenseType_click(e As BANanoEvent)
	modExpenseTypes.Add
End Sub

Sub btnAddExpenseCategory_click(e As BANanoEvent)
	modExpenseCategories.Add
End Sub

Sub HideButtons
	vm.hide("btnAddExpenseCategory")
	vm.Hide("btnAddExpenseType")
	vm.hide("btnAddExpense")
End Sub

Sub BuildDrawer
	vm.Drawer.AddItem("dashboard","","Dashboard")
	vm.Drawer.AddItem("expenses","","Expenses")
	vm.Drawer.AddItem("stats","","Stats")
	vm.Drawer.AddItem("settings","","Settings")
	vm.Drawer.AddSubItem("settings","expensetypes","","Expense Types")
	vm.Drawer.AddSubItem("settings","expensecategories","","Expense Categories")
End Sub

'add different 'pages' you have created add them here
'these should be code modules
Sub AddPages
	vm.AddPage(modDashboard.name, modDashboard)
	vm.AddPage(modExpenses.name, modExpenses)
	vm.AddPage(modStats.name, modStats)
	vm.AddPage(modExpenseTypes.name, modExpenseTypes)
	vm.Addpage(modExpenseCategories.name, modExpenseCategories)
End Sub

Sub expensetypes_click(e As BANanoEvent)
	HideButtons
	vm.Show("btnAddExpenseType")
	vm.NavBar.SetTitle("Expenses.Show - Settings")
	vm.showpage(modExpenseTypes.name)
	modExpenseTypes.refresh
End Sub

Sub expensecategories_click(e As BANanoEvent)
	HideButtons
	vm.show("btnAddExpenseCategory")
	vm.NavBar.SetTitle("Expenses.Show - Settings")
	vm.showpage(modExpenseCategories.name)
	modExpenseCategories.refresh
End Sub

Sub stats_click(e As BANanoEvent)
	HideButtons
	vm.NavBar.SetTitle("Expenses.Show - Stats")
	vm.showpage(modStats.name)
End Sub

Sub expenses_click(e As BANanoEvent)
	HideButtons
	vm.Show("btnAddExpense")
	vm.NavBar.SetTitle("Expenses.Show - Expenses")
	vm.showpage(modExpenses.name)
	modExpenses.refresh
End Sub

Sub dashboard_click(e As BANanoEvent)
	ShowDashboard
End Sub

Sub ShowDashboard
	HideButtons
	' show the dashboard
	vm.CallMethod("LoadTypes")
	vm.CallMethod("LoadCategories")
	vm.NavBar.SetTitle("Expenses.Show - Dashboard")
	modDashboard.expcont.setdefaults
	vm.showpage(modDashboard.name)
End Sub	

Sub back_click(e As BANanoEvent)

End Sub

Sub confirm_ok
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	Case "delete_expensetype"
		'get the expense type to be deleted
		Dim sid As String = vm.getstate("expensetypeid", "")
		If sid = "" Then Return
		'connect to the database
		Dim dbsql As BANanoMySQL
		dbsql.Initialize(Main.dbase, "expensetypes", "id")
		dbsql.Delete(sid)
		dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
		dbsql.FromJSON
		If dbsql.OK Then
			vm.ShowSnackBar("Expense Type deleted successfully!")
			'refresh the table listing
			modExpenseTypes.Refresh
		Else
			Log("phIndex.confirm_ok.delete_expensetype: Error - " & dbsql.error)
			vm.ShowSnackBar(dbsql.error)
		End If
	Case "delete_category"
		'delete a category
		'get the category to be deleted
		Dim sid As String = vm.getstate("categoryid", "")
		If sid = "" Then Return
		Dim dbsql As BANanoMySQL
		dbsql.Initialize(Main.dbase, "expensecategories", "id")
		dbsql.Delete(sid)
		dbsql.json = BANano.CallInlinePHPWait(dbsql.methodname, dbsql.Build)
		dbsql.FromJSON
		If dbsql.OK Then
			vm.ShowSnackBar("Expense Category deleted successfully!")
			modExpenseCategories.Refresh
		Else
			Log("phIndex.confirm_ok.delete_category: Error - " & dbsql.error)
			vm.ShowSnackBar(dbsql.error)
		End If
	End Select
	
End Sub
