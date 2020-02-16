
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmtextarea {
    public static RemoteObject myClass;
	public vmtextarea() {
	}
    public static PCBA staticBA = new PCBA(null, vmtextarea.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _textarea = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _internal = RemoteObject.declareNull("b4j.example.vmfield");
public static RemoteObject _lbl = RemoteObject.declareNull("b4j.example.vmlabel");
public static RemoteObject _hashelp = RemoteObject.createImmutable(false);
public static RemoteObject _ht = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _haserror = RemoteObject.createImmutable(false);
public static RemoteObject _he = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _icon1 = RemoteObject.declareNull("b4j.example.vmicon");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"hasError",_ref.getField(false, "_haserror"),"hasHelp",_ref.getField(false, "_hashelp"),"he",_ref.getField(false, "_he"),"ht",_ref.getField(false, "_ht"),"icon1",_ref.getField(false, "_icon1"),"ID",_ref.getField(false, "_id"),"Internal",_ref.getField(false, "_internal"),"lbl",_ref.getField(false, "_lbl"),"module",_ref.getField(false, "_module"),"TextArea",_ref.getField(false, "_textarea"),"vue",_ref.getField(false, "_vue")};
}
}