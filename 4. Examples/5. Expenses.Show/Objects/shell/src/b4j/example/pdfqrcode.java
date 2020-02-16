
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdfqrcode {
    public static RemoteObject myClass;
	public pdfqrcode() {
	}
    public static PCBA staticBA = new PCBA(null, pdfqrcode.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _qr = RemoteObject.createImmutable("");
public static RemoteObject _foreground = RemoteObject.createImmutable("");
public static RemoteObject _background = RemoteObject.createImmutable("");
public static RemoteObject _fit = RemoteObject.createImmutable("");
public static RemoteObject _modenumeric = RemoteObject.createImmutable(false);
public static RemoteObject _modealphanumeric = RemoteObject.createImmutable(false);
public static RemoteObject _modeoctet = RemoteObject.createImmutable(false);
public static RemoteObject _ecclevell = RemoteObject.createImmutable(false);
public static RemoteObject _ecclevelm = RemoteObject.createImmutable(false);
public static RemoteObject _ecclevelq = RemoteObject.createImmutable(false);
public static RemoteObject _ecclevelh = RemoteObject.createImmutable(false);
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
		return new Object[] {"background",_ref.getField(false, "_background"),"BANano",_ref.getField(false, "_banano"),"eccLevelH",_ref.getField(false, "_ecclevelh"),"eccLevelL",_ref.getField(false, "_ecclevell"),"eccLevelM",_ref.getField(false, "_ecclevelm"),"eccLevelQ",_ref.getField(false, "_ecclevelq"),"fit",_ref.getField(false, "_fit"),"foreground",_ref.getField(false, "_foreground"),"modeAlphanumeric",_ref.getField(false, "_modealphanumeric"),"modeNumeric",_ref.getField(false, "_modenumeric"),"modeOctet",_ref.getField(false, "_modeoctet"),"options",_ref.getField(false, "_options"),"pageOrientation",_ref.getField(false, "_pageorientation"),"qr",_ref.getField(false, "_qr")};
}
}