B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TD As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
End Sub

'initialize the TD
Public Sub Initialize(v As BANanoVue, sid As String) As VMTD
	ID = sid.tolowercase
	TD.Initialize(v, ID)
	TD.SetTag("md-table-cell")
	vue = v
	TD.RemoveAttr(":required")
	TD.RemoveAttr(":disabled")
	TD.RemoveAttr("v-show")
	TD.RemoveAttr("ref")
	TD.RemoveAttr("id")
	Return Me
End Sub

'get component
Sub ToString As String
	TD.RemoveAttr("v-show")
	Return TD.ToString
End Sub

Sub SetVisible(b As Boolean) As VMTD
	TD.SetVisible(b)
	Return Me
End Sub

Sub SetNumeric(b As Boolean) As VMTD
	If b Then
		SetAttr(CreateMap("md-numeric":"true"))
	End If
	Return Me
End Sub

Sub SetSortBy(i As String) As VMTD
	SetAttr(CreateMap("md-sort-by":i))
	Return Me
End Sub

Sub SetLabel(l As String) As VMTD
	SetAttr(CreateMap("md-label":l))
	Return Me
End Sub

Sub SetVModel(k As String) As VMTD
	TD.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTD
	TD.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Boolean) As VMTD
	Dim colShow As String = $"${ID}show"$
	vue.SetStateSingle(colShow, vif)
	TD.SetVShow(colShow)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTD
	Dim childHTML As String = child.ToString
	TD.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTD
	TD.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMTD
	TD.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMTD
	TD.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTD
	TD.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTD
	TD.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTD
	TD.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMTD
	TD.SetPaddingAll(p)
	Return Me
End Sub

