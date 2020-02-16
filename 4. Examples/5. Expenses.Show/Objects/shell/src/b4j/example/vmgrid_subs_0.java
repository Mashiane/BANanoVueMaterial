package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmgrid_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,577);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmgrid","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 577;BA.debugLine="Sub AddClass(c As String) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 578;BA.debugLine="Grid.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 579;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 580;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumnOSMP (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,390);
if (RapidSub.canDelegate("addcolumnosmp")) { return __ref.runUserSub(false, "vmgrid","addcolumnosmp", __ref, _icolumns, _ioffsetsmall, _ioffsetmedium, _ioffsetlarge, _ioffsetxlarge, _isizesmall, _isizemedium, _isizelarge, _isizexlarge, _sthemename, _svisibility, _sclassname);}
RemoteObject _ncell = RemoteObject.declareNull("b4j.example.vmgrid._gridcolumn");
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _oldrow = RemoteObject.declareNull("b4j.example.vmgrid._gridrow");
RemoteObject _cols = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
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
 BA.debugLineNum = 390;BA.debugLine="Sub AddColumnOSMP(iColumns As Int, iOffsetSmall As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 394;BA.debugLine="Dim nCell As GridColumn";
Debug.JustUpdateDeviceLine();
_ncell = RemoteObject.createNew ("b4j.example.vmgrid._gridcolumn");Debug.locals.put("nCell", _ncell);
 BA.debugLineNum = 395;BA.debugLine="nCell.Initialize";
Debug.JustUpdateDeviceLine();
_ncell.runVoidMethod ("Initialize");
 BA.debugLineNum = 396;BA.debugLine="InitializeColumn(nCell)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_initializecolumn" /*RemoteObject*/ ,(Object)(_ncell));
 BA.debugLineNum = 397;BA.debugLine="nCell = CreateColumn(iColumns,iOffsetSmall,iOffse";
Debug.JustUpdateDeviceLine();
_ncell = __ref.runClassMethod (b4j.example.vmgrid.class, "_createcolumn" /*RemoteObject*/ ,(Object)(_icolumns),(Object)(_ioffsetsmall),(Object)(_ioffsetmedium),(Object)(_ioffsetlarge),(Object)(_ioffsetxlarge),(Object)(_isizesmall),(Object)(_isizemedium),(Object)(_isizelarge),(Object)(_isizexlarge),(Object)(_sthemename),(Object)(_svisibility),(Object)(_sclassname));Debug.locals.put("nCell", _ncell);
 BA.debugLineNum = 399;BA.debugLine="Dim rowkey As String = $\"${ID}r${LastRow}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_lastrow" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("rowkey", _rowkey);Debug.locals.put("rowkey", _rowkey);
 BA.debugLineNum = 401;BA.debugLine="If Rows.ContainsKey(rowkey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 403;BA.debugLine="Dim oldRow As GridRow";
Debug.JustUpdateDeviceLine();
_oldrow = RemoteObject.createNew ("b4j.example.vmgrid._gridrow");Debug.locals.put("oldRow", _oldrow);
 BA.debugLineNum = 404;BA.debugLine="oldRow.Initialize";
Debug.JustUpdateDeviceLine();
_oldrow.runVoidMethod ("Initialize");
 BA.debugLineNum = 405;BA.debugLine="InitializeRow(oldRow)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_initializerow" /*RemoteObject*/ ,(Object)(_oldrow));
 BA.debugLineNum = 406;BA.debugLine="oldRow = Rows.Get(rowkey)";
Debug.JustUpdateDeviceLine();
_oldrow = (__ref.getField(false,"_rows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));Debug.locals.put("oldRow", _oldrow);
 BA.debugLineNum = 408;BA.debugLine="Dim cols As List = oldRow.Columns";
Debug.JustUpdateDeviceLine();
_cols = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_cols = _oldrow.getField(false,"Columns" /*RemoteObject*/ );Debug.locals.put("cols", _cols);Debug.locals.put("cols", _cols);
 BA.debugLineNum = 409;BA.debugLine="cols.add(nCell)";
Debug.JustUpdateDeviceLine();
_cols.runVoidMethod ("Add",(Object)((_ncell)));
 BA.debugLineNum = 410;BA.debugLine="Rows.Put(rowkey,oldRow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rows" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_oldrow)));
 }else {
 BA.debugLineNum = 412;BA.debugLine="Log(\"VMGrid - AddColumnOSMP: A row has not been";
Debug.JustUpdateDeviceLine();
vmgrid.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("VMGrid - AddColumnOSMP: A row has not been added yet to the grid!")));
 };
 BA.debugLineNum = 414;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 415;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,384);
if (RapidSub.canDelegate("addcolumns")) { return __ref.runUserSub(false, "vmgrid","addcolumns", __ref, _icolumns, _sizesmall, _sizemedium, _sizelarge, _sizexlarge);}
Debug.locals.put("iColumns", _icolumns);
Debug.locals.put("SizeSmall", _sizesmall);
Debug.locals.put("SizeMedium", _sizemedium);
Debug.locals.put("SizeLarge", _sizelarge);
Debug.locals.put("SizeXLarge", _sizexlarge);
 BA.debugLineNum = 384;BA.debugLine="Sub AddColumns(iColumns As Int, SizeSmall As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 385;BA.debugLine="AddColumnOSMP(iColumns,\"\",\"\",\"\",\"\", SizeSmall,Siz";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumnosmp" /*RemoteObject*/ ,(Object)(_icolumns),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(_sizesmall),(Object)(_sizemedium),(Object)(_sizelarge),(Object)(_sizexlarge),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 386;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _addcolumns10p2(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns10p2 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("addcolumns10p2")) { return __ref.runUserSub(false, "vmgrid","addcolumns10p2", __ref);}
 BA.debugLineNum = 354;BA.debugLine="Sub AddColumns10p2 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 355;BA.debugLine="AddColumns(1,\"12\",\"10\",\"10\",\"10\").AddColumns(1,\"1";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("10")),(Object)(BA.ObjectToString("10")),(Object)(RemoteObject.createImmutable("10"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("2")),(Object)(BA.ObjectToString("2")),(Object)(RemoteObject.createImmutable("2")));
 BA.debugLineNum = 356;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 357;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns11p1 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("addcolumns11p1")) { return __ref.runUserSub(false, "vmgrid","addcolumns11p1", __ref);}
 BA.debugLineNum = 344;BA.debugLine="Sub AddColumns11p1 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 345;BA.debugLine="AddColumns(1,\"12\",\"11\",\"11\",\"11\").AddColumns(1,\"1";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("11")),(Object)(BA.ObjectToString("11")),(Object)(RemoteObject.createImmutable("11"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("1")),(Object)(BA.ObjectToString("1")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 346;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 347;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns12 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,379);
if (RapidSub.canDelegate("addcolumns12")) { return __ref.runUserSub(false, "vmgrid","addcolumns12", __ref);}
 BA.debugLineNum = 379;BA.debugLine="Sub AddColumns12 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 380;BA.debugLine="AddColumns(1,\"12\",\"12\",\"12\",\"12\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("12")),(Object)(RemoteObject.createImmutable("12")));
 BA.debugLineNum = 381;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 382;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns12x1 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,324);
if (RapidSub.canDelegate("addcolumns12x1")) { return __ref.runUserSub(false, "vmgrid","addcolumns12x1", __ref);}
 BA.debugLineNum = 324;BA.debugLine="Sub AddColumns12x1 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 325;BA.debugLine="AddColumns(12,\"12\",\"1\",\"1\",\"1\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 12)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("1")),(Object)(BA.ObjectToString("1")),(Object)(RemoteObject.createImmutable("1")));
 BA.debugLineNum = 326;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 327;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns1p11 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,339);
if (RapidSub.canDelegate("addcolumns1p11")) { return __ref.runUserSub(false, "vmgrid","addcolumns1p11", __ref);}
 BA.debugLineNum = 339;BA.debugLine="Sub AddColumns1p11 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 340;BA.debugLine="AddColumns(1,\"12\",\"1\",\"1\",\"1\").AddColumns(1,\"12\",";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("1")),(Object)(BA.ObjectToString("1")),(Object)(RemoteObject.createImmutable("1"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("11")),(Object)(BA.ObjectToString("11")),(Object)(RemoteObject.createImmutable("11")));
 BA.debugLineNum = 341;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 342;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns2p10 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("addcolumns2p10")) { return __ref.runUserSub(false, "vmgrid","addcolumns2p10", __ref);}
 BA.debugLineNum = 349;BA.debugLine="Sub AddColumns2p10 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 350;BA.debugLine="AddColumns(1,\"12\",\"2\",\"2\",\"2\").AddColumns(1,\"12\",";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("2")),(Object)(BA.ObjectToString("2")),(Object)(RemoteObject.createImmutable("2"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("10")),(Object)(BA.ObjectToString("10")),(Object)(RemoteObject.createImmutable("10")));
 BA.debugLineNum = 351;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 352;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns2x6 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("addcolumns2x6")) { return __ref.runUserSub(false, "vmgrid","addcolumns2x6", __ref);}
 BA.debugLineNum = 314;BA.debugLine="Sub AddColumns2x6 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 315;BA.debugLine="AddColumns(2,\"12\",\"6\",\"6\",\"6\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 2)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("6")),(Object)(BA.ObjectToString("6")),(Object)(RemoteObject.createImmutable("6")));
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
public static RemoteObject  _addcolumns3p9(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns3p9 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,359);
if (RapidSub.canDelegate("addcolumns3p9")) { return __ref.runUserSub(false, "vmgrid","addcolumns3p9", __ref);}
 BA.debugLineNum = 359;BA.debugLine="Sub AddColumns3p9 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 360;BA.debugLine="AddColumns(1,\"12\",\"3\",\"3\",\"3\").AddColumns(1,\"12\",";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("3")),(Object)(BA.ObjectToString("3")),(Object)(RemoteObject.createImmutable("3"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("9")),(Object)(BA.ObjectToString("9")),(Object)(RemoteObject.createImmutable("9")));
 BA.debugLineNum = 361;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 362;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns3x4 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,304);
if (RapidSub.canDelegate("addcolumns3x4")) { return __ref.runUserSub(false, "vmgrid","addcolumns3x4", __ref);}
 BA.debugLineNum = 304;BA.debugLine="Sub AddColumns3x4 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 305;BA.debugLine="AddColumns(3,\"12\",\"4\",\"4\",\"4\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 3)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("4")),(Object)(BA.ObjectToString("4")),(Object)(RemoteObject.createImmutable("4")));
 BA.debugLineNum = 306;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 307;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns4p8 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,334);
if (RapidSub.canDelegate("addcolumns4p8")) { return __ref.runUserSub(false, "vmgrid","addcolumns4p8", __ref);}
 BA.debugLineNum = 334;BA.debugLine="Sub AddColumns4p8 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 335;BA.debugLine="AddColumns(1,\"12\",\"4\",\"4\",\"4\").AddColumns(1,\"12\",";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("4")),(Object)(BA.ObjectToString("4")),(Object)(RemoteObject.createImmutable("4"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("8")),(Object)(BA.ObjectToString("8")),(Object)(RemoteObject.createImmutable("8")));
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
public static RemoteObject  _addcolumns4x3(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns4x3 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("addcolumns4x3")) { return __ref.runUserSub(false, "vmgrid","addcolumns4x3", __ref);}
 BA.debugLineNum = 309;BA.debugLine="Sub AddColumns4x3 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 310;BA.debugLine="AddColumns(4,\"12\",\"3\",\"3\",\"3\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 4)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("3")),(Object)(BA.ObjectToString("3")),(Object)(RemoteObject.createImmutable("3")));
 BA.debugLineNum = 311;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 312;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns5p7 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("addcolumns5p7")) { return __ref.runUserSub(false, "vmgrid","addcolumns5p7", __ref);}
 BA.debugLineNum = 374;BA.debugLine="Sub AddColumns5p7 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 375;BA.debugLine="AddColumns(1,\"12\",\"5\",\"5\",\"5\").AddColumns(1,\"12\",";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("5")),(Object)(BA.ObjectToString("5")),(Object)(RemoteObject.createImmutable("5"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("7")),(Object)(BA.ObjectToString("7")),(Object)(RemoteObject.createImmutable("7")));
 BA.debugLineNum = 376;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 377;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns6x2 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("addcolumns6x2")) { return __ref.runUserSub(false, "vmgrid","addcolumns6x2", __ref);}
 BA.debugLineNum = 319;BA.debugLine="Sub AddColumns6x2 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 320;BA.debugLine="AddColumns(6,\"12\",\"2\",\"2\",\"2\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 6)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("2")),(Object)(BA.ObjectToString("2")),(Object)(RemoteObject.createImmutable("2")));
 BA.debugLineNum = 321;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 322;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns7p5 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,369);
if (RapidSub.canDelegate("addcolumns7p5")) { return __ref.runUserSub(false, "vmgrid","addcolumns7p5", __ref);}
 BA.debugLineNum = 369;BA.debugLine="Sub AddColumns7p5 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 370;BA.debugLine="AddColumns(1,\"12\",\"7\",\"7\",\"7\").AddColumns(1,\"12\",";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("7")),(Object)(BA.ObjectToString("7")),(Object)(RemoteObject.createImmutable("7"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("5")),(Object)(BA.ObjectToString("5")),(Object)(RemoteObject.createImmutable("5")));
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
public static RemoteObject  _addcolumns8p4(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddColumns8p4 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("addcolumns8p4")) { return __ref.runUserSub(false, "vmgrid","addcolumns8p4", __ref);}
 BA.debugLineNum = 329;BA.debugLine="Sub AddColumns8p4 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 330;BA.debugLine="AddColumns(1,\"12\",\"8\",\"8\",\"8\").AddColumns(1,\"12\",";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("8")),(Object)(BA.ObjectToString("8")),(Object)(RemoteObject.createImmutable("8"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("4")),(Object)(BA.ObjectToString("4")),(Object)(RemoteObject.createImmutable("4")));
 BA.debugLineNum = 331;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 332;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumns9p3 (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("addcolumns9p3")) { return __ref.runUserSub(false, "vmgrid","addcolumns9p3", __ref);}
 BA.debugLineNum = 364;BA.debugLine="Sub AddColumns9p3 As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 365;BA.debugLine="AddColumns(1,\"12\",\"9\",\"9\",\"9\").AddColumns(1,\"12\",";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("9")),(Object)(BA.ObjectToString("9")),(Object)(RemoteObject.createImmutable("9"))).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.ObjectToString("12")),(Object)(BA.ObjectToString("3")),(Object)(BA.ObjectToString("3")),(Object)(RemoteObject.createImmutable("3")));
 BA.debugLineNum = 366;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 367;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddColumnsOSMPV (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("addcolumnsosmpv")) { return __ref.runUserSub(false, "vmgrid","addcolumnsosmpv", __ref, _icolumns, _ioffsetsmall, _ioffsetmedium, _ioffsetlarge, _ioffsetxlarge, _isizesmall, _isizemedium, _isizelarge, _isizexlarge, _ivisibility, _stheme);}
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
 BA.debugLineNum = 290;BA.debugLine="Sub AddColumnsOSMPV(iColumns As String, iOffsetSma";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 293;BA.debugLine="AddColumnOSMP(iColumns, iOffsetSmall, iOffsetMedi";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addcolumnosmp" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _icolumns)),(Object)(_ioffsetsmall),(Object)(_ioffsetmedium),(Object)(_ioffsetlarge),(Object)(_ioffsetxlarge),(Object)(_isizesmall),(Object)(_isizemedium),(Object)(_isizelarge),(Object)(_isizexlarge),(Object)(_stheme),(Object)(_ivisibility),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 296;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 297;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddComponent (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,441);
if (RapidSub.canDelegate("addcomponent")) { return __ref.runUserSub(false, "vmgrid","addcomponent", __ref, _rowpos, _colpos, _elhtml);}
RemoteObject _cellkey = RemoteObject.createImmutable("");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("elHTML", _elhtml);
 BA.debugLineNum = 441;BA.debugLine="Sub AddComponent(rowPos As Int, colPos As Int, elH";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 442;BA.debugLine="Dim cellKey As String = $\"${ID}r${rowPos}c${colPo";
Debug.JustUpdateDeviceLine();
_cellkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowpos))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colpos))),RemoteObject.createImmutable("")));Debug.locals.put("cellKey", _cellkey);Debug.locals.put("cellKey", _cellkey);
 BA.debugLineNum = 443;BA.debugLine="Dim lst As List";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 444;BA.debugLine="If Components.ContainsKey(cellKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_components" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_cellkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 445;BA.debugLine="lst = Components.Get(cellKey)";
Debug.JustUpdateDeviceLine();
_lst.setObject(__ref.getField(false,"_components" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_cellkey))));
 }else {
 BA.debugLineNum = 447;BA.debugLine="lst.Initialize";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 448;BA.debugLine="lst.clear";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 450;BA.debugLine="lst.Add(elHTML)";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Add",(Object)((_elhtml)));
 BA.debugLineNum = 451;BA.debugLine="Components.Put(cellKey,lst)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_components" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_cellkey)),(Object)((_lst.getObject())));
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addgridclass(RemoteObject __ref,RemoteObject _classname) throws Exception{
try {
		Debug.PushSubsStack("AddGridClass (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("addgridclass")) { return __ref.runUserSub(false, "vmgrid","addgridclass", __ref, _classname);}
Debug.locals.put("className", _classname);
 BA.debugLineNum = 495;BA.debugLine="Sub AddGridClass(className As String) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 496;BA.debugLine="Grid.AddClass(className)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_classname));
 BA.debugLineNum = 497;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 498;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddRow (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("addrow")) { return __ref.runUserSub(false, "vmgrid","addrow", __ref, _irows, _svisibility, _sthemename, _sclassname);}
RemoteObject _nrow = RemoteObject.declareNull("b4j.example.vmgrid._gridrow");
RemoteObject _rowkey = RemoteObject.createImmutable("");
Debug.locals.put("iRows", _irows);
Debug.locals.put("sVisibility", _svisibility);
Debug.locals.put("sThemeName", _sthemename);
Debug.locals.put("sClassName", _sclassname);
 BA.debugLineNum = 274;BA.debugLine="Sub AddRow(iRows As Int, sVisibility As String, sT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 277;BA.debugLine="LastRow = Rows.size";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastrow" /*RemoteObject*/ ,__ref.getField(false,"_rows" /*RemoteObject*/ ).runMethod(true,"getSize"));
 BA.debugLineNum = 279;BA.debugLine="Dim nRow As GridRow";
Debug.JustUpdateDeviceLine();
_nrow = RemoteObject.createNew ("b4j.example.vmgrid._gridrow");Debug.locals.put("nRow", _nrow);
 BA.debugLineNum = 280;BA.debugLine="nRow.Initialize";
Debug.JustUpdateDeviceLine();
_nrow.runVoidMethod ("Initialize");
 BA.debugLineNum = 281;BA.debugLine="InitializeRow(nRow)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_initializerow" /*RemoteObject*/ ,(Object)(_nrow));
 BA.debugLineNum = 282;BA.debugLine="nRow  = CreateRow(iRows,sVisibility,sThemeName,sC";
Debug.JustUpdateDeviceLine();
_nrow = __ref.runClassMethod (b4j.example.vmgrid.class, "_createrow" /*RemoteObject*/ ,(Object)(_irows),(Object)(_svisibility),(Object)(_sthemename),(Object)(_sclassname));Debug.locals.put("nRow", _nrow);
 BA.debugLineNum = 284;BA.debugLine="Dim rowKey As String = $\"${ID}r${LastRow}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_lastrow" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 286;BA.debugLine="Rows.Put(rowKey,nRow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rows" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_nrow)));
 BA.debugLineNum = 287;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 288;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddRows (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,299);
if (RapidSub.canDelegate("addrows")) { return __ref.runUserSub(false, "vmgrid","addrows", __ref, _irows);}
Debug.locals.put("iRows", _irows);
 BA.debugLineNum = 299;BA.debugLine="Sub AddRows(iRows As Int) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 300;BA.debugLine="AddRow(iRows,\"\",\"\",\"\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_addrow" /*RemoteObject*/ ,(Object)(_irows),(Object)(BA.ObjectToString("")),(Object)(BA.ObjectToString("")),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 301;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 302;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Build (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("build")) { return __ref.runUserSub(false, "vmgrid","build", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rowcnt = RemoteObject.createImmutable(0);
RemoteObject _rowtot = RemoteObject.createImmutable(0);
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _currentrow = RemoteObject.declareNull("b4j.example.vmgrid._gridrow");
RemoteObject _strrow = RemoteObject.createImmutable("");
 BA.debugLineNum = 608;BA.debugLine="Sub Build";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 609;BA.debugLine="If isBuilt = True Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_isbuilt" /*RemoteObject*/ ),vmgrid.__c.getField(true,"True"))) { 
if (true) return RemoteObject.createImmutable("");};
 BA.debugLineNum = 611;BA.debugLine="LastRow = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastrow" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 612;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 613;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 615;BA.debugLine="Dim rowCnt As Int = 0";
Debug.JustUpdateDeviceLine();
_rowcnt = BA.numberCast(int.class, 0);Debug.locals.put("rowCnt", _rowcnt);Debug.locals.put("rowCnt", _rowcnt);
 BA.debugLineNum = 616;BA.debugLine="Dim rowTot As Int = Rows.Size - 1";
Debug.JustUpdateDeviceLine();
_rowtot = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_rows" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("rowTot", _rowtot);Debug.locals.put("rowTot", _rowtot);
 BA.debugLineNum = 617;BA.debugLine="For rowCnt = 0 To rowTot";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = _rowtot.<Integer>get().intValue();
_rowcnt = BA.numberCast(int.class, 0) ;
for (;(step7 > 0 && _rowcnt.<Integer>get().intValue() <= limit7) || (step7 < 0 && _rowcnt.<Integer>get().intValue() >= limit7) ;_rowcnt = RemoteObject.createImmutable((int)(0 + _rowcnt.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("rowCnt", _rowcnt);
 BA.debugLineNum = 618;BA.debugLine="Dim rowKey As String = Rows.GetKeyAt(rowCnt)";
Debug.JustUpdateDeviceLine();
_rowkey = BA.ObjectToString(__ref.getField(false,"_rows" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(_rowcnt)));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 619;BA.debugLine="Dim currentRow As GridRow";
Debug.JustUpdateDeviceLine();
_currentrow = RemoteObject.createNew ("b4j.example.vmgrid._gridrow");Debug.locals.put("currentRow", _currentrow);
 BA.debugLineNum = 620;BA.debugLine="currentRow.Initialize";
Debug.JustUpdateDeviceLine();
_currentrow.runVoidMethod ("Initialize");
 BA.debugLineNum = 621;BA.debugLine="InitializeRow(currentRow)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_initializerow" /*RemoteObject*/ ,(Object)(_currentrow));
 BA.debugLineNum = 622;BA.debugLine="currentRow = Rows.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_currentrow = (__ref.getField(false,"_rows" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));Debug.locals.put("currentRow", _currentrow);
 BA.debugLineNum = 623;BA.debugLine="Dim strRow As String = BuildRow(currentRow)";
Debug.JustUpdateDeviceLine();
_strrow = __ref.runClassMethod (b4j.example.vmgrid.class, "_buildrow" /*RemoteObject*/ ,(Object)(_currentrow));Debug.locals.put("strRow", _strrow);Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 624;BA.debugLine="sb.Append(strRow)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_strrow));
 BA.debugLineNum = 625;BA.debugLine="sb.append(CRLF)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(vmgrid.__c.getField(true,"CRLF")));
 }
}Debug.locals.put("rowCnt", _rowcnt);
;
 BA.debugLineNum = 627;BA.debugLine="Grid.SetText(sb.tostring)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_sb.runMethod(true,"ToString")));
 BA.debugLineNum = 628;BA.debugLine="isBuilt = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isbuilt" /*RemoteObject*/ ,vmgrid.__c.getField(true,"True"));
 BA.debugLineNum = 629;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildcolumnclass(RemoteObject __ref,RemoteObject _col) throws Exception{
try {
		Debug.PushSubsStack("BuildColumnClass (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,855);
if (RapidSub.canDelegate("buildcolumnclass")) { return __ref.runUserSub(false, "vmgrid","buildcolumnclass", __ref, _col);}
RemoteObject _strspans = RemoteObject.createImmutable("");
RemoteObject _stroffsets = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("col", _col);
 BA.debugLineNum = 855;BA.debugLine="private Sub BuildColumnClass(col As GridColumn) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 856;BA.debugLine="Dim strSpans As String = BuildSpans(col.SizeSmall";
Debug.JustUpdateDeviceLine();
_strspans = __ref.runClassMethod (b4j.example.vmgrid.class, "_buildspans" /*RemoteObject*/ ,(Object)(_col.getField(true,"SizeSmall" /*RemoteObject*/ )),(Object)(_col.getField(true,"SizeMedium" /*RemoteObject*/ )),(Object)(_col.getField(true,"SizeLarge" /*RemoteObject*/ )),(Object)(_col.getField(true,"SizeXLarge" /*RemoteObject*/ )));Debug.locals.put("strSpans", _strspans);Debug.locals.put("strSpans", _strspans);
 BA.debugLineNum = 857;BA.debugLine="Dim strOffSets As String = BuildOffsets(col.offse";
Debug.JustUpdateDeviceLine();
_stroffsets = __ref.runClassMethod (b4j.example.vmgrid.class, "_buildoffsets" /*RemoteObject*/ ,(Object)(_col.getField(true,"OffsetSmall" /*RemoteObject*/ )),(Object)(_col.getField(true,"OffsetMedium" /*RemoteObject*/ )),(Object)(_col.getField(true,"OffsetLarge" /*RemoteObject*/ )),(Object)(_col.getField(true,"OffsetXLarge" /*RemoteObject*/ )));Debug.locals.put("strOffSets", _stroffsets);Debug.locals.put("strOffSets", _stroffsets);
 BA.debugLineNum = 859;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 860;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 861;BA.debugLine="sb.Append($\"${cellClass} \"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_cellclass" /*RemoteObject*/ )))),RemoteObject.createImmutable(" ")))));
 BA.debugLineNum = 862;BA.debugLine="sb.Append(strSpans)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_strspans));
 BA.debugLineNum = 863;BA.debugLine="sb.Append(strOffSets)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_stroffsets));
 BA.debugLineNum = 864;BA.debugLine="Return sb.tostring.trim";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString").runMethod(true,"trim");
 BA.debugLineNum = 865;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildoffsets(RemoteObject __ref,RemoteObject _os,RemoteObject _om,RemoteObject _ol,RemoteObject _oxl) throws Exception{
try {
		Debug.PushSubsStack("BuildOffsets (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,908);
if (RapidSub.canDelegate("buildoffsets")) { return __ref.runUserSub(false, "vmgrid","buildoffsets", __ref, _os, _om, _ol, _oxl);}
RemoteObject _pvalue = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _ktot = RemoteObject.createImmutable(0);
RemoteObject _kcnt = RemoteObject.createImmutable(0);
RemoteObject _colkey = RemoteObject.createImmutable("");
RemoteObject _colc = RemoteObject.createImmutable("");
Debug.locals.put("OS", _os);
Debug.locals.put("OM", _om);
Debug.locals.put("OL", _ol);
Debug.locals.put("OXL", _oxl);
 BA.debugLineNum = 908;BA.debugLine="Private Sub BuildOffsets(OS As String, OM As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 909;BA.debugLine="Dim pvalue As String";
Debug.JustUpdateDeviceLine();
_pvalue = RemoteObject.createImmutable("");Debug.locals.put("pvalue", _pvalue);
 BA.debugLineNum = 910;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 911;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 912;BA.debugLine="Dim kTot As Int = offClass.Size - 1";
Debug.JustUpdateDeviceLine();
_ktot = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_offclass" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("kTot", _ktot);Debug.locals.put("kTot", _ktot);
 BA.debugLineNum = 913;BA.debugLine="Dim kCnt As Int = 0";
Debug.JustUpdateDeviceLine();
_kcnt = BA.numberCast(int.class, 0);Debug.locals.put("kCnt", _kcnt);Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 914;BA.debugLine="For kCnt = 0 To kTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _ktot.<Integer>get().intValue();
_kcnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _kcnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _kcnt.<Integer>get().intValue() >= limit6) ;_kcnt = RemoteObject.createImmutable((int)(0 + _kcnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 915;BA.debugLine="Dim colKey As String = offClass.GetKeyAt(kCnt)";
Debug.JustUpdateDeviceLine();
_colkey = BA.ObjectToString(__ref.getField(false,"_offclass" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(_kcnt)));Debug.locals.put("colKey", _colkey);Debug.locals.put("colKey", _colkey);
 BA.debugLineNum = 917;BA.debugLine="Dim colC As String = offClass.Get(colKey)";
Debug.JustUpdateDeviceLine();
_colc = BA.ObjectToString(__ref.getField(false,"_offclass" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colkey))));Debug.locals.put("colC", _colc);Debug.locals.put("colC", _colc);
 BA.debugLineNum = 919;BA.debugLine="Select Case colKey";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_colkey,BA.ObjectToString("s"),BA.ObjectToString("m"),BA.ObjectToString("l"),BA.ObjectToString("xl"))) {
case 0: {
 BA.debugLineNum = 921;BA.debugLine="pvalue = CStr(OS)";
Debug.JustUpdateDeviceLine();
_pvalue = __ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_os)));Debug.locals.put("pvalue", _pvalue);
 break; }
case 1: {
 BA.debugLineNum = 923;BA.debugLine="pvalue = CStr(OM)";
Debug.JustUpdateDeviceLine();
_pvalue = __ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_om)));Debug.locals.put("pvalue", _pvalue);
 break; }
case 2: {
 BA.debugLineNum = 925;BA.debugLine="pvalue = CStr(OL)";
Debug.JustUpdateDeviceLine();
_pvalue = __ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_ol)));Debug.locals.put("pvalue", _pvalue);
 break; }
case 3: {
 BA.debugLineNum = 927;BA.debugLine="pvalue = CStr(OXL)";
Debug.JustUpdateDeviceLine();
_pvalue = __ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_oxl)));Debug.locals.put("pvalue", _pvalue);
 break; }
}
;
 BA.debugLineNum = 929;BA.debugLine="If pvalue <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_pvalue,BA.ObjectToString(""))) { 
 BA.debugLineNum = 930;BA.debugLine="sb.Append(colC)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_colc));
 BA.debugLineNum = 931;BA.debugLine="sb.Append(pvalue)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_pvalue));
 BA.debugLineNum = 932;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 };
 }
}Debug.locals.put("kCnt", _kcnt);
;
 BA.debugLineNum = 935;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 936;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildrow(RemoteObject __ref,RemoteObject _row) throws Exception{
try {
		Debug.PushSubsStack("BuildRow (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,721);
if (RapidSub.canDelegate("buildrow")) { return __ref.runUserSub(false, "vmgrid","buildrow", __ref, _row);}
RemoteObject _rowtot = RemoteObject.createImmutable(0);
RemoteObject _rowcnt = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _trow = RemoteObject.declareNull("b4j.example.vuehtml");
RemoteObject _strrowclass = RemoteObject.createImmutable("");
RemoteObject _classkey = RemoteObject.createImmutable("");
RemoteObject _cm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _strval = RemoteObject.createImmutable("");
RemoteObject _am = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _cols = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colcnt = RemoteObject.createImmutable(0);
RemoteObject _coltot = RemoteObject.createImmutable(0);
RemoteObject _lastcolumn = RemoteObject.createImmutable(0);
RemoteObject _column = RemoteObject.declareNull("b4j.example.vmgrid._gridcolumn");
RemoteObject _colcnt1 = RemoteObject.createImmutable(0);
RemoteObject _coltot1 = RemoteObject.createImmutable(0);
RemoteObject _cellkey = RemoteObject.createImmutable("");
RemoteObject _tcolumn = RemoteObject.declareNull("b4j.example.vuehtml");
RemoteObject _strcolumnclass = RemoteObject.createImmutable("");
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strrow = RemoteObject.createImmutable("");
Debug.locals.put("row", _row);
 BA.debugLineNum = 721;BA.debugLine="private Sub BuildRow(row As GridRow) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 723;BA.debugLine="Dim rowTot As Int = row.Rows";
Debug.JustUpdateDeviceLine();
_rowtot = BA.numberCast(int.class, _row.getField(true,"Rows" /*RemoteObject*/ ));Debug.locals.put("rowTot", _rowtot);Debug.locals.put("rowTot", _rowtot);
 BA.debugLineNum = 724;BA.debugLine="Dim rowCnt As Int";
Debug.JustUpdateDeviceLine();
_rowcnt = RemoteObject.createImmutable(0);Debug.locals.put("rowCnt", _rowcnt);
 BA.debugLineNum = 725;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 726;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 728;BA.debugLine="For rowCnt = 1 To rowTot";
Debug.JustUpdateDeviceLine();
{
final int step5 = 1;
final int limit5 = _rowtot.<Integer>get().intValue();
_rowcnt = BA.numberCast(int.class, 1) ;
for (;(step5 > 0 && _rowcnt.<Integer>get().intValue() <= limit5) || (step5 < 0 && _rowcnt.<Integer>get().intValue() >= limit5) ;_rowcnt = RemoteObject.createImmutable((int)(0 + _rowcnt.<Integer>get().intValue() + step5))  ) {
Debug.locals.put("rowCnt", _rowcnt);
 BA.debugLineNum = 729;BA.debugLine="LastRow = LastRow + 1";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastrow" /*RemoteObject*/ ,RemoteObject.solve(new RemoteObject[] {__ref.getField(true,"_lastrow" /*RemoteObject*/ ),RemoteObject.createImmutable(1)}, "+",1, 1));
 BA.debugLineNum = 730;BA.debugLine="row.Row = CStr(LastRow)";
Debug.JustUpdateDeviceLine();
_row.setField ("Row" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((__ref.getField(true,"_lastrow" /*RemoteObject*/ )))));
 BA.debugLineNum = 731;BA.debugLine="Dim rowKey As String = $\"${ID}r${LastRow}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_lastrow" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 732;BA.debugLine="Dim tRow As VueHTML";
Debug.JustUpdateDeviceLine();
_trow = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("tRow", _trow);
 BA.debugLineNum = 733;BA.debugLine="tRow.Initialize(rowKey,\"div\")";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_rowkey),(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 734;BA.debugLine="Dim strRowClass As String = BuildRowClass";
Debug.JustUpdateDeviceLine();
_strrowclass = __ref.runClassMethod (b4j.example.vmgrid.class, "_buildrowclass" /*RemoteObject*/ );Debug.locals.put("strRowClass", _strrowclass);Debug.locals.put("strRowClass", _strrowclass);
 BA.debugLineNum = 735;BA.debugLine="tRow.AddClass(strRowClass)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_strrowclass));
 BA.debugLineNum = 736;BA.debugLine="tRow.AddClass(row.ClassName)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_row.getField(true,"ClassName" /*RemoteObject*/ )));
 BA.debugLineNum = 737;BA.debugLine="tRow.addClass(row.ThemeName)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_row.getField(true,"ThemeName" /*RemoteObject*/ )));
 BA.debugLineNum = 739;BA.debugLine="tRow.AddStyle(\"margin-top\", row.margintop)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-top")),(Object)(_row.getField(false,"MarginTop" /*RemoteObject*/ )));
 BA.debugLineNum = 740;BA.debugLine="tRow.AddStyle(\"margin-bottom\", row.marginbottom)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-bottom")),(Object)(_row.getField(false,"MarginBottom" /*RemoteObject*/ )));
 BA.debugLineNum = 741;BA.debugLine="tRow.AddStyle(\"margin-left\", row.marginleft)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-left")),(Object)(_row.getField(false,"MarginLeft" /*RemoteObject*/ )));
 BA.debugLineNum = 742;BA.debugLine="tRow.AddStyle(\"margin-right\", row.marginright)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-right")),(Object)(_row.getField(false,"MarginRight" /*RemoteObject*/ )));
 BA.debugLineNum = 743;BA.debugLine="tRow.AddStyle(\"padding-top\", row.paddingtop)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-top")),(Object)(_row.getField(false,"PaddingTop" /*RemoteObject*/ )));
 BA.debugLineNum = 744;BA.debugLine="tRow.AddStyle(\"padding-bottom\", row.paddingbotto";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-bottom")),(Object)(_row.getField(false,"PaddingBottom" /*RemoteObject*/ )));
 BA.debugLineNum = 745;BA.debugLine="tRow.AddStyle(\"padding-left\", row.paddingleft)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-left")),(Object)(_row.getField(false,"PaddingLeft" /*RemoteObject*/ )));
 BA.debugLineNum = 746;BA.debugLine="tRow.AddStyle(\"padding-right\", row.paddingright)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-right")),(Object)(_row.getField(false,"PaddingRight" /*RemoteObject*/ )));
 BA.debugLineNum = 749;BA.debugLine="Dim classKey As String = $\"${ID}r${LastRow}\"$";
Debug.JustUpdateDeviceLine();
_classkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_lastrow" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("classKey", _classkey);Debug.locals.put("classKey", _classkey);
 BA.debugLineNum = 750;BA.debugLine="If rowClasses.ContainsKey(classKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rowclasses" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_classkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 752;BA.debugLine="Dim cm As Map = rowClasses.Get(classKey)";
Debug.JustUpdateDeviceLine();
_cm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cm.setObject(__ref.getField(false,"_rowclasses" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_classkey))));Debug.locals.put("cm", _cm);
 BA.debugLineNum = 753;BA.debugLine="tRow.AddClass(MapKeys2Delim(cm,\" \"))";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmgrid.class, "_mapkeys2delim" /*RemoteObject*/ ,(Object)(_cm),(Object)(RemoteObject.createImmutable(" ")))));
 };
 BA.debugLineNum = 755;BA.debugLine="If rowStyles.ContainsKey(classKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_classkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 756;BA.debugLine="Dim cm As Map = rowStyles.Get(classKey)";
Debug.JustUpdateDeviceLine();
_cm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cm.setObject(__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_classkey))));Debug.locals.put("cm", _cm);
 BA.debugLineNum = 757;BA.debugLine="For Each strkey As String In cm.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group30 = _cm.runMethod(false,"Keys");
final int groupLen30 = group30.runMethod(true,"getSize").<Integer>get()
;int index30 = 0;
;
for (; index30 < groupLen30;index30++){
_strkey = BA.ObjectToString(group30.runMethod(false,"Get",index30));Debug.locals.put("strkey", _strkey);
Debug.locals.put("strkey", _strkey);
 BA.debugLineNum = 758;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
Debug.JustUpdateDeviceLine();
_strval = BA.ObjectToString(_cm.runMethod(false,"Get",(Object)((_strkey))));Debug.locals.put("strVal", _strval);Debug.locals.put("strVal", _strval);
 BA.debugLineNum = 759;BA.debugLine="tRow.AddStyleAttribute(strkey,strVal)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addstyleattribute" /*RemoteObject*/ ,(Object)(_strkey),(Object)((_strval)));
 }
}Debug.locals.put("strkey", _strkey);
;
 };
 BA.debugLineNum = 762;BA.debugLine="If attributes.ContainsKey(classKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_classkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 763;BA.debugLine="Dim am As Map = attributes.Get(classKey)";
Debug.JustUpdateDeviceLine();
_am = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_am.setObject(__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_classkey))));Debug.locals.put("am", _am);
 BA.debugLineNum = 764;BA.debugLine="For Each k As String In am.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group37 = _am.runMethod(false,"Keys");
final int groupLen37 = group37.runMethod(true,"getSize").<Integer>get()
;int index37 = 0;
;
for (; index37 < groupLen37;index37++){
_k = BA.ObjectToString(group37.runMethod(false,"Get",index37));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 765;BA.debugLine="Dim v As String = am.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_am.runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 766;BA.debugLine="tRow.SetAttr(k,v)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(_k),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 };
 BA.debugLineNum = 773;BA.debugLine="Dim cols As List = row.Columns";
Debug.JustUpdateDeviceLine();
_cols = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_cols = _row.getField(false,"Columns" /*RemoteObject*/ );Debug.locals.put("cols", _cols);Debug.locals.put("cols", _cols);
 BA.debugLineNum = 775;BA.debugLine="Dim colCnt As Int = 0";
Debug.JustUpdateDeviceLine();
_colcnt = BA.numberCast(int.class, 0);Debug.locals.put("colCnt", _colcnt);Debug.locals.put("colCnt", _colcnt);
 BA.debugLineNum = 776;BA.debugLine="Dim colTot As Int = cols.Size - 1";
Debug.JustUpdateDeviceLine();
_coltot = RemoteObject.solve(new RemoteObject[] {_cols.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("colTot", _coltot);Debug.locals.put("colTot", _coltot);
 BA.debugLineNum = 778;BA.debugLine="Dim LastColumn As Int = 0";
Debug.JustUpdateDeviceLine();
_lastcolumn = BA.numberCast(int.class, 0);Debug.locals.put("LastColumn", _lastcolumn);Debug.locals.put("LastColumn", _lastcolumn);
 BA.debugLineNum = 779;BA.debugLine="For colCnt = 0 To colTot";
Debug.JustUpdateDeviceLine();
{
final int step46 = 1;
final int limit46 = _coltot.<Integer>get().intValue();
_colcnt = BA.numberCast(int.class, 0) ;
for (;(step46 > 0 && _colcnt.<Integer>get().intValue() <= limit46) || (step46 < 0 && _colcnt.<Integer>get().intValue() >= limit46) ;_colcnt = RemoteObject.createImmutable((int)(0 + _colcnt.<Integer>get().intValue() + step46))  ) {
Debug.locals.put("colCnt", _colcnt);
 BA.debugLineNum = 781;BA.debugLine="Dim column As GridColumn";
Debug.JustUpdateDeviceLine();
_column = RemoteObject.createNew ("b4j.example.vmgrid._gridcolumn");Debug.locals.put("column", _column);
 BA.debugLineNum = 782;BA.debugLine="column.Initialize";
Debug.JustUpdateDeviceLine();
_column.runVoidMethod ("Initialize");
 BA.debugLineNum = 783;BA.debugLine="InitializeColumn(column)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_initializecolumn" /*RemoteObject*/ ,(Object)(_column));
 BA.debugLineNum = 784;BA.debugLine="column = cols.Get(colCnt)";
Debug.JustUpdateDeviceLine();
_column = (_cols.runMethod(false,"Get",(Object)(_colcnt)));Debug.locals.put("column", _column);
 BA.debugLineNum = 785;BA.debugLine="Dim colCnt1 As Int = 0";
Debug.JustUpdateDeviceLine();
_colcnt1 = BA.numberCast(int.class, 0);Debug.locals.put("colCnt1", _colcnt1);Debug.locals.put("colCnt1", _colcnt1);
 BA.debugLineNum = 786;BA.debugLine="Dim colTot1 As Int = column.Columns";
Debug.JustUpdateDeviceLine();
_coltot1 = BA.numberCast(int.class, _column.getField(true,"Columns" /*RemoteObject*/ ));Debug.locals.put("colTot1", _coltot1);Debug.locals.put("colTot1", _coltot1);
 BA.debugLineNum = 787;BA.debugLine="For colCnt1 = 1 To colTot1";
Debug.JustUpdateDeviceLine();
{
final int step53 = 1;
final int limit53 = _coltot1.<Integer>get().intValue();
_colcnt1 = BA.numberCast(int.class, 1) ;
for (;(step53 > 0 && _colcnt1.<Integer>get().intValue() <= limit53) || (step53 < 0 && _colcnt1.<Integer>get().intValue() >= limit53) ;_colcnt1 = RemoteObject.createImmutable((int)(0 + _colcnt1.<Integer>get().intValue() + step53))  ) {
Debug.locals.put("colCnt1", _colcnt1);
 BA.debugLineNum = 789;BA.debugLine="LastColumn = LastColumn + 1";
Debug.JustUpdateDeviceLine();
_lastcolumn = RemoteObject.solve(new RemoteObject[] {_lastcolumn,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("LastColumn", _lastcolumn);
 BA.debugLineNum = 790;BA.debugLine="column.Row = CStr(LastRow)";
Debug.JustUpdateDeviceLine();
_column.setField ("Row" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((__ref.getField(true,"_lastrow" /*RemoteObject*/ )))));
 BA.debugLineNum = 791;BA.debugLine="column.Col = CStr(LastColumn)";
Debug.JustUpdateDeviceLine();
_column.setField ("Col" /*RemoteObject*/ ,__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_lastcolumn))));
 BA.debugLineNum = 792;BA.debugLine="Dim cellKey As String = $\"${rowKey}c${LastColu";
Debug.JustUpdateDeviceLine();
_cellkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowkey))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lastcolumn))),RemoteObject.createImmutable("")));Debug.locals.put("cellKey", _cellkey);Debug.locals.put("cellKey", _cellkey);
 BA.debugLineNum = 794;BA.debugLine="RC.Put(cellKey,cellKey)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rc" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_cellkey)),(Object)((_cellkey)));
 BA.debugLineNum = 801;BA.debugLine="Dim tColumn As VueHTML";
Debug.JustUpdateDeviceLine();
_tcolumn = RemoteObject.createNew ("b4j.example.vuehtml");Debug.locals.put("tColumn", _tcolumn);
 BA.debugLineNum = 802;BA.debugLine="tColumn.Initialize(cellKey,\"div\")";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_cellkey),(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 803;BA.debugLine="Dim strColumnClass As String = BuildColumnClas";
Debug.JustUpdateDeviceLine();
_strcolumnclass = __ref.runClassMethod (b4j.example.vmgrid.class, "_buildcolumnclass" /*RemoteObject*/ ,(Object)(_column));Debug.locals.put("strColumnClass", _strcolumnclass);Debug.locals.put("strColumnClass", _strcolumnclass);
 BA.debugLineNum = 804;BA.debugLine="tColumn.AddClass(strColumnClass)";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_strcolumnclass));
 BA.debugLineNum = 805;BA.debugLine="tColumn.AddClass(column.ClassName)";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_column.getField(true,"ClassName" /*RemoteObject*/ )));
 BA.debugLineNum = 806;BA.debugLine="tColumn.addClass(column.ThemeName)";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_column.getField(true,"ThemeName" /*RemoteObject*/ )));
 BA.debugLineNum = 808;BA.debugLine="tColumn.AddStyle(\"margin-top\", column.marginto";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-top")),(Object)(_column.getField(false,"MarginTop" /*RemoteObject*/ )));
 BA.debugLineNum = 809;BA.debugLine="tColumn.AddStyle(\"margin-bottom\", column.margi";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-bottom")),(Object)(_column.getField(false,"MarginBottom" /*RemoteObject*/ )));
 BA.debugLineNum = 810;BA.debugLine="tColumn.AddStyle(\"margin-left\", column.marginl";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-left")),(Object)(_column.getField(false,"MarginLeft" /*RemoteObject*/ )));
 BA.debugLineNum = 811;BA.debugLine="tColumn.AddStyle(\"margin-right\", column.margin";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-right")),(Object)(_column.getField(false,"MarginRight" /*RemoteObject*/ )));
 BA.debugLineNum = 812;BA.debugLine="tColumn.AddStyle(\"padding-top\", column.padding";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-top")),(Object)(_column.getField(false,"PaddingTop" /*RemoteObject*/ )));
 BA.debugLineNum = 813;BA.debugLine="tColumn.AddStyle(\"padding-bottom\", column.padd";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-bottom")),(Object)(_column.getField(false,"PaddingBottom" /*RemoteObject*/ )));
 BA.debugLineNum = 814;BA.debugLine="tColumn.AddStyle(\"padding-left\", column.paddin";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-left")),(Object)(_column.getField(false,"PaddingLeft" /*RemoteObject*/ )));
 BA.debugLineNum = 815;BA.debugLine="tColumn.AddStyle(\"padding-right\", column.paddi";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-right")),(Object)(_column.getField(false,"PaddingRight" /*RemoteObject*/ )));
 BA.debugLineNum = 819;BA.debugLine="Dim classKey As String = $\"${ID}r${LastRow}c${";
Debug.JustUpdateDeviceLine();
_classkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_lastrow" /*RemoteObject*/ )))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_lastcolumn))),RemoteObject.createImmutable("")));Debug.locals.put("classKey", _classkey);Debug.locals.put("classKey", _classkey);
 BA.debugLineNum = 820;BA.debugLine="If rowClasses.ContainsKey(classKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rowclasses" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_classkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 822;BA.debugLine="Dim cm As Map = rowClasses.Get(classKey)";
Debug.JustUpdateDeviceLine();
_cm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cm.setObject(__ref.getField(false,"_rowclasses" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_classkey))));Debug.locals.put("cm", _cm);
 BA.debugLineNum = 823;BA.debugLine="tColumn.AddClass(MapKeys2Delim(cm,\" \"))";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmgrid.class, "_mapkeys2delim" /*RemoteObject*/ ,(Object)(_cm),(Object)(RemoteObject.createImmutable(" ")))));
 };
 BA.debugLineNum = 825;BA.debugLine="If rowStyles.ContainsKey(classKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_classkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 826;BA.debugLine="Dim cm As Map = rowStyles.Get(classKey)";
Debug.JustUpdateDeviceLine();
_cm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cm.setObject(__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_classkey))));Debug.locals.put("cm", _cm);
 BA.debugLineNum = 827;BA.debugLine="For Each strkey As String In cm.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group80 = _cm.runMethod(false,"Keys");
final int groupLen80 = group80.runMethod(true,"getSize").<Integer>get()
;int index80 = 0;
;
for (; index80 < groupLen80;index80++){
_strkey = BA.ObjectToString(group80.runMethod(false,"Get",index80));Debug.locals.put("strkey", _strkey);
Debug.locals.put("strkey", _strkey);
 BA.debugLineNum = 828;BA.debugLine="Dim strVal As String = cm.Get(strkey)";
Debug.JustUpdateDeviceLine();
_strval = BA.ObjectToString(_cm.runMethod(false,"Get",(Object)((_strkey))));Debug.locals.put("strVal", _strval);Debug.locals.put("strVal", _strval);
 BA.debugLineNum = 829;BA.debugLine="tColumn.AddStyleAttribute(strkey,strVal)";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addstyleattribute" /*RemoteObject*/ ,(Object)(_strkey),(Object)((_strval)));
 }
}Debug.locals.put("strkey", _strkey);
;
 };
 BA.debugLineNum = 832;BA.debugLine="If attributes.ContainsKey(classKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_classkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 833;BA.debugLine="Dim am As Map = attributes.Get(classKey)";
Debug.JustUpdateDeviceLine();
_am = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_am.setObject(__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_classkey))));Debug.locals.put("am", _am);
 BA.debugLineNum = 834;BA.debugLine="For Each k As String In am.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group87 = _am.runMethod(false,"Keys");
final int groupLen87 = group87.runMethod(true,"getSize").<Integer>get()
;int index87 = 0;
;
for (; index87 < groupLen87;index87++){
_k = BA.ObjectToString(group87.runMethod(false,"Get",index87));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 835;BA.debugLine="Dim v As String = am.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_am.runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 836;BA.debugLine="tColumn.SetAttr(k,v)";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(_k),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 };
 BA.debugLineNum = 839;BA.debugLine="If Components.ContainsKey(cellKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_components" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_cellkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 840;BA.debugLine="Dim lst As List = Components.Get(cellKey)";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst.setObject(__ref.getField(false,"_components" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_cellkey))));Debug.locals.put("lst", _lst);
 BA.debugLineNum = 841;BA.debugLine="tColumn.AddContentList(lst)";
Debug.JustUpdateDeviceLine();
_tcolumn.runClassMethod (b4j.example.vuehtml.class, "_addcontentlist" /*RemoteObject*/ ,(Object)(_lst));
 };
 BA.debugLineNum = 843;BA.debugLine="tRow.AddElement(tColumn)";
Debug.JustUpdateDeviceLine();
_trow.runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(_tcolumn));
 }
}Debug.locals.put("colCnt1", _colcnt1);
;
 }
}Debug.locals.put("colCnt", _colcnt);
;
 BA.debugLineNum = 847;BA.debugLine="Dim strRow As String = tRow.tostring";
Debug.JustUpdateDeviceLine();
_strrow = _trow.runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("strRow", _strrow);Debug.locals.put("strRow", _strrow);
 BA.debugLineNum = 848;BA.debugLine="sb.Append(strRow).Append(CRLF)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_strrow)).runVoidMethod ("Append",(Object)(vmgrid.__c.getField(true,"CRLF")));
 }
}Debug.locals.put("rowCnt", _rowcnt);
;
 BA.debugLineNum = 851;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 852;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildrowclass(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildRowClass (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,868);
if (RapidSub.canDelegate("buildrowclass")) { return __ref.runUserSub(false, "vmgrid","buildrowclass", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
 BA.debugLineNum = 868;BA.debugLine="private Sub BuildRowClass() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 869;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 870;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 871;BA.debugLine="sb.Append($\"${rowClass} \"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_rowclass" /*RemoteObject*/ )))),RemoteObject.createImmutable(" ")))));
 BA.debugLineNum = 872;BA.debugLine="Return sb.tostring.trim";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString").runMethod(true,"trim");
 BA.debugLineNum = 873;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _buildspans(RemoteObject __ref,RemoteObject _ss,RemoteObject _sm,RemoteObject _sl,RemoteObject _xl) throws Exception{
try {
		Debug.PushSubsStack("BuildSpans (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,876);
if (RapidSub.canDelegate("buildspans")) { return __ref.runUserSub(false, "vmgrid","buildspans", __ref, _ss, _sm, _sl, _xl);}
RemoteObject _pvalue = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _ktot = RemoteObject.createImmutable(0);
RemoteObject _kcnt = RemoteObject.createImmutable(0);
RemoteObject _colkey = RemoteObject.createImmutable("");
RemoteObject _colc = RemoteObject.createImmutable("");
Debug.locals.put("SS", _ss);
Debug.locals.put("SM", _sm);
Debug.locals.put("SL", _sl);
Debug.locals.put("XL", _xl);
 BA.debugLineNum = 876;BA.debugLine="Private Sub BuildSpans(SS As String, SM As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 877;BA.debugLine="Dim pvalue As String = \"\"";
Debug.JustUpdateDeviceLine();
_pvalue = BA.ObjectToString("");Debug.locals.put("pvalue", _pvalue);Debug.locals.put("pvalue", _pvalue);
 BA.debugLineNum = 878;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 879;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 881;BA.debugLine="Dim kTot As Int = colClass.Size - 1";
Debug.JustUpdateDeviceLine();
_ktot = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_colclass" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("kTot", _ktot);Debug.locals.put("kTot", _ktot);
 BA.debugLineNum = 882;BA.debugLine="Dim kCnt As Int";
Debug.JustUpdateDeviceLine();
_kcnt = RemoteObject.createImmutable(0);Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 883;BA.debugLine="For kCnt = 0 To kTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _ktot.<Integer>get().intValue();
_kcnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _kcnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _kcnt.<Integer>get().intValue() >= limit6) ;_kcnt = RemoteObject.createImmutable((int)(0 + _kcnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 884;BA.debugLine="Dim colKey As String = colClass.GetKeyAt(kCnt)";
Debug.JustUpdateDeviceLine();
_colkey = BA.ObjectToString(__ref.getField(false,"_colclass" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(_kcnt)));Debug.locals.put("colKey", _colkey);Debug.locals.put("colKey", _colkey);
 BA.debugLineNum = 886;BA.debugLine="Dim colC As String = colClass.Get(colKey)";
Debug.JustUpdateDeviceLine();
_colc = BA.ObjectToString(__ref.getField(false,"_colclass" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colkey))));Debug.locals.put("colC", _colc);Debug.locals.put("colC", _colc);
 BA.debugLineNum = 888;BA.debugLine="Select Case colKey";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_colkey,BA.ObjectToString("s"),BA.ObjectToString("m"),BA.ObjectToString("l"),BA.ObjectToString("xl"))) {
case 0: {
 BA.debugLineNum = 890;BA.debugLine="pvalue = CStr(SS)";
Debug.JustUpdateDeviceLine();
_pvalue = __ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_ss)));Debug.locals.put("pvalue", _pvalue);
 break; }
case 1: {
 BA.debugLineNum = 892;BA.debugLine="pvalue = CStr(SM)";
Debug.JustUpdateDeviceLine();
_pvalue = __ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_sm)));Debug.locals.put("pvalue", _pvalue);
 break; }
case 2: {
 BA.debugLineNum = 894;BA.debugLine="pvalue = CStr(SL)";
Debug.JustUpdateDeviceLine();
_pvalue = __ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_sl)));Debug.locals.put("pvalue", _pvalue);
 break; }
case 3: {
 BA.debugLineNum = 896;BA.debugLine="pvalue = CStr(XL)";
Debug.JustUpdateDeviceLine();
_pvalue = __ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_xl)));Debug.locals.put("pvalue", _pvalue);
 break; }
}
;
 BA.debugLineNum = 898;BA.debugLine="If pvalue <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_pvalue,BA.ObjectToString(""))) { 
 BA.debugLineNum = 899;BA.debugLine="sb.Append(colC)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_colc));
 BA.debugLineNum = 900;BA.debugLine="sb.Append(pvalue)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_pvalue));
 BA.debugLineNum = 901;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 };
 }
}Debug.locals.put("kCnt", _kcnt);
;
 BA.debugLineNum = 904;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 905;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Private BANano As BANano   'ignore";
vmgrid._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmgrid._banano);
 //BA.debugLineNum = 4;BA.debugLine="Public Grid As VMElement";
vmgrid._grid = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_grid",vmgrid._grid);
 //BA.debugLineNum = 5;BA.debugLine="Public ID As String";
vmgrid._id = RemoteObject.createImmutable("");__ref.setField("_id",vmgrid._id);
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
vmgrid._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmgrid._vue);
 //BA.debugLineNum = 8;BA.debugLine="Private Rows As Map";
vmgrid._rows = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rows",vmgrid._rows);
 //BA.debugLineNum = 10;BA.debugLine="Private Columns As Map";
vmgrid._columns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_columns",vmgrid._columns);
 //BA.debugLineNum = 13;BA.debugLine="Private LastRow As Int";
vmgrid._lastrow = RemoteObject.createImmutable(0);__ref.setField("_lastrow",vmgrid._lastrow);
 //BA.debugLineNum = 15;BA.debugLine="Private RC As Map";
vmgrid._rc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rc",vmgrid._rc);
 //BA.debugLineNum = 16;BA.debugLine="Private rowClass As String = \"row\"";
vmgrid._rowclass = BA.ObjectToString("row");__ref.setField("_rowclass",vmgrid._rowclass);
 //BA.debugLineNum = 17;BA.debugLine="Private cellClass As String = \"col\"";
vmgrid._cellclass = BA.ObjectToString("col");__ref.setField("_cellclass",vmgrid._cellclass);
 //BA.debugLineNum = 19;BA.debugLine="Public ShowID As Boolean";
vmgrid._showid = RemoteObject.createImmutable(false);__ref.setField("_showid",vmgrid._showid);
 //BA.debugLineNum = 20;BA.debugLine="Private Components As Map";
vmgrid._components = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_components",vmgrid._components);
 //BA.debugLineNum = 21;BA.debugLine="Private rowClasses As Map";
vmgrid._rowclasses = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rowclasses",vmgrid._rowclasses);
 //BA.debugLineNum = 23;BA.debugLine="Private offClass As Map = CreateMap(\"s\":\"offset-s";
vmgrid._offclass = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vmgrid._offclass = vmgrid.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("s")),RemoteObject.createImmutable(("offset-sm-")),RemoteObject.createImmutable(("m")),RemoteObject.createImmutable(("offset-md-")),RemoteObject.createImmutable(("l")),RemoteObject.createImmutable(("offset-lg-")),RemoteObject.createImmutable(("xl")),(RemoteObject.createImmutable("offset-xl-"))}));__ref.setField("_offclass",vmgrid._offclass);
 //BA.debugLineNum = 25;BA.debugLine="Private colClass As Map = CreateMap(\"s\": \"col-sm-";
vmgrid._colclass = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vmgrid._colclass = vmgrid.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("s")),RemoteObject.createImmutable(("col-sm-")),RemoteObject.createImmutable(("m")),RemoteObject.createImmutable(("col-md-")),RemoteObject.createImmutable(("l")),RemoteObject.createImmutable(("col-lg-")),RemoteObject.createImmutable(("xl")),(RemoteObject.createImmutable("col-xl-"))}));__ref.setField("_colclass",vmgrid._colclass);
 //BA.debugLineNum = 26;BA.debugLine="Private rowStyles As Map";
vmgrid._rowstyles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rowstyles",vmgrid._rowstyles);
 //BA.debugLineNum = 27;BA.debugLine="Private attributes As Map";
vmgrid._attributes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_attributes",vmgrid._attributes);
 //BA.debugLineNum = 29;BA.debugLine="Type GridRow(Rows As String, Columns As List, Vis";
;
 //BA.debugLineNum = 33;BA.debugLine="Type GridColumn(Columns As String, OffsetSmall As";
;
 //BA.debugLineNum = 38;BA.debugLine="Private isBuilt As Boolean";
vmgrid._isbuilt = RemoteObject.createImmutable(false);__ref.setField("_isbuilt",vmgrid._isbuilt);
 //BA.debugLineNum = 39;BA.debugLine="Private module As Object";
vmgrid._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmgrid._module);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "vmgrid","clear", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Sub Clear As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Grid.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 67;BA.debugLine="Rows.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 68;BA.debugLine="LastRow = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastrow" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 69;BA.debugLine="RC.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rc" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 70;BA.debugLine="Columns.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 71;BA.debugLine="Components.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_components" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 72;BA.debugLine="rowClasses.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowclasses" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 73;BA.debugLine="rowStyles.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 74;BA.debugLine="attributes.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_attributes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 75;BA.debugLine="isBuilt = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isbuilt" /*RemoteObject*/ ,vmgrid.__c.getField(true,"False"));
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
public static RemoteObject  _columnexists(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("ColumnExists (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,945);
if (RapidSub.canDelegate("columnexists")) { return __ref.runUserSub(false, "vmgrid","columnexists", __ref, _rowpos, _colpos);}
RemoteObject _rowcol = RemoteObject.createImmutable("");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 945;BA.debugLine="Sub ColumnExists(rowPos As Int, colPos As Int) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 946;BA.debugLine="Dim rowcol As String = $\"${ID}r${rowPos}c${colPos";
Debug.JustUpdateDeviceLine();
_rowcol = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowpos))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colpos))),RemoteObject.createImmutable("")));Debug.locals.put("rowcol", _rowcol);Debug.locals.put("rowcol", _rowcol);
 BA.debugLineNum = 947;BA.debugLine="Return RC.ContainsKey(rowcol)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_rc" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowcol)));
 BA.debugLineNum = 948;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createcolumn(RemoteObject __ref,RemoteObject _columns2add,RemoteObject _offsetsmall,RemoteObject _offsetmedium,RemoteObject _offsetlarge,RemoteObject _offsetxlarge,RemoteObject _sizesmall,RemoteObject _sizemedium,RemoteObject _sizelarge,RemoteObject _sizexlarge,RemoteObject _themename,RemoteObject _visibility,RemoteObject _classname) throws Exception{
try {
		Debug.PushSubsStack("CreateColumn (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,676);
if (RapidSub.canDelegate("createcolumn")) { return __ref.runUserSub(false, "vmgrid","createcolumn", __ref, _columns2add, _offsetsmall, _offsetmedium, _offsetlarge, _offsetxlarge, _sizesmall, _sizemedium, _sizelarge, _sizexlarge, _themename, _visibility, _classname);}
RemoteObject _ncell = RemoteObject.declareNull("b4j.example.vmgrid._gridcolumn");
Debug.locals.put("Columns2Add", _columns2add);
Debug.locals.put("OffsetSmall", _offsetsmall);
Debug.locals.put("OffsetMedium", _offsetmedium);
Debug.locals.put("OffsetLarge", _offsetlarge);
Debug.locals.put("OffsetXLarge", _offsetxlarge);
Debug.locals.put("SizeSmall", _sizesmall);
Debug.locals.put("SizeMedium", _sizemedium);
Debug.locals.put("SizeLarge", _sizelarge);
Debug.locals.put("SizeXLarge", _sizexlarge);
Debug.locals.put("ThemeName", _themename);
Debug.locals.put("Visibility", _visibility);
Debug.locals.put("ClassName", _classname);
 BA.debugLineNum = 676;BA.debugLine="private Sub CreateColumn(Columns2Add As Int, Offse";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 679;BA.debugLine="Dim nCell As GridColumn";
Debug.JustUpdateDeviceLine();
_ncell = RemoteObject.createNew ("b4j.example.vmgrid._gridcolumn");Debug.locals.put("nCell", _ncell);
 BA.debugLineNum = 680;BA.debugLine="nCell.Initialize";
Debug.JustUpdateDeviceLine();
_ncell.runVoidMethod ("Initialize");
 BA.debugLineNum = 681;BA.debugLine="InitializeColumn(nCell)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_initializecolumn" /*RemoteObject*/ ,(Object)(_ncell));
 BA.debugLineNum = 682;BA.debugLine="nCell.Columns = Columns2Add";
Debug.JustUpdateDeviceLine();
_ncell.setField ("Columns" /*RemoteObject*/ ,BA.NumberToString(_columns2add));
 BA.debugLineNum = 683;BA.debugLine="nCell.OffsetSmall = OffsetSmall";
Debug.JustUpdateDeviceLine();
_ncell.setField ("OffsetSmall" /*RemoteObject*/ ,_offsetsmall);
 BA.debugLineNum = 684;BA.debugLine="nCell.OffsetMedium = OffsetMedium";
Debug.JustUpdateDeviceLine();
_ncell.setField ("OffsetMedium" /*RemoteObject*/ ,_offsetmedium);
 BA.debugLineNum = 685;BA.debugLine="nCell.OffsetLarge = OffsetLarge";
Debug.JustUpdateDeviceLine();
_ncell.setField ("OffsetLarge" /*RemoteObject*/ ,_offsetlarge);
 BA.debugLineNum = 686;BA.debugLine="nCell.OffsetXLarge = OffsetXLarge";
Debug.JustUpdateDeviceLine();
_ncell.setField ("OffsetXLarge" /*RemoteObject*/ ,_offsetxlarge);
 BA.debugLineNum = 687;BA.debugLine="nCell.SizeSmall = SizeSmall";
Debug.JustUpdateDeviceLine();
_ncell.setField ("SizeSmall" /*RemoteObject*/ ,_sizesmall);
 BA.debugLineNum = 688;BA.debugLine="nCell.SizeMedium = SizeMedium";
Debug.JustUpdateDeviceLine();
_ncell.setField ("SizeMedium" /*RemoteObject*/ ,_sizemedium);
 BA.debugLineNum = 689;BA.debugLine="nCell.SizeLarge = SizeLarge";
Debug.JustUpdateDeviceLine();
_ncell.setField ("SizeLarge" /*RemoteObject*/ ,_sizelarge);
 BA.debugLineNum = 690;BA.debugLine="nCell.SizeXLarge = SizeXLarge";
Debug.JustUpdateDeviceLine();
_ncell.setField ("SizeXLarge" /*RemoteObject*/ ,_sizexlarge);
 BA.debugLineNum = 691;BA.debugLine="nCell.Visibility = Visibility";
Debug.JustUpdateDeviceLine();
_ncell.setField ("Visibility" /*RemoteObject*/ ,_visibility);
 BA.debugLineNum = 692;BA.debugLine="nCell.ClassName = ClassName";
Debug.JustUpdateDeviceLine();
_ncell.setField ("ClassName" /*RemoteObject*/ ,_classname);
 BA.debugLineNum = 693;BA.debugLine="nCell.ThemeName = ThemeName";
Debug.JustUpdateDeviceLine();
_ncell.setField ("ThemeName" /*RemoteObject*/ ,_themename);
 BA.debugLineNum = 694;BA.debugLine="nCell.MarginTop = Null";
Debug.JustUpdateDeviceLine();
_ncell.setField ("MarginTop" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 695;BA.debugLine="nCell.MarginBottom = Null";
Debug.JustUpdateDeviceLine();
_ncell.setField ("MarginBottom" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 696;BA.debugLine="nCell.MarginLeft = Null";
Debug.JustUpdateDeviceLine();
_ncell.setField ("MarginLeft" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 697;BA.debugLine="nCell.MarginRight = Null";
Debug.JustUpdateDeviceLine();
_ncell.setField ("MarginRight" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 698;BA.debugLine="nCell.PaddingTop = Null";
Debug.JustUpdateDeviceLine();
_ncell.setField ("PaddingTop" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 699;BA.debugLine="nCell.PaddingBottom = Null";
Debug.JustUpdateDeviceLine();
_ncell.setField ("PaddingBottom" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 700;BA.debugLine="nCell.PaddingLeft = Null";
Debug.JustUpdateDeviceLine();
_ncell.setField ("PaddingLeft" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 701;BA.debugLine="nCell.PaddingRight = Null";
Debug.JustUpdateDeviceLine();
_ncell.setField ("PaddingRight" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 702;BA.debugLine="Return nCell";
Debug.JustUpdateDeviceLine();
if (true) return _ncell;
 BA.debugLineNum = 703;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createrow(RemoteObject __ref,RemoteObject _rows2add,RemoteObject _visibility,RemoteObject _themename,RemoteObject _classname) throws Exception{
try {
		Debug.PushSubsStack("CreateRow (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,656);
if (RapidSub.canDelegate("createrow")) { return __ref.runUserSub(false, "vmgrid","createrow", __ref, _rows2add, _visibility, _themename, _classname);}
RemoteObject _nr = RemoteObject.declareNull("b4j.example.vmgrid._gridrow");
Debug.locals.put("Rows2Add", _rows2add);
Debug.locals.put("Visibility", _visibility);
Debug.locals.put("ThemeName", _themename);
Debug.locals.put("ClassName", _classname);
 BA.debugLineNum = 656;BA.debugLine="private Sub CreateRow(Rows2Add As Int, Visibility";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 657;BA.debugLine="Dim nr As GridRow";
Debug.JustUpdateDeviceLine();
_nr = RemoteObject.createNew ("b4j.example.vmgrid._gridrow");Debug.locals.put("nr", _nr);
 BA.debugLineNum = 658;BA.debugLine="nr.Initialize";
Debug.JustUpdateDeviceLine();
_nr.runVoidMethod ("Initialize");
 BA.debugLineNum = 659;BA.debugLine="InitializeRow(nr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_initializerow" /*RemoteObject*/ ,(Object)(_nr));
 BA.debugLineNum = 660;BA.debugLine="nr.ThemeName = ThemeName";
Debug.JustUpdateDeviceLine();
_nr.setField ("ThemeName" /*RemoteObject*/ ,_themename);
 BA.debugLineNum = 661;BA.debugLine="nr.Visibility = Visibility";
Debug.JustUpdateDeviceLine();
_nr.setField ("Visibility" /*RemoteObject*/ ,_visibility);
 BA.debugLineNum = 662;BA.debugLine="nr.ClassName = ClassName";
Debug.JustUpdateDeviceLine();
_nr.setField ("ClassName" /*RemoteObject*/ ,_classname);
 BA.debugLineNum = 663;BA.debugLine="nr.Rows = Rows2Add";
Debug.JustUpdateDeviceLine();
_nr.setField ("Rows" /*RemoteObject*/ ,BA.NumberToString(_rows2add));
 BA.debugLineNum = 664;BA.debugLine="nr.MarginTop = Null";
Debug.JustUpdateDeviceLine();
_nr.setField ("MarginTop" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 665;BA.debugLine="nr.MarginBottom = Null";
Debug.JustUpdateDeviceLine();
_nr.setField ("MarginBottom" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 666;BA.debugLine="nr.MarginLeft = Null";
Debug.JustUpdateDeviceLine();
_nr.setField ("MarginLeft" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 667;BA.debugLine="nr.MarginRight = Null";
Debug.JustUpdateDeviceLine();
_nr.setField ("MarginRight" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 668;BA.debugLine="nr.PaddingTop = Null";
Debug.JustUpdateDeviceLine();
_nr.setField ("PaddingTop" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 669;BA.debugLine="nr.PaddingBottom = Null";
Debug.JustUpdateDeviceLine();
_nr.setField ("PaddingBottom" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 670;BA.debugLine="nr.PaddingLeft = Null";
Debug.JustUpdateDeviceLine();
_nr.setField ("PaddingLeft" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 671;BA.debugLine="nr.PaddingRight = Null";
Debug.JustUpdateDeviceLine();
_nr.setField ("PaddingRight" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 672;BA.debugLine="Return nr";
Debug.JustUpdateDeviceLine();
if (true) return _nr;
 BA.debugLineNum = 673;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cstr(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CStr (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "vmgrid","cstr", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 79;BA.debugLine="private Sub CStr(o As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_o,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED"))) { 
_o = RemoteObject.createImmutable((""));Debug.locals.put("o", _o);};
 BA.debugLineNum = 81;BA.debugLine="Return \"\" & o";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_o);
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
public static RemoteObject  _howmanyrows(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("HowManyRows (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,951);
if (RapidSub.canDelegate("howmanyrows")) { return __ref.runUserSub(false, "vmgrid","howmanyrows", __ref);}
 BA.debugLineNum = 951;BA.debugLine="Sub HowManyRows() As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 952;BA.debugLine="Return LastRow";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(true,"_lastrow" /*RemoteObject*/ );
 BA.debugLineNum = 953;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmgrid","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 42;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 44;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 45;BA.debugLine="Grid.Initialize(vue, ID).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 46;BA.debugLine="Rows.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rows" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="LastRow = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_lastrow" /*RemoteObject*/ ,BA.numberCast(int.class, 0));
 BA.debugLineNum = 48;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 49;BA.debugLine="RC.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rc" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 50;BA.debugLine="Columns.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 51;BA.debugLine="ShowID = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_showid" /*RemoteObject*/ ,vmgrid.__c.getField(true,"False"));
 BA.debugLineNum = 52;BA.debugLine="Components.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_components" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 53;BA.debugLine="rowClasses.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowclasses" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 54;BA.debugLine="rowStyles.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 55;BA.debugLine="attributes.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_attributes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 56;BA.debugLine="isBuilt = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isbuilt" /*RemoteObject*/ ,vmgrid.__c.getField(true,"False"));
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
public static RemoteObject  _initializecolumn(RemoteObject __ref,RemoteObject _thiscolumn) throws Exception{
try {
		Debug.PushSubsStack("InitializeColumn (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,631);
if (RapidSub.canDelegate("initializecolumn")) { return __ref.runUserSub(false, "vmgrid","initializecolumn", __ref, _thiscolumn);}
Debug.locals.put("thisColumn", _thiscolumn);
 BA.debugLineNum = 631;BA.debugLine="Sub InitializeColumn(thisColumn As GridColumn)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 632;BA.debugLine="thisColumn.Columns = \"1\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("Columns" /*RemoteObject*/ ,BA.ObjectToString("1"));
 BA.debugLineNum = 633;BA.debugLine="thisColumn.OffsetSmall = \"0\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("OffsetSmall" /*RemoteObject*/ ,BA.ObjectToString("0"));
 BA.debugLineNum = 634;BA.debugLine="thisColumn.OffsetMedium = \"0\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("OffsetMedium" /*RemoteObject*/ ,BA.ObjectToString("0"));
 BA.debugLineNum = 635;BA.debugLine="thisColumn.OffsetLarge = \"0\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("OffsetLarge" /*RemoteObject*/ ,BA.ObjectToString("0"));
 BA.debugLineNum = 636;BA.debugLine="thisColumn.SizeSmall = \"12\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("SizeSmall" /*RemoteObject*/ ,BA.ObjectToString("12"));
 BA.debugLineNum = 637;BA.debugLine="thisColumn.SizeMedium = \"12\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("SizeMedium" /*RemoteObject*/ ,BA.ObjectToString("12"));
 BA.debugLineNum = 638;BA.debugLine="thisColumn.SizeLarge = \"12\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("SizeLarge" /*RemoteObject*/ ,BA.ObjectToString("12"));
 BA.debugLineNum = 639;BA.debugLine="thisColumn.SizeXLarge = \"12\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("SizeXLarge" /*RemoteObject*/ ,BA.ObjectToString("12"));
 BA.debugLineNum = 640;BA.debugLine="thisColumn.MarginTop = Null";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("MarginTop" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 641;BA.debugLine="thisColumn.MarginBottom = Null";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("MarginBottom" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 642;BA.debugLine="thisColumn.MarginLeft = Null";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("MarginLeft" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 643;BA.debugLine="thisColumn.MarginRight = Null";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("MarginRight" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 644;BA.debugLine="thisColumn.PaddingTop = Null";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("PaddingTop" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 645;BA.debugLine="thisColumn.PaddingBottom = Null";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("PaddingBottom" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 646;BA.debugLine="thisColumn.PaddingLeft = Null";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("PaddingLeft" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 647;BA.debugLine="thisColumn.PaddingRight = Null";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("PaddingRight" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 648;BA.debugLine="thisColumn.ThemeName = \"\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("ThemeName" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 649;BA.debugLine="thisColumn.Visibility = \"\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("Visibility" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 650;BA.debugLine="thisColumn.ClassName = \"\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("ClassName" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 651;BA.debugLine="thisColumn.Row = \"0\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("Row" /*RemoteObject*/ ,BA.ObjectToString("0"));
 BA.debugLineNum = 652;BA.debugLine="thisColumn.Col = \"0\"";
Debug.JustUpdateDeviceLine();
_thiscolumn.setField ("Col" /*RemoteObject*/ ,BA.ObjectToString("0"));
 BA.debugLineNum = 653;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initializerow(RemoteObject __ref,RemoteObject _thisrow) throws Exception{
try {
		Debug.PushSubsStack("InitializeRow (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,423);
if (RapidSub.canDelegate("initializerow")) { return __ref.runUserSub(false, "vmgrid","initializerow", __ref, _thisrow);}
Debug.locals.put("thisRow", _thisrow);
 BA.debugLineNum = 423;BA.debugLine="private Sub InitializeRow(thisRow As GridRow)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 424;BA.debugLine="thisRow.Columns.Initialize";
Debug.JustUpdateDeviceLine();
_thisrow.getField(false,"Columns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 425;BA.debugLine="thisRow.Rows = 1";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("Rows" /*RemoteObject*/ ,BA.NumberToString(1));
 BA.debugLineNum = 426;BA.debugLine="thisRow.Visibility = \"\"";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("Visibility" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 427;BA.debugLine="thisRow.ThemeName = \"0\"";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("ThemeName" /*RemoteObject*/ ,BA.ObjectToString("0"));
 BA.debugLineNum = 428;BA.debugLine="thisRow.ClassName = \"\"";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("ClassName" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 429;BA.debugLine="thisRow.MarginTop = Null";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("MarginTop" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 430;BA.debugLine="thisRow.MarginBottom = Null";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("MarginBottom" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 431;BA.debugLine="thisRow.MarginLeft = Null";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("MarginLeft" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 432;BA.debugLine="thisRow.MarginRight = Null";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("MarginRight" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 433;BA.debugLine="thisRow.PaddingTop = Null";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("PaddingTop" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 434;BA.debugLine="thisRow.PaddingBottom = Null";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("PaddingBottom" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 435;BA.debugLine="thisRow.PaddingLeft = Null";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("PaddingLeft" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 436;BA.debugLine="thisRow.PaddingRight = Null";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("PaddingRight" /*RemoteObject*/ ,vmgrid.__c.getField(false,"Null"));
 BA.debugLineNum = 437;BA.debugLine="thisRow.Row = 0";
Debug.JustUpdateDeviceLine();
_thisrow.setField ("Row" /*RemoteObject*/ ,BA.NumberToString(0));
 BA.debugLineNum = 438;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _mapkeys2delim(RemoteObject __ref,RemoteObject _m,RemoteObject _delim) throws Exception{
try {
		Debug.PushSubsStack("MapKeys2Delim (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,706);
if (RapidSub.canDelegate("mapkeys2delim")) { return __ref.runUserSub(false, "vmgrid","mapkeys2delim", __ref, _m, _delim);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _ktot = RemoteObject.createImmutable(0);
RemoteObject _kcnt = RemoteObject.createImmutable(0);
RemoteObject _strkey = RemoteObject.createImmutable("");
Debug.locals.put("m", _m);
Debug.locals.put("delim", _delim);
 BA.debugLineNum = 706;BA.debugLine="private Sub MapKeys2Delim(m As Map, delim As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 707;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 708;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 709;BA.debugLine="Dim kTot As Int = m.Size - 1";
Debug.JustUpdateDeviceLine();
_ktot = RemoteObject.solve(new RemoteObject[] {_m.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("kTot", _ktot);Debug.locals.put("kTot", _ktot);
 BA.debugLineNum = 710;BA.debugLine="Dim kCnt As Int";
Debug.JustUpdateDeviceLine();
_kcnt = RemoteObject.createImmutable(0);Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 711;BA.debugLine="Dim strKey As String = m.getkeyat(0)";
Debug.JustUpdateDeviceLine();
_strkey = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("strKey", _strkey);Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 712;BA.debugLine="sb.Append(strKey)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_strkey));
 BA.debugLineNum = 713;BA.debugLine="For kCnt = 1 To kTot";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = _ktot.<Integer>get().intValue();
_kcnt = BA.numberCast(int.class, 1) ;
for (;(step7 > 0 && _kcnt.<Integer>get().intValue() <= limit7) || (step7 < 0 && _kcnt.<Integer>get().intValue() >= limit7) ;_kcnt = RemoteObject.createImmutable((int)(0 + _kcnt.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("kCnt", _kcnt);
 BA.debugLineNum = 714;BA.debugLine="Dim strKey As String = m.getkeyat(kCnt)";
Debug.JustUpdateDeviceLine();
_strkey = BA.ObjectToString(_m.runMethod(false,"GetKeyAt",(Object)(_kcnt)));Debug.locals.put("strKey", _strkey);Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 715;BA.debugLine="sb.Append(delim).append(strKey)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_delim)).runVoidMethod ("Append",(Object)(_strkey));
 }
}Debug.locals.put("kCnt", _kcnt);
;
 BA.debugLineNum = 717;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 718;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,603);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmgrid","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 603;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 604;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmgrid.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 605;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,599);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmgrid","render", __ref);}
 BA.debugLineNum = 599;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 600;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmgrid.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 601;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _replacerc(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _elhtml) throws Exception{
try {
		Debug.PushSubsStack("ReplaceRC (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,455);
if (RapidSub.canDelegate("replacerc")) { return __ref.runUserSub(false, "vmgrid","replacerc", __ref, _rowpos, _colpos, _elhtml);}
RemoteObject _cellkey = RemoteObject.createImmutable("");
RemoteObject _elbody = RemoteObject.declareNull("com.ab.banano.BANanoElement");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("elHTML", _elhtml);
 BA.debugLineNum = 455;BA.debugLine="Sub ReplaceRC(rowPos As Int, colPos As Int, elHTML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 456;BA.debugLine="Dim cellKey As String = $\"#${ID}r${rowPos}c${colP";
Debug.JustUpdateDeviceLine();
_cellkey = (RemoteObject.concat(RemoteObject.createImmutable("#"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowpos))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colpos))),RemoteObject.createImmutable("")));Debug.locals.put("cellKey", _cellkey);Debug.locals.put("cellKey", _cellkey);
 BA.debugLineNum = 457;BA.debugLine="Dim elBody As BANanoElement";
Debug.JustUpdateDeviceLine();
_elbody = RemoteObject.createNew ("com.ab.banano.BANanoElement");Debug.locals.put("elBody", _elbody);
 BA.debugLineNum = 458;BA.debugLine="elBody = BANano.GetElement(cellKey)";
Debug.JustUpdateDeviceLine();
_elbody = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(_cellkey));Debug.locals.put("elBody", _elbody);
 BA.debugLineNum = 459;BA.debugLine="If elBody <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_elbody)) { 
 BA.debugLineNum = 460;BA.debugLine="elBody.Empty";
Debug.JustUpdateDeviceLine();
_elbody.runVoidMethod ("Empty");
 BA.debugLineNum = 461;BA.debugLine="elBody.SetHTML(elHTML)";
Debug.JustUpdateDeviceLine();
_elbody.runVoidMethod ("SetHTML",(Object)(_elhtml));
 };
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _rowexists(RemoteObject __ref,RemoteObject _rowpos) throws Exception{
try {
		Debug.PushSubsStack("RowExists (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,939);
if (RapidSub.canDelegate("rowexists")) { return __ref.runUserSub(false, "vmgrid","rowexists", __ref, _rowpos);}
RemoteObject _rowcol = RemoteObject.createImmutable("");
Debug.locals.put("rowPos", _rowpos);
 BA.debugLineNum = 939;BA.debugLine="Sub RowExists(rowPos As Int) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 940;BA.debugLine="Dim rowcol As String = $\"${ID}r${rowPos}\"$";
Debug.JustUpdateDeviceLine();
_rowcol = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowpos))),RemoteObject.createImmutable("")));Debug.locals.put("rowcol", _rowcol);Debug.locals.put("rowcol", _rowcol);
 BA.debugLineNum = 941;BA.debugLine="Return Rows.ContainsKey(rowcol)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_rows" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowcol)));
 BA.debugLineNum = 942;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,583);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmgrid","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 583;BA.debugLine="Sub SetAttr(attr As Map) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 584;BA.debugLine="Grid.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 585;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 586;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _width,RemoteObject _color,RemoteObject _bstyle) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,501);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vmgrid","setborder", __ref, _rowpos, _colpos, _width, _color, _bstyle);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("width", _width);
Debug.locals.put("color", _color);
Debug.locals.put("bstyle", _bstyle);
 BA.debugLineNum = 501;BA.debugLine="Sub SetBorder(rowPos As Int, colPos As Int, width";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 502;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 503;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 504;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 505;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 507;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 508;BA.debugLine="rowc = rowStyles.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 510;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 511;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 513;BA.debugLine="rowc.Put(\"border-style\", bstyle)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border-style"))),(Object)((_bstyle)));
 BA.debugLineNum = 514;BA.debugLine="rowc.Put(\"border-width\", width)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border-width"))),(Object)((_width)));
 BA.debugLineNum = 515;BA.debugLine="rowc.Put(\"border-color\", color)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border-color"))),(Object)((_color)));
 BA.debugLineNum = 516;BA.debugLine="rowStyles.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
 BA.debugLineNum = 517;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 518;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetClass (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("setclass")) { return __ref.runUserSub(false, "vmgrid","setclass", __ref, _rowpos, _colpos, _classname);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("className", _classname);
 BA.debugLineNum = 85;BA.debugLine="Sub SetClass(rowPos As Int, colPos As Int, classNa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 88;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 89;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 90;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 92;BA.debugLine="If rowClasses.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rowclasses" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 93;BA.debugLine="rowc = rowClasses.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_rowclasses" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 95;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 96;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 98;BA.debugLine="rowc.Put(className,className)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)((_classname)),(Object)((_classname)));
 BA.debugLineNum = 99;BA.debugLine="rowClasses.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowclasses" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
 BA.debugLineNum = 100;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,588);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmgrid","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 588;BA.debugLine="Sub SetDisabled(b As Boolean) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 589;BA.debugLine="Grid.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 590;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 591;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setgridborder(RemoteObject __ref,RemoteObject _width,RemoteObject _color,RemoteObject _bstyle) throws Exception{
try {
		Debug.PushSubsStack("SetGridBorder (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,484);
if (RapidSub.canDelegate("setgridborder")) { return __ref.runUserSub(false, "vmgrid","setgridborder", __ref, _width, _color, _bstyle);}
Debug.locals.put("width", _width);
Debug.locals.put("color", _color);
Debug.locals.put("bstyle", _bstyle);
 BA.debugLineNum = 484;BA.debugLine="Sub SetGridBorder(width As String, color As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 485;BA.debugLine="Grid.SetBorder(width, color, bstyle)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setborder" /*RemoteObject*/ ,(Object)(_width),(Object)(_color),(Object)(_bstyle));
 BA.debugLineNum = 486;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 487;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setgridstyle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetGridStyle (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,490);
if (RapidSub.canDelegate("setgridstyle")) { return __ref.runUserSub(false, "vmgrid","setgridstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 490;BA.debugLine="Sub SetGridStyle(m As Map) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 491;BA.debugLine="Grid.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 492;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 493;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetKey (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,566);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmgrid","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 566;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 567;BA.debugLine="Grid.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
 BA.debugLineNum = 568;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 569;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmargins(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _mt,RemoteObject _mb,RemoteObject _ml,RemoteObject _mr) throws Exception{
try {
		Debug.PushSubsStack("SetMargins (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,520);
if (RapidSub.canDelegate("setmargins")) { return __ref.runUserSub(false, "vmgrid","setmargins", __ref, _rowpos, _colpos, _mt, _mb, _ml, _mr);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("mt", _mt);
Debug.locals.put("mb", _mb);
Debug.locals.put("ml", _ml);
Debug.locals.put("mr", _mr);
 BA.debugLineNum = 520;BA.debugLine="Sub SetMargins(rowPos As Int, colPos As Int, mt As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 521;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 522;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 523;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 524;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 526;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 527;BA.debugLine="rowc = rowStyles.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 529;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 530;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 532;BA.debugLine="If mt <> Null Then rowc.Put(\"margin-top\", mt)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_mt)) { 
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("margin-top"))),(Object)(_mt));};
 BA.debugLineNum = 533;BA.debugLine="If mb <> Null Then rowc.Put(\"margin-bottom\", mb)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_mb)) { 
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("margin-bottom"))),(Object)(_mb));};
 BA.debugLineNum = 534;BA.debugLine="If ml <> Null Then rowc.Put(\"margin-left\", ml)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_ml)) { 
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("margin-left"))),(Object)(_ml));};
 BA.debugLineNum = 535;BA.debugLine="If mr <> Null Then rowc.Put(\"margin-right\", mr)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_mr)) { 
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("margin-right"))),(Object)(_mr));};
 BA.debugLineNum = 536;BA.debugLine="rowStyles.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
 BA.debugLineNum = 537;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 538;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclick(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("SetOnClick (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vmgrid","setonclick", __ref, _rowpos, _colpos);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("rowpos", _rowpos);
Debug.locals.put("colpos", _colpos);
 BA.debugLineNum = 104;BA.debugLine="Sub SetOnClick(rowpos As Int, colpos As Int) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 106;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowpos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 107;BA.debugLine="If colpos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 108;BA.debugLine="rowKey = $\"${ID}r${CStr(rowpos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 110;BA.debugLine="Dim methodName As String = $\"${rowKey}_click\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowkey))),RemoteObject.createImmutable("_click")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 111;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmgrid.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmgrid.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 112;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 113;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 115;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 116;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 117;BA.debugLine="rowc = attributes.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 119;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 120;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 122;BA.debugLine="rowc.Put(\"v-on:click\",methodName)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("v-on:click"))),(Object)((_methodname)));
 BA.debugLineNum = 123;BA.debugLine="attributes.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_attributes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
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
public static RemoteObject  _setondragend(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragEnd (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("setondragend")) { return __ref.runUserSub(false, "vmgrid","setondragend", __ref, _rowpos, _colpos);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 199;BA.debugLine="Sub SetOnDragEnd(rowPos As Int, colPos As Int) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 200;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 201;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 202;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 203;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 205;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragend\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowkey))),RemoteObject.createImmutable("_dragend")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 206;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmgrid.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmgrid.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 207;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 208;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 210;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 212;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 213;BA.debugLine="rowc = attributes.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 215;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 216;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 218;BA.debugLine="rowc.Put(\"v-on:dragend\",methodName)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("v-on:dragend"))),(Object)((_methodname)));
 BA.debugLineNum = 219;BA.debugLine="attributes.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_attributes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
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
public static RemoteObject  _setondragenter(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragEnter (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("setondragenter")) { return __ref.runUserSub(false, "vmgrid","setondragenter", __ref, _rowpos, _colpos);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 223;BA.debugLine="Sub SetOnDragEnter(rowPos As Int, colPos As Int) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 225;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 226;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 227;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 229;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragenter\"";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowkey))),RemoteObject.createImmutable("_dragenter")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 230;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmgrid.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmgrid.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 231;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 232;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 234;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 236;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 237;BA.debugLine="rowc = attributes.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 239;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 240;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 242;BA.debugLine="rowc.Put(\"v-on:dragenter\",methodName)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("v-on:dragenter"))),(Object)((_methodname)));
 BA.debugLineNum = 243;BA.debugLine="attributes.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_attributes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
 BA.debugLineNum = 244;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondragover(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragOver (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("setondragover")) { return __ref.runUserSub(false, "vmgrid","setondragover", __ref, _rowpos, _colpos);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 151;BA.debugLine="Sub SetOnDragOver(rowPos As Int, colPos As Int) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 153;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 154;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 155;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 157;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragover\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowkey))),RemoteObject.createImmutable("_dragover")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 158;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmgrid.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmgrid.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 159;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 160;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 162;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 164;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 165;BA.debugLine="rowc = attributes.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 167;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 168;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 170;BA.debugLine="rowc.Put(\"v-on:dragover\",methodName)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("v-on:dragover"))),(Object)((_methodname)));
 BA.debugLineNum = 171;BA.debugLine="attributes.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_attributes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
 BA.debugLineNum = 172;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondragstart(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragStart (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("setondragstart")) { return __ref.runUserSub(false, "vmgrid","setondragstart", __ref, _rowpos, _colpos);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 175;BA.debugLine="Sub SetOnDragStart(rowPos As Int, colPos As Int) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 177;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 178;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 179;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 181;BA.debugLine="Dim methodName As String = $\"${rowKey}_dragstart\"";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowkey))),RemoteObject.createImmutable("_dragstart")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 182;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmgrid.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmgrid.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 183;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 184;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 186;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 188;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 189;BA.debugLine="rowc = attributes.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 191;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 192;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 194;BA.debugLine="rowc.Put(\"v-on:dragstart\",methodName)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("v-on:dragstart"))),(Object)((_methodname)));
 BA.debugLineNum = 195;BA.debugLine="attributes.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_attributes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
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
public static RemoteObject  _setondrop(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("SetOnDrop (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("setondrop")) { return __ref.runUserSub(false, "vmgrid","setondrop", __ref, _rowpos, _colpos);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 248;BA.debugLine="Sub SetOnDrop(rowPos As Int, colPos As Int) As VMG";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 249;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 250;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 251;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 252;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 254;BA.debugLine="Dim methodName As String = $\"${rowKey}_drop\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowkey))),RemoteObject.createImmutable("_drop")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 255;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmgrid.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmgrid.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 256;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 257;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 259;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 261;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 262;BA.debugLine="rowc = attributes.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 264;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 265;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 267;BA.debugLine="rowc.Put(\"v-on:drop\",methodName)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("v-on:drop"))),(Object)((_methodname)));
 BA.debugLineNum = 268;BA.debugLine="attributes.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_attributes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
 BA.debugLineNum = 269;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setontouchstart(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("SetOnTouchStart (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("setontouchstart")) { return __ref.runUserSub(false, "vmgrid","setontouchstart", __ref, _rowpos, _colpos);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("rowpos", _rowpos);
Debug.locals.put("colpos", _colpos);
 BA.debugLineNum = 128;BA.debugLine="Sub SetOnTouchStart(rowpos As Int, colpos As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 130;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowpos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 131;BA.debugLine="If colpos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 132;BA.debugLine="rowKey = $\"${ID}r${CStr(rowpos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 134;BA.debugLine="Dim methodName As String = $\"${rowKey}_touchstart";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_rowkey))),RemoteObject.createImmutable("_touchstart")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 135;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmgrid.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmgrid.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 136;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 137;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 139;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 140;BA.debugLine="If attributes.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 141;BA.debugLine="rowc = attributes.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_attributes" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 143;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 144;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 146;BA.debugLine="rowc.Put(\"v-on:touchstart\",methodName)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("v-on:touchstart"))),(Object)((_methodname)));
 BA.debugLineNum = 147;BA.debugLine="attributes.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_attributes" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _pt,RemoteObject _pb,RemoteObject _pl,RemoteObject _pr) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,540);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmgrid","setpadding", __ref, _rowpos, _colpos, _pt, _pb, _pl, _pr);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("pt", _pt);
Debug.locals.put("pb", _pb);
Debug.locals.put("pl", _pl);
Debug.locals.put("pr", _pr);
 BA.debugLineNum = 540;BA.debugLine="Sub SetPadding(rowPos As Int, colPos As Int, pt As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 541;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 542;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 543;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 544;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 546;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 547;BA.debugLine="rowc = rowStyles.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 549;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 550;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 552;BA.debugLine="If pt <> Null Then rowc.Put(\"padding-top\", pt)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_pt)) { 
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("padding-top"))),(Object)(_pt));};
 BA.debugLineNum = 553;BA.debugLine="If pb <> Null Then rowc.Put(\"padding-bottom\", pb)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_pb)) { 
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("padding-bottom"))),(Object)(_pb));};
 BA.debugLineNum = 554;BA.debugLine="If pl <> Null Then rowc.Put(\"padding-left\", pl)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_pl)) { 
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("padding-left"))),(Object)(_pl));};
 BA.debugLineNum = 555;BA.debugLine="If pr <> Null Then rowc.Put(\"padding-right\", pr)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_pr)) { 
_rowc.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("padding-right"))),(Object)(_pr));};
 BA.debugLineNum = 556;BA.debugLine="rowStyles.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
 BA.debugLineNum = 557;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 558;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetScrollBar (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("setscrollbar")) { return __ref.runUserSub(false, "vmgrid","setscrollbar", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 60;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="Grid.SetScrollBar(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setscrollbar" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 62;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _rowpos,RemoteObject _colpos,RemoteObject _prop,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmgrid","setstyle", __ref, _rowpos, _colpos, _prop, _value);}
RemoteObject _rowc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _rowkey = RemoteObject.createImmutable("");
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
Debug.locals.put("prop", _prop);
Debug.locals.put("value", _value);
 BA.debugLineNum = 466;BA.debugLine="Sub SetStyle(rowPos As Int, colPos As Int, prop As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 467;BA.debugLine="Dim rowc As Map";
Debug.JustUpdateDeviceLine();
_rowc = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("rowc", _rowc);
 BA.debugLineNum = 468;BA.debugLine="Dim rowKey As String = $\"${ID}r${CStr(rowPos)}c${";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("c"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_colpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);Debug.locals.put("rowKey", _rowkey);
 BA.debugLineNum = 469;BA.debugLine="If colPos = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_colpos,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 470;BA.debugLine="rowKey = $\"${ID}r${CStr(rowPos)}\"$";
Debug.JustUpdateDeviceLine();
_rowkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("r"),vmgrid.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgrid.class, "_cstr" /*RemoteObject*/ ,(Object)((_rowpos)))))),RemoteObject.createImmutable("")));Debug.locals.put("rowKey", _rowkey);
 };
 BA.debugLineNum = 472;BA.debugLine="If rowStyles.ContainsKey(rowKey) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_rowkey))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 473;BA.debugLine="rowc = rowStyles.Get(rowKey)";
Debug.JustUpdateDeviceLine();
_rowc.setObject(__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_rowkey))));
 }else {
 BA.debugLineNum = 475;BA.debugLine="rowc.Initialize";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Initialize");
 BA.debugLineNum = 476;BA.debugLine="rowc.clear";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Clear");
 };
 BA.debugLineNum = 478;BA.debugLine="rowc.Put(prop,value)";
Debug.JustUpdateDeviceLine();
_rowc.runVoidMethod ("Put",(Object)((_prop)),(Object)((_value)));
 BA.debugLineNum = 479;BA.debugLine="rowStyles.Put(rowKey,rowc)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rowstyles" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_rowkey)),(Object)((_rowc.getObject())));
 BA.debugLineNum = 480;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 481;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmgrid","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 561;BA.debugLine="Sub SetVIf(vif As Object) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 562;BA.debugLine="Grid.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 563;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 564;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,571);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmgrid","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 571;BA.debugLine="Sub SetVShow(vif As Object) As VMGrid";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 572;BA.debugLine="Grid.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 573;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmgrid) ","vmgrid",62,__ref.getField(false, "ba"),__ref,418);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmgrid","tostring", __ref);}
 BA.debugLineNum = 418;BA.debugLine="Sub ToString() As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 419;BA.debugLine="Build";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgrid.class, "_build" /*RemoteObject*/ );
 BA.debugLineNum = 420;BA.debugLine="Return Grid.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_grid" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 421;BA.debugLine="End Sub";
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