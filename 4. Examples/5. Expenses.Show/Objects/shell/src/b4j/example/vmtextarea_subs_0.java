package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtextarea_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmtextarea","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 123;BA.debugLine="Sub AddChild(child As VMElement) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 125;BA.debugLine="TextArea.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmtextarea","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 169;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 171;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtextarea.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 173;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtextarea","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 151;BA.debugLine="Sub AddClass(c As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="TextArea.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 153;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 154;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddToContainer (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmtextarea","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 236;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 237;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmtextarea.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public TextArea As VMElement";
vmtextarea._textarea = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_textarea",vmtextarea._textarea);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtextarea._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtextarea._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtextarea._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtextarea._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmtextarea._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmtextarea._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private Internal As VMField";
vmtextarea._internal = RemoteObject.createNew ("b4j.example.vmfield");__ref.setField("_internal",vmtextarea._internal);
 //BA.debugLineNum = 8;BA.debugLine="Private lbl As VMLabel";
vmtextarea._lbl = RemoteObject.createNew ("b4j.example.vmlabel");__ref.setField("_lbl",vmtextarea._lbl);
 //BA.debugLineNum = 9;BA.debugLine="Private hasHelp As Boolean";
vmtextarea._hashelp = RemoteObject.createImmutable(false);__ref.setField("_hashelp",vmtextarea._hashelp);
 //BA.debugLineNum = 10;BA.debugLine="Private ht As VMElement";
vmtextarea._ht = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_ht",vmtextarea._ht);
 //BA.debugLineNum = 11;BA.debugLine="Private hasError As Boolean";
vmtextarea._haserror = RemoteObject.createImmutable(false);__ref.setField("_haserror",vmtextarea._haserror);
 //BA.debugLineNum = 12;BA.debugLine="Private he As VMElement";
vmtextarea._he = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_he",vmtextarea._he);
 //BA.debugLineNum = 13;BA.debugLine="Private icon1 As VMIcon";
vmtextarea._icon1 = RemoteObject.createNew ("b4j.example.vmicon");__ref.setField("_icon1",vmtextarea._icon1);
 //BA.debugLineNum = 14;BA.debugLine="Private module As Object";
vmtextarea._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmtextarea._module);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtextarea","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 21;BA.debugLine="TextArea.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 22;BA.debugLine="TextArea.SetTag(\"md-textarea\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-textarea")));
 BA.debugLineNum = 23;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 24;BA.debugLine="Internal.Initialize(v,ID,$\"${ID}field\"$, module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_internal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtextarea.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("field")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 25;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtextarea.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("label")))));
 BA.debugLineNum = 26;BA.debugLine="hasHelp = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmtextarea.__c.getField(true,"False"));
 BA.debugLineNum = 27;BA.debugLine="hasError = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmtextarea.__c.getField(true,"False"));
 BA.debugLineNum = 28;BA.debugLine="icon1.Initialize(vue,$\"${ID}icon\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon1" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtextarea.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icon")))));
 BA.debugLineNum = 29;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtextarea","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 146;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 147;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtextarea.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 148;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtextarea","render", __ref);}
 BA.debugLineNum = 118;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtextarea.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 120;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmtextarea","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 140;BA.debugLine="Sub SetAccent(b As Boolean) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="TextArea.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmtextarea.__c.getField(true,"True")));
 BA.debugLineNum = 142;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 143;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtextarea","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 157;BA.debugLine="Sub SetAttr(attr As Map) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="TextArea.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setautogrow(RemoteObject __ref,RemoteObject _varautogrow) throws Exception{
try {
		Debug.PushSubsStack("SetAutogrow (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("setautogrow")) { return __ref.runUserSub(false, "vmtextarea","setautogrow", __ref, _varautogrow);}
Debug.locals.put("varAutogrow", _varautogrow);
 BA.debugLineNum = 216;BA.debugLine="Sub SetAutogrow(varAutogrow As Boolean) As VMTextA";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="If varAutogrow = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varautogrow,vmtextarea.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 218;BA.debugLine="SetAttr(CreateMap(\":md-autogrow\": varAutogrow))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtextarea.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtextarea.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-autogrow")),(_varautogrow)}))));
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
public static RemoteObject  _setclearable(RemoteObject __ref,RemoteObject _varclearable) throws Exception{
try {
		Debug.PushSubsStack("SetClearable (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("setclearable")) { return __ref.runUserSub(false, "vmtextarea","setclearable", __ref, _varclearable);}
Debug.locals.put("varClearable", _varclearable);
 BA.debugLineNum = 230;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMTex";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="If varClearable Then Internal.SetAttr(CreateMap(\"";
Debug.JustUpdateDeviceLine();
if (_varclearable.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_internal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtextarea.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-clearable")),(_varclearable)}))));};
 BA.debugLineNum = 232;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcounter(RemoteObject __ref,RemoteObject _varcounter) throws Exception{
try {
		Debug.PushSubsStack("SetCounter (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("setcounter")) { return __ref.runUserSub(false, "vmtextarea","setcounter", __ref, _varcounter);}
Debug.locals.put("varCounter", _varcounter);
 BA.debugLineNum = 209;BA.debugLine="Sub SetCounter(varCounter As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 210;BA.debugLine="If varCounter = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varcounter,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 211;BA.debugLine="SetAttr(CreateMap(\":md-counter\": varCounter))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtextarea.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtextarea.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-counter")),(_varcounter)}))));
 BA.debugLineNum = 212;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcounterdisabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetCounterDisabled (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("setcounterdisabled")) { return __ref.runUserSub(false, "vmtextarea","setcounterdisabled", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Sub SetCounterDisabled As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="Internal.SetAttr(CreateMap(\":md-counter\": False))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_internal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtextarea.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-counter")),(vmtextarea.__c.getField(true,"False"))}))));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmtextarea","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 195;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="TextArea.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 197;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seterrortext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetErrorText (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("seterrortext")) { return __ref.runUserSub(false, "vmtextarea","seterrortext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 98;BA.debugLine="Sub SetErrorText(t As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="hasError = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmtextarea.__c.getField(true,"True"));
 BA.debugLineNum = 100;BA.debugLine="he = TextArea.SetErrorText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_he" /*RemoteObject*/ ,__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_t)));
 BA.debugLineNum = 101;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetHelperText (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("sethelpertext")) { return __ref.runUserSub(false, "vmtextarea","sethelpertext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 91;BA.debugLine="Sub SetHelperText(t As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 93;BA.debugLine="hasHelp = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmtextarea.__c.getField(true,"True"));
 BA.debugLineNum = 94;BA.debugLine="ht = TextArea.SetHelperText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ht" /*RemoteObject*/ ,__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_t)));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _stricon) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmtextarea","seticon", __ref, _stricon);}
Debug.locals.put("strIcon", _stricon);
 BA.debugLineNum = 50;BA.debugLine="Sub SetIcon(strIcon As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="If strIcon <> \"\" Then icon1.SetText(strIcon)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_stricon,BA.ObjectToString(""))) { 
__ref.getField(false,"_icon1" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_stricon));};
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
public static RemoteObject  _setinline(RemoteObject __ref,RemoteObject _varinline) throws Exception{
try {
		Debug.PushSubsStack("SetInline (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("setinline")) { return __ref.runUserSub(false, "vmtextarea","setinline", __ref, _varinline);}
Debug.locals.put("varInline", _varinline);
 BA.debugLineNum = 223;BA.debugLine="Sub SetInline(varInline As Boolean) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="If varInline = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varinline,vmtextarea.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 225;BA.debugLine="Internal.SetAttr(CreateMap(\":md-inline\": varInlin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_internal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtextarea.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-inline")),(_varinline)}))));
 BA.debugLineNum = 226;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 227;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetLabel (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmtextarea","setlabel", __ref, _l);}
Debug.locals.put("l", _l);
 BA.debugLineNum = 62;BA.debugLine="Sub SetLabel(l As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="If l = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 64;BA.debugLine="lbl.SetText(l)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)(_l));
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
public static RemoteObject  _setmaxlength(RemoteObject __ref,RemoteObject _varmaxlength) throws Exception{
try {
		Debug.PushSubsStack("SetMaxLength (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("setmaxlength")) { return __ref.runUserSub(false, "vmtextarea","setmaxlength", __ref, _varmaxlength);}
Debug.locals.put("varMaxlength", _varmaxlength);
 BA.debugLineNum = 201;BA.debugLine="Sub SetMaxLength(varMaxlength As String) As VMText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 202;BA.debugLine="If varMaxlength = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varmaxlength,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 203;BA.debugLine="If varMaxlength = Null Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_varmaxlength)) { 
if (true) return (__ref);};
 BA.debugLineNum = 204;BA.debugLine="SetAttr(CreateMap(\"maxlength\": varMaxlength))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtextarea.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtextarea.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("maxlength")),(_varmaxlength)}))));
 BA.debugLineNum = 205;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 206;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmtextarea","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 44;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="TextArea.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmtextarea","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 176;BA.debugLine="Sub SetPadding(p As Object) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="TextArea.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 178;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 179;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPlaceholder (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("setplaceholder")) { return __ref.runUserSub(false, "vmtextarea","setplaceholder", __ref, _varplaceholder);}
Debug.locals.put("varPlaceholder", _varplaceholder);
 BA.debugLineNum = 183;BA.debugLine="Sub SetPlaceholder(varPlaceholder As Object) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 184;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtextarea.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtextarea.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("placeholder")),_varplaceholder}))));
 BA.debugLineNum = 185;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 186;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmtextarea","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 135;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="TextArea.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmtextarea.__c.getField(true,"True")));
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
public static RemoteObject  _setreadonly(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetReadOnly (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setreadonly")) { return __ref.runUserSub(false, "vmtextarea","setreadonly", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 56;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmtextarea.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 58;BA.debugLine="TextArea.SetAttr(CreateMap(\":readonly\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtextarea.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":readonly")),(_b)}))));
 BA.debugLineNum = 59;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetRequired (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("setrequired")) { return __ref.runUserSub(false, "vmtextarea","setrequired", __ref, _varrequired);}
Debug.locals.put("varRequired", _varrequired);
 BA.debugLineNum = 189;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMTextA";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 190;BA.debugLine="TextArea.SetRequired(varRequired)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setrequired" /*RemoteObject*/ ,(Object)(_varrequired));
 BA.debugLineNum = 191;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 192;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmtextarea","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 163;BA.debugLine="Sub SetStyle(sm As Map) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="TextArea.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 165;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 166;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmtextarea","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 37;BA.debugLine="Sub SetTabIndex(ti As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="TextArea.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
		Debug.PushSubsStack("SetText (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtextarea","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 130;BA.debugLine="Sub SetText(t As Object) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="TextArea.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 132;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmtextarea","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 105;BA.debugLine="Sub SetVIf(vif As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 107;BA.debugLine="Internal.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_internal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvif" /*RemoteObject*/ ,(Object)((_vif)));
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
		Debug.PushSubsStack("SetVModel (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmtextarea","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 84;BA.debugLine="Sub SetVModel(k As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="If k = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_k,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 86;BA.debugLine="TextArea.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtextarea","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 111;BA.debugLine="Sub SetVShow(vif As String) As VMTextArea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 113;BA.debugLine="Internal.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_internal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvshow" /*RemoteObject*/ ,(Object)((_vif)));
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
		Debug.PushSubsStack("ToString (vmtextarea) ","vmtextarea",99,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtextarea","tostring", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="lbl.Pop(Internal.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_internal" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 71;BA.debugLine="TextArea.Pop(Internal.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textarea" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_internal" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 72;BA.debugLine="If hasHelp Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hashelp" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="ht.Pop(Internal.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ht" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_internal" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 75;BA.debugLine="If hasError Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_haserror" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 76;BA.debugLine="he.Pop(Internal.field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_he" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_internal" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 78;BA.debugLine="If icon1.hasContent Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_icon1" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 79;BA.debugLine="icon1.Pop(Internal.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon1" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_internal" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 81;BA.debugLine="Return Internal.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_internal" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 82;BA.debugLine="End Sub";
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