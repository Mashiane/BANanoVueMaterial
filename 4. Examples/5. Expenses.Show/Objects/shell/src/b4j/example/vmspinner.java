
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmspinner {
    public static RemoteObject myClass;
	public vmspinner() {
	}
    public static PCBA staticBA = new PCBA(null, vmspinner.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _spinner = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static RemoteObject _bindvalue = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"bindvalue",_ref.getField(false, "_bindvalue"),"ID",_ref.getField(false, "_id"),"module",_ref.getField(false, "_module"),"Spinner",_ref.getField(false, "_spinner"),"vue",_ref.getField(false, "_vue")};
}
}