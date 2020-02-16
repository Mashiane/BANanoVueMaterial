B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Chips As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private hasHelp As Boolean
	Private ht As VMElement
	Private et As VMElement
	Private lbl As VMElement
	Private hasLabel As Boolean
	Private hasError As Boolean
	Private module As Object
End Sub

'initialize the Chips
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMChips
	ID = sid.tolowercase
	Chips.Initialize(v, ID)
	Chips.SetTag("md-chips")
	lbl.Initialize(v,"").SetTag("label")
	module = eventHandler 
	vue = v
	hasHelp = False
	hasLabel = False
	hasHelp = False
	hasError = False
	Dim cText As String, chInt As Int  'ignore
	SetOnDelete(cText, chInt)
	SetOnClick(cText, chInt)
	Dim sval As String
	SetOnInsert(sval)
	Return Me
End Sub


Sub SetHelperText(t As String) As VMChips
	If t = "" Then Return Me
	hasHelp = True
	ht = Chips.SetHelperText(t)
	Return Me
End Sub

Sub SetErrorText(txt As String) As VMChips
	If txt = "" Then Return Me
	hasError = True
	et = Chips.SetErrorText(txt)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMChips
	If ti = "" Then Return Me
	Chips.SetTabIndex(ti)
	Return Me
End Sub


'The input required. Similar To HTML5 required attribute.
Sub SetRequired(varRequired As Boolean) As VMChips
	Chips.SetRequired(varRequired)
	Return Me
End Sub

'get component
Sub ToString As String
	If hasLabel Then
		lbl.pop(Chips)
	End If
	If hasHelp Then
		ht.Pop(Chips)
	End If
	If hasError Then
		et.Pop(Chips)
	End If
	Return Chips.ToString
End Sub

Sub SetOptions(vModel As String, options As List) As VMChips
	SetVModel(vModel)
	vue.SetStateSingle(vModel, options)
	Return Me
End Sub

Sub SetVModel(k As String) As VMChips
	If k = "" Then Return Me
	Chips.SetVModel(k)
	Return Me
End Sub

Sub SetLabel(labelText As String) As VMChips
	If labelText = "" Then Return Me
	lbl.SetText(labelText)
	hasLabel = True
	Return Me
End Sub

Sub SetVIf(vif As String) As VMChips
	If vif = "" Then Return Me
	Chips.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMChips
	If vif = "" Then Return Me
	Chips.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMChips
	Dim childHTML As String = child.ToString
	Chips.SetText(childHTML)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMChips
	If b = False Then Return Me
	Chips.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMChips
	If b = False Then Return Me
	Chips.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMChips
	Chips.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMChips
	Chips.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMChips
	Chips.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As String) As VMChips
	If p = "" Then Return Me
	Chips.SetPaddingAll(p)
	Return Me
End Sub

'The input Type. Cannot be 'file'
Sub SetInputType(varInputType As String) As VMChips
	If varInputType = "" Then Return Me
	SetAttr(CreateMap("md-input-type": varInputType))
	Return Me
End Sub

Sub SetText As VMChips
	SetInputType("text")
	Return Me
End Sub

Sub SetPassword As VMChips
	SetInputType("password")
	Return Me
End Sub

Sub SetSearch As VMChips
	SetInputType("search")
	Return Me
End Sub

Sub SetEmail As VMChips
	SetInputType("email")
	Return Me
End Sub

Sub SetTel As VMChips
	SetInputType("tel")
	Return Me
End Sub

Sub SetNumber As VMChips
	SetInputType("number")
	Return Me
End Sub

Sub SetURL As VMChips
	SetInputType("url")
	Return Me
End Sub

'The input placeholder. It Is useful To show To the user which Type of data will be inserted.
Sub SetPlaceholder(varPlaceholder As String) As VMChips
	If varPlaceholder = "" Then Return Me
	SetAttr(CreateMap("md-placeholder": varPlaceholder))
	Return Me
End Sub

'Creates a non-editable chips.
Sub SetStatic(varStatic As Boolean) As VMChips
	If varStatic = False Then Return Me
	SetAttr(CreateMap(":md-static": varStatic))
	Return Me
End Sub

'Blocks the chips To create items above the limit.
Sub SetLimit(varLimit As String) As VMChips
	If varLimit = "" Then Return Me
	SetAttr(CreateMap(":md-limit": varLimit))
	Return Me
End Sub

'Always check If there Is a duplicated chip While changing the input value
Sub SetCheckDuplicated(varCheckDuplicated As Boolean) As VMChips
	If varCheckDuplicated = False Then Return Me
	SetAttr(CreateMap(":md-check-duplicated": varCheckDuplicated))
	Return Me
End Sub

'Formatter before chip insertion.
Sub SetFormat(varFormat As String, methodName As String) As VMChips
	If varFormat = "" Then Return Me
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttr(CreateMap(":md-format": varFormat))
	Dim value As String
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(value))
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMChips
	Chips.SetDisabled(b)
	Return Me
End Sub


'Triggered after a mouse click on delete icon of a chip.
private Sub SetOnDelete(text As String, index As Int) As VMChips
	Dim methodName As String = $"${ID}_delete"$
	If SubExists(module, methodName) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(text, index))
	SetAttr(CreateMap("v-on:md-delete": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered after a mouse click on a single chip.
private Sub SetOnClick(text As String, index As Int) As VMChips
	Dim methodName As String  = $"${ID}_click"$
	If SubExists(module, methodName) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(text,index))
	SetAttr(CreateMap("v-on:md-click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered after a chip inserted.
private Sub SetOnInsert(value As String) As VMChips
	Dim methodName As String = $"${ID}_insert"$
	If SubExists(module, methodName) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(value))
	SetAttr(CreateMap("v-on:md-insert": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub



Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

