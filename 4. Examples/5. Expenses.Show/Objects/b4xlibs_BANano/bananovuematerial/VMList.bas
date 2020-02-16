B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public List As VMElement
	Public ID As String
	Public vue As BANanoVue
	Public HasContent As Boolean
	Private eventHandler As Object
	Public isPropertyBag As Boolean
	Private expandS As String
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, module As Object) As VMList
	ID = sid.ToLowerCase
	vue = v
	List.Initialize(vue, ID).SetTag("md-list")
	HasContent = False
	eventHandler = module
	isPropertyBag = False
	expandS = $"${ID}expandsingle"$
	vue.SetStateFalse(expandS)
	SetExpandSingle(False)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMList
	List.SetDisabled(b)
	Return Me
End Sub

'expand a single item from the list
Sub ExpandItem(sid As String, b As Boolean) As VMList
	Dim syncid As String = $"${sid}sync"$
	vue.SetStateSingle(syncid, b)
	Return Me
End Sub

Sub SetTabIndex(ti As String) As VMList
	List.SetTabIndex(ti)
	Return Me
End Sub	

Sub SetVShow(vif As Object) As VMList
	List.SetVShow(vif)
	Return Me
End Sub

Sub AddLabel(txt As String)
	Dim li As VMListItem
	li.Initialize(vue, "",eventHandler).AddLabel(txt)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "32px !important", _
		"padding-top": "10px !important", "padding-bottom": "10px !important", _
		"margin-top": "5px !important", "margin-bottom": "5px !important"))
	End If
	
	HasContent = True
	li.Pop(Me)
End Sub

Sub AddIconButton(btnID As String, btnIcon As String)
	Dim li As VMListItem
	li.Initialize(vue, $"${btnID}li"$, eventHandler).AddIconButton(btnID, btnIcon)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "48px !important", "padding-top": "10px !important"))
	End If
	HasContent = True
	li.Pop(Me)
End Sub

Sub AddInput(typeOf As String, vModel As String, vText As String, vIcon As String, vValue As String)
	Dim li As VMListItem
	li.Initialize(vue, $"${vModel}li"$, eventHandler).AddInput(typeOf, vModel, vText, vIcon, vValue)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "48px !important", _
		"padding-top": "10px !important", "padding-bottom": "10px !important", _
		"margin-top": "5px !important", "margin-bottom": "10px !important"))
	End If
	HasContent = True
	li.Pop(Me)
End Sub

Sub AddButton(btnID As String, btnText As String)
	Dim li As VMListItem
	li.Initialize(vue, $"${btnID}li"$, eventHandler).AddButton(btnID, btnText)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "48px !important", "padding-top":"10px !important"))
	End If	
	HasContent = True
	li.Pop(Me)
End Sub


Sub AddCheckBox(vmodel As String, vValue As Boolean, vText As String, bPrimary As Boolean)
	Dim li As VMListItem
	li.Initialize(vue, $"${vmodel}li"$, eventHandler).AddCheckBox(vmodel, vValue, vText, bPrimary)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "32px !important", _
		"padding-top": "10px !important", "padding-bottom": "10px !important", _
		"margin-top": "5px !important", "margin-bottom": "5px !important"))
	End If
	HasContent = True
	li.Pop(Me)
End Sub

Sub AddDatePicker(vmodel As String, vText As String, vValue As String)
	Dim li As VMListItem
	li.Initialize(vue, $"${vmodel}li"$, eventHandler).AddDatePicker(vmodel, vText, vValue)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "48px !important", _
		"padding-top": "10px !important", "padding-bottom": "10px !important", _
		"margin-top": "5px !important", "margin-bottom": "5px !important"))
	End If
	HasContent = True
	li.Pop(Me)
End Sub

Sub AddSelect(vmodel As String, vText As String, sourceName As String, options As Map, sourcefield As String, displayfield As String)
	Dim li As VMListItem
	li.Initialize(vue, $"${vmodel}li"$, eventHandler).AddSelect(vmodel, vText, sourceName, options, sourcefield, displayfield)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "48px !important", _
		"padding-top": "10px !important", "padding-bottom": "10px !important", _
		"margin-top": "5px !important", "margin-bottom": "5px !important"))
	End If
	HasContent = True
	li.Pop(Me)
End Sub

'Sub AddAutoComplete1(vmodel As String, vText As String, sourceName As String, options As Map, sourcefield As String, displayfield As String)
'	Dim li As VMListItem
'	li.Initialize(vue, "").AddAutoComplete1(vmodel, vText, sourceName, options, sourcefield, displayfield)
'	HasContent = True
'	li.Pop(Me)
'End Sub

'Sub AddAutoComplete(vmodel As String, vText As String, sourceName As String, options As List)
'	Dim li As VMListItem
'	li.Initialize(vue, "").AddAutoComplete(vmodel, vText, sourceName, options)
'	HasContent = True
'	li.Pop(Me)
'End Sub


Sub AddSlider(vmodel As String, Label As String, minValue As Int, maxValue As Int, value As Int, labelOnTop As Boolean)
	Dim li As VMListItem
	li.Initialize(vue, $"${vmodel}li"$, eventHandler).AddSlider(vmodel, Label, minValue, maxValue, value, labelOnTop)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "48px !important", _
		"padding-top": "10px !important", "padding-bottom": "10px !important", _
		"margin-top": "5px !important", "margin-bottom": "5px !important"))
	End If
	
	HasContent = True
	li.Pop(Me)
End Sub


Sub AddNumberInput(vmodel As String, Label As String, minValue As Int, maxValue As Int, value As Int)
	Dim li As VMListItem
	li.Initialize(vue, $"${vmodel}li"$, eventHandler).AddNumberInput(vmodel, Label, minValue, maxValue, value)
	li.AddClass("numberinput")
	If isPropertyBag Then
		li.SetStyle(CreateMap("padding-top": "10px !important", "padding-bottom": "10px !important", _
		"margin-top": "5px !important", "margin-bottom": "5px !important"))
	End If
	HasContent = True
	li.Pop(Me)
End Sub

Sub AddTextArea(vmodel As String, vText As String, vValue As String)
	Dim li As VMListItem
	li.Initialize(vue, $"${vmodel}li"$, eventHandler).AddTextArea(vmodel, vText, vValue)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height":"130px !important","padding-top": "10px !important"))
	End If
	HasContent = True
	li.Pop(Me)
End Sub

Sub AddSwitch(vmodel As String, vText As String, bPrimary As Boolean, bValue As Boolean)
	Dim li As VMListItem
	li.Initialize(vue, $"${vmodel}li"$, eventHandler).SetSwitch(vmodel, vText, bPrimary, bValue)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "48px !important", _
		"padding-top": "10px !important", "padding-bottom": "10px !important", _
		"margin-top": "5px !important", "margin-bottom": "5px !important"))
	End If	
	HasContent = True
	li.Pop(Me)
End Sub


Sub AddRadio(vmodel As String, vValue As String, vText As String, bPrimary As Boolean, bDesignMode As Boolean)
	Dim li As VMListItem
	li.Initialize(vue, $"${vmodel}li"$, eventHandler).SetRadio(vmodel, vValue, vText, bPrimary, bDesignMode)
	If isPropertyBag Then
		li.SetStyle(CreateMap("height": "32px !important", _
		"padding-top": "10px !important", "padding-bottom": "10px !important", _
		"margin-top": "5px !important", "margin-bottom": "5px !important"))
	End If
	
	HasContent = True
	li.Pop(Me) 
End Sub

Sub SetDense(b As Boolean) As VMList
	If b Then AddClass("md-dense")
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMList
	List.SetVIf(vif)
	Return Me
End Sub

Sub CreateItem(itemID As String) As VMListItem
	Dim el As VMListItem
	el.Initialize(vue, itemID, eventHandler)
	If itemID = "" Then
		Log("VMList.CreateItem - please specify an item id!")
		Return el
	End If
	itemID = itemID.tolowercase
	If vue.HasState(itemID) = False Then
		vue.SetStateSingle(itemID, itemID)
	End If
	el.SetID(itemID,True)
	el.SetKey(itemID,True)
	el.SetActionIcon("chevron_right")
	HasContent = True
	Return el 
End Sub

Sub CreateDivider(b As Boolean) As VMDivider
	Dim el As VMDivider
	el.Initialize(vue, "")
	HasContent = True
	Return el
End Sub

Sub SetStyle(m As Map) As VMList
	List.SetStyle(m)
	Return Me
End Sub

Sub SetBorder(b As Boolean) As VMList
	If b Then SetStyle(CreateMap("border": "1px solid rgba(#000, .12)"))
	Return Me
End Sub

Sub SetElevation(e As Int) As VMList
	List.SetElevation(e)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMList
	List.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMList
	List.SetAttr(attr)
	Return Me
End Sub

Sub SetText(t As String) As VMList
	List.SetText(t)
	HasContent = True
	Return Me
End Sub

Sub SetSlotExpand(b As Boolean) As VMList
	If b Then List.SetAttr(CreateMap("slot":"md-expand"))
	Return Me
End Sub

Sub SetDoubleLine(b As Boolean) As VMList
	If b Then List.SetDoubleLine(True)
	Return Me
End Sub

Sub SetExpandSingle(b As Boolean) As VMList
	expandS = $"${ID}expandsingle"$
	vue.SetStateSingle(expandS, b)
	List.SetAttr(CreateMap(":md-expand-single": expandS))
	Return Me
End Sub

Sub SetTripleLine(b As Boolean) As VMList
	If b Then AddClass("md-triple-line")
	Return Me
End Sub

Sub AddSubHeader(t As Object) As VMList
	Dim el As VMElement
	el.Initialize(vue, "").SetTagSubHeader(True).SetText(t).Pop(List)
	HasContent = True
	Return Me  
End Sub

Sub AddDivider(bInset As Boolean) As VMList
	Dim el As VMDivider
	el.Initialize(vue, "").SetInset(bInset)
	el.Pop(List)
	HasContent = True
	Return Me 
End Sub

Sub ToString As String
	Return List.tostring
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
