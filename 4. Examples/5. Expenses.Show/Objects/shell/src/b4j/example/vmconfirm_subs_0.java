package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmconfirm_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmconfirm","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 45;BA.debugLine="Sub AddClass(c As String) As VMConfirm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="Confirm.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 47;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Confirm As VMElement";
vmconfirm._confirm = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_confirm",vmconfirm._confirm);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmconfirm._id = RemoteObject.createImmutable("");__ref.setField("_id",vmconfirm._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmconfirm._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmconfirm._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmconfirm._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmconfirm._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private bActive As Boolean";
vmconfirm._bactive = RemoteObject.createImmutable(false);__ref.setField("_bactive",vmconfirm._bactive);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmconfirm._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmconfirm._module);
 //BA.debugLineNum = 9;BA.debugLine="Private bstatic As Boolean";
vmconfirm._bstatic = RemoteObject.createImmutable(false);__ref.setField("_bstatic",vmconfirm._bstatic);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmconfirm","hide", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 32;BA.debugLine="Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 34;BA.debugLine="opt.Put(ID, False)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmconfirm.__c.getField(true,"False"))));
 BA.debugLineNum = 35;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmconfirm","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 14;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 15;BA.debugLine="Confirm.Initialize(vue, ID).SetTag(\"md-dialog-con";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dialog-confirm")));
 BA.debugLineNum = 16;BA.debugLine="bActive = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmconfirm.__c.getField(true,"False"));
 BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 18;BA.debugLine="SetActiveSync(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmconfirm.class, "_setactivesync" /*RemoteObject*/ ,(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 21;BA.debugLine="Confirm.SetOnConfirm(module, $\"${ID}_ok\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonconfirm" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmconfirm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_ok")))));
 BA.debugLineNum = 22;BA.debugLine="Confirm.SetOnCancel(module, $\"${ID}_cancel\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setoncancel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmconfirm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_cancel")))));
 BA.debugLineNum = 23;BA.debugLine="bstatic = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bstatic" /*RemoteObject*/ ,vmconfirm.__c.getField(true,"False"));
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
		Debug.PushSubsStack("Pop (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmconfirm","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 114;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmconfirm.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 116;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmconfirm","render", __ref);}
 BA.debugLineNum = 110;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmconfirm.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setactivesync(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("SetActiveSync (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setactivesync")) { return __ref.runUserSub(false, "vmconfirm","setactivesync", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 66;BA.debugLine="private Sub SetActiveSync(a As Object) As VMConfir";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="Confirm.SetActiveSync(a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setactivesync" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_a)));
 BA.debugLineNum = 68;BA.debugLine="bActive = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmconfirm.__c.getField(true,"True"));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmconfirm","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 51;BA.debugLine="Sub SetAttr(attr As Map) As VMConfirm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Confirm.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setcanceltext(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetCancelText (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setcanceltext")) { return __ref.runUserSub(false, "vmconfirm","setcanceltext", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 56;BA.debugLine="Sub SetCancelText(c As String) As VMConfirm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="If bstatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 58;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-cancel-text\": c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-cancel-text")),(_c)}))));
 BA.debugLineNum = 59;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 61;BA.debugLine="vue.SetState(CreateMap(\"canceltext\":c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("canceltext")),(_c)}))));
 BA.debugLineNum = 62;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-cancel-text\": \"can";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-cancel-text")),(RemoteObject.createImmutable("canceltext"))}))));
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
public static RemoteObject  _setconfirmtext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetConfirmText (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("setconfirmtext")) { return __ref.runUserSub(false, "vmconfirm","setconfirmtext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 82;BA.debugLine="Sub SetConfirmText(t As String) As VMConfirm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="If bstatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 84;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-confirm-text\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-confirm-text")),(_t)}))));
 BA.debugLineNum = 85;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 87;BA.debugLine="vue.SetState(CreateMap(\"confirmtext\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("confirmtext")),(_t)}))));
 BA.debugLineNum = 88;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-confirm-text\":\"con";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-confirm-text")),(RemoteObject.createImmutable("confirmtext"))}))));
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
public static RemoteObject  _setcontent(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetContent (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setcontent")) { return __ref.runUserSub(false, "vmconfirm","setcontent", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 72;BA.debugLine="Sub SetContent(c As String) As VMConfirm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="If bstatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 74;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-content\": c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-content")),(_c)}))));
 BA.debugLineNum = 75;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 77;BA.debugLine="vue.SetState(CreateMap(\"confirmmessage\":c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("confirmmessage")),(_c)}))));
 BA.debugLineNum = 78;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-content\": \"confirm";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-content")),(RemoteObject.createImmutable("confirmmessage"))}))));
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
public static RemoteObject  _setstatic(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStatic (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("setstatic")) { return __ref.runUserSub(false, "vmconfirm","setstatic", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 27;BA.debugLine="Sub SetStatic(b As Boolean) As VMConfirm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="bstatic = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bstatic" /*RemoteObject*/ ,_b);
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
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmconfirm","settitle", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 92;BA.debugLine="Sub SetTitle(t As String) As VMConfirm";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="If bstatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="Confirm.SetAttr(CreateMap(\"md-title\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-title")),(_t)}))));
 BA.debugLineNum = 95;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 97;BA.debugLine="vue.SetState(CreateMap(\"confirmtitle\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("confirmtitle")),(_t)}))));
 BA.debugLineNum = 98;BA.debugLine="Confirm.SetAttr(CreateMap(\":md-title\":\"confirmtit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-title")),(RemoteObject.createImmutable("confirmtitle"))}))));
 BA.debugLineNum = 99;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmconfirm","show", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 38;BA.debugLine="Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmconfirm.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 40;BA.debugLine="opt.Put(ID, True)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmconfirm.__c.getField(true,"True"))));
 BA.debugLineNum = 41;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmconfirm) ","vmconfirm",46,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmconfirm","tostring", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="If bActive = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_bactive" /*RemoteObject*/ ),vmconfirm.__c.getField(true,"False"))) { 
 BA.debugLineNum = 105;BA.debugLine="Log($\"VMConfirm.SetActiveSync: '${ID}' has not b";
Debug.JustUpdateDeviceLine();
vmconfirm.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMConfirm.SetActiveSync: '"),vmconfirm.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("' has not been activated!")))));
 };
 BA.debugLineNum = 107;BA.debugLine="Return Confirm.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_confirm" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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