package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmvuecal_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmvuecal","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 218;BA.debugLine="Sub AddClass(c As String) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 219;BA.debugLine="VueCal.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 220;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addevent(RemoteObject __ref,RemoteObject _eid,RemoteObject _estart,RemoteObject _eend,RemoteObject _etitle,RemoteObject _eicon,RemoteObject _econtent,RemoteObject _econtentfull,RemoteObject _eclass,RemoteObject _eallday) throws Exception{
try {
		Debug.PushSubsStack("AddEvent (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("addevent")) { return __ref.runUserSub(false, "vmvuecal","addevent", __ref, _eid, _estart, _eend, _etitle, _eicon, _econtent, _econtentfull, _eclass, _eallday);}
RemoteObject _event = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("eID", _eid);
Debug.locals.put("eStart", _estart);
Debug.locals.put("eEnd", _eend);
Debug.locals.put("eTitle", _etitle);
Debug.locals.put("eIcon", _eicon);
Debug.locals.put("eContent", _econtent);
Debug.locals.put("eContentFull", _econtentfull);
Debug.locals.put("eClass", _eclass);
Debug.locals.put("eAllDay", _eallday);
 BA.debugLineNum = 93;BA.debugLine="Sub AddEvent(eID As String, eStart As String, eEnd";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="Dim event As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_event = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_event = vmvuecal.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("event", _event);Debug.locals.put("event", _event);
 BA.debugLineNum = 95;BA.debugLine="event.Put(\"id\", eID)";
Debug.JustUpdateDeviceLine();
_event.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_eid)));
 BA.debugLineNum = 96;BA.debugLine="event.Put(\"start\", eStart)";
Debug.JustUpdateDeviceLine();
_event.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("start"))),(Object)((_estart)));
 BA.debugLineNum = 97;BA.debugLine="event.Put(\"end\", eEnd)";
Debug.JustUpdateDeviceLine();
_event.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("end"))),(Object)((_eend)));
 BA.debugLineNum = 98;BA.debugLine="event.Put(\"title\", eTitle)";
Debug.JustUpdateDeviceLine();
_event.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((_etitle)));
 BA.debugLineNum = 99;BA.debugLine="If eIcon <> \"\" Then event.Put(\"icon\", eIcon)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_eicon,BA.ObjectToString(""))) { 
_event.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icon"))),(Object)((_eicon)));};
 BA.debugLineNum = 100;BA.debugLine="If eContent <> \"\" Then event.Put(\"content\", eCont";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_econtent,BA.ObjectToString(""))) { 
_event.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("content"))),(Object)((_econtent)));};
 BA.debugLineNum = 101;BA.debugLine="If eContentFull <> \"\" Then event.Put(\"contentFull";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_econtentfull,BA.ObjectToString(""))) { 
_event.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("contentFull"))),(Object)((_econtentfull)));};
 BA.debugLineNum = 102;BA.debugLine="If eClass <> \"\" Then event.Put(\"class\", eClass)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_eclass,BA.ObjectToString(""))) { 
_event.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("class"))),(Object)((_eclass)));};
 BA.debugLineNum = 103;BA.debugLine="If eAllDay Then event.Put(\"allDay\", eAllDay)";
Debug.JustUpdateDeviceLine();
if (_eallday.<Boolean>get().booleanValue()) { 
_event.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("allDay"))),(Object)((_eallday)));};
 BA.debugLineNum = 104;BA.debugLine="events.Add(event)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_events" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_event.getObject())));
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public VueCal As VMElement";
vmvuecal._vuecal = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_vuecal",vmvuecal._vuecal);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmvuecal._id = RemoteObject.createImmutable("");__ref.setField("_id",vmvuecal._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmvuecal._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmvuecal._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmvuecal._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmvuecal._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private events As List";
vmvuecal._events = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_events",vmvuecal._events);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmvuecal._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmvuecal._module);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmvuecal","initialize", __ref, _ba, _v, _sid, _eventhandler, _width, _height);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _event = RemoteObject.declareNull("Object");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 16;BA.debugLine="BANano.DependsOnAsset(\"vuecal.css\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("vuecal.css")));
 BA.debugLineNum = 17;BA.debugLine="BANano.DependsOnAsset(\"vuecal.umd.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("vuecal.umd.min.js")));
 BA.debugLineNum = 18;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 19;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 21;BA.debugLine="VueCal.Initialize(vue, ID).SetTag(\"vue-cal\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("vue-cal")));
 BA.debugLineNum = 22;BA.debugLine="Width = VueCal.MakePx(Width)";
Debug.JustUpdateDeviceLine();
_width = __ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_makepx" /*RemoteObject*/ ,(Object)(_width));Debug.locals.put("Width", _width);
 BA.debugLineNum = 23;BA.debugLine="Height = VueCal.MakePx(Height)";
Debug.JustUpdateDeviceLine();
_height = __ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_makepx" /*RemoteObject*/ ,(Object)(_height));Debug.locals.put("Height", _height);
 BA.debugLineNum = 24;BA.debugLine="VueCal.SetWidth(Width)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setwidth" /*RemoteObject*/ ,(Object)(_width));
 BA.debugLineNum = 25;BA.debugLine="VueCal.SetHeight(Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setheight" /*RemoteObject*/ ,(Object)(_height));
 BA.debugLineNum = 26;BA.debugLine="events.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_events" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 27;BA.debugLine="InitializeEvents";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmvuecal.class, "_initializeevents" /*RemoteObject*/ );
 BA.debugLineNum = 28;BA.debugLine="Dim event As Object, e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_event = RemoteObject.createNew ("Object");Debug.locals.put("event", _event);
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 29;BA.debugLine="SetOnEventClick(event, e)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmvuecal.class, "_setoneventclick" /*RemoteObject*/ ,(Object)(_event),(Object)(_e));
 BA.debugLineNum = 30;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializeevents(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InitializeEvents (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("initializeevents")) { return __ref.runUserSub(false, "vmvuecal","initializeevents", __ref);}
RemoteObject _evename = RemoteObject.createImmutable("");
 BA.debugLineNum = 142;BA.debugLine="private Sub InitializeEvents As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="Dim eveName As String = $\"${ID}events\"$";
Debug.JustUpdateDeviceLine();
_evename = (RemoteObject.concat(RemoteObject.createImmutable(""),vmvuecal.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("events")));Debug.locals.put("eveName", _evename);Debug.locals.put("eveName", _evename);
 BA.debugLineNum = 144;BA.debugLine="vue.SetStateSingle(eveName, Array())";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_evename),(Object)((RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 145;BA.debugLine="VueCal.SetAttr1(\":events\", eveName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":events")),(Object)((_evename)));
 BA.debugLineNum = 146;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _px) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmvuecal","pop", __ref, _px);}
Debug.locals.put("px", _px);
 BA.debugLineNum = 238;BA.debugLine="Sub Pop(px As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 239;BA.debugLine="px.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_px.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmvuecal.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "vmvuecal","refresh", __ref);}
 BA.debugLineNum = 155;BA.debugLine="Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 156;BA.debugLine="SetEvents(events)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmvuecal.class, "_setevents" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_events" /*RemoteObject*/ )));
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmvuecal","render", __ref);}
 BA.debugLineNum = 234;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmvuecal.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmvuecal","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 224;BA.debugLine="Sub SetAttr(attr As Map) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 225;BA.debugLine="VueCal.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 226;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaultview(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetDefaultView (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("setdefaultview")) { return __ref.runUserSub(false, "vmvuecal","setdefaultview", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 125;BA.debugLine="Sub SetDefaultView(v As String) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="If v = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_v,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 127;BA.debugLine="VueCal.SetAttr1(\"default-view\", v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("default-view")),(Object)((_v)));
 BA.debugLineNum = 128;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaultviewday(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDefaultViewDay (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("setdefaultviewday")) { return __ref.runUserSub(false, "vmvuecal","setdefaultviewday", __ref);}
 BA.debugLineNum = 137;BA.debugLine="Sub SetDefaultViewDay As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="VueCal.SetAttr1(\"default-view\", \"day\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("default-view")),(Object)((RemoteObject.createImmutable("day"))));
 BA.debugLineNum = 139;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaultviewmonth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDefaultViewMonth (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("setdefaultviewmonth")) { return __ref.runUserSub(false, "vmvuecal","setdefaultviewmonth", __ref);}
 BA.debugLineNum = 131;BA.debugLine="Sub SetDefaultViewMonth As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="VueCal.SetAttr1(\"default-view\", \"month\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("default-view")),(Object)((RemoteObject.createImmutable("month"))));
 BA.debugLineNum = 133;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteditableevents(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetEditableEvents (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("seteditableevents")) { return __ref.runUserSub(false, "vmvuecal","seteditableevents", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 33;BA.debugLine="Sub SetEditableEvents(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 35;BA.debugLine="VueCal.SetAttr1(\"editable-events\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("editable-events")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 36;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setevents(RemoteObject __ref,RemoteObject _evelist) throws Exception{
try {
		Debug.PushSubsStack("SetEvents (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("setevents")) { return __ref.runUserSub(false, "vmvuecal","setevents", __ref, _evelist);}
RemoteObject _evename = RemoteObject.createImmutable("");
Debug.locals.put("eveList", _evelist);
 BA.debugLineNum = 149;BA.debugLine="Sub SetEvents(eveList As List) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="Dim eveName As String = $\"${ID}events\"$";
Debug.JustUpdateDeviceLine();
_evename = (RemoteObject.concat(RemoteObject.createImmutable(""),vmvuecal.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("events")));Debug.locals.put("eveName", _evename);Debug.locals.put("eveName", _evename);
 BA.debugLineNum = 151;BA.debugLine="vue.SetStateSingle(eveName, eveList)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_evename),(Object)((_evelist.getObject())));
 BA.debugLineNum = 152;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteventscountonyearview(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetEventsCountOnYearView (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("seteventscountonyearview")) { return __ref.runUserSub(false, "vmvuecal","seteventscountonyearview", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 58;BA.debugLine="Sub SetEventsCountOnYearView(b As Boolean) As VMVu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 60;BA.debugLine="VueCal.SetAttr1(\"events-count-on-year-view\", True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("events-count-on-year-view")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 61;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteventsonmonthview(RemoteObject __ref,RemoteObject _eom) throws Exception{
try {
		Debug.PushSubsStack("SetEventsOnMonthView (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("seteventsonmonthview")) { return __ref.runUserSub(false, "vmvuecal","seteventsonmonthview", __ref, _eom);}
Debug.locals.put("eom", _eom);
 BA.debugLineNum = 64;BA.debugLine="Sub SetEventsOnMonthView(eom As Object) As VMVueCa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="VueCal.SetAttr1(\"events-on-month-view\", eom)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("events-on-month-view")),(Object)(_eom));
 BA.debugLineNum = 66;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethidetitlebar(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHideTitleBar (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("sethidetitlebar")) { return __ref.runUserSub(false, "vmvuecal","sethidetitlebar", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 45;BA.debugLine="Sub SetHideTitleBar(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 47;BA.debugLine="VueCal.SetAttr1(\"hide-title-bar\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("hide-title-bar")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 48;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethideviewselector(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHideViewSelector (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("sethideviewselector")) { return __ref.runUserSub(false, "vmvuecal","sethideviewselector", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 81;BA.debugLine="Sub SetHideViewSelector(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 83;BA.debugLine="VueCal.SetAttr1(\"hide-view-selector\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("hide-view-selector")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 84;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethideweekends(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHideWeekends (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("sethideweekends")) { return __ref.runUserSub(false, "vmvuecal","sethideweekends", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 75;BA.debugLine="Sub SetHideWeekends(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 77;BA.debugLine="VueCal.SetAttr1(\"hide-weekends\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("hide-weekends")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 78;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _iid,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmvuecal","setid", __ref, _iid, _bind);}
Debug.locals.put("iID", _iid);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 197;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMVue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="VueCal.SetID(iID,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_iid),(Object)(_bind));
 BA.debugLineNum = 199;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmvuecal","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 207;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMVueC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 208;BA.debugLine="VueCal.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
 BA.debugLineNum = 209;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmaxdate(RemoteObject __ref,RemoteObject _maxdate) throws Exception{
try {
		Debug.PushSubsStack("SetMaxDate (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("setmaxdate")) { return __ref.runUserSub(false, "vmvuecal","setmaxdate", __ref, _maxdate);}
RemoteObject _maxd = RemoteObject.createImmutable("");
Debug.locals.put("maxDate", _maxdate);
 BA.debugLineNum = 166;BA.debugLine="Sub SetMaxDate(maxDate As String) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 167;BA.debugLine="Dim maxd As String = $\"${ID}maxdate\"$";
Debug.JustUpdateDeviceLine();
_maxd = (RemoteObject.concat(RemoteObject.createImmutable(""),vmvuecal.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("maxdate")));Debug.locals.put("maxd", _maxd);Debug.locals.put("maxd", _maxd);
 BA.debugLineNum = 168;BA.debugLine="vue.SetStateSingle(maxd, maxDate)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_maxd),(Object)((_maxdate)));
 BA.debugLineNum = 169;BA.debugLine="VueCal.SetAttr1(\":maxdate\", maxd)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":maxdate")),(Object)((_maxd)));
 BA.debugLineNum = 170;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmindate(RemoteObject __ref,RemoteObject _mindate) throws Exception{
try {
		Debug.PushSubsStack("SetMinDate (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("setmindate")) { return __ref.runUserSub(false, "vmvuecal","setmindate", __ref, _mindate);}
RemoteObject _mind = RemoteObject.createImmutable("");
Debug.locals.put("minDate", _mindate);
 BA.debugLineNum = 159;BA.debugLine="Sub SetMinDate(minDate As String) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="Dim mind As String = $\"${ID}mindate\"$";
Debug.JustUpdateDeviceLine();
_mind = (RemoteObject.concat(RemoteObject.createImmutable(""),vmvuecal.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("mindate")));Debug.locals.put("mind", _mind);Debug.locals.put("mind", _mind);
 BA.debugLineNum = 161;BA.debugLine="vue.SetStateSingle(mind, minDate)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_mind),(Object)((_mindate)));
 BA.debugLineNum = 162;BA.debugLine="VueCal.SetAttr1(\":mindate\", mind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":mindate")),(Object)((_mind)));
 BA.debugLineNum = 163;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _nam,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmvuecal","setname", __ref, _nam, _bind);}
Debug.locals.put("nam", _nam);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 202;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMV";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="VueCal.SetName(nam, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_nam),(Object)(_bind));
 BA.debugLineNum = 204;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoneventclick(RemoteObject __ref,RemoteObject _event,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetOnEventClick (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setoneventclick")) { return __ref.runUserSub(false, "vmvuecal","setoneventclick", __ref, _event, _e);}
RemoteObject _ekey = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("event", _event);
Debug.locals.put("e", _e);
 BA.debugLineNum = 51;BA.debugLine="private Sub SetOnEventClick(event As Object, e As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Dim eKey As String = $\"${ID}_click\"$";
Debug.JustUpdateDeviceLine();
_ekey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmvuecal.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")));Debug.locals.put("eKey", _ekey);Debug.locals.put("eKey", _ekey);
 BA.debugLineNum = 53;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_ekey),(Object)(vmvuecal.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_event,(_e)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 54;BA.debugLine="VueCal.SetAttr1(\":on-event-click\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":on-event-click")),(Object)((_cb.getObject())));
 BA.debugLineNum = 55;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowalldayevents(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetShowAllDayEvents (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("setshowalldayevents")) { return __ref.runUserSub(false, "vmvuecal","setshowalldayevents", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 39;BA.debugLine="Sub SetShowAllDayEvents(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 41;BA.debugLine="VueCal.SetAttr1(\"show-all-day-events\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("show-all-day-events")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 42;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowweeknumbers(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetShowWeekNumbers (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setshowweeknumbers")) { return __ref.runUserSub(false, "vmvuecal","setshowweeknumbers", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 87;BA.debugLine="Sub SetShowWeekNumbers(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 89;BA.debugLine="VueCal.SetAttr1(\"show-week-numbers\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("show-week-numbers")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 90;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstartweekonsunday(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStartWeekOnSunday (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("setstartweekonsunday")) { return __ref.runUserSub(false, "vmvuecal","setstartweekonsunday", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 107;BA.debugLine="Sub SetStartWeekOnSunday(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 109;BA.debugLine="VueCal.SetAttr1(\"start-week-on-sunday\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("start-week-on-sunday")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 110;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmvuecal","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 187;BA.debugLine="Sub SetStyle(sm As Map) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 188;BA.debugLine="VueCal.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 189;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmvuecal","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 180;BA.debugLine="Sub SetTabIndex(ti As String) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="If ti = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ti,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 182;BA.debugLine="VueCal.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
 BA.debugLineNum = 183;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settime(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTime (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("settime")) { return __ref.runUserSub(false, "vmvuecal","settime", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 70;BA.debugLine="Sub SetTime(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="VueCal.SetAttr1(\":time\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":time")),(Object)((_b)));
 BA.debugLineNum = 72;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settimestep(RemoteObject __ref,RemoteObject _ts) throws Exception{
try {
		Debug.PushSubsStack("SetTimeStep (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("settimestep")) { return __ref.runUserSub(false, "vmvuecal","settimestep", __ref, _ts);}
Debug.locals.put("ts", _ts);
 BA.debugLineNum = 119;BA.debugLine="Sub SetTimeStep(ts As String) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="If ts = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ts,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 121;BA.debugLine="VueCal.SetAttr1(\"time-step\",ts)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("time-step")),(Object)((_ts)));
 BA.debugLineNum = 122;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settodaybutton(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTodayButton (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("settodaybutton")) { return __ref.runUserSub(false, "vmvuecal","settodaybutton", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 113;BA.debugLine="Sub SetTodayButton(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 115;BA.debugLine="VueCal.SetAttr1(\"today-button\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("today-button")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 116;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmvuecal","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 192;BA.debugLine="Sub SetVIf(vif As String) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="VueCal.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 194;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmvuecal","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 212;BA.debugLine="Sub SetVShow(vif As String) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 213;BA.debugLine="VueCal.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 214;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setxsmall(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetXSmall (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("setxsmall")) { return __ref.runUserSub(false, "vmvuecal","setxsmall", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 174;BA.debugLine="Sub SetXSmall(b As Boolean) As VMVueCal";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 175;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmvuecal.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 176;BA.debugLine="VueCal.SetAttr1(\"xsmall\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("xsmall")),(Object)((vmvuecal.__c.getField(true,"True"))));
 BA.debugLineNum = 177;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmvuecal) ","vmvuecal",106,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmvuecal","tostring", __ref);}
 BA.debugLineNum = 230;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="Return VueCal.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_vuecal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}