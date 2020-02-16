B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Avatar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private img As VMElement
	Private hasImage As Boolean
	Private hasBadge As Boolean
	Private badge As VMBadge
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMAvatar
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Avatar.Initialize(vue, ID).SetTag("md-avatar")
	img.Initialize(vue,$"${ID}img"$).SetTag("img")
	hasImage = False
	hasBadge = False
	badge.Initialize(vue, $"${ID}badge"$)
	Return Me
End Sub

Sub SetBadgeContent(counted As Int) As VMAvatar
	badge.SetContent(counted)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgePrimary As VMAvatar
	badge.SetPrimary(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeAccent As VMAvatar
	badge.SetAccent(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeOnTop As VMAvatar
	badge.SetPositionTop(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeOnBottom As VMAvatar
	badge.SetPositionBottom(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeDense As VMAvatar
	badge.SetDense(True)
	hasBadge = True
	Return Me
End Sub

Sub SetBadgeSquare As VMAvatar
	badge.SetSquare(True)
	hasBadge = True
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMAvatar
	Avatar.SetDisabled(b)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMAvatar
	If vif = "" Then Return Me
	Avatar.SetVShow(vif)
	Return Me
End Sub

Sub SetMenuTrigger(b As Boolean) As VMAvatar
	Avatar.SetAttr(CreateMap(":md-menu-trigger": b))
	Return Me
End Sub


Sub SetText(t As String) As VMAvatar
	Avatar.SetText(t)
	Return Me
End Sub

Sub SetTextRipple(t As String) As VMAvatar
	Dim el As VMElement
	el.Initialize(vue,$"${ID}txt"$).SetTag("md-ripple").SetText(t)
	el.Pop(Avatar)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMAvatar
	If b Then Avatar.AddClass("md-primary")
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMAvatar
	If b Then Avatar.AddClass("md-accent")
	Return Me
End Sub

Sub SetID(sid As String) As VMAvatar
	ID = sid.ToLowerCase
	Return Me
End Sub

Sub SetElevation(e As Int) As VMAvatar
	Avatar.SetElevation(e)
	Return Me
End Sub


Sub SetToolTip(tt As String) As VMAvatar
	If tt = "" Then Return Me
	Dim el As VMTooltip
	el.Initialize(vue,$"${ID}tlt"$).SetText(tt)
	el.Pop(Avatar)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMAvatar
	Avatar.AddClass(c)
	Return Me
End Sub

Sub SetSmall(b As Boolean) As VMAvatar
	If b Then Avatar.AddClass("md-small")
	Return Me
End Sub

Sub SetIcon(icn As String) As VMAvatar
	If icn = "" Then Return Me
	SetAvatarIcon(True)
	Dim icon As VMIcon
	icon.Initialize(vue,$"${ID}icn"$).SetText(icn)
	icon.pop(Avatar)
	Return Me
End Sub

Sub SetAvatarIcon(b As Boolean) As VMAvatar
	If b Then Avatar.AddClass("md-avatar-icon")
	Return Me
End Sub

Sub SetLarge(b As Boolean) As VMAvatar
	If b Then Avatar.AddClass("md-large")
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMAvatar
	Avatar.SetAttr(attr)
	Return Me
End Sub

Sub SetAlt(a As String) As VMAvatar
	img.SetAlt(a)
	Return Me
End Sub

Sub SetValue(imgURL As String) As VMAvatar
	If ID = "" Then
		Log("VMAvatar.SetValue: You need to set the ID of the image.")
	End If
	Dim lkey As String = $"${ID}url"$
	img.SetSRC(lkey,True)
	vue.SetStateSingle(lkey, imgURL)
	hasImage = True
	Return Me
End Sub

Sub ToString As String
	If hasImage Then img.Pop(Avatar)
	
	If hasBadge Then
		Dim strBTN As String = Avatar.ToString
		badge.SetText(strBTN)
		Return badge.tostring
	Else
		Return Avatar.tostring
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