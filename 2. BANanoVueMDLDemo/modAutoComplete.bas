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
	Log("modAutoComplete.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	
	Dim countries As List
	countries.Initialize
	countries.AddAll(Array("Algeria","Argentina","Brazil", "Canada", "Italy", "Japan","United Kingdom","United States"))
	'
	Dim ac1 As VMAutoComplete = vm.createautocomplete("ac1", Me).SetLabel("Country")
	ac1.SetVModel("selectedCountry").SetOptions(countries)
	cont.AddComponent(1,1, ac1.ToString)
	'
	Dim ac2 As VMAutoComplete = vm.createautocomplete("ac2", Me).SetLabel("Country (Open on Focus - False)")
	ac2.SetVModel("selectedCountry").SetOptions(countries).SetOpenOnFocus(False)
	cont.AddComponent(1,1, ac2.ToString)
	'
	Dim ac3 As VMAutoComplete = vm.createautocomplete("ac3", Me).SetLabel("Country Box")
	ac3.SetVModel("selectedCountry").SetOptions(countries).SetDense(True).SetLayoutBox(True)
	cont.AddComponent(1,1, ac3.ToString)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

