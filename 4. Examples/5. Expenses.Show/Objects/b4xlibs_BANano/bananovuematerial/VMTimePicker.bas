B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private TimePicker As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private TimePickerInt As VMField
	Private lbl As VMLabel
	Private hasHelp As Boolean
	Private ht As VMElement
	Private et As VMElement
	Private BANano As BANano   'ignore
	Private hasError As Boolean
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTimePicker
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	TimePicker.Initialize(vue, ID).SetTag("md-select")
	TimePickerInt.Initialize(v,ID,$"${ID}field"$,module)
	lbl.Initialize(vue, $"${ID}label"$)
	hasHelp = False
	hasError = False
	SetTimes
	Dim sval As String
	SetOnSelected(sval)
	SetOnOpened
	SetOnClosed
	Return Me
End Sub

private Sub SetTimes
	Dim times As List
	times.Initialize
	times.AddAll(Array("12:00","12:30","01:00","01:30","02:00","02:30","03:00","03:30","04:00","04:30","05:00","05:30","06:00"))
	times.AddAll(Array("06:30","07:00","07:30","08:00","08:30","09:00","09:30","10:00","10:30","11:00","11:30","13:00","13:30"))
	times.AddAll(Array("14:00","14:30","15:00","15:30","16:00","16:30","17:00","17:30","18:00","18:30","19:00","19:30","20:00"))
	times.AddAll(Array("20:30","21:00","21:30","22:00","22:30","23:00","23:30","00:00","00:30",""))
	times.Sort(True)
	SetOptions($"${ID}_times"$, times, "id", "text")
End Sub

Sub SetTabIndex(ti As String) As VMTimePicker
	TimePicker.SetTabIndex(ti)
	Return Me
End Sub


'add a class
Sub AddClass(c As String) As VMTimePicker
	TimePicker.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTimePicker
	TimePicker.SetAttr(attr)
	Return Me
End Sub

Sub SetVModel(k As String) As VMTimePicker
	TimePicker.SetVModel(k)
	Return Me
End Sub

Sub SetLabel(l As Object) As VMTimePicker
	lbl.SetText(l)
	Return Me
End Sub

private Sub SetOptions(sourceName As String, options As List, sourcefield As String, displayfield As String)
	sourceName = sourceName.tolowercase
	Dim recs As List
	recs.Initialize
	For Each k As String In options
		Dim nrec As Map = CreateMap()
		nrec.Put(sourcefield, k)
		nrec.Put(displayfield, k)
		recs.Add(nrec)
	Next
	'save the options
	vue.SetStateSingle(sourceName, recs)
	Dim kRow As String = $"row.${sourcefield}"$
	Dim dRow As String = $"row.${displayfield}"$
	Dim option As VMElement
	option.Initialize(vue,"")
	option.SetTag("md-option")
	option.SetVFor("row", sourceName)
	option.SetID($"${kRow}"$,True)
	option.SetKey($"${kRow}"$,True)
	option.SetValue($"${kRow}"$,True)
	option.SetName($"${kRow}"$,True)
	option.SetText($"{{ ${dRow} }}"$)
	option.Pop(TimePicker)
End Sub


Sub SetHelperText(t As String) As VMTimePicker
	If t = "" Then Return Me
	hasHelp = True
	ht = TimePicker.SetHelperText(t)
	Return Me
End Sub

Sub SetErrorText(txt As String) As VMTimePicker
	If txt = "" Then Return Me
	hasError = True
	et = TimePicker.SetErrorText(txt)
	Return Me
End Sub

Sub ToString As String
	lbl.Pop(TimePickerInt.Field)
	TimePicker.Pop(TimePickerInt.Field)
	If hasHelp Then
		ht.Pop(TimePickerInt.Field)
	End If
	If hasError Then
		et.Pop(TimePickerInt.Field)
	End If
	Return TimePickerInt.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub SetVIf(vif As String) As VMTimePicker
	If vif = "" Then Return Me
	TimePickerInt.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTimePicker
	If vif = "" Then Return Me
	TimePickerInt.SetVShow(vif)
	Return Me
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTimePicker
	Dim childHTML As String = child.ToString
	TimePicker.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTimePicker
	TimePicker.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMTimePicker
	TimePicker.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMTimePicker
	TimePicker.SetAccent(True)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTimePicker
	TimePicker.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMTimePicker
	TimePicker.SetPaddingAll(p)
	Return Me
End Sub

'The Select placeholder. Similar To HTML5 placeholder attribute.
Sub SetPlaceholder(varPlaceholder As String) As VMTimePicker
	If varPlaceholder = "" Then Return Me
	SetAttr(CreateMap("placeholder": varPlaceholder))
	Return Me
End Sub

'The input required. Similar To HTML5 required attribute.
Sub SetRequired(varRequired As Boolean) As VMTimePicker
	TimePicker.SetRequired(varRequired)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMTimePicker
	TimePicker.SetName(varName, bind)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetID(varName As Object, bind As Boolean) As VMTimePicker
	TimePicker.SetID(varName, bind)
	Return Me
End Sub


Sub SetDisabled(b As Boolean) As VMTimePicker
	TimePicker.setdisabled(b)
	Return Me
End Sub

'Create a multi selection with checkboxes inside. Only works with a v-model with an Array
Sub SetMultiple(varMultiple As Boolean) As VMTimePicker
	If varMultiple = False Then Return Me
	SetAttr(CreateMap(":multiple": varMultiple))
	Return Me
End Sub

'Enable the dense layout
Sub SetDense(varDense As Boolean) As VMTimePicker
	If varDense = False Then Return Me
	If varDense Then SetAttr(CreateMap(":md-dense": varDense))
	Return Me
End Sub

'Triggered when model changes.	Value of v-model
private Sub SetOnSelected(value As String) As VMTimePicker
	Dim methodName As String = $"${ID}_change"$
	If SubExists(module, methodName) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(value))
	SetAttr(CreateMap("v-on:md-selected": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when Select Is opened.
private Sub SetOnOpened As VMTimePicker
	Dim methodName As String  = $"${ID}_opened"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:md-opened": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when Select Is closed.
Sub SetOnClosed As VMTimePicker
	Dim methodName As String = $"${ID}_closed"$
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
