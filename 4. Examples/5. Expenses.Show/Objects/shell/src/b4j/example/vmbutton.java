
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmbutton {
    public static RemoteObject myClass;
	public vmbutton() {
	}
    public static PCBA staticBA = new PCBA(null, vmbutton.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _button = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _hasbadge = RemoteObject.createImmutable(false);
public static RemoteObject _badge = RemoteObject.declareNull("b4j.example.vmbadge");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"badge",_ref.getField(false, "_badge"),"Button",_ref.getField(false, "_button"),"hasBadge",_ref.getField(false, "_hasbadge"),"ID",_ref.getField(false, "_id"),"vue",_ref.getField(false, "_vue")};
}
}