B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TR As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Public HasContent As Boolean
End Sub

'initialize the TR
Public Sub Initialize(v As BANanoVue, sid As String, parentID As String) As VMTR
	ID = sid.tolowercase
	TR.Initialize(v, ID)
	TR.SetTag("md-table-row")
	vue = v
	HasContent = False
	SetSlot("md-table-row")
	SetSlotScope("{ item }")
	TR.RemoveAttr(":required")
	TR.RemoveAttr(":disabled")
	TR.RemoveAttr("v-show")
	TR.RemoveAttr("ref")
	TR.RemoveAttr("id")
	Return Me
End Sub

Sub SetSelectable(sel As String) As VMTR
	Dim pp As String = $"${ID}selectable"$
	vue.SetStateSingle(pp, sel)
	SetAttr(CreateMap(":md-selectable":pp))
	Return Me
End Sub

Sub SetSelectableSingle(b As Boolean) As VMTR
	If b = False Then Return Me
	SetSelectable("single")
	Return Me
End Sub

Sub SetSelectableMultiple(b As Boolean) As VMTR
	If b = False Then Return Me
	SetSelectable("multiple")
	Return Me
End Sub

Sub SetAutoSelect(b As Boolean) As VMTR
	Dim pp As String = $"${ID}autoselect"$
	vue.SetStateSingle(pp, b)
	If b Then SetAttr(CreateMap(":md-auto-select":pp))
	Return Me
End Sub

Sub SetSlot(s As String) As VMTR
	SetAttr(CreateMap("slot":s))
	Return Me
End Sub

Sub SetSlotTableRow(b As Boolean) As VMTR
	If b Then SetSlot("md-table-row")
	Return Me
End Sub

Sub SetSlotScope(sc As String) As VMTR
	SetAttr(CreateMap("slot-scope": sc))
	Return Me
End Sub

'get component
Sub ToString As String
	TR.RemoveAttr("v-show")
	Return TR.ToString
End Sub

Sub SetVModel(k As String) As VMTR
	TR.SetVModel(k)
	HasContent = True
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTR
	TR.SetVIf(vif)
	HasContent = True
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTR
	TR.SetVShow(vif)
	HasContent = True
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTR
	Dim childHTML As String = child.ToString
	TR.SetText(childHTML)
	HasContent = True
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTR
	TR.SetText(t)
	HasContent = True
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMTR
	TR.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMTR
	TR.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTR
	TR.AddClass(c)
	HasContent = True
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTR
	TR.SetAttr(attr)
	HasContent = True
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTR
	TR.SetStyle(sm)
	HasContent = True
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
	HasContent = True
End Sub

'set padding
Sub SetPadding(p As Object) As VMTR
	TR.SetPaddingAll(p)
	Return Me
End Sub

