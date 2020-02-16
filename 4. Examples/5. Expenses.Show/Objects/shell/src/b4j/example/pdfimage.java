
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdfimage {
    public static RemoteObject myClass;
	public pdfimage() {
	}
    public static PCBA staticBA = new PCBA(null, pdfimage.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _image = RemoteObject.createImmutable("");
public static RemoteObject _width = RemoteObject.createImmutable(0);
public static RemoteObject _height = RemoteObject.createImmutable(0);
public static RemoteObject _pagebreakafter = RemoteObject.createImmutable(false);
public static RemoteObject _pagebreakbefore = RemoteObject.createImmutable(false);
public static RemoteObject _pageorientation = RemoteObject.createImmutable("");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _link = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"height",_ref.getField(false, "_height"),"image",_ref.getField(false, "_image"),"link",_ref.getField(false, "_link"),"options",_ref.getField(false, "_options"),"pageBreakAfter",_ref.getField(false, "_pagebreakafter"),"pageBreakBefore",_ref.getField(false, "_pagebreakbefore"),"pageOrientation",_ref.getField(false, "_pageorientation"),"width",_ref.getField(false, "_width")};
}
}