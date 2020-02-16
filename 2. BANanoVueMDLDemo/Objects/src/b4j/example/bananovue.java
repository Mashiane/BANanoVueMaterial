package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananovue extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananovue", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananovue.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public com.ab.banano.BANanoObject _bovue = null;
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.Map _methods = null;
public anywheresoftware.b4a.objects.collections.Map _data = null;
public anywheresoftware.b4a.objects.collections.Map _refs = null;
public com.ab.banano.BANanoElement _body = null;
public b4j.example.vuehtml _template = null;
public anywheresoftware.b4a.objects.collections.Map _computed = null;
public anywheresoftware.b4a.objects.collections.Map _watches = null;
public com.ab.banano.BANanoObject _created = null;
public com.ab.banano.BANanoObject _mounted = null;
public com.ab.banano.BANanoObject _beforecreate = null;
public com.ab.banano.BANanoObject _destroyed = null;
public com.ab.banano.BANanoObject _beforemount = null;
public com.ab.banano.BANanoObject _updated = null;
public com.ab.banano.BANanoObject _beforedestroy = null;
public com.ab.banano.BANanoObject _activated = null;
public com.ab.banano.BANanoObject _deactivated = null;
public com.ab.banano.BANanoObject _beforeupdate = null;
public com.ab.banano.BANanoObject _typeofstring = null;
public com.ab.banano.BANanoObject _typeofnumber = null;
public com.ab.banano.BANanoObject _typeofboolean = null;
public com.ab.banano.BANanoObject _typeofarray = null;
public com.ab.banano.BANanoObject _typeofobject = null;
public com.ab.banano.BANanoObject _typeofdate = null;
public com.ab.banano.BANanoObject _typeoffunction = null;
public com.ab.banano.BANanoObject _typeofsymbol = null;
public com.ab.banano.BANanoObject _borouter = null;
public anywheresoftware.b4a.objects.collections.List _routes = null;
public anywheresoftware.b4a.objects.collections.Map _components = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public anywheresoftware.b4a.objects.collections.Map _dynamicstyle = null;
public com.ab.banano.BANanoObject _jquery = null;
public String _gettemplate = "";
public String _colors_red = "";
public String _colors_pink = "";
public String _colors_purple = "";
public String _colors_deeppurple = "";
public String _colors_indigo = "";
public String _colors_blue = "";
public String _colors_lightblue = "";
public String _colors_cyan = "";
public String _colors_teal = "";
public String _colors_green = "";
public String _colors_lightgreen = "";
public String _colors_lime = "";
public String _colors_yellow = "";
public String _colors_amber = "";
public String _colors_orange = "";
public String _colors_deeporange = "";
public String _colors_brown = "";
public String _colors_grey = "";
public String _colors_bluegrey = "";
public String _colors_black = "";
public String _colors_white = "";
public String _colors_transparent = "";
public String _border_default = "";
public String _border_dashed = "";
public String _border_dotted = "";
public String _border_double = "";
public String _border_groove = "";
public String _border_hidden = "";
public String _border_inset = "";
public String _border_none = "";
public String _border_outset = "";
public String _border_ridge = "";
public String _border_solid = "";
public String _color_amber = "";
public String _color_black = "";
public String _color_blue = "";
public String _color_bluegrey = "";
public String _color_brown = "";
public String _color_cyan = "";
public String _color_deeporange = "";
public String _color_deeppurple = "";
public String _color_green = "";
public String _color_grey = "";
public String _color_indigo = "";
public String _color_lightblue = "";
public String _color_lightgreen = "";
public String _color_lime = "";
public String _color_orange = "";
public String _color_pink = "";
public String _color_purple = "";
public String _color_red = "";
public String _color_teal = "";
public String _color_transparent = "";
public String _color_white = "";
public String _color_yellow = "";
public String _intensity_normal = "";
public String _intensity_lighten5 = "";
public String _intensity_lighten4 = "";
public String _intensity_lighten3 = "";
public String _intensity_lighten2 = "";
public String _intensity_lighten1 = "";
public String _intensity_darken1 = "";
public String _intensity_darken2 = "";
public String _intensity_darken3 = "";
public String _intensity_darken4 = "";
public String _intensity_accent1 = "";
public String _intensity_accent2 = "";
public String _intensity_accent3 = "";
public String _intensity_accent4 = "";
public b4j.example.bananovue._colortypes _colors = null;
public anywheresoftware.b4a.objects.collections.Map _colormap = null;
public String _attention_seekers_bounce = "";
public String _attention_seekers_flash = "";
public String _attention_seekers_pulse = "";
public String _attention_seekers_rubberband = "";
public String _attention_seekers_shake = "";
public String _attention_seekers_swing = "";
public String _attention_seekers_tada = "";
public String _attention_seekers_wobble = "";
public String _attention_seekers_jello = "";
public String _bouncing_entrances_bouncein = "";
public String _bouncing_entrances_bounceindown = "";
public String _bouncing_entrances_bounceinleft = "";
public String _bouncing_entrances_bounceinright = "";
public String _bouncing_entrancesbounceinup = "";
public String _bouncing_exits_bounceout = "";
public String _bouncing_exits_bounceoutdown = "";
public String _bouncing_exits_bounceoutleft = "";
public String _bouncing_exits_bounceoutright = "";
public String _bouncing_exits_bounceoutup = "";
public String _fading_entrances_fadein = "";
public String _fading_entrances_fadeindown = "";
public String _fading_entrances_fadeindownbig = "";
public String _fading_entrances_fadeinleft = "";
public String _fading_entrances_fadeinleftbig = "";
public String _fading_entrances_fadeinright = "";
public String _fading_entrances_fadeinrightbig = "";
public String _fading_entrances_fadeinup = "";
public String _fading_entrances_fadeinupbig = "";
public String _fading_exits_fadeout = "";
public String _fading_exits_fadeoutdown = "";
public String _fading_exits_fadeoutdownbig = "";
public String _fading_exits_fadeoutleft = "";
public String _fading_exits_fadeoutleftbig = "";
public String _fading_exits_fadeoutright = "";
public String _fading_exits_fadeoutrightbig = "";
public String _fading_exits_fadeoutup = "";
public String _fading_exits_fadeoutupbig = "";
public String _flippers_flip = "";
public String _flippers_flipinx = "";
public String _flippers_flipiny = "";
public String _flippers_flipoutx = "";
public String _flippers_flipouty = "";
public String _lightspeed_lightspeedin = "";
public String _lightspeed_lightspeedout = "";
public String _rotating_entrances_rotatein = "";
public String _rotating_entrances_rotateindownleft = "";
public String _rotating_entrances_rotateindownright = "";
public String _rotating_entrances_rotateinupleft = "";
public String _rotating_entrances_rotateinupright = "";
public String _rotating_exits_rotateout = "";
public String _rotating_exits_rotateoutdownleft = "";
public String _rotating_exits_rotateoutdownright = "";
public String _rotating_exits_rotateoutupleft = "";
public String _rotating_exits_rotateoutupright = "";
public String _sliding_entrances_slideinup = "";
public String _sliding_entrances_slideindown = "";
public String _sliding_entrances_slideinleft = "";
public String _sliding_entrances_slideinright = "";
public String _sliding_exits_slideoutup = "";
public String _sliding_exits_slideoutdown = "";
public String _sliding_exits_slideoutleft = "";
public String _sliding_exits_slideoutright = "";
public String _zoom_entrances_zoomin = "";
public String _zoom_entrances_zoomindown = "";
public String _zoom_entrances_zoominleft = "";
public String _zoom_entrances_zoominright = "";
public String _zoom_entrances_zoominup = "";
public String _zoom_exits_zoomout = "";
public String _zoom_exits_zoomoutdown = "";
public String _zoom_exits_zoomoutleft = "";
public String _zoom_exits_zoomoutright = "";
public String _zoom_exits_zoomoutup = "";
public String _specials_hinge = "";
public String _specials_rollin = "";
public String _specials_rollout = "";
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
public static class _fileobject{
public boolean IsInitialized;
public String FileName;
public String FileDate;
public long FileSize;
public String FileType;
public void Initialize() {
IsInitialized = true;
FileName = "";
FileDate = "";
FileSize = 0L;
FileType = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _colortypes{
public boolean IsInitialized;
public String red;
public String pink;
public String purple;
public String deepPurple;
public String indigo;
public String blue;
public String lightBlue;
public String cyan;
public String teal;
public String green;
public String lightGreen;
public String lime;
public String yellow;
public String amber;
public String Orange;
public String deepOrange;
public String brown;
public String grey;
public String blueGrey;
public String black;
public String white;
public String transparent;
public void Initialize() {
IsInitialized = true;
red = "";
pink = "";
purple = "";
deepPurple = "";
indigo = "";
blue = "";
lightBlue = "";
cyan = "";
teal = "";
green = "";
lightGreen = "";
lime = "";
yellow = "";
amber = "";
Orange = "";
deepOrange = "";
brown = "";
grey = "";
blueGrey = "";
black = "";
white = "";
transparent = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public b4j.example.bananovue  _addcomponent(b4j.example.vuecomponent _comp) throws Exception{
String _sid = "";
 //BA.debugLineNum = 1633;BA.debugLine="Sub AddComponent(comp As VueComponent) As BANanoVu";
 //BA.debugLineNum = 1634;BA.debugLine="Dim sid As String = comp.id";
_sid = _comp._id /*String*/ ;
 //BA.debugLineNum = 1635;BA.debugLine="components.Put(sid, comp.Component)";
_components.Put((Object)(_sid),(Object)(_comp._component /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 1636;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1637;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _addcomponentbo(String _compname,com.ab.banano.BANanoObject _comp) throws Exception{
 //BA.debugLineNum = 1639;BA.debugLine="Sub AddComponentBO(compName As String, comp As BAN";
 //BA.debugLineNum = 1640;BA.debugLine="components.Put(compName, comp)";
_components.Put((Object)(_compname),(Object)(_comp.getObject()));
 //BA.debugLineNum = 1641;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1642;BA.debugLine="End Sub";
return null;
}
public String  _addroute(String _path,b4j.example.vuecomponent _comp) throws Exception{
anywheresoftware.b4a.objects.collections.Map _eachroute = null;
 //BA.debugLineNum = 1645;BA.debugLine="Sub AddRoute(path As String, comp As VueComponent)";
 //BA.debugLineNum = 1646;BA.debugLine="If comp.name = \"\" Then";
if ((_comp._name /*String*/ ).equals("")) { 
 //BA.debugLineNum = 1647;BA.debugLine="Log(\"AddRoute: Please specify the name of the Ro";
__c.Log("AddRoute: Please specify the name of the Route!");
 };
 //BA.debugLineNum = 1650;BA.debugLine="Dim eachroute As Map = CreateMap()";
_eachroute = new anywheresoftware.b4a.objects.collections.Map();
_eachroute = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1651;BA.debugLine="eachroute.Put(\"path\", path)";
_eachroute.Put((Object)("path"),(Object)(_path));
 //BA.debugLineNum = 1652;BA.debugLine="eachroute.Put(\"name\", comp.name)";
_eachroute.Put((Object)("name"),(Object)(_comp._name /*String*/ ));
 //BA.debugLineNum = 1653;BA.debugLine="eachroute.Put(\"component\", comp.component)";
_eachroute.Put((Object)("component"),(Object)(_comp._component /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 1655;BA.debugLine="routes.Add(eachroute)";
_routes.Add((Object)(_eachroute.getObject()));
 //BA.debugLineNum = 1656;BA.debugLine="End Sub";
return "";
}
public String  _aftertodayrg(long _dvariance) throws Exception{
 //BA.debugLineNum = 2519;BA.debugLine="public Sub AfterTodayRG(dVariance As Long) As Stri";
 //BA.debugLineNum = 2520;BA.debugLine="If dVariance <= 0 Then";
if (_dvariance<=0) { 
 //BA.debugLineNum = 2521;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance>0) { 
 //BA.debugLineNum = 2523;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else {
 //BA.debugLineNum = 2525;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 2527;BA.debugLine="End Sub";
return "";
}
public int  _age(String _birthday) throws Exception{
String _tday = "";
String _cday = "";
int _adays = 0;
int _ayears = 0;
 //BA.debugLineNum = 446;BA.debugLine="Sub Age(birthDay As String) As Int";
 //BA.debugLineNum = 447;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 448;BA.debugLine="Dim tDay As String = DateTime.Date(DateTime.Now)";
_tday = __c.DateTime.Date(__c.DateTime.getNow());
 //BA.debugLineNum = 449;BA.debugLine="Dim cDay As String = DateTime.Date(DateTime.DateP";
_cday = __c.DateTime.Date(__c.DateTime.DateParse(_birthday));
 //BA.debugLineNum = 450;BA.debugLine="Dim aDays As Int = DateDiff(tDay, cDay)";
_adays = _datediff(_tday,_cday);
 //BA.debugLineNum = 451;BA.debugLine="Dim aYears As Int = aDays / 365.25";
_ayears = (int) (_adays/(double)365.25);
 //BA.debugLineNum = 452;BA.debugLine="Return BANAno.parseInt(aYears)";
if (true) return _banano.parseInt((Object)(_ayears));
 //BA.debugLineNum = 453;BA.debugLine="End Sub";
return 0;
}
public String  _alpha(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 575;BA.debugLine="Public Sub Alpha(value As String) As String";
 //BA.debugLineNum = 576;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 577;BA.debugLine="Try";
try { //BA.debugLineNum = 578;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 579;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
 //BA.debugLineNum = 580;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 581;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 582;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 583;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 584;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 585;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 586;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (_instr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",_mout)!=-1) { 
 //BA.debugLineNum = 587;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 590;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 592;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 594;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _audittrail(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _df = null;
String _k = "";
Object _v = null;
Object _nv = null;
Object _ov = null;
 //BA.debugLineNum = 1670;BA.debugLine="Sub AuditTrail(oldM As Map, newM As Map) As Map";
 //BA.debugLineNum = 1671;BA.debugLine="Dim df As Map = CreateMap()";
_df = new anywheresoftware.b4a.objects.collections.Map();
_df = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1672;BA.debugLine="For Each k As String In oldM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1673;BA.debugLine="Dim v As Object = oldM.Get(k)";
_v = _oldm.Get((Object)(_k));
 //BA.debugLineNum = 1674;BA.debugLine="If newM.ContainsKey(k) Then";
if (_newm.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1675;BA.debugLine="Dim nv As Object = newM.Get(k)";
_nv = _newm.Get((Object)(_k));
 //BA.debugLineNum = 1676;BA.debugLine="If v <> nv Then";
if ((_v).equals(_nv) == false) { 
 //BA.debugLineNum = 1677;BA.debugLine="df.Put(k, nv)";
_df.Put((Object)(_k),_nv);
 };
 };
 }
};
 //BA.debugLineNum = 1681;BA.debugLine="For Each k As String In newM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group11 = _newm.Keys();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_k = BA.ObjectToString(group11.Get(index11));
 //BA.debugLineNum = 1682;BA.debugLine="Dim v As Object = newM.Get(k)";
_v = _newm.Get((Object)(_k));
 //BA.debugLineNum = 1683;BA.debugLine="If oldM.ContainsKey(k) Then";
if (_oldm.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1684;BA.debugLine="Dim ov As Object = oldM.Get(k)";
_ov = _oldm.Get((Object)(_k));
 //BA.debugLineNum = 1685;BA.debugLine="If v <> ov Then";
if ((_v).equals(_ov) == false) { 
 //BA.debugLineNum = 1686;BA.debugLine="df.Put(k, v)";
_df.Put((Object)(_k),_v);
 };
 }else {
 //BA.debugLineNum = 1689;BA.debugLine="df.Put(k, v)";
_df.Put((Object)(_k),_v);
 };
 }
};
 //BA.debugLineNum = 1692;BA.debugLine="Return df";
if (true) return _df;
 //BA.debugLineNum = 1693;BA.debugLine="End Sub";
return null;
}
public String  _br() throws Exception{
 //BA.debugLineNum = 1499;BA.debugLine="Sub BR As String";
 //BA.debugLineNum = 1500;BA.debugLine="Return \"<br>\"";
if (true) return "<br>";
 //BA.debugLineNum = 1501;BA.debugLine="End Sub";
return "";
}
public Object  _callcomputed(String _methodname) throws Exception{
 //BA.debugLineNum = 1938;BA.debugLine="Sub CallComputed(methodName As String) As Object";
 //BA.debugLineNum = 1939;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1940;BA.debugLine="Return BOVue.GetField(methodName)";
if (true) return (Object)(_bovue.GetField(_methodname).getObject());
 //BA.debugLineNum = 1941;BA.debugLine="End Sub";
return null;
}
public String  _callmethod(String _methodname) throws Exception{
 //BA.debugLineNum = 1943;BA.debugLine="Sub CallMethod(methodName As String)";
 //BA.debugLineNum = 1944;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 1945;BA.debugLine="BOVue.RunMethod(methodName, Null)";
_bovue.RunMethod(_methodname,__c.Null);
 //BA.debugLineNum = 1946;BA.debugLine="End Sub";
return "";
}
public String  _capitalize(String _t) throws Exception{
String _s = "";
String _r = "";
String _o = "";
 //BA.debugLineNum = 882;BA.debugLine="Sub Capitalize(t As String) As String";
 //BA.debugLineNum = 883;BA.debugLine="Dim s , r , o As String";
_s = "";
_r = "";
_o = "";
 //BA.debugLineNum = 884;BA.debugLine="s = t.SubString2(0,1)";
_s = _t.substring((int) (0),(int) (1));
 //BA.debugLineNum = 885;BA.debugLine="r = t.SubString2(1, t.Length)";
_r = _t.substring((int) (1),_t.length());
 //BA.debugLineNum = 886;BA.debugLine="o = s.ToUpperCase & r";
_o = _s.toUpperCase()+_r;
 //BA.debugLineNum = 887;BA.debugLine="Return o";
if (true) return _o;
 //BA.debugLineNum = 888;BA.debugLine="End Sub";
return "";
}
public double  _cdbl(String _value) throws Exception{
double _out = 0;
 //BA.debugLineNum = 467;BA.debugLine="Public Sub CDbl(value As String) As Double";
 //BA.debugLineNum = 468;BA.debugLine="Try";
try { //BA.debugLineNum = 469;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 470;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 471;BA.debugLine="value = value.Replace(\",\",\"\")";
_value = _value.replace(",","");
 //BA.debugLineNum = 472;BA.debugLine="Dim out As Double = NumberFormat2(value,0,2,2,Fa";
_out = (double)(Double.parseDouble(__c.NumberFormat2((double)(Double.parseDouble(_value)),(int) (0),(int) (2),(int) (2),__c.False)));
 //BA.debugLineNum = 473;BA.debugLine="Return out";
if (true) return _out;
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 475;BA.debugLine="Return value";
if (true) return (double)(Double.parseDouble(_value));
 };
 //BA.debugLineNum = 477;BA.debugLine="End Sub";
return 0;
}
public int  _cint(Object _o) throws Exception{
 //BA.debugLineNum = 708;BA.debugLine="Sub CInt(o As Object) As Int";
 //BA.debugLineNum = 709;BA.debugLine="Return Floor(o)";
if (true) return (int) (__c.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 710;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Type FileObject(FileName As String, FileDate As S";
;
 //BA.debugLineNum = 4;BA.debugLine="Public BOVue As BANanoObject";
_bovue = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 5;BA.debugLine="Private BANAno As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 6;BA.debugLine="Private methods As Map";
_methods = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 7;BA.debugLine="Public data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 8;BA.debugLine="Public refs As Map";
_refs = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 9;BA.debugLine="Public body As BANanoElement";
_body = new com.ab.banano.BANanoElement();
 //BA.debugLineNum = 10;BA.debugLine="Public Template As VueHTML";
_template = new b4j.example.vuehtml();
 //BA.debugLineNum = 11;BA.debugLine="Private computed As Map";
_computed = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 12;BA.debugLine="Private watches As Map";
_watches = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 13;BA.debugLine="Private created As BANanoObject";
_created = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 14;BA.debugLine="Private mounted As BANanoObject";
_mounted = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 15;BA.debugLine="Private beforeCreate As BANanoObject";
_beforecreate = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 16;BA.debugLine="Private destroyed As BANanoObject";
_destroyed = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 17;BA.debugLine="Private beforeMount As BANanoObject";
_beforemount = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 18;BA.debugLine="Private updated As BANanoObject";
_updated = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 19;BA.debugLine="Private beforeDestroy As BANanoObject";
_beforedestroy = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 20;BA.debugLine="Private activated As BANanoObject";
_activated = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 21;BA.debugLine="Private deactivated As BANanoObject";
_deactivated = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 22;BA.debugLine="Private beforeUpdate As BANanoObject";
_beforeupdate = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 23;BA.debugLine="Private TypeOfString As BANanoObject   'ignore";
_typeofstring = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 24;BA.debugLine="Private TypeOfNumber As BANanoObject   'ignore";
_typeofnumber = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 25;BA.debugLine="Private TypeOfBoolean As BANanoObject  'ignore";
_typeofboolean = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 26;BA.debugLine="Private TypeOfArray As BANanoObject    'ignore";
_typeofarray = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 27;BA.debugLine="Private TypeOfObject As BANanoObject   'ignore";
_typeofobject = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 28;BA.debugLine="Private TypeOfDate As BANanoObject     'ignore";
_typeofdate = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 29;BA.debugLine="Private TypeOfFunction As BANanoObject  'ignore";
_typeoffunction = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 30;BA.debugLine="Private TypeOfSymbol As BANanoObject    'ignore";
_typeofsymbol = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 31;BA.debugLine="Private BORouter As BANanoObject      'ignore";
_borouter = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 32;BA.debugLine="Private routes As List";
_routes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 33;BA.debugLine="Private components As Map";
_components = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 34;BA.debugLine="Public Options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 35;BA.debugLine="Private dynamicStyle As Map";
_dynamicstyle = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 36;BA.debugLine="Public JQuery As BANanoObject";
_jquery = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 37;BA.debugLine="Public GetTemplate As String";
_gettemplate = "";
 //BA.debugLineNum = 38;BA.debugLine="Public const colors_red As String = \"#F44336\"";
_colors_red = "#F44336";
 //BA.debugLineNum = 39;BA.debugLine="Public const colors_pink As String = \"#E91E63\"";
_colors_pink = "#E91E63";
 //BA.debugLineNum = 40;BA.debugLine="Public const colors_purple As String = \"#9C27B0\"";
_colors_purple = "#9C27B0";
 //BA.debugLineNum = 41;BA.debugLine="Public const colors_deepPurple As String = \"#673A";
_colors_deeppurple = "#673AB7";
 //BA.debugLineNum = 42;BA.debugLine="Public const colors_indigo As String = \"#3F51B5\"";
_colors_indigo = "#3F51B5";
 //BA.debugLineNum = 43;BA.debugLine="Public const colors_blue As String = \"#2196F3\"";
_colors_blue = "#2196F3";
 //BA.debugLineNum = 44;BA.debugLine="Public const colors_lightBlue As String = \"#03A9F";
_colors_lightblue = "#03A9F4";
 //BA.debugLineNum = 45;BA.debugLine="Public const colors_cyan As String = \"#00BCD4\"";
_colors_cyan = "#00BCD4";
 //BA.debugLineNum = 46;BA.debugLine="Public const colors_teal As String = \"#009688\"";
_colors_teal = "#009688";
 //BA.debugLineNum = 47;BA.debugLine="Public const colors_green As String = \"#4CAF50\"";
_colors_green = "#4CAF50";
 //BA.debugLineNum = 48;BA.debugLine="Public const colors_lightGreen As String = \"#8BC3";
_colors_lightgreen = "#8BC34A";
 //BA.debugLineNum = 49;BA.debugLine="Public const colors_lime As String = \"#CDDC39\"";
_colors_lime = "#CDDC39";
 //BA.debugLineNum = 50;BA.debugLine="Public const colors_yellow As String = \"#ffe821\"";
_colors_yellow = "#ffe821";
 //BA.debugLineNum = 51;BA.debugLine="Public const colors_amber As String = \"#FFC107\"";
_colors_amber = "#FFC107";
 //BA.debugLineNum = 52;BA.debugLine="Public const colors_orange As String = \"#FF9800\"";
_colors_orange = "#FF9800";
 //BA.debugLineNum = 53;BA.debugLine="Public const colors_deepOrange As String = \"#FF57";
_colors_deeporange = "#FF5722";
 //BA.debugLineNum = 54;BA.debugLine="Public const colors_brown As String = \"#795548\"";
_colors_brown = "#795548";
 //BA.debugLineNum = 55;BA.debugLine="Public const colors_grey As String = \"#9E9E9E\"";
_colors_grey = "#9E9E9E";
 //BA.debugLineNum = 56;BA.debugLine="Public const colors_blueGrey As String = \"#607D8B";
_colors_bluegrey = "#607D8B";
 //BA.debugLineNum = 57;BA.debugLine="Public const colors_black As String = \"#000000\"";
_colors_black = "#000000";
 //BA.debugLineNum = 58;BA.debugLine="Public const colors_white As String = \"#ffffff\"";
_colors_white = "#ffffff";
 //BA.debugLineNum = 59;BA.debugLine="Public const colors_transparent As String = \"tran";
_colors_transparent = "transparent";
 //BA.debugLineNum = 61;BA.debugLine="Public const BORDER_DEFAULT As String = \"\"";
_border_default = "";
 //BA.debugLineNum = 62;BA.debugLine="Public const BORDER_DASHED As String = \"dashed\"";
_border_dashed = "dashed";
 //BA.debugLineNum = 63;BA.debugLine="Public const BORDER_DOTTED As String = \"dotted\"";
_border_dotted = "dotted";
 //BA.debugLineNum = 64;BA.debugLine="Public const BORDER_DOUBLE As String = \"double\"";
_border_double = "double";
 //BA.debugLineNum = 65;BA.debugLine="Public const BORDER_GROOVE As String = \"groove\"";
_border_groove = "groove";
 //BA.debugLineNum = 66;BA.debugLine="Public const BORDER_HIDDEN As String = \"hidden\"";
_border_hidden = "hidden";
 //BA.debugLineNum = 67;BA.debugLine="Public const BORDER_INSET As String = \"inset\"";
_border_inset = "inset";
 //BA.debugLineNum = 68;BA.debugLine="Public const BORDER_NONE As String = \"none\"";
_border_none = "none";
 //BA.debugLineNum = 69;BA.debugLine="Public const BORDER_OUTSET As String = \"outset\"";
_border_outset = "outset";
 //BA.debugLineNum = 70;BA.debugLine="Public const BORDER_RIDGE As String = \"ridge\"";
_border_ridge = "ridge";
 //BA.debugLineNum = 71;BA.debugLine="Public const BORDER_SOLID As String = \"solid\"";
_border_solid = "solid";
 //BA.debugLineNum = 73;BA.debugLine="Public const COLOR_AMBER As String = \"amber\"";
_color_amber = "amber";
 //BA.debugLineNum = 74;BA.debugLine="Public const COLOR_BLACK As String = \"black\"";
_color_black = "black";
 //BA.debugLineNum = 75;BA.debugLine="Public const COLOR_BLUE As String = \"blue\"";
_color_blue = "blue";
 //BA.debugLineNum = 76;BA.debugLine="Public const COLOR_BLUEGREY As String = \"blue-gre";
_color_bluegrey = "blue-grey";
 //BA.debugLineNum = 77;BA.debugLine="Public const COLOR_BROWN As String = \"brown\"";
_color_brown = "brown";
 //BA.debugLineNum = 78;BA.debugLine="Public const COLOR_CYAN As String = \"cyan\"";
_color_cyan = "cyan";
 //BA.debugLineNum = 79;BA.debugLine="Public const COLOR_DEEPORANGE As String = \"deep-o";
_color_deeporange = "deep-orange";
 //BA.debugLineNum = 80;BA.debugLine="Public const COLOR_DEEPPURPLE As String = \"deep-p";
_color_deeppurple = "deep-purple";
 //BA.debugLineNum = 81;BA.debugLine="Public const COLOR_GREEN As String = \"green\"";
_color_green = "green";
 //BA.debugLineNum = 82;BA.debugLine="Public const COLOR_GREY As String = \"grey\"";
_color_grey = "grey";
 //BA.debugLineNum = 83;BA.debugLine="Public const COLOR_INDIGO As String = \"indigo\"";
_color_indigo = "indigo";
 //BA.debugLineNum = 84;BA.debugLine="Public const COLOR_LIGHTBLUE As String = \"light-b";
_color_lightblue = "light-blue";
 //BA.debugLineNum = 85;BA.debugLine="Public const COLOR_LIGHTGREEN As String = \"light-";
_color_lightgreen = "light-green";
 //BA.debugLineNum = 86;BA.debugLine="Public const COLOR_LIME As String = \"lime\"";
_color_lime = "lime";
 //BA.debugLineNum = 87;BA.debugLine="Public const COLOR_ORANGE As String = \"orange\"";
_color_orange = "orange";
 //BA.debugLineNum = 88;BA.debugLine="Public const COLOR_PINK As String = \"pink\"";
_color_pink = "pink";
 //BA.debugLineNum = 89;BA.debugLine="Public const COLOR_PURPLE As String = \"purple\"";
_color_purple = "purple";
 //BA.debugLineNum = 90;BA.debugLine="Public const COLOR_RED As String = \"red\"";
_color_red = "red";
 //BA.debugLineNum = 91;BA.debugLine="Public const COLOR_TEAL As String = \"teal\"";
_color_teal = "teal";
 //BA.debugLineNum = 92;BA.debugLine="Public const COLOR_TRANSPARENT As String = \"trans";
_color_transparent = "transparent";
 //BA.debugLineNum = 93;BA.debugLine="Public const COLOR_WHITE As String = \"white\"";
_color_white = "white";
 //BA.debugLineNum = 94;BA.debugLine="Public const COLOR_YELLOW As String = \"yellow\"";
_color_yellow = "yellow";
 //BA.debugLineNum = 96;BA.debugLine="Public const INTENSITY_NORMAL As String = \"\"";
_intensity_normal = "";
 //BA.debugLineNum = 97;BA.debugLine="Public const INTENSITY_LIGHTEN5 As String = \"ligh";
_intensity_lighten5 = "lighten-5";
 //BA.debugLineNum = 98;BA.debugLine="Public const INTENSITY_LIGHTEN4 As String = \"ligh";
_intensity_lighten4 = "lighten-4";
 //BA.debugLineNum = 99;BA.debugLine="Public const INTENSITY_LIGHTEN3 As String = \"ligh";
_intensity_lighten3 = "lighten-3";
 //BA.debugLineNum = 100;BA.debugLine="Public const INTENSITY_LIGHTEN2 As String = \"ligh";
_intensity_lighten2 = "lighten-2";
 //BA.debugLineNum = 101;BA.debugLine="Public const INTENSITY_LIGHTEN1 As String = \"ligh";
_intensity_lighten1 = "lighten-1";
 //BA.debugLineNum = 102;BA.debugLine="Public const INTENSITY_DARKEN1 As String = \"darke";
_intensity_darken1 = "darken-1";
 //BA.debugLineNum = 103;BA.debugLine="Public const INTENSITY_DARKEN2 As String = \"darke";
_intensity_darken2 = "darken-2";
 //BA.debugLineNum = 104;BA.debugLine="Public const INTENSITY_DARKEN3 As String = \"darke";
_intensity_darken3 = "darken-3";
 //BA.debugLineNum = 105;BA.debugLine="Public const INTENSITY_DARKEN4 As String = \"darke";
_intensity_darken4 = "darken-4";
 //BA.debugLineNum = 106;BA.debugLine="Public const INTENSITY_ACCENT1 As String = \"accen";
_intensity_accent1 = "accent-1";
 //BA.debugLineNum = 107;BA.debugLine="Public const INTENSITY_ACCENT2 As String = \"accen";
_intensity_accent2 = "accent-2";
 //BA.debugLineNum = 108;BA.debugLine="Public const INTENSITY_ACCENT3 As String = \"accen";
_intensity_accent3 = "accent-3";
 //BA.debugLineNum = 109;BA.debugLine="Public const INTENSITY_ACCENT4 As String = \"accen";
_intensity_accent4 = "accent-4";
 //BA.debugLineNum = 111;BA.debugLine="Type ColorTypes(red As String, pink As String, pu";
;
 //BA.debugLineNum = 115;BA.debugLine="Public Colors As ColorTypes";
_colors = new b4j.example.bananovue._colortypes();
 //BA.debugLineNum = 117;BA.debugLine="Private ColorMap As Map";
_colormap = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 119;BA.debugLine="Public Attention_Seekers_bounce As String = \"boun";
_attention_seekers_bounce = "bounce";
 //BA.debugLineNum = 120;BA.debugLine="Public Attention_Seekers_flash As String = \"flash";
_attention_seekers_flash = "flash";
 //BA.debugLineNum = 121;BA.debugLine="Public Attention_Seekers_pulse As String=\"pulse\"";
_attention_seekers_pulse = "pulse";
 //BA.debugLineNum = 122;BA.debugLine="Public Attention_Seekers_rubberBand As String=\"ru";
_attention_seekers_rubberband = "rubberBand";
 //BA.debugLineNum = 123;BA.debugLine="Public Attention_Seekers_shake As String=\"shake\"";
_attention_seekers_shake = "shake";
 //BA.debugLineNum = 124;BA.debugLine="Public Attention_Seekers_swing As String=\"swing\"";
_attention_seekers_swing = "swing";
 //BA.debugLineNum = 125;BA.debugLine="Public Attention_Seekers_tada As String=\"tada\"";
_attention_seekers_tada = "tada";
 //BA.debugLineNum = 126;BA.debugLine="Public Attention_Seekers_wobble As String=\"wobble";
_attention_seekers_wobble = "wobble";
 //BA.debugLineNum = 127;BA.debugLine="Public Attention_Seekers_jello As String=\"jello\"";
_attention_seekers_jello = "jello";
 //BA.debugLineNum = 128;BA.debugLine="Public Bouncing_Entrances_bounceIn As String=\"bou";
_bouncing_entrances_bouncein = "bounceIn";
 //BA.debugLineNum = 129;BA.debugLine="Public Bouncing_Entrances_bounceInDown As String=";
_bouncing_entrances_bounceindown = "bounceInDown";
 //BA.debugLineNum = 130;BA.debugLine="Public Bouncing_Entrances_bounceInLeft As String=";
_bouncing_entrances_bounceinleft = "bounceInLeft";
 //BA.debugLineNum = 131;BA.debugLine="Public Bouncing_Entrances_bounceInRight As String";
_bouncing_entrances_bounceinright = "bounceInRight";
 //BA.debugLineNum = 132;BA.debugLine="Public Bouncing_EntrancesbounceInUp As String=\"bo";
_bouncing_entrancesbounceinup = "bounceInUp";
 //BA.debugLineNum = 133;BA.debugLine="Public Bouncing_Exits_bounceOut As String=\"bounce";
_bouncing_exits_bounceout = "bounceOut";
 //BA.debugLineNum = 134;BA.debugLine="Public Bouncing_Exits_bounceOutDown As String=\"bo";
_bouncing_exits_bounceoutdown = "bounceOutDown";
 //BA.debugLineNum = 135;BA.debugLine="Public Bouncing_Exits_bounceOutLeft As String=\"bo";
_bouncing_exits_bounceoutleft = "bounceOutLeft";
 //BA.debugLineNum = 136;BA.debugLine="Public Bouncing_Exits_bounceOutRight As String=\"b";
_bouncing_exits_bounceoutright = "bounceOutRight";
 //BA.debugLineNum = 137;BA.debugLine="Public Bouncing_Exits_bounceOutUp As String=\"boun";
_bouncing_exits_bounceoutup = "bounceOutUp";
 //BA.debugLineNum = 138;BA.debugLine="Public Fading_Entrances_fadeIn As String=\"fadeIn\"";
_fading_entrances_fadein = "fadeIn";
 //BA.debugLineNum = 139;BA.debugLine="Public Fading_Entrances_fadeInDown As String=\"fad";
_fading_entrances_fadeindown = "fadeInDown";
 //BA.debugLineNum = 140;BA.debugLine="Public Fading_Entrances_fadeInDownBig As String=\"";
_fading_entrances_fadeindownbig = "fadeInDownBig";
 //BA.debugLineNum = 141;BA.debugLine="Public Fading_Entrances_fadeInLeft As String=\"fad";
_fading_entrances_fadeinleft = "fadeInLeft";
 //BA.debugLineNum = 142;BA.debugLine="Public Fading_Entrances_fadeInLeftBig As String=\"";
_fading_entrances_fadeinleftbig = "fadeInLeftBig";
 //BA.debugLineNum = 143;BA.debugLine="Public Fading_Entrances_fadeInRight As String=\"fa";
_fading_entrances_fadeinright = "fadeInRight";
 //BA.debugLineNum = 144;BA.debugLine="Public Fading_Entrances_fadeInRightBig As String=";
_fading_entrances_fadeinrightbig = "fadeInRightBig";
 //BA.debugLineNum = 145;BA.debugLine="Public Fading_Entrances_fadeInUp As String=\"fadeI";
_fading_entrances_fadeinup = "fadeInUp";
 //BA.debugLineNum = 146;BA.debugLine="Public Fading_Entrances_fadeInUpBig As String=\"fa";
_fading_entrances_fadeinupbig = "fadeInUpBig";
 //BA.debugLineNum = 147;BA.debugLine="Public Fading_Exits_fadeOut As String=\"fadeOut\"";
_fading_exits_fadeout = "fadeOut";
 //BA.debugLineNum = 148;BA.debugLine="Public Fading_Exits_fadeOutDown As String=\"fadeOu";
_fading_exits_fadeoutdown = "fadeOutDown";
 //BA.debugLineNum = 149;BA.debugLine="Public Fading_Exits_fadeOutDownBig As String=\"fad";
_fading_exits_fadeoutdownbig = "fadeOutDownBig";
 //BA.debugLineNum = 150;BA.debugLine="Public Fading_Exits_fadeOutLeft As String=\"fadeOu";
_fading_exits_fadeoutleft = "fadeOutLeft";
 //BA.debugLineNum = 151;BA.debugLine="Public Fading_Exits_fadeOutLeftBig As String=\"fad";
_fading_exits_fadeoutleftbig = "fadeOutLeftBig";
 //BA.debugLineNum = 152;BA.debugLine="Public Fading_Exits_fadeOutRight As String=\"fadeO";
_fading_exits_fadeoutright = "fadeOutRight";
 //BA.debugLineNum = 153;BA.debugLine="Public Fading_Exits_fadeOutRightBig As String=\"fa";
_fading_exits_fadeoutrightbig = "fadeOutRightBig";
 //BA.debugLineNum = 154;BA.debugLine="Public Fading_Exits_fadeOutUp As String=\"fadeOutU";
_fading_exits_fadeoutup = "fadeOutUp";
 //BA.debugLineNum = 155;BA.debugLine="Public Fading_Exits_fadeOutUpBig As String=\"fadeO";
_fading_exits_fadeoutupbig = "fadeOutUpBig";
 //BA.debugLineNum = 156;BA.debugLine="Public Flippers_flip As String=\"flip\"";
_flippers_flip = "flip";
 //BA.debugLineNum = 157;BA.debugLine="Public Flippers_flipInX As String=\"flipInX\"";
_flippers_flipinx = "flipInX";
 //BA.debugLineNum = 158;BA.debugLine="Public Flippers_flipInY As String=\"flipInY\"";
_flippers_flipiny = "flipInY";
 //BA.debugLineNum = 159;BA.debugLine="Public Flippers_flipOutX As String=\"flipOutX\"";
_flippers_flipoutx = "flipOutX";
 //BA.debugLineNum = 160;BA.debugLine="Public Flippers_flipOutY As String=\"flipOutY\"";
_flippers_flipouty = "flipOutY";
 //BA.debugLineNum = 161;BA.debugLine="Public Lightspeed_lightSpeedIn As String=\"lightSp";
_lightspeed_lightspeedin = "lightSpeedIn";
 //BA.debugLineNum = 162;BA.debugLine="Public Lightspeed_lightSpeedOut As String=\"lightS";
_lightspeed_lightspeedout = "lightSpeedOut";
 //BA.debugLineNum = 163;BA.debugLine="Public Rotating_Entrances_rotateIn As String=\"rot";
_rotating_entrances_rotatein = "rotateIn";
 //BA.debugLineNum = 164;BA.debugLine="Public Rotating_Entrances_rotateInDownLeft As Str";
_rotating_entrances_rotateindownleft = "rotateInDownLeft";
 //BA.debugLineNum = 165;BA.debugLine="Public Rotating_Entrances_rotateInDownRight As St";
_rotating_entrances_rotateindownright = "rotateInDownRight";
 //BA.debugLineNum = 166;BA.debugLine="Public Rotating_Entrances_rotateInUpLeft As Strin";
_rotating_entrances_rotateinupleft = "rotateInUpLeft";
 //BA.debugLineNum = 167;BA.debugLine="Public Rotating_Entrances_rotateInUpRight As Stri";
_rotating_entrances_rotateinupright = "rotateInUpRight";
 //BA.debugLineNum = 168;BA.debugLine="Public Rotating_Exits_rotateOut As String=\"rotate";
_rotating_exits_rotateout = "rotateOut";
 //BA.debugLineNum = 169;BA.debugLine="Public Rotating_Exits_rotateOutDownLeft As String";
_rotating_exits_rotateoutdownleft = "rotateOutDownLeft";
 //BA.debugLineNum = 170;BA.debugLine="Public Rotating_Exits_rotateOutDownRight As Strin";
_rotating_exits_rotateoutdownright = "rotateOutDownRight";
 //BA.debugLineNum = 171;BA.debugLine="Public Rotating_Exits_rotateOutUpLeft As String=\"";
_rotating_exits_rotateoutupleft = "rotateOutUpLeft";
 //BA.debugLineNum = 172;BA.debugLine="Public Rotating_Exits_rotateOutUpRight As String=";
_rotating_exits_rotateoutupright = "rotateOutUpRight";
 //BA.debugLineNum = 173;BA.debugLine="Public Sliding_Entrances_slideInUp As String=\"sli";
_sliding_entrances_slideinup = "slideInUp";
 //BA.debugLineNum = 174;BA.debugLine="Public Sliding_Entrances_slideInDown As String=\"s";
_sliding_entrances_slideindown = "slideInDown";
 //BA.debugLineNum = 175;BA.debugLine="Public Sliding_Entrances_slideInLeft As String=\"s";
_sliding_entrances_slideinleft = "slideInLeft";
 //BA.debugLineNum = 176;BA.debugLine="Public Sliding_Entrances_slideInRight As String=\"";
_sliding_entrances_slideinright = "slideInRight";
 //BA.debugLineNum = 177;BA.debugLine="Public Sliding_Exits_slideOutUp As String=\"slideO";
_sliding_exits_slideoutup = "slideOutUp";
 //BA.debugLineNum = 178;BA.debugLine="Public Sliding_Exits_slideOutDown As String=\"slid";
_sliding_exits_slideoutdown = "slideOutDown";
 //BA.debugLineNum = 179;BA.debugLine="Public Sliding_Exits_slideOutLeft As String=\"slid";
_sliding_exits_slideoutleft = "slideOutLeft";
 //BA.debugLineNum = 180;BA.debugLine="Public Sliding_Exits_slideOutRight As String=\"sli";
_sliding_exits_slideoutright = "slideOutRight";
 //BA.debugLineNum = 181;BA.debugLine="Public Zoom_Entrances_zoomIn As String=\"zoomIn\"";
_zoom_entrances_zoomin = "zoomIn";
 //BA.debugLineNum = 182;BA.debugLine="Public Zoom_Entrances_zoomInDown As String=\"zoomI";
_zoom_entrances_zoomindown = "zoomInDown";
 //BA.debugLineNum = 183;BA.debugLine="Public Zoom_Entrances_zoomInLeft As String=\"zoomI";
_zoom_entrances_zoominleft = "zoomInLeft";
 //BA.debugLineNum = 184;BA.debugLine="Public Zoom_Entrances_zoomInRight As String=\"zoom";
_zoom_entrances_zoominright = "zoomInRight";
 //BA.debugLineNum = 185;BA.debugLine="Public Zoom_Entrances_zoomInUp As String=\"zoomInU";
_zoom_entrances_zoominup = "zoomInUp";
 //BA.debugLineNum = 186;BA.debugLine="Public Zoom_Exits_zoomOut As String=\"zoomOut\"";
_zoom_exits_zoomout = "zoomOut";
 //BA.debugLineNum = 187;BA.debugLine="Public Zoom_Exits_zoomOutDown As String=\"zoomOutD";
_zoom_exits_zoomoutdown = "zoomOutDown";
 //BA.debugLineNum = 188;BA.debugLine="Public Zoom_Exits_zoomOutLeft As String=\"zoomOutL";
_zoom_exits_zoomoutleft = "zoomOutLeft";
 //BA.debugLineNum = 189;BA.debugLine="Public Zoom_Exits_zoomOutRight As String=\"zoomOut";
_zoom_exits_zoomoutright = "zoomOutRight";
 //BA.debugLineNum = 190;BA.debugLine="Public Zoom_Exits_zoomOutUp As String=\"zoomOutUp\"";
_zoom_exits_zoomoutup = "zoomOutUp";
 //BA.debugLineNum = 191;BA.debugLine="Public Specials_hinge As String=\"hinge\"";
_specials_hinge = "hinge";
 //BA.debugLineNum = 192;BA.debugLine="Public Specials_rollIn As String=\"rollIn\"";
_specials_rollin = "rollIn";
 //BA.debugLineNum = 193;BA.debugLine="Public Specials_rollOut As String=\"rollOut\"";
_specials_rollout = "rollOut";
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return "";
}
public long  _clng(Object _o) throws Exception{
 //BA.debugLineNum = 704;BA.debugLine="Sub CLng(o As Object) As Long";
 //BA.debugLineNum = 705;BA.debugLine="Return Floor(o)";
if (true) return (long) (__c.Floor((double)(BA.ObjectToNumber(_o))));
 //BA.debugLineNum = 706;BA.debugLine="End Sub";
return 0L;
}
public com.ab.banano.BANanoObject  _compile(String _html) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 1118;BA.debugLine="Sub Compile(html As String) As BANanoObject";
 //BA.debugLineNum = 1119;BA.debugLine="Dim bo As BANanoObject = BOVue.RunMethod(\"compile";
_bo = new com.ab.banano.BANanoObject();
_bo = _bovue.RunMethod("compile",(Object)(new Object[]{(Object)(_html)}));
 //BA.debugLineNum = 1120;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 1121;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _copymap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1721;BA.debugLine="Sub CopyMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 1722;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1723;BA.debugLine="If keys.Get(0) = \"*\" Then";
if ((_keys.Get((int) (0))).equals((Object)("*"))) { 
 //BA.debugLineNum = 1724;BA.debugLine="For Each k As String In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _source.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1725;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 1726;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 }else {
 //BA.debugLineNum = 1729;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _keys;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_k = BA.ObjectToString(group8.Get(index8));
 //BA.debugLineNum = 1730;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 1731;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 };
 //BA.debugLineNum = 1734;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1735;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createbutton1(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1593;BA.debugLine="Sub CreateBUTTON1(id As String) As VMElement";
 //BA.debugLineNum = 1594;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1595;BA.debugLine="el.Initialize(Me, id).SetTag(\"button\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("button");
 //BA.debugLineNum = 1596;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1597;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcomponent(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2470;BA.debugLine="Sub CreateComponent(id As String) As VMElement";
 //BA.debugLineNum = 2471;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2472;BA.debugLine="el.Initialize(Me, id).SetTag(\"component\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("component");
 //BA.debugLineNum = 2473;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2474;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcss  _createcss() throws Exception{
b4j.example.vmcss _el = null;
 //BA.debugLineNum = 2457;BA.debugLine="Sub CreateCSS As VMCSS";
 //BA.debugLineNum = 2458;BA.debugLine="Dim el As VMCSS";
_el = new b4j.example.vmcss();
 //BA.debugLineNum = 2459;BA.debugLine="el.Initialize";
_el._initialize /*String*/ (ba);
 //BA.debugLineNum = 2460;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2461;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _creatediv(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2418;BA.debugLine="Sub CreateDiv(id As String) As VMElement";
 //BA.debugLineNum = 2419;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2420;BA.debugLine="el.Initialize(Me,id).SetTag(\"div\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 2421;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2422;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createform(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1569;BA.debugLine="Sub CreateFORM(id As String) As VMElement";
 //BA.debugLineNum = 1570;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1571;BA.debugLine="el.Initialize(Me, id).SetTag(\"form\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("form");
 //BA.debugLineNum = 1572;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1573;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh1(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2482;BA.debugLine="Sub CreateH1(id As String) As VMElement";
 //BA.debugLineNum = 2483;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2484;BA.debugLine="el.Initialize(Me, id).SetTag(\"h1\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h1");
 //BA.debugLineNum = 2485;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2486;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh2(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2488;BA.debugLine="Sub CreateH2(id As String) As VMElement";
 //BA.debugLineNum = 2489;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2490;BA.debugLine="el.Initialize(Me, id).SetTag(\"h2\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h2");
 //BA.debugLineNum = 2491;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh3(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2494;BA.debugLine="Sub CreateH3(id As String) As VMElement";
 //BA.debugLineNum = 2495;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2496;BA.debugLine="el.Initialize(Me, id).SetTag(\"h3\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h3");
 //BA.debugLineNum = 2497;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2498;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh4(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2500;BA.debugLine="Sub CreateH4(id As String) As VMElement";
 //BA.debugLineNum = 2501;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2502;BA.debugLine="el.Initialize(Me, id).SetTag(\"h4\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h4");
 //BA.debugLineNum = 2503;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2504;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh5(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2506;BA.debugLine="Sub CreateH5(id As String) As VMElement";
 //BA.debugLineNum = 2507;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2508;BA.debugLine="el.Initialize(Me, id).SetTag(\"h5\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h5");
 //BA.debugLineNum = 2509;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2510;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh6(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2512;BA.debugLine="Sub CreateH6(id As String) As VMElement";
 //BA.debugLineNum = 2513;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2514;BA.debugLine="el.Initialize(Me, id).SetTag(\"h6\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("h6");
 //BA.debugLineNum = 2515;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2516;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createimg(String _img) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2476;BA.debugLine="Sub CreateIMG(img As String) As VMElement";
 //BA.debugLineNum = 2477;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2478;BA.debugLine="el.Initialize(Me, img).SetTag(\"img\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_img)._settag /*b4j.example.vmelement*/ ("img");
 //BA.debugLineNum = 2479;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2480;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createinput(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1581;BA.debugLine="Sub CreateINPUT(id As String) As VMElement";
 //BA.debugLineNum = 1582;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1583;BA.debugLine="el.Initialize(Me, id).SetTag(\"input\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("input");
 //BA.debugLineNum = 1584;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1585;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createkeepalive(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2463;BA.debugLine="Sub CreateKeepAlive(sid As String) As VMElement";
 //BA.debugLineNum = 2464;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2465;BA.debugLine="el.Initialize(Me,sid).SetTag(\"keep-alive\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_sid)._settag /*b4j.example.vmelement*/ ("keep-alive");
 //BA.debugLineNum = 2466;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createlabel(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1575;BA.debugLine="Sub CreateLABEL(id As String) As VMElement";
 //BA.debugLineNum = 1576;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1577;BA.debugLine="el.Initialize(Me, id).SetTag(\"label\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("label");
 //BA.debugLineNum = 1578;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createli(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2436;BA.debugLine="Sub CreateLI(id As String) As VMElement";
 //BA.debugLineNum = 2437;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2438;BA.debugLine="el.Initialize(Me,id).SetTag(\"li\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("li");
 //BA.debugLineNum = 2439;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2440;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createol(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2443;BA.debugLine="Sub CreateOL(id As String) As VMElement";
 //BA.debugLineNum = 2444;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2445;BA.debugLine="el.Initialize(Me,id).SetTag(\"ol\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("ol");
 //BA.debugLineNum = 2446;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2447;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createoption(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1135;BA.debugLine="Sub CreateOPTION(sid As String) As VMElement";
 //BA.debugLineNum = 1136;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1137;BA.debugLine="el.Initialize(Me,sid).SetTag(\"option\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_sid)._settag /*b4j.example.vmelement*/ ("option");
 //BA.debugLineNum = 1138;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createp(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2450;BA.debugLine="Sub CreateP(id As String) As VMElement";
 //BA.debugLineNum = 2451;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2452;BA.debugLine="el.Initialize(Me, id).SetTag(\"p\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("p");
 //BA.debugLineNum = 2453;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2454;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createrouterlink(String _text) throws Exception{
b4j.example.vuehtml _el = null;
 //BA.debugLineNum = 1658;BA.debugLine="Sub CreateRouterLink(Text As String) As VueHTML";
 //BA.debugLineNum = 1659;BA.debugLine="Dim el As VueHTML";
_el = new b4j.example.vuehtml();
 //BA.debugLineNum = 1660;BA.debugLine="el.Initialize(\"\",\"router-link\").SetText(Text)";
_el._initialize /*b4j.example.vuehtml*/ (ba,"","router-link")._settext /*b4j.example.vuehtml*/ (_text);
 //BA.debugLineNum = 1661;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1662;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createrouterview() throws Exception{
b4j.example.vuehtml _el = null;
 //BA.debugLineNum = 1664;BA.debugLine="Sub CreateRouterView As VueHTML";
 //BA.debugLineNum = 1665;BA.debugLine="Dim el As VueHTML";
_el = new b4j.example.vuehtml();
 //BA.debugLineNum = 1666;BA.debugLine="el.Initialize(\"\",\"router-view\")";
_el._initialize /*b4j.example.vuehtml*/ (ba,"","router-view");
 //BA.debugLineNum = 1667;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1668;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createselect(String _sid) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1143;BA.debugLine="Sub CreateSELECT(sid As String) As VMElement";
 //BA.debugLineNum = 1144;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1145;BA.debugLine="el.Initialize(Me,sid).SetTag(\"select\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_sid)._settag /*b4j.example.vmelement*/ ("select");
 //BA.debugLineNum = 1146;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createspan(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2424;BA.debugLine="Sub CreateSPAN(id As String) As VMElement";
 //BA.debugLineNum = 2425;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2426;BA.debugLine="el.Initialize(Me,id).SetTag(\"span\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("span");
 //BA.debugLineNum = 2427;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtag(String _id,String _tag) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2412;BA.debugLine="Sub CreateTag(id As String, tag As String) As VMEl";
 //BA.debugLineNum = 2413;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2414;BA.debugLine="el.Initialize(Me,id).SetTag(tag)";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (_tag);
 //BA.debugLineNum = 2415;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2416;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtextarea(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 1587;BA.debugLine="Sub CreateTEXTAREA(id As String) As VMElement";
 //BA.debugLineNum = 1588;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 1589;BA.debugLine="el.Initialize(Me, id).SetTag(\"textarea\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("textarea");
 //BA.debugLineNum = 1590;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 1591;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createul(String _id) throws Exception{
b4j.example.vmelement _el = null;
 //BA.debugLineNum = 2430;BA.debugLine="Sub CreateUL(id As String) As VMElement";
 //BA.debugLineNum = 2431;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
 //BA.debugLineNum = 2432;BA.debugLine="el.Initialize(Me,id).SetTag(\"ul\")";
_el._initialize /*b4j.example.vmelement*/ (ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ ("ul");
 //BA.debugLineNum = 2433;BA.debugLine="Return el";
if (true) return _el;
 //BA.debugLineNum = 2434;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 1805;BA.debugLine="Sub CStr(o As Object) As String";
 //BA.debugLineNum = 1806;BA.debugLine="If o = BANAno.UNDEFINED Then o = \"\"";
if ((_o).equals(_banano.UNDEFINED())) { 
_o = (Object)("");};
 //BA.debugLineNum = 1807;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 1808;BA.debugLine="End Sub";
return "";
}
public String  _date2yyyymmdd(Object _value) throws Exception{
com.ab.banano.BANanoObject _m = null;
String _res = "";
 //BA.debugLineNum = 971;BA.debugLine="Sub Date2YYYYMMDD(value As Object) As String";
 //BA.debugLineNum = 972;BA.debugLine="Try";
try { //BA.debugLineNum = 973;BA.debugLine="If CStr(value) = \"\" Then Return \"\"";
if ((_cstr(_value)).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 974;BA.debugLine="If value = Null Then Return \"\"";
if (_value== null) { 
if (true) return "";};
 //BA.debugLineNum = 975;BA.debugLine="Dim m As BANanoObject = BANAno.RunJavascriptMeth";
_m = new com.ab.banano.BANanoObject();
_m.setObject((java.lang.Object)(_banano.RunJavascriptMethod("moment",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 976;BA.debugLine="Dim res As String = m.RunMethod(\"format\", \"YYYY-";
_res = BA.ObjectToString(_m.RunMethod("format",(Object)("YYYY-MM-DD")).Result());
 //BA.debugLineNum = 977;BA.debugLine="If res.IndexOf(\"Invalid\") > 0 Then res = \"\"";
if (_res.indexOf("Invalid")>0) { 
_res = "";};
 //BA.debugLineNum = 978;BA.debugLine="Return res";
if (true) return _res;
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 980;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 982;BA.debugLine="End Sub";
return "";
}
public String  _date2yyyymmddhhmm(Object _value) throws Exception{
com.ab.banano.BANanoObject _m = null;
String _res = "";
 //BA.debugLineNum = 984;BA.debugLine="Sub Date2YYYYMMDDHHMM(value As Object) As String";
 //BA.debugLineNum = 985;BA.debugLine="Try";
try { //BA.debugLineNum = 986;BA.debugLine="If CStr(value) = \"\" Then Return \"\"";
if ((_cstr(_value)).equals("")) { 
if (true) return "";};
 //BA.debugLineNum = 987;BA.debugLine="If value = Null Then Return \"\"";
if (_value== null) { 
if (true) return "";};
 //BA.debugLineNum = 988;BA.debugLine="Dim m As BANanoObject = BANAno.RunJavascriptMeth";
_m = new com.ab.banano.BANanoObject();
_m.setObject((java.lang.Object)(_banano.RunJavascriptMethod("moment",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 989;BA.debugLine="Dim res As String = m.RunMethod(\"format\", \"YYYY-";
_res = BA.ObjectToString(_m.RunMethod("format",(Object)("YYYY-MM-DD HH:MM")).Result());
 //BA.debugLineNum = 990;BA.debugLine="If res.IndexOf(\"Invalid\") > 0 Then res = \"\"";
if (_res.indexOf("Invalid")>0) { 
_res = "";};
 //BA.debugLineNum = 991;BA.debugLine="Return res";
if (true) return _res;
 } 
       catch (Exception e9) {
			ba.setLastException(e9); //BA.debugLineNum = 993;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 995;BA.debugLine="End Sub";
return "";
}
public String  _dateadd(String _mdate,int _howmanydays) throws Exception{
long _convertdate = 0L;
long _newdateday = 0L;
 //BA.debugLineNum = 439;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
 //BA.debugLineNum = 440;BA.debugLine="Dim ConvertDate, NewDateDay As Long";
_convertdate = 0L;
_newdateday = 0L;
 //BA.debugLineNum = 441;BA.debugLine="ConvertDate = DateTime.DateParse(mDate)";
_convertdate = __c.DateTime.DateParse(_mdate);
 //BA.debugLineNum = 442;BA.debugLine="NewDateDay = DateTime.Add(ConvertDate, 0, 0, HowM";
_newdateday = __c.DateTime.Add(_convertdate,(int) (0),(int) (0),_howmanydays);
 //BA.debugLineNum = 443;BA.debugLine="Return DateTime.Date(NewDateDay)";
if (true) return __c.DateTime.Date(_newdateday);
 //BA.debugLineNum = 444;BA.debugLine="End Sub";
return "";
}
public int  _datediff(String _currentdate,String _otherdate) throws Exception{
long _currdate = 0L;
long _othdate = 0L;
 //BA.debugLineNum = 455;BA.debugLine="Sub DateDiff(CurrentDate As String, OtherDate As S";
 //BA.debugLineNum = 456;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 458;BA.debugLine="Dim CurrDate As Long";
_currdate = 0L;
 //BA.debugLineNum = 459;BA.debugLine="Dim OthDate As Long";
_othdate = 0L;
 //BA.debugLineNum = 460;BA.debugLine="CurrDate = DateTime.DateParse(CurrentDate)";
_currdate = __c.DateTime.DateParse(_currentdate);
 //BA.debugLineNum = 461;BA.debugLine="OthDate = DateTime.DateParse(OtherDate)";
_othdate = __c.DateTime.DateParse(_otherdate);
 //BA.debugLineNum = 463;BA.debugLine="Return (CurrDate-OthDate) / DateTime.TicksPerDay";
if (true) return (int) ((_currdate-_othdate)/(double)__c.DateTime.TicksPerDay);
 //BA.debugLineNum = 464;BA.debugLine="End Sub";
return 0;
}
public String  _datenow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 1704;BA.debugLine="Public Sub DateNow() As String";
 //BA.debugLineNum = 1705;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 1706;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 1707;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 1708;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 1709;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 1710;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 1711;BA.debugLine="End Sub";
return "";
}
public String  _datetimenow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 1695;BA.debugLine="Public Sub DateTimeNow() As String";
 //BA.debugLineNum = 1696;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 1697;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 1698;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 1699;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 1700;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 1701;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 1702;BA.debugLine="End Sub";
return "";
}
public String  _doupload(Object _fileobj) throws Exception{
Object _aevt = null;
com.ab.banano.BANanoXMLHttpRequest _xhr = null;
com.ab.banano.BANanoObject _fd = null;
anywheresoftware.b4a.objects.collections.Map _err = null;
String _serr = "";
 //BA.debugLineNum = 231;BA.debugLine="private Sub DoUpload(fileObj As Object) As String";
 //BA.debugLineNum = 232;BA.debugLine="Dim aEvt As Object";
_aevt = new Object();
 //BA.debugLineNum = 233;BA.debugLine="Dim xhr As BANanoXMLHttpRequest";
_xhr = new com.ab.banano.BANanoXMLHttpRequest();
 //BA.debugLineNum = 235;BA.debugLine="Dim fd As BANanoObject";
_fd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 236;BA.debugLine="fd.Initialize2(\"FormData\",Null)";
_fd.Initialize2("FormData",__c.Null);
 //BA.debugLineNum = 237;BA.debugLine="fd.RunMethod(\"append\", Array(\"upload\", fileObj))";
_fd.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_fileobj}));
 //BA.debugLineNum = 239;BA.debugLine="xhr.Initialize";
_xhr.Initialize();
 //BA.debugLineNum = 240;BA.debugLine="xhr.Open(\"POST\", \"./assets/upload.php\")";
_xhr.Open("POST","./assets/upload.php");
 //BA.debugLineNum = 241;BA.debugLine="xhr.AddEventListenerOpenAsync(\"onreadystatechange";
_xhr.AddEventListenerOpenAsync("onreadystatechange",_aevt);
 //BA.debugLineNum = 242;BA.debugLine="If xhr.ReadyState = 4 Then";
if (_xhr.getReadyState()==4) { 
 //BA.debugLineNum = 243;BA.debugLine="If xhr.Status = 200 Then";
if (_xhr.getStatus()==200) { 
 //BA.debugLineNum = 244;BA.debugLine="BANAno.ReturnThen(xhr.ResponseText)";
_banano.ReturnThen((Object)(_xhr.getResponseText()));
 }else {
 //BA.debugLineNum = 246;BA.debugLine="Dim err As Map = CreateMap()";
_err = new anywheresoftware.b4a.objects.collections.Map();
_err = __c.createMap(new Object[] {});
 //BA.debugLineNum = 247;BA.debugLine="err.Put(\"status\", \"error\")";
_err.Put((Object)("status"),(Object)("error"));
 //BA.debugLineNum = 248;BA.debugLine="Dim serr As String = BANAno.ToJson(err)";
_serr = BA.ObjectToString(_banano.ToJson((Object)(_err.getObject())));
 //BA.debugLineNum = 249;BA.debugLine="BANAno.ReturnElse(serr)";
_banano.ReturnElse((Object)(_serr));
 };
 };
 //BA.debugLineNum = 252;BA.debugLine="xhr.CloseEventListener";
_xhr.CloseEventListener();
 //BA.debugLineNum = 253;BA.debugLine="xhr.Send2(fd)";
_xhr.Send2((Object)(_fd.getObject()));
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 1150;BA.debugLine="Sub EQOperators(sm As Map) As List";
 //BA.debugLineNum = 1151;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1152;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 1153;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1154;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
 //BA.debugLineNum = 1156;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 1157;BA.debugLine="End Sub";
return null;
}
public String  _expectedrag(double _dvalue) throws Exception{
 //BA.debugLineNum = 2543;BA.debugLine="Public Sub ExpectedRAG(dValue As Double) As String";
 //BA.debugLineNum = 2544;BA.debugLine="If dValue = 0 Then";
if (_dvalue==0) { 
 //BA.debugLineNum = 2545;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else if(_dvalue>0) { 
 //BA.debugLineNum = 2547;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvalue<0) { 
 //BA.debugLineNum = 2549;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else {
 //BA.debugLineNum = 2551;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 };
 //BA.debugLineNum = 2553;BA.debugLine="End Sub";
return "";
}
public String  _expenditurerag(double _dvariance) throws Exception{
 //BA.debugLineNum = 2555;BA.debugLine="Public Sub ExpenditureRAG(dVariance As Double) As";
 //BA.debugLineNum = 2556;BA.debugLine="If dVariance > 0 Then";
if (_dvariance>0) { 
 //BA.debugLineNum = 2557;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance<0) { 
 //BA.debugLineNum = 2559;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvariance==0) { 
 //BA.debugLineNum = 2561;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
 //BA.debugLineNum = 2563;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 2565;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _extractmap(anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 314;BA.debugLine="Sub ExtractMap(source As Map, keys As List) As Map";
 //BA.debugLineNum = 315;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 316;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _keys;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 317;BA.debugLine="Dim v As Object = source.get(k)";
_v = _source.Get((Object)(_k));
 //BA.debugLineNum = 318;BA.debugLine="nm.put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 320;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public String  _facedone(int _dvalue) throws Exception{
 //BA.debugLineNum = 2654;BA.debugLine="Public Sub FaceDone(dValue As Int) As String";
 //BA.debugLineNum = 2655;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
 //BA.debugLineNum = 2657;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2659;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2661;BA.debugLine="End Sub";
return "";
}
public String  _facerag(int _dvalue) throws Exception{
 //BA.debugLineNum = 2619;BA.debugLine="Public Sub FaceRAG(dValue As Int) As String";
 //BA.debugLineNum = 2620;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2622;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
 //BA.debugLineNum = 2624;BA.debugLine="Return \"./assets/neutralface.png\"";
if (true) return "./assets/neutralface.png";
 break; }
case 2: {
 //BA.debugLineNum = 2626;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2628;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2630;BA.debugLine="End Sub";
return "";
}
public String  _facerg(int _dvalue) throws Exception{
 //BA.debugLineNum = 2632;BA.debugLine="Public Sub FaceRG(dValue As Int) As String";
 //BA.debugLineNum = 2633;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2635;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
 //BA.debugLineNum = 2637;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2639;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2641;BA.debugLine="End Sub";
return "";
}
public String  _facerg1(int _dvalue) throws Exception{
 //BA.debugLineNum = 2643;BA.debugLine="Public Sub FaceRG1(dValue As Int) As String";
 //BA.debugLineNum = 2644;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 1: {
 //BA.debugLineNum = 2646;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 0: {
 //BA.debugLineNum = 2648;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
 //BA.debugLineNum = 2650;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
 //BA.debugLineNum = 2652;BA.debugLine="End Sub";
return "";
}
public String  _fixrecords(anywheresoftware.b4a.objects.collections.List _recs,anywheresoftware.b4a.objects.collections.List _trimthese,anywheresoftware.b4a.objects.collections.List _numthese,anywheresoftware.b4a.objects.collections.List _boolthese,anywheresoftware.b4a.objects.collections.List _datethese,anywheresoftware.b4a.objects.collections.List _dblthese) throws Exception{
int _rtot = 0;
int _rcnt = 0;
anywheresoftware.b4a.objects.collections.Map _rec = null;
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1811;BA.debugLine="Sub FixRecords(recs As List, trimThese As List, nu";
 //BA.debugLineNum = 1812;BA.debugLine="Dim rTot As Int = recs.Size - 1";
_rtot = (int) (_recs.getSize()-1);
 //BA.debugLineNum = 1813;BA.debugLine="Dim rCnt As Int";
_rcnt = 0;
 //BA.debugLineNum = 1814;BA.debugLine="For rCnt = 0 To rTot";
{
final int step3 = 1;
final int limit3 = _rtot;
_rcnt = (int) (0) ;
for (;_rcnt <= limit3 ;_rcnt = _rcnt + step3 ) {
 //BA.debugLineNum = 1815;BA.debugLine="Dim rec As Map = recs.Get(rCnt)";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_recs.Get(_rcnt)));
 //BA.debugLineNum = 1817;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1818;BA.debugLine="For Each k As String In rec.keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _rec.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 1819;BA.debugLine="Dim v As Object = rec.Get(k)";
_v = _rec.Get((Object)(_k));
 //BA.debugLineNum = 1820;BA.debugLine="k = k.ToLowerCase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 1821;BA.debugLine="nrec.Put(k, v)";
_nrec.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1823;BA.debugLine="If dateThese <> Null Then MakeDate(nrec,dateThes";
if (_datethese!= null) { 
_makedate(_nrec,_datethese);};
 //BA.debugLineNum = 1824;BA.debugLine="If trimThese <> Null Then MakeTrim(nrec,trimThes";
if (_trimthese!= null) { 
_maketrim(_nrec,_trimthese);};
 //BA.debugLineNum = 1825;BA.debugLine="If numThese <> Null Then MakeInteger(nrec, numTh";
if (_numthese!= null) { 
_makeinteger(_nrec,_numthese);};
 //BA.debugLineNum = 1826;BA.debugLine="If dblThese <> Null Then MakeDouble(nrec, dblThe";
if (_dblthese!= null) { 
_makedouble(_nrec,_dblthese);};
 //BA.debugLineNum = 1827;BA.debugLine="If boolThese <> Null Then MakeBoolean(nrec, bool";
if (_boolthese!= null) { 
_makeboolean(_nrec,_boolthese);};
 //BA.debugLineNum = 1828;BA.debugLine="recs.Set(rCnt, nrec)";
_recs.Set(_rcnt,(Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 1830;BA.debugLine="End Sub";
return "";
}
public String  _forceupdate() throws Exception{
String _fu = "";
String _dkey = "";
String _rkey = "";
 //BA.debugLineNum = 2188;BA.debugLine="Sub ForceUpdate";
 //BA.debugLineNum = 2189;BA.debugLine="Dim fu As String = \"$forceUpdate\"";
_fu = "$forceUpdate";
 //BA.debugLineNum = 2190;BA.debugLine="BOVue.RunMethod(fu, Null)";
_bovue.RunMethod(_fu,__c.Null);
 //BA.debugLineNum = 2192;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
 //BA.debugLineNum = 2193;BA.debugLine="data = BOVue.GetField(dKey).Result";
_data.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_dkey).Result()));
 //BA.debugLineNum = 2195;BA.debugLine="Dim rKey As String = \"$refs\"";
_rkey = "$refs";
 //BA.debugLineNum = 2196;BA.debugLine="refs = BOVue.GetField(rKey)";
_refs.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_rkey).getObject()));
 //BA.debugLineNum = 2197;BA.debugLine="End Sub";
return "";
}
public String  _formatfilesize(float _bytes) throws Exception{
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
 //BA.debugLineNum = 504;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
 //BA.debugLineNum = 505;BA.debugLine="Try";
try { //BA.debugLineNum = 506;BA.debugLine="Private Unit() As String = Array As String(\" Byt";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
 //BA.debugLineNum = 507;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
 //BA.debugLineNum = 508;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
 //BA.debugLineNum = 510;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
 //BA.debugLineNum = 511;BA.debugLine="Private I As Int";
_i = 0;
 //BA.debugLineNum = 512;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (__c.Abs(_bytes));
 //BA.debugLineNum = 513;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (__c.Floor(__c.Logarithm(_bytes,1024)));
 //BA.debugLineNum = 514;BA.debugLine="Po = Power(1024, I)";
_po = __c.Power(1024,_i);
 //BA.debugLineNum = 515;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
 //BA.debugLineNum = 516;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
if (true) return __c.NumberFormat(_si,(int) (1),(int) (3))+_unit[_i];
 };
 } 
       catch (Exception e15) {
			ba.setLastException(e15); //BA.debugLineNum = 519;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 };
 //BA.debugLineNum = 521;BA.debugLine="End Sub";
return "";
}
public String  _gar(int _dvalue) throws Exception{
 //BA.debugLineNum = 2593;BA.debugLine="Public Sub GAR(dValue As Int) As String";
 //BA.debugLineNum = 2594;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2596;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
 //BA.debugLineNum = 2598;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 2600;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
 //BA.debugLineNum = 2602;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 2604;BA.debugLine="End Sub";
return "";
}
public String  _getalphabets(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 279;BA.debugLine="Public Sub GetAlphabets(value As String) As String";
 //BA.debugLineNum = 280;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 281;BA.debugLine="Try";
try { //BA.debugLineNum = 282;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 283;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
 //BA.debugLineNum = 284;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 285;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 286;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 287;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 288;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 289;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 290;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (_instr("abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ",_mout)!=-1) { 
 //BA.debugLineNum = 291;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 294;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 296;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 298;BA.debugLine="End Sub";
return "";
}
public String  _getcolorhex(String _scolor) throws Exception{
String _xcolor = "";
 //BA.debugLineNum = 1489;BA.debugLine="Sub GetColorHex(sColor As String) As String";
 //BA.debugLineNum = 1490;BA.debugLine="sColor = sColor.tolowercase";
_scolor = _scolor.toLowerCase();
 //BA.debugLineNum = 1491;BA.debugLine="If ColorMap.ContainsKey(sColor) Then";
if (_colormap.ContainsKey((Object)(_scolor))) { 
 //BA.debugLineNum = 1492;BA.debugLine="Dim xColor As String = ColorMap.Get(sColor)";
_xcolor = BA.ObjectToString(_colormap.Get((Object)(_scolor)));
 //BA.debugLineNum = 1493;BA.debugLine="Return xColor";
if (true) return _xcolor;
 };
 //BA.debugLineNum = 1495;BA.debugLine="Return \"\"";
if (true) return "";
 //BA.debugLineNum = 1496;BA.debugLine="End Sub";
return "";
}
public boolean  _getdisabledstate(String _k) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 1029;BA.debugLine="Sub GetDisabledState(k As String) As Boolean";
 //BA.debugLineNum = 1030;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
 //BA.debugLineNum = 1031;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_diskey,(Object)(__c.False)));
 //BA.debugLineNum = 1032;BA.debugLine="End Sub";
return false;
}
public String  _geteventtargetproperty(com.ab.banano.BANanoEvent _e,String _prop) throws Exception{
String _sid = "";
 //BA.debugLineNum = 1933;BA.debugLine="Sub GetEventTargetProperty(e As BANanoEvent, prop";
 //BA.debugLineNum = 1934;BA.debugLine="Dim sid As String = e.OtherField(\"target\").GetFie";
_sid = BA.ObjectToString(_e.OtherField("target").GetField(_prop).Result());
 //BA.debugLineNum = 1935;BA.debugLine="Return sid";
if (true) return _sid;
 //BA.debugLineNum = 1936;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue._fileobject  _getfiledetails(anywheresoftware.b4a.objects.collections.Map _fileobj) throws Exception{
String _sname = "";
String _slastmodifieddate = "";
String _ssize = "";
String _stype = "";
b4j.example.bananovue._fileobject _ff = null;
 //BA.debugLineNum = 210;BA.debugLine="Sub GetFileDetails(fileObj As Map) As FileObject";
 //BA.debugLineNum = 211;BA.debugLine="Dim sname As String = fileObj.Get(\"name\")";
_sname = BA.ObjectToString(_fileobj.Get((Object)("name")));
 //BA.debugLineNum = 212;BA.debugLine="Dim slastModifiedDate As String = fileObj.Get(\"la";
_slastmodifieddate = BA.ObjectToString(_fileobj.Get((Object)("lastModifiedDate")));
 //BA.debugLineNum = 213;BA.debugLine="slastModifiedDate = Date2YYYYMMDDHHMM(slastModifi";
_slastmodifieddate = _date2yyyymmddhhmm((Object)(_slastmodifieddate));
 //BA.debugLineNum = 214;BA.debugLine="Dim ssize As String = fileObj.Get(\"size\")";
_ssize = BA.ObjectToString(_fileobj.Get((Object)("size")));
 //BA.debugLineNum = 215;BA.debugLine="Dim stype As String = fileObj.Get(\"type\")";
_stype = BA.ObjectToString(_fileobj.Get((Object)("type")));
 //BA.debugLineNum = 217;BA.debugLine="Dim ff As FileObject";
_ff = new b4j.example.bananovue._fileobject();
 //BA.debugLineNum = 218;BA.debugLine="ff.Initialize";
_ff.Initialize();
 //BA.debugLineNum = 219;BA.debugLine="ff.FileName = sname";
_ff.FileName /*String*/  = _sname;
 //BA.debugLineNum = 220;BA.debugLine="ff.FileDate = slastModifiedDate";
_ff.FileDate /*String*/  = _slastmodifieddate;
 //BA.debugLineNum = 221;BA.debugLine="ff.FileSize = ssize";
_ff.FileSize /*long*/  = (long)(Double.parseDouble(_ssize));
 //BA.debugLineNum = 222;BA.debugLine="ff.FileType = stype";
_ff.FileType /*String*/  = _stype;
 //BA.debugLineNum = 223;BA.debugLine="Return ff";
if (true) return _ff;
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public String  _getfileext(String _fullpath) throws Exception{
 //BA.debugLineNum = 1790;BA.debugLine="Sub GetFileExt(FullPath As String) As String";
 //BA.debugLineNum = 1791;BA.debugLine="Return FullPath.SubString(FullPath.LastIndexOf(\".";
if (true) return _fullpath.substring((int) (_fullpath.lastIndexOf(".")+1));
 //BA.debugLineNum = 1792;BA.debugLine="End Sub";
return "";
}
public String  _getfileparentpath(String _path) throws Exception{
String _path1 = "";
int _l = 0;
 //BA.debugLineNum = 1770;BA.debugLine="Sub GetFileParentPath(Path As String) As String";
 //BA.debugLineNum = 1771;BA.debugLine="Dim Path1 As String";
_path1 = "";
 //BA.debugLineNum = 1772;BA.debugLine="Dim L As Int";
_l = 0;
 //BA.debugLineNum = 1773;BA.debugLine="If Path = \"/\" Then";
if ((_path).equals("/")) { 
 //BA.debugLineNum = 1774;BA.debugLine="Return \"/\"";
if (true) return "/";
 };
 //BA.debugLineNum = 1776;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
 //BA.debugLineNum = 1777;BA.debugLine="If L = Path.Length - 1 Then";
if (_l==_path.length()-1) { 
 //BA.debugLineNum = 1779;BA.debugLine="Path1 = Path.SubString2(0,L)";
_path1 = _path.substring((int) (0),_l);
 }else {
 //BA.debugLineNum = 1781;BA.debugLine="Path1 = Path";
_path1 = _path;
 };
 //BA.debugLineNum = 1783;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
 //BA.debugLineNum = 1784;BA.debugLine="If L = 0 Then";
if (_l==0) { 
 //BA.debugLineNum = 1785;BA.debugLine="L = 1";
_l = (int) (1);
 };
 //BA.debugLineNum = 1787;BA.debugLine="Return Path1.SubString2(0,L)";
if (true) return _path1.substring((int) (0),_l);
 //BA.debugLineNum = 1788;BA.debugLine="End Sub";
return "";
}
public String  _getidfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
com.ab.banano.BANanoElement _cureve = null;
String _id = "";
 //BA.debugLineNum = 1920;BA.debugLine="Sub GetIDFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 1921;BA.debugLine="Dim curEve As BANanoElement = BANAno.ToElement(e.";
_cureve = new com.ab.banano.BANanoElement();
_cureve = _banano.ToElement(_e.OtherField("currentTarget"));
 //BA.debugLineNum = 1922;BA.debugLine="Dim id As String = curEve.GetField(\"id\").Result";
_id = BA.ObjectToString(_cureve.GetField("id").Result());
 //BA.debugLineNum = 1923;BA.debugLine="Return id";
if (true) return _id;
 //BA.debugLineNum = 1924;BA.debugLine="End Sub";
return "";
}
public String  _getkeyfromevent(com.ab.banano.BANanoEvent _e) throws Exception{
com.ab.banano.BANanoElement _cureve = null;
String _id = "";
 //BA.debugLineNum = 1927;BA.debugLine="Sub GetKeyFromEvent(e As BANanoEvent) As String";
 //BA.debugLineNum = 1928;BA.debugLine="Dim curEve As BANanoElement = BANAno.ToElement(e.";
_cureve = new com.ab.banano.BANanoElement();
_cureve = _banano.ToElement(_e.OtherField("currentTarget"));
 //BA.debugLineNum = 1929;BA.debugLine="Dim id As String = curEve.GetField(\"key\").Result";
_id = BA.ObjectToString(_cureve.GetField("key").Result());
 //BA.debugLineNum = 1930;BA.debugLine="Return id";
if (true) return _id;
 //BA.debugLineNum = 1931;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
Object _value = null;
 //BA.debugLineNum = 928;BA.debugLine="Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 929;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 930;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 931;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 932;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 933;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 934;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 935;BA.debugLine="Dim value As Object = sourceMap.GetKeyAt(iCnt)";
_value = _sourcemap.GetKeyAt(_icnt);
 //BA.debugLineNum = 936;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
 //BA.debugLineNum = 938;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 939;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
Object _value = null;
 //BA.debugLineNum = 914;BA.debugLine="Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 915;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 916;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 917;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 918;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 919;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 920;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 921;BA.debugLine="Dim value As Object = sourceMap.GetValueAt(iCnt)";
_value = _sourcemap.GetValueAt(_icnt);
 //BA.debugLineNum = 922;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
 //BA.debugLineNum = 924;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 925;BA.debugLine="End Sub";
return null;
}
public String  _getnumbers(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 943;BA.debugLine="Public Sub GetNumbers(value As String) As String";
 //BA.debugLineNum = 944;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 945;BA.debugLine="Try";
try { //BA.debugLineNum = 946;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 947;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 948;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 949;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 950;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 951;BA.debugLine="For i = 0 To slen - 1";
{
final int step8 = 1;
final int limit8 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 952;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 953;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
if (_instr("0123456789.-",_mout)!=-1) { 
 //BA.debugLineNum = 954;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 957;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 959;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 961;BA.debugLine="End Sub";
return "";
}
public boolean  _getrequiredstate(String _k) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 1874;BA.debugLine="Sub GetRequiredState(k As String) As Boolean";
 //BA.debugLineNum = 1875;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
 //BA.debugLineNum = 1876;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_diskey,(Object)(__c.False)));
 //BA.debugLineNum = 1877;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowstate(String _k) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 1024;BA.debugLine="Sub GetShowState(k As String) As Boolean";
 //BA.debugLineNum = 1025;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
 //BA.debugLineNum = 1026;BA.debugLine="Return GetState(showKey,False)";
if (true) return BA.ObjectToBoolean(_getstate(_showkey,(Object)(__c.False)));
 //BA.debugLineNum = 1027;BA.debugLine="End Sub";
return false;
}
public Object  _getstate(String _k,Object _v) throws Exception{
Object _out = null;
 //BA.debugLineNum = 2401;BA.debugLine="Sub GetState(k As String, v As Object) As Object";
 //BA.debugLineNum = 2402;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 2403;BA.debugLine="If data.ContainsKey(k) Then";
if (_data.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2404;BA.debugLine="Dim out As Object = data.GetDefault(k,v)";
_out = _data.GetDefault((Object)(_k),_v);
 //BA.debugLineNum = 2405;BA.debugLine="Return out";
if (true) return _out;
 }else {
 //BA.debugLineNum = 2407;BA.debugLine="Log(\"GetState: First set the v-model for \" & k)";
__c.Log("GetState: First set the v-model for "+_k);
 //BA.debugLineNum = 2408;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
 //BA.debugLineNum = 2410;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getstates(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _sm = null;
String _lstrec = "";
Object _state = null;
 //BA.debugLineNum = 2377;BA.debugLine="Sub GetStates(lst As List) As Map";
 //BA.debugLineNum = 2378;BA.debugLine="Dim sm As Map = CreateMap()";
_sm = new anywheresoftware.b4a.objects.collections.Map();
_sm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2379;BA.debugLine="For Each lstrec As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lstrec = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2380;BA.debugLine="lstrec = lstrec.tolowercase";
_lstrec = _lstrec.toLowerCase();
 //BA.debugLineNum = 2381;BA.debugLine="Dim state As Object = GetState(lstrec, Null)";
_state = _getstate(_lstrec,__c.Null);
 //BA.debugLineNum = 2382;BA.debugLine="sm.Put(lstrec, state)";
_sm.Put((Object)(_lstrec),_state);
 }
};
 //BA.debugLineNum = 2384;BA.debugLine="Return sm";
if (true) return _sm;
 //BA.debugLineNum = 2385;BA.debugLine="End Sub";
return null;
}
public boolean  _hasstate(String _k) throws Exception{
 //BA.debugLineNum = 2373;BA.debugLine="Sub HasState(k As String) As Boolean";
 //BA.debugLineNum = 2374;BA.debugLine="Return data.ContainsKey(k)";
if (true) return _data.ContainsKey((Object)(_k));
 //BA.debugLineNum = 2375;BA.debugLine="End Sub";
return false;
}
public String  _hideerror(String _elid) throws Exception{
 //BA.debugLineNum = 1766;BA.debugLine="Sub HideError(elID As String)";
 //BA.debugLineNum = 1767;BA.debugLine="SetStateSingle($\"${elID}error\"$, False)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.False));
 //BA.debugLineNum = 1768;BA.debugLine="End Sub";
return "";
}
public String  _hideitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
String _item = "";
 //BA.debugLineNum = 1065;BA.debugLine="Sub HideItems(items As List)";
 //BA.debugLineNum = 1066;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1067;BA.debugLine="SetStateSingle(item, False)";
_setstatesingle(_item,(Object)(__c.False));
 }
};
 //BA.debugLineNum = 1069;BA.debugLine="End Sub";
return "";
}
public String  _hr() throws Exception{
 //BA.debugLineNum = 1504;BA.debugLine="Sub HR As String";
 //BA.debugLineNum = 1505;BA.debugLine="Return \"<hr>\"";
if (true) return "<hr>";
 //BA.debugLineNum = 1506;BA.debugLine="End Sub";
return "";
}
public String  _httpupload(Object _fileobj,Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoPromise _promise = null;
String _error = "";
String _json = "";
 //BA.debugLineNum = 256;BA.debugLine="Sub HTTPUpload(fileObj As Object, module As Object";
 //BA.debugLineNum = 257;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
 //BA.debugLineNum = 259;BA.debugLine="Dim Error As String";
_error = "";
 //BA.debugLineNum = 260;BA.debugLine="Dim json As String";
_json = "";
 //BA.debugLineNum = 263;BA.debugLine="promise.CallSub(Me, \"DoUpload\", Array(fileObj))";
_promise.CallSub(this,"DoUpload",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj}));
 //BA.debugLineNum = 264;BA.debugLine="promise.ThenWait(json)";
_promise.ThenWait((Object)(_json));
 //BA.debugLineNum = 265;BA.debugLine="BANAno.CallSub(module, methodname, Array(fileObj,";
_banano.CallSub(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj,(Object)(_json)}));
 //BA.debugLineNum = 266;BA.debugLine="promise.ElseWait(Error)  'ignore";
_promise.ElseWait((Object)(_error));
 //BA.debugLineNum = 267;BA.debugLine="BANAno.CallSub(module, methodname, Array(fileObj,";
_banano.CallSub(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj,(Object)(_error)}));
 //BA.debugLineNum = 268;BA.debugLine="promise.End";
_promise.End();
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return "";
}
public String  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 1166;BA.debugLine="Public Sub Initialize()";
 //BA.debugLineNum = 1167;BA.debugLine="BOVue.Initialize(\"Vue\")";
_bovue.Initialize((Object)("Vue"));
 //BA.debugLineNum = 1168;BA.debugLine="JQuery.Initialize(\"$\")";
_jquery.Initialize((Object)("$"));
 //BA.debugLineNum = 1170;BA.debugLine="body = BANAno.GetElement(\"#body\")";
_body = _banano.GetElement("#body");
 //BA.debugLineNum = 1171;BA.debugLine="body.empty";
_body.Empty();
 //BA.debugLineNum = 1173;BA.debugLine="body.Append($\"<div id=\"app\"></div>\"$)";
_body.Append(("<div id=\"app\"></div>"));
 //BA.debugLineNum = 1174;BA.debugLine="Template.Initialize(\"app\",\"div\")";
_template._initialize /*b4j.example.vuehtml*/ (ba,"app","div");
 //BA.debugLineNum = 1175;BA.debugLine="Template.SetVCloak";
_template._setvcloak /*b4j.example.vuehtml*/ ();
 //BA.debugLineNum = 1176;BA.debugLine="methods.Initialize";
_methods.Initialize();
 //BA.debugLineNum = 1177;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 1178;BA.debugLine="computed.Initialize";
_computed.Initialize();
 //BA.debugLineNum = 1179;BA.debugLine="watches.Initialize";
_watches.Initialize();
 //BA.debugLineNum = 1180;BA.debugLine="routes.Initialize";
_routes.Initialize();
 //BA.debugLineNum = 1181;BA.debugLine="beforeMount = Null";
_beforemount.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1182;BA.debugLine="beforeUpdate = Null";
_beforeupdate.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1183;BA.debugLine="created = Null";
_created.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1184;BA.debugLine="mounted = Null";
_mounted.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1185;BA.debugLine="destroyed = Null";
_destroyed.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1186;BA.debugLine="updated = Null";
_updated.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1187;BA.debugLine="beforeCreate = Null";
_beforecreate.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1188;BA.debugLine="activated = Null";
_activated.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1189;BA.debugLine="deactivated = Null";
_deactivated.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1190;BA.debugLine="beforeDestroy = Null";
_beforedestroy.setObject((java.lang.Object)(__c.Null));
 //BA.debugLineNum = 1192;BA.debugLine="TypeOfString = BOVue.GetField(\"String\")";
_typeofstring = _bovue.GetField("String");
 //BA.debugLineNum = 1193;BA.debugLine="TypeOfNumber = BOVue.GetField(\"Number\")";
_typeofnumber = _bovue.GetField("Number");
 //BA.debugLineNum = 1194;BA.debugLine="TypeOfBoolean = BOVue.GetField(\"Boolean\")";
_typeofboolean = _bovue.GetField("Boolean");
 //BA.debugLineNum = 1195;BA.debugLine="TypeOfArray = BOVue.GetField(\"Array\")";
_typeofarray = _bovue.GetField("Array");
 //BA.debugLineNum = 1196;BA.debugLine="TypeOfObject = BOVue.GetField(\"Object\")";
_typeofobject = _bovue.GetField("Object");
 //BA.debugLineNum = 1197;BA.debugLine="TypeOfDate = BOVue.GetField(\"Date\")";
_typeofdate = _bovue.GetField("Date");
 //BA.debugLineNum = 1198;BA.debugLine="TypeOfFunction = BOVue.GetField(\"Function\")";
_typeoffunction = _bovue.GetField("Function");
 //BA.debugLineNum = 1199;BA.debugLine="TypeOfSymbol = BOVue.GetField(\"Symbol\")";
_typeofsymbol = _bovue.GetField("Symbol");
 //BA.debugLineNum = 1200;BA.debugLine="Options = CreateMap()";
_options = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1201;BA.debugLine="dynamicStyle = CreateMap()";
_dynamicstyle = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1202;BA.debugLine="SetFontFamily(\"'Roboto', 'Helvetica', Arial, sans";
_setfontfamily((Object)("'Roboto', 'Helvetica', Arial, sans-serif"));
 //BA.debugLineNum = 1204;BA.debugLine="Colors.initialize";
_colors.Initialize();
 //BA.debugLineNum = 1205;BA.debugLine="Colors.red = \"red\"";
_colors.red /*String*/  = "red";
 //BA.debugLineNum = 1206;BA.debugLine="Colors.pink = \"pink\"";
_colors.pink /*String*/  = "pink";
 //BA.debugLineNum = 1207;BA.debugLine="Colors.purple = \"purple\"";
_colors.purple /*String*/  = "purple";
 //BA.debugLineNum = 1208;BA.debugLine="Colors.deepPurple = \"deep-purple\"";
_colors.deepPurple /*String*/  = "deep-purple";
 //BA.debugLineNum = 1209;BA.debugLine="Colors.indigo = \"indigo\"";
_colors.indigo /*String*/  = "indigo";
 //BA.debugLineNum = 1210;BA.debugLine="Colors.blue = \"blue\"";
_colors.blue /*String*/  = "blue";
 //BA.debugLineNum = 1211;BA.debugLine="Colors.lightBlue = \"light-blue\"";
_colors.lightBlue /*String*/  = "light-blue";
 //BA.debugLineNum = 1212;BA.debugLine="Colors.cyan = \"cyan\"";
_colors.cyan /*String*/  = "cyan";
 //BA.debugLineNum = 1213;BA.debugLine="Colors.teal = \"teal\"";
_colors.teal /*String*/  = "teal";
 //BA.debugLineNum = 1214;BA.debugLine="Colors.green = \"green\"";
_colors.green /*String*/  = "green";
 //BA.debugLineNum = 1215;BA.debugLine="Colors.lightGreen = \"light-green\"";
_colors.lightGreen /*String*/  = "light-green";
 //BA.debugLineNum = 1216;BA.debugLine="Colors.lime = \"lime\"";
_colors.lime /*String*/  = "lime";
 //BA.debugLineNum = 1217;BA.debugLine="Colors.yellow = \"yellow\"";
_colors.yellow /*String*/  = "yellow";
 //BA.debugLineNum = 1218;BA.debugLine="Colors.amber = \"amber\"";
_colors.amber /*String*/  = "amber";
 //BA.debugLineNum = 1219;BA.debugLine="Colors.Orange = \"orange\"";
_colors.Orange /*String*/  = "orange";
 //BA.debugLineNum = 1220;BA.debugLine="Colors.deepOrange = \"deep-orange\"";
_colors.deepOrange /*String*/  = "deep-orange";
 //BA.debugLineNum = 1221;BA.debugLine="Colors.brown = \"brown\"";
_colors.brown /*String*/  = "brown";
 //BA.debugLineNum = 1222;BA.debugLine="Colors.grey = \"grey\"";
_colors.grey /*String*/  = "grey";
 //BA.debugLineNum = 1223;BA.debugLine="Colors.blueGrey = \"blue-grey\"";
_colors.blueGrey /*String*/  = "blue-grey";
 //BA.debugLineNum = 1224;BA.debugLine="Colors.black = \"black\"";
_colors.black /*String*/  = "black";
 //BA.debugLineNum = 1225;BA.debugLine="Colors.white = \"white\"";
_colors.white /*String*/  = "white";
 //BA.debugLineNum = 1226;BA.debugLine="Colors.transparent = \"transparent\"";
_colors.transparent /*String*/  = "transparent";
 //BA.debugLineNum = 1228;BA.debugLine="ColorMap.Initialize";
_colormap.Initialize();
 //BA.debugLineNum = 1229;BA.debugLine="ColorMap.put(\"red lighten-5\", \"#ffebee\")";
_colormap.Put((Object)("red lighten-5"),(Object)("#ffebee"));
 //BA.debugLineNum = 1230;BA.debugLine="ColorMap.put(\"red lighten-4\", \"#ffcdd2\")";
_colormap.Put((Object)("red lighten-4"),(Object)("#ffcdd2"));
 //BA.debugLineNum = 1231;BA.debugLine="ColorMap.put(\"red lighten-3\", \"#ef9a9a\")";
_colormap.Put((Object)("red lighten-3"),(Object)("#ef9a9a"));
 //BA.debugLineNum = 1232;BA.debugLine="ColorMap.put(\"red lighten-2\", \"#e57373\")";
_colormap.Put((Object)("red lighten-2"),(Object)("#e57373"));
 //BA.debugLineNum = 1233;BA.debugLine="ColorMap.put(\"red lighten-1\", \"#ef5350\")";
_colormap.Put((Object)("red lighten-1"),(Object)("#ef5350"));
 //BA.debugLineNum = 1234;BA.debugLine="ColorMap.put(\"red\", \"#f44336\")";
_colormap.Put((Object)("red"),(Object)("#f44336"));
 //BA.debugLineNum = 1235;BA.debugLine="ColorMap.put(\"red darken-1\", \"#e53935\")";
_colormap.Put((Object)("red darken-1"),(Object)("#e53935"));
 //BA.debugLineNum = 1236;BA.debugLine="ColorMap.put(\"red darken-2\", \"#d32f2f\")";
_colormap.Put((Object)("red darken-2"),(Object)("#d32f2f"));
 //BA.debugLineNum = 1237;BA.debugLine="ColorMap.put(\"red darken-3\", \"#c62828\")";
_colormap.Put((Object)("red darken-3"),(Object)("#c62828"));
 //BA.debugLineNum = 1238;BA.debugLine="ColorMap.put(\"red darken-4\", \"#b71c1c\")";
_colormap.Put((Object)("red darken-4"),(Object)("#b71c1c"));
 //BA.debugLineNum = 1239;BA.debugLine="ColorMap.put(\"red accent-1\", \"#ff8a80\")";
_colormap.Put((Object)("red accent-1"),(Object)("#ff8a80"));
 //BA.debugLineNum = 1240;BA.debugLine="ColorMap.put(\"red accent-2\", \"#ff5252\")";
_colormap.Put((Object)("red accent-2"),(Object)("#ff5252"));
 //BA.debugLineNum = 1241;BA.debugLine="ColorMap.put(\"red accent-3\", \"#ff1744\")";
_colormap.Put((Object)("red accent-3"),(Object)("#ff1744"));
 //BA.debugLineNum = 1242;BA.debugLine="ColorMap.put(\"red accent-4\", \"#d50000\")";
_colormap.Put((Object)("red accent-4"),(Object)("#d50000"));
 //BA.debugLineNum = 1243;BA.debugLine="ColorMap.put(\"pink lighten-5\", \"#fce4ec\")";
_colormap.Put((Object)("pink lighten-5"),(Object)("#fce4ec"));
 //BA.debugLineNum = 1244;BA.debugLine="ColorMap.put(\"pink lighten-4\", \"#f8bbd0\")";
_colormap.Put((Object)("pink lighten-4"),(Object)("#f8bbd0"));
 //BA.debugLineNum = 1245;BA.debugLine="ColorMap.put(\"pink lighten-3\", \"#f48fb1\")";
_colormap.Put((Object)("pink lighten-3"),(Object)("#f48fb1"));
 //BA.debugLineNum = 1246;BA.debugLine="ColorMap.put(\"pink lighten-2\", \"#f06292\")";
_colormap.Put((Object)("pink lighten-2"),(Object)("#f06292"));
 //BA.debugLineNum = 1247;BA.debugLine="ColorMap.put(\"pink lighten-1\", \"#ec407a\")";
_colormap.Put((Object)("pink lighten-1"),(Object)("#ec407a"));
 //BA.debugLineNum = 1248;BA.debugLine="ColorMap.put(\"pink\", \"#e91e63\")";
_colormap.Put((Object)("pink"),(Object)("#e91e63"));
 //BA.debugLineNum = 1249;BA.debugLine="ColorMap.put(\"pink darken-1\", \"#d81b60\")";
_colormap.Put((Object)("pink darken-1"),(Object)("#d81b60"));
 //BA.debugLineNum = 1250;BA.debugLine="ColorMap.put(\"pink darken-2\", \"#c2185b\")";
_colormap.Put((Object)("pink darken-2"),(Object)("#c2185b"));
 //BA.debugLineNum = 1251;BA.debugLine="ColorMap.put(\"pink darken-3\", \"#ad1457\")";
_colormap.Put((Object)("pink darken-3"),(Object)("#ad1457"));
 //BA.debugLineNum = 1252;BA.debugLine="ColorMap.put(\"pink darken-4\", \"#880e4f\")";
_colormap.Put((Object)("pink darken-4"),(Object)("#880e4f"));
 //BA.debugLineNum = 1253;BA.debugLine="ColorMap.put(\"pink accent-1\", \"#ff80ab\")";
_colormap.Put((Object)("pink accent-1"),(Object)("#ff80ab"));
 //BA.debugLineNum = 1254;BA.debugLine="ColorMap.put(\"pink accent-2\", \"#ff4081\")";
_colormap.Put((Object)("pink accent-2"),(Object)("#ff4081"));
 //BA.debugLineNum = 1255;BA.debugLine="ColorMap.put(\"pink accent-3\", \"#f50057\")";
_colormap.Put((Object)("pink accent-3"),(Object)("#f50057"));
 //BA.debugLineNum = 1256;BA.debugLine="ColorMap.put(\"pink accent-4\", \"#c51162\")";
_colormap.Put((Object)("pink accent-4"),(Object)("#c51162"));
 //BA.debugLineNum = 1257;BA.debugLine="ColorMap.put(\"purple lighten-5\", \"#f3e5f5\")";
_colormap.Put((Object)("purple lighten-5"),(Object)("#f3e5f5"));
 //BA.debugLineNum = 1258;BA.debugLine="ColorMap.put(\"purple lighten-4\", \"#e1bee7\")";
_colormap.Put((Object)("purple lighten-4"),(Object)("#e1bee7"));
 //BA.debugLineNum = 1259;BA.debugLine="ColorMap.put(\"purple lighten-3\", \"#ce93d8\")";
_colormap.Put((Object)("purple lighten-3"),(Object)("#ce93d8"));
 //BA.debugLineNum = 1260;BA.debugLine="ColorMap.put(\"purple lighten-2\", \"#ba68c8\")";
_colormap.Put((Object)("purple lighten-2"),(Object)("#ba68c8"));
 //BA.debugLineNum = 1261;BA.debugLine="ColorMap.put(\"purple lighten-1\", \"#ab47bc\")";
_colormap.Put((Object)("purple lighten-1"),(Object)("#ab47bc"));
 //BA.debugLineNum = 1262;BA.debugLine="ColorMap.put(\"purple\", \"#9c27b0\")";
_colormap.Put((Object)("purple"),(Object)("#9c27b0"));
 //BA.debugLineNum = 1263;BA.debugLine="ColorMap.put(\"purple darken-1\", \"#8e24aa\")";
_colormap.Put((Object)("purple darken-1"),(Object)("#8e24aa"));
 //BA.debugLineNum = 1264;BA.debugLine="ColorMap.put(\"purple darken-2\", \"#7b1fa2\")";
_colormap.Put((Object)("purple darken-2"),(Object)("#7b1fa2"));
 //BA.debugLineNum = 1265;BA.debugLine="ColorMap.put(\"purple darken-3\", \"#6a1b9a\")";
_colormap.Put((Object)("purple darken-3"),(Object)("#6a1b9a"));
 //BA.debugLineNum = 1266;BA.debugLine="ColorMap.put(\"purple darken-4\", \"#4a148c\")";
_colormap.Put((Object)("purple darken-4"),(Object)("#4a148c"));
 //BA.debugLineNum = 1267;BA.debugLine="ColorMap.put(\"purple accent-1\", \"#ea80fc\")";
_colormap.Put((Object)("purple accent-1"),(Object)("#ea80fc"));
 //BA.debugLineNum = 1268;BA.debugLine="ColorMap.put(\"purple accent-2\", \"#e040fb\")";
_colormap.Put((Object)("purple accent-2"),(Object)("#e040fb"));
 //BA.debugLineNum = 1269;BA.debugLine="ColorMap.put(\"purple accent-3\", \"#d500f9\")";
_colormap.Put((Object)("purple accent-3"),(Object)("#d500f9"));
 //BA.debugLineNum = 1270;BA.debugLine="ColorMap.put(\"purple accent-4\", \"#aa00ff\")";
_colormap.Put((Object)("purple accent-4"),(Object)("#aa00ff"));
 //BA.debugLineNum = 1271;BA.debugLine="ColorMap.put(\"deep-purple lighten-5\", \"#ede7f6\")";
_colormap.Put((Object)("deep-purple lighten-5"),(Object)("#ede7f6"));
 //BA.debugLineNum = 1272;BA.debugLine="ColorMap.put(\"deep-purple lighten-4\", \"#d1c4e9\")";
_colormap.Put((Object)("deep-purple lighten-4"),(Object)("#d1c4e9"));
 //BA.debugLineNum = 1273;BA.debugLine="ColorMap.put(\"deep-purple lighten-3\", \"#b39ddb\")";
_colormap.Put((Object)("deep-purple lighten-3"),(Object)("#b39ddb"));
 //BA.debugLineNum = 1274;BA.debugLine="ColorMap.put(\"deep-purple lighten-2\", \"#9575cd\")";
_colormap.Put((Object)("deep-purple lighten-2"),(Object)("#9575cd"));
 //BA.debugLineNum = 1275;BA.debugLine="ColorMap.put(\"deep-purple lighten-1\", \"#7e57c2\")";
_colormap.Put((Object)("deep-purple lighten-1"),(Object)("#7e57c2"));
 //BA.debugLineNum = 1276;BA.debugLine="ColorMap.put(\"deep-purple\", \"#673ab7\")";
_colormap.Put((Object)("deep-purple"),(Object)("#673ab7"));
 //BA.debugLineNum = 1277;BA.debugLine="ColorMap.put(\"deep-purple darken-1\", \"#5e35b1\")";
_colormap.Put((Object)("deep-purple darken-1"),(Object)("#5e35b1"));
 //BA.debugLineNum = 1278;BA.debugLine="ColorMap.put(\"deep-purple darken-2\", \"#512da8\")";
_colormap.Put((Object)("deep-purple darken-2"),(Object)("#512da8"));
 //BA.debugLineNum = 1279;BA.debugLine="ColorMap.put(\"deep-purple darken-3\", \"#4527a0\")";
_colormap.Put((Object)("deep-purple darken-3"),(Object)("#4527a0"));
 //BA.debugLineNum = 1280;BA.debugLine="ColorMap.put(\"deep-purple darken-4\", \"#311b92\")";
_colormap.Put((Object)("deep-purple darken-4"),(Object)("#311b92"));
 //BA.debugLineNum = 1281;BA.debugLine="ColorMap.put(\"deep-purple accent-1\", \"#b388ff\")";
_colormap.Put((Object)("deep-purple accent-1"),(Object)("#b388ff"));
 //BA.debugLineNum = 1282;BA.debugLine="ColorMap.put(\"deep-purple accent-2\", \"#7c4dff\")";
_colormap.Put((Object)("deep-purple accent-2"),(Object)("#7c4dff"));
 //BA.debugLineNum = 1283;BA.debugLine="ColorMap.put(\"deep-purple accent-3\", \"#651fff\")";
_colormap.Put((Object)("deep-purple accent-3"),(Object)("#651fff"));
 //BA.debugLineNum = 1284;BA.debugLine="ColorMap.put(\"deep-purple accent-4\", \"#6200ea\")";
_colormap.Put((Object)("deep-purple accent-4"),(Object)("#6200ea"));
 //BA.debugLineNum = 1285;BA.debugLine="ColorMap.put(\"indigo lighten-5\", \"#e8eaf6\")";
_colormap.Put((Object)("indigo lighten-5"),(Object)("#e8eaf6"));
 //BA.debugLineNum = 1286;BA.debugLine="ColorMap.put(\"indigo lighten-4\", \"#c5cae9\")";
_colormap.Put((Object)("indigo lighten-4"),(Object)("#c5cae9"));
 //BA.debugLineNum = 1287;BA.debugLine="ColorMap.put(\"indigo lighten-3\", \"#9fa8da\")";
_colormap.Put((Object)("indigo lighten-3"),(Object)("#9fa8da"));
 //BA.debugLineNum = 1288;BA.debugLine="ColorMap.put(\"indigo lighten-2\", \"#7986cb\")";
_colormap.Put((Object)("indigo lighten-2"),(Object)("#7986cb"));
 //BA.debugLineNum = 1289;BA.debugLine="ColorMap.put(\"indigo lighten-1\", \"#5c6bc0\")";
_colormap.Put((Object)("indigo lighten-1"),(Object)("#5c6bc0"));
 //BA.debugLineNum = 1290;BA.debugLine="ColorMap.put(\"indigo\", \"#3f51b5\")";
_colormap.Put((Object)("indigo"),(Object)("#3f51b5"));
 //BA.debugLineNum = 1291;BA.debugLine="ColorMap.put(\"indigo darken-1\", \"#3949ab\")";
_colormap.Put((Object)("indigo darken-1"),(Object)("#3949ab"));
 //BA.debugLineNum = 1292;BA.debugLine="ColorMap.put(\"indigo darken-2\", \"#303f9f\")";
_colormap.Put((Object)("indigo darken-2"),(Object)("#303f9f"));
 //BA.debugLineNum = 1293;BA.debugLine="ColorMap.put(\"indigo darken-3\", \"#283593\")";
_colormap.Put((Object)("indigo darken-3"),(Object)("#283593"));
 //BA.debugLineNum = 1294;BA.debugLine="ColorMap.put(\"indigo darken-4\", \"#1a237e\")";
_colormap.Put((Object)("indigo darken-4"),(Object)("#1a237e"));
 //BA.debugLineNum = 1295;BA.debugLine="ColorMap.put(\"indigo accent-1\", \"#8c9eff\")";
_colormap.Put((Object)("indigo accent-1"),(Object)("#8c9eff"));
 //BA.debugLineNum = 1296;BA.debugLine="ColorMap.put(\"indigo accent-2\", \"#536dfe\")";
_colormap.Put((Object)("indigo accent-2"),(Object)("#536dfe"));
 //BA.debugLineNum = 1297;BA.debugLine="ColorMap.put(\"indigo accent-3\", \"#3d5afe\")";
_colormap.Put((Object)("indigo accent-3"),(Object)("#3d5afe"));
 //BA.debugLineNum = 1298;BA.debugLine="ColorMap.put(\"indigo accent-4\", \"#304ffe\")";
_colormap.Put((Object)("indigo accent-4"),(Object)("#304ffe"));
 //BA.debugLineNum = 1299;BA.debugLine="ColorMap.put(\"blue lighten-5\", \"#e3f2fd\")";
_colormap.Put((Object)("blue lighten-5"),(Object)("#e3f2fd"));
 //BA.debugLineNum = 1300;BA.debugLine="ColorMap.put(\"blue lighten-4\", \"#bbdefb\")";
_colormap.Put((Object)("blue lighten-4"),(Object)("#bbdefb"));
 //BA.debugLineNum = 1301;BA.debugLine="ColorMap.put(\"blue lighten-3\", \"#90caf9\")";
_colormap.Put((Object)("blue lighten-3"),(Object)("#90caf9"));
 //BA.debugLineNum = 1302;BA.debugLine="ColorMap.put(\"blue lighten-2\", \"#64b5f6\")";
_colormap.Put((Object)("blue lighten-2"),(Object)("#64b5f6"));
 //BA.debugLineNum = 1303;BA.debugLine="ColorMap.put(\"blue lighten-1\", \"#42a5f5\")";
_colormap.Put((Object)("blue lighten-1"),(Object)("#42a5f5"));
 //BA.debugLineNum = 1304;BA.debugLine="ColorMap.put(\"blue\", \"#2196f3\")";
_colormap.Put((Object)("blue"),(Object)("#2196f3"));
 //BA.debugLineNum = 1305;BA.debugLine="ColorMap.put(\"blue darken-1\", \"#1e88e5\")";
_colormap.Put((Object)("blue darken-1"),(Object)("#1e88e5"));
 //BA.debugLineNum = 1306;BA.debugLine="ColorMap.put(\"blue darken-2\", \"#1976d2\")";
_colormap.Put((Object)("blue darken-2"),(Object)("#1976d2"));
 //BA.debugLineNum = 1307;BA.debugLine="ColorMap.put(\"blue darken-3\", \"#1565c0\")";
_colormap.Put((Object)("blue darken-3"),(Object)("#1565c0"));
 //BA.debugLineNum = 1308;BA.debugLine="ColorMap.put(\"blue darken-4\", \"#0d47a1\")";
_colormap.Put((Object)("blue darken-4"),(Object)("#0d47a1"));
 //BA.debugLineNum = 1309;BA.debugLine="ColorMap.put(\"blue accent-1\", \"#82b1ff\")";
_colormap.Put((Object)("blue accent-1"),(Object)("#82b1ff"));
 //BA.debugLineNum = 1310;BA.debugLine="ColorMap.put(\"blue accent-2\", \"#448aff\")";
_colormap.Put((Object)("blue accent-2"),(Object)("#448aff"));
 //BA.debugLineNum = 1311;BA.debugLine="ColorMap.put(\"blue accent-3\", \"#2979ff\")";
_colormap.Put((Object)("blue accent-3"),(Object)("#2979ff"));
 //BA.debugLineNum = 1312;BA.debugLine="ColorMap.put(\"blue accent-4\", \"#2962ff\")";
_colormap.Put((Object)("blue accent-4"),(Object)("#2962ff"));
 //BA.debugLineNum = 1313;BA.debugLine="ColorMap.put(\"light-blue lighten-5\", \"#e1f5fe\")";
_colormap.Put((Object)("light-blue lighten-5"),(Object)("#e1f5fe"));
 //BA.debugLineNum = 1314;BA.debugLine="ColorMap.put(\"light-blue lighten-4\", \"#b3e5fc\")";
_colormap.Put((Object)("light-blue lighten-4"),(Object)("#b3e5fc"));
 //BA.debugLineNum = 1315;BA.debugLine="ColorMap.put(\"light-blue lighten-3\", \"#81d4fa\")";
_colormap.Put((Object)("light-blue lighten-3"),(Object)("#81d4fa"));
 //BA.debugLineNum = 1316;BA.debugLine="ColorMap.put(\"light-blue lighten-2\", \"#4fc3f7\")";
_colormap.Put((Object)("light-blue lighten-2"),(Object)("#4fc3f7"));
 //BA.debugLineNum = 1317;BA.debugLine="ColorMap.put(\"light-blue lighten-1\", \"#29b6f6\")";
_colormap.Put((Object)("light-blue lighten-1"),(Object)("#29b6f6"));
 //BA.debugLineNum = 1318;BA.debugLine="ColorMap.put(\"light-blue\", \"#03a9f4\")";
_colormap.Put((Object)("light-blue"),(Object)("#03a9f4"));
 //BA.debugLineNum = 1319;BA.debugLine="ColorMap.put(\"light-blue darken-1\", \"#039be5\")";
_colormap.Put((Object)("light-blue darken-1"),(Object)("#039be5"));
 //BA.debugLineNum = 1320;BA.debugLine="ColorMap.put(\"light-blue darken-2\", \"#0288d1\")";
_colormap.Put((Object)("light-blue darken-2"),(Object)("#0288d1"));
 //BA.debugLineNum = 1321;BA.debugLine="ColorMap.put(\"light-blue darken-3\", \"#0277bd\")";
_colormap.Put((Object)("light-blue darken-3"),(Object)("#0277bd"));
 //BA.debugLineNum = 1322;BA.debugLine="ColorMap.put(\"light-blue darken-4\", \"#01579b\")";
_colormap.Put((Object)("light-blue darken-4"),(Object)("#01579b"));
 //BA.debugLineNum = 1323;BA.debugLine="ColorMap.put(\"light-blue accent-1\", \"#80d8ff\")";
_colormap.Put((Object)("light-blue accent-1"),(Object)("#80d8ff"));
 //BA.debugLineNum = 1324;BA.debugLine="ColorMap.put(\"light-blue accent-2\", \"#40c4ff\")";
_colormap.Put((Object)("light-blue accent-2"),(Object)("#40c4ff"));
 //BA.debugLineNum = 1325;BA.debugLine="ColorMap.put(\"light-blue accent-3\", \"#00b0ff\")";
_colormap.Put((Object)("light-blue accent-3"),(Object)("#00b0ff"));
 //BA.debugLineNum = 1326;BA.debugLine="ColorMap.put(\"light-blue accent-4\", \"#0091ea\")";
_colormap.Put((Object)("light-blue accent-4"),(Object)("#0091ea"));
 //BA.debugLineNum = 1327;BA.debugLine="ColorMap.put(\"cyan lighten-5\", \"#e0f7fa\")";
_colormap.Put((Object)("cyan lighten-5"),(Object)("#e0f7fa"));
 //BA.debugLineNum = 1328;BA.debugLine="ColorMap.put(\"cyan lighten-4\", \"#b2ebf2\")";
_colormap.Put((Object)("cyan lighten-4"),(Object)("#b2ebf2"));
 //BA.debugLineNum = 1329;BA.debugLine="ColorMap.put(\"cyan lighten-3\", \"#80deea\")";
_colormap.Put((Object)("cyan lighten-3"),(Object)("#80deea"));
 //BA.debugLineNum = 1330;BA.debugLine="ColorMap.put(\"cyan lighten-2\", \"#4dd0e1\")";
_colormap.Put((Object)("cyan lighten-2"),(Object)("#4dd0e1"));
 //BA.debugLineNum = 1331;BA.debugLine="ColorMap.put(\"cyan lighten-1\", \"#26c6da\")";
_colormap.Put((Object)("cyan lighten-1"),(Object)("#26c6da"));
 //BA.debugLineNum = 1332;BA.debugLine="ColorMap.put(\"cyan\", \"#00bcd4\")";
_colormap.Put((Object)("cyan"),(Object)("#00bcd4"));
 //BA.debugLineNum = 1333;BA.debugLine="ColorMap.put(\"cyan darken-1\", \"#00acc1\")";
_colormap.Put((Object)("cyan darken-1"),(Object)("#00acc1"));
 //BA.debugLineNum = 1334;BA.debugLine="ColorMap.put(\"cyan darken-2\", \"#0097a7\")";
_colormap.Put((Object)("cyan darken-2"),(Object)("#0097a7"));
 //BA.debugLineNum = 1335;BA.debugLine="ColorMap.put(\"cyan darken-3\", \"#00838f\")";
_colormap.Put((Object)("cyan darken-3"),(Object)("#00838f"));
 //BA.debugLineNum = 1336;BA.debugLine="ColorMap.put(\"cyan darken-4\", \"#006064\")";
_colormap.Put((Object)("cyan darken-4"),(Object)("#006064"));
 //BA.debugLineNum = 1337;BA.debugLine="ColorMap.put(\"cyan accent-1\", \"#84ffff\")";
_colormap.Put((Object)("cyan accent-1"),(Object)("#84ffff"));
 //BA.debugLineNum = 1338;BA.debugLine="ColorMap.put(\"cyan accent-2\", \"#18ffff\")";
_colormap.Put((Object)("cyan accent-2"),(Object)("#18ffff"));
 //BA.debugLineNum = 1339;BA.debugLine="ColorMap.put(\"cyan accent-3\", \"#00e5ff\")";
_colormap.Put((Object)("cyan accent-3"),(Object)("#00e5ff"));
 //BA.debugLineNum = 1340;BA.debugLine="ColorMap.put(\"cyan accent-4\", \"#00b8d4\")";
_colormap.Put((Object)("cyan accent-4"),(Object)("#00b8d4"));
 //BA.debugLineNum = 1341;BA.debugLine="ColorMap.put(\"teal lighten-5\", \"#e0f2f1\")";
_colormap.Put((Object)("teal lighten-5"),(Object)("#e0f2f1"));
 //BA.debugLineNum = 1342;BA.debugLine="ColorMap.put(\"teal lighten-4\", \"#b2dfdb\")";
_colormap.Put((Object)("teal lighten-4"),(Object)("#b2dfdb"));
 //BA.debugLineNum = 1343;BA.debugLine="ColorMap.put(\"teal lighten-3\", \"#80cbc4\")";
_colormap.Put((Object)("teal lighten-3"),(Object)("#80cbc4"));
 //BA.debugLineNum = 1344;BA.debugLine="ColorMap.put(\"teal lighten-2\", \"#4db6ac\")";
_colormap.Put((Object)("teal lighten-2"),(Object)("#4db6ac"));
 //BA.debugLineNum = 1345;BA.debugLine="ColorMap.put(\"teal lighten-1\", \"#26a69a\")";
_colormap.Put((Object)("teal lighten-1"),(Object)("#26a69a"));
 //BA.debugLineNum = 1346;BA.debugLine="ColorMap.put(\"teal\", \"#009688\")";
_colormap.Put((Object)("teal"),(Object)("#009688"));
 //BA.debugLineNum = 1347;BA.debugLine="ColorMap.put(\"teal darken-1\", \"#00897b\")";
_colormap.Put((Object)("teal darken-1"),(Object)("#00897b"));
 //BA.debugLineNum = 1348;BA.debugLine="ColorMap.put(\"teal darken-2\", \"#00796b\")";
_colormap.Put((Object)("teal darken-2"),(Object)("#00796b"));
 //BA.debugLineNum = 1349;BA.debugLine="ColorMap.put(\"teal darken-3\", \"#00695c\")";
_colormap.Put((Object)("teal darken-3"),(Object)("#00695c"));
 //BA.debugLineNum = 1350;BA.debugLine="ColorMap.put(\"teal darken-4\", \"#004d40\")";
_colormap.Put((Object)("teal darken-4"),(Object)("#004d40"));
 //BA.debugLineNum = 1351;BA.debugLine="ColorMap.put(\"teal accent-1\", \"#a7ffeb\")";
_colormap.Put((Object)("teal accent-1"),(Object)("#a7ffeb"));
 //BA.debugLineNum = 1352;BA.debugLine="ColorMap.put(\"teal accent-2\", \"#64ffda\")";
_colormap.Put((Object)("teal accent-2"),(Object)("#64ffda"));
 //BA.debugLineNum = 1353;BA.debugLine="ColorMap.put(\"teal accent-3\", \"#1de9b6\")";
_colormap.Put((Object)("teal accent-3"),(Object)("#1de9b6"));
 //BA.debugLineNum = 1354;BA.debugLine="ColorMap.put(\"teal accent-4\", \"#00bfa5\")";
_colormap.Put((Object)("teal accent-4"),(Object)("#00bfa5"));
 //BA.debugLineNum = 1355;BA.debugLine="ColorMap.put(\"green lighten-5\", \"#e8f5e9\")";
_colormap.Put((Object)("green lighten-5"),(Object)("#e8f5e9"));
 //BA.debugLineNum = 1356;BA.debugLine="ColorMap.put(\"green lighten-4\", \"#c8e6c9\")";
_colormap.Put((Object)("green lighten-4"),(Object)("#c8e6c9"));
 //BA.debugLineNum = 1357;BA.debugLine="ColorMap.put(\"green lighten-3\", \"#a5d6a7\")";
_colormap.Put((Object)("green lighten-3"),(Object)("#a5d6a7"));
 //BA.debugLineNum = 1358;BA.debugLine="ColorMap.put(\"green lighten-2\", \"#81c784\")";
_colormap.Put((Object)("green lighten-2"),(Object)("#81c784"));
 //BA.debugLineNum = 1359;BA.debugLine="ColorMap.put(\"green lighten-1\", \"#66bb6a\")";
_colormap.Put((Object)("green lighten-1"),(Object)("#66bb6a"));
 //BA.debugLineNum = 1360;BA.debugLine="ColorMap.put(\"green\", \"#4caf50\")";
_colormap.Put((Object)("green"),(Object)("#4caf50"));
 //BA.debugLineNum = 1361;BA.debugLine="ColorMap.put(\"green darken-1\", \"#43a047\")";
_colormap.Put((Object)("green darken-1"),(Object)("#43a047"));
 //BA.debugLineNum = 1362;BA.debugLine="ColorMap.put(\"green darken-2\", \"#388e3c\")";
_colormap.Put((Object)("green darken-2"),(Object)("#388e3c"));
 //BA.debugLineNum = 1363;BA.debugLine="ColorMap.put(\"green darken-3\", \"#2e7d32\")";
_colormap.Put((Object)("green darken-3"),(Object)("#2e7d32"));
 //BA.debugLineNum = 1364;BA.debugLine="ColorMap.put(\"green darken-4\", \"#1b5e20\")";
_colormap.Put((Object)("green darken-4"),(Object)("#1b5e20"));
 //BA.debugLineNum = 1365;BA.debugLine="ColorMap.put(\"green accent-1\", \"#b9f6ca\")";
_colormap.Put((Object)("green accent-1"),(Object)("#b9f6ca"));
 //BA.debugLineNum = 1366;BA.debugLine="ColorMap.put(\"green accent-2\", \"#69f0ae\")";
_colormap.Put((Object)("green accent-2"),(Object)("#69f0ae"));
 //BA.debugLineNum = 1367;BA.debugLine="ColorMap.put(\"green accent-3\", \"#00e676\")";
_colormap.Put((Object)("green accent-3"),(Object)("#00e676"));
 //BA.debugLineNum = 1368;BA.debugLine="ColorMap.put(\"green accent-4\", \"#00c853\")";
_colormap.Put((Object)("green accent-4"),(Object)("#00c853"));
 //BA.debugLineNum = 1369;BA.debugLine="ColorMap.put(\"light-green lighten-5\", \"#f1f8e9\")";
_colormap.Put((Object)("light-green lighten-5"),(Object)("#f1f8e9"));
 //BA.debugLineNum = 1370;BA.debugLine="ColorMap.put(\"light-green lighten-4\", \"#dcedc8\")";
_colormap.Put((Object)("light-green lighten-4"),(Object)("#dcedc8"));
 //BA.debugLineNum = 1371;BA.debugLine="ColorMap.put(\"light-green lighten-3\", \"#c5e1a5\")";
_colormap.Put((Object)("light-green lighten-3"),(Object)("#c5e1a5"));
 //BA.debugLineNum = 1372;BA.debugLine="ColorMap.put(\"light-green lighten-2\", \"#aed581\")";
_colormap.Put((Object)("light-green lighten-2"),(Object)("#aed581"));
 //BA.debugLineNum = 1373;BA.debugLine="ColorMap.put(\"light-green lighten-1\", \"#9ccc65\")";
_colormap.Put((Object)("light-green lighten-1"),(Object)("#9ccc65"));
 //BA.debugLineNum = 1374;BA.debugLine="ColorMap.put(\"light-green\", \"#8bc34a\")";
_colormap.Put((Object)("light-green"),(Object)("#8bc34a"));
 //BA.debugLineNum = 1375;BA.debugLine="ColorMap.put(\"light-green darken-1\", \"#7cb342\")";
_colormap.Put((Object)("light-green darken-1"),(Object)("#7cb342"));
 //BA.debugLineNum = 1376;BA.debugLine="ColorMap.put(\"light-green darken-2\", \"#689f38\")";
_colormap.Put((Object)("light-green darken-2"),(Object)("#689f38"));
 //BA.debugLineNum = 1377;BA.debugLine="ColorMap.put(\"light-green darken-3\", \"#558b2f\")";
_colormap.Put((Object)("light-green darken-3"),(Object)("#558b2f"));
 //BA.debugLineNum = 1378;BA.debugLine="ColorMap.put(\"light-green darken-4\", \"#33691e\")";
_colormap.Put((Object)("light-green darken-4"),(Object)("#33691e"));
 //BA.debugLineNum = 1379;BA.debugLine="ColorMap.put(\"light-green accent-1\", \"#ccff90\")";
_colormap.Put((Object)("light-green accent-1"),(Object)("#ccff90"));
 //BA.debugLineNum = 1380;BA.debugLine="ColorMap.put(\"light-green accent-2\", \"#b2ff59\")";
_colormap.Put((Object)("light-green accent-2"),(Object)("#b2ff59"));
 //BA.debugLineNum = 1381;BA.debugLine="ColorMap.put(\"light-green accent-3\", \"#76ff03\")";
_colormap.Put((Object)("light-green accent-3"),(Object)("#76ff03"));
 //BA.debugLineNum = 1382;BA.debugLine="ColorMap.put(\"light-green accent-4\", \"#64dd17\")";
_colormap.Put((Object)("light-green accent-4"),(Object)("#64dd17"));
 //BA.debugLineNum = 1383;BA.debugLine="ColorMap.put(\"lime lighten-5\", \"#f9fbe7\")";
_colormap.Put((Object)("lime lighten-5"),(Object)("#f9fbe7"));
 //BA.debugLineNum = 1384;BA.debugLine="ColorMap.put(\"lime lighten-4\", \"#f0f4c3\")";
_colormap.Put((Object)("lime lighten-4"),(Object)("#f0f4c3"));
 //BA.debugLineNum = 1385;BA.debugLine="ColorMap.put(\"lime lighten-3\", \"#e6ee9c\")";
_colormap.Put((Object)("lime lighten-3"),(Object)("#e6ee9c"));
 //BA.debugLineNum = 1386;BA.debugLine="ColorMap.put(\"lime lighten-2\", \"#dce775\")";
_colormap.Put((Object)("lime lighten-2"),(Object)("#dce775"));
 //BA.debugLineNum = 1387;BA.debugLine="ColorMap.put(\"lime lighten-1\", \"#d4e157\")";
_colormap.Put((Object)("lime lighten-1"),(Object)("#d4e157"));
 //BA.debugLineNum = 1388;BA.debugLine="ColorMap.put(\"lime\", \"#cddc39\")";
_colormap.Put((Object)("lime"),(Object)("#cddc39"));
 //BA.debugLineNum = 1389;BA.debugLine="ColorMap.put(\"lime darken-1\", \"#c0ca33\")";
_colormap.Put((Object)("lime darken-1"),(Object)("#c0ca33"));
 //BA.debugLineNum = 1390;BA.debugLine="ColorMap.put(\"lime darken-2\", \"#afb42b\")";
_colormap.Put((Object)("lime darken-2"),(Object)("#afb42b"));
 //BA.debugLineNum = 1391;BA.debugLine="ColorMap.put(\"lime darken-3\", \"#9e9d24\")";
_colormap.Put((Object)("lime darken-3"),(Object)("#9e9d24"));
 //BA.debugLineNum = 1392;BA.debugLine="ColorMap.put(\"lime darken-4\", \"#827717\")";
_colormap.Put((Object)("lime darken-4"),(Object)("#827717"));
 //BA.debugLineNum = 1393;BA.debugLine="ColorMap.put(\"lime accent-1\", \"#f4ff81\")";
_colormap.Put((Object)("lime accent-1"),(Object)("#f4ff81"));
 //BA.debugLineNum = 1394;BA.debugLine="ColorMap.put(\"lime accent-2\", \"#eeff41\")";
_colormap.Put((Object)("lime accent-2"),(Object)("#eeff41"));
 //BA.debugLineNum = 1395;BA.debugLine="ColorMap.put(\"lime accent-3\", \"#c6ff00\")";
_colormap.Put((Object)("lime accent-3"),(Object)("#c6ff00"));
 //BA.debugLineNum = 1396;BA.debugLine="ColorMap.put(\"lime accent-4\", \"#aeea00\")";
_colormap.Put((Object)("lime accent-4"),(Object)("#aeea00"));
 //BA.debugLineNum = 1397;BA.debugLine="ColorMap.put(\"yellow lighten-5\", \"#fffde7\")";
_colormap.Put((Object)("yellow lighten-5"),(Object)("#fffde7"));
 //BA.debugLineNum = 1398;BA.debugLine="ColorMap.put(\"yellow lighten-4\", \"#fff9c4\")";
_colormap.Put((Object)("yellow lighten-4"),(Object)("#fff9c4"));
 //BA.debugLineNum = 1399;BA.debugLine="ColorMap.put(\"yellow lighten-3\", \"#fff59d\")";
_colormap.Put((Object)("yellow lighten-3"),(Object)("#fff59d"));
 //BA.debugLineNum = 1400;BA.debugLine="ColorMap.put(\"yellow lighten-2\", \"#fff176\")";
_colormap.Put((Object)("yellow lighten-2"),(Object)("#fff176"));
 //BA.debugLineNum = 1401;BA.debugLine="ColorMap.put(\"yellow lighten-1\", \"#ffee58\")";
_colormap.Put((Object)("yellow lighten-1"),(Object)("#ffee58"));
 //BA.debugLineNum = 1402;BA.debugLine="ColorMap.put(\"yellow\", \"#ffeb3b\")";
_colormap.Put((Object)("yellow"),(Object)("#ffeb3b"));
 //BA.debugLineNum = 1403;BA.debugLine="ColorMap.put(\"yellow darken-1\", \"#fdd835\")";
_colormap.Put((Object)("yellow darken-1"),(Object)("#fdd835"));
 //BA.debugLineNum = 1404;BA.debugLine="ColorMap.put(\"yellow darken-2\", \"#fbc02d\")";
_colormap.Put((Object)("yellow darken-2"),(Object)("#fbc02d"));
 //BA.debugLineNum = 1405;BA.debugLine="ColorMap.put(\"yellow darken-3\", \"#f9a825\")";
_colormap.Put((Object)("yellow darken-3"),(Object)("#f9a825"));
 //BA.debugLineNum = 1406;BA.debugLine="ColorMap.put(\"yellow darken-4\", \"#f57f17\")";
_colormap.Put((Object)("yellow darken-4"),(Object)("#f57f17"));
 //BA.debugLineNum = 1407;BA.debugLine="ColorMap.put(\"yellow accent-1\", \"#ffff8d\")";
_colormap.Put((Object)("yellow accent-1"),(Object)("#ffff8d"));
 //BA.debugLineNum = 1408;BA.debugLine="ColorMap.put(\"yellow accent-2\", \"#ffff00\")";
_colormap.Put((Object)("yellow accent-2"),(Object)("#ffff00"));
 //BA.debugLineNum = 1409;BA.debugLine="ColorMap.put(\"yellow accent-3\", \"#ffea00\")";
_colormap.Put((Object)("yellow accent-3"),(Object)("#ffea00"));
 //BA.debugLineNum = 1410;BA.debugLine="ColorMap.put(\"yellow accent-4\", \"#ffd600\")";
_colormap.Put((Object)("yellow accent-4"),(Object)("#ffd600"));
 //BA.debugLineNum = 1411;BA.debugLine="ColorMap.put(\"amber lighten-5\", \"#fff8e1\")";
_colormap.Put((Object)("amber lighten-5"),(Object)("#fff8e1"));
 //BA.debugLineNum = 1412;BA.debugLine="ColorMap.put(\"amber lighten-4\", \"#ffecb3\")";
_colormap.Put((Object)("amber lighten-4"),(Object)("#ffecb3"));
 //BA.debugLineNum = 1413;BA.debugLine="ColorMap.put(\"amber lighten-3\", \"#ffe082\")";
_colormap.Put((Object)("amber lighten-3"),(Object)("#ffe082"));
 //BA.debugLineNum = 1414;BA.debugLine="ColorMap.put(\"amber lighten-2\", \"#ffd54f\")";
_colormap.Put((Object)("amber lighten-2"),(Object)("#ffd54f"));
 //BA.debugLineNum = 1415;BA.debugLine="ColorMap.put(\"amber lighten-1\", \"#ffca28\")";
_colormap.Put((Object)("amber lighten-1"),(Object)("#ffca28"));
 //BA.debugLineNum = 1416;BA.debugLine="ColorMap.put(\"amber\", \"#ffc107\")";
_colormap.Put((Object)("amber"),(Object)("#ffc107"));
 //BA.debugLineNum = 1417;BA.debugLine="ColorMap.put(\"amber darken-1\", \"#ffb300\")";
_colormap.Put((Object)("amber darken-1"),(Object)("#ffb300"));
 //BA.debugLineNum = 1418;BA.debugLine="ColorMap.put(\"amber darken-2\", \"#ffa000\")";
_colormap.Put((Object)("amber darken-2"),(Object)("#ffa000"));
 //BA.debugLineNum = 1419;BA.debugLine="ColorMap.put(\"amber darken-3\", \"#ff8f00\")";
_colormap.Put((Object)("amber darken-3"),(Object)("#ff8f00"));
 //BA.debugLineNum = 1420;BA.debugLine="ColorMap.put(\"amber darken-4\", \"#ff6f00\")";
_colormap.Put((Object)("amber darken-4"),(Object)("#ff6f00"));
 //BA.debugLineNum = 1421;BA.debugLine="ColorMap.put(\"amber accent-1\", \"#ffe57f\")";
_colormap.Put((Object)("amber accent-1"),(Object)("#ffe57f"));
 //BA.debugLineNum = 1422;BA.debugLine="ColorMap.put(\"amber accent-2\", \"#ffd740\")";
_colormap.Put((Object)("amber accent-2"),(Object)("#ffd740"));
 //BA.debugLineNum = 1423;BA.debugLine="ColorMap.put(\"amber accent-3\", \"#ffc400\")";
_colormap.Put((Object)("amber accent-3"),(Object)("#ffc400"));
 //BA.debugLineNum = 1424;BA.debugLine="ColorMap.put(\"amber accent-4\", \"#ffab00\")";
_colormap.Put((Object)("amber accent-4"),(Object)("#ffab00"));
 //BA.debugLineNum = 1425;BA.debugLine="ColorMap.put(\"orange lighten-5\", \"#fff3e0\")";
_colormap.Put((Object)("orange lighten-5"),(Object)("#fff3e0"));
 //BA.debugLineNum = 1426;BA.debugLine="ColorMap.put(\"orange lighten-4\", \"#ffe0b2\")";
_colormap.Put((Object)("orange lighten-4"),(Object)("#ffe0b2"));
 //BA.debugLineNum = 1427;BA.debugLine="ColorMap.put(\"orange lighten-3\", \"#ffcc80\")";
_colormap.Put((Object)("orange lighten-3"),(Object)("#ffcc80"));
 //BA.debugLineNum = 1428;BA.debugLine="ColorMap.put(\"orange lighten-2\", \"#ffb74d\")";
_colormap.Put((Object)("orange lighten-2"),(Object)("#ffb74d"));
 //BA.debugLineNum = 1429;BA.debugLine="ColorMap.put(\"orange lighten-1\", \"#ffa726\")";
_colormap.Put((Object)("orange lighten-1"),(Object)("#ffa726"));
 //BA.debugLineNum = 1430;BA.debugLine="ColorMap.put(\"orange\", \"#ff9800\")";
_colormap.Put((Object)("orange"),(Object)("#ff9800"));
 //BA.debugLineNum = 1431;BA.debugLine="ColorMap.put(\"orange darken-1\", \"#fb8c00\")";
_colormap.Put((Object)("orange darken-1"),(Object)("#fb8c00"));
 //BA.debugLineNum = 1432;BA.debugLine="ColorMap.put(\"orange darken-2\", \"#f57c00\")";
_colormap.Put((Object)("orange darken-2"),(Object)("#f57c00"));
 //BA.debugLineNum = 1433;BA.debugLine="ColorMap.put(\"orange darken-3\", \"#ef6c00\")";
_colormap.Put((Object)("orange darken-3"),(Object)("#ef6c00"));
 //BA.debugLineNum = 1434;BA.debugLine="ColorMap.put(\"orange darken-4\", \"#e65100\")";
_colormap.Put((Object)("orange darken-4"),(Object)("#e65100"));
 //BA.debugLineNum = 1435;BA.debugLine="ColorMap.put(\"orange accent-1\", \"#ffd180\")";
_colormap.Put((Object)("orange accent-1"),(Object)("#ffd180"));
 //BA.debugLineNum = 1436;BA.debugLine="ColorMap.put(\"orange accent-2\", \"#ffab40\")";
_colormap.Put((Object)("orange accent-2"),(Object)("#ffab40"));
 //BA.debugLineNum = 1437;BA.debugLine="ColorMap.put(\"orange accent-3\", \"#ff9100\")";
_colormap.Put((Object)("orange accent-3"),(Object)("#ff9100"));
 //BA.debugLineNum = 1438;BA.debugLine="ColorMap.put(\"orange accent-4\", \"#ff6d00\")";
_colormap.Put((Object)("orange accent-4"),(Object)("#ff6d00"));
 //BA.debugLineNum = 1439;BA.debugLine="ColorMap.put(\"deep-orange lighten-5\", \"#fbe9e7\")";
_colormap.Put((Object)("deep-orange lighten-5"),(Object)("#fbe9e7"));
 //BA.debugLineNum = 1440;BA.debugLine="ColorMap.put(\"deep-orange lighten-4\", \"#ffccbc\")";
_colormap.Put((Object)("deep-orange lighten-4"),(Object)("#ffccbc"));
 //BA.debugLineNum = 1441;BA.debugLine="ColorMap.put(\"deep-orange lighten-3\", \"#ffab91\")";
_colormap.Put((Object)("deep-orange lighten-3"),(Object)("#ffab91"));
 //BA.debugLineNum = 1442;BA.debugLine="ColorMap.put(\"deep-orange lighten-2\", \"#ff8a65\")";
_colormap.Put((Object)("deep-orange lighten-2"),(Object)("#ff8a65"));
 //BA.debugLineNum = 1443;BA.debugLine="ColorMap.put(\"deep-orange lighten-1\", \"#ff7043\")";
_colormap.Put((Object)("deep-orange lighten-1"),(Object)("#ff7043"));
 //BA.debugLineNum = 1444;BA.debugLine="ColorMap.put(\"deep-orange\", \"#ff5722\")";
_colormap.Put((Object)("deep-orange"),(Object)("#ff5722"));
 //BA.debugLineNum = 1445;BA.debugLine="ColorMap.put(\"deep-orange darken-1\", \"#f4511e\")";
_colormap.Put((Object)("deep-orange darken-1"),(Object)("#f4511e"));
 //BA.debugLineNum = 1446;BA.debugLine="ColorMap.put(\"deep-orange darken-2\", \"#e64a19\")";
_colormap.Put((Object)("deep-orange darken-2"),(Object)("#e64a19"));
 //BA.debugLineNum = 1447;BA.debugLine="ColorMap.put(\"deep-orange darken-3\", \"#d84315\")";
_colormap.Put((Object)("deep-orange darken-3"),(Object)("#d84315"));
 //BA.debugLineNum = 1448;BA.debugLine="ColorMap.put(\"deep-orange darken-4\", \"#bf360c\")";
_colormap.Put((Object)("deep-orange darken-4"),(Object)("#bf360c"));
 //BA.debugLineNum = 1449;BA.debugLine="ColorMap.put(\"deep-orange accent-1\", \"#ff9e80\")";
_colormap.Put((Object)("deep-orange accent-1"),(Object)("#ff9e80"));
 //BA.debugLineNum = 1450;BA.debugLine="ColorMap.put(\"deep-orange accent-2\", \"#ff6e40\")";
_colormap.Put((Object)("deep-orange accent-2"),(Object)("#ff6e40"));
 //BA.debugLineNum = 1451;BA.debugLine="ColorMap.put(\"deep-orange accent-3\", \"#ff3d00\")";
_colormap.Put((Object)("deep-orange accent-3"),(Object)("#ff3d00"));
 //BA.debugLineNum = 1452;BA.debugLine="ColorMap.put(\"deep-orange accent-4\", \"#dd2c00\")";
_colormap.Put((Object)("deep-orange accent-4"),(Object)("#dd2c00"));
 //BA.debugLineNum = 1453;BA.debugLine="ColorMap.put(\"brown lighten-5\", \"#efebe9\")";
_colormap.Put((Object)("brown lighten-5"),(Object)("#efebe9"));
 //BA.debugLineNum = 1454;BA.debugLine="ColorMap.put(\"brown lighten-4\", \"#d7ccc8\")";
_colormap.Put((Object)("brown lighten-4"),(Object)("#d7ccc8"));
 //BA.debugLineNum = 1455;BA.debugLine="ColorMap.put(\"brown lighten-3\", \"#bcaaa4\")";
_colormap.Put((Object)("brown lighten-3"),(Object)("#bcaaa4"));
 //BA.debugLineNum = 1456;BA.debugLine="ColorMap.put(\"brown lighten-2\", \"#a1887f\")";
_colormap.Put((Object)("brown lighten-2"),(Object)("#a1887f"));
 //BA.debugLineNum = 1457;BA.debugLine="ColorMap.put(\"brown lighten-1\", \"#8d6e63\")";
_colormap.Put((Object)("brown lighten-1"),(Object)("#8d6e63"));
 //BA.debugLineNum = 1458;BA.debugLine="ColorMap.put(\"brown\", \"#795548\")";
_colormap.Put((Object)("brown"),(Object)("#795548"));
 //BA.debugLineNum = 1459;BA.debugLine="ColorMap.put(\"brown darken-1\", \"#6d4c41\")";
_colormap.Put((Object)("brown darken-1"),(Object)("#6d4c41"));
 //BA.debugLineNum = 1460;BA.debugLine="ColorMap.put(\"brown darken-2\", \"#5d4037\")";
_colormap.Put((Object)("brown darken-2"),(Object)("#5d4037"));
 //BA.debugLineNum = 1461;BA.debugLine="ColorMap.put(\"brown darken-3\", \"#4e342e\")";
_colormap.Put((Object)("brown darken-3"),(Object)("#4e342e"));
 //BA.debugLineNum = 1462;BA.debugLine="ColorMap.put(\"brown darken-4\", \"#3e2723\")";
_colormap.Put((Object)("brown darken-4"),(Object)("#3e2723"));
 //BA.debugLineNum = 1463;BA.debugLine="ColorMap.put(\"grey lighten-5\", \"#fafafa\")";
_colormap.Put((Object)("grey lighten-5"),(Object)("#fafafa"));
 //BA.debugLineNum = 1464;BA.debugLine="ColorMap.put(\"grey lighten-4\", \"#f5f5f5\")";
_colormap.Put((Object)("grey lighten-4"),(Object)("#f5f5f5"));
 //BA.debugLineNum = 1465;BA.debugLine="ColorMap.put(\"grey lighten-3\", \"#eeeeee\")";
_colormap.Put((Object)("grey lighten-3"),(Object)("#eeeeee"));
 //BA.debugLineNum = 1466;BA.debugLine="ColorMap.put(\"grey lighten-2\", \"#e0e0e0\")";
_colormap.Put((Object)("grey lighten-2"),(Object)("#e0e0e0"));
 //BA.debugLineNum = 1467;BA.debugLine="ColorMap.put(\"grey lighten-1\", \"#bdbdbd\")";
_colormap.Put((Object)("grey lighten-1"),(Object)("#bdbdbd"));
 //BA.debugLineNum = 1468;BA.debugLine="ColorMap.put(\"grey\", \"#9e9e9e\")";
_colormap.Put((Object)("grey"),(Object)("#9e9e9e"));
 //BA.debugLineNum = 1469;BA.debugLine="ColorMap.put(\"grey darken-1\", \"#757575\")";
_colormap.Put((Object)("grey darken-1"),(Object)("#757575"));
 //BA.debugLineNum = 1470;BA.debugLine="ColorMap.put(\"grey darken-2\", \"#616161\")";
_colormap.Put((Object)("grey darken-2"),(Object)("#616161"));
 //BA.debugLineNum = 1471;BA.debugLine="ColorMap.put(\"grey darken-3\", \"#424242\")";
_colormap.Put((Object)("grey darken-3"),(Object)("#424242"));
 //BA.debugLineNum = 1472;BA.debugLine="ColorMap.put(\"grey darken-4\", \"#212121\")";
_colormap.Put((Object)("grey darken-4"),(Object)("#212121"));
 //BA.debugLineNum = 1473;BA.debugLine="ColorMap.put(\"blue-grey lighten-5\", \"#eceff1\")";
_colormap.Put((Object)("blue-grey lighten-5"),(Object)("#eceff1"));
 //BA.debugLineNum = 1474;BA.debugLine="ColorMap.put(\"blue-grey lighten-4\", \"#cfd8dc\")";
_colormap.Put((Object)("blue-grey lighten-4"),(Object)("#cfd8dc"));
 //BA.debugLineNum = 1475;BA.debugLine="ColorMap.put(\"blue-grey lighten-3\", \"#b0bec5\")";
_colormap.Put((Object)("blue-grey lighten-3"),(Object)("#b0bec5"));
 //BA.debugLineNum = 1476;BA.debugLine="ColorMap.put(\"blue-grey lighten-2\", \"#90a4ae\")";
_colormap.Put((Object)("blue-grey lighten-2"),(Object)("#90a4ae"));
 //BA.debugLineNum = 1477;BA.debugLine="ColorMap.put(\"blue-grey lighten-1\", \"#78909c\")";
_colormap.Put((Object)("blue-grey lighten-1"),(Object)("#78909c"));
 //BA.debugLineNum = 1478;BA.debugLine="ColorMap.put(\"blue-grey\", \"#607d8b\")";
_colormap.Put((Object)("blue-grey"),(Object)("#607d8b"));
 //BA.debugLineNum = 1479;BA.debugLine="ColorMap.put(\"blue-grey darken-1\", \"#546e7a\")";
_colormap.Put((Object)("blue-grey darken-1"),(Object)("#546e7a"));
 //BA.debugLineNum = 1480;BA.debugLine="ColorMap.put(\"blue-grey darken-2\", \"#455a64\")";
_colormap.Put((Object)("blue-grey darken-2"),(Object)("#455a64"));
 //BA.debugLineNum = 1481;BA.debugLine="ColorMap.put(\"blue-grey darken-3\", \"#37474f\")";
_colormap.Put((Object)("blue-grey darken-3"),(Object)("#37474f"));
 //BA.debugLineNum = 1482;BA.debugLine="ColorMap.put(\"blue-grey darken-4\", \"#263238\")";
_colormap.Put((Object)("blue-grey darken-4"),(Object)("#263238"));
 //BA.debugLineNum = 1483;BA.debugLine="ColorMap.put(\"black\", \"#000000\")";
_colormap.Put((Object)("black"),(Object)("#000000"));
 //BA.debugLineNum = 1484;BA.debugLine="ColorMap.put(\"white\", \"#ffffff\")";
_colormap.Put((Object)("white"),(Object)("#ffffff"));
 //BA.debugLineNum = 1485;BA.debugLine="ColorMap.put(\"transparent\", \"transparent\")";
_colormap.Put((Object)("transparent"),(Object)("transparent"));
 //BA.debugLineNum = 1486;BA.debugLine="End Sub";
return "";
}
public String  _inquotes(String _svalue) throws Exception{
 //BA.debugLineNum = 858;BA.debugLine="Public Sub InQuotes(sValue As String) As String";
 //BA.debugLineNum = 859;BA.debugLine="Return QUOTE & sValue & QUOTE";
if (true) return __c.QUOTE+_svalue+__c.QUOTE;
 //BA.debugLineNum = 860;BA.debugLine="End Sub";
return "";
}
public int  _instr(String _text,String _sfind) throws Exception{
 //BA.debugLineNum = 323;BA.debugLine="Sub InStr(Text As String, sFind As String) As Int";
 //BA.debugLineNum = 324;BA.debugLine="Return Text.tolowercase.IndexOf(sFind.tolowercase";
if (true) return _text.toLowerCase().indexOf(_sfind.toLowerCase());
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return 0;
}
public long  _instrrev(String _value,String _search) throws Exception{
 //BA.debugLineNum = 523;BA.debugLine="Sub InStrRev(value As String, search As String) As";
 //BA.debugLineNum = 524;BA.debugLine="Return value.LastIndexOf(search) + 1";
if (true) return (long) (_value.lastIndexOf(_search)+1);
 //BA.debugLineNum = 525;BA.debugLine="End Sub";
return 0L;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 355;BA.debugLine="Sub Join(delimiter As String, lst As List) As Stri";
 //BA.debugLineNum = 356;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 357;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 358;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 359;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 360;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 361;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 362;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 363;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 364;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 366;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 367;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _joinlists(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.List _lo = null;
Object _k = null;
 //BA.debugLineNum = 382;BA.debugLine="Sub JoinLists(lst As List) As List";
 //BA.debugLineNum = 383;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 384;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 385;BA.debugLine="For Each lo As List In lst";
_lo = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_lo.setObject((java.util.List)(group3.Get(index3)));
 //BA.debugLineNum = 386;BA.debugLine="For Each k As Object In lo";
{
final anywheresoftware.b4a.BA.IterableList group4 = _lo;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = group4.Get(index4);
 //BA.debugLineNum = 387;BA.debugLine="nl.Add(k)";
_nl.Add(_k);
 }
};
 }
};
 //BA.debugLineNum = 390;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 391;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _joinmaps(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.Map _mr = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 370;BA.debugLine="Sub JoinMaps(lst As List) As Map";
 //BA.debugLineNum = 371;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 372;BA.debugLine="For Each mr As Map In lst";
_mr = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
 //BA.debugLineNum = 373;BA.debugLine="For Each k As String In mr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mr.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 374;BA.debugLine="Dim v As Object = mr.Get(k)";
_v = _mr.Get((Object)(_k));
 //BA.debugLineNum = 375;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 }
};
 //BA.debugLineNum = 378;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 379;BA.debugLine="End Sub";
return null;
}
public String  _joinnonblanks(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _str = "";
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 328;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
 //BA.debugLineNum = 330;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 331;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 332;BA.debugLine="For Each str As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_str = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 333;BA.debugLine="str = str.Trim";
_str = _str.trim();
 //BA.debugLineNum = 334;BA.debugLine="If str.Length > 0 Then";
if (_str.length()>0) { 
 //BA.debugLineNum = 335;BA.debugLine="nl.Add(str)";
_nl.Add((Object)(_str));
 };
 }
};
 //BA.debugLineNum = 338;BA.debugLine="If nl.Size = 0 Then Return \"\"";
if (_nl.getSize()==0) { 
if (true) return "";};
 //BA.debugLineNum = 340;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 341;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 342;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 343;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 344;BA.debugLine="fld = nl.Get(0)";
_fld = BA.ObjectToString(_nl.Get((int) (0)));
 //BA.debugLineNum = 345;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 346;BA.debugLine="For i = 1 To nl.size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_nl.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
 //BA.debugLineNum = 347;BA.debugLine="Dim fld As String = nl.Get(i)";
_fld = BA.ObjectToString(_nl.Get(_i));
 //BA.debugLineNum = 348;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 350;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _jqueryelement(String _sid) throws Exception{
com.ab.banano.BANanoObject _bo = null;
 //BA.debugLineNum = 307;BA.debugLine="Sub JQueryElement(sid As String) As BANanoObject";
 //BA.debugLineNum = 308;BA.debugLine="sid = sid.ToLowerCase";
_sid = _sid.toLowerCase();
 //BA.debugLineNum = 309;BA.debugLine="Dim bo As BANanoObject = JQuery.Selector($\"#${sid";
_bo = new com.ab.banano.BANanoObject();
_bo = _jquery.Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(_sid))+"")));
 //BA.debugLineNum = 310;BA.debugLine="Return bo";
if (true) return _bo;
 //BA.debugLineNum = 311;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _json2list(String _strvalue) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
 //BA.debugLineNum = 721;BA.debugLine="Sub Json2List(strValue As String) As List";
 //BA.debugLineNum = 722;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 723;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 724;BA.debugLine="lst.clear";
_lst.Clear();
 //BA.debugLineNum = 725;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
 //BA.debugLineNum = 726;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 728;BA.debugLine="Try";
try { //BA.debugLineNum = 729;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 730;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
 //BA.debugLineNum = 731;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 733;BA.debugLine="Return lst";
if (true) return _lst;
 };
 //BA.debugLineNum = 735;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 663;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 664;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 665;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 666;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 667;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 668;BA.debugLine="Try";
try { //BA.debugLineNum = 669;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 670;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 671;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 673;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 675;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 677;BA.debugLine="End Sub";
return null;
}
public String  _jsonpretty(Object _m) throws Exception{
String _pretty = "";
 //BA.debugLineNum = 301;BA.debugLine="Sub JSONPretty(m As Object) As String";
 //BA.debugLineNum = 302;BA.debugLine="Dim pretty As String = BANAno.RunJavascriptMethod";
_pretty = BA.ObjectToString(_banano.RunJavascriptMethod("JSON.stringify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m,__c.Null,(Object)(4)})));
 //BA.debugLineNum = 303;BA.debugLine="Return pretty";
if (true) return _pretty;
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return "";
}
public String  _jsonsetproperty(String _sjson,anywheresoftware.b4a.objects.collections.Map _updates) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
Object _v = null;
String _sout = "";
 //BA.debugLineNum = 1124;BA.debugLine="Sub JSONSetProperty(sjson As String, updates As Ma";
 //BA.debugLineNum = 1125;BA.debugLine="Dim m As Map = BANAno.FromJson(sjson)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson((Object)(_sjson))));
 //BA.debugLineNum = 1126;BA.debugLine="For Each k As String In updates.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _updates.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1127;BA.debugLine="Dim v As Object = updates.Get(k)";
_v = _updates.Get((Object)(_k));
 //BA.debugLineNum = 1128;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1130;BA.debugLine="Dim sout As String = BANAno.ToJson(m)";
_sout = BA.ObjectToString(_banano.ToJson((Object)(_m.getObject())));
 //BA.debugLineNum = 1131;BA.debugLine="Return sout";
if (true) return _sout;
 //BA.debugLineNum = 1132;BA.debugLine="End Sub";
return "";
}
public String  _jsonvalues2lowercase(String _sjson,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
anywheresoftware.b4a.objects.collections.Map _jmap = null;
String _njson = "";
 //BA.debugLineNum = 639;BA.debugLine="Sub JSONValues2LowerCase(sJSON As String, props As";
 //BA.debugLineNum = 641;BA.debugLine="Dim jmap As Map = Json2Map(sJSON)";
_jmap = new anywheresoftware.b4a.objects.collections.Map();
_jmap = _json2map(_sjson);
 //BA.debugLineNum = 642;BA.debugLine="MapValues2LowerCase(jmap, props)";
_mapvalues2lowercase(_jmap,_props);
 //BA.debugLineNum = 643;BA.debugLine="Dim nJSON As String = Map2Json(jmap)";
_njson = _map2json(_jmap);
 //BA.debugLineNum = 644;BA.debugLine="Return nJSON";
if (true) return _njson;
 //BA.debugLineNum = 645;BA.debugLine="End Sub";
return "";
}
public String  _lcase(String _text) throws Exception{
 //BA.debugLineNum = 846;BA.debugLine="Sub LCase(Text As String) As String";
 //BA.debugLineNum = 847;BA.debugLine="Return Text.ToLowerCase";
if (true) return _text.toLowerCase();
 //BA.debugLineNum = 848;BA.debugLine="End Sub";
return "";
}
public String  _leftstring(String _text,long _llength) throws Exception{
 //BA.debugLineNum = 809;BA.debugLine="Sub LeftString(Text As String, lLength As Long)As";
 //BA.debugLineNum = 810;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
 //BA.debugLineNum = 811;BA.debugLine="Return Text.SubString2(0, lLength)";
if (true) return _text.substring((int) (0),(int) (_llength));
 //BA.debugLineNum = 812;BA.debugLine="End Sub";
return "";
}
public int  _len(String _text) throws Exception{
 //BA.debugLineNum = 528;BA.debugLine="Sub Len(Text As String) As Int";
 //BA.debugLineNum = 529;BA.debugLine="Return Text.Length";
if (true) return _text.length();
 //BA.debugLineNum = 530;BA.debugLine="End Sub";
return 0;
}
public String  _list2arrayvariable(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 619;BA.debugLine="Sub List2ArrayVariable(lst As List) As String";
 //BA.debugLineNum = 620;BA.debugLine="If lst.Size = 0 Then";
if (_lst.getSize()==0) { 
 //BA.debugLineNum = 621;BA.debugLine="Return $\"\"\"\"$";
if (true) return ("\"\"");
 };
 //BA.debugLineNum = 623;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 624;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 625;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 626;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 627;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 628;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",(Object)(_fld))+"\"");
 //BA.debugLineNum = 629;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 630;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
 //BA.debugLineNum = 631;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 632;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",(Object)(_fld))+"\"");
 //BA.debugLineNum = 633;BA.debugLine="sb.Append(\",\").Append(fld)";
_sb.Append(",").Append(_fld);
 }
};
 //BA.debugLineNum = 635;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 636;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _list2idvalue(anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
String _mv1 = "";
String _mv2 = "";
anywheresoftware.b4a.objects.collections.List _nlst = null;
anywheresoftware.b4a.objects.collections.Map _dict = null;
String _mk = "";
String _mv = "";
anywheresoftware.b4a.objects.collections.Map _nm = null;
 //BA.debugLineNum = 603;BA.debugLine="Sub List2IDValue(lst As List, mapValues As List) A";
 //BA.debugLineNum = 604;BA.debugLine="Dim mv1 As String = mapValues.get(0)";
_mv1 = BA.ObjectToString(_mapvalues.Get((int) (0)));
 //BA.debugLineNum = 605;BA.debugLine="Dim mv2 As String = mapValues.get(1)";
_mv2 = BA.ObjectToString(_mapvalues.Get((int) (1)));
 //BA.debugLineNum = 606;BA.debugLine="Dim nlst As List";
_nlst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 607;BA.debugLine="nlst.initialize";
_nlst.Initialize();
 //BA.debugLineNum = 608;BA.debugLine="For Each dict As Map In lst";
_dict = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _lst;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_dict.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
 //BA.debugLineNum = 609;BA.debugLine="Dim mk As String = dict.get(mv1)";
_mk = BA.ObjectToString(_dict.Get((Object)(_mv1)));
 //BA.debugLineNum = 610;BA.debugLine="Dim mv As String = dict.get(mv2)";
_mv = BA.ObjectToString(_dict.Get((Object)(_mv2)));
 //BA.debugLineNum = 611;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 612;BA.debugLine="nm.Put(\"id\", mk)";
_nm.Put((Object)("id"),(Object)(_mk));
 //BA.debugLineNum = 613;BA.debugLine="nm.put(\"value\", mv)";
_nm.Put((Object)("value"),(Object)(_mv));
 //BA.debugLineNum = 614;BA.debugLine="nlst.Add(nm)";
_nlst.Add((Object)(_nm.getObject()));
 }
};
 //BA.debugLineNum = 616;BA.debugLine="Return nlst";
if (true) return _nlst;
 //BA.debugLineNum = 617;BA.debugLine="End Sub";
return null;
}
public String  _list2json(anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 714;BA.debugLine="Sub List2Json(mp As List) As String";
 //BA.debugLineNum = 715;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 716;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
 //BA.debugLineNum = 717;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 718;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _list2keyvalues(anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
 //BA.debugLineNum = 598;BA.debugLine="Sub List2KeyValues(lst As List, mapvalues As List)";
 //BA.debugLineNum = 599;BA.debugLine="Return List2IDValue(lst, mapvalues)";
if (true) return _list2idvalue(_lst,_mapvalues);
 //BA.debugLineNum = 600;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2map(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
 //BA.debugLineNum = 1093;BA.debugLine="Sub List2Map(lst As List, keyName As String, value";
 //BA.debugLineNum = 1094;BA.debugLine="Return List2Options(lst, keyName, valueName)";
if (true) return _list2options(_lst,_keyname,_valuename);
 //BA.debugLineNum = 1095;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2options(anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
 //BA.debugLineNum = 1080;BA.debugLine="Sub List2Options(lst As List, keyName As String, v";
 //BA.debugLineNum = 1081;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1082;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 1083;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1084;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1085;BA.debugLine="nrec.Put(keyName, k)";
_nrec.Put((Object)(_keyname),(Object)(_k));
 //BA.debugLineNum = 1086;BA.debugLine="nrec.Put(valueName, k)";
_nrec.Put((Object)(_valuename),(Object)(_k));
 //BA.debugLineNum = 1087;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 1089;BA.debugLine="Return recs";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_recs.getObject()));
 //BA.debugLineNum = 1090;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listremoveduplicates(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nd = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _nl = null;
 //BA.debugLineNum = 196;BA.debugLine="Sub ListRemoveDuplicates(lst As List) As List";
 //BA.debugLineNum = 197;BA.debugLine="Dim nd As Map = CreateMap()";
_nd = new anywheresoftware.b4a.objects.collections.Map();
_nd = __c.createMap(new Object[] {});
 //BA.debugLineNum = 198;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 199;BA.debugLine="nd.Put(k, k)";
_nd.Put((Object)(_k),(Object)(_k));
 }
};
 //BA.debugLineNum = 201;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 202;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 203;BA.debugLine="For Each k As String In nd.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _nd.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 204;BA.debugLine="nl.Add(k)";
_nl.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 206;BA.debugLine="nl.Sort(True)";
_nl.Sort(__c.True);
 //BA.debugLineNum = 207;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public String  _longdate(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 818;BA.debugLine="Sub LongDate(sDate As String) As String";
 //BA.debugLineNum = 819;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 820;BA.debugLine="Try";
try { //BA.debugLineNum = 821;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 822;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 823;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy");
 //BA.debugLineNum = 824;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 826;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 828;BA.debugLine="End Sub";
return "";
}
public String  _longdatetime(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 830;BA.debugLine="Sub LongDateTime(sDate As String) As String";
 //BA.debugLineNum = 831;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 832;BA.debugLine="Try";
try { //BA.debugLineNum = 833;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 834;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 835;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy HH:mm\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy HH:mm");
 //BA.debugLineNum = 836;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 838;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 840;BA.debugLine="End Sub";
return "";
}
public String  _longdatetimetoday() throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 1714;BA.debugLine="Sub LongDateTimeToday() As String";
 //BA.debugLineNum = 1715;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
 //BA.debugLineNum = 1716;BA.debugLine="Dim dt As Long = DateTime.now";
_dt = __c.DateTime.getNow();
 //BA.debugLineNum = 1717;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy, HH:mm\"";
__c.DateTime.setDateFormat("dd/MM/yyyy, HH:mm");
 //BA.debugLineNum = 1718;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 //BA.debugLineNum = 1719;BA.debugLine="End Sub";
return "";
}
public String  _makeboolean(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1858;BA.debugLine="Sub MakeBoolean(m As Map, xkeys As List)";
 //BA.debugLineNum = 1859;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1860;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1861;BA.debugLine="Dim v As String = m.GetDefault(k,\"0\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("0")));
 //BA.debugLineNum = 1862;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1863;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1864;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"","0","false","False",BA.ObjectToString(__c.False),BA.NumberToString(0),"1","true","True",BA.ObjectToString(__c.True),BA.NumberToString(1))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 1866;BA.debugLine="m.Put(k, False)";
_m.Put((Object)(_k),(Object)(__c.False));
 break; }
case 6: 
case 7: 
case 8: 
case 9: 
case 10: {
 //BA.debugLineNum = 1868;BA.debugLine="m.Put(k, True)";
_m.Put((Object)(_k),(Object)(__c.True));
 break; }
}
;
 };
 }
};
 //BA.debugLineNum = 1872;BA.debugLine="End Sub";
return "";
}
public String  _makedate(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1906;BA.debugLine="Sub MakeDate(m As Map, xkeys As List)";
 //BA.debugLineNum = 1907;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1908;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1909;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1910;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1911;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1912;BA.debugLine="v = MvField(v,1,\" \")";
_v = _mvfield(_v,(int) (1)," ");
 //BA.debugLineNum = 1913;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1916;BA.debugLine="End Sub";
return "";
}
public String  _makedouble(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1845;BA.debugLine="Sub MakeDouble(m As Map, xkeys As List)";
 //BA.debugLineNum = 1846;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1847;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1848;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1849;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1850;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1851;BA.debugLine="If v = \"\" Then v = \"0\"";
if ((_v).equals("")) { 
_v = "0";};
 //BA.debugLineNum = 1852;BA.debugLine="v = BANAno.parseFloat(v)";
_v = BA.NumberToString(_banano.parseFloat((Object)(_v)));
 //BA.debugLineNum = 1853;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1856;BA.debugLine="End Sub";
return "";
}
public String  _makeinteger(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1832;BA.debugLine="Sub MakeInteger(m As Map, xkeys As List)";
 //BA.debugLineNum = 1833;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1834;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1835;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1836;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1837;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1838;BA.debugLine="If v = \"\" Then v = \"0\"";
if ((_v).equals("")) { 
_v = "0";};
 //BA.debugLineNum = 1839;BA.debugLine="v = BANAno.parseInt(v)";
_v = BA.NumberToString(_banano.parseInt((Object)(_v)));
 //BA.debugLineNum = 1840;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1843;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _makelowercase(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1896;BA.debugLine="Sub MakeLowerCase(m As Map) As Map";
 //BA.debugLineNum = 1897;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1898;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1899;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 1900;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 1901;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1903;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1904;BA.debugLine="End Sub";
return null;
}
public String  _makemoney(String _svalue) throws Exception{
 //BA.debugLineNum = 774;BA.debugLine="Sub MakeMoney(sValue As String) As String";
 //BA.debugLineNum = 775;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
if (_svalue.length()==0) { 
if (true) return "0.00";};
 //BA.debugLineNum = 776;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
if ((_svalue).equals("null")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 777;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
_svalue = _svalue.replace(",","");
 //BA.debugLineNum = 778;BA.debugLine="sValue = Val(sValue)";
_svalue = _val(_svalue);
 //BA.debugLineNum = 779;BA.debugLine="If sValue = \"0\" Then sValue = \"000\"";
if ((_svalue).equals("0")) { 
_svalue = "000";};
 //BA.debugLineNum = 780;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(__c.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
 //BA.debugLineNum = 781;BA.debugLine="Return NumberFormat2(sValue, 1, 2, 2, True)";
if (true) return __c.NumberFormat2((double)(Double.parseDouble(_svalue)),(int) (1),(int) (2),(int) (2),__c.True);
 //BA.debugLineNum = 782;BA.debugLine="End Sub";
return "";
}
public String  _makepx(String _svalue) throws Exception{
 //BA.debugLineNum = 1525;BA.debugLine="Sub MakePx(sValue As String) As String";
 //BA.debugLineNum = 1526;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
 //BA.debugLineNum = 1527;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
 //BA.debugLineNum = 1528;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vm")) { 
 //BA.debugLineNum = 1530;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("px")) { 
 //BA.debugLineNum = 1532;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("cm")) { 
 //BA.debugLineNum = 1534;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("mm")) { 
 //BA.debugLineNum = 1536;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("in")) { 
 //BA.debugLineNum = 1538;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pt")) { 
 //BA.debugLineNum = 1540;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("pc")) { 
 //BA.debugLineNum = 1542;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("em")) { 
 //BA.debugLineNum = 1544;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ex")) { 
 //BA.debugLineNum = 1546;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("ch")) { 
 //BA.debugLineNum = 1548;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("rem")) { 
 //BA.debugLineNum = 1550;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vw")) { 
 //BA.debugLineNum = 1552;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vh")) { 
 //BA.debugLineNum = 1554;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmin")) { 
 //BA.debugLineNum = 1556;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith("vmax")) { 
 //BA.debugLineNum = 1558;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else if(_svalue.endsWith(";")) { 
 //BA.debugLineNum = 1560;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
 //BA.debugLineNum = 1562;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
 //BA.debugLineNum = 1563;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+__c.SmartStringFormatter("",(Object)(_svalue))+"px");
 //BA.debugLineNum = 1564;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
 //BA.debugLineNum = 1565;BA.debugLine="Return sValue";
if (true) return _svalue;
 };
 //BA.debugLineNum = 1567;BA.debugLine="End Sub";
return "";
}
public String  _maketrim(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
String _k = "";
String _v = "";
 //BA.debugLineNum = 1885;BA.debugLine="Sub MakeTrim(m As Map, xkeys As List)";
 //BA.debugLineNum = 1886;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1887;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1888;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1889;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1890;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1891;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 1894;BA.debugLine="End Sub";
return "";
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 649;BA.debugLine="Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 650;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 651;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 652;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 653;BA.debugLine="End Sub";
return "";
}
public String  _map2jsonpretty(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 655;BA.debugLine="Sub Map2JsonPretty(mp As Map) As String";
 //BA.debugLineNum = 656;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 657;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 658;BA.debugLine="Return JSON.ToPrettyString(4)";
if (true) return _json.ToPrettyString((int) (4));
 //BA.debugLineNum = 659;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _map2options(anywheresoftware.b4a.objects.collections.Map _m,String _keyname,String _valuename) throws Exception{
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
Object _v = null;
anywheresoftware.b4a.objects.collections.Map _nrec = null;
 //BA.debugLineNum = 1098;BA.debugLine="Sub Map2Options(m As Map, keyName As String, value";
 //BA.debugLineNum = 1099;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1100;BA.debugLine="recs.Initialize";
_recs.Initialize();
 //BA.debugLineNum = 1101;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 1102;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 1103;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1104;BA.debugLine="nrec.Put(keyName, k)";
_nrec.Put((Object)(_keyname),(Object)(_k));
 //BA.debugLineNum = 1105;BA.debugLine="nrec.Put(valueName, v)";
_nrec.Put((Object)(_valuename),_v);
 //BA.debugLineNum = 1106;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
 //BA.debugLineNum = 1108;BA.debugLine="Return recs";
if (true) return _recs;
 //BA.debugLineNum = 1109;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapkeys2list(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
 //BA.debugLineNum = 395;BA.debugLine="Sub MapKeys2List(m As Map) As List";
 //BA.debugLineNum = 396;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 397;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 398;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 399;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 401;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 402;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapkeyslowercaselist(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.Map _rec = null;
 //BA.debugLineNum = 902;BA.debugLine="Sub MapKeysLowerCaseList(lst As List) As List";
 //BA.debugLineNum = 903;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 904;BA.debugLine="nl.Initialize";
_nl.Initialize();
 //BA.debugLineNum = 905;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
 //BA.debugLineNum = 906;BA.debugLine="rec = MapKeysLowerCaseSingle(rec)";
_rec = _mapkeyslowercasesingle(_rec);
 //BA.debugLineNum = 907;BA.debugLine="nl.Add(rec)";
_nl.Add((Object)(_rec.getObject()));
 }
};
 //BA.debugLineNum = 909;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 910;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _mapkeyslowercasesingle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 891;BA.debugLine="Sub MapKeysLowerCaseSingle(m As Map) As Map";
 //BA.debugLineNum = 892;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 893;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 894;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 895;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 896;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 898;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 899;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapvalues2list(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
 //BA.debugLineNum = 405;BA.debugLine="Sub MapValues2List(m As Map) As List";
 //BA.debugLineNum = 406;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 407;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 408;BA.debugLine="For Each k As String In m.values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 409;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
 //BA.debugLineNum = 411;BA.debugLine="Return lst";
if (true) return _lst;
 //BA.debugLineNum = 412;BA.debugLine="End Sub";
return null;
}
public String  _mapvalues2lowercase(anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
String _prop = "";
String _v = "";
 //BA.debugLineNum = 738;BA.debugLine="Sub MapValues2LowerCase(m As Map, props As List)";
 //BA.debugLineNum = 739;BA.debugLine="For Each prop As String In props";
{
final anywheresoftware.b4a.BA.IterableList group1 = _props;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_prop = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 740;BA.debugLine="If m.ContainsKey(prop) Then";
if (_m.ContainsKey((Object)(_prop))) { 
 //BA.debugLineNum = 741;BA.debugLine="Dim v As String = m.GetDefault(prop,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_prop),(Object)("")));
 //BA.debugLineNum = 742;BA.debugLine="v = v.tolowercase";
_v = _v.toLowerCase();
 //BA.debugLineNum = 743;BA.debugLine="m.Put(prop,v)";
_m.Put((Object)(_prop),(Object)(_v));
 };
 }
};
 //BA.debugLineNum = 746;BA.debugLine="End Sub";
return "";
}
public String  _md5hash(String _value,String _key,boolean _raw) throws Exception{
Object _res = null;
 //BA.debugLineNum = 998;BA.debugLine="Sub Md5Hash(value As String, key As String, raw As";
 //BA.debugLineNum = 999;BA.debugLine="Dim res As Object = BANAno.RunJavascriptMethod(\"m";
_res = _banano.RunJavascriptMethod("md5",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value),(Object)(_key),(Object)(_raw)}));
 //BA.debugLineNum = 1000;BA.debugLine="Return res";
if (true) return BA.ObjectToString(_res);
 //BA.debugLineNum = 1001;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _mergemaps(anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
anywheresoftware.b4a.objects.collections.Map _om = null;
String _k = "";
Object _v = null;
 //BA.debugLineNum = 1050;BA.debugLine="Sub MergeMaps(oldm As Map, newm As Map) As Map";
 //BA.debugLineNum = 1051;BA.debugLine="Dim om As Map = CreateMap()";
_om = new anywheresoftware.b4a.objects.collections.Map();
_om = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1052;BA.debugLine="For Each k As String In oldm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1053;BA.debugLine="Dim v As Object = oldm.Get(k)";
_v = _oldm.Get((Object)(_k));
 //BA.debugLineNum = 1054;BA.debugLine="om.Put(k, v)";
_om.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1057;BA.debugLine="For Each k As String In newm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _newm.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 1058;BA.debugLine="Dim v As Object = newm.Get(k)";
_v = _newm.Get((Object)(_k));
 //BA.debugLineNum = 1059;BA.debugLine="om.Put(k, v)";
_om.Put((Object)(_k),_v);
 }
};
 //BA.debugLineNum = 1061;BA.debugLine="Return om";
if (true) return _om;
 //BA.debugLineNum = 1062;BA.debugLine="End Sub";
return null;
}
public String  _midstring(String _text,int _start,int _llength) throws Exception{
 //BA.debugLineNum = 796;BA.debugLine="Sub MidString(Text As String, Start As Int, lLengt";
 //BA.debugLineNum = 797;BA.debugLine="Return Text.SubString2(Start-1,Start+lLength-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_llength-1));
 //BA.debugLineNum = 798;BA.debugLine="End Sub";
return "";
}
public String  _midstring2(String _text,int _start) throws Exception{
 //BA.debugLineNum = 800;BA.debugLine="Sub MidString2(Text As String, Start As Int) As St";
 //BA.debugLineNum = 801;BA.debugLine="Return Text.SubString(Start-1)";
if (true) return _text.substring((int) (_start-1));
 //BA.debugLineNum = 802;BA.debugLine="End Sub";
return "";
}
public int  _mvcount(String _strmv,String _delimiter) throws Exception{
String[] _spvalues = null;
 //BA.debugLineNum = 1624;BA.debugLine="Sub MvCount(strMV As String, Delimiter As String)";
 //BA.debugLineNum = 1625;BA.debugLine="Dim spValues() As String = BANAno.Split(Delimiter";
_spvalues = _banano.Split(_delimiter,_strmv);
 //BA.debugLineNum = 1626;BA.debugLine="Return spValues.Length";
if (true) return _spvalues.length;
 //BA.debugLineNum = 1627;BA.debugLine="End Sub";
return 0;
}
public String  _mvfield(String _svalue,int _iposition,String _delimiter) throws Exception{
int _xpos = 0;
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
 //BA.debugLineNum = 2027;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
 //BA.debugLineNum = 2028;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 2029;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
 //BA.debugLineNum = 2030;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
 //BA.debugLineNum = 2031;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
_mvalues = _strparse(_delimiter,_svalue);
 //BA.debugLineNum = 2032;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
 //BA.debugLineNum = 2033;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
 //BA.debugLineNum = 2034;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
 //BA.debugLineNum = 2036;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 break; }
case 1: {
 //BA.debugLineNum = 2038;BA.debugLine="Return mValues.get(tValues - 1)";
if (true) return BA.ObjectToString(_mvalues.Get((int) (_tvalues-1)));
 break; }
case 2: {
 //BA.debugLineNum = 2040;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 2041;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 2042;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
 //BA.debugLineNum = 2043;BA.debugLine="sb.Append(mValues.Get(1))";
_sb.Append(BA.ObjectToString(_mvalues.Get((int) (1))));
 //BA.debugLineNum = 2044;BA.debugLine="For startcnt = 2 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (2) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
 //BA.debugLineNum = 2045;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
 //BA.debugLineNum = 2046;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
 //BA.debugLineNum = 2048;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
 //BA.debugLineNum = 2050;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
 //BA.debugLineNum = 2051;BA.debugLine="If iPosition <= -1 Then";
if (_iposition<=-1) { 
 //BA.debugLineNum = 2052;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
 //BA.debugLineNum = 2054;BA.debugLine="If iPosition > tValues Then";
if (_iposition>_tvalues) { 
 //BA.debugLineNum = 2055;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 2057;BA.debugLine="Return mValues.get(iPosition)";
if (true) return BA.ObjectToString(_mvalues.Get(_iposition));
 break; }
}
;
 //BA.debugLineNum = 2059;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _newdate(int _year,int _month,int _day) throws Exception{
com.ab.banano.BANanoObject _dd = null;
 //BA.debugLineNum = 679;BA.debugLine="Sub NewDate(year As Int, month As Int, day As Int)";
 //BA.debugLineNum = 680;BA.debugLine="Dim dd As BANanoObject";
_dd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 681;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day))";
_dd.Initialize2("Date",(Object)(new Object[]{(Object)(_year),(Object)(_month),(Object)(_day)}));
 //BA.debugLineNum = 682;BA.debugLine="Return dd";
if (true) return _dd;
 //BA.debugLineNum = 683;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _newdatetime(int _year,int _month,int _day,int _hour,int _minute) throws Exception{
com.ab.banano.BANanoObject _dd = null;
 //BA.debugLineNum = 685;BA.debugLine="Sub NewDateTime(year As Int, month As Int, day As";
 //BA.debugLineNum = 686;BA.debugLine="Dim dd As BANanoObject";
_dd = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 687;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day, ho";
_dd.Initialize2("Date",(Object)(new Object[]{(Object)(_year),(Object)(_month),(Object)(_day),(Object)(_hour),(Object)(_minute)}));
 //BA.debugLineNum = 688;BA.debugLine="Return dd";
if (true) return _dd;
 //BA.debugLineNum = 689;BA.debugLine="End Sub";
return null;
}
public String  _numbersuffix(double _n) throws Exception{
String[] _suffix = null;
int _thousands = 0;
int _maxdecimalplaces = 0;
double _relativeerror = 0;
 //BA.debugLineNum = 748;BA.debugLine="Sub NumberSuffix(N As Double) As String";
 //BA.debugLineNum = 749;BA.debugLine="If N < 0 Then";
if (_n<0) { 
 //BA.debugLineNum = 750;BA.debugLine="Return \"-\" & NumberSuffix(-N)";
if (true) return "-"+_numbersuffix(-_n);
 };
 //BA.debugLineNum = 752;BA.debugLine="Dim Suffix() As String = Array As String(\"\", \"k\",";
_suffix = new String[]{"","k","M","B","T"};
 //BA.debugLineNum = 753;BA.debugLine="Dim Thousands As Int = 0";
_thousands = (int) (0);
 //BA.debugLineNum = 754;BA.debugLine="Do While N >= 1000 And Thousands < Suffix.Length";
while (_n>=1000 && _thousands<_suffix.length-1) {
 //BA.debugLineNum = 755;BA.debugLine="Thousands = Thousands + 1";
_thousands = (int) (_thousands+1);
 //BA.debugLineNum = 756;BA.debugLine="N = N / 1000";
_n = _n/(double)1000;
 }
;
 //BA.debugLineNum = 758;BA.debugLine="If Thousands = 0 Then";
if (_thousands==0) { 
 //BA.debugLineNum = 759;BA.debugLine="Return NumberFormat2(N, 1, 2, 2, False)";
if (true) return __c.NumberFormat2(_n,(int) (1),(int) (2),(int) (2),__c.False);
 };
 //BA.debugLineNum = 762;BA.debugLine="Dim MaxDecimalPlaces As Int = 0";
_maxdecimalplaces = (int) (0);
 //BA.debugLineNum = 763;BA.debugLine="Do While MaxDecimalPlaces < 5";
while (_maxdecimalplaces<5) {
 //BA.debugLineNum = 764;BA.debugLine="Dim RelativeError As Double = Abs(N - Round2(N,";
_relativeerror = __c.Abs(_n-__c.Round2(_n,_maxdecimalplaces))/(double)_n;
 //BA.debugLineNum = 765;BA.debugLine="If RelativeError < 0.007 Then";
if (_relativeerror<0.007) { 
 //BA.debugLineNum = 766;BA.debugLine="Exit";
if (true) break;
 };
 //BA.debugLineNum = 768;BA.debugLine="MaxDecimalPlaces = MaxDecimalPlaces + 1";
_maxdecimalplaces = (int) (_maxdecimalplaces+1);
 }
;
 //BA.debugLineNum = 770;BA.debugLine="Return NumberFormat2(N, 1, 0, MaxDecimalPlaces, F";
if (true) return __c.NumberFormat2(_n,(int) (1),(int) (0),_maxdecimalplaces,__c.False)+_suffix[_thousands];
 //BA.debugLineNum = 771;BA.debugLine="End Sub";
return "";
}
public String  _pad(String _value,int _maxlen,String _padchar,boolean _right) throws Exception{
int _intordnolen = 0;
int _i = 0;
 //BA.debugLineNum = 691;BA.debugLine="Sub Pad(Value As String, MaxLen As Int, PadChar As";
 //BA.debugLineNum = 692;BA.debugLine="Dim  intOrdNoLen As Int = Value.Length";
_intordnolen = _value.length();
 //BA.debugLineNum = 693;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 694;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step3 = 1;
final int limit3 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
 //BA.debugLineNum = 695;BA.debugLine="If right Then";
if (_right) { 
 //BA.debugLineNum = 696;BA.debugLine="Value =  Value & PadChar";
_value = _value+_padchar;
 }else {
 //BA.debugLineNum = 698;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 };
 }
};
 //BA.debugLineNum = 701;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 702;BA.debugLine="End Sub";
return "";
}
public String  _padright(String _value,int _maxlen,String _padchar) throws Exception{
int _intordnolen = 0;
int _i = 0;
 //BA.debugLineNum = 533;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
 //BA.debugLineNum = 534;BA.debugLine="Value = CStr(Value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 535;BA.debugLine="Dim intOrdNoLen As Int = Len(Value)";
_intordnolen = _len(_value);
 //BA.debugLineNum = 536;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 537;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step4 = 1;
final int limit4 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
 //BA.debugLineNum = 538;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 }
};
 //BA.debugLineNum = 540;BA.debugLine="Return Value";
if (true) return _value;
 //BA.debugLineNum = 541;BA.debugLine="End Sub";
return "";
}
public String  _percentage(String _svalue) throws Exception{
 //BA.debugLineNum = 784;BA.debugLine="Sub Percentage(sValue As String) As String";
 //BA.debugLineNum = 785;BA.debugLine="If sValue = \"\" Then sValue = \"0.00\"";
if ((_svalue).equals("")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 786;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
if (_svalue.length()==0) { 
if (true) return "0.00";};
 //BA.debugLineNum = 787;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
if ((_svalue).equals("null")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 788;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
_svalue = _svalue.replace(",","");
 //BA.debugLineNum = 789;BA.debugLine="sValue = Val(sValue)";
_svalue = _val(_svalue);
 //BA.debugLineNum = 790;BA.debugLine="If sValue = \"0\" Then sValue = \"0.00\"";
if ((_svalue).equals("0")) { 
_svalue = "0.00";};
 //BA.debugLineNum = 791;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(__c.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
 //BA.debugLineNum = 792;BA.debugLine="sValue = sValue & \"%\"";
_svalue = _svalue+"%";
 //BA.debugLineNum = 793;BA.debugLine="Return sValue";
if (true) return _svalue;
 //BA.debugLineNum = 794;BA.debugLine="End Sub";
return "";
}
public String  _priorityrag(int _dvalue) throws Exception{
 //BA.debugLineNum = 2567;BA.debugLine="Public Sub PriorityRAG(dValue As Int) As String";
 //BA.debugLineNum = 2568;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2570;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
 //BA.debugLineNum = 2572;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 2574;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
 //BA.debugLineNum = 2576;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 2578;BA.debugLine="End Sub";
return "";
}
public String  _progressrag(double _dvariance) throws Exception{
 //BA.debugLineNum = 2530;BA.debugLine="Public Sub ProgressRAG(dVariance As Double) As Str";
 //BA.debugLineNum = 2531;BA.debugLine="If dVariance < 0 Then";
if (_dvariance<0) { 
 //BA.debugLineNum = 2532;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else if(_dvariance>0) { 
 //BA.debugLineNum = 2534;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else if(_dvariance==0) { 
 //BA.debugLineNum = 2536;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
 //BA.debugLineNum = 2538;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 };
 //BA.debugLineNum = 2540;BA.debugLine="End Sub";
return "";
}
public int  _progressstatus(int _dvalue) throws Exception{
 //BA.debugLineNum = 2663;BA.debugLine="Public Sub ProgressStatus(dValue As Int) As Int";
 //BA.debugLineNum = 2664;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
 //BA.debugLineNum = 2666;BA.debugLine="Return 1";
if (true) return (int) (1);
 break; }
default: {
 //BA.debugLineNum = 2668;BA.debugLine="Return 0";
if (true) return (int) (0);
 break; }
}
;
 //BA.debugLineNum = 2670;BA.debugLine="End Sub";
return 0;
}
public String  _projectdate(String _sdate) throws Exception{
long _dt = 0L;
 //BA.debugLineNum = 492;BA.debugLine="Sub ProjectDate(sDate As String) As String";
 //BA.debugLineNum = 493;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 494;BA.debugLine="Try";
try { //BA.debugLineNum = 495;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
 //BA.debugLineNum = 496;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
 //BA.debugLineNum = 497;BA.debugLine="DateTime.DateFormat = \"dd-MMM-yyyy, EEE\"";
__c.DateTime.setDateFormat("dd-MMM-yyyy, EEE");
 //BA.debugLineNum = 498;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 500;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 502;BA.debugLine="End Sub";
return "";
}
public String  _projectdays(String _sdays) throws Exception{
 //BA.debugLineNum = 480;BA.debugLine="Sub ProjectDays(sDays As String) As String";
 //BA.debugLineNum = 481;BA.debugLine="Try";
try { //BA.debugLineNum = 482;BA.debugLine="sDays = sDays.trim";
_sdays = _sdays.trim();
 //BA.debugLineNum = 483;BA.debugLine="If sDays = \"\" Then sDays = \"0\"";
if ((_sdays).equals("")) { 
_sdays = "0";};
 //BA.debugLineNum = 484;BA.debugLine="sDays = sDays.Replace(\",\",\"\")";
_sdays = _sdays.replace(",","");
 //BA.debugLineNum = 485;BA.debugLine="sDays = NumberFormat2(sDays,0,0,0,True)";
_sdays = __c.NumberFormat2((double)(Double.parseDouble(_sdays)),(int) (0),(int) (0),(int) (0),__c.True);
 //BA.debugLineNum = 486;BA.debugLine="Return sDays & \" Dys\"";
if (true) return _sdays+" Dys";
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 488;BA.debugLine="Return \"0 Dys\"";
if (true) return "0 Dys";
 };
 //BA.debugLineNum = 490;BA.debugLine="End Sub";
return "";
}
public String  _propercase(String _mystr) throws Exception{
String _x = "";
int _j = 0;
int _k = 0;
 //BA.debugLineNum = 862;BA.debugLine="Sub ProperCase(myStr As String) As String";
 //BA.debugLineNum = 863;BA.debugLine="Try";
try { //BA.debugLineNum = 864;BA.debugLine="If myStr.trim.length = 0 Then Return \"\"";
if (_mystr.trim().length()==0) { 
if (true) return "";};
 //BA.debugLineNum = 865;BA.debugLine="Dim x As String";
_x = "";
 //BA.debugLineNum = 866;BA.debugLine="Dim j, k As Int";
_j = 0;
_k = 0;
 //BA.debugLineNum = 867;BA.debugLine="myStr = myStr.tolowercase";
_mystr = _mystr.toLowerCase();
 //BA.debugLineNum = 868;BA.debugLine="x = myStr.ToUpperCase.CharAt(0)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (0)));
 //BA.debugLineNum = 869;BA.debugLine="myStr = x & myStr.SubString2(1, myStr.Length)";
_mystr = _x+_mystr.substring((int) (1),_mystr.length());
 //BA.debugLineNum = 870;BA.debugLine="For j = 1 To myStr.Length";
{
final int step8 = 1;
final int limit8 = _mystr.length();
_j = (int) (1) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
 //BA.debugLineNum = 871;BA.debugLine="k = myStr.IndexOf2(\" \", j + 1)";
_k = _mystr.indexOf(" ",(int) (_j+1));
 //BA.debugLineNum = 872;BA.debugLine="If k = -1 Then Exit";
if (_k==-1) { 
if (true) break;};
 //BA.debugLineNum = 873;BA.debugLine="x = myStr.ToUpperCase.CharAt(k + 1)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (_k+1)));
 //BA.debugLineNum = 874;BA.debugLine="myStr = myStr.SubString2(0, k + 1) & x & myStr.";
_mystr = _mystr.substring((int) (0),(int) (_k+1))+_x+_mystr.substring((int) (_k+2),_mystr.length());
 }
};
 //BA.debugLineNum = 876;BA.debugLine="Return myStr";
if (true) return _mystr;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 878;BA.debugLine="Return myStr";
if (true) return _mystr;
 };
 //BA.debugLineNum = 880;BA.debugLine="End Sub";
return "";
}
public String  _rag(int _dvalue) throws Exception{
 //BA.debugLineNum = 2580;BA.debugLine="Public Sub RAG(dValue As Int) As String";
 //BA.debugLineNum = 2581;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2583;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 2585;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 2587;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 2589;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 2591;BA.debugLine="End Sub";
return "";
}
public String  _ramovefromlist(anywheresoftware.b4a.objects.collections.List _listx,String _item) throws Exception{
int _li = 0;
 //BA.debugLineNum = 2069;BA.debugLine="Sub RamoveFromList(listX As List, item As String)";
 //BA.debugLineNum = 2070;BA.debugLine="Dim li As Int = listX.IndexOf(item)";
_li = _listx.IndexOf((Object)(_item));
 //BA.debugLineNum = 2071;BA.debugLine="If li >= 0 Then listX.RemoveAt(li)";
if (_li>=0) { 
_listx.RemoveAt(_li);};
 //BA.debugLineNum = 2072;BA.debugLine="End Sub";
return "";
}
public Object  _randlistvalue(anywheresoftware.b4a.objects.collections.List _listx) throws Exception{
 //BA.debugLineNum = 2063;BA.debugLine="Sub RandListValue(ListX As List) As Object";
 //BA.debugLineNum = 2064;BA.debugLine="ShuffleList(ListX)";
_shufflelist(_listx);
 //BA.debugLineNum = 2065;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
if (true) return _listx.Get(__c.Rnd((int) (0),(int) (_listx.getSize()-1)));
 //BA.debugLineNum = 2066;BA.debugLine="End Sub";
return null;
}
public String  _replacestring(String _text,String _sfind,String _sreplacewith) throws Exception{
 //BA.debugLineNum = 814;BA.debugLine="Sub ReplaceString(Text As String, sFind As String,";
 //BA.debugLineNum = 815;BA.debugLine="Return Text.Replace(sFind, sReplaceWith)";
if (true) return _text.replace(_sfind,_sreplacewith);
 //BA.debugLineNum = 816;BA.debugLine="End Sub";
return "";
}
public String  _rightstring(String _text,long _llength) throws Exception{
 //BA.debugLineNum = 804;BA.debugLine="Sub RightString(Text As String, lLength As Long) A";
 //BA.debugLineNum = 805;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
 //BA.debugLineNum = 806;BA.debugLine="Return Text.SubString(Text.Length-lLength)";
if (true) return _text.substring((int) (_text.length()-_llength));
 //BA.debugLineNum = 807;BA.debugLine="End Sub";
return "";
}
public String  _rsaidnumber2dateofbirth(String _rsaid) throws Exception{
String _yymmdd = "";
String _yy = "";
String _mm = "";
String _dd = "";
 //BA.debugLineNum = 416;BA.debugLine="Sub RSAIDNumber2DateOfBirth(rsaID As String) As St";
 //BA.debugLineNum = 418;BA.debugLine="If rsaID.length = 13 Then";
if (_rsaid.length()==13) { 
 //BA.debugLineNum = 419;BA.debugLine="Dim yymmdd As String = LeftString(rsaID, 6)";
_yymmdd = _leftstring(_rsaid,(long) (6));
 //BA.debugLineNum = 420;BA.debugLine="Dim yy As String = LeftString(yymmdd,2)";
_yy = _leftstring(_yymmdd,(long) (2));
 //BA.debugLineNum = 421;BA.debugLine="Dim mm As String = MidString(yymmdd,3,2)";
_mm = _midstring(_yymmdd,(int) (3),(int) (2));
 //BA.debugLineNum = 422;BA.debugLine="Dim dd As String = RightString(yymmdd,2)";
_dd = _rightstring(_yymmdd,(long) (2));
 //BA.debugLineNum = 423;BA.debugLine="yymmdd = $\"19${yy}-${mm}-${dd}\"$";
_yymmdd = ("19"+__c.SmartStringFormatter("",(Object)(_yy))+"-"+__c.SmartStringFormatter("",(Object)(_mm))+"-"+__c.SmartStringFormatter("",(Object)(_dd))+"");
 //BA.debugLineNum = 424;BA.debugLine="Return yymmdd";
if (true) return _yymmdd;
 }else {
 //BA.debugLineNum = 426;BA.debugLine="Return \"\"";
if (true) return "";
 };
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _runmethod(String _methodname,Object _params) throws Exception{
 //BA.debugLineNum = 1948;BA.debugLine="Sub RunMethod(methodName As String, params As Obje";
 //BA.debugLineNum = 1949;BA.debugLine="Return BOVue.RunMethod(methodName, params)";
if (true) return _bovue.RunMethod(_methodname,_params);
 //BA.debugLineNum = 1950;BA.debugLine="End Sub";
return null;
}
public String  _savetext2file(String _content,String _filename) throws Exception{
anywheresoftware.b4a.objects.collections.List _fc = null;
com.ab.banano.BANanoObject _blob = null;
 //BA.debugLineNum = 1614;BA.debugLine="Sub SaveText2File(content As String, fileName As S";
 //BA.debugLineNum = 1615;BA.debugLine="Dim fc As List";
_fc = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1616;BA.debugLine="fc.Initialize";
_fc.Initialize();
 //BA.debugLineNum = 1617;BA.debugLine="fc.Add(content)";
_fc.Add((Object)(_content));
 //BA.debugLineNum = 1618;BA.debugLine="Dim blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 1619;BA.debugLine="blob.Initialize2(\"Blob\",Array(fc, CreateMap(\"type";
_blob.Initialize2("Blob",(Object)(new Object[]{(Object)(_fc.getObject()),(Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("text/plain;charset=utf-8")}).getObject())}));
 //BA.debugLineNum = 1620;BA.debugLine="BANAno.RunJavascriptMethod(\"saveAs\",Array(blob,fi";
_banano.RunJavascriptMethod("saveAs",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_blob.getObject()),(Object)(_filename)}));
 //BA.debugLineNum = 1621;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setactivated(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2216;BA.debugLine="Sub SetActivated(module As Object, methodName As S";
 //BA.debugLineNum = 2217;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2218;BA.debugLine="activated = BANAno.CallBack(module, methodName, N";
_activated.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2219;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2220;BA.debugLine="End Sub";
return null;
}
public String  _setbackgroundimage(String _elid,String _url) throws Exception{
 //BA.debugLineNum = 1112;BA.debugLine="Sub SetBackgroundImage(elid As String, url As Stri";
 //BA.debugLineNum = 1113;BA.debugLine="BANAno.GetElement(elid).SetStyle(BANAno.ToJson(Cr";
_banano.GetElement(_elid).SetStyle(BA.ObjectToString(_banano.ToJson((Object)(__c.createMap(new Object[] {(Object)("background-image"),(Object)(("url('"+__c.SmartStringFormatter("",(Object)(_url))+"')")),(Object)("background-size"),(Object)("100% 100%")}).getObject()))));
 //BA.debugLineNum = 1114;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setbeforecreate(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2261;BA.debugLine="Sub SetBeforeCreate(module As Object, methodName A";
 //BA.debugLineNum = 2262;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2263;BA.debugLine="beforeCreate = BANAno.CallBack(module, methodName";
_beforecreate.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2264;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2265;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforedestroy(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2253;BA.debugLine="Sub SetBeforeDestroy(module As Object, methodName";
 //BA.debugLineNum = 2254;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2255;BA.debugLine="beforeDestroy = BANAno.CallBack(module, methodNam";
_beforedestroy.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2256;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2257;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforemount(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2239;BA.debugLine="Sub SetBeforeMount(module As Object, methodName As";
 //BA.debugLineNum = 2240;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2241;BA.debugLine="beforeMount = BANAno.CallBack(module, methodName,";
_beforemount.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2242;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2243;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforeupdate(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2246;BA.debugLine="Sub SetBeforeUpdate(module As Object, methodName A";
 //BA.debugLineNum = 2247;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2248;BA.debugLine="beforeMount = BANAno.CallBack(module, methodName,";
_beforemount.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2249;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2250;BA.debugLine="End Sub";
return null;
}
public String  _setcallback(String _methodname,com.ab.banano.BANanoObject _cb) throws Exception{
 //BA.debugLineNum = 2286;BA.debugLine="Sub SetCallBack(methodName As String, cb As BANano";
 //BA.debugLineNum = 2287;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2288;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 //BA.debugLineNum = 2289;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setcloak(boolean _b) throws Exception{
 //BA.debugLineNum = 1159;BA.debugLine="Sub SetCloak(b As Boolean) As BANanoVue";
 //BA.debugLineNum = 1160;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
 //BA.debugLineNum = 1161;BA.debugLine="Template.SetAttr(\"v-cloak\",\"true\")";
_template._setattr /*b4j.example.vuehtml*/ ("v-cloak","true");
 //BA.debugLineNum = 1162;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1163;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setcomputed(String _k,Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2292;BA.debugLine="Sub SetComputed(k As String, module As Object, met";
 //BA.debugLineNum = 2293;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2294;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 2295;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 2296;BA.debugLine="If data.ContainsKey(k) Then";
if (_data.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2297;BA.debugLine="SetStateSingle(k, Null)";
_setstatesingle(_k,__c.Null);
 };
 //BA.debugLineNum = 2299;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2300;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2301;BA.debugLine="computed.Put(k, cb)";
_computed.Put((Object)(_k),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 2303;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2304;BA.debugLine="End Sub";
return null;
}
public String  _setcoverimage(String _imgurl) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _sjson = "";
 //BA.debugLineNum = 2099;BA.debugLine="Sub SetCoverImage(imgURL As String)";
 //BA.debugLineNum = 2100;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2101;BA.debugLine="If imgURL = \"none\" Then";
if ((_imgurl).equals("none")) { 
 //BA.debugLineNum = 2102;BA.debugLine="opt.Put(\"background-image\", \"none\")";
_opt.Put((Object)("background-image"),(Object)("none"));
 }else {
 //BA.debugLineNum = 2110;BA.debugLine="opt.Put(\"background\", $\"url('${imgURL}')\"$)";
_opt.Put((Object)("background"),(Object)(("url('"+__c.SmartStringFormatter("",(Object)(_imgurl))+"')")));
 //BA.debugLineNum = 2111;BA.debugLine="opt.Put(\"position\", \"absolute\")";
_opt.Put((Object)("position"),(Object)("absolute"));
 //BA.debugLineNum = 2112;BA.debugLine="opt.Put(\"height\", \"100%\")";
_opt.Put((Object)("height"),(Object)("100%"));
 //BA.debugLineNum = 2113;BA.debugLine="opt.Put(\"width\", \"100%\")";
_opt.Put((Object)("width"),(Object)("100%"));
 //BA.debugLineNum = 2114;BA.debugLine="opt.Put(\"top\", \"0\")";
_opt.Put((Object)("top"),(Object)("0"));
 //BA.debugLineNum = 2115;BA.debugLine="opt.Put(\"bottom\", \"0\")";
_opt.Put((Object)("bottom"),(Object)("0"));
 //BA.debugLineNum = 2116;BA.debugLine="opt.Put(\"right\", \"0\")";
_opt.Put((Object)("right"),(Object)("0"));
 //BA.debugLineNum = 2117;BA.debugLine="opt.Put(\"left\", \"0\")";
_opt.Put((Object)("left"),(Object)("0"));
 //BA.debugLineNum = 2118;BA.debugLine="opt.Put(\"z-index\", \"0\")";
_opt.Put((Object)("z-index"),(Object)("0"));
 };
 //BA.debugLineNum = 2120;BA.debugLine="Dim sjson As String = BANAno.ToJson(opt)";
_sjson = BA.ObjectToString(_banano.ToJson((Object)(_opt.getObject())));
 //BA.debugLineNum = 2121;BA.debugLine="body.SetStyle(sjson)";
_body.SetStyle(_sjson);
 //BA.debugLineNum = 2122;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setcreated(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2269;BA.debugLine="Sub SetCreated(module As Object, methodName As Str";
 //BA.debugLineNum = 2270;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2271;BA.debugLine="created = BANAno.CallBack(module, methodName, Nul";
_created.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2272;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2273;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setdeactivated(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2224;BA.debugLine="Sub SetDeActivated(module As Object, methodName As";
 //BA.debugLineNum = 2225;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2226;BA.debugLine="deactivated = BANAno.CallBack(module, methodName,";
_deactivated.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2227;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2228;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setdestroyed(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2208;BA.debugLine="Sub SetDestroyed(module As Object, methodName As S";
 //BA.debugLineNum = 2209;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2210;BA.debugLine="destroyed = BANAno.CallBack(module, methodName, N";
_destroyed.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2211;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2212;BA.debugLine="End Sub";
return null;
}
public String  _setdisabledstate(String _k,boolean _v) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 1045;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
 //BA.debugLineNum = 1046;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
 //BA.debugLineNum = 1047;BA.debugLine="SetStateSingle(disKey, v)";
_setstatesingle(_diskey,(Object)(_v));
 //BA.debugLineNum = 1048;BA.debugLine="End Sub";
return "";
}
public String  _seterrorstate(String _k,boolean _v) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 1039;BA.debugLine="Sub SetErrorState(k As String, v As Boolean)";
 //BA.debugLineNum = 1040;BA.debugLine="Dim showKey As String = $\"${k}error\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"error");
 //BA.debugLineNum = 1041;BA.debugLine="SetStateSingle(showKey, v)";
_setstatesingle(_showkey,(Object)(_v));
 //BA.debugLineNum = 1042;BA.debugLine="End Sub";
return "";
}
public String  _setfontfamily(Object _ff) throws Exception{
 //BA.debugLineNum = 2094;BA.debugLine="Sub SetFontFamily(ff As Object)";
 //BA.debugLineNum = 2095;BA.debugLine="body.SetStyle(BANAno.ToJson(CreateMap(\"font-famil";
_body.SetStyle(BA.ObjectToString(_banano.ToJson((Object)(__c.createMap(new Object[] {(Object)("font-family"),_ff}).getObject()))));
 //BA.debugLineNum = 2096;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setmethod(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2276;BA.debugLine="Sub SetMethod(module As Object, methodName As Stri";
 //BA.debugLineNum = 2277;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2278;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 2279;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
 //BA.debugLineNum = 2280;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
 //BA.debugLineNum = 2281;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 2283;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2284;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setmounted(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2200;BA.debugLine="Sub SetMounted(module As Object, methodName As Str";
 //BA.debugLineNum = 2201;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2202;BA.debugLine="mounted = BANAno.CallBack(module, methodName, Nul";
_mounted.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2203;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2204;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setnexttick(Object _module,String _methodname) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 2306;BA.debugLine="Sub SetNextTick(module As Object, methodName As St";
 //BA.debugLineNum = 2307;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2308;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2309;BA.debugLine="BOVue.RunMethod(\"nextTick\", cb)";
_bovue.RunMethod("nextTick",(Object)(_cb.getObject()));
 //BA.debugLineNum = 2310;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2311;BA.debugLine="End Sub";
return null;
}
public String  _setoptionbo(String _optionname,com.ab.banano.BANanoObject _optionobject) throws Exception{
 //BA.debugLineNum = 1629;BA.debugLine="Sub SetOptionBO(optionName As String, optionObject";
 //BA.debugLineNum = 1630;BA.debugLine="Options.Put(optionName, optionObject)";
_options.Put((Object)(_optionname),(Object)(_optionobject.getObject()));
 //BA.debugLineNum = 1631;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _setprefix(String _prefix,anywheresoftware.b4a.objects.collections.Map _target) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _mk = "";
Object _mv = null;
String _mk1 = "";
 //BA.debugLineNum = 1794;BA.debugLine="Sub SetPrefix(prefix As String, target As Map) As";
 //BA.debugLineNum = 1795;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1796;BA.debugLine="For Each mk As String In target.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _target.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1797;BA.debugLine="Dim mv As Object = target.Get(mk)";
_mv = _target.Get((Object)(_mk));
 //BA.debugLineNum = 1798;BA.debugLine="Dim mk1 As String = prefix & \"_\" & mk";
_mk1 = _prefix+"_"+_mk;
 //BA.debugLineNum = 1799;BA.debugLine="nm.Put(mk1,mv)";
_nm.Put((Object)(_mk1),_mv);
 }
};
 //BA.debugLineNum = 1801;BA.debugLine="Return nm";
if (true) return _nm;
 //BA.debugLineNum = 1802;BA.debugLine="End Sub";
return null;
}
public String  _setrequiredstate(String _k,boolean _v) throws Exception{
String _diskey = "";
 //BA.debugLineNum = 1879;BA.debugLine="Sub SetRequiredState(k As String, v As Boolean)";
 //BA.debugLineNum = 1880;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
 //BA.debugLineNum = 1881;BA.debugLine="SetStateSingle(disKey, v)";
_setstatesingle(_diskey,(Object)(_v));
 //BA.debugLineNum = 1882;BA.debugLine="End Sub";
return "";
}
public String  _setshowstate(String _k,boolean _v) throws Exception{
String _showkey = "";
 //BA.debugLineNum = 1034;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
 //BA.debugLineNum = 1035;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
 //BA.debugLineNum = 1036;BA.debugLine="SetStateSingle(showKey, v)";
_setstatesingle(_showkey,(Object)(_v));
 //BA.debugLineNum = 1037;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setstate(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
String _k = "";
Object _v = null;
 //BA.debugLineNum = 2359;BA.debugLine="Sub SetState(m As Map) As BANanoVue";
 //BA.debugLineNum = 2360;BA.debugLine="Try";
try { //BA.debugLineNum = 2361;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 2362;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
 //BA.debugLineNum = 2363;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 2364;BA.debugLine="data.Put(k, v)";
_data.Put((Object)(_k),_v);
 }
};
 } 
       catch (Exception e8) {
			ba.setLastException(e8); //BA.debugLineNum = 2367;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
 //BA.debugLineNum = 2369;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2370;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatedecrement(String _k) throws Exception{
String _oldv = "";
 //BA.debugLineNum = 1969;BA.debugLine="Sub SetStateDecrement(k As String) As BANanoVue";
 //BA.debugLineNum = 1970;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(_getstate(_k,(Object)("0")));
 //BA.debugLineNum = 1971;BA.debugLine="oldV = BANAno.parseInt(oldV) - 1";
_oldv = BA.NumberToString(_banano.parseInt((Object)(_oldv))-1);
 //BA.debugLineNum = 1972;BA.debugLine="SetStateSingle(k, oldV)";
_setstatesingle(_k,(Object)(_oldv));
 //BA.debugLineNum = 1973;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1974;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatefalse(String _k) throws Exception{
 //BA.debugLineNum = 1957;BA.debugLine="Sub SetStateFalse(k As String) As BANanoVue";
 //BA.debugLineNum = 1958;BA.debugLine="SetStateSingle(k,False)";
_setstatesingle(_k,(Object)(__c.False));
 //BA.debugLineNum = 1959;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1960;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstateincrement(String _k) throws Exception{
String _oldv = "";
 //BA.debugLineNum = 1962;BA.debugLine="Sub SetStateIncrement(k As String) As BANanoVue";
 //BA.debugLineNum = 1963;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(_getstate(_k,(Object)("0")));
 //BA.debugLineNum = 1964;BA.debugLine="oldV = BANAno.parseInt(oldV) + 1";
_oldv = BA.NumberToString(_banano.parseInt((Object)(_oldv))+1);
 //BA.debugLineNum = 1965;BA.debugLine="SetStateSingle(k, oldV)";
_setstatesingle(_k,(Object)(_oldv));
 //BA.debugLineNum = 1966;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1967;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatelist(String _mapkey,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 2342;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
 //BA.debugLineNum = 2343;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2344;BA.debugLine="opt.Put(mapKey, mapValues)";
_opt.Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
 //BA.debugLineNum = 2345;BA.debugLine="SetState(opt)";
_setstate(_opt);
 //BA.debugLineNum = 2346;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2347;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatelistvalues(anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
String _lstvalue = "";
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 2349;BA.debugLine="Sub SetStateListValues(mapValues As List) As BANan";
 //BA.debugLineNum = 2350;BA.debugLine="For Each lstValue As String In mapValues";
{
final anywheresoftware.b4a.BA.IterableList group1 = _mapvalues;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lstvalue = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 2351;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2352;BA.debugLine="opt.Put(lstValue, \"\")";
_opt.Put((Object)(_lstvalue),(Object)(""));
 //BA.debugLineNum = 2353;BA.debugLine="SetState(opt)";
_setstate(_opt);
 }
};
 //BA.debugLineNum = 2355;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2356;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatemap(String _mapkey,anywheresoftware.b4a.objects.collections.Map _mapvalues) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 2334;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
 //BA.debugLineNum = 2335;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2336;BA.debugLine="opt.Put(mapKey, mapValues)";
_opt.Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
 //BA.debugLineNum = 2337;BA.debugLine="SetState(opt)";
_setstate(_opt);
 //BA.debugLineNum = 2338;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2339;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatesingle(String _k,Object _v) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1978;BA.debugLine="Sub SetStateSingle(k As String, v As Object) As BA";
 //BA.debugLineNum = 1979;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1980;BA.debugLine="opt.Put(k, v)";
_opt.Put((Object)(_k),_v);
 //BA.debugLineNum = 1981;BA.debugLine="SetState(opt)";
_setstate(_opt);
 //BA.debugLineNum = 1982;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1983;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatetrue(String _k) throws Exception{
 //BA.debugLineNum = 1952;BA.debugLine="Sub SetStateTrue(k As String) As BANanoVue";
 //BA.debugLineNum = 1953;BA.debugLine="SetStateSingle(k,True)";
_setstatesingle(_k,(Object)(__c.True));
 //BA.debugLineNum = 1954;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1955;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstyle(String _classname,String _prop,String _valx) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 1600;BA.debugLine="Sub SetStyle(className As String, prop As String,";
 //BA.debugLineNum = 1601;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1602;BA.debugLine="If dynamicStyle.ContainsKey(className) Then";
if (_dynamicstyle.ContainsKey((Object)(_classname))) { 
 //BA.debugLineNum = 1603;BA.debugLine="m = dynamicStyle.Get(className)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_dynamicstyle.Get((Object)(_classname))));
 //BA.debugLineNum = 1604;BA.debugLine="m.Put(prop, valx)";
_m.Put((Object)(_prop),(Object)(_valx));
 }else {
 //BA.debugLineNum = 1606;BA.debugLine="m = CreateMap()";
_m = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1607;BA.debugLine="m.Put(prop, valx)";
_m.Put((Object)(_prop),(Object)(_valx));
 };
 //BA.debugLineNum = 1609;BA.debugLine="dynamicStyle.Put(className, m)";
_dynamicstyle.Put((Object)(_classname),(Object)(_m.getObject()));
 //BA.debugLineNum = 1610;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1611;BA.debugLine="End Sub";
return null;
}
public String  _settemplate(String _tmp) throws Exception{
 //BA.debugLineNum = 2125;BA.debugLine="Sub SetTemplate(tmp As String)";
 //BA.debugLineNum = 2126;BA.debugLine="Template.SetText(tmp)";
_template._settext /*b4j.example.vuehtml*/ (_tmp);
 //BA.debugLineNum = 2127;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setupdated(Object _module,String _methodname) throws Exception{
 //BA.debugLineNum = 2232;BA.debugLine="Sub SetUpdated(module As Object, methodName As Str";
 //BA.debugLineNum = 2233;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2234;BA.debugLine="updated = BANAno.CallBack(module, methodName, Nul";
_updated.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
 //BA.debugLineNum = 2235;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2236;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setwatch(String _k,boolean _bimmediate,boolean _bdeep,Object _module,String _methodname) throws Exception{
Object _newval = null;
com.ab.banano.BANanoObject _cb = null;
anywheresoftware.b4a.objects.collections.Map _deepit = null;
 //BA.debugLineNum = 2314;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
 //BA.debugLineNum = 2315;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
 //BA.debugLineNum = 2316;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
 //BA.debugLineNum = 2317;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
 //BA.debugLineNum = 2318;BA.debugLine="If data.ContainsKey(k) Then";
if (_data.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 2319;BA.debugLine="SetStateSingle(k, Null)";
_setstatesingle(_k,__c.Null);
 };
 //BA.debugLineNum = 2321;BA.debugLine="Dim newVal As Object";
_newval = new Object();
 //BA.debugLineNum = 2322;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_newval}))));
 //BA.debugLineNum = 2323;BA.debugLine="Dim deepit As Map = CreateMap()";
_deepit = new anywheresoftware.b4a.objects.collections.Map();
_deepit = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2324;BA.debugLine="deepit.Put(\"handler\", methodName)";
_deepit.Put((Object)("handler"),(Object)(_methodname));
 //BA.debugLineNum = 2325;BA.debugLine="deepit.Put(\"deep\", bDeep)";
_deepit.Put((Object)("deep"),(Object)(_bdeep));
 //BA.debugLineNum = 2326;BA.debugLine="deepit.Put(\"immediate\", bImmediate)";
_deepit.Put((Object)("immediate"),(Object)(_bimmediate));
 //BA.debugLineNum = 2327;BA.debugLine="watches.Put(k, deepit)";
_watches.Put((Object)(_k),(Object)(_deepit.getObject()));
 //BA.debugLineNum = 2328;BA.debugLine="methods.Put(methodName, cb)";
_methods.Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
 //BA.debugLineNum = 2330;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2331;BA.debugLine="End Sub";
return null;
}
public String  _showerror(String _elid) throws Exception{
 //BA.debugLineNum = 1762;BA.debugLine="Sub ShowError(elID As String)";
 //BA.debugLineNum = 1763;BA.debugLine="SetStateSingle($\"${elID}error\"$, True)";
_setstatesingle((""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.True));
 //BA.debugLineNum = 1764;BA.debugLine="End Sub";
return "";
}
public String  _showitems(anywheresoftware.b4a.objects.collections.List _items) throws Exception{
String _item = "";
 //BA.debugLineNum = 1072;BA.debugLine="Sub ShowItems(items As List)";
 //BA.debugLineNum = 1073;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 1074;BA.debugLine="SetStateSingle(item, True)";
_setstatesingle(_item,(Object)(__c.True));
 }
};
 //BA.debugLineNum = 1076;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _shufflelist(anywheresoftware.b4a.objects.collections.List _pl) throws Exception{
int _i = 0;
int _j = 0;
Object _k = null;
 //BA.debugLineNum = 2074;BA.debugLine="Sub ShuffleList(pl As List) As List";
 //BA.debugLineNum = 2075;BA.debugLine="For i = pl.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_pl.getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
 //BA.debugLineNum = 2076;BA.debugLine="Dim j As Int";
_j = 0;
 //BA.debugLineNum = 2077;BA.debugLine="Dim k As Object";
_k = new Object();
 //BA.debugLineNum = 2078;BA.debugLine="j = Rnd(0, i + 1)";
_j = __c.Rnd((int) (0),(int) (_i+1));
 //BA.debugLineNum = 2079;BA.debugLine="k = pl.Get(j)";
_k = _pl.Get(_j);
 //BA.debugLineNum = 2080;BA.debugLine="pl.Set(j,pl.Get(i))";
_pl.Set(_j,_pl.Get(_i));
 //BA.debugLineNum = 2081;BA.debugLine="pl.Set(i,k)";
_pl.Set(_i,_k);
 }
};
 //BA.debugLineNum = 2083;BA.debugLine="Return pl";
if (true) return _pl;
 //BA.debugLineNum = 2084;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _sortmap(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
String _strkey = "";
Object _strvalue = null;
 //BA.debugLineNum = 1003;BA.debugLine="Sub SortMap(m As Map) As Map";
 //BA.debugLineNum = 1004;BA.debugLine="Try";
try { //BA.debugLineNum = 1005;BA.debugLine="Dim nm As Map";
_nm = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 1006;BA.debugLine="nm.Initialize";
_nm.Initialize();
 //BA.debugLineNum = 1007;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 1008;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 1009;BA.debugLine="For Each strkey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _m.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_strkey = BA.ObjectToString(group6.Get(index6));
 //BA.debugLineNum = 1010;BA.debugLine="lst.Add(strkey)";
_lst.Add((Object)(_strkey));
 }
};
 //BA.debugLineNum = 1013;BA.debugLine="lst.Sort(True)";
_lst.Sort(__c.True);
 //BA.debugLineNum = 1014;BA.debugLine="For Each strkey As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group10 = _lst;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_strkey = BA.ObjectToString(group10.Get(index10));
 //BA.debugLineNum = 1015;BA.debugLine="Dim strvalue As Object = m.Get(strkey)";
_strvalue = _m.Get((Object)(_strkey));
 //BA.debugLineNum = 1016;BA.debugLine="nm.Put(strkey,strvalue)";
_nm.Put((Object)(_strkey),_strvalue);
 }
};
 //BA.debugLineNum = 1018;BA.debugLine="Return nm";
if (true) return _nm;
 } 
       catch (Exception e16) {
			ba.setLastException(e16); //BA.debugLineNum = 1020;BA.debugLine="Return m";
if (true) return _m;
 };
 //BA.debugLineNum = 1022;BA.debugLine="End Sub";
return null;
}
public String  _space(int _hm) throws Exception{
String _rs = "";
 //BA.debugLineNum = 850;BA.debugLine="Sub Space(HM As Int) As String";
 //BA.debugLineNum = 851;BA.debugLine="Dim RS As String = \"\"";
_rs = "";
 //BA.debugLineNum = 852;BA.debugLine="Do While Len(RS) < HM";
while (_len(_rs)<_hm) {
 //BA.debugLineNum = 853;BA.debugLine="RS = RS & \" \"";
_rs = _rs+" ";
 }
;
 //BA.debugLineNum = 855;BA.debugLine="Return RS";
if (true) return _rs;
 //BA.debugLineNum = 856;BA.debugLine="End Sub";
return "";
}
public String  _state2another(String _source,String _target,Object _defaultvalue) throws Exception{
Object _readobj = null;
 //BA.debugLineNum = 273;BA.debugLine="Sub State2Another(source As String, target As Stri";
 //BA.debugLineNum = 274;BA.debugLine="Dim readObj As Object = GetState(source, defaultV";
_readobj = _getstate(_source,_defaultvalue);
 //BA.debugLineNum = 275;BA.debugLine="SetStateSingle(target, readObj)";
_setstatesingle(_target,_readobj);
 //BA.debugLineNum = 276;BA.debugLine="End Sub";
return "";
}
public boolean  _stateexists(String _statename) throws Exception{
 //BA.debugLineNum = 2088;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
 //BA.debugLineNum = 2089;BA.debugLine="stateName = stateName.tolowercase";
_statename = _statename.toLowerCase();
 //BA.debugLineNum = 2090;BA.debugLine="Return data.ContainsKey(stateName)";
if (true) return _data.ContainsKey((Object)(_statename));
 //BA.debugLineNum = 2091;BA.debugLine="End Sub";
return false;
}
public String  _statusrag(int _dvalue) throws Exception{
 //BA.debugLineNum = 2606;BA.debugLine="Public Sub StatusRAG(dValue As Int) As String";
 //BA.debugLineNum = 2607;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2609;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 2611;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
 //BA.debugLineNum = 2613;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 2615;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
 //BA.debugLineNum = 2617;BA.debugLine="End Sub";
return "";
}
public String  _statusrg(int _dvalue) throws Exception{
 //BA.debugLineNum = 2672;BA.debugLine="Public Sub StatusRG(dValue As Int) As String";
 //BA.debugLineNum = 2673;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
 //BA.debugLineNum = 2675;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
 //BA.debugLineNum = 2677;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
 //BA.debugLineNum = 2679;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
}
;
 //BA.debugLineNum = 2681;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _strparse(String _delim,String _inputstring) throws Exception{
anywheresoftware.b4a.objects.collections.List _outlist = null;
int _commaloc = 0;
String _leftside = "";
String _rightside = "";
 //BA.debugLineNum = 2007;BA.debugLine="Sub StrParse(Delim As String, InputString As Strin";
 //BA.debugLineNum = 2008;BA.debugLine="Dim OutList As List";
_outlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 2009;BA.debugLine="Dim CommaLoc As Int";
_commaloc = 0;
 //BA.debugLineNum = 2010;BA.debugLine="OutList.Initialize";
_outlist.Initialize();
 //BA.debugLineNum = 2011;BA.debugLine="OutList.clear";
_outlist.Clear();
 //BA.debugLineNum = 2012;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 //BA.debugLineNum = 2013;BA.debugLine="Do While CommaLoc >-1";
while (_commaloc>-1) {
 //BA.debugLineNum = 2014;BA.debugLine="Dim LeftSide As String";
_leftside = "";
 //BA.debugLineNum = 2015;BA.debugLine="LeftSide= InputString.SubString2(0,CommaLoc)";
_leftside = _inputstring.substring((int) (0),_commaloc);
 //BA.debugLineNum = 2016;BA.debugLine="Dim RightSide As String";
_rightside = "";
 //BA.debugLineNum = 2017;BA.debugLine="RightSide= InputString.SubString(CommaLoc+1)";
_rightside = _inputstring.substring((int) (_commaloc+1));
 //BA.debugLineNum = 2018;BA.debugLine="OutList.Add(LeftSide)";
_outlist.Add((Object)(_leftside));
 //BA.debugLineNum = 2019;BA.debugLine="InputString=RightSide";
_inputstring = _rightside;
 //BA.debugLineNum = 2020;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 }
;
 //BA.debugLineNum = 2022;BA.debugLine="OutList.Add(InputString)";
_outlist.Add((Object)(_inputstring));
 //BA.debugLineNum = 2023;BA.debugLine="Return OutList";
if (true) return _outlist;
 //BA.debugLineNum = 2024;BA.debugLine="End Sub";
return null;
}
public double  _sumlistofmapsproperty(anywheresoftware.b4a.objects.collections.List _lst,String _prop) throws Exception{
double _tsum = 0;
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _propv = "";
 //BA.debugLineNum = 544;BA.debugLine="Sub SumListOfMapsProperty(lst As List, prop As Str";
 //BA.debugLineNum = 545;BA.debugLine="Dim tsum As Double = 0";
_tsum = 0;
 //BA.debugLineNum = 546;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
 //BA.debugLineNum = 547;BA.debugLine="Dim propv As String = rec.GetDefault(prop,\"0\")";
_propv = BA.ObjectToString(_rec.GetDefault((Object)(_prop),(Object)("0")));
 //BA.debugLineNum = 548;BA.debugLine="tsum = tsum + BANAno.parseFloat(propv)";
_tsum = _tsum+_banano.parseFloat((Object)(_propv));
 }
};
 //BA.debugLineNum = 550;BA.debugLine="Return tsum";
if (true) return _tsum;
 //BA.debugLineNum = 551;BA.debugLine="End Sub";
return 0;
}
public b4j.example.bananovue  _togglenamedstate(String _statename,String _state1,String _state2) throws Exception{
String _bcurrent = "";
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 1992;BA.debugLine="Sub ToggleNamedState(stateName As String, state1 A";
 //BA.debugLineNum = 1993;BA.debugLine="Dim bcurrent As String = GetState(stateName,\"\")";
_bcurrent = BA.ObjectToString(_getstate(_statename,(Object)("")));
 //BA.debugLineNum = 1994;BA.debugLine="If bcurrent.EqualsIgnoreCase(state1) Then";
if (_bcurrent.equalsIgnoreCase(_state1)) { 
 //BA.debugLineNum = 1995;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 1996;BA.debugLine="opt.Put(stateName, state2)";
_opt.Put((Object)(_statename),(Object)(_state2));
 //BA.debugLineNum = 1997;BA.debugLine="SetState(opt)";
_setstate(_opt);
 }else {
 //BA.debugLineNum = 1999;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2000;BA.debugLine="opt.Put(stateName, state1)";
_opt.Put((Object)(_statename),(Object)(_state1));
 //BA.debugLineNum = 2001;BA.debugLine="SetState(opt)";
_setstate(_opt);
 };
 //BA.debugLineNum = 2003;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 2004;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _togglestate(String _statename) throws Exception{
boolean _bcurrent = false;
 //BA.debugLineNum = 1985;BA.debugLine="Sub ToggleState(stateName As String) As BANanoVue";
 //BA.debugLineNum = 1986;BA.debugLine="Dim bcurrent As Boolean = GetState(stateName,Fals";
_bcurrent = BA.ObjectToBoolean(_getstate(_statename,(Object)(__c.False)));
 //BA.debugLineNum = 1987;BA.debugLine="bcurrent = Not(bcurrent)";
_bcurrent = __c.Not(_bcurrent);
 //BA.debugLineNum = 1988;BA.debugLine="SetStateSingle(stateName, bcurrent)";
_setstatesingle(_statename,(Object)(_bcurrent));
 //BA.debugLineNum = 1989;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
 //BA.debugLineNum = 1990;BA.debugLine="End Sub";
return null;
}
public String  _toyyyymmdd(String _vmodel) throws Exception{
String _sk = "";
 //BA.debugLineNum = 964;BA.debugLine="Sub ToYYYYMMDD(vmodel As String)";
 //BA.debugLineNum = 965;BA.debugLine="Dim sk As String = GetState(vmodel,\"\")";
_sk = BA.ObjectToString(_getstate(_vmodel,(Object)("")));
 //BA.debugLineNum = 966;BA.debugLine="sk = Date2YYYYMMDD(sk)";
_sk = _date2yyyymmdd((Object)(_sk));
 //BA.debugLineNum = 967;BA.debugLine="SetStateSingle(vmodel, sk)";
_setstatesingle(_vmodel,(Object)(_sk));
 //BA.debugLineNum = 968;BA.debugLine="End Sub";
return "";
}
public String  _trimstring(String _strvalue) throws Exception{
 //BA.debugLineNum = 842;BA.debugLine="private Sub TrimString(strValue As String) As Stri";
 //BA.debugLineNum = 843;BA.debugLine="Return strValue.trim";
if (true) return _strvalue.trim();
 //BA.debugLineNum = 844;BA.debugLine="End Sub";
return "";
}
public String  _use(com.ab.banano.BANanoObject _bo) throws Exception{
 //BA.debugLineNum = 2130;BA.debugLine="Sub Use(bo As BANanoObject)";
 //BA.debugLineNum = 2131;BA.debugLine="BOVue.RunMethod(\"use\", bo)";
_bovue.RunMethod("use",(Object)(_bo.getObject()));
 //BA.debugLineNum = 2132;BA.debugLine="End Sub";
return "";
}
public String  _use1(com.ab.banano.BANanoObject _bo,anywheresoftware.b4a.objects.collections.Map _opt) throws Exception{
 //BA.debugLineNum = 2135;BA.debugLine="Sub Use1(bo As BANanoObject, opt As Map)";
 //BA.debugLineNum = 2136;BA.debugLine="BOVue.RunMethod(\"use\", Array(bo, opt))";
_bovue.RunMethod("use",(Object)(new Object[]{(Object)(_bo.getObject()),(Object)(_opt.getObject())}));
 //BA.debugLineNum = 2137;BA.debugLine="End Sub";
return "";
}
public String  _ux() throws Exception{
String _tmp = "";
anywheresoftware.b4a.objects.collections.Map _ropt = null;
com.ab.banano.BANanoObject _router = null;
String _dkey = "";
String _rkey = "";
 //BA.debugLineNum = 2151;BA.debugLine="Sub UX()";
 //BA.debugLineNum = 2152;BA.debugLine="Dim tmp As String = Template.tostring";
_tmp = _template._tostring /*String*/ ();
 //BA.debugLineNum = 2153;BA.debugLine="GetTemplate = tmp";
_gettemplate = _tmp;
 //BA.debugLineNum = 2154;BA.debugLine="If routes.Size > 0 Then";
if (_routes.getSize()>0) { 
 //BA.debugLineNum = 2155;BA.debugLine="Dim ropt As Map = CreateMap()";
_ropt = new anywheresoftware.b4a.objects.collections.Map();
_ropt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 2156;BA.debugLine="ropt.Put(\"mode\", \"history\")";
_ropt.Put((Object)("mode"),(Object)("history"));
 //BA.debugLineNum = 2157;BA.debugLine="ropt.Put(\"routes\", routes)";
_ropt.Put((Object)("routes"),(Object)(_routes.getObject()));
 //BA.debugLineNum = 2158;BA.debugLine="Dim router As BANanoObject";
_router = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 2159;BA.debugLine="router.Initialize2(\"VueRouter\", Array(ropt))";
_router.Initialize2("VueRouter",(Object)(new Object[]{(Object)(_ropt.getObject())}));
 //BA.debugLineNum = 2160;BA.debugLine="Options.Put(\"router\", router)";
_options.Put((Object)("router"),(Object)(_router.getObject()));
 };
 //BA.debugLineNum = 2162;BA.debugLine="Options.Put(\"el\", \"#app\")";
_options.Put((Object)("el"),(Object)("#app"));
 //BA.debugLineNum = 2163;BA.debugLine="If data.Size > 0 Then Options.put(\"data\", data)";
if (_data.getSize()>0) { 
_options.Put((Object)("data"),(Object)(_data.getObject()));};
 //BA.debugLineNum = 2164;BA.debugLine="If methods.Size > 0 Then Options.Put(\"methods\", m";
if (_methods.getSize()>0) { 
_options.Put((Object)("methods"),(Object)(_methods.getObject()));};
 //BA.debugLineNum = 2165;BA.debugLine="If computed.Size > 0 Then Options.Put(\"computed\",";
if (_computed.getSize()>0) { 
_options.Put((Object)("computed"),(Object)(_computed.getObject()));};
 //BA.debugLineNum = 2166;BA.debugLine="If watches.Size > 0 Then Options.Put(\"watch\", wat";
if (_watches.getSize()>0) { 
_options.Put((Object)("watch"),(Object)(_watches.getObject()));};
 //BA.debugLineNum = 2167;BA.debugLine="If components.Size > 0 Then Options.Put(\"componen";
if (_components.getSize()>0) { 
_options.Put((Object)("components"),(Object)(_components.getObject()));};
 //BA.debugLineNum = 2168;BA.debugLine="If updated <> Null Then Options.Put(\"updated\", up";
if (_updated!= null) { 
_options.Put((Object)("updated"),(Object)(_updated.getObject()));};
 //BA.debugLineNum = 2169;BA.debugLine="If destroyed <> Null Then Options.Put(\"destroyed\"";
if (_destroyed!= null) { 
_options.Put((Object)("destroyed"),(Object)(_destroyed.getObject()));};
 //BA.debugLineNum = 2170;BA.debugLine="If mounted <> Null Then	Options.Put(\"mounted\", mo";
if (_mounted!= null) { 
_options.Put((Object)("mounted"),(Object)(_mounted.getObject()));};
 //BA.debugLineNum = 2171;BA.debugLine="If beforeCreate <> Null Then Options.Put(\"beforeC";
if (_beforecreate!= null) { 
_options.Put((Object)("beforeCreate"),(Object)(_beforecreate.getObject()));};
 //BA.debugLineNum = 2172;BA.debugLine="If created <> Null Then Options.Put(\"created\", cr";
if (_created!= null) { 
_options.Put((Object)("created"),(Object)(_created.getObject()));};
 //BA.debugLineNum = 2173;BA.debugLine="If beforeMount <> Null Then Options.Put(\"beforeMo";
if (_beforemount!= null) { 
_options.Put((Object)("beforeMount"),(Object)(_beforemount.getObject()));};
 //BA.debugLineNum = 2174;BA.debugLine="If beforeUpdate <> Null Then Options.Put(\"beforeU";
if (_beforeupdate!= null) { 
_options.Put((Object)("beforeUpdate"),(Object)(_beforeupdate.getObject()));};
 //BA.debugLineNum = 2175;BA.debugLine="If activated <> Null Then Options.Put(\"activated\"";
if (_activated!= null) { 
_options.Put((Object)("activated"),(Object)(_activated.getObject()));};
 //BA.debugLineNum = 2176;BA.debugLine="If deactivated <> Null Then Options.Put(\"deactiva";
if (_deactivated!= null) { 
_options.Put((Object)("deactivated"),(Object)(_deactivated.getObject()));};
 //BA.debugLineNum = 2177;BA.debugLine="If beforeDestroy <> Null Then Options.Put(\"before";
if (_beforedestroy!= null) { 
_options.Put((Object)("beforeDestroy"),(Object)(_beforedestroy.getObject()));};
 //BA.debugLineNum = 2178;BA.debugLine="Options.Put(\"template\", tmp)";
_options.Put((Object)("template"),(Object)(_tmp));
 //BA.debugLineNum = 2179;BA.debugLine="BOVue.Initialize2(\"Vue\", Options)";
_bovue.Initialize2("Vue",(Object)(_options.getObject()));
 //BA.debugLineNum = 2181;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
 //BA.debugLineNum = 2182;BA.debugLine="data = BOVue.GetField(dKey).Result";
_data.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_dkey).Result()));
 //BA.debugLineNum = 2184;BA.debugLine="Dim rKey As String = \"$refs\"";
_rkey = "$refs";
 //BA.debugLineNum = 2185;BA.debugLine="refs = BOVue.GetField(rKey).result";
_refs.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_bovue.GetField(_rkey).Result()));
 //BA.debugLineNum = 2186;BA.debugLine="End Sub";
return "";
}
public String  _val(String _value) throws Exception{
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
 //BA.debugLineNum = 554;BA.debugLine="Public Sub Val(value As String) As String";
 //BA.debugLineNum = 555;BA.debugLine="value = CStr(value)";
_value = _cstr((Object)(_value));
 //BA.debugLineNum = 556;BA.debugLine="Try";
try { //BA.debugLineNum = 557;BA.debugLine="value = value.Trim";
_value = _value.trim();
 //BA.debugLineNum = 558;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
 //BA.debugLineNum = 559;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
 //BA.debugLineNum = 560;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
 //BA.debugLineNum = 561;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
 //BA.debugLineNum = 562;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
 //BA.debugLineNum = 563;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 564;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
 //BA.debugLineNum = 565;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
if (_instr("0123456789.-",_mout)!=-1) { 
 //BA.debugLineNum = 566;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
 //BA.debugLineNum = 569;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17); //BA.debugLineNum = 571;BA.debugLine="Return value";
if (true) return _value;
 };
 //BA.debugLineNum = 573;BA.debugLine="End Sub";
return "";
}
public boolean  _validate(anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.Map _required) throws Exception{
int _iv = 0;
String _k = "";
String _v = "";
 //BA.debugLineNum = 1738;BA.debugLine="Sub Validate(rec As Map, required As Map) As Boole";
 //BA.debugLineNum = 1739;BA.debugLine="Dim iv As Int = 0";
_iv = (int) (0);
 //BA.debugLineNum = 1740;BA.debugLine="For Each k As String In required.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _required.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
 //BA.debugLineNum = 1741;BA.debugLine="If rec.ContainsKey(k) Then";
if (_rec.ContainsKey((Object)(_k))) { 
 //BA.debugLineNum = 1742;BA.debugLine="Dim v As String = rec.GetDefault(k,\"\")";
_v = BA.ObjectToString(_rec.GetDefault((Object)(_k),(Object)("")));
 //BA.debugLineNum = 1743;BA.debugLine="v = CStr(v)";
_v = _cstr((Object)(_v));
 //BA.debugLineNum = 1744;BA.debugLine="v = v.trim";
_v = _v.trim();
 //BA.debugLineNum = 1745;BA.debugLine="If v = \"\" Then";
if ((_v).equals("")) { 
 //BA.debugLineNum = 1746;BA.debugLine="Log(\"Validate: \" & k)";
__c.Log("Validate: "+_k);
 //BA.debugLineNum = 1747;BA.debugLine="iv = iv + 1";
_iv = (int) (_iv+1);
 //BA.debugLineNum = 1748;BA.debugLine="ShowError(k)";
_showerror(_k);
 }else {
 //BA.debugLineNum = 1750;BA.debugLine="HideError(k)";
_hideerror(_k);
 };
 };
 }
};
 //BA.debugLineNum = 1754;BA.debugLine="If iv = 0 Then";
if (_iv==0) { 
 //BA.debugLineNum = 1755;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
 //BA.debugLineNum = 1757;BA.debugLine="Return False";
if (true) return __c.False;
 };
 //BA.debugLineNum = 1759;BA.debugLine="End Sub";
return false;
}
public String  _yearnow() throws Exception{
long _lnow = 0L;
String _dt = "";
 //BA.debugLineNum = 430;BA.debugLine="Public Sub YearNow() As String";
 //BA.debugLineNum = 431;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
 //BA.debugLineNum = 432;BA.debugLine="Dim dt As String";
_dt = "";
 //BA.debugLineNum = 433;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
 //BA.debugLineNum = 434;BA.debugLine="DateTime.DateFormat = \"yyyy\"";
__c.DateTime.setDateFormat("yyyy");
 //BA.debugLineNum = 435;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
 //BA.debugLineNum = 436;BA.debugLine="Return dt";
if (true) return _dt;
 //BA.debugLineNum = 437;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
if (BA.fastSubCompare(sub, "DOUPLOAD"))
	return _doupload((Object) args[0]);
return BA.SubDelegator.SubNotFound;
}
}
