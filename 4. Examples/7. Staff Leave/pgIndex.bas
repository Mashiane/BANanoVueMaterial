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
	'set the logo of the app
	vm.NavBar.UpdateLogo(Main.AppLogo)
	'update the title of the navbar
	vm.NavBar.SetTitle(Main.AppTitle)
	'update the title of the drawer toolbar
	vm.Drawer.SetTitle(Main.AppTitle)
	'the drawer should be persistent
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
	'
	vm.NavBar.AddIcon("btnTour","help", "Start tour", "")
	vm.NavBar.AddIcon("btnAddEmployees","add", "Add Employee", "")
	vm.NavBar.AddIcon("btnRefreshEmployees","refresh", "Refresh Employees", "")
	'build the drawer buttons
	BuildDrawer
	'add the pages to the app
	AddPages
	'build the page
	vm.ux
	'start on this page
	modEmployees.ShowEmployees
	
End Sub


Sub BuildDrawer
	vm.Drawer.AddItem("pageEmployees", "", "Employees")
End Sub

'add different 'pages' you have created add them here
'these should be code modules
Sub AddPages
	vm.AddPage(modEmployees.name, modEmployees)
End Sub

Sub back_click(e As BANanoEvent)

End Sub

Sub confirm_ok(e As BANanoEvent)
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	Case "delete_employees"
		modEmployees.DeleteEmployees
	End Select
End Sub

Sub confirm_cancel(e As BANanoEvent)
	
End Sub

'***** Add this to [pgIndex]
'show Employees via drawer click
Sub pageEmployees_click(e As BANanoEvent)
	'show the Employees page
	modEmployees.ShowEmployees
End Sub

'add a new Employees record
Sub btnAddEmployees_click(e As BANanoEvent)
	'execute adding code for Employees
	modEmployees.AddEmployees
End Sub


'refresh Employees listing
Sub btnRefreshEmployees_click(e As BANanoEvent)
	'reset the filters
	vm.CallMethod("ResetFiltersEmployees")
	'execute code to refresh listing for Employees
	vm.CallMethod("RefreshEmployees")
End Sub