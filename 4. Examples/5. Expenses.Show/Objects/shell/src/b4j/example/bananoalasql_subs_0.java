package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class bananoalasql_subs_0 {


public static RemoteObject  _addblobs(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddBlobs (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("addblobs")) { return __ref.runUserSub(false, "bananoalasql","addblobs", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 142;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 144;BA.debugLine="recType.Put(strfld,\"BLOB\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("BLOB"))));
 }
}Debug.locals.put("strfld", _strfld);
;
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
public static RemoteObject  _addbooleans(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddBooleans (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("addbooleans")) { return __ref.runUserSub(false, "bananoalasql","addbooleans", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 134;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoAlaSQ";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 136;BA.debugLine="recType.Put(strfld,\"BOOL\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("BOOL"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 138;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddDoubles (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("adddoubles")) { return __ref.runUserSub(false, "bananoalasql","adddoubles", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 126;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 128;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("DOUBLE"))));
 }
}Debug.locals.put("strfld", _strfld);
;
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
public static RemoteObject  _addintegers(RemoteObject __ref,RemoteObject _fieldnames) throws Exception{
try {
		Debug.PushSubsStack("AddIntegers (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("addintegers")) { return __ref.runUserSub(false, "bananoalasql","addintegers", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 118;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoAlaSQ";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 120;BA.debugLine="recType.Put(strfld,\"INT\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("INT"))));
 }
}Debug.locals.put("strfld", _strfld);
;
 BA.debugLineNum = 122;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddStrings (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("addstrings")) { return __ref.runUserSub(false, "bananoalasql","addstrings", __ref, _fieldnames);}
RemoteObject _strfld = RemoteObject.createImmutable("");
Debug.locals.put("fieldNames", _fieldnames);
 BA.debugLineNum = 110;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="For Each strfld As String In fieldNames";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _fieldnames;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strfld", _strfld);
Debug.locals.put("strfld", _strfld);
 BA.debugLineNum = 112;BA.debugLine="recType.Put(strfld,\"STRING\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_strfld)),(Object)((RemoteObject.createImmutable("STRING"))));
 }
}Debug.locals.put("strfld", _strfld);
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
bananoalasql._db_bool = BA.ObjectToString("BOOL");__ref.setField("_db_bool",bananoalasql._db_bool);
 //BA.debugLineNum = 4;BA.debugLine="Public const DB_INT As String = \"INT\"";
bananoalasql._db_int = BA.ObjectToString("INT");__ref.setField("_db_int",bananoalasql._db_int);
 //BA.debugLineNum = 5;BA.debugLine="Public const DB_STRING As String = \"STRING\"";
bananoalasql._db_string = BA.ObjectToString("STRING");__ref.setField("_db_string",bananoalasql._db_string);
 //BA.debugLineNum = 6;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
bananoalasql._db_real = BA.ObjectToString("REAL");__ref.setField("_db_real",bananoalasql._db_real);
 //BA.debugLineNum = 7;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
bananoalasql._db_date = BA.ObjectToString("DATE");__ref.setField("_db_date",bananoalasql._db_date);
 //BA.debugLineNum = 8;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
bananoalasql._db_blob = BA.ObjectToString("BLOB");__ref.setField("_db_blob",bananoalasql._db_blob);
 //BA.debugLineNum = 9;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
bananoalasql._db_float = BA.ObjectToString("FLOAT");__ref.setField("_db_float",bananoalasql._db_float);
 //BA.debugLineNum = 10;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
bananoalasql._db_integer = BA.ObjectToString("INTEGER");__ref.setField("_db_integer",bananoalasql._db_integer);
 //BA.debugLineNum = 11;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
bananoalasql._db_text = BA.ObjectToString("TEXT");__ref.setField("_db_text",bananoalasql._db_text);
 //BA.debugLineNum = 12;BA.debugLine="Private recType As Map";
bananoalasql._rectype = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_rectype",bananoalasql._rectype);
 //BA.debugLineNum = 13;BA.debugLine="Type AlaSQLResultSet(response As String, result A";
;
 //BA.debugLineNum = 15;BA.debugLine="Private BANano As BANano  'ignore";
bananoalasql._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",bananoalasql._banano);
 //BA.debugLineNum = 16;BA.debugLine="Private Schema As Map";
bananoalasql._schema = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_schema",bananoalasql._schema);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createtable(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblfields,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("CreateTable (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("createtable")) { return __ref.runUserSub(false, "bananoalasql","createtable", __ref, _tblname, _tblfields, _pk);}
RemoteObject _fldname = RemoteObject.createImmutable("");
RemoteObject _fldtype = RemoteObject.createImmutable("");
RemoteObject _fldtot = RemoteObject.createImmutable(0);
RemoteObject _fldcnt = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblFields", _tblfields);
Debug.locals.put("PK", _pk);
 BA.debugLineNum = 229;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 230;BA.debugLine="Dim fldName As String";
Debug.JustUpdateDeviceLine();
_fldname = RemoteObject.createImmutable("");Debug.locals.put("fldName", _fldname);
 BA.debugLineNum = 231;BA.debugLine="Dim fldType As String";
Debug.JustUpdateDeviceLine();
_fldtype = RemoteObject.createImmutable("");Debug.locals.put("fldType", _fldtype);
 BA.debugLineNum = 232;BA.debugLine="Dim fldTot As Int";
Debug.JustUpdateDeviceLine();
_fldtot = RemoteObject.createImmutable(0);Debug.locals.put("fldTot", _fldtot);
 BA.debugLineNum = 233;BA.debugLine="Dim fldCnt As Int";
Debug.JustUpdateDeviceLine();
_fldcnt = RemoteObject.createImmutable(0);Debug.locals.put("fldCnt", _fldcnt);
 BA.debugLineNum = 234;BA.debugLine="fldTot = tblFields.Size - 1";
Debug.JustUpdateDeviceLine();
_fldtot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("fldTot", _fldtot);
 BA.debugLineNum = 235;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 236;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 237;BA.debugLine="sb.Append(\"(\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("(")));
 BA.debugLineNum = 238;BA.debugLine="For fldCnt = 0 To fldTot";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _fldtot.<Integer>get().intValue();
_fldcnt = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _fldcnt.<Integer>get().intValue() <= limit9) || (step9 < 0 && _fldcnt.<Integer>get().intValue() >= limit9) ;_fldcnt = RemoteObject.createImmutable((int)(0 + _fldcnt.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("fldCnt", _fldcnt);
 BA.debugLineNum = 239;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
Debug.JustUpdateDeviceLine();
_fldname = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_fldcnt)));Debug.locals.put("fldName", _fldname);
 BA.debugLineNum = 240;BA.debugLine="fldType = tblFields.Get(fldName)";
Debug.JustUpdateDeviceLine();
_fldtype = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)((_fldname))));Debug.locals.put("fldType", _fldtype);
 BA.debugLineNum = 241;BA.debugLine="If fldCnt > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_fldcnt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 242;BA.debugLine="sb.Append(\", \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 244;BA.debugLine="sb.Append(EscapeField(fldName))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_fldname))));
 BA.debugLineNum = 245;BA.debugLine="sb.Append(\" \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" ")));
 BA.debugLineNum = 246;BA.debugLine="sb.Append(fldType)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fldtype));
 BA.debugLineNum = 247;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
Debug.JustUpdateDeviceLine();
if (_fldname.runMethod(true,"equalsIgnoreCase",(Object)(_pk)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 248;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" PRIMARY KEY")));
 };
 }
}Debug.locals.put("fldCnt", _fldcnt);
;
 BA.debugLineNum = 251;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 253;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
Debug.JustUpdateDeviceLine();
_query = RemoteObject.concat(RemoteObject.createImmutable("CREATE TABLE IF NOT EXISTS "),__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname)),RemoteObject.createImmutable(" "),_sb.runMethod(true,"ToString"));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 254;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 255;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 256;BA.debugLine="m.query = query";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_query);
 BA.debugLineNum = 257;BA.debugLine="m.args = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"args" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 258;BA.debugLine="m.types = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"types" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 259;BA.debugLine="m.command = \"createtable\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("createtable"));
 BA.debugLineNum = 260;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 261;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 262;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 263;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 264;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 265;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
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
public static RemoteObject  _cstr(RemoteObject __ref,RemoteObject _o) throws Exception{
try {
		Debug.PushSubsStack("CStr (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("cstr")) { return __ref.runUserSub(false, "bananoalasql","cstr", __ref, _o);}
Debug.locals.put("o", _o);
 BA.debugLineNum = 104;BA.debugLine="Sub CStr(o As Object) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="Return \"\" & o";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.concat(RemoteObject.createImmutable(""),_o);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Delete (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("delete")) { return __ref.runUserSub(false, "bananoalasql","delete", __ref, _tblname, _primarykey, _primaryvalue);}
RemoteObject _qw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _qry = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("primaryKey", _primarykey);
Debug.locals.put("primaryValue", _primaryvalue);
 BA.debugLineNum = 212;BA.debugLine="Sub Delete(tblName As String, primaryKey As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 213;BA.debugLine="Dim qw As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_qw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_qw = bananoalasql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("qw", _qw);Debug.locals.put("qw", _qw);
 BA.debugLineNum = 214;BA.debugLine="qw.Put(primaryKey, primaryValue)";
Debug.JustUpdateDeviceLine();
_qw.runVoidMethod ("Put",(Object)((_primarykey)),(Object)((_primaryvalue)));
 BA.debugLineNum = 215;BA.debugLine="Dim qry As AlaSQLResultSet = DeleteWhere(tblName,";
Debug.JustUpdateDeviceLine();
_qry = __ref.runClassMethod (b4j.example.bananoalasql.class, "_deletewhere" /*RemoteObject*/ ,(Object)(_tblname),(Object)(_qw),(Object)(bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("="))})))));Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 216;BA.debugLine="Return qry";
Debug.JustUpdateDeviceLine();
if (true) return _qry;
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
public static RemoteObject  _deleteall(RemoteObject __ref,RemoteObject _tblname) throws Exception{
try {
		Debug.PushSubsStack("DeleteAll (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,501);
if (RapidSub.canDelegate("deleteall")) { return __ref.runUserSub(false, "bananoalasql","deleteall", __ref, _tblname);}
RemoteObject _sb = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
 BA.debugLineNum = 501;BA.debugLine="Sub DeleteAll(tblName As String) As AlaSQLResultSe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 502;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" WHERE 1=1")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 503;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 504;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 505;BA.debugLine="m.query = sb";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 506;BA.debugLine="m.args = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"args" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 507;BA.debugLine="m.types = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"types" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 508;BA.debugLine="m.command = \"delete\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("delete"));
 BA.debugLineNum = 509;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 510;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 511;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 512;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 513;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 514;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
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
public static RemoteObject  _deletewhere(RemoteObject __ref,RemoteObject _tblname,RemoteObject _tblwhere,RemoteObject _operators) throws Exception{
try {
		Debug.PushSubsStack("DeleteWhere (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,467);
if (RapidSub.canDelegate("deletewhere")) { return __ref.runUserSub(false, "bananoalasql","deletewhere", __ref, _tblname, _tblwhere, _operators);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _iwhere = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _opr = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
 BA.debugLineNum = 467;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 468;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananoalasql.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 469;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 470;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 471;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 472;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 473;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("DELETE FROM "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" WHERE ")))));
 BA.debugLineNum = 474;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 475;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 476;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 477;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 478;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 480;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 481;BA.debugLine="sb.Append(col)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_col));
 BA.debugLineNum = 482;BA.debugLine="Dim opr As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_opr = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("opr", _opr);Debug.locals.put("opr", _opr);
 BA.debugLineNum = 483;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_opr))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 485;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 486;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 487;BA.debugLine="m.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 488;BA.debugLine="m.args = listOfValues";
Debug.JustUpdateDeviceLine();
_m.setField ("args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 489;BA.debugLine="m.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_m.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 490;BA.debugLine="m.command = \"delete\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("delete"));
 BA.debugLineNum = 491;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 492;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 493;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 494;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 495;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 496;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 497;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("DropTable (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("droptable")) { return __ref.runUserSub(false, "bananoalasql","droptable", __ref, _tblname);}
RemoteObject _query = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
 BA.debugLineNum = 303;BA.debugLine="public Sub DropTable(tblName As String) As AlaSQLR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 305;BA.debugLine="Dim query As String = \"DROP TABLE \" & EscapeField";
Debug.JustUpdateDeviceLine();
_query = RemoteObject.concat(RemoteObject.createImmutable("DROP TABLE "),__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname)));Debug.locals.put("query", _query);Debug.locals.put("query", _query);
 BA.debugLineNum = 306;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 307;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 308;BA.debugLine="m.query = query";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_query);
 BA.debugLineNum = 309;BA.debugLine="m.args = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"args" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 310;BA.debugLine="m.types = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"types" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 311;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 312;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 313;BA.debugLine="m.command = \"droptable\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("droptable"));
 BA.debugLineNum = 314;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 315;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 316;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 317;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
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
public static RemoteObject  _eqoperators(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("EQOperators (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("eqoperators")) { return __ref.runUserSub(false, "bananoalasql","eqoperators", __ref, _sm);}
RemoteObject _nl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 408;BA.debugLine="Sub EQOperators(sm As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 409;BA.debugLine="Dim nl As List";
Debug.JustUpdateDeviceLine();
_nl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("nl", _nl);
 BA.debugLineNum = 410;BA.debugLine="nl.initialize";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Initialize");
 BA.debugLineNum = 411;BA.debugLine="For Each k As String In sm.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = _sm.runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 412;BA.debugLine="nl.Add(\"=\")";
Debug.JustUpdateDeviceLine();
_nl.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("="))));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 414;BA.debugLine="Return nl";
Debug.JustUpdateDeviceLine();
if (true) return _nl;
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
public static RemoteObject  _escapefield(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("EscapeField (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("escapefield")) { return __ref.runUserSub(false, "bananoalasql","escapefield", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 220;BA.debugLine="Private Sub EscapeField(f As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 221;BA.debugLine="Return $\"[${f}]\"$";
Debug.JustUpdateDeviceLine();
if (true) return (RemoteObject.concat(RemoteObject.createImmutable("["),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_f))),RemoteObject.createImmutable("]")));
 BA.debugLineNum = 222;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Execute (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("execute")) { return __ref.runUserSub(false, "bananoalasql","execute", __ref, _strsql);}
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("strSQL", _strsql);
 BA.debugLineNum = 320;BA.debugLine="Sub Execute(strSQL As String) As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 322;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 323;BA.debugLine="m.query = strSQL";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_strsql);
 BA.debugLineNum = 324;BA.debugLine="m.args = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"args" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 325;BA.debugLine="m.types = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"types" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 326;BA.debugLine="m.command = \"execute\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("execute"));
 BA.debugLineNum = 327;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 328;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 329;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 330;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 331;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 332;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 333;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Exists (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,594);
if (RapidSub.canDelegate("exists")) { return __ref.runUserSub(false, "bananoalasql","exists", __ref, _tblname, _primarykey, _primaryvalue);}
RemoteObject _qw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _qry = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("primaryKey", _primarykey);
Debug.locals.put("primaryValue", _primaryvalue);
 BA.debugLineNum = 594;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 595;BA.debugLine="Dim qw As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_qw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_qw = bananoalasql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("qw", _qw);Debug.locals.put("qw", _qw);
 BA.debugLineNum = 596;BA.debugLine="qw.Put(primaryKey, primaryValue)";
Debug.JustUpdateDeviceLine();
_qw.runVoidMethod ("Put",(Object)((_primarykey)),(Object)((_primaryvalue)));
 BA.debugLineNum = 597;BA.debugLine="Dim qry As AlaSQLResultSet = SelectWhere(tblName,";
Debug.JustUpdateDeviceLine();
_qry = __ref.runClassMethod (b4j.example.bananoalasql.class, "_selectwhere" /*RemoteObject*/ ,(Object)(_tblname),(Object)(bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_primarykey)})))),(Object)(_qw),(Object)(bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("="))})))),(Object)(bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_primarykey)})))));Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 598;BA.debugLine="Return qry";
Debug.JustUpdateDeviceLine();
if (true) return _qry;
 BA.debugLineNum = 599;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetMapKeys (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("getmapkeys")) { return __ref.runUserSub(false, "bananoalasql","getmapkeys", __ref, _sourcemap);}
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 181;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 182;BA.debugLine="Dim listOfValues As List";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 183;BA.debugLine="listOfValues.Initialize";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 184;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 185;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 186;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 187;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 188;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_value = BA.ObjectToString(_sourcemap.runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 189;BA.debugLine="listOfValues.Add(value)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Add",(Object)((_value)));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 191;BA.debugLine="Return listOfValues";
Debug.JustUpdateDeviceLine();
if (true) return _listofvalues;
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
public static RemoteObject  _getmaptypes(RemoteObject __ref,RemoteObject _sourcemap) throws Exception{
try {
		Debug.PushSubsStack("GetMapTypes (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,378);
if (RapidSub.canDelegate("getmaptypes")) { return __ref.runUserSub(false, "bananoalasql","getmaptypes", __ref, _sourcemap);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _coltype = RemoteObject.createImmutable("");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 378;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 379;BA.debugLine="Dim listOfTypes As List";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 380;BA.debugLine="listOfTypes.Initialize";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Initialize");
 BA.debugLineNum = 381;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 382;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 383;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 384;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 385;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_sourcemap.runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 386;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
Debug.JustUpdateDeviceLine();
_coltype = BA.ObjectToString(__ref.getField(false,"_rectype" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_col)),(Object)((RemoteObject.createImmutable("STRING")))));Debug.locals.put("colType", _coltype);Debug.locals.put("colType", _coltype);
 BA.debugLineNum = 387;BA.debugLine="Select Case colType";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_coltype,BA.ObjectToString("VARCHAR(20)"),BA.ObjectToString("VARCHAR(10)"),BA.ObjectToString("VARCHAR(30)"),BA.ObjectToString("VARCHAR(40)"),BA.ObjectToString("VARCHAR(50)"),BA.ObjectToString("VARCHAR(100)"),BA.ObjectToString("VARCHAR(255)"),BA.ObjectToString("STRING"),BA.ObjectToString("VARCHAR"),BA.ObjectToString("TEXT"),BA.ObjectToString("DATE"),BA.ObjectToString("DATETIME"),BA.ObjectToString("NVARCHAR"),BA.ObjectToString("INTEGER"),BA.ObjectToString("INT"),BA.ObjectToString("BOOL"),BA.ObjectToString("BOOLEAN"),BA.ObjectToString("BLOB"),BA.ObjectToString("REAL"),BA.ObjectToString("FLOAT"),BA.ObjectToString("DOUBLE"))) {
case 0: 
case 1: 
case 2: 
case 3: {
 BA.debugLineNum = 389;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
case 4: 
case 5: 
case 6: {
 BA.debugLineNum = 391;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
 BA.debugLineNum = 393;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
case 13: 
case 14: 
case 15: 
case 16: {
 BA.debugLineNum = 395;BA.debugLine="listOfTypes.add(\"i\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("i"))));
 break; }
case 17: {
 BA.debugLineNum = 397;BA.debugLine="listOfTypes.add(\"b\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("b"))));
 break; }
case 18: 
case 19: 
case 20: {
 BA.debugLineNum = 399;BA.debugLine="listOfTypes.add(\"d\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("d"))));
 break; }
default: {
 BA.debugLineNum = 401;BA.debugLine="listOfTypes.add(\"s\")";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("Add",(Object)((RemoteObject.createImmutable("s"))));
 break; }
}
;
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 404;BA.debugLine="Return listOfTypes";
Debug.JustUpdateDeviceLine();
if (true) return _listoftypes;
 BA.debugLineNum = 405;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetMapValues (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("getmapvalues")) { return __ref.runUserSub(false, "bananoalasql","getmapvalues", __ref, _sourcemap);}
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _value = RemoteObject.createImmutable("");
Debug.locals.put("sourceMap", _sourcemap);
 BA.debugLineNum = 150;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 151;BA.debugLine="Dim listOfValues As List";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 152;BA.debugLine="listOfValues.Initialize";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Initialize");
 BA.debugLineNum = 153;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 154;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 155;BA.debugLine="iTot = sourceMap.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_sourcemap.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 156;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step6 = 1;
final int limit6 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step6 > 0 && _icnt.<Integer>get().intValue() <= limit6) || (step6 < 0 && _icnt.<Integer>get().intValue() >= limit6) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step6))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 157;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
Debug.JustUpdateDeviceLine();
_value = BA.ObjectToString(_sourcemap.runMethod(false,"GetValueAt",(Object)(_icnt)));Debug.locals.put("value", _value);Debug.locals.put("value", _value);
 BA.debugLineNum = 158;BA.debugLine="listOfValues.Add(value)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("Add",(Object)((_value)));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 160;BA.debugLine="Return listOfValues";
Debug.JustUpdateDeviceLine();
if (true) return _listofvalues;
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
public static RemoteObject  _getmax(RemoteObject __ref,RemoteObject _tblname,RemoteObject _fldname) throws Exception{
try {
		Debug.PushSubsStack("GetMax (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("getmax")) { return __ref.runUserSub(false, "bananoalasql","getmax", __ref, _tblname, _fldname);}
RemoteObject _sb = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("fldName", _fldname);
 BA.debugLineNum = 286;BA.debugLine="Sub GetMax(tblName As String, fldName As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 287;BA.debugLine="Dim sb As String = $\"SELECT MAX(${fldName}) As ${";
Debug.JustUpdateDeviceLine();
_sb = (RemoteObject.concat(RemoteObject.createImmutable("SELECT MAX("),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fldname))),RemoteObject.createImmutable(") As "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_fldname))),RemoteObject.createImmutable(" FROM "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable("")));Debug.locals.put("sb", _sb);Debug.locals.put("sb", _sb);
 BA.debugLineNum = 288;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 289;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 290;BA.debugLine="m.query = sb";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_sb);
 BA.debugLineNum = 291;BA.debugLine="m.args = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"args" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 292;BA.debugLine="m.types = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"types" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 293;BA.debugLine="m.command = \"getmax\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("getmax"));
 BA.debugLineNum = 294;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 295;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 296;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 297;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 298;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 299;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 300;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("GetNextID (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("getnextid")) { return __ref.runUserSub(false, "bananoalasql","getnextid", __ref, _fld, _rsl);}
RemoteObject _nextid = RemoteObject.createImmutable(0);
RemoteObject _strid = RemoteObject.createImmutable("");
RemoteObject _nr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ni = RemoteObject.createImmutable("");
Debug.locals.put("fld", _fld);
Debug.locals.put("rsl", _rsl);
 BA.debugLineNum = 86;BA.debugLine="Sub GetNextID(fld As String, rsl As List) As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Dim nextid As Int";
Debug.JustUpdateDeviceLine();
_nextid = RemoteObject.createImmutable(0);Debug.locals.put("nextid", _nextid);
 BA.debugLineNum = 88;BA.debugLine="Dim strid As String";
Debug.JustUpdateDeviceLine();
_strid = RemoteObject.createImmutable("");Debug.locals.put("strid", _strid);
 BA.debugLineNum = 90;BA.debugLine="If rsl.Size = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_rsl.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 91;BA.debugLine="nextid = 0";
Debug.JustUpdateDeviceLine();
_nextid = BA.numberCast(int.class, 0);Debug.locals.put("nextid", _nextid);
 }else {
 BA.debugLineNum = 93;BA.debugLine="Dim nr As Map = rsl.Get(0)";
Debug.JustUpdateDeviceLine();
_nr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nr.setObject(_rsl.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("nr", _nr);
 BA.debugLineNum = 94;BA.debugLine="Dim ni As String = nr.Getdefault(fld,\"0\")";
Debug.JustUpdateDeviceLine();
_ni = BA.ObjectToString(_nr.runMethod(false,"GetDefault",(Object)((_fld)),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("ni", _ni);Debug.locals.put("ni", _ni);
 BA.debugLineNum = 95;BA.debugLine="nextid = BANano.parseInt(ni)";
Debug.JustUpdateDeviceLine();
_nextid = __ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_ni)));Debug.locals.put("nextid", _nextid);
 };
 BA.debugLineNum = 97;BA.debugLine="nextid = nextid + 1";
Debug.JustUpdateDeviceLine();
_nextid = RemoteObject.solve(new RemoteObject[] {_nextid,RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("nextid", _nextid);
 BA.debugLineNum = 98;BA.debugLine="strid = CStr(nextid)";
Debug.JustUpdateDeviceLine();
_strid = __ref.runClassMethod (b4j.example.bananoalasql.class, "_cstr" /*RemoteObject*/ ,(Object)((_nextid)));Debug.locals.put("strid", _strid);
 BA.debugLineNum = 99;BA.debugLine="Return strid";
Debug.JustUpdateDeviceLine();
if (true) return _strid;
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba) throws Exception{
try {
		Debug.PushSubsStack("Initialize (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "bananoalasql","initialize", __ref, _ba);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize() As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="recType.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 22;BA.debugLine="Schema.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Insert (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,336);
if (RapidSub.canDelegate("insert")) { return __ref.runUserSub(false, "bananoalasql","insert", __ref, _tblname, _tblfields);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _values = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _icnt = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblFields", _tblfields);
 BA.debugLineNum = 336;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 337;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 338;BA.debugLine="Dim columns As StringBuilder";
Debug.JustUpdateDeviceLine();
_columns = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("columns", _columns);
 BA.debugLineNum = 339;BA.debugLine="Dim values As StringBuilder";
Debug.JustUpdateDeviceLine();
_values = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("values", _values);
 BA.debugLineNum = 340;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 341;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 342;BA.debugLine="Dim iCnt As Int";
Debug.JustUpdateDeviceLine();
_icnt = RemoteObject.createImmutable(0);Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 343;BA.debugLine="Dim iTot As Int";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.createImmutable(0);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 344;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 345;BA.debugLine="columns.Initialize";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Initialize");
 BA.debugLineNum = 346;BA.debugLine="values.Initialize";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Initialize");
 BA.debugLineNum = 347;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("INSERT INTO "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" (")))));
 BA.debugLineNum = 348;BA.debugLine="iTot = tblFields.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 349;BA.debugLine="For iCnt = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = _itot.<Integer>get().intValue();
_icnt = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _icnt.<Integer>get().intValue() <= limit13) || (step13 < 0 && _icnt.<Integer>get().intValue() >= limit13) ;_icnt = RemoteObject.createImmutable((int)(0 + _icnt.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("iCnt", _icnt);
 BA.debugLineNum = 350;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_icnt)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 351;BA.debugLine="If iCnt > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_icnt,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 352;BA.debugLine="columns.Append(\", \")";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 BA.debugLineNum = 353;BA.debugLine="values.Append(\", \")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(", ")));
 };
 BA.debugLineNum = 355;BA.debugLine="columns.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_columns.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 356;BA.debugLine="values.Append(\"?\")";
Debug.JustUpdateDeviceLine();
_values.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("?")));
 }
}Debug.locals.put("iCnt", _icnt);
;
 BA.debugLineNum = 358;BA.debugLine="sb.Append(columns.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_columns.runMethod(true,"ToString")));
 BA.debugLineNum = 359;BA.debugLine="sb.Append(\") VALUES (\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(") VALUES (")));
 BA.debugLineNum = 360;BA.debugLine="sb.Append(values.ToString)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_values.runMethod(true,"ToString")));
 BA.debugLineNum = 361;BA.debugLine="sb.Append(\")\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(")")));
 BA.debugLineNum = 362;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 363;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 364;BA.debugLine="m.query = sb.ToString";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 365;BA.debugLine="m.args = listOfValues";
Debug.JustUpdateDeviceLine();
_m.setField ("args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 366;BA.debugLine="m.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_m.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 367;BA.debugLine="m.command = \"insert\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("insert"));
 BA.debugLineNum = 368;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 369;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 370;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 371;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 372;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 373;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _insertlist(RemoteObject __ref,RemoteObject _tblname) throws Exception{
try {
		Debug.PushSubsStack("InsertList (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("insertlist")) { return __ref.runUserSub(false, "bananoalasql","insertlist", __ref, _tblname);}
RemoteObject _ssql = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblname", _tblname);
 BA.debugLineNum = 269;BA.debugLine="Sub InsertList(tblname As String) As AlaSQLResultS";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 270;BA.debugLine="Dim sSQL As String = $\"SELECT * INTO [${tblname}]";
Debug.JustUpdateDeviceLine();
_ssql = (RemoteObject.concat(RemoteObject.createImmutable("SELECT * INTO ["),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_tblname))),RemoteObject.createImmutable("] FROM ?")));Debug.locals.put("sSQL", _ssql);Debug.locals.put("sSQL", _ssql);
 BA.debugLineNum = 271;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 272;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 273;BA.debugLine="m.query = sSQL";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_ssql);
 BA.debugLineNum = 274;BA.debugLine="m.args = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"args" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 275;BA.debugLine="m.types = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"types" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 276;BA.debugLine="m.command = \"insert\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("insert"));
 BA.debugLineNum = 277;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 278;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 279;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 280;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 281;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 282;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
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
public static RemoteObject  _join(RemoteObject __ref,RemoteObject _delimiter,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("Join (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,651);
if (RapidSub.canDelegate("join")) { return __ref.runUserSub(false, "bananoalasql","join", __ref, _delimiter, _lst);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _fld = RemoteObject.createImmutable("");
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 651;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 652;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 653;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 654;BA.debugLine="Dim fld As String";
Debug.JustUpdateDeviceLine();
_fld = RemoteObject.createImmutable("");Debug.locals.put("fld", _fld);
 BA.debugLineNum = 655;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 656;BA.debugLine="fld = lst.Get(0)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 657;BA.debugLine="sb.Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fld));
 BA.debugLineNum = 658;BA.debugLine="For i = 1 To lst.size - 1";
Debug.JustUpdateDeviceLine();
{
final int step7 = 1;
final int limit7 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step7 > 0 && _i.<Integer>get().intValue() <= limit7) || (step7 < 0 && _i.<Integer>get().intValue() >= limit7) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step7))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 659;BA.debugLine="Dim fld As String = lst.Get(i)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("fld", _fld);Debug.locals.put("fld", _fld);
 BA.debugLineNum = 660;BA.debugLine="sb.Append(delimiter).Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_delimiter)).runVoidMethod ("Append",(Object)(_fld));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 662;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 663;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("JoinFields (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("joinfields")) { return __ref.runUserSub(false, "bananoalasql","joinfields", __ref, _delimiter, _lst);}
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _fld = RemoteObject.createImmutable("");
Debug.locals.put("delimiter", _delimiter);
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 164;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 166;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 167;BA.debugLine="Dim fld As String";
Debug.JustUpdateDeviceLine();
_fld = RemoteObject.createImmutable("");Debug.locals.put("fld", _fld);
 BA.debugLineNum = 168;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 169;BA.debugLine="fld = lst.Get(0)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 170;BA.debugLine="fld = EscapeField(fld)";
Debug.JustUpdateDeviceLine();
_fld = __ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_fld));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 171;BA.debugLine="sb.Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_fld));
 BA.debugLineNum = 172;BA.debugLine="For i = 1 To lst.size - 1";
Debug.JustUpdateDeviceLine();
{
final int step8 = 1;
final int limit8 = RemoteObject.solve(new RemoteObject[] {_lst.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1).<Integer>get().intValue();
_i = BA.numberCast(int.class, 1) ;
for (;(step8 > 0 && _i.<Integer>get().intValue() <= limit8) || (step8 < 0 && _i.<Integer>get().intValue() >= limit8) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step8))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 173;BA.debugLine="Dim fld As String = lst.Get(i)";
Debug.JustUpdateDeviceLine();
_fld = BA.ObjectToString(_lst.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("fld", _fld);Debug.locals.put("fld", _fld);
 BA.debugLineNum = 174;BA.debugLine="fld = EscapeField(fld)";
Debug.JustUpdateDeviceLine();
_fld = __ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_fld));Debug.locals.put("fld", _fld);
 BA.debugLineNum = 175;BA.debugLine="sb.Append(delimiter).Append(fld)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(_delimiter)).runVoidMethod ("Append",(Object)(_fld));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 177;BA.debugLine="Return sb.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 178;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Json2List (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,533);
if (RapidSub.canDelegate("json2list")) { return __ref.runUserSub(false, "bananoalasql","json2list", __ref, _strvalue);}
RemoteObject _lst = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _parser = RemoteObject.declareNull("com.ab.banano.BANanoJSONParser");
Debug.locals.put("strValue", _strvalue);
 BA.debugLineNum = 533;BA.debugLine="Sub Json2List(strValue As String) As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 534;BA.debugLine="Dim lst As List";
Debug.JustUpdateDeviceLine();
_lst = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("lst", _lst);
 BA.debugLineNum = 535;BA.debugLine="lst.Initialize";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Initialize");
 BA.debugLineNum = 536;BA.debugLine="lst.clear";
Debug.JustUpdateDeviceLine();
_lst.runVoidMethod ("Clear");
 BA.debugLineNum = 537;BA.debugLine="If strValue.Length = 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_strvalue.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 538;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
 };
 BA.debugLineNum = 540;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 541;BA.debugLine="Dim parser As BANanoJSONParser";
Debug.JustUpdateDeviceLine();
_parser = RemoteObject.createNew ("com.ab.banano.BANanoJSONParser");Debug.locals.put("parser", _parser);
 BA.debugLineNum = 542;BA.debugLine="parser.Initialize(strValue)";
Debug.JustUpdateDeviceLine();
_parser.runVoidMethod ("Initialize",(Object)(_strvalue));
 BA.debugLineNum = 543;BA.debugLine="Return parser.NextArray";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _parser.runMethod(false,"NextArray");
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 545;BA.debugLine="Return lst";
Debug.JustUpdateDeviceLine();
if (true) return _lst;
 };
 BA.debugLineNum = 547;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Json2Map (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("json2map")) { return __ref.runUserSub(false, "bananoalasql","json2map", __ref, _strjson);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONParser");
RemoteObject _map1 = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("strJSON", _strjson);
 BA.debugLineNum = 195;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="Dim json As BANanoJSONParser";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONParser");Debug.locals.put("json", _json);
 BA.debugLineNum = 197;BA.debugLine="Dim Map1 As Map";
Debug.JustUpdateDeviceLine();
_map1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");Debug.locals.put("Map1", _map1);
 BA.debugLineNum = 198;BA.debugLine="Map1.Initialize";
Debug.JustUpdateDeviceLine();
_map1.runVoidMethod ("Initialize");
 BA.debugLineNum = 199;BA.debugLine="Map1.clear";
Debug.JustUpdateDeviceLine();
_map1.runVoidMethod ("Clear");
 BA.debugLineNum = 200;BA.debugLine="Try";
Debug.JustUpdateDeviceLine();
try { BA.debugLineNum = 201;BA.debugLine="If strJSON.length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_strjson.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 202;BA.debugLine="json.Initialize(strJSON)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize",(Object)(_strjson));
 BA.debugLineNum = 203;BA.debugLine="Map1 = json.NextObject";
Debug.JustUpdateDeviceLine();
_map1 = _json.runMethod(false,"NextObject");Debug.locals.put("Map1", _map1);
 };
 BA.debugLineNum = 205;BA.debugLine="Return Map1";
Debug.JustUpdateDeviceLine();
Debug.CheckDeviceExceptions();if (true) return _map1;
 Debug.CheckDeviceExceptions();
} 
       catch (Exception e12) {
			BA.rdebugUtils.runVoidMethod("setLastException",__ref.getField(false, "ba"), e12.toString()); BA.debugLineNum = 207;BA.debugLine="Return Map1";
Debug.JustUpdateDeviceLine();
if (true) return _map1;
 };
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _list2json(RemoteObject __ref,RemoteObject _mp) throws Exception{
try {
		Debug.PushSubsStack("List2Json (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,526);
if (RapidSub.canDelegate("list2json")) { return __ref.runUserSub(false, "bananoalasql","list2json", __ref, _mp);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONGenerator");
Debug.locals.put("mp", _mp);
 BA.debugLineNum = 526;BA.debugLine="Sub List2Json(mp As List) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 527;BA.debugLine="Dim JSON As BANanoJSONGenerator";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 528;BA.debugLine="JSON.Initialize2(mp)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize2",(Object)(_mp));
 BA.debugLineNum = 529;BA.debugLine="Return JSON.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _json.runMethod(true,"ToString");
 BA.debugLineNum = 530;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Map2Json (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,519);
if (RapidSub.canDelegate("map2json")) { return __ref.runUserSub(false, "bananoalasql","map2json", __ref, _mp);}
RemoteObject _json = RemoteObject.declareNull("com.ab.banano.BANanoJSONGenerator");
Debug.locals.put("mp", _mp);
 BA.debugLineNum = 519;BA.debugLine="Sub Map2Json(mp As Map) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 520;BA.debugLine="Dim JSON As BANanoJSONGenerator";
Debug.JustUpdateDeviceLine();
_json = RemoteObject.createNew ("com.ab.banano.BANanoJSONGenerator");Debug.locals.put("JSON", _json);
 BA.debugLineNum = 521;BA.debugLine="JSON.Initialize(mp)";
Debug.JustUpdateDeviceLine();
_json.runVoidMethod ("Initialize",(Object)(_mp));
 BA.debugLineNum = 522;BA.debugLine="Return JSON.ToString";
Debug.JustUpdateDeviceLine();
if (true) return _json.runMethod(true,"ToString");
 BA.debugLineNum = 523;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _read(RemoteObject __ref,RemoteObject _tblname,RemoteObject _primarykey,RemoteObject _primaryvalue) throws Exception{
try {
		Debug.PushSubsStack("Read (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,585);
if (RapidSub.canDelegate("read")) { return __ref.runUserSub(false, "bananoalasql","read", __ref, _tblname, _primarykey, _primaryvalue);}
RemoteObject _qw = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _qry = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("primaryKey", _primarykey);
Debug.locals.put("primaryValue", _primaryvalue);
 BA.debugLineNum = 585;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 586;BA.debugLine="Dim qw As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_qw = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_qw = bananoalasql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("qw", _qw);Debug.locals.put("qw", _qw);
 BA.debugLineNum = 587;BA.debugLine="qw.Put(primaryKey, primaryValue)";
Debug.JustUpdateDeviceLine();
_qw.runVoidMethod ("Put",(Object)((_primarykey)),(Object)((_primaryvalue)));
 BA.debugLineNum = 588;BA.debugLine="Dim qry As AlaSQLResultSet = SelectWhere(tblName,";
Debug.JustUpdateDeviceLine();
_qry = __ref.runClassMethod (b4j.example.bananoalasql.class, "_selectwhere" /*RemoteObject*/ ,(Object)(_tblname),(Object)(bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("*"))})))),(Object)(_qw),(Object)(bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(RemoteObject.createImmutable("="))})))),(Object)(bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_primarykey)})))));Debug.locals.put("qry", _qry);Debug.locals.put("qry", _qry);
 BA.debugLineNum = 589;BA.debugLine="Return qry";
Debug.JustUpdateDeviceLine();
if (true) return _qry;
 BA.debugLineNum = 590;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ResetTypes (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("resettypes")) { return __ref.runUserSub(false, "bananoalasql","resettypes", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Sub ResetTypes As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="recType.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_rectype" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 83;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 84;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SchemaAddBlob (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("schemaaddblob")) { return __ref.runUserSub(false, "bananoalasql","schemaaddblob", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 60;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 62;BA.debugLine="Schema.Put(b, DB_BLOB)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_blob" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
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
public static RemoteObject  _schemaaddboolean(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddBoolean (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("schemaaddboolean")) { return __ref.runUserSub(false, "bananoalasql","schemaaddboolean", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 39;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoAlaSQ";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 41;BA.debugLine="Schema.Put(b, DB_BOOL)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_bool" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
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
public static RemoteObject  _schemaadddate(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddDate (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("schemaadddate")) { return __ref.runUserSub(false, "bananoalasql","schemaadddate", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 74;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 76;BA.debugLine="Schema.Put(b, DB_DATE)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_date" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 78;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SchemaAddFloat (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("schemaaddfloat")) { return __ref.runUserSub(false, "bananoalasql","schemaaddfloat", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 53;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 55;BA.debugLine="Schema.Put(b, DB_FLOAT)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_float" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
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
public static RemoteObject  _schemaaddint(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddInt (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("schemaaddint")) { return __ref.runUserSub(false, "bananoalasql","schemaaddint", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 46;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 48;BA.debugLine="Schema.Put(b, DB_INT)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_int" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
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
public static RemoteObject  _schemaaddtext(RemoteObject __ref,RemoteObject _bools) throws Exception{
try {
		Debug.PushSubsStack("SchemaAddText (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("schemaaddtext")) { return __ref.runUserSub(false, "bananoalasql","schemaaddtext", __ref, _bools);}
RemoteObject _b = RemoteObject.createImmutable("");
Debug.locals.put("bools", _bools);
 BA.debugLineNum = 67;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="For Each b As String In bools";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _bools;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("b", _b);
Debug.locals.put("b", _b);
 BA.debugLineNum = 69;BA.debugLine="Schema.Put(b, DB_TEXT)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_b)),(Object)((__ref.getField(true,"_db_text" /*RemoteObject*/ ))));
 }
}Debug.locals.put("b", _b);
;
 BA.debugLineNum = 71;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SchemaClear (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("schemaclear")) { return __ref.runUserSub(false, "bananoalasql","schemaclear", __ref);}
 BA.debugLineNum = 33;BA.debugLine="Sub SchemaClear As BANanoAlaSQL";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="Schema.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_schema" /*RemoteObject*/ ).runVoidMethod ("Clear");
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
public static RemoteObject  _schemacreatetable(RemoteObject __ref,RemoteObject _tblname,RemoteObject _pk) throws Exception{
try {
		Debug.PushSubsStack("SchemaCreateTable (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("schemacreatetable")) { return __ref.runUserSub(false, "bananoalasql","schemacreatetable", __ref, _tblname, _pk);}
Debug.locals.put("tblName", _tblname);
Debug.locals.put("PK", _pk);
 BA.debugLineNum = 224;BA.debugLine="Sub SchemaCreateTable(tblName As String, PK As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 225;BA.debugLine="Return CreateTable(tblName, Schema, PK)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananoalasql.class, "_createtable" /*RemoteObject*/ ,(Object)(_tblname),(Object)(__ref.getField(false,"_schema" /*RemoteObject*/ )),(Object)(_pk));
 BA.debugLineNum = 226;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SelectAll (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,667);
if (RapidSub.canDelegate("selectall")) { return __ref.runUserSub(false, "bananoalasql","selectall", __ref, _tblname, _tblfields, _orderby);}
RemoteObject _fld1 = RemoteObject.createImmutable("");
RemoteObject _selfields = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _stro = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("orderBy", _orderby);
 BA.debugLineNum = 667;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 669;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
Debug.JustUpdateDeviceLine();
_fld1 = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld1", _fld1);Debug.locals.put("fld1", _fld1);
 BA.debugLineNum = 670;BA.debugLine="Dim selFIelds As String = \"\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("");Debug.locals.put("selFIelds", _selfields);Debug.locals.put("selFIelds", _selfields);
 BA.debugLineNum = 671;BA.debugLine="Select Case fld1";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fld1,BA.ObjectToString("*"))) {
case 0: {
 BA.debugLineNum = 673;BA.debugLine="selFIelds = \"*\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("*");Debug.locals.put("selFIelds", _selfields);
 break; }
default: {
 BA.debugLineNum = 675;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
Debug.JustUpdateDeviceLine();
_selfields = __ref.runClassMethod (b4j.example.bananoalasql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_tblfields));Debug.locals.put("selFIelds", _selfields);
 break; }
}
;
 BA.debugLineNum = 677;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 678;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 679;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selfields))),RemoteObject.createImmutable(" FROM "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 680;BA.debugLine="If orderBy <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_orderby)) { 
 BA.debugLineNum = 682;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
Debug.JustUpdateDeviceLine();
_stro = __ref.runClassMethod (b4j.example.bananoalasql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_orderby));Debug.locals.put("stro", _stro);Debug.locals.put("stro", _stro);
 BA.debugLineNum = 683;BA.debugLine="If stro.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_stro.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 684;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" ORDER BY "))).runVoidMethod ("Append",(Object)(_stro));
 };
 };
 BA.debugLineNum = 687;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 688;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 689;BA.debugLine="m.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 690;BA.debugLine="m.args = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"args" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 691;BA.debugLine="m.types = Null";
Debug.JustUpdateDeviceLine();
_m.getField(false,"types" /*RemoteObject*/ ).setObject (bananoalasql.__c.getField(false,"Null"));
 BA.debugLineNum = 692;BA.debugLine="m.command = \"select\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("select"));
 BA.debugLineNum = 693;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 694;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 695;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 696;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 697;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 698;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 699;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SelectWhere (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,602);
if (RapidSub.canDelegate("selectwhere")) { return __ref.runUserSub(false, "bananoalasql","selectwhere", __ref, _tblname, _tblfields, _tblwhere, _operators, _orderby);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _listofvalues = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _fld1 = RemoteObject.createImmutable("");
RemoteObject _selfields = RemoteObject.createImmutable("");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _iwhere = RemoteObject.createImmutable(0);
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _opr = RemoteObject.createImmutable("");
RemoteObject _stro = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
Debug.locals.put("orderBy", _orderby);
 BA.debugLineNum = 602;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 603;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananoalasql.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 604;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 605;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 607;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
Debug.JustUpdateDeviceLine();
_fld1 = BA.ObjectToString(_tblfields.runMethod(false,"Get",(Object)(BA.numberCast(int.class, 0))));Debug.locals.put("fld1", _fld1);Debug.locals.put("fld1", _fld1);
 BA.debugLineNum = 608;BA.debugLine="Dim selFIelds As String = \"\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("");Debug.locals.put("selFIelds", _selfields);Debug.locals.put("selFIelds", _selfields);
 BA.debugLineNum = 609;BA.debugLine="Select Case fld1";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_fld1,BA.ObjectToString("*"))) {
case 0: {
 BA.debugLineNum = 611;BA.debugLine="selFIelds = \"*\"";
Debug.JustUpdateDeviceLine();
_selfields = BA.ObjectToString("*");Debug.locals.put("selFIelds", _selfields);
 break; }
default: {
 BA.debugLineNum = 613;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
Debug.JustUpdateDeviceLine();
_selfields = __ref.runClassMethod (b4j.example.bananoalasql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_tblfields));Debug.locals.put("selFIelds", _selfields);
 break; }
}
;
 BA.debugLineNum = 615;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 616;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 617;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("SELECT "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_selfields))),RemoteObject.createImmutable(" FROM "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" WHERE ")))));
 BA.debugLineNum = 618;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 619;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 620;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step17 = 1;
final int limit17 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step17 > 0 && _i.<Integer>get().intValue() <= limit17) || (step17 < 0 && _i.<Integer>get().intValue() >= limit17) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step17))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 621;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 622;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 624;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 625;BA.debugLine="sb.Append(col)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_col));
 BA.debugLineNum = 626;BA.debugLine="Dim opr As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_opr = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("opr", _opr);Debug.locals.put("opr", _opr);
 BA.debugLineNum = 627;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_opr))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 629;BA.debugLine="If orderBy <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_orderby)) { 
 BA.debugLineNum = 631;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
Debug.JustUpdateDeviceLine();
_stro = __ref.runClassMethod (b4j.example.bananoalasql.class, "_joinfields" /*RemoteObject*/ ,(Object)(BA.ObjectToString(",")),(Object)(_orderby));Debug.locals.put("stro", _stro);Debug.locals.put("stro", _stro);
 BA.debugLineNum = 632;BA.debugLine="If stro.Length > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_stro.runMethod(true,"length"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 633;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)(RemoteObject.createImmutable(" ORDER BY "))).runVoidMethod ("Append",(Object)(_stro));
 };
 };
 BA.debugLineNum = 636;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 637;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 638;BA.debugLine="m.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 639;BA.debugLine="m.args = listOfValues";
Debug.JustUpdateDeviceLine();
_m.setField ("args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 640;BA.debugLine="m.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_m.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 641;BA.debugLine="m.command = \"select\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("select"));
 BA.debugLineNum = 642;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 643;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 644;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 645;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 646;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 647;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 648;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Update (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("update")) { return __ref.runUserSub(false, "bananoalasql","update", __ref, _tblname, _prikey, _privalue, _tblfields);}
RemoteObject _tblwhere = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("priKey", _prikey);
Debug.locals.put("priValue", _privalue);
Debug.locals.put("tblfields", _tblfields);
 BA.debugLineNum = 26;BA.debugLine="Sub Update(tblName As String, priKey As String, pr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="Dim tblWhere As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_tblwhere = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tblwhere = bananoalasql.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("tblWhere", _tblwhere);Debug.locals.put("tblWhere", _tblwhere);
 BA.debugLineNum = 28;BA.debugLine="tblWhere.Put(priKey, priValue)";
Debug.JustUpdateDeviceLine();
_tblwhere.runVoidMethod ("Put",(Object)((_prikey)),(Object)((_privalue)));
 BA.debugLineNum = 29;BA.debugLine="Return UpdateWhere(tblName, tblfields, tblWhere,";
Debug.JustUpdateDeviceLine();
if (true) return __ref.runClassMethod (b4j.example.bananoalasql.class, "_updatewhere" /*RemoteObject*/ ,(Object)(_tblname),(Object)(_tblfields),(Object)(_tblwhere),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), bananoalasql.__c.getField(false,"Null")));
 BA.debugLineNum = 30;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("UpdateAll (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,551);
if (RapidSub.canDelegate("updateall")) { return __ref.runUserSub(false, "bananoalasql","updateall", __ref, _tblname, _tblfields, _operators);}
RemoteObject _listoftypes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _i = RemoteObject.createImmutable(0);
RemoteObject _itot = RemoteObject.createImmutable(0);
RemoteObject _oper = RemoteObject.createImmutable("");
RemoteObject _col = RemoteObject.createImmutable("");
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblFields", _tblfields);
Debug.locals.put("operators", _operators);
 BA.debugLineNum = 551;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 552;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananoalasql.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 553;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 554;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
Debug.JustUpdateDeviceLine();
_args = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_args = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("args", _args);Debug.locals.put("args", _args);
 BA.debugLineNum = 555;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 556;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 557;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" SET ")))));
 BA.debugLineNum = 558;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 559;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 560;BA.debugLine="For i = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step9 = 1;
final int limit9 = _itot.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step9 > 0 && _i.<Integer>get().intValue() <= limit9) || (step9 < 0 && _i.<Integer>get().intValue() >= limit9) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step9))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 561;BA.debugLine="Dim oper As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_oper = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("oper", _oper);Debug.locals.put("oper", _oper);
 BA.debugLineNum = 562;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 563;BA.debugLine="sb.Append(col)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(_col));
 BA.debugLineNum = 564;BA.debugLine="If i <> iTot Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, _itot))) { 
 BA.debugLineNum = 565;BA.debugLine="sb.Append(\" = ?,\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" = ?,")));
 }else {
 BA.debugLineNum = 567;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_oper))),RemoteObject.createImmutable(" ?")))));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 570;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 571;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 572;BA.debugLine="m.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 573;BA.debugLine="m.args = args";
Debug.JustUpdateDeviceLine();
_m.setField ("args" /*RemoteObject*/ ,_args);
 BA.debugLineNum = 574;BA.debugLine="m.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_m.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 575;BA.debugLine="m.command = \"update\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("update"));
 BA.debugLineNum = 576;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 577;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 578;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 579;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 580;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 581;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
 BA.debugLineNum = 582;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("UpdateWhere (bananoalasql) ","bananoalasql",7,__ref.getField(false, "ba"),__ref,419);
if (RapidSub.canDelegate("updatewhere")) { return __ref.runUserSub(false, "bananoalasql","updatewhere", __ref, _tblname, _tblfields, _tblwhere, _operators);}
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
RemoteObject _m = RemoteObject.declareNull("b4j.example.bananoalasql._alasqlresultset");
Debug.locals.put("tblName", _tblname);
Debug.locals.put("tblfields", _tblfields);
Debug.locals.put("tblWhere", _tblwhere);
Debug.locals.put("operators", _operators);
 BA.debugLineNum = 419;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 420;BA.debugLine="If operators = Null Then operators = EQOperators(";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_operators)) { 
_operators = __ref.runClassMethod (b4j.example.bananoalasql.class, "_eqoperators" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("operators", _operators);};
 BA.debugLineNum = 421;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
Debug.JustUpdateDeviceLine();
_listoftypes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfTypes", _listoftypes);Debug.locals.put("listOfTypes", _listoftypes);
 BA.debugLineNum = 422;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
Debug.JustUpdateDeviceLine();
_listoftypes1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listoftypes1 = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmaptypes" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfTypes1", _listoftypes1);Debug.locals.put("listOfTypes1", _listoftypes1);
 BA.debugLineNum = 423;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
Debug.JustUpdateDeviceLine();
_listoftypes.runVoidMethod ("AddAll",(Object)(_listoftypes1));
 BA.debugLineNum = 424;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
Debug.JustUpdateDeviceLine();
_listofvalues = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblfields));Debug.locals.put("listOfValues", _listofvalues);Debug.locals.put("listOfValues", _listofvalues);
 BA.debugLineNum = 425;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
Debug.JustUpdateDeviceLine();
_listofvalues1 = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_listofvalues1 = __ref.runClassMethod (b4j.example.bananoalasql.class, "_getmapvalues" /*RemoteObject*/ ,(Object)(_tblwhere));Debug.locals.put("listOfValues1", _listofvalues1);Debug.locals.put("listOfValues1", _listofvalues1);
 BA.debugLineNum = 426;BA.debugLine="listOfValues.AddAll(listOfValues1)";
Debug.JustUpdateDeviceLine();
_listofvalues.runVoidMethod ("AddAll",(Object)(_listofvalues1));
 BA.debugLineNum = 427;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 428;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 429;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("UPDATE "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_tblname))))),RemoteObject.createImmutable(" SET ")))));
 BA.debugLineNum = 430;BA.debugLine="Dim i As Int";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createImmutable(0);Debug.locals.put("i", _i);
 BA.debugLineNum = 431;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
Debug.JustUpdateDeviceLine();
_itot = RemoteObject.solve(new RemoteObject[] {_tblfields.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iTot", _itot);Debug.locals.put("iTot", _itot);
 BA.debugLineNum = 432;BA.debugLine="For i = 0 To iTot";
Debug.JustUpdateDeviceLine();
{
final int step13 = 1;
final int limit13 = _itot.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step13 > 0 && _i.<Integer>get().intValue() <= limit13) || (step13 < 0 && _i.<Integer>get().intValue() >= limit13) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step13))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 433;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblfields.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 434;BA.debugLine="sb.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 435;BA.debugLine="If i <> iTot Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_i,BA.numberCast(double.class, _itot))) { 
 BA.debugLineNum = 436;BA.debugLine="sb.Append(\"= ?,\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("= ?,")));
 }else {
 BA.debugLineNum = 438;BA.debugLine="sb.Append(\"= ?\")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable("= ?")));
 };
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 441;BA.debugLine="sb.Append($\" WHERE \"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.createImmutable(" WHERE "))));
 BA.debugLineNum = 442;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
Debug.JustUpdateDeviceLine();
_iwhere = RemoteObject.solve(new RemoteObject[] {_tblwhere.runMethod(true,"getSize"),RemoteObject.createImmutable(1)}, "-",1, 1);Debug.locals.put("iWhere", _iwhere);Debug.locals.put("iWhere", _iwhere);
 BA.debugLineNum = 443;BA.debugLine="For i = 0 To iWhere";
Debug.JustUpdateDeviceLine();
{
final int step24 = 1;
final int limit24 = _iwhere.<Integer>get().intValue();
_i = BA.numberCast(int.class, 0) ;
for (;(step24 > 0 && _i.<Integer>get().intValue() <= limit24) || (step24 < 0 && _i.<Integer>get().intValue() >= limit24) ;_i = RemoteObject.createImmutable((int)(0 + _i.<Integer>get().intValue() + step24))  ) {
Debug.locals.put("i", _i);
 BA.debugLineNum = 444;BA.debugLine="If i > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_i,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 445;BA.debugLine="sb.Append(\" AND \")";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(RemoteObject.createImmutable(" AND ")));
 };
 BA.debugLineNum = 447;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
Debug.JustUpdateDeviceLine();
_col = BA.ObjectToString(_tblwhere.runMethod(false,"GetKeyAt",(Object)(_i)));Debug.locals.put("col", _col);Debug.locals.put("col", _col);
 BA.debugLineNum = 448;BA.debugLine="sb.Append(EscapeField(col))";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.bananoalasql.class, "_escapefield" /*RemoteObject*/ ,(Object)(_col))));
 BA.debugLineNum = 449;BA.debugLine="Dim opr As String = operators.Get(i)";
Debug.JustUpdateDeviceLine();
_opr = BA.ObjectToString(_operators.runMethod(false,"Get",(Object)(_i)));Debug.locals.put("opr", _opr);Debug.locals.put("opr", _opr);
 BA.debugLineNum = 450;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable(" "),bananoalasql.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_opr))),RemoteObject.createImmutable(" ?")))));
 }
}Debug.locals.put("i", _i);
;
 BA.debugLineNum = 452;BA.debugLine="Dim m As AlaSQLResultSet";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("b4j.example.bananoalasql._alasqlresultset");Debug.locals.put("m", _m);
 BA.debugLineNum = 453;BA.debugLine="m.Initialize";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Initialize");
 BA.debugLineNum = 454;BA.debugLine="m.query = sb.tostring";
Debug.JustUpdateDeviceLine();
_m.setField ("query" /*RemoteObject*/ ,_sb.runMethod(true,"ToString"));
 BA.debugLineNum = 455;BA.debugLine="m.args = listOfValues";
Debug.JustUpdateDeviceLine();
_m.setField ("args" /*RemoteObject*/ ,_listofvalues);
 BA.debugLineNum = 456;BA.debugLine="m.types = listOfTypes";
Debug.JustUpdateDeviceLine();
_m.setField ("types" /*RemoteObject*/ ,_listoftypes);
 BA.debugLineNum = 457;BA.debugLine="m.command = \"update\"";
Debug.JustUpdateDeviceLine();
_m.setField ("command" /*RemoteObject*/ ,BA.ObjectToString("update"));
 BA.debugLineNum = 458;BA.debugLine="m.response = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("response" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 459;BA.debugLine="m.error = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("error" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 460;BA.debugLine="m.result = Array()";
Debug.JustUpdateDeviceLine();
_m.setField ("result" /*RemoteObject*/ ,bananoalasql.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));
 BA.debugLineNum = 461;BA.debugLine="m.json = \"\"";
Debug.JustUpdateDeviceLine();
_m.setField ("json" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 462;BA.debugLine="m.affectedRows = 0";
Debug.JustUpdateDeviceLine();
_m.setField ("affectedRows" /*RemoteObject*/ ,BA.numberCast(long.class, 0));
 BA.debugLineNum = 463;BA.debugLine="Return m";
Debug.JustUpdateDeviceLine();
if (true) return _m;
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
}