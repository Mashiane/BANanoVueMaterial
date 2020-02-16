
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmavatar {
    public static RemoteObject myClass;
	public vmavatar() {
	}
    public static PCBA staticBA = new PCBA(null, vmavatar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _avatar = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _img = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _hasimage = RemoteObject.createImmutable(false);
public static RemoteObject _hasbadge = RemoteObject.createImmutable(false);
public static RemoteObject _badge = RemoteObject.declareNull("b4j.example.vmbadge");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Avatar",_ref.getField(false, "_avatar"),"badge",_ref.getField(false, "_badge"),"hasBadge",_ref.getField(false, "_hasbadge"),"hasImage",_ref.getField(false, "_hasimage"),"ID",_ref.getField(false, "_id"),"img",_ref.getField(false, "_img"),"module",_ref.getField(false, "_module"),"vue",_ref.getField(false, "_vue")};
}
}