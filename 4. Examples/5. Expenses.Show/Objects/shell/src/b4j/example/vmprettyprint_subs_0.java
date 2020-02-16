package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmprettyprint_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmprettyprint","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 80;BA.debugLine="Sub AddClass(c As String) As VMPrettyPrint";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="PP.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 82;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public PP As VMElement";
vmprettyprint._pp = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_pp",vmprettyprint._pp);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmprettyprint._id = RemoteObject.createImmutable("");__ref.setField("_id",vmprettyprint._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmprettyprint._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmprettyprint._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmprettyprint._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmprettyprint._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private codeName As String";
vmprettyprint._codename = RemoteObject.createImmutable("");__ref.setField("_codename",vmprettyprint._codename);
 //BA.debugLineNum = 8;BA.debugLine="Private codevisible As String";
vmprettyprint._codevisible = RemoteObject.createImmutable("");__ref.setField("_codevisible",vmprettyprint._codevisible);
 //BA.debugLineNum = 9;BA.debugLine="Private CodeEL As VMElement";
vmprettyprint._codeel = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_codeel",vmprettyprint._codeel);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _lang) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmprettyprint","initialize", __ref, _ba, _v, _sid, _lang);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("lang", _lang);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 15;BA.debugLine="PP.Initialize(v, ID).SetTag(\"pre\").AddClass(\"pret";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pre"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("prettyprint"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("linenums")));
 BA.debugLineNum = 16;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 17;BA.debugLine="PP.SetStyle(CreateMap(\"width\":\"100% !important\",";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmprettyprint.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),RemoteObject.createImmutable(("100% !important")),RemoteObject.createImmutable(("height")),(RemoteObject.createImmutable("80vh !important"))}))));
 BA.debugLineNum = 19;BA.debugLine="codeName = $\"${ID}code\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_codename" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmprettyprint.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("code"))));
 BA.debugLineNum = 20;BA.debugLine="CodeEL.Initialize(v, codeName).SetTag(\"code\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_codeel" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_codename" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("code")));
 BA.debugLineNum = 21;BA.debugLine="CodeEL.SetText($\"{{ ${codeName} }}\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_codeel" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmprettyprint.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_codename" /*RemoteObject*/ )))),RemoteObject.createImmutable(" }}")))));
 BA.debugLineNum = 22;BA.debugLine="CodeEL.AddClass(\"col s12\").AddClass(\"prettyprint\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_codeel" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("col s12"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("prettyprint")));
 BA.debugLineNum = 23;BA.debugLine="CodeEL.AddClass($\"language-${lang}\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_codeel" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("language-"),vmprettyprint.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lang))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 25;BA.debugLine="codevisible = $\"${ID}visible\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_codevisible" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmprettyprint.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("visible"))));
 BA.debugLineNum = 26;BA.debugLine="SetVIf(codevisible)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprettyprint.class, "_setvif" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_codevisible" /*RemoteObject*/ )));
 BA.debugLineNum = 27;BA.debugLine="SetVisible(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprettyprint.class, "_setvisible" /*RemoteObject*/ ,(Object)(vmprettyprint.__c.getField(true,"True")));
 BA.debugLineNum = 28;BA.debugLine="SetText(\"\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprettyprint.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
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
		Debug.PushSubsStack("Pop (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmprettyprint","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 75;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmprettyprint.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Refresh (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "vmprettyprint","refresh", __ref);}
RemoteObject _pr = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 57;BA.debugLine="Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Dim PR As BANanoObject";
Debug.JustUpdateDeviceLine();
_pr = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("PR", _pr);
 BA.debugLineNum = 59;BA.debugLine="PR.Initialize(\"PR\")";
Debug.JustUpdateDeviceLine();
_pr.runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("PR"))));
 BA.debugLineNum = 60;BA.debugLine="PR.RunMethod(\"prettyPrint\", Null)";
Debug.JustUpdateDeviceLine();
_pr.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("prettyPrint")),(Object)(vmprettyprint.__c.getField(false,"Null")));
 BA.debugLineNum = 61;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmprettyprint","render", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmprettyprint.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmprettyprint","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 86;BA.debugLine="Sub SetAttr(attr As Map) As VMPrettyPrint";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="PP.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmprettyprint","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 32;BA.debugLine="Sub SetElevation(e As Int) As VMPrettyPrint";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="PP.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmprettyprint","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 98;BA.debugLine="Sub SetPadding(p As Object) As VMPrettyPrint";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="PP.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmprettyprint","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 92;BA.debugLine="Sub SetStyle(sm As Map) As VMPrettyPrint";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="PP.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmprettyprint","settext", __ref, _stext);}
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 52;BA.debugLine="Sub SetText(sText As String) As VMPrettyPrint";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="vue.SetStateSingle(codeName, sText)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_codename" /*RemoteObject*/ )),(Object)((_stext)));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmprettyprint","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 41;BA.debugLine="Sub SetVIf(vif As String) As VMPrettyPrint";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="PP.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetVisible (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "vmprettyprint","setvisible", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 37;BA.debugLine="Sub SetVisible(b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="vue.SetStateSingle(codevisible, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_codevisible" /*RemoteObject*/ )),(Object)((_b)));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmprettyprint","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 46;BA.debugLine="Sub SetVShow(vif As String) As VMPrettyPrint";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="PP.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmprettyprint) ","vmprettyprint",79,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmprettyprint","tostring", __ref);}
 BA.debugLineNum = 64;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="PP.AddElement(CodeEL)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addelement" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_codeel" /*RemoteObject*/ )));
 BA.debugLineNum = 66;BA.debugLine="Return PP.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_pp" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="End Sub";
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