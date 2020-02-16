package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmgijgotable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmgijgotable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmgijgotable.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _table = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public boolean _inlineediting = false;
public String _inlineeditingmode = "";
public boolean _inlineeditingmanagementcolumn = false;
public String _width = "";
public com.ab.banano.BANanoObject _grid = null;
public String _primarykey = "";
public int _pagerlimit = 0;
public anywheresoftware.b4a.objects.collections.List _columns = null;
public String _column_date = "";
public String _column_text = "";
public String _column_icon = "";
public String _column_checkbox = "";
public String _column_dropdown = "";
public String _column_none = "";
public String _column_time = "";
public String _column_datetime = "";
public String _column_image = "";
public String _column_money = "";
public String _column_filesize = "";
public String _column_iconrender = "";
public String _align_center = "";
public String _align_right = "";
public String _align_left = "";
public boolean _autogeneratecolumns = false;
public boolean _autoload = false;
public String _bodyrowheight = "";
public anywheresoftware.b4a.objects.collections.Map _columnsm = null;
public String _selectiontype = "";
public boolean _columnreorder = false;
public String _detailtemplate = "";
public boolean _keepexpandedrows = false;
public boolean _fixedheader = false;
public boolean _headerfilter = false;
public String _headerfiltertype = "";
public boolean _resizablecolumns = false;
public boolean _showhiddencolumnsasdetails = false;
public String _expandicon = "";
public String _collapseicon = "";
public boolean _rowreorder = false;
public String _selectionmethod = "";
public String _iconslibrary = "";
public int _minwidth = 0;
public String _uilibrary = "";
public String _toolbartemplate = "";
public String _groupby = "";
public anywheresoftware.b4a.objects.collections.List _datasource = null;
public String _datafield = "";
public boolean _showpager = false;
public boolean _transparentbackground = false;
public anywheresoftware.b4a.objects.collections.Map _params = null;
public com.ab.banano.BANano _banano = null;
public Object _mcallback = null;
public String _eventname = "";
public anywheresoftware.b4a.objects.collections.Map _options = null;
public boolean _responsive = false;
public anywheresoftware.b4a.objects.collections.Map _formats = null;
public com.ab.banano.BANanoObject _n = null;
public b4j.example.vmgrid _toolbar = null;
public com.ab.banano.BANanoObject _jq = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmgijgotable  _settitle(b4j.example.vmgijgotable __ref,String _stitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "settitle", new Object[] {_stitle}));}
b4j.example.vmelement _spantitle = null;
RDebugUtils.currentLine=130744320;
 //BA.debugLineNum = 130744320;BA.debugLine="Sub SetTitle(sTitle As String) As VMGijgoTable";
RDebugUtils.currentLine=130744321;
 //BA.debugLineNum = 130744321;BA.debugLine="Dim spanTitle As VMElement";
_spantitle = new b4j.example.vmelement();
RDebugUtils.currentLine=130744322;
 //BA.debugLineNum = 130744322;BA.debugLine="spanTitle.Initialize(vue,\"\").SetTag(\"span\")";
_spantitle._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"")._settag /*b4j.example.vmelement*/ (null,"span");
RDebugUtils.currentLine=130744323;
 //BA.debugLineNum = 130744323;BA.debugLine="spanTitle.SetText(sTitle)";
_spantitle._settext /*b4j.example.vmelement*/ (null,_stitle);
RDebugUtils.currentLine=130744324;
 //BA.debugLineNum = 130744324;BA.debugLine="ToolBar.AddComponent(1,1,spanTitle.ToString)";
__ref._toolbar /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int) (1),(int) (1),_spantitle._tostring /*String*/ (null));
RDebugUtils.currentLine=130744325;
 //BA.debugLineNum = 130744325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=130744326;
 //BA.debugLineNum = 130744326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _addcolumn(b4j.example.vmgijgotable __ref,String _colname,String _coltitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addcolumn", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "addcolumn", new Object[] {_colname,_coltitle}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=130940928;
 //BA.debugLineNum = 130940928;BA.debugLine="Sub AddColumn(colName As String, colTitle As Strin";
RDebugUtils.currentLine=130940930;
 //BA.debugLineNum = 130940930;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=130940931;
 //BA.debugLineNum = 130940931;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=130940932;
 //BA.debugLineNum = 130940932;BA.debugLine="Dim col As Map = CreateMap(\"field\":colName,\"title";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col = __c.createMap(new Object[] {(Object)("field"),(Object)(_colname),(Object)("title"),(Object)(_coltitle)});
RDebugUtils.currentLine=130940933;
 //BA.debugLineNum = 130940933;BA.debugLine="col.Put(\"type\", COLUMN_TEXT)";
_col.Put((Object)("type"),(Object)(__ref._column_text /*String*/ ));
RDebugUtils.currentLine=130940938;
 //BA.debugLineNum = 130940938;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
RDebugUtils.currentLine=130940939;
 //BA.debugLineNum = 130940939;BA.debugLine="SetColumnSortable(colName, True)";
__ref._setcolumnsortable /*b4j.example.vmgijgotable*/ (null,_colname,__c.True);
RDebugUtils.currentLine=130940940;
 //BA.debugLineNum = 130940940;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=130940941;
 //BA.debugLineNum = 130940941;BA.debugLine="End Sub";
return null;
}
public String  _addedittrash(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addedittrash", true))
	 {return ((String) Debug.delegate(ba, "addedittrash", null));}
RDebugUtils.currentLine=131203072;
 //BA.debugLineNum = 131203072;BA.debugLine="Sub AddEditTrash";
RDebugUtils.currentLine=131203073;
 //BA.debugLineNum = 131203073;BA.debugLine="AddIconEdit(\"edit\", \"Edit\")";
__ref._addiconedit /*String*/ (null,"edit","Edit");
RDebugUtils.currentLine=131203074;
 //BA.debugLineNum = 131203074;BA.debugLine="SetColumnClickEvent(\"edit\", True)";
__ref._setcolumnclickevent /*String*/ (null,"edit",__c.True);
RDebugUtils.currentLine=131203075;
 //BA.debugLineNum = 131203075;BA.debugLine="AddIconDelete(\"delete\", \"Delete\")";
__ref._addicondelete /*String*/ (null,"delete","Delete");
RDebugUtils.currentLine=131203076;
 //BA.debugLineNum = 131203076;BA.debugLine="SetColumnClickEvent(\"delete\", True)";
__ref._setcolumnclickevent /*String*/ (null,"delete",__c.True);
RDebugUtils.currentLine=131203077;
 //BA.debugLineNum = 131203077;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setmoneycolumns(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setmoneycolumns", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setmoneycolumns", new Object[] {_dates}));}
String _k = "";
RDebugUtils.currentLine=132251648;
 //BA.debugLineNum = 132251648;BA.debugLine="Sub SetMoneyColumns(dates As List) As VMGijgoTable";
RDebugUtils.currentLine=132251649;
 //BA.debugLineNum = 132251649;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=132251650;
 //BA.debugLineNum = 132251650;BA.debugLine="SetColumnType(k, COLUMN_MONEY)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_k,__ref._column_money /*String*/ );
 }
};
RDebugUtils.currentLine=132251652;
 //BA.debugLineNum = 132251652;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=132251653;
 //BA.debugLineNum = 132251653;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnshidden(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _colnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnshidden", true))
	 {return ((String) Debug.delegate(ba, "setcolumnshidden", new Object[] {_colnames}));}
String _col = "";
RDebugUtils.currentLine=133300224;
 //BA.debugLineNum = 133300224;BA.debugLine="Sub SetColumnsHidden(colNames As List)";
RDebugUtils.currentLine=133300225;
 //BA.debugLineNum = 133300225;BA.debugLine="For Each col As String In colNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=133300226;
 //BA.debugLineNum = 133300226;BA.debugLine="SetColumnHidden(col)";
__ref._setcolumnhidden /*b4j.example.vmgijgotable*/ (null,_col);
 }
};
RDebugUtils.currentLine=133300228;
 //BA.debugLineNum = 133300228;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setdatasource(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _rows) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setdatasource", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setdatasource", new Object[] {_rows}));}
RDebugUtils.currentLine=129302528;
 //BA.debugLineNum = 129302528;BA.debugLine="Sub SetDataSource(rows As List) As VMGijgoTable";
RDebugUtils.currentLine=129302529;
 //BA.debugLineNum = 129302529;BA.debugLine="If rows.Size = 0 Then";
if (_rows.getSize()==0) { 
RDebugUtils.currentLine=129302530;
 //BA.debugLineNum = 129302530;BA.debugLine="DataSource = Array()";
__ref._datasource /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 }else {
RDebugUtils.currentLine=129302532;
 //BA.debugLineNum = 129302532;BA.debugLine="DataSource = rows";
__ref._datasource /*anywheresoftware.b4a.objects.collections.List*/  = _rows;
 };
RDebugUtils.currentLine=129302534;
 //BA.debugLineNum = 129302534;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=129302535;
 //BA.debugLineNum = 129302535;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=128516096;
 //BA.debugLineNum = 128516096;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=128516097;
 //BA.debugLineNum = 128516097;BA.debugLine="ToolbarTemplate = ToolBar.tostring";
__ref._toolbartemplate /*String*/  = __ref._toolbar /*b4j.example.vmgrid*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=128516098;
 //BA.debugLineNum = 128516098;BA.debugLine="Return Table.tostring";
if (true) return __ref._table /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=128516099;
 //BA.debugLineNum = 128516099;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _refresh(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "refresh", null));}
anywheresoftware.b4a.objects.collections.List _sizes = null;
anywheresoftware.b4a.objects.collections.Map _pager = null;
anywheresoftware.b4a.objects.collections.Map _mapping = null;
anywheresoftware.b4a.objects.collections.Map _column = null;
anywheresoftware.b4a.objects.collections.Map _inlineeditingobject = null;
anywheresoftware.b4a.objects.collections.Map _hf = null;
anywheresoftware.b4a.objects.collections.Map _icn = null;
RDebugUtils.currentLine=130809856;
 //BA.debugLineNum = 130809856;BA.debugLine="Sub Refresh As VMGijgoTable";
RDebugUtils.currentLine=130809857;
 //BA.debugLineNum = 130809857;BA.debugLine="If grid <> Null Then Destroy";
if (__ref._grid /*com.ab.banano.BANanoObject*/ != null) { 
__ref._destroy /*String*/ (null);};
RDebugUtils.currentLine=130809858;
 //BA.debugLineNum = 130809858;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(__ref._iconslibrary /*String*/ ,"materialicons","fontawesome")) {
case 0: {
RDebugUtils.currentLine=130809860;
 //BA.debugLineNum = 130809860;BA.debugLine="ExpandIcon = $\"<i class=\"material-icons\">keyboa";
__ref._expandicon /*String*/  = ("<i class=\"material-icons\">keyboard_arrow_right</i>");
RDebugUtils.currentLine=130809861;
 //BA.debugLineNum = 130809861;BA.debugLine="CollapseIcon = $\"<i class=\"material-icons\">keyb";
__ref._collapseicon /*String*/  = ("<i class=\"material-icons\">keyboard_arrow_down</i>");
 break; }
case 1: {
RDebugUtils.currentLine=130809863;
 //BA.debugLineNum = 130809863;BA.debugLine="ExpandIcon = $\"<i class=\"fa fa-chevron-right\"><";
__ref._expandicon /*String*/  = ("<i class=\"fa fa-chevron-right\"></i>");
RDebugUtils.currentLine=130809864;
 //BA.debugLineNum = 130809864;BA.debugLine="CollapseIcon = $\"<i class=\"fa fa-chevron-down\">";
__ref._collapseicon /*String*/  = ("<i class=\"fa fa-chevron-down\"></i>");
 break; }
}
;
RDebugUtils.currentLine=130809866;
 //BA.debugLineNum = 130809866;BA.debugLine="Dim sizes As List";
_sizes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=130809867;
 //BA.debugLineNum = 130809867;BA.debugLine="sizes.Initialize";
_sizes.Initialize();
RDebugUtils.currentLine=130809868;
 //BA.debugLineNum = 130809868;BA.debugLine="sizes.AddAll(Array As Int(5,10,15,20,25,30,35,40,";
_sizes.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new int[]{(int) (5),(int) (10),(int) (15),(int) (20),(int) (25),(int) (30),(int) (35),(int) (40),(int) (45),(int) (50)}));
RDebugUtils.currentLine=130809869;
 //BA.debugLineNum = 130809869;BA.debugLine="Dim pager As Map = CreateMap(\"limit\":PagerLimit,\"";
_pager = new anywheresoftware.b4a.objects.collections.Map();
_pager = __c.createMap(new Object[] {(Object)("limit"),(Object)(__ref._pagerlimit /*int*/ ),(Object)("sizes"),(Object)(_sizes.getObject())});
RDebugUtils.currentLine=130809870;
 //BA.debugLineNum = 130809870;BA.debugLine="Dim mapping As Map = CreateMap(\"dataField\": DataF";
_mapping = new anywheresoftware.b4a.objects.collections.Map();
_mapping = __c.createMap(new Object[] {(Object)("dataField"),(Object)(__ref._datafield /*String*/ )});
RDebugUtils.currentLine=130809871;
 //BA.debugLineNum = 130809871;BA.debugLine="Columns.Initialize";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=130809872;
 //BA.debugLineNum = 130809872;BA.debugLine="For Each column As Map In columnsM.Values";
_column = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group16 = __ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Values();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_column.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group16.Get(index16)));
RDebugUtils.currentLine=130809873;
 //BA.debugLineNum = 130809873;BA.debugLine="Columns.Add(column)";
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_column.getObject()));
 }
};
RDebugUtils.currentLine=130809875;
 //BA.debugLineNum = 130809875;BA.debugLine="If autoGenerateColumns Then Columns.clear";
if (__ref._autogeneratecolumns /*boolean*/ ) { 
__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .Clear();};
RDebugUtils.currentLine=130809877;
 //BA.debugLineNum = 130809877;BA.debugLine="Options = CreateMap(\"dataSource\":DataSource, _ 	\"";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {(Object)("dataSource"),(Object)(__ref._datasource /*anywheresoftware.b4a.objects.collections.List*/ .getObject()),(Object)("primaryKey"),(Object)(__ref._primarykey /*String*/ ),(Object)("mapping"),(Object)(_mapping.getObject()),(Object)("autoLoad"),(Object)(__ref._autoload /*boolean*/ ),(Object)("bodyRowHeight"),(Object)(__ref._bodyrowheight /*String*/ ),(Object)("selectionType"),(Object)(__ref._selectiontype /*String*/ ),(Object)("selectionMethod"),(Object)(__ref._selectionmethod /*String*/ ),(Object)("iconsLibrary"),(Object)(__ref._iconslibrary /*String*/ ),(Object)("columnReorder"),(Object)(__ref._columnreorder /*boolean*/ ),(Object)("keepExpandedRows"),(Object)(__ref._keepexpandedrows /*boolean*/ ),(Object)("fixedHeader"),(Object)(__ref._fixedheader /*boolean*/ ),(Object)("resizableColumns"),(Object)(__ref._resizablecolumns /*boolean*/ ),(Object)("responsive"),(Object)(__ref._responsive /*boolean*/ ),(Object)("rowReorder"),(Object)(__ref._rowreorder /*boolean*/ ),(Object)("autoGenerateColumns"),(Object)(__ref._autogeneratecolumns /*boolean*/ ),(Object)("uiLibrary"),(Object)(__ref._uilibrary /*String*/ )});
RDebugUtils.currentLine=130809893;
 //BA.debugLineNum = 130809893;BA.debugLine="If InlineEditing Then";
if (__ref._inlineediting /*boolean*/ ) { 
RDebugUtils.currentLine=130809894;
 //BA.debugLineNum = 130809894;BA.debugLine="Dim InlineEditingObject As Map = CreateMap(\"mode";
_inlineeditingobject = new anywheresoftware.b4a.objects.collections.Map();
_inlineeditingobject = __c.createMap(new Object[] {(Object)("mode"),(Object)(__ref._inlineeditingmode /*String*/ ),(Object)("managementColumn"),(Object)(__ref._inlineeditingmanagementcolumn /*boolean*/ )});
RDebugUtils.currentLine=130809895;
 //BA.debugLineNum = 130809895;BA.debugLine="Options.Put(\"inlineEditing\", InlineEditingObject";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("inlineEditing"),(Object)(_inlineeditingobject.getObject()));
 };
RDebugUtils.currentLine=130809897;
 //BA.debugLineNum = 130809897;BA.debugLine="If ShowPager Then Options.Put(\"pager\", pager)";
if (__ref._showpager /*boolean*/ ) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pager"),(Object)(_pager.getObject()));};
RDebugUtils.currentLine=130809898;
 //BA.debugLineNum = 130809898;BA.debugLine="If Columns.Size > 0 Then Options.Put(\"columns\", C";
if (__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("columns"),(Object)(__ref._columns /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));};
RDebugUtils.currentLine=130809899;
 //BA.debugLineNum = 130809899;BA.debugLine="If MinWidth > 0 Then Options.put(\"minWidth\", MinW";
if (__ref._minwidth /*int*/ >0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("minWidth"),(Object)(__ref._minwidth /*int*/ ));};
RDebugUtils.currentLine=130809900;
 //BA.debugLineNum = 130809900;BA.debugLine="If ToolbarTemplate.Length > 0 Then Options.Put(\"t";
if (__ref._toolbartemplate /*String*/ .length()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("toolbarTemplate"),(Object)(__ref._toolbartemplate /*String*/ ));};
RDebugUtils.currentLine=130809901;
 //BA.debugLineNum = 130809901;BA.debugLine="If Width > 0 Then Options.Put(\"width\", Width)";
if ((double)(Double.parseDouble(__ref._width /*String*/ ))>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("width"),(Object)(__ref._width /*String*/ ));};
RDebugUtils.currentLine=130809903;
 //BA.debugLineNum = 130809903;BA.debugLine="If GroupBy.length > 0 Then Options.Put(\"grouping\"";
if (__ref._groupby /*String*/ .length()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grouping"),(Object)(__c.createMap(new Object[] {(Object)("groupBy"),(Object)(__ref._groupby /*String*/ )}).getObject()));};
RDebugUtils.currentLine=130809904;
 //BA.debugLineNum = 130809904;BA.debugLine="If DetailTemplate.Length > 0 Then Options.Put(\"de";
if (__ref._detailtemplate /*String*/ .length()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("detailTemplate"),(Object)(__ref._detailtemplate /*String*/ ));};
RDebugUtils.currentLine=130809905;
 //BA.debugLineNum = 130809905;BA.debugLine="If params.Size > 0 Then Options.Put(\"params\", par";
if (__ref._params /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("params"),(Object)(__ref._params /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=130809906;
 //BA.debugLineNum = 130809906;BA.debugLine="If HeaderFilter Then";
if (__ref._headerfilter /*boolean*/ ) { 
RDebugUtils.currentLine=130809907;
 //BA.debugLineNum = 130809907;BA.debugLine="Dim hf As Map = CreateMap(\"type\": HeaderFilterTy";
_hf = new anywheresoftware.b4a.objects.collections.Map();
_hf = __c.createMap(new Object[] {(Object)("type"),(Object)(__ref._headerfiltertype /*String*/ )});
RDebugUtils.currentLine=130809908;
 //BA.debugLineNum = 130809908;BA.debugLine="Options.Put(\"headerFilter\", hf)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("headerFilter"),(Object)(_hf.getObject()));
 };
RDebugUtils.currentLine=130809910;
 //BA.debugLineNum = 130809910;BA.debugLine="Dim icn As Map";
_icn = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=130809911;
 //BA.debugLineNum = 130809911;BA.debugLine="icn.Initialize";
_icn.Initialize();
RDebugUtils.currentLine=130809912;
 //BA.debugLineNum = 130809912;BA.debugLine="icn.Put(\"expandRow\",  ExpandIcon)";
_icn.Put((Object)("expandRow"),(Object)(__ref._expandicon /*String*/ ));
RDebugUtils.currentLine=130809913;
 //BA.debugLineNum = 130809913;BA.debugLine="icn.Put(\"collapseRow\", CollapseIcon)";
_icn.Put((Object)("collapseRow"),(Object)(__ref._collapseicon /*String*/ ));
RDebugUtils.currentLine=130809914;
 //BA.debugLineNum = 130809914;BA.debugLine="icn.Put(\"expandGroup\",  ExpandIcon)";
_icn.Put((Object)("expandGroup"),(Object)(__ref._expandicon /*String*/ ));
RDebugUtils.currentLine=130809915;
 //BA.debugLineNum = 130809915;BA.debugLine="icn.Put(\"collapseGroup\", CollapseIcon)";
_icn.Put((Object)("collapseGroup"),(Object)(__ref._collapseicon /*String*/ ));
RDebugUtils.currentLine=130809916;
 //BA.debugLineNum = 130809916;BA.debugLine="Options.Put(\"icons\", icn)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("icons"),(Object)(_icn.getObject()));
RDebugUtils.currentLine=130809918;
 //BA.debugLineNum = 130809918;BA.debugLine="grid = JQ.Selector($\"#${ID}\"$)";
__ref._grid /*com.ab.banano.BANanoObject*/  = __ref._jq /*com.ab.banano.BANanoObject*/ .Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"")));
RDebugUtils.currentLine=130809919;
 //BA.debugLineNum = 130809919;BA.debugLine="grid.RunMethod(\"grid\", Array(Options))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("grid",(Object)(new Object[]{(Object)(__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())}));
RDebugUtils.currentLine=130809946;
 //BA.debugLineNum = 130809946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=130809947;
 //BA.debugLineNum = 130809947;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getrecordfromevent(b4j.example.vmgijgotable __ref,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "getrecordfromevent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getrecordfromevent", new Object[] {_e}));}
anywheresoftware.b4a.objects.collections.Map _record = null;
anywheresoftware.b4a.objects.collections.Map _res = null;
RDebugUtils.currentLine=129368064;
 //BA.debugLineNum = 129368064;BA.debugLine="Sub GetRecordFromEvent(e As BANanoEvent) As Map";
RDebugUtils.currentLine=129368065;
 //BA.debugLineNum = 129368065;BA.debugLine="Dim record As Map = e.OtherField(\"data\").Result";
_record = new anywheresoftware.b4a.objects.collections.Map();
_record.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_e.OtherField("data").Result()));
RDebugUtils.currentLine=129368066;
 //BA.debugLineNum = 129368066;BA.debugLine="Dim res As Map = record.Get(\"record\")";
_res = new anywheresoftware.b4a.objects.collections.Map();
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_record.Get((Object)("record"))));
RDebugUtils.currentLine=129368067;
 //BA.debugLineNum = 129368067;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=129368068;
 //BA.debugLineNum = 129368068;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _initialize(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _sprimarykey,Object _module) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_sprimarykey,_module}));}
RDebugUtils.currentLine=128319488;
 //BA.debugLineNum = 128319488;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=128319489;
 //BA.debugLineNum = 128319489;BA.debugLine="Banano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("jquery-3.4.1.min.js");
RDebugUtils.currentLine=128319490;
 //BA.debugLineNum = 128319490;BA.debugLine="Banano.DependsOnAsset(\"gijgo.min.css\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("gijgo.min.css");
RDebugUtils.currentLine=128319491;
 //BA.debugLineNum = 128319491;BA.debugLine="Banano.DependsOnAsset(\"gijgo.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("gijgo.min.js");
RDebugUtils.currentLine=128319492;
 //BA.debugLineNum = 128319492;BA.debugLine="Banano.DependsOnAsset(\"fileSaver.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("fileSaver.min.js");
RDebugUtils.currentLine=128319493;
 //BA.debugLineNum = 128319493;BA.debugLine="Banano.DependsOnAsset(\"jszip.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("jszip.min.js");
RDebugUtils.currentLine=128319494;
 //BA.debugLineNum = 128319494;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=128319495;
 //BA.debugLineNum = 128319495;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=128319496;
 //BA.debugLineNum = 128319496;BA.debugLine="JQ = vue.jquery";
__ref._jq /*com.ab.banano.BANanoObject*/  = __ref._vue /*b4j.example.bananovue*/ ._jquery /*com.ab.banano.BANanoObject*/ ;
RDebugUtils.currentLine=128319497;
 //BA.debugLineNum = 128319497;BA.debugLine="Table.Initialize(vue, ID).SetTag(\"table\")";
__ref._table /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"table");
RDebugUtils.currentLine=128319498;
 //BA.debugLineNum = 128319498;BA.debugLine="mCallBack = module";
__ref._mcallback /*Object*/  = _module;
RDebugUtils.currentLine=128319499;
 //BA.debugLineNum = 128319499;BA.debugLine="eventName = ID";
__ref._eventname /*String*/  = __ref._id /*String*/ ;
RDebugUtils.currentLine=128319500;
 //BA.debugLineNum = 128319500;BA.debugLine="PrimaryKey = sPrimaryKey";
__ref._primarykey /*String*/  = _sprimarykey;
RDebugUtils.currentLine=128319501;
 //BA.debugLineNum = 128319501;BA.debugLine="columnsM.Initialize";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=128319502;
 //BA.debugLineNum = 128319502;BA.debugLine="Options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=128319503;
 //BA.debugLineNum = 128319503;BA.debugLine="params.Initialize";
__ref._params /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=128319504;
 //BA.debugLineNum = 128319504;BA.debugLine="formats.Initialize";
__ref._formats /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=128319505;
 //BA.debugLineNum = 128319505;BA.debugLine="N.Initialize(\"numeral\")";
__ref._n /*com.ab.banano.BANanoObject*/ .Initialize((Object)("numeral"));
RDebugUtils.currentLine=128319507;
 //BA.debugLineNum = 128319507;BA.debugLine="ToolBar.Initialize(vue, $\"${ID}tblBar\"$, module)";
__ref._toolbar /*b4j.example.vmgrid*/ ._initialize /*b4j.example.vmgrid*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"tblBar"),_module);
RDebugUtils.currentLine=128319508;
 //BA.debugLineNum = 128319508;BA.debugLine="ToolBar.AddRows(1)";
__ref._toolbar /*b4j.example.vmgrid*/ ._addrows /*b4j.example.vmgrid*/ (null,(int) (1));
RDebugUtils.currentLine=128319509;
 //BA.debugLineNum = 128319509;BA.debugLine="ToolBar.AddColumns(2,6,6,6,6)";
__ref._toolbar /*b4j.example.vmgrid*/ ._addcolumns /*b4j.example.vmgrid*/ (null,(int) (2),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
RDebugUtils.currentLine=128319510;
 //BA.debugLineNum = 128319510;BA.debugLine="ToolBar.SetClass(1,2,\"text-right\")";
__ref._toolbar /*b4j.example.vmgrid*/ ._setclass /*String*/ (null,(int) (1),(int) (2),"text-right");
RDebugUtils.currentLine=128319511;
 //BA.debugLineNum = 128319511;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=128319512;
 //BA.debugLineNum = 128319512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _addclass(b4j.example.vmgijgotable __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=128843776;
 //BA.debugLineNum = 128843776;BA.debugLine="Sub AddClass(c As String) As VMGijgoTable";
RDebugUtils.currentLine=128843777;
 //BA.debugLineNum = 128843777;BA.debugLine="Table.AddClass(c)";
__ref._table /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=128843778;
 //BA.debugLineNum = 128843778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=128843779;
 //BA.debugLineNum = 128843779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnsortable(b4j.example.vmgijgotable __ref,String _colname,boolean _colsortable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsortable", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnsortable", new Object[] {_colname,_colsortable}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133496832;
 //BA.debugLineNum = 133496832;BA.debugLine="Sub SetColumnSortable(colName As String, colSortab";
RDebugUtils.currentLine=133496833;
 //BA.debugLineNum = 133496833;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133496834;
 //BA.debugLineNum = 133496834;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133496835;
 //BA.debugLineNum = 133496835;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133496836;
 //BA.debugLineNum = 133496836;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133496837;
 //BA.debugLineNum = 133496837;BA.debugLine="col.Put(\"sortable\", colSortable)";
_col.Put((Object)("sortable"),(Object)(_colsortable));
RDebugUtils.currentLine=133496838;
 //BA.debugLineNum = 133496838;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133496840;
 //BA.debugLineNum = 133496840;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133496841;
 //BA.debugLineNum = 133496841;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _addcolumn1(b4j.example.vmgijgotable __ref,String _colname,String _coltitle,String _coltype,int _colwidth,boolean _colsortable,String _colalign) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addcolumn1", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "addcolumn1", new Object[] {_colname,_coltitle,_coltype,_colwidth,_colsortable,_colalign}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
anywheresoftware.b4a.objects.collections.Map _events = null;
RDebugUtils.currentLine=131006464;
 //BA.debugLineNum = 131006464;BA.debugLine="Sub AddColumn1(colName As String, colTitle As Stri";
RDebugUtils.currentLine=131006466;
 //BA.debugLineNum = 131006466;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=131006467;
 //BA.debugLineNum = 131006467;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=131006468;
 //BA.debugLineNum = 131006468;BA.debugLine="Dim col As Map = CreateMap(\"field\":colName,\"title";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col = __c.createMap(new Object[] {(Object)("field"),(Object)(_colname),(Object)("title"),(Object)(_coltitle)});
RDebugUtils.currentLine=131006469;
 //BA.debugLineNum = 131006469;BA.debugLine="If colWidth > 0 Then col.Put(\"width\", colWidth)";
if (_colwidth>0) { 
_col.Put((Object)("width"),(Object)(_colwidth));};
RDebugUtils.currentLine=131006470;
 //BA.debugLineNum = 131006470;BA.debugLine="If colSortable Then	col.Put(\"sortable\", colSortab";
if (_colsortable) { 
_col.Put((Object)("sortable"),(Object)(_colsortable));};
RDebugUtils.currentLine=131006471;
 //BA.debugLineNum = 131006471;BA.debugLine="If colType <> COLUMN_NONE Then col.Put(\"type\", co";
if ((_coltype).equals(__ref._column_none /*String*/ ) == false) { 
_col.Put((Object)("type"),(Object)(_coltype));};
RDebugUtils.currentLine=131006472;
 //BA.debugLineNum = 131006472;BA.debugLine="Select Case colAlign";
switch (BA.switchObjectToInt(_colalign,__ref._align_center /*String*/ ,__ref._align_right /*String*/ )) {
case 0: 
case 1: {
RDebugUtils.currentLine=131006474;
 //BA.debugLineNum = 131006474;BA.debugLine="col.Put(\"align\", colAlign)";
_col.Put((Object)("align"),(Object)(_colalign));
 break; }
}
;
RDebugUtils.currentLine=131006476;
 //BA.debugLineNum = 131006476;BA.debugLine="col.Put(\"filterable\", True)";
_col.Put((Object)("filterable"),(Object)(__c.True));
RDebugUtils.currentLine=131006477;
 //BA.debugLineNum = 131006477;BA.debugLine="Dim events As Map";
_events = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=131006478;
 //BA.debugLineNum = 131006478;BA.debugLine="events.Initialize";
_events.Initialize();
RDebugUtils.currentLine=131006479;
 //BA.debugLineNum = 131006479;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
RDebugUtils.currentLine=131006480;
 //BA.debugLineNum = 131006480;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
RDebugUtils.currentLine=131006481;
 //BA.debugLineNum = 131006481;BA.debugLine="SetColumnType(colName, colType)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_colname,_coltype);
RDebugUtils.currentLine=131006482;
 //BA.debugLineNum = 131006482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=131006483;
 //BA.debugLineNum = 131006483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumntype(b4j.example.vmgijgotable __ref,String _colname,String _coltype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumntype", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumntype", new Object[] {_colname,_coltype}));}
anywheresoftware.b4a.objects.collections.Map _value = null;
anywheresoftware.b4a.objects.collections.Map _record = null;
anywheresoftware.b4a.objects.collections.Map _cell = null;
anywheresoftware.b4a.objects.collections.Map _displayel = null;
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=131989504;
 //BA.debugLineNum = 131989504;BA.debugLine="Sub SetColumnType(colName As String, colType As St";
RDebugUtils.currentLine=131989505;
 //BA.debugLineNum = 131989505;BA.debugLine="Dim value, record, cell, displayEl As Map";
_value = new anywheresoftware.b4a.objects.collections.Map();
_record = new anywheresoftware.b4a.objects.collections.Map();
_cell = new anywheresoftware.b4a.objects.collections.Map();
_displayel = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=131989506;
 //BA.debugLineNum = 131989506;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=131989507;
 //BA.debugLineNum = 131989507;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=131989509;
 //BA.debugLineNum = 131989509;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=131989510;
 //BA.debugLineNum = 131989510;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=131989511;
 //BA.debugLineNum = 131989511;BA.debugLine="col.Put(\"type\", colType)";
_col.Put((Object)("type"),(Object)(_coltype));
RDebugUtils.currentLine=131989512;
 //BA.debugLineNum = 131989512;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,__ref._column_image /*String*/ ,__ref._column_money /*String*/ ,__ref._column_filesize /*String*/ ,__ref._column_date /*String*/ ,__ref._column_time /*String*/ ,__ref._column_datetime /*String*/ ,__ref._column_iconrender /*String*/ )) {
case 0: {
RDebugUtils.currentLine=131989514;
 //BA.debugLineNum = 131989514;BA.debugLine="col.Put(\"type\", \"text\")";
_col.Put((Object)("type"),(Object)("text"));
RDebugUtils.currentLine=131989515;
 //BA.debugLineNum = 131989515;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"imager";
_col.Put((Object)("renderer"),__ref._banano /*com.ab.banano.BANano*/ .CallBack(this,"imagerender",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
 break; }
case 1: {
RDebugUtils.currentLine=131989517;
 //BA.debugLineNum = 131989517;BA.debugLine="col.Put(\"type\", \"text\")";
_col.Put((Object)("type"),(Object)("text"));
RDebugUtils.currentLine=131989518;
 //BA.debugLineNum = 131989518;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"moneyr";
_col.Put((Object)("renderer"),__ref._banano /*com.ab.banano.BANano*/ .CallBack(this,"moneyrender",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
RDebugUtils.currentLine=131989519;
 //BA.debugLineNum = 131989519;BA.debugLine="col.Put(\"align\", ALIGN_RIGHT)";
_col.Put((Object)("align"),(Object)(__ref._align_right /*String*/ ));
 break; }
case 2: {
RDebugUtils.currentLine=131989521;
 //BA.debugLineNum = 131989521;BA.debugLine="col.Put(\"type\", \"text\")";
_col.Put((Object)("type"),(Object)("text"));
RDebugUtils.currentLine=131989522;
 //BA.debugLineNum = 131989522;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"filere";
_col.Put((Object)("renderer"),__ref._banano /*com.ab.banano.BANano*/ .CallBack(this,"filerender",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
RDebugUtils.currentLine=131989523;
 //BA.debugLineNum = 131989523;BA.debugLine="col.Put(\"align\", ALIGN_RIGHT)";
_col.Put((Object)("align"),(Object)(__ref._align_right /*String*/ ));
 break; }
case 3: {
RDebugUtils.currentLine=131989525;
 //BA.debugLineNum = 131989525;BA.debugLine="col.Put(\"format\", \"yyyy-mm-dd\")";
_col.Put((Object)("format"),(Object)("yyyy-mm-dd"));
 break; }
case 4: {
RDebugUtils.currentLine=131989527;
 //BA.debugLineNum = 131989527;BA.debugLine="col.Put(\"format\", \"HH:MM\")";
_col.Put((Object)("format"),(Object)("HH:MM"));
 break; }
case 5: {
RDebugUtils.currentLine=131989529;
 //BA.debugLineNum = 131989529;BA.debugLine="col.Put(\"format\", \"yyyy-mm-dd HH:MM\")";
_col.Put((Object)("format"),(Object)("yyyy-mm-dd HH:MM"));
 break; }
case 6: {
RDebugUtils.currentLine=131989531;
 //BA.debugLineNum = 131989531;BA.debugLine="col.Put(\"type\", \"text\")";
_col.Put((Object)("type"),(Object)("text"));
RDebugUtils.currentLine=131989532;
 //BA.debugLineNum = 131989532;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"iconre";
_col.Put((Object)("renderer"),__ref._banano /*com.ab.banano.BANano*/ .CallBack(this,"iconrender",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
 break; }
}
;
RDebugUtils.currentLine=131989534;
 //BA.debugLineNum = 131989534;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=131989536;
 //BA.debugLineNum = 131989536;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=131989537;
 //BA.debugLineNum = 131989537;BA.debugLine="End Sub";
return null;
}
public String  _addcolumns(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.Map _flds) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addcolumns", true))
	 {return ((String) Debug.delegate(ba, "addcolumns", new Object[] {_flds}));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=131465216;
 //BA.debugLineNum = 131465216;BA.debugLine="Sub AddColumns(flds As Map)";
RDebugUtils.currentLine=131465217;
 //BA.debugLineNum = 131465217;BA.debugLine="For Each k As String In flds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flds.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=131465218;
 //BA.debugLineNum = 131465218;BA.debugLine="Dim v As String = flds.Get(k)";
_v = BA.ObjectToString(_flds.Get((Object)(_k)));
RDebugUtils.currentLine=131465219;
 //BA.debugLineNum = 131465219;BA.debugLine="AddColumn(k, v)";
__ref._addcolumn /*b4j.example.vmgijgotable*/ (null,_k,_v);
RDebugUtils.currentLine=131465220;
 //BA.debugLineNum = 131465220;BA.debugLine="SetColumnSortable(k, True)";
__ref._setcolumnsortable /*b4j.example.vmgijgotable*/ (null,_k,__c.True);
 }
};
RDebugUtils.currentLine=131465222;
 //BA.debugLineNum = 131465222;BA.debugLine="End Sub";
return "";
}
public String  _adddelete(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "adddelete", true))
	 {return ((String) Debug.delegate(ba, "adddelete", null));}
RDebugUtils.currentLine=131268608;
 //BA.debugLineNum = 131268608;BA.debugLine="Sub AddDelete";
RDebugUtils.currentLine=131268609;
 //BA.debugLineNum = 131268609;BA.debugLine="AddIconDelete(\"delete\", \"Delete\")";
__ref._addicondelete /*String*/ (null,"delete","Delete");
RDebugUtils.currentLine=131268610;
 //BA.debugLineNum = 131268610;BA.debugLine="SetColumnClickEvent(\"delete\", True)";
__ref._setcolumnclickevent /*String*/ (null,"delete",__c.True);
RDebugUtils.currentLine=131268611;
 //BA.debugLineNum = 131268611;BA.debugLine="End Sub";
return "";
}
public String  _addicondelete(b4j.example.vmgijgotable __ref,String _colfield,String _coltitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addicondelete", true))
	 {return ((String) Debug.delegate(ba, "addicondelete", new Object[] {_colfield,_coltitle}));}
String _delicon = "";
RDebugUtils.currentLine=131530752;
 //BA.debugLineNum = 131530752;BA.debugLine="Sub AddIconDelete(colField As String, colTitle As";
RDebugUtils.currentLine=131530753;
 //BA.debugLineNum = 131530753;BA.debugLine="Dim DelIcon As String";
_delicon = "";
RDebugUtils.currentLine=131530754;
 //BA.debugLineNum = 131530754;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(__ref._iconslibrary /*String*/ ,"materialicons","fontawesome")) {
case 0: {
RDebugUtils.currentLine=131530756;
 //BA.debugLineNum = 131530756;BA.debugLine="DelIcon = $\"<span class=\"material-icons gj-curs";
_delicon = ("<span class=\"material-icons gj-cursor-pointer\">delete</span>");
 break; }
case 1: {
RDebugUtils.currentLine=131530758;
 //BA.debugLineNum = 131530758;BA.debugLine="DelIcon = $\"<span class=\"fa fa-remove gj-cursor";
_delicon = ("<span class=\"fa fa-remove gj-cursor-pointer\"></span>");
 break; }
}
;
RDebugUtils.currentLine=131530760;
 //BA.debugLineNum = 131530760;BA.debugLine="AddColumn(colField,colTitle)";
__ref._addcolumn /*b4j.example.vmgijgotable*/ (null,_colfield,_coltitle);
RDebugUtils.currentLine=131530761;
 //BA.debugLineNum = 131530761;BA.debugLine="SetColumnTmpl(colField,DelIcon)";
__ref._setcolumntmpl /*b4j.example.vmgijgotable*/ (null,_colfield,_delicon);
RDebugUtils.currentLine=131530762;
 //BA.debugLineNum = 131530762;BA.debugLine="SetColumnFilterable(colField,False)";
__ref._setcolumnfilterable /*b4j.example.vmgijgotable*/ (null,_colfield,__c.False);
RDebugUtils.currentLine=131530763;
 //BA.debugLineNum = 131530763;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_colfield,__ref._column_none /*String*/ );
RDebugUtils.currentLine=131530764;
 //BA.debugLineNum = 131530764;BA.debugLine="SetColumnWidth(colField, \"80\")";
__ref._setcolumnwidth /*b4j.example.vmgijgotable*/ (null,_colfield,"80");
RDebugUtils.currentLine=131530765;
 //BA.debugLineNum = 131530765;BA.debugLine="SetColumnSortable(colField, False)";
__ref._setcolumnsortable /*b4j.example.vmgijgotable*/ (null,_colfield,__c.False);
RDebugUtils.currentLine=131530766;
 //BA.debugLineNum = 131530766;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
__ref._setcolumnalignment /*b4j.example.vmgijgotable*/ (null,_colfield,__ref._align_center /*String*/ );
RDebugUtils.currentLine=131530767;
 //BA.debugLineNum = 131530767;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnclickevent(b4j.example.vmgijgotable __ref,String _colfield,boolean _stoppropagation) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnclickevent", true))
	 {return ((String) Debug.delegate(ba, "setcolumnclickevent", new Object[] {_colfield,_stoppropagation}));}
anywheresoftware.b4a.objects.collections.Map _e = null;
anywheresoftware.b4a.objects.collections.Map _col = null;
anywheresoftware.b4a.objects.collections.Map _events = null;
RDebugUtils.currentLine=132317184;
 //BA.debugLineNum = 132317184;BA.debugLine="Sub SetColumnClickEvent(colField As String, stopPr";
RDebugUtils.currentLine=132317185;
 //BA.debugLineNum = 132317185;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
RDebugUtils.currentLine=132317186;
 //BA.debugLineNum = 132317186;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
RDebugUtils.currentLine=132317187;
 //BA.debugLineNum = 132317187;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colfield))) { 
RDebugUtils.currentLine=132317188;
 //BA.debugLineNum = 132317188;BA.debugLine="Dim e As Map";
_e = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=132317189;
 //BA.debugLineNum = 132317189;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colfield))));
RDebugUtils.currentLine=132317190;
 //BA.debugLineNum = 132317190;BA.debugLine="If col.ContainsKey(\"events\") = False Then";
if (_col.ContainsKey((Object)("events"))==__c.False) { 
RDebugUtils.currentLine=132317191;
 //BA.debugLineNum = 132317191;BA.debugLine="Dim events As Map = CreateMap()";
_events = new anywheresoftware.b4a.objects.collections.Map();
_events = __c.createMap(new Object[] {});
RDebugUtils.currentLine=132317192;
 //BA.debugLineNum = 132317192;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
 };
RDebugUtils.currentLine=132317194;
 //BA.debugLineNum = 132317194;BA.debugLine="Dim events As Map = col.Get(\"events\")";
_events = new anywheresoftware.b4a.objects.collections.Map();
_events.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_col.Get((Object)("events"))));
RDebugUtils.currentLine=132317195;
 //BA.debugLineNum = 132317195;BA.debugLine="If stopPropagation Then col.Put(\"stopPropagation";
if (_stoppropagation) { 
_col.Put((Object)("stopPropagation"),(Object)(_stoppropagation));};
RDebugUtils.currentLine=132317196;
 //BA.debugLineNum = 132317196;BA.debugLine="events.Put(\"click\", Banano.CallBack(mCallBack, e";
_events.Put((Object)("click"),__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._mcallback /*Object*/ ,__ref._eventname /*String*/ +("_"+__c.SmartStringFormatter("",(Object)(_colfield))+""),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e.getObject())})));
RDebugUtils.currentLine=132317197;
 //BA.debugLineNum = 132317197;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
RDebugUtils.currentLine=132317198;
 //BA.debugLineNum = 132317198;BA.debugLine="columnsM.Put(colField,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colfield),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=132317200;
 //BA.debugLineNum = 132317200;BA.debugLine="End Sub";
return "";
}
public String  _adddownload(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "adddownload", true))
	 {return ((String) Debug.delegate(ba, "adddownload", null));}
RDebugUtils.currentLine=128385024;
 //BA.debugLineNum = 128385024;BA.debugLine="Sub AddDownload";
RDebugUtils.currentLine=128385025;
 //BA.debugLineNum = 128385025;BA.debugLine="AddIcon(\"download\",\"Get\",\"attach_file\",\"80\")";
__ref._addicon /*String*/ (null,"download","Get","attach_file","80");
RDebugUtils.currentLine=128385026;
 //BA.debugLineNum = 128385026;BA.debugLine="SetColumnClickEvent(\"download\", True)";
__ref._setcolumnclickevent /*String*/ (null,"download",__c.True);
RDebugUtils.currentLine=128385027;
 //BA.debugLineNum = 128385027;BA.debugLine="End Sub";
return "";
}
public String  _addicon(b4j.example.vmgijgotable __ref,String _colfield,String _coltitle,String _colicon,String _colwidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addicon", true))
	 {return ((String) Debug.delegate(ba, "addicon", new Object[] {_colfield,_coltitle,_colicon,_colwidth}));}
String _sicon = "";
RDebugUtils.currentLine=131072000;
 //BA.debugLineNum = 131072000;BA.debugLine="Sub AddIcon(colField As String, colTitle As String";
RDebugUtils.currentLine=131072001;
 //BA.debugLineNum = 131072001;BA.debugLine="Dim sIcon As String";
_sicon = "";
RDebugUtils.currentLine=131072002;
 //BA.debugLineNum = 131072002;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(__ref._iconslibrary /*String*/ ,"materialicons","fontawesome")) {
case 0: {
RDebugUtils.currentLine=131072004;
 //BA.debugLineNum = 131072004;BA.debugLine="sIcon = $\"<span class=\"material-icons gj-cursor";
_sicon = ("<span class=\"material-icons gj-cursor-pointer\">"+__c.SmartStringFormatter("",(Object)(_colicon))+"</span>");
 break; }
case 1: {
RDebugUtils.currentLine=131072006;
 //BA.debugLineNum = 131072006;BA.debugLine="sIcon = $\"<span class=\"${colIcon} gj-cursor-poi";
_sicon = ("<span class=\""+__c.SmartStringFormatter("",(Object)(_colicon))+" gj-cursor-pointer\"></span>");
 break; }
}
;
RDebugUtils.currentLine=131072008;
 //BA.debugLineNum = 131072008;BA.debugLine="AddColumn(colField,colTitle)";
__ref._addcolumn /*b4j.example.vmgijgotable*/ (null,_colfield,_coltitle);
RDebugUtils.currentLine=131072009;
 //BA.debugLineNum = 131072009;BA.debugLine="SetColumnTmpl(colField,sIcon)";
__ref._setcolumntmpl /*b4j.example.vmgijgotable*/ (null,_colfield,_sicon);
RDebugUtils.currentLine=131072010;
 //BA.debugLineNum = 131072010;BA.debugLine="SetColumnFilterable(colField,False)";
__ref._setcolumnfilterable /*b4j.example.vmgijgotable*/ (null,_colfield,__c.False);
RDebugUtils.currentLine=131072011;
 //BA.debugLineNum = 131072011;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_colfield,__ref._column_none /*String*/ );
RDebugUtils.currentLine=131072012;
 //BA.debugLineNum = 131072012;BA.debugLine="SetColumnWidth(colField, colWidth)";
__ref._setcolumnwidth /*b4j.example.vmgijgotable*/ (null,_colfield,_colwidth);
RDebugUtils.currentLine=131072013;
 //BA.debugLineNum = 131072013;BA.debugLine="SetColumnSortable(colField, False)";
__ref._setcolumnsortable /*b4j.example.vmgijgotable*/ (null,_colfield,__c.False);
RDebugUtils.currentLine=131072014;
 //BA.debugLineNum = 131072014;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
__ref._setcolumnalignment /*b4j.example.vmgijgotable*/ (null,_colfield,__ref._align_center /*String*/ );
RDebugUtils.currentLine=131072015;
 //BA.debugLineNum = 131072015;BA.debugLine="End Sub";
return "";
}
public String  _addedit(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addedit", true))
	 {return ((String) Debug.delegate(ba, "addedit", null));}
RDebugUtils.currentLine=131334144;
 //BA.debugLineNum = 131334144;BA.debugLine="Sub AddEdit";
RDebugUtils.currentLine=131334145;
 //BA.debugLineNum = 131334145;BA.debugLine="AddIconEdit(\"edit\", \"Edit\")";
__ref._addiconedit /*String*/ (null,"edit","Edit");
RDebugUtils.currentLine=131334146;
 //BA.debugLineNum = 131334146;BA.debugLine="SetColumnClickEvent(\"edit\", True)";
__ref._setcolumnclickevent /*String*/ (null,"edit",__c.True);
RDebugUtils.currentLine=131334147;
 //BA.debugLineNum = 131334147;BA.debugLine="End Sub";
return "";
}
public String  _addiconedit(b4j.example.vmgijgotable __ref,String _colfield,String _coltitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addiconedit", true))
	 {return ((String) Debug.delegate(ba, "addiconedit", new Object[] {_colfield,_coltitle}));}
String _editicon = "";
RDebugUtils.currentLine=131137536;
 //BA.debugLineNum = 131137536;BA.debugLine="Sub AddIconEdit(colField As String, colTitle As St";
RDebugUtils.currentLine=131137537;
 //BA.debugLineNum = 131137537;BA.debugLine="Dim EditIcon As String";
_editicon = "";
RDebugUtils.currentLine=131137538;
 //BA.debugLineNum = 131137538;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(__ref._iconslibrary /*String*/ ,"materialicons","fontawesome")) {
case 0: {
RDebugUtils.currentLine=131137540;
 //BA.debugLineNum = 131137540;BA.debugLine="EditIcon = $\"<span class=\"material-icons gj-cur";
_editicon = ("<span class=\"material-icons gj-cursor-pointer\">edit</span>");
 break; }
case 1: {
RDebugUtils.currentLine=131137542;
 //BA.debugLineNum = 131137542;BA.debugLine="EditIcon = $\"<span class=\"fa fa-pencil gj-curso";
_editicon = ("<span class=\"fa fa-pencil gj-cursor-pointer\"></span>");
 break; }
}
;
RDebugUtils.currentLine=131137544;
 //BA.debugLineNum = 131137544;BA.debugLine="AddColumn(colField,colTitle)";
__ref._addcolumn /*b4j.example.vmgijgotable*/ (null,_colfield,_coltitle);
RDebugUtils.currentLine=131137545;
 //BA.debugLineNum = 131137545;BA.debugLine="SetColumnTmpl(colField,EditIcon)";
__ref._setcolumntmpl /*b4j.example.vmgijgotable*/ (null,_colfield,_editicon);
RDebugUtils.currentLine=131137546;
 //BA.debugLineNum = 131137546;BA.debugLine="SetColumnFilterable(colField,False)";
__ref._setcolumnfilterable /*b4j.example.vmgijgotable*/ (null,_colfield,__c.False);
RDebugUtils.currentLine=131137547;
 //BA.debugLineNum = 131137547;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_colfield,__ref._column_none /*String*/ );
RDebugUtils.currentLine=131137548;
 //BA.debugLineNum = 131137548;BA.debugLine="SetColumnWidth(colField, \"80\")";
__ref._setcolumnwidth /*b4j.example.vmgijgotable*/ (null,_colfield,"80");
RDebugUtils.currentLine=131137549;
 //BA.debugLineNum = 131137549;BA.debugLine="SetColumnSortable(colField, False)";
__ref._setcolumnsortable /*b4j.example.vmgijgotable*/ (null,_colfield,__c.False);
RDebugUtils.currentLine=131137550;
 //BA.debugLineNum = 131137550;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
__ref._setcolumnalignment /*b4j.example.vmgijgotable*/ (null,_colfield,__ref._align_center /*String*/ );
RDebugUtils.currentLine=131137551;
 //BA.debugLineNum = 131137551;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setcolumntmpl(b4j.example.vmgijgotable __ref,String _colname,String _coltmpl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumntmpl", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumntmpl", new Object[] {_colname,_coltmpl}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=131923968;
 //BA.debugLineNum = 131923968;BA.debugLine="Sub SetColumnTmpl(colName As String, coltmpl As St";
RDebugUtils.currentLine=131923969;
 //BA.debugLineNum = 131923969;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=131923970;
 //BA.debugLineNum = 131923970;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=131923971;
 //BA.debugLineNum = 131923971;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=131923972;
 //BA.debugLineNum = 131923972;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=131923973;
 //BA.debugLineNum = 131923973;BA.debugLine="col.Put(\"tmpl\", coltmpl)";
_col.Put((Object)("tmpl"),(Object)(_coltmpl));
RDebugUtils.currentLine=131923974;
 //BA.debugLineNum = 131923974;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=131923976;
 //BA.debugLineNum = 131923976;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=131923977;
 //BA.debugLineNum = 131923977;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnfilterable(b4j.example.vmgijgotable __ref,String _colname,boolean _colfilter) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnfilterable", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnfilterable", new Object[] {_colname,_colfilter}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133890048;
 //BA.debugLineNum = 133890048;BA.debugLine="Sub SetColumnFilterable(colName As String, colFilt";
RDebugUtils.currentLine=133890049;
 //BA.debugLineNum = 133890049;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133890050;
 //BA.debugLineNum = 133890050;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133890052;
 //BA.debugLineNum = 133890052;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133890053;
 //BA.debugLineNum = 133890053;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133890054;
 //BA.debugLineNum = 133890054;BA.debugLine="col.Put(\"filterable\", colFilter)";
_col.Put((Object)("filterable"),(Object)(_colfilter));
RDebugUtils.currentLine=133890055;
 //BA.debugLineNum = 133890055;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133890057;
 //BA.debugLineNum = 133890057;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133890058;
 //BA.debugLineNum = 133890058;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnwidth(b4j.example.vmgijgotable __ref,String _colname,String _colwidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnwidth", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnwidth", new Object[] {_colname,_colwidth}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=131661824;
 //BA.debugLineNum = 131661824;BA.debugLine="Sub SetColumnWidth(colName As String, colWidth As";
RDebugUtils.currentLine=131661825;
 //BA.debugLineNum = 131661825;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=131661826;
 //BA.debugLineNum = 131661826;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=131661827;
 //BA.debugLineNum = 131661827;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=131661828;
 //BA.debugLineNum = 131661828;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=131661829;
 //BA.debugLineNum = 131661829;BA.debugLine="col.Put(\"width\", colWidth)";
_col.Put((Object)("width"),(Object)(_colwidth));
RDebugUtils.currentLine=131661830;
 //BA.debugLineNum = 131661830;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=131661832;
 //BA.debugLineNum = 131661832;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=131661833;
 //BA.debugLineNum = 131661833;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnalignment(b4j.example.vmgijgotable __ref,String _colname,String _colalign) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnalignment", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnalignment", new Object[] {_colname,_colalign}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=131727360;
 //BA.debugLineNum = 131727360;BA.debugLine="Sub SetColumnAlignment(colName As String, colAlign";
RDebugUtils.currentLine=131727361;
 //BA.debugLineNum = 131727361;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=131727362;
 //BA.debugLineNum = 131727362;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=131727363;
 //BA.debugLineNum = 131727363;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=131727364;
 //BA.debugLineNum = 131727364;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=131727365;
 //BA.debugLineNum = 131727365;BA.debugLine="Select Case colAlign";
switch (BA.switchObjectToInt(_colalign,__ref._align_center /*String*/ ,__ref._align_right /*String*/ )) {
case 0: 
case 1: {
RDebugUtils.currentLine=131727367;
 //BA.debugLineNum = 131727367;BA.debugLine="col.Put(\"align\", colAlign)";
_col.Put((Object)("align"),(Object)(_colalign));
RDebugUtils.currentLine=131727368;
 //BA.debugLineNum = 131727368;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 break; }
}
;
 };
RDebugUtils.currentLine=131727371;
 //BA.debugLineNum = 131727371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=131727372;
 //BA.debugLineNum = 131727372;BA.debugLine="End Sub";
return null;
}
public String  _addparamater(b4j.example.vmgijgotable __ref,String _paramname,String _paramvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addparamater", true))
	 {return ((String) Debug.delegate(ba, "addparamater", new Object[] {_paramname,_paramvalue}));}
RDebugUtils.currentLine=129171456;
 //BA.debugLineNum = 129171456;BA.debugLine="Sub AddParamater(paramName As String, paramValue A";
RDebugUtils.currentLine=129171457;
 //BA.debugLineNum = 129171457;BA.debugLine="params.Put(paramName,paramValue)";
__ref._params /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_paramname),(Object)(_paramvalue));
RDebugUtils.currentLine=129171458;
 //BA.debugLineNum = 129171458;BA.debugLine="End Sub";
return "";
}
public String  _addprint(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addprint", true))
	 {return ((String) Debug.delegate(ba, "addprint", null));}
RDebugUtils.currentLine=131399680;
 //BA.debugLineNum = 131399680;BA.debugLine="Sub AddPrint";
RDebugUtils.currentLine=131399681;
 //BA.debugLineNum = 131399681;BA.debugLine="AddIcon(\"print\", \"Print\", \"print\", 80)";
__ref._addicon /*String*/ (null,"print","Print","print",BA.NumberToString(80));
RDebugUtils.currentLine=131399682;
 //BA.debugLineNum = 131399682;BA.debugLine="SetColumnClickEvent(\"print\", True)";
__ref._setcolumnclickevent /*String*/ (null,"print",__c.True);
RDebugUtils.currentLine=131399683;
 //BA.debugLineNum = 131399683;BA.debugLine="End Sub";
return "";
}
public String  _addrow(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.Map _rowdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addrow", true))
	 {return ((String) Debug.delegate(ba, "addrow", new Object[] {_rowdata}));}
RDebugUtils.currentLine=133562368;
 //BA.debugLineNum = 133562368;BA.debugLine="Sub AddRow(rowData As Map)";
RDebugUtils.currentLine=133562369;
 //BA.debugLineNum = 133562369;BA.debugLine="If grid = Null Then Refresh";
if (__ref._grid /*com.ab.banano.BANanoObject*/ == null) { 
__ref._refresh /*b4j.example.vmgijgotable*/ (null);};
RDebugUtils.currentLine=133562370;
 //BA.debugLineNum = 133562370;BA.debugLine="grid.RunMethod(\"addRow\", Array(rowData))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("addRow",(Object)(new Object[]{(Object)(_rowdata.getObject())}));
RDebugUtils.currentLine=133562371;
 //BA.debugLineNum = 133562371;BA.debugLine="End Sub";
return "";
}
public String  _addtemplate(b4j.example.vmgijgotable __ref,String _colfield,String _coltitle,String _coltemplate,String _colwidth,boolean _colsortable,String _colalign) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "addtemplate", true))
	 {return ((String) Debug.delegate(ba, "addtemplate", new Object[] {_colfield,_coltitle,_coltemplate,_colwidth,_colsortable,_colalign}));}
RDebugUtils.currentLine=131596288;
 //BA.debugLineNum = 131596288;BA.debugLine="Sub AddTemplate(colField As String, colTitle As St";
RDebugUtils.currentLine=131596289;
 //BA.debugLineNum = 131596289;BA.debugLine="AddColumn(colField,colTitle)";
__ref._addcolumn /*b4j.example.vmgijgotable*/ (null,_colfield,_coltitle);
RDebugUtils.currentLine=131596290;
 //BA.debugLineNum = 131596290;BA.debugLine="SetColumnTmpl(colField,colTemplate)";
__ref._setcolumntmpl /*b4j.example.vmgijgotable*/ (null,_colfield,_coltemplate);
RDebugUtils.currentLine=131596291;
 //BA.debugLineNum = 131596291;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_colfield,__ref._column_none /*String*/ );
RDebugUtils.currentLine=131596292;
 //BA.debugLineNum = 131596292;BA.debugLine="SetColumnWidth(colField, colWidth)";
__ref._setcolumnwidth /*b4j.example.vmgijgotable*/ (null,_colfield,_colwidth);
RDebugUtils.currentLine=131596293;
 //BA.debugLineNum = 131596293;BA.debugLine="SetColumnSortable(colField, colSortable)";
__ref._setcolumnsortable /*b4j.example.vmgijgotable*/ (null,_colfield,_colsortable);
RDebugUtils.currentLine=131596294;
 //BA.debugLineNum = 131596294;BA.debugLine="SetColumnAlignment(colField, colAlign)";
__ref._setcolumnalignment /*b4j.example.vmgijgotable*/ (null,_colfield,_colalign);
RDebugUtils.currentLine=131596295;
 //BA.debugLineNum = 131596295;BA.debugLine="End Sub";
return "";
}
public String  _cancel(b4j.example.vmgijgotable __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "cancel", true))
	 {return ((String) Debug.delegate(ba, "cancel", new Object[] {_pk}));}
RDebugUtils.currentLine=129236992;
 //BA.debugLineNum = 129236992;BA.debugLine="Sub Cancel(pk As String)";
RDebugUtils.currentLine=129236993;
 //BA.debugLineNum = 129236993;BA.debugLine="grid.RunMethod(\"cancel\", Array(pk))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("cancel",(Object)(new Object[]{(Object)(_pk)}));
RDebugUtils.currentLine=129236994;
 //BA.debugLineNum = 129236994;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
RDebugUtils.currentLine=128253952;
 //BA.debugLineNum = 128253952;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=128253953;
 //BA.debugLineNum = 128253953;BA.debugLine="Public Table As VMElement";
_table = new b4j.example.vmelement();
RDebugUtils.currentLine=128253954;
 //BA.debugLineNum = 128253954;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=128253955;
 //BA.debugLineNum = 128253955;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=128253956;
 //BA.debugLineNum = 128253956;BA.debugLine="Public InlineEditing As Boolean = False";
_inlineediting = __c.False;
RDebugUtils.currentLine=128253957;
 //BA.debugLineNum = 128253957;BA.debugLine="Public InlineEditingMode As String = \"click\"";
_inlineeditingmode = "click";
RDebugUtils.currentLine=128253958;
 //BA.debugLineNum = 128253958;BA.debugLine="Public InlineEditingManagementColumn As Boolean =";
_inlineeditingmanagementcolumn = __c.True;
RDebugUtils.currentLine=128253959;
 //BA.debugLineNum = 128253959;BA.debugLine="Public Width As String = 0";
_width = BA.NumberToString(0);
RDebugUtils.currentLine=128253960;
 //BA.debugLineNum = 128253960;BA.debugLine="Private grid As BANanoObject";
_grid = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=128253961;
 //BA.debugLineNum = 128253961;BA.debugLine="Public PrimaryKey As String = \"id\"";
_primarykey = "id";
RDebugUtils.currentLine=128253962;
 //BA.debugLineNum = 128253962;BA.debugLine="Public PagerLimit As Int = 10";
_pagerlimit = (int) (10);
RDebugUtils.currentLine=128253963;
 //BA.debugLineNum = 128253963;BA.debugLine="Private Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=128253965;
 //BA.debugLineNum = 128253965;BA.debugLine="Public COLUMN_DATE As String = \"date\"";
_column_date = "date";
RDebugUtils.currentLine=128253966;
 //BA.debugLineNum = 128253966;BA.debugLine="Public COLUMN_TEXT As String = \"text\"";
_column_text = "text";
RDebugUtils.currentLine=128253967;
 //BA.debugLineNum = 128253967;BA.debugLine="Public COLUMN_ICON As String = \"icon\"";
_column_icon = "icon";
RDebugUtils.currentLine=128253968;
 //BA.debugLineNum = 128253968;BA.debugLine="Public COLUMN_CHECKBOX As String = \"checkbox\"";
_column_checkbox = "checkbox";
RDebugUtils.currentLine=128253969;
 //BA.debugLineNum = 128253969;BA.debugLine="Public COLUMN_DROPDOWN As String = \"dropdown\"";
_column_dropdown = "dropdown";
RDebugUtils.currentLine=128253970;
 //BA.debugLineNum = 128253970;BA.debugLine="Public COLUMN_NONE As String = \"\"";
_column_none = "";
RDebugUtils.currentLine=128253971;
 //BA.debugLineNum = 128253971;BA.debugLine="Public COLUMN_TIME As String = \"time\"";
_column_time = "time";
RDebugUtils.currentLine=128253972;
 //BA.debugLineNum = 128253972;BA.debugLine="Public COLUMN_DATETIME As String = \"datetime\"";
_column_datetime = "datetime";
RDebugUtils.currentLine=128253973;
 //BA.debugLineNum = 128253973;BA.debugLine="Public COLUMN_IMAGE As String = \"image\"";
_column_image = "image";
RDebugUtils.currentLine=128253974;
 //BA.debugLineNum = 128253974;BA.debugLine="Public COLUMN_MONEY As String = \"money\"";
_column_money = "money";
RDebugUtils.currentLine=128253975;
 //BA.debugLineNum = 128253975;BA.debugLine="Public COLUMN_FILESIZE As String = \"filesize\"";
_column_filesize = "filesize";
RDebugUtils.currentLine=128253976;
 //BA.debugLineNum = 128253976;BA.debugLine="Public COLUMN_ICONRENDER As String = \"iconrender\"";
_column_iconrender = "iconrender";
RDebugUtils.currentLine=128253979;
 //BA.debugLineNum = 128253979;BA.debugLine="Public ALIGN_CENTER As String = \"center\"";
_align_center = "center";
RDebugUtils.currentLine=128253980;
 //BA.debugLineNum = 128253980;BA.debugLine="Public ALIGN_RIGHT As String = \"right\"";
_align_right = "right";
RDebugUtils.currentLine=128253981;
 //BA.debugLineNum = 128253981;BA.debugLine="Public ALIGN_LEFT As String = \"left\"";
_align_left = "left";
RDebugUtils.currentLine=128253982;
 //BA.debugLineNum = 128253982;BA.debugLine="Public autoGenerateColumns As Boolean = False";
_autogeneratecolumns = __c.False;
RDebugUtils.currentLine=128253983;
 //BA.debugLineNum = 128253983;BA.debugLine="Public autoLoad As Boolean = True";
_autoload = __c.True;
RDebugUtils.currentLine=128253984;
 //BA.debugLineNum = 128253984;BA.debugLine="Public BodyRowHeight As String = \"fixed\"";
_bodyrowheight = "fixed";
RDebugUtils.currentLine=128253985;
 //BA.debugLineNum = 128253985;BA.debugLine="Private columnsM As Map";
_columnsm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=128253986;
 //BA.debugLineNum = 128253986;BA.debugLine="Public SelectionType As String = \"single\"";
_selectiontype = "single";
RDebugUtils.currentLine=128253987;
 //BA.debugLineNum = 128253987;BA.debugLine="Public ColumnReorder As Boolean = True";
_columnreorder = __c.True;
RDebugUtils.currentLine=128253988;
 //BA.debugLineNum = 128253988;BA.debugLine="Public DetailTemplate As String = \"\"";
_detailtemplate = "";
RDebugUtils.currentLine=128253989;
 //BA.debugLineNum = 128253989;BA.debugLine="Public KeepExpandedRows As Boolean = False";
_keepexpandedrows = __c.False;
RDebugUtils.currentLine=128253990;
 //BA.debugLineNum = 128253990;BA.debugLine="Public FixedHeader As Boolean = False";
_fixedheader = __c.False;
RDebugUtils.currentLine=128253991;
 //BA.debugLineNum = 128253991;BA.debugLine="Public HeaderFilter As Boolean = True";
_headerfilter = __c.True;
RDebugUtils.currentLine=128253992;
 //BA.debugLineNum = 128253992;BA.debugLine="Public HeaderFilterType As String = \"onchange\"";
_headerfiltertype = "onchange";
RDebugUtils.currentLine=128253993;
 //BA.debugLineNum = 128253993;BA.debugLine="Public ResizableColumns As Boolean = True";
_resizablecolumns = __c.True;
RDebugUtils.currentLine=128253994;
 //BA.debugLineNum = 128253994;BA.debugLine="Public ShowHiddenColumnsAsDetails As Boolean = Fa";
_showhiddencolumnsasdetails = __c.False;
RDebugUtils.currentLine=128253995;
 //BA.debugLineNum = 128253995;BA.debugLine="Private ExpandIcon As String = \"\"";
_expandicon = "";
RDebugUtils.currentLine=128253996;
 //BA.debugLineNum = 128253996;BA.debugLine="Private CollapseIcon As String = \"\"";
_collapseicon = "";
RDebugUtils.currentLine=128253997;
 //BA.debugLineNum = 128253997;BA.debugLine="Public RowReorder As Boolean = False";
_rowreorder = __c.False;
RDebugUtils.currentLine=128253998;
 //BA.debugLineNum = 128253998;BA.debugLine="Public SelectionMethod As String = \"basic\"";
_selectionmethod = "basic";
RDebugUtils.currentLine=128253999;
 //BA.debugLineNum = 128253999;BA.debugLine="Public IconsLibrary As String = \"materialicons\"";
_iconslibrary = "materialicons";
RDebugUtils.currentLine=128254000;
 //BA.debugLineNum = 128254000;BA.debugLine="Public MinWidth As Int = 0";
_minwidth = (int) (0);
RDebugUtils.currentLine=128254001;
 //BA.debugLineNum = 128254001;BA.debugLine="Public UILibrary As String = \"materialdesign\"";
_uilibrary = "materialdesign";
RDebugUtils.currentLine=128254002;
 //BA.debugLineNum = 128254002;BA.debugLine="Public ToolbarTemplate As String = \"\"";
_toolbartemplate = "";
RDebugUtils.currentLine=128254003;
 //BA.debugLineNum = 128254003;BA.debugLine="Private GroupBy As String = \"\"";
_groupby = "";
RDebugUtils.currentLine=128254004;
 //BA.debugLineNum = 128254004;BA.debugLine="Private DataSource As List";
_datasource = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=128254005;
 //BA.debugLineNum = 128254005;BA.debugLine="Public DataField As String = \"records\"";
_datafield = "records";
RDebugUtils.currentLine=128254006;
 //BA.debugLineNum = 128254006;BA.debugLine="Public ShowPager As Boolean = True";
_showpager = __c.True;
RDebugUtils.currentLine=128254007;
 //BA.debugLineNum = 128254007;BA.debugLine="Public TransparentBackground As Boolean = True";
_transparentbackground = __c.True;
RDebugUtils.currentLine=128254008;
 //BA.debugLineNum = 128254008;BA.debugLine="Private params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=128254009;
 //BA.debugLineNum = 128254009;BA.debugLine="Private Banano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=128254010;
 //BA.debugLineNum = 128254010;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
RDebugUtils.currentLine=128254011;
 //BA.debugLineNum = 128254011;BA.debugLine="Private eventName As String";
_eventname = "";
RDebugUtils.currentLine=128254012;
 //BA.debugLineNum = 128254012;BA.debugLine="Public Options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=128254013;
 //BA.debugLineNum = 128254013;BA.debugLine="Public responsive As Boolean = True";
_responsive = __c.True;
RDebugUtils.currentLine=128254014;
 //BA.debugLineNum = 128254014;BA.debugLine="Private formats As Map";
_formats = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=128254015;
 //BA.debugLineNum = 128254015;BA.debugLine="Public N As BANanoObject";
_n = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=128254016;
 //BA.debugLineNum = 128254016;BA.debugLine="Public ToolBar As VMGrid";
_toolbar = new b4j.example.vmgrid();
RDebugUtils.currentLine=128254017;
 //BA.debugLineNum = 128254017;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=128254018;
 //BA.debugLineNum = 128254018;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=130285568;
 //BA.debugLineNum = 130285568;BA.debugLine="Sub Clear";
RDebugUtils.currentLine=130285569;
 //BA.debugLineNum = 130285569;BA.debugLine="grid.RunMethod(\"clear\",Null)";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("clear",__c.Null);
RDebugUtils.currentLine=130285570;
 //BA.debugLineNum = 130285570;BA.debugLine="End Sub";
return "";
}
public String  _collapseall(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "collapseall", true))
	 {return ((String) Debug.delegate(ba, "collapseall", null));}
RDebugUtils.currentLine=132841472;
 //BA.debugLineNum = 132841472;BA.debugLine="Sub CollapseAll";
RDebugUtils.currentLine=132841473;
 //BA.debugLineNum = 132841473;BA.debugLine="grid.RunMethod(\"collapseAll\", Null)";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("collapseAll",__c.Null);
RDebugUtils.currentLine=132841474;
 //BA.debugLineNum = 132841474;BA.debugLine="End Sub";
return "";
}
public int  _countall(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "countall", true))
	 {return ((Integer) Debug.delegate(ba, "countall", null));}
int _cv = 0;
RDebugUtils.currentLine=130613248;
 //BA.debugLineNum = 130613248;BA.debugLine="Sub CountAll As Int";
RDebugUtils.currentLine=130613249;
 //BA.debugLineNum = 130613249;BA.debugLine="Dim cv As Int = grid.RunMethod(\"count\",Array(True";
_cv = (int)(BA.ObjectToNumber(__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("count",(Object)(new Object[]{(Object)(__c.True)})).Result()));
RDebugUtils.currentLine=130613250;
 //BA.debugLineNum = 130613250;BA.debugLine="Return cv";
if (true) return _cv;
RDebugUtils.currentLine=130613251;
 //BA.debugLineNum = 130613251;BA.debugLine="End Sub";
return 0;
}
public int  _countvisible(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "countvisible", true))
	 {return ((Integer) Debug.delegate(ba, "countvisible", null));}
int _cv = 0;
RDebugUtils.currentLine=130547712;
 //BA.debugLineNum = 130547712;BA.debugLine="Sub CountVisible As Int";
RDebugUtils.currentLine=130547713;
 //BA.debugLineNum = 130547713;BA.debugLine="Dim cv As Int = grid.RunMethod(\"count\",Null).resu";
_cv = (int)(BA.ObjectToNumber(__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("count",__c.Null).Result()));
RDebugUtils.currentLine=130547714;
 //BA.debugLineNum = 130547714;BA.debugLine="Return cv";
if (true) return _cv;
RDebugUtils.currentLine=130547715;
 //BA.debugLineNum = 130547715;BA.debugLine="End Sub";
return 0;
}
public String  _destroy(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "destroy", true))
	 {return ((String) Debug.delegate(ba, "destroy", null));}
RDebugUtils.currentLine=130678784;
 //BA.debugLineNum = 130678784;BA.debugLine="Sub Destroy";
RDebugUtils.currentLine=130678785;
 //BA.debugLineNum = 130678785;BA.debugLine="Try";
try {RDebugUtils.currentLine=130678786;
 //BA.debugLineNum = 130678786;BA.debugLine="grid.RunMethod(\"destroy\", Array(True, True))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("destroy",(Object)(new Object[]{(Object)(__c.True),(Object)(__c.True)}));
 } 
       catch (Exception e4) {
			ba.setLastException(e4);RDebugUtils.currentLine=130678788;
 //BA.debugLineNum = 130678788;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=130678790;
 //BA.debugLineNum = 130678790;BA.debugLine="End Sub";
return "";
}
public String  _downloadcsv(b4j.example.vmgijgotable __ref,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "downloadcsv", true))
	 {return ((String) Debug.delegate(ba, "downloadcsv", new Object[] {_filename}));}
RDebugUtils.currentLine=133627904;
 //BA.debugLineNum = 133627904;BA.debugLine="Sub DownloadCSV(fileName As String)";
RDebugUtils.currentLine=133627905;
 //BA.debugLineNum = 133627905;BA.debugLine="grid.RunMethod(\"downloadCSV\", Array(fileName,True";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("downloadCSV",(Object)(new Object[]{(Object)(_filename),(Object)(__c.True)}));
RDebugUtils.currentLine=133627906;
 //BA.debugLineNum = 133627906;BA.debugLine="End Sub";
return "";
}
public String  _expandall(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "expandall", true))
	 {return ((String) Debug.delegate(ba, "expandall", null));}
RDebugUtils.currentLine=132775936;
 //BA.debugLineNum = 132775936;BA.debugLine="Sub ExpandAll";
RDebugUtils.currentLine=132775937;
 //BA.debugLineNum = 132775937;BA.debugLine="grid.RunMethod(\"expandAll\", Null)";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("expandAll",__c.Null);
RDebugUtils.currentLine=132775938;
 //BA.debugLineNum = 132775938;BA.debugLine="End Sub";
return "";
}
public String  _filerender(b4j.example.vmgijgotable __ref,Object _value,anywheresoftware.b4a.objects.collections.Map _record,com.ab.banano.BANanoObject _cell,com.ab.banano.BANanoObject _displayel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "filerender", true))
	 {return ((String) Debug.delegate(ba, "filerender", new Object[] {_value,_record,_cell,_displayel}));}
com.ab.banano.BANanoElement _de = null;
RDebugUtils.currentLine=134217728;
 //BA.debugLineNum = 134217728;BA.debugLine="Sub FileRender(value As Object, record As Map, cel";
RDebugUtils.currentLine=134217729;
 //BA.debugLineNum = 134217729;BA.debugLine="If value = Null Then value = 0";
if (_value== null) { 
_value = (Object)(0);};
RDebugUtils.currentLine=134217730;
 //BA.debugLineNum = 134217730;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displa";
_de = new com.ab.banano.BANanoElement();
_de = __ref._banano /*com.ab.banano.BANano*/ .ToElement(_displayel);
RDebugUtils.currentLine=134217731;
 //BA.debugLineNum = 134217731;BA.debugLine="value = N.Selector(value).RunMethod(\"format\",Arra";
_value = (Object)(__ref._n /*com.ab.banano.BANanoObject*/ .Selector(_value).RunMethod("format",(Object)(new Object[]{(Object)("0.00 b")})).getObject());
RDebugUtils.currentLine=134217732;
 //BA.debugLineNum = 134217732;BA.debugLine="dE.SetText(value)";
_de.SetText(BA.ObjectToString(_value));
RDebugUtils.currentLine=134217733;
 //BA.debugLineNum = 134217733;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getbyid(b4j.example.vmgijgotable __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "getbyid", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getbyid", new Object[] {_sid}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
RDebugUtils.currentLine=130088960;
 //BA.debugLineNum = 130088960;BA.debugLine="Sub GetById(sID As String) As Map";
RDebugUtils.currentLine=130088961;
 //BA.debugLineNum = 130088961;BA.debugLine="Dim res As Map = grid.RunMethod(\"getById\", Array(";
_res = new anywheresoftware.b4a.objects.collections.Map();
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("getById",(Object)(new Object[]{(Object)(_sid)})).Result()));
RDebugUtils.currentLine=130088962;
 //BA.debugLineNum = 130088962;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=130088963;
 //BA.debugLineNum = 130088963;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getbypos(b4j.example.vmgijgotable __ref,int _rowpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "getbypos", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getbypos", new Object[] {_rowpos}));}
anywheresoftware.b4a.objects.collections.Map _res = null;
RDebugUtils.currentLine=129826816;
 //BA.debugLineNum = 129826816;BA.debugLine="Sub GetByPos(rowPos As Int) As Map";
RDebugUtils.currentLine=129826817;
 //BA.debugLineNum = 129826817;BA.debugLine="Dim res As Map = grid.RunMethod(\"get\", Array(rowP";
_res = new anywheresoftware.b4a.objects.collections.Map();
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("get",(Object)(new Object[]{(Object)(_rowpos)})).Result()));
RDebugUtils.currentLine=129826818;
 //BA.debugLineNum = 129826818;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=129826819;
 //BA.debugLineNum = 129826819;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getchanges(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "getchanges", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getchanges", null));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=133169152;
 //BA.debugLineNum = 133169152;BA.debugLine="Sub GetChanges As List";
RDebugUtils.currentLine=133169153;
 //BA.debugLineNum = 133169153;BA.debugLine="Dim res As List = grid.runmethod(\"getChanges\",Nul";
_res = new anywheresoftware.b4a.objects.collections.List();
_res.setObject((java.util.List)(__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("getChanges",__c.Null).Result()));
RDebugUtils.currentLine=133169154;
 //BA.debugLineNum = 133169154;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=133169155;
 //BA.debugLineNum = 133169155;BA.debugLine="End Sub";
return null;
}
public String  _getcsv(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "getcsv", true))
	 {return ((String) Debug.delegate(ba, "getcsv", null));}
RDebugUtils.currentLine=133693440;
 //BA.debugLineNum = 133693440;BA.debugLine="Sub GetCSV";
RDebugUtils.currentLine=133693441;
 //BA.debugLineNum = 133693441;BA.debugLine="grid.RunMethod(\"getCSV\", Array(True))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("getCSV",(Object)(new Object[]{(Object)(__c.True)}));
RDebugUtils.currentLine=133693442;
 //BA.debugLineNum = 133693442;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getrows(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "getrows", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getrows", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
RDebugUtils.currentLine=129957888;
 //BA.debugLineNum = 129957888;BA.debugLine="Sub GetRows() As List";
RDebugUtils.currentLine=129957889;
 //BA.debugLineNum = 129957889;BA.debugLine="Dim lst As List = grid.runmethod(\"getAll\", Array(";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst.setObject((java.util.List)(__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("getAll",(Object)(new Object[]{(Object)(__c.True)})).Result()));
RDebugUtils.currentLine=129957890;
 //BA.debugLineNum = 129957890;BA.debugLine="Return lst";
if (true) return _lst;
RDebugUtils.currentLine=129957891;
 //BA.debugLineNum = 129957891;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getrowsvisible(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "getrowsvisible", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getrowsvisible", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
RDebugUtils.currentLine=129892352;
 //BA.debugLineNum = 129892352;BA.debugLine="Sub GetRowsVisible() As List";
RDebugUtils.currentLine=129892353;
 //BA.debugLineNum = 129892353;BA.debugLine="Dim lst As List = grid.runmethod(\"getAll\", Null).";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst.setObject((java.util.List)(__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("getAll",__c.Null).Result()));
RDebugUtils.currentLine=129892354;
 //BA.debugLineNum = 129892354;BA.debugLine="Return lst";
if (true) return _lst;
RDebugUtils.currentLine=129892355;
 //BA.debugLineNum = 129892355;BA.debugLine="End Sub";
return null;
}
public String  _getselected(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "getselected", true))
	 {return ((String) Debug.delegate(ba, "getselected", null));}
String _res = "";
RDebugUtils.currentLine=132513792;
 //BA.debugLineNum = 132513792;BA.debugLine="Sub GetSelected As String";
RDebugUtils.currentLine=132513793;
 //BA.debugLineNum = 132513793;BA.debugLine="Dim res As String = grid.RunMethod(\"getSelected\",";
_res = BA.ObjectToString(__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("getSelected",__c.Null).Result());
RDebugUtils.currentLine=132513794;
 //BA.debugLineNum = 132513794;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=132513795;
 //BA.debugLineNum = 132513795;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getselections(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "getselections", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getselections", null));}
anywheresoftware.b4a.objects.collections.List _res = null;
RDebugUtils.currentLine=132579328;
 //BA.debugLineNum = 132579328;BA.debugLine="Sub GetSelections As List";
RDebugUtils.currentLine=132579329;
 //BA.debugLineNum = 132579329;BA.debugLine="Dim res As List = grid.RunMethod(\"getSelections\",";
_res = new anywheresoftware.b4a.objects.collections.List();
_res.setObject((java.util.List)(__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("getSelections",__c.Null).Result()));
RDebugUtils.currentLine=132579330;
 //BA.debugLineNum = 132579330;BA.debugLine="Return res";
if (true) return _res;
RDebugUtils.currentLine=132579331;
 //BA.debugLineNum = 132579331;BA.debugLine="End Sub";
return null;
}
public String  _hidecolumn(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _colname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "hidecolumn", true))
	 {return ((String) Debug.delegate(ba, "hidecolumn", new Object[] {_colname}));}
String _strcol = "";
RDebugUtils.currentLine=130351104;
 //BA.debugLineNum = 130351104;BA.debugLine="Sub HideColumn(colName As List)";
RDebugUtils.currentLine=130351105;
 //BA.debugLineNum = 130351105;BA.debugLine="For Each strCol As String In colName";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colname;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=130351106;
 //BA.debugLineNum = 130351106;BA.debugLine="grid.RunMethod(\"hideColumn\", Array(strCol))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("hideColumn",(Object)(new Object[]{(Object)(_strcol)}));
 }
};
RDebugUtils.currentLine=130351108;
 //BA.debugLineNum = 130351108;BA.debugLine="End Sub";
return "";
}
public String  _iconrender(b4j.example.vmgijgotable __ref,Object _value,anywheresoftware.b4a.objects.collections.Map _record,com.ab.banano.BANanoObject _cell,com.ab.banano.BANanoObject _displayel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "iconrender", true))
	 {return ((String) Debug.delegate(ba, "iconrender", new Object[] {_value,_record,_cell,_displayel}));}
String _sfontsize = "";
String _sfontcolor = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sstyle = "";
String _sicon = "";
com.ab.banano.BANanoElement _de = null;
RDebugUtils.currentLine=134152192;
 //BA.debugLineNum = 134152192;BA.debugLine="Sub IconRender(value As Object, record As Map, cel";
RDebugUtils.currentLine=134152193;
 //BA.debugLineNum = 134152193;BA.debugLine="If value = Null Then";
if (_value== null) { 
RDebugUtils.currentLine=134152194;
 //BA.debugLineNum = 134152194;BA.debugLine="value = \"\"";
_value = (Object)("");
RDebugUtils.currentLine=134152195;
 //BA.debugLineNum = 134152195;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=134152197;
 //BA.debugLineNum = 134152197;BA.debugLine="Dim sfontsize As String = record.GetDefault(\"icon";
_sfontsize = BA.ObjectToString(_record.GetDefault((Object)("iconsize"),(Object)("")));
RDebugUtils.currentLine=134152198;
 //BA.debugLineNum = 134152198;BA.debugLine="Dim sfontcolor As String = record.GetDefault(\"ico";
_sfontcolor = BA.ObjectToString(_record.GetDefault((Object)("iconcolor"),(Object)("")));
RDebugUtils.currentLine=134152199;
 //BA.debugLineNum = 134152199;BA.debugLine="If sfontsize = Null Then sfontsize = \"\"";
if (_sfontsize== null) { 
_sfontsize = "";};
RDebugUtils.currentLine=134152200;
 //BA.debugLineNum = 134152200;BA.debugLine="If sfontcolor = Null Then sfontcolor = \"\"";
if (_sfontcolor== null) { 
_sfontcolor = "";};
RDebugUtils.currentLine=134152201;
 //BA.debugLineNum = 134152201;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=134152202;
 //BA.debugLineNum = 134152202;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=134152203;
 //BA.debugLineNum = 134152203;BA.debugLine="If sfontsize <> \"\" Then sb.Append($\"font-size:${s";
if ((_sfontsize).equals("") == false) { 
_sb.Append(("font-size:"+__c.SmartStringFormatter("",(Object)(_sfontsize))+"px;"));};
RDebugUtils.currentLine=134152204;
 //BA.debugLineNum = 134152204;BA.debugLine="If sfontcolor <> \"\" Then sb.Append($\"color:${sfon";
if ((_sfontcolor).equals("") == false) { 
_sb.Append(("color:"+__c.SmartStringFormatter("",(Object)(_sfontcolor))+";"));};
RDebugUtils.currentLine=134152205;
 //BA.debugLineNum = 134152205;BA.debugLine="Dim sStyle As String = sb.tostring";
_sstyle = _sb.ToString();
RDebugUtils.currentLine=134152206;
 //BA.debugLineNum = 134152206;BA.debugLine="Dim sIcon As String = \"\"";
_sicon = "";
RDebugUtils.currentLine=134152207;
 //BA.debugLineNum = 134152207;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(__ref._iconslibrary /*String*/ ,"materialicons","fontawesome")) {
case 0: {
RDebugUtils.currentLine=134152209;
 //BA.debugLineNum = 134152209;BA.debugLine="sIcon = $\"<i class=\"material-icons gj-cursor-po";
_sicon = ("<i class=\"material-icons gj-cursor-pointer\" style=\""+__c.SmartStringFormatter("",(Object)(_sstyle))+"\">"+__c.SmartStringFormatter("",_value)+"</i>");
 break; }
case 1: {
RDebugUtils.currentLine=134152211;
 //BA.debugLineNum = 134152211;BA.debugLine="sIcon = $\"<i class=\"${value} gj-cursor-pointer\"";
_sicon = ("<i class=\""+__c.SmartStringFormatter("",_value)+" gj-cursor-pointer\" style=\""+__c.SmartStringFormatter("",(Object)(_sstyle))+"\"></i>");
 break; }
}
;
RDebugUtils.currentLine=134152213;
 //BA.debugLineNum = 134152213;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displa";
_de = new com.ab.banano.BANanoElement();
_de = __ref._banano /*com.ab.banano.BANano*/ .ToElement(_displayel);
RDebugUtils.currentLine=134152214;
 //BA.debugLineNum = 134152214;BA.debugLine="dE.SetHTML(sIcon)";
_de.SetHTML(_sicon);
RDebugUtils.currentLine=134152215;
 //BA.debugLineNum = 134152215;BA.debugLine="End Sub";
return "";
}
public String  _imagerender(b4j.example.vmgijgotable __ref,Object _value,anywheresoftware.b4a.objects.collections.Map _record,com.ab.banano.BANanoObject _cell,com.ab.banano.BANanoObject _displayel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "imagerender", true))
	 {return ((String) Debug.delegate(ba, "imagerender", new Object[] {_value,_record,_cell,_displayel}));}
String _simagewidth = "";
String _simageheight = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sstyle = "";
com.ab.banano.BANanoElement _de = null;
String _simg = "";
RDebugUtils.currentLine=134414336;
 //BA.debugLineNum = 134414336;BA.debugLine="Sub ImageRender(value As Object, record As Map, ce";
RDebugUtils.currentLine=134414338;
 //BA.debugLineNum = 134414338;BA.debugLine="If value <> Null Then";
if (_value!= null) { 
RDebugUtils.currentLine=134414339;
 //BA.debugLineNum = 134414339;BA.debugLine="Dim simagewidth As String = record.GetDefault(\"i";
_simagewidth = BA.ObjectToString(_record.GetDefault((Object)("imagewidth"),(Object)("")));
RDebugUtils.currentLine=134414340;
 //BA.debugLineNum = 134414340;BA.debugLine="Dim simageheight As String = record.GetDefault(\"";
_simageheight = BA.ObjectToString(_record.GetDefault((Object)("imageheight"),(Object)("")));
RDebugUtils.currentLine=134414341;
 //BA.debugLineNum = 134414341;BA.debugLine="If simagewidth = Null Then simagewidth = \"\"";
if (_simagewidth== null) { 
_simagewidth = "";};
RDebugUtils.currentLine=134414342;
 //BA.debugLineNum = 134414342;BA.debugLine="If simageheight = Null Then simageheight = \"\"";
if (_simageheight== null) { 
_simageheight = "";};
RDebugUtils.currentLine=134414343;
 //BA.debugLineNum = 134414343;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=134414344;
 //BA.debugLineNum = 134414344;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=134414345;
 //BA.debugLineNum = 134414345;BA.debugLine="If simageheight <> \"\" Then sb.Append($\"height:${";
if ((_simageheight).equals("") == false) { 
_sb.Append(("height:"+__c.SmartStringFormatter("",(Object)(__ref._makepx /*String*/ (null,_simageheight)))+";"));};
RDebugUtils.currentLine=134414346;
 //BA.debugLineNum = 134414346;BA.debugLine="If simagewidth <> \"\" Then sb.Append($\"width:${Ma";
if ((_simagewidth).equals("") == false) { 
_sb.Append(("width:"+__c.SmartStringFormatter("",(Object)(__ref._makepx /*String*/ (null,_simagewidth)))+";"));};
RDebugUtils.currentLine=134414347;
 //BA.debugLineNum = 134414347;BA.debugLine="Dim sStyle As String = sb.tostring";
_sstyle = _sb.ToString();
RDebugUtils.currentLine=134414348;
 //BA.debugLineNum = 134414348;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displ";
_de = new com.ab.banano.BANanoElement();
_de = __ref._banano /*com.ab.banano.BANano*/ .ToElement(_displayel);
RDebugUtils.currentLine=134414349;
 //BA.debugLineNum = 134414349;BA.debugLine="Dim simg As String = $\"<img src=\"${value}\" alt=\"";
_simg = ("<img src=\""+__c.SmartStringFormatter("",_value)+"\" alt=\"\" style=\""+__c.SmartStringFormatter("",(Object)(_sstyle))+"\">");
RDebugUtils.currentLine=134414350;
 //BA.debugLineNum = 134414350;BA.debugLine="dE.SetHTML(simg)";
_de.SetHTML(_simg);
 };
RDebugUtils.currentLine=134414352;
 //BA.debugLineNum = 134414352;BA.debugLine="End Sub";
return "";
}
public String  _makepx(b4j.example.vmgijgotable __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "makepx", true))
	 {return ((String) Debug.delegate(ba, "makepx", new Object[] {_svalue}));}
RDebugUtils.currentLine=134479872;
 //BA.debugLineNum = 134479872;BA.debugLine="private Sub MakePx(sValue As String) As String";
RDebugUtils.currentLine=134479873;
 //BA.debugLineNum = 134479873;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
RDebugUtils.currentLine=134479874;
 //BA.debugLineNum = 134479874;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
RDebugUtils.currentLine=134479875;
 //BA.debugLineNum = 134479875;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479876;
 //BA.debugLineNum = 134479876;BA.debugLine="else If sValue.EndsWith(\"vm\") Then";
if (_svalue.endsWith("vm")) { 
RDebugUtils.currentLine=134479877;
 //BA.debugLineNum = 134479877;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479878;
 //BA.debugLineNum = 134479878;BA.debugLine="else If sValue.EndsWith(\"px\") Then";
if (_svalue.endsWith("px")) { 
RDebugUtils.currentLine=134479879;
 //BA.debugLineNum = 134479879;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479880;
 //BA.debugLineNum = 134479880;BA.debugLine="else If sValue.EndsWith(\"cm\") Then";
if (_svalue.endsWith("cm")) { 
RDebugUtils.currentLine=134479881;
 //BA.debugLineNum = 134479881;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479882;
 //BA.debugLineNum = 134479882;BA.debugLine="else If sValue.EndsWith(\"mm\") Then";
if (_svalue.endsWith("mm")) { 
RDebugUtils.currentLine=134479883;
 //BA.debugLineNum = 134479883;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479884;
 //BA.debugLineNum = 134479884;BA.debugLine="else If sValue.EndsWith(\"in\") Then";
if (_svalue.endsWith("in")) { 
RDebugUtils.currentLine=134479885;
 //BA.debugLineNum = 134479885;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479886;
 //BA.debugLineNum = 134479886;BA.debugLine="else If sValue.EndsWith(\"pt\") Then";
if (_svalue.endsWith("pt")) { 
RDebugUtils.currentLine=134479887;
 //BA.debugLineNum = 134479887;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479888;
 //BA.debugLineNum = 134479888;BA.debugLine="else If sValue.EndsWith(\"pc\") Then";
if (_svalue.endsWith("pc")) { 
RDebugUtils.currentLine=134479889;
 //BA.debugLineNum = 134479889;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479890;
 //BA.debugLineNum = 134479890;BA.debugLine="else If sValue.EndsWith(\"em\") Then";
if (_svalue.endsWith("em")) { 
RDebugUtils.currentLine=134479891;
 //BA.debugLineNum = 134479891;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479892;
 //BA.debugLineNum = 134479892;BA.debugLine="else If sValue.EndsWith(\"ex\") Then";
if (_svalue.endsWith("ex")) { 
RDebugUtils.currentLine=134479893;
 //BA.debugLineNum = 134479893;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479894;
 //BA.debugLineNum = 134479894;BA.debugLine="else If sValue.EndsWith(\"ch\") Then";
if (_svalue.endsWith("ch")) { 
RDebugUtils.currentLine=134479895;
 //BA.debugLineNum = 134479895;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479896;
 //BA.debugLineNum = 134479896;BA.debugLine="else If sValue.EndsWith(\"rem\") Then";
if (_svalue.endsWith("rem")) { 
RDebugUtils.currentLine=134479897;
 //BA.debugLineNum = 134479897;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479898;
 //BA.debugLineNum = 134479898;BA.debugLine="else If sValue.EndsWith(\"vw\") Then";
if (_svalue.endsWith("vw")) { 
RDebugUtils.currentLine=134479899;
 //BA.debugLineNum = 134479899;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479900;
 //BA.debugLineNum = 134479900;BA.debugLine="else If sValue.EndsWith(\"vh\") Then";
if (_svalue.endsWith("vh")) { 
RDebugUtils.currentLine=134479901;
 //BA.debugLineNum = 134479901;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479902;
 //BA.debugLineNum = 134479902;BA.debugLine="else If sValue.EndsWith(\"vmin\") Then";
if (_svalue.endsWith("vmin")) { 
RDebugUtils.currentLine=134479903;
 //BA.debugLineNum = 134479903;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479904;
 //BA.debugLineNum = 134479904;BA.debugLine="else If sValue.EndsWith(\"vmax\") Then";
if (_svalue.endsWith("vmax")) { 
RDebugUtils.currentLine=134479905;
 //BA.debugLineNum = 134479905;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=134479906;
 //BA.debugLineNum = 134479906;BA.debugLine="else If sValue.EndsWith(\";\") Then";
if (_svalue.endsWith(";")) { 
RDebugUtils.currentLine=134479907;
 //BA.debugLineNum = 134479907;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
RDebugUtils.currentLine=134479909;
 //BA.debugLineNum = 134479909;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
RDebugUtils.currentLine=134479910;
 //BA.debugLineNum = 134479910;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+__c.SmartStringFormatter("",(Object)(_svalue))+"px");
RDebugUtils.currentLine=134479911;
 //BA.debugLineNum = 134479911;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
RDebugUtils.currentLine=134479912;
 //BA.debugLineNum = 134479912;BA.debugLine="Return sValue";
if (true) return _svalue;
 }}}}}}}}}}}}}}}}}
;
RDebugUtils.currentLine=134479914;
 //BA.debugLineNum = 134479914;BA.debugLine="End Sub";
return "";
}
public String  _moneyrender(b4j.example.vmgijgotable __ref,Object _value,anywheresoftware.b4a.objects.collections.Map _record,com.ab.banano.BANanoObject _cell,com.ab.banano.BANanoObject _displayel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "moneyrender", true))
	 {return ((String) Debug.delegate(ba, "moneyrender", new Object[] {_value,_record,_cell,_displayel}));}
com.ab.banano.BANanoElement _de = null;
RDebugUtils.currentLine=134348800;
 //BA.debugLineNum = 134348800;BA.debugLine="Sub MoneyRender(value As Object, record As Map, ce";
RDebugUtils.currentLine=134348801;
 //BA.debugLineNum = 134348801;BA.debugLine="If value = Null Then value = 0";
if (_value== null) { 
_value = (Object)(0);};
RDebugUtils.currentLine=134348802;
 //BA.debugLineNum = 134348802;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displa";
_de = new com.ab.banano.BANanoElement();
_de = __ref._banano /*com.ab.banano.BANano*/ .ToElement(_displayel);
RDebugUtils.currentLine=134348803;
 //BA.debugLineNum = 134348803;BA.debugLine="value = N.Selector(value).RunMethod(\"format\",Arra";
_value = (Object)(__ref._n /*com.ab.banano.BANanoObject*/ .Selector(_value).RunMethod("format",(Object)(new Object[]{(Object)("(0,0.00)")})).getObject());
RDebugUtils.currentLine=134348804;
 //BA.debugLineNum = 134348804;BA.debugLine="dE.SetText(value)";
_de.SetText(BA.ObjectToString(_value));
RDebugUtils.currentLine=134348805;
 //BA.debugLineNum = 134348805;BA.debugLine="End Sub";
return "";
}
public String  _numeralformat(b4j.example.vmgijgotable __ref,String _svalue,String _sformat) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "numeralformat", true))
	 {return ((String) Debug.delegate(ba, "numeralformat", new Object[] {_svalue,_sformat}));}
RDebugUtils.currentLine=134283264;
 //BA.debugLineNum = 134283264;BA.debugLine="Sub NumeralFormat(sValue As String,sFormat As Stri";
RDebugUtils.currentLine=134283265;
 //BA.debugLineNum = 134283265;BA.debugLine="sValue = N.Selector(sValue).RunMethod(\"format\",Ar";
_svalue = BA.ObjectToString(__ref._n /*com.ab.banano.BANanoObject*/ .Selector((Object)(_svalue)).RunMethod("format",(Object)(new Object[]{(Object)(_sformat)})).Result());
RDebugUtils.currentLine=134283266;
 //BA.debugLineNum = 134283266;BA.debugLine="Return sValue";
if (true) return _svalue;
RDebugUtils.currentLine=134283267;
 //BA.debugLineNum = 134283267;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmgijgotable __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=129105920;
 //BA.debugLineNum = 129105920;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=129105921;
 //BA.debugLineNum = 129105921;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=129105922;
 //BA.debugLineNum = 129105922;BA.debugLine="End Sub";
return "";
}
public String  _reload(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "reload", true))
	 {return ((String) Debug.delegate(ba, "reload", null));}
RDebugUtils.currentLine=130220032;
 //BA.debugLineNum = 130220032;BA.debugLine="Sub Reload";
RDebugUtils.currentLine=130220033;
 //BA.debugLineNum = 130220033;BA.debugLine="grid.RunMethod(\"reload\",Null)";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("reload",__c.Null);
RDebugUtils.currentLine=130220034;
 //BA.debugLineNum = 130220034;BA.debugLine="End Sub";
return "";
}
public String  _removerow(b4j.example.vmgijgotable __ref,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "removerow", true))
	 {return ((String) Debug.delegate(ba, "removerow", new Object[] {_pk}));}
RDebugUtils.currentLine=130482176;
 //BA.debugLineNum = 130482176;BA.debugLine="Sub RemoveRow(pk As String)";
RDebugUtils.currentLine=130482177;
 //BA.debugLineNum = 130482177;BA.debugLine="grid.RunMethod(\"removeRow\", Array(pk))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("removeRow",(Object)(new Object[]{(Object)(_pk)}));
RDebugUtils.currentLine=130482178;
 //BA.debugLineNum = 130482178;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=129040384;
 //BA.debugLineNum = 129040384;BA.debugLine="Sub Render";
RDebugUtils.currentLine=129040385;
 //BA.debugLineNum = 129040385;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=129040386;
 //BA.debugLineNum = 129040386;BA.debugLine="End Sub";
return "";
}
public String  _reset(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "reset", true))
	 {return ((String) Debug.delegate(ba, "reset", null));}
RDebugUtils.currentLine=128450560;
 //BA.debugLineNum = 128450560;BA.debugLine="Sub Reset";
RDebugUtils.currentLine=128450561;
 //BA.debugLineNum = 128450561;BA.debugLine="columnsM.Initialize";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=128450562;
 //BA.debugLineNum = 128450562;BA.debugLine="Options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=128450563;
 //BA.debugLineNum = 128450563;BA.debugLine="params.Initialize";
__ref._params /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=128450564;
 //BA.debugLineNum = 128450564;BA.debugLine="formats.Initialize";
__ref._formats /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=128450565;
 //BA.debugLineNum = 128450565;BA.debugLine="End Sub";
return "";
}
public String  _searchfor(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.Map _searchvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "searchfor", true))
	 {return ((String) Debug.delegate(ba, "searchfor", new Object[] {_searchvalues}));}
RDebugUtils.currentLine=130154496;
 //BA.debugLineNum = 130154496;BA.debugLine="Sub SearchFor(searchValues As Map)";
RDebugUtils.currentLine=130154497;
 //BA.debugLineNum = 130154497;BA.debugLine="grid.RunMethod(\"reload\", Array(searchValues))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("reload",(Object)(new Object[]{(Object)(_searchvalues.getObject())}));
RDebugUtils.currentLine=130154498;
 //BA.debugLineNum = 130154498;BA.debugLine="End Sub";
return "";
}
public String  _selectall(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "selectall", true))
	 {return ((String) Debug.delegate(ba, "selectall", null));}
RDebugUtils.currentLine=132644864;
 //BA.debugLineNum = 132644864;BA.debugLine="Sub SelectAll";
RDebugUtils.currentLine=132644865;
 //BA.debugLineNum = 132644865;BA.debugLine="grid.RunMethod(\"selectAll\", Null)";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("selectAll",__c.Null);
RDebugUtils.currentLine=132644866;
 //BA.debugLineNum = 132644866;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setattr(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=128909312;
 //BA.debugLineNum = 128909312;BA.debugLine="Sub SetAttr(attr As Map) As VMGijgoTable";
RDebugUtils.currentLine=128909313;
 //BA.debugLineNum = 128909313;BA.debugLine="Table.SetAttr(attr)";
__ref._table /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=128909314;
 //BA.debugLineNum = 128909314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=128909315;
 //BA.debugLineNum = 128909315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcenteraligncolumns(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcenteraligncolumns", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcenteraligncolumns", new Object[] {_flds}));}
String _k = "";
RDebugUtils.currentLine=131792896;
 //BA.debugLineNum = 131792896;BA.debugLine="Sub SetCenterAlignColumns(flds As List) As VMGijgo";
RDebugUtils.currentLine=131792897;
 //BA.debugLineNum = 131792897;BA.debugLine="For Each k As String In flds";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flds;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=131792898;
 //BA.debugLineNum = 131792898;BA.debugLine="SetColumnAlignment(k, ALIGN_CENTER)";
__ref._setcolumnalignment /*b4j.example.vmgijgotable*/ (null,_k,__ref._align_center /*String*/ );
 }
};
RDebugUtils.currentLine=131792900;
 //BA.debugLineNum = 131792900;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=131792901;
 //BA.debugLineNum = 131792901;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumncss(b4j.example.vmgijgotable __ref,String _colname,String _colcss) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumncss", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumncss", new Object[] {_colname,_colcss}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133955584;
 //BA.debugLineNum = 133955584;BA.debugLine="Sub SetColumnCSS(colName As String, colCSS As Stri";
RDebugUtils.currentLine=133955585;
 //BA.debugLineNum = 133955585;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133955586;
 //BA.debugLineNum = 133955586;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133955588;
 //BA.debugLineNum = 133955588;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133955589;
 //BA.debugLineNum = 133955589;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133955590;
 //BA.debugLineNum = 133955590;BA.debugLine="col.Put(\"cssClass\", colCSS)";
_col.Put((Object)("cssClass"),(Object)(_colcss));
RDebugUtils.currentLine=133955591;
 //BA.debugLineNum = 133955591;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133955593;
 //BA.debugLineNum = 133955593;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133955594;
 //BA.debugLineNum = 133955594;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumndatasource(b4j.example.vmgijgotable __ref,String _colfield,Object _coldatasource,String _colvaluefield,String _coleditfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumndatasource", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumndatasource", new Object[] {_colfield,_coldatasource,_colvaluefield,_coleditfield}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
anywheresoftware.b4a.objects.collections.Map _editor = null;
RDebugUtils.currentLine=129695744;
 //BA.debugLineNum = 129695744;BA.debugLine="Sub SetColumnDataSource(colField As String, colDat";
RDebugUtils.currentLine=129695745;
 //BA.debugLineNum = 129695745;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
RDebugUtils.currentLine=129695746;
 //BA.debugLineNum = 129695746;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
RDebugUtils.currentLine=129695747;
 //BA.debugLineNum = 129695747;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colfield))) { 
RDebugUtils.currentLine=129695748;
 //BA.debugLineNum = 129695748;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colfield))));
RDebugUtils.currentLine=129695749;
 //BA.debugLineNum = 129695749;BA.debugLine="Dim editor As Map = CreateMap(\"dataSource\":colDa";
_editor = new anywheresoftware.b4a.objects.collections.Map();
_editor = __c.createMap(new Object[] {(Object)("dataSource"),_coldatasource,(Object)("valueField"),(Object)(_colvaluefield)});
RDebugUtils.currentLine=129695750;
 //BA.debugLineNum = 129695750;BA.debugLine="col.Put(\"editor\", editor)";
_col.Put((Object)("editor"),(Object)(_editor.getObject()));
RDebugUtils.currentLine=129695751;
 //BA.debugLineNum = 129695751;BA.debugLine="col.Put(\"editField\", colEditField)";
_col.Put((Object)("editField"),(Object)(_coleditfield));
RDebugUtils.currentLine=129695752;
 //BA.debugLineNum = 129695752;BA.debugLine="columnsM.Put(colField,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colfield),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=129695754;
 //BA.debugLineNum = 129695754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=129695755;
 //BA.debugLineNum = 129695755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumneditors(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _colfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumneditors", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumneditors", new Object[] {_colfield}));}
String _strcol = "";
anywheresoftware.b4a.objects.collections.Map _col = null;
String _coltype = "";
RDebugUtils.currentLine=129499136;
 //BA.debugLineNum = 129499136;BA.debugLine="Sub SetColumnEditors(colField As List) As VMGijgoT";
RDebugUtils.currentLine=129499137;
 //BA.debugLineNum = 129499137;BA.debugLine="For Each strCol As String In colField";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfield;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=129499138;
 //BA.debugLineNum = 129499138;BA.debugLine="strCol = strCol.Replace(\" \",\"\")";
_strcol = _strcol.replace(" ","");
RDebugUtils.currentLine=129499139;
 //BA.debugLineNum = 129499139;BA.debugLine="strCol = strCol.tolowercase";
_strcol = _strcol.toLowerCase();
RDebugUtils.currentLine=129499140;
 //BA.debugLineNum = 129499140;BA.debugLine="If columnsM.ContainsKey(strCol) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_strcol))) { 
RDebugUtils.currentLine=129499141;
 //BA.debugLineNum = 129499141;BA.debugLine="Dim col As Map = columnsM.Get(strCol)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strcol))));
RDebugUtils.currentLine=129499142;
 //BA.debugLineNum = 129499142;BA.debugLine="col.Put(\"editor\", True)";
_col.Put((Object)("editor"),(Object)(__c.True));
RDebugUtils.currentLine=129499144;
 //BA.debugLineNum = 129499144;BA.debugLine="Dim colType As String = col.Get(\"type\")";
_coltype = BA.ObjectToString(_col.Get((Object)("type")));
RDebugUtils.currentLine=129499145;
 //BA.debugLineNum = 129499145;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"checkbox")) {
case 0: {
RDebugUtils.currentLine=129499147;
 //BA.debugLineNum = 129499147;BA.debugLine="col.Put(\"mode\", \"editOnly\")";
_col.Put((Object)("mode"),(Object)("editOnly"));
 break; }
}
;
RDebugUtils.currentLine=129499149;
 //BA.debugLineNum = 129499149;BA.debugLine="columnsM.Put(strCol,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strcol),(Object)(_col.getObject()));
 };
 }
};
RDebugUtils.currentLine=129499152;
 //BA.debugLineNum = 129499152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=129499153;
 //BA.debugLineNum = 129499153;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnevent(b4j.example.vmgijgotable __ref,String _colfield,String _colevent,boolean _stoppropagation) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnevent", true))
	 {return ((String) Debug.delegate(ba, "setcolumnevent", new Object[] {_colfield,_colevent,_stoppropagation}));}
anywheresoftware.b4a.objects.collections.Map _e = null;
anywheresoftware.b4a.objects.collections.Map _col = null;
anywheresoftware.b4a.objects.collections.Map _events = null;
RDebugUtils.currentLine=132382720;
 //BA.debugLineNum = 132382720;BA.debugLine="Sub SetColumnEvent(colField As String, colEvent As";
RDebugUtils.currentLine=132382721;
 //BA.debugLineNum = 132382721;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
RDebugUtils.currentLine=132382722;
 //BA.debugLineNum = 132382722;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
RDebugUtils.currentLine=132382723;
 //BA.debugLineNum = 132382723;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colfield))) { 
RDebugUtils.currentLine=132382724;
 //BA.debugLineNum = 132382724;BA.debugLine="Dim e As Map";
_e = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=132382725;
 //BA.debugLineNum = 132382725;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colfield))));
RDebugUtils.currentLine=132382726;
 //BA.debugLineNum = 132382726;BA.debugLine="If col.ContainsKey(\"events\") = False Then";
if (_col.ContainsKey((Object)("events"))==__c.False) { 
RDebugUtils.currentLine=132382727;
 //BA.debugLineNum = 132382727;BA.debugLine="Dim events As Map = CreateMap()";
_events = new anywheresoftware.b4a.objects.collections.Map();
_events = __c.createMap(new Object[] {});
RDebugUtils.currentLine=132382728;
 //BA.debugLineNum = 132382728;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
 };
RDebugUtils.currentLine=132382730;
 //BA.debugLineNum = 132382730;BA.debugLine="Dim events As Map = col.Get(\"events\")";
_events = new anywheresoftware.b4a.objects.collections.Map();
_events.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_col.Get((Object)("events"))));
RDebugUtils.currentLine=132382731;
 //BA.debugLineNum = 132382731;BA.debugLine="If stopPropagation Then col.Put(\"stopPropagation";
if (_stoppropagation) { 
_col.Put((Object)("stopPropagation"),(Object)(_stoppropagation));};
RDebugUtils.currentLine=132382732;
 //BA.debugLineNum = 132382732;BA.debugLine="events.Put(colEvent, Banano.CallBack(mCallBack,";
_events.Put((Object)(_colevent),__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._mcallback /*Object*/ ,__ref._eventname /*String*/ +("_"+__c.SmartStringFormatter("",(Object)(_colfield.toLowerCase()))+"_"+__c.SmartStringFormatter("",(Object)(_colevent))+""),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e.getObject())})));
RDebugUtils.currentLine=132382733;
 //BA.debugLineNum = 132382733;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
RDebugUtils.currentLine=132382734;
 //BA.debugLineNum = 132382734;BA.debugLine="columnsM.Put(colField,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colfield),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=132382736;
 //BA.debugLineNum = 132382736;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setcolumnformat(b4j.example.vmgijgotable __ref,String _colname,String _colformat) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnformat", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnformat", new Object[] {_colname,_colformat}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=134086656;
 //BA.debugLineNum = 134086656;BA.debugLine="Sub SetColumnFormat(colName As String, colFormat A";
RDebugUtils.currentLine=134086657;
 //BA.debugLineNum = 134086657;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=134086658;
 //BA.debugLineNum = 134086658;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=134086660;
 //BA.debugLineNum = 134086660;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=134086661;
 //BA.debugLineNum = 134086661;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=134086662;
 //BA.debugLineNum = 134086662;BA.debugLine="col.Put(\"format\", colFormat)";
_col.Put((Object)("format"),(Object)(_colformat));
RDebugUtils.currentLine=134086663;
 //BA.debugLineNum = 134086663;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=134086665;
 //BA.debugLineNum = 134086665;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=134086666;
 //BA.debugLineNum = 134086666;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnformatnumeral(b4j.example.vmgijgotable __ref,String _colfield,String _colformat) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnformatnumeral", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnformatnumeral", new Object[] {_colfield,_colformat}));}
RDebugUtils.currentLine=134021120;
 //BA.debugLineNum = 134021120;BA.debugLine="Sub SetColumnFormatNumeral(colField As String, col";
RDebugUtils.currentLine=134021121;
 //BA.debugLineNum = 134021121;BA.debugLine="SetColumnProperty(colField,\"formatnumeral\", colFo";
__ref._setcolumnproperty /*String*/ (null,_colfield,"formatnumeral",(Object)(_colformat));
RDebugUtils.currentLine=134021122;
 //BA.debugLineNum = 134021122;BA.debugLine="formats.Put(colField,colFormat)";
__ref._formats /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colfield),(Object)(_colformat));
RDebugUtils.currentLine=134021123;
 //BA.debugLineNum = 134021123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=134021124;
 //BA.debugLineNum = 134021124;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnproperty(b4j.example.vmgijgotable __ref,String _colfield,String _colproperty,Object _colvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnproperty", true))
	 {return ((String) Debug.delegate(ba, "setcolumnproperty", new Object[] {_colfield,_colproperty,_colvalue}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=129761280;
 //BA.debugLineNum = 129761280;BA.debugLine="Sub SetColumnProperty(colField As String, colPrope";
RDebugUtils.currentLine=129761281;
 //BA.debugLineNum = 129761281;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
RDebugUtils.currentLine=129761282;
 //BA.debugLineNum = 129761282;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colfield))) { 
RDebugUtils.currentLine=129761283;
 //BA.debugLineNum = 129761283;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colfield))));
RDebugUtils.currentLine=129761284;
 //BA.debugLineNum = 129761284;BA.debugLine="col.Put(colProperty, colValue)";
_col.Put((Object)(_colproperty),_colvalue);
RDebugUtils.currentLine=129761285;
 //BA.debugLineNum = 129761285;BA.debugLine="columnsM.Put(colField,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colfield),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=129761287;
 //BA.debugLineNum = 129761287;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setcolumngroupby(b4j.example.vmgijgotable __ref,String _colfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumngroupby", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumngroupby", new Object[] {_colfield}));}
RDebugUtils.currentLine=129433600;
 //BA.debugLineNum = 129433600;BA.debugLine="Sub SetColumnGroupBy(colField As String) As VMGijg";
RDebugUtils.currentLine=129433601;
 //BA.debugLineNum = 129433601;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
RDebugUtils.currentLine=129433602;
 //BA.debugLineNum = 129433602;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
RDebugUtils.currentLine=129433603;
 //BA.debugLineNum = 129433603;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colfield))) { 
RDebugUtils.currentLine=129433604;
 //BA.debugLineNum = 129433604;BA.debugLine="GroupBy = colField";
__ref._groupby /*String*/  = _colfield;
 };
RDebugUtils.currentLine=129433606;
 //BA.debugLineNum = 129433606;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=129433607;
 //BA.debugLineNum = 129433607;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnheadercss(b4j.example.vmgijgotable __ref,String _colname,String _headercssclass) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnheadercss", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnheadercss", new Object[] {_colname,_headercssclass}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133824512;
 //BA.debugLineNum = 133824512;BA.debugLine="Sub SetColumnHeaderCSS(colName As String, headerCs";
RDebugUtils.currentLine=133824513;
 //BA.debugLineNum = 133824513;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133824514;
 //BA.debugLineNum = 133824514;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133824516;
 //BA.debugLineNum = 133824516;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133824517;
 //BA.debugLineNum = 133824517;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133824518;
 //BA.debugLineNum = 133824518;BA.debugLine="col.Put(\"headerCssClass\", headerCssClass)";
_col.Put((Object)("headerCssClass"),(Object)(_headercssclass));
RDebugUtils.currentLine=133824519;
 //BA.debugLineNum = 133824519;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133824521;
 //BA.debugLineNum = 133824521;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133824522;
 //BA.debugLineNum = 133824522;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnhidden(b4j.example.vmgijgotable __ref,String _colname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnhidden", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnhidden", new Object[] {_colname}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133365760;
 //BA.debugLineNum = 133365760;BA.debugLine="Sub SetColumnHidden(colName As String) As VMGijgoT";
RDebugUtils.currentLine=133365761;
 //BA.debugLineNum = 133365761;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133365762;
 //BA.debugLineNum = 133365762;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133365763;
 //BA.debugLineNum = 133365763;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133365764;
 //BA.debugLineNum = 133365764;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133365765;
 //BA.debugLineNum = 133365765;BA.debugLine="col.Put(\"hidden\", True)";
_col.Put((Object)("hidden"),(Object)(__c.True));
RDebugUtils.currentLine=133365766;
 //BA.debugLineNum = 133365766;BA.debugLine="col.Put(\"filterable\", False)";
_col.Put((Object)("filterable"),(Object)(__c.False));
RDebugUtils.currentLine=133365767;
 //BA.debugLineNum = 133365767;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133365769;
 //BA.debugLineNum = 133365769;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133365770;
 //BA.debugLineNum = 133365770;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnhiddenonly(b4j.example.vmgijgotable __ref,String _colname,boolean _bvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnhiddenonly", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnhiddenonly", new Object[] {_colname,_bvalue}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133431296;
 //BA.debugLineNum = 133431296;BA.debugLine="Sub SetColumnHiddenOnly(colName As String, bValue";
RDebugUtils.currentLine=133431297;
 //BA.debugLineNum = 133431297;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133431298;
 //BA.debugLineNum = 133431298;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133431299;
 //BA.debugLineNum = 133431299;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133431300;
 //BA.debugLineNum = 133431300;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133431301;
 //BA.debugLineNum = 133431301;BA.debugLine="col.Put(\"hidden\", bValue)";
_col.Put((Object)("hidden"),(Object)(_bvalue));
RDebugUtils.currentLine=133431302;
 //BA.debugLineNum = 133431302;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133431304;
 //BA.debugLineNum = 133431304;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133431305;
 //BA.debugLineNum = 133431305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnicon(b4j.example.vmgijgotable __ref,String _colname,String _colicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnicon", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnicon", new Object[] {_colname,_colicon}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133234688;
 //BA.debugLineNum = 133234688;BA.debugLine="Sub SetColumnIcon(colName As String, colIcon As St";
RDebugUtils.currentLine=133234689;
 //BA.debugLineNum = 133234689;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133234690;
 //BA.debugLineNum = 133234690;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133234691;
 //BA.debugLineNum = 133234691;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133234692;
 //BA.debugLineNum = 133234692;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133234693;
 //BA.debugLineNum = 133234693;BA.debugLine="col.Put(\"icon\", colIcon)";
_col.Put((Object)("icon"),(Object)(_colicon));
RDebugUtils.currentLine=133234694;
 //BA.debugLineNum = 133234694;BA.debugLine="col.Put(\"type\", COLUMN_ICON)";
_col.Put((Object)("type"),(Object)(__ref._column_icon /*String*/ ));
RDebugUtils.currentLine=133234695;
 //BA.debugLineNum = 133234695;BA.debugLine="col.Put(\"filterable\", False)";
_col.Put((Object)("filterable"),(Object)(__c.False));
RDebugUtils.currentLine=133234696;
 //BA.debugLineNum = 133234696;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133234698;
 //BA.debugLineNum = 133234698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133234699;
 //BA.debugLineNum = 133234699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnitalic(b4j.example.vmgijgotable __ref,String _colname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnitalic", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnitalic", new Object[] {_colname}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133758976;
 //BA.debugLineNum = 133758976;BA.debugLine="Sub SetColumnItalic(colName As String) As VMGijgoT";
RDebugUtils.currentLine=133758977;
 //BA.debugLineNum = 133758977;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133758978;
 //BA.debugLineNum = 133758978;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133758979;
 //BA.debugLineNum = 133758979;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133758980;
 //BA.debugLineNum = 133758980;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133758981;
 //BA.debugLineNum = 133758981;BA.debugLine="col.Put(\"headerCssClass\", \"italic\")";
_col.Put((Object)("headerCssClass"),(Object)("italic"));
RDebugUtils.currentLine=133758982;
 //BA.debugLineNum = 133758982;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133758984;
 //BA.debugLineNum = 133758984;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133758985;
 //BA.debugLineNum = 133758985;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnminwidth(b4j.example.vmgijgotable __ref,String _colfield,int _colminwidth,int _colpriority) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnminwidth", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnminwidth", new Object[] {_colfield,_colminwidth,_colpriority}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=132448256;
 //BA.debugLineNum = 132448256;BA.debugLine="Sub SetColumnMinWidth(colField As String, colMinWi";
RDebugUtils.currentLine=132448257;
 //BA.debugLineNum = 132448257;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
RDebugUtils.currentLine=132448258;
 //BA.debugLineNum = 132448258;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
RDebugUtils.currentLine=132448259;
 //BA.debugLineNum = 132448259;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colfield))) { 
RDebugUtils.currentLine=132448260;
 //BA.debugLineNum = 132448260;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colfield))));
RDebugUtils.currentLine=132448261;
 //BA.debugLineNum = 132448261;BA.debugLine="col.Put(\"minWidth\", colMinWidth)";
_col.Put((Object)("minWidth"),(Object)(_colminwidth));
RDebugUtils.currentLine=132448262;
 //BA.debugLineNum = 132448262;BA.debugLine="col.Put(\"priority\", colPriority)";
_col.Put((Object)("priority"),(Object)(_colpriority));
RDebugUtils.currentLine=132448263;
 //BA.debugLineNum = 132448263;BA.debugLine="columnsM.Put(colField,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colfield),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=132448265;
 //BA.debugLineNum = 132448265;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=132448266;
 //BA.debugLineNum = 132448266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnmodeeditonly(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _colfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnmodeeditonly", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnmodeeditonly", new Object[] {_colfield}));}
String _strcol = "";
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=129630208;
 //BA.debugLineNum = 129630208;BA.debugLine="Sub SetColumnModeEditOnly(colField As List) As VMG";
RDebugUtils.currentLine=129630209;
 //BA.debugLineNum = 129630209;BA.debugLine="For Each strCol As String In colField";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfield;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=129630210;
 //BA.debugLineNum = 129630210;BA.debugLine="strCol = strCol.Replace(\" \",\"\")";
_strcol = _strcol.replace(" ","");
RDebugUtils.currentLine=129630211;
 //BA.debugLineNum = 129630211;BA.debugLine="strCol = strCol.tolowercase";
_strcol = _strcol.toLowerCase();
RDebugUtils.currentLine=129630212;
 //BA.debugLineNum = 129630212;BA.debugLine="If columnsM.ContainsKey(strCol) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_strcol))) { 
RDebugUtils.currentLine=129630213;
 //BA.debugLineNum = 129630213;BA.debugLine="Dim col As Map = columnsM.Get(strCol)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strcol))));
RDebugUtils.currentLine=129630214;
 //BA.debugLineNum = 129630214;BA.debugLine="col.Put(\"mode\", \"editOnly\")";
_col.Put((Object)("mode"),(Object)("editOnly"));
RDebugUtils.currentLine=129630215;
 //BA.debugLineNum = 129630215;BA.debugLine="columnsM.Put(strCol,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strcol),(Object)(_col.getObject()));
 };
 }
};
RDebugUtils.currentLine=129630218;
 //BA.debugLineNum = 129630218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=129630219;
 //BA.debugLineNum = 129630219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnmodereadonly(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _colfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnmodereadonly", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnmodereadonly", new Object[] {_colfield}));}
String _strcol = "";
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=129564672;
 //BA.debugLineNum = 129564672;BA.debugLine="Sub SetColumnModeReadOnly(colField As List) As VMG";
RDebugUtils.currentLine=129564673;
 //BA.debugLineNum = 129564673;BA.debugLine="For Each strCol As String In colField";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfield;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=129564674;
 //BA.debugLineNum = 129564674;BA.debugLine="strCol = strCol.Replace(\" \",\"\")";
_strcol = _strcol.replace(" ","");
RDebugUtils.currentLine=129564675;
 //BA.debugLineNum = 129564675;BA.debugLine="strCol = strCol.tolowercase";
_strcol = _strcol.toLowerCase();
RDebugUtils.currentLine=129564676;
 //BA.debugLineNum = 129564676;BA.debugLine="If columnsM.ContainsKey(strCol) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_strcol))) { 
RDebugUtils.currentLine=129564677;
 //BA.debugLineNum = 129564677;BA.debugLine="Dim col As Map = columnsM.Get(strCol)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_strcol))));
RDebugUtils.currentLine=129564678;
 //BA.debugLineNum = 129564678;BA.debugLine="col.Put(\"mode\", \"readOnly\")";
_col.Put((Object)("mode"),(Object)("readOnly"));
RDebugUtils.currentLine=129564679;
 //BA.debugLineNum = 129564679;BA.debugLine="columnsM.Put(strCol,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strcol),(Object)(_col.getObject()));
 };
 }
};
RDebugUtils.currentLine=129564682;
 //BA.debugLineNum = 129564682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=129564683;
 //BA.debugLineNum = 129564683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnname(b4j.example.vmgijgotable __ref,String _colfield,String _colname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnname", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnname", new Object[] {_colfield,_colname}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=132972544;
 //BA.debugLineNum = 132972544;BA.debugLine="Sub SetColumnName(colField As String, colName As S";
RDebugUtils.currentLine=132972545;
 //BA.debugLineNum = 132972545;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
RDebugUtils.currentLine=132972546;
 //BA.debugLineNum = 132972546;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
RDebugUtils.currentLine=132972547;
 //BA.debugLineNum = 132972547;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colfield))) { 
RDebugUtils.currentLine=132972548;
 //BA.debugLineNum = 132972548;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colfield))));
RDebugUtils.currentLine=132972549;
 //BA.debugLineNum = 132972549;BA.debugLine="col.Put(\"name\", colName)";
_col.Put((Object)("name"),(Object)(_colname));
RDebugUtils.currentLine=132972550;
 //BA.debugLineNum = 132972550;BA.debugLine="columnsM.Put(colField,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colfield),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=132972552;
 //BA.debugLineNum = 132972552;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=132972553;
 //BA.debugLineNum = 132972553;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnrenderer(b4j.example.vmgijgotable __ref,String _colfield,String _colmethod) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnrenderer", true))
	 {return ((String) Debug.delegate(ba, "setcolumnrenderer", new Object[] {_colfield,_colmethod}));}
anywheresoftware.b4a.objects.collections.Map _value = null;
anywheresoftware.b4a.objects.collections.Map _record = null;
anywheresoftware.b4a.objects.collections.Map _cell = null;
anywheresoftware.b4a.objects.collections.Map _displayel = null;
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=130023424;
 //BA.debugLineNum = 130023424;BA.debugLine="Sub SetColumnRenderer(colField As String, colMetho";
RDebugUtils.currentLine=130023425;
 //BA.debugLineNum = 130023425;BA.debugLine="colMethod = colMethod.tolowercase";
_colmethod = _colmethod.toLowerCase();
RDebugUtils.currentLine=130023426;
 //BA.debugLineNum = 130023426;BA.debugLine="Dim value, record, cell, displayEl As Map";
_value = new anywheresoftware.b4a.objects.collections.Map();
_record = new anywheresoftware.b4a.objects.collections.Map();
_cell = new anywheresoftware.b4a.objects.collections.Map();
_displayel = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=130023427;
 //BA.debugLineNum = 130023427;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
RDebugUtils.currentLine=130023428;
 //BA.debugLineNum = 130023428;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
RDebugUtils.currentLine=130023429;
 //BA.debugLineNum = 130023429;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colfield))) { 
RDebugUtils.currentLine=130023430;
 //BA.debugLineNum = 130023430;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colfield))));
RDebugUtils.currentLine=130023431;
 //BA.debugLineNum = 130023431;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(mCallBack,$\"";
_col.Put((Object)("renderer"),__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._mcallback /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._eventname /*String*/ ))+"_"+__c.SmartStringFormatter("",(Object)(_colmethod))+""),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
RDebugUtils.currentLine=130023432;
 //BA.debugLineNum = 130023432;BA.debugLine="columnsM.Put(colField,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colfield),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=130023434;
 //BA.debugLineNum = 130023434;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setcolumnsalignmentcenter(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsalignmentcenter", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnsalignmentcenter", new Object[] {_flds}));}
RDebugUtils.currentLine=270532608;
 //BA.debugLineNum = 270532608;BA.debugLine="Sub SetColumnsAlignmentCenter(flds As List) As VMG";
RDebugUtils.currentLine=270532609;
 //BA.debugLineNum = 270532609;BA.debugLine="SetCenterAlignColumns(flds)";
__ref._setcenteraligncolumns /*b4j.example.vmgijgotable*/ (null,_flds);
RDebugUtils.currentLine=270532610;
 //BA.debugLineNum = 270532610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=270532611;
 //BA.debugLineNum = 270532611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnsalignmentright(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsalignmentright", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnsalignmentright", new Object[] {_flds}));}
RDebugUtils.currentLine=270598144;
 //BA.debugLineNum = 270598144;BA.debugLine="Sub SetColumnsAlignmentRight(flds As List) As VMGi";
RDebugUtils.currentLine=270598145;
 //BA.debugLineNum = 270598145;BA.debugLine="SetRightAlignColumns(flds)";
__ref._setrightaligncolumns /*b4j.example.vmgijgotable*/ (null,_flds);
RDebugUtils.currentLine=270598146;
 //BA.debugLineNum = 270598146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=270598147;
 //BA.debugLineNum = 270598147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setrightaligncolumns(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setrightaligncolumns", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setrightaligncolumns", new Object[] {_flds}));}
String _k = "";
RDebugUtils.currentLine=131858432;
 //BA.debugLineNum = 131858432;BA.debugLine="Sub SetRightAlignColumns(flds As List) As VMGijgoT";
RDebugUtils.currentLine=131858433;
 //BA.debugLineNum = 131858433;BA.debugLine="For Each k As String In flds";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flds;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=131858434;
 //BA.debugLineNum = 131858434;BA.debugLine="SetColumnAlignment(k, ALIGN_RIGHT)";
__ref._setcolumnalignment /*b4j.example.vmgijgotable*/ (null,_k,__ref._align_right /*String*/ );
 }
};
RDebugUtils.currentLine=131858436;
 //BA.debugLineNum = 131858436;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=131858437;
 //BA.debugLineNum = 131858437;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnsfilterable(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _colnames,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsfilterable", true))
	 {return ((String) Debug.delegate(ba, "setcolumnsfilterable", new Object[] {_colnames,_b}));}
String _col = "";
RDebugUtils.currentLine=271122432;
 //BA.debugLineNum = 271122432;BA.debugLine="Sub SetColumnsFilterable(colNames As List, b As Bo";
RDebugUtils.currentLine=271122433;
 //BA.debugLineNum = 271122433;BA.debugLine="For Each col As String In colNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=271122434;
 //BA.debugLineNum = 271122434;BA.debugLine="SetColumnFilterable(col, b)";
__ref._setcolumnfilterable /*b4j.example.vmgijgotable*/ (null,_col,_b);
 }
};
RDebugUtils.currentLine=271122436;
 //BA.debugLineNum = 271122436;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnsformat(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _colnames,String _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsformat", true))
	 {return ((String) Debug.delegate(ba, "setcolumnsformat", new Object[] {_colnames,_f}));}
String _col = "";
RDebugUtils.currentLine=271187968;
 //BA.debugLineNum = 271187968;BA.debugLine="Sub SetColumnsFormat(colNames As List, f As String";
RDebugUtils.currentLine=271187969;
 //BA.debugLineNum = 271187969;BA.debugLine="For Each col As String In colNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=271187970;
 //BA.debugLineNum = 271187970;BA.debugLine="SetColumnFormat(col, f)";
__ref._setcolumnformat /*b4j.example.vmgijgotable*/ (null,_col,_f);
 }
};
RDebugUtils.currentLine=271187972;
 //BA.debugLineNum = 271187972;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setcolumnsformatdate(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsformatdate", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnsformatdate", new Object[] {_dates}));}
RDebugUtils.currentLine=270663680;
 //BA.debugLineNum = 270663680;BA.debugLine="Sub SetColumnsFormatDate(dates As List) As VMGijgo";
RDebugUtils.currentLine=270663681;
 //BA.debugLineNum = 270663681;BA.debugLine="SetDateColumns(dates)";
__ref._setdatecolumns /*b4j.example.vmgijgotable*/ (null,_dates);
RDebugUtils.currentLine=270663682;
 //BA.debugLineNum = 270663682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=270663683;
 //BA.debugLineNum = 270663683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setdatecolumns(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setdatecolumns", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setdatecolumns", new Object[] {_dates}));}
String _k = "";
RDebugUtils.currentLine=132055040;
 //BA.debugLineNum = 132055040;BA.debugLine="Sub SetDateColumns(dates As List) As VMGijgoTable";
RDebugUtils.currentLine=132055041;
 //BA.debugLineNum = 132055041;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=132055042;
 //BA.debugLineNum = 132055042;BA.debugLine="SetColumnType(k, COLUMN_DATE)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_k,__ref._column_date /*String*/ );
 }
};
RDebugUtils.currentLine=132055044;
 //BA.debugLineNum = 132055044;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=132055045;
 //BA.debugLineNum = 132055045;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnsformatdatetime(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsformatdatetime", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnsformatdatetime", new Object[] {_dates}));}
RDebugUtils.currentLine=270729216;
 //BA.debugLineNum = 270729216;BA.debugLine="Sub SetColumnsFormatDateTime(dates As List) As VMG";
RDebugUtils.currentLine=270729217;
 //BA.debugLineNum = 270729217;BA.debugLine="SetDateTimeColumns(dates)";
__ref._setdatetimecolumns /*b4j.example.vmgijgotable*/ (null,_dates);
RDebugUtils.currentLine=270729218;
 //BA.debugLineNum = 270729218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=270729219;
 //BA.debugLineNum = 270729219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setdatetimecolumns(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setdatetimecolumns", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setdatetimecolumns", new Object[] {_dates}));}
String _k = "";
RDebugUtils.currentLine=132120576;
 //BA.debugLineNum = 132120576;BA.debugLine="Sub SetDateTimeColumns(dates As List) As VMGijgoTa";
RDebugUtils.currentLine=132120577;
 //BA.debugLineNum = 132120577;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=132120578;
 //BA.debugLineNum = 132120578;BA.debugLine="SetColumnType(k, COLUMN_DATETIME)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_k,__ref._column_datetime /*String*/ );
 }
};
RDebugUtils.currentLine=132120580;
 //BA.debugLineNum = 132120580;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=132120581;
 //BA.debugLineNum = 132120581;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnsformatfilesize(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsformatfilesize", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnsformatfilesize", new Object[] {_dates}));}
RDebugUtils.currentLine=270860288;
 //BA.debugLineNum = 270860288;BA.debugLine="Sub SetColumnsFormatFileSize(dates As List) As VMG";
RDebugUtils.currentLine=270860289;
 //BA.debugLineNum = 270860289;BA.debugLine="SetFileSizeColumns(dates)";
__ref._setfilesizecolumns /*b4j.example.vmgijgotable*/ (null,_dates);
RDebugUtils.currentLine=270860290;
 //BA.debugLineNum = 270860290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=270860291;
 //BA.debugLineNum = 270860291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setfilesizecolumns(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setfilesizecolumns", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setfilesizecolumns", new Object[] {_dates}));}
String _k = "";
RDebugUtils.currentLine=270794752;
 //BA.debugLineNum = 270794752;BA.debugLine="Sub SetFileSizeColumns(dates As List) As VMGijgoTa";
RDebugUtils.currentLine=270794753;
 //BA.debugLineNum = 270794753;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=270794754;
 //BA.debugLineNum = 270794754;BA.debugLine="SetColumnType(k, COLUMN_FILESIZE)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_k,__ref._column_filesize /*String*/ );
 }
};
RDebugUtils.currentLine=270794756;
 //BA.debugLineNum = 270794756;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=270794757;
 //BA.debugLineNum = 270794757;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnsformatmoney(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsformatmoney", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnsformatmoney", new Object[] {_dates}));}
RDebugUtils.currentLine=270991360;
 //BA.debugLineNum = 270991360;BA.debugLine="Sub SetColumnsFormatMoney(dates As List) As VMGijg";
RDebugUtils.currentLine=270991361;
 //BA.debugLineNum = 270991361;BA.debugLine="SetMoneyColumns(dates)";
__ref._setmoneycolumns /*b4j.example.vmgijgotable*/ (null,_dates);
RDebugUtils.currentLine=270991362;
 //BA.debugLineNum = 270991362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=270991363;
 //BA.debugLineNum = 270991363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnsformattime(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnsformattime", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnsformattime", new Object[] {_dates}));}
RDebugUtils.currentLine=270925824;
 //BA.debugLineNum = 270925824;BA.debugLine="Sub SetColumnsFormatTime(dates As List) As VMGijgo";
RDebugUtils.currentLine=270925825;
 //BA.debugLineNum = 270925825;BA.debugLine="SetTimeColumns(dates)";
__ref._settimecolumns /*b4j.example.vmgijgotable*/ (null,_dates);
RDebugUtils.currentLine=270925826;
 //BA.debugLineNum = 270925826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=270925827;
 //BA.debugLineNum = 270925827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _settimecolumns(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "settimecolumns", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "settimecolumns", new Object[] {_dates}));}
String _k = "";
RDebugUtils.currentLine=132186112;
 //BA.debugLineNum = 132186112;BA.debugLine="Sub SetTimeColumns(dates As List) As VMGijgoTable";
RDebugUtils.currentLine=132186113;
 //BA.debugLineNum = 132186113;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=132186114;
 //BA.debugLineNum = 132186114;BA.debugLine="SetColumnType(k, COLUMN_TIME)";
__ref._setcolumntype /*b4j.example.vmgijgotable*/ (null,_k,__ref._column_time /*String*/ );
 }
};
RDebugUtils.currentLine=132186116;
 //BA.debugLineNum = 132186116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=132186117;
 //BA.debugLineNum = 132186117;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnssortable(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _colnames,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnssortable", true))
	 {return ((String) Debug.delegate(ba, "setcolumnssortable", new Object[] {_colnames,_b}));}
String _col = "";
RDebugUtils.currentLine=271056896;
 //BA.debugLineNum = 271056896;BA.debugLine="Sub SetColumnsSortable(colNames As List, b As Bool";
RDebugUtils.currentLine=271056897;
 //BA.debugLineNum = 271056897;BA.debugLine="For Each col As String In colNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=271056898;
 //BA.debugLineNum = 271056898;BA.debugLine="SetColumnSortable(col, b)";
__ref._setcolumnsortable /*b4j.example.vmgijgotable*/ (null,_col,_b);
 }
};
RDebugUtils.currentLine=271056900;
 //BA.debugLineNum = 271056900;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setcolumnstoppropagation(b4j.example.vmgijgotable __ref,String _colname,boolean _colstoppropagation) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumnstoppropagation", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumnstoppropagation", new Object[] {_colname,_colstoppropagation}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133103616;
 //BA.debugLineNum = 133103616;BA.debugLine="Sub SetColumnStopPropagation(colName As String, co";
RDebugUtils.currentLine=133103617;
 //BA.debugLineNum = 133103617;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133103618;
 //BA.debugLineNum = 133103618;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133103620;
 //BA.debugLineNum = 133103620;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133103621;
 //BA.debugLineNum = 133103621;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133103622;
 //BA.debugLineNum = 133103622;BA.debugLine="col.Put(\"stopPropagation\", colStopPropagation)";
_col.Put((Object)("stopPropagation"),(Object)(_colstoppropagation));
RDebugUtils.currentLine=133103623;
 //BA.debugLineNum = 133103623;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133103625;
 //BA.debugLineNum = 133103625;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133103626;
 //BA.debugLineNum = 133103626;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumntooltip(b4j.example.vmgijgotable __ref,String _colname,String _coltooltip) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setcolumntooltip", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setcolumntooltip", new Object[] {_colname,_coltooltip}));}
anywheresoftware.b4a.objects.collections.Map _col = null;
RDebugUtils.currentLine=133038080;
 //BA.debugLineNum = 133038080;BA.debugLine="Sub SetColumnToolTip(colName As String, colToolTip";
RDebugUtils.currentLine=133038081;
 //BA.debugLineNum = 133038081;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
RDebugUtils.currentLine=133038082;
 //BA.debugLineNum = 133038082;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
RDebugUtils.currentLine=133038084;
 //BA.debugLineNum = 133038084;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_colname))) { 
RDebugUtils.currentLine=133038085;
 //BA.debugLineNum = 133038085;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colname))));
RDebugUtils.currentLine=133038086;
 //BA.debugLineNum = 133038086;BA.debugLine="col.Put(\"tooltip\", colToolTip)";
_col.Put((Object)("tooltip"),(Object)(_coltooltip));
RDebugUtils.currentLine=133038087;
 //BA.debugLineNum = 133038087;BA.debugLine="columnsM.Put(colName,col)";
__ref._columnsm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_colname),(Object)(_col.getObject()));
 };
RDebugUtils.currentLine=133038089;
 //BA.debugLineNum = 133038089;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=133038090;
 //BA.debugLineNum = 133038090;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setdisabled(b4j.example.vmgijgotable __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=128974848;
 //BA.debugLineNum = 128974848;BA.debugLine="Sub SetDisabled(b As Boolean) As VMGijgoTable";
RDebugUtils.currentLine=128974849;
 //BA.debugLineNum = 128974849;BA.debugLine="Table.SetDisabled(b)";
__ref._table /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=128974850;
 //BA.debugLineNum = 128974850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=128974851;
 //BA.debugLineNum = 128974851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setkey(b4j.example.vmgijgotable __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=128712704;
 //BA.debugLineNum = 128712704;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMGijg";
RDebugUtils.currentLine=128712705;
 //BA.debugLineNum = 128712705;BA.debugLine="Table.SetKey(k, bind)";
__ref._table /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=128712706;
 //BA.debugLineNum = 128712706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=128712707;
 //BA.debugLineNum = 128712707;BA.debugLine="End Sub";
return null;
}
public String  _setselected(b4j.example.vmgijgotable __ref,int _rowpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setselected", true))
	 {return ((String) Debug.delegate(ba, "setselected", new Object[] {_rowpos}));}
RDebugUtils.currentLine=132907008;
 //BA.debugLineNum = 132907008;BA.debugLine="Sub SetSelected(rowPos As Int)";
RDebugUtils.currentLine=132907009;
 //BA.debugLineNum = 132907009;BA.debugLine="grid.runmethod(\"setSelected\", Array(rowPos))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("setSelected",(Object)(new Object[]{(Object)(_rowpos)}));
RDebugUtils.currentLine=132907010;
 //BA.debugLineNum = 132907010;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setstyle(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=128581632;
 //BA.debugLineNum = 128581632;BA.debugLine="Sub SetStyle(sm As Map) As VMGijgoTable";
RDebugUtils.currentLine=128581633;
 //BA.debugLineNum = 128581633;BA.debugLine="Table.SetStyle(sm)";
__ref._table /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=128581634;
 //BA.debugLineNum = 128581634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=128581635;
 //BA.debugLineNum = 128581635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setvif(b4j.example.vmgijgotable __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=128647168;
 //BA.debugLineNum = 128647168;BA.debugLine="Sub SetVIf(vif As Object) As VMGijgoTable";
RDebugUtils.currentLine=128647169;
 //BA.debugLineNum = 128647169;BA.debugLine="Table.SetVIf(vif)";
__ref._table /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=128647170;
 //BA.debugLineNum = 128647170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=128647171;
 //BA.debugLineNum = 128647171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setvshow(b4j.example.vmgijgotable __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmgijgotable) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=128778240;
 //BA.debugLineNum = 128778240;BA.debugLine="Sub SetVShow(vif As Object) As VMGijgoTable";
RDebugUtils.currentLine=128778241;
 //BA.debugLineNum = 128778241;BA.debugLine="Table.SetVShow(vif)";
__ref._table /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=128778242;
 //BA.debugLineNum = 128778242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
RDebugUtils.currentLine=128778243;
 //BA.debugLineNum = 128778243;BA.debugLine="End Sub";
return null;
}
public String  _showcolumn(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.List _colfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "showcolumn", true))
	 {return ((String) Debug.delegate(ba, "showcolumn", new Object[] {_colfield}));}
String _strcol = "";
RDebugUtils.currentLine=130416640;
 //BA.debugLineNum = 130416640;BA.debugLine="Sub ShowColumn(colField As List)";
RDebugUtils.currentLine=130416641;
 //BA.debugLineNum = 130416641;BA.debugLine="For Each strCol As String In colField";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfield;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=130416642;
 //BA.debugLineNum = 130416642;BA.debugLine="grid.RunMethod(\"showColumn\",Array(strCol))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("showColumn",(Object)(new Object[]{(Object)(_strcol)}));
 }
};
RDebugUtils.currentLine=130416644;
 //BA.debugLineNum = 130416644;BA.debugLine="End Sub";
return "";
}
public String  _unselectall(b4j.example.vmgijgotable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "unselectall", true))
	 {return ((String) Debug.delegate(ba, "unselectall", null));}
RDebugUtils.currentLine=132710400;
 //BA.debugLineNum = 132710400;BA.debugLine="Sub UnSelectAll";
RDebugUtils.currentLine=132710401;
 //BA.debugLineNum = 132710401;BA.debugLine="grid.RunMethod(\"unSelectAll\", Null)";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("unSelectAll",__c.Null);
RDebugUtils.currentLine=132710402;
 //BA.debugLineNum = 132710402;BA.debugLine="End Sub";
return "";
}
public String  _updaterow(b4j.example.vmgijgotable __ref,anywheresoftware.b4a.objects.collections.Map _rowdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgijgotable";
if (Debug.shouldDelegate(ba, "updaterow", true))
	 {return ((String) Debug.delegate(ba, "updaterow", new Object[] {_rowdata}));}
String _pk = "";
RDebugUtils.currentLine=130875392;
 //BA.debugLineNum = 130875392;BA.debugLine="Sub UpdateRow(rowData As Map)";
RDebugUtils.currentLine=130875393;
 //BA.debugLineNum = 130875393;BA.debugLine="Dim pk As String = rowData.Get(PrimaryKey)";
_pk = BA.ObjectToString(_rowdata.Get((Object)(__ref._primarykey /*String*/ )));
RDebugUtils.currentLine=130875394;
 //BA.debugLineNum = 130875394;BA.debugLine="grid.runmethod(\"updateRow\", Array(pk, rowData))";
__ref._grid /*com.ab.banano.BANanoObject*/ .RunMethod("updateRow",(Object)(new Object[]{(Object)(_pk),(Object)(_rowdata.getObject())}));
RDebugUtils.currentLine=130875395;
 //BA.debugLineNum = 130875395;BA.debugLine="End Sub";
return "";
}
}