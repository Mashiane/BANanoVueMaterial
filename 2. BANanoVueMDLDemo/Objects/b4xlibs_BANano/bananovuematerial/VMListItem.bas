B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ListItem As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private txt As VMElement
	Private hasText As Boolean
	Private hasAction As Boolean
	Private btn As VMButton
	Private hasIcon As Boolean
	Private icn As VMIcon
	Private hasAvatar As Boolean
	Private avatar As VMAvatar
	Private hasSwitch As Boolean
	Private switch As VMSwitch
	Private hasBadge As Boolean
	Private badge As VMBadge
	Public childList As VMList
	Private BANano As BANano  'ignore
	Private span As VMElement
	Private data As List
	Private hasMenu As Boolean
	Private menu As VMMenu
	Private syncid As String
	Private eventHandler As Object
End Sub

Sub SetElevation(e As Int) As VMListItem
	ListItem.SetElevation(e)
	Return Me
End Sub

Sub AddMenuItem(sid As String, iconName As String, Caption As String)
	menu.addicontext(sid, iconName, Caption)
End Sub

Sub AddEditMenuItem(sid As String, caption As String)
	menu.AddIconText(sid, "edit", caption)
End Sub

Sub AddDeleteMenuItem(sid As String, caption As String)
	menu.AddIconText(sid, "delete", caption)
End Sub

Sub SetMenuIcon(menuIcon As String) As VMListItem
	hasMenu = True
	menu.SetIcon(menuIcon)
	Return Me
End Sub

Public Sub Initialize(v As BANanoVue, sid As String,module As Object) As VMListItem
	ID = sid.ToLowerCase
	syncid = $"${ID}sync"$
	vue = v
	eventHandler = module
	ListItem.Initialize(vue, ID).SetTag("md-list-item")
	hasText = False
	txt.Initialize(vue,$"${ID}text"$).SetTag("div").Addclass("md-list-item-text")
	hasAction = False
	btn.Initialize(vue,$"${ID}button"$,module).SetIconButton(True).SetListAction(True)
	hasMenu = False
	menu.Initialize(vue,$"${ID}menu"$,module).AddClass("md-list-action").SetCloseOnClick(True).SetCloseOnSelect(True)
	menu.SetAlignTrigger(True).SetSizeAuto(True)
	hasIcon = False
	icn.Initialize(vue, $"${ID}icon"$)
	hasAvatar = False
	avatar.Initialize(vue, $"${ID}avatar"$,module)
	hasSwitch = False
	switch.Initialize(vue, $"${ID}switch"$,module)
	hasBadge = False
	badge.Initialize(vue, $"${ID}badge"$) 
	childList.Initialize(vue, $"${ID}children"$, eventHandler) 
	span.Initialize(vue,$"${ID}span"$).SetTag("span")
	vue.SetStateSingle(syncid, False)
	ListItem.SetOnClick(eventHandler, $"${ID}_click"$)
	Return Me
End Sub

Sub SetData(recs As List)
	data = recs
End Sub

Sub SetList(lst As VMList) As VMListItem
	SetExpand(True)
	SetExpanded(syncid)
	lst.SetSlotExpand(True)
	lst.Pop(ListItem)
	Return Me
End Sub

Sub SetInset(b As Boolean) As VMListItem
	If b Then AddClass("md-inset")
	Return Me
End Sub

Sub SetExpand(b As Boolean) As VMListItem
	ListItem.SetAttr(CreateMap(":md-expand": b))
	Return Me
End Sub

Sub SetExpanded(b As String) As VMListItem
	b = b.tolowercase
	If vue.HasState(b) = False Then
		Log($"VMListItem.SetExpanded: '${b}' default state should be set!"$)
	End If
	ListItem.SetAttr(CreateMap(":md-expanded.sync": b))
	Return Me
End Sub

Sub SetIcon(icon As String, primary As Boolean) As VMListItem
	If icon = "" Then Return Me
	icn.SetText(icon)
	If primary Then icn.SetPrimary(primary) 
	hasIcon = True
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMListItem
	ListItem.AddClass(c)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMListItem
	ListItem.SetStyle(m)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMListItem
	ListItem.SetAttr(attr)
	Return Me
End Sub

Sub SetAvatar(img As String) As VMListItem
	avatar.SetID(ID)
	avatar.SetValue(img)
	hasAvatar = True
	Return Me 
End Sub

Sub AddButton(btnID As String, btnText As String) As VMListItem
	Dim btn As VMButton
	btn.Initialize(vue,btnID, eventHandler)
	btn.SetText(btnText)
	btn.SetRaised(True)
	btn.SetPrimary(True)
	btn.SetAccent(False)
	btn.SetDisabled(False)
	btn.SetStyle(CreateMap("width":"100%","margin-left":"0px","margin-right":"0px"))
	btn.Pop(ListItem)
	Return Me
End Sub

Sub AddIconButton(btnID As String, btnIcon As String) As VMListItem
	Dim btn As VMButton
	btn.Initialize(vue,btnID,eventHandler).SetIconButton(True).SetIcon(btnIcon)
	btn.SetPrimary(True)
	btn.SetDisabled(False)
	btn.Pop(ListItem)
	Return Me
End Sub

Sub AddSlider(vmodel As String, Label As String, minValue As Int, maxValue As Int, value As Int, labelOnTop As Boolean) As VMListItem
	vue.SetStateSingle(vmodel, value)
	Dim slid As VMSlider
	slid.initialize(vue,$"${vmodel}sld"$, eventHandler)
	slid.SetMin(minValue)
	slid.SetMax(maxValue)
	slid.SetLabel(Label)
	slid.SetThumbLabel(False)
	slid.SetVModel(vmodel)
	slid.SetName(vmodel,False)
	slid.SetLabelOnTop(labelOnTop)
	slid.Pop(ListItem)
	Return Me
End Sub

Sub AddNumberInput(vmodel As String, Label As String, minValue As Int, maxValue As Int, value As Int) As VMListItem
	vue.SetStateSingle(vmodel, value)
	Dim ni As VMNumberInput
	ni.initialize(vue,$"${vmodel}ni"$)
	ni.SetMin(minValue)
	ni.SetMax(maxValue)
	ni.SetLabel(Label)
	ni.SetVModel(vmodel)
	ni.SetName(vmodel,False)
	ni.SetSizeSmall
	ni.Pop(ListItem)
	Return Me
End Sub

Sub AddSelect(vmodel As String, vText As String, sourceName As String, options As Map, sourcefield As String, displayfield As String) As VMListItem
	Dim sel As VMSelect
	sel.Initialize(vue,$"${vmodel}sel"$,eventHandler)
	sel.SetLabel(vText)
	sel.SetVModel(vmodel)
	sel.SetOPtions(sourceName, options, sourcefield, displayfield)
	sel.SetDense(True)
	sel.Pop(ListItem)
	Return Me
End Sub

Sub AddRadioGroup(vmodel As String, vText As String, options As Map) As VMListItem
	Dim sel As VMRadioGroup
	sel.Initialize(vue,$"${vmodel}rg"$,vText,eventHandler)
	sel.SetVModel(vmodel)
	sel.SetOPtions(options)
	sel.Pop(ListItem)
	Return Me
End Sub

'Sub AddAutoComplete1(vmodel As String, vText As String, sourceName As String, options As Map, sourcefield As String, displayfield As String) As VMListItem
'	Dim sel As VMAutoComplete
'	sel.Initialize(vue,"")
'	sel.SetLabel(vText)
'	sel.SetVModel(vmodel)
'	sel.SetOPtionsMap(sourceName, options, sourcefield, displayfield)
'	sel.SetDense(True)
'	sel.SetFuzzySearch(False)
'	sel.Pop(ListItem)
'	Return Me
'End Sub

'Sub AddAutoComplete(vmodel As String, vText As String, sourceName As String, options As List) As VMListItem
'	Dim sel As VMAutoComplete
'	sel.Initialize(vue,"")
'	sel.SetLabel(vText)
'	sel.SetVModel(vmodel)
'	'sel.SetOPtionsMap(sourceName, options, sourcefield, displayfield)
'	sel.SetOptions1(sourceName, options)
'	sel.SetDense(True)
'	sel.SetFuzzySearch(False)
'	sel.Pop(ListItem)
'	Return Me
'End Sub


Sub AddLabel(t As String) As VMListItem
	Dim el As VMLabel
	el.Initialize(vue,$"${ID}lbl"$).SetText(t)
	el.Pop(ListItem)
	Return Me
End Sub

Sub AddDatePicker(vmodel As String, vText As String, value As String) As VMListItem
	vue.SetStateSingle(vmodel, value)
	Dim datex As VMDatePicker
	datex.Initialize(vue,$"${vmodel}dp"$,eventHandler)
	datex.SetVModel(vmodel)
	datex.SetLabel(vText)
	datex.Pop(ListItem)
	Return Me
End Sub

Sub AddTextArea(vModel As String, vText As String, vValue As String) As VMListItem
	vue.SetStateSingle(vModel, vValue)
	Dim input As VMTextArea
	input.Initialize(vue,$"${vModel}ta"$, eventHandler)
	input.SetLabel(vText)
	input.SetVModel(vModel)
	input.SetName(vModel,False)
	input.Pop(ListItem)
	Return Me
End Sub


Sub AddInput(typeOf As String, vModel As String, vText As String, vIcon As String, vValue As String) As VMListItem
	vue.SetStateSingle(vModel, vValue)
	Dim input As VMInput
	input.Initialize(vue,$"${vModel}inp"$,eventHandler)
	input.SetType(typeOf)
	input.SetLabel(vText)
	input.SetVModel(vModel)
	input.SetName(vModel,False)
	input.SetAutoComplete(vModel)
	If vIcon <> "" Then input.SetIcon(vIcon)
	If typeOf <> "password" Then
		input.SetClearable(True)
	End If
	input.Pop(ListItem)	
	Return Me		
End Sub

Sub AddCheckBox(vmodel As String, bValue As Boolean, vText As String, bPrimary As Boolean) As VMListItem
	vue.SetStateSingle(vmodel, bValue)
	Dim cb As VMCheckBox
	cb.Initialize(vue, $"${vmodel}cb"$,eventHandler).SetVModel(vmodel).SetPrimary(bPrimary)
	cb.Pop(ListItem)
	SetText(vText)
	Return Me
End Sub

Sub SetRadio(vmodel As String, vValue As String, vText As String, bPrimary As Boolean, bDesignMode As Boolean) As VMListItem
	Dim cb As VMRadio
	cb.Initialize(vue, $"${vmodel}rd"$,eventHandler).SetValue(vValue,False).SetName(vmodel,False).SetPrimary(bPrimary)
	If bDesignMode = False Then cb.SetVModel(vmodel)
	cb.Pop(ListItem)
	SetText(vText)
	Return Me
End Sub

Sub SetBadge(content As Int, bPrimary As Boolean, position As String, bDense As Boolean, bSquare As Boolean) As VMListItem
	badge.SetContent(content).SetPosition(position).SetDense(bDense).SetSquare(bSquare) 
	badge.SetPrimary(bPrimary)
	hasBadge = True
	Return Me
End Sub


Sub SetSwitch(vmodel As String, text As String,bPrimary As Boolean, bValue As Boolean) As VMListItem
	vue.SetStateSingle(vmodel, bValue)
	SetText(text)	
	hasSwitch = True
	switch.SetVModel(vmodel).SetPrimary(bPrimary)
	Return Me
End Sub

Sub SetText(t As String) As VMListItem
	span.SetText(t)
	span.Pop(txt)
	hasText = True
	avatar.SetAlt(t)
	Return Me
End Sub

Sub SetDescription(t As String) As VMListItem
	Dim span As VMElement
	span.Initialize(vue,$"${ID}desc"$).SetTag("span").SetText(t)
	span.Pop(txt)
	hasText = True
	Return Me
End Sub

Sub SetThirdLine(t As String) As VMListItem
	Dim p As VMElement
	p.Initialize(vue,$"${ID}third"$).SetTag("p").SetText(t)
	p.Pop(txt)
	hasText = True
	Return Me 
End Sub

Sub SetActionIcon(icon As String) As VMListItem
	btn.SetIcon(icon)
	hasAction = True
	Return Me
End Sub

Sub SetTo(t As Object) As VMListItem
	ListItem.SetTo(t)
	Return Me
End Sub

Sub SetHREF(h As Object) As VMListItem
	ListItem.SetHREF(h)
	Return Me
End Sub

Sub SetName(k As Object, bind As Boolean) As VMListItem
	ListItem.SetName(k, bind)
	txt.SetName(k,bind)
	span.SetName(k,bind)
	btn.setname(k,bind)
	Return Me
End Sub

Sub SetID(k As String, bind As Boolean) As VMListItem
	ListItem.SetID(k, bind)
	txt.SetID(k,bind)
	span.SetID(k,bind)
	btn.setid(k,bind)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMListItem
	ListItem.SetKey(k, bind)
	txt.SetKey(k,bind)
	span.SetKey(k,bind)
	btn.setkey(k,bind)
	Return Me
End Sub

Sub SetTargetBlank(b As Boolean) As VMListItem   'ignore
	ListItem.Element.SetAttrTARGET("_blank")
	Return Me
End Sub

Sub SetTargetSelf(b As Boolean) As VMListItem    'ignore
	ListItem.Element.SetAttrTARGET("_self")
	Return Me
End Sub
	
Sub SetTargetParent(b As Boolean) As VMListItem   'ignore
	ListItem.Element.SetAttrTARGET("_parent")
	Return Me
End Sub
	
Sub SetTargetTop(b As Boolean) As VMListItem    'ignore
	ListItem.Element.SetAttrTARGET("_top")
	Return Me
End Sub

Sub SetVFor(item As String, dataSource As String) As VMListItem
	ListItem.SetVFor(item, dataSource)
	Return Me
End Sub

Sub ToString As String
	If hasIcon Then
		icn.Pop(ListItem)
	End If
	If hasAvatar Then
		avatar.Pop(ListItem)
	End If
	If hasText Then
		txt.Pop(ListItem)
	End If
	If hasAction Then
		btn.Pop(ListItem)
	End If
	If hasMenu Then
		menu.Pop(ListItem)
	End If
	If hasSwitch Then
		switch.Pop(ListItem)
	End If
	If hasBadge Then
		badge.Pop(ListItem)
	End If
	Return ListItem.ToString
End Sub

Sub Pop(p As VMList)
	p.SetText(ToString)
End Sub

