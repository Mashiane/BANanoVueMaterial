
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bananoalasql {
    public static RemoteObject myClass;
	public bananoalasql() {
	}
    public static PCBA staticBA = new PCBA(null, bananoalasql.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _db_bool = RemoteObject.createImmutable("");
public static RemoteObject _db_int = RemoteObject.createImmutable("");
public static RemoteObject _db_string = RemoteObject.createImmutable("");
public static RemoteObject _db_real = RemoteObject.createImmutable("");
public static RemoteObject _db_date = RemoteObject.createImmutable("");
public static RemoteObject _db_blob = RemoteObject.createImmutable("");
public static RemoteObject _db_float = RemoteObject.createImmutable("");
public static RemoteObject _db_integer = RemoteObject.createImmutable("");
public static RemoteObject _db_text = RemoteObject.createImmutable("");
public static RemoteObject _rectype = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _schema = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"DB_BLOB",_ref.getField(false, "_db_blob"),"DB_BOOL",_ref.getField(false, "_db_bool"),"DB_DATE",_ref.getField(false, "_db_date"),"DB_FLOAT",_ref.getField(false, "_db_float"),"DB_INT",_ref.getField(false, "_db_int"),"DB_INTEGER",_ref.getField(false, "_db_integer"),"DB_REAL",_ref.getField(false, "_db_real"),"DB_STRING",_ref.getField(false, "_db_string"),"DB_TEXT",_ref.getField(false, "_db_text"),"recType",_ref.getField(false, "_rectype"),"Schema",_ref.getField(false, "_schema")};
}
}