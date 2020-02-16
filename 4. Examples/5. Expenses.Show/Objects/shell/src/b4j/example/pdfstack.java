
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdfstack {
    public static RemoteObject myClass;
	public pdfstack() {
	}
    public static PCBA staticBA = new PCBA(null, pdfstack.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _contentint = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _contents = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _style = RemoteObject.declareNull("b4j.example.pdfstyle");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"contentInt",_ref.getField(false, "_contentint"),"contents",_ref.getField(false, "_contents"),"style",_ref.getField(false, "_style")};
}
}