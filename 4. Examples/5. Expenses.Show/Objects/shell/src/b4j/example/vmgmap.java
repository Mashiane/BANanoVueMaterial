
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmgmap {
    public static RemoteObject myClass;
	public vmgmap() {
	}
    public static PCBA staticBA = new PCBA(null, vmgmap.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _gmap = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static RemoteObject _markers = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _points = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _markername = RemoteObject.createImmutable("");
public static RemoteObject _infowindow = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _iwoptions = RemoteObject.createImmutable("");
public static RemoteObject _iwposition = RemoteObject.createImmutable("");
public static RemoteObject _iwopen = RemoteObject.createImmutable("");
public static RemoteObject _curmidx = RemoteObject.createImmutable("");
public static RemoteObject _kmllayer = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _kmlname = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"curMidx",_ref.getField(false, "_curmidx"),"GMap",_ref.getField(false, "_gmap"),"ID",_ref.getField(false, "_id"),"infoWindow",_ref.getField(false, "_infowindow"),"iwOpen",_ref.getField(false, "_iwopen"),"iwOptions",_ref.getField(false, "_iwoptions"),"iwPosition",_ref.getField(false, "_iwposition"),"kmlLayer",_ref.getField(false, "_kmllayer"),"kmlName",_ref.getField(false, "_kmlname"),"markerName",_ref.getField(false, "_markername"),"markers",_ref.getField(false, "_markers"),"module",_ref.getField(false, "_module"),"options",_ref.getField(false, "_options"),"points",_ref.getField(false, "_points"),"vue",_ref.getField(false, "_vue")};
}
}