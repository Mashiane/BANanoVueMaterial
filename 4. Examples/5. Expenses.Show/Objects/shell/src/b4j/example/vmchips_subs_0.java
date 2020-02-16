package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmchips_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmchips","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 115;BA.debugLine="Sub AddChild(child As VMElement) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 117;BA.debugLine="Chips.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 118;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 119;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmchips","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 157;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 159;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 161;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmchips","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 139;BA.debugLine="Sub AddClass(c As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Chips.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmchips","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 293;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 294;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmchips.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 295;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Chips As VMElement";
vmchips._chips = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_chips",vmchips._chips);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmchips._id = RemoteObject.createImmutable("");__ref.setField("_id",vmchips._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmchips._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmchips._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmchips._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmchips._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private hasHelp As Boolean";
vmchips._hashelp = RemoteObject.createImmutable(false);__ref.setField("_hashelp",vmchips._hashelp);
 //BA.debugLineNum = 8;BA.debugLine="Private ht As VMElement";
vmchips._ht = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_ht",vmchips._ht);
 //BA.debugLineNum = 9;BA.debugLine="Private et As VMElement";
vmchips._et = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_et",vmchips._et);
 //BA.debugLineNum = 10;BA.debugLine="Private lbl As VMElement";
vmchips._lbl = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_lbl",vmchips._lbl);
 //BA.debugLineNum = 11;BA.debugLine="Private hasLabel As Boolean";
vmchips._haslabel = RemoteObject.createImmutable(false);__ref.setField("_haslabel",vmchips._haslabel);
 //BA.debugLineNum = 12;BA.debugLine="Private hasError As Boolean";
vmchips._haserror = RemoteObject.createImmutable(false);__ref.setField("_haserror",vmchips._haserror);
 //BA.debugLineNum = 13;BA.debugLine="Private module As Object";
vmchips._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmchips._module);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmchips","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _ctext = RemoteObject.createImmutable("");
RemoteObject _chint = RemoteObject.createImmutable(0);
RemoteObject _sval = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 19;BA.debugLine="Chips.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 20;BA.debugLine="Chips.SetTag(\"md-chips\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-chips")));
 BA.debugLineNum = 21;BA.debugLine="lbl.Initialize(v,\"\").SetTag(\"label\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("label")));
 BA.debugLineNum = 22;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 23;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 24;BA.debugLine="hasHelp = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmchips.__c.getField(true,"False"));
 BA.debugLineNum = 25;BA.debugLine="hasLabel = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haslabel" /*RemoteObject*/ ,vmchips.__c.getField(true,"False"));
 BA.debugLineNum = 26;BA.debugLine="hasHelp = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmchips.__c.getField(true,"False"));
 BA.debugLineNum = 27;BA.debugLine="hasError = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmchips.__c.getField(true,"False"));
 BA.debugLineNum = 28;BA.debugLine="Dim cText As String, chInt As Int  'ignore";
Debug.JustUpdateDeviceLine();
_ctext = RemoteObject.createImmutable("");Debug.locals.put("cText", _ctext);
_chint = RemoteObject.createImmutable(0);Debug.locals.put("chInt", _chint);
 BA.debugLineNum = 29;BA.debugLine="SetOnDelete(cText, chInt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setondelete" /*RemoteObject*/ ,(Object)(_ctext),(Object)(_chint));
 BA.debugLineNum = 30;BA.debugLine="SetOnClick(cText, chInt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setonclick" /*RemoteObject*/ ,(Object)(_ctext),(Object)(_chint));
 BA.debugLineNum = 31;BA.debugLine="Dim sval As String";
Debug.JustUpdateDeviceLine();
_sval = RemoteObject.createImmutable("");Debug.locals.put("sval", _sval);
 BA.debugLineNum = 32;BA.debugLine="SetOnInsert(sval)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setoninsert" /*RemoteObject*/ ,(Object)(_sval));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmchips","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 134;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmchips.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmchips","render", __ref);}
 BA.debugLineNum = 110;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmchips.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmchips","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 127;BA.debugLine="Sub SetAccent(b As Boolean) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmchips.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 129;BA.debugLine="Chips.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmchips.__c.getField(true,"True")));
 BA.debugLineNum = 130;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 131;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmchips","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 145;BA.debugLine="Sub SetAttr(attr As Map) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Chips.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 147;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcheckduplicated(RemoteObject __ref,RemoteObject _varcheckduplicated) throws Exception{
try {
		Debug.PushSubsStack("SetCheckDuplicated (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("setcheckduplicated")) { return __ref.runUserSub(false, "vmchips","setcheckduplicated", __ref, _varcheckduplicated);}
Debug.locals.put("varCheckDuplicated", _varcheckduplicated);
 BA.debugLineNum = 234;BA.debugLine="Sub SetCheckDuplicated(varCheckDuplicated As Boole";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="If varCheckDuplicated = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varcheckduplicated,vmchips.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 236;BA.debugLine="SetAttr(CreateMap(\":md-check-duplicated\": varChec";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchips.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-check-duplicated")),(_varcheckduplicated)}))));
 BA.debugLineNum = 237;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 238;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmchips","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 252;BA.debugLine="Sub SetDisabled(b As Boolean) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 253;BA.debugLine="Chips.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 254;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setemail(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetEmail (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("setemail")) { return __ref.runUserSub(false, "vmchips","setemail", __ref);}
 BA.debugLineNum = 192;BA.debugLine="Sub SetEmail As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="SetInputType(\"email\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setinputtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("email")));
 BA.debugLineNum = 194;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 195;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetErrorText (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("seterrortext")) { return __ref.runUserSub(false, "vmchips","seterrortext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 44;BA.debugLine="Sub SetErrorText(txt As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="If txt = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_txt,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 46;BA.debugLine="hasError = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmchips.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="et = Chips.SetErrorText(txt)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_et" /*RemoteObject*/ ,__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_txt)));
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
public static RemoteObject  _setformat(RemoteObject __ref,RemoteObject _varformat,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetFormat (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("setformat")) { return __ref.runUserSub(false, "vmchips","setformat", __ref, _varformat, _methodname);}
RemoteObject _value = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("varFormat", _varformat);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 241;BA.debugLine="Sub SetFormat(varFormat As String, methodName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 242;BA.debugLine="If varFormat = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varformat,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 243;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 244;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmchips.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmchips.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 245;BA.debugLine="SetAttr(CreateMap(\":md-format\": varFormat))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchips.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-format")),(_varformat)}))));
 BA.debugLineNum = 246;BA.debugLine="Dim value As String";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.createImmutable("");Debug.locals.put("value", _value);
 BA.debugLineNum = 247;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmchips.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 248;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 249;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 250;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetHelperText (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("sethelpertext")) { return __ref.runUserSub(false, "vmchips","sethelpertext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 37;BA.debugLine="Sub SetHelperText(t As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 39;BA.debugLine="hasHelp = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmchips.__c.getField(true,"True"));
 BA.debugLineNum = 40;BA.debugLine="ht = Chips.SetHelperText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ht" /*RemoteObject*/ ,__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_t)));
 BA.debugLineNum = 41;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinputtype(RemoteObject __ref,RemoteObject _varinputtype) throws Exception{
try {
		Debug.PushSubsStack("SetInputType (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("setinputtype")) { return __ref.runUserSub(false, "vmchips","setinputtype", __ref, _varinputtype);}
Debug.locals.put("varInputType", _varinputtype);
 BA.debugLineNum = 171;BA.debugLine="Sub SetInputType(varInputType As String) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 172;BA.debugLine="If varInputType = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varinputtype,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 173;BA.debugLine="SetAttr(CreateMap(\"md-input-type\": varInputType))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchips.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-input-type")),(_varinputtype)}))));
 BA.debugLineNum = 174;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _labeltext) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmchips","setlabel", __ref, _labeltext);}
Debug.locals.put("labelText", _labeltext);
 BA.debugLineNum = 90;BA.debugLine="Sub SetLabel(labelText As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="If labelText = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_labeltext,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 92;BA.debugLine="lbl.SetText(labelText)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_labeltext));
 BA.debugLineNum = 93;BA.debugLine="hasLabel = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haslabel" /*RemoteObject*/ ,vmchips.__c.getField(true,"True"));
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
public static RemoteObject  _setlimit(RemoteObject __ref,RemoteObject _varlimit) throws Exception{
try {
		Debug.PushSubsStack("SetLimit (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,227);
if (RapidSub.canDelegate("setlimit")) { return __ref.runUserSub(false, "vmchips","setlimit", __ref, _varlimit);}
Debug.locals.put("varLimit", _varlimit);
 BA.debugLineNum = 227;BA.debugLine="Sub SetLimit(varLimit As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 228;BA.debugLine="If varLimit = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varlimit,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 229;BA.debugLine="SetAttr(CreateMap(\":md-limit\": varLimit))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchips.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-limit")),(_varlimit)}))));
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
public static RemoteObject  _setnumber(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetNumber (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("setnumber")) { return __ref.runUserSub(false, "vmchips","setnumber", __ref);}
 BA.debugLineNum = 202;BA.debugLine="Sub SetNumber As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="SetInputType(\"number\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setinputtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("number")));
 BA.debugLineNum = 204;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclick(RemoteObject __ref,RemoteObject _text,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("SetOnClick (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,270);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vmchips","setonclick", __ref, _text, _index);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("text", _text);
Debug.locals.put("index", _index);
 BA.debugLineNum = 270;BA.debugLine="private Sub SetOnClick(text As String, index As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 271;BA.debugLine="Dim methodName As String  = $\"${ID}_click\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmchips.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 272;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmchips.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmchips.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 273;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmchips.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_text),(_index)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 274;BA.debugLine="SetAttr(CreateMap(\"v-on:md-click\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchips.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-click")),(_methodname)}))));
 BA.debugLineNum = 276;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 277;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 278;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondelete(RemoteObject __ref,RemoteObject _text,RemoteObject _index) throws Exception{
try {
		Debug.PushSubsStack("SetOnDelete (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("setondelete")) { return __ref.runUserSub(false, "vmchips","setondelete", __ref, _text, _index);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("text", _text);
Debug.locals.put("index", _index);
 BA.debugLineNum = 259;BA.debugLine="private Sub SetOnDelete(text As String, index As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 260;BA.debugLine="Dim methodName As String = $\"${ID}_delete\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmchips.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_delete")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 261;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmchips.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmchips.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 262;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmchips.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_text),(_index)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 263;BA.debugLine="SetAttr(CreateMap(\"v-on:md-delete\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchips.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-delete")),(_methodname)}))));
 BA.debugLineNum = 265;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 266;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 267;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoninsert(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetOnInsert (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("setoninsert")) { return __ref.runUserSub(false, "vmchips","setoninsert", __ref, _value);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("value", _value);
 BA.debugLineNum = 281;BA.debugLine="private Sub SetOnInsert(value As String) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 282;BA.debugLine="Dim methodName As String = $\"${ID}_insert\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmchips.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_insert")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 283;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmchips.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmchips.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 284;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmchips.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_value)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 285;BA.debugLine="SetAttr(CreateMap(\"v-on:md-insert\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchips.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-insert")),(_methodname)}))));
 BA.debugLineNum = 287;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 288;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoptions(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _options) throws Exception{
try {
		Debug.PushSubsStack("SetOptions (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("setoptions")) { return __ref.runUserSub(false, "vmchips","setoptions", __ref, _vmodel, _options);}
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("options", _options);
 BA.debugLineNum = 78;BA.debugLine="Sub SetOptions(vModel As String, options As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="SetVModel(vModel)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 80;BA.debugLine="vue.SetStateSingle(vModel, options)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((_options.getObject())));
 BA.debugLineNum = 81;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmchips","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 164;BA.debugLine="Sub SetPadding(p As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="If p = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_p,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 166;BA.debugLine="Chips.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)((_p)));
 BA.debugLineNum = 167;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpassword(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPassword (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("setpassword")) { return __ref.runUserSub(false, "vmchips","setpassword", __ref);}
 BA.debugLineNum = 182;BA.debugLine="Sub SetPassword As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="SetInputType(\"password\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setinputtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("password")));
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
		Debug.PushSubsStack("SetPlaceholder (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("setplaceholder")) { return __ref.runUserSub(false, "vmchips","setplaceholder", __ref, _varplaceholder);}
Debug.locals.put("varPlaceholder", _varplaceholder);
 BA.debugLineNum = 213;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 214;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varplaceholder,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 215;BA.debugLine="SetAttr(CreateMap(\"md-placeholder\": varPlaceholde";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchips.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-placeholder")),(_varplaceholder)}))));
 BA.debugLineNum = 216;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 217;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmchips","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 121;BA.debugLine="Sub SetPrimary(b As Boolean) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmchips.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 123;BA.debugLine="Chips.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmchips.__c.getField(true,"True")));
 BA.debugLineNum = 124;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetRequired (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setrequired")) { return __ref.runUserSub(false, "vmchips","setrequired", __ref, _varrequired);}
Debug.locals.put("varRequired", _varrequired);
 BA.debugLineNum = 59;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Chips.SetRequired(varRequired)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setrequired" /*RemoteObject*/ ,(Object)(_varrequired));
 BA.debugLineNum = 61;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsearch(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetSearch (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("setsearch")) { return __ref.runUserSub(false, "vmchips","setsearch", __ref);}
 BA.debugLineNum = 187;BA.debugLine="Sub SetSearch As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 188;BA.debugLine="SetInputType(\"search\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setinputtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("search")));
 BA.debugLineNum = 189;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 190;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatic(RemoteObject __ref,RemoteObject _varstatic) throws Exception{
try {
		Debug.PushSubsStack("SetStatic (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("setstatic")) { return __ref.runUserSub(false, "vmchips","setstatic", __ref, _varstatic);}
Debug.locals.put("varStatic", _varstatic);
 BA.debugLineNum = 220;BA.debugLine="Sub SetStatic(varStatic As Boolean) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 221;BA.debugLine="If varStatic = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varstatic,vmchips.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 222;BA.debugLine="SetAttr(CreateMap(\":md-static\": varStatic))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchips.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-static")),(_varstatic)}))));
 BA.debugLineNum = 223;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 224;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmchips","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 151;BA.debugLine="Sub SetStyle(sm As Map) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="Chips.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmchips","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 51;BA.debugLine="Sub SetTabIndex(ti As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="If ti = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ti,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 53;BA.debugLine="Chips.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settel(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetTel (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("settel")) { return __ref.runUserSub(false, "vmchips","settel", __ref);}
 BA.debugLineNum = 197;BA.debugLine="Sub SetTel As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="SetInputType(\"tel\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setinputtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("tel")));
 BA.debugLineNum = 199;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 200;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmchips","settext", __ref);}
 BA.debugLineNum = 177;BA.debugLine="Sub SetText As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 178;BA.debugLine="SetInputType(\"text\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setinputtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("text")));
 BA.debugLineNum = 179;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seturl(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetURL (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("seturl")) { return __ref.runUserSub(false, "vmchips","seturl", __ref);}
 BA.debugLineNum = 207;BA.debugLine="Sub SetURL As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 208;BA.debugLine="SetInputType(\"url\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchips.class, "_setinputtype" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("url")));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmchips","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 97;BA.debugLine="Sub SetVIf(vif As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 99;BA.debugLine="Chips.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmchips","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 84;BA.debugLine="Sub SetVModel(k As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="If k = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_k,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 86;BA.debugLine="Chips.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
		Debug.PushSubsStack("SetVShow (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmchips","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 103;BA.debugLine="Sub SetVShow(vif As String) As VMChips";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 105;BA.debugLine="Chips.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmchips) ","vmchips",44,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmchips","tostring", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="If hasLabel Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_haslabel" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 67;BA.debugLine="lbl.pop(Chips)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_chips" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 69;BA.debugLine="If hasHelp Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hashelp" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 70;BA.debugLine="ht.Pop(Chips)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ht" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_chips" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 72;BA.debugLine="If hasError Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_haserror" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 73;BA.debugLine="et.Pop(Chips)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_et" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_chips" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 75;BA.debugLine="Return Chips.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_chips" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 76;BA.debugLine="End Sub";
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