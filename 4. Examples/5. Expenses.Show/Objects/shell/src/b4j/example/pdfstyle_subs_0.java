package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfstyle_subs_0 {


public static RemoteObject  _addstyle(RemoteObject __ref,RemoteObject _stylename) throws Exception{
try {
		Debug.PushSubsStack("AddStyle (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("addstyle")) { return __ref.runUserSub(false, "pdfstyle","addstyle", __ref, _stylename);}
Debug.locals.put("styleName", _stylename);
 BA.debugLineNum = 133;BA.debugLine="Sub AddStyle(styleName As String) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="styles.Add(styleName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_styles" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_stylename)));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public fontSize As Int";
pdfstyle._fontsize = RemoteObject.createImmutable(0);__ref.setField("_fontsize",pdfstyle._fontsize);
 //BA.debugLineNum = 4;BA.debugLine="Public bold As Boolean";
pdfstyle._bold = RemoteObject.createImmutable(false);__ref.setField("_bold",pdfstyle._bold);
 //BA.debugLineNum = 5;BA.debugLine="Public italics As Boolean";
pdfstyle._italics = RemoteObject.createImmutable(false);__ref.setField("_italics",pdfstyle._italics);
 //BA.debugLineNum = 6;BA.debugLine="Public alignmentRight As Boolean";
pdfstyle._alignmentright = RemoteObject.createImmutable(false);__ref.setField("_alignmentright",pdfstyle._alignmentright);
 //BA.debugLineNum = 7;BA.debugLine="Public alignmentCenter As Boolean";
pdfstyle._alignmentcenter = RemoteObject.createImmutable(false);__ref.setField("_alignmentcenter",pdfstyle._alignmentcenter);
 //BA.debugLineNum = 8;BA.debugLine="Public alignmentJustify As Boolean";
pdfstyle._alignmentjustify = RemoteObject.createImmutable(false);__ref.setField("_alignmentjustify",pdfstyle._alignmentjustify);
 //BA.debugLineNum = 9;BA.debugLine="Public color As String";
pdfstyle._color = RemoteObject.createImmutable("");__ref.setField("_color",pdfstyle._color);
 //BA.debugLineNum = 10;BA.debugLine="Public name As String";
pdfstyle._name = RemoteObject.createImmutable("");__ref.setField("_name",pdfstyle._name);
 //BA.debugLineNum = 11;BA.debugLine="Public width As String";
pdfstyle._width = RemoteObject.createImmutable("");__ref.setField("_width",pdfstyle._width);
 //BA.debugLineNum = 12;BA.debugLine="Public height As String";
pdfstyle._height = RemoteObject.createImmutable("");__ref.setField("_height",pdfstyle._height);
 //BA.debugLineNum = 13;BA.debugLine="Public opacity As Double";
pdfstyle._opacity = RemoteObject.createImmutable(0);__ref.setField("_opacity",pdfstyle._opacity);
 //BA.debugLineNum = 14;BA.debugLine="Public angle As Double";
pdfstyle._angle = RemoteObject.createImmutable(0);__ref.setField("_angle",pdfstyle._angle);
 //BA.debugLineNum = 15;BA.debugLine="Private m As Map";
pdfstyle._m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_m",pdfstyle._m);
 //BA.debugLineNum = 16;BA.debugLine="Private styles As List";
pdfstyle._styles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_styles",pdfstyle._styles);
 //BA.debugLineNum = 17;BA.debugLine="Public columnGap As Int";
pdfstyle._columngap = RemoteObject.createImmutable(0);__ref.setField("_columngap",pdfstyle._columngap);
 //BA.debugLineNum = 18;BA.debugLine="Public fillColor As String";
pdfstyle._fillcolor = RemoteObject.createImmutable("");__ref.setField("_fillcolor",pdfstyle._fillcolor);
 //BA.debugLineNum = 19;BA.debugLine="Public background As String";
pdfstyle._background = RemoteObject.createImmutable("");__ref.setField("_background",pdfstyle._background);
 //BA.debugLineNum = 20;BA.debugLine="Private BANano As BANano   'ignore";
pdfstyle._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",pdfstyle._banano);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdfstyle","getcontent", __ref);}
 BA.debugLineNum = 179;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 180;BA.debugLine="If fontSize <> Null Then m.put(\"fontSize\", fontSi";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_fontsize" /*RemoteObject*/ ),BA.numberCast(double.class, pdfstyle.__c.getField(false,"Null")))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fontSize"))),(Object)((__ref.getField(true,"_fontsize" /*RemoteObject*/ ))));};
 BA.debugLineNum = 181;BA.debugLine="If bold <> Null Then m.Put(\"bold\", bold)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_bold" /*RemoteObject*/ ),BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bold"))),(Object)((__ref.getField(true,"_bold" /*RemoteObject*/ ))));};
 BA.debugLineNum = 182;BA.debugLine="If italics <> Null Then m.Put(\"italics\", italics)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_italics" /*RemoteObject*/ ),BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("italics"))),(Object)((__ref.getField(true,"_italics" /*RemoteObject*/ ))));};
 BA.debugLineNum = 183;BA.debugLine="If alignmentRight <> Null Then m.Put(\"alignment\",";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_alignmentright" /*RemoteObject*/ ),BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alignment"))),(Object)((RemoteObject.createImmutable("right"))));};
 BA.debugLineNum = 184;BA.debugLine="If alignmentCenter <> Null Then m.Put(\"alignment\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_alignmentcenter" /*RemoteObject*/ ),BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alignment"))),(Object)((RemoteObject.createImmutable("center"))));};
 BA.debugLineNum = 185;BA.debugLine="If alignmentJustify <> Null Then m.Put(\"alignment";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_alignmentjustify" /*RemoteObject*/ ),BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alignment"))),(Object)((RemoteObject.createImmutable("justify"))));};
 BA.debugLineNum = 186;BA.debugLine="If color <> Null Then m.Put(\"color\", color)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_color" /*RemoteObject*/ ))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("color"))),(Object)((__ref.getField(true,"_color" /*RemoteObject*/ ))));};
 BA.debugLineNum = 187;BA.debugLine="If opacity <> Null Then m.Put(\"opacity\", opacity)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_opacity" /*RemoteObject*/ ),BA.numberCast(double.class, pdfstyle.__c.getField(false,"Null")))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("opacity"))),(Object)((__ref.getField(true,"_opacity" /*RemoteObject*/ ))));};
 BA.debugLineNum = 188;BA.debugLine="If angle <> Null Then m.Put(\"angle\", angle)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_angle" /*RemoteObject*/ ),BA.numberCast(double.class, pdfstyle.__c.getField(false,"Null")))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("angle"))),(Object)((__ref.getField(true,"_angle" /*RemoteObject*/ ))));};
 BA.debugLineNum = 189;BA.debugLine="If width <> Null Then m.Put(\"width\", width)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_width" /*RemoteObject*/ ))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((__ref.getField(true,"_width" /*RemoteObject*/ ))));};
 BA.debugLineNum = 190;BA.debugLine="If height <> Null Then m.Put(\"height\", height)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_height" /*RemoteObject*/ ))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)((__ref.getField(true,"_height" /*RemoteObject*/ ))));};
 BA.debugLineNum = 191;BA.debugLine="If columnGap <> Null Then m.Put(\"columnGap\", colu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_columngap" /*RemoteObject*/ ),BA.numberCast(double.class, pdfstyle.__c.getField(false,"Null")))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("columnGap"))),(Object)((__ref.getField(true,"_columngap" /*RemoteObject*/ ))));};
 BA.debugLineNum = 192;BA.debugLine="If fillColor <> Null Then m.Put(\"fillColor\", fill";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_fillcolor" /*RemoteObject*/ ))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fillColor"))),(Object)((__ref.getField(true,"_fillcolor" /*RemoteObject*/ ))));};
 BA.debugLineNum = 193;BA.debugLine="If background <> Null Then m.Put(\"background\", ba";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_background" /*RemoteObject*/ ))) { 
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("background"))),(Object)((__ref.getField(true,"_background" /*RemoteObject*/ ))));};
 BA.debugLineNum = 194;BA.debugLine="If styles.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_styles" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 195;BA.debugLine="m.Put(\"style\", styles)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("style"))),(Object)((__ref.getField(false,"_styles" /*RemoteObject*/ ).getObject())));
 };
 BA.debugLineNum = 197;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_m" /*RemoteObject*/ );
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _include(RemoteObject __ref,RemoteObject _target) throws Exception{
try {
		Debug.PushSubsStack("Include (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("include")) { return __ref.runUserSub(false, "pdfstyle","include", __ref, _target);}
RemoteObject _source = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("target", _target);
 BA.debugLineNum = 201;BA.debugLine="Sub Include(target As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 202;BA.debugLine="Dim source As Map = getContent";
Debug.JustUpdateDeviceLine();
_source = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_source = __ref.runClassMethod (b4j.example.pdfstyle.class, "_getcontent" /*RemoteObject*/ );Debug.locals.put("source", _source);Debug.locals.put("source", _source);
 BA.debugLineNum = 203;BA.debugLine="For Each k As String In source.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _source.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 204;BA.debugLine="Dim v As Object = source.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _source.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 205;BA.debugLine="target.Put(k, v)";
Debug.JustUpdateDeviceLine();
_target.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfstyle","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="name = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_name" /*RemoteObject*/ ,BA.ObjectToString(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 27;BA.debugLine="fillColor = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fillcolor" /*RemoteObject*/ ,BA.ObjectToString(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 28;BA.debugLine="background = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_background" /*RemoteObject*/ ,BA.ObjectToString(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 29;BA.debugLine="fontSize = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fontsize" /*RemoteObject*/ ,BA.numberCast(int.class, pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 30;BA.debugLine="bold = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bold" /*RemoteObject*/ ,BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 31;BA.debugLine="italics = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_italics" /*RemoteObject*/ ,BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 32;BA.debugLine="alignmentRight = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_alignmentright" /*RemoteObject*/ ,BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 33;BA.debugLine="alignmentCenter = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_alignmentcenter" /*RemoteObject*/ ,BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 34;BA.debugLine="alignmentJustify = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_alignmentjustify" /*RemoteObject*/ ,BA.ObjectToBoolean(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 35;BA.debugLine="color = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_color" /*RemoteObject*/ ,BA.ObjectToString(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 36;BA.debugLine="width = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_width" /*RemoteObject*/ ,BA.ObjectToString(pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 37;BA.debugLine="opacity = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_opacity" /*RemoteObject*/ ,BA.numberCast(double.class, pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 38;BA.debugLine="angle = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_angle" /*RemoteObject*/ ,BA.numberCast(double.class, pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 39;BA.debugLine="styles.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_styles" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="columnGap = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_columngap" /*RemoteObject*/ ,BA.numberCast(int.class, pdfstyle.__c.getField(false,"Null")));
 BA.debugLineNum = 41;BA.debugLine="height = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_height" /*RemoteObject*/ ,BA.ObjectToString(pdfstyle.__c.getField(false,"Null")));
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
public static RemoteObject  _noborder(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("NoBorder (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("noborder")) { return __ref.runUserSub(false, "pdfstyle","noborder", __ref);}
 BA.debugLineNum = 152;BA.debugLine="Sub NoBorder As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="m.Put(\"border\", BANano.UNDEFINED)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border"))),(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")));
 BA.debugLineNum = 154;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _setalignment(RemoteObject __ref,RemoteObject _alignment) throws Exception{
try {
		Debug.PushSubsStack("SetAlignment (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setalignment")) { return __ref.runUserSub(false, "pdfstyle","setalignment", __ref, _alignment);}
Debug.locals.put("alignment", _alignment);
 BA.debugLineNum = 96;BA.debugLine="Sub SetAlignment(alignment As String) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="If alignment = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_alignment,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 98;BA.debugLine="m.Put(\"alignment\", alignment)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("alignment"))),(Object)((_alignment)));
 BA.debugLineNum = 99;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAngle (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setangle")) { return __ref.runUserSub(false, "pdfstyle","setangle", __ref, _dangle);}
Debug.locals.put("dangle", _dangle);
 BA.debugLineNum = 53;BA.debugLine="Sub SetAngle(dangle As Double) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="If dangle = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_dangle,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 55;BA.debugLine="angle = dangle";
Debug.JustUpdateDeviceLine();
__ref.setField ("_angle" /*RemoteObject*/ ,_dangle);
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
public static RemoteObject  _setbackground(RemoteObject __ref,RemoteObject _sbackground) throws Exception{
try {
		Debug.PushSubsStack("SetBackground (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setbackground")) { return __ref.runUserSub(false, "pdfstyle","setbackground", __ref, _sbackground);}
Debug.locals.put("sbackground", _sbackground);
 BA.debugLineNum = 88;BA.debugLine="Sub SetBackground(sbackground As String) As PDFSty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="If sbackground = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sbackground,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 90;BA.debugLine="background = sbackground";
Debug.JustUpdateDeviceLine();
__ref.setField ("_background" /*RemoteObject*/ ,_sbackground);
 BA.debugLineNum = 91;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBold (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setbold")) { return __ref.runUserSub(false, "pdfstyle","setbold", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 118;BA.debugLine="Sub SetBold(b As Boolean) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,pdfstyle.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 120;BA.debugLine="bold = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bold" /*RemoteObject*/ ,_b);
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _l,RemoteObject _t,RemoteObject _r,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "pdfstyle","setborder", __ref, _l, _t, _r, _b);}
RemoteObject _margin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 158;BA.debugLine="Sub SetBorder(l As Boolean, t As Boolean, r As Boo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l,BA.ObjectToBoolean(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_l = BA.ObjectToBoolean(0);Debug.locals.put("l", _l);};
 BA.debugLineNum = 160;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToBoolean(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_t = BA.ObjectToBoolean(0);Debug.locals.put("t", _t);};
 BA.debugLineNum = 161;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_r,BA.ObjectToBoolean(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_r = BA.ObjectToBoolean(0);Debug.locals.put("r", _r);};
 BA.debugLineNum = 162;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,BA.ObjectToBoolean(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_b = BA.ObjectToBoolean(0);Debug.locals.put("b", _b);};
 BA.debugLineNum = 163;BA.debugLine="Dim margin As List";
Debug.JustUpdateDeviceLine();
_margin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("margin", _margin);
 BA.debugLineNum = 164;BA.debugLine="margin.Initialize";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("Initialize");
 BA.debugLineNum = 165;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("AddAll",(Object)(pdfstyle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_l),(_t),(_r),(_b)})))));
 BA.debugLineNum = 166;BA.debugLine="m.Put(\"border\", margin)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border"))),(Object)((_margin.getObject())));
 BA.debugLineNum = 167;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _scolor) throws Exception{
try {
		Debug.PushSubsStack("SetColor (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "pdfstyle","setcolor", __ref, _scolor);}
Debug.locals.put("scolor", _scolor);
 BA.debugLineNum = 81;BA.debugLine="Sub SetColor(scolor As String) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="If scolor = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_scolor,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 83;BA.debugLine="color = scolor";
Debug.JustUpdateDeviceLine();
__ref.setField ("_color" /*RemoteObject*/ ,_scolor);
 BA.debugLineNum = 84;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumngap(RemoteObject __ref,RemoteObject _icolumngap) throws Exception{
try {
		Debug.PushSubsStack("SetColumnGap (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setcolumngap")) { return __ref.runUserSub(false, "pdfstyle","setcolumngap", __ref, _icolumngap);}
Debug.locals.put("icolumnGap", _icolumngap);
 BA.debugLineNum = 46;BA.debugLine="Sub SetColumnGap(icolumnGap As Int) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="If icolumnGap = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_icolumngap,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 48;BA.debugLine="columnGap = icolumnGap";
Debug.JustUpdateDeviceLine();
__ref.setField ("_columngap" /*RemoteObject*/ ,_icolumngap);
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
public static RemoteObject  _setfillcolor(RemoteObject __ref,RemoteObject _fc) throws Exception{
try {
		Debug.PushSubsStack("SetFillColor (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("setfillcolor")) { return __ref.runUserSub(false, "pdfstyle","setfillcolor", __ref, _fc);}
Debug.locals.put("fc", _fc);
 BA.debugLineNum = 171;BA.debugLine="Sub SetFillColor(fc As String) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 172;BA.debugLine="If fc = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_fc,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 173;BA.debugLine="fillColor = fc";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fillcolor" /*RemoteObject*/ ,_fc);
 BA.debugLineNum = 174;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfontsize(RemoteObject __ref,RemoteObject _ifontsize) throws Exception{
try {
		Debug.PushSubsStack("SetFontSize (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("setfontsize")) { return __ref.runUserSub(false, "pdfstyle","setfontsize", __ref, _ifontsize);}
Debug.locals.put("ifontSize", _ifontsize);
 BA.debugLineNum = 125;BA.debugLine="Sub SetFontSize(ifontSize As Int) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="If ifontSize = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ifontsize,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 127;BA.debugLine="fontSize = ifontSize";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fontsize" /*RemoteObject*/ ,_ifontsize);
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
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "pdfstyle","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 74;BA.debugLine="Sub SetHeight(h As Int) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="If h = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_h,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 76;BA.debugLine="height = h";
Debug.JustUpdateDeviceLine();
__ref.setField ("_height" /*RemoteObject*/ ,BA.NumberToString(_h));
 BA.debugLineNum = 77;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetItalics (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("setitalics")) { return __ref.runUserSub(false, "pdfstyle","setitalics", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 111;BA.debugLine="Sub SetItalics(b As Boolean) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,pdfstyle.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 113;BA.debugLine="italics = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_italics" /*RemoteObject*/ ,_b);
 BA.debugLineNum = 114;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 115;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMargin (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "pdfstyle","setmargin", __ref, _l, _t, _r, _b);}
RemoteObject _margin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 139;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_l = BA.numberCast(int.class, 0);Debug.locals.put("l", _l);};
 BA.debugLineNum = 141;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_t = BA.numberCast(int.class, 0);Debug.locals.put("t", _t);};
 BA.debugLineNum = 142;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_r = BA.numberCast(int.class, 0);Debug.locals.put("r", _r);};
 BA.debugLineNum = 143;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_b = BA.numberCast(int.class, 0);Debug.locals.put("b", _b);};
 BA.debugLineNum = 144;BA.debugLine="Dim margin As List";
Debug.JustUpdateDeviceLine();
_margin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("margin", _margin);
 BA.debugLineNum = 145;BA.debugLine="margin.Initialize";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("Initialize");
 BA.debugLineNum = 146;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("AddAll",(Object)(pdfstyle.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_l),(_t),(_r),(_b)})))));
 BA.debugLineNum = 147;BA.debugLine="m.Put(\"margin\", margin)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_m" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("margin"))),(Object)((_margin.getObject())));
 BA.debugLineNum = 148;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("SetName (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "pdfstyle","setname", __ref, _sname);}
Debug.locals.put("sname", _sname);
 BA.debugLineNum = 103;BA.debugLine="Sub SetName(sname As String) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="If sname = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_sname,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 105;BA.debugLine="name = sname";
Debug.JustUpdateDeviceLine();
__ref.setField ("_name" /*RemoteObject*/ ,_sname);
 BA.debugLineNum = 106;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 107;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOpacity (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("setopacity")) { return __ref.runUserSub(false, "pdfstyle","setopacity", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 60;BA.debugLine="Sub SetOpacity(o As Double) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="If o = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_o,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 62;BA.debugLine="opacity = o";
Debug.JustUpdateDeviceLine();
__ref.setField ("_opacity" /*RemoteObject*/ ,_o);
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
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (pdfstyle) ","pdfstyle",25,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "pdfstyle","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 67;BA.debugLine="Sub SetWidth(w As Int) As PDFStyle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="If w = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_w,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 69;BA.debugLine="width = w";
Debug.JustUpdateDeviceLine();
__ref.setField ("_width" /*RemoteObject*/ ,BA.NumberToString(_w));
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
}