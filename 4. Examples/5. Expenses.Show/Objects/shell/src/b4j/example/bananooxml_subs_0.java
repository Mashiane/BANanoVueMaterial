package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bananooxml_subs_0 {


public static RemoteObject  _addrowformula(RemoteObject __ref,RemoteObject _row,RemoteObject _formula) throws Exception{
try {
		Debug.PushSubsStack("AddRowFormula (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("addrowformula")) { return __ref.runUserSub(false, "bananooxml","addrowformula", __ref, _row, _formula);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("row", _row);
Debug.locals.put("formula", _formula);
 BA.debugLineNum = 290;BA.debugLine="Sub AddRowFormula(row As OXMLRow, formula As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 291;BA.debugLine="Dim cell As Map = Cell2Map(CreateFormula(formula)";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createformula" /*RemoteObject*/ ,(Object)(_formula))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 292;BA.debugLine="row.values.Add(cell)";
Debug.JustUpdateDeviceLine();
_row.getField(false,"values" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cell.getObject())));
 BA.debugLineNum = 293;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _addrowformula1(RemoteObject __ref,RemoteObject _row,RemoteObject _formula,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddRowFormula1 (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,297);
if (RapidSub.canDelegate("addrowformula1")) { return __ref.runUserSub(false, "bananooxml","addrowformula1", __ref, _row, _formula, _value);}
RemoteObject _cell = RemoteObject.declareNull("b4j.example.bananooxml._oxmlcell");
RemoteObject _cellv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("row", _row);
Debug.locals.put("formula", _formula);
Debug.locals.put("value", _value);
 BA.debugLineNum = 297;BA.debugLine="Sub AddRowFormula1(row As OXMLRow, formula As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 298;BA.debugLine="Dim cell As OXMLCell = CreateFormula(formula)";
Debug.JustUpdateDeviceLine();
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_createformula" /*RemoteObject*/ ,(Object)(_formula));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 299;BA.debugLine="cell.value = value";
Debug.JustUpdateDeviceLine();
_cell.setField ("value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 300;BA.debugLine="Dim cellV As Map = Cell2Map(cell)";
Debug.JustUpdateDeviceLine();
_cellv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cellv = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(_cell));Debug.locals.put("cellV", _cellv);Debug.locals.put("cellV", _cellv);
 BA.debugLineNum = 301;BA.debugLine="row.values.Add(cellV)";
Debug.JustUpdateDeviceLine();
_row.getField(false,"values" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cellv.getObject())));
 BA.debugLineNum = 302;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _addrownumber(RemoteObject __ref,RemoteObject _row,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddRowNumber (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("addrownumber")) { return __ref.runUserSub(false, "bananooxml","addrownumber", __ref, _row, _value);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("row", _row);
Debug.locals.put("value", _value);
 BA.debugLineNum = 276;BA.debugLine="Sub AddRowNumber(row As OXMLRow, value As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 277;BA.debugLine="Dim cell As Map = Cell2Map(CreateNumber(value))";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createnumber" /*RemoteObject*/ ,(Object)(_value))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 278;BA.debugLine="row.values.Add(cell)";
Debug.JustUpdateDeviceLine();
_row.getField(false,"values" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cell.getObject())));
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
public static RemoteObject  _addrowsharedtext(RemoteObject __ref,RemoteObject _row,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddRowSharedText (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("addrowsharedtext")) { return __ref.runUserSub(false, "bananooxml","addrowsharedtext", __ref, _row, _value);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("row", _row);
Debug.locals.put("value", _value);
 BA.debugLineNum = 283;BA.debugLine="Sub AddRowSharedText(row As OXMLRow, value As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="Dim cell As Map = Cell2Map(CreateSharedText(value";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createsharedtext" /*RemoteObject*/ ,(Object)(_value))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 285;BA.debugLine="row.values.Add(cell)";
Debug.JustUpdateDeviceLine();
_row.getField(false,"values" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cell.getObject())));
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
public static RemoteObject  _addrowtext(RemoteObject __ref,RemoteObject _row,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddRowText (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("addrowtext")) { return __ref.runUserSub(false, "bananooxml","addrowtext", __ref, _row, _value);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("row", _row);
Debug.locals.put("value", _value);
 BA.debugLineNum = 269;BA.debugLine="Sub AddRowText(row As OXMLRow, value As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 270;BA.debugLine="Dim cell As Map = Cell2Map(CreateText(value))";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createtext" /*RemoteObject*/ ,(Object)(_value))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 271;BA.debugLine="row.values.Add(cell)";
Debug.JustUpdateDeviceLine();
_row.getField(false,"values" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cell.getObject())));
 BA.debugLineNum = 272;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 273;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cell2map(RemoteObject __ref,RemoteObject _cell) throws Exception{
try {
		Debug.PushSubsStack("Cell2Map (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("cell2map")) { return __ref.runUserSub(false, "bananooxml","cell2map", __ref, _cell);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("cell", _cell);
 BA.debugLineNum = 215;BA.debugLine="private Sub Cell2Map(cell As OXMLCell) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 216;BA.debugLine="Dim m As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = bananooxml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 217;BA.debugLine="m.Put(\"type\", cell.typeOf)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((_cell.getField(true,"typeOf" /*RemoteObject*/ ))));
 BA.debugLineNum = 218;BA.debugLine="m.Put(\"value\", cell.value)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("value"))),(Object)((_cell.getField(true,"value" /*RemoteObject*/ ))));
 BA.debugLineNum = 219;BA.debugLine="If cell.formula <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_cell.getField(true,"formula" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 220;BA.debugLine="m.Put(\"formula\", cell.formula)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("formula"))),(Object)((_cell.getField(true,"formula" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 222;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 223;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 4;BA.debugLine="Public BANano As BANano";
bananooxml._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananooxml._banano);
 //BA.debugLineNum = 5;BA.debugLine="Public WorkBook As BANanoObject";
bananooxml._workbook = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_workbook",bananooxml._workbook);
 //BA.debugLineNum = 6;BA.debugLine="Private oxml As BANanoObject";
bananooxml._oxml = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_oxml",bananooxml._oxml);
 //BA.debugLineNum = 7;BA.debugLine="Private fName As String";
bananooxml._fname = RemoteObject.createImmutable("");__ref.setField("_fname",bananooxml._fname);
 //BA.debugLineNum = 8;BA.debugLine="Type OXMLCell(typeOf As String, value As String,";
;
 //BA.debugLineNum = 9;BA.debugLine="Type OXMLRow(rowIndex As Int, columnIndex As Int,";
;
 //BA.debugLineNum = 10;BA.debugLine="Type OXMLStyle(bold As Boolean, italic As Boolean";
;
 //BA.debugLineNum = 14;BA.debugLine="Public const BorderThick As String = \"thick\"";
bananooxml._borderthick = BA.ObjectToString("thick");__ref.setField("_borderthick",bananooxml._borderthick);
 //BA.debugLineNum = 15;BA.debugLine="Public const BorderNone As String = \"none\"";
bananooxml._bordernone = BA.ObjectToString("none");__ref.setField("_bordernone",bananooxml._bordernone);
 //BA.debugLineNum = 16;BA.debugLine="Public const BorderThin As String = \"thin\"";
bananooxml._borderthin = BA.ObjectToString("thin");__ref.setField("_borderthin",bananooxml._borderthin);
 //BA.debugLineNum = 17;BA.debugLine="Public const BorderMedium As String = \"medium\"";
bananooxml._bordermedium = BA.ObjectToString("medium");__ref.setField("_bordermedium",bananooxml._bordermedium);
 //BA.debugLineNum = 18;BA.debugLine="Public const BorderDashed As String = \"dashed\"";
bananooxml._borderdashed = BA.ObjectToString("dashed");__ref.setField("_borderdashed",bananooxml._borderdashed);
 //BA.debugLineNum = 19;BA.debugLine="Public const BorderDotted As String = \"dotted\"";
bananooxml._borderdotted = BA.ObjectToString("dotted");__ref.setField("_borderdotted",bananooxml._borderdotted);
 //BA.debugLineNum = 20;BA.debugLine="Public const BorderDouble As String = \"double\"";
bananooxml._borderdouble = BA.ObjectToString("double");__ref.setField("_borderdouble",bananooxml._borderdouble);
 //BA.debugLineNum = 21;BA.debugLine="Public const BorderHair As String = \"hair\"";
bananooxml._borderhair = BA.ObjectToString("hair");__ref.setField("_borderhair",bananooxml._borderhair);
 //BA.debugLineNum = 22;BA.debugLine="Public const BorderMediumDashed As String = \"medi";
bananooxml._bordermediumdashed = BA.ObjectToString("mediumDashed");__ref.setField("_bordermediumdashed",bananooxml._bordermediumdashed);
 //BA.debugLineNum = 23;BA.debugLine="Public const BorderDashDot As String = \"dashDot\"";
bananooxml._borderdashdot = BA.ObjectToString("dashDot");__ref.setField("_borderdashdot",bananooxml._borderdashdot);
 //BA.debugLineNum = 24;BA.debugLine="Public const BorderMediumDashDot As String = \"med";
bananooxml._bordermediumdashdot = BA.ObjectToString("mediumDashDot");__ref.setField("_bordermediumdashdot",bananooxml._bordermediumdashdot);
 //BA.debugLineNum = 25;BA.debugLine="Public const BorderDashDotDot As String = \"dashDo";
bananooxml._borderdashdotdot = BA.ObjectToString("dashDotDot");__ref.setField("_borderdashdotdot",bananooxml._borderdashdotdot);
 //BA.debugLineNum = 26;BA.debugLine="Public const BorderMediumDashDotDot As String = \"";
bananooxml._bordermediumdashdotdot = BA.ObjectToString("mediumDashDotDot");__ref.setField("_bordermediumdashdotdot",bananooxml._bordermediumdashdotdot);
 //BA.debugLineNum = 27;BA.debugLine="Public const BorderSlantDashDot As String = \"slan";
bananooxml._borderslantdashdot = BA.ObjectToString("slantDashDot");__ref.setField("_borderslantdashdot",bananooxml._borderslantdashdot);
 //BA.debugLineNum = 28;BA.debugLine="Public const colors_red As String = \"F44336\"";
bananooxml._colors_red = BA.ObjectToString("F44336");__ref.setField("_colors_red",bananooxml._colors_red);
 //BA.debugLineNum = 29;BA.debugLine="Public const colors_pink As String = \"E91E63\"";
bananooxml._colors_pink = BA.ObjectToString("E91E63");__ref.setField("_colors_pink",bananooxml._colors_pink);
 //BA.debugLineNum = 30;BA.debugLine="Public const colors_purple As String = \"9C27B0\"";
bananooxml._colors_purple = BA.ObjectToString("9C27B0");__ref.setField("_colors_purple",bananooxml._colors_purple);
 //BA.debugLineNum = 31;BA.debugLine="Public const colors_deepPurple As String = \"673AB";
bananooxml._colors_deeppurple = BA.ObjectToString("673AB7");__ref.setField("_colors_deeppurple",bananooxml._colors_deeppurple);
 //BA.debugLineNum = 32;BA.debugLine="Public const colors_indigo As String = \"3F51B5\"";
bananooxml._colors_indigo = BA.ObjectToString("3F51B5");__ref.setField("_colors_indigo",bananooxml._colors_indigo);
 //BA.debugLineNum = 33;BA.debugLine="Public const colors_blue As String = \"2196F3\"";
bananooxml._colors_blue = BA.ObjectToString("2196F3");__ref.setField("_colors_blue",bananooxml._colors_blue);
 //BA.debugLineNum = 34;BA.debugLine="Public const colors_lightBlue As String = \"03A9F4";
bananooxml._colors_lightblue = BA.ObjectToString("03A9F4");__ref.setField("_colors_lightblue",bananooxml._colors_lightblue);
 //BA.debugLineNum = 35;BA.debugLine="Public const colors_cyan As String = \"00BCD4\"";
bananooxml._colors_cyan = BA.ObjectToString("00BCD4");__ref.setField("_colors_cyan",bananooxml._colors_cyan);
 //BA.debugLineNum = 36;BA.debugLine="Public const colors_teal As String = \"009688\"";
bananooxml._colors_teal = BA.ObjectToString("009688");__ref.setField("_colors_teal",bananooxml._colors_teal);
 //BA.debugLineNum = 37;BA.debugLine="Public const colors_green As String = \"4CAF50\"";
bananooxml._colors_green = BA.ObjectToString("4CAF50");__ref.setField("_colors_green",bananooxml._colors_green);
 //BA.debugLineNum = 38;BA.debugLine="Public const colors_lightGreen As String = \"8BC34";
bananooxml._colors_lightgreen = BA.ObjectToString("8BC34A");__ref.setField("_colors_lightgreen",bananooxml._colors_lightgreen);
 //BA.debugLineNum = 39;BA.debugLine="Public const colors_lime As String = \"CDDC39\"";
bananooxml._colors_lime = BA.ObjectToString("CDDC39");__ref.setField("_colors_lime",bananooxml._colors_lime);
 //BA.debugLineNum = 40;BA.debugLine="Public const colors_yellow As String = \"ffe821\"";
bananooxml._colors_yellow = BA.ObjectToString("ffe821");__ref.setField("_colors_yellow",bananooxml._colors_yellow);
 //BA.debugLineNum = 41;BA.debugLine="Public const colors_amber As String = \"FFC107\"";
bananooxml._colors_amber = BA.ObjectToString("FFC107");__ref.setField("_colors_amber",bananooxml._colors_amber);
 //BA.debugLineNum = 42;BA.debugLine="Public const colors_orange As String = \"FF9800\"";
bananooxml._colors_orange = BA.ObjectToString("FF9800");__ref.setField("_colors_orange",bananooxml._colors_orange);
 //BA.debugLineNum = 43;BA.debugLine="Public const colors_deepOrange As String = \"FF572";
bananooxml._colors_deeporange = BA.ObjectToString("FF5722");__ref.setField("_colors_deeporange",bananooxml._colors_deeporange);
 //BA.debugLineNum = 44;BA.debugLine="Public const colors_brown As String = \"795548\"";
bananooxml._colors_brown = BA.ObjectToString("795548");__ref.setField("_colors_brown",bananooxml._colors_brown);
 //BA.debugLineNum = 45;BA.debugLine="Public const colors_grey As String = \"9E9E9E\"";
bananooxml._colors_grey = BA.ObjectToString("9E9E9E");__ref.setField("_colors_grey",bananooxml._colors_grey);
 //BA.debugLineNum = 46;BA.debugLine="Public const colors_blueGrey As String = \"607D8B\"";
bananooxml._colors_bluegrey = BA.ObjectToString("607D8B");__ref.setField("_colors_bluegrey",bananooxml._colors_bluegrey);
 //BA.debugLineNum = 47;BA.debugLine="Public const colors_black As String = \"000000\"";
bananooxml._colors_black = BA.ObjectToString("000000");__ref.setField("_colors_black",bananooxml._colors_black);
 //BA.debugLineNum = 48;BA.debugLine="Public const colors_white As String = \"ffffff\"";
bananooxml._colors_white = BA.ObjectToString("ffffff");__ref.setField("_colors_white",bananooxml._colors_white);
 //BA.debugLineNum = 49;BA.debugLine="Public const colors_transparent As String = \"tran";
bananooxml._colors_transparent = BA.ObjectToString("transparent");__ref.setField("_colors_transparent",bananooxml._colors_transparent);
 //BA.debugLineNum = 51;BA.debugLine="Public const Pattern_darkDown As String = \"darkDo";
bananooxml._pattern_darkdown = BA.ObjectToString("darkDown");__ref.setField("_pattern_darkdown",bananooxml._pattern_darkdown);
 //BA.debugLineNum = 52;BA.debugLine="Public const Pattern_darkGray As String = \"darkGr";
bananooxml._pattern_darkgray = BA.ObjectToString("darkGray");__ref.setField("_pattern_darkgray",bananooxml._pattern_darkgray);
 //BA.debugLineNum = 53;BA.debugLine="Public const Pattern_darkGrid As String = \"darkGr";
bananooxml._pattern_darkgrid = BA.ObjectToString("darkGrid");__ref.setField("_pattern_darkgrid",bananooxml._pattern_darkgrid);
 //BA.debugLineNum = 54;BA.debugLine="Public const Pattern_darkHorizontal As String = \"";
bananooxml._pattern_darkhorizontal = BA.ObjectToString("darkHorizontal");__ref.setField("_pattern_darkhorizontal",bananooxml._pattern_darkhorizontal);
 //BA.debugLineNum = 55;BA.debugLine="Public const Pattern_darkTrellis As String = \"dar";
bananooxml._pattern_darktrellis = BA.ObjectToString("darkTrellis");__ref.setField("_pattern_darktrellis",bananooxml._pattern_darktrellis);
 //BA.debugLineNum = 56;BA.debugLine="Public const Pattern_darkUp As String = \"darkUp\"";
bananooxml._pattern_darkup = BA.ObjectToString("darkUp");__ref.setField("_pattern_darkup",bananooxml._pattern_darkup);
 //BA.debugLineNum = 57;BA.debugLine="Public const Pattern_darkVertical As String = \"da";
bananooxml._pattern_darkvertical = BA.ObjectToString("darkVertical");__ref.setField("_pattern_darkvertical",bananooxml._pattern_darkvertical);
 //BA.debugLineNum = 58;BA.debugLine="Public const Pattern_gray0625 As String = \"gray06";
bananooxml._pattern_gray0625 = BA.ObjectToString("gray0625");__ref.setField("_pattern_gray0625",bananooxml._pattern_gray0625);
 //BA.debugLineNum = 59;BA.debugLine="Public const Pattern_gray125 As String = \"gray125";
bananooxml._pattern_gray125 = BA.ObjectToString("gray125");__ref.setField("_pattern_gray125",bananooxml._pattern_gray125);
 //BA.debugLineNum = 60;BA.debugLine="Public const Pattern_lightDown As String = \"light";
bananooxml._pattern_lightdown = BA.ObjectToString("lightDown");__ref.setField("_pattern_lightdown",bananooxml._pattern_lightdown);
 //BA.debugLineNum = 61;BA.debugLine="Public const Pattern_lightGray As String = \"light";
bananooxml._pattern_lightgray = BA.ObjectToString("lightGray");__ref.setField("_pattern_lightgray",bananooxml._pattern_lightgray);
 //BA.debugLineNum = 62;BA.debugLine="Public const Pattern_lightGrid As String = \"light";
bananooxml._pattern_lightgrid = BA.ObjectToString("lightGrid");__ref.setField("_pattern_lightgrid",bananooxml._pattern_lightgrid);
 //BA.debugLineNum = 63;BA.debugLine="Public const Pattern_lightHorizontal As String =";
bananooxml._pattern_lighthorizontal = BA.ObjectToString("lightHorizontal");__ref.setField("_pattern_lighthorizontal",bananooxml._pattern_lighthorizontal);
 //BA.debugLineNum = 64;BA.debugLine="Public const Pattern_lightTrellis As String = \"li";
bananooxml._pattern_lighttrellis = BA.ObjectToString("lightTrellis");__ref.setField("_pattern_lighttrellis",bananooxml._pattern_lighttrellis);
 //BA.debugLineNum = 65;BA.debugLine="Public const Pattern_lightUp As String = \"lightUp";
bananooxml._pattern_lightup = BA.ObjectToString("lightUp");__ref.setField("_pattern_lightup",bananooxml._pattern_lightup);
 //BA.debugLineNum = 66;BA.debugLine="Public const Pattern_lightVertical As String  = \"";
bananooxml._pattern_lightvertical = BA.ObjectToString("lightVertical");__ref.setField("_pattern_lightvertical",bananooxml._pattern_lightvertical);
 //BA.debugLineNum = 67;BA.debugLine="Public const Pattern_mediumGray As String = \"medi";
bananooxml._pattern_mediumgray = BA.ObjectToString("mediumGray");__ref.setField("_pattern_mediumgray",bananooxml._pattern_mediumgray);
 //BA.debugLineNum = 68;BA.debugLine="Public const Pattern_none As String = \"none\"";
bananooxml._pattern_none = BA.ObjectToString("none");__ref.setField("_pattern_none",bananooxml._pattern_none);
 //BA.debugLineNum = 69;BA.debugLine="Public const Pattern_solid As String = \"solid\"";
bananooxml._pattern_solid = BA.ObjectToString("solid");__ref.setField("_pattern_solid",bananooxml._pattern_solid);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createformula(RemoteObject __ref,RemoteObject _formula) throws Exception{
try {
		Debug.PushSubsStack("CreateFormula (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("createformula")) { return __ref.runUserSub(false, "bananooxml","createformula", __ref, _formula);}
RemoteObject _cell = RemoteObject.declareNull("b4j.example.bananooxml._oxmlcell");
Debug.locals.put("formula", _formula);
 BA.debugLineNum = 175;BA.debugLine="private Sub CreateFormula(formula As String) As OX";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="Dim cell As OXMLCell";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("b4j.example.bananooxml._oxmlcell");Debug.locals.put("cell", _cell);
 BA.debugLineNum = 177;BA.debugLine="cell.Initialize";
Debug.JustUpdateDeviceLine();
_cell.runVoidMethod ("Initialize");
 BA.debugLineNum = 178;BA.debugLine="cell.typeOf = \"formula\"";
Debug.JustUpdateDeviceLine();
_cell.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("formula"));
 BA.debugLineNum = 179;BA.debugLine="cell.formula = formula";
Debug.JustUpdateDeviceLine();
_cell.setField ("formula" /*RemoteObject*/ ,_formula);
 BA.debugLineNum = 180;BA.debugLine="cell.style = CreateMap()";
Debug.JustUpdateDeviceLine();
_cell.setField ("style" /*RemoteObject*/ ,bananooxml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 181;BA.debugLine="Return cell";
Debug.JustUpdateDeviceLine();
if (true) return _cell;
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
public static RemoteObject  _createnumber(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CreateNumber (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("createnumber")) { return __ref.runUserSub(false, "bananooxml","createnumber", __ref, _value);}
RemoteObject _cell = RemoteObject.declareNull("b4j.example.bananooxml._oxmlcell");
Debug.locals.put("value", _value);
 BA.debugLineNum = 195;BA.debugLine="private Sub CreateNumber(value As String) As OXMLC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="Dim cell As OXMLCell";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("b4j.example.bananooxml._oxmlcell");Debug.locals.put("cell", _cell);
 BA.debugLineNum = 197;BA.debugLine="cell.Initialize";
Debug.JustUpdateDeviceLine();
_cell.runVoidMethod ("Initialize");
 BA.debugLineNum = 198;BA.debugLine="cell.typeOf = \"numeric\"";
Debug.JustUpdateDeviceLine();
_cell.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("numeric"));
 BA.debugLineNum = 199;BA.debugLine="cell.value = value";
Debug.JustUpdateDeviceLine();
_cell.setField ("value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 200;BA.debugLine="cell.style = CreateMap()";
Debug.JustUpdateDeviceLine();
_cell.setField ("style" /*RemoteObject*/ ,bananooxml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 201;BA.debugLine="Return cell";
Debug.JustUpdateDeviceLine();
if (true) return _cell;
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrow(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("CreateRow (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("createrow")) { return __ref.runUserSub(false, "bananooxml","createrow", __ref, _rowpos, _colpos);}
RemoteObject _row = RemoteObject.declareNull("b4j.example.bananooxml._oxmlrow");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 164;BA.debugLine="Sub CreateRow(rowPos As Int, colPos As Int) As OXM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="Dim row As OXMLRow";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.createNew ("b4j.example.bananooxml._oxmlrow");Debug.locals.put("row", _row);
 BA.debugLineNum = 166;BA.debugLine="row.Initialize";
Debug.JustUpdateDeviceLine();
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 167;BA.debugLine="row.columnIndex = colPos";
Debug.JustUpdateDeviceLine();
_row.setField ("columnIndex" /*RemoteObject*/ ,_colpos);
 BA.debugLineNum = 168;BA.debugLine="row.rowIndex = rowPos";
Debug.JustUpdateDeviceLine();
_row.setField ("rowIndex" /*RemoteObject*/ ,_rowpos);
 BA.debugLineNum = 169;BA.debugLine="row.values.Initialize";
Debug.JustUpdateDeviceLine();
_row.getField(false,"values" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 170;BA.debugLine="row.style = CreateMap()";
Debug.JustUpdateDeviceLine();
_row.setField ("style" /*RemoteObject*/ ,bananooxml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 171;BA.debugLine="Return row";
Debug.JustUpdateDeviceLine();
if (true) return _row;
 BA.debugLineNum = 172;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createsharedtext(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CreateSharedText (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("createsharedtext")) { return __ref.runUserSub(false, "bananooxml","createsharedtext", __ref, _value);}
RemoteObject _cell = RemoteObject.declareNull("b4j.example.bananooxml._oxmlcell");
Debug.locals.put("value", _value);
 BA.debugLineNum = 205;BA.debugLine="private Sub CreateSharedText(value As String) As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 206;BA.debugLine="Dim cell As OXMLCell";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("b4j.example.bananooxml._oxmlcell");Debug.locals.put("cell", _cell);
 BA.debugLineNum = 207;BA.debugLine="cell.Initialize";
Debug.JustUpdateDeviceLine();
_cell.runVoidMethod ("Initialize");
 BA.debugLineNum = 208;BA.debugLine="cell.typeOf = \"sharedString\"";
Debug.JustUpdateDeviceLine();
_cell.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("sharedString"));
 BA.debugLineNum = 209;BA.debugLine="cell.value = value";
Debug.JustUpdateDeviceLine();
_cell.setField ("value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 210;BA.debugLine="cell.style = CreateMap()";
Debug.JustUpdateDeviceLine();
_cell.setField ("style" /*RemoteObject*/ ,bananooxml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 211;BA.debugLine="Return cell";
Debug.JustUpdateDeviceLine();
if (true) return _cell;
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createstyle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateStyle (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("createstyle")) { return __ref.runUserSub(false, "bananooxml","createstyle", __ref);}
RemoteObject _s = RemoteObject.declareNull("b4j.example.bananooxml._oxmlstyle");
 BA.debugLineNum = 85;BA.debugLine="Sub CreateStyle As OXMLStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Dim s As OXMLStyle";
Debug.JustUpdateDeviceLine();
_s = RemoteObject.createNew ("b4j.example.bananooxml._oxmlstyle");Debug.locals.put("s", _s);
 BA.debugLineNum = 87;BA.debugLine="s.Initialize";
Debug.JustUpdateDeviceLine();
_s.runVoidMethod ("Initialize");
 BA.debugLineNum = 88;BA.debugLine="s.bold = False";
Debug.JustUpdateDeviceLine();
_s.setField ("bold" /*RemoteObject*/ ,bananooxml.__c.getField(true,"False"));
 BA.debugLineNum = 89;BA.debugLine="s.italic = False";
Debug.JustUpdateDeviceLine();
_s.setField ("italic" /*RemoteObject*/ ,bananooxml.__c.getField(true,"False"));
 BA.debugLineNum = 90;BA.debugLine="s.underline = False";
Debug.JustUpdateDeviceLine();
_s.setField ("underline" /*RemoteObject*/ ,bananooxml.__c.getField(true,"False"));
 BA.debugLineNum = 91;BA.debugLine="s.strike = False";
Debug.JustUpdateDeviceLine();
_s.setField ("strike" /*RemoteObject*/ ,bananooxml.__c.getField(true,"False"));
 BA.debugLineNum = 92;BA.debugLine="s.fontSize = False";
Debug.JustUpdateDeviceLine();
_s.setField ("fontSize" /*RemoteObject*/ ,BA.ObjectToString(bananooxml.__c.getField(true,"False")));
 BA.debugLineNum = 93;BA.debugLine="s.fontColor = \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("fontColor" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 94;BA.debugLine="s.fontName= \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("fontName" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 95;BA.debugLine="s.fontFamily = \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("fontFamily" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 96;BA.debugLine="s.scheme = \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("scheme" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 97;BA.debugLine="s.numberFrmat = \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("numberFrmat" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 98;BA.debugLine="s.bordercolor = \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("borderColor" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 99;BA.debugLine="s.hAlignment = \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("hAlignment" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 100;BA.debugLine="s.vAlignment = \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("vAlignment" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 101;BA.debugLine="s.FillPattern =\"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("FillPattern" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 102;BA.debugLine="s.FillForeColor = \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("FillForeColor" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 103;BA.debugLine="s.FillBackground = \"\"";
Debug.JustUpdateDeviceLine();
_s.setField ("FillBackground" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 104;BA.debugLine="Return s";
Debug.JustUpdateDeviceLine();
if (true) return _s;
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
public static RemoteObject  _createtext(RemoteObject __ref,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("CreateText (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("createtext")) { return __ref.runUserSub(false, "bananooxml","createtext", __ref, _value);}
RemoteObject _cell = RemoteObject.declareNull("b4j.example.bananooxml._oxmlcell");
Debug.locals.put("value", _value);
 BA.debugLineNum = 185;BA.debugLine="private Sub CreateText(value As String) As OXMLCel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 186;BA.debugLine="Dim cell As OXMLCell";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("b4j.example.bananooxml._oxmlcell");Debug.locals.put("cell", _cell);
 BA.debugLineNum = 187;BA.debugLine="cell.Initialize";
Debug.JustUpdateDeviceLine();
_cell.runVoidMethod ("Initialize");
 BA.debugLineNum = 188;BA.debugLine="cell.typeOf = \"string\"";
Debug.JustUpdateDeviceLine();
_cell.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("string"));
 BA.debugLineNum = 189;BA.debugLine="cell.value = value";
Debug.JustUpdateDeviceLine();
_cell.setField ("value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 190;BA.debugLine="cell.style = CreateMap()";
Debug.JustUpdateDeviceLine();
_cell.setField ("style" /*RemoteObject*/ ,bananooxml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 191;BA.debugLine="Return cell";
Debug.JustUpdateDeviceLine();
if (true) return _cell;
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _download(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("Download (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("download")) { return __ref.runUserSub(false, "bananooxml","download", __ref, _module, _methodname);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _prom = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 261;BA.debugLine="Sub Download(module As Object, methodName As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 262;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 263;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananooxml.__c.getField(false,"Null"))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 264;BA.debugLine="Dim prom As BANanoObject = WorkBook.RunMethod(\"do";
Debug.JustUpdateDeviceLine();
_prom = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_prom = __ref.getField(false,"_workbook" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("download")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_fname" /*RemoteObject*/ ))}))));Debug.locals.put("prom", _prom);Debug.locals.put("prom", _prom);
 BA.debugLineNum = 265;BA.debugLine="prom.RunMethod(\"then\", Array(cb))";
Debug.JustUpdateDeviceLine();
_prom.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("then")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cb.getObject())}))));
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcell(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("GetCell (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("getcell")) { return __ref.runUserSub(false, "bananooxml","getcell", __ref, _sheet, _rowpos, _colpos);}
RemoteObject _colx = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 158;BA.debugLine="Sub GetCell(sheet As BANanoObject, rowPos As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="Dim colx As BANanoObject = sheet.RunMethod(\"cell\"";
Debug.JustUpdateDeviceLine();
_colx = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_colx = _sheet.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("cell")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rowpos),(_colpos)}))));Debug.locals.put("colx", _colx);Debug.locals.put("colx", _colx);
 BA.debugLineNum = 160;BA.debugLine="Return colx";
Debug.JustUpdateDeviceLine();
if (true) return _colx;
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcolumn(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("GetColumn (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("getcolumn")) { return __ref.runUserSub(false, "bananooxml","getcolumn", __ref, _sheet, _rowpos, _colpos);}
RemoteObject _colx = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 152;BA.debugLine="Sub GetColumn(sheet As BANanoObject, rowPos As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="Dim colx As BANanoObject = sheet.RunMethod(\"colum";
Debug.JustUpdateDeviceLine();
_colx = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_colx = _sheet.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("column")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rowpos),(_colpos)}))));Debug.locals.put("colx", _colx);Debug.locals.put("colx", _colx);
 BA.debugLineNum = 154;BA.debugLine="Return colx";
Debug.JustUpdateDeviceLine();
if (true) return _colx;
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrow(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("GetRow (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("getrow")) { return __ref.runUserSub(false, "bananooxml","getrow", __ref, _sheet, _rowpos, _colpos);}
RemoteObject _row = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 146;BA.debugLine="Sub GetRow(sheet As BANanoObject, rowPos As Int, c";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 147;BA.debugLine="Dim row As BANanoObject = sheet.RunMethod(\"row\",";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_row = _sheet.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("row")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rowpos),(_colpos)}))));Debug.locals.put("row", _row);Debug.locals.put("row", _row);
 BA.debugLineNum = 148;BA.debugLine="Return row";
Debug.JustUpdateDeviceLine();
if (true) return _row;
 BA.debugLineNum = 149;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bananooxml","initialize", __ref, _ba, _filename);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 73;BA.debugLine="Public Sub Initialize(fileName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="BANano.DependsOnAsset(\"dom-to-image.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("dom-to-image.min.js")));
 BA.debugLineNum = 75;BA.debugLine="BANano.DependsOnAsset(\"fileSaver.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("fileSaver.min.js")));
 BA.debugLineNum = 76;BA.debugLine="BANano.DependsOnAsset(\"jszip.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("jszip.min.js")));
 BA.debugLineNum = 77;BA.debugLine="BANano.DependsOnAsset(\"oxml.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("oxml.min.js")));
 BA.debugLineNum = 79;BA.debugLine="oxml.Initialize(\"oxml\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_oxml" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("oxml"))));
 BA.debugLineNum = 80;BA.debugLine="WorkBook = oxml.RunMethod(\"xlsx\", Null)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_workbook" /*RemoteObject*/ ,__ref.getField(false,"_oxml" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("xlsx")),(Object)(bananooxml.__c.getField(false,"Null"))));
 BA.debugLineNum = 81;BA.debugLine="fName = fileName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fname" /*RemoteObject*/ ,_filename);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _merge(RemoteObject __ref,RemoteObject _sheet,RemoteObject _range) throws Exception{
try {
		Debug.PushSubsStack("Merge (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("merge")) { return __ref.runUserSub(false, "bananooxml","merge", __ref, _sheet, _range);}
Debug.locals.put("sheet", _sheet);
Debug.locals.put("range", _range);
 BA.debugLineNum = 140;BA.debugLine="Sub Merge(sheet As BANanoObject, range As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="sheet.RunMethod(\"merge\", Array(range))";
Debug.JustUpdateDeviceLine();
_sheet.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("merge")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_range)}))));
 BA.debugLineNum = 142;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcellformula(RemoteObject __ref,RemoteObject _cellbo,RemoteObject _formula) throws Exception{
try {
		Debug.PushSubsStack("SetCellFormula (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,342);
if (RapidSub.canDelegate("setcellformula")) { return __ref.runUserSub(false, "bananooxml","setcellformula", __ref, _cellbo, _formula);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("cellBO", _cellbo);
Debug.locals.put("formula", _formula);
 BA.debugLineNum = 342;BA.debugLine="Sub SetCellFormula(cellBO As BANanoObject, formula";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 343;BA.debugLine="Dim cell As Map = Cell2Map(CreateFormula(formula)";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createformula" /*RemoteObject*/ ,(Object)(_formula))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 344;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
Debug.JustUpdateDeviceLine();
_cellbo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cell.getObject())}))));
 BA.debugLineNum = 345;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcellformula1(RemoteObject __ref,RemoteObject _cellbo,RemoteObject _formula,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetCellFormula1 (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,355);
if (RapidSub.canDelegate("setcellformula1")) { return __ref.runUserSub(false, "bananooxml","setcellformula1", __ref, _cellbo, _formula, _value);}
RemoteObject _cell = RemoteObject.declareNull("b4j.example.bananooxml._oxmlcell");
RemoteObject _cellv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("cellBO", _cellbo);
Debug.locals.put("formula", _formula);
Debug.locals.put("value", _value);
 BA.debugLineNum = 355;BA.debugLine="Sub SetCellFormula1(cellBO As BANanoObject, formul";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 356;BA.debugLine="Dim cell As OXMLCell = CreateFormula(formula)";
Debug.JustUpdateDeviceLine();
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_createformula" /*RemoteObject*/ ,(Object)(_formula));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 357;BA.debugLine="cell.value = value";
Debug.JustUpdateDeviceLine();
_cell.setField ("value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 358;BA.debugLine="Dim cellV As Map = Cell2Map(cell)";
Debug.JustUpdateDeviceLine();
_cellv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cellv = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(_cell));Debug.locals.put("cellV", _cellv);Debug.locals.put("cellV", _cellv);
 BA.debugLineNum = 359;BA.debugLine="cellBO.RunMethod(\"set\", Array(cellV))";
Debug.JustUpdateDeviceLine();
_cellbo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cellv.getObject())}))));
 BA.debugLineNum = 360;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcellnumber(RemoteObject __ref,RemoteObject _cellbo,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetCellNumber (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("setcellnumber")) { return __ref.runUserSub(false, "bananooxml","setcellnumber", __ref, _cellbo, _value);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("cellBO", _cellbo);
Debug.locals.put("value", _value);
 BA.debugLineNum = 318;BA.debugLine="Sub SetCellNumber(cellBO As BANanoObject, value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 319;BA.debugLine="Dim cell As Map = Cell2Map(CreateNumber(value))";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createnumber" /*RemoteObject*/ ,(Object)(_value))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 320;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
Debug.JustUpdateDeviceLine();
_cellbo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cell.getObject())}))));
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcellsharedtext(RemoteObject __ref,RemoteObject _cellbo,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetCellSharedText (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("setcellsharedtext")) { return __ref.runUserSub(false, "bananooxml","setcellsharedtext", __ref, _cellbo, _value);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("cellBO", _cellbo);
Debug.locals.put("value", _value);
 BA.debugLineNum = 330;BA.debugLine="Sub SetCellSharedText(cellBO As BANanoObject, valu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 331;BA.debugLine="Dim cell As Map = Cell2Map(CreateSharedText(value";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createsharedtext" /*RemoteObject*/ ,(Object)(_value))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 332;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
Debug.JustUpdateDeviceLine();
_cellbo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cell.getObject())}))));
 BA.debugLineNum = 333;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcelltext(RemoteObject __ref,RemoteObject _cellbo,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetCellText (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("setcelltext")) { return __ref.runUserSub(false, "bananooxml","setcelltext", __ref, _cellbo, _value);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("cellBO", _cellbo);
Debug.locals.put("value", _value);
 BA.debugLineNum = 312;BA.debugLine="Sub SetCellText(cellBO As BANanoObject,  value As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 313;BA.debugLine="Dim cell As Map = Cell2Map(CreateText(value))";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createtext" /*RemoteObject*/ ,(Object)(_value))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 314;BA.debugLine="cellBO.RunMethod(\"set\", Array(cell))";
Debug.JustUpdateDeviceLine();
_cellbo.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cell.getObject())}))));
 BA.debugLineNum = 315;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolbo(RemoteObject __ref,RemoteObject _col,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("SetColBO (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("setcolbo")) { return __ref.runUserSub(false, "bananooxml","setcolbo", __ref, _col, _values);}
Debug.locals.put("col", _col);
Debug.locals.put("values", _values);
 BA.debugLineNum = 248;BA.debugLine="Sub SetColBO(col As BANanoObject, values As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 249;BA.debugLine="col.RunMethod(\"set\", values)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((_values.getObject())));
 BA.debugLineNum = 250;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumn(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("SetColumn (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,238);
if (RapidSub.canDelegate("setcolumn")) { return __ref.runUserSub(false, "bananooxml","setcolumn", __ref, _sheet, _rowpos, _colpos, _values);}
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("values", _values);
 BA.debugLineNum = 238;BA.debugLine="Sub SetColumn(sheet As BANanoObject, rowPos As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 239;BA.debugLine="sheet.RunMethod(\"column\", Array(rowPos, colPos, v";
Debug.JustUpdateDeviceLine();
_sheet.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("column")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_rowpos),(_colpos),(_values.getObject())}))));
 BA.debugLineNum = 240;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setformula(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _formula) throws Exception{
try {
		Debug.PushSubsStack("SetFormula (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("setformula")) { return __ref.runUserSub(false, "bananooxml","setformula", __ref, _sheet, _rowpos, _colpos, _formula);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("formula", _formula);
 BA.debugLineNum = 349;BA.debugLine="Sub SetFormula(sheet As BANanoObject, rowPos As In";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 350;BA.debugLine="Dim cell As Map = Cell2Map(CreateFormula(formula)";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createformula" /*RemoteObject*/ ,(Object)(_formula))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 351;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
Debug.JustUpdateDeviceLine();
_sheet.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("cell")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rowpos),(_colpos)})))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cell.getObject())}))));
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setformula1(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _formula,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetFormula1 (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,363);
if (RapidSub.canDelegate("setformula1")) { return __ref.runUserSub(false, "bananooxml","setformula1", __ref, _sheet, _rowpos, _colpos, _formula, _value);}
RemoteObject _cell = RemoteObject.declareNull("b4j.example.bananooxml._oxmlcell");
RemoteObject _cellv = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("formula", _formula);
Debug.locals.put("value", _value);
 BA.debugLineNum = 363;BA.debugLine="Sub SetFormula1(sheet As BANanoObject, rowPos As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 364;BA.debugLine="Dim cell As OXMLCell = CreateFormula(formula)";
Debug.JustUpdateDeviceLine();
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_createformula" /*RemoteObject*/ ,(Object)(_formula));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 365;BA.debugLine="cell.value = value";
Debug.JustUpdateDeviceLine();
_cell.setField ("value" /*RemoteObject*/ ,_value);
 BA.debugLineNum = 366;BA.debugLine="Dim cellV As Map = Cell2Map(cell)";
Debug.JustUpdateDeviceLine();
_cellv = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cellv = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(_cell));Debug.locals.put("cellV", _cellv);Debug.locals.put("cellV", _cellv);
 BA.debugLineNum = 367;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
Debug.JustUpdateDeviceLine();
_sheet.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("cell")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rowpos),(_colpos)})))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cellv.getObject())}))));
 BA.debugLineNum = 368;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnumber(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetNumber (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("setnumber")) { return __ref.runUserSub(false, "bananooxml","setnumber", __ref, _sheet, _rowpos, _colpos, _value);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("value", _value);
 BA.debugLineNum = 324;BA.debugLine="Sub SetNumber(sheet As BANanoObject, rowPos As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 325;BA.debugLine="Dim cell As Map = Cell2Map(CreateNumber(value))";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createnumber" /*RemoteObject*/ ,(Object)(_value))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 326;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
Debug.JustUpdateDeviceLine();
_sheet.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("cell")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rowpos),(_colpos)})))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cell.getObject())}))));
 BA.debugLineNum = 327;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrow(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("SetRow (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,233);
if (RapidSub.canDelegate("setrow")) { return __ref.runUserSub(false, "bananooxml","setrow", __ref, _sheet, _rowpos, _colpos, _values);}
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("values", _values);
 BA.debugLineNum = 233;BA.debugLine="Sub SetRow(sheet As BANanoObject, rowPos As Int, c";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 234;BA.debugLine="sheet.RunMethod(\"row\", Array(rowPos, colPos, valu";
Debug.JustUpdateDeviceLine();
_sheet.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("row")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_rowpos),(_colpos),(_values.getObject())}))));
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrow1(RemoteObject __ref,RemoteObject _sheet,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("SetRow1 (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("setrow1")) { return __ref.runUserSub(false, "bananooxml","setrow1", __ref, _sheet, _row);}
RemoteObject _rowpos = RemoteObject.createImmutable(0);
RemoteObject _colpos = RemoteObject.createImmutable(0);
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("sheet", _sheet);
Debug.locals.put("row", _row);
 BA.debugLineNum = 253;BA.debugLine="Sub SetRow1(sheet As BANanoObject, row As OXMLRow)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 254;BA.debugLine="Dim rowPos As Int = row.rowIndex";
Debug.JustUpdateDeviceLine();
_rowpos = _row.getField(true,"rowIndex" /*RemoteObject*/ );Debug.locals.put("rowPos", _rowpos);Debug.locals.put("rowPos", _rowpos);
 BA.debugLineNum = 255;BA.debugLine="Dim colPos As Int = row.columnIndex";
Debug.JustUpdateDeviceLine();
_colpos = _row.getField(true,"columnIndex" /*RemoteObject*/ );Debug.locals.put("colPos", _colpos);Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 256;BA.debugLine="Dim values As List = row.values";
Debug.JustUpdateDeviceLine();
_values = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_values = _row.getField(false,"values" /*RemoteObject*/ );Debug.locals.put("values", _values);Debug.locals.put("values", _values);
 BA.debugLineNum = 257;BA.debugLine="SetRow(sheet, rowPos, colPos, values)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananooxml.class, "_setrow" /*RemoteObject*/ ,(Object)(_sheet),(Object)(_rowpos),(Object)(_colpos),(Object)(_values));
 BA.debugLineNum = 258;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrowbo(RemoteObject __ref,RemoteObject _row,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("SetRowBO (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("setrowbo")) { return __ref.runUserSub(false, "bananooxml","setrowbo", __ref, _row, _values);}
Debug.locals.put("row", _row);
Debug.locals.put("values", _values);
 BA.debugLineNum = 243;BA.debugLine="Sub SetRowBO(row As BANanoObject, values As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 244;BA.debugLine="row.RunMethod(\"set\", values)";
Debug.JustUpdateDeviceLine();
_row.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((_values.getObject())));
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsharedtext(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetSharedText (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("setsharedtext")) { return __ref.runUserSub(false, "bananooxml","setsharedtext", __ref, _sheet, _rowpos, _colpos, _value);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("value", _value);
 BA.debugLineNum = 336;BA.debugLine="Sub SetSharedText(sheet As BANanoObject, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="Dim cell As Map = Cell2Map(CreateSharedText(value";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createsharedtext" /*RemoteObject*/ ,(Object)(_value))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 338;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
Debug.JustUpdateDeviceLine();
_sheet.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("cell")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rowpos),(_colpos)})))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cell.getObject())}))));
 BA.debugLineNum = 339;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _rc,RemoteObject _style) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "bananooxml","setstyle", __ref, _rc, _style);}
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _border = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _fill = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("rc", _rc);
Debug.locals.put("Style", _style);
 BA.debugLineNum = 108;BA.debugLine="Sub SetStyle(rc As BANanoObject, Style As OXMLStyl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Dim obj As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_obj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_obj = bananooxml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("obj", _obj);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 110;BA.debugLine="If Style.bold Then obj.Put(\"bold\", Style.bold)";
Debug.JustUpdateDeviceLine();
if (_style.getField(true,"bold" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bold"))),(Object)((_style.getField(true,"bold" /*RemoteObject*/ ))));};
 BA.debugLineNum = 111;BA.debugLine="If Style.italic Then obj.Put(\"italic\", Style.ital";
Debug.JustUpdateDeviceLine();
if (_style.getField(true,"italic" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("italic"))),(Object)((_style.getField(true,"italic" /*RemoteObject*/ ))));};
 BA.debugLineNum = 112;BA.debugLine="If Style.underline Then obj.Put(\"underline\", Styl";
Debug.JustUpdateDeviceLine();
if (_style.getField(true,"underline" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("underline"))),(Object)((_style.getField(true,"underline" /*RemoteObject*/ ))));};
 BA.debugLineNum = 113;BA.debugLine="If Style.strike Then obj.Put(\"strike\", Style.stri";
Debug.JustUpdateDeviceLine();
if (_style.getField(true,"strike" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("strike"))),(Object)((_style.getField(true,"strike" /*RemoteObject*/ ))));};
 BA.debugLineNum = 114;BA.debugLine="If Style.fontSize Then obj.Put(\"fontSize\", Style.";
Debug.JustUpdateDeviceLine();
if (BA.ObjectToBoolean(_style.getField(true,"fontSize" /*RemoteObject*/ ).<String>get()).<Boolean>get().booleanValue()) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fontSize"))),(Object)((_style.getField(true,"fontSize" /*RemoteObject*/ ))));};
 BA.debugLineNum = 115;BA.debugLine="If Style.fontColor <> \"\" Then obj.Put(\"fontColor\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_style.getField(true,"fontColor" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fontColor"))),(Object)((_style.getField(true,"fontColor" /*RemoteObject*/ ))));};
 BA.debugLineNum = 116;BA.debugLine="If Style.fontName <> \"\" Then obj.Put(\"fontName\",";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_style.getField(true,"fontName" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fontName"))),(Object)((_style.getField(true,"fontName" /*RemoteObject*/ ))));};
 BA.debugLineNum = 117;BA.debugLine="If Style.fontFamily <> \"\" Then obj.Put(\"fontFamil";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_style.getField(true,"fontFamily" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fontFamily"))),(Object)((_style.getField(true,"fontFamily" /*RemoteObject*/ ))));};
 BA.debugLineNum = 118;BA.debugLine="If Style.scheme <> \"\" Then obj.Put(\"scheme\", Styl";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_style.getField(true,"scheme" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("scheme"))),(Object)((_style.getField(true,"scheme" /*RemoteObject*/ ))));};
 BA.debugLineNum = 119;BA.debugLine="If Style.numberFrmat <> \"\" Then obj.Put(\"numberFo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_style.getField(true,"numberFrmat" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("numberFormat"))),(Object)((_style.getField(true,"numberFrmat" /*RemoteObject*/ ))));};
 BA.debugLineNum = 120;BA.debugLine="If Style.vAlignment <> \"\" Then obj.Put(\"vAlignmen";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_style.getField(true,"vAlignment" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("vAlignment"))),(Object)((_style.getField(true,"vAlignment" /*RemoteObject*/ ))));};
 BA.debugLineNum = 121;BA.debugLine="If Style.hAlignment <> \"\" Then obj.Put(\"hAlignmen";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_style.getField(true,"hAlignment" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("hAlignment"))),(Object)((_style.getField(true,"hAlignment" /*RemoteObject*/ ))));};
 BA.debugLineNum = 122;BA.debugLine="If Style.borderColor <> \"\" Or Style.borderThickne";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_style.getField(true,"borderColor" /*RemoteObject*/ ),BA.ObjectToString("")) || RemoteObject.solveBoolean("!",_style.getField(true,"borderThickness" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 123;BA.debugLine="Dim border As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_border = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_border = bananooxml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("border", _border);Debug.locals.put("border", _border);
 BA.debugLineNum = 124;BA.debugLine="border.Put(\"color\", Style.bordercolor)";
Debug.JustUpdateDeviceLine();
_border.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("color"))),(Object)((_style.getField(true,"borderColor" /*RemoteObject*/ ))));
 BA.debugLineNum = 125;BA.debugLine="border.Put(\"style\", Style.borderthickness)";
Debug.JustUpdateDeviceLine();
_border.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("style"))),(Object)((_style.getField(true,"borderThickness" /*RemoteObject*/ ))));
 BA.debugLineNum = 126;BA.debugLine="obj.Put(\"border\", border)";
Debug.JustUpdateDeviceLine();
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border"))),(Object)((_border.getObject())));
 };
 BA.debugLineNum = 129;BA.debugLine="If Style.FillPattern <> \"\" And Style.FillForeColo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_style.getField(true,"FillPattern" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_style.getField(true,"FillForeColor" /*RemoteObject*/ ),BA.ObjectToString("")) && RemoteObject.solveBoolean("!",_style.getField(true,"FillBackground" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 130;BA.debugLine="Dim fill As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_fill = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_fill = bananooxml.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("fill", _fill);Debug.locals.put("fill", _fill);
 BA.debugLineNum = 131;BA.debugLine="fill.Put(\"pattern\", Style.FillPattern)";
Debug.JustUpdateDeviceLine();
_fill.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pattern"))),(Object)((_style.getField(true,"FillPattern" /*RemoteObject*/ ))));
 BA.debugLineNum = 132;BA.debugLine="fill.Put(\"foreColor\", Style.FillForeColor)";
Debug.JustUpdateDeviceLine();
_fill.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("foreColor"))),(Object)((_style.getField(true,"FillForeColor" /*RemoteObject*/ ))));
 BA.debugLineNum = 133;BA.debugLine="fill.Put(\"backColor\", Style.FillBackground)";
Debug.JustUpdateDeviceLine();
_fill.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("backColor"))),(Object)((_style.getField(true,"FillBackground" /*RemoteObject*/ ))));
 BA.debugLineNum = 134;BA.debugLine="obj.Put(\"fill\", fill)";
Debug.JustUpdateDeviceLine();
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fill"))),(Object)((_fill.getObject())));
 };
 BA.debugLineNum = 136;BA.debugLine="rc.RunMethod(\"style\", Array(obj))";
Debug.JustUpdateDeviceLine();
_rc.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("style")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_obj.getObject())}))));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _sheet,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetText (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "bananooxml","settext", __ref, _sheet, _rowpos, _colpos, _value);}
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("sheet", _sheet);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("value", _value);
 BA.debugLineNum = 306;BA.debugLine="Sub SetText(sheet As BANanoObject, rowPos As Int,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 307;BA.debugLine="Dim cell As Map = Cell2Map(CreateText(value))";
Debug.JustUpdateDeviceLine();
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cell = __ref.runClassMethod (b4j.example.bananooxml.class, "_cell2map" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.bananooxml.class, "_createtext" /*RemoteObject*/ ,(Object)(_value))));Debug.locals.put("cell", _cell);Debug.locals.put("cell", _cell);
 BA.debugLineNum = 308;BA.debugLine="sheet.RunMethod(\"cell\", Array(rowPos, colPos)).Ru";
Debug.JustUpdateDeviceLine();
_sheet.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("cell")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_rowpos),(_colpos)})))).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("set")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_cell.getObject())}))));
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _worksheet(RemoteObject __ref,RemoteObject _sheetname) throws Exception{
try {
		Debug.PushSubsStack("WorkSheet (bananooxml) ","bananooxml",11,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("worksheet")) { return __ref.runUserSub(false, "bananooxml","worksheet", __ref, _sheetname);}
RemoteObject _wksheet = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("sheetName", _sheetname);
 BA.debugLineNum = 226;BA.debugLine="Sub WorkSheet(sheetName As String) As BANanoObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="Dim wkSheet As BANanoObject";
Debug.JustUpdateDeviceLine();
_wksheet = RemoteObject.createNew ("com.ab.banano.BANanoObject");Debug.locals.put("wkSheet", _wksheet);
 BA.debugLineNum = 228;BA.debugLine="wkSheet = WorkBook.RunMethod(\"sheet\", Array(sheet";
Debug.JustUpdateDeviceLine();
_wksheet = __ref.getField(false,"_workbook" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("sheet")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sheetname)}))));Debug.locals.put("wkSheet", _wksheet);
 BA.debugLineNum = 229;BA.debugLine="Return wkSheet";
Debug.JustUpdateDeviceLine();
if (true) return _wksheet;
 BA.debugLineNum = 230;BA.debugLine="End Sub";
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