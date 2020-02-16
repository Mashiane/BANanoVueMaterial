B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Switch As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private xmodel As String
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSwitch
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Switch.Initialize(vue, ID).SetTag("md-switch")
	xmodel = ""
	Dim sval As String
	SetOnChange(sval)
	Return Me
End Sub

Sub SetText(t As String) As VMSwitch
	Switch.SetText(t)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMSwitch
	Switch.SetTabIndex(ti)
	Return Me
End Sub


'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMSwitch
	Switch.SetName(varName, bind)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetID(varName As Object, bind As Boolean) As VMSwitch
	Switch.SetID(varName, bind)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMSwitch
	Switch.SetDisabled(b)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMSwitch
	Switch.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSwitch
	Switch.SetAttr(attr)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMSwitch
	If b Then Switch.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMSwitch
	If b Then Switch.SetAccent(True)
	Return Me
End Sub

'set onchange event
private Sub SetOnChange(value As Object) As VMSwitch
	Private methodName As String = $"${ID}_change"$
	If SubExists(module, methodName) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(value))
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMSwitch
	Switch.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMSwitch
	Switch.SetVShow(vif)
	Return Me
End Sub

Sub SetValue(v As Object) As VMSwitch
	SetAttr(CreateMap("value": v))
	Return Me
End Sub

Sub SetVModel(k As String) As VMSwitch
	Switch.SetVModel(k)
	xmodel = k.tolowercase
	Return Me
End Sub

Sub ToString As String
	Return Switch.tostring
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
