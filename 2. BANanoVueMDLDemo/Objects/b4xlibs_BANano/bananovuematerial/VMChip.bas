B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Chip As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
End Sub

'initialize the Chip
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMChip
	ID = sid.tolowercase
	Chip.Initialize(v, ID)
	Chip.SetTag("md-chip")
	vue = v
	module = eventHandler
	Chip.SetOnClick(module, $"${ID}_click"$)
	SetOnDelete
	Return Me
End Sub

Sub SetLabel(labelText As String) As VMChip
	If labelText = "" Then Return Me
	Return Me
End Sub

'get component
Sub ToString As String
	Return Chip.ToString
End Sub

Sub SetVModel(k As String) As VMChip
	Chip.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMChip
	Chip.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMChip
	Chip.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMChip
	Dim childHTML As String = child.ToString
	Chip.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMChip
	If t = "" Then Return Me
	Chip.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMChip
	If b = False Then Return Me
	Chip.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMChip
	If b = False Then Return Me
	Chip.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMChip
	Chip.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMChip
	Chip.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMChip
	Chip.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMChip
	Chip.SetPaddingAll(p)
	Return Me
End Sub

'Enables/Disables the click action in the chip.
Sub SetClickable(varClickable As Boolean) As VMChip
	If varClickable = False Then Return Me
	SetAttr(CreateMap(":md-clickable": varClickable))
	Return Me
End Sub

'Creates a chip that can hold a delete action.
Sub SetDeletable(varDeletable As Boolean) As VMChip
	If varDeletable = False Then Return Me
	SetAttr(CreateMap(":md-deletable": varDeletable))
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMChip
	Chip.SetDisabled(b)
	Return Me
End Sub


'Triggered after a mouse click on delete icon of a chip.
private Sub SetOnDelete As VMChip
	Dim methodName As String  = $"${ID}_delete"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:md-delete": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOptions(sourceName As String, options As Map, sourcefield As String, displayfield As String) As VMChip
	sourceName = sourceName.tolowercase
	Dim recs As List
	recs.Initialize
	For Each k As String In options.Keys
		Dim v As String = options.Get(k)
		Dim nrec As Map = CreateMap()
		nrec.Put(sourcefield, k)
		nrec.Put(displayfield, v)
		recs.Add(nrec)
	Next
	'save the options
	vue.SetStateSingle(sourceName, recs)
	Dim kRow As String = $"row.${sourcefield}"$
	Dim dRow As String = $"row.${displayfield}"$
	Chip.clear
	Chip.SetVFor("row", sourceName)
	Chip.SetID($"${kRow}"$,True)
	Chip.SetKey($"${kRow}"$,True)
	Chip.SetText($"{{ ${dRow} }}"$)
	Return Me
End Sub

Sub SetKey(k As String) As VMChip
	Chip.SetKey(k, False)
	Return Me
End Sub


Sub SetDataSource(sourceTable As String, sourceField As String, displayField As String) As VMChip
	sourceTable = sourceTable.ToLowerCase
	sourceField = sourceField.ToLowerCase
	displayField = displayField.tolowercase
	'
	Dim intSel As Int = 0
	If sourceTable <> "" Then intSel = BANano.parseInt(intSel) + 1
	If sourceField <> "" Then intSel = BANano.parseInt(intSel) + 1
	If displayField <> "" Then intSel = BANano.parseInt(intSel) + 1
	'
	If intSel = 3 Then
		Dim kRow As String = $"row.${sourceField}"$
		Dim dRow As String = $"row.${displayField}"$
		Chip.clear
		Chip.SetVFor("row", sourceTable)
		Chip.SetID($"${kRow}"$,True)
		Chip.SetKey($"${kRow}"$,True)
		Chip.SetText($"{{ ${dRow} }}"$)
	End If
	Return Me
End Sub



Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

