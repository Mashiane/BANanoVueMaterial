package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcontainer extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmcontainer", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _setdefaults(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setdefaults", true))
	 {return ((String) Debug.delegate(ba, "setdefaults", null));}
String _k = "";
RDebugUtils.currentLine=100139008;
 //BA.debugLineNum = 100139008;BA.debugLine="Sub SetDefaults";
RDebugUtils.currentLine=100139009;
 //BA.debugLineNum = 100139009;BA.debugLine="vue.SetState(Defaults)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=100139010;
 //BA.debugLineNum = 100139010;BA.debugLine="vue.SetState(visibility)";
__ref._vue /*b4j.example.bananovue*/ ._setstate /*b4j.example.bananovue*/ (null,__ref._visibility /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=100139011;
 //BA.debugLineNum = 100139011;BA.debugLine="For Each k As String In Required.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._required /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=100139012;
 //BA.debugLineNum = 100139012;BA.debugLine="HideError(k)";
__ref._hideerror /*String*/ (null,_k);
 }
};
RDebugUtils.currentLine=100139014;
 //BA.debugLineNum = 100139014;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _setelevation(b4j.example.vmcontainer __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=96862208;
 //BA.debugLineNum = 96862208;BA.debugLine="Sub SetElevation(e As Int) As VMContainer";
RDebugUtils.currentLine=96862209;
 //BA.debugLineNum = 96862209;BA.debugLine="Container.SetElevation(e)";
__ref._container /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=96862210;
 //BA.debugLineNum = 96862210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=96862211;
 //BA.debugLineNum = 96862211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setpaddingall(b4j.example.vmcontainer __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setpaddingall", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setpaddingall", new Object[] {_p}));}
RDebugUtils.currentLine=94175232;
 //BA.debugLineNum = 94175232;BA.debugLine="Sub SetPaddingAll(p As Object) As VMContainer";
RDebugUtils.currentLine=94175233;
 //BA.debugLineNum = 94175233;BA.debugLine="Container.SetPaddingAll(p)";
__ref._container /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=94175234;
 //BA.debugLineNum = 94175234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94175235;
 //BA.debugLineNum = 94175235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newh1(b4j.example.vmcontainer __ref,String _sname,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newh1", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newh1", new Object[] {_sname,_stext}));}
RDebugUtils.currentLine=266993664;
 //BA.debugLineNum = 266993664;BA.debugLine="Sub NewH1(sname As String, sText As String) As VMI";
RDebugUtils.currentLine=266993665;
 //BA.debugLineNum = 266993665;BA.debugLine="Return NewLabel(sname, \"h1\", sText)";
if (true) return __ref._newlabel /*b4j.example.vminputcontrol*/ (null,_sname,"h1",_stext);
RDebugUtils.currentLine=266993666;
 //BA.debugLineNum = 266993666;BA.debugLine="End Sub";
return null;
}
public String  _addcontrol(b4j.example.vmcontainer __ref,b4j.example.vminputcontrol _ctl,String _r,String _c,String _os,String _om,String _ol,String _oxl,String _s,String _m,String _l,String _xl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcontrol", true))
	 {return ((String) Debug.delegate(ba, "addcontrol", new Object[] {_ctl,_r,_c,_os,_om,_ol,_oxl,_s,_m,_l,_xl}));}
String _srow = "";
String _scell = "";
String _rckey = "";
b4j.example.vmcontainer._eachrow _row = null;
RDebugUtils.currentLine=100401152;
 //BA.debugLineNum = 100401152;BA.debugLine="Sub AddControl(ctl As VMInputControl, r As String,";
RDebugUtils.currentLine=100401153;
 //BA.debugLineNum = 100401153;BA.debugLine="ctl.Row = r";
_ctl._row /*String*/  = _r;
RDebugUtils.currentLine=100401154;
 //BA.debugLineNum = 100401154;BA.debugLine="ctl.Cell = c";
_ctl._cell /*String*/  = _c;
RDebugUtils.currentLine=100401155;
 //BA.debugLineNum = 100401155;BA.debugLine="ctl.SizeSmall = s";
_ctl._sizesmall /*String*/  = _s;
RDebugUtils.currentLine=100401156;
 //BA.debugLineNum = 100401156;BA.debugLine="ctl.SizeMedium = m";
_ctl._sizemedium /*String*/  = _m;
RDebugUtils.currentLine=100401157;
 //BA.debugLineNum = 100401157;BA.debugLine="ctl.SizeLarge = l";
_ctl._sizelarge /*String*/  = _l;
RDebugUtils.currentLine=100401158;
 //BA.debugLineNum = 100401158;BA.debugLine="ctl.SizeXLarge = xl";
_ctl._sizexlarge /*String*/  = _xl;
RDebugUtils.currentLine=100401159;
 //BA.debugLineNum = 100401159;BA.debugLine="ctl.OffsetSmall = os";
_ctl._offsetsmall /*String*/  = _os;
RDebugUtils.currentLine=100401160;
 //BA.debugLineNum = 100401160;BA.debugLine="ctl.OffsetMedium = om";
_ctl._offsetmedium /*String*/  = _om;
RDebugUtils.currentLine=100401161;
 //BA.debugLineNum = 100401161;BA.debugLine="ctl.OffsetLarge = ol";
_ctl._offsetlarge /*String*/  = _ol;
RDebugUtils.currentLine=100401162;
 //BA.debugLineNum = 100401162;BA.debugLine="ctl.OffsetXLarge = oxl";
_ctl._offsetxlarge /*String*/  = _oxl;
RDebugUtils.currentLine=100401163;
 //BA.debugLineNum = 100401163;BA.debugLine="Controls.add(ctl)";
__ref._controls /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_ctl));
RDebugUtils.currentLine=100401165;
 //BA.debugLineNum = 100401165;BA.debugLine="If r > TotalRows Then";
if ((double)(Double.parseDouble(_r))>__ref._totalrows /*int*/ ) { 
RDebugUtils.currentLine=100401166;
 //BA.debugLineNum = 100401166;BA.debugLine="TotalRows = r";
__ref._totalrows /*int*/  = (int)(Double.parseDouble(_r));
 };
RDebugUtils.currentLine=100401169;
 //BA.debugLineNum = 100401169;BA.debugLine="Dim sRow As String = vue.PadRight(r,2,\"0\")";
_srow = __ref._vue /*b4j.example.bananovue*/ ._padright /*String*/ (null,_r,(int) (2),"0");
RDebugUtils.currentLine=100401170;
 //BA.debugLineNum = 100401170;BA.debugLine="Dim sCell As String = vue.PadRight(c,2,\"0\")";
_scell = __ref._vue /*b4j.example.bananovue*/ ._padright /*String*/ (null,_c,(int) (2),"0");
RDebugUtils.currentLine=100401171;
 //BA.debugLineNum = 100401171;BA.debugLine="Dim rcKey As String = $\"${sRow}.${sCell}\"$";
_rckey = (""+__c.SmartStringFormatter("",(Object)(_srow))+"."+__c.SmartStringFormatter("",(Object)(_scell))+"");
RDebugUtils.currentLine=100401173;
 //BA.debugLineNum = 100401173;BA.debugLine="sortitM.Put(rcKey,ctl)";
__ref._sortitm /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_rckey),(Object)(_ctl));
RDebugUtils.currentLine=100401174;
 //BA.debugLineNum = 100401174;BA.debugLine="If rows.ContainsKey(sRow) = False Then";
if (__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_srow))==__c.False) { 
RDebugUtils.currentLine=100401175;
 //BA.debugLineNum = 100401175;BA.debugLine="Dim row As EachRow";
_row = new b4j.example.vmcontainer._eachrow();
RDebugUtils.currentLine=100401176;
 //BA.debugLineNum = 100401176;BA.debugLine="row.Initialize";
_row.Initialize();
RDebugUtils.currentLine=100401177;
 //BA.debugLineNum = 100401177;BA.debugLine="rows.Put(sRow, row)";
__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_srow),(Object)(_row));
 };
RDebugUtils.currentLine=100401179;
 //BA.debugLineNum = 100401179;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminputcontrol  _newtext(b4j.example.vmcontainer __ref,String _sname,String _slabel,String _splaceholder,boolean _brequired,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newtext", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newtext", new Object[] {_sname,_slabel,_splaceholder,_brequired,_sicon,_imaxlen,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99287040;
 //BA.debugLineNum = 99287040;BA.debugLine="Sub NewText(sname As String, slabel As String, spl";
RDebugUtils.currentLine=99287041;
 //BA.debugLineNum = 99287041;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99287042;
 //BA.debugLineNum = 99287042;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99287043;
 //BA.debugLineNum = 99287043;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99287044;
 //BA.debugLineNum = 99287044;BA.debugLine="el.typeOf = \"text\"";
_el._typeof /*String*/  = "text";
RDebugUtils.currentLine=99287045;
 //BA.debugLineNum = 99287045;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
RDebugUtils.currentLine=99287046;
 //BA.debugLineNum = 99287046;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=99287047;
 //BA.debugLineNum = 99287047;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=99287048;
 //BA.debugLineNum = 99287048;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=99287049;
 //BA.debugLineNum = 99287049;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
RDebugUtils.currentLine=99287050;
 //BA.debugLineNum = 99287050;BA.debugLine="If iMaxLen > 0 Then el.MaxLength = iMaxLen";
if (_imaxlen>0) { 
_el._maxlength /*Object*/  = (Object)(_imaxlen);};
RDebugUtils.currentLine=99287051;
 //BA.debugLineNum = 99287051;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=99287052;
 //BA.debugLineNum = 99287052;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=99287053;
 //BA.debugLineNum = 99287053;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=99287054;
 //BA.debugLineNum = 99287054;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99287055;
 //BA.debugLineNum = 99287055;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newdatepicker(b4j.example.vmcontainer __ref,String _sname,String _slabel,boolean _brequired,boolean _bimmediately,boolean _bopenonfocus,String _splaceholder,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newdatepicker", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newdatepicker", new Object[] {_sname,_slabel,_brequired,_bimmediately,_bopenonfocus,_splaceholder,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=98828288;
 //BA.debugLineNum = 98828288;BA.debugLine="Sub NewDatePicker(sname As String, slabel As Strin";
RDebugUtils.currentLine=98828289;
 //BA.debugLineNum = 98828289;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=98828290;
 //BA.debugLineNum = 98828290;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=98828291;
 //BA.debugLineNum = 98828291;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=98828292;
 //BA.debugLineNum = 98828292;BA.debugLine="el.SetDatePicker";
_el._setdatepicker /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=98828293;
 //BA.debugLineNum = 98828293;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=98828294;
 //BA.debugLineNum = 98828294;BA.debugLine="el.Required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=98828295;
 //BA.debugLineNum = 98828295;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
RDebugUtils.currentLine=98828296;
 //BA.debugLineNum = 98828296;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=98828297;
 //BA.debugLineNum = 98828297;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=98828298;
 //BA.debugLineNum = 98828298;BA.debugLine="el.immediately = bImmediately";
_el._immediately /*boolean*/  = _bimmediately;
RDebugUtils.currentLine=98828299;
 //BA.debugLineNum = 98828299;BA.debugLine="el.openonfocus = bOpenOnFocus";
_el._openonfocus /*boolean*/  = _bopenonfocus;
RDebugUtils.currentLine=98828300;
 //BA.debugLineNum = 98828300;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98828301;
 //BA.debugLineNum = 98828301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newselect(b4j.example.vmcontainer __ref,String _sname,String _slabel,boolean _brequired,boolean _bmultiple,String _splaceholder,String _sourcetable,String _sourcefield,String _displayfield,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newselect", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newselect", new Object[] {_sname,_slabel,_brequired,_bmultiple,_splaceholder,_sourcetable,_sourcefield,_displayfield,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=100007936;
 //BA.debugLineNum = 100007936;BA.debugLine="Sub NewSelect(sname As String, sLabel As String, b";
RDebugUtils.currentLine=100007937;
 //BA.debugLineNum = 100007937;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=100007938;
 //BA.debugLineNum = 100007938;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=100007939;
 //BA.debugLineNum = 100007939;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=100007940;
 //BA.debugLineNum = 100007940;BA.debugLine="el.SetSelect";
_el._setselect /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=100007941;
 //BA.debugLineNum = 100007941;BA.debugLine="el.label = sLabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=100007942;
 //BA.debugLineNum = 100007942;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=100007943;
 //BA.debugLineNum = 100007943;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=100007944;
 //BA.debugLineNum = 100007944;BA.debugLine="el.placeholder = sPlaceHolder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=100007945;
 //BA.debugLineNum = 100007945;BA.debugLine="el.helperText = sHelperText";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=100007946;
 //BA.debugLineNum = 100007946;BA.debugLine="el.errorText = sErrorText";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=100007947;
 //BA.debugLineNum = 100007947;BA.debugLine="el.Dense = True";
_el._dense /*boolean*/  = __c.True;
RDebugUtils.currentLine=100007948;
 //BA.debugLineNum = 100007948;BA.debugLine="el.useoptions = False";
_el._useoptions /*boolean*/  = __c.False;
RDebugUtils.currentLine=100007949;
 //BA.debugLineNum = 100007949;BA.debugLine="el.sourceTable = sourceTable";
_el._sourcetable /*String*/  = _sourcetable;
RDebugUtils.currentLine=100007950;
 //BA.debugLineNum = 100007950;BA.debugLine="el.SourceField = sourceField";
_el._sourcefield /*String*/  = _sourcefield;
RDebugUtils.currentLine=100007951;
 //BA.debugLineNum = 100007951;BA.debugLine="el.displayField = displayField";
_el._displayfield /*String*/  = _displayfield;
RDebugUtils.currentLine=100007952;
 //BA.debugLineNum = 100007952;BA.debugLine="el.multiple = bMultiple";
_el._multiple /*boolean*/  = _bmultiple;
RDebugUtils.currentLine=100007953;
 //BA.debugLineNum = 100007953;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=100007954;
 //BA.debugLineNum = 100007954;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newtel(b4j.example.vmcontainer __ref,String _sname,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newtel", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newtel", new Object[] {_sname,_slabel,_splaceholder,_brequired,_sicon,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99418112;
 //BA.debugLineNum = 99418112;BA.debugLine="Sub NewTel(sname As String, slabel As String, spla";
RDebugUtils.currentLine=99418113;
 //BA.debugLineNum = 99418113;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99418114;
 //BA.debugLineNum = 99418114;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99418115;
 //BA.debugLineNum = 99418115;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99418116;
 //BA.debugLineNum = 99418116;BA.debugLine="el.typeOf = \"text\"";
_el._typeof /*String*/  = "text";
RDebugUtils.currentLine=99418117;
 //BA.debugLineNum = 99418117;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=99418118;
 //BA.debugLineNum = 99418118;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=99418119;
 //BA.debugLineNum = 99418119;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=99418120;
 //BA.debugLineNum = 99418120;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
RDebugUtils.currentLine=99418121;
 //BA.debugLineNum = 99418121;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=99418122;
 //BA.debugLineNum = 99418122;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=99418123;
 //BA.debugLineNum = 99418123;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=99418124;
 //BA.debugLineNum = 99418124;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99418125;
 //BA.debugLineNum = 99418125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newtextarea(b4j.example.vmcontainer __ref,String _sname,String _slabel,String _splaceholder,boolean _brequired,boolean _bautogrow,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newtextarea", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newtextarea", new Object[] {_sname,_slabel,_splaceholder,_brequired,_bautogrow,_sicon,_imaxlen,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99352576;
 //BA.debugLineNum = 99352576;BA.debugLine="Sub NewTextArea(sname As String, slabel As String,";
RDebugUtils.currentLine=99352577;
 //BA.debugLineNum = 99352577;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99352578;
 //BA.debugLineNum = 99352578;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99352579;
 //BA.debugLineNum = 99352579;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99352580;
 //BA.debugLineNum = 99352580;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
RDebugUtils.currentLine=99352581;
 //BA.debugLineNum = 99352581;BA.debugLine="el.SetTextArea";
_el._settextarea /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=99352582;
 //BA.debugLineNum = 99352582;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=99352583;
 //BA.debugLineNum = 99352583;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=99352584;
 //BA.debugLineNum = 99352584;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=99352585;
 //BA.debugLineNum = 99352585;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
RDebugUtils.currentLine=99352586;
 //BA.debugLineNum = 99352586;BA.debugLine="If iMaxLen > 0 Then el.MaxLength = iMaxLen";
if (_imaxlen>0) { 
_el._maxlength /*Object*/  = (Object)(_imaxlen);};
RDebugUtils.currentLine=99352587;
 //BA.debugLineNum = 99352587;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=99352588;
 //BA.debugLineNum = 99352588;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=99352589;
 //BA.debugLineNum = 99352589;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=99352590;
 //BA.debugLineNum = 99352590;BA.debugLine="el.AutoGrow = bAutoGrow";
_el._autogrow /*boolean*/  = _bautogrow;
RDebugUtils.currentLine=99352591;
 //BA.debugLineNum = 99352591;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99352592;
 //BA.debugLineNum = 99352592;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newp(b4j.example.vmcontainer __ref,String _sname,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newp", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newp", new Object[] {_sname,_stext}));}
RDebugUtils.currentLine=267386880;
 //BA.debugLineNum = 267386880;BA.debugLine="Sub NewP(sname As String, sText As String) As VMIn";
RDebugUtils.currentLine=267386881;
 //BA.debugLineNum = 267386881;BA.debugLine="Return NewLabel(sname, \"p\", sText)";
if (true) return __ref._newlabel /*b4j.example.vminputcontrol*/ (null,_sname,"p",_stext);
RDebugUtils.currentLine=267386882;
 //BA.debugLineNum = 267386882;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newbutton(b4j.example.vmcontainer __ref,String _sname,String _slabel,String _sicon,boolean _braised,boolean _bprimary,boolean _baccent,boolean _bfitwidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newbutton", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newbutton", new Object[] {_sname,_slabel,_sicon,_braised,_bprimary,_baccent,_bfitwidth}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99876864;
 //BA.debugLineNum = 99876864;BA.debugLine="Sub NewButton(sname As String, sLabel As String, s";
RDebugUtils.currentLine=99876865;
 //BA.debugLineNum = 99876865;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99876866;
 //BA.debugLineNum = 99876866;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99876867;
 //BA.debugLineNum = 99876867;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99876868;
 //BA.debugLineNum = 99876868;BA.debugLine="el.SetButton";
_el._setbutton /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=99876869;
 //BA.debugLineNum = 99876869;BA.debugLine="el.SetLabel(sLabel)";
_el._setlabel /*b4j.example.vminputcontrol*/ (null,_slabel);
RDebugUtils.currentLine=99876870;
 //BA.debugLineNum = 99876870;BA.debugLine="el.SetButtonTypeRegular";
_el._setbuttontyperegular /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=99876871;
 //BA.debugLineNum = 99876871;BA.debugLine="el.SetRaised(bRaised)";
_el._setraised /*b4j.example.vminputcontrol*/ (null,_braised);
RDebugUtils.currentLine=99876872;
 //BA.debugLineNum = 99876872;BA.debugLine="If bPrimary Then el.SetPrimary(bPrimary)";
if (_bprimary) { 
_el._setprimary /*b4j.example.vminputcontrol*/ (null,_bprimary);};
RDebugUtils.currentLine=99876873;
 //BA.debugLineNum = 99876873;BA.debugLine="If bAccent Then el.SetAccent(bAccent)";
if (_baccent) { 
_el._setaccent /*b4j.example.vminputcontrol*/ (null,_baccent);};
RDebugUtils.currentLine=99876874;
 //BA.debugLineNum = 99876874;BA.debugLine="If bFitWidth Then el.SetFitWidth(True)";
if (_bfitwidth) { 
_el._setfitwidth /*b4j.example.vminputcontrol*/ (null,__c.True);};
RDebugUtils.currentLine=99876875;
 //BA.debugLineNum = 99876875;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99876876;
 //BA.debugLineNum = 99876876;BA.debugLine="End Sub";
return null;
}
public String  _addexclusion(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.List _them) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addexclusion", true))
	 {return ((String) Debug.delegate(ba, "addexclusion", new Object[] {_them}));}
String _k = "";
RDebugUtils.currentLine=93061120;
 //BA.debugLineNum = 93061120;BA.debugLine="Sub AddExclusion(them As List)";
RDebugUtils.currentLine=93061121;
 //BA.debugLineNum = 93061121;BA.debugLine="For Each k As String In them";
{
final anywheresoftware.b4a.BA.IterableList group1 = _them;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=93061122;
 //BA.debugLineNum = 93061122;BA.debugLine="Exclusions.Add(k)";
__ref._exclusions /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_k));
 }
};
RDebugUtils.currentLine=93061124;
 //BA.debugLineNum = 93061124;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getdata(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "getdata", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getdata", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=97910784;
 //BA.debugLineNum = 97910784;BA.debugLine="Sub GetData As Map";
RDebugUtils.currentLine=97910785;
 //BA.debugLineNum = 97910785;BA.debugLine="Prepare";
__ref._prepare /*String*/ (null);
RDebugUtils.currentLine=97910786;
 //BA.debugLineNum = 97910786;BA.debugLine="Dim m As Map = CreateMap()";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m = __c.createMap(new Object[] {});
RDebugUtils.currentLine=97910787;
 //BA.debugLineNum = 97910787;BA.debugLine="m = vue.GetStates(Fields)";
_m = __ref._vue /*b4j.example.bananovue*/ ._getstates /*anywheresoftware.b4a.objects.collections.Map*/ (null,__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=97910788;
 //BA.debugLineNum = 97910788;BA.debugLine="m = LinkRecordTypes(m)";
_m = __ref._linkrecordtypes /*anywheresoftware.b4a.objects.collections.Map*/ (null,_m);
RDebugUtils.currentLine=97910789;
 //BA.debugLineNum = 97910789;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=97910790;
 //BA.debugLineNum = 97910790;BA.debugLine="End Sub";
return null;
}
public String  _hide(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "hide", true))
	 {return ((String) Debug.delegate(ba, "hide", null));}
RDebugUtils.currentLine=94502912;
 //BA.debugLineNum = 94502912;BA.debugLine="Sub Hide";
RDebugUtils.currentLine=94502913;
 //BA.debugLineNum = 94502913;BA.debugLine="vue.SetStateSingle($\"${ID}show\"$, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"show"),(Object)(__c.False));
RDebugUtils.currentLine=94502914;
 //BA.debugLineNum = 94502914;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmgrid  _addrows(b4j.example.vmcontainer __ref,int _irows) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addrows", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addrows", new Object[] {_irows}));}
RDebugUtils.currentLine=95354880;
 //BA.debugLineNum = 95354880;BA.debugLine="Sub AddRows(iRows As Int) As VMGrid";
RDebugUtils.currentLine=95354881;
 //BA.debugLineNum = 95354881;BA.debugLine="Grid.AddRows(iRows)";
__ref._grid /*b4j.example.vmgrid*/ ._addrows /*b4j.example.vmgrid*/ (null,_irows);
RDebugUtils.currentLine=95354882;
 //BA.debugLineNum = 95354882;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95354883;
 //BA.debugLineNum = 95354883;BA.debugLine="End Sub";
return null;
}
public String  _addcomponent(b4j.example.vmcontainer __ref,int _rowpos,int _colpos,String _elhtml) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcomponent", true))
	 {return ((String) Debug.delegate(ba, "addcomponent", new Object[] {_rowpos,_colpos,_elhtml}));}
RDebugUtils.currentLine=95223808;
 //BA.debugLineNum = 95223808;BA.debugLine="Sub AddComponent(rowPos As Int, colPos As Int, elH";
RDebugUtils.currentLine=95223809;
 //BA.debugLineNum = 95223809;BA.debugLine="Grid.AddComponent(rowPos, colPos, elHTML)";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,_rowpos,_colpos,_elhtml);
RDebugUtils.currentLine=95223810;
 //BA.debugLineNum = 95223810;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=97583104;
 //BA.debugLineNum = 97583104;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=97583105;
 //BA.debugLineNum = 97583105;BA.debugLine="BuildControls";
__ref._buildcontrols /*String*/ (null);
RDebugUtils.currentLine=97583106;
 //BA.debugLineNum = 97583106;BA.debugLine="Grid.Pop(Container)";
__ref._grid /*b4j.example.vmgrid*/ ._pop /*String*/ (null,__ref._container /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=97583107;
 //BA.debugLineNum = 97583107;BA.debugLine="Return Container.tostring";
if (true) return __ref._container /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=97583108;
 //BA.debugLineNum = 97583108;BA.debugLine="End Sub";
return "";
}
public String  _addcontrols(b4j.example.vmcontainer __ref,b4j.example.vminputcontrol _ctl,String _r,String _c,String _s,String _m,String _l,String _xl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcontrols", true))
	 {return ((String) Debug.delegate(ba, "addcontrols", new Object[] {_ctl,_r,_c,_s,_m,_l,_xl}));}
RDebugUtils.currentLine=273219584;
 //BA.debugLineNum = 273219584;BA.debugLine="Sub AddControlS(ctl As VMInputControl, r As String";
RDebugUtils.currentLine=273219585;
 //BA.debugLineNum = 273219585;BA.debugLine="AddControl(ctl, r, c, 0,0,0,0,s,m,l,xl)";
__ref._addcontrol /*String*/ (null,_ctl,_r,_c,BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),BA.NumberToString(0),_s,_m,_l,_xl);
RDebugUtils.currentLine=273219586;
 //BA.debugLineNum = 273219586;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _initialize(b4j.example.vmcontainer __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=92995584;
 //BA.debugLineNum = 92995584;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=92995585;
 //BA.debugLineNum = 92995585;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=92995586;
 //BA.debugLineNum = 92995586;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=92995587;
 //BA.debugLineNum = 92995587;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=92995588;
 //BA.debugLineNum = 92995588;BA.debugLine="Container.Initialize(vue, ID).SetTag(\"div\")";
__ref._container /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=92995589;
 //BA.debugLineNum = 92995589;BA.debugLine="Container.RemoveAttr(\":required\")";
__ref._container /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=92995590;
 //BA.debugLineNum = 92995590;BA.debugLine="Grid.Initialize(vue, $\"${ID}grid\"$,module)";
__ref._grid /*b4j.example.vmgrid*/ ._initialize /*b4j.example.vmgrid*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"grid"),__ref._module /*Object*/ );
RDebugUtils.currentLine=92995591;
 //BA.debugLineNum = 92995591;BA.debugLine="Grid.Grid.RemoveAttr(\":required\")";
__ref._grid /*b4j.example.vmgrid*/ ._grid /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=92995593;
 //BA.debugLineNum = 92995593;BA.debugLine="TotalRows = 0";
__ref._totalrows /*int*/  = (int) (0);
RDebugUtils.currentLine=92995594;
 //BA.debugLineNum = 92995594;BA.debugLine="rowStyles.Initialize";
__ref._rowstyles /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=92995595;
 //BA.debugLineNum = 92995595;BA.debugLine="sortitM.Initialize";
__ref._sortitm /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=92995596;
 //BA.debugLineNum = 92995596;BA.debugLine="sortItL.Initialize";
__ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995597;
 //BA.debugLineNum = 92995597;BA.debugLine="rows.initialize";
__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=92995598;
 //BA.debugLineNum = 92995598;BA.debugLine="Fields.Initialize";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995599;
 //BA.debugLineNum = 92995599;BA.debugLine="Controls.Initialize";
__ref._controls /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995600;
 //BA.debugLineNum = 92995600;BA.debugLine="Strings.Initialize";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995601;
 //BA.debugLineNum = 92995601;BA.debugLine="Integers.Initialize";
__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995602;
 //BA.debugLineNum = 92995602;BA.debugLine="Booleans.Initialize";
__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995603;
 //BA.debugLineNum = 92995603;BA.debugLine="Defaults.Initialize";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=92995604;
 //BA.debugLineNum = 92995604;BA.debugLine="Required.Initialize";
__ref._required /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=92995605;
 //BA.debugLineNum = 92995605;BA.debugLine="Doubles.Initialize";
__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995606;
 //BA.debugLineNum = 92995606;BA.debugLine="Dates.initialize";
__ref._dates /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995607;
 //BA.debugLineNum = 92995607;BA.debugLine="cells.Initialize";
__ref._cells /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=92995608;
 //BA.debugLineNum = 92995608;BA.debugLine="visibility.Initialize";
__ref._visibility /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=92995609;
 //BA.debugLineNum = 92995609;BA.debugLine="Exclusions.Initialize";
__ref._exclusions /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995610;
 //BA.debugLineNum = 92995610;BA.debugLine="Mode = \"A\"";
__ref._mode /*String*/  = "A";
RDebugUtils.currentLine=92995611;
 //BA.debugLineNum = 92995611;BA.debugLine="sortitM.Initialize";
__ref._sortitm /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=92995612;
 //BA.debugLineNum = 92995612;BA.debugLine="sortItL.Initialize";
__ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=92995613;
 //BA.debugLineNum = 92995613;BA.debugLine="DesignMode = False";
__ref._designmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=92995614;
 //BA.debugLineNum = 92995614;BA.debugLine="HasInfoBox = False";
__ref._hasinfobox /*boolean*/  = __c.False;
RDebugUtils.currentLine=92995615;
 //BA.debugLineNum = 92995615;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=92995616;
 //BA.debugLineNum = 92995616;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addbooleans(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addbooleans", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "addbooleans", new Object[] {_i}));}
String _s = "";
RDebugUtils.currentLine=100597760;
 //BA.debugLineNum = 100597760;BA.debugLine="Sub AddBooleans(i As List) As VMContainer";
RDebugUtils.currentLine=100597761;
 //BA.debugLineNum = 100597761;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=100597762;
 //BA.debugLineNum = 100597762;BA.debugLine="Booleans.Add(s)";
__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=100597764;
 //BA.debugLineNum = 100597764;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=100597765;
 //BA.debugLineNum = 100597765;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addbr(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addbr", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "addbr", null));}
RDebugUtils.currentLine=93782016;
 //BA.debugLineNum = 93782016;BA.debugLine="Sub AddBR As VMContainer";
RDebugUtils.currentLine=93782017;
 //BA.debugLineNum = 93782017;BA.debugLine="Container.addbr";
__ref._container /*b4j.example.vmelement*/ ._addbr /*String*/ (null);
RDebugUtils.currentLine=93782018;
 //BA.debugLineNum = 93782018;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93782019;
 //BA.debugLineNum = 93782019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addclass(b4j.example.vmcontainer __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=93847552;
 //BA.debugLineNum = 93847552;BA.debugLine="Sub AddClass(c As String) As VMContainer";
RDebugUtils.currentLine=93847553;
 //BA.debugLineNum = 93847553;BA.debugLine="Container.AddClass(c)";
__ref._container /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=93847554;
 //BA.debugLineNum = 93847554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93847555;
 //BA.debugLineNum = 93847555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumnosmp(b4j.example.vmcontainer __ref,int _icolumns,String _ioffsetsmall,String _ioffsetmedium,String _ioffsetlarge,String _ioffsetxlarge,String _isizesmall,String _isizemedium,String _isizelarge,String _isizexlarge,String _sthemename,String _svisibility,String _sclassname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumnosmp", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumnosmp", new Object[] {_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_sthemename,_svisibility,_sclassname}));}
RDebugUtils.currentLine=95158272;
 //BA.debugLineNum = 95158272;BA.debugLine="Sub AddColumnOSMP(iColumns As Int, iOffsetSmall As";
RDebugUtils.currentLine=95158275;
 //BA.debugLineNum = 95158275;BA.debugLine="Grid.AddColumnOSMP(iColumns, iOffsetSmall, iOffse";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumnosmp /*b4j.example.vmgrid*/ (null,_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_sthemename,_svisibility,_sclassname);
RDebugUtils.currentLine=95158276;
 //BA.debugLineNum = 95158276;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95158277;
 //BA.debugLineNum = 95158277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns(b4j.example.vmcontainer __ref,int _icolumns,String _sizesmall,String _sizemedium,String _sizelarge,String _sizexlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns", new Object[] {_icolumns,_sizesmall,_sizemedium,_sizelarge,_sizexlarge}));}
RDebugUtils.currentLine=96468992;
 //BA.debugLineNum = 96468992;BA.debugLine="Sub AddColumns(iColumns As Int, SizeSmall As Strin";
RDebugUtils.currentLine=96468993;
 //BA.debugLineNum = 96468993;BA.debugLine="Grid.AddColumns(iColumns,SizeSmall, SizeMedium, S";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns /*b4j.example.vmgrid*/ (null,_icolumns,_sizesmall,_sizemedium,_sizelarge,_sizexlarge);
RDebugUtils.currentLine=96468994;
 //BA.debugLineNum = 96468994;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=96468995;
 //BA.debugLineNum = 96468995;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns10p2(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns10p2", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns10p2", null));}
RDebugUtils.currentLine=96075776;
 //BA.debugLineNum = 96075776;BA.debugLine="Sub AddColumns10p2 As VMGrid";
RDebugUtils.currentLine=96075777;
 //BA.debugLineNum = 96075777;BA.debugLine="Grid.AddColumns10p2";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns10p2 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=96075778;
 //BA.debugLineNum = 96075778;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=96075779;
 //BA.debugLineNum = 96075779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns11p1(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns11p1", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns11p1", null));}
RDebugUtils.currentLine=95944704;
 //BA.debugLineNum = 95944704;BA.debugLine="Sub AddColumns11p1 As VMGrid";
RDebugUtils.currentLine=95944705;
 //BA.debugLineNum = 95944705;BA.debugLine="Grid.AddColumns11p1";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns11p1 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=95944706;
 //BA.debugLineNum = 95944706;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95944707;
 //BA.debugLineNum = 95944707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns12(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns12", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns12", null));}
RDebugUtils.currentLine=96403456;
 //BA.debugLineNum = 96403456;BA.debugLine="Sub AddColumns12 As VMGrid";
RDebugUtils.currentLine=96403457;
 //BA.debugLineNum = 96403457;BA.debugLine="Grid.AddColumns12";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns12 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=96403458;
 //BA.debugLineNum = 96403458;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=96403459;
 //BA.debugLineNum = 96403459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns12x1(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns12x1", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns12x1", null));}
RDebugUtils.currentLine=95682560;
 //BA.debugLineNum = 95682560;BA.debugLine="Sub AddColumns12x1 As VMGrid";
RDebugUtils.currentLine=95682561;
 //BA.debugLineNum = 95682561;BA.debugLine="AddColumns12x1";
__ref._addcolumns12x1 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=95682562;
 //BA.debugLineNum = 95682562;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95682563;
 //BA.debugLineNum = 95682563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns1p11(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns1p11", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns1p11", null));}
RDebugUtils.currentLine=95879168;
 //BA.debugLineNum = 95879168;BA.debugLine="Sub AddColumns1p11 As VMGrid";
RDebugUtils.currentLine=95879169;
 //BA.debugLineNum = 95879169;BA.debugLine="Grid.AddColumns1p11";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns1p11 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=95879170;
 //BA.debugLineNum = 95879170;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95879171;
 //BA.debugLineNum = 95879171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns2p10(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns2p10", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns2p10", null));}
RDebugUtils.currentLine=96010240;
 //BA.debugLineNum = 96010240;BA.debugLine="Sub AddColumns2p10 As VMGrid";
RDebugUtils.currentLine=96010241;
 //BA.debugLineNum = 96010241;BA.debugLine="Grid.AddColumns2p10";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns2p10 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=96010242;
 //BA.debugLineNum = 96010242;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=96010243;
 //BA.debugLineNum = 96010243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns2x6(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns2x6", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns2x6", null));}
RDebugUtils.currentLine=95551488;
 //BA.debugLineNum = 95551488;BA.debugLine="Sub AddColumns2x6 As VMGrid";
RDebugUtils.currentLine=95551489;
 //BA.debugLineNum = 95551489;BA.debugLine="Grid.AddColumns2x6";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns2x6 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=95551490;
 //BA.debugLineNum = 95551490;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95551491;
 //BA.debugLineNum = 95551491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns3p9(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns3p9", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns3p9", null));}
RDebugUtils.currentLine=96141312;
 //BA.debugLineNum = 96141312;BA.debugLine="Sub AddColumns3p9 As VMGrid";
RDebugUtils.currentLine=96141313;
 //BA.debugLineNum = 96141313;BA.debugLine="Grid.AddColumns3p9";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns3p9 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=96141314;
 //BA.debugLineNum = 96141314;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=96141315;
 //BA.debugLineNum = 96141315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns3x4(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns3x4", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns3x4", null));}
RDebugUtils.currentLine=95420416;
 //BA.debugLineNum = 95420416;BA.debugLine="Sub AddColumns3x4 As VMGrid";
RDebugUtils.currentLine=95420417;
 //BA.debugLineNum = 95420417;BA.debugLine="Grid.AddColumns3x4";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns3x4 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=95420418;
 //BA.debugLineNum = 95420418;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95420419;
 //BA.debugLineNum = 95420419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns4p8(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns4p8", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns4p8", null));}
RDebugUtils.currentLine=95813632;
 //BA.debugLineNum = 95813632;BA.debugLine="Sub AddColumns4p8 As VMGrid";
RDebugUtils.currentLine=95813633;
 //BA.debugLineNum = 95813633;BA.debugLine="Grid.AddColumns4p8";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns4p8 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=95813634;
 //BA.debugLineNum = 95813634;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95813635;
 //BA.debugLineNum = 95813635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns4x3(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns4x3", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns4x3", null));}
RDebugUtils.currentLine=95485952;
 //BA.debugLineNum = 95485952;BA.debugLine="Sub AddColumns4x3 As VMGrid";
RDebugUtils.currentLine=95485953;
 //BA.debugLineNum = 95485953;BA.debugLine="Grid.AddColumns4x3";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns4x3 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=95485954;
 //BA.debugLineNum = 95485954;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95485955;
 //BA.debugLineNum = 95485955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns5p7(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns5p7", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns5p7", null));}
RDebugUtils.currentLine=96337920;
 //BA.debugLineNum = 96337920;BA.debugLine="Sub AddColumns5p7 As VMGrid";
RDebugUtils.currentLine=96337921;
 //BA.debugLineNum = 96337921;BA.debugLine="Grid.AddColumns5p7";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns5p7 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=96337922;
 //BA.debugLineNum = 96337922;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=96337923;
 //BA.debugLineNum = 96337923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns6x2(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns6x2", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns6x2", null));}
RDebugUtils.currentLine=95617024;
 //BA.debugLineNum = 95617024;BA.debugLine="Sub AddColumns6x2 As VMGrid";
RDebugUtils.currentLine=95617025;
 //BA.debugLineNum = 95617025;BA.debugLine="AddColumns6x2";
__ref._addcolumns6x2 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=95617026;
 //BA.debugLineNum = 95617026;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95617027;
 //BA.debugLineNum = 95617027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns7p5(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns7p5", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns7p5", null));}
RDebugUtils.currentLine=96272384;
 //BA.debugLineNum = 96272384;BA.debugLine="Sub AddColumns7p5 As VMGrid";
RDebugUtils.currentLine=96272385;
 //BA.debugLineNum = 96272385;BA.debugLine="Grid.AddColumns7p5";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns7p5 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=96272386;
 //BA.debugLineNum = 96272386;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=96272387;
 //BA.debugLineNum = 96272387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns8p4(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns8p4", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns8p4", null));}
RDebugUtils.currentLine=95748096;
 //BA.debugLineNum = 95748096;BA.debugLine="Sub AddColumns8p4 As VMGrid";
RDebugUtils.currentLine=95748097;
 //BA.debugLineNum = 95748097;BA.debugLine="Grid.AddColumns8p4";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns8p4 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=95748098;
 //BA.debugLineNum = 95748098;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95748099;
 //BA.debugLineNum = 95748099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumns9p3(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumns9p3", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumns9p3", null));}
RDebugUtils.currentLine=96206848;
 //BA.debugLineNum = 96206848;BA.debugLine="Sub AddColumns9p3 As VMGrid";
RDebugUtils.currentLine=96206849;
 //BA.debugLineNum = 96206849;BA.debugLine="Grid.AddColumns9p3";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumns9p3 /*b4j.example.vmgrid*/ (null);
RDebugUtils.currentLine=96206850;
 //BA.debugLineNum = 96206850;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=96206851;
 //BA.debugLineNum = 96206851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addcolumnsosmpv(b4j.example.vmcontainer __ref,String _icolumns,String _ioffsetsmall,String _ioffsetmedium,String _ioffsetlarge,String _ioffsetxlarge,String _isizesmall,String _isizemedium,String _isizelarge,String _isizexlarge,String _ivisibility,String _stheme) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addcolumnsosmpv", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addcolumnsosmpv", new Object[] {_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_ivisibility,_stheme}));}
RDebugUtils.currentLine=95092736;
 //BA.debugLineNum = 95092736;BA.debugLine="Sub AddColumnsOSMPV(iColumns As String, iOffsetSma";
RDebugUtils.currentLine=95092739;
 //BA.debugLineNum = 95092739;BA.debugLine="Grid.AddColumnsOSMPV(iColumns, iOffsetSmall, iOff";
__ref._grid /*b4j.example.vmgrid*/ ._addcolumnsosmpv /*b4j.example.vmgrid*/ (null,_icolumns,_ioffsetsmall,_ioffsetmedium,_ioffsetlarge,_ioffsetxlarge,_isizesmall,_isizemedium,_isizelarge,_isizexlarge,_ivisibility,_stheme);
RDebugUtils.currentLine=95092740;
 //BA.debugLineNum = 95092740;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95092741;
 //BA.debugLineNum = 95092741;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _adddates(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "adddates", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "adddates", new Object[] {_i}));}
String _s = "";
RDebugUtils.currentLine=100663296;
 //BA.debugLineNum = 100663296;BA.debugLine="Sub AddDates(i As List) As VMContainer";
RDebugUtils.currentLine=100663297;
 //BA.debugLineNum = 100663297;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=100663298;
 //BA.debugLineNum = 100663298;BA.debugLine="Dates.Add(s)";
__ref._dates /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=100663300;
 //BA.debugLineNum = 100663300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=100663301;
 //BA.debugLineNum = 100663301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _adddoubles(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.List _d) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "adddoubles", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "adddoubles", new Object[] {_d}));}
String _s = "";
RDebugUtils.currentLine=100728832;
 //BA.debugLineNum = 100728832;BA.debugLine="Sub AddDoubles(d As List) As VMContainer";
RDebugUtils.currentLine=100728833;
 //BA.debugLineNum = 100728833;BA.debugLine="For Each s As String In d";
{
final anywheresoftware.b4a.BA.IterableList group1 = _d;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=100728834;
 //BA.debugLineNum = 100728834;BA.debugLine="Doubles.Add(s)";
__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=100728836;
 //BA.debugLineNum = 100728836;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=100728837;
 //BA.debugLineNum = 100728837;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addhr(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addhr", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "addhr", null));}
RDebugUtils.currentLine=93716480;
 //BA.debugLineNum = 93716480;BA.debugLine="Sub AddHR As VMContainer";
RDebugUtils.currentLine=93716481;
 //BA.debugLineNum = 93716481;BA.debugLine="Container.addhr";
__ref._container /*b4j.example.vmelement*/ ._addhr /*String*/ (null);
RDebugUtils.currentLine=93716482;
 //BA.debugLineNum = 93716482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93716483;
 //BA.debugLineNum = 93716483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addintegers(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addintegers", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "addintegers", new Object[] {_i}));}
String _s = "";
RDebugUtils.currentLine=100466688;
 //BA.debugLineNum = 100466688;BA.debugLine="Sub AddIntegers(i As List) As VMContainer";
RDebugUtils.currentLine=100466689;
 //BA.debugLineNum = 100466689;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=100466690;
 //BA.debugLineNum = 100466690;BA.debugLine="Integers.Add(s)";
__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=100466692;
 //BA.debugLineNum = 100466692;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=100466693;
 //BA.debugLineNum = 100466693;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addrequired(b4j.example.vmcontainer __ref,String _r) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addrequired", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "addrequired", new Object[] {_r}));}
RDebugUtils.currentLine=100204544;
 //BA.debugLineNum = 100204544;BA.debugLine="Sub AddRequired(r As String) As VMContainer";
RDebugUtils.currentLine=100204545;
 //BA.debugLineNum = 100204545;BA.debugLine="Required.put(r,r)";
__ref._required /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_r),(Object)(_r));
RDebugUtils.currentLine=100204546;
 //BA.debugLineNum = 100204546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=100204547;
 //BA.debugLineNum = 100204547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _addrow(b4j.example.vmcontainer __ref,int _irows,String _svisibility,String _sthemename,String _sclassname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addrow", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "addrow", new Object[] {_irows,_svisibility,_sthemename,_sclassname}));}
RDebugUtils.currentLine=95027200;
 //BA.debugLineNum = 95027200;BA.debugLine="Sub AddRow(iRows As Int, sVisibility As String, sT";
RDebugUtils.currentLine=95027201;
 //BA.debugLineNum = 95027201;BA.debugLine="Grid.AddRow(iRows, sVisibility, sThemeName,sClass";
__ref._grid /*b4j.example.vmgrid*/ ._addrow /*b4j.example.vmgrid*/ (null,_irows,_svisibility,_sthemename,_sclassname);
RDebugUtils.currentLine=95027202;
 //BA.debugLineNum = 95027202;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95027203;
 //BA.debugLineNum = 95027203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _addstrings(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.List _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addstrings", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "addstrings", new Object[] {_i}));}
String _s = "";
RDebugUtils.currentLine=100532224;
 //BA.debugLineNum = 100532224;BA.debugLine="Sub AddStrings(i As List) As VMContainer";
RDebugUtils.currentLine=100532225;
 //BA.debugLineNum = 100532225;BA.debugLine="For Each s As String In i";
{
final anywheresoftware.b4a.BA.IterableList group1 = _i;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=100532226;
 //BA.debugLineNum = 100532226;BA.debugLine="Strings.Add(s)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_s));
 }
};
RDebugUtils.currentLine=100532228;
 //BA.debugLineNum = 100532228;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=100532229;
 //BA.debugLineNum = 100532229;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=97779712;
 //BA.debugLineNum = 97779712;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=97779713;
 //BA.debugLineNum = 97779713;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=97779714;
 //BA.debugLineNum = 97779714;BA.debugLine="End Sub";
return "";
}
public String  _buildcontrols(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "buildcontrols", true))
	 {return ((String) Debug.delegate(ba, "buildcontrols", null));}
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
RDebugUtils.currentLine=100794368;
 //BA.debugLineNum = 100794368;BA.debugLine="private Sub BuildControls";
RDebugUtils.currentLine=100794369;
 //BA.debugLineNum = 100794369;BA.debugLine="Dim showKey As String";
_showkey = "";
RDebugUtils.currentLine=100794370;
 //BA.debugLineNum = 100794370;BA.debugLine="Dim disKey As String";
_diskey = "";
RDebugUtils.currentLine=100794371;
 //BA.debugLineNum = 100794371;BA.debugLine="Dim enaKey As String";
_enakey = "";
RDebugUtils.currentLine=100794372;
 //BA.debugLineNum = 100794372;BA.debugLine="Dim errKey As String";
_errkey = "";
RDebugUtils.currentLine=100794373;
 //BA.debugLineNum = 100794373;BA.debugLine="Dim isarray As Boolean";
_isarray = false;
RDebugUtils.currentLine=100794375;
 //BA.debugLineNum = 100794375;BA.debugLine="For Each cnt As VMInputControl In Controls";
{
final anywheresoftware.b4a.BA.IterableList group6 = __ref._controls /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_cnt = (b4j.example.vminputcontrol)(group6.Get(index6));
RDebugUtils.currentLine=100794376;
 //BA.debugLineNum = 100794376;BA.debugLine="If cnt.Exclude = True Then Exclusions.Add(cnt.na";
if (_cnt._exclude /*boolean*/ ==__c.True) { 
__ref._exclusions /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cnt._name /*String*/ ));};
RDebugUtils.currentLine=100794378;
 //BA.debugLineNum = 100794378;BA.debugLine="Dim idxpos As Int = Exclusions.IndexOf(cnt.name)";
_idxpos = __ref._exclusions /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_cnt._name /*String*/ ));
RDebugUtils.currentLine=100794379;
 //BA.debugLineNum = 100794379;BA.debugLine="If idxpos = -1 Then";
if (_idxpos==-1) { 
RDebugUtils.currentLine=100794380;
 //BA.debugLineNum = 100794380;BA.debugLine="Select Case cnt.typeOf";
switch (BA.switchObjectToInt(_cnt._typeof /*String*/ ,"button","list")) {
case 0: 
case 1: {
RDebugUtils.currentLine=100794382;
 //BA.debugLineNum = 100794382;BA.debugLine="cnt.fieldType = \"\"";
_cnt._fieldtype /*String*/  = "";
RDebugUtils.currentLine=100794383;
 //BA.debugLineNum = 100794383;BA.debugLine="cnt.Required = False";
_cnt._required /*boolean*/  = __c.False;
 break; }
default: {
RDebugUtils.currentLine=100794385;
 //BA.debugLineNum = 100794385;BA.debugLine="Fields.Add(cnt.name)";
__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cnt._name /*String*/ ));
RDebugUtils.currentLine=100794386;
 //BA.debugLineNum = 100794386;BA.debugLine="Defaults.Put(cnt.name, cnt.defaultValue)";
__ref._defaults /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_cnt._name /*String*/ ),_cnt._defaultvalue /*Object*/ );
 break; }
}
;
RDebugUtils.currentLine=100794388;
 //BA.debugLineNum = 100794388;BA.debugLine="If cnt.required Then";
if (_cnt._required /*boolean*/ ) { 
RDebugUtils.currentLine=100794389;
 //BA.debugLineNum = 100794389;BA.debugLine="Required.put(cnt.name,cnt.name)";
__ref._required /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_cnt._name /*String*/ ),(Object)(_cnt._name /*String*/ ));
 };
RDebugUtils.currentLine=100794391;
 //BA.debugLineNum = 100794391;BA.debugLine="Select Case cnt.fieldType";
switch (BA.switchObjectToInt(_cnt._fieldtype /*String*/ ,"int","bool","string","date","dbl")) {
case 0: {
RDebugUtils.currentLine=100794393;
 //BA.debugLineNum = 100794393;BA.debugLine="Integers.Add(cnt.name)";
__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cnt._name /*String*/ ));
 break; }
case 1: {
RDebugUtils.currentLine=100794395;
 //BA.debugLineNum = 100794395;BA.debugLine="Booleans.Add(cnt.name)";
__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cnt._name /*String*/ ));
 break; }
case 2: {
RDebugUtils.currentLine=100794397;
 //BA.debugLineNum = 100794397;BA.debugLine="Strings.Add(cnt.name)";
__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cnt._name /*String*/ ));
 break; }
case 3: {
RDebugUtils.currentLine=100794399;
 //BA.debugLineNum = 100794399;BA.debugLine="Dates.Add(cnt.name)";
__ref._dates /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cnt._name /*String*/ ));
 break; }
case 4: {
RDebugUtils.currentLine=100794401;
 //BA.debugLineNum = 100794401;BA.debugLine="Doubles.Add(cnt.name)";
__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_cnt._name /*String*/ ));
 break; }
}
;
 };
 }
};
RDebugUtils.currentLine=100794406;
 //BA.debugLineNum = 100794406;BA.debugLine="BuildGrid(Grid)";
__ref._buildgrid /*String*/ (null,__ref._grid /*b4j.example.vmgrid*/ );
RDebugUtils.currentLine=100794411;
 //BA.debugLineNum = 100794411;BA.debugLine="For Each nc As VMInputControl In Controls";
{
final anywheresoftware.b4a.BA.IterableList group36 = __ref._controls /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen36 = group36.getSize()
;int index36 = 0;
;
for (; index36 < groupLen36;index36++){
_nc = (b4j.example.vminputcontrol)(group36.Get(index36));
RDebugUtils.currentLine=100794412;
 //BA.debugLineNum = 100794412;BA.debugLine="showKey = $\"${nc.name}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"show");
RDebugUtils.currentLine=100794413;
 //BA.debugLineNum = 100794413;BA.debugLine="disKey = $\"${nc.name}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"disabled");
RDebugUtils.currentLine=100794414;
 //BA.debugLineNum = 100794414;BA.debugLine="enaKey = $\"${nc.name}required\"$";
_enakey = (""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"required");
RDebugUtils.currentLine=100794415;
 //BA.debugLineNum = 100794415;BA.debugLine="errKey = $\"${nc.name}error\"$";
_errkey = (""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"error");
RDebugUtils.currentLine=100794416;
 //BA.debugLineNum = 100794416;BA.debugLine="isarray = False";
_isarray = __c.False;
RDebugUtils.currentLine=100794426;
 //BA.debugLineNum = 100794426;BA.debugLine="visibility.Put(showKey, nc.Isvisible)";
__ref._visibility /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_showkey),(Object)(_nc._isvisible /*boolean*/ ));
RDebugUtils.currentLine=100794428;
 //BA.debugLineNum = 100794428;BA.debugLine="Select Case nc.typeOf";
switch (BA.switchObjectToInt(_nc._typeof /*String*/ ,"list","button","timepicker","chip","chips","label","image","file","number","text","tel","email","password","textarea","infobox","slider","numberinput","select","selectbox","datepicker","date","checkbox","switch","switchbox","icon","radiogroup","radio","checkboxgroup")) {
case 0: {
RDebugUtils.currentLine=100794430;
 //BA.debugLineNum = 100794430;BA.debugLine="Dim lst As VMList = CreateList(nc.name, module";
_lst = __ref._createlist /*b4j.example.vmlist*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794431;
 //BA.debugLineNum = 100794431;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794432;
 //BA.debugLineNum = 100794432;BA.debugLine="lst.SetVShow(showKey)";
_lst._setvshow /*b4j.example.vmlist*/ (null,(Object)(_showkey));
 };
RDebugUtils.currentLine=100794434;
 //BA.debugLineNum = 100794434;BA.debugLine="lst.AddSubHeader(nc.label)";
_lst._addsubheader /*b4j.example.vmlist*/ (null,(Object)(_nc._label /*String*/ ));
RDebugUtils.currentLine=100794435;
 //BA.debugLineNum = 100794435;BA.debugLine="Dim li As VMListItem = CreateListItem($\"${nc.n";
_li = __ref._createlistitem /*b4j.example.vmlistitem*/ (null,(""+__c.SmartStringFormatter("",(Object)(_nc._name /*String*/ ))+"li"),__ref._module /*Object*/ );
RDebugUtils.currentLine=100794436;
 //BA.debugLineNum = 100794436;BA.debugLine="li.SetVFor(\"row\", nc.source)";
_li._setvfor /*b4j.example.vmlistitem*/ (null,"row",_nc._source /*String*/ );
RDebugUtils.currentLine=100794437;
 //BA.debugLineNum = 100794437;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794438;
 //BA.debugLineNum = 100794438;BA.debugLine="li.SetID(nc.key,True)";
_li._setid /*b4j.example.vmlistitem*/ (null,_nc._key /*String*/ ,__c.True);
RDebugUtils.currentLine=100794439;
 //BA.debugLineNum = 100794439;BA.debugLine="li.SetKey(nc.key,True)";
_li._setkey /*b4j.example.vmlistitem*/ (null,_nc._key /*String*/ ,__c.True);
 };
RDebugUtils.currentLine=100794441;
 //BA.debugLineNum = 100794441;BA.debugLine="li.SetText(nc.text)";
_li._settext /*b4j.example.vmlistitem*/ (null,_nc._text /*String*/ );
RDebugUtils.currentLine=100794442;
 //BA.debugLineNum = 100794442;BA.debugLine="Select Case nc.Lines";
switch (BA.switchObjectToInt(_nc._lines /*int*/ ,(int) (2),(int) (3))) {
case 0: {
RDebugUtils.currentLine=100794444;
 //BA.debugLineNum = 100794444;BA.debugLine="lst.SetDoubleLine(True)";
_lst._setdoubleline /*b4j.example.vmlist*/ (null,__c.True);
RDebugUtils.currentLine=100794445;
 //BA.debugLineNum = 100794445;BA.debugLine="li.SetDescription(nc.Description)";
_li._setdescription /*b4j.example.vmlistitem*/ (null,_nc._description /*String*/ );
 break; }
case 1: {
RDebugUtils.currentLine=100794447;
 //BA.debugLineNum = 100794447;BA.debugLine="lst.SetTripleLine(True)";
_lst._settripleline /*b4j.example.vmlist*/ (null,__c.True);
RDebugUtils.currentLine=100794448;
 //BA.debugLineNum = 100794448;BA.debugLine="li.SetDescription(nc.Description)";
_li._setdescription /*b4j.example.vmlistitem*/ (null,_nc._description /*String*/ );
 break; }
}
;
RDebugUtils.currentLine=100794453;
 //BA.debugLineNum = 100794453;BA.debugLine="If nc.ActionIcon <> \"\" Then";
if ((_nc._actionicon /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=100794454;
 //BA.debugLineNum = 100794454;BA.debugLine="li.SetActionIcon(nc.ActionIcon)";
_li._setactionicon /*b4j.example.vmlistitem*/ (null,_nc._actionicon /*String*/ );
 };
RDebugUtils.currentLine=100794456;
 //BA.debugLineNum = 100794456;BA.debugLine="If nc.MenuIcon <> \"\" Then";
if ((_nc._menuicon /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=100794457;
 //BA.debugLineNum = 100794457;BA.debugLine="li.SetMenuIcon(nc.MenuIcon)";
_li._setmenuicon /*b4j.example.vmlistitem*/ (null,_nc._menuicon /*String*/ );
 };
RDebugUtils.currentLine=100794459;
 //BA.debugLineNum = 100794459;BA.debugLine="If nc.IconName <> \"\" Then";
if ((_nc._iconname /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=100794460;
 //BA.debugLineNum = 100794460;BA.debugLine="li.SetIcon(nc.iconname,nc.IsPrimary)";
_li._seticon /*b4j.example.vmlistitem*/ (null,_nc._iconname /*String*/ ,_nc._isprimary /*boolean*/ );
 };
RDebugUtils.currentLine=100794462;
 //BA.debugLineNum = 100794462;BA.debugLine="If nc.AddEdit Then";
if (_nc._addedit /*boolean*/ ) { 
RDebugUtils.currentLine=100794463;
 //BA.debugLineNum = 100794463;BA.debugLine="li.AddEditMenuItem(nc.Key, nc.editcaption)";
_li._addeditmenuitem /*String*/ (null,_nc._key /*String*/ ,_nc._editcaption /*String*/ );
RDebugUtils.currentLine=100794464;
 //BA.debugLineNum = 100794464;BA.debugLine="li.AddDeleteMenuItem(nc.Key, nc.deletecaption";
_li._adddeletemenuitem /*String*/ (null,_nc._key /*String*/ ,_nc._deletecaption /*String*/ );
 };
RDebugUtils.currentLine=100794466;
 //BA.debugLineNum = 100794466;BA.debugLine="li.Pop(lst)";
_li._pop /*String*/ (null,_lst);
RDebugUtils.currentLine=100794471;
 //BA.debugLineNum = 100794471;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, lst.ToStrin";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_lst._tostring /*String*/ (null));
 break; }
case 1: {
RDebugUtils.currentLine=100794474;
 //BA.debugLineNum = 100794474;BA.debugLine="Select Case nc.ButtonType";
switch (BA.switchObjectToInt(_nc._buttontype /*String*/ ,"regular","icon","fab")) {
case 0: {
RDebugUtils.currentLine=100794476;
 //BA.debugLineNum = 100794476;BA.debugLine="nc.Fab = False";
_nc._fab /*boolean*/  = __c.False;
RDebugUtils.currentLine=100794477;
 //BA.debugLineNum = 100794477;BA.debugLine="nc.iconbutton = False";
_nc._iconbutton /*boolean*/  = __c.False;
 break; }
case 1: {
RDebugUtils.currentLine=100794479;
 //BA.debugLineNum = 100794479;BA.debugLine="nc.IconButton = True";
_nc._iconbutton /*boolean*/  = __c.True;
RDebugUtils.currentLine=100794480;
 //BA.debugLineNum = 100794480;BA.debugLine="nc.Fab = False";
_nc._fab /*boolean*/  = __c.False;
 break; }
case 2: {
RDebugUtils.currentLine=100794482;
 //BA.debugLineNum = 100794482;BA.debugLine="nc.Fab = True";
_nc._fab /*boolean*/  = __c.True;
RDebugUtils.currentLine=100794483;
 //BA.debugLineNum = 100794483;BA.debugLine="nc.IconButton = False";
_nc._iconbutton /*boolean*/  = __c.False;
 break; }
}
;
RDebugUtils.currentLine=100794485;
 //BA.debugLineNum = 100794485;BA.debugLine="Dim btn As VMButton = CreateButton(nc.name, mo";
_btn = __ref._createbutton /*b4j.example.vmbutton*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794486;
 //BA.debugLineNum = 100794486;BA.debugLine="btn.SetText(nc.label)";
_btn._settext /*b4j.example.vmbutton*/ (null,_nc._label /*String*/ );
RDebugUtils.currentLine=100794487;
 //BA.debugLineNum = 100794487;BA.debugLine="btn.SetRaised(nc.raised)";
_btn._setraised /*b4j.example.vmbutton*/ (null,_nc._raised /*boolean*/ );
RDebugUtils.currentLine=100794488;
 //BA.debugLineNum = 100794488;BA.debugLine="btn.SetPrimary(nc.isprimary)";
_btn._setprimary /*b4j.example.vmbutton*/ (null,_nc._isprimary /*boolean*/ );
RDebugUtils.currentLine=100794489;
 //BA.debugLineNum = 100794489;BA.debugLine="btn.SetAccent(nc.isaccent)";
_btn._setaccent /*b4j.example.vmbutton*/ (null,_nc._isaccent /*boolean*/ );
RDebugUtils.currentLine=100794490;
 //BA.debugLineNum = 100794490;BA.debugLine="btn.SetRipple(nc.Ripple)";
_btn._setripple /*b4j.example.vmbutton*/ (null,_nc._ripple /*boolean*/ );
RDebugUtils.currentLine=100794491;
 //BA.debugLineNum = 100794491;BA.debugLine="btn.SetMenuTrigger(nc.MenuTrigger)";
_btn._setmenutrigger /*b4j.example.vmbutton*/ (null,_nc._menutrigger /*boolean*/ );
RDebugUtils.currentLine=100794492;
 //BA.debugLineNum = 100794492;BA.debugLine="btn.SetDense(nc.Dense)";
_btn._setdense /*b4j.example.vmbutton*/ (null,_nc._dense /*boolean*/ );
RDebugUtils.currentLine=100794493;
 //BA.debugLineNum = 100794493;BA.debugLine="btn.SetIconButton(nc.IconButton)";
_btn._seticonbutton /*b4j.example.vmbutton*/ (null,_nc._iconbutton /*boolean*/ );
RDebugUtils.currentLine=100794494;
 //BA.debugLineNum = 100794494;BA.debugLine="btn.SetPlain(nc.Plain)";
_btn._setplain /*b4j.example.vmbutton*/ (null,_nc._plain /*boolean*/ );
RDebugUtils.currentLine=100794495;
 //BA.debugLineNum = 100794495;BA.debugLine="btn.SetMini(nc.Mini)";
_btn._setmini /*b4j.example.vmbutton*/ (null,_nc._mini /*boolean*/ );
RDebugUtils.currentLine=100794496;
 //BA.debugLineNum = 100794496;BA.debugLine="btn.SetFab(nc.Fab)";
_btn._setfab /*b4j.example.vmbutton*/ (null,_nc._fab /*boolean*/ );
RDebugUtils.currentLine=100794497;
 //BA.debugLineNum = 100794497;BA.debugLine="btn.SetListAction(nc.ListAction)";
_btn._setlistaction /*b4j.example.vmbutton*/ (null,_nc._listaction /*boolean*/ );
RDebugUtils.currentLine=100794498;
 //BA.debugLineNum = 100794498;BA.debugLine="btn.SetIcon(nc.IconName)";
_btn._seticon /*b4j.example.vmbutton*/ (null,_nc._iconname /*String*/ );
RDebugUtils.currentLine=100794499;
 //BA.debugLineNum = 100794499;BA.debugLine="btn.SetTo(nc.NavigateTo, False)";
_btn._setto /*b4j.example.vmbutton*/ (null,_nc._navigateto /*String*/ ,__c.False);
RDebugUtils.currentLine=100794500;
 //BA.debugLineNum = 100794500;BA.debugLine="btn.SetFabPosition(nc.FabPosition)";
_btn._setfabposition /*b4j.example.vmbutton*/ (null,_nc._fabposition /*String*/ );
RDebugUtils.currentLine=100794501;
 //BA.debugLineNum = 100794501;BA.debugLine="btn.SetFabFixed(nc.FabFixed)";
_btn._setfabfixed /*b4j.example.vmbutton*/ (null,_nc._fabfixed /*boolean*/ );
RDebugUtils.currentLine=100794502;
 //BA.debugLineNum = 100794502;BA.debugLine="If nc.FitWidth Then";
if (_nc._fitwidth /*boolean*/ ) { 
RDebugUtils.currentLine=100794503;
 //BA.debugLineNum = 100794503;BA.debugLine="btn.SetStyle(CreateMap(\"width\":\"100%\",\"margin";
_btn._setstyle /*b4j.example.vmbutton*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)("100%"),(Object)("margin-left"),(Object)("0px"),(Object)("margin-right"),(Object)("0px")}));
 };
RDebugUtils.currentLine=100794505;
 //BA.debugLineNum = 100794505;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794506;
 //BA.debugLineNum = 100794506;BA.debugLine="btn.SetVShow(showKey)";
_btn._setvshow /*b4j.example.vmbutton*/ (null,_showkey);
RDebugUtils.currentLine=100794507;
 //BA.debugLineNum = 100794507;BA.debugLine="btn.SetDisabled(nc.IsDisabled)";
_btn._setdisabled /*b4j.example.vmbutton*/ (null,_nc._isdisabled /*boolean*/ );
 };
RDebugUtils.currentLine=100794509;
 //BA.debugLineNum = 100794509;BA.debugLine="btn.SetTabIndex(nc.TabIndex)";
_btn._settabindex /*b4j.example.vmbutton*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794513;
 //BA.debugLineNum = 100794513;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, btn.ToStrin";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_btn._tostring /*String*/ (null));
 break; }
case 2: {
RDebugUtils.currentLine=100794515;
 //BA.debugLineNum = 100794515;BA.debugLine="Dim tp As VMTimePicker = CreateTimePicker(nc.n";
_tp = __ref._createtimepicker /*b4j.example.vmtimepicker*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794516;
 //BA.debugLineNum = 100794516;BA.debugLine="tp.SetLabel(nc.label)";
_tp._setlabel /*b4j.example.vmtimepicker*/ (null,(Object)(_nc._label /*String*/ ));
RDebugUtils.currentLine=100794517;
 //BA.debugLineNum = 100794517;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794518;
 //BA.debugLineNum = 100794518;BA.debugLine="tp.SetVModel(nc.name)";
_tp._setvmodel /*b4j.example.vmtimepicker*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794519;
 //BA.debugLineNum = 100794519;BA.debugLine="tp.SetVShow(showKey)";
_tp._setvshow /*b4j.example.vmtimepicker*/ (null,_showkey);
RDebugUtils.currentLine=100794520;
 //BA.debugLineNum = 100794520;BA.debugLine="tp.SetDisabled(nc.IsDisabled)";
_tp._setdisabled /*b4j.example.vmtimepicker*/ (null,_nc._isdisabled /*boolean*/ );
RDebugUtils.currentLine=100794521;
 //BA.debugLineNum = 100794521;BA.debugLine="tp.SetRequired(nc.required)";
_tp._setrequired /*b4j.example.vmtimepicker*/ (null,_nc._required /*boolean*/ );
 };
RDebugUtils.currentLine=100794523;
 //BA.debugLineNum = 100794523;BA.debugLine="tp.SetName(nc.name,False)";
_tp._setname /*b4j.example.vmtimepicker*/ (null,(Object)(_nc._name /*String*/ ),__c.False);
RDebugUtils.currentLine=100794524;
 //BA.debugLineNum = 100794524;BA.debugLine="tp.SetTabIndex(nc.TabIndex)";
_tp._settabindex /*b4j.example.vmtimepicker*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794525;
 //BA.debugLineNum = 100794525;BA.debugLine="tp.SetPlaceholder(nc.placeholder)";
_tp._setplaceholder /*b4j.example.vmtimepicker*/ (null,_nc._placeholder /*String*/ );
RDebugUtils.currentLine=100794526;
 //BA.debugLineNum = 100794526;BA.debugLine="tp.SetHelperText(nc.helperText)";
_tp._sethelpertext /*b4j.example.vmtimepicker*/ (null,_nc._helpertext /*String*/ );
RDebugUtils.currentLine=100794527;
 //BA.debugLineNum = 100794527;BA.debugLine="tp.SetErrorText(nc.errorText)";
_tp._seterrortext /*b4j.example.vmtimepicker*/ (null,_nc._errortext /*String*/ );
RDebugUtils.currentLine=100794528;
 //BA.debugLineNum = 100794528;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, tp.ToString";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_tp._tostring /*String*/ (null));
 break; }
case 3: {
RDebugUtils.currentLine=100794530;
 //BA.debugLineNum = 100794530;BA.debugLine="Dim chp As VMChip = CreateChip(nc.name,module)";
_chp = __ref._createchip /*b4j.example.vmchip*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794531;
 //BA.debugLineNum = 100794531;BA.debugLine="chp.SetText(nc.Text)";
_chp._settext /*b4j.example.vmchip*/ (null,_nc._text /*String*/ );
RDebugUtils.currentLine=100794532;
 //BA.debugLineNum = 100794532;BA.debugLine="chp.SetClickable(nc.Clickable)";
_chp._setclickable /*b4j.example.vmchip*/ (null,_nc._clickable /*boolean*/ );
RDebugUtils.currentLine=100794533;
 //BA.debugLineNum = 100794533;BA.debugLine="chp.SetDeletable(nc.Deletable)";
_chp._setdeletable /*b4j.example.vmchip*/ (null,_nc._deletable /*boolean*/ );
RDebugUtils.currentLine=100794534;
 //BA.debugLineNum = 100794534;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794535;
 //BA.debugLineNum = 100794535;BA.debugLine="chp.SetVShow(showKey)";
_chp._setvshow /*b4j.example.vmchip*/ (null,(Object)(_showkey));
RDebugUtils.currentLine=100794536;
 //BA.debugLineNum = 100794536;BA.debugLine="chp.setVmodel(nc.name)";
_chp._setvmodel /*b4j.example.vmchip*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794537;
 //BA.debugLineNum = 100794537;BA.debugLine="chp.SetDisabled(disKey)";
_chp._setdisabled /*b4j.example.vmchip*/ (null,BA.ObjectToBoolean(_diskey));
 };
RDebugUtils.currentLine=100794539;
 //BA.debugLineNum = 100794539;BA.debugLine="If nc.UseOptions = True Then";
if (_nc._useoptions /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=100794540;
 //BA.debugLineNum = 100794540;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794541;
 //BA.debugLineNum = 100794541;BA.debugLine="chp.SetOptions(nc.sourceTable, nc.options, n";
_chp._setoptions /*b4j.example.vmchip*/ (null,_nc._sourcetable /*String*/ ,_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ ,_nc._sourcefield /*String*/ ,_nc._displayfield /*String*/ );
 };
 };
RDebugUtils.currentLine=100794544;
 //BA.debugLineNum = 100794544;BA.debugLine="If nc.UseDataSource = True Then";
if (_nc._usedatasource /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=100794545;
 //BA.debugLineNum = 100794545;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794546;
 //BA.debugLineNum = 100794546;BA.debugLine="chp.SetDataSource(nc.sourceTable, nc.sourceF";
_chp._setdatasource /*b4j.example.vmchip*/ (null,_nc._sourcetable /*String*/ ,_nc._sourcefield /*String*/ ,_nc._displayfield /*String*/ );
 };
 };
RDebugUtils.currentLine=100794549;
 //BA.debugLineNum = 100794549;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, chp.ToStrin";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_chp._tostring /*String*/ (null));
 break; }
case 4: {
RDebugUtils.currentLine=100794551;
 //BA.debugLineNum = 100794551;BA.debugLine="isarray = True";
_isarray = __c.True;
RDebugUtils.currentLine=100794552;
 //BA.debugLineNum = 100794552;BA.debugLine="Dim chps As VMChips = CreateChips(nc.name, mod";
_chps = __ref._createchips /*b4j.example.vmchips*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794553;
 //BA.debugLineNum = 100794553;BA.debugLine="chps.SetInputType(nc.InputType)";
_chps._setinputtype /*b4j.example.vmchips*/ (null,_nc._inputtype /*String*/ );
RDebugUtils.currentLine=100794554;
 //BA.debugLineNum = 100794554;BA.debugLine="chps.SetPlaceholder(nc.PlaceHolder)";
_chps._setplaceholder /*b4j.example.vmchips*/ (null,_nc._placeholder /*String*/ );
RDebugUtils.currentLine=100794555;
 //BA.debugLineNum = 100794555;BA.debugLine="chps.SetStatic(nc.Static)";
_chps._setstatic /*b4j.example.vmchips*/ (null,_nc._static /*boolean*/ );
RDebugUtils.currentLine=100794556;
 //BA.debugLineNum = 100794556;BA.debugLine="chps.SetCheckDuplicated(nc.CheckDuplicates)";
_chps._setcheckduplicated /*b4j.example.vmchips*/ (null,_nc._checkduplicates /*boolean*/ );
RDebugUtils.currentLine=100794557;
 //BA.debugLineNum = 100794557;BA.debugLine="chps.SetHelperText(nc.helperText)";
_chps._sethelpertext /*b4j.example.vmchips*/ (null,_nc._helpertext /*String*/ );
RDebugUtils.currentLine=100794558;
 //BA.debugLineNum = 100794558;BA.debugLine="chps.SetErrorText(nc.errorText)";
_chps._seterrortext /*b4j.example.vmchips*/ (null,_nc._errortext /*String*/ );
RDebugUtils.currentLine=100794559;
 //BA.debugLineNum = 100794559;BA.debugLine="chps.SetLabel(nc.label)";
_chps._setlabel /*b4j.example.vmchips*/ (null,_nc._label /*String*/ );
RDebugUtils.currentLine=100794560;
 //BA.debugLineNum = 100794560;BA.debugLine="chps.SetRequired(nc.Required)";
_chps._setrequired /*b4j.example.vmchips*/ (null,_nc._required /*boolean*/ );
RDebugUtils.currentLine=100794561;
 //BA.debugLineNum = 100794561;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794562;
 //BA.debugLineNum = 100794562;BA.debugLine="chps.setVmodel(nc.name)";
_chps._setvmodel /*b4j.example.vmchips*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794563;
 //BA.debugLineNum = 100794563;BA.debugLine="chps.SetDisabled(disKey)";
_chps._setdisabled /*b4j.example.vmchips*/ (null,BA.ObjectToBoolean(_diskey));
RDebugUtils.currentLine=100794564;
 //BA.debugLineNum = 100794564;BA.debugLine="chps.SetVShow(showKey)";
_chps._setvshow /*b4j.example.vmchips*/ (null,_showkey);
 };
RDebugUtils.currentLine=100794566;
 //BA.debugLineNum = 100794566;BA.debugLine="vue.SetStateSingle(nc.name, Array())";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_nc._name /*String*/ ,(Object)(new Object[]{}));
RDebugUtils.currentLine=100794567;
 //BA.debugLineNum = 100794567;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, chps.ToStri";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_chps._tostring /*String*/ (null));
 break; }
case 5: {
RDebugUtils.currentLine=100794569;
 //BA.debugLineNum = 100794569;BA.debugLine="Dim lbl As VMLabel = CreateLABEL(nc.name)";
_lbl = __ref._createlabel /*b4j.example.vmlabel*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794570;
 //BA.debugLineNum = 100794570;BA.debugLine="lbl.SetTag(nc.Tag)";
_lbl._settag /*b4j.example.vmlabel*/ (null,_nc._tag /*String*/ );
RDebugUtils.currentLine=100794571;
 //BA.debugLineNum = 100794571;BA.debugLine="lbl.SetText(nc.Text)";
_lbl._settext /*b4j.example.vmlabel*/ (null,_nc._text /*String*/ );
RDebugUtils.currentLine=100794572;
 //BA.debugLineNum = 100794572;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794573;
 //BA.debugLineNum = 100794573;BA.debugLine="lbl.SetVShow(showKey)";
_lbl._setvshow /*b4j.example.vmlabel*/ (null,_showkey);
 };
RDebugUtils.currentLine=100794575;
 //BA.debugLineNum = 100794575;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, lbl.ToStrin";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_lbl._tostring /*String*/ (null));
 break; }
case 6: {
RDebugUtils.currentLine=100794577;
 //BA.debugLineNum = 100794577;BA.debugLine="Dim img As VMImage = CreateImage(nc.name, modu";
_img = __ref._createimage /*b4j.example.vmimage*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794578;
 //BA.debugLineNum = 100794578;BA.debugLine="img.SetAlt(nc.Alt)";
_img._setalt /*b4j.example.vmimage*/ (null,_nc._alt /*String*/ );
RDebugUtils.currentLine=100794579;
 //BA.debugLineNum = 100794579;BA.debugLine="img.SetWidth(nc.Width)";
_img._setwidth /*b4j.example.vmimage*/ (null,_nc._width /*String*/ );
RDebugUtils.currentLine=100794580;
 //BA.debugLineNum = 100794580;BA.debugLine="img.SetHeight(nc.Height)";
_img._setheight /*b4j.example.vmimage*/ (null,_nc._height /*String*/ );
RDebugUtils.currentLine=100794581;
 //BA.debugLineNum = 100794581;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794582;
 //BA.debugLineNum = 100794582;BA.debugLine="img.SetVModel(nc.name)";
_img._setvmodel /*b4j.example.vmimage*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794583;
 //BA.debugLineNum = 100794583;BA.debugLine="img.SetVShow(showKey)";
_img._setvshow /*b4j.example.vmimage*/ (null,_showkey);
RDebugUtils.currentLine=100794584;
 //BA.debugLineNum = 100794584;BA.debugLine="img.SetValue(nc.defaultValue, True)";
_img._setvalue /*b4j.example.vmimage*/ (null,BA.ObjectToString(_nc._defaultvalue /*Object*/ ),__c.True);
 }else {
RDebugUtils.currentLine=100794586;
 //BA.debugLineNum = 100794586;BA.debugLine="img.SetValue(nc.defaultValue, False)";
_img._setvalue /*b4j.example.vmimage*/ (null,BA.ObjectToString(_nc._defaultvalue /*Object*/ ),__c.False);
 };
RDebugUtils.currentLine=100794588;
 //BA.debugLineNum = 100794588;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, img.ToStrin";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_img._tostring /*String*/ (null));
 break; }
case 7: {
RDebugUtils.currentLine=100794590;
 //BA.debugLineNum = 100794590;BA.debugLine="Dim fil As VMFile = CreateFile(nc.name, module";
_fil = __ref._createfile /*b4j.example.vmfile*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794591;
 //BA.debugLineNum = 100794591;BA.debugLine="fil.SetErrorText(nc.errorText)";
_fil._seterrortext /*b4j.example.vmfile*/ (null,_nc._errortext /*String*/ );
RDebugUtils.currentLine=100794592;
 //BA.debugLineNum = 100794592;BA.debugLine="fil.SetLabel(nc.label)";
_fil._setlabel /*b4j.example.vmfile*/ (null,(Object)(_nc._label /*String*/ ));
RDebugUtils.currentLine=100794593;
 //BA.debugLineNum = 100794593;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794594;
 //BA.debugLineNum = 100794594;BA.debugLine="fil.SetVModel(nc.name)";
_fil._setvmodel /*b4j.example.vmfile*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794595;
 //BA.debugLineNum = 100794595;BA.debugLine="fil.SetVShow(showKey)";
_fil._setvshow /*b4j.example.vmfile*/ (null,(Object)(_showkey));
RDebugUtils.currentLine=100794596;
 //BA.debugLineNum = 100794596;BA.debugLine="fil.SetDisabled(nc.IsDisabled)";
_fil._setdisabled /*b4j.example.vmfile*/ (null,_nc._isdisabled /*boolean*/ );
RDebugUtils.currentLine=100794597;
 //BA.debugLineNum = 100794597;BA.debugLine="fil.SetRequired(nc.required)";
_fil._setrequired /*b4j.example.vmfile*/ (null,_nc._required /*boolean*/ );
 };
RDebugUtils.currentLine=100794599;
 //BA.debugLineNum = 100794599;BA.debugLine="fil.SetName(nc.name,False)";
_fil._setname /*b4j.example.vmfile*/ (null,(Object)(_nc._name /*String*/ ),__c.False);
RDebugUtils.currentLine=100794600;
 //BA.debugLineNum = 100794600;BA.debugLine="fil.SetTabIndex(nc.TabIndex)";
_fil._settabindex /*b4j.example.vmfile*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794601;
 //BA.debugLineNum = 100794601;BA.debugLine="fil.SetHelperText(nc.helperText)";
_fil._sethelpertext /*b4j.example.vmfile*/ (null,_nc._helpertext /*String*/ );
RDebugUtils.currentLine=100794602;
 //BA.debugLineNum = 100794602;BA.debugLine="fil.SetPlaceholder(nc.placeholder)";
_fil._setplaceholder /*b4j.example.vmfile*/ (null,(Object)(_nc._placeholder /*String*/ ));
RDebugUtils.currentLine=100794606;
 //BA.debugLineNum = 100794606;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, fil.ToStrin";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_fil._tostring /*String*/ (null));
 break; }
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
RDebugUtils.currentLine=100794609;
 //BA.debugLineNum = 100794609;BA.debugLine="Dim input As VMInput = CreateInput(nc.name, mo";
_input = __ref._createinput /*b4j.example.vminput*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794610;
 //BA.debugLineNum = 100794610;BA.debugLine="input.SetErrorText(nc.errorText)";
_input._seterrortext /*b4j.example.vminput*/ (null,_nc._errortext /*String*/ );
RDebugUtils.currentLine=100794611;
 //BA.debugLineNum = 100794611;BA.debugLine="input.SetType(nc.typeOf)";
_input._settype /*b4j.example.vminput*/ (null,(Object)(_nc._typeof /*String*/ ));
RDebugUtils.currentLine=100794612;
 //BA.debugLineNum = 100794612;BA.debugLine="input.SetLabel(nc.label)";
_input._setlabel /*b4j.example.vminput*/ (null,_nc._label /*String*/ );
RDebugUtils.currentLine=100794613;
 //BA.debugLineNum = 100794613;BA.debugLine="input.SetReadOnly(nc.readonly)";
_input._setreadonly /*b4j.example.vminput*/ (null,_nc._readonly /*boolean*/ );
RDebugUtils.currentLine=100794614;
 //BA.debugLineNum = 100794614;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794615;
 //BA.debugLineNum = 100794615;BA.debugLine="input.SetVModel(nc.name)";
_input._setvmodel /*b4j.example.vminput*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794616;
 //BA.debugLineNum = 100794616;BA.debugLine="input.SetVShow(showKey)";
_input._setvshow /*b4j.example.vminput*/ (null,(Object)(_showkey));
RDebugUtils.currentLine=100794617;
 //BA.debugLineNum = 100794617;BA.debugLine="input.SetDisabled(nc.IsDisabled)";
_input._setdisabled /*b4j.example.vminput*/ (null,_nc._isdisabled /*boolean*/ );
RDebugUtils.currentLine=100794618;
 //BA.debugLineNum = 100794618;BA.debugLine="input.SetRequired(nc.required)";
_input._setrequired /*b4j.example.vminput*/ (null,_nc._required /*boolean*/ );
 };
RDebugUtils.currentLine=100794620;
 //BA.debugLineNum = 100794620;BA.debugLine="input.SetName(nc.name,False)";
_input._setname /*b4j.example.vminput*/ (null,(Object)(_nc._name /*String*/ ),__c.False);
RDebugUtils.currentLine=100794621;
 //BA.debugLineNum = 100794621;BA.debugLine="input.SetAutoComplete(nc.name)";
_input._setautocomplete /*b4j.example.vminput*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794622;
 //BA.debugLineNum = 100794622;BA.debugLine="input.SetIcon(nc.IconName)";
_input._seticon /*b4j.example.vminput*/ (null,_nc._iconname /*String*/ );
RDebugUtils.currentLine=100794623;
 //BA.debugLineNum = 100794623;BA.debugLine="input.SetTabIndex(nc.TabIndex)";
_input._settabindex /*b4j.example.vminput*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794624;
 //BA.debugLineNum = 100794624;BA.debugLine="input.SetMaxlength(nc.MaxLength)";
_input._setmaxlength /*b4j.example.vminput*/ (null,(int)(BA.ObjectToNumber(_nc._maxlength /*Object*/ )));
RDebugUtils.currentLine=100794625;
 //BA.debugLineNum = 100794625;BA.debugLine="input.SetHelperText(nc.helperText)";
_input._sethelpertext /*b4j.example.vminput*/ (null,_nc._helpertext /*String*/ );
RDebugUtils.currentLine=100794626;
 //BA.debugLineNum = 100794626;BA.debugLine="input.SetPlaceholder(nc.placeholder)";
_input._setplaceholder /*b4j.example.vminput*/ (null,(Object)(_nc._placeholder /*String*/ ));
RDebugUtils.currentLine=100794627;
 //BA.debugLineNum = 100794627;BA.debugLine="If nc.typeOf <> \"password\" Then";
if ((_nc._typeof /*String*/ ).equals("password") == false) { 
RDebugUtils.currentLine=100794628;
 //BA.debugLineNum = 100794628;BA.debugLine="input.SetClearable(nc.clearable)";
_input._setclearable /*b4j.example.vminput*/ (null,_nc._clearable /*boolean*/ );
RDebugUtils.currentLine=100794629;
 //BA.debugLineNum = 100794629;BA.debugLine="input.SetTogglePassword(nc.TogglePassword)";
_input._settogglepassword /*b4j.example.vminput*/ (null,_nc._togglepassword /*boolean*/ );
 };
RDebugUtils.currentLine=100794634;
 //BA.debugLineNum = 100794634;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, input.ToStr";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_input._tostring /*String*/ (null));
 break; }
case 13: {
RDebugUtils.currentLine=100794637;
 //BA.debugLineNum = 100794637;BA.debugLine="Dim txtarea As VMTextArea = CreateTextArea(nc.";
_txtarea = __ref._createtextarea /*b4j.example.vmtextarea*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794638;
 //BA.debugLineNum = 100794638;BA.debugLine="txtarea.SetClearable(nc.clearable)";
_txtarea._setclearable /*b4j.example.vmtextarea*/ (null,_nc._clearable /*boolean*/ );
RDebugUtils.currentLine=100794639;
 //BA.debugLineNum = 100794639;BA.debugLine="txtarea.SetErrorText(nc.errorText)";
_txtarea._seterrortext /*b4j.example.vmtextarea*/ (null,_nc._errortext /*String*/ );
RDebugUtils.currentLine=100794640;
 //BA.debugLineNum = 100794640;BA.debugLine="txtarea.SetLabel(nc.label)";
_txtarea._setlabel /*b4j.example.vmtextarea*/ (null,_nc._label /*String*/ );
RDebugUtils.currentLine=100794641;
 //BA.debugLineNum = 100794641;BA.debugLine="txtarea.SetReadOnly(nc.readonly)";
_txtarea._setreadonly /*b4j.example.vmtextarea*/ (null,_nc._readonly /*boolean*/ );
RDebugUtils.currentLine=100794642;
 //BA.debugLineNum = 100794642;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794643;
 //BA.debugLineNum = 100794643;BA.debugLine="txtarea.SetVModel(nc.name)";
_txtarea._setvmodel /*b4j.example.vmtextarea*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794644;
 //BA.debugLineNum = 100794644;BA.debugLine="txtarea.SetVShow(showKey)";
_txtarea._setvshow /*b4j.example.vmtextarea*/ (null,_showkey);
RDebugUtils.currentLine=100794645;
 //BA.debugLineNum = 100794645;BA.debugLine="txtarea.SetDisabled(nc.IsDisabled)";
_txtarea._setdisabled /*b4j.example.vmtextarea*/ (null,_nc._isdisabled /*boolean*/ );
RDebugUtils.currentLine=100794646;
 //BA.debugLineNum = 100794646;BA.debugLine="txtarea.SetRequired(nc.required)";
_txtarea._setrequired /*b4j.example.vmtextarea*/ (null,_nc._required /*boolean*/ );
 };
RDebugUtils.currentLine=100794648;
 //BA.debugLineNum = 100794648;BA.debugLine="txtarea.SetName(nc.name,False)";
_txtarea._setname /*b4j.example.vmtextarea*/ (null,(Object)(_nc._name /*String*/ ),__c.False);
RDebugUtils.currentLine=100794649;
 //BA.debugLineNum = 100794649;BA.debugLine="txtarea.SetTabIndex(nc.TabIndex)";
_txtarea._settabindex /*b4j.example.vmtextarea*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794650;
 //BA.debugLineNum = 100794650;BA.debugLine="txtarea.SetMaxlength(nc.MaxLength)";
_txtarea._setmaxlength /*b4j.example.vmtextarea*/ (null,BA.ObjectToString(_nc._maxlength /*Object*/ ));
RDebugUtils.currentLine=100794651;
 //BA.debugLineNum = 100794651;BA.debugLine="txtarea.SetPlaceholder(nc.placeholder)";
_txtarea._setplaceholder /*b4j.example.vmtextarea*/ (null,(Object)(_nc._placeholder /*String*/ ));
RDebugUtils.currentLine=100794652;
 //BA.debugLineNum = 100794652;BA.debugLine="txtarea.SetHelperText(nc.helperText)";
_txtarea._sethelpertext /*b4j.example.vmtextarea*/ (null,_nc._helpertext /*String*/ );
RDebugUtils.currentLine=100794653;
 //BA.debugLineNum = 100794653;BA.debugLine="txtarea.SetAutogrow(nc.AutoGrow)";
_txtarea._setautogrow /*b4j.example.vmtextarea*/ (null,_nc._autogrow /*boolean*/ );
RDebugUtils.currentLine=100794654;
 //BA.debugLineNum = 100794654;BA.debugLine="txtarea.SetIcon(nc.IconName)";
_txtarea._seticon /*b4j.example.vmtextarea*/ (null,_nc._iconname /*String*/ );
RDebugUtils.currentLine=100794658;
 //BA.debugLineNum = 100794658;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, txtarea.ToS";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_txtarea._tostring /*String*/ (null));
 break; }
case 14: {
RDebugUtils.currentLine=100794660;
 //BA.debugLineNum = 100794660;BA.debugLine="Dim ibox As VMInfoBox = CreateInfoBox(nc.name,";
_ibox = __ref._createinfobox /*b4j.example.vminfobox*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794661;
 //BA.debugLineNum = 100794661;BA.debugLine="If nc.bSetCounter Then";
if (_nc._bsetcounter /*boolean*/ ) { 
RDebugUtils.currentLine=100794662;
 //BA.debugLineNum = 100794662;BA.debugLine="ibox.SetFrom(nc.Start)";
_ibox._setfrom /*b4j.example.vminfobox*/ (null,_nc._start /*String*/ );
RDebugUtils.currentLine=100794663;
 //BA.debugLineNum = 100794663;BA.debugLine="ibox.SetTo(nc.Finish)";
_ibox._setto /*b4j.example.vminfobox*/ (null,_nc._finish /*String*/ );
RDebugUtils.currentLine=100794664;
 //BA.debugLineNum = 100794664;BA.debugLine="ibox.SetSpeed(nc.Speed)";
_ibox._setspeed /*b4j.example.vminfobox*/ (null,_nc._speed /*String*/ );
RDebugUtils.currentLine=100794665;
 //BA.debugLineNum = 100794665;BA.debugLine="ibox.SetRefreshInterval(nc.RefreshInterval)";
_ibox._setrefreshinterval /*b4j.example.vminfobox*/ (null,_nc._refreshinterval /*String*/ );
 };
RDebugUtils.currentLine=100794667;
 //BA.debugLineNum = 100794667;BA.debugLine="ibox.SetNumber(nc.Count)";
_ibox._setnumber /*b4j.example.vminfobox*/ (null,_nc._count /*String*/ );
RDebugUtils.currentLine=100794668;
 //BA.debugLineNum = 100794668;BA.debugLine="ibox.SetIcon(nc.IconName)";
_ibox._seticon /*b4j.example.vminfobox*/ (null,_nc._iconname /*String*/ );
RDebugUtils.currentLine=100794669;
 //BA.debugLineNum = 100794669;BA.debugLine="ibox.SetIconColor(nc.IconColor)";
_ibox._seticoncolor /*b4j.example.vminfobox*/ (null,_nc._iconcolor /*String*/ );
RDebugUtils.currentLine=100794670;
 //BA.debugLineNum = 100794670;BA.debugLine="ibox.SetIconBackgroundColor(nc.IconBackgroundC";
_ibox._seticonbackgroundcolor /*b4j.example.vminfobox*/ (null,_nc._iconbackgroundcolor /*String*/ );
RDebugUtils.currentLine=100794671;
 //BA.debugLineNum = 100794671;BA.debugLine="ibox.SetText(nc.Text)";
_ibox._settext /*b4j.example.vminfobox*/ (null,_nc._text /*String*/ );
RDebugUtils.currentLine=100794672;
 //BA.debugLineNum = 100794672;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794673;
 //BA.debugLineNum = 100794673;BA.debugLine="ibox.SetVShow(showKey)";
_ibox._setvshow /*b4j.example.vminfobox*/ (null,(Object)(_showkey));
 };
RDebugUtils.currentLine=100794675;
 //BA.debugLineNum = 100794675;BA.debugLine="ibox.SetHoverExpandEffect(nc.HoverExpandEffect";
_ibox._sethoverexpandeffect /*b4j.example.vminfobox*/ (null,_nc._hoverexpandeffect /*boolean*/ );
RDebugUtils.currentLine=100794676;
 //BA.debugLineNum = 100794676;BA.debugLine="ibox.SetHoverZoomEffect(nc.HoverZoomEffect)";
_ibox._sethoverzoomeffect /*b4j.example.vminfobox*/ (null,_nc._hoverzoomeffect /*boolean*/ );
RDebugUtils.currentLine=100794677;
 //BA.debugLineNum = 100794677;BA.debugLine="Select Case nc.BoxType";
switch (BA.switchObjectToInt(_nc._boxtype /*String*/ ,"2","3","4")) {
case 0: {
RDebugUtils.currentLine=100794679;
 //BA.debugLineNum = 100794679;BA.debugLine="ibox.SetStyle2(True)";
_ibox._setstyle2 /*b4j.example.vminfobox*/ (null,__c.True);
 break; }
case 1: {
RDebugUtils.currentLine=100794681;
 //BA.debugLineNum = 100794681;BA.debugLine="ibox.SetStyle3(True)";
_ibox._setstyle3 /*b4j.example.vminfobox*/ (null,__c.True);
 break; }
case 2: {
RDebugUtils.currentLine=100794683;
 //BA.debugLineNum = 100794683;BA.debugLine="ibox.SetStyle4(True)";
_ibox._setstyle4 /*b4j.example.vminfobox*/ (null,__c.True);
 break; }
}
;
RDebugUtils.currentLine=100794685;
 //BA.debugLineNum = 100794685;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, ibox.ToStri";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_ibox._tostring /*String*/ (null));
 break; }
case 15: {
RDebugUtils.currentLine=100794687;
 //BA.debugLineNum = 100794687;BA.debugLine="Dim slid As VMSlider = CreateSlider(nc.name, m";
_slid = __ref._createslider /*b4j.example.vmslider*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794688;
 //BA.debugLineNum = 100794688;BA.debugLine="slid.SetMin(nc.minvalue)";
_slid._setmin /*b4j.example.vmslider*/ (null,_nc._minvalue /*int*/ );
RDebugUtils.currentLine=100794689;
 //BA.debugLineNum = 100794689;BA.debugLine="slid.SetMax(nc.maxvalue)";
_slid._setmax /*b4j.example.vmslider*/ (null,_nc._maxvalue /*int*/ );
RDebugUtils.currentLine=100794690;
 //BA.debugLineNum = 100794690;BA.debugLine="slid.SetLabel(nc.label)";
_slid._setlabel /*b4j.example.vmslider*/ (null,(Object)(_nc._label /*String*/ ));
RDebugUtils.currentLine=100794691;
 //BA.debugLineNum = 100794691;BA.debugLine="slid.SetThumbLabel(nc.ThumbLabel)";
_slid._setthumblabel /*b4j.example.vmslider*/ (null,_nc._thumblabel /*boolean*/ );
RDebugUtils.currentLine=100794692;
 //BA.debugLineNum = 100794692;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794693;
 //BA.debugLineNum = 100794693;BA.debugLine="slid.SetVModel(nc.name)";
_slid._setvmodel /*b4j.example.vmslider*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794694;
 //BA.debugLineNum = 100794694;BA.debugLine="slid.SetVShow(showKey)";
_slid._setvshow /*b4j.example.vmslider*/ (null,(Object)(_showkey));
RDebugUtils.currentLine=100794695;
 //BA.debugLineNum = 100794695;BA.debugLine="slid.SetDisabled(nc.IsDisabled)";
_slid._setdisabled /*b4j.example.vmslider*/ (null,_nc._isdisabled /*boolean*/ );
 };
RDebugUtils.currentLine=100794697;
 //BA.debugLineNum = 100794697;BA.debugLine="slid.SetName(nc.name,False)";
_slid._setname /*b4j.example.vmslider*/ (null,(Object)(_nc._name /*String*/ ),__c.False);
RDebugUtils.currentLine=100794698;
 //BA.debugLineNum = 100794698;BA.debugLine="slid.SetTabIndex(nc.TabIndex)";
_slid._settabindex /*b4j.example.vmslider*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794702;
 //BA.debugLineNum = 100794702;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, slid.ToStri";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_slid._tostring /*String*/ (null));
 break; }
case 16: {
RDebugUtils.currentLine=100794704;
 //BA.debugLineNum = 100794704;BA.debugLine="Dim ni As VMNumberInput = CreateNumberInput(nc";
_ni = __ref._createnumberinput /*b4j.example.vmnumberinput*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794705;
 //BA.debugLineNum = 100794705;BA.debugLine="ni.SetMin(nc.minvalue)";
_ni._setmin /*b4j.example.vmnumberinput*/ (null,BA.NumberToString(_nc._minvalue /*int*/ ));
RDebugUtils.currentLine=100794706;
 //BA.debugLineNum = 100794706;BA.debugLine="ni.SetMax(nc.maxvalue)";
_ni._setmax /*b4j.example.vmnumberinput*/ (null,BA.NumberToString(_nc._maxvalue /*int*/ ));
RDebugUtils.currentLine=100794707;
 //BA.debugLineNum = 100794707;BA.debugLine="ni.SetLabel(nc.label)";
_ni._setlabel /*b4j.example.vmnumberinput*/ (null,_nc._label /*String*/ );
RDebugUtils.currentLine=100794708;
 //BA.debugLineNum = 100794708;BA.debugLine="ni.SetReadOnly(nc.readonly)";
_ni._setreadonly /*b4j.example.vmnumberinput*/ (null,_nc._readonly /*boolean*/ );
RDebugUtils.currentLine=100794709;
 //BA.debugLineNum = 100794709;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794710;
 //BA.debugLineNum = 100794710;BA.debugLine="ni.SetVModel(nc.name)";
_ni._setvmodel /*b4j.example.vmnumberinput*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794711;
 //BA.debugLineNum = 100794711;BA.debugLine="ni.SetVShow(showKey)";
_ni._setvshow /*b4j.example.vmnumberinput*/ (null,_showkey);
RDebugUtils.currentLine=100794712;
 //BA.debugLineNum = 100794712;BA.debugLine="ni.SetDisabled(nc.IsDisabled)";
_ni._setdisabled /*b4j.example.vmnumberinput*/ (null,_nc._isdisabled /*boolean*/ );
 };
RDebugUtils.currentLine=100794714;
 //BA.debugLineNum = 100794714;BA.debugLine="ni.SetName(nc.name,False)";
_ni._setname /*b4j.example.vmnumberinput*/ (null,(Object)(_nc._name /*String*/ ),__c.False);
RDebugUtils.currentLine=100794715;
 //BA.debugLineNum = 100794715;BA.debugLine="ni.SetTabIndex(nc.TabIndex)";
_ni._settabindex /*b4j.example.vmnumberinput*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794719;
 //BA.debugLineNum = 100794719;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, ni.ToString";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_ni._tostring /*String*/ (null));
 break; }
case 17: 
case 18: {
RDebugUtils.currentLine=100794721;
 //BA.debugLineNum = 100794721;BA.debugLine="isarray = False";
_isarray = __c.False;
RDebugUtils.currentLine=100794722;
 //BA.debugLineNum = 100794722;BA.debugLine="Dim sel As VMSelect = CreateSelect(nc.name, mo";
_sel = __ref._createselect /*b4j.example.vmselect*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794723;
 //BA.debugLineNum = 100794723;BA.debugLine="sel.SetLabel(nc.label)";
_sel._setlabel /*b4j.example.vmselect*/ (null,(Object)(_nc._label /*String*/ ));
RDebugUtils.currentLine=100794724;
 //BA.debugLineNum = 100794724;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794725;
 //BA.debugLineNum = 100794725;BA.debugLine="sel.SetVModel(nc.name)";
_sel._setvmodel /*b4j.example.vmselect*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794726;
 //BA.debugLineNum = 100794726;BA.debugLine="sel.SetVShow(showKey)";
_sel._setvshow /*b4j.example.vmselect*/ (null,_showkey);
RDebugUtils.currentLine=100794727;
 //BA.debugLineNum = 100794727;BA.debugLine="sel.SetDisabled(nc.IsDisabled)";
_sel._setdisabled /*b4j.example.vmselect*/ (null,_nc._isdisabled /*boolean*/ );
RDebugUtils.currentLine=100794728;
 //BA.debugLineNum = 100794728;BA.debugLine="sel.SetRequired(nc.required)";
_sel._setrequired /*b4j.example.vmselect*/ (null,_nc._required /*boolean*/ );
 };
RDebugUtils.currentLine=100794730;
 //BA.debugLineNum = 100794730;BA.debugLine="sel.SetTabIndex(nc.TabIndex)";
_sel._settabindex /*b4j.example.vmselect*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794731;
 //BA.debugLineNum = 100794731;BA.debugLine="sel.SetPlaceholder(nc.placeholder)";
_sel._setplaceholder /*b4j.example.vmselect*/ (null,_nc._placeholder /*String*/ );
RDebugUtils.currentLine=100794732;
 //BA.debugLineNum = 100794732;BA.debugLine="sel.SetHelperText(nc.helperText)";
_sel._sethelpertext /*b4j.example.vmselect*/ (null,_nc._helpertext /*String*/ );
RDebugUtils.currentLine=100794733;
 //BA.debugLineNum = 100794733;BA.debugLine="sel.SetErrorText(nc.errorText)";
_sel._seterrortext /*b4j.example.vmselect*/ (null,_nc._errortext /*String*/ );
RDebugUtils.currentLine=100794734;
 //BA.debugLineNum = 100794734;BA.debugLine="sel.SetDense(nc.Dense)";
_sel._setdense /*b4j.example.vmselect*/ (null,_nc._dense /*boolean*/ );
RDebugUtils.currentLine=100794735;
 //BA.debugLineNum = 100794735;BA.debugLine="If nc.UseOptions = True Then";
if (_nc._useoptions /*boolean*/ ==__c.True) { 
RDebugUtils.currentLine=100794736;
 //BA.debugLineNum = 100794736;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794737;
 //BA.debugLineNum = 100794737;BA.debugLine="sel.SetOptions(nc.sourceTable, nc.options, n";
_sel._setoptions /*String*/ (null,_nc._sourcetable /*String*/ ,_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ ,_nc._sourcefield /*String*/ ,_nc._displayfield /*String*/ );
 }else {
RDebugUtils.currentLine=100794739;
 //BA.debugLineNum = 100794739;BA.debugLine="For Each ok As String In nc.options.keys";
{
final anywheresoftware.b4a.BA.IterableList group326 = _nc._options /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen326 = group326.getSize()
;int index326 = 0;
;
for (; index326 < groupLen326;index326++){
_ok = BA.ObjectToString(group326.Get(index326));
RDebugUtils.currentLine=100794740;
 //BA.debugLineNum = 100794740;BA.debugLine="Dim ov As String = nc.options.Get(ok)";
_ov = BA.ObjectToString(_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_ok)));
RDebugUtils.currentLine=100794741;
 //BA.debugLineNum = 100794741;BA.debugLine="sel.additem(ok, ov)";
_sel._additem /*b4j.example.vmselect*/ (null,_ok,_ov);
 }
};
 };
 }else {
RDebugUtils.currentLine=100794745;
 //BA.debugLineNum = 100794745;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794746;
 //BA.debugLineNum = 100794746;BA.debugLine="sel.SetDataSource(nc.sourceTable, nc.sourceF";
_sel._setdatasource /*String*/ (null,_nc._sourcetable /*String*/ ,_nc._sourcefield /*String*/ ,_nc._displayfield /*String*/ );
 };
 };
RDebugUtils.currentLine=100794749;
 //BA.debugLineNum = 100794749;BA.debugLine="sel.SetMultiple(nc.multiple)";
_sel._setmultiple /*b4j.example.vmselect*/ (null,_nc._multiple /*boolean*/ );
RDebugUtils.currentLine=100794750;
 //BA.debugLineNum = 100794750;BA.debugLine="sel.SetDense(True)";
_sel._setdense /*b4j.example.vmselect*/ (null,__c.True);
RDebugUtils.currentLine=100794751;
 //BA.debugLineNum = 100794751;BA.debugLine="If nc.multiple Then isarray = True";
if (_nc._multiple /*boolean*/ ) { 
_isarray = __c.True;};
RDebugUtils.currentLine=100794755;
 //BA.debugLineNum = 100794755;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, sel.ToStrin";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_sel._tostring /*String*/ (null));
 break; }
case 19: 
case 20: {
RDebugUtils.currentLine=100794777;
 //BA.debugLineNum = 100794777;BA.debugLine="Dim datex As VMDatePicker = CreateDatePicker(n";
_datex = __ref._createdatepicker /*b4j.example.vmdatepicker*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794778;
 //BA.debugLineNum = 100794778;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794779;
 //BA.debugLineNum = 100794779;BA.debugLine="datex.SetVModel(nc.name)";
_datex._setvmodel /*b4j.example.vmdatepicker*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794780;
 //BA.debugLineNum = 100794780;BA.debugLine="datex.SetVShow(showKey)";
_datex._setvshow /*b4j.example.vmdatepicker*/ (null,_showkey);
RDebugUtils.currentLine=100794781;
 //BA.debugLineNum = 100794781;BA.debugLine="datex.SetDisabled(nc.IsDisabled)";
_datex._setdisabled /*b4j.example.vmdatepicker*/ (null,_nc._isdisabled /*boolean*/ );
RDebugUtils.currentLine=100794782;
 //BA.debugLineNum = 100794782;BA.debugLine="datex.SetRequired(nc.required)";
_datex._setrequired /*b4j.example.vmdatepicker*/ (null,_nc._required /*boolean*/ );
 };
RDebugUtils.currentLine=100794784;
 //BA.debugLineNum = 100794784;BA.debugLine="datex.SetLabel(nc.label)";
_datex._setlabel /*b4j.example.vmdatepicker*/ (null,_nc._label /*String*/ );
RDebugUtils.currentLine=100794785;
 //BA.debugLineNum = 100794785;BA.debugLine="datex.SetImmediately(nc.immediately)";
_datex._setimmediately /*b4j.example.vmdatepicker*/ (null,_nc._immediately /*boolean*/ );
RDebugUtils.currentLine=100794786;
 //BA.debugLineNum = 100794786;BA.debugLine="datex.SetOpenOnFocus(nc.openonfocus)";
_datex._setopenonfocus /*b4j.example.vmdatepicker*/ (null,_nc._openonfocus /*boolean*/ );
RDebugUtils.currentLine=100794787;
 //BA.debugLineNum = 100794787;BA.debugLine="datex.SetClearable(nc.clearable)";
_datex._setclearable /*b4j.example.vmdatepicker*/ (null,_nc._clearable /*boolean*/ );
RDebugUtils.currentLine=100794788;
 //BA.debugLineNum = 100794788;BA.debugLine="datex.SetTabIndex(nc.TabIndex)";
_datex._settabindex /*b4j.example.vmdatepicker*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794794;
 //BA.debugLineNum = 100794794;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, datex.ToStr";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_datex._tostring /*String*/ (null));
 break; }
case 21: {
RDebugUtils.currentLine=100794797;
 //BA.debugLineNum = 100794797;BA.debugLine="Dim chk As VMCheckBox = CreateCheckBox(nc.name";
_chk = __ref._createcheckbox /*b4j.example.vmcheckbox*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794798;
 //BA.debugLineNum = 100794798;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794799;
 //BA.debugLineNum = 100794799;BA.debugLine="chk.SetVModel(nc.name)";
_chk._setvmodel /*b4j.example.vmcheckbox*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794800;
 //BA.debugLineNum = 100794800;BA.debugLine="chk.SetVShow(showKey)";
_chk._setvshow /*b4j.example.vmcheckbox*/ (null,_showkey);
RDebugUtils.currentLine=100794801;
 //BA.debugLineNum = 100794801;BA.debugLine="chk.SetDisabled(nc.IsDisabled)";
_chk._setdisabled /*b4j.example.vmcheckbox*/ (null,_nc._isdisabled /*boolean*/ );
 };
RDebugUtils.currentLine=100794803;
 //BA.debugLineNum = 100794803;BA.debugLine="chk.SetValue(nc.value)";
_chk._setvalue /*b4j.example.vmcheckbox*/ (null,(Object)(_nc._value /*String*/ ));
RDebugUtils.currentLine=100794804;
 //BA.debugLineNum = 100794804;BA.debugLine="chk.SetText(nc.label)";
_chk._settext /*b4j.example.vmcheckbox*/ (null,_nc._label /*String*/ );
RDebugUtils.currentLine=100794805;
 //BA.debugLineNum = 100794805;BA.debugLine="chk.SetPrimary(True)";
_chk._setprimary /*b4j.example.vmcheckbox*/ (null,__c.True);
RDebugUtils.currentLine=100794806;
 //BA.debugLineNum = 100794806;BA.debugLine="chk.SetName(nc.name,False)";
_chk._setname /*b4j.example.vmcheckbox*/ (null,(Object)(_nc._name /*String*/ ),__c.False);
RDebugUtils.currentLine=100794807;
 //BA.debugLineNum = 100794807;BA.debugLine="chk.SetTabIndex(nc.TabIndex)";
_chk._settabindex /*b4j.example.vmcheckbox*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794811;
 //BA.debugLineNum = 100794811;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, chk.ToStrin";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_chk._tostring /*String*/ (null));
 break; }
case 22: 
case 23: {
RDebugUtils.currentLine=100794814;
 //BA.debugLineNum = 100794814;BA.debugLine="Dim sw As VMSwitch = CreateSwitch(nc.name, mod";
_sw = __ref._createswitch /*b4j.example.vmswitch*/ (null,_nc._name /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794815;
 //BA.debugLineNum = 100794815;BA.debugLine="sw.SetText(nc.label)";
_sw._settext /*b4j.example.vmswitch*/ (null,_nc._label /*String*/ );
RDebugUtils.currentLine=100794816;
 //BA.debugLineNum = 100794816;BA.debugLine="sw.SetValue(nc.value)";
_sw._setvalue /*b4j.example.vmswitch*/ (null,(Object)(_nc._value /*String*/ ));
RDebugUtils.currentLine=100794817;
 //BA.debugLineNum = 100794817;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794818;
 //BA.debugLineNum = 100794818;BA.debugLine="sw.SetVShow(showKey)";
_sw._setvshow /*b4j.example.vmswitch*/ (null,(Object)(_showkey));
RDebugUtils.currentLine=100794819;
 //BA.debugLineNum = 100794819;BA.debugLine="sw.SetVModel(nc.name)";
_sw._setvmodel /*b4j.example.vmswitch*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794820;
 //BA.debugLineNum = 100794820;BA.debugLine="sw.SetDisabled(nc.IsDisabled)";
_sw._setdisabled /*b4j.example.vmswitch*/ (null,_nc._isdisabled /*boolean*/ );
 };
RDebugUtils.currentLine=100794822;
 //BA.debugLineNum = 100794822;BA.debugLine="sw.SetName(nc.name,False)";
_sw._setname /*b4j.example.vmswitch*/ (null,(Object)(_nc._name /*String*/ ),__c.False);
RDebugUtils.currentLine=100794823;
 //BA.debugLineNum = 100794823;BA.debugLine="sw.SetPrimary(True)";
_sw._setprimary /*b4j.example.vmswitch*/ (null,__c.True);
RDebugUtils.currentLine=100794824;
 //BA.debugLineNum = 100794824;BA.debugLine="sw.SetTabIndex(nc.TabIndex)";
_sw._settabindex /*b4j.example.vmswitch*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794828;
 //BA.debugLineNum = 100794828;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, sw.ToString";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_sw._tostring /*String*/ (null));
 break; }
case 24: {
RDebugUtils.currentLine=100794830;
 //BA.debugLineNum = 100794830;BA.debugLine="Dim icn As VMIcon = CreateIcon(nc.name)";
_icn = __ref._createicon /*b4j.example.vmicon*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794831;
 //BA.debugLineNum = 100794831;BA.debugLine="icn.SetText(nc.IconName)";
_icn._settext /*b4j.example.vmicon*/ (null,_nc._iconname /*String*/ );
RDebugUtils.currentLine=100794832;
 //BA.debugLineNum = 100794832;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794833;
 //BA.debugLineNum = 100794833;BA.debugLine="icn.SetVShow(showKey)";
_icn._setvshow /*b4j.example.vmicon*/ (null,(Object)(_showkey));
 };
RDebugUtils.currentLine=100794835;
 //BA.debugLineNum = 100794835;BA.debugLine="icn.SetName(nc.name,False)";
_icn._setname /*b4j.example.vmicon*/ (null,_nc._name /*String*/ ,__c.False);
RDebugUtils.currentLine=100794836;
 //BA.debugLineNum = 100794836;BA.debugLine="Select Case nc.IconSize";
switch (BA.switchObjectToInt(_nc._iconsize /*String*/ ,"normal","2","3","4","5")) {
case 0: {
 break; }
case 1: {
RDebugUtils.currentLine=100794839;
 //BA.debugLineNum = 100794839;BA.debugLine="icn.SetSize2x(True)";
_icn._setsize2x /*b4j.example.vmicon*/ (null,__c.True);
 break; }
case 2: {
RDebugUtils.currentLine=100794841;
 //BA.debugLineNum = 100794841;BA.debugLine="icn.SetSize3x(True)";
_icn._setsize3x /*b4j.example.vmicon*/ (null,__c.True);
 break; }
case 3: {
RDebugUtils.currentLine=100794843;
 //BA.debugLineNum = 100794843;BA.debugLine="icn.SetSize4x(True)";
_icn._setsize4x /*b4j.example.vmicon*/ (null,__c.True);
 break; }
case 4: {
RDebugUtils.currentLine=100794845;
 //BA.debugLineNum = 100794845;BA.debugLine="icn.SetSize5x(True)";
_icn._setsize5x /*b4j.example.vmicon*/ (null,__c.True);
 break; }
}
;
RDebugUtils.currentLine=100794847;
 //BA.debugLineNum = 100794847;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, icn.ToStrin";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_icn._tostring /*String*/ (null));
 break; }
case 25: 
case 26: {
RDebugUtils.currentLine=100794866;
 //BA.debugLineNum = 100794866;BA.debugLine="Dim rg As VMRadioGroup = CreateRadioGroup(nc.n";
_rg = __ref._createradiogroup /*b4j.example.vmradiogroup*/ (null,_nc._name /*String*/ ,_nc._label /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794867;
 //BA.debugLineNum = 100794867;BA.debugLine="rg.SetDesignMode(DesignMode)";
_rg._setdesignmode /*b4j.example.vmradiogroup*/ (null,__ref._designmode /*boolean*/ );
RDebugUtils.currentLine=100794868;
 //BA.debugLineNum = 100794868;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794869;
 //BA.debugLineNum = 100794869;BA.debugLine="rg.SetVShow(showKey)";
_rg._setvshow /*b4j.example.vmradiogroup*/ (null,_showkey);
RDebugUtils.currentLine=100794870;
 //BA.debugLineNum = 100794870;BA.debugLine="rg.SetVModel(nc.name)";
_rg._setvmodel /*b4j.example.vmradiogroup*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794871;
 //BA.debugLineNum = 100794871;BA.debugLine="rg.SetValue(nc.value)";
_rg._setvalue /*b4j.example.vmradiogroup*/ (null,(Object)(_nc._value /*String*/ ));
 };
RDebugUtils.currentLine=100794873;
 //BA.debugLineNum = 100794873;BA.debugLine="rg.AddItems(nc.options)";
_rg._additems /*b4j.example.vmradiogroup*/ (null,_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=100794874;
 //BA.debugLineNum = 100794874;BA.debugLine="rg.SetTabIndex(nc.TabIndex)";
_rg._settabindex /*b4j.example.vmradiogroup*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794875;
 //BA.debugLineNum = 100794875;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, rg.ToString";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_rg._tostring /*String*/ (null));
 break; }
case 27: {
RDebugUtils.currentLine=100794877;
 //BA.debugLineNum = 100794877;BA.debugLine="isarray = True";
_isarray = __c.True;
RDebugUtils.currentLine=100794878;
 //BA.debugLineNum = 100794878;BA.debugLine="Dim cg As VMCheckBoxGroup = CreateCheckBoxGrou";
_cg = __ref._createcheckboxgroup /*b4j.example.vmcheckboxgroup*/ (null,_nc._name /*String*/ ,_nc._label /*String*/ ,__ref._module /*Object*/ );
RDebugUtils.currentLine=100794879;
 //BA.debugLineNum = 100794879;BA.debugLine="cg.SetDesignMode(DesignMode)";
_cg._setdesignmode /*b4j.example.vmcheckboxgroup*/ (null,__ref._designmode /*boolean*/ );
RDebugUtils.currentLine=100794880;
 //BA.debugLineNum = 100794880;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794881;
 //BA.debugLineNum = 100794881;BA.debugLine="cg.SetVShow(showKey)";
_cg._setvshow /*b4j.example.vmcheckboxgroup*/ (null,_showkey);
RDebugUtils.currentLine=100794882;
 //BA.debugLineNum = 100794882;BA.debugLine="cg.SetVModel(nc.name)";
_cg._setvmodel /*b4j.example.vmcheckboxgroup*/ (null,_nc._name /*String*/ );
RDebugUtils.currentLine=100794883;
 //BA.debugLineNum = 100794883;BA.debugLine="cg.SetValue(nc.value)";
_cg._setvalue /*b4j.example.vmcheckboxgroup*/ (null,(Object)(_nc._value /*String*/ ));
 };
RDebugUtils.currentLine=100794885;
 //BA.debugLineNum = 100794885;BA.debugLine="cg.AddItems(nc.options)";
_cg._additems /*b4j.example.vmcheckboxgroup*/ (null,_nc._options /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=100794886;
 //BA.debugLineNum = 100794886;BA.debugLine="cg.SetTabIndex(nc.TabIndex)";
_cg._settabindex /*b4j.example.vmcheckboxgroup*/ (null,BA.NumberToString(_nc._tabindex /*int*/ ));
RDebugUtils.currentLine=100794887;
 //BA.debugLineNum = 100794887;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, cg.ToString";
__ref._grid /*b4j.example.vmgrid*/ ._addcomponent /*String*/ (null,(int)(Double.parseDouble(_nc._row /*String*/ )),(int)(Double.parseDouble(_nc._cell /*String*/ )),_cg._tostring /*String*/ (null));
 break; }
}
;
RDebugUtils.currentLine=100794890;
 //BA.debugLineNum = 100794890;BA.debugLine="If DesignMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=100794891;
 //BA.debugLineNum = 100794891;BA.debugLine="vue.SetStateSingle(showKey, nc.Isvisible)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_showkey,(Object)(_nc._isvisible /*boolean*/ ));
RDebugUtils.currentLine=100794892;
 //BA.debugLineNum = 100794892;BA.debugLine="vue.SetStateSingle(disKey, nc.IsDisabled)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_diskey,(Object)(_nc._isdisabled /*boolean*/ ));
RDebugUtils.currentLine=100794893;
 //BA.debugLineNum = 100794893;BA.debugLine="vue.SetStateSingle(enaKey, nc.Required)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_enakey,(Object)(_nc._required /*boolean*/ ));
RDebugUtils.currentLine=100794894;
 //BA.debugLineNum = 100794894;BA.debugLine="If isarray Then";
if (_isarray) { 
RDebugUtils.currentLine=100794895;
 //BA.debugLineNum = 100794895;BA.debugLine="vue.SetStateSingle(nc.name, Array())";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_nc._name /*String*/ ,(Object)(new Object[]{}));
 }else {
RDebugUtils.currentLine=100794897;
 //BA.debugLineNum = 100794897;BA.debugLine="vue.SetStateSingle(nc.name, nc.defaultValue)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_nc._name /*String*/ ,_nc._defaultvalue /*Object*/ );
 };
RDebugUtils.currentLine=100794899;
 //BA.debugLineNum = 100794899;BA.debugLine="vue.SetStateSingle(errKey, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_errkey,(Object)(__c.False));
 };
 }
};
RDebugUtils.currentLine=100794902;
 //BA.debugLineNum = 100794902;BA.debugLine="End Sub";
return "";
}
public String  _buildgrid(b4j.example.vmcontainer __ref,b4j.example.vmgrid _parentgrid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "buildgrid", true))
	 {return ((String) Debug.delegate(ba, "buildgrid", new Object[] {_parentgrid}));}
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
RDebugUtils.currentLine=101187584;
 //BA.debugLineNum = 101187584;BA.debugLine="private Sub BuildGrid(parentGrid As VMGrid)";
RDebugUtils.currentLine=101187586;
 //BA.debugLineNum = 101187586;BA.debugLine="sortItL.Initialize";
__ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=101187587;
 //BA.debugLineNum = 101187587;BA.debugLine="For Each k As String In sortitM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._sortitm /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=101187588;
 //BA.debugLineNum = 101187588;BA.debugLine="sortItL.Add(k)";
__ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_k));
 }
};
RDebugUtils.currentLine=101187591;
 //BA.debugLineNum = 101187591;BA.debugLine="sortItL.Sort(True)";
__ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ .Sort(__c.True);
RDebugUtils.currentLine=101187593;
 //BA.debugLineNum = 101187593;BA.debugLine="Dim missingRC As List";
_missingrc = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=101187594;
 //BA.debugLineNum = 101187594;BA.debugLine="missingRC.Initialize";
_missingrc.Initialize();
RDebugUtils.currentLine=101187595;
 //BA.debugLineNum = 101187595;BA.debugLine="For compCnt = 1 To TotalRows";
{
final int step8 = 1;
final int limit8 = __ref._totalrows /*int*/ ;
_compcnt = (int) (1) ;
for (;_compcnt <= limit8 ;_compcnt = _compcnt + step8 ) {
RDebugUtils.currentLine=101187596;
 //BA.debugLineNum = 101187596;BA.debugLine="Dim sRow As String = compCnt";
_srow = BA.NumberToString(_compcnt);
RDebugUtils.currentLine=101187597;
 //BA.debugLineNum = 101187597;BA.debugLine="sRow = vue.PadRight(sRow,2,\"0\")";
_srow = __ref._vue /*b4j.example.bananovue*/ ._padright /*String*/ (null,_srow,(int) (2),"0");
RDebugUtils.currentLine=101187598;
 //BA.debugLineNum = 101187598;BA.debugLine="Dim sCell As String = vue.PadRight(\"1\",2,\"0\")";
_scell = __ref._vue /*b4j.example.bananovue*/ ._padright /*String*/ (null,"1",(int) (2),"0");
RDebugUtils.currentLine=101187599;
 //BA.debugLineNum = 101187599;BA.debugLine="Dim rcKey As String = $\"${sRow}.${sCell}\"$";
_rckey = (""+__c.SmartStringFormatter("",(Object)(_srow))+"."+__c.SmartStringFormatter("",(Object)(_scell))+"");
RDebugUtils.currentLine=101187600;
 //BA.debugLineNum = 101187600;BA.debugLine="If sortItL.IndexOf(rcKey) = -1 Then";
if (__ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ .IndexOf((Object)(_rckey))==-1) { 
RDebugUtils.currentLine=101187601;
 //BA.debugLineNum = 101187601;BA.debugLine="missingRC.Add(rcKey)";
_missingrc.Add((Object)(_rckey));
 };
 }
};
RDebugUtils.currentLine=101187604;
 //BA.debugLineNum = 101187604;BA.debugLine="If missingRC.Size -1 >= 0 Then";
if (_missingrc.getSize()-1>=0) { 
RDebugUtils.currentLine=101187605;
 //BA.debugLineNum = 101187605;BA.debugLine="For Each rc As String In missingRC";
{
final anywheresoftware.b4a.BA.IterableList group18 = _missingrc;
final int groupLen18 = group18.getSize()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_rc = BA.ObjectToString(group18.Get(index18));
RDebugUtils.currentLine=101187606;
 //BA.debugLineNum = 101187606;BA.debugLine="Log(\"VMContainer: \"& rc & \": RC is NOT defined\"";
__c.Log("VMContainer: "+_rc+": RC is NOT defined");
 }
};
RDebugUtils.currentLine=101187609;
 //BA.debugLineNum = 101187609;BA.debugLine="Return";
if (true) return "";
 };
RDebugUtils.currentLine=101187614;
 //BA.debugLineNum = 101187614;BA.debugLine="Dim finalRows As Map";
_finalrows = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=101187615;
 //BA.debugLineNum = 101187615;BA.debugLine="finalRows.Initialize";
_finalrows.Initialize();
RDebugUtils.currentLine=101187616;
 //BA.debugLineNum = 101187616;BA.debugLine="For Each rc As String In sortItL";
{
final anywheresoftware.b4a.BA.IterableList group25 = __ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen25 = group25.getSize()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_rc = BA.ObjectToString(group25.Get(index25));
RDebugUtils.currentLine=101187617;
 //BA.debugLineNum = 101187617;BA.debugLine="Dim sRow As String = vue.MvField(rc,1,\".\")";
_srow = __ref._vue /*b4j.example.bananovue*/ ._mvfield /*String*/ (null,_rc,(int) (1),".");
RDebugUtils.currentLine=101187618;
 //BA.debugLineNum = 101187618;BA.debugLine="If finalRows.ContainsKey(sRow) Then";
if (_finalrows.ContainsKey((Object)(_srow))) { 
RDebugUtils.currentLine=101187619;
 //BA.debugLineNum = 101187619;BA.debugLine="Dim finalCells As List = finalRows.Get(sRow)";
_finalcells = new anywheresoftware.b4a.objects.collections.List();
_finalcells.setObject((java.util.List)(_finalrows.Get((Object)(_srow))));
 }else {
RDebugUtils.currentLine=101187621;
 //BA.debugLineNum = 101187621;BA.debugLine="Dim finalCells As List";
_finalcells = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=101187622;
 //BA.debugLineNum = 101187622;BA.debugLine="finalCells.Initialize";
_finalcells.Initialize();
 };
RDebugUtils.currentLine=101187624;
 //BA.debugLineNum = 101187624;BA.debugLine="finalCells.Add(rc)";
_finalcells.Add((Object)(_rc));
RDebugUtils.currentLine=101187625;
 //BA.debugLineNum = 101187625;BA.debugLine="finalRows.Put(sRow,finalCells)";
_finalrows.Put((Object)(_srow),(Object)(_finalcells.getObject()));
 }
};
RDebugUtils.currentLine=101187629;
 //BA.debugLineNum = 101187629;BA.debugLine="sortItL.Initialize";
__ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=101187630;
 //BA.debugLineNum = 101187630;BA.debugLine="For Each strRow As String In finalRows.Keys";
{
final anywheresoftware.b4a.BA.IterableList group37 = _finalrows.Keys();
final int groupLen37 = group37.getSize()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_strrow = BA.ObjectToString(group37.Get(index37));
RDebugUtils.currentLine=101187631;
 //BA.debugLineNum = 101187631;BA.debugLine="sortItL.Add(strRow)";
__ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_strrow));
 }
};
RDebugUtils.currentLine=101187633;
 //BA.debugLineNum = 101187633;BA.debugLine="sortItL.Sort(True)";
__ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ .Sort(__c.True);
RDebugUtils.currentLine=101187634;
 //BA.debugLineNum = 101187634;BA.debugLine="Dim colCnt As Int";
_colcnt = 0;
RDebugUtils.currentLine=101187635;
 //BA.debugLineNum = 101187635;BA.debugLine="For Each finalRow As String In sortItL";
{
final anywheresoftware.b4a.BA.IterableList group42 = __ref._sortitl /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen42 = group42.getSize()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_finalrow = BA.ObjectToString(group42.Get(index42));
RDebugUtils.currentLine=101187636;
 //BA.debugLineNum = 101187636;BA.debugLine="Dim er As EachRow = rows.Get(finalRow)";
_er = (b4j.example.vmcontainer._eachrow)(__ref._rows /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_finalrow)));
RDebugUtils.currentLine=101187639;
 //BA.debugLineNum = 101187639;BA.debugLine="Dim finalCell(11) As String";
_finalcell = new String[(int) (11)];
java.util.Arrays.fill(_finalcell,"");
RDebugUtils.currentLine=101187640;
 //BA.debugLineNum = 101187640;BA.debugLine="Dim ec(11) As VMInputControl";
_ec = new b4j.example.vminputcontrol[(int) (11)];
{
int d0 = _ec.length;
for (int i0 = 0;i0 < d0;i0++) {
_ec[i0] = new b4j.example.vminputcontrol();
}
}
;
RDebugUtils.currentLine=101187643;
 //BA.debugLineNum = 101187643;BA.debugLine="Dim finalCells As List = finalRows.Get(finalRow)";
_finalcells = new anywheresoftware.b4a.objects.collections.List();
_finalcells.setObject((java.util.List)(_finalrows.Get((Object)(_finalrow))));
RDebugUtils.currentLine=101187645;
 //BA.debugLineNum = 101187645;BA.debugLine="Dim finalCellsSize As Int = finalCells.Size - 1";
_finalcellssize = (int) (_finalcells.getSize()-1);
RDebugUtils.currentLine=101187646;
 //BA.debugLineNum = 101187646;BA.debugLine="For colCnt = 0 To finalCellsSize";
{
final int step48 = 1;
final int limit48 = _finalcellssize;
_colcnt = (int) (0) ;
for (;_colcnt <= limit48 ;_colcnt = _colcnt + step48 ) {
RDebugUtils.currentLine=101187647;
 //BA.debugLineNum = 101187647;BA.debugLine="finalCell(colCnt) = finalCells.Get(colCnt)";
_finalcell[_colcnt] = BA.ObjectToString(_finalcells.Get(_colcnt));
RDebugUtils.currentLine=101187648;
 //BA.debugLineNum = 101187648;BA.debugLine="ec(colCnt) = sortitM.Get(finalCell(colCnt))";
_ec[_colcnt] = (b4j.example.vminputcontrol)(__ref._sortitm /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_finalcell[_colcnt])));
 }
};
RDebugUtils.currentLine=101187651;
 //BA.debugLineNum = 101187651;BA.debugLine="parentGrid.AddRow(1, er.Visibility, \"\", \"\")";
_parentgrid._addrow /*b4j.example.vmgrid*/ (null,(int) (1),_er.visibility /*String*/ ,"","");
RDebugUtils.currentLine=101187652;
 //BA.debugLineNum = 101187652;BA.debugLine="Dim cellSize As Int";
_cellsize = 0;
RDebugUtils.currentLine=101187653;
 //BA.debugLineNum = 101187653;BA.debugLine="For cellSize = 0 To finalCellsSize";
{
final int step54 = 1;
final int limit54 = _finalcellssize;
_cellsize = (int) (0) ;
for (;_cellsize <= limit54 ;_cellsize = _cellsize + step54 ) {
RDebugUtils.currentLine=101187655;
 //BA.debugLineNum = 101187655;BA.debugLine="parentGrid.AddColumnOSMP(1, ec(cellSize).Offset";
_parentgrid._addcolumnosmp /*b4j.example.vmgrid*/ (null,(int) (1),_ec[_cellsize]._offsetsmall /*String*/ ,_ec[_cellsize]._offsetmedium /*String*/ ,_ec[_cellsize]._offsetlarge /*String*/ ,_ec[_cellsize]._offsetxlarge /*String*/ ,_ec[_cellsize]._sizesmall /*String*/ ,_ec[_cellsize]._sizemedium /*String*/ ,_ec[_cellsize]._sizelarge /*String*/ ,_ec[_cellsize]._sizexlarge /*String*/ ,"",_ec[_cellsize]._visibility /*String*/ ,"");
 }
};
 }
};
RDebugUtils.currentLine=101187660;
 //BA.debugLineNum = 101187660;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlist  _createlist(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createlist", true))
	 {return ((b4j.example.vmlist) Debug.delegate(ba, "createlist", new Object[] {_sid,_eventhandler}));}
b4j.example.vmlist _el = null;
RDebugUtils.currentLine=98172928;
 //BA.debugLineNum = 98172928;BA.debugLine="private Sub CreateList(sid As String,eventHandler";
RDebugUtils.currentLine=98172929;
 //BA.debugLineNum = 98172929;BA.debugLine="Dim el As VMList";
_el = new b4j.example.vmlist();
RDebugUtils.currentLine=98172930;
 //BA.debugLineNum = 98172930;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmlist*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=98172931;
 //BA.debugLineNum = 98172931;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98172932;
 //BA.debugLineNum = 98172932;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlistitem  _createlistitem(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createlistitem", true))
	 {return ((b4j.example.vmlistitem) Debug.delegate(ba, "createlistitem", new Object[] {_sid,_eventhandler}));}
b4j.example.vmlistitem _el = null;
RDebugUtils.currentLine=98238464;
 //BA.debugLineNum = 98238464;BA.debugLine="private Sub CreateListItem(sid As String, eventHan";
RDebugUtils.currentLine=98238465;
 //BA.debugLineNum = 98238465;BA.debugLine="Dim el As VMListItem";
_el = new b4j.example.vmlistitem();
RDebugUtils.currentLine=98238466;
 //BA.debugLineNum = 98238466;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmlistitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=98238467;
 //BA.debugLineNum = 98238467;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98238468;
 //BA.debugLineNum = 98238468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmbutton  _createbutton(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createbutton", true))
	 {return ((b4j.example.vmbutton) Debug.delegate(ba, "createbutton", new Object[] {_sid,_eventhandler}));}
b4j.example.vmbutton _el = null;
RDebugUtils.currentLine=98304000;
 //BA.debugLineNum = 98304000;BA.debugLine="private Sub CreateButton(sid As String, eventHandl";
RDebugUtils.currentLine=98304001;
 //BA.debugLineNum = 98304001;BA.debugLine="Dim el As VMButton";
_el = new b4j.example.vmbutton();
RDebugUtils.currentLine=98304002;
 //BA.debugLineNum = 98304002;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmbutton*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=98304003;
 //BA.debugLineNum = 98304003;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98304004;
 //BA.debugLineNum = 98304004;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _createtimepicker(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createtimepicker", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "createtimepicker", new Object[] {_sid,_eventhandler}));}
b4j.example.vmtimepicker _el = null;
RDebugUtils.currentLine=101122048;
 //BA.debugLineNum = 101122048;BA.debugLine="private Sub CreateTimePicker(sid As String, eventH";
RDebugUtils.currentLine=101122049;
 //BA.debugLineNum = 101122049;BA.debugLine="Dim el As VMTimePicker";
_el = new b4j.example.vmtimepicker();
RDebugUtils.currentLine=101122050;
 //BA.debugLineNum = 101122050;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmtimepicker*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101122051;
 //BA.debugLineNum = 101122051;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101122052;
 //BA.debugLineNum = 101122052;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchip  _createchip(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createchip", true))
	 {return ((b4j.example.vmchip) Debug.delegate(ba, "createchip", new Object[] {_sid,_eventhandler}));}
b4j.example.vmchip _el = null;
RDebugUtils.currentLine=101056512;
 //BA.debugLineNum = 101056512;BA.debugLine="private Sub CreateChip(sid As String, eventHandler";
RDebugUtils.currentLine=101056513;
 //BA.debugLineNum = 101056513;BA.debugLine="Dim el As VMChip";
_el = new b4j.example.vmchip();
RDebugUtils.currentLine=101056514;
 //BA.debugLineNum = 101056514;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmchip*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101056515;
 //BA.debugLineNum = 101056515;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101056516;
 //BA.debugLineNum = 101056516;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchips  _createchips(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createchips", true))
	 {return ((b4j.example.vmchips) Debug.delegate(ba, "createchips", new Object[] {_sid,_eventhandler}));}
b4j.example.vmchips _el = null;
RDebugUtils.currentLine=100990976;
 //BA.debugLineNum = 100990976;BA.debugLine="private Sub CreateChips(sid As String, eventHandle";
RDebugUtils.currentLine=100990977;
 //BA.debugLineNum = 100990977;BA.debugLine="Dim el As VMChips";
_el = new b4j.example.vmchips();
RDebugUtils.currentLine=100990978;
 //BA.debugLineNum = 100990978;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmchips*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=100990979;
 //BA.debugLineNum = 100990979;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=100990980;
 //BA.debugLineNum = 100990980;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _createlabel(b4j.example.vmcontainer __ref,String _lblid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "createlabel", new Object[] {_lblid}));}
b4j.example.vmlabel _el = null;
RDebugUtils.currentLine=100925440;
 //BA.debugLineNum = 100925440;BA.debugLine="private Sub CreateLABEL(lblID As String) As VMLabe";
RDebugUtils.currentLine=100925441;
 //BA.debugLineNum = 100925441;BA.debugLine="Dim el As VMLabel";
_el = new b4j.example.vmlabel();
RDebugUtils.currentLine=100925442;
 //BA.debugLineNum = 100925442;BA.debugLine="el.Initialize(vue, lblID)";
_el._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_lblid);
RDebugUtils.currentLine=100925443;
 //BA.debugLineNum = 100925443;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=100925444;
 //BA.debugLineNum = 100925444;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmimage  _createimage(b4j.example.vmcontainer __ref,String _img,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createimage", true))
	 {return ((b4j.example.vmimage) Debug.delegate(ba, "createimage", new Object[] {_img,_eventhandler}));}
b4j.example.vmimage _el = null;
RDebugUtils.currentLine=100859904;
 //BA.debugLineNum = 100859904;BA.debugLine="private Sub CreateImage(img As String, eventHandle";
RDebugUtils.currentLine=100859905;
 //BA.debugLineNum = 100859905;BA.debugLine="Dim el As VMImage";
_el = new b4j.example.vmimage();
RDebugUtils.currentLine=100859906;
 //BA.debugLineNum = 100859906;BA.debugLine="el.Initialize(vue, img, eventHandler)";
_el._initialize /*b4j.example.vmimage*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_img,_eventhandler);
RDebugUtils.currentLine=100859907;
 //BA.debugLineNum = 100859907;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=100859908;
 //BA.debugLineNum = 100859908;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _createfile(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createfile", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "createfile", new Object[] {_sid,_eventhandler}));}
b4j.example.vmfile _el = null;
RDebugUtils.currentLine=101384192;
 //BA.debugLineNum = 101384192;BA.debugLine="private Sub CreateFile(sid As String, eventHandler";
RDebugUtils.currentLine=101384193;
 //BA.debugLineNum = 101384193;BA.debugLine="Dim el As VMFile";
_el = new b4j.example.vmfile();
RDebugUtils.currentLine=101384194;
 //BA.debugLineNum = 101384194;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmfile*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101384195;
 //BA.debugLineNum = 101384195;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101384196;
 //BA.debugLineNum = 101384196;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createinput(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createinput", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "createinput", new Object[] {_sid,_eventhandler}));}
b4j.example.vminput _el = null;
RDebugUtils.currentLine=101449728;
 //BA.debugLineNum = 101449728;BA.debugLine="private Sub CreateInput(sid As String, eventHandle";
RDebugUtils.currentLine=101449729;
 //BA.debugLineNum = 101449729;BA.debugLine="Dim el As VMInput";
_el = new b4j.example.vminput();
RDebugUtils.currentLine=101449730;
 //BA.debugLineNum = 101449730;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vminput*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101449731;
 //BA.debugLineNum = 101449731;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101449732;
 //BA.debugLineNum = 101449732;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _createtextarea(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createtextarea", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "createtextarea", new Object[] {_sid,_eventhandler}));}
b4j.example.vmtextarea _el = null;
RDebugUtils.currentLine=101318656;
 //BA.debugLineNum = 101318656;BA.debugLine="private Sub CreateTextArea(sid As String, eventHan";
RDebugUtils.currentLine=101318657;
 //BA.debugLineNum = 101318657;BA.debugLine="Dim el As VMTextArea";
_el = new b4j.example.vmtextarea();
RDebugUtils.currentLine=101318658;
 //BA.debugLineNum = 101318658;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
_el._initialize /*b4j.example.vmtextarea*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101318659;
 //BA.debugLineNum = 101318659;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101318660;
 //BA.debugLineNum = 101318660;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminfobox  _createinfobox(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createinfobox", true))
	 {return ((b4j.example.vminfobox) Debug.delegate(ba, "createinfobox", new Object[] {_sid,_eventhandler}));}
b4j.example.vminfobox _el = null;
RDebugUtils.currentLine=101253120;
 //BA.debugLineNum = 101253120;BA.debugLine="private Sub CreateInfoBox(sid As String, eventHand";
RDebugUtils.currentLine=101253121;
 //BA.debugLineNum = 101253121;BA.debugLine="HasInfoBox = True";
__ref._hasinfobox /*boolean*/  = __c.True;
RDebugUtils.currentLine=101253122;
 //BA.debugLineNum = 101253122;BA.debugLine="Dim el As VMInfoBox";
_el = new b4j.example.vminfobox();
RDebugUtils.currentLine=101253123;
 //BA.debugLineNum = 101253123;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vminfobox*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101253124;
 //BA.debugLineNum = 101253124;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101253125;
 //BA.debugLineNum = 101253125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _createslider(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createslider", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "createslider", new Object[] {_sid,_eventhandler}));}
b4j.example.vmslider _el = null;
RDebugUtils.currentLine=101515264;
 //BA.debugLineNum = 101515264;BA.debugLine="private Sub CreateSlider(sid As String, eventHandl";
RDebugUtils.currentLine=101515265;
 //BA.debugLineNum = 101515265;BA.debugLine="Dim el As VMSlider";
_el = new b4j.example.vmslider();
RDebugUtils.currentLine=101515266;
 //BA.debugLineNum = 101515266;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmslider*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101515267;
 //BA.debugLineNum = 101515267;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101515268;
 //BA.debugLineNum = 101515268;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _createnumberinput(b4j.example.vmcontainer __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createnumberinput", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "createnumberinput", new Object[] {_sid}));}
b4j.example.vmnumberinput _el = null;
RDebugUtils.currentLine=101646336;
 //BA.debugLineNum = 101646336;BA.debugLine="private Sub CreateNumberInput(sid As String) As VM";
RDebugUtils.currentLine=101646337;
 //BA.debugLineNum = 101646337;BA.debugLine="Dim el As VMNumberInput";
_el = new b4j.example.vmnumberinput();
RDebugUtils.currentLine=101646338;
 //BA.debugLineNum = 101646338;BA.debugLine="el.Initialize(vue, sid)";
_el._initialize /*b4j.example.vmnumberinput*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid);
RDebugUtils.currentLine=101646339;
 //BA.debugLineNum = 101646339;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101646340;
 //BA.debugLineNum = 101646340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmselect  _createselect(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createselect", true))
	 {return ((b4j.example.vmselect) Debug.delegate(ba, "createselect", new Object[] {_sid,_eventhandler}));}
b4j.example.vmselect _el = null;
RDebugUtils.currentLine=101711872;
 //BA.debugLineNum = 101711872;BA.debugLine="private Sub CreateSelect(sid As String, eventHandl";
RDebugUtils.currentLine=101711873;
 //BA.debugLineNum = 101711873;BA.debugLine="Dim el As VMSelect";
_el = new b4j.example.vmselect();
RDebugUtils.currentLine=101711874;
 //BA.debugLineNum = 101711874;BA.debugLine="el.Initialize(vue,sid,eventHandler)";
_el._initialize /*b4j.example.vmselect*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101711875;
 //BA.debugLineNum = 101711875;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101711876;
 //BA.debugLineNum = 101711876;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _createdatepicker(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createdatepicker", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "createdatepicker", new Object[] {_sid,_eventhandler}));}
b4j.example.vmdatepicker _el = null;
RDebugUtils.currentLine=98369536;
 //BA.debugLineNum = 98369536;BA.debugLine="private Sub CreateDatePicker(sid As String, eventH";
RDebugUtils.currentLine=98369537;
 //BA.debugLineNum = 98369537;BA.debugLine="Dim el As VMDatePicker";
_el = new b4j.example.vmdatepicker();
RDebugUtils.currentLine=98369538;
 //BA.debugLineNum = 98369538;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmdatepicker*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=98369539;
 //BA.debugLineNum = 98369539;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98369540;
 //BA.debugLineNum = 98369540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _createcheckbox(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createcheckbox", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "createcheckbox", new Object[] {_sid,_eventhandler}));}
b4j.example.vmcheckbox _el = null;
RDebugUtils.currentLine=101842944;
 //BA.debugLineNum = 101842944;BA.debugLine="private Sub CreateCheckBox(sid As String, eventHan";
RDebugUtils.currentLine=101842945;
 //BA.debugLineNum = 101842945;BA.debugLine="Dim el As VMCheckBox";
_el = new b4j.example.vmcheckbox();
RDebugUtils.currentLine=101842946;
 //BA.debugLineNum = 101842946;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmcheckbox*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101842947;
 //BA.debugLineNum = 101842947;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101842948;
 //BA.debugLineNum = 101842948;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _createswitch(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createswitch", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "createswitch", new Object[] {_sid,_eventhandler}));}
b4j.example.vmswitch _el = null;
RDebugUtils.currentLine=101777408;
 //BA.debugLineNum = 101777408;BA.debugLine="private Sub CreateSwitch(sid As String, eventHandl";
RDebugUtils.currentLine=101777409;
 //BA.debugLineNum = 101777409;BA.debugLine="Dim el As VMSwitch";
_el = new b4j.example.vmswitch();
RDebugUtils.currentLine=101777410;
 //BA.debugLineNum = 101777410;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
_el._initialize /*b4j.example.vmswitch*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_eventhandler);
RDebugUtils.currentLine=101777411;
 //BA.debugLineNum = 101777411;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101777412;
 //BA.debugLineNum = 101777412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmicon  _createicon(b4j.example.vmcontainer __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createicon", true))
	 {return ((b4j.example.vmicon) Debug.delegate(ba, "createicon", new Object[] {_sid}));}
b4j.example.vmicon _el = null;
RDebugUtils.currentLine=101908480;
 //BA.debugLineNum = 101908480;BA.debugLine="private Sub CreateIcon(sid As String) As VMIcon";
RDebugUtils.currentLine=101908481;
 //BA.debugLineNum = 101908481;BA.debugLine="Dim el As VMIcon";
_el = new b4j.example.vmicon();
RDebugUtils.currentLine=101908482;
 //BA.debugLineNum = 101908482;BA.debugLine="el.Initialize(vue, sid)";
_el._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid);
RDebugUtils.currentLine=101908483;
 //BA.debugLineNum = 101908483;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101908484;
 //BA.debugLineNum = 101908484;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _createradiogroup(b4j.example.vmcontainer __ref,String _sid,String _scaption,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createradiogroup", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "createradiogroup", new Object[] {_sid,_scaption,_eventhandler}));}
b4j.example.vmradiogroup _el = null;
RDebugUtils.currentLine=101974016;
 //BA.debugLineNum = 101974016;BA.debugLine="private Sub CreateRadioGroup(sid As String, sCapti";
RDebugUtils.currentLine=101974017;
 //BA.debugLineNum = 101974017;BA.debugLine="Dim el As VMRadioGroup";
_el = new b4j.example.vmradiogroup();
RDebugUtils.currentLine=101974018;
 //BA.debugLineNum = 101974018;BA.debugLine="el.Initialize(vue, sid, sCaption, eventHandler)";
_el._initialize /*b4j.example.vmradiogroup*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_scaption,_eventhandler);
RDebugUtils.currentLine=101974019;
 //BA.debugLineNum = 101974019;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101974020;
 //BA.debugLineNum = 101974020;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckboxgroup  _createcheckboxgroup(b4j.example.vmcontainer __ref,String _sid,String _scaption,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createcheckboxgroup", true))
	 {return ((b4j.example.vmcheckboxgroup) Debug.delegate(ba, "createcheckboxgroup", new Object[] {_sid,_scaption,_eventhandler}));}
b4j.example.vmcheckboxgroup _el = null;
RDebugUtils.currentLine=102039552;
 //BA.debugLineNum = 102039552;BA.debugLine="private Sub CreateCheckBoxGroup(sid As String, sCa";
RDebugUtils.currentLine=102039553;
 //BA.debugLineNum = 102039553;BA.debugLine="Dim el As VMCheckBoxGroup";
_el = new b4j.example.vmcheckboxgroup();
RDebugUtils.currentLine=102039554;
 //BA.debugLineNum = 102039554;BA.debugLine="el.Initialize(vue, sid, sCaption, eventHandler)";
_el._initialize /*b4j.example.vmcheckboxgroup*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_sid,_scaption,_eventhandler);
RDebugUtils.currentLine=102039555;
 //BA.debugLineNum = 102039555;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=102039556;
 //BA.debugLineNum = 102039556;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
RDebugUtils.currentLine=92864512;
 //BA.debugLineNum = 92864512;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=92864513;
 //BA.debugLineNum = 92864513;BA.debugLine="Public Container As VMElement";
_container = new b4j.example.vmelement();
RDebugUtils.currentLine=92864514;
 //BA.debugLineNum = 92864514;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=92864515;
 //BA.debugLineNum = 92864515;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=92864516;
 //BA.debugLineNum = 92864516;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=92864517;
 //BA.debugLineNum = 92864517;BA.debugLine="Public Grid As VMGrid";
_grid = new b4j.example.vmgrid();
RDebugUtils.currentLine=92864518;
 //BA.debugLineNum = 92864518;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=92864520;
 //BA.debugLineNum = 92864520;BA.debugLine="Public Fields As List";
_fields = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92864521;
 //BA.debugLineNum = 92864521;BA.debugLine="Public Controls As List";
_controls = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92864522;
 //BA.debugLineNum = 92864522;BA.debugLine="Public Strings As List";
_strings = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92864523;
 //BA.debugLineNum = 92864523;BA.debugLine="Public Integers As List";
_integers = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92864524;
 //BA.debugLineNum = 92864524;BA.debugLine="Public Booleans As List";
_booleans = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92864525;
 //BA.debugLineNum = 92864525;BA.debugLine="Public Doubles As List";
_doubles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92864526;
 //BA.debugLineNum = 92864526;BA.debugLine="Public Dates As List";
_dates = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92864527;
 //BA.debugLineNum = 92864527;BA.debugLine="Public Defaults As Map";
_defaults = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=92864528;
 //BA.debugLineNum = 92864528;BA.debugLine="Public Required As Map";
_required = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=92864529;
 //BA.debugLineNum = 92864529;BA.debugLine="Public Mode As String";
_mode = "";
RDebugUtils.currentLine=92864530;
 //BA.debugLineNum = 92864530;BA.debugLine="Private TotalRows As Int";
_totalrows = 0;
RDebugUtils.currentLine=92864531;
 //BA.debugLineNum = 92864531;BA.debugLine="Private sortitM As Map";
_sortitm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=92864532;
 //BA.debugLineNum = 92864532;BA.debugLine="Private sortItL As List";
_sortitl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92864533;
 //BA.debugLineNum = 92864533;BA.debugLine="Private rows As Map";
_rows = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=92864534;
 //BA.debugLineNum = 92864534;BA.debugLine="Private cells As Map";
_cells = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=92864535;
 //BA.debugLineNum = 92864535;BA.debugLine="Type EachRow(visibility As String)";
;
RDebugUtils.currentLine=92864536;
 //BA.debugLineNum = 92864536;BA.debugLine="Public visibility As Map";
_visibility = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=92864537;
 //BA.debugLineNum = 92864537;BA.debugLine="Private rowStyles As Map";
_rowstyles = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=92864538;
 //BA.debugLineNum = 92864538;BA.debugLine="Public DesignMode As Boolean";
_designmode = false;
RDebugUtils.currentLine=92864539;
 //BA.debugLineNum = 92864539;BA.debugLine="Public HasInfoBox As Boolean";
_hasinfobox = false;
RDebugUtils.currentLine=92864540;
 //BA.debugLineNum = 92864540;BA.debugLine="Public Exclusions As List";
_exclusions = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=92864541;
 //BA.debugLineNum = 92864541;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminputcontrol  _createcontrol(b4j.example.vmcontainer __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createcontrol", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "createcontrol", new Object[] {_sname}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=98435072;
 //BA.debugLineNum = 98435072;BA.debugLine="Sub CreateControl(sname As String) As VMInputContr";
RDebugUtils.currentLine=98435073;
 //BA.debugLineNum = 98435073;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=98435074;
 //BA.debugLineNum = 98435074;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=98435075;
 //BA.debugLineNum = 98435075;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=98435076;
 //BA.debugLineNum = 98435076;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98435077;
 //BA.debugLineNum = 98435077;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _createnumber(b4j.example.vmcontainer __ref,String _sid,Object _eventhandler) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "createnumber", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "createnumber", new Object[] {_sid,_eventhandler}));}
b4j.example.vminput _el = null;
RDebugUtils.currentLine=101580800;
 //BA.debugLineNum = 101580800;BA.debugLine="private Sub CreateNumber(sid As String, eventHandl";
RDebugUtils.currentLine=101580801;
 //BA.debugLineNum = 101580801;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
_el = __ref._createinput /*b4j.example.vminput*/ (null,_sid,_eventhandler)._settypenumber /*b4j.example.vminput*/ (null,__c.True);
RDebugUtils.currentLine=101580802;
 //BA.debugLineNum = 101580802;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=101580803;
 //BA.debugLineNum = 101580803;BA.debugLine="End Sub";
return null;
}
public String  _disable(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "disable", true))
	 {return ((String) Debug.delegate(ba, "disable", null));}
RDebugUtils.currentLine=94437376;
 //BA.debugLineNum = 94437376;BA.debugLine="Sub Disable";
RDebugUtils.currentLine=94437377;
 //BA.debugLineNum = 94437377;BA.debugLine="SetDisabled(False)";
__ref._setdisabled /*b4j.example.vmcontainer*/ (null,__c.False);
RDebugUtils.currentLine=94437378;
 //BA.debugLineNum = 94437378;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _setdisabled(b4j.example.vmcontainer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=94633984;
 //BA.debugLineNum = 94633984;BA.debugLine="Sub SetDisabled(b As Boolean) As VMContainer";
RDebugUtils.currentLine=94633985;
 //BA.debugLineNum = 94633985;BA.debugLine="vue.SetStateSingle($\"${ID}disabled\"$,b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"disabled"),(Object)(_b));
RDebugUtils.currentLine=94633986;
 //BA.debugLineNum = 94633986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94633987;
 //BA.debugLineNum = 94633987;BA.debugLine="End Sub";
return null;
}
public String  _enable(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "enable", true))
	 {return ((String) Debug.delegate(ba, "enable", null));}
RDebugUtils.currentLine=94371840;
 //BA.debugLineNum = 94371840;BA.debugLine="Sub Enable";
RDebugUtils.currentLine=94371841;
 //BA.debugLineNum = 94371841;BA.debugLine="SetDisabled(True)";
__ref._setdisabled /*b4j.example.vmcontainer*/ (null,__c.True);
RDebugUtils.currentLine=94371842;
 //BA.debugLineNum = 94371842;BA.debugLine="End Sub";
return "";
}
public String  _prepare(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "prepare", true))
	 {return ((String) Debug.delegate(ba, "prepare", null));}
String _k = "";
String _sk = "";
RDebugUtils.currentLine=97845248;
 //BA.debugLineNum = 97845248;BA.debugLine="private Sub Prepare";
RDebugUtils.currentLine=97845249;
 //BA.debugLineNum = 97845249;BA.debugLine="For Each k As String In Dates";
{
final anywheresoftware.b4a.BA.IterableList group1 = __ref._dates /*anywheresoftware.b4a.objects.collections.List*/ ;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=97845250;
 //BA.debugLineNum = 97845250;BA.debugLine="Dim sk As String = vue.GetState(k,\"\")";
_sk = BA.ObjectToString(__ref._vue /*b4j.example.bananovue*/ ._getstate /*Object*/ (null,_k,(Object)("")));
RDebugUtils.currentLine=97845251;
 //BA.debugLineNum = 97845251;BA.debugLine="sk = vue.Date2YYYYMMDD(sk)";
_sk = __ref._vue /*b4j.example.bananovue*/ ._date2yyyymmdd /*String*/ (null,(Object)(_sk));
RDebugUtils.currentLine=97845252;
 //BA.debugLineNum = 97845252;BA.debugLine="vue.SetStateSingle(k, sk)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_k,(Object)(_sk));
 }
};
RDebugUtils.currentLine=97845254;
 //BA.debugLineNum = 97845254;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _linkrecordtypes(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "linkrecordtypes", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "linkrecordtypes", new Object[] {_rec}));}
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=100335616;
 //BA.debugLineNum = 100335616;BA.debugLine="Sub LinkRecordTypes(rec As Map) As Map";
RDebugUtils.currentLine=100335617;
 //BA.debugLineNum = 100335617;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
RDebugUtils.currentLine=100335618;
 //BA.debugLineNum = 100335618;BA.debugLine="For Each k As String In rec.keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _rec.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=100335619;
 //BA.debugLineNum = 100335619;BA.debugLine="Dim v As Object = rec.Get(k)";
_v = _rec.Get((Object)(_k));
RDebugUtils.currentLine=100335620;
 //BA.debugLineNum = 100335620;BA.debugLine="k = k.ToLowerCase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=100335621;
 //BA.debugLineNum = 100335621;BA.debugLine="nrec.Put(k, v)";
_nrec.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=100335623;
 //BA.debugLineNum = 100335623;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(nrec, Dou";
if (__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makedouble /*String*/ (null,_nrec,__ref._doubles /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=100335624;
 //BA.debugLineNum = 100335624;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(nrec, I";
if (__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makeinteger /*String*/ (null,_nrec,__ref._integers /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=100335625;
 //BA.debugLineNum = 100335625;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(nrec, Strin";
if (__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._maketrim /*String*/ (null,_nrec,__ref._strings /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=100335626;
 //BA.debugLineNum = 100335626;BA.debugLine="If Dates.Size > 0 Then vue.MakeDate(nrec, Dates)";
if (__ref._dates /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makedate /*String*/ (null,_nrec,__ref._dates /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=100335627;
 //BA.debugLineNum = 100335627;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(nrec, B";
if (__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
__ref._vue /*b4j.example.bananovue*/ ._makeboolean /*String*/ (null,_nrec,__ref._booleans /*anywheresoftware.b4a.objects.collections.List*/ );};
RDebugUtils.currentLine=100335628;
 //BA.debugLineNum = 100335628;BA.debugLine="Return nrec";
if (true) return _nrec;
RDebugUtils.currentLine=100335629;
 //BA.debugLineNum = 100335629;BA.debugLine="End Sub";
return null;
}
public String  _hideerror(b4j.example.vmcontainer __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "hideerror", true))
	 {return ((String) Debug.delegate(ba, "hideerror", new Object[] {_elid}));}
RDebugUtils.currentLine=98107392;
 //BA.debugLineNum = 98107392;BA.debugLine="Sub HideError(elID As String)";
RDebugUtils.currentLine=98107393;
 //BA.debugLineNum = 98107393;BA.debugLine="vue.SetStateSingle($\"${elID}error\"$, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.False));
RDebugUtils.currentLine=98107394;
 //BA.debugLineNum = 98107394;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminputcontrol  _newcheckbox(b4j.example.vmcontainer __ref,String _sname,String _slabel,Object _svalue,boolean _bprimary,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newcheckbox", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newcheckbox", new Object[] {_sname,_slabel,_svalue,_bprimary,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=98762752;
 //BA.debugLineNum = 98762752;BA.debugLine="Sub NewCheckBox(sname As String, slabel As String,";
RDebugUtils.currentLine=98762753;
 //BA.debugLineNum = 98762753;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=98762754;
 //BA.debugLineNum = 98762754;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=98762755;
 //BA.debugLineNum = 98762755;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=98762756;
 //BA.debugLineNum = 98762756;BA.debugLine="el.SetCheckBox";
_el._setcheckbox /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=98762757;
 //BA.debugLineNum = 98762757;BA.debugLine="el.Value = svalue";
_el._value /*String*/  = BA.ObjectToString(_svalue);
RDebugUtils.currentLine=98762758;
 //BA.debugLineNum = 98762758;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=98762759;
 //BA.debugLineNum = 98762759;BA.debugLine="el.IsPrimary = bPrimary";
_el._isprimary /*boolean*/  = _bprimary;
RDebugUtils.currentLine=98762760;
 //BA.debugLineNum = 98762760;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=98762761;
 //BA.debugLineNum = 98762761;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98762762;
 //BA.debugLineNum = 98762762;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newcheckboxgroup(b4j.example.vmcontainer __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newcheckboxgroup", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newcheckboxgroup", new Object[] {_sname}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=98697216;
 //BA.debugLineNum = 98697216;BA.debugLine="Sub NewCheckBoxGroup(sname As String) As VMInputCo";
RDebugUtils.currentLine=98697217;
 //BA.debugLineNum = 98697217;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=98697218;
 //BA.debugLineNum = 98697218;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=98697219;
 //BA.debugLineNum = 98697219;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=98697220;
 //BA.debugLineNum = 98697220;BA.debugLine="el.SetCheckBoxGroup";
_el._setcheckboxgroup /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=98697221;
 //BA.debugLineNum = 98697221;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98697222;
 //BA.debugLineNum = 98697222;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newchip(b4j.example.vmcontainer __ref,String _sname,String _stext,boolean _bclickable,boolean _bdeletable,String _sourcetable,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newchip", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newchip", new Object[] {_sname,_stext,_bclickable,_bdeletable,_sourcetable,_sourcefield,_displayfield}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=98959360;
 //BA.debugLineNum = 98959360;BA.debugLine="Sub NewChip(sname As String, sText As String, bCli";
RDebugUtils.currentLine=98959361;
 //BA.debugLineNum = 98959361;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=98959362;
 //BA.debugLineNum = 98959362;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=98959363;
 //BA.debugLineNum = 98959363;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=98959364;
 //BA.debugLineNum = 98959364;BA.debugLine="el.SetChip";
_el._setchip /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=98959365;
 //BA.debugLineNum = 98959365;BA.debugLine="el.Text = sText";
_el._text /*String*/  = _stext;
RDebugUtils.currentLine=98959366;
 //BA.debugLineNum = 98959366;BA.debugLine="el.Clickable = bClickable";
_el._clickable /*boolean*/  = _bclickable;
RDebugUtils.currentLine=98959367;
 //BA.debugLineNum = 98959367;BA.debugLine="el.Deletable = bDeletable";
_el._deletable /*boolean*/  = _bdeletable;
RDebugUtils.currentLine=98959368;
 //BA.debugLineNum = 98959368;BA.debugLine="If sourceTable <> Null Then el.sourceTable = sour";
if (_sourcetable!= null) { 
_el._sourcetable /*String*/  = _sourcetable;};
RDebugUtils.currentLine=98959369;
 //BA.debugLineNum = 98959369;BA.debugLine="If sourceField <> Null Then el.sourceField =sourc";
if (_sourcefield!= null) { 
_el._sourcefield /*String*/  = _sourcefield;};
RDebugUtils.currentLine=98959370;
 //BA.debugLineNum = 98959370;BA.debugLine="If displayField <> Null Then el.displayField = di";
if (_displayfield!= null) { 
_el._displayfield /*String*/  = _displayfield;};
RDebugUtils.currentLine=98959371;
 //BA.debugLineNum = 98959371;BA.debugLine="el.UseOptions = False";
_el._useoptions /*boolean*/  = __c.False;
RDebugUtils.currentLine=98959372;
 //BA.debugLineNum = 98959372;BA.debugLine="el.UseDataSource = True";
_el._usedatasource /*boolean*/  = __c.True;
RDebugUtils.currentLine=98959373;
 //BA.debugLineNum = 98959373;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98959374;
 //BA.debugLineNum = 98959374;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newchips(b4j.example.vmcontainer __ref,String _sname,String _slabel,String _splaceholder,boolean _bstatic,boolean _brequired,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newchips", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newchips", new Object[] {_sname,_slabel,_splaceholder,_bstatic,_brequired,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99024896;
 //BA.debugLineNum = 99024896;BA.debugLine="Sub NewChips(sname As String, slabel As String, sp";
RDebugUtils.currentLine=99024897;
 //BA.debugLineNum = 99024897;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99024898;
 //BA.debugLineNum = 99024898;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99024899;
 //BA.debugLineNum = 99024899;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99024900;
 //BA.debugLineNum = 99024900;BA.debugLine="el.SetChips";
_el._setchips /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=99024901;
 //BA.debugLineNum = 99024901;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=99024902;
 //BA.debugLineNum = 99024902;BA.debugLine="el.Required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=99024903;
 //BA.debugLineNum = 99024903;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=99024904;
 //BA.debugLineNum = 99024904;BA.debugLine="el.Static = bStatic";
_el._static /*boolean*/  = _bstatic;
RDebugUtils.currentLine=99024905;
 //BA.debugLineNum = 99024905;BA.debugLine="el.CheckDuplicates = True";
_el._checkduplicates /*boolean*/  = __c.True;
RDebugUtils.currentLine=99024906;
 //BA.debugLineNum = 99024906;BA.debugLine="el.helperText = sHelperText";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=99024907;
 //BA.debugLineNum = 99024907;BA.debugLine="el.errorText = sErrorText";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=99024908;
 //BA.debugLineNum = 99024908;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=99024909;
 //BA.debugLineNum = 99024909;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99024910;
 //BA.debugLineNum = 99024910;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newemail(b4j.example.vmcontainer __ref,String _sname,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newemail", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newemail", new Object[] {_sname,_slabel,_splaceholder,_brequired,_sicon,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99221504;
 //BA.debugLineNum = 99221504;BA.debugLine="Sub NewEmail(sname As String, slabel As String, sp";
RDebugUtils.currentLine=99221505;
 //BA.debugLineNum = 99221505;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99221506;
 //BA.debugLineNum = 99221506;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99221507;
 //BA.debugLineNum = 99221507;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99221508;
 //BA.debugLineNum = 99221508;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
RDebugUtils.currentLine=99221509;
 //BA.debugLineNum = 99221509;BA.debugLine="el.SetEmail";
_el._setemail /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=99221510;
 //BA.debugLineNum = 99221510;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=99221511;
 //BA.debugLineNum = 99221511;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=99221512;
 //BA.debugLineNum = 99221512;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=99221513;
 //BA.debugLineNum = 99221513;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
RDebugUtils.currentLine=99221514;
 //BA.debugLineNum = 99221514;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=99221515;
 //BA.debugLineNum = 99221515;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=99221516;
 //BA.debugLineNum = 99221516;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=99221517;
 //BA.debugLineNum = 99221517;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99221518;
 //BA.debugLineNum = 99221518;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newfile(b4j.example.vmcontainer __ref,String _sname,String _slabel,String _splaceholder,boolean _brequired,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newfile", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newfile", new Object[] {_sname,_slabel,_splaceholder,_brequired,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99614720;
 //BA.debugLineNum = 99614720;BA.debugLine="Sub NewFile(sname As String, slabel As String, spl";
RDebugUtils.currentLine=99614721;
 //BA.debugLineNum = 99614721;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99614722;
 //BA.debugLineNum = 99614722;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99614723;
 //BA.debugLineNum = 99614723;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99614724;
 //BA.debugLineNum = 99614724;BA.debugLine="el.SetEmail";
_el._setemail /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=99614725;
 //BA.debugLineNum = 99614725;BA.debugLine="el.typeOf = \"file\"";
_el._typeof /*String*/  = "file";
RDebugUtils.currentLine=99614726;
 //BA.debugLineNum = 99614726;BA.debugLine="el.errorText = sErrorText";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=99614727;
 //BA.debugLineNum = 99614727;BA.debugLine="el.helperText = shelperText";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=99614728;
 //BA.debugLineNum = 99614728;BA.debugLine="el.Required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=99614729;
 //BA.debugLineNum = 99614729;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=99614730;
 //BA.debugLineNum = 99614730;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=99614731;
 //BA.debugLineNum = 99614731;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=99614732;
 //BA.debugLineNum = 99614732;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99614733;
 //BA.debugLineNum = 99614733;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newlabel(b4j.example.vmcontainer __ref,String _sname,String _ssize,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newlabel", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newlabel", new Object[] {_sname,_ssize,_stext}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99745792;
 //BA.debugLineNum = 99745792;BA.debugLine="Sub NewLabel(sname As String, sSize As String, sTe";
RDebugUtils.currentLine=99745793;
 //BA.debugLineNum = 99745793;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99745794;
 //BA.debugLineNum = 99745794;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99745795;
 //BA.debugLineNum = 99745795;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99745796;
 //BA.debugLineNum = 99745796;BA.debugLine="el.typeOf = \"label\"";
_el._typeof /*String*/  = "label";
RDebugUtils.currentLine=99745797;
 //BA.debugLineNum = 99745797;BA.debugLine="el.Tag = sSize";
_el._tag /*String*/  = _ssize;
RDebugUtils.currentLine=99745798;
 //BA.debugLineNum = 99745798;BA.debugLine="el.Text = sText";
_el._text /*String*/  = _stext;
RDebugUtils.currentLine=99745799;
 //BA.debugLineNum = 99745799;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99745800;
 //BA.debugLineNum = 99745800;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newh2(b4j.example.vmcontainer __ref,String _sname,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newh2", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newh2", new Object[] {_sname,_stext}));}
RDebugUtils.currentLine=267059200;
 //BA.debugLineNum = 267059200;BA.debugLine="Sub NewH2(sname As String, sText As String) As VMI";
RDebugUtils.currentLine=267059201;
 //BA.debugLineNum = 267059201;BA.debugLine="Return NewLabel(sname, \"h2\", sText)";
if (true) return __ref._newlabel /*b4j.example.vminputcontrol*/ (null,_sname,"h2",_stext);
RDebugUtils.currentLine=267059202;
 //BA.debugLineNum = 267059202;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newh3(b4j.example.vmcontainer __ref,String _sname,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newh3", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newh3", new Object[] {_sname,_stext}));}
RDebugUtils.currentLine=267124736;
 //BA.debugLineNum = 267124736;BA.debugLine="Sub NewH3(sname As String, sText As String) As VMI";
RDebugUtils.currentLine=267124737;
 //BA.debugLineNum = 267124737;BA.debugLine="Return NewLabel(sname, \"h3\", sText)";
if (true) return __ref._newlabel /*b4j.example.vminputcontrol*/ (null,_sname,"h3",_stext);
RDebugUtils.currentLine=267124738;
 //BA.debugLineNum = 267124738;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newh4(b4j.example.vmcontainer __ref,String _sname,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newh4", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newh4", new Object[] {_sname,_stext}));}
RDebugUtils.currentLine=267190272;
 //BA.debugLineNum = 267190272;BA.debugLine="Sub NewH4(sname As String, sText As String) As VMI";
RDebugUtils.currentLine=267190273;
 //BA.debugLineNum = 267190273;BA.debugLine="Return NewLabel(sname, \"h4\", sText)";
if (true) return __ref._newlabel /*b4j.example.vminputcontrol*/ (null,_sname,"h4",_stext);
RDebugUtils.currentLine=267190274;
 //BA.debugLineNum = 267190274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newh5(b4j.example.vmcontainer __ref,String _sname,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newh5", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newh5", new Object[] {_sname,_stext}));}
RDebugUtils.currentLine=267255808;
 //BA.debugLineNum = 267255808;BA.debugLine="Sub NewH5(sname As String, sText As String) As VMI";
RDebugUtils.currentLine=267255809;
 //BA.debugLineNum = 267255809;BA.debugLine="Return NewLabel(sname, \"h5\", sText)";
if (true) return __ref._newlabel /*b4j.example.vminputcontrol*/ (null,_sname,"h5",_stext);
RDebugUtils.currentLine=267255810;
 //BA.debugLineNum = 267255810;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newh6(b4j.example.vmcontainer __ref,String _sname,String _stext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newh6", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newh6", new Object[] {_sname,_stext}));}
RDebugUtils.currentLine=267321344;
 //BA.debugLineNum = 267321344;BA.debugLine="Sub NewH6(sname As String, sText As String) As VMI";
RDebugUtils.currentLine=267321345;
 //BA.debugLineNum = 267321345;BA.debugLine="Return NewLabel(sname, \"h6\", sText)";
if (true) return __ref._newlabel /*b4j.example.vminputcontrol*/ (null,_sname,"h6",_stext);
RDebugUtils.currentLine=267321346;
 //BA.debugLineNum = 267321346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newicon(b4j.example.vmcontainer __ref,String _sname,String _sicon,String _ssize) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newicon", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newicon", new Object[] {_sname,_sicon,_ssize}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99811328;
 //BA.debugLineNum = 99811328;BA.debugLine="Sub NewIcon(sname As String, sIcon As String, sSiz";
RDebugUtils.currentLine=99811329;
 //BA.debugLineNum = 99811329;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99811330;
 //BA.debugLineNum = 99811330;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99811331;
 //BA.debugLineNum = 99811331;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99811332;
 //BA.debugLineNum = 99811332;BA.debugLine="el.typeOf = \"icon\"";
_el._typeof /*String*/  = "icon";
RDebugUtils.currentLine=99811333;
 //BA.debugLineNum = 99811333;BA.debugLine="el.iconsize = sSize";
_el._iconsize /*String*/  = _ssize;
RDebugUtils.currentLine=99811334;
 //BA.debugLineNum = 99811334;BA.debugLine="el.IconName = sIcon";
_el._iconname /*String*/  = _sicon;
RDebugUtils.currentLine=99811335;
 //BA.debugLineNum = 99811335;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99811336;
 //BA.debugLineNum = 99811336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newiconbutton(b4j.example.vmcontainer __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newiconbutton", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newiconbutton", new Object[] {_sname}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=98500608;
 //BA.debugLineNum = 98500608;BA.debugLine="Sub NewIconButton(sname As String) As VMInputContr";
RDebugUtils.currentLine=98500609;
 //BA.debugLineNum = 98500609;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=98500610;
 //BA.debugLineNum = 98500610;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=98500611;
 //BA.debugLineNum = 98500611;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=98500612;
 //BA.debugLineNum = 98500612;BA.debugLine="el.SetButton";
_el._setbutton /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=98500613;
 //BA.debugLineNum = 98500613;BA.debugLine="el.SetIconButton(True)";
_el._seticonbutton /*b4j.example.vminputcontrol*/ (null,__c.True);
RDebugUtils.currentLine=98500614;
 //BA.debugLineNum = 98500614;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98500615;
 //BA.debugLineNum = 98500615;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newimage(b4j.example.vmcontainer __ref,String _sname,String _sdefaultvalue,String _salt,String _swidth,String _sheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newimage", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newimage", new Object[] {_sname,_sdefaultvalue,_salt,_swidth,_sheight}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99680256;
 //BA.debugLineNum = 99680256;BA.debugLine="Sub NewImage(sname As String, sdefaultValue As Str";
RDebugUtils.currentLine=99680257;
 //BA.debugLineNum = 99680257;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99680258;
 //BA.debugLineNum = 99680258;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99680259;
 //BA.debugLineNum = 99680259;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99680260;
 //BA.debugLineNum = 99680260;BA.debugLine="el.typeOf = \"image\"";
_el._typeof /*String*/  = "image";
RDebugUtils.currentLine=99680261;
 //BA.debugLineNum = 99680261;BA.debugLine="el.Width = swidth";
_el._width /*String*/  = _swidth;
RDebugUtils.currentLine=99680262;
 //BA.debugLineNum = 99680262;BA.debugLine="el.Height = sheight";
_el._height /*String*/  = _sheight;
RDebugUtils.currentLine=99680263;
 //BA.debugLineNum = 99680263;BA.debugLine="el.defaultValue = sdefaultValue";
_el._defaultvalue /*Object*/  = (Object)(_sdefaultvalue);
RDebugUtils.currentLine=99680264;
 //BA.debugLineNum = 99680264;BA.debugLine="el.Alt = salt";
_el._alt /*String*/  = _salt;
RDebugUtils.currentLine=99680265;
 //BA.debugLineNum = 99680265;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99680266;
 //BA.debugLineNum = 99680266;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newinfobox(b4j.example.vmcontainer __ref,String _sname,String _sboxtype,String _stext,String _sicon,String _siconcolor,String _siconbackgroundcolor,int _icount,int _istart,int _ifinish,int _iinterval,boolean _bsetcounter,int _ispeed,int _irefreshinterval,boolean _bhoverexpand,boolean _bhoverzoom) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newinfobox", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newinfobox", new Object[] {_sname,_sboxtype,_stext,_sicon,_siconcolor,_siconbackgroundcolor,_icount,_istart,_ifinish,_iinterval,_bsetcounter,_ispeed,_irefreshinterval,_bhoverexpand,_bhoverzoom}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99090432;
 //BA.debugLineNum = 99090432;BA.debugLine="Sub NewInfoBox(sname As String, sBoxType As String";
RDebugUtils.currentLine=99090433;
 //BA.debugLineNum = 99090433;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99090434;
 //BA.debugLineNum = 99090434;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99090435;
 //BA.debugLineNum = 99090435;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99090436;
 //BA.debugLineNum = 99090436;BA.debugLine="el.typeof = \"infobox\"";
_el._typeof /*String*/  = "infobox";
RDebugUtils.currentLine=99090437;
 //BA.debugLineNum = 99090437;BA.debugLine="el.fieldType = \"string\"";
_el._fieldtype /*String*/  = "string";
RDebugUtils.currentLine=99090438;
 //BA.debugLineNum = 99090438;BA.debugLine="el.bSetCounter = bSetCounter";
_el._bsetcounter /*boolean*/  = _bsetcounter;
RDebugUtils.currentLine=99090439;
 //BA.debugLineNum = 99090439;BA.debugLine="el.Start = iStart";
_el._start /*String*/  = BA.NumberToString(_istart);
RDebugUtils.currentLine=99090440;
 //BA.debugLineNum = 99090440;BA.debugLine="el.Finish = iFinish";
_el._finish /*String*/  = BA.NumberToString(_ifinish);
RDebugUtils.currentLine=99090441;
 //BA.debugLineNum = 99090441;BA.debugLine="el.Speed = iSpeed";
_el._speed /*String*/  = BA.NumberToString(_ispeed);
RDebugUtils.currentLine=99090442;
 //BA.debugLineNum = 99090442;BA.debugLine="el.RefreshInterval = iRefreshInterval";
_el._refreshinterval /*String*/  = BA.NumberToString(_irefreshinterval);
RDebugUtils.currentLine=99090443;
 //BA.debugLineNum = 99090443;BA.debugLine="el.Count = iCount";
_el._count /*String*/  = BA.NumberToString(_icount);
RDebugUtils.currentLine=99090444;
 //BA.debugLineNum = 99090444;BA.debugLine="el.IconName = sIcon";
_el._iconname /*String*/  = _sicon;
RDebugUtils.currentLine=99090445;
 //BA.debugLineNum = 99090445;BA.debugLine="el.IconColor = sIconColor";
_el._iconcolor /*String*/  = _siconcolor;
RDebugUtils.currentLine=99090446;
 //BA.debugLineNum = 99090446;BA.debugLine="el.IconBackgroundColor = sIconBackgroundColor";
_el._iconbackgroundcolor /*String*/  = _siconbackgroundcolor;
RDebugUtils.currentLine=99090447;
 //BA.debugLineNum = 99090447;BA.debugLine="el.Text = sText";
_el._text /*String*/  = _stext;
RDebugUtils.currentLine=99090448;
 //BA.debugLineNum = 99090448;BA.debugLine="el.HoverExpandEffect = bHoverExpand";
_el._hoverexpandeffect /*boolean*/  = _bhoverexpand;
RDebugUtils.currentLine=99090449;
 //BA.debugLineNum = 99090449;BA.debugLine="el.HoverZoomEffect = bHoverZoom";
_el._hoverzoomeffect /*boolean*/  = _bhoverzoom;
RDebugUtils.currentLine=99090450;
 //BA.debugLineNum = 99090450;BA.debugLine="el.BoxType = sBoxType";
_el._boxtype /*String*/  = _sboxtype;
RDebugUtils.currentLine=99090451;
 //BA.debugLineNum = 99090451;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99090452;
 //BA.debugLineNum = 99090452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newlist(b4j.example.vmcontainer __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newlist", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newlist", new Object[] {_sname}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99942400;
 //BA.debugLineNum = 99942400;BA.debugLine="Sub NewList(sname As String) As VMInputControl";
RDebugUtils.currentLine=99942401;
 //BA.debugLineNum = 99942401;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99942402;
 //BA.debugLineNum = 99942402;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99942403;
 //BA.debugLineNum = 99942403;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99942404;
 //BA.debugLineNum = 99942404;BA.debugLine="el.SetList";
_el._setlist /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=99942405;
 //BA.debugLineNum = 99942405;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99942406;
 //BA.debugLineNum = 99942406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newnumber(b4j.example.vmcontainer __ref,String _sname,String _slabel,String _splaceholder,boolean _brequired,String _sicon,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newnumber", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newnumber", new Object[] {_sname,_slabel,_splaceholder,_brequired,_sicon,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99483648;
 //BA.debugLineNum = 99483648;BA.debugLine="Sub NewNumber(sname As String, slabel As String, s";
RDebugUtils.currentLine=99483649;
 //BA.debugLineNum = 99483649;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99483650;
 //BA.debugLineNum = 99483650;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99483651;
 //BA.debugLineNum = 99483651;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99483652;
 //BA.debugLineNum = 99483652;BA.debugLine="el.typeOf = \"number\"";
_el._typeof /*String*/  = "number";
RDebugUtils.currentLine=99483653;
 //BA.debugLineNum = 99483653;BA.debugLine="el.fieldType = \"int\"";
_el._fieldtype /*String*/  = "int";
RDebugUtils.currentLine=99483654;
 //BA.debugLineNum = 99483654;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=99483655;
 //BA.debugLineNum = 99483655;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=99483656;
 //BA.debugLineNum = 99483656;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=99483657;
 //BA.debugLineNum = 99483657;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
RDebugUtils.currentLine=99483658;
 //BA.debugLineNum = 99483658;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=99483659;
 //BA.debugLineNum = 99483659;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=99483660;
 //BA.debugLineNum = 99483660;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=99483661;
 //BA.debugLineNum = 99483661;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99483662;
 //BA.debugLineNum = 99483662;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newpassword(b4j.example.vmcontainer __ref,String _sname,String _slabel,String _splaceholder,boolean _brequired,boolean _btoggle,String _sicon,int _imaxlen,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newpassword", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newpassword", new Object[] {_sname,_slabel,_splaceholder,_brequired,_btoggle,_sicon,_imaxlen,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99549184;
 //BA.debugLineNum = 99549184;BA.debugLine="Sub NewPassword(sname As String, slabel As String,";
RDebugUtils.currentLine=99549185;
 //BA.debugLineNum = 99549185;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99549186;
 //BA.debugLineNum = 99549186;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99549187;
 //BA.debugLineNum = 99549187;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99549188;
 //BA.debugLineNum = 99549188;BA.debugLine="el.SetPassword";
_el._setpassword /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=99549189;
 //BA.debugLineNum = 99549189;BA.debugLine="el.errorText = serrorText";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=99549190;
 //BA.debugLineNum = 99549190;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=99549191;
 //BA.debugLineNum = 99549191;BA.debugLine="el.required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=99549192;
 //BA.debugLineNum = 99549192;BA.debugLine="el.iconname = sIcon";
_el._iconname /*String*/  = _sicon;
RDebugUtils.currentLine=99549193;
 //BA.debugLineNum = 99549193;BA.debugLine="el.MaxLength = iMaxLen";
_el._maxlength /*Object*/  = (Object)(_imaxlen);
RDebugUtils.currentLine=99549194;
 //BA.debugLineNum = 99549194;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=99549195;
 //BA.debugLineNum = 99549195;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=99549196;
 //BA.debugLineNum = 99549196;BA.debugLine="el.TogglePassword = bToggle";
_el._togglepassword /*boolean*/  = _btoggle;
RDebugUtils.currentLine=99549197;
 //BA.debugLineNum = 99549197;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=99549198;
 //BA.debugLineNum = 99549198;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99549199;
 //BA.debugLineNum = 99549199;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newradiogroup(b4j.example.vmcontainer __ref,String _sname,String _slabel,Object _svalue,anywheresoftware.b4a.objects.collections.Map _options,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newradiogroup", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newradiogroup", new Object[] {_sname,_slabel,_svalue,_options,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=98631680;
 //BA.debugLineNum = 98631680;BA.debugLine="Sub NewRadioGroup(sname As String, slabel As Strin";
RDebugUtils.currentLine=98631681;
 //BA.debugLineNum = 98631681;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=98631682;
 //BA.debugLineNum = 98631682;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=98631683;
 //BA.debugLineNum = 98631683;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=98631684;
 //BA.debugLineNum = 98631684;BA.debugLine="el.SetRadioGroup";
_el._setradiogroup /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=98631685;
 //BA.debugLineNum = 98631685;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=98631686;
 //BA.debugLineNum = 98631686;BA.debugLine="el.Value = svalue";
_el._value /*String*/  = BA.ObjectToString(_svalue);
RDebugUtils.currentLine=98631687;
 //BA.debugLineNum = 98631687;BA.debugLine="el.options = options";
_el._options /*anywheresoftware.b4a.objects.collections.Map*/  = _options;
RDebugUtils.currentLine=98631688;
 //BA.debugLineNum = 98631688;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=98631689;
 //BA.debugLineNum = 98631689;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98631690;
 //BA.debugLineNum = 98631690;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newslider(b4j.example.vmcontainer __ref,String _sname,String _slabel,int _iminvalue,String _imaxvalue,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newslider", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newslider", new Object[] {_sname,_slabel,_iminvalue,_imaxvalue,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=99155968;
 //BA.debugLineNum = 99155968;BA.debugLine="Sub NewSlider(sname As String, slabel As String, i";
RDebugUtils.currentLine=99155969;
 //BA.debugLineNum = 99155969;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=99155970;
 //BA.debugLineNum = 99155970;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=99155971;
 //BA.debugLineNum = 99155971;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=99155972;
 //BA.debugLineNum = 99155972;BA.debugLine="el.SetSlider";
_el._setslider /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=99155973;
 //BA.debugLineNum = 99155973;BA.debugLine="el.minvalue = iMinValue";
_el._minvalue /*int*/  = _iminvalue;
RDebugUtils.currentLine=99155974;
 //BA.debugLineNum = 99155974;BA.debugLine="el.maxvalue = iMaxValue";
_el._maxvalue /*int*/  = (int)(Double.parseDouble(_imaxvalue));
RDebugUtils.currentLine=99155975;
 //BA.debugLineNum = 99155975;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=99155976;
 //BA.debugLineNum = 99155976;BA.debugLine="el.ThumbLabel = True";
_el._thumblabel /*boolean*/  = __c.True;
RDebugUtils.currentLine=99155977;
 //BA.debugLineNum = 99155977;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=99155978;
 //BA.debugLineNum = 99155978;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=99155979;
 //BA.debugLineNum = 99155979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newswitch(b4j.example.vmcontainer __ref,String _sname,String _slabel,Object _svalue,boolean _bprimary,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newswitch", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newswitch", new Object[] {_sname,_slabel,_svalue,_bprimary,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=98566144;
 //BA.debugLineNum = 98566144;BA.debugLine="Sub NewSwitch(sname As String, slabel As String, s";
RDebugUtils.currentLine=98566145;
 //BA.debugLineNum = 98566145;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=98566146;
 //BA.debugLineNum = 98566146;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=98566147;
 //BA.debugLineNum = 98566147;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=98566148;
 //BA.debugLineNum = 98566148;BA.debugLine="el.SetSwitch";
_el._setswitch /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=98566149;
 //BA.debugLineNum = 98566149;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=98566150;
 //BA.debugLineNum = 98566150;BA.debugLine="el.Value = svalue";
_el._value /*String*/  = BA.ObjectToString(_svalue);
RDebugUtils.currentLine=98566151;
 //BA.debugLineNum = 98566151;BA.debugLine="el.IsPrimary = bPrimary";
_el._isprimary /*boolean*/  = _bprimary;
RDebugUtils.currentLine=98566152;
 //BA.debugLineNum = 98566152;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=98566153;
 //BA.debugLineNum = 98566153;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98566154;
 //BA.debugLineNum = 98566154;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminputcontrol  _newtimepicker(b4j.example.vmcontainer __ref,String _sname,String _slabel,boolean _brequired,String _splaceholder,String _shelpertext,String _serrortext,int _itabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "newtimepicker", true))
	 {return ((b4j.example.vminputcontrol) Debug.delegate(ba, "newtimepicker", new Object[] {_sname,_slabel,_brequired,_splaceholder,_shelpertext,_serrortext,_itabindex}));}
b4j.example.vminputcontrol _el = null;
RDebugUtils.currentLine=98893824;
 //BA.debugLineNum = 98893824;BA.debugLine="Sub NewTimePicker(sname As String, slabel As Strin";
RDebugUtils.currentLine=98893826;
 //BA.debugLineNum = 98893826;BA.debugLine="sname = sname.tolowercase";
_sname = _sname.toLowerCase();
RDebugUtils.currentLine=98893827;
 //BA.debugLineNum = 98893827;BA.debugLine="Dim el As VMInputControl";
_el = new b4j.example.vminputcontrol();
RDebugUtils.currentLine=98893828;
 //BA.debugLineNum = 98893828;BA.debugLine="el.Initialize(sname)";
_el._initialize /*b4j.example.vminputcontrol*/ (null,ba,_sname);
RDebugUtils.currentLine=98893829;
 //BA.debugLineNum = 98893829;BA.debugLine="el.SetTimePicker";
_el._settimepicker /*b4j.example.vminputcontrol*/ (null);
RDebugUtils.currentLine=98893830;
 //BA.debugLineNum = 98893830;BA.debugLine="el.label = slabel";
_el._label /*String*/  = _slabel;
RDebugUtils.currentLine=98893831;
 //BA.debugLineNum = 98893831;BA.debugLine="el.clearable = True";
_el._clearable /*boolean*/  = __c.True;
RDebugUtils.currentLine=98893832;
 //BA.debugLineNum = 98893832;BA.debugLine="el.Required = bRequired";
_el._required /*boolean*/  = _brequired;
RDebugUtils.currentLine=98893833;
 //BA.debugLineNum = 98893833;BA.debugLine="el.PlaceHolder = splaceholder";
_el._placeholder /*String*/  = _splaceholder;
RDebugUtils.currentLine=98893834;
 //BA.debugLineNum = 98893834;BA.debugLine="el.helperText = shelpertext";
_el._helpertext /*String*/  = _shelpertext;
RDebugUtils.currentLine=98893835;
 //BA.debugLineNum = 98893835;BA.debugLine="el.errorText = serrortext";
_el._errortext /*String*/  = _serrortext;
RDebugUtils.currentLine=98893836;
 //BA.debugLineNum = 98893836;BA.debugLine="el.defaultValue = \"12:00\"";
_el._defaultvalue /*Object*/  = (Object)("12:00");
RDebugUtils.currentLine=98893837;
 //BA.debugLineNum = 98893837;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
if (_itabindex>0) { 
_el._tabindex /*int*/  = _itabindex;};
RDebugUtils.currentLine=98893838;
 //BA.debugLineNum = 98893838;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=98893839;
 //BA.debugLineNum = 98893839;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmcontainer __ref,b4j.example.vmcontainer _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=97714176;
 //BA.debugLineNum = 97714176;BA.debugLine="Sub Pop(p As VMContainer)";
RDebugUtils.currentLine=97714177;
 //BA.debugLineNum = 97714177;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmcontainer*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=97714178;
 //BA.debugLineNum = 97714178;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _settext(b4j.example.vmcontainer __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=94830592;
 //BA.debugLineNum = 94830592;BA.debugLine="Sub SetText(t As String) As VMContainer";
RDebugUtils.currentLine=94830593;
 //BA.debugLineNum = 94830593;BA.debugLine="Container.SetText(t)";
__ref._container /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=94830594;
 //BA.debugLineNum = 94830594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94830595;
 //BA.debugLineNum = 94830595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _removeattr(b4j.example.vmcontainer __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "removeattr", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "removeattr", new Object[] {_sname}));}
RDebugUtils.currentLine=92930048;
 //BA.debugLineNum = 92930048;BA.debugLine="public Sub RemoveAttr(sName As String) As VMContai";
RDebugUtils.currentLine=92930049;
 //BA.debugLineNum = 92930049;BA.debugLine="Container.RemoveAttr(sName)";
__ref._container /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,_sname);
RDebugUtils.currentLine=92930050;
 //BA.debugLineNum = 92930050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=92930051;
 //BA.debugLineNum = 92930051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _removerequired(b4j.example.vmcontainer __ref,String _r) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "removerequired", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "removerequired", new Object[] {_r}));}
RDebugUtils.currentLine=100270080;
 //BA.debugLineNum = 100270080;BA.debugLine="Sub RemoveRequired(r As String) As VMContainer";
RDebugUtils.currentLine=100270081;
 //BA.debugLineNum = 100270081;BA.debugLine="Required.Remove(r)";
__ref._required /*anywheresoftware.b4a.objects.collections.Map*/ .Remove((Object)(_r));
RDebugUtils.currentLine=100270082;
 //BA.debugLineNum = 100270082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=100270083;
 //BA.debugLineNum = 100270083;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=97648640;
 //BA.debugLineNum = 97648640;BA.debugLine="Sub Render";
RDebugUtils.currentLine=97648641;
 //BA.debugLineNum = 97648641;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=97648642;
 //BA.debugLineNum = 97648642;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _setattr(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=97517568;
 //BA.debugLineNum = 97517568;BA.debugLine="Sub SetAttr(attr As Map) As VMContainer";
RDebugUtils.currentLine=97517569;
 //BA.debugLineNum = 97517569;BA.debugLine="Container.SetAttr(attr)";
__ref._container /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=97517570;
 //BA.debugLineNum = 97517570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=97517571;
 //BA.debugLineNum = 97517571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setbackgroundcolor(b4j.example.vmcontainer __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setbackgroundcolor", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setbackgroundcolor", new Object[] {_p}));}
RDebugUtils.currentLine=94044160;
 //BA.debugLineNum = 94044160;BA.debugLine="Sub SetBackgroundColor(p As Object) As VMContainer";
RDebugUtils.currentLine=94044161;
 //BA.debugLineNum = 94044161;BA.debugLine="Container.SetBackgroundColor(p)";
__ref._container /*b4j.example.vmelement*/ ._setbackgroundcolor /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=94044162;
 //BA.debugLineNum = 94044162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94044163;
 //BA.debugLineNum = 94044163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setbackgroundimage(b4j.example.vmcontainer __ref,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setbackgroundimage", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setbackgroundimage", new Object[] {_url}));}
RDebugUtils.currentLine=94765056;
 //BA.debugLineNum = 94765056;BA.debugLine="Sub SetBackgroundImage(url As String) As VMContain";
RDebugUtils.currentLine=94765057;
 //BA.debugLineNum = 94765057;BA.debugLine="Container.SetBackgroundImage(url)";
__ref._container /*b4j.example.vmelement*/ ._setbackgroundimage /*b4j.example.vmelement*/ (null,_url);
RDebugUtils.currentLine=94765058;
 //BA.debugLineNum = 94765058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94765059;
 //BA.debugLineNum = 94765059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setborder(b4j.example.vmcontainer __ref,String _width,String _color,String _bstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setborder", new Object[] {_width,_color,_bstyle}));}
RDebugUtils.currentLine=96927744;
 //BA.debugLineNum = 96927744;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
RDebugUtils.currentLine=96927745;
 //BA.debugLineNum = 96927745;BA.debugLine="Container.SetBorder(width, color, bstyle)";
__ref._container /*b4j.example.vmelement*/ ._setborder /*b4j.example.vmelement*/ (null,_width,_color,_bstyle);
RDebugUtils.currentLine=96927746;
 //BA.debugLineNum = 96927746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=96927747;
 //BA.debugLineNum = 96927747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setborderrc(b4j.example.vmcontainer __ref,int _rowpos,int _colpos,String _width,String _color,String _bstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setborderrc", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setborderrc", new Object[] {_rowpos,_colpos,_width,_color,_bstyle}));}
RDebugUtils.currentLine=93192192;
 //BA.debugLineNum = 93192192;BA.debugLine="Sub SetBorderRC(rowPos As Int, colPos As Int, widt";
RDebugUtils.currentLine=93192193;
 //BA.debugLineNum = 93192193;BA.debugLine="Grid.SetBorder(rowPos, colPos, width, color, bsty";
__ref._grid /*b4j.example.vmgrid*/ ._setborder /*b4j.example.vmgrid*/ (null,_rowpos,_colpos,_width,_color,_bstyle);
RDebugUtils.currentLine=93192194;
 //BA.debugLineNum = 93192194;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=93192195;
 //BA.debugLineNum = 93192195;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setclass(b4j.example.vmcontainer __ref,int _rowpos,int _colpos,String _classname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setclass", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setclass", new Object[] {_rowpos,_colpos,_classname}));}
RDebugUtils.currentLine=93126656;
 //BA.debugLineNum = 93126656;BA.debugLine="Sub SetClass(rowPos As Int, colPos As Int, classNa";
RDebugUtils.currentLine=93126657;
 //BA.debugLineNum = 93126657;BA.debugLine="Grid.SetClass(rowPos, colPos, className)";
__ref._grid /*b4j.example.vmgrid*/ ._setclass /*String*/ (null,_rowpos,_colpos,_classname);
RDebugUtils.currentLine=93126658;
 //BA.debugLineNum = 93126658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93126659;
 //BA.debugLineNum = 93126659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcolor(b4j.example.vmcontainer __ref,Object _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setcolor", new Object[] {_c}));}
RDebugUtils.currentLine=93913088;
 //BA.debugLineNum = 93913088;BA.debugLine="Sub SetColor(c As Object) As VMContainer";
RDebugUtils.currentLine=93913089;
 //BA.debugLineNum = 93913089;BA.debugLine="Container.SetColor(c)";
__ref._container /*b4j.example.vmelement*/ ._setcolor /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=93913090;
 //BA.debugLineNum = 93913090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93913091;
 //BA.debugLineNum = 93913091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcursormove(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setcursormove", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setcursormove", null));}
RDebugUtils.currentLine=96993280;
 //BA.debugLineNum = 96993280;BA.debugLine="Sub SetCursorMove As VMContainer";
RDebugUtils.currentLine=96993281;
 //BA.debugLineNum = 96993281;BA.debugLine="Container.SetCursorMove";
__ref._container /*b4j.example.vmelement*/ ._setcursormove /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=96993282;
 //BA.debugLineNum = 96993282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=96993283;
 //BA.debugLineNum = 96993283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setcursorpointer(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setcursorpointer", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setcursorpointer", null));}
RDebugUtils.currentLine=97058816;
 //BA.debugLineNum = 97058816;BA.debugLine="Sub SetCursorPointer As VMContainer";
RDebugUtils.currentLine=97058817;
 //BA.debugLineNum = 97058817;BA.debugLine="Container.SetCursorPointer";
__ref._container /*b4j.example.vmelement*/ ._setcursorpointer /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=97058818;
 //BA.debugLineNum = 97058818;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=97058819;
 //BA.debugLineNum = 97058819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdraggable(b4j.example.vmcontainer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setdraggable", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setdraggable", new Object[] {_b}));}
RDebugUtils.currentLine=97189888;
 //BA.debugLineNum = 97189888;BA.debugLine="Sub SetDraggable(b As Boolean) As VMContainer";
RDebugUtils.currentLine=97189889;
 //BA.debugLineNum = 97189889;BA.debugLine="Container.SetDraggable(b)";
__ref._container /*b4j.example.vmelement*/ ._setdraggable /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=97189890;
 //BA.debugLineNum = 97189890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=97189891;
 //BA.debugLineNum = 97189891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setdroppable(b4j.example.vmcontainer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setdroppable", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setdroppable", new Object[] {_b}));}
RDebugUtils.currentLine=97255424;
 //BA.debugLineNum = 97255424;BA.debugLine="Sub SetDroppable(b As Boolean) As VMContainer";
RDebugUtils.currentLine=97255425;
 //BA.debugLineNum = 97255425;BA.debugLine="Container.SetDroppable(b)";
__ref._container /*b4j.example.vmelement*/ ._setdroppable /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=97255426;
 //BA.debugLineNum = 97255426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=97255427;
 //BA.debugLineNum = 97255427;BA.debugLine="End Sub";
return null;
}
public String  _setempty(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setempty", true))
	 {return ((String) Debug.delegate(ba, "setempty", null));}
RDebugUtils.currentLine=100073472;
 //BA.debugLineNum = 100073472;BA.debugLine="Sub SetEmpty";
RDebugUtils.currentLine=100073473;
 //BA.debugLineNum = 100073473;BA.debugLine="vue.SetStateListValues(Fields)";
__ref._vue /*b4j.example.bananovue*/ ._setstatelistvalues /*b4j.example.bananovue*/ (null,__ref._fields /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=100073474;
 //BA.debugLineNum = 100073474;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcontainer  _setheight(b4j.example.vmcontainer __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=97386496;
 //BA.debugLineNum = 97386496;BA.debugLine="Sub SetHeight(h As String) As VMContainer";
RDebugUtils.currentLine=97386497;
 //BA.debugLineNum = 97386497;BA.debugLine="Container.SetHeight(h)";
__ref._container /*b4j.example.vmelement*/ ._setheight /*b4j.example.vmelement*/ (null,_h);
RDebugUtils.currentLine=97386498;
 //BA.debugLineNum = 97386498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=97386499;
 //BA.debugLineNum = 97386499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setid(b4j.example.vmcontainer __ref,String _n,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setid", new Object[] {_n,_bind}));}
RDebugUtils.currentLine=93519872;
 //BA.debugLineNum = 93519872;BA.debugLine="Sub SetID(n As String, bind As Boolean) As VMConta";
RDebugUtils.currentLine=93519873;
 //BA.debugLineNum = 93519873;BA.debugLine="Container.SetID(n, bind)";
__ref._container /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_n,_bind);
RDebugUtils.currentLine=93519874;
 //BA.debugLineNum = 93519874;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93519875;
 //BA.debugLineNum = 93519875;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setkey(b4j.example.vmcontainer __ref,Object _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=93585408;
 //BA.debugLineNum = 93585408;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VMCont";
RDebugUtils.currentLine=93585409;
 //BA.debugLineNum = 93585409;BA.debugLine="Container.SetKey(k, bind)";
__ref._container /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,_k,_bind);
RDebugUtils.currentLine=93585410;
 //BA.debugLineNum = 93585410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93585411;
 //BA.debugLineNum = 93585411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmarginall(b4j.example.vmcontainer __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setmarginall", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setmarginall", new Object[] {_p}));}
RDebugUtils.currentLine=94109696;
 //BA.debugLineNum = 94109696;BA.debugLine="Sub SetMarginAll(p As Object) As VMContainer";
RDebugUtils.currentLine=94109697;
 //BA.debugLineNum = 94109697;BA.debugLine="Container.setmarginall(p)";
__ref._container /*b4j.example.vmelement*/ ._setmarginall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=94109698;
 //BA.debugLineNum = 94109698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94109699;
 //BA.debugLineNum = 94109699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmargins(b4j.example.vmcontainer __ref,Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setmargins", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setmargins", new Object[] {_mt,_mb,_ml,_mr}));}
RDebugUtils.currentLine=96796672;
 //BA.debugLineNum = 96796672;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
RDebugUtils.currentLine=96796673;
 //BA.debugLineNum = 96796673;BA.debugLine="Container.SetMargins(mt, mb, ml, mr)";
__ref._container /*b4j.example.vmelement*/ ._setmargins /*b4j.example.vmelement*/ (null,_mt,_mb,_ml,_mr);
RDebugUtils.currentLine=96796674;
 //BA.debugLineNum = 96796674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=96796675;
 //BA.debugLineNum = 96796675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setmarginsrc(b4j.example.vmcontainer __ref,int _rowpos,int _colpos,Object _mt,Object _mb,Object _ml,Object _mr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setmarginsrc", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setmarginsrc", new Object[] {_rowpos,_colpos,_mt,_mb,_ml,_mr}));}
RDebugUtils.currentLine=93257728;
 //BA.debugLineNum = 93257728;BA.debugLine="Sub SetMarginsRC(rowPos As Int, colPos As Int, mt";
RDebugUtils.currentLine=93257729;
 //BA.debugLineNum = 93257729;BA.debugLine="Grid.SetMargins(rowPos, colPos, mt, mb, ml, mr)";
__ref._grid /*b4j.example.vmgrid*/ ._setmargins /*b4j.example.vmgrid*/ (null,_rowpos,_colpos,_mt,_mb,_ml,_mr);
RDebugUtils.currentLine=93257730;
 //BA.debugLineNum = 93257730;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=93257731;
 //BA.debugLineNum = 93257731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmaxheight(b4j.example.vmcontainer __ref,String _mw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setmaxheight", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setmaxheight", new Object[] {_mw}));}
RDebugUtils.currentLine=94306304;
 //BA.debugLineNum = 94306304;BA.debugLine="Sub SetMaxHeight(mw As String) As VMContainer";
RDebugUtils.currentLine=94306305;
 //BA.debugLineNum = 94306305;BA.debugLine="Container.SetMaxHeight(mw)";
__ref._container /*b4j.example.vmelement*/ ._setmaxheight /*b4j.example.vmelement*/ (null,_mw);
RDebugUtils.currentLine=94306306;
 //BA.debugLineNum = 94306306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94306307;
 //BA.debugLineNum = 94306307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setmaxwidth(b4j.example.vmcontainer __ref,String _mw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setmaxwidth", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setmaxwidth", new Object[] {_mw}));}
RDebugUtils.currentLine=94240768;
 //BA.debugLineNum = 94240768;BA.debugLine="Sub SetMaxWidth(mw As String) As VMContainer";
RDebugUtils.currentLine=94240769;
 //BA.debugLineNum = 94240769;BA.debugLine="Container.SetMaxWidth(mw)";
__ref._container /*b4j.example.vmelement*/ ._setmaxwidth /*b4j.example.vmelement*/ (null,_mw);
RDebugUtils.currentLine=94240770;
 //BA.debugLineNum = 94240770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94240771;
 //BA.debugLineNum = 94240771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setnotselectible(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setnotselectible", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setnotselectible", null));}
RDebugUtils.currentLine=93388800;
 //BA.debugLineNum = 93388800;BA.debugLine="Sub SetNotSelectible As VMContainer";
RDebugUtils.currentLine=93388801;
 //BA.debugLineNum = 93388801;BA.debugLine="Container.SetNotSelectible";
__ref._container /*b4j.example.vmelement*/ ._setnotselectible /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=93388802;
 //BA.debugLineNum = 93388802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93388803;
 //BA.debugLineNum = 93388803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setonclick(b4j.example.vmcontainer __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setonclick", new Object[] {_methodname}));}
RDebugUtils.currentLine=94896128;
 //BA.debugLineNum = 94896128;BA.debugLine="Sub SetOnClick(methodName As String) As VMContaine";
RDebugUtils.currentLine=94896129;
 //BA.debugLineNum = 94896129;BA.debugLine="Container.SetOnClick(module, methodName)";
__ref._container /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,_methodname);
RDebugUtils.currentLine=94896130;
 //BA.debugLineNum = 94896130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94896131;
 //BA.debugLineNum = 94896131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setonclickrc(b4j.example.vmcontainer __ref,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setonclickrc", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setonclickrc", new Object[] {_rowpos,_colpos}));}
RDebugUtils.currentLine=94961664;
 //BA.debugLineNum = 94961664;BA.debugLine="Sub SetOnClickRC(rowpos As Int, colpos As Int) As";
RDebugUtils.currentLine=94961665;
 //BA.debugLineNum = 94961665;BA.debugLine="Grid.setonclick(rowpos,colpos)";
__ref._grid /*b4j.example.vmgrid*/ ._setonclick /*b4j.example.vmgrid*/ (null,_rowpos,_colpos);
RDebugUtils.currentLine=94961666;
 //BA.debugLineNum = 94961666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94961667;
 //BA.debugLineNum = 94961667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setondrop(b4j.example.vmcontainer __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setondrop", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setondrop", new Object[] {_methodname}));}
RDebugUtils.currentLine=96534528;
 //BA.debugLineNum = 96534528;BA.debugLine="Sub SetOnDrop(methodName As String) As VMContainer";
RDebugUtils.currentLine=96534529;
 //BA.debugLineNum = 96534529;BA.debugLine="Container.setondrop(module, methodName)";
__ref._container /*b4j.example.vmelement*/ ._setondrop /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,_methodname);
RDebugUtils.currentLine=96534530;
 //BA.debugLineNum = 96534530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=96534531;
 //BA.debugLineNum = 96534531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setonmouseout(b4j.example.vmcontainer __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setonmouseout", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setonmouseout", new Object[] {_methodname}));}
RDebugUtils.currentLine=96600064;
 //BA.debugLineNum = 96600064;BA.debugLine="Sub SetOnMouseOut(methodName As String) As VMConta";
RDebugUtils.currentLine=96600065;
 //BA.debugLineNum = 96600065;BA.debugLine="Container.SetOnMouseOut(module, methodName)";
__ref._container /*b4j.example.vmelement*/ ._setonmouseout /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,_methodname);
RDebugUtils.currentLine=96600066;
 //BA.debugLineNum = 96600066;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=96600067;
 //BA.debugLineNum = 96600067;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setonmouseover(b4j.example.vmcontainer __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setonmouseover", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setonmouseover", new Object[] {_methodname}));}
RDebugUtils.currentLine=96665600;
 //BA.debugLineNum = 96665600;BA.debugLine="Sub SetOnMouseOver(methodName As String) As VMCont";
RDebugUtils.currentLine=96665601;
 //BA.debugLineNum = 96665601;BA.debugLine="Container.SetOnMouseOver(module, methodName)";
__ref._container /*b4j.example.vmelement*/ ._setonmouseover /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,_methodname);
RDebugUtils.currentLine=96665602;
 //BA.debugLineNum = 96665602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=96665603;
 //BA.debugLineNum = 96665603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setpadding(b4j.example.vmcontainer __ref,Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setpadding", new Object[] {_pt,_pb,_pl,_pr}));}
RDebugUtils.currentLine=96731136;
 //BA.debugLineNum = 96731136;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
RDebugUtils.currentLine=96731137;
 //BA.debugLineNum = 96731137;BA.debugLine="Container.SetPadding(pt,pb,pl, pr)";
__ref._container /*b4j.example.vmelement*/ ._setpadding /*b4j.example.vmelement*/ (null,_pt,_pb,_pl,_pr);
RDebugUtils.currentLine=96731138;
 //BA.debugLineNum = 96731138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=96731139;
 //BA.debugLineNum = 96731139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setpaddingrc(b4j.example.vmcontainer __ref,int _rowpos,int _colpos,Object _pt,Object _pb,Object _pl,Object _pr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setpaddingrc", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setpaddingrc", new Object[] {_rowpos,_colpos,_pt,_pb,_pl,_pr}));}
RDebugUtils.currentLine=93323264;
 //BA.debugLineNum = 93323264;BA.debugLine="Sub SetPaddingRC(rowPos As Int, colPos As Int, pt";
RDebugUtils.currentLine=93323265;
 //BA.debugLineNum = 93323265;BA.debugLine="Grid.SetPadding(rowPos,colPos, pt,pb,pl,pr)";
__ref._grid /*b4j.example.vmgrid*/ ._setpadding /*b4j.example.vmgrid*/ (null,_rowpos,_colpos,_pt,_pb,_pl,_pr);
RDebugUtils.currentLine=93323266;
 //BA.debugLineNum = 93323266;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=93323267;
 //BA.debugLineNum = 93323267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setref(b4j.example.vmcontainer __ref,String _varref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setref", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setref", new Object[] {_varref}));}
RDebugUtils.currentLine=93454336;
 //BA.debugLineNum = 93454336;BA.debugLine="Sub SetRef(varRef As String) As VMContainer";
RDebugUtils.currentLine=93454337;
 //BA.debugLineNum = 93454337;BA.debugLine="Container.SetRef(varRef)";
__ref._container /*b4j.example.vmelement*/ ._setref /*b4j.example.vmelement*/ (null,_varref);
RDebugUtils.currentLine=93454338;
 //BA.debugLineNum = 93454338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93454339;
 //BA.debugLineNum = 93454339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setscrollbar(b4j.example.vmcontainer __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setscrollbar", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setscrollbar", new Object[] {_b}));}
RDebugUtils.currentLine=94699520;
 //BA.debugLineNum = 94699520;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMContainer";
RDebugUtils.currentLine=94699521;
 //BA.debugLineNum = 94699521;BA.debugLine="Container.SetScrollBar(b)";
__ref._container /*b4j.example.vmelement*/ ._setscrollbar /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=94699522;
 //BA.debugLineNum = 94699522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=94699523;
 //BA.debugLineNum = 94699523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setstyle(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=93978624;
 //BA.debugLineNum = 93978624;BA.debugLine="Sub SetStyle(m As Map) As VMContainer";
RDebugUtils.currentLine=93978625;
 //BA.debugLineNum = 93978625;BA.debugLine="Container.SetStyle(m)";
__ref._container /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=93978626;
 //BA.debugLineNum = 93978626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93978627;
 //BA.debugLineNum = 93978627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmgrid  _setstylerc(b4j.example.vmcontainer __ref,int _rowpos,int _colpos,String _prop,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setstylerc", true))
	 {return ((b4j.example.vmgrid) Debug.delegate(ba, "setstylerc", new Object[] {_rowpos,_colpos,_prop,_value}));}
RDebugUtils.currentLine=95289344;
 //BA.debugLineNum = 95289344;BA.debugLine="Sub SetStyleRC(rowPos As Int, colPos As Int, prop";
RDebugUtils.currentLine=95289345;
 //BA.debugLineNum = 95289345;BA.debugLine="Grid.setstyle(rowPos, colPos, prop, value)";
__ref._grid /*b4j.example.vmgrid*/ ._setstyle /*b4j.example.vmgrid*/ (null,_rowpos,_colpos,_prop,_value);
RDebugUtils.currentLine=95289346;
 //BA.debugLineNum = 95289346;BA.debugLine="Return Grid";
if (true) return __ref._grid /*b4j.example.vmgrid*/ ;
RDebugUtils.currentLine=95289347;
 //BA.debugLineNum = 95289347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _settextaligncenter(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "settextaligncenter", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "settextaligncenter", null));}
RDebugUtils.currentLine=97124352;
 //BA.debugLineNum = 97124352;BA.debugLine="Sub SetTextAlignCenter As VMContainer";
RDebugUtils.currentLine=97124353;
 //BA.debugLineNum = 97124353;BA.debugLine="Container.SetTextAlignCenter";
__ref._container /*b4j.example.vmelement*/ ._settextaligncenter /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=97124354;
 //BA.debugLineNum = 97124354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=97124355;
 //BA.debugLineNum = 97124355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvif(b4j.example.vmcontainer __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=93650944;
 //BA.debugLineNum = 93650944;BA.debugLine="Sub SetVIf(vif As String) As VMContainer";
RDebugUtils.currentLine=93650945;
 //BA.debugLineNum = 93650945;BA.debugLine="Container.SetVIf(vif)";
__ref._container /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=93650946;
 //BA.debugLineNum = 93650946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=93650947;
 //BA.debugLineNum = 93650947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setvshow(b4j.example.vmcontainer __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setvshow", new Object[] {_vshow}));}
RDebugUtils.currentLine=97452032;
 //BA.debugLineNum = 97452032;BA.debugLine="Sub SetVShow(vshow As String) As VMContainer";
RDebugUtils.currentLine=97452033;
 //BA.debugLineNum = 97452033;BA.debugLine="Container.SetVShow(vshow)";
__ref._container /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=97452034;
 //BA.debugLineNum = 97452034;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=97452035;
 //BA.debugLineNum = 97452035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcontainer  _setwidth(b4j.example.vmcontainer __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmcontainer) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=97320960;
 //BA.debugLineNum = 97320960;BA.debugLine="Sub SetWidth(w As String) As VMContainer";
RDebugUtils.currentLine=97320961;
 //BA.debugLineNum = 97320961;BA.debugLine="Container.SetWidth(w)";
__ref._container /*b4j.example.vmelement*/ ._setwidth /*b4j.example.vmelement*/ (null,_w);
RDebugUtils.currentLine=97320962;
 //BA.debugLineNum = 97320962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcontainer)(this);
RDebugUtils.currentLine=97320963;
 //BA.debugLineNum = 97320963;BA.debugLine="End Sub";
return null;
}
public String  _show(b4j.example.vmcontainer __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "show", true))
	 {return ((String) Debug.delegate(ba, "show", null));}
RDebugUtils.currentLine=94568448;
 //BA.debugLineNum = 94568448;BA.debugLine="Sub Show";
RDebugUtils.currentLine=94568449;
 //BA.debugLineNum = 94568449;BA.debugLine="vue.SetStateSingle($\"${ID}show\"$, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"show"),(Object)(__c.True));
RDebugUtils.currentLine=94568450;
 //BA.debugLineNum = 94568450;BA.debugLine="End Sub";
return "";
}
public String  _showerror(b4j.example.vmcontainer __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "showerror", true))
	 {return ((String) Debug.delegate(ba, "showerror", new Object[] {_elid}));}
RDebugUtils.currentLine=98041856;
 //BA.debugLineNum = 98041856;BA.debugLine="Sub ShowError(elID As String)";
RDebugUtils.currentLine=98041857;
 //BA.debugLineNum = 98041857;BA.debugLine="vue.SetStateSingle($\"${elID}error\"$, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.True));
RDebugUtils.currentLine=98041858;
 //BA.debugLineNum = 98041858;BA.debugLine="End Sub";
return "";
}
public boolean  _validate(b4j.example.vmcontainer __ref,anywheresoftware.b4a.objects.collections.Map _rec) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcontainer";
if (Debug.shouldDelegate(ba, "validate", true))
	 {return ((Boolean) Debug.delegate(ba, "validate", new Object[] {_rec}));}
int _iv = 0;
String _k = "";
String _v = "";
RDebugUtils.currentLine=97976320;
 //BA.debugLineNum = 97976320;BA.debugLine="Sub Validate(rec As Map) As Boolean";
RDebugUtils.currentLine=97976321;
 //BA.debugLineNum = 97976321;BA.debugLine="Dim iv As Int = 0";
_iv = (int) (0);
RDebugUtils.currentLine=97976322;
 //BA.debugLineNum = 97976322;BA.debugLine="For Each k As String In Required.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = __ref._required /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=97976323;
 //BA.debugLineNum = 97976323;BA.debugLine="If rec.ContainsKey(k) Then";
if (_rec.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=97976324;
 //BA.debugLineNum = 97976324;BA.debugLine="Dim v As String = rec.GetDefault(k,\"\")";
_v = BA.ObjectToString(_rec.GetDefault((Object)(_k),(Object)("")));
RDebugUtils.currentLine=97976325;
 //BA.debugLineNum = 97976325;BA.debugLine="v = vue.CStr(v)";
_v = __ref._vue /*b4j.example.bananovue*/ ._cstr /*String*/ (null,(Object)(_v));
RDebugUtils.currentLine=97976326;
 //BA.debugLineNum = 97976326;BA.debugLine="v = v.trim";
_v = _v.trim();
RDebugUtils.currentLine=97976327;
 //BA.debugLineNum = 97976327;BA.debugLine="If v = \"\" Then";
if ((_v).equals("")) { 
RDebugUtils.currentLine=97976328;
 //BA.debugLineNum = 97976328;BA.debugLine="Log(\"Validate: \" & k)";
__c.Log("Validate: "+_k);
RDebugUtils.currentLine=97976329;
 //BA.debugLineNum = 97976329;BA.debugLine="iv = iv + 1";
_iv = (int) (_iv+1);
RDebugUtils.currentLine=97976330;
 //BA.debugLineNum = 97976330;BA.debugLine="ShowError(k)";
__ref._showerror /*String*/ (null,_k);
 }else {
RDebugUtils.currentLine=97976332;
 //BA.debugLineNum = 97976332;BA.debugLine="HideError(k)";
__ref._hideerror /*String*/ (null,_k);
 };
 };
 }
};
RDebugUtils.currentLine=97976336;
 //BA.debugLineNum = 97976336;BA.debugLine="If iv = 0 Then";
if (_iv==0) { 
RDebugUtils.currentLine=97976337;
 //BA.debugLineNum = 97976337;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
RDebugUtils.currentLine=97976339;
 //BA.debugLineNum = 97976339;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=97976341;
 //BA.debugLineNum = 97976341;BA.debugLine="End Sub";
return false;
}
}