B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Spinner As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private module As Object   'ignore
	Private bindvalue As String
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSpinner
	ID = sid.ToLowerCase
	vue = v
	Spinner.Initialize(vue, ID).SetTag("md-progress-spinner")
	module = eventHandler
	bindvalue = $"${ID}value"$
	SetValue(Null)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetValue(valueInt As Int) As VMSpinner
	Spinner.SetAttr1(":md-value", bindvalue)
	vue.SetStateSingle(bindvalue, valueInt)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMSpinner
	Spinner.SetStyle(m)
	Return Me
End Sub

Sub SetMargin(p As String) As VMSpinner
	Spinner.SetStyle(CreateMap("margin":p))
	Return Me
End Sub

Sub SetPadding(p As String) As VMSpinner
	Spinner.SetStyle(CreateMap("padding":p))
	Return Me
End Sub


Sub SetMode(varMode As String) As VMSpinner
	Spinner.SetAttr1("md-mode", varMode)
	Return Me
End Sub

Sub SetModeDeterminate(b As Boolean) As VMSpinner
	If b = False Then Return Me
	SetMode("determinate")
	Return Me
End Sub

Sub SetModeInDeterminate(b As Boolean) As VMSpinner
	If b = False Then Return Me
	SetMode("indeterminate")
	Return Me
End Sub

Sub SetStroke(bValue As Int) As VMSpinner
	Spinner.SetAttr1(":md-stroke", bValue)
	Return Me
End Sub

Sub SetDiameter(bValue As Int) As VMSpinner
	Spinner.SetAttr1(":md-diameter", bValue)
	Return Me
End Sub


Sub SetTabIndex(ti As String) As VMSpinner
	Spinner.SetTabIndex(ti)
	Return Me
End Sub

Sub SetVShow(vshow As String) As VMSpinner
	Spinner.SetVShow(vshow)
	Return Me
End Sub

Sub SetVIf(vshow As String) As VMSpinner
	Spinner.SetVif(vshow)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMSpinner
	Spinner.SetPrimary(b)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMSpinner
	Spinner.SetAccent(b)
	Return Me
End Sub

'The Select name. Similar To HTML5 name attribute.
Sub SetName(varName As Object, bind As Boolean) As VMSpinner
	Spinner.SetName(varName, bind)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMSpinner
	Spinner.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSpinner
	Spinner.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	Return Spinner.tostring
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