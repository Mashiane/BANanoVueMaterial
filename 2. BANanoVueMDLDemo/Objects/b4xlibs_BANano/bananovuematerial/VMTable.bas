B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Table As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Public ToolBar As VMToolBar
	Private module As Object
	Private tblRow As VMTR
End Sub

'initialize the Table
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTable
	ID = sid.tolowercase
	Table.Initialize(v, ID)
	Table.SetTag("md-table")
	vue = v
	module = eventHandler
	SetOnSelected
	
	ToolBar.Initialize(vue, $"${ID}table"$, eventHandler).SetTableToolbar(True)
	tblRow.Initialize(vue, $"${ID}row"$, ID)
	Table.RemoveAttr(":required")
	Table.RemoveAttr(":disabled")
	Table.RemoveAttr("id")
	Table.RemoveAttr("ref")
	Dim pp As String = $"${ID}selection"$
	vue.SetStateSingle(pp, Null)
	Return Me
End Sub

'can select single row
Sub SetSelectableSingle(b As Boolean) As VMTable
	tblRow.SetSelectableSingle(b)
	Return Me
End Sub

'can select multiple rows
Sub SetSelectableMultiple(b As Boolean) As VMTable
	tblRow.SetSelectableMultiple(b)
	Return Me
End Sub

Sub SetAutoSelect(b As Boolean) As VMTable
	tblRow.SetAutoSelect(b)
	Return Me
End Sub


Sub SetElevation(e As Int) As VMTable
	Table.SetElevation(e)
	Return Me
End Sub

Sub AddColumn(colID As String, colLabel As String, colNumeric As Boolean, colVisible As Boolean)
	Dim tc As VMTD
	tc.Initialize(vue, colID).SetLabel(colLabel).SetSortBy(colID).SetNumeric(colNumeric).SetText($"{{ item.${colID} }}"$)
	tc.SetVShow(colVisible)
	tc.Pop(tblRow.TR) 
End Sub

'get component
Sub ToString As String
	If ToolBar.HasContent Then
		ToolBar.Pop(Table)
	End If
	If tblRow.hascontent Then
		tblRow.Pop(Table)
	End If
	Return Table.ToString
End Sub

Sub SetFixedHeaders(b As Boolean) As VMTable
	If b Then SetAttr(CreateMap("md-fixed-header":"true"))
	Return Me
End Sub

Sub SetSort(columnName As String) As VMTable
	SetAttr(CreateMap("md-sort":columnName))
	Return Me
End Sub

Sub SetCard(b As Boolean) As VMTable
	If b Then SetAttr(CreateMap("md-card": True))
	Return Me
End Sub

Sub SetVModel(k As String) As VMTable
	Table.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTable
	Table.SetVIf(vif)
	Return Me
End Sub

Sub SetSortOrderAsc(b As Boolean) As VMTable
	If b Then SetAttr(CreateMap("md-sort-order":"asc"))
	Return Me
End Sub

Sub SetSortOrderDesc(b As Boolean) As VMTable
	If b Then SetAttr(CreateMap("md-sort-order":"desc"))
	Return Me
End Sub

private Sub SetOnSelected As VMTable
	Dim items As List
	Dim methodName As String = $"${ID}_select"$
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(items))
	SetAttr(CreateMap("@md-selected": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTable
	Table.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTable
	Dim childHTML As String = child.ToString
	Table.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTable
	Table.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMTable
	If b Then Table.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMTable
	If b Then Table.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTable
	Table.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTable
	Table.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTable
	Table.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMTable
	Table.SetPaddingAll(p)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

