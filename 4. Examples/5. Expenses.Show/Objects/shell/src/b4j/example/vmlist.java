
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmlist {
    public static RemoteObject myClass;
	public vmlist() {
	}
    public static PCBA staticBA = new PCBA(null, vmlist.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _list = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _hascontent = RemoteObject.createImmutable(false);
public static RemoteObject _eventhandler = RemoteObject.declareNull("Object");
public static RemoteObject _ispropertybag = RemoteObject.createImmutable(false);
public static RemoteObject _expands = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"eventHandler",_ref.getField(false, "_eventhandler"),"expandS",_ref.getField(false, "_expands"),"HasContent",_ref.getField(false, "_hascontent"),"ID",_ref.getField(false, "_id"),"isPropertyBag",_ref.getField(false, "_ispropertybag"),"List",_ref.getField(false, "_list"),"vue",_ref.getField(false, "_vue")};
}
}