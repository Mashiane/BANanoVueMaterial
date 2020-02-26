B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "progresscode"
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
	vm.CreateProgress("p1", Me).SetMargin("25px").SetModeDeterminate(True).SetValue(10).AddToContainer(cont, 1, 1)
	vm.CreateProgress("p2", Me).SetMargin("25px").SetModeDeterminate(True).SetValue(20).SetAccent(True).AddToContainer(cont, 1, 2)
	'
	vm.CreateProgress("p3", Me).SetMargin("25px").SetModeInDeterminate(True).AddToContainer(cont, 2, 1)
	vm.CreateProgress("p4", Me).SetMargin("25px").SetModeInDeterminate(True).SetAccent(True).AddToContainer(cont, 2, 2)
	'
	vm.CreateProgress("p5", Me).SetMargin("25px").SetModeBuffer(True).SetValue(25).SetBuffer(40).AddToContainer(cont, 3, 1)
	vm.CreateProgress("p6", Me).SetMargin("25px").SetModeBuffer(True).SetValue(25).SetBuffer(40).SetAccent(True).AddToContainer(cont, 3, 2)
	'
	vm.CreateProgress("p7", Me).SetMargin("25px").SetModeQuery(True).AddToContainer(cont, 4, 1)
	vm.CreateProgress("p8", Me).SetMargin("25px").SetModeQuery(True).SetAccent(True).AddToContainer(cont, 4, 2)
	
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub
