B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "fabcode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modFAB.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns2x6
	'
	Dim fab1 As VMFAB = vm.CreateFAB("fab1", Me)
	fab1.SetMainIcon("add")
	fab1.SetPositionType("fixed")
	fab1.SetEnableRotation(True)
	fab1.SetPositionBR
	fab1.AddToContainer(cont, 1, 1)
		
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub
