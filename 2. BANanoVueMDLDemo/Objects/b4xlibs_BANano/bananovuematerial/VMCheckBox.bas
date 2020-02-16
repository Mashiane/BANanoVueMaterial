B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CheckBox As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private xmodel As String
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMCheckBox
	ID = sid.ToLowerCase
	vue = v
	CheckBox.Initialize(vue, ID).SetTag("md-checkbox")
	module = eventHandler
	SetOnChange(ID)
	xmodel = ""
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMCheckBox
	CheckBox.SetTabIndex(ti)
	Return Me
End Sub

Sub SetText(t As String) As VMCheckBox
	CheckBox.SetText(t)
	Return Me
End Sub

Sub SetVShow(vshow As String) As VMCheckBox
	CheckBox.SetVShow(vshow)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMCheckBox
	CheckBox.SetPrimary(b)
	Return Me
End Sub

Sub SetIndeterminate As VMCheckBox
	If xmodel = "" Then
		Log($"VMCheckBox.${ID} - you need to set the v-model first!"$)
	End If
	vue.SetStateSingle(xmodel, True)
	CheckBox.SetAttr(CreateMap("indeterminate":True))
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMCheckBox
	CheckBox.SetName(varName, bind)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetValue(varName As Object) As VMCheckBox
	CheckBox.SetValue(varName, False)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMCheckBox
	CheckBox.SetDisabled(b)
	Return Me
End Sub


'add a class
Sub AddClass(c As String) As VMCheckBox
	CheckBox.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCheckBox
	CheckBox.SetAttr(attr)
	Return Me
End Sub

'set onchange event
Sub SetOnChange(source As String) As VMCheckBox
	source = source.tolowercase
	Dim methodName As String = $"${source}_change"$
	If SubExists(module, methodName) = False Then Return Me
	Dim sval As String
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(sval))
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetVModel(k As String) As VMCheckBox
	xmodel = k
	CheckBox.SetVModel(k)
	vue.SetStateSingle(xmodel, Null)
	Return Me
End Sub

Sub ToString As String
	Return CheckBox.tostring
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