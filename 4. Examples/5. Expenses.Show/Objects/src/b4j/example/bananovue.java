package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananovue extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.bananovue", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.bananovue  _addcomponent(b4j.example.bananovue __ref,b4j.example.vuecomponent _comp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "addcomponent", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "addcomponent", new Object[] {_comp}));}
String _sid = "";
RDebugUtils.currentLine=41484288;
 //BA.debugLineNum = 41484288;BA.debugLine="Sub AddComponent(comp As VueComponent) As BANanoVu";
RDebugUtils.currentLine=41484289;
 //BA.debugLineNum = 41484289;BA.debugLine="Dim sid As String = comp.id";
_sid = _comp._id /*String*/ ;
RDebugUtils.currentLine=41484290;
 //BA.debugLineNum = 41484290;BA.debugLine="components.Put(sid, comp.Component)";
__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_sid),(Object)(_comp._component /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=41484291;
 //BA.debugLineNum = 41484291;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=41484292;
 //BA.debugLineNum = 41484292;BA.debugLine="End Sub";
return null;
}
public String  _settemplate(b4j.example.bananovue __ref,String _tmp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "settemplate", true))
	 {return ((String) Debug.delegate(ba, "settemplate", new Object[] {_tmp}));}
RDebugUtils.currentLine=44564480;
 //BA.debugLineNum = 44564480;BA.debugLine="Sub SetTemplate(tmp As String)";
RDebugUtils.currentLine=44564481;
 //BA.debugLineNum = 44564481;BA.debugLine="Template.SetText(tmp)";
__ref._template /*b4j.example.vuehtml*/ ._settext /*b4j.example.vuehtml*/ (null,_tmp);
RDebugUtils.currentLine=44564482;
 //BA.debugLineNum = 44564482;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setstatesingle(b4j.example.bananovue __ref,String _k,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstatesingle", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstatesingle", new Object[] {_k,_v}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=43843584;
 //BA.debugLineNum = 43843584;BA.debugLine="Sub SetStateSingle(k As String, v As Object) As BA";
RDebugUtils.currentLine=43843585;
 //BA.debugLineNum = 43843585;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=43843586;
 //BA.debugLineNum = 43843586;BA.debugLine="opt.Put(k, v)";
_opt.Put((Object)(_k),_v);
RDebugUtils.currentLine=43843587;
 //BA.debugLineNum = 43843587;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=43843588;
 //BA.debugLineNum = 43843588;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=43843589;
 //BA.debugLineNum = 43843589;BA.debugLine="End Sub";
return null;
}
public String  _addroute(b4j.example.bananovue __ref,String _path,b4j.example.vuecomponent _comp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "addroute", true))
	 {return ((String) Debug.delegate(ba, "addroute", new Object[] {_path,_comp}));}
anywheresoftware.b4a.objects.collections.Map _eachroute = null;
RDebugUtils.currentLine=41615360;
 //BA.debugLineNum = 41615360;BA.debugLine="Sub AddRoute(path As String, comp As VueComponent)";
RDebugUtils.currentLine=41615361;
 //BA.debugLineNum = 41615361;BA.debugLine="If comp.name = \"\" Then";
if ((_comp._name /*String*/ ).equals("")) { 
RDebugUtils.currentLine=41615362;
 //BA.debugLineNum = 41615362;BA.debugLine="Log(\"AddRoute: Please specify the name of the Ro";
__c.Log("AddRoute: Please specify the name of the Route!");
 };
RDebugUtils.currentLine=41615365;
 //BA.debugLineNum = 41615365;BA.debugLine="Dim eachroute As Map = CreateMap()";
_eachroute = new anywheresoftware.b4a.objects.collections.Map();
_eachroute = __c.createMap(new Object[] {});
RDebugUtils.currentLine=41615366;
 //BA.debugLineNum = 41615366;BA.debugLine="eachroute.Put(\"path\", path)";
_eachroute.Put((Object)("path"),(Object)(_path));
RDebugUtils.currentLine=41615367;
 //BA.debugLineNum = 41615367;BA.debugLine="eachroute.Put(\"name\", comp.name)";
_eachroute.Put((Object)("name"),(Object)(_comp._name /*String*/ ));
RDebugUtils.currentLine=41615368;
 //BA.debugLineNum = 41615368;BA.debugLine="eachroute.Put(\"component\", comp.component)";
_eachroute.Put((Object)("component"),(Object)(_comp._component /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=41615370;
 //BA.debugLineNum = 41615370;BA.debugLine="routes.Add(eachroute)";
__ref._routes /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_eachroute.getObject()));
RDebugUtils.currentLine=41615371;
 //BA.debugLineNum = 41615371;BA.debugLine="End Sub";
return "";
}
public int  _age(b4j.example.bananovue __ref,String _birthday) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "age", true))
	 {return ((Integer) Debug.delegate(ba, "age", new Object[] {_birthday}));}
String _tday = "";
String _cday = "";
int _adays = 0;
int _ayears = 0;
RDebugUtils.currentLine=35913728;
 //BA.debugLineNum = 35913728;BA.debugLine="Sub Age(birthDay As String) As Int";
RDebugUtils.currentLine=35913729;
 //BA.debugLineNum = 35913729;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=35913730;
 //BA.debugLineNum = 35913730;BA.debugLine="Dim tDay As String = DateTime.Date(DateTime.Now)";
_tday = __c.DateTime.Date(__c.DateTime.getNow());
RDebugUtils.currentLine=35913731;
 //BA.debugLineNum = 35913731;BA.debugLine="Dim cDay As String = DateTime.Date(DateTime.DateP";
_cday = __c.DateTime.Date(__c.DateTime.DateParse(_birthday));
RDebugUtils.currentLine=35913732;
 //BA.debugLineNum = 35913732;BA.debugLine="Dim aDays As Int = DateDiff(tDay, cDay)";
_adays = __ref._datediff /*int*/ (null,_tday,_cday);
RDebugUtils.currentLine=35913733;
 //BA.debugLineNum = 35913733;BA.debugLine="Dim aYears As Int = aDays / 365.25";
_ayears = (int) (_adays/(double)365.25);
RDebugUtils.currentLine=35913734;
 //BA.debugLineNum = 35913734;BA.debugLine="Return BANAno.parseInt(aYears)";
if (true) return __ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_ayears));
RDebugUtils.currentLine=35913735;
 //BA.debugLineNum = 35913735;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.Map  _audittrail(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "audittrail", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "audittrail", new Object[] {_oldm,_newm}));}
anywheresoftware.b4a.objects.collections.Map _df = null;
String _k = "";
Object _v = null;
Object _nv = null;
Object _ov = null;
RDebugUtils.currentLine=41811968;
 //BA.debugLineNum = 41811968;BA.debugLine="Sub AuditTrail(oldM As Map, newM As Map) As Map";
RDebugUtils.currentLine=41811969;
 //BA.debugLineNum = 41811969;BA.debugLine="Dim df As Map = CreateMap()";
_df = new anywheresoftware.b4a.objects.collections.Map();
_df = __c.createMap(new Object[] {});
RDebugUtils.currentLine=41811970;
 //BA.debugLineNum = 41811970;BA.debugLine="For Each k As String In oldM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=41811971;
 //BA.debugLineNum = 41811971;BA.debugLine="Dim v As Object = oldM.Get(k)";
_v = _oldm.Get((Object)(_k));
RDebugUtils.currentLine=41811972;
 //BA.debugLineNum = 41811972;BA.debugLine="If newM.ContainsKey(k) Then";
if (_newm.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=41811973;
 //BA.debugLineNum = 41811973;BA.debugLine="Dim nv As Object = newM.Get(k)";
_nv = _newm.Get((Object)(_k));
RDebugUtils.currentLine=41811974;
 //BA.debugLineNum = 41811974;BA.debugLine="If v <> nv Then";
if ((_v).equals(_nv) == false) { 
RDebugUtils.currentLine=41811975;
 //BA.debugLineNum = 41811975;BA.debugLine="df.Put(k, nv)";
_df.Put((Object)(_k),_nv);
 };
 };
 }
};
RDebugUtils.currentLine=41811979;
 //BA.debugLineNum = 41811979;BA.debugLine="For Each k As String In newM.Keys";
{
final anywheresoftware.b4a.BA.IterableList group11 = _newm.Keys();
final int groupLen11 = group11.getSize()
;int index11 = 0;
;
for (; index11 < groupLen11;index11++){
_k = BA.ObjectToString(group11.Get(index11));
RDebugUtils.currentLine=41811980;
 //BA.debugLineNum = 41811980;BA.debugLine="Dim v As Object = newM.Get(k)";
_v = _newm.Get((Object)(_k));
RDebugUtils.currentLine=41811981;
 //BA.debugLineNum = 41811981;BA.debugLine="If oldM.ContainsKey(k) Then";
if (_oldm.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=41811982;
 //BA.debugLineNum = 41811982;BA.debugLine="Dim ov As Object = oldM.Get(k)";
_ov = _oldm.Get((Object)(_k));
RDebugUtils.currentLine=41811983;
 //BA.debugLineNum = 41811983;BA.debugLine="If v <> ov Then";
if ((_v).equals(_ov) == false) { 
RDebugUtils.currentLine=41811984;
 //BA.debugLineNum = 41811984;BA.debugLine="df.Put(k, v)";
_df.Put((Object)(_k),_v);
 };
 }else {
RDebugUtils.currentLine=41811987;
 //BA.debugLineNum = 41811987;BA.debugLine="df.Put(k, v)";
_df.Put((Object)(_k),_v);
 };
 }
};
RDebugUtils.currentLine=41811990;
 //BA.debugLineNum = 41811990;BA.debugLine="Return df";
if (true) return _df;
RDebugUtils.currentLine=41811991;
 //BA.debugLineNum = 41811991;BA.debugLine="End Sub";
return null;
}
public Object  _callcomputed(b4j.example.bananovue __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "callcomputed", true))
	 {return ((Object) Debug.delegate(ba, "callcomputed", new Object[] {_methodname}));}
RDebugUtils.currentLine=43384832;
 //BA.debugLineNum = 43384832;BA.debugLine="Sub CallComputed(methodName As String) As Object";
RDebugUtils.currentLine=43384833;
 //BA.debugLineNum = 43384833;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=43384834;
 //BA.debugLineNum = 43384834;BA.debugLine="Return BOVue.GetField(methodName)";
if (true) return (Object)(__ref._bovue /*com.ab.banano.BANanoObject*/ .GetField(_methodname).getObject());
RDebugUtils.currentLine=43384835;
 //BA.debugLineNum = 43384835;BA.debugLine="End Sub";
return null;
}
public String  _callmethod(b4j.example.bananovue __ref,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "callmethod", true))
	 {return ((String) Debug.delegate(ba, "callmethod", new Object[] {_methodname}));}
RDebugUtils.currentLine=43450368;
 //BA.debugLineNum = 43450368;BA.debugLine="Sub CallMethod(methodName As String)";
RDebugUtils.currentLine=43450369;
 //BA.debugLineNum = 43450369;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=43450370;
 //BA.debugLineNum = 43450370;BA.debugLine="BOVue.RunMethod(methodName, Null)";
__ref._bovue /*com.ab.banano.BANanoObject*/ .RunMethod(_methodname,__c.Null);
RDebugUtils.currentLine=43450371;
 //BA.debugLineNum = 43450371;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _compile(b4j.example.bananovue __ref,String _html) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "compile", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "compile", new Object[] {_html}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=40173568;
 //BA.debugLineNum = 40173568;BA.debugLine="Sub Compile(html As String) As BANanoObject";
RDebugUtils.currentLine=40173569;
 //BA.debugLineNum = 40173569;BA.debugLine="Dim bo As BANanoObject = BOVue.RunMethod(\"compile";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._bovue /*com.ab.banano.BANanoObject*/ .RunMethod("compile",(Object)(new Object[]{(Object)(_html)}));
RDebugUtils.currentLine=40173570;
 //BA.debugLineNum = 40173570;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=40173571;
 //BA.debugLineNum = 40173571;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _copymap(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "copymap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "copymap", new Object[] {_source,_keys}));}
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=42074112;
 //BA.debugLineNum = 42074112;BA.debugLine="Sub CopyMap(source As Map, keys As List) As Map";
RDebugUtils.currentLine=42074113;
 //BA.debugLineNum = 42074113;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
RDebugUtils.currentLine=42074114;
 //BA.debugLineNum = 42074114;BA.debugLine="If keys.Get(0) = \"*\" Then";
if ((_keys.Get((int) (0))).equals((Object)("*"))) { 
RDebugUtils.currentLine=42074115;
 //BA.debugLineNum = 42074115;BA.debugLine="For Each k As String In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _source.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=42074116;
 //BA.debugLineNum = 42074116;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
RDebugUtils.currentLine=42074117;
 //BA.debugLineNum = 42074117;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 }else {
RDebugUtils.currentLine=42074120;
 //BA.debugLineNum = 42074120;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group8 = _keys;
final int groupLen8 = group8.getSize()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_k = BA.ObjectToString(group8.Get(index8));
RDebugUtils.currentLine=42074121;
 //BA.debugLineNum = 42074121;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
RDebugUtils.currentLine=42074122;
 //BA.debugLineNum = 42074122;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 };
RDebugUtils.currentLine=42074125;
 //BA.debugLineNum = 42074125;BA.debugLine="Return nm";
if (true) return _nm;
RDebugUtils.currentLine=42074126;
 //BA.debugLineNum = 42074126;BA.debugLine="End Sub";
return null;
}
public String  _cstr(b4j.example.bananovue __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "cstr", true))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=42532864;
 //BA.debugLineNum = 42532864;BA.debugLine="Sub CStr(o As Object) As String";
RDebugUtils.currentLine=42532865;
 //BA.debugLineNum = 42532865;BA.debugLine="If o = BANAno.UNDEFINED Then o = \"\"";
if ((_o).equals(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED())) { 
_o = (Object)("");};
RDebugUtils.currentLine=42532866;
 //BA.debugLineNum = 42532866;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=42532867;
 //BA.debugLineNum = 42532867;BA.debugLine="End Sub";
return "";
}
public String  _date2yyyymmdd(b4j.example.bananovue __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "date2yyyymmdd", true))
	 {return ((String) Debug.delegate(ba, "date2yyyymmdd", new Object[] {_value}));}
com.ab.banano.BANanoObject _m = null;
String _res = "";
RDebugUtils.currentLine=39124992;
 //BA.debugLineNum = 39124992;BA.debugLine="Sub Date2YYYYMMDD(value As Object) As String";
RDebugUtils.currentLine=39124993;
 //BA.debugLineNum = 39124993;BA.debugLine="Try";
try {RDebugUtils.currentLine=39124994;
 //BA.debugLineNum = 39124994;BA.debugLine="If CStr(value) = \"\" Then Return \"\"";
if ((__ref._cstr /*String*/ (null,_value)).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=39124995;
 //BA.debugLineNum = 39124995;BA.debugLine="If value = Null Then Return \"\"";
if (_value== null) { 
if (true) return "";};
RDebugUtils.currentLine=39124996;
 //BA.debugLineNum = 39124996;BA.debugLine="Dim m As BANanoObject = BANAno.RunJavascriptMeth";
_m = new com.ab.banano.BANanoObject();
_m.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("moment",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
RDebugUtils.currentLine=39124997;
 //BA.debugLineNum = 39124997;BA.debugLine="Dim res As String = m.RunMethod(\"format\", \"YYYY-";
_res = BA.ObjectToString(_m.RunMethod("format",(Object)("YYYY-MM-DD")).Result());
RDebugUtils.currentLine=39124998;
 //BA.debugLineNum = 39124998;BA.debugLine="If res.IndexOf(\"Invalid\") > 0 Then res = \"\"";
if (_res.indexOf("Invalid")>0) { 
_res = "";};
RDebugUtils.currentLine=39124999;
 //BA.debugLineNum = 39124999;BA.debugLine="Return res";
if (true) return _res;
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=39125001;
 //BA.debugLineNum = 39125001;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=39125003;
 //BA.debugLineNum = 39125003;BA.debugLine="End Sub";
return "";
}
public String  _dateadd(b4j.example.bananovue __ref,String _mdate,int _howmanydays) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "dateadd", true))
	 {return ((String) Debug.delegate(ba, "dateadd", new Object[] {_mdate,_howmanydays}));}
long _convertdate = 0L;
long _newdateday = 0L;
RDebugUtils.currentLine=35848192;
 //BA.debugLineNum = 35848192;BA.debugLine="Sub DateAdd(mDate As String, HowManyDays As Int) A";
RDebugUtils.currentLine=35848193;
 //BA.debugLineNum = 35848193;BA.debugLine="Dim ConvertDate, NewDateDay As Long";
_convertdate = 0L;
_newdateday = 0L;
RDebugUtils.currentLine=35848194;
 //BA.debugLineNum = 35848194;BA.debugLine="ConvertDate = DateTime.DateParse(mDate)";
_convertdate = __c.DateTime.DateParse(_mdate);
RDebugUtils.currentLine=35848195;
 //BA.debugLineNum = 35848195;BA.debugLine="NewDateDay = DateTime.Add(ConvertDate, 0, 0, HowM";
_newdateday = __c.DateTime.Add(_convertdate,(int) (0),(int) (0),_howmanydays);
RDebugUtils.currentLine=35848196;
 //BA.debugLineNum = 35848196;BA.debugLine="Return DateTime.Date(NewDateDay)";
if (true) return __c.DateTime.Date(_newdateday);
RDebugUtils.currentLine=35848197;
 //BA.debugLineNum = 35848197;BA.debugLine="End Sub";
return "";
}
public int  _datediff(b4j.example.bananovue __ref,String _currentdate,String _otherdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "datediff", true))
	 {return ((Integer) Debug.delegate(ba, "datediff", new Object[] {_currentdate,_otherdate}));}
long _currdate = 0L;
long _othdate = 0L;
RDebugUtils.currentLine=35979264;
 //BA.debugLineNum = 35979264;BA.debugLine="Sub DateDiff(CurrentDate As String, OtherDate As S";
RDebugUtils.currentLine=35979265;
 //BA.debugLineNum = 35979265;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=35979267;
 //BA.debugLineNum = 35979267;BA.debugLine="Dim CurrDate As Long";
_currdate = 0L;
RDebugUtils.currentLine=35979268;
 //BA.debugLineNum = 35979268;BA.debugLine="Dim OthDate As Long";
_othdate = 0L;
RDebugUtils.currentLine=35979269;
 //BA.debugLineNum = 35979269;BA.debugLine="CurrDate = DateTime.DateParse(CurrentDate)";
_currdate = __c.DateTime.DateParse(_currentdate);
RDebugUtils.currentLine=35979270;
 //BA.debugLineNum = 35979270;BA.debugLine="OthDate = DateTime.DateParse(OtherDate)";
_othdate = __c.DateTime.DateParse(_otherdate);
RDebugUtils.currentLine=35979272;
 //BA.debugLineNum = 35979272;BA.debugLine="Return (CurrDate-OthDate) / DateTime.TicksPerDay";
if (true) return (int) ((_currdate-_othdate)/(double)__c.DateTime.TicksPerDay);
RDebugUtils.currentLine=35979273;
 //BA.debugLineNum = 35979273;BA.debugLine="End Sub";
return 0;
}
public String  _datenow(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "datenow", true))
	 {return ((String) Debug.delegate(ba, "datenow", null));}
long _lnow = 0L;
String _dt = "";
RDebugUtils.currentLine=41943040;
 //BA.debugLineNum = 41943040;BA.debugLine="Public Sub DateNow() As String";
RDebugUtils.currentLine=41943041;
 //BA.debugLineNum = 41943041;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
RDebugUtils.currentLine=41943042;
 //BA.debugLineNum = 41943042;BA.debugLine="Dim dt As String";
_dt = "";
RDebugUtils.currentLine=41943043;
 //BA.debugLineNum = 41943043;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
RDebugUtils.currentLine=41943044;
 //BA.debugLineNum = 41943044;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
RDebugUtils.currentLine=41943045;
 //BA.debugLineNum = 41943045;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
RDebugUtils.currentLine=41943046;
 //BA.debugLineNum = 41943046;BA.debugLine="Return dt";
if (true) return _dt;
RDebugUtils.currentLine=41943047;
 //BA.debugLineNum = 41943047;BA.debugLine="End Sub";
return "";
}
public String  _datetimenow(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "datetimenow", true))
	 {return ((String) Debug.delegate(ba, "datetimenow", null));}
long _lnow = 0L;
String _dt = "";
RDebugUtils.currentLine=41877504;
 //BA.debugLineNum = 41877504;BA.debugLine="Public Sub DateTimeNow() As String";
RDebugUtils.currentLine=41877505;
 //BA.debugLineNum = 41877505;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
RDebugUtils.currentLine=41877506;
 //BA.debugLineNum = 41877506;BA.debugLine="Dim dt As String";
_dt = "";
RDebugUtils.currentLine=41877507;
 //BA.debugLineNum = 41877507;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
RDebugUtils.currentLine=41877508;
 //BA.debugLineNum = 41877508;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=41877509;
 //BA.debugLineNum = 41877509;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
RDebugUtils.currentLine=41877510;
 //BA.debugLineNum = 41877510;BA.debugLine="Return dt";
if (true) return _dt;
RDebugUtils.currentLine=41877511;
 //BA.debugLineNum = 41877511;BA.debugLine="End Sub";
return "";
}
public Object  _getstate(b4j.example.bananovue __ref,String _k,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getstate", true))
	 {return ((Object) Debug.delegate(ba, "getstate", new Object[] {_k,_v}));}
Object _out = null;
RDebugUtils.currentLine=46268416;
 //BA.debugLineNum = 46268416;BA.debugLine="Sub GetState(k As String, v As Object) As Object";
RDebugUtils.currentLine=46268417;
 //BA.debugLineNum = 46268417;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=46268418;
 //BA.debugLineNum = 46268418;BA.debugLine="If data.ContainsKey(k) Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=46268419;
 //BA.debugLineNum = 46268419;BA.debugLine="Dim out As Object = data.GetDefault(k,v)";
_out = __ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_k),_v);
RDebugUtils.currentLine=46268420;
 //BA.debugLineNum = 46268420;BA.debugLine="Return out";
if (true) return _out;
 }else {
RDebugUtils.currentLine=46268422;
 //BA.debugLineNum = 46268422;BA.debugLine="Log(\"GetState: First set the v-model for \" & k)";
__c.Log("GetState: First set the v-model for "+_k);
RDebugUtils.currentLine=46268423;
 //BA.debugLineNum = 46268423;BA.debugLine="Return \"\"";
if (true) return (Object)("");
 };
RDebugUtils.currentLine=46268425;
 //BA.debugLineNum = 46268425;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "eqoperators", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "eqoperators", new Object[] {_sm}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
RDebugUtils.currentLine=40435712;
 //BA.debugLineNum = 40435712;BA.debugLine="Sub EQOperators(sm As Map) As List";
RDebugUtils.currentLine=40435713;
 //BA.debugLineNum = 40435713;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=40435714;
 //BA.debugLineNum = 40435714;BA.debugLine="nl.initialize";
_nl.Initialize();
RDebugUtils.currentLine=40435715;
 //BA.debugLineNum = 40435715;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=40435716;
 //BA.debugLineNum = 40435716;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
RDebugUtils.currentLine=40435718;
 //BA.debugLineNum = 40435718;BA.debugLine="Return nl";
if (true) return _nl;
RDebugUtils.currentLine=40435719;
 //BA.debugLineNum = 40435719;BA.debugLine="End Sub";
return null;
}
public String  _fixrecords(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _recs,anywheresoftware.b4a.objects.collections.List _trimthese,anywheresoftware.b4a.objects.collections.List _numthese,anywheresoftware.b4a.objects.collections.List _boolthese,anywheresoftware.b4a.objects.collections.List _datethese,anywheresoftware.b4a.objects.collections.List _dblthese) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "fixrecords", true))
	 {return ((String) Debug.delegate(ba, "fixrecords", new Object[] {_recs,_trimthese,_numthese,_boolthese,_datethese,_dblthese}));}
int _rtot = 0;
int _rcnt = 0;
anywheresoftware.b4a.objects.collections.Map _rec = null;
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=42598400;
 //BA.debugLineNum = 42598400;BA.debugLine="Sub FixRecords(recs As List, trimThese As List, nu";
RDebugUtils.currentLine=42598401;
 //BA.debugLineNum = 42598401;BA.debugLine="Dim rTot As Int = recs.Size - 1";
_rtot = (int) (_recs.getSize()-1);
RDebugUtils.currentLine=42598402;
 //BA.debugLineNum = 42598402;BA.debugLine="Dim rCnt As Int";
_rcnt = 0;
RDebugUtils.currentLine=42598403;
 //BA.debugLineNum = 42598403;BA.debugLine="For rCnt = 0 To rTot";
{
final int step3 = 1;
final int limit3 = _rtot;
_rcnt = (int) (0) ;
for (;_rcnt <= limit3 ;_rcnt = _rcnt + step3 ) {
RDebugUtils.currentLine=42598404;
 //BA.debugLineNum = 42598404;BA.debugLine="Dim rec As Map = recs.Get(rCnt)";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_recs.Get(_rcnt)));
RDebugUtils.currentLine=42598406;
 //BA.debugLineNum = 42598406;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
RDebugUtils.currentLine=42598407;
 //BA.debugLineNum = 42598407;BA.debugLine="For Each k As String In rec.keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _rec.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=42598408;
 //BA.debugLineNum = 42598408;BA.debugLine="Dim v As Object = rec.Get(k)";
_v = _rec.Get((Object)(_k));
RDebugUtils.currentLine=42598409;
 //BA.debugLineNum = 42598409;BA.debugLine="k = k.ToLowerCase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=42598410;
 //BA.debugLineNum = 42598410;BA.debugLine="nrec.Put(k, v)";
_nrec.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=42598412;
 //BA.debugLineNum = 42598412;BA.debugLine="If dateThese <> Null Then MakeDate(nrec,dateThes";
if (_datethese!= null) { 
__ref._makedate /*String*/ (null,_nrec,_datethese);};
RDebugUtils.currentLine=42598413;
 //BA.debugLineNum = 42598413;BA.debugLine="If trimThese <> Null Then MakeTrim(nrec,trimThes";
if (_trimthese!= null) { 
__ref._maketrim /*String*/ (null,_nrec,_trimthese);};
RDebugUtils.currentLine=42598414;
 //BA.debugLineNum = 42598414;BA.debugLine="If numThese <> Null Then MakeInteger(nrec, numTh";
if (_numthese!= null) { 
__ref._makeinteger /*String*/ (null,_nrec,_numthese);};
RDebugUtils.currentLine=42598415;
 //BA.debugLineNum = 42598415;BA.debugLine="If dblThese <> Null Then MakeDouble(nrec, dblThe";
if (_dblthese!= null) { 
__ref._makedouble /*String*/ (null,_nrec,_dblthese);};
RDebugUtils.currentLine=42598416;
 //BA.debugLineNum = 42598416;BA.debugLine="If boolThese <> Null Then MakeBoolean(nrec, bool";
if (_boolthese!= null) { 
__ref._makeboolean /*String*/ (null,_nrec,_boolthese);};
RDebugUtils.currentLine=42598417;
 //BA.debugLineNum = 42598417;BA.debugLine="recs.Set(rCnt, nrec)";
_recs.Set(_rcnt,(Object)(_nrec.getObject()));
 }
};
RDebugUtils.currentLine=42598419;
 //BA.debugLineNum = 42598419;BA.debugLine="End Sub";
return "";
}
public String  _forceupdate(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "forceupdate", true))
	 {return ((String) Debug.delegate(ba, "forceupdate", null));}
String _fu = "";
String _dkey = "";
String _rkey = "";
RDebugUtils.currentLine=44826624;
 //BA.debugLineNum = 44826624;BA.debugLine="Sub ForceUpdate";
RDebugUtils.currentLine=44826625;
 //BA.debugLineNum = 44826625;BA.debugLine="Dim fu As String = \"$forceUpdate\"";
_fu = "$forceUpdate";
RDebugUtils.currentLine=44826626;
 //BA.debugLineNum = 44826626;BA.debugLine="BOVue.RunMethod(fu, Null)";
__ref._bovue /*com.ab.banano.BANanoObject*/ .RunMethod(_fu,__c.Null);
RDebugUtils.currentLine=44826628;
 //BA.debugLineNum = 44826628;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
RDebugUtils.currentLine=44826629;
 //BA.debugLineNum = 44826629;BA.debugLine="data = BOVue.GetField(dKey).Result";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._bovue /*com.ab.banano.BANanoObject*/ .GetField(_dkey).Result()));
RDebugUtils.currentLine=44826631;
 //BA.debugLineNum = 44826631;BA.debugLine="Dim rKey As String = \"$refs\"";
_rkey = "$refs";
RDebugUtils.currentLine=44826632;
 //BA.debugLineNum = 44826632;BA.debugLine="refs = BOVue.GetField(rKey)";
__ref._refs /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._bovue /*com.ab.banano.BANanoObject*/ .GetField(_rkey).getObject()));
RDebugUtils.currentLine=44826633;
 //BA.debugLineNum = 44826633;BA.debugLine="End Sub";
return "";
}
public String  _getalphabets(b4j.example.bananovue __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getalphabets", true))
	 {return ((String) Debug.delegate(ba, "getalphabets", new Object[] {_value}));}
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
RDebugUtils.currentLine=34996224;
 //BA.debugLineNum = 34996224;BA.debugLine="Public Sub GetAlphabets(value As String) As String";
RDebugUtils.currentLine=34996225;
 //BA.debugLineNum = 34996225;BA.debugLine="value = CStr(value)";
_value = __ref._cstr /*String*/ (null,(Object)(_value));
RDebugUtils.currentLine=34996226;
 //BA.debugLineNum = 34996226;BA.debugLine="Try";
try {RDebugUtils.currentLine=34996227;
 //BA.debugLineNum = 34996227;BA.debugLine="value = value.Trim";
_value = _value.trim();
RDebugUtils.currentLine=34996228;
 //BA.debugLineNum = 34996228;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
RDebugUtils.currentLine=34996229;
 //BA.debugLineNum = 34996229;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
RDebugUtils.currentLine=34996230;
 //BA.debugLineNum = 34996230;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
RDebugUtils.currentLine=34996231;
 //BA.debugLineNum = 34996231;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
RDebugUtils.currentLine=34996232;
 //BA.debugLineNum = 34996232;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=34996233;
 //BA.debugLineNum = 34996233;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=34996234;
 //BA.debugLineNum = 34996234;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
RDebugUtils.currentLine=34996235;
 //BA.debugLineNum = 34996235;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (__ref._instr /*int*/ (null,"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ ",_mout)!=-1) { 
RDebugUtils.currentLine=34996236;
 //BA.debugLineNum = 34996236;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
RDebugUtils.currentLine=34996239;
 //BA.debugLineNum = 34996239;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=34996241;
 //BA.debugLineNum = 34996241;BA.debugLine="Return value";
if (true) return _value;
 };
RDebugUtils.currentLine=34996243;
 //BA.debugLineNum = 34996243;BA.debugLine="End Sub";
return "";
}
public String  _geteventtargetproperty(b4j.example.bananovue __ref,com.ab.banano.BANanoEvent _e,String _prop) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "geteventtargetproperty", true))
	 {return ((String) Debug.delegate(ba, "geteventtargetproperty", new Object[] {_e,_prop}));}
String _sid = "";
RDebugUtils.currentLine=43319296;
 //BA.debugLineNum = 43319296;BA.debugLine="Sub GetEventTargetProperty(e As BANanoEvent, prop";
RDebugUtils.currentLine=43319297;
 //BA.debugLineNum = 43319297;BA.debugLine="Dim sid As String = e.OtherField(\"target\").GetFie";
_sid = BA.ObjectToString(_e.OtherField("target").GetField(_prop).Result());
RDebugUtils.currentLine=43319298;
 //BA.debugLineNum = 43319298;BA.debugLine="Return sid";
if (true) return _sid;
RDebugUtils.currentLine=43319299;
 //BA.debugLineNum = 43319299;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue._fileobject  _getfiledetails(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _fileobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getfiledetails", true))
	 {return ((b4j.example.bananovue._fileobject) Debug.delegate(ba, "getfiledetails", new Object[] {_fileobj}));}
String _sname = "";
String _slastmodifieddate = "";
String _ssize = "";
String _stype = "";
b4j.example.bananovue._fileobject _ff = null;
RDebugUtils.currentLine=34734080;
 //BA.debugLineNum = 34734080;BA.debugLine="Sub GetFileDetails(fileObj As Map) As FileObject";
RDebugUtils.currentLine=34734081;
 //BA.debugLineNum = 34734081;BA.debugLine="Dim sname As String = fileObj.Get(\"name\")";
_sname = BA.ObjectToString(_fileobj.Get((Object)("name")));
RDebugUtils.currentLine=34734082;
 //BA.debugLineNum = 34734082;BA.debugLine="Dim slastModifiedDate As String = fileObj.Get(\"la";
_slastmodifieddate = BA.ObjectToString(_fileobj.Get((Object)("lastModifiedDate")));
RDebugUtils.currentLine=34734083;
 //BA.debugLineNum = 34734083;BA.debugLine="slastModifiedDate = Date2YYYYMMDDHHMM(slastModifi";
_slastmodifieddate = __ref._date2yyyymmddhhmm /*String*/ (null,(Object)(_slastmodifieddate));
RDebugUtils.currentLine=34734084;
 //BA.debugLineNum = 34734084;BA.debugLine="Dim ssize As String = fileObj.Get(\"size\")";
_ssize = BA.ObjectToString(_fileobj.Get((Object)("size")));
RDebugUtils.currentLine=34734085;
 //BA.debugLineNum = 34734085;BA.debugLine="Dim stype As String = fileObj.Get(\"type\")";
_stype = BA.ObjectToString(_fileobj.Get((Object)("type")));
RDebugUtils.currentLine=34734087;
 //BA.debugLineNum = 34734087;BA.debugLine="Dim ff As FileObject";
_ff = new b4j.example.bananovue._fileobject();
RDebugUtils.currentLine=34734088;
 //BA.debugLineNum = 34734088;BA.debugLine="ff.Initialize";
_ff.Initialize();
RDebugUtils.currentLine=34734089;
 //BA.debugLineNum = 34734089;BA.debugLine="ff.FileName = sname";
_ff.FileName /*String*/  = _sname;
RDebugUtils.currentLine=34734090;
 //BA.debugLineNum = 34734090;BA.debugLine="ff.FileDate = slastModifiedDate";
_ff.FileDate /*String*/  = _slastmodifieddate;
RDebugUtils.currentLine=34734091;
 //BA.debugLineNum = 34734091;BA.debugLine="ff.FileSize = ssize";
_ff.FileSize /*long*/  = (long)(Double.parseDouble(_ssize));
RDebugUtils.currentLine=34734092;
 //BA.debugLineNum = 34734092;BA.debugLine="ff.FileType = stype";
_ff.FileType /*String*/  = _stype;
RDebugUtils.currentLine=34734093;
 //BA.debugLineNum = 34734093;BA.debugLine="Return ff";
if (true) return _ff;
RDebugUtils.currentLine=34734094;
 //BA.debugLineNum = 34734094;BA.debugLine="End Sub";
return null;
}
public String  _getidfromevent(b4j.example.bananovue __ref,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getidfromevent", true))
	 {return ((String) Debug.delegate(ba, "getidfromevent", new Object[] {_e}));}
com.ab.banano.BANanoElement _cureve = null;
String _id = "";
RDebugUtils.currentLine=43188224;
 //BA.debugLineNum = 43188224;BA.debugLine="Sub GetIDFromEvent(e As BANanoEvent) As String";
RDebugUtils.currentLine=43188225;
 //BA.debugLineNum = 43188225;BA.debugLine="Dim curEve As BANanoElement = BANAno.ToElement(e.";
_cureve = new com.ab.banano.BANanoElement();
_cureve = __ref._banano /*com.ab.banano.BANano*/ .ToElement(_e.OtherField("currentTarget"));
RDebugUtils.currentLine=43188226;
 //BA.debugLineNum = 43188226;BA.debugLine="Dim id As String = curEve.GetField(\"id\").Result";
_id = BA.ObjectToString(_cureve.GetField("id").Result());
RDebugUtils.currentLine=43188227;
 //BA.debugLineNum = 43188227;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=43188228;
 //BA.debugLineNum = 43188228;BA.debugLine="End Sub";
return "";
}
public String  _getkeyfromevent(b4j.example.bananovue __ref,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getkeyfromevent", true))
	 {return ((String) Debug.delegate(ba, "getkeyfromevent", new Object[] {_e}));}
com.ab.banano.BANanoElement _cureve = null;
String _id = "";
RDebugUtils.currentLine=43253760;
 //BA.debugLineNum = 43253760;BA.debugLine="Sub GetKeyFromEvent(e As BANanoEvent) As String";
RDebugUtils.currentLine=43253761;
 //BA.debugLineNum = 43253761;BA.debugLine="Dim curEve As BANanoElement = BANAno.ToElement(e.";
_cureve = new com.ab.banano.BANanoElement();
_cureve = __ref._banano /*com.ab.banano.BANano*/ .ToElement(_e.OtherField("currentTarget"));
RDebugUtils.currentLine=43253762;
 //BA.debugLineNum = 43253762;BA.debugLine="Dim id As String = curEve.GetField(\"key\").Result";
_id = BA.ObjectToString(_cureve.GetField("key").Result());
RDebugUtils.currentLine=43253763;
 //BA.debugLineNum = 43253763;BA.debugLine="Return id";
if (true) return _id;
RDebugUtils.currentLine=43253764;
 //BA.debugLineNum = 43253764;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getstates(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getstates", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getstates", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.Map _sm = null;
String _lstrec = "";
Object _state = null;
RDebugUtils.currentLine=46202880;
 //BA.debugLineNum = 46202880;BA.debugLine="Sub GetStates(lst As List) As Map";
RDebugUtils.currentLine=46202881;
 //BA.debugLineNum = 46202881;BA.debugLine="Dim sm As Map = CreateMap()";
_sm = new anywheresoftware.b4a.objects.collections.Map();
_sm = __c.createMap(new Object[] {});
RDebugUtils.currentLine=46202882;
 //BA.debugLineNum = 46202882;BA.debugLine="For Each lstrec As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lstrec = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=46202883;
 //BA.debugLineNum = 46202883;BA.debugLine="lstrec = lstrec.tolowercase";
_lstrec = _lstrec.toLowerCase();
RDebugUtils.currentLine=46202884;
 //BA.debugLineNum = 46202884;BA.debugLine="Dim state As Object = GetState(lstrec, Null)";
_state = __ref._getstate /*Object*/ (null,_lstrec,__c.Null);
RDebugUtils.currentLine=46202885;
 //BA.debugLineNum = 46202885;BA.debugLine="sm.Put(lstrec, state)";
_sm.Put((Object)(_lstrec),_state);
 }
};
RDebugUtils.currentLine=46202887;
 //BA.debugLineNum = 46202887;BA.debugLine="Return sm";
if (true) return _sm;
RDebugUtils.currentLine=46202888;
 //BA.debugLineNum = 46202888;BA.debugLine="End Sub";
return null;
}
public boolean  _hasstate(b4j.example.bananovue __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "hasstate", true))
	 {return ((Boolean) Debug.delegate(ba, "hasstate", new Object[] {_k}));}
RDebugUtils.currentLine=46137344;
 //BA.debugLineNum = 46137344;BA.debugLine="Sub HasState(k As String) As Boolean";
RDebugUtils.currentLine=46137345;
 //BA.debugLineNum = 46137345;BA.debugLine="Return data.ContainsKey(k)";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_k));
RDebugUtils.currentLine=46137346;
 //BA.debugLineNum = 46137346;BA.debugLine="End Sub";
return false;
}
public String  _httpupload(b4j.example.bananovue __ref,Object _fileobj,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "httpupload", true))
	 {return ((String) Debug.delegate(ba, "httpupload", new Object[] {_fileobj,_module,_methodname}));}
com.ab.banano.BANanoPromise _promise = null;
String _error = "";
String _json = "";
RDebugUtils.currentLine=34865152;
 //BA.debugLineNum = 34865152;BA.debugLine="Sub HTTPUpload(fileObj As Object, module As Object";
RDebugUtils.currentLine=34865153;
 //BA.debugLineNum = 34865153;BA.debugLine="Dim promise As BANanoPromise 'ignore";
_promise = new com.ab.banano.BANanoPromise();
RDebugUtils.currentLine=34865155;
 //BA.debugLineNum = 34865155;BA.debugLine="Dim Error As String";
_error = "";
RDebugUtils.currentLine=34865156;
 //BA.debugLineNum = 34865156;BA.debugLine="Dim json As String";
_json = "";
RDebugUtils.currentLine=34865159;
 //BA.debugLineNum = 34865159;BA.debugLine="promise.CallSub(Me, \"DoUpload\", Array(fileObj))";
_promise.CallSub(this,"DoUpload",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj}));
RDebugUtils.currentLine=34865160;
 //BA.debugLineNum = 34865160;BA.debugLine="promise.ThenWait(json)";
_promise.ThenWait((Object)(_json));
RDebugUtils.currentLine=34865161;
 //BA.debugLineNum = 34865161;BA.debugLine="BANAno.CallSub(module, methodname, Array(fileObj,";
__ref._banano /*com.ab.banano.BANano*/ .CallSub(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj,(Object)(_json)}));
RDebugUtils.currentLine=34865162;
 //BA.debugLineNum = 34865162;BA.debugLine="promise.ElseWait(Error)  'ignore";
_promise.ElseWait((Object)(_error));
RDebugUtils.currentLine=34865163;
 //BA.debugLineNum = 34865163;BA.debugLine="BANAno.CallSub(module, methodname, Array(fileObj,";
__ref._banano /*com.ab.banano.BANano*/ .CallSub(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_fileobj,(Object)(_error)}));
RDebugUtils.currentLine=34865164;
 //BA.debugLineNum = 34865164;BA.debugLine="promise.End";
_promise.End();
RDebugUtils.currentLine=34865165;
 //BA.debugLineNum = 34865165;BA.debugLine="End Sub";
return "";
}
public String  _initialize(b4j.example.bananovue __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=40566784;
 //BA.debugLineNum = 40566784;BA.debugLine="Public Sub Initialize()";
RDebugUtils.currentLine=40566785;
 //BA.debugLineNum = 40566785;BA.debugLine="BOVue.Initialize(\"Vue\")";
__ref._bovue /*com.ab.banano.BANanoObject*/ .Initialize((Object)("Vue"));
RDebugUtils.currentLine=40566786;
 //BA.debugLineNum = 40566786;BA.debugLine="JQuery.Initialize(\"$\")";
__ref._jquery /*com.ab.banano.BANanoObject*/ .Initialize((Object)("$"));
RDebugUtils.currentLine=40566788;
 //BA.debugLineNum = 40566788;BA.debugLine="body = BANAno.GetElement(\"#body\")";
__ref._body /*com.ab.banano.BANanoElement*/  = __ref._banano /*com.ab.banano.BANano*/ .GetElement("#body");
RDebugUtils.currentLine=40566789;
 //BA.debugLineNum = 40566789;BA.debugLine="body.empty";
__ref._body /*com.ab.banano.BANanoElement*/ .Empty();
RDebugUtils.currentLine=40566791;
 //BA.debugLineNum = 40566791;BA.debugLine="body.Append($\"<div id=\"app\"></div>\"$)";
__ref._body /*com.ab.banano.BANanoElement*/ .Append(("<div id=\"app\"></div>"));
RDebugUtils.currentLine=40566792;
 //BA.debugLineNum = 40566792;BA.debugLine="Template.Initialize(\"app\",\"div\")";
__ref._template /*b4j.example.vuehtml*/ ._initialize /*b4j.example.vuehtml*/ (null,ba,"app","div");
RDebugUtils.currentLine=40566793;
 //BA.debugLineNum = 40566793;BA.debugLine="Template.SetVCloak";
__ref._template /*b4j.example.vuehtml*/ ._setvcloak /*b4j.example.vuehtml*/ (null);
RDebugUtils.currentLine=40566794;
 //BA.debugLineNum = 40566794;BA.debugLine="methods.Initialize";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=40566795;
 //BA.debugLineNum = 40566795;BA.debugLine="data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=40566796;
 //BA.debugLineNum = 40566796;BA.debugLine="computed.Initialize";
__ref._computed /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=40566797;
 //BA.debugLineNum = 40566797;BA.debugLine="watches.Initialize";
__ref._watches /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=40566798;
 //BA.debugLineNum = 40566798;BA.debugLine="routes.Initialize";
__ref._routes /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=40566799;
 //BA.debugLineNum = 40566799;BA.debugLine="beforeMount = Null";
__ref._beforemount /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566800;
 //BA.debugLineNum = 40566800;BA.debugLine="beforeUpdate = Null";
__ref._beforeupdate /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566801;
 //BA.debugLineNum = 40566801;BA.debugLine="created = Null";
__ref._created /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566802;
 //BA.debugLineNum = 40566802;BA.debugLine="mounted = Null";
__ref._mounted /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566803;
 //BA.debugLineNum = 40566803;BA.debugLine="destroyed = Null";
__ref._destroyed /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566804;
 //BA.debugLineNum = 40566804;BA.debugLine="updated = Null";
__ref._updated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566805;
 //BA.debugLineNum = 40566805;BA.debugLine="beforeCreate = Null";
__ref._beforecreate /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566806;
 //BA.debugLineNum = 40566806;BA.debugLine="activated = Null";
__ref._activated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566807;
 //BA.debugLineNum = 40566807;BA.debugLine="deactivated = Null";
__ref._deactivated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566808;
 //BA.debugLineNum = 40566808;BA.debugLine="beforeDestroy = Null";
__ref._beforedestroy /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__c.Null));
RDebugUtils.currentLine=40566810;
 //BA.debugLineNum = 40566810;BA.debugLine="TypeOfString = BOVue.GetField(\"String\")";
__ref._typeofstring /*com.ab.banano.BANanoObject*/  = __ref._bovue /*com.ab.banano.BANanoObject*/ .GetField("String");
RDebugUtils.currentLine=40566811;
 //BA.debugLineNum = 40566811;BA.debugLine="TypeOfNumber = BOVue.GetField(\"Number\")";
__ref._typeofnumber /*com.ab.banano.BANanoObject*/  = __ref._bovue /*com.ab.banano.BANanoObject*/ .GetField("Number");
RDebugUtils.currentLine=40566812;
 //BA.debugLineNum = 40566812;BA.debugLine="TypeOfBoolean = BOVue.GetField(\"Boolean\")";
__ref._typeofboolean /*com.ab.banano.BANanoObject*/  = __ref._bovue /*com.ab.banano.BANanoObject*/ .GetField("Boolean");
RDebugUtils.currentLine=40566813;
 //BA.debugLineNum = 40566813;BA.debugLine="TypeOfArray = BOVue.GetField(\"Array\")";
__ref._typeofarray /*com.ab.banano.BANanoObject*/  = __ref._bovue /*com.ab.banano.BANanoObject*/ .GetField("Array");
RDebugUtils.currentLine=40566814;
 //BA.debugLineNum = 40566814;BA.debugLine="TypeOfObject = BOVue.GetField(\"Object\")";
__ref._typeofobject /*com.ab.banano.BANanoObject*/  = __ref._bovue /*com.ab.banano.BANanoObject*/ .GetField("Object");
RDebugUtils.currentLine=40566815;
 //BA.debugLineNum = 40566815;BA.debugLine="TypeOfDate = BOVue.GetField(\"Date\")";
__ref._typeofdate /*com.ab.banano.BANanoObject*/  = __ref._bovue /*com.ab.banano.BANanoObject*/ .GetField("Date");
RDebugUtils.currentLine=40566816;
 //BA.debugLineNum = 40566816;BA.debugLine="TypeOfFunction = BOVue.GetField(\"Function\")";
__ref._typeoffunction /*com.ab.banano.BANanoObject*/  = __ref._bovue /*com.ab.banano.BANanoObject*/ .GetField("Function");
RDebugUtils.currentLine=40566817;
 //BA.debugLineNum = 40566817;BA.debugLine="TypeOfSymbol = BOVue.GetField(\"Symbol\")";
__ref._typeofsymbol /*com.ab.banano.BANanoObject*/  = __ref._bovue /*com.ab.banano.BANanoObject*/ .GetField("Symbol");
RDebugUtils.currentLine=40566818;
 //BA.debugLineNum = 40566818;BA.debugLine="Options = CreateMap()";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=40566819;
 //BA.debugLineNum = 40566819;BA.debugLine="dynamicStyle = CreateMap()";
__ref._dynamicstyle /*anywheresoftware.b4a.objects.collections.Map*/  = __c.createMap(new Object[] {});
RDebugUtils.currentLine=40566820;
 //BA.debugLineNum = 40566820;BA.debugLine="SetFontFamily(\"'Roboto', 'Helvetica', Arial, sans";
__ref._setfontfamily /*String*/ (null,(Object)("'Roboto', 'Helvetica', Arial, sans-serif"));
RDebugUtils.currentLine=40566822;
 //BA.debugLineNum = 40566822;BA.debugLine="Colors.initialize";
__ref._colors /*b4j.example.bananovue._colortypes*/ .Initialize();
RDebugUtils.currentLine=40566823;
 //BA.debugLineNum = 40566823;BA.debugLine="Colors.red = \"red\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .red /*String*/  = "red";
RDebugUtils.currentLine=40566824;
 //BA.debugLineNum = 40566824;BA.debugLine="Colors.pink = \"pink\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .pink /*String*/  = "pink";
RDebugUtils.currentLine=40566825;
 //BA.debugLineNum = 40566825;BA.debugLine="Colors.purple = \"purple\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .purple /*String*/  = "purple";
RDebugUtils.currentLine=40566826;
 //BA.debugLineNum = 40566826;BA.debugLine="Colors.deepPurple = \"deep-purple\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .deepPurple /*String*/  = "deep-purple";
RDebugUtils.currentLine=40566827;
 //BA.debugLineNum = 40566827;BA.debugLine="Colors.indigo = \"indigo\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .indigo /*String*/  = "indigo";
RDebugUtils.currentLine=40566828;
 //BA.debugLineNum = 40566828;BA.debugLine="Colors.blue = \"blue\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .blue /*String*/  = "blue";
RDebugUtils.currentLine=40566829;
 //BA.debugLineNum = 40566829;BA.debugLine="Colors.lightBlue = \"light-blue\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .lightBlue /*String*/  = "light-blue";
RDebugUtils.currentLine=40566830;
 //BA.debugLineNum = 40566830;BA.debugLine="Colors.cyan = \"cyan\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .cyan /*String*/  = "cyan";
RDebugUtils.currentLine=40566831;
 //BA.debugLineNum = 40566831;BA.debugLine="Colors.teal = \"teal\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .teal /*String*/  = "teal";
RDebugUtils.currentLine=40566832;
 //BA.debugLineNum = 40566832;BA.debugLine="Colors.green = \"green\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .green /*String*/  = "green";
RDebugUtils.currentLine=40566833;
 //BA.debugLineNum = 40566833;BA.debugLine="Colors.lightGreen = \"light-green\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .lightGreen /*String*/  = "light-green";
RDebugUtils.currentLine=40566834;
 //BA.debugLineNum = 40566834;BA.debugLine="Colors.lime = \"lime\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .lime /*String*/  = "lime";
RDebugUtils.currentLine=40566835;
 //BA.debugLineNum = 40566835;BA.debugLine="Colors.yellow = \"yellow\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .yellow /*String*/  = "yellow";
RDebugUtils.currentLine=40566836;
 //BA.debugLineNum = 40566836;BA.debugLine="Colors.amber = \"amber\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .amber /*String*/  = "amber";
RDebugUtils.currentLine=40566837;
 //BA.debugLineNum = 40566837;BA.debugLine="Colors.Orange = \"orange\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .Orange /*String*/  = "orange";
RDebugUtils.currentLine=40566838;
 //BA.debugLineNum = 40566838;BA.debugLine="Colors.deepOrange = \"deep-orange\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .deepOrange /*String*/  = "deep-orange";
RDebugUtils.currentLine=40566839;
 //BA.debugLineNum = 40566839;BA.debugLine="Colors.brown = \"brown\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .brown /*String*/  = "brown";
RDebugUtils.currentLine=40566840;
 //BA.debugLineNum = 40566840;BA.debugLine="Colors.grey = \"grey\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .grey /*String*/  = "grey";
RDebugUtils.currentLine=40566841;
 //BA.debugLineNum = 40566841;BA.debugLine="Colors.blueGrey = \"blue-grey\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .blueGrey /*String*/  = "blue-grey";
RDebugUtils.currentLine=40566842;
 //BA.debugLineNum = 40566842;BA.debugLine="Colors.black = \"black\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .black /*String*/  = "black";
RDebugUtils.currentLine=40566843;
 //BA.debugLineNum = 40566843;BA.debugLine="Colors.white = \"white\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .white /*String*/  = "white";
RDebugUtils.currentLine=40566844;
 //BA.debugLineNum = 40566844;BA.debugLine="Colors.transparent = \"transparent\"";
__ref._colors /*b4j.example.bananovue._colortypes*/ .transparent /*String*/  = "transparent";
RDebugUtils.currentLine=40566846;
 //BA.debugLineNum = 40566846;BA.debugLine="ColorMap.Initialize";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=40566847;
 //BA.debugLineNum = 40566847;BA.debugLine="ColorMap.put(\"red lighten-5\", \"#ffebee\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red lighten-5"),(Object)("#ffebee"));
RDebugUtils.currentLine=40566848;
 //BA.debugLineNum = 40566848;BA.debugLine="ColorMap.put(\"red lighten-4\", \"#ffcdd2\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red lighten-4"),(Object)("#ffcdd2"));
RDebugUtils.currentLine=40566849;
 //BA.debugLineNum = 40566849;BA.debugLine="ColorMap.put(\"red lighten-3\", \"#ef9a9a\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red lighten-3"),(Object)("#ef9a9a"));
RDebugUtils.currentLine=40566850;
 //BA.debugLineNum = 40566850;BA.debugLine="ColorMap.put(\"red lighten-2\", \"#e57373\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red lighten-2"),(Object)("#e57373"));
RDebugUtils.currentLine=40566851;
 //BA.debugLineNum = 40566851;BA.debugLine="ColorMap.put(\"red lighten-1\", \"#ef5350\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red lighten-1"),(Object)("#ef5350"));
RDebugUtils.currentLine=40566852;
 //BA.debugLineNum = 40566852;BA.debugLine="ColorMap.put(\"red\", \"#f44336\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red"),(Object)("#f44336"));
RDebugUtils.currentLine=40566853;
 //BA.debugLineNum = 40566853;BA.debugLine="ColorMap.put(\"red darken-1\", \"#e53935\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red darken-1"),(Object)("#e53935"));
RDebugUtils.currentLine=40566854;
 //BA.debugLineNum = 40566854;BA.debugLine="ColorMap.put(\"red darken-2\", \"#d32f2f\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red darken-2"),(Object)("#d32f2f"));
RDebugUtils.currentLine=40566855;
 //BA.debugLineNum = 40566855;BA.debugLine="ColorMap.put(\"red darken-3\", \"#c62828\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red darken-3"),(Object)("#c62828"));
RDebugUtils.currentLine=40566856;
 //BA.debugLineNum = 40566856;BA.debugLine="ColorMap.put(\"red darken-4\", \"#b71c1c\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red darken-4"),(Object)("#b71c1c"));
RDebugUtils.currentLine=40566857;
 //BA.debugLineNum = 40566857;BA.debugLine="ColorMap.put(\"red accent-1\", \"#ff8a80\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red accent-1"),(Object)("#ff8a80"));
RDebugUtils.currentLine=40566858;
 //BA.debugLineNum = 40566858;BA.debugLine="ColorMap.put(\"red accent-2\", \"#ff5252\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red accent-2"),(Object)("#ff5252"));
RDebugUtils.currentLine=40566859;
 //BA.debugLineNum = 40566859;BA.debugLine="ColorMap.put(\"red accent-3\", \"#ff1744\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red accent-3"),(Object)("#ff1744"));
RDebugUtils.currentLine=40566860;
 //BA.debugLineNum = 40566860;BA.debugLine="ColorMap.put(\"red accent-4\", \"#d50000\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("red accent-4"),(Object)("#d50000"));
RDebugUtils.currentLine=40566861;
 //BA.debugLineNum = 40566861;BA.debugLine="ColorMap.put(\"pink lighten-5\", \"#fce4ec\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink lighten-5"),(Object)("#fce4ec"));
RDebugUtils.currentLine=40566862;
 //BA.debugLineNum = 40566862;BA.debugLine="ColorMap.put(\"pink lighten-4\", \"#f8bbd0\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink lighten-4"),(Object)("#f8bbd0"));
RDebugUtils.currentLine=40566863;
 //BA.debugLineNum = 40566863;BA.debugLine="ColorMap.put(\"pink lighten-3\", \"#f48fb1\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink lighten-3"),(Object)("#f48fb1"));
RDebugUtils.currentLine=40566864;
 //BA.debugLineNum = 40566864;BA.debugLine="ColorMap.put(\"pink lighten-2\", \"#f06292\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink lighten-2"),(Object)("#f06292"));
RDebugUtils.currentLine=40566865;
 //BA.debugLineNum = 40566865;BA.debugLine="ColorMap.put(\"pink lighten-1\", \"#ec407a\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink lighten-1"),(Object)("#ec407a"));
RDebugUtils.currentLine=40566866;
 //BA.debugLineNum = 40566866;BA.debugLine="ColorMap.put(\"pink\", \"#e91e63\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink"),(Object)("#e91e63"));
RDebugUtils.currentLine=40566867;
 //BA.debugLineNum = 40566867;BA.debugLine="ColorMap.put(\"pink darken-1\", \"#d81b60\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink darken-1"),(Object)("#d81b60"));
RDebugUtils.currentLine=40566868;
 //BA.debugLineNum = 40566868;BA.debugLine="ColorMap.put(\"pink darken-2\", \"#c2185b\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink darken-2"),(Object)("#c2185b"));
RDebugUtils.currentLine=40566869;
 //BA.debugLineNum = 40566869;BA.debugLine="ColorMap.put(\"pink darken-3\", \"#ad1457\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink darken-3"),(Object)("#ad1457"));
RDebugUtils.currentLine=40566870;
 //BA.debugLineNum = 40566870;BA.debugLine="ColorMap.put(\"pink darken-4\", \"#880e4f\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink darken-4"),(Object)("#880e4f"));
RDebugUtils.currentLine=40566871;
 //BA.debugLineNum = 40566871;BA.debugLine="ColorMap.put(\"pink accent-1\", \"#ff80ab\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink accent-1"),(Object)("#ff80ab"));
RDebugUtils.currentLine=40566872;
 //BA.debugLineNum = 40566872;BA.debugLine="ColorMap.put(\"pink accent-2\", \"#ff4081\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink accent-2"),(Object)("#ff4081"));
RDebugUtils.currentLine=40566873;
 //BA.debugLineNum = 40566873;BA.debugLine="ColorMap.put(\"pink accent-3\", \"#f50057\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink accent-3"),(Object)("#f50057"));
RDebugUtils.currentLine=40566874;
 //BA.debugLineNum = 40566874;BA.debugLine="ColorMap.put(\"pink accent-4\", \"#c51162\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pink accent-4"),(Object)("#c51162"));
RDebugUtils.currentLine=40566875;
 //BA.debugLineNum = 40566875;BA.debugLine="ColorMap.put(\"purple lighten-5\", \"#f3e5f5\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple lighten-5"),(Object)("#f3e5f5"));
RDebugUtils.currentLine=40566876;
 //BA.debugLineNum = 40566876;BA.debugLine="ColorMap.put(\"purple lighten-4\", \"#e1bee7\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple lighten-4"),(Object)("#e1bee7"));
RDebugUtils.currentLine=40566877;
 //BA.debugLineNum = 40566877;BA.debugLine="ColorMap.put(\"purple lighten-3\", \"#ce93d8\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple lighten-3"),(Object)("#ce93d8"));
RDebugUtils.currentLine=40566878;
 //BA.debugLineNum = 40566878;BA.debugLine="ColorMap.put(\"purple lighten-2\", \"#ba68c8\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple lighten-2"),(Object)("#ba68c8"));
RDebugUtils.currentLine=40566879;
 //BA.debugLineNum = 40566879;BA.debugLine="ColorMap.put(\"purple lighten-1\", \"#ab47bc\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple lighten-1"),(Object)("#ab47bc"));
RDebugUtils.currentLine=40566880;
 //BA.debugLineNum = 40566880;BA.debugLine="ColorMap.put(\"purple\", \"#9c27b0\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple"),(Object)("#9c27b0"));
RDebugUtils.currentLine=40566881;
 //BA.debugLineNum = 40566881;BA.debugLine="ColorMap.put(\"purple darken-1\", \"#8e24aa\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple darken-1"),(Object)("#8e24aa"));
RDebugUtils.currentLine=40566882;
 //BA.debugLineNum = 40566882;BA.debugLine="ColorMap.put(\"purple darken-2\", \"#7b1fa2\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple darken-2"),(Object)("#7b1fa2"));
RDebugUtils.currentLine=40566883;
 //BA.debugLineNum = 40566883;BA.debugLine="ColorMap.put(\"purple darken-3\", \"#6a1b9a\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple darken-3"),(Object)("#6a1b9a"));
RDebugUtils.currentLine=40566884;
 //BA.debugLineNum = 40566884;BA.debugLine="ColorMap.put(\"purple darken-4\", \"#4a148c\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple darken-4"),(Object)("#4a148c"));
RDebugUtils.currentLine=40566885;
 //BA.debugLineNum = 40566885;BA.debugLine="ColorMap.put(\"purple accent-1\", \"#ea80fc\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple accent-1"),(Object)("#ea80fc"));
RDebugUtils.currentLine=40566886;
 //BA.debugLineNum = 40566886;BA.debugLine="ColorMap.put(\"purple accent-2\", \"#e040fb\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple accent-2"),(Object)("#e040fb"));
RDebugUtils.currentLine=40566887;
 //BA.debugLineNum = 40566887;BA.debugLine="ColorMap.put(\"purple accent-3\", \"#d500f9\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple accent-3"),(Object)("#d500f9"));
RDebugUtils.currentLine=40566888;
 //BA.debugLineNum = 40566888;BA.debugLine="ColorMap.put(\"purple accent-4\", \"#aa00ff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("purple accent-4"),(Object)("#aa00ff"));
RDebugUtils.currentLine=40566889;
 //BA.debugLineNum = 40566889;BA.debugLine="ColorMap.put(\"deep-purple lighten-5\", \"#ede7f6\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple lighten-5"),(Object)("#ede7f6"));
RDebugUtils.currentLine=40566890;
 //BA.debugLineNum = 40566890;BA.debugLine="ColorMap.put(\"deep-purple lighten-4\", \"#d1c4e9\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple lighten-4"),(Object)("#d1c4e9"));
RDebugUtils.currentLine=40566891;
 //BA.debugLineNum = 40566891;BA.debugLine="ColorMap.put(\"deep-purple lighten-3\", \"#b39ddb\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple lighten-3"),(Object)("#b39ddb"));
RDebugUtils.currentLine=40566892;
 //BA.debugLineNum = 40566892;BA.debugLine="ColorMap.put(\"deep-purple lighten-2\", \"#9575cd\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple lighten-2"),(Object)("#9575cd"));
RDebugUtils.currentLine=40566893;
 //BA.debugLineNum = 40566893;BA.debugLine="ColorMap.put(\"deep-purple lighten-1\", \"#7e57c2\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple lighten-1"),(Object)("#7e57c2"));
RDebugUtils.currentLine=40566894;
 //BA.debugLineNum = 40566894;BA.debugLine="ColorMap.put(\"deep-purple\", \"#673ab7\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple"),(Object)("#673ab7"));
RDebugUtils.currentLine=40566895;
 //BA.debugLineNum = 40566895;BA.debugLine="ColorMap.put(\"deep-purple darken-1\", \"#5e35b1\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple darken-1"),(Object)("#5e35b1"));
RDebugUtils.currentLine=40566896;
 //BA.debugLineNum = 40566896;BA.debugLine="ColorMap.put(\"deep-purple darken-2\", \"#512da8\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple darken-2"),(Object)("#512da8"));
RDebugUtils.currentLine=40566897;
 //BA.debugLineNum = 40566897;BA.debugLine="ColorMap.put(\"deep-purple darken-3\", \"#4527a0\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple darken-3"),(Object)("#4527a0"));
RDebugUtils.currentLine=40566898;
 //BA.debugLineNum = 40566898;BA.debugLine="ColorMap.put(\"deep-purple darken-4\", \"#311b92\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple darken-4"),(Object)("#311b92"));
RDebugUtils.currentLine=40566899;
 //BA.debugLineNum = 40566899;BA.debugLine="ColorMap.put(\"deep-purple accent-1\", \"#b388ff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple accent-1"),(Object)("#b388ff"));
RDebugUtils.currentLine=40566900;
 //BA.debugLineNum = 40566900;BA.debugLine="ColorMap.put(\"deep-purple accent-2\", \"#7c4dff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple accent-2"),(Object)("#7c4dff"));
RDebugUtils.currentLine=40566901;
 //BA.debugLineNum = 40566901;BA.debugLine="ColorMap.put(\"deep-purple accent-3\", \"#651fff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple accent-3"),(Object)("#651fff"));
RDebugUtils.currentLine=40566902;
 //BA.debugLineNum = 40566902;BA.debugLine="ColorMap.put(\"deep-purple accent-4\", \"#6200ea\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-purple accent-4"),(Object)("#6200ea"));
RDebugUtils.currentLine=40566903;
 //BA.debugLineNum = 40566903;BA.debugLine="ColorMap.put(\"indigo lighten-5\", \"#e8eaf6\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo lighten-5"),(Object)("#e8eaf6"));
RDebugUtils.currentLine=40566904;
 //BA.debugLineNum = 40566904;BA.debugLine="ColorMap.put(\"indigo lighten-4\", \"#c5cae9\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo lighten-4"),(Object)("#c5cae9"));
RDebugUtils.currentLine=40566905;
 //BA.debugLineNum = 40566905;BA.debugLine="ColorMap.put(\"indigo lighten-3\", \"#9fa8da\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo lighten-3"),(Object)("#9fa8da"));
RDebugUtils.currentLine=40566906;
 //BA.debugLineNum = 40566906;BA.debugLine="ColorMap.put(\"indigo lighten-2\", \"#7986cb\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo lighten-2"),(Object)("#7986cb"));
RDebugUtils.currentLine=40566907;
 //BA.debugLineNum = 40566907;BA.debugLine="ColorMap.put(\"indigo lighten-1\", \"#5c6bc0\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo lighten-1"),(Object)("#5c6bc0"));
RDebugUtils.currentLine=40566908;
 //BA.debugLineNum = 40566908;BA.debugLine="ColorMap.put(\"indigo\", \"#3f51b5\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo"),(Object)("#3f51b5"));
RDebugUtils.currentLine=40566909;
 //BA.debugLineNum = 40566909;BA.debugLine="ColorMap.put(\"indigo darken-1\", \"#3949ab\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo darken-1"),(Object)("#3949ab"));
RDebugUtils.currentLine=40566910;
 //BA.debugLineNum = 40566910;BA.debugLine="ColorMap.put(\"indigo darken-2\", \"#303f9f\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo darken-2"),(Object)("#303f9f"));
RDebugUtils.currentLine=40566911;
 //BA.debugLineNum = 40566911;BA.debugLine="ColorMap.put(\"indigo darken-3\", \"#283593\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo darken-3"),(Object)("#283593"));
RDebugUtils.currentLine=40566912;
 //BA.debugLineNum = 40566912;BA.debugLine="ColorMap.put(\"indigo darken-4\", \"#1a237e\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo darken-4"),(Object)("#1a237e"));
RDebugUtils.currentLine=40566913;
 //BA.debugLineNum = 40566913;BA.debugLine="ColorMap.put(\"indigo accent-1\", \"#8c9eff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo accent-1"),(Object)("#8c9eff"));
RDebugUtils.currentLine=40566914;
 //BA.debugLineNum = 40566914;BA.debugLine="ColorMap.put(\"indigo accent-2\", \"#536dfe\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo accent-2"),(Object)("#536dfe"));
RDebugUtils.currentLine=40566915;
 //BA.debugLineNum = 40566915;BA.debugLine="ColorMap.put(\"indigo accent-3\", \"#3d5afe\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo accent-3"),(Object)("#3d5afe"));
RDebugUtils.currentLine=40566916;
 //BA.debugLineNum = 40566916;BA.debugLine="ColorMap.put(\"indigo accent-4\", \"#304ffe\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("indigo accent-4"),(Object)("#304ffe"));
RDebugUtils.currentLine=40566917;
 //BA.debugLineNum = 40566917;BA.debugLine="ColorMap.put(\"blue lighten-5\", \"#e3f2fd\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue lighten-5"),(Object)("#e3f2fd"));
RDebugUtils.currentLine=40566918;
 //BA.debugLineNum = 40566918;BA.debugLine="ColorMap.put(\"blue lighten-4\", \"#bbdefb\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue lighten-4"),(Object)("#bbdefb"));
RDebugUtils.currentLine=40566919;
 //BA.debugLineNum = 40566919;BA.debugLine="ColorMap.put(\"blue lighten-3\", \"#90caf9\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue lighten-3"),(Object)("#90caf9"));
RDebugUtils.currentLine=40566920;
 //BA.debugLineNum = 40566920;BA.debugLine="ColorMap.put(\"blue lighten-2\", \"#64b5f6\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue lighten-2"),(Object)("#64b5f6"));
RDebugUtils.currentLine=40566921;
 //BA.debugLineNum = 40566921;BA.debugLine="ColorMap.put(\"blue lighten-1\", \"#42a5f5\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue lighten-1"),(Object)("#42a5f5"));
RDebugUtils.currentLine=40566922;
 //BA.debugLineNum = 40566922;BA.debugLine="ColorMap.put(\"blue\", \"#2196f3\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue"),(Object)("#2196f3"));
RDebugUtils.currentLine=40566923;
 //BA.debugLineNum = 40566923;BA.debugLine="ColorMap.put(\"blue darken-1\", \"#1e88e5\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue darken-1"),(Object)("#1e88e5"));
RDebugUtils.currentLine=40566924;
 //BA.debugLineNum = 40566924;BA.debugLine="ColorMap.put(\"blue darken-2\", \"#1976d2\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue darken-2"),(Object)("#1976d2"));
RDebugUtils.currentLine=40566925;
 //BA.debugLineNum = 40566925;BA.debugLine="ColorMap.put(\"blue darken-3\", \"#1565c0\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue darken-3"),(Object)("#1565c0"));
RDebugUtils.currentLine=40566926;
 //BA.debugLineNum = 40566926;BA.debugLine="ColorMap.put(\"blue darken-4\", \"#0d47a1\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue darken-4"),(Object)("#0d47a1"));
RDebugUtils.currentLine=40566927;
 //BA.debugLineNum = 40566927;BA.debugLine="ColorMap.put(\"blue accent-1\", \"#82b1ff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue accent-1"),(Object)("#82b1ff"));
RDebugUtils.currentLine=40566928;
 //BA.debugLineNum = 40566928;BA.debugLine="ColorMap.put(\"blue accent-2\", \"#448aff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue accent-2"),(Object)("#448aff"));
RDebugUtils.currentLine=40566929;
 //BA.debugLineNum = 40566929;BA.debugLine="ColorMap.put(\"blue accent-3\", \"#2979ff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue accent-3"),(Object)("#2979ff"));
RDebugUtils.currentLine=40566930;
 //BA.debugLineNum = 40566930;BA.debugLine="ColorMap.put(\"blue accent-4\", \"#2962ff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue accent-4"),(Object)("#2962ff"));
RDebugUtils.currentLine=40566931;
 //BA.debugLineNum = 40566931;BA.debugLine="ColorMap.put(\"light-blue lighten-5\", \"#e1f5fe\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue lighten-5"),(Object)("#e1f5fe"));
RDebugUtils.currentLine=40566932;
 //BA.debugLineNum = 40566932;BA.debugLine="ColorMap.put(\"light-blue lighten-4\", \"#b3e5fc\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue lighten-4"),(Object)("#b3e5fc"));
RDebugUtils.currentLine=40566933;
 //BA.debugLineNum = 40566933;BA.debugLine="ColorMap.put(\"light-blue lighten-3\", \"#81d4fa\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue lighten-3"),(Object)("#81d4fa"));
RDebugUtils.currentLine=40566934;
 //BA.debugLineNum = 40566934;BA.debugLine="ColorMap.put(\"light-blue lighten-2\", \"#4fc3f7\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue lighten-2"),(Object)("#4fc3f7"));
RDebugUtils.currentLine=40566935;
 //BA.debugLineNum = 40566935;BA.debugLine="ColorMap.put(\"light-blue lighten-1\", \"#29b6f6\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue lighten-1"),(Object)("#29b6f6"));
RDebugUtils.currentLine=40566936;
 //BA.debugLineNum = 40566936;BA.debugLine="ColorMap.put(\"light-blue\", \"#03a9f4\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue"),(Object)("#03a9f4"));
RDebugUtils.currentLine=40566937;
 //BA.debugLineNum = 40566937;BA.debugLine="ColorMap.put(\"light-blue darken-1\", \"#039be5\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue darken-1"),(Object)("#039be5"));
RDebugUtils.currentLine=40566938;
 //BA.debugLineNum = 40566938;BA.debugLine="ColorMap.put(\"light-blue darken-2\", \"#0288d1\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue darken-2"),(Object)("#0288d1"));
RDebugUtils.currentLine=40566939;
 //BA.debugLineNum = 40566939;BA.debugLine="ColorMap.put(\"light-blue darken-3\", \"#0277bd\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue darken-3"),(Object)("#0277bd"));
RDebugUtils.currentLine=40566940;
 //BA.debugLineNum = 40566940;BA.debugLine="ColorMap.put(\"light-blue darken-4\", \"#01579b\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue darken-4"),(Object)("#01579b"));
RDebugUtils.currentLine=40566941;
 //BA.debugLineNum = 40566941;BA.debugLine="ColorMap.put(\"light-blue accent-1\", \"#80d8ff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue accent-1"),(Object)("#80d8ff"));
RDebugUtils.currentLine=40566942;
 //BA.debugLineNum = 40566942;BA.debugLine="ColorMap.put(\"light-blue accent-2\", \"#40c4ff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue accent-2"),(Object)("#40c4ff"));
RDebugUtils.currentLine=40566943;
 //BA.debugLineNum = 40566943;BA.debugLine="ColorMap.put(\"light-blue accent-3\", \"#00b0ff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue accent-3"),(Object)("#00b0ff"));
RDebugUtils.currentLine=40566944;
 //BA.debugLineNum = 40566944;BA.debugLine="ColorMap.put(\"light-blue accent-4\", \"#0091ea\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-blue accent-4"),(Object)("#0091ea"));
RDebugUtils.currentLine=40566945;
 //BA.debugLineNum = 40566945;BA.debugLine="ColorMap.put(\"cyan lighten-5\", \"#e0f7fa\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan lighten-5"),(Object)("#e0f7fa"));
RDebugUtils.currentLine=40566946;
 //BA.debugLineNum = 40566946;BA.debugLine="ColorMap.put(\"cyan lighten-4\", \"#b2ebf2\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan lighten-4"),(Object)("#b2ebf2"));
RDebugUtils.currentLine=40566947;
 //BA.debugLineNum = 40566947;BA.debugLine="ColorMap.put(\"cyan lighten-3\", \"#80deea\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan lighten-3"),(Object)("#80deea"));
RDebugUtils.currentLine=40566948;
 //BA.debugLineNum = 40566948;BA.debugLine="ColorMap.put(\"cyan lighten-2\", \"#4dd0e1\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan lighten-2"),(Object)("#4dd0e1"));
RDebugUtils.currentLine=40566949;
 //BA.debugLineNum = 40566949;BA.debugLine="ColorMap.put(\"cyan lighten-1\", \"#26c6da\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan lighten-1"),(Object)("#26c6da"));
RDebugUtils.currentLine=40566950;
 //BA.debugLineNum = 40566950;BA.debugLine="ColorMap.put(\"cyan\", \"#00bcd4\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan"),(Object)("#00bcd4"));
RDebugUtils.currentLine=40566951;
 //BA.debugLineNum = 40566951;BA.debugLine="ColorMap.put(\"cyan darken-1\", \"#00acc1\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan darken-1"),(Object)("#00acc1"));
RDebugUtils.currentLine=40566952;
 //BA.debugLineNum = 40566952;BA.debugLine="ColorMap.put(\"cyan darken-2\", \"#0097a7\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan darken-2"),(Object)("#0097a7"));
RDebugUtils.currentLine=40566953;
 //BA.debugLineNum = 40566953;BA.debugLine="ColorMap.put(\"cyan darken-3\", \"#00838f\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan darken-3"),(Object)("#00838f"));
RDebugUtils.currentLine=40566954;
 //BA.debugLineNum = 40566954;BA.debugLine="ColorMap.put(\"cyan darken-4\", \"#006064\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan darken-4"),(Object)("#006064"));
RDebugUtils.currentLine=40566955;
 //BA.debugLineNum = 40566955;BA.debugLine="ColorMap.put(\"cyan accent-1\", \"#84ffff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan accent-1"),(Object)("#84ffff"));
RDebugUtils.currentLine=40566956;
 //BA.debugLineNum = 40566956;BA.debugLine="ColorMap.put(\"cyan accent-2\", \"#18ffff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan accent-2"),(Object)("#18ffff"));
RDebugUtils.currentLine=40566957;
 //BA.debugLineNum = 40566957;BA.debugLine="ColorMap.put(\"cyan accent-3\", \"#00e5ff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan accent-3"),(Object)("#00e5ff"));
RDebugUtils.currentLine=40566958;
 //BA.debugLineNum = 40566958;BA.debugLine="ColorMap.put(\"cyan accent-4\", \"#00b8d4\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("cyan accent-4"),(Object)("#00b8d4"));
RDebugUtils.currentLine=40566959;
 //BA.debugLineNum = 40566959;BA.debugLine="ColorMap.put(\"teal lighten-5\", \"#e0f2f1\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal lighten-5"),(Object)("#e0f2f1"));
RDebugUtils.currentLine=40566960;
 //BA.debugLineNum = 40566960;BA.debugLine="ColorMap.put(\"teal lighten-4\", \"#b2dfdb\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal lighten-4"),(Object)("#b2dfdb"));
RDebugUtils.currentLine=40566961;
 //BA.debugLineNum = 40566961;BA.debugLine="ColorMap.put(\"teal lighten-3\", \"#80cbc4\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal lighten-3"),(Object)("#80cbc4"));
RDebugUtils.currentLine=40566962;
 //BA.debugLineNum = 40566962;BA.debugLine="ColorMap.put(\"teal lighten-2\", \"#4db6ac\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal lighten-2"),(Object)("#4db6ac"));
RDebugUtils.currentLine=40566963;
 //BA.debugLineNum = 40566963;BA.debugLine="ColorMap.put(\"teal lighten-1\", \"#26a69a\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal lighten-1"),(Object)("#26a69a"));
RDebugUtils.currentLine=40566964;
 //BA.debugLineNum = 40566964;BA.debugLine="ColorMap.put(\"teal\", \"#009688\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal"),(Object)("#009688"));
RDebugUtils.currentLine=40566965;
 //BA.debugLineNum = 40566965;BA.debugLine="ColorMap.put(\"teal darken-1\", \"#00897b\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal darken-1"),(Object)("#00897b"));
RDebugUtils.currentLine=40566966;
 //BA.debugLineNum = 40566966;BA.debugLine="ColorMap.put(\"teal darken-2\", \"#00796b\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal darken-2"),(Object)("#00796b"));
RDebugUtils.currentLine=40566967;
 //BA.debugLineNum = 40566967;BA.debugLine="ColorMap.put(\"teal darken-3\", \"#00695c\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal darken-3"),(Object)("#00695c"));
RDebugUtils.currentLine=40566968;
 //BA.debugLineNum = 40566968;BA.debugLine="ColorMap.put(\"teal darken-4\", \"#004d40\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal darken-4"),(Object)("#004d40"));
RDebugUtils.currentLine=40566969;
 //BA.debugLineNum = 40566969;BA.debugLine="ColorMap.put(\"teal accent-1\", \"#a7ffeb\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal accent-1"),(Object)("#a7ffeb"));
RDebugUtils.currentLine=40566970;
 //BA.debugLineNum = 40566970;BA.debugLine="ColorMap.put(\"teal accent-2\", \"#64ffda\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal accent-2"),(Object)("#64ffda"));
RDebugUtils.currentLine=40566971;
 //BA.debugLineNum = 40566971;BA.debugLine="ColorMap.put(\"teal accent-3\", \"#1de9b6\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal accent-3"),(Object)("#1de9b6"));
RDebugUtils.currentLine=40566972;
 //BA.debugLineNum = 40566972;BA.debugLine="ColorMap.put(\"teal accent-4\", \"#00bfa5\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("teal accent-4"),(Object)("#00bfa5"));
RDebugUtils.currentLine=40566973;
 //BA.debugLineNum = 40566973;BA.debugLine="ColorMap.put(\"green lighten-5\", \"#e8f5e9\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green lighten-5"),(Object)("#e8f5e9"));
RDebugUtils.currentLine=40566974;
 //BA.debugLineNum = 40566974;BA.debugLine="ColorMap.put(\"green lighten-4\", \"#c8e6c9\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green lighten-4"),(Object)("#c8e6c9"));
RDebugUtils.currentLine=40566975;
 //BA.debugLineNum = 40566975;BA.debugLine="ColorMap.put(\"green lighten-3\", \"#a5d6a7\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green lighten-3"),(Object)("#a5d6a7"));
RDebugUtils.currentLine=40566976;
 //BA.debugLineNum = 40566976;BA.debugLine="ColorMap.put(\"green lighten-2\", \"#81c784\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green lighten-2"),(Object)("#81c784"));
RDebugUtils.currentLine=40566977;
 //BA.debugLineNum = 40566977;BA.debugLine="ColorMap.put(\"green lighten-1\", \"#66bb6a\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green lighten-1"),(Object)("#66bb6a"));
RDebugUtils.currentLine=40566978;
 //BA.debugLineNum = 40566978;BA.debugLine="ColorMap.put(\"green\", \"#4caf50\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green"),(Object)("#4caf50"));
RDebugUtils.currentLine=40566979;
 //BA.debugLineNum = 40566979;BA.debugLine="ColorMap.put(\"green darken-1\", \"#43a047\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green darken-1"),(Object)("#43a047"));
RDebugUtils.currentLine=40566980;
 //BA.debugLineNum = 40566980;BA.debugLine="ColorMap.put(\"green darken-2\", \"#388e3c\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green darken-2"),(Object)("#388e3c"));
RDebugUtils.currentLine=40566981;
 //BA.debugLineNum = 40566981;BA.debugLine="ColorMap.put(\"green darken-3\", \"#2e7d32\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green darken-3"),(Object)("#2e7d32"));
RDebugUtils.currentLine=40566982;
 //BA.debugLineNum = 40566982;BA.debugLine="ColorMap.put(\"green darken-4\", \"#1b5e20\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green darken-4"),(Object)("#1b5e20"));
RDebugUtils.currentLine=40566983;
 //BA.debugLineNum = 40566983;BA.debugLine="ColorMap.put(\"green accent-1\", \"#b9f6ca\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green accent-1"),(Object)("#b9f6ca"));
RDebugUtils.currentLine=40566984;
 //BA.debugLineNum = 40566984;BA.debugLine="ColorMap.put(\"green accent-2\", \"#69f0ae\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green accent-2"),(Object)("#69f0ae"));
RDebugUtils.currentLine=40566985;
 //BA.debugLineNum = 40566985;BA.debugLine="ColorMap.put(\"green accent-3\", \"#00e676\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green accent-3"),(Object)("#00e676"));
RDebugUtils.currentLine=40566986;
 //BA.debugLineNum = 40566986;BA.debugLine="ColorMap.put(\"green accent-4\", \"#00c853\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("green accent-4"),(Object)("#00c853"));
RDebugUtils.currentLine=40566987;
 //BA.debugLineNum = 40566987;BA.debugLine="ColorMap.put(\"light-green lighten-5\", \"#f1f8e9\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green lighten-5"),(Object)("#f1f8e9"));
RDebugUtils.currentLine=40566988;
 //BA.debugLineNum = 40566988;BA.debugLine="ColorMap.put(\"light-green lighten-4\", \"#dcedc8\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green lighten-4"),(Object)("#dcedc8"));
RDebugUtils.currentLine=40566989;
 //BA.debugLineNum = 40566989;BA.debugLine="ColorMap.put(\"light-green lighten-3\", \"#c5e1a5\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green lighten-3"),(Object)("#c5e1a5"));
RDebugUtils.currentLine=40566990;
 //BA.debugLineNum = 40566990;BA.debugLine="ColorMap.put(\"light-green lighten-2\", \"#aed581\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green lighten-2"),(Object)("#aed581"));
RDebugUtils.currentLine=40566991;
 //BA.debugLineNum = 40566991;BA.debugLine="ColorMap.put(\"light-green lighten-1\", \"#9ccc65\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green lighten-1"),(Object)("#9ccc65"));
RDebugUtils.currentLine=40566992;
 //BA.debugLineNum = 40566992;BA.debugLine="ColorMap.put(\"light-green\", \"#8bc34a\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green"),(Object)("#8bc34a"));
RDebugUtils.currentLine=40566993;
 //BA.debugLineNum = 40566993;BA.debugLine="ColorMap.put(\"light-green darken-1\", \"#7cb342\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green darken-1"),(Object)("#7cb342"));
RDebugUtils.currentLine=40566994;
 //BA.debugLineNum = 40566994;BA.debugLine="ColorMap.put(\"light-green darken-2\", \"#689f38\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green darken-2"),(Object)("#689f38"));
RDebugUtils.currentLine=40566995;
 //BA.debugLineNum = 40566995;BA.debugLine="ColorMap.put(\"light-green darken-3\", \"#558b2f\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green darken-3"),(Object)("#558b2f"));
RDebugUtils.currentLine=40566996;
 //BA.debugLineNum = 40566996;BA.debugLine="ColorMap.put(\"light-green darken-4\", \"#33691e\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green darken-4"),(Object)("#33691e"));
RDebugUtils.currentLine=40566997;
 //BA.debugLineNum = 40566997;BA.debugLine="ColorMap.put(\"light-green accent-1\", \"#ccff90\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green accent-1"),(Object)("#ccff90"));
RDebugUtils.currentLine=40566998;
 //BA.debugLineNum = 40566998;BA.debugLine="ColorMap.put(\"light-green accent-2\", \"#b2ff59\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green accent-2"),(Object)("#b2ff59"));
RDebugUtils.currentLine=40566999;
 //BA.debugLineNum = 40566999;BA.debugLine="ColorMap.put(\"light-green accent-3\", \"#76ff03\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green accent-3"),(Object)("#76ff03"));
RDebugUtils.currentLine=40567000;
 //BA.debugLineNum = 40567000;BA.debugLine="ColorMap.put(\"light-green accent-4\", \"#64dd17\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("light-green accent-4"),(Object)("#64dd17"));
RDebugUtils.currentLine=40567001;
 //BA.debugLineNum = 40567001;BA.debugLine="ColorMap.put(\"lime lighten-5\", \"#f9fbe7\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime lighten-5"),(Object)("#f9fbe7"));
RDebugUtils.currentLine=40567002;
 //BA.debugLineNum = 40567002;BA.debugLine="ColorMap.put(\"lime lighten-4\", \"#f0f4c3\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime lighten-4"),(Object)("#f0f4c3"));
RDebugUtils.currentLine=40567003;
 //BA.debugLineNum = 40567003;BA.debugLine="ColorMap.put(\"lime lighten-3\", \"#e6ee9c\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime lighten-3"),(Object)("#e6ee9c"));
RDebugUtils.currentLine=40567004;
 //BA.debugLineNum = 40567004;BA.debugLine="ColorMap.put(\"lime lighten-2\", \"#dce775\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime lighten-2"),(Object)("#dce775"));
RDebugUtils.currentLine=40567005;
 //BA.debugLineNum = 40567005;BA.debugLine="ColorMap.put(\"lime lighten-1\", \"#d4e157\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime lighten-1"),(Object)("#d4e157"));
RDebugUtils.currentLine=40567006;
 //BA.debugLineNum = 40567006;BA.debugLine="ColorMap.put(\"lime\", \"#cddc39\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime"),(Object)("#cddc39"));
RDebugUtils.currentLine=40567007;
 //BA.debugLineNum = 40567007;BA.debugLine="ColorMap.put(\"lime darken-1\", \"#c0ca33\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime darken-1"),(Object)("#c0ca33"));
RDebugUtils.currentLine=40567008;
 //BA.debugLineNum = 40567008;BA.debugLine="ColorMap.put(\"lime darken-2\", \"#afb42b\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime darken-2"),(Object)("#afb42b"));
RDebugUtils.currentLine=40567009;
 //BA.debugLineNum = 40567009;BA.debugLine="ColorMap.put(\"lime darken-3\", \"#9e9d24\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime darken-3"),(Object)("#9e9d24"));
RDebugUtils.currentLine=40567010;
 //BA.debugLineNum = 40567010;BA.debugLine="ColorMap.put(\"lime darken-4\", \"#827717\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime darken-4"),(Object)("#827717"));
RDebugUtils.currentLine=40567011;
 //BA.debugLineNum = 40567011;BA.debugLine="ColorMap.put(\"lime accent-1\", \"#f4ff81\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime accent-1"),(Object)("#f4ff81"));
RDebugUtils.currentLine=40567012;
 //BA.debugLineNum = 40567012;BA.debugLine="ColorMap.put(\"lime accent-2\", \"#eeff41\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime accent-2"),(Object)("#eeff41"));
RDebugUtils.currentLine=40567013;
 //BA.debugLineNum = 40567013;BA.debugLine="ColorMap.put(\"lime accent-3\", \"#c6ff00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime accent-3"),(Object)("#c6ff00"));
RDebugUtils.currentLine=40567014;
 //BA.debugLineNum = 40567014;BA.debugLine="ColorMap.put(\"lime accent-4\", \"#aeea00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("lime accent-4"),(Object)("#aeea00"));
RDebugUtils.currentLine=40567015;
 //BA.debugLineNum = 40567015;BA.debugLine="ColorMap.put(\"yellow lighten-5\", \"#fffde7\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow lighten-5"),(Object)("#fffde7"));
RDebugUtils.currentLine=40567016;
 //BA.debugLineNum = 40567016;BA.debugLine="ColorMap.put(\"yellow lighten-4\", \"#fff9c4\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow lighten-4"),(Object)("#fff9c4"));
RDebugUtils.currentLine=40567017;
 //BA.debugLineNum = 40567017;BA.debugLine="ColorMap.put(\"yellow lighten-3\", \"#fff59d\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow lighten-3"),(Object)("#fff59d"));
RDebugUtils.currentLine=40567018;
 //BA.debugLineNum = 40567018;BA.debugLine="ColorMap.put(\"yellow lighten-2\", \"#fff176\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow lighten-2"),(Object)("#fff176"));
RDebugUtils.currentLine=40567019;
 //BA.debugLineNum = 40567019;BA.debugLine="ColorMap.put(\"yellow lighten-1\", \"#ffee58\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow lighten-1"),(Object)("#ffee58"));
RDebugUtils.currentLine=40567020;
 //BA.debugLineNum = 40567020;BA.debugLine="ColorMap.put(\"yellow\", \"#ffeb3b\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow"),(Object)("#ffeb3b"));
RDebugUtils.currentLine=40567021;
 //BA.debugLineNum = 40567021;BA.debugLine="ColorMap.put(\"yellow darken-1\", \"#fdd835\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow darken-1"),(Object)("#fdd835"));
RDebugUtils.currentLine=40567022;
 //BA.debugLineNum = 40567022;BA.debugLine="ColorMap.put(\"yellow darken-2\", \"#fbc02d\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow darken-2"),(Object)("#fbc02d"));
RDebugUtils.currentLine=40567023;
 //BA.debugLineNum = 40567023;BA.debugLine="ColorMap.put(\"yellow darken-3\", \"#f9a825\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow darken-3"),(Object)("#f9a825"));
RDebugUtils.currentLine=40567024;
 //BA.debugLineNum = 40567024;BA.debugLine="ColorMap.put(\"yellow darken-4\", \"#f57f17\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow darken-4"),(Object)("#f57f17"));
RDebugUtils.currentLine=40567025;
 //BA.debugLineNum = 40567025;BA.debugLine="ColorMap.put(\"yellow accent-1\", \"#ffff8d\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow accent-1"),(Object)("#ffff8d"));
RDebugUtils.currentLine=40567026;
 //BA.debugLineNum = 40567026;BA.debugLine="ColorMap.put(\"yellow accent-2\", \"#ffff00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow accent-2"),(Object)("#ffff00"));
RDebugUtils.currentLine=40567027;
 //BA.debugLineNum = 40567027;BA.debugLine="ColorMap.put(\"yellow accent-3\", \"#ffea00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow accent-3"),(Object)("#ffea00"));
RDebugUtils.currentLine=40567028;
 //BA.debugLineNum = 40567028;BA.debugLine="ColorMap.put(\"yellow accent-4\", \"#ffd600\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("yellow accent-4"),(Object)("#ffd600"));
RDebugUtils.currentLine=40567029;
 //BA.debugLineNum = 40567029;BA.debugLine="ColorMap.put(\"amber lighten-5\", \"#fff8e1\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber lighten-5"),(Object)("#fff8e1"));
RDebugUtils.currentLine=40567030;
 //BA.debugLineNum = 40567030;BA.debugLine="ColorMap.put(\"amber lighten-4\", \"#ffecb3\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber lighten-4"),(Object)("#ffecb3"));
RDebugUtils.currentLine=40567031;
 //BA.debugLineNum = 40567031;BA.debugLine="ColorMap.put(\"amber lighten-3\", \"#ffe082\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber lighten-3"),(Object)("#ffe082"));
RDebugUtils.currentLine=40567032;
 //BA.debugLineNum = 40567032;BA.debugLine="ColorMap.put(\"amber lighten-2\", \"#ffd54f\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber lighten-2"),(Object)("#ffd54f"));
RDebugUtils.currentLine=40567033;
 //BA.debugLineNum = 40567033;BA.debugLine="ColorMap.put(\"amber lighten-1\", \"#ffca28\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber lighten-1"),(Object)("#ffca28"));
RDebugUtils.currentLine=40567034;
 //BA.debugLineNum = 40567034;BA.debugLine="ColorMap.put(\"amber\", \"#ffc107\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber"),(Object)("#ffc107"));
RDebugUtils.currentLine=40567035;
 //BA.debugLineNum = 40567035;BA.debugLine="ColorMap.put(\"amber darken-1\", \"#ffb300\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber darken-1"),(Object)("#ffb300"));
RDebugUtils.currentLine=40567036;
 //BA.debugLineNum = 40567036;BA.debugLine="ColorMap.put(\"amber darken-2\", \"#ffa000\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber darken-2"),(Object)("#ffa000"));
RDebugUtils.currentLine=40567037;
 //BA.debugLineNum = 40567037;BA.debugLine="ColorMap.put(\"amber darken-3\", \"#ff8f00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber darken-3"),(Object)("#ff8f00"));
RDebugUtils.currentLine=40567038;
 //BA.debugLineNum = 40567038;BA.debugLine="ColorMap.put(\"amber darken-4\", \"#ff6f00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber darken-4"),(Object)("#ff6f00"));
RDebugUtils.currentLine=40567039;
 //BA.debugLineNum = 40567039;BA.debugLine="ColorMap.put(\"amber accent-1\", \"#ffe57f\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber accent-1"),(Object)("#ffe57f"));
RDebugUtils.currentLine=40567040;
 //BA.debugLineNum = 40567040;BA.debugLine="ColorMap.put(\"amber accent-2\", \"#ffd740\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber accent-2"),(Object)("#ffd740"));
RDebugUtils.currentLine=40567041;
 //BA.debugLineNum = 40567041;BA.debugLine="ColorMap.put(\"amber accent-3\", \"#ffc400\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber accent-3"),(Object)("#ffc400"));
RDebugUtils.currentLine=40567042;
 //BA.debugLineNum = 40567042;BA.debugLine="ColorMap.put(\"amber accent-4\", \"#ffab00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("amber accent-4"),(Object)("#ffab00"));
RDebugUtils.currentLine=40567043;
 //BA.debugLineNum = 40567043;BA.debugLine="ColorMap.put(\"orange lighten-5\", \"#fff3e0\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange lighten-5"),(Object)("#fff3e0"));
RDebugUtils.currentLine=40567044;
 //BA.debugLineNum = 40567044;BA.debugLine="ColorMap.put(\"orange lighten-4\", \"#ffe0b2\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange lighten-4"),(Object)("#ffe0b2"));
RDebugUtils.currentLine=40567045;
 //BA.debugLineNum = 40567045;BA.debugLine="ColorMap.put(\"orange lighten-3\", \"#ffcc80\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange lighten-3"),(Object)("#ffcc80"));
RDebugUtils.currentLine=40567046;
 //BA.debugLineNum = 40567046;BA.debugLine="ColorMap.put(\"orange lighten-2\", \"#ffb74d\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange lighten-2"),(Object)("#ffb74d"));
RDebugUtils.currentLine=40567047;
 //BA.debugLineNum = 40567047;BA.debugLine="ColorMap.put(\"orange lighten-1\", \"#ffa726\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange lighten-1"),(Object)("#ffa726"));
RDebugUtils.currentLine=40567048;
 //BA.debugLineNum = 40567048;BA.debugLine="ColorMap.put(\"orange\", \"#ff9800\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange"),(Object)("#ff9800"));
RDebugUtils.currentLine=40567049;
 //BA.debugLineNum = 40567049;BA.debugLine="ColorMap.put(\"orange darken-1\", \"#fb8c00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange darken-1"),(Object)("#fb8c00"));
RDebugUtils.currentLine=40567050;
 //BA.debugLineNum = 40567050;BA.debugLine="ColorMap.put(\"orange darken-2\", \"#f57c00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange darken-2"),(Object)("#f57c00"));
RDebugUtils.currentLine=40567051;
 //BA.debugLineNum = 40567051;BA.debugLine="ColorMap.put(\"orange darken-3\", \"#ef6c00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange darken-3"),(Object)("#ef6c00"));
RDebugUtils.currentLine=40567052;
 //BA.debugLineNum = 40567052;BA.debugLine="ColorMap.put(\"orange darken-4\", \"#e65100\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange darken-4"),(Object)("#e65100"));
RDebugUtils.currentLine=40567053;
 //BA.debugLineNum = 40567053;BA.debugLine="ColorMap.put(\"orange accent-1\", \"#ffd180\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange accent-1"),(Object)("#ffd180"));
RDebugUtils.currentLine=40567054;
 //BA.debugLineNum = 40567054;BA.debugLine="ColorMap.put(\"orange accent-2\", \"#ffab40\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange accent-2"),(Object)("#ffab40"));
RDebugUtils.currentLine=40567055;
 //BA.debugLineNum = 40567055;BA.debugLine="ColorMap.put(\"orange accent-3\", \"#ff9100\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange accent-3"),(Object)("#ff9100"));
RDebugUtils.currentLine=40567056;
 //BA.debugLineNum = 40567056;BA.debugLine="ColorMap.put(\"orange accent-4\", \"#ff6d00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("orange accent-4"),(Object)("#ff6d00"));
RDebugUtils.currentLine=40567057;
 //BA.debugLineNum = 40567057;BA.debugLine="ColorMap.put(\"deep-orange lighten-5\", \"#fbe9e7\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange lighten-5"),(Object)("#fbe9e7"));
RDebugUtils.currentLine=40567058;
 //BA.debugLineNum = 40567058;BA.debugLine="ColorMap.put(\"deep-orange lighten-4\", \"#ffccbc\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange lighten-4"),(Object)("#ffccbc"));
RDebugUtils.currentLine=40567059;
 //BA.debugLineNum = 40567059;BA.debugLine="ColorMap.put(\"deep-orange lighten-3\", \"#ffab91\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange lighten-3"),(Object)("#ffab91"));
RDebugUtils.currentLine=40567060;
 //BA.debugLineNum = 40567060;BA.debugLine="ColorMap.put(\"deep-orange lighten-2\", \"#ff8a65\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange lighten-2"),(Object)("#ff8a65"));
RDebugUtils.currentLine=40567061;
 //BA.debugLineNum = 40567061;BA.debugLine="ColorMap.put(\"deep-orange lighten-1\", \"#ff7043\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange lighten-1"),(Object)("#ff7043"));
RDebugUtils.currentLine=40567062;
 //BA.debugLineNum = 40567062;BA.debugLine="ColorMap.put(\"deep-orange\", \"#ff5722\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange"),(Object)("#ff5722"));
RDebugUtils.currentLine=40567063;
 //BA.debugLineNum = 40567063;BA.debugLine="ColorMap.put(\"deep-orange darken-1\", \"#f4511e\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange darken-1"),(Object)("#f4511e"));
RDebugUtils.currentLine=40567064;
 //BA.debugLineNum = 40567064;BA.debugLine="ColorMap.put(\"deep-orange darken-2\", \"#e64a19\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange darken-2"),(Object)("#e64a19"));
RDebugUtils.currentLine=40567065;
 //BA.debugLineNum = 40567065;BA.debugLine="ColorMap.put(\"deep-orange darken-3\", \"#d84315\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange darken-3"),(Object)("#d84315"));
RDebugUtils.currentLine=40567066;
 //BA.debugLineNum = 40567066;BA.debugLine="ColorMap.put(\"deep-orange darken-4\", \"#bf360c\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange darken-4"),(Object)("#bf360c"));
RDebugUtils.currentLine=40567067;
 //BA.debugLineNum = 40567067;BA.debugLine="ColorMap.put(\"deep-orange accent-1\", \"#ff9e80\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange accent-1"),(Object)("#ff9e80"));
RDebugUtils.currentLine=40567068;
 //BA.debugLineNum = 40567068;BA.debugLine="ColorMap.put(\"deep-orange accent-2\", \"#ff6e40\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange accent-2"),(Object)("#ff6e40"));
RDebugUtils.currentLine=40567069;
 //BA.debugLineNum = 40567069;BA.debugLine="ColorMap.put(\"deep-orange accent-3\", \"#ff3d00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange accent-3"),(Object)("#ff3d00"));
RDebugUtils.currentLine=40567070;
 //BA.debugLineNum = 40567070;BA.debugLine="ColorMap.put(\"deep-orange accent-4\", \"#dd2c00\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deep-orange accent-4"),(Object)("#dd2c00"));
RDebugUtils.currentLine=40567071;
 //BA.debugLineNum = 40567071;BA.debugLine="ColorMap.put(\"brown lighten-5\", \"#efebe9\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown lighten-5"),(Object)("#efebe9"));
RDebugUtils.currentLine=40567072;
 //BA.debugLineNum = 40567072;BA.debugLine="ColorMap.put(\"brown lighten-4\", \"#d7ccc8\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown lighten-4"),(Object)("#d7ccc8"));
RDebugUtils.currentLine=40567073;
 //BA.debugLineNum = 40567073;BA.debugLine="ColorMap.put(\"brown lighten-3\", \"#bcaaa4\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown lighten-3"),(Object)("#bcaaa4"));
RDebugUtils.currentLine=40567074;
 //BA.debugLineNum = 40567074;BA.debugLine="ColorMap.put(\"brown lighten-2\", \"#a1887f\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown lighten-2"),(Object)("#a1887f"));
RDebugUtils.currentLine=40567075;
 //BA.debugLineNum = 40567075;BA.debugLine="ColorMap.put(\"brown lighten-1\", \"#8d6e63\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown lighten-1"),(Object)("#8d6e63"));
RDebugUtils.currentLine=40567076;
 //BA.debugLineNum = 40567076;BA.debugLine="ColorMap.put(\"brown\", \"#795548\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown"),(Object)("#795548"));
RDebugUtils.currentLine=40567077;
 //BA.debugLineNum = 40567077;BA.debugLine="ColorMap.put(\"brown darken-1\", \"#6d4c41\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown darken-1"),(Object)("#6d4c41"));
RDebugUtils.currentLine=40567078;
 //BA.debugLineNum = 40567078;BA.debugLine="ColorMap.put(\"brown darken-2\", \"#5d4037\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown darken-2"),(Object)("#5d4037"));
RDebugUtils.currentLine=40567079;
 //BA.debugLineNum = 40567079;BA.debugLine="ColorMap.put(\"brown darken-3\", \"#4e342e\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown darken-3"),(Object)("#4e342e"));
RDebugUtils.currentLine=40567080;
 //BA.debugLineNum = 40567080;BA.debugLine="ColorMap.put(\"brown darken-4\", \"#3e2723\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("brown darken-4"),(Object)("#3e2723"));
RDebugUtils.currentLine=40567081;
 //BA.debugLineNum = 40567081;BA.debugLine="ColorMap.put(\"grey lighten-5\", \"#fafafa\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey lighten-5"),(Object)("#fafafa"));
RDebugUtils.currentLine=40567082;
 //BA.debugLineNum = 40567082;BA.debugLine="ColorMap.put(\"grey lighten-4\", \"#f5f5f5\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey lighten-4"),(Object)("#f5f5f5"));
RDebugUtils.currentLine=40567083;
 //BA.debugLineNum = 40567083;BA.debugLine="ColorMap.put(\"grey lighten-3\", \"#eeeeee\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey lighten-3"),(Object)("#eeeeee"));
RDebugUtils.currentLine=40567084;
 //BA.debugLineNum = 40567084;BA.debugLine="ColorMap.put(\"grey lighten-2\", \"#e0e0e0\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey lighten-2"),(Object)("#e0e0e0"));
RDebugUtils.currentLine=40567085;
 //BA.debugLineNum = 40567085;BA.debugLine="ColorMap.put(\"grey lighten-1\", \"#bdbdbd\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey lighten-1"),(Object)("#bdbdbd"));
RDebugUtils.currentLine=40567086;
 //BA.debugLineNum = 40567086;BA.debugLine="ColorMap.put(\"grey\", \"#9e9e9e\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey"),(Object)("#9e9e9e"));
RDebugUtils.currentLine=40567087;
 //BA.debugLineNum = 40567087;BA.debugLine="ColorMap.put(\"grey darken-1\", \"#757575\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey darken-1"),(Object)("#757575"));
RDebugUtils.currentLine=40567088;
 //BA.debugLineNum = 40567088;BA.debugLine="ColorMap.put(\"grey darken-2\", \"#616161\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey darken-2"),(Object)("#616161"));
RDebugUtils.currentLine=40567089;
 //BA.debugLineNum = 40567089;BA.debugLine="ColorMap.put(\"grey darken-3\", \"#424242\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey darken-3"),(Object)("#424242"));
RDebugUtils.currentLine=40567090;
 //BA.debugLineNum = 40567090;BA.debugLine="ColorMap.put(\"grey darken-4\", \"#212121\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("grey darken-4"),(Object)("#212121"));
RDebugUtils.currentLine=40567091;
 //BA.debugLineNum = 40567091;BA.debugLine="ColorMap.put(\"blue-grey lighten-5\", \"#eceff1\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey lighten-5"),(Object)("#eceff1"));
RDebugUtils.currentLine=40567092;
 //BA.debugLineNum = 40567092;BA.debugLine="ColorMap.put(\"blue-grey lighten-4\", \"#cfd8dc\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey lighten-4"),(Object)("#cfd8dc"));
RDebugUtils.currentLine=40567093;
 //BA.debugLineNum = 40567093;BA.debugLine="ColorMap.put(\"blue-grey lighten-3\", \"#b0bec5\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey lighten-3"),(Object)("#b0bec5"));
RDebugUtils.currentLine=40567094;
 //BA.debugLineNum = 40567094;BA.debugLine="ColorMap.put(\"blue-grey lighten-2\", \"#90a4ae\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey lighten-2"),(Object)("#90a4ae"));
RDebugUtils.currentLine=40567095;
 //BA.debugLineNum = 40567095;BA.debugLine="ColorMap.put(\"blue-grey lighten-1\", \"#78909c\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey lighten-1"),(Object)("#78909c"));
RDebugUtils.currentLine=40567096;
 //BA.debugLineNum = 40567096;BA.debugLine="ColorMap.put(\"blue-grey\", \"#607d8b\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey"),(Object)("#607d8b"));
RDebugUtils.currentLine=40567097;
 //BA.debugLineNum = 40567097;BA.debugLine="ColorMap.put(\"blue-grey darken-1\", \"#546e7a\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey darken-1"),(Object)("#546e7a"));
RDebugUtils.currentLine=40567098;
 //BA.debugLineNum = 40567098;BA.debugLine="ColorMap.put(\"blue-grey darken-2\", \"#455a64\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey darken-2"),(Object)("#455a64"));
RDebugUtils.currentLine=40567099;
 //BA.debugLineNum = 40567099;BA.debugLine="ColorMap.put(\"blue-grey darken-3\", \"#37474f\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey darken-3"),(Object)("#37474f"));
RDebugUtils.currentLine=40567100;
 //BA.debugLineNum = 40567100;BA.debugLine="ColorMap.put(\"blue-grey darken-4\", \"#263238\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("blue-grey darken-4"),(Object)("#263238"));
RDebugUtils.currentLine=40567101;
 //BA.debugLineNum = 40567101;BA.debugLine="ColorMap.put(\"black\", \"#000000\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("black"),(Object)("#000000"));
RDebugUtils.currentLine=40567102;
 //BA.debugLineNum = 40567102;BA.debugLine="ColorMap.put(\"white\", \"#ffffff\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("white"),(Object)("#ffffff"));
RDebugUtils.currentLine=40567103;
 //BA.debugLineNum = 40567103;BA.debugLine="ColorMap.put(\"transparent\", \"transparent\")";
__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("transparent"),(Object)("transparent"));
RDebugUtils.currentLine=40567104;
 //BA.debugLineNum = 40567104;BA.debugLine="End Sub";
return "";
}
public String  _use(b4j.example.bananovue __ref,com.ab.banano.BANanoObject _bo) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "use", true))
	 {return ((String) Debug.delegate(ba, "use", new Object[] {_bo}));}
RDebugUtils.currentLine=44630016;
 //BA.debugLineNum = 44630016;BA.debugLine="Sub Use(bo As BANanoObject)";
RDebugUtils.currentLine=44630017;
 //BA.debugLineNum = 44630017;BA.debugLine="BOVue.RunMethod(\"use\", bo)";
__ref._bovue /*com.ab.banano.BANanoObject*/ .RunMethod("use",(Object)(_bo.getObject()));
RDebugUtils.currentLine=44630018;
 //BA.debugLineNum = 44630018;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _addcomponentbo(b4j.example.bananovue __ref,String _compname,com.ab.banano.BANanoObject _comp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "addcomponentbo", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "addcomponentbo", new Object[] {_compname,_comp}));}
RDebugUtils.currentLine=41549824;
 //BA.debugLineNum = 41549824;BA.debugLine="Sub AddComponentBO(compName As String, comp As BAN";
RDebugUtils.currentLine=41549825;
 //BA.debugLineNum = 41549825;BA.debugLine="components.Put(compName, comp)";
__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_compname),(Object)(_comp.getObject()));
RDebugUtils.currentLine=41549826;
 //BA.debugLineNum = 41549826;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=41549827;
 //BA.debugLineNum = 41549827;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstate(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstate", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstate", new Object[] {_m}));}
String _k = "";
Object _v = null;
RDebugUtils.currentLine=46071808;
 //BA.debugLineNum = 46071808;BA.debugLine="Sub SetState(m As Map) As BANanoVue";
RDebugUtils.currentLine=46071809;
 //BA.debugLineNum = 46071809;BA.debugLine="Try";
try {RDebugUtils.currentLine=46071810;
 //BA.debugLineNum = 46071810;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=46071811;
 //BA.debugLineNum = 46071811;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=46071812;
 //BA.debugLineNum = 46071812;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=46071813;
 //BA.debugLineNum = 46071813;BA.debugLine="data.Put(k, v)";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_v);
 }
};
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=46071816;
 //BA.debugLineNum = 46071816;BA.debugLine="Log(LastException)";
__c.Log(BA.ObjectToString(__c.LastException(ba)));
 };
RDebugUtils.currentLine=46071818;
 //BA.debugLineNum = 46071818;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=46071819;
 //BA.debugLineNum = 46071819;BA.debugLine="End Sub";
return null;
}
public int  _instr(b4j.example.bananovue __ref,String _text,String _sfind) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "instr", true))
	 {return ((Integer) Debug.delegate(ba, "instr", new Object[] {_text,_sfind}));}
RDebugUtils.currentLine=35258368;
 //BA.debugLineNum = 35258368;BA.debugLine="Sub InStr(Text As String, sFind As String) As Int";
RDebugUtils.currentLine=35258369;
 //BA.debugLineNum = 35258369;BA.debugLine="Return Text.tolowercase.IndexOf(sFind.tolowercase";
if (true) return _text.toLowerCase().indexOf(_sfind.toLowerCase());
RDebugUtils.currentLine=35258370;
 //BA.debugLineNum = 35258370;BA.debugLine="End Sub";
return 0;
}
public anywheresoftware.b4a.objects.collections.List  _joinlists(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "joinlists", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "joinlists", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.List _lo = null;
Object _k = null;
RDebugUtils.currentLine=35520512;
 //BA.debugLineNum = 35520512;BA.debugLine="Sub JoinLists(lst As List) As List";
RDebugUtils.currentLine=35520513;
 //BA.debugLineNum = 35520513;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35520514;
 //BA.debugLineNum = 35520514;BA.debugLine="nl.Initialize";
_nl.Initialize();
RDebugUtils.currentLine=35520515;
 //BA.debugLineNum = 35520515;BA.debugLine="For Each lo As List In lst";
_lo = new anywheresoftware.b4a.objects.collections.List();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_lo.setObject((java.util.List)(group3.Get(index3)));
RDebugUtils.currentLine=35520516;
 //BA.debugLineNum = 35520516;BA.debugLine="For Each k As Object In lo";
{
final anywheresoftware.b4a.BA.IterableList group4 = _lo;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = group4.Get(index4);
RDebugUtils.currentLine=35520517;
 //BA.debugLineNum = 35520517;BA.debugLine="nl.Add(k)";
_nl.Add(_k);
 }
};
 }
};
RDebugUtils.currentLine=35520520;
 //BA.debugLineNum = 35520520;BA.debugLine="Return nl";
if (true) return _nl;
RDebugUtils.currentLine=35520521;
 //BA.debugLineNum = 35520521;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _joinmaps(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "joinmaps", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "joinmaps", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.Map _mr = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=35454976;
 //BA.debugLineNum = 35454976;BA.debugLine="Sub JoinMaps(lst As List) As Map";
RDebugUtils.currentLine=35454977;
 //BA.debugLineNum = 35454977;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
RDebugUtils.currentLine=35454978;
 //BA.debugLineNum = 35454978;BA.debugLine="For Each mr As Map In lst";
_mr = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
RDebugUtils.currentLine=35454979;
 //BA.debugLineNum = 35454979;BA.debugLine="For Each k As String In mr.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _mr.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=35454980;
 //BA.debugLineNum = 35454980;BA.debugLine="Dim v As Object = mr.Get(k)";
_v = _mr.Get((Object)(_k));
RDebugUtils.currentLine=35454981;
 //BA.debugLineNum = 35454981;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
 }
};
RDebugUtils.currentLine=35454984;
 //BA.debugLineNum = 35454984;BA.debugLine="Return nm";
if (true) return _nm;
RDebugUtils.currentLine=35454985;
 //BA.debugLineNum = 35454985;BA.debugLine="End Sub";
return null;
}
public String  _joinnonblanks(b4j.example.bananovue __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "joinnonblanks", true))
	 {return ((String) Debug.delegate(ba, "joinnonblanks", new Object[] {_delimiter,_lst}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
String _str = "";
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=35323904;
 //BA.debugLineNum = 35323904;BA.debugLine="Sub JoinNonBlanks(delimiter As String, lst As List";
RDebugUtils.currentLine=35323906;
 //BA.debugLineNum = 35323906;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35323907;
 //BA.debugLineNum = 35323907;BA.debugLine="nl.Initialize";
_nl.Initialize();
RDebugUtils.currentLine=35323908;
 //BA.debugLineNum = 35323908;BA.debugLine="For Each str As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_str = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=35323909;
 //BA.debugLineNum = 35323909;BA.debugLine="str = str.Trim";
_str = _str.trim();
RDebugUtils.currentLine=35323910;
 //BA.debugLineNum = 35323910;BA.debugLine="If str.Length > 0 Then";
if (_str.length()>0) { 
RDebugUtils.currentLine=35323911;
 //BA.debugLineNum = 35323911;BA.debugLine="nl.Add(str)";
_nl.Add((Object)(_str));
 };
 }
};
RDebugUtils.currentLine=35323914;
 //BA.debugLineNum = 35323914;BA.debugLine="If nl.Size = 0 Then Return \"\"";
if (_nl.getSize()==0) { 
if (true) return "";};
RDebugUtils.currentLine=35323916;
 //BA.debugLineNum = 35323916;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=35323917;
 //BA.debugLineNum = 35323917;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35323918;
 //BA.debugLineNum = 35323918;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=35323919;
 //BA.debugLineNum = 35323919;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=35323920;
 //BA.debugLineNum = 35323920;BA.debugLine="fld = nl.Get(0)";
_fld = BA.ObjectToString(_nl.Get((int) (0)));
RDebugUtils.currentLine=35323921;
 //BA.debugLineNum = 35323921;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=35323922;
 //BA.debugLineNum = 35323922;BA.debugLine="For i = 1 To nl.size - 1";
{
final int step16 = 1;
final int limit16 = (int) (_nl.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=35323923;
 //BA.debugLineNum = 35323923;BA.debugLine="Dim fld As String = nl.Get(i)";
_fld = BA.ObjectToString(_nl.Get(_i));
RDebugUtils.currentLine=35323924;
 //BA.debugLineNum = 35323924;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
RDebugUtils.currentLine=35323926;
 //BA.debugLineNum = 35323926;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=35323927;
 //BA.debugLineNum = 35323927;BA.debugLine="End Sub";
return "";
}
public String  _jsonpretty(b4j.example.bananovue __ref,Object _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "jsonpretty", true))
	 {return ((String) Debug.delegate(ba, "jsonpretty", new Object[] {_m}));}
String _pretty = "";
RDebugUtils.currentLine=35061760;
 //BA.debugLineNum = 35061760;BA.debugLine="Sub JSONPretty(m As Object) As String";
RDebugUtils.currentLine=35061761;
 //BA.debugLineNum = 35061761;BA.debugLine="Dim pretty As String = BANAno.RunJavascriptMethod";
_pretty = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("JSON.stringify",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_m,__c.Null,(Object)(4)})));
RDebugUtils.currentLine=35061762;
 //BA.debugLineNum = 35061762;BA.debugLine="Return pretty";
if (true) return _pretty;
RDebugUtils.currentLine=35061763;
 //BA.debugLineNum = 35061763;BA.debugLine="End Sub";
return "";
}
public String  _jsonsetproperty(b4j.example.bananovue __ref,String _sjson,anywheresoftware.b4a.objects.collections.Map _updates) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "jsonsetproperty", true))
	 {return ((String) Debug.delegate(ba, "jsonsetproperty", new Object[] {_sjson,_updates}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
String _k = "";
Object _v = null;
String _sout = "";
RDebugUtils.currentLine=40239104;
 //BA.debugLineNum = 40239104;BA.debugLine="Sub JSONSetProperty(sjson As String, updates As Ma";
RDebugUtils.currentLine=40239105;
 //BA.debugLineNum = 40239105;BA.debugLine="Dim m As Map = BANAno.FromJson(sjson)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._banano /*com.ab.banano.BANano*/ .FromJson((Object)(_sjson))));
RDebugUtils.currentLine=40239106;
 //BA.debugLineNum = 40239106;BA.debugLine="For Each k As String In updates.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _updates.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=40239107;
 //BA.debugLineNum = 40239107;BA.debugLine="Dim v As Object = updates.Get(k)";
_v = _updates.Get((Object)(_k));
RDebugUtils.currentLine=40239108;
 //BA.debugLineNum = 40239108;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=40239110;
 //BA.debugLineNum = 40239110;BA.debugLine="Dim sout As String = BANAno.ToJson(m)";
_sout = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(_m.getObject())));
RDebugUtils.currentLine=40239111;
 //BA.debugLineNum = 40239111;BA.debugLine="Return sout";
if (true) return _sout;
RDebugUtils.currentLine=40239112;
 //BA.debugLineNum = 40239112;BA.debugLine="End Sub";
return "";
}
public String  _makeboolean(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "makeboolean", true))
	 {return ((String) Debug.delegate(ba, "makeboolean", new Object[] {_m,_xkeys}));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=42795008;
 //BA.debugLineNum = 42795008;BA.debugLine="Sub MakeBoolean(m As Map, xkeys As List)";
RDebugUtils.currentLine=42795009;
 //BA.debugLineNum = 42795009;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=42795010;
 //BA.debugLineNum = 42795010;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=42795011;
 //BA.debugLineNum = 42795011;BA.debugLine="Dim v As String = m.GetDefault(k,\"0\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("0")));
RDebugUtils.currentLine=42795012;
 //BA.debugLineNum = 42795012;BA.debugLine="v = CStr(v)";
_v = __ref._cstr /*String*/ (null,(Object)(_v));
RDebugUtils.currentLine=42795013;
 //BA.debugLineNum = 42795013;BA.debugLine="v = v.trim";
_v = _v.trim();
RDebugUtils.currentLine=42795014;
 //BA.debugLineNum = 42795014;BA.debugLine="Select Case v";
switch (BA.switchObjectToInt(_v,"","0","false","False",BA.ObjectToString(__c.False),BA.NumberToString(0),"1","true","True",BA.ObjectToString(__c.True),BA.NumberToString(1))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=42795016;
 //BA.debugLineNum = 42795016;BA.debugLine="m.Put(k, False)";
_m.Put((Object)(_k),(Object)(__c.False));
 break; }
case 6: 
case 7: 
case 8: 
case 9: 
case 10: {
RDebugUtils.currentLine=42795018;
 //BA.debugLineNum = 42795018;BA.debugLine="m.Put(k, True)";
_m.Put((Object)(_k),(Object)(__c.True));
 break; }
}
;
 };
 }
};
RDebugUtils.currentLine=42795022;
 //BA.debugLineNum = 42795022;BA.debugLine="End Sub";
return "";
}
public String  _makedate(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "makedate", true))
	 {return ((String) Debug.delegate(ba, "makedate", new Object[] {_m,_xkeys}));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=43122688;
 //BA.debugLineNum = 43122688;BA.debugLine="Sub MakeDate(m As Map, xkeys As List)";
RDebugUtils.currentLine=43122689;
 //BA.debugLineNum = 43122689;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=43122690;
 //BA.debugLineNum = 43122690;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=43122691;
 //BA.debugLineNum = 43122691;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
RDebugUtils.currentLine=43122692;
 //BA.debugLineNum = 43122692;BA.debugLine="v = CStr(v)";
_v = __ref._cstr /*String*/ (null,(Object)(_v));
RDebugUtils.currentLine=43122693;
 //BA.debugLineNum = 43122693;BA.debugLine="v = v.trim";
_v = _v.trim();
RDebugUtils.currentLine=43122694;
 //BA.debugLineNum = 43122694;BA.debugLine="v = MvField(v,1,\" \")";
_v = __ref._mvfield /*String*/ (null,_v,(int) (1)," ");
RDebugUtils.currentLine=43122695;
 //BA.debugLineNum = 43122695;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
RDebugUtils.currentLine=43122698;
 //BA.debugLineNum = 43122698;BA.debugLine="End Sub";
return "";
}
public String  _makedouble(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "makedouble", true))
	 {return ((String) Debug.delegate(ba, "makedouble", new Object[] {_m,_xkeys}));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=42729472;
 //BA.debugLineNum = 42729472;BA.debugLine="Sub MakeDouble(m As Map, xkeys As List)";
RDebugUtils.currentLine=42729473;
 //BA.debugLineNum = 42729473;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=42729474;
 //BA.debugLineNum = 42729474;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=42729475;
 //BA.debugLineNum = 42729475;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
RDebugUtils.currentLine=42729476;
 //BA.debugLineNum = 42729476;BA.debugLine="v = CStr(v)";
_v = __ref._cstr /*String*/ (null,(Object)(_v));
RDebugUtils.currentLine=42729477;
 //BA.debugLineNum = 42729477;BA.debugLine="v = v.trim";
_v = _v.trim();
RDebugUtils.currentLine=42729478;
 //BA.debugLineNum = 42729478;BA.debugLine="If v = \"\" Then v = \"0\"";
if ((_v).equals("")) { 
_v = "0";};
RDebugUtils.currentLine=42729479;
 //BA.debugLineNum = 42729479;BA.debugLine="v = BANAno.parseFloat(v)";
_v = BA.NumberToString(__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_v)));
RDebugUtils.currentLine=42729480;
 //BA.debugLineNum = 42729480;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
RDebugUtils.currentLine=42729483;
 //BA.debugLineNum = 42729483;BA.debugLine="End Sub";
return "";
}
public String  _makeinteger(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "makeinteger", true))
	 {return ((String) Debug.delegate(ba, "makeinteger", new Object[] {_m,_xkeys}));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=42663936;
 //BA.debugLineNum = 42663936;BA.debugLine="Sub MakeInteger(m As Map, xkeys As List)";
RDebugUtils.currentLine=42663937;
 //BA.debugLineNum = 42663937;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=42663938;
 //BA.debugLineNum = 42663938;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=42663939;
 //BA.debugLineNum = 42663939;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
RDebugUtils.currentLine=42663940;
 //BA.debugLineNum = 42663940;BA.debugLine="v = CStr(v)";
_v = __ref._cstr /*String*/ (null,(Object)(_v));
RDebugUtils.currentLine=42663941;
 //BA.debugLineNum = 42663941;BA.debugLine="v = v.trim";
_v = _v.trim();
RDebugUtils.currentLine=42663942;
 //BA.debugLineNum = 42663942;BA.debugLine="If v = \"\" Then v = \"0\"";
if ((_v).equals("")) { 
_v = "0";};
RDebugUtils.currentLine=42663943;
 //BA.debugLineNum = 42663943;BA.debugLine="v = BANAno.parseInt(v)";
_v = BA.NumberToString(__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_v)));
RDebugUtils.currentLine=42663944;
 //BA.debugLineNum = 42663944;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
RDebugUtils.currentLine=42663947;
 //BA.debugLineNum = 42663947;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _makelowercase(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "makelowercase", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "makelowercase", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=43057152;
 //BA.debugLineNum = 43057152;BA.debugLine="Sub MakeLowerCase(m As Map) As Map";
RDebugUtils.currentLine=43057153;
 //BA.debugLineNum = 43057153;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
RDebugUtils.currentLine=43057154;
 //BA.debugLineNum = 43057154;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=43057155;
 //BA.debugLineNum = 43057155;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=43057156;
 //BA.debugLineNum = 43057156;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=43057157;
 //BA.debugLineNum = 43057157;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=43057159;
 //BA.debugLineNum = 43057159;BA.debugLine="Return nm";
if (true) return _nm;
RDebugUtils.currentLine=43057160;
 //BA.debugLineNum = 43057160;BA.debugLine="End Sub";
return null;
}
public String  _makepx(b4j.example.bananovue __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "makepx", true))
	 {return ((String) Debug.delegate(ba, "makepx", new Object[] {_svalue}));}
RDebugUtils.currentLine=40828928;
 //BA.debugLineNum = 40828928;BA.debugLine="Sub MakePx(sValue As String) As String";
RDebugUtils.currentLine=40828929;
 //BA.debugLineNum = 40828929;BA.debugLine="sValue = sValue.trim";
_svalue = _svalue.trim();
RDebugUtils.currentLine=40828930;
 //BA.debugLineNum = 40828930;BA.debugLine="If sValue.EndsWith(\"%\") Then";
if (_svalue.endsWith("%")) { 
RDebugUtils.currentLine=40828931;
 //BA.debugLineNum = 40828931;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828932;
 //BA.debugLineNum = 40828932;BA.debugLine="else If sValue.EndsWith(\"vm\") Then";
if (_svalue.endsWith("vm")) { 
RDebugUtils.currentLine=40828933;
 //BA.debugLineNum = 40828933;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828934;
 //BA.debugLineNum = 40828934;BA.debugLine="else If sValue.EndsWith(\"px\") Then";
if (_svalue.endsWith("px")) { 
RDebugUtils.currentLine=40828935;
 //BA.debugLineNum = 40828935;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828936;
 //BA.debugLineNum = 40828936;BA.debugLine="else If sValue.EndsWith(\"cm\") Then";
if (_svalue.endsWith("cm")) { 
RDebugUtils.currentLine=40828937;
 //BA.debugLineNum = 40828937;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828938;
 //BA.debugLineNum = 40828938;BA.debugLine="else If sValue.EndsWith(\"mm\") Then";
if (_svalue.endsWith("mm")) { 
RDebugUtils.currentLine=40828939;
 //BA.debugLineNum = 40828939;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828940;
 //BA.debugLineNum = 40828940;BA.debugLine="else If sValue.EndsWith(\"in\") Then";
if (_svalue.endsWith("in")) { 
RDebugUtils.currentLine=40828941;
 //BA.debugLineNum = 40828941;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828942;
 //BA.debugLineNum = 40828942;BA.debugLine="else If sValue.EndsWith(\"pt\") Then";
if (_svalue.endsWith("pt")) { 
RDebugUtils.currentLine=40828943;
 //BA.debugLineNum = 40828943;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828944;
 //BA.debugLineNum = 40828944;BA.debugLine="else If sValue.EndsWith(\"pc\") Then";
if (_svalue.endsWith("pc")) { 
RDebugUtils.currentLine=40828945;
 //BA.debugLineNum = 40828945;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828946;
 //BA.debugLineNum = 40828946;BA.debugLine="else If sValue.EndsWith(\"em\") Then";
if (_svalue.endsWith("em")) { 
RDebugUtils.currentLine=40828947;
 //BA.debugLineNum = 40828947;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828948;
 //BA.debugLineNum = 40828948;BA.debugLine="else If sValue.EndsWith(\"ex\") Then";
if (_svalue.endsWith("ex")) { 
RDebugUtils.currentLine=40828949;
 //BA.debugLineNum = 40828949;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828950;
 //BA.debugLineNum = 40828950;BA.debugLine="else If sValue.EndsWith(\"ch\") Then";
if (_svalue.endsWith("ch")) { 
RDebugUtils.currentLine=40828951;
 //BA.debugLineNum = 40828951;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828952;
 //BA.debugLineNum = 40828952;BA.debugLine="else If sValue.EndsWith(\"rem\") Then";
if (_svalue.endsWith("rem")) { 
RDebugUtils.currentLine=40828953;
 //BA.debugLineNum = 40828953;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828954;
 //BA.debugLineNum = 40828954;BA.debugLine="else If sValue.EndsWith(\"vw\") Then";
if (_svalue.endsWith("vw")) { 
RDebugUtils.currentLine=40828955;
 //BA.debugLineNum = 40828955;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828956;
 //BA.debugLineNum = 40828956;BA.debugLine="else If sValue.EndsWith(\"vh\") Then";
if (_svalue.endsWith("vh")) { 
RDebugUtils.currentLine=40828957;
 //BA.debugLineNum = 40828957;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828958;
 //BA.debugLineNum = 40828958;BA.debugLine="else If sValue.EndsWith(\"vmin\") Then";
if (_svalue.endsWith("vmin")) { 
RDebugUtils.currentLine=40828959;
 //BA.debugLineNum = 40828959;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828960;
 //BA.debugLineNum = 40828960;BA.debugLine="else If sValue.EndsWith(\"vmax\") Then";
if (_svalue.endsWith("vmax")) { 
RDebugUtils.currentLine=40828961;
 //BA.debugLineNum = 40828961;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else 
{RDebugUtils.currentLine=40828962;
 //BA.debugLineNum = 40828962;BA.debugLine="else If sValue.EndsWith(\";\") Then";
if (_svalue.endsWith(";")) { 
RDebugUtils.currentLine=40828963;
 //BA.debugLineNum = 40828963;BA.debugLine="Return sValue";
if (true) return _svalue;
 }else {
RDebugUtils.currentLine=40828965;
 //BA.debugLineNum = 40828965;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
_svalue = _svalue.replace("px","");
RDebugUtils.currentLine=40828966;
 //BA.debugLineNum = 40828966;BA.debugLine="sValue = $\"${sValue}px\"$";
_svalue = (""+__c.SmartStringFormatter("",(Object)(_svalue))+"px");
RDebugUtils.currentLine=40828967;
 //BA.debugLineNum = 40828967;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
if ((_svalue).equals("px")) { 
_svalue = "";};
RDebugUtils.currentLine=40828968;
 //BA.debugLineNum = 40828968;BA.debugLine="Return sValue";
if (true) return _svalue;
 }}}}}}}}}}}}}}}}}
;
RDebugUtils.currentLine=40828970;
 //BA.debugLineNum = 40828970;BA.debugLine="End Sub";
return "";
}
public String  _maketrim(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _xkeys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "maketrim", true))
	 {return ((String) Debug.delegate(ba, "maketrim", new Object[] {_m,_xkeys}));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=42991616;
 //BA.debugLineNum = 42991616;BA.debugLine="Sub MakeTrim(m As Map, xkeys As List)";
RDebugUtils.currentLine=42991617;
 //BA.debugLineNum = 42991617;BA.debugLine="For Each k As String In xkeys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _xkeys;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=42991618;
 //BA.debugLineNum = 42991618;BA.debugLine="If m.ContainsKey(k) Then";
if (_m.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=42991619;
 //BA.debugLineNum = 42991619;BA.debugLine="Dim v As String = m.GetDefault(k,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_k),(Object)("")));
RDebugUtils.currentLine=42991620;
 //BA.debugLineNum = 42991620;BA.debugLine="v = CStr(v)";
_v = __ref._cstr /*String*/ (null,(Object)(_v));
RDebugUtils.currentLine=42991621;
 //BA.debugLineNum = 42991621;BA.debugLine="v = v.trim";
_v = _v.trim();
RDebugUtils.currentLine=42991622;
 //BA.debugLineNum = 42991622;BA.debugLine="m.Put(k, v)";
_m.Put((Object)(_k),(Object)(_v));
 };
 }
};
RDebugUtils.currentLine=42991625;
 //BA.debugLineNum = 42991625;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _map2options(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m,String _keyname,String _valuename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "map2options", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "map2options", new Object[] {_m,_keyname,_valuename}));}
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
Object _v = null;
anywheresoftware.b4a.objects.collections.Map _nrec = null;
RDebugUtils.currentLine=40042496;
 //BA.debugLineNum = 40042496;BA.debugLine="Sub Map2Options(m As Map, keyName As String, value";
RDebugUtils.currentLine=40042497;
 //BA.debugLineNum = 40042497;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=40042498;
 //BA.debugLineNum = 40042498;BA.debugLine="recs.Initialize";
_recs.Initialize();
RDebugUtils.currentLine=40042499;
 //BA.debugLineNum = 40042499;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=40042500;
 //BA.debugLineNum = 40042500;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=40042501;
 //BA.debugLineNum = 40042501;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
RDebugUtils.currentLine=40042502;
 //BA.debugLineNum = 40042502;BA.debugLine="nrec.Put(keyName, k)";
_nrec.Put((Object)(_keyname),(Object)(_k));
RDebugUtils.currentLine=40042503;
 //BA.debugLineNum = 40042503;BA.debugLine="nrec.Put(valueName, v)";
_nrec.Put((Object)(_valuename),_v);
RDebugUtils.currentLine=40042504;
 //BA.debugLineNum = 40042504;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
RDebugUtils.currentLine=40042506;
 //BA.debugLineNum = 40042506;BA.debugLine="Return recs";
if (true) return _recs;
RDebugUtils.currentLine=40042507;
 //BA.debugLineNum = 40042507;BA.debugLine="End Sub";
return null;
}
public String  _md5hash(b4j.example.bananovue __ref,String _value,String _key,boolean _raw) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "md5hash", true))
	 {return ((String) Debug.delegate(ba, "md5hash", new Object[] {_value,_key,_raw}));}
Object _res = null;
RDebugUtils.currentLine=39256064;
 //BA.debugLineNum = 39256064;BA.debugLine="Sub Md5Hash(value As String, key As String, raw As";
RDebugUtils.currentLine=39256065;
 //BA.debugLineNum = 39256065;BA.debugLine="Dim res As Object = BANAno.RunJavascriptMethod(\"m";
_res = __ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("md5",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value),(Object)(_key),(Object)(_raw)}));
RDebugUtils.currentLine=39256066;
 //BA.debugLineNum = 39256066;BA.debugLine="Return res";
if (true) return BA.ObjectToString(_res);
RDebugUtils.currentLine=39256067;
 //BA.debugLineNum = 39256067;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _mergemaps(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _oldm,anywheresoftware.b4a.objects.collections.Map _newm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "mergemaps", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "mergemaps", new Object[] {_oldm,_newm}));}
anywheresoftware.b4a.objects.collections.Map _om = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=39714816;
 //BA.debugLineNum = 39714816;BA.debugLine="Sub MergeMaps(oldm As Map, newm As Map) As Map";
RDebugUtils.currentLine=39714817;
 //BA.debugLineNum = 39714817;BA.debugLine="Dim om As Map = CreateMap()";
_om = new anywheresoftware.b4a.objects.collections.Map();
_om = __c.createMap(new Object[] {});
RDebugUtils.currentLine=39714818;
 //BA.debugLineNum = 39714818;BA.debugLine="For Each k As String In oldm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _oldm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=39714819;
 //BA.debugLineNum = 39714819;BA.debugLine="Dim v As Object = oldm.Get(k)";
_v = _oldm.Get((Object)(_k));
RDebugUtils.currentLine=39714820;
 //BA.debugLineNum = 39714820;BA.debugLine="om.Put(k, v)";
_om.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=39714823;
 //BA.debugLineNum = 39714823;BA.debugLine="For Each k As String In newm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _newm.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_k = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=39714824;
 //BA.debugLineNum = 39714824;BA.debugLine="Dim v As Object = newm.Get(k)";
_v = _newm.Get((Object)(_k));
RDebugUtils.currentLine=39714825;
 //BA.debugLineNum = 39714825;BA.debugLine="om.Put(k, v)";
_om.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=39714827;
 //BA.debugLineNum = 39714827;BA.debugLine="Return om";
if (true) return _om;
RDebugUtils.currentLine=39714828;
 //BA.debugLineNum = 39714828;BA.debugLine="End Sub";
return null;
}
public String  _mvfield(b4j.example.bananovue __ref,String _svalue,int _iposition,String _delimiter) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "mvfield", true))
	 {return ((String) Debug.delegate(ba, "mvfield", new Object[] {_svalue,_iposition,_delimiter}));}
int _xpos = 0;
anywheresoftware.b4a.objects.collections.List _mvalues = null;
int _tvalues = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _startcnt = 0;
RDebugUtils.currentLine=44105728;
 //BA.debugLineNum = 44105728;BA.debugLine="Sub MvField(sValue As String, iPosition As Int, De";
RDebugUtils.currentLine=44105729;
 //BA.debugLineNum = 44105729;BA.debugLine="If sValue.Length = 0 Then Return \"\"";
if (_svalue.length()==0) { 
if (true) return "";};
RDebugUtils.currentLine=44105730;
 //BA.debugLineNum = 44105730;BA.debugLine="Dim xPos As Int = sValue.IndexOf(Delimiter)";
_xpos = _svalue.indexOf(_delimiter);
RDebugUtils.currentLine=44105731;
 //BA.debugLineNum = 44105731;BA.debugLine="If xPos = -1 Then Return sValue";
if (_xpos==-1) { 
if (true) return _svalue;};
RDebugUtils.currentLine=44105732;
 //BA.debugLineNum = 44105732;BA.debugLine="Dim mValues As List = StrParse(Delimiter,sValue)";
_mvalues = new anywheresoftware.b4a.objects.collections.List();
_mvalues = __ref._strparse /*anywheresoftware.b4a.objects.collections.List*/ (null,_delimiter,_svalue);
RDebugUtils.currentLine=44105733;
 //BA.debugLineNum = 44105733;BA.debugLine="Dim tValues As Int";
_tvalues = 0;
RDebugUtils.currentLine=44105734;
 //BA.debugLineNum = 44105734;BA.debugLine="tValues = mValues.size -1";
_tvalues = (int) (_mvalues.getSize()-1);
RDebugUtils.currentLine=44105735;
 //BA.debugLineNum = 44105735;BA.debugLine="Select Case iPosition";
switch (BA.switchObjectToInt(_iposition,(int) (-1),(int) (-2),(int) (-3))) {
case 0: {
RDebugUtils.currentLine=44105737;
 //BA.debugLineNum = 44105737;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 break; }
case 1: {
RDebugUtils.currentLine=44105739;
 //BA.debugLineNum = 44105739;BA.debugLine="Return mValues.get(tValues - 1)";
if (true) return BA.ObjectToString(_mvalues.Get((int) (_tvalues-1)));
 break; }
case 2: {
RDebugUtils.currentLine=44105741;
 //BA.debugLineNum = 44105741;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=44105742;
 //BA.debugLineNum = 44105742;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=44105743;
 //BA.debugLineNum = 44105743;BA.debugLine="Dim startcnt As Int";
_startcnt = 0;
RDebugUtils.currentLine=44105744;
 //BA.debugLineNum = 44105744;BA.debugLine="sb.Append(mValues.Get(1))";
_sb.Append(BA.ObjectToString(_mvalues.Get((int) (1))));
RDebugUtils.currentLine=44105745;
 //BA.debugLineNum = 44105745;BA.debugLine="For startcnt = 2 To tValues";
{
final int step17 = 1;
final int limit17 = _tvalues;
_startcnt = (int) (2) ;
for (;_startcnt <= limit17 ;_startcnt = _startcnt + step17 ) {
RDebugUtils.currentLine=44105746;
 //BA.debugLineNum = 44105746;BA.debugLine="sb.Append(Delimiter)";
_sb.Append(_delimiter);
RDebugUtils.currentLine=44105747;
 //BA.debugLineNum = 44105747;BA.debugLine="sb.Append(mValues.get(startcnt))";
_sb.Append(BA.ObjectToString(_mvalues.Get(_startcnt)));
 }
};
RDebugUtils.currentLine=44105749;
 //BA.debugLineNum = 44105749;BA.debugLine="Return sb.tostring";
if (true) return _sb.ToString();
 break; }
default: {
RDebugUtils.currentLine=44105751;
 //BA.debugLineNum = 44105751;BA.debugLine="iPosition = iPosition - 1";
_iposition = (int) (_iposition-1);
RDebugUtils.currentLine=44105752;
 //BA.debugLineNum = 44105752;BA.debugLine="If iPosition <= -1 Then";
if (_iposition<=-1) { 
RDebugUtils.currentLine=44105753;
 //BA.debugLineNum = 44105753;BA.debugLine="Return mValues.get(tValues)";
if (true) return BA.ObjectToString(_mvalues.Get(_tvalues));
 };
RDebugUtils.currentLine=44105755;
 //BA.debugLineNum = 44105755;BA.debugLine="If iPosition > tValues Then";
if (_iposition>_tvalues) { 
RDebugUtils.currentLine=44105756;
 //BA.debugLineNum = 44105756;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=44105758;
 //BA.debugLineNum = 44105758;BA.debugLine="Return mValues.get(iPosition)";
if (true) return BA.ObjectToString(_mvalues.Get(_iposition));
 break; }
}
;
RDebugUtils.currentLine=44105760;
 //BA.debugLineNum = 44105760;BA.debugLine="End Sub";
return "";
}
public String  _padright(b4j.example.bananovue __ref,String _value,int _maxlen,String _padchar) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "padright", true))
	 {return ((String) Debug.delegate(ba, "padright", new Object[] {_value,_maxlen,_padchar}));}
int _intordnolen = 0;
int _i = 0;
RDebugUtils.currentLine=36438016;
 //BA.debugLineNum = 36438016;BA.debugLine="Sub PadRight(Value As String, MaxLen As Int, PadCh";
RDebugUtils.currentLine=36438017;
 //BA.debugLineNum = 36438017;BA.debugLine="Value = CStr(Value)";
_value = __ref._cstr /*String*/ (null,(Object)(_value));
RDebugUtils.currentLine=36438018;
 //BA.debugLineNum = 36438018;BA.debugLine="Dim intOrdNoLen As Int = Len(Value)";
_intordnolen = __ref._len /*int*/ (null,_value);
RDebugUtils.currentLine=36438019;
 //BA.debugLineNum = 36438019;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=36438020;
 //BA.debugLineNum = 36438020;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step4 = 1;
final int limit4 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit4 ;_i = _i + step4 ) {
RDebugUtils.currentLine=36438021;
 //BA.debugLineNum = 36438021;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 }
};
RDebugUtils.currentLine=36438023;
 //BA.debugLineNum = 36438023;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=36438024;
 //BA.debugLineNum = 36438024;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _runmethod(b4j.example.bananovue __ref,String _methodname,Object _params) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "runmethod", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "runmethod", new Object[] {_methodname,_params}));}
RDebugUtils.currentLine=43515904;
 //BA.debugLineNum = 43515904;BA.debugLine="Sub RunMethod(methodName As String, params As Obje";
RDebugUtils.currentLine=43515905;
 //BA.debugLineNum = 43515905;BA.debugLine="Return BOVue.RunMethod(methodName, params)";
if (true) return __ref._bovue /*com.ab.banano.BANanoObject*/ .RunMethod(_methodname,_params);
RDebugUtils.currentLine=43515906;
 //BA.debugLineNum = 43515906;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setactivated(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setactivated", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setactivated", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=45023232;
 //BA.debugLineNum = 45023232;BA.debugLine="Sub SetActivated(module As Object, methodName As S";
RDebugUtils.currentLine=45023233;
 //BA.debugLineNum = 45023233;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45023234;
 //BA.debugLineNum = 45023234;BA.debugLine="activated = BANAno.CallBack(module, methodName, N";
__ref._activated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=45023235;
 //BA.debugLineNum = 45023235;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45023236;
 //BA.debugLineNum = 45023236;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforecreate(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setbeforecreate", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setbeforecreate", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=45416448;
 //BA.debugLineNum = 45416448;BA.debugLine="Sub SetBeforeCreate(module As Object, methodName A";
RDebugUtils.currentLine=45416449;
 //BA.debugLineNum = 45416449;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45416450;
 //BA.debugLineNum = 45416450;BA.debugLine="beforeCreate = BANAno.CallBack(module, methodName";
__ref._beforecreate /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=45416451;
 //BA.debugLineNum = 45416451;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45416452;
 //BA.debugLineNum = 45416452;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforedestroy(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setbeforedestroy", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setbeforedestroy", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=45350912;
 //BA.debugLineNum = 45350912;BA.debugLine="Sub SetBeforeDestroy(module As Object, methodName";
RDebugUtils.currentLine=45350913;
 //BA.debugLineNum = 45350913;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45350914;
 //BA.debugLineNum = 45350914;BA.debugLine="beforeDestroy = BANAno.CallBack(module, methodNam";
__ref._beforedestroy /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=45350915;
 //BA.debugLineNum = 45350915;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45350916;
 //BA.debugLineNum = 45350916;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforemount(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setbeforemount", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setbeforemount", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=45219840;
 //BA.debugLineNum = 45219840;BA.debugLine="Sub SetBeforeMount(module As Object, methodName As";
RDebugUtils.currentLine=45219841;
 //BA.debugLineNum = 45219841;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45219842;
 //BA.debugLineNum = 45219842;BA.debugLine="beforeMount = BANAno.CallBack(module, methodName,";
__ref._beforemount /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=45219843;
 //BA.debugLineNum = 45219843;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45219844;
 //BA.debugLineNum = 45219844;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setbeforeupdate(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setbeforeupdate", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setbeforeupdate", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=45285376;
 //BA.debugLineNum = 45285376;BA.debugLine="Sub SetBeforeUpdate(module As Object, methodName A";
RDebugUtils.currentLine=45285377;
 //BA.debugLineNum = 45285377;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45285378;
 //BA.debugLineNum = 45285378;BA.debugLine="beforeMount = BANAno.CallBack(module, methodName,";
__ref._beforemount /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=45285379;
 //BA.debugLineNum = 45285379;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45285380;
 //BA.debugLineNum = 45285380;BA.debugLine="End Sub";
return null;
}
public String  _setcallback(b4j.example.bananovue __ref,String _methodname,com.ab.banano.BANanoObject _cb) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setcallback", true))
	 {return ((String) Debug.delegate(ba, "setcallback", new Object[] {_methodname,_cb}));}
RDebugUtils.currentLine=45613056;
 //BA.debugLineNum = 45613056;BA.debugLine="Sub SetCallBack(methodName As String, cb As BANano";
RDebugUtils.currentLine=45613057;
 //BA.debugLineNum = 45613057;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45613058;
 //BA.debugLineNum = 45613058;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
RDebugUtils.currentLine=45613059;
 //BA.debugLineNum = 45613059;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setcloak(b4j.example.bananovue __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setcloak", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setcloak", new Object[] {_b}));}
RDebugUtils.currentLine=40501248;
 //BA.debugLineNum = 40501248;BA.debugLine="Sub SetCloak(b As Boolean) As BANanoVue";
RDebugUtils.currentLine=40501249;
 //BA.debugLineNum = 40501249;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.bananovue)(this);};
RDebugUtils.currentLine=40501250;
 //BA.debugLineNum = 40501250;BA.debugLine="Template.SetAttr(\"v-cloak\",\"true\")";
__ref._template /*b4j.example.vuehtml*/ ._setattr /*b4j.example.vuehtml*/ (null,"v-cloak","true");
RDebugUtils.currentLine=40501251;
 //BA.debugLineNum = 40501251;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=40501252;
 //BA.debugLineNum = 40501252;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setcomputed(b4j.example.bananovue __ref,String _k,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setcomputed", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setcomputed", new Object[] {_k,_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=45678592;
 //BA.debugLineNum = 45678592;BA.debugLine="Sub SetComputed(k As String, module As Object, met";
RDebugUtils.currentLine=45678593;
 //BA.debugLineNum = 45678593;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45678594;
 //BA.debugLineNum = 45678594;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
RDebugUtils.currentLine=45678595;
 //BA.debugLineNum = 45678595;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=45678596;
 //BA.debugLineNum = 45678596;BA.debugLine="If data.ContainsKey(k) Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=45678597;
 //BA.debugLineNum = 45678597;BA.debugLine="SetStateSingle(k, Null)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_k,__c.Null);
 };
RDebugUtils.currentLine=45678599;
 //BA.debugLineNum = 45678599;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=45678600;
 //BA.debugLineNum = 45678600;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
RDebugUtils.currentLine=45678601;
 //BA.debugLineNum = 45678601;BA.debugLine="computed.Put(k, cb)";
__ref._computed /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=45678603;
 //BA.debugLineNum = 45678603;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45678604;
 //BA.debugLineNum = 45678604;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setcreated(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setcreated", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setcreated", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=45481984;
 //BA.debugLineNum = 45481984;BA.debugLine="Sub SetCreated(module As Object, methodName As Str";
RDebugUtils.currentLine=45481985;
 //BA.debugLineNum = 45481985;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45481986;
 //BA.debugLineNum = 45481986;BA.debugLine="created = BANAno.CallBack(module, methodName, Nul";
__ref._created /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=45481987;
 //BA.debugLineNum = 45481987;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45481988;
 //BA.debugLineNum = 45481988;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setdeactivated(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setdeactivated", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setdeactivated", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=45088768;
 //BA.debugLineNum = 45088768;BA.debugLine="Sub SetDeActivated(module As Object, methodName As";
RDebugUtils.currentLine=45088769;
 //BA.debugLineNum = 45088769;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45088770;
 //BA.debugLineNum = 45088770;BA.debugLine="deactivated = BANAno.CallBack(module, methodName,";
__ref._deactivated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=45088771;
 //BA.debugLineNum = 45088771;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45088772;
 //BA.debugLineNum = 45088772;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setdestroyed(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setdestroyed", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setdestroyed", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=44957696;
 //BA.debugLineNum = 44957696;BA.debugLine="Sub SetDestroyed(module As Object, methodName As S";
RDebugUtils.currentLine=44957697;
 //BA.debugLineNum = 44957697;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=44957698;
 //BA.debugLineNum = 44957698;BA.debugLine="destroyed = BANAno.CallBack(module, methodName, N";
__ref._destroyed /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=44957699;
 //BA.debugLineNum = 44957699;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=44957700;
 //BA.debugLineNum = 44957700;BA.debugLine="End Sub";
return null;
}
public String  _setfontfamily(b4j.example.bananovue __ref,Object _ff) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setfontfamily", true))
	 {return ((String) Debug.delegate(ba, "setfontfamily", new Object[] {_ff}));}
RDebugUtils.currentLine=44433408;
 //BA.debugLineNum = 44433408;BA.debugLine="Sub SetFontFamily(ff As Object)";
RDebugUtils.currentLine=44433409;
 //BA.debugLineNum = 44433409;BA.debugLine="body.SetStyle(BANAno.ToJson(CreateMap(\"font-famil";
__ref._body /*com.ab.banano.BANanoElement*/ .SetStyle(BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(__c.createMap(new Object[] {(Object)("font-family"),_ff}).getObject()))));
RDebugUtils.currentLine=44433410;
 //BA.debugLineNum = 44433410;BA.debugLine="End Sub";
return "";
}
public String  _use1(b4j.example.bananovue __ref,com.ab.banano.BANanoObject _bo,anywheresoftware.b4a.objects.collections.Map _opt) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "use1", true))
	 {return ((String) Debug.delegate(ba, "use1", new Object[] {_bo,_opt}));}
RDebugUtils.currentLine=44695552;
 //BA.debugLineNum = 44695552;BA.debugLine="Sub Use1(bo As BANanoObject, opt As Map)";
RDebugUtils.currentLine=44695553;
 //BA.debugLineNum = 44695553;BA.debugLine="BOVue.RunMethod(\"use\", Array(bo, opt))";
__ref._bovue /*com.ab.banano.BANanoObject*/ .RunMethod("use",(Object)(new Object[]{(Object)(_bo.getObject()),(Object)(_opt.getObject())}));
RDebugUtils.currentLine=44695554;
 //BA.debugLineNum = 44695554;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setmethod(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setmethod", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setmethod", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=45547520;
 //BA.debugLineNum = 45547520;BA.debugLine="Sub SetMethod(module As Object, methodName As Stri";
RDebugUtils.currentLine=45547521;
 //BA.debugLineNum = 45547521;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45547522;
 //BA.debugLineNum = 45547522;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
RDebugUtils.currentLine=45547523;
 //BA.debugLineNum = 45547523;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=45547524;
 //BA.debugLineNum = 45547524;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
RDebugUtils.currentLine=45547525;
 //BA.debugLineNum = 45547525;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=45547527;
 //BA.debugLineNum = 45547527;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45547528;
 //BA.debugLineNum = 45547528;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setmounted(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setmounted", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setmounted", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=44892160;
 //BA.debugLineNum = 44892160;BA.debugLine="Sub SetMounted(module As Object, methodName As Str";
RDebugUtils.currentLine=44892161;
 //BA.debugLineNum = 44892161;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=44892162;
 //BA.debugLineNum = 44892162;BA.debugLine="mounted = BANAno.CallBack(module, methodName, Nul";
__ref._mounted /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=44892163;
 //BA.debugLineNum = 44892163;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=44892164;
 //BA.debugLineNum = 44892164;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatedecrement(b4j.example.bananovue __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstatedecrement", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstatedecrement", new Object[] {_k}));}
String _oldv = "";
RDebugUtils.currentLine=43778048;
 //BA.debugLineNum = 43778048;BA.debugLine="Sub SetStateDecrement(k As String) As BANanoVue";
RDebugUtils.currentLine=43778049;
 //BA.debugLineNum = 43778049;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(__ref._getstate /*Object*/ (null,_k,(Object)("0")));
RDebugUtils.currentLine=43778050;
 //BA.debugLineNum = 43778050;BA.debugLine="oldV = BANAno.parseInt(oldV) - 1";
_oldv = BA.NumberToString(__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_oldv))-1);
RDebugUtils.currentLine=43778051;
 //BA.debugLineNum = 43778051;BA.debugLine="SetStateSingle(k, oldV)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_k,(Object)(_oldv));
RDebugUtils.currentLine=43778052;
 //BA.debugLineNum = 43778052;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=43778053;
 //BA.debugLineNum = 43778053;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatefalse(b4j.example.bananovue __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstatefalse", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstatefalse", new Object[] {_k}));}
RDebugUtils.currentLine=43646976;
 //BA.debugLineNum = 43646976;BA.debugLine="Sub SetStateFalse(k As String) As BANanoVue";
RDebugUtils.currentLine=43646977;
 //BA.debugLineNum = 43646977;BA.debugLine="SetStateSingle(k,False)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_k,(Object)(__c.False));
RDebugUtils.currentLine=43646978;
 //BA.debugLineNum = 43646978;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=43646979;
 //BA.debugLineNum = 43646979;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstateincrement(b4j.example.bananovue __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstateincrement", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstateincrement", new Object[] {_k}));}
String _oldv = "";
RDebugUtils.currentLine=43712512;
 //BA.debugLineNum = 43712512;BA.debugLine="Sub SetStateIncrement(k As String) As BANanoVue";
RDebugUtils.currentLine=43712513;
 //BA.debugLineNum = 43712513;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
_oldv = BA.ObjectToString(__ref._getstate /*Object*/ (null,_k,(Object)("0")));
RDebugUtils.currentLine=43712514;
 //BA.debugLineNum = 43712514;BA.debugLine="oldV = BANAno.parseInt(oldV) + 1";
_oldv = BA.NumberToString(__ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_oldv))+1);
RDebugUtils.currentLine=43712515;
 //BA.debugLineNum = 43712515;BA.debugLine="SetStateSingle(k, oldV)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_k,(Object)(_oldv));
RDebugUtils.currentLine=43712516;
 //BA.debugLineNum = 43712516;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=43712517;
 //BA.debugLineNum = 43712517;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatelist(b4j.example.bananovue __ref,String _mapkey,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstatelist", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstatelist", new Object[] {_mapkey,_mapvalues}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=45940736;
 //BA.debugLineNum = 45940736;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
RDebugUtils.currentLine=45940737;
 //BA.debugLineNum = 45940737;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=45940738;
 //BA.debugLineNum = 45940738;BA.debugLine="opt.Put(mapKey, mapValues)";
_opt.Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
RDebugUtils.currentLine=45940739;
 //BA.debugLineNum = 45940739;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=45940740;
 //BA.debugLineNum = 45940740;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45940741;
 //BA.debugLineNum = 45940741;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatelistvalues(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstatelistvalues", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstatelistvalues", new Object[] {_mapvalues}));}
String _lstvalue = "";
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=46006272;
 //BA.debugLineNum = 46006272;BA.debugLine="Sub SetStateListValues(mapValues As List) As BANan";
RDebugUtils.currentLine=46006273;
 //BA.debugLineNum = 46006273;BA.debugLine="For Each lstValue As String In mapValues";
{
final anywheresoftware.b4a.BA.IterableList group1 = _mapvalues;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lstvalue = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=46006274;
 //BA.debugLineNum = 46006274;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=46006275;
 //BA.debugLineNum = 46006275;BA.debugLine="opt.Put(lstValue, \"\")";
_opt.Put((Object)(_lstvalue),(Object)(""));
RDebugUtils.currentLine=46006276;
 //BA.debugLineNum = 46006276;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.bananovue*/ (null,_opt);
 }
};
RDebugUtils.currentLine=46006278;
 //BA.debugLineNum = 46006278;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=46006279;
 //BA.debugLineNum = 46006279;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatemap(b4j.example.bananovue __ref,String _mapkey,anywheresoftware.b4a.objects.collections.Map _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstatemap", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstatemap", new Object[] {_mapkey,_mapvalues}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=45875200;
 //BA.debugLineNum = 45875200;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
RDebugUtils.currentLine=45875201;
 //BA.debugLineNum = 45875201;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=45875202;
 //BA.debugLineNum = 45875202;BA.debugLine="opt.Put(mapKey, mapValues)";
_opt.Put((Object)(_mapkey),(Object)(_mapvalues.getObject()));
RDebugUtils.currentLine=45875203;
 //BA.debugLineNum = 45875203;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.bananovue*/ (null,_opt);
RDebugUtils.currentLine=45875204;
 //BA.debugLineNum = 45875204;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45875205;
 //BA.debugLineNum = 45875205;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstatetrue(b4j.example.bananovue __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstatetrue", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstatetrue", new Object[] {_k}));}
RDebugUtils.currentLine=43581440;
 //BA.debugLineNum = 43581440;BA.debugLine="Sub SetStateTrue(k As String) As BANanoVue";
RDebugUtils.currentLine=43581441;
 //BA.debugLineNum = 43581441;BA.debugLine="SetStateSingle(k,True)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_k,(Object)(__c.True));
RDebugUtils.currentLine=43581442;
 //BA.debugLineNum = 43581442;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=43581443;
 //BA.debugLineNum = 43581443;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setstyle(b4j.example.bananovue __ref,String _classname,String _prop,String _valx) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setstyle", new Object[] {_classname,_prop,_valx}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=41222144;
 //BA.debugLineNum = 41222144;BA.debugLine="Sub SetStyle(className As String, prop As String,";
RDebugUtils.currentLine=41222145;
 //BA.debugLineNum = 41222145;BA.debugLine="Dim m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=41222146;
 //BA.debugLineNum = 41222146;BA.debugLine="If dynamicStyle.ContainsKey(className) Then";
if (__ref._dynamicstyle /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_classname))) { 
RDebugUtils.currentLine=41222147;
 //BA.debugLineNum = 41222147;BA.debugLine="m = dynamicStyle.Get(className)";
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._dynamicstyle /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_classname))));
RDebugUtils.currentLine=41222148;
 //BA.debugLineNum = 41222148;BA.debugLine="m.Put(prop, valx)";
_m.Put((Object)(_prop),(Object)(_valx));
 }else {
RDebugUtils.currentLine=41222150;
 //BA.debugLineNum = 41222150;BA.debugLine="m = CreateMap()";
_m = __c.createMap(new Object[] {});
RDebugUtils.currentLine=41222151;
 //BA.debugLineNum = 41222151;BA.debugLine="m.Put(prop, valx)";
_m.Put((Object)(_prop),(Object)(_valx));
 };
RDebugUtils.currentLine=41222153;
 //BA.debugLineNum = 41222153;BA.debugLine="dynamicStyle.Put(className, m)";
__ref._dynamicstyle /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_classname),(Object)(_m.getObject()));
RDebugUtils.currentLine=41222154;
 //BA.debugLineNum = 41222154;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=41222155;
 //BA.debugLineNum = 41222155;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setupdated(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setupdated", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setupdated", new Object[] {_module,_methodname}));}
RDebugUtils.currentLine=45154304;
 //BA.debugLineNum = 45154304;BA.debugLine="Sub SetUpdated(module As Object, methodName As Str";
RDebugUtils.currentLine=45154305;
 //BA.debugLineNum = 45154305;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45154306;
 //BA.debugLineNum = 45154306;BA.debugLine="updated = BANAno.CallBack(module, methodName, Nul";
__ref._updated /*com.ab.banano.BANanoObject*/ .setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=45154307;
 //BA.debugLineNum = 45154307;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45154308;
 //BA.debugLineNum = 45154308;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _setwatch(b4j.example.bananovue __ref,String _k,boolean _bimmediate,boolean _bdeep,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setwatch", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setwatch", new Object[] {_k,_bimmediate,_bdeep,_module,_methodname}));}
Object _newval = null;
com.ab.banano.BANanoObject _cb = null;
anywheresoftware.b4a.objects.collections.Map _deepit = null;
RDebugUtils.currentLine=45809664;
 //BA.debugLineNum = 45809664;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
RDebugUtils.currentLine=45809665;
 //BA.debugLineNum = 45809665;BA.debugLine="methodName = methodName.tolowercase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45809666;
 //BA.debugLineNum = 45809666;BA.debugLine="If SubExists(module, methodName) Then";
if (__c.SubExists(ba,_module,_methodname)) { 
RDebugUtils.currentLine=45809667;
 //BA.debugLineNum = 45809667;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=45809668;
 //BA.debugLineNum = 45809668;BA.debugLine="If data.ContainsKey(k) Then";
if (__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=45809669;
 //BA.debugLineNum = 45809669;BA.debugLine="SetStateSingle(k, Null)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_k,__c.Null);
 };
RDebugUtils.currentLine=45809671;
 //BA.debugLineNum = 45809671;BA.debugLine="Dim newVal As Object";
_newval = new Object();
RDebugUtils.currentLine=45809672;
 //BA.debugLineNum = 45809672;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_newval}))));
RDebugUtils.currentLine=45809673;
 //BA.debugLineNum = 45809673;BA.debugLine="Dim deepit As Map = CreateMap()";
_deepit = new anywheresoftware.b4a.objects.collections.Map();
_deepit = __c.createMap(new Object[] {});
RDebugUtils.currentLine=45809674;
 //BA.debugLineNum = 45809674;BA.debugLine="deepit.Put(\"handler\", methodName)";
_deepit.Put((Object)("handler"),(Object)(_methodname));
RDebugUtils.currentLine=45809675;
 //BA.debugLineNum = 45809675;BA.debugLine="deepit.Put(\"deep\", bDeep)";
_deepit.Put((Object)("deep"),(Object)(_bdeep));
RDebugUtils.currentLine=45809676;
 //BA.debugLineNum = 45809676;BA.debugLine="deepit.Put(\"immediate\", bImmediate)";
_deepit.Put((Object)("immediate"),(Object)(_bimmediate));
RDebugUtils.currentLine=45809677;
 //BA.debugLineNum = 45809677;BA.debugLine="watches.Put(k, deepit)";
__ref._watches /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),(Object)(_deepit.getObject()));
RDebugUtils.currentLine=45809678;
 //BA.debugLineNum = 45809678;BA.debugLine="methods.Put(methodName, cb)";
__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_methodname),(Object)(_cb.getObject()));
 };
RDebugUtils.currentLine=45809680;
 //BA.debugLineNum = 45809680;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45809681;
 //BA.debugLineNum = 45809681;BA.debugLine="End Sub";
return null;
}
public String  _state2another(b4j.example.bananovue __ref,String _source,String _target,Object _defaultvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "state2another", true))
	 {return ((String) Debug.delegate(ba, "state2another", new Object[] {_source,_target,_defaultvalue}));}
Object _readobj = null;
RDebugUtils.currentLine=34930688;
 //BA.debugLineNum = 34930688;BA.debugLine="Sub State2Another(source As String, target As Stri";
RDebugUtils.currentLine=34930689;
 //BA.debugLineNum = 34930689;BA.debugLine="Dim readObj As Object = GetState(source, defaultV";
_readobj = __ref._getstate /*Object*/ (null,_source,_defaultvalue);
RDebugUtils.currentLine=34930690;
 //BA.debugLineNum = 34930690;BA.debugLine="SetStateSingle(target, readObj)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_target,_readobj);
RDebugUtils.currentLine=34930691;
 //BA.debugLineNum = 34930691;BA.debugLine="End Sub";
return "";
}
public boolean  _stateexists(b4j.example.bananovue __ref,String _statename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "stateexists", true))
	 {return ((Boolean) Debug.delegate(ba, "stateexists", new Object[] {_statename}));}
RDebugUtils.currentLine=44367872;
 //BA.debugLineNum = 44367872;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
RDebugUtils.currentLine=44367873;
 //BA.debugLineNum = 44367873;BA.debugLine="stateName = stateName.tolowercase";
_statename = _statename.toLowerCase();
RDebugUtils.currentLine=44367874;
 //BA.debugLineNum = 44367874;BA.debugLine="Return data.ContainsKey(stateName)";
if (true) return __ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_statename));
RDebugUtils.currentLine=44367875;
 //BA.debugLineNum = 44367875;BA.debugLine="End Sub";
return false;
}
public anywheresoftware.b4a.objects.collections.List  _strparse(b4j.example.bananovue __ref,String _delim,String _inputstring) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "strparse", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "strparse", new Object[] {_delim,_inputstring}));}
anywheresoftware.b4a.objects.collections.List _outlist = null;
int _commaloc = 0;
String _leftside = "";
String _rightside = "";
RDebugUtils.currentLine=44040192;
 //BA.debugLineNum = 44040192;BA.debugLine="Sub StrParse(Delim As String, InputString As Strin";
RDebugUtils.currentLine=44040193;
 //BA.debugLineNum = 44040193;BA.debugLine="Dim OutList As List";
_outlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=44040194;
 //BA.debugLineNum = 44040194;BA.debugLine="Dim CommaLoc As Int";
_commaloc = 0;
RDebugUtils.currentLine=44040195;
 //BA.debugLineNum = 44040195;BA.debugLine="OutList.Initialize";
_outlist.Initialize();
RDebugUtils.currentLine=44040196;
 //BA.debugLineNum = 44040196;BA.debugLine="OutList.clear";
_outlist.Clear();
RDebugUtils.currentLine=44040197;
 //BA.debugLineNum = 44040197;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
RDebugUtils.currentLine=44040198;
 //BA.debugLineNum = 44040198;BA.debugLine="Do While CommaLoc >-1";
while (_commaloc>-1) {
RDebugUtils.currentLine=44040199;
 //BA.debugLineNum = 44040199;BA.debugLine="Dim LeftSide As String";
_leftside = "";
RDebugUtils.currentLine=44040200;
 //BA.debugLineNum = 44040200;BA.debugLine="LeftSide= InputString.SubString2(0,CommaLoc)";
_leftside = _inputstring.substring((int) (0),_commaloc);
RDebugUtils.currentLine=44040201;
 //BA.debugLineNum = 44040201;BA.debugLine="Dim RightSide As String";
_rightside = "";
RDebugUtils.currentLine=44040202;
 //BA.debugLineNum = 44040202;BA.debugLine="RightSide= InputString.SubString(CommaLoc+1)";
_rightside = _inputstring.substring((int) (_commaloc+1));
RDebugUtils.currentLine=44040203;
 //BA.debugLineNum = 44040203;BA.debugLine="OutList.Add(LeftSide)";
_outlist.Add((Object)(_leftside));
RDebugUtils.currentLine=44040204;
 //BA.debugLineNum = 44040204;BA.debugLine="InputString=RightSide";
_inputstring = _rightside;
RDebugUtils.currentLine=44040205;
 //BA.debugLineNum = 44040205;BA.debugLine="CommaLoc=InputString.IndexOf(Delim)";
_commaloc = _inputstring.indexOf(_delim);
 }
;
RDebugUtils.currentLine=44040207;
 //BA.debugLineNum = 44040207;BA.debugLine="OutList.Add(InputString)";
_outlist.Add((Object)(_inputstring));
RDebugUtils.currentLine=44040208;
 //BA.debugLineNum = 44040208;BA.debugLine="Return OutList";
if (true) return _outlist;
RDebugUtils.currentLine=44040209;
 //BA.debugLineNum = 44040209;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _togglenamedstate(b4j.example.bananovue __ref,String _statename,String _state1,String _state2) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "togglenamedstate", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "togglenamedstate", new Object[] {_statename,_state1,_state2}));}
String _bcurrent = "";
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=43974656;
 //BA.debugLineNum = 43974656;BA.debugLine="Sub ToggleNamedState(stateName As String, state1 A";
RDebugUtils.currentLine=43974657;
 //BA.debugLineNum = 43974657;BA.debugLine="Dim bcurrent As String = GetState(stateName,\"\")";
_bcurrent = BA.ObjectToString(__ref._getstate /*Object*/ (null,_statename,(Object)("")));
RDebugUtils.currentLine=43974658;
 //BA.debugLineNum = 43974658;BA.debugLine="If bcurrent.EqualsIgnoreCase(state1) Then";
if (_bcurrent.equalsIgnoreCase(_state1)) { 
RDebugUtils.currentLine=43974659;
 //BA.debugLineNum = 43974659;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=43974660;
 //BA.debugLineNum = 43974660;BA.debugLine="opt.Put(stateName, state2)";
_opt.Put((Object)(_statename),(Object)(_state2));
RDebugUtils.currentLine=43974661;
 //BA.debugLineNum = 43974661;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.bananovue*/ (null,_opt);
 }else {
RDebugUtils.currentLine=43974663;
 //BA.debugLineNum = 43974663;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=43974664;
 //BA.debugLineNum = 43974664;BA.debugLine="opt.Put(stateName, state1)";
_opt.Put((Object)(_statename),(Object)(_state1));
RDebugUtils.currentLine=43974665;
 //BA.debugLineNum = 43974665;BA.debugLine="SetState(opt)";
__ref._setstate /*b4j.example.bananovue*/ (null,_opt);
 };
RDebugUtils.currentLine=43974667;
 //BA.debugLineNum = 43974667;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=43974668;
 //BA.debugLineNum = 43974668;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananovue  _togglestate(b4j.example.bananovue __ref,String _statename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "togglestate", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "togglestate", new Object[] {_statename}));}
boolean _bcurrent = false;
RDebugUtils.currentLine=43909120;
 //BA.debugLineNum = 43909120;BA.debugLine="Sub ToggleState(stateName As String) As BANanoVue";
RDebugUtils.currentLine=43909121;
 //BA.debugLineNum = 43909121;BA.debugLine="Dim bcurrent As Boolean = GetState(stateName,Fals";
_bcurrent = BA.ObjectToBoolean(__ref._getstate /*Object*/ (null,_statename,(Object)(__c.False)));
RDebugUtils.currentLine=43909122;
 //BA.debugLineNum = 43909122;BA.debugLine="bcurrent = Not(bcurrent)";
_bcurrent = __c.Not(_bcurrent);
RDebugUtils.currentLine=43909123;
 //BA.debugLineNum = 43909123;BA.debugLine="SetStateSingle(stateName, bcurrent)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_statename,(Object)(_bcurrent));
RDebugUtils.currentLine=43909124;
 //BA.debugLineNum = 43909124;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=43909125;
 //BA.debugLineNum = 43909125;BA.debugLine="End Sub";
return null;
}
public String  _ux(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "ux", true))
	 {return ((String) Debug.delegate(ba, "ux", null));}
String _tmp = "";
anywheresoftware.b4a.objects.collections.Map _ropt = null;
com.ab.banano.BANanoObject _router = null;
String _dkey = "";
String _rkey = "";
RDebugUtils.currentLine=44761088;
 //BA.debugLineNum = 44761088;BA.debugLine="Sub UX()";
RDebugUtils.currentLine=44761089;
 //BA.debugLineNum = 44761089;BA.debugLine="Dim tmp As String = Template.tostring";
_tmp = __ref._template /*b4j.example.vuehtml*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=44761090;
 //BA.debugLineNum = 44761090;BA.debugLine="GetTemplate = tmp";
__ref._gettemplate /*String*/  = _tmp;
RDebugUtils.currentLine=44761091;
 //BA.debugLineNum = 44761091;BA.debugLine="If routes.Size > 0 Then";
if (__ref._routes /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=44761092;
 //BA.debugLineNum = 44761092;BA.debugLine="Dim ropt As Map = CreateMap()";
_ropt = new anywheresoftware.b4a.objects.collections.Map();
_ropt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=44761093;
 //BA.debugLineNum = 44761093;BA.debugLine="ropt.Put(\"mode\", \"history\")";
_ropt.Put((Object)("mode"),(Object)("history"));
RDebugUtils.currentLine=44761094;
 //BA.debugLineNum = 44761094;BA.debugLine="ropt.Put(\"routes\", routes)";
_ropt.Put((Object)("routes"),(Object)(__ref._routes /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=44761095;
 //BA.debugLineNum = 44761095;BA.debugLine="Dim router As BANanoObject";
_router = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=44761096;
 //BA.debugLineNum = 44761096;BA.debugLine="router.Initialize2(\"VueRouter\", Array(ropt))";
_router.Initialize2("VueRouter",(Object)(new Object[]{(Object)(_ropt.getObject())}));
RDebugUtils.currentLine=44761097;
 //BA.debugLineNum = 44761097;BA.debugLine="Options.Put(\"router\", router)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("router"),(Object)(_router.getObject()));
 };
RDebugUtils.currentLine=44761099;
 //BA.debugLineNum = 44761099;BA.debugLine="Options.Put(\"el\", \"#app\")";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("el"),(Object)("#app"));
RDebugUtils.currentLine=44761100;
 //BA.debugLineNum = 44761100;BA.debugLine="If data.Size > 0 Then Options.put(\"data\", data)";
if (__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("data"),(Object)(__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=44761101;
 //BA.debugLineNum = 44761101;BA.debugLine="If methods.Size > 0 Then Options.Put(\"methods\", m";
if (__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("methods"),(Object)(__ref._methods /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=44761102;
 //BA.debugLineNum = 44761102;BA.debugLine="If computed.Size > 0 Then Options.Put(\"computed\",";
if (__ref._computed /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("computed"),(Object)(__ref._computed /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=44761103;
 //BA.debugLineNum = 44761103;BA.debugLine="If watches.Size > 0 Then Options.Put(\"watch\", wat";
if (__ref._watches /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("watch"),(Object)(__ref._watches /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=44761104;
 //BA.debugLineNum = 44761104;BA.debugLine="If components.Size > 0 Then Options.Put(\"componen";
if (__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("components"),(Object)(__ref._components /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));};
RDebugUtils.currentLine=44761105;
 //BA.debugLineNum = 44761105;BA.debugLine="If updated <> Null Then Options.Put(\"updated\", up";
if (__ref._updated /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("updated"),(Object)(__ref._updated /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761106;
 //BA.debugLineNum = 44761106;BA.debugLine="If destroyed <> Null Then Options.Put(\"destroyed\"";
if (__ref._destroyed /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("destroyed"),(Object)(__ref._destroyed /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761107;
 //BA.debugLineNum = 44761107;BA.debugLine="If mounted <> Null Then	Options.Put(\"mounted\", mo";
if (__ref._mounted /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("mounted"),(Object)(__ref._mounted /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761108;
 //BA.debugLineNum = 44761108;BA.debugLine="If beforeCreate <> Null Then Options.Put(\"beforeC";
if (__ref._beforecreate /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("beforeCreate"),(Object)(__ref._beforecreate /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761109;
 //BA.debugLineNum = 44761109;BA.debugLine="If created <> Null Then Options.Put(\"created\", cr";
if (__ref._created /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("created"),(Object)(__ref._created /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761110;
 //BA.debugLineNum = 44761110;BA.debugLine="If beforeMount <> Null Then Options.Put(\"beforeMo";
if (__ref._beforemount /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("beforeMount"),(Object)(__ref._beforemount /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761111;
 //BA.debugLineNum = 44761111;BA.debugLine="If beforeUpdate <> Null Then Options.Put(\"beforeU";
if (__ref._beforeupdate /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("beforeUpdate"),(Object)(__ref._beforeupdate /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761112;
 //BA.debugLineNum = 44761112;BA.debugLine="If activated <> Null Then Options.Put(\"activated\"";
if (__ref._activated /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("activated"),(Object)(__ref._activated /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761113;
 //BA.debugLineNum = 44761113;BA.debugLine="If deactivated <> Null Then Options.Put(\"deactiva";
if (__ref._deactivated /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("deactivated"),(Object)(__ref._deactivated /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761114;
 //BA.debugLineNum = 44761114;BA.debugLine="If beforeDestroy <> Null Then Options.Put(\"before";
if (__ref._beforedestroy /*com.ab.banano.BANanoObject*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("beforeDestroy"),(Object)(__ref._beforedestroy /*com.ab.banano.BANanoObject*/ .getObject()));};
RDebugUtils.currentLine=44761115;
 //BA.debugLineNum = 44761115;BA.debugLine="Options.Put(\"template\", tmp)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("template"),(Object)(_tmp));
RDebugUtils.currentLine=44761116;
 //BA.debugLineNum = 44761116;BA.debugLine="BOVue.Initialize2(\"Vue\", Options)";
__ref._bovue /*com.ab.banano.BANanoObject*/ .Initialize2("Vue",(Object)(__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=44761118;
 //BA.debugLineNum = 44761118;BA.debugLine="Dim dKey As String = \"$data\"";
_dkey = "$data";
RDebugUtils.currentLine=44761119;
 //BA.debugLineNum = 44761119;BA.debugLine="data = BOVue.GetField(dKey).Result";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._bovue /*com.ab.banano.BANanoObject*/ .GetField(_dkey).Result()));
RDebugUtils.currentLine=44761121;
 //BA.debugLineNum = 44761121;BA.debugLine="Dim rKey As String = \"$refs\"";
_rkey = "$refs";
RDebugUtils.currentLine=44761122;
 //BA.debugLineNum = 44761122;BA.debugLine="refs = BOVue.GetField(rKey).result";
__ref._refs /*anywheresoftware.b4a.objects.collections.Map*/ .setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._bovue /*com.ab.banano.BANanoObject*/ .GetField(_rkey).Result()));
RDebugUtils.currentLine=44761123;
 //BA.debugLineNum = 44761123;BA.debugLine="End Sub";
return "";
}
public boolean  _validate(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _rec,anywheresoftware.b4a.objects.collections.Map _required) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "validate", true))
	 {return ((Boolean) Debug.delegate(ba, "validate", new Object[] {_rec,_required}));}
int _iv = 0;
String _k = "";
String _v = "";
RDebugUtils.currentLine=42139648;
 //BA.debugLineNum = 42139648;BA.debugLine="Sub Validate(rec As Map, required As Map) As Boole";
RDebugUtils.currentLine=42139649;
 //BA.debugLineNum = 42139649;BA.debugLine="Dim iv As Int = 0";
_iv = (int) (0);
RDebugUtils.currentLine=42139650;
 //BA.debugLineNum = 42139650;BA.debugLine="For Each k As String In required.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _required.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=42139651;
 //BA.debugLineNum = 42139651;BA.debugLine="If rec.ContainsKey(k) Then";
if (_rec.ContainsKey((Object)(_k))) { 
RDebugUtils.currentLine=42139652;
 //BA.debugLineNum = 42139652;BA.debugLine="Dim v As String = rec.GetDefault(k,\"\")";
_v = BA.ObjectToString(_rec.GetDefault((Object)(_k),(Object)("")));
RDebugUtils.currentLine=42139653;
 //BA.debugLineNum = 42139653;BA.debugLine="v = CStr(v)";
_v = __ref._cstr /*String*/ (null,(Object)(_v));
RDebugUtils.currentLine=42139654;
 //BA.debugLineNum = 42139654;BA.debugLine="v = v.trim";
_v = _v.trim();
RDebugUtils.currentLine=42139655;
 //BA.debugLineNum = 42139655;BA.debugLine="If v = \"\" Then";
if ((_v).equals("")) { 
RDebugUtils.currentLine=42139656;
 //BA.debugLineNum = 42139656;BA.debugLine="Log(\"Validate: \" & k)";
__c.Log("Validate: "+_k);
RDebugUtils.currentLine=42139657;
 //BA.debugLineNum = 42139657;BA.debugLine="iv = iv + 1";
_iv = (int) (_iv+1);
RDebugUtils.currentLine=42139658;
 //BA.debugLineNum = 42139658;BA.debugLine="ShowError(k)";
__ref._showerror /*String*/ (null,_k);
 }else {
RDebugUtils.currentLine=42139660;
 //BA.debugLineNum = 42139660;BA.debugLine="HideError(k)";
__ref._hideerror /*String*/ (null,_k);
 };
 };
 }
};
RDebugUtils.currentLine=42139664;
 //BA.debugLineNum = 42139664;BA.debugLine="If iv = 0 Then";
if (_iv==0) { 
RDebugUtils.currentLine=42139665;
 //BA.debugLineNum = 42139665;BA.debugLine="Return True";
if (true) return __c.True;
 }else {
RDebugUtils.currentLine=42139667;
 //BA.debugLineNum = 42139667;BA.debugLine="Return False";
if (true) return __c.False;
 };
RDebugUtils.currentLine=42139669;
 //BA.debugLineNum = 42139669;BA.debugLine="End Sub";
return false;
}
public String  _aftertodayrg(b4j.example.bananovue __ref,long _dvariance) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "aftertodayrg", true))
	 {return ((String) Debug.delegate(ba, "aftertodayrg", new Object[] {_dvariance}));}
RDebugUtils.currentLine=47448064;
 //BA.debugLineNum = 47448064;BA.debugLine="public Sub AfterTodayRG(dVariance As Long) As Stri";
RDebugUtils.currentLine=47448065;
 //BA.debugLineNum = 47448065;BA.debugLine="If dVariance <= 0 Then";
if (_dvariance<=0) { 
RDebugUtils.currentLine=47448066;
 //BA.debugLineNum = 47448066;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else 
{RDebugUtils.currentLine=47448067;
 //BA.debugLineNum = 47448067;BA.debugLine="else if dVariance > 0 Then";
if (_dvariance>0) { 
RDebugUtils.currentLine=47448068;
 //BA.debugLineNum = 47448068;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else {
RDebugUtils.currentLine=47448070;
 //BA.debugLineNum = 47448070;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 }}
;
RDebugUtils.currentLine=47448072;
 //BA.debugLineNum = 47448072;BA.debugLine="End Sub";
return "";
}
public String  _alpha(b4j.example.bananovue __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "alpha", true))
	 {return ((String) Debug.delegate(ba, "alpha", new Object[] {_value}));}
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
RDebugUtils.currentLine=36634624;
 //BA.debugLineNum = 36634624;BA.debugLine="Public Sub Alpha(value As String) As String";
RDebugUtils.currentLine=36634625;
 //BA.debugLineNum = 36634625;BA.debugLine="value = CStr(value)";
_value = __ref._cstr /*String*/ (null,(Object)(_value));
RDebugUtils.currentLine=36634626;
 //BA.debugLineNum = 36634626;BA.debugLine="Try";
try {RDebugUtils.currentLine=36634627;
 //BA.debugLineNum = 36634627;BA.debugLine="value = value.Trim";
_value = _value.trim();
RDebugUtils.currentLine=36634628;
 //BA.debugLineNum = 36634628;BA.debugLine="If value = \"\" Then value = \"\"";
if ((_value).equals("")) { 
_value = "";};
RDebugUtils.currentLine=36634629;
 //BA.debugLineNum = 36634629;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
RDebugUtils.currentLine=36634630;
 //BA.debugLineNum = 36634630;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
RDebugUtils.currentLine=36634631;
 //BA.debugLineNum = 36634631;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
RDebugUtils.currentLine=36634632;
 //BA.debugLineNum = 36634632;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=36634633;
 //BA.debugLineNum = 36634633;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=36634634;
 //BA.debugLineNum = 36634634;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
RDebugUtils.currentLine=36634635;
 //BA.debugLineNum = 36634635;BA.debugLine="If InStr(\"abcdefghijklmnopqrstuvwxyzABCDEFGHIJK";
if (__ref._instr /*int*/ (null,"abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ",_mout)!=-1) { 
RDebugUtils.currentLine=36634636;
 //BA.debugLineNum = 36634636;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
RDebugUtils.currentLine=36634639;
 //BA.debugLineNum = 36634639;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=36634641;
 //BA.debugLineNum = 36634641;BA.debugLine="Return value";
if (true) return _value;
 };
RDebugUtils.currentLine=36634643;
 //BA.debugLineNum = 36634643;BA.debugLine="End Sub";
return "";
}
public String  _br(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "br", true))
	 {return ((String) Debug.delegate(ba, "br", null));}
RDebugUtils.currentLine=40697856;
 //BA.debugLineNum = 40697856;BA.debugLine="Sub BR As String";
RDebugUtils.currentLine=40697857;
 //BA.debugLineNum = 40697857;BA.debugLine="Return \"<br>\"";
if (true) return "<br>";
RDebugUtils.currentLine=40697858;
 //BA.debugLineNum = 40697858;BA.debugLine="End Sub";
return "";
}
public String  _capitalize(b4j.example.bananovue __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "capitalize", true))
	 {return ((String) Debug.delegate(ba, "capitalize", new Object[] {_t}));}
String _s = "";
String _r = "";
String _o = "";
RDebugUtils.currentLine=38666240;
 //BA.debugLineNum = 38666240;BA.debugLine="Sub Capitalize(t As String) As String";
RDebugUtils.currentLine=38666241;
 //BA.debugLineNum = 38666241;BA.debugLine="Dim s , r , o As String";
_s = "";
_r = "";
_o = "";
RDebugUtils.currentLine=38666242;
 //BA.debugLineNum = 38666242;BA.debugLine="s = t.SubString2(0,1)";
_s = _t.substring((int) (0),(int) (1));
RDebugUtils.currentLine=38666243;
 //BA.debugLineNum = 38666243;BA.debugLine="r = t.SubString2(1, t.Length)";
_r = _t.substring((int) (1),_t.length());
RDebugUtils.currentLine=38666244;
 //BA.debugLineNum = 38666244;BA.debugLine="o = s.ToUpperCase & r";
_o = _s.toUpperCase()+_r;
RDebugUtils.currentLine=38666245;
 //BA.debugLineNum = 38666245;BA.debugLine="Return o";
if (true) return _o;
RDebugUtils.currentLine=38666246;
 //BA.debugLineNum = 38666246;BA.debugLine="End Sub";
return "";
}
public double  _cdbl(b4j.example.bananovue __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "cdbl", true))
	 {return ((Double) Debug.delegate(ba, "cdbl", new Object[] {_value}));}
double _out = 0;
RDebugUtils.currentLine=36044800;
 //BA.debugLineNum = 36044800;BA.debugLine="Public Sub CDbl(value As String) As Double";
RDebugUtils.currentLine=36044801;
 //BA.debugLineNum = 36044801;BA.debugLine="Try";
try {RDebugUtils.currentLine=36044802;
 //BA.debugLineNum = 36044802;BA.debugLine="value = value.Trim";
_value = _value.trim();
RDebugUtils.currentLine=36044803;
 //BA.debugLineNum = 36044803;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
RDebugUtils.currentLine=36044804;
 //BA.debugLineNum = 36044804;BA.debugLine="value = value.Replace(\",\",\"\")";
_value = _value.replace(",","");
RDebugUtils.currentLine=36044805;
 //BA.debugLineNum = 36044805;BA.debugLine="Dim out As Double = NumberFormat2(value,0,2,2,Fa";
_out = (double)(Double.parseDouble(__c.NumberFormat2((double)(Double.parseDouble(_value)),(int) (0),(int) (2),(int) (2),__c.False)));
RDebugUtils.currentLine=36044806;
 //BA.debugLineNum = 36044806;BA.debugLine="Return out";
if (true) return _out;
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=36044808;
 //BA.debugLineNum = 36044808;BA.debugLine="Return value";
if (true) return (double)(Double.parseDouble(_value));
 };
RDebugUtils.currentLine=36044810;
 //BA.debugLineNum = 36044810;BA.debugLine="End Sub";
return 0;
}
public int  _cint(b4j.example.bananovue __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "cint", true))
	 {return ((Integer) Debug.delegate(ba, "cint", new Object[] {_o}));}
RDebugUtils.currentLine=37421056;
 //BA.debugLineNum = 37421056;BA.debugLine="Sub CInt(o As Object) As Int";
RDebugUtils.currentLine=37421057;
 //BA.debugLineNum = 37421057;BA.debugLine="Return Floor(o)";
if (true) return (int) (__c.Floor((double)(BA.ObjectToNumber(_o))));
RDebugUtils.currentLine=37421058;
 //BA.debugLineNum = 37421058;BA.debugLine="End Sub";
return 0;
}
public String  _class_globals(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
RDebugUtils.currentLine=34603008;
 //BA.debugLineNum = 34603008;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=34603009;
 //BA.debugLineNum = 34603009;BA.debugLine="Type FileObject(FileName As String, FileDate As S";
;
RDebugUtils.currentLine=34603010;
 //BA.debugLineNum = 34603010;BA.debugLine="Public BOVue As BANanoObject";
_bovue = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603011;
 //BA.debugLineNum = 34603011;BA.debugLine="Private BANAno As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=34603012;
 //BA.debugLineNum = 34603012;BA.debugLine="Private methods As Map";
_methods = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34603013;
 //BA.debugLineNum = 34603013;BA.debugLine="Public data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34603014;
 //BA.debugLineNum = 34603014;BA.debugLine="Public refs As Map";
_refs = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34603015;
 //BA.debugLineNum = 34603015;BA.debugLine="Public body As BANanoElement";
_body = new com.ab.banano.BANanoElement();
RDebugUtils.currentLine=34603016;
 //BA.debugLineNum = 34603016;BA.debugLine="Public Template As VueHTML";
_template = new b4j.example.vuehtml();
RDebugUtils.currentLine=34603017;
 //BA.debugLineNum = 34603017;BA.debugLine="Private computed As Map";
_computed = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34603018;
 //BA.debugLineNum = 34603018;BA.debugLine="Private watches As Map";
_watches = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34603019;
 //BA.debugLineNum = 34603019;BA.debugLine="Private created As BANanoObject";
_created = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603020;
 //BA.debugLineNum = 34603020;BA.debugLine="Private mounted As BANanoObject";
_mounted = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603021;
 //BA.debugLineNum = 34603021;BA.debugLine="Private beforeCreate As BANanoObject";
_beforecreate = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603022;
 //BA.debugLineNum = 34603022;BA.debugLine="Private destroyed As BANanoObject";
_destroyed = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603023;
 //BA.debugLineNum = 34603023;BA.debugLine="Private beforeMount As BANanoObject";
_beforemount = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603024;
 //BA.debugLineNum = 34603024;BA.debugLine="Private updated As BANanoObject";
_updated = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603025;
 //BA.debugLineNum = 34603025;BA.debugLine="Private beforeDestroy As BANanoObject";
_beforedestroy = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603026;
 //BA.debugLineNum = 34603026;BA.debugLine="Private activated As BANanoObject";
_activated = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603027;
 //BA.debugLineNum = 34603027;BA.debugLine="Private deactivated As BANanoObject";
_deactivated = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603028;
 //BA.debugLineNum = 34603028;BA.debugLine="Private beforeUpdate As BANanoObject";
_beforeupdate = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603029;
 //BA.debugLineNum = 34603029;BA.debugLine="Private TypeOfString As BANanoObject   'ignore";
_typeofstring = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603030;
 //BA.debugLineNum = 34603030;BA.debugLine="Private TypeOfNumber As BANanoObject   'ignore";
_typeofnumber = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603031;
 //BA.debugLineNum = 34603031;BA.debugLine="Private TypeOfBoolean As BANanoObject  'ignore";
_typeofboolean = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603032;
 //BA.debugLineNum = 34603032;BA.debugLine="Private TypeOfArray As BANanoObject    'ignore";
_typeofarray = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603033;
 //BA.debugLineNum = 34603033;BA.debugLine="Private TypeOfObject As BANanoObject   'ignore";
_typeofobject = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603034;
 //BA.debugLineNum = 34603034;BA.debugLine="Private TypeOfDate As BANanoObject     'ignore";
_typeofdate = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603035;
 //BA.debugLineNum = 34603035;BA.debugLine="Private TypeOfFunction As BANanoObject  'ignore";
_typeoffunction = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603036;
 //BA.debugLineNum = 34603036;BA.debugLine="Private TypeOfSymbol As BANanoObject    'ignore";
_typeofsymbol = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603037;
 //BA.debugLineNum = 34603037;BA.debugLine="Private BORouter As BANanoObject      'ignore";
_borouter = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603038;
 //BA.debugLineNum = 34603038;BA.debugLine="Private routes As List";
_routes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34603039;
 //BA.debugLineNum = 34603039;BA.debugLine="Private components As Map";
_components = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34603040;
 //BA.debugLineNum = 34603040;BA.debugLine="Public Options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34603041;
 //BA.debugLineNum = 34603041;BA.debugLine="Private dynamicStyle As Map";
_dynamicstyle = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34603042;
 //BA.debugLineNum = 34603042;BA.debugLine="Public JQuery As BANanoObject";
_jquery = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34603043;
 //BA.debugLineNum = 34603043;BA.debugLine="Public GetTemplate As String";
_gettemplate = "";
RDebugUtils.currentLine=34603044;
 //BA.debugLineNum = 34603044;BA.debugLine="Public const colors_red As String = \"#F44336\"";
_colors_red = "#F44336";
RDebugUtils.currentLine=34603045;
 //BA.debugLineNum = 34603045;BA.debugLine="Public const colors_pink As String = \"#E91E63\"";
_colors_pink = "#E91E63";
RDebugUtils.currentLine=34603046;
 //BA.debugLineNum = 34603046;BA.debugLine="Public const colors_purple As String = \"#9C27B0\"";
_colors_purple = "#9C27B0";
RDebugUtils.currentLine=34603047;
 //BA.debugLineNum = 34603047;BA.debugLine="Public const colors_deepPurple As String = \"#673A";
_colors_deeppurple = "#673AB7";
RDebugUtils.currentLine=34603048;
 //BA.debugLineNum = 34603048;BA.debugLine="Public const colors_indigo As String = \"#3F51B5\"";
_colors_indigo = "#3F51B5";
RDebugUtils.currentLine=34603049;
 //BA.debugLineNum = 34603049;BA.debugLine="Public const colors_blue As String = \"#2196F3\"";
_colors_blue = "#2196F3";
RDebugUtils.currentLine=34603050;
 //BA.debugLineNum = 34603050;BA.debugLine="Public const colors_lightBlue As String = \"#03A9F";
_colors_lightblue = "#03A9F4";
RDebugUtils.currentLine=34603051;
 //BA.debugLineNum = 34603051;BA.debugLine="Public const colors_cyan As String = \"#00BCD4\"";
_colors_cyan = "#00BCD4";
RDebugUtils.currentLine=34603052;
 //BA.debugLineNum = 34603052;BA.debugLine="Public const colors_teal As String = \"#009688\"";
_colors_teal = "#009688";
RDebugUtils.currentLine=34603053;
 //BA.debugLineNum = 34603053;BA.debugLine="Public const colors_green As String = \"#4CAF50\"";
_colors_green = "#4CAF50";
RDebugUtils.currentLine=34603054;
 //BA.debugLineNum = 34603054;BA.debugLine="Public const colors_lightGreen As String = \"#8BC3";
_colors_lightgreen = "#8BC34A";
RDebugUtils.currentLine=34603055;
 //BA.debugLineNum = 34603055;BA.debugLine="Public const colors_lime As String = \"#CDDC39\"";
_colors_lime = "#CDDC39";
RDebugUtils.currentLine=34603056;
 //BA.debugLineNum = 34603056;BA.debugLine="Public const colors_yellow As String = \"#ffe821\"";
_colors_yellow = "#ffe821";
RDebugUtils.currentLine=34603057;
 //BA.debugLineNum = 34603057;BA.debugLine="Public const colors_amber As String = \"#FFC107\"";
_colors_amber = "#FFC107";
RDebugUtils.currentLine=34603058;
 //BA.debugLineNum = 34603058;BA.debugLine="Public const colors_orange As String = \"#FF9800\"";
_colors_orange = "#FF9800";
RDebugUtils.currentLine=34603059;
 //BA.debugLineNum = 34603059;BA.debugLine="Public const colors_deepOrange As String = \"#FF57";
_colors_deeporange = "#FF5722";
RDebugUtils.currentLine=34603060;
 //BA.debugLineNum = 34603060;BA.debugLine="Public const colors_brown As String = \"#795548\"";
_colors_brown = "#795548";
RDebugUtils.currentLine=34603061;
 //BA.debugLineNum = 34603061;BA.debugLine="Public const colors_grey As String = \"#9E9E9E\"";
_colors_grey = "#9E9E9E";
RDebugUtils.currentLine=34603062;
 //BA.debugLineNum = 34603062;BA.debugLine="Public const colors_blueGrey As String = \"#607D8B";
_colors_bluegrey = "#607D8B";
RDebugUtils.currentLine=34603063;
 //BA.debugLineNum = 34603063;BA.debugLine="Public const colors_black As String = \"#000000\"";
_colors_black = "#000000";
RDebugUtils.currentLine=34603064;
 //BA.debugLineNum = 34603064;BA.debugLine="Public const colors_white As String = \"#ffffff\"";
_colors_white = "#ffffff";
RDebugUtils.currentLine=34603065;
 //BA.debugLineNum = 34603065;BA.debugLine="Public const colors_transparent As String = \"tran";
_colors_transparent = "transparent";
RDebugUtils.currentLine=34603067;
 //BA.debugLineNum = 34603067;BA.debugLine="Public const BORDER_DEFAULT As String = \"\"";
_border_default = "";
RDebugUtils.currentLine=34603068;
 //BA.debugLineNum = 34603068;BA.debugLine="Public const BORDER_DASHED As String = \"dashed\"";
_border_dashed = "dashed";
RDebugUtils.currentLine=34603069;
 //BA.debugLineNum = 34603069;BA.debugLine="Public const BORDER_DOTTED As String = \"dotted\"";
_border_dotted = "dotted";
RDebugUtils.currentLine=34603070;
 //BA.debugLineNum = 34603070;BA.debugLine="Public const BORDER_DOUBLE As String = \"double\"";
_border_double = "double";
RDebugUtils.currentLine=34603071;
 //BA.debugLineNum = 34603071;BA.debugLine="Public const BORDER_GROOVE As String = \"groove\"";
_border_groove = "groove";
RDebugUtils.currentLine=34603072;
 //BA.debugLineNum = 34603072;BA.debugLine="Public const BORDER_HIDDEN As String = \"hidden\"";
_border_hidden = "hidden";
RDebugUtils.currentLine=34603073;
 //BA.debugLineNum = 34603073;BA.debugLine="Public const BORDER_INSET As String = \"inset\"";
_border_inset = "inset";
RDebugUtils.currentLine=34603074;
 //BA.debugLineNum = 34603074;BA.debugLine="Public const BORDER_NONE As String = \"none\"";
_border_none = "none";
RDebugUtils.currentLine=34603075;
 //BA.debugLineNum = 34603075;BA.debugLine="Public const BORDER_OUTSET As String = \"outset\"";
_border_outset = "outset";
RDebugUtils.currentLine=34603076;
 //BA.debugLineNum = 34603076;BA.debugLine="Public const BORDER_RIDGE As String = \"ridge\"";
_border_ridge = "ridge";
RDebugUtils.currentLine=34603077;
 //BA.debugLineNum = 34603077;BA.debugLine="Public const BORDER_SOLID As String = \"solid\"";
_border_solid = "solid";
RDebugUtils.currentLine=34603079;
 //BA.debugLineNum = 34603079;BA.debugLine="Public const COLOR_AMBER As String = \"amber\"";
_color_amber = "amber";
RDebugUtils.currentLine=34603080;
 //BA.debugLineNum = 34603080;BA.debugLine="Public const COLOR_BLACK As String = \"black\"";
_color_black = "black";
RDebugUtils.currentLine=34603081;
 //BA.debugLineNum = 34603081;BA.debugLine="Public const COLOR_BLUE As String = \"blue\"";
_color_blue = "blue";
RDebugUtils.currentLine=34603082;
 //BA.debugLineNum = 34603082;BA.debugLine="Public const COLOR_BLUEGREY As String = \"blue-gre";
_color_bluegrey = "blue-grey";
RDebugUtils.currentLine=34603083;
 //BA.debugLineNum = 34603083;BA.debugLine="Public const COLOR_BROWN As String = \"brown\"";
_color_brown = "brown";
RDebugUtils.currentLine=34603084;
 //BA.debugLineNum = 34603084;BA.debugLine="Public const COLOR_CYAN As String = \"cyan\"";
_color_cyan = "cyan";
RDebugUtils.currentLine=34603085;
 //BA.debugLineNum = 34603085;BA.debugLine="Public const COLOR_DEEPORANGE As String = \"deep-o";
_color_deeporange = "deep-orange";
RDebugUtils.currentLine=34603086;
 //BA.debugLineNum = 34603086;BA.debugLine="Public const COLOR_DEEPPURPLE As String = \"deep-p";
_color_deeppurple = "deep-purple";
RDebugUtils.currentLine=34603087;
 //BA.debugLineNum = 34603087;BA.debugLine="Public const COLOR_GREEN As String = \"green\"";
_color_green = "green";
RDebugUtils.currentLine=34603088;
 //BA.debugLineNum = 34603088;BA.debugLine="Public const COLOR_GREY As String = \"grey\"";
_color_grey = "grey";
RDebugUtils.currentLine=34603089;
 //BA.debugLineNum = 34603089;BA.debugLine="Public const COLOR_INDIGO As String = \"indigo\"";
_color_indigo = "indigo";
RDebugUtils.currentLine=34603090;
 //BA.debugLineNum = 34603090;BA.debugLine="Public const COLOR_LIGHTBLUE As String = \"light-b";
_color_lightblue = "light-blue";
RDebugUtils.currentLine=34603091;
 //BA.debugLineNum = 34603091;BA.debugLine="Public const COLOR_LIGHTGREEN As String = \"light-";
_color_lightgreen = "light-green";
RDebugUtils.currentLine=34603092;
 //BA.debugLineNum = 34603092;BA.debugLine="Public const COLOR_LIME As String = \"lime\"";
_color_lime = "lime";
RDebugUtils.currentLine=34603093;
 //BA.debugLineNum = 34603093;BA.debugLine="Public const COLOR_ORANGE As String = \"orange\"";
_color_orange = "orange";
RDebugUtils.currentLine=34603094;
 //BA.debugLineNum = 34603094;BA.debugLine="Public const COLOR_PINK As String = \"pink\"";
_color_pink = "pink";
RDebugUtils.currentLine=34603095;
 //BA.debugLineNum = 34603095;BA.debugLine="Public const COLOR_PURPLE As String = \"purple\"";
_color_purple = "purple";
RDebugUtils.currentLine=34603096;
 //BA.debugLineNum = 34603096;BA.debugLine="Public const COLOR_RED As String = \"red\"";
_color_red = "red";
RDebugUtils.currentLine=34603097;
 //BA.debugLineNum = 34603097;BA.debugLine="Public const COLOR_TEAL As String = \"teal\"";
_color_teal = "teal";
RDebugUtils.currentLine=34603098;
 //BA.debugLineNum = 34603098;BA.debugLine="Public const COLOR_TRANSPARENT As String = \"trans";
_color_transparent = "transparent";
RDebugUtils.currentLine=34603099;
 //BA.debugLineNum = 34603099;BA.debugLine="Public const COLOR_WHITE As String = \"white\"";
_color_white = "white";
RDebugUtils.currentLine=34603100;
 //BA.debugLineNum = 34603100;BA.debugLine="Public const COLOR_YELLOW As String = \"yellow\"";
_color_yellow = "yellow";
RDebugUtils.currentLine=34603102;
 //BA.debugLineNum = 34603102;BA.debugLine="Public const INTENSITY_NORMAL As String = \"\"";
_intensity_normal = "";
RDebugUtils.currentLine=34603103;
 //BA.debugLineNum = 34603103;BA.debugLine="Public const INTENSITY_LIGHTEN5 As String = \"ligh";
_intensity_lighten5 = "lighten-5";
RDebugUtils.currentLine=34603104;
 //BA.debugLineNum = 34603104;BA.debugLine="Public const INTENSITY_LIGHTEN4 As String = \"ligh";
_intensity_lighten4 = "lighten-4";
RDebugUtils.currentLine=34603105;
 //BA.debugLineNum = 34603105;BA.debugLine="Public const INTENSITY_LIGHTEN3 As String = \"ligh";
_intensity_lighten3 = "lighten-3";
RDebugUtils.currentLine=34603106;
 //BA.debugLineNum = 34603106;BA.debugLine="Public const INTENSITY_LIGHTEN2 As String = \"ligh";
_intensity_lighten2 = "lighten-2";
RDebugUtils.currentLine=34603107;
 //BA.debugLineNum = 34603107;BA.debugLine="Public const INTENSITY_LIGHTEN1 As String = \"ligh";
_intensity_lighten1 = "lighten-1";
RDebugUtils.currentLine=34603108;
 //BA.debugLineNum = 34603108;BA.debugLine="Public const INTENSITY_DARKEN1 As String = \"darke";
_intensity_darken1 = "darken-1";
RDebugUtils.currentLine=34603109;
 //BA.debugLineNum = 34603109;BA.debugLine="Public const INTENSITY_DARKEN2 As String = \"darke";
_intensity_darken2 = "darken-2";
RDebugUtils.currentLine=34603110;
 //BA.debugLineNum = 34603110;BA.debugLine="Public const INTENSITY_DARKEN3 As String = \"darke";
_intensity_darken3 = "darken-3";
RDebugUtils.currentLine=34603111;
 //BA.debugLineNum = 34603111;BA.debugLine="Public const INTENSITY_DARKEN4 As String = \"darke";
_intensity_darken4 = "darken-4";
RDebugUtils.currentLine=34603112;
 //BA.debugLineNum = 34603112;BA.debugLine="Public const INTENSITY_ACCENT1 As String = \"accen";
_intensity_accent1 = "accent-1";
RDebugUtils.currentLine=34603113;
 //BA.debugLineNum = 34603113;BA.debugLine="Public const INTENSITY_ACCENT2 As String = \"accen";
_intensity_accent2 = "accent-2";
RDebugUtils.currentLine=34603114;
 //BA.debugLineNum = 34603114;BA.debugLine="Public const INTENSITY_ACCENT3 As String = \"accen";
_intensity_accent3 = "accent-3";
RDebugUtils.currentLine=34603115;
 //BA.debugLineNum = 34603115;BA.debugLine="Public const INTENSITY_ACCENT4 As String = \"accen";
_intensity_accent4 = "accent-4";
RDebugUtils.currentLine=34603117;
 //BA.debugLineNum = 34603117;BA.debugLine="Type ColorTypes(red As String, pink As String, pu";
;
RDebugUtils.currentLine=34603121;
 //BA.debugLineNum = 34603121;BA.debugLine="Public Colors As ColorTypes";
_colors = new b4j.example.bananovue._colortypes();
RDebugUtils.currentLine=34603123;
 //BA.debugLineNum = 34603123;BA.debugLine="Private ColorMap As Map";
_colormap = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=34603125;
 //BA.debugLineNum = 34603125;BA.debugLine="Public Attention_Seekers_bounce As String = \"boun";
_attention_seekers_bounce = "bounce";
RDebugUtils.currentLine=34603126;
 //BA.debugLineNum = 34603126;BA.debugLine="Public Attention_Seekers_flash As String = \"flash";
_attention_seekers_flash = "flash";
RDebugUtils.currentLine=34603127;
 //BA.debugLineNum = 34603127;BA.debugLine="Public Attention_Seekers_pulse As String=\"pulse\"";
_attention_seekers_pulse = "pulse";
RDebugUtils.currentLine=34603128;
 //BA.debugLineNum = 34603128;BA.debugLine="Public Attention_Seekers_rubberBand As String=\"ru";
_attention_seekers_rubberband = "rubberBand";
RDebugUtils.currentLine=34603129;
 //BA.debugLineNum = 34603129;BA.debugLine="Public Attention_Seekers_shake As String=\"shake\"";
_attention_seekers_shake = "shake";
RDebugUtils.currentLine=34603130;
 //BA.debugLineNum = 34603130;BA.debugLine="Public Attention_Seekers_swing As String=\"swing\"";
_attention_seekers_swing = "swing";
RDebugUtils.currentLine=34603131;
 //BA.debugLineNum = 34603131;BA.debugLine="Public Attention_Seekers_tada As String=\"tada\"";
_attention_seekers_tada = "tada";
RDebugUtils.currentLine=34603132;
 //BA.debugLineNum = 34603132;BA.debugLine="Public Attention_Seekers_wobble As String=\"wobble";
_attention_seekers_wobble = "wobble";
RDebugUtils.currentLine=34603133;
 //BA.debugLineNum = 34603133;BA.debugLine="Public Attention_Seekers_jello As String=\"jello\"";
_attention_seekers_jello = "jello";
RDebugUtils.currentLine=34603134;
 //BA.debugLineNum = 34603134;BA.debugLine="Public Bouncing_Entrances_bounceIn As String=\"bou";
_bouncing_entrances_bouncein = "bounceIn";
RDebugUtils.currentLine=34603135;
 //BA.debugLineNum = 34603135;BA.debugLine="Public Bouncing_Entrances_bounceInDown As String=";
_bouncing_entrances_bounceindown = "bounceInDown";
RDebugUtils.currentLine=34603136;
 //BA.debugLineNum = 34603136;BA.debugLine="Public Bouncing_Entrances_bounceInLeft As String=";
_bouncing_entrances_bounceinleft = "bounceInLeft";
RDebugUtils.currentLine=34603137;
 //BA.debugLineNum = 34603137;BA.debugLine="Public Bouncing_Entrances_bounceInRight As String";
_bouncing_entrances_bounceinright = "bounceInRight";
RDebugUtils.currentLine=34603138;
 //BA.debugLineNum = 34603138;BA.debugLine="Public Bouncing_EntrancesbounceInUp As String=\"bo";
_bouncing_entrancesbounceinup = "bounceInUp";
RDebugUtils.currentLine=34603139;
 //BA.debugLineNum = 34603139;BA.debugLine="Public Bouncing_Exits_bounceOut As String=\"bounce";
_bouncing_exits_bounceout = "bounceOut";
RDebugUtils.currentLine=34603140;
 //BA.debugLineNum = 34603140;BA.debugLine="Public Bouncing_Exits_bounceOutDown As String=\"bo";
_bouncing_exits_bounceoutdown = "bounceOutDown";
RDebugUtils.currentLine=34603141;
 //BA.debugLineNum = 34603141;BA.debugLine="Public Bouncing_Exits_bounceOutLeft As String=\"bo";
_bouncing_exits_bounceoutleft = "bounceOutLeft";
RDebugUtils.currentLine=34603142;
 //BA.debugLineNum = 34603142;BA.debugLine="Public Bouncing_Exits_bounceOutRight As String=\"b";
_bouncing_exits_bounceoutright = "bounceOutRight";
RDebugUtils.currentLine=34603143;
 //BA.debugLineNum = 34603143;BA.debugLine="Public Bouncing_Exits_bounceOutUp As String=\"boun";
_bouncing_exits_bounceoutup = "bounceOutUp";
RDebugUtils.currentLine=34603144;
 //BA.debugLineNum = 34603144;BA.debugLine="Public Fading_Entrances_fadeIn As String=\"fadeIn\"";
_fading_entrances_fadein = "fadeIn";
RDebugUtils.currentLine=34603145;
 //BA.debugLineNum = 34603145;BA.debugLine="Public Fading_Entrances_fadeInDown As String=\"fad";
_fading_entrances_fadeindown = "fadeInDown";
RDebugUtils.currentLine=34603146;
 //BA.debugLineNum = 34603146;BA.debugLine="Public Fading_Entrances_fadeInDownBig As String=\"";
_fading_entrances_fadeindownbig = "fadeInDownBig";
RDebugUtils.currentLine=34603147;
 //BA.debugLineNum = 34603147;BA.debugLine="Public Fading_Entrances_fadeInLeft As String=\"fad";
_fading_entrances_fadeinleft = "fadeInLeft";
RDebugUtils.currentLine=34603148;
 //BA.debugLineNum = 34603148;BA.debugLine="Public Fading_Entrances_fadeInLeftBig As String=\"";
_fading_entrances_fadeinleftbig = "fadeInLeftBig";
RDebugUtils.currentLine=34603149;
 //BA.debugLineNum = 34603149;BA.debugLine="Public Fading_Entrances_fadeInRight As String=\"fa";
_fading_entrances_fadeinright = "fadeInRight";
RDebugUtils.currentLine=34603150;
 //BA.debugLineNum = 34603150;BA.debugLine="Public Fading_Entrances_fadeInRightBig As String=";
_fading_entrances_fadeinrightbig = "fadeInRightBig";
RDebugUtils.currentLine=34603151;
 //BA.debugLineNum = 34603151;BA.debugLine="Public Fading_Entrances_fadeInUp As String=\"fadeI";
_fading_entrances_fadeinup = "fadeInUp";
RDebugUtils.currentLine=34603152;
 //BA.debugLineNum = 34603152;BA.debugLine="Public Fading_Entrances_fadeInUpBig As String=\"fa";
_fading_entrances_fadeinupbig = "fadeInUpBig";
RDebugUtils.currentLine=34603153;
 //BA.debugLineNum = 34603153;BA.debugLine="Public Fading_Exits_fadeOut As String=\"fadeOut\"";
_fading_exits_fadeout = "fadeOut";
RDebugUtils.currentLine=34603154;
 //BA.debugLineNum = 34603154;BA.debugLine="Public Fading_Exits_fadeOutDown As String=\"fadeOu";
_fading_exits_fadeoutdown = "fadeOutDown";
RDebugUtils.currentLine=34603155;
 //BA.debugLineNum = 34603155;BA.debugLine="Public Fading_Exits_fadeOutDownBig As String=\"fad";
_fading_exits_fadeoutdownbig = "fadeOutDownBig";
RDebugUtils.currentLine=34603156;
 //BA.debugLineNum = 34603156;BA.debugLine="Public Fading_Exits_fadeOutLeft As String=\"fadeOu";
_fading_exits_fadeoutleft = "fadeOutLeft";
RDebugUtils.currentLine=34603157;
 //BA.debugLineNum = 34603157;BA.debugLine="Public Fading_Exits_fadeOutLeftBig As String=\"fad";
_fading_exits_fadeoutleftbig = "fadeOutLeftBig";
RDebugUtils.currentLine=34603158;
 //BA.debugLineNum = 34603158;BA.debugLine="Public Fading_Exits_fadeOutRight As String=\"fadeO";
_fading_exits_fadeoutright = "fadeOutRight";
RDebugUtils.currentLine=34603159;
 //BA.debugLineNum = 34603159;BA.debugLine="Public Fading_Exits_fadeOutRightBig As String=\"fa";
_fading_exits_fadeoutrightbig = "fadeOutRightBig";
RDebugUtils.currentLine=34603160;
 //BA.debugLineNum = 34603160;BA.debugLine="Public Fading_Exits_fadeOutUp As String=\"fadeOutU";
_fading_exits_fadeoutup = "fadeOutUp";
RDebugUtils.currentLine=34603161;
 //BA.debugLineNum = 34603161;BA.debugLine="Public Fading_Exits_fadeOutUpBig As String=\"fadeO";
_fading_exits_fadeoutupbig = "fadeOutUpBig";
RDebugUtils.currentLine=34603162;
 //BA.debugLineNum = 34603162;BA.debugLine="Public Flippers_flip As String=\"flip\"";
_flippers_flip = "flip";
RDebugUtils.currentLine=34603163;
 //BA.debugLineNum = 34603163;BA.debugLine="Public Flippers_flipInX As String=\"flipInX\"";
_flippers_flipinx = "flipInX";
RDebugUtils.currentLine=34603164;
 //BA.debugLineNum = 34603164;BA.debugLine="Public Flippers_flipInY As String=\"flipInY\"";
_flippers_flipiny = "flipInY";
RDebugUtils.currentLine=34603165;
 //BA.debugLineNum = 34603165;BA.debugLine="Public Flippers_flipOutX As String=\"flipOutX\"";
_flippers_flipoutx = "flipOutX";
RDebugUtils.currentLine=34603166;
 //BA.debugLineNum = 34603166;BA.debugLine="Public Flippers_flipOutY As String=\"flipOutY\"";
_flippers_flipouty = "flipOutY";
RDebugUtils.currentLine=34603167;
 //BA.debugLineNum = 34603167;BA.debugLine="Public Lightspeed_lightSpeedIn As String=\"lightSp";
_lightspeed_lightspeedin = "lightSpeedIn";
RDebugUtils.currentLine=34603168;
 //BA.debugLineNum = 34603168;BA.debugLine="Public Lightspeed_lightSpeedOut As String=\"lightS";
_lightspeed_lightspeedout = "lightSpeedOut";
RDebugUtils.currentLine=34603169;
 //BA.debugLineNum = 34603169;BA.debugLine="Public Rotating_Entrances_rotateIn As String=\"rot";
_rotating_entrances_rotatein = "rotateIn";
RDebugUtils.currentLine=34603170;
 //BA.debugLineNum = 34603170;BA.debugLine="Public Rotating_Entrances_rotateInDownLeft As Str";
_rotating_entrances_rotateindownleft = "rotateInDownLeft";
RDebugUtils.currentLine=34603171;
 //BA.debugLineNum = 34603171;BA.debugLine="Public Rotating_Entrances_rotateInDownRight As St";
_rotating_entrances_rotateindownright = "rotateInDownRight";
RDebugUtils.currentLine=34603172;
 //BA.debugLineNum = 34603172;BA.debugLine="Public Rotating_Entrances_rotateInUpLeft As Strin";
_rotating_entrances_rotateinupleft = "rotateInUpLeft";
RDebugUtils.currentLine=34603173;
 //BA.debugLineNum = 34603173;BA.debugLine="Public Rotating_Entrances_rotateInUpRight As Stri";
_rotating_entrances_rotateinupright = "rotateInUpRight";
RDebugUtils.currentLine=34603174;
 //BA.debugLineNum = 34603174;BA.debugLine="Public Rotating_Exits_rotateOut As String=\"rotate";
_rotating_exits_rotateout = "rotateOut";
RDebugUtils.currentLine=34603175;
 //BA.debugLineNum = 34603175;BA.debugLine="Public Rotating_Exits_rotateOutDownLeft As String";
_rotating_exits_rotateoutdownleft = "rotateOutDownLeft";
RDebugUtils.currentLine=34603176;
 //BA.debugLineNum = 34603176;BA.debugLine="Public Rotating_Exits_rotateOutDownRight As Strin";
_rotating_exits_rotateoutdownright = "rotateOutDownRight";
RDebugUtils.currentLine=34603177;
 //BA.debugLineNum = 34603177;BA.debugLine="Public Rotating_Exits_rotateOutUpLeft As String=\"";
_rotating_exits_rotateoutupleft = "rotateOutUpLeft";
RDebugUtils.currentLine=34603178;
 //BA.debugLineNum = 34603178;BA.debugLine="Public Rotating_Exits_rotateOutUpRight As String=";
_rotating_exits_rotateoutupright = "rotateOutUpRight";
RDebugUtils.currentLine=34603179;
 //BA.debugLineNum = 34603179;BA.debugLine="Public Sliding_Entrances_slideInUp As String=\"sli";
_sliding_entrances_slideinup = "slideInUp";
RDebugUtils.currentLine=34603180;
 //BA.debugLineNum = 34603180;BA.debugLine="Public Sliding_Entrances_slideInDown As String=\"s";
_sliding_entrances_slideindown = "slideInDown";
RDebugUtils.currentLine=34603181;
 //BA.debugLineNum = 34603181;BA.debugLine="Public Sliding_Entrances_slideInLeft As String=\"s";
_sliding_entrances_slideinleft = "slideInLeft";
RDebugUtils.currentLine=34603182;
 //BA.debugLineNum = 34603182;BA.debugLine="Public Sliding_Entrances_slideInRight As String=\"";
_sliding_entrances_slideinright = "slideInRight";
RDebugUtils.currentLine=34603183;
 //BA.debugLineNum = 34603183;BA.debugLine="Public Sliding_Exits_slideOutUp As String=\"slideO";
_sliding_exits_slideoutup = "slideOutUp";
RDebugUtils.currentLine=34603184;
 //BA.debugLineNum = 34603184;BA.debugLine="Public Sliding_Exits_slideOutDown As String=\"slid";
_sliding_exits_slideoutdown = "slideOutDown";
RDebugUtils.currentLine=34603185;
 //BA.debugLineNum = 34603185;BA.debugLine="Public Sliding_Exits_slideOutLeft As String=\"slid";
_sliding_exits_slideoutleft = "slideOutLeft";
RDebugUtils.currentLine=34603186;
 //BA.debugLineNum = 34603186;BA.debugLine="Public Sliding_Exits_slideOutRight As String=\"sli";
_sliding_exits_slideoutright = "slideOutRight";
RDebugUtils.currentLine=34603187;
 //BA.debugLineNum = 34603187;BA.debugLine="Public Zoom_Entrances_zoomIn As String=\"zoomIn\"";
_zoom_entrances_zoomin = "zoomIn";
RDebugUtils.currentLine=34603188;
 //BA.debugLineNum = 34603188;BA.debugLine="Public Zoom_Entrances_zoomInDown As String=\"zoomI";
_zoom_entrances_zoomindown = "zoomInDown";
RDebugUtils.currentLine=34603189;
 //BA.debugLineNum = 34603189;BA.debugLine="Public Zoom_Entrances_zoomInLeft As String=\"zoomI";
_zoom_entrances_zoominleft = "zoomInLeft";
RDebugUtils.currentLine=34603190;
 //BA.debugLineNum = 34603190;BA.debugLine="Public Zoom_Entrances_zoomInRight As String=\"zoom";
_zoom_entrances_zoominright = "zoomInRight";
RDebugUtils.currentLine=34603191;
 //BA.debugLineNum = 34603191;BA.debugLine="Public Zoom_Entrances_zoomInUp As String=\"zoomInU";
_zoom_entrances_zoominup = "zoomInUp";
RDebugUtils.currentLine=34603192;
 //BA.debugLineNum = 34603192;BA.debugLine="Public Zoom_Exits_zoomOut As String=\"zoomOut\"";
_zoom_exits_zoomout = "zoomOut";
RDebugUtils.currentLine=34603193;
 //BA.debugLineNum = 34603193;BA.debugLine="Public Zoom_Exits_zoomOutDown As String=\"zoomOutD";
_zoom_exits_zoomoutdown = "zoomOutDown";
RDebugUtils.currentLine=34603194;
 //BA.debugLineNum = 34603194;BA.debugLine="Public Zoom_Exits_zoomOutLeft As String=\"zoomOutL";
_zoom_exits_zoomoutleft = "zoomOutLeft";
RDebugUtils.currentLine=34603195;
 //BA.debugLineNum = 34603195;BA.debugLine="Public Zoom_Exits_zoomOutRight As String=\"zoomOut";
_zoom_exits_zoomoutright = "zoomOutRight";
RDebugUtils.currentLine=34603196;
 //BA.debugLineNum = 34603196;BA.debugLine="Public Zoom_Exits_zoomOutUp As String=\"zoomOutUp\"";
_zoom_exits_zoomoutup = "zoomOutUp";
RDebugUtils.currentLine=34603197;
 //BA.debugLineNum = 34603197;BA.debugLine="Public Specials_hinge As String=\"hinge\"";
_specials_hinge = "hinge";
RDebugUtils.currentLine=34603198;
 //BA.debugLineNum = 34603198;BA.debugLine="Public Specials_rollIn As String=\"rollIn\"";
_specials_rollin = "rollIn";
RDebugUtils.currentLine=34603199;
 //BA.debugLineNum = 34603199;BA.debugLine="Public Specials_rollOut As String=\"rollOut\"";
_specials_rollout = "rollOut";
RDebugUtils.currentLine=34603200;
 //BA.debugLineNum = 34603200;BA.debugLine="End Sub";
return "";
}
public long  _clng(b4j.example.bananovue __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "clng", true))
	 {return ((Long) Debug.delegate(ba, "clng", new Object[] {_o}));}
RDebugUtils.currentLine=37355520;
 //BA.debugLineNum = 37355520;BA.debugLine="Sub CLng(o As Object) As Long";
RDebugUtils.currentLine=37355521;
 //BA.debugLineNum = 37355521;BA.debugLine="Return Floor(o)";
if (true) return (long) (__c.Floor((double)(BA.ObjectToNumber(_o))));
RDebugUtils.currentLine=37355522;
 //BA.debugLineNum = 37355522;BA.debugLine="End Sub";
return 0L;
}
public b4j.example.vmelement  _createbutton1(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createbutton1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createbutton1", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=41156608;
 //BA.debugLineNum = 41156608;BA.debugLine="Sub CreateBUTTON1(id As String) As VMElement";
RDebugUtils.currentLine=41156609;
 //BA.debugLineNum = 41156609;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=41156610;
 //BA.debugLineNum = 41156610;BA.debugLine="el.Initialize(Me, id).SetTag(\"button\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"button");
RDebugUtils.currentLine=41156611;
 //BA.debugLineNum = 41156611;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=41156612;
 //BA.debugLineNum = 41156612;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createcomponent(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createcomponent", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createcomponent", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46923776;
 //BA.debugLineNum = 46923776;BA.debugLine="Sub CreateComponent(id As String) As VMElement";
RDebugUtils.currentLine=46923777;
 //BA.debugLineNum = 46923777;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46923778;
 //BA.debugLineNum = 46923778;BA.debugLine="el.Initialize(Me, id).SetTag(\"component\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"component");
RDebugUtils.currentLine=46923779;
 //BA.debugLineNum = 46923779;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46923780;
 //BA.debugLineNum = 46923780;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcss  _createcss(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createcss", true))
	 {return ((b4j.example.vmcss) Debug.delegate(ba, "createcss", null));}
b4j.example.vmcss _el = null;
RDebugUtils.currentLine=46792704;
 //BA.debugLineNum = 46792704;BA.debugLine="Sub CreateCSS As VMCSS";
RDebugUtils.currentLine=46792705;
 //BA.debugLineNum = 46792705;BA.debugLine="Dim el As VMCSS";
_el = new b4j.example.vmcss();
RDebugUtils.currentLine=46792706;
 //BA.debugLineNum = 46792706;BA.debugLine="el.Initialize";
_el._initialize /*String*/ (null,ba);
RDebugUtils.currentLine=46792707;
 //BA.debugLineNum = 46792707;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46792708;
 //BA.debugLineNum = 46792708;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _creatediv(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "creatediv", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "creatediv", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46399488;
 //BA.debugLineNum = 46399488;BA.debugLine="Sub CreateDiv(id As String) As VMElement";
RDebugUtils.currentLine=46399489;
 //BA.debugLineNum = 46399489;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46399490;
 //BA.debugLineNum = 46399490;BA.debugLine="el.Initialize(Me,id).SetTag(\"div\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=46399491;
 //BA.debugLineNum = 46399491;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46399492;
 //BA.debugLineNum = 46399492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createform(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createform", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createform", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=40894464;
 //BA.debugLineNum = 40894464;BA.debugLine="Sub CreateFORM(id As String) As VMElement";
RDebugUtils.currentLine=40894465;
 //BA.debugLineNum = 40894465;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=40894466;
 //BA.debugLineNum = 40894466;BA.debugLine="el.Initialize(Me, id).SetTag(\"form\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"form");
RDebugUtils.currentLine=40894467;
 //BA.debugLineNum = 40894467;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=40894468;
 //BA.debugLineNum = 40894468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh1(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createh1", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh1", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=47054848;
 //BA.debugLineNum = 47054848;BA.debugLine="Sub CreateH1(id As String) As VMElement";
RDebugUtils.currentLine=47054849;
 //BA.debugLineNum = 47054849;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=47054850;
 //BA.debugLineNum = 47054850;BA.debugLine="el.Initialize(Me, id).SetTag(\"h1\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"h1");
RDebugUtils.currentLine=47054851;
 //BA.debugLineNum = 47054851;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=47054852;
 //BA.debugLineNum = 47054852;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh2(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createh2", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh2", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=47120384;
 //BA.debugLineNum = 47120384;BA.debugLine="Sub CreateH2(id As String) As VMElement";
RDebugUtils.currentLine=47120385;
 //BA.debugLineNum = 47120385;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=47120386;
 //BA.debugLineNum = 47120386;BA.debugLine="el.Initialize(Me, id).SetTag(\"h2\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"h2");
RDebugUtils.currentLine=47120387;
 //BA.debugLineNum = 47120387;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=47120388;
 //BA.debugLineNum = 47120388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh3(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createh3", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh3", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=47185920;
 //BA.debugLineNum = 47185920;BA.debugLine="Sub CreateH3(id As String) As VMElement";
RDebugUtils.currentLine=47185921;
 //BA.debugLineNum = 47185921;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=47185922;
 //BA.debugLineNum = 47185922;BA.debugLine="el.Initialize(Me, id).SetTag(\"h3\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"h3");
RDebugUtils.currentLine=47185923;
 //BA.debugLineNum = 47185923;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=47185924;
 //BA.debugLineNum = 47185924;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh4(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createh4", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh4", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=47251456;
 //BA.debugLineNum = 47251456;BA.debugLine="Sub CreateH4(id As String) As VMElement";
RDebugUtils.currentLine=47251457;
 //BA.debugLineNum = 47251457;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=47251458;
 //BA.debugLineNum = 47251458;BA.debugLine="el.Initialize(Me, id).SetTag(\"h4\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"h4");
RDebugUtils.currentLine=47251459;
 //BA.debugLineNum = 47251459;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=47251460;
 //BA.debugLineNum = 47251460;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh5(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createh5", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh5", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=47316992;
 //BA.debugLineNum = 47316992;BA.debugLine="Sub CreateH5(id As String) As VMElement";
RDebugUtils.currentLine=47316993;
 //BA.debugLineNum = 47316993;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=47316994;
 //BA.debugLineNum = 47316994;BA.debugLine="el.Initialize(Me, id).SetTag(\"h5\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"h5");
RDebugUtils.currentLine=47316995;
 //BA.debugLineNum = 47316995;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=47316996;
 //BA.debugLineNum = 47316996;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createh6(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createh6", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createh6", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=47382528;
 //BA.debugLineNum = 47382528;BA.debugLine="Sub CreateH6(id As String) As VMElement";
RDebugUtils.currentLine=47382529;
 //BA.debugLineNum = 47382529;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=47382530;
 //BA.debugLineNum = 47382530;BA.debugLine="el.Initialize(Me, id).SetTag(\"h6\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"h6");
RDebugUtils.currentLine=47382531;
 //BA.debugLineNum = 47382531;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=47382532;
 //BA.debugLineNum = 47382532;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createimg(b4j.example.bananovue __ref,String _img) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createimg", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createimg", new Object[] {_img}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46989312;
 //BA.debugLineNum = 46989312;BA.debugLine="Sub CreateIMG(img As String) As VMElement";
RDebugUtils.currentLine=46989313;
 //BA.debugLineNum = 46989313;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46989314;
 //BA.debugLineNum = 46989314;BA.debugLine="el.Initialize(Me, img).SetTag(\"img\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_img)._settag /*b4j.example.vmelement*/ (null,"img");
RDebugUtils.currentLine=46989315;
 //BA.debugLineNum = 46989315;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46989316;
 //BA.debugLineNum = 46989316;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createinput(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createinput", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createinput", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=41025536;
 //BA.debugLineNum = 41025536;BA.debugLine="Sub CreateINPUT(id As String) As VMElement";
RDebugUtils.currentLine=41025537;
 //BA.debugLineNum = 41025537;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=41025538;
 //BA.debugLineNum = 41025538;BA.debugLine="el.Initialize(Me, id).SetTag(\"input\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"input");
RDebugUtils.currentLine=41025539;
 //BA.debugLineNum = 41025539;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=41025540;
 //BA.debugLineNum = 41025540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createkeepalive(b4j.example.bananovue __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createkeepalive", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createkeepalive", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46858240;
 //BA.debugLineNum = 46858240;BA.debugLine="Sub CreateKeepAlive(sid As String) As VMElement";
RDebugUtils.currentLine=46858241;
 //BA.debugLineNum = 46858241;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46858242;
 //BA.debugLineNum = 46858242;BA.debugLine="el.Initialize(Me,sid).SetTag(\"keep-alive\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_sid)._settag /*b4j.example.vmelement*/ (null,"keep-alive");
RDebugUtils.currentLine=46858243;
 //BA.debugLineNum = 46858243;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46858244;
 //BA.debugLineNum = 46858244;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createlabel(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createlabel", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createlabel", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=40960000;
 //BA.debugLineNum = 40960000;BA.debugLine="Sub CreateLABEL(id As String) As VMElement";
RDebugUtils.currentLine=40960001;
 //BA.debugLineNum = 40960001;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=40960002;
 //BA.debugLineNum = 40960002;BA.debugLine="el.Initialize(Me, id).SetTag(\"label\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"label");
RDebugUtils.currentLine=40960003;
 //BA.debugLineNum = 40960003;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=40960004;
 //BA.debugLineNum = 40960004;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createli(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createli", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createli", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46596096;
 //BA.debugLineNum = 46596096;BA.debugLine="Sub CreateLI(id As String) As VMElement";
RDebugUtils.currentLine=46596097;
 //BA.debugLineNum = 46596097;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46596098;
 //BA.debugLineNum = 46596098;BA.debugLine="el.Initialize(Me,id).SetTag(\"li\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"li");
RDebugUtils.currentLine=46596099;
 //BA.debugLineNum = 46596099;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46596100;
 //BA.debugLineNum = 46596100;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createol(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createol", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createol", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46661632;
 //BA.debugLineNum = 46661632;BA.debugLine="Sub CreateOL(id As String) As VMElement";
RDebugUtils.currentLine=46661633;
 //BA.debugLineNum = 46661633;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46661634;
 //BA.debugLineNum = 46661634;BA.debugLine="el.Initialize(Me,id).SetTag(\"ol\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"ol");
RDebugUtils.currentLine=46661635;
 //BA.debugLineNum = 46661635;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46661636;
 //BA.debugLineNum = 46661636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createoption(b4j.example.bananovue __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createoption", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createoption", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=40304640;
 //BA.debugLineNum = 40304640;BA.debugLine="Sub CreateOPTION(sid As String) As VMElement";
RDebugUtils.currentLine=40304641;
 //BA.debugLineNum = 40304641;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=40304642;
 //BA.debugLineNum = 40304642;BA.debugLine="el.Initialize(Me,sid).SetTag(\"option\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_sid)._settag /*b4j.example.vmelement*/ (null,"option");
RDebugUtils.currentLine=40304643;
 //BA.debugLineNum = 40304643;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=40304644;
 //BA.debugLineNum = 40304644;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createp(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createp", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createp", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46727168;
 //BA.debugLineNum = 46727168;BA.debugLine="Sub CreateP(id As String) As VMElement";
RDebugUtils.currentLine=46727169;
 //BA.debugLineNum = 46727169;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46727170;
 //BA.debugLineNum = 46727170;BA.debugLine="el.Initialize(Me, id).SetTag(\"p\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"p");
RDebugUtils.currentLine=46727171;
 //BA.debugLineNum = 46727171;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46727172;
 //BA.debugLineNum = 46727172;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createrouterlink(b4j.example.bananovue __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createrouterlink", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createrouterlink", new Object[] {_text}));}
b4j.example.vuehtml _el = null;
RDebugUtils.currentLine=41680896;
 //BA.debugLineNum = 41680896;BA.debugLine="Sub CreateRouterLink(Text As String) As VueHTML";
RDebugUtils.currentLine=41680897;
 //BA.debugLineNum = 41680897;BA.debugLine="Dim el As VueHTML";
_el = new b4j.example.vuehtml();
RDebugUtils.currentLine=41680898;
 //BA.debugLineNum = 41680898;BA.debugLine="el.Initialize(\"\",\"router-link\").SetText(Text)";
_el._initialize /*b4j.example.vuehtml*/ (null,ba,"","router-link")._settext /*b4j.example.vuehtml*/ (null,_text);
RDebugUtils.currentLine=41680899;
 //BA.debugLineNum = 41680899;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=41680900;
 //BA.debugLineNum = 41680900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vuehtml  _createrouterview(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createrouterview", true))
	 {return ((b4j.example.vuehtml) Debug.delegate(ba, "createrouterview", null));}
b4j.example.vuehtml _el = null;
RDebugUtils.currentLine=41746432;
 //BA.debugLineNum = 41746432;BA.debugLine="Sub CreateRouterView As VueHTML";
RDebugUtils.currentLine=41746433;
 //BA.debugLineNum = 41746433;BA.debugLine="Dim el As VueHTML";
_el = new b4j.example.vuehtml();
RDebugUtils.currentLine=41746434;
 //BA.debugLineNum = 41746434;BA.debugLine="el.Initialize(\"\",\"router-view\")";
_el._initialize /*b4j.example.vuehtml*/ (null,ba,"","router-view");
RDebugUtils.currentLine=41746435;
 //BA.debugLineNum = 41746435;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=41746436;
 //BA.debugLineNum = 41746436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createselect(b4j.example.bananovue __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createselect", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createselect", new Object[] {_sid}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=40370176;
 //BA.debugLineNum = 40370176;BA.debugLine="Sub CreateSELECT(sid As String) As VMElement";
RDebugUtils.currentLine=40370177;
 //BA.debugLineNum = 40370177;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=40370178;
 //BA.debugLineNum = 40370178;BA.debugLine="el.Initialize(Me,sid).SetTag(\"select\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_sid)._settag /*b4j.example.vmelement*/ (null,"select");
RDebugUtils.currentLine=40370179;
 //BA.debugLineNum = 40370179;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=40370180;
 //BA.debugLineNum = 40370180;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createspan(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createspan", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createspan", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46465024;
 //BA.debugLineNum = 46465024;BA.debugLine="Sub CreateSPAN(id As String) As VMElement";
RDebugUtils.currentLine=46465025;
 //BA.debugLineNum = 46465025;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46465026;
 //BA.debugLineNum = 46465026;BA.debugLine="el.Initialize(Me,id).SetTag(\"span\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"span");
RDebugUtils.currentLine=46465027;
 //BA.debugLineNum = 46465027;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46465028;
 //BA.debugLineNum = 46465028;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtag(b4j.example.bananovue __ref,String _id,String _tag) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createtag", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createtag", new Object[] {_id,_tag}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46333952;
 //BA.debugLineNum = 46333952;BA.debugLine="Sub CreateTag(id As String, tag As String) As VMEl";
RDebugUtils.currentLine=46333953;
 //BA.debugLineNum = 46333953;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46333954;
 //BA.debugLineNum = 46333954;BA.debugLine="el.Initialize(Me,id).SetTag(tag)";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,_tag);
RDebugUtils.currentLine=46333955;
 //BA.debugLineNum = 46333955;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46333956;
 //BA.debugLineNum = 46333956;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createtextarea(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createtextarea", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createtextarea", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=41091072;
 //BA.debugLineNum = 41091072;BA.debugLine="Sub CreateTEXTAREA(id As String) As VMElement";
RDebugUtils.currentLine=41091073;
 //BA.debugLineNum = 41091073;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=41091074;
 //BA.debugLineNum = 41091074;BA.debugLine="el.Initialize(Me, id).SetTag(\"textarea\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"textarea");
RDebugUtils.currentLine=41091075;
 //BA.debugLineNum = 41091075;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=41091076;
 //BA.debugLineNum = 41091076;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmelement  _createul(b4j.example.bananovue __ref,String _id) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "createul", true))
	 {return ((b4j.example.vmelement) Debug.delegate(ba, "createul", new Object[] {_id}));}
b4j.example.vmelement _el = null;
RDebugUtils.currentLine=46530560;
 //BA.debugLineNum = 46530560;BA.debugLine="Sub CreateUL(id As String) As VMElement";
RDebugUtils.currentLine=46530561;
 //BA.debugLineNum = 46530561;BA.debugLine="Dim el As VMElement";
_el = new b4j.example.vmelement();
RDebugUtils.currentLine=46530562;
 //BA.debugLineNum = 46530562;BA.debugLine="el.Initialize(Me,id).SetTag(\"ul\")";
_el._initialize /*b4j.example.vmelement*/ (null,ba,(b4j.example.bananovue)(this),_id)._settag /*b4j.example.vmelement*/ (null,"ul");
RDebugUtils.currentLine=46530563;
 //BA.debugLineNum = 46530563;BA.debugLine="Return el";
if (true) return _el;
RDebugUtils.currentLine=46530564;
 //BA.debugLineNum = 46530564;BA.debugLine="End Sub";
return null;
}
public String  _date2yyyymmddhhmm(b4j.example.bananovue __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "date2yyyymmddhhmm", true))
	 {return ((String) Debug.delegate(ba, "date2yyyymmddhhmm", new Object[] {_value}));}
com.ab.banano.BANanoObject _m = null;
String _res = "";
RDebugUtils.currentLine=39190528;
 //BA.debugLineNum = 39190528;BA.debugLine="Sub Date2YYYYMMDDHHMM(value As Object) As String";
RDebugUtils.currentLine=39190529;
 //BA.debugLineNum = 39190529;BA.debugLine="Try";
try {RDebugUtils.currentLine=39190530;
 //BA.debugLineNum = 39190530;BA.debugLine="If CStr(value) = \"\" Then Return \"\"";
if ((__ref._cstr /*String*/ (null,_value)).equals("")) { 
if (true) return "";};
RDebugUtils.currentLine=39190531;
 //BA.debugLineNum = 39190531;BA.debugLine="If value = Null Then Return \"\"";
if (_value== null) { 
if (true) return "";};
RDebugUtils.currentLine=39190532;
 //BA.debugLineNum = 39190532;BA.debugLine="Dim m As BANanoObject = BANAno.RunJavascriptMeth";
_m = new com.ab.banano.BANanoObject();
_m.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("moment",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
RDebugUtils.currentLine=39190533;
 //BA.debugLineNum = 39190533;BA.debugLine="Dim res As String = m.RunMethod(\"format\", \"YYYY-";
_res = BA.ObjectToString(_m.RunMethod("format",(Object)("YYYY-MM-DD HH:MM")).Result());
RDebugUtils.currentLine=39190534;
 //BA.debugLineNum = 39190534;BA.debugLine="If res.IndexOf(\"Invalid\") > 0 Then res = \"\"";
if (_res.indexOf("Invalid")>0) { 
_res = "";};
RDebugUtils.currentLine=39190535;
 //BA.debugLineNum = 39190535;BA.debugLine="Return res";
if (true) return _res;
 } 
       catch (Exception e9) {
			ba.setLastException(e9);RDebugUtils.currentLine=39190537;
 //BA.debugLineNum = 39190537;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=39190539;
 //BA.debugLineNum = 39190539;BA.debugLine="End Sub";
return "";
}
public String  _doupload(b4j.example.bananovue __ref,Object _fileobj) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "doupload", true))
	 {return ((String) Debug.delegate(ba, "doupload", new Object[] {_fileobj}));}
Object _aevt = null;
com.ab.banano.BANanoXMLHttpRequest _xhr = null;
com.ab.banano.BANanoObject _fd = null;
anywheresoftware.b4a.objects.collections.Map _err = null;
String _serr = "";
RDebugUtils.currentLine=34799616;
 //BA.debugLineNum = 34799616;BA.debugLine="private Sub DoUpload(fileObj As Object) As String";
RDebugUtils.currentLine=34799617;
 //BA.debugLineNum = 34799617;BA.debugLine="Dim aEvt As Object";
_aevt = new Object();
RDebugUtils.currentLine=34799618;
 //BA.debugLineNum = 34799618;BA.debugLine="Dim xhr As BANanoXMLHttpRequest";
_xhr = new com.ab.banano.BANanoXMLHttpRequest();
RDebugUtils.currentLine=34799620;
 //BA.debugLineNum = 34799620;BA.debugLine="Dim fd As BANanoObject";
_fd = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=34799621;
 //BA.debugLineNum = 34799621;BA.debugLine="fd.Initialize2(\"FormData\",Null)";
_fd.Initialize2("FormData",__c.Null);
RDebugUtils.currentLine=34799622;
 //BA.debugLineNum = 34799622;BA.debugLine="fd.RunMethod(\"append\", Array(\"upload\", fileObj))";
_fd.RunMethod("append",(Object)(new Object[]{(Object)("upload"),_fileobj}));
RDebugUtils.currentLine=34799624;
 //BA.debugLineNum = 34799624;BA.debugLine="xhr.Initialize";
_xhr.Initialize();
RDebugUtils.currentLine=34799625;
 //BA.debugLineNum = 34799625;BA.debugLine="xhr.Open(\"POST\", \"./assets/upload.php\")";
_xhr.Open("POST","./assets/upload.php");
RDebugUtils.currentLine=34799626;
 //BA.debugLineNum = 34799626;BA.debugLine="xhr.AddEventListenerOpenAsync(\"onreadystatechange";
_xhr.AddEventListenerOpenAsync("onreadystatechange",_aevt);
RDebugUtils.currentLine=34799627;
 //BA.debugLineNum = 34799627;BA.debugLine="If xhr.ReadyState = 4 Then";
if (_xhr.getReadyState()==4) { 
RDebugUtils.currentLine=34799628;
 //BA.debugLineNum = 34799628;BA.debugLine="If xhr.Status = 200 Then";
if (_xhr.getStatus()==200) { 
RDebugUtils.currentLine=34799629;
 //BA.debugLineNum = 34799629;BA.debugLine="BANAno.ReturnThen(xhr.ResponseText)";
__ref._banano /*com.ab.banano.BANano*/ .ReturnThen((Object)(_xhr.getResponseText()));
 }else {
RDebugUtils.currentLine=34799631;
 //BA.debugLineNum = 34799631;BA.debugLine="Dim err As Map = CreateMap()";
_err = new anywheresoftware.b4a.objects.collections.Map();
_err = __c.createMap(new Object[] {});
RDebugUtils.currentLine=34799632;
 //BA.debugLineNum = 34799632;BA.debugLine="err.Put(\"status\", \"error\")";
_err.Put((Object)("status"),(Object)("error"));
RDebugUtils.currentLine=34799633;
 //BA.debugLineNum = 34799633;BA.debugLine="Dim serr As String = BANAno.ToJson(err)";
_serr = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(_err.getObject())));
RDebugUtils.currentLine=34799634;
 //BA.debugLineNum = 34799634;BA.debugLine="BANAno.ReturnElse(serr)";
__ref._banano /*com.ab.banano.BANano*/ .ReturnElse((Object)(_serr));
 };
 };
RDebugUtils.currentLine=34799637;
 //BA.debugLineNum = 34799637;BA.debugLine="xhr.CloseEventListener";
_xhr.CloseEventListener();
RDebugUtils.currentLine=34799638;
 //BA.debugLineNum = 34799638;BA.debugLine="xhr.Send2(fd)";
_xhr.Send2((Object)(_fd.getObject()));
RDebugUtils.currentLine=34799639;
 //BA.debugLineNum = 34799639;BA.debugLine="End Sub";
return "";
}
public String  _expectedrag(b4j.example.bananovue __ref,double _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "expectedrag", true))
	 {return ((String) Debug.delegate(ba, "expectedrag", new Object[] {_dvalue}));}
RDebugUtils.currentLine=47579136;
 //BA.debugLineNum = 47579136;BA.debugLine="Public Sub ExpectedRAG(dValue As Double) As String";
RDebugUtils.currentLine=47579137;
 //BA.debugLineNum = 47579137;BA.debugLine="If dValue = 0 Then";
if (_dvalue==0) { 
RDebugUtils.currentLine=47579138;
 //BA.debugLineNum = 47579138;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else 
{RDebugUtils.currentLine=47579139;
 //BA.debugLineNum = 47579139;BA.debugLine="else if dValue > 0 Then";
if (_dvalue>0) { 
RDebugUtils.currentLine=47579140;
 //BA.debugLineNum = 47579140;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else 
{RDebugUtils.currentLine=47579141;
 //BA.debugLineNum = 47579141;BA.debugLine="else if dValue < 0 Then";
if (_dvalue<0) { 
RDebugUtils.currentLine=47579142;
 //BA.debugLineNum = 47579142;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else {
RDebugUtils.currentLine=47579144;
 //BA.debugLineNum = 47579144;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }}}
;
RDebugUtils.currentLine=47579146;
 //BA.debugLineNum = 47579146;BA.debugLine="End Sub";
return "";
}
public String  _expenditurerag(b4j.example.bananovue __ref,double _dvariance) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "expenditurerag", true))
	 {return ((String) Debug.delegate(ba, "expenditurerag", new Object[] {_dvariance}));}
RDebugUtils.currentLine=47644672;
 //BA.debugLineNum = 47644672;BA.debugLine="Public Sub ExpenditureRAG(dVariance As Double) As";
RDebugUtils.currentLine=47644673;
 //BA.debugLineNum = 47644673;BA.debugLine="If dVariance > 0 Then";
if (_dvariance>0) { 
RDebugUtils.currentLine=47644674;
 //BA.debugLineNum = 47644674;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else 
{RDebugUtils.currentLine=47644675;
 //BA.debugLineNum = 47644675;BA.debugLine="else if dVariance < 0 Then";
if (_dvariance<0) { 
RDebugUtils.currentLine=47644676;
 //BA.debugLineNum = 47644676;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else 
{RDebugUtils.currentLine=47644677;
 //BA.debugLineNum = 47644677;BA.debugLine="else if dVariance = 0 Then";
if (_dvariance==0) { 
RDebugUtils.currentLine=47644678;
 //BA.debugLineNum = 47644678;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
RDebugUtils.currentLine=47644680;
 //BA.debugLineNum = 47644680;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 }}}
;
RDebugUtils.currentLine=47644682;
 //BA.debugLineNum = 47644682;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _extractmap(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _source,anywheresoftware.b4a.objects.collections.List _keys) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "extractmap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "extractmap", new Object[] {_source,_keys}));}
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=35192832;
 //BA.debugLineNum = 35192832;BA.debugLine="Sub ExtractMap(source As Map, keys As List) As Map";
RDebugUtils.currentLine=35192833;
 //BA.debugLineNum = 35192833;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
RDebugUtils.currentLine=35192834;
 //BA.debugLineNum = 35192834;BA.debugLine="For Each k As String In keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _keys;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=35192835;
 //BA.debugLineNum = 35192835;BA.debugLine="Dim v As Object = source.get(k)";
_v = _source.Get((Object)(_k));
RDebugUtils.currentLine=35192836;
 //BA.debugLineNum = 35192836;BA.debugLine="nm.put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=35192838;
 //BA.debugLineNum = 35192838;BA.debugLine="Return nm";
if (true) return _nm;
RDebugUtils.currentLine=35192839;
 //BA.debugLineNum = 35192839;BA.debugLine="End Sub";
return null;
}
public String  _facedone(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "facedone", true))
	 {return ((String) Debug.delegate(ba, "facedone", new Object[] {_dvalue}));}
RDebugUtils.currentLine=48168960;
 //BA.debugLineNum = 48168960;BA.debugLine="Public Sub FaceDone(dValue As Int) As String";
RDebugUtils.currentLine=48168961;
 //BA.debugLineNum = 48168961;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
RDebugUtils.currentLine=48168963;
 //BA.debugLineNum = 48168963;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
RDebugUtils.currentLine=48168965;
 //BA.debugLineNum = 48168965;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
RDebugUtils.currentLine=48168967;
 //BA.debugLineNum = 48168967;BA.debugLine="End Sub";
return "";
}
public String  _facerag(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "facerag", true))
	 {return ((String) Debug.delegate(ba, "facerag", new Object[] {_dvalue}));}
RDebugUtils.currentLine=47972352;
 //BA.debugLineNum = 47972352;BA.debugLine="Public Sub FaceRAG(dValue As Int) As String";
RDebugUtils.currentLine=47972353;
 //BA.debugLineNum = 47972353;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
RDebugUtils.currentLine=47972355;
 //BA.debugLineNum = 47972355;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
RDebugUtils.currentLine=47972357;
 //BA.debugLineNum = 47972357;BA.debugLine="Return \"./assets/neutralface.png\"";
if (true) return "./assets/neutralface.png";
 break; }
case 2: {
RDebugUtils.currentLine=47972359;
 //BA.debugLineNum = 47972359;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
RDebugUtils.currentLine=47972361;
 //BA.debugLineNum = 47972361;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
RDebugUtils.currentLine=47972363;
 //BA.debugLineNum = 47972363;BA.debugLine="End Sub";
return "";
}
public String  _facerg(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "facerg", true))
	 {return ((String) Debug.delegate(ba, "facerg", new Object[] {_dvalue}));}
RDebugUtils.currentLine=48037888;
 //BA.debugLineNum = 48037888;BA.debugLine="Public Sub FaceRG(dValue As Int) As String";
RDebugUtils.currentLine=48037889;
 //BA.debugLineNum = 48037889;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
RDebugUtils.currentLine=48037891;
 //BA.debugLineNum = 48037891;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 1: {
RDebugUtils.currentLine=48037893;
 //BA.debugLineNum = 48037893;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
RDebugUtils.currentLine=48037895;
 //BA.debugLineNum = 48037895;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
RDebugUtils.currentLine=48037897;
 //BA.debugLineNum = 48037897;BA.debugLine="End Sub";
return "";
}
public String  _facerg1(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "facerg1", true))
	 {return ((String) Debug.delegate(ba, "facerg1", new Object[] {_dvalue}));}
RDebugUtils.currentLine=48103424;
 //BA.debugLineNum = 48103424;BA.debugLine="Public Sub FaceRG1(dValue As Int) As String";
RDebugUtils.currentLine=48103425;
 //BA.debugLineNum = 48103425;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 1: {
RDebugUtils.currentLine=48103427;
 //BA.debugLineNum = 48103427;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
case 0: {
RDebugUtils.currentLine=48103429;
 //BA.debugLineNum = 48103429;BA.debugLine="Return \"./assets/happyface.png\"";
if (true) return "./assets/happyface.png";
 break; }
default: {
RDebugUtils.currentLine=48103431;
 //BA.debugLineNum = 48103431;BA.debugLine="Return \"./assets/sadface.png\"";
if (true) return "./assets/sadface.png";
 break; }
}
;
RDebugUtils.currentLine=48103433;
 //BA.debugLineNum = 48103433;BA.debugLine="End Sub";
return "";
}
public String  _formatfilesize(b4j.example.bananovue __ref,float _bytes) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "formatfilesize", true))
	 {return ((String) Debug.delegate(ba, "formatfilesize", new Object[] {_bytes}));}
String[] _unit = null;
double _po = 0;
double _si = 0;
int _i = 0;
RDebugUtils.currentLine=36241408;
 //BA.debugLineNum = 36241408;BA.debugLine="Sub FormatFileSize(Bytes As Float) As String";
RDebugUtils.currentLine=36241409;
 //BA.debugLineNum = 36241409;BA.debugLine="Try";
try {RDebugUtils.currentLine=36241410;
 //BA.debugLineNum = 36241410;BA.debugLine="Private Unit() As String = Array As String(\" Byt";
_unit = new String[]{" Byte"," KB"," MB"," GB"," TB"," PB"," EB"," ZB"," YB"};
RDebugUtils.currentLine=36241411;
 //BA.debugLineNum = 36241411;BA.debugLine="If Bytes = 0 Then";
if (_bytes==0) { 
RDebugUtils.currentLine=36241412;
 //BA.debugLineNum = 36241412;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 }else {
RDebugUtils.currentLine=36241414;
 //BA.debugLineNum = 36241414;BA.debugLine="Private Po, Si As Double";
_po = 0;
_si = 0;
RDebugUtils.currentLine=36241415;
 //BA.debugLineNum = 36241415;BA.debugLine="Private I As Int";
_i = 0;
RDebugUtils.currentLine=36241416;
 //BA.debugLineNum = 36241416;BA.debugLine="Bytes = Abs(Bytes)";
_bytes = (float) (__c.Abs(_bytes));
RDebugUtils.currentLine=36241417;
 //BA.debugLineNum = 36241417;BA.debugLine="I = Floor(Logarithm(Bytes, 1024))";
_i = (int) (__c.Floor(__c.Logarithm(_bytes,1024)));
RDebugUtils.currentLine=36241418;
 //BA.debugLineNum = 36241418;BA.debugLine="Po = Power(1024, I)";
_po = __c.Power(1024,_i);
RDebugUtils.currentLine=36241419;
 //BA.debugLineNum = 36241419;BA.debugLine="Si = Bytes / Po";
_si = _bytes/(double)_po;
RDebugUtils.currentLine=36241420;
 //BA.debugLineNum = 36241420;BA.debugLine="Return NumberFormat(Si, 1, 3) & Unit(I)";
if (true) return __c.NumberFormat(_si,(int) (1),(int) (3))+_unit[_i];
 };
 } 
       catch (Exception e15) {
			ba.setLastException(e15);RDebugUtils.currentLine=36241423;
 //BA.debugLineNum = 36241423;BA.debugLine="Return \"0 Bytes\"";
if (true) return "0 Bytes";
 };
RDebugUtils.currentLine=36241425;
 //BA.debugLineNum = 36241425;BA.debugLine="End Sub";
return "";
}
public String  _gar(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "gar", true))
	 {return ((String) Debug.delegate(ba, "gar", new Object[] {_dvalue}));}
RDebugUtils.currentLine=47841280;
 //BA.debugLineNum = 47841280;BA.debugLine="Public Sub GAR(dValue As Int) As String";
RDebugUtils.currentLine=47841281;
 //BA.debugLineNum = 47841281;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
RDebugUtils.currentLine=47841283;
 //BA.debugLineNum = 47841283;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
RDebugUtils.currentLine=47841285;
 //BA.debugLineNum = 47841285;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
RDebugUtils.currentLine=47841287;
 //BA.debugLineNum = 47841287;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
RDebugUtils.currentLine=47841289;
 //BA.debugLineNum = 47841289;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
RDebugUtils.currentLine=47841291;
 //BA.debugLineNum = 47841291;BA.debugLine="End Sub";
return "";
}
public String  _getcolorhex(b4j.example.bananovue __ref,String _scolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getcolorhex", true))
	 {return ((String) Debug.delegate(ba, "getcolorhex", new Object[] {_scolor}));}
String _xcolor = "";
RDebugUtils.currentLine=40632320;
 //BA.debugLineNum = 40632320;BA.debugLine="Sub GetColorHex(sColor As String) As String";
RDebugUtils.currentLine=40632321;
 //BA.debugLineNum = 40632321;BA.debugLine="sColor = sColor.tolowercase";
_scolor = _scolor.toLowerCase();
RDebugUtils.currentLine=40632322;
 //BA.debugLineNum = 40632322;BA.debugLine="If ColorMap.ContainsKey(sColor) Then";
if (__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .ContainsKey((Object)(_scolor))) { 
RDebugUtils.currentLine=40632323;
 //BA.debugLineNum = 40632323;BA.debugLine="Dim xColor As String = ColorMap.Get(sColor)";
_xcolor = BA.ObjectToString(__ref._colormap /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_scolor)));
RDebugUtils.currentLine=40632324;
 //BA.debugLineNum = 40632324;BA.debugLine="Return xColor";
if (true) return _xcolor;
 };
RDebugUtils.currentLine=40632326;
 //BA.debugLineNum = 40632326;BA.debugLine="Return \"\"";
if (true) return "";
RDebugUtils.currentLine=40632327;
 //BA.debugLineNum = 40632327;BA.debugLine="End Sub";
return "";
}
public boolean  _getdisabledstate(b4j.example.bananovue __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getdisabledstate", true))
	 {return ((Boolean) Debug.delegate(ba, "getdisabledstate", new Object[] {_k}));}
String _diskey = "";
RDebugUtils.currentLine=39452672;
 //BA.debugLineNum = 39452672;BA.debugLine="Sub GetDisabledState(k As String) As Boolean";
RDebugUtils.currentLine=39452673;
 //BA.debugLineNum = 39452673;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
RDebugUtils.currentLine=39452674;
 //BA.debugLineNum = 39452674;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(__ref._getstate /*Object*/ (null,_diskey,(Object)(__c.False)));
RDebugUtils.currentLine=39452675;
 //BA.debugLineNum = 39452675;BA.debugLine="End Sub";
return false;
}
public String  _getfileext(b4j.example.bananovue __ref,String _fullpath) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getfileext", true))
	 {return ((String) Debug.delegate(ba, "getfileext", new Object[] {_fullpath}));}
RDebugUtils.currentLine=42401792;
 //BA.debugLineNum = 42401792;BA.debugLine="Sub GetFileExt(FullPath As String) As String";
RDebugUtils.currentLine=42401793;
 //BA.debugLineNum = 42401793;BA.debugLine="Return FullPath.SubString(FullPath.LastIndexOf(\".";
if (true) return _fullpath.substring((int) (_fullpath.lastIndexOf(".")+1));
RDebugUtils.currentLine=42401794;
 //BA.debugLineNum = 42401794;BA.debugLine="End Sub";
return "";
}
public String  _getfileparentpath(b4j.example.bananovue __ref,String _path) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getfileparentpath", true))
	 {return ((String) Debug.delegate(ba, "getfileparentpath", new Object[] {_path}));}
String _path1 = "";
int _l = 0;
RDebugUtils.currentLine=42336256;
 //BA.debugLineNum = 42336256;BA.debugLine="Sub GetFileParentPath(Path As String) As String";
RDebugUtils.currentLine=42336257;
 //BA.debugLineNum = 42336257;BA.debugLine="Dim Path1 As String";
_path1 = "";
RDebugUtils.currentLine=42336258;
 //BA.debugLineNum = 42336258;BA.debugLine="Dim L As Int";
_l = 0;
RDebugUtils.currentLine=42336259;
 //BA.debugLineNum = 42336259;BA.debugLine="If Path = \"/\" Then";
if ((_path).equals("/")) { 
RDebugUtils.currentLine=42336260;
 //BA.debugLineNum = 42336260;BA.debugLine="Return \"/\"";
if (true) return "/";
 };
RDebugUtils.currentLine=42336262;
 //BA.debugLineNum = 42336262;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
RDebugUtils.currentLine=42336263;
 //BA.debugLineNum = 42336263;BA.debugLine="If L = Path.Length - 1 Then";
if (_l==_path.length()-1) { 
RDebugUtils.currentLine=42336265;
 //BA.debugLineNum = 42336265;BA.debugLine="Path1 = Path.SubString2(0,L)";
_path1 = _path.substring((int) (0),_l);
 }else {
RDebugUtils.currentLine=42336267;
 //BA.debugLineNum = 42336267;BA.debugLine="Path1 = Path";
_path1 = _path;
 };
RDebugUtils.currentLine=42336269;
 //BA.debugLineNum = 42336269;BA.debugLine="L = Path.LastIndexOf(\"/\")";
_l = _path.lastIndexOf("/");
RDebugUtils.currentLine=42336270;
 //BA.debugLineNum = 42336270;BA.debugLine="If L = 0 Then";
if (_l==0) { 
RDebugUtils.currentLine=42336271;
 //BA.debugLineNum = 42336271;BA.debugLine="L = 1";
_l = (int) (1);
 };
RDebugUtils.currentLine=42336273;
 //BA.debugLineNum = 42336273;BA.debugLine="Return Path1.SubString2(0,L)";
if (true) return _path1.substring((int) (0),_l);
RDebugUtils.currentLine=42336274;
 //BA.debugLineNum = 42336274;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getmapkeys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapkeys", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
Object _value = null;
RDebugUtils.currentLine=38928384;
 //BA.debugLineNum = 38928384;BA.debugLine="Sub GetMapKeys(sourceMap As Map) As List";
RDebugUtils.currentLine=38928385;
 //BA.debugLineNum = 38928385;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38928386;
 //BA.debugLineNum = 38928386;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=38928387;
 //BA.debugLineNum = 38928387;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=38928388;
 //BA.debugLineNum = 38928388;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=38928389;
 //BA.debugLineNum = 38928389;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=38928390;
 //BA.debugLineNum = 38928390;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=38928391;
 //BA.debugLineNum = 38928391;BA.debugLine="Dim value As Object = sourceMap.GetKeyAt(iCnt)";
_value = _sourcemap.GetKeyAt(_icnt);
RDebugUtils.currentLine=38928392;
 //BA.debugLineNum = 38928392;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=38928394;
 //BA.debugLineNum = 38928394;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=38928395;
 //BA.debugLineNum = 38928395;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getmapvalues", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapvalues", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
Object _value = null;
RDebugUtils.currentLine=38862848;
 //BA.debugLineNum = 38862848;BA.debugLine="Sub GetMapValues(sourceMap As Map) As List";
RDebugUtils.currentLine=38862849;
 //BA.debugLineNum = 38862849;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38862850;
 //BA.debugLineNum = 38862850;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=38862851;
 //BA.debugLineNum = 38862851;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=38862852;
 //BA.debugLineNum = 38862852;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=38862853;
 //BA.debugLineNum = 38862853;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=38862854;
 //BA.debugLineNum = 38862854;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=38862855;
 //BA.debugLineNum = 38862855;BA.debugLine="Dim value As Object = sourceMap.GetValueAt(iCnt)";
_value = _sourcemap.GetValueAt(_icnt);
RDebugUtils.currentLine=38862856;
 //BA.debugLineNum = 38862856;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add(_value);
 }
};
RDebugUtils.currentLine=38862858;
 //BA.debugLineNum = 38862858;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=38862859;
 //BA.debugLineNum = 38862859;BA.debugLine="End Sub";
return null;
}
public String  _getnumbers(b4j.example.bananovue __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getnumbers", true))
	 {return ((String) Debug.delegate(ba, "getnumbers", new Object[] {_value}));}
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
RDebugUtils.currentLine=38993920;
 //BA.debugLineNum = 38993920;BA.debugLine="Public Sub GetNumbers(value As String) As String";
RDebugUtils.currentLine=38993921;
 //BA.debugLineNum = 38993921;BA.debugLine="value = CStr(value)";
_value = __ref._cstr /*String*/ (null,(Object)(_value));
RDebugUtils.currentLine=38993922;
 //BA.debugLineNum = 38993922;BA.debugLine="Try";
try {RDebugUtils.currentLine=38993923;
 //BA.debugLineNum = 38993923;BA.debugLine="value = value.Trim";
_value = _value.trim();
RDebugUtils.currentLine=38993924;
 //BA.debugLineNum = 38993924;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
RDebugUtils.currentLine=38993925;
 //BA.debugLineNum = 38993925;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
RDebugUtils.currentLine=38993926;
 //BA.debugLineNum = 38993926;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
RDebugUtils.currentLine=38993927;
 //BA.debugLineNum = 38993927;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=38993928;
 //BA.debugLineNum = 38993928;BA.debugLine="For i = 0 To slen - 1";
{
final int step8 = 1;
final int limit8 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=38993929;
 //BA.debugLineNum = 38993929;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
RDebugUtils.currentLine=38993930;
 //BA.debugLineNum = 38993930;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
if (__ref._instr /*int*/ (null,"0123456789.-",_mout)!=-1) { 
RDebugUtils.currentLine=38993931;
 //BA.debugLineNum = 38993931;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
RDebugUtils.currentLine=38993934;
 //BA.debugLineNum = 38993934;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=38993936;
 //BA.debugLineNum = 38993936;BA.debugLine="Return value";
if (true) return _value;
 };
RDebugUtils.currentLine=38993938;
 //BA.debugLineNum = 38993938;BA.debugLine="End Sub";
return "";
}
public boolean  _getrequiredstate(b4j.example.bananovue __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getrequiredstate", true))
	 {return ((Boolean) Debug.delegate(ba, "getrequiredstate", new Object[] {_k}));}
String _diskey = "";
RDebugUtils.currentLine=42860544;
 //BA.debugLineNum = 42860544;BA.debugLine="Sub GetRequiredState(k As String) As Boolean";
RDebugUtils.currentLine=42860545;
 //BA.debugLineNum = 42860545;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
RDebugUtils.currentLine=42860546;
 //BA.debugLineNum = 42860546;BA.debugLine="Return GetState(disKey,False)";
if (true) return BA.ObjectToBoolean(__ref._getstate /*Object*/ (null,_diskey,(Object)(__c.False)));
RDebugUtils.currentLine=42860547;
 //BA.debugLineNum = 42860547;BA.debugLine="End Sub";
return false;
}
public boolean  _getshowstate(b4j.example.bananovue __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "getshowstate", true))
	 {return ((Boolean) Debug.delegate(ba, "getshowstate", new Object[] {_k}));}
String _showkey = "";
RDebugUtils.currentLine=39387136;
 //BA.debugLineNum = 39387136;BA.debugLine="Sub GetShowState(k As String) As Boolean";
RDebugUtils.currentLine=39387137;
 //BA.debugLineNum = 39387137;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
RDebugUtils.currentLine=39387138;
 //BA.debugLineNum = 39387138;BA.debugLine="Return GetState(showKey,False)";
if (true) return BA.ObjectToBoolean(__ref._getstate /*Object*/ (null,_showkey,(Object)(__c.False)));
RDebugUtils.currentLine=39387139;
 //BA.debugLineNum = 39387139;BA.debugLine="End Sub";
return false;
}
public String  _hideerror(b4j.example.bananovue __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "hideerror", true))
	 {return ((String) Debug.delegate(ba, "hideerror", new Object[] {_elid}));}
RDebugUtils.currentLine=42270720;
 //BA.debugLineNum = 42270720;BA.debugLine="Sub HideError(elID As String)";
RDebugUtils.currentLine=42270721;
 //BA.debugLineNum = 42270721;BA.debugLine="SetStateSingle($\"${elID}error\"$, False)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.False));
RDebugUtils.currentLine=42270722;
 //BA.debugLineNum = 42270722;BA.debugLine="End Sub";
return "";
}
public String  _hideitems(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "hideitems", true))
	 {return ((String) Debug.delegate(ba, "hideitems", new Object[] {_items}));}
String _item = "";
RDebugUtils.currentLine=39780352;
 //BA.debugLineNum = 39780352;BA.debugLine="Sub HideItems(items As List)";
RDebugUtils.currentLine=39780353;
 //BA.debugLineNum = 39780353;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=39780354;
 //BA.debugLineNum = 39780354;BA.debugLine="SetStateSingle(item, False)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_item,(Object)(__c.False));
 }
};
RDebugUtils.currentLine=39780356;
 //BA.debugLineNum = 39780356;BA.debugLine="End Sub";
return "";
}
public String  _hr(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "hr", true))
	 {return ((String) Debug.delegate(ba, "hr", null));}
RDebugUtils.currentLine=40763392;
 //BA.debugLineNum = 40763392;BA.debugLine="Sub HR As String";
RDebugUtils.currentLine=40763393;
 //BA.debugLineNum = 40763393;BA.debugLine="Return \"<hr>\"";
if (true) return "<hr>";
RDebugUtils.currentLine=40763394;
 //BA.debugLineNum = 40763394;BA.debugLine="End Sub";
return "";
}
public String  _inquotes(b4j.example.bananovue __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "inquotes", true))
	 {return ((String) Debug.delegate(ba, "inquotes", new Object[] {_svalue}));}
RDebugUtils.currentLine=38535168;
 //BA.debugLineNum = 38535168;BA.debugLine="Public Sub InQuotes(sValue As String) As String";
RDebugUtils.currentLine=38535169;
 //BA.debugLineNum = 38535169;BA.debugLine="Return QUOTE & sValue & QUOTE";
if (true) return __c.QUOTE+_svalue+__c.QUOTE;
RDebugUtils.currentLine=38535170;
 //BA.debugLineNum = 38535170;BA.debugLine="End Sub";
return "";
}
public long  _instrrev(b4j.example.bananovue __ref,String _value,String _search) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "instrrev", true))
	 {return ((Long) Debug.delegate(ba, "instrrev", new Object[] {_value,_search}));}
RDebugUtils.currentLine=36306944;
 //BA.debugLineNum = 36306944;BA.debugLine="Sub InStrRev(value As String, search As String) As";
RDebugUtils.currentLine=36306945;
 //BA.debugLineNum = 36306945;BA.debugLine="Return value.LastIndexOf(search) + 1";
if (true) return (long) (_value.lastIndexOf(_search)+1);
RDebugUtils.currentLine=36306946;
 //BA.debugLineNum = 36306946;BA.debugLine="End Sub";
return 0L;
}
public String  _join(b4j.example.bananovue __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "join", true))
	 {return ((String) Debug.delegate(ba, "join", new Object[] {_delimiter,_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=35389440;
 //BA.debugLineNum = 35389440;BA.debugLine="Sub Join(delimiter As String, lst As List) As Stri";
RDebugUtils.currentLine=35389441;
 //BA.debugLineNum = 35389441;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=35389442;
 //BA.debugLineNum = 35389442;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=35389443;
 //BA.debugLineNum = 35389443;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=35389444;
 //BA.debugLineNum = 35389444;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=35389445;
 //BA.debugLineNum = 35389445;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=35389446;
 //BA.debugLineNum = 35389446;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=35389447;
 //BA.debugLineNum = 35389447;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=35389448;
 //BA.debugLineNum = 35389448;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=35389449;
 //BA.debugLineNum = 35389449;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
RDebugUtils.currentLine=35389451;
 //BA.debugLineNum = 35389451;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=35389452;
 //BA.debugLineNum = 35389452;BA.debugLine="End Sub";
return "";
}
public com.ab.banano.BANanoObject  _jqueryelement(b4j.example.bananovue __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "jqueryelement", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "jqueryelement", new Object[] {_sid}));}
com.ab.banano.BANanoObject _bo = null;
RDebugUtils.currentLine=35127296;
 //BA.debugLineNum = 35127296;BA.debugLine="Sub JQueryElement(sid As String) As BANanoObject";
RDebugUtils.currentLine=35127297;
 //BA.debugLineNum = 35127297;BA.debugLine="sid = sid.ToLowerCase";
_sid = _sid.toLowerCase();
RDebugUtils.currentLine=35127298;
 //BA.debugLineNum = 35127298;BA.debugLine="Dim bo As BANanoObject = JQuery.Selector($\"#${sid";
_bo = new com.ab.banano.BANanoObject();
_bo = __ref._jquery /*com.ab.banano.BANanoObject*/ .Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(_sid))+"")));
RDebugUtils.currentLine=35127299;
 //BA.debugLineNum = 35127299;BA.debugLine="Return bo";
if (true) return _bo;
RDebugUtils.currentLine=35127300;
 //BA.debugLineNum = 35127300;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _json2list(b4j.example.bananovue __ref,String _strvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "json2list", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "json2list", new Object[] {_strvalue}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
RDebugUtils.currentLine=37552128;
 //BA.debugLineNum = 37552128;BA.debugLine="Sub Json2List(strValue As String) As List";
RDebugUtils.currentLine=37552129;
 //BA.debugLineNum = 37552129;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=37552130;
 //BA.debugLineNum = 37552130;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=37552131;
 //BA.debugLineNum = 37552131;BA.debugLine="lst.clear";
_lst.Clear();
RDebugUtils.currentLine=37552132;
 //BA.debugLineNum = 37552132;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
RDebugUtils.currentLine=37552133;
 //BA.debugLineNum = 37552133;BA.debugLine="Return lst";
if (true) return _lst;
 };
RDebugUtils.currentLine=37552135;
 //BA.debugLineNum = 37552135;BA.debugLine="Try";
try {RDebugUtils.currentLine=37552136;
 //BA.debugLineNum = 37552136;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
RDebugUtils.currentLine=37552137;
 //BA.debugLineNum = 37552137;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
RDebugUtils.currentLine=37552138;
 //BA.debugLineNum = 37552138;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=37552140;
 //BA.debugLineNum = 37552140;BA.debugLine="Return lst";
if (true) return _lst;
 };
RDebugUtils.currentLine=37552142;
 //BA.debugLineNum = 37552142;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(b4j.example.bananovue __ref,String _strjson) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "json2map", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "json2map", new Object[] {_strjson}));}
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
RDebugUtils.currentLine=37093376;
 //BA.debugLineNum = 37093376;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
RDebugUtils.currentLine=37093377;
 //BA.debugLineNum = 37093377;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
RDebugUtils.currentLine=37093378;
 //BA.debugLineNum = 37093378;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=37093379;
 //BA.debugLineNum = 37093379;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=37093380;
 //BA.debugLineNum = 37093380;BA.debugLine="Map1.clear";
_map1.Clear();
RDebugUtils.currentLine=37093381;
 //BA.debugLineNum = 37093381;BA.debugLine="Try";
try {RDebugUtils.currentLine=37093382;
 //BA.debugLineNum = 37093382;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
RDebugUtils.currentLine=37093383;
 //BA.debugLineNum = 37093383;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
RDebugUtils.currentLine=37093384;
 //BA.debugLineNum = 37093384;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
RDebugUtils.currentLine=37093386;
 //BA.debugLineNum = 37093386;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=37093388;
 //BA.debugLineNum = 37093388;BA.debugLine="Return Map1";
if (true) return _map1;
 };
RDebugUtils.currentLine=37093390;
 //BA.debugLineNum = 37093390;BA.debugLine="End Sub";
return null;
}
public String  _jsonvalues2lowercase(b4j.example.bananovue __ref,String _sjson,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "jsonvalues2lowercase", true))
	 {return ((String) Debug.delegate(ba, "jsonvalues2lowercase", new Object[] {_sjson,_props}));}
anywheresoftware.b4a.objects.collections.Map _jmap = null;
String _njson = "";
RDebugUtils.currentLine=36896768;
 //BA.debugLineNum = 36896768;BA.debugLine="Sub JSONValues2LowerCase(sJSON As String, props As";
RDebugUtils.currentLine=36896770;
 //BA.debugLineNum = 36896770;BA.debugLine="Dim jmap As Map = Json2Map(sJSON)";
_jmap = new anywheresoftware.b4a.objects.collections.Map();
_jmap = __ref._json2map /*anywheresoftware.b4a.objects.collections.Map*/ (null,_sjson);
RDebugUtils.currentLine=36896771;
 //BA.debugLineNum = 36896771;BA.debugLine="MapValues2LowerCase(jmap, props)";
__ref._mapvalues2lowercase /*String*/ (null,_jmap,_props);
RDebugUtils.currentLine=36896772;
 //BA.debugLineNum = 36896772;BA.debugLine="Dim nJSON As String = Map2Json(jmap)";
_njson = __ref._map2json /*String*/ (null,_jmap);
RDebugUtils.currentLine=36896773;
 //BA.debugLineNum = 36896773;BA.debugLine="Return nJSON";
if (true) return _njson;
RDebugUtils.currentLine=36896774;
 //BA.debugLineNum = 36896774;BA.debugLine="End Sub";
return "";
}
public String  _mapvalues2lowercase(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m,anywheresoftware.b4a.objects.collections.List _props) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "mapvalues2lowercase", true))
	 {return ((String) Debug.delegate(ba, "mapvalues2lowercase", new Object[] {_m,_props}));}
String _prop = "";
String _v = "";
RDebugUtils.currentLine=37617664;
 //BA.debugLineNum = 37617664;BA.debugLine="Sub MapValues2LowerCase(m As Map, props As List)";
RDebugUtils.currentLine=37617665;
 //BA.debugLineNum = 37617665;BA.debugLine="For Each prop As String In props";
{
final anywheresoftware.b4a.BA.IterableList group1 = _props;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_prop = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=37617666;
 //BA.debugLineNum = 37617666;BA.debugLine="If m.ContainsKey(prop) Then";
if (_m.ContainsKey((Object)(_prop))) { 
RDebugUtils.currentLine=37617667;
 //BA.debugLineNum = 37617667;BA.debugLine="Dim v As String = m.GetDefault(prop,\"\")";
_v = BA.ObjectToString(_m.GetDefault((Object)(_prop),(Object)("")));
RDebugUtils.currentLine=37617668;
 //BA.debugLineNum = 37617668;BA.debugLine="v = v.tolowercase";
_v = _v.toLowerCase();
RDebugUtils.currentLine=37617669;
 //BA.debugLineNum = 37617669;BA.debugLine="m.Put(prop,v)";
_m.Put((Object)(_prop),(Object)(_v));
 };
 }
};
RDebugUtils.currentLine=37617672;
 //BA.debugLineNum = 37617672;BA.debugLine="End Sub";
return "";
}
public String  _map2json(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "map2json", true))
	 {return ((String) Debug.delegate(ba, "map2json", new Object[] {_mp}));}
com.ab.banano.BANanoJSONGenerator _json = null;
RDebugUtils.currentLine=36962304;
 //BA.debugLineNum = 36962304;BA.debugLine="Sub Map2Json(mp As Map) As String";
RDebugUtils.currentLine=36962305;
 //BA.debugLineNum = 36962305;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
RDebugUtils.currentLine=36962306;
 //BA.debugLineNum = 36962306;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
RDebugUtils.currentLine=36962307;
 //BA.debugLineNum = 36962307;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
RDebugUtils.currentLine=36962308;
 //BA.debugLineNum = 36962308;BA.debugLine="End Sub";
return "";
}
public String  _lcase(b4j.example.bananovue __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "lcase", true))
	 {return ((String) Debug.delegate(ba, "lcase", new Object[] {_text}));}
RDebugUtils.currentLine=38404096;
 //BA.debugLineNum = 38404096;BA.debugLine="Sub LCase(Text As String) As String";
RDebugUtils.currentLine=38404097;
 //BA.debugLineNum = 38404097;BA.debugLine="Return Text.ToLowerCase";
if (true) return _text.toLowerCase();
RDebugUtils.currentLine=38404098;
 //BA.debugLineNum = 38404098;BA.debugLine="End Sub";
return "";
}
public String  _leftstring(b4j.example.bananovue __ref,String _text,long _llength) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "leftstring", true))
	 {return ((String) Debug.delegate(ba, "leftstring", new Object[] {_text,_llength}));}
RDebugUtils.currentLine=38076416;
 //BA.debugLineNum = 38076416;BA.debugLine="Sub LeftString(Text As String, lLength As Long)As";
RDebugUtils.currentLine=38076417;
 //BA.debugLineNum = 38076417;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
RDebugUtils.currentLine=38076418;
 //BA.debugLineNum = 38076418;BA.debugLine="Return Text.SubString2(0, lLength)";
if (true) return _text.substring((int) (0),(int) (_llength));
RDebugUtils.currentLine=38076419;
 //BA.debugLineNum = 38076419;BA.debugLine="End Sub";
return "";
}
public int  _len(b4j.example.bananovue __ref,String _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "len", true))
	 {return ((Integer) Debug.delegate(ba, "len", new Object[] {_text}));}
RDebugUtils.currentLine=36372480;
 //BA.debugLineNum = 36372480;BA.debugLine="Sub Len(Text As String) As Int";
RDebugUtils.currentLine=36372481;
 //BA.debugLineNum = 36372481;BA.debugLine="Return Text.Length";
if (true) return _text.length();
RDebugUtils.currentLine=36372482;
 //BA.debugLineNum = 36372482;BA.debugLine="End Sub";
return 0;
}
public String  _list2arrayvariable(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "list2arrayvariable", true))
	 {return ((String) Debug.delegate(ba, "list2arrayvariable", new Object[] {_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=36831232;
 //BA.debugLineNum = 36831232;BA.debugLine="Sub List2ArrayVariable(lst As List) As String";
RDebugUtils.currentLine=36831233;
 //BA.debugLineNum = 36831233;BA.debugLine="If lst.Size = 0 Then";
if (_lst.getSize()==0) { 
RDebugUtils.currentLine=36831234;
 //BA.debugLineNum = 36831234;BA.debugLine="Return $\"\"\"\"$";
if (true) return ("\"\"");
 };
RDebugUtils.currentLine=36831236;
 //BA.debugLineNum = 36831236;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=36831237;
 //BA.debugLineNum = 36831237;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=36831238;
 //BA.debugLineNum = 36831238;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=36831239;
 //BA.debugLineNum = 36831239;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=36831240;
 //BA.debugLineNum = 36831240;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=36831241;
 //BA.debugLineNum = 36831241;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",(Object)(_fld))+"\"");
RDebugUtils.currentLine=36831242;
 //BA.debugLineNum = 36831242;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=36831243;
 //BA.debugLineNum = 36831243;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step11 = 1;
final int limit11 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit11 ;_i = _i + step11 ) {
RDebugUtils.currentLine=36831244;
 //BA.debugLineNum = 36831244;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=36831245;
 //BA.debugLineNum = 36831245;BA.debugLine="fld = $\"\"${fld}\"\"$";
_fld = ("\""+__c.SmartStringFormatter("",(Object)(_fld))+"\"");
RDebugUtils.currentLine=36831246;
 //BA.debugLineNum = 36831246;BA.debugLine="sb.Append(\",\").Append(fld)";
_sb.Append(",").Append(_fld);
 }
};
RDebugUtils.currentLine=36831248;
 //BA.debugLineNum = 36831248;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=36831249;
 //BA.debugLineNum = 36831249;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _list2idvalue(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "list2idvalue", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "list2idvalue", new Object[] {_lst,_mapvalues}));}
String _mv1 = "";
String _mv2 = "";
anywheresoftware.b4a.objects.collections.List _nlst = null;
anywheresoftware.b4a.objects.collections.Map _dict = null;
String _mk = "";
String _mv = "";
anywheresoftware.b4a.objects.collections.Map _nm = null;
RDebugUtils.currentLine=36765696;
 //BA.debugLineNum = 36765696;BA.debugLine="Sub List2IDValue(lst As List, mapValues As List) A";
RDebugUtils.currentLine=36765697;
 //BA.debugLineNum = 36765697;BA.debugLine="Dim mv1 As String = mapValues.get(0)";
_mv1 = BA.ObjectToString(_mapvalues.Get((int) (0)));
RDebugUtils.currentLine=36765698;
 //BA.debugLineNum = 36765698;BA.debugLine="Dim mv2 As String = mapValues.get(1)";
_mv2 = BA.ObjectToString(_mapvalues.Get((int) (1)));
RDebugUtils.currentLine=36765699;
 //BA.debugLineNum = 36765699;BA.debugLine="Dim nlst As List";
_nlst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=36765700;
 //BA.debugLineNum = 36765700;BA.debugLine="nlst.initialize";
_nlst.Initialize();
RDebugUtils.currentLine=36765701;
 //BA.debugLineNum = 36765701;BA.debugLine="For Each dict As Map In lst";
_dict = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group5 = _lst;
final int groupLen5 = group5.getSize()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_dict.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group5.Get(index5)));
RDebugUtils.currentLine=36765702;
 //BA.debugLineNum = 36765702;BA.debugLine="Dim mk As String = dict.get(mv1)";
_mk = BA.ObjectToString(_dict.Get((Object)(_mv1)));
RDebugUtils.currentLine=36765703;
 //BA.debugLineNum = 36765703;BA.debugLine="Dim mv As String = dict.get(mv2)";
_mv = BA.ObjectToString(_dict.Get((Object)(_mv2)));
RDebugUtils.currentLine=36765704;
 //BA.debugLineNum = 36765704;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
RDebugUtils.currentLine=36765705;
 //BA.debugLineNum = 36765705;BA.debugLine="nm.Put(\"id\", mk)";
_nm.Put((Object)("id"),(Object)(_mk));
RDebugUtils.currentLine=36765706;
 //BA.debugLineNum = 36765706;BA.debugLine="nm.put(\"value\", mv)";
_nm.Put((Object)("value"),(Object)(_mv));
RDebugUtils.currentLine=36765707;
 //BA.debugLineNum = 36765707;BA.debugLine="nlst.Add(nm)";
_nlst.Add((Object)(_nm.getObject()));
 }
};
RDebugUtils.currentLine=36765709;
 //BA.debugLineNum = 36765709;BA.debugLine="Return nlst";
if (true) return _nlst;
RDebugUtils.currentLine=36765710;
 //BA.debugLineNum = 36765710;BA.debugLine="End Sub";
return null;
}
public String  _list2json(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "list2json", true))
	 {return ((String) Debug.delegate(ba, "list2json", new Object[] {_mp}));}
com.ab.banano.BANanoJSONGenerator _json = null;
RDebugUtils.currentLine=37486592;
 //BA.debugLineNum = 37486592;BA.debugLine="Sub List2Json(mp As List) As String";
RDebugUtils.currentLine=37486593;
 //BA.debugLineNum = 37486593;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
RDebugUtils.currentLine=37486594;
 //BA.debugLineNum = 37486594;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
RDebugUtils.currentLine=37486595;
 //BA.debugLineNum = 37486595;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
RDebugUtils.currentLine=37486596;
 //BA.debugLineNum = 37486596;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _list2keyvalues(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst,anywheresoftware.b4a.objects.collections.List _mapvalues) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "list2keyvalues", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "list2keyvalues", new Object[] {_lst,_mapvalues}));}
RDebugUtils.currentLine=36700160;
 //BA.debugLineNum = 36700160;BA.debugLine="Sub List2KeyValues(lst As List, mapvalues As List)";
RDebugUtils.currentLine=36700161;
 //BA.debugLineNum = 36700161;BA.debugLine="Return List2IDValue(lst, mapvalues)";
if (true) return __ref._list2idvalue /*anywheresoftware.b4a.objects.collections.List*/ (null,_lst,_mapvalues);
RDebugUtils.currentLine=36700162;
 //BA.debugLineNum = 36700162;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2map(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "list2map", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "list2map", new Object[] {_lst,_keyname,_valuename}));}
RDebugUtils.currentLine=39976960;
 //BA.debugLineNum = 39976960;BA.debugLine="Sub List2Map(lst As List, keyName As String, value";
RDebugUtils.currentLine=39976961;
 //BA.debugLineNum = 39976961;BA.debugLine="Return List2Options(lst, keyName, valueName)";
if (true) return __ref._list2options /*anywheresoftware.b4a.objects.collections.Map*/ (null,_lst,_keyname,_valuename);
RDebugUtils.currentLine=39976962;
 //BA.debugLineNum = 39976962;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _list2options(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst,String _keyname,String _valuename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "list2options", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "list2options", new Object[] {_lst,_keyname,_valuename}));}
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
RDebugUtils.currentLine=39911424;
 //BA.debugLineNum = 39911424;BA.debugLine="Sub List2Options(lst As List, keyName As String, v";
RDebugUtils.currentLine=39911425;
 //BA.debugLineNum = 39911425;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=39911426;
 //BA.debugLineNum = 39911426;BA.debugLine="recs.Initialize";
_recs.Initialize();
RDebugUtils.currentLine=39911427;
 //BA.debugLineNum = 39911427;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=39911428;
 //BA.debugLineNum = 39911428;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
RDebugUtils.currentLine=39911429;
 //BA.debugLineNum = 39911429;BA.debugLine="nrec.Put(keyName, k)";
_nrec.Put((Object)(_keyname),(Object)(_k));
RDebugUtils.currentLine=39911430;
 //BA.debugLineNum = 39911430;BA.debugLine="nrec.Put(valueName, k)";
_nrec.Put((Object)(_valuename),(Object)(_k));
RDebugUtils.currentLine=39911431;
 //BA.debugLineNum = 39911431;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
RDebugUtils.currentLine=39911433;
 //BA.debugLineNum = 39911433;BA.debugLine="Return recs";
if (true) return (anywheresoftware.b4a.objects.collections.Map) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.Map(), (anywheresoftware.b4a.objects.collections.Map.MyMap)(_recs.getObject()));
RDebugUtils.currentLine=39911434;
 //BA.debugLineNum = 39911434;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _listremoveduplicates(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "listremoveduplicates", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "listremoveduplicates", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.Map _nd = null;
String _k = "";
anywheresoftware.b4a.objects.collections.List _nl = null;
RDebugUtils.currentLine=34668544;
 //BA.debugLineNum = 34668544;BA.debugLine="Sub ListRemoveDuplicates(lst As List) As List";
RDebugUtils.currentLine=34668545;
 //BA.debugLineNum = 34668545;BA.debugLine="Dim nd As Map = CreateMap()";
_nd = new anywheresoftware.b4a.objects.collections.Map();
_nd = __c.createMap(new Object[] {});
RDebugUtils.currentLine=34668546;
 //BA.debugLineNum = 34668546;BA.debugLine="For Each k As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=34668547;
 //BA.debugLineNum = 34668547;BA.debugLine="nd.Put(k, k)";
_nd.Put((Object)(_k),(Object)(_k));
 }
};
RDebugUtils.currentLine=34668549;
 //BA.debugLineNum = 34668549;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=34668550;
 //BA.debugLineNum = 34668550;BA.debugLine="nl.Initialize";
_nl.Initialize();
RDebugUtils.currentLine=34668551;
 //BA.debugLineNum = 34668551;BA.debugLine="For Each k As String In nd.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _nd.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=34668552;
 //BA.debugLineNum = 34668552;BA.debugLine="nl.Add(k)";
_nl.Add((Object)(_k));
 }
};
RDebugUtils.currentLine=34668554;
 //BA.debugLineNum = 34668554;BA.debugLine="nl.Sort(True)";
_nl.Sort(__c.True);
RDebugUtils.currentLine=34668555;
 //BA.debugLineNum = 34668555;BA.debugLine="Return nl";
if (true) return _nl;
RDebugUtils.currentLine=34668556;
 //BA.debugLineNum = 34668556;BA.debugLine="End Sub";
return null;
}
public String  _longdate(b4j.example.bananovue __ref,String _sdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "longdate", true))
	 {return ((String) Debug.delegate(ba, "longdate", new Object[] {_sdate}));}
long _dt = 0L;
RDebugUtils.currentLine=38207488;
 //BA.debugLineNum = 38207488;BA.debugLine="Sub LongDate(sDate As String) As String";
RDebugUtils.currentLine=38207489;
 //BA.debugLineNum = 38207489;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
RDebugUtils.currentLine=38207490;
 //BA.debugLineNum = 38207490;BA.debugLine="Try";
try {RDebugUtils.currentLine=38207491;
 //BA.debugLineNum = 38207491;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=38207492;
 //BA.debugLineNum = 38207492;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
RDebugUtils.currentLine=38207493;
 //BA.debugLineNum = 38207493;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy");
RDebugUtils.currentLine=38207494;
 //BA.debugLineNum = 38207494;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=38207496;
 //BA.debugLineNum = 38207496;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=38207498;
 //BA.debugLineNum = 38207498;BA.debugLine="End Sub";
return "";
}
public String  _longdatetime(b4j.example.bananovue __ref,String _sdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "longdatetime", true))
	 {return ((String) Debug.delegate(ba, "longdatetime", new Object[] {_sdate}));}
long _dt = 0L;
RDebugUtils.currentLine=38273024;
 //BA.debugLineNum = 38273024;BA.debugLine="Sub LongDateTime(sDate As String) As String";
RDebugUtils.currentLine=38273025;
 //BA.debugLineNum = 38273025;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
RDebugUtils.currentLine=38273026;
 //BA.debugLineNum = 38273026;BA.debugLine="Try";
try {RDebugUtils.currentLine=38273027;
 //BA.debugLineNum = 38273027;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
RDebugUtils.currentLine=38273028;
 //BA.debugLineNum = 38273028;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
RDebugUtils.currentLine=38273029;
 //BA.debugLineNum = 38273029;BA.debugLine="DateTime.DateFormat = \"EEEE, dd MMMM yyyy HH:mm\"";
__c.DateTime.setDateFormat("EEEE, dd MMMM yyyy HH:mm");
RDebugUtils.currentLine=38273030;
 //BA.debugLineNum = 38273030;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=38273032;
 //BA.debugLineNum = 38273032;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=38273034;
 //BA.debugLineNum = 38273034;BA.debugLine="End Sub";
return "";
}
public String  _longdatetimetoday(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "longdatetimetoday", true))
	 {return ((String) Debug.delegate(ba, "longdatetimetoday", null));}
long _dt = 0L;
RDebugUtils.currentLine=42008576;
 //BA.debugLineNum = 42008576;BA.debugLine="Sub LongDateTimeToday() As String";
RDebugUtils.currentLine=42008577;
 //BA.debugLineNum = 42008577;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd HH:mm\"";
__c.DateTime.setDateFormat("yyyy-MM-dd HH:mm");
RDebugUtils.currentLine=42008578;
 //BA.debugLineNum = 42008578;BA.debugLine="Dim dt As Long = DateTime.now";
_dt = __c.DateTime.getNow();
RDebugUtils.currentLine=42008579;
 //BA.debugLineNum = 42008579;BA.debugLine="DateTime.DateFormat = \"dd/MM/yyyy, HH:mm\"";
__c.DateTime.setDateFormat("dd/MM/yyyy, HH:mm");
RDebugUtils.currentLine=42008580;
 //BA.debugLineNum = 42008580;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
RDebugUtils.currentLine=42008581;
 //BA.debugLineNum = 42008581;BA.debugLine="End Sub";
return "";
}
public String  _makemoney(b4j.example.bananovue __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "makemoney", true))
	 {return ((String) Debug.delegate(ba, "makemoney", new Object[] {_svalue}));}
RDebugUtils.currentLine=37748736;
 //BA.debugLineNum = 37748736;BA.debugLine="Sub MakeMoney(sValue As String) As String";
RDebugUtils.currentLine=37748737;
 //BA.debugLineNum = 37748737;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
if (_svalue.length()==0) { 
if (true) return "0.00";};
RDebugUtils.currentLine=37748738;
 //BA.debugLineNum = 37748738;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
if ((_svalue).equals("null")) { 
_svalue = "0.00";};
RDebugUtils.currentLine=37748739;
 //BA.debugLineNum = 37748739;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
_svalue = _svalue.replace(",","");
RDebugUtils.currentLine=37748740;
 //BA.debugLineNum = 37748740;BA.debugLine="sValue = Val(sValue)";
_svalue = __ref._val /*String*/ (null,_svalue);
RDebugUtils.currentLine=37748741;
 //BA.debugLineNum = 37748741;BA.debugLine="If sValue = \"0\" Then sValue = \"000\"";
if ((_svalue).equals("0")) { 
_svalue = "000";};
RDebugUtils.currentLine=37748742;
 //BA.debugLineNum = 37748742;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(__c.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
RDebugUtils.currentLine=37748743;
 //BA.debugLineNum = 37748743;BA.debugLine="Return NumberFormat2(sValue, 1, 2, 2, True)";
if (true) return __c.NumberFormat2((double)(Double.parseDouble(_svalue)),(int) (1),(int) (2),(int) (2),__c.True);
RDebugUtils.currentLine=37748744;
 //BA.debugLineNum = 37748744;BA.debugLine="End Sub";
return "";
}
public String  _val(b4j.example.bananovue __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "val", true))
	 {return ((String) Debug.delegate(ba, "val", new Object[] {_value}));}
String _sout = "";
String _mout = "";
int _slen = 0;
int _i = 0;
RDebugUtils.currentLine=36569088;
 //BA.debugLineNum = 36569088;BA.debugLine="Public Sub Val(value As String) As String";
RDebugUtils.currentLine=36569089;
 //BA.debugLineNum = 36569089;BA.debugLine="value = CStr(value)";
_value = __ref._cstr /*String*/ (null,(Object)(_value));
RDebugUtils.currentLine=36569090;
 //BA.debugLineNum = 36569090;BA.debugLine="Try";
try {RDebugUtils.currentLine=36569091;
 //BA.debugLineNum = 36569091;BA.debugLine="value = value.Trim";
_value = _value.trim();
RDebugUtils.currentLine=36569092;
 //BA.debugLineNum = 36569092;BA.debugLine="If value = \"\" Then value = \"0\"";
if ((_value).equals("")) { 
_value = "0";};
RDebugUtils.currentLine=36569093;
 //BA.debugLineNum = 36569093;BA.debugLine="Dim sout As String = \"\"";
_sout = "";
RDebugUtils.currentLine=36569094;
 //BA.debugLineNum = 36569094;BA.debugLine="Dim mout As String = \"\"";
_mout = "";
RDebugUtils.currentLine=36569095;
 //BA.debugLineNum = 36569095;BA.debugLine="Dim slen As Int = value.Length";
_slen = _value.length();
RDebugUtils.currentLine=36569096;
 //BA.debugLineNum = 36569096;BA.debugLine="Dim i As Int = 0";
_i = (int) (0);
RDebugUtils.currentLine=36569097;
 //BA.debugLineNum = 36569097;BA.debugLine="For i = 0 To slen - 1";
{
final int step9 = 1;
final int limit9 = (int) (_slen-1);
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=36569098;
 //BA.debugLineNum = 36569098;BA.debugLine="mout = value.CharAt(i)";
_mout = BA.ObjectToString(_value.charAt(_i));
RDebugUtils.currentLine=36569099;
 //BA.debugLineNum = 36569099;BA.debugLine="If InStr(\"0123456789.-\", mout) <> -1 Then";
if (__ref._instr /*int*/ (null,"0123456789.-",_mout)!=-1) { 
RDebugUtils.currentLine=36569100;
 //BA.debugLineNum = 36569100;BA.debugLine="sout = sout & mout";
_sout = _sout+_mout;
 };
 }
};
RDebugUtils.currentLine=36569103;
 //BA.debugLineNum = 36569103;BA.debugLine="Return sout";
if (true) return _sout;
 } 
       catch (Exception e17) {
			ba.setLastException(e17);RDebugUtils.currentLine=36569105;
 //BA.debugLineNum = 36569105;BA.debugLine="Return value";
if (true) return _value;
 };
RDebugUtils.currentLine=36569107;
 //BA.debugLineNum = 36569107;BA.debugLine="End Sub";
return "";
}
public String  _map2jsonpretty(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "map2jsonpretty", true))
	 {return ((String) Debug.delegate(ba, "map2jsonpretty", new Object[] {_mp}));}
com.ab.banano.BANanoJSONGenerator _json = null;
RDebugUtils.currentLine=37027840;
 //BA.debugLineNum = 37027840;BA.debugLine="Sub Map2JsonPretty(mp As Map) As String";
RDebugUtils.currentLine=37027841;
 //BA.debugLineNum = 37027841;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
RDebugUtils.currentLine=37027842;
 //BA.debugLineNum = 37027842;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
RDebugUtils.currentLine=37027843;
 //BA.debugLineNum = 37027843;BA.debugLine="Return JSON.ToPrettyString(4)";
if (true) return _json.ToPrettyString((int) (4));
RDebugUtils.currentLine=37027844;
 //BA.debugLineNum = 37027844;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _mapkeys2list(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "mapkeys2list", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "mapkeys2list", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
RDebugUtils.currentLine=35586048;
 //BA.debugLineNum = 35586048;BA.debugLine="Sub MapKeys2List(m As Map) As List";
RDebugUtils.currentLine=35586049;
 //BA.debugLineNum = 35586049;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35586050;
 //BA.debugLineNum = 35586050;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=35586051;
 //BA.debugLineNum = 35586051;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=35586052;
 //BA.debugLineNum = 35586052;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
RDebugUtils.currentLine=35586054;
 //BA.debugLineNum = 35586054;BA.debugLine="Return lst";
if (true) return _lst;
RDebugUtils.currentLine=35586055;
 //BA.debugLineNum = 35586055;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapkeyslowercaselist(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "mapkeyslowercaselist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "mapkeyslowercaselist", new Object[] {_lst}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
anywheresoftware.b4a.objects.collections.Map _rec = null;
RDebugUtils.currentLine=38797312;
 //BA.debugLineNum = 38797312;BA.debugLine="Sub MapKeysLowerCaseList(lst As List) As List";
RDebugUtils.currentLine=38797313;
 //BA.debugLineNum = 38797313;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=38797314;
 //BA.debugLineNum = 38797314;BA.debugLine="nl.Initialize";
_nl.Initialize();
RDebugUtils.currentLine=38797315;
 //BA.debugLineNum = 38797315;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group3 = _lst;
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group3.Get(index3)));
RDebugUtils.currentLine=38797316;
 //BA.debugLineNum = 38797316;BA.debugLine="rec = MapKeysLowerCaseSingle(rec)";
_rec = __ref._mapkeyslowercasesingle /*anywheresoftware.b4a.objects.collections.Map*/ (null,_rec);
RDebugUtils.currentLine=38797317;
 //BA.debugLineNum = 38797317;BA.debugLine="nl.Add(rec)";
_nl.Add((Object)(_rec.getObject()));
 }
};
RDebugUtils.currentLine=38797319;
 //BA.debugLineNum = 38797319;BA.debugLine="Return nl";
if (true) return _nl;
RDebugUtils.currentLine=38797320;
 //BA.debugLineNum = 38797320;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _mapkeyslowercasesingle(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "mapkeyslowercasesingle", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "mapkeyslowercasesingle", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=38731776;
 //BA.debugLineNum = 38731776;BA.debugLine="Sub MapKeysLowerCaseSingle(m As Map) As Map";
RDebugUtils.currentLine=38731777;
 //BA.debugLineNum = 38731777;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
RDebugUtils.currentLine=38731778;
 //BA.debugLineNum = 38731778;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _m.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=38731779;
 //BA.debugLineNum = 38731779;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=38731780;
 //BA.debugLineNum = 38731780;BA.debugLine="k = k.tolowercase";
_k = _k.toLowerCase();
RDebugUtils.currentLine=38731781;
 //BA.debugLineNum = 38731781;BA.debugLine="nm.Put(k, v)";
_nm.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=38731783;
 //BA.debugLineNum = 38731783;BA.debugLine="Return nm";
if (true) return _nm;
RDebugUtils.currentLine=38731784;
 //BA.debugLineNum = 38731784;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _mapvalues2list(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "mapvalues2list", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "mapvalues2list", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
String _k = "";
RDebugUtils.currentLine=35651584;
 //BA.debugLineNum = 35651584;BA.debugLine="Sub MapValues2List(m As Map) As List";
RDebugUtils.currentLine=35651585;
 //BA.debugLineNum = 35651585;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=35651586;
 //BA.debugLineNum = 35651586;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=35651587;
 //BA.debugLineNum = 35651587;BA.debugLine="For Each k As String In m.values";
{
final anywheresoftware.b4a.BA.IterableList group3 = _m.Values();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=35651588;
 //BA.debugLineNum = 35651588;BA.debugLine="lst.Add(k)";
_lst.Add((Object)(_k));
 }
};
RDebugUtils.currentLine=35651590;
 //BA.debugLineNum = 35651590;BA.debugLine="Return lst";
if (true) return _lst;
RDebugUtils.currentLine=35651591;
 //BA.debugLineNum = 35651591;BA.debugLine="End Sub";
return null;
}
public String  _midstring(b4j.example.bananovue __ref,String _text,int _start,int _llength) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "midstring", true))
	 {return ((String) Debug.delegate(ba, "midstring", new Object[] {_text,_start,_llength}));}
RDebugUtils.currentLine=37879808;
 //BA.debugLineNum = 37879808;BA.debugLine="Sub MidString(Text As String, Start As Int, lLengt";
RDebugUtils.currentLine=37879809;
 //BA.debugLineNum = 37879809;BA.debugLine="Return Text.SubString2(Start-1,Start+lLength-1)";
if (true) return _text.substring((int) (_start-1),(int) (_start+_llength-1));
RDebugUtils.currentLine=37879810;
 //BA.debugLineNum = 37879810;BA.debugLine="End Sub";
return "";
}
public String  _midstring2(b4j.example.bananovue __ref,String _text,int _start) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "midstring2", true))
	 {return ((String) Debug.delegate(ba, "midstring2", new Object[] {_text,_start}));}
RDebugUtils.currentLine=37945344;
 //BA.debugLineNum = 37945344;BA.debugLine="Sub MidString2(Text As String, Start As Int) As St";
RDebugUtils.currentLine=37945345;
 //BA.debugLineNum = 37945345;BA.debugLine="Return Text.SubString(Start-1)";
if (true) return _text.substring((int) (_start-1));
RDebugUtils.currentLine=37945346;
 //BA.debugLineNum = 37945346;BA.debugLine="End Sub";
return "";
}
public int  _mvcount(b4j.example.bananovue __ref,String _strmv,String _delimiter) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "mvcount", true))
	 {return ((Integer) Debug.delegate(ba, "mvcount", new Object[] {_strmv,_delimiter}));}
String[] _spvalues = null;
RDebugUtils.currentLine=41353216;
 //BA.debugLineNum = 41353216;BA.debugLine="Sub MvCount(strMV As String, Delimiter As String)";
RDebugUtils.currentLine=41353217;
 //BA.debugLineNum = 41353217;BA.debugLine="Dim spValues() As String = BANAno.Split(Delimiter";
_spvalues = __ref._banano /*com.ab.banano.BANano*/ .Split(_delimiter,_strmv);
RDebugUtils.currentLine=41353218;
 //BA.debugLineNum = 41353218;BA.debugLine="Return spValues.Length";
if (true) return _spvalues.length;
RDebugUtils.currentLine=41353219;
 //BA.debugLineNum = 41353219;BA.debugLine="End Sub";
return 0;
}
public com.ab.banano.BANanoObject  _newdate(b4j.example.bananovue __ref,int _year,int _month,int _day) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "newdate", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "newdate", new Object[] {_year,_month,_day}));}
com.ab.banano.BANanoObject _dd = null;
RDebugUtils.currentLine=37158912;
 //BA.debugLineNum = 37158912;BA.debugLine="Sub NewDate(year As Int, month As Int, day As Int)";
RDebugUtils.currentLine=37158913;
 //BA.debugLineNum = 37158913;BA.debugLine="Dim dd As BANanoObject";
_dd = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=37158914;
 //BA.debugLineNum = 37158914;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day))";
_dd.Initialize2("Date",(Object)(new Object[]{(Object)(_year),(Object)(_month),(Object)(_day)}));
RDebugUtils.currentLine=37158915;
 //BA.debugLineNum = 37158915;BA.debugLine="Return dd";
if (true) return _dd;
RDebugUtils.currentLine=37158916;
 //BA.debugLineNum = 37158916;BA.debugLine="End Sub";
return null;
}
public com.ab.banano.BANanoObject  _newdatetime(b4j.example.bananovue __ref,int _year,int _month,int _day,int _hour,int _minute) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "newdatetime", true))
	 {return ((com.ab.banano.BANanoObject) Debug.delegate(ba, "newdatetime", new Object[] {_year,_month,_day,_hour,_minute}));}
com.ab.banano.BANanoObject _dd = null;
RDebugUtils.currentLine=37224448;
 //BA.debugLineNum = 37224448;BA.debugLine="Sub NewDateTime(year As Int, month As Int, day As";
RDebugUtils.currentLine=37224449;
 //BA.debugLineNum = 37224449;BA.debugLine="Dim dd As BANanoObject";
_dd = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=37224450;
 //BA.debugLineNum = 37224450;BA.debugLine="dd.Initialize2(\"Date\", Array(year, month, day, ho";
_dd.Initialize2("Date",(Object)(new Object[]{(Object)(_year),(Object)(_month),(Object)(_day),(Object)(_hour),(Object)(_minute)}));
RDebugUtils.currentLine=37224451;
 //BA.debugLineNum = 37224451;BA.debugLine="Return dd";
if (true) return _dd;
RDebugUtils.currentLine=37224452;
 //BA.debugLineNum = 37224452;BA.debugLine="End Sub";
return null;
}
public String  _numbersuffix(b4j.example.bananovue __ref,double _n) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "numbersuffix", true))
	 {return ((String) Debug.delegate(ba, "numbersuffix", new Object[] {_n}));}
String[] _suffix = null;
int _thousands = 0;
int _maxdecimalplaces = 0;
double _relativeerror = 0;
RDebugUtils.currentLine=37683200;
 //BA.debugLineNum = 37683200;BA.debugLine="Sub NumberSuffix(N As Double) As String";
RDebugUtils.currentLine=37683201;
 //BA.debugLineNum = 37683201;BA.debugLine="If N < 0 Then";
if (_n<0) { 
RDebugUtils.currentLine=37683202;
 //BA.debugLineNum = 37683202;BA.debugLine="Return \"-\" & NumberSuffix(-N)";
if (true) return "-"+__ref._numbersuffix /*String*/ (null,-_n);
 };
RDebugUtils.currentLine=37683204;
 //BA.debugLineNum = 37683204;BA.debugLine="Dim Suffix() As String = Array As String(\"\", \"k\",";
_suffix = new String[]{"","k","M","B","T"};
RDebugUtils.currentLine=37683205;
 //BA.debugLineNum = 37683205;BA.debugLine="Dim Thousands As Int = 0";
_thousands = (int) (0);
RDebugUtils.currentLine=37683206;
 //BA.debugLineNum = 37683206;BA.debugLine="Do While N >= 1000 And Thousands < Suffix.Length";
while (_n>=1000 && _thousands<_suffix.length-1) {
RDebugUtils.currentLine=37683207;
 //BA.debugLineNum = 37683207;BA.debugLine="Thousands = Thousands + 1";
_thousands = (int) (_thousands+1);
RDebugUtils.currentLine=37683208;
 //BA.debugLineNum = 37683208;BA.debugLine="N = N / 1000";
_n = _n/(double)1000;
 }
;
RDebugUtils.currentLine=37683210;
 //BA.debugLineNum = 37683210;BA.debugLine="If Thousands = 0 Then";
if (_thousands==0) { 
RDebugUtils.currentLine=37683211;
 //BA.debugLineNum = 37683211;BA.debugLine="Return NumberFormat2(N, 1, 2, 2, False)";
if (true) return __c.NumberFormat2(_n,(int) (1),(int) (2),(int) (2),__c.False);
 };
RDebugUtils.currentLine=37683214;
 //BA.debugLineNum = 37683214;BA.debugLine="Dim MaxDecimalPlaces As Int = 0";
_maxdecimalplaces = (int) (0);
RDebugUtils.currentLine=37683215;
 //BA.debugLineNum = 37683215;BA.debugLine="Do While MaxDecimalPlaces < 5";
while (_maxdecimalplaces<5) {
RDebugUtils.currentLine=37683216;
 //BA.debugLineNum = 37683216;BA.debugLine="Dim RelativeError As Double = Abs(N - Round2(N,";
_relativeerror = __c.Abs(_n-__c.Round2(_n,_maxdecimalplaces))/(double)_n;
RDebugUtils.currentLine=37683217;
 //BA.debugLineNum = 37683217;BA.debugLine="If RelativeError < 0.007 Then";
if (_relativeerror<0.007) { 
RDebugUtils.currentLine=37683218;
 //BA.debugLineNum = 37683218;BA.debugLine="Exit";
if (true) break;
 };
RDebugUtils.currentLine=37683220;
 //BA.debugLineNum = 37683220;BA.debugLine="MaxDecimalPlaces = MaxDecimalPlaces + 1";
_maxdecimalplaces = (int) (_maxdecimalplaces+1);
 }
;
RDebugUtils.currentLine=37683222;
 //BA.debugLineNum = 37683222;BA.debugLine="Return NumberFormat2(N, 1, 0, MaxDecimalPlaces, F";
if (true) return __c.NumberFormat2(_n,(int) (1),(int) (0),_maxdecimalplaces,__c.False)+_suffix[_thousands];
RDebugUtils.currentLine=37683223;
 //BA.debugLineNum = 37683223;BA.debugLine="End Sub";
return "";
}
public String  _pad(b4j.example.bananovue __ref,String _value,int _maxlen,String _padchar,boolean _right) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "pad", true))
	 {return ((String) Debug.delegate(ba, "pad", new Object[] {_value,_maxlen,_padchar,_right}));}
int _intordnolen = 0;
int _i = 0;
RDebugUtils.currentLine=37289984;
 //BA.debugLineNum = 37289984;BA.debugLine="Sub Pad(Value As String, MaxLen As Int, PadChar As";
RDebugUtils.currentLine=37289985;
 //BA.debugLineNum = 37289985;BA.debugLine="Dim  intOrdNoLen As Int = Value.Length";
_intordnolen = _value.length();
RDebugUtils.currentLine=37289986;
 //BA.debugLineNum = 37289986;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=37289987;
 //BA.debugLineNum = 37289987;BA.debugLine="For i = 1 To (MaxLen - intOrdNoLen) Step 1";
{
final int step3 = 1;
final int limit3 = (int) ((_maxlen-_intordnolen));
_i = (int) (1) ;
for (;_i <= limit3 ;_i = _i + step3 ) {
RDebugUtils.currentLine=37289988;
 //BA.debugLineNum = 37289988;BA.debugLine="If right Then";
if (_right) { 
RDebugUtils.currentLine=37289989;
 //BA.debugLineNum = 37289989;BA.debugLine="Value =  Value & PadChar";
_value = _value+_padchar;
 }else {
RDebugUtils.currentLine=37289991;
 //BA.debugLineNum = 37289991;BA.debugLine="Value = PadChar & Value";
_value = _padchar+_value;
 };
 }
};
RDebugUtils.currentLine=37289994;
 //BA.debugLineNum = 37289994;BA.debugLine="Return Value";
if (true) return _value;
RDebugUtils.currentLine=37289995;
 //BA.debugLineNum = 37289995;BA.debugLine="End Sub";
return "";
}
public String  _percentage(b4j.example.bananovue __ref,String _svalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "percentage", true))
	 {return ((String) Debug.delegate(ba, "percentage", new Object[] {_svalue}));}
RDebugUtils.currentLine=37814272;
 //BA.debugLineNum = 37814272;BA.debugLine="Sub Percentage(sValue As String) As String";
RDebugUtils.currentLine=37814273;
 //BA.debugLineNum = 37814273;BA.debugLine="If sValue = \"\" Then sValue = \"0.00\"";
if ((_svalue).equals("")) { 
_svalue = "0.00";};
RDebugUtils.currentLine=37814274;
 //BA.debugLineNum = 37814274;BA.debugLine="If sValue.Length = 0 Then Return \"0.00\"";
if (_svalue.length()==0) { 
if (true) return "0.00";};
RDebugUtils.currentLine=37814275;
 //BA.debugLineNum = 37814275;BA.debugLine="If sValue = \"null\" Then sValue = \"0.00\"";
if ((_svalue).equals("null")) { 
_svalue = "0.00";};
RDebugUtils.currentLine=37814276;
 //BA.debugLineNum = 37814276;BA.debugLine="sValue = sValue.Replace(\",\",\"\")";
_svalue = _svalue.replace(",","");
RDebugUtils.currentLine=37814277;
 //BA.debugLineNum = 37814277;BA.debugLine="sValue = Val(sValue)";
_svalue = __ref._val /*String*/ (null,_svalue);
RDebugUtils.currentLine=37814278;
 //BA.debugLineNum = 37814278;BA.debugLine="If sValue = \"0\" Then sValue = \"0.00\"";
if ((_svalue).equals("0")) { 
_svalue = "0.00";};
RDebugUtils.currentLine=37814279;
 //BA.debugLineNum = 37814279;BA.debugLine="sValue = Round2(sValue,2)";
_svalue = BA.NumberToString(__c.Round2((double)(Double.parseDouble(_svalue)),(int) (2)));
RDebugUtils.currentLine=37814280;
 //BA.debugLineNum = 37814280;BA.debugLine="sValue = sValue & \"%\"";
_svalue = _svalue+"%";
RDebugUtils.currentLine=37814281;
 //BA.debugLineNum = 37814281;BA.debugLine="Return sValue";
if (true) return _svalue;
RDebugUtils.currentLine=37814282;
 //BA.debugLineNum = 37814282;BA.debugLine="End Sub";
return "";
}
public String  _priorityrag(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "priorityrag", true))
	 {return ((String) Debug.delegate(ba, "priorityrag", new Object[] {_dvalue}));}
RDebugUtils.currentLine=47710208;
 //BA.debugLineNum = 47710208;BA.debugLine="Public Sub PriorityRAG(dValue As Int) As String";
RDebugUtils.currentLine=47710209;
 //BA.debugLineNum = 47710209;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
RDebugUtils.currentLine=47710211;
 //BA.debugLineNum = 47710211;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
case 1: {
RDebugUtils.currentLine=47710213;
 //BA.debugLineNum = 47710213;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
RDebugUtils.currentLine=47710215;
 //BA.debugLineNum = 47710215;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
default: {
RDebugUtils.currentLine=47710217;
 //BA.debugLineNum = 47710217;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
RDebugUtils.currentLine=47710219;
 //BA.debugLineNum = 47710219;BA.debugLine="End Sub";
return "";
}
public String  _progressrag(b4j.example.bananovue __ref,double _dvariance) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "progressrag", true))
	 {return ((String) Debug.delegate(ba, "progressrag", new Object[] {_dvariance}));}
RDebugUtils.currentLine=47513600;
 //BA.debugLineNum = 47513600;BA.debugLine="Public Sub ProgressRAG(dVariance As Double) As Str";
RDebugUtils.currentLine=47513601;
 //BA.debugLineNum = 47513601;BA.debugLine="If dVariance < 0 Then";
if (_dvariance<0) { 
RDebugUtils.currentLine=47513602;
 //BA.debugLineNum = 47513602;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 }else 
{RDebugUtils.currentLine=47513603;
 //BA.debugLineNum = 47513603;BA.debugLine="else if dVariance > 0 Then";
if (_dvariance>0) { 
RDebugUtils.currentLine=47513604;
 //BA.debugLineNum = 47513604;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 }else 
{RDebugUtils.currentLine=47513605;
 //BA.debugLineNum = 47513605;BA.debugLine="else if dVariance = 0 Then";
if (_dvariance==0) { 
RDebugUtils.currentLine=47513606;
 //BA.debugLineNum = 47513606;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 }else {
RDebugUtils.currentLine=47513608;
 //BA.debugLineNum = 47513608;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 }}}
;
RDebugUtils.currentLine=47513610;
 //BA.debugLineNum = 47513610;BA.debugLine="End Sub";
return "";
}
public int  _progressstatus(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "progressstatus", true))
	 {return ((Integer) Debug.delegate(ba, "progressstatus", new Object[] {_dvalue}));}
RDebugUtils.currentLine=48234496;
 //BA.debugLineNum = 48234496;BA.debugLine="Public Sub ProgressStatus(dValue As Int) As Int";
RDebugUtils.currentLine=48234497;
 //BA.debugLineNum = 48234497;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 100: {
RDebugUtils.currentLine=48234499;
 //BA.debugLineNum = 48234499;BA.debugLine="Return 1";
if (true) return (int) (1);
 break; }
default: {
RDebugUtils.currentLine=48234501;
 //BA.debugLineNum = 48234501;BA.debugLine="Return 0";
if (true) return (int) (0);
 break; }
}
;
RDebugUtils.currentLine=48234503;
 //BA.debugLineNum = 48234503;BA.debugLine="End Sub";
return 0;
}
public String  _projectdate(b4j.example.bananovue __ref,String _sdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "projectdate", true))
	 {return ((String) Debug.delegate(ba, "projectdate", new Object[] {_sdate}));}
long _dt = 0L;
RDebugUtils.currentLine=36175872;
 //BA.debugLineNum = 36175872;BA.debugLine="Sub ProjectDate(sDate As String) As String";
RDebugUtils.currentLine=36175873;
 //BA.debugLineNum = 36175873;BA.debugLine="If sDate.Length = 0 Then Return \"\"";
if (_sdate.length()==0) { 
if (true) return "";};
RDebugUtils.currentLine=36175874;
 //BA.debugLineNum = 36175874;BA.debugLine="Try";
try {RDebugUtils.currentLine=36175875;
 //BA.debugLineNum = 36175875;BA.debugLine="DateTime.DateFormat = \"yyyy-MM-dd\"";
__c.DateTime.setDateFormat("yyyy-MM-dd");
RDebugUtils.currentLine=36175876;
 //BA.debugLineNum = 36175876;BA.debugLine="Dim dt As Long = DateTime.DateParse(sDate)";
_dt = __c.DateTime.DateParse(_sdate);
RDebugUtils.currentLine=36175877;
 //BA.debugLineNum = 36175877;BA.debugLine="DateTime.DateFormat = \"dd-MMM-yyyy, EEE\"";
__c.DateTime.setDateFormat("dd-MMM-yyyy, EEE");
RDebugUtils.currentLine=36175878;
 //BA.debugLineNum = 36175878;BA.debugLine="Return DateTime.Date(dt)";
if (true) return __c.DateTime.Date(_dt);
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=36175880;
 //BA.debugLineNum = 36175880;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=36175882;
 //BA.debugLineNum = 36175882;BA.debugLine="End Sub";
return "";
}
public String  _projectdays(b4j.example.bananovue __ref,String _sdays) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "projectdays", true))
	 {return ((String) Debug.delegate(ba, "projectdays", new Object[] {_sdays}));}
RDebugUtils.currentLine=36110336;
 //BA.debugLineNum = 36110336;BA.debugLine="Sub ProjectDays(sDays As String) As String";
RDebugUtils.currentLine=36110337;
 //BA.debugLineNum = 36110337;BA.debugLine="Try";
try {RDebugUtils.currentLine=36110338;
 //BA.debugLineNum = 36110338;BA.debugLine="sDays = sDays.trim";
_sdays = _sdays.trim();
RDebugUtils.currentLine=36110339;
 //BA.debugLineNum = 36110339;BA.debugLine="If sDays = \"\" Then sDays = \"0\"";
if ((_sdays).equals("")) { 
_sdays = "0";};
RDebugUtils.currentLine=36110340;
 //BA.debugLineNum = 36110340;BA.debugLine="sDays = sDays.Replace(\",\",\"\")";
_sdays = _sdays.replace(",","");
RDebugUtils.currentLine=36110341;
 //BA.debugLineNum = 36110341;BA.debugLine="sDays = NumberFormat2(sDays,0,0,0,True)";
_sdays = __c.NumberFormat2((double)(Double.parseDouble(_sdays)),(int) (0),(int) (0),(int) (0),__c.True);
RDebugUtils.currentLine=36110342;
 //BA.debugLineNum = 36110342;BA.debugLine="Return sDays & \" Dys\"";
if (true) return _sdays+" Dys";
 } 
       catch (Exception e8) {
			ba.setLastException(e8);RDebugUtils.currentLine=36110344;
 //BA.debugLineNum = 36110344;BA.debugLine="Return \"0 Dys\"";
if (true) return "0 Dys";
 };
RDebugUtils.currentLine=36110346;
 //BA.debugLineNum = 36110346;BA.debugLine="End Sub";
return "";
}
public String  _propercase(b4j.example.bananovue __ref,String _mystr) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "propercase", true))
	 {return ((String) Debug.delegate(ba, "propercase", new Object[] {_mystr}));}
String _x = "";
int _j = 0;
int _k = 0;
RDebugUtils.currentLine=38600704;
 //BA.debugLineNum = 38600704;BA.debugLine="Sub ProperCase(myStr As String) As String";
RDebugUtils.currentLine=38600705;
 //BA.debugLineNum = 38600705;BA.debugLine="Try";
try {RDebugUtils.currentLine=38600706;
 //BA.debugLineNum = 38600706;BA.debugLine="If myStr.trim.length = 0 Then Return \"\"";
if (_mystr.trim().length()==0) { 
if (true) return "";};
RDebugUtils.currentLine=38600707;
 //BA.debugLineNum = 38600707;BA.debugLine="Dim x As String";
_x = "";
RDebugUtils.currentLine=38600708;
 //BA.debugLineNum = 38600708;BA.debugLine="Dim j, k As Int";
_j = 0;
_k = 0;
RDebugUtils.currentLine=38600709;
 //BA.debugLineNum = 38600709;BA.debugLine="myStr = myStr.tolowercase";
_mystr = _mystr.toLowerCase();
RDebugUtils.currentLine=38600710;
 //BA.debugLineNum = 38600710;BA.debugLine="x = myStr.ToUpperCase.CharAt(0)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (0)));
RDebugUtils.currentLine=38600711;
 //BA.debugLineNum = 38600711;BA.debugLine="myStr = x & myStr.SubString2(1, myStr.Length)";
_mystr = _x+_mystr.substring((int) (1),_mystr.length());
RDebugUtils.currentLine=38600712;
 //BA.debugLineNum = 38600712;BA.debugLine="For j = 1 To myStr.Length";
{
final int step8 = 1;
final int limit8 = _mystr.length();
_j = (int) (1) ;
for (;_j <= limit8 ;_j = _j + step8 ) {
RDebugUtils.currentLine=38600713;
 //BA.debugLineNum = 38600713;BA.debugLine="k = myStr.IndexOf2(\" \", j + 1)";
_k = _mystr.indexOf(" ",(int) (_j+1));
RDebugUtils.currentLine=38600714;
 //BA.debugLineNum = 38600714;BA.debugLine="If k = -1 Then Exit";
if (_k==-1) { 
if (true) break;};
RDebugUtils.currentLine=38600715;
 //BA.debugLineNum = 38600715;BA.debugLine="x = myStr.ToUpperCase.CharAt(k + 1)";
_x = BA.ObjectToString(_mystr.toUpperCase().charAt((int) (_k+1)));
RDebugUtils.currentLine=38600716;
 //BA.debugLineNum = 38600716;BA.debugLine="myStr = myStr.SubString2(0, k + 1) & x & myStr.";
_mystr = _mystr.substring((int) (0),(int) (_k+1))+_x+_mystr.substring((int) (_k+2),_mystr.length());
 }
};
RDebugUtils.currentLine=38600718;
 //BA.debugLineNum = 38600718;BA.debugLine="Return myStr";
if (true) return _mystr;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=38600720;
 //BA.debugLineNum = 38600720;BA.debugLine="Return myStr";
if (true) return _mystr;
 };
RDebugUtils.currentLine=38600722;
 //BA.debugLineNum = 38600722;BA.debugLine="End Sub";
return "";
}
public String  _rag(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "rag", true))
	 {return ((String) Debug.delegate(ba, "rag", new Object[] {_dvalue}));}
RDebugUtils.currentLine=47775744;
 //BA.debugLineNum = 47775744;BA.debugLine="Public Sub RAG(dValue As Int) As String";
RDebugUtils.currentLine=47775745;
 //BA.debugLineNum = 47775745;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
RDebugUtils.currentLine=47775747;
 //BA.debugLineNum = 47775747;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
RDebugUtils.currentLine=47775749;
 //BA.debugLineNum = 47775749;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
RDebugUtils.currentLine=47775751;
 //BA.debugLineNum = 47775751;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
RDebugUtils.currentLine=47775753;
 //BA.debugLineNum = 47775753;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
RDebugUtils.currentLine=47775755;
 //BA.debugLineNum = 47775755;BA.debugLine="End Sub";
return "";
}
public String  _ramovefromlist(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _listx,String _item) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "ramovefromlist", true))
	 {return ((String) Debug.delegate(ba, "ramovefromlist", new Object[] {_listx,_item}));}
int _li = 0;
RDebugUtils.currentLine=44236800;
 //BA.debugLineNum = 44236800;BA.debugLine="Sub RamoveFromList(listX As List, item As String)";
RDebugUtils.currentLine=44236801;
 //BA.debugLineNum = 44236801;BA.debugLine="Dim li As Int = listX.IndexOf(item)";
_li = _listx.IndexOf((Object)(_item));
RDebugUtils.currentLine=44236802;
 //BA.debugLineNum = 44236802;BA.debugLine="If li >= 0 Then listX.RemoveAt(li)";
if (_li>=0) { 
_listx.RemoveAt(_li);};
RDebugUtils.currentLine=44236803;
 //BA.debugLineNum = 44236803;BA.debugLine="End Sub";
return "";
}
public Object  _randlistvalue(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _listx) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "randlistvalue", true))
	 {return ((Object) Debug.delegate(ba, "randlistvalue", new Object[] {_listx}));}
RDebugUtils.currentLine=44171264;
 //BA.debugLineNum = 44171264;BA.debugLine="Sub RandListValue(ListX As List) As Object";
RDebugUtils.currentLine=44171265;
 //BA.debugLineNum = 44171265;BA.debugLine="ShuffleList(ListX)";
__ref._shufflelist /*anywheresoftware.b4a.objects.collections.List*/ (null,_listx);
RDebugUtils.currentLine=44171266;
 //BA.debugLineNum = 44171266;BA.debugLine="Return ListX.Get(Rnd(0, ListX.Size -1))";
if (true) return _listx.Get(__c.Rnd((int) (0),(int) (_listx.getSize()-1)));
RDebugUtils.currentLine=44171267;
 //BA.debugLineNum = 44171267;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _shufflelist(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _pl) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "shufflelist", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "shufflelist", new Object[] {_pl}));}
int _i = 0;
int _j = 0;
Object _k = null;
RDebugUtils.currentLine=44302336;
 //BA.debugLineNum = 44302336;BA.debugLine="Sub ShuffleList(pl As List) As List";
RDebugUtils.currentLine=44302337;
 //BA.debugLineNum = 44302337;BA.debugLine="For i = pl.Size - 1 To 0 Step -1";
{
final int step1 = -1;
final int limit1 = (int) (0);
_i = (int) (_pl.getSize()-1) ;
for (;_i >= limit1 ;_i = _i + step1 ) {
RDebugUtils.currentLine=44302338;
 //BA.debugLineNum = 44302338;BA.debugLine="Dim j As Int";
_j = 0;
RDebugUtils.currentLine=44302339;
 //BA.debugLineNum = 44302339;BA.debugLine="Dim k As Object";
_k = new Object();
RDebugUtils.currentLine=44302340;
 //BA.debugLineNum = 44302340;BA.debugLine="j = Rnd(0, i + 1)";
_j = __c.Rnd((int) (0),(int) (_i+1));
RDebugUtils.currentLine=44302341;
 //BA.debugLineNum = 44302341;BA.debugLine="k = pl.Get(j)";
_k = _pl.Get(_j);
RDebugUtils.currentLine=44302342;
 //BA.debugLineNum = 44302342;BA.debugLine="pl.Set(j,pl.Get(i))";
_pl.Set(_j,_pl.Get(_i));
RDebugUtils.currentLine=44302343;
 //BA.debugLineNum = 44302343;BA.debugLine="pl.Set(i,k)";
_pl.Set(_i,_k);
 }
};
RDebugUtils.currentLine=44302345;
 //BA.debugLineNum = 44302345;BA.debugLine="Return pl";
if (true) return _pl;
RDebugUtils.currentLine=44302346;
 //BA.debugLineNum = 44302346;BA.debugLine="End Sub";
return null;
}
public String  _replacestring(b4j.example.bananovue __ref,String _text,String _sfind,String _sreplacewith) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "replacestring", true))
	 {return ((String) Debug.delegate(ba, "replacestring", new Object[] {_text,_sfind,_sreplacewith}));}
RDebugUtils.currentLine=38141952;
 //BA.debugLineNum = 38141952;BA.debugLine="Sub ReplaceString(Text As String, sFind As String,";
RDebugUtils.currentLine=38141953;
 //BA.debugLineNum = 38141953;BA.debugLine="Return Text.Replace(sFind, sReplaceWith)";
if (true) return _text.replace(_sfind,_sreplacewith);
RDebugUtils.currentLine=38141954;
 //BA.debugLineNum = 38141954;BA.debugLine="End Sub";
return "";
}
public String  _rightstring(b4j.example.bananovue __ref,String _text,long _llength) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "rightstring", true))
	 {return ((String) Debug.delegate(ba, "rightstring", new Object[] {_text,_llength}));}
RDebugUtils.currentLine=38010880;
 //BA.debugLineNum = 38010880;BA.debugLine="Sub RightString(Text As String, lLength As Long) A";
RDebugUtils.currentLine=38010881;
 //BA.debugLineNum = 38010881;BA.debugLine="If lLength>Text.Length Then lLength=Text.Length";
if (_llength>_text.length()) { 
_llength = (long) (_text.length());};
RDebugUtils.currentLine=38010882;
 //BA.debugLineNum = 38010882;BA.debugLine="Return Text.SubString(Text.Length-lLength)";
if (true) return _text.substring((int) (_text.length()-_llength));
RDebugUtils.currentLine=38010883;
 //BA.debugLineNum = 38010883;BA.debugLine="End Sub";
return "";
}
public String  _rsaidnumber2dateofbirth(b4j.example.bananovue __ref,String _rsaid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "rsaidnumber2dateofbirth", true))
	 {return ((String) Debug.delegate(ba, "rsaidnumber2dateofbirth", new Object[] {_rsaid}));}
String _yymmdd = "";
String _yy = "";
String _mm = "";
String _dd = "";
RDebugUtils.currentLine=35717120;
 //BA.debugLineNum = 35717120;BA.debugLine="Sub RSAIDNumber2DateOfBirth(rsaID As String) As St";
RDebugUtils.currentLine=35717122;
 //BA.debugLineNum = 35717122;BA.debugLine="If rsaID.length = 13 Then";
if (_rsaid.length()==13) { 
RDebugUtils.currentLine=35717123;
 //BA.debugLineNum = 35717123;BA.debugLine="Dim yymmdd As String = LeftString(rsaID, 6)";
_yymmdd = __ref._leftstring /*String*/ (null,_rsaid,(long) (6));
RDebugUtils.currentLine=35717124;
 //BA.debugLineNum = 35717124;BA.debugLine="Dim yy As String = LeftString(yymmdd,2)";
_yy = __ref._leftstring /*String*/ (null,_yymmdd,(long) (2));
RDebugUtils.currentLine=35717125;
 //BA.debugLineNum = 35717125;BA.debugLine="Dim mm As String = MidString(yymmdd,3,2)";
_mm = __ref._midstring /*String*/ (null,_yymmdd,(int) (3),(int) (2));
RDebugUtils.currentLine=35717126;
 //BA.debugLineNum = 35717126;BA.debugLine="Dim dd As String = RightString(yymmdd,2)";
_dd = __ref._rightstring /*String*/ (null,_yymmdd,(long) (2));
RDebugUtils.currentLine=35717127;
 //BA.debugLineNum = 35717127;BA.debugLine="yymmdd = $\"19${yy}-${mm}-${dd}\"$";
_yymmdd = ("19"+__c.SmartStringFormatter("",(Object)(_yy))+"-"+__c.SmartStringFormatter("",(Object)(_mm))+"-"+__c.SmartStringFormatter("",(Object)(_dd))+"");
RDebugUtils.currentLine=35717128;
 //BA.debugLineNum = 35717128;BA.debugLine="Return yymmdd";
if (true) return _yymmdd;
 }else {
RDebugUtils.currentLine=35717130;
 //BA.debugLineNum = 35717130;BA.debugLine="Return \"\"";
if (true) return "";
 };
RDebugUtils.currentLine=35717132;
 //BA.debugLineNum = 35717132;BA.debugLine="End Sub";
return "";
}
public String  _savetext2file(b4j.example.bananovue __ref,String _content,String _filename) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "savetext2file", true))
	 {return ((String) Debug.delegate(ba, "savetext2file", new Object[] {_content,_filename}));}
anywheresoftware.b4a.objects.collections.List _fc = null;
com.ab.banano.BANanoObject _blob = null;
RDebugUtils.currentLine=41287680;
 //BA.debugLineNum = 41287680;BA.debugLine="Sub SaveText2File(content As String, fileName As S";
RDebugUtils.currentLine=41287681;
 //BA.debugLineNum = 41287681;BA.debugLine="Dim fc As List";
_fc = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=41287682;
 //BA.debugLineNum = 41287682;BA.debugLine="fc.Initialize";
_fc.Initialize();
RDebugUtils.currentLine=41287683;
 //BA.debugLineNum = 41287683;BA.debugLine="fc.Add(content)";
_fc.Add((Object)(_content));
RDebugUtils.currentLine=41287684;
 //BA.debugLineNum = 41287684;BA.debugLine="Dim blob As BANanoObject";
_blob = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=41287685;
 //BA.debugLineNum = 41287685;BA.debugLine="blob.Initialize2(\"Blob\",Array(fc, CreateMap(\"type";
_blob.Initialize2("Blob",(Object)(new Object[]{(Object)(_fc.getObject()),(Object)(__c.createMap(new Object[] {(Object)("type"),(Object)("text/plain;charset=utf-8")}).getObject())}));
RDebugUtils.currentLine=41287686;
 //BA.debugLineNum = 41287686;BA.debugLine="BANAno.RunJavascriptMethod(\"saveAs\",Array(blob,fi";
__ref._banano /*com.ab.banano.BANano*/ .RunJavascriptMethod("saveAs",anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_blob.getObject()),(Object)(_filename)}));
RDebugUtils.currentLine=41287687;
 //BA.debugLineNum = 41287687;BA.debugLine="End Sub";
return "";
}
public String  _setbackgroundimage(b4j.example.bananovue __ref,String _elid,String _url) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setbackgroundimage", true))
	 {return ((String) Debug.delegate(ba, "setbackgroundimage", new Object[] {_elid,_url}));}
RDebugUtils.currentLine=40108032;
 //BA.debugLineNum = 40108032;BA.debugLine="Sub SetBackgroundImage(elid As String, url As Stri";
RDebugUtils.currentLine=40108033;
 //BA.debugLineNum = 40108033;BA.debugLine="BANAno.GetElement(elid).SetStyle(BANAno.ToJson(Cr";
__ref._banano /*com.ab.banano.BANano*/ .GetElement(_elid).SetStyle(BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(__c.createMap(new Object[] {(Object)("background-image"),(Object)(("url('"+__c.SmartStringFormatter("",(Object)(_url))+"')")),(Object)("background-size"),(Object)("100% 100%")}).getObject()))));
RDebugUtils.currentLine=40108034;
 //BA.debugLineNum = 40108034;BA.debugLine="End Sub";
return "";
}
public String  _setcoverimage(b4j.example.bananovue __ref,String _imgurl) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setcoverimage", true))
	 {return ((String) Debug.delegate(ba, "setcoverimage", new Object[] {_imgurl}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
String _sjson = "";
RDebugUtils.currentLine=44498944;
 //BA.debugLineNum = 44498944;BA.debugLine="Sub SetCoverImage(imgURL As String)";
RDebugUtils.currentLine=44498945;
 //BA.debugLineNum = 44498945;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=44498946;
 //BA.debugLineNum = 44498946;BA.debugLine="If imgURL = \"none\" Then";
if ((_imgurl).equals("none")) { 
RDebugUtils.currentLine=44498947;
 //BA.debugLineNum = 44498947;BA.debugLine="opt.Put(\"background-image\", \"none\")";
_opt.Put((Object)("background-image"),(Object)("none"));
 }else {
RDebugUtils.currentLine=44498955;
 //BA.debugLineNum = 44498955;BA.debugLine="opt.Put(\"background\", $\"url('${imgURL}')\"$)";
_opt.Put((Object)("background"),(Object)(("url('"+__c.SmartStringFormatter("",(Object)(_imgurl))+"')")));
RDebugUtils.currentLine=44498956;
 //BA.debugLineNum = 44498956;BA.debugLine="opt.Put(\"position\", \"absolute\")";
_opt.Put((Object)("position"),(Object)("absolute"));
RDebugUtils.currentLine=44498957;
 //BA.debugLineNum = 44498957;BA.debugLine="opt.Put(\"height\", \"100%\")";
_opt.Put((Object)("height"),(Object)("100%"));
RDebugUtils.currentLine=44498958;
 //BA.debugLineNum = 44498958;BA.debugLine="opt.Put(\"width\", \"100%\")";
_opt.Put((Object)("width"),(Object)("100%"));
RDebugUtils.currentLine=44498959;
 //BA.debugLineNum = 44498959;BA.debugLine="opt.Put(\"top\", \"0\")";
_opt.Put((Object)("top"),(Object)("0"));
RDebugUtils.currentLine=44498960;
 //BA.debugLineNum = 44498960;BA.debugLine="opt.Put(\"bottom\", \"0\")";
_opt.Put((Object)("bottom"),(Object)("0"));
RDebugUtils.currentLine=44498961;
 //BA.debugLineNum = 44498961;BA.debugLine="opt.Put(\"right\", \"0\")";
_opt.Put((Object)("right"),(Object)("0"));
RDebugUtils.currentLine=44498962;
 //BA.debugLineNum = 44498962;BA.debugLine="opt.Put(\"left\", \"0\")";
_opt.Put((Object)("left"),(Object)("0"));
RDebugUtils.currentLine=44498963;
 //BA.debugLineNum = 44498963;BA.debugLine="opt.Put(\"z-index\", \"0\")";
_opt.Put((Object)("z-index"),(Object)("0"));
 };
RDebugUtils.currentLine=44498965;
 //BA.debugLineNum = 44498965;BA.debugLine="Dim sjson As String = BANAno.ToJson(opt)";
_sjson = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(_opt.getObject())));
RDebugUtils.currentLine=44498966;
 //BA.debugLineNum = 44498966;BA.debugLine="body.SetStyle(sjson)";
__ref._body /*com.ab.banano.BANanoElement*/ .SetStyle(_sjson);
RDebugUtils.currentLine=44498967;
 //BA.debugLineNum = 44498967;BA.debugLine="End Sub";
return "";
}
public String  _setdisabledstate(b4j.example.bananovue __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setdisabledstate", true))
	 {return ((String) Debug.delegate(ba, "setdisabledstate", new Object[] {_k,_v}));}
String _diskey = "";
RDebugUtils.currentLine=39649280;
 //BA.debugLineNum = 39649280;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
RDebugUtils.currentLine=39649281;
 //BA.debugLineNum = 39649281;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"disabled");
RDebugUtils.currentLine=39649282;
 //BA.debugLineNum = 39649282;BA.debugLine="SetStateSingle(disKey, v)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_diskey,(Object)(_v));
RDebugUtils.currentLine=39649283;
 //BA.debugLineNum = 39649283;BA.debugLine="End Sub";
return "";
}
public String  _seterrorstate(b4j.example.bananovue __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "seterrorstate", true))
	 {return ((String) Debug.delegate(ba, "seterrorstate", new Object[] {_k,_v}));}
String _showkey = "";
RDebugUtils.currentLine=39583744;
 //BA.debugLineNum = 39583744;BA.debugLine="Sub SetErrorState(k As String, v As Boolean)";
RDebugUtils.currentLine=39583745;
 //BA.debugLineNum = 39583745;BA.debugLine="Dim showKey As String = $\"${k}error\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"error");
RDebugUtils.currentLine=39583746;
 //BA.debugLineNum = 39583746;BA.debugLine="SetStateSingle(showKey, v)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_showkey,(Object)(_v));
RDebugUtils.currentLine=39583747;
 //BA.debugLineNum = 39583747;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananovue  _setnexttick(b4j.example.bananovue __ref,Object _module,String _methodname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setnexttick", true))
	 {return ((b4j.example.bananovue) Debug.delegate(ba, "setnexttick", new Object[] {_module,_methodname}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=45744128;
 //BA.debugLineNum = 45744128;BA.debugLine="Sub SetNextTick(module As Object, methodName As St";
RDebugUtils.currentLine=45744129;
 //BA.debugLineNum = 45744129;BA.debugLine="methodName = methodName.ToLowerCase";
_methodname = _methodname.toLowerCase();
RDebugUtils.currentLine=45744130;
 //BA.debugLineNum = 45744130;BA.debugLine="Dim cb As BANanoObject = BANAno.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(_module,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)))));
RDebugUtils.currentLine=45744131;
 //BA.debugLineNum = 45744131;BA.debugLine="BOVue.RunMethod(\"nextTick\", cb)";
__ref._bovue /*com.ab.banano.BANanoObject*/ .RunMethod("nextTick",(Object)(_cb.getObject()));
RDebugUtils.currentLine=45744132;
 //BA.debugLineNum = 45744132;BA.debugLine="Return Me";
if (true) return (b4j.example.bananovue)(this);
RDebugUtils.currentLine=45744133;
 //BA.debugLineNum = 45744133;BA.debugLine="End Sub";
return null;
}
public String  _setoptionbo(b4j.example.bananovue __ref,String _optionname,com.ab.banano.BANanoObject _optionobject) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setoptionbo", true))
	 {return ((String) Debug.delegate(ba, "setoptionbo", new Object[] {_optionname,_optionobject}));}
RDebugUtils.currentLine=41418752;
 //BA.debugLineNum = 41418752;BA.debugLine="Sub SetOptionBO(optionName As String, optionObject";
RDebugUtils.currentLine=41418753;
 //BA.debugLineNum = 41418753;BA.debugLine="Options.Put(optionName, optionObject)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_optionname),(Object)(_optionobject.getObject()));
RDebugUtils.currentLine=41418754;
 //BA.debugLineNum = 41418754;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _setprefix(b4j.example.bananovue __ref,String _prefix,anywheresoftware.b4a.objects.collections.Map _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setprefix", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "setprefix", new Object[] {_prefix,_target}));}
anywheresoftware.b4a.objects.collections.Map _nm = null;
String _mk = "";
Object _mv = null;
String _mk1 = "";
RDebugUtils.currentLine=42467328;
 //BA.debugLineNum = 42467328;BA.debugLine="Sub SetPrefix(prefix As String, target As Map) As";
RDebugUtils.currentLine=42467329;
 //BA.debugLineNum = 42467329;BA.debugLine="Dim nm As Map = CreateMap()";
_nm = new anywheresoftware.b4a.objects.collections.Map();
_nm = __c.createMap(new Object[] {});
RDebugUtils.currentLine=42467330;
 //BA.debugLineNum = 42467330;BA.debugLine="For Each mk As String In target.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _target.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_mk = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=42467331;
 //BA.debugLineNum = 42467331;BA.debugLine="Dim mv As Object = target.Get(mk)";
_mv = _target.Get((Object)(_mk));
RDebugUtils.currentLine=42467332;
 //BA.debugLineNum = 42467332;BA.debugLine="Dim mk1 As String = prefix & \"_\" & mk";
_mk1 = _prefix+"_"+_mk;
RDebugUtils.currentLine=42467333;
 //BA.debugLineNum = 42467333;BA.debugLine="nm.Put(mk1,mv)";
_nm.Put((Object)(_mk1),_mv);
 }
};
RDebugUtils.currentLine=42467335;
 //BA.debugLineNum = 42467335;BA.debugLine="Return nm";
if (true) return _nm;
RDebugUtils.currentLine=42467336;
 //BA.debugLineNum = 42467336;BA.debugLine="End Sub";
return null;
}
public String  _setrequiredstate(b4j.example.bananovue __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setrequiredstate", true))
	 {return ((String) Debug.delegate(ba, "setrequiredstate", new Object[] {_k,_v}));}
String _diskey = "";
RDebugUtils.currentLine=42926080;
 //BA.debugLineNum = 42926080;BA.debugLine="Sub SetRequiredState(k As String, v As Boolean)";
RDebugUtils.currentLine=42926081;
 //BA.debugLineNum = 42926081;BA.debugLine="Dim disKey As String = $\"${k}required\"$";
_diskey = (""+__c.SmartStringFormatter("",(Object)(_k))+"required");
RDebugUtils.currentLine=42926082;
 //BA.debugLineNum = 42926082;BA.debugLine="SetStateSingle(disKey, v)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_diskey,(Object)(_v));
RDebugUtils.currentLine=42926083;
 //BA.debugLineNum = 42926083;BA.debugLine="End Sub";
return "";
}
public String  _setshowstate(b4j.example.bananovue __ref,String _k,boolean _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "setshowstate", true))
	 {return ((String) Debug.delegate(ba, "setshowstate", new Object[] {_k,_v}));}
String _showkey = "";
RDebugUtils.currentLine=39518208;
 //BA.debugLineNum = 39518208;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
RDebugUtils.currentLine=39518209;
 //BA.debugLineNum = 39518209;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
_showkey = (""+__c.SmartStringFormatter("",(Object)(_k))+"show");
RDebugUtils.currentLine=39518210;
 //BA.debugLineNum = 39518210;BA.debugLine="SetStateSingle(showKey, v)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_showkey,(Object)(_v));
RDebugUtils.currentLine=39518211;
 //BA.debugLineNum = 39518211;BA.debugLine="End Sub";
return "";
}
public String  _showerror(b4j.example.bananovue __ref,String _elid) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "showerror", true))
	 {return ((String) Debug.delegate(ba, "showerror", new Object[] {_elid}));}
RDebugUtils.currentLine=42205184;
 //BA.debugLineNum = 42205184;BA.debugLine="Sub ShowError(elID As String)";
RDebugUtils.currentLine=42205185;
 //BA.debugLineNum = 42205185;BA.debugLine="SetStateSingle($\"${elID}error\"$, True)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,(""+__c.SmartStringFormatter("",(Object)(_elid))+"error"),(Object)(__c.True));
RDebugUtils.currentLine=42205186;
 //BA.debugLineNum = 42205186;BA.debugLine="End Sub";
return "";
}
public String  _showitems(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _items) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "showitems", true))
	 {return ((String) Debug.delegate(ba, "showitems", new Object[] {_items}));}
String _item = "";
RDebugUtils.currentLine=39845888;
 //BA.debugLineNum = 39845888;BA.debugLine="Sub ShowItems(items As List)";
RDebugUtils.currentLine=39845889;
 //BA.debugLineNum = 39845889;BA.debugLine="For Each item As String In items";
{
final anywheresoftware.b4a.BA.IterableList group1 = _items;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=39845890;
 //BA.debugLineNum = 39845890;BA.debugLine="SetStateSingle(item, True)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_item,(Object)(__c.True));
 }
};
RDebugUtils.currentLine=39845892;
 //BA.debugLineNum = 39845892;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _sortmap(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "sortmap", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "sortmap", new Object[] {_m}));}
anywheresoftware.b4a.objects.collections.Map _nm = null;
anywheresoftware.b4a.objects.collections.List _lst = null;
String _strkey = "";
Object _strvalue = null;
RDebugUtils.currentLine=39321600;
 //BA.debugLineNum = 39321600;BA.debugLine="Sub SortMap(m As Map) As Map";
RDebugUtils.currentLine=39321601;
 //BA.debugLineNum = 39321601;BA.debugLine="Try";
try {RDebugUtils.currentLine=39321602;
 //BA.debugLineNum = 39321602;BA.debugLine="Dim nm As Map";
_nm = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=39321603;
 //BA.debugLineNum = 39321603;BA.debugLine="nm.Initialize";
_nm.Initialize();
RDebugUtils.currentLine=39321604;
 //BA.debugLineNum = 39321604;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=39321605;
 //BA.debugLineNum = 39321605;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=39321606;
 //BA.debugLineNum = 39321606;BA.debugLine="For Each strkey As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group6 = _m.Keys();
final int groupLen6 = group6.getSize()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_strkey = BA.ObjectToString(group6.Get(index6));
RDebugUtils.currentLine=39321607;
 //BA.debugLineNum = 39321607;BA.debugLine="lst.Add(strkey)";
_lst.Add((Object)(_strkey));
 }
};
RDebugUtils.currentLine=39321610;
 //BA.debugLineNum = 39321610;BA.debugLine="lst.Sort(True)";
_lst.Sort(__c.True);
RDebugUtils.currentLine=39321611;
 //BA.debugLineNum = 39321611;BA.debugLine="For Each strkey As String In lst";
{
final anywheresoftware.b4a.BA.IterableList group10 = _lst;
final int groupLen10 = group10.getSize()
;int index10 = 0;
;
for (; index10 < groupLen10;index10++){
_strkey = BA.ObjectToString(group10.Get(index10));
RDebugUtils.currentLine=39321612;
 //BA.debugLineNum = 39321612;BA.debugLine="Dim strvalue As Object = m.Get(strkey)";
_strvalue = _m.Get((Object)(_strkey));
RDebugUtils.currentLine=39321613;
 //BA.debugLineNum = 39321613;BA.debugLine="nm.Put(strkey,strvalue)";
_nm.Put((Object)(_strkey),_strvalue);
 }
};
RDebugUtils.currentLine=39321615;
 //BA.debugLineNum = 39321615;BA.debugLine="Return nm";
if (true) return _nm;
 } 
       catch (Exception e16) {
			ba.setLastException(e16);RDebugUtils.currentLine=39321617;
 //BA.debugLineNum = 39321617;BA.debugLine="Return m";
if (true) return _m;
 };
RDebugUtils.currentLine=39321619;
 //BA.debugLineNum = 39321619;BA.debugLine="End Sub";
return null;
}
public String  _space(b4j.example.bananovue __ref,int _hm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "space", true))
	 {return ((String) Debug.delegate(ba, "space", new Object[] {_hm}));}
String _rs = "";
RDebugUtils.currentLine=38469632;
 //BA.debugLineNum = 38469632;BA.debugLine="Sub Space(HM As Int) As String";
RDebugUtils.currentLine=38469633;
 //BA.debugLineNum = 38469633;BA.debugLine="Dim RS As String = \"\"";
_rs = "";
RDebugUtils.currentLine=38469634;
 //BA.debugLineNum = 38469634;BA.debugLine="Do While Len(RS) < HM";
while (__ref._len /*int*/ (null,_rs)<_hm) {
RDebugUtils.currentLine=38469635;
 //BA.debugLineNum = 38469635;BA.debugLine="RS = RS & \" \"";
_rs = _rs+" ";
 }
;
RDebugUtils.currentLine=38469637;
 //BA.debugLineNum = 38469637;BA.debugLine="Return RS";
if (true) return _rs;
RDebugUtils.currentLine=38469638;
 //BA.debugLineNum = 38469638;BA.debugLine="End Sub";
return "";
}
public String  _statusrag(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "statusrag", true))
	 {return ((String) Debug.delegate(ba, "statusrag", new Object[] {_dvalue}));}
RDebugUtils.currentLine=47906816;
 //BA.debugLineNum = 47906816;BA.debugLine="Public Sub StatusRAG(dValue As Int) As String";
RDebugUtils.currentLine=47906817;
 //BA.debugLineNum = 47906817;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
RDebugUtils.currentLine=47906819;
 //BA.debugLineNum = 47906819;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
RDebugUtils.currentLine=47906821;
 //BA.debugLineNum = 47906821;BA.debugLine="Return \"./assets/orange.png\"";
if (true) return "./assets/orange.png";
 break; }
case 2: {
RDebugUtils.currentLine=47906823;
 //BA.debugLineNum = 47906823;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
RDebugUtils.currentLine=47906825;
 //BA.debugLineNum = 47906825;BA.debugLine="Return \"./assets/gray.png\"";
if (true) return "./assets/gray.png";
 break; }
}
;
RDebugUtils.currentLine=47906827;
 //BA.debugLineNum = 47906827;BA.debugLine="End Sub";
return "";
}
public String  _statusrg(b4j.example.bananovue __ref,int _dvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "statusrg", true))
	 {return ((String) Debug.delegate(ba, "statusrg", new Object[] {_dvalue}));}
RDebugUtils.currentLine=48300032;
 //BA.debugLineNum = 48300032;BA.debugLine="Public Sub StatusRG(dValue As Int) As String";
RDebugUtils.currentLine=48300033;
 //BA.debugLineNum = 48300033;BA.debugLine="Select Case dValue";
switch (_dvalue) {
case 0: {
RDebugUtils.currentLine=48300035;
 //BA.debugLineNum = 48300035;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
case 1: {
RDebugUtils.currentLine=48300037;
 //BA.debugLineNum = 48300037;BA.debugLine="Return \"./assets/green.png\"";
if (true) return "./assets/green.png";
 break; }
default: {
RDebugUtils.currentLine=48300039;
 //BA.debugLineNum = 48300039;BA.debugLine="Return \"./assets/red.png\"";
if (true) return "./assets/red.png";
 break; }
}
;
RDebugUtils.currentLine=48300041;
 //BA.debugLineNum = 48300041;BA.debugLine="End Sub";
return "";
}
public double  _sumlistofmapsproperty(b4j.example.bananovue __ref,anywheresoftware.b4a.objects.collections.List _lst,String _prop) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "sumlistofmapsproperty", true))
	 {return ((Double) Debug.delegate(ba, "sumlistofmapsproperty", new Object[] {_lst,_prop}));}
double _tsum = 0;
anywheresoftware.b4a.objects.collections.Map _rec = null;
String _propv = "";
RDebugUtils.currentLine=36503552;
 //BA.debugLineNum = 36503552;BA.debugLine="Sub SumListOfMapsProperty(lst As List, prop As Str";
RDebugUtils.currentLine=36503553;
 //BA.debugLineNum = 36503553;BA.debugLine="Dim tsum As Double = 0";
_tsum = 0;
RDebugUtils.currentLine=36503554;
 //BA.debugLineNum = 36503554;BA.debugLine="For Each rec As Map In lst";
_rec = new anywheresoftware.b4a.objects.collections.Map();
{
final anywheresoftware.b4a.BA.IterableList group2 = _lst;
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(group2.Get(index2)));
RDebugUtils.currentLine=36503555;
 //BA.debugLineNum = 36503555;BA.debugLine="Dim propv As String = rec.GetDefault(prop,\"0\")";
_propv = BA.ObjectToString(_rec.GetDefault((Object)(_prop),(Object)("0")));
RDebugUtils.currentLine=36503556;
 //BA.debugLineNum = 36503556;BA.debugLine="tsum = tsum + BANAno.parseFloat(propv)";
_tsum = _tsum+__ref._banano /*com.ab.banano.BANano*/ .parseFloat((Object)(_propv));
 }
};
RDebugUtils.currentLine=36503558;
 //BA.debugLineNum = 36503558;BA.debugLine="Return tsum";
if (true) return _tsum;
RDebugUtils.currentLine=36503559;
 //BA.debugLineNum = 36503559;BA.debugLine="End Sub";
return 0;
}
public String  _toyyyymmdd(b4j.example.bananovue __ref,String _vmodel) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "toyyyymmdd", true))
	 {return ((String) Debug.delegate(ba, "toyyyymmdd", new Object[] {_vmodel}));}
String _sk = "";
RDebugUtils.currentLine=39059456;
 //BA.debugLineNum = 39059456;BA.debugLine="Sub ToYYYYMMDD(vmodel As String)";
RDebugUtils.currentLine=39059457;
 //BA.debugLineNum = 39059457;BA.debugLine="Dim sk As String = GetState(vmodel,\"\")";
_sk = BA.ObjectToString(__ref._getstate /*Object*/ (null,_vmodel,(Object)("")));
RDebugUtils.currentLine=39059458;
 //BA.debugLineNum = 39059458;BA.debugLine="sk = Date2YYYYMMDD(sk)";
_sk = __ref._date2yyyymmdd /*String*/ (null,(Object)(_sk));
RDebugUtils.currentLine=39059459;
 //BA.debugLineNum = 39059459;BA.debugLine="SetStateSingle(vmodel, sk)";
__ref._setstatesingle /*b4j.example.bananovue*/ (null,_vmodel,(Object)(_sk));
RDebugUtils.currentLine=39059460;
 //BA.debugLineNum = 39059460;BA.debugLine="End Sub";
return "";
}
public String  _trimstring(b4j.example.bananovue __ref,String _strvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "trimstring", true))
	 {return ((String) Debug.delegate(ba, "trimstring", new Object[] {_strvalue}));}
RDebugUtils.currentLine=38338560;
 //BA.debugLineNum = 38338560;BA.debugLine="private Sub TrimString(strValue As String) As Stri";
RDebugUtils.currentLine=38338561;
 //BA.debugLineNum = 38338561;BA.debugLine="Return strValue.trim";
if (true) return _strvalue.trim();
RDebugUtils.currentLine=38338562;
 //BA.debugLineNum = 38338562;BA.debugLine="End Sub";
return "";
}
public String  _yearnow(b4j.example.bananovue __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananovue";
if (Debug.shouldDelegate(ba, "yearnow", true))
	 {return ((String) Debug.delegate(ba, "yearnow", null));}
long _lnow = 0L;
String _dt = "";
RDebugUtils.currentLine=35782656;
 //BA.debugLineNum = 35782656;BA.debugLine="Public Sub YearNow() As String";
RDebugUtils.currentLine=35782657;
 //BA.debugLineNum = 35782657;BA.debugLine="Dim lNow As Long";
_lnow = 0L;
RDebugUtils.currentLine=35782658;
 //BA.debugLineNum = 35782658;BA.debugLine="Dim dt As String";
_dt = "";
RDebugUtils.currentLine=35782659;
 //BA.debugLineNum = 35782659;BA.debugLine="lNow = DateTime.Now";
_lnow = __c.DateTime.getNow();
RDebugUtils.currentLine=35782660;
 //BA.debugLineNum = 35782660;BA.debugLine="DateTime.DateFormat = \"yyyy\"";
__c.DateTime.setDateFormat("yyyy");
RDebugUtils.currentLine=35782661;
 //BA.debugLineNum = 35782661;BA.debugLine="dt = DateTime.Date(lNow)";
_dt = __c.DateTime.Date(_lnow);
RDebugUtils.currentLine=35782662;
 //BA.debugLineNum = 35782662;BA.debugLine="Return dt";
if (true) return _dt;
RDebugUtils.currentLine=35782663;
 //BA.debugLineNum = 35782663;BA.debugLine="End Sub";
return "";
}
}