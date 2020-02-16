package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdftable extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdftable", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdftable.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _options = null;
public String _layout = "";
public boolean _lighthorizontallines = false;
public boolean _noborders = false;
public boolean _headerlineonly = false;
public int _headerrows = 0;
public anywheresoftware.b4a.objects.collections.Map _table = null;
public anywheresoftware.b4a.objects.collections.List _widths = null;
public anywheresoftware.b4a.objects.collections.List _heights = null;
public anywheresoftware.b4a.objects.collections.List _hdr = null;
public anywheresoftware.b4a.objects.collections.List _body = null;
public anywheresoftware.b4a.objects.collections.List _rows = null;
public b4j.example.pdfstyle _style = null;
public String _pageorientation = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdftable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
anywheresoftware.b4a.objects.collections.List _lst = null;
RDebugUtils.currentLine=59965440;
 //BA.debugLineNum = 59965440;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=59965441;
 //BA.debugLineNum = 59965441;BA.debugLine="If lightHorizontalLines <> Null Then options.Put(";
if (__ref._lighthorizontallines /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("layout"),(Object)("lightHorizontalLines"));};
RDebugUtils.currentLine=59965442;
 //BA.debugLineNum = 59965442;BA.debugLine="If noBorders <> Null Then options.Put(\"layout\", \"";
if (__ref._noborders /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("layout"),(Object)("noBorders"));};
RDebugUtils.currentLine=59965443;
 //BA.debugLineNum = 59965443;BA.debugLine="If headerLineOnly <> Null Then options.Put(\"layou";
if (__ref._headerlineonly /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("layout"),(Object)("headerLineOnly"));};
RDebugUtils.currentLine=59965445;
 //BA.debugLineNum = 59965445;BA.debugLine="If headerRows <> Null Then table.Put(\"headerRows\"";
if (__ref._headerrows /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._table /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("headerRows"),(Object)(__ref._headerrows /*int*/ ));};
RDebugUtils.currentLine=59965446;
 //BA.debugLineNum = 59965446;BA.debugLine="If widths.Size > 0 Then table.Put(\"widths\", width";
if (__ref._widths /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._table /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("widths"),(Object)(__ref._widths /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));};
RDebugUtils.currentLine=59965447;
 //BA.debugLineNum = 59965447;BA.debugLine="If heights.Size > 0 Then table.Put(\"heights\", hei";
if (__ref._heights /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._table /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("heights"),(Object)(__ref._heights /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));};
RDebugUtils.currentLine=59965449;
 //BA.debugLineNum = 59965449;BA.debugLine="If hdr.Size > 0 Then body.Add(hdr)";
if (__ref._hdr /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._body /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._hdr /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));};
RDebugUtils.currentLine=59965450;
 //BA.debugLineNum = 59965450;BA.debugLine="For Each lst As List In rows";
_lst = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group8 = __ref._rows /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_lst.setObject((java.util.List)(group8.Get(index8)));
RDebugUtils.currentLine=59965451;
 //BA.debugLineNum = 59965451;BA.debugLine="body.Add(lst)";
__ref._body /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lst.getObject()));
 }
};
RDebugUtils.currentLine=59965453;
 //BA.debugLineNum = 59965453;BA.debugLine="table.Put(\"body\", body)";
__ref._table /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("body"),(Object)(__ref._body /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=59965454;
 //BA.debugLineNum = 59965454;BA.debugLine="options.Put(\"table\", table)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("table"),(Object)(__ref._table /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=59965455;
 //BA.debugLineNum = 59965455;BA.debugLine="style.Include(options)";
__ref._style /*b4j.example.pdfstyle*/ ._include /*String*/ (null,__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=59965456;
 //BA.debugLineNum = 59965456;BA.debugLine="Return options";
if (true) return __ref._options /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=59965457;
 //BA.debugLineNum = 59965457;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _initialize(b4j.example.pdftable __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=59047936;
 //BA.debugLineNum = 59047936;BA.debugLine="Public Sub Initialize As PDFTable";
RDebugUtils.currentLine=59047937;
 //BA.debugLineNum = 59047937;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=59047938;
 //BA.debugLineNum = 59047938;BA.debugLine="lightHorizontalLines = Null";
__ref._lighthorizontallines /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=59047939;
 //BA.debugLineNum = 59047939;BA.debugLine="headerLineOnly = Null";
__ref._headerlineonly /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=59047940;
 //BA.debugLineNum = 59047940;BA.debugLine="noBorders = Null";
__ref._noborders /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=59047941;
 //BA.debugLineNum = 59047941;BA.debugLine="headerRows = Null";
__ref._headerrows /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=59047942;
 //BA.debugLineNum = 59047942;BA.debugLine="pageOrientation = \"\"";
__ref._pageorientation /*String*/  = "";
RDebugUtils.currentLine=59047943;
 //BA.debugLineNum = 59047943;BA.debugLine="table.Initialize";
__ref._table /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=59047944;
 //BA.debugLineNum = 59047944;BA.debugLine="widths.Initialize";
__ref._widths /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=59047945;
 //BA.debugLineNum = 59047945;BA.debugLine="hdr.Initialize";
__ref._hdr /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=59047946;
 //BA.debugLineNum = 59047946;BA.debugLine="body.Initialize";
__ref._body /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=59047947;
 //BA.debugLineNum = 59047947;BA.debugLine="rows.Initialize";
__ref._rows /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=59047948;
 //BA.debugLineNum = 59047948;BA.debugLine="style.Initialize";
__ref._style /*b4j.example.pdfstyle*/ ._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=59047949;
 //BA.debugLineNum = 59047949;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59047950;
 //BA.debugLineNum = 59047950;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _addcolumn(b4j.example.pdftable __ref,String _colname,Object _colwidth,Object _colheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "addcolumn", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "addcolumn", new Object[] {_colname,_colwidth,_colheight}));}
RDebugUtils.currentLine=59441152;
 //BA.debugLineNum = 59441152;BA.debugLine="Sub AddColumn(colName As String, colWidth As Objec";
RDebugUtils.currentLine=59441153;
 //BA.debugLineNum = 59441153;BA.debugLine="hdr.Add(colName)";
__ref._hdr /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_colname));
RDebugUtils.currentLine=59441154;
 //BA.debugLineNum = 59441154;BA.debugLine="If colWidth <> Null Then widths.Add(colWidth)";
if (_colwidth!= null) { 
__ref._widths /*anywheresoftware.b4a.objects.collections.List*/ .Add(_colwidth);};
RDebugUtils.currentLine=59441155;
 //BA.debugLineNum = 59441155;BA.debugLine="If colHeight <> Null Then heights.Add(colHeight)";
if (_colheight!= null) { 
__ref._heights /*anywheresoftware.b4a.objects.collections.List*/ .Add(_colheight);};
RDebugUtils.currentLine=59441156;
 //BA.debugLineNum = 59441156;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59441157;
 //BA.debugLineNum = 59441157;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _addrow(b4j.example.pdftable __ref,anywheresoftware.b4a.objects.collections.List _rowdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "addrow", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "addrow", new Object[] {_rowdata}));}
RDebugUtils.currentLine=59506688;
 //BA.debugLineNum = 59506688;BA.debugLine="Sub AddRow(rowData As List) As PDFTable";
RDebugUtils.currentLine=59506689;
 //BA.debugLineNum = 59506689;BA.debugLine="rows.Add(rowData)";
__ref._rows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_rowdata.getObject()));
RDebugUtils.currentLine=59506690;
 //BA.debugLineNum = 59506690;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59506691;
 //BA.debugLineNum = 59506691;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _addrow1(b4j.example.pdftable __ref,b4j.example.pdfrow _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "addrow1", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "addrow1", new Object[] {_row}));}
RDebugUtils.currentLine=59572224;
 //BA.debugLineNum = 59572224;BA.debugLine="Sub AddRow1(row As PDFRow) As PDFTable";
RDebugUtils.currentLine=59572225;
 //BA.debugLineNum = 59572225;BA.debugLine="rows.Add(row.Content)";
__ref._rows /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_row._getcontent /*anywheresoftware.b4a.objects.collections.List*/ (null).getObject()));
RDebugUtils.currentLine=59572226;
 //BA.debugLineNum = 59572226;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59572227;
 //BA.debugLineNum = 59572227;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _addrowtexts(b4j.example.pdftable __ref,anywheresoftware.b4a.objects.collections.List _rowdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "addrowtexts", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "addrowtexts", new Object[] {_rowdata}));}
b4j.example.pdfrow _trow = null;
b4j.example.pdftext _txt = null;
RDebugUtils.currentLine=59637760;
 //BA.debugLineNum = 59637760;BA.debugLine="Sub AddRowTexts(rowData As List) As PDFTable";
RDebugUtils.currentLine=59637761;
 //BA.debugLineNum = 59637761;BA.debugLine="Dim trow As PDFRow";
_trow = new b4j.example.pdfrow();
RDebugUtils.currentLine=59637762;
 //BA.debugLineNum = 59637762;BA.debugLine="trow.Initialize";
_trow._initialize /*b4j.example.pdfrow*/ (null,ba);
RDebugUtils.currentLine=59637763;
 //BA.debugLineNum = 59637763;BA.debugLine="For Each txt As PDFText In rowData";
{
final anywheresoftware.b4a.BA.IterableList group3 = _rowdata;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_txt = (b4j.example.pdftext)(group3.Get(index3));
RDebugUtils.currentLine=59637764;
 //BA.debugLineNum = 59637764;BA.debugLine="trow.AddText(txt)";
_trow._addtext /*b4j.example.pdfrow*/ (null,_txt);
 }
};
RDebugUtils.currentLine=59637766;
 //BA.debugLineNum = 59637766;BA.debugLine="AddRow1(trow)";
__ref._addrow1 /*b4j.example.pdftable*/ (null,_trow);
RDebugUtils.currentLine=59637767;
 //BA.debugLineNum = 59637767;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59637768;
 //BA.debugLineNum = 59637768;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdftable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
RDebugUtils.currentLine=58982400;
 //BA.debugLineNum = 58982400;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=58982401;
 //BA.debugLineNum = 58982401;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58982402;
 //BA.debugLineNum = 58982402;BA.debugLine="Private layout As String";
_layout = "";
RDebugUtils.currentLine=58982403;
 //BA.debugLineNum = 58982403;BA.debugLine="Public lightHorizontalLines As Boolean";
_lighthorizontallines = false;
RDebugUtils.currentLine=58982404;
 //BA.debugLineNum = 58982404;BA.debugLine="Public noBorders As Boolean";
_noborders = false;
RDebugUtils.currentLine=58982405;
 //BA.debugLineNum = 58982405;BA.debugLine="Public headerLineOnly As Boolean";
_headerlineonly = false;
RDebugUtils.currentLine=58982406;
 //BA.debugLineNum = 58982406;BA.debugLine="Public headerRows As Int";
_headerrows = 0;
RDebugUtils.currentLine=58982407;
 //BA.debugLineNum = 58982407;BA.debugLine="Private table As Map";
_table = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=58982408;
 //BA.debugLineNum = 58982408;BA.debugLine="Private widths As List";
_widths = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58982409;
 //BA.debugLineNum = 58982409;BA.debugLine="Private heights As List";
_heights = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58982410;
 //BA.debugLineNum = 58982410;BA.debugLine="Private hdr As List";
_hdr = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58982411;
 //BA.debugLineNum = 58982411;BA.debugLine="Private body As List";
_body = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58982412;
 //BA.debugLineNum = 58982412;BA.debugLine="Private rows As List";
_rows = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58982413;
 //BA.debugLineNum = 58982413;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
RDebugUtils.currentLine=58982414;
 //BA.debugLineNum = 58982414;BA.debugLine="Private pageOrientation As String";
_pageorientation = "";
RDebugUtils.currentLine=58982415;
 //BA.debugLineNum = 58982415;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdftable  _setabsoluteposition(b4j.example.pdftable __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "setabsoluteposition", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "setabsoluteposition", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=59179008;
 //BA.debugLineNum = 59179008;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
RDebugUtils.currentLine=59179009;
 //BA.debugLineNum = 59179009;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=59179010;
 //BA.debugLineNum = 59179010;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=59179011;
 //BA.debugLineNum = 59179011;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=59179012;
 //BA.debugLineNum = 59179012;BA.debugLine="options.Put(\"absolutePosition\", opt)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
RDebugUtils.currentLine=59179013;
 //BA.debugLineNum = 59179013;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59179014;
 //BA.debugLineNum = 59179014;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setcolumnnames(b4j.example.pdftable __ref,anywheresoftware.b4a.objects.collections.List _names) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "setcolumnnames", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "setcolumnnames", new Object[] {_names}));}
String _k = "";
RDebugUtils.currentLine=59375616;
 //BA.debugLineNum = 59375616;BA.debugLine="Sub SetColumnNames(names As List) As PDFTable";
RDebugUtils.currentLine=59375617;
 //BA.debugLineNum = 59375617;BA.debugLine="For Each k As String In names";
{
final anywheresoftware.b4a.BA.IterableList group1 = _names;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=59375618;
 //BA.debugLineNum = 59375618;BA.debugLine="hdr.Add(k)";
__ref._hdr /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_k));
 }
};
RDebugUtils.currentLine=59375620;
 //BA.debugLineNum = 59375620;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59375621;
 //BA.debugLineNum = 59375621;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setheaderrows(b4j.example.pdftable __ref,int _iheaderrows) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "setheaderrows", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "setheaderrows", new Object[] {_iheaderrows}));}
RDebugUtils.currentLine=59113472;
 //BA.debugLineNum = 59113472;BA.debugLine="Sub SetHeaderRows(iheaderRows As Int) As PDFTable";
RDebugUtils.currentLine=59113473;
 //BA.debugLineNum = 59113473;BA.debugLine="If iheaderRows = 0 Then Return Me";
if (_iheaderrows==0) { 
if (true) return (b4j.example.pdftable)(this);};
RDebugUtils.currentLine=59113474;
 //BA.debugLineNum = 59113474;BA.debugLine="headerRows = iheaderRows";
__ref._headerrows /*int*/  = _iheaderrows;
RDebugUtils.currentLine=59113475;
 //BA.debugLineNum = 59113475;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59113476;
 //BA.debugLineNum = 59113476;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setheights(b4j.example.pdftable __ref,anywheresoftware.b4a.objects.collections.List _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "setheights", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "setheights", new Object[] {_h}));}
String _k = "";
RDebugUtils.currentLine=59310080;
 //BA.debugLineNum = 59310080;BA.debugLine="Sub SetHeights(h As List) As PDFTable";
RDebugUtils.currentLine=59310081;
 //BA.debugLineNum = 59310081;BA.debugLine="For Each k As String In h";
{
final anywheresoftware.b4a.BA.IterableList group1 = _h;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=59310082;
 //BA.debugLineNum = 59310082;BA.debugLine="heights.Add(k)";
__ref._heights /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_k));
 }
};
RDebugUtils.currentLine=59310084;
 //BA.debugLineNum = 59310084;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59310085;
 //BA.debugLineNum = 59310085;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setid(b4j.example.pdftable __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "setid", new Object[] {_sid}));}
RDebugUtils.currentLine=59834368;
 //BA.debugLineNum = 59834368;BA.debugLine="Sub SetID(sid As String) As PDFTable";
RDebugUtils.currentLine=59834369;
 //BA.debugLineNum = 59834369;BA.debugLine="options.Put(\"id\", sid)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("id"),(Object)(_sid));
RDebugUtils.currentLine=59834370;
 //BA.debugLineNum = 59834370;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59834371;
 //BA.debugLineNum = 59834371;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setpagebreakafter(b4j.example.pdftable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "setpagebreakafter", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "setpagebreakafter", null));}
RDebugUtils.currentLine=59768832;
 //BA.debugLineNum = 59768832;BA.debugLine="Sub SetPageBreakAfter As PDFTable";
RDebugUtils.currentLine=59768833;
 //BA.debugLineNum = 59768833;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));
RDebugUtils.currentLine=59768834;
 //BA.debugLineNum = 59768834;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59768835;
 //BA.debugLineNum = 59768835;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setpagebreakbefore(b4j.example.pdftable __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "setpagebreakbefore", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "setpagebreakbefore", null));}
RDebugUtils.currentLine=59703296;
 //BA.debugLineNum = 59703296;BA.debugLine="Sub SetPageBreakBefore As PDFTable";
RDebugUtils.currentLine=59703297;
 //BA.debugLineNum = 59703297;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));
RDebugUtils.currentLine=59703298;
 //BA.debugLineNum = 59703298;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59703299;
 //BA.debugLineNum = 59703299;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setpageorientation(b4j.example.pdftable __ref,String _spageorientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "setpageorientation", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "setpageorientation", new Object[] {_spageorientation}));}
RDebugUtils.currentLine=59899904;
 //BA.debugLineNum = 59899904;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
RDebugUtils.currentLine=59899905;
 //BA.debugLineNum = 59899905;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdftable)(this);};
RDebugUtils.currentLine=59899906;
 //BA.debugLineNum = 59899906;BA.debugLine="pageOrientation = spageOrientation";
__ref._pageorientation /*String*/  = _spageorientation;
RDebugUtils.currentLine=59899907;
 //BA.debugLineNum = 59899907;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59899908;
 //BA.debugLineNum = 59899908;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftable  _setwidths(b4j.example.pdftable __ref,anywheresoftware.b4a.objects.collections.List _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftable";
if (Debug.shouldDelegate(ba, "setwidths", true))
	 {return ((b4j.example.pdftable) Debug.delegate(ba, "setwidths", new Object[] {_w}));}
String _k = "";
RDebugUtils.currentLine=59244544;
 //BA.debugLineNum = 59244544;BA.debugLine="Sub SetWidths(w As List) As PDFTable";
RDebugUtils.currentLine=59244545;
 //BA.debugLineNum = 59244545;BA.debugLine="For Each k As String In w";
{
final anywheresoftware.b4a.BA.IterableList group1 = _w;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=59244546;
 //BA.debugLineNum = 59244546;BA.debugLine="widths.Add(k)";
__ref._widths /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_k));
 }
};
RDebugUtils.currentLine=59244548;
 //BA.debugLineNum = 59244548;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftable)(this);
RDebugUtils.currentLine=59244549;
 //BA.debugLineNum = 59244549;BA.debugLine="End Sub";
return null;
}
}