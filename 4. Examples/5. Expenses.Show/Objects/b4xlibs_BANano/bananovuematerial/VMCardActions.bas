B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public CardActions As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
End Sub

'initialize the CardActions
Public Sub Initialize(v As BANanoVue, sid As String) As VMCardActions
	ID = sid.tolowercase
	CardActions.Initialize(v, ID)
	CardActions.SetTag("md-card-actions")
	vue = v
	Return Me
End Sub

'get component
Sub ToString As String
	Return CardActions.ToString
End Sub

Sub SetVModel(k As String) As VMCardActions
	CardActions.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMCardActions
	CardActions.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMCardActions
	CardActions.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMCardActions
	Dim childHTML As String = child.ToString
	CardActions.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMCardActions
	CardActions.SetText(t)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMCardActions
	CardActions.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMCardActions
	CardActions.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMCardActions
	CardActions.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMCardActions
	CardActions.SetPaddingAll(p)
	Return Me
End Sub

'Alignment of action buttons
Sub SetAlignment(varAlignment As Object) As VMCardActions
	SetAttr(CreateMap("md-alignment": varAlignment))
	Return Me
End Sub

