package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananomssql extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.bananomssql", this);
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
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
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
public b4j.example.bananomssql  _addblobs(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 243;BA.debugLine="Sub AddBlobs(fieldNames As List) As BANanoMSSQL";
 //BA.debugLineNum = 244;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 245;BA.debugLine="recType.Put(strfld,\"BLOB\")";
_rectype.Put((Object)(_strfld),(Object)("BLOB"));
 }
};
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _addbooleans(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 251;BA.debugLine="Sub AddBooleans(fieldNames As List) As BANanoMSSQL";
 //BA.debugLineNum = 252;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 253;BA.debugLine="recType.Put(strfld,\"BOOL\")";
_rectype.Put((Object)(_strfld),(Object)("BOOL"));
 }
};
 //BA.debugLineNum = 255;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 256;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _adddoubles(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 235;BA.debugLine="Sub AddDoubles(fieldNames As List) As BANanoMSSQL";
 //BA.debugLineNum = 236;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 237;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
_rectype.Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
 //BA.debugLineNum = 239;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 240;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _addintegers(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 227;BA.debugLine="Sub AddIntegers(fieldNames As List) As BANanoMSSQL";
 //BA.debugLineNum = 228;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 229;BA.debugLine="recType.Put(strfld,\"INT\")";
_rectype.Put((Object)(_strfld),(Object)("INT"));
 }
};
 //BA.debugLineNum = 231;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 232;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _addstrings(anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
String _strfld = "";
 //BA.debugLineNum = 219;BA.debugLine="Sub AddStrings(fieldNames As List) As BANanoMSSQL";
 //BA.debugLineNum = 220;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 221;BA.debugLine="recType.Put(strfld,\"STRING\")";
_rectype.Put((Object)(_strfld),(Object)("STRING"));
 }
};
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _build(b4j.example.bananomssql._mssqlresultset _rslt) throws Exception{
anywheresoftware.b4a.objects.collections.Map _b = null;
 //BA.debugLineNum = 571;BA.debugLine="Sub Build(rslt As MSSQLResultSet) As Map";
 //BA.debugLineNum = 572;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
 //BA.debugLineNum = 573;BA.debugLine="b.Put(\"command\", rslt.command)";
_b.Put((Object)("command"),(Object)(_rslt.command /*String*/ ));
 //BA.debugLineNum = 574;BA.debugLine="b.Put(\"query\", rslt.query)";
_b.Put((Object)("query"),(Object)(_rslt.query /*String*/ ));
 //BA.debugLineNum = 575;BA.debugLine="b.Put(\"args\", rslt.args)";
_b.Put((Object)("args"),(Object)(_rslt.args /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 //BA.debugLineNum = 576;BA.debugLine="b.Put(\"types\", rslt.types)";
_b.Put((Object)("types"),(Object)(_rslt.types /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 //BA.debugLineNum = 577;BA.debugLine="Return b";
if (true) return _b;
 //BA.debugLineNum = 578;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Public const DB_VARCHAR_20 As String = \"VARCHAR(2";
_db_varchar_20 = "VARCHAR(20)";
 //BA.debugLineNum = 5;BA.debugLine="Public const DB_VARCHAR_10 As String = \"VARCHAR(1";
_db_varchar_10 = "VARCHAR(10)";
 //BA.debugLineNum = 6;BA.debugLine="Public const DB_VARCHAR_30 As String = \"VARCHAR(3";
_db_varchar_30 = "VARCHAR(30)";
 //BA.debugLineNum = 7;BA.debugLine="Public const DB_VARCHAR_40 As String = \"VARCHAR(4";
_db_varchar_40 = "VARCHAR(40)";
 //BA.debugLineNum = 8;BA.debugLine="Public const DB_VARCHAR_50 As String = \"VARCHAR(5";
_db_varchar_50 = "VARCHAR(50)";
 //BA.debugLineNum = 9;BA.debugLine="Public const DB_VARCHAR_100 As String = \"VARCHAR(";
_db_varchar_100 = "VARCHAR(100)";
 //BA.debugLineNum = 10;BA.debugLine="Public const DB_VARCHAR_255 As String = \"VARCHAR(";
_db_varchar_255 = "VARCHAR(255)";
 //BA.debugLineNum = 11;BA.debugLine="Public const DB_STRING As String = \"TEXT\"";
_db_string = "TEXT";
 //BA.debugLineNum = 12;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
 //BA.debugLineNum = 13;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
 //BA.debugLineNum = 14;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
 //BA.debugLineNum = 15;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
 //BA.debugLineNum = 16;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
 //BA.debugLineNum = 17;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
 //BA.debugLineNum = 18;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
_db_integer = "INTEGER";
 //BA.debugLineNum = 19;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
_db_text = "TEXT";
 //BA.debugLineNum = 20;BA.debugLine="Type MSSQLResultSet(result As List, command As St";
;
 //BA.debugLineNum = 22;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 23;BA.debugLine="Public MethodName As String";
_methodname = "";
 //BA.debugLineNum = 24;BA.debugLine="Private Schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssql._mssqlresultset  _createtable(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,String _pk,String _auto) throws Exception{
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _query = "";
b4j.example.bananomssql._mssqlresultset _m = null;
 //BA.debugLineNum = 98;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
 //BA.debugLineNum = 99;BA.debugLine="Dim fldName As String";
_fldname = "";
 //BA.debugLineNum = 100;BA.debugLine="Dim fldType As String";
_fldtype = "";
 //BA.debugLineNum = 101;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
 //BA.debugLineNum = 102;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
 //BA.debugLineNum = 103;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 104;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 105;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 106;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
 //BA.debugLineNum = 107;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
 //BA.debugLineNum = 108;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
 //BA.debugLineNum = 109;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
 //BA.debugLineNum = 110;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
_fldtype = _fldtype.replace("STRING","TEXT");
 //BA.debugLineNum = 111;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
 //BA.debugLineNum = 112;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
 //BA.debugLineNum = 114;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(_escapefield(_fldname));
 //BA.debugLineNum = 115;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
 //BA.debugLineNum = 116;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
 //BA.debugLineNum = 117;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
 //BA.debugLineNum = 118;BA.debugLine="sb.Append(\" NOT NULL PRIMARY KEY\")";
_sb.Append(" NOT NULL PRIMARY KEY");
 };
 //BA.debugLineNum = 120;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
if (_fldname.equalsIgnoreCase(_auto)) { 
 //BA.debugLineNum = 121;BA.debugLine="sb.Append(\" AUTO_INCREMENT\")";
_sb.Append(" AUTO_INCREMENT");
 };
 }
};
 //BA.debugLineNum = 124;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 126;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+_escapefield(_tblname)+" "+_sb.ToString();
 //BA.debugLineNum = 127;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 128;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 129;BA.debugLine="m.query = query";
_m.query /*String*/  = _query;
 //BA.debugLineNum = 130;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 131;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 132;BA.debugLine="m.command = \"createtable\"";
_m.command /*String*/  = "createtable";
 //BA.debugLineNum = 133;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 134;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 135;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 136;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 137;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 138;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public String  _cstr(Object _o) throws Exception{
 //BA.debugLineNum = 182;BA.debugLine="private Sub CStr(o As Object) As String";
 //BA.debugLineNum = 183;BA.debugLine="If o = BANano.UNDEFINED Then o = \"\"";
if ((_o).equals(_banano.UNDEFINED())) { 
_o = (Object)("");};
 //BA.debugLineNum = 184;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
 //BA.debugLineNum = 185;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssql._mssqlresultset  _delete(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananomssql._mssqlresultset _qry = null;
 //BA.debugLineNum = 420;BA.debugLine="Sub Delete(tblName As String, primaryKey As String";
 //BA.debugLineNum = 421;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 422;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 423;BA.debugLine="Dim qry As MSSQLResultSet = DeleteWhere(tblName,";
_qry = _deletewhere(_tblname,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}));
 //BA.debugLineNum = 424;BA.debugLine="Return qry";
if (true) return _qry;
 //BA.debugLineNum = 425;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _deleteall(String _tblname) throws Exception{
String _sb = "";
b4j.example.bananomssql._mssqlresultset _m = null;
 //BA.debugLineNum = 485;BA.debugLine="Sub DeleteAll(tblName As String) As MSSQLResultSet";
 //BA.debugLineNum = 486;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(tb";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+"");
 //BA.debugLineNum = 487;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 488;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 489;BA.debugLine="m.query = sb";
_m.query /*String*/  = _sb;
 //BA.debugLineNum = 490;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 491;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 492;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 493;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 494;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 495;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 496;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 497;BA.debugLine="m.command = \"delete\"";
_m.command /*String*/  = "delete";
 //BA.debugLineNum = 498;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 499;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _deletewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
b4j.example.bananomssql._mssqlresultset _m = null;
 //BA.debugLineNum = 502;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
 //BA.debugLineNum = 503;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 504;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 505;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 506;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 507;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 508;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 509;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 510;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 511;BA.debugLine="For i = 0 To iWhere";
{
final int step9 = 1;
final int limit9 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 512;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 513;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 515;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 516;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 517;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 518;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 520;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 521;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 522;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 523;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
 //BA.debugLineNum = 524;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 525;BA.debugLine="m.command = \"delete\"";
_m.command /*String*/  = "delete";
 //BA.debugLineNum = 526;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 527;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 528;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 529;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 530;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 531;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 532;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
 //BA.debugLineNum = 33;BA.debugLine="Sub EQOperators(sm As Map) As List";
 //BA.debugLineNum = 34;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 35;BA.debugLine="nl.initialize";
_nl.Initialize();
 //BA.debugLineNum = 36;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 37;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
 //BA.debugLineNum = 39;BA.debugLine="Return nl";
if (true) return _nl;
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(String _f) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Private Sub EscapeField(f As String) As String";
 //BA.debugLineNum = 260;BA.debugLine="Return $\"[${f}]\"$";
if (true) return ("["+__c.SmartStringFormatter("",(Object)(_f))+"]");
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssql._mssqlresultset  _execute(String _strsql) throws Exception{
b4j.example.bananomssql._mssqlresultset _m = null;
 //BA.debugLineNum = 264;BA.debugLine="Sub Execute(strSQL As String) As MSSQLResultSet";
 //BA.debugLineNum = 265;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 266;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 267;BA.debugLine="m.query = strSQL";
_m.query /*String*/  = _strsql;
 //BA.debugLineNum = 268;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 269;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 270;BA.debugLine="m.command = \"execute\"";
_m.command /*String*/  = "execute";
 //BA.debugLineNum = 271;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 272;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 273;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 274;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 275;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 276;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 277;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _exists(String _tblname,String _primarykey,String _primaryvalue) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananomssql._mssqlresultset _qry = null;
 //BA.debugLineNum = 428;BA.debugLine="Sub Exists(tblName As String, primaryKey As String";
 //BA.debugLineNum = 429;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 430;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 431;BA.debugLine="Dim qry As MSSQLResultSet = SelectWhere(tblName,";
_qry = _selectwhere(_tblname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}),_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 432;BA.debugLine="Return qry";
if (true) return _qry;
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 324;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
 //BA.debugLineNum = 325;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 326;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 327;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 328;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 329;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 330;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 331;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 332;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 334;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 335;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
 //BA.debugLineNum = 280;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
 //BA.debugLineNum = 281;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 282;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
 //BA.debugLineNum = 283;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 284;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 285;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 286;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 287;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
 //BA.debugLineNum = 288;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(_rectype.GetDefault((Object)(_col),(Object)("STRING")));
 //BA.debugLineNum = 289;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR","NVARCHAR","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR","INTEGER","INT","BOOL","BOOLEAN","REAL","FLOAT","DOUBLE","BLOB")) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 //BA.debugLineNum = 291;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 6: 
case 7: 
case 8: {
 //BA.debugLineNum = 293;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 9: 
case 10: 
case 11: 
case 12: 
case 13: 
case 14: {
 //BA.debugLineNum = 295;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 15: 
case 16: 
case 17: 
case 18: {
 //BA.debugLineNum = 297;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 19: 
case 20: 
case 21: {
 //BA.debugLineNum = 299;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
case 22: {
 //BA.debugLineNum = 301;BA.debugLine="listOfTypes.Add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
default: {
 //BA.debugLineNum = 303;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
 //BA.debugLineNum = 306;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
 //BA.debugLineNum = 307;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
 //BA.debugLineNum = 310;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
 //BA.debugLineNum = 311;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 312;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
 //BA.debugLineNum = 313;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 314;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 315;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
 //BA.debugLineNum = 316;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
 //BA.debugLineNum = 317;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
 //BA.debugLineNum = 318;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
 //BA.debugLineNum = 320;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
 //BA.debugLineNum = 321;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _getmax(String _tblname,String _fldname) throws Exception{
String _sb = "";
b4j.example.bananomssql._mssqlresultset _m = null;
 //BA.debugLineNum = 148;BA.debugLine="Sub GetMax(tblName As String, fldName As String) A";
 //BA.debugLineNum = 149;BA.debugLine="Dim sb As String = $\"SELECT MAX(${fldName}) As ${";
_sb = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(_fldname))+") As "+__c.SmartStringFormatter("",(Object)(_fldname))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+"");
 //BA.debugLineNum = 150;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 151;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 152;BA.debugLine="m.query = sb";
_m.query /*String*/  = _sb;
 //BA.debugLineNum = 153;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 154;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 155;BA.debugLine="m.command = \"getmax\"";
_m.command /*String*/  = "getmax";
 //BA.debugLineNum = 156;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 157;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 158;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 159;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 160;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 161;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 162;BA.debugLine="End Sub";
return null;
}
public String  _getnextid(String _fld,anywheresoftware.b4a.objects.collections.List _rsl) throws Exception{
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
 //BA.debugLineNum = 165;BA.debugLine="Sub GetNextID(fld As String, rsl As List) As Strin";
 //BA.debugLineNum = 166;BA.debugLine="Dim nextid As Int";
_nextid = 0;
 //BA.debugLineNum = 167;BA.debugLine="Dim strid As String";
_strid = "";
 //BA.debugLineNum = 169;BA.debugLine="If rsl.Size = 0 Then";
if (_rsl.getSize()==0) { 
 //BA.debugLineNum = 170;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
 //BA.debugLineNum = 172;BA.debugLine="Dim nr As Map = rsl.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_rsl.Get((int) (0))));
 //BA.debugLineNum = 173;BA.debugLine="Dim ni As String = nr.GetDefault(fld,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(_fld),(Object)("0")));
 //BA.debugLineNum = 174;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = _banano.parseInt((Object)(_ni));
 };
 //BA.debugLineNum = 176;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
 //BA.debugLineNum = 177;BA.debugLine="strid = CStr(nextid)";
_strid = _cstr((Object)(_nextid));
 //BA.debugLineNum = 178;BA.debugLine="Return strid";
if (true) return _strid;
 //BA.debugLineNum = 179;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssql  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 188;BA.debugLine="Sub Initialize() As BANanoMSSQL";
 //BA.debugLineNum = 189;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 190;BA.debugLine="MethodName = \"BANanoMSSQL\"";
_methodname = "BANanoMSSQL";
 //BA.debugLineNum = 191;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 192;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _insert(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
b4j.example.bananomssql._mssqlresultset _m = null;
 //BA.debugLineNum = 339;BA.debugLine="Sub Insert(tblName As String, tblFields As Map) As";
 //BA.debugLineNum = 340;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 341;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 342;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 343;BA.debugLine="Dim listOfValues As List = GetMapValues(tblFields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 344;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 345;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
 //BA.debugLineNum = 346;BA.debugLine="Dim iTot As Int";
_itot = 0;
 //BA.debugLineNum = 347;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 348;BA.debugLine="columns.Initialize";
_columns.Initialize();
 //BA.debugLineNum = 349;BA.debugLine="values.Initialize";
_values.Initialize();
 //BA.debugLineNum = 350;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(tblName)} (";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" ("));
 //BA.debugLineNum = 351;BA.debugLine="iTot = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 352;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
 //BA.debugLineNum = 353;BA.debugLine="Dim col As String = tblFields.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_icnt));
 //BA.debugLineNum = 354;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
 //BA.debugLineNum = 355;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
 //BA.debugLineNum = 356;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
 //BA.debugLineNum = 358;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(_escapefield(_col));
 //BA.debugLineNum = 359;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
 //BA.debugLineNum = 361;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
 //BA.debugLineNum = 362;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
 //BA.debugLineNum = 363;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
 //BA.debugLineNum = 364;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
 //BA.debugLineNum = 365;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 366;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 367;BA.debugLine="m.query = sb.ToString";
_m.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 368;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
 //BA.debugLineNum = 369;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 370;BA.debugLine="m.command = \"insert\"";
_m.command /*String*/  = "insert";
 //BA.debugLineNum = 371;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 372;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 373;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 374;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 375;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 376;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 377;BA.debugLine="End Sub";
return null;
}
public String  _join(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 397;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
 //BA.debugLineNum = 398;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 399;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 400;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 401;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 402;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 403;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 404;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
 //BA.debugLineNum = 405;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 406;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 408;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 409;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
 //BA.debugLineNum = 380;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
 //BA.debugLineNum = 381;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 382;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 383;BA.debugLine="Dim fld As String";
_fld = "";
 //BA.debugLineNum = 384;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 385;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
 //BA.debugLineNum = 386;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 387;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
 //BA.debugLineNum = 388;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
 //BA.debugLineNum = 389;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
 //BA.debugLineNum = 390;BA.debugLine="fld = EscapeField(fld)";
_fld = _escapefield(_fld);
 //BA.debugLineNum = 391;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
 //BA.debugLineNum = 393;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
 //BA.debugLineNum = 394;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(String _strjson) throws Exception{
com.ab.banano.BANanoJSONParser _json = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
 //BA.debugLineNum = 195;BA.debugLine="private Sub Json2Map(strJSON As String) As Map";
 //BA.debugLineNum = 196;BA.debugLine="Dim json As BANanoJSONParser";
_json = new com.ab.banano.BANanoJSONParser();
 //BA.debugLineNum = 197;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 198;BA.debugLine="Map1.Initialize";
_map1.Initialize();
 //BA.debugLineNum = 199;BA.debugLine="Map1.clear";
_map1.Clear();
 //BA.debugLineNum = 200;BA.debugLine="Try";
try { //BA.debugLineNum = 201;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
 //BA.debugLineNum = 202;BA.debugLine="json.Initialize(strJSON)";
_json.Initialize(_strjson);
 //BA.debugLineNum = 203;BA.debugLine="Map1 = json.NextObject";
_map1 = _json.NextObject();
 };
 //BA.debugLineNum = 205;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12); //BA.debugLineNum = 207;BA.debugLine="Return Map1";
if (true) return _map1;
 };
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public String  _jsontoresultset(b4j.example.bananomssql._mssqlresultset _rs) throws Exception{
anywheresoftware.b4a.objects.collections.Map _m = null;
 //BA.debugLineNum = 663;BA.debugLine="Sub JSONToResultSet(rs As MSSQLResultSet)";
 //BA.debugLineNum = 664;BA.debugLine="rs.ok = False";
_rs.OK /*boolean*/  = __c.False;
 //BA.debugLineNum = 665;BA.debugLine="Dim m As Map = BANano.FromJson(rs.json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_banano.FromJson((Object)(_rs.json /*String*/ ))));
 //BA.debugLineNum = 666;BA.debugLine="rs.response = m.Get(\"response\")";
_rs.response /*String*/  = BA.ObjectToString(_m.Get((Object)("response")));
 //BA.debugLineNum = 667;BA.debugLine="rs.error = m.Get(\"error\")";
_rs.error /*String*/  = BA.ObjectToString(_m.Get((Object)("error")));
 //BA.debugLineNum = 668;BA.debugLine="rs.result = m.Get(\"result\")";
_rs.result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(_m.Get((Object)("result"))));
 //BA.debugLineNum = 669;BA.debugLine="rs.affectedRows = m.Get(\"affectedRows\")";
_rs.affectedRows /*long*/  = BA.ObjectToLongNumber(_m.Get((Object)("affectedRows")));
 //BA.debugLineNum = 670;BA.debugLine="If rs.response = \"Success\" And rs.affectedRows >=";
if ((_rs.response /*String*/ ).equals("Success") && _rs.affectedRows /*long*/ >=1) { 
 //BA.debugLineNum = 671;BA.debugLine="rs.OK = True";
_rs.OK /*boolean*/  = __c.True;
 };
 //BA.debugLineNum = 673;BA.debugLine="End Sub";
return "";
}
public String  _map2json(anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
com.ab.banano.BANanoJSONGenerator _json = null;
 //BA.debugLineNum = 212;BA.debugLine="private Sub Map2Json(mp As Map) As String";
 //BA.debugLineNum = 213;BA.debugLine="Dim json As BANanoJSONGenerator";
_json = new com.ab.banano.BANanoJSONGenerator();
 //BA.debugLineNum = 214;BA.debugLine="json.Initialize(mp)";
_json.Initialize(_mp);
 //BA.debugLineNum = 215;BA.debugLine="Return json.ToString";
if (true) return _json.ToString();
 //BA.debugLineNum = 216;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomssql._mssqlresultset  _read(String _tblname,String _primarykey,String _primaryvalue,anywheresoftware.b4a.objects.collections.List _flds) throws Exception{
anywheresoftware.b4a.objects.collections.Map _qw = null;
b4j.example.bananomssql._mssqlresultset _qry = null;
 //BA.debugLineNum = 413;BA.debugLine="Sub Read(tblName As String, primaryKey As String,";
 //BA.debugLineNum = 414;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
 //BA.debugLineNum = 415;BA.debugLine="qw.Put(primaryKey, primaryValue)";
_qw.Put((Object)(_primarykey),(Object)(_primaryvalue));
 //BA.debugLineNum = 416;BA.debugLine="Dim qry As MSSQLResultSet = SelectWhere(tblName,";
_qry = _selectwhere(_tblname,_flds,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_primarykey)}));
 //BA.debugLineNum = 417;BA.debugLine="Return qry";
if (true) return _qry;
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _resettypes() throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub ResetTypes As BANanoMSSQL";
 //BA.debugLineNum = 143;BA.debugLine="recType.Initialize";
_rectype.Initialize();
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddblob(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 70;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoMSSQL";
 //BA.debugLineNum = 71;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 72;BA.debugLine="Schema.Put(b, DB_BLOB)";
_schema.Put((Object)(_b),(Object)(_db_blob));
 }
};
 //BA.debugLineNum = 74;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 75;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddboolean(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 49;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoMSSQL";
 //BA.debugLineNum = 50;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 51;BA.debugLine="Schema.Put(b, DB_BOOL)";
_schema.Put((Object)(_b),(Object)(_db_bool));
 }
};
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaadddate(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 84;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoMSSQL";
 //BA.debugLineNum = 85;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 86;BA.debugLine="Schema.Put(b, DB_DATE)";
_schema.Put((Object)(_b),(Object)(_db_date));
 }
};
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddfloat(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 63;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoMSSQL";
 //BA.debugLineNum = 64;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 65;BA.debugLine="Schema.Put(b, DB_FLOAT)";
_schema.Put((Object)(_b),(Object)(_db_float));
 }
};
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddint(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 56;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoMSSQL";
 //BA.debugLineNum = 57;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 58;BA.debugLine="Schema.Put(b, DB_INT)";
_schema.Put((Object)(_b),(Object)(_db_int));
 }
};
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaaddtext(anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
String _b = "";
 //BA.debugLineNum = 77;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoMSSQL";
 //BA.debugLineNum = 78;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 79;BA.debugLine="Schema.Put(b, DB_STRING)";
_schema.Put((Object)(_b),(Object)(_db_string));
 }
};
 //BA.debugLineNum = 81;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 82;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql  _schemaclear() throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SchemaClear As BANanoMSSQL";
 //BA.debugLineNum = 44;BA.debugLine="Schema.clear";
_schema.Clear();
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomssql)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _schemacreatetable(String _tblname,String _pk,String _auto) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SchemaCreateTable(tblName As String, PK As Str";
 //BA.debugLineNum = 93;BA.debugLine="Return CreateTable(tblName, Schema, PK, Auto)";
if (true) return _createtable(_tblname,_schema,_pk,_auto);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _selectall(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
b4j.example.bananomssql._mssqlresultset _m = null;
 //BA.debugLineNum = 536;BA.debugLine="Sub SelectAll(tblName As String, tblfields As List";
 //BA.debugLineNum = 538;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 539;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 540;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 542;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 544;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 546;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 547;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 548;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+""));
 //BA.debugLineNum = 549;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 551;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 552;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 553;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 556;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 557;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 558;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 559;BA.debugLine="m.args = Null";
_m.args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 560;BA.debugLine="m.types = Null";
_m.types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
 //BA.debugLineNum = 561;BA.debugLine="m.command =  \"select\"";
_m.command /*String*/  = "select";
 //BA.debugLineNum = 562;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 563;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 564;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 565;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 566;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 567;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 568;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _selectwhere(String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
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
 //BA.debugLineNum = 436;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
 //BA.debugLineNum = 437;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 438;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 439;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 441;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
 //BA.debugLineNum = 442;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
 //BA.debugLineNum = 443;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
 //BA.debugLineNum = 445;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
 //BA.debugLineNum = 447;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = _joinfields(",",_tblfields);
 break; }
}
;
 //BA.debugLineNum = 449;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 450;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 451;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" WHERE "));
 //BA.debugLineNum = 452;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 453;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 454;BA.debugLine="For i = 0 To iWhere";
{
final int step17 = 1;
final int limit17 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit17 ;_i = _i + step17 ) {
 //BA.debugLineNum = 455;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 456;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 458;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 459;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 460;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 461;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 463;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
 //BA.debugLineNum = 465;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = _joinfields(",",_orderby);
 //BA.debugLineNum = 466;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
 //BA.debugLineNum = 467;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
 //BA.debugLineNum = 470;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 471;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 472;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 473;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
 //BA.debugLineNum = 474;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 475;BA.debugLine="m.command = \"select\"";
_m.command /*String*/  = "select";
 //BA.debugLineNum = 476;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 477;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 478;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 479;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 480;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 481;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 482;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _update(String _tblname,String _prikey,String _privalue,anywheresoftware.b4a.objects.collections.Map _tblfields) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
 //BA.debugLineNum = 27;BA.debugLine="Sub Update(tblName As String, priKey As String, pr";
 //BA.debugLineNum = 28;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
 //BA.debugLineNum = 29;BA.debugLine="tblWhere.Put(priKey, priValue)";
_tblwhere.Put((Object)(_prikey),(Object)(_privalue));
 //BA.debugLineNum = 30;BA.debugLine="Return UpdateWhere(tblName, tblfields, tblWhere,";
if (true) return _updatewhere(_tblname,_tblfields,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _updateall(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _args = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
String _oper = "";
b4j.example.bananomssql._mssqlresultset _m = null;
 //BA.debugLineNum = 630;BA.debugLine="Sub UpdateAll(tblName As String, tblFields As Map,";
 //BA.debugLineNum = 631;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblfields);};
 //BA.debugLineNum = 632;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 633;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = _getmapvalues(_tblfields);
 //BA.debugLineNum = 634;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 635;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 636;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 637;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 638;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 639;BA.debugLine="For i = 0 To iTot";
{
final int step9 = 1;
final int limit9 = _itot;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
 //BA.debugLineNum = 640;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 641;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 642;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
 //BA.debugLineNum = 643;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 644;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
 //BA.debugLineNum = 646;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 };
 }
};
 //BA.debugLineNum = 649;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 650;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 651;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 652;BA.debugLine="m.args = args";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _args;
 //BA.debugLineNum = 653;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 654;BA.debugLine="m.command = \"update\"";
_m.command /*String*/  = "update";
 //BA.debugLineNum = 655;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 656;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 657;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 658;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 659;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 660;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 661;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomssql._mssqlresultset  _updatewhere(String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
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
 //BA.debugLineNum = 581;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
 //BA.debugLineNum = 582;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = _eqoperators(_tblwhere);};
 //BA.debugLineNum = 583;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = _getmaptypes(_tblfields);
 //BA.debugLineNum = 584;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = _getmaptypes(_tblwhere);
 //BA.debugLineNum = 585;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
 //BA.debugLineNum = 586;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = _getmapvalues(_tblfields);
 //BA.debugLineNum = 587;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = _getmapvalues(_tblwhere);
 //BA.debugLineNum = 588;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
 //BA.debugLineNum = 589;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 590;BA.debugLine="sb.Initialize";
_sb.Initialize();
 //BA.debugLineNum = 591;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(_escapefield(_tblname)))+" SET "));
 //BA.debugLineNum = 592;BA.debugLine="Dim i As Int";
_i = 0;
 //BA.debugLineNum = 593;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
 //BA.debugLineNum = 594;BA.debugLine="For i = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_i = (int) (0) ;
for (;_i <= limit13 ;_i = _i + step13 ) {
 //BA.debugLineNum = 595;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
 //BA.debugLineNum = 596;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 597;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
 //BA.debugLineNum = 598;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
 //BA.debugLineNum = 600;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
 //BA.debugLineNum = 603;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
 //BA.debugLineNum = 604;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
 //BA.debugLineNum = 605;BA.debugLine="For i = 0 To iWhere";
{
final int step24 = 1;
final int limit24 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit24 ;_i = _i + step24 ) {
 //BA.debugLineNum = 606;BA.debugLine="If i > 0 Then";
if (_i>0) { 
 //BA.debugLineNum = 607;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
 //BA.debugLineNum = 609;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
 //BA.debugLineNum = 610;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(_escapefield(_col));
 //BA.debugLineNum = 611;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
 //BA.debugLineNum = 612;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
 //BA.debugLineNum = 614;BA.debugLine="Dim m As MSSQLResultSet";
_m = new b4j.example.bananomssql._mssqlresultset();
 //BA.debugLineNum = 615;BA.debugLine="m.Initialize";
_m.Initialize();
 //BA.debugLineNum = 616;BA.debugLine="m.query = sb.tostring";
_m.query /*String*/  = _sb.ToString();
 //BA.debugLineNum = 617;BA.debugLine="m.args = listOfValues";
_m.args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
 //BA.debugLineNum = 618;BA.debugLine="m.types = listOfTypes";
_m.types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
 //BA.debugLineNum = 619;BA.debugLine="m.command = \"update\"";
_m.command /*String*/  = "update";
 //BA.debugLineNum = 620;BA.debugLine="m.response = \"\"";
_m.response /*String*/  = "";
 //BA.debugLineNum = 621;BA.debugLine="m.error = \"\"";
_m.error /*String*/  = "";
 //BA.debugLineNum = 622;BA.debugLine="m.result = Array()";
_m.result /*anywheresoftware.b4a.objects.collections.List*/  = anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{});
 //BA.debugLineNum = 623;BA.debugLine="m.json = \"\"";
_m.json /*String*/  = "";
 //BA.debugLineNum = 624;BA.debugLine="m.affectedRows = 0";
_m.affectedRows /*long*/  = (long) (0);
 //BA.debugLineNum = 625;BA.debugLine="Return m";
if (true) return _m;
 //BA.debugLineNum = 626;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
