B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Private BANano As BANano  'ignore
	Private methods As Map
	Private data As Map
	Private Template As VueHTML
	Private computed As Map
	Private watches As Map
	Private created As BANanoObject
	Private mounted As BANanoObject
	Private beforeCreate As BANanoObject
	Private destroyed As BANanoObject
	Private beforeMount As BANanoObject
	Private updated As BANanoObject
	Private beforeDestroy As BANanoObject
	Private activated As BANanoObject
	Private deactivated As BANanoObject
	Private beforeUpdate As BANanoObject
	Private opt As Map
	Public URL As String
	Public name As String
	Public hasContent As Boolean
	Private refs As Map
	Private props As List
	Private propFrom As String
	Private boVUE As BANanoObject
	Private showKey As String
	Private disKey As String
	Private module As Object
End Sub


'compile html to render
Sub Compile(html As String) As BANanoObject
	Dim bo As BANanoObject = boVUE.RunMethod("compile", Array(html))
	Return bo
End Sub

Sub SetFunctional(b As Boolean) As VueComponent
	opt.Put("functional", b)
	Return Me
End Sub

Sub TemplateFromProperty(propName As String) As VueComponent
	propName = propName.ToLowerCase
	propFrom = propName
	Dim cb As BANanoObject = BANano.CallBack(Me, "RenderIt", Null)
	opt.Put("render", cb)
	Return Me
End Sub

Sub RenderIt As BANanoObject
	Dim option As Map = CreateMap("template" : $"{{ ${propFrom} }}"$)
	Dim bo As BANanoObject = BANano.RunJavascriptMethod("createElement",Array(option))
	Return bo
End Sub	

Sub SetVCloak As VueComponent
	Template.setvcloak
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VueComponent
	Template.SetTabIndex(ti)
	Return Me
End Sub

Sub Pop(p As VueComponent)
	Dim sout As String = ToString
	p.SetText(sout)
End Sub

Sub AddChild(child As String)
	SetText(child)
End Sub

Sub AddElement(el As VMElement) As VueComponent
	AddChild(el.ToString)
	Return Me
End Sub

Sub SetID(sid As String, bind As Boolean) As VueComponent
	If bind Then
		SetAttr(CreateMap(":id":sid))
	Else
		SetAttr(CreateMap("id":sid))
	End If
	Return Me
End Sub

Sub SetName(sid As String, bind As Boolean) As VueComponent
	If bind Then
		SetAttr(CreateMap(":name":sid))
	Else
		SetAttr(CreateMap("name":sid))
	End If
	name = sid
	Return Me
End Sub

Sub AddChildren(lst As List)
	For Each strLine As String In lst
		SetText(strLine)
	Next
End Sub

Public Sub Initialize(sid As String, tag As String, eventHandler As Object) As VueComponent
	ID = sid.tolowercase
	ID = ID.trim
	name = sid
	module = eventHandler
	props.Initialize 
	Template.Initialize(ID,tag)
	methods.Initialize
	data.Initialize
	computed.Initialize
	watches.Initialize
	beforeMount = Null
	beforeUpdate = Null
	created = Null
	mounted = Null
	destroyed = Null
	updated = Null
	beforeCreate = Null
	activated = Null
	deactivated = Null
	beforeDestroy = Null
	opt = CreateMap()
	URL = $"/${ID}"$
	hasContent = False
	boVUE.Initialize("Vue")
	showKey = $"${ID}show"$
	disKey = $"${ID}disabled"$
	SetStateSingle(showKey, True)
	SetVShow(showKey)
	SetStateSingle(disKey, False)
	SetDisabled(False)
	Return Me
End Sub

Sub SetStateTrue(k As String) As VueComponent
	SetStateSingle(k,True)
	Return Me
End Sub

Sub SetStateFalse(k As String) As VueComponent
	SetStateSingle(k,False)
	Return Me
End Sub

Sub SetStateIncrement(k As String) As VueComponent
	Dim oldV As String = GetState(k, "0")
	oldV = BANano.parseInt(oldV) + 1
	SetStateSingle(k, oldV)
	Return Me
End Sub

Sub SetStateDecrement(k As String) As VueComponent
	Dim oldV As String = GetState(k, "0")
	oldV = BANano.parseInt(oldV) - 1
	SetStateSingle(k, oldV)
	Return Me
End Sub

'a single state change
Sub SetStateSingle(k As String, v As Object) As VueComponent
	Dim optx As Map = CreateMap()
	optx.Put(k, v)
	SetState(optx)
	Return Me
End Sub

Sub ToggleState(stateName As String) As VueComponent
	Dim bcurrent As Boolean = GetState(stateName,"")
	bcurrent = Not(bcurrent)
	Dim optx As Map = CreateMap()
	optx.Put(stateName, bcurrent)
	SetState(optx)
	Return Me
End Sub

'check if we have state
Sub StateExists(stateName As String) As Boolean
	stateName = stateName.tolowercase
	Return data.ContainsKey(stateName)
End Sub

Sub SetShowState(k As String, v As Boolean)
	Dim showKey As String = $"${k}show"$
	SetStateSingle(showKey, v)
End Sub

Sub SetDisabledState(k As String, v As Boolean)
	Dim disKey As String = $"${k}disabled"$
	SetStateSingle(disKey, v)
End Sub

'inject the template
Sub SetTemplate(tmp As String) As VueComponent
	Template.clear
	Template.SetText(tmp)
	Return Me
End Sub

Sub Component() As Map
	Dim tmp As String = Template.tostring
	If data.Size > 0 Then 
		Dim cb As BANanoObject = BANano.CallBack(Me, "returnData", Null)
		opt.Put("data", cb)
	End If
	If methods.Size > 0 Then opt.Put("methods", methods)
	If computed.Size > 0 Then opt.Put("computed", computed)
	If watches.Size > 0 Then opt.Put("watch", watches)
	If props.Size <> 0 Then opt.Put("props", props)
	If updated <> Null Then opt.Put("updated", updated)
	If destroyed <> Null Then opt.Put("destroyed", destroyed)
	If mounted <> Null Then	opt.Put("mounted", mounted)
	If beforeCreate <> Null Then opt.Put("beforeCreate", beforeCreate)
	If created <> Null Then opt.Put("created", created)
	If beforeMount <> Null Then opt.Put("beforeMount", beforeMount)
	If beforeUpdate <> Null Then opt.Put("beforeUpdate", beforeUpdate)
	If activated <> Null Then opt.Put("activated", activated)
	If deactivated <> Null Then opt.Put("deactivated", deactivated)
	If beforeDestroy <> Null Then opt.Put("beforeDestroy", beforeDestroy)
	opt.Put("template", tmp)
	Return opt
End Sub

'generate another vue instance
Sub RenderTo(elID As String)
	elID = elID.tolowercase
	BANano.GetElement($"#${elID}"$).empty
	'
	Dim boVUE As BANanoObject
	opt.Put("el", $"#${elID}"$)
	Component
	boVUE.Initialize2("Vue", opt)
	'get the state
	Dim dKey As String = "$data"
	data = boVUE.GetField(dKey).Result
	'get the refs
	Dim rKey As String = "$refs"
	refs = boVUE.GetField(rKey).result
End Sub

'set mounted
Sub SetMounted(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	mounted = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set destroyed
Sub SetDestroyed(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	destroyed = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set activated
Sub SetActivated(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	activated = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set deactivated
Sub SetDeActivated(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	deactivated = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set updated
Sub SetUpdated(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	updated = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

'set beforemount
Sub SetBeforeMount(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	beforeMount = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

'set beforeupdate
Sub SetBeforeUpdate(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	beforeMount = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

'set before destroy
Sub SetBeforeDestroy(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	beforeDestroy = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

Sub SetOnMouseOut(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	SetAttr(CreateMap("v-on:mouseout": methodName))
	Return Me
End Sub

Sub SetOnMouseOver(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	SetAttr(CreateMap("v-on:mouseover": methodName))
	Return Me
End Sub

'set before created
Sub SetBeforeCreate(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	beforeCreate = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub


'set created
Sub SetCreated(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	created = BANano.CallBack(module, methodName, Null)
	Return Me
End Sub

'set direct method
Sub SetMethod(methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

private Sub ReturnData As Map
	Return data
End Sub

'set computed
Sub SetComputed(k As String, methodName As String) As VueComponent
	methodName = methodName.ToLowerCase
	If SubExists(module, methodName) Then
		k = k.tolowercase
		If data.ContainsKey(k) Then
			SetStateSingle(k, Null)
		End If
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(e))
		computed.Put(k, cb)
	End If
	Return Me
End Sub

'set watches 
Sub SetWatch(k As String, bImmediate As Boolean, bDeep As Boolean, methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		k = k.tolowercase
		If data.ContainsKey(k) Then
			SetStateSingle(k, Null)
		End If
		Dim newVal As Object
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, Array(newVal))
		Dim deepit As Map = CreateMap()
		deepit.Put("handler", methodName)
		deepit.Put("deep", bDeep)
		deepit.Put("immediate", bImmediate)
		watches.Put(k, deepit)
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

'set state object
Sub SetStateMap(mapKey As String, mapValues As Map) As VueComponent
	Dim opt As Map = CreateMap()
	opt.Put(mapKey, mapValues)
	SetState(opt)
	Return Me
End Sub

'set state list
Sub SetStateList(mapKey As String, mapValues As List) As VueComponent
	Dim opt As Map = CreateMap()
	opt.Put(mapKey, mapValues)
	SetState(opt)
	Return Me
End Sub

Sub SetStateListValues(mapValues As List) As VueComponent
	For Each lstValue As String In mapValues
		Dim opt As Map = CreateMap()
		opt.Put(lstValue, "")
		SetState(opt)
	Next
	Return Me
End Sub

'set the state
Sub SetState(m As Map) As VueComponent
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		k = k.tolowercase
		data.Put(k, v)
	Next
	Return Me
End Sub

'return if state exists
Sub HasState(k As String) As Boolean
	Return data.ContainsKey(k)
End Sub

Sub GetStates(lst As List) As Map
	Dim sm As Map = CreateMap()
	For Each lstrec As String In lst
		lstrec = lstrec.tolowercase
		Dim state As Object = GetState(lstrec, Null)
		sm.Put(lstrec, state)
	Next
	Return sm
End Sub

'get the state
Sub GetState(k As String, v As Object) As Object
	k = k.tolowercase
	If data.ContainsKey(k) Then
		Dim out As Object = data.GetDefault(k,v)
		Return out
	Else
		Log("GetState: First set the v-model for " & k)
		Return ""
	End If
End Sub


'set color
Sub SetColor(c As Object) As VueComponent
	SetStyle(CreateMap("color": c))
	Return Me
End Sub

Sub SetStyle(m As Map) As VueComponent
	Template.SetStyles(m)
	Return Me
End Sub


'set padding
Sub SetBackgroundColor(p As Object) As VueComponent
	SetStyle(CreateMap("background-color":p))
	Return Me
End Sub

Sub ToString As String
	Return Template.tostring
End Sub

'Triggered when input value changed
Sub SetOnInput(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:input": methodName))
		'add to methods
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

'Triggered when input gets focus
Sub SetOnFocus(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:focus": methodName))
		'add to methods
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

'Triggered when input loses focus
Sub SetOnBlur(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:blur": methodName))
		'add to methods
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

'set pointer
Sub SetPointer(b As Boolean) As VueComponent
	Template.SetPointer(True)
	Return Me
End Sub

'set onclick event
Sub SetOnClick(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:click": methodName))
		'add to methods
		methods.Put(methodName, cb)
		SetPointer(True)
	End If
	Return Me
End Sub

'set onchange event
Sub SetOnChange(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:change": methodName))
		'add to methods
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

'set onselected event
Sub SetOnSelected(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:selected": methodName))
		'add to methods
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

'set ontouch start event
Sub SetOnTouchStart(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:touchstart": methodName))
		'add to methods
		methods.Put(methodName, cb)
	End If
	Return Me
End Sub

Sub SetVModel(k As String) As VueComponent
	k = k.tolowercase
	If HasState(k) = False Then
		Dim opt As Map = CreateMap()
		opt.Put(k, Null)
		SetState(opt)
	End If
	Template.SetAttr("v-model", k)
	Return Me
End Sub

Sub SetMarginAll(p As Object) As VueComponent
	SetStyle(CreateMap("margin":p))
	Return Me
End Sub

Sub SetTag(t As String) As VueComponent
	Template.SetTag(t)
	Return Me
End Sub


Sub SetPaddingAll(p As Object) As VueComponent
	SetStyle(CreateMap("padding":p))
	Return Me
End Sub

Sub SetSRC(s As String, bind As Boolean) As VueComponent
	If bind Then
		SetAttr(CreateMap(":src":s))
	Else	
		Template.SetSrc(s)
	End If
	Return Me
End Sub

Sub SetAlt(a As String) As VueComponent
	Template.SetAlt(a)
	Return Me
End Sub


Sub SetMaxWidth(mw As String) As VueComponent
	Template.SetStyle("max-width",mw)
	Return Me
End Sub

Sub SetTo(t As Object) As VueComponent
	Template.SetAttr("to", t)
	Return Me
End Sub

Sub SetHREF(h As String) As VueComponent
	Template.SetAttrHREF(h)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VueComponent
	Template.SetAttr(":disabled", b)
	Return Me
End Sub

Sub SetVerticalAlignMiddle As VueComponent
	SetStyle(CreateMap("vertical-align": "middle"))
	Return Me
End Sub

Sub SetLineHeight(lh As Object) As VueComponent
	SetStyle(CreateMap("line-height": lh))
	Return Me
End Sub

Sub SetAttr(m As Map) As VueComponent
	For Each k As String In m.Keys
		Dim v As Object = m.Get(k)
		Template.SetAttr(k, v)
	Next
	Return Me
End Sub

Sub SetVIf(vif As String) As VueComponent
	vif = vif.ToLowerCase
	If HasState(vif) = False Then
		Dim opt As Map = CreateMap()
		opt.Put(vif, False)
		SetState(opt)
	End If
	SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As String) As VueComponent
	vif = vif.ToLowerCase
	If HasState(vif) = False Then
		Dim opt As Map = CreateMap()
		opt.Put(vif, False)
		SetState(opt)
	End If
	SetVShow(vif)
	Return Me
End Sub

Sub SetText(txt As String) As VueComponent
	Template.settext(txt)
	hasContent = True
	Return Me
End Sub

'add break
Sub AddBR
	Template.SetText("<br>")
End Sub

'add hr
Sub AddHR
	Template.SetText("<hr>")
End Sub

'add a class
Sub AddClass(c As String) As VueComponent
	Template.AddClass(c)
	Return Me
End Sub

Sub SetChecked(b As Boolean) As VueComponent
	SetAttr(CreateMap(":checked":b))
	Return Me
End Sub

Sub RemoveClass(className As String) As VueComponent
	RemoveClass(className)
	Return Me
End Sub

Sub Clear(b As Boolean) As VueComponent
	If b = False Then Return Me
	Template.Clear
	Return Me
End Sub

Sub SetIsHidden(b As Boolean) As VueComponent
	If b = False Then Return Me
	AddClass("is-hidden")
	Return Me
End Sub

Sub SetType(t As String) As VueComponent
	Template.SetType(t)
	Return Me
End Sub

Sub SetKey(k As Object, bind As Boolean) As VueComponent
	If bind Then
		SetAttr(CreateMap(":key": k))
	Else
		SetAttr(CreateMap("key": k))
	End If
	Return Me
End Sub

Sub SetRef(varRef As String) As VueComponent
	If varRef <> "" Then
		SetAttr(CreateMap("ref": varRef))
	End If
	Return Me
End Sub

Sub SetVText(t As Object) As VueComponent
	SetAttr(CreateMap("v-text": t))
	Return Me
End Sub

Sub SetVElse(t As Object) As VueComponent
	SetAttr(CreateMap("v-else": t))
	Return Me
End Sub

Sub SetVElseIf(t As Object) As VueComponent
	SetAttr(CreateMap("v-else-if": t))
	Return Me
End Sub

Sub SetVOn(t As Object) As VueComponent
	SetAttr(CreateMap("v-on": t))
	Return Me
End Sub

Sub SetVBind(t As String) As VueComponent
	t = t.tolowercase
	SetAttr(CreateMap("v-bind": t))
	Return Me
End Sub

Sub SetIs(t As String) As VueComponent
	t = t.tolowercase
	SetAttr(CreateMap(":is": t))
	Return Me
End Sub


Sub SetVOnce(t As Object) As VueComponent
	SetAttr(CreateMap("v-once": t))
	Return Me
End Sub

'set for
Sub SetVFor(item As String, dataSource As String) As VueComponent
	dataSource = dataSource.tolowercase
	item = item.tolowercase
	If StateExists(dataSource) = False Then
		Log("VueComponent.SetVFor: The data source state has not been registered, register it first!")
	End If
	Dim sline As String = $"${item} in ${dataSource}"$
	SetAttr(CreateMap("v-for": sline))
	Return Me
End Sub

'set value
Sub SetValue(valueName As String, bind As Boolean) As VueComponent
	If bind Then
		valueName = valueName.tolowercase
		SetAttr(CreateMap(":value":valueName))
	Else
		SetAttr(CreateMap("value":valueName))
	End If
	Return Me
End Sub

Sub SetVHtml(h As String) As VueComponent
	If h = "" Then Return Me
	h = h.tolowercase
	SetAttr(CreateMap("v-html": h))
	Return Me
End Sub

Sub SetAutoComplete(auto As String, bind As Boolean) As VueComponent
	If bind Then
		SetAttr(CreateMap(":autocomplete": auto))
	Else
		SetAttr(CreateMap("autocomplete": auto))
	End If
	Return Me
End Sub

'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VueComponent
	Dim b As Map = CreateMap()
	b.Put("border-style", bstyle)
	b.Put("border-width", width)
	b.Put("border-color", color)
	SetStyle(b)
	Return Me
End Sub

'set cursor move
Sub SetCursorMove As VueComponent
	SetStyle(CreateMap("cursor": "move"))
	Return Me
End Sub

'set text alignment
Sub SetTextAlignCenter As VueComponent
	SetStyle(CreateMap("text-align": "center"))
	Return Me
End Sub

'set draggable
Sub SetDraggable(b As Boolean) As VueComponent
	SetAttr(CreateMap(":draggable":b))
	Return Me
End Sub

'set droppable
Sub SetDroppable(b As Boolean) As VueComponent
	SetAttr(CreateMap(":droppable":b))
	Return Me
End Sub

'set width
Sub SetWidth(w As String) As VueComponent
	SetStyle(CreateMap("width":w))
	Return Me
End Sub

'set height
Sub SetHeight(h As String) As VueComponent
	SetStyle(CreateMap("height":h))
	Return Me
End Sub

'set a call back
Sub SetCallBack(methodName As String, cb As BANanoObject)
	methodName = methodName.ToLowerCase
	methods.Put(methodName, cb)
End Sub

'set on drag over
Sub SetOnDragOver(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:dragover": methodName))
		'add to methods
		SetCallBack(methodName, cb)
	End If
	Return Me
End Sub

'set on drag start
Sub SetOnDragStart(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:dragstart": methodName))
		'add to methods
		SetCallBack(methodName, cb)
	End If
	Return Me
End Sub

'set on drag end
Sub SetOnDragEnd(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:dragend": methodName))
		'add to methods
		SetCallBack(methodName, cb)
	End If
	Return Me
End Sub

'set on drag enter
Sub SetOnDragEnter(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:dragenter": methodName))
		'add to methods
		SetCallBack(methodName, cb)
	End If
	Return Me
End Sub

'set on drop event
Sub SetOnDrop(methodName As String) As VueComponent
	methodName = methodName.tolowercase
	If SubExists(module, methodName) Then
		Dim e As BANanoEvent
		Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
		SetAttr(CreateMap("v-on:drop": methodName))
		'add to methods
		SetCallBack(methodName, cb)
	End If
	Return Me
End Sub

'set all margins
Sub SetMargins(mt As Object, mb As Object, ml As Object, mr As Object) As VueComponent
	AddStyle("margin-top", mt)
	AddStyle("margin-bottom", mb)
	AddStyle("margin-left", ml)
	AddStyle("margin-right", mr)
	Return Me
End Sub

'add a property
Sub AddProp(propName As String) As VueComponent
	props.Add(propName)
	Return Me
End Sub

Sub AddProps(propsList As List) As VueComponent
	For Each k As String In propsList
		AddProp(k)
	Next
	Return Me
End Sub

'add a style using prop and value
Sub AddStyle(prop As String, val As Object) As VueComponent
	If val = Null Then Return Me
	Dim m As Map = CreateMap()
	m.Put(prop, val)
	SetStyle(m)
	Return Me
End Sub

'set the padding style of the component
Sub SetPadding(pt As Object, pb As Object, pl As Object, pr As Object) As VueComponent
	AddStyle("padding-top", pt)
	AddStyle("padding-bottom", pb)
	AddStyle("padding-left", pl)
	AddStyle("padding-right", pr)
	Return Me
End Sub
