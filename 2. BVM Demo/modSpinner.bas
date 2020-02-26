B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "spinnercode"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(4).AddColumns2x6
	'
	vm.CreateSpinner("s1", Me).SetMargin("25px").SetModeDeterminate(True).SetValue(10).AddToContainer(cont, 1, 1)
	vm.CreateSpinner("s2", Me).SetMargin("25px").SetModeDeterminate(True).SetValue(20).SetAccent(True).AddToContainer(cont, 1, 2)
	'
	vm.CreateSpinner("s3", Me).SetMargin("25px").SetModeInDeterminate(True).AddToContainer(cont, 2, 1)
	vm.CreateSpinner("s4", Me).SetMargin("25px").SetModeInDeterminate(True).SetAccent(True).AddToContainer(cont, 2, 2)
	'
	vm.CreateSpinner("s5", Me).SetMargin("25px").SetModeInDeterminate(True).SetDiameter(100).SetStroke(10).AddToContainer(cont, 3, 1)
	vm.CreateSpinner("s6", Me).SetMargin("25px").SetModeInDeterminate(True).SetDiameter(30).SetStroke(3).SetAccent(True).AddToContainer(cont, 3, 2)
	'
	vm.CreateSpinner("s7", Me).SetMargin("25px").SetModeInDeterminate(True).SetStroke(3).AddToContainer(cont, 4, 1)
	vm.CreateSpinner("s8", Me).SetMargin("25px").SetModeInDeterminate(True).SetDiameter(30).SetAccent(True).AddToContainer(cont, 4, 2)
	
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub
