package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtr_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmtr","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 98;BA.debugLine="Sub AddChild(child As VMElement) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 100;BA.debugLine="TR.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 101;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmtr","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 149;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 151;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtr.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 153;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"True"));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtr","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 128;BA.debugLine="Sub AddClass(c As String) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="TR.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 130;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"True"));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TR As VMElement";
vmtr._tr = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_tr",vmtr._tr);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtr._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtr._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtr._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtr._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmtr._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmtr._banano);
 //BA.debugLineNum = 7;BA.debugLine="Public HasContent As Boolean";
vmtr._hascontent = RemoteObject.createImmutable(false);__ref.setField("_hascontent",vmtr._hascontent);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _parentid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtr","initialize", __ref, _ba, _v, _sid, _parentid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("parentID", _parentid);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="TR.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 14;BA.debugLine="TR.SetTag(\"md-table-row\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-table-row")));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="HasContent = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"False"));
 BA.debugLineNum = 17;BA.debugLine="SetSlot(\"md-table-row\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtr.class, "_setslot" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-table-row")));
 BA.debugLineNum = 18;BA.debugLine="SetSlotScope(\"{ item }\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtr.class, "_setslotscope" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("{ item }")));
 BA.debugLineNum = 19;BA.debugLine="TR.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 20;BA.debugLine="TR.RemoveAttr(\":disabled\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 21;BA.debugLine="TR.RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show")));
 BA.debugLineNum = 22;BA.debugLine="TR.RemoveAttr(\"ref\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ref")));
 BA.debugLineNum = 23;BA.debugLine="TR.RemoveAttr(\"id\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("id")));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtr","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 123;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtr.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtr","render", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtr.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 95;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmtr","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 117;BA.debugLine="Sub SetAccent(b As Boolean) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="TR.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmtr.__c.getField(true,"True")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtr","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 135;BA.debugLine="Sub SetAttr(attr As Map) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="TR.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 137;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"True"));
 BA.debugLineNum = 138;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setautoselect(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAutoSelect (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setautoselect")) { return __ref.runUserSub(false, "vmtr","setautoselect", __ref, _b);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("b", _b);
 BA.debugLineNum = 46;BA.debugLine="Sub SetAutoSelect(b As Boolean) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="Dim pp As String = $\"${ID}autoselect\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtr.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("autoselect")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 48;BA.debugLine="vue.SetStateSingle(pp, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_b)));
 BA.debugLineNum = 49;BA.debugLine="If b Then SetAttr(CreateMap(\":md-auto-select\":pp)";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmtr.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtr.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-auto-select")),(_pp)}))));};
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmtr","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 157;BA.debugLine="Sub SetPadding(p As Object) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="TR.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmtr","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 112;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="TR.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmtr.__c.getField(true,"True")));
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
public static RemoteObject  _setselectable(RemoteObject __ref,RemoteObject _sel) throws Exception{
try {
		Debug.PushSubsStack("SetSelectable (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("setselectable")) { return __ref.runUserSub(false, "vmtr","setselectable", __ref, _sel);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("sel", _sel);
 BA.debugLineNum = 27;BA.debugLine="Sub SetSelectable(sel As String) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="Dim pp As String = $\"${ID}selectable\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtr.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("selectable")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 29;BA.debugLine="vue.SetStateSingle(pp, sel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_sel)));
 BA.debugLineNum = 30;BA.debugLine="SetAttr(CreateMap(\":md-selectable\":pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtr.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtr.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-selectable")),(_pp)}))));
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
public static RemoteObject  _setselectablemultiple(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSelectableMultiple (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setselectablemultiple")) { return __ref.runUserSub(false, "vmtr","setselectablemultiple", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 40;BA.debugLine="Sub SetSelectableMultiple(b As Boolean) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmtr.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 42;BA.debugLine="SetSelectable(\"multiple\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtr.class, "_setselectable" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("multiple")));
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
public static RemoteObject  _setselectablesingle(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSelectableSingle (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setselectablesingle")) { return __ref.runUserSub(false, "vmtr","setselectablesingle", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 34;BA.debugLine="Sub SetSelectableSingle(b As Boolean) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmtr.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 36;BA.debugLine="SetSelectable(\"single\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtr.class, "_setselectable" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("single")));
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
public static RemoteObject  _setslot(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("SetSlot (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setslot")) { return __ref.runUserSub(false, "vmtr","setslot", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 53;BA.debugLine="Sub SetSlot(s As String) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="SetAttr(CreateMap(\"slot\":s))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtr.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtr.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("slot")),(_s)}))));
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
public static RemoteObject  _setslotscope(RemoteObject __ref,RemoteObject _sc) throws Exception{
try {
		Debug.PushSubsStack("SetSlotScope (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setslotscope")) { return __ref.runUserSub(false, "vmtr","setslotscope", __ref, _sc);}
Debug.locals.put("sc", _sc);
 BA.debugLineNum = 63;BA.debugLine="Sub SetSlotScope(sc As String) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="SetAttr(CreateMap(\"slot-scope\": sc))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtr.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtr.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("slot-scope")),(_sc)}))));
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
public static RemoteObject  _setslottablerow(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSlotTableRow (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setslottablerow")) { return __ref.runUserSub(false, "vmtr","setslottablerow", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 58;BA.debugLine="Sub SetSlotTableRow(b As Boolean) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="If b Then SetSlot(\"md-table-row\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmtr.class, "_setslot" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-table-row")));};
 BA.debugLineNum = 60;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmtr","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 142;BA.debugLine="Sub SetStyle(sm As Map) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="TR.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 144;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"True"));
 BA.debugLineNum = 145;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 146;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtr","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 106;BA.debugLine="Sub SetText(t As Object) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="TR.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 108;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"True"));
 BA.debugLineNum = 109;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmtr","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 80;BA.debugLine="Sub SetVIf(vif As Object) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="TR.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 82;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"True"));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmtr","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 74;BA.debugLine="Sub SetVModel(k As String) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="TR.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 76;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"True"));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtr","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 86;BA.debugLine="Sub SetVShow(vif As Object) As VMTR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="TR.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 88;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmtr.__c.getField(true,"True"));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmtr) ","vmtr",104,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtr","tostring", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="TR.RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show")));
 BA.debugLineNum = 71;BA.debugLine="Return TR.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tr" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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