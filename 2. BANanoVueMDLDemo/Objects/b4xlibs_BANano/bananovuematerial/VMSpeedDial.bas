B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public SpeedDial As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private target As VMElement
	Private content As VMElement
	Private hasButtons As Boolean
	Private module As Object
End Sub

'initialize the SpeedDial
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSpeedDial
	ID = sid.tolowercase
	module = eventHandler
	SpeedDial.Initialize(v, ID).SetTag("md-speed-dial")
	target.Initialize(v,"").SetTag("md-speed-dial-target").SetRipple(True)
	content.Initialize(v,"").SetTag("md-speed-dial-content")
	vue = v
	hasButtons = False
	SpeedDial.SetOnClick(eventHandler, $"${ID}_click"$)
	Return Me
End Sub


Sub SetInitialIcon(i As String) As VMSpeedDial
	Dim icn As VMIcon
	icn.Initialize(vue,$"${ID}initicon"$).SetText(i).AddClass("md-morph-initial")
	icn.Pop(target)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMSpeedDial
	target.AddClass("md-primary")
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMSpeedDial
	target.AddClass("md-accent")
	Return Me
End Sub

Sub SetFinalIcon(i As String) As VMSpeedDial
	Dim icn As VMIcon
	icn.Initialize(vue,$"${ID}finalicon"$).SetText(i).AddClass("md-morph-final")
	icn.Pop(target)
	Return Me
End Sub


Sub SetIcon(i As String) As VMSpeedDial
	If i = "" Then Return Me
	Dim icn As VMIcon
	icn.Initialize(vue,$"${ID}icon"$).SetText(i)
	icn.Pop(target)
	Return Me 
End Sub

Sub AddButton(btnID As String, btnIcon As String) As VMSpeedDial
	Dim btn As VMButton
	btn.Initialize(vue,btnID,module).SetIcon(btnIcon).SetIconButton(True)
	btn.Pop(content)
	hasButtons = True
	Return Me  
End Sub

'get component
Sub ToString As String
	target.Pop(SpeedDial)
	If hasButtons Then content.Pop(SpeedDial)
	Return SpeedDial.ToString
End Sub

Sub SetVModel(k As String) As VMSpeedDial
	SpeedDial.SetVModel(k)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMSpeedDial
	Dim childHTML As String = child.ToString
	SpeedDial.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMSpeedDial
	SpeedDial.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub


'add a class
Sub AddClass(c As String) As VMSpeedDial
	SpeedDial.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSpeedDial
	SpeedDial.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSpeedDial
	SpeedDial.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMSpeedDial
	SpeedDial.SetPaddingAll(p)
	Return Me
End Sub

'Applies the style To show the content below Or above the trigger
Sub SetDirection(varDirection As Object) As VMSpeedDial
	SpeedDial.Element.SetAttr("md-direction", varDirection)
	Return Me
End Sub

'Applies the style To show the content below Or above the trigger-top
Sub SetDirectionTop(b As Boolean) As VMSpeedDial    'ignore
	SpeedDial.Element.SetAttr("md-direction", "top")
	Return Me
End Sub

'Applies the style To show the content below Or above the trigger-bottom
Sub SetDirectionBottom(b As Boolean) As VMSpeedDial    'ignore
	SpeedDial.Element.SetAttr("md-direction", "bottom")
	Return Me
End Sub

'Enables/Disables the ripple effect.
Sub SetEffect(varEffect As Object) As VMSpeedDial
	SpeedDial.Element.SetAttr("md-effect", varEffect)
	Return Me
End Sub

'Enables/Disables the ripple effect.-fling
Sub SetEffectFling(b As Boolean) As VMSpeedDial    'ignore
	SpeedDial.Element.SetAttr("md-effect", "fling")
	Return Me
End Sub

'Enables/Disables the ripple effect.-scale
Sub SetEffectScale(b As Boolean) As VMSpeedDial    'ignore
	SpeedDial.Element.SetAttr("md-effect", "scale")
	Return Me
End Sub

'Enables/Disables the ripple effect.-opacity
Sub SetEffectOpacity(b As Boolean) As VMSpeedDial    'ignore
	SpeedDial.Element.SetAttr("md-effect", "opacity")
	Return Me
End Sub

'Specifies the event who triggers the content
Sub SetEvent(varEvent As Object) As VMSpeedDial
	SpeedDial.Element.SetAttr("md-event", varEvent)
	Return Me
End Sub

'Specifies the event who triggers the content-hover
Sub SetEventHover(b As Boolean) As VMSpeedDial    'ignore
	SpeedDial.Element.SetAttr("md-event", "hover")
	Return Me
End Sub

'Specifies the event who triggers the content-click
Sub SetEventClick(b As Boolean) As VMSpeedDial    'ignore
	SpeedDial.Element.SetAttr("md-event", "click")
	Return Me
End Sub

'Position of the speed dial-md-top-right
Sub SetPositionTopRight(b As Boolean) As VMSpeedDial    'ignore
	AddClass("md-top-right")
	Return Me
End Sub

'Position of the speed dial-md-top-center
Sub SetPositionTopCenter(b As Boolean) As VMSpeedDial    'ignore
	AddClass("md-top-center")
	Return Me
End Sub

'Position of the speed dial-md-top-left
Sub SetPositionTopLeft(b As Boolean) As VMSpeedDial    'ignore
	AddClass("md-top-left")
	Return Me
End Sub

'Position of the speed dial-md-bottom-right
Sub SetPositionBottomRight(b As Boolean) As VMSpeedDial    'ignore
	AddClass("md-bottom-right")
	Return Me
End Sub

'Position of the speed dial-md-bottom-center
Sub SetPositionBottomCenter(b As Boolean) As VMSpeedDial    'ignore
	AddClass("md-bottom-center")
	Return Me
End Sub

'Position of the speed dial-md-bottom-left
Sub SetPositionBottomLeft(b As Boolean) As VMSpeedDial    'ignore
	AddClass("md-bottom-left")
	Return Me
End Sub

'Position of the speed dial-md-fixed
Sub SetPositionFixed(b As Boolean) As VMSpeedDial    'ignore
	AddClass("md-fixed")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
