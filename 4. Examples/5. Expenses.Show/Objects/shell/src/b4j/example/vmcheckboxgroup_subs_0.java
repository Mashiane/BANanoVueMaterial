package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmcheckboxgroup_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmcheckboxgroup","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 116;BA.debugLine="Sub AddChild(child As VMElement) As VMCheckBoxGrou";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 118;BA.debugLine="CheckGroup.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmcheckboxgroup","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 129;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 131;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcheckboxgroup.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmcheckboxgroup","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 47;BA.debugLine="Sub AddClass(c As String) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="CheckGroup.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 49;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddItem (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("additem")) { return __ref.runUserSub(false, "vmcheckboxgroup","additem", __ref, _k, _v);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmcheckbox");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 74;BA.debugLine="Sub AddItem(k As String, v As String) As VMCheckBo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="If vmodel = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vmodel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 76;BA.debugLine="Log($\"VMCheckBoxGroup.AddItem: '${ID}' - the vMo";
Debug.JustUpdateDeviceLine();
vmcheckboxgroup.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMCheckBoxGroup.AddItem: '"),vmcheckboxgroup.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("' - the vModel has not been set!")))));
 };
 BA.debugLineNum = 78;BA.debugLine="Dim el As VMCheckBox";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmcheckbox");Debug.locals.put("el", _el);
 BA.debugLineNum = 79;BA.debugLine="el.Initialize(vue, k,module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckbox.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_k),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="If designMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcheckboxgroup.__c.getField(true,"False"))) { 
 BA.debugLineNum = 81;BA.debugLine="el.SetVModel(vmodel)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckbox.class, "_setvmodel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_vmodel" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 83;BA.debugLine="el.SetText(v)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckbox.class, "_settext" /*RemoteObject*/ ,(Object)(_v));
 BA.debugLineNum = 84;BA.debugLine="el.SetValue(k)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckbox.class, "_setvalue" /*RemoteObject*/ ,(Object)((_k)));
 BA.debugLineNum = 85;BA.debugLine="el.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckbox.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmcheckboxgroup.__c.getField(true,"True")));
 BA.debugLineNum = 86;BA.debugLine="el.SetOnChange(ID)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckbox.class, "_setonchange" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="el.Pop(CheckGroup)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckbox.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_checkgroup" /*RemoteObject*/ )));
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
public static RemoteObject  _additems(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("AddItems (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("additems")) { return __ref.runUserSub(false, "vmcheckboxgroup","additems", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 66;BA.debugLine="Sub AddItems(m As Map) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 68;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 69;BA.debugLine="AddItem(k, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcheckboxgroup.class, "_additem" /*RemoteObject*/ ,(Object)(_k),(Object)(BA.ObjectToString(_v)));
 }
}Debug.locals.put("k", _k);
;
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
		Debug.PushSubsStack("AddToContainer (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmcheckboxgroup","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 142;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmcheckboxgroup.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private CheckGroup As VMElement";
vmcheckboxgroup._checkgroup = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_checkgroup",vmcheckboxgroup._checkgroup);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmcheckboxgroup._id = RemoteObject.createImmutable("");__ref.setField("_id",vmcheckboxgroup._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmcheckboxgroup._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmcheckboxgroup._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private lbl As VMLabel";
vmcheckboxgroup._lbl = RemoteObject.createNew ("b4j.example.vmlabel");__ref.setField("_lbl",vmcheckboxgroup._lbl);
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano   'ignore";
vmcheckboxgroup._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmcheckboxgroup._banano);
 //BA.debugLineNum = 8;BA.debugLine="Private vmodel As String";
vmcheckboxgroup._vmodel = RemoteObject.createImmutable("");__ref.setField("_vmodel",vmcheckboxgroup._vmodel);
 //BA.debugLineNum = 9;BA.debugLine="Private module As Object";
vmcheckboxgroup._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmcheckboxgroup._module);
 //BA.debugLineNum = 10;BA.debugLine="Private designMode As Boolean";
vmcheckboxgroup._designmode = RemoteObject.createImmutable(false);__ref.setField("_designmode",vmcheckboxgroup._designmode);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _caption,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmcheckboxgroup","initialize", __ref, _ba, _v, _sid, _caption, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("caption", _caption);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 17;BA.debugLine="CheckGroup.Initialize(vue, ID).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 18;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$).SetText($\"${";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcheckboxgroup.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sid))),RemoteObject.createImmutable("label"))))).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcheckboxgroup.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_caption))),RemoteObject.createImmutable("<br/>"))))).runClassMethod (b4j.example.vmlabel.class, "_setcaption" /*RemoteObject*/ ,(Object)(vmcheckboxgroup.__c.getField(true,"True")));
 BA.debugLineNum = 19;BA.debugLine="lbl.Pop(CheckGroup)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_checkgroup" /*RemoteObject*/ )));
 BA.debugLineNum = 20;BA.debugLine="designMode = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_designmode" /*RemoteObject*/ ,vmcheckboxgroup.__c.getField(true,"False"));
 BA.debugLineNum = 21;BA.debugLine="vmodel = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vmodel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 22;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmcheckboxgroup","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 99;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcheckboxgroup.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmcheckboxgroup","render", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcheckboxgroup.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmcheckboxgroup","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 53;BA.debugLine="Sub SetAttr(attr As Map) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="CheckGroup.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setdesignmode(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDesignMode (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("setdesignmode")) { return __ref.runUserSub(false, "vmcheckboxgroup","setdesignmode", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 25;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="designMode = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_designmode" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 27;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmcheckboxgroup","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 135;BA.debugLine="Sub SetDisabled(b As Boolean) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="CheckGroup.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 137;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 138;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmcheckboxgroup","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 123;BA.debugLine="Sub SetStyle(sm As Map) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="CheckGroup.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 125;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 126;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmcheckboxgroup","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 41;BA.debugLine="Sub SetTabIndex(ti As String) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="CheckGroup.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmcheckboxgroup","setvalue", __ref, _v);}
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("v", _v);
 BA.debugLineNum = 30;BA.debugLine="Sub SetValue(v As Object) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="If vmodel = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vmodel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 32;BA.debugLine="Log($\"VMCheckBoxGroup.SetValue: '${ID}' - the vM";
Debug.JustUpdateDeviceLine();
vmcheckboxgroup.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMCheckBoxGroup.SetValue: '"),vmcheckboxgroup.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("' - the vModel has not been set!")))));
 };
 BA.debugLineNum = 34;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 35;BA.debugLine="nl.Initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="nl.Add(v)";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Add",(Object)(_v));
 BA.debugLineNum = 37;BA.debugLine="vue.SetStateSingle(vmodel,nl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_vmodel" /*RemoteObject*/ )),(Object)((_nl.getObject())));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmcheckboxgroup","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 103;BA.debugLine="Sub SetVIf(vif As String) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 105;BA.debugLine="CheckGroup.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmcheckboxgroup","setvmodel", __ref, _k);}
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("k", _k);
 BA.debugLineNum = 58;BA.debugLine="Sub SetVModel(k As String) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="vmodel = k.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vmodel" /*RemoteObject*/ ,_k.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 60;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 61;BA.debugLine="nl.Initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="vue.SetStateSingle(vmodel,nl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_vmodel" /*RemoteObject*/ )),(Object)((_nl.getObject())));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmcheckboxgroup","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 109;BA.debugLine="Sub SetVShow(vif As String) As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 111;BA.debugLine="CheckGroup.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 112;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 113;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmcheckboxgroup) ","vmcheckboxgroup",42,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmcheckboxgroup","tostring", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="Return CheckGroup.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_checkgroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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