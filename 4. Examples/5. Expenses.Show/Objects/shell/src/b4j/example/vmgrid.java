
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmgrid {
    public static RemoteObject myClass;
	public vmgrid() {
	}
    public static PCBA staticBA = new PCBA(null, vmgrid.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _grid = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _columns = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _lastrow = RemoteObject.createImmutable(0);
public static RemoteObject _rc = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _rowclass = RemoteObject.createImmutable("");
public static RemoteObject _cellclass = RemoteObject.createImmutable("");
public static RemoteObject _showid = RemoteObject.createImmutable(false);
public static RemoteObject _components = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _rowclasses = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _offclass = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _colclass = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _rowstyles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _attributes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _isbuilt = RemoteObject.createImmutable(false);
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"attributes",_ref.getField(false, "_attributes"),"BANano",_ref.getField(false, "_banano"),"cellClass",_ref.getField(false, "_cellclass"),"colClass",_ref.getField(false, "_colclass"),"Columns",_ref.getField(false, "_columns"),"Components",_ref.getField(false, "_components"),"Grid",_ref.getField(false, "_grid"),"ID",_ref.getField(false, "_id"),"isBuilt",_ref.getField(false, "_isbuilt"),"LastRow",_ref.getField(false, "_lastrow"),"module",_ref.getField(false, "_module"),"offClass",_ref.getField(false, "_offclass"),"RC",_ref.getField(false, "_rc"),"rowClass",_ref.getField(false, "_rowclass"),"rowClasses",_ref.getField(false, "_rowclasses"),"Rows",_ref.getField(false, "_rows"),"rowStyles",_ref.getField(false, "_rowstyles"),"ShowID",_ref.getField(false, "_showid"),"vue",_ref.getField(false, "_vue")};
}
}