B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Badge As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private badValue As String
End Sub

'initialize the Badge
Public Sub Initialize(v As BANanoVue, sid As String) As VMBadge
	ID = sid.tolowercase
	Badge.Initialize(v, ID)
	Badge.SetTag("md-badge")
	vue = v
	badValue = $"${ID}value"$
	If ID <> "" Then
	vue.SetStateSingle(badValue,"0")
	SetAttr(CreateMap("v-bind:md-content": badValue))
	End If
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMBadge
	Badge.SetDisabled(b)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMBadge
	If vif = "" Then Return Me
	Badge.SetVShow(vif)
	Return Me
End Sub

Sub SetButton(btn As VMButton) As VMBadge
	btn.Pop(Badge)
	Return Me
End Sub

Sub SetAvatar(avtr As VMAvatar) As VMBadge
	avtr.Pop(Badge)
	Return Me
End Sub

'get component
Sub ToString As String
	Return Badge.ToString
End Sub

Sub SetPrimary(b As Boolean) As VMBadge
	If b Then Badge.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMBadge
	If b Then Badge.SetAccent(True)
	Return Me
End Sub


Sub SetVModel(k As String) As VMBadge
	Badge.SetVModel(k)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'set text
Sub SetText(t As Object) As VMBadge
	Badge.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMBadge
	Badge.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMBadge
	Badge.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMBadge
	Badge.SetStyle(sm)
	Return Me
End Sub

'add a child
Sub AddChild(child As VMElement) As VMBadge
	Dim childHTML As String = child.ToString
	Badge.SetText(childHTML)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMBadge
	Badge.SetPaddingAll(p)
	Return Me
End Sub

'A content For badge
Sub SetContent(varContent As Int) As VMBadge
	vue.SetStateSingle(badValue,varContent)	
	Return Me
End Sub

'Position of badge
Sub SetPosition(varPosition As Object) As VMBadge
	SetAttr(CreateMap("md-position": varPosition))
	Return Me
End Sub

'Position of badge-top
Sub SetPositionTop(b As Boolean) As VMBadge    'ignore
	SetAttr(CreateMap("md-position": "top"))
	Return Me
End Sub

'Position of badge-bottom
Sub SetPositionBottom(b As Boolean) As VMBadge    'ignore
	SetAttr(CreateMap("md-position": "bottom"))
	Return Me
End Sub

'Enables the dense layout
Sub SetDense(varDense As Boolean) As VMBadge
	If varDense Then SetAttr(CreateMap(":md-dense": varDense))
	Return Me
End Sub

'Enables square-md-square
Sub SetSquare(b As Boolean) As VMBadge    'ignore
	If b = True Then AddClass("md-square")
	Return Me
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
