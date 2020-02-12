B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "toolcode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modToolbar.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	Dim tbl1 As VMToolBar = vm.CreateToolbar("tbl1", Me).SetTitle("My Toolbar").SetMarginAll("10px")
	tbl1.SetToolbar(True)
	tbl1.AddIcon("menux","more_vert", "Menu","")
	tbl1.AddButton("ref", "", "Refresh", "Refresh","")
	tbl1.AddIcon("ham","menu","Hamburger","")
	tbl1.AddIcon("ref1", "refresh","Refresh","5")
	tbl1.AddAvatar("av1","./assets/sponge.png","TheMash","My Profile","30")
	tbl1.AddToContainer(cont, 1, 1)
	'
	Dim tbl2 As VMToolBar = vm.CreateToolbar("tbl2", Me).SetTitle("No Elevation").SetElevation(0).SetMarginAll("10px")
	tbl2.SetToolbar(True)
	Dim icn As VMMenu = vm.CreateMenu("icn", Me).SetIcon("contacts")
	icn.AddMenuItem("icn1","phone","Call Home")
	icn.AddMenuItem("icn2","phone","Call Work")
	icn.AddMenuItem("icn3","phone","Call Spouse")
	tbl2.AddMenu(icn)
	tbl2.AddToContainer(cont, 1, 1)
	'
	Dim tbl3 As VMToolBar = vm.CreateToolbar("tbl3", Me).SetTitle("Primary").SetPrimary(True).SetMarginAll("10px")
	tbl3.SetToolbar(True)
	Dim img As VMMenu = vm.CreateMenu("img", Me).SetImage("./assets/2.png", "")
	img.AddMenuItem("img1","phone","Call Home")
	img.AddMenuItem("img2","phone","Call Work")
	img.AddMenuItem("img3","phone","Call Spouse")
	tbl3.addmenu(img)
	tbl3.AddToContainer(cont, 1, 1)
	'
	Dim tbl4 As VMToolBar = vm.CreateToolbar("tbl4", Me).SetTitle("Accent").SetAccent(True).SetMarginAll("10px")
	tbl4.SetToolbar(True)
	tbl4.AddToContainer(cont, 1, 1)
	'
	Dim tbl5 As VMToolBar = vm.CreateToolbar("tbl5", Me).SetTitle("Transparent").SetTransparent(True).SetMarginAll("10px")
	tbl5.SetToolbar(True)
	tbl5.AddToContainer(cont, 1, 1)
	'
	Dim tbl6 As VMToolBar = vm.CreateToolbar("tbl6", Me).SetTitle("Dense").SetDense(True).SetMarginAll("10px")
	tbl6.SetToolbar(True)
	tbl6.AddToContainer(cont, 1, 1)

	vm.Container.AddComponent(1,1,cont.tostring)
End Sub'Static code module

Sub ref1_click(e As BANanoEvent)
	vm.IncrementBadge("ref1",1)
End Sub