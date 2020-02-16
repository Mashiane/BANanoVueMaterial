B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ToolBar As VMElement
	Public ID As String
	Private vue As BANanoVue
	Public HasContent As Boolean
	Public EndSection As VMElement
	Public StartSection As VMElement
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMToolBar
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	ToolBar.Initialize(vue, ID).SetTag("md-app-toolbar")
	HasContent = False
	EndSection.Initialize(vue,$"${ID}end"$).SetTag("div").AddClass("md-toolbar-section-end")
	StartSection.Initialize(vue,$"${ID}start"$).SetTag("div").AddClass("md-toolbar-section-start")
	ToolBar.RemoveAttr(":required")
	ToolBar.RemoveAttr(":disabled")
	Return Me
End Sub

'has menu button to show drawer
Sub SetHasLogo(b As Boolean) As VMToolBar
	Dim opt As Map = CreateMap()
	vue.SetStateSingle("logo", b)
	Return Me
End Sub

Sub SetLogo(url As String) As VMToolBar
	Dim img As VMImage
	img.Initialize(vue, $"${ID}logo"$, module)
	img.SetValue(url, True).SetStyle(CreateMap("height": "42px", "width":"56px"))
	img.Pop(StartSection)
	img.SetVShow("logo")
	vue.SetStateSingle("logo", False)
	HasContent = True
	StartSection.hasContent = True
End Sub

Sub UpdateLogo(URL As String) As VMToolBar
	Dim pp As String = $"${ID}logosrc"$
	vue.SetStateSingle(pp, URL)
	SetHasLogo(True)
	Return Me
End Sub


Sub AddSearch(searchID As String, placeHolder As String, vmodel As String)
	searchID = searchID.tolowercase
	Dim mf As VMField
	Dim inp As VMInput
	'
	mf.Initialize(vue, ID, $"${searchID}field"$, module).SetClearable(True).SetMaxWidth("300px")
	inp.Initialize(vue, searchID, module).SetPlaceholder(placeHolder).SetVModel(vmodel)
	inp.Pop(mf.Field)
	mf.Pop(EndSection)
End Sub

'normal toolbar
Sub SetToolbar(b As Boolean) As VMToolBar
	If b = False Then Return Me
	ToolBar.SetTag("md-toolbar")
	HasContent = True
	Return Me
End Sub

'table toolbar
Sub SetTableToolbar(b As Boolean) As VMToolBar
	If b = False Then Return Me
	ToolBar.SetTag("md-table-toolbar")
	HasContent = True
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMToolBar
	ToolBar.SetDisabled(b)
	Return Me
End Sub

Sub HideBackButton
	SetHasBackButton(False)
End Sub

Sub ShowBackButton
	SetHasBackButton(True)
End Sub

Sub ShowMenu
	SetHasMenuButton(True)
End Sub

Sub HideMenu
	SetHasMenuButton(False)
End Sub

Sub SetMode(str As String) As VMToolBar   'ignore
	Dim pp As String = $"${ID}mode"$
	vue.SetStateSingle(pp, str)
	Return Me
End Sub


Sub SetModeFixed(b As Boolean) As VMToolBar   'ignore
	SetMode("fixed")
	Return Me
End Sub

Sub SetModeReveal(b As Boolean) As VMToolBar   'ignore
	SetMode("reveal")
	Return Me
End Sub

Sub SetModeFlexible(b As Boolean) As VMToolBar  'ignore
	SetMode("flexible")
	Return Me
End Sub

Sub SetModeFixedLast(b As Boolean) As VMToolBar  'ignore
	SetMode("fixed-last")
	Return Me
End Sub

Sub SetModeOverlap(b As Boolean) As VMToolBar   'ignore
	SetMode("overlap")
	Return Me
End Sub


Sub AddIcon(key As String, iconName As String, toolTip As String, badge As String) As VMToolBar
	Dim btn As VMButton
	btn.Initialize(vue, key, module).SetIcon(iconName).SetIconButton(True).SetToolTip(toolTip)
	If badge <> "" Then 
		btn.SetBadgeContent(badge)
	End If
	btn.Pop(EndSection)
	EndSection.hasContent = True
	HasContent = True
	Return Me
End Sub

Sub AddButton(key As String, iconName As String, text As String, toolTip As String, badge As String) As VMToolBar
	Dim btn As VMButton
	btn.Initialize(vue, key, module).SetToolTip(toolTip).SetIcon(iconName).SetText(text)
	If badge <> "" Then
		btn.SetBadgeContent(badge)
	End If
	btn.Pop(EndSection)
	EndSection.hasContent = True
	HasContent = True
	Return Me
End Sub

Sub AddButtonStart(key As String, iconName As String, text As String, toolTip As String, badge As String) As VMToolBar
	Dim btn As VMButton
	btn.Initialize(vue, key, module).SetToolTip(toolTip).SetIcon(iconName).SetText(text)
	If badge <> "" Then
		btn.SetBadgeContent(badge)
	End If
	btn.Pop(StartSection)
	StartSection.hasContent = True
	HasContent = True
	Return Me
End Sub


Sub AddMenu(mnu As VMMenu) As VMToolBar
	mnu.Pop(EndSection)
	EndSection.hasContent = True
	HasContent = True
	Return Me
End Sub

Sub AddMenuStart(mnu As VMMenu) As VMToolBar
	mnu.Pop(StartSection)
	StartSection.hasContent = True
	HasContent = True
	Return Me
End Sub

Sub AddAvatar(key As String, imgURL As String, txt As String, toolTip As String, badge As String) As VMToolBar
	Dim avt As VMAvatar
	avt.Initialize(vue, key,module)
	avt.SetValue(imgURL)
	avt.SetAlt(txt)
	avt.SetToolTip(toolTip)
	If badge <> "" Then
		avt.SetBadgeContent(badge)
	End If
	avt.Pop(EndSection)
	EndSection.hasContent = True
	HasContent = True
	Return Me
End Sub

Sub AddAvatarStart(key As String, imgURL As String, txt As String, toolTip As String, badge As String) As VMToolBar
	Dim avt As VMAvatar
	avt.Initialize(vue, key,module)
	avt.SetValue(imgURL)
	avt.SetAlt(txt)
	avt.SetToolTip(toolTip)
	If badge <> "" Then
		avt.SetBadgeContent(badge)
	End If
	avt.Pop(StartSection)
	StartSection.hasContent = True
	HasContent = True
	Return Me
End Sub

Sub AddIconStart(key As String, iconName As String, tooltip As String, badge As String) As VMToolBar
	Dim btn As VMButton
	btn.Initialize(vue, key, module).SetIcon(iconName).SetIconButton(True).SetToolTip(tooltip)
	If badge <> "" Then
		btn.SetBadgeContent(badge)
	End If
	btn.Pop(StartSection)
	StartSection.hasContent = True
	HasContent = True
	Return Me 
End Sub

Sub SetHasBackButton(b As Boolean) As VMToolBar
	vue.SetStateSingle("backshow", b)
	Return Me
End Sub

'has menu button to show drawer
Sub SetHasMenuButton(b As Boolean) As VMToolBar
	vue.SetStateSingle("menushow", b)
	Return Me
End Sub

Sub ToggleMenu
	'get drawer state
	Dim bDrawer As Boolean = vue.GetState("drawer",False)
	bDrawer = Not(bDrawer)
	vue.SetStateSingle("menushow", bDrawer)
End Sub

Sub SetVisible(b As Boolean) As VMToolBar
	ToolBar.SetVisible(b)
	Return Me
End Sub

Sub SetVShow(xshow As String) As VMToolBar
	ToolBar.SetVShow(xshow)
	Return Me
End Sub

Sub SetVIf(xshow As String) As VMToolBar
	ToolBar.SetVif(xshow)
	Return Me
End Sub

Sub CreateButton(btnID As String) As VMButton
	Dim el As VMButton
	el.Initialize(vue, btnID, module)
	Return el
End Sub

'show the toolbar
Sub Show
	SetVisible(True)
End Sub

'hide the toolbar
Sub Hide
	SetVisible(False)
End Sub

'add a class
Sub AddClass(c As String) As VMToolBar
	ToolBar.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMToolBar
	ToolBar.SetAttr(attr)
	Return Me
End Sub

Sub SetTitle(tt As String) As VMToolBar
	Dim pp As String = $"${ID}title"$
	vue.SetStateSingle(pp, tt)
	'
	Dim page_title As String = $"{{ ${pp} }}"$
	Dim span As VMElement
	span.Initialize(vue, $"${ID}title"$).SetTag("h1").SetTitle(True).SetText(page_title)
	span.Pop(StartSection)
	HasContent = True
	StartSection.hasContent = True
	Return Me 
End Sub

Sub UpdateTitle(tt As String) As VMToolBar
	Dim pp As String = $"${ID}title"$
	vue.SetStateSingle(pp, tt)
	Return Me
End Sub

Sub SetDense(b As Boolean) As VMToolBar
	ToolBar.SetDense(b)
	Return Me
End Sub


Sub SetLarge(b As Boolean) As VMToolBar
	ToolBar.SetLarge(b)
	Return Me
End Sub

Sub SetMedium(b As Boolean) As VMToolBar
	ToolBar.SetMedium(b)
	Return Me
End Sub

Sub SetTransparent(b As Boolean) As VMToolBar
	ToolBar.SetTransparent(b)
	Return Me
End Sub

Sub SetElevation(e As Int) As VMToolBar
	ToolBar.SetElevation(e)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMToolBar
	ToolBar.SetPrimary(True)
	HasContent = True
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMToolBar
	ToolBar.SetAccent(True)
	HasContent = True
	Return Me
End Sub

Sub SetText(t As String) As VMToolBar
	ToolBar.SetText(t)
	HasContent = True
	Return Me
End Sub


'set padding
Sub SetPaddingAll(p As String) As VMToolBar
	ToolBar.SetPaddingAll(p)
	Return Me
End Sub

'set margin
Sub SetMarginAll(p As String) As VMToolBar
	ToolBar.SetMarginAll(p)
	Return Me
End Sub

Sub ToString As String
	If StartSection.hasContent Then
		StartSection.Pop(ToolBar)
	End If
	If EndSection.hasContent Then
		EndSection.Pop(ToolBar)
	End If
	Return ToolBar.tostring
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