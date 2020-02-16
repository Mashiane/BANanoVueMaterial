B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public StepItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
End Sub

'initialize the StepItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMStepItem
	ID = sid.tolowercase
	StepItem.Initialize(v, ID)
	StepItem.SetTag("md-step")
	vue = v
	SetId(ID)
	module = eventHandler
	SetDoneSync(False)
	SetError(Null)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMStepItem
	StepItem.SetTabIndex(ti)
	Return Me
End Sub

Sub SetContent(content As String) As VMStepItem
	StepItem.SetText(content)
	Return Me
End Sub

'get component
Sub ToString As String
	Return StepItem.ToString
End Sub

Sub SetVModel(k As String) As VMStepItem
	StepItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMStepItem
	StepItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMStepItem
	StepItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMStepItem
	Dim childHTML As String = child.ToString
	StepItem.SetText(childHTML)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMStepItem
	StepItem.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMStepItem
	StepItem.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMStepItem
	StepItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMStepItem
	StepItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMStepItem
	StepItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMStepItem
	StepItem.SetPaddingAll(p)
	Return Me
End Sub

'The Step id. Used when changing the active Step dynamically
Sub SetId(varId As Object) As VMStepItem
	SetAttr(CreateMap("id": varId))
	Return Me
End Sub

'The Step href link. Useful when you don't have Vue Router on your app
Sub SetHref(varHref As Object) As VMStepItem
	SetAttr(CreateMap("href": varHref))
	Return Me
End Sub

'The Step label
Sub SetLabel(varLabel As String) As VMStepItem
	Dim lblx As String = $"${ID}label"$
	vue.SetStateSingle(lblx, varLabel)
	SetAttr(CreateMap("v-bind:md-label": lblx))
	Return Me
End Sub

private Sub SetDoneSync(b As Boolean) As VMStepItem
	Dim done As String = $"${ID}done"$
	vue.SetStateSingle(done, b)
	SetAttr(CreateMap(":md-done.sync":done))
	Return Me
End Sub

'The Step description. When a Step Is optional, use this prop To tell the user that
Sub SetDescription(varDescription As Object) As VMStepItem
	Dim dd As String = $"${ID}description"$
	vue.SetStateSingle(dd, varDescription)
	SetAttr(CreateMap(":md-description": dd))
	Return Me
End Sub

'The error message. When set, the stepper will automatically raise an error.
Sub SetError(varError As String) As VMStepItem
	Dim dd As String = $"${ID}error"$
	vue.SetStateSingle(dd, varError)
	SetAttr(CreateMap(":md-error": dd))
	Return Me
End Sub

'Make a Step editable Or non editable.
Sub SetEditable(varEditable As Boolean) As VMStepItem
	Dim dd As String = $"${ID}editable"$
	vue.SetStateSingle(dd, varEditable)
	SetAttr(CreateMap(":md-editable": dd))
	Return Me
End Sub

