B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "radiocode"
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(3).AddColumns12
	'
	vm.CreateRadio("rd1",Me).SetVmodel("radio").SetValue("false",True).SetText("Boolean").AddToContainer(cont, 1, 1)
	vm.CreateRadio("rd2",Me).SetVmodel("radio").SetValue("my-radio",False).SetText("String").AddToContainer(cont, 1, 1)
	vm.CreateRadio("rd3",Me).SetVmodel("radio").SetText("No Value").AddToContainer(cont, 1, 1)
	vm.CreateRadio("rd4",Me).SetVmodel("radio").SetDisabled(True).SetText("Disabled").AddToContainer(cont, 1, 1)
	
	cont.AddComponent(1, 1, vm.BR)
	cont.AddComponent(1, 1, vm.BR)
	
	Dim rg As VMRadioGroup = vm.CreateRadioGroup("rg1", "Languages", Me).SetVModel("mybook").SetValue("l1")
	rg.AddItems(CreateMap("l1": "Xhosa", "l2": "English", "l3": "Afrikaans"))
	rg.AddToContainer(cont, 1, 1)
	'
	
	Dim continents As List
	continents.initialize
	continents.add(CreateMap("id":"africa", "text":"Africa"))
	continents.add(CreateMap("id":"america", "text":"America"))
	continents.add(CreateMap("id":"newzeleand", "text":"New Zealand"))
	vm.setstatesingle("continents", continents)

	Dim rg2 As VMRadioGroup = vm.CreateRadioGroup("rg2", "DataSource", Me).SetVModel("ds")
	rg2.SetDataSource("continents", "id", "text")
	rg2.AddToContainer(cont, 2, 1)
	
	vm.CreateLABEL("lbl").SetText("{{ radio }}").AddToContainer(cont, 1, 1)
	cont.AddComponent(1, 1, vm.BR)
	vm.CreateLABEL("lbl").SetText("{{ mybook }}").AddToContainer(cont, 1, 1)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub rg2_change(value As Object)
	vm.showsnackbar(value)
End Sub