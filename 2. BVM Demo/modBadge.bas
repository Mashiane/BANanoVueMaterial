B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "badgecode"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	vm.CreateButton("btn1",Me).SetIcon("notifications").SetIconButton(True).SetBadgeContent(5).AddToContainer(cont, 1,1)
	vm.CreateButton("btn2",Me).SetIcon("home").SetIconButton(True).SetBadgeContent(1).SetBadgePrimary.AddToContainer(cont, 1,1)
	vm.CreateButton("btn3",Me).SetIcon("home").SetIconButton(True).SetBadgeContent(12).SetBadgeOnBottom.SetBadgeAccent.AddToContainer(cont, 1,1)
	vm.CreateAvatar("img1",Me).SetValue("./assets/sponge.png").SetAlt("Avatar").SetBadgeDense.SetBadgeContent(6).AddToContainer(cont, 1, 1)
	vm.CreateButton("btn4",Me).SetText("Button With").SetBadgeOnBottom.SetBadgeSquare.SetBadgeContent(10).addtocontainer(cont, 1,1)

	vm.Container.AddComponent(1,1,cont.tostring)
End Sub'Static code module
