B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Drawer As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private bActive As Boolean
	Private DrawerList As VMList
	Private items As Map
	Private mshow As String
	Public ToolBar As VMToolBar
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMDrawer
	ID = sid.ToLowerCase
	vue = v
	Drawer.Initialize(vue, ID).SetTag("md-app-drawer")
	bActive = False
	If ID <> "" Then
		SetActiveSync(ID)
	End If
	module = eventHandler
	DrawerList.Initialize(vue,$"${ID}list"$, eventHandler)
	DrawerList.SetExpandSingle(True)
	items.Initialize
	mshow = ""
	ToolBar.Initialize(vue,$"${ID}tblbar"$, eventHandler) 
	ToolBar.SetTransparent(True).SetElevation(0)
	ToolBar.SetTitle("")
	Drawer.RemoveAttr("v-show")
	Return Me
End Sub

Sub SetTitle(newTitle As String) As VMDrawer
	vue.SetState(CreateMap("drawertblbartitle":newTitle))
	Return Me
End Sub

Sub UpdateTitle(newTitle As String) As VMDrawer
	vue.SetState(CreateMap("drawertblbartitle":newTitle))
	Return Me
End Sub

Sub Toggle
	vue.ToggleState(ID)
	Dim bstate As Boolean = vue.GetState(ID,True)
	vue.SetStateSingle("back1show", bstate)
End Sub

'show the drawer
Sub Show
	vue.SetStateSingle(ID,True)
	'SetVisible(True)
End Sub

'hide the drawer
Sub Hide
	vue.SetStateSingle(ID, False)
	'SetVisible(False)
End Sub

Sub SetVShow(vshow As String) As VMDrawer
	Drawer.SetVShow(vshow)
	mshow = vshow
	Return Me
End Sub

Sub SetVIf(vshow As String) As VMDrawer
	Drawer.SetVif(vshow)
	mshow = vshow
	Return Me
End Sub

'set width of the drawer
Sub SetWidth(width As String)
	vue.SetStyle(".md-drawer", "width", width)
End Sub

Sub AddAvatar(key As String, imgURL As String, text As String)
	Dim item As VMListItem
	item.Initialize(vue, key, module)
	item.SetAvatar(imgURL)
	item.SetText(text)
	items.Put(key, item)
End Sub

Sub AddSubAvatar(parent As String, key As String, imgURL As String, text As String)
	If items.ContainsKey(parent) Then
		Dim li As VMListItem = items.Get(parent)
		Dim pl As VMList = li.childList
		Dim item As VMListItem
		item.Initialize(vue, key, module)
		item.SetAvatar(imgURL)
		item.SetText(text)
		item.Pop(pl)
	End If
End Sub

Sub AddItem(key As String, icon As String, text As String)
	Dim item As VMListItem
	item.Initialize(vue, key, module)
	item.SetIcon(icon, False)
	item.SetText(text)
	items.Put(key, item)
End Sub

Sub AddSubItem(parent As String, key As String, icon As String, text As String)
	If items.ContainsKey(parent) Then
		Dim li As VMListItem = items.Get(parent)
		Dim pl As VMList = li.childList
		Dim item As VMListItem
		item.Initialize(vue, key, module)
		item.SetIcon(icon, False)
		item.SetText(text)
		item.SetInset(True)
		item.Pop(pl)
	End If
End Sub

Sub SetElevation(e As Int) As VMDrawer
	Drawer.SetElevation(e)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMDrawer
	Drawer.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMDrawer
	Drawer.SetAttr(attr)
	Return Me
End Sub

private Sub SetActiveSync(v As String) As VMDrawer
	Drawer.SetActiveSync(v)
	bActive = True
	Return Me
End Sub

Sub SetPermanentFull(b As Boolean) As VMDrawer
	Drawer.SetPermanentFull(b)
	Return Me
End Sub

Sub ToString As String
	ToolBar.CreateButton("back1").SetOnClick(Me).SetDense(True).SetIcon("keyboard_arrow_left").SetIconButton(True).Pop(ToolBar.EndSection)
	ToolBar.Pop(Drawer)
	'
	For Each item As VMListItem In items.Values
		Dim cl As VMList = item.childList
		If cl.HasContent Then item.SetList(cl)
		item.Pop(DrawerList)
	Next
	If DrawerList.HasContent Then DrawerList.Pop(Drawer)
	If bActive = False Then
		Log($"VMDrawer.SetActiveSync: '${ID}' has not been activated!"$)
	End If
	Return Drawer.tostring
End Sub

Sub back1_click(e As BANanoEvent)
	Toggle
	Dim bDrawer As Boolean = vue.GetState("drawer",False)
	bDrawer = Not(bDrawer)
	vue.SetStateSingle("menushow", bDrawer)
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'Option used To trigger the drawer visibility
Sub SetActive(varActive As Object) As VMDrawer
	SetAttr(CreateMap("md-active": varActive))
	Return Me
End Sub

'Option used To enable touch support To be opened/closed by swipe.
Sub SetSwipeable(varSwipeable As Boolean) As VMDrawer
	SetAttr(CreateMap(":md-swipeable": varSwipeable))
	Return Me
End Sub

'Applies position: fixed To drawer. Useful To be used As the main drawer of the application
Sub SetFixed(varFixed As Boolean) As VMDrawer
	SetAttr(CreateMap(":md-fixed": varFixed))
	Return Me
End Sub

'This Is used To place the drawer on the right of the screen.
Sub SetRight(varRight As Boolean) As VMDrawer
	SetAttr(CreateMap(":md-right": varRight))
	Return Me
End Sub

'Sets If the drawer will be permanent on the screen.
Sub SetPermanent(varPermanent As Object) As VMDrawer
	SetAttr(CreateMap("md-permanent": varPermanent))
	Return Me
End Sub

'Sets If the drawer will be permanent on the screen.-clipped
Sub SetPermanentClipped(b As Boolean) As VMDrawer    'ignore
	SetAttr(CreateMap("md-permanent": "clipped"))
	Return Me
End Sub

'Sets If the drawer will be permanent on the screen.-card
Sub SetPermanentCard(b As Boolean) As VMDrawer    'ignore
SetAttr(CreateMap("md-permanent": "card"))
Return Me
End Sub

'Sets If the drawer will be persistent on the screen, always pusing the content when opened.
Sub SetPersistent(varPersistent As Object) As VMDrawer
	SetAttr(CreateMap("md-persistent": varPersistent))
	Return Me
End Sub

'Sets If the drawer will be persistent on the screen, always pusing the content when opened.-full
Sub SetPersistentFull(b As Boolean) As VMDrawer    'ignore
	SetAttr(CreateMap("md-persistent": "full"))
	Return Me
End Sub

'Sets If the drawer will be persistent on the screen, always pusing the content when opened.-mini
Sub SetPersistentMini(b As Boolean) As VMDrawer    'ignore
	SetAttr(CreateMap("md-persistent": "mini"))
	Return Me
End Sub

'The minimal distance traveled To be considered swipe.
Sub SetSwipeThreshold(varSwipe As Object) As VMDrawer
	SetAttr(CreateMap("md-swipe-threshold": varSwipe))
	Return Me
End Sub

'The maximum distance allowed at the same time in perpendicular direction.
Sub SetSwipeRestraint(varSwipe As Object) As VMDrawer
	SetAttr(CreateMap("md-swipe-restraint": varSwipe))
	Return Me
End Sub

'The maximum time allowed To detect swipe.
Sub SetSwipeTime(varSwipe As Object) As VMDrawer
	SetAttr(CreateMap("md-swipe-time": varSwipe))
	Return Me
End Sub

