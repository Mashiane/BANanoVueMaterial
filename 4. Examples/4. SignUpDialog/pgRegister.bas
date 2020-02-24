B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "signupcode"
	Private mdlRegister As VMDialog
End Sub


Sub Code(vmx As BANanoVM)
	'the instance of view material
	vm = vmx
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
	mdlRegister.AddCancel("btnCancelSignUp", "Cancel")
	'add a login button
	mdlRegister.AddOk("btnOkSignUp", "Sign In")
	'create the controls
	Dim txtfirstname As VMInputControl = vm.NewText("firstname", "First Name", "First Name", True, "", 0, "", "The first name is required!", 0)
	Dim txtlastname As VMInputControl = vm.NewText("lastname", "Last Name", "Last Name", True, "", 0, "", "The last name is required!", 0)
	'
	Dim dpDOB As VMInputControl = vm.NewDatePicker("dateofbirth", "Date of Birth", True, True, True, "Date of Birth","","",0)
	Dim tpTOB As VMInputControl = vm.NewTimePicker("timeofbirth", "Time of Birth", True, True, "", "",0)
	'
	Dim txtTel As VMInputControl = vm.NewTel("telephone", "Telephone", "Telephone Number", True, "", "", "",0)
	Dim txtEmail As VMInputControl = vm.NewEmail("email","Email Address","Email Address",True,"","", "The email address is required!",0)
	'
	Dim radGender As VMInputControl = vm.NewRadioGroup("gender", "Gender", "M", CreateMap("M":"Male","F":"Female"),True,True, 0)
	Dim chipSkills As VMInputControl = vm.NewChips("skills", "Skills", "", False, False, "","", 0)
	'
	Dim children As VMInputControl = vm.NewNumber("children", "Total Children", "", False, "", "","", 0)
	Dim notifications As VMInputControl = vm.NewSwitch("notifications", "Receive Notifications", "true", "false",True, 0)
	'
	Dim profilepic As VMInputControl = vm.NewImage("displaypic", "./assets/sponge.png", "SpongeBob","80px", "80px")
	Dim uploadprofile As VMInputControl = vm.NewFile("uploadpic", "Upload Profile Image", "", False, "", "", 0)
	
	Dim notes As VMInputControl = vm.NewTextArea("notes", "Notes", "", True, True, "", 0,"", "Notes are required!", 0)
	Dim agree As VMInputControl = vm.NewCheckBox("agree", "I agree with terms of use", "true", "false", True, 0)
	
	Dim txtPassword As VMInputControl = vm.NewPassword("password","Password","",True,False,"",15,"", "The password is required!",0)
	Dim txtconfirmPassword As VMInputControl = vm.NewPassword("confirmpassword","Confirm Password","",True,True,"",15,"", "The password is required!",0)
	
	'add the controls, the grid will be automatically created
	mdlRegister.Container.AddControl(profilepic,1,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(uploadprofile,1,2,0,0,0,0,12,6,6,6)
	
	mdlRegister.Container.AddControl(txtfirstname,2,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(txtlastname,2,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(dpDOB,3,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(tpTOB,3,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(txtTel,4,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(txtEmail,4,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(radGender,5,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(chipSkills,5,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(children,6,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(notifications,6,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(txtPassword,7,1,0,0,0,0,12,6,6,6)
	mdlRegister.Container.AddControl(txtconfirmPassword,7,2,0,0,0,0,12,6,6,6)
	'
	mdlRegister.Container.AddControl(notes,8,1,0,0,0,0,12,12,12,12)
	mdlRegister.Container.AddControl(agree,9,1,0,0,0,0,12,12,12,12)
	
	'add this modal to the page
	vm.adddialog(mdlRegister)
End Sub

Sub btnCancelSignUp_click(e As BANanoEvent)
	'hide the registration modal
	vm.HideDialog("mdlregister")
	'show the login modal
	vm.ShowDialog("mdlsignin")
End Sub

Sub btnOkSignUp_click(e As BANanoEvent)
	'get the contents of the form
	Dim rec As Map = mdlRegister.Container.GetData
	'validate the details
	Dim bValid As Boolean = mdlRegister.Container.Validate(rec)
	If bValid = False Then Return
	Log(rec)
	'process further
End Sub
