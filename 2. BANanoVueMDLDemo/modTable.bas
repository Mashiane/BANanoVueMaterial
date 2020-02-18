B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "tablecode"
	Private BANano As BANano
End Sub


Sub Code(vmx As BANanoVM)
	Log("modTable.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	Dim options As List
	options.initialize
	options.Add(Array("Anele","Mbanga","doing","BANanoVueMaterial"))
	'
	vm.setstatelist("users", Array())
	vm.setstatelist("searched", Array())
	vm.SetCreated(Me, "setSearched")
	Dim tablex As VMTable = vm.CreateTable("tablex", Me).SetVModel("searched").SetCard(True)
	tablex.ToolBar.SetTitle("Users")
	'add a search input and save result to mysearch vmodel
	tablex.ToolBar.AddSearch("msearch", "Search...", "mysearch", "300px", options)
	tablex.ToolBar.SetPrimary(True)
	'set sort field and sort order
	tablex.SetSort("name").SetSortOrderAsc(True)
	'tablex.SetFixedHeaders(True)
	'ensure we select 1 record at a time
	tablex.SetSelectableSingle(True)
	'
	tablex.AddColumn("id", "ID",True, True)
	tablex.AddColumn("name", "Name",False, True)
	tablex.AddColumn("email", "Email",False, True)
	tablex.AddColumn("gender", "Gender",False, True)
	tablex.AddColumn("title", "Title",False, True)
	'
	Dim stable As String = tablex.tostring
	cont.AddComponent(1,1, stable)
	
	'
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
	
	vm.setstatesingle("users", users)
	
	'
	vm.CreateLABEL("lbl").SetText("{{ tablexselection }}").AddToContainer(cont, 2, 1)
	vm.Container.AddComponent(1,1,cont.tostring)
	
End Sub

'on create of the app
Sub setSearched(e As BANanoEvent)
	vm.State2Another("users", "searched", Array())
End Sub

Sub tablex_select(items As List)
	vm.setstatesingle("tablexselection", items)
End Sub

'http://gorgeousapps.com/banhelp.html#14
'.$eq: Equal
'.$ne: Not Equal
'.$lt: Less than
'.$gt: Greater than
'.$bt: Between (expects an Array, e.g. [4, 6])
'.$in: In (expects an Array, e.g. [6,15])
'.$ni: Not in (expects an Array, e.g. [6,15])
'.$li: Like (expects a String Or a Regex expression)

'on keypress on search input
Sub search_input(e As BANanoEvent)
	'perform a search on values
	Dim svalue As String = vm.getstate("mysearch", "")
	If svalue = "" Then
		'put complete list
		vm.State2Another("users", "searched", Array())
	Else
		'search the items and save on searched
		Dim items As List = vm.getstate("users", Array())
		'use json query
		Dim jsonQ As BANanoJSONQuery
		jsonQ.Initialize(items)
				
		'filter the items
		Dim jsonF As BANanoJSONQuery = jsonQ.Where($"{'name.$li':'${svalue}'}"$).ToJQ
		Dim searched As List = jsonF.All
		If searched.Size = 0 Then
			vm.State2Another("users", "searched", Array())
		Else
			vm.SetStateSingle("searched", searched)
		End If
	End If
End Sub
