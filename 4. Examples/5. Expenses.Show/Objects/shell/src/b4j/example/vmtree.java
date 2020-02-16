
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmtree {
    public static RemoteObject myClass;
	public vmtree() {
	}
    public static PCBA staticBA = new PCBA(null, vmtree.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _tree = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _eventhandler = RemoteObject.declareNull("Object");
public static RemoteObject _expandicon = RemoteObject.createImmutable("");
public static RemoteObject _collapseicon = RemoteObject.createImmutable("");
public static RemoteObject _treebo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _iconslibrary = RemoteObject.createImmutable("");
public static RemoteObject _imageurlfield = RemoteObject.createImmutable("");
public static RemoteObject _imagehtmlfield = RemoteObject.createImmutable("");
public static RemoteObject _jq = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"CollapseIcon",_ref.getField(false, "_collapseicon"),"eventHandler",_ref.getField(false, "_eventhandler"),"ExpandIcon",_ref.getField(false, "_expandicon"),"IconsLibrary",_ref.getField(false, "_iconslibrary"),"ID",_ref.getField(false, "_id"),"ImageHtmlField",_ref.getField(false, "_imagehtmlfield"),"ImageUrlField",_ref.getField(false, "_imageurlfield"),"JQ",_ref.getField(false, "_jq"),"options",_ref.getField(false, "_options"),"Tree",_ref.getField(false, "_tree"),"treeBO",_ref.getField(false, "_treebo"),"vue",_ref.getField(false, "_vue")};
}
}