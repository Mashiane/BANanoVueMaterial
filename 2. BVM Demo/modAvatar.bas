B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "avatarcode"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	
	vm.CreateAvatar("sponge",Me).SetAlt("My Avatar").SetValue("./assets/sponge.png").AddToContainer(cont,1,1)
	cont.AddComponent(1,1,vm.BR)
	cont.AddComponent(1,1,vm.BR)
	
	vm.CreateAvatar("home",Me).SetIcon("home").SetSmall(True).SetAvatarIcon(True).AddToContainer(cont,1,1)
	vm.CreateAvatar("folder",Me).SetIcon("folder").SetAvatarIcon(True).SetPrimary(True).AddToContainer(cont,1,1)
	vm.CreateAvatar("favorite",Me).SetIcon("favorite").SetLarge(True).SetAvatarIcon(True).SetAccent(True).AddToContainer(cont,1,1)
	'
	cont.AddComponent(1,1,vm.BR)
	cont.AddComponent(1,1,vm.BR)
	vm.CreateAvatar("",Me).SetAvatarIcon(True).SetSmall(True).SetText("B").AddToContainer(cont,1,1)
	vm.CreateAvatar("",Me).SetAvatarIcon(True).SetSmall(True).SetText("B").SetPrimary(True).AddToContainer(cont,1,1)
	vm.CreateAvatar("",Me).SetAvatarIcon(True).SetSmall(True).SetText("B").SetAccent(True).AddToContainer(cont,1,1)
	
	cont.AddComponent(1,1,vm.BR)
	vm.CreateAvatar("",Me).SetAvatarIcon(True).SetText("A").AddToContainer(cont,1,1)
	vm.CreateAvatar("",Me).SetAvatarIcon(True).SetText("A").SetPrimary(True).AddToContainer(cont,1,1)
	vm.CreateAvatar("",Me).SetAvatarIcon(True).SetText("A").SetAccent(True).AddToContainer(cont,1,1)
	'
	'
	cont.AddComponent(1,1,vm.BR)
	vm.CreateAvatar("",Me).SetAvatarIcon(True).SetLarge(True).SetTextRipple("MM").AddToContainer(cont,1,1)
	vm.CreateAvatar("",Me).SetAvatarIcon(True).SetLarge(True).SetTextRipple("MM").SetPrimary(True).AddToContainer(cont,1,1)
	vm.CreateAvatar("",Me).SetAvatarIcon(True).SetLarge(True).SetTextRipple("MM").SetAccent(True).AddToContainer(cont,1,1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub