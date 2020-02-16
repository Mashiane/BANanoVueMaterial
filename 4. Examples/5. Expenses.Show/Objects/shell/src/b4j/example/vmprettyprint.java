
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmprettyprint {
    public static RemoteObject myClass;
	public vmprettyprint() {
	}
    public static PCBA staticBA = new PCBA(null, vmprettyprint.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pp = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _codename = RemoteObject.createImmutable("");
public static RemoteObject _codevisible = RemoteObject.createImmutable("");
public static RemoteObject _codeel = RemoteObject.declareNull("b4j.example.vmelement");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"CodeEL",_ref.getField(false, "_codeel"),"codeName",_ref.getField(false, "_codename"),"codevisible",_ref.getField(false, "_codevisible"),"ID",_ref.getField(false, "_id"),"PP",_ref.getField(false, "_pp"),"vue",_ref.getField(false, "_vue")};
}
}