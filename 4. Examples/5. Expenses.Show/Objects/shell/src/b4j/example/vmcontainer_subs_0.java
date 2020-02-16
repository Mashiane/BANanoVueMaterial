package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmcontainer_subs_0 {


public static RemoteObject  _addbooleans(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("AddBooleans (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,981);
if (RapidSub.canDelegate("addbooleans")) { return __ref.runUserSub(false, "vmcontainer","addbooleans", __ref, _i);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("i", _i);
 BA.debugLineNum = 981;BA.debugLine="Sub AddBooleans(i As List) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 982;BA.debugLine="For Each s As String In i";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _i;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 983;BA.debugLine="Booleans.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_booleans" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 985;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 986;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddBR (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("addbr")) { return __ref.runUserSub(false, "vmcontainer","addbr", __ref);}
 BA.debugLineNum = 129;BA.debugLine="Sub AddBR As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="Container.addbr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addbr" /*RemoteObject*/ );
 BA.debugLineNum = 131;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmcontainer","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 134;BA.debugLine="Sub AddClass(c As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="Container.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 136;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumnosmp(RemoteObject __ref,RemoteObject _icolumns,RemoteObject _ioffsetsmall,RemoteObject _ioffsetmedium,RemoteObject _ioffsetlarge,RemoteObject _ioffsetxlarge,RemoteObject _isizesmall,RemoteObject _isizemedium,RemoteObject _isizelarge,RemoteObject _isizexlarge,RemoteObject _sthemename,RemoteObject _svisibility,RemoteObject _sclassname) throws Exception{
try {
		Debug.PushSubsStack("AddColumnOSMP (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("addcolumnosmp")) { return __ref.runUserSub(false, "vmcontainer","addcolumnosmp", __ref, _icolumns, _ioffsetsmall, _ioffsetmedium, _ioffsetlarge, _ioffsetxlarge, _isizesmall, _isizemedium, _isizelarge, _isizexlarge, _sthemename, _svisibility, _sclassname);}
Debug.locals.put("iColumns", _icolumns);
Debug.locals.put("iOffsetSmall", _ioffsetsmall);
Debug.locals.put("iOffsetMedium", _ioffsetmedium);
Debug.locals.put("iOffsetLarge", _ioffsetlarge);
Debug.locals.put("iOffsetXLarge", _ioffsetxlarge);
Debug.locals.put("iSizeSmall", _isizesmall);
Debug.locals.put("iSizeMedium", _isizemedium);
Debug.locals.put("iSizeLarge", _isizelarge);
Debug.locals.put("iSizeXLarge", _isizexlarge);
Debug.locals.put("sThemeName", _sthemename);
Debug.locals.put("sVisibility", _svisibility);
Debug.locals.put("sClassName", _sclassname);
 BA.debugLineNum = 232;BA.debugLine="Sub AddColumnOSMP(iColumns As Int, iOffsetSmall As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Grid.AddColumnOSMP(iColumns, iOffsetSmall, iOffse";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumnosmp" /*RemoteObject*/ ,(Object)(_icolumns),(Object)(_ioffsetsmall),(Object)(_ioffsetmedium),(Object)(_ioffsetlarge),(Object)(_ioffsetxlarge),(Object)(_isizesmall),(Object)(_isizemedium),(Object)(_isizelarge),(Object)(_isizexlarge),(Object)(_sthemename),(Object)(_svisibility),(Object)(_sclassname));
 BA.debugLineNum = 236;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns(RemoteObject __ref,RemoteObject _icolumns,RemoteObject _sizesmall,RemoteObject _sizemedium,RemoteObject _sizelarge,RemoteObject _sizexlarge) throws Exception{
try {
		Debug.PushSubsStack("AddColumns (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("addcolumns")) { return __ref.runUserSub(false, "vmcontainer","addcolumns", __ref, _icolumns, _sizesmall, _sizemedium, _sizelarge, _sizexlarge);}
Debug.locals.put("iColumns", _icolumns);
Debug.locals.put("SizeSmall", _sizesmall);
Debug.locals.put("SizeMedium", _sizemedium);
Debug.locals.put("SizeLarge", _sizelarge);
Debug.locals.put("SizeXLarge", _sizexlarge);
 BA.debugLineNum = 333;BA.debugLine="Sub AddColumns(iColumns As Int, SizeSmall As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 334;BA.debugLine="Grid.AddColumns(iColumns,SizeSmall, SizeMedium, S";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(_icolumns),(Object)(_sizesmall),(Object)(_sizemedium),(Object)(_sizelarge),(Object)(_sizexlarge));
 BA.debugLineNum = 335;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 336;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns10p2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns10p2 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("addcolumns10p2")) { return __ref.runUserSub(false, "vmcontainer","addcolumns10p2", __ref);}
 BA.debugLineNum = 303;BA.debugLine="Sub AddColumns10p2 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 304;BA.debugLine="Grid.AddColumns10p2";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns10p2" /*RemoteObject*/ );
 BA.debugLineNum = 305;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns11p1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns11p1 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,293);
if (RapidSub.canDelegate("addcolumns11p1")) { return __ref.runUserSub(false, "vmcontainer","addcolumns11p1", __ref);}
 BA.debugLineNum = 293;BA.debugLine="Sub AddColumns11p1 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 294;BA.debugLine="Grid.AddColumns11p1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns11p1" /*RemoteObject*/ );
 BA.debugLineNum = 295;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 296;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns12(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns12 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("addcolumns12")) { return __ref.runUserSub(false, "vmcontainer","addcolumns12", __ref);}
 BA.debugLineNum = 328;BA.debugLine="Sub AddColumns12 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="Grid.AddColumns12";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns12" /*RemoteObject*/ );
 BA.debugLineNum = 330;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
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
public static RemoteObject  _addcolumns12x1(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns12x1 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,273);
if (RapidSub.canDelegate("addcolumns12x1")) { return __ref.runUserSub(false, "vmcontainer","addcolumns12x1", __ref);}
 BA.debugLineNum = 273;BA.debugLine="Sub AddColumns12x1 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 274;BA.debugLine="AddColumns12x1";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_addcolumns12x1" /*RemoteObject*/ );
 BA.debugLineNum = 275;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns1p11(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns1p11 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("addcolumns1p11")) { return __ref.runUserSub(false, "vmcontainer","addcolumns1p11", __ref);}
 BA.debugLineNum = 288;BA.debugLine="Sub AddColumns1p11 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 289;BA.debugLine="Grid.AddColumns1p11";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns1p11" /*RemoteObject*/ );
 BA.debugLineNum = 290;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns2p10(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns2p10 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("addcolumns2p10")) { return __ref.runUserSub(false, "vmcontainer","addcolumns2p10", __ref);}
 BA.debugLineNum = 298;BA.debugLine="Sub AddColumns2p10 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 299;BA.debugLine="Grid.AddColumns2p10";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns2p10" /*RemoteObject*/ );
 BA.debugLineNum = 300;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns2x6(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns2x6 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("addcolumns2x6")) { return __ref.runUserSub(false, "vmcontainer","addcolumns2x6", __ref);}
 BA.debugLineNum = 263;BA.debugLine="Sub AddColumns2x6 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 264;BA.debugLine="Grid.AddColumns2x6";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns2x6" /*RemoteObject*/ );
 BA.debugLineNum = 265;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 266;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns3p9(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns3p9 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,308);
if (RapidSub.canDelegate("addcolumns3p9")) { return __ref.runUserSub(false, "vmcontainer","addcolumns3p9", __ref);}
 BA.debugLineNum = 308;BA.debugLine="Sub AddColumns3p9 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 309;BA.debugLine="Grid.AddColumns3p9";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns3p9" /*RemoteObject*/ );
 BA.debugLineNum = 310;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns3x4(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns3x4 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("addcolumns3x4")) { return __ref.runUserSub(false, "vmcontainer","addcolumns3x4", __ref);}
 BA.debugLineNum = 253;BA.debugLine="Sub AddColumns3x4 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 254;BA.debugLine="Grid.AddColumns3x4";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns3x4" /*RemoteObject*/ );
 BA.debugLineNum = 255;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 256;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns4p8(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns4p8 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("addcolumns4p8")) { return __ref.runUserSub(false, "vmcontainer","addcolumns4p8", __ref);}
 BA.debugLineNum = 283;BA.debugLine="Sub AddColumns4p8 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="Grid.AddColumns4p8";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns4p8" /*RemoteObject*/ );
 BA.debugLineNum = 285;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
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
public static RemoteObject  _addcolumns4x3(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns4x3 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,258);
if (RapidSub.canDelegate("addcolumns4x3")) { return __ref.runUserSub(false, "vmcontainer","addcolumns4x3", __ref);}
 BA.debugLineNum = 258;BA.debugLine="Sub AddColumns4x3 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 259;BA.debugLine="Grid.AddColumns4x3";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns4x3" /*RemoteObject*/ );
 BA.debugLineNum = 260;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns5p7(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns5p7 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,323);
if (RapidSub.canDelegate("addcolumns5p7")) { return __ref.runUserSub(false, "vmcontainer","addcolumns5p7", __ref);}
 BA.debugLineNum = 323;BA.debugLine="Sub AddColumns5p7 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 324;BA.debugLine="Grid.AddColumns5p7";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns5p7" /*RemoteObject*/ );
 BA.debugLineNum = 325;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns6x2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns6x2 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("addcolumns6x2")) { return __ref.runUserSub(false, "vmcontainer","addcolumns6x2", __ref);}
 BA.debugLineNum = 268;BA.debugLine="Sub AddColumns6x2 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 269;BA.debugLine="AddColumns6x2";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_addcolumns6x2" /*RemoteObject*/ );
 BA.debugLineNum = 270;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 271;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns7p5(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns7p5 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,318);
if (RapidSub.canDelegate("addcolumns7p5")) { return __ref.runUserSub(false, "vmcontainer","addcolumns7p5", __ref);}
 BA.debugLineNum = 318;BA.debugLine="Sub AddColumns7p5 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 319;BA.debugLine="Grid.AddColumns7p5";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns7p5" /*RemoteObject*/ );
 BA.debugLineNum = 320;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 321;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns8p4(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns8p4 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("addcolumns8p4")) { return __ref.runUserSub(false, "vmcontainer","addcolumns8p4", __ref);}
 BA.debugLineNum = 278;BA.debugLine="Sub AddColumns8p4 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 279;BA.debugLine="Grid.AddColumns8p4";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns8p4" /*RemoteObject*/ );
 BA.debugLineNum = 280;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns9p3(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns9p3 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("addcolumns9p3")) { return __ref.runUserSub(false, "vmcontainer","addcolumns9p3", __ref);}
 BA.debugLineNum = 313;BA.debugLine="Sub AddColumns9p3 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 314;BA.debugLine="Grid.AddColumns9p3";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns9p3" /*RemoteObject*/ );
 BA.debugLineNum = 315;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 316;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumnsosmpv(RemoteObject __ref,RemoteObject _icolumns,RemoteObject _ioffsetsmall,RemoteObject _ioffsetmedium,RemoteObject _ioffsetlarge,RemoteObject _ioffsetxlarge,RemoteObject _isizesmall,RemoteObject _isizemedium,RemoteObject _isizelarge,RemoteObject _isizexlarge,RemoteObject _ivisibility,RemoteObject _stheme) throws Exception{
try {
		Debug.PushSubsStack("AddColumnsOSMPV (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,225);
if (RapidSub.canDelegate("addcolumnsosmpv")) { return __ref.runUserSub(false, "vmcontainer","addcolumnsosmpv", __ref, _icolumns, _ioffsetsmall, _ioffsetmedium, _ioffsetlarge, _ioffsetxlarge, _isizesmall, _isizemedium, _isizelarge, _isizexlarge, _ivisibility, _stheme);}
Debug.locals.put("iColumns", _icolumns);
Debug.locals.put("iOffsetSmall", _ioffsetsmall);
Debug.locals.put("iOffsetMedium", _ioffsetmedium);
Debug.locals.put("iOffsetLarge", _ioffsetlarge);
Debug.locals.put("iOffsetXLarge", _ioffsetxlarge);
Debug.locals.put("iSizeSmall", _isizesmall);
Debug.locals.put("iSizeMedium", _isizemedium);
Debug.locals.put("iSizeLarge", _isizelarge);
Debug.locals.put("IsizeXLarge", _isizexlarge);
Debug.locals.put("iVisibility", _ivisibility);
Debug.locals.put("sTheme", _stheme);
 BA.debugLineNum = 225;BA.debugLine="Sub AddColumnsOSMPV(iColumns As String, iOffsetSma";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 228;BA.debugLine="Grid.AddColumnsOSMPV(iColumns, iOffsetSmall, iOff";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumnsosmpv" /*RemoteObject*/ ,(Object)(_icolumns),(Object)(_ioffsetsmall),(Object)(_ioffsetmedium),(Object)(_ioffsetlarge),(Object)(_ioffsetxlarge),(Object)(_isizesmall),(Object)(_isizemedium),(Object)(_isizelarge),(Object)(_isizexlarge),(Object)(_ivisibility),(Object)(_stheme));
 BA.debugLineNum = 229;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
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
public static RemoteObject  _addcomponent(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _elhtml) throws Exception{
try {
		Debug.PushSubsStack("AddComponent (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("addcomponent")) { return __ref.runUserSub(false, "vmcontainer","addcomponent", __ref, _rowpos, _colpos, _elhtml);}
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("elHTML", _elhtml);
 BA.debugLineNum = 239;BA.debugLine="Sub AddComponent(rowPos As Int, colPos As Int, elH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 240;BA.debugLine="Grid.AddComponent(rowPos, colPos, elHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(_elhtml));
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontrol(RemoteObject __ref,RemoteObject _ctl,RemoteObject _r,RemoteObject _c,RemoteObject _os,RemoteObject _om,RemoteObject _ol,RemoteObject _oxl,RemoteObject _s,RemoteObject _m,RemoteObject _l,RemoteObject _xl) throws Exception{
try {
		Debug.PushSubsStack("AddControl (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,933);
if (RapidSub.canDelegate("addcontrol")) { return __ref.runUserSub(false, "vmcontainer","addcontrol", __ref, _ctl, _r, _c, _os, _om, _ol, _oxl, _s, _m, _l, _xl);}
RemoteObject _srow = RemoteObject.createImmutable("");
RemoteObject _scell = RemoteObject.createImmutable("");
RemoteObject _rckey = RemoteObject.createImmutable("");
RemoteObject _row = RemoteObject.declareNull("b4j.example.vmcontainer._eachrow");
Debug.locals.put("ctl", _ctl);
Debug.locals.put("r", _r);
Debug.locals.put("c", _c);
Debug.locals.put("os", _os);
Debug.locals.put("om", _om);
Debug.locals.put("ol", _ol);
Debug.locals.put("oxl", _oxl);
Debug.locals.put("s", _s);
Debug.locals.put("m", _m);
Debug.locals.put("l", _l);
Debug.locals.put("xl", _xl);
 BA.debugLineNum = 933;BA.debugLine="Sub AddControl(ctl As VMInputControl, r As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 934;BA.debugLine="ctl.Row = r";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_row" /*RemoteObject*/ ,_r);
 BA.debugLineNum = 935;BA.debugLine="ctl.Cell = c";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_cell" /*RemoteObject*/ ,_c);
 BA.debugLineNum = 936;BA.debugLine="ctl.SizeSmall = s";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_sizesmall" /*RemoteObject*/ ,_s);
 BA.debugLineNum = 937;BA.debugLine="ctl.SizeMedium = m";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_sizemedium" /*RemoteObject*/ ,_m);
 BA.debugLineNum = 938;BA.debugLine="ctl.SizeLarge = l";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_sizelarge" /*RemoteObject*/ ,_l);
 BA.debugLineNum = 939;BA.debugLine="ctl.SizeXLarge = xl";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_sizexlarge" /*RemoteObject*/ ,_xl);
 BA.debugLineNum = 940;BA.debugLine="ctl.OffsetSmall = os";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_offsetsmall" /*RemoteObject*/ ,_os);
 BA.debugLineNum = 941;BA.debugLine="ctl.OffsetMedium = om";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_offsetmedium" /*RemoteObject*/ ,_om);
 BA.debugLineNum = 942;BA.debugLine="ctl.OffsetLarge = ol";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_offsetlarge" /*RemoteObject*/ ,_ol);
 BA.debugLineNum = 943;BA.debugLine="ctl.OffsetXLarge = oxl";
Debug.JustUpdateDeviceLine();
_ctl.setField ("_offsetxlarge" /*RemoteObject*/ ,_oxl);
 BA.debugLineNum = 944;BA.debugLine="Controls.add(ctl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_ctl)));
 BA.debugLineNum = 946;BA.debugLine="If r > TotalRows Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, _r),BA.numberCast(double.class, __ref.getField(true,"_totalrows" /*RemoteObject*/ )))) { 
 BA.debugLineNum = 947;BA.debugLine="TotalRows = r";
Debug.JustUpdateDeviceLine();
__ref.setField ("_totalrows" /*RemoteObject*/ ,BA.numberCast(int.class, _r));
 };
 BA.debugLineNum = 950;BA.debugLine="Dim sRow As String = vue.PadRight(r,2,\"0\")";
Debug.JustUpdateDeviceLine();
_srow = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_padright" /*RemoteObject*/ ,(Object)(_r),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("sRow", _srow);Debug.locals.put("sRow", _srow);
 BA.debugLineNum = 951;BA.debugLine="Dim sCell As String = vue.PadRight(c,2,\"0\")";
Debug.JustUpdateDeviceLine();
_scell = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_padright" /*RemoteObject*/ ,(Object)(_c),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("sCell", _scell);Debug.locals.put("sCell", _scell);
 BA.debugLineNum = 952;BA.debugLine="Dim rcKey As String = $\"${sRow}.${sCell}\"$";
Debug.JustUpdateDeviceLine();
_rckey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_srow))),RemoteObject.createImmutable("."),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_scell))),RemoteObject.createImmutable("")));Debug.locals.put("rcKey", _rckey);Debug.locals.put("rcKey", _rckey);
 BA.debugLineNum = 954;BA.debugLine="sortitM.Put(rcKey,ctl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rckey)),(Object)((_ctl)));
 BA.debugLineNum = 955;BA.debugLine="If rows.ContainsKey(sRow) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_rows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_srow))),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 956;BA.debugLine="Dim row As EachRow";
Debug.JustUpdateDeviceLine();
_row = RemoteObject.createNew ("b4j.example.vmcontainer._eachrow");Debug.locals.put("row", _row);
 BA.debugLineNum = 957;BA.debugLine="row.Initialize";
Debug.JustUpdateDeviceLine();
_row.runVoidMethod ("Initialize");
 BA.debugLineNum = 958;BA.debugLine="rows.Put(sRow, row)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rows" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_srow)),(Object)((_row)));
 };
 BA.debugLineNum = 960;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontrols(RemoteObject __ref,RemoteObject _ctl,RemoteObject _r,RemoteObject _c,RemoteObject _s,RemoteObject _m,RemoteObject _l,RemoteObject _xl) throws Exception{
try {
		Debug.PushSubsStack("AddControlS (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,963);
if (RapidSub.canDelegate("addcontrols")) { return __ref.runUserSub(false, "vmcontainer","addcontrols", __ref, _ctl, _r, _c, _s, _m, _l, _xl);}
Debug.locals.put("ctl", _ctl);
Debug.locals.put("r", _r);
Debug.locals.put("c", _c);
Debug.locals.put("s", _s);
Debug.locals.put("m", _m);
Debug.locals.put("l", _l);
Debug.locals.put("xl", _xl);
 BA.debugLineNum = 963;BA.debugLine="Sub AddControlS(ctl As VMInputControl, r As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 964;BA.debugLine="AddControl(ctl, r, c, 0,0,0,0,s,m,l,xl)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_addcontrol" /*RemoteObject*/ ,(Object)(_ctl),(Object)(_r),(Object)(_c),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(BA.NumberToString(0)),(Object)(_s),(Object)(_m),(Object)(_l),(Object)(_xl));
 BA.debugLineNum = 965;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddates(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("AddDates (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,988);
if (RapidSub.canDelegate("adddates")) { return __ref.runUserSub(false, "vmcontainer","adddates", __ref, _i);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("i", _i);
 BA.debugLineNum = 988;BA.debugLine="Sub AddDates(i As List) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 989;BA.debugLine="For Each s As String In i";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _i;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 990;BA.debugLine="Dates.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dates" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 992;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 993;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddoubles(RemoteObject __ref,RemoteObject _d) throws Exception{
try {
		Debug.PushSubsStack("AddDoubles (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,995);
if (RapidSub.canDelegate("adddoubles")) { return __ref.runUserSub(false, "vmcontainer","adddoubles", __ref, _d);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("d", _d);
 BA.debugLineNum = 995;BA.debugLine="Sub AddDoubles(d As List) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 996;BA.debugLine="For Each s As String In d";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _d;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 997;BA.debugLine="Doubles.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_doubles" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 999;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1000;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addexclusion(RemoteObject __ref,RemoteObject _them) throws Exception{
try {
		Debug.PushSubsStack("AddExclusion (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("addexclusion")) { return __ref.runUserSub(false, "vmcontainer","addexclusion", __ref, _them);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("them", _them);
 BA.debugLineNum = 72;BA.debugLine="Sub AddExclusion(them As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="For Each k As String In them";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _them;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 74;BA.debugLine="Exclusions.Add(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_exclusions" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_k)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addhr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddHR (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("addhr")) { return __ref.runUserSub(false, "vmcontainer","addhr", __ref);}
 BA.debugLineNum = 124;BA.debugLine="Sub AddHR As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="Container.addhr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addhr" /*RemoteObject*/ );
 BA.debugLineNum = 126;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 127;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addintegers(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("AddIntegers (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,967);
if (RapidSub.canDelegate("addintegers")) { return __ref.runUserSub(false, "vmcontainer","addintegers", __ref, _i);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("i", _i);
 BA.debugLineNum = 967;BA.debugLine="Sub AddIntegers(i As List) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 968;BA.debugLine="For Each s As String In i";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _i;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 969;BA.debugLine="Integers.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_integers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 971;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 972;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addrequired(RemoteObject __ref,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("AddRequired (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,908);
if (RapidSub.canDelegate("addrequired")) { return __ref.runUserSub(false, "vmcontainer","addrequired", __ref, _r);}
Debug.locals.put("r", _r);
 BA.debugLineNum = 908;BA.debugLine="Sub AddRequired(r As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 909;BA.debugLine="Required.put(r,r)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_required" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_r)),(Object)((_r)));
 BA.debugLineNum = 910;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 911;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addrow(RemoteObject __ref,RemoteObject _irows,RemoteObject _svisibility,RemoteObject _sthemename,RemoteObject _sclassname) throws Exception{
try {
		Debug.PushSubsStack("AddRow (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("addrow")) { return __ref.runUserSub(false, "vmcontainer","addrow", __ref, _irows, _svisibility, _sthemename, _sclassname);}
Debug.locals.put("iRows", _irows);
Debug.locals.put("sVisibility", _svisibility);
Debug.locals.put("sThemeName", _sthemename);
Debug.locals.put("sClassName", _sclassname);
 BA.debugLineNum = 220;BA.debugLine="Sub AddRow(iRows As Int, sVisibility As String, sT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 221;BA.debugLine="Grid.AddRow(iRows, sVisibility, sThemeName,sClass";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addrow" /*RemoteObject*/ ,(Object)(_irows),(Object)(_svisibility),(Object)(_sthemename),(Object)(_sclassname));
 BA.debugLineNum = 222;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
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
public static RemoteObject  _addrows(RemoteObject __ref,RemoteObject _irows) throws Exception{
try {
		Debug.PushSubsStack("AddRows (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("addrows")) { return __ref.runUserSub(false, "vmcontainer","addrows", __ref, _irows);}
Debug.locals.put("iRows", _irows);
 BA.debugLineNum = 248;BA.debugLine="Sub AddRows(iRows As Int) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 249;BA.debugLine="Grid.AddRows(iRows)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addrows" /*RemoteObject*/ ,(Object)(_irows));
 BA.debugLineNum = 250;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstrings(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("AddStrings (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,974);
if (RapidSub.canDelegate("addstrings")) { return __ref.runUserSub(false, "vmcontainer","addstrings", __ref, _i);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("i", _i);
 BA.debugLineNum = 974;BA.debugLine="Sub AddStrings(i As List) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 975;BA.debugLine="For Each s As String In i";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _i;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 976;BA.debugLine="Strings.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 978;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 979;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,437);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmcontainer","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 437;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 438;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 439;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildcontrols(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildControls (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1002);
if (RapidSub.canDelegate("buildcontrols")) { return __ref.runUserSub(false, "vmcontainer","buildcontrols", __ref);}
RemoteObject _showkey = RemoteObject.createImmutable("");
RemoteObject _diskey = RemoteObject.createImmutable("");
RemoteObject _enakey = RemoteObject.createImmutable("");
RemoteObject _errkey = RemoteObject.createImmutable("");
RemoteObject _isarray = RemoteObject.createImmutable(false);
RemoteObject _cnt = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _idxpos = RemoteObject.createImmutable(0);
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vminputcontrol");
RemoteObject _lst = RemoteObject.declareNull("b4j.example.vmlist");
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
RemoteObject _tp = RemoteObject.declareNull("b4j.example.vmtimepicker");
RemoteObject _chp = RemoteObject.declareNull("b4j.example.vmchip");
RemoteObject _chps = RemoteObject.declareNull("b4j.example.vmchips");
RemoteObject _lbl = RemoteObject.declareNull("b4j.example.vmlabel");
RemoteObject _img = RemoteObject.declareNull("b4j.example.vmimage");
RemoteObject _fil = RemoteObject.declareNull("b4j.example.vmfile");
RemoteObject _input = RemoteObject.declareNull("b4j.example.vminput");
RemoteObject _txtarea = RemoteObject.declareNull("b4j.example.vmtextarea");
RemoteObject _ibox = RemoteObject.declareNull("b4j.example.vminfobox");
RemoteObject _slid = RemoteObject.declareNull("b4j.example.vmslider");
RemoteObject _ni = RemoteObject.declareNull("b4j.example.vmnumberinput");
RemoteObject _sel = RemoteObject.declareNull("b4j.example.vmselect");
RemoteObject _ok = RemoteObject.createImmutable("");
RemoteObject _ov = RemoteObject.createImmutable("");
RemoteObject _datex = RemoteObject.declareNull("b4j.example.vmdatepicker");
RemoteObject _chk = RemoteObject.declareNull("b4j.example.vmcheckbox");
RemoteObject _sw = RemoteObject.declareNull("b4j.example.vmswitch");
RemoteObject _icn = RemoteObject.declareNull("b4j.example.vmicon");
RemoteObject _rg = RemoteObject.declareNull("b4j.example.vmradiogroup");
RemoteObject _cg = RemoteObject.declareNull("b4j.example.vmcheckboxgroup");
 BA.debugLineNum = 1002;BA.debugLine="private Sub BuildControls";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1003;BA.debugLine="Dim showKey As String";
Debug.JustUpdateDeviceLine();
_showkey = RemoteObject.createImmutable("");Debug.locals.put("showKey", _showkey);
 BA.debugLineNum = 1004;BA.debugLine="Dim disKey As String";
Debug.JustUpdateDeviceLine();
_diskey = RemoteObject.createImmutable("");Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1005;BA.debugLine="Dim enaKey As String";
Debug.JustUpdateDeviceLine();
_enakey = RemoteObject.createImmutable("");Debug.locals.put("enaKey", _enakey);
 BA.debugLineNum = 1006;BA.debugLine="Dim errKey As String";
Debug.JustUpdateDeviceLine();
_errkey = RemoteObject.createImmutable("");Debug.locals.put("errKey", _errkey);
 BA.debugLineNum = 1007;BA.debugLine="Dim isarray As Boolean";
Debug.JustUpdateDeviceLine();
_isarray = RemoteObject.createImmutable(false);Debug.locals.put("isarray", _isarray);
 BA.debugLineNum = 1009;BA.debugLine="For Each cnt As VMInputControl In Controls";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = __ref.getField(false,"_controls" /*RemoteObject*/ );
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_cnt = (group6.runMethod(false,"Get",index6));Debug.locals.put("cnt", _cnt);
Debug.locals.put("cnt", _cnt);
 BA.debugLineNum = 1010;BA.debugLine="If cnt.Exclude = True Then Exclusions.Add(cnt.na";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_cnt.getField(true,"_exclude" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"True"))) { 
__ref.getField(false,"_exclusions" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))));};
 BA.debugLineNum = 1012;BA.debugLine="Dim idxpos As Int = Exclusions.IndexOf(cnt.name)";
Debug.JustUpdateDeviceLine();
_idxpos = __ref.getField(false,"_exclusions" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))));Debug.locals.put("idxpos", _idxpos);Debug.locals.put("idxpos", _idxpos);
 BA.debugLineNum = 1013;BA.debugLine="If idxpos = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_idxpos,BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1014;BA.debugLine="Select Case cnt.typeOf";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_cnt.getField(true,"_typeof" /*RemoteObject*/ ),BA.ObjectToString("button"),BA.ObjectToString("list"))) {
case 0: 
case 1: {
 BA.debugLineNum = 1016;BA.debugLine="cnt.fieldType = \"\"";
Debug.JustUpdateDeviceLine();
_cnt.setField ("_fieldtype" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 1017;BA.debugLine="cnt.Required = False";
Debug.JustUpdateDeviceLine();
_cnt.setField ("_required" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"False"));
 break; }
default: {
 BA.debugLineNum = 1019;BA.debugLine="Fields.Add(cnt.name)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))));
 BA.debugLineNum = 1020;BA.debugLine="Defaults.Put(cnt.name, cnt.defaultValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))),(Object)(_cnt.getField(false,"_defaultvalue" /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 1022;BA.debugLine="If cnt.required Then";
Debug.JustUpdateDeviceLine();
if (_cnt.getField(true,"_required" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1023;BA.debugLine="Required.put(cnt.name,cnt.name)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_required" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))),(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 1025;BA.debugLine="Select Case cnt.fieldType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_cnt.getField(true,"_fieldtype" /*RemoteObject*/ ),BA.ObjectToString("int"),BA.ObjectToString("bool"),BA.ObjectToString("string"),BA.ObjectToString("date"),BA.ObjectToString("dbl"))) {
case 0: {
 BA.debugLineNum = 1027;BA.debugLine="Integers.Add(cnt.name)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_integers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))));
 break; }
case 1: {
 BA.debugLineNum = 1029;BA.debugLine="Booleans.Add(cnt.name)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_booleans" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))));
 break; }
case 2: {
 BA.debugLineNum = 1031;BA.debugLine="Strings.Add(cnt.name)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))));
 break; }
case 3: {
 BA.debugLineNum = 1033;BA.debugLine="Dates.Add(cnt.name)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dates" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))));
 break; }
case 4: {
 BA.debugLineNum = 1035;BA.debugLine="Doubles.Add(cnt.name)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_doubles" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_cnt.getField(true,"_name" /*RemoteObject*/ ))));
 break; }
}
;
 };
 }
}Debug.locals.put("cnt", _cnt);
;
 BA.debugLineNum = 1040;BA.debugLine="BuildGrid(Grid)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_buildgrid" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_grid" /*RemoteObject*/ )));
 BA.debugLineNum = 1045;BA.debugLine="For Each nc As VMInputControl In Controls";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group36 = __ref.getField(false,"_controls" /*RemoteObject*/ );
final int groupLen36 = group36.runMethod(true,"getSize").<Integer>get()
;int index36 = 0;
;
for (; index36 < groupLen36;index36++){
_nc = (group36.runMethod(false,"Get",index36));Debug.locals.put("nc", _nc);
Debug.locals.put("nc", _nc);
 BA.debugLineNum = 1046;BA.debugLine="showKey = $\"${nc.name}show\"$";
Debug.JustUpdateDeviceLine();
_showkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nc.getField(true,"_name" /*RemoteObject*/ )))),RemoteObject.createImmutable("show")));Debug.locals.put("showKey", _showkey);
 BA.debugLineNum = 1047;BA.debugLine="disKey = $\"${nc.name}disabled\"$";
Debug.JustUpdateDeviceLine();
_diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nc.getField(true,"_name" /*RemoteObject*/ )))),RemoteObject.createImmutable("disabled")));Debug.locals.put("disKey", _diskey);
 BA.debugLineNum = 1048;BA.debugLine="enaKey = $\"${nc.name}required\"$";
Debug.JustUpdateDeviceLine();
_enakey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nc.getField(true,"_name" /*RemoteObject*/ )))),RemoteObject.createImmutable("required")));Debug.locals.put("enaKey", _enakey);
 BA.debugLineNum = 1049;BA.debugLine="errKey = $\"${nc.name}error\"$";
Debug.JustUpdateDeviceLine();
_errkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nc.getField(true,"_name" /*RemoteObject*/ )))),RemoteObject.createImmutable("error")));Debug.locals.put("errKey", _errkey);
 BA.debugLineNum = 1050;BA.debugLine="isarray = False";
Debug.JustUpdateDeviceLine();
_isarray = vmcontainer.__c.getField(true,"False");Debug.locals.put("isarray", _isarray);
 BA.debugLineNum = 1060;BA.debugLine="visibility.Put(showKey, nc.Isvisible)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_visibility" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_showkey)),(Object)((_nc.getField(true,"_isvisible" /*RemoteObject*/ ))));
 BA.debugLineNum = 1062;BA.debugLine="Select Case nc.typeOf";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_nc.getField(true,"_typeof" /*RemoteObject*/ ),BA.ObjectToString("list"),BA.ObjectToString("button"),BA.ObjectToString("timepicker"),BA.ObjectToString("chip"),BA.ObjectToString("chips"),BA.ObjectToString("label"),BA.ObjectToString("image"),BA.ObjectToString("file"),BA.ObjectToString("number"),BA.ObjectToString("text"),BA.ObjectToString("tel"),BA.ObjectToString("email"),BA.ObjectToString("password"),BA.ObjectToString("textarea"),BA.ObjectToString("infobox"),BA.ObjectToString("slider"),BA.ObjectToString("numberinput"),BA.ObjectToString("select"),BA.ObjectToString("selectbox"),BA.ObjectToString("datepicker"),BA.ObjectToString("date"),BA.ObjectToString("checkbox"),BA.ObjectToString("switch"),BA.ObjectToString("switchbox"),BA.ObjectToString("icon"),BA.ObjectToString("radiogroup"),BA.ObjectToString("radio"),BA.ObjectToString("checkboxgroup"))) {
case 0: {
 BA.debugLineNum = 1064;BA.debugLine="Dim lst As VMList = CreateList(nc.name, module";
Debug.JustUpdateDeviceLine();
_lst = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createlist" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("lst", _lst);Debug.locals.put("lst", _lst);
 BA.debugLineNum = 1065;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1066;BA.debugLine="lst.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_lst.runClassMethod (b4j.example.vmlist.class, "_setvshow" /*RemoteObject*/ ,(Object)((_showkey)));
 };
 BA.debugLineNum = 1068;BA.debugLine="lst.AddSubHeader(nc.label)";
Debug.JustUpdateDeviceLine();
_lst.runClassMethod (b4j.example.vmlist.class, "_addsubheader" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_label" /*RemoteObject*/ ))));
 BA.debugLineNum = 1069;BA.debugLine="Dim li As VMListItem = CreateListItem($\"${nc.n";
Debug.JustUpdateDeviceLine();
_li = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createlistitem" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_nc.getField(true,"_name" /*RemoteObject*/ )))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("li", _li);Debug.locals.put("li", _li);
 BA.debugLineNum = 1070;BA.debugLine="li.SetVFor(\"row\", nc.source)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setvfor" /*RemoteObject*/ ,(Object)(BA.ObjectToString("row")),(Object)(_nc.getField(true,"_source" /*RemoteObject*/ )));
 BA.debugLineNum = 1071;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1072;BA.debugLine="li.SetID(nc.key,True)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setid" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_key" /*RemoteObject*/ )),(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 1073;BA.debugLine="li.SetKey(nc.key,True)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setkey" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_key" /*RemoteObject*/ )),(Object)(vmcontainer.__c.getField(true,"True")));
 };
 BA.debugLineNum = 1075;BA.debugLine="li.SetText(nc.text)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 1076;BA.debugLine="Select Case nc.Lines";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_nc.getField(true,"_lines" /*RemoteObject*/ ),BA.numberCast(int.class, 2),BA.numberCast(int.class, 3))) {
case 0: {
 BA.debugLineNum = 1078;BA.debugLine="lst.SetDoubleLine(True)";
Debug.JustUpdateDeviceLine();
_lst.runClassMethod (b4j.example.vmlist.class, "_setdoubleline" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 1079;BA.debugLine="li.SetDescription(nc.Description)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setdescription" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_description" /*RemoteObject*/ )));
 break; }
case 1: {
 BA.debugLineNum = 1081;BA.debugLine="lst.SetTripleLine(True)";
Debug.JustUpdateDeviceLine();
_lst.runClassMethod (b4j.example.vmlist.class, "_settripleline" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 1082;BA.debugLine="li.SetDescription(nc.Description)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setdescription" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_description" /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 1087;BA.debugLine="If nc.ActionIcon <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_nc.getField(true,"_actionicon" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1088;BA.debugLine="li.SetActionIcon(nc.ActionIcon)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setactionicon" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_actionicon" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1090;BA.debugLine="If nc.MenuIcon <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_nc.getField(true,"_menuicon" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1091;BA.debugLine="li.SetMenuIcon(nc.MenuIcon)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setmenuicon" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_menuicon" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1093;BA.debugLine="If nc.IconName <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_nc.getField(true,"_iconname" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 1094;BA.debugLine="li.SetIcon(nc.iconname,nc.IsPrimary)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_seticon" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_iconname" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_isprimary" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1096;BA.debugLine="If nc.AddEdit Then";
Debug.JustUpdateDeviceLine();
if (_nc.getField(true,"_addedit" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1097;BA.debugLine="li.AddEditMenuItem(nc.Key, nc.editcaption)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_addeditmenuitem" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_key" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_editcaption" /*RemoteObject*/ )));
 BA.debugLineNum = 1098;BA.debugLine="li.AddDeleteMenuItem(nc.Key, nc.deletecaption";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_adddeletemenuitem" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_key" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_deletecaption" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1100;BA.debugLine="li.Pop(lst)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)(_lst));
 BA.debugLineNum = 1105;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, lst.ToStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_lst.runClassMethod (b4j.example.vmlist.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 1: {
 BA.debugLineNum = 1108;BA.debugLine="Select Case nc.ButtonType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_nc.getField(true,"_buttontype" /*RemoteObject*/ ),BA.ObjectToString("regular"),BA.ObjectToString("icon"),BA.ObjectToString("fab"))) {
case 0: {
 BA.debugLineNum = 1110;BA.debugLine="nc.Fab = False";
Debug.JustUpdateDeviceLine();
_nc.setField ("_fab" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"False"));
 BA.debugLineNum = 1111;BA.debugLine="nc.iconbutton = False";
Debug.JustUpdateDeviceLine();
_nc.setField ("_iconbutton" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"False"));
 break; }
case 1: {
 BA.debugLineNum = 1113;BA.debugLine="nc.IconButton = True";
Debug.JustUpdateDeviceLine();
_nc.setField ("_iconbutton" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 1114;BA.debugLine="nc.Fab = False";
Debug.JustUpdateDeviceLine();
_nc.setField ("_fab" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"False"));
 break; }
case 2: {
 BA.debugLineNum = 1116;BA.debugLine="nc.Fab = True";
Debug.JustUpdateDeviceLine();
_nc.setField ("_fab" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 1117;BA.debugLine="nc.IconButton = False";
Debug.JustUpdateDeviceLine();
_nc.setField ("_iconbutton" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"False"));
 break; }
}
;
 BA.debugLineNum = 1119;BA.debugLine="Dim btn As VMButton = CreateButton(nc.name, mo";
Debug.JustUpdateDeviceLine();
_btn = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createbutton" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("btn", _btn);Debug.locals.put("btn", _btn);
 BA.debugLineNum = 1120;BA.debugLine="btn.SetText(nc.label)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_settext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )));
 BA.debugLineNum = 1121;BA.debugLine="btn.SetRaised(nc.raised)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setraised" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_raised" /*RemoteObject*/ )));
 BA.debugLineNum = 1122;BA.debugLine="btn.SetPrimary(nc.isprimary)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setprimary" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isprimary" /*RemoteObject*/ )));
 BA.debugLineNum = 1123;BA.debugLine="btn.SetAccent(nc.isaccent)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setaccent" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isaccent" /*RemoteObject*/ )));
 BA.debugLineNum = 1124;BA.debugLine="btn.SetRipple(nc.Ripple)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setripple" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_ripple" /*RemoteObject*/ )));
 BA.debugLineNum = 1125;BA.debugLine="btn.SetMenuTrigger(nc.MenuTrigger)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setmenutrigger" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_menutrigger" /*RemoteObject*/ )));
 BA.debugLineNum = 1126;BA.debugLine="btn.SetDense(nc.Dense)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setdense" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_dense" /*RemoteObject*/ )));
 BA.debugLineNum = 1127;BA.debugLine="btn.SetIconButton(nc.IconButton)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_iconbutton" /*RemoteObject*/ )));
 BA.debugLineNum = 1128;BA.debugLine="btn.SetPlain(nc.Plain)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setplain" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_plain" /*RemoteObject*/ )));
 BA.debugLineNum = 1129;BA.debugLine="btn.SetMini(nc.Mini)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setmini" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_mini" /*RemoteObject*/ )));
 BA.debugLineNum = 1130;BA.debugLine="btn.SetFab(nc.Fab)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setfab" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_fab" /*RemoteObject*/ )));
 BA.debugLineNum = 1131;BA.debugLine="btn.SetListAction(nc.ListAction)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setlistaction" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_listaction" /*RemoteObject*/ )));
 BA.debugLineNum = 1132;BA.debugLine="btn.SetIcon(nc.IconName)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_iconname" /*RemoteObject*/ )));
 BA.debugLineNum = 1133;BA.debugLine="btn.SetTo(nc.NavigateTo, False)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setto" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_navigateto" /*RemoteObject*/ )),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1134;BA.debugLine="btn.SetFabPosition(nc.FabPosition)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setfabposition" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_fabposition" /*RemoteObject*/ )));
 BA.debugLineNum = 1135;BA.debugLine="btn.SetFabFixed(nc.FabFixed)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setfabfixed" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_fabfixed" /*RemoteObject*/ )));
 BA.debugLineNum = 1136;BA.debugLine="If nc.FitWidth Then";
Debug.JustUpdateDeviceLine();
if (_nc.getField(true,"_fitwidth" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1137;BA.debugLine="btn.SetStyle(CreateMap(\"width\":\"100%\",\"margin";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmcontainer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),RemoteObject.createImmutable(("100%")),RemoteObject.createImmutable(("margin-left")),RemoteObject.createImmutable(("0px")),RemoteObject.createImmutable(("margin-right")),(RemoteObject.createImmutable("0px"))}))));
 };
 BA.debugLineNum = 1139;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1140;BA.debugLine="btn.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1141;BA.debugLine="btn.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1143;BA.debugLine="btn.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1147;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, btn.ToStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_btn.runClassMethod (b4j.example.vmbutton.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 2: {
 BA.debugLineNum = 1149;BA.debugLine="Dim tp As VMTimePicker = CreateTimePicker(nc.n";
Debug.JustUpdateDeviceLine();
_tp = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createtimepicker" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("tp", _tp);Debug.locals.put("tp", _tp);
 BA.debugLineNum = 1150;BA.debugLine="tp.SetLabel(nc.label)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_setlabel" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_label" /*RemoteObject*/ ))));
 BA.debugLineNum = 1151;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1152;BA.debugLine="tp.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1153;BA.debugLine="tp.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1154;BA.debugLine="tp.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 BA.debugLineNum = 1155;BA.debugLine="tp.SetRequired(nc.required)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_setrequired" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_required" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1157;BA.debugLine="tp.SetName(nc.name,False)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_setname" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_name" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1158;BA.debugLine="tp.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1159;BA.debugLine="tp.SetPlaceholder(nc.placeholder)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_setplaceholder" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_placeholder" /*RemoteObject*/ )));
 BA.debugLineNum = 1160;BA.debugLine="tp.SetHelperText(nc.helperText)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_helpertext" /*RemoteObject*/ )));
 BA.debugLineNum = 1161;BA.debugLine="tp.SetErrorText(nc.errorText)";
Debug.JustUpdateDeviceLine();
_tp.runClassMethod (b4j.example.vmtimepicker.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_errortext" /*RemoteObject*/ )));
 BA.debugLineNum = 1162;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, tp.ToString";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_tp.runClassMethod (b4j.example.vmtimepicker.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 3: {
 BA.debugLineNum = 1164;BA.debugLine="Dim chp As VMChip = CreateChip(nc.name,module)";
Debug.JustUpdateDeviceLine();
_chp = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createchip" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("chp", _chp);Debug.locals.put("chp", _chp);
 BA.debugLineNum = 1165;BA.debugLine="chp.SetText(nc.Text)";
Debug.JustUpdateDeviceLine();
_chp.runClassMethod (b4j.example.vmchip.class, "_settext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 1166;BA.debugLine="chp.SetClickable(nc.Clickable)";
Debug.JustUpdateDeviceLine();
_chp.runClassMethod (b4j.example.vmchip.class, "_setclickable" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_clickable" /*RemoteObject*/ )));
 BA.debugLineNum = 1167;BA.debugLine="chp.SetDeletable(nc.Deletable)";
Debug.JustUpdateDeviceLine();
_chp.runClassMethod (b4j.example.vmchip.class, "_setdeletable" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_deletable" /*RemoteObject*/ )));
 BA.debugLineNum = 1168;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1169;BA.debugLine="chp.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_chp.runClassMethod (b4j.example.vmchip.class, "_setvshow" /*RemoteObject*/ ,(Object)((_showkey)));
 BA.debugLineNum = 1170;BA.debugLine="chp.setVmodel(nc.name)";
Debug.JustUpdateDeviceLine();
_chp.runClassMethod (b4j.example.vmchip.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1171;BA.debugLine="chp.SetDisabled(disKey)";
Debug.JustUpdateDeviceLine();
_chp.runClassMethod (b4j.example.vmchip.class, "_setdisabled" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(_diskey)));
 };
 BA.debugLineNum = 1173;BA.debugLine="If nc.UseOptions = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_nc.getField(true,"_useoptions" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1174;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1175;BA.debugLine="chp.SetOptions(nc.sourceTable, nc.options, n";
Debug.JustUpdateDeviceLine();
_chp.runClassMethod (b4j.example.vmchip.class, "_setoptions" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_sourcetable" /*RemoteObject*/ )),(Object)(_nc.getField(false,"_options" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_sourcefield" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_displayfield" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 1178;BA.debugLine="If nc.UseDataSource = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_nc.getField(true,"_usedatasource" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1179;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1180;BA.debugLine="chp.SetDataSource(nc.sourceTable, nc.sourceF";
Debug.JustUpdateDeviceLine();
_chp.runClassMethod (b4j.example.vmchip.class, "_setdatasource" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_sourcetable" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_sourcefield" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_displayfield" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 1183;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, chp.ToStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_chp.runClassMethod (b4j.example.vmchip.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 4: {
 BA.debugLineNum = 1185;BA.debugLine="isarray = True";
Debug.JustUpdateDeviceLine();
_isarray = vmcontainer.__c.getField(true,"True");Debug.locals.put("isarray", _isarray);
 BA.debugLineNum = 1186;BA.debugLine="Dim chps As VMChips = CreateChips(nc.name, mod";
Debug.JustUpdateDeviceLine();
_chps = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createchips" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("chps", _chps);Debug.locals.put("chps", _chps);
 BA.debugLineNum = 1187;BA.debugLine="chps.SetInputType(nc.InputType)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_setinputtype" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_inputtype" /*RemoteObject*/ )));
 BA.debugLineNum = 1188;BA.debugLine="chps.SetPlaceholder(nc.PlaceHolder)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_setplaceholder" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_placeholder" /*RemoteObject*/ )));
 BA.debugLineNum = 1189;BA.debugLine="chps.SetStatic(nc.Static)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_setstatic" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_static" /*RemoteObject*/ )));
 BA.debugLineNum = 1190;BA.debugLine="chps.SetCheckDuplicated(nc.CheckDuplicates)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_setcheckduplicated" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_checkduplicates" /*RemoteObject*/ )));
 BA.debugLineNum = 1191;BA.debugLine="chps.SetHelperText(nc.helperText)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_helpertext" /*RemoteObject*/ )));
 BA.debugLineNum = 1192;BA.debugLine="chps.SetErrorText(nc.errorText)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_errortext" /*RemoteObject*/ )));
 BA.debugLineNum = 1193;BA.debugLine="chps.SetLabel(nc.label)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_setlabel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )));
 BA.debugLineNum = 1194;BA.debugLine="chps.SetRequired(nc.Required)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_setrequired" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_required" /*RemoteObject*/ )));
 BA.debugLineNum = 1195;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1196;BA.debugLine="chps.setVmodel(nc.name)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1197;BA.debugLine="chps.SetDisabled(disKey)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_setdisabled" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(_diskey)));
 BA.debugLineNum = 1198;BA.debugLine="chps.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_chps.runClassMethod (b4j.example.vmchips.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 };
 BA.debugLineNum = 1200;BA.debugLine="vue.SetStateSingle(nc.name, Array())";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)((RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 1201;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, chps.ToStri";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_chps.runClassMethod (b4j.example.vmchips.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 5: {
 BA.debugLineNum = 1203;BA.debugLine="Dim lbl As VMLabel = CreateLABEL(nc.name)";
Debug.JustUpdateDeviceLine();
_lbl = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createlabel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));Debug.locals.put("lbl", _lbl);Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 1204;BA.debugLine="lbl.SetTag(nc.Tag)";
Debug.JustUpdateDeviceLine();
_lbl.runClassMethod (b4j.example.vmlabel.class, "_settag" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_tag" /*RemoteObject*/ )));
 BA.debugLineNum = 1205;BA.debugLine="lbl.SetText(nc.Text)";
Debug.JustUpdateDeviceLine();
_lbl.runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 1206;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1207;BA.debugLine="lbl.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_lbl.runClassMethod (b4j.example.vmlabel.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 };
 BA.debugLineNum = 1209;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, lbl.ToStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_lbl.runClassMethod (b4j.example.vmlabel.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 6: {
 BA.debugLineNum = 1211;BA.debugLine="Dim img As VMImage = CreateImage(nc.name, modu";
Debug.JustUpdateDeviceLine();
_img = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createimage" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("img", _img);Debug.locals.put("img", _img);
 BA.debugLineNum = 1212;BA.debugLine="img.SetAlt(nc.Alt)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setalt" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_alt" /*RemoteObject*/ )));
 BA.debugLineNum = 1213;BA.debugLine="img.SetWidth(nc.Width)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setwidth" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_width" /*RemoteObject*/ )));
 BA.debugLineNum = 1214;BA.debugLine="img.SetHeight(nc.Height)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setheight" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_height" /*RemoteObject*/ )));
 BA.debugLineNum = 1215;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1216;BA.debugLine="img.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1217;BA.debugLine="img.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1218;BA.debugLine="img.SetValue(nc.defaultValue, True)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_nc.getField(false,"_defaultvalue" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"True")));
 }else {
 BA.debugLineNum = 1220;BA.debugLine="img.SetValue(nc.defaultValue, False)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_nc.getField(false,"_defaultvalue" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"False")));
 };
 BA.debugLineNum = 1222;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, img.ToStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_img.runClassMethod (b4j.example.vmimage.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 7: {
 BA.debugLineNum = 1224;BA.debugLine="Dim fil As VMFile = CreateFile(nc.name, module";
Debug.JustUpdateDeviceLine();
_fil = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createfile" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("fil", _fil);Debug.locals.put("fil", _fil);
 BA.debugLineNum = 1225;BA.debugLine="fil.SetErrorText(nc.errorText)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_errortext" /*RemoteObject*/ )));
 BA.debugLineNum = 1226;BA.debugLine="fil.SetLabel(nc.label)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_setlabel" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_label" /*RemoteObject*/ ))));
 BA.debugLineNum = 1227;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1228;BA.debugLine="fil.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1229;BA.debugLine="fil.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_setvshow" /*RemoteObject*/ ,(Object)((_showkey)));
 BA.debugLineNum = 1230;BA.debugLine="fil.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 BA.debugLineNum = 1231;BA.debugLine="fil.SetRequired(nc.required)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_setrequired" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_required" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1233;BA.debugLine="fil.SetName(nc.name,False)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_setname" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_name" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1234;BA.debugLine="fil.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1235;BA.debugLine="fil.SetHelperText(nc.helperText)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_helpertext" /*RemoteObject*/ )));
 BA.debugLineNum = 1236;BA.debugLine="fil.SetPlaceholder(nc.placeholder)";
Debug.JustUpdateDeviceLine();
_fil.runClassMethod (b4j.example.vmfile.class, "_setplaceholder" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_placeholder" /*RemoteObject*/ ))));
 BA.debugLineNum = 1240;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, fil.ToStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_fil.runClassMethod (b4j.example.vmfile.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
 BA.debugLineNum = 1243;BA.debugLine="Dim input As VMInput = CreateInput(nc.name, mo";
Debug.JustUpdateDeviceLine();
_input = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createinput" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("input", _input);Debug.locals.put("input", _input);
 BA.debugLineNum = 1244;BA.debugLine="input.SetErrorText(nc.errorText)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_errortext" /*RemoteObject*/ )));
 BA.debugLineNum = 1245;BA.debugLine="input.SetType(nc.typeOf)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_settype" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_typeof" /*RemoteObject*/ ))));
 BA.debugLineNum = 1246;BA.debugLine="input.SetLabel(nc.label)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setlabel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )));
 BA.debugLineNum = 1247;BA.debugLine="input.SetReadOnly(nc.readonly)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setreadonly" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_readonly" /*RemoteObject*/ )));
 BA.debugLineNum = 1248;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1249;BA.debugLine="input.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1250;BA.debugLine="input.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setvshow" /*RemoteObject*/ ,(Object)((_showkey)));
 BA.debugLineNum = 1251;BA.debugLine="input.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 BA.debugLineNum = 1252;BA.debugLine="input.SetRequired(nc.required)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setrequired" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_required" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1254;BA.debugLine="input.SetName(nc.name,False)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setname" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_name" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1255;BA.debugLine="input.SetAutoComplete(nc.name)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setautocomplete" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1256;BA.debugLine="input.SetIcon(nc.IconName)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_seticon" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_iconname" /*RemoteObject*/ )));
 BA.debugLineNum = 1257;BA.debugLine="input.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1258;BA.debugLine="input.SetMaxlength(nc.MaxLength)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setmaxlength" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(false,"_maxlength" /*RemoteObject*/ ))));
 BA.debugLineNum = 1259;BA.debugLine="input.SetHelperText(nc.helperText)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_helpertext" /*RemoteObject*/ )));
 BA.debugLineNum = 1260;BA.debugLine="input.SetPlaceholder(nc.placeholder)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setplaceholder" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_placeholder" /*RemoteObject*/ ))));
 BA.debugLineNum = 1261;BA.debugLine="If nc.typeOf <> \"password\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_nc.getField(true,"_typeof" /*RemoteObject*/ ),BA.ObjectToString("password"))) { 
 BA.debugLineNum = 1262;BA.debugLine="input.SetClearable(nc.clearable)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setclearable" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_clearable" /*RemoteObject*/ )));
 BA.debugLineNum = 1263;BA.debugLine="input.SetTogglePassword(nc.TogglePassword)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_settogglepassword" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_togglepassword" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1268;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, input.ToStr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_input.runClassMethod (b4j.example.vminput.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 13: {
 BA.debugLineNum = 1271;BA.debugLine="Dim txtarea As VMTextArea = CreateTextArea(nc.";
Debug.JustUpdateDeviceLine();
_txtarea = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createtextarea" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("txtarea", _txtarea);Debug.locals.put("txtarea", _txtarea);
 BA.debugLineNum = 1272;BA.debugLine="txtarea.SetClearable(nc.clearable)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setclearable" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_clearable" /*RemoteObject*/ )));
 BA.debugLineNum = 1273;BA.debugLine="txtarea.SetErrorText(nc.errorText)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_errortext" /*RemoteObject*/ )));
 BA.debugLineNum = 1274;BA.debugLine="txtarea.SetLabel(nc.label)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setlabel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )));
 BA.debugLineNum = 1275;BA.debugLine="txtarea.SetReadOnly(nc.readonly)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setreadonly" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_readonly" /*RemoteObject*/ )));
 BA.debugLineNum = 1276;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1277;BA.debugLine="txtarea.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1278;BA.debugLine="txtarea.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1279;BA.debugLine="txtarea.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 BA.debugLineNum = 1280;BA.debugLine="txtarea.SetRequired(nc.required)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setrequired" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_required" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1282;BA.debugLine="txtarea.SetName(nc.name,False)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setname" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_name" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1283;BA.debugLine="txtarea.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1284;BA.debugLine="txtarea.SetMaxlength(nc.MaxLength)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setmaxlength" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_nc.getField(false,"_maxlength" /*RemoteObject*/ ))));
 BA.debugLineNum = 1285;BA.debugLine="txtarea.SetPlaceholder(nc.placeholder)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setplaceholder" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_placeholder" /*RemoteObject*/ ))));
 BA.debugLineNum = 1286;BA.debugLine="txtarea.SetHelperText(nc.helperText)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_helpertext" /*RemoteObject*/ )));
 BA.debugLineNum = 1287;BA.debugLine="txtarea.SetAutogrow(nc.AutoGrow)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_setautogrow" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_autogrow" /*RemoteObject*/ )));
 BA.debugLineNum = 1288;BA.debugLine="txtarea.SetIcon(nc.IconName)";
Debug.JustUpdateDeviceLine();
_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_seticon" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_iconname" /*RemoteObject*/ )));
 BA.debugLineNum = 1292;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, txtarea.ToS";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_txtarea.runClassMethod (b4j.example.vmtextarea.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 14: {
 BA.debugLineNum = 1294;BA.debugLine="Dim ibox As VMInfoBox = CreateInfoBox(nc.name,";
Debug.JustUpdateDeviceLine();
_ibox = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createinfobox" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("ibox", _ibox);Debug.locals.put("ibox", _ibox);
 BA.debugLineNum = 1295;BA.debugLine="If nc.bSetCounter Then";
Debug.JustUpdateDeviceLine();
if (_nc.getField(true,"_bsetcounter" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1296;BA.debugLine="ibox.SetFrom(nc.Start)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_setfrom" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_start" /*RemoteObject*/ )));
 BA.debugLineNum = 1297;BA.debugLine="ibox.SetTo(nc.Finish)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_setto" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_finish" /*RemoteObject*/ )));
 BA.debugLineNum = 1298;BA.debugLine="ibox.SetSpeed(nc.Speed)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_setspeed" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_speed" /*RemoteObject*/ )));
 BA.debugLineNum = 1299;BA.debugLine="ibox.SetRefreshInterval(nc.RefreshInterval)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_setrefreshinterval" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_refreshinterval" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1301;BA.debugLine="ibox.SetNumber(nc.Count)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_setnumber" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_count" /*RemoteObject*/ )));
 BA.debugLineNum = 1302;BA.debugLine="ibox.SetIcon(nc.IconName)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_seticon" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_iconname" /*RemoteObject*/ )));
 BA.debugLineNum = 1303;BA.debugLine="ibox.SetIconColor(nc.IconColor)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_seticoncolor" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_iconcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 1304;BA.debugLine="ibox.SetIconBackgroundColor(nc.IconBackgroundC";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_seticonbackgroundcolor" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_iconbackgroundcolor" /*RemoteObject*/ )));
 BA.debugLineNum = 1305;BA.debugLine="ibox.SetText(nc.Text)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_settext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_text" /*RemoteObject*/ )));
 BA.debugLineNum = 1306;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1307;BA.debugLine="ibox.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_setvshow" /*RemoteObject*/ ,(Object)((_showkey)));
 };
 BA.debugLineNum = 1309;BA.debugLine="ibox.SetHoverExpandEffect(nc.HoverExpandEffect";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_sethoverexpandeffect" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_hoverexpandeffect" /*RemoteObject*/ )));
 BA.debugLineNum = 1310;BA.debugLine="ibox.SetHoverZoomEffect(nc.HoverZoomEffect)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_sethoverzoomeffect" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_hoverzoomeffect" /*RemoteObject*/ )));
 BA.debugLineNum = 1311;BA.debugLine="Select Case nc.BoxType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_nc.getField(true,"_boxtype" /*RemoteObject*/ ),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"))) {
case 0: {
 BA.debugLineNum = 1313;BA.debugLine="ibox.SetStyle2(True)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_setstyle2" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 break; }
case 1: {
 BA.debugLineNum = 1315;BA.debugLine="ibox.SetStyle3(True)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_setstyle3" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 break; }
case 2: {
 BA.debugLineNum = 1317;BA.debugLine="ibox.SetStyle4(True)";
Debug.JustUpdateDeviceLine();
_ibox.runClassMethod (b4j.example.vminfobox.class, "_setstyle4" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 break; }
}
;
 BA.debugLineNum = 1319;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, ibox.ToStri";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_ibox.runClassMethod (b4j.example.vminfobox.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 15: {
 BA.debugLineNum = 1321;BA.debugLine="Dim slid As VMSlider = CreateSlider(nc.name, m";
Debug.JustUpdateDeviceLine();
_slid = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createslider" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("slid", _slid);Debug.locals.put("slid", _slid);
 BA.debugLineNum = 1322;BA.debugLine="slid.SetMin(nc.minvalue)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setmin" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_minvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 1323;BA.debugLine="slid.SetMax(nc.maxvalue)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setmax" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_maxvalue" /*RemoteObject*/ )));
 BA.debugLineNum = 1324;BA.debugLine="slid.SetLabel(nc.label)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setlabel" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_label" /*RemoteObject*/ ))));
 BA.debugLineNum = 1325;BA.debugLine="slid.SetThumbLabel(nc.ThumbLabel)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setthumblabel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_thumblabel" /*RemoteObject*/ )));
 BA.debugLineNum = 1326;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1327;BA.debugLine="slid.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1328;BA.debugLine="slid.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setvshow" /*RemoteObject*/ ,(Object)((_showkey)));
 BA.debugLineNum = 1329;BA.debugLine="slid.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1331;BA.debugLine="slid.SetName(nc.name,False)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setname" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_name" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1332;BA.debugLine="slid.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1336;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, slid.ToStri";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_slid.runClassMethod (b4j.example.vmslider.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 16: {
 BA.debugLineNum = 1338;BA.debugLine="Dim ni As VMNumberInput = CreateNumberInput(nc";
Debug.JustUpdateDeviceLine();
_ni = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createnumberinput" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));Debug.locals.put("ni", _ni);Debug.locals.put("ni", _ni);
 BA.debugLineNum = 1339;BA.debugLine="ni.SetMin(nc.minvalue)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setmin" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_minvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 1340;BA.debugLine="ni.SetMax(nc.maxvalue)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setmax" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_maxvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 1341;BA.debugLine="ni.SetLabel(nc.label)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setlabel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )));
 BA.debugLineNum = 1342;BA.debugLine="ni.SetReadOnly(nc.readonly)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setreadonly" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_readonly" /*RemoteObject*/ )));
 BA.debugLineNum = 1343;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1344;BA.debugLine="ni.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1345;BA.debugLine="ni.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1346;BA.debugLine="ni.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1348;BA.debugLine="ni.SetName(nc.name,False)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setname" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_name" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1349;BA.debugLine="ni.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1353;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, ni.ToString";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_ni.runClassMethod (b4j.example.vmnumberinput.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 17: 
case 18: {
 BA.debugLineNum = 1355;BA.debugLine="isarray = False";
Debug.JustUpdateDeviceLine();
_isarray = vmcontainer.__c.getField(true,"False");Debug.locals.put("isarray", _isarray);
 BA.debugLineNum = 1356;BA.debugLine="Dim sel As VMSelect = CreateSelect(nc.name, mo";
Debug.JustUpdateDeviceLine();
_sel = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createselect" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("sel", _sel);Debug.locals.put("sel", _sel);
 BA.debugLineNum = 1357;BA.debugLine="sel.SetLabel(nc.label)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setlabel" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_label" /*RemoteObject*/ ))));
 BA.debugLineNum = 1358;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1359;BA.debugLine="sel.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1360;BA.debugLine="sel.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1361;BA.debugLine="sel.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 BA.debugLineNum = 1362;BA.debugLine="sel.SetRequired(nc.required)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setrequired" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_required" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1364;BA.debugLine="sel.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1365;BA.debugLine="sel.SetPlaceholder(nc.placeholder)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setplaceholder" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_placeholder" /*RemoteObject*/ )));
 BA.debugLineNum = 1366;BA.debugLine="sel.SetHelperText(nc.helperText)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_helpertext" /*RemoteObject*/ )));
 BA.debugLineNum = 1367;BA.debugLine="sel.SetErrorText(nc.errorText)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_errortext" /*RemoteObject*/ )));
 BA.debugLineNum = 1368;BA.debugLine="sel.SetDense(nc.Dense)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setdense" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_dense" /*RemoteObject*/ )));
 BA.debugLineNum = 1369;BA.debugLine="If nc.UseOptions = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_nc.getField(true,"_useoptions" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"True"))) { 
 BA.debugLineNum = 1370;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1371;BA.debugLine="sel.SetOptions(nc.sourceTable, nc.options, n";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setoptions" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_sourcetable" /*RemoteObject*/ )),(Object)(_nc.getField(false,"_options" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_sourcefield" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_displayfield" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 1373;BA.debugLine="For Each ok As String In nc.options.keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group326 = _nc.getField(false,"_options" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen326 = group326.runMethod(true,"getSize").<Integer>get()
;int index326 = 0;
;
for (; index326 < groupLen326;index326++){
_ok = BA.ObjectToString(group326.runMethod(false,"Get",index326));Debug.locals.put("ok", _ok);
Debug.locals.put("ok", _ok);
 BA.debugLineNum = 1374;BA.debugLine="Dim ov As String = nc.options.Get(ok)";
Debug.JustUpdateDeviceLine();
_ov = BA.ObjectToString(_nc.getField(false,"_options" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_ok))));Debug.locals.put("ov", _ov);Debug.locals.put("ov", _ov);
 BA.debugLineNum = 1375;BA.debugLine="sel.additem(ok, ov)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_additem" /*RemoteObject*/ ,(Object)(_ok),(Object)(_ov));
 }
}Debug.locals.put("ok", _ok);
;
 };
 }else {
 BA.debugLineNum = 1379;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1380;BA.debugLine="sel.SetDataSource(nc.sourceTable, nc.sourceF";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setdatasource" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_sourcetable" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_sourcefield" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_displayfield" /*RemoteObject*/ )));
 };
 };
 BA.debugLineNum = 1383;BA.debugLine="sel.SetMultiple(nc.multiple)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setmultiple" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_multiple" /*RemoteObject*/ )));
 BA.debugLineNum = 1384;BA.debugLine="sel.SetDense(True)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setdense" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 1385;BA.debugLine="If nc.multiple Then isarray = True";
Debug.JustUpdateDeviceLine();
if (_nc.getField(true,"_multiple" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_isarray = vmcontainer.__c.getField(true,"True");Debug.locals.put("isarray", _isarray);};
 BA.debugLineNum = 1389;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, sel.ToStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_sel.runClassMethod (b4j.example.vmselect.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 19: 
case 20: {
 BA.debugLineNum = 1411;BA.debugLine="Dim datex As VMDatePicker = CreateDatePicker(n";
Debug.JustUpdateDeviceLine();
_datex = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createdatepicker" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("datex", _datex);Debug.locals.put("datex", _datex);
 BA.debugLineNum = 1412;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1413;BA.debugLine="datex.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1414;BA.debugLine="datex.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1415;BA.debugLine="datex.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 BA.debugLineNum = 1416;BA.debugLine="datex.SetRequired(nc.required)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setrequired" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_required" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1418;BA.debugLine="datex.SetLabel(nc.label)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setlabel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )));
 BA.debugLineNum = 1419;BA.debugLine="datex.SetImmediately(nc.immediately)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setimmediately" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_immediately" /*RemoteObject*/ )));
 BA.debugLineNum = 1420;BA.debugLine="datex.SetOpenOnFocus(nc.openonfocus)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setopenonfocus" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_openonfocus" /*RemoteObject*/ )));
 BA.debugLineNum = 1421;BA.debugLine="datex.SetClearable(nc.clearable)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setclearable" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_clearable" /*RemoteObject*/ )));
 BA.debugLineNum = 1422;BA.debugLine="datex.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1428;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, datex.ToStr";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_datex.runClassMethod (b4j.example.vmdatepicker.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 21: {
 BA.debugLineNum = 1431;BA.debugLine="Dim chk As VMCheckBox = CreateCheckBox(nc.name";
Debug.JustUpdateDeviceLine();
_chk = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createcheckbox" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("chk", _chk);Debug.locals.put("chk", _chk);
 BA.debugLineNum = 1432;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1433;BA.debugLine="chk.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_chk.runClassMethod (b4j.example.vmcheckbox.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1434;BA.debugLine="chk.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_chk.runClassMethod (b4j.example.vmcheckbox.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1435;BA.debugLine="chk.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_chk.runClassMethod (b4j.example.vmcheckbox.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1437;BA.debugLine="chk.SetValue(nc.value)";
Debug.JustUpdateDeviceLine();
_chk.runClassMethod (b4j.example.vmcheckbox.class, "_setvalue" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_value" /*RemoteObject*/ ))));
 BA.debugLineNum = 1438;BA.debugLine="chk.SetText(nc.label)";
Debug.JustUpdateDeviceLine();
_chk.runClassMethod (b4j.example.vmcheckbox.class, "_settext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )));
 BA.debugLineNum = 1439;BA.debugLine="chk.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
_chk.runClassMethod (b4j.example.vmcheckbox.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 1440;BA.debugLine="chk.SetName(nc.name,False)";
Debug.JustUpdateDeviceLine();
_chk.runClassMethod (b4j.example.vmcheckbox.class, "_setname" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_name" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1441;BA.debugLine="chk.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_chk.runClassMethod (b4j.example.vmcheckbox.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1445;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, chk.ToStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_chk.runClassMethod (b4j.example.vmcheckbox.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 22: 
case 23: {
 BA.debugLineNum = 1448;BA.debugLine="Dim sw As VMSwitch = CreateSwitch(nc.name, mod";
Debug.JustUpdateDeviceLine();
_sw = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createswitch" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("sw", _sw);Debug.locals.put("sw", _sw);
 BA.debugLineNum = 1449;BA.debugLine="sw.SetText(nc.label)";
Debug.JustUpdateDeviceLine();
_sw.runClassMethod (b4j.example.vmswitch.class, "_settext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )));
 BA.debugLineNum = 1450;BA.debugLine="sw.SetValue(nc.value)";
Debug.JustUpdateDeviceLine();
_sw.runClassMethod (b4j.example.vmswitch.class, "_setvalue" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_value" /*RemoteObject*/ ))));
 BA.debugLineNum = 1451;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1452;BA.debugLine="sw.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_sw.runClassMethod (b4j.example.vmswitch.class, "_setvshow" /*RemoteObject*/ ,(Object)((_showkey)));
 BA.debugLineNum = 1453;BA.debugLine="sw.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_sw.runClassMethod (b4j.example.vmswitch.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1454;BA.debugLine="sw.SetDisabled(nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
_sw.runClassMethod (b4j.example.vmswitch.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_isdisabled" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1456;BA.debugLine="sw.SetName(nc.name,False)";
Debug.JustUpdateDeviceLine();
_sw.runClassMethod (b4j.example.vmswitch.class, "_setname" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_name" /*RemoteObject*/ ))),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1457;BA.debugLine="sw.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
_sw.runClassMethod (b4j.example.vmswitch.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 1458;BA.debugLine="sw.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_sw.runClassMethod (b4j.example.vmswitch.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1462;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, sw.ToString";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_sw.runClassMethod (b4j.example.vmswitch.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 24: {
 BA.debugLineNum = 1464;BA.debugLine="Dim icn As VMIcon = CreateIcon(nc.name)";
Debug.JustUpdateDeviceLine();
_icn = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createicon" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));Debug.locals.put("icn", _icn);Debug.locals.put("icn", _icn);
 BA.debugLineNum = 1465;BA.debugLine="icn.SetText(nc.IconName)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_iconname" /*RemoteObject*/ )));
 BA.debugLineNum = 1466;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1467;BA.debugLine="icn.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_setvshow" /*RemoteObject*/ ,(Object)((_showkey)));
 };
 BA.debugLineNum = 1469;BA.debugLine="icn.SetName(nc.name,False)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_setname" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 1470;BA.debugLine="Select Case nc.IconSize";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_nc.getField(true,"_iconsize" /*RemoteObject*/ ),BA.ObjectToString("normal"),BA.ObjectToString("2"),BA.ObjectToString("3"),BA.ObjectToString("4"),BA.ObjectToString("5"))) {
case 0: {
 break; }
case 1: {
 BA.debugLineNum = 1473;BA.debugLine="icn.SetSize2x(True)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_setsize2x" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 break; }
case 2: {
 BA.debugLineNum = 1475;BA.debugLine="icn.SetSize3x(True)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_setsize3x" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 break; }
case 3: {
 BA.debugLineNum = 1477;BA.debugLine="icn.SetSize4x(True)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_setsize4x" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 break; }
case 4: {
 BA.debugLineNum = 1479;BA.debugLine="icn.SetSize5x(True)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_setsize5x" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 break; }
}
;
 BA.debugLineNum = 1481;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, icn.ToStrin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_icn.runClassMethod (b4j.example.vmicon.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 25: 
case 26: {
 BA.debugLineNum = 1500;BA.debugLine="Dim rg As VMRadioGroup = CreateRadioGroup(nc.n";
Debug.JustUpdateDeviceLine();
_rg = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createradiogroup" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("rg", _rg);Debug.locals.put("rg", _rg);
 BA.debugLineNum = 1501;BA.debugLine="rg.SetDesignMode(DesignMode)";
Debug.JustUpdateDeviceLine();
_rg.runClassMethod (b4j.example.vmradiogroup.class, "_setdesignmode" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_designmode" /*RemoteObject*/ )));
 BA.debugLineNum = 1502;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1503;BA.debugLine="rg.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_rg.runClassMethod (b4j.example.vmradiogroup.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1504;BA.debugLine="rg.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_rg.runClassMethod (b4j.example.vmradiogroup.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1505;BA.debugLine="rg.SetValue(nc.value)";
Debug.JustUpdateDeviceLine();
_rg.runClassMethod (b4j.example.vmradiogroup.class, "_setvalue" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_value" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 1507;BA.debugLine="rg.AddItems(nc.options)";
Debug.JustUpdateDeviceLine();
_rg.runClassMethod (b4j.example.vmradiogroup.class, "_additems" /*RemoteObject*/ ,(Object)(_nc.getField(false,"_options" /*RemoteObject*/ )));
 BA.debugLineNum = 1508;BA.debugLine="rg.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_rg.runClassMethod (b4j.example.vmradiogroup.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1509;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, rg.ToString";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_rg.runClassMethod (b4j.example.vmradiogroup.class, "_tostring" /*RemoteObject*/ )));
 break; }
case 27: {
 BA.debugLineNum = 1511;BA.debugLine="isarray = True";
Debug.JustUpdateDeviceLine();
_isarray = vmcontainer.__c.getField(true,"True");Debug.locals.put("isarray", _isarray);
 BA.debugLineNum = 1512;BA.debugLine="Dim cg As VMCheckBoxGroup = CreateCheckBoxGrou";
Debug.JustUpdateDeviceLine();
_cg = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createcheckboxgroup" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(_nc.getField(true,"_label" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));Debug.locals.put("cg", _cg);Debug.locals.put("cg", _cg);
 BA.debugLineNum = 1513;BA.debugLine="cg.SetDesignMode(DesignMode)";
Debug.JustUpdateDeviceLine();
_cg.runClassMethod (b4j.example.vmcheckboxgroup.class, "_setdesignmode" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_designmode" /*RemoteObject*/ )));
 BA.debugLineNum = 1514;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1515;BA.debugLine="cg.SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
_cg.runClassMethod (b4j.example.vmcheckboxgroup.class, "_setvshow" /*RemoteObject*/ ,(Object)(_showkey));
 BA.debugLineNum = 1516;BA.debugLine="cg.SetVModel(nc.name)";
Debug.JustUpdateDeviceLine();
_cg.runClassMethod (b4j.example.vmcheckboxgroup.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )));
 BA.debugLineNum = 1517;BA.debugLine="cg.SetValue(nc.value)";
Debug.JustUpdateDeviceLine();
_cg.runClassMethod (b4j.example.vmcheckboxgroup.class, "_setvalue" /*RemoteObject*/ ,(Object)((_nc.getField(true,"_value" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 1519;BA.debugLine="cg.AddItems(nc.options)";
Debug.JustUpdateDeviceLine();
_cg.runClassMethod (b4j.example.vmcheckboxgroup.class, "_additems" /*RemoteObject*/ ,(Object)(_nc.getField(false,"_options" /*RemoteObject*/ )));
 BA.debugLineNum = 1520;BA.debugLine="cg.SetTabIndex(nc.TabIndex)";
Debug.JustUpdateDeviceLine();
_cg.runClassMethod (b4j.example.vmcheckboxgroup.class, "_settabindex" /*RemoteObject*/ ,(Object)(BA.NumberToString(_nc.getField(true,"_tabindex" /*RemoteObject*/ ))));
 BA.debugLineNum = 1521;BA.debugLine="Grid.AddComponent(nc.row, nc.Cell, cg.ToString";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _nc.getField(true,"_row" /*RemoteObject*/ ))),(Object)(BA.numberCast(int.class, _nc.getField(true,"_cell" /*RemoteObject*/ ))),(Object)(_cg.runClassMethod (b4j.example.vmcheckboxgroup.class, "_tostring" /*RemoteObject*/ )));
 break; }
}
;
 BA.debugLineNum = 1524;BA.debugLine="If DesignMode = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_designmode" /*RemoteObject*/ ),vmcontainer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 1525;BA.debugLine="vue.SetStateSingle(showKey, nc.Isvisible)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_showkey),(Object)((_nc.getField(true,"_isvisible" /*RemoteObject*/ ))));
 BA.debugLineNum = 1526;BA.debugLine="vue.SetStateSingle(disKey, nc.IsDisabled)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_diskey),(Object)((_nc.getField(true,"_isdisabled" /*RemoteObject*/ ))));
 BA.debugLineNum = 1527;BA.debugLine="vue.SetStateSingle(enaKey, nc.Required)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_enakey),(Object)((_nc.getField(true,"_required" /*RemoteObject*/ ))));
 BA.debugLineNum = 1528;BA.debugLine="If isarray Then";
Debug.JustUpdateDeviceLine();
if (_isarray.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1529;BA.debugLine="vue.SetStateSingle(nc.name, Array())";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)((RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 }else {
 BA.debugLineNum = 1531;BA.debugLine="vue.SetStateSingle(nc.name, nc.defaultValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_nc.getField(true,"_name" /*RemoteObject*/ )),(Object)(_nc.getField(false,"_defaultvalue" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 1533;BA.debugLine="vue.SetStateSingle(errKey, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_errkey),(Object)((vmcontainer.__c.getField(true,"False"))));
 };
 }
}Debug.locals.put("nc", _nc);
;
 BA.debugLineNum = 1536;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildgrid(RemoteObject __ref,RemoteObject _parentgrid) throws Exception{
try {
		Debug.PushSubsStack("BuildGrid (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1570);
if (RapidSub.canDelegate("buildgrid")) { return __ref.runUserSub(false, "vmcontainer","buildgrid", __ref, _parentgrid);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _missingrc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
int _compcnt = 0;
RemoteObject _srow = RemoteObject.createImmutable("");
RemoteObject _scell = RemoteObject.createImmutable("");
RemoteObject _rckey = RemoteObject.createImmutable("");
RemoteObject _rc = RemoteObject.createImmutable("");
RemoteObject _finalrows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _finalcells = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strrow = RemoteObject.createImmutable("");
RemoteObject _colcnt = RemoteObject.createImmutable(0);
RemoteObject _finalrow = RemoteObject.createImmutable("");
RemoteObject _er = RemoteObject.declareNull("b4j.example.vmcontainer._eachrow");
RemoteObject _finalcell = null;
RemoteObject _ec = null;
RemoteObject _finalcellssize = RemoteObject.createImmutable(0);
RemoteObject _cellsize = RemoteObject.createImmutable(0);
Debug.locals.put("parentGrid", _parentgrid);
 BA.debugLineNum = 1570;BA.debugLine="private Sub BuildGrid(parentGrid As VMGrid)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1572;BA.debugLine="sortItL.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitl" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1573;BA.debugLine="For Each k As String In sortitM.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = __ref.getField(false,"_sortitm" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 1574;BA.debugLine="sortItL.Add(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitl" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_k)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 1577;BA.debugLine="sortItL.Sort(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitl" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 1579;BA.debugLine="Dim missingRC As List";
Debug.JustUpdateDeviceLine();
_missingrc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("missingRC", _missingrc);
 BA.debugLineNum = 1580;BA.debugLine="missingRC.Initialize";
Debug.JustUpdateDeviceLine();
_missingrc.runVoidMethod ("Initialize");
 BA.debugLineNum = 1581;BA.debugLine="For compCnt = 1 To TotalRows";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = __ref.getField(true,"_totalrows" /*RemoteObject*/ ).<Integer>get().intValue();
_compcnt = 1 ;
for (;(step8 > 0 && _compcnt <= limit8) || (step8 < 0 && _compcnt >= limit8) ;_compcnt = ((int)(0 + _compcnt + step8))  ) {
Debug.locals.put("compCnt", _compcnt);
 BA.debugLineNum = 1582;BA.debugLine="Dim sRow As String = compCnt";
Debug.JustUpdateDeviceLine();
_srow = BA.NumberToString(_compcnt);Debug.locals.put("sRow", _srow);Debug.locals.put("sRow", _srow);
 BA.debugLineNum = 1583;BA.debugLine="sRow = vue.PadRight(sRow,2,\"0\")";
Debug.JustUpdateDeviceLine();
_srow = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_padright" /*RemoteObject*/ ,(Object)(_srow),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("sRow", _srow);
 BA.debugLineNum = 1584;BA.debugLine="Dim sCell As String = vue.PadRight(\"1\",2,\"0\")";
Debug.JustUpdateDeviceLine();
_scell = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_padright" /*RemoteObject*/ ,(Object)(BA.ObjectToString("1")),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("0")));Debug.locals.put("sCell", _scell);Debug.locals.put("sCell", _scell);
 BA.debugLineNum = 1585;BA.debugLine="Dim rcKey As String = $\"${sRow}.${sCell}\"$";
Debug.JustUpdateDeviceLine();
_rckey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_srow))),RemoteObject.createImmutable("."),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_scell))),RemoteObject.createImmutable("")));Debug.locals.put("rcKey", _rckey);Debug.locals.put("rcKey", _rckey);
 BA.debugLineNum = 1586;BA.debugLine="If sortItL.IndexOf(rcKey) = -1 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_sortitl" /*RemoteObject*/ ).runMethod(true,"IndexOf",(Object)((_rckey))),BA.numberCast(double.class, -(double) (0 + 1)))) { 
 BA.debugLineNum = 1587;BA.debugLine="missingRC.Add(rcKey)";
Debug.JustUpdateDeviceLine();
_missingrc.runVoidMethod ("Add",(Object)((_rckey)));
 };
 }
}Debug.locals.put("compCnt", _compcnt);
;
 BA.debugLineNum = 1590;BA.debugLine="If missingRC.Size -1 >= 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("g",RemoteObject.solve(new RemoteObject[] {_missingrc.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 1591;BA.debugLine="For Each rc As String In missingRC";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group18 = _missingrc;
final int groupLen18 = group18.runMethod(true,"getSize").<Integer>get()
;int index18 = 0;
;
for (; index18 < groupLen18;index18++){
_rc = BA.ObjectToString(group18.runMethod(false,"Get",index18));Debug.locals.put("rc", _rc);
Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1592;BA.debugLine="Log(\"VMContainer: \"& rc & \": RC is NOT defined\"";
Debug.JustUpdateDeviceLine();
vmcontainer.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("VMContainer: "),_rc,RemoteObject.createImmutable(": RC is NOT defined"))));
 }
}Debug.locals.put("rc", _rc);
;
 BA.debugLineNum = 1595;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1600;BA.debugLine="Dim finalRows As Map";
Debug.JustUpdateDeviceLine();
_finalrows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("finalRows", _finalrows);
 BA.debugLineNum = 1601;BA.debugLine="finalRows.Initialize";
Debug.JustUpdateDeviceLine();
_finalrows.runVoidMethod ("Initialize");
 BA.debugLineNum = 1602;BA.debugLine="For Each rc As String In sortItL";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group25 = __ref.getField(false,"_sortitl" /*RemoteObject*/ );
final int groupLen25 = group25.runMethod(true,"getSize").<Integer>get()
;int index25 = 0;
;
for (; index25 < groupLen25;index25++){
_rc = BA.ObjectToString(group25.runMethod(false,"Get",index25));Debug.locals.put("rc", _rc);
Debug.locals.put("rc", _rc);
 BA.debugLineNum = 1603;BA.debugLine="Dim sRow As String = vue.MvField(rc,1,\".\")";
Debug.JustUpdateDeviceLine();
_srow = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_mvfield" /*RemoteObject*/ ,(Object)(_rc),(Object)(BA.numberCast(int.class, 1)),(Object)(RemoteObject.createImmutable(".")));Debug.locals.put("sRow", _srow);Debug.locals.put("sRow", _srow);
 BA.debugLineNum = 1604;BA.debugLine="If finalRows.ContainsKey(sRow) Then";
Debug.JustUpdateDeviceLine();
if (_finalrows.runMethod(true,"ContainsKey",(Object)((_srow))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1605;BA.debugLine="Dim finalCells As List = finalRows.Get(sRow)";
Debug.JustUpdateDeviceLine();
_finalcells = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_finalcells.setObject(_finalrows.runMethod(false,"Get",(Object)((_srow))));Debug.locals.put("finalCells", _finalcells);
 }else {
 BA.debugLineNum = 1607;BA.debugLine="Dim finalCells As List";
Debug.JustUpdateDeviceLine();
_finalcells = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("finalCells", _finalcells);
 BA.debugLineNum = 1608;BA.debugLine="finalCells.Initialize";
Debug.JustUpdateDeviceLine();
_finalcells.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 1610;BA.debugLine="finalCells.Add(rc)";
Debug.JustUpdateDeviceLine();
_finalcells.runVoidMethod ("Add",(Object)((_rc)));
 BA.debugLineNum = 1611;BA.debugLine="finalRows.Put(sRow,finalCells)";
Debug.JustUpdateDeviceLine();
_finalrows.runVoidMethod ("Put",(Object)((_srow)),(Object)((_finalcells.getObject())));
 }
}Debug.locals.put("rc", _rc);
;
 BA.debugLineNum = 1615;BA.debugLine="sortItL.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitl" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 1616;BA.debugLine="For Each strRow As String In finalRows.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group37 = _finalrows.runMethod(false,"Keys");
final int groupLen37 = group37.runMethod(true,"getSize").<Integer>get()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_strrow = BA.ObjectToString(group37.runMethod(false,"Get",index37));Debug.locals.put("strRow", _strrow);
Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 1617;BA.debugLine="sortItL.Add(strRow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitl" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_strrow)));
 }
}Debug.locals.put("strRow", _strrow);
;
 BA.debugLineNum = 1619;BA.debugLine="sortItL.Sort(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitl" /*RemoteObject*/ ).runVoidMethod ("Sort",(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 1620;BA.debugLine="Dim colCnt As Int";
Debug.JustUpdateDeviceLine();
_colcnt = RemoteObject.createImmutable(0);Debug.locals.put("colCnt", _colcnt);
 BA.debugLineNum = 1621;BA.debugLine="For Each finalRow As String In sortItL";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group42 = __ref.getField(false,"_sortitl" /*RemoteObject*/ );
final int groupLen42 = group42.runMethod(true,"getSize").<Integer>get()
;int index42 = 0;
;
for (; index42 < groupLen42;index42++){
_finalrow = BA.ObjectToString(group42.runMethod(false,"Get",index42));Debug.locals.put("finalRow", _finalrow);
Debug.locals.put("finalRow", _finalrow);
 BA.debugLineNum = 1622;BA.debugLine="Dim er As EachRow = rows.Get(finalRow)";
Debug.JustUpdateDeviceLine();
_er = (__ref.getField(false,"_rows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_finalrow))));Debug.locals.put("er", _er);Debug.locals.put("er", _er);
 BA.debugLineNum = 1625;BA.debugLine="Dim finalCell(11) As String";
Debug.JustUpdateDeviceLine();
_finalcell = RemoteObject.createNewArray ("String", new int[] {11}, new Object[]{});Debug.locals.put("finalCell", _finalcell);
 BA.debugLineNum = 1626;BA.debugLine="Dim ec(11) As VMInputControl";
Debug.JustUpdateDeviceLine();
_ec = RemoteObject.createNewArray ("b4j.example.vminputcontrol", new int[] {11}, new Object[]{});Debug.locals.put("ec", _ec);
 BA.debugLineNum = 1629;BA.debugLine="Dim finalCells As List = finalRows.Get(finalRow)";
Debug.JustUpdateDeviceLine();
_finalcells = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_finalcells.setObject(_finalrows.runMethod(false,"Get",(Object)((_finalrow))));Debug.locals.put("finalCells", _finalcells);
 BA.debugLineNum = 1631;BA.debugLine="Dim finalCellsSize As Int = finalCells.Size - 1";
Debug.JustUpdateDeviceLine();
_finalcellssize = RemoteObject.solve(new RemoteObject[] {_finalcells.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("finalCellsSize", _finalcellssize);Debug.locals.put("finalCellsSize", _finalcellssize);
 BA.debugLineNum = 1632;BA.debugLine="For colCnt = 0 To finalCellsSize";
Debug.JustUpdateDeviceLine();
{
final int step48 = 1;
final int limit48 = _finalcellssize.<Integer>get().intValue();
_colcnt = BA.numberCast(int.class, 0) ;
for (;(step48 > 0 && _colcnt.<Integer>get().intValue() <= limit48) || (step48 < 0 && _colcnt.<Integer>get().intValue() >= limit48) ;_colcnt = RemoteObject.createImmutable((int)(0 + _colcnt.<Integer>get().intValue() + step48))  ) {
Debug.locals.put("colCnt", _colcnt);
 BA.debugLineNum = 1633;BA.debugLine="finalCell(colCnt) = finalCells.Get(colCnt)";
Debug.JustUpdateDeviceLine();
_finalcell.setArrayElement (BA.ObjectToString(_finalcells.runMethod(false,"Get",(Object)(_colcnt))),_colcnt);
 BA.debugLineNum = 1634;BA.debugLine="ec(colCnt) = sortitM.Get(finalCell(colCnt))";
Debug.JustUpdateDeviceLine();
_ec.setArrayElement ( /*RemoteObject*/ (__ref.getField(false,"_sortitm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_finalcell.getArrayElement(true,_colcnt))))),_colcnt);
 }
}Debug.locals.put("colCnt", _colcnt);
;
 BA.debugLineNum = 1637;BA.debugLine="parentGrid.AddRow(1, er.Visibility, \"\", \"\")";
Debug.JustUpdateDeviceLine();
_parentgrid.runClassMethod (b4j.example.vmgrid.class, "_addrow" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(_er.getField(true,"visibility" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 1638;BA.debugLine="Dim cellSize As Int";
Debug.JustUpdateDeviceLine();
_cellsize = RemoteObject.createImmutable(0);Debug.locals.put("cellSize", _cellsize);
 BA.debugLineNum = 1639;BA.debugLine="For cellSize = 0 To finalCellsSize";
Debug.JustUpdateDeviceLine();
{
final int step54 = 1;
final int limit54 = _finalcellssize.<Integer>get().intValue();
_cellsize = BA.numberCast(int.class, 0) ;
for (;(step54 > 0 && _cellsize.<Integer>get().intValue() <= limit54) || (step54 < 0 && _cellsize.<Integer>get().intValue() >= limit54) ;_cellsize = RemoteObject.createImmutable((int)(0 + _cellsize.<Integer>get().intValue() + step54))  ) {
Debug.locals.put("cellSize", _cellsize);
 BA.debugLineNum = 1641;BA.debugLine="parentGrid.AddColumnOSMP(1, ec(cellSize).Offset";
Debug.JustUpdateDeviceLine();
_parentgrid.runClassMethod (b4j.example.vmgrid.class, "_addcolumnosmp" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(_ec.getArrayElement(false, /*RemoteObject*/ _cellsize).getField(true,"_offsetsmall" /*RemoteObject*/ )),(Object)(_ec.getArrayElement(false, /*RemoteObject*/ _cellsize).getField(true,"_offsetmedium" /*RemoteObject*/ )),(Object)(_ec.getArrayElement(false, /*RemoteObject*/ _cellsize).getField(true,"_offsetlarge" /*RemoteObject*/ )),(Object)(_ec.getArrayElement(false, /*RemoteObject*/ _cellsize).getField(true,"_offsetxlarge" /*RemoteObject*/ )),(Object)(_ec.getArrayElement(false, /*RemoteObject*/ _cellsize).getField(true,"_sizesmall" /*RemoteObject*/ )),(Object)(_ec.getArrayElement(false, /*RemoteObject*/ _cellsize).getField(true,"_sizemedium" /*RemoteObject*/ )),(Object)(_ec.getArrayElement(false, /*RemoteObject*/ _cellsize).getField(true,"_sizelarge" /*RemoteObject*/ )),(Object)(_ec.getArrayElement(false, /*RemoteObject*/ _cellsize).getField(true,"_sizexlarge" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(_ec.getArrayElement(false, /*RemoteObject*/ _cellsize).getField(true,"_visibility" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 }
}Debug.locals.put("cellSize", _cellsize);
;
 }
}Debug.locals.put("finalRow", _finalrow);
;
 BA.debugLineNum = 1646;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Container As VMElement";
vmcontainer._container = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_container",vmcontainer._container);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmcontainer._id = RemoteObject.createImmutable("");__ref.setField("_id",vmcontainer._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmcontainer._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmcontainer._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmcontainer._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmcontainer._banano);
 //BA.debugLineNum = 7;BA.debugLine="Public Grid As VMGrid";
vmcontainer._grid = RemoteObject.createNew ("b4j.example.vmgrid");__ref.setField("_grid",vmcontainer._grid);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmcontainer._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmcontainer._module);
 //BA.debugLineNum = 10;BA.debugLine="Public Fields As List";
vmcontainer._fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_fields",vmcontainer._fields);
 //BA.debugLineNum = 11;BA.debugLine="Public Controls As List";
vmcontainer._controls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_controls",vmcontainer._controls);
 //BA.debugLineNum = 12;BA.debugLine="Public Strings As List";
vmcontainer._strings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_strings",vmcontainer._strings);
 //BA.debugLineNum = 13;BA.debugLine="Public Integers As List";
vmcontainer._integers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_integers",vmcontainer._integers);
 //BA.debugLineNum = 14;BA.debugLine="Public Booleans As List";
vmcontainer._booleans = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_booleans",vmcontainer._booleans);
 //BA.debugLineNum = 15;BA.debugLine="Public Doubles As List";
vmcontainer._doubles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_doubles",vmcontainer._doubles);
 //BA.debugLineNum = 16;BA.debugLine="Public Dates As List";
vmcontainer._dates = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_dates",vmcontainer._dates);
 //BA.debugLineNum = 17;BA.debugLine="Public Defaults As Map";
vmcontainer._defaults = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_defaults",vmcontainer._defaults);
 //BA.debugLineNum = 18;BA.debugLine="Public Required As Map";
vmcontainer._required = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_required",vmcontainer._required);
 //BA.debugLineNum = 19;BA.debugLine="Public Mode As String";
vmcontainer._mode = RemoteObject.createImmutable("");__ref.setField("_mode",vmcontainer._mode);
 //BA.debugLineNum = 20;BA.debugLine="Private TotalRows As Int";
vmcontainer._totalrows = RemoteObject.createImmutable(0);__ref.setField("_totalrows",vmcontainer._totalrows);
 //BA.debugLineNum = 21;BA.debugLine="Private sortitM As Map";
vmcontainer._sortitm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_sortitm",vmcontainer._sortitm);
 //BA.debugLineNum = 22;BA.debugLine="Private sortItL As List";
vmcontainer._sortitl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_sortitl",vmcontainer._sortitl);
 //BA.debugLineNum = 23;BA.debugLine="Private rows As Map";
vmcontainer._rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rows",vmcontainer._rows);
 //BA.debugLineNum = 24;BA.debugLine="Private cells As Map";
vmcontainer._cells = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_cells",vmcontainer._cells);
 //BA.debugLineNum = 25;BA.debugLine="Type EachRow(visibility As String)";
;
 //BA.debugLineNum = 26;BA.debugLine="Public visibility As Map";
vmcontainer._visibility = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_visibility",vmcontainer._visibility);
 //BA.debugLineNum = 27;BA.debugLine="Private rowStyles As Map";
vmcontainer._rowstyles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rowstyles",vmcontainer._rowstyles);
 //BA.debugLineNum = 28;BA.debugLine="Public DesignMode As Boolean";
vmcontainer._designmode = RemoteObject.createImmutable(false);__ref.setField("_designmode",vmcontainer._designmode);
 //BA.debugLineNum = 29;BA.debugLine="Public HasInfoBox As Boolean";
vmcontainer._hasinfobox = RemoteObject.createImmutable(false);__ref.setField("_hasinfobox",vmcontainer._hasinfobox);
 //BA.debugLineNum = 30;BA.debugLine="Public Exclusions As List";
vmcontainer._exclusions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_exclusions",vmcontainer._exclusions);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createbutton(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateButton (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,503);
if (RapidSub.canDelegate("createbutton")) { return __ref.runUserSub(false, "vmcontainer","createbutton", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 503;BA.debugLine="private Sub CreateButton(sid As String, eventHandl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 504;BA.debugLine="Dim el As VMButton";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("el", _el);
 BA.debugLineNum = 505;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 506;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 507;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcheckbox(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateCheckBox (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1710);
if (RapidSub.canDelegate("createcheckbox")) { return __ref.runUserSub(false, "vmcontainer","createcheckbox", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmcheckbox");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1710;BA.debugLine="private Sub CreateCheckBox(sid As String, eventHan";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1711;BA.debugLine="Dim el As VMCheckBox";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmcheckbox");Debug.locals.put("el", _el);
 BA.debugLineNum = 1712;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckbox.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1713;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1714;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcheckboxgroup(RemoteObject __ref,RemoteObject _sid,RemoteObject _scaption,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateCheckBoxGroup (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1730);
if (RapidSub.canDelegate("createcheckboxgroup")) { return __ref.runUserSub(false, "vmcontainer","createcheckboxgroup", __ref, _sid, _scaption, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmcheckboxgroup");
Debug.locals.put("sid", _sid);
Debug.locals.put("sCaption", _scaption);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1730;BA.debugLine="private Sub CreateCheckBoxGroup(sid As String, sCa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1731;BA.debugLine="Dim el As VMCheckBoxGroup";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmcheckboxgroup");Debug.locals.put("el", _el);
 BA.debugLineNum = 1732;BA.debugLine="el.Initialize(vue, sid, sCaption, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmcheckboxgroup.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_scaption),(Object)(_eventhandler));
 BA.debugLineNum = 1733;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1734;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createchip(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateChip (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1557);
if (RapidSub.canDelegate("createchip")) { return __ref.runUserSub(false, "vmcontainer","createchip", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmchip");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1557;BA.debugLine="private Sub CreateChip(sid As String, eventHandler";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1558;BA.debugLine="Dim el As VMChip";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmchip");Debug.locals.put("el", _el);
 BA.debugLineNum = 1559;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmchip.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1560;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1561;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createchips(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateChips (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1551);
if (RapidSub.canDelegate("createchips")) { return __ref.runUserSub(false, "vmcontainer","createchips", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmchips");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1551;BA.debugLine="private Sub CreateChips(sid As String, eventHandle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1552;BA.debugLine="Dim el As VMChips";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmchips");Debug.locals.put("el", _el);
 BA.debugLineNum = 1553;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmchips.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1554;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1555;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcontrol(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("CreateControl (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,515);
if (RapidSub.canDelegate("createcontrol")) { return __ref.runUserSub(false, "vmcontainer","createcontrol", __ref, _sname);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
 BA.debugLineNum = 515;BA.debugLine="Sub CreateControl(sname As String) As VMInputContr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 516;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 517;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 518;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 519;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 520;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createdatepicker(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateDatePicker (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,509);
if (RapidSub.canDelegate("createdatepicker")) { return __ref.runUserSub(false, "vmcontainer","createdatepicker", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmdatepicker");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 509;BA.debugLine="private Sub CreateDatePicker(sid As String, eventH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 510;BA.debugLine="Dim el As VMDatePicker";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmdatepicker");Debug.locals.put("el", _el);
 BA.debugLineNum = 511;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmdatepicker.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 512;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 513;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createfile(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateFile (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1663);
if (RapidSub.canDelegate("createfile")) { return __ref.runUserSub(false, "vmcontainer","createfile", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmfile");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1663;BA.debugLine="private Sub CreateFile(sid As String, eventHandler";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1664;BA.debugLine="Dim el As VMFile";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmfile");Debug.locals.put("el", _el);
 BA.debugLineNum = 1665;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmfile.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1666;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1667;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createicon(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateIcon (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1717);
if (RapidSub.canDelegate("createicon")) { return __ref.runUserSub(false, "vmcontainer","createicon", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmicon");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1717;BA.debugLine="private Sub CreateIcon(sid As String) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1718;BA.debugLine="Dim el As VMIcon";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmicon");Debug.locals.put("el", _el);
 BA.debugLineNum = 1719;BA.debugLine="el.Initialize(vue, sid)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid));
 BA.debugLineNum = 1720;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1721;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createimage(RemoteObject __ref,RemoteObject _img,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateImage (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1539);
if (RapidSub.canDelegate("createimage")) { return __ref.runUserSub(false, "vmcontainer","createimage", __ref, _img, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmimage");
Debug.locals.put("img", _img);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1539;BA.debugLine="private Sub CreateImage(img As String, eventHandle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1540;BA.debugLine="Dim el As VMImage";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmimage");Debug.locals.put("el", _el);
 BA.debugLineNum = 1541;BA.debugLine="el.Initialize(vue, img, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmimage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_img),(Object)(_eventhandler));
 BA.debugLineNum = 1542;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1543;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinfobox(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateInfoBox (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1649);
if (RapidSub.canDelegate("createinfobox")) { return __ref.runUserSub(false, "vmcontainer","createinfobox", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminfobox");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1649;BA.debugLine="private Sub CreateInfoBox(sid As String, eventHand";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1650;BA.debugLine="HasInfoBox = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasinfobox" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 1651;BA.debugLine="Dim el As VMInfoBox";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminfobox");Debug.locals.put("el", _el);
 BA.debugLineNum = 1652;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminfobox.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1653;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1654;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createinput(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateInput (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1670);
if (RapidSub.canDelegate("createinput")) { return __ref.runUserSub(false, "vmcontainer","createinput", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminput");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1670;BA.debugLine="private Sub CreateInput(sid As String, eventHandle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1671;BA.debugLine="Dim el As VMInput";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminput");Debug.locals.put("el", _el);
 BA.debugLineNum = 1672;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminput.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1673;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1674;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlabel(RemoteObject __ref,RemoteObject _lblid) throws Exception{
try {
		Debug.PushSubsStack("CreateLABEL (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1545);
if (RapidSub.canDelegate("createlabel")) { return __ref.runUserSub(false, "vmcontainer","createlabel", __ref, _lblid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmlabel");
Debug.locals.put("lblID", _lblid);
 BA.debugLineNum = 1545;BA.debugLine="private Sub CreateLABEL(lblID As String) As VMLabe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1546;BA.debugLine="Dim el As VMLabel";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmlabel");Debug.locals.put("el", _el);
 BA.debugLineNum = 1547;BA.debugLine="el.Initialize(vue, lblID)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_lblid));
 BA.debugLineNum = 1548;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1549;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlist(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateList (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,491);
if (RapidSub.canDelegate("createlist")) { return __ref.runUserSub(false, "vmcontainer","createlist", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmlist");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 491;BA.debugLine="private Sub CreateList(sid As String,eventHandler";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 492;BA.debugLine="Dim el As VMList";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmlist");Debug.locals.put("el", _el);
 BA.debugLineNum = 493;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlist.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 494;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 495;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createlistitem(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateListItem (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,497);
if (RapidSub.canDelegate("createlistitem")) { return __ref.runUserSub(false, "vmcontainer","createlistitem", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 497;BA.debugLine="private Sub CreateListItem(sid As String, eventHan";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 498;BA.debugLine="Dim el As VMListItem";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("el", _el);
 BA.debugLineNum = 499;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 500;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 501;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnumber(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateNumber (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1684);
if (RapidSub.canDelegate("createnumber")) { return __ref.runUserSub(false, "vmcontainer","createnumber", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminput");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1684;BA.debugLine="private Sub CreateNumber(sid As String, eventHandl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1685;BA.debugLine="Dim el As VMInput = CreateInput(sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el = __ref.runClassMethod (b4j.example.vmcontainer.class, "_createinput" /*RemoteObject*/ ,(Object)(_sid),(Object)(_eventhandler)).runClassMethod (b4j.example.vminput.class, "_settypenumber" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));Debug.locals.put("el", _el);Debug.locals.put("el", _el);
 BA.debugLineNum = 1686;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1687;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createnumberinput(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateNumberInput (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1690);
if (RapidSub.canDelegate("createnumberinput")) { return __ref.runUserSub(false, "vmcontainer","createnumberinput", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmnumberinput");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 1690;BA.debugLine="private Sub CreateNumberInput(sid As String) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1691;BA.debugLine="Dim el As VMNumberInput";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmnumberinput");Debug.locals.put("el", _el);
 BA.debugLineNum = 1692;BA.debugLine="el.Initialize(vue, sid)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmnumberinput.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid));
 BA.debugLineNum = 1693;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1694;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createradiogroup(RemoteObject __ref,RemoteObject _sid,RemoteObject _scaption,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateRadioGroup (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1724);
if (RapidSub.canDelegate("createradiogroup")) { return __ref.runUserSub(false, "vmcontainer","createradiogroup", __ref, _sid, _scaption, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmradiogroup");
Debug.locals.put("sid", _sid);
Debug.locals.put("sCaption", _scaption);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1724;BA.debugLine="private Sub CreateRadioGroup(sid As String, sCapti";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1725;BA.debugLine="Dim el As VMRadioGroup";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmradiogroup");Debug.locals.put("el", _el);
 BA.debugLineNum = 1726;BA.debugLine="el.Initialize(vue, sid, sCaption, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmradiogroup.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_scaption),(Object)(_eventhandler));
 BA.debugLineNum = 1727;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1728;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createselect(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSelect (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1697);
if (RapidSub.canDelegate("createselect")) { return __ref.runUserSub(false, "vmcontainer","createselect", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmselect");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1697;BA.debugLine="private Sub CreateSelect(sid As String, eventHandl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1698;BA.debugLine="Dim el As VMSelect";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmselect");Debug.locals.put("el", _el);
 BA.debugLineNum = 1699;BA.debugLine="el.Initialize(vue,sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmselect.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1700;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1701;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createslider(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSlider (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1677);
if (RapidSub.canDelegate("createslider")) { return __ref.runUserSub(false, "vmcontainer","createslider", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmslider");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1677;BA.debugLine="private Sub CreateSlider(sid As String, eventHandl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1678;BA.debugLine="Dim el As VMSlider";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmslider");Debug.locals.put("el", _el);
 BA.debugLineNum = 1679;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmslider.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1680;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1681;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createswitch(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateSwitch (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1704);
if (RapidSub.canDelegate("createswitch")) { return __ref.runUserSub(false, "vmcontainer","createswitch", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmswitch");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1704;BA.debugLine="private Sub CreateSwitch(sid As String, eventHandl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1705;BA.debugLine="Dim el As VMSwitch";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmswitch");Debug.locals.put("el", _el);
 BA.debugLineNum = 1706;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmswitch.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1707;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1708;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtextarea(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateTextArea (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1656);
if (RapidSub.canDelegate("createtextarea")) { return __ref.runUserSub(false, "vmcontainer","createtextarea", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtextarea");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1656;BA.debugLine="private Sub CreateTextArea(sid As String, eventHan";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1657;BA.debugLine="Dim el As VMTextArea";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtextarea");Debug.locals.put("el", _el);
 BA.debugLineNum = 1658;BA.debugLine="el.Initialize(vue, sid,eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtextarea.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1659;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1660;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtimepicker(RemoteObject __ref,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("CreateTimePicker (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,1563);
if (RapidSub.canDelegate("createtimepicker")) { return __ref.runUserSub(false, "vmcontainer","createtimepicker", __ref, _sid, _eventhandler);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtimepicker");
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 1563;BA.debugLine="private Sub CreateTimePicker(sid As String, eventH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1564;BA.debugLine="Dim el As VMTimePicker";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtimepicker");Debug.locals.put("el", _el);
 BA.debugLineNum = 1565;BA.debugLine="el.Initialize(vue, sid, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtimepicker.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(_eventhandler));
 BA.debugLineNum = 1566;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 1567;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _disable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Disable (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("disable")) { return __ref.runUserSub(false, "vmcontainer","disable", __ref);}
 BA.debugLineNum = 178;BA.debugLine="Sub Disable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 179;BA.debugLine="SetDisabled(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_setdisabled" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"False")));
 BA.debugLineNum = 180;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Enable (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("enable")) { return __ref.runUserSub(false, "vmcontainer","enable", __ref);}
 BA.debugLineNum = 174;BA.debugLine="Sub Enable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 175;BA.debugLine="SetDisabled(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_setdisabled" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 176;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getdata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetData (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,451);
if (RapidSub.canDelegate("getdata")) { return __ref.runUserSub(false, "vmcontainer","getdata", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 451;BA.debugLine="Sub GetData As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 452;BA.debugLine="Prepare";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_prepare" /*RemoteObject*/ );
 BA.debugLineNum = 453;BA.debugLine="Dim m As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = vmcontainer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 454;BA.debugLine="m = vue.GetStates(Fields)";
Debug.JustUpdateDeviceLine();
_m = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstates" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_fields" /*RemoteObject*/ )));Debug.locals.put("m", _m);
 BA.debugLineNum = 455;BA.debugLine="m = LinkRecordTypes(m)";
Debug.JustUpdateDeviceLine();
_m = __ref.runClassMethod (b4j.example.vmcontainer.class, "_linkrecordtypes" /*RemoteObject*/ ,(Object)(_m));Debug.locals.put("m", _m);
 BA.debugLineNum = 456;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 457;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmcontainer","hide", __ref);}
 BA.debugLineNum = 182;BA.debugLine="Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="vue.SetStateSingle($\"${ID}show\"$, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("show")))),(Object)((vmcontainer.__c.getField(true,"False"))));
 BA.debugLineNum = 184;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hideerror(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("HideError (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,487);
if (RapidSub.canDelegate("hideerror")) { return __ref.runUserSub(false, "vmcontainer","hideerror", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 487;BA.debugLine="Sub HideError(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 488;BA.debugLine="vue.SetStateSingle($\"${elID}error\"$, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("error")))),(Object)((vmcontainer.__c.getField(true,"False"))));
 BA.debugLineNum = 489;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmcontainer","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 38;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 40;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 41;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 42;BA.debugLine="Container.Initialize(vue, ID).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 43;BA.debugLine="Container.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 44;BA.debugLine="Grid.Initialize(vue, $\"${ID}grid\"$,module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("grid")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 45;BA.debugLine="Grid.Grid.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 47;BA.debugLine="TotalRows = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_totalrows" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 48;BA.debugLine="rowStyles.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 49;BA.debugLine="sortitM.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitm" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 50;BA.debugLine="sortItL.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitl" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="rows.initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 52;BA.debugLine="Fields.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="Controls.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 54;BA.debugLine="Strings.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 55;BA.debugLine="Integers.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_integers" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="Booleans.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_booleans" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 57;BA.debugLine="Defaults.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 58;BA.debugLine="Required.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_required" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="Doubles.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_doubles" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 60;BA.debugLine="Dates.initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dates" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 61;BA.debugLine="cells.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_cells" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 62;BA.debugLine="visibility.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_visibility" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 63;BA.debugLine="Exclusions.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_exclusions" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 64;BA.debugLine="Mode = \"A\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mode" /*RemoteObject*/ ,BA.ObjectToString("A"));
 BA.debugLineNum = 65;BA.debugLine="sortitM.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitm" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 66;BA.debugLine="sortItL.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_sortitl" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="DesignMode = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_designmode" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"False"));
 BA.debugLineNum = 68;BA.debugLine="HasInfoBox = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasinfobox" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"False"));
 BA.debugLineNum = 69;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _linkrecordtypes(RemoteObject __ref,RemoteObject _rec) throws Exception{
try {
		Debug.PushSubsStack("LinkRecordTypes (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,918);
if (RapidSub.canDelegate("linkrecordtypes")) { return __ref.runUserSub(false, "vmcontainer","linkrecordtypes", __ref, _rec);}
RemoteObject _nrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("rec", _rec);
 BA.debugLineNum = 918;BA.debugLine="Sub LinkRecordTypes(rec As Map) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 919;BA.debugLine="Dim nrec As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nrec = vmcontainer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nrec", _nrec);Debug.locals.put("nrec", _nrec);
 BA.debugLineNum = 920;BA.debugLine="For Each k As String In rec.keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _rec.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 921;BA.debugLine="Dim v As Object = rec.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _rec.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 922;BA.debugLine="k = k.ToLowerCase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 923;BA.debugLine="nrec.Put(k, v)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 925;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(nrec, Dou";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_doubles" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makedouble" /*RemoteObject*/ ,(Object)(_nrec),(Object)(__ref.getField(false,"_doubles" /*RemoteObject*/ )));};
 BA.debugLineNum = 926;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(nrec, I";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_integers" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makeinteger" /*RemoteObject*/ ,(Object)(_nrec),(Object)(__ref.getField(false,"_integers" /*RemoteObject*/ )));};
 BA.debugLineNum = 927;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(nrec, Strin";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_strings" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_maketrim" /*RemoteObject*/ ,(Object)(_nrec),(Object)(__ref.getField(false,"_strings" /*RemoteObject*/ )));};
 BA.debugLineNum = 928;BA.debugLine="If Dates.Size > 0 Then vue.MakeDate(nrec, Dates)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_dates" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makedate" /*RemoteObject*/ ,(Object)(_nrec),(Object)(__ref.getField(false,"_dates" /*RemoteObject*/ )));};
 BA.debugLineNum = 929;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(nrec, B";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_booleans" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makeboolean" /*RemoteObject*/ ,(Object)(_nrec),(Object)(__ref.getField(false,"_booleans" /*RemoteObject*/ )));};
 BA.debugLineNum = 930;BA.debugLine="Return nrec";
Debug.JustUpdateDeviceLine();
if (true) return _nrec;
 BA.debugLineNum = 931;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newbutton(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _sicon,RemoteObject _braised,RemoteObject _bprimary,RemoteObject _baccent,RemoteObject _bfitwidth) throws Exception{
try {
		Debug.PushSubsStack("NewButton (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,854);
if (RapidSub.canDelegate("newbutton")) { return __ref.runUserSub(false, "vmcontainer","newbutton", __ref, _sname, _slabel, _sicon, _braised, _bprimary, _baccent, _bfitwidth);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("sLabel", _slabel);
Debug.locals.put("sIcon", _sicon);
Debug.locals.put("bRaised", _braised);
Debug.locals.put("bPrimary", _bprimary);
Debug.locals.put("bAccent", _baccent);
Debug.locals.put("bFitWidth", _bfitwidth);
 BA.debugLineNum = 854;BA.debugLine="Sub NewButton(sname As String, sLabel As String, s";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 855;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 856;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 857;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 858;BA.debugLine="el.SetButton";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setbutton" /*RemoteObject*/ );
 BA.debugLineNum = 859;BA.debugLine="el.SetLabel(sLabel)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setlabel" /*RemoteObject*/ ,(Object)(_slabel));
 BA.debugLineNum = 860;BA.debugLine="el.SetButtonTypeRegular";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setbuttontyperegular" /*RemoteObject*/ );
 BA.debugLineNum = 861;BA.debugLine="el.SetRaised(bRaised)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setraised" /*RemoteObject*/ ,(Object)(_braised));
 BA.debugLineNum = 862;BA.debugLine="If bPrimary Then el.SetPrimary(bPrimary)";
Debug.JustUpdateDeviceLine();
if (_bprimary.<Boolean>get().booleanValue()) { 
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setprimary" /*RemoteObject*/ ,(Object)(_bprimary));};
 BA.debugLineNum = 863;BA.debugLine="If bAccent Then el.SetAccent(bAccent)";
Debug.JustUpdateDeviceLine();
if (_baccent.<Boolean>get().booleanValue()) { 
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setaccent" /*RemoteObject*/ ,(Object)(_baccent));};
 BA.debugLineNum = 864;BA.debugLine="If bFitWidth Then el.SetFitWidth(True)";
Debug.JustUpdateDeviceLine();
if (_bfitwidth.<Boolean>get().booleanValue()) { 
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setfitwidth" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));};
 BA.debugLineNum = 865;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 866;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newcheckbox(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _svalue,RemoteObject _bprimary,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewCheckBox (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,564);
if (RapidSub.canDelegate("newcheckbox")) { return __ref.runUserSub(false, "vmcontainer","newcheckbox", __ref, _sname, _slabel, _svalue, _bprimary, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("svalue", _svalue);
Debug.locals.put("bPrimary", _bprimary);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 564;BA.debugLine="Sub NewCheckBox(sname As String, slabel As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 565;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 566;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 567;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 568;BA.debugLine="el.SetCheckBox";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setcheckbox" /*RemoteObject*/ );
 BA.debugLineNum = 569;BA.debugLine="el.Value = svalue";
Debug.JustUpdateDeviceLine();
_el.setField ("_value" /*RemoteObject*/ ,BA.ObjectToString(_svalue));
 BA.debugLineNum = 570;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 571;BA.debugLine="el.IsPrimary = bPrimary";
Debug.JustUpdateDeviceLine();
_el.setField ("_isprimary" /*RemoteObject*/ ,_bprimary);
 BA.debugLineNum = 572;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 573;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 574;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newcheckboxgroup(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("NewCheckBoxGroup (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,556);
if (RapidSub.canDelegate("newcheckboxgroup")) { return __ref.runUserSub(false, "vmcontainer","newcheckboxgroup", __ref, _sname);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
 BA.debugLineNum = 556;BA.debugLine="Sub NewCheckBoxGroup(sname As String) As VMInputCo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 557;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 558;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 559;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 560;BA.debugLine="el.SetCheckBoxGroup";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setcheckboxgroup" /*RemoteObject*/ );
 BA.debugLineNum = 561;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 562;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newchip(RemoteObject __ref,RemoteObject _sname,RemoteObject _stext,RemoteObject _bclickable,RemoteObject _bdeletable,RemoteObject _sourcetable,RemoteObject _sourcefield,RemoteObject _displayfield) throws Exception{
try {
		Debug.PushSubsStack("NewChip (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("newchip")) { return __ref.runUserSub(false, "vmcontainer","newchip", __ref, _sname, _stext, _bclickable, _bdeletable, _sourcetable, _sourcefield, _displayfield);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("sText", _stext);
Debug.locals.put("bClickable", _bclickable);
Debug.locals.put("bDeletable", _bdeletable);
Debug.locals.put("sourceTable", _sourcetable);
Debug.locals.put("sourceField", _sourcefield);
Debug.locals.put("displayField", _displayfield);
 BA.debugLineNum = 608;BA.debugLine="Sub NewChip(sname As String, sText As String, bCli";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 609;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 610;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 611;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 612;BA.debugLine="el.SetChip";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setchip" /*RemoteObject*/ );
 BA.debugLineNum = 613;BA.debugLine="el.Text = sText";
Debug.JustUpdateDeviceLine();
_el.setField ("_text" /*RemoteObject*/ ,_stext);
 BA.debugLineNum = 614;BA.debugLine="el.Clickable = bClickable";
Debug.JustUpdateDeviceLine();
_el.setField ("_clickable" /*RemoteObject*/ ,_bclickable);
 BA.debugLineNum = 615;BA.debugLine="el.Deletable = bDeletable";
Debug.JustUpdateDeviceLine();
_el.setField ("_deletable" /*RemoteObject*/ ,_bdeletable);
 BA.debugLineNum = 616;BA.debugLine="If sourceTable <> Null Then el.sourceTable = sour";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_sourcetable)) { 
_el.setField ("_sourcetable" /*RemoteObject*/ ,_sourcetable);};
 BA.debugLineNum = 617;BA.debugLine="If sourceField <> Null Then el.sourceField =sourc";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_sourcefield)) { 
_el.setField ("_sourcefield" /*RemoteObject*/ ,_sourcefield);};
 BA.debugLineNum = 618;BA.debugLine="If displayField <> Null Then el.displayField = di";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_displayfield)) { 
_el.setField ("_displayfield" /*RemoteObject*/ ,_displayfield);};
 BA.debugLineNum = 619;BA.debugLine="el.UseOptions = False";
Debug.JustUpdateDeviceLine();
_el.setField ("_useoptions" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"False"));
 BA.debugLineNum = 620;BA.debugLine="el.UseDataSource = True";
Debug.JustUpdateDeviceLine();
_el.setField ("_usedatasource" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 621;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 622;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newchips(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _splaceholder,RemoteObject _bstatic,RemoteObject _brequired,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewChips (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,624);
if (RapidSub.canDelegate("newchips")) { return __ref.runUserSub(false, "vmcontainer","newchips", __ref, _sname, _slabel, _splaceholder, _bstatic, _brequired, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("bStatic", _bstatic);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("sHelperText", _shelpertext);
Debug.locals.put("sErrorText", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 624;BA.debugLine="Sub NewChips(sname As String, slabel As String, sp";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 625;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 626;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 627;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 628;BA.debugLine="el.SetChips";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setchips" /*RemoteObject*/ );
 BA.debugLineNum = 629;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 630;BA.debugLine="el.Required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 631;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 632;BA.debugLine="el.Static = bStatic";
Debug.JustUpdateDeviceLine();
_el.setField ("_static" /*RemoteObject*/ ,_bstatic);
 BA.debugLineNum = 633;BA.debugLine="el.CheckDuplicates = True";
Debug.JustUpdateDeviceLine();
_el.setField ("_checkduplicates" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 634;BA.debugLine="el.helperText = sHelperText";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 635;BA.debugLine="el.errorText = sErrorText";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 636;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 637;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newdatepicker(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _brequired,RemoteObject _bimmediately,RemoteObject _bopenonfocus,RemoteObject _splaceholder,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewDatePicker (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,576);
if (RapidSub.canDelegate("newdatepicker")) { return __ref.runUserSub(false, "vmcontainer","newdatepicker", __ref, _sname, _slabel, _brequired, _bimmediately, _bopenonfocus, _splaceholder, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("bImmediately", _bimmediately);
Debug.locals.put("bOpenOnFocus", _bopenonfocus);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 576;BA.debugLine="Sub NewDatePicker(sname As String, slabel As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 577;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 578;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 579;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 580;BA.debugLine="el.SetDatePicker";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setdatepicker" /*RemoteObject*/ );
 BA.debugLineNum = 581;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 582;BA.debugLine="el.Required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 583;BA.debugLine="el.clearable = True";
Debug.JustUpdateDeviceLine();
_el.setField ("_clearable" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 584;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 585;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 586;BA.debugLine="el.immediately = bImmediately";
Debug.JustUpdateDeviceLine();
_el.setField ("_immediately" /*RemoteObject*/ ,_bimmediately);
 BA.debugLineNum = 587;BA.debugLine="el.openonfocus = bOpenOnFocus";
Debug.JustUpdateDeviceLine();
_el.setField ("_openonfocus" /*RemoteObject*/ ,_bopenonfocus);
 BA.debugLineNum = 588;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 589;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newemail(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _splaceholder,RemoteObject _brequired,RemoteObject _sicon,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewEmail (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,677);
if (RapidSub.canDelegate("newemail")) { return __ref.runUserSub(false, "vmcontainer","newemail", __ref, _sname, _slabel, _splaceholder, _brequired, _sicon, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("sIcon", _sicon);
Debug.locals.put("shelpertext", _shelpertext);
Debug.locals.put("serrorText", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 677;BA.debugLine="Sub NewEmail(sname As String, slabel As String, sp";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 678;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 679;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 680;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 681;BA.debugLine="el.clearable = True";
Debug.JustUpdateDeviceLine();
_el.setField ("_clearable" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 682;BA.debugLine="el.SetEmail";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setemail" /*RemoteObject*/ );
 BA.debugLineNum = 683;BA.debugLine="el.errorText = serrorText";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 684;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 685;BA.debugLine="el.required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 686;BA.debugLine="el.iconname = sIcon";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconname" /*RemoteObject*/ ,_sicon);
 BA.debugLineNum = 687;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 688;BA.debugLine="el.helperText = shelpertext";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 689;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 690;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _newfile(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _splaceholder,RemoteObject _brequired,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewFile (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,779);
if (RapidSub.canDelegate("newfile")) { return __ref.runUserSub(false, "vmcontainer","newfile", __ref, _sname, _slabel, _splaceholder, _brequired, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("shelperText", _shelpertext);
Debug.locals.put("sErrorText", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 779;BA.debugLine="Sub NewFile(sname As String, slabel As String, spl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 780;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 781;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 782;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 783;BA.debugLine="el.SetEmail";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setemail" /*RemoteObject*/ );
 BA.debugLineNum = 784;BA.debugLine="el.typeOf = \"file\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_typeof" /*RemoteObject*/ ,BA.ObjectToString("file"));
 BA.debugLineNum = 785;BA.debugLine="el.errorText = sErrorText";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 786;BA.debugLine="el.helperText = shelperText";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 787;BA.debugLine="el.Required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 788;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 789;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 790;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 791;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 792;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newh1(RemoteObject __ref,RemoteObject _sname,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("NewH1 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,806);
if (RapidSub.canDelegate("newh1")) { return __ref.runUserSub(false, "vmcontainer","newh1", __ref, _sname, _stext);}
Debug.locals.put("sname", _sname);
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 806;BA.debugLine="Sub NewH1(sname As String, sText As String) As VMI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 807;BA.debugLine="Return NewLabel(sname, \"h1\", sText)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.vmcontainer.class, "_newlabel" /*RemoteObject*/ ,(Object)(_sname),(Object)(BA.ObjectToString("h1")),(Object)(_stext));
 BA.debugLineNum = 808;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newh2(RemoteObject __ref,RemoteObject _sname,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("NewH2 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,810);
if (RapidSub.canDelegate("newh2")) { return __ref.runUserSub(false, "vmcontainer","newh2", __ref, _sname, _stext);}
Debug.locals.put("sname", _sname);
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 810;BA.debugLine="Sub NewH2(sname As String, sText As String) As VMI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 811;BA.debugLine="Return NewLabel(sname, \"h2\", sText)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.vmcontainer.class, "_newlabel" /*RemoteObject*/ ,(Object)(_sname),(Object)(BA.ObjectToString("h2")),(Object)(_stext));
 BA.debugLineNum = 812;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newh3(RemoteObject __ref,RemoteObject _sname,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("NewH3 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,814);
if (RapidSub.canDelegate("newh3")) { return __ref.runUserSub(false, "vmcontainer","newh3", __ref, _sname, _stext);}
Debug.locals.put("sname", _sname);
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 814;BA.debugLine="Sub NewH3(sname As String, sText As String) As VMI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 815;BA.debugLine="Return NewLabel(sname, \"h3\", sText)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.vmcontainer.class, "_newlabel" /*RemoteObject*/ ,(Object)(_sname),(Object)(BA.ObjectToString("h3")),(Object)(_stext));
 BA.debugLineNum = 816;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newh4(RemoteObject __ref,RemoteObject _sname,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("NewH4 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,818);
if (RapidSub.canDelegate("newh4")) { return __ref.runUserSub(false, "vmcontainer","newh4", __ref, _sname, _stext);}
Debug.locals.put("sname", _sname);
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 818;BA.debugLine="Sub NewH4(sname As String, sText As String) As VMI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 819;BA.debugLine="Return NewLabel(sname, \"h4\", sText)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.vmcontainer.class, "_newlabel" /*RemoteObject*/ ,(Object)(_sname),(Object)(BA.ObjectToString("h4")),(Object)(_stext));
 BA.debugLineNum = 820;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newh5(RemoteObject __ref,RemoteObject _sname,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("NewH5 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,822);
if (RapidSub.canDelegate("newh5")) { return __ref.runUserSub(false, "vmcontainer","newh5", __ref, _sname, _stext);}
Debug.locals.put("sname", _sname);
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 822;BA.debugLine="Sub NewH5(sname As String, sText As String) As VMI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 823;BA.debugLine="Return NewLabel(sname, \"h5\", sText)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.vmcontainer.class, "_newlabel" /*RemoteObject*/ ,(Object)(_sname),(Object)(BA.ObjectToString("h5")),(Object)(_stext));
 BA.debugLineNum = 824;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newh6(RemoteObject __ref,RemoteObject _sname,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("NewH6 (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,826);
if (RapidSub.canDelegate("newh6")) { return __ref.runUserSub(false, "vmcontainer","newh6", __ref, _sname, _stext);}
Debug.locals.put("sname", _sname);
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 826;BA.debugLine="Sub NewH6(sname As String, sText As String) As VMI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 827;BA.debugLine="Return NewLabel(sname, \"h6\", sText)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.vmcontainer.class, "_newlabel" /*RemoteObject*/ ,(Object)(_sname),(Object)(BA.ObjectToString("h6")),(Object)(_stext));
 BA.debugLineNum = 828;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newicon(RemoteObject __ref,RemoteObject _sname,RemoteObject _sicon,RemoteObject _ssize) throws Exception{
try {
		Debug.PushSubsStack("NewIcon (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,844);
if (RapidSub.canDelegate("newicon")) { return __ref.runUserSub(false, "vmcontainer","newicon", __ref, _sname, _sicon, _ssize);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("sIcon", _sicon);
Debug.locals.put("sSize", _ssize);
 BA.debugLineNum = 844;BA.debugLine="Sub NewIcon(sname As String, sIcon As String, sSiz";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 845;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 846;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 847;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 848;BA.debugLine="el.typeOf = \"icon\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_typeof" /*RemoteObject*/ ,BA.ObjectToString("icon"));
 BA.debugLineNum = 849;BA.debugLine="el.iconsize = sSize";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconsize" /*RemoteObject*/ ,_ssize);
 BA.debugLineNum = 850;BA.debugLine="el.IconName = sIcon";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconname" /*RemoteObject*/ ,_sicon);
 BA.debugLineNum = 851;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 852;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newiconbutton(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("NewIconButton (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,522);
if (RapidSub.canDelegate("newiconbutton")) { return __ref.runUserSub(false, "vmcontainer","newiconbutton", __ref, _sname);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
 BA.debugLineNum = 522;BA.debugLine="Sub NewIconButton(sname As String) As VMInputContr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 523;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 524;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 525;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 526;BA.debugLine="el.SetButton";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setbutton" /*RemoteObject*/ );
 BA.debugLineNum = 527;BA.debugLine="el.SetIconButton(True)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(vmcontainer.__c.getField(true,"True")));
 BA.debugLineNum = 528;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 529;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newimage(RemoteObject __ref,RemoteObject _sname,RemoteObject _sdefaultvalue,RemoteObject _salt,RemoteObject _swidth,RemoteObject _sheight) throws Exception{
try {
		Debug.PushSubsStack("NewImage (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,794);
if (RapidSub.canDelegate("newimage")) { return __ref.runUserSub(false, "vmcontainer","newimage", __ref, _sname, _sdefaultvalue, _salt, _swidth, _sheight);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("sdefaultValue", _sdefaultvalue);
Debug.locals.put("salt", _salt);
Debug.locals.put("swidth", _swidth);
Debug.locals.put("sheight", _sheight);
 BA.debugLineNum = 794;BA.debugLine="Sub NewImage(sname As String, sdefaultValue As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 795;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 796;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 797;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 798;BA.debugLine="el.typeOf = \"image\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_typeof" /*RemoteObject*/ ,BA.ObjectToString("image"));
 BA.debugLineNum = 799;BA.debugLine="el.Width = swidth";
Debug.JustUpdateDeviceLine();
_el.setField ("_width" /*RemoteObject*/ ,_swidth);
 BA.debugLineNum = 800;BA.debugLine="el.Height = sheight";
Debug.JustUpdateDeviceLine();
_el.setField ("_height" /*RemoteObject*/ ,_sheight);
 BA.debugLineNum = 801;BA.debugLine="el.defaultValue = sdefaultValue";
Debug.JustUpdateDeviceLine();
_el.setField ("_defaultvalue" /*RemoteObject*/ ,(_sdefaultvalue));
 BA.debugLineNum = 802;BA.debugLine="el.Alt = salt";
Debug.JustUpdateDeviceLine();
_el.setField ("_alt" /*RemoteObject*/ ,_salt);
 BA.debugLineNum = 803;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 804;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newinfobox(RemoteObject __ref,RemoteObject _sname,RemoteObject _sboxtype,RemoteObject _stext,RemoteObject _sicon,RemoteObject _siconcolor,RemoteObject _siconbackgroundcolor,RemoteObject _icount,RemoteObject _istart,RemoteObject _ifinish,RemoteObject _iinterval,RemoteObject _bsetcounter,RemoteObject _ispeed,RemoteObject _irefreshinterval,RemoteObject _bhoverexpand,RemoteObject _bhoverzoom) throws Exception{
try {
		Debug.PushSubsStack("NewInfoBox (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,640);
if (RapidSub.canDelegate("newinfobox")) { return __ref.runUserSub(false, "vmcontainer","newinfobox", __ref, _sname, _sboxtype, _stext, _sicon, _siconcolor, _siconbackgroundcolor, _icount, _istart, _ifinish, _iinterval, _bsetcounter, _ispeed, _irefreshinterval, _bhoverexpand, _bhoverzoom);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("sBoxType", _sboxtype);
Debug.locals.put("sText", _stext);
Debug.locals.put("sIcon", _sicon);
Debug.locals.put("sIconColor", _siconcolor);
Debug.locals.put("sIconBackgroundColor", _siconbackgroundcolor);
Debug.locals.put("iCount", _icount);
Debug.locals.put("iStart", _istart);
Debug.locals.put("iFinish", _ifinish);
Debug.locals.put("iInterval", _iinterval);
Debug.locals.put("bSetCounter", _bsetcounter);
Debug.locals.put("iSpeed", _ispeed);
Debug.locals.put("iRefreshInterval", _irefreshinterval);
Debug.locals.put("bHoverExpand", _bhoverexpand);
Debug.locals.put("bHoverZoom", _bhoverzoom);
 BA.debugLineNum = 640;BA.debugLine="Sub NewInfoBox(sname As String, sBoxType As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 641;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 642;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 643;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 644;BA.debugLine="el.typeof = \"infobox\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_typeof" /*RemoteObject*/ ,BA.ObjectToString("infobox"));
 BA.debugLineNum = 645;BA.debugLine="el.fieldType = \"string\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_fieldtype" /*RemoteObject*/ ,BA.ObjectToString("string"));
 BA.debugLineNum = 646;BA.debugLine="el.bSetCounter = bSetCounter";
Debug.JustUpdateDeviceLine();
_el.setField ("_bsetcounter" /*RemoteObject*/ ,_bsetcounter);
 BA.debugLineNum = 647;BA.debugLine="el.Start = iStart";
Debug.JustUpdateDeviceLine();
_el.setField ("_start" /*RemoteObject*/ ,BA.NumberToString(_istart));
 BA.debugLineNum = 648;BA.debugLine="el.Finish = iFinish";
Debug.JustUpdateDeviceLine();
_el.setField ("_finish" /*RemoteObject*/ ,BA.NumberToString(_ifinish));
 BA.debugLineNum = 649;BA.debugLine="el.Speed = iSpeed";
Debug.JustUpdateDeviceLine();
_el.setField ("_speed" /*RemoteObject*/ ,BA.NumberToString(_ispeed));
 BA.debugLineNum = 650;BA.debugLine="el.RefreshInterval = iRefreshInterval";
Debug.JustUpdateDeviceLine();
_el.setField ("_refreshinterval" /*RemoteObject*/ ,BA.NumberToString(_irefreshinterval));
 BA.debugLineNum = 651;BA.debugLine="el.Count = iCount";
Debug.JustUpdateDeviceLine();
_el.setField ("_count" /*RemoteObject*/ ,BA.NumberToString(_icount));
 BA.debugLineNum = 652;BA.debugLine="el.IconName = sIcon";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconname" /*RemoteObject*/ ,_sicon);
 BA.debugLineNum = 653;BA.debugLine="el.IconColor = sIconColor";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconcolor" /*RemoteObject*/ ,_siconcolor);
 BA.debugLineNum = 654;BA.debugLine="el.IconBackgroundColor = sIconBackgroundColor";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconbackgroundcolor" /*RemoteObject*/ ,_siconbackgroundcolor);
 BA.debugLineNum = 655;BA.debugLine="el.Text = sText";
Debug.JustUpdateDeviceLine();
_el.setField ("_text" /*RemoteObject*/ ,_stext);
 BA.debugLineNum = 656;BA.debugLine="el.HoverExpandEffect = bHoverExpand";
Debug.JustUpdateDeviceLine();
_el.setField ("_hoverexpandeffect" /*RemoteObject*/ ,_bhoverexpand);
 BA.debugLineNum = 657;BA.debugLine="el.HoverZoomEffect = bHoverZoom";
Debug.JustUpdateDeviceLine();
_el.setField ("_hoverzoomeffect" /*RemoteObject*/ ,_bhoverzoom);
 BA.debugLineNum = 658;BA.debugLine="el.BoxType = sBoxType";
Debug.JustUpdateDeviceLine();
_el.setField ("_boxtype" /*RemoteObject*/ ,_sboxtype);
 BA.debugLineNum = 659;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 660;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newlabel(RemoteObject __ref,RemoteObject _sname,RemoteObject _ssize,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("NewLabel (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,834);
if (RapidSub.canDelegate("newlabel")) { return __ref.runUserSub(false, "vmcontainer","newlabel", __ref, _sname, _ssize, _stext);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("sSize", _ssize);
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 834;BA.debugLine="Sub NewLabel(sname As String, sSize As String, sTe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 835;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 836;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 837;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 838;BA.debugLine="el.typeOf = \"label\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_typeof" /*RemoteObject*/ ,BA.ObjectToString("label"));
 BA.debugLineNum = 839;BA.debugLine="el.Tag = sSize";
Debug.JustUpdateDeviceLine();
_el.setField ("_tag" /*RemoteObject*/ ,_ssize);
 BA.debugLineNum = 840;BA.debugLine="el.Text = sText";
Debug.JustUpdateDeviceLine();
_el.setField ("_text" /*RemoteObject*/ ,_stext);
 BA.debugLineNum = 841;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 842;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newlist(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("NewList (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,868);
if (RapidSub.canDelegate("newlist")) { return __ref.runUserSub(false, "vmcontainer","newlist", __ref, _sname);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
 BA.debugLineNum = 868;BA.debugLine="Sub NewList(sname As String) As VMInputControl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 869;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 870;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 871;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 872;BA.debugLine="el.SetList";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setlist" /*RemoteObject*/ );
 BA.debugLineNum = 873;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 874;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newnumber(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _splaceholder,RemoteObject _brequired,RemoteObject _sicon,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewNumber (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,745);
if (RapidSub.canDelegate("newnumber")) { return __ref.runUserSub(false, "vmcontainer","newnumber", __ref, _sname, _slabel, _splaceholder, _brequired, _sicon, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("sIcon", _sicon);
Debug.locals.put("shelpertext", _shelpertext);
Debug.locals.put("serrorText", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 745;BA.debugLine="Sub NewNumber(sname As String, slabel As String, s";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 746;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 747;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 748;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 749;BA.debugLine="el.typeOf = \"number\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_typeof" /*RemoteObject*/ ,BA.ObjectToString("number"));
 BA.debugLineNum = 750;BA.debugLine="el.fieldType = \"int\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_fieldtype" /*RemoteObject*/ ,BA.ObjectToString("int"));
 BA.debugLineNum = 751;BA.debugLine="el.errorText = serrorText";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 752;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 753;BA.debugLine="el.required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 754;BA.debugLine="el.iconname = sIcon";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconname" /*RemoteObject*/ ,_sicon);
 BA.debugLineNum = 755;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 756;BA.debugLine="el.helperText = shelpertext";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 757;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 758;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 759;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newp(RemoteObject __ref,RemoteObject _sname,RemoteObject _stext) throws Exception{
try {
		Debug.PushSubsStack("NewP (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,830);
if (RapidSub.canDelegate("newp")) { return __ref.runUserSub(false, "vmcontainer","newp", __ref, _sname, _stext);}
Debug.locals.put("sname", _sname);
Debug.locals.put("sText", _stext);
 BA.debugLineNum = 830;BA.debugLine="Sub NewP(sname As String, sText As String) As VMIn";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 831;BA.debugLine="Return NewLabel(sname, \"p\", sText)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.vmcontainer.class, "_newlabel" /*RemoteObject*/ ,(Object)(_sname),(Object)(BA.ObjectToString("p")),(Object)(_stext));
 BA.debugLineNum = 832;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newpassword(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _splaceholder,RemoteObject _brequired,RemoteObject _btoggle,RemoteObject _sicon,RemoteObject _imaxlen,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewPassword (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,762);
if (RapidSub.canDelegate("newpassword")) { return __ref.runUserSub(false, "vmcontainer","newpassword", __ref, _sname, _slabel, _splaceholder, _brequired, _btoggle, _sicon, _imaxlen, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("bToggle", _btoggle);
Debug.locals.put("sIcon", _sicon);
Debug.locals.put("iMaxLen", _imaxlen);
Debug.locals.put("shelpertext", _shelpertext);
Debug.locals.put("serrorText", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 762;BA.debugLine="Sub NewPassword(sname As String, slabel As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 763;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 764;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 765;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 766;BA.debugLine="el.SetPassword";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setpassword" /*RemoteObject*/ );
 BA.debugLineNum = 767;BA.debugLine="el.errorText = serrorText";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 768;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 769;BA.debugLine="el.required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 770;BA.debugLine="el.iconname = sIcon";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconname" /*RemoteObject*/ ,_sicon);
 BA.debugLineNum = 771;BA.debugLine="el.MaxLength = iMaxLen";
Debug.JustUpdateDeviceLine();
_el.setField ("_maxlength" /*RemoteObject*/ ,(_imaxlen));
 BA.debugLineNum = 772;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 773;BA.debugLine="el.helperText = shelpertext";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 774;BA.debugLine="el.TogglePassword = bToggle";
Debug.JustUpdateDeviceLine();
_el.setField ("_togglepassword" /*RemoteObject*/ ,_btoggle);
 BA.debugLineNum = 775;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 776;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 777;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newradiogroup(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _svalue,RemoteObject _options,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewRadioGroup (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,544);
if (RapidSub.canDelegate("newradiogroup")) { return __ref.runUserSub(false, "vmcontainer","newradiogroup", __ref, _sname, _slabel, _svalue, _options, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("svalue", _svalue);
Debug.locals.put("options", _options);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 544;BA.debugLine="Sub NewRadioGroup(sname As String, slabel As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 545;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 546;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 547;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 548;BA.debugLine="el.SetRadioGroup";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setradiogroup" /*RemoteObject*/ );
 BA.debugLineNum = 549;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 550;BA.debugLine="el.Value = svalue";
Debug.JustUpdateDeviceLine();
_el.setField ("_value" /*RemoteObject*/ ,BA.ObjectToString(_svalue));
 BA.debugLineNum = 551;BA.debugLine="el.options = options";
Debug.JustUpdateDeviceLine();
_el.setField ("_options" /*RemoteObject*/ ,_options);
 BA.debugLineNum = 552;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 553;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 554;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newselect(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _brequired,RemoteObject _bmultiple,RemoteObject _splaceholder,RemoteObject _sourcetable,RemoteObject _sourcefield,RemoteObject _displayfield,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewSelect (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,876);
if (RapidSub.canDelegate("newselect")) { return __ref.runUserSub(false, "vmcontainer","newselect", __ref, _sname, _slabel, _brequired, _bmultiple, _splaceholder, _sourcetable, _sourcefield, _displayfield, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("sLabel", _slabel);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("bMultiple", _bmultiple);
Debug.locals.put("sPlaceHolder", _splaceholder);
Debug.locals.put("sourceTable", _sourcetable);
Debug.locals.put("sourceField", _sourcefield);
Debug.locals.put("displayField", _displayfield);
Debug.locals.put("sHelperText", _shelpertext);
Debug.locals.put("sErrorText", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 876;BA.debugLine="Sub NewSelect(sname As String, sLabel As String, b";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 877;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 878;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 879;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 880;BA.debugLine="el.SetSelect";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setselect" /*RemoteObject*/ );
 BA.debugLineNum = 881;BA.debugLine="el.label = sLabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 882;BA.debugLine="el.required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 883;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 884;BA.debugLine="el.placeholder = sPlaceHolder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 885;BA.debugLine="el.helperText = sHelperText";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 886;BA.debugLine="el.errorText = sErrorText";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 887;BA.debugLine="el.Dense = True";
Debug.JustUpdateDeviceLine();
_el.setField ("_dense" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 888;BA.debugLine="el.useoptions = False";
Debug.JustUpdateDeviceLine();
_el.setField ("_useoptions" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"False"));
 BA.debugLineNum = 889;BA.debugLine="el.sourceTable = sourceTable";
Debug.JustUpdateDeviceLine();
_el.setField ("_sourcetable" /*RemoteObject*/ ,_sourcetable);
 BA.debugLineNum = 890;BA.debugLine="el.SourceField = sourceField";
Debug.JustUpdateDeviceLine();
_el.setField ("_sourcefield" /*RemoteObject*/ ,_sourcefield);
 BA.debugLineNum = 891;BA.debugLine="el.displayField = displayField";
Debug.JustUpdateDeviceLine();
_el.setField ("_displayfield" /*RemoteObject*/ ,_displayfield);
 BA.debugLineNum = 892;BA.debugLine="el.multiple = bMultiple";
Debug.JustUpdateDeviceLine();
_el.setField ("_multiple" /*RemoteObject*/ ,_bmultiple);
 BA.debugLineNum = 893;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 894;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newslider(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _iminvalue,RemoteObject _imaxvalue,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewSlider (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,663);
if (RapidSub.canDelegate("newslider")) { return __ref.runUserSub(false, "vmcontainer","newslider", __ref, _sname, _slabel, _iminvalue, _imaxvalue, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("iMinValue", _iminvalue);
Debug.locals.put("iMaxValue", _imaxvalue);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 663;BA.debugLine="Sub NewSlider(sname As String, slabel As String, i";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 664;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 665;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 666;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 667;BA.debugLine="el.SetSlider";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setslider" /*RemoteObject*/ );
 BA.debugLineNum = 668;BA.debugLine="el.minvalue = iMinValue";
Debug.JustUpdateDeviceLine();
_el.setField ("_minvalue" /*RemoteObject*/ ,_iminvalue);
 BA.debugLineNum = 669;BA.debugLine="el.maxvalue = iMaxValue";
Debug.JustUpdateDeviceLine();
_el.setField ("_maxvalue" /*RemoteObject*/ ,BA.numberCast(int.class, _imaxvalue));
 BA.debugLineNum = 670;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 671;BA.debugLine="el.ThumbLabel = True";
Debug.JustUpdateDeviceLine();
_el.setField ("_thumblabel" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 672;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 673;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 674;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newswitch(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _svalue,RemoteObject _bprimary,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewSwitch (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,532);
if (RapidSub.canDelegate("newswitch")) { return __ref.runUserSub(false, "vmcontainer","newswitch", __ref, _sname, _slabel, _svalue, _bprimary, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("svalue", _svalue);
Debug.locals.put("bPrimary", _bprimary);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 532;BA.debugLine="Sub NewSwitch(sname As String, slabel As String, s";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 533;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 534;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 535;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 536;BA.debugLine="el.SetSwitch";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_setswitch" /*RemoteObject*/ );
 BA.debugLineNum = 537;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 538;BA.debugLine="el.Value = svalue";
Debug.JustUpdateDeviceLine();
_el.setField ("_value" /*RemoteObject*/ ,BA.ObjectToString(_svalue));
 BA.debugLineNum = 539;BA.debugLine="el.IsPrimary = bPrimary";
Debug.JustUpdateDeviceLine();
_el.setField ("_isprimary" /*RemoteObject*/ ,_bprimary);
 BA.debugLineNum = 540;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 541;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 542;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newtel(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _splaceholder,RemoteObject _brequired,RemoteObject _sicon,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewTel (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,730);
if (RapidSub.canDelegate("newtel")) { return __ref.runUserSub(false, "vmcontainer","newtel", __ref, _sname, _slabel, _splaceholder, _brequired, _sicon, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("sIcon", _sicon);
Debug.locals.put("shelpertext", _shelpertext);
Debug.locals.put("serrorText", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 730;BA.debugLine="Sub NewTel(sname As String, slabel As String, spla";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 731;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 732;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 733;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 734;BA.debugLine="el.typeOf = \"text\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_typeof" /*RemoteObject*/ ,BA.ObjectToString("text"));
 BA.debugLineNum = 735;BA.debugLine="el.errorText = serrorText";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 736;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 737;BA.debugLine="el.required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 738;BA.debugLine="el.iconname = sIcon";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconname" /*RemoteObject*/ ,_sicon);
 BA.debugLineNum = 739;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 740;BA.debugLine="el.helperText = shelpertext";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 741;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 742;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 743;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newtext(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _splaceholder,RemoteObject _brequired,RemoteObject _sicon,RemoteObject _imaxlen,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewText (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,693);
if (RapidSub.canDelegate("newtext")) { return __ref.runUserSub(false, "vmcontainer","newtext", __ref, _sname, _slabel, _splaceholder, _brequired, _sicon, _imaxlen, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("sIcon", _sicon);
Debug.locals.put("iMaxLen", _imaxlen);
Debug.locals.put("shelpertext", _shelpertext);
Debug.locals.put("serrorText", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 693;BA.debugLine="Sub NewText(sname As String, slabel As String, spl";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 694;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 695;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 696;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 697;BA.debugLine="el.typeOf = \"text\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_typeof" /*RemoteObject*/ ,BA.ObjectToString("text"));
 BA.debugLineNum = 698;BA.debugLine="el.clearable = True";
Debug.JustUpdateDeviceLine();
_el.setField ("_clearable" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 699;BA.debugLine="el.errorText = serrorText";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 700;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 701;BA.debugLine="el.required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 702;BA.debugLine="el.iconname = sIcon";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconname" /*RemoteObject*/ ,_sicon);
 BA.debugLineNum = 703;BA.debugLine="If iMaxLen > 0 Then el.MaxLength = iMaxLen";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_imaxlen,BA.numberCast(double.class, 0))) { 
_el.setField ("_maxlength" /*RemoteObject*/ ,(_imaxlen));};
 BA.debugLineNum = 704;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 705;BA.debugLine="el.helperText = shelpertext";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 706;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 707;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 708;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newtextarea(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _splaceholder,RemoteObject _brequired,RemoteObject _bautogrow,RemoteObject _sicon,RemoteObject _imaxlen,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewTextArea (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,711);
if (RapidSub.canDelegate("newtextarea")) { return __ref.runUserSub(false, "vmcontainer","newtextarea", __ref, _sname, _slabel, _splaceholder, _brequired, _bautogrow, _sicon, _imaxlen, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("bAutoGrow", _bautogrow);
Debug.locals.put("sIcon", _sicon);
Debug.locals.put("iMaxLen", _imaxlen);
Debug.locals.put("shelpertext", _shelpertext);
Debug.locals.put("serrorText", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 711;BA.debugLine="Sub NewTextArea(sname As String, slabel As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 712;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 713;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 714;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 715;BA.debugLine="el.clearable = True";
Debug.JustUpdateDeviceLine();
_el.setField ("_clearable" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 716;BA.debugLine="el.SetTextArea";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_settextarea" /*RemoteObject*/ );
 BA.debugLineNum = 717;BA.debugLine="el.errorText = serrorText";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 718;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 719;BA.debugLine="el.required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 720;BA.debugLine="el.iconname = sIcon";
Debug.JustUpdateDeviceLine();
_el.setField ("_iconname" /*RemoteObject*/ ,_sicon);
 BA.debugLineNum = 721;BA.debugLine="If iMaxLen > 0 Then el.MaxLength = iMaxLen";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_imaxlen,BA.numberCast(double.class, 0))) { 
_el.setField ("_maxlength" /*RemoteObject*/ ,(_imaxlen));};
 BA.debugLineNum = 722;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 723;BA.debugLine="el.helperText = shelpertext";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 724;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 725;BA.debugLine="el.AutoGrow = bAutoGrow";
Debug.JustUpdateDeviceLine();
_el.setField ("_autogrow" /*RemoteObject*/ ,_bautogrow);
 BA.debugLineNum = 726;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 727;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _newtimepicker(RemoteObject __ref,RemoteObject _sname,RemoteObject _slabel,RemoteObject _brequired,RemoteObject _splaceholder,RemoteObject _shelpertext,RemoteObject _serrortext,RemoteObject _itabindex) throws Exception{
try {
		Debug.PushSubsStack("NewTimePicker (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,591);
if (RapidSub.canDelegate("newtimepicker")) { return __ref.runUserSub(false, "vmcontainer","newtimepicker", __ref, _sname, _slabel, _brequired, _splaceholder, _shelpertext, _serrortext, _itabindex);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vminputcontrol");
Debug.locals.put("sname", _sname);
Debug.locals.put("slabel", _slabel);
Debug.locals.put("bRequired", _brequired);
Debug.locals.put("splaceholder", _splaceholder);
Debug.locals.put("shelpertext", _shelpertext);
Debug.locals.put("serrortext", _serrortext);
Debug.locals.put("iTabIndex", _itabindex);
 BA.debugLineNum = 591;BA.debugLine="Sub NewTimePicker(sname As String, slabel As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 593;BA.debugLine="sname = sname.tolowercase";
Debug.JustUpdateDeviceLine();
_sname = _sname.runMethod(true,"toLowerCase");Debug.locals.put("sname", _sname);
 BA.debugLineNum = 594;BA.debugLine="Dim el As VMInputControl";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vminputcontrol");Debug.locals.put("el", _el);
 BA.debugLineNum = 595;BA.debugLine="el.Initialize(sname)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_sname));
 BA.debugLineNum = 596;BA.debugLine="el.SetTimePicker";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vminputcontrol.class, "_settimepicker" /*RemoteObject*/ );
 BA.debugLineNum = 597;BA.debugLine="el.label = slabel";
Debug.JustUpdateDeviceLine();
_el.setField ("_label" /*RemoteObject*/ ,_slabel);
 BA.debugLineNum = 598;BA.debugLine="el.clearable = True";
Debug.JustUpdateDeviceLine();
_el.setField ("_clearable" /*RemoteObject*/ ,vmcontainer.__c.getField(true,"True"));
 BA.debugLineNum = 599;BA.debugLine="el.Required = bRequired";
Debug.JustUpdateDeviceLine();
_el.setField ("_required" /*RemoteObject*/ ,_brequired);
 BA.debugLineNum = 600;BA.debugLine="el.PlaceHolder = splaceholder";
Debug.JustUpdateDeviceLine();
_el.setField ("_placeholder" /*RemoteObject*/ ,_splaceholder);
 BA.debugLineNum = 601;BA.debugLine="el.helperText = shelpertext";
Debug.JustUpdateDeviceLine();
_el.setField ("_helpertext" /*RemoteObject*/ ,_shelpertext);
 BA.debugLineNum = 602;BA.debugLine="el.errorText = serrortext";
Debug.JustUpdateDeviceLine();
_el.setField ("_errortext" /*RemoteObject*/ ,_serrortext);
 BA.debugLineNum = 603;BA.debugLine="el.defaultValue = \"12:00\"";
Debug.JustUpdateDeviceLine();
_el.setField ("_defaultvalue" /*RemoteObject*/ ,RemoteObject.createImmutable(("12:00")));
 BA.debugLineNum = 604;BA.debugLine="If iTabIndex > 0 Then el.TabIndex = iTabIndex";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_itabindex,BA.numberCast(double.class, 0))) { 
_el.setField ("_tabindex" /*RemoteObject*/ ,_itabindex);};
 BA.debugLineNum = 605;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 606;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,433);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmcontainer","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 433;BA.debugLine="Sub Pop(p As VMContainer)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 434;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmcontainer.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _prepare(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Prepare (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,442);
if (RapidSub.canDelegate("prepare")) { return __ref.runUserSub(false, "vmcontainer","prepare", __ref);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _sk = RemoteObject.createImmutable("");
 BA.debugLineNum = 442;BA.debugLine="private Sub Prepare";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 443;BA.debugLine="For Each k As String In Dates";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_dates" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 444;BA.debugLine="Dim sk As String = vue.GetState(k,\"\")";
Debug.JustUpdateDeviceLine();
_sk = BA.ObjectToString(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_k),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sk", _sk);Debug.locals.put("sk", _sk);
 BA.debugLineNum = 445;BA.debugLine="sk = vue.Date2YYYYMMDD(sk)";
Debug.JustUpdateDeviceLine();
_sk = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_date2yyyymmdd" /*RemoteObject*/ ,(Object)((_sk)));Debug.locals.put("sk", _sk);
 BA.debugLineNum = 446;BA.debugLine="vue.SetStateSingle(k, sk)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)((_sk)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 448;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeattr(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("RemoveAttr (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("removeattr")) { return __ref.runUserSub(false, "vmcontainer","removeattr", __ref, _sname);}
Debug.locals.put("sName", _sname);
 BA.debugLineNum = 33;BA.debugLine="public Sub RemoveAttr(sName As String) As VMContai";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="Container.RemoveAttr(sName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(_sname));
 BA.debugLineNum = 35;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removerequired(RemoteObject __ref,RemoteObject _r) throws Exception{
try {
		Debug.PushSubsStack("RemoveRequired (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,913);
if (RapidSub.canDelegate("removerequired")) { return __ref.runUserSub(false, "vmcontainer","removerequired", __ref, _r);}
Debug.locals.put("r", _r);
 BA.debugLineNum = 913;BA.debugLine="Sub RemoveRequired(r As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 914;BA.debugLine="Required.Remove(r)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_required" /*RemoteObject*/ ).runVoidMethod ("Remove",(Object)((_r)));
 BA.debugLineNum = 915;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 916;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmcontainer","render", __ref);}
 BA.debugLineNum = 429;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 430;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 431;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmcontainer","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 418;BA.debugLine="Sub SetAttr(attr As Map) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 419;BA.debugLine="Container.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 420;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 421;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundcolor(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundColor (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "vmcontainer","setbackgroundcolor", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 149;BA.debugLine="Sub SetBackgroundColor(p As Object) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="Container.SetBackgroundColor(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setbackgroundcolor" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 151;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundimage(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundImage (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("setbackgroundimage")) { return __ref.runUserSub(false, "vmcontainer","setbackgroundimage", __ref, _url);}
Debug.locals.put("url", _url);
 BA.debugLineNum = 200;BA.debugLine="Sub SetBackgroundImage(url As String) As VMContain";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 201;BA.debugLine="Container.SetBackgroundImage(url)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setbackgroundimage" /*RemoteObject*/ ,(Object)(_url));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _width,RemoteObject _color,RemoteObject _bstyle) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,369);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vmcontainer","setborder", __ref, _width, _color, _bstyle);}
Debug.locals.put("width", _width);
Debug.locals.put("color", _color);
Debug.locals.put("bstyle", _bstyle);
 BA.debugLineNum = 369;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 370;BA.debugLine="Container.SetBorder(width, color, bstyle)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setborder" /*RemoteObject*/ ,(Object)(_width),(Object)(_color),(Object)(_bstyle));
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
public static RemoteObject  _setborderrc(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _width,RemoteObject _color,RemoteObject _bstyle) throws Exception{
try {
		Debug.PushSubsStack("SetBorderRC (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("setborderrc")) { return __ref.runUserSub(false, "vmcontainer","setborderrc", __ref, _rowpos, _colpos, _width, _color, _bstyle);}
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("width", _width);
Debug.locals.put("color", _color);
Debug.locals.put("bstyle", _bstyle);
 BA.debugLineNum = 84;BA.debugLine="Sub SetBorderRC(rowPos As Int, colPos As Int, widt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="Grid.SetBorder(rowPos, colPos, width, color, bsty";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_setborder" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(_width),(Object)(_color),(Object)(_bstyle));
 BA.debugLineNum = 86;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclass(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _classname) throws Exception{
try {
		Debug.PushSubsStack("SetClass (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("setclass")) { return __ref.runUserSub(false, "vmcontainer","setclass", __ref, _rowpos, _colpos, _classname);}
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("className", _classname);
 BA.debugLineNum = 79;BA.debugLine="Sub SetClass(rowPos As Int, colPos As Int, classNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="Grid.SetClass(rowPos, colPos, className)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_setclass" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(_classname));
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
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetColor (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "vmcontainer","setcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 139;BA.debugLine="Sub SetColor(c As Object) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Container.SetColor(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setcolor" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _setcursormove(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetCursorMove (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("setcursormove")) { return __ref.runUserSub(false, "vmcontainer","setcursormove", __ref);}
 BA.debugLineNum = 375;BA.debugLine="Sub SetCursorMove As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 376;BA.debugLine="Container.SetCursorMove";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setcursormove" /*RemoteObject*/ );
 BA.debugLineNum = 377;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 378;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcursorpointer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetCursorPointer (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,380);
if (RapidSub.canDelegate("setcursorpointer")) { return __ref.runUserSub(false, "vmcontainer","setcursorpointer", __ref);}
 BA.debugLineNum = 380;BA.debugLine="Sub SetCursorPointer As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 381;BA.debugLine="Container.SetCursorPointer";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setcursorpointer" /*RemoteObject*/ );
 BA.debugLineNum = 382;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 383;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaults(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDefaults (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,900);
if (RapidSub.canDelegate("setdefaults")) { return __ref.runUserSub(false, "vmcontainer","setdefaults", __ref);}
RemoteObject _k = RemoteObject.createImmutable("");
 BA.debugLineNum = 900;BA.debugLine="Sub SetDefaults";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 901;BA.debugLine="vue.SetState(Defaults)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_defaults" /*RemoteObject*/ )));
 BA.debugLineNum = 902;BA.debugLine="vue.SetState(visibility)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_visibility" /*RemoteObject*/ )));
 BA.debugLineNum = 903;BA.debugLine="For Each k As String In Required.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = __ref.getField(false,"_required" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 904;BA.debugLine="HideError(k)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_hideerror" /*RemoteObject*/ ,(Object)(_k));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 906;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmcontainer","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 190;BA.debugLine="Sub SetDisabled(b As Boolean) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="vue.SetStateSingle($\"${ID}disabled\"$,b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("disabled")))),(Object)((_b)));
 BA.debugLineNum = 192;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdraggable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDraggable (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,390);
if (RapidSub.canDelegate("setdraggable")) { return __ref.runUserSub(false, "vmcontainer","setdraggable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 390;BA.debugLine="Sub SetDraggable(b As Boolean) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 391;BA.debugLine="Container.SetDraggable(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdraggable" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 392;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 393;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdroppable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDroppable (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,395);
if (RapidSub.canDelegate("setdroppable")) { return __ref.runUserSub(false, "vmcontainer","setdroppable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 395;BA.debugLine="Sub SetDroppable(b As Boolean) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 396;BA.debugLine="Container.SetDroppable(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdroppable" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 397;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,363);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmcontainer","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 363;BA.debugLine="Sub SetElevation(e As Int) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 364;BA.debugLine="Container.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 365;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setempty(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetEmpty (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,896);
if (RapidSub.canDelegate("setempty")) { return __ref.runUserSub(false, "vmcontainer","setempty", __ref);}
 BA.debugLineNum = 896;BA.debugLine="Sub SetEmpty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 897;BA.debugLine="vue.SetStateListValues(Fields)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatelistvalues" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_fields" /*RemoteObject*/ )));
 BA.debugLineNum = 898;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,406);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vmcontainer","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 406;BA.debugLine="Sub SetHeight(h As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 407;BA.debugLine="Container.SetHeight(h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setheight" /*RemoteObject*/ ,(Object)(_h));
 BA.debugLineNum = 408;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 409;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _n,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmcontainer","setid", __ref, _n, _bind);}
Debug.locals.put("n", _n);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 109;BA.debugLine="Sub SetID(n As String, bind As Boolean) As VMConta";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="Container.SetID(n, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_n),(Object)(_bind));
 BA.debugLineNum = 111;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmcontainer","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 114;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VMCont";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="Container.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)(_k),(Object)(_bind));
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
public static RemoteObject  _setmarginall(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetMarginAll (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("setmarginall")) { return __ref.runUserSub(false, "vmcontainer","setmarginall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 154;BA.debugLine="Sub SetMarginAll(p As Object) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 155;BA.debugLine="Container.setmarginall(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmarginall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 156;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmargins(RemoteObject __ref,RemoteObject _mt,RemoteObject _mb,RemoteObject _ml,RemoteObject _mr) throws Exception{
try {
		Debug.PushSubsStack("SetMargins (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("setmargins")) { return __ref.runUserSub(false, "vmcontainer","setmargins", __ref, _mt, _mb, _ml, _mr);}
Debug.locals.put("mt", _mt);
Debug.locals.put("mb", _mb);
Debug.locals.put("ml", _ml);
Debug.locals.put("mr", _mr);
 BA.debugLineNum = 358;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 359;BA.debugLine="Container.SetMargins(mt, mb, ml, mr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmargins" /*RemoteObject*/ ,(Object)(_mt),(Object)(_mb),(Object)(_ml),(Object)(_mr));
 BA.debugLineNum = 360;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmarginsrc(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _mt,RemoteObject _mb,RemoteObject _ml,RemoteObject _mr) throws Exception{
try {
		Debug.PushSubsStack("SetMarginsRC (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("setmarginsrc")) { return __ref.runUserSub(false, "vmcontainer","setmarginsrc", __ref, _rowpos, _colpos, _mt, _mb, _ml, _mr);}
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("mt", _mt);
Debug.locals.put("mb", _mb);
Debug.locals.put("ml", _ml);
Debug.locals.put("mr", _mr);
 BA.debugLineNum = 89;BA.debugLine="Sub SetMarginsRC(rowPos As Int, colPos As Int, mt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="Grid.SetMargins(rowPos, colPos, mt, mb, ml, mr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_setmargins" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(_mt),(Object)(_mb),(Object)(_ml),(Object)(_mr));
 BA.debugLineNum = 91;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
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
public static RemoteObject  _setmaxheight(RemoteObject __ref,RemoteObject _mw) throws Exception{
try {
		Debug.PushSubsStack("SetMaxHeight (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("setmaxheight")) { return __ref.runUserSub(false, "vmcontainer","setmaxheight", __ref, _mw);}
Debug.locals.put("mw", _mw);
 BA.debugLineNum = 169;BA.debugLine="Sub SetMaxHeight(mw As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="Container.SetMaxHeight(mw)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmaxheight" /*RemoteObject*/ ,(Object)(_mw));
 BA.debugLineNum = 171;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _setmaxwidth(RemoteObject __ref,RemoteObject _mw) throws Exception{
try {
		Debug.PushSubsStack("SetMaxWidth (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("setmaxwidth")) { return __ref.runUserSub(false, "vmcontainer","setmaxwidth", __ref, _mw);}
Debug.locals.put("mw", _mw);
 BA.debugLineNum = 164;BA.debugLine="Sub SetMaxWidth(mw As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="Container.SetMaxWidth(mw)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmaxwidth" /*RemoteObject*/ ,(Object)(_mw));
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
public static RemoteObject  _setnotselectible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetNotSelectible (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setnotselectible")) { return __ref.runUserSub(false, "vmcontainer","setnotselectible", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Sub SetNotSelectible As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="Container.SetNotSelectible";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setnotselectible" /*RemoteObject*/ );
 BA.debugLineNum = 101;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclick(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnClick (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vmcontainer","setonclick", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 210;BA.debugLine="Sub SetOnClick(methodName As String) As VMContaine";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="Container.SetOnClick(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname));
 BA.debugLineNum = 212;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclickrc(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("SetOnClickRC (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("setonclickrc")) { return __ref.runUserSub(false, "vmcontainer","setonclickrc", __ref, _rowpos, _colpos);}
Debug.locals.put("rowpos", _rowpos);
Debug.locals.put("colpos", _colpos);
 BA.debugLineNum = 215;BA.debugLine="Sub SetOnClickRC(rowpos As Int, colpos As Int) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 216;BA.debugLine="Grid.setonclick(rowpos,colpos)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_setonclick" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos));
 BA.debugLineNum = 217;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondrop(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDrop (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,338);
if (RapidSub.canDelegate("setondrop")) { return __ref.runUserSub(false, "vmcontainer","setondrop", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 338;BA.debugLine="Sub SetOnDrop(methodName As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 339;BA.debugLine="Container.setondrop(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setondrop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname));
 BA.debugLineNum = 340;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonmouseout(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnMouseOut (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("setonmouseout")) { return __ref.runUserSub(false, "vmcontainer","setonmouseout", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 343;BA.debugLine="Sub SetOnMouseOut(methodName As String) As VMConta";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 344;BA.debugLine="Container.SetOnMouseOut(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonmouseout" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname));
 BA.debugLineNum = 345;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonmouseover(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnMouseOver (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("setonmouseover")) { return __ref.runUserSub(false, "vmcontainer","setonmouseover", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 348;BA.debugLine="Sub SetOnMouseOver(methodName As String) As VMCont";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 349;BA.debugLine="Container.SetOnMouseOver(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonmouseover" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _pt,RemoteObject _pb,RemoteObject _pl,RemoteObject _pr) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmcontainer","setpadding", __ref, _pt, _pb, _pl, _pr);}
Debug.locals.put("pt", _pt);
Debug.locals.put("pb", _pb);
Debug.locals.put("pl", _pl);
Debug.locals.put("pr", _pr);
 BA.debugLineNum = 353;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 354;BA.debugLine="Container.SetPadding(pt,pb,pl, pr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpadding" /*RemoteObject*/ ,(Object)(_pt),(Object)(_pb),(Object)(_pl),(Object)(_pr));
 BA.debugLineNum = 355;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 356;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpaddingall(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPaddingAll (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("setpaddingall")) { return __ref.runUserSub(false, "vmcontainer","setpaddingall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 159;BA.debugLine="Sub SetPaddingAll(p As Object) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="Container.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 161;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpaddingrc(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _pt,RemoteObject _pb,RemoteObject _pl,RemoteObject _pr) throws Exception{
try {
		Debug.PushSubsStack("SetPaddingRC (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("setpaddingrc")) { return __ref.runUserSub(false, "vmcontainer","setpaddingrc", __ref, _rowpos, _colpos, _pt, _pb, _pl, _pr);}
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("pt", _pt);
Debug.locals.put("pb", _pb);
Debug.locals.put("pl", _pl);
Debug.locals.put("pr", _pr);
 BA.debugLineNum = 94;BA.debugLine="Sub SetPaddingRC(rowPos As Int, colPos As Int, pt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="Grid.SetPadding(rowPos,colPos, pt,pb,pl,pr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_setpadding" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(_pt),(Object)(_pb),(Object)(_pl),(Object)(_pr));
 BA.debugLineNum = 96;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setref(RemoteObject __ref,RemoteObject _varref) throws Exception{
try {
		Debug.PushSubsStack("SetRef (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("setref")) { return __ref.runUserSub(false, "vmcontainer","setref", __ref, _varref);}
Debug.locals.put("varRef", _varref);
 BA.debugLineNum = 104;BA.debugLine="Sub SetRef(varRef As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="Container.SetRef(varRef)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setref" /*RemoteObject*/ ,(Object)(_varref));
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
public static RemoteObject  _setscrollbar(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetScrollBar (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("setscrollbar")) { return __ref.runUserSub(false, "vmcontainer","setscrollbar", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 195;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="Container.SetScrollBar(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setscrollbar" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 197;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmcontainer","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 144;BA.debugLine="Sub SetStyle(m As Map) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="Container.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 146;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylerc(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _prop,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetStyleRC (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,243);
if (RapidSub.canDelegate("setstylerc")) { return __ref.runUserSub(false, "vmcontainer","setstylerc", __ref, _rowpos, _colpos, _prop, _value);}
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("prop", _prop);
Debug.locals.put("value", _value);
 BA.debugLineNum = 243;BA.debugLine="Sub SetStyleRC(rowPos As Int, colPos As Int, prop";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 244;BA.debugLine="Grid.setstyle(rowPos, colPos, prop, value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_setstyle" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(_prop),(Object)(_value));
 BA.debugLineNum = 245;BA.debugLine="Return Grid";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ );
 BA.debugLineNum = 246;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmcontainer","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 205;BA.debugLine="Sub SetText(t As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 206;BA.debugLine="Container.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
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
public static RemoteObject  _settextaligncenter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetTextAlignCenter (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,385);
if (RapidSub.canDelegate("settextaligncenter")) { return __ref.runUserSub(false, "vmcontainer","settextaligncenter", __ref);}
 BA.debugLineNum = 385;BA.debugLine="Sub SetTextAlignCenter As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 386;BA.debugLine="Container.SetTextAlignCenter";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settextaligncenter" /*RemoteObject*/ );
 BA.debugLineNum = 387;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 388;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmcontainer","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 119;BA.debugLine="Sub SetVIf(vif As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="Container.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vshow) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,411);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmcontainer","setvshow", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 411;BA.debugLine="Sub SetVShow(vshow As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 412;BA.debugLine="Container.SetVShow(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vshow));
 BA.debugLineNum = 413;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 414;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetWidth (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,401);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmcontainer","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 401;BA.debugLine="Sub SetWidth(w As String) As VMContainer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 402;BA.debugLine="Container.SetWidth(w)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setwidth" /*RemoteObject*/ ,(Object)(_w));
 BA.debugLineNum = 403;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 404;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmcontainer","show", __ref);}
 BA.debugLineNum = 186;BA.debugLine="Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="vue.SetStateSingle($\"${ID}show\"$, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("show")))),(Object)((vmcontainer.__c.getField(true,"True"))));
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showerror(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("ShowError (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,483);
if (RapidSub.canDelegate("showerror")) { return __ref.runUserSub(false, "vmcontainer","showerror", __ref, _elid);}
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 483;BA.debugLine="Sub ShowError(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 484;BA.debugLine="vue.SetStateSingle($\"${elID}error\"$, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcontainer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable("error")))),(Object)((vmcontainer.__c.getField(true,"True"))));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,423);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmcontainer","tostring", __ref);}
 BA.debugLineNum = 423;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 424;BA.debugLine="BuildControls";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_buildcontrols" /*RemoteObject*/ );
 BA.debugLineNum = 425;BA.debugLine="Grid.Pop(Container)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_container" /*RemoteObject*/ )));
 BA.debugLineNum = 426;BA.debugLine="Return Container.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _validate(RemoteObject __ref,RemoteObject _rec) throws Exception{
try {
		Debug.PushSubsStack("Validate (vmcontainer) ","vmcontainer",47,__ref.getField(false, "ba"),__ref,460);
if (RapidSub.canDelegate("validate")) { return __ref.runUserSub(false, "vmcontainer","validate", __ref, _rec);}
RemoteObject _iv = RemoteObject.createImmutable(0);
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("rec", _rec);
 BA.debugLineNum = 460;BA.debugLine="Sub Validate(rec As Map) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 461;BA.debugLine="Dim iv As Int = 0";
Debug.JustUpdateDeviceLine();
_iv = BA.numberCast(int.class, 0);Debug.locals.put("iv", _iv);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 462;BA.debugLine="For Each k As String In Required.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = __ref.getField(false,"_required" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 463;BA.debugLine="If rec.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (_rec.runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 464;BA.debugLine="Dim v As String = rec.GetDefault(k,\"\")";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_rec.runMethod(false,"GetDefault",(Object)((_k)),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 465;BA.debugLine="v = vue.CStr(v)";
Debug.JustUpdateDeviceLine();
_v = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_cstr" /*RemoteObject*/ ,(Object)((_v)));Debug.locals.put("v", _v);
 BA.debugLineNum = 466;BA.debugLine="v = v.trim";
Debug.JustUpdateDeviceLine();
_v = _v.runMethod(true,"trim");Debug.locals.put("v", _v);
 BA.debugLineNum = 467;BA.debugLine="If v = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_v,BA.ObjectToString(""))) { 
 BA.debugLineNum = 468;BA.debugLine="Log(\"Validate: \" & k)";
Debug.JustUpdateDeviceLine();
vmcontainer.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("Validate: "),_k)));
 BA.debugLineNum = 469;BA.debugLine="iv = iv + 1";
Debug.JustUpdateDeviceLine();
_iv = RemoteObject.solve(new RemoteObject[] {_iv,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("iv", _iv);
 BA.debugLineNum = 470;BA.debugLine="ShowError(k)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_showerror" /*RemoteObject*/ ,(Object)(_k));
 }else {
 BA.debugLineNum = 472;BA.debugLine="HideError(k)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcontainer.class, "_hideerror" /*RemoteObject*/ ,(Object)(_k));
 };
 };
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 476;BA.debugLine="If iv = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_iv,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 477;BA.debugLine="Return True";
Debug.JustUpdateDeviceLine();
if (true) return vmcontainer.__c.getField(true,"True");
 }else {
 BA.debugLineNum = 479;BA.debugLine="Return False";
Debug.JustUpdateDeviceLine();
if (true) return vmcontainer.__c.getField(true,"False");
 };
 BA.debugLineNum = 481;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}