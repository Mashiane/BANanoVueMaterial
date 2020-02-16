package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtd_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmtd","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 74;BA.debugLine="Sub AddChild(child As VMElement) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 76;BA.debugLine="TD.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmtd","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 120;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 122;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtd.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 124;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtd","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 102;BA.debugLine="Sub AddClass(c As String) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="TD.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TD As VMElement";
vmtd._td = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_td",vmtd._td);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtd._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtd._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtd._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtd._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmtd._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmtd._banano);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtd","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 12;BA.debugLine="TD.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 13;BA.debugLine="TD.SetTag(\"md-table-cell\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-table-cell")));
 BA.debugLineNum = 14;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 15;BA.debugLine="TD.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 16;BA.debugLine="TD.RemoveAttr(\":disabled\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 17;BA.debugLine="TD.RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show")));
 BA.debugLineNum = 18;BA.debugLine="TD.RemoveAttr(\"ref\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ref")));
 BA.debugLineNum = 19;BA.debugLine="TD.RemoveAttr(\"id\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 20;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtd","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 97;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtd.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtd","render", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtd.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 71;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmtd","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 91;BA.debugLine="Sub SetAccent(b As Boolean) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="TD.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmtd.__c.getField(true,"True")));
 BA.debugLineNum = 93;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtd","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 108;BA.debugLine="Sub SetAttr(attr As Map) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="TD.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _l) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmtd","setlabel", __ref, _l);}
Debug.locals.put("l", _l);
 BA.debugLineNum = 46;BA.debugLine="Sub SetLabel(l As String) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="SetAttr(CreateMap(\"md-label\":l))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtd.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtd.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-label")),(_l)}))));
 BA.debugLineNum = 48;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumeric(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetNumeric (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setnumeric")) { return __ref.runUserSub(false, "vmtd","setnumeric", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 34;BA.debugLine="Sub SetNumeric(b As Boolean) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="If b Then";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 36;BA.debugLine="SetAttr(CreateMap(\"md-numeric\":\"true\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtd.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtd.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-numeric")),(RemoteObject.createImmutable("true"))}))));
 };
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmtd","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 127;BA.debugLine="Sub SetPadding(p As Object) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="TD.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 129;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmtd","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 86;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="TD.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmtd.__c.getField(true,"True")));
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
public static RemoteObject  _setsortby(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("SetSortBy (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setsortby")) { return __ref.runUserSub(false, "vmtd","setsortby", __ref, _i);}
Debug.locals.put("i", _i);
 BA.debugLineNum = 41;BA.debugLine="Sub SetSortBy(i As String) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="SetAttr(CreateMap(\"md-sort-by\":i))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtd.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtd.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-sort-by")),(_i)}))));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmtd","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 114;BA.debugLine="Sub SetStyle(sm As Map) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="TD.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtd","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 81;BA.debugLine="Sub SetText(t As Object) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="TD.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 83;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 84;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmtd","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 56;BA.debugLine="Sub SetVIf(vif As Object) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="TD.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetVisible (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "vmtd","setvisible", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 29;BA.debugLine="Sub SetVisible(b As Boolean) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="TD.SetVisible(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvisible" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 31;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmtd","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 51;BA.debugLine="Sub SetVModel(k As String) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="TD.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtd","setvshow", __ref, _vif);}
RemoteObject _colshow = RemoteObject.createImmutable("");
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 61;BA.debugLine="Sub SetVShow(vif As Boolean) As VMTD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="Dim colShow As String = $\"${ID}show\"$";
Debug.JustUpdateDeviceLine();
_colshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtd.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("show")));Debug.locals.put("colShow", _colshow);Debug.locals.put("colShow", _colshow);
 BA.debugLineNum = 63;BA.debugLine="vue.SetStateSingle(colShow, vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_colshow),(Object)((_vif)));
 BA.debugLineNum = 64;BA.debugLine="TD.SetVShow(colShow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_colshow));
 BA.debugLineNum = 65;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmtd) ","vmtd",98,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtd","tostring", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="TD.RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show")));
 BA.debugLineNum = 26;BA.debugLine="Return TD.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_td" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="End Sub";
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