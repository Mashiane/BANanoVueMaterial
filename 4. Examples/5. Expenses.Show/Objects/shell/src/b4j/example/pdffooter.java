
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdffooter {
    public static RemoteObject myClass;
	public pdffooter() {
	}
    public static PCBA staticBA = new PCBA(null, pdffooter.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _leftpart = RemoteObject.declareNull("b4j.example.pdftext");
public static RemoteObject _rightpart = RemoteObject.declareNull("b4j.example.pdftext");
public static RemoteObject _cols = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _ftr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _style = RemoteObject.declareNull("b4j.example.pdfstyle");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"cols",_ref.getField(false, "_cols"),"ftr",_ref.getField(false, "_ftr"),"LeftPart",_ref.getField(false, "_leftpart"),"RightPart",_ref.getField(false, "_rightpart"),"style",_ref.getField(false, "_style")};
}
}