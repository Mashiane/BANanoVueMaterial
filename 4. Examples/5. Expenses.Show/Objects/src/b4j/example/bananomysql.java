package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class bananomysql extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.bananomysql", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.bananomysql.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public String _methodnamedynamic = "";
public anywheresoftware.b4a.objects.collections.Map _schema = null;
public String _host = "";
public String _username = "";
public String _password = "";
public String _dbase = "";
public anywheresoftware.b4a.objects.collections.List _result = null;
public String _command = "";
public anywheresoftware.b4a.objects.collections.List _types = null;
public anywheresoftware.b4a.objects.collections.List _args = null;
public String _query = "";
public String _response = "";
public String _error = "";
public long _affectedrows = 0L;
public String _json = "";
public boolean _ok = false;
public String _tablename = "";
public String _primarykey = "";
public anywheresoftware.b4a.objects.collections.Map _record = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.bananomysql  _initialize(b4j.example.bananomysql __ref,anywheresoftware.b4a.BA _ba,String _dbname,String _tblname,String _pk) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "initialize", new Object[] {_ba,_dbname,_tblname,_pk}));}
RDebugUtils.currentLine=8192000;
 //BA.debugLineNum = 8192000;BA.debugLine="Public Sub Initialize(dbName As String, tblName As";
RDebugUtils.currentLine=8192001;
 //BA.debugLineNum = 8192001;BA.debugLine="Schema.Initialize";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=8192002;
 //BA.debugLineNum = 8192002;BA.debugLine="recType.Initialize";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=8192003;
 //BA.debugLineNum = 8192003;BA.debugLine="Record.Initialize";
__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=8192004;
 //BA.debugLineNum = 8192004;BA.debugLine="MethodName = \"BANanoMySQL\"";
__ref._methodname /*String*/  = "BANanoMySQL";
RDebugUtils.currentLine=8192005;
 //BA.debugLineNum = 8192005;BA.debugLine="MethodNameDynamic = \"BANanoMySQLDynamic\"";
__ref._methodnamedynamic /*String*/  = "BANanoMySQLDynamic";
RDebugUtils.currentLine=8192006;
 //BA.debugLineNum = 8192006;BA.debugLine="result.Initialize";
__ref._result /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8192007;
 //BA.debugLineNum = 8192007;BA.debugLine="command = \"\"";
__ref._command /*String*/  = "";
RDebugUtils.currentLine=8192008;
 //BA.debugLineNum = 8192008;BA.debugLine="PrimaryKey = PK";
__ref._primarykey /*String*/  = _pk;
RDebugUtils.currentLine=8192009;
 //BA.debugLineNum = 8192009;BA.debugLine="DBase = dbName";
__ref._dbase /*String*/  = _dbname;
RDebugUtils.currentLine=8192010;
 //BA.debugLineNum = 8192010;BA.debugLine="TableName = tblName";
__ref._tablename /*String*/  = _tblname;
RDebugUtils.currentLine=8192011;
 //BA.debugLineNum = 8192011;BA.debugLine="types.Initialize";
__ref._types /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8192012;
 //BA.debugLineNum = 8192012;BA.debugLine="args.Initialize";
__ref._args /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=8192013;
 //BA.debugLineNum = 8192013;BA.debugLine="types = Null";
__ref._types /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=8192014;
 //BA.debugLineNum = 8192014;BA.debugLine="args = Null";
__ref._args /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(__c.Null));
RDebugUtils.currentLine=8192015;
 //BA.debugLineNum = 8192015;BA.debugLine="query = \"\"";
__ref._query /*String*/  = "";
RDebugUtils.currentLine=8192016;
 //BA.debugLineNum = 8192016;BA.debugLine="response = \"\"";
__ref._response /*String*/  = "";
RDebugUtils.currentLine=8192017;
 //BA.debugLineNum = 8192017;BA.debugLine="error = \"\"";
__ref._error /*String*/  = "";
RDebugUtils.currentLine=8192018;
 //BA.debugLineNum = 8192018;BA.debugLine="affectedRows = 0";
__ref._affectedrows /*long*/  = (long) (0);
RDebugUtils.currentLine=8192019;
 //BA.debugLineNum = 8192019;BA.debugLine="json = \"\"";
__ref._json /*String*/  = "";
RDebugUtils.currentLine=8192020;
 //BA.debugLineNum = 8192020;BA.debugLine="OK = False";
__ref._ok /*boolean*/  = __c.False;
RDebugUtils.currentLine=8192021;
 //BA.debugLineNum = 8192021;BA.debugLine="host = \"\"";
__ref._host /*String*/  = "";
RDebugUtils.currentLine=8192022;
 //BA.debugLineNum = 8192022;BA.debugLine="username = \"\"";
__ref._username /*String*/  = "";
RDebugUtils.currentLine=8192023;
 //BA.debugLineNum = 8192023;BA.debugLine="password = \"\"";
__ref._password /*String*/  = "";
RDebugUtils.currentLine=8192024;
 //BA.debugLineNum = 8192024;BA.debugLine="DBase = \"\"";
__ref._dbase /*String*/  = "";
RDebugUtils.currentLine=8192025;
 //BA.debugLineNum = 8192025;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=8192026;
 //BA.debugLineNum = 8192026;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _delete(b4j.example.bananomysql __ref,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "delete", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "delete", new Object[] {_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
RDebugUtils.currentLine=9830400;
 //BA.debugLineNum = 9830400;BA.debugLine="Sub Delete(primaryValue As String) As BANanoMySQL";
RDebugUtils.currentLine=9830401;
 //BA.debugLineNum = 9830401;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=9830402;
 //BA.debugLineNum = 9830402;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(__ref._primarykey /*String*/ ),(Object)(_primaryvalue));
RDebugUtils.currentLine=9830403;
 //BA.debugLineNum = 9830403;BA.debugLine="DeleteWhere(TableName, qw, Array(\"=\"))";
__ref._deletewhere /*b4j.example.bananomysql*/ (null,__ref._tablename /*String*/ ,_qw,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("=")}));
RDebugUtils.currentLine=9830404;
 //BA.debugLineNum = 9830404;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=9830405;
 //BA.debugLineNum = 9830405;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _build(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "build", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "build", null));}
anywheresoftware.b4a.objects.collections.Map _b = null;
RDebugUtils.currentLine=10616832;
 //BA.debugLineNum = 10616832;BA.debugLine="Sub Build As Map";
RDebugUtils.currentLine=10616833;
 //BA.debugLineNum = 10616833;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
RDebugUtils.currentLine=10616834;
 //BA.debugLineNum = 10616834;BA.debugLine="b.Put(\"command\", command)";
_b.Put((Object)("command"),(Object)(__ref._command /*String*/ ));
RDebugUtils.currentLine=10616835;
 //BA.debugLineNum = 10616835;BA.debugLine="b.Put(\"query\", query)";
_b.Put((Object)("query"),(Object)(__ref._query /*String*/ ));
RDebugUtils.currentLine=10616836;
 //BA.debugLineNum = 10616836;BA.debugLine="b.Put(\"args\", args)";
_b.Put((Object)("args"),(Object)(__ref._args /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=10616837;
 //BA.debugLineNum = 10616837;BA.debugLine="b.Put(\"types\", types)";
_b.Put((Object)("types"),(Object)(__ref._types /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=10616838;
 //BA.debugLineNum = 10616838;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=10616839;
 //BA.debugLineNum = 10616839;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _fromjson(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "fromjson", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "fromjson", null));}
anywheresoftware.b4a.objects.collections.Map _m = null;
RDebugUtils.currentLine=7798784;
 //BA.debugLineNum = 7798784;BA.debugLine="Sub FromJSON As BANanoMySQL";
RDebugUtils.currentLine=7798785;
 //BA.debugLineNum = 7798785;BA.debugLine="OK = False";
__ref._ok /*boolean*/  = __c.False;
RDebugUtils.currentLine=7798786;
 //BA.debugLineNum = 7798786;BA.debugLine="Dim m As Map = BANano.FromJson(json)";
_m = new anywheresoftware.b4a.objects.collections.Map();
_m.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._banano /*com.ab.banano.BANano*/ .FromJson((Object)(__ref._json /*String*/ ))));
RDebugUtils.currentLine=7798787;
 //BA.debugLineNum = 7798787;BA.debugLine="response = m.Get(\"response\")";
__ref._response /*String*/  = BA.ObjectToString(_m.Get((Object)("response")));
RDebugUtils.currentLine=7798788;
 //BA.debugLineNum = 7798788;BA.debugLine="error = m.Get(\"error\")";
__ref._error /*String*/  = BA.ObjectToString(_m.Get((Object)("error")));
RDebugUtils.currentLine=7798789;
 //BA.debugLineNum = 7798789;BA.debugLine="result = m.Get(\"result\")";
__ref._result /*anywheresoftware.b4a.objects.collections.List*/ .setObject((java.util.List)(_m.Get((Object)("result"))));
RDebugUtils.currentLine=7798790;
 //BA.debugLineNum = 7798790;BA.debugLine="affectedRows = m.Get(\"affectedRows\")";
__ref._affectedrows /*long*/  = BA.ObjectToLongNumber(_m.Get((Object)("affectedRows")));
RDebugUtils.currentLine=7798791;
 //BA.debugLineNum = 7798791;BA.debugLine="If response = \"Success\" Then";
if ((__ref._response /*String*/ ).equals("Success")) { 
RDebugUtils.currentLine=7798792;
 //BA.debugLineNum = 7798792;BA.debugLine="OK = True";
__ref._ok /*boolean*/  = __c.True;
 };
RDebugUtils.currentLine=7798794;
 //BA.debugLineNum = 7798794;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=7798795;
 //BA.debugLineNum = 7798795;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _selectall(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "selectall", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "selectall", new Object[] {_tblfields,_orderby}));}
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
RDebugUtils.currentLine=10485760;
 //BA.debugLineNum = 10485760;BA.debugLine="Sub SelectAll(tblfields As List, orderBy As List)";
RDebugUtils.currentLine=10485762;
 //BA.debugLineNum = 10485762;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=10485763;
 //BA.debugLineNum = 10485763;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=10485764;
 //BA.debugLineNum = 10485764;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=10485766;
 //BA.debugLineNum = 10485766;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=10485768;
 //BA.debugLineNum = 10485768;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=10485770;
 //BA.debugLineNum = 10485770;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10485771;
 //BA.debugLineNum = 10485771;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10485772;
 //BA.debugLineNum = 10485772;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._tablename /*String*/ )))+""));
RDebugUtils.currentLine=10485773;
 //BA.debugLineNum = 10485773;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=10485775;
 //BA.debugLineNum = 10485775;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=10485776;
 //BA.debugLineNum = 10485776;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=10485777;
 //BA.debugLineNum = 10485777;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=10485780;
 //BA.debugLineNum = 10485780;BA.debugLine="query = sb.tostring";
__ref._query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=10485781;
 //BA.debugLineNum = 10485781;BA.debugLine="command =  \"select\"";
__ref._command /*String*/  = "select";
RDebugUtils.currentLine=10485782;
 //BA.debugLineNum = 10485782;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10485783;
 //BA.debugLineNum = 10485783;BA.debugLine="End Sub";
return null;
}
public String  _schemafromdesign(b4j.example.bananomysql __ref,b4j.example.vmcontainer _vdesign) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "schemafromdesign", true))
	 {return ((String) Debug.delegate(ba, "schemafromdesign", new Object[] {_vdesign}));}
RDebugUtils.currentLine=8454144;
 //BA.debugLineNum = 8454144;BA.debugLine="Sub SchemaFromDesign(vDesign As VMContainer)";
RDebugUtils.currentLine=8454145;
 //BA.debugLineNum = 8454145;BA.debugLine="SchemaAddBoolean(vDesign.Booleans)";
__ref._schemaaddboolean /*b4j.example.bananomysql*/ (null,_vdesign._booleans /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=8454146;
 //BA.debugLineNum = 8454146;BA.debugLine="SchemaAddDate(vDesign.Dates)";
__ref._schemaadddate /*b4j.example.bananomysql*/ (null,_vdesign._dates /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=8454147;
 //BA.debugLineNum = 8454147;BA.debugLine="SchemaAddFloat(vDesign.Doubles)";
__ref._schemaaddfloat /*b4j.example.bananomysql*/ (null,_vdesign._doubles /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=8454148;
 //BA.debugLineNum = 8454148;BA.debugLine="SchemaAddInt(vDesign.Integers)";
__ref._schemaaddint /*b4j.example.bananomysql*/ (null,_vdesign._integers /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=8454149;
 //BA.debugLineNum = 8454149;BA.debugLine="SchemaAddText(vDesign.Strings)";
__ref._schemaaddtext /*b4j.example.bananomysql*/ (null,_vdesign._strings /*anywheresoftware.b4a.objects.collections.List*/ );
RDebugUtils.currentLine=8454150;
 //BA.debugLineNum = 8454150;BA.debugLine="End Sub";
return "";
}
public String  _recordfrommap(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "recordfrommap", true))
	 {return ((String) Debug.delegate(ba, "recordfrommap", new Object[] {_sm}));}
String _k = "";
Object _v = null;
RDebugUtils.currentLine=7733248;
 //BA.debugLineNum = 7733248;BA.debugLine="Sub RecordFromMap(sm As Map)";
RDebugUtils.currentLine=7733249;
 //BA.debugLineNum = 7733249;BA.debugLine="Record.Initialize";
__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=7733250;
 //BA.debugLineNum = 7733250;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _sm.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=7733251;
 //BA.debugLineNum = 7733251;BA.debugLine="Dim v As Object = sm.Get(k)";
_v = _sm.Get((Object)(_k));
RDebugUtils.currentLine=7733252;
 //BA.debugLineNum = 7733252;BA.debugLine="Record.Put(k, v)";
__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=7733254;
 //BA.debugLineNum = 7733254;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _insert(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "insert", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "insert", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
RDebugUtils.currentLine=9699328;
 //BA.debugLineNum = 9699328;BA.debugLine="Sub Insert As BANanoMySQL";
RDebugUtils.currentLine=9699329;
 //BA.debugLineNum = 9699329;BA.debugLine="If Schema.Size = 0 Then";
if (__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=9699330;
 //BA.debugLineNum = 9699330;BA.debugLine="Log($\"BANanoMySQL.Insert: '${TableName}' schema";
__c.Log(("BANanoMySQL.Insert: '"+__c.SmartStringFormatter("",(Object)(__ref._tablename /*String*/ ))+"' schema is not set!"));
 };
RDebugUtils.currentLine=9699332;
 //BA.debugLineNum = 9699332;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9699333;
 //BA.debugLineNum = 9699333;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9699334;
 //BA.debugLineNum = 9699334;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9699335;
 //BA.debugLineNum = 9699335;BA.debugLine="Dim listOfValues As List = GetMapValues(Record)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=9699336;
 //BA.debugLineNum = 9699336;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Record)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=9699337;
 //BA.debugLineNum = 9699337;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=9699338;
 //BA.debugLineNum = 9699338;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=9699339;
 //BA.debugLineNum = 9699339;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=9699340;
 //BA.debugLineNum = 9699340;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=9699341;
 //BA.debugLineNum = 9699341;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=9699342;
 //BA.debugLineNum = 9699342;BA.debugLine="sb.Append($\"INSERT INTO ${EscapeField(TableName)}";
_sb.Append(("INSERT INTO "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._tablename /*String*/ )))+" ("));
RDebugUtils.currentLine=9699343;
 //BA.debugLineNum = 9699343;BA.debugLine="iTot = Record.Size - 1";
_itot = (int) (__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
RDebugUtils.currentLine=9699344;
 //BA.debugLineNum = 9699344;BA.debugLine="For iCnt = 0 To iTot";
{
final int step16 = 1;
final int limit16 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit16 ;_icnt = _icnt + step16 ) {
RDebugUtils.currentLine=9699345;
 //BA.debugLineNum = 9699345;BA.debugLine="Dim col As String = Record.GetKeyAt(iCnt)";
_col = BA.ObjectToString(__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_icnt));
RDebugUtils.currentLine=9699346;
 //BA.debugLineNum = 9699346;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
RDebugUtils.currentLine=9699347;
 //BA.debugLineNum = 9699347;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=9699348;
 //BA.debugLineNum = 9699348;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=9699350;
 //BA.debugLineNum = 9699350;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=9699351;
 //BA.debugLineNum = 9699351;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
RDebugUtils.currentLine=9699353;
 //BA.debugLineNum = 9699353;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
RDebugUtils.currentLine=9699354;
 //BA.debugLineNum = 9699354;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
RDebugUtils.currentLine=9699355;
 //BA.debugLineNum = 9699355;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
RDebugUtils.currentLine=9699356;
 //BA.debugLineNum = 9699356;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=9699357;
 //BA.debugLineNum = 9699357;BA.debugLine="query = sb.ToString";
__ref._query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=9699358;
 //BA.debugLineNum = 9699358;BA.debugLine="args = listOfValues";
__ref._args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=9699359;
 //BA.debugLineNum = 9699359;BA.debugLine="types = listOfTypes";
__ref._types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=9699360;
 //BA.debugLineNum = 9699360;BA.debugLine="command = \"insert\"";
__ref._command /*String*/  = "insert";
RDebugUtils.currentLine=9699361;
 //BA.debugLineNum = 9699361;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=9699362;
 //BA.debugLineNum = 9699362;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _update(b4j.example.bananomysql __ref,String _privalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "update", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "update", new Object[] {_privalue}));}
anywheresoftware.b4a.objects.collections.Map _tblwhere = null;
RDebugUtils.currentLine=11141120;
 //BA.debugLineNum = 11141120;BA.debugLine="Sub Update(priValue As String) As BANanoMySQL";
RDebugUtils.currentLine=11141121;
 //BA.debugLineNum = 11141121;BA.debugLine="Dim tblWhere As Map = CreateMap()";
_tblwhere = new anywheresoftware.b4a.objects.collections.Map();
_tblwhere = __c.createMap(new Object[] {});
RDebugUtils.currentLine=11141122;
 //BA.debugLineNum = 11141122;BA.debugLine="tblWhere.Put(PrimaryKey, priValue)";
_tblwhere.Put((Object)(__ref._primarykey /*String*/ ),(Object)(_privalue));
RDebugUtils.currentLine=11141123;
 //BA.debugLineNum = 11141123;BA.debugLine="UpdateWhere(TableName, Record, tblWhere, Null)";
__ref._updatewhere /*b4j.example.bananomysql*/ (null,__ref._tablename /*String*/ ,__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ ,_tblwhere,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)));
RDebugUtils.currentLine=11141124;
 //BA.debugLineNum = 11141124;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=11141125;
 //BA.debugLineNum = 11141125;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _addblobs(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "addblobs", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "addblobs", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=11075584;
 //BA.debugLineNum = 11075584;BA.debugLine="private Sub AddBlobs(fieldNames As List) As BANano";
RDebugUtils.currentLine=11075585;
 //BA.debugLineNum = 11075585;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=11075586;
 //BA.debugLineNum = 11075586;BA.debugLine="recType.Put(strfld,\"BLOB\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("BLOB"));
 }
};
RDebugUtils.currentLine=11075588;
 //BA.debugLineNum = 11075588;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=11075589;
 //BA.debugLineNum = 11075589;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _addbooleans(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "addbooleans", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "addbooleans", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=10944512;
 //BA.debugLineNum = 10944512;BA.debugLine="private Sub AddBooleans(fieldNames As List) As BAN";
RDebugUtils.currentLine=10944513;
 //BA.debugLineNum = 10944513;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=10944514;
 //BA.debugLineNum = 10944514;BA.debugLine="recType.Put(strfld,\"BOOL\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("BOOL"));
 }
};
RDebugUtils.currentLine=10944516;
 //BA.debugLineNum = 10944516;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10944517;
 //BA.debugLineNum = 10944517;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _adddoubles(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "adddoubles", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "adddoubles", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=10878976;
 //BA.debugLineNum = 10878976;BA.debugLine="private Sub AddDoubles(fieldNames As List) As BANa";
RDebugUtils.currentLine=10878977;
 //BA.debugLineNum = 10878977;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=10878978;
 //BA.debugLineNum = 10878978;BA.debugLine="recType.Put(strfld,\"DOUBLE\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("DOUBLE"));
 }
};
RDebugUtils.currentLine=10878980;
 //BA.debugLineNum = 10878980;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10878981;
 //BA.debugLineNum = 10878981;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _addintegers(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "addintegers", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "addintegers", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=10813440;
 //BA.debugLineNum = 10813440;BA.debugLine="private Sub AddIntegers(fieldNames As List) As BAN";
RDebugUtils.currentLine=10813441;
 //BA.debugLineNum = 10813441;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=10813442;
 //BA.debugLineNum = 10813442;BA.debugLine="recType.Put(strfld,\"INT\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("INT"));
 }
};
RDebugUtils.currentLine=10813444;
 //BA.debugLineNum = 10813444;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10813445;
 //BA.debugLineNum = 10813445;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _addstrings(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _fieldnames) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "addstrings", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "addstrings", new Object[] {_fieldnames}));}
String _strfld = "";
RDebugUtils.currentLine=10747904;
 //BA.debugLineNum = 10747904;BA.debugLine="private Sub AddStrings(fieldNames As List) As BANa";
RDebugUtils.currentLine=10747905;
 //BA.debugLineNum = 10747905;BA.debugLine="For Each strfld As String In fieldNames";
{
final anywheresoftware.b4a.BA.IterableList group1 = _fieldnames;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strfld = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=10747906;
 //BA.debugLineNum = 10747906;BA.debugLine="recType.Put(strfld,\"STRING\")";
__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_strfld),(Object)("STRING"));
 }
};
RDebugUtils.currentLine=10747908;
 //BA.debugLineNum = 10747908;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10747909;
 //BA.debugLineNum = 10747909;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _builddynamic(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "builddynamic", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "builddynamic", null));}
anywheresoftware.b4a.objects.collections.Map _b = null;
RDebugUtils.currentLine=10682368;
 //BA.debugLineNum = 10682368;BA.debugLine="Sub BuildDynamic As Map";
RDebugUtils.currentLine=10682369;
 //BA.debugLineNum = 10682369;BA.debugLine="Dim b As Map = CreateMap()";
_b = new anywheresoftware.b4a.objects.collections.Map();
_b = __c.createMap(new Object[] {});
RDebugUtils.currentLine=10682370;
 //BA.debugLineNum = 10682370;BA.debugLine="b.Put(\"command\", command)";
_b.Put((Object)("command"),(Object)(__ref._command /*String*/ ));
RDebugUtils.currentLine=10682371;
 //BA.debugLineNum = 10682371;BA.debugLine="b.Put(\"query\", query)";
_b.Put((Object)("query"),(Object)(__ref._query /*String*/ ));
RDebugUtils.currentLine=10682372;
 //BA.debugLineNum = 10682372;BA.debugLine="b.Put(\"args\", args)";
_b.Put((Object)("args"),(Object)(__ref._args /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=10682373;
 //BA.debugLineNum = 10682373;BA.debugLine="b.Put(\"types\", types)";
_b.Put((Object)("types"),(Object)(__ref._types /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=10682374;
 //BA.debugLineNum = 10682374;BA.debugLine="b.put(\"host\", host)";
_b.Put((Object)("host"),(Object)(__ref._host /*String*/ ));
RDebugUtils.currentLine=10682375;
 //BA.debugLineNum = 10682375;BA.debugLine="b.Put(\"username\", username)";
_b.Put((Object)("username"),(Object)(__ref._username /*String*/ ));
RDebugUtils.currentLine=10682376;
 //BA.debugLineNum = 10682376;BA.debugLine="b.Put(\"password\", password)";
_b.Put((Object)("password"),(Object)(__ref._password /*String*/ ));
RDebugUtils.currentLine=10682377;
 //BA.debugLineNum = 10682377;BA.debugLine="b.Put(\"dbname\", DBase)";
_b.Put((Object)("dbname"),(Object)(__ref._dbase /*String*/ ));
RDebugUtils.currentLine=10682378;
 //BA.debugLineNum = 10682378;BA.debugLine="Return b";
if (true) return _b;
RDebugUtils.currentLine=10682379;
 //BA.debugLineNum = 10682379;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
RDebugUtils.currentLine=7602176;
 //BA.debugLineNum = 7602176;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=7602177;
 //BA.debugLineNum = 7602177;BA.debugLine="Private recType As Map";
_rectype = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7602178;
 //BA.debugLineNum = 7602178;BA.debugLine="Public const DB_VARCHAR_20 As String = \"VARCHAR(2";
_db_varchar_20 = "VARCHAR(20)";
RDebugUtils.currentLine=7602179;
 //BA.debugLineNum = 7602179;BA.debugLine="Public const DB_VARCHAR_10 As String = \"VARCHAR(1";
_db_varchar_10 = "VARCHAR(10)";
RDebugUtils.currentLine=7602180;
 //BA.debugLineNum = 7602180;BA.debugLine="Public const DB_VARCHAR_30 As String = \"VARCHAR(3";
_db_varchar_30 = "VARCHAR(30)";
RDebugUtils.currentLine=7602181;
 //BA.debugLineNum = 7602181;BA.debugLine="Public const DB_VARCHAR_40 As String = \"VARCHAR(4";
_db_varchar_40 = "VARCHAR(40)";
RDebugUtils.currentLine=7602182;
 //BA.debugLineNum = 7602182;BA.debugLine="Public const DB_VARCHAR_50 As String = \"VARCHAR(5";
_db_varchar_50 = "VARCHAR(50)";
RDebugUtils.currentLine=7602183;
 //BA.debugLineNum = 7602183;BA.debugLine="Public const DB_VARCHAR_100 As String = \"VARCHAR(";
_db_varchar_100 = "VARCHAR(100)";
RDebugUtils.currentLine=7602184;
 //BA.debugLineNum = 7602184;BA.debugLine="Public const DB_VARCHAR_255 As String = \"VARCHAR(";
_db_varchar_255 = "VARCHAR(255)";
RDebugUtils.currentLine=7602185;
 //BA.debugLineNum = 7602185;BA.debugLine="Public const DB_STRING As String = \"TEXT\"";
_db_string = "TEXT";
RDebugUtils.currentLine=7602186;
 //BA.debugLineNum = 7602186;BA.debugLine="Public const DB_INT As String = \"INT\"";
_db_int = "INT";
RDebugUtils.currentLine=7602187;
 //BA.debugLineNum = 7602187;BA.debugLine="Public const DB_FLOAT As String = \"FLOAT\"";
_db_float = "FLOAT";
RDebugUtils.currentLine=7602188;
 //BA.debugLineNum = 7602188;BA.debugLine="Public const DB_BLOB As String = \"BLOB\"";
_db_blob = "BLOB";
RDebugUtils.currentLine=7602189;
 //BA.debugLineNum = 7602189;BA.debugLine="Public const DB_BOOL As String = \"BOOL\"";
_db_bool = "BOOL";
RDebugUtils.currentLine=7602190;
 //BA.debugLineNum = 7602190;BA.debugLine="Public const DB_REAL As String = \"REAL\"";
_db_real = "REAL";
RDebugUtils.currentLine=7602191;
 //BA.debugLineNum = 7602191;BA.debugLine="Public const DB_DATE As String = \"DATE\"";
_db_date = "DATE";
RDebugUtils.currentLine=7602192;
 //BA.debugLineNum = 7602192;BA.debugLine="Public const DB_INTEGER As String = \"INTEGER\"";
_db_integer = "INTEGER";
RDebugUtils.currentLine=7602193;
 //BA.debugLineNum = 7602193;BA.debugLine="Public const DB_TEXT As String = \"TEXT\"";
_db_text = "TEXT";
RDebugUtils.currentLine=7602198;
 //BA.debugLineNum = 7602198;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=7602199;
 //BA.debugLineNum = 7602199;BA.debugLine="Public MethodName As String";
_methodname = "";
RDebugUtils.currentLine=7602200;
 //BA.debugLineNum = 7602200;BA.debugLine="Public MethodNameDynamic As String";
_methodnamedynamic = "";
RDebugUtils.currentLine=7602201;
 //BA.debugLineNum = 7602201;BA.debugLine="Private Schema As Map";
_schema = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7602202;
 //BA.debugLineNum = 7602202;BA.debugLine="Private host As String";
_host = "";
RDebugUtils.currentLine=7602203;
 //BA.debugLineNum = 7602203;BA.debugLine="Private username As String";
_username = "";
RDebugUtils.currentLine=7602204;
 //BA.debugLineNum = 7602204;BA.debugLine="Private password As String";
_password = "";
RDebugUtils.currentLine=7602205;
 //BA.debugLineNum = 7602205;BA.debugLine="Public DBase As String";
_dbase = "";
RDebugUtils.currentLine=7602206;
 //BA.debugLineNum = 7602206;BA.debugLine="Public result As List";
_result = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7602207;
 //BA.debugLineNum = 7602207;BA.debugLine="Public command As String";
_command = "";
RDebugUtils.currentLine=7602208;
 //BA.debugLineNum = 7602208;BA.debugLine="Public types As List";
_types = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7602209;
 //BA.debugLineNum = 7602209;BA.debugLine="Public args As List";
_args = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=7602210;
 //BA.debugLineNum = 7602210;BA.debugLine="Public query As String";
_query = "";
RDebugUtils.currentLine=7602211;
 //BA.debugLineNum = 7602211;BA.debugLine="Public response As String";
_response = "";
RDebugUtils.currentLine=7602212;
 //BA.debugLineNum = 7602212;BA.debugLine="Public error As String";
_error = "";
RDebugUtils.currentLine=7602213;
 //BA.debugLineNum = 7602213;BA.debugLine="Public affectedRows As Long";
_affectedrows = 0L;
RDebugUtils.currentLine=7602214;
 //BA.debugLineNum = 7602214;BA.debugLine="Public json As String";
_json = "";
RDebugUtils.currentLine=7602215;
 //BA.debugLineNum = 7602215;BA.debugLine="Public OK As Boolean";
_ok = false;
RDebugUtils.currentLine=7602216;
 //BA.debugLineNum = 7602216;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=7602217;
 //BA.debugLineNum = 7602217;BA.debugLine="Public TableName As String";
_tablename = "";
RDebugUtils.currentLine=7602218;
 //BA.debugLineNum = 7602218;BA.debugLine="Public PrimaryKey As String";
_primarykey = "";
RDebugUtils.currentLine=7602219;
 //BA.debugLineNum = 7602219;BA.debugLine="Public Record As Map";
_record = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=7602220;
 //BA.debugLineNum = 7602220;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _connection(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "connection", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "connection", null));}
RDebugUtils.currentLine=9109504;
 //BA.debugLineNum = 9109504;BA.debugLine="Sub Connection As BANanoMySQL";
RDebugUtils.currentLine=9109505;
 //BA.debugLineNum = 9109505;BA.debugLine="command = \"connection\"";
__ref._command /*String*/  = "connection";
RDebugUtils.currentLine=9109506;
 //BA.debugLineNum = 9109506;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=9109507;
 //BA.debugLineNum = 9109507;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _createdatabase(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "createdatabase", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "createdatabase", null));}
String _ssql = "";
RDebugUtils.currentLine=9175040;
 //BA.debugLineNum = 9175040;BA.debugLine="Sub CreateDatabase As BANanoMySQL";
RDebugUtils.currentLine=9175041;
 //BA.debugLineNum = 9175041;BA.debugLine="Dim sSQL As String = $\"CREATE DATABASE IF NOT EXI";
_ssql = ("CREATE DATABASE IF NOT EXISTS "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._dbase /*String*/ )))+"");
RDebugUtils.currentLine=9175042;
 //BA.debugLineNum = 9175042;BA.debugLine="query = sSQL";
__ref._query /*String*/  = _ssql;
RDebugUtils.currentLine=9175043;
 //BA.debugLineNum = 9175043;BA.debugLine="command = \"createdb\"";
__ref._command /*String*/  = "createdb";
RDebugUtils.currentLine=9175044;
 //BA.debugLineNum = 9175044;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=9175045;
 //BA.debugLineNum = 9175045;BA.debugLine="End Sub";
return null;
}
public String  _escapefield(b4j.example.bananomysql __ref,String _f) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "escapefield", true))
	 {return ((String) Debug.delegate(ba, "escapefield", new Object[] {_f}));}
RDebugUtils.currentLine=9043968;
 //BA.debugLineNum = 9043968;BA.debugLine="Private Sub EscapeField(f As String) As String";
RDebugUtils.currentLine=9043969;
 //BA.debugLineNum = 9043969;BA.debugLine="Return $\"`${f}`\"$";
if (true) return ("`"+__c.SmartStringFormatter("",(Object)(_f))+"`");
RDebugUtils.currentLine=9043970;
 //BA.debugLineNum = 9043970;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _createtable(b4j.example.bananomysql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,String _pk,String _auto) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "createtable", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "createtable", new Object[] {_tblname,_tblfields,_pk,_auto}));}
String _fldname = "";
String _fldtype = "";
int _fldtot = 0;
int _fldcnt = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
RDebugUtils.currentLine=9371648;
 //BA.debugLineNum = 9371648;BA.debugLine="public Sub CreateTable(tblName As String, tblField";
RDebugUtils.currentLine=9371649;
 //BA.debugLineNum = 9371649;BA.debugLine="Dim fldName As String";
_fldname = "";
RDebugUtils.currentLine=9371650;
 //BA.debugLineNum = 9371650;BA.debugLine="Dim fldType As String";
_fldtype = "";
RDebugUtils.currentLine=9371651;
 //BA.debugLineNum = 9371651;BA.debugLine="Dim fldTot As Int";
_fldtot = 0;
RDebugUtils.currentLine=9371652;
 //BA.debugLineNum = 9371652;BA.debugLine="Dim fldCnt As Int";
_fldcnt = 0;
RDebugUtils.currentLine=9371653;
 //BA.debugLineNum = 9371653;BA.debugLine="fldTot = tblFields.Size - 1";
_fldtot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=9371654;
 //BA.debugLineNum = 9371654;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9371655;
 //BA.debugLineNum = 9371655;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=9371656;
 //BA.debugLineNum = 9371656;BA.debugLine="sb.Append(\"(\")";
_sb.Append("(");
RDebugUtils.currentLine=9371657;
 //BA.debugLineNum = 9371657;BA.debugLine="For fldCnt = 0 To fldTot";
{
final int step9 = 1;
final int limit9 = _fldtot;
_fldcnt = (int) (0) ;
for (;_fldcnt <= limit9 ;_fldcnt = _fldcnt + step9 ) {
RDebugUtils.currentLine=9371658;
 //BA.debugLineNum = 9371658;BA.debugLine="fldName = tblFields.GetKeyAt(fldCnt)";
_fldname = BA.ObjectToString(_tblfields.GetKeyAt(_fldcnt));
RDebugUtils.currentLine=9371659;
 //BA.debugLineNum = 9371659;BA.debugLine="fldType = tblFields.Get(fldName)";
_fldtype = BA.ObjectToString(_tblfields.Get((Object)(_fldname)));
RDebugUtils.currentLine=9371660;
 //BA.debugLineNum = 9371660;BA.debugLine="fldType = fldType.Replace(\"STRING\", \"TEXT\")";
_fldtype = _fldtype.replace("STRING","TEXT");
RDebugUtils.currentLine=9371661;
 //BA.debugLineNum = 9371661;BA.debugLine="If fldCnt > 0 Then";
if (_fldcnt>0) { 
RDebugUtils.currentLine=9371662;
 //BA.debugLineNum = 9371662;BA.debugLine="sb.Append(\", \")";
_sb.Append(", ");
 };
RDebugUtils.currentLine=9371664;
 //BA.debugLineNum = 9371664;BA.debugLine="sb.Append(EscapeField(fldName))";
_sb.Append(__ref._escapefield /*String*/ (null,_fldname));
RDebugUtils.currentLine=9371665;
 //BA.debugLineNum = 9371665;BA.debugLine="sb.Append(\" \")";
_sb.Append(" ");
RDebugUtils.currentLine=9371666;
 //BA.debugLineNum = 9371666;BA.debugLine="sb.Append(fldType)";
_sb.Append(_fldtype);
RDebugUtils.currentLine=9371667;
 //BA.debugLineNum = 9371667;BA.debugLine="If fldName.EqualsIgnoreCase(PK) Then";
if (_fldname.equalsIgnoreCase(_pk)) { 
RDebugUtils.currentLine=9371668;
 //BA.debugLineNum = 9371668;BA.debugLine="sb.Append(\" NOT NULL PRIMARY KEY\")";
_sb.Append(" NOT NULL PRIMARY KEY");
 };
RDebugUtils.currentLine=9371670;
 //BA.debugLineNum = 9371670;BA.debugLine="If fldName.EqualsIgnoreCase(Auto) Then";
if (_fldname.equalsIgnoreCase(_auto)) { 
RDebugUtils.currentLine=9371671;
 //BA.debugLineNum = 9371671;BA.debugLine="sb.Append(\" AUTO_INCREMENT\")";
_sb.Append(" AUTO_INCREMENT");
 };
 }
};
RDebugUtils.currentLine=9371674;
 //BA.debugLineNum = 9371674;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=9371676;
 //BA.debugLineNum = 9371676;BA.debugLine="Dim query As String = \"CREATE TABLE IF NOT EXISTS";
_query = "CREATE TABLE IF NOT EXISTS "+__ref._escapefield /*String*/ (null,_tblname)+" "+_sb.ToString();
RDebugUtils.currentLine=9371677;
 //BA.debugLineNum = 9371677;BA.debugLine="query = query";
__ref._query /*String*/  = __ref._query /*String*/ ;
RDebugUtils.currentLine=9371678;
 //BA.debugLineNum = 9371678;BA.debugLine="command = \"createtable\"";
__ref._command /*String*/  = "createtable";
RDebugUtils.currentLine=9371679;
 //BA.debugLineNum = 9371679;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=9371680;
 //BA.debugLineNum = 9371680;BA.debugLine="End Sub";
return null;
}
public String  _cstr(b4j.example.bananomysql __ref,Object _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "cstr", true))
	 {return ((String) Debug.delegate(ba, "cstr", new Object[] {_o}));}
RDebugUtils.currentLine=8126464;
 //BA.debugLineNum = 8126464;BA.debugLine="Sub CStr(o As Object) As String";
RDebugUtils.currentLine=8126465;
 //BA.debugLineNum = 8126465;BA.debugLine="Return \"\" & o";
if (true) return ""+BA.ObjectToString(_o);
RDebugUtils.currentLine=8126466;
 //BA.debugLineNum = 8126466;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _deletewhere(b4j.example.bananomysql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "deletewhere", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "deletewhere", new Object[] {_tblname,_tblwhere,_operators}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _iwhere = 0;
String _col = "";
String _opr = "";
RDebugUtils.currentLine=10420224;
 //BA.debugLineNum = 10420224;BA.debugLine="Sub DeleteWhere(tblName As String, tblWhere As Map";
RDebugUtils.currentLine=10420225;
 //BA.debugLineNum = 10420225;BA.debugLine="If Schema.Size = 0 Then";
if (__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=10420226;
 //BA.debugLineNum = 10420226;BA.debugLine="Log($\"BANanoMySQL.DeleteWhere: '${tblName}' sche";
__c.Log(("BANanoMySQL.DeleteWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
RDebugUtils.currentLine=10420228;
 //BA.debugLineNum = 10420228;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=10420229;
 //BA.debugLineNum = 10420229;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=10420230;
 //BA.debugLineNum = 10420230;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=10420231;
 //BA.debugLineNum = 10420231;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10420232;
 //BA.debugLineNum = 10420232;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10420233;
 //BA.debugLineNum = 10420233;BA.debugLine="sb.Append($\"DELETE FROM ${EscapeField(tblName)} W";
_sb.Append(("DELETE FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE "));
RDebugUtils.currentLine=10420234;
 //BA.debugLineNum = 10420234;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=10420235;
 //BA.debugLineNum = 10420235;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=10420236;
 //BA.debugLineNum = 10420236;BA.debugLine="For i = 0 To iWhere";
{
final int step12 = 1;
final int limit12 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit12 ;_i = _i + step12 ) {
RDebugUtils.currentLine=10420237;
 //BA.debugLineNum = 10420237;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=10420238;
 //BA.debugLineNum = 10420238;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=10420240;
 //BA.debugLineNum = 10420240;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=10420241;
 //BA.debugLineNum = 10420241;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=10420242;
 //BA.debugLineNum = 10420242;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=10420243;
 //BA.debugLineNum = 10420243;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=10420245;
 //BA.debugLineNum = 10420245;BA.debugLine="query = sb.tostring";
__ref._query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=10420246;
 //BA.debugLineNum = 10420246;BA.debugLine="args = listOfValues";
__ref._args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=10420247;
 //BA.debugLineNum = 10420247;BA.debugLine="types = listOfTypes";
__ref._types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=10420248;
 //BA.debugLineNum = 10420248;BA.debugLine="command = \"delete\"";
__ref._command /*String*/  = "delete";
RDebugUtils.currentLine=10420249;
 //BA.debugLineNum = 10420249;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10420250;
 //BA.debugLineNum = 10420250;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _deleteall(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "deleteall", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "deleteall", null));}
String _sb = "";
RDebugUtils.currentLine=10289152;
 //BA.debugLineNum = 10289152;BA.debugLine="Sub DeleteAll As BANanoMySQL";
RDebugUtils.currentLine=10289153;
 //BA.debugLineNum = 10289153;BA.debugLine="Dim sb As String = $\"DELETE FROM ${EscapeField(Ta";
_sb = ("DELETE FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._tablename /*String*/ )))+"");
RDebugUtils.currentLine=10289154;
 //BA.debugLineNum = 10289154;BA.debugLine="query = sb";
__ref._query /*String*/  = _sb;
RDebugUtils.currentLine=10289155;
 //BA.debugLineNum = 10289155;BA.debugLine="command = \"delete\"";
__ref._command /*String*/  = "delete";
RDebugUtils.currentLine=10289156;
 //BA.debugLineNum = 10289156;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10289157;
 //BA.debugLineNum = 10289157;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _eqoperators(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "eqoperators", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "eqoperators", new Object[] {_sm}));}
anywheresoftware.b4a.objects.collections.List _nl = null;
String _k = "";
RDebugUtils.currentLine=10354688;
 //BA.debugLineNum = 10354688;BA.debugLine="private Sub EQOperators(sm As Map) As List";
RDebugUtils.currentLine=10354689;
 //BA.debugLineNum = 10354689;BA.debugLine="Dim nl As List";
_nl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=10354690;
 //BA.debugLineNum = 10354690;BA.debugLine="nl.initialize";
_nl.Initialize();
RDebugUtils.currentLine=10354691;
 //BA.debugLineNum = 10354691;BA.debugLine="For Each k As String In sm.Keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _sm.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=10354692;
 //BA.debugLineNum = 10354692;BA.debugLine="nl.Add(\"=\")";
_nl.Add((Object)("="));
 }
};
RDebugUtils.currentLine=10354694;
 //BA.debugLineNum = 10354694;BA.debugLine="Return nl";
if (true) return _nl;
RDebugUtils.currentLine=10354695;
 //BA.debugLineNum = 10354695;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmaptypes(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "getmaptypes", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmaptypes", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
String _coltype = "";
RDebugUtils.currentLine=9502720;
 //BA.debugLineNum = 9502720;BA.debugLine="private Sub GetMapTypes(sourceMap As Map) As List";
RDebugUtils.currentLine=9502721;
 //BA.debugLineNum = 9502721;BA.debugLine="Dim listOfTypes As List";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9502722;
 //BA.debugLineNum = 9502722;BA.debugLine="listOfTypes.Initialize";
_listoftypes.Initialize();
RDebugUtils.currentLine=9502723;
 //BA.debugLineNum = 9502723;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=9502724;
 //BA.debugLineNum = 9502724;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=9502725;
 //BA.debugLineNum = 9502725;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=9502726;
 //BA.debugLineNum = 9502726;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=9502727;
 //BA.debugLineNum = 9502727;BA.debugLine="Dim col As String = sourceMap.GetKeyAt(iCnt)";
_col = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
RDebugUtils.currentLine=9502728;
 //BA.debugLineNum = 9502728;BA.debugLine="Dim colType As String = recType.GetDefault(col,\"";
_coltype = BA.ObjectToString(__ref._rectype /*anywheresoftware.b4a.objects.collections.Map*/ .GetDefault((Object)(_col),(Object)("STRING")));
RDebugUtils.currentLine=9502729;
 //BA.debugLineNum = 9502729;BA.debugLine="Select Case colType";
switch (BA.switchObjectToInt(_coltype,"VARCHAR(20)","VARCHAR(10)","VARCHAR(30)","VARCHAR(40)","VARCHAR(50)","VARCHAR(100)","VARCHAR(255)","STRING","VARCHAR","TEXT","DATE","DATETIME","NVARCHAR","INTEGER","INT","BOOL","BOOLEAN","REAL","FLOAT","DOUBLE","BLOB")) {
case 0: 
case 1: 
case 2: 
case 3: {
RDebugUtils.currentLine=9502731;
 //BA.debugLineNum = 9502731;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 4: 
case 5: 
case 6: {
RDebugUtils.currentLine=9502733;
 //BA.debugLineNum = 9502733;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 7: 
case 8: 
case 9: 
case 10: 
case 11: 
case 12: {
RDebugUtils.currentLine=9502735;
 //BA.debugLineNum = 9502735;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
case 13: 
case 14: 
case 15: 
case 16: {
RDebugUtils.currentLine=9502737;
 //BA.debugLineNum = 9502737;BA.debugLine="listOfTypes.add(\"i\")";
_listoftypes.Add((Object)("i"));
 break; }
case 17: 
case 18: 
case 19: {
RDebugUtils.currentLine=9502739;
 //BA.debugLineNum = 9502739;BA.debugLine="listOfTypes.add(\"d\")";
_listoftypes.Add((Object)("d"));
 break; }
case 20: {
RDebugUtils.currentLine=9502741;
 //BA.debugLineNum = 9502741;BA.debugLine="listOfTypes.Add(\"b\")";
_listoftypes.Add((Object)("b"));
 break; }
default: {
RDebugUtils.currentLine=9502743;
 //BA.debugLineNum = 9502743;BA.debugLine="listOfTypes.add(\"s\")";
_listoftypes.Add((Object)("s"));
 break; }
}
;
 }
};
RDebugUtils.currentLine=9502746;
 //BA.debugLineNum = 9502746;BA.debugLine="Return listOfTypes";
if (true) return _listoftypes;
RDebugUtils.currentLine=9502747;
 //BA.debugLineNum = 9502747;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapvalues(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "getmapvalues", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapvalues", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
RDebugUtils.currentLine=9568256;
 //BA.debugLineNum = 9568256;BA.debugLine="private Sub GetMapValues(sourceMap As Map) As List";
RDebugUtils.currentLine=9568257;
 //BA.debugLineNum = 9568257;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9568258;
 //BA.debugLineNum = 9568258;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=9568259;
 //BA.debugLineNum = 9568259;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=9568260;
 //BA.debugLineNum = 9568260;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=9568261;
 //BA.debugLineNum = 9568261;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=9568262;
 //BA.debugLineNum = 9568262;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=9568263;
 //BA.debugLineNum = 9568263;BA.debugLine="Dim value As String = sourceMap.GetValueAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetValueAt(_icnt));
RDebugUtils.currentLine=9568264;
 //BA.debugLineNum = 9568264;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
RDebugUtils.currentLine=9568266;
 //BA.debugLineNum = 9568266;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=9568267;
 //BA.debugLineNum = 9568267;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _dropdatabase(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "dropdatabase", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "dropdatabase", null));}
String _ssql = "";
RDebugUtils.currentLine=9240576;
 //BA.debugLineNum = 9240576;BA.debugLine="Sub DropDataBase As BANanoMySQL";
RDebugUtils.currentLine=9240577;
 //BA.debugLineNum = 9240577;BA.debugLine="Dim sSQL As String = $\"DROP DATABASE ${EscapeFiel";
_ssql = ("DROP DATABASE "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._dbase /*String*/ )))+"");
RDebugUtils.currentLine=9240578;
 //BA.debugLineNum = 9240578;BA.debugLine="query = sSQL";
__ref._query /*String*/  = _ssql;
RDebugUtils.currentLine=9240579;
 //BA.debugLineNum = 9240579;BA.debugLine="command = \"dropdb\"";
__ref._command /*String*/  = "dropdb";
RDebugUtils.currentLine=9240580;
 //BA.debugLineNum = 9240580;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=9240581;
 //BA.debugLineNum = 9240581;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _droptable(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "droptable", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "droptable", null));}
RDebugUtils.currentLine=9437184;
 //BA.debugLineNum = 9437184;BA.debugLine="public Sub DropTable As BANanoMySQL";
RDebugUtils.currentLine=9437186;
 //BA.debugLineNum = 9437186;BA.debugLine="Dim query As String = \"DROP TABLE \" & EscapeField";
_query = "DROP TABLE "+__ref._escapefield /*String*/ (null,__ref._tablename /*String*/ );
RDebugUtils.currentLine=9437187;
 //BA.debugLineNum = 9437187;BA.debugLine="query = query";
__ref._query /*String*/  = __ref._query /*String*/ ;
RDebugUtils.currentLine=9437188;
 //BA.debugLineNum = 9437188;BA.debugLine="command = \"droptable\"";
__ref._command /*String*/  = "droptable";
RDebugUtils.currentLine=9437189;
 //BA.debugLineNum = 9437189;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=9437190;
 //BA.debugLineNum = 9437190;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _execute(b4j.example.bananomysql __ref,String _strsql) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "execute", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "execute", new Object[] {_strsql}));}
RDebugUtils.currentLine=9306112;
 //BA.debugLineNum = 9306112;BA.debugLine="Sub Execute(strSQL As String) As BANanoMySQL";
RDebugUtils.currentLine=9306113;
 //BA.debugLineNum = 9306113;BA.debugLine="query = strSQL";
__ref._query /*String*/  = _strsql;
RDebugUtils.currentLine=9306114;
 //BA.debugLineNum = 9306114;BA.debugLine="command = \"execute\"";
__ref._command /*String*/  = "execute";
RDebugUtils.currentLine=9306115;
 //BA.debugLineNum = 9306115;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=9306116;
 //BA.debugLineNum = 9306116;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _exists(b4j.example.bananomysql __ref,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "exists", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "exists", new Object[] {_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
RDebugUtils.currentLine=10092544;
 //BA.debugLineNum = 10092544;BA.debugLine="Sub Exists(primaryValue As String) As BANanoMySQL";
RDebugUtils.currentLine=10092545;
 //BA.debugLineNum = 10092545;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=10092546;
 //BA.debugLineNum = 10092546;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(__ref._primarykey /*String*/ ),(Object)(_primaryvalue));
RDebugUtils.currentLine=10092547;
 //BA.debugLineNum = 10092547;BA.debugLine="SelectWhere(TableName, Array(PrimaryKey), qw, Nul";
__ref._selectwhere /*b4j.example.bananomysql*/ (null,__ref._tablename /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._primarykey /*String*/ )}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._primarykey /*String*/ )}));
RDebugUtils.currentLine=10092548;
 //BA.debugLineNum = 10092548;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10092549;
 //BA.debugLineNum = 10092549;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _selectwhere(b4j.example.bananomysql __ref,String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "selectwhere", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "selectwhere", new Object[] {_tblname,_tblfields,_tblwhere,_operators,_orderby}));}
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
RDebugUtils.currentLine=10158080;
 //BA.debugLineNum = 10158080;BA.debugLine="Sub SelectWhere(tblName As String, tblfields As Li";
RDebugUtils.currentLine=10158081;
 //BA.debugLineNum = 10158081;BA.debugLine="If Schema.Size = 0 Then";
if (__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=10158082;
 //BA.debugLineNum = 10158082;BA.debugLine="Log($\"BANanoMySQL.SelectWhere: '${tblName}' sche";
__c.Log(("BANanoMySQL.SelectWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
RDebugUtils.currentLine=10158084;
 //BA.debugLineNum = 10158084;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=10158085;
 //BA.debugLineNum = 10158085;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=10158086;
 //BA.debugLineNum = 10158086;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=10158088;
 //BA.debugLineNum = 10158088;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=10158089;
 //BA.debugLineNum = 10158089;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=10158090;
 //BA.debugLineNum = 10158090;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=10158092;
 //BA.debugLineNum = 10158092;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=10158094;
 //BA.debugLineNum = 10158094;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=10158096;
 //BA.debugLineNum = 10158096;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10158097;
 //BA.debugLineNum = 10158097;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10158098;
 //BA.debugLineNum = 10158098;BA.debugLine="sb.Append($\"SELECT ${selFIelds} FROM ${EscapeFiel";
_sb.Append(("SELECT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE "));
RDebugUtils.currentLine=10158099;
 //BA.debugLineNum = 10158099;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=10158100;
 //BA.debugLineNum = 10158100;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=10158101;
 //BA.debugLineNum = 10158101;BA.debugLine="For i = 0 To iWhere";
{
final int step20 = 1;
final int limit20 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=10158102;
 //BA.debugLineNum = 10158102;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=10158103;
 //BA.debugLineNum = 10158103;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=10158105;
 //BA.debugLineNum = 10158105;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=10158106;
 //BA.debugLineNum = 10158106;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=10158107;
 //BA.debugLineNum = 10158107;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=10158108;
 //BA.debugLineNum = 10158108;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 }
};
RDebugUtils.currentLine=10158110;
 //BA.debugLineNum = 10158110;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=10158112;
 //BA.debugLineNum = 10158112;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=10158113;
 //BA.debugLineNum = 10158113;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=10158114;
 //BA.debugLineNum = 10158114;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=10158117;
 //BA.debugLineNum = 10158117;BA.debugLine="query = sb.tostring";
__ref._query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=10158118;
 //BA.debugLineNum = 10158118;BA.debugLine="args = listOfValues";
__ref._args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=10158119;
 //BA.debugLineNum = 10158119;BA.debugLine="types = listOfTypes";
__ref._types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=10158120;
 //BA.debugLineNum = 10158120;BA.debugLine="command = \"select\"";
__ref._command /*String*/  = "select";
RDebugUtils.currentLine=10158121;
 //BA.debugLineNum = 10158121;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10158122;
 //BA.debugLineNum = 10158122;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _firstrecord(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "firstrecord", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "firstrecord", null));}
anywheresoftware.b4a.objects.collections.Map _rec = null;
RDebugUtils.currentLine=11010048;
 //BA.debugLineNum = 11010048;BA.debugLine="Sub FirstRecord As Map";
RDebugUtils.currentLine=11010049;
 //BA.debugLineNum = 11010049;BA.debugLine="Dim rec As Map = result.Get(0)";
_rec = new anywheresoftware.b4a.objects.collections.Map();
_rec.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=11010050;
 //BA.debugLineNum = 11010050;BA.debugLine="Return rec";
if (true) return _rec;
RDebugUtils.currentLine=11010051;
 //BA.debugLineNum = 11010051;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.List  _getmapkeys(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.Map _sourcemap) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "getmapkeys", true))
	 {return ((anywheresoftware.b4a.objects.collections.List) Debug.delegate(ba, "getmapkeys", new Object[] {_sourcemap}));}
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
int _icnt = 0;
int _itot = 0;
String _value = "";
RDebugUtils.currentLine=9633792;
 //BA.debugLineNum = 9633792;BA.debugLine="private Sub GetMapKeys(sourceMap As Map) As List";
RDebugUtils.currentLine=9633793;
 //BA.debugLineNum = 9633793;BA.debugLine="Dim listOfValues As List";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=9633794;
 //BA.debugLineNum = 9633794;BA.debugLine="listOfValues.Initialize";
_listofvalues.Initialize();
RDebugUtils.currentLine=9633795;
 //BA.debugLineNum = 9633795;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=9633796;
 //BA.debugLineNum = 9633796;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=9633797;
 //BA.debugLineNum = 9633797;BA.debugLine="iTot = sourceMap.Size - 1";
_itot = (int) (_sourcemap.getSize()-1);
RDebugUtils.currentLine=9633798;
 //BA.debugLineNum = 9633798;BA.debugLine="For iCnt = 0 To iTot";
{
final int step6 = 1;
final int limit6 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit6 ;_icnt = _icnt + step6 ) {
RDebugUtils.currentLine=9633799;
 //BA.debugLineNum = 9633799;BA.debugLine="Dim value As String = sourceMap.GetKeyAt(iCnt)";
_value = BA.ObjectToString(_sourcemap.GetKeyAt(_icnt));
RDebugUtils.currentLine=9633800;
 //BA.debugLineNum = 9633800;BA.debugLine="listOfValues.Add(value)";
_listofvalues.Add((Object)(_value));
 }
};
RDebugUtils.currentLine=9633802;
 //BA.debugLineNum = 9633802;BA.debugLine="Return listOfValues";
if (true) return _listofvalues;
RDebugUtils.currentLine=9633803;
 //BA.debugLineNum = 9633803;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _getmax(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "getmax", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "getmax", null));}
String _sb = "";
RDebugUtils.currentLine=7864320;
 //BA.debugLineNum = 7864320;BA.debugLine="Sub GetMax As BANanoMySQL";
RDebugUtils.currentLine=7864321;
 //BA.debugLineNum = 7864321;BA.debugLine="Dim sb As String = $\"SELECT MAX(${PrimaryKey}) As";
_sb = ("SELECT MAX("+__c.SmartStringFormatter("",(Object)(__ref._primarykey /*String*/ ))+") As "+__c.SmartStringFormatter("",(Object)(__ref._primarykey /*String*/ ))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._tablename /*String*/ )))+"");
RDebugUtils.currentLine=7864322;
 //BA.debugLineNum = 7864322;BA.debugLine="query = sb";
__ref._query /*String*/  = _sb;
RDebugUtils.currentLine=7864323;
 //BA.debugLineNum = 7864323;BA.debugLine="command = \"getmax\"";
__ref._command /*String*/  = "getmax";
RDebugUtils.currentLine=7864324;
 //BA.debugLineNum = 7864324;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=7864325;
 //BA.debugLineNum = 7864325;BA.debugLine="End Sub";
return null;
}
public String  _getnextid(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "getnextid", true))
	 {return ((String) Debug.delegate(ba, "getnextid", null));}
int _nextid = 0;
String _strid = "";
anywheresoftware.b4a.objects.collections.Map _nr = null;
String _ni = "";
RDebugUtils.currentLine=8060928;
 //BA.debugLineNum = 8060928;BA.debugLine="Sub GetNextID As String";
RDebugUtils.currentLine=8060929;
 //BA.debugLineNum = 8060929;BA.debugLine="Dim nextid As Int";
_nextid = 0;
RDebugUtils.currentLine=8060930;
 //BA.debugLineNum = 8060930;BA.debugLine="Dim strid As String";
_strid = "";
RDebugUtils.currentLine=8060932;
 //BA.debugLineNum = 8060932;BA.debugLine="If result.Size = 0 Then";
if (__ref._result /*anywheresoftware.b4a.objects.collections.List*/ .getSize()==0) { 
RDebugUtils.currentLine=8060933;
 //BA.debugLineNum = 8060933;BA.debugLine="nextid = 0";
_nextid = (int) (0);
 }else {
RDebugUtils.currentLine=8060935;
 //BA.debugLineNum = 8060935;BA.debugLine="Dim nr As Map = result.Get(0)";
_nr = new anywheresoftware.b4a.objects.collections.Map();
_nr.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._result /*anywheresoftware.b4a.objects.collections.List*/ .Get((int) (0))));
RDebugUtils.currentLine=8060936;
 //BA.debugLineNum = 8060936;BA.debugLine="Dim ni As String = nr.GetDefault(PrimaryKey,\"0\")";
_ni = BA.ObjectToString(_nr.GetDefault((Object)(__ref._primarykey /*String*/ ),(Object)("0")));
RDebugUtils.currentLine=8060937;
 //BA.debugLineNum = 8060937;BA.debugLine="nextid = BANano.parseInt(ni)";
_nextid = __ref._banano /*com.ab.banano.BANano*/ .parseInt((Object)(_ni));
 };
RDebugUtils.currentLine=8060939;
 //BA.debugLineNum = 8060939;BA.debugLine="nextid = nextid + 1";
_nextid = (int) (_nextid+1);
RDebugUtils.currentLine=8060940;
 //BA.debugLineNum = 8060940;BA.debugLine="strid = CStr(nextid)";
_strid = __ref._cstr /*String*/ (null,(Object)(_nextid));
RDebugUtils.currentLine=8060941;
 //BA.debugLineNum = 8060941;BA.debugLine="Return strid";
if (true) return _strid;
RDebugUtils.currentLine=8060942;
 //BA.debugLineNum = 8060942;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _gettablenames(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "gettablenames", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "gettablenames", null));}
String _sb = "";
RDebugUtils.currentLine=7929856;
 //BA.debugLineNum = 7929856;BA.debugLine="Sub GetTableNames As BANanoMySQL";
RDebugUtils.currentLine=7929857;
 //BA.debugLineNum = 7929857;BA.debugLine="Dim sb As String = $\"select table_name from infor";
_sb = ("select table_name from information_schema.tables where table_schema = '"+__c.SmartStringFormatter("",(Object)(__ref._dbase /*String*/ ))+"'");
RDebugUtils.currentLine=7929858;
 //BA.debugLineNum = 7929858;BA.debugLine="query = sb";
__ref._query /*String*/  = _sb;
RDebugUtils.currentLine=7929859;
 //BA.debugLineNum = 7929859;BA.debugLine="command = \"select\"";
__ref._command /*String*/  = "select";
RDebugUtils.currentLine=7929860;
 //BA.debugLineNum = 7929860;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=7929861;
 //BA.debugLineNum = 7929861;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _gettablestructure(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "gettablestructure", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "gettablestructure", null));}
String _sb = "";
RDebugUtils.currentLine=7995392;
 //BA.debugLineNum = 7995392;BA.debugLine="Sub GetTableStructure As BANanoMySQL";
RDebugUtils.currentLine=7995393;
 //BA.debugLineNum = 7995393;BA.debugLine="Dim sb As String = $\"describe ${EscapeField(Table";
_sb = ("describe "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._tablename /*String*/ )))+"");
RDebugUtils.currentLine=7995394;
 //BA.debugLineNum = 7995394;BA.debugLine="query = sb";
__ref._query /*String*/  = _sb;
RDebugUtils.currentLine=7995395;
 //BA.debugLineNum = 7995395;BA.debugLine="command = \"select\"";
__ref._command /*String*/  = "select";
RDebugUtils.currentLine=7995396;
 //BA.debugLineNum = 7995396;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=7995397;
 //BA.debugLineNum = 7995397;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _insertreplace(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "insertreplace", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "insertreplace", null));}
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _columns = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _values = null;
anywheresoftware.b4a.objects.collections.List _listofvalues = null;
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
int _icnt = 0;
int _itot = 0;
String _col = "";
RDebugUtils.currentLine=9764864;
 //BA.debugLineNum = 9764864;BA.debugLine="Sub InsertReplace As BANanoMySQL";
RDebugUtils.currentLine=9764865;
 //BA.debugLineNum = 9764865;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9764866;
 //BA.debugLineNum = 9764866;BA.debugLine="Dim columns As StringBuilder";
_columns = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9764867;
 //BA.debugLineNum = 9764867;BA.debugLine="Dim values As StringBuilder";
_values = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9764868;
 //BA.debugLineNum = 9764868;BA.debugLine="Dim listOfValues As List = GetMapValues(Record)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=9764869;
 //BA.debugLineNum = 9764869;BA.debugLine="Dim listOfTypes As List = GetMapTypes(Record)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=9764870;
 //BA.debugLineNum = 9764870;BA.debugLine="Dim iCnt As Int";
_icnt = 0;
RDebugUtils.currentLine=9764871;
 //BA.debugLineNum = 9764871;BA.debugLine="Dim iTot As Int";
_itot = 0;
RDebugUtils.currentLine=9764872;
 //BA.debugLineNum = 9764872;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=9764873;
 //BA.debugLineNum = 9764873;BA.debugLine="columns.Initialize";
_columns.Initialize();
RDebugUtils.currentLine=9764874;
 //BA.debugLineNum = 9764874;BA.debugLine="values.Initialize";
_values.Initialize();
RDebugUtils.currentLine=9764875;
 //BA.debugLineNum = 9764875;BA.debugLine="sb.Append($\"REPLACE INTO ${EscapeField(TableName)";
_sb.Append(("REPLACE INTO "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._tablename /*String*/ )))+" ("));
RDebugUtils.currentLine=9764876;
 //BA.debugLineNum = 9764876;BA.debugLine="iTot = Record.Size - 1";
_itot = (int) (__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()-1);
RDebugUtils.currentLine=9764877;
 //BA.debugLineNum = 9764877;BA.debugLine="For iCnt = 0 To iTot";
{
final int step13 = 1;
final int limit13 = _itot;
_icnt = (int) (0) ;
for (;_icnt <= limit13 ;_icnt = _icnt + step13 ) {
RDebugUtils.currentLine=9764878;
 //BA.debugLineNum = 9764878;BA.debugLine="Dim col As String = Record.GetKeyAt(iCnt)";
_col = BA.ObjectToString(__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ .GetKeyAt(_icnt));
RDebugUtils.currentLine=9764879;
 //BA.debugLineNum = 9764879;BA.debugLine="If iCnt > 0 Then";
if (_icnt>0) { 
RDebugUtils.currentLine=9764880;
 //BA.debugLineNum = 9764880;BA.debugLine="columns.Append(\", \")";
_columns.Append(", ");
RDebugUtils.currentLine=9764881;
 //BA.debugLineNum = 9764881;BA.debugLine="values.Append(\", \")";
_values.Append(", ");
 };
RDebugUtils.currentLine=9764883;
 //BA.debugLineNum = 9764883;BA.debugLine="columns.Append(EscapeField(col))";
_columns.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=9764884;
 //BA.debugLineNum = 9764884;BA.debugLine="values.Append(\"?\")";
_values.Append("?");
 }
};
RDebugUtils.currentLine=9764886;
 //BA.debugLineNum = 9764886;BA.debugLine="sb.Append(columns.ToString)";
_sb.Append(_columns.ToString());
RDebugUtils.currentLine=9764887;
 //BA.debugLineNum = 9764887;BA.debugLine="sb.Append(\") VALUES (\")";
_sb.Append(") VALUES (");
RDebugUtils.currentLine=9764888;
 //BA.debugLineNum = 9764888;BA.debugLine="sb.Append(values.ToString)";
_sb.Append(_values.ToString());
RDebugUtils.currentLine=9764889;
 //BA.debugLineNum = 9764889;BA.debugLine="sb.Append(\")\")";
_sb.Append(")");
RDebugUtils.currentLine=9764890;
 //BA.debugLineNum = 9764890;BA.debugLine="query = sb.ToString";
__ref._query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=9764891;
 //BA.debugLineNum = 9764891;BA.debugLine="args = listOfValues";
__ref._args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=9764892;
 //BA.debugLineNum = 9764892;BA.debugLine="types = listOfTypes";
__ref._types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=9764893;
 //BA.debugLineNum = 9764893;BA.debugLine="command = \"replace\"";
__ref._command /*String*/  = "replace";
RDebugUtils.currentLine=9764894;
 //BA.debugLineNum = 9764894;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=9764895;
 //BA.debugLineNum = 9764895;BA.debugLine="End Sub";
return null;
}
public String  _join(b4j.example.bananomysql __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "join", true))
	 {return ((String) Debug.delegate(ba, "join", new Object[] {_delimiter,_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=9961472;
 //BA.debugLineNum = 9961472;BA.debugLine="private Sub Join(delimiter As String, lst As List)";
RDebugUtils.currentLine=9961473;
 //BA.debugLineNum = 9961473;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=9961474;
 //BA.debugLineNum = 9961474;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9961475;
 //BA.debugLineNum = 9961475;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=9961476;
 //BA.debugLineNum = 9961476;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=9961477;
 //BA.debugLineNum = 9961477;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=9961478;
 //BA.debugLineNum = 9961478;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=9961479;
 //BA.debugLineNum = 9961479;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step7 = 1;
final int limit7 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit7 ;_i = _i + step7 ) {
RDebugUtils.currentLine=9961480;
 //BA.debugLineNum = 9961480;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=9961481;
 //BA.debugLineNum = 9961481;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
RDebugUtils.currentLine=9961483;
 //BA.debugLineNum = 9961483;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=9961484;
 //BA.debugLineNum = 9961484;BA.debugLine="End Sub";
return "";
}
public String  _joinfields(b4j.example.bananomysql __ref,String _delimiter,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "joinfields", true))
	 {return ((String) Debug.delegate(ba, "joinfields", new Object[] {_delimiter,_lst}));}
int _i = 0;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _fld = "";
RDebugUtils.currentLine=9895936;
 //BA.debugLineNum = 9895936;BA.debugLine="private Sub JoinFields(delimiter As String, lst As";
RDebugUtils.currentLine=9895937;
 //BA.debugLineNum = 9895937;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=9895938;
 //BA.debugLineNum = 9895938;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=9895939;
 //BA.debugLineNum = 9895939;BA.debugLine="Dim fld As String";
_fld = "";
RDebugUtils.currentLine=9895940;
 //BA.debugLineNum = 9895940;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=9895941;
 //BA.debugLineNum = 9895941;BA.debugLine="fld = lst.Get(0)";
_fld = BA.ObjectToString(_lst.Get((int) (0)));
RDebugUtils.currentLine=9895942;
 //BA.debugLineNum = 9895942;BA.debugLine="fld = EscapeField(fld)";
_fld = __ref._escapefield /*String*/ (null,_fld);
RDebugUtils.currentLine=9895943;
 //BA.debugLineNum = 9895943;BA.debugLine="sb.Append(fld)";
_sb.Append(_fld);
RDebugUtils.currentLine=9895944;
 //BA.debugLineNum = 9895944;BA.debugLine="For i = 1 To lst.size - 1";
{
final int step8 = 1;
final int limit8 = (int) (_lst.getSize()-1);
_i = (int) (1) ;
for (;_i <= limit8 ;_i = _i + step8 ) {
RDebugUtils.currentLine=9895945;
 //BA.debugLineNum = 9895945;BA.debugLine="Dim fld As String = lst.Get(i)";
_fld = BA.ObjectToString(_lst.Get(_i));
RDebugUtils.currentLine=9895946;
 //BA.debugLineNum = 9895946;BA.debugLine="fld = EscapeField(fld)";
_fld = __ref._escapefield /*String*/ (null,_fld);
RDebugUtils.currentLine=9895947;
 //BA.debugLineNum = 9895947;BA.debugLine="sb.Append(delimiter).Append(fld)";
_sb.Append(_delimiter).Append(_fld);
 }
};
RDebugUtils.currentLine=9895949;
 //BA.debugLineNum = 9895949;BA.debugLine="Return sb.ToString";
if (true) return _sb.ToString();
RDebugUtils.currentLine=9895950;
 //BA.debugLineNum = 9895950;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _json2map(b4j.example.bananomysql __ref,String _strjson) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "json2map", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "json2map", new Object[] {_strjson}));}
com.ab.banano.BANanoJSONParser _jsonx = null;
anywheresoftware.b4a.objects.collections.Map _map1 = null;
RDebugUtils.currentLine=8912896;
 //BA.debugLineNum = 8912896;BA.debugLine="Sub Json2Map(strJSON As String) As Map";
RDebugUtils.currentLine=8912897;
 //BA.debugLineNum = 8912897;BA.debugLine="Dim jsonx As BANanoJSONParser";
_jsonx = new com.ab.banano.BANanoJSONParser();
RDebugUtils.currentLine=8912898;
 //BA.debugLineNum = 8912898;BA.debugLine="Dim Map1 As Map";
_map1 = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=8912899;
 //BA.debugLineNum = 8912899;BA.debugLine="Map1.Initialize";
_map1.Initialize();
RDebugUtils.currentLine=8912900;
 //BA.debugLineNum = 8912900;BA.debugLine="Map1.clear";
_map1.Clear();
RDebugUtils.currentLine=8912901;
 //BA.debugLineNum = 8912901;BA.debugLine="Try";
try {RDebugUtils.currentLine=8912902;
 //BA.debugLineNum = 8912902;BA.debugLine="If strJSON.length > 0 Then";
if (_strjson.length()>0) { 
RDebugUtils.currentLine=8912903;
 //BA.debugLineNum = 8912903;BA.debugLine="jsonx.Initialize(strJSON)";
_jsonx.Initialize(_strjson);
RDebugUtils.currentLine=8912904;
 //BA.debugLineNum = 8912904;BA.debugLine="Map1 = jsonx.NextObject";
_map1 = _jsonx.NextObject();
 };
RDebugUtils.currentLine=8912906;
 //BA.debugLineNum = 8912906;BA.debugLine="Return Map1";
if (true) return _map1;
 } 
       catch (Exception e12) {
			ba.setLastException(e12);RDebugUtils.currentLine=8912908;
 //BA.debugLineNum = 8912908;BA.debugLine="Return Map1";
if (true) return _map1;
 };
RDebugUtils.currentLine=8912910;
 //BA.debugLineNum = 8912910;BA.debugLine="End Sub";
return null;
}
public String  _map2json(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.Map _mp) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "map2json", true))
	 {return ((String) Debug.delegate(ba, "map2json", new Object[] {_mp}));}
com.ab.banano.BANanoJSONGenerator _jsonx = null;
RDebugUtils.currentLine=8978432;
 //BA.debugLineNum = 8978432;BA.debugLine="Sub Map2Json(mp As Map) As String";
RDebugUtils.currentLine=8978433;
 //BA.debugLineNum = 8978433;BA.debugLine="Dim jsonx As BANanoJSONGenerator";
_jsonx = new com.ab.banano.BANanoJSONGenerator();
RDebugUtils.currentLine=8978434;
 //BA.debugLineNum = 8978434;BA.debugLine="jsonx.Initialize(mp)";
_jsonx.Initialize(_mp);
RDebugUtils.currentLine=8978435;
 //BA.debugLineNum = 8978435;BA.debugLine="Return jsonx.ToString";
if (true) return _jsonx.ToString();
RDebugUtils.currentLine=8978436;
 //BA.debugLineNum = 8978436;BA.debugLine="End Sub";
return "";
}
public b4j.example.bananomysql  _read(b4j.example.bananomysql __ref,String _primaryvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "read", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "read", new Object[] {_primaryvalue}));}
anywheresoftware.b4a.objects.collections.Map _qw = null;
RDebugUtils.currentLine=10027008;
 //BA.debugLineNum = 10027008;BA.debugLine="Sub Read(primaryValue As String) As BANanoMySQL";
RDebugUtils.currentLine=10027009;
 //BA.debugLineNum = 10027009;BA.debugLine="Dim qw As Map = CreateMap()";
_qw = new anywheresoftware.b4a.objects.collections.Map();
_qw = __c.createMap(new Object[] {});
RDebugUtils.currentLine=10027010;
 //BA.debugLineNum = 10027010;BA.debugLine="qw.Put(PrimaryKey, primaryValue)";
_qw.Put((Object)(__ref._primarykey /*String*/ ),(Object)(_primaryvalue));
RDebugUtils.currentLine=10027011;
 //BA.debugLineNum = 10027011;BA.debugLine="SelectWhere(TableName, Array(\"*\"), qw, Null, Arra";
__ref._selectwhere /*b4j.example.bananomysql*/ (null,__ref._tablename /*String*/ ,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("*")}),_qw,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(__c.Null)),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(__ref._primarykey /*String*/ )}));
RDebugUtils.currentLine=10027012;
 //BA.debugLineNum = 10027012;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10027013;
 //BA.debugLineNum = 10027013;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaaddblob(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "schemaaddblob", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "schemaaddblob", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=8650752;
 //BA.debugLineNum = 8650752;BA.debugLine="Sub SchemaAddBlob(bools As List) As BANanoMySQL";
RDebugUtils.currentLine=8650753;
 //BA.debugLineNum = 8650753;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=8650754;
 //BA.debugLineNum = 8650754;BA.debugLine="Schema.Put(b, DB_BLOB)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_blob /*String*/ ));
 }
};
RDebugUtils.currentLine=8650756;
 //BA.debugLineNum = 8650756;BA.debugLine="AddBlobs(bools)";
__ref._addblobs /*b4j.example.bananomysql*/ (null,_bools);
RDebugUtils.currentLine=8650757;
 //BA.debugLineNum = 8650757;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=8650758;
 //BA.debugLineNum = 8650758;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaaddboolean(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "schemaaddboolean", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "schemaaddboolean", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=8388608;
 //BA.debugLineNum = 8388608;BA.debugLine="Sub SchemaAddBoolean(bools As List) As BANanoMySQL";
RDebugUtils.currentLine=8388609;
 //BA.debugLineNum = 8388609;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=8388610;
 //BA.debugLineNum = 8388610;BA.debugLine="Schema.Put(b, DB_BOOL)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_bool /*String*/ ));
 }
};
RDebugUtils.currentLine=8388612;
 //BA.debugLineNum = 8388612;BA.debugLine="AddBooleans(bools)";
__ref._addbooleans /*b4j.example.bananomysql*/ (null,_bools);
RDebugUtils.currentLine=8388613;
 //BA.debugLineNum = 8388613;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=8388614;
 //BA.debugLineNum = 8388614;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaadddate(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "schemaadddate", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "schemaadddate", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=8847360;
 //BA.debugLineNum = 8847360;BA.debugLine="Sub SchemaAddDate(bools As List) As BANanoMySQL";
RDebugUtils.currentLine=8847361;
 //BA.debugLineNum = 8847361;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=8847362;
 //BA.debugLineNum = 8847362;BA.debugLine="Schema.Put(b, DB_DATE)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_date /*String*/ ));
 }
};
RDebugUtils.currentLine=8847364;
 //BA.debugLineNum = 8847364;BA.debugLine="AddStrings(bools)";
__ref._addstrings /*b4j.example.bananomysql*/ (null,_bools);
RDebugUtils.currentLine=8847365;
 //BA.debugLineNum = 8847365;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=8847366;
 //BA.debugLineNum = 8847366;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaaddfloat(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "schemaaddfloat", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "schemaaddfloat", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=8585216;
 //BA.debugLineNum = 8585216;BA.debugLine="Sub SchemaAddFloat(bools As List) As BANanoMySQL";
RDebugUtils.currentLine=8585217;
 //BA.debugLineNum = 8585217;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=8585218;
 //BA.debugLineNum = 8585218;BA.debugLine="Schema.Put(b, DB_FLOAT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_float /*String*/ ));
 }
};
RDebugUtils.currentLine=8585220;
 //BA.debugLineNum = 8585220;BA.debugLine="AddDoubles(bools)";
__ref._adddoubles /*b4j.example.bananomysql*/ (null,_bools);
RDebugUtils.currentLine=8585221;
 //BA.debugLineNum = 8585221;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=8585222;
 //BA.debugLineNum = 8585222;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaaddint(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "schemaaddint", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "schemaaddint", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=8519680;
 //BA.debugLineNum = 8519680;BA.debugLine="Sub SchemaAddInt(bools As List) As BANanoMySQL";
RDebugUtils.currentLine=8519681;
 //BA.debugLineNum = 8519681;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=8519682;
 //BA.debugLineNum = 8519682;BA.debugLine="Schema.Put(b, DB_INT)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_int /*String*/ ));
 }
};
RDebugUtils.currentLine=8519684;
 //BA.debugLineNum = 8519684;BA.debugLine="AddIntegers(bools)";
__ref._addintegers /*b4j.example.bananomysql*/ (null,_bools);
RDebugUtils.currentLine=8519685;
 //BA.debugLineNum = 8519685;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=8519686;
 //BA.debugLineNum = 8519686;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaaddtext(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _bools) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "schemaaddtext", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "schemaaddtext", new Object[] {_bools}));}
String _b = "";
RDebugUtils.currentLine=8716288;
 //BA.debugLineNum = 8716288;BA.debugLine="Sub SchemaAddText(bools As List) As BANanoMySQL";
RDebugUtils.currentLine=8716289;
 //BA.debugLineNum = 8716289;BA.debugLine="For Each b As String In bools";
{
final anywheresoftware.b4a.BA.IterableList group1 = _bools;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_b = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=8716290;
 //BA.debugLineNum = 8716290;BA.debugLine="Schema.Put(b, DB_STRING)";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_b),(Object)(__ref._db_string /*String*/ ));
 }
};
RDebugUtils.currentLine=8716292;
 //BA.debugLineNum = 8716292;BA.debugLine="AddStrings(bools)";
__ref._addstrings /*b4j.example.bananomysql*/ (null,_bools);
RDebugUtils.currentLine=8716293;
 //BA.debugLineNum = 8716293;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=8716294;
 //BA.debugLineNum = 8716294;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemaclear(b4j.example.bananomysql __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "schemaclear", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "schemaclear", null));}
RDebugUtils.currentLine=8257536;
 //BA.debugLineNum = 8257536;BA.debugLine="Sub SchemaClear As BANanoMySQL";
RDebugUtils.currentLine=8257537;
 //BA.debugLineNum = 8257537;BA.debugLine="Schema.clear";
__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .Clear();
RDebugUtils.currentLine=8257538;
 //BA.debugLineNum = 8257538;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=8257539;
 //BA.debugLineNum = 8257539;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _schemacreatetable(b4j.example.bananomysql __ref,String _tblname,String _pk,String _auto) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "schemacreatetable", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "schemacreatetable", new Object[] {_tblname,_pk,_auto}));}
RDebugUtils.currentLine=8781824;
 //BA.debugLineNum = 8781824;BA.debugLine="Sub SchemaCreateTable(tblName As String, PK As Str";
RDebugUtils.currentLine=8781825;
 //BA.debugLineNum = 8781825;BA.debugLine="Return CreateTable(tblName, Schema, PK, Auto)";
if (true) return __ref._createtable /*b4j.example.bananomysql*/ (null,_tblname,__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ ,_pk,_auto);
RDebugUtils.currentLine=8781826;
 //BA.debugLineNum = 8781826;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _selectdistinctall(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "selectdistinctall", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "selectdistinctall", new Object[] {_tblfields,_orderby}));}
String _fld1 = "";
String _selfields = "";
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
String _stro = "";
RDebugUtils.currentLine=10551296;
 //BA.debugLineNum = 10551296;BA.debugLine="Sub SelectDistinctAll(tblfields As List, orderBy A";
RDebugUtils.currentLine=10551298;
 //BA.debugLineNum = 10551298;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=10551299;
 //BA.debugLineNum = 10551299;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=10551300;
 //BA.debugLineNum = 10551300;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=10551302;
 //BA.debugLineNum = 10551302;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=10551304;
 //BA.debugLineNum = 10551304;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=10551306;
 //BA.debugLineNum = 10551306;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10551307;
 //BA.debugLineNum = 10551307;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10551308;
 //BA.debugLineNum = 10551308;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
_sb.Append(("SELECT DISTINCT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._tablename /*String*/ )))+""));
RDebugUtils.currentLine=10551309;
 //BA.debugLineNum = 10551309;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=10551311;
 //BA.debugLineNum = 10551311;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=10551312;
 //BA.debugLineNum = 10551312;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=10551313;
 //BA.debugLineNum = 10551313;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=10551316;
 //BA.debugLineNum = 10551316;BA.debugLine="query = sb.tostring";
__ref._query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=10551317;
 //BA.debugLineNum = 10551317;BA.debugLine="command =  \"select\"";
__ref._command /*String*/  = "select";
RDebugUtils.currentLine=10551318;
 //BA.debugLineNum = 10551318;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10551319;
 //BA.debugLineNum = 10551319;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _selectdistinctwhere(b4j.example.bananomysql __ref,String _tblname,anywheresoftware.b4a.objects.collections.List _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators,anywheresoftware.b4a.objects.collections.List _orderby) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "selectdistinctwhere", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "selectdistinctwhere", new Object[] {_tblname,_tblfields,_tblwhere,_operators,_orderby}));}
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
RDebugUtils.currentLine=10223616;
 //BA.debugLineNum = 10223616;BA.debugLine="Sub SelectDistinctWhere(tblName As String, tblfiel";
RDebugUtils.currentLine=10223617;
 //BA.debugLineNum = 10223617;BA.debugLine="If Schema.Size = 0 Then";
if (__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=10223618;
 //BA.debugLineNum = 10223618;BA.debugLine="Log($\"BANanoMySQL.SelectWhere: '${tblName}' sche";
__c.Log(("BANanoMySQL.SelectWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
RDebugUtils.currentLine=10223620;
 //BA.debugLineNum = 10223620;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=10223621;
 //BA.debugLineNum = 10223621;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblWhere)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=10223622;
 //BA.debugLineNum = 10223622;BA.debugLine="Dim listOfValues As List = GetMapValues(tblWhere)";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=10223624;
 //BA.debugLineNum = 10223624;BA.debugLine="Dim fld1 As String = tblfields.Get(0)";
_fld1 = BA.ObjectToString(_tblfields.Get((int) (0)));
RDebugUtils.currentLine=10223625;
 //BA.debugLineNum = 10223625;BA.debugLine="Dim selFIelds As String = \"\"";
_selfields = "";
RDebugUtils.currentLine=10223626;
 //BA.debugLineNum = 10223626;BA.debugLine="Select Case fld1";
switch (BA.switchObjectToInt(_fld1,"*")) {
case 0: {
RDebugUtils.currentLine=10223628;
 //BA.debugLineNum = 10223628;BA.debugLine="selFIelds = \"*\"";
_selfields = "*";
 break; }
default: {
RDebugUtils.currentLine=10223630;
 //BA.debugLineNum = 10223630;BA.debugLine="selFIelds = JoinFields(\",\", tblfields)";
_selfields = __ref._joinfields /*String*/ (null,",",_tblfields);
 break; }
}
;
RDebugUtils.currentLine=10223632;
 //BA.debugLineNum = 10223632;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=10223633;
 //BA.debugLineNum = 10223633;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=10223634;
 //BA.debugLineNum = 10223634;BA.debugLine="sb.Append($\"SELECT DISTINCT ${selFIelds} FROM ${E";
_sb.Append(("SELECT DISTINCT "+__c.SmartStringFormatter("",(Object)(_selfields))+" FROM "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" WHERE "));
RDebugUtils.currentLine=10223635;
 //BA.debugLineNum = 10223635;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=10223636;
 //BA.debugLineNum = 10223636;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=10223637;
 //BA.debugLineNum = 10223637;BA.debugLine="For i = 0 To iWhere";
{
final int step20 = 1;
final int limit20 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit20 ;_i = _i + step20 ) {
RDebugUtils.currentLine=10223638;
 //BA.debugLineNum = 10223638;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=10223639;
 //BA.debugLineNum = 10223639;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=10223641;
 //BA.debugLineNum = 10223641;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=10223642;
 //BA.debugLineNum = 10223642;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=10223643;
 //BA.debugLineNum = 10223643;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=10223644;
 //BA.debugLineNum = 10223644;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 }
};
RDebugUtils.currentLine=10223646;
 //BA.debugLineNum = 10223646;BA.debugLine="If orderBy <> Null Then";
if (_orderby!= null) { 
RDebugUtils.currentLine=10223648;
 //BA.debugLineNum = 10223648;BA.debugLine="Dim stro As String = JoinFields(\",\", orderBy)";
_stro = __ref._joinfields /*String*/ (null,",",_orderby);
RDebugUtils.currentLine=10223649;
 //BA.debugLineNum = 10223649;BA.debugLine="If stro.Length > 0 Then";
if (_stro.length()>0) { 
RDebugUtils.currentLine=10223650;
 //BA.debugLineNum = 10223650;BA.debugLine="sb.Append(\" ORDER BY \").Append(stro)";
_sb.Append(" ORDER BY ").Append(_stro);
 };
 };
RDebugUtils.currentLine=10223653;
 //BA.debugLineNum = 10223653;BA.debugLine="query = sb.tostring";
__ref._query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=10223654;
 //BA.debugLineNum = 10223654;BA.debugLine="args = listOfValues";
__ref._args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=10223655;
 //BA.debugLineNum = 10223655;BA.debugLine="types = listOfTypes";
__ref._types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=10223656;
 //BA.debugLineNum = 10223656;BA.debugLine="command = \"select\"";
__ref._command /*String*/  = "select";
RDebugUtils.currentLine=10223657;
 //BA.debugLineNum = 10223657;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=10223658;
 //BA.debugLineNum = 10223658;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _setconnection(b4j.example.bananomysql __ref,String _shost,String _susername,String _spassword,String _sdbname) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "setconnection", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "setconnection", new Object[] {_shost,_susername,_spassword,_sdbname}));}
RDebugUtils.currentLine=7667712;
 //BA.debugLineNum = 7667712;BA.debugLine="Sub SetConnection(shost As String, susername As St";
RDebugUtils.currentLine=7667713;
 //BA.debugLineNum = 7667713;BA.debugLine="host = shost";
__ref._host /*String*/  = _shost;
RDebugUtils.currentLine=7667714;
 //BA.debugLineNum = 7667714;BA.debugLine="username = susername";
__ref._username /*String*/  = _susername;
RDebugUtils.currentLine=7667715;
 //BA.debugLineNum = 7667715;BA.debugLine="password = spassword";
__ref._password /*String*/  = _spassword;
RDebugUtils.currentLine=7667716;
 //BA.debugLineNum = 7667716;BA.debugLine="DBase = sdbname";
__ref._dbase /*String*/  = _sdbname;
RDebugUtils.currentLine=7667717;
 //BA.debugLineNum = 7667717;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=7667718;
 //BA.debugLineNum = 7667718;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _setfield(b4j.example.bananomysql __ref,String _fldname,Object _fldvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "setfield", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "setfield", new Object[] {_fldname,_fldvalue}));}
RDebugUtils.currentLine=8323072;
 //BA.debugLineNum = 8323072;BA.debugLine="Sub SetField(fldName As String, fldValue As Object";
RDebugUtils.currentLine=8323073;
 //BA.debugLineNum = 8323073;BA.debugLine="Record.Put(fldName, fldValue)";
__ref._record /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_fldname),_fldvalue);
RDebugUtils.currentLine=8323074;
 //BA.debugLineNum = 8323074;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=8323075;
 //BA.debugLineNum = 8323075;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _updatewhere(b4j.example.bananomysql __ref,String _tblname,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.Map _tblwhere,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "updatewhere", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "updatewhere", new Object[] {_tblname,_tblfields,_tblwhere,_operators}));}
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
RDebugUtils.currentLine=11206656;
 //BA.debugLineNum = 11206656;BA.debugLine="Sub UpdateWhere(tblName As String, tblfields As Ma";
RDebugUtils.currentLine=11206657;
 //BA.debugLineNum = 11206657;BA.debugLine="If Schema.Size = 0 Then";
if (__ref._schema /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()==0) { 
RDebugUtils.currentLine=11206658;
 //BA.debugLineNum = 11206658;BA.debugLine="Log($\"BANanoMySQL.UpdateWhere: '${tblName}' sche";
__c.Log(("BANanoMySQL.UpdateWhere: '"+__c.SmartStringFormatter("",(Object)(_tblname))+"' schema is not set!"));
 };
RDebugUtils.currentLine=11206660;
 //BA.debugLineNum = 11206660;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);};
RDebugUtils.currentLine=11206661;
 //BA.debugLineNum = 11206661;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblfields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=11206662;
 //BA.debugLineNum = 11206662;BA.debugLine="Dim listOfTypes1 As List = GetMapTypes(tblWhere)";
_listoftypes1 = new anywheresoftware.b4a.objects.collections.List();
_listoftypes1 = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=11206663;
 //BA.debugLineNum = 11206663;BA.debugLine="listOfTypes.AddAll(listOfTypes1)";
_listoftypes.AddAll(_listoftypes1);
RDebugUtils.currentLine=11206664;
 //BA.debugLineNum = 11206664;BA.debugLine="Dim listOfValues As List = GetMapValues(tblfields";
_listofvalues = new anywheresoftware.b4a.objects.collections.List();
_listofvalues = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=11206665;
 //BA.debugLineNum = 11206665;BA.debugLine="Dim listOfValues1 As List = GetMapValues(tblWhere";
_listofvalues1 = new anywheresoftware.b4a.objects.collections.List();
_listofvalues1 = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblwhere);
RDebugUtils.currentLine=11206666;
 //BA.debugLineNum = 11206666;BA.debugLine="listOfValues.AddAll(listOfValues1)";
_listofvalues.AddAll(_listofvalues1);
RDebugUtils.currentLine=11206667;
 //BA.debugLineNum = 11206667;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11206668;
 //BA.debugLineNum = 11206668;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11206669;
 //BA.debugLineNum = 11206669;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(tblName)} SET \"$";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,_tblname)))+" SET "));
RDebugUtils.currentLine=11206670;
 //BA.debugLineNum = 11206670;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=11206671;
 //BA.debugLineNum = 11206671;BA.debugLine="Dim iTot As Int = tblfields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=11206672;
 //BA.debugLineNum = 11206672;BA.debugLine="For i = 0 To iTot";
{
final int step16 = 1;
final int limit16 = _itot;
_i = (int) (0) ;
for (;_i <= limit16 ;_i = _i + step16 ) {
RDebugUtils.currentLine=11206673;
 //BA.debugLineNum = 11206673;BA.debugLine="Dim col As String = tblfields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
RDebugUtils.currentLine=11206674;
 //BA.debugLineNum = 11206674;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=11206675;
 //BA.debugLineNum = 11206675;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
RDebugUtils.currentLine=11206676;
 //BA.debugLineNum = 11206676;BA.debugLine="sb.Append(\"= ?,\")";
_sb.Append("= ?,");
 }else {
RDebugUtils.currentLine=11206678;
 //BA.debugLineNum = 11206678;BA.debugLine="sb.Append(\"= ?\")";
_sb.Append("= ?");
 };
 }
};
RDebugUtils.currentLine=11206681;
 //BA.debugLineNum = 11206681;BA.debugLine="sb.Append($\" WHERE \"$)";
_sb.Append((" WHERE "));
RDebugUtils.currentLine=11206682;
 //BA.debugLineNum = 11206682;BA.debugLine="Dim iWhere As Int = tblWhere.Size - 1";
_iwhere = (int) (_tblwhere.getSize()-1);
RDebugUtils.currentLine=11206683;
 //BA.debugLineNum = 11206683;BA.debugLine="For i = 0 To iWhere";
{
final int step27 = 1;
final int limit27 = _iwhere;
_i = (int) (0) ;
for (;_i <= limit27 ;_i = _i + step27 ) {
RDebugUtils.currentLine=11206684;
 //BA.debugLineNum = 11206684;BA.debugLine="If i > 0 Then";
if (_i>0) { 
RDebugUtils.currentLine=11206685;
 //BA.debugLineNum = 11206685;BA.debugLine="sb.Append(\" AND \")";
_sb.Append(" AND ");
 };
RDebugUtils.currentLine=11206687;
 //BA.debugLineNum = 11206687;BA.debugLine="Dim col As String = tblWhere.GetKeyAt(i)";
_col = BA.ObjectToString(_tblwhere.GetKeyAt(_i));
RDebugUtils.currentLine=11206688;
 //BA.debugLineNum = 11206688;BA.debugLine="sb.Append(EscapeField(col))";
_sb.Append(__ref._escapefield /*String*/ (null,_col));
RDebugUtils.currentLine=11206689;
 //BA.debugLineNum = 11206689;BA.debugLine="Dim opr As String = operators.Get(i)";
_opr = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=11206690;
 //BA.debugLineNum = 11206690;BA.debugLine="sb.Append($\" ${opr} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_opr))+" ?"));
 }
};
RDebugUtils.currentLine=11206692;
 //BA.debugLineNum = 11206692;BA.debugLine="query = sb.tostring";
__ref._query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=11206693;
 //BA.debugLineNum = 11206693;BA.debugLine="args = listOfValues";
__ref._args /*anywheresoftware.b4a.objects.collections.List*/  = _listofvalues;
RDebugUtils.currentLine=11206694;
 //BA.debugLineNum = 11206694;BA.debugLine="types = listOfTypes";
__ref._types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=11206695;
 //BA.debugLineNum = 11206695;BA.debugLine="command = \"update\"";
__ref._command /*String*/  = "update";
RDebugUtils.currentLine=11206696;
 //BA.debugLineNum = 11206696;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=11206697;
 //BA.debugLineNum = 11206697;BA.debugLine="End Sub";
return null;
}
public b4j.example.bananomysql  _updateall(b4j.example.bananomysql __ref,anywheresoftware.b4a.objects.collections.Map _tblfields,anywheresoftware.b4a.objects.collections.List _operators) throws Exception{
__ref = this;
RDebugUtils.currentModule="bananomysql";
if (Debug.shouldDelegate(ba, "updateall", true))
	 {return ((b4j.example.bananomysql) Debug.delegate(ba, "updateall", new Object[] {_tblfields,_operators}));}
anywheresoftware.b4a.objects.collections.List _listoftypes = null;
anywheresoftware.b4a.keywords.StringBuilderWrapper _sb = null;
int _i = 0;
int _itot = 0;
String _col = "";
String _oper = "";
RDebugUtils.currentLine=11272192;
 //BA.debugLineNum = 11272192;BA.debugLine="Sub UpdateAll(tblFields As Map, operators As List)";
RDebugUtils.currentLine=11272193;
 //BA.debugLineNum = 11272193;BA.debugLine="If operators = Null Then operators = EQOperators(";
if (_operators== null) { 
_operators = __ref._eqoperators /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);};
RDebugUtils.currentLine=11272194;
 //BA.debugLineNum = 11272194;BA.debugLine="Dim listOfTypes As List = GetMapTypes(tblFields)";
_listoftypes = new anywheresoftware.b4a.objects.collections.List();
_listoftypes = __ref._getmaptypes /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=11272195;
 //BA.debugLineNum = 11272195;BA.debugLine="Dim args As List = GetMapValues(tblFields)";
_args = new anywheresoftware.b4a.objects.collections.List();
_args = __ref._getmapvalues /*anywheresoftware.b4a.objects.collections.List*/ (null,_tblfields);
RDebugUtils.currentLine=11272196;
 //BA.debugLineNum = 11272196;BA.debugLine="Dim sb As StringBuilder";
_sb = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=11272197;
 //BA.debugLineNum = 11272197;BA.debugLine="sb.Initialize";
_sb.Initialize();
RDebugUtils.currentLine=11272198;
 //BA.debugLineNum = 11272198;BA.debugLine="sb.Append($\"UPDATE ${EscapeField(TableName)} SET";
_sb.Append(("UPDATE "+__c.SmartStringFormatter("",(Object)(__ref._escapefield /*String*/ (null,__ref._tablename /*String*/ )))+" SET "));
RDebugUtils.currentLine=11272199;
 //BA.debugLineNum = 11272199;BA.debugLine="Dim i As Int";
_i = 0;
RDebugUtils.currentLine=11272200;
 //BA.debugLineNum = 11272200;BA.debugLine="Dim iTot As Int = tblFields.Size - 1";
_itot = (int) (_tblfields.getSize()-1);
RDebugUtils.currentLine=11272201;
 //BA.debugLineNum = 11272201;BA.debugLine="For i = 0 To iTot";
{
final int step9 = 1;
final int limit9 = _itot;
_i = (int) (0) ;
for (;_i <= limit9 ;_i = _i + step9 ) {
RDebugUtils.currentLine=11272202;
 //BA.debugLineNum = 11272202;BA.debugLine="Dim col As String = tblFields.GetKeyAt(i)";
_col = BA.ObjectToString(_tblfields.GetKeyAt(_i));
RDebugUtils.currentLine=11272203;
 //BA.debugLineNum = 11272203;BA.debugLine="Dim oper As String = operators.Get(i)";
_oper = BA.ObjectToString(_operators.Get(_i));
RDebugUtils.currentLine=11272204;
 //BA.debugLineNum = 11272204;BA.debugLine="sb.Append(col)";
_sb.Append(_col);
RDebugUtils.currentLine=11272205;
 //BA.debugLineNum = 11272205;BA.debugLine="If i <> iTot Then";
if (_i!=_itot) { 
RDebugUtils.currentLine=11272206;
 //BA.debugLineNum = 11272206;BA.debugLine="sb.Append(\" = ?,\")";
_sb.Append(" = ?,");
 }else {
RDebugUtils.currentLine=11272208;
 //BA.debugLineNum = 11272208;BA.debugLine="sb.Append($\" ${oper} ?\"$)";
_sb.Append((" "+__c.SmartStringFormatter("",(Object)(_oper))+" ?"));
 };
 }
};
RDebugUtils.currentLine=11272211;
 //BA.debugLineNum = 11272211;BA.debugLine="query = sb.tostring";
__ref._query /*String*/  = _sb.ToString();
RDebugUtils.currentLine=11272212;
 //BA.debugLineNum = 11272212;BA.debugLine="args = args";
__ref._args /*anywheresoftware.b4a.objects.collections.List*/  = __ref._args /*anywheresoftware.b4a.objects.collections.List*/ ;
RDebugUtils.currentLine=11272213;
 //BA.debugLineNum = 11272213;BA.debugLine="types = listOfTypes";
__ref._types /*anywheresoftware.b4a.objects.collections.List*/  = _listoftypes;
RDebugUtils.currentLine=11272214;
 //BA.debugLineNum = 11272214;BA.debugLine="command = \"update\"";
__ref._command /*String*/  = "update";
RDebugUtils.currentLine=11272215;
 //BA.debugLineNum = 11272215;BA.debugLine="Return Me";
if (true) return (b4j.example.bananomysql)(this);
RDebugUtils.currentLine=11272216;
 //BA.debugLineNum = 11272216;BA.debugLine="End Sub";
return null;
}
}