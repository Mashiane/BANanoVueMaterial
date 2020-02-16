package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmgrid extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmgrid", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmgrid.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _grid = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public anywheresoftware.b4a.objects.collections.Map _rows = null;
public anywheresoftware.b4a.objects.collections.Map _columns = null;
public int _lastrow = 0;
public anywheresoftware.b4a.objects.collections.Map _rc = null;
public String _rowclass = "";
public String _cellclass = "";
public boolean _showid = false;
public anywheresoftware.b4a.objects.collections.Map _components = null;
public anywheresoftware.b4a.objects.collections.Map _rowclasses = null;
public anywheresoftware.b4a.objects.collections.Map _offclass = null;
public anywheresoftware.b4a.objects.collections.Map _colclass = null;
public anywheresoftware.b4a.objects.collections.Map _rowstyles = null;
public anywheresoftware.b4a.objects.collections.Map _attributes = null;
public boolean _isbuilt = false;
public Object _module = null;
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
public static class _gridrow{
public boolean IsInitialized;
public String Rows;
public anywheresoftware.b4a.objects.collections.List Columns;
public String Visibility;
public String ThemeName;
public String ClassName;
public String Row;
public Object MarginTop;
public Object MarginBottom;
public Object MarginLeft;
public Object MarginRight;
public Object PaddingTop;
public Object PaddingBottom;
public Object PaddingLeft;
public Object PaddingRight;
public void Initialize() {
IsInitialized = true;
Rows = "";
Columns = new anywheresoftware.b4a.objects.collections.List();
Visibility = "";
ThemeName = "";
ClassName = "";
Row = "";
MarginTop = new Object();
MarginBottom = new Object();
MarginLeft = new Object();
MarginRight = new Object();
PaddingTop = new Object();
PaddingBottom = new Object();
PaddingLeft = new Object();
PaddingRight = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _gridcolumn{
public boolean IsInitialized;
public String Columns;
public String OffsetSmall;
public String OffsetMedium;
public String OffsetLarge;
public String OffsetXLarge;
public String SizeSmall;
public String SizeMedium;
public String SizeLarge;
public String SizeXLarge;
public String ThemeName;
public String Visibility;
public String ClassName;
public String Row;
public String Col;
public Object MarginTop;
public Object MarginBottom;
public Object MarginLeft;
public Object MarginRight;
public Object PaddingTop;
public Object PaddingBottom;
public Object PaddingLeft;
public Object PaddingRight;
public void Initialize() {
IsInitialized = true;
Columns = "";
OffsetSmall = "";
OffsetMedium = "";
OffsetLarge = "";
OffsetXLarge = "";
SizeSmall = "";
SizeMedium = "";
SizeLarge = "";
SizeXLarge = "";
ThemeName = "";
Visibility = "";
ClassName = "";
Row = "";
Col = "";
MarginTop = new Object();
MarginBottom = new Object();
MarginLeft = new Object();
MarginRight = new Object();
PaddingTop = new Object();
PaddingBottom = new Object();
PaddingLeft = new Object();
PaddingRight = new Object();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public b4j.example.vmgrid  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 577;BA.debugLine="Sub AddClass(c As String) As VMGrid";
 //BA.debugLineNum = 578;BA.debugLine="Grid.AddClass(c)";
_grid._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 579;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumnosmp(int _icolumns,String _ioffsetsmall,String _ioffsetmedium,String _ioffsetlarge,String _ioffsetxlarge,String _isizesmall,String _isizemedium,String _isizelarge,String _isizexlarge,String _sthemename,String _svisibility,String _sclassname) throws Exception{
b4j.example.vmgrid._gridcolumn _ncell = null;
String _rowkey = "";
b4j.example.vmgrid._gridrow _oldrow = null;
anywheresoftware.b4a.objects.collections.List _cols = null;
 //BA.debugLineNum = 390;BA.debugLine="Sub AddColumnOSMP(iColumns As Int, iOffsetSmall As";
 //BA.debugLineNum = 394;BA.debugLine="Dim nCell As GridColumn";
_ncell = new b4j.example.vmgrid._gridcolumn();
 //BA.debugLineNum = 395;BA.debugLine="nCell.Initialize";
_ncell.Initialize();
 //BA.debugLineNum = 396;BA.debugLine="InitializeColumn(nCell)";
_initializecolumn(_ncell);
 //BA.debugLineNum = 397;BA.debugLine="nCell = CreateColumn(iColumns,iOffsetSmall,iOffse";
_ncell = _createcolumn(_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_sthemename,_svisibility,_sclassname);
 //BA.debugLineNum = 399;BA.debugLine="Dim rowkey As String = $\"${ID}r${LastRow}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_lastrow))+"");
 //BA.debugLineNum = 401;BA.debugLine="If Rows.ContainsKey(rowkey) Then";
if (_rows.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 403;BA.debugLine="Dim oldRow As GridRow";
_oldrow = new b4j.example.vmgrid._gridrow();
 //BA.debugLineNum = 404;BA.debugLine="oldRow.Initialize";
_oldrow.Initialize();
 //BA.debugLineNum = 405;BA.debugLine="InitializeRow(oldRow)";
_initializerow(_oldrow);
 //BA.debugLineNum = 406;BA.debugLine="oldRow = Rows.Get(rowkey)";
_oldrow = (b4j.example.vmgrid._gridrow)(_rows.Get((Object)(_rowkey)));
 //BA.debugLineNum = 408;BA.debugLine="Dim cols As List = oldRow.Columns";
_cols = new anywheresoftware.b4a.objects.collections.List();
_cols = _oldrow.Columns /*anywheresoftware.b4a.objects.collections.List*/ ;
 //BA.debugLineNum = 409;BA.debugLine="cols.add(nCell)";
_cols.Add((Object)(_ncell));
 //BA.debugLineNum = 410;BA.debugLine="Rows.Put(rowkey,oldRow)";
_rows.Put((Object)(_rowkey),(Object)(_oldrow));
 }else {
 //BA.debugLineNum = 412;BA.debugLine="Log(\"VMGrid - AddColumnOSMP: A row has not been";
__c.Log("VMGrid - AddColumnOSMP: A row has not been added yet to the grid!");
 };
 //BA.debugLineNum = 414;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 415;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns(int _icolumns,String _sizesmall,String _sizemedium,String _sizelarge,String _sizexlarge) throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub AddColumns(iColumns As Int, SizeSmall As Strin";
 //BA.debugLineNum = 385;BA.debugLine="AddColumnOSMP(iColumns,\"\",\"\",\"\",\"\", SizeSmall,Siz";
_addcolumnosmp(_icolumns,"","","","",_sizesmall,_sizemedium,_sizelarge,_sizexlarge,"","","");
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns10p2() throws Exception{
 //BA.debugLineNum = 354;BA.debugLine="Sub AddColumns10p2 As VMGrid";
 //BA.debugLineNum = 355;BA.debugLine="AddColumns(1,\"12\",\"10\",\"10\",\"10\").AddColumns(1,\"1";
_addcolumns((int) (1),"12","10","10","10")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","2","2","2");
 //BA.debugLineNum = 356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns11p1() throws Exception{
 //BA.debugLineNum = 344;BA.debugLine="Sub AddColumns11p1 As VMGrid";
 //BA.debugLineNum = 345;BA.debugLine="AddColumns(1,\"12\",\"11\",\"11\",\"11\").AddColumns(1,\"1";
_addcolumns((int) (1),"12","11","11","11")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","1","1","1");
 //BA.debugLineNum = 346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns12() throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub AddColumns12 As VMGrid";
 //BA.debugLineNum = 380;BA.debugLine="AddColumns(1,\"12\",\"12\",\"12\",\"12\")";
_addcolumns((int) (1),"12","12","12","12");
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns12x1() throws Exception{
 //BA.debugLineNum = 324;BA.debugLine="Sub AddColumns12x1 As VMGrid";
 //BA.debugLineNum = 325;BA.debugLine="AddColumns(12,\"12\",\"1\",\"1\",\"1\")";
_addcolumns((int) (12),"12","1","1","1");
 //BA.debugLineNum = 326;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 327;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns1p11() throws Exception{
 //BA.debugLineNum = 339;BA.debugLine="Sub AddColumns1p11 As VMGrid";
 //BA.debugLineNum = 340;BA.debugLine="AddColumns(1,\"12\",\"1\",\"1\",\"1\").AddColumns(1,\"12\",";
_addcolumns((int) (1),"12","1","1","1")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","11","11","11");
 //BA.debugLineNum = 341;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 342;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns2p10() throws Exception{
 //BA.debugLineNum = 349;BA.debugLine="Sub AddColumns2p10 As VMGrid";
 //BA.debugLineNum = 350;BA.debugLine="AddColumns(1,\"12\",\"2\",\"2\",\"2\").AddColumns(1,\"12\",";
_addcolumns((int) (1),"12","2","2","2")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","10","10","10");
 //BA.debugLineNum = 351;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 352;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns2x6() throws Exception{
 //BA.debugLineNum = 314;BA.debugLine="Sub AddColumns2x6 As VMGrid";
 //BA.debugLineNum = 315;BA.debugLine="AddColumns(2,\"12\",\"6\",\"6\",\"6\")";
_addcolumns((int) (2),"12","6","6","6");
 //BA.debugLineNum = 316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns3p9() throws Exception{
 //BA.debugLineNum = 359;BA.debugLine="Sub AddColumns3p9 As VMGrid";
 //BA.debugLineNum = 360;BA.debugLine="AddColumns(1,\"12\",\"3\",\"3\",\"3\").AddColumns(1,\"12\",";
_addcolumns((int) (1),"12","3","3","3")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","9","9","9");
 //BA.debugLineNum = 361;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 362;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns3x4() throws Exception{
 //BA.debugLineNum = 304;BA.debugLine="Sub AddColumns3x4 As VMGrid";
 //BA.debugLineNum = 305;BA.debugLine="AddColumns(3,\"12\",\"4\",\"4\",\"4\")";
_addcolumns((int) (3),"12","4","4","4");
 //BA.debugLineNum = 306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns4p8() throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub AddColumns4p8 As VMGrid";
 //BA.debugLineNum = 335;BA.debugLine="AddColumns(1,\"12\",\"4\",\"4\",\"4\").AddColumns(1,\"12\",";
_addcolumns((int) (1),"12","4","4","4")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","8","8","8");
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns4x3() throws Exception{
 //BA.debugLineNum = 309;BA.debugLine="Sub AddColumns4x3 As VMGrid";
 //BA.debugLineNum = 310;BA.debugLine="AddColumns(4,\"12\",\"3\",\"3\",\"3\")";
_addcolumns((int) (4),"12","3","3","3");
 //BA.debugLineNum = 311;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 312;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns5p7() throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub AddColumns5p7 As VMGrid";
 //BA.debugLineNum = 375;BA.debugLine="AddColumns(1,\"12\",\"5\",\"5\",\"5\").AddColumns(1,\"12\",";
_addcolumns((int) (1),"12","5","5","5")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","7","7","7");
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns6x2() throws Exception{
 //BA.debugLineNum = 319;BA.debugLine="Sub AddColumns6x2 As VMGrid";
 //BA.debugLineNum = 320;BA.debugLine="AddColumns(6,\"12\",\"2\",\"2\",\"2\")";
_addcolumns((int) (6),"12","2","2","2");
 //BA.debugLineNum = 321;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 322;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns7p5() throws Exception{
 //BA.debugLineNum = 369;BA.debugLine="Sub AddColumns7p5 As VMGrid";
 //BA.debugLineNum = 370;BA.debugLine="AddColumns(1,\"12\",\"7\",\"7\",\"7\").AddColumns(1,\"12\",";
_addcolumns((int) (1),"12","7","7","7")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","5","5","5");
 //BA.debugLineNum = 371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns8p4() throws Exception{
 //BA.debugLineNum = 329;BA.debugLine="Sub AddColumns8p4 As VMGrid";
 //BA.debugLineNum = 330;BA.debugLine="AddColumns(1,\"12\",\"8\",\"8\",\"8\").AddColumns(1,\"12\",";
_addcolumns((int) (1),"12","8","8","8")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","4","4","4");
 //BA.debugLineNum = 331;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns9p3() throws Exception{
 //BA.debugLineNum = 364;BA.debugLine="Sub AddColumns9p3 As VMGrid";
 //BA.debugLineNum = 365;BA.debugLine="AddColumns(1,\"12\",\"9\",\"9\",\"9\").AddColumns(1,\"12\",";
_addcolumns((int) (1),"12","9","9","9")._addcolumns /*b4j.example.vmgrid*/ ((int) (1),"12","3","3","3");
 //BA.debugLineNum = 366;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumnsosmpv(String _icolumns,String _ioffsetsmall,String _ioffsetmedium,String _ioffsetlarge,String _ioffsetxlarge,String _isizesmall,String _isizemedium,String _isizelarge,String _isizexlarge,String _ivisibility,String _stheme) throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub AddColumnsOSMPV(iColumns As String, iOffsetSma";
 //BA.debugLineNum = 293;BA.debugLine="AddColumnOSMP(iColumns, iOffsetSmall, iOffsetMedi";
_addcolumnosmp((int)(Double.parseDouble(_icolumns)),_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_stheme,_ivisibility,"");
 //BA.debugLineNum = 296;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 297;BA.debugLine="End Sub";
return null;
}
public String  _addcomponent(int _rowpos,int _colpos,String _elhtml) throws Exception{
String _cellkey = "";
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 441;BA.debugLine="Sub AddComponent(rowPos As Int, colPos As Int, elH";
 //BA.debugLineNum = 442;BA.debugLine="Dim cellKey As String = $\"${ID}r${rowPos}c${colPo";
_cellkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"c"+__c.SmartStringFormatter("",(Object)(_colpos))+"");
 //BA.debugLineNum = 443;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 444;BA.debugLine="If Components.ContainsKey(cellKey) Then";
if (_components.ContainsKey((Object)(_cellkey))) { 
 //BA.debugLineNum = 445;BA.debugLine="lst = Components.Get(cellKey)";
_lst.setObject((java.util.List)(_components.Get((Object)(_cellkey))));
 }else {
 //BA.debugLineNum = 447;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 448;BA.debugLine="lst.clear";
_lst.Clear();
 };
 //BA.debugLineNum = 450;BA.debugLine="lst.Add(elHTML)";
_lst.Add((Object)(_elhtml));
 //BA.debugLineNum = 451;BA.debugLine="Components.Put(cellKey,lst)";
_components.Put((Object)(_cellkey),(Object)(_lst.getObject()));
 //BA.debugLineNum = 452;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _addgridclass(String _classname) throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub AddGridClass(className As String) As VMGrid";
 //BA.debugLineNum = 496;BA.debugLine="Grid.AddClass(className)";
_grid._addclass /*b4j.example.vmelement*/ (_classname);
 //BA.debugLineNum = 497;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addrow(int _irows,String _svisibility,String _sthemename,String _sclassname) throws Exception{
b4j.example.vmgrid._gridrow _nrow = null;
String _rowkey = "";
 //BA.debugLineNum = 274;BA.debugLine="Sub AddRow(iRows As Int, sVisibility As String, sT";
 //BA.debugLineNum = 277;BA.debugLine="LastRow = Rows.size";
_lastrow = _rows.getSize();
 //BA.debugLineNum = 279;BA.debugLine="Dim nRow As GridRow";
_nrow = new b4j.example.vmgrid._gridrow();
 //BA.debugLineNum = 280;BA.debugLine="nRow.Initialize";
_nrow.Initialize();
 //BA.debugLineNum = 281;BA.debugLine="InitializeRow(nRow)";
_initializerow(_nrow);
 //BA.debugLineNum = 282;BA.debugLine="nRow  = CreateRow(iRows,sVisibility,sThemeName,sC";
_nrow = _createrow(_irows,_svisibility,_sthemename,_sclassname);
 //BA.debugLineNum = 284;BA.debugLine="Dim rowKey As String = $\"${ID}r${LastRow}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_lastrow))+"");
 //BA.debugLineNum = 286;BA.debugLine="Rows.Put(rowKey,nRow)";
_rows.Put((Object)(_rowkey),(Object)(_nrow));
 //BA.debugLineNum = 287;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 288;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addrows(int _irows) throws Exception{
 //BA.debugLineNum = 299;BA.debugLine="Sub AddRows(iRows As Int) As VMGrid";
 //BA.debugLineNum = 300;BA.debugLine="AddRow(iRows,\"\",\"\",\"\")";
_addrow(_irows,"","","");
 //BA.debugLineNum = 301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 302;BA.debugLine="End Sub";
return null;
}
public String  _build() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _rowcnt = 0;
int _rowtot = 0;
String _rowkey = "";
b4j.example.vmgrid._gridrow _currentrow = null;
String _strrow = "";
 //BA.debugLineNum = 608;BA.debugLine="Sub Build";
 //BA.debugLineNum = 609;BA.debugLine="If isBuilt = True Then Return";
if (_isbuilt==__c.True) { 
if (true) return "";};
 //BA.debugLineNum = 611;BA.debugLine="LastRow = 0";
_lastrow = (int) (0);
 //BA.debugLineNum = 612;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 613;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 615;BA.debugLine="Dim rowCnt As Int = 0";
_rowcnt = (int) (0);
 //BA.debugLineNum = 616;BA.debugLine="Dim rowTot As Int = Rows.Size - 1";
_rowtot = (int) (_rows.getSize()-1);
 //BA.debugLineNum = 617;BA.debugLine="For rowCnt = 0 To rowTot";
{
final int step7 = 1;
final int limit7 = _rowtot;
_rowcnt = (int) (0) ;
for (;_rowcnt <= limit7 ;_rowcnt = _rowcnt + step7 ) {
 //BA.debugLineNum = 618;BA.debugLine="Dim rowKey As String = Rows.GetKeyAt(rowCnt)";
_rowkey = BA.ObjectToString(_rows.GetKeyAt(_rowcnt));
 //BA.debugLineNum = 619;BA.debugLine="Dim currentRow As GridRow";
_currentrow = new b4j.example.vmgrid._gridrow();
 //BA.debugLineNum = 620;BA.debugLine="currentRow.Initialize";
_currentrow.Initialize();
 //BA.debugLineNum = 621;BA.debugLine="InitializeRow(currentRow)";
_initializerow(_currentrow);
 //BA.debugLineNum = 622;BA.debugLine="currentRow = Rows.Get(rowKey)";
_currentrow = (b4j.example.vmgrid._gridrow)(_rows.Get((Object)(_rowkey)));
 //BA.debugLineNum = 623;BA.debugLine="Dim strRow As String = BuildRow(currentRow)";
_strrow = _buildrow(_currentrow);
 //BA.debugLineNum = 624;BA.debugLine="sb.Append(strRow)";
_sb.Append(_strrow);
 //BA.debugLineNum = 625;BA.debugLine="sb.append(CRLF)";
_sb.Append(__c.CRLF);
 }
};
 //BA.debugLineNum = 627;BA.debugLine="Grid.SetText(sb.tostring)";
_grid._settext /*b4j.example.vmelement*/ (_sb.ToString());
 //BA.debugLineNum = 628;BA.debugLine="isBuilt = True";
_isbuilt = __c.True;
 //BA.debugLineNum = 629;BA.debugLine="End Sub";
return "";
}
public String  _buildcolumnclass(b4j.example.vmgrid._gridcolumn _col) throws Exception{
String _strspans = "";
String _stroffsets = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 855;BA.debugLine="private Sub BuildColumnClass(col As GridColumn) As";
 //BA.debugLineNum = 856;BA.debugLine="Dim strSpans As String = BuildSpans(col.SizeSmall";
_strspans = _buildspans(_col.SizeSmall /*String*/ ,_col.SizeMedium /*String*/ ,_col.SizeLarge /*String*/ ,_col.SizeXLarge /*String*/ );
 //BA.debugLineNum = 857;BA.debugLine="Dim strOffSets As String = BuildOffsets(col.offse";
_stroffsets = _buildoffsets(_col.OffsetSmall /*String*/ ,_col.OffsetMedium /*String*/ ,_col.OffsetLarge /*String*/ ,_col.OffsetXLarge /*String*/ );
 //BA.debugLineNum = 859;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 860;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 861;BA.debugLine="sb.Append($\"${cellClass} \"$)";
_sb.Append((""+__c.SmartStringFormatter("",(Object)(_cellclass))+" "));
 //BA.debugLineNum = 862;BA.debugLine="sb.Append(strSpans)";
_sb.Append(_strspans);
 //BA.debugLineNum = 863;BA.debugLine="sb.Append(strOffSets)";
_sb.Append(_stroffsets);
 //BA.debugLineNum = 864;BA.debugLine="Return sb.tostring.trim";
if (true) return _sb.ToString().trim();
 //BA.debugLineNum = 865;BA.debugLine="End Sub";
return "";
}
public String  _buildoffsets(String _os,String _om,String _ol,String _oxl) throws Exception{
String _pvalue = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _colkey = "";
String _colc = "";
 //BA.debugLineNum = 908;BA.debugLine="Private Sub BuildOffsets(OS As String, OM As Strin";
 //BA.debugLineNum = 909;BA.debugLine="Dim pvalue As String";
_pvalue = "";
 //BA.debugLineNum = 910;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 911;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 912;BA.debugLine="Dim kTot As Int = offClass.Size - 1";
_ktot = (int) (_offclass.getSize()-1);
 //BA.debugLineNum = 913;BA.debugLine="Dim kCnt As Int = 0";
_kcnt = (int) (0);
 //BA.debugLineNum = 914;BA.debugLine="For kCnt = 0 To kTot";
{
final int step6 = 1;
final int limit6 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit6 ;_kcnt = _kcnt + step6 ) {
 //BA.debugLineNum = 915;BA.debugLine="Dim colKey As String = offClass.GetKeyAt(kCnt)";
_colkey = BA.ObjectToString(_offclass.GetKeyAt(_kcnt));
 //BA.debugLineNum = 917;BA.debugLine="Dim colC As String = offClass.Get(colKey)";
_colc = BA.ObjectToString(_offclass.Get((Object)(_colkey)));
 //BA.debugLineNum = 919;BA.debugLine="Select Case colKey";
switch (BA.switchObjectToInt(_colkey,"s","m","l","xl")) {
case 0: {
 //BA.debugLineNum = 921;BA.debugLine="pvalue = CStr(OS)";
_pvalue = _cstr((Object)(_os));
 break; }
case 1: {
 //BA.debugLineNum = 923;BA.debugLine="pvalue = CStr(OM)";
_pvalue = _cstr((Object)(_om));
 break; }
case 2: {
 //BA.debugLineNum = 925;BA.debugLine="pvalue = CStr(OL)";
_pvalue = _cstr((Object)(_ol));
 break; }
case 3: {
 //BA.debugLineNum = 927;BA.debugLine="pvalue = CStr(OXL)";
_pvalue = _cstr((Object)(_oxl));
 break; }
}
;
 //BA.debugLineNum = 929;BA.debugLine="If pvalue <> \"\" Then";
if ((_pvalue).equals("") == false) { 
 //BA.debugLineNum = 930;BA.debugLine="sb.Append(colC)";
_sb.Append(_colc);
 //BA.debugLineNum = 931;BA.debugLine="sb.Append(pvalue)";
_sb.Append(_pvalue);
 //BA.debugLineNum = 932;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 };
 }
};
 //BA.debugLineNum = 935;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 936;BA.debugLine="End Sub";
return "";
}
public String  _buildrow(b4j.example.vmgrid._gridrow _row) throws Exception{
int _rowtot = 0;
int _rowcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _rowkey = "";
b4j.example.vuehtml _trow = null;
String _strrowclass = "";
String _classkey = "";
anywheresoftware.b4a.objects.collections.Map _cm = null;
String _strkey = "";
String _strval = "";
anywheresoftware.b4a.objects.collections.Map _am = null;
String _k = "";
String _v = "";
anywheresoftware.b4a.objects.collections.List _cols = null;
int _colcnt = 0;
int _coltot = 0;
int _lastcolumn = 0;
b4j.example.vmgrid._gridcolumn _column = null;
int _colcnt1 = 0;
int _coltot1 = 0;
String _cellkey = "";
b4j.example.vuehtml _tcolumn = null;
String _strcolumnclass = "";
anywheresoftware.b4a.objects.collections.List _lst = null;
String _strrow = "";
 //BA.debugLineNum = 721;BA.debugLine="private Sub BuildRow(row As GridRow) As String";
 //BA.debugLineNum = 723;BA.debugLine="Dim rowTot As Int = row.Rows";
_rowtot = (int)(Double.parseDouble(_row.Rows /*String*/ ));
 //BA.debugLineNum = 724;BA.debugLine="Dim rowCnt As Int";
_rowcnt = 0;
 //BA.debugLineNum = 725;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 726;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 728;BA.debugLine="For rowCnt = 1 To rowTot";
{
final int step5 = 1;
final int limit5 = _rowtot;
_rowcnt = (int) (1) ;
for (;_rowcnt <= limit5 ;_rowcnt = _rowcnt + step5 ) {
 //BA.debugLineNum = 729;BA.debugLine="LastRow = LastRow + 1";
_lastrow = (int) (_lastrow+1);
 //BA.debugLineNum = 730;BA.debugLine="row.Row = CStr(LastRow)";
_row.Row /*String*/  = _cstr((Object)(_lastrow));
 //BA.debugLineNum = 731;BA.debugLine="Dim rowKey As String = $\"${ID}r${LastRow}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_lastrow))+"");
 //BA.debugLineNum = 732;BA.debugLine="Dim tRow As VueHTML";
_trow = new b4j.example.vuehtml();
 //BA.debugLineNum = 733;BA.debugLine="tRow.Initialize(rowKey,\"div\")";
_trow._initialize /*b4j.example.vuehtml*/ (ba,_rowkey,"div");
 //BA.debugLineNum = 734;BA.debugLine="Dim strRowClass As String = BuildRowClass";
_strrowclass = _buildrowclass();
 //BA.debugLineNum = 735;BA.debugLine="tRow.AddClass(strRowClass)";
_trow._addclass /*b4j.example.vuehtml*/ (_strrowclass);
 //BA.debugLineNum = 736;BA.debugLine="tRow.AddClass(row.ClassName)";
_trow._addclass /*b4j.example.vuehtml*/ (_row.ClassName /*String*/ );
 //BA.debugLineNum = 737;BA.debugLine="tRow.addClass(row.ThemeName)";
_trow._addclass /*b4j.example.vuehtml*/ (_row.ThemeName /*String*/ );
 //BA.debugLineNum = 739;BA.debugLine="tRow.AddStyle(\"margin-top\", row.margintop)";
_trow._addstyle /*b4j.example.vuehtml*/ ("margin-top",_row.MarginTop /*Object*/ );
 //BA.debugLineNum = 740;BA.debugLine="tRow.AddStyle(\"margin-bottom\", row.marginbottom)";
_trow._addstyle /*b4j.example.vuehtml*/ ("margin-bottom",_row.MarginBottom /*Object*/ );
 //BA.debugLineNum = 741;BA.debugLine="tRow.AddStyle(\"margin-left\", row.marginleft)";
_trow._addstyle /*b4j.example.vuehtml*/ ("margin-left",_row.MarginLeft /*Object*/ );
 //BA.debugLineNum = 742;BA.debugLine="tRow.AddStyle(\"margin-right\", row.marginright)";
_trow._addstyle /*b4j.example.vuehtml*/ ("margin-right",_row.MarginRight /*Object*/ );
 //BA.debugLineNum = 743;BA.debugLine="tRow.AddStyle(\"padding-top\", row.paddingtop)";
_trow._addstyle /*b4j.example.vuehtml*/ ("padding-top",_row.PaddingTop /*Object*/ );
 //BA.debugLineNum = 744;BA.debugLine="tRow.AddStyle(\"padding-bottom\", row.paddingbotto";
_trow._addstyle /*b4j.example.vuehtml*/ ("padding-bottom",_row.PaddingBottom /*Object*/ );
 //BA.debugLineNum = 745;BA.debugLine="tRow.AddStyle(\"padding-left\", row.paddingleft)";
_trow._addstyle /*b4j.example.vuehtml*/ ("padding-left",_row.PaddingLeft /*Object*/ );
 //BA.debugLineNum = 746;BA.debugLine="tRow.AddStyle(\"padding-right\", row.paddingright)";
_trow._addstyle /*b4j.example.vuehtml*/ ("padding-right",_row.PaddingRight /*Object*/ );
 //BA.debugLineNum = 749;BA.debugLine="Dim classKey As String = $\"${ID}r${LastRow}\"$";
_classkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_lastrow))+"");
 //BA.debugLineNum = 750;BA.debugLine="If rowClasses.ContainsKey(classKey) Then";
if (_rowclasses.ContainsKey((Object)(_classkey))) { 
 //BA.debugLineNum = 752;BA.debugLine="Dim cm As Map = rowClasses.Get(classKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowclasses.Get((Object)(_classkey))));
 //BA.debugLineNum = 753;BA.debugLine="tRow.AddClass(MapKeys2Delim(cm,\" \"))";
_trow._addclass /*b4j.example.vuehtml*/ (_mapkeys2delim(_cm," "));
 };
 //BA.debugLineNum = 755;BA.debugLine="If rowStyles.ContainsKey(classKey) Then";
if (_rowstyles.ContainsKey((Object)(_classkey))) { 
 //BA.debugLineNum = 756;BA.debugLine="Dim cm As Map = rowStyles.Get(classKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_classkey))));
 //BA.debugLineNum = 757;BA.debugLine="For Each strkey As String In cm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group30 = _cm.Keys();
final int groupLen30 = group30.getSize()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_strkey = BA.ObjectToString(group30.Get(index30));
 //BA.debugLineNum = 758;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
_strval = BA.ObjectToString(_cm.Get((Object)(_strkey)));
 //BA.debugLineNum = 759;BA.debugLine="tRow.AddStyleAttribute(strkey,strVal)";
_trow._addstyleattribute /*b4j.example.vuehtml*/ (_strkey,(Object)(_strval));
 }
};
 };
 //BA.debugLineNum = 762;BA.debugLine="If attributes.ContainsKey(classKey) Then";
if (_attributes.ContainsKey((Object)(_classkey))) { 
 //BA.debugLineNum = 763;BA.debugLine="Dim am As Map = attributes.Get(classKey)";
_am = new anywheresoftware.b4a.objects.collections.Map();
_am.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_classkey))));
 //BA.debugLineNum = 764;BA.debugLine="For Each k As String In am.Keys";
{
final anywheresoftware.b4a.BA.IterableList group37 = _am.Keys();
final int groupLen37 = group37.getSize()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_k = BA.ObjectToString(group37.Get(index37));
 //BA.debugLineNum = 765;BA.debugLine="Dim v As String = am.Get(k)";
_v = BA.ObjectToString(_am.Get((Object)(_k)));
 //BA.debugLineNum = 766;BA.debugLine="tRow.SetAttr(k,v)";
_trow._setattr /*b4j.example.vuehtml*/ (_k,_v);
 }
};
 };
 //BA.debugLineNum = 773;BA.debugLine="Dim cols As List = row.Columns";
_cols = new anywheresoftware.b4a.objects.collections.List();
_cols = _row.Columns /*anywheresoftware.b4a.objects.collections.List*/ ;
 //BA.debugLineNum = 775;BA.debugLine="Dim colCnt As Int = 0";
_colcnt = (int) (0);
 //BA.debugLineNum = 776;BA.debugLine="Dim colTot As Int = cols.Size - 1";
_coltot = (int) (_cols.getSize()-1);
 //BA.debugLineNum = 778;BA.debugLine="Dim LastColumn As Int = 0";
_lastcolumn = (int) (0);
 //BA.debugLineNum = 779;BA.debugLine="For colCnt = 0 To colTot";
{
final int step46 = 1;
final int limit46 = _coltot;
_colcnt = (int) (0) ;
for (;_colcnt <= limit46 ;_colcnt = _colcnt + step46 ) {
 //BA.debugLineNum = 781;BA.debugLine="Dim column As GridColumn";
_column = new b4j.example.vmgrid._gridcolumn();
 //BA.debugLineNum = 782;BA.debugLine="column.Initialize";
_column.Initialize();
 //BA.debugLineNum = 783;BA.debugLine="InitializeColumn(column)";
_initializecolumn(_column);
 //BA.debugLineNum = 784;BA.debugLine="column = cols.Get(colCnt)";
_column = (b4j.example.vmgrid._gridcolumn)(_cols.Get(_colcnt));
 //BA.debugLineNum = 785;BA.debugLine="Dim colCnt1 As Int = 0";
_colcnt1 = (int) (0);
 //BA.debugLineNum = 786;BA.debugLine="Dim colTot1 As Int = column.Columns";
_coltot1 = (int)(Double.parseDouble(_column.Columns /*String*/ ));
 //BA.debugLineNum = 787;BA.debugLine="For colCnt1 = 1 To colTot1";
{
final int step53 = 1;
final int limit53 = _coltot1;
_colcnt1 = (int) (1) ;
for (;_colcnt1 <= limit53 ;_colcnt1 = _colcnt1 + step53 ) {
 //BA.debugLineNum = 789;BA.debugLine="LastColumn = LastColumn + 1";
_lastcolumn = (int) (_lastcolumn+1);
 //BA.debugLineNum = 790;BA.debugLine="column.Row = CStr(LastRow)";
_column.Row /*String*/  = _cstr((Object)(_lastrow));
 //BA.debugLineNum = 791;BA.debugLine="column.Col = CStr(LastColumn)";
_column.Col /*String*/  = _cstr((Object)(_lastcolumn));
 //BA.debugLineNum = 792;BA.debugLine="Dim cellKey As String = $\"${rowKey}c${LastColu";
_cellkey = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"c"+__c.SmartStringFormatter("",(Object)(_lastcolumn))+"");
 //BA.debugLineNum = 794;BA.debugLine="RC.Put(cellKey,cellKey)";
_rc.Put((Object)(_cellkey),(Object)(_cellkey));
 //BA.debugLineNum = 801;BA.debugLine="Dim tColumn As VueHTML";
_tcolumn = new b4j.example.vuehtml();
 //BA.debugLineNum = 802;BA.debugLine="tColumn.Initialize(cellKey,\"div\")";
_tcolumn._initialize /*b4j.example.vuehtml*/ (ba,_cellkey,"div");
 //BA.debugLineNum = 803;BA.debugLine="Dim strColumnClass As String = BuildColumnClas";
_strcolumnclass = _buildcolumnclass(_column);
 //BA.debugLineNum = 804;BA.debugLine="tColumn.AddClass(strColumnClass)";
_tcolumn._addclass /*b4j.example.vuehtml*/ (_strcolumnclass);
 //BA.debugLineNum = 805;BA.debugLine="tColumn.AddClass(column.ClassName)";
_tcolumn._addclass /*b4j.example.vuehtml*/ (_column.ClassName /*String*/ );
 //BA.debugLineNum = 806;BA.debugLine="tColumn.addClass(column.ThemeName)";
_tcolumn._addclass /*b4j.example.vuehtml*/ (_column.ThemeName /*String*/ );
 //BA.debugLineNum = 808;BA.debugLine="tColumn.AddStyle(\"margin-top\", column.marginto";
_tcolumn._addstyle /*b4j.example.vuehtml*/ ("margin-top",_column.MarginTop /*Object*/ );
 //BA.debugLineNum = 809;BA.debugLine="tColumn.AddStyle(\"margin-bottom\", column.margi";
_tcolumn._addstyle /*b4j.example.vuehtml*/ ("margin-bottom",_column.MarginBottom /*Object*/ );
 //BA.debugLineNum = 810;BA.debugLine="tColumn.AddStyle(\"margin-left\", column.marginl";
_tcolumn._addstyle /*b4j.example.vuehtml*/ ("margin-left",_column.MarginLeft /*Object*/ );
 //BA.debugLineNum = 811;BA.debugLine="tColumn.AddStyle(\"margin-right\", column.margin";
_tcolumn._addstyle /*b4j.example.vuehtml*/ ("margin-right",_column.MarginRight /*Object*/ );
 //BA.debugLineNum = 812;BA.debugLine="tColumn.AddStyle(\"padding-top\", column.padding";
_tcolumn._addstyle /*b4j.example.vuehtml*/ ("padding-top",_column.PaddingTop /*Object*/ );
 //BA.debugLineNum = 813;BA.debugLine="tColumn.AddStyle(\"padding-bottom\", column.padd";
_tcolumn._addstyle /*b4j.example.vuehtml*/ ("padding-bottom",_column.PaddingBottom /*Object*/ );
 //BA.debugLineNum = 814;BA.debugLine="tColumn.AddStyle(\"padding-left\", column.paddin";
_tcolumn._addstyle /*b4j.example.vuehtml*/ ("padding-left",_column.PaddingLeft /*Object*/ );
 //BA.debugLineNum = 815;BA.debugLine="tColumn.AddStyle(\"padding-right\", column.paddi";
_tcolumn._addstyle /*b4j.example.vuehtml*/ ("padding-right",_column.PaddingRight /*Object*/ );
 //BA.debugLineNum = 819;BA.debugLine="Dim classKey As String = $\"${ID}r${LastRow}c${";
_classkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_lastrow))+"c"+__c.SmartStringFormatter("",(Object)(_lastcolumn))+"");
 //BA.debugLineNum = 820;BA.debugLine="If rowClasses.ContainsKey(classKey) Then";
if (_rowclasses.ContainsKey((Object)(_classkey))) { 
 //BA.debugLineNum = 822;BA.debugLine="Dim cm As Map = rowClasses.Get(classKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowclasses.Get((Object)(_classkey))));
 //BA.debugLineNum = 823;BA.debugLine="tColumn.AddClass(MapKeys2Delim(cm,\" \"))";
_tcolumn._addclass /*b4j.example.vuehtml*/ (_mapkeys2delim(_cm," "));
 };
 //BA.debugLineNum = 825;BA.debugLine="If rowStyles.ContainsKey(classKey) Then";
if (_rowstyles.ContainsKey((Object)(_classkey))) { 
 //BA.debugLineNum = 826;BA.debugLine="Dim cm As Map = rowStyles.Get(classKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_classkey))));
 //BA.debugLineNum = 827;BA.debugLine="For Each strkey As String In cm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group80 = _cm.Keys();
final int groupLen80 = group80.getSize()
;int index80 = 0;
;
for (; index80 < groupLen80;index80++){
_strkey = BA.ObjectToString(group80.Get(index80));
 //BA.debugLineNum = 828;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
_strval = BA.ObjectToString(_cm.Get((Object)(_strkey)));
 //BA.debugLineNum = 829;BA.debugLine="tColumn.AddStyleAttribute(strkey,strVal)";
_tcolumn._addstyleattribute /*b4j.example.vuehtml*/ (_strkey,(Object)(_strval));
 }
};
 };
 //BA.debugLineNum = 832;BA.debugLine="If attributes.ContainsKey(classKey) Then";
if (_attributes.ContainsKey((Object)(_classkey))) { 
 //BA.debugLineNum = 833;BA.debugLine="Dim am As Map = attributes.Get(classKey)";
_am = new anywheresoftware.b4a.objects.collections.Map();
_am.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_classkey))));
 //BA.debugLineNum = 834;BA.debugLine="For Each k As String In am.Keys";
{
final anywheresoftware.b4a.BA.IterableList group87 = _am.Keys();
final int groupLen87 = group87.getSize()
;int index87 = 0;
;
for (; index87 < groupLen87;index87++){
_k = BA.ObjectToString(group87.Get(index87));
 //BA.debugLineNum = 835;BA.debugLine="Dim v As String = am.Get(k)";
_v = BA.ObjectToString(_am.Get((Object)(_k)));
 //BA.debugLineNum = 836;BA.debugLine="tColumn.SetAttr(k,v)";
_tcolumn._setattr /*b4j.example.vuehtml*/ (_k,_v);
 }
};
 };
 //BA.debugLineNum = 839;BA.debugLine="If Components.ContainsKey(cellKey) Then";
if (_components.ContainsKey((Object)(_cellkey))) { 
 //BA.debugLineNum = 840;BA.debugLine="Dim lst As List = Components.Get(cellKey)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst.setObject((java.util.List)(_components.Get((Object)(_cellkey))));
 //BA.debugLineNum = 841;BA.debugLine="tColumn.AddContentList(lst)";
_tcolumn._addcontentlist /*b4j.example.vuehtml*/ (_lst);
 };
 //BA.debugLineNum = 843;BA.debugLine="tRow.AddElement(tColumn)";
_trow._addelement /*b4j.example.vuehtml*/ (_tcolumn);
 }
};
 }
};
 //BA.debugLineNum = 847;BA.debugLine="Dim strRow As String = tRow.tostring";
_strrow = _trow._tostring /*String*/ ();
 //BA.debugLineNum = 848;BA.debugLine="sb.Append(strRow).Append(CRLF)";
_sb.Append(_strrow).Append(__c.CRLF);
 }
};
 //BA.debugLineNum = 851;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 //BA.debugLineNum = 852;BA.debugLine="End Sub";
return "";
}
public String  _buildrowclass() throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
 //BA.debugLineNum = 868;BA.debugLine="private Sub BuildRowClass() As String";
 //BA.debugLineNum = 869;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 870;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 871;BA.debugLine="sb.Append($\"${rowClass} \"$)";
_sb.Append((""+__c.SmartStringFormatter("",(Object)(_rowclass))+" "));
 //BA.debugLineNum = 872;BA.debugLine="Return sb.tostring.trim";
if (true) return _sb.ToString().trim();
 //BA.debugLineNum = 873;BA.debugLine="End Sub";
return "";
}
public String  _buildspans(String _ss,String _sm,String _sl,String _xl) throws Exception{
String _pvalue = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _colkey = "";
String _colc = "";
 //BA.debugLineNum = 876;BA.debugLine="Private Sub BuildSpans(SS As String, SM As String,";
 //BA.debugLineNum = 877;BA.debugLine="Dim pvalue As String = \"\"";
_pvalue = "";
 //BA.debugLineNum = 878;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 879;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 881;BA.debugLine="Dim kTot As Int = colClass.Size - 1";
_ktot = (int) (_colclass.getSize()-1);
 //BA.debugLineNum = 882;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 883;BA.debugLine="For kCnt = 0 To kTot";
{
final int step6 = 1;
final int limit6 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit6 ;_kcnt = _kcnt + step6 ) {
 //BA.debugLineNum = 884;BA.debugLine="Dim colKey As String = colClass.GetKeyAt(kCnt)";
_colkey = BA.ObjectToString(_colclass.GetKeyAt(_kcnt));
 //BA.debugLineNum = 886;BA.debugLine="Dim colC As String = colClass.Get(colKey)";
_colc = BA.ObjectToString(_colclass.Get((Object)(_colkey)));
 //BA.debugLineNum = 888;BA.debugLine="Select Case colKey";
switch (BA.switchObjectToInt(_colkey,"s","m","l","xl")) {
case 0: {
 //BA.debugLineNum = 890;BA.debugLine="pvalue = CStr(SS)";
_pvalue = _cstr((Object)(_ss));
 break; }
case 1: {
 //BA.debugLineNum = 892;BA.debugLine="pvalue = CStr(SM)";
_pvalue = _cstr((Object)(_sm));
 break; }
case 2: {
 //BA.debugLineNum = 894;BA.debugLine="pvalue = CStr(SL)";
_pvalue = _cstr((Object)(_sl));
 break; }
case 3: {
 //BA.debugLineNum = 896;BA.debugLine="pvalue = CStr(XL)";
_pvalue = _cstr((Object)(_xl));
 break; }
}
;
 //BA.debugLineNum = 898;BA.debugLine="If pvalue <> \"\" Then";
if ((_pvalue).equals("") == false) { 
 //BA.debugLineNum = 899;BA.debugLine="sb.Append(colC)";
_sb.Append(_colc);
 //BA.debugLineNum = 900;BA.debugLine="sb.Append(pvalue)";
_sb.Append(_pvalue);
 //BA.debugLineNum = 901;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 };
 }
};
 //BA.debugLineNum = 904;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 905;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 4;BA.debugLine="Public Grid As VMElement";
_grid = new b4j.example.vmelement();
 //BA.debugLineNum = 5;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 8;BA.debugLine="Private Rows As Map";
_rows = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private Columns As Map";
_columns = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Private LastRow As Int";
_lastrow = 0;
 //BA.debugLineNum = 15;BA.debugLine="Private RC As Map";
_rc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 16;BA.debugLine="Private rowClass As String = \"row\"";
_rowclass = "row";
 //BA.debugLineNum = 17;BA.debugLine="Private cellClass As String = \"col\"";
_cellclass = "col";
 //BA.debugLineNum = 19;BA.debugLine="Public ShowID As Boolean";
_showid = false;
 //BA.debugLineNum = 20;BA.debugLine="Private Components As Map";
_components = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 21;BA.debugLine="Private rowClasses As Map";
_rowclasses = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 23;BA.debugLine="Private offClass As Map = CreateMap(\"s\":\"offset-s";
_offclass = new anywheresoftware.b4a.objects.collections.Map();
_offclass = __c.createMap(new Object[] {(Object)("s"),(Object)("offset-sm-"),(Object)("m"),(Object)("offset-md-"),(Object)("l"),(Object)("offset-lg-"),(Object)("xl"),(Object)("offset-xl-")});
 //BA.debugLineNum = 25;BA.debugLine="Private colClass As Map = CreateMap(\"s\": \"col-sm-";
_colclass = new anywheresoftware.b4a.objects.collections.Map();
_colclass = __c.createMap(new Object[] {(Object)("s"),(Object)("col-sm-"),(Object)("m"),(Object)("col-md-"),(Object)("l"),(Object)("col-lg-"),(Object)("xl"),(Object)("col-xl-")});
 //BA.debugLineNum = 26;BA.debugLine="Private rowStyles As Map";
_rowstyles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 27;BA.debugLine="Private attributes As Map";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 29;BA.debugLine="Type GridRow(Rows As String, Columns As List, Vis";
;
 //BA.debugLineNum = 33;BA.debugLine="Type GridColumn(Columns As String, OffsetSmall As";
;
 //BA.debugLineNum = 38;BA.debugLine="Private isBuilt As Boolean";
_isbuilt = false;
 //BA.debugLineNum = 39;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _clear() throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub Clear As VMGrid";
 //BA.debugLineNum = 66;BA.debugLine="Grid.clear";
_grid._clear /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 67;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 68;BA.debugLine="LastRow = 0";
_lastrow = (int) (0);
 //BA.debugLineNum = 69;BA.debugLine="RC.Initialize";
_rc.Initialize();
 //BA.debugLineNum = 70;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 71;BA.debugLine="Components.Initialize";
_components.Initialize();
 //BA.debugLineNum = 72;BA.debugLine="rowClasses.Initialize";
_rowclasses.Initialize();
 //BA.debugLineNum = 73;BA.debugLine="rowStyles.Initialize";
_rowstyles.Initialize();
 //BA.debugLineNum = 74;BA.debugLine="attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 75;BA.debugLine="isBuilt = False";
_isbuilt = __c.False;
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public boolean  _columnexists(int _rowpos,int _colpos) throws Exception{
String _rowcol = "";
 //BA.debugLineNum = 945;BA.debugLine="Sub ColumnExists(rowPos As Int, colPos As Int) As";
 //BA.debugLineNum = 946;BA.debugLine="Dim rowcol As String = $\"${ID}r${rowPos}c${colPos";
_rowcol = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"c"+__c.SmartStringFormatter("",(Object)(_colpos))+"");
 //BA.debugLineNum = 947;BA.debugLine="Return RC.ContainsKey(rowcol)";
if (true) return _rc.ContainsKey((Object)(_rowcol));
 //BA.debugLineNum = 948;BA.debugLine="End Sub";
return false;
}
public b4j.example.vmgrid._gridcolumn  _createcolumn(int _columns2add,String _offsetsmall,String _offsetmedium,String _offsetlarge,String _offsetxlarge,String _sizesmall,String _sizemedium,String _sizelarge,String _sizexlarge,String _themename,String _visibility,String _classname) throws Exception{
b4j.example.vmgrid._gridcolumn _ncell = null;
 //BA.debugLineNum = 676;BA.debugLine="private Sub CreateColumn(Columns2Add As Int, Offse";
 //BA.debugLineNum = 679;BA.debugLine="Dim nCell As GridColumn";
_ncell = new b4j.example.vmgrid._gridcolumn();
 //BA.debugLineNum = 680;BA.debugLine="nCell.Initialize";
_ncell.Initialize();
 //BA.debugLineNum = 681;BA.debugLine="InitializeColumn(nCell)";
_initializecolumn(_ncell);
 //BA.debugLineNum = 682;BA.debugLine="nCell.Columns = Columns2Add";
_ncell.Columns /*String*/  = BA.NumberToString(_columns2add);
 //BA.debugLineNum = 683;BA.debugLine="nCell.OffsetSmall = OffsetSmall";
_ncell.OffsetSmall /*String*/  = _offsetsmall;
 //BA.debugLineNum = 684;BA.debugLine="nCell.OffsetMedium = OffsetMedium";
_ncell.OffsetMedium /*String*/  = _offsetmedium;
 //BA.debugLineNum = 685;BA.debugLine="nCell.OffsetLarge = OffsetLarge";
_ncell.OffsetLarge /*String*/  = _offsetlarge;
 //BA.debugLineNum = 686;BA.debugLine="nCell.OffsetXLarge = OffsetXLarge";
_ncell.OffsetXLarge /*String*/  = _offsetxlarge;
 //BA.debugLineNum = 687;BA.debugLine="nCell.SizeSmall = SizeSmall";
_ncell.SizeSmall /*String*/  = _sizesmall;
 //BA.debugLineNum = 688;BA.debugLine="nCell.SizeMedium = SizeMedium";
_ncell.SizeMedium /*String*/  = _sizemedium;
 //BA.debugLineNum = 689;BA.debugLine="nCell.SizeLarge = SizeLarge";
_ncell.SizeLarge /*String*/  = _sizelarge;
 //BA.debugLineNum = 690;BA.debugLine="nCell.SizeXLarge = SizeXLarge";
_ncell.SizeXLarge /*String*/  = _sizexlarge;
 //BA.debugLineNum = 691;BA.debugLine="nCell.Visibility = Visibility";
_ncell.Visibility /*String*/  = _visibility;
 //BA.debugLineNum = 692;BA.debugLine="nCell.ClassName = ClassName";
_ncell.ClassName /*String*/  = _classname;
 //BA.debugLineNum = 693;BA.debugLine="nCell.ThemeName = ThemeName";
_ncell.ThemeName /*String*/  = _themename;
 //BA.debugLineNum = 694;BA.debugLine="nCell.MarginTop = Null";
_ncell.MarginTop /*Object*/  = __c.Null;
 //BA.debugLineNum = 695;BA.debugLine="nCell.MarginBottom = Null";
_ncell.MarginBottom /*Object*/  = __c.Null;
 //BA.debugLineNum = 696;BA.debugLine="nCell.MarginLeft = Null";
_ncell.MarginLeft /*Object*/  = __c.Null;
 //BA.debugLineNum = 697;BA.debugLine="nCell.MarginRight = Null";
_ncell.MarginRight /*Object*/  = __c.Null;
 //BA.debugLineNum = 698;BA.debugLine="nCell.PaddingTop = Null";
_ncell.PaddingTop /*Object*/  = __c.Null;
 //BA.debugLineNum = 699;BA.debugLine="nCell.PaddingBottom = Null";
_ncell.PaddingBottom /*Object*/  = __c.Null;
 //BA.debugLineNum = 700;BA.debugLine="nCell.PaddingLeft = Null";
_ncell.PaddingLeft /*Object*/  = __c.Null;
 //BA.debugLineNum = 701;BA.debugLine="nCell.PaddingRight = Null";
_ncell.PaddingRight /*Object*/  = __c.Null;
 //BA.debugLineNum = 702;BA.debugLine="Return nCell";
if (true) return _ncell;
 //BA.debugLineNum = 703;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid._gridrow  _createrow(int _rows2add,String _visibility,String _themename,String _classname) throws Exception{
b4j.example.vmgrid._gridrow _nr = null;
 //BA.debugLineNum = 656;BA.debugLine="private Sub CreateRow(Rows2Add As Int, Visibility";
 //BA.debugLineNum = 657;BA.debugLine="Dim nr As GridRow";
_nr = new b4j.example.vmgrid._gridrow();
 //BA.debugLineNum = 658;BA.debugLine="nr.Initialize";
_nr.Initialize();
 //BA.debugLineNum = 659;BA.debugLine="InitializeRow(nr)";
_initializerow(_nr);
 //BA.debugLineNum = 660;BA.debugLine="nr.ThemeName = ThemeName";
_nr.ThemeName /*String*/  = _themename;
 //BA.debugLineNum = 661;BA.debugLine="nr.Visibility = Visibility";
_nr.Visibility /*String*/  = _visibility;
 //BA.debugLineNum = 662;BA.debugLine="nr.ClassName = ClassName";
_nr.ClassName /*String*/  = _classname;
 //BA.debugLineNum = 663;BA.debugLine="nr.Rows = Rows2Add";
_nr.Rows /*String*/  = BA.NumberToString(_rows2add);
 //BA.debugLineNum = 664;BA.debugLine="nr.MarginTop = Null";
_nr.MarginTop /*Object*/  = __c.Null;
 //BA.debugLineNum = 665;BA.debugLine="nr.MarginBottom = Null";
_nr.MarginBottom /*Object*/  = __c.Null;
 //BA.debugLineNum = 666;BA.debugLine="nr.MarginLeft = Null";
_nr.MarginLeft /*Object*/  = __c.Null;
 //BA.debugLineNum = 667;BA.debugLine="nr.MarginRight = Null";
_nr.MarginRight /*Object*/  = __c.Null;
 //BA.debugLineNum = 668;BA.debugLine="nr.PaddingTop = Null";
_nr.PaddingTop /*Object*/  = __c.Null;
 //BA.debugLineNum = 669;BA.debugLine="nr.PaddingBottom = Null";
_nr.PaddingBottom /*Object*/  = __c.Null;
 //BA.debugLineNum = 670;BA.debugLine="nr.PaddingLeft = Null";
_nr.PaddingLeft /*Object*/  = __c.Null;
 //BA.debugLineNum = 671;BA.debugLine="nr.PaddingRight = Null";
_nr.PaddingRight /*Object*/  = __c.Null;
 //BA.debugLineNum = 672;BA.debugLine="Return nr";
if (true) return _nr;
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 79;BA.debugLine="private Sub CStr(o As Object) As String";
 //BA.debugLineNum = 80;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
if ((_o).equals(_banano.UNDEFINED())) { 
_o = (Object)("");};
 //BA.debugLineNum = 81;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return "";
}
public int  _howmanyrows() throws Exception{
 //BA.debugLineNum = 951;BA.debugLine="Sub HowManyRows() As Int";
 //BA.debugLineNum = 952;BA.debugLine="Return LastRow";
if (true) return _lastrow;
 //BA.debugLineNum = 953;BA.debugLine="End Sub";
return 0;
}
public b4j.example.vmgrid  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 42;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 43;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 44;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 45;BA.debugLine="Grid.Initialize(vue, ID).SetTag(\"div\")";
_grid._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 46;BA.debugLine="Rows.Initialize";
_rows.Initialize();
 //BA.debugLineNum = 47;BA.debugLine="LastRow = 0";
_lastrow = (int) (0);
 //BA.debugLineNum = 48;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 49;BA.debugLine="RC.Initialize";
_rc.Initialize();
 //BA.debugLineNum = 50;BA.debugLine="Columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 51;BA.debugLine="ShowID = False";
_showid = __c.False;
 //BA.debugLineNum = 52;BA.debugLine="Components.Initialize";
_components.Initialize();
 //BA.debugLineNum = 53;BA.debugLine="rowClasses.Initialize";
_rowclasses.Initialize();
 //BA.debugLineNum = 54;BA.debugLine="rowStyles.Initialize";
_rowstyles.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="attributes.Initialize";
_attributes.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="isBuilt = False";
_isbuilt = __c.False;
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public String  _initializecolumn(b4j.example.vmgrid._gridcolumn _thiscolumn) throws Exception{
 //BA.debugLineNum = 631;BA.debugLine="Sub InitializeColumn(thisColumn As GridColumn)";
 //BA.debugLineNum = 632;BA.debugLine="thisColumn.Columns = \"1\"";
_thiscolumn.Columns /*String*/  = "1";
 //BA.debugLineNum = 633;BA.debugLine="thisColumn.OffsetSmall = \"0\"";
_thiscolumn.OffsetSmall /*String*/  = "0";
 //BA.debugLineNum = 634;BA.debugLine="thisColumn.OffsetMedium = \"0\"";
_thiscolumn.OffsetMedium /*String*/  = "0";
 //BA.debugLineNum = 635;BA.debugLine="thisColumn.OffsetLarge = \"0\"";
_thiscolumn.OffsetLarge /*String*/  = "0";
 //BA.debugLineNum = 636;BA.debugLine="thisColumn.SizeSmall = \"12\"";
_thiscolumn.SizeSmall /*String*/  = "12";
 //BA.debugLineNum = 637;BA.debugLine="thisColumn.SizeMedium = \"12\"";
_thiscolumn.SizeMedium /*String*/  = "12";
 //BA.debugLineNum = 638;BA.debugLine="thisColumn.SizeLarge = \"12\"";
_thiscolumn.SizeLarge /*String*/  = "12";
 //BA.debugLineNum = 639;BA.debugLine="thisColumn.SizeXLarge = \"12\"";
_thiscolumn.SizeXLarge /*String*/  = "12";
 //BA.debugLineNum = 640;BA.debugLine="thisColumn.MarginTop = Null";
_thiscolumn.MarginTop /*Object*/  = __c.Null;
 //BA.debugLineNum = 641;BA.debugLine="thisColumn.MarginBottom = Null";
_thiscolumn.MarginBottom /*Object*/  = __c.Null;
 //BA.debugLineNum = 642;BA.debugLine="thisColumn.MarginLeft = Null";
_thiscolumn.MarginLeft /*Object*/  = __c.Null;
 //BA.debugLineNum = 643;BA.debugLine="thisColumn.MarginRight = Null";
_thiscolumn.MarginRight /*Object*/  = __c.Null;
 //BA.debugLineNum = 644;BA.debugLine="thisColumn.PaddingTop = Null";
_thiscolumn.PaddingTop /*Object*/  = __c.Null;
 //BA.debugLineNum = 645;BA.debugLine="thisColumn.PaddingBottom = Null";
_thiscolumn.PaddingBottom /*Object*/  = __c.Null;
 //BA.debugLineNum = 646;BA.debugLine="thisColumn.PaddingLeft = Null";
_thiscolumn.PaddingLeft /*Object*/  = __c.Null;
 //BA.debugLineNum = 647;BA.debugLine="thisColumn.PaddingRight = Null";
_thiscolumn.PaddingRight /*Object*/  = __c.Null;
 //BA.debugLineNum = 648;BA.debugLine="thisColumn.ThemeName = \"\"";
_thiscolumn.ThemeName /*String*/  = "";
 //BA.debugLineNum = 649;BA.debugLine="thisColumn.Visibility = \"\"";
_thiscolumn.Visibility /*String*/  = "";
 //BA.debugLineNum = 650;BA.debugLine="thisColumn.ClassName = \"\"";
_thiscolumn.ClassName /*String*/  = "";
 //BA.debugLineNum = 651;BA.debugLine="thisColumn.Row = \"0\"";
_thiscolumn.Row /*String*/  = "0";
 //BA.debugLineNum = 652;BA.debugLine="thisColumn.Col = \"0\"";
_thiscolumn.Col /*String*/  = "0";
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return "";
}
public String  _initializerow(b4j.example.vmgrid._gridrow _thisrow) throws Exception{
 //BA.debugLineNum = 423;BA.debugLine="private Sub InitializeRow(thisRow As GridRow)";
 //BA.debugLineNum = 424;BA.debugLine="thisRow.Columns.Initialize";
_thisrow.Columns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
 //BA.debugLineNum = 425;BA.debugLine="thisRow.Rows = 1";
_thisrow.Rows /*String*/  = BA.NumberToString(1);
 //BA.debugLineNum = 426;BA.debugLine="thisRow.Visibility = \"\"";
_thisrow.Visibility /*String*/  = "";
 //BA.debugLineNum = 427;BA.debugLine="thisRow.ThemeName = \"0\"";
_thisrow.ThemeName /*String*/  = "0";
 //BA.debugLineNum = 428;BA.debugLine="thisRow.ClassName = \"\"";
_thisrow.ClassName /*String*/  = "";
 //BA.debugLineNum = 429;BA.debugLine="thisRow.MarginTop = Null";
_thisrow.MarginTop /*Object*/  = __c.Null;
 //BA.debugLineNum = 430;BA.debugLine="thisRow.MarginBottom = Null";
_thisrow.MarginBottom /*Object*/  = __c.Null;
 //BA.debugLineNum = 431;BA.debugLine="thisRow.MarginLeft = Null";
_thisrow.MarginLeft /*Object*/  = __c.Null;
 //BA.debugLineNum = 432;BA.debugLine="thisRow.MarginRight = Null";
_thisrow.MarginRight /*Object*/  = __c.Null;
 //BA.debugLineNum = 433;BA.debugLine="thisRow.PaddingTop = Null";
_thisrow.PaddingTop /*Object*/  = __c.Null;
 //BA.debugLineNum = 434;BA.debugLine="thisRow.PaddingBottom = Null";
_thisrow.PaddingBottom /*Object*/  = __c.Null;
 //BA.debugLineNum = 435;BA.debugLine="thisRow.PaddingLeft = Null";
_thisrow.PaddingLeft /*Object*/  = __c.Null;
 //BA.debugLineNum = 436;BA.debugLine="thisRow.PaddingRight = Null";
_thisrow.PaddingRight /*Object*/  = __c.Null;
 //BA.debugLineNum = 437;BA.debugLine="thisRow.Row = 0";
_thisrow.Row /*String*/  = BA.NumberToString(0);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return "";
}
public String  _mapkeys2delim(anywheresoftware.b4a.objects.collections.Map _m,String _delim) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strkey = "";
 //BA.debugLineNum = 706;BA.debugLine="private Sub MapKeys2Delim(m As Map, delim As Strin";
 //BA.debugLineNum = 707;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 708;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 709;BA.debugLine="Dim kTot As Int = m.Size - 1";
_ktot = (int) (_m.getSize()-1);
 //BA.debugLineNum = 710;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
 //BA.debugLineNum = 711;BA.debugLine="Dim strKey As String = m.getkeyat(0)";
_strkey = BA.ObjectToString(_m.GetKeyAt((int) (0)));
 //BA.debugLineNum = 712;BA.debugLine="sb.Append(strKey)";
_sb.Append(_strkey);
 //BA.debugLineNum = 713;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
 //BA.debugLineNum = 714;BA.debugLine="Dim strKey As String = m.getkeyat(kCnt)";
_strkey = BA.ObjectToString(_m.GetKeyAt(_kcnt));
 //BA.debugLineNum = 715;BA.debugLine="sb.Append(delim).append(strKey)";
_sb.Append(_delim).Append(_strkey);
 }
};
 //BA.debugLineNum = 717;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 718;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 603;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 604;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 599;BA.debugLine="Sub Render";
 //BA.debugLineNum = 600;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 601;BA.debugLine="End Sub";
return "";
}
public String  _replacerc(int _rowpos,int _colpos,String _elhtml) throws Exception{
String _cellkey = "";
com.ab.banano.BANanoElement _elbody = null;
 //BA.debugLineNum = 455;BA.debugLine="Sub ReplaceRC(rowPos As Int, colPos As Int, elHTML";
 //BA.debugLineNum = 456;BA.debugLine="Dim cellKey As String = $\"#${ID}r${rowPos}c${colP";
_cellkey = ("#"+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"c"+__c.SmartStringFormatter("",(Object)(_colpos))+"");
 //BA.debugLineNum = 457;BA.debugLine="Dim elBody As BANanoElement";
_elbody = new com.ab.banano.BANanoElement();
 //BA.debugLineNum = 458;BA.debugLine="elBody = BANano.GetElement(cellKey)";
_elbody = _banano.GetElement(_cellkey);
 //BA.debugLineNum = 459;BA.debugLine="If elBody <> Null Then";
if (_elbody!= null) { 
 //BA.debugLineNum = 460;BA.debugLine="elBody.Empty";
_elbody.Empty();
 //BA.debugLineNum = 461;BA.debugLine="elBody.SetHTML(elHTML)";
_elbody.SetHTML(_elhtml);
 };
 //BA.debugLineNum = 463;BA.debugLine="End Sub";
return "";
}
public boolean  _rowexists(int _rowpos) throws Exception{
String _rowcol = "";
 //BA.debugLineNum = 939;BA.debugLine="Sub RowExists(rowPos As Int) As Boolean";
 //BA.debugLineNum = 940;BA.debugLine="Dim rowcol As String = $\"${ID}r${rowPos}\"$";
_rowcol = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"");
 //BA.debugLineNum = 941;BA.debugLine="Return Rows.ContainsKey(rowcol)";
if (true) return _rows.ContainsKey((Object)(_rowcol));
 //BA.debugLineNum = 942;BA.debugLine="End Sub";
return false;
}
public b4j.example.vmgrid  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 583;BA.debugLine="Sub SetAttr(attr As Map) As VMGrid";
 //BA.debugLineNum = 584;BA.debugLine="Grid.SetAttr(attr)";
_grid._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 585;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 586;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setborder(int _rowpos,int _colpos,String _width,String _color,String _bstyle) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 501;BA.debugLine="Sub SetBorder(rowPos As Int, colPos As Int, width";
 //BA.debugLineNum = 502;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 503;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 504;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 505;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 507;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (_rowstyles.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 508;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 510;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 511;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 513;BA.debugLine="rowc.Put(\"border-style\", bstyle)";
_rowc.Put((Object)("border-style"),(Object)(_bstyle));
 //BA.debugLineNum = 514;BA.debugLine="rowc.Put(\"border-width\", width)";
_rowc.Put((Object)("border-width"),(Object)(_width));
 //BA.debugLineNum = 515;BA.debugLine="rowc.Put(\"border-color\", color)";
_rowc.Put((Object)("border-color"),(Object)(_color));
 //BA.debugLineNum = 516;BA.debugLine="rowStyles.Put(rowKey,rowc)";
_rowstyles.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 517;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 518;BA.debugLine="End Sub";
return null;
}
public String  _setclass(int _rowpos,int _colpos,String _classname) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 85;BA.debugLine="Sub SetClass(rowPos As Int, colPos As Int, classNa";
 //BA.debugLineNum = 87;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 88;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 89;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 90;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 92;BA.debugLine="If rowClasses.ContainsKey(rowKey) Then";
if (_rowclasses.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 93;BA.debugLine="rowc = rowClasses.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowclasses.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 95;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 96;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 98;BA.debugLine="rowc.Put(className,className)";
_rowc.Put((Object)(_classname),(Object)(_classname));
 //BA.debugLineNum = 99;BA.debugLine="rowClasses.Put(rowKey,rowc)";
_rowclasses.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 588;BA.debugLine="Sub SetDisabled(b As Boolean) As VMGrid";
 //BA.debugLineNum = 589;BA.debugLine="Grid.SetDisabled(b)";
_grid._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 590;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 591;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setgridborder(String _width,String _color,String _bstyle) throws Exception{
 //BA.debugLineNum = 484;BA.debugLine="Sub SetGridBorder(width As String, color As String";
 //BA.debugLineNum = 485;BA.debugLine="Grid.SetBorder(width, color, bstyle)";
_grid._setborder /*b4j.example.vmelement*/ (_width,_color,_bstyle);
 //BA.debugLineNum = 486;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 487;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setgridstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 490;BA.debugLine="Sub SetGridStyle(m As Map) As VMGrid";
 //BA.debugLineNum = 491;BA.debugLine="Grid.SetStyle(m)";
_grid._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 566;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMGrid";
 //BA.debugLineNum = 567;BA.debugLine="Grid.SetKey(k, bind)";
_grid._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 568;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 569;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setmargins(int _rowpos,int _colpos,Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 520;BA.debugLine="Sub SetMargins(rowPos As Int, colPos As Int, mt As";
 //BA.debugLineNum = 521;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 522;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 523;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 524;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 526;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (_rowstyles.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 527;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 529;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 530;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 532;BA.debugLine="If mt <> Null Then rowc.Put(\"margin-top\", mt)";
if (_mt!= null) { 
_rowc.Put((Object)("margin-top"),_mt);};
 //BA.debugLineNum = 533;BA.debugLine="If mb <> Null Then rowc.Put(\"margin-bottom\", mb)";
if (_mb!= null) { 
_rowc.Put((Object)("margin-bottom"),_mb);};
 //BA.debugLineNum = 534;BA.debugLine="If ml <> Null Then rowc.Put(\"margin-left\", ml)";
if (_ml!= null) { 
_rowc.Put((Object)("margin-left"),_ml);};
 //BA.debugLineNum = 535;BA.debugLine="If mr <> Null Then rowc.Put(\"margin-right\", mr)";
if (_mr!= null) { 
_rowc.Put((Object)("margin-right"),_mr);};
 //BA.debugLineNum = 536;BA.debugLine="rowStyles.Put(rowKey,rowc)";
_rowstyles.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 537;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 538;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setonclick(int _rowpos,int _colpos) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 104;BA.debugLine="Sub SetOnClick(rowpos As Int, colpos As Int) As VM";
 //BA.debugLineNum = 105;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 106;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowpos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 107;BA.debugLine="If colpos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 108;BA.debugLine="rowKey = $\"${ID}r${CStr(rowpos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 110;BA.debugLine="Dim methodName As String = $\"${rowKey}_click\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_click");
 //BA.debugLineNum = 111;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
 //BA.debugLineNum = 112;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 113;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 115;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 116;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 117;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 119;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 120;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 122;BA.debugLine="rowc.Put(\"v-on:click\",methodName)";
_rowc.Put((Object)("v-on:click"),(Object)(_methodname));
 //BA.debugLineNum = 123;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondragend(int _rowpos,int _colpos) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 199;BA.debugLine="Sub SetOnDragEnd(rowPos As Int, colPos As Int) As";
 //BA.debugLineNum = 200;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 201;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 202;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 203;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 205;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragend\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_dragend");
 //BA.debugLineNum = 206;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
 //BA.debugLineNum = 207;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 208;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 210;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 212;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 213;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 215;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 216;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 218;BA.debugLine="rowc.Put(\"v-on:dragend\",methodName)";
_rowc.Put((Object)("v-on:dragend"),(Object)(_methodname));
 //BA.debugLineNum = 219;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondragenter(int _rowpos,int _colpos) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 223;BA.debugLine="Sub SetOnDragEnter(rowPos As Int, colPos As Int) A";
 //BA.debugLineNum = 224;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 225;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 226;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 227;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 229;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragenter\"";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_dragenter");
 //BA.debugLineNum = 230;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
 //BA.debugLineNum = 231;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 232;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 234;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 236;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 237;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 239;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 240;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 242;BA.debugLine="rowc.Put(\"v-on:dragenter\",methodName)";
_rowc.Put((Object)("v-on:dragenter"),(Object)(_methodname));
 //BA.debugLineNum = 243;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondragover(int _rowpos,int _colpos) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 151;BA.debugLine="Sub SetOnDragOver(rowPos As Int, colPos As Int) As";
 //BA.debugLineNum = 152;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 153;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 154;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 155;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 157;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragover\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_dragover");
 //BA.debugLineNum = 158;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
 //BA.debugLineNum = 159;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 160;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 162;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 164;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 165;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 167;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 168;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 170;BA.debugLine="rowc.Put(\"v-on:dragover\",methodName)";
_rowc.Put((Object)("v-on:dragover"),(Object)(_methodname));
 //BA.debugLineNum = 171;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondragstart(int _rowpos,int _colpos) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 175;BA.debugLine="Sub SetOnDragStart(rowPos As Int, colPos As Int) A";
 //BA.debugLineNum = 176;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 177;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 178;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 179;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 181;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragstart\"";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_dragstart");
 //BA.debugLineNum = 182;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
 //BA.debugLineNum = 183;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 184;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 186;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 188;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 189;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 191;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 192;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 194;BA.debugLine="rowc.Put(\"v-on:dragstart\",methodName)";
_rowc.Put((Object)("v-on:dragstart"),(Object)(_methodname));
 //BA.debugLineNum = 195;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondrop(int _rowpos,int _colpos) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 248;BA.debugLine="Sub SetOnDrop(rowPos As Int, colPos As Int) As VMG";
 //BA.debugLineNum = 249;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 250;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 251;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 252;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 254;BA.debugLine="Dim methodName As String = $\"${rowKey}_drop\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_drop");
 //BA.debugLineNum = 255;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
 //BA.debugLineNum = 256;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 257;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 259;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 261;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 262;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 264;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 265;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 267;BA.debugLine="rowc.Put(\"v-on:drop\",methodName)";
_rowc.Put((Object)("v-on:drop"),(Object)(_methodname));
 //BA.debugLineNum = 268;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setontouchstart(int _rowpos,int _colpos) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 128;BA.debugLine="Sub SetOnTouchStart(rowpos As Int, colpos As Int)";
 //BA.debugLineNum = 129;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 130;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowpos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 131;BA.debugLine="If colpos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 132;BA.debugLine="rowKey = $\"${ID}r${CStr(rowpos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 134;BA.debugLine="Dim methodName As String = $\"${rowKey}_touchstart";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_touchstart");
 //BA.debugLineNum = 135;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
 //BA.debugLineNum = 136;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 137;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
 //BA.debugLineNum = 139;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 140;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (_attributes.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 141;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_attributes.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 143;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 144;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 146;BA.debugLine="rowc.Put(\"v-on:touchstart\",methodName)";
_rowc.Put((Object)("v-on:touchstart"),(Object)(_methodname));
 //BA.debugLineNum = 147;BA.debugLine="attributes.Put(rowKey,rowc)";
_attributes.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 148;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setpadding(int _rowpos,int _colpos,Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 540;BA.debugLine="Sub SetPadding(rowPos As Int, colPos As Int, pt As";
 //BA.debugLineNum = 541;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 542;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 543;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 544;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 546;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (_rowstyles.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 547;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 549;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 550;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 552;BA.debugLine="If pt <> Null Then rowc.Put(\"padding-top\", pt)";
if (_pt!= null) { 
_rowc.Put((Object)("padding-top"),_pt);};
 //BA.debugLineNum = 553;BA.debugLine="If pb <> Null Then rowc.Put(\"padding-bottom\", pb)";
if (_pb!= null) { 
_rowc.Put((Object)("padding-bottom"),_pb);};
 //BA.debugLineNum = 554;BA.debugLine="If pl <> Null Then rowc.Put(\"padding-left\", pl)";
if (_pl!= null) { 
_rowc.Put((Object)("padding-left"),_pl);};
 //BA.debugLineNum = 555;BA.debugLine="If pr <> Null Then rowc.Put(\"padding-right\", pr)";
if (_pr!= null) { 
_rowc.Put((Object)("padding-right"),_pr);};
 //BA.debugLineNum = 556;BA.debugLine="rowStyles.Put(rowKey,rowc)";
_rowstyles.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 557;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 558;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setscrollbar(boolean _b) throws Exception{
 //BA.debugLineNum = 60;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMGrid";
 //BA.debugLineNum = 61;BA.debugLine="Grid.SetScrollBar(b)";
_grid._setscrollbar /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setstyle(int _rowpos,int _colpos,String _prop,String _value) throws Exception{
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
 //BA.debugLineNum = 466;BA.debugLine="Sub SetStyle(rowPos As Int, colPos As Int, prop As";
 //BA.debugLineNum = 467;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 468;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_colpos))))+"");
 //BA.debugLineNum = 469;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
 //BA.debugLineNum = 470;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"r"+__c.SmartStringFormatter("",(Object)(_cstr((Object)(_rowpos))))+"");
 };
 //BA.debugLineNum = 472;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (_rowstyles.ContainsKey((Object)(_rowkey))) { 
 //BA.debugLineNum = 473;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rowstyles.Get((Object)(_rowkey))));
 }else {
 //BA.debugLineNum = 475;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
 //BA.debugLineNum = 476;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
 //BA.debugLineNum = 478;BA.debugLine="rowc.Put(prop,value)";
_rowc.Put((Object)(_prop),(Object)(_value));
 //BA.debugLineNum = 479;BA.debugLine="rowStyles.Put(rowKey,rowc)";
_rowstyles.Put((Object)(_rowkey),(Object)(_rowc.getObject()));
 //BA.debugLineNum = 480;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 481;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 561;BA.debugLine="Sub SetVIf(vif As Object) As VMGrid";
 //BA.debugLineNum = 562;BA.debugLine="Grid.SetVIf(vif)";
_grid._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 563;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 564;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 571;BA.debugLine="Sub SetVShow(vif As Object) As VMGrid";
 //BA.debugLineNum = 572;BA.debugLine="Grid.SetVShow(vif)";
_grid._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 573;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
 //BA.debugLineNum = 574;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 418;BA.debugLine="Sub ToString() As String";
 //BA.debugLineNum = 419;BA.debugLine="Build";
_build();
 //BA.debugLineNum = 420;BA.debugLine="Return Grid.ToString";
if (true) return _grid._tostring /*String*/ ();
 //BA.debugLineNum = 421;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
