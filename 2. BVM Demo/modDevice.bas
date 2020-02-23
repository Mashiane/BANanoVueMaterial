B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "devicecode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modDevice.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns2x6
	cont.AddRows(1).AddColumns12
	'
	vm.CreateDevice("iphoneX", Me).SetIphoneX.SetURL("https://www.b4x.com/").AddToContainer(cont, 1, 1)
	vm.CreateDevice("iphoneXl", Me).SetIphoneX.SetURL("https://www.b4x.com/").SetLandScape.AddToContainer(cont, 1, 2)
	'
	vm.CreateDevice("ipad", Me).SetIpad.SetURL("https://www.b4x.com/").AddToContainer(cont, 2, 1)
	vm.CreateDevice("ipadl", Me).SetIpad.SetURL("https://www.b4x.com/").SetLandScape.AddToContainer(cont, 2, 1)
	'
	vm.CreateDevice("mac", Me).SetMacbook.SetURL("https://www.b4x.com/").AddToContainer(cont, 3, 1)
		
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub
