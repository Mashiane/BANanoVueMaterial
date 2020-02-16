package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmradio_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmradio","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 53;BA.debugLine="Sub AddClass(c As String) As VMRadio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Radio.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmradio","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 99;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmradio.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Radio As VMElement";
vmradio._radio = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_radio",vmradio._radio);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmradio._id = RemoteObject.createImmutable("");__ref.setField("_id",vmradio._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmradio._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmradio._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmradio._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmradio._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmradio._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmradio._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmradio","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 16;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 17;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 18;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 19;BA.debugLine="Radio.Initialize(vue, ID).SetTag(\"md-radio\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-radio")));
 BA.debugLineNum = 20;BA.debugLine="SetOnChange(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmradio.class, "_setonchange" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 21;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmradio","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 95;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmradio.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmradio","render", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmradio.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmradio","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 59;BA.debugLine="Sub SetAttr(attr As Map) As VMRadio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Radio.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmradio","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 64;BA.debugLine="Sub SetDisabled(b As Boolean) As VMRadio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="Radio.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmradio","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 41;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="Radio.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 43;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonchange(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("SetOnChange (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setonchange")) { return __ref.runUserSub(false, "vmradio","setonchange", __ref, _source);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _sval = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("source", _source);
 BA.debugLineNum = 70;BA.debugLine="Sub SetOnChange(source As String) As VMRadio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="source = source.tolowercase";
Debug.JustUpdateDeviceLine();
_source = _source.runMethod(true,"toLowerCase");Debug.locals.put("source", _source);
 BA.debugLineNum = 72;BA.debugLine="Dim methodName As String  = $\"${source}_change\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmradio.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_source))),RemoteObject.createImmutable("_change")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 73;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmradio.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmradio.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 74;BA.debugLine="Dim sval As String";
Debug.JustUpdateDeviceLine();
_sval = RemoteObject.createImmutable("");Debug.locals.put("sval", _sval);
 BA.debugLineNum = 75;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmradio.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sval)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 76;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmradio.class, "_setattr" /*RemoteObject*/ ,(Object)(vmradio.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:change")),(_methodname)}))));
 BA.debugLineNum = 78;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 79;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmradio","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 35;BA.debugLine="Sub SetPrimary(b As Boolean) As VMRadio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="Radio.SetPrimary(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 37;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmradio","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 10;BA.debugLine="Sub SetTabIndex(ti As String) As VMRadio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="Radio.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
 BA.debugLineNum = 12;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 13;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmradio","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 30;BA.debugLine="Sub SetText(t As String) As VMRadio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="Radio.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 32;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmradio","setvalue", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 47;BA.debugLine="Sub SetValue(varName As Object, bind As Boolean) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="Radio.SetValue(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 49;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmradio","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 82;BA.debugLine="Sub SetVModel(k As String) As VMRadio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="Radio.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmradio","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 24;BA.debugLine="Sub SetVShow(vif As String) As VMRadio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 26;BA.debugLine="Radio.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
		Debug.PushSubsStack("ToString (vmradio) ","vmradio",84,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmradio","tostring", __ref);}
 BA.debugLineNum = 87;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="Return Radio.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_radio" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 89;BA.debugLine="End Sub";
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