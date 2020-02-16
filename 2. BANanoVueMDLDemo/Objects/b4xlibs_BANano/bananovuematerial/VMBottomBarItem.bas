B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public BottomBarItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
End Sub

'initialize the BottomBarItem
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMBottomBarItem
	ID = sid.tolowercase
	BottomBarItem.Initialize(v, ID)
	BottomBarItem.SetTag("md-bottom-bar-item")
	module = eventHandler
	vue = v
	BottomBarItem.SetOnClick(module, $"${ID}_click"$)
	Return Me
End Sub

Sub SetExact(b As Boolean) As VMBottomBarItem
	BottomBarItem.SetExact(b)
	Return Me
End Sub

'set an image
Sub SetSVG(src As String) As VMBottomBarItem
	Dim icon As VMIcon
	icon.Initialize(vue, $"${ID}svg"$).SetBottomBarIcon(True).SetSrc(src)
	icon.Pop(BottomBarItem)
	Return Me 
End Sub

'set an image
Sub SetIcon1(icn As String) As VMBottomBarItem
	If icn = "" Then Return Me
	Dim icon As VMIcon
	icon.Initialize(vue, $"${ID}icon"$).SetBottomBarIcon(True).SetText(icn)
	icon.Pop(BottomBarItem)
	Return Me 
End Sub


Sub SetLabel1(label As String) As VMBottomBarItem
	Dim pp As String = $"${ID}label"$
	vue.SetStateSingle(pp, label)
	Dim span As VMElement
	span.Initialize(vue, $"${ID}label"$).SetTag("span").AddClass("md-bottom-bar-label").SetText($"{{ ${pp} }}"$)
	span.Pop(BottomBarItem)
	Return Me	
End Sub

Sub SetBadge(badge As String) As VMBottomBarItem
	Dim badgeContent As String = $"${ID}badgevalue"$
	vue.SetStateSingle(badgeContent, badge)
	Dim i As VMElement
	i.Initialize(vue,$"${ID}badge"$).SetTag("i").AddClass("bottomitembadge").SetText($"{{ ${badgeContent} }}"$)
	i.Pop(BottomBarItem)
	Return Me
End Sub

Sub SetTo(t As String) As VMBottomBarItem
	BottomBarItem.SetTo(t)
	Return Me
End Sub

'get component
Sub ToString As String
	Return BottomBarItem.ToString
End Sub

Sub SetVIf(vif As Object) As VMBottomBarItem
	BottomBarItem.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMBottomBarItem
	BottomBarItem.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBottomBarItem
	Dim childHTML As String = child.ToString
	BottomBarItem.SetText(childHTML)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMBottomBarItem
	BottomBarItem.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMBottomBarItem
	BottomBarItem.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBottomBarItem
	BottomBarItem.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBottomBarItem
	BottomBarItem.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBottomBarItem
	BottomBarItem.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMBottomBarItem
	BottomBarItem.SetPaddingAll(p)
	Return Me
End Sub

'The item id.
Sub SetId(varId As Object) As VMBottomBarItem
	SetAttr(CreateMap("id": varId))
	Return Me
End Sub

'The bottom bar label.
Sub SetLabel(varLabel As String) As VMBottomBarItem
	Dim pp As String = $"${ID}label"$
	vue.SetStateSingle(pp, varLabel)
	SetAttr(CreateMap(":md-label": pp))
	Return Me
End Sub

'The bottom bar icon.
Sub SetIcon(varIcon As Object) As VMBottomBarItem
	Dim pp As String = $"${ID}icon"$
	vue.SetStateSingle(pp, varIcon)
	SetAttr(CreateMap(":md-icon": pp))
	Return Me
End Sub

'Disable the bottom bar preventing the click on it
Sub SetDisabled(varDisabled As Boolean) As VMBottomBarItem
	BottomBarItem.SetDisabled(varDisabled)
	Return Me
End Sub

