B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public BottomBar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private module As Object
End Sub

'initialize the BottomBar
Public Sub Initialize(v As BANanoVue, sid As String, EventHandler As Object) As VMBottomBar
	ID = sid.tolowercase
	BottomBar.Initialize(v, ID)
	BottomBar.SetTag("md-bottom-bar")
	module = EventHandler
	vue = v
	Dim sval As String
	SetOnChanged(sval)
	Return Me
End Sub

Sub CreateItem(sid As String) As VMBottomBarItem
	Dim el As VMBottomBarItem
	el.Initialize(vue, sid, module)
	Return el
End Sub

Sub AddItem(iID As String, iLabel As String, iIcon As String, badge As String)
	Dim item As VMBottomBarItem
	item.Initialize(vue, iID, module)
	If badge = "" Then
		item.SetLabel(iLabel)
		item.SetIcon(iIcon)
	Else
		item.SetIcon1(iIcon)
		item.SetLabel1(iLabel)
		item.SetBadge(badge)
	End If
	item.Pop(BottomBar)
End Sub

private Sub SetOnChanged(activeItem As String) As VMBottomBar
	Dim MethodName As String = $"${ID}_changed"$
	If SubExists(module, MethodName) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, MethodName, Array(activeItem))
	SetAttr(CreateMap("@md-changed": MethodName))
	'add to methods
	vue.SetCallBack(MethodName, cb)
	Return Me
End Sub

'get component
Sub ToString As String
	Return BottomBar.ToString
End Sub

Sub SetVModel(k As String) As VMBottomBar
	BottomBar.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMBottomBar
	BottomBar.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMBottomBar
	BottomBar.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBottomBar
	Dim childHTML As String = child.ToString
	BottomBar.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMBottomBar
	BottomBar.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMBottomBar
	BottomBar.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMBottomBar
	BottomBar.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBottomBar
	BottomBar.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBottomBar
	BottomBar.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBottomBar
	BottomBar.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMBottomBar
	BottomBar.SetPaddingAll(p)
	Return Me
End Sub

'Sets the display mode. See below the detailed description of each Type.
Sub SetType(varType As Object) As VMBottomBar
	Dim pp As String = $"${ID}type"$
	vue.SetStateSingle(pp, varType)
	SetAttr(CreateMap(":md-type": pp))
	Return Me
End Sub

'Sets the display mode. See below the detailed description of each Type.-fixed
Sub SetTypeFixed(b As Boolean) As VMBottomBar    'ignore
	SetType("fixed")
	Return Me
End Sub

'Sets the display mode. See below the detailed description of each Type.-shift
Sub SetTypeShift(b As Boolean) As VMBottomBar    'ignore
	SetType("shift")
	Return Me
End Sub

'Dynamically changes the selected item.
Sub SetActiveItem(varActiveItem As Object) As VMBottomBar
	Dim pp As String = $"${ID}activeitem"$
	vue.SetStateSingle(pp, varActiveItem)
	SetAttr(CreateMap(":md-active-item": pp))
	Return Me
End Sub

'Watches current route
Sub SetSyncRoute(varSyncRoute As Boolean) As VMBottomBar
	SetAttr(CreateMap(":md-sync-route": varSyncRoute))
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
