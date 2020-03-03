B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public name As String = "zcirclecode"
	Public Title As String = "Title"	
End Sub


Sub Code(vmx As BANanoVM)
	vm = vmx
	'create a container to hold all contents
	Dim cont As VMContainer = vm.CreateContainer(name,Me)
	'hide this container
	cont.Hide
	'create 2 columns each spanning 12 columns
	cont.addrows(1).AddColumns12
	
	'create the canvas for zircle
	Dim zc As VMZCanvas
	zc.initialize(vm.Vue, "zcanvas", Me)
	
	'create the view
	Dim foo As VMZView
	foo.Initialize(vm.vue, "foo", Me).SetText("Foo View")
	'
	Dim spot1 As VMZSpot
	spot1.initialize(vm.vue, "spot1", Me).SetSlotExtension.SetAngle(45).SetToView("bar").SetText("Bar")
	'
	foo.addspot(spot1)
	'
	Dim bar As VMZView
	bar.initialize(vm.Vue, "bar", Me).SetText("Bar View")
	
	'add the view to the project
	zc.AddView(foo)
	zc.AddView(bar)
	'
	'add canvas after adding views
	cont.AddComponent(1,1, zc.tostring)
	'
	vm.Container.AddComponent(1,1,cont.tostring)
	
End Sub
