
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmcontainer {
    public static RemoteObject myClass;
	public vmcontainer() {
	}
    public static PCBA staticBA = new PCBA(null, vmcontainer.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _container = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _grid = RemoteObject.declareNull("b4j.example.vmgrid");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _controls = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _strings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _integers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _booleans = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _doubles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dates = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _defaults = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _required = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _mode = RemoteObject.createImmutable("");
public static RemoteObject _totalrows = RemoteObject.createImmutable(0);
public static RemoteObject _sortitm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _sortitl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _cells = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _visibility = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _rowstyles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _designmode = RemoteObject.createImmutable(false);
public static RemoteObject _hasinfobox = RemoteObject.createImmutable(false);
public static RemoteObject _exclusions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"Booleans",_ref.getField(false, "_booleans"),"cells",_ref.getField(false, "_cells"),"Container",_ref.getField(false, "_container"),"Controls",_ref.getField(false, "_controls"),"Dates",_ref.getField(false, "_dates"),"Defaults",_ref.getField(false, "_defaults"),"DesignMode",_ref.getField(false, "_designmode"),"Doubles",_ref.getField(false, "_doubles"),"Exclusions",_ref.getField(false, "_exclusions"),"Fields",_ref.getField(false, "_fields"),"Grid",_ref.getField(false, "_grid"),"HasInfoBox",_ref.getField(false, "_hasinfobox"),"ID",_ref.getField(false, "_id"),"Integers",_ref.getField(false, "_integers"),"Mode",_ref.getField(false, "_mode"),"module",_ref.getField(false, "_module"),"Required",_ref.getField(false, "_required"),"rows",_ref.getField(false, "_rows"),"rowStyles",_ref.getField(false, "_rowstyles"),"sortItL",_ref.getField(false, "_sortitl"),"sortitM",_ref.getField(false, "_sortitm"),"Strings",_ref.getField(false, "_strings"),"TotalRows",_ref.getField(false, "_totalrows"),"visibility",_ref.getField(false, "_visibility"),"vue",_ref.getField(false, "_vue")};
}
}