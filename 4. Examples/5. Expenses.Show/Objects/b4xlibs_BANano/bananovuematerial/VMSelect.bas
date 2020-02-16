B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private Combo As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private ComboInt As VMField
	Private lbl As VMLabel
	Private hasHelp As Boolean
	Private ht As VMElement
	Private et As VMElement
	Private BANano As BANano   'ignore
	Private hasError As Boolean
	Private xname As String
	Private xmodel As String
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSelect
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Combo.Initialize(vue, ID).SetTag("md-select")
	ComboInt.Initialize(v, ID, $"${ID}field"$, module)
	lbl.Initialize(vue, $"${sid}label"$)
	SetName(sid)
	hasHelp = False
	hasError = False
	xname = ""
	xmodel = ""
	Dim sval As String
	SetOnSelected(sval)
	SetOnOpened
	SetOnClosed
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSelect
	Combo.SetTabIndex(ti)
	Return Me
End Sub


'add a class
Sub AddClass(c As String) As VMSelect
	Combo.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSelect
	Combo.SetAttr(attr)
	Return Me
End Sub


Sub SetVModel(k As String) As VMSelect
	k = k.ToLowerCase
	xmodel = k
	Combo.SetVModel(k)
	Return Me
End Sub

Sub SetLabel(l As Object) As VMSelect
	lbl.SetText(l)
	Return Me
End Sub

Sub AddItems(m As Map) As VMSelect
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		AddItem(k, v)
	Next
	Return Me
End Sub

Sub AddItem(k As String, v As String) As VMSelect
	Dim el As VMElement
	el.Initialize(vue,k).SetTag("md-option").SetName(k,False).SetKey(k,False).SetValue(k,False).SetText(v)
	el.Pop(Combo) 
	Return Me
End Sub

Sub AddItem1(k As String, v As String,disabled As Boolean) As VMSelect
	Dim el As VMElement
	el.Initialize(vue,k).SetTag("md-option").SetName(k,False).SetKey(k,False).SetValue(k,False).SetText(v).SetDisabled(disabled)
	el.Pop(Combo) 
	Return Me
End Sub

Sub SetOptions(sourceName As String, options As Map, sourcefield As String, displayfield As String)
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
	'
	Dim option As VMElement
	option.Initialize(vue,"")
	option.SetTag("md-option")
	option.SetVFor("row", sourceName)
	option.SetID($"${kRow}"$,True)
	option.SetKey($"${kRow}"$,True)
	option.SetValue($"${kRow}"$,True)
	option.SetName($"${kRow}"$,True)
	option.SetText($"{{ ${dRow} }}"$)
	option.RemoveAttr(":required")
	option.RemoveAttr(":disabled")
	option.RemoveAttr("v-show")
	option.Pop(Combo)
End Sub

'use an existing state
Sub SetDataSource(sourceTable As String, sourceField As String, displayField As String)
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
		Dim option As VMElement
		option.Initialize(vue,"")
		option.SetTag("md-option")
		option.SetVFor("row", sourceTable)
		option.SetID($"${kRow}"$,True)
		option.SetKey($"${kRow}"$,True)
		option.SetValue($"${kRow}"$,True)
		option.SetName($"${kRow}"$,True)
		option.SetText($"{{ ${dRow} }}"$)
		option.RemoveAttr(":required")
		option.RemoveAttr(":disabled")
		option.RemoveAttr("v-show")
		option.Pop(Combo)
	End If
End Sub


Sub SetHelperText(t As String) As VMSelect
	If t = "" Then Return Me
	hasHelp = True
	ht = Combo.SetHelperText(t)
	Return Me
End Sub

Sub SetErrorText(txt As String) As VMSelect
	If txt = "" Then Return Me
	hasError = True
	et = Combo.SetErrorText(txt)
	Return Me
End Sub

Sub ToString As String
	If xname = "" Then
		Log($"VMSelect.ToString.${ID} - name is not set!"$)
	End If
	If xmodel = "" Then
		Log($"VMSelect.ToString.${ID} - model is not set!"$)
	End If
	lbl.Pop(ComboInt.Field)
	Combo.Pop(ComboInt.Field)
	If hasHelp Then
		ht.Pop(ComboInt.Field)
	End If
	If hasError Then
		et.Pop(ComboInt.Field)
	End If
	Return ComboInt.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub SetVIf(vif As String) As VMSelect
	If vif = "" Then Return Me
	ComboInt.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMSelect
	If vif = "" Then Return Me
	ComboInt.SetVShow(vif)
	Return Me
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSelect
Dim childHTML As String = child.ToString
	Combo.SetText(childHTML)
Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSelect
	Combo.SetText(t)
Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMSelect
	Combo.SetPrimary(True)
Return Me
End Sub

Sub SetAccent(b As Boolean) As VMSelect
	Combo.SetAccent(True)
Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSelect
	Combo.SetStyle(sm)
Return Me
End Sub

'add children
Sub AddChildren(children As List)
For Each childx As VMElement In children
AddChild(childx)
Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMSelect
	Combo.SetPaddingAll(p)
Return Me
End Sub

'The Select placeholder. Similar To HTML5 placeholder attribute.
Sub SetPlaceholder(varPlaceholder As String) As VMSelect
	If varPlaceholder = "" Then Return Me
	SetAttr(CreateMap("placeholder": varPlaceholder))
	Return Me
End Sub

'The input required. Similar To HTML5 required attribute.
Sub SetRequired(varRequired As Boolean) As VMSelect
	Combo.SetRequired(varRequired)
	Return Me
End Sub

Sub SetValue(valx As String) As VMSelect
	If xmodel = "" Then
		Log($"VMSelect.SetValue.${ID} - vmodel is not set!"$)
	End If
	vue.SetStateSingle(xmodel, valx)
	Return Me
End Sub


Sub SetDisabled(b As Boolean) As VMSelect
	Combo.SetDisabled(b)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
private Sub SetName(varName As String) As VMSelect
	varName = varName.tolowercase
	xname = varName
	Combo.SetName(varName, False)
Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetID(varName As Object, bind As Boolean) As VMSelect
	Combo.SetID(varName, bind)
Return Me
End Sub

'Create a multi selection with checkboxes inside. Only works with a v-model with an Array
Sub SetMultiple(varMultiple As Boolean) As VMSelect
	If varMultiple = False Then Return Me
	If xmodel = "" Then
		Log($"VMSelect.SetMultiple.${ID} - vmodel is not set!"$)
	End If
	Dim nList As List
	nList.Initialize
	vue.SetStateSingle(xmodel, nList) 
	SetAttr(CreateMap(":multiple": varMultiple))
	Return Me
End Sub

'Enable the dense layout
Sub SetDense(varDense As Boolean) As VMSelect
	If varDense = False Then Return Me
	If varDense Then SetAttr(CreateMap(":md-dense": varDense))
Return Me
End Sub

'Triggered when model changes.	Value of v-model
private Sub SetOnSelected(value As String) As VMSelect
Dim methodName As String  = $"${ID}_change"$
	If SubExists(module, methodName) = False Then Return Me
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(value))
SetAttr(CreateMap("v-on:md-selected": methodName))
'add to methods
	vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'Triggered when Select Is opened.
private Sub SetOnOpened As VMSelect
Dim methodName As String = $"${ID}_opened"$
	If SubExists(module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
SetAttr(CreateMap("v-on:md-opened": methodName))
'add to methods
	vue.SetCallBack(methodName, cb)
		Return Me
End Sub

'Triggered when Select Is closed.
private Sub SetOnClosed As VMSelect
Dim methodName As String  = $"${ID}_closed"$
	If SubExists(module, methodName) = False Then Return Me
Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
SetAttr(CreateMap("v-on:md-closed": methodName))
'add to methods
	vue.SetCallBack(methodName, cb)
		Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

