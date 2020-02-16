package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmalert_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmalert","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 43;BA.debugLine="Sub AddClass(c As String) As VMAlert";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Alert.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 45;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Alert As VMElement";
vmalert._alert = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_alert",vmalert._alert);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmalert._id = RemoteObject.createImmutable("");__ref.setField("_id",vmalert._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmalert._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmalert._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmalert._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmalert._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private bActive As Boolean";
vmalert._bactive = RemoteObject.createImmutable(false);__ref.setField("_bactive",vmalert._bactive);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object  'ignore";
vmalert._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmalert._module);
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
vmalert._bstatic = RemoteObject.createImmutable(false);__ref.setField("_bstatic",vmalert._bstatic);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmalert","hide", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 30;BA.debugLine="Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 32;BA.debugLine="opt.Put(ID, False)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmalert.__c.getField(true,"False"))));
 BA.debugLineNum = 33;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmalert","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 14;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 15;BA.debugLine="Alert.Initialize(vue, ID).SetTag(\"md-dialog-alert";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dialog-alert")));
 BA.debugLineNum = 16;BA.debugLine="bActive = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmalert.__c.getField(true,"False"));
 BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 18;BA.debugLine="SetActiveSync(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmalert.class, "_setactivesync" /*RemoteObject*/ ,(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 21;BA.debugLine="bStatic = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bstatic" /*RemoteObject*/ ,vmalert.__c.getField(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmalert","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 102;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmalert.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmalert","render", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmalert.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivesync(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("SetActiveSync (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setactivesync")) { return __ref.runUserSub(false, "vmalert","setactivesync", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 54;BA.debugLine="private Sub SetActiveSync(a As Object) As VMAlert";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="Alert.SetActiveSync(a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setactivesync" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_a)));
 BA.debugLineNum = 56;BA.debugLine="bActive = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmalert.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmalert","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 49;BA.debugLine="Sub SetAttr(attr As Map) As VMAlert";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="Alert.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 51;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setconfirmtext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetConfirmText (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setconfirmtext")) { return __ref.runUserSub(false, "vmalert","setconfirmtext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 70;BA.debugLine="Sub SetConfirmText(t As String) As VMAlert";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="If bStatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 72;BA.debugLine="Alert.SetAttr(CreateMap(\"md-confirm-text\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-confirm-text")),(_t)}))));
 BA.debugLineNum = 73;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 75;BA.debugLine="vue.SetState(CreateMap(\"confirmtext\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("confirmtext")),(_t)}))));
 BA.debugLineNum = 76;BA.debugLine="Alert.SetAttr(CreateMap(\":md-confirm-text\":\"confi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-confirm-text")),(RemoteObject.createImmutable("confirmtext"))}))));
 BA.debugLineNum = 77;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcontent(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetContent (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("setcontent")) { return __ref.runUserSub(false, "vmalert","setcontent", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 60;BA.debugLine="Sub SetContent(c As String) As VMAlert";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="If bStatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 62;BA.debugLine="Alert.SetAttr(CreateMap(\"md-content\": c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-content")),(_c)}))));
 BA.debugLineNum = 63;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 65;BA.debugLine="vue.SetState(CreateMap(\"alertmessage\":c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("alertmessage")),(_c)}))));
 BA.debugLineNum = 66;BA.debugLine="Alert.SetAttr(CreateMap(\":md-content\": \"alertmess";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-content")),(RemoteObject.createImmutable("alertmessage"))}))));
 BA.debugLineNum = 67;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatic(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStatic (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("setstatic")) { return __ref.runUserSub(false, "vmalert","setstatic", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 25;BA.debugLine="Sub SetStatic(b As Boolean) As VMAlert";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="bStatic = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bstatic" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 27;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmalert","settitle", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 80;BA.debugLine="Sub SetTitle(t As String) As VMAlert";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="If bStatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 82;BA.debugLine="Alert.SetAttr(CreateMap(\"md-title\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-title")),(_t)}))));
 BA.debugLineNum = 83;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 85;BA.debugLine="vue.SetState(CreateMap(\"alerttitle\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("alerttitle")),(_t)}))));
 BA.debugLineNum = 86;BA.debugLine="Alert.SetAttr(CreateMap(\":md-title\":\"alerttitle\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-title")),(RemoteObject.createImmutable("alerttitle"))}))));
 BA.debugLineNum = 87;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmalert","show", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 36;BA.debugLine="Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmalert.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 38;BA.debugLine="opt.Put(ID, True)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmalert.__c.getField(true,"True"))));
 BA.debugLineNum = 39;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmalert) ","vmalert",30,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmalert","tostring", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="If bActive = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_bactive" /*RemoteObject*/ ),vmalert.__c.getField(true,"False"))) { 
 BA.debugLineNum = 93;BA.debugLine="Log($\"VMAlert.SetActiveSync: '${ID}' has not bee";
Debug.JustUpdateDeviceLine();
vmalert.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMAlert.SetActiveSync: '"),vmalert.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("' has not been activated!")))));
 };
 BA.debugLineNum = 95;BA.debugLine="Return Alert.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_alert" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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