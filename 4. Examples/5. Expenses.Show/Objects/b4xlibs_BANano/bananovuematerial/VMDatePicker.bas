B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public DatePicker As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private lbl As VMLabel
	Private ht As VMElement	
	Private hasHelp As Boolean
	Private DateInt As VMElement
	Private BANano As BANano  'ignore
	Private hasError As Boolean
	Private he As VMElement
	Private xmodel As String
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDatePicker
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	DatePicker.Initialize(vue, ID).SetTag("md-datepicker")
	lbl.Initialize(vue,$"${ID}lbl"$) 
	hasHelp = False
	hasError = False
	DateInt.Initialize(v,$"${sid}parent"$).SetTag("div")
	SetOnOpened
	SetOnClosed
	Return Me
End Sub

'The input required. Similar To HTML5 required attribute.
Sub SetRequired(varRequired As Boolean) As VMDatePicker
	DatePicker.SetRequired(varRequired)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMDatePicker
	DatePicker.SetDisabled(b)
	Return Me
End Sub

'set on opened
private Sub SetOnOpened As VMDatePicker
	Dim methodName As String  = $"${ID}_opened"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:md-opened": methodName))
	'add to methods
	'vue.ToYYYYMMDD(xmodel)
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'set on closed
private Sub SetOnClosed As VMDatePicker
	Dim methodName As String = $"${ID}_closed"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:md-closed": methodName))
	'add to methods
	'vue.ToYYYYMMDD(xmodel)
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub SetTabIndex(ti As String) As VMDatePicker
	DatePicker.SetTabIndex(ti)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMDatePicker
	If vif = "" Then Return Me
	DatePicker.SetVShow(vif)
	Return Me
End Sub

Sub SetVIf(vshow As String) As VMDatePicker
	If vshow = "" Then Return Me
	DatePicker.SetVif(vshow)
	Return Me
End Sub


'Add a clear button on the right of the input.
Sub SetClearable(varClearable As Boolean) As VMDatePicker
	If varClearable Then DatePicker.SetAttr(CreateMap(":md-clearable": varClearable))
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMDatePicker
	DatePicker.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDatePicker
	DatePicker.SetAttr(attr)
	Return Me
End Sub


Sub SetHelperText(t As String) As VMDatePicker
	If t = "" Then Return Me
	hasHelp = True
	ht = DatePicker.SetHelperText(t)
	Return Me
End Sub


Sub SetErrorText(t As String) As VMDatePicker
	If t = "" Then Return Me
	hasError = True
	he = DatePicker.SetErrorText(t)
	Return Me
End Sub

Sub SetImmediately(b As Boolean) As VMDatePicker
	If b = False Then Return Me
	DatePicker.SetAttr(CreateMap(":md-immediately": b))
	Return Me
End Sub

Sub SetOpenOnFocus(b As Boolean) As VMDatePicker
	If b = False Then Return Me
	DatePicker.SetAttr(CreateMap(":md-open-on-focus": b))
	Return Me
End Sub

Sub SetOverrideNative(b As Boolean) As VMDatePicker
	If b = False Then Return Me
	DatePicker.SetAttr(CreateMap(":md-override-native": b))
	Return Me
End Sub

Sub SetDebounce(b As Boolean) As VMDatePicker
	If b = False Then Return Me
	DatePicker.SetAttr(CreateMap("md-debounce": b))
	Return Me
End Sub

Sub SetVModel(k As String) As VMDatePicker
	If k = "" Then Return Me
	DatePicker.SetVModel(k)
	xmodel = k
	Return Me
End Sub

Sub SetLabel(t As String) As VMDatePicker
	If t = "" Then Return Me
	lbl.SetText(t)
	Return Me
End Sub

'The input name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMDatePicker
	DatePicker.SetName(varName, bind)
	Return Me
End Sub

Sub ToString As String
	lbl.Pop(DatePicker)
	DatePicker.Pop(DateInt)
'	If hasHelp Then
'		ht.Pop(DateInt)
'	End If
'	If hasError Then
'		he.Pop(DateInt)
'	End If
	Return DateInt.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub