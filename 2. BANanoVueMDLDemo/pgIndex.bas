B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private BANano As BANano  'ignore
	Private vm As BANanoVM
End Sub

Sub Init
	'initialize the page
	vm.Initialize(Me, Main.appname)
	'update the nav bar title
	vm.NavBar.UpdateLogo("./assets/sponge.png")
	vm.NavBar.SetTitle("BVMDemo - created by TheMash")
	vm.Drawer.SetTitle("BDMDemo")
	vm.Drawer.SetPersistentFull(True)
	'the navbar will be visible
	vm.NavBar.Show
	'set primary color for the navbar
	vm.NavBar.SetPrimary(True)
	'fix the navbar so that it does not move
	vm.NavBar.SetModeFixed(True)
	'hide the back button
	vm.NavBar.SetHasBackButton(False)
	'show the hamburger button
	vm.NavBar.SetHasMenuButton(True)
	'
	BuildDrawer
	'build the grid of the page: we will add stuff at 1:1
	vm.Container.AddRows(1).AddColumns12
	'add the code from the modules
	vm.AddPage(modTypography.name, modTypography)
	vm.AddPage(modChips.name, modChips)
	vm.AddPage(modAvatar.name, modAvatar)
	vm.AddPage(modBadge.name, modBadge)
	vm.AddPage(modListView.name, modListView)
	vm.AddPage(modButtons.name, modButtons)
	vm.AddPage(modDatePicker.name, modDatePicker)
	vm.AddPage(modCheckBox.name, modCheckBox)
	vm.AddPage(modFile.name, modFile)
	vm.AddPage(modTextBox.name, modTextBox)
	vm.AddPage(modTextArea.name, modTextArea)
	vm.AddPage(modRadio.name, modRadio)
	vm.AddPage(modSelect.name, modSelect)
	vm.AddPage(modSwitch.name, modSwitch)
	vm.AddPage(modIcon.name, modIcon)
	'vm.AddPage(modList.name, modList)
	vm.AddPage(modMenu.name, modMenu)
	vm.AddPage(modDialog.name, modDialog)
	vm.AddPage(modEmptyState.name, modEmptyState)
	vm.AddPage(modSpeedDial.name, modSpeedDial)
	vm.AddPage(modProgress.name, modProgress)
	vm.AddPage(modSpinner.name, modSpinner)
	vm.AddPage(modSnackBar.name, modSnackBar)
	vm.AddPage(modSteppers.name, modSteppers)
	vm.AddPage(modTabs.name, modTabs)
	vm.AddPage(modToolbar.name, modToolbar)
	vm.AddPage(modTable.name, modTable)
	vm.AddPage(modBottomBar.name, modBottomBar)
	vm.AddPage(modTimePIcker.name, modTimePIcker)
	vm.AddPage(modGMap.name, modGMap)
	vm.AddPage(modChartKick.name, modChartKick)
	vm.AddPage(modGijgoTable.name, modGijgoTable)
	vm.AddPage(modAutoComplete.name, modAutoComplete)
	vm.AddPage(modInfoBox.name, modInfoBox)
	'build the page
	vm.ux
	'
	'Log(vm.GetTemplate)
	'Log(vm.data)
	
End Sub



Sub BuildDrawer
	vm.Drawer.AddItem("ui","whatshot","UI Elements")
	vm.drawer.AddSubItem("ui", "autocompletex", "","Auto Complete")
	vm.drawer.AddSubItem("ui", "avatar", "person_outline","Avatar")
	vm.drawer.AddSubItem("ui", "badge", "","Badge")
	vm.drawer.AddSubItem("ui", "listview", "","ListView")
	vm.drawer.AddSubItem("ui", "buttons", "","Buttons")
	vm.drawer.AddSubItem("ui", "typography", "","Typography")
	vm.drawer.AddSubItem("ui", "icon", "","Icon")
	vm.drawer.AddSubItem("ui", "menus", "","Menu")
	vm.drawer.AddSubItem("ui", "dialog", "","Dialog")
	vm.drawer.AddSubItem("ui", "empty", "","Empty State")
	vm.drawer.AddSubItem("ui", "speeddial", "","Speed Dial")
	vm.drawer.AddSubItem("ui", "progress", "","Progress")
	vm.drawer.AddSubItem("ui", "spinner", "","Spinner")
	vm.drawer.AddSubItem("ui", "snackbar1", "","Snack Bar")
	vm.drawer.AddSubItem("ui", "steppers", "","Steppers")
	vm.drawer.AddSubItem("ui", "tabs", "","Tabs")
	vm.drawer.AddSubItem("ui", "toolbar", "","Toolbar")
	vm.drawer.AddSubItem("ui", "table", "","Table")
	vm.drawer.AddSubItem("ui", "bottombar", "","Bottom Bar")
	'
	'vm.Drawer.AddItem("listx","","List")
	'vm.drawer.AddSubItem("listx", "controls", "","Controls")
	

	vm.Drawer.AddItem("forms","video_library","Forms")
	vm.drawer.AddSubItem("forms", "datepicker", "date_range","DatePicker")
	vm.drawer.AddSubItem("forms", "timepicker", "","TimePicker")
	vm.drawer.AddSubItem("forms", "checkbox", "check_box_outline_blank","CheckBox")
	vm.drawer.AddSubItem("forms", "chip", "","Chip")
	vm.drawer.AddSubItem("forms", "file", "attach_file","File")
	vm.drawer.AddSubItem("forms", "input", "input","Input")
	vm.drawer.AddSubItem("forms", "textarea", "comment","TextArea")
	vm.drawer.AddSubItem("forms", "radio", "radio_button_checked","Radio")
	vm.drawer.AddSubItem("forms", "combo", "arrow_drop_down","Select")
	vm.drawer.AddSubItem("forms", "switchbox", "toggle_off","Switch")
	'
	vm.Drawer.AddItem("plugins","","Plugins")
	vm.drawer.AddSubItem("plugins", "gmap", "","Google Map")
	vm.drawer.AddSubItem("plugins", "chartkick", "","ChartKick")
	vm.drawer.AddSubItem("plugins", "gijgotable", "","Gijgo Table")
	vm.drawer.AddSubItem("plugins", "infobox", "","InfoBox")
End Sub

Sub infobox_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Info Box")
	vm.ShowPage(modInfoBox.name)
End Sub

Sub autocompletex_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Auto Complete")
	vm.ShowPage(modAutoComplete.name)
End Sub

Sub gijgotable_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Gijgo Table")
	vm.ShowPage(modGijgoTable.name)
	modGijgoTable.refresh
End Sub

Sub chartkick_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Chart Kick")
	vm.ShowPage(modChartKick.name)
End Sub

Sub gmap_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Google Map")
	vm.ShowPage(modGMap.name)
End Sub


Sub timepicker_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - TimePicker")
	vm.ShowPage(modTimePIcker.name)
End Sub

Sub bottombar_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Bottom Bar")
	vm.ShowPage(modBottomBar.name)
End Sub

Sub table_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Table")
	vm.ShowPage(modTable.name)
End Sub

Sub toolbar_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Toolbar")
	vm.ShowPage(modToolbar.name)
End Sub

Sub tabs_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Tabs")
	vm.ShowPage(modTabs.name)
End Sub

Sub steppers_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Steppers")
	vm.ShowPage(modSteppers.name)
End Sub

Sub snackbar1_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Snack Bar")
	vm.ShowPage(modSnackBar.name)
End Sub

Sub spinner_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Spinner")
	vm.ShowPage(modSpinner.name)
End Sub

Sub progress_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Progress")
	vm.ShowPage(modProgress.name)
End Sub


Sub speeddial_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Speed Dial")
	vm.ShowPage(modSpeedDial.name)
End Sub


Sub empty_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Empty State")
	vm.ShowPage(modEmptyState.name)
End Sub

Sub dialog_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Dialog")
	vm.ShowPage(modDialog.name)
End Sub

Sub menus_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Menu")
	vm.ShowPage(modMenu.name)
End Sub

Sub controls_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - List > Controls")
	vm.ShowPage(modList.name)
End Sub

Sub icon_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Icon")
	vm.ShowPage(modIcon.name)
End Sub

Sub switchbox_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Switch")
	vm.ShowPage(modSwitch.name)
End Sub

Sub combo_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Select")
	vm.ShowPage(modSelect.name)
End Sub

Sub radio_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Radio")
	vm.ShowPage(modRadio.name)
End Sub

Sub textarea_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - TextArea")
	vm.ShowPage(modTextArea.name)
End Sub

Sub input_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Input")
	vm.ShowPage(modTextBox.name)
End Sub

Sub file_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - File")
	vm.ShowPage(modFile.name)
End Sub

Sub checkbox_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - CheckBox")
	vm.ShowPage(modCheckBox.name)
End Sub

Sub datepicker_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - DatePicker")
	vm.ShowPage(modDatePicker.name)
End Sub

Sub buttons_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Buttons")
	vm.ShowPage(modButtons.name)
End Sub

Sub listview_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - ListView")
	vm.ShowPage(modListView.name)
End Sub

Sub badge_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Badge")
	vm.ShowPage(modBadge.name)
End Sub

Sub avatar_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Avatar")
	vm.ShowPage(modAvatar.name)
End Sub

Sub typography_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Typography")
	vm.ShowPage(modTypography.name)
End Sub

Sub chip_click(e As BANanoEvent)
	vm.NavBar.UpdateTitle("BVMDemo - Chip")
	vm.ShowPage(modChips.name)
End Sub

Sub back_click(e As BANanoEvent)
	'vm.Drawer.Toggle
	'vm.NavBar.ToggleMenu
End Sub

Sub confirm_ok(e As BANanoEvent)
	Dim sprocess As String = vm.getconfirm
	Select Case sprocess
	Case "delete_people"
		Dim pid As String = vm.getstate("peopleid","")
		vm.ShowSnackBar("Person to delete id: " & pid)		
	End Select
End Sub
