B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "autocomplete"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(15).AddColumns12
	
	Dim countries As List
	countries.Initialize
	countries.AddAll(Array("Algeria","Argentina","Brazil", "Canada", "Italy", "Japan","United Kingdom","United States"))
	'
	Dim ac1 As VMAutoComplete = vm.createautocomplete("ac1", Me).SetLabel("Country")
	ac1.SetVModel("selectedCountry").SetOptions(countries)
	ac1.SetHelperText("Select a country")
	cont.AddComponent(1,1, ac1.ToString)
	'
	Dim ac2 As VMAutoComplete = vm.createautocomplete("ac2", Me).SetLabel("Country (Open on Focus - False)")
	ac2.SetVModel("myCountry").SetOptions(countries).SetOpenOnFocus(False).SetHighlight(False)
	ac2.SetHelperText("This uses SetHighlight(False)")
	cont.AddComponent(2,1, ac2.ToString)
	'
	Dim ac3 As VMAutoComplete = vm.createautocomplete("ac3", Me).SetLabel("Country Box")
	ac3.SetVModel("anotherOne").SetOptions(countries).SetDense(True).SetLayoutBox(True)
	ac3.SetHelperText("Uses dense and box layout")
	cont.AddComponent(3,1, ac3.ToString)
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
	Dim ac4 As VMAutoComplete = vm.createautocomplete("ac4", Me).SetLabel("Fonts")
	ac4.SetVModel("fonts").SetOptionsMap(fonts).SetHelperText("Uses options as source")
	cont.AddComponent(4,1, ac4.ToString)
	'
	'use datasource for content source
	Dim countries As List
	countries.initialize
	countries.add(CreateMap("id":"australia", "text":"Australia"))
	countries.add(CreateMap("id":"brazil", "text":"Brazil"))
	countries.add(CreateMap("id":"japan", "text":"Japan"))
	countries.add(CreateMap("id":"united-states", "text":"United States"))
	vm.setstatesingle("countries", countries)

	Dim ac5 As VMAutoComplete = vm.createautocomplete("ac5", Me).SetLabel("DataSource")
	ac5.SetVModel("ds").SetDataSource("countries", "id", "text").SetHelperText("Uses datasource for content")
	cont.AddComponent(4,1, ac5.ToString)
	
	cont.AddLabel(5, 1, "ac1label", "p", "Select Country: {{ selectedcountry }}")
	cont.AddLabel(6, 1, "ac2label", "p", "My Country: {{ mycountry }}")
	cont.AddLabel(7, 1, "ac3label", "p", "Another One: {{ anotherone }}")
	cont.AddLabel(8, 1, "ac4label", "p", "Fonts: {{ fonts }}")
	'
	cont.AddButtonPrimary(Me, 9, 1, "btnGetValue", "Get Font", True, "Get the value", False)
	cont.AddButtonPrimary(Me, 9, 1, "btnSetValue", "Set Font", True, "Set the value", False)
	'
	cont.AddButtonPrimary(Me, 10, 1, "btnGetDSValue", "Get DataSource Value", True, "Get the value", False)
	cont.AddButtonPrimary(Me, 10, 1, "btnSetDSValue", "Set DataSource Value", True, "Set the value", False)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub btnGetDSValue_click(e As BANanoEvent)
	'get the
	Dim selValue As String = vm.GetAutoCompleteKey("ac5")
	vm.ShowSnackBar(selValue)
End Sub

Sub btnSetDSValue_click(e As BANanoEvent)
	vm.SetAutoCompleteKey("ac5", "brazil")
End Sub

'get value of auto complete
Sub btnGetValue_click(e As BANanoEvent)
	'get the 
	Dim selValue As String = vm.GetAutoCompleteKey("ac4")
	vm.ShowSnackBar(selValue)
End Sub

'set value of auto complete
Sub btnSetValue_click(e As BANanoEvent)
	vm.SetAutoCompleteKey("ac4", "roboto")
End Sub