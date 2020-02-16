
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmfrappegantt {
    public static RemoteObject myClass;
	public vmfrappegantt() {
	}
    public static PCBA staticBA = new PCBA(null, vmfrappegantt.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _p = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _frappegantt = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _enumview = RemoteObject.declareNull("b4j.example.vmfrappegantt._viewtype");
public static RemoteObject _tasks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _bofg = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"boFG",_ref.getField(false, "_bofg"),"EnumView",_ref.getField(false, "_enumview"),"FrappeGantt",_ref.getField(false, "_frappegantt"),"ID",_ref.getField(false, "_id"),"module",_ref.getField(false, "_module"),"options",_ref.getField(false, "_options"),"p",_ref.getField(false, "_p"),"Tasks",_ref.getField(false, "_tasks"),"vue",_ref.getField(false, "_vue")};
}
}