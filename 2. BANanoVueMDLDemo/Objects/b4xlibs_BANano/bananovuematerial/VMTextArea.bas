B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TextArea As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private Internal As VMField
	Private lbl As VMLabel
	Private hasHelp As Boolean
	Private ht As VMElement
	Private hasError As Boolean
	Private he As VMElement
	Private icon1 As VMIcon
	Private module As Object
End Sub

'initialize the TextArea
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTextArea
	ID = sid.tolowercase
	module = eventHandler
	TextArea.Initialize(v, ID)
	TextArea.SetTag("md-textarea")
	vue = v
	Internal.Initialize(v,ID,$"${ID}field"$, module)
	lbl.Initialize(vue, $"${ID}label"$)
	hasHelp = False
	hasError = False
	icon1.Initialize(vue,$"${ID}icon"$)
	Return Me
End Sub

Sub SetCounterDisabled As VMTextArea
	Internal.SetAttr(CreateMap(":md-counter": False))
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMTextArea
	TextArea.SetTabIndex(ti)
	Return Me
End Sub


'The input name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMTextArea
	TextArea.SetName(varName, bind)
	Return Me
End Sub

'set first icon
Sub SetIcon(strIcon As String) As VMTextArea
	If strIcon <> "" Then icon1.SetText(strIcon)
	Return Me
End Sub


Sub SetReadOnly(b As Boolean) As VMTextArea
	If b = False Then Return Me
	TextArea.SetAttr(CreateMap(":readonly": b))
	Return Me
End Sub

Sub SetLabel(l As String) As VMTextArea
	If l = "" Then Return Me
	lbl.SetText(l)
	Return Me
End Sub

'get component
Sub ToString As String
	lbl.Pop(Internal.Field)
	TextArea.Pop(Internal.Field)
	If hasHelp Then
		ht.Pop(Internal.Field)
	End If
	If hasError Then
		he.Pop(Internal.field)
	End If
	If icon1.hasContent Then
		icon1.Pop(Internal.Field)
	End If	
	Return Internal.tostring
End Sub

Sub SetVModel(k As String) As VMTextArea
	If k = "" Then Return Me
	TextArea.SetVModel(k)
	Return Me
End Sub


Sub SetHelperText(t As String) As VMTextArea
	If t = "" Then Return Me
	hasHelp = True
	ht = TextArea.SetHelperText(t)
	Return Me
End Sub

Sub SetErrorText(t As String) As VMTextArea
	hasError = True
	he = TextArea.SetErrorText(t)
	Return Me
End Sub


Sub SetVIf(vif As String) As VMTextArea
	If vif = "" Then Return Me
	Internal.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTextArea
	If vif = "" Then Return Me
	Internal.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTextArea
	Dim childHTML As String = child.ToString
	TextArea.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTextArea
	TextArea.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMTextArea
	TextArea.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMTextArea
	TextArea.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTextArea
	TextArea.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTextArea
	TextArea.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTextArea
	TextArea.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMTextArea
	TextArea.SetPaddingAll(p)
	Return Me
End Sub


'The input placeholder. Similar To HTML5 placeholder attribute.
Sub SetPlaceholder(varPlaceholder As Object) As VMTextArea
SetAttr(CreateMap("placeholder": varPlaceholder))
Return Me
End Sub

'The input required. Similar To HTML5 required attribute.
Sub SetRequired(varRequired As Boolean) As VMTextArea
	TextArea.SetRequired(varRequired)
	Return Me
End Sub


Sub SetDisabled(b As Boolean) As VMTextArea
	TextArea.SetDisabled(b)
	Return Me
End Sub

'Enable the counter For the field And set a maxlength
Sub SetMaxLength(varMaxlength As String) As VMTextArea
	If varMaxlength = "" Then Return Me
	If varMaxlength = Null Then Return Me
	SetAttr(CreateMap("maxlength": varMaxlength))
	Return Me
End Sub

'Counter
Sub SetCounter(varCounter As String) As VMTextArea
	If varCounter = "" Then Return Me
	SetAttr(CreateMap(":md-counter": varCounter))
	Return Me
End Sub

'Autogrow
Sub SetAutogrow(varAutogrow As Boolean) As VMTextArea
	If varAutogrow = False Then Return Me
	SetAttr(CreateMap(":md-autogrow": varAutogrow))
	Return Me
End Sub

'Make the label inline. This means that the label will disappear when the input receives a focus.
Sub SetInline(varInline As Boolean) As VMTextArea
	If varInline = False Then Return Me
	Internal.SetAttr(CreateMap(":md-inline": varInline))
	Return Me
End Sub

'Add a clear button on the right of the input.
Sub SetClearable(varClearable As Boolean) As VMTextArea
	If varClearable Then Internal.SetAttr(CreateMap(":md-clearable": varClearable))
Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub