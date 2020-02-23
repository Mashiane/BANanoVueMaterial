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
	Public name As String = "selectcode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modSelect.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns(3,12,4,4,4)
	
	Dim selMovie As VMSelect = vm.CreateSelect("movie",Me).SetVModel("movie").SetMultiple(True)
	selMovie.SetLabel("Movie").SetValue("godfather")
	selMovie.additem("fightclub", "Fight Club")
	selMovie.additem("godfather", "Godfather")
	selMovie.additem("godfatherii", "Godfather II")
	selMovie.additem("godfatheriii", "Godfather III")
	selMovie.additem("godfellas", "Godfellas")
	selMovie.additem("pulpfiction", "Pulp Fiction")
	selMovie.additem("scarface", "Scarface")
	selMovie.AddToContainer(cont, 1, 1)
	'
	
	cont.AddComponent(1,1, vm.BR)
	cont.AddComponent(1,1, vm.BR)
	
	vm.CreateLABEL("lbl").SetText("{{ movie }}").AddToContainer(cont, 1, 1)
	' countries
	Dim countries As List
	countries.initialize
	countries.add(CreateMap("id":"australia", "text":"Australia"))
	countries.add(CreateMap("id":"brazil", "text":"Brazil"))
	countries.add(CreateMap("id":"japan", "text":"Japan"))
	countries.add(CreateMap("id":"united-states", "text":"United States"))
	vm.setstatesingle("countries", countries)
	'
	Dim selCountries As VMSelect = vm.CreateSelect("country",Me).SetVModel("country")
	selCountries.SetPlaceholder("Country")
	selCountries.SetDataSource("countries", "id", "text")
	selCountries.AddToContainer(cont, 1, 2)
	'
	cont.AddComponent(1,2, vm.BR)
	cont.AddComponent(1,2, vm.BR)
	
	vm.CreateButton("btnSel",Me).SetText("Set Japan").SetRaised(True).AddToContainer(cont, 1,2)
	cont.AddComponent(1,2, vm.BR)
	cont.AddComponent(1,2, vm.BR)
	vm.CreateLABEL("lbl2").SetText("{{ country }}").AddToContainer(cont, 1, 2)
	'
	Dim fonts As Map = CreateMap()
	fonts.put("arial","Arial")
	fonts.put("calibri","Calibri")
	fonts.put("cambria","Cambria")
	fonts.put("comicsans","Comic Sans")
	fonts.put("consolas","Consolas")
	fonts.put("courier","Courier")
	fonts.put("droidsans","Droid Sans")
	fonts.put("georgia","Georgia")
	fonts.put("helvetica","Helvetica")
	fonts.put("impact","Impact")
	fonts.put("roboto","Roboto")
	fonts.put("segoeui","Segoe UI")
	fonts.put("timesnewroman","Times New Roman")
	fonts.put("ubuntu","Ubuntu")
	fonts.put("verdana","Verdana")
	'
	Dim selFonts As VMSelect = vm.CreateSelect("font",Me).SetVModel("font").SetLabel("Font")
	selFonts.SetPlaceholder("Font")
	selFonts.SetOptions("fontnames", fonts, "id", "text")
	selFonts.SetRequired(True).SetErrorText("Font should be selected!")
	selFonts.AddToContainer(cont, 1, 3)
	'
	cont.AddComponent(1,3, vm.BR)
	cont.AddComponent(1,3, vm.BR)
	
	vm.CreateLABEL("lblx").SetText("{{ font }}").AddToContainer(cont, 1, 3)
	
	vm.Container.AddComponent(1,1,cont.tostring)
	vm.SHowError("font")
End Sub

Sub btnSel_click(e As BANanoEvent)
	vm.setstatesingle("country", "japan")
End Sub

Sub countryOpened(e As BANanoEvent)
	vm.ShowSnackBar("Country Opened!")	
End Sub

Sub countryClosed(e As BANanoEvent)
	vm.ShowSnackBar("Country Closed!")
End Sub

Sub country_change(value As String)
	vm.ShowSnackBar(value)
End Sub
