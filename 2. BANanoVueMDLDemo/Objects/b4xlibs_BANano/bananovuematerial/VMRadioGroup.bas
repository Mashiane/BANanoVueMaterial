B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.08
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private RadioGroup As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private lbl As VMLabel
	Private BANano As BANano   'ignore
	Private vmodel As String
	Private module As Object
	Private designMode As Boolean
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, caption As String, eventHandler As Object) As VMRadioGroup
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	RadioGroup.Initialize(vue, ID).SetTag("div")
	lbl.Initialize(vue, $"${sid}label"$).SetText($"${caption}<br/>"$).SetCaption(True)
	lbl.Pop(RadioGroup)
	designMode = False
	vmodel = ""
	Return Me
End Sub

Sub SetOptions(options As Map)
	For Each k As String In options.Keys
		Dim v As String = options.Get(k)
		AddItem(k, v)
	Next
End Sub

Sub SetDesignMode(b As Boolean) As VMRadioGroup
	designMode = b
	Return Me
End Sub

Sub SetValue(v As Object) As VMRadioGroup
	If vmodel = "" Then
		Log($"VMRadioGroup.SetValue: '${ID}' - the vModel has not been set!"$)
	End If
	vue.SetStateSingle(vmodel,v)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMRadioGroup
	RadioGroup.SetTabIndex(ti)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMRadioGroup
	RadioGroup.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMRadioGroup
	RadioGroup.SetAttr(attr)
	Return Me
End Sub

Sub SetVModel(k As String) As VMRadioGroup
	vmodel = k.tolowercase
	Return Me
End Sub

Sub AddItems(m As Map) As VMRadioGroup
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		AddItem(k, v)
	Next
	Return Me
End Sub

Sub AddItem(k As String, v As String) As VMRadioGroup
	If vmodel = "" Then
		Log($"VMRadioGroup.AddItem: '${ID}' - the vModel has not been set!"$)
	End If
	Dim el As VMRadio
	el.Initialize(vue, k, module)
	el.SetText(v)
	el.SetValue(k,False)
	el.SetPrimary(True)
	el.SetOnChange(ID)
	If designMode = False Then 
		el.SetVModel(vmodel)
	End If
	el.Pop(RadioGroup)
	Return Me
End Sub

Sub ToString As String
	Return RadioGroup.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub SetVIf(vif As String) As VMRadioGroup
	If vif = "" Then Return Me
	RadioGroup.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMRadioGroup
	If vif = "" Then Return Me
	RadioGroup.SetVShow(vif)
	Return Me
End Sub

'add a child
Sub AddChild(child As VMElement) As VMRadioGroup
	Dim childHTML As String = child.ToString
	RadioGroup.SetText(childHTML)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMRadioGroup
	RadioGroup.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

Sub SetDisabled(b As Boolean) As VMRadioGroup
	RadioGroup.SetDisabled(b)
	Return Me
End Sub



Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
