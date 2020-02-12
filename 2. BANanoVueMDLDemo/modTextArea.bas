B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "textareacode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modTextArea.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	vm.CreateTextArea("txta",Me).SetLabel("Text Area").SetVmodel("txtarea").AddToContainer(cont,1,1)
	vm.CreateTextArea("txtb",Me).SetLabel("Text Area with AutoGrow").SetVmodel("txtareb").SetAutogrow(True).AddToContainer(cont,1,1)
	vm.CreateTextArea("txtc",Me).SetLabel("Required").SetVModel("txtarec").SetErrorText("There is an error").SetRequired(True).AddToContainer(cont, 1, 1)
	vm.CreateTextArea("txt8",Me).SetLabel("Counter").SetVModel("txt8count").SetCounter(30).AddToContainer(cont, 1, 1)
	vm.CreateTextArea("txt9",Me).SetLabel("Max Length").SetVModel("txt9len").SetMaxlength(10).AddToContainer(cont, 1, 1)
	vm.CreateTextArea("txt10x",Me).SetLabel("Max Length & Disabled Counter").SetVModel("txtlendg").SetMaxlength(15).SetCounterDisabled.AddToContainer(cont, 1, 1)
	vm.CreateTextArea("txtai",Me).SetLabel("Description").SetVModel("txtai").SetIcon("description").AddToContainer(cont, 1, 1)
	vm.Container.AddComponent(1,1,cont.tostring)
	vm.ShowError("txtc")
End Sub
