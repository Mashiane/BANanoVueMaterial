package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtimepicker_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmtimepicker","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 146;BA.debugLine="Sub AddChild(child As VMElement) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 147;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 148;BA.debugLine="TimePicker.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmtimepicker","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 175;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 177;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 179;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtimepicker","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 51;BA.debugLine="Sub AddClass(c As String) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="TimePicker.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,267);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmtimepicker","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 267;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 268;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmtimepicker.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 269;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Private TimePicker As VMElement";
vmtimepicker._timepicker = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_timepicker",vmtimepicker._timepicker);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtimepicker._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtimepicker._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtimepicker._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtimepicker._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private TimePickerInt As VMField";
vmtimepicker._timepickerint = RemoteObject.createNew ("b4j.example.vmfield");__ref.setField("_timepickerint",vmtimepicker._timepickerint);
 //BA.debugLineNum = 7;BA.debugLine="Private lbl As VMLabel";
vmtimepicker._lbl = RemoteObject.createNew ("b4j.example.vmlabel");__ref.setField("_lbl",vmtimepicker._lbl);
 //BA.debugLineNum = 8;BA.debugLine="Private hasHelp As Boolean";
vmtimepicker._hashelp = RemoteObject.createImmutable(false);__ref.setField("_hashelp",vmtimepicker._hashelp);
 //BA.debugLineNum = 9;BA.debugLine="Private ht As VMElement";
vmtimepicker._ht = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_ht",vmtimepicker._ht);
 //BA.debugLineNum = 10;BA.debugLine="Private et As VMElement";
vmtimepicker._et = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_et",vmtimepicker._et);
 //BA.debugLineNum = 11;BA.debugLine="Private BANano As BANano   'ignore";
vmtimepicker._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmtimepicker._banano);
 //BA.debugLineNum = 12;BA.debugLine="Private hasError As Boolean";
vmtimepicker._haserror = RemoteObject.createImmutable(false);__ref.setField("_haserror",vmtimepicker._haserror);
 //BA.debugLineNum = 13;BA.debugLine="Private module As Object";
vmtimepicker._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmtimepicker._module);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtimepicker","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sval = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 17;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 18;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 19;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 20;BA.debugLine="TimePicker.Initialize(vue, ID).SetTag(\"md-select\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-select")));
 BA.debugLineNum = 21;BA.debugLine="TimePickerInt.Initialize(v,ID,$\"${ID}field\"$,modu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepickerint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("field")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 22;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("label")))));
 BA.debugLineNum = 23;BA.debugLine="hasHelp = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmtimepicker.__c.getField(true,"False"));
 BA.debugLineNum = 24;BA.debugLine="hasError = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmtimepicker.__c.getField(true,"False"));
 BA.debugLineNum = 25;BA.debugLine="SetTimes";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_settimes" /*RemoteObject*/ );
 BA.debugLineNum = 26;BA.debugLine="Dim sval As String";
Debug.JustUpdateDeviceLine();
_sval = RemoteObject.createImmutable("");Debug.locals.put("sval", _sval);
 BA.debugLineNum = 27;BA.debugLine="SetOnSelected(sval)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setonselected" /*RemoteObject*/ ,(Object)(_sval));
 BA.debugLineNum = 28;BA.debugLine="SetOnOpened";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setonopened" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="SetOnClosed";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setonclosed" /*RemoteObject*/ );
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtimepicker","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 129;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtimepicker.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtimepicker","render", __ref);}
 BA.debugLineNum = 125;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtimepicker.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmtimepicker","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 163;BA.debugLine="Sub SetAccent(b As Boolean) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="TimePicker.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmtimepicker.__c.getField(true,"True")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtimepicker","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 57;BA.debugLine="Sub SetAttr(attr As Map) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="TimePicker.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setdense(RemoteObject __ref,RemoteObject _vardense) throws Exception{
try {
		Debug.PushSubsStack("SetDense (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("setdense")) { return __ref.runUserSub(false, "vmtimepicker","setdense", __ref, _vardense);}
Debug.locals.put("varDense", _vardense);
 BA.debugLineNum = 226;BA.debugLine="Sub SetDense(varDense As Boolean) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="If varDense = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vardense,vmtimepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 228;BA.debugLine="If varDense Then SetAttr(CreateMap(\":md-dense\": v";
Debug.JustUpdateDeviceLine();
if (_vardense.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtimepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-dense")),(_vardense)}))));};
 BA.debugLineNum = 229;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 230;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmtimepicker","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 213;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 214;BA.debugLine="TimePicker.setdisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 215;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 216;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetErrorText (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("seterrortext")) { return __ref.runUserSub(false, "vmtimepicker","seterrortext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 106;BA.debugLine="Sub SetErrorText(txt As String) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="If txt = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_txt,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 108;BA.debugLine="hasError = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmtimepicker.__c.getField(true,"True"));
 BA.debugLineNum = 109;BA.debugLine="et = TimePicker.SetErrorText(txt)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_et" /*RemoteObject*/ ,__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_txt)));
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
public static RemoteObject  _sethelpertext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetHelperText (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("sethelpertext")) { return __ref.runUserSub(false, "vmtimepicker","sethelpertext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 99;BA.debugLine="Sub SetHelperText(t As String) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 101;BA.debugLine="hasHelp = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmtimepicker.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="ht = TimePicker.SetHelperText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ht" /*RemoteObject*/ ,__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_t)));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmtimepicker","setid", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 207;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 208;BA.debugLine="TimePicker.SetID(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 209;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 210;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetLabel (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmtimepicker","setlabel", __ref, _l);}
Debug.locals.put("l", _l);
 BA.debugLineNum = 67;BA.debugLine="Sub SetLabel(l As Object) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="lbl.SetText(l)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_l)));
 BA.debugLineNum = 69;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMultiple (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("setmultiple")) { return __ref.runUserSub(false, "vmtimepicker","setmultiple", __ref, _varmultiple);}
Debug.locals.put("varMultiple", _varmultiple);
 BA.debugLineNum = 219;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMTimeP";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 220;BA.debugLine="If varMultiple = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varmultiple,vmtimepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 221;BA.debugLine="SetAttr(CreateMap(\":multiple\": varMultiple))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtimepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":multiple")),(_varmultiple)}))));
 BA.debugLineNum = 222;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 223;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetName (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmtimepicker","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 201;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 202;BA.debugLine="TimePicker.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 203;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 204;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnClosed (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("setonclosed")) { return __ref.runUserSub(false, "vmtimepicker","setonclosed", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 256;BA.debugLine="Sub SetOnClosed As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_closed")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 258;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmtimepicker.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmtimepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 259;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 260;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 261;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtimepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-closed")),(_methodname)}))));
 BA.debugLineNum = 263;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setonopened(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnOpened (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("setonopened")) { return __ref.runUserSub(false, "vmtimepicker","setonopened", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 244;BA.debugLine="private Sub SetOnOpened As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="Dim methodName As String  = $\"${ID}_opened\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_opened")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 246;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmtimepicker.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmtimepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 247;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 248;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 249;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtimepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-opened")),(_methodname)}))));
 BA.debugLineNum = 251;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 252;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 253;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnSelected (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,233);
if (RapidSub.canDelegate("setonselected")) { return __ref.runUserSub(false, "vmtimepicker","setonselected", __ref, _value);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("value", _value);
 BA.debugLineNum = 233;BA.debugLine="private Sub SetOnSelected(value As String) As VMTi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 234;BA.debugLine="Dim methodName As String = $\"${ID}_change\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_change")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 235;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmtimepicker.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmtimepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 236;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmtimepicker.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 237;BA.debugLine="SetAttr(CreateMap(\"v-on:md-selected\": methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtimepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-selected")),(_methodname)}))));
 BA.debugLineNum = 239;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 240;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 241;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOptions (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setoptions")) { return __ref.runUserSub(false, "vmtimepicker","setoptions", __ref, _sourcename, _options, _sourcefield, _displayfield);}
RemoteObject _recs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _nrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _krow = RemoteObject.createImmutable("");
RemoteObject _drow = RemoteObject.createImmutable("");
RemoteObject _option = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sourceName", _sourcename);
Debug.locals.put("options", _options);
Debug.locals.put("sourcefield", _sourcefield);
Debug.locals.put("displayfield", _displayfield);
 BA.debugLineNum = 72;BA.debugLine="private Sub SetOptions(sourceName As String, optio";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="sourceName = sourceName.tolowercase";
Debug.JustUpdateDeviceLine();
_sourcename = _sourcename.runMethod(true,"toLowerCase");Debug.locals.put("sourceName", _sourcename);
 BA.debugLineNum = 74;BA.debugLine="Dim recs As List";
Debug.JustUpdateDeviceLine();
_recs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("recs", _recs);
 BA.debugLineNum = 75;BA.debugLine="recs.Initialize";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Initialize");
 BA.debugLineNum = 76;BA.debugLine="For Each k As String In options";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _options;
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 77;BA.debugLine="Dim nrec As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nrec = vmtimepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nrec", _nrec);Debug.locals.put("nrec", _nrec);
 BA.debugLineNum = 78;BA.debugLine="nrec.Put(sourcefield, k)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_sourcefield)),(Object)((_k)));
 BA.debugLineNum = 79;BA.debugLine="nrec.Put(displayfield, k)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_displayfield)),(Object)((_k)));
 BA.debugLineNum = 80;BA.debugLine="recs.Add(nrec)";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Add",(Object)((_nrec.getObject())));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 83;BA.debugLine="vue.SetStateSingle(sourceName, recs)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_sourcename),(Object)((_recs.getObject())));
 BA.debugLineNum = 84;BA.debugLine="Dim kRow As String = $\"row.${sourcefield}\"$";
Debug.JustUpdateDeviceLine();
_krow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sourcefield))),RemoteObject.createImmutable("")));Debug.locals.put("kRow", _krow);Debug.locals.put("kRow", _krow);
 BA.debugLineNum = 85;BA.debugLine="Dim dRow As String = $\"row.${displayfield}\"$";
Debug.JustUpdateDeviceLine();
_drow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_displayfield))),RemoteObject.createImmutable("")));Debug.locals.put("dRow", _drow);Debug.locals.put("dRow", _drow);
 BA.debugLineNum = 86;BA.debugLine="Dim option As VMElement";
Debug.JustUpdateDeviceLine();
_option = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("option", _option);
 BA.debugLineNum = 87;BA.debugLine="option.Initialize(vue,\"\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 88;BA.debugLine="option.SetTag(\"md-option\")";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-option")));
 BA.debugLineNum = 89;BA.debugLine="option.SetVFor(\"row\", sourceName)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setvfor" /*RemoteObject*/ ,(Object)(BA.ObjectToString("row")),(Object)(_sourcename));
 BA.debugLineNum = 90;BA.debugLine="option.SetID($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmtimepicker.__c.getField(true,"True")));
 BA.debugLineNum = 91;BA.debugLine="option.SetKey($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable(""))))),(Object)(vmtimepicker.__c.getField(true,"True")));
 BA.debugLineNum = 92;BA.debugLine="option.SetValue($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setvalue" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmtimepicker.__c.getField(true,"True")));
 BA.debugLineNum = 93;BA.debugLine="option.SetName($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmtimepicker.__c.getField(true,"True")));
 BA.debugLineNum = 94;BA.debugLine="option.SetText($\"{{ ${dRow} }}\"$)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_drow))),RemoteObject.createImmutable(" }}")))));
 BA.debugLineNum = 95;BA.debugLine="option.Pop(TimePicker)";
Debug.JustUpdateDeviceLine();
_option.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_timepicker" /*RemoteObject*/ )));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmtimepicker","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 182;BA.debugLine="Sub SetPadding(p As Object) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="TimePicker.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 184;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 185;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPlaceholder (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("setplaceholder")) { return __ref.runUserSub(false, "vmtimepicker","setplaceholder", __ref, _varplaceholder);}
Debug.locals.put("varPlaceholder", _varplaceholder);
 BA.debugLineNum = 188;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varplaceholder,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 190;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtimepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("placeholder")),(_varplaceholder)}))));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmtimepicker","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 158;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="TimePicker.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmtimepicker.__c.getField(true,"True")));
 BA.debugLineNum = 160;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 161;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetRequired (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("setrequired")) { return __ref.runUserSub(false, "vmtimepicker","setrequired", __ref, _varrequired);}
Debug.locals.put("varRequired", _varrequired);
 BA.debugLineNum = 195;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMTimeP";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="TimePicker.SetRequired(varRequired)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setrequired" /*RemoteObject*/ ,(Object)(_varrequired));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmtimepicker","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 169;BA.debugLine="Sub SetStyle(sm As Map) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="TimePicker.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 171;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 172;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmtimepicker","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 44;BA.debugLine="Sub SetTabIndex(ti As String) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="TimePicker.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtimepicker","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 153;BA.debugLine="Sub SetText(t As Object) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="TimePicker.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 155;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settimes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetTimes (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("settimes")) { return __ref.runUserSub(false, "vmtimepicker","settimes", __ref);}
RemoteObject _times = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 33;BA.debugLine="private Sub SetTimes";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="Dim times As List";
Debug.JustUpdateDeviceLine();
_times = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("times", _times);
 BA.debugLineNum = 35;BA.debugLine="times.Initialize";
Debug.JustUpdateDeviceLine();
_times.runVoidMethod ("Initialize");
 BA.debugLineNum = 36;BA.debugLine="times.AddAll(Array(\"12:00\",\"12:30\",\"01:00\",\"01:30";
Debug.JustUpdateDeviceLine();
_times.runVoidMethod ("AddAll",(Object)(vmtimepicker.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {13},new Object[] {RemoteObject.createImmutable(("12:00")),RemoteObject.createImmutable(("12:30")),RemoteObject.createImmutable(("01:00")),RemoteObject.createImmutable(("01:30")),RemoteObject.createImmutable(("02:00")),RemoteObject.createImmutable(("02:30")),RemoteObject.createImmutable(("03:00")),RemoteObject.createImmutable(("03:30")),RemoteObject.createImmutable(("04:00")),RemoteObject.createImmutable(("04:30")),RemoteObject.createImmutable(("05:00")),RemoteObject.createImmutable(("05:30")),(RemoteObject.createImmutable("06:00"))})))));
 BA.debugLineNum = 37;BA.debugLine="times.AddAll(Array(\"06:30\",\"07:00\",\"07:30\",\"08:00";
Debug.JustUpdateDeviceLine();
_times.runVoidMethod ("AddAll",(Object)(vmtimepicker.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {13},new Object[] {RemoteObject.createImmutable(("06:30")),RemoteObject.createImmutable(("07:00")),RemoteObject.createImmutable(("07:30")),RemoteObject.createImmutable(("08:00")),RemoteObject.createImmutable(("08:30")),RemoteObject.createImmutable(("09:00")),RemoteObject.createImmutable(("09:30")),RemoteObject.createImmutable(("10:00")),RemoteObject.createImmutable(("10:30")),RemoteObject.createImmutable(("11:00")),RemoteObject.createImmutable(("11:30")),RemoteObject.createImmutable(("13:00")),(RemoteObject.createImmutable("13:30"))})))));
 BA.debugLineNum = 38;BA.debugLine="times.AddAll(Array(\"14:00\",\"14:30\",\"15:00\",\"15:30";
Debug.JustUpdateDeviceLine();
_times.runVoidMethod ("AddAll",(Object)(vmtimepicker.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {13},new Object[] {RemoteObject.createImmutable(("14:00")),RemoteObject.createImmutable(("14:30")),RemoteObject.createImmutable(("15:00")),RemoteObject.createImmutable(("15:30")),RemoteObject.createImmutable(("16:00")),RemoteObject.createImmutable(("16:30")),RemoteObject.createImmutable(("17:00")),RemoteObject.createImmutable(("17:30")),RemoteObject.createImmutable(("18:00")),RemoteObject.createImmutable(("18:30")),RemoteObject.createImmutable(("19:00")),RemoteObject.createImmutable(("19:30")),(RemoteObject.createImmutable("20:00"))})))));
 BA.debugLineNum = 39;BA.debugLine="times.AddAll(Array(\"20:30\",\"21:00\",\"21:30\",\"22:00";
Debug.JustUpdateDeviceLine();
_times.runVoidMethod ("AddAll",(Object)(vmtimepicker.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {10},new Object[] {RemoteObject.createImmutable(("20:30")),RemoteObject.createImmutable(("21:00")),RemoteObject.createImmutable(("21:30")),RemoteObject.createImmutable(("22:00")),RemoteObject.createImmutable(("22:30")),RemoteObject.createImmutable(("23:00")),RemoteObject.createImmutable(("23:30")),RemoteObject.createImmutable(("00:00")),RemoteObject.createImmutable(("00:30")),(RemoteObject.createImmutable(""))})))));
 BA.debugLineNum = 40;BA.debugLine="times.Sort(True)";
Debug.JustUpdateDeviceLine();
_times.runVoidMethod ("Sort",(Object)(vmtimepicker.__c.getField(true,"True")));
 BA.debugLineNum = 41;BA.debugLine="SetOptions($\"${ID}_times\"$, times, \"id\", \"text\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtimepicker.class, "_setoptions" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtimepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_times")))),(Object)(_times),(Object)(BA.ObjectToString("id")),(Object)(RemoteObject.createImmutable("text")));
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmtimepicker","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 133;BA.debugLine="Sub SetVIf(vif As String) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 135;BA.debugLine="TimePickerInt.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepickerint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvif" /*RemoteObject*/ ,(Object)((_vif)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmtimepicker","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 62;BA.debugLine="Sub SetVModel(k As String) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="TimePicker.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 64;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtimepicker","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 139;BA.debugLine="Sub SetVShow(vif As String) As VMTimePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 141;BA.debugLine="TimePickerInt.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepickerint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvshow" /*RemoteObject*/ ,(Object)((_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmtimepicker) ","vmtimepicker",101,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtimepicker","tostring", __ref);}
 BA.debugLineNum = 113;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="lbl.Pop(TimePickerInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_timepickerint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 115;BA.debugLine="TimePicker.Pop(TimePickerInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_timepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_timepickerint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 116;BA.debugLine="If hasHelp Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hashelp" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 117;BA.debugLine="ht.Pop(TimePickerInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ht" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_timepickerint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 119;BA.debugLine="If hasError Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_haserror" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 120;BA.debugLine="et.Pop(TimePickerInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_et" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_timepickerint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 122;BA.debugLine="Return TimePickerInt.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_timepickerint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 123;BA.debugLine="End Sub";
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