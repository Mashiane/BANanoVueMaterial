B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "filecode"
	Private BANano As BANano   'ignore
End Sub


Sub Code(vmx As BANanoVM)
	Log("modFile.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name, Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	'
	vm.CreateFile("file0",Me).SetVModel("single").SetLabel("Single").AddToContainer(cont, 1, 1)
	'
	vm.CreateFile("file1",Me).SetVModel("placeholder").SetLabel("Placeholder").SetPlaceholder("A nice input placeholder").AddToContainer(cont, 1, 1)
	'
	vm.CreateFile("file2",Me).SetVModel("disabledx").SetDisabled(True).AddToContainer(cont, 1, 1)
	'
	vm.CreateFile("file3",Me).SetVModel("initial").SetLabel("Initial Value").SetValue("./assets/sponge.png").AddToContainer(cont, 1, 1)
	'
	vm.CreateFile("file4",Me).SetVModel("multiple").SetLabel("Multiple Files").SetMultiple(True).AddToContainer(cont, 1, 1)
		
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub file0_change(fList As List)
	UploadFiles(fList)
End Sub


Sub file1_change(fList As List)
	Log(fList)
End Sub


Sub file2_change(fList As List)
	Log(fList)
End Sub


Sub file3_change(fList As List)
	Log(fList)
End Sub


Sub file4_change(fList As List)
	Log(fList)
End Sub

Sub UploadFiles(fList As List)
	For Each fileObj As Object In fList
		vm.HTTPUpload(fileObj, Me, "filedone")
	Next
End Sub

Sub FileDone(fileObj As Map, json As String)
	Dim resp As Map = BANano.FromJson(json)
	Dim status As String = resp.Get("status")
	Select Case status
	Case "success"
		Dim fd As FileObject = vm.GetFileDetails(fileObj)
		Log(fd)
	Case Else
		vm.ShowSnackBar("File could not be uploaded!")
	End Select
End Sub

