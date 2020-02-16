B4J=true
Group=Default Group
ModulesStructureVersion=1
Type=Class
Version=8.1
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Container As VMElement
	Public ID As String
	Private vue As BANanoVue
	Private BANano As BANano   'ignore
	Public Grid As VMGrid
	Private module As Object
	'
	Public Fields As List
	Public Controls As List
	Public Strings As List
	Public Integers As List
	Public Booleans As List
	Public Doubles As List
	Public Dates As List
	Public Defaults As Map
	Public Required As Map
	Public Mode As String
	Private TotalRows As Int
	Private sortitM As Map
	Private sortItL As List
	Private rows As Map
	Private cells As Map
	Type EachRow(visibility As String)
	Public visibility As Map
	Private rowStyles As Map
	Public DesignMode As Boolean
	Public HasInfoBox As Boolean
	Public Exclusions As List
End Sub

public Sub RemoveAttr(sName As String) As VMContainer
	Container.RemoveAttr(sName)
	Return Me
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMContainer
	ID = sid.ToLowerCase
	vue = v
	module = eventHandler
	Container.Initialize(vue, ID).SetTag("div")
	Container.RemoveAttr(":required")
	Grid.Initialize(vue, $"${ID}grid"$,module)
	Grid.Grid.RemoveAttr(":required")
	'
	TotalRows = 0
	rowStyles.Initialize
	sortitM.Initialize
	sortItL.Initialize
	rows.initialize
	Fields.Initialize
	Controls.Initialize
	Strings.Initialize
	Integers.Initialize
	Booleans.Initialize
	Defaults.Initialize
	Required.Initialize
	Doubles.Initialize
	Dates.initialize
	cells.Initialize
	visibility.Initialize
	Exclusions.Initialize 
	Mode = "A"
	sortitM.Initialize
	sortItL.Initialize
	DesignMode = False
	HasInfoBox = False
	Return Me
End Sub

Sub AddExclusion(them As List)
	For Each k As String In them
		Exclusions.Add(k)
	Next
End Sub


Sub SetClass(rowPos As Int, colPos As Int, className As String) As VMContainer
	Grid.SetClass(rowPos, colPos, className)
	Return Me
End Sub

Sub SetBorderRC(rowPos As Int, colPos As Int, width As String, color As String, bstyle As String) As VMGrid
	Grid.SetBorder(rowPos, colPos, width, color, bstyle)
	Return Grid
End Sub

Sub SetMarginsRC(rowPos As Int, colPos As Int, mt As Object, mb As Object, ml As Object, mr As Object) As VMGrid
	Grid.SetMargins(rowPos, colPos, mt, mb, ml, mr)
	Return Grid
End Sub

Sub SetPaddingRC(rowPos As Int, colPos As Int, pt As Object, pb As Object, pl As Object, pr As Object) As VMGrid
	Grid.SetPadding(rowPos,colPos, pt,pb,pl,pr)
	Return Grid
End Sub

Sub SetNotSelectible As VMContainer
	Container.SetNotSelectible
	Return Me
End Sub

Sub SetRef(varRef As String) As VMContainer
	Container.SetRef(varRef)
	Return Me
End Sub

Sub SetID(n As String, bind As Boolean) As VMContainer
	Container.SetID(n, bind)
	Return Me
End Sub

Sub SetKey(k As Object, bind As Boolean) As VMContainer
	Container.SetKey(k, bind)
	Return Me
End Sub

Sub SetVIf(vif As String) As VMContainer
	Container.SetVIf(vif)
	Return Me
End Sub

Sub AddHR As VMContainer
	Container.addhr
	Return Me
End Sub

Sub AddBR As VMContainer
	Container.addbr
	Return Me
End Sub

Sub AddClass(c As String) As VMContainer
	Container.AddClass(c)
	Return Me
End Sub

Sub SetColor(c As Object) As VMContainer
	Container.SetColor(c)
	Return Me
End Sub

Sub SetStyle(m As Map) As VMContainer
	Container.SetStyle(m)
	Return Me
End Sub

Sub SetBackgroundColor(p As Object) As VMContainer
	Container.SetBackgroundColor(p)
	Return Me
End Sub

Sub SetMarginAll(p As Object) As VMContainer
	Container.setmarginall(p)
	Return Me
End Sub

Sub SetPaddingAll(p As Object) As VMContainer
	Container.SetPaddingAll(p)
	Return Me
End Sub

Sub SetMaxWidth(mw As String) As VMContainer
	Container.SetMaxWidth(mw)
	Return Me
End Sub

Sub SetMaxHeight(mw As String) As VMContainer
	Container.SetMaxHeight(mw)
	Return Me
End Sub

Sub Enable
	SetDisabled(True)
End Sub

Sub Disable
	SetDisabled(False)
End Sub

Sub Hide
	vue.SetStateSingle($"${ID}show"$, False)
End Sub

Sub Show
	vue.SetStateSingle($"${ID}show"$, True)
End Sub

Sub SetDisabled(b As Boolean) As VMContainer
	vue.SetStateSingle($"${ID}disabled"$,b)
	Return Me
End Sub

Sub SetScrollBar(b As Boolean) As VMContainer
	Container.SetScrollBar(b)
	Return Me
End Sub

Sub SetBackgroundImage(url As String) As VMContainer
	Container.SetBackgroundImage(url)
	Return Me
End Sub

Sub SetText(t As String) As VMContainer
	Container.SetText(t)
	Return Me
End Sub

Sub SetOnClick(methodName As String) As VMContainer
	Container.SetOnClick(module, methodName)
	Return Me
End Sub

Sub SetOnClickRC(rowpos As Int, colpos As Int) As VMContainer
	Grid.setonclick(rowpos,colpos)
	Return Me
End Sub

Sub AddRow(iRows As Int, sVisibility As String, sThemeName As String, sClassName As String) As VMGrid
	Grid.AddRow(iRows, sVisibility, sThemeName,sClassName)
	Return Grid
End Sub

Sub AddColumnsOSMPV(iColumns As String, iOffsetSmall As String, iOffsetMedium As String,iOffsetLarge As String, iOffsetXLarge As String, _
	iSizeSmall As String,iSizeMedium As String, iSizeLarge As String, IsizeXLarge As String, _
	iVisibility As String, sTheme As String) As VMGrid
	Grid.AddColumnsOSMPV(iColumns, iOffsetSmall, iOffsetMedium,iOffsetLarge, iOffsetXLarge,	iSizeSmall,iSizeMedium, iSizeLarge, IsizeXLarge,iVisibility, sTheme)
	Return Grid
End Sub

Sub AddColumnOSMP(iColumns As Int, iOffsetSmall As String, iOffsetMedium As String, iOffsetLarge As String, iOffsetXLarge As String, _
	 iSizeSmall As String, iSizeMedium As String, iSizeLarge As String, iSizeXLarge As String, _
	 sThemeName As String, sVisibility As String, sClassName As String) As VMGrid
	Grid.AddColumnOSMP(iColumns, iOffsetSmall, iOffsetMedium, iOffsetLarge, iOffsetXLarge, iSizeSmall, iSizeMedium, iSizeLarge, iSizeXLarge, sThemeName, sVisibility, sClassName)
	Return Grid
End Sub

Sub AddComponent(rowPos As Int, colPos As Int, elHTML As String)
	Grid.AddComponent(rowPos, colPos, elHTML)
End Sub

Sub SetStyleRC(rowPos As Int, colPos As Int, prop As String, value As String) As VMGrid
	Grid.setstyle(rowPos, colPos, prop, value)
	Return Grid
End Sub

Sub AddRows(iRows As Int) As VMGrid
	Grid.AddRows(iRows)
	Return Grid
End Sub

Sub AddColumns3x4 As VMGrid
	Grid.AddColumns3x4
	Return Grid
End Sub

Sub AddColumns4x3 As VMGrid
	Grid.AddColumns4x3
	Return Grid
End Sub

Sub AddColumns2x6 As VMGrid
	Grid.AddColumns2x6
	Return Grid
End Sub

Sub AddColumns6x2 As VMGrid
	AddColumns6x2
	Return Grid
End Sub

Sub AddColumns12x1 As VMGrid
	AddColumns12x1
	Return Grid
End Sub

Sub AddColumns8p4 As VMGrid
	Grid.AddColumns8p4
	Return Grid
End Sub

Sub AddColumns4p8 As VMGrid
	Grid.AddColumns4p8
	Return Grid
End Sub

Sub AddColumns1p11 As VMGrid
	Grid.AddColumns1p11
	Return Grid
End Sub

Sub AddColumns11p1 As VMGrid
	Grid.AddColumns11p1
	Return Grid
End Sub

Sub AddColumns2p10 As VMGrid
	Grid.AddColumns2p10
	Return Grid
End Sub

Sub AddColumns10p2 As VMGrid
	Grid.AddColumns10p2
	Return Grid
End Sub

Sub AddColumns3p9 As VMGrid
	Grid.AddColumns3p9
	Return Grid
End Sub

Sub AddColumns9p3 As VMGrid
	Grid.AddColumns9p3
	Return Grid
End Sub

Sub AddColumns7p5 As VMGrid
	Grid.AddColumns7p5
	Return Grid
End Sub

Sub AddColumns5p7 As VMGrid
	Grid.AddColumns5p7
	Return Grid
End Sub

Sub AddColumns12 As VMGrid
	Grid.AddColumns12
	Return Grid
End Sub

Sub AddColumns(iColumns As Int, SizeSmall As String, SizeMedium As String, SizeLarge As String, SizeXLarge As String) As VMGrid
	Grid.AddColumns(iColumns,SizeSmall, SizeMedium, SizeLarge, SizeXLarge)
	Return Grid
End Sub

Sub SetOnDrop(methodName As String) As VMContainer
	Container.setondrop(module, methodName)
	Return Me	
End Sub

Sub SetOnMouseOut(methodName As String) As VMContainer
	Container.SetOnMouseOut(module, methodName)
	Return Me
End Sub

Sub SetOnMouseOver(methodName As String) As VMContainer
	Container.SetOnMouseOver(module, methodName)
	Return Me
End Sub

Sub SetPadding(pt As Object, pb As Object, pl As Object, pr As Object) As VMContainer
	Container.SetPadding(pt,pb,pl, pr)
	Return Me
End Sub

Sub SetMargins(mt As Object, mb As Object, ml As Object, mr As Object) As VMContainer
	Container.SetMargins(mt, mb, ml, mr)
	Return Me
End Sub

Sub SetElevation(e As Int) As VMContainer
	Container.SetElevation(e)
	Return Me
End Sub

'set the border of the element
Sub SetBorder(width As String, color As String, bstyle As String) As VMContainer
	Container.SetBorder(width, color, bstyle)
	Return Me
End Sub

'set cursor move
Sub SetCursorMove As VMContainer
	Container.SetCursorMove
	Return Me
End Sub

Sub SetCursorPointer As VMContainer
	Container.SetCursorPointer
	Return Me
End Sub

Sub SetTextAlignCenter As VMContainer
	Container.SetTextAlignCenter
	Return Me
End Sub

Sub SetDraggable(b As Boolean) As VMContainer
	Container.SetDraggable(b)
	Return Me
End Sub

Sub SetDroppable(b As Boolean) As VMContainer
	Container.SetDroppable(b)
	Return Me
End Sub


Sub SetWidth(w As String) As VMContainer
	Container.SetWidth(w)
	Return Me
End Sub

Sub SetHeight(h As String) As VMContainer
	Container.SetHeight(h)
	Return Me
End Sub

Sub SetVShow(vshow As String) As VMContainer
	Container.SetVShow(vshow)
	Return Me
End Sub


'set an attribute
Sub SetAttr(attr As Map) As VMContainer
	Container.SetAttr(attr)
	Return Me
End Sub

Sub ToString As String
	BuildControls
	Grid.Pop(Container)
	Return Container.tostring
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMContainer)
	p.SetText(ToString)
End Sub

Sub AddToContainer(pCont As VMContainer, rowPos As Int, colPos As Int)
	pCont.AddComponent(rowPos, colPos, ToString)
End Sub

'prepare for saving
private Sub Prepare
	For Each k As String In Dates
		Dim sk As String = vue.GetState(k,"")
		sk = vue.Date2YYYYMMDD(sk)
		vue.SetStateSingle(k, sk)
	Next
End Sub

'get field data
Sub GetData As Map
	Prepare
	Dim m As Map = CreateMap()
	m = vue.GetStates(Fields)
	m = LinkRecordTypes(m)
	Return m
End Sub

'validate the records
Sub Validate(rec As Map) As Boolean
	Dim iv As Int = 0
	For Each k As String In Required.Keys
		If rec.ContainsKey(k) Then
			Dim v As String = rec.GetDefault(k,"")
			v = vue.CStr(v)
			v = v.trim
			If v = "" Then
				Log("Validate: " & k)
				iv = iv + 1
				ShowError(k)
			Else
				HideError(k)
			End If
		End If
	Next
	If iv = 0 Then
		Return True
	Else
		Return False
	End If
End Sub

Sub ShowError(elID As String)
	vue.SetStateSingle($"${elID}error"$, True)
End Sub

Sub HideError(elID As String)
	vue.SetStateSingle($"${elID}error"$, False)
End Sub

private Sub CreateList(sid As String,eventHandler As Object) As VMList
	Dim el As VMList
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

private Sub CreateListItem(sid As String, eventHandler As Object) As VMListItem
	Dim el As VMListItem
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

private Sub CreateButton(sid As String, eventHandler As Object) As VMButton
	Dim el As VMButton
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

private Sub CreateDatePicker(sid As String, eventHandler As Object) As VMDatePicker
	Dim el As VMDatePicker
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

Sub CreateControl(sname As String) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname) 
	Return el
End Sub

Sub NewIconButton(sname As String) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetButton
	el.SetIconButton(True)
	Return el
End Sub


Sub NewSwitch(sname As String, slabel As String, svalue As Object,bPrimary As Boolean, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetSwitch
	el.label = slabel
	el.Value = svalue
	el.IsPrimary = bPrimary
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub

Sub NewRadioGroup(sname As String, slabel As String, svalue As Object, options As Map, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetRadioGroup
	el.label = slabel
	el.Value = svalue
	el.options = options
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub
'
Sub NewCheckBoxGroup(sname As String) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetCheckBoxGroup
	Return el
End Sub

Sub NewCheckBox(sname As String, slabel As String, svalue As Object, bPrimary As Boolean, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetCheckBox
	el.Value = svalue
	el.label = slabel
	el.IsPrimary = bPrimary
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub

Sub NewDatePicker(sname As String, slabel As String, bRequired As Boolean, bImmediately As Boolean, bOpenOnFocus As Boolean, splaceholder As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetDatePicker
	el.label = slabel
	el.Required = bRequired
	el.clearable = True
	el.PlaceHolder = splaceholder
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	el.immediately = bImmediately
	el.openonfocus = bOpenOnFocus			
	Return el
End Sub

Sub NewTimePicker(sname As String, slabel As String, bRequired As Boolean, splaceholder As String, shelpertext As String, _
	serrortext As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetTimePicker
	el.label = slabel
	el.clearable = True
	el.Required = bRequired
	el.PlaceHolder = splaceholder
	el.helperText = shelpertext
	el.errorText = serrortext
	el.defaultValue = "12:00"
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub

Sub NewChip(sname As String, sText As String, bClickable As Boolean, bDeletable As Boolean, sourceTable As String, sourceField As String, displayField As String) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetChip
	el.Text = sText
	el.Clickable = bClickable
	el.Deletable = bDeletable
	If sourceTable <> Null Then el.sourceTable = sourceTable
	If sourceField <> Null Then el.sourceField =sourceField
	If displayField <> Null Then el.displayField = displayField
	el.UseOptions = False
	el.UseDataSource = True
	Return el
End Sub

Sub NewChips(sname As String, slabel As String, splaceholder As String, bStatic As Boolean, bRequired As Boolean, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetChips
	el.PlaceHolder = splaceholder
	el.Required = bRequired
	el.label = slabel
	el.Static = bStatic
	el.CheckDuplicates = True
	el.helperText = sHelperText
	el.errorText = sErrorText
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub

Sub NewInfoBox(sname As String, sBoxType As String, sText As String, sIcon As String, sIconColor As String, sIconBackgroundColor As String, iCount As Int, iStart As Int, iFinish As Int, iInterval As Int, bSetCounter As Boolean, iSpeed As Int, iRefreshInterval As Int, bHoverExpand As Boolean, bHoverZoom As Boolean) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.typeof = "infobox"
	el.fieldType = "string"
	el.bSetCounter = bSetCounter
	el.Start = iStart
	el.Finish = iFinish
	el.Speed = iSpeed
	el.RefreshInterval = iRefreshInterval
	el.Count = iCount
	el.IconName = sIcon
	el.IconColor = sIconColor
	el.IconBackgroundColor = sIconBackgroundColor
	el.Text = sText
	el.HoverExpandEffect = bHoverExpand
	el.HoverZoomEffect = bHoverZoom
	el.BoxType = sBoxType
	Return el
End Sub

'
Sub NewSlider(sname As String, slabel As String, iMinValue As Int, iMaxValue As String,iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetSlider
	el.minvalue = iMinValue
	el.maxvalue = iMaxValue
	el.label = slabel
	el.ThumbLabel = True
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub


Sub NewEmail(sname As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, shelpertext As String, serrorText As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.clearable = True
	el.SetEmail
	el.errorText = serrorText
	el.label = slabel
	el.required = bRequired
	el.iconname = sIcon
	el.PlaceHolder = splaceholder
	el.helperText = shelpertext
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub

Sub NewText(sname As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, serrorText As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.typeOf = "text"
	el.clearable = True
	el.errorText = serrorText
	el.label = slabel
	el.required = bRequired
	el.iconname = sIcon
	If iMaxLen > 0 Then el.MaxLength = iMaxLen
	el.PlaceHolder = splaceholder
	el.helperText = shelpertext
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub


Sub NewTextArea(sname As String, slabel As String, splaceholder As String, bRequired As Boolean, bAutoGrow As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, serrorText As String,iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.clearable = True
	el.SetTextArea
	el.errorText = serrorText
	el.label = slabel
	el.required = bRequired
	el.iconname = sIcon
	If iMaxLen > 0 Then el.MaxLength = iMaxLen
	el.PlaceHolder = splaceholder
	el.helperText = shelpertext
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	el.AutoGrow = bAutoGrow
	Return el
End Sub


Sub NewTel(sname As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, shelpertext As String, serrorText As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.typeOf = "text"
	el.errorText = serrorText
	el.label = slabel
	el.required = bRequired
	el.iconname = sIcon
	el.PlaceHolder = splaceholder
	el.helperText = shelpertext
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub

Sub NewNumber(sname As String, slabel As String, splaceholder As String, bRequired As Boolean, sIcon As String, shelpertext As String, serrorText As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.typeOf = "number"
	el.fieldType = "int"
	el.errorText = serrorText
	el.label = slabel
	el.required = bRequired
	el.iconname = sIcon
	el.PlaceHolder = splaceholder
	el.helperText = shelpertext
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub


Sub NewPassword(sname As String, slabel As String, splaceholder As String, bRequired As Boolean, bToggle As Boolean, sIcon As String, iMaxLen As Int, shelpertext As String, serrorText As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetPassword
	el.errorText = serrorText
	el.label = slabel
	el.required = bRequired
	el.iconname = sIcon
	el.MaxLength = iMaxLen
	el.PlaceHolder = splaceholder
	el.helperText = shelpertext
	el.TogglePassword = bToggle
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	Return el
End Sub

Sub NewFile(sname As String, slabel As String, splaceholder As String, bRequired As Boolean, shelperText As String, sErrorText As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetEmail
	el.typeOf = "file"
	el.errorText = sErrorText
	el.helperText = shelperText
	el.Required = bRequired
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	el.PlaceHolder = splaceholder
	el.label = slabel
	Return el
End Sub

Sub NewImage(sname As String, sdefaultValue As String, salt As String, swidth As String, sheight As String) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.typeOf = "image"
	el.Width = swidth
	el.Height = sheight
	el.defaultValue = sdefaultValue
	el.Alt = salt
	Return el
End Sub

Sub NewH1(sname As String, sText As String) As VMInputControl
	Return NewLabel(sname, "h1", sText)
End Sub

Sub NewH2(sname As String, sText As String) As VMInputControl
	Return NewLabel(sname, "h2", sText)
End Sub

Sub NewH3(sname As String, sText As String) As VMInputControl
	Return NewLabel(sname, "h3", sText)
End Sub

Sub NewH4(sname As String, sText As String) As VMInputControl
	Return NewLabel(sname, "h4", sText)
End Sub

Sub NewH5(sname As String, sText As String) As VMInputControl
	Return NewLabel(sname, "h5", sText)
End Sub

Sub NewH6(sname As String, sText As String) As VMInputControl
	Return NewLabel(sname, "h6", sText)
End Sub

Sub NewP(sname As String, sText As String) As VMInputControl
	Return NewLabel(sname, "p", sText)
End Sub

Sub NewLabel(sname As String, sSize As String, sText As String) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.typeOf = "label"
	el.Tag = sSize
	el.Text = sText
	Return el
End Sub

Sub NewIcon(sname As String, sIcon As String, sSize As String) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.typeOf = "icon"
	el.iconsize = sSize
	el.IconName = sIcon
	Return el
End Sub

Sub NewButton(sname As String, sLabel As String, sIcon As String, bRaised As Boolean, bPrimary As Boolean, bAccent As Boolean, bFitWidth As Boolean) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetButton
	el.SetLabel(sLabel)
	el.SetButtonTypeRegular
	el.SetRaised(bRaised)
	If bPrimary Then el.SetPrimary(bPrimary)
	If bAccent Then el.SetAccent(bAccent)
	If bFitWidth Then el.SetFitWidth(True)
	Return el
End Sub

Sub NewList(sname As String) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetList
	Return el
End Sub

Sub NewSelect(sname As String, sLabel As String, bRequired As Boolean, bMultiple As Boolean, sPlaceHolder As String, sourceTable As String, sourceField As String, displayField As String, sHelperText As String, sErrorText As String, iTabIndex As Int) As VMInputControl
	sname = sname.tolowercase
	Dim el As VMInputControl
	el.Initialize(sname)
	el.SetSelect
	el.label = sLabel
	el.required = bRequired
	If iTabIndex > 0 Then el.TabIndex = iTabIndex
	el.placeholder = sPlaceHolder
	el.helperText = sHelperText
	el.errorText = sErrorText
	el.Dense = True
	el.useoptions = False
	el.sourceTable = sourceTable
	el.SourceField = sourceField
	el.displayField = displayField
	el.multiple = bMultiple
	Return el
End Sub

Sub SetEmpty
	vue.SetStateListValues(Fields)
End Sub

Sub SetDefaults
	vue.SetState(Defaults)
	vue.SetState(visibility)
	For Each k As String In Required.Keys
		HideError(k)
	Next
End Sub

Sub AddRequired(r As String) As VMContainer
	Required.put(r,r)
	Return Me
End Sub

Sub RemoveRequired(r As String) As VMContainer
	Required.Remove(r)
	Return Me
End Sub

Sub LinkRecordTypes(rec As Map) As Map
	Dim nrec As Map = CreateMap()
	For Each k As String In rec.keys
		Dim v As Object = rec.Get(k)
		k = k.ToLowerCase
		nrec.Put(k, v)
	Next
	If Doubles.Size > 0 Then vue.MakeDouble(nrec, Doubles)
	If Integers.Size > 0 Then vue.MakeInteger(nrec, Integers)
	If Strings.Size > 0 Then vue.MakeTrim(nrec, Strings)
	If Dates.Size > 0 Then vue.MakeDate(nrec, Dates)
	If Booleans.Size > 0 Then vue.MakeBoolean(nrec, Booleans)
	Return nrec
End Sub

Sub AddControl(ctl As VMInputControl, r As String, c As String, os As String, om As String, ol As String, oxl As String, s As String, m As String, l As String, xl As String)
	ctl.Row = r
	ctl.Cell = c
	ctl.SizeSmall = s
	ctl.SizeMedium = m
	ctl.SizeLarge = l
	ctl.SizeXLarge = xl
	ctl.OffsetSmall = os
	ctl.OffsetMedium = om
	ctl.OffsetLarge = ol
	ctl.OffsetXLarge = oxl
	Controls.add(ctl)
	'to determine the number of rows to add
	If r > TotalRows Then
		TotalRows = r
	End If
	'define a key
	Dim sRow As String = vue.PadRight(r,2,"0")
	Dim sCell As String = vue.PadRight(c,2,"0")
	Dim rcKey As String = $"${sRow}.${sCell}"$
	'to sort the rc locations by row and cel
	sortitM.Put(rcKey,ctl)
	If rows.ContainsKey(sRow) = False Then
		Dim row As EachRow
		row.Initialize 
		rows.Put(sRow, row)
	End If
End Sub

'add control sizes only
Sub AddControlS(ctl As VMInputControl, r As String, c As String, s As String, m As String, l As String, xl As String)
	AddControl(ctl, r, c, 0,0,0,0,s,m,l,xl)
End Sub

Sub AddIntegers(i As List) As VMContainer
	For Each s As String In i
		Integers.Add(s)
	Next
	Return Me
End Sub

Sub AddStrings(i As List) As VMContainer
	For Each s As String In i
		Strings.Add(s)
	Next
	Return Me
End Sub

Sub AddBooleans(i As List) As VMContainer
	For Each s As String In i
		Booleans.Add(s)
	Next
	Return Me
End Sub

Sub AddDates(i As List) As VMContainer
	For Each s As String In i
		Dates.Add(s)
	Next
	Return Me
End Sub

Sub AddDoubles(d As List) As VMContainer
	For Each s As String In d
		Doubles.Add(s)
	Next
	Return Me
End Sub

private Sub BuildControls
	Dim showKey As String
	Dim disKey As String
	Dim enaKey As String
	Dim errKey As String
	Dim isarray As Boolean
	
	For Each cnt As VMInputControl In Controls
		If cnt.Exclude = True Then Exclusions.Add(cnt.name)
		'check exclusions
		Dim idxpos As Int = Exclusions.IndexOf(cnt.name)
		If idxpos = -1 Then
		Select Case cnt.typeOf
			Case "button", "list"
				cnt.fieldType = ""
				cnt.Required = False
			Case Else
				Fields.Add(cnt.name)
				Defaults.Put(cnt.name, cnt.defaultValue)
		End Select
		If cnt.required Then
			Required.put(cnt.name,cnt.name)
		End If
		Select Case cnt.fieldType
			Case "int"
				Integers.Add(cnt.name)
			Case "bool"
				Booleans.Add(cnt.name)
			Case "string"
				Strings.Add(cnt.name)
			Case "date"
				Dates.Add(cnt.name)
			Case "dbl"
				Doubles.Add(cnt.name)
		End Select
		End If
	Next
	'
	BuildGrid(Grid)
		
	'Dim rowCount As Int = 0
	'Dim cellCount As Int = 0
	'
	For Each nc As VMInputControl In Controls
		showKey = $"${nc.name}show"$
		disKey = $"${nc.name}disabled"$
		enaKey = $"${nc.name}required"$
		errKey = $"${nc.name}error"$
		isarray = False
		'rowCount = rowCount + 1
		'cellCount = cellCount + 1
		'
		'Dim rkey As String = $"r${rowCount}"$
		'Dim ckey As String = $"${rkey}c${cellCount}"$
		'
		'Dim r As VMRow = vm.CreateRow(rkey).SetGutter(True)
		'Dim rc As VMCol = vm.CreateCol(ckey).SetGutter(True)
		'rc.SetSizes(12,12,12,12,12)
		visibility.Put(showKey, nc.Isvisible)
		'
		Select Case nc.typeOf
			Case "list"
				Dim lst As VMList = CreateList(nc.name, module)
				If DesignMode = False Then 
					lst.SetVShow(showKey)
				End If
				lst.AddSubHeader(nc.label)
				Dim li As VMListItem = CreateListItem($"${nc.name}li"$, module)
				li.SetVFor("row", nc.source)
				If DesignMode = False Then
					li.SetID(nc.key,True)
					li.SetKey(nc.key,True)
				End If
				li.SetText(nc.text)
				Select Case nc.Lines
				Case 2
					lst.SetDoubleLine(True)
					li.SetDescription(nc.Description)
				Case 3
					lst.SetTripleLine(True)
					li.SetDescription(nc.Description)
				End Select	
				'If nc.MenuClick Then
				'	li.SetOnClickMenu(nc.module, nc.methodName)
				'End If
				If nc.ActionIcon <> "" Then
					li.SetActionIcon(nc.ActionIcon)
				End If
				If nc.MenuIcon <> "" Then
					li.SetMenuIcon(nc.MenuIcon)
				End If
				If nc.IconName <> "" Then
					li.SetIcon(nc.iconname,nc.IsPrimary)
				End If
				If nc.AddEdit Then
					li.AddEditMenuItem(nc.Key, nc.editcaption)
					li.AddDeleteMenuItem(nc.Key, nc.deletecaption)
				End If
				li.Pop(lst)
				'lst.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				
				Grid.AddComponent(nc.row, nc.Cell, lst.ToString)
				
			Case "button"
				Select Case nc.ButtonType
				Case "regular"
					nc.Fab = False
					nc.iconbutton = False
				Case "icon"
					nc.IconButton = True
					nc.Fab = False
				Case "fab"
					nc.Fab = True
					nc.IconButton = False
				End Select
				Dim btn As VMButton = CreateButton(nc.name, module)
				btn.SetText(nc.label)
				btn.SetRaised(nc.raised)
				btn.SetPrimary(nc.isprimary)
				btn.SetAccent(nc.isaccent)
				btn.SetRipple(nc.Ripple)
				btn.SetMenuTrigger(nc.MenuTrigger)
				btn.SetDense(nc.Dense)
				btn.SetIconButton(nc.IconButton)
				btn.SetPlain(nc.Plain)
				btn.SetMini(nc.Mini)
				btn.SetFab(nc.Fab)
				btn.SetListAction(nc.ListAction)
				btn.SetIcon(nc.IconName)
				btn.SetTo(nc.NavigateTo, False)
				btn.SetFabPosition(nc.FabPosition)
				btn.SetFabFixed(nc.FabFixed)
				If nc.FitWidth Then
					btn.SetStyle(CreateMap("width":"100%","margin-left":"0px","margin-right":"0px"))
				End If
				If DesignMode = False Then 
					btn.SetVShow(showKey)
					btn.SetDisabled(nc.IsDisabled)
				End If
				btn.SetTabIndex(nc.TabIndex)
				'btn.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, btn.ToString)
			Case "timepicker"
				Dim tp As VMTimePicker = CreateTimePicker(nc.name, module)
				tp.SetLabel(nc.label)				
				If DesignMode = False Then
					tp.SetVModel(nc.name)
					tp.SetVShow(showKey)
					tp.SetDisabled(nc.IsDisabled)
					tp.SetRequired(nc.required)
				End If
				tp.SetName(nc.name,False)
				tp.SetTabIndex(nc.TabIndex)
				tp.SetPlaceholder(nc.placeholder)
				tp.SetHelperText(nc.helperText)
				tp.SetErrorText(nc.errorText)
				Grid.AddComponent(nc.row, nc.Cell, tp.ToString)
			Case "chip"
				Dim chp As VMChip = CreateChip(nc.name,module)
				chp.SetText(nc.Text)
				chp.SetClickable(nc.Clickable)
				chp.SetDeletable(nc.Deletable)
				If DesignMode = False Then
					chp.SetVShow(showKey)
					chp.setVmodel(nc.name)
					chp.SetDisabled(disKey)
				End If
				If nc.UseOptions = True Then
					If DesignMode = False Then
						chp.SetOptions(nc.sourceTable, nc.options, nc.sourceField, nc.displayField)
					End If
				End If
				If nc.UseDataSource = True Then
					If DesignMode = False Then
						chp.SetDataSource(nc.sourceTable, nc.sourceField, nc.displayField)
					End If
				End If				
				Grid.AddComponent(nc.row, nc.Cell, chp.ToString)
			Case "chips"
				isarray = True
				Dim chps As VMChips = CreateChips(nc.name, module)
				chps.SetInputType(nc.InputType)
				chps.SetPlaceholder(nc.PlaceHolder)
				chps.SetStatic(nc.Static)
				chps.SetCheckDuplicated(nc.CheckDuplicates)
				chps.SetHelperText(nc.helperText)
				chps.SetErrorText(nc.errorText)
				chps.SetLabel(nc.label)
				chps.SetRequired(nc.Required)
				If DesignMode = False Then
					chps.setVmodel(nc.name)
					chps.SetDisabled(disKey)
					chps.SetVShow(showKey)
				End If
				vue.SetStateSingle(nc.name, Array())
				Grid.AddComponent(nc.row, nc.Cell, chps.ToString)
			Case "label"
				Dim lbl As VMLabel = CreateLABEL(nc.name)
				lbl.SetTag(nc.Tag)
				lbl.SetText(nc.Text)
				If DesignMode = False Then 
					lbl.SetVShow(showKey)
				End If
				Grid.AddComponent(nc.row, nc.Cell, lbl.ToString)
			Case "image"
				Dim img As VMImage = CreateImage(nc.name, module)
				img.SetAlt(nc.Alt)
				img.SetWidth(nc.Width)
				img.SetHeight(nc.Height)
				If DesignMode = False Then
					img.SetVModel(nc.name)
					img.SetVShow(showKey)
					img.SetValue(nc.defaultValue, True)
				Else
					img.SetValue(nc.defaultValue, False)
				End If
				Grid.AddComponent(nc.row, nc.Cell, img.ToString)
			Case "file"
				Dim fil As VMFile = CreateFile(nc.name, module)
				fil.SetErrorText(nc.errorText)
				fil.SetLabel(nc.label)
				If DesignMode = False Then 
					fil.SetVModel(nc.name)
					fil.SetVShow(showKey)
					fil.SetDisabled(nc.IsDisabled)
					fil.SetRequired(nc.required)
				End If
				fil.SetName(nc.name,False)
				fil.SetTabIndex(nc.TabIndex)
				fil.SetHelperText(nc.helperText)
				fil.SetPlaceholder(nc.placeholder)
				'input.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, fil.ToString)
				
			Case "number","text","tel","email","password"
				Dim input As VMInput = CreateInput(nc.name, module)
				input.SetErrorText(nc.errorText)
				input.SetType(nc.typeOf)
				input.SetLabel(nc.label)
				input.SetReadOnly(nc.readonly)
				If DesignMode = False Then 
					input.SetVModel(nc.name)
					input.SetVShow(showKey)
					input.SetDisabled(nc.IsDisabled)
					input.SetRequired(nc.required)
				End If
				input.SetName(nc.name,False)
				input.SetAutoComplete(nc.name)
				input.SetIcon(nc.IconName)
				input.SetTabIndex(nc.TabIndex)
				input.SetMaxlength(nc.MaxLength)
				input.SetHelperText(nc.helperText)
				input.SetPlaceholder(nc.placeholder)
				If nc.typeOf <> "password" Then
					input.SetClearable(nc.clearable)
					input.SetTogglePassword(nc.TogglePassword)
				End If
				'input.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, input.ToString)

			Case "textarea"
				Dim txtarea As VMTextArea = CreateTextArea(nc.name, module)
				txtarea.SetClearable(nc.clearable)
				txtarea.SetErrorText(nc.errorText)
				txtarea.SetLabel(nc.label)				
				txtarea.SetReadOnly(nc.readonly)
				If DesignMode = False Then
					txtarea.SetVModel(nc.name)
					txtarea.SetVShow(showKey)
					txtarea.SetDisabled(nc.IsDisabled)
					txtarea.SetRequired(nc.required)
				End If
				txtarea.SetName(nc.name,False)
				txtarea.SetTabIndex(nc.TabIndex)
				txtarea.SetMaxlength(nc.MaxLength)
				txtarea.SetPlaceholder(nc.placeholder)
				txtarea.SetHelperText(nc.helperText)
				txtarea.SetAutogrow(nc.AutoGrow)
				txtarea.SetIcon(nc.IconName)
				'txtarea.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, txtarea.ToString)
			Case "infobox"
				Dim ibox As VMInfoBox = CreateInfoBox(nc.name, module)
				If nc.bSetCounter Then
					ibox.SetFrom(nc.Start)
					ibox.SetTo(nc.Finish)
					ibox.SetSpeed(nc.Speed)
					ibox.SetRefreshInterval(nc.RefreshInterval)
				End If
				ibox.SetNumber(nc.Count)
				ibox.SetIcon(nc.IconName)
				ibox.SetIconColor(nc.IconColor)
				ibox.SetIconBackgroundColor(nc.IconBackgroundColor)
				ibox.SetText(nc.Text)
				If DesignMode = False Then
					ibox.SetVShow(showKey)
				End If
				ibox.SetHoverExpandEffect(nc.HoverExpandEffect)
				ibox.SetHoverZoomEffect(nc.HoverZoomEffect)
				Select Case nc.BoxType
				Case "2"
					ibox.SetStyle2(True) 
				Case "3"
					ibox.SetStyle3(True)
				Case "4"
					ibox.SetStyle4(True)
				End Select
				Grid.AddComponent(nc.row, nc.Cell, ibox.ToString)
			Case "slider"
				Dim slid As VMSlider = CreateSlider(nc.name, module)
				slid.SetMin(nc.minvalue)
				slid.SetMax(nc.maxvalue)
				slid.SetLabel(nc.label)
				slid.SetThumbLabel(nc.ThumbLabel)
				If DesignMode = False Then
					slid.SetVModel(nc.name)
					slid.SetVShow(showKey)
					slid.SetDisabled(nc.IsDisabled)
				End If
				slid.SetName(nc.name,False)
				slid.SetTabIndex(nc.TabIndex)
				'slid.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, slid.ToString)
			Case "numberinput"
				Dim ni As VMNumberInput = CreateNumberInput(nc.name)
				ni.SetMin(nc.minvalue)
				ni.SetMax(nc.maxvalue)
				ni.SetLabel(nc.label)
				ni.SetReadOnly(nc.readonly)
				If DesignMode = False Then
					ni.SetVModel(nc.name)
					ni.SetVShow(showKey)
					ni.SetDisabled(nc.IsDisabled)
				End If
				ni.SetName(nc.name,False)
				ni.SetTabIndex(nc.TabIndex)
				'slid.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, ni.ToString)
			Case "select", "selectbox"
				isarray = False
				Dim sel As VMSelect = CreateSelect(nc.name, module)
				sel.SetLabel(nc.label)				
				If DesignMode = False Then
					sel.SetVModel(nc.name)
					sel.SetVShow(showKey)
					sel.SetDisabled(nc.IsDisabled)
					sel.SetRequired(nc.required)
				End If
				sel.SetTabIndex(nc.TabIndex)
				sel.SetPlaceholder(nc.placeholder)
				sel.SetHelperText(nc.helperText)
				sel.SetErrorText(nc.errorText)
				sel.SetDense(nc.Dense)
				If nc.UseOptions = True Then
					If DesignMode = False Then
						sel.SetOptions(nc.sourceTable, nc.options, nc.sourceField, nc.displayField)
					Else
						For Each ok As String In nc.options.keys
							Dim ov As String = nc.options.Get(ok)
							sel.additem(ok, ov)
						Next
					End If	
				Else
					If DesignMode = False Then	
						sel.SetDataSource(nc.sourceTable, nc.sourceField, nc.displayField)
					End If
				End If
				sel.SetMultiple(nc.multiple)
				sel.SetDense(True)
				If nc.multiple Then isarray = True
				'sel.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, sel.ToString)
'			Case "autocomplete"
'				Dim selx As VMAutoComplete = vm.CreateAutoComplete("")
'				selx.SetLabel(nc.label)
'				selx.SetRequired(nc.required)
'				selx.SetVModel(nc.name)
'				If nc.UseOptions = True Then
'					selx.SetOptionsMap(nc.sourceTable, nc.options, nc.sourceField, nc.displayField)
'				Else
'					selx.SetDataSource(nc.sourceTable, nc.sourceField, nc.displayField)
'				End If
'				selx.SetVShow(showKey)
'				'If nc.onSelect Then
'				'	Dim valuesel As String
'				'	selx.SetOnSelected(nc.module, nc.methodName, valuesel)
'				'End If
'				selx.SetDense(True)
'				'sel.Pop(rc.col)
'				'rc.Pop(r.Row)
'				'r.Pop(frm.Form)
'				grd.AddComponent(nc.row, nc.Cell, selx.ToString)
			Case "datepicker", "date"
				Dim datex As VMDatePicker = CreateDatePicker(nc.name, module)
				If DesignMode = False Then
					datex.SetVModel(nc.name)
					datex.SetVShow(showKey)
					datex.SetDisabled(nc.IsDisabled)
					datex.SetRequired(nc.required)
				End If
				datex.SetLabel(nc.label)
				datex.SetImmediately(nc.immediately)
				datex.SetOpenOnFocus(nc.openonfocus)
				datex.SetClearable(nc.clearable)
				datex.SetTabIndex(nc.TabIndex)
				'datex.SetHelperText(nc.helperText)
				'datex.SetErrorText(nc.errorText)
				'datex.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, datex.ToString)

			Case "checkbox"
				Dim chk As VMCheckBox = CreateCheckBox(nc.name, module)
				If DesignMode = False Then
					chk.SetVModel(nc.name)
					chk.SetVShow(showKey)
					chk.SetDisabled(nc.IsDisabled)
				End If
				chk.SetValue(nc.value)
				chk.SetText(nc.label)
				chk.SetPrimary(True)
				chk.SetName(nc.name,False)
				chk.SetTabIndex(nc.TabIndex)
				'chk.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, chk.ToString)

			Case "switch","switchbox"
				Dim sw As VMSwitch = CreateSwitch(nc.name, module)
				sw.SetText(nc.label)
				sw.SetValue(nc.value)
				If DesignMode = False Then
					sw.SetVShow(showKey)
					sw.SetVModel(nc.name)
					sw.SetDisabled(nc.IsDisabled)
				End If
				sw.SetName(nc.name,False)
				sw.SetPrimary(True)
				sw.SetTabIndex(nc.TabIndex)
				'sw.Pop(rc.col)
				'rc.Pop(r.Row)
				'r.Pop(frm.Form)
				Grid.AddComponent(nc.row, nc.Cell, sw.ToString)
			Case "icon"
				Dim icn As VMIcon = CreateIcon(nc.name)
				icn.SetText(nc.IconName)
				If DesignMode = False Then
					icn.SetVShow(showKey)
				End If
				icn.SetName(nc.name,False)
				Select Case nc.IconSize
				Case "normal"
				Case "2"
					icn.SetSize2x(True)
				Case "3"
					icn.SetSize3x(True)
				Case "4"
					icn.SetSize4x(True)
				Case "5"	
					icn.SetSize5x(True)	
				End Select
				Grid.AddComponent(nc.row, nc.Cell, icn.ToString)
'			Case "radio"
'				Dim rlst As VMList = vm.CreateList(nc.name)
'				rlst.AddSubHeader(nc.label)
'				If DesignMode = False Then
'					rlst.SetVShow(showKey)
'				End If
'				Dim opts As Map = nc.options
'				For Each k As String In opts.Keys
'					Dim v As String = opts.Get(k)
'					rlst.AddRadio(nc.module, nc.methodName, nc.name, k, v, True, DesignMode)
'				Next
'				rlst.SetTabIndex(nc.TabIndex)
'				
'				'lst.Pop(rc.col)
'				'rc.Pop(r.Row)
'				'r.Pop(frm.Form)
'				grd.AddComponent(nc.row, nc.Cell, rlst.ToString)
			Case "radiogroup", "radio"
				Dim rg As VMRadioGroup = CreateRadioGroup(nc.name, nc.label, module)
				rg.SetDesignMode(DesignMode)
				If DesignMode = False Then
					rg.SetVShow(showKey)
					rg.SetVModel(nc.name)
					rg.SetValue(nc.value)
				End If
				rg.AddItems(nc.options)
				rg.SetTabIndex(nc.TabIndex)
				Grid.AddComponent(nc.row, nc.Cell, rg.ToString)
			Case "checkboxgroup"
				isarray = True
				Dim cg As VMCheckBoxGroup = CreateCheckBoxGroup(nc.name, nc.label,module)
				cg.SetDesignMode(DesignMode)
				If DesignMode = False Then
					cg.SetVShow(showKey)
					cg.SetVModel(nc.name)
					cg.SetValue(nc.value)
				End If								
				cg.AddItems(nc.options)
				cg.SetTabIndex(nc.TabIndex)
				Grid.AddComponent(nc.row, nc.Cell, cg.ToString)
		End Select
		'set the needed things
		If DesignMode = False Then
			vue.SetStateSingle(showKey, nc.Isvisible)
			vue.SetStateSingle(disKey, nc.IsDisabled)
			vue.SetStateSingle(enaKey, nc.Required)
			If isarray Then
				vue.SetStateSingle(nc.name, Array())
			Else
				vue.SetStateSingle(nc.name, nc.defaultValue)
			End If
			vue.SetStateSingle(errKey, False)
		End If
	Next
End Sub


private Sub CreateImage(img As String, eventHandler As Object) As VMImage
	Dim el As VMImage
	el.Initialize(vue, img, eventHandler)
	Return el
End Sub

private Sub CreateLABEL(lblID As String) As VMLabel
	Dim el As VMLabel
	el.Initialize(vue, lblID)
	Return el
End Sub

private Sub CreateChips(sid As String, eventHandler As Object) As VMChips
	Dim el As VMChips
	el.Initialize(vue, sid,eventHandler)
	Return el
End Sub

private Sub CreateChip(sid As String, eventHandler As Object) As VMChip
	Dim el As VMChip
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

private Sub CreateTimePicker(sid As String, eventHandler As Object) As VMTimePicker
	Dim el As VMTimePicker
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

' build the grid for a container
private Sub BuildGrid(parentGrid As VMGrid)
	'get the keys and sort them
	sortItL.Initialize 
	For Each k As String In sortitM.Keys
		sortItL.Add(k)
	Next
	' sort the rcs
	sortItL.Sort(True)
	'find out if we have a missing rc
	Dim missingRC As List
	missingRC.Initialize
	For compCnt = 1 To TotalRows
		Dim sRow As String = compCnt
		sRow = vue.PadRight(sRow,2,"0")
		Dim sCell As String = vue.PadRight("1",2,"0")
		Dim rcKey As String = $"${sRow}.${sCell}"$
		If sortItL.IndexOf(rcKey) = -1 Then
			missingRC.Add(rcKey)
		End If
	Next
	If missingRC.Size -1 >= 0 Then
		For Each rc As String In missingRC
			Log("VMContainer: "& rc & ": RC is NOT defined")
		Next
		'nothing will be drawn if there is a missing element
		Return
	End If
	'add the grid definition
	'link related columns to the rows use the sorted list
	'if we have records falling in the same row, sequence them
	Dim finalRows As Map
	finalRows.Initialize
	For Each rc As String In sortItL
		Dim sRow As String = vue.MvField(rc,1,".")
		If finalRows.ContainsKey(sRow) Then
			Dim finalCells As List = finalRows.Get(sRow)
		Else
			Dim finalCells As List
			finalCells.Initialize
		End If
		finalCells.Add(rc)
		finalRows.Put(sRow,finalCells)
	Next
	'sort the row numbers
	'grid creates rows in sequence
	sortItL.Initialize 
	For Each strRow As String In finalRows.Keys
		sortItL.Add(strRow)
	Next
	sortItL.Sort(True)
	Dim colCnt As Int
	For Each finalRow As String In sortItL
		Dim er As EachRow = rows.Get(finalRow)
		'
		'build the grid
		Dim finalCell(11) As String
		Dim ec(11) As VMInputControl
		
		'add the row
		Dim finalCells As List = finalRows.Get(finalRow)
		'how many controls do we have per row, add appropriate cells
		Dim finalCellsSize As Int = finalCells.Size - 1
		For colCnt = 0 To finalCellsSize
			finalCell(colCnt) = finalCells.Get(colCnt)
			ec(colCnt) = sortitM.Get(finalCell(colCnt))
		Next
		'add the row
		parentGrid.AddRow(1, er.Visibility, "", "")
		Dim cellSize As Int
		For cellSize = 0 To finalCellsSize
			'add columns to the row
			parentGrid.AddColumnOSMP(1, ec(cellSize).OffsetSmall, ec(cellSize).OffsetMedium, ec(cellSize).OffsetLarge, ec(cellSize).OffsetXLarge, _
			ec(cellSize).SizeSmall, ec(cellSize).SizeMedium, ec(cellSize).SizeLarge, ec(cellSize).SizeXLarge, _
			"", ec(cellSize).Visibility, "")
		Next
	Next
End Sub


private Sub CreateInfoBox(sid As String, eventHandler As Object) As VMInfoBox
	HasInfoBox = True
	Dim el As VMInfoBox
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

private Sub CreateTextArea(sid As String, eventHandler As Object) As VMTextArea
	Dim el As VMTextArea
	el.Initialize(vue, sid,eventHandler)
	Return el
End Sub


private Sub CreateFile(sid As String, eventHandler As Object) As VMFile
	Dim el As VMFile
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub


private Sub CreateInput(sid As String, eventHandler As Object) As VMInput
	Dim el As VMInput
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub


private Sub CreateSlider(sid As String, eventHandler As Object) As VMSlider
	Dim el As VMSlider
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub


private Sub CreateNumber(sid As String, eventHandler As Object) As VMInput
	Dim el As VMInput = CreateInput(sid,eventHandler).SetTypeNumber(True)
	Return el
End Sub


private Sub CreateNumberInput(sid As String) As VMNumberInput
	Dim el As VMNumberInput
	el.Initialize(vue, sid)
	Return el
End Sub


private Sub CreateSelect(sid As String, eventHandler As Object) As VMSelect
	Dim el As VMSelect
	el.Initialize(vue,sid,eventHandler)
	Return el
End Sub


private Sub CreateSwitch(sid As String, eventHandler As Object) As VMSwitch
	Dim el As VMSwitch
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub

private Sub CreateCheckBox(sid As String, eventHandler As Object) As VMCheckBox
	Dim el As VMCheckBox
	el.Initialize(vue, sid, eventHandler)
	Return el
End Sub


private Sub CreateIcon(sid As String) As VMIcon
	Dim el As VMIcon
	el.Initialize(vue, sid)
	Return el
End Sub


private Sub CreateRadioGroup(sid As String, sCaption As String, eventHandler As Object) As VMRadioGroup
	Dim el As VMRadioGroup
	el.Initialize(vue, sid, sCaption, eventHandler)
	Return el
End Sub

private Sub CreateCheckBoxGroup(sid As String, sCaption As String, eventHandler As Object) As VMCheckBoxGroup
	Dim el As VMCheckBoxGroup
	el.Initialize(vue, sid, sCaption, eventHandler)
	Return el
End Sub