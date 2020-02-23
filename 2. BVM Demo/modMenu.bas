B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "menucode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modMenu.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns(4,12,3,3,3)
	
	Dim m1 As VMMenu = vm.CreateMenu("m1", Me)
	'add a button to trigger the menu
	m1.SetButton("", "Bottom Start")
	m1.SetDirectionBottomStart(True)
	m1.AddMenuItem("mi1","","My Item 1")
	m1.AddMenuItem("mi2","","My Item 2")
	m1.AddMenuItem("mi3","","My Item 3")
	m1.AddToContainer(cont, 1, 1)
	'
	Dim be As VMMenu = vm.CreateMenu("be", Me)
	'add a button to trigger the menu
	be.SetButton("", "Bottom End")
	be.SetDirectionBottomEnd(True)
	be.AddMenuItem("be1","","My Item 1")
	be.AddMenuItem("be2","","My Item 2")
	be.AddMenuItem("be3","","My Item 3")
	be.AddToContainer(cont, 1, 2)
	'
	Dim ts As VMMenu = vm.CreateMenu("ts", Me)
	'add a button to trigger the menu
	ts.SetButton("", "Top Start")
	ts.SetDirectionTopStart(True)
	ts.AddMenuItem("ts1","","My Item 1")
	ts.AddMenuItem("ts2","","My Item 2")
	ts.AddMenuItem("ts3","","My Item 3")
	ts.AddToContainer(cont, 1, 3)
	'
	Dim te As VMMenu = vm.CreateMenu("te", Me)
	'add a button to trigger the menu
	te.SetButton("", "Top End")
	te.SetDirectionTopEnd(True)
	te.AddMenuItem("te1","","My Item 1")
	te.AddMenuItem("te2","","My Item 2")
	te.AddMenuItem("te3","","My Item 3")
	te.AddToContainer(cont, 1, 4)
	'
	'align trigger
	Dim at As VMMenu = vm.CreateMenu("at", Me)
	'add a button to trigger the menu
	at.SetButton("", "Align with Trigger")
	at.SetSizeMedium(True)
	at.SetAlignTrigger(True)
	at.AddMenuItem("at1","","My Item 1")
	at.AddMenuItem("at2","","My Item 2")
	at.AddMenuItem("at3","","My Item 3")
	at.AddToContainer(cont, 2, 1)
	'
	'icon menu
	'align trigger
	Dim icn As VMMenu = vm.CreateMenu("icn", Me).SetIcon("contacts")
	icn.AddMenuItem("icn1","phone","Call Home")
	icn.AddMenuItem("icn2","phone","Call Work")
	icn.AddMenuItem("icn3","phone","Call Spouse")
	icn.AddToContainer(cont, 2, 2)
	'
	'image menu
	Dim img As VMMenu = vm.CreateMenu("img", Me).SetImage("./assets/2.png", "")
	img.AddMenuItem("img1","phone","Call Home")
	img.AddMenuItem("img2","phone","Call Work")
	img.AddMenuItem("img3","phone","Call Spouse")
	img.AddToContainer(cont, 2, 3)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub


Sub icn1_click(e As BANanoEvent)
	vm.ShowSnackBar("Calling Home")
End Sub

Sub icn2_click(e As BANanoEvent)
	vm.ShowSnackBar("Calling Work")
End Sub

Sub icn3_click(e As BANanoEvent)
	vm.ShowSnackBar("Calling Spouse")
End Sub


Sub be1_click(e As BANanoEvent)
	vm.ShowSnackBar("be1")
End Sub


Sub be2_click(e As BANanoEvent)
	vm.ShowSnackBar("be2")
End Sub


Sub be3_click(e As BANanoEvent)
	vm.ShowSnackBar("be3")
End Sub


Sub mi1_click(e As BANanoEvent)
	vm.ShowSnackBar("mi1")
End Sub

Sub mi2_click(e As BANanoEvent)
	vm.ShowSnackBar("mi2")
End Sub

Sub mi3_click(e As BANanoEvent)
	vm.ShowSnackBar("mi3")
End Sub