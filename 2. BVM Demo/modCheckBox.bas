B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "checkboxcode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modCheckBox.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	vm.CreateCheckBox("cb1",Me).SetText("Boolean").SetVModel("cb1").SetValue(True).AddToContainer(cont,1,1)
	vm.CreateCheckBox("cb2",Me).SetText("String").SetVModel("cb2").SetPrimary(True).SetValue("male").AddToContainer(cont,1,1)
	vm.CreateCheckBox("cb3",Me).SetText("Disabled").SetDisabled(True).SetVModel("cb3").SetValue(True).AddToContainer(cont,1,1)
	vm.CreateCheckBox("cb4",Me).SetText("Indeterminate").SetVModel("cb4").SetIndeterminate.AddToContainer(cont,1,1)
	'
	cont.AddComponent(1,1, vm.BR)
	cont.AddComponent(1,1, vm.BR)
	
'	Dim cbg As VMCheckBoxGroup = vm.CreateCheckBoxGroup("cbg1", "Books to Read").SetVModel("bookstoread").SetValue("b1")
'	cbg.additem("b1","Silence of the Lambs")
'	cbg.additem("b2","Nightmare on Elm Street")
'	cbg.additem("b3","Gotham City")
'	cbg.AddToContainer(cont, 1, 1)
'	
'	cont.AddComponent(1,1, vm.BR)
'	cont.AddComponent(1,1, vm.BR)
	
	vm.CreateLABEL("").SetText("CB1 {{ cb1 }}").SetParagraph.AddToContainer(cont,1,1)
	vm.CreateLABEL("").SetText("CB2 {{ cb2 }}").SetParagraph.AddToContainer(cont,1,1)
	'vm.CreateLABEL("").SetText("Books To Read {{ bookstoread }}").SetParagraph.AddToContainer(cont,1,1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub cb2_change(cValue As String)
	vm.ShowSnackBar(cValue)
End Sub