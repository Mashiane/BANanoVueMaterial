
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bananomysql {
    public static RemoteObject myClass;
	public bananomysql() {
	}
    public static PCBA staticBA = new PCBA(null, bananomysql.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _rectype = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _db_varchar_20 = RemoteObject.createImmutable("");
public static RemoteObject _db_varchar_10 = RemoteObject.createImmutable("");
public static RemoteObject _db_varchar_30 = RemoteObject.createImmutable("");
public static RemoteObject _db_varchar_40 = RemoteObject.createImmutable("");
public static RemoteObject _db_varchar_50 = RemoteObject.createImmutable("");
public static RemoteObject _db_varchar_100 = RemoteObject.createImmutable("");
public static RemoteObject _db_varchar_255 = RemoteObject.createImmutable("");
public static RemoteObject _db_string = RemoteObject.createImmutable("");
public static RemoteObject _db_int = RemoteObject.createImmutable("");
public static RemoteObject _db_float = RemoteObject.createImmutable("");
public static RemoteObject _db_blob = RemoteObject.createImmutable("");
public static RemoteObject _db_bool = RemoteObject.createImmutable("");
public static RemoteObject _db_real = RemoteObject.createImmutable("");
public static RemoteObject _db_date = RemoteObject.createImmutable("");
public static RemoteObject _db_integer = RemoteObject.createImmutable("");
public static RemoteObject _db_text = RemoteObject.createImmutable("");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _methodname = RemoteObject.createImmutable("");
public static RemoteObject _methodnamedynamic = RemoteObject.createImmutable("");
public static RemoteObject _schema = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _host = RemoteObject.createImmutable("");
public static RemoteObject _username = RemoteObject.createImmutable("");
public static RemoteObject _password = RemoteObject.createImmutable("");
public static RemoteObject _dbase = RemoteObject.createImmutable("");
public static RemoteObject _result = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _command = RemoteObject.createImmutable("");
public static RemoteObject _types = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _args = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _query = RemoteObject.createImmutable("");
public static RemoteObject _response = RemoteObject.createImmutable("");
public static RemoteObject _error = RemoteObject.createImmutable("");
public static RemoteObject _affectedrows = RemoteObject.createImmutable(0L);
public static RemoteObject _json = RemoteObject.createImmutable("");
public static RemoteObject _ok = RemoteObject.createImmutable(false);
public static RemoteObject _tablename = RemoteObject.createImmutable("");
public static RemoteObject _primarykey = RemoteObject.createImmutable("");
public static RemoteObject _record = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"affectedRows",_ref.getField(false, "_affectedrows"),"args",_ref.getField(false, "_args"),"BANano",_ref.getField(false, "_banano"),"command",_ref.getField(false, "_command"),"DB_BLOB",_ref.getField(false, "_db_blob"),"DB_BOOL",_ref.getField(false, "_db_bool"),"DB_DATE",_ref.getField(false, "_db_date"),"DB_FLOAT",_ref.getField(false, "_db_float"),"DB_INT",_ref.getField(false, "_db_int"),"DB_INTEGER",_ref.getField(false, "_db_integer"),"DB_REAL",_ref.getField(false, "_db_real"),"DB_STRING",_ref.getField(false, "_db_string"),"DB_TEXT",_ref.getField(false, "_db_text"),"DB_VARCHAR_10",_ref.getField(false, "_db_varchar_10"),"DB_VARCHAR_100",_ref.getField(false, "_db_varchar_100"),"DB_VARCHAR_20",_ref.getField(false, "_db_varchar_20"),"DB_VARCHAR_255",_ref.getField(false, "_db_varchar_255"),"DB_VARCHAR_30",_ref.getField(false, "_db_varchar_30"),"DB_VARCHAR_40",_ref.getField(false, "_db_varchar_40"),"DB_VARCHAR_50",_ref.getField(false, "_db_varchar_50"),"DBase",_ref.getField(false, "_dbase"),"error",_ref.getField(false, "_error"),"host",_ref.getField(false, "_host"),"json",_ref.getField(false, "_json"),"MethodName",_ref.getField(false, "_methodname"),"MethodNameDynamic",_ref.getField(false, "_methodnamedynamic"),"OK",_ref.getField(false, "_ok"),"password",_ref.getField(false, "_password"),"PrimaryKey",_ref.getField(false, "_primarykey"),"query",_ref.getField(false, "_query"),"Record",_ref.getField(false, "_record"),"recType",_ref.getField(false, "_rectype"),"response",_ref.getField(false, "_response"),"result",_ref.getField(false, "_result"),"Schema",_ref.getField(false, "_schema"),"TableName",_ref.getField(false, "_tablename"),"types",_ref.getField(false, "_types"),"username",_ref.getField(false, "_username")};
}
}