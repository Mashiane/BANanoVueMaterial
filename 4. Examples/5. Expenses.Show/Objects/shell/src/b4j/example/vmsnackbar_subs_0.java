package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmsnackbar_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmsnackbar","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 83;BA.debugLine="Sub AddChild(child As VMElement) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 85;BA.debugLine="Snackbar.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snackbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 86;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmsnackbar","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 127;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 129;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmsnackbar","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 109;BA.debugLine="Sub AddClass(c As String) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="Snackbar.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snackbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 111;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Snackbar As VMElement";
vmsnackbar._snackbar = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_snackbar",vmsnackbar._snackbar);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmsnackbar._id = RemoteObject.createImmutable("");__ref.setField("_id",vmsnackbar._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmsnackbar._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmsnackbar._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmsnackbar._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmsnackbar._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private bActive As Boolean";
vmsnackbar._bactive = RemoteObject.createImmutable(false);__ref.setField("_bactive",vmsnackbar._bactive);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmsnackbar._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmsnackbar._module);
 //BA.debugLineNum = 9;BA.debugLine="Private mKey As String";
vmsnackbar._mkey = RemoteObject.createImmutable("");__ref.setField("_mkey",vmsnackbar._mkey);
 //BA.debugLineNum = 10;BA.debugLine="Public Button As VMButton";
vmsnackbar._button = RemoteObject.createNew ("b4j.example.vmbutton");__ref.setField("_button",vmsnackbar._button);
 //BA.debugLineNum = 11;BA.debugLine="Private mName As String";
vmsnackbar._mname = RemoteObject.createImmutable("");__ref.setField("_mname",vmsnackbar._mname);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmsnackbar","hide", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 70;BA.debugLine="Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmsnackbar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 72;BA.debugLine="opt.Put(ID, False)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmsnackbar.__c.getField(true,"False"))));
 BA.debugLineNum = 73;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmsnackbar","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 17;BA.debugLine="Snackbar.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snackbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 18;BA.debugLine="Snackbar.SetTag(\"md-snackbar\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snackbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-snackbar")));
 BA.debugLineNum = 19;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 20;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 21;BA.debugLine="bActive = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmsnackbar.__c.getField(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="If ID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 23;BA.debugLine="SetActiveSync(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setactivesync" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 25;BA.debugLine="SetOnOpened";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setonopened" /*RemoteObject*/ );
 BA.debugLineNum = 26;BA.debugLine="SetOnClosed";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setonclosed" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="mKey = $\"${ID}message\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mkey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmsnackbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("message"))));
 BA.debugLineNum = 28;BA.debugLine="vue.SetStateSingle(mKey, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mkey" /*RemoteObject*/ )),(Object)(vmsnackbar.__c.getField(false,"Null")));
 BA.debugLineNum = 29;BA.debugLine="SetText1($\"{{ ${mKey} }}\"$)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_settext1" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmsnackbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_mkey" /*RemoteObject*/ )))),RemoteObject.createImmutable(" }}")))));
 BA.debugLineNum = 30;BA.debugLine="Button.Initialize(vue, \"snackbutton\", Me)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(BA.ObjectToString("snackbutton")),(Object)(__ref));
 BA.debugLineNum = 31;BA.debugLine="mName = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mname" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 32;BA.debugLine="Hide";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_hide" /*RemoteObject*/ );
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmsnackbar","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 104;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmsnackbar.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmsnackbar","render", __ref);}
 BA.debugLineNum = 66;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmsnackbar.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivesync(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetActiveSync (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setactivesync")) { return __ref.runUserSub(false, "vmsnackbar","setactivesync", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 59;BA.debugLine="private Sub SetActiveSync(v As String) As VMSnackb";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Snackbar.SetActiveSync(v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snackbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setactivesync" /*RemoteObject*/ ,(Object)(_v));
 BA.debugLineNum = 61;BA.debugLine="bActive = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmsnackbar.__c.getField(true,"True"));
 BA.debugLineNum = 62;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmsnackbar","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 115;BA.debugLine="Sub SetAttr(attr As Map) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Snackbar.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snackbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 117;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setduration(RemoteObject __ref,RemoteObject _varduration) throws Exception{
try {
		Debug.PushSubsStack("SetDuration (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("setduration")) { return __ref.runUserSub(false, "vmsnackbar","setduration", __ref, _varduration);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varDuration", _varduration);
 BA.debugLineNum = 140;BA.debugLine="Sub SetDuration(varDuration As Int) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="Dim pp As String = $\"${ID}duration\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsnackbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("duration")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 142;BA.debugLine="vue.SetStateSingle(pp, varDuration)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_varduration)));
 BA.debugLineNum = 143;BA.debugLine="SetAttr(CreateMap(\":md-duration\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsnackbar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-duration")),(_pp)}))));
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
public static RemoteObject  _setonclick(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnClick (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vmsnackbar","setonclick", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 37;BA.debugLine="Sub SetOnClick(methodName As String) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="mName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mname" /*RemoteObject*/ ,_methodname.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 39;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclosed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnClosed (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("setonclosed")) { return __ref.runUserSub(false, "vmsnackbar","setonclosed", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 188;BA.debugLine="private Sub SetOnClosed As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsnackbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_closed")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 190;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmsnackbar.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmsnackbar.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 191;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 192;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 193;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsnackbar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-closed")),(_methodname)}))));
 BA.debugLineNum = 195;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 196;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonopened(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnOpened (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("setonopened")) { return __ref.runUserSub(false, "vmsnackbar","setonopened", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 176;BA.debugLine="private Sub SetOnOpened As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="Dim methodName As String  = $\"${ID}_opened\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsnackbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_opened")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 178;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmsnackbar.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmsnackbar.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 179;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 180;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 181;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsnackbar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-opened")),(_methodname)}))));
 BA.debugLineNum = 183;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 184;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmsnackbar","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 134;BA.debugLine="Sub SetPadding(p As Object) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="Snackbar.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snackbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 136;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpersistent(RemoteObject __ref,RemoteObject _varpersistent) throws Exception{
try {
		Debug.PushSubsStack("SetPersistent (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setpersistent")) { return __ref.runUserSub(false, "vmsnackbar","setpersistent", __ref, _varpersistent);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varPersistent", _varpersistent);
 BA.debugLineNum = 148;BA.debugLine="Sub SetPersistent(varPersistent As Boolean) As VMS";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="Dim pp As String = $\"${ID}persistent\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsnackbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("persistent")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 150;BA.debugLine="vue.SetStateSingle(pp, varPersistent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_varpersistent)));
 BA.debugLineNum = 151;BA.debugLine="SetAttr(CreateMap(\":md-persistent\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsnackbar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-persistent")),(_pp)}))));
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
public static RemoteObject  _setposition(RemoteObject __ref,RemoteObject _varposition) throws Exception{
try {
		Debug.PushSubsStack("SetPosition (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("setposition")) { return __ref.runUserSub(false, "vmsnackbar","setposition", __ref, _varposition);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varPosition", _varposition);
 BA.debugLineNum = 156;BA.debugLine="Sub SetPosition(varPosition As Object) As VMSnackb";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="Dim pp As String = $\"${ID}position\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsnackbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("position")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 158;BA.debugLine="vue.SetStateSingle(pp, varPosition)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)(_varposition));
 BA.debugLineNum = 159;BA.debugLine="SetAttr(CreateMap(\":md-position\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsnackbar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-position")),(_pp)}))));
 BA.debugLineNum = 160;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpositioncenter(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionCenter (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("setpositioncenter")) { return __ref.runUserSub(false, "vmsnackbar","setpositioncenter", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 164;BA.debugLine="Sub SetPositionCenter(b As Boolean) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="SetPosition(\"center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setposition" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("center"))));
 BA.debugLineNum = 166;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpositionleft(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionLeft (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("setpositionleft")) { return __ref.runUserSub(false, "vmsnackbar","setpositionleft", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 170;BA.debugLine="Sub SetPositionLeft(b As Boolean) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 171;BA.debugLine="SetPosition(\"left\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_setposition" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("left"))));
 BA.debugLineNum = 172;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmsnackbar","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 121;BA.debugLine="Sub SetStyle(sm As Map) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="Snackbar.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_snackbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmsnackbar","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 90;BA.debugLine="Sub SetText(t As String) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="vue.SetStateSingle(mKey, t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mkey" /*RemoteObject*/ )),(Object)((_t)));
 BA.debugLineNum = 92;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext1(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText1 (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("settext1")) { return __ref.runUserSub(false, "vmsnackbar","settext1", __ref, _t);}
RemoteObject _span = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("t", _t);
 BA.debugLineNum = 96;BA.debugLine="private Sub SetText1(t As String) As VMSnackbar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Dim span As VMElement";
Debug.JustUpdateDeviceLine();
_span = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("span", _span);
 BA.debugLineNum = 98;BA.debugLine="span.Initialize(vue,$\"${ID}text\"$).SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
_span.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmsnackbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("text"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 99;BA.debugLine="span.Pop(Snackbar)";
Debug.JustUpdateDeviceLine();
_span.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_snackbar" /*RemoteObject*/ )));
 BA.debugLineNum = 100;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Show (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmsnackbar","show", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 76;BA.debugLine="Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmsnackbar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 78;BA.debugLine="opt.Put(ID, True)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmsnackbar.__c.getField(true,"True"))));
 BA.debugLineNum = 79;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _snackbutton_click(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("snackbutton_click (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("snackbutton_click")) { return __ref.runUserSub(false, "vmsnackbar","snackbutton_click", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 42;BA.debugLine="Sub snackbutton_click(e As BANanoEvent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="If mName = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mname" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 44;BA.debugLine="Log($\"VMSnackbar.snackbutton_click: 'SetOnClick'";
Debug.JustUpdateDeviceLine();
vmsnackbar.__c.runVoidMethod ("Log",(Object)((RemoteObject.createImmutable("VMSnackbar.snackbutton_click: 'SetOnClick' has not been set!"))));
 };
 BA.debugLineNum = 46;BA.debugLine="Hide";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsnackbar.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 47;BA.debugLine="BANano.CallSub(module, mName, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_mname" /*RemoteObject*/ )),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vmsnackbar.__c.getField(false,"Null")));
 BA.debugLineNum = 48;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmsnackbar) ","vmsnackbar",89,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmsnackbar","tostring", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="If bActive = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_bactive" /*RemoteObject*/ ),vmsnackbar.__c.getField(true,"False"))) { 
 BA.debugLineNum = 53;BA.debugLine="Log($\"VMSnackbar.SetActiveSync: '${ID}' has not";
Debug.JustUpdateDeviceLine();
vmsnackbar.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMSnackbar.SetActiveSync: '"),vmsnackbar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("' has not been activated!")))));
 };
 BA.debugLineNum = 55;BA.debugLine="Button.Pop(Snackbar)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_snackbar" /*RemoteObject*/ )));
 BA.debugLineNum = 56;BA.debugLine="Return Snackbar.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_snackbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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