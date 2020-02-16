package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmswitch_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmswitch","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 51;BA.debugLine="Sub AddClass(c As String) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Switch.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 53;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmswitch","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 117;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmswitch.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Switch As VMElement";
vmswitch._switch = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_switch",vmswitch._switch);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmswitch._id = RemoteObject.createImmutable("");__ref.setField("_id",vmswitch._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmswitch._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmswitch._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmswitch._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmswitch._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private xmodel As String";
vmswitch._xmodel = RemoteObject.createImmutable("");__ref.setField("_xmodel",vmswitch._xmodel);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmswitch._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmswitch._module);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmswitch","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sval = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 14;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 15;BA.debugLine="Switch.Initialize(vue, ID).SetTag(\"md-switch\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-switch")));
 BA.debugLineNum = 16;BA.debugLine="xmodel = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xmodel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 17;BA.debugLine="Dim sval As String";
Debug.JustUpdateDeviceLine();
_sval = RemoteObject.createImmutable("");Debug.locals.put("sval", _sval);
 BA.debugLineNum = 18;BA.debugLine="SetOnChange(sval)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmswitch.class, "_setonchange" /*RemoteObject*/ ,(Object)((_sval)));
 BA.debugLineNum = 19;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmswitch","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 112;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmswitch.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmswitch","render", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmswitch.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmswitch","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 67;BA.debugLine="Sub SetAccent(b As Boolean) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="If b Then Switch.SetAccent(True)";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmswitch.__c.getField(true,"True")));};
 BA.debugLineNum = 69;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmswitch","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 57;BA.debugLine="Sub SetAttr(attr As Map) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Switch.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 59;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmswitch","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 45;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="Switch.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 47;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetID (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmswitch","setid", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 40;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="Switch.SetID(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmswitch","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 34;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="Switch.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
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
public static RemoteObject  _setonchange(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetOnChange (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setonchange")) { return __ref.runUserSub(false, "vmswitch","setonchange", __ref, _value);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("value", _value);
 BA.debugLineNum = 73;BA.debugLine="private Sub SetOnChange(value As Object) As VMSwit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="Private methodName As String = $\"${ID}_change\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmswitch.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_change")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 75;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmswitch.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmswitch.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 76;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmswitch.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_value}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 77;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmswitch.class, "_setattr" /*RemoteObject*/ ,(Object)(vmswitch.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:change")),(_methodname)}))));
 BA.debugLineNum = 79;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 80;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmswitch","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 62;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="If b Then Switch.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmswitch.__c.getField(true,"True")));};
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
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmswitch","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 27;BA.debugLine="Sub SetTabIndex(ti As String) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="Switch.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmswitch","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 22;BA.debugLine="Sub SetText(t As String) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="Switch.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 24;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetValue (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmswitch","setvalue", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 93;BA.debugLine="Sub SetValue(v As Object) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="SetAttr(CreateMap(\"value\": v))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmswitch.class, "_setattr" /*RemoteObject*/ ,(Object)(vmswitch.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("value")),_v}))));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmswitch","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 83;BA.debugLine="Sub SetVIf(vif As Object) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="Switch.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 85;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmswitch","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 98;BA.debugLine="Sub SetVModel(k As String) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="Switch.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 100;BA.debugLine="xmodel = k.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xmodel" /*RemoteObject*/ ,_k.runMethod(true,"toLowerCase"));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmswitch","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 88;BA.debugLine="Sub SetVShow(vif As Object) As VMSwitch";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="Switch.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmswitch) ","vmswitch",94,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmswitch","tostring", __ref);}
 BA.debugLineNum = 104;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="Return Switch.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 106;BA.debugLine="End Sub";
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