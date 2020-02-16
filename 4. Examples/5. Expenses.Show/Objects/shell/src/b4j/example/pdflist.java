
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdflist {
    public static RemoteObject myClass;
	public pdflist() {
	}
    public static PCBA staticBA = new PCBA(null, pdflist.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _listx = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _ltype = RemoteObject.createImmutable("");
public static RemoteObject _reversed = RemoteObject.createImmutable(false);
public static RemoteObject _start = RemoteObject.createImmutable(0);
public static RemoteObject _color = RemoteObject.createImmutable("");
public static RemoteObject _markercolor = RemoteObject.createImmutable("");
public static RemoteObject _separator = RemoteObject.createImmutable("");
public static RemoteObject _liststyle = RemoteObject.declareNull("b4j.example.pdflist._liststyleobj");
public static RemoteObject _style = RemoteObject.createImmutable("");
public static RemoteObject _pageorientation = RemoteObject.createImmutable("");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"color",_ref.getField(false, "_color"),"items",_ref.getField(false, "_items"),"ListStyle",_ref.getField(false, "_liststyle"),"listX",_ref.getField(false, "_listx"),"lType",_ref.getField(false, "_ltype"),"markerColor",_ref.getField(false, "_markercolor"),"pageOrientation",_ref.getField(false, "_pageorientation"),"reversed",_ref.getField(false, "_reversed"),"separator",_ref.getField(false, "_separator"),"start",_ref.getField(false, "_start"),"Style",_ref.getField(false, "_style")};
}
}