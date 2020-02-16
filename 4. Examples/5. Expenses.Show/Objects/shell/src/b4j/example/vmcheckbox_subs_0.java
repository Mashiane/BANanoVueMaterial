package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmcheckbox_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmcheckbox","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 69;BA.debugLine="Sub AddClass(c As String) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="CheckBox.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 71;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddToContainer (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmcheckbox","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 114;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmcheckbox.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public CheckBox As VMElement";
vmcheckbox._checkbox = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_checkbox",vmcheckbox._checkbox);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmcheckbox._id = RemoteObject.createImmutable("");__ref.setField("_id",vmcheckbox._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmcheckbox._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmcheckbox._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmcheckbox._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmcheckbox._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private xmodel As String";
vmcheckbox._xmodel = RemoteObject.createImmutable("");__ref.setField("_xmodel",vmcheckbox._xmodel);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmcheckbox._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmcheckbox._module);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmcheckbox","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
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
 BA.debugLineNum = 14;BA.debugLine="CheckBox.Initialize(vue, ID).SetTag(\"md-checkbox\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-checkbox")));
 BA.debugLineNum = 15;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 16;BA.debugLine="SetOnChange(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcheckbox.class, "_setonchange" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 17;BA.debugLine="xmodel = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xmodel" /*RemoteObject*/ ,BA.ObjectToString(""));
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
		Debug.PushSubsStack("Pop (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmcheckbox","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 108;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcheckbox.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmcheckbox","render", __ref);}
 BA.debugLineNum = 104;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcheckbox.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmcheckbox","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 75;BA.debugLine="Sub SetAttr(attr As Map) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="CheckBox.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmcheckbox","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 62;BA.debugLine="Sub SetDisabled(b As Boolean) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="CheckBox.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setindeterminate(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetIndeterminate (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setindeterminate")) { return __ref.runUserSub(false, "vmcheckbox","setindeterminate", __ref);}
 BA.debugLineNum = 41;BA.debugLine="Sub SetIndeterminate As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="If xmodel = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xmodel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 43;BA.debugLine="Log($\"VMCheckBox.${ID} - you need to set the v-m";
Debug.JustUpdateDeviceLine();
vmcheckbox.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMCheckBox."),vmcheckbox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(" - you need to set the v-model first!")))));
 };
 BA.debugLineNum = 45;BA.debugLine="vue.SetStateSingle(xmodel, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_xmodel" /*RemoteObject*/ )),(Object)((vmcheckbox.__c.getField(true,"True"))));
 BA.debugLineNum = 46;BA.debugLine="CheckBox.SetAttr(CreateMap(\"indeterminate\":True))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmcheckbox.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("indeterminate")),(vmcheckbox.__c.getField(true,"True"))}))));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmcheckbox","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 51;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="CheckBox.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
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
public static RemoteObject  _setonchange(RemoteObject __ref,RemoteObject _source) throws Exception{
try {
		Debug.PushSubsStack("SetOnChange (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setonchange")) { return __ref.runUserSub(false, "vmcheckbox","setonchange", __ref, _source);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _sval = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("source", _source);
 BA.debugLineNum = 81;BA.debugLine="Sub SetOnChange(source As String) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="source = source.tolowercase";
Debug.JustUpdateDeviceLine();
_source = _source.runMethod(true,"toLowerCase");Debug.locals.put("source", _source);
 BA.debugLineNum = 83;BA.debugLine="Dim methodName As String = $\"${source}_change\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmcheckbox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_source))),RemoteObject.createImmutable("_change")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 84;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmcheckbox.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmcheckbox.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 85;BA.debugLine="Dim sval As String";
Debug.JustUpdateDeviceLine();
_sval = RemoteObject.createImmutable("");Debug.locals.put("sval", _sval);
 BA.debugLineNum = 86;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmcheckbox.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sval)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 87;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcheckbox.class, "_setattr" /*RemoteObject*/ ,(Object)(vmcheckbox.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:change")),(_methodname)}))));
 BA.debugLineNum = 89;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmcheckbox","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 36;BA.debugLine="Sub SetPrimary(b As Boolean) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="CheckBox.SetPrimary(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 38;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmcheckbox","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 21;BA.debugLine="Sub SetTabIndex(ti As String) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="CheckBox.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmcheckbox","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 26;BA.debugLine="Sub SetText(t As String) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="CheckBox.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 28;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _varname) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmcheckbox","setvalue", __ref, _varname);}
Debug.locals.put("varName", _varname);
 BA.debugLineNum = 57;BA.debugLine="Sub SetValue(varName As Object) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="CheckBox.SetValue(varName, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(vmcheckbox.__c.getField(true,"False")));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmcheckbox","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 93;BA.debugLine="Sub SetVModel(k As String) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="xmodel = k";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xmodel" /*RemoteObject*/ ,_k);
 BA.debugLineNum = 95;BA.debugLine="CheckBox.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 96;BA.debugLine="vue.SetStateSingle(xmodel, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_xmodel" /*RemoteObject*/ )),(Object)(vmcheckbox.__c.getField(false,"Null")));
 BA.debugLineNum = 97;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vshow) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmcheckbox","setvshow", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 31;BA.debugLine="Sub SetVShow(vshow As String) As VMCheckBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="CheckBox.SetVShow(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vshow));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmcheckbox) ","vmcheckbox",41,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmcheckbox","tostring", __ref);}
 BA.debugLineNum = 100;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="Return CheckBox.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_checkbox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 102;BA.debugLine="End Sub";
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