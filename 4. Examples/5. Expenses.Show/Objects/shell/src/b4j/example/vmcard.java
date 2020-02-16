
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmcard {
    public static RemoteObject myClass;
	public vmcard() {
	}
    public static PCBA staticBA = new PCBA(null, vmcard.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _card = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _header = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _content = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _actions = RemoteObject.declareNull("b4j.example.vmcardactions");
public static RemoteObject _headertext = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _media = RemoteObject.declareNull("b4j.example.vmcardmedia");
public static RemoteObject _monside = RemoteObject.createImmutable(false);
public static RemoteObject _avatar = RemoteObject.declareNull("b4j.example.vmavatar");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Actions",_ref.getField(false, "_actions"),"Avatar",_ref.getField(false, "_avatar"),"BANano",_ref.getField(false, "_banano"),"Card",_ref.getField(false, "_card"),"Content",_ref.getField(false, "_content"),"Header",_ref.getField(false, "_header"),"HeaderText",_ref.getField(false, "_headertext"),"ID",_ref.getField(false, "_id"),"Media",_ref.getField(false, "_media"),"module",_ref.getField(false, "_module"),"monside",_ref.getField(false, "_monside"),"vue",_ref.getField(false, "_vue")};
}
}