package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmenlighter_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmenlighter","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 89;BA.debugLine="Sub AddClass(c As String) As VMEnlighter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="Enlighter.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 91;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Enlighter As VMElement";
vmenlighter._enlighter = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_enlighter",vmenlighter._enlighter);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmenlighter._id = RemoteObject.createImmutable("");__ref.setField("_id",vmenlighter._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmenlighter._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmenlighter._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmenlighter._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmenlighter._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private codeName As String";
vmenlighter._codename = RemoteObject.createImmutable("");__ref.setField("_codename",vmenlighter._codename);
 //BA.debugLineNum = 8;BA.debugLine="Private codevisible As String";
vmenlighter._codevisible = RemoteObject.createImmutable("");__ref.setField("_codevisible",vmenlighter._codevisible);
 //BA.debugLineNum = 9;BA.debugLine="Private options As Map";
vmenlighter._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",vmenlighter._options);
 //BA.debugLineNum = 10;BA.debugLine="Private CodeEL As VMElement";
vmenlighter._codeel = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_codeel",vmenlighter._codeel);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _lang) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmenlighter","initialize", __ref, _ba, _v, _sid, _lang);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("lang", _lang);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 16;BA.debugLine="Enlighter.Initialize(v, ID).SetTag(\"pre\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pre")));
 BA.debugLineNum = 17;BA.debugLine="Enlighter.SetAttr(CreateMap(\"data-enlighter-langu";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmenlighter.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-enlighter-language")),(_lang)}))));
 BA.debugLineNum = 18;BA.debugLine="Enlighter.SetAttr(CreateMap(\"data-enlighter-linen";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmenlighter.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-enlighter-linenumbers")),(RemoteObject.createImmutable("true"))}))));
 BA.debugLineNum = 19;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 20;BA.debugLine="Enlighter.SetStyle(CreateMap(\"width\":\"100% !impor";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmenlighter.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),RemoteObject.createImmutable(("100% !important")),RemoteObject.createImmutable(("height")),(RemoteObject.createImmutable("80vh !important"))}))));
 BA.debugLineNum = 22;BA.debugLine="codeName = $\"${ID}code\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_codename" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmenlighter.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("code"))));
 BA.debugLineNum = 23;BA.debugLine="CodeEL.Initialize(v, codeName).SetTag(\"code\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_codeel" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_codename" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("code")));
 BA.debugLineNum = 24;BA.debugLine="CodeEL.SetText($\"{{ ${codeName} }}\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_codeel" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmenlighter.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_codename" /*RemoteObject*/ )))),RemoteObject.createImmutable(" }}")))));
 BA.debugLineNum = 25;BA.debugLine="CodeEL.AddClass(\"col s12\").AddClass(\"special\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_codeel" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("col s12"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("special")));
 BA.debugLineNum = 26;BA.debugLine="CodeEL.SetAttr(CreateMap(\"data-enlighter-language";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_codeel" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmenlighter.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-enlighter-language")),(_lang)}))));
 BA.debugLineNum = 27;BA.debugLine="CodeEL.SetAttr(CreateMap(\"data-enlighter-linenumb";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_codeel" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmenlighter.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-enlighter-linenumbers")),(RemoteObject.createImmutable("true"))}))));
 BA.debugLineNum = 30;BA.debugLine="SetText(\"\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmenlighter.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 31;BA.debugLine="codevisible = $\"${ID}visible\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_codevisible" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmenlighter.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("visible"))));
 BA.debugLineNum = 32;BA.debugLine="SetVIf(codevisible)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmenlighter.class, "_setvif" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_codevisible" /*RemoteObject*/ )));
 BA.debugLineNum = 33;BA.debugLine="SetVisible(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmenlighter.class, "_setvisible" /*RemoteObject*/ ,(Object)(vmenlighter.__c.getField(true,"True")));
 BA.debugLineNum = 34;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="options.Put(\"language\", lang)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("language"))),(Object)((_lang)));
 BA.debugLineNum = 36;BA.debugLine="options.Put(\"indent\", 4)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("indent"))),(Object)(RemoteObject.createImmutable((4))));
 BA.debugLineNum = 37;BA.debugLine="options.Put(\"showLinenumbers\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("showLinenumbers"))),(Object)((vmenlighter.__c.getField(true,"True"))));
 BA.debugLineNum = 38;BA.debugLine="options.Put(\"renderer\", \"Inline\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("renderer"))),(Object)((RemoteObject.createImmutable("Inline"))));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmenlighter","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 84;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmenlighter.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "vmenlighter","refresh", __ref);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 67;BA.debugLine="Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="Dim bo As BANanoObject = BANano.Window.GetField(\"";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"Window").runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("document"))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("id")),(Object)((__ref.getField(true,"_codename" /*RemoteObject*/ ))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 69;BA.debugLine="bo.RunMethod(\"enlight\", options)";
Debug.JustUpdateDeviceLine();
_bo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("enlight")),(Object)((__ref.getField(false,"_options" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmenlighter","render", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmenlighter.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmenlighter","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 95;BA.debugLine="Sub SetAttr(attr As Map) As VMEnlighter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Enlighter.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 97;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmenlighter","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 42;BA.debugLine="Sub SetElevation(e As Int) As VMEnlighter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="Enlighter.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 44;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmenlighter","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 107;BA.debugLine="Sub SetPadding(p As Object) As VMEnlighter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="Enlighter.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 109;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmenlighter","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 101;BA.debugLine="Sub SetStyle(sm As Map) As VMEnlighter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="Enlighter.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmenlighter","settext", __ref, _stext);}
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 62;BA.debugLine="Sub SetText(sText As String) As VMEnlighter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="vue.SetStateSingle(codeName, sText)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_codename" /*RemoteObject*/ )),(Object)((_stext)));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmenlighter","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 51;BA.debugLine="Sub SetVIf(vif As String) As VMEnlighter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="Enlighter.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetVisible (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "vmenlighter","setvisible", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 47;BA.debugLine="Sub SetVisible(b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="vue.SetStateSingle(codevisible, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_codevisible" /*RemoteObject*/ )),(Object)((_b)));
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmenlighter","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 56;BA.debugLine="Sub SetVShow(vif As String) As VMEnlighter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="Enlighter.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 58;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmenlighter) ","vmenlighter",55,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmenlighter","tostring", __ref);}
 BA.debugLineNum = 73;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="Enlighter.AddElement(CodeEL)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addelement" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_codeel" /*RemoteObject*/ )));
 BA.debugLineNum = 75;BA.debugLine="Return Enlighter.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_enlighter" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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