B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Radio As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private module As Object
End Sub

Sub SetTabIndex(ti As String) As VMRadio
	Radio.SetTabIndex(ti)
	Return Me
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMRadio
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Radio.Initialize(vue, ID).SetTag("md-radio")
	SetOnChange(ID)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMRadio
	If vif = "" Then Return Me
	Radio.SetVShow(vif)
	Return Me
End Sub

Sub SetText(t As String) As VMRadio
	Radio.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMRadio
	Radio.SetPrimary(b)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMRadio
	Radio.SetName(varName, bind)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetValue(varName As Object, bind As Boolean) As VMRadio
	Radio.SetValue(varName, bind)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMRadio
	Radio.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRadio
	Radio.SetAttr(attr)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMRadio
	Radio.SetDisabled(b)
	Return Me
End Sub

'set onchange event
Sub SetOnChange(source As String) As VMRadio
	source = source.tolowercase
	Dim methodName As String  = $"${source}_change"$
	If SubExists(module, methodName) = False Then Return Me
	Dim sval As String
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(sval))
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetVModel(k As String) As VMRadio
	Radio.SetVModel(k)
	Return Me
End Sub

Sub ToString As String
	Return Radio.tostring
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