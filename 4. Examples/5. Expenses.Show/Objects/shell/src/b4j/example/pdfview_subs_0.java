package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfview_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Private JQ As BANanoObject";
pdfview._jq = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_jq",pdfview._jq);
 //BA.debugLineNum = 5;BA.debugLine="Private options As Map";
pdfview._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",pdfview._options);
 //BA.debugLineNum = 6;BA.debugLine="Private href As String";
pdfview._href = RemoteObject.createImmutable("");__ref.setField("_href",pdfview._href);
 //BA.debugLineNum = 7;BA.debugLine="Private id As String";
pdfview._id = RemoteObject.createImmutable("");__ref.setField("_id",pdfview._id);
 //BA.debugLineNum = 8;BA.debugLine="Private BANano As BANano  'ignore";
pdfview._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",pdfview._banano);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _elementid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pdfview) ","pdfview",29,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfview","initialize", __ref, _ba, _elementid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("elementID", _elementid);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(elementID As String) As PDFV";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="JQ.Initialize(\"$\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jq" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("$"))));
 BA.debugLineNum = 15;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 16;BA.debugLine="href = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_href" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 17;BA.debugLine="id = elementID.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_elementid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 18;BA.debugLine="SetWidth(\"100%\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfview.class, "_setwidth" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("100%")));
 BA.debugLineNum = 19;BA.debugLine="SetHeight(\"80vh\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfview.class, "_setheight" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("80vh")));
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
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (pdfview) ","pdfview",29,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "pdfview","refresh", __ref);}
RemoteObject _ikey = RemoteObject.createImmutable("");
 BA.debugLineNum = 43;BA.debugLine="Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Dim iKey As String = $\"#${id}\"$";
Debug.JustUpdateDeviceLine();
_ikey = (RemoteObject.concat(RemoteObject.createImmutable("#"),pdfview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("iKey", _ikey);Debug.locals.put("iKey", _ikey);
 BA.debugLineNum = 45;BA.debugLine="BANano.GetElement(iKey).SetAttr(\"href\", href).Add";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(_ikey)).runMethod(false,"SetAttr",(Object)(BA.ObjectToString("href")),(Object)(__ref.getField(true,"_href" /*RemoteObject*/ ))).runVoidMethod ("AddClass",(Object)(RemoteObject.createImmutable("media")));
 BA.debugLineNum = 46;BA.debugLine="JQ.Selector(iKey).RunMethod(\"media\", options)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_jq" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)((_ikey))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("media")),(Object)((__ref.getField(false,"_options" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (pdfview) ","pdfview",29,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "pdfview","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 31;BA.debugLine="Sub SetHeight(h As String) As PDFView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="options.Put(\"height\", h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)((_h)));
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
public static RemoteObject  _sethref(RemoteObject __ref,RemoteObject _shref) throws Exception{
try {
		Debug.PushSubsStack("SetHREF (pdfview) ","pdfview",29,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("sethref")) { return __ref.runUserSub(false, "pdfview","sethref", __ref, _shref);}
Debug.locals.put("shref", _shref);
 BA.debugLineNum = 37;BA.debugLine="Sub SetHREF(shref As String) As PDFView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="href = shref";
Debug.JustUpdateDeviceLine();
__ref.setField ("_href" /*RemoteObject*/ ,_shref);
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
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (pdfview) ","pdfview",29,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "pdfview","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 25;BA.debugLine="Sub SetWidth(w As String) As PDFView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="options.Put(\"width\", w)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((_w)));
 BA.debugLineNum = 27;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}