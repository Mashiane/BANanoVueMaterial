B4J=true
Group=Default Group\Library
ModulesStructureVersion=1
Type=Class
Version=7.8
@EndOfDesignText@
#IgnoreWarnings:12
Sub Class_Globals
	Public Table As VMElement
	Public ID As String
	Private vue As BANanoVue
	Public InlineEditing As Boolean = False
	Public InlineEditingMode As String = "click"
	Public InlineEditingManagementColumn As Boolean = True
	Public Width As String = 0
	Private grid As BANanoObject
	Public PrimaryKey As String = "id"
	Public PagerLimit As Int = 10
	Private Columns As List
	'column type
	Public COLUMN_DATE As String = "date"
	Public COLUMN_TEXT As String = "text"
	Public COLUMN_ICON As String = "icon"
	Public COLUMN_CHECKBOX As String = "checkbox"
	Public COLUMN_DROPDOWN As String = "dropdown"
	Public COLUMN_NONE As String = ""
	Public COLUMN_TIME As String = "time"
	Public COLUMN_DATETIME As String = "datetime"
	Public COLUMN_IMAGE As String = "image"
	Public COLUMN_MONEY As String = "money"
	Public COLUMN_FILESIZE As String = "filesize"
	Public COLUMN_ICONRENDER As String = "iconrender"
	
	'alignment
	Public ALIGN_CENTER As String = "center"
	Public ALIGN_RIGHT As String = "right"
	Public ALIGN_LEFT As String = "left"
	Public autoGenerateColumns As Boolean = False
	Public autoLoad As Boolean = True
	Public BodyRowHeight As String = "fixed"
	Private columnsM As Map
	Public SelectionType As String = "single"
	Public ColumnReorder As Boolean = True
	Public DetailTemplate As String = ""
	Public KeepExpandedRows As Boolean = False
	Public FixedHeader As Boolean = False
	Public HeaderFilter As Boolean = True
	Public HeaderFilterType As String = "onchange"
	Public ResizableColumns As Boolean = True
	Public ShowHiddenColumnsAsDetails As Boolean = False
	Private ExpandIcon As String = ""
	Private CollapseIcon As String = ""
	Public RowReorder As Boolean = False
	Public SelectionMethod As String = "basic"
	Public IconsLibrary As String = "materialicons"
	Public MinWidth As Int = 0
	Public UILibrary As String = "materialdesign"
	Public ToolbarTemplate As String = ""
	Private GroupBy As String = ""
	Private DataSource As List
	Public DataField As String = "records"
	Public ShowPager As Boolean = True
	Public TransparentBackground As Boolean = True
	Private params As Map
	Private Banano As BANano  'ignore
	Private mCallBack As Object
	Private eventName As String
	Public Options As Map
	Public responsive As Boolean = True
	Private formats As Map
	Public N As BANanoObject
	Public ToolBar As VMGrid
	Private JQ As BANanoObject
End Sub

#if css
	.italic { font-style: italic }
#End If

Public Sub Initialize(v As BANanoVue, sid As String, sPrimaryKey As String, module As Object) As VMGijgoTable
	Banano.DependsOnAsset("jquery-3.4.1.min.js")
	Banano.DependsOnAsset("gijgo.min.css")
	Banano.DependsOnAsset("gijgo.min.js")
	Banano.DependsOnAsset("fileSaver.min.js")
	Banano.DependsOnAsset("jszip.min.js")
	ID = sid.ToLowerCase
	vue = v
	JQ = vue.jquery
	Table.Initialize(vue, ID).SetTag("table")
	mCallBack = module
	eventName = ID
	PrimaryKey = sPrimaryKey
	columnsM.Initialize
	Options.Initialize
	params.Initialize
	formats.Initialize
	N.Initialize("numeral")
	'create toolbar
	ToolBar.Initialize(vue, $"${ID}tblBar"$,module)
	ToolBar.AddRows(1)
	ToolBar.AddColumns(2,6,6,6,6)
	ToolBar.SetClass(1,2,"text-right")
	Return Me
End Sub

Sub AddDownload
	AddIcon("download","Get","attach_file","80")
	SetColumnClickEvent("download", True)
End Sub

Sub Reset
	columnsM.Initialize
	Options.Initialize
	params.Initialize
	formats.Initialize
End Sub

Sub ToString As String
	ToolbarTemplate = ToolBar.tostring
	Return Table.tostring
End Sub

'set style
Sub SetStyle(sm As Map) As VMGijgoTable
	Table.SetStyle(sm)
	Return Me
End Sub

Sub SetVIf(vif As Object) As VMGijgoTable
	Table.SetVIf(vif)
	Return Me
End Sub

Sub SetKey(k As String, bind As Boolean) As VMGijgoTable
	Table.SetKey(k, bind)
	Return Me
End Sub

Sub SetVShow(vif As Object) As VMGijgoTable
	Table.SetVShow(vif)
	Return Me
End Sub

'add a class
Sub AddClass(c As String) As VMGijgoTable
	Table.AddClass(c)
	Return Me
End Sub

'set an attribute
Sub SetAttr(attr As Map) As VMGijgoTable
	Table.SetAttr(attr)
	Return Me
End Sub

Sub SetDisabled(b As Boolean) As VMGijgoTable
	Table.SetDisabled(b)
	Return Me
End Sub

Sub Render
	vue.SetTemplate(ToString)
End Sub

Sub Pop(p As VMElement)
	p.SetText(ToString)
End Sub

'add a parameter for search
Sub AddParamater(paramName As String, paramValue As String)
	params.Put(paramName,paramValue)
End Sub

'cancel operation for primary key
Sub Cancel(pk As String)
	grid.RunMethod("cancel", Array(pk))
End Sub

'set data source
Sub SetDataSource(rows As List) As VMGijgoTable
	DataSource = rows
	Return Me
End Sub

'get record from event
Sub GetRecordFromEvent(e As BANanoEvent) As Map
	Dim record As Map = e.OtherField("data").Result
	Dim res As Map = record.Get("record")
	Return res
End Sub

'set columns to group by
Sub SetColumnGroupBy(colField As String) As VMGijgoTable
	colField = colField.Replace(" ","")
	colField = colField.tolowercase
	If columnsM.ContainsKey(colField) Then
		GroupBy = colField
	End If
	Return Me
End Sub

'set columns editors
Sub SetColumnEditors(colField As List) As VMGijgoTable
	For Each strCol As String In colField
		strCol = strCol.Replace(" ","")
		strCol = strCol.tolowercase
		If columnsM.ContainsKey(strCol) Then
			Dim col As Map = columnsM.Get(strCol)
			col.Put("editor", True)
			'if checkbox, editOnly
			Dim colType As String = col.Get("type")
			Select Case colType
				Case "checkbox"
					col.Put("mode", "editOnly")
			End Select
			columnsM.Put(strCol,col)
		End If
	Next
	Return Me
End Sub

'set columns editor mode to readonly
Sub SetColumnModeReadOnly(colField As List) As VMGijgoTable
	For Each strCol As String In colField
		strCol = strCol.Replace(" ","")
		strCol = strCol.tolowercase
		If columnsM.ContainsKey(strCol) Then
			Dim col As Map = columnsM.Get(strCol)
			col.Put("mode", "readOnly")
			columnsM.Put(strCol,col)
		End If
	Next
	Return Me
End Sub

'set columns editor mode to editor only
Sub SetColumnModeEditOnly(colField As List) As VMGijgoTable
	For Each strCol As String In colField
		strCol = strCol.Replace(" ","")
		strCol = strCol.tolowercase
		If columnsM.ContainsKey(strCol) Then
			Dim col As Map = columnsM.Get(strCol)
			col.Put("mode", "editOnly")
			columnsM.Put(strCol,col)
		End If
	Next
	Return Me
End Sub

'set columns data source for dropdown
Sub SetColumnDataSource(colField As String, colDataSource As Object, colValueField As String, colEditField As String) As VMGijgoTable
	colField = colField.Replace(" ","")
	colField = colField.tolowercase
	If columnsM.ContainsKey(colField) Then
		Dim col As Map = columnsM.Get(colField)
		Dim editor As Map = CreateMap("dataSource":colDataSource,"valueField":colValueField)
		col.Put("editor", editor)
		col.Put("editField", colEditField)
		columnsM.Put(colField,col)
	End If
	Return Me
End Sub


'set column property
Sub SetColumnProperty(colField As String, colProperty As String, colValue As Object)
	colField = colField.Replace(" ","")
	If columnsM.ContainsKey(colField) Then
		Dim col As Map = columnsM.Get(colField)
		col.Put(colProperty, colValue)
		columnsM.Put(colField,col)
	End If
End Sub

'get data for primary key
Sub GetByPos(rowPos As Int) As Map
	Dim res As Map = grid.RunMethod("get", Array(rowPos)).result
	Return res
End Sub

'get all visible rows data
Sub GetRowsVisible() As List
	Dim lst As List = grid.runmethod("getAll", Null).Result
	Return lst
End Sub

'get all rows data
Sub GetRows() As List
	Dim lst As List = grid.runmethod("getAll", Array(True)).Result
	Return lst
End Sub


'set column render
Sub SetColumnRenderer(colField As String, colMethod As String)
	colMethod = colMethod.tolowercase
	Dim value, record, cell, displayEl As Map
	colField = colField.Replace(" ","")
	colField = colField.tolowercase
	If columnsM.ContainsKey(colField) Then
		Dim col As Map = columnsM.Get(colField)
		col.Put("renderer", Banano.CallBack(mCallBack,$"${eventName}_${colMethod}"$,Array(value, record, cell, displayEl)))
		columnsM.Put(colField,col)
	End If
End Sub

'get data by id
Sub GetById(sID As String) As Map
	Dim res As Map = grid.RunMethod("getById", Array(sID)).Result
	Return res
End Sub

'search the grid, use a map that has the field names and values to search for
Sub SearchFor(searchValues As Map)
	grid.RunMethod("reload", Array(searchValues))
End Sub

'reload, if autoload is false
Sub Reload
	grid.RunMethod("reload",Null)
End Sub

'clear the data
Sub Clear
	grid.RunMethod("clear",Null)
End Sub

'hide columns via code
Sub HideColumn(colName As List)
	For Each strCol As String In colName
		grid.RunMethod("hideColumn", Array(strCol))
	Next
End Sub

'show columns via code
Sub ShowColumn(colField As List)
	For Each strCol As String In colField
		grid.RunMethod("showColumn",Array(strCol))
	Next
End Sub

'remove a row by id
Sub RemoveRow(pk As String)
	grid.RunMethod("removeRow", Array(pk))
End Sub

'count visible records
Sub CountVisible As Int
	Dim cv As Int = grid.RunMethod("count",Null).result
	Return cv
End Sub

'count all records
Sub CountAll As Int
	Dim cv As Int = grid.RunMethod("count",Array(True)).result
	Return cv
End Sub

'removes all data and events and keep table and wrapper
Sub Destroy
	Try
		grid.RunMethod("destroy", Array(True, True))
	Catch
		Log(LastException)
	End Try
End Sub

Sub SetTitle(sTitle As String) As VMGijgoTable
	Dim spanTitle As VMElement
	spanTitle.Initialize(vue,$"${ID}title"$).SetTag("span")
	spanTitle.SetText(sTitle)
	ToolBar.AddComponent(1,1,spanTitle.ToString)
	Return Me	
End Sub

'refresh the grid
Sub Refresh As VMGijgoTable
	If grid <> Null Then Destroy
	Select Case IconsLibrary
		Case "materialicons"
			ExpandIcon = $"<i class="material-icons">keyboard_arrow_right</i>"$
			CollapseIcon = $"<i class="material-icons">keyboard_arrow_down</i>"$
		Case "fontawesome"
			ExpandIcon = $"<i class="fa fa-chevron-right"></i>"$
			CollapseIcon = $"<i class="fa fa-chevron-down"></i>"$
	End Select
	Dim sizes As List
	sizes.Initialize
	sizes.AddAll(Array As Int(5,10,15,20,25,30,35,40,45,50))
	Dim pager As Map = CreateMap("limit":PagerLimit,"sizes":sizes)
	Dim mapping As Map = CreateMap("dataField": DataField)
	Columns.Initialize
	For Each column As Map In columnsM.Values
		Columns.Add(column)
	Next
	If autoGenerateColumns Then Columns.clear
	'set options
	Options = CreateMap("dataSource":DataSource, _
	"primaryKey": PrimaryKey, _
	"mapping":mapping, _
	"autoLoad":autoLoad, _
	"bodyRowHeight": BodyRowHeight, _
	"selectionType":SelectionType, _
	"selectionMethod":SelectionMethod, _
	"iconsLibrary": IconsLibrary, _
	"columnReorder": ColumnReorder, _
	"keepExpandedRows":KeepExpandedRows, _
	"fixedHeader":FixedHeader, _
	"resizableColumns":ResizableColumns, _
	"responsive": responsive, _
	"rowReorder": RowReorder, _
	"autoGenerateColumns":autoGenerateColumns, _
	"uiLibrary": UILibrary)
	If InlineEditing Then
		Dim InlineEditingObject As Map = CreateMap("mode": InlineEditingMode,"managementColumn":InlineEditingManagementColumn)
		Options.Put("inlineEditing", InlineEditingObject)
	End If
	If ShowPager Then Options.Put("pager", pager)
	If Columns.Size > 0 Then Options.Put("columns", Columns)
	If MinWidth > 0 Then Options.put("minWidth", MinWidth)
	If ToolbarTemplate.Length > 0 Then Options.Put("toolbarTemplate",ToolbarTemplate)
	If Width > 0 Then Options.Put("width", Width)
	'we have group by columns
	If GroupBy.length > 0 Then Options.Put("grouping", CreateMap("groupBy": GroupBy))
	If DetailTemplate.Length > 0 Then Options.Put("detailTemplate", DetailTemplate)
	If params.Size > 0 Then Options.Put("params", params)
	If HeaderFilter Then
		Dim hf As Map = CreateMap("type": HeaderFilterType)
		Options.Put("headerFilter", hf)
	End If
	Dim icn As Map
	icn.Initialize
	icn.Put("expandRow",  ExpandIcon)
	icn.Put("collapseRow", CollapseIcon)
	icn.Put("expandGroup",  ExpandIcon)
	icn.Put("collapseGroup", CollapseIcon)
	Options.Put("icons", icn)
	'initialize jquery
	grid = JQ.Selector($"#${ID}"$)
	grid.RunMethod("grid", Array(Options))
	
	'bind events, when each row changes
	'Dim e, row, record, sID As Map
	'Dim newValue, cell, column As Map
	'Dim value, displayEl, detailWrapper As Map
	'grid.RunMethod("bind", Array("rowDataBound", Banano.Callback(mCallBack, eventName & "_rowdatabound", Array(e, row, sID, record))))
	'when we delete a row
	'grid.RunMethod("bind", Array("rowRemoving", Banano.Callback(mCallBack, eventName & "_rowremoving", Array(e, row, sID, record))))
	'when a row is selected
	'grid.RunMethod("bind", Array("rowSelect", Banano.Callback(mCallBack, eventName & "_rowselect", Array(e, row, sID, record))))
	'when a row is unselected
	'grid.RunMethod("bind", Array("rowUnselect", Banano.Callback(mCallBack, eventName & "_rowunselect", Array(e, row, sID, record))))
	' when cell data changes
	'grid.RunMethod("bind", Array("cellDataChanged", Banano.Callback(mCallBack, eventName & "_celldatachanged", Array(e, cell, column, record, newValue))))
	'when row data changes
	'grid.RunMethod("bind", Array("rowDataChanged", Banano.Callback(mCallBack, eventName & "_rowdatachanged", Array(e, sID, record))))
	'when detail is expanded
	'grid.RunMethod("bind", Array("detailExpand", Banano.Callback(mCallBack, eventName & "_detailExpand", Array(e, detailWrapper, sID))))
	' when detail is collapse
	'grid.RunMethod("bind", Array("detailCollapse", Banano.Callback(mCallBack, eventName & "_detailExpand", Array(e, detailWrapper, sID))))
	
	'If TransparentBackground Then
	'	Banano.GetElement(".gj-grid-bootstrap-4-toolbar").SetStyle($"{"background-color": "transparent"}"$)
	'	Banano.GetElement(".gj-grid-bootstrap thead th").SetStyle($"{"background-color": "transparent"}"$)
	'	Banano.GetElement(".gj-grid-bootstrap tfoot tr[data-role=pager] th").SetStyle($"{"background-color": "transparent"}"$)
	'End If
	Return Me
End Sub

'update an existing row of data
Sub UpdateRow(rowData As Map)
	Dim pk As String = rowData.Get(PrimaryKey)
	grid.runmethod("updateRow", Array(pk, rowData))
End Sub

'add a column
Sub AddColumn(colName As String, colTitle As String) As VMGijgoTable
	'column name should not have a space
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	Dim col As Map = CreateMap("field":colName,"title":colTitle)
	col.Put("type", COLUMN_TEXT)
	'col.Put("filterable", True)
	'Dim events As Map
	'events.Initialize
	'col.Put("events", events)
	columnsM.Put(colName,col)
	Return Me
End Sub


'add a column
Sub AddColumn1(colName As String, colTitle As String, colType As String, colWidth As Int, colSortable As Boolean, colAlign As String) As VMGijgoTable
	Dim value, record, cell, displayEl As Map
	'column name should not have a space
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	Dim col As Map = CreateMap("field":colName,"title":colTitle)
	If colWidth > 0 Then col.Put("width", colWidth)
	If colSortable Then	col.Put("sortable", colSortable)
	If colType <> COLUMN_NONE Then col.Put("type", colType)
	Select Case colAlign
	Case ALIGN_CENTER, ALIGN_RIGHT
		col.Put("align", colAlign)
	End Select
	col.Put("filterable", True)
	Dim events As Map
	events.Initialize 
	col.Put("events", events)
	Select Case colType
	Case COLUMN_IMAGE
		col.Put("type", "text")
		col.Put("renderer", Banano.CallBack(Me,"imagerender",Array(value, record, cell, displayEl)))
	Case COLUMN_MONEY
		col.Put("type", "text")
		col.Put("renderer", Banano.CallBack(Me,"moneyrender",Array(value, record, cell, displayEl)))
	Case COLUMN_FILESIZE
		col.Put("type", "text")
		col.Put("renderer", Banano.CallBack(Me,"filerender",Array(value, record, cell, displayEl)))
	Case COLUMN_DATE
		col.Put("format", "yyyy-mm-dd")
	Case COLUMN_TIME
		col.Put("format", "HH:MM")
	Case COLUMN_DATETIME
		col.Put("format", "yyyy-mm-dd HH:MM")
	Case COLUMN_ICONRENDER
		col.Put("type", "text")
		col.Put("renderer", Banano.CallBack(Me,"iconrender",Array(value, record, cell, displayEl)))
	End Select
	columnsM.Put(colName,col)
	Return Me
End Sub

'add Icon
Sub AddIcon(colField As String, colTitle As String, colIcon As String, colWidth As String)
	Dim sIcon As String
	Select Case IconsLibrary
		Case "materialicons"
			sIcon = $"<span class="material-icons gj-cursor-pointer">${colIcon}</span>"$
		Case "fontawesome"
			sIcon = $"<span class="${colIcon} gj-cursor-pointer"></span>"$
	End Select
	AddColumn(colField,colTitle)
	SetColumnTmpl(colField,sIcon)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_NONE)
	SetColumnWidth(colField, colWidth)
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
End Sub

'add edit icon
Sub AddIconEdit(colField As String, colTitle As String)
	Dim EditIcon As String
	Select Case IconsLibrary
		Case "materialicons"
			EditIcon = $"<span class="material-icons gj-cursor-pointer">edit</span>"$
		Case "fontawesome"
			EditIcon = $"<span class="fa fa-pencil gj-cursor-pointer"></span>"$
	End Select
	AddColumn(colField,colTitle)
	SetColumnTmpl(colField,EditIcon)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_NONE)
	SetColumnWidth(colField, "80")
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
End Sub

'add edit & delete button
Sub AddEditTrash
	AddIconEdit("edit", "Edit")
	SetColumnClickEvent("edit", True)
	AddIconDelete("delete", "Delete")
	SetColumnClickEvent("delete", True)
End Sub

Sub AddDelete
	AddIconDelete("delete", "Delete")
	SetColumnClickEvent("delete", True)
End Sub

Sub AddEdit
	AddIconEdit("edit", "Edit")
	SetColumnClickEvent("edit", True)
End Sub

Sub AddPrint
	AddIcon("print", "Print", "print", 80)
	SetColumnClickEvent("print", True)
End Sub

'add columns from key value pairs
Sub AddColumns(flds As Map)
	For Each k As String In flds.Keys
		Dim v As String = flds.Get(k)
		AddColumn(k, v)
		SetColumnSortable(k, True)
	Next
End Sub

'add delete icon
Sub AddIconDelete(colField As String, colTitle As String)
	Dim DelIcon As String
	Select Case IconsLibrary
		Case "materialicons"
			DelIcon = $"<span class="material-icons gj-cursor-pointer">delete</span>"$
		Case "fontawesome"
			DelIcon = $"<span class="fa fa-remove gj-cursor-pointer"></span>"$
	End Select
	AddColumn(colField,colTitle)
	SetColumnTmpl(colField,DelIcon)
	SetColumnFilterable(colField,False)
	SetColumnType(colField, COLUMN_NONE)
	SetColumnWidth(colField, "80")
	SetColumnSortable(colField, False)
	SetColumnAlignment(colField, ALIGN_CENTER)
End Sub


'add template
Sub AddTemplate(colField As String, colTitle As String, colTemplate As String, colWidth As String, colSortable As Boolean, colAlign As String)
	AddColumn(colField,colTitle)
	SetColumnTmpl(colField,colTemplate)
	SetColumnType(colField, COLUMN_NONE)
	SetColumnWidth(colField, colWidth)
	SetColumnSortable(colField, colSortable)
	SetColumnAlignment(colField, colAlign)
End Sub

'set the column data template
Sub SetColumnWidth(colName As String, colWidth As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("width", colWidth)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column data template
Sub SetColumnAlignment(colName As String, colAlign As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		Select Case colAlign
		Case ALIGN_CENTER, ALIGN_RIGHT
			col.Put("align", colAlign)
			columnsM.Put(colName,col)
		End Select
	End If
	Return Me
End Sub

'center align columns
Sub SetCenterAlignColumns(flds As List) As VMGijgoTable
	For Each k As String In flds
		SetColumnAlignment(k, ALIGN_CENTER)
	Next
	Return Me
End Sub

'right align columns
Sub SetRightAlignColumns(flds As List) As VMGijgoTable
	For Each k As String In flds
		SetColumnAlignment(k, ALIGN_RIGHT)
	Next
	Return Me
End Sub


'set the column data template
Sub SetColumnTmpl(colName As String, coltmpl As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("tmpl", coltmpl)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column data template
Sub SetColumnType(colName As String, colType As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("type", colType)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column type to date for these columns
Sub SetDateColumns(dates As List) As VMGijgoTable
	For Each k As String In dates
		SetColumnType(k, COLUMN_DATE)
		SetColumnFormat(k, "yyyy-mm-dd")
	Next
	Return Me
End Sub

'set the column type to date time for these columns
Sub SetDateTimeColumns(dates As List) As VMGijgoTable
	For Each k As String In dates
		SetColumnType(k, COLUMN_DATETIME)
		SetColumnFormat(k, "yyyy-mm-dd HH:MM")
	Next
	Return Me
End Sub

'set the column type to time for these columns
Sub SetTimeColumns(dates As List) As VMGijgoTable
	For Each k As String In dates
		SetColumnType(k, COLUMN_TIME)
		SetColumnFormat(k, "HH:MM")
	Next
	Return Me
End Sub

'set the column type to time for these columns
Sub SetMoneyColumns(dates As List) As VMGijgoTable
	For Each k As String In dates
		SetColumnType(k, COLUMN_MONEY)
	Next
	Return Me
End Sub


'set column click event
Sub SetColumnClickEvent(colField As String, stopPropagation As Boolean)
	colField = colField.Replace(" ","")
	colField = colField.tolowercase
	If columnsM.ContainsKey(colField) Then
		Dim e As Map
		Dim col As Map = columnsM.Get(colField)
		If col.ContainsKey("events") = False Then
			Dim events As Map = CreateMap()
			col.Put("events", events)
		End If
		Dim events As Map = col.Get("events")
		If stopPropagation Then col.Put("stopPropagation", stopPropagation)
		events.Put("click", Banano.CallBack(mCallBack, eventName & $"_${colField}"$, Array(e)))
		col.Put("events", events)
		columnsM.Put(colField,col)
	End If
End Sub

'set column event
Sub SetColumnEvent(colField As String, colEvent As String, stopPropagation As Boolean)
	colField = colField.Replace(" ","")
	colField = colField.tolowercase
	If columnsM.ContainsKey(colField) Then
		Dim e As Map
		Dim col As Map = columnsM.Get(colField)
		If col.ContainsKey("events") = False Then
			Dim events As Map = CreateMap()
			col.Put("events", events)
		End If
		Dim events As Map = col.Get("events")
		If stopPropagation Then col.Put("stopPropagation", stopPropagation)
		events.Put(colEvent, Banano.CallBack(mCallBack, eventName & $"_${colField.tolowercase}_${colEvent}"$, Array(e)))
		col.Put("events", events)
		columnsM.Put(colField,col)
	End If
End Sub


'set column priority, this works with responsive layouts


'set the column min width
Sub SetColumnMinWidth(colField As String, colMinWidth As Int, colPriority As Int) As VMGijgoTable
	colField = colField.Replace(" ","")
	colField = colField.tolowercase
	If columnsM.ContainsKey(colField) Then
		Dim col As Map = columnsM.Get(colField)
		col.Put("minWidth", colMinWidth)
		col.Put("priority", colPriority)
		columnsM.Put(colField,col)
	End If
	Return Me
End Sub

'get selected record id
Sub GetSelected As String
	Dim res As String = grid.RunMethod("getSelected",Null).Result
	Return res
End Sub

'get all selected record ids
Sub GetSelections As List
	Dim res As List = grid.RunMethod("getSelections",Null).Result
	Return res
End Sub

'select all records
Sub SelectAll
	grid.RunMethod("selectAll", Null)
End Sub

'un-select all records
Sub UnSelectAll
	grid.RunMethod("unSelectAll", Null)
End Sub

'expand all records
Sub ExpandAll
	grid.RunMethod("expandAll", Null)
End Sub

'collapse all records
Sub CollapseAll
	grid.RunMethod("collapseAll", Null)
End Sub

'set a selection
Sub SetSelected(rowPos As Int)
	grid.runmethod("setSelected", Array(rowPos))
End Sub

'set the column name
Sub SetColumnName(colField As String, colName As String) As VMGijgoTable
	colField = colField.Replace(" ","")
	colField = colField.tolowercase
	If columnsM.ContainsKey(colField) Then
		Dim col As Map = columnsM.Get(colField)
		col.Put("name", colName)
		columnsM.Put(colField,col)
	End If
	Return Me
End Sub


'set the column tooltip
Sub SetColumnToolTip(colName As String, colToolTip As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("tooltip", colToolTip)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column stop probagation for events
Sub SetColumnStopPropagation(colName As String, colStopPropagation As Boolean) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("stopPropagation", colStopPropagation)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub


'get changed records on table for only changed fields and primary key
Sub GetChanges As List
	Dim res As List = grid.runmethod("getChanges",Null).Result
	Return res
End Sub

'set the column icon
Sub SetColumnIcon(colName As String, colIcon As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("icon", colIcon)
		col.Put("type", COLUMN_ICON)
		col.Put("filterable", False)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'hide multiple columns
Sub SetColumnsHidden(colNames As List)
	For Each col As String In colNames
		SetColumnHidden(col)
	Next
End Sub

'set column visibility
Sub SetColumnHidden(colName As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("hidden", True)
		col.Put("filterable", False)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column visibility only
Sub SetColumnHiddenOnly(colName As String, bValue As Boolean) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("hidden", bValue)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub


'set column sortable
Sub SetColumnSortable(colName As String, colSortable As Boolean) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase	
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("sortable", colSortable)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'add a row dynamically
Sub AddRow(rowData As Map)
	If grid = Null Then Refresh
	grid.RunMethod("addRow", Array(rowData))
End Sub

'download data as csv
Sub DownloadCSV(fileName As String)
	grid.RunMethod("downloadCSV", Array(fileName,True))
End Sub

'get data as csv
Sub GetCSV
	grid.RunMethod("getCSV", Array(True))
End Sub

'set header italic
Sub SetColumnItalic(colName As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("headerCssClass", "italic")
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set header css
Sub SetColumnHeaderCSS(colName As String, headerCssClass As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("headerCssClass", headerCssClass)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set column filterable
Sub SetColumnFilterable(colName As String, colFilter As Boolean) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("filterable", colFilter)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'set the column class
Sub SetColumnCSS(colName As String, colCSS As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("cssClass", colCSS)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub


'set column format for numerals
Sub SetColumnFormatNumeral(colField As String, colFormat As String) As VMGijgoTable
	SetColumnProperty(colField,"formatnumeral", colFormat)
	formats.Put(colField,colFormat)
	Return Me
End Sub

'set the column data format
Sub SetColumnFormat(colName As String, colFormat As String) As VMGijgoTable
	colName = colName.Replace(" ","")
	colName = colName.tolowercase
	
	If columnsM.ContainsKey(colName) Then
		Dim col As Map = columnsM.Get(colName)
		col.Put("format", colFormat)
		columnsM.Put(colName,col)
	End If
	Return Me
End Sub

'icon render, ensure we have a font size and font color
Sub IconRender(value As Object, record As Map, cell As BANanoObject, displayEl As BANanoObject)
	If value = Null Then
		value = ""
		Return
	End If
	Dim sfontsize As String = record.Get("iconsize")
	Dim sfontcolor As String = record.Get("iconcolor")
	If sfontsize = Null Then sfontsize = ""
	If sfontcolor = Null Then sfontcolor = ""
	Dim sb As StringBuilder
	sb.Initialize
	If sfontsize <> "" Then sb.Append($"font-size:${sfontsize}px;"$)
	If sfontcolor <> "" Then sb.Append($"color:${sfontcolor};"$)
	Dim sStyle As String = sb.tostring
	Dim sIcon As String = ""
	Select Case IconsLibrary
		Case "materialicons"
			sIcon = $"<i class="material-icons gj-cursor-pointer" style="${sStyle}">${value}</i>"$
		Case "fontawesome"
			sIcon = $"<i class="${value} gj-cursor-pointer" style="${sStyle}"></i>"$
	End Select
	Dim dE As BANanoElement = Banano.ToElement(displayEl)
	dE.SetHTML(sIcon)
End Sub


'file size renderer
Sub FileRender(value As Object, record As Map, cell As BANanoObject, displayEl As BANanoObject)
	If value = Null Then value = 0
	Dim dE As BANanoElement = Banano.ToElement(displayEl)
	value = N.Selector(value).RunMethod("format",Array("0.00 b"))
	dE.SetText(value)
End Sub

'apply numeral format to a number
Sub NumeralFormat(sValue As String,sFormat As String) As String
	sValue = N.Selector(sValue).RunMethod("format",Array(sFormat)).result
	Return sValue
End Sub
		 
'money renderer
Sub MoneyRender(value As Object, record As Map, cell As BANanoObject, displayEl As BANanoObject)
	If value = Null Then value = 0
	Dim dE As BANanoElement = Banano.ToElement(displayEl)
	value = N.Selector(value).RunMethod("format",Array("(0,0.00)"))
	dE.SetText(value)
End Sub

'image handler
Sub ImageRender(value As Object, record As Map, cell As BANanoObject, displayEl As BANanoObject)
	'convert to an element
	If value <> Null Then
		Dim simagewidth As String = record.Get("imagewidth")
		Dim simageheight As String = record.Get("imageheight")
		If simagewidth = Null Then simagewidth = ""
		If simageheight = Null Then simageheight = ""
		Dim sb As StringBuilder
		sb.Initialize
		If simageheight <> "" Then sb.Append($"height:${MakePx(simageheight)};"$)
		If simagewidth <> "" Then sb.Append($"width:${MakePx(simagewidth)};"$)
		Dim sStyle As String = sb.tostring
		Dim dE As BANanoElement = Banano.ToElement(displayEl)
		Dim simg As String = $"<img src="${value}" alt="" style="${sStyle}">"$
		dE.SetHTML(simg)
	End If
End Sub


private Sub MakePx(sValue As String) As String
	sValue = sValue.trim
	If sValue.EndsWith("%") Then
		Return sValue
	else If sValue.EndsWith("vm") Then
		Return sValue
	else If sValue.EndsWith("px") Then
		Return sValue
	else If sValue.EndsWith("cm") Then
		Return sValue
	else If sValue.EndsWith("mm") Then
		Return sValue
	else If sValue.EndsWith("in") Then
		Return sValue
	else If sValue.EndsWith("pt") Then
		Return sValue
	else If sValue.EndsWith("pc") Then
		Return sValue
	else If sValue.EndsWith("em") Then
		Return sValue
	else If sValue.EndsWith("ex") Then
		Return sValue
	else If sValue.EndsWith("ch") Then
		Return sValue
	else If sValue.EndsWith("rem") Then
		Return sValue
	else If sValue.EndsWith("vw") Then
		Return sValue
	else If sValue.EndsWith("vh") Then
		Return sValue
	else If sValue.EndsWith("vmin") Then
		Return sValue
	else If sValue.EndsWith("vmax") Then
		Return sValue
	else If sValue.EndsWith(";") Then
		Return sValue
	Else
		sValue = sValue.Replace("px","")
		sValue = $"${sValue}px"$
		If sValue = "px" Then sValue = ""
		Return sValue
	End If
End Sub