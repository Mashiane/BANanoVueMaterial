B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Button As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private hasBadge As Boolean
	Private badge As VMBadge
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMButton
	ID = sid.ToLowerCase
	vue = v
	Button.Initialize(vue, ID).SetTag("md-button")
	If ID <> "" Then 
	hasBadge = False
	badge.Initialize(vue, $"${ID}badge"$)
	End If
	Button.SetOnClick(eventHandler, $"${ID}_click"$)
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMButton
	Button.RemoveAttr(sName)
	Return Me
End Sub

Sub Hide
	Button.hide
End Sub

Sub Show
	Button.show
End Sub


Sub SetFabFixed(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.AddClass("md-fixed")
	Return Me
End Sub

Sub SetFab(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.AddClass("md-fab")
	Return Me
End Sub

Sub SetFabPosition(pos As String) As VMButton
	If pos = "" Then Return Me
	Button.AddClass(pos)
	Return Me
End Sub

Sub SetFabPositionTopRight As VMButton
	SetFabPosition("md-fab-top-right")
	Return Me
End Sub

Sub SetFabPositionTopCenter As VMButton
	SetFabPosition("md-fab-top-center")
	Return Me
End Sub

Sub SetFabPositionTopLeft As VMButton
	SetFabPosition("md-fab-top-left")
	Return Me
End Sub

Sub SetFabPositionBottomRight As VMButton
	SetFabPosition("md-fab-bottom-right")
	Return Me
End Sub

Sub SetFabPositionBottomCenter As VMButton
	SetFabPosition("md-fab-bottom-center")
	Return Me
End Sub

Sub SetFabPositionBottomLeft As VMButton
	SetFabPosition("md-fab-bottom-left")
	Return Me
End Sub


Sub SetOnClick(targetModule As Object) As VMButton
	Button.SetOnClick(targetModule, $"${ID}_click"$)
	Return Me	
End Sub

Sub SetBadgeContent(counted As Int) As VMButton
	badge.SetContent(counted)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgePrimary As VMButton
	badge.SetPrimary(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeAccent As VMButton
	badge.SetAccent(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeOnTop As VMButton
	badge.SetPositionTop(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeOnBottom As VMButton
	badge.SetPositionBottom(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeDense As VMButton
	badge.SetDense(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeSquare As VMButton
	badge.SetSquare(True)
	hasBadge = True
	Return Me
End Sub


Sub SetTabIndex(ti As String) As VMButton
	If ti = "" Then Return Me
	Button.SetTabIndex(ti)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMButton
	Button.SetStyle(sm)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMButton
	Button.SetVIf(vif)
	Return Me
End Sub

Sub SetID(iID As String, bind As Boolean) As VMButton
	Button.SetID(iID,bind)
	Return Me
End Sub

Sub SetName(nam As String, bind As Boolean) As VMButton
	Button.SetName(nam, bind)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMButton
	Button.SetKey(k, bind)
	Return Me
End Sub


Sub SetMenuTrigger(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.SetAttr(CreateMap("md-menu-trigger": True))
	Return Me
End Sub

Sub SetVShow(vif As String) As VMButton
	Button.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMButton
	Button.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMButton
	Button.SetAttr(attr)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMButton
	Button.SetDisabled(b)
	Return Me
End Sub

Sub SetListAction(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.SetListAction(True)
	Return Me
End Sub

Sub SetDense(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.SetDense(b)
	Return Me
End Sub

Sub SetRaised(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.AddClass("md-raised")
	Return Me
End Sub

Sub SetRipple(b As Boolean) As VMButton
	Button.SetRipple(b)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.SetPrimary(b)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.SetAccent(b)
	Return Me
End Sub

Sub SetTo(t As String, bind As Boolean) As VMButton
	If t = "" Then Return Me
	If bind = True Then
		t= t.tolowercase
		SetAttr(CreateMap(":to":t))
	Else
		Button.SetTo(t)
	End If
	Return Me
End Sub

Sub SetHREF(h As String, bind As Boolean) As VMButton
	If h = "" Then Return Me
	If bind = True Then
		h = h.tolowercase
		SetAttr(CreateMap(":href":h))
	Else	
		Button.sethref(h)
	End If
	Return Me
End Sub

Sub SetIconButton(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.AddClass("md-icon-button")
	Return Me
End Sub

Sub SetMini(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.AddClass("md-mini")
	Return Me
End Sub

Sub SetPlain(b As Boolean) As VMButton
	If b = False Then Return Me
	Button.AddClass("md-plain")
	Return Me
End Sub

Sub SetIcon(icn As String) As VMButton
	If icn = "" Then Return Me
	Dim icon As VMElement
	icon.Initialize(vue,$"${ID}icn"$).SetTagIcon(True).SetText(icn)
	icon.Pop(Button)
	Return Me 
End Sub

Sub SetToolTip(tt As String) As VMButton
	If tt = "" Then Return Me
	Dim el As VMTooltip
	el.Initialize(vue,$"${ID}tlt"$).SetText(tt)
	el.Pop(Button) 
	Return Me
End Sub

Sub SetText(t As String) As VMButton
	If t = "" Then Return Me
	Button.SetText(t)
	Return Me
End Sub

Sub ToString As String
	If hasBadge Then
		Dim strBTN As String = Button.ToString
		badge.SetText(strBTN)
		Return badge.tostring
	Else	
		Return Button.tostring
	End If
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