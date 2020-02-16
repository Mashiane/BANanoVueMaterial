package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmstepitem_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmstepitem","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 59;BA.debugLine="Sub AddChild(child As VMElement) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 61;BA.debugLine="StepItem.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 62;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmstepitem","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 99;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 101;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmstepitem","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 81;BA.debugLine="Sub AddClass(c As String) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="StepItem.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public StepItem As VMElement";
vmstepitem._stepitem = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_stepitem",vmstepitem._stepitem);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmstepitem._id = RemoteObject.createImmutable("");__ref.setField("_id",vmstepitem._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmstepitem._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmstepitem._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmstepitem._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmstepitem._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmstepitem._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmstepitem._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmstepitem","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="StepItem.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 14;BA.debugLine="StepItem.SetTag(\"md-step\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-step")));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="SetId(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_setid" /*RemoteObject*/ ,(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))));
 BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 18;BA.debugLine="SetDoneSync(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_setdonesync" /*RemoteObject*/ ,(Object)(vmstepitem.__c.getField(true,"False")));
 BA.debugLineNum = 19;BA.debugLine="SetError(Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_seterror" /*RemoteObject*/ ,(Object)(BA.ObjectToString(vmstepitem.__c.getField(false,"Null"))));
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
		Debug.PushSubsStack("Pop (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmstepitem","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 76;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmstepitem.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmstepitem","render", __ref);}
 BA.debugLineNum = 54;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmstepitem.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 56;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmstepitem","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 70;BA.debugLine="Sub SetAccent(b As Boolean) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="StepItem.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmstepitem.__c.getField(true,"True")));
 BA.debugLineNum = 72;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmstepitem","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 87;BA.debugLine="Sub SetAttr(attr As Map) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="StepItem.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setcontent(RemoteObject __ref,RemoteObject _content) throws Exception{
try {
		Debug.PushSubsStack("SetContent (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setcontent")) { return __ref.runUserSub(false, "vmstepitem","setcontent", __ref, _content);}
Debug.locals.put("content", _content);
 BA.debugLineNum = 28;BA.debugLine="Sub SetContent(content As String) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="StepItem.SetText(content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_content));
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
public static RemoteObject  _setdescription(RemoteObject __ref,RemoteObject _vardescription) throws Exception{
try {
		Debug.PushSubsStack("SetDescription (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setdescription")) { return __ref.runUserSub(false, "vmstepitem","setdescription", __ref, _vardescription);}
RemoteObject _dd = RemoteObject.createImmutable("");
Debug.locals.put("varDescription", _vardescription);
 BA.debugLineNum = 139;BA.debugLine="Sub SetDescription(varDescription As Object) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Dim dd As String = $\"${ID}description\"$";
Debug.JustUpdateDeviceLine();
_dd = (RemoteObject.concat(RemoteObject.createImmutable(""),vmstepitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("description")));Debug.locals.put("dd", _dd);Debug.locals.put("dd", _dd);
 BA.debugLineNum = 141;BA.debugLine="vue.SetStateSingle(dd, varDescription)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_dd),(Object)(_vardescription));
 BA.debugLineNum = 142;BA.debugLine="SetAttr(CreateMap(\":md-description\": dd))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmstepitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-description")),(_dd)}))));
 BA.debugLineNum = 143;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdonesync(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDoneSync (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("setdonesync")) { return __ref.runUserSub(false, "vmstepitem","setdonesync", __ref, _b);}
RemoteObject _done = RemoteObject.createImmutable("");
Debug.locals.put("b", _b);
 BA.debugLineNum = 131;BA.debugLine="private Sub SetDoneSync(b As Boolean) As VMStepIte";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="Dim done As String = $\"${ID}done\"$";
Debug.JustUpdateDeviceLine();
_done = (RemoteObject.concat(RemoteObject.createImmutable(""),vmstepitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("done")));Debug.locals.put("done", _done);Debug.locals.put("done", _done);
 BA.debugLineNum = 133;BA.debugLine="vue.SetStateSingle(done, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_done),(Object)((_b)));
 BA.debugLineNum = 134;BA.debugLine="SetAttr(CreateMap(\":md-done.sync\":done))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmstepitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-done.sync")),(_done)}))));
 BA.debugLineNum = 135;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteditable(RemoteObject __ref,RemoteObject _vareditable) throws Exception{
try {
		Debug.PushSubsStack("SetEditable (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("seteditable")) { return __ref.runUserSub(false, "vmstepitem","seteditable", __ref, _vareditable);}
RemoteObject _dd = RemoteObject.createImmutable("");
Debug.locals.put("varEditable", _vareditable);
 BA.debugLineNum = 155;BA.debugLine="Sub SetEditable(varEditable As Boolean) As VMStepI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 156;BA.debugLine="Dim dd As String = $\"${ID}editable\"$";
Debug.JustUpdateDeviceLine();
_dd = (RemoteObject.concat(RemoteObject.createImmutable(""),vmstepitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("editable")));Debug.locals.put("dd", _dd);Debug.locals.put("dd", _dd);
 BA.debugLineNum = 157;BA.debugLine="vue.SetStateSingle(dd, varEditable)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_dd),(Object)((_vareditable)));
 BA.debugLineNum = 158;BA.debugLine="SetAttr(CreateMap(\":md-editable\": dd))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmstepitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-editable")),(_dd)}))));
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
public static RemoteObject  _seterror(RemoteObject __ref,RemoteObject _varerror) throws Exception{
try {
		Debug.PushSubsStack("SetError (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("seterror")) { return __ref.runUserSub(false, "vmstepitem","seterror", __ref, _varerror);}
RemoteObject _dd = RemoteObject.createImmutable("");
Debug.locals.put("varError", _varerror);
 BA.debugLineNum = 147;BA.debugLine="Sub SetError(varError As String) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 148;BA.debugLine="Dim dd As String = $\"${ID}error\"$";
Debug.JustUpdateDeviceLine();
_dd = (RemoteObject.concat(RemoteObject.createImmutable(""),vmstepitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("error")));Debug.locals.put("dd", _dd);Debug.locals.put("dd", _dd);
 BA.debugLineNum = 149;BA.debugLine="vue.SetStateSingle(dd, varError)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_dd),(Object)((_varerror)));
 BA.debugLineNum = 150;BA.debugLine="SetAttr(CreateMap(\":md-error\": dd))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmstepitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-error")),(_dd)}))));
 BA.debugLineNum = 151;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethref(RemoteObject __ref,RemoteObject _varhref) throws Exception{
try {
		Debug.PushSubsStack("SetHref (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("sethref")) { return __ref.runUserSub(false, "vmstepitem","sethref", __ref, _varhref);}
Debug.locals.put("varHref", _varhref);
 BA.debugLineNum = 118;BA.debugLine="Sub SetHref(varHref As Object) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="SetAttr(CreateMap(\"href\": varHref))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmstepitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("href")),_varhref}))));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _varid) throws Exception{
try {
		Debug.PushSubsStack("SetId (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmstepitem","setid", __ref, _varid);}
Debug.locals.put("varId", _varid);
 BA.debugLineNum = 112;BA.debugLine="Sub SetId(varId As Object) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="SetAttr(CreateMap(\"id\": varId))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmstepitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),_varid}))));
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
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _varlabel) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmstepitem","setlabel", __ref, _varlabel);}
RemoteObject _lblx = RemoteObject.createImmutable("");
Debug.locals.put("varLabel", _varlabel);
 BA.debugLineNum = 124;BA.debugLine="Sub SetLabel(varLabel As String) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="Dim lblx As String = $\"${ID}label\"$";
Debug.JustUpdateDeviceLine();
_lblx = (RemoteObject.concat(RemoteObject.createImmutable(""),vmstepitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("label")));Debug.locals.put("lblx", _lblx);Debug.locals.put("lblx", _lblx);
 BA.debugLineNum = 126;BA.debugLine="vue.SetStateSingle(lblx, varLabel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_lblx),(Object)((_varlabel)));
 BA.debugLineNum = 127;BA.debugLine="SetAttr(CreateMap(\"v-bind:md-label\": lblx))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmstepitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmstepitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-bind:md-label")),(_lblx)}))));
 BA.debugLineNum = 128;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 129;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmstepitem","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 106;BA.debugLine="Sub SetPadding(p As Object) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="StepItem.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmstepitem","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 65;BA.debugLine="Sub SetPrimary(b As Boolean) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="StepItem.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmstepitem.__c.getField(true,"True")));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmstepitem","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 93;BA.debugLine="Sub SetStyle(sm As Map) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="StepItem.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmstepitem","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 23;BA.debugLine="Sub SetTabIndex(ti As String) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="StepItem.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmstepitem","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 43;BA.debugLine="Sub SetVIf(vif As Object) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="StepItem.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmstepitem","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 38;BA.debugLine="Sub SetVModel(k As String) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="StepItem.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmstepitem","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 48;BA.debugLine="Sub SetVShow(vif As Object) As VMStepItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="StepItem.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmstepitem) ","vmstepitem",92,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmstepitem","tostring", __ref);}
 BA.debugLineNum = 34;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="Return StepItem.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_stepitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 36;BA.debugLine="End Sub";
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