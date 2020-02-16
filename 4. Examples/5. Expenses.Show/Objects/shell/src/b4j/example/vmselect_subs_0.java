package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmselect_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmselect","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 205;BA.debugLine="Sub AddChild(child As VMElement) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 206;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 207;BA.debugLine="Combo.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 208;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 209;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmselect","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 234;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 236;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 238;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmselect","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 44;BA.debugLine="Sub AddClass(c As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Combo.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 46;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _additem(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("AddItem (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("additem")) { return __ref.runUserSub(false, "vmselect","additem", __ref, _k, _v);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 76;BA.debugLine="Sub AddItem(k As String, v As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 78;BA.debugLine="el.Initialize(vue,k).SetTag(\"md-option\").SetName(";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_k)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-option"))).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_k),(Object)(vmselect.__c.getField(true,"False"))).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(vmselect.__c.getField(true,"False"))).runClassMethod (b4j.example.vmelement.class, "_setvalue" /*RemoteObject*/ ,(Object)(_k),(Object)(vmselect.__c.getField(true,"False"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_v));
 BA.debugLineNum = 79;BA.debugLine="el.Pop(Combo)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_combo" /*RemoteObject*/ )));
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
public static RemoteObject  _additem1(RemoteObject __ref,RemoteObject _k,RemoteObject _v,RemoteObject _disabled) throws Exception{
try {
		Debug.PushSubsStack("AddItem1 (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("additem1")) { return __ref.runUserSub(false, "vmselect","additem1", __ref, _k, _v, _disabled);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
Debug.locals.put("disabled", _disabled);
 BA.debugLineNum = 83;BA.debugLine="Sub AddItem1(k As String, v As String,disabled As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 85;BA.debugLine="el.Initialize(vue,k).SetTag(\"md-option\").SetName(";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_k)).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-option"))).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_k),(Object)(vmselect.__c.getField(true,"False"))).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(vmselect.__c.getField(true,"False"))).runClassMethod (b4j.example.vmelement.class, "_setvalue" /*RemoteObject*/ ,(Object)(_k),(Object)(vmselect.__c.getField(true,"False"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_v)).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_disabled));
 BA.debugLineNum = 86;BA.debugLine="el.Pop(Combo)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_combo" /*RemoteObject*/ )));
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
public static RemoteObject  _additems(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("AddItems (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("additems")) { return __ref.runUserSub(false, "vmselect","additems", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 68;BA.debugLine="Sub AddItems(m As Map) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 70;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 71;BA.debugLine="AddItem(k, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_additem" /*RemoteObject*/ ,(Object)(_k),(Object)(BA.ObjectToString(_v)));
 }
}Debug.locals.put("k", _k);
;
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmselect","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 343;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 344;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmselect.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 345;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Private Combo As VMElement";
vmselect._combo = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_combo",vmselect._combo);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmselect._id = RemoteObject.createImmutable("");__ref.setField("_id",vmselect._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmselect._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmselect._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private ComboInt As VMField";
vmselect._comboint = RemoteObject.createNew ("b4j.example.vmfield");__ref.setField("_comboint",vmselect._comboint);
 //BA.debugLineNum = 7;BA.debugLine="Private lbl As VMLabel";
vmselect._lbl = RemoteObject.createNew ("b4j.example.vmlabel");__ref.setField("_lbl",vmselect._lbl);
 //BA.debugLineNum = 8;BA.debugLine="Private hasHelp As Boolean";
vmselect._hashelp = RemoteObject.createImmutable(false);__ref.setField("_hashelp",vmselect._hashelp);
 //BA.debugLineNum = 9;BA.debugLine="Private ht As VMElement";
vmselect._ht = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_ht",vmselect._ht);
 //BA.debugLineNum = 10;BA.debugLine="Private et As VMElement";
vmselect._et = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_et",vmselect._et);
 //BA.debugLineNum = 11;BA.debugLine="Private BANano As BANano   'ignore";
vmselect._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmselect._banano);
 //BA.debugLineNum = 12;BA.debugLine="Private hasError As Boolean";
vmselect._haserror = RemoteObject.createImmutable(false);__ref.setField("_haserror",vmselect._haserror);
 //BA.debugLineNum = 13;BA.debugLine="Private xname As String";
vmselect._xname = RemoteObject.createImmutable("");__ref.setField("_xname",vmselect._xname);
 //BA.debugLineNum = 14;BA.debugLine="Private xmodel As String";
vmselect._xmodel = RemoteObject.createImmutable("");__ref.setField("_xmodel",vmselect._xmodel);
 //BA.debugLineNum = 15;BA.debugLine="Private module As Object";
vmselect._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmselect._module);
 //BA.debugLineNum = 16;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmselect","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sval = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 20;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 21;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 22;BA.debugLine="Combo.Initialize(vue, ID).SetTag(\"md-select\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-select")));
 BA.debugLineNum = 23;BA.debugLine="ComboInt.Initialize(v, ID, $\"${ID}field\"$, module";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_comboint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("field")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 24;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sid))),RemoteObject.createImmutable("label")))));
 BA.debugLineNum = 25;BA.debugLine="SetName(sid)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_setname" /*RemoteObject*/ ,(Object)(_sid));
 BA.debugLineNum = 26;BA.debugLine="hasHelp = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmselect.__c.getField(true,"False"));
 BA.debugLineNum = 27;BA.debugLine="hasError = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmselect.__c.getField(true,"False"));
 BA.debugLineNum = 28;BA.debugLine="xname = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xname" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 29;BA.debugLine="xmodel = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xmodel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 30;BA.debugLine="Dim sval As String";
Debug.JustUpdateDeviceLine();
_sval = RemoteObject.createImmutable("");Debug.locals.put("sval", _sval);
 BA.debugLineNum = 31;BA.debugLine="SetOnSelected(sval)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_setonselected" /*RemoteObject*/ ,(Object)(_sval));
 BA.debugLineNum = 32;BA.debugLine="SetOnOpened";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_setonopened" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="SetOnClosed";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_setonclosed" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmselect","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 188;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmselect.class, "_tostring" /*RemoteObject*/ )));
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
		Debug.PushSubsStack("Render (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmselect","render", __ref);}
 BA.debugLineNum = 184;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmselect.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmselect","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 222;BA.debugLine="Sub SetAccent(b As Boolean) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 223;BA.debugLine="Combo.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 224;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 225;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmselect","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 50;BA.debugLine="Sub SetAttr(attr As Map) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Combo.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 52;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdatasource(RemoteObject __ref,RemoteObject _sourcetable,RemoteObject _sourcefield,RemoteObject _displayfield) throws Exception{
try {
		Debug.PushSubsStack("SetDataSource (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("setdatasource")) { return __ref.runUserSub(false, "vmselect","setdatasource", __ref, _sourcetable, _sourcefield, _displayfield);}
RemoteObject _intsel = RemoteObject.createImmutable(0);
RemoteObject _krow = RemoteObject.createImmutable("");
RemoteObject _drow = RemoteObject.createImmutable("");
RemoteObject _option = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sourceTable", _sourcetable);
Debug.locals.put("sourceField", _sourcefield);
Debug.locals.put("displayField", _displayfield);
 BA.debugLineNum = 122;BA.debugLine="Sub SetDataSource(sourceTable As String, sourceFie";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 123;BA.debugLine="sourceTable = sourceTable.ToLowerCase";
Debug.JustUpdateDeviceLine();
_sourcetable = _sourcetable.runMethod(true,"toLowerCase");Debug.locals.put("sourceTable", _sourcetable);
 BA.debugLineNum = 124;BA.debugLine="sourceField = sourceField.ToLowerCase";
Debug.JustUpdateDeviceLine();
_sourcefield = _sourcefield.runMethod(true,"toLowerCase");Debug.locals.put("sourceField", _sourcefield);
 BA.debugLineNum = 125;BA.debugLine="displayField = displayField.tolowercase";
Debug.JustUpdateDeviceLine();
_displayfield = _displayfield.runMethod(true,"toLowerCase");Debug.locals.put("displayField", _displayfield);
 BA.debugLineNum = 127;BA.debugLine="Dim intSel As Int = 0";
Debug.JustUpdateDeviceLine();
_intsel = BA.numberCast(int.class, 0);Debug.locals.put("intSel", _intsel);Debug.locals.put("intSel", _intsel);
 BA.debugLineNum = 128;BA.debugLine="If sourceTable <> \"\" Then intSel = BANano.parseIn";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_sourcetable,BA.ObjectToString(""))) { 
_intsel = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_intsel))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("intSel", _intsel);};
 BA.debugLineNum = 129;BA.debugLine="If sourceField <> \"\" Then intSel = BANano.parseIn";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_sourcefield,BA.ObjectToString(""))) { 
_intsel = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_intsel))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("intSel", _intsel);};
 BA.debugLineNum = 130;BA.debugLine="If displayField <> \"\" Then intSel = BANano.parseI";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_displayfield,BA.ObjectToString(""))) { 
_intsel = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_intsel))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("intSel", _intsel);};
 BA.debugLineNum = 132;BA.debugLine="If intSel = 3 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_intsel,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 133;BA.debugLine="Dim kRow As String = $\"row.${sourceField}\"$";
Debug.JustUpdateDeviceLine();
_krow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sourcefield))),RemoteObject.createImmutable("")));Debug.locals.put("kRow", _krow);Debug.locals.put("kRow", _krow);
 BA.debugLineNum = 134;BA.debugLine="Dim dRow As String = $\"row.${displayField}\"$";
Debug.JustUpdateDeviceLine();
_drow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_displayfield))),RemoteObject.createImmutable("")));Debug.locals.put("dRow", _drow);Debug.locals.put("dRow", _drow);
 BA.debugLineNum = 135;BA.debugLine="Dim option As VMElement";
Debug.JustUpdateDeviceLine();
_option = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("option", _option);
 BA.debugLineNum = 136;BA.debugLine="option.Initialize(vue,\"\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 137;BA.debugLine="option.SetTag(\"md-option\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-option")));
 BA.debugLineNum = 138;BA.debugLine="option.SetVFor(\"row\", sourceTable)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setvfor" /*RemoteObject*/ ,(Object)(BA.ObjectToString("row")),(Object)(_sourcetable));
 BA.debugLineNum = 139;BA.debugLine="option.SetID($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 140;BA.debugLine="option.SetKey($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable(""))))),(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 141;BA.debugLine="option.SetValue($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setvalue" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 142;BA.debugLine="option.SetName($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 143;BA.debugLine="option.SetText($\"{{ ${dRow} }}\"$)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_drow))),RemoteObject.createImmutable(" }}")))));
 BA.debugLineNum = 144;BA.debugLine="option.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 145;BA.debugLine="option.RemoveAttr(\":disabled\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 146;BA.debugLine="option.RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show")));
 BA.debugLineNum = 147;BA.debugLine="option.Pop(Combo)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_combo" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdense(RemoteObject __ref,RemoteObject _vardense) throws Exception{
try {
		Debug.PushSubsStack("SetDense (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("setdense")) { return __ref.runUserSub(false, "vmselect","setdense", __ref, _vardense);}
Debug.locals.put("varDense", _vardense);
 BA.debugLineNum = 301;BA.debugLine="Sub SetDense(varDense As Boolean) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="If varDense = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vardense,vmselect.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 303;BA.debugLine="If varDense Then SetAttr(CreateMap(\":md-dense\": v";
Debug.JustUpdateDeviceLine();
if (_vardense.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmselect.class, "_setattr" /*RemoteObject*/ ,(Object)(vmselect.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-dense")),(_vardense)}))));};
 BA.debugLineNum = 304;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 305;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmselect","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 268;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 269;BA.debugLine="Combo.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 270;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seterrortext(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("SetErrorText (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("seterrortext")) { return __ref.runUserSub(false, "vmselect","seterrortext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 159;BA.debugLine="Sub SetErrorText(txt As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="If txt = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_txt,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 161;BA.debugLine="hasError = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmselect.__c.getField(true,"True"));
 BA.debugLineNum = 162;BA.debugLine="et = Combo.SetErrorText(txt)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_et" /*RemoteObject*/ ,__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_txt)));
 BA.debugLineNum = 163;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethelpertext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetHelperText (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("sethelpertext")) { return __ref.runUserSub(false, "vmselect","sethelpertext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 152;BA.debugLine="Sub SetHelperText(t As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 154;BA.debugLine="hasHelp = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmselect.__c.getField(true,"True"));
 BA.debugLineNum = 155;BA.debugLine="ht = Combo.SetHelperText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ht" /*RemoteObject*/ ,__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_t)));
 BA.debugLineNum = 156;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,282);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmselect","setid", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 282;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 283;BA.debugLine="Combo.SetID(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 284;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 285;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetLabel (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmselect","setlabel", __ref, _l);}
Debug.locals.put("l", _l);
 BA.debugLineNum = 63;BA.debugLine="Sub SetLabel(l As Object) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="lbl.SetText(l)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_l)));
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
public static RemoteObject  _setmultiple(RemoteObject __ref,RemoteObject _varmultiple) throws Exception{
try {
		Debug.PushSubsStack("SetMultiple (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("setmultiple")) { return __ref.runUserSub(false, "vmselect","setmultiple", __ref, _varmultiple);}
RemoteObject _nlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("varMultiple", _varmultiple);
 BA.debugLineNum = 288;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMSelec";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 289;BA.debugLine="If varMultiple = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varmultiple,vmselect.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 290;BA.debugLine="If xmodel = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xmodel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 291;BA.debugLine="Log($\"VMSelect.SetMultiple.${ID} - vmodel is not";
Debug.JustUpdateDeviceLine();
vmselect.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMSelect.SetMultiple."),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(" - vmodel is not set!")))));
 };
 BA.debugLineNum = 293;BA.debugLine="Dim nList As List";
Debug.JustUpdateDeviceLine();
_nlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nList", _nlist);
 BA.debugLineNum = 294;BA.debugLine="nList.Initialize";
Debug.JustUpdateDeviceLine();
_nlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 295;BA.debugLine="vue.SetStateSingle(xmodel, nList)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_xmodel" /*RemoteObject*/ )),(Object)((_nlist.getObject())));
 BA.debugLineNum = 296;BA.debugLine="SetAttr(CreateMap(\":multiple\": varMultiple))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_setattr" /*RemoteObject*/ ,(Object)(vmselect.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":multiple")),(_varmultiple)}))));
 BA.debugLineNum = 297;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _varname) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmselect","setname", __ref, _varname);}
Debug.locals.put("varName", _varname);
 BA.debugLineNum = 274;BA.debugLine="private Sub SetName(varName As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 275;BA.debugLine="varName = varName.tolowercase";
Debug.JustUpdateDeviceLine();
_varname = _varname.runMethod(true,"toLowerCase");Debug.locals.put("varName", _varname);
 BA.debugLineNum = 276;BA.debugLine="xname = varName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xname" /*RemoteObject*/ ,_varname);
 BA.debugLineNum = 277;BA.debugLine="Combo.SetName(varName, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_varname),(Object)(vmselect.__c.getField(true,"False")));
 BA.debugLineNum = 278;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 279;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnClosed (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,331);
if (RapidSub.canDelegate("setonclosed")) { return __ref.runUserSub(false, "vmselect","setonclosed", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 331;BA.debugLine="private Sub SetOnClosed As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 332;BA.debugLine="Dim methodName As String  = $\"${ID}_closed\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_closed")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 333;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmselect.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmselect.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 334;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 335;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 336;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_setattr" /*RemoteObject*/ ,(Object)(vmselect.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-closed")),(_methodname)}))));
 BA.debugLineNum = 338;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 339;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 340;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnOpened (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("setonopened")) { return __ref.runUserSub(false, "vmselect","setonopened", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 319;BA.debugLine="private Sub SetOnOpened As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 320;BA.debugLine="Dim methodName As String = $\"${ID}_opened\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_opened")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 321;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmselect.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmselect.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 322;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 323;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 324;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_setattr" /*RemoteObject*/ ,(Object)(vmselect.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-opened")),(_methodname)}))));
 BA.debugLineNum = 326;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 327;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 328;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonselected(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetOnSelected (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("setonselected")) { return __ref.runUserSub(false, "vmselect","setonselected", __ref, _value);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("value", _value);
 BA.debugLineNum = 308;BA.debugLine="private Sub SetOnSelected(value As String) As VMSe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 309;BA.debugLine="Dim methodName As String  = $\"${ID}_change\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_change")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 310;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmselect.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmselect.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 311;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmselect.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 312;BA.debugLine="SetAttr(CreateMap(\"v-on:md-selected\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_setattr" /*RemoteObject*/ ,(Object)(vmselect.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-selected")),(_methodname)}))));
 BA.debugLineNum = 314;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 315;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoptions(RemoteObject __ref,RemoteObject _sourcename,RemoteObject _options,RemoteObject _sourcefield,RemoteObject _displayfield) throws Exception{
try {
		Debug.PushSubsStack("SetOptions (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setoptions")) { return __ref.runUserSub(false, "vmselect","setoptions", __ref, _sourcename, _options, _sourcefield, _displayfield);}
RemoteObject _recs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _nrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _krow = RemoteObject.createImmutable("");
RemoteObject _drow = RemoteObject.createImmutable("");
RemoteObject _option = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sourceName", _sourcename);
Debug.locals.put("options", _options);
Debug.locals.put("sourcefield", _sourcefield);
Debug.locals.put("displayfield", _displayfield);
 BA.debugLineNum = 90;BA.debugLine="Sub SetOptions(sourceName As String, options As Ma";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="sourceName = sourceName.tolowercase";
Debug.JustUpdateDeviceLine();
_sourcename = _sourcename.runMethod(true,"toLowerCase");Debug.locals.put("sourceName", _sourcename);
 BA.debugLineNum = 92;BA.debugLine="Dim recs As List";
Debug.JustUpdateDeviceLine();
_recs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("recs", _recs);
 BA.debugLineNum = 93;BA.debugLine="recs.Initialize";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Initialize");
 BA.debugLineNum = 94;BA.debugLine="For Each k As String In options.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _options.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 95;BA.debugLine="Dim v As String = options.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_options.runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 96;BA.debugLine="Dim nrec As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nrec = vmselect.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nrec", _nrec);Debug.locals.put("nrec", _nrec);
 BA.debugLineNum = 97;BA.debugLine="nrec.Put(sourcefield, k)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_sourcefield)),(Object)((_k)));
 BA.debugLineNum = 98;BA.debugLine="nrec.Put(displayfield, v)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_displayfield)),(Object)((_v)));
 BA.debugLineNum = 99;BA.debugLine="recs.Add(nrec)";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Add",(Object)((_nrec.getObject())));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 102;BA.debugLine="vue.SetStateSingle(sourceName, recs)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_sourcename),(Object)((_recs.getObject())));
 BA.debugLineNum = 103;BA.debugLine="Dim kRow As String = $\"row.${sourcefield}\"$";
Debug.JustUpdateDeviceLine();
_krow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sourcefield))),RemoteObject.createImmutable("")));Debug.locals.put("kRow", _krow);Debug.locals.put("kRow", _krow);
 BA.debugLineNum = 104;BA.debugLine="Dim dRow As String = $\"row.${displayfield}\"$";
Debug.JustUpdateDeviceLine();
_drow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_displayfield))),RemoteObject.createImmutable("")));Debug.locals.put("dRow", _drow);Debug.locals.put("dRow", _drow);
 BA.debugLineNum = 106;BA.debugLine="Dim option As VMElement";
Debug.JustUpdateDeviceLine();
_option = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("option", _option);
 BA.debugLineNum = 107;BA.debugLine="option.Initialize(vue,\"\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 108;BA.debugLine="option.SetTag(\"md-option\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-option")));
 BA.debugLineNum = 109;BA.debugLine="option.SetVFor(\"row\", sourceName)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setvfor" /*RemoteObject*/ ,(Object)(BA.ObjectToString("row")),(Object)(_sourcename));
 BA.debugLineNum = 110;BA.debugLine="option.SetID($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 111;BA.debugLine="option.SetKey($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable(""))))),(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 112;BA.debugLine="option.SetValue($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setvalue" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 113;BA.debugLine="option.SetName($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 114;BA.debugLine="option.SetText($\"{{ ${dRow} }}\"$)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_drow))),RemoteObject.createImmutable(" }}")))));
 BA.debugLineNum = 115;BA.debugLine="option.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 116;BA.debugLine="option.RemoveAttr(\":disabled\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 117;BA.debugLine="option.RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show")));
 BA.debugLineNum = 118;BA.debugLine="option.Pop(Combo)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_combo" /*RemoteObject*/ )));
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmselect","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 241;BA.debugLine="Sub SetPadding(p As Object) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 242;BA.debugLine="Combo.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 243;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setplaceholder(RemoteObject __ref,RemoteObject _varplaceholder) throws Exception{
try {
		Debug.PushSubsStack("SetPlaceholder (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("setplaceholder")) { return __ref.runUserSub(false, "vmselect","setplaceholder", __ref, _varplaceholder);}
Debug.locals.put("varPlaceholder", _varplaceholder);
 BA.debugLineNum = 247;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 248;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varplaceholder,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 249;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmselect.class, "_setattr" /*RemoteObject*/ ,(Object)(vmselect.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("placeholder")),(_varplaceholder)}))));
 BA.debugLineNum = 250;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 251;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmselect","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 217;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 218;BA.debugLine="Combo.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmselect.__c.getField(true,"True")));
 BA.debugLineNum = 219;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrequired(RemoteObject __ref,RemoteObject _varrequired) throws Exception{
try {
		Debug.PushSubsStack("SetRequired (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,254);
if (RapidSub.canDelegate("setrequired")) { return __ref.runUserSub(false, "vmselect","setrequired", __ref, _varrequired);}
Debug.locals.put("varRequired", _varrequired);
 BA.debugLineNum = 254;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMSelec";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 255;BA.debugLine="Combo.SetRequired(varRequired)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setrequired" /*RemoteObject*/ ,(Object)(_varrequired));
 BA.debugLineNum = 256;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 257;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmselect","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 228;BA.debugLine="Sub SetStyle(sm As Map) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 229;BA.debugLine="Combo.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 230;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 231;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmselect","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 37;BA.debugLine="Sub SetTabIndex(ti As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="Combo.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmselect","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 212;BA.debugLine="Sub SetText(t As Object) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 213;BA.debugLine="Combo.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 214;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _valx) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmselect","setvalue", __ref, _valx);}
Debug.locals.put("valx", _valx);
 BA.debugLineNum = 259;BA.debugLine="Sub SetValue(valx As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 260;BA.debugLine="If xmodel = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xmodel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 261;BA.debugLine="Log($\"VMSelect.SetValue.${ID} - vmodel is not se";
Debug.JustUpdateDeviceLine();
vmselect.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMSelect.SetValue."),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(" - vmodel is not set!")))));
 };
 BA.debugLineNum = 263;BA.debugLine="vue.SetStateSingle(xmodel, valx)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_xmodel" /*RemoteObject*/ )),(Object)((_valx)));
 BA.debugLineNum = 264;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 265;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmselect","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 192;BA.debugLine="Sub SetVIf(vif As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 194;BA.debugLine="ComboInt.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_comboint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvif" /*RemoteObject*/ ,(Object)((_vif)));
 BA.debugLineNum = 195;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 196;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmselect","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 56;BA.debugLine="Sub SetVModel(k As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="k = k.ToLowerCase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 58;BA.debugLine="xmodel = k";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xmodel" /*RemoteObject*/ ,_k);
 BA.debugLineNum = 59;BA.debugLine="Combo.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmselect","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 198;BA.debugLine="Sub SetVShow(vif As String) As VMSelect";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 199;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 200;BA.debugLine="ComboInt.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_comboint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvshow" /*RemoteObject*/ ,(Object)((_vif)));
 BA.debugLineNum = 201;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 202;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmselect) ","vmselect",87,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmselect","tostring", __ref);}
 BA.debugLineNum = 166;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 167;BA.debugLine="If xname = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xname" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 168;BA.debugLine="Log($\"VMSelect.ToString.${ID} - name is not set!";
Debug.JustUpdateDeviceLine();
vmselect.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMSelect.ToString."),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(" - name is not set!")))));
 };
 BA.debugLineNum = 170;BA.debugLine="If xmodel = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_xmodel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 171;BA.debugLine="Log($\"VMSelect.ToString.${ID} - model is not set";
Debug.JustUpdateDeviceLine();
vmselect.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMSelect.ToString."),vmselect.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(" - model is not set!")))));
 };
 BA.debugLineNum = 173;BA.debugLine="lbl.Pop(ComboInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_comboint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 174;BA.debugLine="Combo.Pop(ComboInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_combo" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_comboint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 175;BA.debugLine="If hasHelp Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hashelp" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 176;BA.debugLine="ht.Pop(ComboInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ht" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_comboint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 178;BA.debugLine="If hasError Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_haserror" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 179;BA.debugLine="et.Pop(ComboInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_et" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_comboint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 181;BA.debugLine="Return ComboInt.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_comboint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_tostring" /*RemoteObject*/ );
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