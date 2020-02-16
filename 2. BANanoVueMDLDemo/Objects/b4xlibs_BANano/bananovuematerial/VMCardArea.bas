B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CardArea As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
End Sub

'initialize the CardArea
Public Sub Initialize(v As BANanoVue, sid As String) As VMCardArea
	ID = sid.tolowercase
	CardArea.Initialize(v, ID)
	CardArea.SetTag("md-card-area")
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return CardArea.ToString
End Sub

Sub SetVModel(k As String) As VMCardArea
	CardArea.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCardArea
	CardArea.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCardArea
	CardArea.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCardArea
	Dim childHTML As String = child.ToString
	CardArea.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCardArea
	CardArea.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCardArea
	CardArea.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCardArea
	CardArea.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCardArea
	CardArea.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMCardArea
	CardArea.SetPaddingAll(p)
	Return Me
End Sub

'Applies inset border
Sub SetInset(varInset As Boolean) As VMCardArea
	SetAttr(CreateMap(":md-inset": varInset))
	Return Me
End Sub

