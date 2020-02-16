B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public TabItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
End Sub

'initialize the TabItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTabsItem
	ID = sid.tolowercase
	TabItem.Initialize(v, ID)
	TabItem.SetTag("md-tab")
	vue = v
	SetId(ID)
	module = eventHandler
	Return Me
End Sub

'get component
Sub ToString As String
	Return TabItem.ToString
End Sub

Sub SetVIf(vif As String) As VMTabsItem
	TabItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMTabsItem
	TabItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTabsItem
	Dim childHTML As String = child.ToString
	TabItem.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMTabsItem
	TabItem.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTabsItem
	TabItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTabsItem
	TabItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTabsItem
	TabItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMTabsItem
	TabItem.SetPaddingAll(p)
	Return Me
End Sub

'The TAB id. Used when changing the active TAB dynamically
Sub SetId(varId As String) As VMTabsItem
	If varId = "" Then Return Me
	SetAttr(CreateMap("id": varId))
	Return Me
End Sub

'The TAB href link. Useful when you don't have Vue Router on your app,
Sub SetRef(varRef As String) As VMTabsItem
	If varRef = "" Then Return Me
	SetAttr(CreateMap("ref": varRef))
	Return Me
End Sub

'The TAB label
Sub SetLabel(varLabel As String) As VMTabsItem
	Dim pp As String = $"${ID}label"$
	vue.SetStateSingle(pp, varLabel)
	SetAttr(CreateMap(":md-label": pp))
	Return Me
End Sub

'The TAB icon. Accepts an string Or a asset URL.
Sub SetIcon(varIcon As String) As VMTabsItem
	Dim pp As String = $"${ID}icon"$
	vue.SetStateSingle(pp, varIcon)
	SetAttr(CreateMap(":md-icon": pp))
	Return Me
End Sub

'Disable/enable a TAB	Null
Sub SetDisabled(varDisabled As Boolean) As VMTabsItem
	Dim pp As String = $"${ID}disabled"$
	vue.SetStateSingle(pp, varDisabled)
	SetAttr(CreateMap(":md-disabled": pp))
	Return Me
End Sub

'The data To be passed To tab
Sub SetTemplateData(varTemplateData As Object) As VMTabsItem
	SetAttr(CreateMap("md-template-data": varTemplateData))
	Return Me
End Sub

