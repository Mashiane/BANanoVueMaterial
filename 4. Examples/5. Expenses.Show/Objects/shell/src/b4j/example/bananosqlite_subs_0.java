package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bananosqlite_subs_0 {


public static RemoteObject  _addblobs(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddBlobs (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,513);
if (RapidSub.canDelegate("addblobs")) { return __ref.runUserSub(false, "bananosqlite","addblobs", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 513;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 514;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 515;BA.debugLine="recType.Put(strfld,\"BLOB\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("BLOB"))));
 }
}Debug.locals.put("strfld", _strfld);
;
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
public static RemoteObject  _addbooleans(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddBooleans (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,505);
if (RapidSub.canDelegate("addbooleans")) { return __ref.runUserSub(false, "bananosqlite","addbooleans", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 505;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoSQLit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 506;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 507;BA.debugLine="recType.Put(strfld,\"BOOL\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("BOOL"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 509;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 510;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddoubles(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddDoubles (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,497);
if (RapidSub.canDelegate("adddoubles")) { return __ref.runUserSub(false, "bananosqlite","adddoubles", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 497;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 498;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 499;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("DOUBLE"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 501;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 502;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addintegers(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddIntegers (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,489);
if (RapidSub.canDelegate("addintegers")) { return __ref.runUserSub(false, "bananosqlite","addintegers", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 489;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoSQLit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 490;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 491;BA.debugLine="recType.Put(strfld,\"INT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("INT"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 493;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 494;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstrings(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddStrings (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("addstrings")) { return __ref.runUserSub(false, "bananosqlite","addstrings", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 481;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 482;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 483;BA.debugLine="recType.Put(strfld,\"STRING\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("STRING"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 485;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 486;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _build(RemoteObject __ref,RemoteObject _rslt) throws Exception{
try {
		Debug.PushSubsStack("Build (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,777);
if (RapidSub.canDelegate("build")) { return __ref.runUserSub(false, "bananosqlite","build", __ref, _rslt);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("rslt", _rslt);
 BA.debugLineNum = 777;BA.debugLine="Sub Build(rslt As SQLiteResultSet) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 778;BA.debugLine="Dim b As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_b = bananosqlite.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 779;BA.debugLine="If dbName = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_dbname" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 780;BA.debugLine="Log(\"BANanoSQLite.Build: The database name has n";
Debug.JustUpdateDeviceLine();
bananosqlite.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("BANanoSQLite.Build: The database name has not been set!")));
 BA.debugLineNum = 781;BA.debugLine="Return b";
Debug.JustUpdateDeviceLine();
if (true) return _b;
 };
 BA.debugLineNum = 783;BA.debugLine="b.Put(\"dbname\", dbName)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dbname"))),(Object)((__ref.getField(true,"_dbname" /*RemoteObject*/ ))));
 BA.debugLineNum = 784;BA.debugLine="b.Put(\"command\", rslt.command)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("command"))),(Object)((_rslt.getField(true,"command" /*RemoteObject*/ ))));
 BA.debugLineNum = 785;BA.debugLine="b.Put(\"query\", rslt.query)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("query"))),(Object)((_rslt.getField(true,"query" /*RemoteObject*/ ))));
 BA.debugLineNum = 786;BA.debugLine="b.Put(\"args\", rslt.args)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("args"))),(Object)((_rslt.getField(false,"args" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 787;BA.debugLine="b.Put(\"types\", rslt.types)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("types"))),(Object)((_rslt.getField(false,"types" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 788;BA.debugLine="Return b";
Debug.JustUpdateDeviceLine();
if (true) return _b;
 BA.debugLineNum = 789;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public const DB_VARCHAR_20 As String = \"VARCHAR(2";
bananosqlite._db_varchar_20 = BA.ObjectToString("VARCHAR(20)");__ref.setField("_db_varchar_20",bananosqlite._db_varchar_20);
 //BA.debugLineNum = 4;BA.debugLine="Public const DB_VARCHAR_10 As String = \"VARCHAR(1";
bananosqlite._db_varchar_10 = BA.ObjectToString("VARCHAR(10)");__ref.setField("_db_varchar_10",bananosqlite._db_varchar_10);
 //BA.debugLineNum = 5;BA.debugLine="Public const DB_VARCHAR_30 As String = \"VARCHAR(3";
bananosqlite._db_varchar_30 = BA.ObjectToString("VARCHAR(30)");__ref.setField("_db_varchar_30",bananosqlite._db_varchar_30);
 //BA.debugLineNum = 6;BA.debugLine="Public const DB_VARCHAR_40 As String = \"VARCHAR(4";
bananosqlite._db_varchar_40 = BA.ObjectToString("VARCHAR(40)");__ref.setField("_db_varchar_40",bananosqlite._db_varchar_40);
 //BA.debugLineNum = 7;BA.debugLine="Public const DB_VARCHAR_50 As String = \"VARCHAR(5";
bananosqlite._db_varchar_50 = BA.ObjectToString("VARCHAR(50)");__ref.setField("_db_varchar_50",bananosqlite._db_varchar_50);
 //BA.debugLineNum = 8;BA.debugLine="Public const DB_VARCHAR_100 As String = \"VARCHAR(";
bananosqlite._db_varchar_100 = BA.ObjectToString("VARCHAR(100)");__ref.setField("_db_varchar_100",bananosqlite._db_varchar_100);
 //BA.debugLineNum = 9;BA.debugLine="Public const DB_VARCHAR_255 As String = \"VARCHAR(";
bananosqlite._db_varchar_255 = BA.ObjectToString("VARCHAR(255)");__ref.setField("_db_varchar_255",bananosqlite._db_varchar_255);
 //BA.debugLineNum = 10;BA.debugLine="Public const DB_STRING As String = \"TEXT\"";
bananosqlite._db_string = BA.ObjectToString("TEXT");__ref.setField("_db_string",bananosqlite._db_string);
 //BA.debugLineNum = 11;BA.debugLine="Public const DB_INT As String = \"INT\"";
bananosqlite._db_int = BA.ObjectToString("INT");__ref.setField("_db_int",bananosqlite._db_int);
 //BA.debugLineNum = 12;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
bananosqlite._db_float = BA.ObjectToString("FLOAT");__ref.setField("_db_float",bananosqlite._db_float);
 //BA.debugLineNum = 13;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
bananosqlite._db_blob = BA.ObjectToString("BLOB");__ref.setField("_db_blob",bananosqlite._db_blob);
 //BA.debugLineNum = 14;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
bananosqlite._db_bool = BA.ObjectToString("BOOL");__ref.setField("_db_bool",bananosqlite._db_bool);
 //BA.debugLineNum = 15;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
bananosqlite._db_real = BA.ObjectToString("REAL");__ref.setField("_db_real",bananosqlite._db_real);
 //BA.debugLineNum = 16;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
bananosqlite._db_date = BA.ObjectToString("DATE");__ref.setField("_db_date",bananosqlite._db_date);
 //BA.debugLineNum = 17;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
bananosqlite._db_integer = BA.ObjectToString("INTEGER");__ref.setField("_db_integer",bananosqlite._db_integer);
 //BA.debugLineNum = 18;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
bananosqlite._db_text = BA.ObjectToString("TEXT");__ref.setField("_db_text",bananosqlite._db_text);
 //BA.debugLineNum = 19;BA.debugLine="Private recType As Map";
bananosqlite._rectype = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rectype",bananosqlite._rectype);
 //BA.debugLineNum = 20;BA.debugLine="Type SQLiteResultSet(result As List, command As S";
;
 //BA.debugLineNum = 22;BA.debugLine="Private BANano As BANano  'ignore";
bananosqlite._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananosqlite._banano);
 //BA.debugLineNum = 23;BA.debugLine="Private dbName As String";
bananosqlite._dbname = RemoteObject.createImmutable("");__ref.setField("_dbname",bananosqlite._dbname);
 //BA.debugLineNum = 24;BA.debugLine="Public MethodName As String";
bananosqlite._methodname = RemoteObject.createImmutable("");__ref.setField("_methodname",bananosqlite._methodname);
 //BA.debugLineNum = 25;BA.debugLine="Private schema As Map";
bananosqlite._schema = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_schema",bananosqlite._schema);
 //BA.debugLineNum = 26;BA.debugLine="Private OK As Boolean";
bananosqlite._ok = RemoteObject.createImmutable(false);__ref.setField("_ok",bananosqlite._ok);
 //BA.debugLineNum = 27;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createtable(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields,RemoteObject _pk,RemoteObject _auto) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,544);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "bananosqlite","createtable", __ref, _tblname, _tblfields, _pk, _auto);}
RemoteObject _fldname = RemoteObject.createImmutable("");
RemoteObject _fldtype = RemoteObject.createImmutable("");
RemoteObject _fldtot = RemoteObject.createImmutable(0);
RemoteObject _fldcnt = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblFields", _tblfields);
Debug.locals.put("PK", _pk);
Debug.locals.put("Auto", _auto);
 BA.debugLineNum = 544;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 545;BA.debugLine="Dim fldName As String";
Debug.JustUpdateDeviceLine();
_fldname = RemoteObject.createImmutable("");Debug.locals.put("fldName", _fldname);
 BA.debugLineNum = 546;BA.debugLine="Dim fldType As String";
Debug.JustUpdateDeviceLine();
_fldtype = RemoteObject.createImmutable("");Debug.locals.put("fldType", _fldtype);
 BA.debugLineNum = 547;BA.debugLine="Dim fldTot As Int";
Debug.JustUpdateDeviceLine();
_fldtot = RemoteObject.createImmutable(0);Debug.locals.put("fldTot", _fldtot);
 BA.debugLineNum = 548;BA.debugLine="Dim fldCnt As Int";
Debug.JustUpdateDeviceLine();
_fldcnt = RemoteObject.createImmutable(0);Debug.locals.put("fldCnt", _fldcnt);
 BA.debugLineNum = 549;BA.debugLine="fldTot = tblFields.Size - 1";
Debug.JustUpdateDeviceLine();
_fldtot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("fldTot", _fldtot);
 BA.debugLineNum = 550;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 551;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 552;BA.debugLine="sb.Append(\"(\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 553;BA.debugLine="For fldCnt = 0 To fldTot";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _fldtot.<Integer>get().intValue();
_fldcnt = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _fldcnt.<Integer>get().intValue() <= limit9) || (step9 < 0 && _fldcnt.<Integer>get().intValue() >= limit9) ;_fldcnt = RemoteObject.createImmutable((int)(0 + _fldcnt.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("fldCnt", _fldcnt);
 BA.debugLineNum = 554;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
Debug.JustUpdateDeviceLine();
_fldname = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_fldcnt)));Debug.locals.put("fldName", _fldname);
 BA.debugLineNum = 555;BA.debugLine="fldType = tblFields.Get(fldName)";
Debug.JustUpdateDeviceLine();
_fldtype = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)((_fldname))));Debug.locals.put("fldType", _fldtype);
 BA.debugLineNum = 556;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
Debug.JustUpdateDeviceLine();
_fldtype = _fldtype.runMethod(true,"replace",(Object)(BA.ObjectToString("STRING")),(Object)(RemoteObject.createImmutable("TEXT")));Debug.locals.put("fldType", _fldtype);
 BA.debugLineNum = 557;BA.debugLine="If fldCnt > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_fldcnt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 558;BA.debugLine="sb.Append(\", \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 560;BA.debugLine="sb.Append(EscapeField(fldName))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_fldname))));
 BA.debugLineNum = 561;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 562;BA.debugLine="sb.Append(fldType)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fldtype));
 BA.debugLineNum = 563;BA.debugLine="Select Case fldType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fldtype,BA.ObjectToString("STRING"),BA.ObjectToString("TEXT"))) {
case 0: 
case 1: {
 BA.debugLineNum = 565;BA.debugLine="sb.Append(\" COLLATE NOCASE\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" COLLATE NOCASE")));
 break; }
}
;
 BA.debugLineNum = 567;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
Debug.JustUpdateDeviceLine();
if (_fldname.runMethod(true,"equalsIgnoreCase",(Object)(_pk)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 568;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" PRIMARY KEY")));
 };
 BA.debugLineNum = 570;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
Debug.JustUpdateDeviceLine();
if (_fldname.runMethod(true,"equalsIgnoreCase",(Object)(_auto)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 571;BA.debugLine="sb.Append(\" AUTOINCREMENT\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AUTOINCREMENT")));
 };
 }
}Debug.locals.put("fldCnt", _fldcnt);
;
 BA.debugLineNum = 574;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 576;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
Debug.JustUpdateDeviceLine();
_query = RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS "),__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname)),RemoteObject.createImmutable(" "),_sb.runMethod(true,"ToString"));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 577;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 578;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 579;BA.debugLine="gr.query = query";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_query);
 BA.debugLineNum = 580;BA.debugLine="gr.args = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"args" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 581;BA.debugLine="gr.command = \"createtable\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("createtable"));
 BA.debugLineNum = 582;BA.debugLine="gr.types = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"types" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 583;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 584;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 585;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 586;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 587;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 588;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
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
public static RemoteObject  _cstr(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CStr (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,809);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "bananosqlite","cstr", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 809;BA.debugLine="Sub CStr(o As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 810;BA.debugLine="Return \"\" & o";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_o);
 BA.debugLineNum = 811;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _tblname,RemoteObject _primarykey,RemoteObject _primaryvalue) throws Exception{
try {
		Debug.PushSubsStack("Delete (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "bananosqlite","delete", __ref, _tblname, _primarykey, _primaryvalue);}
RemoteObject _qw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _qry = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("primaryKey", _primarykey);
Debug.locals.put("primaryValue", _primaryvalue);
 BA.debugLineNum = 298;BA.debugLine="Sub Delete(tblName As String, primaryKey As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 299;BA.debugLine="Dim qw As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_qw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_qw = bananosqlite.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("qw", _qw);Debug.locals.put("qw", _qw);
 BA.debugLineNum = 300;BA.debugLine="qw.Put(primaryKey, primaryValue)";
Debug.JustUpdateDeviceLine();
_qw.runVoidMethod ("Put",(Object)((_primarykey)),(Object)((_primaryvalue)));
 BA.debugLineNum = 301;BA.debugLine="Dim qry As SQLiteResultSet = DeleteWhere(tblName,";
Debug.JustUpdateDeviceLine();
_qry = __ref.runClassMethod (b4j.example.bananosqlite.class, "_deletewhere" /*RemoteObject*/ ,(Object)(_tblname),(Object)(_qw),(Object)(bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("="))})))));Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 302;BA.debugLine="Return qry";
Debug.JustUpdateDeviceLine();
if (true) return _qry;
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
public static RemoteObject  _deleteall(RemoteObject __ref,RemoteObject _tblname) throws Exception{
try {
		Debug.PushSubsStack("DeleteAll (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("deleteall")) { return __ref.runUserSub(false, "bananosqlite","deleteall", __ref, _tblname);}
RemoteObject _sb = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
 BA.debugLineNum = 174;BA.debugLine="Sub DeleteAll(tblName As String) As SQLiteResultSe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 175;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable("")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 176;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 177;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 178;BA.debugLine="gr.query = sb";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 179;BA.debugLine="gr.args = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"args" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 180;BA.debugLine="gr.command = \"delete\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("delete"));
 BA.debugLineNum = 181;BA.debugLine="gr.types = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"types" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 182;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 183;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 184;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 185;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 186;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 187;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
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
public static RemoteObject  _deletewhere(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblwhere,RemoteObject _operators) throws Exception{
try {
		Debug.PushSubsStack("DeleteWhere (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,729);
if (RapidSub.canDelegate("deletewhere")) { return __ref.runUserSub(false, "bananosqlite","deletewhere", __ref, _tblname, _tblwhere, _operators);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _iwhere = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _opr = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
 BA.debugLineNum = 729;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 730;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananosqlite.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 731;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 732;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 733;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 734;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 735;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" WHERE ")))));
 BA.debugLineNum = 736;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 737;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 738;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 739;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 740;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 742;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 743;BA.debugLine="sb.Append(col)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_col));
 BA.debugLineNum = 744;BA.debugLine="Dim opr As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_opr = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("opr", _opr);Debug.locals.put("opr", _opr);
 BA.debugLineNum = 745;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_opr))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 747;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 748;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 749;BA.debugLine="gr.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 750;BA.debugLine="gr.args = listOfValues";
Debug.JustUpdateDeviceLine();
_gr.setField ("args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 751;BA.debugLine="gr.command = \"delete\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("delete"));
 BA.debugLineNum = 752;BA.debugLine="gr.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_gr.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 753;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 754;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 755;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 756;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 757;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 759;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
 BA.debugLineNum = 760;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptable(RemoteObject __ref,RemoteObject _tblname) throws Exception{
try {
		Debug.PushSubsStack("DropTable (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,522);
if (RapidSub.canDelegate("droptable")) { return __ref.runUserSub(false, "bananosqlite","droptable", __ref, _tblname);}
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
 BA.debugLineNum = 522;BA.debugLine="public Sub DropTable(tblName As String) As SQLiteR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 524;BA.debugLine="Dim query As String = \"DROP TABLE \" & EscapeField";
Debug.JustUpdateDeviceLine();
_query = RemoteObject.concat(RemoteObject.createImmutable("DROP TABLE "),__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname)));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 525;BA.debugLine="Dim m As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 526;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 527;BA.debugLine="m.query = query";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_query);
 BA.debugLineNum = 528;BA.debugLine="m.args = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"args" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 529;BA.debugLine="m.types = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"types" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 530;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 531;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 532;BA.debugLine="m.command = \"droptable\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("droptable"));
 BA.debugLineNum = 533;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 534;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 535;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 536;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 537;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _eqoperators(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("EQOperators (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,364);
if (RapidSub.canDelegate("eqoperators")) { return __ref.runUserSub(false, "bananosqlite","eqoperators", __ref, _sm);}
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 364;BA.debugLine="Sub EQOperators(sm As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 365;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 366;BA.debugLine="nl.initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 367;BA.debugLine="For Each k As String In sm.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _sm.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 368;BA.debugLine="nl.Add(\"=\")";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("="))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 370;BA.debugLine="Return nl";
Debug.JustUpdateDeviceLine();
if (true) return _nl;
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _escapefield(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("EscapeField (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,539);
if (RapidSub.canDelegate("escapefield")) { return __ref.runUserSub(false, "bananosqlite","escapefield", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 539;BA.debugLine="Private Sub EscapeField(f As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 540;BA.debugLine="Return $\"[${f}]\"$";
Debug.JustUpdateDeviceLine();
if (true) return (RemoteObject.concat(RemoteObject.createImmutable("["),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_f))),RemoteObject.createImmutable("]")));
 BA.debugLineNum = 541;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _execute(RemoteObject __ref,RemoteObject _strsql) throws Exception{
try {
		Debug.PushSubsStack("Execute (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,762);
if (RapidSub.canDelegate("execute")) { return __ref.runUserSub(false, "bananosqlite","execute", __ref, _strsql);}
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("strSQL", _strsql);
 BA.debugLineNum = 762;BA.debugLine="Sub Execute(strSQL As String) As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 763;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 764;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 765;BA.debugLine="gr.query = strSQL";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_strsql);
 BA.debugLineNum = 766;BA.debugLine="gr.args = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"args" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 767;BA.debugLine="gr.command = \"execute\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("execute"));
 BA.debugLineNum = 768;BA.debugLine="gr.types = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"types" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 769;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 770;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 771;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 772;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 773;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 774;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
 BA.debugLineNum = 775;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exists(RemoteObject __ref,RemoteObject _tblname,RemoteObject _primarykey,RemoteObject _primaryvalue) throws Exception{
try {
		Debug.PushSubsStack("Exists (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("exists")) { return __ref.runUserSub(false, "bananosqlite","exists", __ref, _tblname, _primarykey, _primaryvalue);}
RemoteObject _qw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("primaryKey", _primarykey);
Debug.locals.put("primaryValue", _primaryvalue);
 BA.debugLineNum = 307;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="Dim qw As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_qw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_qw = bananosqlite.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("qw", _qw);Debug.locals.put("qw", _qw);
 BA.debugLineNum = 309;BA.debugLine="qw.Put(primaryKey, primaryValue)";
Debug.JustUpdateDeviceLine();
_qw.runVoidMethod ("Put",(Object)((_primarykey)),(Object)((_primaryvalue)));
 BA.debugLineNum = 310;BA.debugLine="Dim gr As SQLiteResultSet = SelectWhere(tblName,";
Debug.JustUpdateDeviceLine();
_gr = __ref.runClassMethod (b4j.example.bananosqlite.class, "_selectwhere" /*RemoteObject*/ ,(Object)(_tblname),(Object)(bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_primarykey)})))),(Object)(_qw),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananosqlite.__c.getField(false,"Null")),(Object)(bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_primarykey)})))));Debug.locals.put("gr", _gr);Debug.locals.put("gr", _gr);
 BA.debugLineNum = 311;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
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
public static RemoteObject  _foreignkeys(RemoteObject __ref,RemoteObject _tblname) throws Exception{
try {
		Debug.PushSubsStack("ForeignKeys (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("foreignkeys")) { return __ref.runUserSub(false, "bananosqlite","foreignkeys", __ref, _tblname);}
RemoteObject _sb = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
 BA.debugLineNum = 140;BA.debugLine="Sub ForeignKeys(tblName As String) As SQLiteResult";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="Dim sb As String = $\"PRAGMA foreign_key_list('${t";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("PRAGMA foreign_key_list('"),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable("')")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 142;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 143;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 144;BA.debugLine="gr.query = sb";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 145;BA.debugLine="gr.args = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"args" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 146;BA.debugLine="gr.command = \"foreignkeys\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("foreignkeys"));
 BA.debugLineNum = 147;BA.debugLine="gr.types = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"types" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 148;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 149;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 150;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 151;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 152;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 153;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
 BA.debugLineNum = 154;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmapkeys(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("GetMapKeys (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("getmapkeys")) { return __ref.runUserSub(false, "bananosqlite","getmapkeys", __ref, _sourcemap);}
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 467;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 468;BA.debugLine="Dim listOfValues As List";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 469;BA.debugLine="listOfValues.Initialize";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 470;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 471;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 472;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 473;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 474;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_value = BA.ObjectToString(_sourcemap.runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 475;BA.debugLine="listOfValues.Add(value)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Add",(Object)((_value)));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 477;BA.debugLine="Return listOfValues";
Debug.JustUpdateDeviceLine();
if (true) return _listofvalues;
 BA.debugLineNum = 478;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmaptypes(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("GetMapTypes (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,423);
if (RapidSub.canDelegate("getmaptypes")) { return __ref.runUserSub(false, "bananosqlite","getmaptypes", __ref, _sourcemap);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _coltype = RemoteObject.createImmutable("");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 423;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 424;BA.debugLine="Dim listOfTypes As List";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 425;BA.debugLine="listOfTypes.Initialize";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Initialize");
 BA.debugLineNum = 426;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 427;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 428;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 429;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 430;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_sourcemap.runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 431;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
Debug.JustUpdateDeviceLine();
_coltype = BA.ObjectToString(__ref.getField(false,"_rectype" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_col)),(Object)((RemoteObject.createImmutable("STRING")))));Debug.locals.put("colType", _coltype);Debug.locals.put("colType", _coltype);
 BA.debugLineNum = 432;BA.debugLine="Select Case colType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_coltype,BA.ObjectToString("VARCHAR(20)"),BA.ObjectToString("VARCHAR(10)"),BA.ObjectToString("VARCHAR(30)"),BA.ObjectToString("VARCHAR(40)"),BA.ObjectToString("VARCHAR(50)"),BA.ObjectToString("VARCHAR(100)"),BA.ObjectToString("VARCHAR(255)"),BA.ObjectToString("STRING"),BA.ObjectToString("VARCHAR"),BA.ObjectToString("TEXT"),BA.ObjectToString("DATE"),BA.ObjectToString("DATETIME"),BA.ObjectToString("NVARCHAR"),BA.ObjectToString("INTEGER"),BA.ObjectToString("INT"),BA.ObjectToString("BOOL"),BA.ObjectToString("BOOLEAN"),BA.ObjectToString("BLOB"),BA.ObjectToString("REAL"),BA.ObjectToString("FLOAT"),BA.ObjectToString("DOUBLE"))) {
case 0: 
case 1: 
case 2: 
case 3: {
 BA.debugLineNum = 434;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
case 4: 
case 5: 
case 6: {
 BA.debugLineNum = 436;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
 BA.debugLineNum = 438;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
case 13: 
case 14: 
case 15: 
case 16: {
 BA.debugLineNum = 440;BA.debugLine="listOfTypes.add(\"i\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("i"))));
 break; }
case 17: {
 BA.debugLineNum = 442;BA.debugLine="listOfTypes.add(\"b\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b"))));
 break; }
case 18: 
case 19: 
case 20: {
 BA.debugLineNum = 444;BA.debugLine="listOfTypes.add(\"d\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("d"))));
 break; }
default: {
 BA.debugLineNum = 446;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
}
;
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 449;BA.debugLine="Return listOfTypes";
Debug.JustUpdateDeviceLine();
if (true) return _listoftypes;
 BA.debugLineNum = 450;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmapvalues(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("GetMapValues (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,453);
if (RapidSub.canDelegate("getmapvalues")) { return __ref.runUserSub(false, "bananosqlite","getmapvalues", __ref, _sourcemap);}
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 453;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 454;BA.debugLine="Dim listOfValues As List";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 455;BA.debugLine="listOfValues.Initialize";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 456;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 457;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 458;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 459;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 460;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
Debug.JustUpdateDeviceLine();
_value = BA.ObjectToString(_sourcemap.runMethod(false,"GetValueAt",(Object)(_icnt)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 461;BA.debugLine="listOfValues.Add(value)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Add",(Object)((_value)));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 463;BA.debugLine="Return listOfValues";
Debug.JustUpdateDeviceLine();
if (true) return _listofvalues;
 BA.debugLineNum = 464;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getmax(RemoteObject __ref,RemoteObject _tblname,RemoteObject _fldname) throws Exception{
try {
		Debug.PushSubsStack("GetMax (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("getmax")) { return __ref.runUserSub(false, "bananosqlite","getmax", __ref, _tblname, _fldname);}
RemoteObject _sb = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("fldName", _fldname);
 BA.debugLineNum = 191;BA.debugLine="Sub GetMax(tblName As String, fldName As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="Dim sb As String = $\"SELECT MAX(${fldName}) As ${";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("SELECT MAX("),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fldname))),RemoteObject.createImmutable(") As "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fldname))),RemoteObject.createImmutable(" FROM "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable("")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 193;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 194;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 195;BA.debugLine="gr.query = sb";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 196;BA.debugLine="gr.args = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"args" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 197;BA.debugLine="gr.command = \"getmax\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("getmax"));
 BA.debugLineNum = 198;BA.debugLine="gr.types = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"types" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 199;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 200;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 201;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 202;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 203;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 204;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnextid(RemoteObject __ref,RemoteObject _fld,RemoteObject _rsl) throws Exception{
try {
		Debug.PushSubsStack("GetNextID (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,792);
if (RapidSub.canDelegate("getnextid")) { return __ref.runUserSub(false, "bananosqlite","getnextid", __ref, _fld, _rsl);}
RemoteObject _nextid = RemoteObject.createImmutable(0);
RemoteObject _strid = RemoteObject.createImmutable("");
RemoteObject _nr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ni = RemoteObject.createImmutable("");
Debug.locals.put("fld", _fld);
Debug.locals.put("rsl", _rsl);
 BA.debugLineNum = 792;BA.debugLine="Sub GetNextID(fld As String, rsl As List) As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 793;BA.debugLine="Dim nextid As Int";
Debug.JustUpdateDeviceLine();
_nextid = RemoteObject.createImmutable(0);Debug.locals.put("nextid", _nextid);
 BA.debugLineNum = 794;BA.debugLine="Dim strid As String";
Debug.JustUpdateDeviceLine();
_strid = RemoteObject.createImmutable("");Debug.locals.put("strid", _strid);
 BA.debugLineNum = 796;BA.debugLine="If rsl.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_rsl.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 797;BA.debugLine="nextid = 0";
Debug.JustUpdateDeviceLine();
_nextid = BA.numberCast(int.class, 0);Debug.locals.put("nextid", _nextid);
 }else {
 BA.debugLineNum = 799;BA.debugLine="Dim nr As Map = rsl.Get(0)";
Debug.JustUpdateDeviceLine();
_nr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nr.setObject(_rsl.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("nr", _nr);
 BA.debugLineNum = 800;BA.debugLine="Dim ni As String = nr.Getdefault(fld,\"0\")";
Debug.JustUpdateDeviceLine();
_ni = BA.ObjectToString(_nr.runMethod(false,"GetDefault",(Object)((_fld)),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("ni", _ni);Debug.locals.put("ni", _ni);
 BA.debugLineNum = 801;BA.debugLine="nextid = BANano.parseInt(ni)";
Debug.JustUpdateDeviceLine();
_nextid = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_ni)));Debug.locals.put("nextid", _nextid);
 };
 BA.debugLineNum = 803;BA.debugLine="nextid = nextid + 1";
Debug.JustUpdateDeviceLine();
_nextid = RemoteObject.solve(new RemoteObject[] {_nextid,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nextid", _nextid);
 BA.debugLineNum = 804;BA.debugLine="strid = CStr(nextid)";
Debug.JustUpdateDeviceLine();
_strid = __ref.runClassMethod (b4j.example.bananosqlite.class, "_cstr" /*RemoteObject*/ ,(Object)((_nextid)));Debug.locals.put("strid", _strid);
 BA.debugLineNum = 805;BA.debugLine="Return strid";
Debug.JustUpdateDeviceLine();
if (true) return _strid;
 BA.debugLineNum = 806;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bananosqlite","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 36;BA.debugLine="Public Sub Initialize As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="recType.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 38;BA.debugLine="MethodName = \"BANanoSQLite\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_methodname" /*RemoteObject*/ ,BA.ObjectToString("BANanoSQLite"));
 BA.debugLineNum = 39;BA.debugLine="schema.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 40;BA.debugLine="OK = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ok" /*RemoteObject*/ ,bananosqlite.__c.getField(true,"False"));
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
public static RemoteObject  _insert(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields) throws Exception{
try {
		Debug.PushSubsStack("Insert (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,592);
if (RapidSub.canDelegate("insert")) { return __ref.runUserSub(false, "bananosqlite","insert", __ref, _tblname, _tblfields);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblFields", _tblfields);
 BA.debugLineNum = 592;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 593;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 594;BA.debugLine="Dim columns As StringBuilder";
Debug.JustUpdateDeviceLine();
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
 BA.debugLineNum = 595;BA.debugLine="Dim values As StringBuilder";
Debug.JustUpdateDeviceLine();
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 596;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 597;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 598;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 599;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 600;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 601;BA.debugLine="columns.Initialize";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 602;BA.debugLine="values.Initialize";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 603;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" (")))));
 BA.debugLineNum = 604;BA.debugLine="iTot = tblFields.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 605;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _icnt.<Integer>get().intValue() <= limit13) || (step13 < 0 && _icnt.<Integer>get().intValue() >= limit13) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 606;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 607;BA.debugLine="If iCnt > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_icnt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 608;BA.debugLine="columns.Append(\", \")";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 609;BA.debugLine="values.Append(\", \")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 611;BA.debugLine="columns.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 612;BA.debugLine="values.Append(\"?\")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 614;BA.debugLine="sb.Append(columns.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_columns.runMethod(true,"ToString")));
 BA.debugLineNum = 615;BA.debugLine="sb.Append(\") VALUES (\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(") VALUES (")));
 BA.debugLineNum = 616;BA.debugLine="sb.Append(values.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_values.runMethod(true,"ToString")));
 BA.debugLineNum = 617;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 618;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 619;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 620;BA.debugLine="gr.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 621;BA.debugLine="gr.args = listOfValues";
Debug.JustUpdateDeviceLine();
_gr.setField ("args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 622;BA.debugLine="gr.command = \"insert\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("insert"));
 BA.debugLineNum = 623;BA.debugLine="gr.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_gr.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 624;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 625;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 626;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 627;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 628;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 629;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
 BA.debugLineNum = 630;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertreplace(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields) throws Exception{
try {
		Debug.PushSubsStack("InsertReplace (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,633);
if (RapidSub.canDelegate("insertreplace")) { return __ref.runUserSub(false, "bananosqlite","insertreplace", __ref, _tblname, _tblfields);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblFields", _tblfields);
 BA.debugLineNum = 633;BA.debugLine="Sub InsertReplace(tblName As String, tblFields As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 634;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 635;BA.debugLine="Dim columns As StringBuilder";
Debug.JustUpdateDeviceLine();
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
 BA.debugLineNum = 636;BA.debugLine="Dim values As StringBuilder";
Debug.JustUpdateDeviceLine();
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 637;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 638;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 639;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 640;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 641;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 642;BA.debugLine="columns.Initialize";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 643;BA.debugLine="values.Initialize";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 644;BA.debugLine="sb.Append($\"REPLACE INTO ${EscapeField(tblName)}";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("REPLACE INTO "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" (")))));
 BA.debugLineNum = 645;BA.debugLine="iTot = tblFields.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 646;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _icnt.<Integer>get().intValue() <= limit13) || (step13 < 0 && _icnt.<Integer>get().intValue() >= limit13) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 647;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 648;BA.debugLine="If iCnt > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_icnt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 649;BA.debugLine="columns.Append(\", \")";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 650;BA.debugLine="values.Append(\", \")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 652;BA.debugLine="columns.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 653;BA.debugLine="values.Append(\"?\")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 655;BA.debugLine="sb.Append(columns.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_columns.runMethod(true,"ToString")));
 BA.debugLineNum = 656;BA.debugLine="sb.Append(\") VALUES (\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(") VALUES (")));
 BA.debugLineNum = 657;BA.debugLine="sb.Append(values.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_values.runMethod(true,"ToString")));
 BA.debugLineNum = 658;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 659;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 660;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 661;BA.debugLine="gr.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 662;BA.debugLine="gr.args = listOfValues";
Debug.JustUpdateDeviceLine();
_gr.setField ("args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 663;BA.debugLine="gr.command = \"replace\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("replace"));
 BA.debugLineNum = 664;BA.debugLine="gr.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_gr.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 665;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 666;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 667;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 668;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 669;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 671;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
 BA.debugLineNum = 672;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinfields(RemoteObject __ref,RemoteObject _delimiter,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("JoinFields (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,675);
if (RapidSub.canDelegate("joinfields")) { return __ref.runUserSub(false, "bananosqlite","joinfields", __ref, _delimiter, _lst);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _fld = RemoteObject.createImmutable("");
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 675;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 676;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 677;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 678;BA.debugLine="Dim fld As String";
Debug.JustUpdateDeviceLine();
_fld = RemoteObject.createImmutable("");Debug.locals.put("fld", _fld);
 BA.debugLineNum = 679;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 680;BA.debugLine="fld = lst.Get(0)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 681;BA.debugLine="fld = EscapeField(fld)";
Debug.JustUpdateDeviceLine();
_fld = __ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_fld));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 682;BA.debugLine="sb.Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fld));
 BA.debugLineNum = 683;BA.debugLine="For i = 1 To lst.size - 1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step8 > 0 && _i.<Integer>get().intValue() <= limit8) || (step8 < 0 && _i.<Integer>get().intValue() >= limit8) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 684;BA.debugLine="Dim fld As String = lst.Get(i)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("fld", _fld);Debug.locals.put("fld", _fld);
 BA.debugLineNum = 685;BA.debugLine="fld = EscapeField(fld)";
Debug.JustUpdateDeviceLine();
_fld = __ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_fld));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 686;BA.debugLine="sb.Append(delimiter).Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_delimiter)).runVoidMethod ("Append",(Object)(_fld));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 688;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 689;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _json2list(RemoteObject __ref,RemoteObject _strvalue) throws Exception{
try {
		Debug.PushSubsStack("Json2List (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("json2list")) { return __ref.runUserSub(false, "bananosqlite","json2list", __ref, _strvalue);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("com.ab.banano.BANanoJSONParser");
Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 240;BA.debugLine="Sub Json2List(strValue As String) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 241;BA.debugLine="Dim lst As List";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 242;BA.debugLine="lst.Initialize";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 243;BA.debugLine="lst.clear";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Clear");
 BA.debugLineNum = 244;BA.debugLine="If strValue.Length = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_strvalue.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 245;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
 };
 BA.debugLineNum = 247;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 248;BA.debugLine="Dim parser As BANanoJSONParser";
Debug.JustUpdateDeviceLine();
_parser = RemoteObject.createNew ("com.ab.banano.BANanoJSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 249;BA.debugLine="parser.Initialize(strValue)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(_strvalue));
 BA.debugLineNum = 250;BA.debugLine="Return parser.NextArray";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _parser.runMethod(false,"NextArray");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 252;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
 };
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _json2map(RemoteObject __ref,RemoteObject _strjson) throws Exception{
try {
		Debug.PushSubsStack("Json2Map (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("json2map")) { return __ref.runUserSub(false, "bananosqlite","json2map", __ref, _strjson);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONParser");
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("strJSON", _strjson);
 BA.debugLineNum = 223;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="Dim json As BANanoJSONParser";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 225;BA.debugLine="Dim Map1 As Map";
Debug.JustUpdateDeviceLine();
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 226;BA.debugLine="Map1.Initialize";
Debug.JustUpdateDeviceLine();
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 227;BA.debugLine="Map1.clear";
Debug.JustUpdateDeviceLine();
_map1.runVoidMethod ("Clear");
 BA.debugLineNum = 228;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 229;BA.debugLine="If strJSON.length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_strjson.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 230;BA.debugLine="json.Initialize(strJSON)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize",(Object)(_strjson));
 BA.debugLineNum = 231;BA.debugLine="Map1 = json.NextObject";
Debug.JustUpdateDeviceLine();
_map1 = _json.runMethod(false,"NextObject");Debug.locals.put("Map1", _map1);
 };
 BA.debugLineNum = 233;BA.debugLine="Return Map1";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _map1;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 235;BA.debugLine="Return Map1";
Debug.JustUpdateDeviceLine();
if (true) return _map1;
 };
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
public static RemoteObject  _jsontoresultset(RemoteObject __ref,RemoteObject _rs) throws Exception{
try {
		Debug.PushSubsStack("JSONToResultSet (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("jsontoresultset")) { return __ref.runUserSub(false, "bananosqlite","jsontoresultset", __ref, _rs);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("rs", _rs);
 BA.debugLineNum = 57;BA.debugLine="Sub JSONToResultSet(rs As SQLiteResultSet)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="OK = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ok" /*RemoteObject*/ ,bananosqlite.__c.getField(true,"False"));
 BA.debugLineNum = 59;BA.debugLine="Dim m As Map = BANano.FromJson(rs.json)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"FromJson",(Object)((_rs.getField(true,"json" /*RemoteObject*/ )))));Debug.locals.put("m", _m);
 BA.debugLineNum = 60;BA.debugLine="rs.response = m.Get(\"response\")";
Debug.JustUpdateDeviceLine();
_rs.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("response"))))));
 BA.debugLineNum = 61;BA.debugLine="rs.error = m.Get(\"error\")";
Debug.JustUpdateDeviceLine();
_rs.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("error"))))));
 BA.debugLineNum = 62;BA.debugLine="rs.result = m.Get(\"result\")";
Debug.JustUpdateDeviceLine();
_rs.getField(false,"result" /*RemoteObject*/ ).setObject (_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));
 BA.debugLineNum = 63;BA.debugLine="rs.affectedRows = m.Get(\"affectedRows\")";
Debug.JustUpdateDeviceLine();
_rs.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("affectedRows"))))));
 BA.debugLineNum = 64;BA.debugLine="If rs.response = \"Success\" And rs.affectedRows >=";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_rs.getField(true,"response" /*RemoteObject*/ ),BA.ObjectToString("Success")) && RemoteObject.solveBoolean("g",_rs.getField(true,"affectedRows" /*RemoteObject*/ ),BA.numberCast(double.class, 1))) { 
 BA.debugLineNum = 65;BA.debugLine="OK = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ok" /*RemoteObject*/ ,bananosqlite.__c.getField(true,"True"));
 };
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list2json(RemoteObject __ref,RemoteObject _mp) throws Exception{
try {
		Debug.PushSubsStack("List2Json (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("list2json")) { return __ref.runUserSub(false, "bananosqlite","list2json", __ref, _mp);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONGenerator");
Debug.locals.put("mp", _mp);
 BA.debugLineNum = 215;BA.debugLine="Sub List2Json(mp As List) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 216;BA.debugLine="Dim JSON As BANanoJSONGenerator";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 217;BA.debugLine="JSON.Initialize2(mp)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize2",(Object)(_mp));
 BA.debugLineNum = 218;BA.debugLine="Return JSON.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _json.runMethod(true,"ToString");
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _map2json(RemoteObject __ref,RemoteObject _mp) throws Exception{
try {
		Debug.PushSubsStack("Map2Json (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("map2json")) { return __ref.runUserSub(false, "bananosqlite","map2json", __ref, _mp);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONGenerator");
Debug.locals.put("mp", _mp);
 BA.debugLineNum = 208;BA.debugLine="Sub Map2Json(mp As Map) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 209;BA.debugLine="Dim JSON As BANanoJSONGenerator";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 210;BA.debugLine="JSON.Initialize(mp)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize",(Object)(_mp));
 BA.debugLineNum = 211;BA.debugLine="Return JSON.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _json.runMethod(true,"ToString");
 BA.debugLineNum = 212;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pragma(RemoteObject __ref,RemoteObject _tblname) throws Exception{
try {
		Debug.PushSubsStack("Pragma (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("pragma")) { return __ref.runUserSub(false, "bananosqlite","pragma", __ref, _tblname);}
RemoteObject _sb = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
 BA.debugLineNum = 123;BA.debugLine="Sub Pragma(tblName As String) As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="Dim sb As String = $\"PRAGMA table_info('${tblName";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("PRAGMA table_info('"),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable("')")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 125;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 126;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 127;BA.debugLine="gr.query = sb";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 128;BA.debugLine="gr.args = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"args" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 129;BA.debugLine="gr.command = \"pragma\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("pragma"));
 BA.debugLineNum = 130;BA.debugLine="gr.types = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"types" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 131;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 132;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 133;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 134;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 135;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 136;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
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
public static RemoteObject  _read(RemoteObject __ref,RemoteObject _tblname,RemoteObject _primarykey,RemoteObject _primaryvalue) throws Exception{
try {
		Debug.PushSubsStack("Read (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("read")) { return __ref.runUserSub(false, "bananosqlite","read", __ref, _tblname, _primarykey, _primaryvalue);}
RemoteObject _qw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("primaryKey", _primarykey);
Debug.locals.put("primaryValue", _primaryvalue);
 BA.debugLineNum = 291;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 292;BA.debugLine="Dim qw As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_qw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_qw = bananosqlite.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("qw", _qw);Debug.locals.put("qw", _qw);
 BA.debugLineNum = 293;BA.debugLine="qw.Put(primaryKey, primaryValue)";
Debug.JustUpdateDeviceLine();
_qw.runVoidMethod ("Put",(Object)((_primarykey)),(Object)((_primaryvalue)));
 BA.debugLineNum = 294;BA.debugLine="Dim gr As SQLiteResultSet = SelectWhere(tblName,";
Debug.JustUpdateDeviceLine();
_gr = __ref.runClassMethod (b4j.example.bananosqlite.class, "_selectwhere" /*RemoteObject*/ ,(Object)(_tblname),(Object)(bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*"))})))),(Object)(_qw),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananosqlite.__c.getField(false,"Null")),(Object)(bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_primarykey)})))));Debug.locals.put("gr", _gr);Debug.locals.put("gr", _gr);
 BA.debugLineNum = 295;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
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
public static RemoteObject  _resettypes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ResetTypes (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("resettypes")) { return __ref.runUserSub(false, "bananosqlite","resettypes", __ref);}
 BA.debugLineNum = 117;BA.debugLine="Sub ResetTypes As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="recType.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _schemaaddblob(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddBlob (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("schemaaddblob")) { return __ref.runUserSub(false, "bananosqlite","schemaaddblob", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 91;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 93;BA.debugLine="schema.Put(b, DB_BLOB)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_blob" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
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
public static RemoteObject  _schemaaddboolean(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddBoolean (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("schemaaddboolean")) { return __ref.runUserSub(false, "bananosqlite","schemaaddboolean", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 70;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoSQLit";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 72;BA.debugLine="schema.Put(b, DB_BOOL)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_bool" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 74;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _schemaadddate(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddDate (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("schemaadddate")) { return __ref.runUserSub(false, "bananosqlite","schemaadddate", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 110;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 112;BA.debugLine="schema.Put(b, DB_DATE)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_date" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
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
public static RemoteObject  _schemaaddfloat(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddFloat (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("schemaaddfloat")) { return __ref.runUserSub(false, "bananosqlite","schemaaddfloat", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 84;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 86;BA.debugLine="schema.Put(b, DB_FLOAT)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_float" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 88;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _schemaaddint(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddInt (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("schemaaddint")) { return __ref.runUserSub(false, "bananosqlite","schemaaddint", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 77;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 79;BA.debugLine="schema.Put(b, DB_INT)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_int" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
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
public static RemoteObject  _schemaaddtext(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddText (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("schemaaddtext")) { return __ref.runUserSub(false, "bananosqlite","schemaaddtext", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 98;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 100;BA.debugLine="schema.Put(b, DB_TEXT)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_text" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 102;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _schemaclear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SchemaClear (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("schemaclear")) { return __ref.runUserSub(false, "bananosqlite","schemaclear", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Sub SchemaClear As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="schema.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 53;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _schemacreatetable(RemoteObject __ref,RemoteObject _tblname,RemoteObject _pk,RemoteObject _auto) throws Exception{
try {
		Debug.PushSubsStack("SchemaCreateTable (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("schemacreatetable")) { return __ref.runUserSub(false, "bananosqlite","schemacreatetable", __ref, _tblname, _pk, _auto);}
Debug.locals.put("tblName", _tblname);
Debug.locals.put("PK", _pk);
Debug.locals.put("Auto", _auto);
 BA.debugLineNum = 106;BA.debugLine="Sub SchemaCreateTable(tblName As String, PK As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="Return CreateTable(tblName, schema, PK, Auto)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananosqlite.class, "_createtable" /*RemoteObject*/ ,(Object)(_tblname),(Object)(__ref.getField(false,"_schema" /*RemoteObject*/ )),(Object)(_pk),(Object)(_auto));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectall(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields,RemoteObject _orderby) throws Exception{
try {
		Debug.PushSubsStack("SelectAll (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,693);
if (RapidSub.canDelegate("selectall")) { return __ref.runUserSub(false, "bananosqlite","selectall", __ref, _tblname, _tblfields, _orderby);}
RemoteObject _fld1 = RemoteObject.createImmutable("");
RemoteObject _selfields = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stro = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("orderBy", _orderby);
 BA.debugLineNum = 693;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 695;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
Debug.JustUpdateDeviceLine();
_fld1 = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld1", _fld1);Debug.locals.put("fld1", _fld1);
 BA.debugLineNum = 696;BA.debugLine="Dim selFIelds As String = \"\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("");Debug.locals.put("selFIelds", _selfields);Debug.locals.put("selFIelds", _selfields);
 BA.debugLineNum = 697;BA.debugLine="Select Case fld1";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fld1,BA.ObjectToString("*"))) {
case 0: {
 BA.debugLineNum = 699;BA.debugLine="selFIelds = \"*\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("*");Debug.locals.put("selFIelds", _selfields);
 break; }
default: {
 BA.debugLineNum = 701;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
Debug.JustUpdateDeviceLine();
_selfields = __ref.runClassMethod (b4j.example.bananosqlite.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_tblfields));Debug.locals.put("selFIelds", _selfields);
 break; }
}
;
 BA.debugLineNum = 703;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 704;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 705;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selfields))),RemoteObject.createImmutable(" FROM "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 706;BA.debugLine="If orderBy <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_orderby)) { 
 BA.debugLineNum = 708;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
Debug.JustUpdateDeviceLine();
_stro = __ref.runClassMethod (b4j.example.bananosqlite.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_orderby));Debug.locals.put("stro", _stro);Debug.locals.put("stro", _stro);
 BA.debugLineNum = 709;BA.debugLine="If stro.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_stro.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 710;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" ORDER BY "))).runVoidMethod ("Append",(Object)(_stro));
 };
 };
 BA.debugLineNum = 713;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 714;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 715;BA.debugLine="gr.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 716;BA.debugLine="gr.args = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"args" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 717;BA.debugLine="gr.command = \"select\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("select"));
 BA.debugLineNum = 718;BA.debugLine="gr.types = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"types" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 719;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 720;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 721;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 722;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 723;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 725;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
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
public static RemoteObject  _selectwhere(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields,RemoteObject _tblwhere,RemoteObject _operators,RemoteObject _orderby) throws Exception{
try {
		Debug.PushSubsStack("SelectWhere (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("selectwhere")) { return __ref.runUserSub(false, "bananosqlite","selectwhere", __ref, _tblname, _tblfields, _tblwhere, _operators, _orderby);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fld1 = RemoteObject.createImmutable("");
RemoteObject _selfields = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _iwhere = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _oper = RemoteObject.createImmutable("");
RemoteObject _stro = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
Debug.locals.put("orderBy", _orderby);
 BA.debugLineNum = 315;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 316;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananosqlite.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 317;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 318;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 320;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
Debug.JustUpdateDeviceLine();
_fld1 = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld1", _fld1);Debug.locals.put("fld1", _fld1);
 BA.debugLineNum = 321;BA.debugLine="Dim selFIelds As String = \"\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("");Debug.locals.put("selFIelds", _selfields);Debug.locals.put("selFIelds", _selfields);
 BA.debugLineNum = 322;BA.debugLine="Select Case fld1";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fld1,BA.ObjectToString("*"))) {
case 0: {
 BA.debugLineNum = 324;BA.debugLine="selFIelds = \"*\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("*");Debug.locals.put("selFIelds", _selfields);
 break; }
default: {
 BA.debugLineNum = 326;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
Debug.JustUpdateDeviceLine();
_selfields = __ref.runClassMethod (b4j.example.bananosqlite.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_tblfields));Debug.locals.put("selFIelds", _selfields);
 break; }
}
;
 BA.debugLineNum = 328;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 329;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 330;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selfields))),RemoteObject.createImmutable(" FROM "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" WHERE ")))));
 BA.debugLineNum = 331;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 332;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 333;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step17 = 1;
final int limit17 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step17 > 0 && _i.<Integer>get().intValue() <= limit17) || (step17 < 0 && _i.<Integer>get().intValue() >= limit17) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 334;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 335;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 337;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 338;BA.debugLine="Dim oper As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_oper = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("oper", _oper);Debug.locals.put("oper", _oper);
 BA.debugLineNum = 339;BA.debugLine="sb.Append(col)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_col));
 BA.debugLineNum = 340;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_oper))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 342;BA.debugLine="If orderBy <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_orderby)) { 
 BA.debugLineNum = 344;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
Debug.JustUpdateDeviceLine();
_stro = __ref.runClassMethod (b4j.example.bananosqlite.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_orderby));Debug.locals.put("stro", _stro);Debug.locals.put("stro", _stro);
 BA.debugLineNum = 345;BA.debugLine="If stro.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_stro.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 346;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" ORDER BY "))).runVoidMethod ("Append",(Object)(_stro));
 };
 };
 BA.debugLineNum = 349;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 350;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 351;BA.debugLine="gr.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 352;BA.debugLine="gr.args = listOfValues";
Debug.JustUpdateDeviceLine();
_gr.setField ("args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 353;BA.debugLine="gr.command = \"select\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("select"));
 BA.debugLineNum = 354;BA.debugLine="gr.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_gr.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 355;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 356;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 357;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 358;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 359;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 360;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
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
public static RemoteObject  _setdb(RemoteObject __ref,RemoteObject _db) throws Exception{
try {
		Debug.PushSubsStack("SetDB (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setdb")) { return __ref.runUserSub(false, "bananosqlite","setdb", __ref, _db);}
Debug.locals.put("db", _db);
 BA.debugLineNum = 44;BA.debugLine="Sub SetDB(db As String) As BANanoSQLite";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="dbName = db";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dbname" /*RemoteObject*/ ,_db);
 BA.debugLineNum = 46;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tablenames(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("TableNames (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("tablenames")) { return __ref.runUserSub(false, "bananosqlite","tablenames", __ref);}
RemoteObject _sb = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
 BA.debugLineNum = 157;BA.debugLine="Sub TableNames() As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="Dim sb As String = $\"SELECT name FROM sqlite_mast";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.createImmutable("SELECT name FROM sqlite_master WHERE type ='table' AND name NOT LIKE 'sqlite_%'"));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 159;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 160;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 161;BA.debugLine="gr.query = sb";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 162;BA.debugLine="gr.args = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"args" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 163;BA.debugLine="gr.command = \"tables\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("tables"));
 BA.debugLineNum = 164;BA.debugLine="gr.types = Null";
Debug.JustUpdateDeviceLine();
_gr.getField(false,"types" /*RemoteObject*/ ).setObject (bananosqlite.__c.getField(false,"Null"));
 BA.debugLineNum = 165;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 166;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 167;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 168;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 169;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 170;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _tblname,RemoteObject _prikey,RemoteObject _privalue,RemoteObject _tblfields) throws Exception{
try {
		Debug.PushSubsStack("Update (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "bananosqlite","update", __ref, _tblname, _prikey, _privalue, _tblfields);}
RemoteObject _tblwhere = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("priKey", _prikey);
Debug.locals.put("priValue", _privalue);
Debug.locals.put("tblfields", _tblfields);
 BA.debugLineNum = 29;BA.debugLine="Sub Update(tblName As String, priKey As String, pr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="Dim tblWhere As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_tblwhere = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tblwhere = bananosqlite.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("tblWhere", _tblwhere);Debug.locals.put("tblWhere", _tblwhere);
 BA.debugLineNum = 31;BA.debugLine="tblWhere.Put(priKey, priValue)";
Debug.JustUpdateDeviceLine();
_tblwhere.runVoidMethod ("Put",(Object)((_prikey)),(Object)((_privalue)));
 BA.debugLineNum = 32;BA.debugLine="Return UpdateWhere(tblName, tblfields, tblWhere,";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananosqlite.class, "_updatewhere" /*RemoteObject*/ ,(Object)(_tblname),(Object)(_tblfields),(Object)(_tblwhere),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananosqlite.__c.getField(false,"Null")));
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateall(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields,RemoteObject _operators) throws Exception{
try {
		Debug.PushSubsStack("UpdateAll (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("updateall")) { return __ref.runUserSub(false, "bananosqlite","updateall", __ref, _tblname, _tblfields, _operators);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _oper = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblFields", _tblfields);
Debug.locals.put("operators", _operators);
 BA.debugLineNum = 257;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananosqlite.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 259;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 260;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
Debug.JustUpdateDeviceLine();
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_args = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("args", _args);Debug.locals.put("args", _args);
 BA.debugLineNum = 261;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 262;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 263;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" SET ")))));
 BA.debugLineNum = 264;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 265;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 266;BA.debugLine="For i = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _itot.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 267;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 268;BA.debugLine="Dim oper As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_oper = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("oper", _oper);Debug.locals.put("oper", _oper);
 BA.debugLineNum = 269;BA.debugLine="sb.Append(col)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_col));
 BA.debugLineNum = 270;BA.debugLine="If i <> iTot Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, _itot))) { 
 BA.debugLineNum = 271;BA.debugLine="sb.Append(\" = ?,\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ?,")));
 }else {
 BA.debugLineNum = 273;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_oper))),RemoteObject.createImmutable(" ?")))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 276;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 277;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 278;BA.debugLine="gr.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 279;BA.debugLine="gr.args = args";
Debug.JustUpdateDeviceLine();
_gr.setField ("args" /*RemoteObject*/ ,_args);
 BA.debugLineNum = 280;BA.debugLine="gr.command = \"update\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("update"));
 BA.debugLineNum = 281;BA.debugLine="gr.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_gr.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 282;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 283;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 284;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 285;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 286;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 287;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
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
public static RemoteObject  _updatewhere(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields,RemoteObject _tblwhere,RemoteObject _operators) throws Exception{
try {
		Debug.PushSubsStack("UpdateWhere (bananosqlite) ","bananosqlite",12,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("updatewhere")) { return __ref.runUserSub(false, "bananosqlite","updatewhere", __ref, _tblname, _tblfields, _tblwhere, _operators);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listoftypes1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listofvalues1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _iwhere = RemoteObject.createImmutable(0);
RemoteObject _opr = RemoteObject.createImmutable("");
RemoteObject _gr = RemoteObject.declareNull("b4j.example.bananosqlite._sqliteresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
 BA.debugLineNum = 375;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 376;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananosqlite.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 377;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 378;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes1 = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes1", _listoftypes1);Debug.locals.put("listOfTypes1", _listoftypes1);
 BA.debugLineNum = 379;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("AddAll",(Object)(_listoftypes1));
 BA.debugLineNum = 380;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 381;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
Debug.JustUpdateDeviceLine();
_listofvalues1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues1 = __ref.runClassMethod (b4j.example.bananosqlite.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues1", _listofvalues1);Debug.locals.put("listOfValues1", _listofvalues1);
 BA.debugLineNum = 382;BA.debugLine="listOfValues.AddAll(listOfValues1)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("AddAll",(Object)(_listofvalues1));
 BA.debugLineNum = 383;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 384;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 385;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" SET ")))));
 BA.debugLineNum = 386;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 387;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 388;BA.debugLine="For i = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = _itot.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _i.<Integer>get().intValue() <= limit13) || (step13 < 0 && _i.<Integer>get().intValue() >= limit13) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 389;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 390;BA.debugLine="sb.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 391;BA.debugLine="If i <> iTot Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, _itot))) { 
 BA.debugLineNum = 392;BA.debugLine="sb.Append(\"= ?,\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("= ?,")));
 }else {
 BA.debugLineNum = 394;BA.debugLine="sb.Append(\"= ?\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("= ?")));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 397;BA.debugLine="sb.Append($\" WHERE \"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.createImmutable(" WHERE "))));
 BA.debugLineNum = 398;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 399;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step24 = 1;
final int limit24 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step24 > 0 && _i.<Integer>get().intValue() <= limit24) || (step24 < 0 && _i.<Integer>get().intValue() >= limit24) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 400;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 401;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 403;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 404;BA.debugLine="sb.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananosqlite.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 405;BA.debugLine="Dim opr As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_opr = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("opr", _opr);Debug.locals.put("opr", _opr);
 BA.debugLineNum = 406;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananosqlite.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_opr))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 408;BA.debugLine="Dim gr As SQLiteResultSet";
Debug.JustUpdateDeviceLine();
_gr = RemoteObject.createNew ("b4j.example.bananosqlite._sqliteresultset");Debug.locals.put("gr", _gr);
 BA.debugLineNum = 409;BA.debugLine="gr.Initialize";
Debug.JustUpdateDeviceLine();
_gr.runVoidMethod ("Initialize");
 BA.debugLineNum = 410;BA.debugLine="gr.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_gr.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 411;BA.debugLine="gr.args = listOfValues";
Debug.JustUpdateDeviceLine();
_gr.setField ("args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 412;BA.debugLine="gr.command = \"update\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("update"));
 BA.debugLineNum = 413;BA.debugLine="gr.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_gr.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 414;BA.debugLine="gr.response = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 415;BA.debugLine="gr.error = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 416;BA.debugLine="gr.result = Array()";
Debug.JustUpdateDeviceLine();
_gr.setField ("result" /*RemoteObject*/ ,bananosqlite.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 417;BA.debugLine="gr.json = \"\"";
Debug.JustUpdateDeviceLine();
_gr.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 418;BA.debugLine="gr.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_gr.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 419;BA.debugLine="Return gr";
Debug.JustUpdateDeviceLine();
if (true) return _gr;
 BA.debugLineNum = 420;BA.debugLine="End Sub";
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