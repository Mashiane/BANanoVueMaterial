B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public ID As String
	Public vue As BANanoVue
	Private labels As Map	
	Private Bag As VMElement
	Private Lst As VMList
	Type PropControls(vmodel As String, value As String, text As String, typeOf As String, module As Object, methodName As String, _
	iconName As String, MinValue As Int, MaxValue As Int, sourceName As String, options As Map, sourcefield As String, displayfield As String, _
	OptionsList As List)
	Dim controls As Map
	Private eventHandler As Object
	Private fields As List
	Private BANano As BANano 'ignore
	Private Booleans As List
	Private Strings As List
	Private Integers As List
	Private Doubles As List
	Private Dates As List
	Private defaults As Map
End Sub

'initialize the bag
Public Sub Initialize(v As BANanoVue, module As Object, sid As String) As VMProperty
	ID = sid.ToLowerCase
	vue = v
	vue.SetStateSingle("expandProp", True)
	eventHandler = module
	fields.Initialize 
	Bag.Initialize(vue, ID)
	Bag.SetKey(ID,False).AddClass("propertybag")
	Lst.Initialize(vue, $"${ID}list"$,module)
	Lst.SetStyle(CreateMap("width": "100%", "height":"100%"))
	Lst.SetStyle(CreateMap("font-size":"14px"))
	', "display": "inline-block"))
	'Lst.SetStyle(CreateMap("overflow": "hidden !important", "vertical-align": "top"))
	'Lst.SetStyle(CreateMap("overflow": "hidden !important"))
	Lst.isPropertyBag = True
	Lst.SetExpandSingle("expandProp")
	labels.Initialize 
	controls.Initialize 
	AddHeading("main", "Main")
	Booleans.Initialize 
	Strings.Initialize 
	Integers.Initialize 
	Doubles.Initialize 
	defaults.Initialize 
	Dates.Initialize 
	Return Me
End Sub

Sub ExpandItem(sid As String, b As Boolean) As VMProperty
	Lst.ExpandItem(sid, b)
	Return Me
End Sub

Sub SetElevation(e As Int) As VMProperty
	Bag.SetElevation(e)
	Return Me
End Sub


Sub AddIntegers(i As List) As VMProperty
	For Each s As String In i
		Integers.Add(s)
	Next
	Return Me
End Sub

Sub AddStrings(i As List) As VMProperty
	For Each s As String In i
		Strings.Add(s)
	Next
	Return Me
End Sub

Sub AddBooleans(i As List) As VMProperty
	For Each s As String In i
		Booleans.Add(s)
	Next
	Return Me
End Sub

Sub AddDoubles(i As List) As VMProperty
	For Each s As String In i
		Doubles.Add(s)
	Next
	Return Me
End Sub

Sub AddDates(i As List) As VMProperty
	For Each s As String In i
		Dates.Add(s)
	Next
	Return Me
End Sub


Sub setProperties(m As Map)
	If Doubles.Size > 0 Then vue.MakeDouble(m, Doubles)
	If Integers.Size > 0 Then vue.MakeInteger(m, Integers)
	If Strings.Size > 0 Then vue.MakeTrim(m, Strings)
	If Dates.Size > 0 Then vue.MakeDate(m, Dates)
	If Booleans.Size > 0 Then vue.MakeBoolean(m, Booleans)
	vue.SetState(m)
End Sub

Sub SetVIf(vif As Object) As VMProperty
	Bag.SetVIf(vif)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMProperty
	Bag.SetVShow(vif)
	Return Me
End Sub

Sub AddSelect(parent As String, vmodel As String, vText As String, sourceName As String, options As Map, sourcefield As String, displayfield As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = vText
	nc.value = ""
	nc.typeOf = "select"
	nc.sourceName = sourceName
	nc.options = options
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
End Sub

'Sub AddAutoComplete(parent As String, vmodel As String, vText As String, sourceName As String, optionsList As List)
'	parent = parent.tolowercase
'	If parent = "" Then parent = "main"
'	Dim existing As List
'	If controls.ContainsKey(parent) Then
'		existing = controls.Get(parent)
'	Else
'		existing.Initialize
'	End If
'	'
'	Dim nc As PropControls
'	nc.Initialize
'	nc.vmodel = vmodel
'	nc.text = vText
'	nc.value = ""
'	nc.typeOf = "autocomplete"
'	nc.sourceName = sourceName
'	nc.optionslist = optionsList
'	existing.Add(nc)
'	controls.Put(parent, existing)
'	fields.Add(vmodel)
'	Strings.Add(vmodel)
'	defaults.Put(vmodel,"")
'End Sub


'Sub AddAutoComplete1(parent As String, vmodel As String, vText As String, sourceName As String, options As Map, sourcefield As String, displayfield As String)
'	parent = parent.tolowercase
'	If parent = "" Then parent = "main"
'	Dim existing As List
'	If controls.ContainsKey(parent) Then
'		existing = controls.Get(parent)
'	Else
'		existing.Initialize
'	End If
'	'
'	Dim nc As PropControls
'	nc.Initialize
'	nc.vmodel = vmodel
'	nc.text = vText
'	nc.value = ""
'	nc.typeOf = "autocomplete"
'	nc.sourceName = sourceName
'	nc.options = options
'	nc.sourcefield = sourcefield
'	nc.displayfield = displayfield
'	existing.Add(nc)
'	controls.Put(parent, existing)
'	fields.Add(vmodel)
'	Strings.Add(vmodel)
'	defaults.Put(vmodel,"")
'End Sub

Sub SetBorder(b As Boolean) As VMProperty
	Lst.SetBorder(b)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMProperty
	Bag.SetStyle(m)
	Return Me
End Sub

'get properties
Sub getProperties As Map
	Dim rec As Map = CreateMap()
	For Each k As String In fields
		Dim v As Object = vue.GetState(k, "")
		If v = BANano.UNDEFINED Then v = ""
		rec.Put(k, v)
	Next
	If Booleans.Size > 0 Then vue.MakeBoolean(rec, Booleans)
	If Doubles.Size > 0 Then vue.MakeDouble(rec, Doubles)
	If Integers.Size > 0 Then vue.MakeInteger(rec, Integers)
	If Strings.Size > 0 Then vue.MakeTrim(rec, Strings)  
	Return rec
End Sub

'clear the property bag
Sub Clear
	For Each k As String In fields
		vue.SetStateSingle(k, Null)
	Next
End Sub


Sub getJSON As String
	Dim them As Map = getProperties
	Dim sjson As String = BANano.ToJson(them)
	Return sjson
End Sub

Sub AddButton(parent As String, btnID As String, btnText As String, methodName As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = ""
	nc.text = btnText
	nc.value = btnID
	nc.typeOf = "btn"
	nc.module = eventHandler
	nc.methodName = methodName
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

Sub AddSlider(parent As String, vmodel As String, Label As String, minValue As Int, maxValue As Int, value As Int)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = Label
	nc.value = value
	nc.typeOf = "slider"
	nc.MinValue = minValue
	nc.MaxValue = maxValue
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Integers.Add(vmodel)
	defaults.Put(vmodel,value)
End Sub

Sub AddNumberInput(parent As String, vmodel As String, Label As String, minValue As Int, maxValue As Int, value As Int)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = Label
	nc.value = value
	nc.typeOf = "numberinput"
	nc.MinValue = minValue
	nc.MaxValue = maxValue
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Integers.Add(vmodel)
	defaults.Put(vmodel,value)
End Sub


Sub AddLabel(parent As String, txt As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = ""
	nc.text = txt
	nc.value = ""
	nc.typeOf = "lbl"
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

'add a heading
Sub AddHeading(sectName As String, sectHeading As String) As VMProperty
	sectName = sectName.tolowercase
	labels.Put(sectName, sectHeading)
	'
	Dim items As List
	items.Initialize 
	controls.Put(sectName, items)
	Return Me
End Sub

Sub AddSwitch(parent As String, vModel As String, text As String, bValue As Boolean)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = bValue
	nc.typeOf = "swt"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Booleans.Add(vModel)
	defaults.Put(vModel,bValue)
End Sub

Sub AddIconButton(parent As String, btnID As String, btnIcon As String, methodName As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.iconName = btnIcon
	nc.value = btnID
	nc.typeOf = "btnicon"
	nc.module = eventHandler
	nc.methodName = methodName
	existing.Add(nc)
	controls.Put(parent, existing)
End Sub

Sub AddPassword(parent As String, vModel As String, vText As String, vValue As String)
	AddInput(parent, "password", vModel, vText, "", vValue)
	Strings.Add(vModel)
End Sub

Sub AddText(parent As String, vModel As String, vText As String, vIcon As String, vValue As String)
	AddInput(parent, "text", vModel, vText, vIcon, vValue)
	Strings.add(vModel)
End Sub

Sub AddTel(parent As String, vModel As String, vText As String, vIcon As String,vValue As String)
	AddInput(parent, "tel", vModel, vText, vIcon, vValue)
	Integers.add(vModel)
End Sub

Sub AddNumber(parent As String, vModel As String, vText As String, vIcon As String, vValue As String)
	AddInput(parent, "number", vModel, vText, vIcon, vValue)
	Integers.Add(vModel)
End Sub

Sub AddEmail(parent As String, vModel As String, vText As String, vIcon As String, vValue As String)
	AddInput(parent, "email", vModel, vText, vIcon, vValue)
	Strings.Add(vModel)
End Sub

private Sub AddInput(parent As String, typeOf As String, vModel As String, vText As String, vIcon As String, vValue As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = vText
	nc.value = vValue
	nc.typeOf = typeOf
	nc.iconName = vIcon
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	defaults.Put(vModel,vValue)
End Sub

Sub SetDefaults
	vue.SetState(defaults)
End Sub

Sub AddCheck(parent As String, vModel As String, text As String, bvalue As Boolean)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = bvalue
	nc.typeOf = "chk"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Booleans.Add(vModel)
	defaults.Put(vModel,bvalue)

End Sub

Sub AddDatePicker(parent As String, vModel As String, text As String, vValue As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = vValue
	nc.typeOf = "dp"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Strings.Add(vModel)
	defaults.Put(vModel,vValue)
End Sub

Sub AddTextArea(parent As String, vModel As String, text As String, vValue As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	existing = controls.Get(parent)
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vModel
	nc.text = text
	nc.value = vValue
	nc.typeOf = "textarea"
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vModel)
	Strings.Add(vModel)
	defaults.Put(vModel,vValue)

End Sub

'Sub AddRadioGroup(parent As String, name As String, title As String, options As Map)
'	AddHeading(parent, title)
'	For Each k As String In options.Keys
'		Dim v As String = options.Get(k)
'		AddRadio(parent, name, k, v)
'	Next
'	defaults.Put(name,"")
'End Sub

Sub AddRadioGroup(parent As String, vmodel As String, vText As String, sourceName As String, options As Map, sourcefield As String, displayfield As String)
	parent = parent.tolowercase
	If parent = "" Then parent = "main"
	Dim existing As List
	If controls.ContainsKey(parent) Then
		existing = controls.Get(parent)
	Else
		existing.Initialize
	End If
	'
	Dim nc As PropControls
	nc.Initialize
	nc.vmodel = vmodel
	nc.text = vText
	nc.value = ""
	nc.typeOf = "radiogroup"
	nc.sourceName = sourceName
	nc.options = options
	nc.sourcefield = sourcefield
	nc.displayfield = displayfield
	existing.Add(nc)
	controls.Put(parent, existing)
	fields.Add(vmodel)
	Strings.Add(vmodel)
	defaults.Put(vmodel,"")
End Sub

'Sub AddRadio(parent As String, vmodel As String, itemID As String, text As String)
'	parent = parent.tolowercase
'	If parent = "" Then parent = "main"
'	Dim existing As List
'	existing = controls.Get(parent)
'	'
'	Dim nc As PropControls
'	nc.Initialize
'	nc.vmodel = vmodel
'	nc.text = text
'	nc.value = itemID
'	nc.typeOf = "rad"
'	existing.Add(nc)
'	controls.Put(parent, existing)
'	fields.Add(vmodel)
'	Strings.Add(vmodel)
'End Sub

Sub ToString As String
	'add headings
	For Each k As String In labels.keys
		Dim v As String = labels.Get(k)
		Dim items As List = controls.Get(k)
		Select Case k
		Case "main"
			For Each item As PropControls In items
				Select Case item.typeOf
				Case "number","text","tel","email","password"
					Lst.AddInput(item.typeOf, item.vmodel, item.text, item.iconName, item.value)
				Case "chk"
					Lst.AddCheckBox(item.vmodel, item.value, item.text, True)
				Case "swt"
					Lst.addswitch(item.vmodel, item.text, True, item.value)
				Case "rad"
					Lst.AddRadio(item.vmodel, item.value, item.text, True,False)
				Case "dp"
					Lst.AddDatePicker(item.vmodel, item.text, item.value)
				Case "btn"
					Lst.AddButton(item.value, item.text)
				Case "btnicon"
					Lst.AddIconButton(item.value, item.iconName)			
				Case "textarea"
					Lst.AddTextArea(item.vmodel, item.text, item.value)
				Case "slider"
					Lst.AddSlider(item.vmodel, item.text, item.MinValue, item.maxvalue, item.value, True)
				Case "numberinput"
					Lst.AddNumberInput(item.vmodel, item.text, item.MinValue, item.maxvalue, item.value)
				Case "select"
					Lst.addselect(item.vmodel, item.text, item.sourceName, item.options, item.sourcefield, item.displayfield)
				Case "autocomplete"
					'Lst.addautocomplete(item.vmodel, item.text, item.sourceName, item.optionsList)
					'Lst.addautocomplete1(item.vmodel, item.text, item.sourceName, item.options, item.sourcefield, item.displayfield)
				Case "lbl"
					Lst.AddLabel(item.text)
				End Select
			Next
		Case Else	
			Dim lix As VMListItem = Lst.CreateItem(k)
			lix.SetText(v)
			lix.SetStyle(CreateMap("padding-top": "5px !important", "padding-bottom": "5px !important","margin-bottom":"10px !important"))
			'get controls under this one
			Dim items As List = controls.Get(k)
			Dim childList As VMList
			childList.Initialize(vue,$"${k}children"$,eventHandler).AddClass("propertybag")
			childList.isPropertyBag = True
			childList.SetStyle(CreateMap("width": "100%", "height":"100%"))
			childList.SetStyle(CreateMap("font-size":"14px"))
			childList.SetStyle(CreateMap("margin-bottom":"5px !important"))
			
			', "display": "inline-block"))
			'childList.SetStyle(CreateMap("overflow": "hidden !important", "vertical-align": "top","margin-bottom":"5px !important"))
			
			For Each item As PropControls In items
				Select Case item.typeOf
				Case "number","text","tel","email","password"
					childList.AddInput(item.typeOf, item.vmodel, item.text, item.iconName, item.value)			
				Case "chk"
					childList.AddCheckBox(item.vmodel, item.value, item.text, True)
				Case "swt"
					childList.addswitch(item.vmodel, item.text, True, item.value)
				Case "rad"
					childList.AddRadio(item.vmodel, item.value, item.text, True,False)
				Case "dp"
					childList.AddDatePicker(item.vmodel, item.text, item.value)
				Case "btn"
					childList.AddButton(item.value, item.text)
				Case "btnicon"
					childList.AddIconButton(item.value, item.iconName)
				Case "textarea"
					childList.AddTextArea(item.vmodel, item.text, item.value)
				Case "slider"
					childList.AddSlider(item.vmodel, item.text, item.MinValue, item.maxvalue, item.value, True)
				Case "numberinput"
					childList.AddNumberInput(item.vmodel, item.text, item.MinValue, item.maxvalue, item.value)
				Case "select"
					childList.addselect(item.vmodel, item.text, item.sourceName, item.options, item.sourcefield, item.displayfield)
				Case "autocomplete"
					'childList.AddAutoComplete(item.vmodel, item.text, item.sourceName, item.optionsList)
					'childList.AddAutoComplete1(item.vmodel, item.text, item.sourceName, item.options, item.sourcefield, item.displayfield)
				Case "lbl"
					childList.AddLabel(item.text)
				End Select
			Next
			lix.SetList(childList)
			lix.SetExpand(True)
			lix.Pop(Lst)
		End Select
	Next
	Lst.Pop(Bag)
	Return Bag.tostring
End Sub

Sub GetCode As String
	Dim sb As StringBuilder
	sb.Initialize 
	'
	For Each k As String In controls.Keys
		Dim items As List = controls.Get(k)
		For Each item As PropControls In items
			Select Case item.typeOf
				Case "number","text","email","password", "dp", "textarea"
					sb.Append($"Dim s${item.vmodel} As String = rec.Get("${item.vmodel}")"$).Append(CRLF)
				Case "chk", "swt"
					sb.Append($"Dim b${item.vmodel} As Boolean = rec.Get("${item.vmodel}")"$).Append(CRLF)
				Case "rad"
					sb.Append($"Dim s${item.vmodel} As String = rec.Get("${item.vmodel}")"$).Append(CRLF)
				Case "slider","tel"
					sb.Append($"Dim i${item.vmodel} As Int = rec.Get("${item.vmodel}")"$).Append(CRLF)
				Case "select", "autocomplete"
					sb.Append($"Dim s${item.vmodel} As String = rec.Get("${item.vmodel}")"$).Append(CRLF)
			End Select
		Next
	Next
	Return sb.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub
