package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmrow_subs_0 {


public static RemoteObject  _addbr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddBR (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("addbr")) { return __ref.runUserSub(false, "vmrow","addbr", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Sub AddBR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="SetText(\"<br>\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmrow.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("<br>"))));
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
public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmrow","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 84;BA.debugLine="Sub AddChild(child As VMElement) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 86;BA.debugLine="Row.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 87;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmrow","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 140;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 142;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmrow.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 144;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmrow","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 112;BA.debugLine="Sub AddClass(c As String) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="Row.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 114;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 115;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddElements (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("addelements")) { return __ref.runUserSub(false, "vmrow","addelements", __ref, _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 28;BA.debugLine="Sub AddElements(lst As List) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="Row.AddElements(lst)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addelements" /*RemoteObject*/ ,(Object)(_lst));
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
public static RemoteObject  _addhr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddHR (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("addhr")) { return __ref.runUserSub(false, "vmrow","addhr", __ref);}
 BA.debugLineNum = 24;BA.debugLine="Sub AddHR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="SetText(\"<hr>\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmrow.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("<hr>"))));
 BA.debugLineNum = 26;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Row As VMElement";
vmrow._row = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_row",vmrow._row);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmrow._id = RemoteObject.createImmutable("");__ref.setField("_id",vmrow._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmrow._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmrow._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmrow._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmrow._banano);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmrow","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 12;BA.debugLine="Row.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 13;BA.debugLine="Row.SetTag(\"div\").AddClass(\"md-layout\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-layout")));
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
		Debug.PushSubsStack("Pop (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmrow","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 107;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmrow.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmrow","render", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmrow.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmrow","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 101;BA.debugLine="Sub SetAccent(b As Boolean) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="Row.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmrow.__c.getField(true,"True")));
 BA.debugLineNum = 103;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalignment(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("SetAlignment (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setalignment")) { return __ref.runUserSub(false, "vmrow","setalignment", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 43;BA.debugLine="Sub SetAlignment(a As String) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Row.AddClass(a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_a));
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
public static RemoteObject  _setalignmenttopcenter(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAlignmentTopCenter (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setalignmenttopcenter")) { return __ref.runUserSub(false, "vmrow","setalignmenttopcenter", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 48;BA.debugLine="Sub SetAlignmentTopCenter(b As Boolean) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="SetAlignment(\"md-alignment-top-center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmrow.class, "_setalignment" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-alignment-top-center")));
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
public static RemoteObject  _setalignmenttopleft(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAlignmentTopLeft (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setalignmenttopleft")) { return __ref.runUserSub(false, "vmrow","setalignmenttopleft", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 53;BA.debugLine="Sub SetAlignmentTopLeft(b As Boolean) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="SetAlignment(\"md-alignment-top-left\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmrow.class, "_setalignment" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-alignment-top-left")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmrow","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 118;BA.debugLine="Sub SetAttr(attr As Map) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Row.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 120;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetGutter (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setgutter")) { return __ref.runUserSub(false, "vmrow","setgutter", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 33;BA.debugLine="Sub SetGutter(b As Boolean) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="Row.SetGutter(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setgutter" /*RemoteObject*/ ,(Object)(vmrow.__c.getField(true,"True")));
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
		Debug.PushSubsStack("SetHidden (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("sethidden")) { return __ref.runUserSub(false, "vmrow","sethidden", __ref, _xsmall, _small, _medium, _large, _xlarge);}
Debug.locals.put("xsmall", _xsmall);
Debug.locals.put("small", _small);
Debug.locals.put("medium", _medium);
Debug.locals.put("large", _large);
Debug.locals.put("xlarge", _xlarge);
 BA.debugLineNum = 129;BA.debugLine="Sub SetHidden(xsmall As Boolean, small As Boolean,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="Row.SetHidden(xsmall, small, medium, large, xlarg";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethidden" /*RemoteObject*/ ,(Object)(_xsmall),(Object)(_small),(Object)(_medium),(Object)(_large),(Object)(_xlarge));
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
public static RemoteObject  _setnowrap(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetNoWrap (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setnowrap")) { return __ref.runUserSub(false, "vmrow","setnowrap", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 38;BA.debugLine="Sub SetNoWrap(b As Boolean) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="If b Then Row.AddClass(\"md-layout-nowrap\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-layout-nowrap")));};
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmrow","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 147;BA.debugLine="Sub SetPadding(p As Object) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 148;BA.debugLine="Row.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 149;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmrow","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 96;BA.debugLine="Sub SetPrimary(b As Boolean) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Row.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmrow.__c.getField(true,"True")));
 BA.debugLineNum = 98;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetSizes (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("setsizes")) { return __ref.runUserSub(false, "vmrow","setsizes", __ref, _xsmall, _small, _medium, _large, _xlarge);}
Debug.locals.put("xsmall", _xsmall);
Debug.locals.put("small", _small);
Debug.locals.put("medium", _medium);
Debug.locals.put("large", _large);
Debug.locals.put("xlarge", _xlarge);
 BA.debugLineNum = 134;BA.debugLine="Sub SetSizes(xsmall As Int, small As Int, medium A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="Row.SetSizes(xsmall, small, medium, large, xlarge";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setsizes" /*RemoteObject*/ ,(Object)(_xsmall),(Object)(_small),(Object)(_medium),(Object)(_large),(Object)(_xlarge));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmrow","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 124;BA.debugLine="Sub SetStyle(sm As Map) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="Row.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmrow","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 91;BA.debugLine="Sub SetText(t As Object) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="Row.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmrow","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 68;BA.debugLine="Sub SetVIf(vif As Object) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="Row.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmrow","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 63;BA.debugLine="Sub SetVModel(k As String) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="Row.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmrow","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 73;BA.debugLine="Sub SetVShow(vif As Object) As VMRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="Row.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 75;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmrow) ","vmrow",86,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmrow","tostring", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Return Row.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_row" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}