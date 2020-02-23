B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "iconcode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modIcon.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	
	vm.CreateIcon("icon1").SetText("menu").AddToContainer(cont, 1, 1)
	vm.CreateIcon("icon2").SetText("add").AddToContainer(cont, 1, 1)
	vm.CreateIcon("icon3").SetText("thumb_up").AddToContainer(cont, 1, 1)
	vm.CreateIcon("icon4").SetText("verified_user").AddToContainer(cont, 1, 1)
	vm.CreateIcon("icon5").SetText("home").AddToContainer(cont, 1, 1)
	
	cont.AddComponent(1, 1, vm.BR)
	cont.AddComponent(1, 1, vm.BR)
	
	vm.CreateIcon("icon1s").SetText("menu").SetSize2x(True).AddToContainer(cont, 1, 1)
	vm.CreateIcon("icon2s").SetText("add").SetSize3x(True).AddToContainer(cont, 1, 1)
	vm.CreateIcon("icon3s").SetText("thumb_up").SetSize4x(True).AddToContainer(cont, 1, 1)
	vm.CreateIcon("icon4s").SetText("verified_user").SetSize5x(True).AddToContainer(cont, 1, 1)
		
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub
