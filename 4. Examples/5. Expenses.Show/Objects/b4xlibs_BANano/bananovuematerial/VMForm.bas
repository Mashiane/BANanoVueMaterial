B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Form As VMElement
	Public ID As String
	Private vue As BANanoVue
	Public Container As VMContainer
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMForm
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Form.Initialize(vue, ID).SetTag("form")
	Container.Initialize(vue, sid & "grid", eventHandler) 
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMForm
	Form.AddClass(c)
	Return Me
End Sub

Sub SetNoValidate(b As Boolean) As VMForm
	SetAttr(CreateMap(":novalidate": b))
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMForm
	Form.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	Form.SetText(Container.ToString)
	Return Form.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub