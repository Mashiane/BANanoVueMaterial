B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Label As VMElement
	Public ID As String
	Private vue As BANanoVue
End Sub

Public Sub Initialize(v As BANanoVue, sid As String) As VMLabel
	ID = sid.ToLowerCase
	vue = v
	Label.Initialize(vue, ID).SetTag("label")
	Label.RemoveAttr(":required")
	Return Me
End Sub

Sub SetDisplay4(b As Boolean) As VMLabel
	Label.SetDisplay4(b)
	Return Me
End Sub

Sub SetDisplay3(b As Boolean) As VMLabel
	Label.SetDisplay3(b)
	Return Me
End Sub

Sub SetDisplay2(b As Boolean) As VMLabel
	Label.SetDisplay2(b)
	Return Me
End Sub

Sub SetDisplay1(b As Boolean) As VMLabel
	Label.SetDisplay1(b)
	Return Me
End Sub

Sub SetHeadline(b As Boolean) As VMLabel
	Label.SetHeadline(b)
	Return Me
End Sub

Sub SetTitle(b As Boolean) As VMLabel
	Label.SetTitle(b)
	Return Me
End Sub

Sub SetTransparent(b As Boolean) As VMLabel
	Label.SetTransparent(b)
	Return Me
End Sub

Sub SetVerticalAlignMiddle As VMLabel
	Label.SetVerticalAlignMiddle
	Return Me
End Sub

Sub SetSubHeading(b As Boolean) As VMLabel
	Label.SetSubHeading(b)
	Return Me
End Sub

Sub SetBody2(b As Boolean) As VMLabel
	Label.SetBody2(b)
	Return Me
End Sub

Sub SetBody1(b As Boolean) As VMLabel
	Label.SetBody1(b)
	Return Me
End Sub

Sub SetCaption(b As Boolean) As VMLabel
	Label.SetCaption(b)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMLabel
	Label.SetDisabled(b)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMLabel
	If vif = "" Then Return Me
	Label.SetVShow(vif)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMLabel
	Label.SetStyle(sm)
	Return Me
End Sub

Sub SetText(t As String) As VMLabel
	Label.SetText(t)
	Return Me
End Sub

Sub SetParagraph As VMLabel
	Label.SetTag("p")
	Return Me
End Sub

Sub SetH1 As VMLabel
	Label.SetTag("h1")
	Return Me
End Sub

Sub SetTag(size As String) As VMLabel
	Label.SetTag(size)
	Return Me
End Sub

Sub SetH2 As VMLabel
	Label.SetTag("h2")
	Return Me
End Sub


Sub SetH3 As VMLabel
	Label.SetTag("h3")
	Return Me
End Sub

Sub SetH4 As VMLabel
	Label.SetTag("h4")
	Return Me
End Sub

Sub SetSpan As VMLabel
	Label.SetTag("span")
	Return Me
End Sub

Sub SetH5 As VMLabel
	Label.SetTag("h5")
	Return Me
End Sub

Sub SetH6 As VMLabel
	Label.SetTag("h6")
	Return Me
End Sub

Sub SetElevation(e As Int) As VMLabel
	Label.SetElevation(e)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMLabel
	Label.AddClass(c)
	Return Me
End Sub

'add a child
Sub AddChild(child As VMElement) As VMLabel
	Dim childHTML As String = child.ToString
	Label.SetText(childHTML)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMLabel
	Label.SetAttr(attr)
	Return Me
End Sub
'
'Sub SetFor(f As String) As VMLabel
'	Label.SetAttr(CreateMap("for": f))
'	Return Me
'End Sub

Sub ToString As String
	Return Label.tostring
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