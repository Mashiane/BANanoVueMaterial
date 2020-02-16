package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class pdfqrcode_subs_0 {


public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim options As Map";
pdfqrcode._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",pdfqrcode._options);
 //BA.debugLineNum = 4;BA.debugLine="Public qr As String";
pdfqrcode._qr = RemoteObject.createImmutable("");__ref.setField("_qr",pdfqrcode._qr);
 //BA.debugLineNum = 5;BA.debugLine="Public foreground As String";
pdfqrcode._foreground = RemoteObject.createImmutable("");__ref.setField("_foreground",pdfqrcode._foreground);
 //BA.debugLineNum = 6;BA.debugLine="Public background As String";
pdfqrcode._background = RemoteObject.createImmutable("");__ref.setField("_background",pdfqrcode._background);
 //BA.debugLineNum = 7;BA.debugLine="Public fit As String";
pdfqrcode._fit = RemoteObject.createImmutable("");__ref.setField("_fit",pdfqrcode._fit);
 //BA.debugLineNum = 9;BA.debugLine="Public modeNumeric As Boolean";
pdfqrcode._modenumeric = RemoteObject.createImmutable(false);__ref.setField("_modenumeric",pdfqrcode._modenumeric);
 //BA.debugLineNum = 10;BA.debugLine="Public modeAlphanumeric As Boolean";
pdfqrcode._modealphanumeric = RemoteObject.createImmutable(false);__ref.setField("_modealphanumeric",pdfqrcode._modealphanumeric);
 //BA.debugLineNum = 11;BA.debugLine="Public modeOctet As Boolean";
pdfqrcode._modeoctet = RemoteObject.createImmutable(false);__ref.setField("_modeoctet",pdfqrcode._modeoctet);
 //BA.debugLineNum = 13;BA.debugLine="Public eccLevelL As Boolean";
pdfqrcode._ecclevell = RemoteObject.createImmutable(false);__ref.setField("_ecclevell",pdfqrcode._ecclevell);
 //BA.debugLineNum = 14;BA.debugLine="Public eccLevelM As Boolean";
pdfqrcode._ecclevelm = RemoteObject.createImmutable(false);__ref.setField("_ecclevelm",pdfqrcode._ecclevelm);
 //BA.debugLineNum = 15;BA.debugLine="Public eccLevelQ As Boolean";
pdfqrcode._ecclevelq = RemoteObject.createImmutable(false);__ref.setField("_ecclevelq",pdfqrcode._ecclevelq);
 //BA.debugLineNum = 16;BA.debugLine="Public eccLevelH As Boolean";
pdfqrcode._ecclevelh = RemoteObject.createImmutable(false);__ref.setField("_ecclevelh",pdfqrcode._ecclevelh);
 //BA.debugLineNum = 17;BA.debugLine="Public pageOrientation As String";
pdfqrcode._pageorientation = RemoteObject.createImmutable("");__ref.setField("_pageorientation",pdfqrcode._pageorientation);
 //BA.debugLineNum = 18;BA.debugLine="Private BANano As BANano   'ignore";
pdfqrcode._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",pdfqrcode._banano);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getcontent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getContent (pdfqrcode) ","pdfqrcode",21,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("getcontent")) { return __ref.runUserSub(false, "pdfqrcode","getcontent", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Sub getContent As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="If qr <> Null Then options.Put(\"qr\", qr)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_qr" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("qr"))),(Object)((__ref.getField(true,"_qr" /*RemoteObject*/ ))));};
 BA.debugLineNum = 69;BA.debugLine="If foreground <> Null Then options.Put(\"foregroun";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_foreground" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("foreground"))),(Object)((__ref.getField(true,"_foreground" /*RemoteObject*/ ))));};
 BA.debugLineNum = 70;BA.debugLine="If background <> Null Then options.Put(\"backgroun";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_background" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("background"))),(Object)((__ref.getField(true,"_background" /*RemoteObject*/ ))));};
 BA.debugLineNum = 71;BA.debugLine="If pageOrientation <> Null Then options.Put(\"page";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_pageorientation" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageOrientation"))),(Object)((__ref.getField(true,"_pageorientation" /*RemoteObject*/ ))));};
 BA.debugLineNum = 72;BA.debugLine="If fit <> Null Then options.Put(\"fit\", fit)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(true,"_fit" /*RemoteObject*/ ))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("fit"))),(Object)((__ref.getField(true,"_fit" /*RemoteObject*/ ))));};
 BA.debugLineNum = 75;BA.debugLine="If modeNumeric Then options.Put(\"mode\", \"numeric\"";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_modenumeric" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mode"))),(Object)((RemoteObject.createImmutable("numeric"))));};
 BA.debugLineNum = 76;BA.debugLine="If modeAlphanumeric Then options.Put(\"mode\", \"alp";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_modealphanumeric" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mode"))),(Object)((RemoteObject.createImmutable("alphanumeric"))));};
 BA.debugLineNum = 77;BA.debugLine="If modeOctet Then options.Put(\"mode\", \"octet\")";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_modeoctet" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mode"))),(Object)((RemoteObject.createImmutable("octet"))));};
 BA.debugLineNum = 78;BA.debugLine="If eccLevelL Then options.Put(\"eccLevel\", \"L\")";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ecclevell" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("eccLevel"))),(Object)((RemoteObject.createImmutable("L"))));};
 BA.debugLineNum = 79;BA.debugLine="If eccLevelM Then options.Put(\"eccLevel\", \"M\")";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ecclevelm" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("eccLevel"))),(Object)((RemoteObject.createImmutable("M"))));};
 BA.debugLineNum = 80;BA.debugLine="If eccLevelQ Then options.Put(\"eccLevel\", \"Q\")";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ecclevelq" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("eccLevel"))),(Object)((RemoteObject.createImmutable("Q"))));};
 BA.debugLineNum = 81;BA.debugLine="If eccLevelH Then options.Put(\"eccLevel\", \"H\")";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ecclevelh" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("eccLevel"))),(Object)((RemoteObject.createImmutable("H"))));};
 BA.debugLineNum = 82;BA.debugLine="Return options";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_options" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (pdfqrcode) ","pdfqrcode",21,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "pdfqrcode","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize As PDFQRCode";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 24;BA.debugLine="qr = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_qr" /*RemoteObject*/ ,BA.ObjectToString(pdfqrcode.__c.getField(false,"Null")));
 BA.debugLineNum = 25;BA.debugLine="foreground = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_foreground" /*RemoteObject*/ ,BA.ObjectToString(pdfqrcode.__c.getField(false,"Null")));
 BA.debugLineNum = 26;BA.debugLine="background = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_background" /*RemoteObject*/ ,BA.ObjectToString(pdfqrcode.__c.getField(false,"Null")));
 BA.debugLineNum = 27;BA.debugLine="pageOrientation = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,BA.ObjectToString(pdfqrcode.__c.getField(false,"Null")));
 BA.debugLineNum = 28;BA.debugLine="fit = Null";
Debug.JustUpdateDeviceLine();
__ref.setField ("_fit" /*RemoteObject*/ ,BA.ObjectToString(pdfqrcode.__c.getField(false,"Null")));
 BA.debugLineNum = 30;BA.debugLine="modeNumeric = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_modenumeric" /*RemoteObject*/ ,pdfqrcode.__c.getField(true,"False"));
 BA.debugLineNum = 31;BA.debugLine="modeAlphanumeric = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_modealphanumeric" /*RemoteObject*/ ,pdfqrcode.__c.getField(true,"False"));
 BA.debugLineNum = 32;BA.debugLine="modeOctet = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_modeoctet" /*RemoteObject*/ ,pdfqrcode.__c.getField(true,"False"));
 BA.debugLineNum = 34;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAbsolutePosition (pdfqrcode) ","pdfqrcode",21,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setabsoluteposition")) { return __ref.runUserSub(false, "pdfqrcode","setabsoluteposition", __ref, _x, _y);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("x", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 45;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = pdfqrcode.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 47;BA.debugLine="opt.Put(\"x\", x)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("x"))),(Object)((_x)));
 BA.debugLineNum = 48;BA.debugLine="opt.Put(\"y\", y)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("y"))),(Object)((_y)));
 BA.debugLineNum = 49;BA.debugLine="options.Put(\"absolutePosition\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("absolutePosition"))),(Object)((_opt.getObject())));
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
public static RemoteObject  _setmargin(RemoteObject __ref,RemoteObject _l,RemoteObject _t,RemoteObject _r,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMargin (pdfqrcode) ","pdfqrcode",21,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "pdfqrcode","setmargin", __ref, _l, _t, _r, _b);}
RemoteObject _margin = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("l", _l);
Debug.locals.put("t", _t);
Debug.locals.put("r", _r);
Debug.locals.put("b", _b);
 BA.debugLineNum = 86;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_l,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_l = BA.numberCast(int.class, 0);Debug.locals.put("l", _l);};
 BA.debugLineNum = 88;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_t = BA.numberCast(int.class, 0);Debug.locals.put("t", _t);};
 BA.debugLineNum = 89;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_r,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_r = BA.numberCast(int.class, 0);Debug.locals.put("r", _r);};
 BA.debugLineNum = 90;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,BA.numberCast(double.class, __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED")))) { 
_b = BA.numberCast(int.class, 0);Debug.locals.put("b", _b);};
 BA.debugLineNum = 91;BA.debugLine="Dim margin As List";
Debug.JustUpdateDeviceLine();
_margin = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("margin", _margin);
 BA.debugLineNum = 92;BA.debugLine="margin.Initialize";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("Initialize");
 BA.debugLineNum = 93;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
Debug.JustUpdateDeviceLine();
_margin.runVoidMethod ("AddAll",(Object)(pdfqrcode.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_l),(_t),(_r),(_b)})))));
 BA.debugLineNum = 94;BA.debugLine="options.Put(\"margin\", margin)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("margin"))),(Object)((_margin.getObject())));
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
public static RemoteObject  _setpagebreakafter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPageBreakAfter (pdfqrcode) ","pdfqrcode",21,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setpagebreakafter")) { return __ref.runUserSub(false, "pdfqrcode","setpagebreakafter", __ref);}
 BA.debugLineNum = 61;BA.debugLine="Sub SetPageBreakAfter As PDFQRCode";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("after"))));
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
public static RemoteObject  _setpagebreakbefore(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPageBreakBefore (pdfqrcode) ","pdfqrcode",21,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setpagebreakbefore")) { return __ref.runUserSub(false, "pdfqrcode","setpagebreakbefore", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Sub SetPageBreakBefore As PDFQRCode";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pageBreak"))),(Object)((RemoteObject.createImmutable("before"))));
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
public static RemoteObject  _setpageorientation(RemoteObject __ref,RemoteObject _spageorientation) throws Exception{
try {
		Debug.PushSubsStack("SetPageOrientation (pdfqrcode) ","pdfqrcode",21,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setpageorientation")) { return __ref.runUserSub(false, "pdfqrcode","setpageorientation", __ref, _spageorientation);}
Debug.locals.put("spageOrientation", _spageorientation);
 BA.debugLineNum = 38;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="If spageOrientation = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_spageorientation,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 40;BA.debugLine="pageOrientation = spageOrientation";
Debug.JustUpdateDeviceLine();
__ref.setField ("_pageorientation" /*RemoteObject*/ ,_spageorientation);
 BA.debugLineNum = 41;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
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