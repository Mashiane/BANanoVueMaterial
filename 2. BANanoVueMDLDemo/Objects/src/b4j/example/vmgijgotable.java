package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmgijgotable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmgijgotable", this);
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
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
public b4j.example.vmgijgotable  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub AddClass(c As String) As VMGijgoTable";
 //BA.debugLineNum = 140;BA.debugLine="Table.AddClass(c)";
_table._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _addcolumn(String _colname,String _coltitle) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 471;BA.debugLine="Sub AddColumn(colName As String, colTitle As Strin";
 //BA.debugLineNum = 473;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 474;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 475;BA.debugLine="Dim col As Map = CreateMap(\"field\":colName,\"title";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col = __c.createMap(new Object[] {(Object)("field"),(Object)(_colname),(Object)("title"),(Object)(_coltitle)});
 //BA.debugLineNum = 476;BA.debugLine="col.Put(\"type\", COLUMN_TEXT)";
_col.Put((Object)("type"),(Object)(_column_text));
 //BA.debugLineNum = 481;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 //BA.debugLineNum = 482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _addcolumn1(String _colname,String _coltitle,String _coltype,int _colwidth,boolean _colsortable,String _colalign) throws Exception{
anywheresoftware.b4a.objects.collections.Map _value = null;
anywheresoftware.b4a.objects.collections.Map _record = null;
anywheresoftware.b4a.objects.collections.Map _cell = null;
anywheresoftware.b4a.objects.collections.Map _displayel = null;
anywheresoftware.b4a.objects.collections.Map _col = null;
anywheresoftware.b4a.objects.collections.Map _events = null;
 //BA.debugLineNum = 487;BA.debugLine="Sub AddColumn1(colName As String, colTitle As Stri";
 //BA.debugLineNum = 488;BA.debugLine="Dim value, record, cell, displayEl As Map";
_value = new anywheresoftware.b4a.objects.collections.Map();
_record = new anywheresoftware.b4a.objects.collections.Map();
_cell = new anywheresoftware.b4a.objects.collections.Map();
_displayel = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 490;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 491;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 492;BA.debugLine="Dim col As Map = CreateMap(\"field\":colName,\"title";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col = __c.createMap(new Object[] {(Object)("field"),(Object)(_colname),(Object)("title"),(Object)(_coltitle)});
 //BA.debugLineNum = 493;BA.debugLine="If colWidth > 0 Then col.Put(\"width\", colWidth)";
if (_colwidth>0) { 
_col.Put((Object)("width"),(Object)(_colwidth));};
 //BA.debugLineNum = 494;BA.debugLine="If colSortable Then	col.Put(\"sortable\", colSortab";
if (_colsortable) { 
_col.Put((Object)("sortable"),(Object)(_colsortable));};
 //BA.debugLineNum = 495;BA.debugLine="If colType <> COLUMN_NONE Then col.Put(\"type\", co";
if ((_coltype).equals(_column_none) == false) { 
_col.Put((Object)("type"),(Object)(_coltype));};
 //BA.debugLineNum = 496;BA.debugLine="Select Case colAlign";
switch (BA.switchObjectToInt(_colalign,_align_center,_align_right)) {
case 0: 
case 1: {
 //BA.debugLineNum = 498;BA.debugLine="col.Put(\"align\", colAlign)";
_col.Put((Object)("align"),(Object)(_colalign));
 break; }
}
;
 //BA.debugLineNum = 500;BA.debugLine="col.Put(\"filterable\", True)";
_col.Put((Object)("filterable"),(Object)(__c.True));
 //BA.debugLineNum = 501;BA.debugLine="Dim events As Map";
_events = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 502;BA.debugLine="events.Initialize";
_events.Initialize();
 //BA.debugLineNum = 503;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
 //BA.debugLineNum = 504;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,_column_image,_column_money,_column_filesize,_column_date,_column_time,_column_datetime,_column_iconrender)) {
case 0: {
 //BA.debugLineNum = 506;BA.debugLine="col.Put(\"type\", \"text\")";
_col.Put((Object)("type"),(Object)("text"));
 //BA.debugLineNum = 507;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"imageren";
_col.Put((Object)("renderer"),_banano.CallBack(this,"imagerender",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
 break; }
case 1: {
 //BA.debugLineNum = 509;BA.debugLine="col.Put(\"type\", \"text\")";
_col.Put((Object)("type"),(Object)("text"));
 //BA.debugLineNum = 510;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"moneyren";
_col.Put((Object)("renderer"),_banano.CallBack(this,"moneyrender",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
 break; }
case 2: {
 //BA.debugLineNum = 512;BA.debugLine="col.Put(\"type\", \"text\")";
_col.Put((Object)("type"),(Object)("text"));
 //BA.debugLineNum = 513;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"filerend";
_col.Put((Object)("renderer"),_banano.CallBack(this,"filerender",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
 break; }
case 3: {
 //BA.debugLineNum = 515;BA.debugLine="col.Put(\"format\", \"yyyy-mm-dd\")";
_col.Put((Object)("format"),(Object)("yyyy-mm-dd"));
 break; }
case 4: {
 //BA.debugLineNum = 517;BA.debugLine="col.Put(\"format\", \"HH:MM\")";
_col.Put((Object)("format"),(Object)("HH:MM"));
 break; }
case 5: {
 //BA.debugLineNum = 519;BA.debugLine="col.Put(\"format\", \"yyyy-mm-dd HH:MM\")";
_col.Put((Object)("format"),(Object)("yyyy-mm-dd HH:MM"));
 break; }
case 6: {
 //BA.debugLineNum = 521;BA.debugLine="col.Put(\"type\", \"text\")";
_col.Put((Object)("type"),(Object)("text"));
 //BA.debugLineNum = 522;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"iconrend";
_col.Put((Object)("renderer"),_banano.CallBack(this,"iconrender",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
 break; }
}
;
 //BA.debugLineNum = 524;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 //BA.debugLineNum = 525;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 526;BA.debugLine="End Sub";
return null;
}
public String  _addcolumns(anywheresoftware.b4a.objects.collections.Map _flds) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 588;BA.debugLine="Sub AddColumns(flds As Map)";
 //BA.debugLineNum = 589;BA.debugLine="For Each k As String In flds.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flds.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 590;BA.debugLine="Dim v As String = flds.Get(k)";
_v = BA.ObjectToString(_flds.Get((Object)(_k)));
 //BA.debugLineNum = 591;BA.debugLine="AddColumn(k, v)";
_addcolumn(_k,_v);
 //BA.debugLineNum = 592;BA.debugLine="SetColumnSortable(k, True)";
_setcolumnsortable(_k,__c.True);
 }
};
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return "";
}
public String  _adddelete() throws Exception{
 //BA.debugLineNum = 572;BA.debugLine="Sub AddDelete";
 //BA.debugLineNum = 573;BA.debugLine="AddIconDelete(\"delete\", \"Delete\")";
_addicondelete("delete","Delete");
 //BA.debugLineNum = 574;BA.debugLine="SetColumnClickEvent(\"delete\", True)";
_setcolumnclickevent("delete",__c.True);
 //BA.debugLineNum = 575;BA.debugLine="End Sub";
return "";
}
public String  _adddownload() throws Exception{
 //BA.debugLineNum = 100;BA.debugLine="Sub AddDownload";
 //BA.debugLineNum = 101;BA.debugLine="AddIcon(\"download\",\"Get\",\"attach_file\",\"80\")";
_addicon("download","Get","attach_file","80");
 //BA.debugLineNum = 102;BA.debugLine="SetColumnClickEvent(\"download\", True)";
_setcolumnclickevent("download",__c.True);
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public String  _addedit() throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="Sub AddEdit";
 //BA.debugLineNum = 578;BA.debugLine="AddIconEdit(\"edit\", \"Edit\")";
_addiconedit("edit","Edit");
 //BA.debugLineNum = 579;BA.debugLine="SetColumnClickEvent(\"edit\", True)";
_setcolumnclickevent("edit",__c.True);
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return "";
}
public String  _addedittrash() throws Exception{
 //BA.debugLineNum = 565;BA.debugLine="Sub AddEditTrash";
 //BA.debugLineNum = 566;BA.debugLine="AddIconEdit(\"edit\", \"Edit\")";
_addiconedit("edit","Edit");
 //BA.debugLineNum = 567;BA.debugLine="SetColumnClickEvent(\"edit\", True)";
_setcolumnclickevent("edit",__c.True);
 //BA.debugLineNum = 568;BA.debugLine="AddIconDelete(\"delete\", \"Delete\")";
_addicondelete("delete","Delete");
 //BA.debugLineNum = 569;BA.debugLine="SetColumnClickEvent(\"delete\", True)";
_setcolumnclickevent("delete",__c.True);
 //BA.debugLineNum = 570;BA.debugLine="End Sub";
return "";
}
public String  _addicon(String _colfield,String _coltitle,String _colicon,String _colwidth) throws Exception{
String _sicon = "";
 //BA.debugLineNum = 529;BA.debugLine="Sub AddIcon(colField As String, colTitle As String";
 //BA.debugLineNum = 530;BA.debugLine="Dim sIcon As String";
_sicon = "";
 //BA.debugLineNum = 531;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(_iconslibrary,"materialicons","fontawesome")) {
case 0: {
 //BA.debugLineNum = 533;BA.debugLine="sIcon = $\"<span class=\"material-icons gj-cursor";
_sicon = ("<span class=\"material-icons gj-cursor-pointer\">"+__c.SmartStringFormatter("",(Object)(_colicon))+"</span>");
 break; }
case 1: {
 //BA.debugLineNum = 535;BA.debugLine="sIcon = $\"<span class=\"${colIcon} gj-cursor-poi";
_sicon = ("<span class=\""+__c.SmartStringFormatter("",(Object)(_colicon))+" gj-cursor-pointer\"></span>");
 break; }
}
;
 //BA.debugLineNum = 537;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 538;BA.debugLine="SetColumnTmpl(colField,sIcon)";
_setcolumntmpl(_colfield,_sicon);
 //BA.debugLineNum = 539;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 540;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
_setcolumntype(_colfield,_column_none);
 //BA.debugLineNum = 541;BA.debugLine="SetColumnWidth(colField, colWidth)";
_setcolumnwidth(_colfield,_colwidth);
 //BA.debugLineNum = 542;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 543;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
_setcolumnalignment(_colfield,_align_center);
 //BA.debugLineNum = 544;BA.debugLine="End Sub";
return "";
}
public String  _addicondelete(String _colfield,String _coltitle) throws Exception{
String _delicon = "";
 //BA.debugLineNum = 597;BA.debugLine="Sub AddIconDelete(colField As String, colTitle As";
 //BA.debugLineNum = 598;BA.debugLine="Dim DelIcon As String";
_delicon = "";
 //BA.debugLineNum = 599;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(_iconslibrary,"materialicons","fontawesome")) {
case 0: {
 //BA.debugLineNum = 601;BA.debugLine="DelIcon = $\"<span class=\"material-icons gj-curs";
_delicon = ("<span class=\"material-icons gj-cursor-pointer\">delete</span>");
 break; }
case 1: {
 //BA.debugLineNum = 603;BA.debugLine="DelIcon = $\"<span class=\"fa fa-remove gj-cursor";
_delicon = ("<span class=\"fa fa-remove gj-cursor-pointer\"></span>");
 break; }
}
;
 //BA.debugLineNum = 605;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 606;BA.debugLine="SetColumnTmpl(colField,DelIcon)";
_setcolumntmpl(_colfield,_delicon);
 //BA.debugLineNum = 607;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 608;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
_setcolumntype(_colfield,_column_none);
 //BA.debugLineNum = 609;BA.debugLine="SetColumnWidth(colField, \"80\")";
_setcolumnwidth(_colfield,"80");
 //BA.debugLineNum = 610;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 611;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
_setcolumnalignment(_colfield,_align_center);
 //BA.debugLineNum = 612;BA.debugLine="End Sub";
return "";
}
public String  _addiconedit(String _colfield,String _coltitle) throws Exception{
String _editicon = "";
 //BA.debugLineNum = 547;BA.debugLine="Sub AddIconEdit(colField As String, colTitle As St";
 //BA.debugLineNum = 548;BA.debugLine="Dim EditIcon As String";
_editicon = "";
 //BA.debugLineNum = 549;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(_iconslibrary,"materialicons","fontawesome")) {
case 0: {
 //BA.debugLineNum = 551;BA.debugLine="EditIcon = $\"<span class=\"material-icons gj-cur";
_editicon = ("<span class=\"material-icons gj-cursor-pointer\">edit</span>");
 break; }
case 1: {
 //BA.debugLineNum = 553;BA.debugLine="EditIcon = $\"<span class=\"fa fa-pencil gj-curso";
_editicon = ("<span class=\"fa fa-pencil gj-cursor-pointer\"></span>");
 break; }
}
;
 //BA.debugLineNum = 555;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 556;BA.debugLine="SetColumnTmpl(colField,EditIcon)";
_setcolumntmpl(_colfield,_editicon);
 //BA.debugLineNum = 557;BA.debugLine="SetColumnFilterable(colField,False)";
_setcolumnfilterable(_colfield,__c.False);
 //BA.debugLineNum = 558;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
_setcolumntype(_colfield,_column_none);
 //BA.debugLineNum = 559;BA.debugLine="SetColumnWidth(colField, \"80\")";
_setcolumnwidth(_colfield,"80");
 //BA.debugLineNum = 560;BA.debugLine="SetColumnSortable(colField, False)";
_setcolumnsortable(_colfield,__c.False);
 //BA.debugLineNum = 561;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
_setcolumnalignment(_colfield,_align_center);
 //BA.debugLineNum = 562;BA.debugLine="End Sub";
return "";
}
public String  _addparamater(String _paramname,String _paramvalue) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub AddParamater(paramName As String, paramValue A";
 //BA.debugLineNum = 165;BA.debugLine="params.Put(paramName,paramValue)";
_params.Put((Object)(_paramname),(Object)(_paramvalue));
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _addprint() throws Exception{
 //BA.debugLineNum = 582;BA.debugLine="Sub AddPrint";
 //BA.debugLineNum = 583;BA.debugLine="AddIcon(\"print\", \"Print\", \"print\", 80)";
_addicon("print","Print","print",BA.NumberToString(80));
 //BA.debugLineNum = 584;BA.debugLine="SetColumnClickEvent(\"print\", True)";
_setcolumnclickevent("print",__c.True);
 //BA.debugLineNum = 585;BA.debugLine="End Sub";
return "";
}
public String  _addrow(anywheresoftware.b4a.objects.collections.Map _rowdata) throws Exception{
 //BA.debugLineNum = 928;BA.debugLine="Sub AddRow(rowData As Map)";
 //BA.debugLineNum = 929;BA.debugLine="If grid = Null Then Refresh";
if (_grid== null) { 
_refresh();};
 //BA.debugLineNum = 930;BA.debugLine="grid.RunMethod(\"addRow\", Array(rowData))";
_grid.RunMethod("addRow",(Object)(new Object[]{(Object)(_rowdata.getObject())}));
 //BA.debugLineNum = 931;BA.debugLine="End Sub";
return "";
}
public String  _addtemplate(String _colfield,String _coltitle,String _coltemplate,String _colwidth,boolean _colsortable,String _colalign) throws Exception{
 //BA.debugLineNum = 616;BA.debugLine="Sub AddTemplate(colField As String, colTitle As St";
 //BA.debugLineNum = 617;BA.debugLine="AddColumn(colField,colTitle)";
_addcolumn(_colfield,_coltitle);
 //BA.debugLineNum = 618;BA.debugLine="SetColumnTmpl(colField,colTemplate)";
_setcolumntmpl(_colfield,_coltemplate);
 //BA.debugLineNum = 619;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
_setcolumntype(_colfield,_column_none);
 //BA.debugLineNum = 620;BA.debugLine="SetColumnWidth(colField, colWidth)";
_setcolumnwidth(_colfield,_colwidth);
 //BA.debugLineNum = 621;BA.debugLine="SetColumnSortable(colField, colSortable)";
_setcolumnsortable(_colfield,_colsortable);
 //BA.debugLineNum = 622;BA.debugLine="SetColumnAlignment(colField, colAlign)";
_setcolumnalignment(_colfield,_colalign);
 //BA.debugLineNum = 623;BA.debugLine="End Sub";
return "";
}
public String  _cancel(String _pk) throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub Cancel(pk As String)";
 //BA.debugLineNum = 170;BA.debugLine="grid.RunMethod(\"cancel\", Array(pk))";
_grid.RunMethod("cancel",(Object)(new Object[]{(Object)(_pk)}));
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Table As VMElement";
_table = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Public InlineEditing As Boolean = False";
_inlineediting = __c.False;
 //BA.debugLineNum = 7;BA.debugLine="Public InlineEditingMode As String = \"click\"";
_inlineeditingmode = "click";
 //BA.debugLineNum = 8;BA.debugLine="Public InlineEditingManagementColumn As Boolean =";
_inlineeditingmanagementcolumn = __c.True;
 //BA.debugLineNum = 9;BA.debugLine="Public Width As String = 0";
_width = BA.NumberToString(0);
 //BA.debugLineNum = 10;BA.debugLine="Private grid As BANanoObject";
_grid = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 11;BA.debugLine="Public PrimaryKey As String = \"id\"";
_primarykey = "id";
 //BA.debugLineNum = 12;BA.debugLine="Public PagerLimit As Int = 10";
_pagerlimit = (int) (10);
 //BA.debugLineNum = 13;BA.debugLine="Private Columns As List";
_columns = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Public COLUMN_DATE As String = \"date\"";
_column_date = "date";
 //BA.debugLineNum = 16;BA.debugLine="Public COLUMN_TEXT As String = \"text\"";
_column_text = "text";
 //BA.debugLineNum = 17;BA.debugLine="Public COLUMN_ICON As String = \"icon\"";
_column_icon = "icon";
 //BA.debugLineNum = 18;BA.debugLine="Public COLUMN_CHECKBOX As String = \"checkbox\"";
_column_checkbox = "checkbox";
 //BA.debugLineNum = 19;BA.debugLine="Public COLUMN_DROPDOWN As String = \"dropdown\"";
_column_dropdown = "dropdown";
 //BA.debugLineNum = 20;BA.debugLine="Public COLUMN_NONE As String = \"\"";
_column_none = "";
 //BA.debugLineNum = 21;BA.debugLine="Public COLUMN_TIME As String = \"time\"";
_column_time = "time";
 //BA.debugLineNum = 22;BA.debugLine="Public COLUMN_DATETIME As String = \"datetime\"";
_column_datetime = "datetime";
 //BA.debugLineNum = 23;BA.debugLine="Public COLUMN_IMAGE As String = \"image\"";
_column_image = "image";
 //BA.debugLineNum = 24;BA.debugLine="Public COLUMN_MONEY As String = \"money\"";
_column_money = "money";
 //BA.debugLineNum = 25;BA.debugLine="Public COLUMN_FILESIZE As String = \"filesize\"";
_column_filesize = "filesize";
 //BA.debugLineNum = 26;BA.debugLine="Public COLUMN_ICONRENDER As String = \"iconrender\"";
_column_iconrender = "iconrender";
 //BA.debugLineNum = 29;BA.debugLine="Public ALIGN_CENTER As String = \"center\"";
_align_center = "center";
 //BA.debugLineNum = 30;BA.debugLine="Public ALIGN_RIGHT As String = \"right\"";
_align_right = "right";
 //BA.debugLineNum = 31;BA.debugLine="Public ALIGN_LEFT As String = \"left\"";
_align_left = "left";
 //BA.debugLineNum = 32;BA.debugLine="Public autoGenerateColumns As Boolean = False";
_autogeneratecolumns = __c.False;
 //BA.debugLineNum = 33;BA.debugLine="Public autoLoad As Boolean = True";
_autoload = __c.True;
 //BA.debugLineNum = 34;BA.debugLine="Public BodyRowHeight As String = \"fixed\"";
_bodyrowheight = "fixed";
 //BA.debugLineNum = 35;BA.debugLine="Private columnsM As Map";
_columnsm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 36;BA.debugLine="Public SelectionType As String = \"single\"";
_selectiontype = "single";
 //BA.debugLineNum = 37;BA.debugLine="Public ColumnReorder As Boolean = True";
_columnreorder = __c.True;
 //BA.debugLineNum = 38;BA.debugLine="Public DetailTemplate As String = \"\"";
_detailtemplate = "";
 //BA.debugLineNum = 39;BA.debugLine="Public KeepExpandedRows As Boolean = False";
_keepexpandedrows = __c.False;
 //BA.debugLineNum = 40;BA.debugLine="Public FixedHeader As Boolean = False";
_fixedheader = __c.False;
 //BA.debugLineNum = 41;BA.debugLine="Public HeaderFilter As Boolean = True";
_headerfilter = __c.True;
 //BA.debugLineNum = 42;BA.debugLine="Public HeaderFilterType As String = \"onchange\"";
_headerfiltertype = "onchange";
 //BA.debugLineNum = 43;BA.debugLine="Public ResizableColumns As Boolean = True";
_resizablecolumns = __c.True;
 //BA.debugLineNum = 44;BA.debugLine="Public ShowHiddenColumnsAsDetails As Boolean = Fa";
_showhiddencolumnsasdetails = __c.False;
 //BA.debugLineNum = 45;BA.debugLine="Private ExpandIcon As String = \"\"";
_expandicon = "";
 //BA.debugLineNum = 46;BA.debugLine="Private CollapseIcon As String = \"\"";
_collapseicon = "";
 //BA.debugLineNum = 47;BA.debugLine="Public RowReorder As Boolean = False";
_rowreorder = __c.False;
 //BA.debugLineNum = 48;BA.debugLine="Public SelectionMethod As String = \"basic\"";
_selectionmethod = "basic";
 //BA.debugLineNum = 49;BA.debugLine="Public IconsLibrary As String = \"materialicons\"";
_iconslibrary = "materialicons";
 //BA.debugLineNum = 50;BA.debugLine="Public MinWidth As Int = 0";
_minwidth = (int) (0);
 //BA.debugLineNum = 51;BA.debugLine="Public UILibrary As String = \"materialdesign\"";
_uilibrary = "materialdesign";
 //BA.debugLineNum = 52;BA.debugLine="Public ToolbarTemplate As String = \"\"";
_toolbartemplate = "";
 //BA.debugLineNum = 53;BA.debugLine="Private GroupBy As String = \"\"";
_groupby = "";
 //BA.debugLineNum = 54;BA.debugLine="Private DataSource As List";
_datasource = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 55;BA.debugLine="Public DataField As String = \"records\"";
_datafield = "records";
 //BA.debugLineNum = 56;BA.debugLine="Public ShowPager As Boolean = True";
_showpager = __c.True;
 //BA.debugLineNum = 57;BA.debugLine="Public TransparentBackground As Boolean = True";
_transparentbackground = __c.True;
 //BA.debugLineNum = 58;BA.debugLine="Private params As Map";
_params = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 59;BA.debugLine="Private Banano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 60;BA.debugLine="Private mCallBack As Object";
_mcallback = new Object();
 //BA.debugLineNum = 61;BA.debugLine="Private eventName As String";
_eventname = "";
 //BA.debugLineNum = 62;BA.debugLine="Public Options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 63;BA.debugLine="Public responsive As Boolean = True";
_responsive = __c.True;
 //BA.debugLineNum = 64;BA.debugLine="Private formats As Map";
_formats = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 65;BA.debugLine="Public N As BANanoObject";
_n = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 66;BA.debugLine="Public ToolBar As VMGrid";
_toolbar = new b4j.example.vmgrid();
 //BA.debugLineNum = 67;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 318;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 319;BA.debugLine="grid.RunMethod(\"clear\",Null)";
_grid.RunMethod("clear",__c.Null);
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return "";
}
public String  _collapseall() throws Exception{
 //BA.debugLineNum = 813;BA.debugLine="Sub CollapseAll";
 //BA.debugLineNum = 814;BA.debugLine="grid.RunMethod(\"collapseAll\", Null)";
_grid.RunMethod("collapseAll",__c.Null);
 //BA.debugLineNum = 815;BA.debugLine="End Sub";
return "";
}
public int  _countall() throws Exception{
int _cv = 0;
 //BA.debugLineNum = 348;BA.debugLine="Sub CountAll As Int";
 //BA.debugLineNum = 349;BA.debugLine="Dim cv As Int = grid.RunMethod(\"count\",Array(True";
_cv = (int)(BA.ObjectToNumber(_grid.RunMethod("count",(Object)(new Object[]{(Object)(__c.True)})).Result()));
 //BA.debugLineNum = 350;BA.debugLine="Return cv";
if (true) return _cv;
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return 0;
}
public int  _countvisible() throws Exception{
int _cv = 0;
 //BA.debugLineNum = 342;BA.debugLine="Sub CountVisible As Int";
 //BA.debugLineNum = 343;BA.debugLine="Dim cv As Int = grid.RunMethod(\"count\",Null).resu";
_cv = (int)(BA.ObjectToNumber(_grid.RunMethod("count",__c.Null).Result()));
 //BA.debugLineNum = 344;BA.debugLine="Return cv";
if (true) return _cv;
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return 0;
}
public String  _destroy() throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub Destroy";
 //BA.debugLineNum = 355;BA.debugLine="Try";
try { //BA.debugLineNum = 356;BA.debugLine="grid.RunMethod(\"destroy\", Array(True, True))";
_grid.RunMethod("destroy",(Object)(new Object[]{(Object)(__c.True),(Object)(__c.True)}));
 } 
       catch (Exception e4) {
			ba.setLastException(e4); //BA.debugLineNum = 358;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return "";
}
public String  _downloadcsv(String _filename) throws Exception{
 //BA.debugLineNum = 934;BA.debugLine="Sub DownloadCSV(fileName As String)";
 //BA.debugLineNum = 935;BA.debugLine="grid.RunMethod(\"downloadCSV\", Array(fileName,True";
_grid.RunMethod("downloadCSV",(Object)(new Object[]{(Object)(_filename),(Object)(__c.True)}));
 //BA.debugLineNum = 936;BA.debugLine="End Sub";
return "";
}
public String  _expandall() throws Exception{
 //BA.debugLineNum = 808;BA.debugLine="Sub ExpandAll";
 //BA.debugLineNum = 809;BA.debugLine="grid.RunMethod(\"expandAll\", Null)";
_grid.RunMethod("expandAll",__c.Null);
 //BA.debugLineNum = 810;BA.debugLine="End Sub";
return "";
}
public String  _filerender(Object _value,anywheresoftware.b4a.objects.collections.Map _record,com.ab.banano.BANanoObject _cell,com.ab.banano.BANanoObject _displayel) throws Exception{
com.ab.banano.BANanoElement _de = null;
 //BA.debugLineNum = 1043;BA.debugLine="Sub FileRender(value As Object, record As Map, cel";
 //BA.debugLineNum = 1044;BA.debugLine="If value = Null Then value = 0";
if (_value== null) { 
_value = (Object)(0);};
 //BA.debugLineNum = 1045;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displa";
_de = new com.ab.banano.BANanoElement();
_de = _banano.ToElement(_displayel);
 //BA.debugLineNum = 1046;BA.debugLine="value = N.Selector(value).RunMethod(\"format\",Arra";
_value = (Object)(_n.Selector(_value).RunMethod("format",(Object)(new Object[]{(Object)("0.00 b")})).getObject());
 //BA.debugLineNum = 1047;BA.debugLine="dE.SetText(value)";
_de.SetText(BA.ObjectToString(_value));
 //BA.debugLineNum = 1048;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getbyid(String _sid) throws Exception{
anywheresoftware.b4a.objects.collections.Map _res = null;
 //BA.debugLineNum = 302;BA.debugLine="Sub GetById(sID As String) As Map";
 //BA.debugLineNum = 303;BA.debugLine="Dim res As Map = grid.RunMethod(\"getById\", Array(";
_res = new anywheresoftware.b4a.objects.collections.Map();
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_grid.RunMethod("getById",(Object)(new Object[]{(Object)(_sid)})).Result()));
 //BA.debugLineNum = 304;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getbypos(int _rowpos) throws Exception{
anywheresoftware.b4a.objects.collections.Map _res = null;
 //BA.debugLineNum = 270;BA.debugLine="Sub GetByPos(rowPos As Int) As Map";
 //BA.debugLineNum = 271;BA.debugLine="Dim res As Map = grid.RunMethod(\"get\", Array(rowP";
_res = new anywheresoftware.b4a.objects.collections.Map();
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_grid.RunMethod("get",(Object)(new Object[]{(Object)(_rowpos)})).Result()));
 //BA.debugLineNum = 272;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 273;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getchanges() throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 863;BA.debugLine="Sub GetChanges As List";
 //BA.debugLineNum = 864;BA.debugLine="Dim res As List = grid.runmethod(\"getChanges\",Nul";
_res = new anywheresoftware.b4a.objects.collections.List();
_res.setObject((java.util.List)(_grid.RunMethod("getChanges",__c.Null).Result()));
 //BA.debugLineNum = 865;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 866;BA.debugLine="End Sub";
return null;
}
public String  _getcsv() throws Exception{
 //BA.debugLineNum = 939;BA.debugLine="Sub GetCSV";
 //BA.debugLineNum = 940;BA.debugLine="grid.RunMethod(\"getCSV\", Array(True))";
_grid.RunMethod("getCSV",(Object)(new Object[]{(Object)(__c.True)}));
 //BA.debugLineNum = 941;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getrecordfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
anywheresoftware.b4a.objects.collections.Map _record = null;
anywheresoftware.b4a.objects.collections.Map _res = null;
 //BA.debugLineNum = 180;BA.debugLine="Sub GetRecordFromEvent(e As BANanoEvent) As Map";
 //BA.debugLineNum = 181;BA.debugLine="Dim record As Map = e.OtherField(\"data\").Result";
_record = new anywheresoftware.b4a.objects.collections.Map();
_record.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_e.OtherField("data").Result()));
 //BA.debugLineNum = 182;BA.debugLine="Dim res As Map = record.Get(\"record\")";
_res = new anywheresoftware.b4a.objects.collections.Map();
_res.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_record.Get((Object)("record"))));
 //BA.debugLineNum = 183;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 184;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getrows() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 282;BA.debugLine="Sub GetRows() As List";
 //BA.debugLineNum = 283;BA.debugLine="Dim lst As List = grid.runmethod(\"getAll\", Array(";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst.setObject((java.util.List)(_grid.RunMethod("getAll",(Object)(new Object[]{(Object)(__c.True)})).Result()));
 //BA.debugLineNum = 284;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getrowsvisible() throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 276;BA.debugLine="Sub GetRowsVisible() As List";
 //BA.debugLineNum = 277;BA.debugLine="Dim lst As List = grid.runmethod(\"getAll\", Null).";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst.setObject((java.util.List)(_grid.RunMethod("getAll",__c.Null).Result()));
 //BA.debugLineNum = 278;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public String  _getselected() throws Exception{
String _res = "";
 //BA.debugLineNum = 786;BA.debugLine="Sub GetSelected As String";
 //BA.debugLineNum = 787;BA.debugLine="Dim res As String = grid.RunMethod(\"getSelected\",";
_res = BA.ObjectToString(_grid.RunMethod("getSelected",__c.Null).Result());
 //BA.debugLineNum = 788;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 789;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getselections() throws Exception{
anywheresoftware.b4a.objects.collections.List _res = null;
 //BA.debugLineNum = 792;BA.debugLine="Sub GetSelections As List";
 //BA.debugLineNum = 793;BA.debugLine="Dim res As List = grid.RunMethod(\"getSelections\",";
_res = new anywheresoftware.b4a.objects.collections.List();
_res.setObject((java.util.List)(_grid.RunMethod("getSelections",__c.Null).Result()));
 //BA.debugLineNum = 794;BA.debugLine="Return res";
if (true) return _res;
 //BA.debugLineNum = 795;BA.debugLine="End Sub";
return null;
}
public String  _hidecolumn(anywheresoftware.b4a.objects.collections.List _colname) throws Exception{
String _strcol = "";
 //BA.debugLineNum = 323;BA.debugLine="Sub HideColumn(colName As List)";
 //BA.debugLineNum = 324;BA.debugLine="For Each strCol As String In colName";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colname;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 325;BA.debugLine="grid.RunMethod(\"hideColumn\", Array(strCol))";
_grid.RunMethod("hideColumn",(Object)(new Object[]{(Object)(_strcol)}));
 }
};
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return "";
}
public String  _iconrender(Object _value,anywheresoftware.b4a.objects.collections.Map _record,com.ab.banano.BANanoObject _cell,com.ab.banano.BANanoObject _displayel) throws Exception{
String _sfontsize = "";
String _sfontcolor = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sstyle = "";
String _sicon = "";
com.ab.banano.BANanoElement _de = null;
 //BA.debugLineNum = 1016;BA.debugLine="Sub IconRender(value As Object, record As Map, cel";
 //BA.debugLineNum = 1017;BA.debugLine="If value = Null Then";
if (_value== null) { 
 //BA.debugLineNum = 1018;BA.debugLine="value = \"\"";
_value = (Object)("");
 //BA.debugLineNum = 1019;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1021;BA.debugLine="Dim sfontsize As String = record.Get(\"iconsize\")";
_sfontsize = BA.ObjectToString(_record.Get((Object)("iconsize")));
 //BA.debugLineNum = 1022;BA.debugLine="Dim sfontcolor As String = record.Get(\"iconcolor\"";
_sfontcolor = BA.ObjectToString(_record.Get((Object)("iconcolor")));
 //BA.debugLineNum = 1023;BA.debugLine="If sfontsize = Null Then sfontsize = \"\"";
if (_sfontsize== null) { 
_sfontsize = "";};
 //BA.debugLineNum = 1024;BA.debugLine="If sfontcolor = Null Then sfontcolor = \"\"";
if (_sfontcolor== null) { 
_sfontcolor = "";};
 //BA.debugLineNum = 1025;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1026;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1027;BA.debugLine="If sfontsize <> \"\" Then sb.Append($\"font-size:${s";
if ((_sfontsize).equals("") == false) { 
_sb.Append(("font-size:"+__c.SmartStringFormatter("",(Object)(_sfontsize))+"px;"));};
 //BA.debugLineNum = 1028;BA.debugLine="If sfontcolor <> \"\" Then sb.Append($\"color:${sfon";
if ((_sfontcolor).equals("") == false) { 
_sb.Append(("color:"+__c.SmartStringFormatter("",(Object)(_sfontcolor))+";"));};
 //BA.debugLineNum = 1029;BA.debugLine="Dim sStyle As String = sb.tostring";
_sstyle = _sb.ToString();
 //BA.debugLineNum = 1030;BA.debugLine="Dim sIcon As String = \"\"";
_sicon = "";
 //BA.debugLineNum = 1031;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(_iconslibrary,"materialicons","fontawesome")) {
case 0: {
 //BA.debugLineNum = 1033;BA.debugLine="sIcon = $\"<i class=\"material-icons gj-cursor-po";
_sicon = ("<i class=\"material-icons gj-cursor-pointer\" style=\""+__c.SmartStringFormatter("",(Object)(_sstyle))+"\">"+__c.SmartStringFormatter("",_value)+"</i>");
 break; }
case 1: {
 //BA.debugLineNum = 1035;BA.debugLine="sIcon = $\"<i class=\"${value} gj-cursor-pointer\"";
_sicon = ("<i class=\""+__c.SmartStringFormatter("",_value)+" gj-cursor-pointer\" style=\""+__c.SmartStringFormatter("",(Object)(_sstyle))+"\"></i>");
 break; }
}
;
 //BA.debugLineNum = 1037;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displa";
_de = new com.ab.banano.BANanoElement();
_de = _banano.ToElement(_displayel);
 //BA.debugLineNum = 1038;BA.debugLine="dE.SetHTML(sIcon)";
_de.SetHTML(_sicon);
 //BA.debugLineNum = 1039;BA.debugLine="End Sub";
return "";
}
public String  _imagerender(Object _value,anywheresoftware.b4a.objects.collections.Map _record,com.ab.banano.BANanoObject _cell,com.ab.banano.BANanoObject _displayel) throws Exception{
String _simagewidth = "";
String _simageheight = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _sstyle = "";
com.ab.banano.BANanoElement _de = null;
String _simg = "";
 //BA.debugLineNum = 1065;BA.debugLine="Sub ImageRender(value As Object, record As Map, ce";
 //BA.debugLineNum = 1067;BA.debugLine="If value <> Null Then";
if (_value!= null) { 
 //BA.debugLineNum = 1068;BA.debugLine="Dim simagewidth As String = record.Get(\"imagewid";
_simagewidth = BA.ObjectToString(_record.Get((Object)("imagewidth")));
 //BA.debugLineNum = 1069;BA.debugLine="Dim simageheight As String = record.Get(\"imagehe";
_simageheight = BA.ObjectToString(_record.Get((Object)("imageheight")));
 //BA.debugLineNum = 1070;BA.debugLine="If simagewidth = Null Then simagewidth = \"\"";
if (_simagewidth== null) { 
_simagewidth = "";};
 //BA.debugLineNum = 1071;BA.debugLine="If simageheight = Null Then simageheight = \"\"";
if (_simageheight== null) { 
_simageheight = "";};
 //BA.debugLineNum = 1072;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 1073;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 1074;BA.debugLine="If simageheight <> \"\" Then sb.Append($\"height:${";
if ((_simageheight).equals("") == false) { 
_sb.Append(("height:"+__c.SmartStringFormatter("",(Object)(_makepx(_simageheight)))+";"));};
 //BA.debugLineNum = 1075;BA.debugLine="If simagewidth <> \"\" Then sb.Append($\"width:${Ma";
if ((_simagewidth).equals("") == false) { 
_sb.Append(("width:"+__c.SmartStringFormatter("",(Object)(_makepx(_simagewidth)))+";"));};
 //BA.debugLineNum = 1076;BA.debugLine="Dim sStyle As String = sb.tostring";
_sstyle = _sb.ToString();
 //BA.debugLineNum = 1077;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displ";
_de = new com.ab.banano.BANanoElement();
_de = _banano.ToElement(_displayel);
 //BA.debugLineNum = 1078;BA.debugLine="Dim simg As String = $\"<img src=\"${value}\" alt=\"";
_simg = ("<img src=\""+__c.SmartStringFormatter("",_value)+"\" alt=\"\" style=\""+__c.SmartStringFormatter("",(Object)(_sstyle))+"\">");
 //BA.debugLineNum = 1079;BA.debugLine="dE.SetHTML(simg)";
_de.SetHTML(_simg);
 };
 //BA.debugLineNum = 1081;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _sprimarykey,Object _module) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 74;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 75;BA.debugLine="Banano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
_banano.DependsOnAsset("jquery-3.4.1.min.js");
 //BA.debugLineNum = 76;BA.debugLine="Banano.DependsOnAsset(\"gijgo.min.css\")";
_banano.DependsOnAsset("gijgo.min.css");
 //BA.debugLineNum = 77;BA.debugLine="Banano.DependsOnAsset(\"gijgo.min.js\")";
_banano.DependsOnAsset("gijgo.min.js");
 //BA.debugLineNum = 78;BA.debugLine="Banano.DependsOnAsset(\"fileSaver.min.js\")";
_banano.DependsOnAsset("fileSaver.min.js");
 //BA.debugLineNum = 79;BA.debugLine="Banano.DependsOnAsset(\"jszip.min.js\")";
_banano.DependsOnAsset("jszip.min.js");
 //BA.debugLineNum = 80;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 81;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 82;BA.debugLine="JQ = vue.jquery";
_jq = _vue._jquery /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 83;BA.debugLine="Table.Initialize(vue, ID).SetTag(\"table\")";
_table._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("table");
 //BA.debugLineNum = 84;BA.debugLine="mCallBack = module";
_mcallback = _module;
 //BA.debugLineNum = 85;BA.debugLine="eventName = ID";
_eventname = _id;
 //BA.debugLineNum = 86;BA.debugLine="PrimaryKey = sPrimaryKey";
_primarykey = _sprimarykey;
 //BA.debugLineNum = 87;BA.debugLine="columnsM.Initialize";
_columnsm.Initialize();
 //BA.debugLineNum = 88;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 89;BA.debugLine="params.Initialize";
_params.Initialize();
 //BA.debugLineNum = 90;BA.debugLine="formats.Initialize";
_formats.Initialize();
 //BA.debugLineNum = 91;BA.debugLine="N.Initialize(\"numeral\")";
_n.Initialize((Object)("numeral"));
 //BA.debugLineNum = 93;BA.debugLine="ToolBar.Initialize(vue, $\"${ID}tblBar\"$,module)";
_toolbar._initialize /*b4j.example.vmgrid*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"tblBar"),_module);
 //BA.debugLineNum = 94;BA.debugLine="ToolBar.AddRows(1)";
_toolbar._addrows /*b4j.example.vmgrid*/ ((int) (1));
 //BA.debugLineNum = 95;BA.debugLine="ToolBar.AddColumns(2,6,6,6,6)";
_toolbar._addcolumns /*b4j.example.vmgrid*/ ((int) (2),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6),BA.NumberToString(6));
 //BA.debugLineNum = 96;BA.debugLine="ToolBar.SetClass(1,2,\"text-right\")";
_toolbar._setclass /*String*/ ((int) (1),(int) (2),"text-right");
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 1084;BA.debugLine="private Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 1085;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1086;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
 //BA.debugLineNum = 1087;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vm")) { 
 //BA.debugLineNum = 1089;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("px")) { 
 //BA.debugLineNum = 1091;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("cm")) { 
 //BA.debugLineNum = 1093;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("mm")) { 
 //BA.debugLineNum = 1095;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("in")) { 
 //BA.debugLineNum = 1097;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pt")) { 
 //BA.debugLineNum = 1099;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pc")) { 
 //BA.debugLineNum = 1101;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("em")) { 
 //BA.debugLineNum = 1103;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ex")) { 
 //BA.debugLineNum = 1105;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ch")) { 
 //BA.debugLineNum = 1107;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("rem")) { 
 //BA.debugLineNum = 1109;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vw")) { 
 //BA.debugLineNum = 1111;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vh")) { 
 //BA.debugLineNum = 1113;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmin")) { 
 //BA.debugLineNum = 1115;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmax")) { 
 //BA.debugLineNum = 1117;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith(";")) { 
 //BA.debugLineNum = 1119;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
 //BA.debugLineNum = 1121;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
 //BA.debugLineNum = 1122;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+__c.SmartStringFormatter("",(Object)(_svalue))+"px");
 //BA.debugLineNum = 1123;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
 //BA.debugLineNum = 1124;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 1126;BA.debugLine="End Sub";
return "";
}
public String  _moneyrender(Object _value,anywheresoftware.b4a.objects.collections.Map _record,com.ab.banano.BANanoObject _cell,com.ab.banano.BANanoObject _displayel) throws Exception{
com.ab.banano.BANanoElement _de = null;
 //BA.debugLineNum = 1057;BA.debugLine="Sub MoneyRender(value As Object, record As Map, ce";
 //BA.debugLineNum = 1058;BA.debugLine="If value = Null Then value = 0";
if (_value== null) { 
_value = (Object)(0);};
 //BA.debugLineNum = 1059;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displa";
_de = new com.ab.banano.BANanoElement();
_de = _banano.ToElement(_displayel);
 //BA.debugLineNum = 1060;BA.debugLine="value = N.Selector(value).RunMethod(\"format\",Arra";
_value = (Object)(_n.Selector(_value).RunMethod("format",(Object)(new Object[]{(Object)("(0,0.00)")})).getObject());
 //BA.debugLineNum = 1061;BA.debugLine="dE.SetText(value)";
_de.SetText(BA.ObjectToString(_value));
 //BA.debugLineNum = 1062;BA.debugLine="End Sub";
return "";
}
public String  _numeralformat(String _svalue,String _sformat) throws Exception{
 //BA.debugLineNum = 1051;BA.debugLine="Sub NumeralFormat(sValue As String,sFormat As Stri";
 //BA.debugLineNum = 1052;BA.debugLine="sValue = N.Selector(sValue).RunMethod(\"format\",Ar";
_svalue = BA.ObjectToString(_n.Selector((Object)(_svalue)).RunMethod("format",(Object)(new Object[]{(Object)(_sformat)})).Result());
 //BA.debugLineNum = 1053;BA.debugLine="Return sValue";
if (true) return _svalue;
 //BA.debugLineNum = 1054;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 159;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 160;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _refresh() throws Exception{
anywheresoftware.b4a.objects.collections.List _sizes = null;
anywheresoftware.b4a.objects.collections.Map _pager = null;
anywheresoftware.b4a.objects.collections.Map _mapping = null;
anywheresoftware.b4a.objects.collections.Map _column = null;
anywheresoftware.b4a.objects.collections.Map _inlineeditingobject = null;
anywheresoftware.b4a.objects.collections.Map _hf = null;
anywheresoftware.b4a.objects.collections.Map _icn = null;
 //BA.debugLineNum = 371;BA.debugLine="Sub Refresh As VMGijgoTable";
 //BA.debugLineNum = 372;BA.debugLine="If grid <> Null Then Destroy";
if (_grid!= null) { 
_destroy();};
 //BA.debugLineNum = 373;BA.debugLine="Select Case IconsLibrary";
switch (BA.switchObjectToInt(_iconslibrary,"materialicons","fontawesome")) {
case 0: {
 //BA.debugLineNum = 375;BA.debugLine="ExpandIcon = $\"<i class=\"material-icons\">keyboa";
_expandicon = ("<i class=\"material-icons\">keyboard_arrow_right</i>");
 //BA.debugLineNum = 376;BA.debugLine="CollapseIcon = $\"<i class=\"material-icons\">keyb";
_collapseicon = ("<i class=\"material-icons\">keyboard_arrow_down</i>");
 break; }
case 1: {
 //BA.debugLineNum = 378;BA.debugLine="ExpandIcon = $\"<i class=\"fa fa-chevron-right\"><";
_expandicon = ("<i class=\"fa fa-chevron-right\"></i>");
 //BA.debugLineNum = 379;BA.debugLine="CollapseIcon = $\"<i class=\"fa fa-chevron-down\">";
_collapseicon = ("<i class=\"fa fa-chevron-down\"></i>");
 break; }
}
;
 //BA.debugLineNum = 381;BA.debugLine="Dim sizes As List";
_sizes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 382;BA.debugLine="sizes.Initialize";
_sizes.Initialize();
 //BA.debugLineNum = 383;BA.debugLine="sizes.AddAll(Array As Int(5,10,15,20,25,30,35,40,";
_sizes.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new int[]{(int) (5),(int) (10),(int) (15),(int) (20),(int) (25),(int) (30),(int) (35),(int) (40),(int) (45),(int) (50)}));
 //BA.debugLineNum = 384;BA.debugLine="Dim pager As Map = CreateMap(\"limit\":PagerLimit,\"";
_pager = new anywheresoftware.b4a.objects.collections.Map();
_pager = __c.createMap(new Object[] {(Object)("limit"),(Object)(_pagerlimit),(Object)("sizes"),(Object)(_sizes.getObject())});
 //BA.debugLineNum = 385;BA.debugLine="Dim mapping As Map = CreateMap(\"dataField\": DataF";
_mapping = new anywheresoftware.b4a.objects.collections.Map();
_mapping = __c.createMap(new Object[] {(Object)("dataField"),(Object)(_datafield)});
 //BA.debugLineNum = 386;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 387;BA.debugLine="For Each column As Map In columnsM.Values";
_column = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group16 = _columnsm.Values();
final int groupLen16 = group16.getSize()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_column.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group16.Get(index16)));
 //BA.debugLineNum = 388;BA.debugLine="Columns.Add(column)";
_columns.Add((Object)(_column.getObject()));
 }
};
 //BA.debugLineNum = 390;BA.debugLine="If autoGenerateColumns Then Columns.clear";
if (_autogeneratecolumns) { 
_columns.Clear();};
 //BA.debugLineNum = 392;BA.debugLine="Options = CreateMap(\"dataSource\":DataSource, _ 	\"";
_options = __c.createMap(new Object[] {(Object)("dataSource"),(Object)(_datasource.getObject()),(Object)("primaryKey"),(Object)(_primarykey),(Object)("mapping"),(Object)(_mapping.getObject()),(Object)("autoLoad"),(Object)(_autoload),(Object)("bodyRowHeight"),(Object)(_bodyrowheight),(Object)("selectionType"),(Object)(_selectiontype),(Object)("selectionMethod"),(Object)(_selectionmethod),(Object)("iconsLibrary"),(Object)(_iconslibrary),(Object)("columnReorder"),(Object)(_columnreorder),(Object)("keepExpandedRows"),(Object)(_keepexpandedrows),(Object)("fixedHeader"),(Object)(_fixedheader),(Object)("resizableColumns"),(Object)(_resizablecolumns),(Object)("responsive"),(Object)(_responsive),(Object)("rowReorder"),(Object)(_rowreorder),(Object)("autoGenerateColumns"),(Object)(_autogeneratecolumns),(Object)("uiLibrary"),(Object)(_uilibrary)});
 //BA.debugLineNum = 408;BA.debugLine="If InlineEditing Then";
if (_inlineediting) { 
 //BA.debugLineNum = 409;BA.debugLine="Dim InlineEditingObject As Map = CreateMap(\"mode";
_inlineeditingobject = new anywheresoftware.b4a.objects.collections.Map();
_inlineeditingobject = __c.createMap(new Object[] {(Object)("mode"),(Object)(_inlineeditingmode),(Object)("managementColumn"),(Object)(_inlineeditingmanagementcolumn)});
 //BA.debugLineNum = 410;BA.debugLine="Options.Put(\"inlineEditing\", InlineEditingObject";
_options.Put((Object)("inlineEditing"),(Object)(_inlineeditingobject.getObject()));
 };
 //BA.debugLineNum = 412;BA.debugLine="If ShowPager Then Options.Put(\"pager\", pager)";
if (_showpager) { 
_options.Put((Object)("pager"),(Object)(_pager.getObject()));};
 //BA.debugLineNum = 413;BA.debugLine="If Columns.Size > 0 Then Options.Put(\"columns\", C";
if (_columns.getSize()>0) { 
_options.Put((Object)("columns"),(Object)(_columns.getObject()));};
 //BA.debugLineNum = 414;BA.debugLine="If MinWidth > 0 Then Options.put(\"minWidth\", MinW";
if (_minwidth>0) { 
_options.Put((Object)("minWidth"),(Object)(_minwidth));};
 //BA.debugLineNum = 415;BA.debugLine="If ToolbarTemplate.Length > 0 Then Options.Put(\"t";
if (_toolbartemplate.length()>0) { 
_options.Put((Object)("toolbarTemplate"),(Object)(_toolbartemplate));};
 //BA.debugLineNum = 416;BA.debugLine="If Width > 0 Then Options.Put(\"width\", Width)";
if ((double)(Double.parseDouble(_width))>0) { 
_options.Put((Object)("width"),(Object)(_width));};
 //BA.debugLineNum = 418;BA.debugLine="If GroupBy.length > 0 Then Options.Put(\"grouping\"";
if (_groupby.length()>0) { 
_options.Put((Object)("grouping"),(Object)(__c.createMap(new Object[] {(Object)("groupBy"),(Object)(_groupby)}).getObject()));};
 //BA.debugLineNum = 419;BA.debugLine="If DetailTemplate.Length > 0 Then Options.Put(\"de";
if (_detailtemplate.length()>0) { 
_options.Put((Object)("detailTemplate"),(Object)(_detailtemplate));};
 //BA.debugLineNum = 420;BA.debugLine="If params.Size > 0 Then Options.Put(\"params\", par";
if (_params.getSize()>0) { 
_options.Put((Object)("params"),(Object)(_params.getObject()));};
 //BA.debugLineNum = 421;BA.debugLine="If HeaderFilter Then";
if (_headerfilter) { 
 //BA.debugLineNum = 422;BA.debugLine="Dim hf As Map = CreateMap(\"type\": HeaderFilterTy";
_hf = new anywheresoftware.b4a.objects.collections.Map();
_hf = __c.createMap(new Object[] {(Object)("type"),(Object)(_headerfiltertype)});
 //BA.debugLineNum = 423;BA.debugLine="Options.Put(\"headerFilter\", hf)";
_options.Put((Object)("headerFilter"),(Object)(_hf.getObject()));
 };
 //BA.debugLineNum = 425;BA.debugLine="Dim icn As Map";
_icn = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 426;BA.debugLine="icn.Initialize";
_icn.Initialize();
 //BA.debugLineNum = 427;BA.debugLine="icn.Put(\"expandRow\",  ExpandIcon)";
_icn.Put((Object)("expandRow"),(Object)(_expandicon));
 //BA.debugLineNum = 428;BA.debugLine="icn.Put(\"collapseRow\", CollapseIcon)";
_icn.Put((Object)("collapseRow"),(Object)(_collapseicon));
 //BA.debugLineNum = 429;BA.debugLine="icn.Put(\"expandGroup\",  ExpandIcon)";
_icn.Put((Object)("expandGroup"),(Object)(_expandicon));
 //BA.debugLineNum = 430;BA.debugLine="icn.Put(\"collapseGroup\", CollapseIcon)";
_icn.Put((Object)("collapseGroup"),(Object)(_collapseicon));
 //BA.debugLineNum = 431;BA.debugLine="Options.Put(\"icons\", icn)";
_options.Put((Object)("icons"),(Object)(_icn.getObject()));
 //BA.debugLineNum = 433;BA.debugLine="grid = JQ.Selector($\"#${ID}\"$)";
_grid = _jq.Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(_id))+"")));
 //BA.debugLineNum = 434;BA.debugLine="grid.RunMethod(\"grid\", Array(Options))";
_grid.RunMethod("grid",(Object)(new Object[]{(Object)(_options.getObject())}));
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public String  _reload() throws Exception{
 //BA.debugLineNum = 313;BA.debugLine="Sub Reload";
 //BA.debugLineNum = 314;BA.debugLine="grid.RunMethod(\"reload\",Null)";
_grid.RunMethod("reload",__c.Null);
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return "";
}
public String  _removerow(String _pk) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub RemoveRow(pk As String)";
 //BA.debugLineNum = 338;BA.debugLine="grid.RunMethod(\"removeRow\", Array(pk))";
_grid.RunMethod("removeRow",(Object)(new Object[]{(Object)(_pk)}));
 //BA.debugLineNum = 339;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 155;BA.debugLine="Sub Render";
 //BA.debugLineNum = 156;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 157;BA.debugLine="End Sub";
return "";
}
public String  _reset() throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub Reset";
 //BA.debugLineNum = 106;BA.debugLine="columnsM.Initialize";
_columnsm.Initialize();
 //BA.debugLineNum = 107;BA.debugLine="Options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 108;BA.debugLine="params.Initialize";
_params.Initialize();
 //BA.debugLineNum = 109;BA.debugLine="formats.Initialize";
_formats.Initialize();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public String  _searchfor(anywheresoftware.b4a.objects.collections.Map _searchvalues) throws Exception{
 //BA.debugLineNum = 308;BA.debugLine="Sub SearchFor(searchValues As Map)";
 //BA.debugLineNum = 309;BA.debugLine="grid.RunMethod(\"reload\", Array(searchValues))";
_grid.RunMethod("reload",(Object)(new Object[]{(Object)(_searchvalues.getObject())}));
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return "";
}
public String  _selectall() throws Exception{
 //BA.debugLineNum = 798;BA.debugLine="Sub SelectAll";
 //BA.debugLineNum = 799;BA.debugLine="grid.RunMethod(\"selectAll\", Null)";
_grid.RunMethod("selectAll",__c.Null);
 //BA.debugLineNum = 800;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetAttr(attr As Map) As VMGijgoTable";
 //BA.debugLineNum = 146;BA.debugLine="Table.SetAttr(attr)";
_table._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcenteraligncolumns(anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
String _k = "";
 //BA.debugLineNum = 653;BA.debugLine="Sub SetCenterAlignColumns(flds As List) As VMGijgo";
 //BA.debugLineNum = 654;BA.debugLine="For Each k As String In flds";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flds;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 655;BA.debugLine="SetColumnAlignment(k, ALIGN_CENTER)";
_setcolumnalignment(_k,_align_center);
 }
};
 //BA.debugLineNum = 657;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 658;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnalignment(String _colname,String _colalign) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 638;BA.debugLine="Sub SetColumnAlignment(colName As String, colAlign";
 //BA.debugLineNum = 639;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 640;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 641;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 642;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 643;BA.debugLine="Select Case colAlign";
switch (BA.switchObjectToInt(_colalign,_align_center,_align_right)) {
case 0: 
case 1: {
 //BA.debugLineNum = 645;BA.debugLine="col.Put(\"align\", colAlign)";
_col.Put((Object)("align"),(Object)(_colalign));
 //BA.debugLineNum = 646;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 break; }
}
;
 };
 //BA.debugLineNum = 649;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 650;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnclickevent(String _colfield,boolean _stoppropagation) throws Exception{
anywheresoftware.b4a.objects.collections.Map _e = null;
anywheresoftware.b4a.objects.collections.Map _col = null;
anywheresoftware.b4a.objects.collections.Map _events = null;
 //BA.debugLineNum = 731;BA.debugLine="Sub SetColumnClickEvent(colField As String, stopPr";
 //BA.debugLineNum = 732;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
 //BA.debugLineNum = 733;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
 //BA.debugLineNum = 734;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (_columnsm.ContainsKey((Object)(_colfield))) { 
 //BA.debugLineNum = 735;BA.debugLine="Dim e As Map";
_e = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 736;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colfield))));
 //BA.debugLineNum = 737;BA.debugLine="If col.ContainsKey(\"events\") = False Then";
if (_col.ContainsKey((Object)("events"))==__c.False) { 
 //BA.debugLineNum = 738;BA.debugLine="Dim events As Map = CreateMap()";
_events = new anywheresoftware.b4a.objects.collections.Map();
_events = __c.createMap(new Object[] {});
 //BA.debugLineNum = 739;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
 };
 //BA.debugLineNum = 741;BA.debugLine="Dim events As Map = col.Get(\"events\")";
_events = new anywheresoftware.b4a.objects.collections.Map();
_events.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_col.Get((Object)("events"))));
 //BA.debugLineNum = 742;BA.debugLine="If stopPropagation Then col.Put(\"stopPropagation";
if (_stoppropagation) { 
_col.Put((Object)("stopPropagation"),(Object)(_stoppropagation));};
 //BA.debugLineNum = 743;BA.debugLine="events.Put(\"click\", Banano.CallBack(mCallBack, e";
_events.Put((Object)("click"),_banano.CallBack(_mcallback,_eventname+("_"+__c.SmartStringFormatter("",(Object)(_colfield))+""),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e.getObject())})));
 //BA.debugLineNum = 744;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
 //BA.debugLineNum = 745;BA.debugLine="columnsM.Put(colField,col)";
_columnsm.Put((Object)(_colfield),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 747;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setcolumncss(String _colname,String _colcss) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 982;BA.debugLine="Sub SetColumnCSS(colName As String, colCSS As Stri";
 //BA.debugLineNum = 983;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 984;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 986;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 987;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 988;BA.debugLine="col.Put(\"cssClass\", colCSS)";
_col.Put((Object)("cssClass"),(Object)(_colcss));
 //BA.debugLineNum = 989;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 991;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 992;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumndatasource(String _colfield,Object _coldatasource,String _colvaluefield,String _coleditfield) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
anywheresoftware.b4a.objects.collections.Map _editor = null;
 //BA.debugLineNum = 245;BA.debugLine="Sub SetColumnDataSource(colField As String, colDat";
 //BA.debugLineNum = 246;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
 //BA.debugLineNum = 247;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
 //BA.debugLineNum = 248;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (_columnsm.ContainsKey((Object)(_colfield))) { 
 //BA.debugLineNum = 249;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colfield))));
 //BA.debugLineNum = 250;BA.debugLine="Dim editor As Map = CreateMap(\"dataSource\":colDa";
_editor = new anywheresoftware.b4a.objects.collections.Map();
_editor = __c.createMap(new Object[] {(Object)("dataSource"),_coldatasource,(Object)("valueField"),(Object)(_colvaluefield)});
 //BA.debugLineNum = 251;BA.debugLine="col.Put(\"editor\", editor)";
_col.Put((Object)("editor"),(Object)(_editor.getObject()));
 //BA.debugLineNum = 252;BA.debugLine="col.Put(\"editField\", colEditField)";
_col.Put((Object)("editField"),(Object)(_coleditfield));
 //BA.debugLineNum = 253;BA.debugLine="columnsM.Put(colField,col)";
_columnsm.Put((Object)(_colfield),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumneditors(anywheresoftware.b4a.objects.collections.List _colfield) throws Exception{
String _strcol = "";
anywheresoftware.b4a.objects.collections.Map _col = null;
String _coltype = "";
 //BA.debugLineNum = 197;BA.debugLine="Sub SetColumnEditors(colField As List) As VMGijgoT";
 //BA.debugLineNum = 198;BA.debugLine="For Each strCol As String In colField";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfield;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 199;BA.debugLine="strCol = strCol.Replace(\" \",\"\")";
_strcol = _strcol.replace(" ","");
 //BA.debugLineNum = 200;BA.debugLine="strCol = strCol.tolowercase";
_strcol = _strcol.toLowerCase();
 //BA.debugLineNum = 201;BA.debugLine="If columnsM.ContainsKey(strCol) Then";
if (_columnsm.ContainsKey((Object)(_strcol))) { 
 //BA.debugLineNum = 202;BA.debugLine="Dim col As Map = columnsM.Get(strCol)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_strcol))));
 //BA.debugLineNum = 203;BA.debugLine="col.Put(\"editor\", True)";
_col.Put((Object)("editor"),(Object)(__c.True));
 //BA.debugLineNum = 205;BA.debugLine="Dim colType As String = col.Get(\"type\")";
_coltype = BA.ObjectToString(_col.Get((Object)("type")));
 //BA.debugLineNum = 206;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"checkbox")) {
case 0: {
 //BA.debugLineNum = 208;BA.debugLine="col.Put(\"mode\", \"editOnly\")";
_col.Put((Object)("mode"),(Object)("editOnly"));
 break; }
}
;
 //BA.debugLineNum = 210;BA.debugLine="columnsM.Put(strCol,col)";
_columnsm.Put((Object)(_strcol),(Object)(_col.getObject()));
 };
 }
};
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnevent(String _colfield,String _colevent,boolean _stoppropagation) throws Exception{
anywheresoftware.b4a.objects.collections.Map _e = null;
anywheresoftware.b4a.objects.collections.Map _col = null;
anywheresoftware.b4a.objects.collections.Map _events = null;
 //BA.debugLineNum = 750;BA.debugLine="Sub SetColumnEvent(colField As String, colEvent As";
 //BA.debugLineNum = 751;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
 //BA.debugLineNum = 752;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
 //BA.debugLineNum = 753;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (_columnsm.ContainsKey((Object)(_colfield))) { 
 //BA.debugLineNum = 754;BA.debugLine="Dim e As Map";
_e = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 755;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colfield))));
 //BA.debugLineNum = 756;BA.debugLine="If col.ContainsKey(\"events\") = False Then";
if (_col.ContainsKey((Object)("events"))==__c.False) { 
 //BA.debugLineNum = 757;BA.debugLine="Dim events As Map = CreateMap()";
_events = new anywheresoftware.b4a.objects.collections.Map();
_events = __c.createMap(new Object[] {});
 //BA.debugLineNum = 758;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
 };
 //BA.debugLineNum = 760;BA.debugLine="Dim events As Map = col.Get(\"events\")";
_events = new anywheresoftware.b4a.objects.collections.Map();
_events.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_col.Get((Object)("events"))));
 //BA.debugLineNum = 761;BA.debugLine="If stopPropagation Then col.Put(\"stopPropagation";
if (_stoppropagation) { 
_col.Put((Object)("stopPropagation"),(Object)(_stoppropagation));};
 //BA.debugLineNum = 762;BA.debugLine="events.Put(colEvent, Banano.CallBack(mCallBack,";
_events.Put((Object)(_colevent),_banano.CallBack(_mcallback,_eventname+("_"+__c.SmartStringFormatter("",(Object)(_colfield.toLowerCase()))+"_"+__c.SmartStringFormatter("",(Object)(_colevent))+""),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e.getObject())})));
 //BA.debugLineNum = 763;BA.debugLine="col.Put(\"events\", events)";
_col.Put((Object)("events"),(Object)(_events.getObject()));
 //BA.debugLineNum = 764;BA.debugLine="columnsM.Put(colField,col)";
_columnsm.Put((Object)(_colfield),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 766;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setcolumnfilterable(String _colname,boolean _colfilter) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 969;BA.debugLine="Sub SetColumnFilterable(colName As String, colFilt";
 //BA.debugLineNum = 970;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 971;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 973;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 974;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 975;BA.debugLine="col.Put(\"filterable\", colFilter)";
_col.Put((Object)("filterable"),(Object)(_colfilter));
 //BA.debugLineNum = 976;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnformat(String _colname,String _colformat) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 1003;BA.debugLine="Sub SetColumnFormat(colName As String, colFormat A";
 //BA.debugLineNum = 1004;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 1005;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 1007;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 1008;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 1009;BA.debugLine="col.Put(\"format\", colFormat)";
_col.Put((Object)("format"),(Object)(_colformat));
 //BA.debugLineNum = 1010;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 1012;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 1013;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnformatnumeral(String _colfield,String _colformat) throws Exception{
 //BA.debugLineNum = 996;BA.debugLine="Sub SetColumnFormatNumeral(colField As String, col";
 //BA.debugLineNum = 997;BA.debugLine="SetColumnProperty(colField,\"formatnumeral\", colFo";
_setcolumnproperty(_colfield,"formatnumeral",(Object)(_colformat));
 //BA.debugLineNum = 998;BA.debugLine="formats.Put(colField,colFormat)";
_formats.Put((Object)(_colfield),(Object)(_colformat));
 //BA.debugLineNum = 999;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 1000;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumngroupby(String _colfield) throws Exception{
 //BA.debugLineNum = 187;BA.debugLine="Sub SetColumnGroupBy(colField As String) As VMGijg";
 //BA.debugLineNum = 188;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
 //BA.debugLineNum = 189;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
 //BA.debugLineNum = 190;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (_columnsm.ContainsKey((Object)(_colfield))) { 
 //BA.debugLineNum = 191;BA.debugLine="GroupBy = colField";
_groupby = _colfield;
 };
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnheadercss(String _colname,String _headercssclass) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 956;BA.debugLine="Sub SetColumnHeaderCSS(colName As String, headerCs";
 //BA.debugLineNum = 957;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 958;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 960;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 961;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 962;BA.debugLine="col.Put(\"headerCssClass\", headerCssClass)";
_col.Put((Object)("headerCssClass"),(Object)(_headercssclass));
 //BA.debugLineNum = 963;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 965;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 966;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnhidden(String _colname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 890;BA.debugLine="Sub SetColumnHidden(colName As String) As VMGijgoT";
 //BA.debugLineNum = 891;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 892;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 893;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 894;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 895;BA.debugLine="col.Put(\"hidden\", True)";
_col.Put((Object)("hidden"),(Object)(__c.True));
 //BA.debugLineNum = 896;BA.debugLine="col.Put(\"filterable\", False)";
_col.Put((Object)("filterable"),(Object)(__c.False));
 //BA.debugLineNum = 897;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 899;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnhiddenonly(String _colname,boolean _bvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 903;BA.debugLine="Sub SetColumnHiddenOnly(colName As String, bValue";
 //BA.debugLineNum = 904;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 905;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 906;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 907;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 908;BA.debugLine="col.Put(\"hidden\", bValue)";
_col.Put((Object)("hidden"),(Object)(_bvalue));
 //BA.debugLineNum = 909;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 911;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 912;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnicon(String _colname,String _colicon) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 869;BA.debugLine="Sub SetColumnIcon(colName As String, colIcon As St";
 //BA.debugLineNum = 870;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 871;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 872;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 873;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 874;BA.debugLine="col.Put(\"icon\", colIcon)";
_col.Put((Object)("icon"),(Object)(_colicon));
 //BA.debugLineNum = 875;BA.debugLine="col.Put(\"type\", COLUMN_ICON)";
_col.Put((Object)("type"),(Object)(_column_icon));
 //BA.debugLineNum = 876;BA.debugLine="col.Put(\"filterable\", False)";
_col.Put((Object)("filterable"),(Object)(__c.False));
 //BA.debugLineNum = 877;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 879;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnitalic(String _colname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 944;BA.debugLine="Sub SetColumnItalic(colName As String) As VMGijgoT";
 //BA.debugLineNum = 945;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 946;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 947;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 948;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 949;BA.debugLine="col.Put(\"headerCssClass\", \"italic\")";
_col.Put((Object)("headerCssClass"),(Object)("italic"));
 //BA.debugLineNum = 950;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 952;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 953;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnminwidth(String _colfield,int _colminwidth,int _colpriority) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 773;BA.debugLine="Sub SetColumnMinWidth(colField As String, colMinWi";
 //BA.debugLineNum = 774;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
 //BA.debugLineNum = 775;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
 //BA.debugLineNum = 776;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (_columnsm.ContainsKey((Object)(_colfield))) { 
 //BA.debugLineNum = 777;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colfield))));
 //BA.debugLineNum = 778;BA.debugLine="col.Put(\"minWidth\", colMinWidth)";
_col.Put((Object)("minWidth"),(Object)(_colminwidth));
 //BA.debugLineNum = 779;BA.debugLine="col.Put(\"priority\", colPriority)";
_col.Put((Object)("priority"),(Object)(_colpriority));
 //BA.debugLineNum = 780;BA.debugLine="columnsM.Put(colField,col)";
_columnsm.Put((Object)(_colfield),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 782;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 783;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnmodeeditonly(anywheresoftware.b4a.objects.collections.List _colfield) throws Exception{
String _strcol = "";
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 231;BA.debugLine="Sub SetColumnModeEditOnly(colField As List) As VMG";
 //BA.debugLineNum = 232;BA.debugLine="For Each strCol As String In colField";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfield;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 233;BA.debugLine="strCol = strCol.Replace(\" \",\"\")";
_strcol = _strcol.replace(" ","");
 //BA.debugLineNum = 234;BA.debugLine="strCol = strCol.tolowercase";
_strcol = _strcol.toLowerCase();
 //BA.debugLineNum = 235;BA.debugLine="If columnsM.ContainsKey(strCol) Then";
if (_columnsm.ContainsKey((Object)(_strcol))) { 
 //BA.debugLineNum = 236;BA.debugLine="Dim col As Map = columnsM.Get(strCol)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_strcol))));
 //BA.debugLineNum = 237;BA.debugLine="col.Put(\"mode\", \"editOnly\")";
_col.Put((Object)("mode"),(Object)("editOnly"));
 //BA.debugLineNum = 238;BA.debugLine="columnsM.Put(strCol,col)";
_columnsm.Put((Object)(_strcol),(Object)(_col.getObject()));
 };
 }
};
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnmodereadonly(anywheresoftware.b4a.objects.collections.List _colfield) throws Exception{
String _strcol = "";
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 217;BA.debugLine="Sub SetColumnModeReadOnly(colField As List) As VMG";
 //BA.debugLineNum = 218;BA.debugLine="For Each strCol As String In colField";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfield;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 219;BA.debugLine="strCol = strCol.Replace(\" \",\"\")";
_strcol = _strcol.replace(" ","");
 //BA.debugLineNum = 220;BA.debugLine="strCol = strCol.tolowercase";
_strcol = _strcol.toLowerCase();
 //BA.debugLineNum = 221;BA.debugLine="If columnsM.ContainsKey(strCol) Then";
if (_columnsm.ContainsKey((Object)(_strcol))) { 
 //BA.debugLineNum = 222;BA.debugLine="Dim col As Map = columnsM.Get(strCol)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_strcol))));
 //BA.debugLineNum = 223;BA.debugLine="col.Put(\"mode\", \"readOnly\")";
_col.Put((Object)("mode"),(Object)("readOnly"));
 //BA.debugLineNum = 224;BA.debugLine="columnsM.Put(strCol,col)";
_columnsm.Put((Object)(_strcol),(Object)(_col.getObject()));
 };
 }
};
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnname(String _colfield,String _colname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 823;BA.debugLine="Sub SetColumnName(colField As String, colName As S";
 //BA.debugLineNum = 824;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
 //BA.debugLineNum = 825;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
 //BA.debugLineNum = 826;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (_columnsm.ContainsKey((Object)(_colfield))) { 
 //BA.debugLineNum = 827;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colfield))));
 //BA.debugLineNum = 828;BA.debugLine="col.Put(\"name\", colName)";
_col.Put((Object)("name"),(Object)(_colname));
 //BA.debugLineNum = 829;BA.debugLine="columnsM.Put(colField,col)";
_columnsm.Put((Object)(_colfield),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 831;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 832;BA.debugLine="End Sub";
return null;
}
public String  _setcolumnproperty(String _colfield,String _colproperty,Object _colvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 260;BA.debugLine="Sub SetColumnProperty(colField As String, colPrope";
 //BA.debugLineNum = 261;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
 //BA.debugLineNum = 262;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (_columnsm.ContainsKey((Object)(_colfield))) { 
 //BA.debugLineNum = 263;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colfield))));
 //BA.debugLineNum = 264;BA.debugLine="col.Put(colProperty, colValue)";
_col.Put((Object)(_colproperty),_colvalue);
 //BA.debugLineNum = 265;BA.debugLine="columnsM.Put(colField,col)";
_columnsm.Put((Object)(_colfield),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 267;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnrenderer(String _colfield,String _colmethod) throws Exception{
anywheresoftware.b4a.objects.collections.Map _value = null;
anywheresoftware.b4a.objects.collections.Map _record = null;
anywheresoftware.b4a.objects.collections.Map _cell = null;
anywheresoftware.b4a.objects.collections.Map _displayel = null;
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 289;BA.debugLine="Sub SetColumnRenderer(colField As String, colMetho";
 //BA.debugLineNum = 290;BA.debugLine="colMethod = colMethod.tolowercase";
_colmethod = _colmethod.toLowerCase();
 //BA.debugLineNum = 291;BA.debugLine="Dim value, record, cell, displayEl As Map";
_value = new anywheresoftware.b4a.objects.collections.Map();
_record = new anywheresoftware.b4a.objects.collections.Map();
_cell = new anywheresoftware.b4a.objects.collections.Map();
_displayel = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 292;BA.debugLine="colField = colField.Replace(\" \",\"\")";
_colfield = _colfield.replace(" ","");
 //BA.debugLineNum = 293;BA.debugLine="colField = colField.tolowercase";
_colfield = _colfield.toLowerCase();
 //BA.debugLineNum = 294;BA.debugLine="If columnsM.ContainsKey(colField) Then";
if (_columnsm.ContainsKey((Object)(_colfield))) { 
 //BA.debugLineNum = 295;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colfield))));
 //BA.debugLineNum = 296;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(mCallBack,$\"";
_col.Put((Object)("renderer"),_banano.CallBack(_mcallback,(""+__c.SmartStringFormatter("",(Object)(_eventname))+"_"+__c.SmartStringFormatter("",(Object)(_colmethod))+""),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value.getObject()),(Object)(_record.getObject()),(Object)(_cell.getObject()),(Object)(_displayel.getObject())})));
 //BA.debugLineNum = 297;BA.debugLine="columnsM.Put(colField,col)";
_columnsm.Put((Object)(_colfield),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return "";
}
public String  _setcolumnshidden(anywheresoftware.b4a.objects.collections.List _colnames) throws Exception{
String _col = "";
 //BA.debugLineNum = 883;BA.debugLine="Sub SetColumnsHidden(colNames As List)";
 //BA.debugLineNum = 884;BA.debugLine="For Each col As String In colNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 885;BA.debugLine="SetColumnHidden(col)";
_setcolumnhidden(_col);
 }
};
 //BA.debugLineNum = 887;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setcolumnsortable(String _colname,boolean _colsortable) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 916;BA.debugLine="Sub SetColumnSortable(colName As String, colSortab";
 //BA.debugLineNum = 917;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 918;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 919;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 920;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 921;BA.debugLine="col.Put(\"sortable\", colSortable)";
_col.Put((Object)("sortable"),(Object)(_colsortable));
 //BA.debugLineNum = 922;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 924;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 925;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnstoppropagation(String _colname,boolean _colstoppropagation) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 849;BA.debugLine="Sub SetColumnStopPropagation(colName As String, co";
 //BA.debugLineNum = 850;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 851;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 853;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 854;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 855;BA.debugLine="col.Put(\"stopPropagation\", colStopPropagation)";
_col.Put((Object)("stopPropagation"),(Object)(_colstoppropagation));
 //BA.debugLineNum = 856;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumntmpl(String _colname,String _coltmpl) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 670;BA.debugLine="Sub SetColumnTmpl(colName As String, coltmpl As St";
 //BA.debugLineNum = 671;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 672;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 673;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 674;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 675;BA.debugLine="col.Put(\"tmpl\", coltmpl)";
_col.Put((Object)("tmpl"),(Object)(_coltmpl));
 //BA.debugLineNum = 676;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 678;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 679;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumntooltip(String _colname,String _coltooltip) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 836;BA.debugLine="Sub SetColumnToolTip(colName As String, colToolTip";
 //BA.debugLineNum = 837;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 838;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 840;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 841;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 842;BA.debugLine="col.Put(\"tooltip\", colToolTip)";
_col.Put((Object)("tooltip"),(Object)(_coltooltip));
 //BA.debugLineNum = 843;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 845;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 846;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumntype(String _colname,String _coltype) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 682;BA.debugLine="Sub SetColumnType(colName As String, colType As St";
 //BA.debugLineNum = 683;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 684;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 686;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 687;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 688;BA.debugLine="col.Put(\"type\", colType)";
_col.Put((Object)("type"),(Object)(_coltype));
 //BA.debugLineNum = 689;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 691;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 692;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setcolumnwidth(String _colname,String _colwidth) throws Exception{
anywheresoftware.b4a.objects.collections.Map _col = null;
 //BA.debugLineNum = 626;BA.debugLine="Sub SetColumnWidth(colName As String, colWidth As";
 //BA.debugLineNum = 627;BA.debugLine="colName = colName.Replace(\" \",\"\")";
_colname = _colname.replace(" ","");
 //BA.debugLineNum = 628;BA.debugLine="colName = colName.tolowercase";
_colname = _colname.toLowerCase();
 //BA.debugLineNum = 629;BA.debugLine="If columnsM.ContainsKey(colName) Then";
if (_columnsm.ContainsKey((Object)(_colname))) { 
 //BA.debugLineNum = 630;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
_col = new anywheresoftware.b4a.objects.collections.Map();
_col.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_columnsm.Get((Object)(_colname))));
 //BA.debugLineNum = 631;BA.debugLine="col.Put(\"width\", colWidth)";
_col.Put((Object)("width"),(Object)(_colwidth));
 //BA.debugLineNum = 632;BA.debugLine="columnsM.Put(colName,col)";
_columnsm.Put((Object)(_colname),(Object)(_col.getObject()));
 };
 //BA.debugLineNum = 634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setdatasource(anywheresoftware.b4a.objects.collections.List _rows) throws Exception{
 //BA.debugLineNum = 174;BA.debugLine="Sub SetDataSource(rows As List) As VMGijgoTable";
 //BA.debugLineNum = 175;BA.debugLine="DataSource = rows";
_datasource = _rows;
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setdatecolumns(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
String _k = "";
 //BA.debugLineNum = 695;BA.debugLine="Sub SetDateColumns(dates As List) As VMGijgoTable";
 //BA.debugLineNum = 696;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 697;BA.debugLine="SetColumnType(k, COLUMN_DATE)";
_setcolumntype(_k,_column_date);
 //BA.debugLineNum = 698;BA.debugLine="SetColumnFormat(k, \"yyyy-mm-dd\")";
_setcolumnformat(_k,"yyyy-mm-dd");
 }
};
 //BA.debugLineNum = 700;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 701;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setdatetimecolumns(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
String _k = "";
 //BA.debugLineNum = 704;BA.debugLine="Sub SetDateTimeColumns(dates As List) As VMGijgoTa";
 //BA.debugLineNum = 705;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 706;BA.debugLine="SetColumnType(k, COLUMN_DATETIME)";
_setcolumntype(_k,_column_datetime);
 //BA.debugLineNum = 707;BA.debugLine="SetColumnFormat(k, \"yyyy-mm-dd HH:MM\")";
_setcolumnformat(_k,"yyyy-mm-dd HH:MM");
 }
};
 //BA.debugLineNum = 709;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 710;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 150;BA.debugLine="Sub SetDisabled(b As Boolean) As VMGijgoTable";
 //BA.debugLineNum = 151;BA.debugLine="Table.SetDisabled(b)";
_table._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 152;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 153;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMGijg";
 //BA.debugLineNum = 129;BA.debugLine="Table.SetKey(k, bind)";
_table._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setmoneycolumns(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
String _k = "";
 //BA.debugLineNum = 722;BA.debugLine="Sub SetMoneyColumns(dates As List) As VMGijgoTable";
 //BA.debugLineNum = 723;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 724;BA.debugLine="SetColumnType(k, COLUMN_MONEY)";
_setcolumntype(_k,_column_money);
 }
};
 //BA.debugLineNum = 726;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 727;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setrightaligncolumns(anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
String _k = "";
 //BA.debugLineNum = 661;BA.debugLine="Sub SetRightAlignColumns(flds As List) As VMGijgoT";
 //BA.debugLineNum = 662;BA.debugLine="For Each k As String In flds";
{
final anywheresoftware.b4a.BA.IterableList group1 = _flds;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 663;BA.debugLine="SetColumnAlignment(k, ALIGN_RIGHT)";
_setcolumnalignment(_k,_align_right);
 }
};
 //BA.debugLineNum = 665;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 666;BA.debugLine="End Sub";
return null;
}
public String  _setselected(int _rowpos) throws Exception{
 //BA.debugLineNum = 818;BA.debugLine="Sub SetSelected(rowPos As Int)";
 //BA.debugLineNum = 819;BA.debugLine="grid.runmethod(\"setSelected\", Array(rowPos))";
_grid.RunMethod("setSelected",(Object)(new Object[]{(Object)(_rowpos)}));
 //BA.debugLineNum = 820;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgijgotable  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetStyle(sm As Map) As VMGijgoTable";
 //BA.debugLineNum = 119;BA.debugLine="Table.SetStyle(sm)";
_table._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _settimecolumns(anywheresoftware.b4a.objects.collections.List _dates) throws Exception{
String _k = "";
 //BA.debugLineNum = 713;BA.debugLine="Sub SetTimeColumns(dates As List) As VMGijgoTable";
 //BA.debugLineNum = 714;BA.debugLine="For Each k As String In dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 715;BA.debugLine="SetColumnType(k, COLUMN_TIME)";
_setcolumntype(_k,_column_time);
 //BA.debugLineNum = 716;BA.debugLine="SetColumnFormat(k, \"HH:MM\")";
_setcolumnformat(_k,"HH:MM");
 }
};
 //BA.debugLineNum = 718;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 719;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _settitle(String _stitle) throws Exception{
b4j.example.vmelement _spantitle = null;
 //BA.debugLineNum = 362;BA.debugLine="Sub SetTitle(sTitle As String) As VMGijgoTable";
 //BA.debugLineNum = 363;BA.debugLine="Dim spanTitle As VMElement";
_spantitle = new b4j.example.vmelement();
 //BA.debugLineNum = 364;BA.debugLine="spanTitle.Initialize(vue,$\"${ID}title\"$).SetTag(\"";
_spantitle._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"title"))._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 365;BA.debugLine="spanTitle.SetText(sTitle)";
_spantitle._settext /*b4j.example.vmelement*/ (_stitle);
 //BA.debugLineNum = 366;BA.debugLine="ToolBar.AddComponent(1,1,spanTitle.ToString)";
_toolbar._addcomponent /*String*/ ((int) (1),(int) (1),_spantitle._tostring /*String*/ ());
 //BA.debugLineNum = 367;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 368;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub SetVIf(vif As Object) As VMGijgoTable";
 //BA.debugLineNum = 124;BA.debugLine="Table.SetVIf(vif)";
_table._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgijgotable  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetVShow(vif As Object) As VMGijgoTable";
 //BA.debugLineNum = 134;BA.debugLine="Table.SetVShow(vif)";
_table._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgijgotable)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public String  _showcolumn(anywheresoftware.b4a.objects.collections.List _colfield) throws Exception{
String _strcol = "";
 //BA.debugLineNum = 330;BA.debugLine="Sub ShowColumn(colField As List)";
 //BA.debugLineNum = 331;BA.debugLine="For Each strCol As String In colField";
{
final anywheresoftware.b4a.BA.IterableList group1 = _colfield;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 332;BA.debugLine="grid.RunMethod(\"showColumn\",Array(strCol))";
_grid.RunMethod("showColumn",(Object)(new Object[]{(Object)(_strcol)}));
 }
};
 //BA.debugLineNum = 334;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 113;BA.debugLine="ToolbarTemplate = ToolBar.tostring";
_toolbartemplate = _toolbar._tostring /*String*/ ();
 //BA.debugLineNum = 114;BA.debugLine="Return Table.tostring";
if (true) return _table._tostring /*String*/ ();
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return "";
}
public String  _unselectall() throws Exception{
 //BA.debugLineNum = 803;BA.debugLine="Sub UnSelectAll";
 //BA.debugLineNum = 804;BA.debugLine="grid.RunMethod(\"unSelectAll\", Null)";
_grid.RunMethod("unSelectAll",__c.Null);
 //BA.debugLineNum = 805;BA.debugLine="End Sub";
return "";
}
public String  _updaterow(anywheresoftware.b4a.objects.collections.Map _rowdata) throws Exception{
String _pk = "";
 //BA.debugLineNum = 465;BA.debugLine="Sub UpdateRow(rowData As Map)";
 //BA.debugLineNum = 466;BA.debugLine="Dim pk As String = rowData.Get(PrimaryKey)";
_pk = BA.ObjectToString(_rowdata.Get((Object)(_primarykey)));
 //BA.debugLineNum = 467;BA.debugLine="grid.runmethod(\"updateRow\", Array(pk, rowData))";
_grid.RunMethod("updateRow",(Object)(new Object[]{(Object)(_pk),(Object)(_rowdata.getObject())}));
 //BA.debugLineNum = 468;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
