B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "snackcode"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	Dim sb1 As VMSnackbar = vm.CreateSnackBar("sb1", Me).SetPositionLeft(True).SetDuration(3000).SetPersistent(True)
	sb1.SetText("This is my snack bar!").SetOnClick("sb1close_click")
	sb1.Button.SetText("Retry").SetAccent(True)
	sb1.button.Show
	vm.AddSnackBar(sb1)
	
	vm.CreateButton("btnx", Me).SetText("Show Snackbar").SetRaised(True).AddToContainer(cont, 1, 1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub
	
Sub btnx_click(e As BANanoEvent)
	vm.showdialog("sb1")
End Sub

Sub sb1close_click(e As BANanoEvent)
	vm.showsnackbar("Retry clicked!")
End Sub