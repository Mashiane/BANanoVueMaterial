package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfparagraphs_subs_0 {


public static RemoteObject  _addstring(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AddString (pdfparagraphs) ","pdfparagraphs",20,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("addstring")) { return __ref.runUserSub(false, "pdfparagraphs","addstring", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 32;BA.debugLine="Sub AddString(txt As String) As PDFParagraphs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="contents.Add(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_txt)));
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
public static RemoteObject  _addtext(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AddText (pdfparagraphs) ","pdfparagraphs",20,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("addtext")) { return __ref.runUserSub(false, "pdfparagraphs","addtext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 26;BA.debugLine="Sub AddText(txt As PDFText) As PDFParagraphs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="contents.Add(txt.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_txt.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private contentInt As Map";
pdfparagraphs._contentint = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_contentint",pdfparagraphs._contentint);
 //BA.debugLineNum = 4;BA.debugLine="Private contents As List";
pdfparagraphs._contents = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_contents",pdfparagraphs._contents);
 //BA.debugLineNum = 5;BA.debugLine="Public style As PDFStyle";
pdfparagraphs._style = RemoteObject.createNew ("b4j.example.pdfstyle");__ref.setField("_style",pdfparagraphs._style);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdfparagraphs) ","pdfparagraphs",20,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdfparagraphs","getcontent", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="contentInt.Put(\"text\", contents)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("text"))),(Object)((__ref.getField(false,"_contents" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 53;BA.debugLine="style.Include(contentInt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_include" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_contentint" /*RemoteObject*/ )));
 BA.debugLineNum = 54;BA.debugLine="Return contentInt";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_contentint" /*RemoteObject*/ );
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pdfparagraphs) ","pdfparagraphs",20,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfparagraphs","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize As PDFParagraphs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 10;BA.debugLine="contentInt.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 11;BA.debugLine="contents.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 12;BA.debugLine="style.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 13;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 14;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setabsoluteposition(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetAbsolutePosition (pdfparagraphs) ","pdfparagraphs",20,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("setabsoluteposition")) { return __ref.runUserSub(false, "pdfparagraphs","setabsoluteposition", __ref, _x, _y);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 17;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = pdfparagraphs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 19;BA.debugLine="opt.Put(\"x\", x)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 20;BA.debugLine="opt.Put(\"y\", y)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 21;BA.debugLine="contentInt.Put(\"absolutePosition\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("absolutePosition"))),(Object)((_opt.getObject())));
 BA.debugLineNum = 22;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpagebreakafter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPageBreakAfter (pdfparagraphs) ","pdfparagraphs",20,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setpagebreakafter")) { return __ref.runUserSub(false, "pdfparagraphs","setpagebreakafter", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Sub SetPageBreakAfter As PDFParagraphs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="contentInt.Put(\"pageBreak\", \"after\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));
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
public static RemoteObject  _setpagebreakbefore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPageBreakBefore (pdfparagraphs) ","pdfparagraphs",20,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("setpagebreakbefore")) { return __ref.runUserSub(false, "pdfparagraphs","setpagebreakbefore", __ref);}
 BA.debugLineNum = 39;BA.debugLine="Sub SetPageBreakBefore As PDFParagraphs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="contentInt.Put(\"pageBreak\", \"before\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));
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
}