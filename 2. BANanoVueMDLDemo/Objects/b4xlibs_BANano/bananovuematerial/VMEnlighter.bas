B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Enlighter As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private codeName As String
	Private codevisible As String
	Private options As Map
	Private CodeEL As VMElement
End Sub

'initialize the Enlighter
Public Sub Initialize(v As BANanoVue, sid As String, lang As String) As VMEnlighter
	ID = sid.tolowercase
	Enlighter.Initialize(v, ID).SetTag("pre")
	Enlighter.SetAttr(CreateMap("data-enlighter-language":lang))
	Enlighter.SetAttr(CreateMap("data-enlighter-linenumbers":"true"))
	vue = v
	Enlighter.SetStyle(CreateMap("width":"100% !important", "height":"80vh !important"))
	'
	codeName = $"${ID}code"$
	CodeEL.Initialize(v, codeName).SetTag("code")
	CodeEL.SetText($"{{ ${codeName} }}"$)
	CodeEL.AddClass("col s12").AddClass("special")
	CodeEL.SetAttr(CreateMap("data-enlighter-language":lang))
	CodeEL.SetAttr(CreateMap("data-enlighter-linenumbers":"true"))
	
	'
	SetText("")
	codevisible = $"${ID}visible"$
	SetVIf(codevisible)
	SetVisible(True)
	options.Initialize 
	options.Put("language", lang)
	options.Put("indent", 4)
	options.Put("showLinenumbers", True)
	options.Put("renderer", "Inline")
	Return Me
End Sub

Sub SetElevation(e As Int) As VMEnlighter
	Enlighter.SetElevation(e)
	Return Me
End Sub

Sub SetVisible(b As Boolean)
	vue.SetStateSingle(codevisible, b)
End Sub

Sub SetVIf(vif As String) As VMEnlighter
	Enlighter.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMEnlighter
	Enlighter.SetVShow(vif)
	Return Me
End Sub

'add text to the prim
Sub SetText(sText As String) As VMEnlighter
	vue.SetStateSingle(codeName, sText)
	Return Me
End Sub

Sub Refresh
	Dim bo As BANanoObject = BANano.Window.GetField("document").RunMethod("id", codeName)
	bo.RunMethod("enlight", options)
End Sub

'get component
Sub ToString As String
	Enlighter.AddElement(CodeEL)
	Return Enlighter.ToString
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMEnlighter
	Enlighter.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMEnlighter
	Enlighter.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMEnlighter
	Enlighter.SetStyle(sm)
	Return Me
End Sub

'set padding
Sub SetPadding(p As Object) As VMEnlighter
	Enlighter.SetPaddingAll(p)
	Return Me
End Sub

