
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmnumberinput {
    public static RemoteObject myClass;
	public vmnumberinput() {
	}
    public static PCBA staticBA = new PCBA(null, vmnumberinput.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _numberinput = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _div = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _lbl = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _mdl = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"div",_ref.getField(false, "_div"),"ID",_ref.getField(false, "_id"),"lbl",_ref.getField(false, "_lbl"),"mdl",_ref.getField(false, "_mdl"),"NumberInput",_ref.getField(false, "_numberinput"),"vue",_ref.getField(false, "_vue")};
}
}