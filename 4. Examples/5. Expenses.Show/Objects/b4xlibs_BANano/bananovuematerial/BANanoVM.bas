B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12, 9
Sub Class_Globals
	Private BANano As BANano
	Public Overlay As VMLoader
	Private Themes As Map
	Public refs As Map
	Public data As Map
	Private Prompt As VMPrompt
	Public material As BANanoObject
	Public VueLoading As BANanoObject
	Public VueCal As BANanoObject
	Public VueBO As BANanoObject
	Public JQuery As BANanoObject
	Private BANano As BANano   'ignore
	Public VM As BANanoObject
	Public Vue As BANanoVue
	Public VMDef As BANanoObject
	Public Content As VMElement
	Public NavBar As VMToolBar
	Public Drawer As VMDrawer
	Public App As VMElement
	Private Alert As VMAlert
	Private Confirm As VMConfirm
	Private Snack As VMSnackbar
	Public ColorOptions As Map
	Public BorderOptions As Map
	Public IntensityOptions As Map	
	Private HasKnob As Boolean
	Private HasInfoBox As Boolean
	Public Elevation As Map
	Public Container As VMContainer
	Public GetTemplate As String
	Private Pages As List
	Private Chartkick As BANanoObject
	Private Chart As BANanoObject
	Private VueGoogleMaps As BANanoObject
End Sub

Sub CreateGMap(sid As String, eventHandler As Object) As VMGMap
	Dim el As VMGMap
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub SetGMapKey(key As String)
	VueGoogleMaps.Initialize("VueGoogleMaps")
	Dim opt As Map = CreateMap()
	Dim load As Map = CreateMap()
	load.Put("key", key)
	load.Put("libraries", "places")
	opt.Put("load", load)
	opt.Put("installComponents", True)
	Vue.Use1(VueGoogleMaps, opt)
End Sub

'add a container
Sub AddContainer(cont As VMContainer)
	Content.SetText(cont.tostring)
End Sub

'add a container
Sub AddContainerRC(row As Int, col As Int, cont As VMContainer)
	Container.AddComponent(row, col, cont.ToString)
End Sub

'add a grid
Sub AddGrid(grd As VMGrid)
	grd.Pop(Content)
End Sub

Sub JoinLists(lst As List) As List
	Return Vue.JoinLists(lst)
End Sub

Sub FixRecordsUseDesign(recs As List, design As VMContainer)
	Vue.FixRecords(recs, design.Strings, design.Integers, design.Booleans, design.Dates, design.Doubles)
End Sub

'copy a state from one to another
Sub State2Another(source As String, target As String, defaultValue As Object)
	Vue.State2Another(source, target, defaultValue)
End Sub

Sub CreateChartKick(sid As String, eventHandler As Object) As VMChartKick
	Dim el As VMChartKick
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateTable(sid As String, eventHandler As Object) As VMTable
	Dim el As VMTable
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateSpinner(sid As String, eventHandler As Object) As VMSpinner
	Dim el As VMSpinner
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateProgress(sid As String, eventHandler As Object) As VMProgress
	Dim el As VMProgress
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

'update value of progress bar
Sub SetProgressValue(pID As String, pVal As Int) As BANanoVM
	pID = pID.ToLowerCase
	SetStateSingle($"${pID}value"$, pVal)
	Return Me
End Sub

'update buffer of progress bar
Sub SetProgressBuffer(pID As String, bVal As Int) As BANanoVM
	pID = pID.ToLowerCase
	SetStateSingle($"${pID}buffer"$, bVal)
	Return Me
End Sub

'add a dialog to the page
Sub AddDialog(diag As VMDialog)
	diag.Pop(Content)
End Sub

'add a snack bar
Sub AddSnackBar(SnackBar As VMSnackbar)
	SnackBar.Pop(Content)
End Sub

'add a speed dial to the page
Sub AddSpeedDial(speed As VMSpeedDial)
	speed.Pop(Content)
End Sub

'show any dialog, alert, prompt
Sub ShowDialog(dID As String)
	dID = dID.tolowercase
	SetStateTrue(dID)
End Sub

Sub HideDialog(dID As String)
	dID = dID.tolowercase
	SetStateFalse(dID)
End Sub

Sub SetCloak(b As Boolean) As BANanoVM
	Vue.SetCloak(b)
	Return Me
End Sub

Sub SetRequired(elID As String, b As Boolean)
	elID = elID.tolowercase
	Vue.SetStateSingle($"${elID}required"$, b)
End Sub

Sub Enable(elID As String)
	elID = elID.tolowercase
	Vue.SetStateSingle($"${elID}disabled"$, False)
End Sub

Sub Disable(elID As String)
	elID = elID.tolowercase
	Vue.SetStateSingle($"${elID}disabled"$, True)
End Sub

Sub SetEnabled(elID As String, b As Boolean)
	elID = elID.tolowercase
	Vue.SetStateSingle($"${elID}disabled"$, b)
End Sub

Sub Hide(elID As String)
	elID = elID.tolowercase
	Vue.SetStateSingle($"${elID}show"$, False)
End Sub

Sub Show(elID As String)
	Vue.SetStateSingle($"${elID}show"$, True)
End Sub

Sub ShowError(elID As String)
	Vue.SetStateSingle($"${elID}error"$, True)
End Sub

Sub HideError(elID As String)
	Vue.SetStateSingle($"${elID}error"$, False)
End Sub

Sub Date2YYYYMMDD(value As Object) As String
	Return Vue.Date2YYYYMMDD(value)
End Sub

#if css
	.numberinput.md-list-item-default.md-list-item-content {display:block !important;}
#End If

Sub DateAdd(mDate As String, HowManyDays As Int) As String
	Return Vue.DateAdd(mDate, HowManyDays)
End Sub

Sub Age(birthDay As String) As Int
	Return Vue.Age(birthDay)
End Sub

Sub DateDiff(CurrentDate As String, OtherDate As String) As Int
	Return Vue.DateDiff(CurrentDate, OtherDate)
End Sub

Sub CreateFrappeGantt(sid As String, eventHandler As Object) As VMFrappeGantt
	Dim el As VMFrappeGantt
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub CreateContainer(sid As String, eventHandler As Object) As VMContainer
	Dim el As VMContainer
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub InStr(searchit As String, searchfor As String) As Int
	Return Vue.InStr(searchit, searchfor)
End Sub

Public Sub GetAlphabets(value As String) As String
	Return Vue.GetAlphabets(value)
End Sub

Sub JSONSetProperty(sjson As String, updates As Map) As String
	Return Vue.JSONSetProperty(sjson, updates)
End Sub

Sub CreateNumberInput(sid As String) As VMNumberInput
	Dim el As VMNumberInput
	el.Initialize(Vue, sid)
	Return el
End Sub

Sub CreateCSS As VMCSS
	Dim El As VMCSS
	El.Initialize 
	Return El
End Sub

Sub EQOperators(sm As Map) As List
	Return Vue.EQOperators(sm)
End Sub

'create a map subset from list of keys
Sub ExtractMap(source As Map, keys As List) As Map
	Return ExtractMap(source, keys)
End Sub

'return md5 hash
Sub Md5Hash(value As String, key As String, raw As Boolean) As String
	Return Vue.Md5Hash(value, key, raw)
End Sub

Sub CreatePrettyPrint(sid As String, lang As String) As VMPrettyPrint
	Dim El As VMPrettyPrint
	El.Initialize(Vue, sid, lang)
	Return El
End Sub

Sub CreateEnlighter(sid As String, lang As String) As VMEnlighter
	Dim el As VMEnlighter
	el.Initialize(Vue, sid, lang)
	Return el
End Sub

'set dynamic style
Sub SetStyle(className As String, prop As String, val As String) As BANanoVM
	Vue.SetStyle(className, prop, val)
	Return Me
End Sub

'return a pretty json from something
Sub JSONPretty(m As Object) As String
	Return Vue.JSONPretty(m)
End Sub

'Sub CreatePrism(sid As String, lang As String) As VMPrism
'	Dim el As VMPrism
'	el.Initialize(Vue, sid, lang)
'	Return el
'End Sub

Sub CreateEmptyState(sid As String, eventHandler As Object) As VMEmptyState
	Dim el As VMEmptyState
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateImage(img As String, eventHandler As Object) As VMImage
	Dim el As VMImage
	el.Initialize(Vue, img, eventHandler)
	Return el
End Sub

Sub CreatePDF(sid As String, url As String) As VMPDF
	Dim el As VMPDF
	el.Initialize(Vue, sid, url)
	Return el
End Sub

Sub CreateGijgoTable(sid As String, PrimaryKey As String,  module As Object) As VMGijgoTable
	Dim el As VMGijgoTable
	el.Initialize(Vue, sid, PrimaryKey, module)
	Return el
End Sub

Sub CreateTimePicker(sid As String, eventHandler As Object) As VMTimePicker
	Dim el As VMTimePicker
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub


Sub MvField(sValue As String, iPosition As Int, Delimiter As String) As String
	Return Vue.MvField(sValue, iPosition, Delimiter)
End Sub

'convert object to string
Sub CStr(o As Object) As String
	Return Vue.CStr(o)
End Sub


'pad things to the right
Sub PadRight(Value As String, MaxLen As Int, PadChar As String) As String
	Return Vue.PadRight(Value, MaxLen, PadChar)
End Sub

'length
private Sub Len(Text As String) As Int
	Return Text.Length
End Sub

Sub StrParse(Delim As String, InputString As String) As List
	Return Vue.StrParse(Delim, InputString)
End Sub

private Sub InitColors
	IntensityOptions.Initialize
	IntensityOptions.put("","Normal")
	IntensityOptions.put("lighten-1","Lighten 1")
	IntensityOptions.put("lighten-2","Lighten 2")
	IntensityOptions.put("lighten-3","Lighten 3")
	IntensityOptions.put("lighten-4","Lighten 4")
	IntensityOptions.put("lighten-5","Lighten 5")
	IntensityOptions.put("darken-1","Darken 1")
	IntensityOptions.put("darken-2","Darken 2")
	IntensityOptions.put("darken-3","Darken 3")
	IntensityOptions.put("darken-4","Darken 4")
	IntensityOptions.put("accent-1","Accent 1")
	IntensityOptions.put("accent-2","Accent 2")
	IntensityOptions.put("accent-3","Accent 3")
	IntensityOptions.put("accent-4","Accent 4")
	'
	ColorOptions.Initialize
	ColorOptions.Put("amber","Amber")
	ColorOptions.Put("black","Black")
	ColorOptions.Put("blue","Blue")
	ColorOptions.Put("blue-grey","Blue Grey")
	ColorOptions.Put("brown","Brown")
	ColorOptions.Put("cyan","Cyan")
	ColorOptions.Put("deep-orange","Deep Orange")
	ColorOptions.Put("deep-purple","Deep Purple")
	ColorOptions.Put("green","Green")
	ColorOptions.Put("grey","Grey")
	ColorOptions.Put("indigo","Indigo")
	ColorOptions.Put("light-blue","Light Blue")
	ColorOptions.Put("light-green", "Light Green")
	ColorOptions.Put("lime", "Lime")
	ColorOptions.Put("orange", "Orange")
	ColorOptions.Put("pink", "Pink")
	ColorOptions.Put("purple", "Purple")
	ColorOptions.Put("red", "Red")
	ColorOptions.Put("teal", "Teal")
	ColorOptions.Put("transparent", "Transparent")
	ColorOptions.Put("white", "White")
	ColorOptions.Put("yellow", "Yellow")
	'
	BorderOptions.Initialize
	BorderOptions.Put("dashed", "Dashed")
	BorderOptions.Put("dotted", "Dotted")
	BorderOptions.Put("double", "Double")
	BorderOptions.Put("groove", "Groove")
	BorderOptions.Put("hidden", "Hidden")
	BorderOptions.Put("inset", "Inset")
	BorderOptions.Put("none", "None")
	BorderOptions.Put("outset", "Outset")
	BorderOptions.Put("ridge", "Ridge")
	BorderOptions.Put("solid", "Solid")
End Sub

#if css
.bottomitembadge {
    width: 19px;
    height: 19px;
    display: flex;
    justify-content: center;
    align-items: center;
    position: absolute;
    top: 6px;
    right: 6px;
    background: #fff;
    border-radius: 100%;
    color: #000;
    font-size: 10px;
    font-style: normal;
    font-weight: 600;
    letter-spacing: -.05em;
    font-family: 'Roboto Mono', monospace;
  }
#End If

Sub MergeMaps(oldm As Map, newm As Map) As Map
	Return Vue.MergeMaps(oldm, newm)
End Sub

Sub CreateInfoBox(sid As String, eventHandler As Object) As VMInfoBox
	HasInfoBox = True
	Dim el As VMInfoBox
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateKnob(sid As String, eventHandler As Object) As VMKnob
	HasKnob = True
	Dim el As VMKnob
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub AddComponent(comp As VueComponent)
	Vue.AddComponent(comp)
End Sub

'add an element to the page content
Sub AddElement(elm As VMElement)
	elm.Pop(Content)
End Sub

Sub AddHTML(htmlContent As String)
	Content.SetText(htmlContent)
End Sub

Sub CreateCustomComponent(id As String, tag As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag(tag)
	Return el
End Sub

'create a VueComponent
Sub CreateComponent(id As String, tag As String, eventHandler As Object) As VueComponent
	Dim el As VueComponent
	el.Initialize(id, tag, eventHandler)
	Return el
End Sub

'create an element with a 'component' tag
Sub CreateComponent1(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("component")
	Return el
End Sub

Sub AddRoute(path As String, comp As VueComponent) As BANanoVM
	Vue.AddRoute(path, comp)
	Return Me
End Sub

Sub UpdateBadge(elID As String, counted As String) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}value"$
	Vue.SetStateSingle(badValue, counted)
	Return Me
End Sub

Sub UpdateItemBadge(elID As String, counted As String) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}badgevalue"$
	Vue.SetStateSingle(badValue, counted)
	Return Me
End Sub

Sub IncrementBadge(elID As String, counted As Int) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}badgevalue"$
	Dim lastValue As String = Vue.GetState(badValue, "0")
	Dim intLast As Int = BANano.parseInt(lastValue)
	intLast = intLast + counted
	Vue.SetStateSingle(badValue, intLast)
	Return Me
End Sub

Sub DecrementBadge(elID As String, counted As Int) As BANanoVM
	elID = elID.tolowercase
	Dim badValue As String = $"${elID}badgevalue"$
	Dim lastValue As String = Vue.GetState(badValue, "0")
	Dim intLast As Int = BANano.parseInt(lastValue)
	intLast = intLast - counted
	Vue.SetStateSingle(badValue, intLast)
	Return Me
End Sub

'hack
Sub GetChipIDFromEvent(e As BANanoEvent) As String
	Try
		Dim spath As List = e.OtherField("path").Result
		Dim sitem As Map = spath.get(5)
		Dim sid As String = sitem.get("id")
		Return sid
	Catch
		Return ""
		Log(LastException)
	End Try
End Sub

Sub CreateAvatar(sid As String, module As Object) As VMAvatar
	Dim el As VMAvatar
	el.Initialize(Vue,sid, module)
	Return el
End Sub


Sub CreateBadge(sid As String) As VMBadge
	Dim el As VMBadge
	el.Initialize(Vue, sid)
	Return el
End Sub

'add break
Sub BR As String
	Return "<br>"
End Sub

'add hr
Sub HR As String
	Return "<hr>"
End Sub

Sub CreateRouterLink(rID As String, Text As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,rID).SetTag("router-link").SetText(Text)
	Return el
End Sub

Sub CreateRouterView(rID As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,rID).SetTag("router-view")
	Return el
End Sub

Sub CreateKeepAlive(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,sid).SetTag("keep-alive")
	Return el
End Sub

Sub CreateTag(id As String, tag As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,id).SetTag(tag)
	Return el
End Sub

Sub CreateDiv(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,id).SetTag("div")
	Return el
End Sub

Sub CreateUL(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,id).SetTag("ul")
	Return el
End Sub

Sub CreateLI(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,id).SetTag("li")
	Return el
End Sub


Sub CreateOL(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,id).SetTag("ol")
	Return el
End Sub


Sub CreateP(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("p")
	Return el
End Sub

Sub CreateH1(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("h1")
	Return el
End Sub

'create a FORM
Sub CreateFORM1(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("form")
	Return el
End Sub

Sub CreateLABEL(id As String) As VMLabel
	Dim el As VMLabel
	el.Initialize(Vue, id)
	Return el
End Sub

'create input
Sub CreateINPUT1(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("input")
	Return el
End Sub

'create text area
Sub CreateTEXTAREA1(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("textarea")
	Return el
End Sub

'create button
Sub CreateBUTTON1(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("button")
	Return el
End Sub


Sub CreateH2(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("h2")
	Return el
End Sub

Sub CreateH3(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("h3")
	Return el
End Sub

Sub CreateH4(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("h4")
	Return el
End Sub

Sub CreateH5(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("h5")
	Return el
End Sub

Sub CreateH6(id As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, id).SetTag("h6")
	Return el
End Sub

'sate date format to be used by material
Sub SetDateFormat(df As String) As BANanoVM
	material.GetField("locale").SetField("dateFormat", df)
	Return Me
End Sub

'return if state exists
Sub HasState(k As String) As Boolean
	Return Vue.HasState(k)
End Sub


Sub GetStates(lst As List) As Map
	Return Vue.GetStates(lst)
End Sub

'set the state
Sub SetState(m As Map) As BANanoVM
	Vue.SetState(m)
	Return Me
End Sub

'convert a list to key value pairs map records
Sub List2Options(lst As List, keyName As String, valueName As String) As Map
	Return List2Options(lst, keyName, valueName)
End Sub

'convert a list to key value pairs map records
Sub List2Map(lst As List, keyName As String, valueName As String) As Map
	Return List2Options(lst, keyName, valueName)
End Sub

'convert map to a list of maps with key and values
Sub Map2Options(m As Map, keyName As String, valueName As String) As List
	Return Vue.Map2Options(m, keyName, valueName)
End Sub

'change state of items to be false
Sub HideItems(items As List)
	For Each item As String In items
		Vue.SetStateSingle(item, False)
	Next
End Sub

'change state of items to be true
Sub ShowItems(items As List)
	For Each item As String In items
		Vue.SetStateSingle(item, True)
	Next
End Sub

Sub SetStateSingle(k As Object, v As Object) As BANanoVM
	Vue.SetStateSingle(k, v)
	Return Me
End Sub

Sub SetStateListValues(mapValues As List) As BANanoVM
	Vue.SetStateListValues(mapValues)	
	Return Me
End Sub

'set state list
Sub SetStateList(mapKey As String, mapValues As List) As BANanoVM
	Vue.SetStateList(mapKey, mapValues)
	Return Me
End Sub

'set state object
Sub SetStateMap(mapKey As String, mapValues As Map) As BANanoVM
	Vue.SetStateMap(mapKey, mapValues)
	Return Me
End Sub

'set watches 
Sub SetWatch(k As String, bImmediate As Boolean, bDeep As Boolean, module As Object, methodName As String) As BANanoVM
	Vue.SetWatch(k, bImmediate, bDeep, module, methodName)
	Return Me
End Sub


'set direct method
Sub SetMethod(module As Object, methodName As String) As BANanoVM
	Vue.SetMethod(module, methodName)
	Return Me
End Sub

'set created
Sub SetCreated(module As Object, methodName As String) As BANanoVM
	Vue.SetCreated(module, methodName)
	Return Me
End Sub

Sub RunMethod(methodName As String, params As Object) As BANanoObject
	Return Vue.RunMethod(methodName, params)
End Sub


Sub CallMethod(methodName As String)
	Vue.CallMethod(methodName)
End Sub

Sub CallComputed(methodName As String) As Object
	Return Vue.CallComputed(methodName)
End Sub

Sub GetIDFromEvent(e As BANanoEvent) As String
	Return Vue.GetIDFromEvent(e)
End Sub

Sub GetKeyFromEvent(e As BANanoEvent) As String
	Return Vue.GetKeyFromEvent(e)
End Sub


Sub GetEventTargetProperty(e As BANanoEvent, prop As String) As String
	Return Vue.GetEventTargetProperty(e, prop)
End Sub

private Sub SetFontFamily(ff As Object)
	Vue.SetFontFamily(ff)
End Sub

Sub StateExists(stateName As String) As Boolean
	Return Vue.StateExists(stateName)
End Sub

Sub ToggleState(stateName As String) As BANanoVM
	Vue.ToggleState(stateName)
	Return Me
End Sub

Sub SetStateTrue(k As String) As BANanoVM
	Vue.SetStateTrue(k)
	Return Me
End Sub

Sub AuditTrail(oldM As Map, newM As Map) As Map
	Return Vue.AuditTrail(oldM, newM)
End Sub

Sub SetStateFalse(k As String) As BANanoVM
	Vue.SetStateFalse(k)
	Return Me
End Sub

Sub SetStateIncrement(k As String) As BANanoVM
	Vue.SetStateIncrement(k)
	Return Me
End Sub

Sub SetStateDecrement(k As String) As BANanoVM
	Vue.SetStateDecrement(k)
	Return Me
End Sub

Sub GetState(k As String, default As Object) As Object
	Dim res As Object = Vue.GetState(k, default)
	Return res
End Sub

'set mounted
Sub SetMounted(module As Object, methodName As String) As BANanoVM
	Vue.SetMounted(module, methodName)
	Return Me
End Sub


Sub ForceUpdate
	Vue.ForceUpdate
End Sub

Sub CreateSlider(sid As String, eventHandler As Object) As VMSlider
	Dim el As VMSlider
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub CreateBottomBarItem(sid As String, eventHandler As Object) As VMBottomBarItem
	Dim el As VMBottomBarItem
	el.Initialize(Vue, sid,eventHandler)
	Return el 
End Sub

Sub CreateButtomBar(sid As String, eventHandler As Object) As VMBottomBar
	Dim el As VMBottomBar
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub CreateTabsItem(sid As String, eventHandler As Object) As VMTabsItem
	Dim el As VMTabsItem
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub CreateTabs(sid As String, eventHandler As Object) As VMTabs
	Dim el As VMTabs
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub CreateVueCal(sid As String, eventHandler As Object, width As String, height As String) As VMVueCal
	Dim el As VMVueCal
	el.Initialize(Vue, sid, eventHandler, width, height)
	Return el
End Sub

Sub CreateSwitch(sid As String, eventHandler As Object) As VMSwitch
	Dim el As VMSwitch
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateCheckBox(sid As String, eventHandler As Object) As VMCheckBox
	Dim el As VMCheckBox
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub UX()
	Content.SetText(Container.ToString)
	Create
	Vue.ux
	GetTemplate = Vue.GetTemplate
	VueBO = Vue.BOVue
	'get vue material object
	Dim rKey As String = "$material"
	material = VueBO.GetField(rKey)
	Dim srefs As String = "$refs"
	refs = VueBO.GetField(srefs).result
	Dim dKey As String = "$data"
	data = VueBO.GetField(dKey).Result
	If HasInfoBox Then SetInfoBox
	If HasKnob Then SetKnob
	'set locale date format
	SetDateFormat("yyyy-MM-dd")
End Sub

'refresh jquery stuff, infobox and knob
Sub PageRefresh
	If HasInfoBox Then SetInfoBox
	If HasKnob Then SetKnob
End Sub

Sub Use(bo As BANanoObject)
	Vue.Use(bo)
End Sub

Sub CreateStepperItem(sid As String, eventHandler As Object) As VMStepItem
	Dim el As VMStepItem
	el.Initialize(Vue, sid,eventHandler)
	Return el 
End Sub

Sub CreateSteppers(sid As String, eventHandler As Object) As VMSteppers
	Dim el As VMSteppers
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub SetScrollBar(b As Boolean) As BANanoVM
	App.SetAttr(CreateMap(":md-scrollbar":b))
	Return Me
End Sub

Sub CreateList(sid As String,module As Object) As VMList
	Dim el As VMList
	el.Initialize(Vue, sid, module)
	Return el 
End Sub

Sub CreateListView(sid As String, module As Object) As VMListView
	Dim el As VMListView
	el.Initialize(Vue, sid, module)
	Return el 
End Sub

Sub CreateGrid(sid As String, eventHandler As Object) As VMGrid
	Dim el As VMGrid
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub CreateCaption(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").AddClass("md-caption")
	Return el
End Sub
'
Sub CreateBody1(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").SetBody1(True)
	Return el
End Sub

Sub CreateA(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("a")
	Return el
End Sub

Sub CreateBody2(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").SetBody2(True)
	Return el
End Sub

Sub CreateSubHeading(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").SetSubHeading(True)
	Return el
End Sub

Sub CreateSubHead(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").SetSubHead(True)
	Return el
End Sub

Sub CreateHeadline(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").SetHeadline(True)
	Return el
End Sub

Sub CreateDisplay1(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").SetDisplay1(True)
	Return el
End Sub

Sub CreateDisplay2(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").SetDisplay2(True)
	Return el
End Sub

Sub CreateDisplay3(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").SetDisplay3(True)
	Return el
End Sub

Sub CreateDisplay4(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("span").SetDisplay4(True)
	Return el
End Sub
	
private Sub SetNeeds
	HasKnob = False
	HasInfoBox = False
End Sub

Sub GetShowState(k As String) As Boolean
	Dim showKey As String = $"${k}show"$
	Return GetState(showKey,False)
End Sub

Sub GetDisabledState(k As String) As Boolean
	Dim disKey As String = $"${k}disabled"$
	Return GetState(disKey,False)
End Sub

Sub GetRequiredState(k As String) As Boolean
	Dim disKey As String = $"${k}required"$
	Return GetState(disKey,False)
End Sub

Sub SetErrorState(k As String, v As Boolean)
	Dim showKey As String = $"${k}error"$
	SetStateSingle(showKey, v)
End Sub

Sub SetShowState(k As String, v As Boolean)
	Dim showKey As String = $"${k}show"$
	SetStateSingle(showKey, v)
End Sub

Sub SetDisabledState(k As String, v As Boolean)
	Dim disKey As String = $"${k}disabled"$
	SetStateSingle(disKey, v)
End Sub

Sub SetRequiredState(k As String, v As Boolean)
	Dim disKey As String = $"${k}required"$
	SetStateSingle(disKey, v)
End Sub

Sub CopyMap(source As Map, keys As List) As Map
	Return Vue.CopyMap(source, keys)
End Sub

Sub FixRecords(recs As List, trimThese As List, numThese As List, boolThese As List, dateThese As List, dblThese As List)
	Vue.FixRecords(recs, trimThese, numThese, boolThese, dateThese, dblThese)
End Sub

Sub MakeDouble(m As Map, xkeys As List)
	Vue.MakeDouble(m, xkeys)
End Sub

Sub MakeInteger(m As Map, xkeys As List)
	Vue.MakeInteger(m, xkeys)
End Sub

Sub MakeBoolean(m As Map, xkeys As List)
	Vue.MakeBoolean(m, xkeys)
End Sub

Sub MakeTrim(m As Map, xkeys As List)
	Vue.MakeTrim(m, xkeys)
End Sub

'date picker dates in yyyy-mm-dd format
Sub Prepare(keys As List)
	For Each k As String In keys
		Dim sk As String = GetState(k,"")
		sk = Date2YYYYMMDD(sk)
		SetStateSingle(k, sk)
	Next
End Sub

'convert date picker value to correct date
Sub ToYYYYMMDD(vmodel As String)
	Dim sk As String = GetState(vmodel,"")
	sk = Date2YYYYMMDD(sk)
	SetStateSingle(vmodel, sk)
End Sub

Sub JoinNonBlanks(delimiter As String, lst As List) As String
	Return Vue.JoinNonBlanks(delimiter, lst)
End Sub

Sub JoinMaps(lst As List) As Map
	Return Vue.JoinMaps(lst)
End Sub

Sub MakeDate(m As Map, xkeys As List)
	Vue.MakeDate(m, xkeys)
End Sub

Sub ToggleNamedState(stateName As String, state1 As String, state2 As String) As BANanoVM
	Vue.ToggleNamedState(stateName, state1, state2)
	Return Me
End Sub

'compile html to render
Sub Compile(html As String) As BANanoObject
	Dim bo As BANanoObject = Vue.Compile(html)
	Return bo
End Sub

Sub CreateWaterBall(sid As String, eventHandler As Object, Width As String, Height As String) As VMWaterBall
	Dim el As VMWaterBall
	el.Initialize(Vue, sid, eventHandler, Width, Height)
	Return el 
End Sub

Sub CreateProgressCircle(sid As String, Width As String, Height As String) As VMProgressCircle
	Dim el As VMProgressCircle
	el.Initialize(Vue, sid, Width, Height)
	Return el 
End Sub

'set the initial background image for the page
Sub SetBackgroundImage(url As String) As BANanoVM
	Content.SetBackgroundImage(url)
	Return Me
End Sub

'update the background image for the page during runtime
Sub UpdateBackgroundImage(url As String)
	BANano.GetElement("#content").SetStyle(BANano.ToJson(CreateMap("background-image": $"url('${url}')"$, "background-size": "100% 100%")))
End Sub

Sub MakePx(sValue As String) As String
	Return Vue.MakePx(sValue)
End Sub

Sub SetDestroyed(module As Object, methodName As String) As BANanoVM
	Vue.SetDestroyed(module, methodName)
	Return Me
End Sub

Sub SetActivated(module As Object, methodName As String) As BANanoVM
	Vue.SetActivated(module, methodName)
	Return Me
End Sub

Sub SetComputed(k As String, module As Object, methodName As String) As BANanoVM
	Vue.SetComputed(k, module, methodName)
	Return Me
End Sub


Sub SetDeActivated(module As Object, methodName As String) As BANanoVM
	Vue.SetDeActivated(module, methodName)
	Return Me
End Sub

Sub SetUpdated(module As Object, methodName As String) As BANanoVM
	Vue.SetUpdated(module, methodName)
	Return Me
End Sub

Sub SetBeforeMount(module As Object, methodName As String) As BANanoVM
	Vue.SetBeforeMount(module, methodName)
	Return Me
End Sub

Sub SetBeforeUpdate(module As Object, methodName As String) As BANanoVM
	Vue.SetBeforeUpdate(module, methodName)
	Return Me
End Sub

Sub SetBeforeDestroy(module As Object, methodName As String) As BANanoVM
	Vue.SetBeforeDestroy(module, methodName)
	Return Me
End Sub

Sub SetBeforeCreate(module As Object, methodName As String) As BANanoVM
	Vue.SetBeforeCreate(module, methodName)
	Return Me
End Sub

'add a page to the template of the app
Sub AddPage(name As String, module As Object)
	Pages.add(name)
	BANano.CallSub(module, "Code", Array(Me))   'ignore
End Sub

'show a page for the app
Sub ShowPage(name As String)
	For Each page As String In Pages
		If name = page Then
			Show(name)
		Else
			Hide(page)
		End If
	Next
End Sub


Public Sub Initialize(module As Object, sAppName As String)
	Pages.initialize
	Vue.Initialize()
	Themes.Initialize 
	SetNeeds
	JQuery = Vue.jquery
	VM.Initialize("VueMaterial")
	VueCal.Initialize("vuecal")
	VueLoading.initialize("VueLoading")
	VMDef = VM.GetField("default")
	Chartkick.initialize("Chartkick")
	Chart.Initialize("Chart")
	Vue.Use(Chartkick.RunMethod("use", Chart))
	Vue.Use(VMDef)
	Vue.Use(VueLoading)
	Vue.AddComponentBO("loading",VueLoading)
	Vue.AddComponentBO("vue-cal", VueCal)
	App = CreateApp("")
	Vue.SetStateSingle("navbarmode", Null)
	App.SetAttr1(":md-mode", "navbarmode")
	Vue.SetState(CreateMap("navbartitle":sAppName))
	Vue.SetState(CreateMap("drawertblbartitle":sAppName))
	Vue.SetState(CreateMap("snack":False,"backshow":False,"menushow":True))
	Vue.SetState(CreateMap("alerttitle":"","alertmessage":"","alertkey":"","snackmessage":"","confirmtext":""))
	Vue.SetState(CreateMap("confirmtitle":"","confirmmessage":"","confirmkey":"","confirmtext":"","canceltext":""))
	NavBar.Initialize(Vue, "navbar", module)
	Drawer.Initialize(Vue, "drawer", module)
	Content = CreateAppContent("content")
	NavBar.SetHasBackButton(False).SetAppToolbar(True)
	NavBar.SetHasMenuButton(True)
	'
	'put loader on page
	Overlay = CreateLoader("pageloader", module)
	Overlay.Pop(Content)
	'
	CreateButton("back",module).SetIconButton(True).SetIcon("keyboard_arrow_left").Pop(NavBar.StartSection)
	CreateButton("menu",module).SetIconButton(True).SetIcon("menu").SetOnClick(Me).Pop(NavBar.StartSection)
	
	NavBar.SetHasLogo(False)
	NavBar.SetLogo("")
	'
	Alert = CreateAlert("alert",module).SetTitle("Alert").SetConfirmText("Ok").SetContent("Alert Content!")
	Alert.Pop(Content)

	Confirm = CreateConfirm("confirm",module).SetTitle("Title").SetContent("Content")
	Confirm.SetConfirmText("Ok").SetCancelText("Cancel")
	Confirm.Pop(Content)
	'
	Prompt = CreatePrompt("prompt", module).SetTitle("Title").SetContent("Content").SetMaxLength(20).SetPlaceHolder("Placeholder")
	Prompt.SetConfirmText("Ok").SetCancelText("Cancel")
	Prompt.Pop(Content)
	'
	Snack = CreateSnackBar("snack",module)
	Snack.Pop(Content)
	
	If SubExists(module, "confirm_cancel") = False Then
		Log("Initialize: Pleasure ensure you have a confirm_cancel event!")
	End If
	'
	If SubExists(module, "confirm_ok") = False Then
		Log("Initialize: Pleasure ensure you have a confirm_ok event!")
	End If
	
	If SubExists(module, "prompt_cancel") = False Then
		Log("Initialize: Pleasure ensure you have a prompt_cancel event!")
	End If
	'
	If SubExists(module, "prompt_ok") = False Then
		Log("Initialize: Pleasure ensure you have a prompt_ok event!")
	End If
	
	InitColors
	Vue.Template.AddClass("page-container")
	Container.Initialize(Vue, sAppName & "page", module) 
	'
	Dim e As Int
	For e = 0 To 24
		Elevation.Put(e, e)
	Next
End Sub


Sub ShowPrompt1(pName As String)
	SetPrompt(Null)
	ShowDialog(pName)
End Sub

Sub SetPrompt(pvalue As Object)
	Vue.SetStateSingle("promptvalue",pvalue)
End Sub

Sub GetPrompt As String
	Dim ss As String = Vue.GetState("promptvalue","")
	Return ss
End Sub

'build your own alert
Sub AddAlert(alertid As String, eventHandler As Object, title As String, AlertContent As String, ConfirmText As String)
	Dim myalert As VMAlert = CreateAlert(alertid,eventHandler).SetStatic(True).SetTitle(title).SetConfirmText(ConfirmText).SetContent(AlertContent)
	myalert.Pop(Content)
End Sub

'build your own confirm
Sub AddConfirm(confirmid As String, eventHandler As Object, title As String, ConfirmContent As String, ConfirmText As String, CancelText As String)
	Dim myalert As VMConfirm = CreateConfirm(confirmid,eventHandler).SetStatic(True).SetTitle(title).SetConfirmText(ConfirmText).SetContent(ConfirmContent).SetCancelText(CancelText)
	myalert.Pop(Content)
End Sub

'build your own prompt
Sub AddPrompt(promptid As String, eventHandler As Object, title As String, Message As String,  placeHolder As String, maxLen As Int,ConfirmText As String, CancelText As String)
	Vue.SetStateSingle(promptid, Null)
	Dim myprompt As VMPrompt = CreatePrompt(promptid, eventHandler).SetStatic(True).SetTitle(title).SetContent(Message).SetMaxLength(maxLen).SetPlaceHolder(placeHolder)
	myprompt.SetConfirmText(ConfirmText).SetCancelText(CancelText)
	myprompt.Pop(Content)
End Sub

Sub SetCallBack(module As Object, methodName As String) As BANanoVM
	methodName = methodName.tolowercase
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	Vue.SetCallBack(methodName, cb)
	Return Me
End Sub

Sub menu_click(e As BANanoEvent)
	Drawer.Toggle
	NavBar.ToggleMenu
End Sub

'add a theme to use in the app
Sub AddTheme(themeName As String, ForeColor As String, ForeColorIntensity As String, BackColor As String, BackColorIntensity As String)
	themeName = themeName.ToLowerCase
	Dim fc As String = $"${ForeColor} ${ForeColorIntensity}"$
	Dim bc As String = $"${BackColor} ${BackColorIntensity}"$
	'
	fc = fc.Trim
	bc = bc.trim
	'
	Dim theme As Map = CreateMap()
	theme.Put("fc", fc)
	theme.Put("bc", bc)
	Themes.Put(themeName, theme)
End Sub


'apply a theme to an element
Sub UseTheme(ve As VMElement, themeName As String)
	themeName = themeName.ToLowerCase
	If Themes.ContainsKey(themeName) Then
		Dim theme As Map = Themes.Get(themeName)
		Dim fc As String = theme.Get(themeName)
		Dim bc As String = theme.Get(themeName)
		'
		Dim color As Map = CreateMap()
		color.Put("color", fc)
		color.Put("background-color", bc)
		ve.SetStyle(color)
	End If
End Sub


Sub ShowAlert(process As String, Title As String, Message As String, ConfirmText As String)
	Vue.SetState(CreateMap("alertkey":process, "alerttitle":Title,"alertmessage":Message,"confirmtext":ConfirmText))
	Alert.Show
End Sub

Sub ShowConfirm(process As String, Title As String, Message As String,ConfirmText As String, CancelText As String)
	Vue.SetState(CreateMap("confirmtitle":Title,"confirmmessage":Message,"confirmkey":process,"confirmtext":ConfirmText,"canceltext":CancelText))
	Confirm.Show
End Sub

Sub ShowPrompt(Title As String, Message As String,Placeholder As String, MaxLen As Int, ConfirmText As String, CancelText As String)
	Vue.SetStateSingle("promptvalue",Null)
	Vue.SetState(CreateMap("promptplaceholder":Placeholder, "prompttitle":Title,"promptcontent":Message, "promptconfirmtext":ConfirmText,"promptcanceltext":CancelText,"promptmaxlength":MaxLen))
	Prompt.Show
End Sub

Sub ShowSnackBar(Message As String)
	Vue.SetState(CreateMap("snackmessage":Message))
	Snack.show
End Sub

Sub CreateSnackBar(sid As String, eventHandler As Object) As VMSnackbar
	Dim el As VMSnackbar
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub GetConfirm As String
	Return Vue.getstate("confirmkey","")
End Sub
	

Sub GetAlert As String
	Return Vue.getstate("alertkey","")
End Sub

'Sub CreateAutoComplete(sid As String) As VMAutoComplete
'	Dim el As VMAutoComplete
'	el.Initialize(vue, sid)
'	el.SetVModel(sid)
'	Return el 
'End Sub

Sub CreateChips(sid As String, eventHandler As Object) As VMChips
	Dim el As VMChips
	el.Initialize(Vue, sid,eventHandler)
	Return el
End Sub

Sub CreateForm(sid As String, eventHandler As Object) As VMForm
	Dim el As VMForm
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateChip(sid As String, eventHandler As Object) As VMChip
	Dim el As VMChip
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateTextArea(sid As String, eventHandler As Object) As VMTextArea
	Dim el As VMTextArea
	el.Initialize(Vue, sid,eventHandler)
	Return el
End Sub

Sub CreateInput(sid As String, eventHandler As Object) As VMInput
	Dim el As VMInput
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateFile(sid As String, eventHandler As Object) As VMFile
	Dim el As VMFile
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub


Sub CreateNumber(sid As String, eventHandler As Object) As VMInput
	Dim el As VMInput = CreateInput(sid,eventHandler).SetTypeNumber(True)
	Return el
End Sub

Sub CreateEmail(sid As String, eventHandler As Object) As VMInput
	Dim el As VMInput = CreateInput(sid, eventHandler).SetTypeEmail(True)
	Return el
End Sub

Sub CreatePassword(sid As String, eventHandler As Object) As VMInput
	Dim el As VMInput = CreateInput(sid,eventHandler).SetTypePassword(True)
	Return el
End Sub

Sub CreateTel(sid As String, eventHandler As Object) As VMInput
	Dim el As VMInput = CreateInput(sid,eventHandler).SetTypeTel(True)
	Return el
End Sub


Sub CreateField(parentid As String, sid As String, eventHandler As Object) As VMField
	Dim el As VMField
	el.Initialize(Vue, parentid, sid,eventHandler)
	Return el
End Sub

Sub CreateRow(sid As String) As VMRow
	Dim el As VMRow
	el.Initialize(Vue, sid)
	Return el 
End Sub

Sub CreateCol(sid As String) As VMCol
	Dim el As VMCol
	el.Initialize(Vue, sid)
	Return el 
End Sub

Sub AddContent(els As String)
	Vue.SetTemplate(els)
End Sub

'create the app
Sub Create
	NavBar.Pop(App)
	Drawer.Pop(App)
	Content.Pop(App)
	AddContent(App.ToString)
End Sub

Sub CreateSpeedDial(sid As String, eventHandler As Object) As VMSpeedDial
	Dim el As VMSpeedDial
	el.Initialize(Vue, sid,eventHandler)
	Return el 
End Sub

Sub CreateSubHeader(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTagSubHeader(True)
	Return el 
End Sub

Sub CreateMenuItem(sid As String, eventHandler As Object) As VMMenuItem
	Dim el As VMMenuItem
	el.Initialize(Vue, sid,eventHandler)
	Return el
End Sub

Sub CreateMenu(sid As String, module As Object) As VMMenu
	Dim el As VMMenu
	el.Initialize(Vue, sid, module)
	Return el
End Sub

Sub CreatePrompt(sid As String, eventHandler As Object) As VMPrompt
	Dim el As VMPrompt
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub CreateConfirm(sid As String, eventHandler As Object) As VMConfirm
	Dim el As VMConfirm
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateAlert(sid As String, eventHandler As Object) As VMAlert
	Dim el As VMAlert
	el.Initialize(Vue, sid, eventHandler)
	Return el 
End Sub

Sub CreateProperty(module As Object, sid As String) As VMProperty
	Dim el As VMProperty
	el.Initialize(Vue, module, sid)
	Return el 
End Sub

Sub CreateTree(module As Object, sid As String, priKey As String) As VMTree
	Dim el As VMTree
	el.Initialize(Vue, module, sid, priKey)
	Return el 
End Sub


Sub CreateDialog(sid As String, module As Object) As VMDialog
	Dim el As VMDialog
	el.Initialize(Vue, sid, module)
	Return el 
End Sub

Sub CreateDivider(b As Boolean) As VMDivider
	Dim el As VMDivider
	el.Initialize(Vue, "")
	Return el
End Sub

Sub CreateRadio(sid As String, eventHandler As Object) As VMRadio
	Dim el As VMRadio
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateDatePicker(sid As String, eventHandler As Object) As VMDatePicker
	Dim el As VMDatePicker
	el.Initialize(Vue, sid, eventHandler)
	Return el
End Sub

Sub CreateListItem(sid As String, module As Object) As VMListItem
	Dim el As VMListItem
	el.Initialize(Vue, sid, module)
	Return el
End Sub

Sub CreateIcon(sid As String) As VMIcon
	Dim el As VMIcon
	el.Initialize(Vue, sid)
	Return el
End Sub

Sub CreateSpan(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,sid).SetTag("span")
	Return el
End Sub

Sub CreateAppContent(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid)
	el.SetTag("md-app-content")
	Return el
End Sub

Sub CreateElement(sid As String, stag As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,sid).SetTag(stag)
	Return el 
End Sub

Sub CreateDrawer(sid As String, module As Object) As VMDrawer
	Dim el As VMDrawer
	el.Initialize(Vue,sid, module)
	Return el
End Sub

Sub CreateButton(sid As String,module As Object) As VMButton
	Dim el As VMButton
	el.Initialize(Vue, sid, module)
	Return el 
End Sub

Sub CreateRadioGroup(sid As String, sCaption As String, eventHandler As Object) As VMRadioGroup
	Dim el As VMRadioGroup
	el.Initialize(Vue, sid, sCaption, eventHandler)
	Return el 
End Sub

Sub CreateCheckBoxGroup(sid As String, sCaption As String, eventHandler As Object) As VMCheckBoxGroup
	Dim el As VMCheckBoxGroup
	el.Initialize(Vue, sid, sCaption, eventHandler)
	Return el 
End Sub

Sub CreateToolbar(sid As String, module As Object) As VMToolBar
	Dim el As VMToolBar
	el.Initialize(Vue, sid, module)
	Return el 
End Sub

Sub CreateLoader(sid As String, module As Object) As VMLoader
	Dim el As VMLoader
	el.Initialize(Vue, sid, module)
	Return el 
End Sub

Sub Validate(rec As Map, required As Map) As Boolean
	Return Vue.Validate(rec, required)
End Sub

Sub CreateApp(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue, sid).SetTag("md-app")
	el.SetStyle(CreateMap("height":"100vh"))
	Return el
End Sub

Sub CreateLayout(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,sid).SetTag("div").SetLayout(True)
	Return el 
End Sub

Sub CreateLayoutItem(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,sid).SetTag("div").SetLayoutItem(True)
	Return el 
End Sub

Sub CreateSelect(sid As String, eventHandler As Object) As VMSelect
	Dim el As VMSelect
	el.Initialize(Vue,sid,eventHandler)
	Return el 
End Sub

'create a SELECT element
Sub CreateSELECT1(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,sid).SetTag("select")
	Return el 
End Sub

'create an OPTION element
Sub CreateOPTION1(sid As String) As VMElement
	Dim el As VMElement
	el.Initialize(Vue,sid).SetTag("option")
	Return el 
End Sub

Public Sub DateNow() As String
	Return Vue.DateNow
End Sub


Public Sub DateTimeNow() As String
	Return Vue.DateTimeNow
End Sub

'get an element using jquery
Sub JQueryElement(sid As String) As BANanoObject
	sid = sid.ToLowerCase
	Dim bo As BANanoObject = JQuery.Selector($"#${sid}"$)
	Return bo
End Sub

'convert a map keys to lowercase
Sub MakeLowerCase(m As Map) As Map
	Return Vue.MakeLowerCase(m)
End Sub

Sub HTTPUpload(fileObj As Object, module As Object, methodname As String)
	Vue.HTTPUpload(fileObj, module, methodname)
End Sub

Sub GetFileDetails(fileObj As Map) As FileObject
	Return Vue.GetFileDetails(fileObj)
End Sub

'for infor box
Sub SetInfoBox
	JQuery.Selector(".count-to").RunMethod("countTo", Null)
End Sub

Sub SetKnob
	BANano.RunJavascriptMethod("tron", Null)
End Sub

'show hour glass
Sub PagePause
	Overlay.SetIsLoading(True)
End Sub

'hide hourglass
Sub PageResume
	Overlay.SetIsLoading(False)
End Sub
