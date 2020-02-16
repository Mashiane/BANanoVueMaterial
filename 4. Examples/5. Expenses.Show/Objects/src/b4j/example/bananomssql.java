package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananomssql extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.bananomssql", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananomssql.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _mssqlresultset{
public boolean IsInitialized;
public anywheresoftware.b4a.objects.collections.List result;
public String command;
public anywheresoftware.b4a.objects.collections.List types;
public anywheresoftware.b4a.objects.collections.List args;
public String query;
public String response;
public String error;
public long affectedRows;
public String json;
public boolean OK;
public void Initialize() {
IsInitialized = true;
result = new anywheresoftware.b4a.objects.collections.List();
command = "";
types = new anywheresoftware.b4a.objects.collections.List();
args = new anywheresoftware.b4a.objects.collections.List();
query = "";
response = "";
error = "";
affectedRows = 0L;
json = "";
OK = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _rectype = null;
public String _db_varchar_20 = "";
public String _db_varchar_10 = "";
public String _db_varchar_30 = "";
public String _db_varchar_40 = "";
public String _db_varchar_50 = "";
public String _db_varchar_100 = "";
public String _db_varchar_255 = "";
public String _db_string = "";
public String _db_int = "";
public String _db_float = "";
public String _db_blob = "";
public String _db_bool = "";
public String _db_real = "";
public String _db_date = "";
public String _db_integer = "";
public String _db_text = "";
public com.ab.banano.BANano _banano = null;
public String _methodname = "";
public anywheresoftware.b4a.objects.collections.Map _schema = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.bananomssql  _addblobs(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "addblobs", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "addblobs", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=6225920;
 //BA.debugLineNum = 6225920;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoMSSQL";
RDebugUtils.currentLine=6225921;
 //BA.debugLineNum = 6225921;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=6225922;
 //BA.debugLineNum = 6225922;BA.debugLine="recType.Put(strfld,\"BLOB\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("BLOB"));
 }
};
RDebugUtils.currentLine=6225924;
 //BA.debugLineNum = 6225924;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=6225925;
 //BA.debugLineNum = 6225925;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _addbooleans(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "addbooleans", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "addbooleans", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=6291456;
 //BA.debugLineNum = 6291456;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoMSSQL";
RDebugUtils.currentLine=6291457;
 //BA.debugLineNum = 6291457;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=6291458;
 //BA.debugLineNum = 6291458;BA.debugLine="recType.Put(strfld,\"BOOL\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("BOOL"));
 }
};
RDebugUtils.currentLine=6291460;
 //BA.debugLineNum = 6291460;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=6291461;
 //BA.debugLineNum = 6291461;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _adddoubles(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "adddoubles", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "adddoubles", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=6160384;
 //BA.debugLineNum = 6160384;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoMSSQL";
RDebugUtils.currentLine=6160385;
 //BA.debugLineNum = 6160385;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=6160386;
 //BA.debugLineNum = 6160386;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
RDebugUtils.currentLine=6160388;
 //BA.debugLineNum = 6160388;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=6160389;
 //BA.debugLineNum = 6160389;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _addintegers(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "addintegers", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "addintegers", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=6094848;
 //BA.debugLineNum = 6094848;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoMSSQL";
RDebugUtils.currentLine=6094849;
 //BA.debugLineNum = 6094849;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=6094850;
 //BA.debugLineNum = 6094850;BA.debugLine="recType.Put(strfld,\"INT\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("INT"));
 }
};
RDebugUtils.currentLine=6094852;
 //BA.debugLineNum = 6094852;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=6094853;
 //BA.debugLineNum = 6094853;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _addstrings(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "addstrings", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "addstrings", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=6029312;
 //BA.debugLineNum = 6029312;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoMSSQL";
RDebugUtils.currentLine=6029313;
 //BA.debugLineNum = 6029313;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=6029314;
 //BA.debugLineNum = 6029314;BA.debugLine="recType.Put(strfld,\"STRING\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("STRING"));
 }
};
RDebugUtils.currentLine=6029316;
 //BA.debugLineNum = 6029316;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=6029317;
 //BA.debugLineNum = 6029317;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _build(b4j.example.bananomssql __ref,b4j.example.bananomssql._mssqlresultset _rslt) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "build", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "build", new Object[] {_rslt}));}
anywheresoftware.b4a.objects.collections.Map _b = null;
RDebugUtils.currentLine=7340032;
 //BA.debugLineNum = 7340032;BA.debugLine="Sub Build(rslt As MSSQLResultSet) As Map";
RDebugUtils.currentLine=7340033;
 //BA.debugLineNum = 7340033;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
RDebugUtils.currentLine=7340034;
 //BA.debugLineNum = 7340034;BA.debugLine="b.Put(\"command\", rslt.command)";
_b.Put((Object)("command"),(Object)(_rslt.command /*String*/ ));
RDebugUtils.currentLine=7340035;
 //BA.debugLineNum = 7340035;BA.debugLine="b.Put(\"query\", rslt.query)";
_b.Put((Object)("query"),(Object)(_rslt.query /*String*/ ));
RDebugUtils.currentLine=7340036;
 //BA.debugLineNum = 7340036;BA.debugLine="b.Put(\"args\", rslt.args)";
_b.Put((Object)("args"),(Object)(_rslt.args /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=7340037;
 //BA.debugLineNum = 7340037;BA.debugLine="b.Put(\"types\", rslt.types)";
_b.Put((Object)("types"),(Object)(_rslt.types /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=7340038;
 //BA.debugLineNum = 7340038;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=7340039;
 //BA.debugLineNum = 7340039;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.bananomssql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
RDebugUtils.currentLine=4784128;
 //BA.debugLineNum = 4784128;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=4784129;
 //BA.debugLineNum = 4784129;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4784130;
 //BA.debugLineNum = 4784130;BA.debugLine="Public const DB_VARCHAR_20 As String = \"VARCHAR(2";
_db_varchar_20 = "VARCHAR(20)";
RDebugUtils.currentLine=4784131;
 //BA.debugLineNum = 4784131;BA.debugLine="Public const DB_VARCHAR_10 As String = \"VARCHAR(1";
_db_varchar_10 = "VARCHAR(10)";
RDebugUtils.currentLine=4784132;
 //BA.debugLineNum = 4784132;BA.debugLine="Public const DB_VARCHAR_30 As String = \"VARCHAR(3";
_db_varchar_30 = "VARCHAR(30)";
RDebugUtils.currentLine=4784133;
 //BA.debugLineNum = 4784133;BA.debugLine="Public const DB_VARCHAR_40 As String = \"VARCHAR(4";
_db_varchar_40 = "VARCHAR(40)";
RDebugUtils.currentLine=4784134;
 //BA.debugLineNum = 4784134;BA.debugLine="Public const DB_VARCHAR_50 As String = \"VARCHAR(5";
_db_varchar_50 = "VARCHAR(50)";
RDebugUtils.currentLine=4784135;
 //BA.debugLineNum = 4784135;BA.debugLine="Public const DB_VARCHAR_100 As String = \"VARCHAR(";
_db_varchar_100 = "VARCHAR(100)";
RDebugUtils.currentLine=4784136;
 //BA.debugLineNum = 4784136;BA.debugLine="Public const DB_VARCHAR_255 As String = \"VARCHAR(";
_db_varchar_255 = "VARCHAR(255)";
RDebugUtils.currentLine=4784137;
 //BA.debugLineNum = 4784137;BA.debugLine="Public const DB_STRING As String = \"TEXT\"";
_db_string = "TEXT";
RDebugUtils.currentLine=4784138;
 //BA.debugLineNum = 4784138;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
RDebugUtils.currentLine=4784139;
 //BA.debugLineNum = 4784139;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
RDebugUtils.currentLine=4784140;
 //BA.debugLineNum = 4784140;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
RDebugUtils.currentLine=4784141;
 //BA.debugLineNum = 4784141;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
RDebugUtils.currentLine=4784142;
 //BA.debugLineNum = 4784142;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
RDebugUtils.currentLine=4784143;
 //BA.debugLineNum = 4784143;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
RDebugUtils.currentLine=4784144;
 //BA.debugLineNum = 4784144;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
_db_integer = "INTEGER";
RDebugUtils.currentLine=4784145;
 //BA.debugLineNum = 4784145;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
_db_text = "TEXT";
RDebugUtils.currentLine=4784146;
 //BA.debugLineNum = 4784146;BA.debugLine="Type MSSQLResultSet(result As List, command As St";
;
RDebugUtils.currentLine=4784148;
 //BA.debugLineNum = 4784148;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=4784149;
 //BA.debugLineNum = 4784149;BA.debugLine="Public MethodName As String";
_methodname = "";
RDebugUtils.currentLine=4784150;
 //BA.debugLineNum = 4784150;BA.debugLine="Private Schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=4784151;
 //BA.debugLineNum = 4784151;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssql._mssqlresultset  _createtable(b4j.example.bananomssql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,String _pk,String _auto) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "createtable", new Object[] {_tblname,_tblfields,_pk,_auto}));}
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _query = "";
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=5505024;
 //BA.debugLineNum = 5505024;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
RDebugUtils.currentLine=5505025;
 //BA.debugLineNum = 5505025;BA.debugLine="Dim fldName As String";
_fldname = "";
RDebugUtils.currentLine=5505026;
 //BA.debugLineNum = 5505026;BA.debugLine="Dim fldType As String";
_fldtype = "";
RDebugUtils.currentLine=5505027;
 //BA.debugLineNum = 5505027;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
RDebugUtils.currentLine=5505028;
 //BA.debugLineNum = 5505028;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
RDebugUtils.currentLine=5505029;
 //BA.debugLineNum = 5505029;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=5505030;
 //BA.debugLineNum = 5505030;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=5505031;
 //BA.debugLineNum = 5505031;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=5505032;
 //BA.debugLineNum = 5505032;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=5505033;
 //BA.debugLineNum = 5505033;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
RDebugUtils.currentLine=5505034;
 //BA.debugLineNum = 5505034;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
RDebugUtils.currentLine=5505035;
 //BA.debugLineNum = 5505035;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
RDebugUtils.currentLine=5505036;
 //BA.debugLineNum = 5505036;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
_fldtype = _fldtype.replace("STRING","TEXT");
RDebugUtils.currentLine=5505037;
 //BA.debugLineNum = 5505037;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
RDebugUtils.currentLine=5505038;
 //BA.debugLineNum = 5505038;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
RDebugUtils.currentLine=5505040;
 //BA.debugLineNum = 5505040;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(__ref._escapefield /*String*/ (null,_fldname));
RDebugUtils.currentLine=5505041;
 //BA.debugLineNum = 5505041;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
RDebugUtils.currentLine=5505042;
 //BA.debugLineNum = 5505042;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
RDebugUtils.currentLine=5505043;
 //BA.debugLineNum = 5505043;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
RDebugUtils.currentLine=5505044;
 //BA.debugLineNum = 5505044;BA.debugLine="sb.Append(\" NOT NULL PRIMARY KEY\")";
_sb.Append(" NOT NULL PRIMARY KEY");
 };
RDebugUtils.currentLine=5505046;
 //BA.debugLineNum = 5505046;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
if (_fldname.equalsIgnoreCase(_auto)) { 
RDebugUtils.currentLine=5505047;
 //BA.debugLineNum = 5505047;BA.debugLine="sb.Append(\" AUTO_INCREMENT\")";
_sb.Append(" AUTO_INCREMENT");
 };
 }
};
RDebugUtils.currentLine=5505050;
 //BA.debugLineNum = 5505050;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=5505052;
 //BA.debugLineNum = 5505052;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+__ref._escapefield /*String*/ (null,_tblname)+" "+_sb.ToString();
RDebugUtils.currentLine=5505053;
 //BA.debugLineNum = 5505053;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=5505054;
 //BA.debugLineNum = 5505054;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=5505055;
 //BA.debugLineNum = 5505055;BA.debugLine="m.query = query";
_m.query /*String*/  = _query;
RDebugUtils.currentLine=5505056;
 //BA.debugLineNum = 5505056;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=5505057;
 //BA.debugLineNum = 5505057;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=5505058;
 //BA.debugLineNum = 5505058;BA.debugLine="m.command = \"createtable\"";
_m.command /*String*/  = "createtable";
RDebugUtils.currentLine=5505059;
 //BA.debugLineNum = 5505059;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=5505060;
 //BA.debugLineNum = 5505060;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=5505061;
 //BA.debugLineNum = 5505061;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=5505062;
 //BA.debugLineNum = 5505062;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=5505063;
 //BA.debugLineNum = 5505063;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=5505064;
 //BA.debugLineNum = 5505064;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=5505065;
 //BA.debugLineNum = 5505065;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(b4j.example.bananomssql __ref,String _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "escapefield", true))
	 {return ((String) Debug.delegate(ba, "escapefield", new Object[] {_f}));}
RDebugUtils.currentLine=6356992;
 //BA.debugLineNum = 6356992;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=6356993;
 //BA.debugLineNum = 6356993;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
RDebugUtils.currentLine=6356994;
 //BA.debugLineNum = 6356994;BA.debugLine="End Sub";
return "";
}
public String  _cstr(b4j.example.bananomssql __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "cstr", true))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=5767168;
 //BA.debugLineNum = 5767168;BA.debugLine="private Sub CStr(o As Object) As String";
RDebugUtils.currentLine=5767169;
 //BA.debugLineNum = 5767169;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
if ((_o).equals(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED())) { 
_o = (Object)("");};
RDebugUtils.currentLine=5767170;
 //BA.debugLineNum = 5767170;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=5767171;
 //BA.debugLineNum = 5767171;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssql._mssqlresultset  _delete(b4j.example.bananomssql __ref,String _tblname,String _primarykey,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "delete", new Object[] {_tblname,_primarykey,_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananomssql._mssqlresultset _qry = null;
RDebugUtils.currentLine=6946816;
 //BA.debugLineNum = 6946816;BA.debugLine="Sub Delete(tblName As String, primaryKey As String";
RDebugUtils.currentLine=6946817;
 //BA.debugLineNum = 6946817;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=6946818;
 //BA.debugLineNum = 6946818;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
RDebugUtils.currentLine=6946819;
 //BA.debugLineNum = 6946819;BA.debugLine="Dim qry As MSSQLResultSet = DeleteWhere(tblName,";
_qry = __ref._deletewhere /*b4j.example.bananomssql._mssqlresultset*/ (null,_tblname,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}));
RDebugUtils.currentLine=6946820;
 //BA.debugLineNum = 6946820;BA.debugLine="Return qry";
if (true) return _qry;
RDebugUtils.currentLine=6946821;
 //BA.debugLineNum = 6946821;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _deletewhere(b4j.example.bananomssql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "deletewhere", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "deletewhere", new Object[] {_tblname,_tblwhere,_operators}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=7208960;
 //BA.debugLineNum = 7208960;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
RDebugUtils.currentLine=7208961;
 //BA.debugLineNum = 7208961;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=7208962;
 //BA.debugLineNum = 7208962;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=7208963;
 //BA.debugLineNum = 7208963;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=7208964;
 //BA.debugLineNum = 7208964;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7208965;
 //BA.debugLineNum = 7208965;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7208966;
 //BA.debugLineNum = 7208966;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE "));
RDebugUtils.currentLine=7208967;
 //BA.debugLineNum = 7208967;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=7208968;
 //BA.debugLineNum = 7208968;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=7208969;
 //BA.debugLineNum = 7208969;BA.debugLine="For i = 0 To iWhere";
{
final int step9 = 1;
final int limit9 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=7208970;
 //BA.debugLineNum = 7208970;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=7208971;
 //BA.debugLineNum = 7208971;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=7208973;
 //BA.debugLineNum = 7208973;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=7208974;
 //BA.debugLineNum = 7208974;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=7208975;
 //BA.debugLineNum = 7208975;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=7208976;
 //BA.debugLineNum = 7208976;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=7208978;
 //BA.debugLineNum = 7208978;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=7208979;
 //BA.debugLineNum = 7208979;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7208980;
 //BA.debugLineNum = 7208980;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=7208981;
 //BA.debugLineNum = 7208981;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=7208982;
 //BA.debugLineNum = 7208982;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=7208983;
 //BA.debugLineNum = 7208983;BA.debugLine="m.command = \"delete\"";
_m.command /*String*/  = "delete";
RDebugUtils.currentLine=7208984;
 //BA.debugLineNum = 7208984;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=7208985;
 //BA.debugLineNum = 7208985;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=7208986;
 //BA.debugLineNum = 7208986;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=7208987;
 //BA.debugLineNum = 7208987;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=7208988;
 //BA.debugLineNum = 7208988;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=7208989;
 //BA.debugLineNum = 7208989;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=7208990;
 //BA.debugLineNum = 7208990;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _deleteall(b4j.example.bananomssql __ref,String _tblname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "deleteall", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "deleteall", new Object[] {_tblname}));}
String _sb = "";
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=7143424;
 //BA.debugLineNum = 7143424;BA.debugLine="Sub DeleteAll(tblName As String) As MSSQLResultSet";
RDebugUtils.currentLine=7143425;
 //BA.debugLineNum = 7143425;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+"");
RDebugUtils.currentLine=7143426;
 //BA.debugLineNum = 7143426;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=7143427;
 //BA.debugLineNum = 7143427;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7143428;
 //BA.debugLineNum = 7143428;BA.debugLine="m.query = sb";
_m.query /*String*/  = _sb;
RDebugUtils.currentLine=7143429;
 //BA.debugLineNum = 7143429;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=7143430;
 //BA.debugLineNum = 7143430;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=7143431;
 //BA.debugLineNum = 7143431;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=7143432;
 //BA.debugLineNum = 7143432;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=7143433;
 //BA.debugLineNum = 7143433;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=7143434;
 //BA.debugLineNum = 7143434;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=7143435;
 //BA.debugLineNum = 7143435;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=7143436;
 //BA.debugLineNum = 7143436;BA.debugLine="m.command = \"delete\"";
_m.command /*String*/  = "delete";
RDebugUtils.currentLine=7143437;
 //BA.debugLineNum = 7143437;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=7143438;
 //BA.debugLineNum = 7143438;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "eqoperators", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "eqoperators", new Object[] {_sm}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
RDebugUtils.currentLine=4915200;
 //BA.debugLineNum = 4915200;BA.debugLine="Sub EQOperators(sm As Map) As List";
RDebugUtils.currentLine=4915201;
 //BA.debugLineNum = 4915201;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=4915202;
 //BA.debugLineNum = 4915202;BA.debugLine="nl.initialize";
_nl.Initialize();
RDebugUtils.currentLine=4915203;
 //BA.debugLineNum = 4915203;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=4915204;
 //BA.debugLineNum = 4915204;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
RDebugUtils.currentLine=4915206;
 //BA.debugLineNum = 4915206;BA.debugLine="Return nl";
if (true) return _nl;
RDebugUtils.currentLine=4915207;
 //BA.debugLineNum = 4915207;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "getmaptypes", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmaptypes", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
RDebugUtils.currentLine=6488064;
 //BA.debugLineNum = 6488064;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
RDebugUtils.currentLine=6488065;
 //BA.debugLineNum = 6488065;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6488066;
 //BA.debugLineNum = 6488066;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
RDebugUtils.currentLine=6488067;
 //BA.debugLineNum = 6488067;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=6488068;
 //BA.debugLineNum = 6488068;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=6488069;
 //BA.debugLineNum = 6488069;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=6488070;
 //BA.debugLineNum = 6488070;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=6488071;
 //BA.debugLineNum = 6488071;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
RDebugUtils.currentLine=6488072;
 //BA.debugLineNum = 6488072;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_col),(Object)("STRING")));
RDebugUtils.currentLine=6488073;
 //BA.debugLineNum = 6488073;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR","NVARCHAR","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR","INTEGER","INT","BOOL","BOOLEAN","REAL","FLOAT","DOUBLE","BLOB")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
RDebugUtils.currentLine=6488075;
 //BA.debugLineNum = 6488075;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 6: 
case 7: 
case 8: {
RDebugUtils.currentLine=6488077;
 //BA.debugLineNum = 6488077;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 9: 
case 10: 
case 11: 
case 12: 
case 13: 
case 14: {
RDebugUtils.currentLine=6488079;
 //BA.debugLineNum = 6488079;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 15: 
case 16: 
case 17: 
case 18: {
RDebugUtils.currentLine=6488081;
 //BA.debugLineNum = 6488081;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 19: 
case 20: 
case 21: {
RDebugUtils.currentLine=6488083;
 //BA.debugLineNum = 6488083;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
case 22: {
RDebugUtils.currentLine=6488085;
 //BA.debugLineNum = 6488085;BA.debugLine="listOfTypes.Add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
default: {
RDebugUtils.currentLine=6488087;
 //BA.debugLineNum = 6488087;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
RDebugUtils.currentLine=6488090;
 //BA.debugLineNum = 6488090;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
RDebugUtils.currentLine=6488091;
 //BA.debugLineNum = 6488091;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "getmapvalues", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapvalues", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
RDebugUtils.currentLine=6553600;
 //BA.debugLineNum = 6553600;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
RDebugUtils.currentLine=6553601;
 //BA.debugLineNum = 6553601;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6553602;
 //BA.debugLineNum = 6553602;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=6553603;
 //BA.debugLineNum = 6553603;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=6553604;
 //BA.debugLineNum = 6553604;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=6553605;
 //BA.debugLineNum = 6553605;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=6553606;
 //BA.debugLineNum = 6553606;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=6553607;
 //BA.debugLineNum = 6553607;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
RDebugUtils.currentLine=6553608;
 //BA.debugLineNum = 6553608;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
RDebugUtils.currentLine=6553610;
 //BA.debugLineNum = 6553610;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=6553611;
 //BA.debugLineNum = 6553611;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _execute(b4j.example.bananomssql __ref,String _strsql) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "execute", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "execute", new Object[] {_strsql}));}
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=6422528;
 //BA.debugLineNum = 6422528;BA.debugLine="Sub Execute(strSQL As String) As MSSQLResultSet";
RDebugUtils.currentLine=6422529;
 //BA.debugLineNum = 6422529;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=6422530;
 //BA.debugLineNum = 6422530;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6422531;
 //BA.debugLineNum = 6422531;BA.debugLine="m.query = strSQL";
_m.query /*String*/  = _strsql;
RDebugUtils.currentLine=6422532;
 //BA.debugLineNum = 6422532;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=6422533;
 //BA.debugLineNum = 6422533;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=6422534;
 //BA.debugLineNum = 6422534;BA.debugLine="m.command = \"execute\"";
_m.command /*String*/  = "execute";
RDebugUtils.currentLine=6422535;
 //BA.debugLineNum = 6422535;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=6422536;
 //BA.debugLineNum = 6422536;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=6422537;
 //BA.debugLineNum = 6422537;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=6422538;
 //BA.debugLineNum = 6422538;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=6422539;
 //BA.debugLineNum = 6422539;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=6422540;
 //BA.debugLineNum = 6422540;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=6422541;
 //BA.debugLineNum = 6422541;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _exists(b4j.example.bananomssql __ref,String _tblname,String _primarykey,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "exists", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "exists", new Object[] {_tblname,_primarykey,_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananomssql._mssqlresultset _qry = null;
RDebugUtils.currentLine=7012352;
 //BA.debugLineNum = 7012352;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
RDebugUtils.currentLine=7012353;
 //BA.debugLineNum = 7012353;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=7012354;
 //BA.debugLineNum = 7012354;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
RDebugUtils.currentLine=7012355;
 //BA.debugLineNum = 7012355;BA.debugLine="Dim qry As MSSQLResultSet = SelectWhere(tblName,";
_qry = __ref._selectwhere /*b4j.example.bananomssql._mssqlresultset*/ (null,_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
RDebugUtils.currentLine=7012356;
 //BA.debugLineNum = 7012356;BA.debugLine="Return qry";
if (true) return _qry;
RDebugUtils.currentLine=7012357;
 //BA.debugLineNum = 7012357;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _selectwhere(b4j.example.bananomssql __ref,String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "selectwhere", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "selectwhere", new Object[] {_tblname,_tblfields,_tblwhere,_operators,_orderby}));}
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
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=7077888;
 //BA.debugLineNum = 7077888;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
RDebugUtils.currentLine=7077889;
 //BA.debugLineNum = 7077889;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=7077890;
 //BA.debugLineNum = 7077890;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=7077891;
 //BA.debugLineNum = 7077891;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=7077893;
 //BA.debugLineNum = 7077893;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=7077894;
 //BA.debugLineNum = 7077894;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=7077895;
 //BA.debugLineNum = 7077895;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=7077897;
 //BA.debugLineNum = 7077897;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=7077899;
 //BA.debugLineNum = 7077899;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=7077901;
 //BA.debugLineNum = 7077901;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7077902;
 //BA.debugLineNum = 7077902;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7077903;
 //BA.debugLineNum = 7077903;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE "));
RDebugUtils.currentLine=7077904;
 //BA.debugLineNum = 7077904;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=7077905;
 //BA.debugLineNum = 7077905;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=7077906;
 //BA.debugLineNum = 7077906;BA.debugLine="For i = 0 To iWhere";
{
final int step17 = 1;
final int limit17 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=7077907;
 //BA.debugLineNum = 7077907;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=7077908;
 //BA.debugLineNum = 7077908;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=7077910;
 //BA.debugLineNum = 7077910;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=7077911;
 //BA.debugLineNum = 7077911;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=7077912;
 //BA.debugLineNum = 7077912;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=7077913;
 //BA.debugLineNum = 7077913;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=7077915;
 //BA.debugLineNum = 7077915;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=7077917;
 //BA.debugLineNum = 7077917;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=7077918;
 //BA.debugLineNum = 7077918;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=7077919;
 //BA.debugLineNum = 7077919;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=7077922;
 //BA.debugLineNum = 7077922;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=7077923;
 //BA.debugLineNum = 7077923;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7077924;
 //BA.debugLineNum = 7077924;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=7077925;
 //BA.debugLineNum = 7077925;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=7077926;
 //BA.debugLineNum = 7077926;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=7077927;
 //BA.debugLineNum = 7077927;BA.debugLine="m.command = \"select\"";
_m.command /*String*/  = "select";
RDebugUtils.currentLine=7077928;
 //BA.debugLineNum = 7077928;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=7077929;
 //BA.debugLineNum = 7077929;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=7077930;
 //BA.debugLineNum = 7077930;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=7077931;
 //BA.debugLineNum = 7077931;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=7077932;
 //BA.debugLineNum = 7077932;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=7077933;
 //BA.debugLineNum = 7077933;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=7077934;
 //BA.debugLineNum = 7077934;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "getmapkeys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapkeys", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
RDebugUtils.currentLine=6619136;
 //BA.debugLineNum = 6619136;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
RDebugUtils.currentLine=6619137;
 //BA.debugLineNum = 6619137;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=6619138;
 //BA.debugLineNum = 6619138;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=6619139;
 //BA.debugLineNum = 6619139;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=6619140;
 //BA.debugLineNum = 6619140;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=6619141;
 //BA.debugLineNum = 6619141;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=6619142;
 //BA.debugLineNum = 6619142;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=6619143;
 //BA.debugLineNum = 6619143;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
RDebugUtils.currentLine=6619144;
 //BA.debugLineNum = 6619144;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
RDebugUtils.currentLine=6619146;
 //BA.debugLineNum = 6619146;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=6619147;
 //BA.debugLineNum = 6619147;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _getmax(b4j.example.bananomssql __ref,String _tblname,String _fldname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "getmax", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "getmax", new Object[] {_tblname,_fldname}));}
String _sb = "";
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=5636096;
 //BA.debugLineNum = 5636096;BA.debugLine="Sub GetMax(tblName As String, fldName As String) A";
RDebugUtils.currentLine=5636097;
 //BA.debugLineNum = 5636097;BA.debugLine="Dim sb As String = $\"SELECT MAX(${fldName}) As ${";
_sb = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(_fldname))+") As "+__c.SmartStringFormatter("",(Object)(_fldname))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+"");
RDebugUtils.currentLine=5636098;
 //BA.debugLineNum = 5636098;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=5636099;
 //BA.debugLineNum = 5636099;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=5636100;
 //BA.debugLineNum = 5636100;BA.debugLine="m.query = sb";
_m.query /*String*/  = _sb;
RDebugUtils.currentLine=5636101;
 //BA.debugLineNum = 5636101;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=5636102;
 //BA.debugLineNum = 5636102;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=5636103;
 //BA.debugLineNum = 5636103;BA.debugLine="m.command = \"getmax\"";
_m.command /*String*/  = "getmax";
RDebugUtils.currentLine=5636104;
 //BA.debugLineNum = 5636104;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=5636105;
 //BA.debugLineNum = 5636105;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=5636106;
 //BA.debugLineNum = 5636106;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=5636107;
 //BA.debugLineNum = 5636107;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=5636108;
 //BA.debugLineNum = 5636108;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=5636109;
 //BA.debugLineNum = 5636109;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=5636110;
 //BA.debugLineNum = 5636110;BA.debugLine="End Sub";
return null;
}
public String  _getnextid(b4j.example.bananomssql __ref,String _fld,anywheresoftware.b4a.objects.collections.List _rsl) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "getnextid", true))
	 {return ((String) Debug.delegate(ba, "getnextid", new Object[] {_fld,_rsl}));}
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
RDebugUtils.currentLine=5701632;
 //BA.debugLineNum = 5701632;BA.debugLine="Sub GetNextID(fld As String, rsl As List) As Strin";
RDebugUtils.currentLine=5701633;
 //BA.debugLineNum = 5701633;BA.debugLine="Dim nextid As Int";
_nextid = 0;
RDebugUtils.currentLine=5701634;
 //BA.debugLineNum = 5701634;BA.debugLine="Dim strid As String";
_strid = "";
RDebugUtils.currentLine=5701636;
 //BA.debugLineNum = 5701636;BA.debugLine="If rsl.Size = 0 Then";
if (_rsl.getSize()==0) { 
RDebugUtils.currentLine=5701637;
 //BA.debugLineNum = 5701637;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
RDebugUtils.currentLine=5701639;
 //BA.debugLineNum = 5701639;BA.debugLine="Dim nr As Map = rsl.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rsl.Get((int) (0))));
RDebugUtils.currentLine=5701640;
 //BA.debugLineNum = 5701640;BA.debugLine="Dim ni As String = nr.GetDefault(fld,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_fld),(Object)("0")));
RDebugUtils.currentLine=5701641;
 //BA.debugLineNum = 5701641;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = __ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_ni));
 };
RDebugUtils.currentLine=5701643;
 //BA.debugLineNum = 5701643;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
RDebugUtils.currentLine=5701644;
 //BA.debugLineNum = 5701644;BA.debugLine="strid = CStr(nextid)";
_strid = __ref._cstr /*String*/ (null,(Object)(_nextid));
RDebugUtils.currentLine=5701645;
 //BA.debugLineNum = 5701645;BA.debugLine="Return strid";
if (true) return _strid;
RDebugUtils.currentLine=5701646;
 //BA.debugLineNum = 5701646;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssql  _initialize(b4j.example.bananomssql __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=5832704;
 //BA.debugLineNum = 5832704;BA.debugLine="Sub Initialize() As BANanoMSSQL";
RDebugUtils.currentLine=5832705;
 //BA.debugLineNum = 5832705;BA.debugLine="recType.Initialize";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5832706;
 //BA.debugLineNum = 5832706;BA.debugLine="MethodName = \"BANanoMSSQL\"";
__ref._methodname /*String*/  = "BANanoMSSQL";
RDebugUtils.currentLine=5832707;
 //BA.debugLineNum = 5832707;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=5832708;
 //BA.debugLineNum = 5832708;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _insert(b4j.example.bananomssql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "insert", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "insert", new Object[] {_tblname,_tblfields}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=6684672;
 //BA.debugLineNum = 6684672;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
RDebugUtils.currentLine=6684673;
 //BA.debugLineNum = 6684673;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6684674;
 //BA.debugLineNum = 6684674;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6684675;
 //BA.debugLineNum = 6684675;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6684676;
 //BA.debugLineNum = 6684676;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=6684677;
 //BA.debugLineNum = 6684677;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=6684678;
 //BA.debugLineNum = 6684678;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=6684679;
 //BA.debugLineNum = 6684679;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=6684680;
 //BA.debugLineNum = 6684680;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6684681;
 //BA.debugLineNum = 6684681;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=6684682;
 //BA.debugLineNum = 6684682;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=6684683;
 //BA.debugLineNum = 6684683;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" ("));
RDebugUtils.currentLine=6684684;
 //BA.debugLineNum = 6684684;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=6684685;
 //BA.debugLineNum = 6684685;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
RDebugUtils.currentLine=6684686;
 //BA.debugLineNum = 6684686;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
RDebugUtils.currentLine=6684687;
 //BA.debugLineNum = 6684687;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
RDebugUtils.currentLine=6684688;
 //BA.debugLineNum = 6684688;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=6684689;
 //BA.debugLineNum = 6684689;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=6684691;
 //BA.debugLineNum = 6684691;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=6684692;
 //BA.debugLineNum = 6684692;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
RDebugUtils.currentLine=6684694;
 //BA.debugLineNum = 6684694;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
RDebugUtils.currentLine=6684695;
 //BA.debugLineNum = 6684695;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
RDebugUtils.currentLine=6684696;
 //BA.debugLineNum = 6684696;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
RDebugUtils.currentLine=6684697;
 //BA.debugLineNum = 6684697;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=6684698;
 //BA.debugLineNum = 6684698;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=6684699;
 //BA.debugLineNum = 6684699;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=6684700;
 //BA.debugLineNum = 6684700;BA.debugLine="m.query = sb.ToString";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=6684701;
 //BA.debugLineNum = 6684701;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=6684702;
 //BA.debugLineNum = 6684702;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=6684703;
 //BA.debugLineNum = 6684703;BA.debugLine="m.command = \"insert\"";
_m.command /*String*/  = "insert";
RDebugUtils.currentLine=6684704;
 //BA.debugLineNum = 6684704;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=6684705;
 //BA.debugLineNum = 6684705;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=6684706;
 //BA.debugLineNum = 6684706;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=6684707;
 //BA.debugLineNum = 6684707;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=6684708;
 //BA.debugLineNum = 6684708;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=6684709;
 //BA.debugLineNum = 6684709;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=6684710;
 //BA.debugLineNum = 6684710;BA.debugLine="End Sub";
return null;
}
public String  _join(b4j.example.bananomssql __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "join", true))
	 {return ((String) Debug.delegate(ba, "join", new Object[] {_delimiter,_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=6815744;
 //BA.debugLineNum = 6815744;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
RDebugUtils.currentLine=6815745;
 //BA.debugLineNum = 6815745;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6815746;
 //BA.debugLineNum = 6815746;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6815747;
 //BA.debugLineNum = 6815747;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=6815748;
 //BA.debugLineNum = 6815748;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6815749;
 //BA.debugLineNum = 6815749;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=6815750;
 //BA.debugLineNum = 6815750;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=6815751;
 //BA.debugLineNum = 6815751;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=6815752;
 //BA.debugLineNum = 6815752;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=6815753;
 //BA.debugLineNum = 6815753;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
RDebugUtils.currentLine=6815755;
 //BA.debugLineNum = 6815755;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=6815756;
 //BA.debugLineNum = 6815756;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(b4j.example.bananomssql __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "joinfields", true))
	 {return ((String) Debug.delegate(ba, "joinfields", new Object[] {_delimiter,_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=6750208;
 //BA.debugLineNum = 6750208;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
RDebugUtils.currentLine=6750209;
 //BA.debugLineNum = 6750209;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=6750210;
 //BA.debugLineNum = 6750210;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=6750211;
 //BA.debugLineNum = 6750211;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=6750212;
 //BA.debugLineNum = 6750212;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=6750213;
 //BA.debugLineNum = 6750213;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=6750214;
 //BA.debugLineNum = 6750214;BA.debugLine="fld = EscapeField(fld)";
_fld = __ref._escapefield /*String*/ (null,_fld);
RDebugUtils.currentLine=6750215;
 //BA.debugLineNum = 6750215;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=6750216;
 //BA.debugLineNum = 6750216;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=6750217;
 //BA.debugLineNum = 6750217;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=6750218;
 //BA.debugLineNum = 6750218;BA.debugLine="fld = EscapeField(fld)";
_fld = __ref._escapefield /*String*/ (null,_fld);
RDebugUtils.currentLine=6750219;
 //BA.debugLineNum = 6750219;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
RDebugUtils.currentLine=6750221;
 //BA.debugLineNum = 6750221;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=6750222;
 //BA.debugLineNum = 6750222;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(b4j.example.bananomssql __ref,String _strjson) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "json2map", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "json2map", new Object[] {_strjson}));}
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
RDebugUtils.currentLine=5898240;
 //BA.debugLineNum = 5898240;BA.debugLine="private Sub Json2Map(strJSON As String) As Map";
RDebugUtils.currentLine=5898241;
 //BA.debugLineNum = 5898241;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
RDebugUtils.currentLine=5898242;
 //BA.debugLineNum = 5898242;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=5898243;
 //BA.debugLineNum = 5898243;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=5898244;
 //BA.debugLineNum = 5898244;BA.debugLine="Map1.clear";
_map1.Clear();
RDebugUtils.currentLine=5898245;
 //BA.debugLineNum = 5898245;BA.debugLine="Try";
try {RDebugUtils.currentLine=5898246;
 //BA.debugLineNum = 5898246;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
RDebugUtils.currentLine=5898247;
 //BA.debugLineNum = 5898247;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
RDebugUtils.currentLine=5898248;
 //BA.debugLineNum = 5898248;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
RDebugUtils.currentLine=5898250;
 //BA.debugLineNum = 5898250;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=5898252;
 //BA.debugLineNum = 5898252;BA.debugLine="Return Map1";
if (true) return _map1;
 };
RDebugUtils.currentLine=5898254;
 //BA.debugLineNum = 5898254;BA.debugLine="End Sub";
return null;
}
public String  _jsontoresultset(b4j.example.bananomssql __ref,b4j.example.bananomssql._mssqlresultset _rs) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "jsontoresultset", true))
	 {return ((String) Debug.delegate(ba, "jsontoresultset", new Object[] {_rs}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=7536640;
 //BA.debugLineNum = 7536640;BA.debugLine="Sub JSONToResultSet(rs As MSSQLResultSet)";
RDebugUtils.currentLine=7536641;
 //BA.debugLineNum = 7536641;BA.debugLine="rs.ok = False";
_rs.OK /*boolean*/  = __c.False;
RDebugUtils.currentLine=7536642;
 //BA.debugLineNum = 7536642;BA.debugLine="Dim m As Map = BANano.FromJson(rs.json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._banano /*com.ab.banano.BANano*/ .FromJson((Object)(_rs.json /*String*/ ))));
RDebugUtils.currentLine=7536643;
 //BA.debugLineNum = 7536643;BA.debugLine="rs.response = m.Get(\"response\")";
_rs.response /*String*/  = BA.ObjectToString(_m.Get((Object)("response")));
RDebugUtils.currentLine=7536644;
 //BA.debugLineNum = 7536644;BA.debugLine="rs.error = m.Get(\"error\")";
_rs.error /*String*/  = BA.ObjectToString(_m.Get((Object)("error")));
RDebugUtils.currentLine=7536645;
 //BA.debugLineNum = 7536645;BA.debugLine="rs.result = m.Get(\"result\")";
_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(_m.Get((Object)("result"))));
RDebugUtils.currentLine=7536646;
 //BA.debugLineNum = 7536646;BA.debugLine="rs.affectedRows = m.Get(\"affectedRows\")";
_rs.affectedRows /*long*/  = BA.ObjectToLongNumber(_m.Get((Object)("affectedRows")));
RDebugUtils.currentLine=7536647;
 //BA.debugLineNum = 7536647;BA.debugLine="If rs.response = \"Success\" And rs.affectedRows >=";
if ((_rs.response /*String*/ ).equals("Success") && _rs.affectedRows /*long*/ >=1) { 
RDebugUtils.currentLine=7536648;
 //BA.debugLineNum = 7536648;BA.debugLine="rs.OK = True";
_rs.OK /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=7536650;
 //BA.debugLineNum = 7536650;BA.debugLine="End Sub";
return "";
}
public String  _map2json(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "map2json", true))
	 {return ((String) Debug.delegate(ba, "map2json", new Object[] {_mp}));}
com.ab.banano.BANanoJSONGenerator _json = null;
RDebugUtils.currentLine=5963776;
 //BA.debugLineNum = 5963776;BA.debugLine="private Sub Map2Json(mp As Map) As String";
RDebugUtils.currentLine=5963777;
 //BA.debugLineNum = 5963777;BA.debugLine="Dim json As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
RDebugUtils.currentLine=5963778;
 //BA.debugLineNum = 5963778;BA.debugLine="json.Initialize(mp)";
_json.Initialize(_mp);
RDebugUtils.currentLine=5963779;
 //BA.debugLineNum = 5963779;BA.debugLine="Return json.ToString";
if (true) return _json.ToString();
RDebugUtils.currentLine=5963780;
 //BA.debugLineNum = 5963780;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssql._mssqlresultset  _read(b4j.example.bananomssql __ref,String _tblname,String _primarykey,String _primaryvalue,anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "read", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "read", new Object[] {_tblname,_primarykey,_primaryvalue,_flds}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananomssql._mssqlresultset _qry = null;
RDebugUtils.currentLine=6881280;
 //BA.debugLineNum = 6881280;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
RDebugUtils.currentLine=6881281;
 //BA.debugLineNum = 6881281;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=6881282;
 //BA.debugLineNum = 6881282;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
RDebugUtils.currentLine=6881283;
 //BA.debugLineNum = 6881283;BA.debugLine="Dim qry As MSSQLResultSet = SelectWhere(tblName,";
_qry = __ref._selectwhere /*b4j.example.bananomssql._mssqlresultset*/ (null,_tblname,_flds,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
RDebugUtils.currentLine=6881284;
 //BA.debugLineNum = 6881284;BA.debugLine="Return qry";
if (true) return _qry;
RDebugUtils.currentLine=6881285;
 //BA.debugLineNum = 6881285;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _resettypes(b4j.example.bananomssql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "resettypes", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "resettypes", null));}
RDebugUtils.currentLine=5570560;
 //BA.debugLineNum = 5570560;BA.debugLine="Sub ResetTypes As BANanoMSSQL";
RDebugUtils.currentLine=5570561;
 //BA.debugLineNum = 5570561;BA.debugLine="recType.Initialize";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=5570562;
 //BA.debugLineNum = 5570562;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=5570563;
 //BA.debugLineNum = 5570563;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddblob(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "schemaaddblob", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "schemaaddblob", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=5242880;
 //BA.debugLineNum = 5242880;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoMSSQL";
RDebugUtils.currentLine=5242881;
 //BA.debugLineNum = 5242881;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=5242882;
 //BA.debugLineNum = 5242882;BA.debugLine="Schema.Put(b, DB_BLOB)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_blob /*String*/ ));
 }
};
RDebugUtils.currentLine=5242884;
 //BA.debugLineNum = 5242884;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=5242885;
 //BA.debugLineNum = 5242885;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddboolean(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "schemaaddboolean", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "schemaaddboolean", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=5046272;
 //BA.debugLineNum = 5046272;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoMSSQL";
RDebugUtils.currentLine=5046273;
 //BA.debugLineNum = 5046273;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=5046274;
 //BA.debugLineNum = 5046274;BA.debugLine="Schema.Put(b, DB_BOOL)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_bool /*String*/ ));
 }
};
RDebugUtils.currentLine=5046276;
 //BA.debugLineNum = 5046276;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=5046277;
 //BA.debugLineNum = 5046277;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaadddate(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "schemaadddate", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "schemaadddate", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=5373952;
 //BA.debugLineNum = 5373952;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoMSSQL";
RDebugUtils.currentLine=5373953;
 //BA.debugLineNum = 5373953;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=5373954;
 //BA.debugLineNum = 5373954;BA.debugLine="Schema.Put(b, DB_DATE)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_date /*String*/ ));
 }
};
RDebugUtils.currentLine=5373956;
 //BA.debugLineNum = 5373956;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=5373957;
 //BA.debugLineNum = 5373957;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddfloat(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "schemaaddfloat", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "schemaaddfloat", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=5177344;
 //BA.debugLineNum = 5177344;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoMSSQL";
RDebugUtils.currentLine=5177345;
 //BA.debugLineNum = 5177345;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=5177346;
 //BA.debugLineNum = 5177346;BA.debugLine="Schema.Put(b, DB_FLOAT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_float /*String*/ ));
 }
};
RDebugUtils.currentLine=5177348;
 //BA.debugLineNum = 5177348;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=5177349;
 //BA.debugLineNum = 5177349;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddint(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "schemaaddint", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "schemaaddint", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=5111808;
 //BA.debugLineNum = 5111808;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoMSSQL";
RDebugUtils.currentLine=5111809;
 //BA.debugLineNum = 5111809;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=5111810;
 //BA.debugLineNum = 5111810;BA.debugLine="Schema.Put(b, DB_INT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_int /*String*/ ));
 }
};
RDebugUtils.currentLine=5111812;
 //BA.debugLineNum = 5111812;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=5111813;
 //BA.debugLineNum = 5111813;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddtext(b4j.example.bananomssql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "schemaaddtext", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "schemaaddtext", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=5308416;
 //BA.debugLineNum = 5308416;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoMSSQL";
RDebugUtils.currentLine=5308417;
 //BA.debugLineNum = 5308417;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=5308418;
 //BA.debugLineNum = 5308418;BA.debugLine="Schema.Put(b, DB_STRING)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_string /*String*/ ));
 }
};
RDebugUtils.currentLine=5308420;
 //BA.debugLineNum = 5308420;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=5308421;
 //BA.debugLineNum = 5308421;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaclear(b4j.example.bananomssql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "schemaclear", true))
	 {return ((b4j.example.bananomssql) Debug.delegate(ba, "schemaclear", null));}
RDebugUtils.currentLine=4980736;
 //BA.debugLineNum = 4980736;BA.debugLine="Sub SchemaClear As BANanoMSSQL";
RDebugUtils.currentLine=4980737;
 //BA.debugLineNum = 4980737;BA.debugLine="Schema.clear";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=4980738;
 //BA.debugLineNum = 4980738;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
RDebugUtils.currentLine=4980739;
 //BA.debugLineNum = 4980739;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _schemacreatetable(b4j.example.bananomssql __ref,String _tblname,String _pk,String _auto) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "schemacreatetable", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "schemacreatetable", new Object[] {_tblname,_pk,_auto}));}
RDebugUtils.currentLine=5439488;
 //BA.debugLineNum = 5439488;BA.debugLine="Sub SchemaCreateTable(tblName As String, PK As Str";
RDebugUtils.currentLine=5439489;
 //BA.debugLineNum = 5439489;BA.debugLine="Return CreateTable(tblName, Schema, PK, Auto)";
if (true) return __ref._createtable /*b4j.example.bananomssql._mssqlresultset*/ (null,_tblname,__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ ,_pk,_auto);
RDebugUtils.currentLine=5439490;
 //BA.debugLineNum = 5439490;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _selectall(b4j.example.bananomssql __ref,String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "selectall", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "selectall", new Object[] {_tblname,_tblfields,_orderby}));}
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=7274496;
 //BA.debugLineNum = 7274496;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
RDebugUtils.currentLine=7274498;
 //BA.debugLineNum = 7274498;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=7274499;
 //BA.debugLineNum = 7274499;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=7274500;
 //BA.debugLineNum = 7274500;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=7274502;
 //BA.debugLineNum = 7274502;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=7274504;
 //BA.debugLineNum = 7274504;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=7274506;
 //BA.debugLineNum = 7274506;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7274507;
 //BA.debugLineNum = 7274507;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7274508;
 //BA.debugLineNum = 7274508;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+""));
RDebugUtils.currentLine=7274509;
 //BA.debugLineNum = 7274509;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=7274511;
 //BA.debugLineNum = 7274511;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=7274512;
 //BA.debugLineNum = 7274512;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=7274513;
 //BA.debugLineNum = 7274513;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=7274516;
 //BA.debugLineNum = 7274516;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=7274517;
 //BA.debugLineNum = 7274517;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7274518;
 //BA.debugLineNum = 7274518;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=7274519;
 //BA.debugLineNum = 7274519;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=7274520;
 //BA.debugLineNum = 7274520;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=7274521;
 //BA.debugLineNum = 7274521;BA.debugLine="m.command =  \"select\"";
_m.command /*String*/  = "select";
RDebugUtils.currentLine=7274522;
 //BA.debugLineNum = 7274522;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=7274523;
 //BA.debugLineNum = 7274523;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=7274524;
 //BA.debugLineNum = 7274524;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=7274525;
 //BA.debugLineNum = 7274525;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=7274526;
 //BA.debugLineNum = 7274526;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=7274527;
 //BA.debugLineNum = 7274527;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=7274528;
 //BA.debugLineNum = 7274528;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _update(b4j.example.bananomssql __ref,String _tblname,String _prikey,String _privalue,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "update", new Object[] {_tblname,_prikey,_privalue,_tblfields}));}
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
RDebugUtils.currentLine=4849664;
 //BA.debugLineNum = 4849664;BA.debugLine="Sub Update(tblName As String, priKey As String, pr";
RDebugUtils.currentLine=4849665;
 //BA.debugLineNum = 4849665;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
RDebugUtils.currentLine=4849666;
 //BA.debugLineNum = 4849666;BA.debugLine="tblWhere.Put(priKey, priValue)";
_tblwhere.Put((Object)(_prikey),(Object)(_privalue));
RDebugUtils.currentLine=4849667;
 //BA.debugLineNum = 4849667;BA.debugLine="Return UpdateWhere(tblName, tblfields, tblWhere,";
if (true) return __ref._updatewhere /*b4j.example.bananomssql._mssqlresultset*/ (null,_tblname,_tblfields,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=4849668;
 //BA.debugLineNum = 4849668;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _updatewhere(b4j.example.bananomssql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "updatewhere", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "updatewhere", new Object[] {_tblname,_tblfields,_tblwhere,_operators}));}
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
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=7405568;
 //BA.debugLineNum = 7405568;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
RDebugUtils.currentLine=7405569;
 //BA.debugLineNum = 7405569;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=7405570;
 //BA.debugLineNum = 7405570;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=7405571;
 //BA.debugLineNum = 7405571;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=7405572;
 //BA.debugLineNum = 7405572;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
RDebugUtils.currentLine=7405573;
 //BA.debugLineNum = 7405573;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=7405574;
 //BA.debugLineNum = 7405574;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=7405575;
 //BA.debugLineNum = 7405575;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
RDebugUtils.currentLine=7405576;
 //BA.debugLineNum = 7405576;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7405577;
 //BA.debugLineNum = 7405577;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7405578;
 //BA.debugLineNum = 7405578;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" SET "));
RDebugUtils.currentLine=7405579;
 //BA.debugLineNum = 7405579;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=7405580;
 //BA.debugLineNum = 7405580;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=7405581;
 //BA.debugLineNum = 7405581;BA.debugLine="For i = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=7405582;
 //BA.debugLineNum = 7405582;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
RDebugUtils.currentLine=7405583;
 //BA.debugLineNum = 7405583;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=7405584;
 //BA.debugLineNum = 7405584;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
RDebugUtils.currentLine=7405585;
 //BA.debugLineNum = 7405585;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
RDebugUtils.currentLine=7405587;
 //BA.debugLineNum = 7405587;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
RDebugUtils.currentLine=7405590;
 //BA.debugLineNum = 7405590;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
RDebugUtils.currentLine=7405591;
 //BA.debugLineNum = 7405591;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=7405592;
 //BA.debugLineNum = 7405592;BA.debugLine="For i = 0 To iWhere";
{
final int step24 = 1;
final int limit24 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=7405593;
 //BA.debugLineNum = 7405593;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=7405594;
 //BA.debugLineNum = 7405594;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=7405596;
 //BA.debugLineNum = 7405596;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=7405597;
 //BA.debugLineNum = 7405597;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=7405598;
 //BA.debugLineNum = 7405598;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=7405599;
 //BA.debugLineNum = 7405599;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=7405601;
 //BA.debugLineNum = 7405601;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=7405602;
 //BA.debugLineNum = 7405602;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7405603;
 //BA.debugLineNum = 7405603;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=7405604;
 //BA.debugLineNum = 7405604;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=7405605;
 //BA.debugLineNum = 7405605;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=7405606;
 //BA.debugLineNum = 7405606;BA.debugLine="m.command = \"update\"";
_m.command /*String*/  = "update";
RDebugUtils.currentLine=7405607;
 //BA.debugLineNum = 7405607;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=7405608;
 //BA.debugLineNum = 7405608;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=7405609;
 //BA.debugLineNum = 7405609;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=7405610;
 //BA.debugLineNum = 7405610;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=7405611;
 //BA.debugLineNum = 7405611;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=7405612;
 //BA.debugLineNum = 7405612;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=7405613;
 //BA.debugLineNum = 7405613;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _updateall(b4j.example.bananomssql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomssql";
if (Debug.shouldDelegate(ba, "updateall", true))
	 {return ((b4j.example.bananomssql._mssqlresultset) Debug.delegate(ba, "updateall", new Object[] {_tblname,_tblfields,_operators}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _args = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
String _oper = "";
b4j.example.bananomssql._mssqlresultset _m = null;
RDebugUtils.currentLine=7471104;
 //BA.debugLineNum = 7471104;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map,";
RDebugUtils.currentLine=7471105;
 //BA.debugLineNum = 7471105;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);};
RDebugUtils.currentLine=7471106;
 //BA.debugLineNum = 7471106;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=7471107;
 //BA.debugLineNum = 7471107;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=7471108;
 //BA.debugLineNum = 7471108;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=7471109;
 //BA.debugLineNum = 7471109;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=7471110;
 //BA.debugLineNum = 7471110;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" SET "));
RDebugUtils.currentLine=7471111;
 //BA.debugLineNum = 7471111;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=7471112;
 //BA.debugLineNum = 7471112;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=7471113;
 //BA.debugLineNum = 7471113;BA.debugLine="For i = 0 To iTot";
{
final int step9 = 1;
final int limit9 = _itot;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=7471114;
 //BA.debugLineNum = 7471114;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
RDebugUtils.currentLine=7471115;
 //BA.debugLineNum = 7471115;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=7471116;
 //BA.debugLineNum = 7471116;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
RDebugUtils.currentLine=7471117;
 //BA.debugLineNum = 7471117;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
RDebugUtils.currentLine=7471118;
 //BA.debugLineNum = 7471118;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
RDebugUtils.currentLine=7471120;
 //BA.debugLineNum = 7471120;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 };
 }
};
RDebugUtils.currentLine=7471123;
 //BA.debugLineNum = 7471123;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
RDebugUtils.currentLine=7471124;
 //BA.debugLineNum = 7471124;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=7471125;
 //BA.debugLineNum = 7471125;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=7471126;
 //BA.debugLineNum = 7471126;BA.debugLine="m.args = args";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _args;
RDebugUtils.currentLine=7471127;
 //BA.debugLineNum = 7471127;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=7471128;
 //BA.debugLineNum = 7471128;BA.debugLine="m.command = \"update\"";
_m.command /*String*/  = "update";
RDebugUtils.currentLine=7471129;
 //BA.debugLineNum = 7471129;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=7471130;
 //BA.debugLineNum = 7471130;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=7471131;
 //BA.debugLineNum = 7471131;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=7471132;
 //BA.debugLineNum = 7471132;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=7471133;
 //BA.debugLineNum = 7471133;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=7471134;
 //BA.debugLineNum = 7471134;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=7471135;
 //BA.debugLineNum = 7471135;BA.debugLine="End Sub";
return null;
}
}