B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Snackbar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private bActive As Boolean
	Private module As Object
	Private mKey As String
	Public Button As VMButton
	Private mName As String
End Sub

'initialize the Snackbar
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMSnackbar
	ID = sid.tolowercase
	Snackbar.Initialize(v, ID)
	Snackbar.SetTag("md-snackbar")
	module = eventHandler
	vue = v
	bActive = False
	If ID <> "" Then
		SetActiveSync(ID)
	End If
	SetOnOpened
	SetOnClosed
	mKey = $"${ID}message"$
	vue.SetStateSingle(mKey, Null)
	SetText1($"{{ ${mKey} }}"$)
	Button.Initialize(vue, "snackbutton", Me)
	mName = ""
	Hide
	Return Me
End Sub

'set the click method for the button
Sub SetOnClick(methodName As String) As VMSnackbar
	mName = methodName.ToLowerCase
	Return Me
End Sub

Sub snackbutton_click(e As BANanoEvent)
	If mName = "" Then
		Log($"VMSnackbar.snackbutton_click: 'SetOnClick' has not been set!"$)
	End If
	Hide
	BANano.CallSub(module, mName, Null)
End Sub

'get component
Sub ToString As String
	If bActive = False Then
		Log($"VMSnackbar.SetActiveSync: '${ID}' has not been activated!"$)
	End If
	Button.Pop(Snackbar)
	Return Snackbar.ToString
End Sub

private Sub SetActiveSync(v As String) As VMSnackbar
	Snackbar.SetActiveSync(v)
	bActive = True
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
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

'add a child
Sub AddChild(child As VMElement) As VMSnackbar
	Dim childHTML As String = child.ToString
	Snackbar.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As String) As VMSnackbar
	vue.SetStateSingle(mKey, t)
	Return Me
End Sub

'set text
private Sub SetText1(t As String) As VMSnackbar
	Dim span As VMElement
	span.Initialize(vue,$"${ID}text"$).SetTag("span").SetText(t)
	span.Pop(Snackbar)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMSnackbar
	Snackbar.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMSnackbar
	Snackbar.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMSnackbar
	Snackbar.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMSnackbar
	Snackbar.SetPaddingAll(p)
	Return Me
End Sub

'Sets the duration in milliseconds before close the snackbar.
Sub SetDuration(varDuration As Int) As VMSnackbar
	Dim pp As String = $"${ID}duration"$
	vue.SetStateSingle(pp, varDuration)
	SetAttr(CreateMap(":md-duration": pp))
	Return Me
End Sub

'This will make the snackbar persistent in your application, even changing routes.
Sub SetPersistent(varPersistent As Boolean) As VMSnackbar
	Dim pp As String = $"${ID}persistent"$
	vue.SetStateSingle(pp, varPersistent)
	SetAttr(CreateMap(":md-persistent": pp))
	Return Me
End Sub

'Sets the snackbar position on the bottom of the screen.
Sub SetPosition(varPosition As Object) As VMSnackbar
	Dim pp As String = $"${ID}position"$
	vue.SetStateSingle(pp, varPosition)
	SetAttr(CreateMap(":md-position": pp))
	Return Me
End Sub

'Sets the snackbar position on the bottom of the screen.-center
Sub SetPositionCenter(b As Boolean) As VMSnackbar    'ignore
	SetPosition("center")
	Return Me
End Sub

'Sets the snackbar position on the bottom of the screen.-left
Sub SetPositionLeft(b As Boolean) As VMSnackbar    'ignore
	SetPosition("left")
	Return Me
End Sub

'Triggered when a snackbar opens
private Sub SetOnOpened As VMSnackbar
	Dim methodName As String  = $"${ID}_opened"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:md-opened": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when a snackbar closes
private Sub SetOnClosed As VMSnackbar
	Dim methodName As String = $"${ID}_closed"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:md-closed": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

