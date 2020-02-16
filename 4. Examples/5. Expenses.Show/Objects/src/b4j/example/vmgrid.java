package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmgrid extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmgrid", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmgrid  _addcolumns2x6(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns2x6", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns2x6", null));}
RDebugUtils.currentLine=138608640;
 //BA.debugLineNum = 138608640;BA.debugLine="Sub AddColumns2x6 As VMGrid";
RDebugUtils.currentLine=138608641;
 //BA.debugLineNum = 138608641;BA.debugLine="AddColumns(2,\"12\",\"6\",\"6\",\"6\")";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (2),"12","6","6","6");
RDebugUtils.currentLine=138608642;
 //BA.debugLineNum = 138608642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138608643;
 //BA.debugLineNum = 138608643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns12(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns12", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns12", null));}
RDebugUtils.currentLine=139460608;
 //BA.debugLineNum = 139460608;BA.debugLine="Sub AddColumns12 As VMGrid";
RDebugUtils.currentLine=139460609;
 //BA.debugLineNum = 139460609;BA.debugLine="AddColumns(1,\"12\",\"12\",\"12\",\"12\")";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","12","12","12");
RDebugUtils.currentLine=139460610;
 //BA.debugLineNum = 139460610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139460611;
 //BA.debugLineNum = 139460611;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmgrid __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=140836864;
 //BA.debugLineNum = 140836864;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=140836865;
 //BA.debugLineNum = 140836865;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=140836866;
 //BA.debugLineNum = 140836866;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _initialize(b4j.example.vmgrid __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=137494528;
 //BA.debugLineNum = 137494528;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=137494529;
 //BA.debugLineNum = 137494529;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=137494530;
 //BA.debugLineNum = 137494530;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=137494531;
 //BA.debugLineNum = 137494531;BA.debugLine="Grid.Initialize(vue, ID).SetTag(\"div\")";
__ref._grid /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=137494532;
 //BA.debugLineNum = 137494532;BA.debugLine="Rows.Initialize";
__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137494533;
 //BA.debugLineNum = 137494533;BA.debugLine="LastRow = 0";
__ref._lastrow /*int*/  = (int) (0);
RDebugUtils.currentLine=137494534;
 //BA.debugLineNum = 137494534;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=137494535;
 //BA.debugLineNum = 137494535;BA.debugLine="RC.Initialize";
__ref._rc /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137494536;
 //BA.debugLineNum = 137494536;BA.debugLine="Columns.Initialize";
__ref._columns /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137494537;
 //BA.debugLineNum = 137494537;BA.debugLine="ShowID = False";
__ref._showid /*boolean*/  = __c.False;
RDebugUtils.currentLine=137494538;
 //BA.debugLineNum = 137494538;BA.debugLine="Components.Initialize";
__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137494539;
 //BA.debugLineNum = 137494539;BA.debugLine="rowClasses.Initialize";
__ref._rowclasses /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137494540;
 //BA.debugLineNum = 137494540;BA.debugLine="rowStyles.Initialize";
__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137494541;
 //BA.debugLineNum = 137494541;BA.debugLine="attributes.Initialize";
__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137494542;
 //BA.debugLineNum = 137494542;BA.debugLine="isBuilt = False";
__ref._isbuilt /*boolean*/  = __c.False;
RDebugUtils.currentLine=137494543;
 //BA.debugLineNum = 137494543;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=137494544;
 //BA.debugLineNum = 137494544;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumnosmp(b4j.example.vmgrid __ref,int _icolumns,String _ioffsetsmall,String _ioffsetmedium,String _ioffsetlarge,String _ioffsetxlarge,String _isizesmall,String _isizemedium,String _isizelarge,String _isizexlarge,String _sthemename,String _svisibility,String _sclassname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumnosmp", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumnosmp", new Object[] {_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_sthemename,_svisibility,_sclassname}));}
b4j.example.vmgrid._gridcolumn _ncell = null;
String _rowkey = "";
b4j.example.vmgrid._gridrow _oldrow = null;
anywheresoftware.b4a.objects.collections.List _cols = null;
RDebugUtils.currentLine=139591680;
 //BA.debugLineNum = 139591680;BA.debugLine="Sub AddColumnOSMP(iColumns As Int, iOffsetSmall As";
RDebugUtils.currentLine=139591684;
 //BA.debugLineNum = 139591684;BA.debugLine="Dim nCell As GridColumn";
_ncell = new b4j.example.vmgrid._gridcolumn();
RDebugUtils.currentLine=139591685;
 //BA.debugLineNum = 139591685;BA.debugLine="nCell.Initialize";
_ncell.Initialize();
RDebugUtils.currentLine=139591686;
 //BA.debugLineNum = 139591686;BA.debugLine="InitializeColumn(nCell)";
__ref._initializecolumn /*String*/ (null,_ncell);
RDebugUtils.currentLine=139591687;
 //BA.debugLineNum = 139591687;BA.debugLine="nCell = CreateColumn(iColumns,iOffsetSmall,iOffse";
_ncell = __ref._createcolumn /*b4j.example.vmgrid._gridcolumn*/ (null,_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_sthemename,_svisibility,_sclassname);
RDebugUtils.currentLine=139591689;
 //BA.debugLineNum = 139591689;BA.debugLine="Dim rowkey As String = $\"${ID}r${LastRow}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._lastrow /*int*/ ))+"");
RDebugUtils.currentLine=139591691;
 //BA.debugLineNum = 139591691;BA.debugLine="If Rows.ContainsKey(rowkey) Then";
if (__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=139591693;
 //BA.debugLineNum = 139591693;BA.debugLine="Dim oldRow As GridRow";
_oldrow = new b4j.example.vmgrid._gridrow();
RDebugUtils.currentLine=139591694;
 //BA.debugLineNum = 139591694;BA.debugLine="oldRow.Initialize";
_oldrow.Initialize();
RDebugUtils.currentLine=139591695;
 //BA.debugLineNum = 139591695;BA.debugLine="InitializeRow(oldRow)";
__ref._initializerow /*String*/ (null,_oldrow);
RDebugUtils.currentLine=139591696;
 //BA.debugLineNum = 139591696;BA.debugLine="oldRow = Rows.Get(rowkey)";
_oldrow = (b4j.example.vmgrid._gridrow)(__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey)));
RDebugUtils.currentLine=139591698;
 //BA.debugLineNum = 139591698;BA.debugLine="Dim cols As List = oldRow.Columns";
_cols = new anywheresoftware.b4a.objects.collections.List();
_cols = _oldrow.Columns /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=139591699;
 //BA.debugLineNum = 139591699;BA.debugLine="cols.add(nCell)";
_cols.Add((Object)(_ncell));
RDebugUtils.currentLine=139591700;
 //BA.debugLineNum = 139591700;BA.debugLine="Rows.Put(rowkey,oldRow)";
__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_oldrow));
 }else {
RDebugUtils.currentLine=139591702;
 //BA.debugLineNum = 139591702;BA.debugLine="Log(\"VMGrid - AddColumnOSMP: A row has not been";
__c.Log("VMGrid - AddColumnOSMP: A row has not been added yet to the grid!");
 };
RDebugUtils.currentLine=139591704;
 //BA.debugLineNum = 139591704;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139591705;
 //BA.debugLineNum = 139591705;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns(b4j.example.vmgrid __ref,int _icolumns,String _sizesmall,String _sizemedium,String _sizelarge,String _sizexlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns", new Object[] {_icolumns,_sizesmall,_sizemedium,_sizelarge,_sizexlarge}));}
RDebugUtils.currentLine=139526144;
 //BA.debugLineNum = 139526144;BA.debugLine="Sub AddColumns(iColumns As Int, SizeSmall As Strin";
RDebugUtils.currentLine=139526145;
 //BA.debugLineNum = 139526145;BA.debugLine="AddColumnOSMP(iColumns,\"\",\"\",\"\",\"\", SizeSmall,Siz";
__ref._addcolumnosmp /*b4j.example.vmgrid*/ (null,_icolumns,"","","","",_sizesmall,_sizemedium,_sizelarge,_sizexlarge,"","","");
RDebugUtils.currentLine=139526146;
 //BA.debugLineNum = 139526146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139526147;
 //BA.debugLineNum = 139526147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns10p2(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns10p2", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns10p2", null));}
RDebugUtils.currentLine=139132928;
 //BA.debugLineNum = 139132928;BA.debugLine="Sub AddColumns10p2 As VMGrid";
RDebugUtils.currentLine=139132929;
 //BA.debugLineNum = 139132929;BA.debugLine="AddColumns(1,\"12\",\"10\",\"10\",\"10\").AddColumns(1,\"1";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","10","10","10")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","2","2","2");
RDebugUtils.currentLine=139132930;
 //BA.debugLineNum = 139132930;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139132931;
 //BA.debugLineNum = 139132931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns11p1(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns11p1", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns11p1", null));}
RDebugUtils.currentLine=139001856;
 //BA.debugLineNum = 139001856;BA.debugLine="Sub AddColumns11p1 As VMGrid";
RDebugUtils.currentLine=139001857;
 //BA.debugLineNum = 139001857;BA.debugLine="AddColumns(1,\"12\",\"11\",\"11\",\"11\").AddColumns(1,\"1";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","11","11","11")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","1","1","1");
RDebugUtils.currentLine=139001858;
 //BA.debugLineNum = 139001858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139001859;
 //BA.debugLineNum = 139001859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns1p11(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns1p11", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns1p11", null));}
RDebugUtils.currentLine=138936320;
 //BA.debugLineNum = 138936320;BA.debugLine="Sub AddColumns1p11 As VMGrid";
RDebugUtils.currentLine=138936321;
 //BA.debugLineNum = 138936321;BA.debugLine="AddColumns(1,\"12\",\"1\",\"1\",\"1\").AddColumns(1,\"12\",";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","1","1","1")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","11","11","11");
RDebugUtils.currentLine=138936322;
 //BA.debugLineNum = 138936322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138936323;
 //BA.debugLineNum = 138936323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns2p10(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns2p10", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns2p10", null));}
RDebugUtils.currentLine=139067392;
 //BA.debugLineNum = 139067392;BA.debugLine="Sub AddColumns2p10 As VMGrid";
RDebugUtils.currentLine=139067393;
 //BA.debugLineNum = 139067393;BA.debugLine="AddColumns(1,\"12\",\"2\",\"2\",\"2\").AddColumns(1,\"12\",";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","2","2","2")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","10","10","10");
RDebugUtils.currentLine=139067394;
 //BA.debugLineNum = 139067394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139067395;
 //BA.debugLineNum = 139067395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns3p9(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns3p9", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns3p9", null));}
RDebugUtils.currentLine=139198464;
 //BA.debugLineNum = 139198464;BA.debugLine="Sub AddColumns3p9 As VMGrid";
RDebugUtils.currentLine=139198465;
 //BA.debugLineNum = 139198465;BA.debugLine="AddColumns(1,\"12\",\"3\",\"3\",\"3\").AddColumns(1,\"12\",";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","3","3","3")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","9","9","9");
RDebugUtils.currentLine=139198466;
 //BA.debugLineNum = 139198466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139198467;
 //BA.debugLineNum = 139198467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns3x4(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns3x4", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns3x4", null));}
RDebugUtils.currentLine=138477568;
 //BA.debugLineNum = 138477568;BA.debugLine="Sub AddColumns3x4 As VMGrid";
RDebugUtils.currentLine=138477569;
 //BA.debugLineNum = 138477569;BA.debugLine="AddColumns(3,\"12\",\"4\",\"4\",\"4\")";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (3),"12","4","4","4");
RDebugUtils.currentLine=138477570;
 //BA.debugLineNum = 138477570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138477571;
 //BA.debugLineNum = 138477571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns4p8(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns4p8", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns4p8", null));}
RDebugUtils.currentLine=138870784;
 //BA.debugLineNum = 138870784;BA.debugLine="Sub AddColumns4p8 As VMGrid";
RDebugUtils.currentLine=138870785;
 //BA.debugLineNum = 138870785;BA.debugLine="AddColumns(1,\"12\",\"4\",\"4\",\"4\").AddColumns(1,\"12\",";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","4","4","4")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","8","8","8");
RDebugUtils.currentLine=138870786;
 //BA.debugLineNum = 138870786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138870787;
 //BA.debugLineNum = 138870787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns4x3(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns4x3", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns4x3", null));}
RDebugUtils.currentLine=138543104;
 //BA.debugLineNum = 138543104;BA.debugLine="Sub AddColumns4x3 As VMGrid";
RDebugUtils.currentLine=138543105;
 //BA.debugLineNum = 138543105;BA.debugLine="AddColumns(4,\"12\",\"3\",\"3\",\"3\")";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (4),"12","3","3","3");
RDebugUtils.currentLine=138543106;
 //BA.debugLineNum = 138543106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138543107;
 //BA.debugLineNum = 138543107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns5p7(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns5p7", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns5p7", null));}
RDebugUtils.currentLine=139395072;
 //BA.debugLineNum = 139395072;BA.debugLine="Sub AddColumns5p7 As VMGrid";
RDebugUtils.currentLine=139395073;
 //BA.debugLineNum = 139395073;BA.debugLine="AddColumns(1,\"12\",\"5\",\"5\",\"5\").AddColumns(1,\"12\",";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","5","5","5")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","7","7","7");
RDebugUtils.currentLine=139395074;
 //BA.debugLineNum = 139395074;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139395075;
 //BA.debugLineNum = 139395075;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns7p5(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns7p5", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns7p5", null));}
RDebugUtils.currentLine=139329536;
 //BA.debugLineNum = 139329536;BA.debugLine="Sub AddColumns7p5 As VMGrid";
RDebugUtils.currentLine=139329537;
 //BA.debugLineNum = 139329537;BA.debugLine="AddColumns(1,\"12\",\"7\",\"7\",\"7\").AddColumns(1,\"12\",";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","7","7","7")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","5","5","5");
RDebugUtils.currentLine=139329538;
 //BA.debugLineNum = 139329538;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139329539;
 //BA.debugLineNum = 139329539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns8p4(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns8p4", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns8p4", null));}
RDebugUtils.currentLine=138805248;
 //BA.debugLineNum = 138805248;BA.debugLine="Sub AddColumns8p4 As VMGrid";
RDebugUtils.currentLine=138805249;
 //BA.debugLineNum = 138805249;BA.debugLine="AddColumns(1,\"12\",\"8\",\"8\",\"8\").AddColumns(1,\"12\",";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","8","8","8")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","4","4","4");
RDebugUtils.currentLine=138805250;
 //BA.debugLineNum = 138805250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138805251;
 //BA.debugLineNum = 138805251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns9p3(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns9p3", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns9p3", null));}
RDebugUtils.currentLine=139264000;
 //BA.debugLineNum = 139264000;BA.debugLine="Sub AddColumns9p3 As VMGrid";
RDebugUtils.currentLine=139264001;
 //BA.debugLineNum = 139264001;BA.debugLine="AddColumns(1,\"12\",\"9\",\"9\",\"9\").AddColumns(1,\"12\",";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","9","9","9")._addcolumns /*b4j.example.vmgrid*/ (null,(int) (1),"12","3","3","3");
RDebugUtils.currentLine=139264002;
 //BA.debugLineNum = 139264002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139264003;
 //BA.debugLineNum = 139264003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumnsosmpv(b4j.example.vmgrid __ref,String _icolumns,String _ioffsetsmall,String _ioffsetmedium,String _ioffsetlarge,String _ioffsetxlarge,String _isizesmall,String _isizemedium,String _isizelarge,String _isizexlarge,String _ivisibility,String _stheme) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumnsosmpv", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumnsosmpv", new Object[] {_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_ivisibility,_stheme}));}
RDebugUtils.currentLine=138346496;
 //BA.debugLineNum = 138346496;BA.debugLine="Sub AddColumnsOSMPV(iColumns As String, iOffsetSma";
RDebugUtils.currentLine=138346499;
 //BA.debugLineNum = 138346499;BA.debugLine="AddColumnOSMP(iColumns, iOffsetSmall, iOffsetMedi";
__ref._addcolumnosmp /*b4j.example.vmgrid*/ (null,(int)(Double.parseDouble(_icolumns)),_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_stheme,_ivisibility,"");
RDebugUtils.currentLine=138346502;
 //BA.debugLineNum = 138346502;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138346503;
 //BA.debugLineNum = 138346503;BA.debugLine="End Sub";
return null;
}
public String  _addcomponent(b4j.example.vmgrid __ref,int _rowpos,int _colpos,String _elhtml) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcomponent", true))
	 {return ((String) Debug.delegate(ba, "addcomponent", new Object[] {_rowpos,_colpos,_elhtml}));}
String _cellkey = "";
anywheresoftware.b4a.objects.collections.List _lst = null;
RDebugUtils.currentLine=139788288;
 //BA.debugLineNum = 139788288;BA.debugLine="Sub AddComponent(rowPos As Int, colPos As Int, elH";
RDebugUtils.currentLine=139788289;
 //BA.debugLineNum = 139788289;BA.debugLine="Dim cellKey As String = $\"${ID}r${rowPos}c${colPo";
_cellkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"c"+__c.SmartStringFormatter("",(Object)(_colpos))+"");
RDebugUtils.currentLine=139788290;
 //BA.debugLineNum = 139788290;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=139788291;
 //BA.debugLineNum = 139788291;BA.debugLine="If Components.ContainsKey(cellKey) Then";
if (__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_cellkey))) { 
RDebugUtils.currentLine=139788292;
 //BA.debugLineNum = 139788292;BA.debugLine="lst = Components.Get(cellKey)";
_lst.setObject((java.util.List)(__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_cellkey))));
 }else {
RDebugUtils.currentLine=139788294;
 //BA.debugLineNum = 139788294;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=139788295;
 //BA.debugLineNum = 139788295;BA.debugLine="lst.clear";
_lst.Clear();
 };
RDebugUtils.currentLine=139788297;
 //BA.debugLineNum = 139788297;BA.debugLine="lst.Add(elHTML)";
_lst.Add((Object)(_elhtml));
RDebugUtils.currentLine=139788298;
 //BA.debugLineNum = 139788298;BA.debugLine="Components.Put(cellKey,lst)";
__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_cellkey),(Object)(_lst.getObject()));
RDebugUtils.currentLine=139788299;
 //BA.debugLineNum = 139788299;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _addrow(b4j.example.vmgrid __ref,int _irows,String _svisibility,String _sthemename,String _sclassname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addrow", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addrow", new Object[] {_irows,_svisibility,_sthemename,_sclassname}));}
b4j.example.vmgrid._gridrow _nrow = null;
String _rowkey = "";
RDebugUtils.currentLine=138280960;
 //BA.debugLineNum = 138280960;BA.debugLine="Sub AddRow(iRows As Int, sVisibility As String, sT";
RDebugUtils.currentLine=138280963;
 //BA.debugLineNum = 138280963;BA.debugLine="LastRow = Rows.size";
__ref._lastrow /*int*/  = __ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize();
RDebugUtils.currentLine=138280965;
 //BA.debugLineNum = 138280965;BA.debugLine="Dim nRow As GridRow";
_nrow = new b4j.example.vmgrid._gridrow();
RDebugUtils.currentLine=138280966;
 //BA.debugLineNum = 138280966;BA.debugLine="nRow.Initialize";
_nrow.Initialize();
RDebugUtils.currentLine=138280967;
 //BA.debugLineNum = 138280967;BA.debugLine="InitializeRow(nRow)";
__ref._initializerow /*String*/ (null,_nrow);
RDebugUtils.currentLine=138280968;
 //BA.debugLineNum = 138280968;BA.debugLine="nRow  = CreateRow(iRows,sVisibility,sThemeName,sC";
_nrow = __ref._createrow /*b4j.example.vmgrid._gridrow*/ (null,_irows,_svisibility,_sthemename,_sclassname);
RDebugUtils.currentLine=138280970;
 //BA.debugLineNum = 138280970;BA.debugLine="Dim rowKey As String = $\"${ID}r${LastRow}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._lastrow /*int*/ ))+"");
RDebugUtils.currentLine=138280972;
 //BA.debugLineNum = 138280972;BA.debugLine="Rows.Put(rowKey,nRow)";
__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_nrow));
RDebugUtils.currentLine=138280973;
 //BA.debugLineNum = 138280973;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138280974;
 //BA.debugLineNum = 138280974;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addrows(b4j.example.vmgrid __ref,int _irows) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addrows", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addrows", new Object[] {_irows}));}
RDebugUtils.currentLine=138412032;
 //BA.debugLineNum = 138412032;BA.debugLine="Sub AddRows(iRows As Int) As VMGrid";
RDebugUtils.currentLine=138412033;
 //BA.debugLineNum = 138412033;BA.debugLine="AddRow(iRows,\"\",\"\",\"\")";
__ref._addrow /*b4j.example.vmgrid*/ (null,_irows,"","","");
RDebugUtils.currentLine=138412034;
 //BA.debugLineNum = 138412034;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138412035;
 //BA.debugLineNum = 138412035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setborder(b4j.example.vmgrid __ref,int _rowpos,int _colpos,String _width,String _color,String _bstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setborder", new Object[] {_rowpos,_colpos,_width,_color,_bstyle}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
RDebugUtils.currentLine=140181504;
 //BA.debugLineNum = 140181504;BA.debugLine="Sub SetBorder(rowPos As Int, colPos As Int, width";
RDebugUtils.currentLine=140181505;
 //BA.debugLineNum = 140181505;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=140181506;
 //BA.debugLineNum = 140181506;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=140181507;
 //BA.debugLineNum = 140181507;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=140181508;
 //BA.debugLineNum = 140181508;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=140181510;
 //BA.debugLineNum = 140181510;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=140181511;
 //BA.debugLineNum = 140181511;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=140181513;
 //BA.debugLineNum = 140181513;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=140181514;
 //BA.debugLineNum = 140181514;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=140181516;
 //BA.debugLineNum = 140181516;BA.debugLine="rowc.Put(\"border-style\", bstyle)";
_rowc.Put((Object)("border-style"),(Object)(_bstyle));
RDebugUtils.currentLine=140181517;
 //BA.debugLineNum = 140181517;BA.debugLine="rowc.Put(\"border-width\", width)";
_rowc.Put((Object)("border-width"),(Object)(_width));
RDebugUtils.currentLine=140181518;
 //BA.debugLineNum = 140181518;BA.debugLine="rowc.Put(\"border-color\", color)";
_rowc.Put((Object)("border-color"),(Object)(_color));
RDebugUtils.currentLine=140181519;
 //BA.debugLineNum = 140181519;BA.debugLine="rowStyles.Put(rowKey,rowc)";
__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=140181520;
 //BA.debugLineNum = 140181520;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140181521;
 //BA.debugLineNum = 140181521;BA.debugLine="End Sub";
return null;
}
public String  _setclass(b4j.example.vmgrid __ref,int _rowpos,int _colpos,String _classname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setclass", true))
	 {return ((String) Debug.delegate(ba, "setclass", new Object[] {_rowpos,_colpos,_classname}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
RDebugUtils.currentLine=137756672;
 //BA.debugLineNum = 137756672;BA.debugLine="Sub SetClass(rowPos As Int, colPos As Int, classNa";
RDebugUtils.currentLine=137756674;
 //BA.debugLineNum = 137756674;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137756675;
 //BA.debugLineNum = 137756675;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=137756676;
 //BA.debugLineNum = 137756676;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=137756677;
 //BA.debugLineNum = 137756677;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=137756679;
 //BA.debugLineNum = 137756679;BA.debugLine="If rowClasses.ContainsKey(rowKey) Then";
if (__ref._rowclasses /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=137756680;
 //BA.debugLineNum = 137756680;BA.debugLine="rowc = rowClasses.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._rowclasses /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=137756682;
 //BA.debugLineNum = 137756682;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=137756683;
 //BA.debugLineNum = 137756683;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=137756685;
 //BA.debugLineNum = 137756685;BA.debugLine="rowc.Put(className,className)";
_rowc.Put((Object)(_classname),(Object)(_classname));
RDebugUtils.currentLine=137756686;
 //BA.debugLineNum = 137756686;BA.debugLine="rowClasses.Put(rowKey,rowc)";
__ref._rowclasses /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=137756687;
 //BA.debugLineNum = 137756687;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _setmargins(b4j.example.vmgrid __ref,int _rowpos,int _colpos,Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setmargins", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setmargins", new Object[] {_rowpos,_colpos,_mt,_mb,_ml,_mr}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
RDebugUtils.currentLine=140247040;
 //BA.debugLineNum = 140247040;BA.debugLine="Sub SetMargins(rowPos As Int, colPos As Int, mt As";
RDebugUtils.currentLine=140247041;
 //BA.debugLineNum = 140247041;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=140247042;
 //BA.debugLineNum = 140247042;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=140247043;
 //BA.debugLineNum = 140247043;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=140247044;
 //BA.debugLineNum = 140247044;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=140247046;
 //BA.debugLineNum = 140247046;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=140247047;
 //BA.debugLineNum = 140247047;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=140247049;
 //BA.debugLineNum = 140247049;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=140247050;
 //BA.debugLineNum = 140247050;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=140247052;
 //BA.debugLineNum = 140247052;BA.debugLine="If mt <> Null Then rowc.Put(\"margin-top\", mt)";
if (_mt!= null) { 
_rowc.Put((Object)("margin-top"),_mt);};
RDebugUtils.currentLine=140247053;
 //BA.debugLineNum = 140247053;BA.debugLine="If mb <> Null Then rowc.Put(\"margin-bottom\", mb)";
if (_mb!= null) { 
_rowc.Put((Object)("margin-bottom"),_mb);};
RDebugUtils.currentLine=140247054;
 //BA.debugLineNum = 140247054;BA.debugLine="If ml <> Null Then rowc.Put(\"margin-left\", ml)";
if (_ml!= null) { 
_rowc.Put((Object)("margin-left"),_ml);};
RDebugUtils.currentLine=140247055;
 //BA.debugLineNum = 140247055;BA.debugLine="If mr <> Null Then rowc.Put(\"margin-right\", mr)";
if (_mr!= null) { 
_rowc.Put((Object)("margin-right"),_mr);};
RDebugUtils.currentLine=140247056;
 //BA.debugLineNum = 140247056;BA.debugLine="rowStyles.Put(rowKey,rowc)";
__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=140247057;
 //BA.debugLineNum = 140247057;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140247058;
 //BA.debugLineNum = 140247058;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setonclick(b4j.example.vmgrid __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setonclick", new Object[] {_rowpos,_colpos}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=137822208;
 //BA.debugLineNum = 137822208;BA.debugLine="Sub SetOnClick(rowpos As Int, colpos As Int) As VM";
RDebugUtils.currentLine=137822209;
 //BA.debugLineNum = 137822209;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137822210;
 //BA.debugLineNum = 137822210;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowpos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=137822211;
 //BA.debugLineNum = 137822211;BA.debugLine="If colpos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=137822212;
 //BA.debugLineNum = 137822212;BA.debugLine="rowKey = $\"${ID}r${CStr(rowpos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=137822214;
 //BA.debugLineNum = 137822214;BA.debugLine="Dim methodName As String = $\"${rowKey}_click\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_click");
RDebugUtils.currentLine=137822215;
 //BA.debugLineNum = 137822215;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
RDebugUtils.currentLine=137822216;
 //BA.debugLineNum = 137822216;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=137822217;
 //BA.debugLineNum = 137822217;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=137822219;
 //BA.debugLineNum = 137822219;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=137822220;
 //BA.debugLineNum = 137822220;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=137822221;
 //BA.debugLineNum = 137822221;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=137822223;
 //BA.debugLineNum = 137822223;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=137822224;
 //BA.debugLineNum = 137822224;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=137822226;
 //BA.debugLineNum = 137822226;BA.debugLine="rowc.Put(\"v-on:click\",methodName)";
_rowc.Put((Object)("v-on:click"),(Object)(_methodname));
RDebugUtils.currentLine=137822227;
 //BA.debugLineNum = 137822227;BA.debugLine="attributes.Put(rowKey,rowc)";
__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=137822228;
 //BA.debugLineNum = 137822228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=137822229;
 //BA.debugLineNum = 137822229;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setpadding(b4j.example.vmgrid __ref,int _rowpos,int _colpos,Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setpadding", new Object[] {_rowpos,_colpos,_pt,_pb,_pl,_pr}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
RDebugUtils.currentLine=140312576;
 //BA.debugLineNum = 140312576;BA.debugLine="Sub SetPadding(rowPos As Int, colPos As Int, pt As";
RDebugUtils.currentLine=140312577;
 //BA.debugLineNum = 140312577;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=140312578;
 //BA.debugLineNum = 140312578;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=140312579;
 //BA.debugLineNum = 140312579;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=140312580;
 //BA.debugLineNum = 140312580;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=140312582;
 //BA.debugLineNum = 140312582;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=140312583;
 //BA.debugLineNum = 140312583;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=140312585;
 //BA.debugLineNum = 140312585;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=140312586;
 //BA.debugLineNum = 140312586;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=140312588;
 //BA.debugLineNum = 140312588;BA.debugLine="If pt <> Null Then rowc.Put(\"padding-top\", pt)";
if (_pt!= null) { 
_rowc.Put((Object)("padding-top"),_pt);};
RDebugUtils.currentLine=140312589;
 //BA.debugLineNum = 140312589;BA.debugLine="If pb <> Null Then rowc.Put(\"padding-bottom\", pb)";
if (_pb!= null) { 
_rowc.Put((Object)("padding-bottom"),_pb);};
RDebugUtils.currentLine=140312590;
 //BA.debugLineNum = 140312590;BA.debugLine="If pl <> Null Then rowc.Put(\"padding-left\", pl)";
if (_pl!= null) { 
_rowc.Put((Object)("padding-left"),_pl);};
RDebugUtils.currentLine=140312591;
 //BA.debugLineNum = 140312591;BA.debugLine="If pr <> Null Then rowc.Put(\"padding-right\", pr)";
if (_pr!= null) { 
_rowc.Put((Object)("padding-right"),_pr);};
RDebugUtils.currentLine=140312592;
 //BA.debugLineNum = 140312592;BA.debugLine="rowStyles.Put(rowKey,rowc)";
__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=140312593;
 //BA.debugLineNum = 140312593;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140312594;
 //BA.debugLineNum = 140312594;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setstyle(b4j.example.vmgrid __ref,int _rowpos,int _colpos,String _prop,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setstyle", new Object[] {_rowpos,_colpos,_prop,_value}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
RDebugUtils.currentLine=139919360;
 //BA.debugLineNum = 139919360;BA.debugLine="Sub SetStyle(rowPos As Int, colPos As Int, prop As";
RDebugUtils.currentLine=139919361;
 //BA.debugLineNum = 139919361;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=139919362;
 //BA.debugLineNum = 139919362;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=139919363;
 //BA.debugLineNum = 139919363;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=139919364;
 //BA.debugLineNum = 139919364;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=139919366;
 //BA.debugLineNum = 139919366;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
if (__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=139919367;
 //BA.debugLineNum = 139919367;BA.debugLine="rowc = rowStyles.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=139919369;
 //BA.debugLineNum = 139919369;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=139919370;
 //BA.debugLineNum = 139919370;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=139919372;
 //BA.debugLineNum = 139919372;BA.debugLine="rowc.Put(prop,value)";
_rowc.Put((Object)(_prop),(Object)(_value));
RDebugUtils.currentLine=139919373;
 //BA.debugLineNum = 139919373;BA.debugLine="rowStyles.Put(rowKey,rowc)";
__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=139919374;
 //BA.debugLineNum = 139919374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139919375;
 //BA.debugLineNum = 139919375;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=139657216;
 //BA.debugLineNum = 139657216;BA.debugLine="Sub ToString() As String";
RDebugUtils.currentLine=139657217;
 //BA.debugLineNum = 139657217;BA.debugLine="Build";
__ref._build /*String*/ (null);
RDebugUtils.currentLine=139657218;
 //BA.debugLineNum = 139657218;BA.debugLine="Return Grid.ToString";
if (true) return __ref._grid /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=139657219;
 //BA.debugLineNum = 139657219;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _addclass(b4j.example.vmgrid __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=140574720;
 //BA.debugLineNum = 140574720;BA.debugLine="Sub AddClass(c As String) As VMGrid";
RDebugUtils.currentLine=140574721;
 //BA.debugLineNum = 140574721;BA.debugLine="Grid.AddClass(c)";
__ref._grid /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=140574722;
 //BA.debugLineNum = 140574722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140574723;
 //BA.debugLineNum = 140574723;BA.debugLine="End Sub";
return null;
}
public String  _initializecolumn(b4j.example.vmgrid __ref,b4j.example.vmgrid._gridcolumn _thiscolumn) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "initializecolumn", true))
	 {return ((String) Debug.delegate(ba, "initializecolumn", new Object[] {_thiscolumn}));}
RDebugUtils.currentLine=140967936;
 //BA.debugLineNum = 140967936;BA.debugLine="Sub InitializeColumn(thisColumn As GridColumn)";
RDebugUtils.currentLine=140967937;
 //BA.debugLineNum = 140967937;BA.debugLine="thisColumn.Columns = \"1\"";
_thiscolumn.Columns /*String*/  = "1";
RDebugUtils.currentLine=140967938;
 //BA.debugLineNum = 140967938;BA.debugLine="thisColumn.OffsetSmall = \"0\"";
_thiscolumn.OffsetSmall /*String*/  = "0";
RDebugUtils.currentLine=140967939;
 //BA.debugLineNum = 140967939;BA.debugLine="thisColumn.OffsetMedium = \"0\"";
_thiscolumn.OffsetMedium /*String*/  = "0";
RDebugUtils.currentLine=140967940;
 //BA.debugLineNum = 140967940;BA.debugLine="thisColumn.OffsetLarge = \"0\"";
_thiscolumn.OffsetLarge /*String*/  = "0";
RDebugUtils.currentLine=140967941;
 //BA.debugLineNum = 140967941;BA.debugLine="thisColumn.SizeSmall = \"12\"";
_thiscolumn.SizeSmall /*String*/  = "12";
RDebugUtils.currentLine=140967942;
 //BA.debugLineNum = 140967942;BA.debugLine="thisColumn.SizeMedium = \"12\"";
_thiscolumn.SizeMedium /*String*/  = "12";
RDebugUtils.currentLine=140967943;
 //BA.debugLineNum = 140967943;BA.debugLine="thisColumn.SizeLarge = \"12\"";
_thiscolumn.SizeLarge /*String*/  = "12";
RDebugUtils.currentLine=140967944;
 //BA.debugLineNum = 140967944;BA.debugLine="thisColumn.SizeXLarge = \"12\"";
_thiscolumn.SizeXLarge /*String*/  = "12";
RDebugUtils.currentLine=140967945;
 //BA.debugLineNum = 140967945;BA.debugLine="thisColumn.MarginTop = Null";
_thiscolumn.MarginTop /*Object*/  = __c.Null;
RDebugUtils.currentLine=140967946;
 //BA.debugLineNum = 140967946;BA.debugLine="thisColumn.MarginBottom = Null";
_thiscolumn.MarginBottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=140967947;
 //BA.debugLineNum = 140967947;BA.debugLine="thisColumn.MarginLeft = Null";
_thiscolumn.MarginLeft /*Object*/  = __c.Null;
RDebugUtils.currentLine=140967948;
 //BA.debugLineNum = 140967948;BA.debugLine="thisColumn.MarginRight = Null";
_thiscolumn.MarginRight /*Object*/  = __c.Null;
RDebugUtils.currentLine=140967949;
 //BA.debugLineNum = 140967949;BA.debugLine="thisColumn.PaddingTop = Null";
_thiscolumn.PaddingTop /*Object*/  = __c.Null;
RDebugUtils.currentLine=140967950;
 //BA.debugLineNum = 140967950;BA.debugLine="thisColumn.PaddingBottom = Null";
_thiscolumn.PaddingBottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=140967951;
 //BA.debugLineNum = 140967951;BA.debugLine="thisColumn.PaddingLeft = Null";
_thiscolumn.PaddingLeft /*Object*/  = __c.Null;
RDebugUtils.currentLine=140967952;
 //BA.debugLineNum = 140967952;BA.debugLine="thisColumn.PaddingRight = Null";
_thiscolumn.PaddingRight /*Object*/  = __c.Null;
RDebugUtils.currentLine=140967953;
 //BA.debugLineNum = 140967953;BA.debugLine="thisColumn.ThemeName = \"\"";
_thiscolumn.ThemeName /*String*/  = "";
RDebugUtils.currentLine=140967954;
 //BA.debugLineNum = 140967954;BA.debugLine="thisColumn.Visibility = \"\"";
_thiscolumn.Visibility /*String*/  = "";
RDebugUtils.currentLine=140967955;
 //BA.debugLineNum = 140967955;BA.debugLine="thisColumn.ClassName = \"\"";
_thiscolumn.ClassName /*String*/  = "";
RDebugUtils.currentLine=140967956;
 //BA.debugLineNum = 140967956;BA.debugLine="thisColumn.Row = \"0\"";
_thiscolumn.Row /*String*/  = "0";
RDebugUtils.currentLine=140967957;
 //BA.debugLineNum = 140967957;BA.debugLine="thisColumn.Col = \"0\"";
_thiscolumn.Col /*String*/  = "0";
RDebugUtils.currentLine=140967958;
 //BA.debugLineNum = 140967958;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid._gridcolumn  _createcolumn(b4j.example.vmgrid __ref,int _columns2add,String _offsetsmall,String _offsetmedium,String _offsetlarge,String _offsetxlarge,String _sizesmall,String _sizemedium,String _sizelarge,String _sizexlarge,String _themename,String _visibility,String _classname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "createcolumn", true))
	 {return ((b4j.example.vmgrid._gridcolumn) Debug.delegate(ba, "createcolumn", new Object[] {_columns2add,_offsetsmall,_offsetmedium,_offsetlarge,_offsetxlarge,_sizesmall,_sizemedium,_sizelarge,_sizexlarge,_themename,_visibility,_classname}));}
b4j.example.vmgrid._gridcolumn _ncell = null;
RDebugUtils.currentLine=141099008;
 //BA.debugLineNum = 141099008;BA.debugLine="private Sub CreateColumn(Columns2Add As Int, Offse";
RDebugUtils.currentLine=141099011;
 //BA.debugLineNum = 141099011;BA.debugLine="Dim nCell As GridColumn";
_ncell = new b4j.example.vmgrid._gridcolumn();
RDebugUtils.currentLine=141099012;
 //BA.debugLineNum = 141099012;BA.debugLine="nCell.Initialize";
_ncell.Initialize();
RDebugUtils.currentLine=141099013;
 //BA.debugLineNum = 141099013;BA.debugLine="InitializeColumn(nCell)";
__ref._initializecolumn /*String*/ (null,_ncell);
RDebugUtils.currentLine=141099014;
 //BA.debugLineNum = 141099014;BA.debugLine="nCell.Columns = Columns2Add";
_ncell.Columns /*String*/  = BA.NumberToString(_columns2add);
RDebugUtils.currentLine=141099015;
 //BA.debugLineNum = 141099015;BA.debugLine="nCell.OffsetSmall = OffsetSmall";
_ncell.OffsetSmall /*String*/  = _offsetsmall;
RDebugUtils.currentLine=141099016;
 //BA.debugLineNum = 141099016;BA.debugLine="nCell.OffsetMedium = OffsetMedium";
_ncell.OffsetMedium /*String*/  = _offsetmedium;
RDebugUtils.currentLine=141099017;
 //BA.debugLineNum = 141099017;BA.debugLine="nCell.OffsetLarge = OffsetLarge";
_ncell.OffsetLarge /*String*/  = _offsetlarge;
RDebugUtils.currentLine=141099018;
 //BA.debugLineNum = 141099018;BA.debugLine="nCell.OffsetXLarge = OffsetXLarge";
_ncell.OffsetXLarge /*String*/  = _offsetxlarge;
RDebugUtils.currentLine=141099019;
 //BA.debugLineNum = 141099019;BA.debugLine="nCell.SizeSmall = SizeSmall";
_ncell.SizeSmall /*String*/  = _sizesmall;
RDebugUtils.currentLine=141099020;
 //BA.debugLineNum = 141099020;BA.debugLine="nCell.SizeMedium = SizeMedium";
_ncell.SizeMedium /*String*/  = _sizemedium;
RDebugUtils.currentLine=141099021;
 //BA.debugLineNum = 141099021;BA.debugLine="nCell.SizeLarge = SizeLarge";
_ncell.SizeLarge /*String*/  = _sizelarge;
RDebugUtils.currentLine=141099022;
 //BA.debugLineNum = 141099022;BA.debugLine="nCell.SizeXLarge = SizeXLarge";
_ncell.SizeXLarge /*String*/  = _sizexlarge;
RDebugUtils.currentLine=141099023;
 //BA.debugLineNum = 141099023;BA.debugLine="nCell.Visibility = Visibility";
_ncell.Visibility /*String*/  = _visibility;
RDebugUtils.currentLine=141099024;
 //BA.debugLineNum = 141099024;BA.debugLine="nCell.ClassName = ClassName";
_ncell.ClassName /*String*/  = _classname;
RDebugUtils.currentLine=141099025;
 //BA.debugLineNum = 141099025;BA.debugLine="nCell.ThemeName = ThemeName";
_ncell.ThemeName /*String*/  = _themename;
RDebugUtils.currentLine=141099026;
 //BA.debugLineNum = 141099026;BA.debugLine="nCell.MarginTop = Null";
_ncell.MarginTop /*Object*/  = __c.Null;
RDebugUtils.currentLine=141099027;
 //BA.debugLineNum = 141099027;BA.debugLine="nCell.MarginBottom = Null";
_ncell.MarginBottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=141099028;
 //BA.debugLineNum = 141099028;BA.debugLine="nCell.MarginLeft = Null";
_ncell.MarginLeft /*Object*/  = __c.Null;
RDebugUtils.currentLine=141099029;
 //BA.debugLineNum = 141099029;BA.debugLine="nCell.MarginRight = Null";
_ncell.MarginRight /*Object*/  = __c.Null;
RDebugUtils.currentLine=141099030;
 //BA.debugLineNum = 141099030;BA.debugLine="nCell.PaddingTop = Null";
_ncell.PaddingTop /*Object*/  = __c.Null;
RDebugUtils.currentLine=141099031;
 //BA.debugLineNum = 141099031;BA.debugLine="nCell.PaddingBottom = Null";
_ncell.PaddingBottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=141099032;
 //BA.debugLineNum = 141099032;BA.debugLine="nCell.PaddingLeft = Null";
_ncell.PaddingLeft /*Object*/  = __c.Null;
RDebugUtils.currentLine=141099033;
 //BA.debugLineNum = 141099033;BA.debugLine="nCell.PaddingRight = Null";
_ncell.PaddingRight /*Object*/  = __c.Null;
RDebugUtils.currentLine=141099034;
 //BA.debugLineNum = 141099034;BA.debugLine="Return nCell";
if (true) return _ncell;
RDebugUtils.currentLine=141099035;
 //BA.debugLineNum = 141099035;BA.debugLine="End Sub";
return null;
}
public String  _initializerow(b4j.example.vmgrid __ref,b4j.example.vmgrid._gridrow _thisrow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "initializerow", true))
	 {return ((String) Debug.delegate(ba, "initializerow", new Object[] {_thisrow}));}
RDebugUtils.currentLine=139722752;
 //BA.debugLineNum = 139722752;BA.debugLine="private Sub InitializeRow(thisRow As GridRow)";
RDebugUtils.currentLine=139722753;
 //BA.debugLineNum = 139722753;BA.debugLine="thisRow.Columns.Initialize";
_thisrow.Columns /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=139722754;
 //BA.debugLineNum = 139722754;BA.debugLine="thisRow.Rows = 1";
_thisrow.Rows /*String*/  = BA.NumberToString(1);
RDebugUtils.currentLine=139722755;
 //BA.debugLineNum = 139722755;BA.debugLine="thisRow.Visibility = \"\"";
_thisrow.Visibility /*String*/  = "";
RDebugUtils.currentLine=139722756;
 //BA.debugLineNum = 139722756;BA.debugLine="thisRow.ThemeName = \"0\"";
_thisrow.ThemeName /*String*/  = "0";
RDebugUtils.currentLine=139722757;
 //BA.debugLineNum = 139722757;BA.debugLine="thisRow.ClassName = \"\"";
_thisrow.ClassName /*String*/  = "";
RDebugUtils.currentLine=139722758;
 //BA.debugLineNum = 139722758;BA.debugLine="thisRow.MarginTop = Null";
_thisrow.MarginTop /*Object*/  = __c.Null;
RDebugUtils.currentLine=139722759;
 //BA.debugLineNum = 139722759;BA.debugLine="thisRow.MarginBottom = Null";
_thisrow.MarginBottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=139722760;
 //BA.debugLineNum = 139722760;BA.debugLine="thisRow.MarginLeft = Null";
_thisrow.MarginLeft /*Object*/  = __c.Null;
RDebugUtils.currentLine=139722761;
 //BA.debugLineNum = 139722761;BA.debugLine="thisRow.MarginRight = Null";
_thisrow.MarginRight /*Object*/  = __c.Null;
RDebugUtils.currentLine=139722762;
 //BA.debugLineNum = 139722762;BA.debugLine="thisRow.PaddingTop = Null";
_thisrow.PaddingTop /*Object*/  = __c.Null;
RDebugUtils.currentLine=139722763;
 //BA.debugLineNum = 139722763;BA.debugLine="thisRow.PaddingBottom = Null";
_thisrow.PaddingBottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=139722764;
 //BA.debugLineNum = 139722764;BA.debugLine="thisRow.PaddingLeft = Null";
_thisrow.PaddingLeft /*Object*/  = __c.Null;
RDebugUtils.currentLine=139722765;
 //BA.debugLineNum = 139722765;BA.debugLine="thisRow.PaddingRight = Null";
_thisrow.PaddingRight /*Object*/  = __c.Null;
RDebugUtils.currentLine=139722766;
 //BA.debugLineNum = 139722766;BA.debugLine="thisRow.Row = 0";
_thisrow.Row /*String*/  = BA.NumberToString(0);
RDebugUtils.currentLine=139722767;
 //BA.debugLineNum = 139722767;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _addcolumns12x1(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns12x1", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns12x1", null));}
RDebugUtils.currentLine=138739712;
 //BA.debugLineNum = 138739712;BA.debugLine="Sub AddColumns12x1 As VMGrid";
RDebugUtils.currentLine=138739713;
 //BA.debugLineNum = 138739713;BA.debugLine="AddColumns(12,\"12\",\"1\",\"1\",\"1\")";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (12),"12","1","1","1");
RDebugUtils.currentLine=138739714;
 //BA.debugLineNum = 138739714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138739715;
 //BA.debugLineNum = 138739715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns6x2(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addcolumns6x2", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns6x2", null));}
RDebugUtils.currentLine=138674176;
 //BA.debugLineNum = 138674176;BA.debugLine="Sub AddColumns6x2 As VMGrid";
RDebugUtils.currentLine=138674177;
 //BA.debugLineNum = 138674177;BA.debugLine="AddColumns(6,\"12\",\"2\",\"2\",\"2\")";
__ref._addcolumns /*b4j.example.vmgrid*/ (null,(int) (6),"12","2","2","2");
RDebugUtils.currentLine=138674178;
 //BA.debugLineNum = 138674178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138674179;
 //BA.debugLineNum = 138674179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addgridclass(b4j.example.vmgrid __ref,String _classname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "addgridclass", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addgridclass", new Object[] {_classname}));}
RDebugUtils.currentLine=140115968;
 //BA.debugLineNum = 140115968;BA.debugLine="Sub AddGridClass(className As String) As VMGrid";
RDebugUtils.currentLine=140115969;
 //BA.debugLineNum = 140115969;BA.debugLine="Grid.AddClass(className)";
__ref._grid /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_classname);
RDebugUtils.currentLine=140115970;
 //BA.debugLineNum = 140115970;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140115971;
 //BA.debugLineNum = 140115971;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid._gridrow  _createrow(b4j.example.vmgrid __ref,int _rows2add,String _visibility,String _themename,String _classname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "createrow", true))
	 {return ((b4j.example.vmgrid._gridrow) Debug.delegate(ba, "createrow", new Object[] {_rows2add,_visibility,_themename,_classname}));}
b4j.example.vmgrid._gridrow _nr = null;
RDebugUtils.currentLine=141033472;
 //BA.debugLineNum = 141033472;BA.debugLine="private Sub CreateRow(Rows2Add As Int, Visibility";
RDebugUtils.currentLine=141033473;
 //BA.debugLineNum = 141033473;BA.debugLine="Dim nr As GridRow";
_nr = new b4j.example.vmgrid._gridrow();
RDebugUtils.currentLine=141033474;
 //BA.debugLineNum = 141033474;BA.debugLine="nr.Initialize";
_nr.Initialize();
RDebugUtils.currentLine=141033475;
 //BA.debugLineNum = 141033475;BA.debugLine="InitializeRow(nr)";
__ref._initializerow /*String*/ (null,_nr);
RDebugUtils.currentLine=141033476;
 //BA.debugLineNum = 141033476;BA.debugLine="nr.ThemeName = ThemeName";
_nr.ThemeName /*String*/  = _themename;
RDebugUtils.currentLine=141033477;
 //BA.debugLineNum = 141033477;BA.debugLine="nr.Visibility = Visibility";
_nr.Visibility /*String*/  = _visibility;
RDebugUtils.currentLine=141033478;
 //BA.debugLineNum = 141033478;BA.debugLine="nr.ClassName = ClassName";
_nr.ClassName /*String*/  = _classname;
RDebugUtils.currentLine=141033479;
 //BA.debugLineNum = 141033479;BA.debugLine="nr.Rows = Rows2Add";
_nr.Rows /*String*/  = BA.NumberToString(_rows2add);
RDebugUtils.currentLine=141033480;
 //BA.debugLineNum = 141033480;BA.debugLine="nr.MarginTop = Null";
_nr.MarginTop /*Object*/  = __c.Null;
RDebugUtils.currentLine=141033481;
 //BA.debugLineNum = 141033481;BA.debugLine="nr.MarginBottom = Null";
_nr.MarginBottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=141033482;
 //BA.debugLineNum = 141033482;BA.debugLine="nr.MarginLeft = Null";
_nr.MarginLeft /*Object*/  = __c.Null;
RDebugUtils.currentLine=141033483;
 //BA.debugLineNum = 141033483;BA.debugLine="nr.MarginRight = Null";
_nr.MarginRight /*Object*/  = __c.Null;
RDebugUtils.currentLine=141033484;
 //BA.debugLineNum = 141033484;BA.debugLine="nr.PaddingTop = Null";
_nr.PaddingTop /*Object*/  = __c.Null;
RDebugUtils.currentLine=141033485;
 //BA.debugLineNum = 141033485;BA.debugLine="nr.PaddingBottom = Null";
_nr.PaddingBottom /*Object*/  = __c.Null;
RDebugUtils.currentLine=141033486;
 //BA.debugLineNum = 141033486;BA.debugLine="nr.PaddingLeft = Null";
_nr.PaddingLeft /*Object*/  = __c.Null;
RDebugUtils.currentLine=141033487;
 //BA.debugLineNum = 141033487;BA.debugLine="nr.PaddingRight = Null";
_nr.PaddingRight /*Object*/  = __c.Null;
RDebugUtils.currentLine=141033488;
 //BA.debugLineNum = 141033488;BA.debugLine="Return nr";
if (true) return _nr;
RDebugUtils.currentLine=141033489;
 //BA.debugLineNum = 141033489;BA.debugLine="End Sub";
return null;
}
public String  _build(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "build", true))
	 {return ((String) Debug.delegate(ba, "build", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _rowcnt = 0;
int _rowtot = 0;
String _rowkey = "";
b4j.example.vmgrid._gridrow _currentrow = null;
String _strrow = "";
RDebugUtils.currentLine=140902400;
 //BA.debugLineNum = 140902400;BA.debugLine="Sub Build";
RDebugUtils.currentLine=140902401;
 //BA.debugLineNum = 140902401;BA.debugLine="If isBuilt = True Then Return";
if (__ref._isbuilt /*boolean*/ ==__c.True) { 
if (true) return "";};
RDebugUtils.currentLine=140902403;
 //BA.debugLineNum = 140902403;BA.debugLine="LastRow = 0";
__ref._lastrow /*int*/  = (int) (0);
RDebugUtils.currentLine=140902404;
 //BA.debugLineNum = 140902404;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=140902405;
 //BA.debugLineNum = 140902405;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=140902407;
 //BA.debugLineNum = 140902407;BA.debugLine="Dim rowCnt As Int = 0";
_rowcnt = (int) (0);
RDebugUtils.currentLine=140902408;
 //BA.debugLineNum = 140902408;BA.debugLine="Dim rowTot As Int = Rows.Size - 1";
_rowtot = (int) (__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
RDebugUtils.currentLine=140902409;
 //BA.debugLineNum = 140902409;BA.debugLine="For rowCnt = 0 To rowTot";
{
final int step7 = 1;
final int limit7 = _rowtot;
_rowcnt = (int) (0) ;
for (;_rowcnt <= limit7 ;_rowcnt = _rowcnt + step7 ) {
RDebugUtils.currentLine=140902410;
 //BA.debugLineNum = 140902410;BA.debugLine="Dim rowKey As String = Rows.GetKeyAt(rowCnt)";
_rowkey = BA.ObjectToString(__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_rowcnt));
RDebugUtils.currentLine=140902411;
 //BA.debugLineNum = 140902411;BA.debugLine="Dim currentRow As GridRow";
_currentrow = new b4j.example.vmgrid._gridrow();
RDebugUtils.currentLine=140902412;
 //BA.debugLineNum = 140902412;BA.debugLine="currentRow.Initialize";
_currentrow.Initialize();
RDebugUtils.currentLine=140902413;
 //BA.debugLineNum = 140902413;BA.debugLine="InitializeRow(currentRow)";
__ref._initializerow /*String*/ (null,_currentrow);
RDebugUtils.currentLine=140902414;
 //BA.debugLineNum = 140902414;BA.debugLine="currentRow = Rows.Get(rowKey)";
_currentrow = (b4j.example.vmgrid._gridrow)(__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey)));
RDebugUtils.currentLine=140902415;
 //BA.debugLineNum = 140902415;BA.debugLine="Dim strRow As String = BuildRow(currentRow)";
_strrow = __ref._buildrow /*String*/ (null,_currentrow);
RDebugUtils.currentLine=140902416;
 //BA.debugLineNum = 140902416;BA.debugLine="sb.Append(strRow)";
_sb.Append(_strrow);
RDebugUtils.currentLine=140902417;
 //BA.debugLineNum = 140902417;BA.debugLine="sb.append(CRLF)";
_sb.Append(__c.CRLF);
 }
};
RDebugUtils.currentLine=140902419;
 //BA.debugLineNum = 140902419;BA.debugLine="Grid.SetText(sb.tostring)";
__ref._grid /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_sb.ToString());
RDebugUtils.currentLine=140902420;
 //BA.debugLineNum = 140902420;BA.debugLine="isBuilt = True";
__ref._isbuilt /*boolean*/  = __c.True;
RDebugUtils.currentLine=140902421;
 //BA.debugLineNum = 140902421;BA.debugLine="End Sub";
return "";
}
public String  _buildrow(b4j.example.vmgrid __ref,b4j.example.vmgrid._gridrow _row) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "buildrow", true))
	 {return ((String) Debug.delegate(ba, "buildrow", new Object[] {_row}));}
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
RDebugUtils.currentLine=141230080;
 //BA.debugLineNum = 141230080;BA.debugLine="private Sub BuildRow(row As GridRow) As String";
RDebugUtils.currentLine=141230082;
 //BA.debugLineNum = 141230082;BA.debugLine="Dim rowTot As Int = row.Rows";
_rowtot = (int)(Double.parseDouble(_row.Rows /*String*/ ));
RDebugUtils.currentLine=141230083;
 //BA.debugLineNum = 141230083;BA.debugLine="Dim rowCnt As Int";
_rowcnt = 0;
RDebugUtils.currentLine=141230084;
 //BA.debugLineNum = 141230084;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=141230085;
 //BA.debugLineNum = 141230085;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=141230087;
 //BA.debugLineNum = 141230087;BA.debugLine="For rowCnt = 1 To rowTot";
{
final int step5 = 1;
final int limit5 = _rowtot;
_rowcnt = (int) (1) ;
for (;_rowcnt <= limit5 ;_rowcnt = _rowcnt + step5 ) {
RDebugUtils.currentLine=141230088;
 //BA.debugLineNum = 141230088;BA.debugLine="LastRow = LastRow + 1";
__ref._lastrow /*int*/  = (int) (__ref._lastrow /*int*/ +1);
RDebugUtils.currentLine=141230089;
 //BA.debugLineNum = 141230089;BA.debugLine="row.Row = CStr(LastRow)";
_row.Row /*String*/  = __ref._cstr /*String*/ (null,(Object)(__ref._lastrow /*int*/ ));
RDebugUtils.currentLine=141230090;
 //BA.debugLineNum = 141230090;BA.debugLine="Dim rowKey As String = $\"${ID}r${LastRow}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._lastrow /*int*/ ))+"");
RDebugUtils.currentLine=141230091;
 //BA.debugLineNum = 141230091;BA.debugLine="Dim tRow As VueHTML";
_trow = new b4j.example.vuehtml();
RDebugUtils.currentLine=141230092;
 //BA.debugLineNum = 141230092;BA.debugLine="tRow.Initialize(rowKey,\"div\")";
_trow._initialize /*b4j.example.vuehtml*/ (null,ba,_rowkey,"div");
RDebugUtils.currentLine=141230093;
 //BA.debugLineNum = 141230093;BA.debugLine="Dim strRowClass As String = BuildRowClass";
_strrowclass = __ref._buildrowclass /*String*/ (null);
RDebugUtils.currentLine=141230094;
 //BA.debugLineNum = 141230094;BA.debugLine="tRow.AddClass(strRowClass)";
_trow._addclass /*b4j.example.vuehtml*/ (null,_strrowclass);
RDebugUtils.currentLine=141230095;
 //BA.debugLineNum = 141230095;BA.debugLine="tRow.AddClass(row.ClassName)";
_trow._addclass /*b4j.example.vuehtml*/ (null,_row.ClassName /*String*/ );
RDebugUtils.currentLine=141230096;
 //BA.debugLineNum = 141230096;BA.debugLine="tRow.addClass(row.ThemeName)";
_trow._addclass /*b4j.example.vuehtml*/ (null,_row.ThemeName /*String*/ );
RDebugUtils.currentLine=141230098;
 //BA.debugLineNum = 141230098;BA.debugLine="tRow.AddStyle(\"margin-top\", row.margintop)";
_trow._addstyle /*b4j.example.vuehtml*/ (null,"margin-top",_row.MarginTop /*Object*/ );
RDebugUtils.currentLine=141230099;
 //BA.debugLineNum = 141230099;BA.debugLine="tRow.AddStyle(\"margin-bottom\", row.marginbottom)";
_trow._addstyle /*b4j.example.vuehtml*/ (null,"margin-bottom",_row.MarginBottom /*Object*/ );
RDebugUtils.currentLine=141230100;
 //BA.debugLineNum = 141230100;BA.debugLine="tRow.AddStyle(\"margin-left\", row.marginleft)";
_trow._addstyle /*b4j.example.vuehtml*/ (null,"margin-left",_row.MarginLeft /*Object*/ );
RDebugUtils.currentLine=141230101;
 //BA.debugLineNum = 141230101;BA.debugLine="tRow.AddStyle(\"margin-right\", row.marginright)";
_trow._addstyle /*b4j.example.vuehtml*/ (null,"margin-right",_row.MarginRight /*Object*/ );
RDebugUtils.currentLine=141230102;
 //BA.debugLineNum = 141230102;BA.debugLine="tRow.AddStyle(\"padding-top\", row.paddingtop)";
_trow._addstyle /*b4j.example.vuehtml*/ (null,"padding-top",_row.PaddingTop /*Object*/ );
RDebugUtils.currentLine=141230103;
 //BA.debugLineNum = 141230103;BA.debugLine="tRow.AddStyle(\"padding-bottom\", row.paddingbotto";
_trow._addstyle /*b4j.example.vuehtml*/ (null,"padding-bottom",_row.PaddingBottom /*Object*/ );
RDebugUtils.currentLine=141230104;
 //BA.debugLineNum = 141230104;BA.debugLine="tRow.AddStyle(\"padding-left\", row.paddingleft)";
_trow._addstyle /*b4j.example.vuehtml*/ (null,"padding-left",_row.PaddingLeft /*Object*/ );
RDebugUtils.currentLine=141230105;
 //BA.debugLineNum = 141230105;BA.debugLine="tRow.AddStyle(\"padding-right\", row.paddingright)";
_trow._addstyle /*b4j.example.vuehtml*/ (null,"padding-right",_row.PaddingRight /*Object*/ );
RDebugUtils.currentLine=141230108;
 //BA.debugLineNum = 141230108;BA.debugLine="Dim classKey As String = $\"${ID}r${LastRow}\"$";
_classkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._lastrow /*int*/ ))+"");
RDebugUtils.currentLine=141230109;
 //BA.debugLineNum = 141230109;BA.debugLine="If rowClasses.ContainsKey(classKey) Then";
if (__ref._rowclasses /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_classkey))) { 
RDebugUtils.currentLine=141230111;
 //BA.debugLineNum = 141230111;BA.debugLine="Dim cm As Map = rowClasses.Get(classKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._rowclasses /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_classkey))));
RDebugUtils.currentLine=141230112;
 //BA.debugLineNum = 141230112;BA.debugLine="tRow.AddClass(MapKeys2Delim(cm,\" \"))";
_trow._addclass /*b4j.example.vuehtml*/ (null,__ref._mapkeys2delim /*String*/ (null,_cm," "));
 };
RDebugUtils.currentLine=141230114;
 //BA.debugLineNum = 141230114;BA.debugLine="If rowStyles.ContainsKey(classKey) Then";
if (__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_classkey))) { 
RDebugUtils.currentLine=141230115;
 //BA.debugLineNum = 141230115;BA.debugLine="Dim cm As Map = rowStyles.Get(classKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_classkey))));
RDebugUtils.currentLine=141230116;
 //BA.debugLineNum = 141230116;BA.debugLine="For Each strkey As String In cm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group30 = _cm.Keys();
final int groupLen30 = group30.getSize()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_strkey = BA.ObjectToString(group30.Get(index30));
RDebugUtils.currentLine=141230117;
 //BA.debugLineNum = 141230117;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
_strval = BA.ObjectToString(_cm.Get((Object)(_strkey)));
RDebugUtils.currentLine=141230118;
 //BA.debugLineNum = 141230118;BA.debugLine="tRow.AddStyleAttribute(strkey,strVal)";
_trow._addstyleattribute /*b4j.example.vuehtml*/ (null,_strkey,(Object)(_strval));
 }
};
 };
RDebugUtils.currentLine=141230121;
 //BA.debugLineNum = 141230121;BA.debugLine="If attributes.ContainsKey(classKey) Then";
if (__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_classkey))) { 
RDebugUtils.currentLine=141230122;
 //BA.debugLineNum = 141230122;BA.debugLine="Dim am As Map = attributes.Get(classKey)";
_am = new anywheresoftware.b4a.objects.collections.Map();
_am.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_classkey))));
RDebugUtils.currentLine=141230123;
 //BA.debugLineNum = 141230123;BA.debugLine="For Each k As String In am.Keys";
{
final anywheresoftware.b4a.BA.IterableList group37 = _am.Keys();
final int groupLen37 = group37.getSize()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_k = BA.ObjectToString(group37.Get(index37));
RDebugUtils.currentLine=141230124;
 //BA.debugLineNum = 141230124;BA.debugLine="Dim v As String = am.Get(k)";
_v = BA.ObjectToString(_am.Get((Object)(_k)));
RDebugUtils.currentLine=141230125;
 //BA.debugLineNum = 141230125;BA.debugLine="tRow.SetAttr(k,v)";
_trow._setattr /*b4j.example.vuehtml*/ (null,_k,_v);
 }
};
 };
RDebugUtils.currentLine=141230132;
 //BA.debugLineNum = 141230132;BA.debugLine="Dim cols As List = row.Columns";
_cols = new anywheresoftware.b4a.objects.collections.List();
_cols = _row.Columns /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=141230134;
 //BA.debugLineNum = 141230134;BA.debugLine="Dim colCnt As Int = 0";
_colcnt = (int) (0);
RDebugUtils.currentLine=141230135;
 //BA.debugLineNum = 141230135;BA.debugLine="Dim colTot As Int = cols.Size - 1";
_coltot = (int) (_cols.getSize()-1);
RDebugUtils.currentLine=141230137;
 //BA.debugLineNum = 141230137;BA.debugLine="Dim LastColumn As Int = 0";
_lastcolumn = (int) (0);
RDebugUtils.currentLine=141230138;
 //BA.debugLineNum = 141230138;BA.debugLine="For colCnt = 0 To colTot";
{
final int step46 = 1;
final int limit46 = _coltot;
_colcnt = (int) (0) ;
for (;_colcnt <= limit46 ;_colcnt = _colcnt + step46 ) {
RDebugUtils.currentLine=141230140;
 //BA.debugLineNum = 141230140;BA.debugLine="Dim column As GridColumn";
_column = new b4j.example.vmgrid._gridcolumn();
RDebugUtils.currentLine=141230141;
 //BA.debugLineNum = 141230141;BA.debugLine="column.Initialize";
_column.Initialize();
RDebugUtils.currentLine=141230142;
 //BA.debugLineNum = 141230142;BA.debugLine="InitializeColumn(column)";
__ref._initializecolumn /*String*/ (null,_column);
RDebugUtils.currentLine=141230143;
 //BA.debugLineNum = 141230143;BA.debugLine="column = cols.Get(colCnt)";
_column = (b4j.example.vmgrid._gridcolumn)(_cols.Get(_colcnt));
RDebugUtils.currentLine=141230144;
 //BA.debugLineNum = 141230144;BA.debugLine="Dim colCnt1 As Int = 0";
_colcnt1 = (int) (0);
RDebugUtils.currentLine=141230145;
 //BA.debugLineNum = 141230145;BA.debugLine="Dim colTot1 As Int = column.Columns";
_coltot1 = (int)(Double.parseDouble(_column.Columns /*String*/ ));
RDebugUtils.currentLine=141230146;
 //BA.debugLineNum = 141230146;BA.debugLine="For colCnt1 = 1 To colTot1";
{
final int step53 = 1;
final int limit53 = _coltot1;
_colcnt1 = (int) (1) ;
for (;_colcnt1 <= limit53 ;_colcnt1 = _colcnt1 + step53 ) {
RDebugUtils.currentLine=141230148;
 //BA.debugLineNum = 141230148;BA.debugLine="LastColumn = LastColumn + 1";
_lastcolumn = (int) (_lastcolumn+1);
RDebugUtils.currentLine=141230149;
 //BA.debugLineNum = 141230149;BA.debugLine="column.Row = CStr(LastRow)";
_column.Row /*String*/  = __ref._cstr /*String*/ (null,(Object)(__ref._lastrow /*int*/ ));
RDebugUtils.currentLine=141230150;
 //BA.debugLineNum = 141230150;BA.debugLine="column.Col = CStr(LastColumn)";
_column.Col /*String*/  = __ref._cstr /*String*/ (null,(Object)(_lastcolumn));
RDebugUtils.currentLine=141230151;
 //BA.debugLineNum = 141230151;BA.debugLine="Dim cellKey As String = $\"${rowKey}c${LastColu";
_cellkey = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"c"+__c.SmartStringFormatter("",(Object)(_lastcolumn))+"");
RDebugUtils.currentLine=141230153;
 //BA.debugLineNum = 141230153;BA.debugLine="RC.Put(cellKey,cellKey)";
__ref._rc /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_cellkey),(Object)(_cellkey));
RDebugUtils.currentLine=141230160;
 //BA.debugLineNum = 141230160;BA.debugLine="Dim tColumn As VueHTML";
_tcolumn = new b4j.example.vuehtml();
RDebugUtils.currentLine=141230161;
 //BA.debugLineNum = 141230161;BA.debugLine="tColumn.Initialize(cellKey,\"div\")";
_tcolumn._initialize /*b4j.example.vuehtml*/ (null,ba,_cellkey,"div");
RDebugUtils.currentLine=141230162;
 //BA.debugLineNum = 141230162;BA.debugLine="Dim strColumnClass As String = BuildColumnClas";
_strcolumnclass = __ref._buildcolumnclass /*String*/ (null,_column);
RDebugUtils.currentLine=141230163;
 //BA.debugLineNum = 141230163;BA.debugLine="tColumn.AddClass(strColumnClass)";
_tcolumn._addclass /*b4j.example.vuehtml*/ (null,_strcolumnclass);
RDebugUtils.currentLine=141230164;
 //BA.debugLineNum = 141230164;BA.debugLine="tColumn.AddClass(column.ClassName)";
_tcolumn._addclass /*b4j.example.vuehtml*/ (null,_column.ClassName /*String*/ );
RDebugUtils.currentLine=141230165;
 //BA.debugLineNum = 141230165;BA.debugLine="tColumn.addClass(column.ThemeName)";
_tcolumn._addclass /*b4j.example.vuehtml*/ (null,_column.ThemeName /*String*/ );
RDebugUtils.currentLine=141230167;
 //BA.debugLineNum = 141230167;BA.debugLine="tColumn.AddStyle(\"margin-top\", column.marginto";
_tcolumn._addstyle /*b4j.example.vuehtml*/ (null,"margin-top",_column.MarginTop /*Object*/ );
RDebugUtils.currentLine=141230168;
 //BA.debugLineNum = 141230168;BA.debugLine="tColumn.AddStyle(\"margin-bottom\", column.margi";
_tcolumn._addstyle /*b4j.example.vuehtml*/ (null,"margin-bottom",_column.MarginBottom /*Object*/ );
RDebugUtils.currentLine=141230169;
 //BA.debugLineNum = 141230169;BA.debugLine="tColumn.AddStyle(\"margin-left\", column.marginl";
_tcolumn._addstyle /*b4j.example.vuehtml*/ (null,"margin-left",_column.MarginLeft /*Object*/ );
RDebugUtils.currentLine=141230170;
 //BA.debugLineNum = 141230170;BA.debugLine="tColumn.AddStyle(\"margin-right\", column.margin";
_tcolumn._addstyle /*b4j.example.vuehtml*/ (null,"margin-right",_column.MarginRight /*Object*/ );
RDebugUtils.currentLine=141230171;
 //BA.debugLineNum = 141230171;BA.debugLine="tColumn.AddStyle(\"padding-top\", column.padding";
_tcolumn._addstyle /*b4j.example.vuehtml*/ (null,"padding-top",_column.PaddingTop /*Object*/ );
RDebugUtils.currentLine=141230172;
 //BA.debugLineNum = 141230172;BA.debugLine="tColumn.AddStyle(\"padding-bottom\", column.padd";
_tcolumn._addstyle /*b4j.example.vuehtml*/ (null,"padding-bottom",_column.PaddingBottom /*Object*/ );
RDebugUtils.currentLine=141230173;
 //BA.debugLineNum = 141230173;BA.debugLine="tColumn.AddStyle(\"padding-left\", column.paddin";
_tcolumn._addstyle /*b4j.example.vuehtml*/ (null,"padding-left",_column.PaddingLeft /*Object*/ );
RDebugUtils.currentLine=141230174;
 //BA.debugLineNum = 141230174;BA.debugLine="tColumn.AddStyle(\"padding-right\", column.paddi";
_tcolumn._addstyle /*b4j.example.vuehtml*/ (null,"padding-right",_column.PaddingRight /*Object*/ );
RDebugUtils.currentLine=141230178;
 //BA.debugLineNum = 141230178;BA.debugLine="Dim classKey As String = $\"${ID}r${LastRow}c${";
_classkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._lastrow /*int*/ ))+"c"+__c.SmartStringFormatter("",(Object)(_lastcolumn))+"");
RDebugUtils.currentLine=141230179;
 //BA.debugLineNum = 141230179;BA.debugLine="If rowClasses.ContainsKey(classKey) Then";
if (__ref._rowclasses /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_classkey))) { 
RDebugUtils.currentLine=141230181;
 //BA.debugLineNum = 141230181;BA.debugLine="Dim cm As Map = rowClasses.Get(classKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._rowclasses /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_classkey))));
RDebugUtils.currentLine=141230182;
 //BA.debugLineNum = 141230182;BA.debugLine="tColumn.AddClass(MapKeys2Delim(cm,\" \"))";
_tcolumn._addclass /*b4j.example.vuehtml*/ (null,__ref._mapkeys2delim /*String*/ (null,_cm," "));
 };
RDebugUtils.currentLine=141230184;
 //BA.debugLineNum = 141230184;BA.debugLine="If rowStyles.ContainsKey(classKey) Then";
if (__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_classkey))) { 
RDebugUtils.currentLine=141230185;
 //BA.debugLineNum = 141230185;BA.debugLine="Dim cm As Map = rowStyles.Get(classKey)";
_cm = new anywheresoftware.b4a.objects.collections.Map();
_cm.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_classkey))));
RDebugUtils.currentLine=141230186;
 //BA.debugLineNum = 141230186;BA.debugLine="For Each strkey As String In cm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group80 = _cm.Keys();
final int groupLen80 = group80.getSize()
;int index80 = 0;
;
for (; index80 < groupLen80;index80++){
_strkey = BA.ObjectToString(group80.Get(index80));
RDebugUtils.currentLine=141230187;
 //BA.debugLineNum = 141230187;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
_strval = BA.ObjectToString(_cm.Get((Object)(_strkey)));
RDebugUtils.currentLine=141230188;
 //BA.debugLineNum = 141230188;BA.debugLine="tColumn.AddStyleAttribute(strkey,strVal)";
_tcolumn._addstyleattribute /*b4j.example.vuehtml*/ (null,_strkey,(Object)(_strval));
 }
};
 };
RDebugUtils.currentLine=141230191;
 //BA.debugLineNum = 141230191;BA.debugLine="If attributes.ContainsKey(classKey) Then";
if (__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_classkey))) { 
RDebugUtils.currentLine=141230192;
 //BA.debugLineNum = 141230192;BA.debugLine="Dim am As Map = attributes.Get(classKey)";
_am = new anywheresoftware.b4a.objects.collections.Map();
_am.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_classkey))));
RDebugUtils.currentLine=141230193;
 //BA.debugLineNum = 141230193;BA.debugLine="For Each k As String In am.Keys";
{
final anywheresoftware.b4a.BA.IterableList group87 = _am.Keys();
final int groupLen87 = group87.getSize()
;int index87 = 0;
;
for (; index87 < groupLen87;index87++){
_k = BA.ObjectToString(group87.Get(index87));
RDebugUtils.currentLine=141230194;
 //BA.debugLineNum = 141230194;BA.debugLine="Dim v As String = am.Get(k)";
_v = BA.ObjectToString(_am.Get((Object)(_k)));
RDebugUtils.currentLine=141230195;
 //BA.debugLineNum = 141230195;BA.debugLine="tColumn.SetAttr(k,v)";
_tcolumn._setattr /*b4j.example.vuehtml*/ (null,_k,_v);
 }
};
 };
RDebugUtils.currentLine=141230198;
 //BA.debugLineNum = 141230198;BA.debugLine="If Components.ContainsKey(cellKey) Then";
if (__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_cellkey))) { 
RDebugUtils.currentLine=141230199;
 //BA.debugLineNum = 141230199;BA.debugLine="Dim lst As List = Components.Get(cellKey)";
_lst = new anywheresoftware.b4a.objects.collections.List();
_lst.setObject((java.util.List)(__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_cellkey))));
RDebugUtils.currentLine=141230200;
 //BA.debugLineNum = 141230200;BA.debugLine="tColumn.AddContentList(lst)";
_tcolumn._addcontentlist /*b4j.example.vuehtml*/ (null,_lst);
 };
RDebugUtils.currentLine=141230202;
 //BA.debugLineNum = 141230202;BA.debugLine="tRow.AddElement(tColumn)";
_trow._addelement /*b4j.example.vuehtml*/ (null,_tcolumn);
 }
};
 }
};
RDebugUtils.currentLine=141230206;
 //BA.debugLineNum = 141230206;BA.debugLine="Dim strRow As String = tRow.tostring";
_strrow = _trow._tostring /*String*/ (null);
RDebugUtils.currentLine=141230207;
 //BA.debugLineNum = 141230207;BA.debugLine="sb.Append(strRow).Append(CRLF)";
_sb.Append(_strrow).Append(__c.CRLF);
 }
};
RDebugUtils.currentLine=141230210;
 //BA.debugLineNum = 141230210;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
RDebugUtils.currentLine=141230211;
 //BA.debugLineNum = 141230211;BA.debugLine="End Sub";
return "";
}
public String  _buildcolumnclass(b4j.example.vmgrid __ref,b4j.example.vmgrid._gridcolumn _col) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "buildcolumnclass", true))
	 {return ((String) Debug.delegate(ba, "buildcolumnclass", new Object[] {_col}));}
String _strspans = "";
String _stroffsets = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=141295616;
 //BA.debugLineNum = 141295616;BA.debugLine="private Sub BuildColumnClass(col As GridColumn) As";
RDebugUtils.currentLine=141295617;
 //BA.debugLineNum = 141295617;BA.debugLine="Dim strSpans As String = BuildSpans(col.SizeSmall";
_strspans = __ref._buildspans /*String*/ (null,_col.SizeSmall /*String*/ ,_col.SizeMedium /*String*/ ,_col.SizeLarge /*String*/ ,_col.SizeXLarge /*String*/ );
RDebugUtils.currentLine=141295618;
 //BA.debugLineNum = 141295618;BA.debugLine="Dim strOffSets As String = BuildOffsets(col.offse";
_stroffsets = __ref._buildoffsets /*String*/ (null,_col.OffsetSmall /*String*/ ,_col.OffsetMedium /*String*/ ,_col.OffsetLarge /*String*/ ,_col.OffsetXLarge /*String*/ );
RDebugUtils.currentLine=141295620;
 //BA.debugLineNum = 141295620;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=141295621;
 //BA.debugLineNum = 141295621;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=141295622;
 //BA.debugLineNum = 141295622;BA.debugLine="sb.Append($\"${cellClass} \"$)";
_sb.Append((""+__c.SmartStringFormatter("",(Object)(__ref._cellclass /*String*/ ))+" "));
RDebugUtils.currentLine=141295623;
 //BA.debugLineNum = 141295623;BA.debugLine="sb.Append(strSpans)";
_sb.Append(_strspans);
RDebugUtils.currentLine=141295624;
 //BA.debugLineNum = 141295624;BA.debugLine="sb.Append(strOffSets)";
_sb.Append(_stroffsets);
RDebugUtils.currentLine=141295625;
 //BA.debugLineNum = 141295625;BA.debugLine="Return sb.tostring.trim";
if (true) return _sb.ToString().trim();
RDebugUtils.currentLine=141295626;
 //BA.debugLineNum = 141295626;BA.debugLine="End Sub";
return "";
}
public String  _buildspans(b4j.example.vmgrid __ref,String _ss,String _sm,String _sl,String _xl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "buildspans", true))
	 {return ((String) Debug.delegate(ba, "buildspans", new Object[] {_ss,_sm,_sl,_xl}));}
String _pvalue = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _colkey = "";
String _colc = "";
RDebugUtils.currentLine=141426688;
 //BA.debugLineNum = 141426688;BA.debugLine="Private Sub BuildSpans(SS As String, SM As String,";
RDebugUtils.currentLine=141426689;
 //BA.debugLineNum = 141426689;BA.debugLine="Dim pvalue As String = \"\"";
_pvalue = "";
RDebugUtils.currentLine=141426690;
 //BA.debugLineNum = 141426690;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=141426691;
 //BA.debugLineNum = 141426691;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=141426693;
 //BA.debugLineNum = 141426693;BA.debugLine="Dim kTot As Int = colClass.Size - 1";
_ktot = (int) (__ref._colclass /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
RDebugUtils.currentLine=141426694;
 //BA.debugLineNum = 141426694;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
RDebugUtils.currentLine=141426695;
 //BA.debugLineNum = 141426695;BA.debugLine="For kCnt = 0 To kTot";
{
final int step6 = 1;
final int limit6 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit6 ;_kcnt = _kcnt + step6 ) {
RDebugUtils.currentLine=141426696;
 //BA.debugLineNum = 141426696;BA.debugLine="Dim colKey As String = colClass.GetKeyAt(kCnt)";
_colkey = BA.ObjectToString(__ref._colclass /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_kcnt));
RDebugUtils.currentLine=141426698;
 //BA.debugLineNum = 141426698;BA.debugLine="Dim colC As String = colClass.Get(colKey)";
_colc = BA.ObjectToString(__ref._colclass /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colkey)));
RDebugUtils.currentLine=141426700;
 //BA.debugLineNum = 141426700;BA.debugLine="Select Case colKey";
switch (BA.switchObjectToInt(_colkey,"s","m","l","xl")) {
case 0: {
RDebugUtils.currentLine=141426702;
 //BA.debugLineNum = 141426702;BA.debugLine="pvalue = CStr(SS)";
_pvalue = __ref._cstr /*String*/ (null,(Object)(_ss));
 break; }
case 1: {
RDebugUtils.currentLine=141426704;
 //BA.debugLineNum = 141426704;BA.debugLine="pvalue = CStr(SM)";
_pvalue = __ref._cstr /*String*/ (null,(Object)(_sm));
 break; }
case 2: {
RDebugUtils.currentLine=141426706;
 //BA.debugLineNum = 141426706;BA.debugLine="pvalue = CStr(SL)";
_pvalue = __ref._cstr /*String*/ (null,(Object)(_sl));
 break; }
case 3: {
RDebugUtils.currentLine=141426708;
 //BA.debugLineNum = 141426708;BA.debugLine="pvalue = CStr(XL)";
_pvalue = __ref._cstr /*String*/ (null,(Object)(_xl));
 break; }
}
;
RDebugUtils.currentLine=141426710;
 //BA.debugLineNum = 141426710;BA.debugLine="If pvalue <> \"\" Then";
if ((_pvalue).equals("") == false) { 
RDebugUtils.currentLine=141426711;
 //BA.debugLineNum = 141426711;BA.debugLine="sb.Append(colC)";
_sb.Append(_colc);
RDebugUtils.currentLine=141426712;
 //BA.debugLineNum = 141426712;BA.debugLine="sb.Append(pvalue)";
_sb.Append(_pvalue);
RDebugUtils.currentLine=141426713;
 //BA.debugLineNum = 141426713;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 };
 }
};
RDebugUtils.currentLine=141426716;
 //BA.debugLineNum = 141426716;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=141426717;
 //BA.debugLineNum = 141426717;BA.debugLine="End Sub";
return "";
}
public String  _buildoffsets(b4j.example.vmgrid __ref,String _os,String _om,String _ol,String _oxl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "buildoffsets", true))
	 {return ((String) Debug.delegate(ba, "buildoffsets", new Object[] {_os,_om,_ol,_oxl}));}
String _pvalue = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _colkey = "";
String _colc = "";
RDebugUtils.currentLine=141492224;
 //BA.debugLineNum = 141492224;BA.debugLine="Private Sub BuildOffsets(OS As String, OM As Strin";
RDebugUtils.currentLine=141492225;
 //BA.debugLineNum = 141492225;BA.debugLine="Dim pvalue As String";
_pvalue = "";
RDebugUtils.currentLine=141492226;
 //BA.debugLineNum = 141492226;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=141492227;
 //BA.debugLineNum = 141492227;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=141492228;
 //BA.debugLineNum = 141492228;BA.debugLine="Dim kTot As Int = offClass.Size - 1";
_ktot = (int) (__ref._offclass /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
RDebugUtils.currentLine=141492229;
 //BA.debugLineNum = 141492229;BA.debugLine="Dim kCnt As Int = 0";
_kcnt = (int) (0);
RDebugUtils.currentLine=141492230;
 //BA.debugLineNum = 141492230;BA.debugLine="For kCnt = 0 To kTot";
{
final int step6 = 1;
final int limit6 = _ktot;
_kcnt = (int) (0) ;
for (;_kcnt <= limit6 ;_kcnt = _kcnt + step6 ) {
RDebugUtils.currentLine=141492231;
 //BA.debugLineNum = 141492231;BA.debugLine="Dim colKey As String = offClass.GetKeyAt(kCnt)";
_colkey = BA.ObjectToString(__ref._offclass /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_kcnt));
RDebugUtils.currentLine=141492233;
 //BA.debugLineNum = 141492233;BA.debugLine="Dim colC As String = offClass.Get(colKey)";
_colc = BA.ObjectToString(__ref._offclass /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_colkey)));
RDebugUtils.currentLine=141492235;
 //BA.debugLineNum = 141492235;BA.debugLine="Select Case colKey";
switch (BA.switchObjectToInt(_colkey,"s","m","l","xl")) {
case 0: {
RDebugUtils.currentLine=141492237;
 //BA.debugLineNum = 141492237;BA.debugLine="pvalue = CStr(OS)";
_pvalue = __ref._cstr /*String*/ (null,(Object)(_os));
 break; }
case 1: {
RDebugUtils.currentLine=141492239;
 //BA.debugLineNum = 141492239;BA.debugLine="pvalue = CStr(OM)";
_pvalue = __ref._cstr /*String*/ (null,(Object)(_om));
 break; }
case 2: {
RDebugUtils.currentLine=141492241;
 //BA.debugLineNum = 141492241;BA.debugLine="pvalue = CStr(OL)";
_pvalue = __ref._cstr /*String*/ (null,(Object)(_ol));
 break; }
case 3: {
RDebugUtils.currentLine=141492243;
 //BA.debugLineNum = 141492243;BA.debugLine="pvalue = CStr(OXL)";
_pvalue = __ref._cstr /*String*/ (null,(Object)(_oxl));
 break; }
}
;
RDebugUtils.currentLine=141492245;
 //BA.debugLineNum = 141492245;BA.debugLine="If pvalue <> \"\" Then";
if ((_pvalue).equals("") == false) { 
RDebugUtils.currentLine=141492246;
 //BA.debugLineNum = 141492246;BA.debugLine="sb.Append(colC)";
_sb.Append(_colc);
RDebugUtils.currentLine=141492247;
 //BA.debugLineNum = 141492247;BA.debugLine="sb.Append(pvalue)";
_sb.Append(_pvalue);
RDebugUtils.currentLine=141492248;
 //BA.debugLineNum = 141492248;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 };
 }
};
RDebugUtils.currentLine=141492251;
 //BA.debugLineNum = 141492251;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=141492252;
 //BA.debugLineNum = 141492252;BA.debugLine="End Sub";
return "";
}
public String  _cstr(b4j.example.vmgrid __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "cstr", true))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=137691136;
 //BA.debugLineNum = 137691136;BA.debugLine="private Sub CStr(o As Object) As String";
RDebugUtils.currentLine=137691137;
 //BA.debugLineNum = 137691137;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
if ((_o).equals(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED())) { 
_o = (Object)("");};
RDebugUtils.currentLine=137691138;
 //BA.debugLineNum = 137691138;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=137691139;
 //BA.debugLineNum = 137691139;BA.debugLine="End Sub";
return "";
}
public String  _buildrowclass(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "buildrowclass", true))
	 {return ((String) Debug.delegate(ba, "buildrowclass", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=141361152;
 //BA.debugLineNum = 141361152;BA.debugLine="private Sub BuildRowClass() As String";
RDebugUtils.currentLine=141361153;
 //BA.debugLineNum = 141361153;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=141361154;
 //BA.debugLineNum = 141361154;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=141361155;
 //BA.debugLineNum = 141361155;BA.debugLine="sb.Append($\"${rowClass} \"$)";
_sb.Append((""+__c.SmartStringFormatter("",(Object)(__ref._rowclass /*String*/ ))+" "));
RDebugUtils.currentLine=141361156;
 //BA.debugLineNum = 141361156;BA.debugLine="Return sb.tostring.trim";
if (true) return _sb.ToString().trim();
RDebugUtils.currentLine=141361157;
 //BA.debugLineNum = 141361157;BA.debugLine="End Sub";
return "";
}
public String  _mapkeys2delim(b4j.example.vmgrid __ref,anywheresoftware.b4a.objects.collections.Map _m,String _delim) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "mapkeys2delim", true))
	 {return ((String) Debug.delegate(ba, "mapkeys2delim", new Object[] {_m,_delim}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _ktot = 0;
int _kcnt = 0;
String _strkey = "";
RDebugUtils.currentLine=141164544;
 //BA.debugLineNum = 141164544;BA.debugLine="private Sub MapKeys2Delim(m As Map, delim As Strin";
RDebugUtils.currentLine=141164545;
 //BA.debugLineNum = 141164545;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=141164546;
 //BA.debugLineNum = 141164546;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=141164547;
 //BA.debugLineNum = 141164547;BA.debugLine="Dim kTot As Int = m.Size - 1";
_ktot = (int) (_m.getSize()-1);
RDebugUtils.currentLine=141164548;
 //BA.debugLineNum = 141164548;BA.debugLine="Dim kCnt As Int";
_kcnt = 0;
RDebugUtils.currentLine=141164549;
 //BA.debugLineNum = 141164549;BA.debugLine="Dim strKey As String = m.getkeyat(0)";
_strkey = BA.ObjectToString(_m.GetKeyAt((int) (0)));
RDebugUtils.currentLine=141164550;
 //BA.debugLineNum = 141164550;BA.debugLine="sb.Append(strKey)";
_sb.Append(_strkey);
RDebugUtils.currentLine=141164551;
 //BA.debugLineNum = 141164551;BA.debugLine="For kCnt = 1 To kTot";
{
final int step7 = 1;
final int limit7 = _ktot;
_kcnt = (int) (1) ;
for (;_kcnt <= limit7 ;_kcnt = _kcnt + step7 ) {
RDebugUtils.currentLine=141164552;
 //BA.debugLineNum = 141164552;BA.debugLine="Dim strKey As String = m.getkeyat(kCnt)";
_strkey = BA.ObjectToString(_m.GetKeyAt(_kcnt));
RDebugUtils.currentLine=141164553;
 //BA.debugLineNum = 141164553;BA.debugLine="sb.Append(delim).append(strKey)";
_sb.Append(_delim).Append(_strkey);
 }
};
RDebugUtils.currentLine=141164555;
 //BA.debugLineNum = 141164555;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=141164556;
 //BA.debugLineNum = 141164556;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
RDebugUtils.currentLine=137428992;
 //BA.debugLineNum = 137428992;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=137428993;
 //BA.debugLineNum = 137428993;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=137428994;
 //BA.debugLineNum = 137428994;BA.debugLine="Public Grid As VMElement";
_grid = new b4j.example.vmelement();
RDebugUtils.currentLine=137428995;
 //BA.debugLineNum = 137428995;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=137428996;
 //BA.debugLineNum = 137428996;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=137428998;
 //BA.debugLineNum = 137428998;BA.debugLine="Private Rows As Map";
_rows = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137429000;
 //BA.debugLineNum = 137429000;BA.debugLine="Private Columns As Map";
_columns = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137429003;
 //BA.debugLineNum = 137429003;BA.debugLine="Private LastRow As Int";
_lastrow = 0;
RDebugUtils.currentLine=137429005;
 //BA.debugLineNum = 137429005;BA.debugLine="Private RC As Map";
_rc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137429006;
 //BA.debugLineNum = 137429006;BA.debugLine="Private rowClass As String = \"row\"";
_rowclass = "row";
RDebugUtils.currentLine=137429007;
 //BA.debugLineNum = 137429007;BA.debugLine="Private cellClass As String = \"col\"";
_cellclass = "col";
RDebugUtils.currentLine=137429009;
 //BA.debugLineNum = 137429009;BA.debugLine="Public ShowID As Boolean";
_showid = false;
RDebugUtils.currentLine=137429010;
 //BA.debugLineNum = 137429010;BA.debugLine="Private Components As Map";
_components = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137429011;
 //BA.debugLineNum = 137429011;BA.debugLine="Private rowClasses As Map";
_rowclasses = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137429013;
 //BA.debugLineNum = 137429013;BA.debugLine="Private offClass As Map = CreateMap(\"s\":\"offset-s";
_offclass = new anywheresoftware.b4a.objects.collections.Map();
_offclass = __c.createMap(new Object[] {(Object)("s"),(Object)("offset-sm-"),(Object)("m"),(Object)("offset-md-"),(Object)("l"),(Object)("offset-lg-"),(Object)("xl"),(Object)("offset-xl-")});
RDebugUtils.currentLine=137429015;
 //BA.debugLineNum = 137429015;BA.debugLine="Private colClass As Map = CreateMap(\"s\": \"col-sm-";
_colclass = new anywheresoftware.b4a.objects.collections.Map();
_colclass = __c.createMap(new Object[] {(Object)("s"),(Object)("col-sm-"),(Object)("m"),(Object)("col-md-"),(Object)("l"),(Object)("col-lg-"),(Object)("xl"),(Object)("col-xl-")});
RDebugUtils.currentLine=137429016;
 //BA.debugLineNum = 137429016;BA.debugLine="Private rowStyles As Map";
_rowstyles = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137429017;
 //BA.debugLineNum = 137429017;BA.debugLine="Private attributes As Map";
_attributes = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137429019;
 //BA.debugLineNum = 137429019;BA.debugLine="Type GridRow(Rows As String, Columns As List, Vis";
;
RDebugUtils.currentLine=137429023;
 //BA.debugLineNum = 137429023;BA.debugLine="Type GridColumn(Columns As String, OffsetSmall As";
;
RDebugUtils.currentLine=137429028;
 //BA.debugLineNum = 137429028;BA.debugLine="Private isBuilt As Boolean";
_isbuilt = false;
RDebugUtils.currentLine=137429029;
 //BA.debugLineNum = 137429029;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=137429030;
 //BA.debugLineNum = 137429030;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _clear(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=137625600;
 //BA.debugLineNum = 137625600;BA.debugLine="Sub Clear As VMGrid";
RDebugUtils.currentLine=137625601;
 //BA.debugLineNum = 137625601;BA.debugLine="Grid.clear";
__ref._grid /*b4j.example.vmelement*/ ._clear /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=137625602;
 //BA.debugLineNum = 137625602;BA.debugLine="Rows.Initialize";
__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137625603;
 //BA.debugLineNum = 137625603;BA.debugLine="LastRow = 0";
__ref._lastrow /*int*/  = (int) (0);
RDebugUtils.currentLine=137625604;
 //BA.debugLineNum = 137625604;BA.debugLine="RC.Initialize";
__ref._rc /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137625605;
 //BA.debugLineNum = 137625605;BA.debugLine="Columns.Initialize";
__ref._columns /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137625606;
 //BA.debugLineNum = 137625606;BA.debugLine="Components.Initialize";
__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137625607;
 //BA.debugLineNum = 137625607;BA.debugLine="rowClasses.Initialize";
__ref._rowclasses /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137625608;
 //BA.debugLineNum = 137625608;BA.debugLine="rowStyles.Initialize";
__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137625609;
 //BA.debugLineNum = 137625609;BA.debugLine="attributes.Initialize";
__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=137625610;
 //BA.debugLineNum = 137625610;BA.debugLine="isBuilt = False";
__ref._isbuilt /*boolean*/  = __c.False;
RDebugUtils.currentLine=137625611;
 //BA.debugLineNum = 137625611;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=137625612;
 //BA.debugLineNum = 137625612;BA.debugLine="End Sub";
return null;
}
public boolean  _columnexists(b4j.example.vmgrid __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "columnexists", true))
	 {return ((Boolean) Debug.delegate(ba, "columnexists", new Object[] {_rowpos,_colpos}));}
String _rowcol = "";
RDebugUtils.currentLine=141623296;
 //BA.debugLineNum = 141623296;BA.debugLine="Sub ColumnExists(rowPos As Int, colPos As Int) As";
RDebugUtils.currentLine=141623297;
 //BA.debugLineNum = 141623297;BA.debugLine="Dim rowcol As String = $\"${ID}r${rowPos}c${colPos";
_rowcol = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"c"+__c.SmartStringFormatter("",(Object)(_colpos))+"");
RDebugUtils.currentLine=141623298;
 //BA.debugLineNum = 141623298;BA.debugLine="Return RC.ContainsKey(rowcol)";
if (true) return __ref._rc /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowcol));
RDebugUtils.currentLine=141623299;
 //BA.debugLineNum = 141623299;BA.debugLine="End Sub";
return false;
}
public int  _howmanyrows(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "howmanyrows", true))
	 {return ((Integer) Debug.delegate(ba, "howmanyrows", null));}
RDebugUtils.currentLine=141688832;
 //BA.debugLineNum = 141688832;BA.debugLine="Sub HowManyRows() As Int";
RDebugUtils.currentLine=141688833;
 //BA.debugLineNum = 141688833;BA.debugLine="Return LastRow";
if (true) return __ref._lastrow /*int*/ ;
RDebugUtils.currentLine=141688834;
 //BA.debugLineNum = 141688834;BA.debugLine="End Sub";
return 0;
}
public String  _render(b4j.example.vmgrid __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=140771328;
 //BA.debugLineNum = 140771328;BA.debugLine="Sub Render";
RDebugUtils.currentLine=140771329;
 //BA.debugLineNum = 140771329;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=140771330;
 //BA.debugLineNum = 140771330;BA.debugLine="End Sub";
return "";
}
public String  _replacerc(b4j.example.vmgrid __ref,int _rowpos,int _colpos,String _elhtml) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "replacerc", true))
	 {return ((String) Debug.delegate(ba, "replacerc", new Object[] {_rowpos,_colpos,_elhtml}));}
String _cellkey = "";
com.ab.banano.BANanoElement _elbody = null;
RDebugUtils.currentLine=139853824;
 //BA.debugLineNum = 139853824;BA.debugLine="Sub ReplaceRC(rowPos As Int, colPos As Int, elHTML";
RDebugUtils.currentLine=139853825;
 //BA.debugLineNum = 139853825;BA.debugLine="Dim cellKey As String = $\"#${ID}r${rowPos}c${colP";
_cellkey = ("#"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"c"+__c.SmartStringFormatter("",(Object)(_colpos))+"");
RDebugUtils.currentLine=139853826;
 //BA.debugLineNum = 139853826;BA.debugLine="Dim elBody As BANanoElement";
_elbody = new com.ab.banano.BANanoElement();
RDebugUtils.currentLine=139853827;
 //BA.debugLineNum = 139853827;BA.debugLine="elBody = BANano.GetElement(cellKey)";
_elbody = __ref._banano /*com.ab.banano.BANano*/ .GetElement(_cellkey);
RDebugUtils.currentLine=139853828;
 //BA.debugLineNum = 139853828;BA.debugLine="If elBody <> Null Then";
if (_elbody!= null) { 
RDebugUtils.currentLine=139853829;
 //BA.debugLineNum = 139853829;BA.debugLine="elBody.Empty";
_elbody.Empty();
RDebugUtils.currentLine=139853830;
 //BA.debugLineNum = 139853830;BA.debugLine="elBody.SetHTML(elHTML)";
_elbody.SetHTML(_elhtml);
 };
RDebugUtils.currentLine=139853832;
 //BA.debugLineNum = 139853832;BA.debugLine="End Sub";
return "";
}
public boolean  _rowexists(b4j.example.vmgrid __ref,int _rowpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "rowexists", true))
	 {return ((Boolean) Debug.delegate(ba, "rowexists", new Object[] {_rowpos}));}
String _rowcol = "";
RDebugUtils.currentLine=141557760;
 //BA.debugLineNum = 141557760;BA.debugLine="Sub RowExists(rowPos As Int) As Boolean";
RDebugUtils.currentLine=141557761;
 //BA.debugLineNum = 141557761;BA.debugLine="Dim rowcol As String = $\"${ID}r${rowPos}\"$";
_rowcol = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(_rowpos))+"");
RDebugUtils.currentLine=141557762;
 //BA.debugLineNum = 141557762;BA.debugLine="Return Rows.ContainsKey(rowcol)";
if (true) return __ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowcol));
RDebugUtils.currentLine=141557763;
 //BA.debugLineNum = 141557763;BA.debugLine="End Sub";
return false;
}
public b4j.example.vmgrid  _setattr(b4j.example.vmgrid __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=140640256;
 //BA.debugLineNum = 140640256;BA.debugLine="Sub SetAttr(attr As Map) As VMGrid";
RDebugUtils.currentLine=140640257;
 //BA.debugLineNum = 140640257;BA.debugLine="Grid.SetAttr(attr)";
__ref._grid /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=140640258;
 //BA.debugLineNum = 140640258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140640259;
 //BA.debugLineNum = 140640259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setdisabled(b4j.example.vmgrid __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=140705792;
 //BA.debugLineNum = 140705792;BA.debugLine="Sub SetDisabled(b As Boolean) As VMGrid";
RDebugUtils.currentLine=140705793;
 //BA.debugLineNum = 140705793;BA.debugLine="Grid.SetDisabled(b)";
__ref._grid /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=140705794;
 //BA.debugLineNum = 140705794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140705795;
 //BA.debugLineNum = 140705795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setgridborder(b4j.example.vmgrid __ref,String _width,String _color,String _bstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setgridborder", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setgridborder", new Object[] {_width,_color,_bstyle}));}
RDebugUtils.currentLine=139984896;
 //BA.debugLineNum = 139984896;BA.debugLine="Sub SetGridBorder(width As String, color As String";
RDebugUtils.currentLine=139984897;
 //BA.debugLineNum = 139984897;BA.debugLine="Grid.SetBorder(width, color, bstyle)";
__ref._grid /*b4j.example.vmelement*/ ._setborder /*b4j.example.vmelement*/ (null,_width,_color,_bstyle);
RDebugUtils.currentLine=139984898;
 //BA.debugLineNum = 139984898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=139984899;
 //BA.debugLineNum = 139984899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setgridstyle(b4j.example.vmgrid __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setgridstyle", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setgridstyle", new Object[] {_m}));}
RDebugUtils.currentLine=140050432;
 //BA.debugLineNum = 140050432;BA.debugLine="Sub SetGridStyle(m As Map) As VMGrid";
RDebugUtils.currentLine=140050433;
 //BA.debugLineNum = 140050433;BA.debugLine="Grid.SetStyle(m)";
__ref._grid /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=140050434;
 //BA.debugLineNum = 140050434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140050435;
 //BA.debugLineNum = 140050435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setkey(b4j.example.vmgrid __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=140443648;
 //BA.debugLineNum = 140443648;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMGrid";
RDebugUtils.currentLine=140443649;
 //BA.debugLineNum = 140443649;BA.debugLine="Grid.SetKey(k, bind)";
__ref._grid /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=140443650;
 //BA.debugLineNum = 140443650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140443651;
 //BA.debugLineNum = 140443651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondragend(b4j.example.vmgrid __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setondragend", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setondragend", new Object[] {_rowpos,_colpos}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=138084352;
 //BA.debugLineNum = 138084352;BA.debugLine="Sub SetOnDragEnd(rowPos As Int, colPos As Int) As";
RDebugUtils.currentLine=138084353;
 //BA.debugLineNum = 138084353;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=138084354;
 //BA.debugLineNum = 138084354;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=138084355;
 //BA.debugLineNum = 138084355;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=138084356;
 //BA.debugLineNum = 138084356;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=138084358;
 //BA.debugLineNum = 138084358;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragend\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_dragend");
RDebugUtils.currentLine=138084359;
 //BA.debugLineNum = 138084359;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
RDebugUtils.currentLine=138084360;
 //BA.debugLineNum = 138084360;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=138084361;
 //BA.debugLineNum = 138084361;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=138084363;
 //BA.debugLineNum = 138084363;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=138084365;
 //BA.debugLineNum = 138084365;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=138084366;
 //BA.debugLineNum = 138084366;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=138084368;
 //BA.debugLineNum = 138084368;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=138084369;
 //BA.debugLineNum = 138084369;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=138084371;
 //BA.debugLineNum = 138084371;BA.debugLine="rowc.Put(\"v-on:dragend\",methodName)";
_rowc.Put((Object)("v-on:dragend"),(Object)(_methodname));
RDebugUtils.currentLine=138084372;
 //BA.debugLineNum = 138084372;BA.debugLine="attributes.Put(rowKey,rowc)";
__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=138084373;
 //BA.debugLineNum = 138084373;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138084374;
 //BA.debugLineNum = 138084374;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondragenter(b4j.example.vmgrid __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setondragenter", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setondragenter", new Object[] {_rowpos,_colpos}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=138149888;
 //BA.debugLineNum = 138149888;BA.debugLine="Sub SetOnDragEnter(rowPos As Int, colPos As Int) A";
RDebugUtils.currentLine=138149889;
 //BA.debugLineNum = 138149889;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=138149890;
 //BA.debugLineNum = 138149890;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=138149891;
 //BA.debugLineNum = 138149891;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=138149892;
 //BA.debugLineNum = 138149892;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=138149894;
 //BA.debugLineNum = 138149894;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragenter\"";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_dragenter");
RDebugUtils.currentLine=138149895;
 //BA.debugLineNum = 138149895;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
RDebugUtils.currentLine=138149896;
 //BA.debugLineNum = 138149896;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=138149897;
 //BA.debugLineNum = 138149897;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=138149899;
 //BA.debugLineNum = 138149899;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=138149901;
 //BA.debugLineNum = 138149901;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=138149902;
 //BA.debugLineNum = 138149902;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=138149904;
 //BA.debugLineNum = 138149904;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=138149905;
 //BA.debugLineNum = 138149905;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=138149907;
 //BA.debugLineNum = 138149907;BA.debugLine="rowc.Put(\"v-on:dragenter\",methodName)";
_rowc.Put((Object)("v-on:dragenter"),(Object)(_methodname));
RDebugUtils.currentLine=138149908;
 //BA.debugLineNum = 138149908;BA.debugLine="attributes.Put(rowKey,rowc)";
__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=138149909;
 //BA.debugLineNum = 138149909;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138149910;
 //BA.debugLineNum = 138149910;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondragover(b4j.example.vmgrid __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setondragover", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setondragover", new Object[] {_rowpos,_colpos}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=137953280;
 //BA.debugLineNum = 137953280;BA.debugLine="Sub SetOnDragOver(rowPos As Int, colPos As Int) As";
RDebugUtils.currentLine=137953281;
 //BA.debugLineNum = 137953281;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137953282;
 //BA.debugLineNum = 137953282;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=137953283;
 //BA.debugLineNum = 137953283;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=137953284;
 //BA.debugLineNum = 137953284;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=137953286;
 //BA.debugLineNum = 137953286;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragover\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_dragover");
RDebugUtils.currentLine=137953287;
 //BA.debugLineNum = 137953287;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
RDebugUtils.currentLine=137953288;
 //BA.debugLineNum = 137953288;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=137953289;
 //BA.debugLineNum = 137953289;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=137953291;
 //BA.debugLineNum = 137953291;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=137953293;
 //BA.debugLineNum = 137953293;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=137953294;
 //BA.debugLineNum = 137953294;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=137953296;
 //BA.debugLineNum = 137953296;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=137953297;
 //BA.debugLineNum = 137953297;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=137953299;
 //BA.debugLineNum = 137953299;BA.debugLine="rowc.Put(\"v-on:dragover\",methodName)";
_rowc.Put((Object)("v-on:dragover"),(Object)(_methodname));
RDebugUtils.currentLine=137953300;
 //BA.debugLineNum = 137953300;BA.debugLine="attributes.Put(rowKey,rowc)";
__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=137953301;
 //BA.debugLineNum = 137953301;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=137953302;
 //BA.debugLineNum = 137953302;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondragstart(b4j.example.vmgrid __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setondragstart", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setondragstart", new Object[] {_rowpos,_colpos}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=138018816;
 //BA.debugLineNum = 138018816;BA.debugLine="Sub SetOnDragStart(rowPos As Int, colPos As Int) A";
RDebugUtils.currentLine=138018817;
 //BA.debugLineNum = 138018817;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=138018818;
 //BA.debugLineNum = 138018818;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=138018819;
 //BA.debugLineNum = 138018819;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=138018820;
 //BA.debugLineNum = 138018820;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=138018822;
 //BA.debugLineNum = 138018822;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragstart\"";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_dragstart");
RDebugUtils.currentLine=138018823;
 //BA.debugLineNum = 138018823;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
RDebugUtils.currentLine=138018824;
 //BA.debugLineNum = 138018824;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=138018825;
 //BA.debugLineNum = 138018825;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=138018827;
 //BA.debugLineNum = 138018827;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=138018829;
 //BA.debugLineNum = 138018829;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=138018830;
 //BA.debugLineNum = 138018830;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=138018832;
 //BA.debugLineNum = 138018832;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=138018833;
 //BA.debugLineNum = 138018833;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=138018835;
 //BA.debugLineNum = 138018835;BA.debugLine="rowc.Put(\"v-on:dragstart\",methodName)";
_rowc.Put((Object)("v-on:dragstart"),(Object)(_methodname));
RDebugUtils.currentLine=138018836;
 //BA.debugLineNum = 138018836;BA.debugLine="attributes.Put(rowKey,rowc)";
__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=138018837;
 //BA.debugLineNum = 138018837;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138018838;
 //BA.debugLineNum = 138018838;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setondrop(b4j.example.vmgrid __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setondrop", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setondrop", new Object[] {_rowpos,_colpos}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=138215424;
 //BA.debugLineNum = 138215424;BA.debugLine="Sub SetOnDrop(rowPos As Int, colPos As Int) As VMG";
RDebugUtils.currentLine=138215425;
 //BA.debugLineNum = 138215425;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=138215426;
 //BA.debugLineNum = 138215426;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=138215427;
 //BA.debugLineNum = 138215427;BA.debugLine="If colPos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=138215428;
 //BA.debugLineNum = 138215428;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=138215430;
 //BA.debugLineNum = 138215430;BA.debugLine="Dim methodName As String = $\"${rowKey}_drop\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_drop");
RDebugUtils.currentLine=138215431;
 //BA.debugLineNum = 138215431;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
RDebugUtils.currentLine=138215432;
 //BA.debugLineNum = 138215432;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=138215433;
 //BA.debugLineNum = 138215433;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=138215435;
 //BA.debugLineNum = 138215435;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=138215437;
 //BA.debugLineNum = 138215437;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=138215438;
 //BA.debugLineNum = 138215438;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=138215440;
 //BA.debugLineNum = 138215440;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=138215441;
 //BA.debugLineNum = 138215441;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=138215443;
 //BA.debugLineNum = 138215443;BA.debugLine="rowc.Put(\"v-on:drop\",methodName)";
_rowc.Put((Object)("v-on:drop"),(Object)(_methodname));
RDebugUtils.currentLine=138215444;
 //BA.debugLineNum = 138215444;BA.debugLine="attributes.Put(rowKey,rowc)";
__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=138215445;
 //BA.debugLineNum = 138215445;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=138215446;
 //BA.debugLineNum = 138215446;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setontouchstart(b4j.example.vmgrid __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setontouchstart", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setontouchstart", new Object[] {_rowpos,_colpos}));}
anywheresoftware.b4a.objects.collections.Map _rowc = null;
String _rowkey = "";
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=137887744;
 //BA.debugLineNum = 137887744;BA.debugLine="Sub SetOnTouchStart(rowpos As Int, colpos As Int)";
RDebugUtils.currentLine=137887745;
 //BA.debugLineNum = 137887745;BA.debugLine="Dim rowc As Map";
_rowc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=137887746;
 //BA.debugLineNum = 137887746;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowpos)}c${";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"c"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_colpos))))+"");
RDebugUtils.currentLine=137887747;
 //BA.debugLineNum = 137887747;BA.debugLine="If colpos = 0 Then";
if (_colpos==0) { 
RDebugUtils.currentLine=137887748;
 //BA.debugLineNum = 137887748;BA.debugLine="rowKey = $\"${ID}r${CStr(rowpos)}\"$";
_rowkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"r"+__c.SmartStringFormatter("",(Object)(__ref._cstr /*String*/ (null,(Object)(_rowpos))))+"");
 };
RDebugUtils.currentLine=137887750;
 //BA.debugLineNum = 137887750;BA.debugLine="Dim methodName As String = $\"${rowKey}_touchstart";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_rowkey))+"_touchstart");
RDebugUtils.currentLine=137887751;
 //BA.debugLineNum = 137887751;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmgrid)(this);};
RDebugUtils.currentLine=137887752;
 //BA.debugLineNum = 137887752;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=137887753;
 //BA.debugLineNum = 137887753;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=137887755;
 //BA.debugLineNum = 137887755;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=137887756;
 //BA.debugLineNum = 137887756;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
if (__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_rowkey))) { 
RDebugUtils.currentLine=137887757;
 //BA.debugLineNum = 137887757;BA.debugLine="rowc = attributes.Get(rowKey)";
_rowc.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_rowkey))));
 }else {
RDebugUtils.currentLine=137887759;
 //BA.debugLineNum = 137887759;BA.debugLine="rowc.Initialize";
_rowc.Initialize();
RDebugUtils.currentLine=137887760;
 //BA.debugLineNum = 137887760;BA.debugLine="rowc.clear";
_rowc.Clear();
 };
RDebugUtils.currentLine=137887762;
 //BA.debugLineNum = 137887762;BA.debugLine="rowc.Put(\"v-on:touchstart\",methodName)";
_rowc.Put((Object)("v-on:touchstart"),(Object)(_methodname));
RDebugUtils.currentLine=137887763;
 //BA.debugLineNum = 137887763;BA.debugLine="attributes.Put(rowKey,rowc)";
__ref._attributes /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rowkey),(Object)(_rowc.getObject()));
RDebugUtils.currentLine=137887764;
 //BA.debugLineNum = 137887764;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=137887765;
 //BA.debugLineNum = 137887765;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setscrollbar(b4j.example.vmgrid __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setscrollbar", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setscrollbar", new Object[] {_b}));}
RDebugUtils.currentLine=137560064;
 //BA.debugLineNum = 137560064;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMGrid";
RDebugUtils.currentLine=137560065;
 //BA.debugLineNum = 137560065;BA.debugLine="Grid.SetScrollBar(b)";
__ref._grid /*b4j.example.vmelement*/ ._setscrollbar /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=137560066;
 //BA.debugLineNum = 137560066;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=137560067;
 //BA.debugLineNum = 137560067;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setvif(b4j.example.vmgrid __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=140378112;
 //BA.debugLineNum = 140378112;BA.debugLine="Sub SetVIf(vif As Object) As VMGrid";
RDebugUtils.currentLine=140378113;
 //BA.debugLineNum = 140378113;BA.debugLine="Grid.SetVIf(vif)";
__ref._grid /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=140378114;
 //BA.debugLineNum = 140378114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140378115;
 //BA.debugLineNum = 140378115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setvshow(b4j.example.vmgrid __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmgrid";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=140509184;
 //BA.debugLineNum = 140509184;BA.debugLine="Sub SetVShow(vif As Object) As VMGrid";
RDebugUtils.currentLine=140509185;
 //BA.debugLineNum = 140509185;BA.debugLine="Grid.SetVShow(vif)";
__ref._grid /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=140509186;
 //BA.debugLineNum = 140509186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmgrid)(this);
RDebugUtils.currentLine=140509187;
 //BA.debugLineNum = 140509187;BA.debugLine="End Sub";
return null;
}
}