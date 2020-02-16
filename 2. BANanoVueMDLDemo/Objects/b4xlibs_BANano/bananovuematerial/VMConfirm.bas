B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Confirm As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private bActive As Boolean
	Private module As Object
	Private bstatic As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMConfirm
	ID = sid.ToLowerCase
	vue = v
	Confirm.Initialize(vue, ID).SetTag("md-dialog-confirm")
	bActive = False
	If ID <> "" Then
		SetActiveSync(ID)
	End If
	module = eventHandler
	Confirm.SetOnConfirm(module, $"${ID}_ok"$)
	Confirm.SetOnCancel(module, $"${ID}_cancel"$)
	bstatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMConfirm
	bstatic = b
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

'add a class
Sub AddClass(c As String) As VMConfirm
	Confirm.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMConfirm
	Confirm.SetAttr(attr)
	Return Me
End Sub

Sub SetCancelText(c As String) As VMConfirm
	If bstatic Then
		Confirm.SetAttr(CreateMap("md-cancel-text": c))
		Return Me
	End If
	vue.SetState(CreateMap("canceltext":c))
	Confirm.SetAttr(CreateMap(":md-cancel-text": "canceltext"))
	Return Me
End Sub

private Sub SetActiveSync(a As Object) As VMConfirm
	Confirm.SetActiveSync(a)
	bActive = True
	Return Me
End Sub

Sub SetContent(c As String) As VMConfirm
	If bstatic Then
		Confirm.SetAttr(CreateMap("md-content": c))
		Return Me
	End If
	vue.SetState(CreateMap("confirmmessage":c))
	Confirm.SetAttr(CreateMap(":md-content": "confirmmessage"))
	Return Me
End Sub

Sub SetConfirmText(t As String) As VMConfirm
	If bstatic Then
		Confirm.SetAttr(CreateMap("md-confirm-text":t))
		Return Me
	End If
	vue.SetState(CreateMap("confirmtext":t))
	Confirm.SetAttr(CreateMap(":md-confirm-text":"confirmtext"))
	Return Me
End Sub

Sub SetTitle(t As String) As VMConfirm
	If bstatic Then
		Confirm.SetAttr(CreateMap("md-title":t))
		Return Me
	End If
	vue.SetState(CreateMap("confirmtitle":t))
	Confirm.SetAttr(CreateMap(":md-title":"confirmtitle"))
	Return Me
End Sub


Sub ToString As String
	If bActive = False Then
		Log($"VMConfirm.SetActiveSync: '${ID}' has not been activated!"$)
	End If
	Return Confirm.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub