B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TH As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
End Sub

'initialize the TH
Public Sub Initialize(v As BANanoVue, sid As String) As VMTH
	ID = sid.tolowercase
	TH.Initialize(v, ID)
	TH.SetTag("md-table-head")
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return TH.ToString
End Sub

Sub SetVModel(k As String) As VMTH
	TH.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTH
	TH.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTH
	TH.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTH
	Dim childHTML As String = child.ToString
	TH.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTH
	TH.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMTH
	TH.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMTH
	TH.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTH
	TH.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTH
	TH.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTH
	TH.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMTH
	TH.SetPaddingAll(p)
	Return Me
End Sub

