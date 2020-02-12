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
	vm.NavBar.UpdateLogo("./assets/sponge.png")
	vm.NavBar.SetTitle("MyApp")
	vm.Drawer.SetTitle("MyApp")
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
	BuildDrawer
	AddPages
	'build the page
	vm.ux
End Sub


Sub BuildDrawer
	vm.Drawer.AddItem("settings","gear","Settings")
	vm.drawer.AddSubItem("settings", "users", "person_outline", "Users")
End Sub

'add different 'pages' you have created add them here
'these should be code modules
Sub AddPages
	vm.AddPage(modUsers.name, modUsers)
End Sub

'drawer item has been clicked
Sub users_click(e As BANanoEvent)
	vm.NavBar.SetTitle("Users")
	vm.ShowPage(modUsers.name)
End Sub

Sub back_click(e As BANanoEvent)

End Sub
