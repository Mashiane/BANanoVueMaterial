B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Field As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
	Private errKey As String
End Sub

'initialize the Field
Public Sub Initialize(v As BANanoVue, parentID As String, sid As String, eventHandler As Object) As VMField
	ID = sid.tolowercase
	Field.Initialize(v, ID)
	Field.SetTag("md-field")
	vue = v
	module = eventHandler
	Field.SetOnClear(module, $"${ID}_clear"$)
	errKey = $"${parentID}error"$
	vue.SetStateSingle(errKey, False)
	Field.SetAttr(CreateMap(":class":errKey & "class"))
	vue.SetComputed(errKey & "class", Me, "FieldError")
	Return Me
End Sub

Sub SetMaxWidth(mw As String) As VMField
	Field.SetMaxWidth(mw)
	Return Me
End Sub

private Sub FieldError As Object
	Dim errModel As Boolean = vue.GetState(errKey, False)
	Dim obj As Map = CreateMap()
	obj.Put("md-invalid", errModel)
	Return obj
End Sub


'get component
Sub ToString As String
	Return Field.ToString
End Sub

Sub SetVModel(k As String) As VMField
	Field.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMField
	Field.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMField
	Field.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMField
	Dim childHTML As String = child.ToString
	Field.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMField
	Field.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMField
	Field.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMField
	Field.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMField
	Field.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMField
	Field.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMField
	Field.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMField
	Field.SetPaddingAll(p)
	Return Me
End Sub

'Make the label inline. This means that the label will disappear when the input receives a focus.
Sub SetInline(varInline As Boolean) As VMField
	SetAttr(CreateMap(":md-inline": varInline))
	Return Me
End Sub

'Enable the character counter.
Sub SetCounter(varCounter As Boolean) As VMField
	SetAttr(CreateMap(":md-counter": varCounter))
	Return Me
End Sub

'Add a clear button on the right of the input.
Sub SetClearable(varClearable As Boolean) As VMField
	SetAttr(CreateMap(":md-clearable": varClearable))
	Return Me
End Sub

'Toggle password
Sub SetTogglePassword(varTogglePassword As Boolean) As VMField
	SetAttr(CreateMap(":md-toggle-password": varTogglePassword))
	Return Me
End Sub

'Sub SetAutoFocus(auto As String) As VMField
	'SetAttr(CreateMap(":autofocus": auto))
	'AddClass("md-focused")
'	Return Me
'End Sub


