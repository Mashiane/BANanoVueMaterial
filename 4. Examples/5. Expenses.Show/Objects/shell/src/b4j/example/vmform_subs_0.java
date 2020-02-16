package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmform_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmform) ","vmform",58,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmform","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 20;BA.debugLine="Sub AddClass(c As String) As VMForm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="Form.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_form" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Form As VMElement";
vmform._form = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_form",vmform._form);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmform._id = RemoteObject.createImmutable("");__ref.setField("_id",vmform._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmform._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmform._vue);
 //BA.debugLineNum = 6;BA.debugLine="Public Container As VMContainer";
vmform._container = RemoteObject.createNew ("b4j.example.vmcontainer");__ref.setField("_container",vmform._container);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmform._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmform._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmform) ","vmform",58,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmform","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 12;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 13;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 14;BA.debugLine="Form.Initialize(vue, ID).SetTag(\"form\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_form" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("form")));
 BA.debugLineNum = 15;BA.debugLine="Container.Initialize(vue, sid & \"grid\", eventHand";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.concat(_sid,RemoteObject.createImmutable("grid"))),(Object)(_eventhandler));
 BA.debugLineNum = 16;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 17;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmform) ","vmform",58,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmform","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 45;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmform.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmform) ","vmform",58,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmform","render", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmform.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmform) ","vmform",58,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmform","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 31;BA.debugLine="Sub SetAttr(attr As Map) As VMForm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="Form.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_form" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 33;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnovalidate(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetNoValidate (vmform) ","vmform",58,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("setnovalidate")) { return __ref.runUserSub(false, "vmform","setnovalidate", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 25;BA.debugLine="Sub SetNoValidate(b As Boolean) As VMForm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="SetAttr(CreateMap(\":novalidate\": b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmform.class, "_setattr" /*RemoteObject*/ ,(Object)(vmform.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":novalidate")),(_b)}))));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmform) ","vmform",58,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmform","tostring", __ref);}
 BA.debugLineNum = 36;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="Form.SetText(Container.ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_form" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="Return Form.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_form" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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