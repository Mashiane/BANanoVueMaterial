B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CardMedia As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
End Sub

'initialize the CardMedia
Public Sub Initialize(v As BANanoVue, sid As String) As VMCardMedia
	ID = sid.tolowercase
	CardMedia.Initialize(v, ID)
	CardMedia.SetTag("md-card-media")
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return CardMedia.ToString
End Sub

Sub SetVModel(k As String) As VMCardMedia
	CardMedia.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCardMedia
	CardMedia.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCardMedia
	CardMedia.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCardMedia
	Dim childHTML As String = child.ToString
	CardMedia.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCardMedia
	CardMedia.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCardMedia
	CardMedia.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCardMedia
	CardMedia.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCardMedia
	CardMedia.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMCardMedia
	CardMedia.SetPaddingAll(p)
	Return Me
End Sub

'Resizes Or clip the image automatically based on the following options
Sub SetRatio(varRatio As Object) As VMCardMedia
	SetAttr(CreateMap("md-ratio": varRatio))
	Return Me
End Sub

'Applies medium size To the media. Works only inside md-card-header.
Sub SetMedium(varMedium As Boolean) As VMCardMedia
	SetAttr(CreateMap(":md-medium": varMedium))
	Return Me
End Sub

'Applies big size To the media. Works only inside md-card-header.
Sub SetBig(varBig As Boolean) As VMCardMedia
	SetAttr(CreateMap(":md-big": varBig))
	Return Me
End Sub

