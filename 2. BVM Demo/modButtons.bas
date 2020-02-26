B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "buttonscode"
	Private banano As BANano  'ignore
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	vm.CreateButton("b1",Me).SetText("Default").AddToContainer(cont, 1, 1)
	vm.CreateButton("b2",Me).SetText("Ripple Off").SetRipple(False).AddToContainer(cont, 1, 1)
	vm.CreateButton("b3",Me).SetText("Primary").SetPrimary(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b4",Me).SetText("Accent").SetAccent(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b5",Me).SetText("Disabled").SetDisabled(True).AddToContainer(cont, 1, 1)
	'
	cont.AddComponent(1,1,vm.br)
	cont.AddComponent(1,1,vm.br)
	'
	vm.CreateButton("b1r",Me).SetText("Default").SetRaised(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b2r",Me).SetText("Ripple Off").SetRaised(True).SetRipple(False).AddToContainer(cont, 1, 1)
	vm.CreateButton("b3r",Me).SetText("Primary").SetRaised(True).SetPrimary(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b4r",Me).SetText("Accent").SetRaised(True).SetAccent(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b5r",Me).SetText("Disabled").SetRaised(True).SetDisabled(True).AddToContainer(cont, 1, 1)
	
	cont.AddComponent(1,1,vm.br)
	cont.AddComponent(1,1,vm.br)
	'
	vm.CreateButton("b1ri",Me).SetIcon("home").SetIconButton(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b2ri",Me).SetIcon("menu").SetIconButton(True).SetPrimary(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b3ri",Me).SetIcon("thumb_up").SetIconButton(True).SetAccent(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b4ri",Me).SetIcon("add").SetIconButton(True).SetDisabled(True).AddToContainer(cont, 1, 1)
	
	cont.AddComponent(1,1,vm.br)
	cont.AddComponent(1,1,vm.br)
	
	vm.CreateButton("b1rix",Me).SetIcon("home").SetRaised(True).SetIconButton(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b2rix",Me).SetIcon("menu").SetRaised(True).SetIconButton(True).SetPrimary(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b3rix",Me).SetIcon("thumb_up").SetRaised(True).SetIconButton(True).SetAccent(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("b4rix",Me).SetIcon("add").SetIconButton(True).SetRaised(True).SetDisabled(True).AddToContainer(cont, 1, 1)
	
	cont.AddComponent(1,1,vm.br)
	cont.AddComponent(1,1,vm.br)
	'
	vm.CreateButton("f1",Me).SetIcon("home").SetFab(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("f2",Me).SetIcon("menu").SetFab(True).SetPrimary(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("f3",Me).SetIcon("edit").SetFab(True).SetPlain(True).AddToContainer(cont, 1, 1)
	
	cont.AddComponent(1,1,vm.br)
	cont.AddComponent(1,1,vm.br)
	
	vm.CreateButton("f1m",Me).SetIcon("menu").SetFab(True).SetMini(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("f2m",Me).SetIcon("home").SetFab(True).SetMini(True).SetPrimary(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("f3m",Me).SetIcon("edit").SetFab(True).SetMini(True).SetPlain(True).AddToContainer(cont, 1, 1)
	
	cont.AddComponent(1,1,vm.br)
	cont.AddComponent(1,1,vm.br)
	
	vm.CreateButton("lnk",Me).SetText("Link").SetHREF("pageurl", True).SetPrimary(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("lnk1",Me).SetText("Route Link").SetHREF("pageurl", True).SetPrimary(True).AddToContainer(cont, 1, 1)
	vm.setcomputed("pageurl", Me, "getpageurl")
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub'Static code module

Sub getpageURL As String
	Dim pg As String = banano.Location.GetHref
	Return pg
End Sub