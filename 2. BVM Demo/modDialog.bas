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
	Private mdlRegister As VMDialog
	Private eh As VMEasyHint
End Sub


Sub Code(vmx As BANanoVM)
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
	vm.CreateButton("a5", Me).SetText("Input Dialog").SetPrimary(True).SetRaised(True).AddToContainer(cont, 2, 2)
	vm.Container.AddComponent(1,1,cont.tostring)
	'
	CreateDialog
	CreateInputDialog
	'
	'add local alerts and confirmations
	vm.AddConfirm("askuser", Me, "Use Google's location service?", _
	"Let Google help apps determine location. <br> This means sending <strong>anonymous</strong> location data to Google, even when no apps are running.", "Agree","Disagree")
	'
	vm.AddPrompt("yourname", Me, "What's your name?", "", "Type your name", 30, "Done", "Cancel")
	
End Sub

'show the input dialog
Sub a5_click(e As BANanoEvent)
	vm.showdialog("mdlregister")
End Sub

Sub CreateInputDialog
	eh.initialize
	'create the modal dialog
	mdlRegister = vm.CreateDialog("mdlregister", Me)
	'dont show the backdrop
	mdlRegister.SetBackdrop(False)
	'disable clicking outside of modal
	mdlRegister.SetClickOutsideToClose(False)
	'dont close when a user presses escape
	mdlRegister.SetCloseOnEsc(False)
	'on cellphones show full screen
	mdlRegister.SetFullScreen(True)
	'set width of the modal
	mdlRegister.SetWidth("700px")
	mdlRegister.SetScrollBar(True)
	'
	'set the title of the modal
	mdlRegister.SetTitle("Sign Up")
	'add a cancel button
	mdlRegister.AddOk("btnTour", "Tour")
	mdlRegister.AddCancel("btnCancelSignUp", "Cancel")
	'add a login button
	mdlRegister.AddOk("btnOkSignUp", "Sign In")
	'
	'create the controls
	Dim txtfirstname As VMInputControl = vm.NewText("firstname", "First Name", "First Name", True, "", 0, "", "The first name is required!", 0)
	Dim txtlastname As VMInputControl = vm.NewText("lastname", "Last Name", "Last Name", True, "", 0, "", "The last name is required!", 0)
	eh.AddInput("firstname", "Enter your first name here.")
	eh.AddInput("lastname", "Enter your last name here.")
	'
	Dim dpDOB As VMInputControl = vm.NewDatePicker("dateofbirth", "Date of Birth", True, True, True, "Date of Birth","","",0)
	Dim tpTOB As VMInputControl = vm.NewTimePicker("timeofbirth", "Time of Birth", True, True, "", "",0)
	eh.AddDatePicker("dateofbirth", "The date of birth.")
	eh.AddTimePicker("timeofbirth", "The time of birth.")
	'
	Dim txtTel As VMInputControl = vm.NewTel("telephone", "Telephone", "Telephone Number", True, "", "", "",0)
	Dim txtEmail As VMInputControl = vm.NewEmail("email","Email Address","Email Address",True,"","", "The email address is required!",0)
	eh.AddInput("telephone", "Telephone.")
	eh.AddInput("email", "Email")
	'
	Dim radGender As VMInputControl = vm.NewRadioGroup("gender", "Gender", "M", CreateMap("M":"Male","F":"Female"),True,True, 0)
	Dim chipSkills As VMInputControl = vm.NewChips("skills", "Skills", "", False, False, "","", 0)
	eh.AddRadio("gender", "Gender.")
	eh.AddStep("skills", "Skills set.")
	'
	Dim children As VMInputControl = vm.NewNumber("children", "Total Children", "", False, "", "","", 0)
	Dim notifications As VMInputControl = vm.NewSwitch("notifications", "Receive Notifications", "true", "false",True, 0)
	eh.AddInput("children", "Children.")
	eh.AddSwitch("notifications", "Notifications.")
	'
	Dim profilepic As VMInputControl = vm.NewImage("displaypic", "./assets/sponge.png", "SpongeBob","80px", "80px")
	Dim uploadprofile As VMInputControl = vm.NewFile("uploadpic", "Upload Profile Image", "", False, "", "", 0)
	eh.AddInput("uploadpic", "Upload file.")
	
	Dim notes As VMInputControl = vm.NewTextArea("notes", "Notes", "", True, True, "", 0,"", "Notes are required!", 0)
	Dim agree As VMInputControl = vm.NewCheckBox("agree", "I agree with terms of use", "true", "false", True, 0)
	eh.AddInput("notes", "Them notes.")
	eh.AddCheckBox("agree", "Tems and conditions.")
	
	Dim txtPassword As VMInputControl = vm.NewPassword("password","Password","",True,False,"",15,"", "The password is required!",0)
	Dim txtconfirmPassword As VMInputControl = vm.NewPassword("confirmpassword","Confirm Password","",True,True,"",15,"", "The password is required!",0)
	eh.AddInput("password", "Password.")
	eh.AddInput("confirmpassword", "Confirm password.")
	'
	dim lstRoles as map = createmap("hr":"HR","staff":"Staff","guest":"Guest")
	Dim selRoles As VMInputControl = vm.NewSelectOptions("roles", "Roles", True, False, "", lstroles, "id", "text", "Roles of the user", "The roles are required!",0)
	eh.AddSelect("roles", "Roles.")
	
	dim lstStates as list
	lststates.initialize
	lstStates.AddAll(array("AZ","AB","AC"))
	Dim ac As VMInputControl = vm.NewAutoComplete("states", "States", "", lstStates, true, "Living states", "The state is required!",0)
	eh.AddStep("states", "Living states")
	
	'add the controls, the grid will be automatically created
	mdlRegister.Container.AddControlS(profilepic,1,1,12,6,6,6)
	mdlRegister.Container.AddControlS(uploadprofile,1,2,12,6,6,6)
	
	mdlRegister.Container.AddControlS(txtfirstname,2,1,12,6,6,6)
	mdlRegister.Container.AddControlS(txtlastname,2,2,12,6,6,6)
	'
	mdlRegister.Container.AddControlS(dpDOB,3,1,12,6,6,6)
	mdlRegister.Container.AddControlS(tpTOB,3,2,12,6,6,6)
	'
	mdlRegister.Container.AddControlS(txtTel,4,1,12,6,6,6)
	mdlRegister.Container.AddControlS(txtEmail,4,2,12,6,6,6)
	'
	mdlRegister.Container.AddControlS(radGender,5,1,12,6,6,6)
	mdlRegister.Container.AddControlS(chipSkills,5,2,12,6,6,6)
	'
	mdlRegister.Container.AddControlS(children,6,1,12,6,6,6)
	mdlRegister.Container.AddControlS(notifications,6,2,12,6,6,6)
	'
	mdlRegister.Container.AddControlS(txtPassword,7,1,12,6,6,6)
	mdlRegister.Container.AddControlS(txtconfirmPassword,7,2,12,6,6,6)
	'
	mdlRegister.Container.AddControlS(notes,8,1,12,12,12,12)
	mdlRegister.Container.AddControlS(agree,9,1,12,12,12,12)
	'
	mdlRegister.Container.AddControlS(selRoles,10,1,12,6,6,6)
	mdlRegister.Container.AddControlS(ac,10,2,12,6,6,6)
	
	'add this modal to the page
	vm.adddialog(mdlRegister)
End Sub

Sub btnTour_click(e As BANanoEvent)
	eh.EndsOn("states")
	eh.run
End Sub

Sub btnCancelSignUp_click(e As BANanoEvent)
	'hide the registration modal
	vm.HideDialog("mdlregister")
End Sub

Sub btnOkSignUp_click(e As BANanoEvent)
	'get the contents of the form
	Dim rec As Map = mdlRegister.Container.GetData
	'validate the details
	Dim bValid As Boolean = mdlRegister.Container.Validate(rec)
	If bValid = False Then Return
	Log(rec)
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
