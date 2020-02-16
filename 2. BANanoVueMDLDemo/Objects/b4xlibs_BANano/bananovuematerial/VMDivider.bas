B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
	#IgnoreWarnings:12
Sub Class_Globals
	Public Divider As VMElement
	Public ID As String
	Private vue As BANanoVue
End Sub

Public Sub Initialize(v As BANanoVue, sid As String) As VMDivider
	ID = sid.ToLowerCase
	vue = v
	Divider.Initialize(vue, ID).SetTag("md-divider")
	Return Me
End Sub

Sub SetInset(b As Boolean) As VMDivider
	If b Then Divider.addclass("md-inset")
	Return Me
End Sub

Sub ToString As String
	Return Divider.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub