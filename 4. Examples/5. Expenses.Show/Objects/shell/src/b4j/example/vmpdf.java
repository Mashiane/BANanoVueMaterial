
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmpdf {
    public static RemoteObject myClass;
	public vmpdf() {
	}
    public static PCBA staticBA = new PCBA(null, vmpdf.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _pdf = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _dockey = RemoteObject.createImmutable("");
public static RemoteObject _docvisible = RemoteObject.createImmutable("");
public static RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _jq = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"docKey",_ref.getField(false, "_dockey"),"docVisible",_ref.getField(false, "_docvisible"),"ID",_ref.getField(false, "_id"),"JQ",_ref.getField(false, "_jq"),"options",_ref.getField(false, "_options"),"PDF",_ref.getField(false, "_pdf"),"vue",_ref.getField(false, "_vue")};
}
}