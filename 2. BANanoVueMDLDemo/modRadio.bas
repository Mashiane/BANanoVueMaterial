B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "radiocode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modRadio.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	vm.CreateRadio("rd1",Me).SetVmodel("radio").SetValue("false",True).SetText("Boolean").AddToContainer(cont, 1, 1)
	vm.CreateRadio("rd2",Me).SetVmodel("radio").SetValue("my-radio",False).SetText("String").AddToContainer(cont, 1, 1)
	vm.CreateRadio("rd3",Me).SetVmodel("radio").SetText("No Value").AddToContainer(cont, 1, 1)
	vm.CreateRadio("rd4",Me).SetVmodel("radio").SetDisabled(True).SetText("Disabled").AddToContainer(cont, 1, 1)
	
	cont.AddComponent(1, 1, vm.BR)
	cont.AddComponent(1, 1, vm.BR)
	
	Dim rg As VMRadioGroup = vm.CreateRadioGroup("rg1", "Languages", Me).SetVModel("mybook").SetValue("l1")
	rg.AddItem("l1", "Xhosa")
	rg.AddItem("l2", "English")
	rg.AddItem("l3", "Afrikaans")
	rg.AddToContainer(cont, 1, 1)
	
	vm.CreateLABEL("lbl").SetText("{{ radio }}").AddToContainer(cont, 1, 1)
	cont.AddComponent(1, 1, vm.BR)
	vm.CreateLABEL("lbl").SetText("{{ mybook }}").AddToContainer(cont, 1, 1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub
