package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmlabel_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmlabel","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 156;BA.debugLine="Sub AddChild(child As VMElement) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 158;BA.debugLine="Label.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 159;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 160;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmlabel","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 163;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 165;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmlabel.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 167;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmlabel","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 150;BA.debugLine="Sub AddClass(c As String) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 151;BA.debugLine="Label.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmlabel","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 192;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmlabel.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 194;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Label As VMElement";
vmlabel._label = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_label",vmlabel._label);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmlabel._id = RemoteObject.createImmutable("");__ref.setField("_id",vmlabel._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmlabel._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmlabel._vue);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmlabel","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 9;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 10;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 11;BA.debugLine="Label.Initialize(vue, ID).SetTag(\"label\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("label")));
 BA.debugLineNum = 12;BA.debugLine="Label.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 13;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmlabel","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 188;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmlabel.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmlabel","render", __ref);}
 BA.debugLineNum = 184;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmlabel.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 186;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmlabel","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 170;BA.debugLine="Sub SetAttr(attr As Map) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 171;BA.debugLine="Label.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setbody1(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBody1 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setbody1")) { return __ref.runUserSub(false, "vmlabel","setbody1", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 66;BA.debugLine="Sub SetBody1(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="Label.SetBody1(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setbody1" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 68;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbody2(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBody2 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setbody2")) { return __ref.runUserSub(false, "vmlabel","setbody2", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 61;BA.debugLine="Sub SetBody2(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="Label.SetBody2(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setbody2" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setcaption(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCaption (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setcaption")) { return __ref.runUserSub(false, "vmlabel","setcaption", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 71;BA.debugLine="Sub SetCaption(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Label.SetCaption(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setcaption" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmlabel","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 76;BA.debugLine="Sub SetDisabled(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Label.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setdisplay1(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisplay1 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("setdisplay1")) { return __ref.runUserSub(false, "vmlabel","setdisplay1", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 31;BA.debugLine="Sub SetDisplay1(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="Label.SetDisplay1(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisplay1" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setdisplay2(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisplay2 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("setdisplay2")) { return __ref.runUserSub(false, "vmlabel","setdisplay2", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 26;BA.debugLine="Sub SetDisplay2(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="Label.SetDisplay2(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisplay2" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setdisplay3(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisplay3 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("setdisplay3")) { return __ref.runUserSub(false, "vmlabel","setdisplay3", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 21;BA.debugLine="Sub SetDisplay3(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="Label.SetDisplay3(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisplay3" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setdisplay4(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisplay4 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("setdisplay4")) { return __ref.runUserSub(false, "vmlabel","setdisplay4", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 16;BA.debugLine="Sub SetDisplay4(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 17;BA.debugLine="Label.SetDisplay4(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisplay4" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmlabel","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 144;BA.debugLine="Sub SetElevation(e As Int) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="Label.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 146;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seth1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetH1 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("seth1")) { return __ref.runUserSub(false, "vmlabel","seth1", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Sub SetH1 As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="Label.SetTag(\"h1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h1")));
 BA.debugLineNum = 105;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seth2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetH2 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("seth2")) { return __ref.runUserSub(false, "vmlabel","seth2", __ref);}
 BA.debugLineNum = 113;BA.debugLine="Sub SetH2 As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="Label.SetTag(\"h2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h2")));
 BA.debugLineNum = 115;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seth3(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetH3 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("seth3")) { return __ref.runUserSub(false, "vmlabel","seth3", __ref);}
 BA.debugLineNum = 119;BA.debugLine="Sub SetH3 As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="Label.SetTag(\"h3\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h3")));
 BA.debugLineNum = 121;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seth4(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetH4 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("seth4")) { return __ref.runUserSub(false, "vmlabel","seth4", __ref);}
 BA.debugLineNum = 124;BA.debugLine="Sub SetH4 As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="Label.SetTag(\"h4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h4")));
 BA.debugLineNum = 126;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seth5(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetH5 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("seth5")) { return __ref.runUserSub(false, "vmlabel","seth5", __ref);}
 BA.debugLineNum = 134;BA.debugLine="Sub SetH5 As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="Label.SetTag(\"h5\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h5")));
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
public static RemoteObject  _seth6(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetH6 (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("seth6")) { return __ref.runUserSub(false, "vmlabel","seth6", __ref);}
 BA.debugLineNum = 139;BA.debugLine="Sub SetH6 As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Label.SetTag(\"h6\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("h6")));
 BA.debugLineNum = 141;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadline(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHeadline (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("setheadline")) { return __ref.runUserSub(false, "vmlabel","setheadline", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 36;BA.debugLine="Sub SetHeadline(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="Label.SetHeadline(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setheadline" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setparagraph(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetParagraph (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setparagraph")) { return __ref.runUserSub(false, "vmlabel","setparagraph", __ref);}
 BA.debugLineNum = 98;BA.debugLine="Sub SetParagraph As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="Label.SetTag(\"p\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("p")));
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
public static RemoteObject  _setspan(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetSpan (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("setspan")) { return __ref.runUserSub(false, "vmlabel","setspan", __ref);}
 BA.debugLineNum = 129;BA.debugLine="Sub SetSpan As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="Label.SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 131;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 132;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmlabel","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 88;BA.debugLine="Sub SetStyle(sm As Map) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="Label.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _setsubheading(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSubHeading (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setsubheading")) { return __ref.runUserSub(false, "vmlabel","setsubheading", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 56;BA.debugLine="Sub SetSubHeading(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="Label.SetSubHeading(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setsubheading" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _settag(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("SetTag (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("settag")) { return __ref.runUserSub(false, "vmlabel","settag", __ref, _size);}
Debug.locals.put("size", _size);
 BA.debugLineNum = 108;BA.debugLine="Sub SetTag(size As String) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Label.SetTag(size)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(_size));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmlabel","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 93;BA.debugLine="Sub SetText(t As String) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="Label.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
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
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmlabel","settitle", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 41;BA.debugLine="Sub SetTitle(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="Label.SetTitle(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settitle" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _settransparent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTransparent (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("settransparent")) { return __ref.runUserSub(false, "vmlabel","settransparent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 46;BA.debugLine="Sub SetTransparent(b As Boolean) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="Label.SetTransparent(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settransparent" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setverticalalignmiddle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetVerticalAlignMiddle (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setverticalalignmiddle")) { return __ref.runUserSub(false, "vmlabel","setverticalalignmiddle", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Sub SetVerticalAlignMiddle As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Label.SetVerticalAlignMiddle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setverticalalignmiddle" /*RemoteObject*/ );
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
		Debug.PushSubsStack("SetVShow (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmlabel","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 81;BA.debugLine="Sub SetVShow(vif As String) As VMLabel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 83;BA.debugLine="Label.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmlabel) ","vmlabel",69,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmlabel","tostring", __ref);}
 BA.debugLineNum = 180;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="Return Label.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_label" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 182;BA.debugLine="End Sub";
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