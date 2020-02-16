package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmth_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmth","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 44;BA.debugLine="Sub AddChild(child As VMElement) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 46;BA.debugLine="TH.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmth","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 90;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 92;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmth.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 94;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmth","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 72;BA.debugLine="Sub AddClass(c As String) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="TH.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 74;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public TH As VMElement";
vmth._th = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_th",vmth._th);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmth._id = RemoteObject.createImmutable("");__ref.setField("_id",vmth._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmth._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmth._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmth._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmth._banano);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmth","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 12;BA.debugLine="TH.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 13;BA.debugLine="TH.SetTag(\"md-table-head\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-table-head")));
 BA.debugLineNum = 14;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 15;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmth","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 67;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmth.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmth","render", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmth.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmth","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 61;BA.debugLine="Sub SetAccent(b As Boolean) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="TH.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmth.__c.getField(true,"True")));
 BA.debugLineNum = 63;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmth","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 78;BA.debugLine="Sub SetAttr(attr As Map) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="TH.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmth","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 97;BA.debugLine="Sub SetPadding(p As Object) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="TH.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmth","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 56;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="TH.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmth.__c.getField(true,"True")));
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
		Debug.PushSubsStack("SetStyle (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmth","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 84;BA.debugLine="Sub SetStyle(sm As Map) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="TH.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmth","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 51;BA.debugLine="Sub SetText(t As Object) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="TH.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmth","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 28;BA.debugLine="Sub SetVIf(vif As Object) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="TH.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmth","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 23;BA.debugLine="Sub SetVModel(k As String) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="TH.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 25;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmth","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 33;BA.debugLine="Sub SetVShow(vif As Object) As VMTH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="TH.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 35;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmth) ","vmth",100,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmth","tostring", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="Return TH.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_th" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 21;BA.debugLine="End Sub";
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