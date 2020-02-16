package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdflist_subs_0 {


public static RemoteObject  _additems(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddItems (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("additems")) { return __ref.runUserSub(false, "pdflist","additems", __ref, _lst);}
RemoteObject _item = RemoteObject.declareNull("Object");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 60;BA.debugLine="Sub AddItems(lst As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="For Each item As Object In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _lst;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = group1.runMethod(false,"Get",index1);Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 62;BA.debugLine="items.Add(item)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)(_item));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 64;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstring(RemoteObject __ref,RemoteObject _str) throws Exception{
try {
		Debug.PushSubsStack("AddString (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("addstring")) { return __ref.runUserSub(false, "pdflist","addstring", __ref, _str);}
Debug.locals.put("str", _str);
 BA.debugLineNum = 54;BA.debugLine="Sub AddString(str As String) As PDFList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="items.Add(str)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_str)));
 BA.debugLineNum = 56;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddText (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("addtext")) { return __ref.runUserSub(false, "pdflist","addtext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 49;BA.debugLine="Sub AddText(txt As PDFText) As PDFList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="items.Add(txt.Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_txt.runClassMethod (b4j.example.pdftext.class, "_getcontent" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 51;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Private items As List";
pdflist._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_items",pdflist._items);
 //BA.debugLineNum = 4;BA.debugLine="Private listX As Map";
pdflist._listx = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_listx",pdflist._listx);
 //BA.debugLineNum = 5;BA.debugLine="Private lType As String";
pdflist._ltype = RemoteObject.createImmutable("");__ref.setField("_ltype",pdflist._ltype);
 //BA.debugLineNum = 6;BA.debugLine="Public reversed As Boolean";
pdflist._reversed = RemoteObject.createImmutable(false);__ref.setField("_reversed",pdflist._reversed);
 //BA.debugLineNum = 7;BA.debugLine="Public start As Int";
pdflist._start = RemoteObject.createImmutable(0);__ref.setField("_start",pdflist._start);
 //BA.debugLineNum = 8;BA.debugLine="Public color As String";
pdflist._color = RemoteObject.createImmutable("");__ref.setField("_color",pdflist._color);
 //BA.debugLineNum = 9;BA.debugLine="Public markerColor As String";
pdflist._markercolor = RemoteObject.createImmutable("");__ref.setField("_markercolor",pdflist._markercolor);
 //BA.debugLineNum = 10;BA.debugLine="Public separator As String";
pdflist._separator = RemoteObject.createImmutable("");__ref.setField("_separator",pdflist._separator);
 //BA.debugLineNum = 11;BA.debugLine="Type ListStyleObj(circle As String, square As Str";
;
 //BA.debugLineNum = 13;BA.debugLine="Public ListStyle As ListStyleObj";
pdflist._liststyle = RemoteObject.createNew ("b4j.example.pdflist._liststyleobj");__ref.setField("_liststyle",pdflist._liststyle);
 //BA.debugLineNum = 14;BA.debugLine="Public Style As String";
pdflist._style = RemoteObject.createImmutable("");__ref.setField("_style",pdflist._style);
 //BA.debugLineNum = 15;BA.debugLine="Public pageOrientation As String";
pdflist._pageorientation = RemoteObject.createImmutable("");__ref.setField("_pageorientation",pdflist._pageorientation);
 //BA.debugLineNum = 16;BA.debugLine="Public BANano As BANano";
pdflist._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",pdflist._banano);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdflist","getcontent", __ref);}
 BA.debugLineNum = 80;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="If reversed <> Null Then listX.Put(\"reversed\", re";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_reversed" /*RemoteObject*/ ),BA.ObjectToBoolean(pdflist.__c.getField(false,"Null")))) { 
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("reversed"))),(Object)((__ref.getField(true,"_reversed" /*RemoteObject*/ ))));};
 BA.debugLineNum = 82;BA.debugLine="If start <> Null Then listX.Put(\"start\", start)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_start" /*RemoteObject*/ ),BA.numberCast(double.class, pdflist.__c.getField(false,"Null")))) { 
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("start"))),(Object)((__ref.getField(true,"_start" /*RemoteObject*/ ))));};
 BA.debugLineNum = 83;BA.debugLine="If Style <> Null Then listX.Put(\"type\", Style)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_style" /*RemoteObject*/ ))) { 
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((__ref.getField(true,"_style" /*RemoteObject*/ ))));};
 BA.debugLineNum = 84;BA.debugLine="If color <> Null Then listX.Put(\"color\", color)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_color" /*RemoteObject*/ ))) { 
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("color"))),(Object)((__ref.getField(true,"_color" /*RemoteObject*/ ))));};
 BA.debugLineNum = 85;BA.debugLine="If markerColor <> Null Then listX.Put(\"markerColo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_markercolor" /*RemoteObject*/ ))) { 
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("markerColor"))),(Object)((__ref.getField(true,"_markercolor" /*RemoteObject*/ ))));};
 BA.debugLineNum = 86;BA.debugLine="If separator <> Null Then listX.Put(\"separator\",";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_separator" /*RemoteObject*/ ))) { 
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("separator"))),(Object)((__ref.getField(true,"_separator" /*RemoteObject*/ ))));};
 BA.debugLineNum = 87;BA.debugLine="listX.Put(lType, items)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((__ref.getField(true,"_ltype" /*RemoteObject*/ ))),(Object)((__ref.getField(false,"_items" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 88;BA.debugLine="Return listX";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_listx" /*RemoteObject*/ );
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _listtype) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdflist","initialize", __ref, _ba, _listtype);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("listType", _listtype);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(listType As String) As PDFLi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="items.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="listX.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="lType = listType";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ltype" /*RemoteObject*/ ,_listtype);
 BA.debugLineNum = 24;BA.debugLine="reversed = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_reversed" /*RemoteObject*/ ,BA.ObjectToBoolean(pdflist.__c.getField(false,"Null")));
 BA.debugLineNum = 25;BA.debugLine="start = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_start" /*RemoteObject*/ ,BA.numberCast(int.class, pdflist.__c.getField(false,"Null")));
 BA.debugLineNum = 26;BA.debugLine="color = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_color" /*RemoteObject*/ ,BA.ObjectToString(pdflist.__c.getField(false,"Null")));
 BA.debugLineNum = 27;BA.debugLine="markerColor = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_markercolor" /*RemoteObject*/ ,BA.ObjectToString(pdflist.__c.getField(false,"Null")));
 BA.debugLineNum = 28;BA.debugLine="separator = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_separator" /*RemoteObject*/ ,BA.ObjectToString(pdflist.__c.getField(false,"Null")));
 BA.debugLineNum = 29;BA.debugLine="ListStyle.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_liststyle" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 30;BA.debugLine="ListStyle.square = \"square\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_liststyle" /*RemoteObject*/ ).setField ("square" /*RemoteObject*/ ,BA.ObjectToString("square"));
 BA.debugLineNum = 31;BA.debugLine="ListStyle.circle = \"circle\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_liststyle" /*RemoteObject*/ ).setField ("circle" /*RemoteObject*/ ,BA.ObjectToString("circle"));
 BA.debugLineNum = 32;BA.debugLine="ListStyle.lowerAlpha = \"lower-alpha\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_liststyle" /*RemoteObject*/ ).setField ("lowerAlpha" /*RemoteObject*/ ,BA.ObjectToString("lower-alpha"));
 BA.debugLineNum = 33;BA.debugLine="ListStyle.upperAlpha = \"upper-alpha\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_liststyle" /*RemoteObject*/ ).setField ("upperAlpha" /*RemoteObject*/ ,BA.ObjectToString("upper-alpha"));
 BA.debugLineNum = 34;BA.debugLine="ListStyle.upperRoman = \"upper-roman\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_liststyle" /*RemoteObject*/ ).setField ("upperRoman" /*RemoteObject*/ ,BA.ObjectToString("upper-roman"));
 BA.debugLineNum = 35;BA.debugLine="ListStyle.lowerRoman = \"lower-roman\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_liststyle" /*RemoteObject*/ ).setField ("lowerRoman" /*RemoteObject*/ ,BA.ObjectToString("lower-roman"));
 BA.debugLineNum = 36;BA.debugLine="ListStyle.none = \"none\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_liststyle" /*RemoteObject*/ ).setField ("none" /*RemoteObject*/ ,BA.ObjectToString("none"));
 BA.debugLineNum = 37;BA.debugLine="pageOrientation = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,BA.ObjectToString(pdflist.__c.getField(false,"Null")));
 BA.debugLineNum = 38;BA.debugLine="Style = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_style" /*RemoteObject*/ ,BA.ObjectToString(pdflist.__c.getField(false,"Null")));
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
public static RemoteObject  _setabsoluteposition(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetAbsolutePosition (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setabsoluteposition")) { return __ref.runUserSub(false, "pdflist","setabsoluteposition", __ref, _x, _y);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 99;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = pdflist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 101;BA.debugLine="opt.Put(\"x\", x)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 102;BA.debugLine="opt.Put(\"y\", y)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 103;BA.debugLine="listX.Put(\"absolutePosition\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("absolutePosition"))),(Object)((_opt.getObject())));
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
public static RemoteObject  _setmargin(RemoteObject __ref,RemoteObject _l,RemoteObject _t,RemoteObject _r,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMargin (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "pdflist","setmargin", __ref, _l, _t, _r, _b);}
RemoteObject _margin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 109;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_l = BA.numberCast(int.class, 0);Debug.locals.put("l", _l);};
 BA.debugLineNum = 111;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_t = BA.numberCast(int.class, 0);Debug.locals.put("t", _t);};
 BA.debugLineNum = 112;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_r = BA.numberCast(int.class, 0);Debug.locals.put("r", _r);};
 BA.debugLineNum = 113;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_b = BA.numberCast(int.class, 0);Debug.locals.put("b", _b);};
 BA.debugLineNum = 114;BA.debugLine="Dim margin As List";
Debug.JustUpdateDeviceLine();
_margin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("margin", _margin);
 BA.debugLineNum = 115;BA.debugLine="margin.Initialize";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("Initialize");
 BA.debugLineNum = 116;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("AddAll",(Object)(pdflist.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_l),(_t),(_r),(_b)})))));
 BA.debugLineNum = 117;BA.debugLine="listX.Put(\"margin\", margin)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("margin"))),(Object)((_margin.getObject())));
 BA.debugLineNum = 118;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 119;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageBreakAfter (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setpagebreakafter")) { return __ref.runUserSub(false, "pdflist","setpagebreakafter", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Sub SetPageBreakAfter As PDFList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="listX.Put(\"pageBreak\", \"after\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));
 BA.debugLineNum = 76;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _setpagebreakbefore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPageBreakBefore (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setpagebreakbefore")) { return __ref.runUserSub(false, "pdflist","setpagebreakbefore", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Sub SetPageBreakBefore As PDFList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="listX.Put(\"pageBreak\", \"before\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listx" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));
 BA.debugLineNum = 70;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageOrientation (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setpageorientation")) { return __ref.runUserSub(false, "pdflist","setpageorientation", __ref, _spageorientation);}
Debug.locals.put("spageOrientation", _spageorientation);
 BA.debugLineNum = 92;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="If spageOrientation = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_spageorientation,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 94;BA.debugLine="pageOrientation = spageOrientation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,_spageorientation);
 BA.debugLineNum = 95;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settype(RemoteObject __ref,RemoteObject _typeoflist) throws Exception{
try {
		Debug.PushSubsStack("SetType (pdflist) ","pdflist",18,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("settype")) { return __ref.runUserSub(false, "pdflist","settype", __ref, _typeoflist);}
Debug.locals.put("typeOfList", _typeoflist);
 BA.debugLineNum = 42;BA.debugLine="Sub SetType(typeOfList As String) As PDFList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="If typeOfList = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_typeoflist,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 44;BA.debugLine="Style = typeOfList";
Debug.JustUpdateDeviceLine();
__ref.setField ("_style" /*RemoteObject*/ ,_typeoflist);
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
}