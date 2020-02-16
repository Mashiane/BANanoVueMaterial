package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdftable_subs_0 {


public static RemoteObject  _addcolumn(RemoteObject __ref,RemoteObject _colname,RemoteObject _colwidth,RemoteObject _colheight) throws Exception{
try {
		Debug.PushSubsStack("AddColumn (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("addcolumn")) { return __ref.runUserSub(false, "pdftable","addcolumn", __ref, _colname, _colwidth, _colheight);}
Debug.locals.put("colName", _colname);
Debug.locals.put("colWidth", _colwidth);
Debug.locals.put("colHeight", _colheight);
 BA.debugLineNum = 77;BA.debugLine="Sub AddColumn(colName As String, colWidth As Objec";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="hdr.Add(colName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_hdr" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_colname)));
 BA.debugLineNum = 79;BA.debugLine="If colWidth <> Null Then widths.Add(colWidth)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_colwidth)) { 
__ref.getField(false,"_widths" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_colwidth));};
 BA.debugLineNum = 80;BA.debugLine="If colHeight <> Null Then heights.Add(colHeight)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_colheight)) { 
__ref.getField(false,"_heights" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_colheight));};
 BA.debugLineNum = 81;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addrow(RemoteObject __ref,RemoteObject _rowdata) throws Exception{
try {
		Debug.PushSubsStack("AddRow (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("addrow")) { return __ref.runUserSub(false, "pdftable","addrow", __ref, _rowdata);}
Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 85;BA.debugLine="Sub AddRow(rowData As List) As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="rows.Add(rowData)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rows" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_rowdata.getObject())));
 BA.debugLineNum = 87;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addrow1(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("AddRow1 (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("addrow1")) { return __ref.runUserSub(false, "pdftable","addrow1", __ref, _row);}
Debug.locals.put("row", _row);
 BA.debugLineNum = 91;BA.debugLine="Sub AddRow1(row As PDFRow) As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="rows.Add(row.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rows" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_row.runClassMethod (b4j.example.pdfrow.class, "_getcontent" /*RemoteObject*/ ).getObject())));
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
public static RemoteObject  _addrowtexts(RemoteObject __ref,RemoteObject _rowdata) throws Exception{
try {
		Debug.PushSubsStack("AddRowTexts (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("addrowtexts")) { return __ref.runUserSub(false, "pdftable","addrowtexts", __ref, _rowdata);}
RemoteObject _trow = RemoteObject.declareNull("b4j.example.pdfrow");
RemoteObject _txt = RemoteObject.declareNull("b4j.example.pdftext");
Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 97;BA.debugLine="Sub AddRowTexts(rowData As List) As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="Dim trow As PDFRow";
Debug.JustUpdateDeviceLine();
_trow = RemoteObject.createNew ("b4j.example.pdfrow");Debug.locals.put("trow", _trow);
 BA.debugLineNum = 99;BA.debugLine="trow.Initialize";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.pdfrow.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
 BA.debugLineNum = 100;BA.debugLine="For Each txt As PDFText In rowData";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _rowdata;
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_txt = (group3.runMethod(false,"Get",index3));Debug.locals.put("txt", _txt);
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 101;BA.debugLine="trow.AddText(txt)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.pdfrow.class, "_addtext" /*RemoteObject*/ ,(Object)(_txt));
 }
}Debug.locals.put("txt", _txt);
;
 BA.debugLineNum = 103;BA.debugLine="AddRow1(trow)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.pdftable.class, "_addrow1" /*RemoteObject*/ ,(Object)(_trow));
 BA.debugLineNum = 104;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 105;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Private options As Map";
pdftable._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",pdftable._options);
 //BA.debugLineNum = 4;BA.debugLine="Private layout As String";
pdftable._layout = RemoteObject.createImmutable("");__ref.setField("_layout",pdftable._layout);
 //BA.debugLineNum = 5;BA.debugLine="Public lightHorizontalLines As Boolean";
pdftable._lighthorizontallines = RemoteObject.createImmutable(false);__ref.setField("_lighthorizontallines",pdftable._lighthorizontallines);
 //BA.debugLineNum = 6;BA.debugLine="Public noBorders As Boolean";
pdftable._noborders = RemoteObject.createImmutable(false);__ref.setField("_noborders",pdftable._noborders);
 //BA.debugLineNum = 7;BA.debugLine="Public headerLineOnly As Boolean";
pdftable._headerlineonly = RemoteObject.createImmutable(false);__ref.setField("_headerlineonly",pdftable._headerlineonly);
 //BA.debugLineNum = 8;BA.debugLine="Public headerRows As Int";
pdftable._headerrows = RemoteObject.createImmutable(0);__ref.setField("_headerrows",pdftable._headerrows);
 //BA.debugLineNum = 9;BA.debugLine="Private table As Map";
pdftable._table = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_table",pdftable._table);
 //BA.debugLineNum = 10;BA.debugLine="Private widths As List";
pdftable._widths = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_widths",pdftable._widths);
 //BA.debugLineNum = 11;BA.debugLine="Private heights As List";
pdftable._heights = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_heights",pdftable._heights);
 //BA.debugLineNum = 12;BA.debugLine="Private hdr As List";
pdftable._hdr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_hdr",pdftable._hdr);
 //BA.debugLineNum = 13;BA.debugLine="Private body As List";
pdftable._body = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_body",pdftable._body);
 //BA.debugLineNum = 14;BA.debugLine="Private rows As List";
pdftable._rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_rows",pdftable._rows);
 //BA.debugLineNum = 15;BA.debugLine="Public style As PDFStyle";
pdftable._style = RemoteObject.createNew ("b4j.example.pdfstyle");__ref.setField("_style",pdftable._style);
 //BA.debugLineNum = 16;BA.debugLine="Private pageOrientation As String";
pdftable._pageorientation = RemoteObject.createImmutable("");__ref.setField("_pageorientation",pdftable._pageorientation);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdftable","getcontent", __ref);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 133;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="If lightHorizontalLines <> Null Then options.Put(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_lighthorizontallines" /*RemoteObject*/ ),BA.ObjectToBoolean(pdftable.__c.getField(false,"Null")))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("layout"))),(Object)((RemoteObject.createImmutable("lightHorizontalLines"))));};
 BA.debugLineNum = 135;BA.debugLine="If noBorders <> Null Then options.Put(\"layout\", \"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_noborders" /*RemoteObject*/ ),BA.ObjectToBoolean(pdftable.__c.getField(false,"Null")))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("layout"))),(Object)((RemoteObject.createImmutable("noBorders"))));};
 BA.debugLineNum = 136;BA.debugLine="If headerLineOnly <> Null Then options.Put(\"layou";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_headerlineonly" /*RemoteObject*/ ),BA.ObjectToBoolean(pdftable.__c.getField(false,"Null")))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("layout"))),(Object)((RemoteObject.createImmutable("headerLineOnly"))));};
 BA.debugLineNum = 138;BA.debugLine="If headerRows <> Null Then table.Put(\"headerRows\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_headerrows" /*RemoteObject*/ ),BA.numberCast(double.class, pdftable.__c.getField(false,"Null")))) { 
__ref.getField(false,"_table" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("headerRows"))),(Object)((__ref.getField(true,"_headerrows" /*RemoteObject*/ ))));};
 BA.debugLineNum = 139;BA.debugLine="If widths.Size > 0 Then table.Put(\"widths\", width";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_widths" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_table" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("widths"))),(Object)((__ref.getField(false,"_widths" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 140;BA.debugLine="If heights.Size > 0 Then table.Put(\"heights\", hei";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_heights" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_table" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("heights"))),(Object)((__ref.getField(false,"_heights" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 142;BA.debugLine="If hdr.Size > 0 Then body.Add(hdr)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_hdr" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((__ref.getField(false,"_hdr" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 143;BA.debugLine="For Each lst As List In rows";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
{
final RemoteObject group8 = __ref.getField(false,"_rows" /*RemoteObject*/ );
final int groupLen8 = group8.runMethod(true,"getSize").<Integer>get()
;int index8 = 0;
;
for (; index8 < groupLen8;index8++){
_lst.setObject(group8.runMethod(false,"Get",index8));
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 144;BA.debugLine="body.Add(lst)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_lst.getObject())));
 }
}Debug.locals.put("lst", _lst);
;
 BA.debugLineNum = 146;BA.debugLine="table.Put(\"body\", body)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("body"))),(Object)((__ref.getField(false,"_body" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 147;BA.debugLine="options.Put(\"table\", table)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("table"))),(Object)((__ref.getField(false,"_table" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 148;BA.debugLine="style.Include(options)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_include" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_options" /*RemoteObject*/ )));
 BA.debugLineNum = 149;BA.debugLine="Return options";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_options" /*RemoteObject*/ );
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdftable","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="lightHorizontalLines = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lighthorizontallines" /*RemoteObject*/ ,BA.ObjectToBoolean(pdftable.__c.getField(false,"Null")));
 BA.debugLineNum = 23;BA.debugLine="headerLineOnly = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_headerlineonly" /*RemoteObject*/ ,BA.ObjectToBoolean(pdftable.__c.getField(false,"Null")));
 BA.debugLineNum = 24;BA.debugLine="noBorders = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_noborders" /*RemoteObject*/ ,BA.ObjectToBoolean(pdftable.__c.getField(false,"Null")));
 BA.debugLineNum = 25;BA.debugLine="headerRows = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_headerrows" /*RemoteObject*/ ,BA.numberCast(int.class, pdftable.__c.getField(false,"Null")));
 BA.debugLineNum = 26;BA.debugLine="pageOrientation = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 27;BA.debugLine="table.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="widths.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_widths" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 29;BA.debugLine="hdr.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_hdr" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 30;BA.debugLine="body.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_body" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="rows.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="style.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_style" /*RemoteObject*/ ).runClassMethod (b4j.example.pdfstyle.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"));
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
public static RemoteObject  _setabsoluteposition(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetAbsolutePosition (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setabsoluteposition")) { return __ref.runUserSub(false, "pdftable","setabsoluteposition", __ref, _x, _y);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 43;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = pdftable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 45;BA.debugLine="opt.Put(\"x\", x)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 46;BA.debugLine="opt.Put(\"y\", y)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 47;BA.debugLine="options.Put(\"absolutePosition\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("absolutePosition"))),(Object)((_opt.getObject())));
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
public static RemoteObject  _setcolumnnames(RemoteObject __ref,RemoteObject _names) throws Exception{
try {
		Debug.PushSubsStack("SetColumnNames (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("setcolumnnames")) { return __ref.runUserSub(false, "pdftable","setcolumnnames", __ref, _names);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("names", _names);
 BA.debugLineNum = 69;BA.debugLine="Sub SetColumnNames(names As List) As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="For Each k As String In names";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _names;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 71;BA.debugLine="hdr.Add(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_hdr" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_k)));
 }
}Debug.locals.put("k", _k);
;
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
public static RemoteObject  _setheaderrows(RemoteObject __ref,RemoteObject _iheaderrows) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderRows (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("setheaderrows")) { return __ref.runUserSub(false, "pdftable","setheaderrows", __ref, _iheaderrows);}
Debug.locals.put("iheaderRows", _iheaderrows);
 BA.debugLineNum = 36;BA.debugLine="Sub SetHeaderRows(iheaderRows As Int) As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="If iheaderRows = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_iheaderrows,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 38;BA.debugLine="headerRows = iheaderRows";
Debug.JustUpdateDeviceLine();
__ref.setField ("_headerrows" /*RemoteObject*/ ,_iheaderrows);
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
public static RemoteObject  _setheights(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHeights (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setheights")) { return __ref.runUserSub(false, "pdftable","setheights", __ref, _h);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("h", _h);
 BA.debugLineNum = 61;BA.debugLine="Sub SetHeights(h As List) As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="For Each k As String In h";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _h;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 63;BA.debugLine="heights.Add(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_heights" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_k)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 65;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetID (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "pdftable","setid", __ref, _sid);}
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 119;BA.debugLine="Sub SetID(sid As String) As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="options.Put(\"id\", sid)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("id"))),(Object)((_sid)));
 BA.debugLineNum = 121;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 122;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageBreakAfter (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setpagebreakafter")) { return __ref.runUserSub(false, "pdftable","setpagebreakafter", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Sub SetPageBreakAfter As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));
 BA.debugLineNum = 116;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageBreakBefore (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setpagebreakbefore")) { return __ref.runUserSub(false, "pdftable","setpagebreakbefore", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Sub SetPageBreakBefore As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));
 BA.debugLineNum = 110;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 111;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageOrientation (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("setpageorientation")) { return __ref.runUserSub(false, "pdftable","setpageorientation", __ref, _spageorientation);}
Debug.locals.put("spageOrientation", _spageorientation);
 BA.debugLineNum = 125;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="If spageOrientation = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_spageorientation,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 127;BA.debugLine="pageOrientation = spageOrientation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,_spageorientation);
 BA.debugLineNum = 128;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidths(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetWidths (pdftable) ","pdftable",26,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setwidths")) { return __ref.runUserSub(false, "pdftable","setwidths", __ref, _w);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("w", _w);
 BA.debugLineNum = 53;BA.debugLine="Sub SetWidths(w As List) As PDFTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="For Each k As String In w";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _w;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 55;BA.debugLine="widths.Add(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_widths" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_k)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 57;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
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