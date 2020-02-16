package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfrow_subs_0 {


public static RemoteObject  _addempty(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddEmpty (pdfrow) ","pdfrow",22,__ref.getField(false, "ba"),__ref,19);
if (RapidSub.canDelegate("addempty")) { return __ref.runUserSub(false, "pdfrow","addempty", __ref);}
 BA.debugLineNum = 19;BA.debugLine="Sub AddEmpty As PDFRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 20;BA.debugLine="row.Add(CreateMap())";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((pdfrow.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})).getObject())));
 BA.debugLineNum = 21;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addimage(RemoteObject __ref,RemoteObject _img) throws Exception{
try {
		Debug.PushSubsStack("AddImage (pdfrow) ","pdfrow",22,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("addimage")) { return __ref.runUserSub(false, "pdfrow","addimage", __ref, _img);}
Debug.locals.put("img", _img);
 BA.debugLineNum = 13;BA.debugLine="Sub AddImage(img As PDFImage) As PDFRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="row.Add(img.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_img.runClassMethod (b4j.example.pdfimage.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _addlist(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddList (pdfrow) ","pdfrow",22,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("addlist")) { return __ref.runUserSub(false, "pdfrow","addlist", __ref, _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 25;BA.debugLine="Sub AddList(lst As PDFList) As PDFRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="row.Add(lst.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_lst.runClassMethod (b4j.example.pdflist.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _addstring(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AddString (pdfrow) ","pdfrow",22,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("addstring")) { return __ref.runUserSub(false, "pdfrow","addstring", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 43;BA.debugLine="Sub AddString(txt As String) As PDFRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="row.Add(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_txt)));
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
public static RemoteObject  _addtable(RemoteObject __ref,RemoteObject _tbl) throws Exception{
try {
		Debug.PushSubsStack("AddTable (pdfrow) ","pdfrow",22,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("addtable")) { return __ref.runUserSub(false, "pdfrow","addtable", __ref, _tbl);}
Debug.locals.put("tbl", _tbl);
 BA.debugLineNum = 37;BA.debugLine="Sub AddTable(tbl As PDFTable) As PDFRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="row.Add(tbl.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_tbl.runClassMethod (b4j.example.pdftable.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _addtext(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AddText (pdfrow) ","pdfrow",22,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("addtext")) { return __ref.runUserSub(false, "pdfrow","addtext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 31;BA.debugLine="Sub AddText(txt As PDFText) As PDFRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="row.Add(txt.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_txt.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private row As List";
pdfrow._row = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_row",pdfrow._row);
 //BA.debugLineNum = 4;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdfrow) ","pdfrow",22,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdfrow","getcontent", __ref);}
 BA.debugLineNum = 49;BA.debugLine="Sub getContent As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="Return row";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_row" /*RemoteObject*/ );
 BA.debugLineNum = 51;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (pdfrow) ","pdfrow",22,__ref.getField(false, "ba"),__ref,7);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfrow","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 7;BA.debugLine="Public Sub Initialize As PDFRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 8;BA.debugLine="row.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_row" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 9;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 10;BA.debugLine="End Sub";
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