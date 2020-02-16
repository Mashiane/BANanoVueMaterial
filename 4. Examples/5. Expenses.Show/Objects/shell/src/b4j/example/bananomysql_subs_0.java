package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bananomysql_subs_0 {


public static RemoteObject  _addblobs(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddBlobs (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,769);
if (RapidSub.canDelegate("addblobs")) { return __ref.runUserSub(false, "bananomysql","addblobs", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 769;BA.debugLine="private Sub AddBlobs(fieldNames As List) As BANano";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 770;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 771;BA.debugLine="recType.Put(strfld,\"BLOB\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("BLOB"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 773;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 774;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddBooleans (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,756);
if (RapidSub.canDelegate("addbooleans")) { return __ref.runUserSub(false, "bananomysql","addbooleans", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 756;BA.debugLine="private Sub AddBooleans(fieldNames As List) As BAN";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 757;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 758;BA.debugLine="recType.Put(strfld,\"BOOL\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("BOOL"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 760;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 761;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddDoubles (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,748);
if (RapidSub.canDelegate("adddoubles")) { return __ref.runUserSub(false, "bananomysql","adddoubles", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 748;BA.debugLine="private Sub AddDoubles(fieldNames As List) As BANa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 749;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 750;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("DOUBLE"))));
 }
}Debug.locals.put("strfld", _strfld);
;
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
public static RemoteObject  _addintegers(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddIntegers (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,740);
if (RapidSub.canDelegate("addintegers")) { return __ref.runUserSub(false, "bananomysql","addintegers", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 740;BA.debugLine="private Sub AddIntegers(fieldNames As List) As BAN";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 741;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 742;BA.debugLine="recType.Put(strfld,\"INT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("INT"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 744;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 745;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddStrings (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,732);
if (RapidSub.canDelegate("addstrings")) { return __ref.runUserSub(false, "bananomysql","addstrings", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 732;BA.debugLine="private Sub AddStrings(fieldNames As List) As BANa";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 733;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 734;BA.debugLine="recType.Put(strfld,\"STRING\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("STRING"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 736;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 737;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Build (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,707);
if (RapidSub.canDelegate("build")) { return __ref.runUserSub(false, "bananomysql","build", __ref);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 707;BA.debugLine="Sub Build As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 708;BA.debugLine="Dim b As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_b = bananomysql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 709;BA.debugLine="b.Put(\"command\", command)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("command"))),(Object)((__ref.getField(true,"_command" /*RemoteObject*/ ))));
 BA.debugLineNum = 710;BA.debugLine="b.Put(\"query\", query)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("query"))),(Object)((__ref.getField(true,"_query" /*RemoteObject*/ ))));
 BA.debugLineNum = 711;BA.debugLine="b.Put(\"args\", args)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("args"))),(Object)((__ref.getField(false,"_args" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 712;BA.debugLine="b.Put(\"types\", types)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("types"))),(Object)((__ref.getField(false,"_types" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 713;BA.debugLine="Return b";
Debug.JustUpdateDeviceLine();
if (true) return _b;
 BA.debugLineNum = 714;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _builddynamic(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildDynamic (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,717);
if (RapidSub.canDelegate("builddynamic")) { return __ref.runUserSub(false, "bananomysql","builddynamic", __ref);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 717;BA.debugLine="Sub BuildDynamic As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 718;BA.debugLine="Dim b As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_b = bananomysql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 719;BA.debugLine="b.Put(\"command\", command)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("command"))),(Object)((__ref.getField(true,"_command" /*RemoteObject*/ ))));
 BA.debugLineNum = 720;BA.debugLine="b.Put(\"query\", query)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("query"))),(Object)((__ref.getField(true,"_query" /*RemoteObject*/ ))));
 BA.debugLineNum = 721;BA.debugLine="b.Put(\"args\", args)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("args"))),(Object)((__ref.getField(false,"_args" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 722;BA.debugLine="b.Put(\"types\", types)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("types"))),(Object)((__ref.getField(false,"_types" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 723;BA.debugLine="b.put(\"host\", host)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("host"))),(Object)((__ref.getField(true,"_host" /*RemoteObject*/ ))));
 BA.debugLineNum = 724;BA.debugLine="b.Put(\"username\", username)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("username"))),(Object)((__ref.getField(true,"_username" /*RemoteObject*/ ))));
 BA.debugLineNum = 725;BA.debugLine="b.Put(\"password\", password)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("password"))),(Object)((__ref.getField(true,"_password" /*RemoteObject*/ ))));
 BA.debugLineNum = 726;BA.debugLine="b.Put(\"dbname\", DBase)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dbname"))),(Object)((__ref.getField(true,"_dbase" /*RemoteObject*/ ))));
 BA.debugLineNum = 727;BA.debugLine="Return b";
Debug.JustUpdateDeviceLine();
if (true) return _b;
 BA.debugLineNum = 728;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Private recType As Map";
bananomysql._rectype = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rectype",bananomysql._rectype);
 //BA.debugLineNum = 4;BA.debugLine="Public const DB_VARCHAR_20 As String = \"VARCHAR(2";
bananomysql._db_varchar_20 = BA.ObjectToString("VARCHAR(20)");__ref.setField("_db_varchar_20",bananomysql._db_varchar_20);
 //BA.debugLineNum = 5;BA.debugLine="Public const DB_VARCHAR_10 As String = \"VARCHAR(1";
bananomysql._db_varchar_10 = BA.ObjectToString("VARCHAR(10)");__ref.setField("_db_varchar_10",bananomysql._db_varchar_10);
 //BA.debugLineNum = 6;BA.debugLine="Public const DB_VARCHAR_30 As String = \"VARCHAR(3";
bananomysql._db_varchar_30 = BA.ObjectToString("VARCHAR(30)");__ref.setField("_db_varchar_30",bananomysql._db_varchar_30);
 //BA.debugLineNum = 7;BA.debugLine="Public const DB_VARCHAR_40 As String = \"VARCHAR(4";
bananomysql._db_varchar_40 = BA.ObjectToString("VARCHAR(40)");__ref.setField("_db_varchar_40",bananomysql._db_varchar_40);
 //BA.debugLineNum = 8;BA.debugLine="Public const DB_VARCHAR_50 As String = \"VARCHAR(5";
bananomysql._db_varchar_50 = BA.ObjectToString("VARCHAR(50)");__ref.setField("_db_varchar_50",bananomysql._db_varchar_50);
 //BA.debugLineNum = 9;BA.debugLine="Public const DB_VARCHAR_100 As String = \"VARCHAR(";
bananomysql._db_varchar_100 = BA.ObjectToString("VARCHAR(100)");__ref.setField("_db_varchar_100",bananomysql._db_varchar_100);
 //BA.debugLineNum = 10;BA.debugLine="Public const DB_VARCHAR_255 As String = \"VARCHAR(";
bananomysql._db_varchar_255 = BA.ObjectToString("VARCHAR(255)");__ref.setField("_db_varchar_255",bananomysql._db_varchar_255);
 //BA.debugLineNum = 11;BA.debugLine="Public const DB_STRING As String = \"TEXT\"";
bananomysql._db_string = BA.ObjectToString("TEXT");__ref.setField("_db_string",bananomysql._db_string);
 //BA.debugLineNum = 12;BA.debugLine="Public const DB_INT As String = \"INT\"";
bananomysql._db_int = BA.ObjectToString("INT");__ref.setField("_db_int",bananomysql._db_int);
 //BA.debugLineNum = 13;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
bananomysql._db_float = BA.ObjectToString("FLOAT");__ref.setField("_db_float",bananomysql._db_float);
 //BA.debugLineNum = 14;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
bananomysql._db_blob = BA.ObjectToString("BLOB");__ref.setField("_db_blob",bananomysql._db_blob);
 //BA.debugLineNum = 15;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
bananomysql._db_bool = BA.ObjectToString("BOOL");__ref.setField("_db_bool",bananomysql._db_bool);
 //BA.debugLineNum = 16;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
bananomysql._db_real = BA.ObjectToString("REAL");__ref.setField("_db_real",bananomysql._db_real);
 //BA.debugLineNum = 17;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
bananomysql._db_date = BA.ObjectToString("DATE");__ref.setField("_db_date",bananomysql._db_date);
 //BA.debugLineNum = 18;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
bananomysql._db_integer = BA.ObjectToString("INTEGER");__ref.setField("_db_integer",bananomysql._db_integer);
 //BA.debugLineNum = 19;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
bananomysql._db_text = BA.ObjectToString("TEXT");__ref.setField("_db_text",bananomysql._db_text);
 //BA.debugLineNum = 24;BA.debugLine="Private BANano As BANano   'ignore";
bananomysql._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananomysql._banano);
 //BA.debugLineNum = 25;BA.debugLine="Public MethodName As String";
bananomysql._methodname = RemoteObject.createImmutable("");__ref.setField("_methodname",bananomysql._methodname);
 //BA.debugLineNum = 26;BA.debugLine="Public MethodNameDynamic As String";
bananomysql._methodnamedynamic = RemoteObject.createImmutable("");__ref.setField("_methodnamedynamic",bananomysql._methodnamedynamic);
 //BA.debugLineNum = 27;BA.debugLine="Private Schema As Map";
bananomysql._schema = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_schema",bananomysql._schema);
 //BA.debugLineNum = 28;BA.debugLine="Private host As String";
bananomysql._host = RemoteObject.createImmutable("");__ref.setField("_host",bananomysql._host);
 //BA.debugLineNum = 29;BA.debugLine="Private username As String";
bananomysql._username = RemoteObject.createImmutable("");__ref.setField("_username",bananomysql._username);
 //BA.debugLineNum = 30;BA.debugLine="Private password As String";
bananomysql._password = RemoteObject.createImmutable("");__ref.setField("_password",bananomysql._password);
 //BA.debugLineNum = 31;BA.debugLine="Public DBase As String";
bananomysql._dbase = RemoteObject.createImmutable("");__ref.setField("_dbase",bananomysql._dbase);
 //BA.debugLineNum = 32;BA.debugLine="Public result As List";
bananomysql._result = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_result",bananomysql._result);
 //BA.debugLineNum = 33;BA.debugLine="Public command As String";
bananomysql._command = RemoteObject.createImmutable("");__ref.setField("_command",bananomysql._command);
 //BA.debugLineNum = 34;BA.debugLine="Public types As List";
bananomysql._types = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_types",bananomysql._types);
 //BA.debugLineNum = 35;BA.debugLine="Public args As List";
bananomysql._args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_args",bananomysql._args);
 //BA.debugLineNum = 36;BA.debugLine="Public query As String";
bananomysql._query = RemoteObject.createImmutable("");__ref.setField("_query",bananomysql._query);
 //BA.debugLineNum = 37;BA.debugLine="Public response As String";
bananomysql._response = RemoteObject.createImmutable("");__ref.setField("_response",bananomysql._response);
 //BA.debugLineNum = 38;BA.debugLine="Public error As String";
bananomysql._error = RemoteObject.createImmutable("");__ref.setField("_error",bananomysql._error);
 //BA.debugLineNum = 39;BA.debugLine="Public affectedRows As Long";
bananomysql._affectedrows = RemoteObject.createImmutable(0L);__ref.setField("_affectedrows",bananomysql._affectedrows);
 //BA.debugLineNum = 40;BA.debugLine="Public json As String";
bananomysql._json = RemoteObject.createImmutable("");__ref.setField("_json",bananomysql._json);
 //BA.debugLineNum = 41;BA.debugLine="Public OK As Boolean";
bananomysql._ok = RemoteObject.createImmutable(false);__ref.setField("_ok",bananomysql._ok);
 //BA.debugLineNum = 42;BA.debugLine="Private BANano As BANano   'ignore";
bananomysql._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananomysql._banano);
 //BA.debugLineNum = 43;BA.debugLine="Public TableName As String";
bananomysql._tablename = RemoteObject.createImmutable("");__ref.setField("_tablename",bananomysql._tablename);
 //BA.debugLineNum = 44;BA.debugLine="Public PrimaryKey As String";
bananomysql._primarykey = RemoteObject.createImmutable("");__ref.setField("_primarykey",bananomysql._primarykey);
 //BA.debugLineNum = 45;BA.debugLine="Public Record As Map";
bananomysql._record = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_record",bananomysql._record);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _connection(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Connection (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,258);
if (RapidSub.canDelegate("connection")) { return __ref.runUserSub(false, "bananomysql","connection", __ref);}
 BA.debugLineNum = 258;BA.debugLine="Sub Connection As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 259;BA.debugLine="command = \"connection\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("connection"));
 BA.debugLineNum = 260;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _createdatabase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("CreateDatabase (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("createdatabase")) { return __ref.runUserSub(false, "bananomysql","createdatabase", __ref);}
RemoteObject _ssql = RemoteObject.createImmutable("");
 BA.debugLineNum = 264;BA.debugLine="Sub CreateDatabase As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 265;BA.debugLine="Dim sSQL As String = $\"CREATE DATABASE IF NOT EXI";
Debug.JustUpdateDeviceLine();
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("CREATE DATABASE IF NOT EXISTS "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_dbase" /*RemoteObject*/ )))))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 266;BA.debugLine="query = sSQL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_ssql);
 BA.debugLineNum = 267;BA.debugLine="command = \"createdb\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("createdb"));
 BA.debugLineNum = 268;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _createtable(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields,RemoteObject _pk,RemoteObject _auto) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "bananomysql","createtable", __ref, _tblname, _tblfields, _pk, _auto);}
RemoteObject _fldname = RemoteObject.createImmutable("");
RemoteObject _fldtype = RemoteObject.createImmutable("");
RemoteObject _fldtot = RemoteObject.createImmutable(0);
RemoteObject _fldcnt = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblFields", _tblfields);
Debug.locals.put("PK", _pk);
Debug.locals.put("Auto", _auto);
 BA.debugLineNum = 286;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 287;BA.debugLine="Dim fldName As String";
Debug.JustUpdateDeviceLine();
_fldname = RemoteObject.createImmutable("");Debug.locals.put("fldName", _fldname);
 BA.debugLineNum = 288;BA.debugLine="Dim fldType As String";
Debug.JustUpdateDeviceLine();
_fldtype = RemoteObject.createImmutable("");Debug.locals.put("fldType", _fldtype);
 BA.debugLineNum = 289;BA.debugLine="Dim fldTot As Int";
Debug.JustUpdateDeviceLine();
_fldtot = RemoteObject.createImmutable(0);Debug.locals.put("fldTot", _fldtot);
 BA.debugLineNum = 290;BA.debugLine="Dim fldCnt As Int";
Debug.JustUpdateDeviceLine();
_fldcnt = RemoteObject.createImmutable(0);Debug.locals.put("fldCnt", _fldcnt);
 BA.debugLineNum = 291;BA.debugLine="fldTot = tblFields.Size - 1";
Debug.JustUpdateDeviceLine();
_fldtot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("fldTot", _fldtot);
 BA.debugLineNum = 292;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 293;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 294;BA.debugLine="sb.Append(\"(\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 295;BA.debugLine="For fldCnt = 0 To fldTot";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _fldtot.<Integer>get().intValue();
_fldcnt = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _fldcnt.<Integer>get().intValue() <= limit9) || (step9 < 0 && _fldcnt.<Integer>get().intValue() >= limit9) ;_fldcnt = RemoteObject.createImmutable((int)(0 + _fldcnt.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("fldCnt", _fldcnt);
 BA.debugLineNum = 296;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
Debug.JustUpdateDeviceLine();
_fldname = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_fldcnt)));Debug.locals.put("fldName", _fldname);
 BA.debugLineNum = 297;BA.debugLine="fldType = tblFields.Get(fldName)";
Debug.JustUpdateDeviceLine();
_fldtype = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)((_fldname))));Debug.locals.put("fldType", _fldtype);
 BA.debugLineNum = 298;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
Debug.JustUpdateDeviceLine();
_fldtype = _fldtype.runMethod(true,"replace",(Object)(BA.ObjectToString("STRING")),(Object)(RemoteObject.createImmutable("TEXT")));Debug.locals.put("fldType", _fldtype);
 BA.debugLineNum = 299;BA.debugLine="If fldCnt > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_fldcnt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 300;BA.debugLine="sb.Append(\", \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 302;BA.debugLine="sb.Append(EscapeField(fldName))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_fldname))));
 BA.debugLineNum = 303;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 304;BA.debugLine="sb.Append(fldType)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fldtype));
 BA.debugLineNum = 305;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
Debug.JustUpdateDeviceLine();
if (_fldname.runMethod(true,"equalsIgnoreCase",(Object)(_pk)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 306;BA.debugLine="sb.Append(\" NOT NULL PRIMARY KEY\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" NOT NULL PRIMARY KEY")));
 };
 BA.debugLineNum = 308;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
Debug.JustUpdateDeviceLine();
if (_fldname.runMethod(true,"equalsIgnoreCase",(Object)(_auto)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 309;BA.debugLine="sb.Append(\" AUTO_INCREMENT\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AUTO_INCREMENT")));
 };
 }
}Debug.locals.put("fldCnt", _fldcnt);
;
 BA.debugLineNum = 312;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 314;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
Debug.JustUpdateDeviceLine();
bananomysql._query = RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS "),__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname)),RemoteObject.createImmutable(" "),_sb.runMethod(true,"ToString"));__ref.setField("_query",bananomysql._query);
 BA.debugLineNum = 315;BA.debugLine="query = query";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,__ref.getField(true,"_query" /*RemoteObject*/ ));
 BA.debugLineNum = 316;BA.debugLine="command = \"createtable\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("createtable"));
 BA.debugLineNum = 317;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 318;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("CStr (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "bananomysql","cstr", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 120;BA.debugLine="Sub CStr(o As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="Return \"\" & o";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_o);
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _delete(RemoteObject __ref,RemoteObject _primaryvalue) throws Exception{
try {
		Debug.PushSubsStack("Delete (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,461);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "bananomysql","delete", __ref, _primaryvalue);}
RemoteObject _qw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("primaryValue", _primaryvalue);
 BA.debugLineNum = 461;BA.debugLine="Sub Delete(primaryValue As String) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 462;BA.debugLine="Dim qw As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_qw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_qw = bananomysql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("qw", _qw);Debug.locals.put("qw", _qw);
 BA.debugLineNum = 463;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
Debug.JustUpdateDeviceLine();
_qw.runVoidMethod ("Put",(Object)((__ref.getField(true,"_primarykey" /*RemoteObject*/ ))),(Object)((_primaryvalue)));
 BA.debugLineNum = 464;BA.debugLine="DeleteWhere(TableName, qw, Array(\"=\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_deletewhere" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )),(Object)(_qw),(Object)(bananomysql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("="))})))));
 BA.debugLineNum = 465;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 466;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _deleteall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DeleteAll (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,608);
if (RapidSub.canDelegate("deleteall")) { return __ref.runUserSub(false, "bananomysql","deleteall", __ref);}
RemoteObject _sb = RemoteObject.createImmutable("");
 BA.debugLineNum = 608;BA.debugLine="Sub DeleteAll As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 609;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(Ta";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )))))),RemoteObject.createImmutable("")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 610;BA.debugLine="query = sb";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 611;BA.debugLine="command = \"delete\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("delete"));
 BA.debugLineNum = 612;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 613;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("DeleteWhere (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,626);
if (RapidSub.canDelegate("deletewhere")) { return __ref.runUserSub(false, "bananomysql","deletewhere", __ref, _tblname, _tblwhere, _operators);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _iwhere = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _opr = RemoteObject.createImmutable("");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
 BA.debugLineNum = 626;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 627;BA.debugLine="If Schema.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_schema" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 628;BA.debugLine="Log($\"BANanoMySQL.DeleteWhere: '${tblName}' sche";
Debug.JustUpdateDeviceLine();
bananomysql.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("BANanoMySQL.DeleteWhere: '"),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable("' schema is not set!")))));
 };
 BA.debugLineNum = 630;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananomysql.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 631;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 632;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 633;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 634;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 635;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" WHERE ")))));
 BA.debugLineNum = 636;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 637;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 638;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step12 = 1;
final int limit12 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step12 > 0 && _i.<Integer>get().intValue() <= limit12) || (step12 < 0 && _i.<Integer>get().intValue() >= limit12) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step12))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 639;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 640;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 642;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 643;BA.debugLine="sb.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 644;BA.debugLine="Dim opr As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_opr = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("opr", _opr);Debug.locals.put("opr", _opr);
 BA.debugLineNum = 645;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_opr))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 647;BA.debugLine="query = sb.tostring";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 648;BA.debugLine="args = listOfValues";
Debug.JustUpdateDeviceLine();
__ref.setField ("_args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 649;BA.debugLine="types = listOfTypes";
Debug.JustUpdateDeviceLine();
__ref.setField ("_types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 650;BA.debugLine="command = \"delete\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("delete"));
 BA.debugLineNum = 651;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 652;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _dropdatabase(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DropDataBase (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("dropdatabase")) { return __ref.runUserSub(false, "bananomysql","dropdatabase", __ref);}
RemoteObject _ssql = RemoteObject.createImmutable("");
 BA.debugLineNum = 272;BA.debugLine="Sub DropDataBase As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 273;BA.debugLine="Dim sSQL As String = $\"DROP DATABASE ${EscapeFiel";
Debug.JustUpdateDeviceLine();
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("DROP DATABASE "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_dbase" /*RemoteObject*/ )))))),RemoteObject.createImmutable("")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 274;BA.debugLine="query = sSQL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_ssql);
 BA.debugLineNum = 275;BA.debugLine="command = \"dropdb\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("dropdb"));
 BA.debugLineNum = 276;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 277;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _droptable(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("DropTable (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,321);
if (RapidSub.canDelegate("droptable")) { return __ref.runUserSub(false, "bananomysql","droptable", __ref);}
 BA.debugLineNum = 321;BA.debugLine="public Sub DropTable As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 323;BA.debugLine="Dim query As String = \"DROP TABLE \" & EscapeField";
Debug.JustUpdateDeviceLine();
bananomysql._query = RemoteObject.concat(RemoteObject.createImmutable("DROP TABLE "),__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ ))));__ref.setField("_query",bananomysql._query);
 BA.debugLineNum = 324;BA.debugLine="query = query";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,__ref.getField(true,"_query" /*RemoteObject*/ ));
 BA.debugLineNum = 325;BA.debugLine="command = \"droptable\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("droptable"));
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
public static RemoteObject  _eqoperators(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("EQOperators (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,615);
if (RapidSub.canDelegate("eqoperators")) { return __ref.runUserSub(false, "bananomysql","eqoperators", __ref, _sm);}
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 615;BA.debugLine="private Sub EQOperators(sm As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 616;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 617;BA.debugLine="nl.initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 618;BA.debugLine="For Each k As String In sm.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _sm.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 619;BA.debugLine="nl.Add(\"=\")";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("="))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 621;BA.debugLine="Return nl";
Debug.JustUpdateDeviceLine();
if (true) return _nl;
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
public static RemoteObject  _escapefield(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("EscapeField (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,253);
if (RapidSub.canDelegate("escapefield")) { return __ref.runUserSub(false, "bananomysql","escapefield", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 253;BA.debugLine="Private Sub EscapeField(f As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 254;BA.debugLine="Return $\"`${f}`\"$";
Debug.JustUpdateDeviceLine();
if (true) return (RemoteObject.concat(RemoteObject.createImmutable("`"),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_f))),RemoteObject.createImmutable("`")));
 BA.debugLineNum = 255;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Execute (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("execute")) { return __ref.runUserSub(false, "bananomysql","execute", __ref, _strsql);}
Debug.locals.put("strSQL", _strsql);
 BA.debugLineNum = 279;BA.debugLine="Sub Execute(strSQL As String) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 280;BA.debugLine="query = strSQL";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_strsql);
 BA.debugLineNum = 281;BA.debugLine="command = \"execute\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("execute"));
 BA.debugLineNum = 282;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _exists(RemoteObject __ref,RemoteObject _primaryvalue) throws Exception{
try {
		Debug.PushSubsStack("Exists (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,510);
if (RapidSub.canDelegate("exists")) { return __ref.runUserSub(false, "bananomysql","exists", __ref, _primaryvalue);}
RemoteObject _qw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("primaryValue", _primaryvalue);
 BA.debugLineNum = 510;BA.debugLine="Sub Exists(primaryValue As String) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 511;BA.debugLine="Dim qw As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_qw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_qw = bananomysql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("qw", _qw);Debug.locals.put("qw", _qw);
 BA.debugLineNum = 512;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
Debug.JustUpdateDeviceLine();
_qw.runVoidMethod ("Put",(Object)((__ref.getField(true,"_primarykey" /*RemoteObject*/ ))),(Object)((_primaryvalue)));
 BA.debugLineNum = 513;BA.debugLine="SelectWhere(TableName, Array(PrimaryKey), qw, Nul";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_selectwhere" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )),(Object)(bananomysql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_primarykey" /*RemoteObject*/ ))})))),(Object)(_qw),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananomysql.__c.getField(false,"Null")),(Object)(bananomysql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_primarykey" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 514;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 515;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _firstrecord(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FirstRecord (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,763);
if (RapidSub.canDelegate("firstrecord")) { return __ref.runUserSub(false, "bananomysql","firstrecord", __ref);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 763;BA.debugLine="Sub FirstRecord As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 764;BA.debugLine="Dim rec As Map = result.Get(0)";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rec.setObject(__ref.getField(false,"_result" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("rec", _rec);
 BA.debugLineNum = 765;BA.debugLine="Return rec";
Debug.JustUpdateDeviceLine();
if (true) return _rec;
 BA.debugLineNum = 766;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _fromjson(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("FromJSON (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("fromjson")) { return __ref.runUserSub(false, "bananomysql","fromjson", __ref);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 66;BA.debugLine="Sub FromJSON As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="OK = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ok" /*RemoteObject*/ ,bananomysql.__c.getField(true,"False"));
 BA.debugLineNum = 68;BA.debugLine="Dim m As Map = BANano.FromJson(json)";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"FromJson",(Object)((__ref.getField(true,"_json" /*RemoteObject*/ )))));Debug.locals.put("m", _m);
 BA.debugLineNum = 69;BA.debugLine="response = m.Get(\"response\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_response" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("response"))))));
 BA.debugLineNum = 70;BA.debugLine="error = m.Get(\"error\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_error" /*RemoteObject*/ ,BA.ObjectToString(_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("error"))))));
 BA.debugLineNum = 71;BA.debugLine="result = m.Get(\"result\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_result" /*RemoteObject*/ ).setObject (_m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("result")))));
 BA.debugLineNum = 72;BA.debugLine="affectedRows = m.Get(\"affectedRows\")";
Debug.JustUpdateDeviceLine();
__ref.setField ("_affectedrows" /*RemoteObject*/ ,BA.numberCast(long.class, _m.runMethod(false,"Get",(Object)((RemoteObject.createImmutable("affectedRows"))))));
 BA.debugLineNum = 73;BA.debugLine="If response = \"Success\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_response" /*RemoteObject*/ ),BA.ObjectToString("Success"))) { 
 BA.debugLineNum = 74;BA.debugLine="OK = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ok" /*RemoteObject*/ ,bananomysql.__c.getField(true,"True"));
 };
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
public static RemoteObject  _getmapkeys(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("GetMapKeys (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,374);
if (RapidSub.canDelegate("getmapkeys")) { return __ref.runUserSub(false, "bananomysql","getmapkeys", __ref, _sourcemap);}
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 374;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 375;BA.debugLine="Dim listOfValues As List";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 376;BA.debugLine="listOfValues.Initialize";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 377;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 378;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 379;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 380;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 381;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_value = BA.ObjectToString(_sourcemap.runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 382;BA.debugLine="listOfValues.Add(value)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Add",(Object)((_value)));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 384;BA.debugLine="Return listOfValues";
Debug.JustUpdateDeviceLine();
if (true) return _listofvalues;
 BA.debugLineNum = 385;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetMapTypes (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,330);
if (RapidSub.canDelegate("getmaptypes")) { return __ref.runUserSub(false, "bananomysql","getmaptypes", __ref, _sourcemap);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _coltype = RemoteObject.createImmutable("");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 330;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 331;BA.debugLine="Dim listOfTypes As List";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 332;BA.debugLine="listOfTypes.Initialize";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Initialize");
 BA.debugLineNum = 333;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 334;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 335;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 336;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 337;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_sourcemap.runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 338;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
Debug.JustUpdateDeviceLine();
_coltype = BA.ObjectToString(__ref.getField(false,"_rectype" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_col)),(Object)((RemoteObject.createImmutable("STRING")))));Debug.locals.put("colType", _coltype);Debug.locals.put("colType", _coltype);
 BA.debugLineNum = 339;BA.debugLine="Select Case colType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_coltype,BA.ObjectToString("VARCHAR(20)"),BA.ObjectToString("VARCHAR(10)"),BA.ObjectToString("VARCHAR(30)"),BA.ObjectToString("VARCHAR(40)"),BA.ObjectToString("VARCHAR(50)"),BA.ObjectToString("VARCHAR(100)"),BA.ObjectToString("VARCHAR(255)"),BA.ObjectToString("STRING"),BA.ObjectToString("VARCHAR"),BA.ObjectToString("TEXT"),BA.ObjectToString("DATE"),BA.ObjectToString("DATETIME"),BA.ObjectToString("NVARCHAR"),BA.ObjectToString("INTEGER"),BA.ObjectToString("INT"),BA.ObjectToString("BOOL"),BA.ObjectToString("BOOLEAN"),BA.ObjectToString("REAL"),BA.ObjectToString("FLOAT"),BA.ObjectToString("DOUBLE"),BA.ObjectToString("BLOB"))) {
case 0: 
case 1: 
case 2: 
case 3: {
 BA.debugLineNum = 341;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
case 4: 
case 5: 
case 6: {
 BA.debugLineNum = 343;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
 BA.debugLineNum = 345;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
case 13: 
case 14: 
case 15: 
case 16: {
 BA.debugLineNum = 347;BA.debugLine="listOfTypes.add(\"i\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("i"))));
 break; }
case 17: 
case 18: 
case 19: {
 BA.debugLineNum = 349;BA.debugLine="listOfTypes.add(\"d\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("d"))));
 break; }
case 20: {
 BA.debugLineNum = 351;BA.debugLine="listOfTypes.Add(\"b\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b"))));
 break; }
default: {
 BA.debugLineNum = 353;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
}
;
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 356;BA.debugLine="Return listOfTypes";
Debug.JustUpdateDeviceLine();
if (true) return _listoftypes;
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
public static RemoteObject  _getmapvalues(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("GetMapValues (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,360);
if (RapidSub.canDelegate("getmapvalues")) { return __ref.runUserSub(false, "bananomysql","getmapvalues", __ref, _sourcemap);}
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 360;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 361;BA.debugLine="Dim listOfValues As List";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 362;BA.debugLine="listOfValues.Initialize";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 363;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 364;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 365;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 366;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 367;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
Debug.JustUpdateDeviceLine();
_value = BA.ObjectToString(_sourcemap.runMethod(false,"GetValueAt",(Object)(_icnt)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 368;BA.debugLine="listOfValues.Add(value)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Add",(Object)((_value)));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 370;BA.debugLine="Return listOfValues";
Debug.JustUpdateDeviceLine();
if (true) return _listofvalues;
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
public static RemoteObject  _getmax(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetMax (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("getmax")) { return __ref.runUserSub(false, "bananomysql","getmax", __ref);}
RemoteObject _sb = RemoteObject.createImmutable("");
 BA.debugLineNum = 81;BA.debugLine="Sub GetMax As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="Dim sb As String = $\"SELECT MAX(${PrimaryKey}) As";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("SELECT MAX("),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_primarykey" /*RemoteObject*/ )))),RemoteObject.createImmutable(") As "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_primarykey" /*RemoteObject*/ )))),RemoteObject.createImmutable(" FROM "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )))))),RemoteObject.createImmutable("")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 83;BA.debugLine="query = sb";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 84;BA.debugLine="command = \"getmax\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("getmax"));
 BA.debugLineNum = 85;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getnextid(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetNextID (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("getnextid")) { return __ref.runUserSub(false, "bananomysql","getnextid", __ref);}
RemoteObject _nextid = RemoteObject.createImmutable(0);
RemoteObject _strid = RemoteObject.createImmutable("");
RemoteObject _nr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ni = RemoteObject.createImmutable("");
 BA.debugLineNum = 104;BA.debugLine="Sub GetNextID As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="Dim nextid As Int";
Debug.JustUpdateDeviceLine();
_nextid = RemoteObject.createImmutable(0);Debug.locals.put("nextid", _nextid);
 BA.debugLineNum = 106;BA.debugLine="Dim strid As String";
Debug.JustUpdateDeviceLine();
_strid = RemoteObject.createImmutable("");Debug.locals.put("strid", _strid);
 BA.debugLineNum = 108;BA.debugLine="If result.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_result" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 109;BA.debugLine="nextid = 0";
Debug.JustUpdateDeviceLine();
_nextid = BA.numberCast(int.class, 0);Debug.locals.put("nextid", _nextid);
 }else {
 BA.debugLineNum = 111;BA.debugLine="Dim nr As Map = result.Get(0)";
Debug.JustUpdateDeviceLine();
_nr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nr.setObject(__ref.getField(false,"_result" /*RemoteObject*/ ).runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("nr", _nr);
 BA.debugLineNum = 112;BA.debugLine="Dim ni As String = nr.GetDefault(PrimaryKey,\"0\")";
Debug.JustUpdateDeviceLine();
_ni = BA.ObjectToString(_nr.runMethod(false,"GetDefault",(Object)((__ref.getField(true,"_primarykey" /*RemoteObject*/ ))),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("ni", _ni);Debug.locals.put("ni", _ni);
 BA.debugLineNum = 113;BA.debugLine="nextid = BANano.parseInt(ni)";
Debug.JustUpdateDeviceLine();
_nextid = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_ni)));Debug.locals.put("nextid", _nextid);
 };
 BA.debugLineNum = 115;BA.debugLine="nextid = nextid + 1";
Debug.JustUpdateDeviceLine();
_nextid = RemoteObject.solve(new RemoteObject[] {_nextid,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nextid", _nextid);
 BA.debugLineNum = 116;BA.debugLine="strid = CStr(nextid)";
Debug.JustUpdateDeviceLine();
_strid = __ref.runClassMethod (b4j.example.bananomysql.class, "_cstr" /*RemoteObject*/ ,(Object)((_nextid)));Debug.locals.put("strid", _strid);
 BA.debugLineNum = 117;BA.debugLine="Return strid";
Debug.JustUpdateDeviceLine();
if (true) return _strid;
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _gettablenames(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTableNames (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("gettablenames")) { return __ref.runUserSub(false, "bananomysql","gettablenames", __ref);}
RemoteObject _sb = RemoteObject.createImmutable("");
 BA.debugLineNum = 89;BA.debugLine="Sub GetTableNames As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="Dim sb As String = $\"select table_name from infor";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("select table_name from information_schema.tables where table_schema = '"),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_dbase" /*RemoteObject*/ )))),RemoteObject.createImmutable("'")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 91;BA.debugLine="query = sb";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 92;BA.debugLine="command = \"select\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("select"));
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
public static RemoteObject  _gettablestructure(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetTableStructure (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("gettablestructure")) { return __ref.runUserSub(false, "bananomysql","gettablestructure", __ref);}
RemoteObject _sb = RemoteObject.createImmutable("");
 BA.debugLineNum = 97;BA.debugLine="Sub GetTableStructure As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="Dim sb As String = $\"describe ${EscapeField(Table";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("describe "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )))))),RemoteObject.createImmutable("")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 99;BA.debugLine="query = sb";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 100;BA.debugLine="command = \"select\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("select"));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _dbname,RemoteObject _tblname,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bananomysql","initialize", __ref, _ba, _dbname, _tblname, _pk);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("dbName", _dbname);
Debug.locals.put("tblName", _tblname);
Debug.locals.put("PK", _pk);
 BA.debugLineNum = 126;BA.debugLine="Public Sub Initialize(dbName As String, tblName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="Schema.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 128;BA.debugLine="recType.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 129;BA.debugLine="Record.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_record" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 130;BA.debugLine="MethodName = \"BANanoMySQL\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_methodname" /*RemoteObject*/ ,BA.ObjectToString("BANanoMySQL"));
 BA.debugLineNum = 131;BA.debugLine="MethodNameDynamic = \"BANanoMySQLDynamic\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_methodnamedynamic" /*RemoteObject*/ ,BA.ObjectToString("BANanoMySQLDynamic"));
 BA.debugLineNum = 132;BA.debugLine="result.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_result" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 133;BA.debugLine="command = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 134;BA.debugLine="PrimaryKey = PK";
Debug.JustUpdateDeviceLine();
__ref.setField ("_primarykey" /*RemoteObject*/ ,_pk);
 BA.debugLineNum = 135;BA.debugLine="DBase = dbName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dbase" /*RemoteObject*/ ,_dbname);
 BA.debugLineNum = 136;BA.debugLine="TableName = tblName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_tablename" /*RemoteObject*/ ,_tblname);
 BA.debugLineNum = 137;BA.debugLine="types.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_types" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 138;BA.debugLine="args.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_args" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 139;BA.debugLine="types = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_types" /*RemoteObject*/ ).setObject (bananomysql.__c.getField(false,"Null"));
 BA.debugLineNum = 140;BA.debugLine="args = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_args" /*RemoteObject*/ ).setObject (bananomysql.__c.getField(false,"Null"));
 BA.debugLineNum = 141;BA.debugLine="query = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 142;BA.debugLine="response = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 143;BA.debugLine="error = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 144;BA.debugLine="affectedRows = 0";
Debug.JustUpdateDeviceLine();
__ref.setField ("_affectedrows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 145;BA.debugLine="json = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 146;BA.debugLine="OK = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ok" /*RemoteObject*/ ,bananomysql.__c.getField(true,"False"));
 BA.debugLineNum = 147;BA.debugLine="host = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_host" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 148;BA.debugLine="username = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_username" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 149;BA.debugLine="password = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_password" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 150;BA.debugLine="DBase = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dbase" /*RemoteObject*/ ,BA.ObjectToString(""));
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
public static RemoteObject  _insert(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Insert (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,389);
if (RapidSub.canDelegate("insert")) { return __ref.runUserSub(false, "bananomysql","insert", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
 BA.debugLineNum = 389;BA.debugLine="Sub Insert As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 390;BA.debugLine="If Schema.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_schema" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 391;BA.debugLine="Log($\"BANanoMySQL.Insert: '${TableName}' schema";
Debug.JustUpdateDeviceLine();
bananomysql.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("BANanoMySQL.Insert: '"),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_tablename" /*RemoteObject*/ )))),RemoteObject.createImmutable("' schema is not set!")))));
 };
 BA.debugLineNum = 393;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 394;BA.debugLine="Dim columns As StringBuilder";
Debug.JustUpdateDeviceLine();
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
 BA.debugLineNum = 395;BA.debugLine="Dim values As StringBuilder";
Debug.JustUpdateDeviceLine();
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 396;BA.debugLine="Dim listOfValues As List = GetMapValues(Record)";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_record" /*RemoteObject*/ )));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 397;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Record)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_record" /*RemoteObject*/ )));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 398;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 399;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 400;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 401;BA.debugLine="columns.Initialize";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 402;BA.debugLine="values.Initialize";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 403;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(TableName)}";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )))))),RemoteObject.createImmutable(" (")))));
 BA.debugLineNum = 404;BA.debugLine="iTot = Record.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_record" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 405;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step16 = 1;
final int limit16 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step16 > 0 && _icnt.<Integer>get().intValue() <= limit16) || (step16 < 0 && _icnt.<Integer>get().intValue() >= limit16) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 406;BA.debugLine="Dim col As String = Record.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(__ref.getField(false,"_record" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 407;BA.debugLine="If iCnt > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_icnt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 408;BA.debugLine="columns.Append(\", \")";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 409;BA.debugLine="values.Append(\", \")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 411;BA.debugLine="columns.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 412;BA.debugLine="values.Append(\"?\")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 414;BA.debugLine="sb.Append(columns.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_columns.runMethod(true,"ToString")));
 BA.debugLineNum = 415;BA.debugLine="sb.Append(\") VALUES (\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(") VALUES (")));
 BA.debugLineNum = 416;BA.debugLine="sb.Append(values.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_values.runMethod(true,"ToString")));
 BA.debugLineNum = 417;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 418;BA.debugLine="query = sb.ToString";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 419;BA.debugLine="args = listOfValues";
Debug.JustUpdateDeviceLine();
__ref.setField ("_args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 420;BA.debugLine="types = listOfTypes";
Debug.JustUpdateDeviceLine();
__ref.setField ("_types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 421;BA.debugLine="command = \"insert\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("insert"));
 BA.debugLineNum = 422;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertreplace(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("InsertReplace (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,427);
if (RapidSub.canDelegate("insertreplace")) { return __ref.runUserSub(false, "bananomysql","insertreplace", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
 BA.debugLineNum = 427;BA.debugLine="Sub InsertReplace As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 428;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 429;BA.debugLine="Dim columns As StringBuilder";
Debug.JustUpdateDeviceLine();
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
 BA.debugLineNum = 430;BA.debugLine="Dim values As StringBuilder";
Debug.JustUpdateDeviceLine();
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 431;BA.debugLine="Dim listOfValues As List = GetMapValues(Record)";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_record" /*RemoteObject*/ )));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 432;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Record)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_record" /*RemoteObject*/ )));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 433;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 434;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 435;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 436;BA.debugLine="columns.Initialize";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 437;BA.debugLine="values.Initialize";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 438;BA.debugLine="sb.Append($\"REPLACE INTO ${EscapeField(TableName)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("REPLACE INTO "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )))))),RemoteObject.createImmutable(" (")))));
 BA.debugLineNum = 439;BA.debugLine="iTot = Record.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_record" /*RemoteObject*/ ).runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 440;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _icnt.<Integer>get().intValue() <= limit13) || (step13 < 0 && _icnt.<Integer>get().intValue() >= limit13) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 441;BA.debugLine="Dim col As String = Record.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(__ref.getField(false,"_record" /*RemoteObject*/ ).runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 442;BA.debugLine="If iCnt > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_icnt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 443;BA.debugLine="columns.Append(\", \")";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 444;BA.debugLine="values.Append(\", \")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 446;BA.debugLine="columns.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 447;BA.debugLine="values.Append(\"?\")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 449;BA.debugLine="sb.Append(columns.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_columns.runMethod(true,"ToString")));
 BA.debugLineNum = 450;BA.debugLine="sb.Append(\") VALUES (\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(") VALUES (")));
 BA.debugLineNum = 451;BA.debugLine="sb.Append(values.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_values.runMethod(true,"ToString")));
 BA.debugLineNum = 452;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 453;BA.debugLine="query = sb.ToString";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 454;BA.debugLine="args = listOfValues";
Debug.JustUpdateDeviceLine();
__ref.setField ("_args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 455;BA.debugLine="types = listOfTypes";
Debug.JustUpdateDeviceLine();
__ref.setField ("_types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 456;BA.debugLine="command = \"replace\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("replace"));
 BA.debugLineNum = 457;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _join(RemoteObject __ref,RemoteObject _delimiter,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("Join (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,487);
if (RapidSub.canDelegate("join")) { return __ref.runUserSub(false, "bananomysql","join", __ref, _delimiter, _lst);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _fld = RemoteObject.createImmutable("");
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 487;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 488;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 489;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 490;BA.debugLine="Dim fld As String";
Debug.JustUpdateDeviceLine();
_fld = RemoteObject.createImmutable("");Debug.locals.put("fld", _fld);
 BA.debugLineNum = 491;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 492;BA.debugLine="fld = lst.Get(0)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 493;BA.debugLine="sb.Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fld));
 BA.debugLineNum = 494;BA.debugLine="For i = 1 To lst.size - 1";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step7 > 0 && _i.<Integer>get().intValue() <= limit7) || (step7 < 0 && _i.<Integer>get().intValue() >= limit7) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 495;BA.debugLine="Dim fld As String = lst.Get(i)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("fld", _fld);Debug.locals.put("fld", _fld);
 BA.debugLineNum = 496;BA.debugLine="sb.Append(delimiter).Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_delimiter)).runVoidMethod ("Append",(Object)(_fld));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 498;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 499;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _joinfields(RemoteObject __ref,RemoteObject _delimiter,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("JoinFields (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("joinfields")) { return __ref.runUserSub(false, "bananomysql","joinfields", __ref, _delimiter, _lst);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _fld = RemoteObject.createImmutable("");
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 470;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 471;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 472;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 473;BA.debugLine="Dim fld As String";
Debug.JustUpdateDeviceLine();
_fld = RemoteObject.createImmutable("");Debug.locals.put("fld", _fld);
 BA.debugLineNum = 474;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 475;BA.debugLine="fld = lst.Get(0)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 476;BA.debugLine="fld = EscapeField(fld)";
Debug.JustUpdateDeviceLine();
_fld = __ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_fld));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 477;BA.debugLine="sb.Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fld));
 BA.debugLineNum = 478;BA.debugLine="For i = 1 To lst.size - 1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step8 > 0 && _i.<Integer>get().intValue() <= limit8) || (step8 < 0 && _i.<Integer>get().intValue() >= limit8) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 479;BA.debugLine="Dim fld As String = lst.Get(i)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("fld", _fld);Debug.locals.put("fld", _fld);
 BA.debugLineNum = 480;BA.debugLine="fld = EscapeField(fld)";
Debug.JustUpdateDeviceLine();
_fld = __ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_fld));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 481;BA.debugLine="sb.Append(delimiter).Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_delimiter)).runVoidMethod ("Append",(Object)(_fld));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 483;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 484;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _json2map(RemoteObject __ref,RemoteObject _strjson) throws Exception{
try {
		Debug.PushSubsStack("Json2Map (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("json2map")) { return __ref.runUserSub(false, "bananomysql","json2map", __ref, _strjson);}
RemoteObject _jsonx = RemoteObject.declareNull("com.ab.banano.BANanoJSONParser");
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("strJSON", _strjson);
 BA.debugLineNum = 228;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 229;BA.debugLine="Dim jsonx As BANanoJSONParser";
Debug.JustUpdateDeviceLine();
_jsonx = RemoteObject.createNew ("com.ab.banano.BANanoJSONParser");Debug.locals.put("jsonx", _jsonx);
 BA.debugLineNum = 230;BA.debugLine="Dim Map1 As Map";
Debug.JustUpdateDeviceLine();
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 231;BA.debugLine="Map1.Initialize";
Debug.JustUpdateDeviceLine();
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 232;BA.debugLine="Map1.clear";
Debug.JustUpdateDeviceLine();
_map1.runVoidMethod ("Clear");
 BA.debugLineNum = 233;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 234;BA.debugLine="If strJSON.length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_strjson.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 235;BA.debugLine="jsonx.Initialize(strJSON)";
Debug.JustUpdateDeviceLine();
_jsonx.runVoidMethod ("Initialize",(Object)(_strjson));
 BA.debugLineNum = 236;BA.debugLine="Map1 = jsonx.NextObject";
Debug.JustUpdateDeviceLine();
_map1 = _jsonx.runMethod(false,"NextObject");Debug.locals.put("Map1", _map1);
 };
 BA.debugLineNum = 238;BA.debugLine="Return Map1";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _map1;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 240;BA.debugLine="Return Map1";
Debug.JustUpdateDeviceLine();
if (true) return _map1;
 };
 BA.debugLineNum = 242;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _map2json(RemoteObject __ref,RemoteObject _mp) throws Exception{
try {
		Debug.PushSubsStack("Map2Json (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,245);
if (RapidSub.canDelegate("map2json")) { return __ref.runUserSub(false, "bananomysql","map2json", __ref, _mp);}
RemoteObject _jsonx = RemoteObject.declareNull("com.ab.banano.BANanoJSONGenerator");
Debug.locals.put("mp", _mp);
 BA.debugLineNum = 245;BA.debugLine="Sub Map2Json(mp As Map) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 246;BA.debugLine="Dim jsonx As BANanoJSONGenerator";
Debug.JustUpdateDeviceLine();
_jsonx = RemoteObject.createNew ("com.ab.banano.BANanoJSONGenerator");Debug.locals.put("jsonx", _jsonx);
 BA.debugLineNum = 247;BA.debugLine="jsonx.Initialize(mp)";
Debug.JustUpdateDeviceLine();
_jsonx.runVoidMethod ("Initialize",(Object)(_mp));
 BA.debugLineNum = 248;BA.debugLine="Return jsonx.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _jsonx.runMethod(true,"ToString");
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read(RemoteObject __ref,RemoteObject _primaryvalue) throws Exception{
try {
		Debug.PushSubsStack("Read (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,502);
if (RapidSub.canDelegate("read")) { return __ref.runUserSub(false, "bananomysql","read", __ref, _primaryvalue);}
RemoteObject _qw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("primaryValue", _primaryvalue);
 BA.debugLineNum = 502;BA.debugLine="Sub Read(primaryValue As String) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 503;BA.debugLine="Dim qw As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_qw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_qw = bananomysql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("qw", _qw);Debug.locals.put("qw", _qw);
 BA.debugLineNum = 504;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
Debug.JustUpdateDeviceLine();
_qw.runVoidMethod ("Put",(Object)((__ref.getField(true,"_primarykey" /*RemoteObject*/ ))),(Object)((_primaryvalue)));
 BA.debugLineNum = 505;BA.debugLine="SelectWhere(TableName, Array(\"*\"), qw, Null, Arra";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_selectwhere" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )),(Object)(bananomysql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*"))})))),(Object)(_qw),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananomysql.__c.getField(false,"Null")),(Object)(bananomysql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(__ref.getField(true,"_primarykey" /*RemoteObject*/ ))})))));
 BA.debugLineNum = 506;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _recordfrommap(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("RecordFromMap (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("recordfrommap")) { return __ref.runUserSub(false, "bananomysql","recordfrommap", __ref, _sm);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 57;BA.debugLine="Sub RecordFromMap(sm As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Record.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_record" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 59;BA.debugLine="For Each k As String In sm.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _sm.runMethod(false,"Keys");
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 60;BA.debugLine="Dim v As Object = sm.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _sm.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 61;BA.debugLine="Record.Put(k, v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_record" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _schemaaddblob(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddBlob (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("schemaaddblob")) { return __ref.runUserSub(false, "bananomysql","schemaaddblob", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 199;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 200;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 201;BA.debugLine="Schema.Put(b, DB_BLOB)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_blob" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 203;BA.debugLine="AddBlobs(bools)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_addblobs" /*RemoteObject*/ ,(Object)(_bools));
 BA.debugLineNum = 204;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _schemaaddboolean(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddBoolean (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("schemaaddboolean")) { return __ref.runUserSub(false, "bananomysql","schemaaddboolean", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 166;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 167;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 168;BA.debugLine="Schema.Put(b, DB_BOOL)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_bool" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 170;BA.debugLine="AddBooleans(bools)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_addbooleans" /*RemoteObject*/ ,(Object)(_bools));
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
public static RemoteObject  _schemaadddate(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddDate (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,219);
if (RapidSub.canDelegate("schemaadddate")) { return __ref.runUserSub(false, "bananomysql","schemaadddate", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 219;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 220;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 221;BA.debugLine="Schema.Put(b, DB_DATE)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_date" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 223;BA.debugLine="AddStrings(bools)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_addstrings" /*RemoteObject*/ ,(Object)(_bools));
 BA.debugLineNum = 224;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 225;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SchemaAddFloat (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("schemaaddfloat")) { return __ref.runUserSub(false, "bananomysql","schemaaddfloat", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 191;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 193;BA.debugLine="Schema.Put(b, DB_FLOAT)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_float" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 195;BA.debugLine="AddDoubles(bools)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_adddoubles" /*RemoteObject*/ ,(Object)(_bools));
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
public static RemoteObject  _schemaaddint(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddInt (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,183);
if (RapidSub.canDelegate("schemaaddint")) { return __ref.runUserSub(false, "bananomysql","schemaaddint", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 183;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 184;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 185;BA.debugLine="Schema.Put(b, DB_INT)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_int" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 187;BA.debugLine="AddIntegers(bools)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_addintegers" /*RemoteObject*/ ,(Object)(_bools));
 BA.debugLineNum = 188;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 189;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SchemaAddText (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,207);
if (RapidSub.canDelegate("schemaaddtext")) { return __ref.runUserSub(false, "bananomysql","schemaaddtext", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 207;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 208;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 209;BA.debugLine="Schema.Put(b, DB_STRING)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_string" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 211;BA.debugLine="AddStrings(bools)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_addstrings" /*RemoteObject*/ ,(Object)(_bools));
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
public static RemoteObject  _schemaclear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SchemaClear (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("schemaclear")) { return __ref.runUserSub(false, "bananomysql","schemaclear", __ref);}
 BA.debugLineNum = 155;BA.debugLine="Sub SchemaClear As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 156;BA.debugLine="Schema.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Clear");
 BA.debugLineNum = 157;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 158;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SchemaCreateTable (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("schemacreatetable")) { return __ref.runUserSub(false, "bananomysql","schemacreatetable", __ref, _tblname, _pk, _auto);}
Debug.locals.put("tblName", _tblname);
Debug.locals.put("PK", _pk);
Debug.locals.put("Auto", _auto);
 BA.debugLineNum = 215;BA.debugLine="Sub SchemaCreateTable(tblName As String, PK As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 216;BA.debugLine="Return CreateTable(tblName, Schema, PK, Auto)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananomysql.class, "_createtable" /*RemoteObject*/ ,(Object)(_tblname),(Object)(__ref.getField(false,"_schema" /*RemoteObject*/ )),(Object)(_pk),(Object)(_auto));
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _schemafromdesign(RemoteObject __ref,RemoteObject _vdesign) throws Exception{
try {
		Debug.PushSubsStack("SchemaFromDesign (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("schemafromdesign")) { return __ref.runUserSub(false, "bananomysql","schemafromdesign", __ref, _vdesign);}
Debug.locals.put("vDesign", _vdesign);
 BA.debugLineNum = 174;BA.debugLine="Sub SchemaFromDesign(vDesign As VMContainer)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 175;BA.debugLine="SchemaAddBoolean(vDesign.Booleans)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_schemaaddboolean" /*RemoteObject*/ ,(Object)(_vdesign.getField(false,"_booleans" /*RemoteObject*/ )));
 BA.debugLineNum = 176;BA.debugLine="SchemaAddDate(vDesign.Dates)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_schemaadddate" /*RemoteObject*/ ,(Object)(_vdesign.getField(false,"_dates" /*RemoteObject*/ )));
 BA.debugLineNum = 177;BA.debugLine="SchemaAddFloat(vDesign.Doubles)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_schemaaddfloat" /*RemoteObject*/ ,(Object)(_vdesign.getField(false,"_doubles" /*RemoteObject*/ )));
 BA.debugLineNum = 178;BA.debugLine="SchemaAddInt(vDesign.Integers)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_schemaaddint" /*RemoteObject*/ ,(Object)(_vdesign.getField(false,"_integers" /*RemoteObject*/ )));
 BA.debugLineNum = 179;BA.debugLine="SchemaAddText(vDesign.Strings)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_schemaaddtext" /*RemoteObject*/ ,(Object)(_vdesign.getField(false,"_strings" /*RemoteObject*/ )));
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
public static RemoteObject  _selectall(RemoteObject __ref,RemoteObject _tblfields,RemoteObject _orderby) throws Exception{
try {
		Debug.PushSubsStack("SelectAll (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,656);
if (RapidSub.canDelegate("selectall")) { return __ref.runUserSub(false, "bananomysql","selectall", __ref, _tblfields, _orderby);}
RemoteObject _fld1 = RemoteObject.createImmutable("");
RemoteObject _selfields = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stro = RemoteObject.createImmutable("");
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("orderBy", _orderby);
 BA.debugLineNum = 656;BA.debugLine="Sub SelectAll(tblfields As List, orderBy As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 658;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
Debug.JustUpdateDeviceLine();
_fld1 = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld1", _fld1);Debug.locals.put("fld1", _fld1);
 BA.debugLineNum = 659;BA.debugLine="Dim selFIelds As String = \"\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("");Debug.locals.put("selFIelds", _selfields);Debug.locals.put("selFIelds", _selfields);
 BA.debugLineNum = 660;BA.debugLine="Select Case fld1";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fld1,BA.ObjectToString("*"))) {
case 0: {
 BA.debugLineNum = 662;BA.debugLine="selFIelds = \"*\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("*");Debug.locals.put("selFIelds", _selfields);
 break; }
default: {
 BA.debugLineNum = 664;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
Debug.JustUpdateDeviceLine();
_selfields = __ref.runClassMethod (b4j.example.bananomysql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_tblfields));Debug.locals.put("selFIelds", _selfields);
 break; }
}
;
 BA.debugLineNum = 666;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 667;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 668;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selfields))),RemoteObject.createImmutable(" FROM "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 669;BA.debugLine="If orderBy <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_orderby)) { 
 BA.debugLineNum = 671;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
Debug.JustUpdateDeviceLine();
_stro = __ref.runClassMethod (b4j.example.bananomysql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_orderby));Debug.locals.put("stro", _stro);Debug.locals.put("stro", _stro);
 BA.debugLineNum = 672;BA.debugLine="If stro.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_stro.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 673;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" ORDER BY "))).runVoidMethod ("Append",(Object)(_stro));
 };
 };
 BA.debugLineNum = 676;BA.debugLine="query = sb.tostring";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 677;BA.debugLine="command =  \"select\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("select"));
 BA.debugLineNum = 678;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 679;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectdistinctall(RemoteObject __ref,RemoteObject _tblfields,RemoteObject _orderby) throws Exception{
try {
		Debug.PushSubsStack("SelectDistinctAll (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,682);
if (RapidSub.canDelegate("selectdistinctall")) { return __ref.runUserSub(false, "bananomysql","selectdistinctall", __ref, _tblfields, _orderby);}
RemoteObject _fld1 = RemoteObject.createImmutable("");
RemoteObject _selfields = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stro = RemoteObject.createImmutable("");
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("orderBy", _orderby);
 BA.debugLineNum = 682;BA.debugLine="Sub SelectDistinctAll(tblfields As List, orderBy A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 684;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
Debug.JustUpdateDeviceLine();
_fld1 = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld1", _fld1);Debug.locals.put("fld1", _fld1);
 BA.debugLineNum = 685;BA.debugLine="Dim selFIelds As String = \"\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("");Debug.locals.put("selFIelds", _selfields);Debug.locals.put("selFIelds", _selfields);
 BA.debugLineNum = 686;BA.debugLine="Select Case fld1";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fld1,BA.ObjectToString("*"))) {
case 0: {
 BA.debugLineNum = 688;BA.debugLine="selFIelds = \"*\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("*");Debug.locals.put("selFIelds", _selfields);
 break; }
default: {
 BA.debugLineNum = 690;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
Debug.JustUpdateDeviceLine();
_selfields = __ref.runClassMethod (b4j.example.bananomysql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_tblfields));Debug.locals.put("selFIelds", _selfields);
 break; }
}
;
 BA.debugLineNum = 692;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 693;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 694;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selfields))),RemoteObject.createImmutable(" FROM "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 695;BA.debugLine="If orderBy <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_orderby)) { 
 BA.debugLineNum = 697;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
Debug.JustUpdateDeviceLine();
_stro = __ref.runClassMethod (b4j.example.bananomysql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_orderby));Debug.locals.put("stro", _stro);Debug.locals.put("stro", _stro);
 BA.debugLineNum = 698;BA.debugLine="If stro.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_stro.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 699;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" ORDER BY "))).runVoidMethod ("Append",(Object)(_stro));
 };
 };
 BA.debugLineNum = 702;BA.debugLine="query = sb.tostring";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 703;BA.debugLine="command =  \"select\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("select"));
 BA.debugLineNum = 704;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 705;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _selectdistinctwhere(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields,RemoteObject _tblwhere,RemoteObject _operators,RemoteObject _orderby) throws Exception{
try {
		Debug.PushSubsStack("SelectDistinctWhere (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,563);
if (RapidSub.canDelegate("selectdistinctwhere")) { return __ref.runUserSub(false, "bananomysql","selectdistinctwhere", __ref, _tblname, _tblfields, _tblwhere, _operators, _orderby);}
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
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
Debug.locals.put("orderBy", _orderby);
 BA.debugLineNum = 563;BA.debugLine="Sub SelectDistinctWhere(tblName As String, tblfiel";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 564;BA.debugLine="If Schema.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_schema" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 565;BA.debugLine="Log($\"BANanoMySQL.SelectWhere: '${tblName}' sche";
Debug.JustUpdateDeviceLine();
bananomysql.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("BANanoMySQL.SelectWhere: '"),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable("' schema is not set!")))));
 };
 BA.debugLineNum = 567;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananomysql.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 568;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 569;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 571;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
Debug.JustUpdateDeviceLine();
_fld1 = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld1", _fld1);Debug.locals.put("fld1", _fld1);
 BA.debugLineNum = 572;BA.debugLine="Dim selFIelds As String = \"\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("");Debug.locals.put("selFIelds", _selfields);Debug.locals.put("selFIelds", _selfields);
 BA.debugLineNum = 573;BA.debugLine="Select Case fld1";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fld1,BA.ObjectToString("*"))) {
case 0: {
 BA.debugLineNum = 575;BA.debugLine="selFIelds = \"*\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("*");Debug.locals.put("selFIelds", _selfields);
 break; }
default: {
 BA.debugLineNum = 577;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
Debug.JustUpdateDeviceLine();
_selfields = __ref.runClassMethod (b4j.example.bananomysql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_tblfields));Debug.locals.put("selFIelds", _selfields);
 break; }
}
;
 BA.debugLineNum = 579;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 580;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 581;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT DISTINCT "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selfields))),RemoteObject.createImmutable(" FROM "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" WHERE ")))));
 BA.debugLineNum = 582;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 583;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 584;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step20 = 1;
final int limit20 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step20 > 0 && _i.<Integer>get().intValue() <= limit20) || (step20 < 0 && _i.<Integer>get().intValue() >= limit20) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 585;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 586;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 588;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 589;BA.debugLine="Dim oper As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_oper = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("oper", _oper);Debug.locals.put("oper", _oper);
 BA.debugLineNum = 590;BA.debugLine="sb.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 591;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_oper))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 593;BA.debugLine="If orderBy <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_orderby)) { 
 BA.debugLineNum = 595;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
Debug.JustUpdateDeviceLine();
_stro = __ref.runClassMethod (b4j.example.bananomysql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_orderby));Debug.locals.put("stro", _stro);Debug.locals.put("stro", _stro);
 BA.debugLineNum = 596;BA.debugLine="If stro.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_stro.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 597;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" ORDER BY "))).runVoidMethod ("Append",(Object)(_stro));
 };
 };
 BA.debugLineNum = 600;BA.debugLine="query = sb.tostring";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 601;BA.debugLine="args = listOfValues";
Debug.JustUpdateDeviceLine();
__ref.setField ("_args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 602;BA.debugLine="types = listOfTypes";
Debug.JustUpdateDeviceLine();
__ref.setField ("_types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 603;BA.debugLine="command = \"select\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("select"));
 BA.debugLineNum = 604;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 605;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SelectWhere (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,518);
if (RapidSub.canDelegate("selectwhere")) { return __ref.runUserSub(false, "bananomysql","selectwhere", __ref, _tblname, _tblfields, _tblwhere, _operators, _orderby);}
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
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
Debug.locals.put("orderBy", _orderby);
 BA.debugLineNum = 518;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 519;BA.debugLine="If Schema.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_schema" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 520;BA.debugLine="Log($\"BANanoMySQL.SelectWhere: '${tblName}' sche";
Debug.JustUpdateDeviceLine();
bananomysql.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("BANanoMySQL.SelectWhere: '"),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable("' schema is not set!")))));
 };
 BA.debugLineNum = 522;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananomysql.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 523;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 524;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 526;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
Debug.JustUpdateDeviceLine();
_fld1 = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld1", _fld1);Debug.locals.put("fld1", _fld1);
 BA.debugLineNum = 527;BA.debugLine="Dim selFIelds As String = \"\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("");Debug.locals.put("selFIelds", _selfields);Debug.locals.put("selFIelds", _selfields);
 BA.debugLineNum = 528;BA.debugLine="Select Case fld1";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fld1,BA.ObjectToString("*"))) {
case 0: {
 BA.debugLineNum = 530;BA.debugLine="selFIelds = \"*\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("*");Debug.locals.put("selFIelds", _selfields);
 break; }
default: {
 BA.debugLineNum = 532;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
Debug.JustUpdateDeviceLine();
_selfields = __ref.runClassMethod (b4j.example.bananomysql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_tblfields));Debug.locals.put("selFIelds", _selfields);
 break; }
}
;
 BA.debugLineNum = 534;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 535;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 536;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selfields))),RemoteObject.createImmutable(" FROM "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" WHERE ")))));
 BA.debugLineNum = 537;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 538;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 539;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step20 = 1;
final int limit20 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step20 > 0 && _i.<Integer>get().intValue() <= limit20) || (step20 < 0 && _i.<Integer>get().intValue() >= limit20) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step20))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 540;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 541;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 543;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 544;BA.debugLine="Dim oper As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_oper = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("oper", _oper);Debug.locals.put("oper", _oper);
 BA.debugLineNum = 545;BA.debugLine="sb.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 546;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_oper))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 548;BA.debugLine="If orderBy <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_orderby)) { 
 BA.debugLineNum = 550;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
Debug.JustUpdateDeviceLine();
_stro = __ref.runClassMethod (b4j.example.bananomysql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_orderby));Debug.locals.put("stro", _stro);Debug.locals.put("stro", _stro);
 BA.debugLineNum = 551;BA.debugLine="If stro.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_stro.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 552;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" ORDER BY "))).runVoidMethod ("Append",(Object)(_stro));
 };
 };
 BA.debugLineNum = 555;BA.debugLine="query = sb.tostring";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 556;BA.debugLine="args = listOfValues";
Debug.JustUpdateDeviceLine();
__ref.setField ("_args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 557;BA.debugLine="types = listOfTypes";
Debug.JustUpdateDeviceLine();
__ref.setField ("_types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 558;BA.debugLine="command = \"select\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("select"));
 BA.debugLineNum = 559;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 560;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setconnection(RemoteObject __ref,RemoteObject _shost,RemoteObject _susername,RemoteObject _spassword,RemoteObject _sdbname) throws Exception{
try {
		Debug.PushSubsStack("SetConnection (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("setconnection")) { return __ref.runUserSub(false, "bananomysql","setconnection", __ref, _shost, _susername, _spassword, _sdbname);}
Debug.locals.put("shost", _shost);
Debug.locals.put("susername", _susername);
Debug.locals.put("spassword", _spassword);
Debug.locals.put("sdbname", _sdbname);
 BA.debugLineNum = 49;BA.debugLine="Sub SetConnection(shost As String, susername As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="host = shost";
Debug.JustUpdateDeviceLine();
__ref.setField ("_host" /*RemoteObject*/ ,_shost);
 BA.debugLineNum = 51;BA.debugLine="username = susername";
Debug.JustUpdateDeviceLine();
__ref.setField ("_username" /*RemoteObject*/ ,_susername);
 BA.debugLineNum = 52;BA.debugLine="password = spassword";
Debug.JustUpdateDeviceLine();
__ref.setField ("_password" /*RemoteObject*/ ,_spassword);
 BA.debugLineNum = 53;BA.debugLine="DBase = sdbname";
Debug.JustUpdateDeviceLine();
__ref.setField ("_dbase" /*RemoteObject*/ ,_sdbname);
 BA.debugLineNum = 54;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfield(RemoteObject __ref,RemoteObject _fldname,RemoteObject _fldvalue) throws Exception{
try {
		Debug.PushSubsStack("SetField (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("setfield")) { return __ref.runUserSub(false, "bananomysql","setfield", __ref, _fldname, _fldvalue);}
Debug.locals.put("fldName", _fldname);
Debug.locals.put("fldValue", _fldvalue);
 BA.debugLineNum = 160;BA.debugLine="Sub SetField(fldName As String, fldValue As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="Record.Put(fldName, fldValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_record" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_fldname)),(Object)(_fldvalue));
 BA.debugLineNum = 162;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _update(RemoteObject __ref,RemoteObject _privalue) throws Exception{
try {
		Debug.PushSubsStack("Update (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,776);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "bananomysql","update", __ref, _privalue);}
RemoteObject _tblwhere = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("priValue", _privalue);
 BA.debugLineNum = 776;BA.debugLine="Sub Update(priValue As String) As BANanoMySQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 777;BA.debugLine="Dim tblWhere As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_tblwhere = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tblwhere = bananomysql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("tblWhere", _tblwhere);Debug.locals.put("tblWhere", _tblwhere);
 BA.debugLineNum = 778;BA.debugLine="tblWhere.Put(PrimaryKey, priValue)";
Debug.JustUpdateDeviceLine();
_tblwhere.runVoidMethod ("Put",(Object)((__ref.getField(true,"_primarykey" /*RemoteObject*/ ))),(Object)((_privalue)));
 BA.debugLineNum = 779;BA.debugLine="UpdateWhere(TableName, Record, tblWhere, Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.bananomysql.class, "_updatewhere" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )),(Object)(__ref.getField(false,"_record" /*RemoteObject*/ )),(Object)(_tblwhere),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananomysql.__c.getField(false,"Null")));
 BA.debugLineNum = 780;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 781;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updateall(RemoteObject __ref,RemoteObject _tblfields,RemoteObject _operators) throws Exception{
try {
		Debug.PushSubsStack("UpdateAll (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,829);
if (RapidSub.canDelegate("updateall")) { return __ref.runUserSub(false, "bananomysql","updateall", __ref, _tblfields, _operators);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _oper = RemoteObject.createImmutable("");
Debug.locals.put("tblFields", _tblfields);
Debug.locals.put("operators", _operators);
 BA.debugLineNum = 829;BA.debugLine="Sub UpdateAll(tblFields As Map, operators As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 830;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananomysql.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 831;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 832;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
Debug.JustUpdateDeviceLine();
bananomysql._args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
bananomysql._args = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblfields));__ref.setField("_args",bananomysql._args);
 BA.debugLineNum = 833;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 834;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 835;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(TableName)} SET";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_tablename" /*RemoteObject*/ )))))),RemoteObject.createImmutable(" SET ")))));
 BA.debugLineNum = 836;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 837;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 838;BA.debugLine="For i = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _itot.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 839;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 840;BA.debugLine="Dim oper As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_oper = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("oper", _oper);Debug.locals.put("oper", _oper);
 BA.debugLineNum = 841;BA.debugLine="sb.Append(col)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_col));
 BA.debugLineNum = 842;BA.debugLine="If i <> iTot Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, _itot))) { 
 BA.debugLineNum = 843;BA.debugLine="sb.Append(\" = ?,\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ?,")));
 }else {
 BA.debugLineNum = 845;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_oper))),RemoteObject.createImmutable(" ?")))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 848;BA.debugLine="query = sb.tostring";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 849;BA.debugLine="args = args";
Debug.JustUpdateDeviceLine();
__ref.setField ("_args" /*RemoteObject*/ ,__ref.getField(false,"_args" /*RemoteObject*/ ));
 BA.debugLineNum = 850;BA.debugLine="types = listOfTypes";
Debug.JustUpdateDeviceLine();
__ref.setField ("_types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 851;BA.debugLine="command = \"update\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("update"));
 BA.debugLineNum = 852;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 853;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("UpdateWhere (bananomysql) ","bananomysql",10,__ref.getField(false, "ba"),__ref,784);
if (RapidSub.canDelegate("updatewhere")) { return __ref.runUserSub(false, "bananomysql","updatewhere", __ref, _tblname, _tblfields, _tblwhere, _operators);}
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
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
 BA.debugLineNum = 784;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 785;BA.debugLine="If Schema.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_schema" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 786;BA.debugLine="Log($\"BANanoMySQL.UpdateWhere: '${tblName}' sche";
Debug.JustUpdateDeviceLine();
bananomysql.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("BANanoMySQL.UpdateWhere: '"),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable("' schema is not set!")))));
 };
 BA.debugLineNum = 788;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananomysql.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 789;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 790;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes1 = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes1", _listoftypes1);Debug.locals.put("listOfTypes1", _listoftypes1);
 BA.debugLineNum = 791;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("AddAll",(Object)(_listoftypes1));
 BA.debugLineNum = 792;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 793;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
Debug.JustUpdateDeviceLine();
_listofvalues1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues1 = __ref.runClassMethod (b4j.example.bananomysql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues1", _listofvalues1);Debug.locals.put("listOfValues1", _listofvalues1);
 BA.debugLineNum = 794;BA.debugLine="listOfValues.AddAll(listOfValues1)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("AddAll",(Object)(_listofvalues1));
 BA.debugLineNum = 795;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 796;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 797;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" SET ")))));
 BA.debugLineNum = 798;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 799;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 800;BA.debugLine="For i = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step16 = 1;
final int limit16 = _itot.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step16 > 0 && _i.<Integer>get().intValue() <= limit16) || (step16 < 0 && _i.<Integer>get().intValue() >= limit16) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step16))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 801;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 802;BA.debugLine="sb.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 803;BA.debugLine="If i <> iTot Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, _itot))) { 
 BA.debugLineNum = 804;BA.debugLine="sb.Append(\"= ?,\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("= ?,")));
 }else {
 BA.debugLineNum = 806;BA.debugLine="sb.Append(\"= ?\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("= ?")));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 809;BA.debugLine="sb.Append($\" WHERE \"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.createImmutable(" WHERE "))));
 BA.debugLineNum = 810;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 811;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step27 = 1;
final int limit27 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step27 > 0 && _i.<Integer>get().intValue() <= limit27) || (step27 < 0 && _i.<Integer>get().intValue() >= limit27) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step27))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 812;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 813;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 815;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 816;BA.debugLine="sb.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananomysql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 817;BA.debugLine="Dim opr As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_opr = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("opr", _opr);Debug.locals.put("opr", _opr);
 BA.debugLineNum = 818;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananomysql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_opr))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 820;BA.debugLine="query = sb.tostring";
Debug.JustUpdateDeviceLine();
__ref.setField ("_query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 821;BA.debugLine="args = listOfValues";
Debug.JustUpdateDeviceLine();
__ref.setField ("_args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 822;BA.debugLine="types = listOfTypes";
Debug.JustUpdateDeviceLine();
__ref.setField ("_types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 823;BA.debugLine="command = \"update\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_command" /*RemoteObject*/ ,BA.ObjectToString("update"));
 BA.debugLineNum = 824;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 825;BA.debugLine="End Sub";
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