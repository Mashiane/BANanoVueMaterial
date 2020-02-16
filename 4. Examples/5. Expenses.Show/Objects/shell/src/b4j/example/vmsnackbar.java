
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmsnackbar {
    public static RemoteObject myClass;
	public vmsnackbar() {
	}
    public static PCBA staticBA = new PCBA(null, vmsnackbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _snackbar = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _bactive = RemoteObject.createImmutable(false);
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static RemoteObject _mkey = RemoteObject.createImmutable("");
public static RemoteObject _button = RemoteObject.declareNull("b4j.example.vmbutton");
public static RemoteObject _mname = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bActive",_ref.getField(false, "_bactive"),"BANano",_ref.getField(false, "_banano"),"Button",_ref.getField(false, "_button"),"ID",_ref.getField(false, "_id"),"mKey",_ref.getField(false, "_mkey"),"mName",_ref.getField(false, "_mname"),"module",_ref.getField(false, "_module"),"Snackbar",_ref.getField(false, "_snackbar"),"vue",_ref.getField(false, "_vue")};
}
}