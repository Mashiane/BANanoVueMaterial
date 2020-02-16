B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Prompt As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private bActive As Boolean
	Private module As Object
	Private bStatic As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMPrompt
	ID = sid.ToLowerCase
	vue = v
	Prompt.Initialize(vue, ID).SetTag("md-dialog-prompt")
	bActive = False
	If ID <> "" Then
		SetActiveSync(ID)
	End If
	module = eventHandler
	Prompt.SetOnConfirm(module, $"${ID}_ok"$)
	Prompt.SetOnCancel(module, $"${ID}_cancel"$)
	bStatic = False
	SetVModel("promptvalue")
	vue.SetStateSingle("promptvalue",Null)
	Return Me
End Sub



Sub Hide
	Dim opt As Map = CreateMap()
	opt.Put(ID, False)
	vue.SetState(opt)
End Sub

Sub Show
	Dim opt As Map = CreateMap()
	opt.Put(ID, True)
	vue.SetState(opt)
End Sub

Sub SetStatic(b As Boolean) As VMPrompt
	bStatic = b
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMPrompt
	Prompt.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMPrompt
	Prompt.SetAttr(attr)
	Return Me
End Sub


Sub SetVModel(k As String) As VMPrompt
	Prompt.SetVModel(k)
	Return Me
End Sub


Sub SetInputName(n As Object) As VMPrompt
	Prompt.SetAttr(CreateMap("md-input-name": n))
	Return Me
End Sub

Sub SetInputID(n As Object) As VMPrompt
	Prompt.SetAttr(CreateMap("md-input-id": n))
	Return Me
End Sub

Sub SetMaxLength(ml As Int) As VMPrompt
	If ml < 0 Then Return Me
	If bStatic Then
		Prompt.SetAttr(CreateMap("md-input-maxlength": ml))
		Return Me
	End If
	vue.SetState(CreateMap("promptmaxlength":ml))
	Prompt.SetAttr(CreateMap(":md-input-maxlength": "promptmaxlength"))
	Return Me
End Sub

Sub SetPlaceHolder(ph As String) As VMPrompt
	If bStatic Then
		Prompt.SetAttr(CreateMap("md-input-placeholder": ph))
		Return Me
	End If
	vue.SetState(CreateMap("promptplaceholder":ph))
	Prompt.SetAttr(CreateMap(":md-input-placeholder": "promptplaceholder"))
	Return Me
End Sub

Sub SetCancelText(c As String) As VMPrompt
	If bStatic Then
		Prompt.SetAttr(CreateMap("md-cancel-text": c))
		Return Me
	End If
	vue.SetState(CreateMap("promptcanceltext":c))
	Prompt.SetAttr(CreateMap(":md-cancel-text": "promptcanceltext"))
	Return Me
End Sub

private Sub SetActiveSync(a As Object) As VMPrompt
	Prompt.SetActiveSync(a)
	bActive = True
	Return Me
End Sub

Sub SetContent(c As String) As VMPrompt
	If bStatic Then
		Prompt.SetAttr(CreateMap("md-content": c))
		Return Me
	End If
	vue.SetState(CreateMap("promptcontent":c))
	Prompt.SetAttr(CreateMap(":md-content": "promptcontent"))
	Return Me
End Sub

Sub SetConfirmText(t As String) As VMPrompt
	If bStatic Then
		Prompt.SetAttr(CreateMap("md-confirm-text":t))
		Return Me
	End If
	vue.SetState(CreateMap("promptconfirmtext":t))
	Prompt.SetAttr(CreateMap(":md-confirm-text":"promptconfirmtext"))
	Return Me
End Sub

Sub SetTitle(t As String) As VMPrompt
	If bStatic Then
		Prompt.SetAttr(CreateMap("md-title":t))
		Return Me
	End If
	vue.SetState(CreateMap("prompttitle":t))
	Prompt.SetAttr(CreateMap(":md-title":"prompttitle"))
	Return Me
End Sub


Sub ToString As String
	Return Prompt.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub