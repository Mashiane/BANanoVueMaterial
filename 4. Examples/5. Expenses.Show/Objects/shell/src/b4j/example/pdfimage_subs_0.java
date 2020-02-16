package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfimage_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private options As Map";
pdfimage._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",pdfimage._options);
 //BA.debugLineNum = 4;BA.debugLine="Public image As String";
pdfimage._image = RemoteObject.createImmutable("");__ref.setField("_image",pdfimage._image);
 //BA.debugLineNum = 5;BA.debugLine="Public width As Int";
pdfimage._width = RemoteObject.createImmutable(0);__ref.setField("_width",pdfimage._width);
 //BA.debugLineNum = 6;BA.debugLine="Public height As Int";
pdfimage._height = RemoteObject.createImmutable(0);__ref.setField("_height",pdfimage._height);
 //BA.debugLineNum = 7;BA.debugLine="Public pageBreakAfter As Boolean";
pdfimage._pagebreakafter = RemoteObject.createImmutable(false);__ref.setField("_pagebreakafter",pdfimage._pagebreakafter);
 //BA.debugLineNum = 8;BA.debugLine="Public pageBreakBefore As Boolean";
pdfimage._pagebreakbefore = RemoteObject.createImmutable(false);__ref.setField("_pagebreakbefore",pdfimage._pagebreakbefore);
 //BA.debugLineNum = 9;BA.debugLine="Public pageOrientation As String";
pdfimage._pageorientation = RemoteObject.createImmutable("");__ref.setField("_pageorientation",pdfimage._pageorientation);
 //BA.debugLineNum = 10;BA.debugLine="Private BANano As BANano  'ignore";
pdfimage._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",pdfimage._banano);
 //BA.debugLineNum = 11;BA.debugLine="Public link As String";
pdfimage._link = RemoteObject.createImmutable("");__ref.setField("_link",pdfimage._link);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdfimage","getcontent", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="If image <> Null Then options.Put(\"image\", image)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_image" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("image"))),(Object)((__ref.getField(true,"_image" /*RemoteObject*/ ))));};
 BA.debugLineNum = 105;BA.debugLine="If width <> Null Then options.Put(\"width\", width)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_width" /*RemoteObject*/ ),BA.numberCast(double.class, pdfimage.__c.getField(false,"Null")))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((__ref.getField(true,"_width" /*RemoteObject*/ ))));};
 BA.debugLineNum = 106;BA.debugLine="If height <> Null Then options.Put(\"height\", heig";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_height" /*RemoteObject*/ ),BA.numberCast(double.class, pdfimage.__c.getField(false,"Null")))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)((__ref.getField(true,"_height" /*RemoteObject*/ ))));};
 BA.debugLineNum = 107;BA.debugLine="If pageBreakAfter <> Null Then options.Put(\"pageB";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_pagebreakafter" /*RemoteObject*/ ),BA.ObjectToBoolean(pdfimage.__c.getField(false,"Null")))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));};
 BA.debugLineNum = 108;BA.debugLine="If pageBreakBefore <> Null Then options.Put(\"page";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_pagebreakbefore" /*RemoteObject*/ ),BA.ObjectToBoolean(pdfimage.__c.getField(false,"Null")))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));};
 BA.debugLineNum = 109;BA.debugLine="If link <> Null Then options.Put(\"link\", link)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_link" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("link"))),(Object)((__ref.getField(true,"_link" /*RemoteObject*/ ))));};
 BA.debugLineNum = 110;BA.debugLine="Return options";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_options" /*RemoteObject*/ );
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfimage","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 16;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 17;BA.debugLine="image = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_image" /*RemoteObject*/ ,BA.ObjectToString(pdfimage.__c.getField(false,"Null")));
 BA.debugLineNum = 18;BA.debugLine="width = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_width" /*RemoteObject*/ ,BA.numberCast(int.class, pdfimage.__c.getField(false,"Null")));
 BA.debugLineNum = 19;BA.debugLine="height = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_height" /*RemoteObject*/ ,BA.numberCast(int.class, pdfimage.__c.getField(false,"Null")));
 BA.debugLineNum = 20;BA.debugLine="pageBreakAfter = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pagebreakafter" /*RemoteObject*/ ,BA.ObjectToBoolean(pdfimage.__c.getField(false,"Null")));
 BA.debugLineNum = 21;BA.debugLine="pageBreakBefore = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pagebreakbefore" /*RemoteObject*/ ,BA.ObjectToBoolean(pdfimage.__c.getField(false,"Null")));
 BA.debugLineNum = 22;BA.debugLine="pageOrientation = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,BA.ObjectToString(pdfimage.__c.getField(false,"Null")));
 BA.debugLineNum = 23;BA.debugLine="link = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_link" /*RemoteObject*/ ,BA.ObjectToString(pdfimage.__c.getField(false,"Null")));
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
public static RemoteObject  _setabsoluteposition(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("SetAbsolutePosition (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setabsoluteposition")) { return __ref.runUserSub(false, "pdfimage","setabsoluteposition", __ref, _x, _y);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 68;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="If x > 0 And y > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_x,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_y,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 70;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = pdfimage.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 71;BA.debugLine="opt.Put(\"x\", x)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 72;BA.debugLine="opt.Put(\"y\", y)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 73;BA.debugLine="options.Put(\"absolutePosition\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("absolutePosition"))),(Object)((_opt.getObject())));
 };
 BA.debugLineNum = 75;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfit(RemoteObject __ref,RemoteObject _w,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetFit (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("setfit")) { return __ref.runUserSub(false, "pdfimage","setfit", __ref, _w, _h);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("w", _w);
Debug.locals.put("h", _h);
 BA.debugLineNum = 79;BA.debugLine="Sub SetFit(w As Int, h As Int) As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="If w > 0 And h > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_w,BA.numberCast(double.class, 0)) && RemoteObject.solveBoolean(">",_h,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 81;BA.debugLine="Dim lst As List";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 82;BA.debugLine="lst.Initialize";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="lst.Add(w)";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Add",(Object)((_w)));
 BA.debugLineNum = 84;BA.debugLine="lst.Add(h)";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Add",(Object)((_h)));
 BA.debugLineNum = 85;BA.debugLine="options.Put(\"fit\", lst)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fit"))),(Object)((_lst.getObject())));
 };
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
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "pdfimage","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 47;BA.debugLine="Sub SetHeight(h As Int) As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="If h = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_h,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 49;BA.debugLine="height = h";
Debug.JustUpdateDeviceLine();
__ref.setField ("_height" /*RemoteObject*/ ,_h);
 BA.debugLineNum = 50;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _setimage(RemoteObject __ref,RemoteObject _imgkey) throws Exception{
try {
		Debug.PushSubsStack("SetImage (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setimage")) { return __ref.runUserSub(false, "pdfimage","setimage", __ref, _imgkey);}
Debug.locals.put("imgKey", _imgkey);
 BA.debugLineNum = 54;BA.debugLine="Sub SetImage(imgKey As String) As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="If imgKey = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_imgkey,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 56;BA.debugLine="image = imgKey";
Debug.JustUpdateDeviceLine();
__ref.setField ("_image" /*RemoteObject*/ ,_imgkey);
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
public static RemoteObject  _setlink(RemoteObject __ref,RemoteObject _slink) throws Exception{
try {
		Debug.PushSubsStack("SetLink (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("setlink")) { return __ref.runUserSub(false, "pdfimage","setlink", __ref, _slink);}
Debug.locals.put("slink", _slink);
 BA.debugLineNum = 27;BA.debugLine="Sub SetLink(slink As String) As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="If slink = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_slink,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 29;BA.debugLine="link = slink";
Debug.JustUpdateDeviceLine();
__ref.setField ("_link" /*RemoteObject*/ ,_slink);
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
public static RemoteObject  _setmargin(RemoteObject __ref,RemoteObject _l,RemoteObject _t,RemoteObject _r,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMargin (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "pdfimage","setmargin", __ref, _l, _t, _r, _b);}
RemoteObject _margin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 115;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_l = BA.numberCast(int.class, 0);Debug.locals.put("l", _l);};
 BA.debugLineNum = 117;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_t = BA.numberCast(int.class, 0);Debug.locals.put("t", _t);};
 BA.debugLineNum = 118;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_r = BA.numberCast(int.class, 0);Debug.locals.put("r", _r);};
 BA.debugLineNum = 119;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_b = BA.numberCast(int.class, 0);Debug.locals.put("b", _b);};
 BA.debugLineNum = 120;BA.debugLine="Dim margin As List";
Debug.JustUpdateDeviceLine();
_margin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("margin", _margin);
 BA.debugLineNum = 121;BA.debugLine="margin.Initialize";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("Initialize");
 BA.debugLineNum = 122;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("AddAll",(Object)(pdfimage.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_l),(_t),(_r),(_b)})))));
 BA.debugLineNum = 123;BA.debugLine="options.Put(\"margin\", margin)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("margin"))),(Object)((_margin.getObject())));
 BA.debugLineNum = 124;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setopacity(RemoteObject __ref,RemoteObject _opacity) throws Exception{
try {
		Debug.PushSubsStack("SetOpacity (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setopacity")) { return __ref.runUserSub(false, "pdfimage","setopacity", __ref, _opacity);}
Debug.locals.put("opacity", _opacity);
 BA.debugLineNum = 61;BA.debugLine="Sub SetOpacity(opacity As Double) As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="If opacity > 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_opacity,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 63;BA.debugLine="options.Put(\"opacity\", opacity)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("opacity"))),(Object)((_opacity)));
 BA.debugLineNum = 64;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPageBreakAfter (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("setpagebreakafter")) { return __ref.runUserSub(false, "pdfimage","setpagebreakafter", __ref);}
 BA.debugLineNum = 97;BA.debugLine="Sub SetPageBreakAfter As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));
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
public static RemoteObject  _setpagebreakbefore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPageBreakBefore (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setpagebreakbefore")) { return __ref.runUserSub(false, "pdfimage","setpagebreakbefore", __ref);}
 BA.debugLineNum = 91;BA.debugLine="Sub SetPageBreakBefore As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));
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
public static RemoteObject  _setpageorientation(RemoteObject __ref,RemoteObject _spageorientation) throws Exception{
try {
		Debug.PushSubsStack("SetPageOrientation (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setpageorientation")) { return __ref.runUserSub(false, "pdfimage","setpageorientation", __ref, _spageorientation);}
Debug.locals.put("spageOrientation", _spageorientation);
 BA.debugLineNum = 33;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="If spageOrientation = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_spageorientation,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 35;BA.debugLine="pageOrientation = spageOrientation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,_spageorientation);
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
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (pdfimage) ","pdfimage",17,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "pdfimage","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 40;BA.debugLine="Sub SetWidth(w As Int) As PDFImage";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="If w = 0 Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_w,BA.numberCast(double.class, 0))) { 
if (true) return (__ref);};
 BA.debugLineNum = 42;BA.debugLine="width = w";
Debug.JustUpdateDeviceLine();
__ref.setField ("_width" /*RemoteObject*/ ,_w);
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
}