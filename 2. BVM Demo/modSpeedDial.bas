B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "speedcode"
End Sub


Sub Code(vmx As BANanoVM)
	Log("modSpeedDial.Code")
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(2).AddColumns4x3
	'
	Dim sp1 As VMSpeedDial = vm.CreateSpeedDial("sp1", Me).SetEffectFling(True).SetPrimary(True).SetIcon("my_location")
	sp1.AddButton("btnDirection", "directions")
	sp1.AddButton("btnStreetView", "streetview")
	sp1.AddToContainer(cont, 1, 1)
	
	'click on sp to show child buttons
	Dim sp2 As VMSpeedDial = vm.CreateSpeedDial("sp2", Me).SetEventClick(True).SetEffectOpacity(True).SetAccent(True).SetIcon("add")
	sp2.AddButton("btnNote", "note")
	sp2.AddButton("btnEvent", "event")
	sp2.AddToContainer(cont, 1, 2)
	' morph
	Dim sp3 As VMSpeedDial = vm.CreateSpeedDial("sp3", Me).SetPrimary(True).SetInitialIcon("add").SetFinalIcon("edit")
	sp3.AddButton("btnDirection", "directions")
	sp3.AddButton("btnStreetView", "streetview")
	sp3.AddToContainer(cont, 1, 3)
	'
	Dim sp4 As VMSpeedDial = vm.CreateSpeedDial("sp4", Me).SetEventClick(True).SetAccent(True).SetInitialIcon("add").SetFinalIcon("close")
	sp4.AddButton("btnNote", "note")
	sp4.AddButton("btnEvent", "event")
	sp4.AddToContainer(cont, 1, 4)
		
	vm.Container.AddComponent(1,1,cont.tostring)
End Sub

Sub btndirection_click(e As BANanoEvent)
	vm.ShowSnackBar("Show Directions")
End Sub

Sub btnstreetview_click(e As BANanoEvent)
	vm.showsnackbar("Street View")
End Sub