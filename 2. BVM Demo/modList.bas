B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "listcode1"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns(3,12,4,4,4)
	'
	Dim lcontrols As VMList = vm.CreateList("lcontrols", Me).SetElevation(2)
	lcontrols.AddSubHeader("Notifications")
	lcontrols.AddCheckBox("notification","preview","Show Content Preview", False)
	lcontrols.AddCheckBox("notification","sound","Sound", False)
	lcontrols.AddCheckBox("notification","vibrate","Vibrate", False)
	lcontrols.AddCheckBox("notification","light","Notification Light", False)
	lcontrols.AddToContainer(cont, 1, 1)
	
	vm.CreateLABEL("lbl").SetText("{{ notification }").AddToContainer(cont,1,1)
	vm.Container.AddComponent(1,1,cont.tostring)
	vm.SetStateList("notification", Array())
End Sub
