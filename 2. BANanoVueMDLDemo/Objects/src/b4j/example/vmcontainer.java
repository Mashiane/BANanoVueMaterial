package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcontainer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmcontainer", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcontainer.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _container = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmgrid _grid = null;
public Object _module = null;
public anywheresoftware.b4a.objects.collections.List _fields = null;
public anywheresoftware.b4a.objects.collections.List _controls = null;
public anywheresoftware.b4a.objects.collections.List _strings = null;
public anywheresoftware.b4a.objects.collections.List _integers = null;
public anywheresoftware.b4a.objects.collections.List _booleans = null;
public anywheresoftware.b4a.objects.collections.List _doubles = null;
public anywheresoftware.b4a.objects.collections.List _dates = null;
public anywheresoftware.b4a.objects.collections.Map _defaults = null;
public anywheresoftware.b4a.objects.collections.Map _required = null;
public String _mode = "";
public int _totalrows = 0;
public anywheresoftware.b4a.objects.collections.Map _sortitm = null;
public anywheresoftware.b4a.objects.collections.List _sortitl = null;
public anywheresoftware.b4a.objects.collections.Map _rows = null;
public anywheresoftware.b4a.objects.collections.Map _cells = null;
public anywheresoftware.b4a.objects.collections.Map _visibility = null;
public anywheresoftware.b4a.objects.collections.Map _rowstyles = null;
public boolean _designmode = false;
public boolean _hasinfobox = false;
public anywheresoftware.b4a.objects.collections.List _exclusions = null;
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
public static class _eachrow{
public boolean IsInitialized;
public String visibility;
public void Initialize() {
IsInitialized = true;
visibility = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public b4j.example.vmcontainer  _addbooleans(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 941;BA.debugLine="Sub AddBooleans(i As List) As VMContainer";
 //BA.debugLineNum = 942;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 943;BA.debugLine="Booleans.Add(s)";
_booleans.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 945;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 946;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addbr() throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub AddBR As VMContainer";
 //BA.debugLineNum = 129;BA.debugLine="Container.addbr";
_container._addbr /*String*/ ();
 //BA.debugLineNum = 130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub AddClass(c As String) As VMContainer";
 //BA.debugLineNum = 134;BA.debugLine="Container.AddClass(c)";
_container._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumnosmp(int _icolumns,String _ioffsetsmall,String _ioffsetmedium,String _ioffsetlarge,String _ioffsetxlarge,String _isizesmall,String _isizemedium,String _isizelarge,String _isizexlarge,String _sthemename,String _svisibility,String _sclassname) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub AddColumnOSMP(iColumns As Int, iOffsetSmall As";
 //BA.debugLineNum = 234;BA.debugLine="Grid.AddColumnOSMP(iColumns, iOffsetSmall, iOffse";
_grid._addcolumnosmp /*b4j.example.vmgrid*/ (_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_sthemename,_svisibility,_sclassname);
 //BA.debugLineNum = 235;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns(int _icolumns,String _sizesmall,String _sizemedium,String _sizelarge,String _sizexlarge) throws Exception{
 //BA.debugLineNum = 332;BA.debugLine="Sub AddColumns(iColumns As Int, SizeSmall As Strin";
 //BA.debugLineNum = 333;BA.debugLine="Grid.AddColumns(iColumns,SizeSmall, SizeMedium, S";
_grid._addcolumns /*b4j.example.vmgrid*/ (_icolumns,_sizesmall,_sizemedium,_sizelarge,_sizexlarge);
 //BA.debugLineNum = 334;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns10p2() throws Exception{
 //BA.debugLineNum = 302;BA.debugLine="Sub AddColumns10p2 As VMGrid";
 //BA.debugLineNum = 303;BA.debugLine="Grid.AddColumns10p2";
_grid._addcolumns10p2 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 304;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 305;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns11p1() throws Exception{
 //BA.debugLineNum = 292;BA.debugLine="Sub AddColumns11p1 As VMGrid";
 //BA.debugLineNum = 293;BA.debugLine="Grid.AddColumns11p1";
_grid._addcolumns11p1 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 294;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 295;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns12() throws Exception{
 //BA.debugLineNum = 327;BA.debugLine="Sub AddColumns12 As VMGrid";
 //BA.debugLineNum = 328;BA.debugLine="Grid.AddColumns12";
_grid._addcolumns12 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 329;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 330;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns12x1() throws Exception{
 //BA.debugLineNum = 272;BA.debugLine="Sub AddColumns12x1 As VMGrid";
 //BA.debugLineNum = 273;BA.debugLine="AddColumns12x1";
_addcolumns12x1();
 //BA.debugLineNum = 274;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns1p11() throws Exception{
 //BA.debugLineNum = 287;BA.debugLine="Sub AddColumns1p11 As VMGrid";
 //BA.debugLineNum = 288;BA.debugLine="Grid.AddColumns1p11";
_grid._addcolumns1p11 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 289;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 290;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns2p10() throws Exception{
 //BA.debugLineNum = 297;BA.debugLine="Sub AddColumns2p10 As VMGrid";
 //BA.debugLineNum = 298;BA.debugLine="Grid.AddColumns2p10";
_grid._addcolumns2p10 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 299;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns2x6() throws Exception{
 //BA.debugLineNum = 262;BA.debugLine="Sub AddColumns2x6 As VMGrid";
 //BA.debugLineNum = 263;BA.debugLine="Grid.AddColumns2x6";
_grid._addcolumns2x6 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 264;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 265;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns3p9() throws Exception{
 //BA.debugLineNum = 307;BA.debugLine="Sub AddColumns3p9 As VMGrid";
 //BA.debugLineNum = 308;BA.debugLine="Grid.AddColumns3p9";
_grid._addcolumns3p9 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 309;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 310;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns3x4() throws Exception{
 //BA.debugLineNum = 252;BA.debugLine="Sub AddColumns3x4 As VMGrid";
 //BA.debugLineNum = 253;BA.debugLine="Grid.AddColumns3x4";
_grid._addcolumns3x4 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 254;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 255;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns4p8() throws Exception{
 //BA.debugLineNum = 282;BA.debugLine="Sub AddColumns4p8 As VMGrid";
 //BA.debugLineNum = 283;BA.debugLine="Grid.AddColumns4p8";
_grid._addcolumns4p8 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 284;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 285;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns4x3() throws Exception{
 //BA.debugLineNum = 257;BA.debugLine="Sub AddColumns4x3 As VMGrid";
 //BA.debugLineNum = 258;BA.debugLine="Grid.AddColumns4x3";
_grid._addcolumns4x3 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 259;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns5p7() throws Exception{
 //BA.debugLineNum = 322;BA.debugLine="Sub AddColumns5p7 As VMGrid";
 //BA.debugLineNum = 323;BA.debugLine="Grid.AddColumns5p7";
_grid._addcolumns5p7 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 324;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns6x2() throws Exception{
 //BA.debugLineNum = 267;BA.debugLine="Sub AddColumns6x2 As VMGrid";
 //BA.debugLineNum = 268;BA.debugLine="AddColumns6x2";
_addcolumns6x2();
 //BA.debugLineNum = 269;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns7p5() throws Exception{
 //BA.debugLineNum = 317;BA.debugLine="Sub AddColumns7p5 As VMGrid";
 //BA.debugLineNum = 318;BA.debugLine="Grid.AddColumns7p5";
_grid._addcolumns7p5 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 319;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns8p4() throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub AddColumns8p4 As VMGrid";
 //BA.debugLineNum = 278;BA.debugLine="Grid.AddColumns8p4";
_grid._addcolumns8p4 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 279;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns9p3() throws Exception{
 //BA.debugLineNum = 312;BA.debugLine="Sub AddColumns9p3 As VMGrid";
 //BA.debugLineNum = 313;BA.debugLine="Grid.AddColumns9p3";
_grid._addcolumns9p3 /*b4j.example.vmgrid*/ ();
 //BA.debugLineNum = 314;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumnsosmpv(String _icolumns,String _ioffsetsmall,String _ioffsetmedium,String _ioffsetlarge,String _ioffsetxlarge,String _isizesmall,String _isizemedium,String _isizelarge,String _isizexlarge,String _ivisibility,String _stheme) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub AddColumnsOSMPV(iColumns As String, iOffsetSma";
 //BA.debugLineNum = 227;BA.debugLine="Grid.AddColumnsOSMPV(iColumns, iOffsetSmall, iOff";
_grid._addcolumnsosmpv /*b4j.example.vmgrid*/ (_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_ivisibility,_stheme);
 //BA.debugLineNum = 228;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 229;BA.debugLine="End Sub";
return null;
}
public String  _addcomponent(int _rowpos,int _colpos,String _elhtml) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub AddComponent(rowPos As Int, colPos As Int, elH";
 //BA.debugLineNum = 239;BA.debugLine="Grid.AddComponent(rowPos, colPos, elHTML)";
_grid._addcomponent /*String*/ (_rowpos,_colpos,_elhtml);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return "";
}
public String  _addcontrol(b4j.example.vminputcontrol _ctl,String _r,String _c,String _os,String _om,String _ol,String _oxl,String _s,String _m,String _l,String _xl) throws Exception{
String _srow = "";
String _scell = "";
String _rckey = "";
b4j.example.vmcontainer._eachrow _row = null;
 //BA.debugLineNum = 898;BA.debugLine="Sub AddControl(ctl As VMInputControl, r As String,";
 //BA.debugLineNum = 899;BA.debugLine="ctl.Row = r";
_ctl._row /*String*/  = _r;
 //BA.debugLineNum = 900;BA.debugLine="ctl.Cell = c";
_ctl._cell /*String*/  = _c;
 //BA.debugLineNum = 901;BA.debugLine="ctl.SizeSmall = s";
_ctl._sizesmall /*String*/  = _s;
 //BA.debugLineNum = 902;BA.debugLine="ctl.SizeMedium = m";
_ctl._sizemedium /*String*/  = _m;
 //BA.debugLineNum = 903;BA.debugLine="ctl.SizeLarge = l";
_ctl._sizelarge /*String*/  = _l;
 //BA.debugLineNum = 904;BA.debugLine="ctl.SizeXLarge = xl";
_ctl._sizexlarge /*String*/  = _xl;
 //BA.debugLineNum = 905;BA.debugLine="ctl.OffsetSmall = os";
_ctl._offsetsmall /*String*/  = _os;
 //BA.debugLineNum = 906;BA.debugLine="ctl.OffsetMedium = om";
_ctl._offsetmedium /*String*/  = _om;
 //BA.debugLineNum = 907;BA.debugLine="ctl.OffsetLarge = ol";
_ctl._offsetlarge /*String*/  = _ol;
 //BA.debugLineNum = 908;BA.debugLine="ctl.OffsetXLarge = oxl";
_ctl._offsetxlarge /*String*/  = _oxl;
 //BA.debugLineNum = 909;BA.debugLine="Controls.add(ctl)";
_controls.Add((Object)(_ctl));
 //BA.debugLineNum = 911;BA.debugLine="If r > TotalRows Then";
if ((double)(Double.parseDouble(_r))>_totalrows) { 
 //BA.debugLineNum = 912;BA.debugLine="TotalRows = r";
_totalrows = (int)(Double.parseDouble(_r));
 };
 //BA.debugLineNum = 915;BA.debugLine="Dim sRow As String = vue.PadRight(r,2,\"0\")";
_srow = _vue._padright /*String*/ (_r,(int) (2),"0");
 //BA.debugLineNum = 916;BA.debugLine="Dim sCell As String = vue.PadRight(c,2,\"0\")";
_scell = _vue._padright /*String*/ (_c,(int) (2),"0");
 //BA.debugLineNum = 917;BA.debugLine="Dim rcKey As String = $\"${sRow}.${sCell}\"$";
_rckey = (""+__c.SmartStringFormatter("",(Object)(_srow))+"."+__c.SmartStringFormatter("",(Object)(_scell))+"");
 //BA.debugLineNum = 919;BA.debugLine="sortitM.Put(rcKey,ctl)";
_sortitm.Put((Object)(_rckey),(Object)(_ctl));
 //BA.debugLineNum = 920;BA.debugLine="If rows.ContainsKey(sRow) = False Then";
if (_rows.ContainsKey((Object)(_srow))==__c.False) { 
 //BA.debugLineNum = 921;BA.debugLine="Dim row As EachRow";
_row = new b4j.example.vmcontainer._eachrow();
 //BA.debugLineNum = 922;BA.debugLine="row.Initialize";
_row.Initialize();
 //BA.debugLineNum = 923;BA.debugLine="rows.Put(sRow, row)";
_rows.Put((Object)(_srow),(Object)(_row));
 };
 //BA.debugLineNum = 925;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _adddates(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 948;BA.debugLine="Sub AddDates(i As List) As VMContainer";
 //BA.debugLineNum = 949;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 950;BA.debugLine="Dates.Add(s)";
_dates.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 952;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 953;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _adddoubles(anywheresoftware.b4a.objects.collections.List _d) throws Exception{
String _s = "";
 //BA.debugLineNum = 955;BA.debugLine="Sub AddDoubles(d As List) As VMContainer";
 //BA.debugLineNum = 956;BA.debugLine="For Each s As String In d";
{
final anywheresoftware.b4a.BA.IterableList group1 = _d;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 957;BA.debugLine="Doubles.Add(s)";
_doubles.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 959;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 960;BA.debugLine="End Sub";
return null;
}
public String  _addexclusion(anywheresoftware.b4a.objects.collections.List _them) throws Exception{
String _k = "";
 //BA.debugLineNum = 71;BA.debugLine="Sub AddExclusion(them As List)";
 //BA.debugLineNum = 72;BA.debugLine="For Each k As String In them";
{
final anywheresoftware.b4a.BA.IterableList group1 = _them;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 73;BA.debugLine="Exclusions.Add(k)";
_exclusions.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _addhr() throws Exception{
 //BA.debugLineNum = 123;BA.debugLine="Sub AddHR As VMContainer";
 //BA.debugLineNum = 124;BA.debugLine="Container.addhr";
_container._addhr /*String*/ ();
 //BA.debugLineNum = 125;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 126;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addintegers(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 927;BA.debugLine="Sub AddIntegers(i As List) As VMContainer";
 //BA.debugLineNum = 928;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 929;BA.debugLine="Integers.Add(s)";
_integers.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 931;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 932;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addrequired(String _r) throws Exception{
 //BA.debugLineNum = 873;BA.debugLine="Sub AddRequired(r As String) As VMContainer";
 //BA.debugLineNum = 874;BA.debugLine="Required.put(r,r)";
_required.Put((Object)(_r),(Object)(_r));
 //BA.debugLineNum = 875;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 876;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addrow(int _irows,String _svisibility,String _sthemename,String _sclassname) throws Exception{
 //BA.debugLineNum = 219;BA.debugLine="Sub AddRow(iRows As Int, sVisibility As String, sT";
 //BA.debugLineNum = 220;BA.debugLine="Grid.AddRow(iRows, sVisibility, sThemeName,sClass";
_grid._addrow /*b4j.example.vmgrid*/ (_irows,_svisibility,_sthemename,_sclassname);
 //BA.debugLineNum = 221;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addrows(int _irows) throws Exception{
 //BA.debugLineNum = 247;BA.debugLine="Sub AddRows(iRows As Int) As VMGrid";
 //BA.debugLineNum = 248;BA.debugLine="Grid.AddRows(iRows)";
_grid._addrows /*b4j.example.vmgrid*/ (_irows);
 //BA.debugLineNum = 249;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 250;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addstrings(anywheresoftware.b4a.objects.collections.List _i) throws Exception{
String _s = "";
 //BA.debugLineNum = 934;BA.debugLine="Sub AddStrings(i As List) As VMContainer";
 //BA.debugLineNum = 935;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 936;BA.debugLine="Strings.Add(s)";
_strings.Add((Object)(_s));
 }
};
 //BA.debugLineNum = 938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 939;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 436;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 437;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return "";
}
public String  _buildcontrols() throws Exception{
String _showkey = "";
String _diskey = "";
String _enakey = "";
String _errkey = "";
boolean _isarray = false;
b4j.example.vminputcontrol _cnt = null;
int _idxpos = 0;
b4j.example.vminputcontrol _nc = null;
b4j.example.vmlist _lst = null;
b4j.example.vmlistitem _li = null;
b4j.example.vmbutton _btn = null;
b4j.example.vmtimepicker _tp = null;
b4j.example.vmchip _chp = null;
b4j.example.vmchips _chps = null;
b4j.example.vmlabel _lbl = null;
b4j.example.vmimage _img = null;
b4j.example.vmfile _fil = null;
b4j.example.vminput _input = null;
b4j.example.vmtextarea _txtarea = null;
b4j.example.vminfobox _ibox = null;
b4j.example.vmslider _slid = null;
b4j.example.vmnumberinput _ni = null;
b4j.example.vmselect _sel = null;
String _ok = "";
String _ov = "";
b4j.example.vmdatepicker _datex = null;
b4j.example.vmcheckbox _chk = null;
b4j.example.vmswitch _sw = null;
b4j.example.vmicon _icn = null;
b4j.example.vmradiogroup _rg = null;
b4j.example.vmcheckboxgroup _cg = null;
 //BA.debugLineNum = 962;BA.debugLine="private Sub BuildControls";
 //BA.debugLineNum = 963;BA.debugLine="Dim showKey As String";
_showkey = "";
 //BA.debugLineNum = 964;BA.debugLine="Dim disKey As String";
_diskey = "";
 //BA.debugLineNum = 965;BA.debugLine="Dim enaKey As String";
_enakey = "";
 //BA.debugLineNum = 966;BA.debugLine="Dim errKey As String";
_errkey = "";
 //BA.debugLineNum = 967;BA.debugLine="Dim isarray As Boolean";
_isarray = false;
 //BA.debugLineNum = 969;BA.debugLine="For Each cnt As VMInputControl In Controls";
{
final anywheresoftware.b4a.BA.IterableList group6 = _controls;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_cnt = (b4j.example.vminputcontrol)(group6.Get(index6));
 //BA.debugLineNum = 970;BA.debugLine="If cnt.Exclude = True Then Exclusions.Add(cnt.na";
if (_cnt._exclude /*boolean*/ ==__c.True) { 
_exclusions.Add((Object)(_cnt._name /*String*/ ));};
 //BA.debugLineNum = 972;BA.debugLine="Dim idxpos As Int = Exclusions.IndexOf(cnt.name)";
_idxpos = _exclusions.IndexOf((Object)(_cnt._name /*String*/ ));
 //BA.debugLineNum = 973;BA.debugLine="If idxpos = -1 Then";
if (_idxpos==-1) { 
 //BA.debugLineNum = 974;BA.debugLine="Select Case cnt.typeOf";
switch (BA.switchObjectToInt(_cnt._typeof /*String*/ ,"button","list")) {
case 0: 
case 1: {
 //BA.debugLineNum = 976;BA.debugLine="cnt.fieldType = \"\"";
_cnt._fieldtype /*String*/  = "";
 //BA.debugLineNum = 977;BA.debugLine="cnt.Required = False";
_cnt._required /*boolean*/  = __c.False;
 break; }
default: {
 //BA.debugLineNum = 979;BA.debugLine="Fields.Add(cnt.name)";
_fields.Add((Object)(_cnt._name /*String*/ ));
 //BA.debugLineNum = 980;BA.debugLine="Defaults.Put(cnt.name, cnt.defaultValue)";
_defaults.Put((Object)(_cnt._name /*String*/ ),_cnt._defaultvalue /*Object*/ );
 break; }
}
;
 //BA.debugLineNum = 982;BA.debugLine="If cnt.required Then";
if (_cnt._required /*boolean*/ ) { 
 //BA.debugLineNum = 983;BA.debugLine="Required.put(cnt.name,cnt.name)";
_required.Put((Object)(_cnt._name /*String*/ ),(Object)(_cnt._name /*String*/ ));
 };
 //BA.debugLineNum = 985;BA.debugLine="Select Case cnt.fieldType";
switch (BA.switchObjectToInt(_cnt._fieldtype /*String*/ ,"int","bool","string","date","dbl")) {
case 0: {
 //BA.debugLineNum = 987;BA.debugLine="Integers.Add(cnt.name)";
_integers.Add((Object)(_cnt._name /*String*/ ));
 break; }
case 1: {
 //BA.debugLineNum = 989;BA.debugLine="Booleans.Add(cnt.name)";
_booleans.Add((Object)(_cnt._name /*String*/ ));
 break; }
case 2: {
 //BA.debugLineNum = 991;BA.debugLine="Strings.Add(cnt.name)";
_strings.Add((Object)(_cnt._name /*String*/ ));
 break; }
case 3: {
 //BA.debugLineNum = 993;BA.debugLine="Dates.Add(cnt.name)";
_dates.Add((Object)(_cnt._name /*String*/ ));
 break; }
case 4: {
 //BA.debugLineNum = 995;BA.debugLine="Doubles.Add(cnt.name)";
_doubles.Add((Object)(_cnt._name /*String*/ ));
 break; }
}
;
 };
 }
};
 //BA.debugLineNum = 1000;BA.debugLine="BuildGrid(Grid)";
_buildgrid(_grid);
 //BA.debugLineNum = 1005;BA.debugLine="For Each nc As VMInputControl In Controls";
{
final anywheresoftware.b4a.BA.IterableList group36 = _controls;
final int groupLen36 = group36.getSize()
;int index36 = 0;
;
for (; index36 < groupLen36;index36++){
_nc = (b4j.example.vminputcontrol)(group36.Get(index36));
 //BA.debugLineNum = 1006;BA.debugLine="showKey = $\"${nc.name}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"show");
 //BA.debugLineNum = 1007;BA.debugLine="disKey = $\"${nc.name}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"disabled");
 //BA.debugLineNum = 1008;BA.debugLine="enaKey = $\"${nc.name}required\"$";
_enakey = (""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"required");
 //BA.debugLineNum = 1009;BA.debugLine="errKey = $\"${nc.name}error\"$";
_errkey = (""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"error");
 //BA.debugLineNum = 1010;BA.debugLine="isarray = False";
_isarray = __c.False;
 //BA.debugLineNum = 1020;BA.debugLine="visibility.Put(showKey, nc.Isvisible)";
_visibility.Put((Object)(_showkey),(Object)(_nc._isvisible /*boolean*/ ));
 //BA.debugLineNum = 1022;BA.debugLine="Select Case nc.typeOf";
switch (BA.switchObjectToInt(_nc._typeof /*String*/ ,"list","button","timepicker","chip","chips","label","image","file","number","text","tel","email","password","textarea","infobox","slider","numberinput","select","selectbox","datepicker","date","checkbox","switch","switchbox","icon","radiogroup","radio","checkboxgroup")) {
case 0: {
 //BA.debugLineNum = 1024;BA.debugLine="Dim lst As VMList = CreateList(nc.name, module";
_lst = _createlist(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1025;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1026;BA.debugLine="lst.SetVShow(showKey)";
_lst._setvshow /*b4j.example.vmlist*/ ((Object)(_showkey));
 };
 //BA.debugLineNum = 1028;BA.debugLine="lst.AddSubHeader(nc.label)";
_lst._addsubheader /*b4j.example.vmlist*/ ((Object)(_nc._label /*String*/ ));
 //BA.debugLineNum = 1029;BA.debugLine="Dim li As VMListItem = CreateListItem($\"${nc.n";
_li = _createlistitem((""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"li"),_module);
 //BA.debugLineNum = 1030;BA.debugLine="li.SetVFor(\"row\", nc.source)";
_li._setvfor /*b4j.example.vmlistitem*/ ("row",_nc._source /*String*/ );
 //BA.debugLineNum = 1031;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1032;BA.debugLine="li.SetID(nc.key,True)";
_li._setid /*b4j.example.vmlistitem*/ (_nc._key /*String*/ ,__c.True);
 //BA.debugLineNum = 1033;BA.debugLine="li.SetKey(nc.key,True)";
_li._setkey /*b4j.example.vmlistitem*/ (_nc._key /*String*/ ,__c.True);
 };
 //BA.debugLineNum = 1035;BA.debugLine="li.SetText(nc.text)";
_li._settext /*b4j.example.vmlistitem*/ (_nc._text /*String*/ );
 //BA.debugLineNum = 1036;BA.debugLine="Select Case nc.Lines";
switch (BA.switchObjectToInt(_nc._lines /*int*/ ,(int) (2),(int) (3))) {
case 0: {
 //BA.debugLineNum = 1038;BA.debugLine="lst.SetDoubleLine(True)";
_lst._setdoubleline /*b4j.example.vmlist*/ (__c.True);
 //BA.debugLineNum = 1039;BA.debugLine="li.SetDescription(nc.Description)";
_li._setdescription /*b4j.example.vmlistitem*/ (_nc._description /*String*/ );
 break; }
case 1: {
 //BA.debugLineNum = 1041;BA.debugLine="lst.SetTripleLine(True)";
_lst._settripleline /*b4j.example.vmlist*/ (__c.True);
 //BA.debugLineNum = 1042;BA.debugLine="li.SetDescription(nc.Description)";
_li._setdescription /*b4j.example.vmlistitem*/ (_nc._description /*String*/ );
 break; }
}
;
 //BA.debugLineNum = 1047;BA.debugLine="If nc.ActionIcon <> \"\" Then";
if ((_nc._actionicon /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1048;BA.debugLine="li.SetActionIcon(nc.ActionIcon)";
_li._setactionicon /*b4j.example.vmlistitem*/ (_nc._actionicon /*String*/ );
 };
 //BA.debugLineNum = 1050;BA.debugLine="If nc.MenuIcon <> \"\" Then";
if ((_nc._menuicon /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1051;BA.debugLine="li.SetMenuIcon(nc.MenuIcon)";
_li._setmenuicon /*b4j.example.vmlistitem*/ (_nc._menuicon /*String*/ );
 };
 //BA.debugLineNum = 1053;BA.debugLine="If nc.IconName <> \"\" Then";
if ((_nc._iconname /*String*/ ).equals("") == false) { 
 //BA.debugLineNum = 1054;BA.debugLine="li.SetIcon(nc.iconname,nc.IsPrimary)";
_li._seticon /*b4j.example.vmlistitem*/ (_nc._iconname /*String*/ ,_nc._isprimary /*boolean*/ );
 };
 //BA.debugLineNum = 1056;BA.debugLine="If nc.AddEdit Then";
if (_nc._addedit /*boolean*/ ) { 
 //BA.debugLineNum = 1057;BA.debugLine="li.AddEditMenuItem(nc.Key, nc.editcaption)";
_li._addeditmenuitem /*String*/ (_nc._key /*String*/ ,_nc._editcaption /*String*/ );
 //BA.debugLineNum = 1058;BA.debugLine="li.AddDeleteMenuItem(nc.Key, nc.deletecaption";
_li._adddeletemenuitem /*String*/ (_nc._key /*String*/ ,_nc._deletecaption /*String*/ );
 };
 //BA.debugLineNum = 1060;BA.debugLine="li.Pop(lst)";
_li._pop /*String*/ (_lst);
 //BA.debugLineNum = 1065;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, lst.ToStrin";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_lst._tostring /*String*/ ());
 break; }
case 1: {
 //BA.debugLineNum = 1068;BA.debugLine="Select Case nc.ButtonType";
switch (BA.switchObjectToInt(_nc._buttontype /*String*/ ,"regular","icon","fab")) {
case 0: {
 //BA.debugLineNum = 1070;BA.debugLine="nc.Fab = False";
_nc._fab /*boolean*/  = __c.False;
 //BA.debugLineNum = 1071;BA.debugLine="nc.iconbutton = False";
_nc._iconbutton /*boolean*/  = __c.False;
 break; }
case 1: {
 //BA.debugLineNum = 1073;BA.debugLine="nc.IconButton = True";
_nc._iconbutton /*boolean*/  = __c.True;
 //BA.debugLineNum = 1074;BA.debugLine="nc.Fab = False";
_nc._fab /*boolean*/  = __c.False;
 break; }
case 2: {
 //BA.debugLineNum = 1076;BA.debugLine="nc.Fab = True";
_nc._fab /*boolean*/  = __c.True;
 //BA.debugLineNum = 1077;BA.debugLine="nc.IconButton = False";
_nc._iconbutton /*boolean*/  = __c.False;
 break; }
}
;
 //BA.debugLineNum = 1079;BA.debugLine="Dim btn As VMButton = CreateButton(nc.name, mo";
_btn = _createbutton(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1080;BA.debugLine="btn.SetText(nc.label)";
_btn._settext /*b4j.example.vmbutton*/ (_nc._label /*String*/ );
 //BA.debugLineNum = 1081;BA.debugLine="btn.SetRaised(nc.raised)";
_btn._setraised /*b4j.example.vmbutton*/ (_nc._raised /*boolean*/ );
 //BA.debugLineNum = 1082;BA.debugLine="btn.SetPrimary(nc.isprimary)";
_btn._setprimary /*b4j.example.vmbutton*/ (_nc._isprimary /*boolean*/ );
 //BA.debugLineNum = 1083;BA.debugLine="btn.SetAccent(nc.isaccent)";
_btn._setaccent /*b4j.example.vmbutton*/ (_nc._isaccent /*boolean*/ );
 //BA.debugLineNum = 1084;BA.debugLine="btn.SetRipple(nc.Ripple)";
_btn._setripple /*b4j.example.vmbutton*/ (_nc._ripple /*boolean*/ );
 //BA.debugLineNum = 1085;BA.debugLine="btn.SetMenuTrigger(nc.MenuTrigger)";
_btn._setmenutrigger /*b4j.example.vmbutton*/ (_nc._menutrigger /*boolean*/ );
 //BA.debugLineNum = 1086;BA.debugLine="btn.SetDense(nc.Dense)";
_btn._setdense /*b4j.example.vmbutton*/ (_nc._dense /*boolean*/ );
 //BA.debugLineNum = 1087;BA.debugLine="btn.SetIconButton(nc.IconButton)";
_btn._seticonbutton /*b4j.example.vmbutton*/ (_nc._iconbutton /*boolean*/ );
 //BA.debugLineNum = 1088;BA.debugLine="btn.SetPlain(nc.Plain)";
_btn._setplain /*b4j.example.vmbutton*/ (_nc._plain /*boolean*/ );
 //BA.debugLineNum = 1089;BA.debugLine="btn.SetMini(nc.Mini)";
_btn._setmini /*b4j.example.vmbutton*/ (_nc._mini /*boolean*/ );
 //BA.debugLineNum = 1090;BA.debugLine="btn.SetFab(nc.Fab)";
_btn._setfab /*b4j.example.vmbutton*/ (_nc._fab /*boolean*/ );
 //BA.debugLineNum = 1091;BA.debugLine="btn.SetListAction(nc.ListAction)";
_btn._setlistaction /*b4j.example.vmbutton*/ (_nc._listaction /*boolean*/ );
 //BA.debugLineNum = 1092;BA.debugLine="btn.SetIcon(nc.IconName)";
_btn._seticon /*b4j.example.vmbutton*/ (_nc._iconname /*String*/ );
 //BA.debugLineNum = 1093;BA.debugLine="btn.SetTo(nc.NavigateTo, False)";
_btn._setto /*b4j.example.vmbutton*/ (_nc._navigateto /*String*/ ,__c.False);
 //BA.debugLineNum = 1094;BA.debugLine="btn.SetFabPosition(nc.FabPosition)";
_btn._setfabposition /*b4j.example.vmbutton*/ (_nc._fabposition /*String*/ );
 //BA.debugLineNum = 1095;BA.debugLine="btn.SetFabFixed(nc.FabFixed)";
_btn._setfabfixed /*b4j.example.vmbutton*/ (_nc._fabfixed /*boolean*/ );
 //BA.debugLineNum = 1096;BA.debugLine="If nc.FitWidth Then";
if (_nc._fitwidth /*boolean*/ ) { 
 //BA.debugLineNum = 1097;BA.debugLine="btn.SetStyle(CreateMap(\"width\":\"100%\",\"margin";
_btn._setstyle /*b4j.example.vmbutton*/ (__c.createMap(new Object[] {(Object)("width"),(Object)("100%"),(Object)("margin-left"),(Object)("0px"),(Object)("margin-right"),(Object)("0px")}));
 };
 //BA.debugLineNum = 1099;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1100;BA.debugLine="btn.SetVShow(showKey)";
_btn._setvshow /*b4j.example.vmbutton*/ (_showkey);
 //BA.debugLineNum = 1101;BA.debugLine="btn.SetDisabled(nc.IsDisabled)";
_btn._setdisabled /*b4j.example.vmbutton*/ (_nc._isdisabled /*boolean*/ );
 };
 //BA.debugLineNum = 1103;BA.debugLine="btn.SetTabIndex(nc.TabIndex)";
_btn._settabindex /*b4j.example.vmbutton*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1107;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, btn.ToStrin";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_btn._tostring /*String*/ ());
 break; }
case 2: {
 //BA.debugLineNum = 1109;BA.debugLine="Dim tp As VMTimePicker = CreateTimePicker(nc.n";
_tp = _createtimepicker(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1110;BA.debugLine="tp.SetLabel(nc.label)";
_tp._setlabel /*b4j.example.vmtimepicker*/ ((Object)(_nc._label /*String*/ ));
 //BA.debugLineNum = 1111;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1112;BA.debugLine="tp.SetVModel(nc.name)";
_tp._setvmodel /*b4j.example.vmtimepicker*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1113;BA.debugLine="tp.SetVShow(showKey)";
_tp._setvshow /*b4j.example.vmtimepicker*/ (_showkey);
 //BA.debugLineNum = 1114;BA.debugLine="tp.SetDisabled(nc.IsDisabled)";
_tp._setdisabled /*b4j.example.vmtimepicker*/ (_nc._isdisabled /*boolean*/ );
 //BA.debugLineNum = 1115;BA.debugLine="tp.SetRequired(nc.required)";
_tp._setrequired /*b4j.example.vmtimepicker*/ (_nc._required /*boolean*/ );
 };
 //BA.debugLineNum = 1117;BA.debugLine="tp.SetName(nc.name,False)";
_tp._setname /*b4j.example.vmtimepicker*/ ((Object)(_nc._name /*String*/ ),__c.False);
 //BA.debugLineNum = 1118;BA.debugLine="tp.SetTabIndex(nc.TabIndex)";
_tp._settabindex /*b4j.example.vmtimepicker*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1119;BA.debugLine="tp.SetPlaceholder(nc.placeholder)";
_tp._setplaceholder /*b4j.example.vmtimepicker*/ (_nc._placeholder /*String*/ );
 //BA.debugLineNum = 1120;BA.debugLine="tp.SetHelperText(nc.helperText)";
_tp._sethelpertext /*b4j.example.vmtimepicker*/ (_nc._helpertext /*String*/ );
 //BA.debugLineNum = 1121;BA.debugLine="tp.SetErrorText(nc.errorText)";
_tp._seterrortext /*b4j.example.vmtimepicker*/ (_nc._errortext /*String*/ );
 //BA.debugLineNum = 1122;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, tp.ToString";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_tp._tostring /*String*/ ());
 break; }
case 3: {
 //BA.debugLineNum = 1124;BA.debugLine="Dim chp As VMChip = CreateChip(nc.name,module)";
_chp = _createchip(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1125;BA.debugLine="chp.SetText(nc.Text)";
_chp._settext /*b4j.example.vmchip*/ (_nc._text /*String*/ );
 //BA.debugLineNum = 1126;BA.debugLine="chp.SetClickable(nc.Clickable)";
_chp._setclickable /*b4j.example.vmchip*/ (_nc._clickable /*boolean*/ );
 //BA.debugLineNum = 1127;BA.debugLine="chp.SetDeletable(nc.Deletable)";
_chp._setdeletable /*b4j.example.vmchip*/ (_nc._deletable /*boolean*/ );
 //BA.debugLineNum = 1128;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1129;BA.debugLine="chp.SetVShow(showKey)";
_chp._setvshow /*b4j.example.vmchip*/ ((Object)(_showkey));
 //BA.debugLineNum = 1130;BA.debugLine="chp.setVmodel(nc.name)";
_chp._setvmodel /*b4j.example.vmchip*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1131;BA.debugLine="chp.SetDisabled(disKey)";
_chp._setdisabled /*b4j.example.vmchip*/ (BA.ObjectToBoolean(_diskey));
 };
 //BA.debugLineNum = 1133;BA.debugLine="If nc.UseOptions = True Then";
if (_nc._useoptions /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1134;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1135;BA.debugLine="chp.SetOptions(nc.sourceTable, nc.options, n";
_chp._setoptions /*b4j.example.vmchip*/ (_nc._sourcetable /*String*/ ,_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ ,_nc._sourcefield /*String*/ ,_nc._displayfield /*String*/ );
 };
 };
 //BA.debugLineNum = 1138;BA.debugLine="If nc.UseDataSource = True Then";
if (_nc._usedatasource /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1139;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1140;BA.debugLine="chp.SetDataSource(nc.sourceTable, nc.sourceF";
_chp._setdatasource /*b4j.example.vmchip*/ (_nc._sourcetable /*String*/ ,_nc._sourcefield /*String*/ ,_nc._displayfield /*String*/ );
 };
 };
 //BA.debugLineNum = 1143;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, chp.ToStrin";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_chp._tostring /*String*/ ());
 break; }
case 4: {
 //BA.debugLineNum = 1145;BA.debugLine="isarray = True";
_isarray = __c.True;
 //BA.debugLineNum = 1146;BA.debugLine="Dim chps As VMChips = CreateChips(nc.name, mod";
_chps = _createchips(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1147;BA.debugLine="chps.SetInputType(nc.InputType)";
_chps._setinputtype /*b4j.example.vmchips*/ (_nc._inputtype /*String*/ );
 //BA.debugLineNum = 1148;BA.debugLine="chps.SetPlaceholder(nc.PlaceHolder)";
_chps._setplaceholder /*b4j.example.vmchips*/ (_nc._placeholder /*String*/ );
 //BA.debugLineNum = 1149;BA.debugLine="chps.SetStatic(nc.Static)";
_chps._setstatic /*b4j.example.vmchips*/ (_nc._static /*boolean*/ );
 //BA.debugLineNum = 1150;BA.debugLine="chps.SetCheckDuplicated(nc.CheckDuplicates)";
_chps._setcheckduplicated /*b4j.example.vmchips*/ (_nc._checkduplicates /*boolean*/ );
 //BA.debugLineNum = 1151;BA.debugLine="chps.SetHelperText(nc.helperText)";
_chps._sethelpertext /*b4j.example.vmchips*/ (_nc._helpertext /*String*/ );
 //BA.debugLineNum = 1152;BA.debugLine="chps.SetErrorText(nc.errorText)";
_chps._seterrortext /*b4j.example.vmchips*/ (_nc._errortext /*String*/ );
 //BA.debugLineNum = 1153;BA.debugLine="chps.SetLabel(nc.label)";
_chps._setlabel /*b4j.example.vmchips*/ (_nc._label /*String*/ );
 //BA.debugLineNum = 1154;BA.debugLine="chps.SetRequired(nc.Required)";
_chps._setrequired /*b4j.example.vmchips*/ (_nc._required /*boolean*/ );
 //BA.debugLineNum = 1155;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1156;BA.debugLine="chps.setVmodel(nc.name)";
_chps._setvmodel /*b4j.example.vmchips*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1157;BA.debugLine="chps.SetDisabled(disKey)";
_chps._setdisabled /*b4j.example.vmchips*/ (BA.ObjectToBoolean(_diskey));
 //BA.debugLineNum = 1158;BA.debugLine="chps.SetVShow(showKey)";
_chps._setvshow /*b4j.example.vmchips*/ (_showkey);
 };
 //BA.debugLineNum = 1160;BA.debugLine="vue.SetStateSingle(nc.name, Array())";
_vue._setstatesingle /*b4j.example.bananovue*/ (_nc._name /*String*/ ,(Object)(new Object[]{}));
 //BA.debugLineNum = 1161;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, chps.ToStri";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_chps._tostring /*String*/ ());
 break; }
case 5: {
 //BA.debugLineNum = 1163;BA.debugLine="Dim lbl As VMLabel = CreateLABEL(nc.name)";
_lbl = _createlabel(_nc._name /*String*/ );
 //BA.debugLineNum = 1164;BA.debugLine="lbl.SetTag(nc.Tag)";
_lbl._settag /*b4j.example.vmlabel*/ (_nc._tag /*String*/ );
 //BA.debugLineNum = 1165;BA.debugLine="lbl.SetText(nc.Text)";
_lbl._settext /*b4j.example.vmlabel*/ (_nc._text /*String*/ );
 //BA.debugLineNum = 1166;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1167;BA.debugLine="lbl.SetVShow(showKey)";
_lbl._setvshow /*b4j.example.vmlabel*/ (_showkey);
 };
 //BA.debugLineNum = 1169;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, lbl.ToStrin";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_lbl._tostring /*String*/ ());
 break; }
case 6: {
 //BA.debugLineNum = 1171;BA.debugLine="Dim img As VMImage = CreateImage(nc.name, modu";
_img = _createimage(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1172;BA.debugLine="img.SetAlt(nc.Alt)";
_img._setalt /*b4j.example.vmimage*/ (_nc._alt /*String*/ );
 //BA.debugLineNum = 1173;BA.debugLine="img.SetWidth(nc.Width)";
_img._setwidth /*b4j.example.vmimage*/ (_nc._width /*String*/ );
 //BA.debugLineNum = 1174;BA.debugLine="img.SetHeight(nc.Height)";
_img._setheight /*b4j.example.vmimage*/ (_nc._height /*String*/ );
 //BA.debugLineNum = 1175;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1176;BA.debugLine="img.SetVModel(nc.name)";
_img._setvmodel /*b4j.example.vmimage*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1177;BA.debugLine="img.SetVShow(showKey)";
_img._setvshow /*b4j.example.vmimage*/ (_showkey);
 //BA.debugLineNum = 1178;BA.debugLine="img.SetValue(nc.defaultValue, True)";
_img._setvalue /*b4j.example.vmimage*/ (BA.ObjectToString(_nc._defaultvalue /*Object*/ ),__c.True);
 }else {
 //BA.debugLineNum = 1180;BA.debugLine="img.SetValue(nc.defaultValue, False)";
_img._setvalue /*b4j.example.vmimage*/ (BA.ObjectToString(_nc._defaultvalue /*Object*/ ),__c.False);
 };
 //BA.debugLineNum = 1182;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, img.ToStrin";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_img._tostring /*String*/ ());
 break; }
case 7: {
 //BA.debugLineNum = 1184;BA.debugLine="Dim fil As VMFile = CreateFile(nc.name, module";
_fil = _createfile(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1185;BA.debugLine="fil.SetErrorText(nc.errorText)";
_fil._seterrortext /*b4j.example.vmfile*/ (_nc._errortext /*String*/ );
 //BA.debugLineNum = 1186;BA.debugLine="fil.SetLabel(nc.label)";
_fil._setlabel /*b4j.example.vmfile*/ ((Object)(_nc._label /*String*/ ));
 //BA.debugLineNum = 1187;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1188;BA.debugLine="fil.SetVModel(nc.name)";
_fil._setvmodel /*b4j.example.vmfile*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1189;BA.debugLine="fil.SetVShow(showKey)";
_fil._setvshow /*b4j.example.vmfile*/ ((Object)(_showkey));
 //BA.debugLineNum = 1190;BA.debugLine="fil.SetDisabled(nc.IsDisabled)";
_fil._setdisabled /*b4j.example.vmfile*/ (_nc._isdisabled /*boolean*/ );
 //BA.debugLineNum = 1191;BA.debugLine="fil.SetRequired(nc.required)";
_fil._setrequired /*b4j.example.vmfile*/ (_nc._required /*boolean*/ );
 };
 //BA.debugLineNum = 1193;BA.debugLine="fil.SetName(nc.name,False)";
_fil._setname /*b4j.example.vmfile*/ ((Object)(_nc._name /*String*/ ),__c.False);
 //BA.debugLineNum = 1194;BA.debugLine="fil.SetTabIndex(nc.TabIndex)";
_fil._settabindex /*b4j.example.vmfile*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1195;BA.debugLine="fil.SetHelperText(nc.helperText)";
_fil._sethelpertext /*b4j.example.vmfile*/ (_nc._helpertext /*String*/ );
 //BA.debugLineNum = 1196;BA.debugLine="fil.SetPlaceholder(nc.placeholder)";
_fil._setplaceholder /*b4j.example.vmfile*/ ((Object)(_nc._placeholder /*String*/ ));
 //BA.debugLineNum = 1200;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, fil.ToStrin";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_fil._tostring /*String*/ ());
 break; }
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
 //BA.debugLineNum = 1203;BA.debugLine="Dim input As VMInput = CreateInput(nc.name, mo";
_input = _createinput(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1204;BA.debugLine="input.SetErrorText(nc.errorText)";
_input._seterrortext /*b4j.example.vminput*/ (_nc._errortext /*String*/ );
 //BA.debugLineNum = 1205;BA.debugLine="input.SetType(nc.typeOf)";
_input._settype /*b4j.example.vminput*/ ((Object)(_nc._typeof /*String*/ ));
 //BA.debugLineNum = 1206;BA.debugLine="input.SetLabel(nc.label)";
_input._setlabel /*b4j.example.vminput*/ (_nc._label /*String*/ );
 //BA.debugLineNum = 1207;BA.debugLine="input.SetReadOnly(nc.readonly)";
_input._setreadonly /*b4j.example.vminput*/ (_nc._readonly /*boolean*/ );
 //BA.debugLineNum = 1208;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1209;BA.debugLine="input.SetVModel(nc.name)";
_input._setvmodel /*b4j.example.vminput*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1210;BA.debugLine="input.SetVShow(showKey)";
_input._setvshow /*b4j.example.vminput*/ ((Object)(_showkey));
 //BA.debugLineNum = 1211;BA.debugLine="input.SetDisabled(nc.IsDisabled)";
_input._setdisabled /*b4j.example.vminput*/ (_nc._isdisabled /*boolean*/ );
 //BA.debugLineNum = 1212;BA.debugLine="input.SetRequired(nc.required)";
_input._setrequired /*b4j.example.vminput*/ (_nc._required /*boolean*/ );
 };
 //BA.debugLineNum = 1214;BA.debugLine="input.SetName(nc.name,False)";
_input._setname /*b4j.example.vminput*/ ((Object)(_nc._name /*String*/ ),__c.False);
 //BA.debugLineNum = 1215;BA.debugLine="input.SetAutoComplete(nc.name)";
_input._setautocomplete /*b4j.example.vminput*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1216;BA.debugLine="input.SetIcon(nc.IconName)";
_input._seticon /*b4j.example.vminput*/ (_nc._iconname /*String*/ );
 //BA.debugLineNum = 1217;BA.debugLine="input.SetTabIndex(nc.TabIndex)";
_input._settabindex /*b4j.example.vminput*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1218;BA.debugLine="input.SetMaxlength(nc.MaxLength)";
_input._setmaxlength /*b4j.example.vminput*/ ((int)(BA.ObjectToNumber(_nc._maxlength /*Object*/ )));
 //BA.debugLineNum = 1219;BA.debugLine="input.SetHelperText(nc.helperText)";
_input._sethelpertext /*b4j.example.vminput*/ (_nc._helpertext /*String*/ );
 //BA.debugLineNum = 1220;BA.debugLine="input.SetPlaceholder(nc.placeholder)";
_input._setplaceholder /*b4j.example.vminput*/ ((Object)(_nc._placeholder /*String*/ ));
 //BA.debugLineNum = 1221;BA.debugLine="If nc.typeOf <> \"password\" Then";
if ((_nc._typeof /*String*/ ).equals("password") == false) { 
 //BA.debugLineNum = 1222;BA.debugLine="input.SetClearable(nc.clearable)";
_input._setclearable /*b4j.example.vminput*/ (_nc._clearable /*boolean*/ );
 //BA.debugLineNum = 1223;BA.debugLine="input.SetTogglePassword(nc.TogglePassword)";
_input._settogglepassword /*b4j.example.vminput*/ (_nc._togglepassword /*boolean*/ );
 };
 //BA.debugLineNum = 1228;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, input.ToStr";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_input._tostring /*String*/ ());
 break; }
case 13: {
 //BA.debugLineNum = 1231;BA.debugLine="Dim txtarea As VMTextArea = CreateTextArea(nc.";
_txtarea = _createtextarea(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1232;BA.debugLine="txtarea.SetClearable(nc.clearable)";
_txtarea._setclearable /*b4j.example.vmtextarea*/ (_nc._clearable /*boolean*/ );
 //BA.debugLineNum = 1233;BA.debugLine="txtarea.SetErrorText(nc.errorText)";
_txtarea._seterrortext /*b4j.example.vmtextarea*/ (_nc._errortext /*String*/ );
 //BA.debugLineNum = 1234;BA.debugLine="txtarea.SetLabel(nc.label)";
_txtarea._setlabel /*b4j.example.vmtextarea*/ (_nc._label /*String*/ );
 //BA.debugLineNum = 1235;BA.debugLine="txtarea.SetReadOnly(nc.readonly)";
_txtarea._setreadonly /*b4j.example.vmtextarea*/ (_nc._readonly /*boolean*/ );
 //BA.debugLineNum = 1236;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1237;BA.debugLine="txtarea.SetVModel(nc.name)";
_txtarea._setvmodel /*b4j.example.vmtextarea*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1238;BA.debugLine="txtarea.SetVShow(showKey)";
_txtarea._setvshow /*b4j.example.vmtextarea*/ (_showkey);
 //BA.debugLineNum = 1239;BA.debugLine="txtarea.SetDisabled(nc.IsDisabled)";
_txtarea._setdisabled /*b4j.example.vmtextarea*/ (_nc._isdisabled /*boolean*/ );
 //BA.debugLineNum = 1240;BA.debugLine="txtarea.SetRequired(nc.required)";
_txtarea._setrequired /*b4j.example.vmtextarea*/ (_nc._required /*boolean*/ );
 };
 //BA.debugLineNum = 1242;BA.debugLine="txtarea.SetName(nc.name,False)";
_txtarea._setname /*b4j.example.vmtextarea*/ ((Object)(_nc._name /*String*/ ),__c.False);
 //BA.debugLineNum = 1243;BA.debugLine="txtarea.SetTabIndex(nc.TabIndex)";
_txtarea._settabindex /*b4j.example.vmtextarea*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1244;BA.debugLine="txtarea.SetMaxlength(nc.MaxLength)";
_txtarea._setmaxlength /*b4j.example.vmtextarea*/ (BA.ObjectToString(_nc._maxlength /*Object*/ ));
 //BA.debugLineNum = 1245;BA.debugLine="txtarea.SetPlaceholder(nc.placeholder)";
_txtarea._setplaceholder /*b4j.example.vmtextarea*/ ((Object)(_nc._placeholder /*String*/ ));
 //BA.debugLineNum = 1246;BA.debugLine="txtarea.SetHelperText(nc.helperText)";
_txtarea._sethelpertext /*b4j.example.vmtextarea*/ (_nc._helpertext /*String*/ );
 //BA.debugLineNum = 1247;BA.debugLine="txtarea.SetAutogrow(nc.AutoGrow)";
_txtarea._setautogrow /*b4j.example.vmtextarea*/ (_nc._autogrow /*boolean*/ );
 //BA.debugLineNum = 1248;BA.debugLine="txtarea.SetIcon(nc.IconName)";
_txtarea._seticon /*b4j.example.vmtextarea*/ (_nc._iconname /*String*/ );
 //BA.debugLineNum = 1252;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, txtarea.ToS";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_txtarea._tostring /*String*/ ());
 break; }
case 14: {
 //BA.debugLineNum = 1254;BA.debugLine="Dim ibox As VMInfoBox = CreateInfoBox(nc.name,";
_ibox = _createinfobox(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1255;BA.debugLine="If nc.bSetCounter Then";
if (_nc._bsetcounter /*boolean*/ ) { 
 //BA.debugLineNum = 1256;BA.debugLine="ibox.SetFrom(nc.Start)";
_ibox._setfrom /*b4j.example.vminfobox*/ (_nc._start /*String*/ );
 //BA.debugLineNum = 1257;BA.debugLine="ibox.SetTo(nc.Finish)";
_ibox._setto /*b4j.example.vminfobox*/ (_nc._finish /*String*/ );
 //BA.debugLineNum = 1258;BA.debugLine="ibox.SetSpeed(nc.Speed)";
_ibox._setspeed /*b4j.example.vminfobox*/ (_nc._speed /*String*/ );
 //BA.debugLineNum = 1259;BA.debugLine="ibox.SetRefreshInterval(nc.RefreshInterval)";
_ibox._setrefreshinterval /*b4j.example.vminfobox*/ (_nc._refreshinterval /*String*/ );
 };
 //BA.debugLineNum = 1261;BA.debugLine="ibox.SetNumber(nc.Count)";
_ibox._setnumber /*b4j.example.vminfobox*/ (_nc._count /*String*/ );
 //BA.debugLineNum = 1262;BA.debugLine="ibox.SetIcon(nc.IconName)";
_ibox._seticon /*b4j.example.vminfobox*/ (_nc._iconname /*String*/ );
 //BA.debugLineNum = 1263;BA.debugLine="ibox.SetIconColor(nc.IconColor)";
_ibox._seticoncolor /*b4j.example.vminfobox*/ (_nc._iconcolor /*String*/ );
 //BA.debugLineNum = 1264;BA.debugLine="ibox.SetIconBackgroundColor(nc.IconBackgroundC";
_ibox._seticonbackgroundcolor /*b4j.example.vminfobox*/ (_nc._iconbackgroundcolor /*String*/ );
 //BA.debugLineNum = 1265;BA.debugLine="ibox.SetText(nc.Text)";
_ibox._settext /*b4j.example.vminfobox*/ (_nc._text /*String*/ );
 //BA.debugLineNum = 1266;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1267;BA.debugLine="ibox.SetVShow(showKey)";
_ibox._setvshow /*b4j.example.vminfobox*/ ((Object)(_showkey));
 };
 //BA.debugLineNum = 1269;BA.debugLine="ibox.SetHoverExpandEffect(nc.HoverExpandEffect";
_ibox._sethoverexpandeffect /*b4j.example.vminfobox*/ (_nc._hoverexpandeffect /*boolean*/ );
 //BA.debugLineNum = 1270;BA.debugLine="ibox.SetHoverZoomEffect(nc.HoverZoomEffect)";
_ibox._sethoverzoomeffect /*b4j.example.vminfobox*/ (_nc._hoverzoomeffect /*boolean*/ );
 //BA.debugLineNum = 1271;BA.debugLine="Select Case nc.BoxType";
switch (BA.switchObjectToInt(_nc._boxtype /*String*/ ,"2","3","4")) {
case 0: {
 //BA.debugLineNum = 1273;BA.debugLine="ibox.SetStyle2(True)";
_ibox._setstyle2 /*b4j.example.vminfobox*/ (__c.True);
 break; }
case 1: {
 //BA.debugLineNum = 1275;BA.debugLine="ibox.SetStyle3(True)";
_ibox._setstyle3 /*b4j.example.vminfobox*/ (__c.True);
 break; }
case 2: {
 //BA.debugLineNum = 1277;BA.debugLine="ibox.SetStyle4(True)";
_ibox._setstyle4 /*b4j.example.vminfobox*/ (__c.True);
 break; }
}
;
 //BA.debugLineNum = 1279;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, ibox.ToStri";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_ibox._tostring /*String*/ ());
 break; }
case 15: {
 //BA.debugLineNum = 1281;BA.debugLine="Dim slid As VMSlider = CreateSlider(nc.name, m";
_slid = _createslider(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1282;BA.debugLine="slid.SetMin(nc.minvalue)";
_slid._setmin /*b4j.example.vmslider*/ (_nc._minvalue /*int*/ );
 //BA.debugLineNum = 1283;BA.debugLine="slid.SetMax(nc.maxvalue)";
_slid._setmax /*b4j.example.vmslider*/ (_nc._maxvalue /*int*/ );
 //BA.debugLineNum = 1284;BA.debugLine="slid.SetLabel(nc.label)";
_slid._setlabel /*b4j.example.vmslider*/ ((Object)(_nc._label /*String*/ ));
 //BA.debugLineNum = 1285;BA.debugLine="slid.SetThumbLabel(nc.ThumbLabel)";
_slid._setthumblabel /*b4j.example.vmslider*/ (_nc._thumblabel /*boolean*/ );
 //BA.debugLineNum = 1286;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1287;BA.debugLine="slid.SetVModel(nc.name)";
_slid._setvmodel /*b4j.example.vmslider*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1288;BA.debugLine="slid.SetVShow(showKey)";
_slid._setvshow /*b4j.example.vmslider*/ ((Object)(_showkey));
 //BA.debugLineNum = 1289;BA.debugLine="slid.SetDisabled(nc.IsDisabled)";
_slid._setdisabled /*b4j.example.vmslider*/ (_nc._isdisabled /*boolean*/ );
 };
 //BA.debugLineNum = 1291;BA.debugLine="slid.SetName(nc.name,False)";
_slid._setname /*b4j.example.vmslider*/ ((Object)(_nc._name /*String*/ ),__c.False);
 //BA.debugLineNum = 1292;BA.debugLine="slid.SetTabIndex(nc.TabIndex)";
_slid._settabindex /*b4j.example.vmslider*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1296;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, slid.ToStri";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_slid._tostring /*String*/ ());
 break; }
case 16: {
 //BA.debugLineNum = 1298;BA.debugLine="Dim ni As VMNumberInput = CreateNumberInput(nc";
_ni = _createnumberinput(_nc._name /*String*/ );
 //BA.debugLineNum = 1299;BA.debugLine="ni.SetMin(nc.minvalue)";
_ni._setmin /*b4j.example.vmnumberinput*/ (BA.NumberToString(_nc._minvalue /*int*/ ));
 //BA.debugLineNum = 1300;BA.debugLine="ni.SetMax(nc.maxvalue)";
_ni._setmax /*b4j.example.vmnumberinput*/ (BA.NumberToString(_nc._maxvalue /*int*/ ));
 //BA.debugLineNum = 1301;BA.debugLine="ni.SetLabel(nc.label)";
_ni._setlabel /*b4j.example.vmnumberinput*/ (_nc._label /*String*/ );
 //BA.debugLineNum = 1302;BA.debugLine="ni.SetReadOnly(nc.readonly)";
_ni._setreadonly /*b4j.example.vmnumberinput*/ (_nc._readonly /*boolean*/ );
 //BA.debugLineNum = 1303;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1304;BA.debugLine="ni.SetVModel(nc.name)";
_ni._setvmodel /*b4j.example.vmnumberinput*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1305;BA.debugLine="ni.SetVShow(showKey)";
_ni._setvshow /*b4j.example.vmnumberinput*/ (_showkey);
 //BA.debugLineNum = 1306;BA.debugLine="ni.SetDisabled(nc.IsDisabled)";
_ni._setdisabled /*b4j.example.vmnumberinput*/ (_nc._isdisabled /*boolean*/ );
 };
 //BA.debugLineNum = 1308;BA.debugLine="ni.SetName(nc.name,False)";
_ni._setname /*b4j.example.vmnumberinput*/ ((Object)(_nc._name /*String*/ ),__c.False);
 //BA.debugLineNum = 1309;BA.debugLine="ni.SetTabIndex(nc.TabIndex)";
_ni._settabindex /*b4j.example.vmnumberinput*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1313;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, ni.ToString";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_ni._tostring /*String*/ ());
 break; }
case 17: 
case 18: {
 //BA.debugLineNum = 1315;BA.debugLine="isarray = False";
_isarray = __c.False;
 //BA.debugLineNum = 1316;BA.debugLine="Dim sel As VMSelect = CreateSelect(nc.name, mo";
_sel = _createselect(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1317;BA.debugLine="sel.SetLabel(nc.label)";
_sel._setlabel /*b4j.example.vmselect*/ ((Object)(_nc._label /*String*/ ));
 //BA.debugLineNum = 1318;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1319;BA.debugLine="sel.SetVModel(nc.name)";
_sel._setvmodel /*b4j.example.vmselect*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1320;BA.debugLine="sel.SetVShow(showKey)";
_sel._setvshow /*b4j.example.vmselect*/ (_showkey);
 //BA.debugLineNum = 1321;BA.debugLine="sel.SetDisabled(nc.IsDisabled)";
_sel._setdisabled /*b4j.example.vmselect*/ (_nc._isdisabled /*boolean*/ );
 //BA.debugLineNum = 1322;BA.debugLine="sel.SetRequired(nc.required)";
_sel._setrequired /*b4j.example.vmselect*/ (_nc._required /*boolean*/ );
 };
 //BA.debugLineNum = 1324;BA.debugLine="sel.SetTabIndex(nc.TabIndex)";
_sel._settabindex /*b4j.example.vmselect*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1325;BA.debugLine="sel.SetPlaceholder(nc.placeholder)";
_sel._setplaceholder /*b4j.example.vmselect*/ (_nc._placeholder /*String*/ );
 //BA.debugLineNum = 1326;BA.debugLine="sel.SetHelperText(nc.helperText)";
_sel._sethelpertext /*b4j.example.vmselect*/ (_nc._helpertext /*String*/ );
 //BA.debugLineNum = 1327;BA.debugLine="sel.SetErrorText(nc.errorText)";
_sel._seterrortext /*b4j.example.vmselect*/ (_nc._errortext /*String*/ );
 //BA.debugLineNum = 1328;BA.debugLine="sel.SetDense(nc.Dense)";
_sel._setdense /*b4j.example.vmselect*/ (_nc._dense /*boolean*/ );
 //BA.debugLineNum = 1329;BA.debugLine="If nc.UseOptions = True Then";
if (_nc._useoptions /*boolean*/ ==__c.True) { 
 //BA.debugLineNum = 1330;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1331;BA.debugLine="sel.SetOptions(nc.sourceTable, nc.options, n";
_sel._setoptions /*String*/ (_nc._sourcetable /*String*/ ,_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ ,_nc._sourcefield /*String*/ ,_nc._displayfield /*String*/ );
 }else {
 //BA.debugLineNum = 1333;BA.debugLine="For Each ok As String In nc.options.keys";
{
final anywheresoftware.b4a.BA.IterableList group326 = _nc._options /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen326 = group326.getSize()
;int index326 = 0;
;
for (; index326 < groupLen326;index326++){
_ok = BA.ObjectToString(group326.Get(index326));
 //BA.debugLineNum = 1334;BA.debugLine="Dim ov As String = nc.options.Get(ok)";
_ov = BA.ObjectToString(_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_ok)));
 //BA.debugLineNum = 1335;BA.debugLine="sel.additem(ok, ov)";
_sel._additem /*b4j.example.vmselect*/ (_ok,_ov);
 }
};
 };
 }else {
 //BA.debugLineNum = 1339;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1340;BA.debugLine="sel.SetDataSource(nc.sourceTable, nc.sourceF";
_sel._setdatasource /*String*/ (_nc._sourcetable /*String*/ ,_nc._sourcefield /*String*/ ,_nc._displayfield /*String*/ );
 };
 };
 //BA.debugLineNum = 1343;BA.debugLine="sel.SetMultiple(nc.multiple)";
_sel._setmultiple /*b4j.example.vmselect*/ (_nc._multiple /*boolean*/ );
 //BA.debugLineNum = 1344;BA.debugLine="sel.SetDense(True)";
_sel._setdense /*b4j.example.vmselect*/ (__c.True);
 //BA.debugLineNum = 1345;BA.debugLine="If nc.multiple Then isarray = True";
if (_nc._multiple /*boolean*/ ) { 
_isarray = __c.True;};
 //BA.debugLineNum = 1349;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, sel.ToStrin";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_sel._tostring /*String*/ ());
 break; }
case 19: 
case 20: {
 //BA.debugLineNum = 1371;BA.debugLine="Dim datex As VMDatePicker = CreateDatePicker(n";
_datex = _createdatepicker(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1372;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1373;BA.debugLine="datex.SetVModel(nc.name)";
_datex._setvmodel /*b4j.example.vmdatepicker*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1374;BA.debugLine="datex.SetVShow(showKey)";
_datex._setvshow /*b4j.example.vmdatepicker*/ (_showkey);
 //BA.debugLineNum = 1375;BA.debugLine="datex.SetDisabled(nc.IsDisabled)";
_datex._setdisabled /*b4j.example.vmdatepicker*/ (_nc._isdisabled /*boolean*/ );
 //BA.debugLineNum = 1376;BA.debugLine="datex.SetRequired(nc.required)";
_datex._setrequired /*b4j.example.vmdatepicker*/ (_nc._required /*boolean*/ );
 };
 //BA.debugLineNum = 1378;BA.debugLine="datex.SetLabel(nc.label)";
_datex._setlabel /*b4j.example.vmdatepicker*/ (_nc._label /*String*/ );
 //BA.debugLineNum = 1379;BA.debugLine="datex.SetImmediately(nc.immediately)";
_datex._setimmediately /*b4j.example.vmdatepicker*/ (_nc._immediately /*boolean*/ );
 //BA.debugLineNum = 1380;BA.debugLine="datex.SetOpenOnFocus(nc.openonfocus)";
_datex._setopenonfocus /*b4j.example.vmdatepicker*/ (_nc._openonfocus /*boolean*/ );
 //BA.debugLineNum = 1381;BA.debugLine="datex.SetClearable(nc.clearable)";
_datex._setclearable /*b4j.example.vmdatepicker*/ (_nc._clearable /*boolean*/ );
 //BA.debugLineNum = 1382;BA.debugLine="datex.SetTabIndex(nc.TabIndex)";
_datex._settabindex /*b4j.example.vmdatepicker*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1388;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, datex.ToStr";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_datex._tostring /*String*/ ());
 break; }
case 21: {
 //BA.debugLineNum = 1391;BA.debugLine="Dim chk As VMCheckBox = CreateCheckBox(nc.name";
_chk = _createcheckbox(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1392;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1393;BA.debugLine="chk.SetVModel(nc.name)";
_chk._setvmodel /*b4j.example.vmcheckbox*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1394;BA.debugLine="chk.SetVShow(showKey)";
_chk._setvshow /*b4j.example.vmcheckbox*/ (_showkey);
 //BA.debugLineNum = 1395;BA.debugLine="chk.SetDisabled(nc.IsDisabled)";
_chk._setdisabled /*b4j.example.vmcheckbox*/ (_nc._isdisabled /*boolean*/ );
 };
 //BA.debugLineNum = 1397;BA.debugLine="chk.SetValue(nc.value)";
_chk._setvalue /*b4j.example.vmcheckbox*/ ((Object)(_nc._value /*String*/ ));
 //BA.debugLineNum = 1398;BA.debugLine="chk.SetText(nc.label)";
_chk._settext /*b4j.example.vmcheckbox*/ (_nc._label /*String*/ );
 //BA.debugLineNum = 1399;BA.debugLine="chk.SetPrimary(True)";
_chk._setprimary /*b4j.example.vmcheckbox*/ (__c.True);
 //BA.debugLineNum = 1400;BA.debugLine="chk.SetName(nc.name,False)";
_chk._setname /*b4j.example.vmcheckbox*/ ((Object)(_nc._name /*String*/ ),__c.False);
 //BA.debugLineNum = 1401;BA.debugLine="chk.SetTabIndex(nc.TabIndex)";
_chk._settabindex /*b4j.example.vmcheckbox*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1405;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, chk.ToStrin";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_chk._tostring /*String*/ ());
 break; }
case 22: 
case 23: {
 //BA.debugLineNum = 1408;BA.debugLine="Dim sw As VMSwitch = CreateSwitch(nc.name, mod";
_sw = _createswitch(_nc._name /*String*/ ,_module);
 //BA.debugLineNum = 1409;BA.debugLine="sw.SetText(nc.label)";
_sw._settext /*b4j.example.vmswitch*/ (_nc._label /*String*/ );
 //BA.debugLineNum = 1410;BA.debugLine="sw.SetValue(nc.value)";
_sw._setvalue /*b4j.example.vmswitch*/ ((Object)(_nc._value /*String*/ ));
 //BA.debugLineNum = 1411;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1412;BA.debugLine="sw.SetVShow(showKey)";
_sw._setvshow /*b4j.example.vmswitch*/ ((Object)(_showkey));
 //BA.debugLineNum = 1413;BA.debugLine="sw.SetVModel(nc.name)";
_sw._setvmodel /*b4j.example.vmswitch*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1414;BA.debugLine="sw.SetDisabled(nc.IsDisabled)";
_sw._setdisabled /*b4j.example.vmswitch*/ (_nc._isdisabled /*boolean*/ );
 };
 //BA.debugLineNum = 1416;BA.debugLine="sw.SetName(nc.name,False)";
_sw._setname /*b4j.example.vmswitch*/ ((Object)(_nc._name /*String*/ ),__c.False);
 //BA.debugLineNum = 1417;BA.debugLine="sw.SetPrimary(True)";
_sw._setprimary /*b4j.example.vmswitch*/ (__c.True);
 //BA.debugLineNum = 1418;BA.debugLine="sw.SetTabIndex(nc.TabIndex)";
_sw._settabindex /*b4j.example.vmswitch*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1422;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, sw.ToString";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_sw._tostring /*String*/ ());
 break; }
case 24: {
 //BA.debugLineNum = 1424;BA.debugLine="Dim icn As VMIcon = CreateIcon(nc.name)";
_icn = _createicon(_nc._name /*String*/ );
 //BA.debugLineNum = 1425;BA.debugLine="icn.SetText(nc.IconName)";
_icn._settext /*b4j.example.vmicon*/ (_nc._iconname /*String*/ );
 //BA.debugLineNum = 1426;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1427;BA.debugLine="icn.SetVShow(showKey)";
_icn._setvshow /*b4j.example.vmicon*/ ((Object)(_showkey));
 };
 //BA.debugLineNum = 1429;BA.debugLine="icn.SetName(nc.name,False)";
_icn._setname /*b4j.example.vmicon*/ (_nc._name /*String*/ ,__c.False);
 //BA.debugLineNum = 1430;BA.debugLine="Select Case nc.IconSize";
switch (BA.switchObjectToInt(_nc._iconsize /*String*/ ,"normal","2","3","4","5")) {
case 0: {
 break; }
case 1: {
 //BA.debugLineNum = 1433;BA.debugLine="icn.SetSize2x(True)";
_icn._setsize2x /*b4j.example.vmicon*/ (__c.True);
 break; }
case 2: {
 //BA.debugLineNum = 1435;BA.debugLine="icn.SetSize3x(True)";
_icn._setsize3x /*b4j.example.vmicon*/ (__c.True);
 break; }
case 3: {
 //BA.debugLineNum = 1437;BA.debugLine="icn.SetSize4x(True)";
_icn._setsize4x /*b4j.example.vmicon*/ (__c.True);
 break; }
case 4: {
 //BA.debugLineNum = 1439;BA.debugLine="icn.SetSize5x(True)";
_icn._setsize5x /*b4j.example.vmicon*/ (__c.True);
 break; }
}
;
 //BA.debugLineNum = 1441;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, icn.ToStrin";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_icn._tostring /*String*/ ());
 break; }
case 25: 
case 26: {
 //BA.debugLineNum = 1460;BA.debugLine="Dim rg As VMRadioGroup = CreateRadioGroup(nc.n";
_rg = _createradiogroup(_nc._name /*String*/ ,_nc._label /*String*/ ,_module);
 //BA.debugLineNum = 1461;BA.debugLine="rg.SetDesignMode(DesignMode)";
_rg._setdesignmode /*b4j.example.vmradiogroup*/ (_designmode);
 //BA.debugLineNum = 1462;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1463;BA.debugLine="rg.SetVShow(showKey)";
_rg._setvshow /*b4j.example.vmradiogroup*/ (_showkey);
 //BA.debugLineNum = 1464;BA.debugLine="rg.SetVModel(nc.name)";
_rg._setvmodel /*b4j.example.vmradiogroup*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1465;BA.debugLine="rg.SetValue(nc.value)";
_rg._setvalue /*b4j.example.vmradiogroup*/ ((Object)(_nc._value /*String*/ ));
 };
 //BA.debugLineNum = 1467;BA.debugLine="rg.AddItems(nc.options)";
_rg._additems /*b4j.example.vmradiogroup*/ (_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 1468;BA.debugLine="rg.SetTabIndex(nc.TabIndex)";
_rg._settabindex /*b4j.example.vmradiogroup*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1469;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, rg.ToString";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_rg._tostring /*String*/ ());
 break; }
case 27: {
 //BA.debugLineNum = 1471;BA.debugLine="isarray = True";
_isarray = __c.True;
 //BA.debugLineNum = 1472;BA.debugLine="Dim cg As VMCheckBoxGroup = CreateCheckBoxGrou";
_cg = _createcheckboxgroup(_nc._name /*String*/ ,_nc._label /*String*/ ,_module);
 //BA.debugLineNum = 1473;BA.debugLine="cg.SetDesignMode(DesignMode)";
_cg._setdesignmode /*b4j.example.vmcheckboxgroup*/ (_designmode);
 //BA.debugLineNum = 1474;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1475;BA.debugLine="cg.SetVShow(showKey)";
_cg._setvshow /*b4j.example.vmcheckboxgroup*/ (_showkey);
 //BA.debugLineNum = 1476;BA.debugLine="cg.SetVModel(nc.name)";
_cg._setvmodel /*b4j.example.vmcheckboxgroup*/ (_nc._name /*String*/ );
 //BA.debugLineNum = 1477;BA.debugLine="cg.SetValue(nc.value)";
_cg._setvalue /*b4j.example.vmcheckboxgroup*/ ((Object)(_nc._value /*String*/ ));
 };
 //BA.debugLineNum = 1479;BA.debugLine="cg.AddItems(nc.options)";
_cg._additems /*b4j.example.vmcheckboxgroup*/ (_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ );
 //BA.debugLineNum = 1480;BA.debugLine="cg.SetTabIndex(nc.TabIndex)";
_cg._settabindex /*b4j.example.vmcheckboxgroup*/ (BA.NumberToString(_nc._tabindex /*int*/ ));
 //BA.debugLineNum = 1481;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, cg.ToString";
_grid._addcomponent /*String*/ ((int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_cg._tostring /*String*/ ());
 break; }
}
;
 //BA.debugLineNum = 1484;BA.debugLine="If DesignMode = False Then";
if (_designmode==__c.False) { 
 //BA.debugLineNum = 1485;BA.debugLine="vue.SetStateSingle(showKey, nc.Isvisible)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_showkey,(Object)(_nc._isvisible /*boolean*/ ));
 //BA.debugLineNum = 1486;BA.debugLine="vue.SetStateSingle(disKey, nc.IsDisabled)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_diskey,(Object)(_nc._isdisabled /*boolean*/ ));
 //BA.debugLineNum = 1487;BA.debugLine="vue.SetStateSingle(enaKey, nc.Required)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_enakey,(Object)(_nc._required /*boolean*/ ));
 //BA.debugLineNum = 1488;BA.debugLine="If isarray Then";
if (_isarray) { 
 //BA.debugLineNum = 1489;BA.debugLine="vue.SetStateSingle(nc.name, Array())";
_vue._setstatesingle /*b4j.example.bananovue*/ (_nc._name /*String*/ ,(Object)(new Object[]{}));
 }else {
 //BA.debugLineNum = 1491;BA.debugLine="vue.SetStateSingle(nc.name, nc.defaultValue)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_nc._name /*String*/ ,_nc._defaultvalue /*Object*/ );
 };
 //BA.debugLineNum = 1493;BA.debugLine="vue.SetStateSingle(errKey, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_errkey,(Object)(__c.False));
 };
 }
};
 //BA.debugLineNum = 1496;BA.debugLine="End Sub";
return "";
}
public String  _buildgrid(b4j.example.vmgrid _parentgrid) throws Exception{
String _k = "";
anywheresoftware.b4a.objects.collections.List _missingrc = null;
int _compcnt = 0;
String _srow = "";
String _scell = "";
String _rckey = "";
String _rc = "";
anywheresoftware.b4a.objects.collections.Map _finalrows = null;
anywheresoftware.b4a.objects.collections.List _finalcells = null;
String _strrow = "";
int _colcnt = 0;
String _finalrow = "";
b4j.example.vmcontainer._eachrow _er = null;
String[] _finalcell = null;
b4j.example.vminputcontrol[] _ec = null;
int _finalcellssize = 0;
int _cellsize = 0;
 //BA.debugLineNum = 1530;BA.debugLine="private Sub BuildGrid(parentGrid As VMGrid)";
 //BA.debugLineNum = 1532;BA.debugLine="sortItL.Initialize";
_sortitl.Initialize();
 //BA.debugLineNum = 1533;BA.debugLine="For Each k As String In sortitM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _sortitm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1534;BA.debugLine="sortItL.Add(k)";
_sortitl.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 1537;BA.debugLine="sortItL.Sort(True)";
_sortitl.Sort(__c.True);
 //BA.debugLineNum = 1539;BA.debugLine="Dim missingRC As List";
_missingrc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1540;BA.debugLine="missingRC.Initialize";
_missingrc.Initialize();
 //BA.debugLineNum = 1541;BA.debugLine="For compCnt = 1 To TotalRows";
{
final int step8 = 1;
final int limit8 = _totalrows;
_compcnt = (int) (1) ;
for (;_compcnt <= limit8 ;_compcnt = _compcnt + step8 ) {
 //BA.debugLineNum = 1542;BA.debugLine="Dim sRow As String = compCnt";
_srow = BA.NumberToString(_compcnt);
 //BA.debugLineNum = 1543;BA.debugLine="sRow = vue.PadRight(sRow,2,\"0\")";
_srow = _vue._padright /*String*/ (_srow,(int) (2),"0");
 //BA.debugLineNum = 1544;BA.debugLine="Dim sCell As String = vue.PadRight(\"1\",2,\"0\")";
_scell = _vue._padright /*String*/ ("1",(int) (2),"0");
 //BA.debugLineNum = 1545;BA.debugLine="Dim rcKey As String = $\"${sRow}.${sCell}\"$";
_rckey = (""+__c.SmartStringFormatter("",(Object)(_srow))+"."+__c.SmartStringFormatter("",(Object)(_scell))+"");
 //BA.debugLineNum = 1546;BA.debugLine="If sortItL.IndexOf(rcKey) = -1 Then";
if (_sortitl.IndexOf((Object)(_rckey))==-1) { 
 //BA.debugLineNum = 1547;BA.debugLine="missingRC.Add(rcKey)";
_missingrc.Add((Object)(_rckey));
 };
 }
};
 //BA.debugLineNum = 1550;BA.debugLine="If missingRC.Size -1 >= 0 Then";
if (_missingrc.getSize()-1>=0) { 
 //BA.debugLineNum = 1551;BA.debugLine="For Each rc As String In missingRC";
{
final anywheresoftware.b4a.BA.IterableList group18 = _missingrc;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_rc = BA.ObjectToString(group18.Get(index18));
 //BA.debugLineNum = 1552;BA.debugLine="Log(\"VMContainer: \"& rc & \": RC is NOT defined\"";
__c.Log("VMContainer: "+_rc+": RC is NOT defined");
 }
};
 //BA.debugLineNum = 1555;BA.debugLine="Return";
if (true) return "";
 };
 //BA.debugLineNum = 1560;BA.debugLine="Dim finalRows As Map";
_finalrows = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1561;BA.debugLine="finalRows.Initialize";
_finalrows.Initialize();
 //BA.debugLineNum = 1562;BA.debugLine="For Each rc As String In sortItL";
{
final anywheresoftware.b4a.BA.IterableList group25 = _sortitl;
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_rc = BA.ObjectToString(group25.Get(index25));
 //BA.debugLineNum = 1563;BA.debugLine="Dim sRow As String = vue.MvField(rc,1,\".\")";
_srow = _vue._mvfield /*String*/ (_rc,(int) (1),".");
 //BA.debugLineNum = 1564;BA.debugLine="If finalRows.ContainsKey(sRow) Then";
if (_finalrows.ContainsKey((Object)(_srow))) { 
 //BA.debugLineNum = 1565;BA.debugLine="Dim finalCells As List = finalRows.Get(sRow)";
_finalcells = new anywheresoftware.b4a.objects.collections.List();
_finalcells.setObject((java.util.List)(_finalrows.Get((Object)(_srow))));
 }else {
 //BA.debugLineNum = 1567;BA.debugLine="Dim finalCells As List";
_finalcells = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1568;BA.debugLine="finalCells.Initialize";
_finalcells.Initialize();
 };
 //BA.debugLineNum = 1570;BA.debugLine="finalCells.Add(rc)";
_finalcells.Add((Object)(_rc));
 //BA.debugLineNum = 1571;BA.debugLine="finalRows.Put(sRow,finalCells)";
_finalrows.Put((Object)(_srow),(Object)(_finalcells.getObject()));
 }
};
 //BA.debugLineNum = 1575;BA.debugLine="sortItL.Initialize";
_sortitl.Initialize();
 //BA.debugLineNum = 1576;BA.debugLine="For Each strRow As String In finalRows.Keys";
{
final anywheresoftware.b4a.BA.IterableList group37 = _finalrows.Keys();
final int groupLen37 = group37.getSize()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_strrow = BA.ObjectToString(group37.Get(index37));
 //BA.debugLineNum = 1577;BA.debugLine="sortItL.Add(strRow)";
_sortitl.Add((Object)(_strrow));
 }
};
 //BA.debugLineNum = 1579;BA.debugLine="sortItL.Sort(True)";
_sortitl.Sort(__c.True);
 //BA.debugLineNum = 1580;BA.debugLine="Dim colCnt As Int";
_colcnt = 0;
 //BA.debugLineNum = 1581;BA.debugLine="For Each finalRow As String In sortItL";
{
final anywheresoftware.b4a.BA.IterableList group42 = _sortitl;
final int groupLen42 = group42.getSize()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_finalrow = BA.ObjectToString(group42.Get(index42));
 //BA.debugLineNum = 1582;BA.debugLine="Dim er As EachRow = rows.Get(finalRow)";
_er = (b4j.example.vmcontainer._eachrow)(_rows.Get((Object)(_finalrow)));
 //BA.debugLineNum = 1585;BA.debugLine="Dim finalCell(11) As String";
_finalcell = new String[(int) (11)];
java.util.Arrays.fill(_finalcell,"");
 //BA.debugLineNum = 1586;BA.debugLine="Dim ec(11) As VMInputControl";
_ec = new b4j.example.vminputcontrol[(int) (11)];
{
int d0 = _ec.length;
for (int i0 = 0;i0 < d0;i0++) {
_ec[i0] = new b4j.example.vminputcontrol();
}
}
;
 //BA.debugLineNum = 1589;BA.debugLine="Dim finalCells As List = finalRows.Get(finalRow)";
_finalcells = new anywheresoftware.b4a.objects.collections.List();
_finalcells.setObject((java.util.List)(_finalrows.Get((Object)(_finalrow))));
 //BA.debugLineNum = 1591;BA.debugLine="Dim finalCellsSize As Int = finalCells.Size - 1";
_finalcellssize = (int) (_finalcells.getSize()-1);
 //BA.debugLineNum = 1592;BA.debugLine="For colCnt = 0 To finalCellsSize";
{
final int step48 = 1;
final int limit48 = _finalcellssize;
_colcnt = (int) (0) ;
for (;_colcnt <= limit48 ;_colcnt = _colcnt + step48 ) {
 //BA.debugLineNum = 1593;BA.debugLine="finalCell(colCnt) = finalCells.Get(colCnt)";
_finalcell[_colcnt] = BA.ObjectToString(_finalcells.Get(_colcnt));
 //BA.debugLineNum = 1594;BA.debugLine="ec(colCnt) = sortitM.Get(finalCell(colCnt))";
_ec[_colcnt] = (b4j.example.vminputcontrol)(_sortitm.Get((Object)(_finalcell[_colcnt])));
 }
};
 //BA.debugLineNum = 1597;BA.debugLine="parentGrid.AddRow(1, er.Visibility, \"\", \"\")";
_parentgrid._addrow /*b4j.example.vmgrid*/ ((int) (1),_er.visibility /*String*/ ,"","");
 //BA.debugLineNum = 1598;BA.debugLine="Dim cellSize As Int";
_cellsize = 0;
 //BA.debugLineNum = 1599;BA.debugLine="For cellSize = 0 To finalCellsSize";
{
final int step54 = 1;
final int limit54 = _finalcellssize;
_cellsize = (int) (0) ;
for (;_cellsize <= limit54 ;_cellsize = _cellsize + step54 ) {
 //BA.debugLineNum = 1601;BA.debugLine="parentGrid.AddColumnOSMP(1, ec(cellSize).Offset";
_parentgrid._addcolumnosmp /*b4j.example.vmgrid*/ ((int) (1),_ec[_cellsize]._offsetsmall /*String*/ ,_ec[_cellsize]._offsetmedium /*String*/ ,_ec[_cellsize]._offsetlarge /*String*/ ,_ec[_cellsize]._offsetxlarge /*String*/ ,_ec[_cellsize]._sizesmall /*String*/ ,_ec[_cellsize]._sizemedium /*String*/ ,_ec[_cellsize]._sizelarge /*String*/ ,_ec[_cellsize]._sizexlarge /*String*/ ,"",_ec[_cellsize]._visibility /*String*/ ,"");
 }
};
 }
};
 //BA.debugLineNum = 1606;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Container As VMElement";
_container = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Public Grid As VMGrid";
_grid = new b4j.example.vmgrid();
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 10;BA.debugLine="Public Fields As List";
_fields = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 11;BA.debugLine="Public Controls As List";
_controls = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Public Strings As List";
_strings = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 13;BA.debugLine="Public Integers As List";
_integers = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 14;BA.debugLine="Public Booleans As List";
_booleans = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 15;BA.debugLine="Public Doubles As List";
_doubles = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 16;BA.debugLine="Public Dates As List";
_dates = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 17;BA.debugLine="Public Defaults As Map";
_defaults = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 18;BA.debugLine="Public Required As Map";
_required = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 19;BA.debugLine="Public Mode As String";
_mode = "";
 //BA.debugLineNum = 20;BA.debugLine="Private TotalRows As Int";
_totalrows = 0;
 //BA.debugLineNum = 21;BA.debugLine="Private sortitM As Map";
_sortitm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 22;BA.debugLine="Private sortItL As List";
_sortitl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 23;BA.debugLine="Private rows As Map";
_rows = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 24;BA.debugLine="Private cells As Map";
_cells = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 25;BA.debugLine="Type EachRow(visibility As String)";
;
 //BA.debugLineNum = 26;BA.debugLine="Public Grid As VMGrid";
_grid = new b4j.example.vmgrid();
 //BA.debugLineNum = 27;BA.debugLine="Public visibility As Map";
_visibility = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 28;BA.debugLine="Private rowStyles As Map";
_rowstyles = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 29;BA.debugLine="Public DesignMode As Boolean";
_designmode = false;
 //BA.debugLineNum = 30;BA.debugLine="Public HasInfoBox As Boolean";
_hasinfobox = false;
 //BA.debugLineNum = 31;BA.debugLine="Public Exclusions As List";
_exclusions = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmbutton  _createbutton(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmbutton _el = null;
 //BA.debugLineNum = 502;BA.debugLine="private Sub CreateButton(sid As String, eventHandl";
 //BA.debugLineNum = 503;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
 //BA.debugLineNum = 504;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmbutton*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 505;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 506;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _createcheckbox(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmcheckbox _el = null;
 //BA.debugLineNum = 1670;BA.debugLine="private Sub CreateCheckBox(sid As String, eventHan";
 //BA.debugLineNum = 1671;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
 //BA.debugLineNum = 1672;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcheckbox*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1673;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1674;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _createcheckboxgroup(String _sid,String _scaption,Object _eventhandler) throws Exception{
b4j.example.vmcheckboxgroup _el = null;
 //BA.debugLineNum = 1690;BA.debugLine="private Sub CreateCheckBoxGroup(sid As String, sCa";
 //BA.debugLineNum = 1691;BA.debugLine="Dim el As VMCheckBoxGroup";
_el = new b4j.example.vmcheckboxgroup();
 //BA.debugLineNum = 1692;BA.debugLine="el.Initialize(vue, sid, sCaption, eventHandler)";
_el._initialize /*b4j.example.vmcheckboxgroup*/ (ba,_vue,_sid,_scaption,_eventhandler);
 //BA.debugLineNum = 1693;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1694;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _createchip(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmchip _el = null;
 //BA.debugLineNum = 1517;BA.debugLine="private Sub CreateChip(sid As String, eventHandler";
 //BA.debugLineNum = 1518;BA.debugLine="Dim el As VMChip";
_el = new b4j.example.vmchip();
 //BA.debugLineNum = 1519;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmchip*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1520;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1521;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _createchips(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmchips _el = null;
 //BA.debugLineNum = 1511;BA.debugLine="private Sub CreateChips(sid As String, eventHandle";
 //BA.debugLineNum = 1512;BA.debugLine="Dim el As VMChips";
_el = new b4j.example.vmchips();
 //BA.debugLineNum = 1513;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmchips*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1514;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _createcontrol(String _sname) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 514;BA.debugLine="Sub CreateControl(sname As String) As VMInputContr";
 //BA.debugLineNum = 515;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 516;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 517;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 518;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 519;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _createdatepicker(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmdatepicker _el = null;
 //BA.debugLineNum = 508;BA.debugLine="private Sub CreateDatePicker(sid As String, eventH";
 //BA.debugLineNum = 509;BA.debugLine="Dim el As VMDatePicker";
_el = new b4j.example.vmdatepicker();
 //BA.debugLineNum = 510;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmdatepicker*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 511;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 512;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _createfile(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmfile _el = null;
 //BA.debugLineNum = 1623;BA.debugLine="private Sub CreateFile(sid As String, eventHandler";
 //BA.debugLineNum = 1624;BA.debugLine="Dim el As VMFile";
_el = new b4j.example.vmfile();
 //BA.debugLineNum = 1625;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmfile*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1626;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _createicon(String _sid) throws Exception{
b4j.example.vmicon _el = null;
 //BA.debugLineNum = 1677;BA.debugLine="private Sub CreateIcon(sid As String) As VMIcon";
 //BA.debugLineNum = 1678;BA.debugLine="Dim el As VMIcon";
_el = new b4j.example.vmicon();
 //BA.debugLineNum = 1679;BA.debugLine="el.Initialize(vue, sid)";
_el._initialize /*b4j.example.vmicon*/ (ba,_vue,_sid);
 //BA.debugLineNum = 1680;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1681;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _createimage(String _img,Object _eventhandler) throws Exception{
b4j.example.vmimage _el = null;
 //BA.debugLineNum = 1499;BA.debugLine="private Sub CreateImage(img As String, eventHandle";
 //BA.debugLineNum = 1500;BA.debugLine="Dim el As VMImage";
_el = new b4j.example.vmimage();
 //BA.debugLineNum = 1501;BA.debugLine="el.Initialize(vue, img, eventHandler)";
_el._initialize /*b4j.example.vmimage*/ (ba,_vue,_img,_eventhandler);
 //BA.debugLineNum = 1502;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1503;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _createinfobox(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminfobox _el = null;
 //BA.debugLineNum = 1609;BA.debugLine="private Sub CreateInfoBox(sid As String, eventHand";
 //BA.debugLineNum = 1610;BA.debugLine="HasInfoBox = True";
_hasinfobox = __c.True;
 //BA.debugLineNum = 1611;BA.debugLine="Dim el As VMInfoBox";
_el = new b4j.example.vminfobox();
 //BA.debugLineNum = 1612;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vminfobox*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1613;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1614;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createinput(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminput _el = null;
 //BA.debugLineNum = 1630;BA.debugLine="private Sub CreateInput(sid As String, eventHandle";
 //BA.debugLineNum = 1631;BA.debugLine="Dim el As VMInput";
_el = new b4j.example.vminput();
 //BA.debugLineNum = 1632;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vminput*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1633;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1634;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createlabel(String _lblid) throws Exception{
b4j.example.vmlabel _el = null;
 //BA.debugLineNum = 1505;BA.debugLine="private Sub CreateLABEL(lblID As String) As VMLabe";
 //BA.debugLineNum = 1506;BA.debugLine="Dim el As VMLabel";
_el = new b4j.example.vmlabel();
 //BA.debugLineNum = 1507;BA.debugLine="el.Initialize(vue, lblID)";
_el._initialize /*b4j.example.vmlabel*/ (ba,_vue,_lblid);
 //BA.debugLineNum = 1508;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlist  _createlist(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmlist _el = null;
 //BA.debugLineNum = 490;BA.debugLine="private Sub CreateList(sid As String,eventHandler";
 //BA.debugLineNum = 491;BA.debugLine="Dim el As VMList";
_el = new b4j.example.vmlist();
 //BA.debugLineNum = 492;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmlist*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 493;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 494;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _createlistitem(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmlistitem _el = null;
 //BA.debugLineNum = 496;BA.debugLine="private Sub CreateListItem(sid As String, eventHan";
 //BA.debugLineNum = 497;BA.debugLine="Dim el As VMListItem";
_el = new b4j.example.vmlistitem();
 //BA.debugLineNum = 498;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmlistitem*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 499;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 500;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createnumber(String _sid,Object _eventhandler) throws Exception{
b4j.example.vminput _el = null;
 //BA.debugLineNum = 1644;BA.debugLine="private Sub CreateNumber(sid As String, eventHandl";
 //BA.debugLineNum = 1645;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
_el = _createinput(_sid,_eventhandler)._settypenumber /*b4j.example.vminput*/ (__c.True);
 //BA.debugLineNum = 1646;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1647;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _createnumberinput(String _sid) throws Exception{
b4j.example.vmnumberinput _el = null;
 //BA.debugLineNum = 1650;BA.debugLine="private Sub CreateNumberInput(sid As String) As VM";
 //BA.debugLineNum = 1651;BA.debugLine="Dim el As VMNumberInput";
_el = new b4j.example.vmnumberinput();
 //BA.debugLineNum = 1652;BA.debugLine="el.Initialize(vue, sid)";
_el._initialize /*b4j.example.vmnumberinput*/ (ba,_vue,_sid);
 //BA.debugLineNum = 1653;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1654;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _createradiogroup(String _sid,String _scaption,Object _eventhandler) throws Exception{
b4j.example.vmradiogroup _el = null;
 //BA.debugLineNum = 1684;BA.debugLine="private Sub CreateRadioGroup(sid As String, sCapti";
 //BA.debugLineNum = 1685;BA.debugLine="Dim el As VMRadioGroup";
_el = new b4j.example.vmradiogroup();
 //BA.debugLineNum = 1686;BA.debugLine="el.Initialize(vue, sid, sCaption, eventHandler)";
_el._initialize /*b4j.example.vmradiogroup*/ (ba,_vue,_sid,_scaption,_eventhandler);
 //BA.debugLineNum = 1687;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1688;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _createselect(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmselect _el = null;
 //BA.debugLineNum = 1657;BA.debugLine="private Sub CreateSelect(sid As String, eventHandl";
 //BA.debugLineNum = 1658;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
 //BA.debugLineNum = 1659;BA.debugLine="el.Initialize(vue,sid,eventHandler)";
_el._initialize /*b4j.example.vmselect*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1660;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1661;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _createslider(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmslider _el = null;
 //BA.debugLineNum = 1637;BA.debugLine="private Sub CreateSlider(sid As String, eventHandl";
 //BA.debugLineNum = 1638;BA.debugLine="Dim el As VMSlider";
_el = new b4j.example.vmslider();
 //BA.debugLineNum = 1639;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmslider*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1640;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1641;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _createswitch(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmswitch _el = null;
 //BA.debugLineNum = 1664;BA.debugLine="private Sub CreateSwitch(sid As String, eventHandl";
 //BA.debugLineNum = 1665;BA.debugLine="Dim el As VMSwitch";
_el = new b4j.example.vmswitch();
 //BA.debugLineNum = 1666;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmswitch*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1667;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1668;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _createtextarea(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtextarea _el = null;
 //BA.debugLineNum = 1616;BA.debugLine="private Sub CreateTextArea(sid As String, eventHan";
 //BA.debugLineNum = 1617;BA.debugLine="Dim el As VMTextArea";
_el = new b4j.example.vmtextarea();
 //BA.debugLineNum = 1618;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmtextarea*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1619;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1620;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _createtimepicker(String _sid,Object _eventhandler) throws Exception{
b4j.example.vmtimepicker _el = null;
 //BA.debugLineNum = 1523;BA.debugLine="private Sub CreateTimePicker(sid As String, eventH";
 //BA.debugLineNum = 1524;BA.debugLine="Dim el As VMTimePicker";
_el = new b4j.example.vmtimepicker();
 //BA.debugLineNum = 1525;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtimepicker*/ (ba,_vue,_sid,_eventhandler);
 //BA.debugLineNum = 1526;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1527;BA.debugLine="End Sub";
return null;
}
public String  _disable() throws Exception{
 //BA.debugLineNum = 177;BA.debugLine="Sub Disable";
 //BA.debugLineNum = 178;BA.debugLine="SetDisabled(False)";
_setdisabled(__c.False);
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public String  _enable() throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub Enable";
 //BA.debugLineNum = 174;BA.debugLine="SetDisabled(True)";
_setdisabled(__c.True);
 //BA.debugLineNum = 175;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getdata() throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 450;BA.debugLine="Sub GetData As Map";
 //BA.debugLineNum = 451;BA.debugLine="Prepare";
_prepare();
 //BA.debugLineNum = 452;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 453;BA.debugLine="m = vue.GetStates(Fields)";
_m = _vue._getstates /*anywheresoftware.b4a.objects.collections.Map*/ (_fields);
 //BA.debugLineNum = 454;BA.debugLine="m = LinkRecordTypes(m)";
_m = _linkrecordtypes(_m);
 //BA.debugLineNum = 455;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 456;BA.debugLine="End Sub";
return null;
}
public String  _hide() throws Exception{
 //BA.debugLineNum = 181;BA.debugLine="Sub Hide";
 //BA.debugLineNum = 182;BA.debugLine="vue.SetStateSingle($\"${ID}show\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"show"),(Object)(__c.False));
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return "";
}
public String  _hideerror(String _elid) throws Exception{
 //BA.debugLineNum = 486;BA.debugLine="Sub HideError(elID As String)";
 //BA.debugLineNum = 487;BA.debugLine="vue.SetStateSingle($\"${elID}error\"$, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.False));
 //BA.debugLineNum = 488;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 39;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 40;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 41;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 42;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 43;BA.debugLine="Container.Initialize(vue, ID).SetTag(\"div\")";
_container._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 44;BA.debugLine="Grid.Initialize(vue, $\"${ID}grid\"$,module)";
_grid._initialize /*b4j.example.vmgrid*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"grid"),_module);
 //BA.debugLineNum = 46;BA.debugLine="TotalRows = 0";
_totalrows = (int) (0);
 //BA.debugLineNum = 47;BA.debugLine="rowStyles.Initialize";
_rowstyles.Initialize();
 //BA.debugLineNum = 48;BA.debugLine="sortitM.Initialize";
_sortitm.Initialize();
 //BA.debugLineNum = 49;BA.debugLine="sortItL.Initialize";
_sortitl.Initialize();
 //BA.debugLineNum = 50;BA.debugLine="rows.initialize";
_rows.Initialize();
 //BA.debugLineNum = 51;BA.debugLine="Fields.Initialize";
_fields.Initialize();
 //BA.debugLineNum = 52;BA.debugLine="Controls.Initialize";
_controls.Initialize();
 //BA.debugLineNum = 53;BA.debugLine="Strings.Initialize";
_strings.Initialize();
 //BA.debugLineNum = 54;BA.debugLine="Integers.Initialize";
_integers.Initialize();
 //BA.debugLineNum = 55;BA.debugLine="Booleans.Initialize";
_booleans.Initialize();
 //BA.debugLineNum = 56;BA.debugLine="Defaults.Initialize";
_defaults.Initialize();
 //BA.debugLineNum = 57;BA.debugLine="Required.Initialize";
_required.Initialize();
 //BA.debugLineNum = 58;BA.debugLine="Doubles.Initialize";
_doubles.Initialize();
 //BA.debugLineNum = 59;BA.debugLine="Dates.initialize";
_dates.Initialize();
 //BA.debugLineNum = 60;BA.debugLine="cells.Initialize";
_cells.Initialize();
 //BA.debugLineNum = 61;BA.debugLine="visibility.Initialize";
_visibility.Initialize();
 //BA.debugLineNum = 62;BA.debugLine="Exclusions.Initialize";
_exclusions.Initialize();
 //BA.debugLineNum = 63;BA.debugLine="Mode = \"A\"";
_mode = "A";
 //BA.debugLineNum = 64;BA.debugLine="sortitM.Initialize";
_sortitm.Initialize();
 //BA.debugLineNum = 65;BA.debugLine="sortItL.Initialize";
_sortitl.Initialize();
 //BA.debugLineNum = 66;BA.debugLine="DesignMode = False";
_designmode = __c.False;
 //BA.debugLineNum = 67;BA.debugLine="HasInfoBox = False";
_hasinfobox = __c.False;
 //BA.debugLineNum = 68;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 69;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _linkrecordtypes(anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 883;BA.debugLine="Sub LinkRecordTypes(rec As Map) As Map";
 //BA.debugLineNum = 884;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 885;BA.debugLine="For Each k As String In rec.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _rec.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 886;BA.debugLine="Dim v As Object = rec.Get(k)";
_v = _rec.Get((Object)(_k));
 //BA.debugLineNum = 887;BA.debugLine="k = k.ToLowerCase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 888;BA.debugLine="nrec.Put(k, v)";
_nrec.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 890;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(nrec, Dou";
if (_doubles.getSize()>0) { 
_vue._makedouble /*String*/ (_nrec,_doubles);};
 //BA.debugLineNum = 891;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(nrec, I";
if (_integers.getSize()>0) { 
_vue._makeinteger /*String*/ (_nrec,_integers);};
 //BA.debugLineNum = 892;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(nrec, Strin";
if (_strings.getSize()>0) { 
_vue._maketrim /*String*/ (_nrec,_strings);};
 //BA.debugLineNum = 893;BA.debugLine="If Dates.Size > 0 Then vue.MakeDate(nrec, Dates)";
if (_dates.getSize()>0) { 
_vue._makedate /*String*/ (_nrec,_dates);};
 //BA.debugLineNum = 894;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(nrec, B";
if (_booleans.getSize()>0) { 
_vue._makeboolean /*String*/ (_nrec,_booleans);};
 //BA.debugLineNum = 895;BA.debugLine="Return nrec";
if (true) return _nrec;
 //BA.debugLineNum = 896;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newbutton(String _sname) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 825;BA.debugLine="Sub NewButton(sname As String) As VMInputControl";
 //BA.debugLineNum = 826;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 827;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 828;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 829;BA.debugLine="el.SetButton";
_el._setbutton /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 830;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 831;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newcheckbox(String _sname,String _slabel,Object _svalue,boolean _bprimary,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 563;BA.debugLine="Sub NewCheckBox(sname As String, slabel As String,";
 //BA.debugLineNum = 564;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 565;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 566;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 567;BA.debugLine="el.SetCheckBox";
_el._setcheckbox /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 568;BA.debugLine="el.Value = svalue";
_el._value /*String*/  = BA.ObjectToString(_svalue);
 //BA.debugLineNum = 569;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 570;BA.debugLine="el.IsPrimary = bPrimary";
_el._isprimary /*boolean*/  = _bprimary;
 //BA.debugLineNum = 571;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 572;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newcheckboxgroup(String _sname) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 555;BA.debugLine="Sub NewCheckBoxGroup(sname As String) As VMInputCo";
 //BA.debugLineNum = 556;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 557;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 558;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 559;BA.debugLine="el.SetCheckBoxGroup";
_el._setcheckboxgroup /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 560;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 561;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newchip(String _sname,String _stext,boolean _bclickable,boolean _bdeletable,String _sourcetable,String _sourcefield,String _displayfield) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 607;BA.debugLine="Sub NewChip(sname As String, sText As String, bCli";
 //BA.debugLineNum = 608;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 609;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 610;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 611;BA.debugLine="el.SetChip";
_el._setchip /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 612;BA.debugLine="el.Text = sText";
_el._text /*String*/  = _stext;
 //BA.debugLineNum = 613;BA.debugLine="el.Clickable = bClickable";
_el._clickable /*boolean*/  = _bclickable;
 //BA.debugLineNum = 614;BA.debugLine="el.Deletable = bDeletable";
_el._deletable /*boolean*/  = _bdeletable;
 //BA.debugLineNum = 615;BA.debugLine="If sourceTable <> Null Then el.sourceTable = sour";
if (_sourcetable!= null) { 
_el._sourcetable /*String*/  = _sourcetable;};
 //BA.debugLineNum = 616;BA.debugLine="If sourceField <> Null Then el.sourceField =sourc";
if (_sourcefield!= null) { 
_el._sourcefield /*String*/  = _sourcefield;};
 //BA.debugLineNum = 617;BA.debugLine="If displayField <> Null Then el.displayField = di";
if (_displayfield!= null) { 
_el._displayfield /*String*/  = _displayfield;};
 //BA.debugLineNum = 618;BA.debugLine="el.UseOptions = False";
_el._useoptions /*boolean*/  = __c.False;
 //BA.debugLineNum = 619;BA.debugLine="el.UseDataSource = True";
_el._usedatasource /*boolean*/  = __c.True;
 //BA.debugLineNum = 620;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 621;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newchips(String _sname,String _slabel,String _splaceholder,boolean _bstatic,boolean _brequired,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 623;BA.debugLine="Sub NewChips(sname As String, slabel As String, sp";
 //BA.debugLineNum = 624;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 625;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 626;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 627;BA.debugLine="el.SetChips";
_el._setchips /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 628;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 629;BA.debugLine="el.Required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 630;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 631;BA.debugLine="el.Static = bStatic";
_el._static /*boolean*/  = _bstatic;
 //BA.debugLineNum = 632;BA.debugLine="el.CheckDuplicates = True";
_el._checkduplicates /*boolean*/  = __c.True;
 //BA.debugLineNum = 633;BA.debugLine="el.helperText = sHelperText";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 634;BA.debugLine="el.errorText = sErrorText";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 635;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 636;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 637;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newdatepicker(String _sname,String _slabel,boolean _brequired,boolean _bimmediately,boolean _bopenonfocus,String _splaceholder,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 575;BA.debugLine="Sub NewDatePicker(sname As String, slabel As Strin";
 //BA.debugLineNum = 576;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 577;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 578;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 579;BA.debugLine="el.SetDatePicker";
_el._setdatepicker /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 580;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 581;BA.debugLine="el.Required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 582;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
 //BA.debugLineNum = 583;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 584;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 585;BA.debugLine="el.immediately = bImmediately";
_el._immediately /*boolean*/  = _bimmediately;
 //BA.debugLineNum = 586;BA.debugLine="el.openonfocus = bOpenOnFocus";
_el._openonfocus /*boolean*/  = _bopenonfocus;
 //BA.debugLineNum = 587;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 588;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newemail(String _sname,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 676;BA.debugLine="Sub NewEmail(sname As String, slabel As String, sp";
 //BA.debugLineNum = 677;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 678;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 679;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 680;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
 //BA.debugLineNum = 681;BA.debugLine="el.SetEmail";
_el._setemail /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 682;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 683;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 684;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 685;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
 //BA.debugLineNum = 686;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 687;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 688;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 689;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 690;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newfile(String _sname,String _slabel,String _splaceholder,boolean _brequired,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 778;BA.debugLine="Sub NewFile(sname As String, slabel As String, spl";
 //BA.debugLineNum = 779;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 780;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 781;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 782;BA.debugLine="el.SetEmail";
_el._setemail /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 783;BA.debugLine="el.typeOf = \"file\"";
_el._typeof /*String*/  = "file";
 //BA.debugLineNum = 784;BA.debugLine="el.errorText = sErrorText";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 785;BA.debugLine="el.helperText = shelperText";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 786;BA.debugLine="el.Required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 787;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 788;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 789;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 790;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 791;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newicon(String _sname,String _sicon,String _ssize) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 815;BA.debugLine="Sub NewIcon(sname As String, sIcon As String, sSiz";
 //BA.debugLineNum = 816;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 817;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 818;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 819;BA.debugLine="el.typeOf = \"icon\"";
_el._typeof /*String*/  = "icon";
 //BA.debugLineNum = 820;BA.debugLine="el.iconsize = sSize";
_el._iconsize /*String*/  = _ssize;
 //BA.debugLineNum = 821;BA.debugLine="el.IconName = sIcon";
_el._iconname /*String*/  = _sicon;
 //BA.debugLineNum = 822;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 823;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newiconbutton(String _sname) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 521;BA.debugLine="Sub NewIconButton(sname As String) As VMInputContr";
 //BA.debugLineNum = 522;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 523;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 524;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 525;BA.debugLine="el.SetButton";
_el._setbutton /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 526;BA.debugLine="el.SetIconButton(True)";
_el._seticonbutton /*b4j.example.vminputcontrol*/ (__c.True);
 //BA.debugLineNum = 527;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 528;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newimage(String _sname,String _sdefaultvalue,String _salt,String _swidth,String _sheight) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 793;BA.debugLine="Sub NewImage(sname As String, sdefaultValue As Str";
 //BA.debugLineNum = 794;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 795;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 796;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 797;BA.debugLine="el.typeOf = \"image\"";
_el._typeof /*String*/  = "image";
 //BA.debugLineNum = 798;BA.debugLine="el.Width = swidth";
_el._width /*String*/  = _swidth;
 //BA.debugLineNum = 799;BA.debugLine="el.Height = sheight";
_el._height /*String*/  = _sheight;
 //BA.debugLineNum = 800;BA.debugLine="el.defaultValue = sdefaultValue";
_el._defaultvalue /*Object*/  = (Object)(_sdefaultvalue);
 //BA.debugLineNum = 801;BA.debugLine="el.Alt = salt";
_el._alt /*String*/  = _salt;
 //BA.debugLineNum = 802;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newinfobox(String _sname,String _sboxtype,String _stext,String _sicon,String _siconcolor,String _siconbackgroundcolor,int _icount,int _istart,int _ifinish,int _iinterval,boolean _bsetcounter,int _ispeed,int _irefreshinterval,boolean _bhoverexpand,boolean _bhoverzoom) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 639;BA.debugLine="Sub NewInfoBox(sname As String, sBoxType As String";
 //BA.debugLineNum = 640;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 641;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 642;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 643;BA.debugLine="el.typeof = \"infobox\"";
_el._typeof /*String*/  = "infobox";
 //BA.debugLineNum = 644;BA.debugLine="el.fieldType = \"string\"";
_el._fieldtype /*String*/  = "string";
 //BA.debugLineNum = 645;BA.debugLine="el.bSetCounter = bSetCounter";
_el._bsetcounter /*boolean*/  = _bsetcounter;
 //BA.debugLineNum = 646;BA.debugLine="el.Start = iStart";
_el._start /*String*/  = BA.NumberToString(_istart);
 //BA.debugLineNum = 647;BA.debugLine="el.Finish = iFinish";
_el._finish /*String*/  = BA.NumberToString(_ifinish);
 //BA.debugLineNum = 648;BA.debugLine="el.Speed = iSpeed";
_el._speed /*String*/  = BA.NumberToString(_ispeed);
 //BA.debugLineNum = 649;BA.debugLine="el.RefreshInterval = iRefreshInterval";
_el._refreshinterval /*String*/  = BA.NumberToString(_irefreshinterval);
 //BA.debugLineNum = 650;BA.debugLine="el.Count = iCount";
_el._count /*String*/  = BA.NumberToString(_icount);
 //BA.debugLineNum = 651;BA.debugLine="el.IconName = sIcon";
_el._iconname /*String*/  = _sicon;
 //BA.debugLineNum = 652;BA.debugLine="el.IconColor = sIconColor";
_el._iconcolor /*String*/  = _siconcolor;
 //BA.debugLineNum = 653;BA.debugLine="el.IconBackgroundColor = sIconBackgroundColor";
_el._iconbackgroundcolor /*String*/  = _siconbackgroundcolor;
 //BA.debugLineNum = 654;BA.debugLine="el.Text = sText";
_el._text /*String*/  = _stext;
 //BA.debugLineNum = 655;BA.debugLine="el.HoverExpandEffect = bHoverExpand";
_el._hoverexpandeffect /*boolean*/  = _bhoverexpand;
 //BA.debugLineNum = 656;BA.debugLine="el.HoverZoomEffect = bHoverZoom";
_el._hoverzoomeffect /*boolean*/  = _bhoverzoom;
 //BA.debugLineNum = 657;BA.debugLine="el.BoxType = sBoxType";
_el._boxtype /*String*/  = _sboxtype;
 //BA.debugLineNum = 658;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newlabel(String _sname,String _ssize,String _stext) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 805;BA.debugLine="Sub NewLabel(sname As String, sSize As String, sTe";
 //BA.debugLineNum = 806;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 807;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 808;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 809;BA.debugLine="el.typeOf = \"label\"";
_el._typeof /*String*/  = "label";
 //BA.debugLineNum = 810;BA.debugLine="el.Tag = sSize";
_el._tag /*String*/  = _ssize;
 //BA.debugLineNum = 811;BA.debugLine="el.Text = sText";
_el._text /*String*/  = _stext;
 //BA.debugLineNum = 812;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 813;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newlist(String _sname) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 833;BA.debugLine="Sub NewList(sname As String) As VMInputControl";
 //BA.debugLineNum = 834;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 835;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 836;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 837;BA.debugLine="el.SetList";
_el._setlist /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 838;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 839;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newnumber(String _sname,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 744;BA.debugLine="Sub NewNumber(sname As String, slabel As String, s";
 //BA.debugLineNum = 745;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 746;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 747;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 748;BA.debugLine="el.typeOf = \"number\"";
_el._typeof /*String*/  = "number";
 //BA.debugLineNum = 749;BA.debugLine="el.fieldType = \"int\"";
_el._fieldtype /*String*/  = "int";
 //BA.debugLineNum = 750;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 751;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 752;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 753;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
 //BA.debugLineNum = 754;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 755;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 756;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 757;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 758;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newpassword(String _sname,String _slabel,String _splaceholder,boolean _brequired,boolean _btoggle,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 761;BA.debugLine="Sub NewPassword(sname As String, slabel As String,";
 //BA.debugLineNum = 762;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 763;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 764;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 765;BA.debugLine="el.SetPassword";
_el._setpassword /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 766;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 767;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 768;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 769;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
 //BA.debugLineNum = 770;BA.debugLine="el.MaxLength = iMaxLen";
_el._maxlength /*Object*/  = (Object)(_imaxlen);
 //BA.debugLineNum = 771;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 772;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 773;BA.debugLine="el.TogglePassword = bToggle";
_el._togglepassword /*boolean*/  = _btoggle;
 //BA.debugLineNum = 774;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 775;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 776;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newradiogroup(String _sname,String _slabel,Object _svalue,anywheresoftware.b4a.objects.collections.Map _options,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 543;BA.debugLine="Sub NewRadioGroup(sname As String, slabel As Strin";
 //BA.debugLineNum = 544;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 545;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 546;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 547;BA.debugLine="el.SetRadioGroup";
_el._setradiogroup /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 548;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 549;BA.debugLine="el.Value = svalue";
_el._value /*String*/  = BA.ObjectToString(_svalue);
 //BA.debugLineNum = 550;BA.debugLine="el.options = options";
_el._options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
 //BA.debugLineNum = 551;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 552;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 553;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newselect(String _sname,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,String _sourcetable,String _sourcefield,String _displayfield,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 841;BA.debugLine="Sub NewSelect(sname As String, sLabel As String, b";
 //BA.debugLineNum = 842;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 843;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 844;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 845;BA.debugLine="el.SetSelect";
_el._setselect /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 846;BA.debugLine="el.label = sLabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 847;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 848;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 849;BA.debugLine="el.placeholder = sPlaceHolder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 850;BA.debugLine="el.helperText = sHelperText";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 851;BA.debugLine="el.errorText = sErrorText";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 852;BA.debugLine="el.Dense = True";
_el._dense /*boolean*/  = __c.True;
 //BA.debugLineNum = 853;BA.debugLine="el.useoptions = False";
_el._useoptions /*boolean*/  = __c.False;
 //BA.debugLineNum = 854;BA.debugLine="el.sourceTable = sourceTable";
_el._sourcetable /*String*/  = _sourcetable;
 //BA.debugLineNum = 855;BA.debugLine="el.SourceField = sourceField";
_el._sourcefield /*String*/  = _sourcefield;
 //BA.debugLineNum = 856;BA.debugLine="el.displayField = displayField";
_el._displayfield /*String*/  = _displayfield;
 //BA.debugLineNum = 857;BA.debugLine="el.multiple = bMultiple";
_el._multiple /*boolean*/  = _bmultiple;
 //BA.debugLineNum = 858;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newslider(String _sname,String _slabel,int _iminvalue,String _imaxvalue,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 662;BA.debugLine="Sub NewSlider(sname As String, slabel As String, i";
 //BA.debugLineNum = 663;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 664;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 665;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 666;BA.debugLine="el.SetSlider";
_el._setslider /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 667;BA.debugLine="el.minvalue = iMinValue";
_el._minvalue /*int*/  = _iminvalue;
 //BA.debugLineNum = 668;BA.debugLine="el.maxvalue = iMaxValue";
_el._maxvalue /*int*/  = (int)(Double.parseDouble(_imaxvalue));
 //BA.debugLineNum = 669;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 670;BA.debugLine="el.ThumbLabel = True";
_el._thumblabel /*boolean*/  = __c.True;
 //BA.debugLineNum = 671;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 672;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newswitch(String _sname,String _slabel,Object _svalue,boolean _bprimary,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 531;BA.debugLine="Sub NewSwitch(sname As String, slabel As String, s";
 //BA.debugLineNum = 532;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 533;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 534;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 535;BA.debugLine="el.SetSwitch";
_el._setswitch /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 536;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 537;BA.debugLine="el.Value = svalue";
_el._value /*String*/  = BA.ObjectToString(_svalue);
 //BA.debugLineNum = 538;BA.debugLine="el.IsPrimary = bPrimary";
_el._isprimary /*boolean*/  = _bprimary;
 //BA.debugLineNum = 539;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 540;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newtel(String _sname,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 729;BA.debugLine="Sub NewTel(sname As String, slabel As String, spla";
 //BA.debugLineNum = 730;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 731;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 732;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 733;BA.debugLine="el.typeOf = \"text\"";
_el._typeof /*String*/  = "text";
 //BA.debugLineNum = 734;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 735;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 736;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 737;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
 //BA.debugLineNum = 738;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 739;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 740;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 741;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 742;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newtext(String _sname,String _slabel,String _splaceholder,boolean _brequired,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 692;BA.debugLine="Sub NewText(sname As String, slabel As String, spl";
 //BA.debugLineNum = 693;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 694;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 695;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 696;BA.debugLine="el.typeOf = \"text\"";
_el._typeof /*String*/  = "text";
 //BA.debugLineNum = 697;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
 //BA.debugLineNum = 698;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 699;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 700;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 701;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
 //BA.debugLineNum = 702;BA.debugLine="If iMaxLen > 0 Then el.MaxLength = iMaxLen";
if (_imaxlen>0) { 
_el._maxlength /*Object*/  = (Object)(_imaxlen);};
 //BA.debugLineNum = 703;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 704;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 705;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 706;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newtextarea(String _sname,String _slabel,String _splaceholder,boolean _brequired,boolean _bautogrow,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 710;BA.debugLine="Sub NewTextArea(sname As String, slabel As String,";
 //BA.debugLineNum = 711;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 712;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 713;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 714;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
 //BA.debugLineNum = 715;BA.debugLine="el.SetTextArea";
_el._settextarea /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 716;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 717;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 718;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 719;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
 //BA.debugLineNum = 720;BA.debugLine="If iMaxLen > 0 Then el.MaxLength = iMaxLen";
if (_imaxlen>0) { 
_el._maxlength /*Object*/  = (Object)(_imaxlen);};
 //BA.debugLineNum = 721;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 722;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 723;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 724;BA.debugLine="el.AutoGrow = bAutoGrow";
_el._autogrow /*boolean*/  = _bautogrow;
 //BA.debugLineNum = 725;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 726;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newtimepicker(String _sname,String _slabel,boolean _brequired,String _splaceholder,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
b4j.example.vminputcontrol _el = null;
 //BA.debugLineNum = 590;BA.debugLine="Sub NewTimePicker(sname As String, slabel As Strin";
 //BA.debugLineNum = 592;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
 //BA.debugLineNum = 593;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
 //BA.debugLineNum = 594;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (ba,_sname);
 //BA.debugLineNum = 595;BA.debugLine="el.SetTimePicker";
_el._settimepicker /*b4j.example.vminputcontrol*/ ();
 //BA.debugLineNum = 596;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
 //BA.debugLineNum = 597;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
 //BA.debugLineNum = 598;BA.debugLine="el.Required = bRequired";
_el._required /*boolean*/  = _brequired;
 //BA.debugLineNum = 599;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
 //BA.debugLineNum = 600;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
 //BA.debugLineNum = 601;BA.debugLine="el.errorText = serrortext";
_el._errortext /*String*/  = _serrortext;
 //BA.debugLineNum = 602;BA.debugLine="el.defaultValue = \"12:00\"";
_el._defaultvalue /*Object*/  = (Object)("12:00");
 //BA.debugLineNum = 603;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
 //BA.debugLineNum = 604;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 605;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmcontainer _p) throws Exception{
 //BA.debugLineNum = 432;BA.debugLine="Sub Pop(p As VMContainer)";
 //BA.debugLineNum = 433;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmcontainer*/ (_tostring());
 //BA.debugLineNum = 434;BA.debugLine="End Sub";
return "";
}
public String  _prepare() throws Exception{
String _k = "";
String _sk = "";
 //BA.debugLineNum = 441;BA.debugLine="private Sub Prepare";
 //BA.debugLineNum = 442;BA.debugLine="For Each k As String In Dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = _dates;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 443;BA.debugLine="Dim sk As String = vue.GetState(k,\"\")";
_sk = BA.ObjectToString(_vue._getstate /*Object*/ (_k,(Object)("")));
 //BA.debugLineNum = 444;BA.debugLine="sk = vue.Date2YYYYMMDD(sk)";
_sk = _vue._date2yyyymmdd /*String*/ ((Object)(_sk));
 //BA.debugLineNum = 445;BA.debugLine="vue.SetStateSingle(k, sk)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_k,(Object)(_sk));
 }
};
 //BA.debugLineNum = 447;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _removeattr(String _sname) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="public Sub RemoveAttr(sName As String) As VMContai";
 //BA.debugLineNum = 35;BA.debugLine="Container.RemoveAttr(sName)";
_container._removeattr /*b4j.example.vmelement*/ (_sname);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _removerequired(String _r) throws Exception{
 //BA.debugLineNum = 878;BA.debugLine="Sub RemoveRequired(r As String) As VMContainer";
 //BA.debugLineNum = 879;BA.debugLine="Required.Remove(r)";
_required.Remove((Object)(_r));
 //BA.debugLineNum = 880;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 881;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 428;BA.debugLine="Sub Render";
 //BA.debugLineNum = 429;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 430;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 417;BA.debugLine="Sub SetAttr(attr As Map) As VMContainer";
 //BA.debugLineNum = 418;BA.debugLine="Container.SetAttr(attr)";
_container._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setbackgroundcolor(Object _p) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetBackgroundColor(p As Object) As VMContainer";
 //BA.debugLineNum = 149;BA.debugLine="Container.SetBackgroundColor(p)";
_container._setbackgroundcolor /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setbackgroundimage(String _url) throws Exception{
 //BA.debugLineNum = 199;BA.debugLine="Sub SetBackgroundImage(url As String) As VMContain";
 //BA.debugLineNum = 200;BA.debugLine="Container.SetBackgroundImage(url)";
_container._setbackgroundimage /*b4j.example.vmelement*/ (_url);
 //BA.debugLineNum = 201;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 202;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setborder(String _width,String _color,String _bstyle) throws Exception{
 //BA.debugLineNum = 368;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
 //BA.debugLineNum = 369;BA.debugLine="Container.SetBorder(width, color, bstyle)";
_container._setborder /*b4j.example.vmelement*/ (_width,_color,_bstyle);
 //BA.debugLineNum = 370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setborderrc(int _rowpos,int _colpos,String _width,String _color,String _bstyle) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetBorderRC(rowPos As Int, colPos As Int, widt";
 //BA.debugLineNum = 84;BA.debugLine="Grid.SetBorder(rowPos, colPos, width, color, bsty";
_grid._setborder /*b4j.example.vmgrid*/ (_rowpos,_colpos,_width,_color,_bstyle);
 //BA.debugLineNum = 85;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setclass(int _rowpos,int _colpos,String _classname) throws Exception{
 //BA.debugLineNum = 78;BA.debugLine="Sub SetClass(rowPos As Int, colPos As Int, classNa";
 //BA.debugLineNum = 79;BA.debugLine="Grid.SetClass(rowPos, colPos, className)";
_grid._setclass /*String*/ (_rowpos,_colpos,_classname);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcolor(Object _c) throws Exception{
 //BA.debugLineNum = 138;BA.debugLine="Sub SetColor(c As Object) As VMContainer";
 //BA.debugLineNum = 139;BA.debugLine="Container.SetColor(c)";
_container._setcolor /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcursormove() throws Exception{
 //BA.debugLineNum = 374;BA.debugLine="Sub SetCursorMove As VMContainer";
 //BA.debugLineNum = 375;BA.debugLine="Container.SetCursorMove";
_container._setcursormove /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 376;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcursorpointer() throws Exception{
 //BA.debugLineNum = 379;BA.debugLine="Sub SetCursorPointer As VMContainer";
 //BA.debugLineNum = 380;BA.debugLine="Container.SetCursorPointer";
_container._setcursorpointer /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 381;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 382;BA.debugLine="End Sub";
return null;
}
public String  _setdefaults() throws Exception{
String _k = "";
 //BA.debugLineNum = 865;BA.debugLine="Sub SetDefaults";
 //BA.debugLineNum = 866;BA.debugLine="vue.SetState(Defaults)";
_vue._setstate /*b4j.example.bananovue*/ (_defaults);
 //BA.debugLineNum = 867;BA.debugLine="vue.SetState(visibility)";
_vue._setstate /*b4j.example.bananovue*/ (_visibility);
 //BA.debugLineNum = 868;BA.debugLine="For Each k As String In Required.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _required.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 869;BA.debugLine="HideError(k)";
_hideerror(_k);
 }
};
 //BA.debugLineNum = 871;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 189;BA.debugLine="Sub SetDisabled(b As Boolean) As VMContainer";
 //BA.debugLineNum = 190;BA.debugLine="vue.SetStateSingle($\"${ID}disabled\"$,b)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"disabled"),(Object)(_b));
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdraggable(boolean _b) throws Exception{
 //BA.debugLineNum = 389;BA.debugLine="Sub SetDraggable(b As Boolean) As VMContainer";
 //BA.debugLineNum = 390;BA.debugLine="Container.SetDraggable(b)";
_container._setdraggable /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 391;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 392;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdroppable(boolean _b) throws Exception{
 //BA.debugLineNum = 394;BA.debugLine="Sub SetDroppable(b As Boolean) As VMContainer";
 //BA.debugLineNum = 395;BA.debugLine="Container.SetDroppable(b)";
_container._setdroppable /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 396;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 362;BA.debugLine="Sub SetElevation(e As Int) As VMContainer";
 //BA.debugLineNum = 363;BA.debugLine="Container.SetElevation(e)";
_container._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 364;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 365;BA.debugLine="End Sub";
return null;
}
public String  _setempty() throws Exception{
 //BA.debugLineNum = 861;BA.debugLine="Sub SetEmpty";
 //BA.debugLineNum = 862;BA.debugLine="vue.SetStateListValues(Fields)";
_vue._setstatelistvalues /*b4j.example.bananovue*/ (_fields);
 //BA.debugLineNum = 863;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 405;BA.debugLine="Sub SetHeight(h As String) As VMContainer";
 //BA.debugLineNum = 406;BA.debugLine="Container.SetHeight(h)";
_container._setheight /*b4j.example.vmelement*/ (_h);
 //BA.debugLineNum = 407;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 408;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setid(String _n,boolean _bind) throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub SetID(n As String, bind As Boolean) As VMConta";
 //BA.debugLineNum = 109;BA.debugLine="Container.SetID(n, bind)";
_container._setid /*b4j.example.vmelement*/ (_n,_bind);
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setkey(Object _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VMCont";
 //BA.debugLineNum = 114;BA.debugLine="Container.SetKey(k, bind)";
_container._setkey /*b4j.example.vmelement*/ (_k,_bind);
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmarginall(Object _p) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetMarginAll(p As Object) As VMContainer";
 //BA.debugLineNum = 154;BA.debugLine="Container.setmarginall(p)";
_container._setmarginall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmargins(Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
 //BA.debugLineNum = 357;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
 //BA.debugLineNum = 358;BA.debugLine="Container.SetMargins(mt, mb, ml, mr)";
_container._setmargins /*b4j.example.vmelement*/ (_mt,_mb,_ml,_mr);
 //BA.debugLineNum = 359;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 360;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setmarginsrc(int _rowpos,int _colpos,Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetMarginsRC(rowPos As Int, colPos As Int, mt";
 //BA.debugLineNum = 89;BA.debugLine="Grid.SetMargins(rowPos, colPos, mt, mb, ml, mr)";
_grid._setmargins /*b4j.example.vmgrid*/ (_rowpos,_colpos,_mt,_mb,_ml,_mr);
 //BA.debugLineNum = 90;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmaxheight(String _mw) throws Exception{
 //BA.debugLineNum = 168;BA.debugLine="Sub SetMaxHeight(mw As String) As VMContainer";
 //BA.debugLineNum = 169;BA.debugLine="Container.SetMaxHeight(mw)";
_container._setmaxheight /*b4j.example.vmelement*/ (_mw);
 //BA.debugLineNum = 170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmaxwidth(String _mw) throws Exception{
 //BA.debugLineNum = 163;BA.debugLine="Sub SetMaxWidth(mw As String) As VMContainer";
 //BA.debugLineNum = 164;BA.debugLine="Container.SetMaxWidth(mw)";
_container._setmaxwidth /*b4j.example.vmelement*/ (_mw);
 //BA.debugLineNum = 165;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setnotselectible() throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetNotSelectible As VMContainer";
 //BA.debugLineNum = 99;BA.debugLine="Container.SetNotSelectible";
_container._setnotselectible /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 100;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setonclick(String _methodname) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetOnClick(methodName As String) As VMContaine";
 //BA.debugLineNum = 210;BA.debugLine="Container.SetOnClick(module, methodName)";
_container._setonclick /*b4j.example.vmelement*/ (_module,_methodname);
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setonclickrc(int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 214;BA.debugLine="Sub SetOnClickRC(rowpos As Int, colpos As Int) As";
 //BA.debugLineNum = 215;BA.debugLine="Grid.setonclick(rowpos,colpos)";
_grid._setonclick /*b4j.example.vmgrid*/ (_rowpos,_colpos);
 //BA.debugLineNum = 216;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 217;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setondrop(String _methodname) throws Exception{
 //BA.debugLineNum = 337;BA.debugLine="Sub SetOnDrop(methodName As String) As VMContainer";
 //BA.debugLineNum = 338;BA.debugLine="Container.setondrop(module, methodName)";
_container._setondrop /*b4j.example.vmelement*/ (_module,_methodname);
 //BA.debugLineNum = 339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setonmouseout(String _methodname) throws Exception{
 //BA.debugLineNum = 342;BA.debugLine="Sub SetOnMouseOut(methodName As String) As VMConta";
 //BA.debugLineNum = 343;BA.debugLine="Container.SetOnMouseOut(module, methodName)";
_container._setonmouseout /*b4j.example.vmelement*/ (_module,_methodname);
 //BA.debugLineNum = 344;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 345;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setonmouseover(String _methodname) throws Exception{
 //BA.debugLineNum = 347;BA.debugLine="Sub SetOnMouseOver(methodName As String) As VMCont";
 //BA.debugLineNum = 348;BA.debugLine="Container.SetOnMouseOver(module, methodName)";
_container._setonmouseover /*b4j.example.vmelement*/ (_module,_methodname);
 //BA.debugLineNum = 349;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 350;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setpadding(Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
 //BA.debugLineNum = 352;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
 //BA.debugLineNum = 353;BA.debugLine="Container.SetPadding(pt,pb,pl, pr)";
_container._setpadding /*b4j.example.vmelement*/ (_pt,_pb,_pl,_pr);
 //BA.debugLineNum = 354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setpaddingall(Object _p) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetPaddingAll(p As Object) As VMContainer";
 //BA.debugLineNum = 159;BA.debugLine="Container.SetPaddingAll(p)";
_container._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setpaddingrc(int _rowpos,int _colpos,Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetPaddingRC(rowPos As Int, colPos As Int, pt";
 //BA.debugLineNum = 94;BA.debugLine="Grid.SetPadding(rowPos,colPos, pt,pb,pl,pr)";
_grid._setpadding /*b4j.example.vmgrid*/ (_rowpos,_colpos,_pt,_pb,_pl,_pr);
 //BA.debugLineNum = 95;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setref(String _varref) throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub SetRef(varRef As String) As VMContainer";
 //BA.debugLineNum = 104;BA.debugLine="Container.SetRef(varRef)";
_container._setref /*b4j.example.vmelement*/ (_varref);
 //BA.debugLineNum = 105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setscrollbar(boolean _b) throws Exception{
 //BA.debugLineNum = 194;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMContainer";
 //BA.debugLineNum = 195;BA.debugLine="Container.SetScrollBar(b)";
_container._setscrollbar /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetStyle(m As Map) As VMContainer";
 //BA.debugLineNum = 144;BA.debugLine="Container.SetStyle(m)";
_container._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setstylerc(int _rowpos,int _colpos,String _prop,String _value) throws Exception{
 //BA.debugLineNum = 242;BA.debugLine="Sub SetStyleRC(rowPos As Int, colPos As Int, prop";
 //BA.debugLineNum = 243;BA.debugLine="Grid.setstyle(rowPos, colPos, prop, value)";
_grid._setstyle /*b4j.example.vmgrid*/ (_rowpos,_colpos,_prop,_value);
 //BA.debugLineNum = 244;BA.debugLine="Return Grid";
if (true) return _grid;
 //BA.debugLineNum = 245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settext(String _t) throws Exception{
 //BA.debugLineNum = 204;BA.debugLine="Sub SetText(t As String) As VMContainer";
 //BA.debugLineNum = 205;BA.debugLine="Container.SetText(t)";
_container._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 206;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 207;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settextaligncenter() throws Exception{
 //BA.debugLineNum = 384;BA.debugLine="Sub SetTextAlignCenter As VMContainer";
 //BA.debugLineNum = 385;BA.debugLine="Container.SetTextAlignCenter";
_container._settextaligncenter /*b4j.example.vmelement*/ ();
 //BA.debugLineNum = 386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetVIf(vif As String) As VMContainer";
 //BA.debugLineNum = 119;BA.debugLine="Container.SetVIf(vif)";
_container._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvshow(String _vshow) throws Exception{
 //BA.debugLineNum = 410;BA.debugLine="Sub SetVShow(vshow As String) As VMContainer";
 //BA.debugLineNum = 411;BA.debugLine="Container.SetVShow(vshow)";
_container._setvshow /*b4j.example.vmelement*/ (_vshow);
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 400;BA.debugLine="Sub SetWidth(w As String) As VMContainer";
 //BA.debugLineNum = 401;BA.debugLine="Container.SetWidth(w)";
_container._setwidth /*b4j.example.vmelement*/ (_w);
 //BA.debugLineNum = 402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
 //BA.debugLineNum = 403;BA.debugLine="End Sub";
return null;
}
public String  _show() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub Show";
 //BA.debugLineNum = 186;BA.debugLine="vue.SetStateSingle($\"${ID}show\"$, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_id))+"show"),(Object)(__c.True));
 //BA.debugLineNum = 187;BA.debugLine="End Sub";
return "";
}
public String  _showerror(String _elid) throws Exception{
 //BA.debugLineNum = 482;BA.debugLine="Sub ShowError(elID As String)";
 //BA.debugLineNum = 483;BA.debugLine="vue.SetStateSingle($\"${elID}error\"$, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ ((""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.True));
 //BA.debugLineNum = 484;BA.debugLine="End Sub";
return "";
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 422;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 423;BA.debugLine="BuildControls";
_buildcontrols();
 //BA.debugLineNum = 424;BA.debugLine="Grid.Pop(Container)";
_grid._pop /*String*/ (_container);
 //BA.debugLineNum = 425;BA.debugLine="Return Container.tostring";
if (true) return _container._tostring /*String*/ ();
 //BA.debugLineNum = 426;BA.debugLine="End Sub";
return "";
}
public boolean  _validate(anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
int _iv = 0;
String _k = "";
String _v = "";
 //BA.debugLineNum = 459;BA.debugLine="Sub Validate(rec As Map) As Boolean";
 //BA.debugLineNum = 460;BA.debugLine="Dim iv As Int = 0";
_iv = (int) (0);
 //BA.debugLineNum = 461;BA.debugLine="For Each k As String In Required.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _required.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 462;BA.debugLine="If rec.ContainsKey(k) Then";
if (_rec.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 463;BA.debugLine="Dim v As String = rec.GetDefault(k,\"\")";
_v = BA.ObjectToString(_rec.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 464;BA.debugLine="v = vue.CStr(v)";
_v = _vue._cstr /*String*/ ((Object)(_v));
 //BA.debugLineNum = 465;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 466;BA.debugLine="If v = \"\" Then";
if ((_v).equals("")) { 
 //BA.debugLineNum = 467;BA.debugLine="Log(\"Validate: \" & k)";
__c.Log("Validate: "+_k);
 //BA.debugLineNum = 468;BA.debugLine="iv = iv + 1";
_iv = (int) (_iv+1);
 //BA.debugLineNum = 469;BA.debugLine="ShowError(k)";
_showerror(_k);
 }else {
 //BA.debugLineNum = 471;BA.debugLine="HideError(k)";
_hideerror(_k);
 };
 };
 }
};
 //BA.debugLineNum = 475;BA.debugLine="If iv = 0 Then";
if (_iv==0) { 
 //BA.debugLineNum = 476;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
 //BA.debugLineNum = 478;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 480;BA.debugLine="End Sub";
return false;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
