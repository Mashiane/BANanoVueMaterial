B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Input As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private InputInt As VMField
	Private lbl As VMLabel
	Private hasHelp As Boolean
	Private ht As VMElement
	Private hasError As Boolean
	Private icon1 As VMIcon
	Private icon2 As VMIcon
	Private suffix As VMElement
	Private prefix As VMElement
	Private hasSuffix As Boolean
	Private hasPrefix As Boolean
	Private he As VMElement
	Private module As Object
End Sub

'initialize the Input
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMInput
	ID = sid.tolowercase
	Input.Initialize(v, ID)
	Input.SetTag("md-input")
	module = eventHandler
	vue = v
	InputInt.Initialize(v,ID, $"${ID}field"$,module)
	lbl.Initialize(vue, $"${ID}label"$)
	hasHelp = False
	hasError = False
	icon1.Initialize(vue,$"${ID}icon1"$)
	icon2.Initialize(vue,$"${ID}icon2"$)  
	prefix.Initialize(vue,$"${ID}prefix"$).AddClass("md-prefix").SetTag("span")
	suffix.Initialize(vue,$"${ID}suffix"$).AddClass("md-suffix").SetTag("span")
	hasPrefix = False
	hasSuffix = False
	SetOnInput
	Return Me
End Sub

private Sub SetOnInput As VMInput
	Dim oninput As String = $"${ID}_input"$
	If SubExists(module, oninput) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, oninput, Array(e))
	SetAttr(CreateMap("@input":oninput))
	vue.SetCallBack(oninput, cb)
	Return Me
End Sub

Sub SetAutoComplete(auto As String) As VMInput
	Input.SetAutoComplete(auto)
	Return Me
End Sub

Sub SetPrefix(p As String) As VMInput
	If p = "" Then Return Me
	hasPrefix = True
	prefix.SetText(p)
	Return Me
End Sub

Sub SetSuffix(s As String) As VMInput
	If s = "" Then Return Me
	hasSuffix = True
	suffix.SetText(s)
	Return Me
End Sub

'set first icon
Sub SetIcon(strIcon As String) As VMInput
	If strIcon = "" Then Return Me
	icon1.SetText(strIcon)
	Return Me
End Sub

'set second icon
Sub SetIcon1(strIcon As String) As VMInput
	If strIcon = "" Then Return Me
	icon2.SetText(strIcon)
	Return Me
End Sub


Sub SetReadOnly(b As Boolean) As VMInput
	If b = False Then Return Me
	Input.SetAttr(CreateMap(":readonly": b))
	Return Me
End Sub

Sub SetLabel(lblText As String) As VMInput
	If lblText = "" Then Return Me
	lbl.SetText(lblText)
	Return Me
End Sub

'get component
Sub ToString As String
	If icon1.hasContent Then
		icon1.Pop(InputInt.Field)
	End If
	lbl.Pop(InputInt.Field)
	If hasPrefix Then
		prefix.Pop(InputInt.Field)
	End If
	Input.Pop(InputInt.Field)
	If hasSuffix Then
		suffix.Pop(InputInt.Field)
	End If
	If icon2.hasContent Then
		icon2.Pop(InputInt.Field)
	End If
	If hasHelp Then
		ht.Pop(InputInt.Field)
	End If
	If hasError Then
		he.Pop(InputInt.Field)
	End If
	Return InputInt.tostring
End Sub

Sub SetHelperText(t As String) As VMInput
	If t = "" Then Return Me
	hasHelp = True
	ht = Input.SetHelperText(t)
	Return Me
End Sub

Sub SetErrorText(t As String) As VMInput
	If t = "" Then Return Me
	hasError = True
	he = Input.SetErrorText(t)
	Return Me
End Sub


Sub SetVModel(k As String) As VMInput
	If k = "" Then Return Me
	Input.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMInput
	If vif = "" Then Return Me
	InputInt.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMInput
	If vif = "" Then Return Me
	InputInt.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMInput
	Dim childHTML As String = child.ToString
	Input.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMInput
	If t = "" Then Return Me
	Input.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMInput
	Input.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMInput
	Input.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMInput
	Input.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMInput
	Input.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMInput
	Input.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMInput
	Input.SetPaddingAll(p)
	Return Me
End Sub

'The input Type. Similar To HTML5 Type attribute.
Sub SetType(varType As Object) As VMInput
SetAttr(CreateMap("type": varType))
Return Me
End Sub

'The input Type. Similar To HTML5 Type attribute.-text
Sub SetTypeText(b As Boolean) As VMInput    'ignore
SetAttr(CreateMap("type": "text"))
Return Me
End Sub

'The input Type. Similar To HTML5 Type attribute.-email
Sub SetTypeEmail(b As Boolean) As VMInput    'ignore
SetAttr(CreateMap("type": "email"))
Return Me
End Sub

'The input Type. Similar To HTML5 Type attribute.-tel
Sub SetTypeTel(b As Boolean) As VMInput    'ignore
SetAttr(CreateMap("type": "tel"))
Return Me
End Sub

'The input Type. Similar To HTML5 Type attribute.-passsword
Sub SetTypePassword(b As Boolean) As VMInput    'ignore
	SetAttr(CreateMap("type": "password"))
	InputInt.SetAttr(CreateMap("md-has-password":True))
	Return Me
End Sub

'The number Type. Similar To HTML5 Type attribute.-passsword
Sub SetTypeNumber(b As Boolean) As VMInput    'ignore
SetAttr(CreateMap("type": "number"))
Return Me
End Sub

'The input placeholder. Similar To HTML5 placeholder attribute.
Sub SetPlaceholder(varPlaceholder As Object) As VMInput
SetAttr(CreateMap("placeholder": varPlaceholder))
Return Me
End Sub

'The input required. Similar To HTML5 required attribute.
Sub SetRequired(varRequired As Boolean) As VMInput
	Input.SetRequired(varRequired)
	Return Me
End Sub

'The input name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMInput
Input.SetName(varName, bind)
Return Me
End Sub

'The input name. Similar To HTML5 name attribute.
Sub SetID(varName As Object, bind As Boolean) As VMInput
Input.SetID(varName, bind)
Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMInput
	Input.setdisabled(b)
	Return Me
End Sub

'Enable the counter For the field And set a maxlength
Sub SetMaxLength(varMaxlength As Int) As VMInput
	If varMaxlength = Null Then Return Me
	SetAttr(CreateMap("maxlength": varMaxlength))
	Return Me
End Sub


Sub SetCounterDisabled As VMInput
	InputInt.SetAttr(CreateMap(":md-counter": False))
	Return Me
End Sub

'Counter
Sub SetCounter(varCounter As String) As VMInput
	If varCounter = "" Then Return Me
	SetAttr(CreateMap("md-counter": varCounter))
	Return Me
End Sub

'Make the label inline. This means that the label will disappear when the input receives a focus.
Sub SetInline(varInline As Boolean) As VMInput
	If varInline = True Then Return Me
	InputInt.SetAttr(CreateMap(":md-inline": varInline))
Return Me
End Sub

Sub SetTabIndex(ti As String) As VMInput
	Input.SetTabIndex(ti)
	Return Me
End Sub

'Add a clear button on the right of the input.
Sub SetClearable(varClearable As Boolean) As VMInput
	If varClearable = False Then Return Me
	If varClearable Then InputInt.SetAttr(CreateMap(":md-clearable": varClearable))
Return Me
End Sub

'Toggle password
Sub SetTogglePassword(varTogglePassword As Boolean) As VMInput
	If varTogglePassword = False Then Return Me
	InputInt.SetAttr(CreateMap(":md-toggle-password": varTogglePassword))
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub