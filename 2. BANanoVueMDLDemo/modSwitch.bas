B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "switchcode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modSwitch.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	vm.createswitch("s1",Me).SetVModel("array").SetValue("1").SetText("Array").AddToContainer(cont, 1,1)
	vm.createswitch("s2",Me).SetVModel("array").SetValue("2").SetText("Array").AddToContainer(cont, 1,1)
	vm.createswitch("s3",Me).SetVModel("boolean").SetText("Boolean").AddToContainer(cont, 1,1)
	vm.createswitch("s4",Me).SetVModel("string").SetText("String").SetValue("my-switch").AddToContainer(cont, 1,1)
	vm.createswitch("s5",Me).SetVModel("novalue").SetText("No Value").SetPrimary(True).AddToContainer(cont, 1,1)
	vm.createswitch("s6",Me).SetVModel("disabled").SetText("Disabled").SetDisabled(True).AddToContainer(cont, 1,1)
	
	cont.AddComponent(1,1, vm.BR)
	cont.AddComponent(1,1, vm.BR)
	'
	vm.CreateLABEL("lbl").SetText("{{ array }}").SetParagraph.AddToContainer(cont, 1, 1)
	vm.CreateLABEL("lbl1").SetText("{{ boolean }}").SetParagraph.AddToContainer(cont, 1, 1)
	vm.CreateLABEL("lbl2").SetText("{{ string }}").SetParagraph.AddToContainer(cont, 1, 1)
	vm.CreateLABEL("lbl3").SetText("{{ novalue }}").SetParagraph.AddToContainer(cont, 1, 1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
	vm.SetStateList("array", Array())
End Sub


Sub s5_change(sval As Object)
	vm.ShowSnackBar(sval)
End Sub