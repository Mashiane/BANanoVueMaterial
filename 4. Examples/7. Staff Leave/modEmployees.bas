﻿B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
#IgnoreWarnings:12
Sub Process_Globals
	'The gijgo table instance
	Private tblEmployees As VMGijgoTable
	'a map of fields to show on the gijgo table
	Private EmployeesFields As Map
	'the vue material instance
	Private vm As BANanoVM
	'the BANanoSQL database instance
	Private db As BANanoSQL
	'the BANanoSQL database helper class to build SQL commands
	Private alaSQL As BANanoAlaSQL
	'the mode between A(dd) and E(dit)
	Private Mode As String
	'the BANano instance
	Private BANano As BANano   'ignore
	'the dialog instance
	Private diagEmployees As VMDialog
	Public Name As String = "EmployeesCode"
	Public Title As String = "Employees"
End Sub


Sub Code
	Log("modEmployees.Code")
	vm = pgIndex.vm
	'initialize the fields for the table i.e columns
	InitEmployees
	'create a container to hold all components
	Dim cont As VMContainer = vm.CreateContainer(Name,Me)
	'hide this container
	cont.Hide
	''create 2 columns each spanning 12 columns
	cont.AddRows(2).AddColumns12
	'A filter is required for the table!
	'add a container to hold the filters
	Dim fltEmployees As VMContainer = vm.CreateContainer("fltEmployees", Me)
	'add a row with two columns 10+2
	fltEmployees.AddRows(1).AddColumns10p2
	'add a selector to choose columns from
	Dim filterEmployees As VMSelect = vm.CreateSelect("filterEmployees", Me).SetVModel("filterEmployees")
	'define fields to filter on
	filterEmployees.SetMultiple(True).SetLabel("Filter Fields")
	'define columns for the table
	filterEmployees.AddItems(EmployeesFields)
	fltEmployees.AddComponent(1,1, filterEmployees.ToString)
	'button to reset the filters
	Dim btnRstFltEmployees As VMButton = vm.CreateButton("btnRstFltEmployees", Me).SetText("Reset Filters").SetAccent(True).SetRaised(True)
	fltEmployees.AddComponent(1,2, btnRstFltEmployees.tostring)
	Dim btnAplyFltEmployees As VMButton = vm.CreateButton("btnAplyFltEmployees", Me).SetText("Apply Filters").SetPrimary(True).SetRaised(True)
	fltEmployees.addcomponent(1,2, btnAplyFltEmployees.tostring)
	'add filter container to parent container
	cont.AddComponent(1, 1, fltEmployees.tostring)


	'create the gijgo table instance
	tblEmployees = vm.CreateGijgoTable("tblEmployees", "id", Me)
	'set the title of the table
	tblEmployees.SetTitle("Employees")
	'add the table to the grid
	cont.AddComponent(2,1, tblEmployees.tostring)

	'add container to the page content
	vm.AddContainer(cont)


	'create the dialog for Employees and add it to the page
	DialogEmployees


	'include the method in the global scope
	vm.SetMethod(Me, "RefreshEmployees")
	vm.SetMethod(Me, "ResetFiltersEmployees")
End Sub


'Initialize fields for this table
Sub InitEmployees
	EmployeesFields.Initialize
	EmployeesFields.Put("fullname", "Full Name")
	EmployeesFields.Put("profilepic", "Image")
	EmployeesFields.Put("email", "Email Address")
	EmployeesFields.Put("status", "Status")
	EmployeesFields.Put("position", "Position")
	EmployeesFields.Put("role", "Role")
	EmployeesFields.Put("vacationdays", "Vacation Days Allocated")
End Sub


'This is to refresh the table content for employees
Sub RefreshEmployees
	'Show a progress loader
	vm.PagePause
	'Code to get the table contents
	'open the database
	db.OpenWait("alasql", "staffleave")
	'initialize the helper class
	alaSQL.Initialize
	'Define the SQL command
	Dim rsSelectEmployees As AlaSQLResultSet = alaSQL.SelectAll("employees", Array("*"), Array("fullname"))
	'Execute the SQL command
	rsSelectEmployees.result = db.ExecuteWait(rsSelectEmployees.query, rsSelectEmployees.args)
	'Assign results to table and refresh table
	tblEmployees.Reset
	'a filter has been set
	tblEmployees.SetFilters("filterEmployees")
	tblEmployees.AddColumn("fullname", "Full Name")
	tblEmployees.AddColumn("profilepic", "Image")
	tblEmployees.SetColumnType("profilepic", "image")
	tblEmployees.AddColumn("email", "Email Address")
	tblEmployees.AddColumn("status", "Status")
	tblEmployees.AddColumn("position", "Position")
	tblEmployees.AddColumn("role", "Role")
	tblEmployees.AddColumn("vacationdays", "Vacation Days Allocated")
	tblEmployees.SetColumnAlignment("vacationdays", "right")

	tblEmployees.AddEdit
	tblEmployees.AddDelete
	'assign the resultset results to table
	tblEmployees.SetDataSource(rsSelectEmployees.Result)
	'refresh the table to show the records!
	tblEmployees.Refresh
	'Hide a progress loader
	vm.PageResume
End Sub

'a filter is being reset
Sub btnRstFltEmployees_click(e as BANanoEvent)
	'Reset the filters
	vm.CallMethod("ResetFiltersEmployees")
	'refresh the table contents
	vm.CallMethod("RefreshEmployees")
End Sub


'reset the filters
Sub ResetFiltersEmployees
	'get the list of fields to display initially on table
	Dim normalList As List = vm.MapKeys2List(EmployeesFields)
	'save the initial state of the fields
	vm.SetStateSingle("filterEmployees", normalList)
End Sub


'a filter is being applied
Sub btnAplyFltEmployees_click(e as BANanoEvent)
	vm.CallMethod("RefreshEmployees")
End Sub


'hide buttons applicable to this page
Sub HideEmployeesButtons
	vm.Hide("btnAddEmployees")
	vm.Hide("btnRefreshEmployees")
End Sub


'show buttons applicable to this page
Sub ShowEmployeesButtons
	vm.Show("btnAddEmployees")
	vm.Show("btnRefreshEmployees")
End Sub


'show this page only
Sub ShowEmployees
	vm.CallMethod("ResetFiltersEmployees")
	'update the title of the navbar
	vm.Navbar.UpdateTitle(Title)
	'hide all existing items in the navbar
	vm.NavBar.HideItems
	'show this page by hiding all others
	vm.ShowPage(Name)
	'show buttons applicable to this page
	ShowEmployeesButtons
	vm.CallMethod("RefreshEmployees")
End Sub


'save record to the database
Sub SaveEmployees
	'get the Employee record details from the modal
	Dim recEmployee As Map = diagEmployees.Container.GetData
	'validate the record
	Dim validEmployee As Boolean = vm.Validate(recEmployee, diagEmployees.Container.Required)
	'the recod is not valid, exit, user will get indications on the UX
	If validEmployee = False Then Return
	'open the database
	db.OpenWait("alasql", "staffleave")
	'initialize the helper class
	alaSQL.Initialize
	Select Case Mode
		Case "A"
			'we have an auto increment field, lets calculate it
			Dim rsMax As AlaSQLResultSet = alaSQL.GetMax("employees", "id")
			'execute the code to get the maximum value stored!
			rsMax.Result = db.ExecuteWait(rsMax.query, rsMax.args)
			'get the next value
			dim nextEmployee As String = alaSQL.GetNextID("id", rsMax.Result)
			'update the record to save!
			recEmployee.put("id", nextEmployee)
			'a new Employee is being added
			Dim rsInsert As AlaSQLResultSet = alaSQL.Insert("employees", recEmployee)
			'execute the SQL command
			rsInsert.Result = db.ExecuteWait(rsInsert.query, rsInsert.args)
		Case "E"
			'an existing Employee is being updated
			'read the primary key
			Dim priKey As String = recEmployee.Get("id")
			Dim rsEdit As AlaSQLResultSet = alaSQL.Update("employees", "id", priKey, recEmployee)
			'execute the SQL command
			rsEdit.Result = db.ExecuteWait(rsEdit.query, rsEdit.args)
	End Select
	'hide the modal for entry
	vm.HideDialog("diagEmployees")
	'Reset the filters
	vm.CallMethod("ResetFiltersEmployees")
	'refresh the Employees listing
	vm.CallMethod("RefreshEmployees")
End Sub


'adding a new record
Sub AddEmployees
	Mode = "A"
	'Update the dialog details
	diagEmployees.SetTitle("New Employee")
	'set the default values for the dialog
	diagEmployees.Container.SetDefaults
	'show the modal
	vm.ShowDialog("diagEmployees")
End Sub


'the edit column has been clicked on the table
Sub tblEmployees_edit(e As BANanoEvent)
	'get the record corresponding to the row
	Dim recTmp As Map = tblEmployees.GetRecordFromEvent(e)
	'get the primary key value of the record
	Dim recKey As String = recTmp.GetDefault("id","")
	If recKey = "" Then Return
	'turn the mode to edit
	Mode = "E"
	'open the database and read the record
	db.OpenWait("alasql", "staffleave")
	alaSQL.Initialize
	'Build the SQL command
	Dim rsReadEmployees As AlaSQLResultSet = alaSQL.Read("employees", "id", recKey)
	'Execute the DB call to read the record
	rsReadEmployees.Result = db.ExecuteWait(rsReadEmployees.query, rsReadEmployees.args)
	'Get the first record
	Dim recEmployees As Map = rsReadEmployees.Result.Get(0)
	'Update the dialog details
	diagEmployees.SetTitle("Edit Employee")
	'set the default values for the dialog
	diagEmployees.Container.SetDefaults
	'update the state, this updates the v-model(s) for each input control
	vm.SetState(recEmployees)
	'show the modal
	vm.ShowDialog("diagEmployees")
End Sub


'the delete column has been clicked on the table
Sub tblEmployees_delete(e As BANanoEvent)
	'get the record corresponding to the row
	Dim recTmp As Map = tblEmployees.GetRecordFromEvent(e)
	'get the primary key value of the record
	Dim recKey As String = recTmp.GetDefault("id","")
	If recKey = "" Then Return
	'save the key to delete
	vm.SetStateSingle("employeesid", recKey)
	'build the confirm dialog with the delete process
	vm.ShowConfirm("delete_employees","Confirm Delete","Are you sure that you want to delete this Employee record?", "Yes","No")
End Sub


'code to delete a single record from the db
Sub DeleteEmployees
	'get the record id to delete
	Dim recKey As String = vm.GetState("employeesid","")
	If recKey = "" Then Return
	'open the database and delete the record
	db.OpenWait("alasql", "staffleave")
	alaSQL.Initialize
	'Build the SQL command
	Dim rsDeleteEmployees As AlaSQLResultSet = alaSQL.Delete("employees", "id", recKey)
	'Execute the DB call to delete the record
	rsDeleteEmployees.Result = db.ExecuteWait(rsDeleteEmployees.query, rsDeleteEmployees.args)
	'refresh the table listing
	vm.CallMethod("RefreshEmployees")
End Sub


'create the modal for data entry
Sub DialogEmployees
	'initialize the modal
	diagEmployees = vm.CreateDialog("diagEmployees", Me)
	'set the title for the page
	diagEmployees.SetTitle("Employees")
	'the dialog should be in full screen
	diagEmployees.SetMaximize(True)
	'the dialog should be modal only closable on button click
	diagEmployees.SetModal(True)
	'the dialog should have a scroll when necessary
	diagEmployees.SetScrollBar(True)
	'the dialog should show a backdop
	diagEmployees.SetBackdrop(True)
	'set the width of the dialog
	diagEmployees.SetWidth("900px")
	'set the height of the dialog
	diagEmployees.SetHeight("700px")


	'add the cancel button
	diagEmployees.AddCancel("btnCancelEmployees", "Cancel")
	'add the ok button
	diagEmployees.AddOK("btnSaveEmployees", "Save")
	'add the input controls
	'defining #
	Dim inpid As VMInputControl = vm.NewText("id", "#", "", false, "", 20, "", "",0)
	inpid.SetVisible(false).SetPosition("1", "1","12","12","12", "12")
	diagEmployees.Container.AddControlOnly(inpid)


	'defining Full Name
	Dim inpfullname As VMInputControl = vm.NewText("fullname", "Full Name", "", true, "", 100, "", "",0)
	inpfullname.SetVisible(true).SetPosition("2", "1","12","6","6", "6")
	diagEmployees.Container.AddControlOnly(inpfullname)


	'defining Image
	Dim inpprofilepic As VMInputControl = vm.NewImage("profilepic", "", "profilepic", "100px", "100px")
	inpprofilepic.SetVisible(true).SetPosition("2", "2","12","6","6", "6")
	diagEmployees.Container.AddControlOnly(inpprofilepic)


	'defining Email Address
	Dim inpemail As VMInputControl = vm.NewEmail("email", "Email Address", "", true, "", "", "", 0)
	inpemail.SetVisible(true).SetPosition("3", "1","12","6","6", "6")
	diagEmployees.Container.AddControlOnly(inpemail)


	'defining Status
	Dim optmstatus As Map = vm.GetOptionsFromKV(",", "active,inactive,notconfirmed", "Active,In-Active,Not Confirmed")
	Dim inpstatus As VMInputControl = vm.NewSelectOptions("status", "Status", true, False, "", optmstatus, "id", "text", "", "",0)
	inpstatus.SetVisible(true).SetPosition("3", "2","12","6","6", "6")
	diagEmployees.Container.AddControlOnly(inpstatus)


	'defining Position
	Dim inpposition As VMInputControl = vm.NewText("position", "Position", "", true, "", 100, "", "",0)
	inpposition.SetVisible(True).SetPosition("4", "1","12","6","6", "6")
	diagEmployees.Container.AddControlOnly(inpposition)


	'defining Role
	Dim optmrole As Map = vm.GetOptionsFromKV(",", "staff,hr,guest", "Staff,HR,Guest")
	Dim inprole As VMInputControl = vm.NewSelectOptions("role", "Role", True, False, "", optmrole, "id", "text", "", "",0)
	inprole.SetVisible(True).SetPosition("4", "2","12","6","6", "6")
	diagEmployees.Container.AddControlOnly(inprole)


	'defining Vacation Days Allocated
	Dim inpvacationdays As VMInputControl = vm.NewNumber("vacationdays", "Vacation Days Allocated", "", True, "", "", "", 0)
	inpvacationdays.SetVisible(True).SetPosition("5", "1","12","6","6", "6")
	diagEmployees.Container.AddControlOnly(inpvacationdays)


	'defining Upload Image
	Dim inpuploadpic As VMInputControl = vm.NewFile("uploadpic", "Upload Image", "", False, "", "", 0)
	inpuploadpic.SetVisible(True).SetPosition("5", "2","12","6","6", "6")
	diagEmployees.Container.AddControlOnly(inpuploadpic)


	'add the dialog to the page
	vm.AddDialog(diagEmployees)
End Sub


'save the employee
Sub btnSaveEmployees_click(e As BANanoEvent)
	SaveEmployees
End Sub


'cancel the dialog
Sub btnCancelEmployees_click(e As BANanoEvent)
	'hide the modal
	vm.HideDialog("diagEmployees")
End Sub



