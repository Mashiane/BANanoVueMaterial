B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public MenuItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
End Sub

'initialize the MenuItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMMenuItem
	ID = sid.tolowercase
	MenuItem.Initialize(v, ID)
	MenuItem.SetTag("md-menu-item")
	module = eventHandler
	MenuItem.SetOnClick(module, $"${ID}_click"$)
	vue = v
	Return Me
End Sub

Sub SetKey(k As Object, bind As Boolean) As VMMenuItem
	MenuItem.SetKey(k, bind)
	Return Me
End Sub

Sub SetID(n As String, bind As Boolean) As VMMenuItem
	MenuItem.SetID(n, bind)
	Return Me
End Sub

'get component
Sub ToString As String
	Return MenuItem.ToString
End Sub

Sub SetVModel(k As String) As VMMenuItem
	MenuItem.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMMenuItem
	MenuItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMMenuItem
	MenuItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMMenuItem
	Dim childHTML As String = child.ToString
	MenuItem.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMMenuItem
	MenuItem.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMMenuItem
	MenuItem.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMMenuItem
	MenuItem.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMMenuItem
	MenuItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMMenuItem
	MenuItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMMenuItem
	MenuItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMMenuItem
	MenuItem.SetPaddingAll(p)
	Return Me
End Sub

