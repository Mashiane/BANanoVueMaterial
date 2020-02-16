
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdftable {
    public static RemoteObject myClass;
	public pdftable() {
	}
    public static PCBA staticBA = new PCBA(null, pdftable.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _layout = RemoteObject.createImmutable("");
public static RemoteObject _lighthorizontallines = RemoteObject.createImmutable(false);
public static RemoteObject _noborders = RemoteObject.createImmutable(false);
public static RemoteObject _headerlineonly = RemoteObject.createImmutable(false);
public static RemoteObject _headerrows = RemoteObject.createImmutable(0);
public static RemoteObject _table = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _widths = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _heights = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _hdr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _body = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _rows = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _style = RemoteObject.declareNull("b4j.example.pdfstyle");
public static RemoteObject _pageorientation = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"body",_ref.getField(false, "_body"),"hdr",_ref.getField(false, "_hdr"),"headerLineOnly",_ref.getField(false, "_headerlineonly"),"headerRows",_ref.getField(false, "_headerrows"),"heights",_ref.getField(false, "_heights"),"layout",_ref.getField(false, "_layout"),"lightHorizontalLines",_ref.getField(false, "_lighthorizontallines"),"noBorders",_ref.getField(false, "_noborders"),"options",_ref.getField(false, "_options"),"pageOrientation",_ref.getField(false, "_pageorientation"),"rows",_ref.getField(false, "_rows"),"style",_ref.getField(false, "_style"),"table",_ref.getField(false, "_table"),"widths",_ref.getField(false, "_widths")};
}
}