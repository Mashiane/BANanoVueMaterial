B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Alert As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Private bActive As Boolean
	Private module As Object  'ignore
	Private bStatic As Boolean
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMAlert
	ID = sid.ToLowerCase
	vue = v
	Alert.Initialize(vue, ID).SetTag("md-dialog-alert")
	bActive = False
	If ID <> "" Then
		SetActiveSync(ID)
	End If
	module = eventHandler
	bStatic = False
	Return Me
End Sub

Sub SetStatic(b As Boolean) As VMAlert
	bStatic = b
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
Sub AddClass(c As String) As VMAlert
	Alert.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMAlert
	Alert.SetAttr(attr)
	Return Me
End Sub

private Sub SetActiveSync(a As Object) As VMAlert
	Alert.SetActiveSync(a)
	bActive = True
	Return Me
End Sub

Sub SetContent(c As String) As VMAlert
	If bStatic Then
		Alert.SetAttr(CreateMap("md-content": c))
		Return Me
	End If
	vue.SetState(CreateMap("alertmessage":c))
	Alert.SetAttr(CreateMap(":md-content": "alertmessage"))
	Return Me
End Sub

Sub SetConfirmText(t As String) As VMAlert
	If bStatic Then
		Alert.SetAttr(CreateMap("md-confirm-text":t))
		Return Me
	End If
	vue.SetState(CreateMap("confirmtext":t))
	Alert.SetAttr(CreateMap(":md-confirm-text":"confirmtext"))
	Return Me
End Sub

Sub SetTitle(t As String) As VMAlert
	If bStatic Then
		Alert.SetAttr(CreateMap("md-title":t))
		Return Me
	End If
	vue.SetState(CreateMap("alerttitle":t))
	Alert.SetAttr(CreateMap(":md-title":"alerttitle"))
	Return Me
End Sub


Sub ToString As String
	If bActive = False Then
		Log($"VMAlert.SetActiveSync: '${ID}' has not been activated!"$)
	End If	
	Return Alert.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub