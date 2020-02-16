B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public EmptyState As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMEmptyState
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	EmptyState.Initialize(vue, ID).SetTag("md-empty-state")
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMEmptyState
	EmptyState.SetStyle(sm)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMEmptyState
	EmptyState.SetVIf(vif)
	Return Me
End Sub

Sub SetID(iID As String, bind As Boolean) As VMEmptyState
	EmptyState.SetID(iID,bind)
	Return Me
End Sub

Sub SetName(nam As String, bind As Boolean) As VMEmptyState
	EmptyState.SetName(nam, bind)
	Return Me
End Sub

Sub AddHTML(html As String) As VMEmptyState
	EmptyState.SetText(html)
	Return Me
End Sub

'add a child
Sub AddChild(child As VMElement) As VMEmptyState
	Dim childHTML As String = child.ToString
	EmptyState.SetText(childHTML)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

Sub SetKey(k As String, bind As Boolean) As VMEmptyState
	EmptyState.SetKey(k, bind)
	Return Me
End Sub

Sub SetIcon(icon As String) As VMEmptyState
	If icon = "" Then Return Me
	EmptyState.SetAttr(CreateMap("md-icon": icon))
	Return Me
End Sub

Sub SetLabel(labelx As String) As VMEmptyState
	If labelx = "" Then Return Me
	EmptyState.SetAttr(CreateMap("md-label": labelx))
	Return Me
End Sub

Sub SetDescription(labelx As String) As VMEmptyState
	If labelx = "" Then Return Me
	EmptyState.SetAttr(CreateMap("md-description": labelx))
	Return Me
End Sub

Sub SetRounded(b As Boolean) As VMEmptyState
	If b = False Then Return Me
	EmptyState.SetAttr(CreateMap("md-rounded": b))
	Return Me
End Sub

Sub SetSize(size As String) As VMEmptyState
	If size = "" Then Return Me
	EmptyState.SetAttr(CreateMap("md-size": size))
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMEmptyState
	If b = False Then Return Me
	EmptyState.AddClass("md-primary")
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMEmptyState
	If b = False Then Return Me
	EmptyState.AddClass("md-accent")
	Return Me
End Sub

Sub SetVShow(vif As String) As VMEmptyState
	EmptyState.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMEmptyState
	EmptyState.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMEmptyState
	EmptyState.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	Return EmptyState.tostring
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
