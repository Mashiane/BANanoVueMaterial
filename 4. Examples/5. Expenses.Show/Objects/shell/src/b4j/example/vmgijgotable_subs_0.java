package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmgijgotable_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmgijgotable","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 134;BA.debugLine="Sub AddClass(c As String) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="Table.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addcolumn(RemoteObject __ref,RemoteObject _colname,RemoteObject _coltitle) throws Exception{
try {
		Debug.PushSubsStack("AddColumn (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("addcolumn")) { return __ref.runUserSub(false, "vmgijgotable","addcolumn", __ref, _colname, _coltitle);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colTitle", _coltitle);
 BA.debugLineNum = 470;BA.debugLine="Sub AddColumn(colName As String, colTitle As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 472;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 473;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 474;BA.debugLine="Dim col As Map = CreateMap(\"field\":colName,\"title";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col = vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("field")),(_colname),RemoteObject.createImmutable(("title")),(_coltitle)}));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 475;BA.debugLine="col.Put(\"type\", COLUMN_TEXT)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((__ref.getField(true,"_column_text" /*RemoteObject*/ ))));
 BA.debugLineNum = 480;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 BA.debugLineNum = 481;BA.debugLine="SetColumnSortable(colName, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnsortable" /*RemoteObject*/ ,(Object)(_colname),(Object)(vmgijgotable.__c.getField(true,"True")));
 BA.debugLineNum = 482;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 483;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumn1(RemoteObject __ref,RemoteObject _colname,RemoteObject _coltitle,RemoteObject _coltype,RemoteObject _colwidth,RemoteObject _colsortable,RemoteObject _colalign) throws Exception{
try {
		Debug.PushSubsStack("AddColumn1 (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,487);
if (RapidSub.canDelegate("addcolumn1")) { return __ref.runUserSub(false, "vmgijgotable","addcolumn1", __ref, _colname, _coltitle, _coltype, _colwidth, _colsortable, _colalign);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _events = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colTitle", _coltitle);
Debug.locals.put("colType", _coltype);
Debug.locals.put("colWidth", _colwidth);
Debug.locals.put("colSortable", _colsortable);
Debug.locals.put("colAlign", _colalign);
 BA.debugLineNum = 487;BA.debugLine="Sub AddColumn1(colName As String, colTitle As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 489;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 490;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 491;BA.debugLine="Dim col As Map = CreateMap(\"field\":colName,\"title";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col = vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("field")),(_colname),RemoteObject.createImmutable(("title")),(_coltitle)}));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 492;BA.debugLine="If colWidth > 0 Then col.Put(\"width\", colWidth)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_colwidth,BA.numberCast(double.class, 0))) { 
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((_colwidth)));};
 BA.debugLineNum = 493;BA.debugLine="If colSortable Then	col.Put(\"sortable\", colSortab";
Debug.JustUpdateDeviceLine();
if (_colsortable.<Boolean>get().booleanValue()) { 
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sortable"))),(Object)((_colsortable)));};
 BA.debugLineNum = 494;BA.debugLine="If colType <> COLUMN_NONE Then col.Put(\"type\", co";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_coltype,__ref.getField(true,"_column_none" /*RemoteObject*/ ))) { 
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((_coltype)));};
 BA.debugLineNum = 495;BA.debugLine="Select Case colAlign";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_colalign,__ref.getField(true,"_align_center" /*RemoteObject*/ ),__ref.getField(true,"_align_right" /*RemoteObject*/ ))) {
case 0: 
case 1: {
 BA.debugLineNum = 497;BA.debugLine="col.Put(\"align\", colAlign)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("align"))),(Object)((_colalign)));
 break; }
}
;
 BA.debugLineNum = 499;BA.debugLine="col.Put(\"filterable\", True)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("filterable"))),(Object)((vmgijgotable.__c.getField(true,"True"))));
 BA.debugLineNum = 500;BA.debugLine="Dim events As Map";
Debug.JustUpdateDeviceLine();
_events = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("events", _events);
 BA.debugLineNum = 501;BA.debugLine="events.Initialize";
Debug.JustUpdateDeviceLine();
_events.runVoidMethod ("Initialize");
 BA.debugLineNum = 502;BA.debugLine="col.Put(\"events\", events)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("events"))),(Object)((_events.getObject())));
 BA.debugLineNum = 503;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 BA.debugLineNum = 504;BA.debugLine="SetColumnType(colName, colType)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_colname),(Object)(_coltype));
 BA.debugLineNum = 505;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 506;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcolumns(RemoteObject __ref,RemoteObject _flds) throws Exception{
try {
		Debug.PushSubsStack("AddColumns (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,573);
if (RapidSub.canDelegate("addcolumns")) { return __ref.runUserSub(false, "vmgijgotable","addcolumns", __ref, _flds);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
Debug.locals.put("flds", _flds);
 BA.debugLineNum = 573;BA.debugLine="Sub AddColumns(flds As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 574;BA.debugLine="For Each k As String In flds.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _flds.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 575;BA.debugLine="Dim v As String = flds.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_flds.runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 576;BA.debugLine="AddColumn(k, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(_k),(Object)(_v));
 BA.debugLineNum = 577;BA.debugLine="SetColumnSortable(k, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnsortable" /*RemoteObject*/ ,(Object)(_k),(Object)(vmgijgotable.__c.getField(true,"True")));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 579;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddelete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddDelete (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,557);
if (RapidSub.canDelegate("adddelete")) { return __ref.runUserSub(false, "vmgijgotable","adddelete", __ref);}
 BA.debugLineNum = 557;BA.debugLine="Sub AddDelete";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 558;BA.debugLine="AddIconDelete(\"delete\", \"Delete\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addicondelete" /*RemoteObject*/ ,(Object)(BA.ObjectToString("delete")),(Object)(RemoteObject.createImmutable("Delete")));
 BA.debugLineNum = 559;BA.debugLine="SetColumnClickEvent(\"delete\", True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnclickevent" /*RemoteObject*/ ,(Object)(BA.ObjectToString("delete")),(Object)(vmgijgotable.__c.getField(true,"True")));
 BA.debugLineNum = 560;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddownload(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddDownload (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,552);
if (RapidSub.canDelegate("adddownload")) { return __ref.runUserSub(false, "vmgijgotable","adddownload", __ref);}
 BA.debugLineNum = 552;BA.debugLine="Sub AddDownload";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 553;BA.debugLine="AddIcon(\"download\",\"Get\",\"attach_file\",\"80\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addicon" /*RemoteObject*/ ,(Object)(BA.ObjectToString("download")),(Object)(BA.ObjectToString("Get")),(Object)(BA.ObjectToString("attach_file")),(Object)(RemoteObject.createImmutable("80")));
 BA.debugLineNum = 554;BA.debugLine="SetColumnClickEvent(\"download\", True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnclickevent" /*RemoteObject*/ ,(Object)(BA.ObjectToString("download")),(Object)(vmgijgotable.__c.getField(true,"True")));
 BA.debugLineNum = 555;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addedit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddEdit (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,562);
if (RapidSub.canDelegate("addedit")) { return __ref.runUserSub(false, "vmgijgotable","addedit", __ref);}
 BA.debugLineNum = 562;BA.debugLine="Sub AddEdit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 563;BA.debugLine="AddIconEdit(\"edit\", \"Edit\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addiconedit" /*RemoteObject*/ ,(Object)(BA.ObjectToString("edit")),(Object)(RemoteObject.createImmutable("Edit")));
 BA.debugLineNum = 564;BA.debugLine="SetColumnClickEvent(\"edit\", True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnclickevent" /*RemoteObject*/ ,(Object)(BA.ObjectToString("edit")),(Object)(vmgijgotable.__c.getField(true,"True")));
 BA.debugLineNum = 565;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addedittrash(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddEditTrash (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,545);
if (RapidSub.canDelegate("addedittrash")) { return __ref.runUserSub(false, "vmgijgotable","addedittrash", __ref);}
 BA.debugLineNum = 545;BA.debugLine="Sub AddEditTrash";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 546;BA.debugLine="AddIconEdit(\"edit\", \"Edit\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addiconedit" /*RemoteObject*/ ,(Object)(BA.ObjectToString("edit")),(Object)(RemoteObject.createImmutable("Edit")));
 BA.debugLineNum = 547;BA.debugLine="SetColumnClickEvent(\"edit\", True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnclickevent" /*RemoteObject*/ ,(Object)(BA.ObjectToString("edit")),(Object)(vmgijgotable.__c.getField(true,"True")));
 BA.debugLineNum = 548;BA.debugLine="AddIconDelete(\"delete\", \"Delete\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addicondelete" /*RemoteObject*/ ,(Object)(BA.ObjectToString("delete")),(Object)(RemoteObject.createImmutable("Delete")));
 BA.debugLineNum = 549;BA.debugLine="SetColumnClickEvent(\"delete\", True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnclickevent" /*RemoteObject*/ ,(Object)(BA.ObjectToString("delete")),(Object)(vmgijgotable.__c.getField(true,"True")));
 BA.debugLineNum = 550;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addicon(RemoteObject __ref,RemoteObject _colfield,RemoteObject _coltitle,RemoteObject _colicon,RemoteObject _colwidth) throws Exception{
try {
		Debug.PushSubsStack("AddIcon (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,509);
if (RapidSub.canDelegate("addicon")) { return __ref.runUserSub(false, "vmgijgotable","addicon", __ref, _colfield, _coltitle, _colicon, _colwidth);}
RemoteObject _sicon = RemoteObject.createImmutable("");
Debug.locals.put("colField", _colfield);
Debug.locals.put("colTitle", _coltitle);
Debug.locals.put("colIcon", _colicon);
Debug.locals.put("colWidth", _colwidth);
 BA.debugLineNum = 509;BA.debugLine="Sub AddIcon(colField As String, colTitle As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 510;BA.debugLine="Dim sIcon As String";
Debug.JustUpdateDeviceLine();
_sicon = RemoteObject.createImmutable("");Debug.locals.put("sIcon", _sicon);
 BA.debugLineNum = 511;BA.debugLine="Select Case IconsLibrary";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ),BA.ObjectToString("materialicons"),BA.ObjectToString("fontawesome"))) {
case 0: {
 BA.debugLineNum = 513;BA.debugLine="sIcon = $\"<span class=\"material-icons gj-cursor";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<span class=\"material-icons gj-cursor-pointer\">"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colicon))),RemoteObject.createImmutable("</span>")));Debug.locals.put("sIcon", _sicon);
 break; }
case 1: {
 BA.debugLineNum = 515;BA.debugLine="sIcon = $\"<span class=\"${colIcon} gj-cursor-poi";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<span class=\""),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colicon))),RemoteObject.createImmutable(" gj-cursor-pointer\"></span>")));Debug.locals.put("sIcon", _sicon);
 break; }
}
;
 BA.debugLineNum = 517;BA.debugLine="AddColumn(colField,colTitle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_coltitle));
 BA.debugLineNum = 518;BA.debugLine="SetColumnTmpl(colField,sIcon)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntmpl" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_sicon));
 BA.debugLineNum = 519;BA.debugLine="SetColumnFilterable(colField,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnfilterable" /*RemoteObject*/ ,(Object)(_colfield),(Object)(vmgijgotable.__c.getField(true,"False")));
 BA.debugLineNum = 520;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_colfield),(Object)(__ref.getField(true,"_column_none" /*RemoteObject*/ )));
 BA.debugLineNum = 521;BA.debugLine="SetColumnWidth(colField, colWidth)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnwidth" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_colwidth));
 BA.debugLineNum = 522;BA.debugLine="SetColumnSortable(colField, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnsortable" /*RemoteObject*/ ,(Object)(_colfield),(Object)(vmgijgotable.__c.getField(true,"False")));
 BA.debugLineNum = 523;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(_colfield),(Object)(__ref.getField(true,"_align_center" /*RemoteObject*/ )));
 BA.debugLineNum = 524;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addicondelete(RemoteObject __ref,RemoteObject _colfield,RemoteObject _coltitle) throws Exception{
try {
		Debug.PushSubsStack("AddIconDelete (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,582);
if (RapidSub.canDelegate("addicondelete")) { return __ref.runUserSub(false, "vmgijgotable","addicondelete", __ref, _colfield, _coltitle);}
RemoteObject _delicon = RemoteObject.createImmutable("");
Debug.locals.put("colField", _colfield);
Debug.locals.put("colTitle", _coltitle);
 BA.debugLineNum = 582;BA.debugLine="Sub AddIconDelete(colField As String, colTitle As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 583;BA.debugLine="Dim DelIcon As String";
Debug.JustUpdateDeviceLine();
_delicon = RemoteObject.createImmutable("");Debug.locals.put("DelIcon", _delicon);
 BA.debugLineNum = 584;BA.debugLine="Select Case IconsLibrary";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ),BA.ObjectToString("materialicons"),BA.ObjectToString("fontawesome"))) {
case 0: {
 BA.debugLineNum = 586;BA.debugLine="DelIcon = $\"<span class=\"material-icons gj-curs";
Debug.JustUpdateDeviceLine();
_delicon = (RemoteObject.createImmutable("<span class=\"material-icons gj-cursor-pointer\">delete</span>"));Debug.locals.put("DelIcon", _delicon);
 break; }
case 1: {
 BA.debugLineNum = 588;BA.debugLine="DelIcon = $\"<span class=\"fa fa-remove gj-cursor";
Debug.JustUpdateDeviceLine();
_delicon = (RemoteObject.createImmutable("<span class=\"fa fa-remove gj-cursor-pointer\"></span>"));Debug.locals.put("DelIcon", _delicon);
 break; }
}
;
 BA.debugLineNum = 590;BA.debugLine="AddColumn(colField,colTitle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_coltitle));
 BA.debugLineNum = 591;BA.debugLine="SetColumnTmpl(colField,DelIcon)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntmpl" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_delicon));
 BA.debugLineNum = 592;BA.debugLine="SetColumnFilterable(colField,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnfilterable" /*RemoteObject*/ ,(Object)(_colfield),(Object)(vmgijgotable.__c.getField(true,"False")));
 BA.debugLineNum = 593;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_colfield),(Object)(__ref.getField(true,"_column_none" /*RemoteObject*/ )));
 BA.debugLineNum = 594;BA.debugLine="SetColumnWidth(colField, \"80\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnwidth" /*RemoteObject*/ ,(Object)(_colfield),(Object)(RemoteObject.createImmutable("80")));
 BA.debugLineNum = 595;BA.debugLine="SetColumnSortable(colField, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnsortable" /*RemoteObject*/ ,(Object)(_colfield),(Object)(vmgijgotable.__c.getField(true,"False")));
 BA.debugLineNum = 596;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(_colfield),(Object)(__ref.getField(true,"_align_center" /*RemoteObject*/ )));
 BA.debugLineNum = 597;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addiconedit(RemoteObject __ref,RemoteObject _colfield,RemoteObject _coltitle) throws Exception{
try {
		Debug.PushSubsStack("AddIconEdit (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,527);
if (RapidSub.canDelegate("addiconedit")) { return __ref.runUserSub(false, "vmgijgotable","addiconedit", __ref, _colfield, _coltitle);}
RemoteObject _editicon = RemoteObject.createImmutable("");
Debug.locals.put("colField", _colfield);
Debug.locals.put("colTitle", _coltitle);
 BA.debugLineNum = 527;BA.debugLine="Sub AddIconEdit(colField As String, colTitle As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 528;BA.debugLine="Dim EditIcon As String";
Debug.JustUpdateDeviceLine();
_editicon = RemoteObject.createImmutable("");Debug.locals.put("EditIcon", _editicon);
 BA.debugLineNum = 529;BA.debugLine="Select Case IconsLibrary";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ),BA.ObjectToString("materialicons"),BA.ObjectToString("fontawesome"))) {
case 0: {
 BA.debugLineNum = 531;BA.debugLine="EditIcon = $\"<span class=\"material-icons gj-cur";
Debug.JustUpdateDeviceLine();
_editicon = (RemoteObject.createImmutable("<span class=\"material-icons gj-cursor-pointer\">edit</span>"));Debug.locals.put("EditIcon", _editicon);
 break; }
case 1: {
 BA.debugLineNum = 533;BA.debugLine="EditIcon = $\"<span class=\"fa fa-pencil gj-curso";
Debug.JustUpdateDeviceLine();
_editicon = (RemoteObject.createImmutable("<span class=\"fa fa-pencil gj-cursor-pointer\"></span>"));Debug.locals.put("EditIcon", _editicon);
 break; }
}
;
 BA.debugLineNum = 535;BA.debugLine="AddColumn(colField,colTitle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_coltitle));
 BA.debugLineNum = 536;BA.debugLine="SetColumnTmpl(colField,EditIcon)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntmpl" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_editicon));
 BA.debugLineNum = 537;BA.debugLine="SetColumnFilterable(colField,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnfilterable" /*RemoteObject*/ ,(Object)(_colfield),(Object)(vmgijgotable.__c.getField(true,"False")));
 BA.debugLineNum = 538;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_colfield),(Object)(__ref.getField(true,"_column_none" /*RemoteObject*/ )));
 BA.debugLineNum = 539;BA.debugLine="SetColumnWidth(colField, \"80\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnwidth" /*RemoteObject*/ ,(Object)(_colfield),(Object)(RemoteObject.createImmutable("80")));
 BA.debugLineNum = 540;BA.debugLine="SetColumnSortable(colField, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnsortable" /*RemoteObject*/ ,(Object)(_colfield),(Object)(vmgijgotable.__c.getField(true,"False")));
 BA.debugLineNum = 541;BA.debugLine="SetColumnAlignment(colField, ALIGN_CENTER)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(_colfield),(Object)(__ref.getField(true,"_align_center" /*RemoteObject*/ )));
 BA.debugLineNum = 542;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addparamater(RemoteObject __ref,RemoteObject _paramname,RemoteObject _paramvalue) throws Exception{
try {
		Debug.PushSubsStack("AddParamater (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("addparamater")) { return __ref.runUserSub(false, "vmgijgotable","addparamater", __ref, _paramname, _paramvalue);}
Debug.locals.put("paramName", _paramname);
Debug.locals.put("paramValue", _paramvalue);
 BA.debugLineNum = 159;BA.debugLine="Sub AddParamater(paramName As String, paramValue A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="params.Put(paramName,paramValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_params" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_paramname)),(Object)((_paramvalue)));
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addprint(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddPrint (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,567);
if (RapidSub.canDelegate("addprint")) { return __ref.runUserSub(false, "vmgijgotable","addprint", __ref);}
 BA.debugLineNum = 567;BA.debugLine="Sub AddPrint";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 568;BA.debugLine="AddIcon(\"print\", \"Print\", \"print\", 80)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addicon" /*RemoteObject*/ ,(Object)(BA.ObjectToString("print")),(Object)(BA.ObjectToString("Print")),(Object)(BA.ObjectToString("print")),(Object)(BA.NumberToString(80)));
 BA.debugLineNum = 569;BA.debugLine="SetColumnClickEvent(\"print\", True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnclickevent" /*RemoteObject*/ ,(Object)(BA.ObjectToString("print")),(Object)(vmgijgotable.__c.getField(true,"True")));
 BA.debugLineNum = 570;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addrow(RemoteObject __ref,RemoteObject _rowdata) throws Exception{
try {
		Debug.PushSubsStack("AddRow (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1000);
if (RapidSub.canDelegate("addrow")) { return __ref.runUserSub(false, "vmgijgotable","addrow", __ref, _rowdata);}
Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 1000;BA.debugLine="Sub AddRow(rowData As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1001;BA.debugLine="If grid = Null Then Refresh";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",__ref.getField(false,"_grid" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_refresh" /*RemoteObject*/ );};
 BA.debugLineNum = 1002;BA.debugLine="grid.RunMethod(\"addRow\", Array(rowData))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("addRow")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_rowdata.getObject())}))));
 BA.debugLineNum = 1003;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtemplate(RemoteObject __ref,RemoteObject _colfield,RemoteObject _coltitle,RemoteObject _coltemplate,RemoteObject _colwidth,RemoteObject _colsortable,RemoteObject _colalign) throws Exception{
try {
		Debug.PushSubsStack("AddTemplate (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,601);
if (RapidSub.canDelegate("addtemplate")) { return __ref.runUserSub(false, "vmgijgotable","addtemplate", __ref, _colfield, _coltitle, _coltemplate, _colwidth, _colsortable, _colalign);}
Debug.locals.put("colField", _colfield);
Debug.locals.put("colTitle", _coltitle);
Debug.locals.put("colTemplate", _coltemplate);
Debug.locals.put("colWidth", _colwidth);
Debug.locals.put("colSortable", _colsortable);
Debug.locals.put("colAlign", _colalign);
 BA.debugLineNum = 601;BA.debugLine="Sub AddTemplate(colField As String, colTitle As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 602;BA.debugLine="AddColumn(colField,colTitle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_addcolumn" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_coltitle));
 BA.debugLineNum = 603;BA.debugLine="SetColumnTmpl(colField,colTemplate)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntmpl" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_coltemplate));
 BA.debugLineNum = 604;BA.debugLine="SetColumnType(colField, COLUMN_NONE)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_colfield),(Object)(__ref.getField(true,"_column_none" /*RemoteObject*/ )));
 BA.debugLineNum = 605;BA.debugLine="SetColumnWidth(colField, colWidth)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnwidth" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_colwidth));
 BA.debugLineNum = 606;BA.debugLine="SetColumnSortable(colField, colSortable)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnsortable" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_colsortable));
 BA.debugLineNum = 607;BA.debugLine="SetColumnAlignment(colField, colAlign)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(_colfield),(Object)(_colalign));
 BA.debugLineNum = 608;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _cancel(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("Cancel (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("cancel")) { return __ref.runUserSub(false, "vmgijgotable","cancel", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 164;BA.debugLine="Sub Cancel(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="grid.RunMethod(\"cancel\", Array(pk))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("cancel")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pk)}))));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Table As VMElement";
vmgijgotable._table = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_table",vmgijgotable._table);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmgijgotable._id = RemoteObject.createImmutable("");__ref.setField("_id",vmgijgotable._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmgijgotable._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmgijgotable._vue);
 //BA.debugLineNum = 6;BA.debugLine="Public InlineEditing As Boolean = False";
vmgijgotable._inlineediting = vmgijgotable.__c.getField(true,"False");__ref.setField("_inlineediting",vmgijgotable._inlineediting);
 //BA.debugLineNum = 7;BA.debugLine="Public InlineEditingMode As String = \"click\"";
vmgijgotable._inlineeditingmode = BA.ObjectToString("click");__ref.setField("_inlineeditingmode",vmgijgotable._inlineeditingmode);
 //BA.debugLineNum = 8;BA.debugLine="Public InlineEditingManagementColumn As Boolean =";
vmgijgotable._inlineeditingmanagementcolumn = vmgijgotable.__c.getField(true,"True");__ref.setField("_inlineeditingmanagementcolumn",vmgijgotable._inlineeditingmanagementcolumn);
 //BA.debugLineNum = 9;BA.debugLine="Public Width As String = 0";
vmgijgotable._width = BA.NumberToString(0);__ref.setField("_width",vmgijgotable._width);
 //BA.debugLineNum = 10;BA.debugLine="Private grid As BANanoObject";
vmgijgotable._grid = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_grid",vmgijgotable._grid);
 //BA.debugLineNum = 11;BA.debugLine="Public PrimaryKey As String = \"id\"";
vmgijgotable._primarykey = BA.ObjectToString("id");__ref.setField("_primarykey",vmgijgotable._primarykey);
 //BA.debugLineNum = 12;BA.debugLine="Public PagerLimit As Int = 10";
vmgijgotable._pagerlimit = BA.numberCast(int.class, 10);__ref.setField("_pagerlimit",vmgijgotable._pagerlimit);
 //BA.debugLineNum = 13;BA.debugLine="Private Columns As List";
vmgijgotable._columns = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_columns",vmgijgotable._columns);
 //BA.debugLineNum = 15;BA.debugLine="Public COLUMN_DATE As String = \"date\"";
vmgijgotable._column_date = BA.ObjectToString("date");__ref.setField("_column_date",vmgijgotable._column_date);
 //BA.debugLineNum = 16;BA.debugLine="Public COLUMN_TEXT As String = \"text\"";
vmgijgotable._column_text = BA.ObjectToString("text");__ref.setField("_column_text",vmgijgotable._column_text);
 //BA.debugLineNum = 17;BA.debugLine="Public COLUMN_ICON As String = \"icon\"";
vmgijgotable._column_icon = BA.ObjectToString("icon");__ref.setField("_column_icon",vmgijgotable._column_icon);
 //BA.debugLineNum = 18;BA.debugLine="Public COLUMN_CHECKBOX As String = \"checkbox\"";
vmgijgotable._column_checkbox = BA.ObjectToString("checkbox");__ref.setField("_column_checkbox",vmgijgotable._column_checkbox);
 //BA.debugLineNum = 19;BA.debugLine="Public COLUMN_DROPDOWN As String = \"dropdown\"";
vmgijgotable._column_dropdown = BA.ObjectToString("dropdown");__ref.setField("_column_dropdown",vmgijgotable._column_dropdown);
 //BA.debugLineNum = 20;BA.debugLine="Public COLUMN_NONE As String = \"\"";
vmgijgotable._column_none = BA.ObjectToString("");__ref.setField("_column_none",vmgijgotable._column_none);
 //BA.debugLineNum = 21;BA.debugLine="Public COLUMN_TIME As String = \"time\"";
vmgijgotable._column_time = BA.ObjectToString("time");__ref.setField("_column_time",vmgijgotable._column_time);
 //BA.debugLineNum = 22;BA.debugLine="Public COLUMN_DATETIME As String = \"datetime\"";
vmgijgotable._column_datetime = BA.ObjectToString("datetime");__ref.setField("_column_datetime",vmgijgotable._column_datetime);
 //BA.debugLineNum = 23;BA.debugLine="Public COLUMN_IMAGE As String = \"image\"";
vmgijgotable._column_image = BA.ObjectToString("image");__ref.setField("_column_image",vmgijgotable._column_image);
 //BA.debugLineNum = 24;BA.debugLine="Public COLUMN_MONEY As String = \"money\"";
vmgijgotable._column_money = BA.ObjectToString("money");__ref.setField("_column_money",vmgijgotable._column_money);
 //BA.debugLineNum = 25;BA.debugLine="Public COLUMN_FILESIZE As String = \"filesize\"";
vmgijgotable._column_filesize = BA.ObjectToString("filesize");__ref.setField("_column_filesize",vmgijgotable._column_filesize);
 //BA.debugLineNum = 26;BA.debugLine="Public COLUMN_ICONRENDER As String = \"iconrender\"";
vmgijgotable._column_iconrender = BA.ObjectToString("iconrender");__ref.setField("_column_iconrender",vmgijgotable._column_iconrender);
 //BA.debugLineNum = 29;BA.debugLine="Public ALIGN_CENTER As String = \"center\"";
vmgijgotable._align_center = BA.ObjectToString("center");__ref.setField("_align_center",vmgijgotable._align_center);
 //BA.debugLineNum = 30;BA.debugLine="Public ALIGN_RIGHT As String = \"right\"";
vmgijgotable._align_right = BA.ObjectToString("right");__ref.setField("_align_right",vmgijgotable._align_right);
 //BA.debugLineNum = 31;BA.debugLine="Public ALIGN_LEFT As String = \"left\"";
vmgijgotable._align_left = BA.ObjectToString("left");__ref.setField("_align_left",vmgijgotable._align_left);
 //BA.debugLineNum = 32;BA.debugLine="Public autoGenerateColumns As Boolean = False";
vmgijgotable._autogeneratecolumns = vmgijgotable.__c.getField(true,"False");__ref.setField("_autogeneratecolumns",vmgijgotable._autogeneratecolumns);
 //BA.debugLineNum = 33;BA.debugLine="Public autoLoad As Boolean = True";
vmgijgotable._autoload = vmgijgotable.__c.getField(true,"True");__ref.setField("_autoload",vmgijgotable._autoload);
 //BA.debugLineNum = 34;BA.debugLine="Public BodyRowHeight As String = \"fixed\"";
vmgijgotable._bodyrowheight = BA.ObjectToString("fixed");__ref.setField("_bodyrowheight",vmgijgotable._bodyrowheight);
 //BA.debugLineNum = 35;BA.debugLine="Private columnsM As Map";
vmgijgotable._columnsm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_columnsm",vmgijgotable._columnsm);
 //BA.debugLineNum = 36;BA.debugLine="Public SelectionType As String = \"single\"";
vmgijgotable._selectiontype = BA.ObjectToString("single");__ref.setField("_selectiontype",vmgijgotable._selectiontype);
 //BA.debugLineNum = 37;BA.debugLine="Public ColumnReorder As Boolean = True";
vmgijgotable._columnreorder = vmgijgotable.__c.getField(true,"True");__ref.setField("_columnreorder",vmgijgotable._columnreorder);
 //BA.debugLineNum = 38;BA.debugLine="Public DetailTemplate As String = \"\"";
vmgijgotable._detailtemplate = BA.ObjectToString("");__ref.setField("_detailtemplate",vmgijgotable._detailtemplate);
 //BA.debugLineNum = 39;BA.debugLine="Public KeepExpandedRows As Boolean = False";
vmgijgotable._keepexpandedrows = vmgijgotable.__c.getField(true,"False");__ref.setField("_keepexpandedrows",vmgijgotable._keepexpandedrows);
 //BA.debugLineNum = 40;BA.debugLine="Public FixedHeader As Boolean = False";
vmgijgotable._fixedheader = vmgijgotable.__c.getField(true,"False");__ref.setField("_fixedheader",vmgijgotable._fixedheader);
 //BA.debugLineNum = 41;BA.debugLine="Public HeaderFilter As Boolean = True";
vmgijgotable._headerfilter = vmgijgotable.__c.getField(true,"True");__ref.setField("_headerfilter",vmgijgotable._headerfilter);
 //BA.debugLineNum = 42;BA.debugLine="Public HeaderFilterType As String = \"onchange\"";
vmgijgotable._headerfiltertype = BA.ObjectToString("onchange");__ref.setField("_headerfiltertype",vmgijgotable._headerfiltertype);
 //BA.debugLineNum = 43;BA.debugLine="Public ResizableColumns As Boolean = True";
vmgijgotable._resizablecolumns = vmgijgotable.__c.getField(true,"True");__ref.setField("_resizablecolumns",vmgijgotable._resizablecolumns);
 //BA.debugLineNum = 44;BA.debugLine="Public ShowHiddenColumnsAsDetails As Boolean = Fa";
vmgijgotable._showhiddencolumnsasdetails = vmgijgotable.__c.getField(true,"False");__ref.setField("_showhiddencolumnsasdetails",vmgijgotable._showhiddencolumnsasdetails);
 //BA.debugLineNum = 45;BA.debugLine="Private ExpandIcon As String = \"\"";
vmgijgotable._expandicon = BA.ObjectToString("");__ref.setField("_expandicon",vmgijgotable._expandicon);
 //BA.debugLineNum = 46;BA.debugLine="Private CollapseIcon As String = \"\"";
vmgijgotable._collapseicon = BA.ObjectToString("");__ref.setField("_collapseicon",vmgijgotable._collapseicon);
 //BA.debugLineNum = 47;BA.debugLine="Public RowReorder As Boolean = False";
vmgijgotable._rowreorder = vmgijgotable.__c.getField(true,"False");__ref.setField("_rowreorder",vmgijgotable._rowreorder);
 //BA.debugLineNum = 48;BA.debugLine="Public SelectionMethod As String = \"basic\"";
vmgijgotable._selectionmethod = BA.ObjectToString("basic");__ref.setField("_selectionmethod",vmgijgotable._selectionmethod);
 //BA.debugLineNum = 49;BA.debugLine="Public IconsLibrary As String = \"materialicons\"";
vmgijgotable._iconslibrary = BA.ObjectToString("materialicons");__ref.setField("_iconslibrary",vmgijgotable._iconslibrary);
 //BA.debugLineNum = 50;BA.debugLine="Public MinWidth As Int = 0";
vmgijgotable._minwidth = BA.numberCast(int.class, 0);__ref.setField("_minwidth",vmgijgotable._minwidth);
 //BA.debugLineNum = 51;BA.debugLine="Public UILibrary As String = \"materialdesign\"";
vmgijgotable._uilibrary = BA.ObjectToString("materialdesign");__ref.setField("_uilibrary",vmgijgotable._uilibrary);
 //BA.debugLineNum = 52;BA.debugLine="Public ToolbarTemplate As String = \"\"";
vmgijgotable._toolbartemplate = BA.ObjectToString("");__ref.setField("_toolbartemplate",vmgijgotable._toolbartemplate);
 //BA.debugLineNum = 53;BA.debugLine="Private GroupBy As String = \"\"";
vmgijgotable._groupby = BA.ObjectToString("");__ref.setField("_groupby",vmgijgotable._groupby);
 //BA.debugLineNum = 54;BA.debugLine="Private DataSource As List";
vmgijgotable._datasource = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_datasource",vmgijgotable._datasource);
 //BA.debugLineNum = 55;BA.debugLine="Public DataField As String = \"records\"";
vmgijgotable._datafield = BA.ObjectToString("records");__ref.setField("_datafield",vmgijgotable._datafield);
 //BA.debugLineNum = 56;BA.debugLine="Public ShowPager As Boolean = True";
vmgijgotable._showpager = vmgijgotable.__c.getField(true,"True");__ref.setField("_showpager",vmgijgotable._showpager);
 //BA.debugLineNum = 57;BA.debugLine="Public TransparentBackground As Boolean = True";
vmgijgotable._transparentbackground = vmgijgotable.__c.getField(true,"True");__ref.setField("_transparentbackground",vmgijgotable._transparentbackground);
 //BA.debugLineNum = 58;BA.debugLine="Private params As Map";
vmgijgotable._params = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_params",vmgijgotable._params);
 //BA.debugLineNum = 59;BA.debugLine="Private Banano As BANano  'ignore";
vmgijgotable._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmgijgotable._banano);
 //BA.debugLineNum = 60;BA.debugLine="Private mCallBack As Object";
vmgijgotable._mcallback = RemoteObject.createNew ("Object");__ref.setField("_mcallback",vmgijgotable._mcallback);
 //BA.debugLineNum = 61;BA.debugLine="Private eventName As String";
vmgijgotable._eventname = RemoteObject.createImmutable("");__ref.setField("_eventname",vmgijgotable._eventname);
 //BA.debugLineNum = 62;BA.debugLine="Public Options As Map";
vmgijgotable._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",vmgijgotable._options);
 //BA.debugLineNum = 63;BA.debugLine="Public responsive As Boolean = True";
vmgijgotable._responsive = vmgijgotable.__c.getField(true,"True");__ref.setField("_responsive",vmgijgotable._responsive);
 //BA.debugLineNum = 64;BA.debugLine="Private formats As Map";
vmgijgotable._formats = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_formats",vmgijgotable._formats);
 //BA.debugLineNum = 65;BA.debugLine="Public N As BANanoObject";
vmgijgotable._n = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_n",vmgijgotable._n);
 //BA.debugLineNum = 66;BA.debugLine="Public ToolBar As VMGrid";
vmgijgotable._toolbar = RemoteObject.createNew ("b4j.example.vmgrid");__ref.setField("_toolbar",vmgijgotable._toolbar);
 //BA.debugLineNum = 67;BA.debugLine="Private JQ As BANanoObject";
vmgijgotable._jq = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_jq",vmgijgotable._jq);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,317);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "vmgijgotable","clear", __ref);}
 BA.debugLineNum = 317;BA.debugLine="Sub Clear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 318;BA.debugLine="grid.RunMethod(\"clear\",Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("clear")),(Object)(vmgijgotable.__c.getField(false,"Null")));
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _collapseall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CollapseAll (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,866);
if (RapidSub.canDelegate("collapseall")) { return __ref.runUserSub(false, "vmgijgotable","collapseall", __ref);}
 BA.debugLineNum = 866;BA.debugLine="Sub CollapseAll";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 867;BA.debugLine="grid.RunMethod(\"collapseAll\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("collapseAll")),(Object)(vmgijgotable.__c.getField(false,"Null")));
 BA.debugLineNum = 868;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _countall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CountAll (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,347);
if (RapidSub.canDelegate("countall")) { return __ref.runUserSub(false, "vmgijgotable","countall", __ref);}
RemoteObject _cv = RemoteObject.createImmutable(0);
 BA.debugLineNum = 347;BA.debugLine="Sub CountAll As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 348;BA.debugLine="Dim cv As Int = grid.RunMethod(\"count\",Array(True";
Debug.JustUpdateDeviceLine();
_cv = BA.numberCast(int.class, __ref.getField(false,"_grid" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("count")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(vmgijgotable.__c.getField(true,"True"))})))).runMethod(false,"Result"));Debug.locals.put("cv", _cv);Debug.locals.put("cv", _cv);
 BA.debugLineNum = 349;BA.debugLine="Return cv";
Debug.JustUpdateDeviceLine();
if (true) return _cv;
 BA.debugLineNum = 350;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _countvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CountVisible (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,341);
if (RapidSub.canDelegate("countvisible")) { return __ref.runUserSub(false, "vmgijgotable","countvisible", __ref);}
RemoteObject _cv = RemoteObject.createImmutable(0);
 BA.debugLineNum = 341;BA.debugLine="Sub CountVisible As Int";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 342;BA.debugLine="Dim cv As Int = grid.RunMethod(\"count\",Null).resu";
Debug.JustUpdateDeviceLine();
_cv = BA.numberCast(int.class, __ref.getField(false,"_grid" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("count")),(Object)(vmgijgotable.__c.getField(false,"Null"))).runMethod(false,"Result"));Debug.locals.put("cv", _cv);Debug.locals.put("cv", _cv);
 BA.debugLineNum = 343;BA.debugLine="Return cv";
Debug.JustUpdateDeviceLine();
if (true) return _cv;
 BA.debugLineNum = 344;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(0);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _destroy(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Destroy (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("destroy")) { return __ref.runUserSub(false, "vmgijgotable","destroy", __ref);}
 BA.debugLineNum = 353;BA.debugLine="Sub Destroy";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 354;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 355;BA.debugLine="grid.RunMethod(\"destroy\", Array(True, True))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("destroy")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(vmgijgotable.__c.getField(true,"True")),(vmgijgotable.__c.getField(true,"True"))}))));
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e4) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e4.toString()); BA.debugLineNum = 357;BA.debugLine="Log(LastException)";
Debug.JustUpdateDeviceLine();
vmgijgotable.__c.runVoidMethod ("Log",(Object)(BA.ObjectToString(vmgijgotable.__c.runMethod(false,"LastException",__ref.getField(false, "ba")))));
 };
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _downloadcsv(RemoteObject __ref,RemoteObject _filename) throws Exception{
try {
		Debug.PushSubsStack("DownloadCSV (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1006);
if (RapidSub.canDelegate("downloadcsv")) { return __ref.runUserSub(false, "vmgijgotable","downloadcsv", __ref, _filename);}
Debug.locals.put("fileName", _filename);
 BA.debugLineNum = 1006;BA.debugLine="Sub DownloadCSV(fileName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1007;BA.debugLine="grid.RunMethod(\"downloadCSV\", Array(fileName,True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("downloadCSV")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_filename),(vmgijgotable.__c.getField(true,"True"))}))));
 BA.debugLineNum = 1008;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expandall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ExpandAll (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,861);
if (RapidSub.canDelegate("expandall")) { return __ref.runUserSub(false, "vmgijgotable","expandall", __ref);}
 BA.debugLineNum = 861;BA.debugLine="Sub ExpandAll";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 862;BA.debugLine="grid.RunMethod(\"expandAll\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("expandAll")),(Object)(vmgijgotable.__c.getField(false,"Null")));
 BA.debugLineNum = 863;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _filerender(RemoteObject __ref,RemoteObject _value,RemoteObject _record,RemoteObject _cell,RemoteObject _displayel) throws Exception{
try {
		Debug.PushSubsStack("FileRender (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1115);
if (RapidSub.canDelegate("filerender")) { return __ref.runUserSub(false, "vmgijgotable","filerender", __ref, _value, _record, _cell, _displayel);}
RemoteObject _de = RemoteObject.declareNull("com.ab.banano.BANanoElement");
Debug.locals.put("value", _value);
Debug.locals.put("record", _record);
Debug.locals.put("cell", _cell);
Debug.locals.put("displayEl", _displayel);
 BA.debugLineNum = 1115;BA.debugLine="Sub FileRender(value As Object, record As Map, cel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1116;BA.debugLine="If value = Null Then value = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_value)) { 
_value = RemoteObject.createImmutable((0));Debug.locals.put("value", _value);};
 BA.debugLineNum = 1117;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displa";
Debug.JustUpdateDeviceLine();
_de = RemoteObject.createNew ("com.ab.banano.BANanoElement");
_de = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToElement",(Object)(_displayel));Debug.locals.put("dE", _de);Debug.locals.put("dE", _de);
 BA.debugLineNum = 1118;BA.debugLine="value = N.Selector(value).RunMethod(\"format\",Arra";
Debug.JustUpdateDeviceLine();
_value = (__ref.getField(false,"_n" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)(_value)).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("format")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("0.00 b"))})))).getObject());Debug.locals.put("value", _value);
 BA.debugLineNum = 1119;BA.debugLine="dE.SetText(value)";
Debug.JustUpdateDeviceLine();
_de.runVoidMethod ("SetText",(Object)(BA.ObjectToString(_value)));
 BA.debugLineNum = 1120;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbyid(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("GetById (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("getbyid")) { return __ref.runUserSub(false, "vmgijgotable","getbyid", __ref, _sid);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("sID", _sid);
 BA.debugLineNum = 301;BA.debugLine="Sub GetById(sID As String) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="Dim res As Map = grid.RunMethod(\"getById\", Array(";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_res.setObject(__ref.getField(false,"_grid" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getById")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sid)})))).runMethod(false,"Result"));Debug.locals.put("res", _res);
 BA.debugLineNum = 303;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getbypos(RemoteObject __ref,RemoteObject _rowpos) throws Exception{
try {
		Debug.PushSubsStack("GetByPos (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("getbypos")) { return __ref.runUserSub(false, "vmgijgotable","getbypos", __ref, _rowpos);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("rowPos", _rowpos);
 BA.debugLineNum = 269;BA.debugLine="Sub GetByPos(rowPos As Int) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 270;BA.debugLine="Dim res As Map = grid.RunMethod(\"get\", Array(rowP";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_res.setObject(__ref.getField(false,"_grid" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("get")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_rowpos)})))).runMethod(false,"Result"));Debug.locals.put("res", _res);
 BA.debugLineNum = 271;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getchanges(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetChanges (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,916);
if (RapidSub.canDelegate("getchanges")) { return __ref.runUserSub(false, "vmgijgotable","getchanges", __ref);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 916;BA.debugLine="Sub GetChanges As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 917;BA.debugLine="Dim res As List = grid.runmethod(\"getChanges\",Nul";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_res.setObject(__ref.getField(false,"_grid" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getChanges")),(Object)(vmgijgotable.__c.getField(false,"Null"))).runMethod(false,"Result"));Debug.locals.put("res", _res);
 BA.debugLineNum = 918;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 919;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcsv(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCSV (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1011);
if (RapidSub.canDelegate("getcsv")) { return __ref.runUserSub(false, "vmgijgotable","getcsv", __ref);}
 BA.debugLineNum = 1011;BA.debugLine="Sub GetCSV";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1012;BA.debugLine="grid.RunMethod(\"getCSV\", Array(True))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("getCSV")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(vmgijgotable.__c.getField(true,"True"))}))));
 BA.debugLineNum = 1013;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrecordfromevent(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("GetRecordFromEvent (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("getrecordfromevent")) { return __ref.runUserSub(false, "vmgijgotable","getrecordfromevent", __ref, _e);}
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("e", _e);
 BA.debugLineNum = 179;BA.debugLine="Sub GetRecordFromEvent(e As BANanoEvent) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 180;BA.debugLine="Dim record As Map = e.OtherField(\"data\").Result";
Debug.JustUpdateDeviceLine();
_record = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_record.setObject(_e.runMethod(false,"OtherField",(Object)(RemoteObject.createImmutable("data"))).runMethod(false,"Result"));Debug.locals.put("record", _record);
 BA.debugLineNum = 181;BA.debugLine="Dim res As Map = record.Get(\"record\")";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_res.setObject(_record.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("record")))));Debug.locals.put("res", _res);
 BA.debugLineNum = 182;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrows(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRows (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("getrows")) { return __ref.runUserSub(false, "vmgijgotable","getrows", __ref);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 281;BA.debugLine="Sub GetRows() As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 282;BA.debugLine="Dim lst As List = grid.runmethod(\"getAll\", Array(";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst.setObject(__ref.getField(false,"_grid" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAll")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(vmgijgotable.__c.getField(true,"True"))})))).runMethod(false,"Result"));Debug.locals.put("lst", _lst);
 BA.debugLineNum = 283;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getrowsvisible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetRowsVisible (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,275);
if (RapidSub.canDelegate("getrowsvisible")) { return __ref.runUserSub(false, "vmgijgotable","getrowsvisible", __ref);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 275;BA.debugLine="Sub GetRowsVisible() As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 276;BA.debugLine="Dim lst As List = grid.runmethod(\"getAll\", Null).";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_lst.setObject(__ref.getField(false,"_grid" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getAll")),(Object)(vmgijgotable.__c.getField(false,"Null"))).runMethod(false,"Result"));Debug.locals.put("lst", _lst);
 BA.debugLineNum = 277;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
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
public static RemoteObject  _getselected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSelected (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,839);
if (RapidSub.canDelegate("getselected")) { return __ref.runUserSub(false, "vmgijgotable","getselected", __ref);}
RemoteObject _res = RemoteObject.createImmutable("");
 BA.debugLineNum = 839;BA.debugLine="Sub GetSelected As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 840;BA.debugLine="Dim res As String = grid.RunMethod(\"getSelected\",";
Debug.JustUpdateDeviceLine();
_res = BA.ObjectToString(__ref.getField(false,"_grid" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSelected")),(Object)(vmgijgotable.__c.getField(false,"Null"))).runMethod(false,"Result"));Debug.locals.put("res", _res);Debug.locals.put("res", _res);
 BA.debugLineNum = 841;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 842;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getselections(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetSelections (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,845);
if (RapidSub.canDelegate("getselections")) { return __ref.runUserSub(false, "vmgijgotable","getselections", __ref);}
RemoteObject _res = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
 BA.debugLineNum = 845;BA.debugLine="Sub GetSelections As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 846;BA.debugLine="Dim res As List = grid.RunMethod(\"getSelections\",";
Debug.JustUpdateDeviceLine();
_res = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_res.setObject(__ref.getField(false,"_grid" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("getSelections")),(Object)(vmgijgotable.__c.getField(false,"Null"))).runMethod(false,"Result"));Debug.locals.put("res", _res);
 BA.debugLineNum = 847;BA.debugLine="Return res";
Debug.JustUpdateDeviceLine();
if (true) return _res;
 BA.debugLineNum = 848;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hidecolumn(RemoteObject __ref,RemoteObject _colname) throws Exception{
try {
		Debug.PushSubsStack("HideColumn (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,322);
if (RapidSub.canDelegate("hidecolumn")) { return __ref.runUserSub(false, "vmgijgotable","hidecolumn", __ref, _colname);}
RemoteObject _strcol = RemoteObject.createImmutable("");
Debug.locals.put("colName", _colname);
 BA.debugLineNum = 322;BA.debugLine="Sub HideColumn(colName As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 323;BA.debugLine="For Each strCol As String In colName";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _colname;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strCol", _strcol);
Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 324;BA.debugLine="grid.RunMethod(\"hideColumn\", Array(strCol))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("hideColumn")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_strcol)}))));
 }
}Debug.locals.put("strCol", _strcol);
;
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _iconrender(RemoteObject __ref,RemoteObject _value,RemoteObject _record,RemoteObject _cell,RemoteObject _displayel) throws Exception{
try {
		Debug.PushSubsStack("IconRender (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1088);
if (RapidSub.canDelegate("iconrender")) { return __ref.runUserSub(false, "vmgijgotable","iconrender", __ref, _value, _record, _cell, _displayel);}
RemoteObject _sfontsize = RemoteObject.createImmutable("");
RemoteObject _sfontcolor = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _sstyle = RemoteObject.createImmutable("");
RemoteObject _sicon = RemoteObject.createImmutable("");
RemoteObject _de = RemoteObject.declareNull("com.ab.banano.BANanoElement");
Debug.locals.put("value", _value);
Debug.locals.put("record", _record);
Debug.locals.put("cell", _cell);
Debug.locals.put("displayEl", _displayel);
 BA.debugLineNum = 1088;BA.debugLine="Sub IconRender(value As Object, record As Map, cel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1089;BA.debugLine="If value = Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_value)) { 
 BA.debugLineNum = 1090;BA.debugLine="value = \"\"";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.createImmutable((""));Debug.locals.put("value", _value);
 BA.debugLineNum = 1091;BA.debugLine="Return";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable("");
 };
 BA.debugLineNum = 1093;BA.debugLine="Dim sfontsize As String = record.GetDefault(\"icon";
Debug.JustUpdateDeviceLine();
_sfontsize = BA.ObjectToString(_record.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("iconsize"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sfontsize", _sfontsize);Debug.locals.put("sfontsize", _sfontsize);
 BA.debugLineNum = 1094;BA.debugLine="Dim sfontcolor As String = record.GetDefault(\"ico";
Debug.JustUpdateDeviceLine();
_sfontcolor = BA.ObjectToString(_record.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("iconcolor"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("sfontcolor", _sfontcolor);Debug.locals.put("sfontcolor", _sfontcolor);
 BA.debugLineNum = 1095;BA.debugLine="If sfontsize = Null Then sfontsize = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_sfontsize)) { 
_sfontsize = BA.ObjectToString("");Debug.locals.put("sfontsize", _sfontsize);};
 BA.debugLineNum = 1096;BA.debugLine="If sfontcolor = Null Then sfontcolor = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_sfontcolor)) { 
_sfontcolor = BA.ObjectToString("");Debug.locals.put("sfontcolor", _sfontcolor);};
 BA.debugLineNum = 1097;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1098;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1099;BA.debugLine="If sfontsize <> \"\" Then sb.Append($\"font-size:${s";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_sfontsize,BA.ObjectToString(""))) { 
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("font-size:"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sfontsize))),RemoteObject.createImmutable("px;")))));};
 BA.debugLineNum = 1100;BA.debugLine="If sfontcolor <> \"\" Then sb.Append($\"color:${sfon";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_sfontcolor,BA.ObjectToString(""))) { 
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("color:"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sfontcolor))),RemoteObject.createImmutable(";")))));};
 BA.debugLineNum = 1101;BA.debugLine="Dim sStyle As String = sb.tostring";
Debug.JustUpdateDeviceLine();
_sstyle = _sb.runMethod(true,"ToString");Debug.locals.put("sStyle", _sstyle);Debug.locals.put("sStyle", _sstyle);
 BA.debugLineNum = 1102;BA.debugLine="Dim sIcon As String = \"\"";
Debug.JustUpdateDeviceLine();
_sicon = BA.ObjectToString("");Debug.locals.put("sIcon", _sicon);Debug.locals.put("sIcon", _sicon);
 BA.debugLineNum = 1103;BA.debugLine="Select Case IconsLibrary";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ),BA.ObjectToString("materialicons"),BA.ObjectToString("fontawesome"))) {
case 0: {
 BA.debugLineNum = 1105;BA.debugLine="sIcon = $\"<i class=\"material-icons gj-cursor-po";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<i class=\"material-icons gj-cursor-pointer\" style=\""),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sstyle))),RemoteObject.createImmutable("\">"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable("</i>")));Debug.locals.put("sIcon", _sicon);
 break; }
case 1: {
 BA.debugLineNum = 1107;BA.debugLine="sIcon = $\"<i class=\"${value} gj-cursor-pointer\"";
Debug.JustUpdateDeviceLine();
_sicon = (RemoteObject.concat(RemoteObject.createImmutable("<i class=\""),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable(" gj-cursor-pointer\" style=\""),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sstyle))),RemoteObject.createImmutable("\"></i>")));Debug.locals.put("sIcon", _sicon);
 break; }
}
;
 BA.debugLineNum = 1109;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displa";
Debug.JustUpdateDeviceLine();
_de = RemoteObject.createNew ("com.ab.banano.BANanoElement");
_de = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToElement",(Object)(_displayel));Debug.locals.put("dE", _de);Debug.locals.put("dE", _de);
 BA.debugLineNum = 1110;BA.debugLine="dE.SetHTML(sIcon)";
Debug.JustUpdateDeviceLine();
_de.runVoidMethod ("SetHTML",(Object)(_sicon));
 BA.debugLineNum = 1111;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _imagerender(RemoteObject __ref,RemoteObject _value,RemoteObject _record,RemoteObject _cell,RemoteObject _displayel) throws Exception{
try {
		Debug.PushSubsStack("ImageRender (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1137);
if (RapidSub.canDelegate("imagerender")) { return __ref.runUserSub(false, "vmgijgotable","imagerender", __ref, _value, _record, _cell, _displayel);}
RemoteObject _simagewidth = RemoteObject.createImmutable("");
RemoteObject _simageheight = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _sstyle = RemoteObject.createImmutable("");
RemoteObject _de = RemoteObject.declareNull("com.ab.banano.BANanoElement");
RemoteObject _simg = RemoteObject.createImmutable("");
Debug.locals.put("value", _value);
Debug.locals.put("record", _record);
Debug.locals.put("cell", _cell);
Debug.locals.put("displayEl", _displayel);
 BA.debugLineNum = 1137;BA.debugLine="Sub ImageRender(value As Object, record As Map, ce";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1139;BA.debugLine="If value <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_value)) { 
 BA.debugLineNum = 1140;BA.debugLine="Dim simagewidth As String = record.GetDefault(\"i";
Debug.JustUpdateDeviceLine();
_simagewidth = BA.ObjectToString(_record.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("imagewidth"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("simagewidth", _simagewidth);Debug.locals.put("simagewidth", _simagewidth);
 BA.debugLineNum = 1141;BA.debugLine="Dim simageheight As String = record.GetDefault(\"";
Debug.JustUpdateDeviceLine();
_simageheight = BA.ObjectToString(_record.runMethod(false,"GetDefault",(Object)(RemoteObject.createImmutable(("imageheight"))),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("simageheight", _simageheight);Debug.locals.put("simageheight", _simageheight);
 BA.debugLineNum = 1142;BA.debugLine="If simagewidth = Null Then simagewidth = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_simagewidth)) { 
_simagewidth = BA.ObjectToString("");Debug.locals.put("simagewidth", _simagewidth);};
 BA.debugLineNum = 1143;BA.debugLine="If simageheight = Null Then simageheight = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_simageheight)) { 
_simageheight = BA.ObjectToString("");Debug.locals.put("simageheight", _simageheight);};
 BA.debugLineNum = 1144;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 1145;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 1146;BA.debugLine="If simageheight <> \"\" Then sb.Append($\"height:${";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_simageheight,BA.ObjectToString(""))) { 
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("height:"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgijgotable.class, "_makepx" /*RemoteObject*/ ,(Object)(_simageheight))))),RemoteObject.createImmutable(";")))));};
 BA.debugLineNum = 1147;BA.debugLine="If simagewidth <> \"\" Then sb.Append($\"width:${Ma";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_simagewidth,BA.ObjectToString(""))) { 
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("width:"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.vmgijgotable.class, "_makepx" /*RemoteObject*/ ,(Object)(_simagewidth))))),RemoteObject.createImmutable(";")))));};
 BA.debugLineNum = 1148;BA.debugLine="Dim sStyle As String = sb.tostring";
Debug.JustUpdateDeviceLine();
_sstyle = _sb.runMethod(true,"ToString");Debug.locals.put("sStyle", _sstyle);Debug.locals.put("sStyle", _sstyle);
 BA.debugLineNum = 1149;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displ";
Debug.JustUpdateDeviceLine();
_de = RemoteObject.createNew ("com.ab.banano.BANanoElement");
_de = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToElement",(Object)(_displayel));Debug.locals.put("dE", _de);Debug.locals.put("dE", _de);
 BA.debugLineNum = 1150;BA.debugLine="Dim simg As String = $\"<img src=\"${value}\" alt=\"";
Debug.JustUpdateDeviceLine();
_simg = (RemoteObject.concat(RemoteObject.createImmutable("<img src=\""),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)(_value)),RemoteObject.createImmutable("\" alt=\"\" style=\""),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sstyle))),RemoteObject.createImmutable("\">")));Debug.locals.put("simg", _simg);Debug.locals.put("simg", _simg);
 BA.debugLineNum = 1151;BA.debugLine="dE.SetHTML(simg)";
Debug.JustUpdateDeviceLine();
_de.runVoidMethod ("SetHTML",(Object)(_simg));
 };
 BA.debugLineNum = 1153;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _sprimarykey,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmgijgotable","initialize", __ref, _ba, _v, _sid, _sprimarykey, _module);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("sPrimaryKey", _sprimarykey);
Debug.locals.put("module", _module);
 BA.debugLineNum = 74;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="Banano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("jquery-3.4.1.min.js")));
 BA.debugLineNum = 76;BA.debugLine="Banano.DependsOnAsset(\"gijgo.min.css\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("gijgo.min.css")));
 BA.debugLineNum = 77;BA.debugLine="Banano.DependsOnAsset(\"gijgo.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("gijgo.min.js")));
 BA.debugLineNum = 78;BA.debugLine="Banano.DependsOnAsset(\"fileSaver.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("fileSaver.min.js")));
 BA.debugLineNum = 79;BA.debugLine="Banano.DependsOnAsset(\"jszip.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("jszip.min.js")));
 BA.debugLineNum = 80;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 81;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 82;BA.debugLine="JQ = vue.jquery";
Debug.JustUpdateDeviceLine();
__ref.setField ("_jq" /*RemoteObject*/ ,__ref.getField(false,"_vue" /*RemoteObject*/ ).getField(false,"_jquery" /*RemoteObject*/ ));
 BA.debugLineNum = 83;BA.debugLine="Table.Initialize(vue, ID).SetTag(\"table\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("table")));
 BA.debugLineNum = 84;BA.debugLine="mCallBack = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mcallback" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 85;BA.debugLine="eventName = ID";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventname" /*RemoteObject*/ ,__ref.getField(true,"_id" /*RemoteObject*/ ));
 BA.debugLineNum = 86;BA.debugLine="PrimaryKey = sPrimaryKey";
Debug.JustUpdateDeviceLine();
__ref.setField ("_primarykey" /*RemoteObject*/ ,_sprimarykey);
 BA.debugLineNum = 87;BA.debugLine="columnsM.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 88;BA.debugLine="Options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 89;BA.debugLine="params.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_params" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 90;BA.debugLine="formats.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_formats" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 91;BA.debugLine="N.Initialize(\"numeral\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_n" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("numeral"))));
 BA.debugLineNum = 93;BA.debugLine="ToolBar.Initialize(vue, $\"${ID}tblBar\"$, module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("tblBar")))),(Object)(_module));
 BA.debugLineNum = 94;BA.debugLine="ToolBar.AddRows(1)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addrows" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)));
 BA.debugLineNum = 95;BA.debugLine="ToolBar.AddColumns(2,6,6,6,6)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcolumns" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 2)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)),(Object)(BA.NumberToString(6)));
 BA.debugLineNum = 96;BA.debugLine="ToolBar.SetClass(1,2,\"text-right\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_setclass" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 2)),(Object)(RemoteObject.createImmutable("text-right")));
 BA.debugLineNum = 97;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _makepx(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("MakePx (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1156);
if (RapidSub.canDelegate("makepx")) { return __ref.runUserSub(false, "vmgijgotable","makepx", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1156;BA.debugLine="private Sub MakePx(sValue As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1157;BA.debugLine="sValue = sValue.trim";
Debug.JustUpdateDeviceLine();
_svalue = _svalue.runMethod(true,"trim");Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1158;BA.debugLine="If sValue.EndsWith(\"%\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("%"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1159;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1160;BA.debugLine="else If sValue.EndsWith(\"vm\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1161;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1162;BA.debugLine="else If sValue.EndsWith(\"px\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("px"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1163;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1164;BA.debugLine="else If sValue.EndsWith(\"cm\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("cm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1165;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1166;BA.debugLine="else If sValue.EndsWith(\"mm\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("mm"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1167;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1168;BA.debugLine="else If sValue.EndsWith(\"in\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("in"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1169;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1170;BA.debugLine="else If sValue.EndsWith(\"pt\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("pt"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1171;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1172;BA.debugLine="else If sValue.EndsWith(\"pc\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("pc"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1173;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1174;BA.debugLine="else If sValue.EndsWith(\"em\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("em"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1175;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1176;BA.debugLine="else If sValue.EndsWith(\"ex\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("ex"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1177;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1178;BA.debugLine="else If sValue.EndsWith(\"ch\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("ch"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1179;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1180;BA.debugLine="else If sValue.EndsWith(\"rem\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("rem"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1181;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1182;BA.debugLine="else If sValue.EndsWith(\"vw\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vw"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1183;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1184;BA.debugLine="else If sValue.EndsWith(\"vh\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vh"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1185;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1186;BA.debugLine="else If sValue.EndsWith(\"vmin\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vmin"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1187;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1188;BA.debugLine="else If sValue.EndsWith(\"vmax\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable("vmax"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1189;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else 
{ BA.debugLineNum = 1190;BA.debugLine="else If sValue.EndsWith(\";\") Then";
Debug.JustUpdateDeviceLine();
if (_svalue.runMethod(true,"endsWith",(Object)(RemoteObject.createImmutable(";"))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1191;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }else {
 BA.debugLineNum = 1193;BA.debugLine="sValue = sValue.Replace(\"px\",\"\")";
Debug.JustUpdateDeviceLine();
_svalue = _svalue.runMethod(true,"replace",(Object)(BA.ObjectToString("px")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1194;BA.debugLine="sValue = $\"${sValue}px\"$";
Debug.JustUpdateDeviceLine();
_svalue = (RemoteObject.concat(RemoteObject.createImmutable(""),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_svalue))),RemoteObject.createImmutable("px")));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1195;BA.debugLine="If sValue = \"px\" Then sValue = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_svalue,BA.ObjectToString("px"))) { 
_svalue = BA.ObjectToString("");Debug.locals.put("sValue", _svalue);};
 BA.debugLineNum = 1196;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 }}}}}}}}}}}}}}}}}
;
 BA.debugLineNum = 1198;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _moneyrender(RemoteObject __ref,RemoteObject _value,RemoteObject _record,RemoteObject _cell,RemoteObject _displayel) throws Exception{
try {
		Debug.PushSubsStack("MoneyRender (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1129);
if (RapidSub.canDelegate("moneyrender")) { return __ref.runUserSub(false, "vmgijgotable","moneyrender", __ref, _value, _record, _cell, _displayel);}
RemoteObject _de = RemoteObject.declareNull("com.ab.banano.BANanoElement");
Debug.locals.put("value", _value);
Debug.locals.put("record", _record);
Debug.locals.put("cell", _cell);
Debug.locals.put("displayEl", _displayel);
 BA.debugLineNum = 1129;BA.debugLine="Sub MoneyRender(value As Object, record As Map, ce";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1130;BA.debugLine="If value = Null Then value = 0";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_value)) { 
_value = RemoteObject.createImmutable((0));Debug.locals.put("value", _value);};
 BA.debugLineNum = 1131;BA.debugLine="Dim dE As BANanoElement = Banano.ToElement(displa";
Debug.JustUpdateDeviceLine();
_de = RemoteObject.createNew ("com.ab.banano.BANanoElement");
_de = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToElement",(Object)(_displayel));Debug.locals.put("dE", _de);Debug.locals.put("dE", _de);
 BA.debugLineNum = 1132;BA.debugLine="value = N.Selector(value).RunMethod(\"format\",Arra";
Debug.JustUpdateDeviceLine();
_value = (__ref.getField(false,"_n" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)(_value)).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("format")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("(0,0.00)"))})))).getObject());Debug.locals.put("value", _value);
 BA.debugLineNum = 1133;BA.debugLine="dE.SetText(value)";
Debug.JustUpdateDeviceLine();
_de.runVoidMethod ("SetText",(Object)(BA.ObjectToString(_value)));
 BA.debugLineNum = 1134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _numeralformat(RemoteObject __ref,RemoteObject _svalue,RemoteObject _sformat) throws Exception{
try {
		Debug.PushSubsStack("NumeralFormat (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1123);
if (RapidSub.canDelegate("numeralformat")) { return __ref.runUserSub(false, "vmgijgotable","numeralformat", __ref, _svalue, _sformat);}
Debug.locals.put("sValue", _svalue);
Debug.locals.put("sFormat", _sformat);
 BA.debugLineNum = 1123;BA.debugLine="Sub NumeralFormat(sValue As String,sFormat As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1124;BA.debugLine="sValue = N.Selector(sValue).RunMethod(\"format\",Ar";
Debug.JustUpdateDeviceLine();
_svalue = BA.ObjectToString(__ref.getField(false,"_n" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)((_svalue))).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("format")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_sformat)})))).runMethod(false,"Result"));Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 1125;BA.debugLine="Return sValue";
Debug.JustUpdateDeviceLine();
if (true) return _svalue;
 BA.debugLineNum = 1126;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmgijgotable","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 154;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 155;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmgijgotable.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 156;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,370);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "vmgijgotable","refresh", __ref);}
RemoteObject _sizes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _pager = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _mapping = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _column = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _inlineeditingobject = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _hf = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _icn = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 370;BA.debugLine="Sub Refresh As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 371;BA.debugLine="If grid <> Null Then Destroy";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_grid" /*RemoteObject*/ ))) { 
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_destroy" /*RemoteObject*/ );};
 BA.debugLineNum = 372;BA.debugLine="Select Case IconsLibrary";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ ),BA.ObjectToString("materialicons"),BA.ObjectToString("fontawesome"))) {
case 0: {
 BA.debugLineNum = 374;BA.debugLine="ExpandIcon = $\"<i class=\"material-icons\">keyboa";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expandicon" /*RemoteObject*/ ,(RemoteObject.createImmutable("<i class=\"material-icons\">keyboard_arrow_right</i>")));
 BA.debugLineNum = 375;BA.debugLine="CollapseIcon = $\"<i class=\"material-icons\">keyb";
Debug.JustUpdateDeviceLine();
__ref.setField ("_collapseicon" /*RemoteObject*/ ,(RemoteObject.createImmutable("<i class=\"material-icons\">keyboard_arrow_down</i>")));
 break; }
case 1: {
 BA.debugLineNum = 377;BA.debugLine="ExpandIcon = $\"<i class=\"fa fa-chevron-right\"><";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expandicon" /*RemoteObject*/ ,(RemoteObject.createImmutable("<i class=\"fa fa-chevron-right\"></i>")));
 BA.debugLineNum = 378;BA.debugLine="CollapseIcon = $\"<i class=\"fa fa-chevron-down\">";
Debug.JustUpdateDeviceLine();
__ref.setField ("_collapseicon" /*RemoteObject*/ ,(RemoteObject.createImmutable("<i class=\"fa fa-chevron-down\"></i>")));
 break; }
}
;
 BA.debugLineNum = 380;BA.debugLine="Dim sizes As List";
Debug.JustUpdateDeviceLine();
_sizes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sizes", _sizes);
 BA.debugLineNum = 381;BA.debugLine="sizes.Initialize";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Initialize");
 BA.debugLineNum = 382;BA.debugLine="sizes.AddAll(Array As Int(5,10,15,20,25,30,35,40,";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("AddAll",(Object)(vmgijgotable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("int",new int[] {10},new Object[] {BA.numberCast(int.class, 5),BA.numberCast(int.class, 10),BA.numberCast(int.class, 15),BA.numberCast(int.class, 20),BA.numberCast(int.class, 25),BA.numberCast(int.class, 30),BA.numberCast(int.class, 35),BA.numberCast(int.class, 40),BA.numberCast(int.class, 45),BA.numberCast(int.class, 50)})))));
 BA.debugLineNum = 383;BA.debugLine="Dim pager As Map = CreateMap(\"limit\":PagerLimit,\"";
Debug.JustUpdateDeviceLine();
_pager = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_pager = vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("limit")),(__ref.getField(true,"_pagerlimit" /*RemoteObject*/ )),RemoteObject.createImmutable(("sizes")),(_sizes.getObject())}));Debug.locals.put("pager", _pager);Debug.locals.put("pager", _pager);
 BA.debugLineNum = 384;BA.debugLine="Dim mapping As Map = CreateMap(\"dataField\": DataF";
Debug.JustUpdateDeviceLine();
_mapping = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_mapping = vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("dataField")),(__ref.getField(true,"_datafield" /*RemoteObject*/ ))}));Debug.locals.put("mapping", _mapping);Debug.locals.put("mapping", _mapping);
 BA.debugLineNum = 385;BA.debugLine="Columns.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columns" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 386;BA.debugLine="For Each column As Map In columnsM.Values";
Debug.JustUpdateDeviceLine();
_column = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
{
final RemoteObject group16 = __ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen16 = group16.runMethod(true,"getSize").<Integer>get()
;int index16 = 0;
;
for (; index16 < groupLen16;index16++){
_column.setObject(group16.runMethod(false,"Get",index16));
Debug.locals.put("column", _column);
 BA.debugLineNum = 387;BA.debugLine="Columns.Add(column)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columns" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_column.getObject())));
 }
}Debug.locals.put("column", _column);
;
 BA.debugLineNum = 389;BA.debugLine="If autoGenerateColumns Then Columns.clear";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_autogeneratecolumns" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_columns" /*RemoteObject*/ ).runVoidMethod ("Clear");};
 BA.debugLineNum = 391;BA.debugLine="Options = CreateMap(\"dataSource\":DataSource, _ 	\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_options" /*RemoteObject*/ ,vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("dataSource")),(__ref.getField(false,"_datasource" /*RemoteObject*/ ).getObject()),RemoteObject.createImmutable(("primaryKey")),(__ref.getField(true,"_primarykey" /*RemoteObject*/ )),RemoteObject.createImmutable(("mapping")),(_mapping.getObject()),RemoteObject.createImmutable(("autoLoad")),(__ref.getField(true,"_autoload" /*RemoteObject*/ )),RemoteObject.createImmutable(("bodyRowHeight")),(__ref.getField(true,"_bodyrowheight" /*RemoteObject*/ )),RemoteObject.createImmutable(("selectionType")),(__ref.getField(true,"_selectiontype" /*RemoteObject*/ )),RemoteObject.createImmutable(("selectionMethod")),(__ref.getField(true,"_selectionmethod" /*RemoteObject*/ )),RemoteObject.createImmutable(("iconsLibrary")),(__ref.getField(true,"_iconslibrary" /*RemoteObject*/ )),RemoteObject.createImmutable(("columnReorder")),(__ref.getField(true,"_columnreorder" /*RemoteObject*/ )),RemoteObject.createImmutable(("keepExpandedRows")),(__ref.getField(true,"_keepexpandedrows" /*RemoteObject*/ )),RemoteObject.createImmutable(("fixedHeader")),(__ref.getField(true,"_fixedheader" /*RemoteObject*/ )),RemoteObject.createImmutable(("resizableColumns")),(__ref.getField(true,"_resizablecolumns" /*RemoteObject*/ )),RemoteObject.createImmutable(("responsive")),(__ref.getField(true,"_responsive" /*RemoteObject*/ )),RemoteObject.createImmutable(("rowReorder")),(__ref.getField(true,"_rowreorder" /*RemoteObject*/ )),RemoteObject.createImmutable(("autoGenerateColumns")),(__ref.getField(true,"_autogeneratecolumns" /*RemoteObject*/ )),RemoteObject.createImmutable(("uiLibrary")),(__ref.getField(true,"_uilibrary" /*RemoteObject*/ ))})));
 BA.debugLineNum = 407;BA.debugLine="If InlineEditing Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_inlineediting" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 408;BA.debugLine="Dim InlineEditingObject As Map = CreateMap(\"mode";
Debug.JustUpdateDeviceLine();
_inlineeditingobject = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_inlineeditingobject = vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("mode")),(__ref.getField(true,"_inlineeditingmode" /*RemoteObject*/ )),RemoteObject.createImmutable(("managementColumn")),(__ref.getField(true,"_inlineeditingmanagementcolumn" /*RemoteObject*/ ))}));Debug.locals.put("InlineEditingObject", _inlineeditingobject);Debug.locals.put("InlineEditingObject", _inlineeditingobject);
 BA.debugLineNum = 409;BA.debugLine="Options.Put(\"inlineEditing\", InlineEditingObject";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("inlineEditing"))),(Object)((_inlineeditingobject.getObject())));
 };
 BA.debugLineNum = 411;BA.debugLine="If ShowPager Then Options.Put(\"pager\", pager)";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_showpager" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("pager"))),(Object)((_pager.getObject())));};
 BA.debugLineNum = 412;BA.debugLine="If Columns.Size > 0 Then Options.Put(\"columns\", C";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_columns" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("columns"))),(Object)((__ref.getField(false,"_columns" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 413;BA.debugLine="If MinWidth > 0 Then Options.put(\"minWidth\", MinW";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_minwidth" /*RemoteObject*/ ),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("minWidth"))),(Object)((__ref.getField(true,"_minwidth" /*RemoteObject*/ ))));};
 BA.debugLineNum = 414;BA.debugLine="If ToolbarTemplate.Length > 0 Then Options.Put(\"t";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_toolbartemplate" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("toolbarTemplate"))),(Object)((__ref.getField(true,"_toolbartemplate" /*RemoteObject*/ ))));};
 BA.debugLineNum = 415;BA.debugLine="If Width > 0 Then Options.Put(\"width\", Width)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",BA.numberCast(double.class, __ref.getField(true,"_width" /*RemoteObject*/ )),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((__ref.getField(true,"_width" /*RemoteObject*/ ))));};
 BA.debugLineNum = 417;BA.debugLine="If GroupBy.length > 0 Then Options.Put(\"grouping\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_groupby" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("grouping"))),(Object)((vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("groupBy")),(__ref.getField(true,"_groupby" /*RemoteObject*/ ))})).getObject())));};
 BA.debugLineNum = 418;BA.debugLine="If DetailTemplate.Length > 0 Then Options.Put(\"de";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(true,"_detailtemplate" /*RemoteObject*/ ).runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("detailTemplate"))),(Object)((__ref.getField(true,"_detailtemplate" /*RemoteObject*/ ))));};
 BA.debugLineNum = 419;BA.debugLine="If params.Size > 0 Then Options.Put(\"params\", par";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_params" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("params"))),(Object)((__ref.getField(false,"_params" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 420;BA.debugLine="If HeaderFilter Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_headerfilter" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 421;BA.debugLine="Dim hf As Map = CreateMap(\"type\": HeaderFilterTy";
Debug.JustUpdateDeviceLine();
_hf = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_hf = vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),(__ref.getField(true,"_headerfiltertype" /*RemoteObject*/ ))}));Debug.locals.put("hf", _hf);Debug.locals.put("hf", _hf);
 BA.debugLineNum = 422;BA.debugLine="Options.Put(\"headerFilter\", hf)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("headerFilter"))),(Object)((_hf.getObject())));
 };
 BA.debugLineNum = 424;BA.debugLine="Dim icn As Map";
Debug.JustUpdateDeviceLine();
_icn = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("icn", _icn);
 BA.debugLineNum = 425;BA.debugLine="icn.Initialize";
Debug.JustUpdateDeviceLine();
_icn.runVoidMethod ("Initialize");
 BA.debugLineNum = 426;BA.debugLine="icn.Put(\"expandRow\",  ExpandIcon)";
Debug.JustUpdateDeviceLine();
_icn.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("expandRow"))),(Object)((__ref.getField(true,"_expandicon" /*RemoteObject*/ ))));
 BA.debugLineNum = 427;BA.debugLine="icn.Put(\"collapseRow\", CollapseIcon)";
Debug.JustUpdateDeviceLine();
_icn.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("collapseRow"))),(Object)((__ref.getField(true,"_collapseicon" /*RemoteObject*/ ))));
 BA.debugLineNum = 428;BA.debugLine="icn.Put(\"expandGroup\",  ExpandIcon)";
Debug.JustUpdateDeviceLine();
_icn.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("expandGroup"))),(Object)((__ref.getField(true,"_expandicon" /*RemoteObject*/ ))));
 BA.debugLineNum = 429;BA.debugLine="icn.Put(\"collapseGroup\", CollapseIcon)";
Debug.JustUpdateDeviceLine();
_icn.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("collapseGroup"))),(Object)((__ref.getField(true,"_collapseicon" /*RemoteObject*/ ))));
 BA.debugLineNum = 430;BA.debugLine="Options.Put(\"icons\", icn)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icons"))),(Object)((_icn.getObject())));
 BA.debugLineNum = 432;BA.debugLine="grid = JQ.Selector($\"#${ID}\"$)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_grid" /*RemoteObject*/ ,__ref.getField(false,"_jq" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)(((RemoteObject.concat(RemoteObject.createImmutable("#"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("")))))));
 BA.debugLineNum = 433;BA.debugLine="grid.RunMethod(\"grid\", Array(Options))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("grid")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(false,"_options" /*RemoteObject*/ ).getObject())}))));
 BA.debugLineNum = 460;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 461;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reload(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reload (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,312);
if (RapidSub.canDelegate("reload")) { return __ref.runUserSub(false, "vmgijgotable","reload", __ref);}
 BA.debugLineNum = 312;BA.debugLine="Sub Reload";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 313;BA.debugLine="grid.RunMethod(\"reload\",Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("reload")),(Object)(vmgijgotable.__c.getField(false,"Null")));
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removerow(RemoteObject __ref,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("RemoveRow (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("removerow")) { return __ref.runUserSub(false, "vmgijgotable","removerow", __ref, _pk);}
Debug.locals.put("pk", _pk);
 BA.debugLineNum = 336;BA.debugLine="Sub RemoveRow(pk As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="grid.RunMethod(\"removeRow\", Array(pk))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("removeRow")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_pk)}))));
 BA.debugLineNum = 338;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmgijgotable","render", __ref);}
 BA.debugLineNum = 150;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 151;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmgijgotable.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _reset(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Reset (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("reset")) { return __ref.runUserSub(false, "vmgijgotable","reset", __ref);}
 BA.debugLineNum = 100;BA.debugLine="Sub Reset";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="columnsM.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 102;BA.debugLine="Options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 103;BA.debugLine="params.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_params" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 104;BA.debugLine="formats.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_formats" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 105;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _searchfor(RemoteObject __ref,RemoteObject _searchvalues) throws Exception{
try {
		Debug.PushSubsStack("SearchFor (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("searchfor")) { return __ref.runUserSub(false, "vmgijgotable","searchfor", __ref, _searchvalues);}
Debug.locals.put("searchValues", _searchvalues);
 BA.debugLineNum = 307;BA.debugLine="Sub SearchFor(searchValues As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="grid.RunMethod(\"reload\", Array(searchValues))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("reload")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_searchvalues.getObject())}))));
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
public static RemoteObject  _selectall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SelectAll (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,851);
if (RapidSub.canDelegate("selectall")) { return __ref.runUserSub(false, "vmgijgotable","selectall", __ref);}
 BA.debugLineNum = 851;BA.debugLine="Sub SelectAll";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 852;BA.debugLine="grid.RunMethod(\"selectAll\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("selectAll")),(Object)(vmgijgotable.__c.getField(false,"Null")));
 BA.debugLineNum = 853;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmgijgotable","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 140;BA.debugLine="Sub SetAttr(attr As Map) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="Table.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setcenteraligncolumns(RemoteObject __ref,RemoteObject _flds) throws Exception{
try {
		Debug.PushSubsStack("SetCenterAlignColumns (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,638);
if (RapidSub.canDelegate("setcenteraligncolumns")) { return __ref.runUserSub(false, "vmgijgotable","setcenteraligncolumns", __ref, _flds);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("flds", _flds);
 BA.debugLineNum = 638;BA.debugLine="Sub SetCenterAlignColumns(flds As List) As VMGijgo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 639;BA.debugLine="For Each k As String In flds";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _flds;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 640;BA.debugLine="SetColumnAlignment(k, ALIGN_CENTER)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(_k),(Object)(__ref.getField(true,"_align_center" /*RemoteObject*/ )));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 642;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 643;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnalignment(RemoteObject __ref,RemoteObject _colname,RemoteObject _colalign) throws Exception{
try {
		Debug.PushSubsStack("SetColumnAlignment (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,623);
if (RapidSub.canDelegate("setcolumnalignment")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnalignment", __ref, _colname, _colalign);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colAlign", _colalign);
 BA.debugLineNum = 623;BA.debugLine="Sub SetColumnAlignment(colName As String, colAlign";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 624;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 625;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 626;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 627;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 628;BA.debugLine="Select Case colAlign";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_colalign,__ref.getField(true,"_align_center" /*RemoteObject*/ ),__ref.getField(true,"_align_right" /*RemoteObject*/ ))) {
case 0: 
case 1: {
 BA.debugLineNum = 630;BA.debugLine="col.Put(\"align\", colAlign)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("align"))),(Object)((_colalign)));
 BA.debugLineNum = 631;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 break; }
}
;
 };
 BA.debugLineNum = 634;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 635;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnclickevent(RemoteObject __ref,RemoteObject _colfield,RemoteObject _stoppropagation) throws Exception{
try {
		Debug.PushSubsStack("SetColumnClickEvent (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,784);
if (RapidSub.canDelegate("setcolumnclickevent")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnclickevent", __ref, _colfield, _stoppropagation);}
RemoteObject _e = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _events = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colField", _colfield);
Debug.locals.put("stopPropagation", _stoppropagation);
 BA.debugLineNum = 784;BA.debugLine="Sub SetColumnClickEvent(colField As String, stopPr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 785;BA.debugLine="colField = colField.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 786;BA.debugLine="colField = colField.tolowercase";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"toLowerCase");Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 787;BA.debugLine="If columnsM.ContainsKey(colField) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colfield))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 788;BA.debugLine="Dim e As Map";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("e", _e);
 BA.debugLineNum = 789;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colfield))));Debug.locals.put("col", _col);
 BA.debugLineNum = 790;BA.debugLine="If col.ContainsKey(\"events\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_col.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("events")))),vmgijgotable.__c.getField(true,"False"))) { 
 BA.debugLineNum = 791;BA.debugLine="Dim events As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_events = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_events = vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("events", _events);Debug.locals.put("events", _events);
 BA.debugLineNum = 792;BA.debugLine="col.Put(\"events\", events)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("events"))),(Object)((_events.getObject())));
 };
 BA.debugLineNum = 794;BA.debugLine="Dim events As Map = col.Get(\"events\")";
Debug.JustUpdateDeviceLine();
_events = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_events.setObject(_col.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("events")))));Debug.locals.put("events", _events);
 BA.debugLineNum = 795;BA.debugLine="If stopPropagation Then col.Put(\"stopPropagation";
Debug.JustUpdateDeviceLine();
if (_stoppropagation.<Boolean>get().booleanValue()) { 
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stopPropagation"))),(Object)((_stoppropagation)));};
 BA.debugLineNum = 796;BA.debugLine="events.Put(\"click\", Banano.CallBack(mCallBack, e";
Debug.JustUpdateDeviceLine();
_events.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("click"))),(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),(RemoteObject.concat(RemoteObject.createImmutable("_"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colfield))),RemoteObject.createImmutable(""))))),(Object)(vmgijgotable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_e.getObject())})))))));
 BA.debugLineNum = 797;BA.debugLine="col.Put(\"events\", events)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("events"))),(Object)((_events.getObject())));
 BA.debugLineNum = 798;BA.debugLine="columnsM.Put(colField,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colfield)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 800;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumncss(RemoteObject __ref,RemoteObject _colname,RemoteObject _colcss) throws Exception{
try {
		Debug.PushSubsStack("SetColumnCSS (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1054);
if (RapidSub.canDelegate("setcolumncss")) { return __ref.runUserSub(false, "vmgijgotable","setcolumncss", __ref, _colname, _colcss);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colCSS", _colcss);
 BA.debugLineNum = 1054;BA.debugLine="Sub SetColumnCSS(colName As String, colCSS As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1055;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1056;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1058;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1059;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 1060;BA.debugLine="col.Put(\"cssClass\", colCSS)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cssClass"))),(Object)((_colcss)));
 BA.debugLineNum = 1061;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 1063;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1064;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumndatasource(RemoteObject __ref,RemoteObject _colfield,RemoteObject _coldatasource,RemoteObject _colvaluefield,RemoteObject _coleditfield) throws Exception{
try {
		Debug.PushSubsStack("SetColumnDataSource (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("setcolumndatasource")) { return __ref.runUserSub(false, "vmgijgotable","setcolumndatasource", __ref, _colfield, _coldatasource, _colvaluefield, _coleditfield);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _editor = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colField", _colfield);
Debug.locals.put("colDataSource", _coldatasource);
Debug.locals.put("colValueField", _colvaluefield);
Debug.locals.put("colEditField", _coleditfield);
 BA.debugLineNum = 244;BA.debugLine="Sub SetColumnDataSource(colField As String, colDat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="colField = colField.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 246;BA.debugLine="colField = colField.tolowercase";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"toLowerCase");Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 247;BA.debugLine="If columnsM.ContainsKey(colField) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colfield))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 248;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colfield))));Debug.locals.put("col", _col);
 BA.debugLineNum = 249;BA.debugLine="Dim editor As Map = CreateMap(\"dataSource\":colDa";
Debug.JustUpdateDeviceLine();
_editor = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_editor = vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("dataSource")),_coldatasource,RemoteObject.createImmutable(("valueField")),(_colvaluefield)}));Debug.locals.put("editor", _editor);Debug.locals.put("editor", _editor);
 BA.debugLineNum = 250;BA.debugLine="col.Put(\"editor\", editor)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("editor"))),(Object)((_editor.getObject())));
 BA.debugLineNum = 251;BA.debugLine="col.Put(\"editField\", colEditField)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("editField"))),(Object)((_coleditfield)));
 BA.debugLineNum = 252;BA.debugLine="columnsM.Put(colField,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colfield)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 254;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumneditors(RemoteObject __ref,RemoteObject _colfield) throws Exception{
try {
		Debug.PushSubsStack("SetColumnEditors (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("setcolumneditors")) { return __ref.runUserSub(false, "vmgijgotable","setcolumneditors", __ref, _colfield);}
RemoteObject _strcol = RemoteObject.createImmutable("");
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _coltype = RemoteObject.createImmutable("");
Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 196;BA.debugLine="Sub SetColumnEditors(colField As List) As VMGijgoT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="For Each strCol As String In colField";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _colfield;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strCol", _strcol);
Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 198;BA.debugLine="strCol = strCol.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_strcol = _strcol.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 199;BA.debugLine="strCol = strCol.tolowercase";
Debug.JustUpdateDeviceLine();
_strcol = _strcol.runMethod(true,"toLowerCase");Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 200;BA.debugLine="If columnsM.ContainsKey(strCol) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_strcol))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 201;BA.debugLine="Dim col As Map = columnsM.Get(strCol)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strcol))));Debug.locals.put("col", _col);
 BA.debugLineNum = 202;BA.debugLine="col.Put(\"editor\", True)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("editor"))),(Object)((vmgijgotable.__c.getField(true,"True"))));
 BA.debugLineNum = 204;BA.debugLine="Dim colType As String = col.Get(\"type\")";
Debug.JustUpdateDeviceLine();
_coltype = BA.ObjectToString(_col.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("type")))));Debug.locals.put("colType", _coltype);Debug.locals.put("colType", _coltype);
 BA.debugLineNum = 205;BA.debugLine="Select Case colType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_coltype,BA.ObjectToString("checkbox"))) {
case 0: {
 BA.debugLineNum = 207;BA.debugLine="col.Put(\"mode\", \"editOnly\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mode"))),(Object)((RemoteObject.createImmutable("editOnly"))));
 break; }
}
;
 BA.debugLineNum = 209;BA.debugLine="columnsM.Put(strCol,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strcol)),(Object)((_col.getObject())));
 };
 }
}Debug.locals.put("strCol", _strcol);
;
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
public static RemoteObject  _setcolumnevent(RemoteObject __ref,RemoteObject _colfield,RemoteObject _colevent,RemoteObject _stoppropagation) throws Exception{
try {
		Debug.PushSubsStack("SetColumnEvent (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,803);
if (RapidSub.canDelegate("setcolumnevent")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnevent", __ref, _colfield, _colevent, _stoppropagation);}
RemoteObject _e = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _events = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colField", _colfield);
Debug.locals.put("colEvent", _colevent);
Debug.locals.put("stopPropagation", _stoppropagation);
 BA.debugLineNum = 803;BA.debugLine="Sub SetColumnEvent(colField As String, colEvent As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 804;BA.debugLine="colField = colField.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 805;BA.debugLine="colField = colField.tolowercase";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"toLowerCase");Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 806;BA.debugLine="If columnsM.ContainsKey(colField) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colfield))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 807;BA.debugLine="Dim e As Map";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("e", _e);
 BA.debugLineNum = 808;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colfield))));Debug.locals.put("col", _col);
 BA.debugLineNum = 809;BA.debugLine="If col.ContainsKey(\"events\") = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_col.runMethod(true,"ContainsKey",(Object)((RemoteObject.createImmutable("events")))),vmgijgotable.__c.getField(true,"False"))) { 
 BA.debugLineNum = 810;BA.debugLine="Dim events As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_events = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_events = vmgijgotable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("events", _events);Debug.locals.put("events", _events);
 BA.debugLineNum = 811;BA.debugLine="col.Put(\"events\", events)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("events"))),(Object)((_events.getObject())));
 };
 BA.debugLineNum = 813;BA.debugLine="Dim events As Map = col.Get(\"events\")";
Debug.JustUpdateDeviceLine();
_events = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_events.setObject(_col.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("events")))));Debug.locals.put("events", _events);
 BA.debugLineNum = 814;BA.debugLine="If stopPropagation Then col.Put(\"stopPropagation";
Debug.JustUpdateDeviceLine();
if (_stoppropagation.<Boolean>get().booleanValue()) { 
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stopPropagation"))),(Object)((_stoppropagation)));};
 BA.debugLineNum = 815;BA.debugLine="events.Put(colEvent, Banano.CallBack(mCallBack,";
Debug.JustUpdateDeviceLine();
_events.runVoidMethod ("Put",(Object)((_colevent)),(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)(RemoteObject.concat(__ref.getField(true,"_eventname" /*RemoteObject*/ ),(RemoteObject.concat(RemoteObject.createImmutable("_"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colfield.runMethod(true,"toLowerCase")))),RemoteObject.createImmutable("_"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colevent))),RemoteObject.createImmutable(""))))),(Object)(vmgijgotable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_e.getObject())})))))));
 BA.debugLineNum = 816;BA.debugLine="col.Put(\"events\", events)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("events"))),(Object)((_events.getObject())));
 BA.debugLineNum = 817;BA.debugLine="columnsM.Put(colField,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colfield)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 819;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnfilterable(RemoteObject __ref,RemoteObject _colname,RemoteObject _colfilter) throws Exception{
try {
		Debug.PushSubsStack("SetColumnFilterable (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1041);
if (RapidSub.canDelegate("setcolumnfilterable")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnfilterable", __ref, _colname, _colfilter);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colFilter", _colfilter);
 BA.debugLineNum = 1041;BA.debugLine="Sub SetColumnFilterable(colName As String, colFilt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1042;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1043;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1045;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1046;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 1047;BA.debugLine="col.Put(\"filterable\", colFilter)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("filterable"))),(Object)((_colfilter)));
 BA.debugLineNum = 1048;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 1050;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1051;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnformat(RemoteObject __ref,RemoteObject _colname,RemoteObject _colformat) throws Exception{
try {
		Debug.PushSubsStack("SetColumnFormat (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1075);
if (RapidSub.canDelegate("setcolumnformat")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnformat", __ref, _colname, _colformat);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colFormat", _colformat);
 BA.debugLineNum = 1075;BA.debugLine="Sub SetColumnFormat(colName As String, colFormat A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1076;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1077;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1079;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1080;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 1081;BA.debugLine="col.Put(\"format\", colFormat)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("format"))),(Object)((_colformat)));
 BA.debugLineNum = 1082;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 1084;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1085;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnformatnumeral(RemoteObject __ref,RemoteObject _colfield,RemoteObject _colformat) throws Exception{
try {
		Debug.PushSubsStack("SetColumnFormatNumeral (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1068);
if (RapidSub.canDelegate("setcolumnformatnumeral")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnformatnumeral", __ref, _colfield, _colformat);}
Debug.locals.put("colField", _colfield);
Debug.locals.put("colFormat", _colformat);
 BA.debugLineNum = 1068;BA.debugLine="Sub SetColumnFormatNumeral(colField As String, col";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1069;BA.debugLine="SetColumnProperty(colField,\"formatnumeral\", colFo";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnproperty" /*RemoteObject*/ ,(Object)(_colfield),(Object)(BA.ObjectToString("formatnumeral")),(Object)((_colformat)));
 BA.debugLineNum = 1070;BA.debugLine="formats.Put(colField,colFormat)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_formats" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colfield)),(Object)((_colformat)));
 BA.debugLineNum = 1071;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1072;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumngroupby(RemoteObject __ref,RemoteObject _colfield) throws Exception{
try {
		Debug.PushSubsStack("SetColumnGroupBy (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("setcolumngroupby")) { return __ref.runUserSub(false, "vmgijgotable","setcolumngroupby", __ref, _colfield);}
Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 186;BA.debugLine="Sub SetColumnGroupBy(colField As String) As VMGijg";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="colField = colField.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 188;BA.debugLine="colField = colField.tolowercase";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"toLowerCase");Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 189;BA.debugLine="If columnsM.ContainsKey(colField) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colfield))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 190;BA.debugLine="GroupBy = colField";
Debug.JustUpdateDeviceLine();
__ref.setField ("_groupby" /*RemoteObject*/ ,_colfield);
 };
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
public static RemoteObject  _setcolumnheadercss(RemoteObject __ref,RemoteObject _colname,RemoteObject _headercssclass) throws Exception{
try {
		Debug.PushSubsStack("SetColumnHeaderCSS (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1028);
if (RapidSub.canDelegate("setcolumnheadercss")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnheadercss", __ref, _colname, _headercssclass);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("headerCssClass", _headercssclass);
 BA.debugLineNum = 1028;BA.debugLine="Sub SetColumnHeaderCSS(colName As String, headerCs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1029;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1030;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1032;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1033;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 1034;BA.debugLine="col.Put(\"headerCssClass\", headerCssClass)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("headerCssClass"))),(Object)((_headercssclass)));
 BA.debugLineNum = 1035;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 1037;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1038;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnhidden(RemoteObject __ref,RemoteObject _colname) throws Exception{
try {
		Debug.PushSubsStack("SetColumnHidden (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,962);
if (RapidSub.canDelegate("setcolumnhidden")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnhidden", __ref, _colname);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
 BA.debugLineNum = 962;BA.debugLine="Sub SetColumnHidden(colName As String) As VMGijgoT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 963;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 964;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 965;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 966;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 967;BA.debugLine="col.Put(\"hidden\", True)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("hidden"))),(Object)((vmgijgotable.__c.getField(true,"True"))));
 BA.debugLineNum = 968;BA.debugLine="col.Put(\"filterable\", False)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("filterable"))),(Object)((vmgijgotable.__c.getField(true,"False"))));
 BA.debugLineNum = 969;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
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
public static RemoteObject  _setcolumnhiddenonly(RemoteObject __ref,RemoteObject _colname,RemoteObject _bvalue) throws Exception{
try {
		Debug.PushSubsStack("SetColumnHiddenOnly (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,975);
if (RapidSub.canDelegate("setcolumnhiddenonly")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnhiddenonly", __ref, _colname, _bvalue);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("bValue", _bvalue);
 BA.debugLineNum = 975;BA.debugLine="Sub SetColumnHiddenOnly(colName As String, bValue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 976;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 977;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 978;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 979;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 980;BA.debugLine="col.Put(\"hidden\", bValue)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("hidden"))),(Object)((_bvalue)));
 BA.debugLineNum = 981;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 983;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 984;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnicon(RemoteObject __ref,RemoteObject _colname,RemoteObject _colicon) throws Exception{
try {
		Debug.PushSubsStack("SetColumnIcon (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,922);
if (RapidSub.canDelegate("setcolumnicon")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnicon", __ref, _colname, _colicon);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colIcon", _colicon);
 BA.debugLineNum = 922;BA.debugLine="Sub SetColumnIcon(colName As String, colIcon As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 923;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 924;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 925;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 926;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 927;BA.debugLine="col.Put(\"icon\", colIcon)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("icon"))),(Object)((_colicon)));
 BA.debugLineNum = 928;BA.debugLine="col.Put(\"type\", COLUMN_ICON)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((__ref.getField(true,"_column_icon" /*RemoteObject*/ ))));
 BA.debugLineNum = 929;BA.debugLine="col.Put(\"filterable\", False)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("filterable"))),(Object)((vmgijgotable.__c.getField(true,"False"))));
 BA.debugLineNum = 930;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 932;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 933;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnitalic(RemoteObject __ref,RemoteObject _colname) throws Exception{
try {
		Debug.PushSubsStack("SetColumnItalic (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,1016);
if (RapidSub.canDelegate("setcolumnitalic")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnitalic", __ref, _colname);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1016;BA.debugLine="Sub SetColumnItalic(colName As String) As VMGijgoT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1017;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1018;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 1019;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 1020;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 1021;BA.debugLine="col.Put(\"headerCssClass\", \"italic\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("headerCssClass"))),(Object)((RemoteObject.createImmutable("italic"))));
 BA.debugLineNum = 1022;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 1024;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1025;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnminwidth(RemoteObject __ref,RemoteObject _colfield,RemoteObject _colminwidth,RemoteObject _colpriority) throws Exception{
try {
		Debug.PushSubsStack("SetColumnMinWidth (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,826);
if (RapidSub.canDelegate("setcolumnminwidth")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnminwidth", __ref, _colfield, _colminwidth, _colpriority);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colField", _colfield);
Debug.locals.put("colMinWidth", _colminwidth);
Debug.locals.put("colPriority", _colpriority);
 BA.debugLineNum = 826;BA.debugLine="Sub SetColumnMinWidth(colField As String, colMinWi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 827;BA.debugLine="colField = colField.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 828;BA.debugLine="colField = colField.tolowercase";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"toLowerCase");Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 829;BA.debugLine="If columnsM.ContainsKey(colField) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colfield))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 830;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colfield))));Debug.locals.put("col", _col);
 BA.debugLineNum = 831;BA.debugLine="col.Put(\"minWidth\", colMinWidth)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("minWidth"))),(Object)((_colminwidth)));
 BA.debugLineNum = 832;BA.debugLine="col.Put(\"priority\", colPriority)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("priority"))),(Object)((_colpriority)));
 BA.debugLineNum = 833;BA.debugLine="columnsM.Put(colField,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colfield)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 835;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 836;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnmodeeditonly(RemoteObject __ref,RemoteObject _colfield) throws Exception{
try {
		Debug.PushSubsStack("SetColumnModeEditOnly (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("setcolumnmodeeditonly")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnmodeeditonly", __ref, _colfield);}
RemoteObject _strcol = RemoteObject.createImmutable("");
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 230;BA.debugLine="Sub SetColumnModeEditOnly(colField As List) As VMG";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="For Each strCol As String In colField";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _colfield;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strCol", _strcol);
Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 232;BA.debugLine="strCol = strCol.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_strcol = _strcol.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 233;BA.debugLine="strCol = strCol.tolowercase";
Debug.JustUpdateDeviceLine();
_strcol = _strcol.runMethod(true,"toLowerCase");Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 234;BA.debugLine="If columnsM.ContainsKey(strCol) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_strcol))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 235;BA.debugLine="Dim col As Map = columnsM.Get(strCol)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strcol))));Debug.locals.put("col", _col);
 BA.debugLineNum = 236;BA.debugLine="col.Put(\"mode\", \"editOnly\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mode"))),(Object)((RemoteObject.createImmutable("editOnly"))));
 BA.debugLineNum = 237;BA.debugLine="columnsM.Put(strCol,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strcol)),(Object)((_col.getObject())));
 };
 }
}Debug.locals.put("strCol", _strcol);
;
 BA.debugLineNum = 240;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnmodereadonly(RemoteObject __ref,RemoteObject _colfield) throws Exception{
try {
		Debug.PushSubsStack("SetColumnModeReadOnly (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("setcolumnmodereadonly")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnmodereadonly", __ref, _colfield);}
RemoteObject _strcol = RemoteObject.createImmutable("");
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 216;BA.debugLine="Sub SetColumnModeReadOnly(colField As List) As VMG";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="For Each strCol As String In colField";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _colfield;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strCol", _strcol);
Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 218;BA.debugLine="strCol = strCol.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_strcol = _strcol.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 219;BA.debugLine="strCol = strCol.tolowercase";
Debug.JustUpdateDeviceLine();
_strcol = _strcol.runMethod(true,"toLowerCase");Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 220;BA.debugLine="If columnsM.ContainsKey(strCol) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_strcol))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 221;BA.debugLine="Dim col As Map = columnsM.Get(strCol)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_strcol))));Debug.locals.put("col", _col);
 BA.debugLineNum = 222;BA.debugLine="col.Put(\"mode\", \"readOnly\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mode"))),(Object)((RemoteObject.createImmutable("readOnly"))));
 BA.debugLineNum = 223;BA.debugLine="columnsM.Put(strCol,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strcol)),(Object)((_col.getObject())));
 };
 }
}Debug.locals.put("strCol", _strcol);
;
 BA.debugLineNum = 226;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnname(RemoteObject __ref,RemoteObject _colfield,RemoteObject _colname) throws Exception{
try {
		Debug.PushSubsStack("SetColumnName (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,876);
if (RapidSub.canDelegate("setcolumnname")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnname", __ref, _colfield, _colname);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colField", _colfield);
Debug.locals.put("colName", _colname);
 BA.debugLineNum = 876;BA.debugLine="Sub SetColumnName(colField As String, colName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 877;BA.debugLine="colField = colField.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 878;BA.debugLine="colField = colField.tolowercase";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"toLowerCase");Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 879;BA.debugLine="If columnsM.ContainsKey(colField) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colfield))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 880;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colfield))));Debug.locals.put("col", _col);
 BA.debugLineNum = 881;BA.debugLine="col.Put(\"name\", colName)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_colname)));
 BA.debugLineNum = 882;BA.debugLine="columnsM.Put(colField,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colfield)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 884;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 885;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnproperty(RemoteObject __ref,RemoteObject _colfield,RemoteObject _colproperty,RemoteObject _colvalue) throws Exception{
try {
		Debug.PushSubsStack("SetColumnProperty (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("setcolumnproperty")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnproperty", __ref, _colfield, _colproperty, _colvalue);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colField", _colfield);
Debug.locals.put("colProperty", _colproperty);
Debug.locals.put("colValue", _colvalue);
 BA.debugLineNum = 259;BA.debugLine="Sub SetColumnProperty(colField As String, colPrope";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 260;BA.debugLine="colField = colField.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 261;BA.debugLine="If columnsM.ContainsKey(colField) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colfield))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 262;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colfield))));Debug.locals.put("col", _col);
 BA.debugLineNum = 263;BA.debugLine="col.Put(colProperty, colValue)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)((_colproperty)),(Object)(_colvalue));
 BA.debugLineNum = 264;BA.debugLine="columnsM.Put(colField,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colfield)),(Object)((_col.getObject())));
 };
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
public static RemoteObject  _setcolumnrenderer(RemoteObject __ref,RemoteObject _colfield,RemoteObject _colmethod) throws Exception{
try {
		Debug.PushSubsStack("SetColumnRenderer (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,288);
if (RapidSub.canDelegate("setcolumnrenderer")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnrenderer", __ref, _colfield, _colmethod);}
RemoteObject _value = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _displayel = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colField", _colfield);
Debug.locals.put("colMethod", _colmethod);
 BA.debugLineNum = 288;BA.debugLine="Sub SetColumnRenderer(colField As String, colMetho";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 289;BA.debugLine="colMethod = colMethod.tolowercase";
Debug.JustUpdateDeviceLine();
_colmethod = _colmethod.runMethod(true,"toLowerCase");Debug.locals.put("colMethod", _colmethod);
 BA.debugLineNum = 290;BA.debugLine="Dim value, record, cell, displayEl As Map";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("value", _value);
_record = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("record", _record);
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("cell", _cell);
_displayel = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("displayEl", _displayel);
 BA.debugLineNum = 291;BA.debugLine="colField = colField.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 292;BA.debugLine="colField = colField.tolowercase";
Debug.JustUpdateDeviceLine();
_colfield = _colfield.runMethod(true,"toLowerCase");Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 293;BA.debugLine="If columnsM.ContainsKey(colField) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colfield))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 294;BA.debugLine="Dim col As Map = columnsM.Get(colField)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colfield))));Debug.locals.put("col", _col);
 BA.debugLineNum = 295;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(mCallBack,$\"";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("renderer"))),(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_mcallback" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_eventname" /*RemoteObject*/ )))),RemoteObject.createImmutable("_"),vmgijgotable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colmethod))),RemoteObject.createImmutable("")))),(Object)(vmgijgotable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_value.getObject()),(_record.getObject()),(_cell.getObject()),(_displayel.getObject())})))))));
 BA.debugLineNum = 296;BA.debugLine="columnsM.Put(colField,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colfield)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsalignmentcenter(RemoteObject __ref,RemoteObject _flds) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsAlignmentCenter (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,646);
if (RapidSub.canDelegate("setcolumnsalignmentcenter")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsalignmentcenter", __ref, _flds);}
Debug.locals.put("flds", _flds);
 BA.debugLineNum = 646;BA.debugLine="Sub SetColumnsAlignmentCenter(flds As List) As VMG";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 647;BA.debugLine="SetCenterAlignColumns(flds)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcenteraligncolumns" /*RemoteObject*/ ,(Object)(_flds));
 BA.debugLineNum = 648;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 649;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsalignmentright(RemoteObject __ref,RemoteObject _flds) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsAlignmentRight (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,653);
if (RapidSub.canDelegate("setcolumnsalignmentright")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsalignmentright", __ref, _flds);}
Debug.locals.put("flds", _flds);
 BA.debugLineNum = 653;BA.debugLine="Sub SetColumnsAlignmentRight(flds As List) As VMGi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 654;BA.debugLine="SetRightAlignColumns(flds)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setrightaligncolumns" /*RemoteObject*/ ,(Object)(_flds));
 BA.debugLineNum = 655;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 656;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsfilterable(RemoteObject __ref,RemoteObject _colnames,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsFilterable (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,948);
if (RapidSub.canDelegate("setcolumnsfilterable")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsfilterable", __ref, _colnames, _b);}
RemoteObject _col = RemoteObject.createImmutable("");
Debug.locals.put("colNames", _colnames);
Debug.locals.put("b", _b);
 BA.debugLineNum = 948;BA.debugLine="Sub SetColumnsFilterable(colNames As List, b As Bo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 949;BA.debugLine="For Each col As String In colNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _colnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 950;BA.debugLine="SetColumnFilterable(col, b)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnfilterable" /*RemoteObject*/ ,(Object)(_col),(Object)(_b));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 952;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsformat(RemoteObject __ref,RemoteObject _colnames,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsFormat (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,954);
if (RapidSub.canDelegate("setcolumnsformat")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsformat", __ref, _colnames, _f);}
RemoteObject _col = RemoteObject.createImmutable("");
Debug.locals.put("colNames", _colnames);
Debug.locals.put("f", _f);
 BA.debugLineNum = 954;BA.debugLine="Sub SetColumnsFormat(colNames As List, f As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 955;BA.debugLine="For Each col As String In colNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _colnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 956;BA.debugLine="SetColumnFormat(col, f)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnformat" /*RemoteObject*/ ,(Object)(_col),(Object)(_f));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 958;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsformatdate(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsFormatDate (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,723);
if (RapidSub.canDelegate("setcolumnsformatdate")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsformatdate", __ref, _dates);}
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 723;BA.debugLine="Sub SetColumnsFormatDate(dates As List) As VMGijgo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 724;BA.debugLine="SetDateColumns(dates)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setdatecolumns" /*RemoteObject*/ ,(Object)(_dates));
 BA.debugLineNum = 725;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 726;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsformatdatetime(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsFormatDateTime (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,736);
if (RapidSub.canDelegate("setcolumnsformatdatetime")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsformatdatetime", __ref, _dates);}
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 736;BA.debugLine="Sub SetColumnsFormatDateTime(dates As List) As VMG";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 737;BA.debugLine="SetDateTimeColumns(dates)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setdatetimecolumns" /*RemoteObject*/ ,(Object)(_dates));
 BA.debugLineNum = 738;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 739;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsformatfilesize(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsFormatFileSize (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,750);
if (RapidSub.canDelegate("setcolumnsformatfilesize")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsformatfilesize", __ref, _dates);}
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 750;BA.debugLine="Sub SetColumnsFormatFileSize(dates As List) As VMG";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 751;BA.debugLine="SetFileSizeColumns(dates)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setfilesizecolumns" /*RemoteObject*/ ,(Object)(_dates));
 BA.debugLineNum = 752;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 753;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsformatmoney(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsFormatMoney (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,769);
if (RapidSub.canDelegate("setcolumnsformatmoney")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsformatmoney", __ref, _dates);}
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 769;BA.debugLine="Sub SetColumnsFormatMoney(dates As List) As VMGijg";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 770;BA.debugLine="SetMoneyColumns(dates)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setmoneycolumns" /*RemoteObject*/ ,(Object)(_dates));
 BA.debugLineNum = 771;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 772;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsformattime(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsFormatTime (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,764);
if (RapidSub.canDelegate("setcolumnsformattime")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsformattime", __ref, _dates);}
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 764;BA.debugLine="Sub SetColumnsFormatTime(dates As List) As VMGijgo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 765;BA.debugLine="SetTimeColumns(dates)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_settimecolumns" /*RemoteObject*/ ,(Object)(_dates));
 BA.debugLineNum = 766;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 767;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnshidden(RemoteObject __ref,RemoteObject _colnames) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsHidden (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,936);
if (RapidSub.canDelegate("setcolumnshidden")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnshidden", __ref, _colnames);}
RemoteObject _col = RemoteObject.createImmutable("");
Debug.locals.put("colNames", _colnames);
 BA.debugLineNum = 936;BA.debugLine="Sub SetColumnsHidden(colNames As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 937;BA.debugLine="For Each col As String In colNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _colnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 938;BA.debugLine="SetColumnHidden(col)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnhidden" /*RemoteObject*/ ,(Object)(_col));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 940;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnsortable(RemoteObject __ref,RemoteObject _colname,RemoteObject _colsortable) throws Exception{
try {
		Debug.PushSubsStack("SetColumnSortable (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,988);
if (RapidSub.canDelegate("setcolumnsortable")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnsortable", __ref, _colname, _colsortable);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colSortable", _colsortable);
 BA.debugLineNum = 988;BA.debugLine="Sub SetColumnSortable(colName As String, colSortab";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 989;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 990;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 991;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 992;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 993;BA.debugLine="col.Put(\"sortable\", colSortable)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("sortable"))),(Object)((_colsortable)));
 BA.debugLineNum = 994;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 996;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 997;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnssortable(RemoteObject __ref,RemoteObject _colnames,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetColumnsSortable (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,942);
if (RapidSub.canDelegate("setcolumnssortable")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnssortable", __ref, _colnames, _b);}
RemoteObject _col = RemoteObject.createImmutable("");
Debug.locals.put("colNames", _colnames);
Debug.locals.put("b", _b);
 BA.debugLineNum = 942;BA.debugLine="Sub SetColumnsSortable(colNames As List, b As Bool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 943;BA.debugLine="For Each col As String In colNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _colnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_col = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("col", _col);
Debug.locals.put("col", _col);
 BA.debugLineNum = 944;BA.debugLine="SetColumnSortable(col, b)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnsortable" /*RemoteObject*/ ,(Object)(_col),(Object)(_b));
 }
}Debug.locals.put("col", _col);
;
 BA.debugLineNum = 946;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnstoppropagation(RemoteObject __ref,RemoteObject _colname,RemoteObject _colstoppropagation) throws Exception{
try {
		Debug.PushSubsStack("SetColumnStopPropagation (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,902);
if (RapidSub.canDelegate("setcolumnstoppropagation")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnstoppropagation", __ref, _colname, _colstoppropagation);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colStopPropagation", _colstoppropagation);
 BA.debugLineNum = 902;BA.debugLine="Sub SetColumnStopPropagation(colName As String, co";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 903;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 904;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 906;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 907;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 908;BA.debugLine="col.Put(\"stopPropagation\", colStopPropagation)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stopPropagation"))),(Object)((_colstoppropagation)));
 BA.debugLineNum = 909;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 911;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 912;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumntmpl(RemoteObject __ref,RemoteObject _colname,RemoteObject _coltmpl) throws Exception{
try {
		Debug.PushSubsStack("SetColumnTmpl (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,668);
if (RapidSub.canDelegate("setcolumntmpl")) { return __ref.runUserSub(false, "vmgijgotable","setcolumntmpl", __ref, _colname, _coltmpl);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("coltmpl", _coltmpl);
 BA.debugLineNum = 668;BA.debugLine="Sub SetColumnTmpl(colName As String, coltmpl As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 669;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 670;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 671;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 672;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 673;BA.debugLine="col.Put(\"tmpl\", coltmpl)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tmpl"))),(Object)((_coltmpl)));
 BA.debugLineNum = 674;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 676;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 677;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumntooltip(RemoteObject __ref,RemoteObject _colname,RemoteObject _coltooltip) throws Exception{
try {
		Debug.PushSubsStack("SetColumnToolTip (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,889);
if (RapidSub.canDelegate("setcolumntooltip")) { return __ref.runUserSub(false, "vmgijgotable","setcolumntooltip", __ref, _colname, _coltooltip);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colToolTip", _coltooltip);
 BA.debugLineNum = 889;BA.debugLine="Sub SetColumnToolTip(colName As String, colToolTip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 890;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 891;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 893;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 894;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 895;BA.debugLine="col.Put(\"tooltip\", colToolTip)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tooltip"))),(Object)((_coltooltip)));
 BA.debugLineNum = 896;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 898;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 899;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumntype(RemoteObject __ref,RemoteObject _colname,RemoteObject _coltype) throws Exception{
try {
		Debug.PushSubsStack("SetColumnType (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,680);
if (RapidSub.canDelegate("setcolumntype")) { return __ref.runUserSub(false, "vmgijgotable","setcolumntype", __ref, _colname, _coltype);}
RemoteObject _value = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _cell = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _displayel = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colType", _coltype);
 BA.debugLineNum = 680;BA.debugLine="Sub SetColumnType(colName As String, colType As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 681;BA.debugLine="Dim value, record, cell, displayEl As Map";
Debug.JustUpdateDeviceLine();
_value = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("value", _value);
_record = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("record", _record);
_cell = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("cell", _cell);
_displayel = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("displayEl", _displayel);
 BA.debugLineNum = 682;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 683;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 685;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 686;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 687;BA.debugLine="col.Put(\"type\", colType)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((_coltype)));
 BA.debugLineNum = 688;BA.debugLine="Select Case colType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_coltype,__ref.getField(true,"_column_image" /*RemoteObject*/ ),__ref.getField(true,"_column_money" /*RemoteObject*/ ),__ref.getField(true,"_column_filesize" /*RemoteObject*/ ),__ref.getField(true,"_column_date" /*RemoteObject*/ ),__ref.getField(true,"_column_time" /*RemoteObject*/ ),__ref.getField(true,"_column_datetime" /*RemoteObject*/ ),__ref.getField(true,"_column_iconrender" /*RemoteObject*/ ))) {
case 0: {
 BA.debugLineNum = 690;BA.debugLine="col.Put(\"type\", \"text\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("text"))));
 BA.debugLineNum = 691;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"imager";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("renderer"))),(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref),(Object)(BA.ObjectToString("imagerender")),(Object)(vmgijgotable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_value.getObject()),(_record.getObject()),(_cell.getObject()),(_displayel.getObject())})))))));
 break; }
case 1: {
 BA.debugLineNum = 693;BA.debugLine="col.Put(\"type\", \"text\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("text"))));
 BA.debugLineNum = 694;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"moneyr";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("renderer"))),(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref),(Object)(BA.ObjectToString("moneyrender")),(Object)(vmgijgotable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_value.getObject()),(_record.getObject()),(_cell.getObject()),(_displayel.getObject())})))))));
 BA.debugLineNum = 695;BA.debugLine="col.Put(\"align\", ALIGN_RIGHT)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("align"))),(Object)((__ref.getField(true,"_align_right" /*RemoteObject*/ ))));
 break; }
case 2: {
 BA.debugLineNum = 697;BA.debugLine="col.Put(\"type\", \"text\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("text"))));
 BA.debugLineNum = 698;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"filere";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("renderer"))),(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref),(Object)(BA.ObjectToString("filerender")),(Object)(vmgijgotable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_value.getObject()),(_record.getObject()),(_cell.getObject()),(_displayel.getObject())})))))));
 BA.debugLineNum = 699;BA.debugLine="col.Put(\"align\", ALIGN_RIGHT)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("align"))),(Object)((__ref.getField(true,"_align_right" /*RemoteObject*/ ))));
 break; }
case 3: {
 BA.debugLineNum = 701;BA.debugLine="col.Put(\"format\", \"yyyy-mm-dd\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("format"))),(Object)((RemoteObject.createImmutable("yyyy-mm-dd"))));
 break; }
case 4: {
 BA.debugLineNum = 703;BA.debugLine="col.Put(\"format\", \"HH:MM\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("format"))),(Object)((RemoteObject.createImmutable("HH:MM"))));
 break; }
case 5: {
 BA.debugLineNum = 705;BA.debugLine="col.Put(\"format\", \"yyyy-mm-dd HH:MM\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("format"))),(Object)((RemoteObject.createImmutable("yyyy-mm-dd HH:MM"))));
 break; }
case 6: {
 BA.debugLineNum = 707;BA.debugLine="col.Put(\"type\", \"text\")";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("type"))),(Object)((RemoteObject.createImmutable("text"))));
 BA.debugLineNum = 708;BA.debugLine="col.Put(\"renderer\", Banano.CallBack(Me,\"iconre";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("renderer"))),(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref),(Object)(BA.ObjectToString("iconrender")),(Object)(vmgijgotable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {4},new Object[] {(_value.getObject()),(_record.getObject()),(_cell.getObject()),(_displayel.getObject())})))))));
 break; }
}
;
 BA.debugLineNum = 710;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 712;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 713;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnwidth(RemoteObject __ref,RemoteObject _colname,RemoteObject _colwidth) throws Exception{
try {
		Debug.PushSubsStack("SetColumnWidth (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,611);
if (RapidSub.canDelegate("setcolumnwidth")) { return __ref.runUserSub(false, "vmgijgotable","setcolumnwidth", __ref, _colname, _colwidth);}
RemoteObject _col = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("colName", _colname);
Debug.locals.put("colWidth", _colwidth);
 BA.debugLineNum = 611;BA.debugLine="Sub SetColumnWidth(colName As String, colWidth As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 612;BA.debugLine="colName = colName.Replace(\" \",\"\")";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"replace",(Object)(BA.ObjectToString(" ")),(Object)(RemoteObject.createImmutable("")));Debug.locals.put("colName", _colname);
 BA.debugLineNum = 613;BA.debugLine="colName = colName.tolowercase";
Debug.JustUpdateDeviceLine();
_colname = _colname.runMethod(true,"toLowerCase");Debug.locals.put("colName", _colname);
 BA.debugLineNum = 614;BA.debugLine="If columnsM.ContainsKey(colName) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_colname))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 615;BA.debugLine="Dim col As Map = columnsM.Get(colName)";
Debug.JustUpdateDeviceLine();
_col = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_col.setObject(__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_colname))));Debug.locals.put("col", _col);
 BA.debugLineNum = 616;BA.debugLine="col.Put(\"width\", colWidth)";
Debug.JustUpdateDeviceLine();
_col.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((_colwidth)));
 BA.debugLineNum = 617;BA.debugLine="columnsM.Put(colName,col)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_columnsm" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_colname)),(Object)((_col.getObject())));
 };
 BA.debugLineNum = 619;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 620;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdatasource(RemoteObject __ref,RemoteObject _rows) throws Exception{
try {
		Debug.PushSubsStack("SetDataSource (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("setdatasource")) { return __ref.runUserSub(false, "vmgijgotable","setdatasource", __ref, _rows);}
Debug.locals.put("rows", _rows);
 BA.debugLineNum = 169;BA.debugLine="Sub SetDataSource(rows As List) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="If rows.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_rows.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 171;BA.debugLine="DataSource = Array()";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datasource" /*RemoteObject*/ ,vmgijgotable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 }else {
 BA.debugLineNum = 173;BA.debugLine="DataSource = rows";
Debug.JustUpdateDeviceLine();
__ref.setField ("_datasource" /*RemoteObject*/ ,_rows);
 };
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
public static RemoteObject  _setdatecolumns(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetDateColumns (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,716);
if (RapidSub.canDelegate("setdatecolumns")) { return __ref.runUserSub(false, "vmgijgotable","setdatecolumns", __ref, _dates);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 716;BA.debugLine="Sub SetDateColumns(dates As List) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 717;BA.debugLine="For Each k As String In dates";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _dates;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 718;BA.debugLine="SetColumnType(k, COLUMN_DATE)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_k),(Object)(__ref.getField(true,"_column_date" /*RemoteObject*/ )));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 720;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 721;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdatetimecolumns(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetDateTimeColumns (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,729);
if (RapidSub.canDelegate("setdatetimecolumns")) { return __ref.runUserSub(false, "vmgijgotable","setdatetimecolumns", __ref, _dates);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 729;BA.debugLine="Sub SetDateTimeColumns(dates As List) As VMGijgoTa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 730;BA.debugLine="For Each k As String In dates";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _dates;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 731;BA.debugLine="SetColumnType(k, COLUMN_DATETIME)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_k),(Object)(__ref.getField(true,"_column_datetime" /*RemoteObject*/ )));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 733;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 734;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmgijgotable","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 145;BA.debugLine="Sub SetDisabled(b As Boolean) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Table.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 147;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfilesizecolumns(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetFileSizeColumns (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,743);
if (RapidSub.canDelegate("setfilesizecolumns")) { return __ref.runUserSub(false, "vmgijgotable","setfilesizecolumns", __ref, _dates);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 743;BA.debugLine="Sub SetFileSizeColumns(dates As List) As VMGijgoTa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 744;BA.debugLine="For Each k As String In dates";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _dates;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 745;BA.debugLine="SetColumnType(k, COLUMN_FILESIZE)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_k),(Object)(__ref.getField(true,"_column_filesize" /*RemoteObject*/ )));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 747;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 748;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetKey (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmgijgotable","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 123;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMGijg";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="Table.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
 BA.debugLineNum = 125;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmoneycolumns(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetMoneyColumns (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,775);
if (RapidSub.canDelegate("setmoneycolumns")) { return __ref.runUserSub(false, "vmgijgotable","setmoneycolumns", __ref, _dates);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 775;BA.debugLine="Sub SetMoneyColumns(dates As List) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 776;BA.debugLine="For Each k As String In dates";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _dates;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 777;BA.debugLine="SetColumnType(k, COLUMN_MONEY)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_k),(Object)(__ref.getField(true,"_column_money" /*RemoteObject*/ )));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 779;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 780;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrightaligncolumns(RemoteObject __ref,RemoteObject _flds) throws Exception{
try {
		Debug.PushSubsStack("SetRightAlignColumns (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,659);
if (RapidSub.canDelegate("setrightaligncolumns")) { return __ref.runUserSub(false, "vmgijgotable","setrightaligncolumns", __ref, _flds);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("flds", _flds);
 BA.debugLineNum = 659;BA.debugLine="Sub SetRightAlignColumns(flds As List) As VMGijgoT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 660;BA.debugLine="For Each k As String In flds";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _flds;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 661;BA.debugLine="SetColumnAlignment(k, ALIGN_RIGHT)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumnalignment" /*RemoteObject*/ ,(Object)(_k),(Object)(__ref.getField(true,"_align_right" /*RemoteObject*/ )));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 663;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 664;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselected(RemoteObject __ref,RemoteObject _rowpos) throws Exception{
try {
		Debug.PushSubsStack("SetSelected (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,871);
if (RapidSub.canDelegate("setselected")) { return __ref.runUserSub(false, "vmgijgotable","setselected", __ref, _rowpos);}
Debug.locals.put("rowPos", _rowpos);
 BA.debugLineNum = 871;BA.debugLine="Sub SetSelected(rowPos As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 872;BA.debugLine="grid.runmethod(\"setSelected\", Array(rowPos))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("setSelected")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_rowpos)}))));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmgijgotable","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 113;BA.debugLine="Sub SetStyle(sm As Map) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="Table.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settimecolumns(RemoteObject __ref,RemoteObject _dates) throws Exception{
try {
		Debug.PushSubsStack("SetTimeColumns (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,757);
if (RapidSub.canDelegate("settimecolumns")) { return __ref.runUserSub(false, "vmgijgotable","settimecolumns", __ref, _dates);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("dates", _dates);
 BA.debugLineNum = 757;BA.debugLine="Sub SetTimeColumns(dates As List) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 758;BA.debugLine="For Each k As String In dates";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _dates;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 759;BA.debugLine="SetColumnType(k, COLUMN_TIME)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmgijgotable.class, "_setcolumntype" /*RemoteObject*/ ,(Object)(_k),(Object)(__ref.getField(true,"_column_time" /*RemoteObject*/ )));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 761;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 762;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTitle (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,361);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmgijgotable","settitle", __ref, _stitle);}
RemoteObject _spantitle = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("sTitle", _stitle);
 BA.debugLineNum = 361;BA.debugLine="Sub SetTitle(sTitle As String) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 362;BA.debugLine="Dim spanTitle As VMElement";
Debug.JustUpdateDeviceLine();
_spantitle = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("spanTitle", _spantitle);
 BA.debugLineNum = 363;BA.debugLine="spanTitle.Initialize(vue,\"\").SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
_spantitle.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 364;BA.debugLine="spanTitle.SetText(sTitle)";
Debug.JustUpdateDeviceLine();
_spantitle.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_stitle));
 BA.debugLineNum = 365;BA.debugLine="ToolBar.AddComponent(1,1,spanTitle.ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_addcomponent" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 1)),(Object)(BA.numberCast(int.class, 1)),(Object)(_spantitle.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmgijgotable","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 118;BA.debugLine="Sub SetVIf(vif As Object) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Table.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 120;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmgijgotable","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 128;BA.debugLine="Sub SetVShow(vif As Object) As VMGijgoTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="Table.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 130;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _showcolumn(RemoteObject __ref,RemoteObject _colfield) throws Exception{
try {
		Debug.PushSubsStack("ShowColumn (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,329);
if (RapidSub.canDelegate("showcolumn")) { return __ref.runUserSub(false, "vmgijgotable","showcolumn", __ref, _colfield);}
RemoteObject _strcol = RemoteObject.createImmutable("");
Debug.locals.put("colField", _colfield);
 BA.debugLineNum = 329;BA.debugLine="Sub ShowColumn(colField As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 330;BA.debugLine="For Each strCol As String In colField";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _colfield;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strcol = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strCol", _strcol);
Debug.locals.put("strCol", _strcol);
 BA.debugLineNum = 331;BA.debugLine="grid.RunMethod(\"showColumn\",Array(strCol))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("showColumn")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_strcol)}))));
 }
}Debug.locals.put("strCol", _strcol);
;
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmgijgotable","tostring", __ref);}
 BA.debugLineNum = 107;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="ToolbarTemplate = ToolBar.tostring";
Debug.JustUpdateDeviceLine();
__ref.setField ("_toolbartemplate" /*RemoteObject*/ ,__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmgrid.class, "_tostring" /*RemoteObject*/ ));
 BA.debugLineNum = 109;BA.debugLine="Return Table.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _unselectall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("UnSelectAll (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,856);
if (RapidSub.canDelegate("unselectall")) { return __ref.runUserSub(false, "vmgijgotable","unselectall", __ref);}
 BA.debugLineNum = 856;BA.debugLine="Sub UnSelectAll";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 857;BA.debugLine="grid.RunMethod(\"unSelectAll\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("unSelectAll")),(Object)(vmgijgotable.__c.getField(false,"Null")));
 BA.debugLineNum = 858;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updaterow(RemoteObject __ref,RemoteObject _rowdata) throws Exception{
try {
		Debug.PushSubsStack("UpdateRow (vmgijgotable) ","vmgijgotable",60,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("updaterow")) { return __ref.runUserSub(false, "vmgijgotable","updaterow", __ref, _rowdata);}
RemoteObject _pk = RemoteObject.createImmutable("");
Debug.locals.put("rowData", _rowdata);
 BA.debugLineNum = 464;BA.debugLine="Sub UpdateRow(rowData As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 465;BA.debugLine="Dim pk As String = rowData.Get(PrimaryKey)";
Debug.JustUpdateDeviceLine();
_pk = BA.ObjectToString(_rowdata.runMethod(false,"Get",(Object)((__ref.getField(true,"_primarykey" /*RemoteObject*/ )))));Debug.locals.put("pk", _pk);Debug.locals.put("pk", _pk);
 BA.debugLineNum = 466;BA.debugLine="grid.runmethod(\"updateRow\", Array(pk, rowData))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_grid" /*RemoteObject*/ ).runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("updateRow")),(Object)((RemoteObject.createNewArray("Object",new int[] {2},new Object[] {(_pk),(_rowdata.getObject())}))));
 BA.debugLineNum = 467;BA.debugLine="End Sub";
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