package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmcol_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmcol","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 64;BA.debugLine="Sub AddChild(child As VMElement) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 66;BA.debugLine="Col.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 67;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmcol","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 110;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 112;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcol.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmcol","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 92;BA.debugLine="Sub AddClass(c As String) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="Col.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addelements(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddElements (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("addelements")) { return __ref.runUserSub(false, "vmcol","addelements", __ref, _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 18;BA.debugLine="Sub AddElements(lst As List) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="Col.AddElements(lst)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addelements" /*RemoteObject*/ ,(Object)(_lst));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Col As VMElement";
vmcol._col = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_col",vmcol._col);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmcol._id = RemoteObject.createImmutable("");__ref.setField("_id",vmcol._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmcol._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmcol._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmcol._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmcol._banano);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmcol","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 12;BA.debugLine="Col.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 13;BA.debugLine="Col.SetTag(\"div\").AddClass(\"md-layout-item\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-layout-item")));
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
		Debug.PushSubsStack("Pop (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmcol","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 87;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcol.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmcol","render", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcol.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmcol","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 81;BA.debugLine="Sub SetAccent(b As Boolean) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="Col.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmcol.__c.getField(true,"True")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmcol","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 98;BA.debugLine="Sub SetAttr(attr As Map) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="Col.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setgutter(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetGutter (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setgutter")) { return __ref.runUserSub(false, "vmcol","setgutter", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 33;BA.debugLine="Sub SetGutter(b As Boolean) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="Col.SetGutter(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setgutter" /*RemoteObject*/ ,(Object)(vmcol.__c.getField(true,"True")));
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
public static RemoteObject  _sethidden(RemoteObject __ref,RemoteObject _xsmall,RemoteObject _small,RemoteObject _medium,RemoteObject _large,RemoteObject _xlarge) throws Exception{
try {
		Debug.PushSubsStack("SetHidden (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("sethidden")) { return __ref.runUserSub(false, "vmcol","sethidden", __ref, _xsmall, _small, _medium, _large, _xlarge);}
Debug.locals.put("xsmall", _xsmall);
Debug.locals.put("small", _small);
Debug.locals.put("medium", _medium);
Debug.locals.put("large", _large);
Debug.locals.put("xlarge", _xlarge);
 BA.debugLineNum = 23;BA.debugLine="Sub SetHidden(xsmall As Boolean, small As Boolean,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="Col.SetHidden(xsmall, small, medium, large, xlarg";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethidden" /*RemoteObject*/ ,(Object)(_xsmall),(Object)(_small),(Object)(_medium),(Object)(_large),(Object)(_xlarge));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmcol","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 117;BA.debugLine="Sub SetPadding(p As Object) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="Col.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 119;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmcol","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 76;BA.debugLine="Sub SetPrimary(b As Boolean) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Col.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmcol.__c.getField(true,"True")));
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
public static RemoteObject  _setsizes(RemoteObject __ref,RemoteObject _xsmall,RemoteObject _small,RemoteObject _medium,RemoteObject _large,RemoteObject _xlarge) throws Exception{
try {
		Debug.PushSubsStack("SetSizes (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setsizes")) { return __ref.runUserSub(false, "vmcol","setsizes", __ref, _xsmall, _small, _medium, _large, _xlarge);}
Debug.locals.put("xsmall", _xsmall);
Debug.locals.put("small", _small);
Debug.locals.put("medium", _medium);
Debug.locals.put("large", _large);
Debug.locals.put("xlarge", _xlarge);
 BA.debugLineNum = 28;BA.debugLine="Sub SetSizes(xsmall As Int, small As Int, medium A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="Col.SetSizes(xsmall, small, medium, large, xlarge";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setsizes" /*RemoteObject*/ ,(Object)(_xsmall),(Object)(_small),(Object)(_medium),(Object)(_large),(Object)(_xlarge));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmcol","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 104;BA.debugLine="Sub SetStyle(sm As Map) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="Col.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 106;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 107;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmcol","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 71;BA.debugLine="Sub SetText(t As Object) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Col.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmcol","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 48;BA.debugLine="Sub SetVIf(vif As Object) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="Col.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 50;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmcol","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 43;BA.debugLine="Sub SetVModel(k As String) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Col.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmcol","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 53;BA.debugLine="Sub SetVShow(vif As Object) As VMCol";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Col.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmcol) ","vmcol",45,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmcol","tostring", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="Return Col.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_col" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}