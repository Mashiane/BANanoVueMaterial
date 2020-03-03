B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=StaticCode
Version=8.1
@EndOfDesignText@
'Static code module
Sub Process_Globals
	Private vm As BANanoVM
	Public Name As String = "zoomCode"
	Public Title As String = "ZoomUX"
	Private BANano As BANano  'ignore
End Sub

Sub Code
	vm = pgIndex.vm
	'create the canvas for zircle
	Dim zc As VMZCanvas
	zc.initialize(vm.Vue, Name, Me)
	zc.Show
	
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
	vm.AddHTML(zc.tostring)
End Sub
