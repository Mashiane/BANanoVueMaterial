B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Col As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
End Sub

'initialize the Col
Public Sub Initialize(v As BANanoVue, sid As String) As VMCol
	ID = sid.tolowercase
	Col.Initialize(v, ID)
	Col.SetTag("div").AddClass("md-layout-item")
	vue = v
	Return Me
End Sub

Sub AddElements(lst As List) As VMCol
	Col.AddElements(lst)
	Return Me
End Sub

Sub SetHidden(xsmall As Boolean, small As Boolean, medium As Boolean, large As Boolean, xlarge As Boolean) As VMCol
	Col.SetHidden(xsmall, small, medium, large, xlarge)
	Return Me
End Sub

Sub SetSizes(xsmall As Int, small As Int, medium As Int, large As Int, xlarge As Int) As VMCol
	Col.SetSizes(xsmall, small, medium, large, xlarge)
	Return Me
End Sub

Sub SetGutter(b As Boolean) As VMCol
	Col.SetGutter(True)
	Return Me
End Sub

'get component
Sub ToString As String
	Return Col.ToString
End Sub

Sub SetVModel(k As String) As VMCol
	Col.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCol
	Col.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCol
	Col.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCol
	Dim childHTML As String = child.ToString
	Col.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCol
	Col.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMCol
	Col.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMCol
	Col.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCol
	Col.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCol
	Col.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCol
	Col.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMCol
	Col.SetPaddingAll(p)
	Return Me
End Sub

