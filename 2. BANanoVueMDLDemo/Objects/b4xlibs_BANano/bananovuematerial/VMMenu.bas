B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Menu As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Private MenuContent As VMElement
	Private bActive As Boolean
	Private eventHandler As Object
End Sub

'initialize the Menu
Public Sub Initialize(v As BANanoVue, sid As String, module As Object) As VMMenu
	ID = sid.tolowercase
	Menu.Initialize(v, ID)
	Menu.SetTag("md-menu")
	vue = v
	MenuContent.Initialize(vue,$"${ID}content"$).SetTag("md-menu-content")
	bActive = False
	eventHandler = module
	Return Me
End Sub

'the menu will be activated via an icon
Sub SetIcon(icon As String) As VMMenu
	If icon = "" Then Return Me
	Dim btn As VMButton
	btn.Initialize(vue, $"${ID}icon"$, eventHandler).SetMenuTrigger(True)
	btn.SetIcon(icon).SetIconButton(True)
	btn.Pop(Menu)
	SetDirectionBottomEnd(True)
	SetAlignTrigger(True)
	Return Me 
End Sub

'menu will be activated by an image
Sub SetImage(imgURL As String, txt As String) As VMMenu
	Dim avt As VMAvatar
	avt.Initialize(vue, $"${ID}image"$,eventHandler).SetAlt(txt).setmenutrigger(True)
	avt.SetValue(imgURL)
	avt.Pop(Menu)
	SetDirectionBottomEnd(True)
	SetAlignTrigger(True)
	Return Me
End Sub

'the menu will be activated via text
Sub SetButton(iconName As String, text As String) As VMMenu
	If text = "" Then Return Me
	Dim btn As VMButton
	btn.Initialize(vue, $"${ID}button"$,eventHandler).SetMenuTrigger(True)
	If iconName <> "" Then 
		btn.SetIcon(iconName)
	End If
	btn.SetText(text)
	btn.Pop(Menu)
	Return Me
End Sub

'add a menu item
Sub AddMenuItem(itemID As String, iconName As String, itemText As String)
	AddIconText(itemID, iconName, itemText)
End Sub

'add menu item
Sub AddIconText(itemID As String, iconName As String, Text As String)
	Dim mi As VMMenuItem
	mi.Initialize(vue,itemID, eventHandler)
	'
	If iconName <> "" Then
		Dim icn As VMIcon
		icn.Initialize(vue, $"${itemID}icon"$).SetText(iconName)
		icn.Pop(mi.MenuItem)
	End If
	'
	Dim span As VMElement
	span.Initialize(vue,$"${itemID}text"$).SetTag("span").SetText(Text)
	span.Pop(mi.MenuItem)
	mi.Pop(MenuContent)
	MenuContent.hasContent = True
End Sub


'get component
Sub ToString As String
	If MenuContent.hasContent Then MenuContent.Pop(Menu)
	Return Menu.ToString
End Sub

Sub SetVModel(k As String) As VMMenu
	Menu.SetVModel(k)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMMenu
	Menu.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMMenu
	Menu.SetVShow(vif)
	Return Me
End Sub

Sub SetActiveSync(v As String) As VMMenu
	Menu.SetActiveSync(v)
	bActive = True
	Return Me
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

'add a child
Sub AddChild(child As VMElement) As VMMenu
	Dim childHTML As String = child.ToString
	Menu.SetText(childHTML)
	Return Me
End Sub

'set text
Sub SetText(t As Object) As VMMenu
	Menu.SetText(t)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMMenu
	Menu.SetPrimary(True)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMMenu
	Menu.SetAccent(True)
	Return Me
End Sub

'add to parent
Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a class
Sub AddClass(c As String) As VMMenu
	Menu.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMMenu
	Menu.SetAttr(attr)
	Return Me
End Sub

'set style
Sub SetStyle(sm As Map) As VMMenu
	Menu.SetStyle(sm)
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetPadding(p As Object) As VMMenu
	Menu.SetPaddingAll(p)
	Return Me
End Sub

'Used To show/hide a menu programatically.
Sub SetActive(varActive As Object) As VMMenu
	SetAttr(CreateMap("md-active": varActive))
	Return Me
End Sub

'When this options Is True, the menu will be closed after any click event.
Sub SetCloseOnClick(varCloseOnClick As Boolean) As VMMenu
	SetAttr(CreateMap(":md-close-on-click": varCloseOnClick))
	Return Me
End Sub

'When this options Is True, the menu will close after a click on a md-menu-item.
Sub SetCloseOnSelect(varCloseOnSelect As Boolean) As VMMenu
	SetAttr(CreateMap(":md-close-on-select": varCloseOnSelect))
	Return Me
End Sub

'Set the direction of a menu.
Sub SetDirection(varDirection As Object) As VMMenu
	SetAttr(CreateMap("md-direction": varDirection))
	Return Me
End Sub

'Set the direction of a menu.-bottom-start
Sub SetDirectionBottomStart(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("md-direction": "bottom-start"))
	Return Me
End Sub

'Set the direction of a menu.-bottom-end
Sub SetDirectionBottomEnd(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("md-direction": "bottom-end"))
	Return Me
End Sub

'Set the direction of a menu.-top-start
Sub SetDirectionTopStart(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("md-direction": "top-start"))
	Return Me
End Sub

'Set the direction of a menu.-top-end
Sub SetDirectionTopEnd(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("md-direction": "top-end"))
	Return Me
End Sub

'Aligns the content above the trigger.
Sub SetAlignTrigger(varAlignTrigger As Object) As VMMenu
	SetAttr(CreateMap("md-align-trigger": varAlignTrigger))
	Return Me
End Sub

'Sets a custom offset in X axis
Sub SetOffsetX(varOffsetX As Object) As VMMenu
	SetAttr(CreateMap("md-offset-x": varOffsetX))
	Return Me
End Sub

'Sets a custom offset in Y axis
Sub SetOffsetY(varOffsetY As Object) As VMMenu
	SetAttr(CreateMap("md-offset-y": varOffsetY))
	Return Me
End Sub

'Sets the size of a menu.
Sub SetSize(varSize As Object) As VMMenu
	SetAttr(CreateMap("md-size": varSize))
	Return Me
End Sub

'Sets the size of a menu.-small
Sub SetSizeSmall(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("md-size": "small"))
	Return Me
End Sub

'Sets the size of a menu.-medium
Sub SetSizeMedium(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("md-size": "medium"))
	Return Me
End Sub

'Sets the size of a menu.-big
Sub SetSizeBig(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("md-size": "big"))
	Return Me
End Sub

'Sets the size of a menu.-huge
Sub SetSizeHuge(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("md-size": "huge"))
	Return Me
End Sub

'Sets the size of a menu.-auto
Sub SetSizeAuto(b As Boolean) As VMMenu    'ignore
	SetAttr(CreateMap("md-size": "auto"))
	Return Me
End Sub



Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub
