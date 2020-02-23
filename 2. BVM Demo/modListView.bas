B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "listviewcode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modListView.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	Dim lv As VMListView = vm.CreateListView("lv1", Me)
	lv.SetElevation(2)
	lv.AddItem("inbox","move_to_inbox","Inbox","6")
	lv.AddItem("send","send","Sent Email",Null)
	lv.AddItem("trash","delete","Trash","20")
	lv.AddItem("spam","error","Spam","1")
	
	lv.AddToContainer(cont, 1,1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub inbox_click(e As BANanoEvent)
	vm.ShowSnackBar("Inbox...")
End Sub

Sub send_click(e As BANanoEvent)
	vm.ShowSnackBar("Sent...")
End Sub

Sub trash_click(e As BANanoEvent)
	vm.ShowSnackBar("Trash...")
End Sub

Sub spam_click(e As BANanoEvent)
	vm.ShowSnackBar("Spam...")
End Sub