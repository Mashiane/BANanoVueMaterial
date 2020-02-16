
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmdrawer {
    public static RemoteObject myClass;
	public vmdrawer() {
	}
    public static PCBA staticBA = new PCBA(null, vmdrawer.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _drawer = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _bactive = RemoteObject.createImmutable(false);
public static RemoteObject _drawerlist = RemoteObject.declareNull("b4j.example.vmlist");
public static RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mshow = RemoteObject.createImmutable("");
public static RemoteObject _toolbar = RemoteObject.declareNull("b4j.example.vmtoolbar");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"bActive",_ref.getField(false, "_bactive"),"Drawer",_ref.getField(false, "_drawer"),"DrawerList",_ref.getField(false, "_drawerlist"),"ID",_ref.getField(false, "_id"),"items",_ref.getField(false, "_items"),"module",_ref.getField(false, "_module"),"mshow",_ref.getField(false, "_mshow"),"ToolBar",_ref.getField(false, "_toolbar"),"vue",_ref.getField(false, "_vue")};
}
}