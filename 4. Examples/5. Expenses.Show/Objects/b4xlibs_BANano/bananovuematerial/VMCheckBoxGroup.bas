B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private CheckGroup As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private lbl As VMLabel
	Private BANano As BANano   'ignore
	Private vmodel As String
	Private module As Object
	Private designMode As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, caption As String, eventHandler As Object) As VMCheckBoxGroup
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	CheckGroup.Initialize(vue, ID).SetTag("div")
	lbl.Initialize(vue, $"${sid}label"$).SetText($"${caption}<br/>"$).SetCaption(True)
	lbl.Pop(CheckGroup)
	designMode = False
	vmodel = ""
	Return Me
End Sub

Sub SetDesignMode(b As Boolean) As VMCheckBoxGroup
	designMode = b
	Return Me
End Sub

Sub SetValue(v As Object) As VMCheckBoxGroup
	If vmodel = "" Then
		Log($"VMCheckBoxGroup.SetValue: '${ID}' - the vModel has not been set!"$)
	End If
	Dim nl As List
	nl.Initialize
	nl.Add(v)
	vue.SetStateSingle(vmodel,nl)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMCheckBoxGroup
	CheckGroup.SetTabIndex(ti)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMCheckBoxGroup
	CheckGroup.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCheckBoxGroup
	CheckGroup.SetAttr(attr)
	Return Me
End Sub

Sub SetVModel(k As String) As VMCheckBoxGroup
	vmodel = k.tolowercase
	Dim nl As List
	nl.Initialize
	vue.SetStateSingle(vmodel,nl)
	Return Me
End Sub

Sub AddItems(m As Map) As VMCheckBoxGroup
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		AddItem(k, v)
	Next
	Return Me
End Sub

Sub AddItem(k As String, v As String) As VMCheckBoxGroup
	If vmodel = "" Then
		Log($"VMCheckBoxGroup.AddItem: '${ID}' - the vModel has not been set!"$)
	End If
	Dim el As VMCheckBox
	el.Initialize(vue, k,module)
	If designMode = False Then
		el.SetVModel(vmodel)
	End If
	el.SetText(v)
	el.SetValue(k)
	el.SetPrimary(True)
	el.SetOnChange(ID)
	el.Pop(CheckGroup)
	Return Me
End Sub

Sub ToString As String
	Return CheckGroup.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub SetVIf(vif As String) As VMCheckBoxGroup
	If vif = "" Then Return Me
	CheckGroup.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMCheckBoxGroup
	If vif = "" Then Return Me
	CheckGroup.SetVShow(vif)
	Return Me
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCheckBoxGroup
	Dim childHTML As String = child.ToString
	CheckGroup.SetText(childHTML)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCheckBoxGroup
	CheckGroup.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

Sub SetDisabled(b As Boolean) As VMCheckBoxGroup
	CheckGroup.SetDisabled(b)
	Return Me
End Sub



Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub