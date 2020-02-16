
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmlistview {
    public static RemoteObject myClass;
	public vmlistview() {
	}
    public static PCBA staticBA = new PCBA(null, vmlistview.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _listview = RemoteObject.declareNull("b4j.example.vmlist");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _hascontent = RemoteObject.createImmutable(false);
public static RemoteObject _eventhandler = RemoteObject.declareNull("Object");
public static RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"eventHandler",_ref.getField(false, "_eventhandler"),"HasContent",_ref.getField(false, "_hascontent"),"ID",_ref.getField(false, "_id"),"items",_ref.getField(false, "_items"),"ListView",_ref.getField(false, "_listview"),"vue",_ref.getField(false, "_vue")};
}
}