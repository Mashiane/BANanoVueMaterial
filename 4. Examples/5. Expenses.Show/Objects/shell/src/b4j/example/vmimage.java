
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmimage {
    public static RemoteObject myClass;
	public vmimage() {
	}
    public static PCBA staticBA = new PCBA(null, vmimage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _image = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _hastt = RemoteObject.createImmutable(false);
public static RemoteObject _tt = RemoteObject.declareNull("b4j.example.vmtooltip");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"hasTT",_ref.getField(false, "_hastt"),"ID",_ref.getField(false, "_id"),"Image",_ref.getField(false, "_image"),"module",_ref.getField(false, "_module"),"tt",_ref.getField(false, "_tt"),"vue",_ref.getField(false, "_vue")};
}
}