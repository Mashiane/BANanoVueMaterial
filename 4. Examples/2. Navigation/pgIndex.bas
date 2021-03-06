﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano  'ignore
	Private vm As BANanoVM
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	'update the nav bar title
	vm.navbar.UpdateLogo("./assets/sponge.png")
	vm.NavBar.SetTitle("Navigation")
	vm.Drawer.SetTitle("Navigation")
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
	'add buttons
	vm.NavBar.AddIcon("npage1","done","Go to page 1", "")
	vm.NavBar.AddIcon("npage2","done_all","Go to page 2", "")
	
	'add the drawer items
	vm.Drawer.AddItem("page1","done", "Page 1")
	vm.Drawer.AddItem("page2","done_all", "Page 2")
	'add the code from the modules
	vm.AddPage(modPage1.name, modPage1)
	vm.addpage(modPage2.name, modPage2)
	'show this page
	vm.navbar.UpdateTitle("Navigation - Page 1")
	vm.ShowPage(modPage1.name)
	vm.Hide("npage1")
	vm.Show("npage2")
	
	'build the page
	vm.ux
End Sub

Sub page1_click(e As BANanoEvent)
	'update the title of the navigation bar
	vm.navbar.UpdateTitle("Navigation - Page 1")
	'show page 1
	vm.showpage(modPage1.name)
	'hide the navbar button
	vm.Hide("npage1")
	'show the navbar button
	vm.Show("npage2")
End Sub

Sub page2_click(e As BANanoEvent)
	'update the title of the navigation bar
	vm.navbar.UpdateTitle("Navigation - Page 2")
	'show page 2
	vm.showpage(modPage2.name)
	vm.Show("npage1")
	vm.Hide("npage2")
End Sub

Sub npage1_click(e As BANanoEvent)
	vm.navbar.UpdateTitle("Navigation - Page 1")
	vm.ShowPage(modPage1.name)
	vm.Show("npage2")
	vm.Hide("npage1")
End Sub

Sub npage2_click(e As BANanoEvent)
	vm.navbar.UpdateTitle("Navigation - Page 2")
	vm.ShowPage(modPage2.name)
	vm.Show("npage1")
	vm.Hide("npage2")
End Sub
