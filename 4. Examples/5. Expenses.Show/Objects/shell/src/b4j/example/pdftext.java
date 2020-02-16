
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdftext {
    public static RemoteObject myClass;
	public pdftext() {
	}
    public static PCBA staticBA = new PCBA(null, pdftext.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _contentint = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _textint = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
public static RemoteObject _link = RemoteObject.createImmutable("");
public static RemoteObject _linktopage = RemoteObject.createImmutable(0);
public static RemoteObject _tocitem = RemoteObject.createImmutable(false);
public static RemoteObject _pageorientation = RemoteObject.createImmutable("");
public static RemoteObject _pagebreakbefore = RemoteObject.createImmutable(false);
public static RemoteObject _pagebreakafter = RemoteObject.createImmutable(false);
public static RemoteObject _style = RemoteObject.declareNull("b4j.example.pdfstyle");
public static RemoteObject _colspan = RemoteObject.createImmutable(0);
public static RemoteObject _rowspan = RemoteObject.createImmutable(0);
public static RemoteObject _linktodestination = RemoteObject.createImmutable("");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _listtype = RemoteObject.createImmutable("");
public static RemoteObject _pagereference = RemoteObject.createImmutable("");
public static RemoteObject _textreference = RemoteObject.createImmutable("");
public static RemoteObject _preserveleadingspaces = RemoteObject.createImmutable(false);
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _tabindex = RemoteObject.createImmutable("");
public static RemoteObject _decoration = RemoteObject.createImmutable("");
public static RemoteObject _decorationstyle = RemoteObject.createImmutable("");
public static RemoteObject _decorationcolor = RemoteObject.createImmutable("");
public static RemoteObject _counter = RemoteObject.createImmutable(0);
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"colSpan",_ref.getField(false, "_colspan"),"contentInt",_ref.getField(false, "_contentint"),"counter",_ref.getField(false, "_counter"),"decoration",_ref.getField(false, "_decoration"),"decorationColor",_ref.getField(false, "_decorationcolor"),"decorationStyle",_ref.getField(false, "_decorationstyle"),"id",_ref.getField(false, "_id"),"link",_ref.getField(false, "_link"),"linkToDestination",_ref.getField(false, "_linktodestination"),"linkToPage",_ref.getField(false, "_linktopage"),"listType",_ref.getField(false, "_listtype"),"pageBreakAfter",_ref.getField(false, "_pagebreakafter"),"pageBreakBefore",_ref.getField(false, "_pagebreakbefore"),"pageOrientation",_ref.getField(false, "_pageorientation"),"pageReference",_ref.getField(false, "_pagereference"),"preserveLeadingSpaces",_ref.getField(false, "_preserveleadingspaces"),"rowSpan",_ref.getField(false, "_rowspan"),"style",_ref.getField(false, "_style"),"tabindex",_ref.getField(false, "_tabindex"),"textInt",_ref.getField(false, "_textint"),"textReference",_ref.getField(false, "_textreference"),"tocItem",_ref.getField(false, "_tocitem")};
}
}