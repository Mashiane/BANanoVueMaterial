package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfmaker_subs_0 {


public static RemoteObject  _addcolumns(RemoteObject __ref,RemoteObject _cols) throws Exception{
try {
		Debug.PushSubsStack("AddColumns (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,340);
if (RapidSub.canDelegate("addcolumns")) { return __ref.runUserSub(false, "pdfmaker","addcolumns", __ref, _cols);}
Debug.locals.put("cols", _cols);
 BA.debugLineNum = 340;BA.debugLine="Sub AddColumns(cols As PDFColumns) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 342;BA.debugLine="content.Add(cols.content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cols.runClassMethod (b4j.example.pdfcolumns.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 343;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addfooter(RemoteObject __ref,RemoteObject _ftr) throws Exception{
try {
		Debug.PushSubsStack("AddFooter (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("addfooter")) { return __ref.runUserSub(false, "pdfmaker","addfooter", __ref, _ftr);}
Debug.locals.put("ftr", _ftr);
 BA.debugLineNum = 347;BA.debugLine="Sub AddFooter(ftr As PDFFooter) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 349;BA.debugLine="docDefinition.Put(\"footer\", ftr.content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("footer"))),(Object)((_ftr.runClassMethod (b4j.example.pdffooter.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 350;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 351;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddImage (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("addimage")) { return __ref.runUserSub(false, "pdfmaker","addimage", __ref, _img);}
Debug.locals.put("img", _img);
 BA.debugLineNum = 306;BA.debugLine="Sub AddImage(img As PDFImage) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="content.Add(img.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_img.runClassMethod (b4j.example.pdfimage.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 309;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 310;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlist(RemoteObject __ref,RemoteObject _lstof) throws Exception{
try {
		Debug.PushSubsStack("AddList (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,422);
if (RapidSub.canDelegate("addlist")) { return __ref.runUserSub(false, "pdfmaker","addlist", __ref, _lstof);}
Debug.locals.put("lstOf", _lstof);
 BA.debugLineNum = 422;BA.debugLine="Sub AddList(lstOf As PDFList) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 424;BA.debugLine="content.Add(lstOf.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_lstof.runClassMethod (b4j.example.pdflist.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 425;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 426;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addparagraphs(RemoteObject __ref,RemoteObject _stack) throws Exception{
try {
		Debug.PushSubsStack("AddParagraphs (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,368);
if (RapidSub.canDelegate("addparagraphs")) { return __ref.runUserSub(false, "pdfmaker","addparagraphs", __ref, _stack);}
Debug.locals.put("stack", _stack);
 BA.debugLineNum = 368;BA.debugLine="Sub AddParagraphs(stack As PDFParagraphs) As PDFMa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 370;BA.debugLine="content.Add(stack.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_stack.runClassMethod (b4j.example.pdfparagraphs.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 371;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 372;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addqrcode(RemoteObject __ref,RemoteObject _qrcode) throws Exception{
try {
		Debug.PushSubsStack("AddQRCode (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,361);
if (RapidSub.canDelegate("addqrcode")) { return __ref.runUserSub(false, "pdfmaker","addqrcode", __ref, _qrcode);}
Debug.locals.put("qrCode", _qrcode);
 BA.debugLineNum = 361;BA.debugLine="Sub AddQRCode(qrCode As PDFQRCode) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 363;BA.debugLine="content.Add(qrCode.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_qrcode.runClassMethod (b4j.example.pdfqrcode.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 364;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 365;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddStack (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("addstack")) { return __ref.runUserSub(false, "pdfmaker","addstack", __ref, _stack);}
Debug.locals.put("stack", _stack);
 BA.debugLineNum = 354;BA.debugLine="Sub AddStack(stack As PDFStack) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 356;BA.debugLine="content.Add(stack.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_stack.runClassMethod (b4j.example.pdfstack.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 357;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 358;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddString (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("addstring")) { return __ref.runUserSub(false, "pdfmaker","addstring", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 375;BA.debugLine="Sub AddString(txt As String) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 377;BA.debugLine="content.Add(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_txt)));
 BA.debugLineNum = 378;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstyle(RemoteObject __ref,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("AddStyle (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,463);
if (RapidSub.canDelegate("addstyle")) { return __ref.runUserSub(false, "pdfmaker","addstyle", __ref, _style);}
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _stylecontent = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("style", _style);
 BA.debugLineNum = 463;BA.debugLine="Sub AddStyle(style As PDFStyle)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 465;BA.debugLine="Dim name As String = style.name";
Debug.JustUpdateDeviceLine();
_name = _style.getField(true,"_name" /*RemoteObject*/ );Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 466;BA.debugLine="Dim stylecontent As Map = style.content";
Debug.JustUpdateDeviceLine();
_stylecontent = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_stylecontent = _style.runClassMethod (b4j.example.pdfstyle.class, "_getcontent" /*RemoteObject*/ );Debug.locals.put("stylecontent", _stylecontent);Debug.locals.put("stylecontent", _stylecontent);
 BA.debugLineNum = 467;BA.debugLine="styles.Put(name, stylecontent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_styles" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_name)),(Object)((_stylecontent.getObject())));
 BA.debugLineNum = 468;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtable(RemoteObject __ref,RemoteObject _tbl) throws Exception{
try {
		Debug.PushSubsStack("AddTable (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("addtable")) { return __ref.runUserSub(false, "pdfmaker","addtable", __ref, _tbl);}
Debug.locals.put("tbl", _tbl);
 BA.debugLineNum = 313;BA.debugLine="Sub AddTable(tbl As PDFTable) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 315;BA.debugLine="content.Add(tbl.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_tbl.runClassMethod (b4j.example.pdftable.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 316;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtext(RemoteObject __ref,RemoteObject _currentcontent) throws Exception{
try {
		Debug.PushSubsStack("AddText (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,471);
if (RapidSub.canDelegate("addtext")) { return __ref.runUserSub(false, "pdfmaker","addtext", __ref, _currentcontent);}
RemoteObject _text = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("currentContent", _currentcontent);
 BA.debugLineNum = 471;BA.debugLine="Sub AddText(currentContent As PDFText)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 473;BA.debugLine="Dim text As Map = currentContent.Content";
Debug.JustUpdateDeviceLine();
_text = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_text = _currentcontent.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ );Debug.locals.put("text", _text);Debug.locals.put("text", _text);
 BA.debugLineNum = 474;BA.debugLine="content.Add(text)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_text.getObject())));
 BA.debugLineNum = 475;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtoc(RemoteObject __ref,RemoteObject _toc) throws Exception{
try {
		Debug.PushSubsStack("AddToC (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("addtoc")) { return __ref.runUserSub(false, "pdfmaker","addtoc", __ref, _toc);}
Debug.locals.put("toc", _toc);
 BA.debugLineNum = 256;BA.debugLine="Sub AddToC(toc As PDFToC) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="content.Add(toc.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_toc.runClassMethod (b4j.example.pdftoc.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 259;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _build(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Build (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,496);
if (RapidSub.canDelegate("build")) { return __ref.runUserSub(false, "pdfmaker","build", __ref);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
 BA.debugLineNum = 496;BA.debugLine="private Sub Build";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 498;BA.debugLine="If pageSize <> Null Then docDefinition.Put(\"pageS";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_pagesize" /*RemoteObject*/ ))) { 
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageSize"))),(Object)((__ref.getField(true,"_pagesize" /*RemoteObject*/ ))));};
 BA.debugLineNum = 499;BA.debugLine="If pageOrientation <> Null Then docDefinition.Put";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_pageorientation" /*RemoteObject*/ ))) { 
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageOrientation"))),(Object)((__ref.getField(true,"_pageorientation" /*RemoteObject*/ ))));};
 BA.debugLineNum = 500;BA.debugLine="docDefinition.Put(\"content\", content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("content"))),(Object)((__ref.getField(false,"_content" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 501;BA.debugLine="docDefinition.Put(\"styles\", styles)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("styles"))),(Object)((__ref.getField(false,"_styles" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 502;BA.debugLine="If title <> Null Then info.Put(\"Title\", title)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_title" /*RemoteObject*/ ))) { 
__ref.getField(false,"_info" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Title"))),(Object)((__ref.getField(true,"_title" /*RemoteObject*/ ))));};
 BA.debugLineNum = 503;BA.debugLine="If author <> Null Then info.Put(\"Author\", author)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_author" /*RemoteObject*/ ))) { 
__ref.getField(false,"_info" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Author"))),(Object)((__ref.getField(true,"_author" /*RemoteObject*/ ))));};
 BA.debugLineNum = 504;BA.debugLine="If subject <> Null Then info.Put(\"Subject\", subje";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_subject" /*RemoteObject*/ ))) { 
__ref.getField(false,"_info" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Subject"))),(Object)((__ref.getField(true,"_subject" /*RemoteObject*/ ))));};
 BA.debugLineNum = 505;BA.debugLine="If keywords <> Null Then info.Put(\"Keywords\", key";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_keywords" /*RemoteObject*/ ))) { 
__ref.getField(false,"_info" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Keywords"))),(Object)((__ref.getField(true,"_keywords" /*RemoteObject*/ ))));};
 BA.debugLineNum = 506;BA.debugLine="If creator <> Null Then info.Put(\"Creator\", creat";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_creator" /*RemoteObject*/ ))) { 
__ref.getField(false,"_info" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Creator"))),(Object)((__ref.getField(true,"_creator" /*RemoteObject*/ ))));};
 BA.debugLineNum = 507;BA.debugLine="If producer <> Null Then info.Put(\"Producer\", pro";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_producer" /*RemoteObject*/ ))) { 
__ref.getField(false,"_info" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("Producer"))),(Object)((__ref.getField(true,"_producer" /*RemoteObject*/ ))));};
 BA.debugLineNum = 508;BA.debugLine="If info.Size > 0 Then docDefinition.Put(\"info\", i";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_info" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("info"))),(Object)((__ref.getField(false,"_info" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 509;BA.debugLine="If compress <> Null Then docDefinition.Put(\"compr";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_compress" /*RemoteObject*/ ),BA.ObjectToBoolean(pdfmaker.__c.getField(false,"Null")))) { 
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("compress"))),(Object)((__ref.getField(true,"_compress" /*RemoteObject*/ ))));};
 BA.debugLineNum = 510;BA.debugLine="If security.userPassword <> Null Then docDefiniti";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_security" /*RemoteObject*/ ).getField(true,"_userpassword" /*RemoteObject*/ ))) { 
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("userPassword"))),(Object)((__ref.getField(false,"_security" /*RemoteObject*/ ).getField(true,"_userpassword" /*RemoteObject*/ ))));};
 BA.debugLineNum = 511;BA.debugLine="If security.ownerPassword <> Null Then docDefinit";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_security" /*RemoteObject*/ ).getField(true,"_ownerpassword" /*RemoteObject*/ ))) { 
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ownerPassword"))),(Object)((__ref.getField(false,"_security" /*RemoteObject*/ ).getField(true,"_ownerpassword" /*RemoteObject*/ ))));};
 BA.debugLineNum = 512;BA.debugLine="docDefinition.Put(\"permissions\", security.content";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("permissions"))),(Object)((__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 513;BA.debugLine="docDefinition.Put(\"defaultStyle\", defaultStyle.co";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("defaultStyle"))),(Object)((__ref.getField(false,"_defaultstyle" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 514;BA.debugLine="If files.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_files" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 515;BA.debugLine="For Each k As String In files.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group18 = __ref.getField(false,"_files" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen18 = group18.runMethod(true,"getSize").<Integer>get()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_k = BA.ObjectToString(group18.runMethod(false,"Get",index18));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 517;BA.debugLine="Dim v As String = files.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(__ref.getField(false,"_files" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 518;BA.debugLine="GetFileFromServer(v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_getfilefromserver" /*RemoteObject*/ ,(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 }else {
 BA.debugLineNum = 521;BA.debugLine="FilesAreReady";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_filesareready" /*RemoteObject*/ );
 };
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private styles As Map";
pdfmaker._styles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_styles",pdfmaker._styles);
 //BA.debugLineNum = 4;BA.debugLine="Private docDefinition As Map";
pdfmaker._docdefinition = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_docdefinition",pdfmaker._docdefinition);
 //BA.debugLineNum = 5;BA.debugLine="Private content As List";
pdfmaker._content = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_content",pdfmaker._content);
 //BA.debugLineNum = 6;BA.debugLine="Public defaultStyle As PDFStyle";
pdfmaker._defaultstyle = RemoteObject.createNew ("b4j.example.pdfstyle");__ref.setField("_defaultstyle",pdfmaker._defaultstyle);
 //BA.debugLineNum = 7;BA.debugLine="Private pdf As BANanoObject";
pdfmaker._pdf = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_pdf",pdfmaker._pdf);
 //BA.debugLineNum = 8;BA.debugLine="Private BANano As BANano  'ignore";
pdfmaker._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",pdfmaker._banano);
 //BA.debugLineNum = 9;BA.debugLine="Public pageSize As String";
pdfmaker._pagesize = RemoteObject.createImmutable("");__ref.setField("_pagesize",pdfmaker._pagesize);
 //BA.debugLineNum = 10;BA.debugLine="Public pageOrientation As String";
pdfmaker._pageorientation = RemoteObject.createImmutable("");__ref.setField("_pageorientation",pdfmaker._pageorientation);
 //BA.debugLineNum = 11;BA.debugLine="Public title As String";
pdfmaker._title = RemoteObject.createImmutable("");__ref.setField("_title",pdfmaker._title);
 //BA.debugLineNum = 12;BA.debugLine="Public author As String";
pdfmaker._author = RemoteObject.createImmutable("");__ref.setField("_author",pdfmaker._author);
 //BA.debugLineNum = 13;BA.debugLine="Public subject As String";
pdfmaker._subject = RemoteObject.createImmutable("");__ref.setField("_subject",pdfmaker._subject);
 //BA.debugLineNum = 14;BA.debugLine="Public keywords As String";
pdfmaker._keywords = RemoteObject.createImmutable("");__ref.setField("_keywords",pdfmaker._keywords);
 //BA.debugLineNum = 15;BA.debugLine="Public creator As String";
pdfmaker._creator = RemoteObject.createImmutable("");__ref.setField("_creator",pdfmaker._creator);
 //BA.debugLineNum = 16;BA.debugLine="Public producer As String";
pdfmaker._producer = RemoteObject.createImmutable("");__ref.setField("_producer",pdfmaker._producer);
 //BA.debugLineNum = 17;BA.debugLine="Private info As Map";
pdfmaker._info = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_info",pdfmaker._info);
 //BA.debugLineNum = 18;BA.debugLine="Private compress As Boolean";
pdfmaker._compress = RemoteObject.createImmutable(false);__ref.setField("_compress",pdfmaker._compress);
 //BA.debugLineNum = 19;BA.debugLine="Public security As PDFSecurity";
pdfmaker._security = RemoteObject.createNew ("b4j.example.pdfsecurity");__ref.setField("_security",pdfmaker._security);
 //BA.debugLineNum = 20;BA.debugLine="Private parentID As String";
pdfmaker._parentid = RemoteObject.createImmutable("");__ref.setField("_parentid",pdfmaker._parentid);
 //BA.debugLineNum = 21;BA.debugLine="Private fName As String";
pdfmaker._fname = RemoteObject.createImmutable("");__ref.setField("_fname",pdfmaker._fname);
 //BA.debugLineNum = 22;BA.debugLine="Private Blobs As Map";
pdfmaker._blobs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_blobs",pdfmaker._blobs);
 //BA.debugLineNum = 23;BA.debugLine="Private NumFiles As Int";
pdfmaker._numfiles = RemoteObject.createImmutable(0);__ref.setField("_numfiles",pdfmaker._numfiles);
 //BA.debugLineNum = 24;BA.debugLine="Private files As Map";
pdfmaker._files = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_files",pdfmaker._files);
 //BA.debugLineNum = 25;BA.debugLine="Private images As Map";
pdfmaker._images = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_images",pdfmaker._images);
 //BA.debugLineNum = 26;BA.debugLine="Private fileKeys As Map";
pdfmaker._filekeys = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_filekeys",pdfmaker._filekeys);
 //BA.debugLineNum = 27;BA.debugLine="Private action As String";
pdfmaker._action = RemoteObject.createImmutable("");__ref.setField("_action",pdfmaker._action);
 //BA.debugLineNum = 28;BA.debugLine="Private eventHandler As Object";
pdfmaker._eventhandler = RemoteObject.createNew ("Object");__ref.setField("_eventhandler",pdfmaker._eventhandler);
 //BA.debugLineNum = 29;BA.debugLine="Private eventMethod As String";
pdfmaker._eventmethod = RemoteObject.createImmutable("");__ref.setField("_eventmethod",pdfmaker._eventmethod);
 //BA.debugLineNum = 30;BA.debugLine="Private mJSON As String";
pdfmaker._mjson = RemoteObject.createImmutable("");__ref.setField("_mjson",pdfmaker._mjson);
 //BA.debugLineNum = 31;BA.debugLine="Private mJSONPretty As String";
pdfmaker._mjsonpretty = RemoteObject.createImmutable("");__ref.setField("_mjsonpretty",pdfmaker._mjsonpretty);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createcolumns(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateColumns (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("createcolumns")) { return __ref.runUserSub(false, "pdfmaker","createcolumns", __ref);}
RemoteObject _col = RemoteObject.declareNull("b4j.example.pdfcolumns");
 BA.debugLineNum = 429;BA.debugLine="Sub CreateColumns As PDFColumns";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 431;BA.debugLine="Dim col As PDFColumns";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("b4j.example.pdfcolumns");Debug.locals.put("col", _col);
 BA.debugLineNum = 432;BA.debugLine="col.Initialize";
Debug.JustUpdateDeviceLine();
_col.runClassMethod (b4j.example.pdfcolumns.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 433;BA.debugLine="Return col";
Debug.JustUpdateDeviceLine();
if (true) return _col;
 BA.debugLineNum = 434;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfooter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateFooter (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,406);
if (RapidSub.canDelegate("createfooter")) { return __ref.runUserSub(false, "pdfmaker","createfooter", __ref);}
RemoteObject _ftr = RemoteObject.declareNull("b4j.example.pdffooter");
 BA.debugLineNum = 406;BA.debugLine="Sub CreateFooter As PDFFooter";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 408;BA.debugLine="Dim ftr As PDFFooter";
Debug.JustUpdateDeviceLine();
_ftr = RemoteObject.createNew ("b4j.example.pdffooter");Debug.locals.put("ftr", _ftr);
 BA.debugLineNum = 409;BA.debugLine="ftr.Initialize";
Debug.JustUpdateDeviceLine();
_ftr.runClassMethod (b4j.example.pdffooter.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 410;BA.debugLine="Return ftr";
Debug.JustUpdateDeviceLine();
if (true) return _ftr;
 BA.debugLineNum = 411;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createimage(RemoteObject __ref,RemoteObject _imgkey) throws Exception{
try {
		Debug.PushSubsStack("CreateImage (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("createimage")) { return __ref.runUserSub(false, "pdfmaker","createimage", __ref, _imgkey);}
RemoteObject _img = RemoteObject.declareNull("b4j.example.pdfimage");
Debug.locals.put("imgKey", _imgkey);
 BA.debugLineNum = 297;BA.debugLine="Sub CreateImage(imgKey As String) As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 299;BA.debugLine="Dim img As PDFImage";
Debug.JustUpdateDeviceLine();
_img = RemoteObject.createNew ("b4j.example.pdfimage");Debug.locals.put("img", _img);
 BA.debugLineNum = 300;BA.debugLine="img.Initialize";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.pdfimage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 301;BA.debugLine="img.SetImage(imgKey)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.pdfimage.class, "_setimage" /*RemoteObject*/ ,(Object)(_imgkey));
 BA.debugLineNum = 302;BA.debugLine="Return img";
Debug.JustUpdateDeviceLine();
if (true) return _img;
 BA.debugLineNum = 303;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlist(RemoteObject __ref,RemoteObject _typeof) throws Exception{
try {
		Debug.PushSubsStack("CreateList (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,414);
if (RapidSub.canDelegate("createlist")) { return __ref.runUserSub(false, "pdfmaker","createlist", __ref, _typeof);}
RemoteObject _lstof = RemoteObject.declareNull("b4j.example.pdflist");
Debug.locals.put("typeOf", _typeof);
 BA.debugLineNum = 414;BA.debugLine="Sub CreateList(typeOf As String) As PDFList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 416;BA.debugLine="Dim lstOf As PDFList";
Debug.JustUpdateDeviceLine();
_lstof = RemoteObject.createNew ("b4j.example.pdflist");Debug.locals.put("lstOf", _lstof);
 BA.debugLineNum = 417;BA.debugLine="lstOf.Initialize(typeOf)";
Debug.JustUpdateDeviceLine();
_lstof.runClassMethod (b4j.example.pdflist.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_typeof));
 BA.debugLineNum = 418;BA.debugLine="Return lstOf";
Debug.JustUpdateDeviceLine();
if (true) return _lstof;
 BA.debugLineNum = 419;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createparagraphs(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateParagraphs (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("createparagraphs")) { return __ref.runUserSub(false, "pdfmaker","createparagraphs", __ref);}
RemoteObject _stack = RemoteObject.declareNull("b4j.example.pdfparagraphs");
 BA.debugLineNum = 398;BA.debugLine="Sub CreateParagraphs As PDFParagraphs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 400;BA.debugLine="Dim stack As PDFParagraphs";
Debug.JustUpdateDeviceLine();
_stack = RemoteObject.createNew ("b4j.example.pdfparagraphs");Debug.locals.put("stack", _stack);
 BA.debugLineNum = 401;BA.debugLine="stack.Initialize";
Debug.JustUpdateDeviceLine();
_stack.runClassMethod (b4j.example.pdfparagraphs.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 402;BA.debugLine="Return stack";
Debug.JustUpdateDeviceLine();
if (true) return _stack;
 BA.debugLineNum = 403;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createqrcode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateQRCode (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("createqrcode")) { return __ref.runUserSub(false, "pdfmaker","createqrcode", __ref);}
RemoteObject _qrcode = RemoteObject.declareNull("b4j.example.pdfqrcode");
 BA.debugLineNum = 382;BA.debugLine="Sub CreateQRCode As PDFQRCode";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 384;BA.debugLine="Dim qrcode As PDFQRCode";
Debug.JustUpdateDeviceLine();
_qrcode = RemoteObject.createNew ("b4j.example.pdfqrcode");Debug.locals.put("qrcode", _qrcode);
 BA.debugLineNum = 385;BA.debugLine="qrcode.Initialize";
Debug.JustUpdateDeviceLine();
_qrcode.runClassMethod (b4j.example.pdfqrcode.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 386;BA.debugLine="Return qrcode";
Debug.JustUpdateDeviceLine();
if (true) return _qrcode;
 BA.debugLineNum = 387;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrow(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateRow (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("createrow")) { return __ref.runUserSub(false, "pdfmaker","createrow", __ref);}
RemoteObject _row = RemoteObject.declareNull("b4j.example.pdfrow");
 BA.debugLineNum = 281;BA.debugLine="Sub CreateRow As PDFRow";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 283;BA.debugLine="Dim row As PDFRow";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.createNew ("b4j.example.pdfrow");Debug.locals.put("row", _row);
 BA.debugLineNum = 284;BA.debugLine="row.Initialize";
Debug.JustUpdateDeviceLine();
_row.runClassMethod (b4j.example.pdfrow.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 285;BA.debugLine="Return row";
Debug.JustUpdateDeviceLine();
if (true) return _row;
 BA.debugLineNum = 286;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstack(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateStack (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,390);
if (RapidSub.canDelegate("createstack")) { return __ref.runUserSub(false, "pdfmaker","createstack", __ref);}
RemoteObject _stack = RemoteObject.declareNull("b4j.example.pdfstack");
 BA.debugLineNum = 390;BA.debugLine="Sub CreateStack As PDFStack";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 392;BA.debugLine="Dim stack As PDFStack";
Debug.JustUpdateDeviceLine();
_stack = RemoteObject.createNew ("b4j.example.pdfstack");Debug.locals.put("stack", _stack);
 BA.debugLineNum = 393;BA.debugLine="stack.Initialize";
Debug.JustUpdateDeviceLine();
_stack.runClassMethod (b4j.example.pdfstack.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 394;BA.debugLine="Return stack";
Debug.JustUpdateDeviceLine();
if (true) return _stack;
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstyle(RemoteObject __ref,RemoteObject _name) throws Exception{
try {
		Debug.PushSubsStack("CreateStyle (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,437);
if (RapidSub.canDelegate("createstyle")) { return __ref.runUserSub(false, "pdfmaker","createstyle", __ref, _name);}
RemoteObject _style = RemoteObject.declareNull("b4j.example.pdfstyle");
Debug.locals.put("name", _name);
 BA.debugLineNum = 437;BA.debugLine="Sub CreateStyle(name As String) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 439;BA.debugLine="Dim Style As PDFStyle";
Debug.JustUpdateDeviceLine();
_style = RemoteObject.createNew ("b4j.example.pdfstyle");Debug.locals.put("Style", _style);
 BA.debugLineNum = 440;BA.debugLine="Style.Initialize";
Debug.JustUpdateDeviceLine();
_style.runClassMethod (b4j.example.pdfstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 441;BA.debugLine="Style.name = name";
Debug.JustUpdateDeviceLine();
_style.setField ("_name" /*RemoteObject*/ ,_name);
 BA.debugLineNum = 442;BA.debugLine="Return Style";
Debug.JustUpdateDeviceLine();
if (true) return _style;
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstyleonly(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateStyleOnly (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("createstyleonly")) { return __ref.runUserSub(false, "pdfmaker","createstyleonly", __ref);}
RemoteObject _stl = RemoteObject.declareNull("b4j.example.pdfstyle");
 BA.debugLineNum = 446;BA.debugLine="Sub CreateStyleOnly As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 448;BA.debugLine="Dim stl As PDFStyle";
Debug.JustUpdateDeviceLine();
_stl = RemoteObject.createNew ("b4j.example.pdfstyle");Debug.locals.put("stl", _stl);
 BA.debugLineNum = 449;BA.debugLine="stl.Initialize";
Debug.JustUpdateDeviceLine();
_stl.runClassMethod (b4j.example.pdfstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 450;BA.debugLine="Return stl";
Debug.JustUpdateDeviceLine();
if (true) return _stl;
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "pdfmaker","createtable", __ref);}
RemoteObject _tbl = RemoteObject.declareNull("b4j.example.pdftable");
 BA.debugLineNum = 289;BA.debugLine="Sub CreateTable As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 291;BA.debugLine="Dim tbl As PDFTable";
Debug.JustUpdateDeviceLine();
_tbl = RemoteObject.createNew ("b4j.example.pdftable");Debug.locals.put("tbl", _tbl);
 BA.debugLineNum = 292;BA.debugLine="tbl.Initialize";
Debug.JustUpdateDeviceLine();
_tbl.runClassMethod (b4j.example.pdftable.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 293;BA.debugLine="Return tbl";
Debug.JustUpdateDeviceLine();
if (true) return _tbl;
 BA.debugLineNum = 294;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtext(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("CreateText (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,454);
if (RapidSub.canDelegate("createtext")) { return __ref.runUserSub(false, "pdfmaker","createtext", __ref, _txt);}
RemoteObject _cnt = RemoteObject.declareNull("b4j.example.pdftext");
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 454;BA.debugLine="Sub CreateText(txt As String) As PDFText";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 456;BA.debugLine="Dim cnt As PDFText";
Debug.JustUpdateDeviceLine();
_cnt = RemoteObject.createNew ("b4j.example.pdftext");Debug.locals.put("cnt", _cnt);
 BA.debugLineNum = 457;BA.debugLine="cnt.Initialize";
Debug.JustUpdateDeviceLine();
_cnt.runClassMethod (b4j.example.pdftext.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 458;BA.debugLine="cnt.Append(txt)";
Debug.JustUpdateDeviceLine();
_cnt.runClassMethod (b4j.example.pdftext.class, "_append" /*RemoteObject*/ ,(Object)(_txt));
 BA.debugLineNum = 459;BA.debugLine="Return cnt";
Debug.JustUpdateDeviceLine();
if (true) return _cnt;
 BA.debugLineNum = 460;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtoc(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateToC (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("createtoc")) { return __ref.runUserSub(false, "pdfmaker","createtoc", __ref);}
RemoteObject _toc = RemoteObject.declareNull("b4j.example.pdftoc");
 BA.debugLineNum = 263;BA.debugLine="Sub CreateToC As PDFToC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 265;BA.debugLine="Dim toc As PDFToC";
Debug.JustUpdateDeviceLine();
_toc = RemoteObject.createNew ("b4j.example.pdftoc");Debug.locals.put("toc", _toc);
 BA.debugLineNum = 266;BA.debugLine="toc.Initialize";
Debug.JustUpdateDeviceLine();
_toc.runClassMethod (b4j.example.pdftoc.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 267;BA.debugLine="Return toc";
Debug.JustUpdateDeviceLine();
if (true) return _toc;
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Download (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,488);
if (RapidSub.canDelegate("download")) { return __ref.runUserSub(false, "pdfmaker","download", __ref, _filename);}
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 488;BA.debugLine="Sub Download(fileName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 490;BA.debugLine="fName = fileName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fname" /*RemoteObject*/ ,_filename);
 BA.debugLineNum = 491;BA.debugLine="action = \"download\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_action" /*RemoteObject*/ ,BA.ObjectToString("download"));
 BA.debugLineNum = 492;BA.debugLine="Build";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filesareready(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FilesAreReady (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,592);
if (RapidSub.canDelegate("filesareready")) { return __ref.runUserSub(false, "pdfmaker","filesareready", __ref);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _dataurl = RemoteObject.createImmutable("");
RemoteObject _data = RemoteObject.declareNull("Object");
RemoteObject _res = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _prom = RemoteObject.declareNull("com.ab.banano.BANanoPromise");
 BA.debugLineNum = 592;BA.debugLine="private Sub FilesAreReady()";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 593;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 595;BA.debugLine="If files.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_files" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 597;BA.debugLine="For Each k As String In Blobs.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = __ref.getField(false,"_blobs" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 599;BA.debugLine="Dim v As String = fileKeys.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(__ref.getField(false,"_filekeys" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 600;BA.debugLine="Dim DataUrl As String = Blobs.Get(k)";
Debug.JustUpdateDeviceLine();
_dataurl = BA.ObjectToString(__ref.getField(false,"_blobs" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k))));Debug.locals.put("DataUrl", _dataurl);Debug.locals.put("DataUrl", _dataurl);
 BA.debugLineNum = 601;BA.debugLine="images.Put(v, DataUrl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_images" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_v)),(Object)((_dataurl)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 603;BA.debugLine="If images.Size > 0 Then docDefinition.Put(\"ima";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_images" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("images"))),(Object)((__ref.getField(false,"_images" /*RemoteObject*/ ).getObject())));};
 };
 BA.debugLineNum = 606;BA.debugLine="mJSON = BANano.ToJson(docDefinition)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mjson" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).getObject())))));
 BA.debugLineNum = 607;BA.debugLine="mJSONPretty = BANano.RunJavascriptMethod(\"JSON.st";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mjsonpretty" /*RemoteObject*/ ,BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunJavascriptMethod",(Object)(BA.ObjectToString("JSON.stringify")),(Object)(pdfmaker.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).getObject()),pdfmaker.__c.getField(false,"Null"),RemoteObject.createImmutable((4))})))))));
 BA.debugLineNum = 609;BA.debugLine="Dim data As Object";
Debug.JustUpdateDeviceLine();
_data = RemoteObject.createNew ("Object");Debug.locals.put("data", _data);
 BA.debugLineNum = 610;BA.debugLine="Dim res As BANanoObject";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("res", _res);
 BA.debugLineNum = 611;BA.debugLine="Dim prom As BANanoPromise";
Debug.JustUpdateDeviceLine();
_prom = RemoteObject.createNew ("com.ab.banano.BANanoPromise");Debug.locals.put("prom", _prom);
 BA.debugLineNum = 612;BA.debugLine="Select Case action";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_action" /*RemoteObject*/ ),BA.ObjectToString("download"),BA.ObjectToString("print"),BA.ObjectToString("open"),BA.ObjectToString("upload"),BA.ObjectToString("getDataUrl"),BA.ObjectToString("getBlob"),BA.ObjectToString("getBuffer"),BA.ObjectToString("getBase64"))) {
case 0: {
 BA.debugLineNum = 614;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createPdf")),(Object)((__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).getObject()))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("download")),(Object)((__ref.getField(true,"_fname" /*RemoteObject*/ ))));
 break; }
case 1: {
 BA.debugLineNum = 616;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createPdf")),(Object)((__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).getObject()))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("print")),(Object)(pdfmaker.__c.getField(false,"Null")));
 break; }
case 2: {
 BA.debugLineNum = 618;BA.debugLine="pdf.RunMethod(\"createPdf\", docDefinition).RunMet";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createPdf")),(Object)((__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).getObject()))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("open")),(Object)(pdfmaker.__c.getField(false,"Null")));
 break; }
case 3: {
 BA.debugLineNum = 620;BA.debugLine="res = pdf.RunMethod(\"createPdf\", docDefinition)";
Debug.JustUpdateDeviceLine();
_res = __ref.getField(false,"_pdf" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createPdf")),(Object)((__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).getObject())));Debug.locals.put("res", _res);
 BA.debugLineNum = 621;BA.debugLine="prom = res.RunMethod(\"getBlob\", data)";
Debug.JustUpdateDeviceLine();
_prom.setObject(_res.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getBlob")),(Object)(_data)).getObject());
 BA.debugLineNum = 622;BA.debugLine="prom.Then(data)";
Debug.JustUpdateDeviceLine();
_prom.runVoidMethod ("Then",(Object)(_data));
 BA.debugLineNum = 623;BA.debugLine="BANano.CallSub(Me, \"forUpload\", data)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(__ref),(Object)(BA.ObjectToString("forUpload")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _data));
 BA.debugLineNum = 624;BA.debugLine="prom.End";
Debug.JustUpdateDeviceLine();
_prom.runVoidMethod ("End");
 break; }
case 4: 
case 5: 
case 6: 
case 7: {
 BA.debugLineNum = 626;BA.debugLine="res = pdf.RunMethod(\"createPdf\", docDefinition)";
Debug.JustUpdateDeviceLine();
_res = __ref.getField(false,"_pdf" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("createPdf")),(Object)((__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).getObject())));Debug.locals.put("res", _res);
 BA.debugLineNum = 627;BA.debugLine="prom = res.RunMethod(action, data)";
Debug.JustUpdateDeviceLine();
_prom.setObject(_res.runMethod(false,"RunMethod",(Object)(__ref.getField(true,"_action" /*RemoteObject*/ )),(Object)(_data)).getObject());
 BA.debugLineNum = 628;BA.debugLine="prom.Then(data)";
Debug.JustUpdateDeviceLine();
_prom.runVoidMethod ("Then",(Object)(_data));
 BA.debugLineNum = 629;BA.debugLine="BANano.CallSub(Me, \"forReading\", data)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(__ref),(Object)(BA.ObjectToString("forReading")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _data));
 BA.debugLineNum = 630;BA.debugLine="prom.End";
Debug.JustUpdateDeviceLine();
_prom.runVoidMethod ("End");
 break; }
}
;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e36) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e36.toString()); BA.debugLineNum = 633;BA.debugLine="Log(LastException)";
Debug.JustUpdateDeviceLine();
pdfmaker.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(pdfmaker.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _forreading(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("forReading (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,577);
if (RapidSub.canDelegate("forreading")) { return __ref.runUserSub(false, "pdfmaker","forreading", __ref, _data);}
Debug.locals.put("data", _data);
 BA.debugLineNum = 577;BA.debugLine="private Sub forReading(data As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 579;BA.debugLine="BANano.CallSub(eventHandler, eventMethod, data)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_eventmethod" /*RemoteObject*/ )),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _data));
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _forupload(RemoteObject __ref,RemoteObject _data) throws Exception{
try {
		Debug.PushSubsStack("forUpload (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,583);
if (RapidSub.canDelegate("forupload")) { return __ref.runUserSub(false, "pdfmaker","forupload", __ref, _data);}
RemoteObject _formdata = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("data", _data);
 BA.debugLineNum = 583;BA.debugLine="private Sub forUpload(data As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 585;BA.debugLine="Dim formData As BANanoObject";
Debug.JustUpdateDeviceLine();
_formdata = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("formData", _formdata);
 BA.debugLineNum = 586;BA.debugLine="formData.Initialize2(\"FormData\",Null)";
Debug.JustUpdateDeviceLine();
_formdata.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("FormData")),(Object)(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 587;BA.debugLine="formData.RunMethod(\"append\", Array(\"upload\", data";
Debug.JustUpdateDeviceLine();
_formdata.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("append")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("upload")),_data,(__ref.getField(true,"_fname" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 588;BA.debugLine="BANano.CallSub(eventHandler, eventMethod, formDat";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("CallSub",(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_eventmethod" /*RemoteObject*/ )),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _formdata.getObject()));
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbase64(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("GetBase64 (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,666);
if (RapidSub.canDelegate("getbase64")) { return __ref.runUserSub(false, "pdfmaker","getbase64", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 666;BA.debugLine="Sub GetBase64(module As Object, methodName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 668;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 669;BA.debugLine="eventMethod = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventmethod" /*RemoteObject*/ ,_methodname.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 670;BA.debugLine="action = \"getBase64\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_action" /*RemoteObject*/ ,BA.ObjectToString("getBase64"));
 BA.debugLineNum = 671;BA.debugLine="Build";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 672;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getblob(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("GetBlob (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,648);
if (RapidSub.canDelegate("getblob")) { return __ref.runUserSub(false, "pdfmaker","getblob", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 648;BA.debugLine="Sub GetBlob(module As Object, methodName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 650;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 651;BA.debugLine="eventMethod = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventmethod" /*RemoteObject*/ ,_methodname.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 652;BA.debugLine="action = \"getBlob\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_action" /*RemoteObject*/ ,BA.ObjectToString("getBlob"));
 BA.debugLineNum = 653;BA.debugLine="Build";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 654;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbuffer(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("GetBuffer (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,657);
if (RapidSub.canDelegate("getbuffer")) { return __ref.runUserSub(false, "pdfmaker","getbuffer", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 657;BA.debugLine="Sub GetBuffer(module As Object, methodName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 659;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 660;BA.debugLine="eventMethod = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventmethod" /*RemoteObject*/ ,_methodname.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 661;BA.debugLine="action = \"getBuffer\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_action" /*RemoteObject*/ ,BA.ObjectToString("getBuffer"));
 BA.debugLineNum = 662;BA.debugLine="Build";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 663;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdataurl(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("GetDataURL (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,639);
if (RapidSub.canDelegate("getdataurl")) { return __ref.runUserSub(false, "pdfmaker","getdataurl", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 639;BA.debugLine="Sub GetDataURL(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 641;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 642;BA.debugLine="eventMethod = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventmethod" /*RemoteObject*/ ,_methodname.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 643;BA.debugLine="action = \"getDataUrl\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_action" /*RemoteObject*/ ,BA.ObjectToString("getDataUrl"));
 BA.debugLineNum = 644;BA.debugLine="Build";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 645;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getfilefromserver(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetFileFromServer (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,541);
if (RapidSub.canDelegate("getfilefromserver")) { return __ref.runUserSub(false, "pdfmaker","getfilefromserver", __ref, _filename);}
RemoteObject _response = RemoteObject.declareNull("com.ab.banano.BANanoFetchResponse");
RemoteObject _blob = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _fetch1 = RemoteObject.declareNull("com.ab.banano.BANanoFetch");
RemoteObject _filereader = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _event = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _target = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _dataurl = RemoteObject.createImmutable("");
Debug.locals.put("FileName", _filename);
 BA.debugLineNum = 541;BA.debugLine="private Sub GetFileFromServer(FileName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 543;BA.debugLine="Dim Response As BANanoFetchResponse";
Debug.JustUpdateDeviceLine();
_response = RemoteObject.createNew ("com.ab.banano.BANanoFetchResponse");Debug.locals.put("Response", _response);
 BA.debugLineNum = 544;BA.debugLine="Dim Blob As BANanoObject";
Debug.JustUpdateDeviceLine();
_blob = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("Blob", _blob);
 BA.debugLineNum = 547;BA.debugLine="Dim fetch1 As BANanoFetch";
Debug.JustUpdateDeviceLine();
_fetch1 = RemoteObject.createNew ("com.ab.banano.BANanoFetch");Debug.locals.put("fetch1", _fetch1);
 BA.debugLineNum = 548;BA.debugLine="fetch1.Initialize(FileName, Null)";
Debug.JustUpdateDeviceLine();
_fetch1.runVoidMethod ("Initialize",(Object)(_filename),(Object)((pdfmaker.__c.getField(false,"Null"))));
 BA.debugLineNum = 549;BA.debugLine="fetch1.Then(Response)";
Debug.JustUpdateDeviceLine();
_fetch1.runVoidMethod ("Then",(Object)((_response)));
 BA.debugLineNum = 551;BA.debugLine="fetch1.Return(Response.Blob)";
Debug.JustUpdateDeviceLine();
_fetch1.runVoidMethod ("Return",(Object)(_response.runMethod(false,"Blob")));
 BA.debugLineNum = 552;BA.debugLine="fetch1.Then(Blob)";
Debug.JustUpdateDeviceLine();
_fetch1.runVoidMethod ("Then",(Object)((_blob.getObject())));
 BA.debugLineNum = 555;BA.debugLine="Dim FileReader As BANanoObject";
Debug.JustUpdateDeviceLine();
_filereader = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("FileReader", _filereader);
 BA.debugLineNum = 556;BA.debugLine="FileReader.Initialize2(\"FileReader\", Null)";
Debug.JustUpdateDeviceLine();
_filereader.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("FileReader")),(Object)(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 557;BA.debugLine="Dim event As BANanoEvent";
Debug.JustUpdateDeviceLine();
_event = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("event", _event);
 BA.debugLineNum = 559;BA.debugLine="FileReader.AddEventListenerOpen(\"onload\", Array(e";
Debug.JustUpdateDeviceLine();
_filereader.runVoidMethod ("AddEventListenerOpen",(Object)(BA.ObjectToString("onload")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_event)}))));
 BA.debugLineNum = 561;BA.debugLine="Dim Target As BANanoObject = event.OtherField(\"ta";
Debug.JustUpdateDeviceLine();
_target = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_target = _event.runMethod(false,"OtherField",(Object)(RemoteObject.createImmutable("target")));Debug.locals.put("Target", _target);Debug.locals.put("Target", _target);
 BA.debugLineNum = 562;BA.debugLine="Dim DataUrl As String = Target.GetField(\"result\")";
Debug.JustUpdateDeviceLine();
_dataurl = BA.ObjectToString(_target.runMethod(false,"GetField",(Object)(RemoteObject.createImmutable("result"))).runMethod(false,"Result"));Debug.locals.put("DataUrl", _dataurl);Debug.locals.put("DataUrl", _dataurl);
 BA.debugLineNum = 564;BA.debugLine="Blobs.Put(FileName, DataUrl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_blobs" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_filename)),(Object)((_dataurl)));
 BA.debugLineNum = 566;BA.debugLine="If Blobs.Size = NumFiles Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_blobs" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, __ref.getField(true,"_numfiles" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 567;BA.debugLine="FilesAreReady";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_filesareready" /*RemoteObject*/ );
 };
 BA.debugLineNum = 570;BA.debugLine="FileReader.CloseEventListener";
Debug.JustUpdateDeviceLine();
_filereader.runVoidMethod ("CloseEventListener");
 BA.debugLineNum = 572;BA.debugLine="FileReader.RunMethod(\"readAsDataURL\", Blob)";
Debug.JustUpdateDeviceLine();
_filereader.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("readAsDataURL")),(Object)((_blob.getObject())));
 BA.debugLineNum = 573;BA.debugLine="fetch1.End ' always end a fetch with this!";
Debug.JustUpdateDeviceLine();
_fetch1.runVoidMethod ("End");
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getformdata(RemoteObject __ref,RemoteObject _data,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("GetFormData (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,685);
if (RapidSub.canDelegate("getformdata")) { return __ref.runUserSub(false, "pdfmaker","getformdata", __ref, _data, _filename);}
RemoteObject _formdata = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("data", _data);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 685;BA.debugLine="Sub GetFormData(data As Object, fileName As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 687;BA.debugLine="Dim formData As BANanoObject";
Debug.JustUpdateDeviceLine();
_formdata = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("formData", _formdata);
 BA.debugLineNum = 688;BA.debugLine="formData.Initialize2(\"FormData\",Null)";
Debug.JustUpdateDeviceLine();
_formdata.runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("FormData")),(Object)(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 689;BA.debugLine="formData.RunMethod(\"append\", Array(\"upload\", data";
Debug.JustUpdateDeviceLine();
_formdata.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("append")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {RemoteObject.createImmutable(("upload")),_data,(_filename)}))));
 BA.debugLineNum = 690;BA.debugLine="Return formData";
Debug.JustUpdateDeviceLine();
if (true) return _formdata;
 BA.debugLineNum = 691;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getjson(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getJSON (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,478);
if (RapidSub.canDelegate("getjson")) { return __ref.runUserSub(false, "pdfmaker","getjson", __ref);}
 BA.debugLineNum = 478;BA.debugLine="Sub getJSON As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 480;BA.debugLine="Return mJSON";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mjson" /*RemoteObject*/ );
 BA.debugLineNum = 481;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getjsonpretty(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getJSONPretty (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,483);
if (RapidSub.canDelegate("getjsonpretty")) { return __ref.runUserSub(false, "pdfmaker","getjsonpretty", __ref);}
 BA.debugLineNum = 483;BA.debugLine="Sub getJSONPretty As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 484;BA.debugLine="Return mJSONPretty";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_mjsonpretty" /*RemoteObject*/ );
 BA.debugLineNum = 485;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstyle(RemoteObject __ref,RemoteObject _rec) throws Exception{
try {
		Debug.PushSubsStack("GetStyle (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("getstyle")) { return __ref.runUserSub(false, "pdfmaker","getstyle", __ref, _rec);}
RemoteObject _name = RemoteObject.createImmutable("");
RemoteObject _bold = RemoteObject.createImmutable(false);
RemoteObject _italics = RemoteObject.createImmutable(false);
RemoteObject _alignment = RemoteObject.createImmutable("");
RemoteObject _fontsize = RemoteObject.createImmutable(0);
RemoteObject _marginleft = RemoteObject.createImmutable(0);
RemoteObject _margintop = RemoteObject.createImmutable(0);
RemoteObject _marginright = RemoteObject.createImmutable(0);
RemoteObject _marginbottom = RemoteObject.createImmutable(0);
RemoteObject _noborder = RemoteObject.createImmutable(false);
RemoteObject _borderleft = RemoteObject.createImmutable(false);
RemoteObject _bordertop = RemoteObject.createImmutable(false);
RemoteObject _borderright = RemoteObject.createImmutable(false);
RemoteObject _borderbottom = RemoteObject.createImmutable(false);
RemoteObject _width = RemoteObject.createImmutable(0);
RemoteObject _height = RemoteObject.createImmutable(0);
RemoteObject _color = RemoteObject.createImmutable("");
RemoteObject _fillcolor = RemoteObject.createImmutable("");
RemoteObject _background = RemoteObject.createImmutable("");
RemoteObject _opacity = RemoteObject.createImmutable(0);
RemoteObject _angle = RemoteObject.createImmutable(0);
RemoteObject _columngap = RemoteObject.createImmutable(0);
RemoteObject _decoration = RemoteObject.createImmutable("");
RemoteObject _decorationstyle = RemoteObject.createImmutable("");
RemoteObject _decorationcolor = RemoteObject.createImmutable("");
RemoteObject _applymargins = RemoteObject.createImmutable(false);
RemoteObject _applyborders = RemoteObject.createImmutable(false);
RemoteObject _st = RemoteObject.declareNull("b4j.example.pdfstyle");
Debug.locals.put("rec", _rec);
 BA.debugLineNum = 115;BA.debugLine="Sub GetStyle(rec As Map) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="Dim name As String = rec.Get(\"name\")";
Debug.JustUpdateDeviceLine();
_name = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("name")))));Debug.locals.put("name", _name);Debug.locals.put("name", _name);
 BA.debugLineNum = 118;BA.debugLine="Dim bold As Boolean = rec.get(\"bold\")";
Debug.JustUpdateDeviceLine();
_bold = BA.ObjectToBoolean(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bold")))));Debug.locals.put("bold", _bold);Debug.locals.put("bold", _bold);
 BA.debugLineNum = 119;BA.debugLine="Dim italics As Boolean = rec.Get(\"italics\")";
Debug.JustUpdateDeviceLine();
_italics = BA.ObjectToBoolean(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("italics")))));Debug.locals.put("italics", _italics);Debug.locals.put("italics", _italics);
 BA.debugLineNum = 120;BA.debugLine="Dim alignment As String = rec.Get(\"alignment\")";
Debug.JustUpdateDeviceLine();
_alignment = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("alignment")))));Debug.locals.put("alignment", _alignment);Debug.locals.put("alignment", _alignment);
 BA.debugLineNum = 121;BA.debugLine="Dim fontSize As Int = rec.Get(\"fontSize\")";
Debug.JustUpdateDeviceLine();
_fontsize = BA.numberCast(int.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fontSize")))));Debug.locals.put("fontSize", _fontsize);Debug.locals.put("fontSize", _fontsize);
 BA.debugLineNum = 122;BA.debugLine="Dim marginleft As Int = rec.Get(\"marginleft\")";
Debug.JustUpdateDeviceLine();
_marginleft = BA.numberCast(int.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("marginleft")))));Debug.locals.put("marginleft", _marginleft);Debug.locals.put("marginleft", _marginleft);
 BA.debugLineNum = 123;BA.debugLine="Dim margintop As Int = rec.Get(\"margintop\")";
Debug.JustUpdateDeviceLine();
_margintop = BA.numberCast(int.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("margintop")))));Debug.locals.put("margintop", _margintop);Debug.locals.put("margintop", _margintop);
 BA.debugLineNum = 124;BA.debugLine="Dim marginright As Int = rec.Get(\"marginright\")";
Debug.JustUpdateDeviceLine();
_marginright = BA.numberCast(int.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("marginright")))));Debug.locals.put("marginright", _marginright);Debug.locals.put("marginright", _marginright);
 BA.debugLineNum = 125;BA.debugLine="Dim marginbottom As Int = rec.Get(\"marginbottom\")";
Debug.JustUpdateDeviceLine();
_marginbottom = BA.numberCast(int.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("marginbottom")))));Debug.locals.put("marginbottom", _marginbottom);Debug.locals.put("marginbottom", _marginbottom);
 BA.debugLineNum = 126;BA.debugLine="Dim noborder As Boolean = rec.Get(\"noborder\")";
Debug.JustUpdateDeviceLine();
_noborder = BA.ObjectToBoolean(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("noborder")))));Debug.locals.put("noborder", _noborder);Debug.locals.put("noborder", _noborder);
 BA.debugLineNum = 127;BA.debugLine="Dim borderleft As Boolean = rec.get(\"borderleft\")";
Debug.JustUpdateDeviceLine();
_borderleft = BA.ObjectToBoolean(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("borderleft")))));Debug.locals.put("borderleft", _borderleft);Debug.locals.put("borderleft", _borderleft);
 BA.debugLineNum = 128;BA.debugLine="Dim bordertop As Boolean = rec.get(\"bordertop\")";
Debug.JustUpdateDeviceLine();
_bordertop = BA.ObjectToBoolean(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("bordertop")))));Debug.locals.put("bordertop", _bordertop);Debug.locals.put("bordertop", _bordertop);
 BA.debugLineNum = 129;BA.debugLine="Dim borderright As Boolean = rec.get(\"borderright";
Debug.JustUpdateDeviceLine();
_borderright = BA.ObjectToBoolean(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("borderright")))));Debug.locals.put("borderright", _borderright);Debug.locals.put("borderright", _borderright);
 BA.debugLineNum = 130;BA.debugLine="Dim borderbottom As Boolean = rec.get(\"borderbott";
Debug.JustUpdateDeviceLine();
_borderbottom = BA.ObjectToBoolean(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("borderbottom")))));Debug.locals.put("borderbottom", _borderbottom);Debug.locals.put("borderbottom", _borderbottom);
 BA.debugLineNum = 131;BA.debugLine="Dim width As Int = rec.Get(\"width\")";
Debug.JustUpdateDeviceLine();
_width = BA.numberCast(int.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("width")))));Debug.locals.put("width", _width);Debug.locals.put("width", _width);
 BA.debugLineNum = 132;BA.debugLine="Dim height As Int = rec.get(\"height\")";
Debug.JustUpdateDeviceLine();
_height = BA.numberCast(int.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("height")))));Debug.locals.put("height", _height);Debug.locals.put("height", _height);
 BA.debugLineNum = 133;BA.debugLine="Dim color As String = rec.Get(\"color\")";
Debug.JustUpdateDeviceLine();
_color = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("color")))));Debug.locals.put("color", _color);Debug.locals.put("color", _color);
 BA.debugLineNum = 134;BA.debugLine="Dim fillColor As String = rec.get(\"fillColor\")";
Debug.JustUpdateDeviceLine();
_fillcolor = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fillColor")))));Debug.locals.put("fillColor", _fillcolor);Debug.locals.put("fillColor", _fillcolor);
 BA.debugLineNum = 135;BA.debugLine="Dim background As String = rec.Get(\"background\")";
Debug.JustUpdateDeviceLine();
_background = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("background")))));Debug.locals.put("background", _background);Debug.locals.put("background", _background);
 BA.debugLineNum = 136;BA.debugLine="Dim opacity As Double = rec.Get(\"opacity\")";
Debug.JustUpdateDeviceLine();
_opacity = BA.numberCast(double.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("opacity")))));Debug.locals.put("opacity", _opacity);Debug.locals.put("opacity", _opacity);
 BA.debugLineNum = 137;BA.debugLine="Dim angle As Int = rec.get(\"angle\")";
Debug.JustUpdateDeviceLine();
_angle = BA.numberCast(int.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("angle")))));Debug.locals.put("angle", _angle);Debug.locals.put("angle", _angle);
 BA.debugLineNum = 138;BA.debugLine="Dim columnGap As Int = rec.get(\"columnGap\")";
Debug.JustUpdateDeviceLine();
_columngap = BA.numberCast(int.class, _rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("columnGap")))));Debug.locals.put("columnGap", _columngap);Debug.locals.put("columnGap", _columngap);
 BA.debugLineNum = 139;BA.debugLine="Dim decoration As String = rec.Get(\"decoration\")";
Debug.JustUpdateDeviceLine();
_decoration = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("decoration")))));Debug.locals.put("decoration", _decoration);Debug.locals.put("decoration", _decoration);
 BA.debugLineNum = 140;BA.debugLine="If decoration = \"none\" Then decoration = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_decoration,BA.ObjectToString("none"))) { 
_decoration = BA.ObjectToString("");Debug.locals.put("decoration", _decoration);};
 BA.debugLineNum = 141;BA.debugLine="Dim decorationStyle As String = rec.Get(\"decorati";
Debug.JustUpdateDeviceLine();
_decorationstyle = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("decorationStyle")))));Debug.locals.put("decorationStyle", _decorationstyle);Debug.locals.put("decorationStyle", _decorationstyle);
 BA.debugLineNum = 142;BA.debugLine="If decorationStyle = \"none\" Then decorationStyle";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_decorationstyle,BA.ObjectToString("none"))) { 
_decorationstyle = BA.ObjectToString("");Debug.locals.put("decorationStyle", _decorationstyle);};
 BA.debugLineNum = 143;BA.debugLine="Dim decorationColor As String = rec.Get(\"decorati";
Debug.JustUpdateDeviceLine();
_decorationcolor = BA.ObjectToString(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("decorationColor")))));Debug.locals.put("decorationColor", _decorationcolor);Debug.locals.put("decorationColor", _decorationcolor);
 BA.debugLineNum = 144;BA.debugLine="Dim applymargins As Boolean = rec.Get(\"applymargi";
Debug.JustUpdateDeviceLine();
_applymargins = BA.ObjectToBoolean(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applymargins")))));Debug.locals.put("applymargins", _applymargins);Debug.locals.put("applymargins", _applymargins);
 BA.debugLineNum = 145;BA.debugLine="Dim applyborders As Boolean = rec.Get(\"applyborde";
Debug.JustUpdateDeviceLine();
_applyborders = BA.ObjectToBoolean(_rec.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("applyborders")))));Debug.locals.put("applyborders", _applyborders);Debug.locals.put("applyborders", _applyborders);
 BA.debugLineNum = 147;BA.debugLine="Dim st As PDFStyle";
Debug.JustUpdateDeviceLine();
_st = RemoteObject.createNew ("b4j.example.pdfstyle");Debug.locals.put("st", _st);
 BA.debugLineNum = 148;BA.debugLine="st.Initialize";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 149;BA.debugLine="st.SetName(name)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setname" /*RemoteObject*/ ,(Object)(_name));
 BA.debugLineNum = 150;BA.debugLine="st.SetBold(bold)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setbold" /*RemoteObject*/ ,(Object)(_bold));
 BA.debugLineNum = 151;BA.debugLine="st.SetItalics(italics)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setitalics" /*RemoteObject*/ ,(Object)(_italics));
 BA.debugLineNum = 152;BA.debugLine="Select Case alignment";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_alignment,BA.ObjectToString("alignmentRight"),BA.ObjectToString("alignmentCenter"),BA.ObjectToString("alignmentJustify"))) {
case 0: {
 BA.debugLineNum = 154;BA.debugLine="st.alignmentRight = True";
Debug.JustUpdateDeviceLine();
_st.setField ("_alignmentright" /*RemoteObject*/ ,pdfmaker.__c.getField(true,"True"));
 break; }
case 1: {
 BA.debugLineNum = 156;BA.debugLine="st.alignmentCenter = True";
Debug.JustUpdateDeviceLine();
_st.setField ("_alignmentcenter" /*RemoteObject*/ ,pdfmaker.__c.getField(true,"True"));
 break; }
case 2: {
 BA.debugLineNum = 158;BA.debugLine="st.alignmentJustify = True";
Debug.JustUpdateDeviceLine();
_st.setField ("_alignmentjustify" /*RemoteObject*/ ,pdfmaker.__c.getField(true,"True"));
 break; }
}
;
 BA.debugLineNum = 160;BA.debugLine="st.SetFontSize(fontSize)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setfontsize" /*RemoteObject*/ ,(Object)(_fontsize));
 BA.debugLineNum = 161;BA.debugLine="If applymargins Then";
Debug.JustUpdateDeviceLine();
if (_applymargins.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 162;BA.debugLine="st.SetMargin(marginleft, margintop, marginright,";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setmargin" /*RemoteObject*/ ,(Object)(_marginleft),(Object)(_margintop),(Object)(_marginright),(Object)(_marginbottom));
 };
 BA.debugLineNum = 164;BA.debugLine="If noborder Then";
Debug.JustUpdateDeviceLine();
if (_noborder.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 165;BA.debugLine="st.NoBorder";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_noborder" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 167;BA.debugLine="If applyborders Then";
Debug.JustUpdateDeviceLine();
if (_applyborders.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 168;BA.debugLine="st.SetBorder(borderleft, bordertop, borderright";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setborder" /*RemoteObject*/ ,(Object)(_borderleft),(Object)(_bordertop),(Object)(_borderright),(Object)(_borderbottom));
 };
 };
 BA.debugLineNum = 171;BA.debugLine="st.SetWidth(width)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setwidth" /*RemoteObject*/ ,(Object)(_width));
 BA.debugLineNum = 172;BA.debugLine="st.setheight(height)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setheight" /*RemoteObject*/ ,(Object)(_height));
 BA.debugLineNum = 173;BA.debugLine="st.SetColor(color)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setcolor" /*RemoteObject*/ ,(Object)(_color));
 BA.debugLineNum = 174;BA.debugLine="st.SetFillColor(fillColor)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setfillcolor" /*RemoteObject*/ ,(Object)(_fillcolor));
 BA.debugLineNum = 175;BA.debugLine="st.setbackground(background)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setbackground" /*RemoteObject*/ ,(Object)(_background));
 BA.debugLineNum = 176;BA.debugLine="st.SetOpacity(opacity)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setopacity" /*RemoteObject*/ ,(Object)(_opacity));
 BA.debugLineNum = 177;BA.debugLine="st.SetAngle(angle)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setangle" /*RemoteObject*/ ,(Object)(BA.numberCast(double.class, _angle)));
 BA.debugLineNum = 178;BA.debugLine="st.SetColumnGap(columnGap)";
Debug.JustUpdateDeviceLine();
_st.runClassMethod (b4j.example.pdfstyle.class, "_setcolumngap" /*RemoteObject*/ ,(Object)(_columngap));
 BA.debugLineNum = 179;BA.debugLine="Return st";
Debug.JustUpdateDeviceLine();
if (true) return _st;
 BA.debugLineNum = 180;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfmaker","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 35;BA.debugLine="Public Sub Initialize As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="BANano.DependsOnAsset(\"pdfmake.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("pdfmake.js")));
 BA.debugLineNum = 37;BA.debugLine="BANano.DependsOnAsset(\"vfs_fonts.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("vfs_fonts.js")));
 BA.debugLineNum = 38;BA.debugLine="BANano.DependsOnAsset(\"jquery.media.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("jquery.media.js")));
 BA.debugLineNum = 41;BA.debugLine="pdf.Initialize(\"pdfMake\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_pdf" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("pdfMake"))));
 BA.debugLineNum = 42;BA.debugLine="Blobs.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_blobs" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="styles.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_styles" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="docDefinition.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="content.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="defaultStyle.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultstyle" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 47;BA.debugLine="defaultStyle.name = \"defaultStyle\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaultstyle" /*RemoteObject*/ ).setField ("_name" /*RemoteObject*/ ,BA.ObjectToString("defaultStyle"));
 BA.debugLineNum = 48;BA.debugLine="pageSize = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pagesize" /*RemoteObject*/ ,BA.ObjectToString(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 49;BA.debugLine="pageOrientation = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,BA.ObjectToString(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 50;BA.debugLine="title = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_title" /*RemoteObject*/ ,BA.ObjectToString(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 51;BA.debugLine="author = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_author" /*RemoteObject*/ ,BA.ObjectToString(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 52;BA.debugLine="subject = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_subject" /*RemoteObject*/ ,BA.ObjectToString(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 53;BA.debugLine="keywords = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_keywords" /*RemoteObject*/ ,BA.ObjectToString(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 54;BA.debugLine="creator = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_creator" /*RemoteObject*/ ,BA.ObjectToString(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 55;BA.debugLine="producer = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_producer" /*RemoteObject*/ ,BA.ObjectToString(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 56;BA.debugLine="info.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_info" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="compress = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_compress" /*RemoteObject*/ ,BA.ObjectToBoolean(pdfmaker.__c.getField(false,"Null")));
 BA.debugLineNum = 58;BA.debugLine="security.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 59;BA.debugLine="files.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_files" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 60;BA.debugLine="images.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_images" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="fileKeys.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_filekeys" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="mJSON = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mjson" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _open(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Open (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("open")) { return __ref.runUserSub(false, "pdfmaker","open", __ref);}
 BA.debugLineNum = 533;BA.debugLine="Sub Open";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 535;BA.debugLine="action = \"open\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_action" /*RemoteObject*/ ,BA.ObjectToString("open"));
 BA.debugLineNum = 536;BA.debugLine="Build";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 537;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pagesizes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("PageSizes (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,693);
if (RapidSub.canDelegate("pagesizes")) { return __ref.runUserSub(false, "pdfmaker","pagesizes", __ref);}
RemoteObject _ps = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _stritem = RemoteObject.createImmutable("");
 BA.debugLineNum = 693;BA.debugLine="Sub PageSizes As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 694;BA.debugLine="Dim ps As List";
Debug.JustUpdateDeviceLine();
_ps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("ps", _ps);
 BA.debugLineNum = 695;BA.debugLine="ps.Initialize";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Initialize");
 BA.debugLineNum = 696;BA.debugLine="ps.Add(\"4A0\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("4A0"))));
 BA.debugLineNum = 697;BA.debugLine="ps.Add(\"2A0\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("2A0"))));
 BA.debugLineNum = 698;BA.debugLine="ps.Add(\"A0\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A0"))));
 BA.debugLineNum = 699;BA.debugLine="ps.Add(\"A1\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A1"))));
 BA.debugLineNum = 700;BA.debugLine="ps.Add(\"A2\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A2"))));
 BA.debugLineNum = 701;BA.debugLine="ps.Add(\"A3\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A3"))));
 BA.debugLineNum = 702;BA.debugLine="ps.Add(\"A4\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A4"))));
 BA.debugLineNum = 703;BA.debugLine="ps.Add(\"A5\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A5"))));
 BA.debugLineNum = 704;BA.debugLine="ps.Add(\"A6\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A6"))));
 BA.debugLineNum = 705;BA.debugLine="ps.Add(\"A7\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A7"))));
 BA.debugLineNum = 706;BA.debugLine="ps.Add(\"A8\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A8"))));
 BA.debugLineNum = 707;BA.debugLine="ps.Add(\"A9\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A9"))));
 BA.debugLineNum = 708;BA.debugLine="ps.Add(\"A10\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("A10"))));
 BA.debugLineNum = 709;BA.debugLine="ps.Add(\"B0\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B0"))));
 BA.debugLineNum = 710;BA.debugLine="ps.Add(\"B1\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B1"))));
 BA.debugLineNum = 711;BA.debugLine="ps.Add(\"B2\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B2"))));
 BA.debugLineNum = 712;BA.debugLine="ps.Add(\"B3\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B3"))));
 BA.debugLineNum = 713;BA.debugLine="ps.Add(\"B4\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B4"))));
 BA.debugLineNum = 714;BA.debugLine="ps.Add(\"B5\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B5"))));
 BA.debugLineNum = 715;BA.debugLine="ps.Add(\"B6\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B6"))));
 BA.debugLineNum = 716;BA.debugLine="ps.Add(\"B7\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B7"))));
 BA.debugLineNum = 717;BA.debugLine="ps.Add(\"B8\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B8"))));
 BA.debugLineNum = 718;BA.debugLine="ps.Add(\"B9\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B9"))));
 BA.debugLineNum = 719;BA.debugLine="ps.Add(\"B10\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("B10"))));
 BA.debugLineNum = 720;BA.debugLine="ps.Add(\"C0\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C0"))));
 BA.debugLineNum = 721;BA.debugLine="ps.Add(\"C1\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C1"))));
 BA.debugLineNum = 722;BA.debugLine="ps.Add(\"C2\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C2"))));
 BA.debugLineNum = 723;BA.debugLine="ps.Add(\"C3\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C3"))));
 BA.debugLineNum = 724;BA.debugLine="ps.Add(\"C4\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C4"))));
 BA.debugLineNum = 725;BA.debugLine="ps.Add(\"C5\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C5"))));
 BA.debugLineNum = 726;BA.debugLine="ps.Add(\"C6\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C6"))));
 BA.debugLineNum = 727;BA.debugLine="ps.Add(\"C7\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C7"))));
 BA.debugLineNum = 728;BA.debugLine="ps.Add(\"C8\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C8"))));
 BA.debugLineNum = 729;BA.debugLine="ps.Add(\"C9\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C9"))));
 BA.debugLineNum = 730;BA.debugLine="ps.Add(\"C10\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("C10"))));
 BA.debugLineNum = 731;BA.debugLine="ps.Add(\"RA0\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("RA0"))));
 BA.debugLineNum = 732;BA.debugLine="ps.Add(\"RA1\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("RA1"))));
 BA.debugLineNum = 733;BA.debugLine="ps.Add(\"RA2\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("RA2"))));
 BA.debugLineNum = 734;BA.debugLine="ps.Add(\"RA3\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("RA3"))));
 BA.debugLineNum = 735;BA.debugLine="ps.Add(\"RA4\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("RA4"))));
 BA.debugLineNum = 736;BA.debugLine="ps.Add(\"SRA0\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("SRA0"))));
 BA.debugLineNum = 737;BA.debugLine="ps.Add(\"SRA1\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("SRA1"))));
 BA.debugLineNum = 738;BA.debugLine="ps.Add(\"SRA2\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("SRA2"))));
 BA.debugLineNum = 739;BA.debugLine="ps.Add(\"SRA3\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("SRA3"))));
 BA.debugLineNum = 740;BA.debugLine="ps.Add(\"SRA4\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("SRA4"))));
 BA.debugLineNum = 741;BA.debugLine="ps.Add(\"EXECUTIVE\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("EXECUTIVE"))));
 BA.debugLineNum = 742;BA.debugLine="ps.Add(\"FOLIO\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("FOLIO"))));
 BA.debugLineNum = 743;BA.debugLine="ps.Add(\"LEGAL\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("LEGAL"))));
 BA.debugLineNum = 744;BA.debugLine="ps.Add(\"LETTER\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("LETTER"))));
 BA.debugLineNum = 745;BA.debugLine="ps.Add(\"TABLOID\")";
Debug.JustUpdateDeviceLine();
_ps.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("TABLOID"))));
 BA.debugLineNum = 747;BA.debugLine="Dim m As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = pdfmaker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 748;BA.debugLine="For Each strItem As String In ps";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group54 = _ps;
final int groupLen54 = group54.runMethod(true,"getSize").<Integer>get()
;int index54 = 0;
;
for (; index54 < groupLen54;index54++){
_stritem = BA.ObjectToString(group54.runMethod(false,"Get",index54));Debug.locals.put("strItem", _stritem);
Debug.locals.put("strItem", _stritem);
 BA.debugLineNum = 749;BA.debugLine="m.Put(strItem, strItem)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_stritem)),(Object)((_stritem)));
 }
}Debug.locals.put("strItem", _stritem);
;
 BA.debugLineNum = 751;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 752;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _preload(RemoteObject __ref,RemoteObject _key,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("Preload (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("preload")) { return __ref.runUserSub(false, "pdfmaker","preload", __ref, _key, _url);}
Debug.locals.put("key", _key);
Debug.locals.put("url", _url);
 BA.debugLineNum = 246;BA.debugLine="Sub Preload(key As String, url As String) As PDFMa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 248;BA.debugLine="files.Put(key, url)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_files" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_url)));
 BA.debugLineNum = 249;BA.debugLine="fileKeys.Put(url, key)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_filekeys" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_url)),(Object)((_key)));
 BA.debugLineNum = 251;BA.debugLine="NumFiles = files.size";
Debug.JustUpdateDeviceLine();
__ref.setField ("_numfiles" /*RemoteObject*/ ,__ref.getField(false,"_files" /*RemoteObject*/ ).runMethod(true,"getSize"));
 BA.debugLineNum = 252;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _print(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Print (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,526);
if (RapidSub.canDelegate("print")) { return __ref.runUserSub(false, "pdfmaker","print", __ref);}
 BA.debugLineNum = 526;BA.debugLine="Sub Print";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 528;BA.debugLine="action = \"print\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_action" /*RemoteObject*/ ,BA.ObjectToString("print"));
 BA.debugLineNum = 529;BA.debugLine="Build";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setauthor(RemoteObject __ref,RemoteObject _sauthor) throws Exception{
try {
		Debug.PushSubsStack("SetAuthor (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("setauthor")) { return __ref.runUserSub(false, "pdfmaker","setauthor", __ref, _sauthor);}
Debug.locals.put("sauthor", _sauthor);
 BA.debugLineNum = 217;BA.debugLine="Sub SetAuthor(sauthor As String) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 219;BA.debugLine="If sauthor = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sauthor,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 220;BA.debugLine="author = sauthor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_author" /*RemoteObject*/ ,_sauthor);
 BA.debugLineNum = 221;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 222;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackground(RemoteObject __ref,RemoteObject _wm) throws Exception{
try {
		Debug.PushSubsStack("SetBackground (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,326);
if (RapidSub.canDelegate("setbackground")) { return __ref.runUserSub(false, "pdfmaker","setbackground", __ref, _wm);}
Debug.locals.put("wm", _wm);
 BA.debugLineNum = 326;BA.debugLine="Sub SetBackground(wm As PDFText) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 328;BA.debugLine="docDefinition.Put(\"background\", wm.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("background"))),(Object)((_wm.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 329;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 330;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcompress(RemoteObject __ref,RemoteObject _bcompress) throws Exception{
try {
		Debug.PushSubsStack("SetCompress (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("setcompress")) { return __ref.runUserSub(false, "pdfmaker","setcompress", __ref, _bcompress);}
Debug.locals.put("bcompress", _bcompress);
 BA.debugLineNum = 190;BA.debugLine="Sub SetCompress(bcompress As Boolean) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="compress = bcompress";
Debug.JustUpdateDeviceLine();
__ref.setField ("_compress" /*RemoteObject*/ ,_bcompress);
 BA.debugLineNum = 193;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcreator(RemoteObject __ref,RemoteObject _screator) throws Exception{
try {
		Debug.PushSubsStack("SetCreator (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("setcreator")) { return __ref.runUserSub(false, "pdfmaker","setcreator", __ref, _screator);}
Debug.locals.put("screator", _screator);
 BA.debugLineNum = 196;BA.debugLine="Sub SetCreator(screator As String) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="If screator = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_screator,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 199;BA.debugLine="creator = screator";
Debug.JustUpdateDeviceLine();
__ref.setField ("_creator" /*RemoteObject*/ ,_screator);
 BA.debugLineNum = 200;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaultstyle(RemoteObject __ref,RemoteObject _ds) throws Exception{
try {
		Debug.PushSubsStack("SetDefaultStyle (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("setdefaultstyle")) { return __ref.runUserSub(false, "pdfmaker","setdefaultstyle", __ref, _ds);}
Debug.locals.put("ds", _ds);
 BA.debugLineNum = 97;BA.debugLine="Sub SetDefaultStyle(ds As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="If ds.IsInitialized Then";
Debug.JustUpdateDeviceLine();
if (_ds.runMethod(true,"IsInitialized").<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 100;BA.debugLine="ds.Put(\"name\", \"defaultStyle\")";
Debug.JustUpdateDeviceLine();
_ds.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((RemoteObject.createImmutable("defaultStyle"))));
 BA.debugLineNum = 101;BA.debugLine="defaultStyle = GetStyle(ds)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_defaultstyle" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.pdfmaker.class, "_getstyle" /*RemoteObject*/ ,(Object)(_ds)));
 };
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdocumentproperties(RemoteObject __ref,RemoteObject _docprops) throws Exception{
try {
		Debug.PushSubsStack("SetDocumentProperties (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setdocumentproperties")) { return __ref.runUserSub(false, "pdfmaker","setdocumentproperties", __ref, _docprops);}
Debug.locals.put("docprops", _docprops);
 BA.debugLineNum = 67;BA.debugLine="Sub SetDocumentProperties(docprops As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="SetAuthor(docprops.Get(\"author\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_setauthor" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("author")))))));
 BA.debugLineNum = 70;BA.debugLine="SetTitle(docprops.Get(\"title\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_settitle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("title")))))));
 BA.debugLineNum = 71;BA.debugLine="SetSubject(docprops.Get(\"subject\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_setsubject" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("subject")))))));
 BA.debugLineNum = 72;BA.debugLine="SetKeywords(docprops.Get(\"keywords\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_setkeywords" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("keywords")))))));
 BA.debugLineNum = 73;BA.debugLine="SetCreator(docprops.Get(\"creator\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_setcreator" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("creator")))))));
 BA.debugLineNum = 74;BA.debugLine="SetProducer(docprops.Get(\"producer\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_setproducer" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("producer")))))));
 BA.debugLineNum = 75;BA.debugLine="SetCompress(docprops.Get(\"compress\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_setcompress" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("compress")))))));
 BA.debugLineNum = 76;BA.debugLine="security.Set(\"userPassword\", docprops.Get(\"userPa";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_set" /*RemoteObject*/ ,(Object)(BA.ObjectToString("userPassword")),(Object)(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("userPassword"))))));
 BA.debugLineNum = 77;BA.debugLine="security.Set(\"ownerPassword\", docprops.Get(\"owner";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_set" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ownerPassword")),(Object)(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("ownerPassword"))))));
 BA.debugLineNum = 78;BA.debugLine="security.Set(\"modifying\", docprops.Get(\"modifying";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_set" /*RemoteObject*/ ,(Object)(BA.ObjectToString("modifying")),(Object)(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("modifying"))))));
 BA.debugLineNum = 79;BA.debugLine="security.Set(\"copying\", docprops.Get(\"copying\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_set" /*RemoteObject*/ ,(Object)(BA.ObjectToString("copying")),(Object)(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("copying"))))));
 BA.debugLineNum = 80;BA.debugLine="security.Set(\"annotating\", docprops.Get(\"annotati";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_set" /*RemoteObject*/ ,(Object)(BA.ObjectToString("annotating")),(Object)(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("annotating"))))));
 BA.debugLineNum = 81;BA.debugLine="security.Set(\"fillingForms\", docprops.Get(\"fillin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_set" /*RemoteObject*/ ,(Object)(BA.ObjectToString("fillingForms")),(Object)(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("fillingForms"))))));
 BA.debugLineNum = 82;BA.debugLine="security.Set(\"contentAccessibility\", docprops.Get";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_set" /*RemoteObject*/ ,(Object)(BA.ObjectToString("contentAccessibility")),(Object)(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("contentAccessibility"))))));
 BA.debugLineNum = 83;BA.debugLine="security.Set(\"documentAssembly\", docprops.Get(\"do";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_set" /*RemoteObject*/ ,(Object)(BA.ObjectToString("documentAssembly")),(Object)(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("documentAssembly"))))));
 BA.debugLineNum = 84;BA.debugLine="security.Set(\"printing\", docprops.Get(\"printing\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_security" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfsecurity.class, "_set" /*RemoteObject*/ ,(Object)(BA.ObjectToString("printing")),(Object)(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("printing"))))));
 BA.debugLineNum = 85;BA.debugLine="SetPageSize(docprops.Get(\"pageSize\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_setpagesize" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_docprops.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("pageSize")))))));
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
public static RemoteObject  _setheader(RemoteObject __ref,RemoteObject _hdr) throws Exception{
try {
		Debug.PushSubsStack("SetHeader (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("setheader")) { return __ref.runUserSub(false, "pdfmaker","setheader", __ref, _hdr);}
Debug.locals.put("hdr", _hdr);
 BA.debugLineNum = 333;BA.debugLine="Sub SetHeader(hdr As PDFText) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 335;BA.debugLine="docDefinition.Put(\"header\", hdr.content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("header"))),(Object)((_hdr.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _setkeywords(RemoteObject __ref,RemoteObject _skeywords) throws Exception{
try {
		Debug.PushSubsStack("SetKeywords (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("setkeywords")) { return __ref.runUserSub(false, "pdfmaker","setkeywords", __ref, _skeywords);}
Debug.locals.put("skeywords", _skeywords);
 BA.debugLineNum = 203;BA.debugLine="Sub SetKeywords(skeywords As String) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 205;BA.debugLine="If skeywords = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_skeywords,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 206;BA.debugLine="keywords = skeywords";
Debug.JustUpdateDeviceLine();
__ref.setField ("_keywords" /*RemoteObject*/ ,_skeywords);
 BA.debugLineNum = 207;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpagemargins(RemoteObject __ref,RemoteObject _l,RemoteObject _t,RemoteObject _r,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPageMargins (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("setpagemargins")) { return __ref.runUserSub(false, "pdfmaker","setpagemargins", __ref, _l, _t, _r, _b);}
RemoteObject _margin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 271;BA.debugLine="Sub SetPageMargins(l As Int, t As Int, r As Int, b";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 273;BA.debugLine="Dim margin As List";
Debug.JustUpdateDeviceLine();
_margin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("margin", _margin);
 BA.debugLineNum = 274;BA.debugLine="margin.Initialize";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("Initialize");
 BA.debugLineNum = 275;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("AddAll",(Object)(pdfmaker.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_l),(_t),(_r),(_b)})))));
 BA.debugLineNum = 276;BA.debugLine="docDefinition.Put(\"pageMargins\", margin)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageMargins"))),(Object)((_margin.getObject())));
 BA.debugLineNum = 277;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 278;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageOrientation (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("setpageorientation")) { return __ref.runUserSub(false, "pdfmaker","setpageorientation", __ref, _spageorientation);}
Debug.locals.put("spageOrientation", _spageorientation);
 BA.debugLineNum = 238;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 240;BA.debugLine="If spageOrientation = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_spageorientation,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 241;BA.debugLine="pageOrientation = spageOrientation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,_spageorientation);
 BA.debugLineNum = 242;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpagesize(RemoteObject __ref,RemoteObject _spagesize) throws Exception{
try {
		Debug.PushSubsStack("SetPageSize (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("setpagesize")) { return __ref.runUserSub(false, "pdfmaker","setpagesize", __ref, _spagesize);}
Debug.locals.put("spageSize", _spagesize);
 BA.debugLineNum = 231;BA.debugLine="Sub SetPageSize(spageSize As String) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 233;BA.debugLine="If spageSize = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_spagesize,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 234;BA.debugLine="pageSize = spageSize";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pagesize" /*RemoteObject*/ ,_spagesize);
 BA.debugLineNum = 235;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 236;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setproducer(RemoteObject __ref,RemoteObject _sproducer) throws Exception{
try {
		Debug.PushSubsStack("SetProducer (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("setproducer")) { return __ref.runUserSub(false, "pdfmaker","setproducer", __ref, _sproducer);}
Debug.locals.put("sproducer", _sproducer);
 BA.debugLineNum = 183;BA.debugLine="Sub SetProducer(sproducer As String) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="If sproducer = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sproducer,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 186;BA.debugLine="producer = sproducer";
Debug.JustUpdateDeviceLine();
__ref.setField ("_producer" /*RemoteObject*/ ,_sproducer);
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
public static RemoteObject  _setprogresscallback(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname,RemoteObject _params) throws Exception{
try {
		Debug.PushSubsStack("SetProgressCallback (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setprogresscallback")) { return __ref.runUserSub(false, "pdfmaker","setprogresscallback", __ref, _module, _methodname, _params);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
Debug.locals.put("params", _params);
 BA.debugLineNum = 90;BA.debugLine="Sub SetProgressCallback(module As Object, methodNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),(Object)(_params)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 92;BA.debugLine="docDefinition.Put(\"progressCallback\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("progressCallback"))),(Object)((_cb.getObject())));
 BA.debugLineNum = 93;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyles(RemoteObject __ref,RemoteObject _allstyles) throws Exception{
try {
		Debug.PushSubsStack("SetStyles (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("setstyles")) { return __ref.runUserSub(false, "pdfmaker","setstyles", __ref, _allstyles);}
RemoteObject _sk = RemoteObject.createImmutable("");
RemoteObject _sv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ts = RemoteObject.declareNull("b4j.example.pdfstyle");
Debug.locals.put("allStyles", _allstyles);
 BA.debugLineNum = 105;BA.debugLine="Sub SetStyles(allStyles As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="For Each sk As String In allStyles.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _allstyles.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_sk = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("sk", _sk);
Debug.locals.put("sk", _sk);
 BA.debugLineNum = 108;BA.debugLine="Dim sv As Map = allStyles.Get(sk)";
Debug.JustUpdateDeviceLine();
_sv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_sv.setObject(_allstyles.runMethod(false,"Get",(Object)((_sk))));Debug.locals.put("sv", _sv);
 BA.debugLineNum = 109;BA.debugLine="Dim ts As PDFStyle = GetStyle(sv)";
Debug.JustUpdateDeviceLine();
_ts = __ref.runClassMethod (b4j.example.pdfmaker.class, "_getstyle" /*RemoteObject*/ ,(Object)(_sv));Debug.locals.put("ts", _ts);Debug.locals.put("ts", _ts);
 BA.debugLineNum = 110;BA.debugLine="AddStyle(ts)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_addstyle" /*RemoteObject*/ ,(Object)(_ts));
 }
}Debug.locals.put("sk", _sk);
;
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsubject(RemoteObject __ref,RemoteObject _ssubject) throws Exception{
try {
		Debug.PushSubsStack("SetSubject (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("setsubject")) { return __ref.runUserSub(false, "pdfmaker","setsubject", __ref, _ssubject);}
Debug.locals.put("ssubject", _ssubject);
 BA.debugLineNum = 210;BA.debugLine="Sub SetSubject(ssubject As String) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 212;BA.debugLine="If ssubject = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ssubject,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 213;BA.debugLine="subject = ssubject";
Debug.JustUpdateDeviceLine();
__ref.setField ("_subject" /*RemoteObject*/ ,_ssubject);
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
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _stitle) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "pdfmaker","settitle", __ref, _stitle);}
Debug.locals.put("stitle", _stitle);
 BA.debugLineNum = 224;BA.debugLine="Sub SetTitle(stitle As String) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 226;BA.debugLine="If stitle = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stitle,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 227;BA.debugLine="title = stitle";
Debug.JustUpdateDeviceLine();
__ref.setField ("_title" /*RemoteObject*/ ,_stitle);
 BA.debugLineNum = 228;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwatermark(RemoteObject __ref,RemoteObject _wm) throws Exception{
try {
		Debug.PushSubsStack("SetWaterMark (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("setwatermark")) { return __ref.runUserSub(false, "pdfmaker","setwatermark", __ref, _wm);}
Debug.locals.put("wm", _wm);
 BA.debugLineNum = 319;BA.debugLine="Sub SetWaterMark(wm As PDFText) As PDFMaker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="docDefinition.Put(\"watermark\", wm.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_docdefinition" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("watermark"))),(Object)((_wm.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 322;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _upload(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Upload (pdfmaker) ","pdfmaker",19,__ref.getField(false, "ba"),__ref,675);
if (RapidSub.canDelegate("upload")) { return __ref.runUserSub(false, "pdfmaker","upload", __ref, _module, _methodname, _filename);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 675;BA.debugLine="Sub Upload(module As Object, methodName As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 676;BA.debugLine="Log(\"PDFMaker.Upload\")";
Debug.JustUpdateDeviceLine();
pdfmaker.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("PDFMaker.Upload")));
 BA.debugLineNum = 677;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 678;BA.debugLine="eventMethod = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventmethod" /*RemoteObject*/ ,_methodname.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 679;BA.debugLine="fName = fileName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fname" /*RemoteObject*/ ,_filename);
 BA.debugLineNum = 680;BA.debugLine="action = \"upload\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_action" /*RemoteObject*/ ,BA.ObjectToString("upload"));
 BA.debugLineNum = 681;BA.debugLine="Build";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdfmaker.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 682;BA.debugLine="End Sub";
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