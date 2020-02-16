package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananoalasql extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.bananoalasql", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananoalasql.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _alasqlresultset{
public boolean IsInitialized;
public String response;
public anywheresoftware.b4a.objects.collections.List result;
public String command;
public anywheresoftware.b4a.objects.collections.List types;
public anywheresoftware.b4a.objects.collections.List args;
public String query;
public String json;
public String error;
public long affectedRows;
public void Initialize() {
IsInitialized = true;
response = "";
result = new anywheresoftware.b4a.objects.collections.List();
command = "";
types = new anywheresoftware.b4a.objects.collections.List();
args = new anywheresoftware.b4a.objects.collections.List();
query = "";
json = "";
error = "";
affectedRows = 0L;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public String _db_bool = "";
public String _db_int = "";
public String _db_string = "";
public String _db_real = "";
public String _db_date = "";
public String _db_blob = "";
public String _db_float = "";
public String _db_integer = "";
public String _db_text = "";
public anywheresoftware.b4a.objects.collections.Map _rectype = null;
public com.ab.banano.BANano _banano = null;
public anywheresoftware.b4a.objects.collections.Map _schema = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.bananoalasql  _addblobs(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "addblobs", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "addblobs", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=2555904;
 //BA.debugLineNum = 2555904;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoAlaSQL";
RDebugUtils.currentLine=2555905;
 //BA.debugLineNum = 2555905;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=2555906;
 //BA.debugLineNum = 2555906;BA.debugLine="recType.Put(strfld,\"BLOB\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("BLOB"));
 }
};
RDebugUtils.currentLine=2555908;
 //BA.debugLineNum = 2555908;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=2555909;
 //BA.debugLineNum = 2555909;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _addbooleans(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "addbooleans", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "addbooleans", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=2490368;
 //BA.debugLineNum = 2490368;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoAlaSQ";
RDebugUtils.currentLine=2490369;
 //BA.debugLineNum = 2490369;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=2490370;
 //BA.debugLineNum = 2490370;BA.debugLine="recType.Put(strfld,\"BOOL\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("BOOL"));
 }
};
RDebugUtils.currentLine=2490372;
 //BA.debugLineNum = 2490372;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=2490373;
 //BA.debugLineNum = 2490373;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _adddoubles(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "adddoubles", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "adddoubles", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=2424832;
 //BA.debugLineNum = 2424832;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoAlaSQL";
RDebugUtils.currentLine=2424833;
 //BA.debugLineNum = 2424833;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=2424834;
 //BA.debugLineNum = 2424834;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
RDebugUtils.currentLine=2424836;
 //BA.debugLineNum = 2424836;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=2424837;
 //BA.debugLineNum = 2424837;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _addintegers(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "addintegers", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "addintegers", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=2359296;
 //BA.debugLineNum = 2359296;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoAlaSQ";
RDebugUtils.currentLine=2359297;
 //BA.debugLineNum = 2359297;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=2359298;
 //BA.debugLineNum = 2359298;BA.debugLine="recType.Put(strfld,\"INT\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("INT"));
 }
};
RDebugUtils.currentLine=2359300;
 //BA.debugLineNum = 2359300;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=2359301;
 //BA.debugLineNum = 2359301;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _addstrings(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "addstrings", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "addstrings", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=2293760;
 //BA.debugLineNum = 2293760;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoAlaSQL";
RDebugUtils.currentLine=2293761;
 //BA.debugLineNum = 2293761;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=2293762;
 //BA.debugLineNum = 2293762;BA.debugLine="recType.Put(strfld,\"STRING\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("STRING"));
 }
};
RDebugUtils.currentLine=2293764;
 //BA.debugLineNum = 2293764;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=2293765;
 //BA.debugLineNum = 2293765;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.bananoalasql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
RDebugUtils.currentLine=1441792;
 //BA.debugLineNum = 1441792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=1441793;
 //BA.debugLineNum = 1441793;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
RDebugUtils.currentLine=1441794;
 //BA.debugLineNum = 1441794;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
RDebugUtils.currentLine=1441795;
 //BA.debugLineNum = 1441795;BA.debugLine="Public const DB_STRING As String = \"STRING\"";
_db_string = "STRING";
RDebugUtils.currentLine=1441796;
 //BA.debugLineNum = 1441796;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
RDebugUtils.currentLine=1441797;
 //BA.debugLineNum = 1441797;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
RDebugUtils.currentLine=1441798;
 //BA.debugLineNum = 1441798;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
RDebugUtils.currentLine=1441799;
 //BA.debugLineNum = 1441799;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
RDebugUtils.currentLine=1441800;
 //BA.debugLineNum = 1441800;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
_db_integer = "INTEGER";
RDebugUtils.currentLine=1441801;
 //BA.debugLineNum = 1441801;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
_db_text = "TEXT";
RDebugUtils.currentLine=1441802;
 //BA.debugLineNum = 1441802;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1441803;
 //BA.debugLineNum = 1441803;BA.debugLine="Type AlaSQLResultSet(response As String, result A";
;
RDebugUtils.currentLine=1441805;
 //BA.debugLineNum = 1441805;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=1441806;
 //BA.debugLineNum = 1441806;BA.debugLine="Private Schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=1441807;
 //BA.debugLineNum = 1441807;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasql._alasqlresultset  _createtable(b4j.example.bananoalasql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "createtable", new Object[] {_tblname,_tblfields,_pk}));}
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _query = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3080192;
 //BA.debugLineNum = 3080192;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
RDebugUtils.currentLine=3080193;
 //BA.debugLineNum = 3080193;BA.debugLine="Dim fldName As String";
_fldname = "";
RDebugUtils.currentLine=3080194;
 //BA.debugLineNum = 3080194;BA.debugLine="Dim fldType As String";
_fldtype = "";
RDebugUtils.currentLine=3080195;
 //BA.debugLineNum = 3080195;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
RDebugUtils.currentLine=3080196;
 //BA.debugLineNum = 3080196;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
RDebugUtils.currentLine=3080197;
 //BA.debugLineNum = 3080197;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=3080198;
 //BA.debugLineNum = 3080198;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3080199;
 //BA.debugLineNum = 3080199;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3080200;
 //BA.debugLineNum = 3080200;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=3080201;
 //BA.debugLineNum = 3080201;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
RDebugUtils.currentLine=3080202;
 //BA.debugLineNum = 3080202;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
RDebugUtils.currentLine=3080203;
 //BA.debugLineNum = 3080203;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
RDebugUtils.currentLine=3080204;
 //BA.debugLineNum = 3080204;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
RDebugUtils.currentLine=3080205;
 //BA.debugLineNum = 3080205;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
RDebugUtils.currentLine=3080207;
 //BA.debugLineNum = 3080207;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(__ref._escapefield /*String*/ (null,_fldname));
RDebugUtils.currentLine=3080208;
 //BA.debugLineNum = 3080208;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
RDebugUtils.currentLine=3080209;
 //BA.debugLineNum = 3080209;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
RDebugUtils.currentLine=3080210;
 //BA.debugLineNum = 3080210;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
RDebugUtils.currentLine=3080211;
 //BA.debugLineNum = 3080211;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
_sb.Append(" PRIMARY KEY");
 };
 }
};
RDebugUtils.currentLine=3080214;
 //BA.debugLineNum = 3080214;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=3080216;
 //BA.debugLineNum = 3080216;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+__ref._escapefield /*String*/ (null,_tblname)+" "+_sb.ToString();
RDebugUtils.currentLine=3080217;
 //BA.debugLineNum = 3080217;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3080218;
 //BA.debugLineNum = 3080218;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3080219;
 //BA.debugLineNum = 3080219;BA.debugLine="m.query = query";
_m.query /*String*/  = _query;
RDebugUtils.currentLine=3080220;
 //BA.debugLineNum = 3080220;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3080221;
 //BA.debugLineNum = 3080221;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3080222;
 //BA.debugLineNum = 3080222;BA.debugLine="m.command = \"createtable\"";
_m.command /*String*/  = "createtable";
RDebugUtils.currentLine=3080223;
 //BA.debugLineNum = 3080223;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3080224;
 //BA.debugLineNum = 3080224;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3080225;
 //BA.debugLineNum = 3080225;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3080226;
 //BA.debugLineNum = 3080226;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3080227;
 //BA.debugLineNum = 3080227;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3080228;
 //BA.debugLineNum = 3080228;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3080229;
 //BA.debugLineNum = 3080229;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(b4j.example.bananoalasql __ref,String _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "escapefield", true))
	 {return ((String) Debug.delegate(ba, "escapefield", new Object[] {_f}));}
RDebugUtils.currentLine=2949120;
 //BA.debugLineNum = 2949120;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=2949121;
 //BA.debugLineNum = 2949121;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
RDebugUtils.currentLine=2949122;
 //BA.debugLineNum = 2949122;BA.debugLine="End Sub";
return "";
}
public String  _cstr(b4j.example.bananoalasql __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "cstr", true))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=2228224;
 //BA.debugLineNum = 2228224;BA.debugLine="Sub CStr(o As Object) As String";
RDebugUtils.currentLine=2228225;
 //BA.debugLineNum = 2228225;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=2228226;
 //BA.debugLineNum = 2228226;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasql._alasqlresultset  _delete(b4j.example.bananoalasql __ref,String _tblname,String _primarykey,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "delete", new Object[] {_tblname,_primarykey,_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananoalasql._alasqlresultset _qry = null;
RDebugUtils.currentLine=2883584;
 //BA.debugLineNum = 2883584;BA.debugLine="Sub Delete(tblName As String, primaryKey As String";
RDebugUtils.currentLine=2883585;
 //BA.debugLineNum = 2883585;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=2883586;
 //BA.debugLineNum = 2883586;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
RDebugUtils.currentLine=2883587;
 //BA.debugLineNum = 2883587;BA.debugLine="Dim qry As AlaSQLResultSet = DeleteWhere(tblName,";
_qry = __ref._deletewhere /*b4j.example.bananoalasql._alasqlresultset*/ (null,_tblname,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}));
RDebugUtils.currentLine=2883588;
 //BA.debugLineNum = 2883588;BA.debugLine="Return qry";
if (true) return _qry;
RDebugUtils.currentLine=2883589;
 //BA.debugLineNum = 2883589;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _deletewhere(b4j.example.bananoalasql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "deletewhere", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "deletewhere", new Object[] {_tblname,_tblwhere,_operators}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3670016;
 //BA.debugLineNum = 3670016;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
RDebugUtils.currentLine=3670017;
 //BA.debugLineNum = 3670017;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=3670018;
 //BA.debugLineNum = 3670018;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=3670019;
 //BA.debugLineNum = 3670019;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=3670020;
 //BA.debugLineNum = 3670020;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3670021;
 //BA.debugLineNum = 3670021;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3670022;
 //BA.debugLineNum = 3670022;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE "));
RDebugUtils.currentLine=3670023;
 //BA.debugLineNum = 3670023;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=3670024;
 //BA.debugLineNum = 3670024;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=3670025;
 //BA.debugLineNum = 3670025;BA.debugLine="For i = 0 To iWhere";
{
final int step9 = 1;
final int limit9 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=3670026;
 //BA.debugLineNum = 3670026;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=3670027;
 //BA.debugLineNum = 3670027;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=3670029;
 //BA.debugLineNum = 3670029;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=3670030;
 //BA.debugLineNum = 3670030;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
RDebugUtils.currentLine=3670031;
 //BA.debugLineNum = 3670031;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=3670032;
 //BA.debugLineNum = 3670032;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=3670034;
 //BA.debugLineNum = 3670034;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3670035;
 //BA.debugLineNum = 3670035;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3670036;
 //BA.debugLineNum = 3670036;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=3670037;
 //BA.debugLineNum = 3670037;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=3670038;
 //BA.debugLineNum = 3670038;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=3670039;
 //BA.debugLineNum = 3670039;BA.debugLine="m.command = \"delete\"";
_m.command /*String*/  = "delete";
RDebugUtils.currentLine=3670040;
 //BA.debugLineNum = 3670040;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3670041;
 //BA.debugLineNum = 3670041;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3670042;
 //BA.debugLineNum = 3670042;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3670043;
 //BA.debugLineNum = 3670043;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3670044;
 //BA.debugLineNum = 3670044;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3670045;
 //BA.debugLineNum = 3670045;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3670046;
 //BA.debugLineNum = 3670046;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _deleteall(b4j.example.bananoalasql __ref,String _tblname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "deleteall", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "deleteall", new Object[] {_tblname}));}
String _sb = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3735552;
 //BA.debugLineNum = 3735552;BA.debugLine="Sub DeleteAll(tblName As String) As AlaSQLResultSe";
RDebugUtils.currentLine=3735553;
 //BA.debugLineNum = 3735553;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE 1=1");
RDebugUtils.currentLine=3735554;
 //BA.debugLineNum = 3735554;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3735555;
 //BA.debugLineNum = 3735555;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3735556;
 //BA.debugLineNum = 3735556;BA.debugLine="m.query = sb";
_m.query /*String*/  = _sb;
RDebugUtils.currentLine=3735557;
 //BA.debugLineNum = 3735557;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3735558;
 //BA.debugLineNum = 3735558;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3735559;
 //BA.debugLineNum = 3735559;BA.debugLine="m.command = \"delete\"";
_m.command /*String*/  = "delete";
RDebugUtils.currentLine=3735560;
 //BA.debugLineNum = 3735560;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3735561;
 //BA.debugLineNum = 3735561;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3735562;
 //BA.debugLineNum = 3735562;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3735563;
 //BA.debugLineNum = 3735563;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3735564;
 //BA.debugLineNum = 3735564;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3735565;
 //BA.debugLineNum = 3735565;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3735566;
 //BA.debugLineNum = 3735566;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "eqoperators", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "eqoperators", new Object[] {_sm}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
RDebugUtils.currentLine=3538944;
 //BA.debugLineNum = 3538944;BA.debugLine="Sub EQOperators(sm As Map) As List";
RDebugUtils.currentLine=3538945;
 //BA.debugLineNum = 3538945;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3538946;
 //BA.debugLineNum = 3538946;BA.debugLine="nl.initialize";
_nl.Initialize();
RDebugUtils.currentLine=3538947;
 //BA.debugLineNum = 3538947;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=3538948;
 //BA.debugLineNum = 3538948;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
RDebugUtils.currentLine=3538950;
 //BA.debugLineNum = 3538950;BA.debugLine="Return nl";
if (true) return _nl;
RDebugUtils.currentLine=3538951;
 //BA.debugLineNum = 3538951;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "getmaptypes", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmaptypes", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
RDebugUtils.currentLine=3473408;
 //BA.debugLineNum = 3473408;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
RDebugUtils.currentLine=3473409;
 //BA.debugLineNum = 3473409;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3473410;
 //BA.debugLineNum = 3473410;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
RDebugUtils.currentLine=3473411;
 //BA.debugLineNum = 3473411;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=3473412;
 //BA.debugLineNum = 3473412;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=3473413;
 //BA.debugLineNum = 3473413;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=3473414;
 //BA.debugLineNum = 3473414;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=3473415;
 //BA.debugLineNum = 3473415;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
RDebugUtils.currentLine=3473416;
 //BA.debugLineNum = 3473416;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_col),(Object)("STRING")));
RDebugUtils.currentLine=3473417;
 //BA.debugLineNum = 3473417;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR","INTEGER","INT","BOOL","BOOLEAN","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
RDebugUtils.currentLine=3473419;
 //BA.debugLineNum = 3473419;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 4: 
case 5: 
case 6: {
RDebugUtils.currentLine=3473421;
 //BA.debugLineNum = 3473421;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
RDebugUtils.currentLine=3473423;
 //BA.debugLineNum = 3473423;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 13: 
case 14: 
case 15: 
case 16: {
RDebugUtils.currentLine=3473425;
 //BA.debugLineNum = 3473425;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 17: {
RDebugUtils.currentLine=3473427;
 //BA.debugLineNum = 3473427;BA.debugLine="listOfTypes.add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
case 18: 
case 19: 
case 20: {
RDebugUtils.currentLine=3473429;
 //BA.debugLineNum = 3473429;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
default: {
RDebugUtils.currentLine=3473431;
 //BA.debugLineNum = 3473431;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
RDebugUtils.currentLine=3473434;
 //BA.debugLineNum = 3473434;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
RDebugUtils.currentLine=3473435;
 //BA.debugLineNum = 3473435;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "getmapvalues", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapvalues", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
RDebugUtils.currentLine=2621440;
 //BA.debugLineNum = 2621440;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
RDebugUtils.currentLine=2621441;
 //BA.debugLineNum = 2621441;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2621442;
 //BA.debugLineNum = 2621442;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=2621443;
 //BA.debugLineNum = 2621443;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=2621444;
 //BA.debugLineNum = 2621444;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=2621445;
 //BA.debugLineNum = 2621445;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=2621446;
 //BA.debugLineNum = 2621446;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=2621447;
 //BA.debugLineNum = 2621447;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
RDebugUtils.currentLine=2621448;
 //BA.debugLineNum = 2621448;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
RDebugUtils.currentLine=2621450;
 //BA.debugLineNum = 2621450;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=2621451;
 //BA.debugLineNum = 2621451;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _droptable(b4j.example.bananoalasql __ref,String _tblname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "droptable", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "droptable", new Object[] {_tblname}));}
String _query = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3276800;
 //BA.debugLineNum = 3276800;BA.debugLine="public Sub DropTable(tblName As String) As AlaSQLR";
RDebugUtils.currentLine=3276802;
 //BA.debugLineNum = 3276802;BA.debugLine="Dim query As String = \"DROP TABLE \" & EscapeField";
_query = "DROP TABLE "+__ref._escapefield /*String*/ (null,_tblname);
RDebugUtils.currentLine=3276803;
 //BA.debugLineNum = 3276803;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3276804;
 //BA.debugLineNum = 3276804;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3276805;
 //BA.debugLineNum = 3276805;BA.debugLine="m.query = query";
_m.query /*String*/  = _query;
RDebugUtils.currentLine=3276806;
 //BA.debugLineNum = 3276806;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3276807;
 //BA.debugLineNum = 3276807;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3276808;
 //BA.debugLineNum = 3276808;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3276809;
 //BA.debugLineNum = 3276809;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3276810;
 //BA.debugLineNum = 3276810;BA.debugLine="m.command = \"droptable\"";
_m.command /*String*/  = "droptable";
RDebugUtils.currentLine=3276811;
 //BA.debugLineNum = 3276811;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3276812;
 //BA.debugLineNum = 3276812;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3276813;
 //BA.debugLineNum = 3276813;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3276814;
 //BA.debugLineNum = 3276814;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3276815;
 //BA.debugLineNum = 3276815;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _execute(b4j.example.bananoalasql __ref,String _strsql) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "execute", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "execute", new Object[] {_strsql}));}
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3342336;
 //BA.debugLineNum = 3342336;BA.debugLine="Sub Execute(strSQL As String) As AlaSQLResultSet";
RDebugUtils.currentLine=3342337;
 //BA.debugLineNum = 3342337;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3342338;
 //BA.debugLineNum = 3342338;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3342339;
 //BA.debugLineNum = 3342339;BA.debugLine="m.query = strSQL";
_m.query /*String*/  = _strsql;
RDebugUtils.currentLine=3342340;
 //BA.debugLineNum = 3342340;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3342341;
 //BA.debugLineNum = 3342341;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3342342;
 //BA.debugLineNum = 3342342;BA.debugLine="m.command = \"execute\"";
_m.command /*String*/  = "execute";
RDebugUtils.currentLine=3342343;
 //BA.debugLineNum = 3342343;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3342344;
 //BA.debugLineNum = 3342344;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3342345;
 //BA.debugLineNum = 3342345;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3342346;
 //BA.debugLineNum = 3342346;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3342347;
 //BA.debugLineNum = 3342347;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3342348;
 //BA.debugLineNum = 3342348;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3342349;
 //BA.debugLineNum = 3342349;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _exists(b4j.example.bananoalasql __ref,String _tblname,String _primarykey,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "exists", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "exists", new Object[] {_tblname,_primarykey,_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananoalasql._alasqlresultset _qry = null;
RDebugUtils.currentLine=4128768;
 //BA.debugLineNum = 4128768;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
RDebugUtils.currentLine=4128769;
 //BA.debugLineNum = 4128769;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=4128770;
 //BA.debugLineNum = 4128770;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
RDebugUtils.currentLine=4128771;
 //BA.debugLineNum = 4128771;BA.debugLine="Dim qry As AlaSQLResultSet = SelectWhere(tblName,";
_qry = __ref._selectwhere /*b4j.example.bananoalasql._alasqlresultset*/ (null,_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
RDebugUtils.currentLine=4128772;
 //BA.debugLineNum = 4128772;BA.debugLine="Return qry";
if (true) return _qry;
RDebugUtils.currentLine=4128773;
 //BA.debugLineNum = 4128773;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _selectwhere(b4j.example.bananoalasql __ref,String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "selectwhere", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "selectwhere", new Object[] {_tblname,_tblfields,_tblwhere,_operators,_orderby}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
String _stro = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=4194304;
 //BA.debugLineNum = 4194304;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
RDebugUtils.currentLine=4194305;
 //BA.debugLineNum = 4194305;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=4194306;
 //BA.debugLineNum = 4194306;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=4194307;
 //BA.debugLineNum = 4194307;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=4194309;
 //BA.debugLineNum = 4194309;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=4194310;
 //BA.debugLineNum = 4194310;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=4194311;
 //BA.debugLineNum = 4194311;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=4194313;
 //BA.debugLineNum = 4194313;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=4194315;
 //BA.debugLineNum = 4194315;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=4194317;
 //BA.debugLineNum = 4194317;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4194318;
 //BA.debugLineNum = 4194318;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4194319;
 //BA.debugLineNum = 4194319;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE "));
RDebugUtils.currentLine=4194320;
 //BA.debugLineNum = 4194320;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=4194321;
 //BA.debugLineNum = 4194321;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=4194322;
 //BA.debugLineNum = 4194322;BA.debugLine="For i = 0 To iWhere";
{
final int step17 = 1;
final int limit17 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=4194323;
 //BA.debugLineNum = 4194323;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=4194324;
 //BA.debugLineNum = 4194324;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=4194326;
 //BA.debugLineNum = 4194326;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=4194327;
 //BA.debugLineNum = 4194327;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
RDebugUtils.currentLine=4194328;
 //BA.debugLineNum = 4194328;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=4194329;
 //BA.debugLineNum = 4194329;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=4194331;
 //BA.debugLineNum = 4194331;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=4194333;
 //BA.debugLineNum = 4194333;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=4194334;
 //BA.debugLineNum = 4194334;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=4194335;
 //BA.debugLineNum = 4194335;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=4194338;
 //BA.debugLineNum = 4194338;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=4194339;
 //BA.debugLineNum = 4194339;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=4194340;
 //BA.debugLineNum = 4194340;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=4194341;
 //BA.debugLineNum = 4194341;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=4194342;
 //BA.debugLineNum = 4194342;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=4194343;
 //BA.debugLineNum = 4194343;BA.debugLine="m.command = \"select\"";
_m.command /*String*/  = "select";
RDebugUtils.currentLine=4194344;
 //BA.debugLineNum = 4194344;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=4194345;
 //BA.debugLineNum = 4194345;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=4194346;
 //BA.debugLineNum = 4194346;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=4194347;
 //BA.debugLineNum = 4194347;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=4194348;
 //BA.debugLineNum = 4194348;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=4194349;
 //BA.debugLineNum = 4194349;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=4194350;
 //BA.debugLineNum = 4194350;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "getmapkeys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapkeys", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
RDebugUtils.currentLine=2752512;
 //BA.debugLineNum = 2752512;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
RDebugUtils.currentLine=2752513;
 //BA.debugLineNum = 2752513;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=2752514;
 //BA.debugLineNum = 2752514;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=2752515;
 //BA.debugLineNum = 2752515;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=2752516;
 //BA.debugLineNum = 2752516;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=2752517;
 //BA.debugLineNum = 2752517;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=2752518;
 //BA.debugLineNum = 2752518;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=2752519;
 //BA.debugLineNum = 2752519;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
RDebugUtils.currentLine=2752520;
 //BA.debugLineNum = 2752520;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
RDebugUtils.currentLine=2752522;
 //BA.debugLineNum = 2752522;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=2752523;
 //BA.debugLineNum = 2752523;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _getmax(b4j.example.bananoalasql __ref,String _tblname,String _fldname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "getmax", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "getmax", new Object[] {_tblname,_fldname}));}
String _sb = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3211264;
 //BA.debugLineNum = 3211264;BA.debugLine="Sub GetMax(tblName As String, fldName As String) A";
RDebugUtils.currentLine=3211265;
 //BA.debugLineNum = 3211265;BA.debugLine="Dim sb As String = $\"SELECT MAX(${fldName}) As ${";
_sb = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(_fldname))+") As "+__c.SmartStringFormatter("",(Object)(_fldname))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+"");
RDebugUtils.currentLine=3211266;
 //BA.debugLineNum = 3211266;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3211267;
 //BA.debugLineNum = 3211267;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3211268;
 //BA.debugLineNum = 3211268;BA.debugLine="m.query = sb";
_m.query /*String*/  = _sb;
RDebugUtils.currentLine=3211269;
 //BA.debugLineNum = 3211269;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3211270;
 //BA.debugLineNum = 3211270;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3211271;
 //BA.debugLineNum = 3211271;BA.debugLine="m.command = \"getmax\"";
_m.command /*String*/  = "getmax";
RDebugUtils.currentLine=3211272;
 //BA.debugLineNum = 3211272;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3211273;
 //BA.debugLineNum = 3211273;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3211274;
 //BA.debugLineNum = 3211274;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3211275;
 //BA.debugLineNum = 3211275;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3211276;
 //BA.debugLineNum = 3211276;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3211277;
 //BA.debugLineNum = 3211277;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3211278;
 //BA.debugLineNum = 3211278;BA.debugLine="End Sub";
return null;
}
public String  _getnextid(b4j.example.bananoalasql __ref,String _fld,anywheresoftware.b4a.objects.collections.List _rsl) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "getnextid", true))
	 {return ((String) Debug.delegate(ba, "getnextid", new Object[] {_fld,_rsl}));}
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
RDebugUtils.currentLine=2162688;
 //BA.debugLineNum = 2162688;BA.debugLine="Sub GetNextID(fld As String, rsl As List) As Strin";
RDebugUtils.currentLine=2162689;
 //BA.debugLineNum = 2162689;BA.debugLine="Dim nextid As Int";
_nextid = 0;
RDebugUtils.currentLine=2162690;
 //BA.debugLineNum = 2162690;BA.debugLine="Dim strid As String";
_strid = "";
RDebugUtils.currentLine=2162692;
 //BA.debugLineNum = 2162692;BA.debugLine="If rsl.Size = 0 Then";
if (_rsl.getSize()==0) { 
RDebugUtils.currentLine=2162693;
 //BA.debugLineNum = 2162693;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
RDebugUtils.currentLine=2162695;
 //BA.debugLineNum = 2162695;BA.debugLine="Dim nr As Map = rsl.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rsl.Get((int) (0))));
RDebugUtils.currentLine=2162696;
 //BA.debugLineNum = 2162696;BA.debugLine="Dim ni As String = nr.Getdefault(fld,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_fld),(Object)("0")));
RDebugUtils.currentLine=2162697;
 //BA.debugLineNum = 2162697;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = __ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_ni));
 };
RDebugUtils.currentLine=2162699;
 //BA.debugLineNum = 2162699;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
RDebugUtils.currentLine=2162700;
 //BA.debugLineNum = 2162700;BA.debugLine="strid = CStr(nextid)";
_strid = __ref._cstr /*String*/ (null,(Object)(_nextid));
RDebugUtils.currentLine=2162701;
 //BA.debugLineNum = 2162701;BA.debugLine="Return strid";
if (true) return _strid;
RDebugUtils.currentLine=2162702;
 //BA.debugLineNum = 2162702;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasql  _initialize(b4j.example.bananoalasql __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=1507328;
 //BA.debugLineNum = 1507328;BA.debugLine="Public Sub Initialize() As BANanoAlaSQL";
RDebugUtils.currentLine=1507329;
 //BA.debugLineNum = 1507329;BA.debugLine="recType.Initialize";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=1507330;
 //BA.debugLineNum = 1507330;BA.debugLine="Schema.Initialize";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=1507331;
 //BA.debugLineNum = 1507331;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=1507332;
 //BA.debugLineNum = 1507332;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _insert(b4j.example.bananoalasql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "insert", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "insert", new Object[] {_tblname,_tblfields}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3407872;
 //BA.debugLineNum = 3407872;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
RDebugUtils.currentLine=3407873;
 //BA.debugLineNum = 3407873;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3407874;
 //BA.debugLineNum = 3407874;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3407875;
 //BA.debugLineNum = 3407875;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3407876;
 //BA.debugLineNum = 3407876;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=3407877;
 //BA.debugLineNum = 3407877;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=3407878;
 //BA.debugLineNum = 3407878;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=3407879;
 //BA.debugLineNum = 3407879;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=3407880;
 //BA.debugLineNum = 3407880;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3407881;
 //BA.debugLineNum = 3407881;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=3407882;
 //BA.debugLineNum = 3407882;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=3407883;
 //BA.debugLineNum = 3407883;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" ("));
RDebugUtils.currentLine=3407884;
 //BA.debugLineNum = 3407884;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=3407885;
 //BA.debugLineNum = 3407885;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
RDebugUtils.currentLine=3407886;
 //BA.debugLineNum = 3407886;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
RDebugUtils.currentLine=3407887;
 //BA.debugLineNum = 3407887;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
RDebugUtils.currentLine=3407888;
 //BA.debugLineNum = 3407888;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=3407889;
 //BA.debugLineNum = 3407889;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=3407891;
 //BA.debugLineNum = 3407891;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=3407892;
 //BA.debugLineNum = 3407892;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
RDebugUtils.currentLine=3407894;
 //BA.debugLineNum = 3407894;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
RDebugUtils.currentLine=3407895;
 //BA.debugLineNum = 3407895;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
RDebugUtils.currentLine=3407896;
 //BA.debugLineNum = 3407896;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
RDebugUtils.currentLine=3407897;
 //BA.debugLineNum = 3407897;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=3407898;
 //BA.debugLineNum = 3407898;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3407899;
 //BA.debugLineNum = 3407899;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3407900;
 //BA.debugLineNum = 3407900;BA.debugLine="m.query = sb.ToString";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=3407901;
 //BA.debugLineNum = 3407901;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=3407902;
 //BA.debugLineNum = 3407902;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=3407903;
 //BA.debugLineNum = 3407903;BA.debugLine="m.command = \"insert\"";
_m.command /*String*/  = "insert";
RDebugUtils.currentLine=3407904;
 //BA.debugLineNum = 3407904;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3407905;
 //BA.debugLineNum = 3407905;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3407906;
 //BA.debugLineNum = 3407906;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3407907;
 //BA.debugLineNum = 3407907;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3407908;
 //BA.debugLineNum = 3407908;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3407909;
 //BA.debugLineNum = 3407909;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3407910;
 //BA.debugLineNum = 3407910;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _insertlist(b4j.example.bananoalasql __ref,String _tblname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "insertlist", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "insertlist", new Object[] {_tblname}));}
String _ssql = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3145728;
 //BA.debugLineNum = 3145728;BA.debugLine="Sub InsertList(tblname As String) As AlaSQLResultS";
RDebugUtils.currentLine=3145729;
 //BA.debugLineNum = 3145729;BA.debugLine="Dim sSQL As String = $\"SELECT * INTO [${tblname}]";
_ssql = ("SELECT * INTO ["+__c.SmartStringFormatter("",(Object)(_tblname))+"] FROM ?");
RDebugUtils.currentLine=3145730;
 //BA.debugLineNum = 3145730;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3145731;
 //BA.debugLineNum = 3145731;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3145732;
 //BA.debugLineNum = 3145732;BA.debugLine="m.query = sSQL";
_m.query /*String*/  = _ssql;
RDebugUtils.currentLine=3145733;
 //BA.debugLineNum = 3145733;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3145734;
 //BA.debugLineNum = 3145734;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=3145735;
 //BA.debugLineNum = 3145735;BA.debugLine="m.command = \"insert\"";
_m.command /*String*/  = "insert";
RDebugUtils.currentLine=3145736;
 //BA.debugLineNum = 3145736;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3145737;
 //BA.debugLineNum = 3145737;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3145738;
 //BA.debugLineNum = 3145738;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3145739;
 //BA.debugLineNum = 3145739;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3145740;
 //BA.debugLineNum = 3145740;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3145741;
 //BA.debugLineNum = 3145741;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3145742;
 //BA.debugLineNum = 3145742;BA.debugLine="End Sub";
return null;
}
public String  _join(b4j.example.bananoalasql __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "join", true))
	 {return ((String) Debug.delegate(ba, "join", new Object[] {_delimiter,_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=4259840;
 //BA.debugLineNum = 4259840;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
RDebugUtils.currentLine=4259841;
 //BA.debugLineNum = 4259841;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=4259842;
 //BA.debugLineNum = 4259842;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4259843;
 //BA.debugLineNum = 4259843;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=4259844;
 //BA.debugLineNum = 4259844;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4259845;
 //BA.debugLineNum = 4259845;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=4259846;
 //BA.debugLineNum = 4259846;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=4259847;
 //BA.debugLineNum = 4259847;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=4259848;
 //BA.debugLineNum = 4259848;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=4259849;
 //BA.debugLineNum = 4259849;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
RDebugUtils.currentLine=4259851;
 //BA.debugLineNum = 4259851;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=4259852;
 //BA.debugLineNum = 4259852;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(b4j.example.bananoalasql __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "joinfields", true))
	 {return ((String) Debug.delegate(ba, "joinfields", new Object[] {_delimiter,_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=2686976;
 //BA.debugLineNum = 2686976;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
RDebugUtils.currentLine=2686977;
 //BA.debugLineNum = 2686977;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=2686978;
 //BA.debugLineNum = 2686978;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=2686979;
 //BA.debugLineNum = 2686979;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=2686980;
 //BA.debugLineNum = 2686980;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=2686981;
 //BA.debugLineNum = 2686981;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=2686982;
 //BA.debugLineNum = 2686982;BA.debugLine="fld = EscapeField(fld)";
_fld = __ref._escapefield /*String*/ (null,_fld);
RDebugUtils.currentLine=2686983;
 //BA.debugLineNum = 2686983;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=2686984;
 //BA.debugLineNum = 2686984;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=2686985;
 //BA.debugLineNum = 2686985;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=2686986;
 //BA.debugLineNum = 2686986;BA.debugLine="fld = EscapeField(fld)";
_fld = __ref._escapefield /*String*/ (null,_fld);
RDebugUtils.currentLine=2686987;
 //BA.debugLineNum = 2686987;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
RDebugUtils.currentLine=2686989;
 //BA.debugLineNum = 2686989;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=2686990;
 //BA.debugLineNum = 2686990;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _json2list(b4j.example.bananoalasql __ref,String _strvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "json2list", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "json2list", new Object[] {_strvalue}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
RDebugUtils.currentLine=3932160;
 //BA.debugLineNum = 3932160;BA.debugLine="Sub Json2List(strValue As String) As List";
RDebugUtils.currentLine=3932161;
 //BA.debugLineNum = 3932161;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=3932162;
 //BA.debugLineNum = 3932162;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=3932163;
 //BA.debugLineNum = 3932163;BA.debugLine="lst.clear";
_lst.Clear();
RDebugUtils.currentLine=3932164;
 //BA.debugLineNum = 3932164;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
RDebugUtils.currentLine=3932165;
 //BA.debugLineNum = 3932165;BA.debugLine="Return lst";
if (true) return _lst;
 };
RDebugUtils.currentLine=3932167;
 //BA.debugLineNum = 3932167;BA.debugLine="Try";
try {RDebugUtils.currentLine=3932168;
 //BA.debugLineNum = 3932168;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
RDebugUtils.currentLine=3932169;
 //BA.debugLineNum = 3932169;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
RDebugUtils.currentLine=3932170;
 //BA.debugLineNum = 3932170;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=3932172;
 //BA.debugLineNum = 3932172;BA.debugLine="Return lst";
if (true) return _lst;
 };
RDebugUtils.currentLine=3932174;
 //BA.debugLineNum = 3932174;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(b4j.example.bananoalasql __ref,String _strjson) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "json2map", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "json2map", new Object[] {_strjson}));}
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
RDebugUtils.currentLine=2818048;
 //BA.debugLineNum = 2818048;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
RDebugUtils.currentLine=2818049;
 //BA.debugLineNum = 2818049;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
RDebugUtils.currentLine=2818050;
 //BA.debugLineNum = 2818050;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=2818051;
 //BA.debugLineNum = 2818051;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=2818052;
 //BA.debugLineNum = 2818052;BA.debugLine="Map1.clear";
_map1.Clear();
RDebugUtils.currentLine=2818053;
 //BA.debugLineNum = 2818053;BA.debugLine="Try";
try {RDebugUtils.currentLine=2818054;
 //BA.debugLineNum = 2818054;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
RDebugUtils.currentLine=2818055;
 //BA.debugLineNum = 2818055;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
RDebugUtils.currentLine=2818056;
 //BA.debugLineNum = 2818056;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
RDebugUtils.currentLine=2818058;
 //BA.debugLineNum = 2818058;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=2818060;
 //BA.debugLineNum = 2818060;BA.debugLine="Return Map1";
if (true) return _map1;
 };
RDebugUtils.currentLine=2818062;
 //BA.debugLineNum = 2818062;BA.debugLine="End Sub";
return null;
}
public String  _list2json(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "list2json", true))
	 {return ((String) Debug.delegate(ba, "list2json", new Object[] {_mp}));}
com.ab.banano.BANanoJSONGenerator _json = null;
RDebugUtils.currentLine=3866624;
 //BA.debugLineNum = 3866624;BA.debugLine="Sub List2Json(mp As List) As String";
RDebugUtils.currentLine=3866625;
 //BA.debugLineNum = 3866625;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
RDebugUtils.currentLine=3866626;
 //BA.debugLineNum = 3866626;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
RDebugUtils.currentLine=3866627;
 //BA.debugLineNum = 3866627;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
RDebugUtils.currentLine=3866628;
 //BA.debugLineNum = 3866628;BA.debugLine="End Sub";
return "";
}
public String  _map2json(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "map2json", true))
	 {return ((String) Debug.delegate(ba, "map2json", new Object[] {_mp}));}
com.ab.banano.BANanoJSONGenerator _json = null;
RDebugUtils.currentLine=3801088;
 //BA.debugLineNum = 3801088;BA.debugLine="Sub Map2Json(mp As Map) As String";
RDebugUtils.currentLine=3801089;
 //BA.debugLineNum = 3801089;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
RDebugUtils.currentLine=3801090;
 //BA.debugLineNum = 3801090;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
RDebugUtils.currentLine=3801091;
 //BA.debugLineNum = 3801091;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
RDebugUtils.currentLine=3801092;
 //BA.debugLineNum = 3801092;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananoalasql._alasqlresultset  _read(b4j.example.bananoalasql __ref,String _tblname,String _primarykey,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "read", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "read", new Object[] {_tblname,_primarykey,_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananoalasql._alasqlresultset _qry = null;
RDebugUtils.currentLine=4063232;
 //BA.debugLineNum = 4063232;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
RDebugUtils.currentLine=4063233;
 //BA.debugLineNum = 4063233;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=4063234;
 //BA.debugLineNum = 4063234;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
RDebugUtils.currentLine=4063235;
 //BA.debugLineNum = 4063235;BA.debugLine="Dim qry As AlaSQLResultSet = SelectWhere(tblName,";
_qry = __ref._selectwhere /*b4j.example.bananoalasql._alasqlresultset*/ (null,_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
RDebugUtils.currentLine=4063236;
 //BA.debugLineNum = 4063236;BA.debugLine="Return qry";
if (true) return _qry;
RDebugUtils.currentLine=4063237;
 //BA.debugLineNum = 4063237;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _resettypes(b4j.example.bananoalasql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "resettypes", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "resettypes", null));}
RDebugUtils.currentLine=2097152;
 //BA.debugLineNum = 2097152;BA.debugLine="Sub ResetTypes As BANanoAlaSQL";
RDebugUtils.currentLine=2097153;
 //BA.debugLineNum = 2097153;BA.debugLine="recType.Initialize";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=2097154;
 //BA.debugLineNum = 2097154;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=2097155;
 //BA.debugLineNum = 2097155;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _schemaaddblob(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "schemaaddblob", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "schemaaddblob", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=1900544;
 //BA.debugLineNum = 1900544;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoAlaSQL";
RDebugUtils.currentLine=1900545;
 //BA.debugLineNum = 1900545;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=1900546;
 //BA.debugLineNum = 1900546;BA.debugLine="Schema.Put(b, DB_BLOB)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_blob /*String*/ ));
 }
};
RDebugUtils.currentLine=1900548;
 //BA.debugLineNum = 1900548;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=1900549;
 //BA.debugLineNum = 1900549;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _schemaaddboolean(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "schemaaddboolean", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "schemaaddboolean", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=1703936;
 //BA.debugLineNum = 1703936;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoAlaSQ";
RDebugUtils.currentLine=1703937;
 //BA.debugLineNum = 1703937;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=1703938;
 //BA.debugLineNum = 1703938;BA.debugLine="Schema.Put(b, DB_BOOL)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_bool /*String*/ ));
 }
};
RDebugUtils.currentLine=1703940;
 //BA.debugLineNum = 1703940;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=1703941;
 //BA.debugLineNum = 1703941;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _schemaadddate(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "schemaadddate", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "schemaadddate", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=2031616;
 //BA.debugLineNum = 2031616;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoAlaSQL";
RDebugUtils.currentLine=2031617;
 //BA.debugLineNum = 2031617;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=2031618;
 //BA.debugLineNum = 2031618;BA.debugLine="Schema.Put(b, DB_DATE)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_date /*String*/ ));
 }
};
RDebugUtils.currentLine=2031620;
 //BA.debugLineNum = 2031620;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=2031621;
 //BA.debugLineNum = 2031621;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _schemaaddfloat(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "schemaaddfloat", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "schemaaddfloat", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=1835008;
 //BA.debugLineNum = 1835008;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoAlaSQL";
RDebugUtils.currentLine=1835009;
 //BA.debugLineNum = 1835009;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=1835010;
 //BA.debugLineNum = 1835010;BA.debugLine="Schema.Put(b, DB_FLOAT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_float /*String*/ ));
 }
};
RDebugUtils.currentLine=1835012;
 //BA.debugLineNum = 1835012;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=1835013;
 //BA.debugLineNum = 1835013;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _schemaaddint(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "schemaaddint", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "schemaaddint", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=1769472;
 //BA.debugLineNum = 1769472;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoAlaSQL";
RDebugUtils.currentLine=1769473;
 //BA.debugLineNum = 1769473;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=1769474;
 //BA.debugLineNum = 1769474;BA.debugLine="Schema.Put(b, DB_INT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_int /*String*/ ));
 }
};
RDebugUtils.currentLine=1769476;
 //BA.debugLineNum = 1769476;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=1769477;
 //BA.debugLineNum = 1769477;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _schemaaddtext(b4j.example.bananoalasql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "schemaaddtext", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "schemaaddtext", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=1966080;
 //BA.debugLineNum = 1966080;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoAlaSQL";
RDebugUtils.currentLine=1966081;
 //BA.debugLineNum = 1966081;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=1966082;
 //BA.debugLineNum = 1966082;BA.debugLine="Schema.Put(b, DB_TEXT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_text /*String*/ ));
 }
};
RDebugUtils.currentLine=1966084;
 //BA.debugLineNum = 1966084;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=1966085;
 //BA.debugLineNum = 1966085;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql  _schemaclear(b4j.example.bananoalasql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "schemaclear", true))
	 {return ((b4j.example.bananoalasql) Debug.delegate(ba, "schemaclear", null));}
RDebugUtils.currentLine=1638400;
 //BA.debugLineNum = 1638400;BA.debugLine="Sub SchemaClear As BANanoAlaSQL";
RDebugUtils.currentLine=1638401;
 //BA.debugLineNum = 1638401;BA.debugLine="Schema.clear";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=1638402;
 //BA.debugLineNum = 1638402;BA.debugLine="Return Me";
if (true) return (b4j.example.bananoalasql)(this);
RDebugUtils.currentLine=1638403;
 //BA.debugLineNum = 1638403;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _schemacreatetable(b4j.example.bananoalasql __ref,String _tblname,String _pk) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "schemacreatetable", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "schemacreatetable", new Object[] {_tblname,_pk}));}
RDebugUtils.currentLine=3014656;
 //BA.debugLineNum = 3014656;BA.debugLine="Sub SchemaCreateTable(tblName As String, PK As Str";
RDebugUtils.currentLine=3014657;
 //BA.debugLineNum = 3014657;BA.debugLine="Return CreateTable(tblName, Schema, PK)";
if (true) return __ref._createtable /*b4j.example.bananoalasql._alasqlresultset*/ (null,_tblname,__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ ,_pk);
RDebugUtils.currentLine=3014658;
 //BA.debugLineNum = 3014658;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _selectall(b4j.example.bananoalasql __ref,String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "selectall", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "selectall", new Object[] {_tblname,_tblfields,_orderby}));}
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=4325376;
 //BA.debugLineNum = 4325376;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
RDebugUtils.currentLine=4325378;
 //BA.debugLineNum = 4325378;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=4325379;
 //BA.debugLineNum = 4325379;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=4325380;
 //BA.debugLineNum = 4325380;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=4325382;
 //BA.debugLineNum = 4325382;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=4325384;
 //BA.debugLineNum = 4325384;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=4325386;
 //BA.debugLineNum = 4325386;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=4325387;
 //BA.debugLineNum = 4325387;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=4325388;
 //BA.debugLineNum = 4325388;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+""));
RDebugUtils.currentLine=4325389;
 //BA.debugLineNum = 4325389;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=4325391;
 //BA.debugLineNum = 4325391;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=4325392;
 //BA.debugLineNum = 4325392;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=4325393;
 //BA.debugLineNum = 4325393;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=4325396;
 //BA.debugLineNum = 4325396;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=4325397;
 //BA.debugLineNum = 4325397;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=4325398;
 //BA.debugLineNum = 4325398;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=4325399;
 //BA.debugLineNum = 4325399;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=4325400;
 //BA.debugLineNum = 4325400;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=4325401;
 //BA.debugLineNum = 4325401;BA.debugLine="m.command = \"select\"";
_m.command /*String*/  = "select";
RDebugUtils.currentLine=4325402;
 //BA.debugLineNum = 4325402;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=4325403;
 //BA.debugLineNum = 4325403;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=4325404;
 //BA.debugLineNum = 4325404;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=4325405;
 //BA.debugLineNum = 4325405;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=4325406;
 //BA.debugLineNum = 4325406;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=4325407;
 //BA.debugLineNum = 4325407;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=4325408;
 //BA.debugLineNum = 4325408;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _update(b4j.example.bananoalasql __ref,String _tblname,String _prikey,String _privalue,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "update", new Object[] {_tblname,_prikey,_privalue,_tblfields}));}
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
RDebugUtils.currentLine=1572864;
 //BA.debugLineNum = 1572864;BA.debugLine="Sub Update(tblName As String, priKey As String, pr";
RDebugUtils.currentLine=1572865;
 //BA.debugLineNum = 1572865;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
RDebugUtils.currentLine=1572866;
 //BA.debugLineNum = 1572866;BA.debugLine="tblWhere.Put(priKey, priValue)";
_tblwhere.Put((Object)(_prikey),(Object)(_privalue));
RDebugUtils.currentLine=1572867;
 //BA.debugLineNum = 1572867;BA.debugLine="Return UpdateWhere(tblName, tblfields, tblWhere,";
if (true) return __ref._updatewhere /*b4j.example.bananoalasql._alasqlresultset*/ (null,_tblname,_tblfields,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=1572868;
 //BA.debugLineNum = 1572868;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _updatewhere(b4j.example.bananoalasql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "updatewhere", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "updatewhere", new Object[] {_tblname,_tblfields,_tblwhere,_operators}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listoftypes1 = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listofvalues1 = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
int _iwhere = 0;
String _opr = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3604480;
 //BA.debugLineNum = 3604480;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
RDebugUtils.currentLine=3604481;
 //BA.debugLineNum = 3604481;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=3604482;
 //BA.debugLineNum = 3604482;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=3604483;
 //BA.debugLineNum = 3604483;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=3604484;
 //BA.debugLineNum = 3604484;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
RDebugUtils.currentLine=3604485;
 //BA.debugLineNum = 3604485;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=3604486;
 //BA.debugLineNum = 3604486;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=3604487;
 //BA.debugLineNum = 3604487;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
RDebugUtils.currentLine=3604488;
 //BA.debugLineNum = 3604488;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3604489;
 //BA.debugLineNum = 3604489;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3604490;
 //BA.debugLineNum = 3604490;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" SET "));
RDebugUtils.currentLine=3604491;
 //BA.debugLineNum = 3604491;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=3604492;
 //BA.debugLineNum = 3604492;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=3604493;
 //BA.debugLineNum = 3604493;BA.debugLine="For i = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=3604494;
 //BA.debugLineNum = 3604494;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
RDebugUtils.currentLine=3604495;
 //BA.debugLineNum = 3604495;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=3604496;
 //BA.debugLineNum = 3604496;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
RDebugUtils.currentLine=3604497;
 //BA.debugLineNum = 3604497;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
RDebugUtils.currentLine=3604499;
 //BA.debugLineNum = 3604499;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
RDebugUtils.currentLine=3604502;
 //BA.debugLineNum = 3604502;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
RDebugUtils.currentLine=3604503;
 //BA.debugLineNum = 3604503;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=3604504;
 //BA.debugLineNum = 3604504;BA.debugLine="For i = 0 To iWhere";
{
final int step24 = 1;
final int limit24 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=3604505;
 //BA.debugLineNum = 3604505;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=3604506;
 //BA.debugLineNum = 3604506;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=3604508;
 //BA.debugLineNum = 3604508;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=3604509;
 //BA.debugLineNum = 3604509;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=3604510;
 //BA.debugLineNum = 3604510;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=3604511;
 //BA.debugLineNum = 3604511;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=3604513;
 //BA.debugLineNum = 3604513;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3604514;
 //BA.debugLineNum = 3604514;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3604515;
 //BA.debugLineNum = 3604515;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=3604516;
 //BA.debugLineNum = 3604516;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=3604517;
 //BA.debugLineNum = 3604517;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=3604518;
 //BA.debugLineNum = 3604518;BA.debugLine="m.command = \"update\"";
_m.command /*String*/  = "update";
RDebugUtils.currentLine=3604519;
 //BA.debugLineNum = 3604519;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3604520;
 //BA.debugLineNum = 3604520;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3604521;
 //BA.debugLineNum = 3604521;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3604522;
 //BA.debugLineNum = 3604522;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3604523;
 //BA.debugLineNum = 3604523;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3604524;
 //BA.debugLineNum = 3604524;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3604525;
 //BA.debugLineNum = 3604525;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananoalasql._alasqlresultset  _updateall(b4j.example.bananoalasql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananoalasql";
if (Debug.shouldDelegate(ba, "updateall", true))
	 {return ((b4j.example.bananoalasql._alasqlresultset) Debug.delegate(ba, "updateall", new Object[] {_tblname,_tblfields,_operators}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _args = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _oper = "";
String _col = "";
b4j.example.bananoalasql._alasqlresultset _m = null;
RDebugUtils.currentLine=3997696;
 //BA.debugLineNum = 3997696;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map,";
RDebugUtils.currentLine=3997697;
 //BA.debugLineNum = 3997697;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);};
RDebugUtils.currentLine=3997698;
 //BA.debugLineNum = 3997698;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=3997699;
 //BA.debugLineNum = 3997699;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=3997700;
 //BA.debugLineNum = 3997700;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=3997701;
 //BA.debugLineNum = 3997701;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=3997702;
 //BA.debugLineNum = 3997702;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" SET "));
RDebugUtils.currentLine=3997703;
 //BA.debugLineNum = 3997703;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=3997704;
 //BA.debugLineNum = 3997704;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=3997705;
 //BA.debugLineNum = 3997705;BA.debugLine="For i = 0 To iTot";
{
final int step9 = 1;
final int limit9 = _itot;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=3997706;
 //BA.debugLineNum = 3997706;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=3997707;
 //BA.debugLineNum = 3997707;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
RDebugUtils.currentLine=3997708;
 //BA.debugLineNum = 3997708;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
RDebugUtils.currentLine=3997709;
 //BA.debugLineNum = 3997709;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
RDebugUtils.currentLine=3997710;
 //BA.debugLineNum = 3997710;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
RDebugUtils.currentLine=3997712;
 //BA.debugLineNum = 3997712;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 };
 }
};
RDebugUtils.currentLine=3997715;
 //BA.debugLineNum = 3997715;BA.debugLine="Dim m As AlaSQLResultSet";
_m = new b4j.example.bananoalasql._alasqlresultset();
RDebugUtils.currentLine=3997716;
 //BA.debugLineNum = 3997716;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=3997717;
 //BA.debugLineNum = 3997717;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=3997718;
 //BA.debugLineNum = 3997718;BA.debugLine="m.args = args";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _args;
RDebugUtils.currentLine=3997719;
 //BA.debugLineNum = 3997719;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=3997720;
 //BA.debugLineNum = 3997720;BA.debugLine="m.command = \"update\"";
_m.command /*String*/  = "update";
RDebugUtils.currentLine=3997721;
 //BA.debugLineNum = 3997721;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=3997722;
 //BA.debugLineNum = 3997722;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=3997723;
 //BA.debugLineNum = 3997723;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=3997724;
 //BA.debugLineNum = 3997724;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=3997725;
 //BA.debugLineNum = 3997725;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=3997726;
 //BA.debugLineNum = 3997726;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=3997727;
 //BA.debugLineNum = 3997727;BA.debugLine="End Sub";
return null;
}
}