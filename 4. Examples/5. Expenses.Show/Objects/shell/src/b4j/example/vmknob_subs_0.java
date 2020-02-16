package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmknob_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmknob","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 142;BA.debugLine="Sub AddClass(c As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="Knob.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 144;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 145;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Knob As VMElement";
vmknob._knob = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_knob",vmknob._knob);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmknob._id = RemoteObject.createImmutable("");__ref.setField("_id",vmknob._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmknob._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmknob._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmknob._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmknob._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmknob._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmknob._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmknob","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="BANano.DependsOnAsset(\"jquery.knob.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("jquery.knob.min.js")));
 BA.debugLineNum = 12;BA.debugLine="BANano.DependsOnAsset(\"tron-knob.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("tron-knob.js")));
 BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 17;BA.debugLine="Knob.Initialize(vue, ID).SetTag(\"input\").AddClass";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("input"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("knob"))).runClassMethod (b4j.example.vmelement.class, "_settype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("text")));
 BA.debugLineNum = 18;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmknob","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 162;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 163;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmknob.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 164;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmknob","render", __ref);}
 BA.debugLineNum = 158;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmknob.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setanglearc(RemoteObject __ref,RemoteObject _stepvalue) throws Exception{
try {
		Debug.PushSubsStack("SetAngleArc (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setanglearc")) { return __ref.runUserSub(false, "vmknob","setanglearc", __ref, _stepvalue);}
Debug.locals.put("stepvalue", _stepvalue);
 BA.debugLineNum = 50;BA.debugLine="Sub SetAngleArc(stepvalue As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Knob.SetAttr(CreateMap(\"data-angleArc\": stepvalue";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-angleArc")),(_stepvalue)}))));
 BA.debugLineNum = 52;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setangleoffset(RemoteObject __ref,RemoteObject _stepvalue) throws Exception{
try {
		Debug.PushSubsStack("SetAngleOffset (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setangleoffset")) { return __ref.runUserSub(false, "vmknob","setangleoffset", __ref, _stepvalue);}
Debug.locals.put("stepvalue", _stepvalue);
 BA.debugLineNum = 44;BA.debugLine="Sub SetAngleOffset(stepvalue As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Knob.SetAttr(CreateMap(\"data-angleOffset\": stepva";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-angleOffset")),(_stepvalue)}))));
 BA.debugLineNum = 46;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmknob","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 148;BA.debugLine="Sub SetAttr(attr As Map) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="Knob.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 150;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmknob","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 153;BA.debugLine="Sub SetDisabled(b As Boolean) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="Knob.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 155;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfgcolor(RemoteObject __ref,RemoteObject _stepvalue) throws Exception{
try {
		Debug.PushSubsStack("SetFgColor (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setfgcolor")) { return __ref.runUserSub(false, "vmknob","setfgcolor", __ref, _stepvalue);}
Debug.locals.put("stepvalue", _stepvalue);
 BA.debugLineNum = 74;BA.debugLine="Sub SetFgColor(stepvalue As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="Knob.SetAttr(CreateMap(\"data-fgColor\": stepvalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-fgColor")),(_stepvalue)}))));
 BA.debugLineNum = 76;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _skin) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vmknob","setheight", __ref, _skin);}
Debug.locals.put("skin", _skin);
 BA.debugLineNum = 105;BA.debugLine="Sub SetHeight(skin As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="Knob.SetAttr(CreateMap(\"data-height\": skin))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-height")),(_skin)}))));
 BA.debugLineNum = 107;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetKey (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmknob","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 131;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="Knob.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
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
public static RemoteObject  _setmax(RemoteObject __ref,RemoteObject _minvalue) throws Exception{
try {
		Debug.PushSubsStack("SetMax (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("setmax")) { return __ref.runUserSub(false, "vmknob","setmax", __ref, _minvalue);}
Debug.locals.put("minvalue", _minvalue);
 BA.debugLineNum = 111;BA.debugLine="Sub SetMax(minvalue As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="Knob.SetAttr(CreateMap(\"data-max\": minvalue))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-max")),(_minvalue)}))));
 BA.debugLineNum = 113;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmin(RemoteObject __ref,RemoteObject _minvalue) throws Exception{
try {
		Debug.PushSubsStack("SetMin (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("setmin")) { return __ref.runUserSub(false, "vmknob","setmin", __ref, _minvalue);}
Debug.locals.put("minvalue", _minvalue);
 BA.debugLineNum = 32;BA.debugLine="Sub SetMin(minvalue As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="Knob.SetAttr(CreateMap(\"data-min\": minvalue))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-min")),(_minvalue)}))));
 BA.debugLineNum = 34;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _name,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmknob","setname", __ref, _name, _bind);}
Debug.locals.put("name", _name);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 21;BA.debugLine="Sub SetName(name As String, bind As Boolean) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="Knob.SetName(name, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_name),(Object)(_bind));
 BA.debugLineNum = 23;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setreadonly(RemoteObject __ref,RemoteObject _stepvalue) throws Exception{
try {
		Debug.PushSubsStack("SetReadOnly (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setreadonly")) { return __ref.runUserSub(false, "vmknob","setreadonly", __ref, _stepvalue);}
Debug.locals.put("stepvalue", _stepvalue);
 BA.debugLineNum = 62;BA.debugLine="Sub SetReadOnly(stepvalue As Boolean) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="Knob.SetAttr(CreateMap(\"data-readOnly\": stepvalue";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-readOnly")),(_stepvalue)}))));
 BA.debugLineNum = 64;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrotation(RemoteObject __ref,RemoteObject _stepvalue) throws Exception{
try {
		Debug.PushSubsStack("SetRotation (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setrotation")) { return __ref.runUserSub(false, "vmknob","setrotation", __ref, _stepvalue);}
Debug.locals.put("stepvalue", _stepvalue);
 BA.debugLineNum = 68;BA.debugLine="Sub SetRotation(stepvalue As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="Knob.SetAttr(CreateMap(\"data-rotation\": stepvalue";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-rotation")),(_stepvalue)}))));
 BA.debugLineNum = 70;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setroundedcorners(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRoundedCorners (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setroundedcorners")) { return __ref.runUserSub(false, "vmknob","setroundedcorners", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 92;BA.debugLine="Sub SetRoundedCorners(b As Boolean) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmknob.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 94;BA.debugLine="Knob.SetAttr(CreateMap(\"data-linecap\":\"round\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-linecap")),(RemoteObject.createImmutable("round"))}))));
 BA.debugLineNum = 95;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setskin(RemoteObject __ref,RemoteObject _skin) throws Exception{
try {
		Debug.PushSubsStack("SetSkin (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setskin")) { return __ref.runUserSub(false, "vmknob","setskin", __ref, _skin);}
Debug.locals.put("skin", _skin);
 BA.debugLineNum = 80;BA.debugLine="Sub SetSkin(skin As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="Knob.SetAttr(CreateMap(\"data-skin\": skin))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-skin")),(_skin)}))));
 BA.debugLineNum = 82;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstep(RemoteObject __ref,RemoteObject _stepvalue) throws Exception{
try {
		Debug.PushSubsStack("SetStep (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setstep")) { return __ref.runUserSub(false, "vmknob","setstep", __ref, _stepvalue);}
Debug.locals.put("stepvalue", _stepvalue);
 BA.debugLineNum = 38;BA.debugLine="Sub SetStep(stepvalue As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="Knob.SetAttr(CreateMap(\"data-step\": stepvalue))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-step")),(_stepvalue)}))));
 BA.debugLineNum = 40;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstopper(RemoteObject __ref,RemoteObject _stepvalue) throws Exception{
try {
		Debug.PushSubsStack("SetStopper (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setstopper")) { return __ref.runUserSub(false, "vmknob","setstopper", __ref, _stepvalue);}
Debug.locals.put("stepvalue", _stepvalue);
 BA.debugLineNum = 56;BA.debugLine="Sub SetStopper(stepvalue As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="Knob.SetAttr(CreateMap(\"data-stopper\": stepvalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-stopper")),(_stepvalue)}))));
 BA.debugLineNum = 58;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmknob","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 121;BA.debugLine="Sub SetStyle(sm As Map) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="Knob.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 123;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setthickness(RemoteObject __ref,RemoteObject _thickness) throws Exception{
try {
		Debug.PushSubsStack("SetThickness (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setthickness")) { return __ref.runUserSub(false, "vmknob","setthickness", __ref, _thickness);}
Debug.locals.put("thickness", _thickness);
 BA.debugLineNum = 86;BA.debugLine="Sub SetThickness(thickness As Double) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Knob.SetAttr(CreateMap(\"data-thickness\": thicknes";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-thickness")),(_thickness)}))));
 BA.debugLineNum = 88;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmknob","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 126;BA.debugLine="Sub SetVIf(vif As Object) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="Knob.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _vmodel) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmknob","setvmodel", __ref, _vmodel);}
Debug.locals.put("vmodel", _vmodel);
 BA.debugLineNum = 26;BA.debugLine="Sub SetVModel(vmodel As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="Knob.SetVModel(vmodel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 28;BA.debugLine="Knob.SetValue(vmodel, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvalue" /*RemoteObject*/ ,(Object)(_vmodel),(Object)(vmknob.__c.getField(true,"True")));
 BA.debugLineNum = 29;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmknob","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 136;BA.debugLine="Sub SetVShow(vif As Object) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="Knob.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 138;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _skin) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmknob","setwidth", __ref, _skin);}
Debug.locals.put("skin", _skin);
 BA.debugLineNum = 99;BA.debugLine="Sub SetWidth(skin As String) As VMKnob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="Knob.SetAttr(CreateMap(\"data-width\": skin))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmknob.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-width")),(_skin)}))));
 BA.debugLineNum = 101;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmknob) ","vmknob",68,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmknob","tostring", __ref);}
 BA.debugLineNum = 116;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="Return Knob.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_knob" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 118;BA.debugLine="End Sub";
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