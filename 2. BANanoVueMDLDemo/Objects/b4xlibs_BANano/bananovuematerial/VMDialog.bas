B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Dialog As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private actions As VMElement
	Private BANano As BANano   'ignore
	Private bActive As Boolean
	Private Content As VMElement
	Private module As Object
	Public Container As VMContainer
End Sub

'events: _outside, _opened, _closed
Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDialog
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Dialog.Initialize(vue, $"${ID}dialog"$).SetTag("md-dialog")
	actions.Initialize(vue,$"${ID}actions"$).SetTag("md-dialog-actions")
	actions.RemoveAttr(":required")
	actions.RemoveAttr("v-show")
	bActive = False
	If ID <> "" Then
		SetActiveSync(ID)
	End If
	Content.Initialize(vue,$"${ID}content"$).SetTag("md-dialog-content")
	Content.RemoveAttr(":required")
	Container.Initialize(vue, sid & "grid", eventHandler)
	Container.RemoveAttr(":required")
	SetOnOpened
	SetOnClosed
	SetOnClickedOutside
	Dialog.RemoveAttr(":required")
	Dialog.RemoveAttr("v-show")
	Return Me
End Sub

Sub SetKey(k As String) As VMDialog
	Dialog.SetKey(k,True)
	Return Me
End Sub

Sub SetScrollBar(b As Boolean) As VMDialog
	Content.SetScrollBar(True)
	Return Me
End Sub


Sub SetStyle(m As Map) As VMDialog
	Dialog.SetStyle(m)
	Return Me
End Sub


Sub SetWidth(w As String) As VMDialog
	Dialog.SetStyle(CreateMap("width":w))
	Return Me
End Sub

Sub SetHeight(w As String) As VMDialog
	Dialog.SetStyle(CreateMap("width":w))
	Return Me
End Sub

Sub AddContent(cntText As VMElement) As VMDialog
	cntText.Pop(Content)
	Return Me
End Sub

Sub AddForm(frm As VMForm)
	AddHTML(frm.ToString)
End Sub

Sub AddHTML(htmlContent As String)
	Content.SetText(htmlContent)
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

Sub SetElevation(e As Int) As VMDialog
	Dialog.SetElevation(e)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMDialog
	Dialog.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDialog
	Dialog.SetAttr(attr)
	Return Me
End Sub

Sub SetContent(cntText As String) As VMDialog
	Dialog.SetText(cntText)
	Return Me
End Sub

Sub SetTitle(t As Object) As VMDialog
	Dim el As VMElement
	el.Initialize(vue,$"${ID}title"$).SetTagDialogTitle(True)
	el.SetText(t)
	el.Pop(Dialog)
	Return Me  
End Sub

Sub AddAction(btn As VMButton) As VMDialog
	btn.Pop(actions)
	Return Me
End Sub

Sub AddOK(btnID As String, Caption As String) As VMDialog
	Dim btn As VMButton
	btn.Initialize(vue, btnID, module)
	btn.SetText(Caption).SetPrimary(True)
	btn.RemoveAttr(":required")
	AddAction(btn)
	Return Me
End Sub

Sub AddCancel(btnID As String, Caption As String) As VMDialog
	Dim btn As VMButton
	btn.Initialize(vue, btnID, module)
	btn.SetText(Caption).SetAccent(True)
	btn.RemoveAttr(":required")
	AddAction(btn)
	Return Me
End Sub


Sub SetMaxWidth(mw As String) As VMDialog
	Dialog.SetMaxWidth(mw)
	Return Me
End Sub

Sub SetMaxHeight(mw As String) As VMDialog
	Dialog.SetMaxHeight(mw)
	Return Me
End Sub

private Sub SetActiveSync(a As Object) As VMDialog
	Dialog.SetActiveSync(a)
	bActive = True
	Return Me
End Sub

Sub ToString As String
	AddHTML(Container.ToString)
	Content.Pop(Dialog)
	If bActive = False Then
		Log($"VMDialog.SetActiveSync: '${ID}' has not been activated!"$)
	End If	
	If actions.hasContent Then
		actions.Pop(Dialog)
	End If
	Return Dialog.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

Sub SetFullScreen(b As Boolean) As VMDialog
	Dialog.SetAttr(CreateMap(":md-fullscreen": b))
	Return Me
End Sub

Sub SetClickOutsideToClose(b As Boolean) As VMDialog
	Dialog.SetAttr(CreateMap(":md-click-outside-to-close": b))
	Return Me
End Sub

Sub SetCloseOnEsc(b As Boolean) As VMDialog
	Dialog.SetAttr(CreateMap(":md-close-on-esc": b))
	Return Me
End Sub

Sub SetBackdrop(b As Boolean) As VMDialog
	Dialog.SetAttr(CreateMap(":md-backdrop": b))
	Return Me
End Sub

private Sub SetOnOpened As VMDialog
	Dim methodName As String = $"${ID}_opened"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	Dialog.SetAttr(CreateMap("v-on:md-opened": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

private Sub SetOnClosed As VMDialog
	Dim methodName As String = $"${ID}_closed"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	Dialog.SetAttr(CreateMap("v-on:md-closed": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

private Sub SetOnClickedOutside As VMDialog
	Dim methodName As String = $"${ID}_outside"$
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	Dialog.SetAttr(CreateMap("v-on:md-clicked-outside": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub