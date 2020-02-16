
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmelement {
    public static RemoteObject myClass;
	public vmelement() {
	}
    public static PCBA staticBA = new PCBA(null, vmelement.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _element = RemoteObject.declareNull("b4j.example.vuehtml");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _hascontent = RemoteObject.createImmutable(false);
public static RemoteObject _rowclass = RemoteObject.createImmutable("");
public static RemoteObject _cellclass = RemoteObject.createImmutable("");
public static RemoteObject _offclass = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _colclass = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _showkey = RemoteObject.createImmutable("");
public static RemoteObject _diskey = RemoteObject.createImmutable("");
public static RemoteObject _reqkey = RemoteObject.createImmutable("");
public static RemoteObject _errkey = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"cellClass",_ref.getField(false, "_cellclass"),"colClass",_ref.getField(false, "_colclass"),"disKey",_ref.getField(false, "_diskey"),"Element",_ref.getField(false, "_element"),"errKey",_ref.getField(false, "_errkey"),"hasContent",_ref.getField(false, "_hascontent"),"ID",_ref.getField(false, "_id"),"offClass",_ref.getField(false, "_offclass"),"reqKey",_ref.getField(false, "_reqkey"),"rowClass",_ref.getField(false, "_rowclass"),"showKey",_ref.getField(false, "_showkey"),"vue",_ref.getField(false, "_vue")};
}
}