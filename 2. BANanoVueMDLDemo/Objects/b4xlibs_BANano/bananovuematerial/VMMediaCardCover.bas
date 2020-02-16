B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public MediaCardCover As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
End Sub

'initialize the MediaCardCover
Public Sub Initialize(v As BANanoVue, sid As String) As VMMediaCardCover
	ID = sid.tolowercase
	MediaCardCover.Initialize(v, ID)
	MediaCardCover.SetTag("md-card-media-cover")
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return MediaCardCover.ToString
End Sub

Sub SetVModel(k As String) As VMMediaCardCover
	MediaCardCover.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMMediaCardCover
	MediaCardCover.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMMediaCardCover
	MediaCardCover.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMMediaCardCover
	Dim childHTML As String = child.ToString
	MediaCardCover.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMMediaCardCover
	MediaCardCover.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMMediaCardCover
	MediaCardCover.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMMediaCardCover
	MediaCardCover.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMMediaCardCover
	MediaCardCover.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMMediaCardCover
	MediaCardCover.SetPaddingAll(p)
	Return Me
End Sub

'Applies a gradient background based on the image.
Sub SetTextScrim(varText As Boolean) As VMMediaCardCover
SetAttr(CreateMap(":md-text-scrim": varText))
Return Me
End Sub

'Applies solid background
Sub SetSolid(varSolid As Boolean) As VMMediaCardCover
SetAttr(CreateMap(":md-solid": varSolid))
Return Me
End Sub

