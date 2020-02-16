
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmtoolbar {
    public static RemoteObject myClass;
	public vmtoolbar() {
	}
    public static PCBA staticBA = new PCBA(null, vmtoolbar.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _toolbar = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _hascontent = RemoteObject.createImmutable(false);
public static RemoteObject _endsection = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _startsection = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"EndSection",_ref.getField(false, "_endsection"),"HasContent",_ref.getField(false, "_hascontent"),"ID",_ref.getField(false, "_id"),"module",_ref.getField(false, "_module"),"StartSection",_ref.getField(false, "_startsection"),"ToolBar",_ref.getField(false, "_toolbar"),"vue",_ref.getField(false, "_vue")};
}
}