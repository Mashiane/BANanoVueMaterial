
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vminfobox {
    public static RemoteObject myClass;
	public vminfobox() {
	}
    public static PCBA staticBA = new PCBA(null, vminfobox.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _infobox = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _icon = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _content = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _text = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _countit = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _i = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _hasicon = RemoteObject.createImmutable(false);
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"banano",_ref.getField(false, "_banano"),"Content",_ref.getField(false, "_content"),"CountIt",_ref.getField(false, "_countit"),"hasIcon",_ref.getField(false, "_hasicon"),"i",_ref.getField(false, "_i"),"Icon",_ref.getField(false, "_icon"),"ID",_ref.getField(false, "_id"),"InfoBox",_ref.getField(false, "_infobox"),"module",_ref.getField(false, "_module"),"Text",_ref.getField(false, "_text"),"vue",_ref.getField(false, "_vue")};
}
}