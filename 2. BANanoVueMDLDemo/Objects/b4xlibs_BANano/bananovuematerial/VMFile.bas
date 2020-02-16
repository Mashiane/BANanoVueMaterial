B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public FileO As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private FileInt As VMField
	Private lbl As VMLabel
	Private hasHelp As Boolean
	Private ht As VMElement
	Private hasError As Boolean
	Private he As VMElement
	Private vmodel As String
	Private module As Object
End Sub

'initialize the File
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMFile
	ID = sid.tolowercase
	FileO.Initialize(v, ID)
	FileO.SetTag("md-file")
	module = eventHandler
	vue = v
	FileInt.Initialize(v, ID,  $"${ID}field"$, module)
	lbl.Initialize(vue, $"${ID}label"$)
	hasHelp = False
	hasError = False
	vmodel = ""
	Dim fList As Object
	SetOnChange(fList)
	Return Me
End Sub

'The File name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMFile
	FileO.SetName(varName, bind)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMFile
	FileO.SetTabIndex(ti)
	Return Me
End Sub

Sub SetAcceptImages As VMFile
	SetAttr(CreateMap("accept":"image/*"))
	Return Me
End Sub

'set onchange event
private Sub SetOnChange(fileList As Object) As VMFile
	Dim methodName As String = $"${ID}_change"$
	If SubExists(module, methodName) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(fileList))
	SetAttr(CreateMap("v-on:md-change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetMultiple(b As Boolean) As VMFile
	FileO.SetAttr(CreateMap(":multiple": b))
	Return Me
End Sub

Sub SetAccept(accept As Object) As VMFile
	FileO.SetAttr(CreateMap("accept": accept))
	Return Me
End Sub

Sub SetReadOnly(b As Boolean) As VMFile
	FileO.SetAttr(CreateMap(":readonly": b))
	Return Me
End Sub

Sub SetLabel(l As Object) As VMFile
	lbl.SetText(l)
	Return Me
End Sub

'get component
Sub ToString As String
	lbl.Pop(FileInt.Field)
	FileO.Pop(FileInt.Field)
	If hasHelp Then
		ht.Pop(FileInt.Field)
	End If
	If hasError Then
		he.Pop(FileInt.Field)
	End If
	Return FileInt.tostring
End Sub

Sub SetHelperText(t As String) As VMFile
	hasHelp = True
	ht = FileO.SetHelperText(t)
	Return Me
End Sub

Sub SetErrorText(t As String) As VMFile
	hasError = True
	he = FileO.SetErrorText(t)
	Return Me
End Sub

Sub SetVModel(k As String) As VMFile
	vmodel = k.tolowercase
	vue.SetStateSingle(k,Null)
	FileO.SetVModel(k)
	Return Me
End Sub

Sub SetValue(xval As String) As VMFile
	If vmodel = "" Then
		Log($"VMFile.SetValue ${ID} - v-model has not been set!"$) 
	End If
	vue.SetStateSingle(vmodel, xval)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMFile
	FileInt.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMFile
	FileInt.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMFile
	Dim childHTML As String = child.ToString
	FileO.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMFile
	FileO.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMFile
	FileO.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMFile
	FileO.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMFile
	FileO.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMFile
	FileO.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMFile
	FileO.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMFile
	FileO.SetPaddingAll(p)
	Return Me
End Sub

'The File placeholder. Similar To HTML5 placeholder attribute.
Sub SetPlaceholder(varPlaceholder As Object) As VMFile
	SetAttr(CreateMap("placeholder": varPlaceholder))
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMFile
	FileO.SetDisabled(b)
	Return Me
End Sub


'The File required. Similar To HTML5 required attribute.
Sub SetRequired(varRequired As Boolean) As VMFile
	FileO.SetRequired(varRequired)
	Return Me
End Sub


'Make the label inline. This means that the label will disappear when the File receives a focus.
Sub SetInline(varInline As Boolean) As VMFile
	FileInt.SetInline(varInline)
	Return Me
End Sub

'Add a clear button on the right of the File.
Sub SetClearable(varClearable As Boolean) As VMFile
	FileInt.SetClearable(varClearable)
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

