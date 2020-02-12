B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "datepickercode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modDatePicker.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	vm.CreateDatePicker("dp1",Me).SetLabel("Date Picker").SetVModel("dp1").AddToContainer(cont,1,1)   
	vm.CreateDatePicker("dp2",Me).SetLabel("Immediately").SetImmediately(True).SetVModel("dp2").AddToContainer(cont,1,1)
	vm.CreateDatePicker("dp3",Me).SetLabel("On Open/Close").SetVModel("dp3").AddToContainer(cont,1,1)
	
	vm.CreateLabel("lbl").SetParagraph.SetText("Selected Date: {{ dp1 }}").AddToContainer(cont,1,1)
	vm.CreateLabel("lbl1").SetParagraph.SetText("Date 2: {{ dp2 }}").AddToContainer(cont,1,1)
	vm.CreateLabel("lbl2").SetParagraph.SetText("Date 3: {{ dp3 }}").AddToContainer(cont,1,1)
	cont.AddComponent(1,1, vm.BR)
	cont.AddComponent(1,1, vm.BR)
	vm.CreateButton("btn",Me).SetText("Get Date").SetRaised(True).AddToContainer(cont, 1, 1)	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub d3_opened(e As BANanoEvent)
	vm.ToYYYYMMDD("dp3")
End Sub

Sub d3_closed(e As BANanoEvent)
	vm.ToYYYYMMDD("dp3")
End Sub


Sub btn_click(e As BANanoEvent)
	'convert date to yyyy-mm-dd
	vm.ToYYYYMMDD("dp1")
End Sub


