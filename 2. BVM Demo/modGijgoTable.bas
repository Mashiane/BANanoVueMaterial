B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "gijotablecode"
	Private BANano As BANano  'ignore
	Private people As VMGijgoTable
	Private Mode As String
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
	people = vm.CreateGijgoTable("people", "id", Me)
	people.SetTitle("People")
	people.AddColumn("id", "ID")
	people.AddColumn("name", "Name")
	people.AddColumn("email", "Email")
	people.AddColumn("gender", "Gender")
	people.AddColumn("title", "Title")
	people.AddEditTrash
	people.SetDataSource(Array())
	cont.AddComponent(1,1, people.tostring)
	vm.AddContainer(cont)
	Mode = ""
End Sub

Sub Refresh
	Dim users As List
	users.initialize
	users.add(CreateMap("id": 1, "name": "Shawna Dubbin", "email": "sdubbin0@geocities.com", "gender": "Male", "title": "Assistant Media Planner"))
	users.add(CreateMap("id": 2, "name": "Odette Demageard", "email": "odemageard1@spotify.com", "gender": "Female", "title": "Account Coordinator"))
	users.add(CreateMap("id": 3, "name": "Lonnie Izkovitz", "email": "lizkovitz3@youtu.be", "gender": "Female", "title": "Operator"))
	users.add(CreateMap("id": 4, "name": "Thatcher Stave", "email": "tstave4@reference.com", "gender": "Male", "title": "Software Test Engineer III"))
	users.add(CreateMap("id": 5, "name": "Clarinda Marieton", "email": "cmarietonh@theatlantic.com", "gender": "Female", "title": "Paralegal"))
	users.add(CreateMap("id": 6, "name": "Karim Chipping", "email": "kchipping5@scribd.com", "gender": "Female", "title": "Safety Technician II"))
	users.add(CreateMap("id": 7, "name": "Helge Holyard", "email": "hholyard6@howstuffworks.com", "gender": "Female", "title": "Internal Auditor"))
	users.add(CreateMap("id": 8, "name": "Rod Titterton", "email": "rtitterton7@nydailynews.com", "gender": "Male", "title": "Technical Writer"))
	users.add(CreateMap("id": 9, "name": "Gawen Applewhite", "email": "gapplewhite8@reverbnation.com", "gender": "Female", "title": "GIS Technical Architect"))
	users.add(CreateMap("id": 10, "name": "Nero Mulgrew", "email": "nmulgrew9@plala.or.jp", "gender": "Female", "title": "Staff Scientist"))
	'
	people.SetDataSource(users)
	people.refresh
End Sub

Sub people_edit(e As BANanoEvent)
	'get the record corresponding to the row
	Dim rec As Map = people.GetRecordFromEvent(e)
	Dim sid As String = rec.GetDefault("id","")
	If sid = "" Then Return
	'turn the mode to edit
	Mode = "E"
	' continue processing
	Dim pJSON As String = BANano.ToJson(rec)
	vm.ShowSnackBar(pJSON)
End Sub

Sub people_delete(e As BANanoEvent)
	'get the record for the row
	Dim rec As Map = people.GetRecordFromEvent(e)
	Dim sid As String = rec.GetDefault("id","")
	Dim stext As String = rec.getdefault("name","")
	If sid = "" Then Return
	'save the category id to delete
	vm.SetStateSingle("peopleid", sid)
	'indicate confirm dialog
	vm.ShowConfirm("delete_people", $"Confirm Delete: ${stext}"$, _
	"Are you sure that you want to delete this person. You will not be able to undo your actions. Continue?","Ok","Cancel")
End Sub