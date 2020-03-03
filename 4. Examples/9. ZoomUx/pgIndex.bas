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
	vm.NavBar.Hide
	'set primary color for the navbar
	vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	'hide the back button
	vm.NavBar.SetHasBackButton(False)
	'show the hamburger button
	vm.NavBar.SetHasMenuButton(False)
	'build the drawer buttons
	BuildDrawer
	'add the pages to the app
	AddPages
	'build the page
	vm.ux
	'show the calculations page
	vm.showpage(modZoom.Name)
End Sub


Sub BuildDrawer
End Sub

'add different 'pages' you have created add them here
'these should be code modules
Sub AddPages
	vm.AddPage(modZoom.Name, modZoom)
End Sub

Sub back_click(e As BANanoEvent)

End Sub

Sub confirm_ok(e As BANanoEvent)
	Dim sconfirm As String = vm.GetConfirm
	Select Case sconfirm
	'***add code here***	
	End Select
End Sub

Sub confirm_cancel(e As BANanoEvent)
	
End Sub

