package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfstack_subs_0 {


public static RemoteObject  _addlist(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddList (pdfstack) ","pdfstack",24,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("addlist")) { return __ref.runUserSub(false, "pdfstack","addlist", __ref, _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 17;BA.debugLine="Sub AddList(lst As PDFList) As PDFStack";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="contents.Add(lst.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_lst.runClassMethod (b4j.example.pdflist.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 19;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstring(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AddString (pdfstack) ","pdfstack",24,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("addstring")) { return __ref.runUserSub(false, "pdfstack","addstring", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 52;BA.debugLine="Sub AddString(txt As String) As PDFStack";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="contents.Add(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_txt)));
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
public static RemoteObject  _addtext(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AddText (pdfstack) ","pdfstack",24,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("addtext")) { return __ref.runUserSub(false, "pdfstack","addtext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 33;BA.debugLine="Sub AddText(txt As PDFText) As PDFStack";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="contents.Add(txt.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contents" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_txt.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 35;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private contentInt As Map";
pdfstack._contentint = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_contentint",pdfstack._contentint);
 //BA.debugLineNum = 4;BA.debugLine="Private contents As List";
pdfstack._contents = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_contents",pdfstack._contents);
 //BA.debugLineNum = 5;BA.debugLine="Public style As PDFStyle";
pdfstack._style = RemoteObject.createNew ("b4j.example.pdfstyle");__ref.setField("_style",pdfstack._style);
 //BA.debugLineNum = 6;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdfstack) ","pdfstack",24,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdfstack","getcontent", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="contentInt.Put(\"stack\", contents)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stack"))),(Object)((__ref.getField(false,"_contents" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 60;BA.debugLine="style.Include(contentInt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_include" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_contentint" /*RemoteObject*/ )));
 BA.debugLineNum = 61;BA.debugLine="Return contentInt";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_contentint" /*RemoteObject*/ );
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pdfstack) ","pdfstack",24,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfstack","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize As PDFStack";
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
		Debug.PushSubsStack("SetAbsolutePosition (pdfstack) ","pdfstack",24,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("setabsoluteposition")) { return __ref.runUserSub(false, "pdfstack","setabsoluteposition", __ref, _x, _y);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 23;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = pdfstack.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 25;BA.debugLine="opt.Put(\"x\", x)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 26;BA.debugLine="opt.Put(\"y\", y)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 27;BA.debugLine="contentInt.Put(\"absolutePosition\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("absolutePosition"))),(Object)((_opt.getObject())));
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
public static RemoteObject  _setpagebreakafter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPageBreakAfter (pdfstack) ","pdfstack",24,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setpagebreakafter")) { return __ref.runUserSub(false, "pdfstack","setpagebreakafter", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Sub SetPageBreakAfter As PDFStack";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="contentInt.Put(\"pageBreak\", \"after\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));
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
public static RemoteObject  _setpagebreakbefore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPageBreakBefore (pdfstack) ","pdfstack",24,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setpagebreakbefore")) { return __ref.runUserSub(false, "pdfstack","setpagebreakbefore", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Sub SetPageBreakBefore As PDFStack";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="contentInt.Put(\"pageBreak\", \"before\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));
 BA.debugLineNum = 42;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
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