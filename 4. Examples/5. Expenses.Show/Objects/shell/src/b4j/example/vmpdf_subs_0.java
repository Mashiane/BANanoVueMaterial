package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmpdf_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public PDF As VMElement";
vmpdf._pdf = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_pdf",vmpdf._pdf);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmpdf._id = RemoteObject.createImmutable("");__ref.setField("_id",vmpdf._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmpdf._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmpdf._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private docKey As String";
vmpdf._dockey = RemoteObject.createImmutable("");__ref.setField("_dockey",vmpdf._dockey);
 //BA.debugLineNum = 7;BA.debugLine="Private docVisible As String";
vmpdf._docvisible = RemoteObject.createImmutable("");__ref.setField("_docvisible",vmpdf._docvisible);
 //BA.debugLineNum = 8;BA.debugLine="Private options As Map";
vmpdf._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",vmpdf._options);
 //BA.debugLineNum = 9;BA.debugLine="Private BANano As BANano 'ignore";
vmpdf._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmpdf._banano);
 //BA.debugLineNum = 10;BA.debugLine="Private JQ As BANanoObject";
vmpdf._jq = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_jq",vmpdf._jq);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmpdf","initialize", __ref, _ba, _v, _sid, _url);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("URL", _url);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 16;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 17;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 18;BA.debugLine="JQ = vue.jquery";
Debug.JustUpdateDeviceLine();
__ref.setField ("_jq" /*RemoteObject*/ ,__ref.getField(false,"_vue" /*RemoteObject*/ ).getField(false,"_jquery" /*RemoteObject*/ ));
 BA.debugLineNum = 19;BA.debugLine="PDF.Initialize(vue, sid)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid));
 BA.debugLineNum = 20;BA.debugLine="PDF.SetTag(\"iframe\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("iframe")));
 BA.debugLineNum = 21;BA.debugLine="PDF.SetAttr(CreateMap(\"type\":\"application/pdf\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmpdf.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),(RemoteObject.createImmutable("application/pdf"))}))));
 BA.debugLineNum = 22;BA.debugLine="PDF.SetAttr(CreateMap(\"frameborder\":\"0\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmpdf.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("frameborder")),(RemoteObject.createImmutable("0"))}))));
 BA.debugLineNum = 23;BA.debugLine="PDF.SetAttr(CreateMap(\"scrolling\":\"no\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmpdf.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("scrolling")),(RemoteObject.createImmutable("no"))}))));
 BA.debugLineNum = 24;BA.debugLine="PDF.SetAttr(CreateMap(\"allowfullscreen\":True))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmpdf.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("allowfullscreen")),(vmpdf.__c.getField(true,"True"))}))));
 BA.debugLineNum = 25;BA.debugLine="SetURL(URL)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmpdf.class, "_seturl" /*RemoteObject*/ ,(Object)(_url));
 BA.debugLineNum = 26;BA.debugLine="docVisible = $\"${ID}visible\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_docvisible" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmpdf.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("visible"))));
 BA.debugLineNum = 27;BA.debugLine="SetVIf(docVisible)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmpdf.class, "_setvif" /*RemoteObject*/ ,(Object)((__ref.getField(true,"_docvisible" /*RemoteObject*/ ))));
 BA.debugLineNum = 28;BA.debugLine="SetVisible(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmpdf.class, "_setvisible" /*RemoteObject*/ ,(Object)(vmpdf.__c.getField(true,"True")));
 BA.debugLineNum = 29;BA.debugLine="SetWidth(\"100%\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmpdf.class, "_setwidth" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("100%")));
 BA.debugLineNum = 30;BA.debugLine="SetHeight(\"80vh\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmpdf.class, "_setheight" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("80vh")));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmpdf","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 87;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmpdf.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 89;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmpdf","render", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmpdf.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmpdf","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 47;BA.debugLine="Sub SetElevation(e As Int) As VMPDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="PDF.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 49;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vmpdf","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 41;BA.debugLine="Sub SetHeight(h As String) As VMPDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="PDF.SetStyle(CreateMap(\"height\":h & \" !important\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmpdf.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),(RemoteObject.concat(_h,RemoteObject.createImmutable(" !important")))}))));
 BA.debugLineNum = 43;BA.debugLine="options.Put(\"height\", h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)((_h)));
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
public static RemoteObject  _seturl(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SetURL (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("seturl")) { return __ref.runUserSub(false, "vmpdf","seturl", __ref, _url);}
Debug.locals.put("url", _url);
 BA.debugLineNum = 66;BA.debugLine="Sub SetURL(url As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="docKey = $\"${ID}doc\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dockey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmpdf.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("doc"))));
 BA.debugLineNum = 68;BA.debugLine="vue.SetStateSingle(docKey, url)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_dockey" /*RemoteObject*/ )),(Object)((_url)));
 BA.debugLineNum = 69;BA.debugLine="PDF.SetAttr(CreateMap(\":src\":docKey))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmpdf.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":src")),(__ref.getField(true,"_dockey" /*RemoteObject*/ ))}))));
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
public static RemoteObject  _seturl1(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SetURL1 (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("seturl1")) { return __ref.runUserSub(false, "vmpdf","seturl1", __ref, _url);}
RemoteObject _ikey = RemoteObject.createImmutable("");
Debug.locals.put("url", _url);
 BA.debugLineNum = 73;BA.debugLine="Sub SetURL1(url As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="Dim iKey As String = $\"#${ID}\"$";
Debug.JustUpdateDeviceLine();
_ikey = (RemoteObject.concat(RemoteObject.createImmutable("#"),vmpdf.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("iKey", _ikey);Debug.locals.put("iKey", _ikey);
 BA.debugLineNum = 75;BA.debugLine="BANano.GetElement(iKey).SetAttr(\"href\", url).AddC";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(_ikey)).runMethod(false,"SetAttr",(Object)(BA.ObjectToString("href")),(Object)(_url)).runVoidMethod ("AddClass",(Object)(RemoteObject.createImmutable("media")));
 BA.debugLineNum = 76;BA.debugLine="JQ.Selector(iKey).RunMethod(\"media\", options)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jq" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)((_ikey))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("media")),(Object)((__ref.getField(false,"_options" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmpdf","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 56;BA.debugLine="Sub SetVIf(vif As Object) As VMPDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="PDF.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetVisible (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "vmpdf","setvisible", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 52;BA.debugLine="Sub SetVisible(b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="vue.SetStateSingle(docVisible, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_docvisible" /*RemoteObject*/ )),(Object)((_b)));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmpdf","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 61;BA.debugLine="Sub SetVShow(vif As Object) As VMPDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="PDF.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmpdf","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 34;BA.debugLine="Sub SetWidth(w As String) As VMPDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="PDF.SetStyle(CreateMap(\"width\":w & \" !important\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmpdf.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),(RemoteObject.concat(_w,RemoteObject.createImmutable(" !important")))}))));
 BA.debugLineNum = 36;BA.debugLine="options.Put(\"width\", w)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((_w)));
 BA.debugLineNum = 37;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmpdf) ","vmpdf",78,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmpdf","tostring", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="Return PDF.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_pdf" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}