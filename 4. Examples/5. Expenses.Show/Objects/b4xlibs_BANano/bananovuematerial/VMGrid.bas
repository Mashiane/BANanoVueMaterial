B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Private BANano As BANano   'ignore
	Public Grid As VMElement
	Public ID As String
	Private vue As BANanoVue
	'this will hold all our rows
	Private Rows As Map
	'this will hold temporal columns
	Private Columns As Map
	'this will hold each row definition
	'hold our last row
	Private LastRow As Int
	'temporal holder
	Private RC As Map
	Private rowClass As String = "row"
	Private cellClass As String = "col"
	'show the RC on the column text
	Public ShowID As Boolean
	Private Components As Map
	Private rowClasses As Map
	'offset class
	Private offClass As Map = CreateMap("s":"offset-sm-","m":"offset-md-","l":"offset-lg-", "xl":"offset-xl-")
	'column defs for bootstrap
	Private colClass As Map = CreateMap("s": "col-sm-","m":"col-md-","l":"col-lg-", "xl":"col-xl-")
	Private rowStyles As Map
	Private attributes As Map
	'
	Type GridRow(Rows As String, Columns As List, Visibility As String, ThemeName As String, ClassName As String, Row As String, _
	MarginTop As Object, MarginBottom As Object, MarginLeft As Object, MarginRight As Object, _
	PaddingTop As Object, PaddingBottom As Object, PaddingLeft As Object, PaddingRight As Object)
	'
	Type GridColumn(Columns As String, OffsetSmall As String, OffsetMedium As String, OffsetLarge As String, _
	OffsetXLarge As String, SizeSmall As String, SizeMedium As String, SizeLarge As String, SizeXLarge As String, _
	ThemeName As String, Visibility As String, ClassName As String, Row As String, Col As String, _
	MarginTop As Object, MarginBottom As Object, MarginLeft As Object, MarginRight As Object, _
	PaddingTop As Object, PaddingBottom As Object, PaddingLeft As Object, PaddingRight As Object)
	Private isBuilt As Boolean
	Private module As Object
End Sub

Public Sub Initialize(v As BANanoVue, sid As String, eventHandler As Object) As VMGrid
	ID = sid.ToLowerCase
	vue = v
	Grid.Initialize(vue, ID).SetTag("div")
	Rows.Initialize
	LastRow = 0
	module = eventHandler
	RC.Initialize
	Columns.Initialize
	ShowID = False
	Components.Initialize
	rowClasses.Initialize
	rowStyles.Initialize
	attributes.Initialize
	isBuilt = False
	Return Me
End Sub

Sub SetScrollBar(b As Boolean) As VMGrid
	Grid.SetScrollBar(b)
	Return Me
End Sub

Sub Clear As VMGrid
	Grid.clear
	Rows.Initialize
	LastRow = 0
	RC.Initialize
	Columns.Initialize
	Components.Initialize
	rowClasses.Initialize
	rowStyles.Initialize
	attributes.Initialize 
	isBuilt = False
	Return Me
End Sub

private Sub CStr(o As Object) As String
	If o = BANano.UNDEFINED Then o = ""
	Return "" & o
End Sub

'add a class to a row/column
Sub SetClass(rowPos As Int, colPos As Int, className As String)
	'class names should be unique for the row
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowClasses.ContainsKey(rowKey) Then
		rowc = rowClasses.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put(className,className)
	rowClasses.Put(rowKey,rowc)
End Sub


'set onclick event
Sub SetOnClick(rowpos As Int, colpos As Int) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowpos)}c${CStr(colpos)}"$
	If colpos = 0 Then
		rowKey = $"${ID}r${CStr(rowpos)}"$
	End If
	Dim methodName As String = $"${rowKey}_click"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	'add to methods
	vue.SetCallBack(methodName, cb)
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("v-on:click",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

'set ontouch start event
Sub SetOnTouchStart(rowpos As Int, colpos As Int) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowpos)}c${CStr(colpos)}"$
	If colpos = 0 Then
		rowKey = $"${ID}r${CStr(rowpos)}"$
	End If
	Dim methodName As String = $"${rowKey}_touchstart"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	'add to methods
	vue.SetCallBack(methodName, cb)
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("v-on:touchstart",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetOnDragOver(rowPos As Int, colPos As Int) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	Dim methodName As String = $"${rowKey}_dragover"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("v-on:dragover",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetOnDragStart(rowPos As Int, colPos As Int) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	Dim methodName As String = $"${rowKey}_dragstart"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("v-on:dragstart",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetOnDragEnd(rowPos As Int, colPos As Int) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	Dim methodName As String = $"${rowKey}_dragend"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("v-on:dragend",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetOnDragEnter(rowPos As Int, colPos As Int) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	Dim methodName As String = $"${rowKey}_dragenter"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("v-on:dragenter",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub


Sub SetOnDrop(rowPos As Int, colPos As Int) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	Dim methodName As String = $"${rowKey}_drop"$
	If SubExists(module, methodName) = False Then Return Me
	Dim e As BANanoEvent
	Dim cb As BANanoObject = BANano.CallBack(module, methodName, e)
	'add to methods
	vue.SetCallBack(methodName, cb)
	
	If attributes.ContainsKey(rowKey) Then
		rowc = attributes.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("v-on:drop",methodName)
	attributes.Put(rowKey,rowc)
	Return Me
End Sub


'Add a specic number of rows, the following method should be AddColumns
Sub AddRow(iRows As Int, sVisibility As String, sThemeName As String, sClassName As String) As VMGrid
	'if there is no existing row, then initialize the map
	'lets store the last row
	LastRow = Rows.size
	'create a new type
	Dim nRow As GridRow
	nRow.Initialize
	InitializeRow(nRow)
	nRow  = CreateRow(iRows,sVisibility,sThemeName,sClassName)
	'lets store this new row in rows
	Dim rowKey As String = $"${ID}r${LastRow}"$
	'lets save the row on the map
	Rows.Put(rowKey,nRow)
	Return Me
End Sub

Sub AddColumnsOSMPV(iColumns As String, iOffsetSmall As String, iOffsetMedium As String,iOffsetLarge As String, iOffsetXLarge As String, _
	iSizeSmall As String,iSizeMedium As String, iSizeLarge As String, IsizeXLarge As String, _
	iVisibility As String, sTheme As String) As VMGrid
	AddColumnOSMP(iColumns, iOffsetSmall, iOffsetMedium, iOffsetLarge, iOffsetXLarge, _
	iSizeSmall,iSizeMedium,iSizeLarge, IsizeXLarge, _
	sTheme,iVisibility,"")
	Return Me
End Sub

Sub AddRows(iRows As Int) As VMGrid
	AddRow(iRows,"","","")
	Return Me
End Sub

Sub AddColumns3x4 As VMGrid
	AddColumns(3,"12","4","4","4")
	Return Me
End Sub

Sub AddColumns4x3 As VMGrid
	AddColumns(4,"12","3","3","3")
	Return Me
End Sub

Sub AddColumns2x6 As VMGrid
	AddColumns(2,"12","6","6","6")
	Return Me
End Sub

Sub AddColumns6x2 As VMGrid
	AddColumns(6,"12","2","2","2")
	Return Me
End Sub

Sub AddColumns12x1 As VMGrid
	AddColumns(12,"12","1","1","1")
	Return Me
End Sub

Sub AddColumns8p4 As VMGrid
	AddColumns(1,"12","8","8","8").AddColumns(1,"12","4","4","4")
	Return Me
End Sub

Sub AddColumns4p8 As VMGrid
	AddColumns(1,"12","4","4","4").AddColumns(1,"12","8","8","8")
	Return Me
End Sub

Sub AddColumns1p11 As VMGrid
	AddColumns(1,"12","1","1","1").AddColumns(1,"12","11","11","11")
	Return Me
End Sub

Sub AddColumns11p1 As VMGrid
	AddColumns(1,"12","11","11","11").AddColumns(1,"12","1","1","1")
	Return Me
End Sub

Sub AddColumns2p10 As VMGrid
	AddColumns(1,"12","2","2","2").AddColumns(1,"12","10","10","10")
	Return Me
End Sub

Sub AddColumns10p2 As VMGrid
	AddColumns(1,"12","10","10","10").AddColumns(1,"12","2","2","2")
	Return Me
End Sub

Sub AddColumns3p9 As VMGrid
	AddColumns(1,"12","3","3","3").AddColumns(1,"12","9","9","9")
	Return Me
End Sub

Sub AddColumns9p3 As VMGrid
	AddColumns(1,"12","9","9","9").AddColumns(1,"12","3","3","3")
	Return Me
End Sub

Sub AddColumns7p5 As VMGrid
	AddColumns(1,"12","7","7","7").AddColumns(1,"12","5","5","5")
	Return Me
End Sub

Sub AddColumns5p7 As VMGrid
	AddColumns(1,"12","5","5","5").AddColumns(1,"12","7","7","7")
	Return Me
End Sub

Sub AddColumns12 As VMGrid
	AddColumns(1,"12","12","12","12")
	Return Me
End Sub

Sub AddColumns(iColumns As Int, SizeSmall As String, SizeMedium As String, SizeLarge As String, SizeXLarge As String) As VMGrid
	AddColumnOSMP(iColumns,"","","","", SizeSmall,SizeMedium,SizeLarge,SizeXLarge,"","","")
	Return Me
End Sub
	
'add colums specifying offsets,sizes,margins,padding, theme
Sub AddColumnOSMP(iColumns As Int, iOffsetSmall As String, iOffsetMedium As String, iOffsetLarge As String, iOffsetXLarge As String, _
	 iSizeSmall As String, iSizeMedium As String, iSizeLarge As String, iSizeXLarge As String, _
	 sThemeName As String, sVisibility As String, sClassName As String) As VMGrid
	'add a column to the last row added
	Dim nCell As GridColumn
	nCell.Initialize
	InitializeColumn(nCell)
	nCell = CreateColumn(iColumns,iOffsetSmall,iOffsetMedium,iOffsetLarge,iOffsetXLarge, iSizeSmall,iSizeMedium,iSizeLarge,iSizeXLarge, sThemeName,sVisibility,sClassName)
	'get the existing columns for this row
	Dim rowkey As String = $"${ID}r${LastRow}"$
	'get the row from existing rows
	If Rows.ContainsKey(rowkey) Then
		'get the row from existing rows
		Dim oldRow As GridRow
		oldRow.Initialize
		InitializeRow(oldRow)
		oldRow = Rows.Get(rowkey)
		'get the existing columns from the row
		Dim cols As List = oldRow.Columns
		cols.add(nCell)
		Rows.Put(rowkey,oldRow)
	Else
		Log("VMGrid - AddColumnOSMP: A row has not been added yet to the grid!")
	End If
	Return Me
End Sub

'returns the grid definition
Sub ToString() As String
	Build
	Return Grid.ToString
End Sub

private Sub InitializeRow(thisRow As GridRow)
	thisRow.Columns.Initialize
	thisRow.Rows = 1
	thisRow.Visibility = ""
	thisRow.ThemeName = "0"
	thisRow.ClassName = ""
	thisRow.MarginTop = Null
	thisRow.MarginBottom = Null
	thisRow.MarginLeft = Null
	thisRow.MarginRight = Null
	thisRow.PaddingTop = Null
	thisRow.PaddingBottom = Null
	thisRow.PaddingLeft = Null
	thisRow.PaddingRight = Null
	thisRow.Row = 0
End Sub

'add a component to the grid as html
Sub AddComponent(rowPos As Int, colPos As Int, elHTML As String)
	Dim cellKey As String = $"${ID}r${rowPos}c${colPos}"$
	Dim lst As List
	If Components.ContainsKey(cellKey) Then
		lst = Components.Get(cellKey)
	Else
		lst.Initialize
		lst.clear
	End If
	lst.Add(elHTML)
	Components.Put(cellKey,lst)
End Sub

'overwrite contents at rc
Sub ReplaceRC(rowPos As Int, colPos As Int, elHTML As String)
	Dim cellKey As String = $"#${ID}r${rowPos}c${colPos}"$
	Dim elBody As BANanoElement
	elBody = BANano.GetElement(cellKey)
	If elBody <> Null Then
		elBody.Empty
		elBody.SetHTML(elHTML)
	End If
End Sub

'add a style to a column
Sub SetStyle(rowPos As Int, colPos As Int, prop As String, value As String) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put(prop,value)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

'set the border of the element
Sub SetGridBorder(width As String, color As String, bstyle As String) As VMGrid
	Grid.SetBorder(width, color, bstyle)
	Return Me
End Sub

'set grid style
Sub SetGridStyle(m As Map) As VMGrid
	Grid.SetStyle(m)
	Return Me
End Sub

Sub AddGridClass(className As String) As VMGrid
	Grid.AddClass(className)
	Return Me	
End Sub

'set the border of the rc
Sub SetBorder(rowPos As Int, colPos As Int, width As String, color As String, bstyle As String) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	rowc.Put("border-style", bstyle)
	rowc.Put("border-width", width)
	rowc.Put("border-color", color)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetMargins(rowPos As Int, colPos As Int, mt As Object, mb As Object, ml As Object, mr As Object) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	If mt <> Null Then rowc.Put("margin-top", mt)
	If mb <> Null Then rowc.Put("margin-bottom", mb)
	If ml <> Null Then rowc.Put("margin-left", ml)
	If mr <> Null Then rowc.Put("margin-right", mr)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub

Sub SetPadding(rowPos As Int, colPos As Int, pt As Object, pb As Object, pl As Object, pr As Object) As VMGrid
	Dim rowc As Map
	Dim rowKey As String = $"${ID}r${CStr(rowPos)}c${CStr(colPos)}"$
	If colPos = 0 Then
		rowKey = $"${ID}r${CStr(rowPos)}"$
	End If
	If rowStyles.ContainsKey(rowKey) Then
		rowc = rowStyles.Get(rowKey)
	Else
		rowc.Initialize
		rowc.clear
	End If
	If pt <> Null Then rowc.Put("padding-top", pt)
	If pb <> Null Then rowc.Put("padding-bottom", pb)
	If pl <> Null Then rowc.Put("padding-left", pl)
	If pr <> Null Then rowc.Put("padding-right", pr)
	rowStyles.Put(rowKey,rowc)
	Return Me
End Sub


Sub SetVIf(vif As Object) As VMGrid
	Grid.SetVIf(vif)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMGrid
	Grid.SetKey(k, bind)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMGrid
	Grid.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMGrid
	Grid.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMGrid
	Grid.SetAttr(attr)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMGrid
	Grid.SetDisabled(b)
	Return Me
End Sub

''set onclick event
'Sub SetOnClick(module As Object, methodName As String) As VMGrid
'	Grid.SetOnClick(module, methodName)
'	Return Me
'End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'build the grid
Sub Build
	If isBuilt = True Then Return
	'hold row counter
	LastRow = 0
	Dim sb As StringBuilder
	sb.Initialize
	'for each defined row, for each defined column
	Dim rowCnt As Int = 0
	Dim rowTot As Int = Rows.Size - 1
	For rowCnt = 0 To rowTot
		Dim rowKey As String = Rows.GetKeyAt(rowCnt)
		Dim currentRow As GridRow
		currentRow.Initialize
		InitializeRow(currentRow)
		currentRow = Rows.Get(rowKey)
		Dim strRow As String = BuildRow(currentRow)
		sb.Append(strRow)
		sb.append(CRLF)
	Next
	Grid.SetText(sb.tostring)
	isBuilt = True
End Sub

Sub InitializeColumn(thisColumn As GridColumn)
	thisColumn.Columns = "1"
	thisColumn.OffsetSmall = "0"
	thisColumn.OffsetMedium = "0"
	thisColumn.OffsetLarge = "0"
	thisColumn.SizeSmall = "12"
	thisColumn.SizeMedium = "12"
	thisColumn.SizeLarge = "12"
	thisColumn.SizeXLarge = "12"
	thisColumn.MarginTop = Null
	thisColumn.MarginBottom = Null
	thisColumn.MarginLeft = Null
	thisColumn.MarginRight = Null
	thisColumn.PaddingTop = Null
	thisColumn.PaddingBottom = Null
	thisColumn.PaddingLeft = Null
	thisColumn.PaddingRight = Null
	thisColumn.ThemeName = ""
	thisColumn.Visibility = ""
	thisColumn.ClassName = ""
	thisColumn.Row = "0"
	thisColumn.Col = "0"
End Sub

'internal
private Sub CreateRow(Rows2Add As Int, Visibility As String, ThemeName As String,ClassName As String) As GridRow
	Dim nr As GridRow
	nr.Initialize
	InitializeRow(nr)
	nr.ThemeName = ThemeName
	nr.Visibility = Visibility
	nr.ClassName = ClassName
	nr.Rows = Rows2Add
	nr.MarginTop = Null
	nr.MarginBottom = Null
	nr.MarginLeft = Null
	nr.MarginRight = Null
	nr.PaddingTop = Null
	nr.PaddingBottom = Null
	nr.PaddingLeft = Null
	nr.PaddingRight = Null
	Return nr
End Sub

'internal
private Sub CreateColumn(Columns2Add As Int, OffsetSmall As String, OffsetMedium As String, OffsetLarge As String, OffsetXLarge As String, _
	SizeSmall As String, SizeMedium As String, SizeLarge As String, SizeXLarge As String, _
	ThemeName As String, Visibility As String, ClassName As String) As GridColumn
	Dim nCell As GridColumn
	nCell.Initialize
	InitializeColumn(nCell)
	nCell.Columns = Columns2Add
	nCell.OffsetSmall = OffsetSmall
	nCell.OffsetMedium = OffsetMedium
	nCell.OffsetLarge = OffsetLarge
	nCell.OffsetXLarge = OffsetXLarge
	nCell.SizeSmall = SizeSmall
	nCell.SizeMedium = SizeMedium
	nCell.SizeLarge = SizeLarge
	nCell.SizeXLarge = SizeXLarge
	nCell.Visibility = Visibility
	nCell.ClassName = ClassName
	nCell.ThemeName = ThemeName
	nCell.MarginTop = Null
	nCell.MarginBottom = Null
	nCell.MarginLeft = Null
	nCell.MarginRight = Null
	nCell.PaddingTop = Null
	nCell.PaddingBottom = Null
	nCell.PaddingLeft = Null
	nCell.PaddingRight = Null
	Return nCell
End Sub


private Sub MapKeys2Delim(m As Map, delim As String) As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim kTot As Int = m.Size - 1
	Dim kCnt As Int
	Dim strKey As String = m.getkeyat(0)
	sb.Append(strKey)
	For kCnt = 1 To kTot
		Dim strKey As String = m.getkeyat(kCnt)
		sb.Append(delim).append(strKey)
	Next
	Return sb.ToString
End Sub

'build a single row
private Sub BuildRow(row As GridRow) As String
	'how many rows do we have to render
	Dim rowTot As Int = row.Rows
	Dim rowCnt As Int
	Dim sb As StringBuilder
	sb.Initialize
	'for each row
	For rowCnt = 1 To rowTot
		LastRow = LastRow + 1
		row.Row = CStr(LastRow)
		Dim rowKey As String = $"${ID}r${LastRow}"$
		Dim tRow As VueHTML
		tRow.Initialize(rowKey,"div")
		Dim strRowClass As String = BuildRowClass
		tRow.AddClass(strRowClass)
		tRow.AddClass(row.ClassName)
		tRow.addClass(row.ThemeName)
		'
		tRow.AddStyle("margin-top", row.margintop)
		tRow.AddStyle("margin-bottom", row.marginbottom)
		tRow.AddStyle("margin-left", row.marginleft)
		tRow.AddStyle("margin-right", row.marginright)
		tRow.AddStyle("padding-top", row.paddingtop)
		tRow.AddStyle("padding-bottom", row.paddingbottom)
		tRow.AddStyle("padding-left", row.paddingleft)
		tRow.AddStyle("padding-right", row.paddingright)
		
		'find if the row has a class
		Dim classKey As String = $"${ID}r${LastRow}"$
		If rowClasses.ContainsKey(classKey) Then
			'get keys and add them
			Dim cm As Map = rowClasses.Get(classKey)
			tRow.AddClass(MapKeys2Delim(cm," "))
		End If
		If rowStyles.ContainsKey(classKey) Then
			Dim cm As Map = rowStyles.Get(classKey)
			For Each strkey As String In cm.Keys
				Dim strVal As String = cm.Get(strkey)
				tRow.AddStyleAttribute(strkey,strVal)
			Next
		End If
		If attributes.ContainsKey(classKey) Then
			Dim am As Map = attributes.Get(classKey)
			For Each k As String In am.Keys
				Dim v As String = am.Get(k)
				tRow.SetAttr(k,v)
			Next
		End If
				
				
		'*****sb.Append($"<div class="${BuildRowClass(row)}" style="${BuildRowStyle(row)}" id="${rowKey}">"$).Append(CRLF)
		'get the columns to add
		Dim cols As List = row.Columns
		'how many columns to add here
		Dim colCnt As Int = 0
		Dim colTot As Int = cols.Size - 1
		'this will store the column count
		Dim LastColumn As Int = 0
		For colCnt = 0 To colTot
			'get this column
			Dim column As GridColumn
			column.Initialize
			InitializeColumn(column)
			column = cols.Get(colCnt)
			Dim colCnt1 As Int = 0
			Dim colTot1 As Int = column.Columns
			For colCnt1 = 1 To colTot1
				'increment the column to add for this row
				LastColumn = LastColumn + 1
				column.Row = CStr(LastRow)
				column.Col = CStr(LastColumn)
				Dim cellKey As String = $"${rowKey}c${LastColumn}"$
				'add to RC map, this is used to check if Matrix Position Exist
				RC.Put(cellKey,cellKey)
				'if showid
				'Dim strShow As String = ""
				'If ShowID = True Then strShow = cellKey
				'define the column structure
				'Dim sbCol As String = $"<div class="${BuildColumnClass(column)}" style="${BuildColumnStyle(column)}" id="${cellKey}">${strShow}</div>"$
				
				Dim tColumn As VueHTML
				tColumn.Initialize(cellKey,"div")
				Dim strColumnClass As String = BuildColumnClass(column)
				tColumn.AddClass(strColumnClass)
				tColumn.AddClass(column.ClassName)
				tColumn.addClass(column.ThemeName)
				'
				tColumn.AddStyle("margin-top", column.margintop)
				tColumn.AddStyle("margin-bottom", column.marginbottom)
				tColumn.AddStyle("margin-left", column.marginleft)
				tColumn.AddStyle("margin-right", column.marginright)
				tColumn.AddStyle("padding-top", column.paddingtop)
				tColumn.AddStyle("padding-bottom", column.paddingbottom)
				tColumn.AddStyle("padding-left", column.paddingleft)
				tColumn.AddStyle("padding-right", column.paddingright)
		
				
				'find if the ceolumn has a class
				Dim classKey As String = $"${ID}r${LastRow}c${LastColumn}"$
				If rowClasses.ContainsKey(classKey) Then
					'get keys and add them
					Dim cm As Map = rowClasses.Get(classKey)
					tColumn.AddClass(MapKeys2Delim(cm," "))
				End If
				If rowStyles.ContainsKey(classKey) Then
					Dim cm As Map = rowStyles.Get(classKey)
					For Each strkey As String In cm.Keys
						Dim strVal As String = cm.Get(strkey)
						tColumn.AddStyleAttribute(strkey,strVal)
					Next
				End If
				If attributes.ContainsKey(classKey) Then
					Dim am As Map = attributes.Get(classKey)
					For Each k As String In am.Keys
						Dim v As String = am.Get(k)
						tColumn.SetAttr(k,v)
					Next
				End If
				If Components.ContainsKey(cellKey) Then
					Dim lst As List = Components.Get(cellKey)
					tColumn.AddContentList(lst)
				End If
				tRow.AddElement(tColumn)
				'*****sb.Append(sbCol).Append(CRLF)
			Next
		Next
		Dim strRow As String = tRow.tostring
		sb.Append(strRow).Append(CRLF)
		'*****sb.Append("</div>").append(CRLF)
	Next
	Return sb.tostring
End Sub

'build the column class for current column
private Sub BuildColumnClass(col As GridColumn) As String
	Dim strSpans As String = BuildSpans(col.SizeSmall,col.SizeMedium,col.SizeLarge,col.SizeXLarge)
	Dim strOffSets As String = BuildOffsets(col.offsetsmall,col.offsetmedium,col.Offsetlarge,col.OffsetXlarge)
	'add the spans
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"${cellClass} "$)
	sb.Append(strSpans)
	sb.Append(strOffSets)
	Return sb.tostring.trim
End Sub

'build the row class for current row
private Sub BuildRowClass() As String
	Dim sb As StringBuilder
	sb.Initialize
	sb.Append($"${rowClass} "$)
	Return sb.tostring.trim
End Sub

'build the spans class
Private Sub BuildSpans(SS As String, SM As String, SL As String, XL As String) As String
	Dim pvalue As String = ""
	Dim sb As StringBuilder
	sb.Initialize
	'add the sizes
	Dim kTot As Int = colClass.Size - 1
	Dim kCnt As Int
	For kCnt = 0 To kTot
		Dim colKey As String = colClass.GetKeyAt(kCnt)
		'get the defined column class prefix
		Dim colC As String = colClass.Get(colKey)
		'for each size append the span size
		Select Case colKey
			Case "s"
				pvalue = CStr(SS)
			Case "m"
				pvalue = CStr(SM)
			Case "l"
				pvalue = CStr(SL)
			Case "xl"
				pvalue = CStr(XL)
		End Select
		If pvalue <> "" Then
			sb.Append(colC)
			sb.Append(pvalue)
			sb.Append(" ")
		End If
	Next
	Return sb.ToString
End Sub

'build the offset class
Private Sub BuildOffsets(OS As String, OM As String, OL As String, OXL As String) As String
	Dim pvalue As String
	Dim sb As StringBuilder
	sb.Initialize
	Dim kTot As Int = offClass.Size - 1
	Dim kCnt As Int = 0
	For kCnt = 0 To kTot
		Dim colKey As String = offClass.GetKeyAt(kCnt)
		'get the defined column class prefix
		Dim colC As String = offClass.Get(colKey)
		'for each size append the span size
		Select Case colKey
			Case "s"
				pvalue = CStr(OS)
			Case "m"
				pvalue = CStr(OM)
			Case "l"
				pvalue = CStr(OL)
			Case "xl"
				pvalue = CStr(OXL)
		End Select
		If pvalue <> "" Then
			sb.Append(colC)
			sb.Append(pvalue)
			sb.Append(" ")
		End If
	Next
	Return sb.ToString
End Sub

'check if the row exists
Sub RowExists(rowPos As Int) As Boolean
	Dim rowcol As String = $"${ID}r${rowPos}"$
	Return Rows.ContainsKey(rowcol)
End Sub

'check if the column exist
Sub ColumnExists(rowPos As Int, colPos As Int) As Boolean
	Dim rowcol As String = $"${ID}r${rowPos}c${colPos}"$
	Return RC.ContainsKey(rowcol)
End Sub

'how many rows do we have
Sub HowManyRows() As Int
	Return LastRow
End Sub