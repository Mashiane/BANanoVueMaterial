package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmfield_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmfield","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 65;BA.debugLine="Sub AddChild(child As VMElement) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 67;BA.debugLine="Field.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 68;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmfield","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 111;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 113;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfield.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 115;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmfield","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 93;BA.debugLine="Sub AddClass(c As String) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="Field.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Field As VMElement";
vmfield._field = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_field",vmfield._field);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmfield._id = RemoteObject.createImmutable("");__ref.setField("_id",vmfield._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmfield._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmfield._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmfield._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmfield._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmfield._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmfield._module);
 //BA.debugLineNum = 8;BA.debugLine="Private errKey As String";
vmfield._errkey = RemoteObject.createImmutable("");__ref.setField("_errkey",vmfield._errkey);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _fielderror(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FieldError (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("fielderror")) { return __ref.runUserSub(false, "vmfield","fielderror", __ref);}
RemoteObject _errmodel = RemoteObject.createImmutable(false);
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 31;BA.debugLine="private Sub FieldError As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="Dim errModel As Boolean = vue.GetState(errKey, Fa";
Debug.JustUpdateDeviceLine();
_errmodel = BA.ObjectToBoolean(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_errkey" /*RemoteObject*/ )),(Object)((vmfield.__c.getField(true,"False")))));Debug.locals.put("errModel", _errmodel);Debug.locals.put("errModel", _errmodel);
 BA.debugLineNum = 33;BA.debugLine="Dim obj As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_obj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_obj = vmfield.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("obj", _obj);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 34;BA.debugLine="obj.Put(\"md-invalid\", errModel)";
Debug.JustUpdateDeviceLine();
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("md-invalid"))),(Object)((_errmodel)));
 BA.debugLineNum = 35;BA.debugLine="Return obj";
Debug.JustUpdateDeviceLine();
if (true) return (_obj.getObject());
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _parentid,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmfield","initialize", __ref, _ba, _v, _parentid, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("parentID", _parentid);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, parentID As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 14;BA.debugLine="Field.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 15;BA.debugLine="Field.SetTag(\"md-field\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-field")));
 BA.debugLineNum = 16;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 18;BA.debugLine="Field.SetOnClear(module, $\"${ID}_clear\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclear" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmfield.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_clear")))));
 BA.debugLineNum = 19;BA.debugLine="errKey = $\"${parentID}error\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_errkey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmfield.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_parentid))),RemoteObject.createImmutable("error"))));
 BA.debugLineNum = 20;BA.debugLine="vue.SetStateSingle(errKey, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_errkey" /*RemoteObject*/ )),(Object)((vmfield.__c.getField(true,"False"))));
 BA.debugLineNum = 21;BA.debugLine="Field.SetAttr(CreateMap(\":class\":errKey & \"class\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfield.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":class")),(RemoteObject.concat(__ref.getField(true,"_errkey" /*RemoteObject*/ ),RemoteObject.createImmutable("class")))}))));
 BA.debugLineNum = 22;BA.debugLine="vue.SetComputed(errKey & \"class\", Me, \"FieldError";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcomputed" /*RemoteObject*/ ,(Object)(RemoteObject.concat(__ref.getField(true,"_errkey" /*RemoteObject*/ ),RemoteObject.createImmutable("class"))),(Object)(__ref),(Object)(RemoteObject.createImmutable("FieldError")));
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
		Debug.PushSubsStack("Pop (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmfield","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 88;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmfield.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmfield","render", __ref);}
 BA.debugLineNum = 60;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmfield.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 62;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmfield","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 82;BA.debugLine="Sub SetAccent(b As Boolean) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="Field.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmfield.__c.getField(true,"True")));
 BA.debugLineNum = 84;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmfield","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 99;BA.debugLine="Sub SetAttr(attr As Map) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="Field.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setclearable(RemoteObject __ref,RemoteObject _varclearable) throws Exception{
try {
		Debug.PushSubsStack("SetClearable (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("setclearable")) { return __ref.runUserSub(false, "vmfield","setclearable", __ref, _varclearable);}
Debug.locals.put("varClearable", _varclearable);
 BA.debugLineNum = 136;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMFie";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="SetAttr(CreateMap(\":md-clearable\": varClearable))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfield.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-clearable")),(_varclearable)}))));
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
public static RemoteObject  _setcounter(RemoteObject __ref,RemoteObject _varcounter) throws Exception{
try {
		Debug.PushSubsStack("SetCounter (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("setcounter")) { return __ref.runUserSub(false, "vmfield","setcounter", __ref, _varcounter);}
Debug.locals.put("varCounter", _varcounter);
 BA.debugLineNum = 130;BA.debugLine="Sub SetCounter(varCounter As Boolean) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="SetAttr(CreateMap(\":md-counter\": varCounter))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfield.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-counter")),(_varcounter)}))));
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
public static RemoteObject  _setinline(RemoteObject __ref,RemoteObject _varinline) throws Exception{
try {
		Debug.PushSubsStack("SetInline (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setinline")) { return __ref.runUserSub(false, "vmfield","setinline", __ref, _varinline);}
Debug.locals.put("varInline", _varinline);
 BA.debugLineNum = 124;BA.debugLine="Sub SetInline(varInline As Boolean) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="SetAttr(CreateMap(\":md-inline\": varInline))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfield.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-inline")),(_varinline)}))));
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
public static RemoteObject  _setmaxwidth(RemoteObject __ref,RemoteObject _mw) throws Exception{
try {
		Debug.PushSubsStack("SetMaxWidth (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("setmaxwidth")) { return __ref.runUserSub(false, "vmfield","setmaxwidth", __ref, _mw);}
Debug.locals.put("mw", _mw);
 BA.debugLineNum = 26;BA.debugLine="Sub SetMaxWidth(mw As String) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="Field.SetMaxWidth(mw)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmaxwidth" /*RemoteObject*/ ,(Object)(_mw));
 BA.debugLineNum = 28;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmfield","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 118;BA.debugLine="Sub SetPadding(p As Object) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Field.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmfield","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 77;BA.debugLine="Sub SetPrimary(b As Boolean) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="Field.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmfield.__c.getField(true,"True")));
 BA.debugLineNum = 79;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmfield","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 105;BA.debugLine="Sub SetStyle(sm As Map) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="Field.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 107;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmfield","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 72;BA.debugLine="Sub SetText(t As Object) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="Field.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 74;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settogglepassword(RemoteObject __ref,RemoteObject _vartogglepassword) throws Exception{
try {
		Debug.PushSubsStack("SetTogglePassword (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("settogglepassword")) { return __ref.runUserSub(false, "vmfield","settogglepassword", __ref, _vartogglepassword);}
Debug.locals.put("varTogglePassword", _vartogglepassword);
 BA.debugLineNum = 142;BA.debugLine="Sub SetTogglePassword(varTogglePassword As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="SetAttr(CreateMap(\":md-toggle-password\": varToggl";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vmfield.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-toggle-password")),(_vartogglepassword)}))));
 BA.debugLineNum = 144;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 145;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmfield","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 49;BA.debugLine="Sub SetVIf(vif As Object) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="Field.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 51;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmfield","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 44;BA.debugLine="Sub SetVModel(k As String) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Field.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmfield","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 54;BA.debugLine="Sub SetVShow(vif As Object) As VMField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="Field.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 56;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmfield) ","vmfield",56,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmfield","tostring", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="Return Field.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_field" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}