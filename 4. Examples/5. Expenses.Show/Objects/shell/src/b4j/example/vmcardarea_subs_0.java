package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmcardarea_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmcardarea","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 44;BA.debugLine="Sub AddChild(child As VMElement) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 46;BA.debugLine="CardArea.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
		Debug.PushSubsStack("AddChildren (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmcardarea","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 80;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 82;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcardarea.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 84;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmcardarea","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 62;BA.debugLine="Sub AddClass(c As String) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="CardArea.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public CardArea As VMElement";
vmcardarea._cardarea = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_cardarea",vmcardarea._cardarea);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmcardarea._id = RemoteObject.createImmutable("");__ref.setField("_id",vmcardarea._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmcardarea._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmcardarea._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmcardarea._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmcardarea._banano);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmcardarea","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 12;BA.debugLine="CardArea.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 13;BA.debugLine="CardArea.SetTag(\"md-card-area\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-card-area")));
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
		Debug.PushSubsStack("Pop (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmcardarea","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 57;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcardarea.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 59;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmcardarea","render", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcardarea.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmcardarea","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 68;BA.debugLine="Sub SetAttr(attr As Map) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="CardArea.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setinset(RemoteObject __ref,RemoteObject _varinset) throws Exception{
try {
		Debug.PushSubsStack("SetInset (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("setinset")) { return __ref.runUserSub(false, "vmcardarea","setinset", __ref, _varinset);}
Debug.locals.put("varInset", _varinset);
 BA.debugLineNum = 93;BA.debugLine="Sub SetInset(varInset As Boolean) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="SetAttr(CreateMap(\":md-inset\": varInset))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcardarea.class, "_setattr" /*RemoteObject*/ ,(Object)(vmcardarea.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-inset")),(_varinset)}))));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmcardarea","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 87;BA.debugLine="Sub SetPadding(p As Object) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="CardArea.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmcardarea","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 74;BA.debugLine="Sub SetStyle(sm As Map) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="CardArea.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmcardarea","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 51;BA.debugLine="Sub SetText(t As Object) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="CardArea.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
		Debug.PushSubsStack("SetVIf (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmcardarea","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 28;BA.debugLine="Sub SetVIf(vif As Object) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="CardArea.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
		Debug.PushSubsStack("SetVModel (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmcardarea","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 23;BA.debugLine="Sub SetVModel(k As String) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="CardArea.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
		Debug.PushSubsStack("SetVShow (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmcardarea","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 33;BA.debugLine="Sub SetVShow(vif As Object) As VMCardArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="CardArea.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
		Debug.PushSubsStack("ToString (vmcardarea) ","vmcardarea",38,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmcardarea","tostring", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="Return CardArea.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_cardarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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