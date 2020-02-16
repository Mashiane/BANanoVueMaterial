package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdftext_subs_0 {


public static RemoteObject  _append(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("Append (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("append")) { return __ref.runUserSub(false, "pdftext","append", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 277;BA.debugLine="Sub Append(txt As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 278;BA.debugLine="textInt.Append(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textint" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_txt));
 BA.debugLineNum = 279;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 280;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _appendline(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AppendLine (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("appendline")) { return __ref.runUserSub(false, "pdftext","appendline", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 283;BA.debugLine="Sub AppendLine(txt As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="textInt.Append(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textint" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(_txt));
 BA.debugLineNum = 285;BA.debugLine="textInt.Append(CRLF)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textint" /*RemoteObject*/ ).runVoidMethod ("Append",(Object)(pdftext.__c.getField(true,"CRLF")));
 BA.debugLineNum = 286;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 287;BA.debugLine="End Sub";
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
pdftext._contentint = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_contentint",pdftext._contentint);
 //BA.debugLineNum = 4;BA.debugLine="Private textInt As StringBuilder";
pdftext._textint = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");__ref.setField("_textint",pdftext._textint);
 //BA.debugLineNum = 5;BA.debugLine="Public link As String";
pdftext._link = RemoteObject.createImmutable("");__ref.setField("_link",pdftext._link);
 //BA.debugLineNum = 6;BA.debugLine="Public linkToPage As Int";
pdftext._linktopage = RemoteObject.createImmutable(0);__ref.setField("_linktopage",pdftext._linktopage);
 //BA.debugLineNum = 7;BA.debugLine="Public tocItem As Boolean";
pdftext._tocitem = RemoteObject.createImmutable(false);__ref.setField("_tocitem",pdftext._tocitem);
 //BA.debugLineNum = 8;BA.debugLine="Public pageOrientation As String";
pdftext._pageorientation = RemoteObject.createImmutable("");__ref.setField("_pageorientation",pdftext._pageorientation);
 //BA.debugLineNum = 9;BA.debugLine="Public pageBreakBefore As Boolean";
pdftext._pagebreakbefore = RemoteObject.createImmutable(false);__ref.setField("_pagebreakbefore",pdftext._pagebreakbefore);
 //BA.debugLineNum = 10;BA.debugLine="Public pageBreakAfter As Boolean";
pdftext._pagebreakafter = RemoteObject.createImmutable(false);__ref.setField("_pagebreakafter",pdftext._pagebreakafter);
 //BA.debugLineNum = 11;BA.debugLine="Public style As PDFStyle";
pdftext._style = RemoteObject.createNew ("b4j.example.pdfstyle");__ref.setField("_style",pdftext._style);
 //BA.debugLineNum = 12;BA.debugLine="Public colSpan As Int";
pdftext._colspan = RemoteObject.createImmutable(0);__ref.setField("_colspan",pdftext._colspan);
 //BA.debugLineNum = 13;BA.debugLine="Public rowSpan As Int";
pdftext._rowspan = RemoteObject.createImmutable(0);__ref.setField("_rowspan",pdftext._rowspan);
 //BA.debugLineNum = 14;BA.debugLine="Public linkToDestination As String";
pdftext._linktodestination = RemoteObject.createImmutable("");__ref.setField("_linktodestination",pdftext._linktodestination);
 //BA.debugLineNum = 15;BA.debugLine="Public id As String";
pdftext._id = RemoteObject.createImmutable("");__ref.setField("_id",pdftext._id);
 //BA.debugLineNum = 16;BA.debugLine="Public listType As String";
pdftext._listtype = RemoteObject.createImmutable("");__ref.setField("_listtype",pdftext._listtype);
 //BA.debugLineNum = 17;BA.debugLine="Public pageReference As String";
pdftext._pagereference = RemoteObject.createImmutable("");__ref.setField("_pagereference",pdftext._pagereference);
 //BA.debugLineNum = 18;BA.debugLine="Public textReference As String";
pdftext._textreference = RemoteObject.createImmutable("");__ref.setField("_textreference",pdftext._textreference);
 //BA.debugLineNum = 19;BA.debugLine="Public preserveLeadingSpaces As Boolean";
pdftext._preserveleadingspaces = RemoteObject.createImmutable(false);__ref.setField("_preserveleadingspaces",pdftext._preserveleadingspaces);
 //BA.debugLineNum = 20;BA.debugLine="Private BANano As BANano  'ignore";
pdftext._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",pdftext._banano);
 //BA.debugLineNum = 21;BA.debugLine="Public tabindex As String";
pdftext._tabindex = RemoteObject.createImmutable("");__ref.setField("_tabindex",pdftext._tabindex);
 //BA.debugLineNum = 22;BA.debugLine="Public decoration As String";
pdftext._decoration = RemoteObject.createImmutable("");__ref.setField("_decoration",pdftext._decoration);
 //BA.debugLineNum = 23;BA.debugLine="Public decorationStyle As String";
pdftext._decorationstyle = RemoteObject.createImmutable("");__ref.setField("_decorationstyle",pdftext._decorationstyle);
 //BA.debugLineNum = 24;BA.debugLine="Public decorationColor As String";
pdftext._decorationcolor = RemoteObject.createImmutable("");__ref.setField("_decorationcolor",pdftext._decorationcolor);
 //BA.debugLineNum = 25;BA.debugLine="Public counter As Int";
pdftext._counter = RemoteObject.createImmutable(0);__ref.setField("_counter",pdftext._counter);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdftext","getcontent", __ref);}
RemoteObject _outcome = RemoteObject.createImmutable("");
 BA.debugLineNum = 302;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 303;BA.debugLine="Dim outcome As String = textInt.tostring";
Debug.JustUpdateDeviceLine();
_outcome = __ref.getField(false,"_textint" /*RemoteObject*/ ).runMethod(true,"ToString");Debug.locals.put("outcome", _outcome);Debug.locals.put("outcome", _outcome);
 BA.debugLineNum = 304;BA.debugLine="contentInt.Put(\"text\", outcome)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("text"))),(Object)((_outcome)));
 BA.debugLineNum = 305;BA.debugLine="If counter <> Null Then contentInt.Put(\"counter\",";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_counter" /*RemoteObject*/ ),BA.numberCast(double.class, pdftext.__c.getField(false,"Null")))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("counter"))),(Object)((__ref.getField(true,"_counter" /*RemoteObject*/ ))));};
 BA.debugLineNum = 306;BA.debugLine="If linkToPage <> Null Then contentInt.Put(\"linkTo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_linktopage" /*RemoteObject*/ ),BA.numberCast(double.class, pdftext.__c.getField(false,"Null")))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("linkToPage"))),(Object)((__ref.getField(true,"_linktopage" /*RemoteObject*/ ))));};
 BA.debugLineNum = 307;BA.debugLine="If link <> Null Then contentInt.Put(\"link\", link)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_link" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("link"))),(Object)((__ref.getField(true,"_link" /*RemoteObject*/ ))));};
 BA.debugLineNum = 308;BA.debugLine="If tocItem <> Null Then contentInt.Put(\"tocItem\",";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_tocitem" /*RemoteObject*/ ),BA.ObjectToBoolean(pdftext.__c.getField(false,"Null")))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tocItem"))),(Object)((__ref.getField(true,"_tocitem" /*RemoteObject*/ ))));};
 BA.debugLineNum = 309;BA.debugLine="If pageOrientation <> Null Then contentInt.Put(\"p";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_pageorientation" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageOrientation"))),(Object)((__ref.getField(true,"_pageorientation" /*RemoteObject*/ ))));};
 BA.debugLineNum = 310;BA.debugLine="If pageBreakBefore Then contentInt.Put(\"pageBreak";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_pagebreakbefore" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));};
 BA.debugLineNum = 311;BA.debugLine="If pageBreakAfter Then contentInt.Put(\"pageBreak\"";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_pagebreakafter" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));};
 BA.debugLineNum = 312;BA.debugLine="If colSpan <> Null Then contentInt.Put(\"colSpan\",";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_colspan" /*RemoteObject*/ ),BA.numberCast(double.class, pdftext.__c.getField(false,"Null")))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("colSpan"))),(Object)((__ref.getField(true,"_colspan" /*RemoteObject*/ ))));};
 BA.debugLineNum = 313;BA.debugLine="If rowSpan <> Null Then contentInt.Put(\"rowSpan\",";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_rowspan" /*RemoteObject*/ ),BA.numberCast(double.class, pdftext.__c.getField(false,"Null")))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("rowSpan"))),(Object)((__ref.getField(true,"_rowspan" /*RemoteObject*/ ))));};
 BA.debugLineNum = 314;BA.debugLine="If linkToDestination <> Null Then contentInt.Put(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_linktodestination" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("linkToDestination"))),(Object)((__ref.getField(true,"_linktodestination" /*RemoteObject*/ ))));};
 BA.debugLineNum = 315;BA.debugLine="If id <> Null Then contentInt.Put(\"id\", id)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_id" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))));};
 BA.debugLineNum = 316;BA.debugLine="If listType <> Null Then contentInt.Put(\"listType";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_listtype" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("listType"))),(Object)((__ref.getField(true,"_listtype" /*RemoteObject*/ ))));};
 BA.debugLineNum = 317;BA.debugLine="If pageReference <> Null Then contentInt.Put(\"pag";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_pagereference" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageReference"))),(Object)((__ref.getField(true,"_pagereference" /*RemoteObject*/ ))));};
 BA.debugLineNum = 318;BA.debugLine="If textReference <> Null Then contentInt.Put(\"tex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_textreference" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("textReference"))),(Object)((__ref.getField(true,"_textreference" /*RemoteObject*/ ))));};
 BA.debugLineNum = 319;BA.debugLine="If preserveLeadingSpaces <> Null Then contentInt.";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_preserveleadingspaces" /*RemoteObject*/ ),BA.ObjectToBoolean(pdftext.__c.getField(false,"Null")))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("preserveLeadingSpaces"))),(Object)((__ref.getField(true,"_preserveleadingspaces" /*RemoteObject*/ ))));};
 BA.debugLineNum = 320;BA.debugLine="If decoration <> Null Then contentInt.Put(\"decora";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_decoration" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("decoration"))),(Object)((__ref.getField(true,"_decoration" /*RemoteObject*/ ))));};
 BA.debugLineNum = 321;BA.debugLine="If decorationStyle <> Null Then contentInt.Put(\"d";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_decorationstyle" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("decorationStyle"))),(Object)((__ref.getField(true,"_decorationstyle" /*RemoteObject*/ ))));};
 BA.debugLineNum = 322;BA.debugLine="If decorationColor <> Null Then contentInt.Put(\"d";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_decorationcolor" /*RemoteObject*/ ))) { 
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("decorationColor"))),(Object)((__ref.getField(true,"_decorationcolor" /*RemoteObject*/ ))));};
 BA.debugLineNum = 323;BA.debugLine="style.Include(contentInt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_include" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_contentint" /*RemoteObject*/ )));
 BA.debugLineNum = 324;BA.debugLine="Return contentInt";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_contentint" /*RemoteObject*/ );
 BA.debugLineNum = 325;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdftext","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 83;BA.debugLine="Public Sub Initialize As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="contentInt.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 85;BA.debugLine="textInt.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_textint" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 86;BA.debugLine="style.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 87;BA.debugLine="counter = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_counter" /*RemoteObject*/ ,BA.numberCast(int.class, pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 88;BA.debugLine="link = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_link" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 89;BA.debugLine="listType = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_listtype" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 90;BA.debugLine="linkToPage = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_linktopage" /*RemoteObject*/ ,BA.numberCast(int.class, pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 91;BA.debugLine="tocItem = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tocitem" /*RemoteObject*/ ,BA.ObjectToBoolean(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 92;BA.debugLine="pageBreakBefore = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pagebreakbefore" /*RemoteObject*/ ,BA.ObjectToBoolean(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 93;BA.debugLine="pageBreakAfter = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pagebreakafter" /*RemoteObject*/ ,BA.ObjectToBoolean(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 94;BA.debugLine="pageOrientation = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 95;BA.debugLine="colSpan = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colspan" /*RemoteObject*/ ,BA.numberCast(int.class, pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 96;BA.debugLine="rowSpan = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_rowspan" /*RemoteObject*/ ,BA.numberCast(int.class, pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 97;BA.debugLine="linkToDestination = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_linktodestination" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 98;BA.debugLine="listType = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_listtype" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 99;BA.debugLine="id = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 100;BA.debugLine="pageReference = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pagereference" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 101;BA.debugLine="textReference = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_textreference" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 102;BA.debugLine="preserveLeadingSpaces = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_preserveleadingspaces" /*RemoteObject*/ ,BA.ObjectToBoolean(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 103;BA.debugLine="tabindex = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tabindex" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 104;BA.debugLine="decoration = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_decoration" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 105;BA.debugLine="decorationStyle = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_decorationstyle" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 106;BA.debugLine="decorationColor = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_decorationcolor" /*RemoteObject*/ ,BA.ObjectToString(pdftext.__c.getField(false,"Null")));
 BA.debugLineNum = 107;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _noborder(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NoBorder (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("noborder")) { return __ref.runUserSub(false, "pdftext","noborder", __ref);}
 BA.debugLineNum = 185;BA.debugLine="Sub NoBorder As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 186;BA.debugLine="style.noborder";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_noborder" /*RemoteObject*/ );
 BA.debugLineNum = 187;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 188;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAbsolutePosition (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("setabsoluteposition")) { return __ref.runUserSub(false, "pdftext","setabsoluteposition", __ref, _x, _y);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 161;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 162;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = pdftext.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 163;BA.debugLine="opt.Put(\"x\", x)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 164;BA.debugLine="opt.Put(\"y\", y)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 165;BA.debugLine="contentInt.Put(\"absolutePosition\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("absolutePosition"))),(Object)((_opt.getObject())));
 BA.debugLineNum = 166;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalignmentcenter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAlignmentCenter (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("setalignmentcenter")) { return __ref.runUserSub(false, "pdftext","setalignmentcenter", __ref);}
 BA.debugLineNum = 206;BA.debugLine="Sub SetAlignmentCenter As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="style.alignmentCenter = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_alignmentcenter" /*RemoteObject*/ ,pdftext.__c.getField(true,"True"));
 BA.debugLineNum = 208;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalignmentjustify(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAlignmentJustify (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("setalignmentjustify")) { return __ref.runUserSub(false, "pdftext","setalignmentjustify", __ref);}
 BA.debugLineNum = 218;BA.debugLine="Sub SetAlignmentJustify As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 219;BA.debugLine="style.alignmentJustify = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_alignmentjustify" /*RemoteObject*/ ,pdftext.__c.getField(true,"True"));
 BA.debugLineNum = 220;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalignmentright(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAlignmentRight (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("setalignmentright")) { return __ref.runUserSub(false, "pdftext","setalignmentright", __ref);}
 BA.debugLineNum = 212;BA.debugLine="Sub SetAlignmentRight As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 213;BA.debugLine="style.alignmentRight = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_alignmentright" /*RemoteObject*/ ,pdftext.__c.getField(true,"True"));
 BA.debugLineNum = 214;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 215;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setangle(RemoteObject __ref,RemoteObject _dangle) throws Exception{
try {
		Debug.PushSubsStack("SetAngle (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("setangle")) { return __ref.runUserSub(false, "pdftext","setangle", __ref, _dangle);}
Debug.locals.put("dangle", _dangle);
 BA.debugLineNum = 334;BA.debugLine="Sub SetAngle(dangle As Double) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 335;BA.debugLine="style.angle = dangle";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_angle" /*RemoteObject*/ ,_dangle);
 BA.debugLineNum = 336;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 337;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbold(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBold (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("setbold")) { return __ref.runUserSub(false, "pdftext","setbold", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 256;BA.debugLine="Sub SetBold(b As Boolean) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="style.bold = b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_bold" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 258;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _l,RemoteObject _t,RemoteObject _r,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "pdftext","setborder", __ref, _l, _t, _r, _b);}
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 179;BA.debugLine="Sub SetBorder(l As Boolean, t As Boolean, r As Boo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 180;BA.debugLine="style.SetBorder(l,t,r,b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_setborder" /*RemoteObject*/ ,(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b));
 BA.debugLineNum = 181;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbordercolor(RemoteObject __ref,RemoteObject _l,RemoteObject _t,RemoteObject _r,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBorderColor (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("setbordercolor")) { return __ref.runUserSub(false, "pdftext","setbordercolor", __ref, _l, _t, _r, _b);}
RemoteObject _margin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 170;BA.debugLine="Sub SetBorderColor(l As String, t As String, r As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 171;BA.debugLine="Dim margin As List";
Debug.JustUpdateDeviceLine();
_margin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("margin", _margin);
 BA.debugLineNum = 172;BA.debugLine="margin.Initialize";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("Initialize");
 BA.debugLineNum = 173;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("AddAll",(Object)(pdftext.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_l),(_t),(_r),(_b)})))));
 BA.debugLineNum = 174;BA.debugLine="contentInt.Put(\"borderColor\", margin)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("borderColor"))),(Object)((_margin.getObject())));
 BA.debugLineNum = 175;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _colour) throws Exception{
try {
		Debug.PushSubsStack("SetColor (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "pdftext","setcolor", __ref, _colour);}
Debug.locals.put("colour", _colour);
 BA.debugLineNum = 271;BA.debugLine="Sub SetColor(colour As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 272;BA.debugLine="style.color = colour";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_color" /*RemoteObject*/ ,_colour);
 BA.debugLineNum = 273;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolspan(RemoteObject __ref,RemoteObject _cs) throws Exception{
try {
		Debug.PushSubsStack("SetColSpan (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("setcolspan")) { return __ref.runUserSub(false, "pdftext","setcolspan", __ref, _cs);}
Debug.locals.put("cs", _cs);
 BA.debugLineNum = 231;BA.debugLine="Sub SetColSpan(cs As Int) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 232;BA.debugLine="If cs = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cs,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 233;BA.debugLine="colSpan = cs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_colspan" /*RemoteObject*/ ,_cs);
 BA.debugLineNum = 234;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdecoration(RemoteObject __ref,RemoteObject _dec) throws Exception{
try {
		Debug.PushSubsStack("SetDecoration (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("setdecoration")) { return __ref.runUserSub(false, "pdftext","setdecoration", __ref, _dec);}
Debug.locals.put("dec", _dec);
 BA.debugLineNum = 112;BA.debugLine="Sub SetDecoration(dec As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="If dec = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dec,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 114;BA.debugLine="decoration = dec";
Debug.JustUpdateDeviceLine();
__ref.setField ("_decoration" /*RemoteObject*/ ,_dec);
 BA.debugLineNum = 115;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdecorationcolor(RemoteObject __ref,RemoteObject _sdecorationcolor) throws Exception{
try {
		Debug.PushSubsStack("SetDecorationColor (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setdecorationcolor")) { return __ref.runUserSub(false, "pdftext","setdecorationcolor", __ref, _sdecorationcolor);}
Debug.locals.put("sdecorationColor", _sdecorationcolor);
 BA.debugLineNum = 126;BA.debugLine="Sub SetDecorationColor(sdecorationColor As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="If sdecorationColor = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sdecorationcolor,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 128;BA.debugLine="decorationColor = sdecorationColor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_decorationcolor" /*RemoteObject*/ ,_sdecorationcolor);
 BA.debugLineNum = 129;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdecorationstyle(RemoteObject __ref,RemoteObject _sdecorationstyle) throws Exception{
try {
		Debug.PushSubsStack("SetDecorationStyle (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("setdecorationstyle")) { return __ref.runUserSub(false, "pdftext","setdecorationstyle", __ref, _sdecorationstyle);}
Debug.locals.put("sdecorationStyle", _sdecorationstyle);
 BA.debugLineNum = 120;BA.debugLine="Sub SetDecorationStyle(sdecorationStyle As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="If sdecorationStyle = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sdecorationstyle,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 122;BA.debugLine="decorationStyle = sdecorationStyle";
Debug.JustUpdateDeviceLine();
__ref.setField ("_decorationstyle" /*RemoteObject*/ ,_sdecorationstyle);
 BA.debugLineNum = 123;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfillcolor(RemoteObject __ref,RemoteObject _fc) throws Exception{
try {
		Debug.PushSubsStack("SetFillColor (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("setfillcolor")) { return __ref.runUserSub(false, "pdftext","setfillcolor", __ref, _fc);}
Debug.locals.put("fc", _fc);
 BA.debugLineNum = 200;BA.debugLine="Sub SetFillColor(fc As Object) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 201;BA.debugLine="style.fillColor = fc";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_fillcolor" /*RemoteObject*/ ,BA.ObjectToString(_fc));
 BA.debugLineNum = 202;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfontsize(RemoteObject __ref,RemoteObject _fs) throws Exception{
try {
		Debug.PushSubsStack("SetFontSize (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("setfontsize")) { return __ref.runUserSub(false, "pdftext","setfontsize", __ref, _fs);}
Debug.locals.put("fs", _fs);
 BA.debugLineNum = 266;BA.debugLine="Sub SetFontSize(fs As Int) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="style.fontSize = fs";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_fontsize" /*RemoteObject*/ ,_fs);
 BA.debugLineNum = 268;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _sheight) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "pdftext","setheight", __ref, _sheight);}
Debug.locals.put("sHeight", _sheight);
 BA.debugLineNum = 251;BA.debugLine="Sub SetHeight(sHeight As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="style.height = sHeight";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_height" /*RemoteObject*/ ,_sheight);
 BA.debugLineNum = 253;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("SetID (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "pdftext","setid", __ref, _sid);}
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 34;BA.debugLine="Sub SetID(sid As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="If sid = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sid,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 36;BA.debugLine="id = sid";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid);
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
public static RemoteObject  _setitalics(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetItalics (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("setitalics")) { return __ref.runUserSub(false, "pdftext","setitalics", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 261;BA.debugLine="Sub SetItalics(b As Boolean) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 262;BA.debugLine="style.italics = b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_italics" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 263;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlink(RemoteObject __ref,RemoteObject _slink) throws Exception{
try {
		Debug.PushSubsStack("SetLink (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("setlink")) { return __ref.runUserSub(false, "pdftext","setlink", __ref, _slink);}
Debug.locals.put("slink", _slink);
 BA.debugLineNum = 64;BA.debugLine="Sub SetLink(slink As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="If slink = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_slink,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 66;BA.debugLine="link = slink";
Debug.JustUpdateDeviceLine();
__ref.setField ("_link" /*RemoteObject*/ ,_slink);
 BA.debugLineNum = 67;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlinktodestination(RemoteObject __ref,RemoteObject _slinktodestination) throws Exception{
try {
		Debug.PushSubsStack("SetLinkToDestination (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setlinktodestination")) { return __ref.runUserSub(false, "pdftext","setlinktodestination", __ref, _slinktodestination);}
Debug.locals.put("slinkToDestination", _slinktodestination);
 BA.debugLineNum = 52;BA.debugLine="Sub SetLinkToDestination(slinkToDestination As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="If slinkToDestination = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_slinktodestination,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 54;BA.debugLine="linkToDestination = slinkToDestination";
Debug.JustUpdateDeviceLine();
__ref.setField ("_linktodestination" /*RemoteObject*/ ,_slinktodestination);
 BA.debugLineNum = 55;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlinktopage(RemoteObject __ref,RemoteObject _slinktopage) throws Exception{
try {
		Debug.PushSubsStack("SetLinkToPage (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setlinktopage")) { return __ref.runUserSub(false, "pdftext","setlinktopage", __ref, _slinktopage);}
Debug.locals.put("slinkToPage", _slinktopage);
 BA.debugLineNum = 58;BA.debugLine="Sub SetLinkToPage(slinkToPage As String) As PDFTex";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="If slinkToPage = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_slinktopage,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 60;BA.debugLine="linkToPage = slinkToPage";
Debug.JustUpdateDeviceLine();
__ref.setField ("_linktopage" /*RemoteObject*/ ,BA.numberCast(int.class, _slinktopage));
 BA.debugLineNum = 61;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _setlisttype(RemoteObject __ref,RemoteObject _slisttype) throws Exception{
try {
		Debug.PushSubsStack("SetListType (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setlisttype")) { return __ref.runUserSub(false, "pdftext","setlisttype", __ref, _slisttype);}
Debug.locals.put("slisttype", _slisttype);
 BA.debugLineNum = 70;BA.debugLine="Sub SetListType(slisttype As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="If slisttype = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_slisttype,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 72;BA.debugLine="listType = slisttype";
Debug.JustUpdateDeviceLine();
__ref.setField ("_listtype" /*RemoteObject*/ ,_slisttype);
 BA.debugLineNum = 73;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmargin(RemoteObject __ref,RemoteObject _l,RemoteObject _t,RemoteObject _r,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMargin (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "pdftext","setmargin", __ref, _l, _t, _r, _b);}
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 328;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="style.SetMargin(l,t,r,b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_setmargin" /*RemoteObject*/ ,(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b));
 BA.debugLineNum = 330;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setopacity(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("SetOpacity (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("setopacity")) { return __ref.runUserSub(false, "pdftext","setopacity", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 340;BA.debugLine="Sub SetOpacity(o As Double) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 341;BA.debugLine="style.opacity = o";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_opacity" /*RemoteObject*/ ,_o);
 BA.debugLineNum = 342;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 343;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageBreakAfter (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("setpagebreakafter")) { return __ref.runUserSub(false, "pdftext","setpagebreakafter", __ref);}
 BA.debugLineNum = 296;BA.debugLine="Sub SetPageBreakAfter As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 297;BA.debugLine="contentInt.Put(\"pageBreak\", \"after\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));
 BA.debugLineNum = 298;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 299;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageBreakBefore (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("setpagebreakbefore")) { return __ref.runUserSub(false, "pdftext","setpagebreakbefore", __ref);}
 BA.debugLineNum = 290;BA.debugLine="Sub SetPageBreakBefore As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 291;BA.debugLine="contentInt.Put(\"pageBreak\", \"before\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));
 BA.debugLineNum = 292;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 293;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpageorientation(RemoteObject __ref,RemoteObject _spageorientation) throws Exception{
try {
		Debug.PushSubsStack("SetPageOrientation (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setpageorientation")) { return __ref.runUserSub(false, "pdftext","setpageorientation", __ref, _spageorientation);}
Debug.locals.put("spageOrientation", _spageorientation);
 BA.debugLineNum = 76;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="If spageOrientation = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_spageorientation,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 78;BA.debugLine="pageOrientation = spageOrientation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,_spageorientation);
 BA.debugLineNum = 79;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpagereference(RemoteObject __ref,RemoteObject _spagereference) throws Exception{
try {
		Debug.PushSubsStack("SetPageReference (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setpagereference")) { return __ref.runUserSub(false, "pdftext","setpagereference", __ref, _spagereference);}
Debug.locals.put("spageReference", _spagereference);
 BA.debugLineNum = 46;BA.debugLine="Sub SetPageReference(spageReference As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="If spageReference = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_spagereference,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 48;BA.debugLine="pageReference = spageReference";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pagereference" /*RemoteObject*/ ,_spagereference);
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
public static RemoteObject  _setrelativeposition(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetRelativePosition (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("setrelativeposition")) { return __ref.runUserSub(false, "pdftext","setrelativeposition", __ref, _x, _y);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 191;BA.debugLine="Sub SetRelativePosition(x As Int, y As Int) As PDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = pdftext.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 193;BA.debugLine="opt.Put(\"x\", x)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 194;BA.debugLine="opt.Put(\"y\", y)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 195;BA.debugLine="contentInt.Put(\"relativePosition\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("relativePosition"))),(Object)((_opt.getObject())));
 BA.debugLineNum = 196;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrowspan(RemoteObject __ref,RemoteObject _rs) throws Exception{
try {
		Debug.PushSubsStack("SetRowSpan (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("setrowspan")) { return __ref.runUserSub(false, "pdftext","setrowspan", __ref, _rs);}
Debug.locals.put("rs", _rs);
 BA.debugLineNum = 224;BA.debugLine="Sub SetRowSpan(rs As Int) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 225;BA.debugLine="If rs = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_rs,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 226;BA.debugLine="rowSpan = rs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_rowspan" /*RemoteObject*/ ,_rs);
 BA.debugLineNum = 227;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _stylename) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "pdftext","setstyle", __ref, _stylename);}
Debug.locals.put("styleName", _stylename);
 BA.debugLineNum = 238;BA.debugLine="Sub SetStyle(styleName As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 239;BA.debugLine="If styleName = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stylename,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 240;BA.debugLine="style.AddStyle(styleName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_addstyle" /*RemoteObject*/ ,(Object)(_stylename));
 BA.debugLineNum = 241;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _stabindex) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "pdftext","settabindex", __ref, _stabindex);}
Debug.locals.put("stabindex", _stabindex);
 BA.debugLineNum = 28;BA.debugLine="Sub SetTabIndex(stabindex As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="If stabindex = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stabindex,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 30;BA.debugLine="tabindex = stabindex";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tabindex" /*RemoteObject*/ ,_stabindex);
 BA.debugLineNum = 31;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextreference(RemoteObject __ref,RemoteObject _stextreference) throws Exception{
try {
		Debug.PushSubsStack("SetTextReference (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("settextreference")) { return __ref.runUserSub(false, "pdftext","settextreference", __ref, _stextreference);}
Debug.locals.put("stextReference", _stextreference);
 BA.debugLineNum = 40;BA.debugLine="Sub SetTextReference(stextReference As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="If stextReference = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stextreference,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 42;BA.debugLine="textReference = stextReference";
Debug.JustUpdateDeviceLine();
__ref.setField ("_textreference" /*RemoteObject*/ ,_stextreference);
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
public static RemoteObject  _settocitem(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTocItem (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("settocitem")) { return __ref.runUserSub(false, "pdftext","settocitem", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 154;BA.debugLine="Sub SetTocItem(ti As Boolean) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 155;BA.debugLine="If ti = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ti,pdftext.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 156;BA.debugLine="tocItem = ti";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tocitem" /*RemoteObject*/ ,_ti);
 BA.debugLineNum = 157;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settocmargin(RemoteObject __ref,RemoteObject _l,RemoteObject _t,RemoteObject _r,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTocMargin (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("settocmargin")) { return __ref.runUserSub(false, "pdftext","settocmargin", __ref, _l, _t, _r, _b);}
RemoteObject _margin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 145;BA.debugLine="Sub SetTocMargin(l As Int, t As Int, r As Int, b A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Dim margin As List";
Debug.JustUpdateDeviceLine();
_margin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("margin", _margin);
 BA.debugLineNum = 147;BA.debugLine="margin.Initialize";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("Initialize");
 BA.debugLineNum = 148;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("AddAll",(Object)(pdftext.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_l),(_t),(_r),(_b)})))));
 BA.debugLineNum = 149;BA.debugLine="contentInt.Put(\"tocMargin\", margin)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tocMargin"))),(Object)((_margin.getObject())));
 BA.debugLineNum = 150;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settocnumberstyle(RemoteObject __ref,RemoteObject _ts) throws Exception{
try {
		Debug.PushSubsStack("SetTocNumberStyle (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("settocnumberstyle")) { return __ref.runUserSub(false, "pdftext","settocnumberstyle", __ref, _ts);}
Debug.locals.put("ts", _ts);
 BA.debugLineNum = 133;BA.debugLine="Sub SetTocNumberStyle(ts As PDFStyle) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="contentInt.Put(\"tocNumberStyle\", ts)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tocNumberStyle"))),(Object)((_ts)));
 BA.debugLineNum = 135;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 136;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settocstyle(RemoteObject __ref,RemoteObject _ts) throws Exception{
try {
		Debug.PushSubsStack("SetTocStyle (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("settocstyle")) { return __ref.runUserSub(false, "pdftext","settocstyle", __ref, _ts);}
Debug.locals.put("ts", _ts);
 BA.debugLineNum = 139;BA.debugLine="Sub SetTocStyle(ts As PDFStyle) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="contentInt.Put(\"tocStyle\", ts)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_contentint" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tocStyle"))),(Object)((_ts)));
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
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _swidth) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (pdftext) ","pdftext",27,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "pdftext","setwidth", __ref, _swidth);}
Debug.locals.put("sWidth", _swidth);
 BA.debugLineNum = 245;BA.debugLine="Sub SetWidth(sWidth As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 246;BA.debugLine="style.width = sWidth";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).setField ("_width" /*RemoteObject*/ ,_swidth);
 BA.debugLineNum = 247;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 248;BA.debugLine="End Sub";
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