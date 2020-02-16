package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmprompt_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmprompt","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 49;BA.debugLine="Sub AddClass(c As String) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="Prompt.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Prompt As VMElement";
vmprompt._prompt = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_prompt",vmprompt._prompt);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmprompt._id = RemoteObject.createImmutable("");__ref.setField("_id",vmprompt._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmprompt._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmprompt._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmprompt._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmprompt._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private bActive As Boolean";
vmprompt._bactive = RemoteObject.createImmutable(false);__ref.setField("_bactive",vmprompt._bactive);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmprompt._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmprompt._module);
 //BA.debugLineNum = 9;BA.debugLine="Private bStatic As Boolean";
vmprompt._bstatic = RemoteObject.createImmutable(false);__ref.setField("_bstatic",vmprompt._bstatic);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmprompt","hide", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 31;BA.debugLine="Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 33;BA.debugLine="opt.Put(ID, False)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmprompt.__c.getField(true,"False"))));
 BA.debugLineNum = 34;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmprompt","initialize", __ref, _ba, _v, _sid, _eventhandler);}
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
 BA.debugLineNum = 15;BA.debugLine="Prompt.Initialize(vue, ID).SetTag(\"md-dialog-prom";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dialog-prompt")));
 BA.debugLineNum = 16;BA.debugLine="bActive = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmprompt.__c.getField(true,"False"));
 BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 18;BA.debugLine="SetActiveSync(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprompt.class, "_setactivesync" /*RemoteObject*/ ,(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 21;BA.debugLine="Prompt.SetOnConfirm(module, $\"${ID}_ok\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonconfirm" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmprompt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_ok")))));
 BA.debugLineNum = 22;BA.debugLine="Prompt.SetOnCancel(module, $\"${ID}_cancel\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setoncancel" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmprompt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_cancel")))));
 BA.debugLineNum = 23;BA.debugLine="bStatic = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bstatic" /*RemoteObject*/ ,vmprompt.__c.getField(true,"False"));
 BA.debugLineNum = 24;BA.debugLine="SetVModel(\"promptvalue\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprompt.class, "_setvmodel" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("promptvalue")));
 BA.debugLineNum = 25;BA.debugLine="vue.SetStateSingle(\"promptvalue\",Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("promptvalue")),(Object)(vmprompt.__c.getField(false,"Null")));
 BA.debugLineNum = 26;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmprompt","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 153;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmprompt.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmprompt","render", __ref);}
 BA.debugLineNum = 149;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmprompt.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 151;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetActiveSync (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setactivesync")) { return __ref.runUserSub(false, "vmprompt","setactivesync", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 108;BA.debugLine="private Sub SetActiveSync(a As Object) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Prompt.SetActiveSync(a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setactivesync" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_a)));
 BA.debugLineNum = 110;BA.debugLine="bActive = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmprompt.__c.getField(true,"True"));
 BA.debugLineNum = 111;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmprompt","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 55;BA.debugLine="Sub SetAttr(attr As Map) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Prompt.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 57;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetCancelText (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setcanceltext")) { return __ref.runUserSub(false, "vmprompt","setcanceltext", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 98;BA.debugLine="Sub SetCancelText(c As String) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="If bStatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 100;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-cancel-text\": c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-cancel-text")),(_c)}))));
 BA.debugLineNum = 101;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 103;BA.debugLine="vue.SetState(CreateMap(\"promptcanceltext\":c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("promptcanceltext")),(_c)}))));
 BA.debugLineNum = 104;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-cancel-text\": \"prom";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-cancel-text")),(RemoteObject.createImmutable("promptcanceltext"))}))));
 BA.debugLineNum = 105;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetConfirmText (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setconfirmtext")) { return __ref.runUserSub(false, "vmprompt","setconfirmtext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 124;BA.debugLine="Sub SetConfirmText(t As String) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="If bStatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 126;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-confirm-text\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-confirm-text")),(_t)}))));
 BA.debugLineNum = 127;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 129;BA.debugLine="vue.SetState(CreateMap(\"promptconfirmtext\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("promptconfirmtext")),(_t)}))));
 BA.debugLineNum = 130;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-confirm-text\":\"prom";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-confirm-text")),(RemoteObject.createImmutable("promptconfirmtext"))}))));
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
public static RemoteObject  _setcontent(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetContent (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setcontent")) { return __ref.runUserSub(false, "vmprompt","setcontent", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 114;BA.debugLine="Sub SetContent(c As String) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="If bStatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 116;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-content\": c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-content")),(_c)}))));
 BA.debugLineNum = 117;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 119;BA.debugLine="vue.SetState(CreateMap(\"promptcontent\":c))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("promptcontent")),(_c)}))));
 BA.debugLineNum = 120;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-content\": \"promptco";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-content")),(RemoteObject.createImmutable("promptcontent"))}))));
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
public static RemoteObject  _setinputid(RemoteObject __ref,RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("SetInputID (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setinputid")) { return __ref.runUserSub(false, "vmprompt","setinputid", __ref, _n);}
Debug.locals.put("n", _n);
 BA.debugLineNum = 72;BA.debugLine="Sub SetInputID(n As Object) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-id\": n))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-input-id")),_n}))));
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
public static RemoteObject  _setinputname(RemoteObject __ref,RemoteObject _n) throws Exception{
try {
		Debug.PushSubsStack("SetInputName (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setinputname")) { return __ref.runUserSub(false, "vmprompt","setinputname", __ref, _n);}
Debug.locals.put("n", _n);
 BA.debugLineNum = 67;BA.debugLine="Sub SetInputName(n As Object) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-name\": n))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-input-name")),_n}))));
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
public static RemoteObject  _setmaxlength(RemoteObject __ref,RemoteObject _ml) throws Exception{
try {
		Debug.PushSubsStack("SetMaxLength (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setmaxlength")) { return __ref.runUserSub(false, "vmprompt","setmaxlength", __ref, _ml);}
Debug.locals.put("ml", _ml);
 BA.debugLineNum = 77;BA.debugLine="Sub SetMaxLength(ml As Int) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="If ml < 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("<",_ml,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 79;BA.debugLine="If bStatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 80;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-maxlength\": m";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-input-maxlength")),(_ml)}))));
 BA.debugLineNum = 81;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 83;BA.debugLine="vue.SetState(CreateMap(\"promptmaxlength\":ml))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("promptmaxlength")),(_ml)}))));
 BA.debugLineNum = 84;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-input-maxlength\": \"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-input-maxlength")),(RemoteObject.createImmutable("promptmaxlength"))}))));
 BA.debugLineNum = 85;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setplaceholder(RemoteObject __ref,RemoteObject _ph) throws Exception{
try {
		Debug.PushSubsStack("SetPlaceHolder (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setplaceholder")) { return __ref.runUserSub(false, "vmprompt","setplaceholder", __ref, _ph);}
Debug.locals.put("ph", _ph);
 BA.debugLineNum = 88;BA.debugLine="Sub SetPlaceHolder(ph As String) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="If bStatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 90;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-input-placeholder\":";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-input-placeholder")),(_ph)}))));
 BA.debugLineNum = 91;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 93;BA.debugLine="vue.SetState(CreateMap(\"promptplaceholder\":ph))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("promptplaceholder")),(_ph)}))));
 BA.debugLineNum = 94;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-input-placeholder\":";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-input-placeholder")),(RemoteObject.createImmutable("promptplaceholder"))}))));
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
public static RemoteObject  _setstatic(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStatic (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setstatic")) { return __ref.runUserSub(false, "vmprompt","setstatic", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 43;BA.debugLine="Sub SetStatic(b As Boolean) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="bStatic = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bstatic" /*RemoteObject*/ ,_b);
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
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmprompt","settitle", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 134;BA.debugLine="Sub SetTitle(t As String) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="If bStatic Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_bstatic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 136;BA.debugLine="Prompt.SetAttr(CreateMap(\"md-title\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-title")),(_t)}))));
 BA.debugLineNum = 137;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 };
 BA.debugLineNum = 139;BA.debugLine="vue.SetState(CreateMap(\"prompttitle\":t))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("prompttitle")),(_t)}))));
 BA.debugLineNum = 140;BA.debugLine="Prompt.SetAttr(CreateMap(\":md-title\":\"prompttitle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-title")),(RemoteObject.createImmutable("prompttitle"))}))));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmprompt","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 61;BA.debugLine="Sub SetVModel(k As String) As VMPrompt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="Prompt.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmprompt","show", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 37;BA.debugLine="Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmprompt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 39;BA.debugLine="opt.Put(ID, True)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmprompt.__c.getField(true,"True"))));
 BA.debugLineNum = 40;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 41;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmprompt) ","vmprompt",82,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmprompt","tostring", __ref);}
 BA.debugLineNum = 145;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Return Prompt.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_prompt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 147;BA.debugLine="End Sub";
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