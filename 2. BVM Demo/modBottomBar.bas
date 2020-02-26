B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "bottomcode"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns3x4
	'
	Dim bb As VMBottomBar = vm.CreateButtomBar("bb1", Me).SetPrimary(True)
	bb.AddItem("bbitem1", "Home", "home", "")
	bb.AddItem("bbitem2", "Favourates", "favorite", "")
	bb.AddItem("bbitem3", "Posts", "email", "")
	bb.AddToContainer(cont, 1, 1)
	'
	Dim bb2 As VMBottomBar = vm.CreateButtomBar("bb2", Me).SetAccent(True).SetTypeShift(True)
	bb2.AddItem("bb2item1", "Home", "home", "1")
	bb2.AddItem("bb2item2", "Favourates", "favorite", "3")
	bb2.AddItem("bb2item3", "Posts", "email", "2")
	bb2.AddToContainer(cont, 1, 2)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub bb2item1_click(e As BANanoEvent)
	vm.ShowSnackBar("Home")
	vm.IncrementBadge("bb2item1",1)
End Sub

Sub bb2item2_click(e As BANanoEvent)
	vm.ShowSnackBar("Favourates")
	vm.IncrementBadge("bb2item2",2)
End Sub

Sub bb2item3_click(e As BANanoEvent)
	vm.ShowSnackBar("Posts")
	vm.IncrementBadge("bb2item3",3)
End Sub


'Sub bb1_changed(activeItem As String)
'	vm.ShowSnackBar(activeItem)
'End Sub

Sub bbitem1_click(e As BANanoEvent)
	vm.ShowSnackBar("Home")
End Sub

Sub bbitem2_click(e As BANanoEvent)
	vm.ShowSnackBar("Favourates")
End Sub

Sub bbitem3_click(e As BANanoEvent)
	vm.ShowSnackBar("Posts")
End Sub