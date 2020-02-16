
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmmenu {
    public static RemoteObject myClass;
	public vmmenu() {
	}
    public static PCBA staticBA = new PCBA(null, vmmenu.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _menu = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _menucontent = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _bactive = RemoteObject.createImmutable(false);
public static RemoteObject _eventhandler = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bActive",_ref.getField(false, "_bactive"),"BANano",_ref.getField(false, "_banano"),"eventHandler",_ref.getField(false, "_eventhandler"),"ID",_ref.getField(false, "_id"),"Menu",_ref.getField(false, "_menu"),"MenuContent",_ref.getField(false, "_menucontent"),"vue",_ref.getField(false, "_vue")};
}
}