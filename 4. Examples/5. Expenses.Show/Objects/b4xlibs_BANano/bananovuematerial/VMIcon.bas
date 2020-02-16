B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Icon As VMElement
	Public ID As String
	Private vue As BANanoVue
	Public hasContent As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String) As VMIcon
	ID = sid.ToLowerCase
	vue = v
	Icon.Initialize(vue, ID).SetTag("md-icon")
	hasContent = False
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

'set onclick event
Sub SetOnClick(module As Object, methodName As String) As VMIcon
	Icon.SetOnClick(module, methodName)
	Return Me
End Sub

Sub SetBottomBarIcon(b As Boolean) As VMIcon
	Icon.AddClass("md-bottom-bar-icon")
	Return Me
End Sub

Sub SetSrc(src As String) As VMIcon
	SetAttr(CreateMap("md-src": src))
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMIcon
	Icon.AddClass(c)
	Return Me
End Sub

'set font awesome class
Sub SetFontAwesome(fa As String) As VMIcon
	AddClass(fa)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMIcon
	If vif = "" Then Return Me
	Icon.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMIcon
	If vif = "" Then Return Me
	Icon.SetVShow(vif)
	Return Me
End Sub


'set an attribute
Sub SetAttr(attr As Map) As VMIcon
	Icon.SetAttr(attr)
	Return Me
End Sub


Sub SetPrimary(b As Boolean) As VMIcon
	Icon.SetPrimary(b)
	Return Me
End Sub

Sub SetText(t As String) As VMIcon
	Icon.SetText(t)
	hasContent = True
	Return Me
End Sub

Sub SetID(iID As String, bind As Boolean) As VMIcon
	Icon.setid(iID, bind)
	Return Me
End Sub

Sub SetName(nam As String, bind As Boolean) As VMIcon
	Icon.SetName(nam, bind)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMIcon
	Icon.SetKey(k, bind)
	Return Me
End Sub

Sub ToString As String
	Return Icon.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'Set size of icon-md-size-2x
Sub SetSize2x(b As Boolean) As VMIcon    'ignore
	AddClass("md-size-2x")
	Return Me
End Sub

'Set size of icon-md-size-3x
Sub SetSize3x(b As Boolean) As VMIcon    'ignore
	AddClass("md-size-3x")
	Return Me
End Sub

'Set size of icon-md-size-4x
Sub SetSize4x(b As Boolean) As VMIcon    'ignore
	AddClass("md-size-4x")
	Return Me
End Sub

'Set size of icon-md-size-5x
Sub SetSize5x(b As Boolean) As VMIcon    'ignore
	AddClass("md-size-5x")
	Return Me
End Sub

