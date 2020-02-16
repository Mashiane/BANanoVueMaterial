B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Row As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
End Sub

'initialize the Row
Public Sub Initialize(v As BANanoVue, sid As String) As VMRow
	ID = sid.tolowercase
	Row.Initialize(v, ID)
	Row.SetTag("div").AddClass("md-layout")
	vue = v
	Return Me
End Sub

'add break
Sub AddBR
	SetText("<br>")
End Sub

'add hr
Sub AddHR
	SetText("<hr>")
End Sub

Sub AddElements(lst As List) As VMRow
	Row.AddElements(lst)
	Return Me
End Sub

Sub SetGutter(b As Boolean) As VMRow
	Row.SetGutter(True)
	Return Me
End Sub

Sub SetNoWrap(b As Boolean) As VMRow
	If b Then Row.AddClass("md-layout-nowrap")
	Return Me
End Sub

Sub SetAlignment(a As String) As VMRow
	Row.AddClass(a)
	Return Me
End Sub

Sub SetAlignmentTopCenter(b As Boolean) As VMRow
	SetAlignment("md-alignment-top-center")
	Return Me
End Sub

Sub SetAlignmentTopLeft(b As Boolean) As VMRow
	SetAlignment("md-alignment-top-left")
	Return Me
End Sub

'get component
Sub ToString As String
	Return Row.ToString
End Sub

Sub SetVModel(k As String) As VMRow
	Row.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMRow
	Row.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMRow
	Row.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMRow
	Dim childHTML As String = child.ToString
	Row.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMRow
	Row.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMRow
	Row.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMRow
	Row.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMRow
	Row.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRow
	Row.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMRow
	Row.SetStyle(sm)
	Return Me
End Sub

Sub SetHidden(xsmall As Boolean, small As Boolean, medium As Boolean, large As Boolean, xlarge As Boolean) As VMRow
	Row.SetHidden(xsmall, small, medium, large, xlarge)
	Return Me
End Sub

Sub SetSizes(xsmall As Int, small As Int, medium As Int, large As Int, xlarge As Int) As VMRow
	Row.SetSizes(xsmall, small, medium, large, xlarge)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMRow
	Row.SetPaddingAll(p)
	Return Me
End Sub

