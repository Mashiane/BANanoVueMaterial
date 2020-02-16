package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdftoc_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private options As Map";
pdftoc._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",pdftoc._options);
 //BA.debugLineNum = 4;BA.debugLine="Private toc As Map";
pdftoc._toc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_toc",pdftoc._toc);
 //BA.debugLineNum = 5;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdftoc) ","pdftoc",28,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdftoc","getcontent", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="toc.Put(\"toc\", options)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toc" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("toc"))),(Object)((__ref.getField(false,"_options" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 29;BA.debugLine="Return toc";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_toc" /*RemoteObject*/ );
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pdftoc) ","pdftoc",28,__ref.getField(false, "ba"),__ref,8);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdftoc","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 8;BA.debugLine="Public Sub Initialize As PDFToC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 9;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 10;BA.debugLine="toc.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toc" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 11;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 12;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumberstyle(RemoteObject __ref,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("SetNumberStyle (pdftoc) ","pdftoc",28,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("setnumberstyle")) { return __ref.runUserSub(false, "pdftoc","setnumberstyle", __ref, _style);}
Debug.locals.put("style", _style);
 BA.debugLineNum = 21;BA.debugLine="Sub SetNumberStyle(style As PDFStyle) As PDFToC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="options.Put(\"numberStyle\", style.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("numberStyle"))),(Object)((_style.runClassMethod (b4j.example.pdfstyle.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (pdftoc) ","pdftoc",28,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "pdftoc","settitle", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 15;BA.debugLine="Sub SetTitle(text As PDFText) As PDFToC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 16;BA.debugLine="options.Put(\"title\", text.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((_text.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 17;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 18;BA.debugLine="End Sub";
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