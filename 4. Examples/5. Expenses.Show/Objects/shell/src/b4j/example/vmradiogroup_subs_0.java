package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmradiogroup_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmradiogroup","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 118;BA.debugLine="Sub AddChild(child As VMElement) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 120;BA.debugLine="RadioGroup.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmradiogroup","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 131;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 133;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmradiogroup.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 135;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmradiogroup","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 52;BA.debugLine="Sub AddClass(c As String) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="RadioGroup.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 54;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddItem (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("additem")) { return __ref.runUserSub(false, "vmradiogroup","additem", __ref, _k, _v);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmradio");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 76;BA.debugLine="Sub AddItem(k As String, v As String) As VMRadioGr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="If vmodel = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vmodel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 78;BA.debugLine="Log($\"VMRadioGroup.AddItem: '${ID}' - the vModel";
Debug.JustUpdateDeviceLine();
vmradiogroup.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMRadioGroup.AddItem: '"),vmradiogroup.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("' - the vModel has not been set!")))));
 };
 BA.debugLineNum = 80;BA.debugLine="Dim el As VMRadio";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmradio");Debug.locals.put("el", _el);
 BA.debugLineNum = 81;BA.debugLine="el.Initialize(vue, k, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradio.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_k),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 82;BA.debugLine="el.SetText(v)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradio.class, "_settext" /*RemoteObject*/ ,(Object)(_v));
 BA.debugLineNum = 83;BA.debugLine="el.SetValue(k,False)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradio.class, "_setvalue" /*RemoteObject*/ ,(Object)((_k)),(Object)(vmradiogroup.__c.getField(true,"False")));
 BA.debugLineNum = 84;BA.debugLine="el.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradio.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmradiogroup.__c.getField(true,"True")));
 BA.debugLineNum = 85;BA.debugLine="el.SetOnChange(ID)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradio.class, "_setonchange" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="If designMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmradiogroup.__c.getField(true,"False"))) { 
 BA.debugLineNum = 87;BA.debugLine="el.SetVModel(vmodel)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradio.class, "_setvmodel" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_vmodel" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 89;BA.debugLine="el.Pop(RadioGroup)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradio.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_radiogroup" /*RemoteObject*/ )));
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
public static RemoteObject  _additems(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("AddItems (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("additems")) { return __ref.runUserSub(false, "vmradiogroup","additems", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 68;BA.debugLine="Sub AddItems(m As Map) As VMRadioGroup";
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
__ref.runClassMethod (b4j.example.vmradiogroup.class, "_additem" /*RemoteObject*/ ,(Object)(_k),(Object)(BA.ObjectToString(_v)));
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
		Debug.PushSubsStack("AddToContainer (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmradiogroup","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 144;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmradiogroup.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 146;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Private RadioGroup As VMElement";
vmradiogroup._radiogroup = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_radiogroup",vmradiogroup._radiogroup);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmradiogroup._id = RemoteObject.createImmutable("");__ref.setField("_id",vmradiogroup._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmradiogroup._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmradiogroup._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private lbl As VMLabel";
vmradiogroup._lbl = RemoteObject.createNew ("b4j.example.vmlabel");__ref.setField("_lbl",vmradiogroup._lbl);
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano   'ignore";
vmradiogroup._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmradiogroup._banano);
 //BA.debugLineNum = 8;BA.debugLine="Private vmodel As String";
vmradiogroup._vmodel = RemoteObject.createImmutable("");__ref.setField("_vmodel",vmradiogroup._vmodel);
 //BA.debugLineNum = 9;BA.debugLine="Private module As Object";
vmradiogroup._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmradiogroup._module);
 //BA.debugLineNum = 10;BA.debugLine="Private designMode As Boolean";
vmradiogroup._designmode = RemoteObject.createImmutable(false);__ref.setField("_designmode",vmradiogroup._designmode);
 //BA.debugLineNum = 11;BA.debugLine="Private module As Object";
vmradiogroup._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmradiogroup._module);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _caption,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmradiogroup","initialize", __ref, _ba, _v, _sid, _caption, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("caption", _caption);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 16;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 18;BA.debugLine="RadioGroup.Initialize(vue, ID).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 19;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$).SetText($\"${";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmradiogroup.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sid))),RemoteObject.createImmutable("label"))))).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmradiogroup.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_caption))),RemoteObject.createImmutable("<br/>"))))).runClassMethod (b4j.example.vmlabel.class, "_setcaption" /*RemoteObject*/ ,(Object)(vmradiogroup.__c.getField(true,"True")));
 BA.debugLineNum = 20;BA.debugLine="lbl.Pop(RadioGroup)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_radiogroup" /*RemoteObject*/ )));
 BA.debugLineNum = 21;BA.debugLine="designMode = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_designmode" /*RemoteObject*/ ,vmradiogroup.__c.getField(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="vmodel = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vmodel" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmradiogroup","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 101;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmradiogroup.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmradiogroup","render", __ref);}
 BA.debugLineNum = 97;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmradiogroup.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmradiogroup","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 58;BA.debugLine="Sub SetAttr(attr As Map) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="RadioGroup.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setdesignmode(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDesignMode (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setdesignmode")) { return __ref.runUserSub(false, "vmradiogroup","setdesignmode", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 33;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="designMode = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_designmode" /*RemoteObject*/ ,_b);
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmradiogroup","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 137;BA.debugLine="Sub SetDisabled(b As Boolean) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="RadioGroup.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 139;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoptions(RemoteObject __ref,RemoteObject _options) throws Exception{
try {
		Debug.PushSubsStack("SetOptions (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("setoptions")) { return __ref.runUserSub(false, "vmradiogroup","setoptions", __ref, _options);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("options", _options);
 BA.debugLineNum = 26;BA.debugLine="Sub SetOptions(options As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="For Each k As String In options.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _options.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 28;BA.debugLine="Dim v As String = options.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_options.runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 29;BA.debugLine="AddItem(k, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmradiogroup.class, "_additem" /*RemoteObject*/ ,(Object)(_k),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmradiogroup","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 125;BA.debugLine="Sub SetStyle(sm As Map) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="RadioGroup.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 127;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 128;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmradiogroup","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 46;BA.debugLine="Sub SetTabIndex(ti As String) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="RadioGroup.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmradiogroup","setvalue", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 38;BA.debugLine="Sub SetValue(v As Object) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="If vmodel = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_vmodel" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 40;BA.debugLine="Log($\"VMRadioGroup.SetValue: '${ID}' - the vMode";
Debug.JustUpdateDeviceLine();
vmradiogroup.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMRadioGroup.SetValue: '"),vmradiogroup.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("' - the vModel has not been set!")))));
 };
 BA.debugLineNum = 42;BA.debugLine="vue.SetStateSingle(vmodel,v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_vmodel" /*RemoteObject*/ )),(Object)(_v));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmradiogroup","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 105;BA.debugLine="Sub SetVIf(vif As String) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 107;BA.debugLine="RadioGroup.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 108;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmradiogroup","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 63;BA.debugLine="Sub SetVModel(k As String) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="vmodel = k.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vmodel" /*RemoteObject*/ ,_k.runMethod(true,"toLowerCase"));
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
		Debug.PushSubsStack("SetVShow (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmradiogroup","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 111;BA.debugLine="Sub SetVShow(vif As String) As VMRadioGroup";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 113;BA.debugLine="RadioGroup.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmradiogroup) ","vmradiogroup",85,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmradiogroup","tostring", __ref);}
 BA.debugLineNum = 93;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="Return RadioGroup.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_radiogroup" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}