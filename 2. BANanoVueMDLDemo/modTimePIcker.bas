B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "timecode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modTimePicker.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns2x6
	
	Dim timex As VMTimePicker = vm.CreateTimePicker("timex", Me).SetLabel("Entry Time")
	timex.SetHelperText("Enter time").SetErrorText("Time should be entered!").SetRequired(True).SetVModel("timex")
	timex.AddToContainer(cont, 1, 1) 
	
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub timex_change(value As String)
	vm.ShowSnackBar(value)
End Sub