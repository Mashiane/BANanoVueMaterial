package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmslider_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmslider","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 114;BA.debugLine="Sub AddClass(c As String) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="Slider.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Slider As VMElement";
vmslider._slider = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_slider",vmslider._slider);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmslider._id = RemoteObject.createImmutable("");__ref.setField("_id",vmslider._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmslider._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmslider._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private InputInt As VMElement";
vmslider._inputint = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_inputint",vmslider._inputint);
 //BA.debugLineNum = 7;BA.debugLine="Private lbl As VMLabel";
vmslider._lbl = RemoteObject.createNew ("b4j.example.vmlabel");__ref.setField("_lbl",vmslider._lbl);
 //BA.debugLineNum = 8;BA.debugLine="Private labelText As String";
vmslider._labeltext = RemoteObject.createImmutable("");__ref.setField("_labeltext",vmslider._labeltext);
 //BA.debugLineNum = 9;BA.debugLine="Private vmodelText As String";
vmslider._vmodeltext = RemoteObject.createImmutable("");__ref.setField("_vmodeltext",vmslider._vmodeltext);
 //BA.debugLineNum = 10;BA.debugLine="Private labelOnTop As Boolean";
vmslider._labelontop = RemoteObject.createImmutable(false);__ref.setField("_labelontop",vmslider._labelontop);
 //BA.debugLineNum = 11;BA.debugLine="Private module As Object";
vmslider._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmslider._module);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmslider","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 22;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 23;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 24;BA.debugLine="Slider.Initialize(vue, ID).SetTag(\"vue-material-s";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("vue-material-slider")));
 BA.debugLineNum = 25;BA.debugLine="InputInt.Initialize(v,$\"${sid}parent\"$).SetTag(\"d";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmslider.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sid))),RemoteObject.createImmutable("parent"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 26;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmslider.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sid))),RemoteObject.createImmutable("label")))));
 BA.debugLineNum = 27;BA.debugLine="labelText = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_labeltext" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 28;BA.debugLine="labelOnTop = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_labelontop" /*RemoteObject*/ ,vmslider.__c.getField(true,"False"));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmslider","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 144;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmslider.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 146;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmslider","render", __ref);}
 BA.debugLineNum = 140;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmslider.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmslider","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 126;BA.debugLine="Sub SetAttr(attr As Map) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="Slider.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmslider","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 87;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="Slider.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 89;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmslider","setid", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 71;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Slider.SetID(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 73;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinvert(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetInvert (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setinvert")) { return __ref.runUserSub(false, "vmslider","setinvert", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 59;BA.debugLine="Sub SetInvert(b As Boolean) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="SetAttr(CreateMap(\":invert\": b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmslider.class, "_setattr" /*RemoteObject*/ ,(Object)(vmslider.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":invert")),(_b)}))));
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
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _lbltext) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmslider","setlabel", __ref, _lbltext);}
Debug.locals.put("lblText", _lbltext);
 BA.debugLineNum = 43;BA.debugLine="Sub SetLabel(lblText As Object) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="labelText = lblText";
Debug.JustUpdateDeviceLine();
__ref.setField ("_labeltext" /*RemoteObject*/ ,BA.ObjectToString(_lbltext));
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
public static RemoteObject  _setlabelontop(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetLabelOnTop (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setlabelontop")) { return __ref.runUserSub(false, "vmslider","setlabelontop", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 38;BA.debugLine="Sub SetLabelOnTop(b As Boolean) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="labelOnTop = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_labelontop" /*RemoteObject*/ ,_b);
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
public static RemoteObject  _setmax(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetMax (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("setmax")) { return __ref.runUserSub(false, "vmslider","setmax", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 82;BA.debugLine="Sub SetMax(m As Int) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="SetAttr(CreateMap(\":max\": m))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmslider.class, "_setattr" /*RemoteObject*/ ,(Object)(vmslider.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":max")),(_m)}))));
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
public static RemoteObject  _setmin(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetMin (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setmin")) { return __ref.runUserSub(false, "vmslider","setmin", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 76;BA.debugLine="Sub SetMin(m As Int) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="SetAttr(CreateMap(\":min\": m))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmslider.class, "_setattr" /*RemoteObject*/ ,(Object)(vmslider.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":min")),(_m)}))));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmslider","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 49;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="Slider.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmslider","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 120;BA.debugLine="Sub SetStyle(m As Map) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="InputInt.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
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
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmslider","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 32;BA.debugLine="Sub SetTabIndex(ti As String) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="Slider.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _setthumblabel(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetThumbLabel (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setthumblabel")) { return __ref.runUserSub(false, "vmslider","setthumblabel", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 54;BA.debugLine="Sub SetThumbLabel(b As Boolean) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="SetAttr(CreateMap(\":thumbLabel\": b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmslider.class, "_setattr" /*RemoteObject*/ ,(Object)(vmslider.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":thumbLabel")),(_b)}))));
 BA.debugLineNum = 56;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmslider","setvalue", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 102;BA.debugLine="Sub SetValue(v As Object) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="SetAttr(CreateMap(\"value\": v))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmslider.class, "_setattr" /*RemoteObject*/ ,(Object)(vmslider.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("value")),_v}))));
 BA.debugLineNum = 104;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvertical(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetVertical (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("setvertical")) { return __ref.runUserSub(false, "vmslider","setvertical", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 64;BA.debugLine="Sub SetVertical(b As Boolean) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="SetAttr(CreateMap(\":vertical\": b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmslider.class, "_setattr" /*RemoteObject*/ ,(Object)(vmslider.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":vertical")),(_b)}))));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmslider","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 92;BA.debugLine="Sub SetVIf(vif As Object) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="Slider.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 94;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmslider","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 107;BA.debugLine="Sub SetVModel(k As String) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="Slider.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 109;BA.debugLine="vmodelText = k";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vmodeltext" /*RemoteObject*/ ,_k);
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmslider","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 97;BA.debugLine="Sub SetVShow(vif As Object) As VMSlider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="Slider.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 99;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmslider) ","vmslider",88,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmslider","tostring", __ref);}
RemoteObject _mmodel = RemoteObject.createImmutable("");
 BA.debugLineNum = 131;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="Dim mModel As String = $\"{{ ${vmodelText} }}\"$";
Debug.JustUpdateDeviceLine();
_mmodel = (RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmslider.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_vmodeltext" /*RemoteObject*/ )))),RemoteObject.createImmutable(" }}")));Debug.locals.put("mModel", _mmodel);Debug.locals.put("mModel", _mmodel);
 BA.debugLineNum = 133;BA.debugLine="lbl.SetText($\"${labelText}: ${mModel}\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmslider.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_labeltext" /*RemoteObject*/ )))),RemoteObject.createImmutable(": "),vmslider.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mmodel))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 134;BA.debugLine="If labelOnTop Then InputInt.AddClass(\"dontwrap\")";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_labelontop" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("dontwrap")));};
 BA.debugLineNum = 135;BA.debugLine="lbl.Pop(InputInt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ )));
 BA.debugLineNum = 136;BA.debugLine="Slider.Pop(InputInt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_slider" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ )));
 BA.debugLineNum = 137;BA.debugLine="Return InputInt.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 138;BA.debugLine="End Sub";
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