package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfcolumns_subs_0 {


public static RemoteObject  _addcolumns(RemoteObject __ref,RemoteObject _colsx) throws Exception{
try {
		Debug.PushSubsStack("AddColumns (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("addcolumns")) { return __ref.runUserSub(false, "pdfcolumns","addcolumns", __ref, _colsx);}
Debug.locals.put("colsx", _colsx);
 BA.debugLineNum = 46;BA.debugLine="Sub AddColumns(colsx As PDFColumns) As PDFColumns";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="columnsInt.Add(colsx.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsint" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_colsx.runClassMethod (b4j.example.pdfcolumns.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _addlist(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddList (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("addlist")) { return __ref.runUserSub(false, "pdfcolumns","addlist", __ref, _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 28;BA.debugLine="Sub AddList(lst As PDFList) As PDFColumns";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="columnsInt.Add(lst.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsint" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_lst.runClassMethod (b4j.example.pdflist.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 30;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstack(RemoteObject __ref,RemoteObject _stack) throws Exception{
try {
		Debug.PushSubsStack("AddStack (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("addstack")) { return __ref.runUserSub(false, "pdfcolumns","addstack", __ref, _stack);}
Debug.locals.put("stack", _stack);
 BA.debugLineNum = 34;BA.debugLine="Sub AddStack(stack As PDFStack) As PDFColumns";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="columnsInt.Add(stack.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsint" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_stack.runClassMethod (b4j.example.pdfstack.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 36;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddString (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("addstring")) { return __ref.runUserSub(false, "pdfcolumns","addstring", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 52;BA.debugLine="Sub AddString(txt As String) As PDFColumns";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="columnsInt.Add(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsint" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_txt)));
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
public static RemoteObject  _addtext(RemoteObject __ref,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddText (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("addtext")) { return __ref.runUserSub(false, "pdfcolumns","addtext", __ref, _text);}
Debug.locals.put("text", _text);
 BA.debugLineNum = 40;BA.debugLine="Sub AddText(text As PDFText) As PDFColumns";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="columnsInt.Add(text.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsint" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_text.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private columnsInt As List";
pdfcolumns._columnsint = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_columnsint",pdfcolumns._columnsint);
 //BA.debugLineNum = 4;BA.debugLine="Public columnGap As Int";
pdfcolumns._columngap = RemoteObject.createImmutable(0);__ref.setField("_columngap",pdfcolumns._columngap);
 //BA.debugLineNum = 5;BA.debugLine="Private cols As Map";
pdfcolumns._cols = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cols",pdfcolumns._cols);
 //BA.debugLineNum = 6;BA.debugLine="Public style As PDFStyle";
pdfcolumns._style = RemoteObject.createNew ("b4j.example.pdfstyle");__ref.setField("_style",pdfcolumns._style);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdfcolumns","getcontent", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="If columnsInt.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_columnsint" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 72;BA.debugLine="cols.Put(\"columnGap\", columnGap)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cols" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("columnGap"))),(Object)((__ref.getField(true,"_columngap" /*RemoteObject*/ ))));
 BA.debugLineNum = 73;BA.debugLine="cols.Put(\"columns\", columnsInt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cols" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("columns"))),(Object)((__ref.getField(false,"_columnsint" /*RemoteObject*/ ).getObject())));
 };
 BA.debugLineNum = 75;BA.debugLine="style.Include(cols)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_include" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_cols" /*RemoteObject*/ )));
 BA.debugLineNum = 76;BA.debugLine="Return cols";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_cols" /*RemoteObject*/ );
 BA.debugLineNum = 77;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfcolumns","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize As PDFColumns";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="columnsInt.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsint" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 12;BA.debugLine="columnGap = 10";
Debug.JustUpdateDeviceLine();
__ref.setField ("_columngap" /*RemoteObject*/ ,BA.numberCast(int.class, 10));
 BA.debugLineNum = 13;BA.debugLine="cols.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cols" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 14;BA.debugLine="style.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 15;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 16;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAbsolutePosition (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("setabsoluteposition")) { return __ref.runUserSub(false, "pdfcolumns","setabsoluteposition", __ref, _x, _y);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 19;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = pdfcolumns.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 21;BA.debugLine="opt.Put(\"x\", x)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 22;BA.debugLine="opt.Put(\"y\", y)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 23;BA.debugLine="cols.Put(\"absolutePosition\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cols" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("absolutePosition"))),(Object)((_opt.getObject())));
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
public static RemoteObject  _setpagebreakafter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPageBreakAfter (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("setpagebreakafter")) { return __ref.runUserSub(false, "pdfcolumns","setpagebreakafter", __ref);}
 BA.debugLineNum = 64;BA.debugLine="Sub SetPageBreakAfter As PDFColumns";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="cols.Put(\"pageBreak\", \"after\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cols" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));
 BA.debugLineNum = 66;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageBreakBefore (pdfcolumns) ","pdfcolumns",15,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setpagebreakbefore")) { return __ref.runUserSub(false, "pdfcolumns","setpagebreakbefore", __ref);}
 BA.debugLineNum = 58;BA.debugLine="Sub SetPageBreakBefore As PDFColumns";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="cols.Put(\"pageBreak\", \"before\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cols" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));
 BA.debugLineNum = 60;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
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