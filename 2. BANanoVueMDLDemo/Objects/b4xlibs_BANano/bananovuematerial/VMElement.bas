B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12,9
Sub Class_Globals
	Public Element As VueHTML
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano  'ignore
	Public hasContent As Boolean
	Private rowClass As String = "row"
	Private cellClass As String = "col"
	'offset class
	Private offClass As Map = CreateMap("s":"offset-sm-","m":"offset-md-","l":"offset-lg-", "xl":"offset-xl-")
	'column defs for bootstrap
	Private colClass As Map = CreateMap("s": "col-sm-","m":"col-md-","l":"col-lg-", "xl":"col-xl-")
	Private showKey As String
	Private disKey As String
	Private reqKey As String
	Private errKey As String
End Sub

Public Sub Initialize(v As BANanoVue, sid As String) As VMElement
	ID = sid.ToLowerCase
	ID = ID.trim
	Element.Initialize(ID,"div")
	vue = v
	hasContent = False
	SetRef(ID)
	showKey = $"${ID}show"$
	disKey = $"${ID}disabled"$
	reqKey = $"${ID}required"$
	errKey = $"${ID}error"$
	vue.SetStateSingle(showKey, True)
	vue.SetStateSingle(disKey, False)
	vue.SetStateSingle(reqKey, False)
	vue.SetStateSingle(errKey, False)
		
	SetRequired(False)
	SetVShow(showKey)
	SetDisabled(False)
	Return Me
End Sub

Sub SetStyleSingle(prop As String, val As Object) As VMElement
	Dim attr As Map = CreateMap()
	attr.Put(prop, val)
	SetStyle(attr)
	Return Me
End Sub

Sub SetAttrSingle(prop As String, val As Object) As VMElement
	Dim attr As Map = CreateMap()
	attr.Put(prop, val)
	SetAttr(attr)
	Return Me
End Sub

Sub Required(b As Boolean) As VMElement
	vue.SetStateSingle(reqKey, b)
	Return Me
End Sub

Sub Enable(b As Boolean) As VMElement
	Dim n As Boolean = Not(b)
	vue.SetStateSingle(disKey, n)
	Return Me
End Sub

Sub Show As VMElement
	vue.SetStateSingle(showKey, True)
	Return Me
End Sub

Sub Hide As VMElement
	vue.SetStateSingle(showKey, False)
	Return Me
End Sub

Sub SetVisible(b As Boolean) As VMElement
	vue.SetStateSingle(showKey, b)
	Return Me
End Sub

Sub SetPlaceholder(varPlaceholder As String) As VMElement
	Element.SetAttrPlaceHolder(varPlaceholder)
	Return Me
End Sub

Sub SetAttr1(attr As String, val As Object) As VMElement
	Dim opt As Map = CreateMap()
	opt.Put(attr, val)
	SetAttr(opt)
	Return Me
End Sub

Sub MakePx(sValue As String) As String
	Return Element.MakePx(sValue)
End Sub

Sub SetFor(f As String) As VMElement
	Element.SetAttr("for", f)
	Return Me
End Sub

Sub SetVCloak As VMElement
	Element.setvcloak
	Return Me
End Sub

Sub SetNotSelectible As VMElement
	Element.AddClass("gj-unselectable")
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMElement
	Element.SetTabIndex(ti)
	Return Me
End Sub

Sub SetMethodPost As VMElement
	SetAttr(CreateMap("method":"POST"))
	Return Me
End Sub

Sub SetDraggable(b As Boolean) As VMElement
	SetAttr(CreateMap(":draggable":b))
	Return Me
End Sub

Sub SetDroppable(b As Boolean) As VMElement
	SetAttr(CreateMap(":droppable":b))
	Return Me
End Sub


Sub SetWidth(w As String) As VMElement
	SetStyle(CreateMap("width":w))
	Return Me
End Sub

Sub SetHeight(h As String) As VMElement
	SetStyle(CreateMap("height":h))
	Return Me
End Sub

'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMElement
	Dim b As Map = CreateMap()
	b.Put("border-style", bstyle)
	b.Put("border-width", width)
	b.Put("border-color", color)
	SetStyle(b)
	Return Me
End Sub

'set cursor move
Sub SetCursorMove As VMElement
	SetStyle(CreateMap("cursor": "move"))
	Return Me
End Sub

Sub SetCursorPointer As VMElement
	SetStyle(CreateMap("cursor": "pointer"))
	Return Me
End Sub

Sub SetTextAlignCenter As VMElement
	SetStyle(CreateMap("text-align": "center"))
	Return Me
End Sub

'clear the text content of the element
Sub Clear As VMElement
	Element.clear
	Return Me
End Sub

Sub SetSlot(sltValue As String) As VMElement
	Element.SetAttr("slot", sltValue)
	Return Me
End Sub

Sub SetTerm(term As String) As VMElement
	Element.SetAttr(":md-term", term)
	Return Me
End Sub

Sub SetSlotScope(sltValue As String) As VMElement
	Element.SetAttr("slot-scope", sltValue)
	Return Me
End Sub

Sub SetType(typeof As String) As VMElement
	Element.SetAttr("type", typeof)
	Return Me
End Sub

Sub RemoveClass(className As String) As VMElement
	Element.removeClass(className)
	Return Me
End Sub

Sub SetExact(b As Boolean) As VMElement
	If b Then SetAttr(CreateMap("exact": b))
	Return Me
End Sub

Sub SetOnMouseOut(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttr(CreateMap("v-on:mouseout": methodName))
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnMouseOver(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	SetAttr(CreateMap("v-on:mouseover": methodName))
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetKey(k As Object, bind As Boolean) As VMElement
	If bind Then
		RemoveAttr("key")
		Element.SetAttr(":key", k)
	Else
		RemoveAttr(":key")
		Element.SetAttr("key", k)
	End If
	Return Me
End Sub

Sub SetIs(t As String) As VMElement
	t = t.tolowercase
	SetAttr(CreateMap(":is": t))
	Return Me
End Sub


Sub SetRef(varRef As String) As VMElement
	If varRef <> "" Then
		SetAttr(CreateMap("ref": varRef))
	End If
	Return Me
End Sub

Sub SetVText(t As Object) As VMElement
	SetAttr(CreateMap("v-text": t))
	Return Me
End Sub

Sub SetVElse(t As Object) As VMElement
	SetAttr(CreateMap("v-else": t))
	Return Me
End Sub

Sub SetVElseIf(t As Object) As VMElement
	SetAttr(CreateMap("v-else-if": t))
	Return Me
End Sub

Sub SetVOn(t As Object) As VMElement
	SetAttr(CreateMap("v-on": t))
	Return Me
End Sub

Sub SetVBind(t As String) As VMElement
	t = t.tolowercase
	SetAttr(CreateMap("v-bind": t))
	Return Me
End Sub

Sub SetVBindIs(t As String) As VMElement
	t = t.tolowercase
	SetAttr(CreateMap("v-bind:is": t))
	Return Me
End Sub

Sub SetVOnce(t As Object) As VMElement
	SetAttr(CreateMap("v-once": t))
	Return Me
End Sub


'set for
Sub SetVFor(item As String, dataSource As String) As VMElement
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	If vue.StateExists(dataSource) = False Then vue.SetStateSingle(dataSource, Array())
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttr(CreateMap("v-for": sline))
	RemoveAttr("ref")
	Return Me
End Sub

'set value
Sub SetValue(valueName As String, bind As Boolean) As VMElement
	If bind Then
		RemoveAttr("value")
		valueName = valueName.tolowercase
		SetAttr(CreateMap(":value":valueName))
	Else
		RemoveAttr(":value")	
		SetAttr(CreateMap("value":valueName))
	End If
	Return Me
End Sub

'set template
Sub SetTemplate(tmp As Object) As VMElement
	Element.Clear
	Element.SetText(tmp)
	Return Me
End Sub

Sub SetVHtml(h As String) As VMElement
	If h = "" Then Return Me
	h = h.tolowercase
	Element.SetAttr("v-html", h)
	Return Me
End Sub

Sub SetAutoComplete(auto As String) As VMElement
	SetAttr(CreateMap("autocomplete": auto))
	Return Me
End Sub
'
'Sub SetAutoFocus(auto As String) As VMElement
'	SetAttr(CreateMap(":autofocus": auto))
'	AddClass("md-focused")
'	AddClass("md-input-focused")
'	Return Me
'End Sub

Sub SetName(n As String, bind As Boolean) As VMElement
	If bind Then
		RemoveAttr("name")
		SetAttr(CreateMap(":name": n))
	Else
		RemoveAttr(":name")
		SetAttr(CreateMap("name": n))
	End If
	Return Me
End Sub

public Sub RemoveAttr(sName As String) As VMElement
	Element.RemoveAttr(sName)
	Return Me
End Sub

Sub SetID(n As String, bind As Boolean) As VMElement
	If bind Then
		RemoveAttr("id")
		SetAttr(CreateMap(":id": n))
	Else
		RemoveAttr(":id")
		SetAttr(CreateMap("id": n))
	End If
	Return Me
End Sub

Sub SetVIf(vif As String) As VMElement
	vif = vif.ToLowerCase
	If vue.HasState(vif) = False Then vue.SetStateFalse(vif)
	Element.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VMElement
	vif = vif.ToLowerCase
	If vue.HasState(vif) = False Then vue.SetStateFalse(vif)
	Element.SetVShow(vif)
	Return Me
End Sub


'add break
Sub AddBR
	SetText("<br>")
End Sub

'add hr
Sub AddHR
	SetText("<hr>")
End Sub

'add a class
Sub AddClass(c As String) As VMElement
	Element.AddClass(c)
	Return Me
End Sub

'render the element to parent element
Sub Render1(parent As String)
	BANano.GetElement(parent).Append(ToString)
End Sub

'add to parent
Sub Pop1(p As VMElement)
	p.AddChild(Me)
End Sub

'set color
Sub SetColor(c As Object) As VMElement
	SetStyle(CreateMap("color": c))
	Return Me
End Sub

Sub SetStyle(m As Map) As VMElement
	Element.SetStyles(m)
	Return Me
End Sub

'add a child element
Sub AddChild(child As VMElement) As VMElement
	Dim childHTML As String = child.ToString
	Element.SetText(childHTML)
	hasContent = True
	Return Me
End Sub

'add children
Sub AddChildren(children As List)
	For Each childx As VMElement In children
		AddChild(childx)
	Next
End Sub

'set padding
Sub SetBackgroundColor(p As Object) As VMElement
	SetStyle(CreateMap("background-color":p))
	Return Me
End Sub

Sub SetMarginAll(p As Object) As VMElement
	SetStyle(CreateMap("margin":p))
	Return Me
End Sub

Sub SetPaddingAll(p As Object) As VMElement
	SetStyle(CreateMap("padding":p))
	Return Me
End Sub

Sub SetLayoutColumn(b As Boolean) As VMElement
	Element.AddClass("md-layout-column")
	Return Me
End Sub

'double line
Sub SetDoubleLine(b As Boolean) As VMElement
	Element.AddClass("md-double-line")
	Return Me
End Sub

'for divider
Sub SetInset(b As Boolean) As VMElement
	If b Then Element.AddClass("md-inset")
	Return Me
End Sub

Sub SetTagDialogActions(b As Boolean) As VMElement
	Element.SetTag("md-dialog-actions")
	Return Me
End Sub

Sub SetMaxWidth(mw As String) As VMElement
	Element.SetStyle("max-width",mw)
	Return Me
End Sub

Sub SetMaxHeight(mw As String) As VMElement
	Element.SetStyle("max-height",mw)
	Return Me
End Sub

Sub SetTagDialogTitle(b As Boolean) As VMElement
	Element.SetTag("md-dialog-title")
	Return Me
End Sub

Sub SetActiveSync(a As String) As VMElement
	a = a.tolowercase
	Element.SetAttr(":md-active.sync", a)
	Dim state As Map = CreateMap()
	state.Put(a, False)
	vue.SetState(state)
	Return Me
End Sub

Sub SetTo(t As Object) As VMElement
	Element.SetAttr("to", t)
	Return Me
End Sub

Sub SetDense(b As Boolean) As VMElement
	Element.AddClass("md-dense")
	Return Me
End Sub

Sub SetHREF(h As String) As VMElement
	Element.SetAttrHREF(h)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMElement
	vue.SetStatesingle(disKey, b)
	Element.SetAttr(":disabled", disKey)
	Return Me
End Sub

Sub SetRequired(b As Boolean) As VMElement
	vue.SetStateSingle(reqKey, b)
	Element.SetAttr(":required", reqKey)
	Return Me
End Sub

Sub SetAccent(b As Boolean) As VMElement
	Element.AddClass("md-accent")
	Return Me
End Sub

Sub SetRipple(b As Boolean) As VMElement
	Element.SetAttr(":md-ripple", b)
	Return Me
End Sub

Sub SetMedium(b As Boolean) As VMElement
	If b Then Element.AddClass("md-medium")
	Return Me
End Sub

Sub SetLarge(b As Boolean) As VMElement
	Element.AddClass("md-large")
	Return Me
End Sub


Sub SetWaterfall(b As Boolean) As VMElement
	Element.SetAttr(":md-waterfall", b)
	Return Me
End Sub

Sub SetAttr(m As Map) As VMElement
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		Element.SetAttr(k, v)
	Next
	Return Me
End Sub

Sub SetScrollBar(b As Boolean) As VMElement
	Element.AddClass("md-scrollbar")
	Return Me
End Sub

Sub SetBackgroundImage(url As String) As VMElement
	Element.SetStyle("background-image", $"url('${url}')"$)
	Element.SetStyle("background-size", "100% 100%")
	Return Me
End Sub

Sub SetTagAppContent(b As Boolean) As VMElement
	Element.SetTag("md-app-content")
	Return Me
End Sub

Sub SetDisplay4(b As Boolean) As VMElement
	Element.AddClass("md-display-4")
	Return Me
End Sub

Sub SetDisplay3(b As Boolean) As VMElement
	Element.AddClass("md-display-3")
	Return Me
End Sub

Sub SetDisplay2(b As Boolean) As VMElement
	Element.AddClass("md-display-2")
	Return Me
End Sub

Sub SetDisplay1(b As Boolean) As VMElement
	Element.AddClass("md-display-1")
	Return Me
End Sub

'md-headline
Sub SetHeadline(b As Boolean) As VMElement
	Element.AddClass("md-headline")
	Return Me
End Sub

'md-title
Sub SetTitle(b As Boolean) As VMElement
	Element.AddClass("md-title")
	Return Me
End Sub

Sub SetAppContent(b As Boolean) As VMElement
	Element.SetTag("md-app-content")
	Return Me
End Sub

Sub SetTransparent(b As Boolean) As VMElement
	Element.AddClass("md-transparent")
	Return Me
End Sub

Sub SetSRC(s As String, bind As Boolean) As VMElement
	If bind Then
		SetAttr(CreateMap(":src":s))
	Else
		SetAttr(CreateMap("src":s))
	End If
	Return Me
End Sub

Sub SetAlt(a As String) As VMElement
	Element.SetAlt(a)
	Return Me
End Sub

Sub SetVerticalAlignMiddle As VMElement
	SetStyle(CreateMap("vertical-align": "middle"))
	Return Me
End Sub

Sub SetLineHeight(lh As Object) As VMElement
	SetStyle(CreateMap("line-height": lh))
	Return Me
End Sub

Sub SetPermanentFull(b As Boolean) As VMElement
	Element.SetAttr("md-permanent","full")
	Return Me
End Sub

Sub SetIconButton(b As Boolean) As VMElement
	Element.AddClass("md-icon-button")
	Return Me
End Sub

Sub SetListAction(b As Boolean) As VMElement
	Element.AddClass("md-list-action")
	Return Me
End Sub

Sub SetTagIcon(b As Boolean) As VMElement
	Element.SetTag("md-icon")
	Return Me
End Sub

Sub SetTagListItem(b As Boolean) As VMElement
	Element.settag("md-list-item")
	Return Me
End Sub

Sub SetTagSpan(b As Boolean) As VMElement
	Element.SetTag("span")
	Return Me
End Sub

Sub SetListItemText(b As Boolean) As VMElement
	Element.AddClass("md-list-item-text")
	Return Me
End Sub

Sub SetElevation(e As Int) As VMElement
	Element.addclass($"md-elevation-${e}"$)
	Return Me
End Sub

Sub SetPrimary(b As Boolean) As VMElement
	Element.AddClass("md-primary")
	Return Me
End Sub

'md-subheading
Sub SetSubHeading(b As Boolean) As VMElement
	Element.AddClass("md-subheading")
	Return Me
End Sub

'md-subheading
Sub SetSubHead(b As Boolean) As VMElement
	Element.AddClass("md-subhead")
	Return Me
End Sub


'md-subheader
Sub SetTagSubHeader(b As Boolean) As VMElement
	Element.SetTag("md-subheader")
	Return Me
End Sub

'md-body2
Sub SetBody2(b As Boolean) As VMElement
	Element.AddClass("md-body-2")
	Return Me
End Sub


'md-body1
Sub SetBody1(b As Boolean) As VMElement
	Element.AddClass("md-body-1")
	Return Me
End Sub


'md-caption
Sub SetCaption(b As Boolean) As VMElement
	Element.AddClass("md-caption")
	Return Me
End Sub


Sub SetHidden(xsmall As Boolean, small As Boolean, medium As Boolean, large As Boolean, xlarge As Boolean) As VMElement
	Dim sizes As List
	sizes.Initialize
	'
	If xsmall Then 
		sizes.Add($"md-xsmall-hide"$)
	End If
	'
	If small Then
		sizes.Add($"md-small-hide"$)
	End If
	'
	If medium Then
		sizes.Add($"md-medium-hide"$)
	End If
	'
	If large Then
		sizes.Add($"md-large-hide"$)
	End If
	'
	If xlarge Then
		sizes.Add($"md-xlarge-hide"$)
	End If
	'
	Dim strSizes As String = Element.join(" ", sizes)
	Element.AddClass(strSizes)
	Return Me
End Sub

Sub SetSizes(xsmall As Int, small As Int, medium As Int, large As Int, xlarge As Int) As VMElement
	Dim sizes As List
	sizes.Initialize
	Dim eachCell As Double = 8.33
	Dim eachSize As String
	'
	If xsmall > 0 Then
		Dim xsmallD As Double = xsmall * BANano.parseFloat(eachCell)
		xsmallD = Round(BANano.parseFloat(xsmallD))
		eachSize = 	$"md-xsmall-size-${xsmallD}"$
		sizes.Add(eachSize)
	End If
	'
	If small > 0 Then
		Dim smallD As Double = small * BANano.parseFloat(eachCell)
		smallD = Round(BANano.parseFloat(smallD))
		eachSize = 	$"md-small-size-${smallD}"$
		sizes.Add(eachSize)
	End If
	'
	If medium > 0 Then
		Dim mediumD As Double = medium * BANano.parseFloat(eachCell)
		mediumD = Round(BANano.parseFloat(mediumD))
		eachSize = 	$"md-medium-size-${mediumD}"$
		sizes.Add(eachSize)
	End If
	'
	If large > 0 Then
		Dim largeD As Double = large * BANano.parseFloat(eachCell)
		largeD = Round(BANano.parseFloat(largeD))
		eachSize = 	$"md-large-size-${largeD}"$
		sizes.Add(eachSize)
	End If
	'
	If xlarge > 0 Then
		Dim xlargeD As Double = xlarge * BANano.parseFloat(eachCell)
		xlargeD = Round(BANano.parseFloat(xlargeD))
		eachSize = 	$"md-xlarge-size-${xlargeD}"$
		sizes.Add(eachSize)
	End If
	'
	Dim strSizes As String = Element.join(" ", sizes)
	Element.AddClass(strSizes)
	Return Me
End Sub

Sub SetSize(s As Int) As VMElement
	Dim eachCell As Double = 8.33
	Dim actSize As Double = s * BANano.parseFloat(eachCell)
	actSize = Round(BANano.parseFloat(actSize))
	Element.AddClass($"md-size-${actSize}"$)
	Return Me
End Sub

Sub SetHelperText(t As String) As VMElement
	Dim ht As VMElement
	ht.Initialize(vue,$"${ID}hlp"$).SetTag("span")
	ht.AddClass("md-helper-text")
	ht.SetText(t)
	Return ht
End Sub

Sub SetErrorText(t As String) As VMElement
	Dim errorShow As String = $"${ID}error"$
	Dim he As VMElement
	he.Initialize(vue,$"${ID}err"$).SetTag("span")
	he.AddClass("md-error")
	he.SetText(t)
	Return he
End Sub


Sub SetNoWrap(b As Boolean) As VMElement
	Element.AddClass("md-layout-nowrap")
	Return Me
End Sub

Sub SetVModel(k As String) As VMElement
	k = k.tolowercase
	If vue.HasState(k) = False Then
		Dim opt As Map = CreateMap()
		opt.Put(k, Null)
		vue.SetState(opt)
	End If
	Element.SetAttr("v-model", k)
	Return Me
End Sub


Sub SetTag(t As String) As VMElement
	Element.SetTag(t)
	Return Me
End Sub

Sub AddElements(lst As List)
	For Each li As VMElement In lst
		SetText(li.tostring)
	Next
End Sub

Sub AddElement(el As VMElement)
	SetText(el.ToString)
End Sub

Sub SetText(t As String) As VMElement
	Element.SetText(t)
	hasContent = True
	Return Me
End Sub

Sub SetGutter(b As Boolean) As VMElement
	Element.AddClass("md-gutter")
	Return Me
End Sub

Sub SetLayout(b As Boolean) As VMElement
	Element.AddClass("md-layout")
	Return Me
End Sub


Sub SetLayoutItem(b As Boolean) As VMElement
	Element.AddClass("md-layout-item")
	Return Me
End Sub

'add to parent element
Sub Pop(p As VMElement)
	p.Element.AddElement(Element)
	hasContent = True
End Sub

Sub ToString As String
	Return Element.tostring
End Sub

'add to app template
Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub SetOnCancel(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("@md-cancel": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnConfirm(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("@md-confirm": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'Triggered when input value changed
Sub SetOnInput(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:input": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when input gets focus
Sub SetOnFocus(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:focus": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnClear(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:md-clear": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'Triggered when input loses focus
Sub SetOnBlur(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:blur": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'set pointer
Sub SetPointer(b As Boolean) As VMElement
	Element.SetPointer(True)
	Return Me
End Sub

'set onclick event
Sub SetOnClick(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:click": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	SetPointer(True)
	Return Me
End Sub

'set onchange event
Sub SetOnChange(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:change": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub


'set ontouch start event
Sub SetOnTouchStart(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:touchstart": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragOver(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:dragover": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragStart(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:dragstart": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragEnd(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:dragend": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDragEnter(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:dragenter": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub SetOnDrop(module As Object, methodName As String) As VMElement
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	SetAttr(CreateMap("v-on:drop": methodName))
	'add to methods
	vue.SetCallBack(methodName, cb)
	Return Me
End Sub

'set all around margins
Sub SetMargins(mt As Object, mb As Object, ml As Object, mr As Object) As VMElement
	AddStyle("margin-top", mt)
	AddStyle("margin-bottom", mb)
	AddStyle("margin-left", ml)
	AddStyle("margin-right", mr)
	Return Me
End Sub

'add a style using prop and value
Sub AddStyle(prop As String, val As Object) As VMElement
	If val = Null Then Return Me
	Dim m As Map = CreateMap()
	m.Put(prop, val)
	SetStyle(m)
	Return Me
End Sub

Sub SetPadding(pt As Object, pb As Object, pl As Object, pr As Object) As VMElement
	AddStyle("padding-top", pt)
	AddStyle("padding-bottom", pb)
	AddStyle("padding-left", pl)
	AddStyle("padding-right", pr)
	Return Me
End Sub
