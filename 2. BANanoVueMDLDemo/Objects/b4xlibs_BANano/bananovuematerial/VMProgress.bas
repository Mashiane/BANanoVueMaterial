B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Progress As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private module As Object   'ignore
	Private bindvalue As String
	Private buffervalue As String
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMProgress
	ID = sid.ToLowerCase
	vue = v
	Progress.Initialize(vue, ID).SetTag("md-progress-bar")
	module = eventHandler
	bindvalue = $"${ID}value"$
	buffervalue = $"${ID}buffer"$
	SetValue(Null)
	SetBuffer(Null)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMProgress
	Progress.SetStyle(m)
	Return Me
End Sub

Sub SetMargin(p As String) As VMProgress
	Progress.SetStyle(CreateMap("margin":p))
	Return Me
End Sub

Sub SetPadding(p As String) As VMProgress
	Progress.SetStyle(CreateMap("padding":p))
	Return Me
End Sub


Sub SetMode(varMode As String) As VMProgress
	Progress.SetAttr1("md-mode", varMode)
	Return Me
End Sub

Sub SetModeDeterminate(b As Boolean) As VMProgress
	If b = False Then Return Me
	SetMode("determinate")
	Return Me
End Sub

Sub SetModeInDeterminate(b As Boolean) As VMProgress
	If b = False Then Return Me
	SetMode("indeterminate")
	Return Me
End Sub

Sub SetModeQuery(b As Boolean) As VMProgress
	If b = False Then Return Me
	SetMode("query")
	Return Me
End Sub


Sub SetModeBuffer(b As Boolean) As VMProgress
	If b = False Then Return Me
	SetMode("buffer")
	Return Me
End Sub

Sub SetBuffer(bValue As Int) As VMProgress
	vue.SetStateSingle(buffervalue, bValue)
	Progress.SetAttr1(":md-buffer", buffervalue)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMProgress
	Progress.SetTabIndex(ti)
	Return Me
End Sub

Sub SetVShow(vshow As String) As VMProgress
	Progress.SetVShow(vshow)
	Return Me
End Sub

Sub SetVIf(vshow As String) As VMProgress
	Progress.SetVif(vshow)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMProgress
	Progress.SetPrimary(b)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMProgress
	Progress.SetAccent(b)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMProgress
	Progress.SetName(varName, bind)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetValue(valueInt As Int) As VMProgress
	Progress.SetAttr1(":md-value", bindvalue)
	vue.SetStateSingle(bindvalue, valueInt)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMProgress
	Progress.SetDisabled(b)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMProgress
	Progress.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMProgress
	Progress.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	Return Progress.tostring
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