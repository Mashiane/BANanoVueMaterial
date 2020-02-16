package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananosqlite extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.bananosqlite", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananosqlite.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _sqliteresultset{
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
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
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
public anywheresoftware.b4a.objects.collections.Map _rectype = null;
public com.ab.banano.BANano _banano = null;
public String _dbname = "";
public String _methodname = "";
public anywheresoftware.b4a.objects.collections.Map _schema = null;
public boolean _ok = false;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.bananosqlite  _addblobs(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "addblobs", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "addblobs", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=16121856;
 //BA.debugLineNum = 16121856;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoSQLite";
RDebugUtils.currentLine=16121857;
 //BA.debugLineNum = 16121857;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=16121858;
 //BA.debugLineNum = 16121858;BA.debugLine="recType.Put(strfld,\"BLOB\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("BLOB"));
 }
};
RDebugUtils.currentLine=16121860;
 //BA.debugLineNum = 16121860;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=16121861;
 //BA.debugLineNum = 16121861;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _addbooleans(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "addbooleans", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "addbooleans", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=16056320;
 //BA.debugLineNum = 16056320;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoSQLit";
RDebugUtils.currentLine=16056321;
 //BA.debugLineNum = 16056321;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=16056322;
 //BA.debugLineNum = 16056322;BA.debugLine="recType.Put(strfld,\"BOOL\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("BOOL"));
 }
};
RDebugUtils.currentLine=16056324;
 //BA.debugLineNum = 16056324;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=16056325;
 //BA.debugLineNum = 16056325;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _adddoubles(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "adddoubles", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "adddoubles", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=15990784;
 //BA.debugLineNum = 15990784;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoSQLite";
RDebugUtils.currentLine=15990785;
 //BA.debugLineNum = 15990785;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=15990786;
 //BA.debugLineNum = 15990786;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
RDebugUtils.currentLine=15990788;
 //BA.debugLineNum = 15990788;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=15990789;
 //BA.debugLineNum = 15990789;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _addintegers(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "addintegers", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "addintegers", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=15925248;
 //BA.debugLineNum = 15925248;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoSQLit";
RDebugUtils.currentLine=15925249;
 //BA.debugLineNum = 15925249;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=15925250;
 //BA.debugLineNum = 15925250;BA.debugLine="recType.Put(strfld,\"INT\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("INT"));
 }
};
RDebugUtils.currentLine=15925252;
 //BA.debugLineNum = 15925252;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=15925253;
 //BA.debugLineNum = 15925253;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _addstrings(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "addstrings", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "addstrings", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=15859712;
 //BA.debugLineNum = 15859712;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoSQLite";
RDebugUtils.currentLine=15859713;
 //BA.debugLineNum = 15859713;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=15859714;
 //BA.debugLineNum = 15859714;BA.debugLine="recType.Put(strfld,\"STRING\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("STRING"));
 }
};
RDebugUtils.currentLine=15859716;
 //BA.debugLineNum = 15859716;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=15859717;
 //BA.debugLineNum = 15859717;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _build(b4j.example.bananosqlite __ref,b4j.example.bananosqlite._sqliteresultset _rslt) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "build", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "build", new Object[] {_rslt}));}
anywheresoftware.b4a.objects.collections.Map _b = null;
RDebugUtils.currentLine=16777216;
 //BA.debugLineNum = 16777216;BA.debugLine="Sub Build(rslt As SQLiteResultSet) As Map";
RDebugUtils.currentLine=16777217;
 //BA.debugLineNum = 16777217;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
RDebugUtils.currentLine=16777218;
 //BA.debugLineNum = 16777218;BA.debugLine="If dbName = \"\" Then";
if ((__ref._dbname /*String*/ ).equals("")) { 
RDebugUtils.currentLine=16777219;
 //BA.debugLineNum = 16777219;BA.debugLine="Log(\"BANanoSQLite.Build: The database name has n";
__c.Log("BANanoSQLite.Build: The database name has not been set!");
RDebugUtils.currentLine=16777220;
 //BA.debugLineNum = 16777220;BA.debugLine="Return b";
if (true) return _b;
 };
RDebugUtils.currentLine=16777222;
 //BA.debugLineNum = 16777222;BA.debugLine="b.Put(\"dbname\", dbName)";
_b.Put((Object)("dbname"),(Object)(__ref._dbname /*String*/ ));
RDebugUtils.currentLine=16777223;
 //BA.debugLineNum = 16777223;BA.debugLine="b.Put(\"command\", rslt.command)";
_b.Put((Object)("command"),(Object)(_rslt.command /*String*/ ));
RDebugUtils.currentLine=16777224;
 //BA.debugLineNum = 16777224;BA.debugLine="b.Put(\"query\", rslt.query)";
_b.Put((Object)("query"),(Object)(_rslt.query /*String*/ ));
RDebugUtils.currentLine=16777225;
 //BA.debugLineNum = 16777225;BA.debugLine="b.Put(\"args\", rslt.args)";
_b.Put((Object)("args"),(Object)(_rslt.args /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=16777226;
 //BA.debugLineNum = 16777226;BA.debugLine="b.Put(\"types\", rslt.types)";
_b.Put((Object)("types"),(Object)(_rslt.types /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=16777227;
 //BA.debugLineNum = 16777227;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=16777228;
 //BA.debugLineNum = 16777228;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.bananosqlite __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
RDebugUtils.currentLine=13697024;
 //BA.debugLineNum = 13697024;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=13697025;
 //BA.debugLineNum = 13697025;BA.debugLine="Public const DB_VARCHAR_20 As String = \"VARCHAR(2";
_db_varchar_20 = "VARCHAR(20)";
RDebugUtils.currentLine=13697026;
 //BA.debugLineNum = 13697026;BA.debugLine="Public const DB_VARCHAR_10 As String = \"VARCHAR(1";
_db_varchar_10 = "VARCHAR(10)";
RDebugUtils.currentLine=13697027;
 //BA.debugLineNum = 13697027;BA.debugLine="Public const DB_VARCHAR_30 As String = \"VARCHAR(3";
_db_varchar_30 = "VARCHAR(30)";
RDebugUtils.currentLine=13697028;
 //BA.debugLineNum = 13697028;BA.debugLine="Public const DB_VARCHAR_40 As String = \"VARCHAR(4";
_db_varchar_40 = "VARCHAR(40)";
RDebugUtils.currentLine=13697029;
 //BA.debugLineNum = 13697029;BA.debugLine="Public const DB_VARCHAR_50 As String = \"VARCHAR(5";
_db_varchar_50 = "VARCHAR(50)";
RDebugUtils.currentLine=13697030;
 //BA.debugLineNum = 13697030;BA.debugLine="Public const DB_VARCHAR_100 As String = \"VARCHAR(";
_db_varchar_100 = "VARCHAR(100)";
RDebugUtils.currentLine=13697031;
 //BA.debugLineNum = 13697031;BA.debugLine="Public const DB_VARCHAR_255 As String = \"VARCHAR(";
_db_varchar_255 = "VARCHAR(255)";
RDebugUtils.currentLine=13697032;
 //BA.debugLineNum = 13697032;BA.debugLine="Public const DB_STRING As String = \"TEXT\"";
_db_string = "TEXT";
RDebugUtils.currentLine=13697033;
 //BA.debugLineNum = 13697033;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
RDebugUtils.currentLine=13697034;
 //BA.debugLineNum = 13697034;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
RDebugUtils.currentLine=13697035;
 //BA.debugLineNum = 13697035;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
RDebugUtils.currentLine=13697036;
 //BA.debugLineNum = 13697036;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
RDebugUtils.currentLine=13697037;
 //BA.debugLineNum = 13697037;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
RDebugUtils.currentLine=13697038;
 //BA.debugLineNum = 13697038;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
RDebugUtils.currentLine=13697039;
 //BA.debugLineNum = 13697039;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
_db_integer = "INTEGER";
RDebugUtils.currentLine=13697040;
 //BA.debugLineNum = 13697040;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
_db_text = "TEXT";
RDebugUtils.currentLine=13697041;
 //BA.debugLineNum = 13697041;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13697042;
 //BA.debugLineNum = 13697042;BA.debugLine="Type SQLiteResultSet(result As List, command As S";
;
RDebugUtils.currentLine=13697044;
 //BA.debugLineNum = 13697044;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=13697045;
 //BA.debugLineNum = 13697045;BA.debugLine="Private dbName As String";
_dbname = "";
RDebugUtils.currentLine=13697046;
 //BA.debugLineNum = 13697046;BA.debugLine="Public MethodName As String";
_methodname = "";
RDebugUtils.currentLine=13697047;
 //BA.debugLineNum = 13697047;BA.debugLine="Private schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=13697048;
 //BA.debugLineNum = 13697048;BA.debugLine="Private OK As Boolean";
_ok = false;
RDebugUtils.currentLine=13697049;
 //BA.debugLineNum = 13697049;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlite._sqliteresultset  _createtable(b4j.example.bananosqlite __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,String _pk,String _auto) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "createtable", new Object[] {_tblname,_tblfields,_pk,_auto}));}
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _query = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=16318464;
 //BA.debugLineNum = 16318464;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
RDebugUtils.currentLine=16318465;
 //BA.debugLineNum = 16318465;BA.debugLine="Dim fldName As String";
_fldname = "";
RDebugUtils.currentLine=16318466;
 //BA.debugLineNum = 16318466;BA.debugLine="Dim fldType As String";
_fldtype = "";
RDebugUtils.currentLine=16318467;
 //BA.debugLineNum = 16318467;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
RDebugUtils.currentLine=16318468;
 //BA.debugLineNum = 16318468;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
RDebugUtils.currentLine=16318469;
 //BA.debugLineNum = 16318469;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=16318470;
 //BA.debugLineNum = 16318470;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16318471;
 //BA.debugLineNum = 16318471;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=16318472;
 //BA.debugLineNum = 16318472;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=16318473;
 //BA.debugLineNum = 16318473;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
RDebugUtils.currentLine=16318474;
 //BA.debugLineNum = 16318474;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
RDebugUtils.currentLine=16318475;
 //BA.debugLineNum = 16318475;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
RDebugUtils.currentLine=16318476;
 //BA.debugLineNum = 16318476;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
_fldtype = _fldtype.replace("STRING","TEXT");
RDebugUtils.currentLine=16318477;
 //BA.debugLineNum = 16318477;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
RDebugUtils.currentLine=16318478;
 //BA.debugLineNum = 16318478;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
RDebugUtils.currentLine=16318480;
 //BA.debugLineNum = 16318480;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(__ref._escapefield /*String*/ (null,_fldname));
RDebugUtils.currentLine=16318481;
 //BA.debugLineNum = 16318481;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
RDebugUtils.currentLine=16318482;
 //BA.debugLineNum = 16318482;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
RDebugUtils.currentLine=16318483;
 //BA.debugLineNum = 16318483;BA.debugLine="Select Case fldType";
switch (BA.switchObjectToInt(_fldtype,"STRING","TEXT")) {
case 0: 
case 1: {
RDebugUtils.currentLine=16318485;
 //BA.debugLineNum = 16318485;BA.debugLine="sb.Append(\" COLLATE NOCASE\")";
_sb.Append(" COLLATE NOCASE");
 break; }
}
;
RDebugUtils.currentLine=16318487;
 //BA.debugLineNum = 16318487;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
RDebugUtils.currentLine=16318488;
 //BA.debugLineNum = 16318488;BA.debugLine="sb.Append(\" PRIMARY KEY\")";
_sb.Append(" PRIMARY KEY");
 };
RDebugUtils.currentLine=16318490;
 //BA.debugLineNum = 16318490;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
if (_fldname.equalsIgnoreCase(_auto)) { 
RDebugUtils.currentLine=16318491;
 //BA.debugLineNum = 16318491;BA.debugLine="sb.Append(\" AUTOINCREMENT\")";
_sb.Append(" AUTOINCREMENT");
 };
 }
};
RDebugUtils.currentLine=16318494;
 //BA.debugLineNum = 16318494;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=16318496;
 //BA.debugLineNum = 16318496;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+__ref._escapefield /*String*/ (null,_tblname)+" "+_sb.ToString();
RDebugUtils.currentLine=16318497;
 //BA.debugLineNum = 16318497;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=16318498;
 //BA.debugLineNum = 16318498;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=16318499;
 //BA.debugLineNum = 16318499;BA.debugLine="gr.query = query";
_gr.query /*String*/  = _query;
RDebugUtils.currentLine=16318500;
 //BA.debugLineNum = 16318500;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=16318501;
 //BA.debugLineNum = 16318501;BA.debugLine="gr.command = \"createtable\"";
_gr.command /*String*/  = "createtable";
RDebugUtils.currentLine=16318502;
 //BA.debugLineNum = 16318502;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=16318503;
 //BA.debugLineNum = 16318503;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=16318504;
 //BA.debugLineNum = 16318504;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=16318505;
 //BA.debugLineNum = 16318505;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=16318506;
 //BA.debugLineNum = 16318506;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=16318507;
 //BA.debugLineNum = 16318507;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=16318508;
 //BA.debugLineNum = 16318508;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=16318509;
 //BA.debugLineNum = 16318509;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(b4j.example.bananosqlite __ref,String _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "escapefield", true))
	 {return ((String) Debug.delegate(ba, "escapefield", new Object[] {_f}));}
RDebugUtils.currentLine=16252928;
 //BA.debugLineNum = 16252928;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=16252929;
 //BA.debugLineNum = 16252929;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
RDebugUtils.currentLine=16252930;
 //BA.debugLineNum = 16252930;BA.debugLine="End Sub";
return "";
}
public String  _cstr(b4j.example.bananosqlite __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "cstr", true))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=16908288;
 //BA.debugLineNum = 16908288;BA.debugLine="Sub CStr(o As Object) As String";
RDebugUtils.currentLine=16908289;
 //BA.debugLineNum = 16908289;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=16908290;
 //BA.debugLineNum = 16908290;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlite._sqliteresultset  _delete(b4j.example.bananosqlite __ref,String _tblname,String _primarykey,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "delete", new Object[] {_tblname,_primarykey,_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananosqlite._sqliteresultset _qry = null;
RDebugUtils.currentLine=15335424;
 //BA.debugLineNum = 15335424;BA.debugLine="Sub Delete(tblName As String, primaryKey As String";
RDebugUtils.currentLine=15335425;
 //BA.debugLineNum = 15335425;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=15335426;
 //BA.debugLineNum = 15335426;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
RDebugUtils.currentLine=15335427;
 //BA.debugLineNum = 15335427;BA.debugLine="Dim qry As SQLiteResultSet = DeleteWhere(tblName,";
_qry = __ref._deletewhere /*b4j.example.bananosqlite._sqliteresultset*/ (null,_tblname,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}));
RDebugUtils.currentLine=15335428;
 //BA.debugLineNum = 15335428;BA.debugLine="Return qry";
if (true) return _qry;
RDebugUtils.currentLine=15335429;
 //BA.debugLineNum = 15335429;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _deletewhere(b4j.example.bananosqlite __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "deletewhere", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "deletewhere", new Object[] {_tblname,_tblwhere,_operators}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=16646144;
 //BA.debugLineNum = 16646144;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
RDebugUtils.currentLine=16646145;
 //BA.debugLineNum = 16646145;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=16646146;
 //BA.debugLineNum = 16646146;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=16646147;
 //BA.debugLineNum = 16646147;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=16646148;
 //BA.debugLineNum = 16646148;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16646149;
 //BA.debugLineNum = 16646149;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=16646150;
 //BA.debugLineNum = 16646150;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE "));
RDebugUtils.currentLine=16646151;
 //BA.debugLineNum = 16646151;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=16646152;
 //BA.debugLineNum = 16646152;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=16646153;
 //BA.debugLineNum = 16646153;BA.debugLine="For i = 0 To iWhere";
{
final int step9 = 1;
final int limit9 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=16646154;
 //BA.debugLineNum = 16646154;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=16646155;
 //BA.debugLineNum = 16646155;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=16646157;
 //BA.debugLineNum = 16646157;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=16646158;
 //BA.debugLineNum = 16646158;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
RDebugUtils.currentLine=16646159;
 //BA.debugLineNum = 16646159;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=16646160;
 //BA.debugLineNum = 16646160;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=16646162;
 //BA.debugLineNum = 16646162;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=16646163;
 //BA.debugLineNum = 16646163;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=16646164;
 //BA.debugLineNum = 16646164;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=16646165;
 //BA.debugLineNum = 16646165;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=16646166;
 //BA.debugLineNum = 16646166;BA.debugLine="gr.command = \"delete\"";
_gr.command /*String*/  = "delete";
RDebugUtils.currentLine=16646167;
 //BA.debugLineNum = 16646167;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=16646168;
 //BA.debugLineNum = 16646168;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=16646169;
 //BA.debugLineNum = 16646169;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=16646170;
 //BA.debugLineNum = 16646170;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=16646171;
 //BA.debugLineNum = 16646171;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=16646172;
 //BA.debugLineNum = 16646172;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=16646174;
 //BA.debugLineNum = 16646174;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=16646175;
 //BA.debugLineNum = 16646175;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _deleteall(b4j.example.bananosqlite __ref,String _tblname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "deleteall", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "deleteall", new Object[] {_tblname}));}
String _sb = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=14811136;
 //BA.debugLineNum = 14811136;BA.debugLine="Sub DeleteAll(tblName As String) As SQLiteResultSe";
RDebugUtils.currentLine=14811137;
 //BA.debugLineNum = 14811137;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+"");
RDebugUtils.currentLine=14811138;
 //BA.debugLineNum = 14811138;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=14811139;
 //BA.debugLineNum = 14811139;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=14811140;
 //BA.debugLineNum = 14811140;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
RDebugUtils.currentLine=14811141;
 //BA.debugLineNum = 14811141;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14811142;
 //BA.debugLineNum = 14811142;BA.debugLine="gr.command = \"delete\"";
_gr.command /*String*/  = "delete";
RDebugUtils.currentLine=14811143;
 //BA.debugLineNum = 14811143;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14811144;
 //BA.debugLineNum = 14811144;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=14811145;
 //BA.debugLineNum = 14811145;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=14811146;
 //BA.debugLineNum = 14811146;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=14811147;
 //BA.debugLineNum = 14811147;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=14811148;
 //BA.debugLineNum = 14811148;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=14811149;
 //BA.debugLineNum = 14811149;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=14811150;
 //BA.debugLineNum = 14811150;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "eqoperators", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "eqoperators", new Object[] {_sm}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
RDebugUtils.currentLine=15532032;
 //BA.debugLineNum = 15532032;BA.debugLine="Sub EQOperators(sm As Map) As List";
RDebugUtils.currentLine=15532033;
 //BA.debugLineNum = 15532033;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15532034;
 //BA.debugLineNum = 15532034;BA.debugLine="nl.initialize";
_nl.Initialize();
RDebugUtils.currentLine=15532035;
 //BA.debugLineNum = 15532035;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=15532036;
 //BA.debugLineNum = 15532036;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
RDebugUtils.currentLine=15532038;
 //BA.debugLineNum = 15532038;BA.debugLine="Return nl";
if (true) return _nl;
RDebugUtils.currentLine=15532039;
 //BA.debugLineNum = 15532039;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "getmaptypes", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmaptypes", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
RDebugUtils.currentLine=15663104;
 //BA.debugLineNum = 15663104;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
RDebugUtils.currentLine=15663105;
 //BA.debugLineNum = 15663105;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15663106;
 //BA.debugLineNum = 15663106;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
RDebugUtils.currentLine=15663107;
 //BA.debugLineNum = 15663107;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=15663108;
 //BA.debugLineNum = 15663108;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=15663109;
 //BA.debugLineNum = 15663109;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=15663110;
 //BA.debugLineNum = 15663110;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=15663111;
 //BA.debugLineNum = 15663111;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
RDebugUtils.currentLine=15663112;
 //BA.debugLineNum = 15663112;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_col),(Object)("STRING")));
RDebugUtils.currentLine=15663113;
 //BA.debugLineNum = 15663113;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR","INTEGER","INT","BOOL","BOOLEAN","BLOB","REAL","FLOAT","DOUBLE")) {
case 0: 
case 1: 
case 2: 
case 3: {
RDebugUtils.currentLine=15663115;
 //BA.debugLineNum = 15663115;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 4: 
case 5: 
case 6: {
RDebugUtils.currentLine=15663117;
 //BA.debugLineNum = 15663117;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
RDebugUtils.currentLine=15663119;
 //BA.debugLineNum = 15663119;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 13: 
case 14: 
case 15: 
case 16: {
RDebugUtils.currentLine=15663121;
 //BA.debugLineNum = 15663121;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 17: {
RDebugUtils.currentLine=15663123;
 //BA.debugLineNum = 15663123;BA.debugLine="listOfTypes.add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
case 18: 
case 19: 
case 20: {
RDebugUtils.currentLine=15663125;
 //BA.debugLineNum = 15663125;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
default: {
RDebugUtils.currentLine=15663127;
 //BA.debugLineNum = 15663127;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
RDebugUtils.currentLine=15663130;
 //BA.debugLineNum = 15663130;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
RDebugUtils.currentLine=15663131;
 //BA.debugLineNum = 15663131;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "getmapvalues", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapvalues", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
RDebugUtils.currentLine=15728640;
 //BA.debugLineNum = 15728640;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
RDebugUtils.currentLine=15728641;
 //BA.debugLineNum = 15728641;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15728642;
 //BA.debugLineNum = 15728642;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=15728643;
 //BA.debugLineNum = 15728643;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=15728644;
 //BA.debugLineNum = 15728644;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=15728645;
 //BA.debugLineNum = 15728645;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=15728646;
 //BA.debugLineNum = 15728646;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=15728647;
 //BA.debugLineNum = 15728647;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
RDebugUtils.currentLine=15728648;
 //BA.debugLineNum = 15728648;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
RDebugUtils.currentLine=15728650;
 //BA.debugLineNum = 15728650;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=15728651;
 //BA.debugLineNum = 15728651;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _droptable(b4j.example.bananosqlite __ref,String _tblname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "droptable", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "droptable", new Object[] {_tblname}));}
String _query = "";
b4j.example.bananosqlite._sqliteresultset _m = null;
RDebugUtils.currentLine=16187392;
 //BA.debugLineNum = 16187392;BA.debugLine="public Sub DropTable(tblName As String) As SQLiteR";
RDebugUtils.currentLine=16187394;
 //BA.debugLineNum = 16187394;BA.debugLine="Dim query As String = \"DROP TABLE \" & EscapeField";
_query = "DROP TABLE "+__ref._escapefield /*String*/ (null,_tblname);
RDebugUtils.currentLine=16187395;
 //BA.debugLineNum = 16187395;BA.debugLine="Dim m As SQLiteResultSet";
_m = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=16187396;
 //BA.debugLineNum = 16187396;BA.debugLine="m.Initialize";
_m.Initialize();
RDebugUtils.currentLine=16187397;
 //BA.debugLineNum = 16187397;BA.debugLine="m.query = query";
_m.query /*String*/  = _query;
RDebugUtils.currentLine=16187398;
 //BA.debugLineNum = 16187398;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=16187399;
 //BA.debugLineNum = 16187399;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=16187400;
 //BA.debugLineNum = 16187400;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
RDebugUtils.currentLine=16187401;
 //BA.debugLineNum = 16187401;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
RDebugUtils.currentLine=16187402;
 //BA.debugLineNum = 16187402;BA.debugLine="m.command = \"droptable\"";
_m.command /*String*/  = "droptable";
RDebugUtils.currentLine=16187403;
 //BA.debugLineNum = 16187403;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=16187404;
 //BA.debugLineNum = 16187404;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
RDebugUtils.currentLine=16187405;
 //BA.debugLineNum = 16187405;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=16187406;
 //BA.debugLineNum = 16187406;BA.debugLine="Return m";
if (true) return _m;
RDebugUtils.currentLine=16187407;
 //BA.debugLineNum = 16187407;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _execute(b4j.example.bananosqlite __ref,String _strsql) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "execute", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "execute", new Object[] {_strsql}));}
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=16711680;
 //BA.debugLineNum = 16711680;BA.debugLine="Sub Execute(strSQL As String) As SQLiteResultSet";
RDebugUtils.currentLine=16711681;
 //BA.debugLineNum = 16711681;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=16711682;
 //BA.debugLineNum = 16711682;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=16711683;
 //BA.debugLineNum = 16711683;BA.debugLine="gr.query = strSQL";
_gr.query /*String*/  = _strsql;
RDebugUtils.currentLine=16711684;
 //BA.debugLineNum = 16711684;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=16711685;
 //BA.debugLineNum = 16711685;BA.debugLine="gr.command = \"execute\"";
_gr.command /*String*/  = "execute";
RDebugUtils.currentLine=16711686;
 //BA.debugLineNum = 16711686;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=16711687;
 //BA.debugLineNum = 16711687;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=16711688;
 //BA.debugLineNum = 16711688;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=16711689;
 //BA.debugLineNum = 16711689;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=16711690;
 //BA.debugLineNum = 16711690;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=16711691;
 //BA.debugLineNum = 16711691;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=16711692;
 //BA.debugLineNum = 16711692;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=16711693;
 //BA.debugLineNum = 16711693;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _exists(b4j.example.bananosqlite __ref,String _tblname,String _primarykey,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "exists", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "exists", new Object[] {_tblname,_primarykey,_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=15400960;
 //BA.debugLineNum = 15400960;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
RDebugUtils.currentLine=15400961;
 //BA.debugLineNum = 15400961;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=15400962;
 //BA.debugLineNum = 15400962;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
RDebugUtils.currentLine=15400963;
 //BA.debugLineNum = 15400963;BA.debugLine="Dim gr As SQLiteResultSet = SelectWhere(tblName,";
_gr = __ref._selectwhere /*b4j.example.bananosqlite._sqliteresultset*/ (null,_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
RDebugUtils.currentLine=15400964;
 //BA.debugLineNum = 15400964;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=15400965;
 //BA.debugLineNum = 15400965;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _selectwhere(b4j.example.bananosqlite __ref,String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "selectwhere", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "selectwhere", new Object[] {_tblname,_tblfields,_tblwhere,_operators,_orderby}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _oper = "";
String _stro = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=15466496;
 //BA.debugLineNum = 15466496;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
RDebugUtils.currentLine=15466497;
 //BA.debugLineNum = 15466497;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=15466498;
 //BA.debugLineNum = 15466498;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=15466499;
 //BA.debugLineNum = 15466499;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=15466501;
 //BA.debugLineNum = 15466501;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=15466502;
 //BA.debugLineNum = 15466502;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=15466503;
 //BA.debugLineNum = 15466503;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=15466505;
 //BA.debugLineNum = 15466505;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=15466507;
 //BA.debugLineNum = 15466507;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=15466509;
 //BA.debugLineNum = 15466509;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=15466510;
 //BA.debugLineNum = 15466510;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=15466511;
 //BA.debugLineNum = 15466511;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE "));
RDebugUtils.currentLine=15466512;
 //BA.debugLineNum = 15466512;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=15466513;
 //BA.debugLineNum = 15466513;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=15466514;
 //BA.debugLineNum = 15466514;BA.debugLine="For i = 0 To iWhere";
{
final int step17 = 1;
final int limit17 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
RDebugUtils.currentLine=15466515;
 //BA.debugLineNum = 15466515;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=15466516;
 //BA.debugLineNum = 15466516;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=15466518;
 //BA.debugLineNum = 15466518;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=15466519;
 //BA.debugLineNum = 15466519;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=15466520;
 //BA.debugLineNum = 15466520;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
RDebugUtils.currentLine=15466521;
 //BA.debugLineNum = 15466521;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 }
};
RDebugUtils.currentLine=15466523;
 //BA.debugLineNum = 15466523;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=15466525;
 //BA.debugLineNum = 15466525;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=15466526;
 //BA.debugLineNum = 15466526;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=15466527;
 //BA.debugLineNum = 15466527;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=15466530;
 //BA.debugLineNum = 15466530;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=15466531;
 //BA.debugLineNum = 15466531;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=15466532;
 //BA.debugLineNum = 15466532;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=15466533;
 //BA.debugLineNum = 15466533;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=15466534;
 //BA.debugLineNum = 15466534;BA.debugLine="gr.command = \"select\"";
_gr.command /*String*/  = "select";
RDebugUtils.currentLine=15466535;
 //BA.debugLineNum = 15466535;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=15466536;
 //BA.debugLineNum = 15466536;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=15466537;
 //BA.debugLineNum = 15466537;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=15466538;
 //BA.debugLineNum = 15466538;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=15466539;
 //BA.debugLineNum = 15466539;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=15466540;
 //BA.debugLineNum = 15466540;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=15466541;
 //BA.debugLineNum = 15466541;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=15466542;
 //BA.debugLineNum = 15466542;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _foreignkeys(b4j.example.bananosqlite __ref,String _tblname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "foreignkeys", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "foreignkeys", new Object[] {_tblname}));}
String _sb = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=14680064;
 //BA.debugLineNum = 14680064;BA.debugLine="Sub ForeignKeys(tblName As String) As SQLiteResult";
RDebugUtils.currentLine=14680065;
 //BA.debugLineNum = 14680065;BA.debugLine="Dim sb As String = $\"PRAGMA foreign_key_list('${t";
_sb = ("PRAGMA foreign_key_list('"+__c.SmartStringFormatter("",(Object)(_tblname))+"')");
RDebugUtils.currentLine=14680066;
 //BA.debugLineNum = 14680066;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=14680067;
 //BA.debugLineNum = 14680067;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=14680068;
 //BA.debugLineNum = 14680068;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
RDebugUtils.currentLine=14680069;
 //BA.debugLineNum = 14680069;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14680070;
 //BA.debugLineNum = 14680070;BA.debugLine="gr.command = \"foreignkeys\"";
_gr.command /*String*/  = "foreignkeys";
RDebugUtils.currentLine=14680071;
 //BA.debugLineNum = 14680071;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14680072;
 //BA.debugLineNum = 14680072;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=14680073;
 //BA.debugLineNum = 14680073;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=14680074;
 //BA.debugLineNum = 14680074;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=14680075;
 //BA.debugLineNum = 14680075;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=14680076;
 //BA.debugLineNum = 14680076;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=14680077;
 //BA.debugLineNum = 14680077;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=14680078;
 //BA.debugLineNum = 14680078;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "getmapkeys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapkeys", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
RDebugUtils.currentLine=15794176;
 //BA.debugLineNum = 15794176;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
RDebugUtils.currentLine=15794177;
 //BA.debugLineNum = 15794177;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15794178;
 //BA.debugLineNum = 15794178;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=15794179;
 //BA.debugLineNum = 15794179;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=15794180;
 //BA.debugLineNum = 15794180;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=15794181;
 //BA.debugLineNum = 15794181;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=15794182;
 //BA.debugLineNum = 15794182;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=15794183;
 //BA.debugLineNum = 15794183;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
RDebugUtils.currentLine=15794184;
 //BA.debugLineNum = 15794184;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
RDebugUtils.currentLine=15794186;
 //BA.debugLineNum = 15794186;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=15794187;
 //BA.debugLineNum = 15794187;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _getmax(b4j.example.bananosqlite __ref,String _tblname,String _fldname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "getmax", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "getmax", new Object[] {_tblname,_fldname}));}
String _sb = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=14876672;
 //BA.debugLineNum = 14876672;BA.debugLine="Sub GetMax(tblName As String, fldName As String) A";
RDebugUtils.currentLine=14876673;
 //BA.debugLineNum = 14876673;BA.debugLine="Dim sb As String = $\"SELECT MAX(${fldName}) As ${";
_sb = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(_fldname))+") As "+__c.SmartStringFormatter("",(Object)(_fldname))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+"");
RDebugUtils.currentLine=14876674;
 //BA.debugLineNum = 14876674;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=14876675;
 //BA.debugLineNum = 14876675;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=14876676;
 //BA.debugLineNum = 14876676;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
RDebugUtils.currentLine=14876677;
 //BA.debugLineNum = 14876677;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14876678;
 //BA.debugLineNum = 14876678;BA.debugLine="gr.command = \"getmax\"";
_gr.command /*String*/  = "getmax";
RDebugUtils.currentLine=14876679;
 //BA.debugLineNum = 14876679;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14876680;
 //BA.debugLineNum = 14876680;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=14876681;
 //BA.debugLineNum = 14876681;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=14876682;
 //BA.debugLineNum = 14876682;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=14876683;
 //BA.debugLineNum = 14876683;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=14876684;
 //BA.debugLineNum = 14876684;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=14876685;
 //BA.debugLineNum = 14876685;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=14876686;
 //BA.debugLineNum = 14876686;BA.debugLine="End Sub";
return null;
}
public String  _getnextid(b4j.example.bananosqlite __ref,String _fld,anywheresoftware.b4a.objects.collections.List _rsl) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "getnextid", true))
	 {return ((String) Debug.delegate(ba, "getnextid", new Object[] {_fld,_rsl}));}
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
RDebugUtils.currentLine=16842752;
 //BA.debugLineNum = 16842752;BA.debugLine="Sub GetNextID(fld As String, rsl As List) As Strin";
RDebugUtils.currentLine=16842753;
 //BA.debugLineNum = 16842753;BA.debugLine="Dim nextid As Int";
_nextid = 0;
RDebugUtils.currentLine=16842754;
 //BA.debugLineNum = 16842754;BA.debugLine="Dim strid As String";
_strid = "";
RDebugUtils.currentLine=16842756;
 //BA.debugLineNum = 16842756;BA.debugLine="If rsl.Size = 0 Then";
if (_rsl.getSize()==0) { 
RDebugUtils.currentLine=16842757;
 //BA.debugLineNum = 16842757;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
RDebugUtils.currentLine=16842759;
 //BA.debugLineNum = 16842759;BA.debugLine="Dim nr As Map = rsl.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rsl.Get((int) (0))));
RDebugUtils.currentLine=16842760;
 //BA.debugLineNum = 16842760;BA.debugLine="Dim ni As String = nr.Getdefault(fld,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_fld),(Object)("0")));
RDebugUtils.currentLine=16842761;
 //BA.debugLineNum = 16842761;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = __ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_ni));
 };
RDebugUtils.currentLine=16842763;
 //BA.debugLineNum = 16842763;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
RDebugUtils.currentLine=16842764;
 //BA.debugLineNum = 16842764;BA.debugLine="strid = CStr(nextid)";
_strid = __ref._cstr /*String*/ (null,(Object)(_nextid));
RDebugUtils.currentLine=16842765;
 //BA.debugLineNum = 16842765;BA.debugLine="Return strid";
if (true) return _strid;
RDebugUtils.currentLine=16842766;
 //BA.debugLineNum = 16842766;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlite  _initialize(b4j.example.bananosqlite __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=13828096;
 //BA.debugLineNum = 13828096;BA.debugLine="Public Sub Initialize As BANanoSQLite";
RDebugUtils.currentLine=13828097;
 //BA.debugLineNum = 13828097;BA.debugLine="recType.Initialize";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=13828098;
 //BA.debugLineNum = 13828098;BA.debugLine="MethodName = \"BANanoSQLite\"";
__ref._methodname /*String*/  = "BANanoSQLite";
RDebugUtils.currentLine=13828099;
 //BA.debugLineNum = 13828099;BA.debugLine="schema.Initialize";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=13828100;
 //BA.debugLineNum = 13828100;BA.debugLine="OK = False";
__ref._ok /*boolean*/  = __c.False;
RDebugUtils.currentLine=13828101;
 //BA.debugLineNum = 13828101;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=13828102;
 //BA.debugLineNum = 13828102;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _insert(b4j.example.bananosqlite __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "insert", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "insert", new Object[] {_tblname,_tblfields}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=16384000;
 //BA.debugLineNum = 16384000;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
RDebugUtils.currentLine=16384001;
 //BA.debugLineNum = 16384001;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16384002;
 //BA.debugLineNum = 16384002;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16384003;
 //BA.debugLineNum = 16384003;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16384004;
 //BA.debugLineNum = 16384004;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=16384005;
 //BA.debugLineNum = 16384005;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=16384006;
 //BA.debugLineNum = 16384006;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=16384007;
 //BA.debugLineNum = 16384007;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=16384008;
 //BA.debugLineNum = 16384008;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=16384009;
 //BA.debugLineNum = 16384009;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=16384010;
 //BA.debugLineNum = 16384010;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=16384011;
 //BA.debugLineNum = 16384011;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" ("));
RDebugUtils.currentLine=16384012;
 //BA.debugLineNum = 16384012;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=16384013;
 //BA.debugLineNum = 16384013;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
RDebugUtils.currentLine=16384014;
 //BA.debugLineNum = 16384014;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
RDebugUtils.currentLine=16384015;
 //BA.debugLineNum = 16384015;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
RDebugUtils.currentLine=16384016;
 //BA.debugLineNum = 16384016;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=16384017;
 //BA.debugLineNum = 16384017;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=16384019;
 //BA.debugLineNum = 16384019;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=16384020;
 //BA.debugLineNum = 16384020;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
RDebugUtils.currentLine=16384022;
 //BA.debugLineNum = 16384022;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
RDebugUtils.currentLine=16384023;
 //BA.debugLineNum = 16384023;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
RDebugUtils.currentLine=16384024;
 //BA.debugLineNum = 16384024;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
RDebugUtils.currentLine=16384025;
 //BA.debugLineNum = 16384025;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=16384026;
 //BA.debugLineNum = 16384026;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=16384027;
 //BA.debugLineNum = 16384027;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=16384028;
 //BA.debugLineNum = 16384028;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=16384029;
 //BA.debugLineNum = 16384029;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=16384030;
 //BA.debugLineNum = 16384030;BA.debugLine="gr.command = \"insert\"";
_gr.command /*String*/  = "insert";
RDebugUtils.currentLine=16384031;
 //BA.debugLineNum = 16384031;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=16384032;
 //BA.debugLineNum = 16384032;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=16384033;
 //BA.debugLineNum = 16384033;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=16384034;
 //BA.debugLineNum = 16384034;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=16384035;
 //BA.debugLineNum = 16384035;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=16384036;
 //BA.debugLineNum = 16384036;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=16384037;
 //BA.debugLineNum = 16384037;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=16384038;
 //BA.debugLineNum = 16384038;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _insertreplace(b4j.example.bananosqlite __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "insertreplace", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "insertreplace", new Object[] {_tblname,_tblfields}));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=16449536;
 //BA.debugLineNum = 16449536;BA.debugLine="Sub InsertReplace(tblName As String, tblFields As";
RDebugUtils.currentLine=16449537;
 //BA.debugLineNum = 16449537;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16449538;
 //BA.debugLineNum = 16449538;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16449539;
 //BA.debugLineNum = 16449539;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16449540;
 //BA.debugLineNum = 16449540;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=16449541;
 //BA.debugLineNum = 16449541;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=16449542;
 //BA.debugLineNum = 16449542;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=16449543;
 //BA.debugLineNum = 16449543;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=16449544;
 //BA.debugLineNum = 16449544;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=16449545;
 //BA.debugLineNum = 16449545;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=16449546;
 //BA.debugLineNum = 16449546;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=16449547;
 //BA.debugLineNum = 16449547;BA.debugLine="sb.Append($\"REPLACE INTO ${EscapeField(tblName)}";
_sb.Append(("REPLACE INTO "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" ("));
RDebugUtils.currentLine=16449548;
 //BA.debugLineNum = 16449548;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=16449549;
 //BA.debugLineNum = 16449549;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
RDebugUtils.currentLine=16449550;
 //BA.debugLineNum = 16449550;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
RDebugUtils.currentLine=16449551;
 //BA.debugLineNum = 16449551;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
RDebugUtils.currentLine=16449552;
 //BA.debugLineNum = 16449552;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=16449553;
 //BA.debugLineNum = 16449553;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=16449555;
 //BA.debugLineNum = 16449555;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=16449556;
 //BA.debugLineNum = 16449556;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
RDebugUtils.currentLine=16449558;
 //BA.debugLineNum = 16449558;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
RDebugUtils.currentLine=16449559;
 //BA.debugLineNum = 16449559;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
RDebugUtils.currentLine=16449560;
 //BA.debugLineNum = 16449560;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
RDebugUtils.currentLine=16449561;
 //BA.debugLineNum = 16449561;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=16449562;
 //BA.debugLineNum = 16449562;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=16449563;
 //BA.debugLineNum = 16449563;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=16449564;
 //BA.debugLineNum = 16449564;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=16449565;
 //BA.debugLineNum = 16449565;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=16449566;
 //BA.debugLineNum = 16449566;BA.debugLine="gr.command = \"replace\"";
_gr.command /*String*/  = "replace";
RDebugUtils.currentLine=16449567;
 //BA.debugLineNum = 16449567;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=16449568;
 //BA.debugLineNum = 16449568;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=16449569;
 //BA.debugLineNum = 16449569;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=16449570;
 //BA.debugLineNum = 16449570;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=16449571;
 //BA.debugLineNum = 16449571;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=16449572;
 //BA.debugLineNum = 16449572;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=16449574;
 //BA.debugLineNum = 16449574;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=16449575;
 //BA.debugLineNum = 16449575;BA.debugLine="End Sub";
return null;
}
public String  _joinfields(b4j.example.bananosqlite __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "joinfields", true))
	 {return ((String) Debug.delegate(ba, "joinfields", new Object[] {_delimiter,_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=16515072;
 //BA.debugLineNum = 16515072;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
RDebugUtils.currentLine=16515073;
 //BA.debugLineNum = 16515073;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=16515074;
 //BA.debugLineNum = 16515074;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16515075;
 //BA.debugLineNum = 16515075;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=16515076;
 //BA.debugLineNum = 16515076;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=16515077;
 //BA.debugLineNum = 16515077;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=16515078;
 //BA.debugLineNum = 16515078;BA.debugLine="fld = EscapeField(fld)";
_fld = __ref._escapefield /*String*/ (null,_fld);
RDebugUtils.currentLine=16515079;
 //BA.debugLineNum = 16515079;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=16515080;
 //BA.debugLineNum = 16515080;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=16515081;
 //BA.debugLineNum = 16515081;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=16515082;
 //BA.debugLineNum = 16515082;BA.debugLine="fld = EscapeField(fld)";
_fld = __ref._escapefield /*String*/ (null,_fld);
RDebugUtils.currentLine=16515083;
 //BA.debugLineNum = 16515083;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
RDebugUtils.currentLine=16515085;
 //BA.debugLineNum = 16515085;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=16515086;
 //BA.debugLineNum = 16515086;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.List  _json2list(b4j.example.bananosqlite __ref,String _strvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "json2list", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "json2list", new Object[] {_strvalue}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
com.ab.banano.BANanoJSONParser _parser = null;
RDebugUtils.currentLine=15138816;
 //BA.debugLineNum = 15138816;BA.debugLine="Sub Json2List(strValue As String) As List";
RDebugUtils.currentLine=15138817;
 //BA.debugLineNum = 15138817;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=15138818;
 //BA.debugLineNum = 15138818;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=15138819;
 //BA.debugLineNum = 15138819;BA.debugLine="lst.clear";
_lst.Clear();
RDebugUtils.currentLine=15138820;
 //BA.debugLineNum = 15138820;BA.debugLine="If strValue.Length = 0 Then";
if (_strvalue.length()==0) { 
RDebugUtils.currentLine=15138821;
 //BA.debugLineNum = 15138821;BA.debugLine="Return lst";
if (true) return _lst;
 };
RDebugUtils.currentLine=15138823;
 //BA.debugLineNum = 15138823;BA.debugLine="Try";
try {RDebugUtils.currentLine=15138824;
 //BA.debugLineNum = 15138824;BA.debugLine="Dim parser As BANanoJSONParser";
_parser = new com.ab.banano.BANanoJSONParser();
RDebugUtils.currentLine=15138825;
 //BA.debugLineNum = 15138825;BA.debugLine="parser.Initialize(strValue)";
_parser.Initialize(_strvalue);
RDebugUtils.currentLine=15138826;
 //BA.debugLineNum = 15138826;BA.debugLine="Return parser.NextArray";
if (true) return _parser.NextArray();
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=15138828;
 //BA.debugLineNum = 15138828;BA.debugLine="Return lst";
if (true) return _lst;
 };
RDebugUtils.currentLine=15138830;
 //BA.debugLineNum = 15138830;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(b4j.example.bananosqlite __ref,String _strjson) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "json2map", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "json2map", new Object[] {_strjson}));}
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
RDebugUtils.currentLine=15073280;
 //BA.debugLineNum = 15073280;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
RDebugUtils.currentLine=15073281;
 //BA.debugLineNum = 15073281;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
RDebugUtils.currentLine=15073282;
 //BA.debugLineNum = 15073282;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=15073283;
 //BA.debugLineNum = 15073283;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=15073284;
 //BA.debugLineNum = 15073284;BA.debugLine="Map1.clear";
_map1.Clear();
RDebugUtils.currentLine=15073285;
 //BA.debugLineNum = 15073285;BA.debugLine="Try";
try {RDebugUtils.currentLine=15073286;
 //BA.debugLineNum = 15073286;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
RDebugUtils.currentLine=15073287;
 //BA.debugLineNum = 15073287;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
RDebugUtils.currentLine=15073288;
 //BA.debugLineNum = 15073288;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
RDebugUtils.currentLine=15073290;
 //BA.debugLineNum = 15073290;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=15073292;
 //BA.debugLineNum = 15073292;BA.debugLine="Return Map1";
if (true) return _map1;
 };
RDebugUtils.currentLine=15073294;
 //BA.debugLineNum = 15073294;BA.debugLine="End Sub";
return null;
}
public String  _jsontoresultset(b4j.example.bananosqlite __ref,b4j.example.bananosqlite._sqliteresultset _rs) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "jsontoresultset", true))
	 {return ((String) Debug.delegate(ba, "jsontoresultset", new Object[] {_rs}));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=14024704;
 //BA.debugLineNum = 14024704;BA.debugLine="Sub JSONToResultSet(rs As SQLiteResultSet)";
RDebugUtils.currentLine=14024705;
 //BA.debugLineNum = 14024705;BA.debugLine="OK = False";
__ref._ok /*boolean*/  = __c.False;
RDebugUtils.currentLine=14024706;
 //BA.debugLineNum = 14024706;BA.debugLine="Dim m As Map = BANano.FromJson(rs.json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._banano /*com.ab.banano.BANano*/ .FromJson((Object)(_rs.json /*String*/ ))));
RDebugUtils.currentLine=14024707;
 //BA.debugLineNum = 14024707;BA.debugLine="rs.response = m.Get(\"response\")";
_rs.response /*String*/  = BA.ObjectToString(_m.Get((Object)("response")));
RDebugUtils.currentLine=14024708;
 //BA.debugLineNum = 14024708;BA.debugLine="rs.error = m.Get(\"error\")";
_rs.error /*String*/  = BA.ObjectToString(_m.Get((Object)("error")));
RDebugUtils.currentLine=14024709;
 //BA.debugLineNum = 14024709;BA.debugLine="rs.result = m.Get(\"result\")";
_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(_m.Get((Object)("result"))));
RDebugUtils.currentLine=14024710;
 //BA.debugLineNum = 14024710;BA.debugLine="rs.affectedRows = m.Get(\"affectedRows\")";
_rs.affectedRows /*long*/  = BA.ObjectToLongNumber(_m.Get((Object)("affectedRows")));
RDebugUtils.currentLine=14024711;
 //BA.debugLineNum = 14024711;BA.debugLine="If rs.response = \"Success\" And rs.affectedRows >=";
if ((_rs.response /*String*/ ).equals("Success") && _rs.affectedRows /*long*/ >=1) { 
RDebugUtils.currentLine=14024712;
 //BA.debugLineNum = 14024712;BA.debugLine="OK = True";
__ref._ok /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=14024714;
 //BA.debugLineNum = 14024714;BA.debugLine="End Sub";
return "";
}
public String  _list2json(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _mp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "list2json", true))
	 {return ((String) Debug.delegate(ba, "list2json", new Object[] {_mp}));}
com.ab.banano.BANanoJSONGenerator _json = null;
RDebugUtils.currentLine=15007744;
 //BA.debugLineNum = 15007744;BA.debugLine="Sub List2Json(mp As List) As String";
RDebugUtils.currentLine=15007745;
 //BA.debugLineNum = 15007745;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
RDebugUtils.currentLine=15007746;
 //BA.debugLineNum = 15007746;BA.debugLine="JSON.Initialize2(mp)";
_json.Initialize2(_mp);
RDebugUtils.currentLine=15007747;
 //BA.debugLineNum = 15007747;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
RDebugUtils.currentLine=15007748;
 //BA.debugLineNum = 15007748;BA.debugLine="End Sub";
return "";
}
public String  _map2json(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "map2json", true))
	 {return ((String) Debug.delegate(ba, "map2json", new Object[] {_mp}));}
com.ab.banano.BANanoJSONGenerator _json = null;
RDebugUtils.currentLine=14942208;
 //BA.debugLineNum = 14942208;BA.debugLine="Sub Map2Json(mp As Map) As String";
RDebugUtils.currentLine=14942209;
 //BA.debugLineNum = 14942209;BA.debugLine="Dim JSON As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
RDebugUtils.currentLine=14942210;
 //BA.debugLineNum = 14942210;BA.debugLine="JSON.Initialize(mp)";
_json.Initialize(_mp);
RDebugUtils.currentLine=14942211;
 //BA.debugLineNum = 14942211;BA.debugLine="Return JSON.ToString";
if (true) return _json.ToString();
RDebugUtils.currentLine=14942212;
 //BA.debugLineNum = 14942212;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananosqlite._sqliteresultset  _pragma(b4j.example.bananosqlite __ref,String _tblname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "pragma", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "pragma", new Object[] {_tblname}));}
String _sb = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=14614528;
 //BA.debugLineNum = 14614528;BA.debugLine="Sub Pragma(tblName As String) As SQLiteResultSet";
RDebugUtils.currentLine=14614529;
 //BA.debugLineNum = 14614529;BA.debugLine="Dim sb As String = $\"PRAGMA table_info('${tblName";
_sb = ("PRAGMA table_info('"+__c.SmartStringFormatter("",(Object)(_tblname))+"')");
RDebugUtils.currentLine=14614530;
 //BA.debugLineNum = 14614530;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=14614531;
 //BA.debugLineNum = 14614531;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=14614532;
 //BA.debugLineNum = 14614532;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
RDebugUtils.currentLine=14614533;
 //BA.debugLineNum = 14614533;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14614534;
 //BA.debugLineNum = 14614534;BA.debugLine="gr.command = \"pragma\"";
_gr.command /*String*/  = "pragma";
RDebugUtils.currentLine=14614535;
 //BA.debugLineNum = 14614535;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14614536;
 //BA.debugLineNum = 14614536;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=14614537;
 //BA.debugLineNum = 14614537;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=14614538;
 //BA.debugLineNum = 14614538;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=14614539;
 //BA.debugLineNum = 14614539;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=14614540;
 //BA.debugLineNum = 14614540;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=14614541;
 //BA.debugLineNum = 14614541;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=14614542;
 //BA.debugLineNum = 14614542;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _read(b4j.example.bananosqlite __ref,String _tblname,String _primarykey,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "read", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "read", new Object[] {_tblname,_primarykey,_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=15269888;
 //BA.debugLineNum = 15269888;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
RDebugUtils.currentLine=15269889;
 //BA.debugLineNum = 15269889;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=15269890;
 //BA.debugLineNum = 15269890;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
RDebugUtils.currentLine=15269891;
 //BA.debugLineNum = 15269891;BA.debugLine="Dim gr As SQLiteResultSet = SelectWhere(tblName,";
_gr = __ref._selectwhere /*b4j.example.bananosqlite._sqliteresultset*/ (null,_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
RDebugUtils.currentLine=15269892;
 //BA.debugLineNum = 15269892;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=15269893;
 //BA.debugLineNum = 15269893;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _resettypes(b4j.example.bananosqlite __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "resettypes", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "resettypes", null));}
RDebugUtils.currentLine=14548992;
 //BA.debugLineNum = 14548992;BA.debugLine="Sub ResetTypes As BANanoSQLite";
RDebugUtils.currentLine=14548993;
 //BA.debugLineNum = 14548993;BA.debugLine="recType.Initialize";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=14548994;
 //BA.debugLineNum = 14548994;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=14548995;
 //BA.debugLineNum = 14548995;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _schemaaddblob(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "schemaaddblob", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "schemaaddblob", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=14286848;
 //BA.debugLineNum = 14286848;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoSQLite";
RDebugUtils.currentLine=14286849;
 //BA.debugLineNum = 14286849;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=14286850;
 //BA.debugLineNum = 14286850;BA.debugLine="schema.Put(b, DB_BLOB)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_blob /*String*/ ));
 }
};
RDebugUtils.currentLine=14286852;
 //BA.debugLineNum = 14286852;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=14286853;
 //BA.debugLineNum = 14286853;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _schemaaddboolean(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "schemaaddboolean", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "schemaaddboolean", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=14090240;
 //BA.debugLineNum = 14090240;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoSQLit";
RDebugUtils.currentLine=14090241;
 //BA.debugLineNum = 14090241;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=14090242;
 //BA.debugLineNum = 14090242;BA.debugLine="schema.Put(b, DB_BOOL)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_bool /*String*/ ));
 }
};
RDebugUtils.currentLine=14090244;
 //BA.debugLineNum = 14090244;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=14090245;
 //BA.debugLineNum = 14090245;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _schemaadddate(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "schemaadddate", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "schemaadddate", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=14483456;
 //BA.debugLineNum = 14483456;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoSQLite";
RDebugUtils.currentLine=14483457;
 //BA.debugLineNum = 14483457;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=14483458;
 //BA.debugLineNum = 14483458;BA.debugLine="schema.Put(b, DB_DATE)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_date /*String*/ ));
 }
};
RDebugUtils.currentLine=14483460;
 //BA.debugLineNum = 14483460;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=14483461;
 //BA.debugLineNum = 14483461;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _schemaaddfloat(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "schemaaddfloat", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "schemaaddfloat", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=14221312;
 //BA.debugLineNum = 14221312;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoSQLite";
RDebugUtils.currentLine=14221313;
 //BA.debugLineNum = 14221313;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=14221314;
 //BA.debugLineNum = 14221314;BA.debugLine="schema.Put(b, DB_FLOAT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_float /*String*/ ));
 }
};
RDebugUtils.currentLine=14221316;
 //BA.debugLineNum = 14221316;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=14221317;
 //BA.debugLineNum = 14221317;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _schemaaddint(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "schemaaddint", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "schemaaddint", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=14155776;
 //BA.debugLineNum = 14155776;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoSQLite";
RDebugUtils.currentLine=14155777;
 //BA.debugLineNum = 14155777;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=14155778;
 //BA.debugLineNum = 14155778;BA.debugLine="schema.Put(b, DB_INT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_int /*String*/ ));
 }
};
RDebugUtils.currentLine=14155780;
 //BA.debugLineNum = 14155780;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=14155781;
 //BA.debugLineNum = 14155781;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _schemaaddtext(b4j.example.bananosqlite __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "schemaaddtext", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "schemaaddtext", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=14352384;
 //BA.debugLineNum = 14352384;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoSQLite";
RDebugUtils.currentLine=14352385;
 //BA.debugLineNum = 14352385;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=14352386;
 //BA.debugLineNum = 14352386;BA.debugLine="schema.Put(b, DB_TEXT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_text /*String*/ ));
 }
};
RDebugUtils.currentLine=14352388;
 //BA.debugLineNum = 14352388;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=14352389;
 //BA.debugLineNum = 14352389;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _schemaclear(b4j.example.bananosqlite __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "schemaclear", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "schemaclear", null));}
RDebugUtils.currentLine=13959168;
 //BA.debugLineNum = 13959168;BA.debugLine="Sub SchemaClear As BANanoSQLite";
RDebugUtils.currentLine=13959169;
 //BA.debugLineNum = 13959169;BA.debugLine="schema.clear";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=13959170;
 //BA.debugLineNum = 13959170;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=13959171;
 //BA.debugLineNum = 13959171;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _schemacreatetable(b4j.example.bananosqlite __ref,String _tblname,String _pk,String _auto) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "schemacreatetable", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "schemacreatetable", new Object[] {_tblname,_pk,_auto}));}
RDebugUtils.currentLine=14417920;
 //BA.debugLineNum = 14417920;BA.debugLine="Sub SchemaCreateTable(tblName As String, PK As Str";
RDebugUtils.currentLine=14417921;
 //BA.debugLineNum = 14417921;BA.debugLine="Return CreateTable(tblName, schema, PK, Auto)";
if (true) return __ref._createtable /*b4j.example.bananosqlite._sqliteresultset*/ (null,_tblname,__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ ,_pk,_auto);
RDebugUtils.currentLine=14417922;
 //BA.debugLineNum = 14417922;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _selectall(b4j.example.bananosqlite __ref,String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "selectall", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "selectall", new Object[] {_tblname,_tblfields,_orderby}));}
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=16580608;
 //BA.debugLineNum = 16580608;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
RDebugUtils.currentLine=16580610;
 //BA.debugLineNum = 16580610;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=16580611;
 //BA.debugLineNum = 16580611;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=16580612;
 //BA.debugLineNum = 16580612;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=16580614;
 //BA.debugLineNum = 16580614;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=16580616;
 //BA.debugLineNum = 16580616;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=16580618;
 //BA.debugLineNum = 16580618;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=16580619;
 //BA.debugLineNum = 16580619;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=16580620;
 //BA.debugLineNum = 16580620;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+""));
RDebugUtils.currentLine=16580621;
 //BA.debugLineNum = 16580621;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=16580623;
 //BA.debugLineNum = 16580623;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=16580624;
 //BA.debugLineNum = 16580624;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=16580625;
 //BA.debugLineNum = 16580625;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=16580628;
 //BA.debugLineNum = 16580628;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=16580629;
 //BA.debugLineNum = 16580629;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=16580630;
 //BA.debugLineNum = 16580630;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=16580631;
 //BA.debugLineNum = 16580631;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=16580632;
 //BA.debugLineNum = 16580632;BA.debugLine="gr.command = \"select\"";
_gr.command /*String*/  = "select";
RDebugUtils.currentLine=16580633;
 //BA.debugLineNum = 16580633;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=16580634;
 //BA.debugLineNum = 16580634;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=16580635;
 //BA.debugLineNum = 16580635;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=16580636;
 //BA.debugLineNum = 16580636;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=16580637;
 //BA.debugLineNum = 16580637;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=16580638;
 //BA.debugLineNum = 16580638;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=16580640;
 //BA.debugLineNum = 16580640;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=16580641;
 //BA.debugLineNum = 16580641;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite  _setdb(b4j.example.bananosqlite __ref,String _db) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "setdb", true))
	 {return ((b4j.example.bananosqlite) Debug.delegate(ba, "setdb", new Object[] {_db}));}
RDebugUtils.currentLine=13893632;
 //BA.debugLineNum = 13893632;BA.debugLine="Sub SetDB(db As String) As BANanoSQLite";
RDebugUtils.currentLine=13893633;
 //BA.debugLineNum = 13893633;BA.debugLine="dbName = db";
__ref._dbname /*String*/  = _db;
RDebugUtils.currentLine=13893634;
 //BA.debugLineNum = 13893634;BA.debugLine="Return Me";
if (true) return (b4j.example.bananosqlite)(this);
RDebugUtils.currentLine=13893635;
 //BA.debugLineNum = 13893635;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _tablenames(b4j.example.bananosqlite __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "tablenames", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "tablenames", null));}
String _sb = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=14745600;
 //BA.debugLineNum = 14745600;BA.debugLine="Sub TableNames() As SQLiteResultSet";
RDebugUtils.currentLine=14745601;
 //BA.debugLineNum = 14745601;BA.debugLine="Dim sb As String = $\"SELECT name FROM sqlite_mast";
_sb = ("SELECT name FROM sqlite_master WHERE type ='table' AND name NOT LIKE 'sqlite_%'");
RDebugUtils.currentLine=14745602;
 //BA.debugLineNum = 14745602;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=14745603;
 //BA.debugLineNum = 14745603;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=14745604;
 //BA.debugLineNum = 14745604;BA.debugLine="gr.query = sb";
_gr.query /*String*/  = _sb;
RDebugUtils.currentLine=14745605;
 //BA.debugLineNum = 14745605;BA.debugLine="gr.args = Null";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14745606;
 //BA.debugLineNum = 14745606;BA.debugLine="gr.command = \"tables\"";
_gr.command /*String*/  = "tables";
RDebugUtils.currentLine=14745607;
 //BA.debugLineNum = 14745607;BA.debugLine="gr.types = Null";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=14745608;
 //BA.debugLineNum = 14745608;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=14745609;
 //BA.debugLineNum = 14745609;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=14745610;
 //BA.debugLineNum = 14745610;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=14745611;
 //BA.debugLineNum = 14745611;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=14745612;
 //BA.debugLineNum = 14745612;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=14745613;
 //BA.debugLineNum = 14745613;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=14745614;
 //BA.debugLineNum = 14745614;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _update(b4j.example.bananosqlite __ref,String _tblname,String _prikey,String _privalue,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "update", new Object[] {_tblname,_prikey,_privalue,_tblfields}));}
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
RDebugUtils.currentLine=13762560;
 //BA.debugLineNum = 13762560;BA.debugLine="Sub Update(tblName As String, priKey As String, pr";
RDebugUtils.currentLine=13762561;
 //BA.debugLineNum = 13762561;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
RDebugUtils.currentLine=13762562;
 //BA.debugLineNum = 13762562;BA.debugLine="tblWhere.Put(priKey, priValue)";
_tblwhere.Put((Object)(_prikey),(Object)(_privalue));
RDebugUtils.currentLine=13762563;
 //BA.debugLineNum = 13762563;BA.debugLine="Return UpdateWhere(tblName, tblfields, tblWhere,";
if (true) return __ref._updatewhere /*b4j.example.bananosqlite._sqliteresultset*/ (null,_tblname,_tblfields,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=13762564;
 //BA.debugLineNum = 13762564;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _updatewhere(b4j.example.bananosqlite __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "updatewhere", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "updatewhere", new Object[] {_tblname,_tblfields,_tblwhere,_operators}));}
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
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=15597568;
 //BA.debugLineNum = 15597568;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
RDebugUtils.currentLine=15597569;
 //BA.debugLineNum = 15597569;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=15597570;
 //BA.debugLineNum = 15597570;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=15597571;
 //BA.debugLineNum = 15597571;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=15597572;
 //BA.debugLineNum = 15597572;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
RDebugUtils.currentLine=15597573;
 //BA.debugLineNum = 15597573;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=15597574;
 //BA.debugLineNum = 15597574;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=15597575;
 //BA.debugLineNum = 15597575;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
RDebugUtils.currentLine=15597576;
 //BA.debugLineNum = 15597576;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=15597577;
 //BA.debugLineNum = 15597577;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=15597578;
 //BA.debugLineNum = 15597578;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" SET "));
RDebugUtils.currentLine=15597579;
 //BA.debugLineNum = 15597579;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=15597580;
 //BA.debugLineNum = 15597580;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=15597581;
 //BA.debugLineNum = 15597581;BA.debugLine="For i = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
RDebugUtils.currentLine=15597582;
 //BA.debugLineNum = 15597582;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
RDebugUtils.currentLine=15597583;
 //BA.debugLineNum = 15597583;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=15597584;
 //BA.debugLineNum = 15597584;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
RDebugUtils.currentLine=15597585;
 //BA.debugLineNum = 15597585;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
RDebugUtils.currentLine=15597587;
 //BA.debugLineNum = 15597587;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
RDebugUtils.currentLine=15597590;
 //BA.debugLineNum = 15597590;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
RDebugUtils.currentLine=15597591;
 //BA.debugLineNum = 15597591;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=15597592;
 //BA.debugLineNum = 15597592;BA.debugLine="For i = 0 To iWhere";
{
final int step24 = 1;
final int limit24 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
RDebugUtils.currentLine=15597593;
 //BA.debugLineNum = 15597593;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=15597594;
 //BA.debugLineNum = 15597594;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=15597596;
 //BA.debugLineNum = 15597596;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=15597597;
 //BA.debugLineNum = 15597597;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=15597598;
 //BA.debugLineNum = 15597598;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=15597599;
 //BA.debugLineNum = 15597599;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=15597601;
 //BA.debugLineNum = 15597601;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=15597602;
 //BA.debugLineNum = 15597602;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=15597603;
 //BA.debugLineNum = 15597603;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=15597604;
 //BA.debugLineNum = 15597604;BA.debugLine="gr.args = listOfValues";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=15597605;
 //BA.debugLineNum = 15597605;BA.debugLine="gr.command = \"update\"";
_gr.command /*String*/  = "update";
RDebugUtils.currentLine=15597606;
 //BA.debugLineNum = 15597606;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=15597607;
 //BA.debugLineNum = 15597607;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=15597608;
 //BA.debugLineNum = 15597608;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=15597609;
 //BA.debugLineNum = 15597609;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=15597610;
 //BA.debugLineNum = 15597610;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=15597611;
 //BA.debugLineNum = 15597611;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=15597612;
 //BA.debugLineNum = 15597612;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=15597613;
 //BA.debugLineNum = 15597613;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananosqlite._sqliteresultset  _updateall(b4j.example.bananosqlite __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananosqlite";
if (Debug.shouldDelegate(ba, "updateall", true))
	 {return ((b4j.example.bananosqlite._sqliteresultset) Debug.delegate(ba, "updateall", new Object[] {_tblname,_tblfields,_operators}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _args = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
String _oper = "";
b4j.example.bananosqlite._sqliteresultset _gr = null;
RDebugUtils.currentLine=15204352;
 //BA.debugLineNum = 15204352;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map,";
RDebugUtils.currentLine=15204353;
 //BA.debugLineNum = 15204353;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);};
RDebugUtils.currentLine=15204354;
 //BA.debugLineNum = 15204354;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=15204355;
 //BA.debugLineNum = 15204355;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=15204356;
 //BA.debugLineNum = 15204356;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=15204357;
 //BA.debugLineNum = 15204357;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=15204358;
 //BA.debugLineNum = 15204358;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" SET "));
RDebugUtils.currentLine=15204359;
 //BA.debugLineNum = 15204359;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=15204360;
 //BA.debugLineNum = 15204360;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=15204361;
 //BA.debugLineNum = 15204361;BA.debugLine="For i = 0 To iTot";
{
final int step9 = 1;
final int limit9 = _itot;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=15204362;
 //BA.debugLineNum = 15204362;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
RDebugUtils.currentLine=15204363;
 //BA.debugLineNum = 15204363;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=15204364;
 //BA.debugLineNum = 15204364;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
RDebugUtils.currentLine=15204365;
 //BA.debugLineNum = 15204365;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
RDebugUtils.currentLine=15204366;
 //BA.debugLineNum = 15204366;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
RDebugUtils.currentLine=15204368;
 //BA.debugLineNum = 15204368;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 };
 }
};
RDebugUtils.currentLine=15204371;
 //BA.debugLineNum = 15204371;BA.debugLine="Dim gr As SQLiteResultSet";
_gr = new b4j.example.bananosqlite._sqliteresultset();
RDebugUtils.currentLine=15204372;
 //BA.debugLineNum = 15204372;BA.debugLine="gr.Initialize";
_gr.Initialize();
RDebugUtils.currentLine=15204373;
 //BA.debugLineNum = 15204373;BA.debugLine="gr.query = sb.tostring";
_gr.query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=15204374;
 //BA.debugLineNum = 15204374;BA.debugLine="gr.args = args";
_gr.args /*anywheresoftware.b4a.objects.collections.List*/  = _args;
RDebugUtils.currentLine=15204375;
 //BA.debugLineNum = 15204375;BA.debugLine="gr.command = \"update\"";
_gr.command /*String*/  = "update";
RDebugUtils.currentLine=15204376;
 //BA.debugLineNum = 15204376;BA.debugLine="gr.types = listOfTypes";
_gr.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=15204377;
 //BA.debugLineNum = 15204377;BA.debugLine="gr.response = \"\"";
_gr.response /*String*/  = "";
RDebugUtils.currentLine=15204378;
 //BA.debugLineNum = 15204378;BA.debugLine="gr.error = \"\"";
_gr.error /*String*/  = "";
RDebugUtils.currentLine=15204379;
 //BA.debugLineNum = 15204379;BA.debugLine="gr.result = Array()";
_gr.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
RDebugUtils.currentLine=15204380;
 //BA.debugLineNum = 15204380;BA.debugLine="gr.json = \"\"";
_gr.json /*String*/  = "";
RDebugUtils.currentLine=15204381;
 //BA.debugLineNum = 15204381;BA.debugLine="gr.affectedRows = 0";
_gr.affectedRows /*long*/  = (long) (0);
RDebugUtils.currentLine=15204382;
 //BA.debugLineNum = 15204382;BA.debugLine="Return gr";
if (true) return _gr;
RDebugUtils.currentLine=15204383;
 //BA.debugLineNum = 15204383;BA.debugLine="End Sub";
return null;
}
}