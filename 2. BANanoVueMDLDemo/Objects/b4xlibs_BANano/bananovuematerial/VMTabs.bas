B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Tabs As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private atKey As String = $"${ID}active"$
	Private module As Object
End Sub

'initialize the Tabs
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMTabs
	ID = sid.tolowercase
	Tabs.Initialize(v, ID)
	Tabs.SetTag("md-tabs")
	vue = v
	module = eventHandler
	SetOnChanged
	Return Me
End Sub


Sub SetDisabled(b As Boolean) As VMTabs
	Tabs.SetDisabled(b)
	Return Me
End Sub


Sub SetTabLabel(stepID As String, stepLabel As String) As VMTabs
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}label"$
	vue.SetStateSingle(stepShow, stepLabel)
	Return Me
End Sub


Sub SetTabIcon(stepID As String, stepLabel As String) As VMTabs
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}icon"$
	vue.SetStateSingle(stepShow, stepLabel)
	Return Me
End Sub


Sub SetTabDisabled(stepID As String, stepLabel As Boolean) As VMTabs
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}disabled"$
	vue.SetStateSingle(stepShow, stepLabel)
	Return Me
End Sub

Sub HideTab(stepID As String) As VMTabs
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}show"$
	vue.SetStateSingle(stepShow, False)
	Return Me
End Sub

Sub ShowTab(stepID As String) As VMTabs
	stepID = stepID.tolowercase
	Dim stepShow As String = $"${stepID}show"$
	vue.SetStateSingle(stepShow, True)
	Return Me
End Sub

'the stepLabelVModel is the vmodel to have the caption
Sub AddTab(tabID As String, tabLabel As String, tabIcon As String, tabContent As String)
	tabID = tabID.tolowercase
	Dim ti As VMTabsItem
	ti.Initialize(vue,tabID,module)
	ti.SetLabel(tabLabel)
	ti.SetIcon(tabIcon)
	
	If tabContent <> Null Then
		ti.SetText(tabContent)
	End If
	ti.Pop(Tabs)
End Sub

'get component
Sub ToString As String
	Return Tabs.ToString
End Sub

Sub SetVModel(k As String) As VMTabs
	Tabs.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTabs
	Tabs.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTabs
	Tabs.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTabs
	Dim childHTML As String = child.ToString
	Tabs.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTabs
	Tabs.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMTabs
	Tabs.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMTabs
	Tabs.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTabs
	Tabs.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTabs
	Tabs.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTabs
	Tabs.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMTabs
	Tabs.SetPaddingAll(p)
	Return Me
End Sub

'Sub ChangeTab(tabID As String)
'	tabID = tabID.tolowercase
'	Dim atKey As String = $"${ID}activetab"$
'	vue.SetStateSingle(atKey, tabID)
'End Sub

'Set the current selected TAB.
Sub SetTabActive(varActiveTab As String) As VMTabs
	If varActiveTab = Null Then Return Me
	varActiveTab = varActiveTab.tolowercase
	vue.SetStateSingle(atKey, varActiveTab)
	SetAttr(CreateMap(":md-active-tab": atKey))
	Return Me
End Sub

'Option used To enable touch support To move between tabs by swipe.
Sub SetSwipeable(varSwipeable As Boolean) As VMTabs
	Dim pp As String = $"${ID}swipeable"$
	vue.SetStateSingle(pp, varSwipeable)
	SetAttr(CreateMap(":md-swipeable": pp))
	Return Me
End Sub

'Syncs the table selection with the current route, matching by the single TAB To prop.
Sub SetSyncRoute(varSyncRoute As Boolean) As VMTabs
	SetAttr(CreateMap(":md-sync-route": varSyncRoute))
	Return Me
End Sub

'Sets the TAB navigation alignment.
Sub SetAlignment(varAlignment As String) As VMTabs
	Dim pp As String = $"${ID}alignment"$
	vue.SetStateSingle(pp, varAlignment)
	SetAttr(CreateMap(":md-alignment": pp))
	Return Me
End Sub

'Sets the TAB navigation alignment.-left
Sub SetAlignmentLeft(b As Boolean) As VMTabs    'ignore
	SetAlignment("left")
	Return Me
End Sub

'Sets the TAB navigation alignment.-center
Sub SetAlignmentCenter(b As Boolean) As VMTabs    'ignore
	SetAlignment("centered")
	Return Me
End Sub

'Sets the TAB navigation alignment.-right
Sub SetAlignmentRight(b As Boolean) As VMTabs    'ignore
	SetAlignment("right")
	Return Me
End Sub

'Sets the TAB navigation alignment.-fixed
Sub SetAlignmentFixed(b As Boolean) As VMTabs    'ignore
	SetAlignment("fixed")
	Return Me
End Sub

'Apply a dynamic transition To the table height.
Sub SetDynamicHeight(varDynamicHeight As Boolean) As VMTabs
	Dim pp As String = $"${ID}dynamicheight"$
	vue.SetStateSingle(pp, varDynamicHeight)
	SetAttr(CreateMap(":md-dynamic-height": pp))
	Return Me
End Sub

'set margins
Sub SetMargin(p As Object) As VMTabs
	Tabs.SetMarginAll(p)
	Return Me
End Sub

'Add an elevation To TAB navigation element.
Sub SetElevation(varElevation As Int) As VMTabs
	Tabs.SetElevation(varElevation)
	Return Me	
End Sub

'The minimal distance traveled To be considered swipe.
Sub SetSwipeThreshold(varSwipeThreshold As Object) As VMTabs
	SetAttr(CreateMap("md-swipe-threshold": varSwipeThreshold))
	Return Me
End Sub

'The maximum distance allowed at the same time in perpendicular direction.
Sub SetSwipeRestraint(varSwipeRestraint As Object) As VMTabs
	SetAttr(CreateMap("md-swipe-restraint": varSwipeRestraint))
	Return Me
End Sub

'The maximum time allowed To detect swipe.
Sub SetSwipeTime(varSwipeTime As Object) As VMTabs
	SetAttr(CreateMap("md-swipe-time": varSwipeTime))
	Return Me
End Sub

'Triggered when the active TAB changes
private Sub SetOnChanged As VMTabs
	Dim tabID As String
	Dim methodName As String  = $"${ID}_change"$
	If SubExists(module, methodName) = False Then Return Me
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(tabID))
	SetAttr(CreateMap("v-on:md-changed": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub