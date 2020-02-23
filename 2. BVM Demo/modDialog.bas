B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "dialogcode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modDialog.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns(4,12,3,3,3)
	'
	vm.CreateButton("d1", Me).SetText("Show Dialog").SetRaised(True).AddToContainer(cont, 1, 1)
	vm.CreateButton("a1", Me).SetText("Alert 1").SetRaised(True).AddToContainer(cont, 1, 2)
	vm.CreateButton("a2", Me).SetText("Alert 2").SetAccent(True).SetRaised(True).AddToContainer(cont, 1, 3)
	vm.CreateButton("a3", Me).SetText("Confirm").SetAccent(True).SetRaised(True).AddToContainer(cont, 1, 4)
	vm.CreateButton("a4", Me).SetText("Prompt").SetPrimary(True).SetRaised(True).AddToContainer(cont, 2, 1)
	vm.Container.AddComponent(1,1,cont.tostring)
	'
	CreateDialog
	'
	'add local alerts and confirmations
	vm.AddConfirm("askuser", Me, "Use Google's location service?", _
	"Let Google help apps determine location. <br> This means sending <strong>anonymous</strong> location data to Google, even when no apps are running.", "Agree","Disagree")
	'
	vm.AddPrompt("yourname", Me, "What's your name?", "", "Type your name", 30, "Done", "Cancel")
	
End Sub

Sub CreateDialog
	'create the dialog
	Dim dialog1 As VMDialog = vm.CreateDialog("dialog1", Me).SetTitle("Dialog 1")
	
	Dim lbl As VMLabel = vm.CreateLABEL("lblx").SetText("This is my dialog content!")
	'
	dialog1.Container.AddRows(1).AddColumns(1,12,12,12,12)
	dialog1.Container.AddComponent(1,1, lbl.tostring)
	
	dialog1.AddCancel("btncancel", "Cancel")
	dialog1.AddOk("btnok", "Ok")
	vm.AddDialog(dialog1)
End Sub

Sub a3_click(e As BANanoEvent)
	vm.showdialog("askuser")
End Sub

Sub a1_click(e As BANanoEvent)
	vm.ShowAlert("first", "Hi there!", "Your post has been deleted!", "Cool")
End Sub

Sub a2_click(e As BANanoEvent)
	vm.ShowAlert("second", "Google Location", "Your post <strong>Material Design is awesome</strong> has been created.","Ok")
End Sub

Sub a4_click(e As BANanoEvent)
	vm.ShowPrompt1("yourname")
	'vm.ShowPrompt("What's your name?", "", "Type your name", 30, "Done", "Cancel")
End Sub


Sub d1_click(e As BANanoEvent)
	vm.showdialog("dialog1")
End Sub

Sub btnok_click(e As BANanoEvent)
	vm.showsnackbar("Dialog Ok clicked!")
End Sub

Sub btncancel_click(e As BANanoEvent)
	vm.ShowSnackBar("Dialog Cancel clicked!")
	vm.hidedialog("dialog1")
End Sub


Sub askuser_ok(e As BANanoEvent)
	vm.ShowSnackBar("Use Google location!")
End Sub

Sub askuser_cancel(e As BANanoEvent)
	vm.showsnackbar("Cancel Google location!")
End Sub

Sub yourname_ok(e As BANanoEvent)
	vm.ShowSnackBar(vm.getprompt)
End Sub

Sub yourname_cancel(e As BANanoEvent)
	vm.setprompt(Null)
	vm.showsnackbar("Cancel Name Prompt")
End Sub
