B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Tooltip As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private bActive As Boolean
End Sub

'initialize the Tooltip
Public Sub Initialize(v As BANanoVue, sid As String) As VMTooltip
	ID = sid.tolowercase
	Tooltip.Initialize(v, ID)
	Tooltip.SetTag("md-tooltip")
	vue = v
	bActive = False
	If ID <> "" Then
		SetActiveSync(ID)
	End If
	Return Me
End Sub

private Sub SetActiveSync(v As String) As VMTooltip
	Tooltip.SetActiveSync(v)
	bActive = True
	Return Me
End Sub

'get component
Sub ToString As String
	Return Tooltip.ToString
End Sub

Sub SetVModel(k As String) As VMTooltip
	Tooltip.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMTooltip
	Tooltip.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMTooltip
	Tooltip.SetVShow(vif)
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMTooltip
	Dim childHTML As String = child.ToString
	Tooltip.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMTooltip
	Tooltip.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMTooltip
	Tooltip.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMTooltip
	Tooltip.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMTooltip
	Tooltip.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMTooltip
	Tooltip.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMTooltip
	Tooltip.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMTooltip
	Tooltip.SetPaddingAll(p)
	Return Me
End Sub

'Specifies where the tooltip will appear based on the parent element.
Sub SetDirection(varDirection As Object) As VMTooltip
	SetAttr(CreateMap("md-direction": varDirection))
	Return Me
End Sub

'Specifies where the tooltip will appear based on the parent element.-top
Sub SetDirectionTop(b As Boolean) As VMTooltip    'ignore
	SetAttr(CreateMap("md-direction": "top"))
	Return Me
End Sub

'Specifies where the tooltip will appear based on the parent element.-right
Sub SetDirectionRight(b As Boolean) As VMTooltip    'ignore
	SetAttr(CreateMap("md-direction": "right"))
	Return Me
End Sub

'Specifies where the tooltip will appear based on the parent element.-bottom
Sub SetDirectionBottom(b As Boolean) As VMTooltip    'ignore
	SetAttr(CreateMap("md-direction": "bottom"))
	Return Me
End Sub

'Specifies where the tooltip will appear based on the parent element.-left
Sub SetDirectionLeft(b As Boolean) As VMTooltip    'ignore
	SetAttr(CreateMap("md-direction": "left"))
	Return Me
End Sub

'Postpones the exhibition of a tooltip. In milliseconds
Sub SetDelay(varDelay As Object) As VMTooltip
	SetAttr(CreateMap("md-delay": varDelay))
	Return Me
End Sub

'Used To trigger the visibility of a tooltip.
Sub SetActive(varActive As Object) As VMTooltip
	SetAttr(CreateMap("md-active": varActive))
	Return Me
End Sub

