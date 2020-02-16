package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmvuecal extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmvuecal", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmvuecal.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _vuecal = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.List _events = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmvuecal  _initialize(b4j.example.vmvuecal __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler,String _width,String _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler,_width,_height}));}
Object _event = null;
com.ab.banano.BANanoEvent _e = null;
RDebugUtils.currentLine=230293504;
 //BA.debugLineNum = 230293504;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=230293505;
 //BA.debugLineNum = 230293505;BA.debugLine="BANano.DependsOnAsset(\"vuecal.css\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("vuecal.css");
RDebugUtils.currentLine=230293506;
 //BA.debugLineNum = 230293506;BA.debugLine="BANano.DependsOnAsset(\"vuecal.umd.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("vuecal.umd.min.js");
RDebugUtils.currentLine=230293507;
 //BA.debugLineNum = 230293507;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=230293508;
 //BA.debugLineNum = 230293508;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=230293509;
 //BA.debugLineNum = 230293509;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=230293510;
 //BA.debugLineNum = 230293510;BA.debugLine="VueCal.Initialize(vue, ID).SetTag(\"vue-cal\")";
__ref._vuecal /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"vue-cal");
RDebugUtils.currentLine=230293511;
 //BA.debugLineNum = 230293511;BA.debugLine="Width = VueCal.MakePx(Width)";
_width = __ref._vuecal /*b4j.example.vmelement*/ ._makepx /*String*/ (null,_width);
RDebugUtils.currentLine=230293512;
 //BA.debugLineNum = 230293512;BA.debugLine="Height = VueCal.MakePx(Height)";
_height = __ref._vuecal /*b4j.example.vmelement*/ ._makepx /*String*/ (null,_height);
RDebugUtils.currentLine=230293513;
 //BA.debugLineNum = 230293513;BA.debugLine="VueCal.SetWidth(Width)";
__ref._vuecal /*b4j.example.vmelement*/ ._setwidth /*b4j.example.vmelement*/ (null,_width);
RDebugUtils.currentLine=230293514;
 //BA.debugLineNum = 230293514;BA.debugLine="VueCal.SetHeight(Height)";
__ref._vuecal /*b4j.example.vmelement*/ ._setheight /*b4j.example.vmelement*/ (null,_height);
RDebugUtils.currentLine=230293515;
 //BA.debugLineNum = 230293515;BA.debugLine="events.Initialize";
__ref._events /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=230293516;
 //BA.debugLineNum = 230293516;BA.debugLine="InitializeEvents";
__ref._initializeevents /*b4j.example.vmvuecal*/ (null);
RDebugUtils.currentLine=230293517;
 //BA.debugLineNum = 230293517;BA.debugLine="Dim event As Object, e As BANanoEvent";
_event = new Object();
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=230293518;
 //BA.debugLineNum = 230293518;BA.debugLine="SetOnEventClick(event, e)";
__ref._setoneventclick /*b4j.example.vmvuecal*/ (null,_event,_e);
RDebugUtils.currentLine=230293519;
 //BA.debugLineNum = 230293519;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230293520;
 //BA.debugLineNum = 230293520;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _addclass(b4j.example.vmvuecal __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=232325120;
 //BA.debugLineNum = 232325120;BA.debugLine="Sub AddClass(c As String) As VMVueCal";
RDebugUtils.currentLine=232325121;
 //BA.debugLineNum = 232325121;BA.debugLine="VueCal.AddClass(c)";
__ref._vuecal /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=232325122;
 //BA.debugLineNum = 232325122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=232325123;
 //BA.debugLineNum = 232325123;BA.debugLine="End Sub";
return null;
}
public String  _addevent(b4j.example.vmvuecal __ref,String _eid,String _estart,String _eend,String _etitle,String _eicon,String _econtent,String _econtentfull,String _eclass,boolean _eallday) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "addevent", true))
	 {return ((String) Debug.delegate(ba, "addevent", new Object[] {_eid,_estart,_eend,_etitle,_eicon,_econtent,_econtentfull,_eclass,_eallday}));}
anywheresoftware.b4a.objects.collections.Map _event = null;
RDebugUtils.currentLine=231014400;
 //BA.debugLineNum = 231014400;BA.debugLine="Sub AddEvent(eID As String, eStart As String, eEnd";
RDebugUtils.currentLine=231014401;
 //BA.debugLineNum = 231014401;BA.debugLine="Dim event As Map = CreateMap()";
_event = new anywheresoftware.b4a.objects.collections.Map();
_event = __c.createMap(new Object[] {});
RDebugUtils.currentLine=231014402;
 //BA.debugLineNum = 231014402;BA.debugLine="event.Put(\"id\", eID)";
_event.Put((Object)("id"),(Object)(_eid));
RDebugUtils.currentLine=231014403;
 //BA.debugLineNum = 231014403;BA.debugLine="event.Put(\"start\", eStart)";
_event.Put((Object)("start"),(Object)(_estart));
RDebugUtils.currentLine=231014404;
 //BA.debugLineNum = 231014404;BA.debugLine="event.Put(\"end\", eEnd)";
_event.Put((Object)("end"),(Object)(_eend));
RDebugUtils.currentLine=231014405;
 //BA.debugLineNum = 231014405;BA.debugLine="event.Put(\"title\", eTitle)";
_event.Put((Object)("title"),(Object)(_etitle));
RDebugUtils.currentLine=231014406;
 //BA.debugLineNum = 231014406;BA.debugLine="If eIcon <> \"\" Then event.Put(\"icon\", eIcon)";
if ((_eicon).equals("") == false) { 
_event.Put((Object)("icon"),(Object)(_eicon));};
RDebugUtils.currentLine=231014407;
 //BA.debugLineNum = 231014407;BA.debugLine="If eContent <> \"\" Then event.Put(\"content\", eCont";
if ((_econtent).equals("") == false) { 
_event.Put((Object)("content"),(Object)(_econtent));};
RDebugUtils.currentLine=231014408;
 //BA.debugLineNum = 231014408;BA.debugLine="If eContentFull <> \"\" Then event.Put(\"contentFull";
if ((_econtentfull).equals("") == false) { 
_event.Put((Object)("contentFull"),(Object)(_econtentfull));};
RDebugUtils.currentLine=231014409;
 //BA.debugLineNum = 231014409;BA.debugLine="If eClass <> \"\" Then event.Put(\"class\", eClass)";
if ((_eclass).equals("") == false) { 
_event.Put((Object)("class"),(Object)(_eclass));};
RDebugUtils.currentLine=231014410;
 //BA.debugLineNum = 231014410;BA.debugLine="If eAllDay Then event.Put(\"allDay\", eAllDay)";
if (_eallday) { 
_event.Put((Object)("allDay"),(Object)(_eallday));};
RDebugUtils.currentLine=231014411;
 //BA.debugLineNum = 231014411;BA.debugLine="events.Add(event)";
__ref._events /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_event.getObject()));
RDebugUtils.currentLine=231014412;
 //BA.debugLineNum = 231014412;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmvuecal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
RDebugUtils.currentLine=230227968;
 //BA.debugLineNum = 230227968;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=230227969;
 //BA.debugLineNum = 230227969;BA.debugLine="Public VueCal As VMElement";
_vuecal = new b4j.example.vmelement();
RDebugUtils.currentLine=230227970;
 //BA.debugLineNum = 230227970;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=230227971;
 //BA.debugLineNum = 230227971;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=230227972;
 //BA.debugLineNum = 230227972;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=230227973;
 //BA.debugLineNum = 230227973;BA.debugLine="Private events As List";
_events = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=230227974;
 //BA.debugLineNum = 230227974;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=230227975;
 //BA.debugLineNum = 230227975;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmvuecal  _initializeevents(b4j.example.vmvuecal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "initializeevents", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "initializeevents", null));}
String _evename = "";
RDebugUtils.currentLine=231473152;
 //BA.debugLineNum = 231473152;BA.debugLine="private Sub InitializeEvents As VMVueCal";
RDebugUtils.currentLine=231473153;
 //BA.debugLineNum = 231473153;BA.debugLine="Dim eveName As String = $\"${ID}events\"$";
_evename = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"events");
RDebugUtils.currentLine=231473154;
 //BA.debugLineNum = 231473154;BA.debugLine="vue.SetStateSingle(eveName, Array())";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_evename,(Object)(new Object[]{}));
RDebugUtils.currentLine=231473155;
 //BA.debugLineNum = 231473155;BA.debugLine="VueCal.SetAttr1(\":events\", eveName)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":events",(Object)(_evename));
RDebugUtils.currentLine=231473156;
 //BA.debugLineNum = 231473156;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231473157;
 //BA.debugLineNum = 231473157;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setoneventclick(b4j.example.vmvuecal __ref,Object _event,com.ab.banano.BANanoEvent _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setoneventclick", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setoneventclick", new Object[] {_event,_e}));}
String _ekey = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=230555648;
 //BA.debugLineNum = 230555648;BA.debugLine="private Sub SetOnEventClick(event As Object, e As";
RDebugUtils.currentLine=230555649;
 //BA.debugLineNum = 230555649;BA.debugLine="Dim eKey As String = $\"${ID}_click\"$";
_ekey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click");
RDebugUtils.currentLine=230555650;
 //BA.debugLineNum = 230555650;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_ekey,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_event,(Object)(_e)}))));
RDebugUtils.currentLine=230555651;
 //BA.debugLineNum = 230555651;BA.debugLine="VueCal.SetAttr1(\":on-event-click\", cb)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":on-event-click",(Object)(_cb.getObject()));
RDebugUtils.currentLine=230555652;
 //BA.debugLineNum = 230555652;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230555653;
 //BA.debugLineNum = 230555653;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmvuecal __ref,b4j.example.vmelement _px) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_px}));}
RDebugUtils.currentLine=232587264;
 //BA.debugLineNum = 232587264;BA.debugLine="Sub Pop(px As VMElement)";
RDebugUtils.currentLine=232587265;
 //BA.debugLineNum = 232587265;BA.debugLine="px.SetText(ToString)";
_px._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=232587266;
 //BA.debugLineNum = 232587266;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmvuecal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=232456192;
 //BA.debugLineNum = 232456192;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=232456193;
 //BA.debugLineNum = 232456193;BA.debugLine="Return VueCal.tostring";
if (true) return __ref._vuecal /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=232456194;
 //BA.debugLineNum = 232456194;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.vmvuecal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
RDebugUtils.currentLine=231604224;
 //BA.debugLineNum = 231604224;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=231604225;
 //BA.debugLineNum = 231604225;BA.debugLine="SetEvents(events)";
__ref._setevents /*b4j.example.vmvuecal*/ (null,__ref._events /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=231604226;
 //BA.debugLineNum = 231604226;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmvuecal  _setevents(b4j.example.vmvuecal __ref,anywheresoftware.b4a.objects.collections.List _evelist) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setevents", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setevents", new Object[] {_evelist}));}
String _evename = "";
RDebugUtils.currentLine=231538688;
 //BA.debugLineNum = 231538688;BA.debugLine="Sub SetEvents(eveList As List) As VMVueCal";
RDebugUtils.currentLine=231538689;
 //BA.debugLineNum = 231538689;BA.debugLine="Dim eveName As String = $\"${ID}events\"$";
_evename = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"events");
RDebugUtils.currentLine=231538690;
 //BA.debugLineNum = 231538690;BA.debugLine="vue.SetStateSingle(eveName, eveList)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_evename,(Object)(_evelist.getObject()));
RDebugUtils.currentLine=231538691;
 //BA.debugLineNum = 231538691;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231538692;
 //BA.debugLineNum = 231538692;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmvuecal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=232521728;
 //BA.debugLineNum = 232521728;BA.debugLine="Sub Render";
RDebugUtils.currentLine=232521729;
 //BA.debugLineNum = 232521729;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=232521730;
 //BA.debugLineNum = 232521730;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmvuecal  _setattr(b4j.example.vmvuecal __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=232390656;
 //BA.debugLineNum = 232390656;BA.debugLine="Sub SetAttr(attr As Map) As VMVueCal";
RDebugUtils.currentLine=232390657;
 //BA.debugLineNum = 232390657;BA.debugLine="VueCal.SetAttr(attr)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=232390658;
 //BA.debugLineNum = 232390658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=232390659;
 //BA.debugLineNum = 232390659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setdefaultview(b4j.example.vmvuecal __ref,String _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setdefaultview", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setdefaultview", new Object[] {_v}));}
RDebugUtils.currentLine=231276544;
 //BA.debugLineNum = 231276544;BA.debugLine="Sub SetDefaultView(v As String) As VMVueCal";
RDebugUtils.currentLine=231276545;
 //BA.debugLineNum = 231276545;BA.debugLine="If v = \"\" Then Return Me";
if ((_v).equals("")) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=231276546;
 //BA.debugLineNum = 231276546;BA.debugLine="VueCal.SetAttr1(\"default-view\", v)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"default-view",(Object)(_v));
RDebugUtils.currentLine=231276547;
 //BA.debugLineNum = 231276547;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231276548;
 //BA.debugLineNum = 231276548;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setdefaultviewday(b4j.example.vmvuecal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setdefaultviewday", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setdefaultviewday", null));}
RDebugUtils.currentLine=231407616;
 //BA.debugLineNum = 231407616;BA.debugLine="Sub SetDefaultViewDay As VMVueCal";
RDebugUtils.currentLine=231407617;
 //BA.debugLineNum = 231407617;BA.debugLine="VueCal.SetAttr1(\"default-view\", \"day\")";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"default-view",(Object)("day"));
RDebugUtils.currentLine=231407618;
 //BA.debugLineNum = 231407618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231407619;
 //BA.debugLineNum = 231407619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setdefaultviewmonth(b4j.example.vmvuecal __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setdefaultviewmonth", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setdefaultviewmonth", null));}
RDebugUtils.currentLine=231342080;
 //BA.debugLineNum = 231342080;BA.debugLine="Sub SetDefaultViewMonth As VMVueCal";
RDebugUtils.currentLine=231342081;
 //BA.debugLineNum = 231342081;BA.debugLine="VueCal.SetAttr1(\"default-view\", \"month\")";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"default-view",(Object)("month"));
RDebugUtils.currentLine=231342082;
 //BA.debugLineNum = 231342082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231342083;
 //BA.debugLineNum = 231342083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _seteditableevents(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "seteditableevents", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "seteditableevents", new Object[] {_b}));}
RDebugUtils.currentLine=230359040;
 //BA.debugLineNum = 230359040;BA.debugLine="Sub SetEditableEvents(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=230359041;
 //BA.debugLineNum = 230359041;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=230359042;
 //BA.debugLineNum = 230359042;BA.debugLine="VueCal.SetAttr1(\"editable-events\", True)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"editable-events",(Object)(__c.True));
RDebugUtils.currentLine=230359043;
 //BA.debugLineNum = 230359043;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230359044;
 //BA.debugLineNum = 230359044;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _seteventscountonyearview(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "seteventscountonyearview", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "seteventscountonyearview", new Object[] {_b}));}
RDebugUtils.currentLine=230621184;
 //BA.debugLineNum = 230621184;BA.debugLine="Sub SetEventsCountOnYearView(b As Boolean) As VMVu";
RDebugUtils.currentLine=230621185;
 //BA.debugLineNum = 230621185;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=230621186;
 //BA.debugLineNum = 230621186;BA.debugLine="VueCal.SetAttr1(\"events-count-on-year-view\", True";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"events-count-on-year-view",(Object)(__c.True));
RDebugUtils.currentLine=230621187;
 //BA.debugLineNum = 230621187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230621188;
 //BA.debugLineNum = 230621188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _seteventsonmonthview(b4j.example.vmvuecal __ref,Object _eom) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "seteventsonmonthview", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "seteventsonmonthview", new Object[] {_eom}));}
RDebugUtils.currentLine=230686720;
 //BA.debugLineNum = 230686720;BA.debugLine="Sub SetEventsOnMonthView(eom As Object) As VMVueCa";
RDebugUtils.currentLine=230686721;
 //BA.debugLineNum = 230686721;BA.debugLine="VueCal.SetAttr1(\"events-on-month-view\", eom)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"events-on-month-view",_eom);
RDebugUtils.currentLine=230686722;
 //BA.debugLineNum = 230686722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230686723;
 //BA.debugLineNum = 230686723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _sethidetitlebar(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "sethidetitlebar", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "sethidetitlebar", new Object[] {_b}));}
RDebugUtils.currentLine=230490112;
 //BA.debugLineNum = 230490112;BA.debugLine="Sub SetHideTitleBar(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=230490113;
 //BA.debugLineNum = 230490113;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=230490114;
 //BA.debugLineNum = 230490114;BA.debugLine="VueCal.SetAttr1(\"hide-title-bar\", True)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"hide-title-bar",(Object)(__c.True));
RDebugUtils.currentLine=230490115;
 //BA.debugLineNum = 230490115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230490116;
 //BA.debugLineNum = 230490116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _sethideviewselector(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "sethideviewselector", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "sethideviewselector", new Object[] {_b}));}
RDebugUtils.currentLine=230883328;
 //BA.debugLineNum = 230883328;BA.debugLine="Sub SetHideViewSelector(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=230883329;
 //BA.debugLineNum = 230883329;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=230883330;
 //BA.debugLineNum = 230883330;BA.debugLine="VueCal.SetAttr1(\"hide-view-selector\", True)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"hide-view-selector",(Object)(__c.True));
RDebugUtils.currentLine=230883331;
 //BA.debugLineNum = 230883331;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230883332;
 //BA.debugLineNum = 230883332;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _sethideweekends(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "sethideweekends", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "sethideweekends", new Object[] {_b}));}
RDebugUtils.currentLine=230817792;
 //BA.debugLineNum = 230817792;BA.debugLine="Sub SetHideWeekends(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=230817793;
 //BA.debugLineNum = 230817793;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=230817794;
 //BA.debugLineNum = 230817794;BA.debugLine="VueCal.SetAttr1(\"hide-weekends\", True)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"hide-weekends",(Object)(__c.True));
RDebugUtils.currentLine=230817795;
 //BA.debugLineNum = 230817795;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230817796;
 //BA.debugLineNum = 230817796;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setid(b4j.example.vmvuecal __ref,String _iid,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setid", new Object[] {_iid,_bind}));}
RDebugUtils.currentLine=232062976;
 //BA.debugLineNum = 232062976;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMVue";
RDebugUtils.currentLine=232062977;
 //BA.debugLineNum = 232062977;BA.debugLine="VueCal.SetID(iID,bind)";
__ref._vuecal /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_iid,_bind);
RDebugUtils.currentLine=232062978;
 //BA.debugLineNum = 232062978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=232062979;
 //BA.debugLineNum = 232062979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setkey(b4j.example.vmvuecal __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=232194048;
 //BA.debugLineNum = 232194048;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMVueC";
RDebugUtils.currentLine=232194049;
 //BA.debugLineNum = 232194049;BA.debugLine="VueCal.SetKey(k, bind)";
__ref._vuecal /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=232194050;
 //BA.debugLineNum = 232194050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=232194051;
 //BA.debugLineNum = 232194051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setmaxdate(b4j.example.vmvuecal __ref,String _maxdate) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setmaxdate", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setmaxdate", new Object[] {_maxdate}));}
String _maxd = "";
RDebugUtils.currentLine=231735296;
 //BA.debugLineNum = 231735296;BA.debugLine="Sub SetMaxDate(maxDate As String) As VMVueCal";
RDebugUtils.currentLine=231735297;
 //BA.debugLineNum = 231735297;BA.debugLine="Dim maxd As String = $\"${ID}maxdate\"$";
_maxd = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"maxdate");
RDebugUtils.currentLine=231735298;
 //BA.debugLineNum = 231735298;BA.debugLine="vue.SetStateSingle(maxd, maxDate)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_maxd,(Object)(_maxdate));
RDebugUtils.currentLine=231735299;
 //BA.debugLineNum = 231735299;BA.debugLine="VueCal.SetAttr1(\":maxdate\", maxd)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":maxdate",(Object)(_maxd));
RDebugUtils.currentLine=231735300;
 //BA.debugLineNum = 231735300;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231735301;
 //BA.debugLineNum = 231735301;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setmindate(b4j.example.vmvuecal __ref,String _mindate) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setmindate", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setmindate", new Object[] {_mindate}));}
String _mind = "";
RDebugUtils.currentLine=231669760;
 //BA.debugLineNum = 231669760;BA.debugLine="Sub SetMinDate(minDate As String) As VMVueCal";
RDebugUtils.currentLine=231669761;
 //BA.debugLineNum = 231669761;BA.debugLine="Dim mind As String = $\"${ID}mindate\"$";
_mind = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"mindate");
RDebugUtils.currentLine=231669762;
 //BA.debugLineNum = 231669762;BA.debugLine="vue.SetStateSingle(mind, minDate)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_mind,(Object)(_mindate));
RDebugUtils.currentLine=231669763;
 //BA.debugLineNum = 231669763;BA.debugLine="VueCal.SetAttr1(\":mindate\", mind)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":mindate",(Object)(_mind));
RDebugUtils.currentLine=231669764;
 //BA.debugLineNum = 231669764;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231669765;
 //BA.debugLineNum = 231669765;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setname(b4j.example.vmvuecal __ref,String _nam,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setname", new Object[] {_nam,_bind}));}
RDebugUtils.currentLine=232128512;
 //BA.debugLineNum = 232128512;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMV";
RDebugUtils.currentLine=232128513;
 //BA.debugLineNum = 232128513;BA.debugLine="VueCal.SetName(nam, bind)";
__ref._vuecal /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,_nam,_bind);
RDebugUtils.currentLine=232128514;
 //BA.debugLineNum = 232128514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=232128515;
 //BA.debugLineNum = 232128515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setshowalldayevents(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setshowalldayevents", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setshowalldayevents", new Object[] {_b}));}
RDebugUtils.currentLine=230424576;
 //BA.debugLineNum = 230424576;BA.debugLine="Sub SetShowAllDayEvents(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=230424577;
 //BA.debugLineNum = 230424577;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=230424578;
 //BA.debugLineNum = 230424578;BA.debugLine="VueCal.SetAttr1(\"show-all-day-events\", True)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"show-all-day-events",(Object)(__c.True));
RDebugUtils.currentLine=230424579;
 //BA.debugLineNum = 230424579;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230424580;
 //BA.debugLineNum = 230424580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setshowweeknumbers(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setshowweeknumbers", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setshowweeknumbers", new Object[] {_b}));}
RDebugUtils.currentLine=230948864;
 //BA.debugLineNum = 230948864;BA.debugLine="Sub SetShowWeekNumbers(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=230948865;
 //BA.debugLineNum = 230948865;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=230948866;
 //BA.debugLineNum = 230948866;BA.debugLine="VueCal.SetAttr1(\"show-week-numbers\", True)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"show-week-numbers",(Object)(__c.True));
RDebugUtils.currentLine=230948867;
 //BA.debugLineNum = 230948867;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230948868;
 //BA.debugLineNum = 230948868;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setstartweekonsunday(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setstartweekonsunday", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setstartweekonsunday", new Object[] {_b}));}
RDebugUtils.currentLine=231079936;
 //BA.debugLineNum = 231079936;BA.debugLine="Sub SetStartWeekOnSunday(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=231079937;
 //BA.debugLineNum = 231079937;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=231079938;
 //BA.debugLineNum = 231079938;BA.debugLine="VueCal.SetAttr1(\"start-week-on-sunday\", True)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"start-week-on-sunday",(Object)(__c.True));
RDebugUtils.currentLine=231079939;
 //BA.debugLineNum = 231079939;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231079940;
 //BA.debugLineNum = 231079940;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setstyle(b4j.example.vmvuecal __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=231931904;
 //BA.debugLineNum = 231931904;BA.debugLine="Sub SetStyle(sm As Map) As VMVueCal";
RDebugUtils.currentLine=231931905;
 //BA.debugLineNum = 231931905;BA.debugLine="VueCal.SetStyle(sm)";
__ref._vuecal /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=231931906;
 //BA.debugLineNum = 231931906;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231931907;
 //BA.debugLineNum = 231931907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _settabindex(b4j.example.vmvuecal __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=231866368;
 //BA.debugLineNum = 231866368;BA.debugLine="Sub SetTabIndex(ti As String) As VMVueCal";
RDebugUtils.currentLine=231866369;
 //BA.debugLineNum = 231866369;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=231866370;
 //BA.debugLineNum = 231866370;BA.debugLine="VueCal.SetTabIndex(ti)";
__ref._vuecal /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=231866371;
 //BA.debugLineNum = 231866371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231866372;
 //BA.debugLineNum = 231866372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _settime(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "settime", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "settime", new Object[] {_b}));}
RDebugUtils.currentLine=230752256;
 //BA.debugLineNum = 230752256;BA.debugLine="Sub SetTime(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=230752257;
 //BA.debugLineNum = 230752257;BA.debugLine="VueCal.SetAttr1(\":time\", b)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":time",(Object)(_b));
RDebugUtils.currentLine=230752258;
 //BA.debugLineNum = 230752258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=230752259;
 //BA.debugLineNum = 230752259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _settimestep(b4j.example.vmvuecal __ref,String _ts) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "settimestep", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "settimestep", new Object[] {_ts}));}
RDebugUtils.currentLine=231211008;
 //BA.debugLineNum = 231211008;BA.debugLine="Sub SetTimeStep(ts As String) As VMVueCal";
RDebugUtils.currentLine=231211009;
 //BA.debugLineNum = 231211009;BA.debugLine="If ts = \"\" Then Return Me";
if ((_ts).equals("")) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=231211010;
 //BA.debugLineNum = 231211010;BA.debugLine="VueCal.SetAttr1(\"time-step\",ts)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"time-step",(Object)(_ts));
RDebugUtils.currentLine=231211011;
 //BA.debugLineNum = 231211011;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231211012;
 //BA.debugLineNum = 231211012;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _settodaybutton(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "settodaybutton", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "settodaybutton", new Object[] {_b}));}
RDebugUtils.currentLine=231145472;
 //BA.debugLineNum = 231145472;BA.debugLine="Sub SetTodayButton(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=231145473;
 //BA.debugLineNum = 231145473;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=231145474;
 //BA.debugLineNum = 231145474;BA.debugLine="VueCal.SetAttr1(\"today-button\", True)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"today-button",(Object)(__c.True));
RDebugUtils.currentLine=231145475;
 //BA.debugLineNum = 231145475;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231145476;
 //BA.debugLineNum = 231145476;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setvif(b4j.example.vmvuecal __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=231997440;
 //BA.debugLineNum = 231997440;BA.debugLine="Sub SetVIf(vif As String) As VMVueCal";
RDebugUtils.currentLine=231997441;
 //BA.debugLineNum = 231997441;BA.debugLine="VueCal.SetVIf(vif)";
__ref._vuecal /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=231997442;
 //BA.debugLineNum = 231997442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231997443;
 //BA.debugLineNum = 231997443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setvshow(b4j.example.vmvuecal __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=232259584;
 //BA.debugLineNum = 232259584;BA.debugLine="Sub SetVShow(vif As String) As VMVueCal";
RDebugUtils.currentLine=232259585;
 //BA.debugLineNum = 232259585;BA.debugLine="VueCal.SetVShow(vif)";
__ref._vuecal /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=232259586;
 //BA.debugLineNum = 232259586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=232259587;
 //BA.debugLineNum = 232259587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmvuecal  _setxsmall(b4j.example.vmvuecal __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmvuecal";
if (Debug.shouldDelegate(ba, "setxsmall", true))
	 {return ((b4j.example.vmvuecal) Debug.delegate(ba, "setxsmall", new Object[] {_b}));}
RDebugUtils.currentLine=231800832;
 //BA.debugLineNum = 231800832;BA.debugLine="Sub SetXSmall(b As Boolean) As VMVueCal";
RDebugUtils.currentLine=231800833;
 //BA.debugLineNum = 231800833;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmvuecal)(this);};
RDebugUtils.currentLine=231800834;
 //BA.debugLineNum = 231800834;BA.debugLine="VueCal.SetAttr1(\"xsmall\", True)";
__ref._vuecal /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"xsmall",(Object)(__c.True));
RDebugUtils.currentLine=231800835;
 //BA.debugLineNum = 231800835;BA.debugLine="Return Me";
if (true) return (b4j.example.vmvuecal)(this);
RDebugUtils.currentLine=231800836;
 //BA.debugLineNum = 231800836;BA.debugLine="End Sub";
return null;
}
}