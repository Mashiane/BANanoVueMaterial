B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "chipscode"
	Private BANano As BANano  'ignore
End Sub


Sub Code(vmx As BANanoVM)
	Log("modChips.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns12
	Dim lbl As VMLabel = vm.CreateLABEL("lbl").SetParagraph.SetText("Chip Component")
	cont.AddComponent(1,1,lbl.tostring)
	
	'create a chip and set its text
	Dim chip1 As VMChip = vm.CreateChip("chip1",Me).SetText("Chip1 - Static")
	'add chip on row 1 column 1
	cont.AddComponent(1,1, chip1.ToString)
	'add a chip that can be deletable
	Dim chip2 As VMChip = vm.CreateChip("chip2",Me).SetText("Chip2 - Deletable").SetPrimary(True).SetDeletable(True)
	cont.AddComponent(1,1,chip2.ToString)
	
	Dim chip3 As VMChip = vm.CreateChip("chip3",Me).SetText("Chip3 - Clickable").SetAccent(True).SetClickable(True)
	cont.AddComponent(1,1,chip3.ToString)
	
	Dim chip4 As VMChip = vm.CreateChip("chip4",Me).SetText("Chip4 - Disabled").SetDisabled(True)
	cont.AddComponent(1,1,chip4.ToString)
	'
	Dim lbl As VMLabel = vm.CreateLABEL("lbl").SetParagraph.SetText("Chip from VModel")
	cont.AddComponent(1,1,lbl.tostring)
	
	Dim books As List
	books.initialize
	books.add(CreateMap("id":"1","title":"English"))
	books.add(CreateMap("id":"2","title":"Afrikaans"))
	books.add(CreateMap("id":"3","title":"Xhosa"))
	vm.setstatesingle("books", books)
	
	Dim chipBooks As VMChip = vm.CreateChip("chipBooks",Me).SetDataSource("books","id","title")
	chipBooks.SetPrimary(True).SetClickable(True).SetLabel("Languages")
	cont.AddComponent(1,1,chipBooks.ToString)
	
	'chips
	Dim lbl As VMLabel = vm.CreateLABEL("lbl").SetParagraph.SetText("Chips Input Component")
	cont.AddComponent(1,1,lbl.tostring)
	
	vm.SetStateList("fruits", Array("Orange", "Apple", "Pineapple"))
	Dim chip5 As VMChips = vm.CreateChips("chip5",Me).SetVModel("fruits").SetPlaceholder("Add fruit...").SetCheckDuplicated(True)
	cont.AddComponent(2,1, chip5.tostring)
	'
	Dim lbl As VMLabel = vm.createlabel("thefruits").SetText("{{ fruits }}").SetParagraph
	cont.AddComponent(2,1, lbl.tostring)
	'
	vm.SetStateList("cities", Array("New York", "Amsterdam", "Tokyo", "Rome"))
	Dim chip6 As VMChips = vm.CreateChips("chip6",Me).SetVModel("cities").SetLabel("Cities")
	chip6.SetHelperText("Wonderful places")
	cont.AddComponent(2,1, chip6.tostring)
	'
	Dim chip7 As VMChips = vm.CreateChips("chip7",Me).SetVModel("cities").SetStatic(True)
	cont.AddComponent(2,1, chip7.tostring)
	
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub chipBooks_click(e As BANanoEvent)
	Dim chipID As String = vm.GetIDFromEvent(e)
	vm.showsnackbar(chipID)
End Sub

Sub chip3_click(e As BANanoEvent)
	Dim chipID As String = vm.GetIDFromEvent(e)
	vm.showsnackbar(chipID)
End Sub


Sub chip5_click(text As String, index As Int)
	vm.showsnackbar(text)
End Sub


Sub chip2_delete(e As BANanoEvent)
	Dim sid As String = vm.GetChipIDFromEvent(e)
	vm.showsnackbar(sid)
End Sub


Sub chip5_insert(value As String)
	vm.showsnackbar(value)
End Sub

Sub chip5_delete(text As String, index As Int)
	vm.showsnackbar(text)
End Sub