
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmselect {
    public static RemoteObject myClass;
	public vmselect() {
	}
    public static PCBA staticBA = new PCBA(null, vmselect.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _combo = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _comboint = RemoteObject.declareNull("b4j.example.vmfield");
public static RemoteObject _lbl = RemoteObject.declareNull("b4j.example.vmlabel");
public static RemoteObject _hashelp = RemoteObject.createImmutable(false);
public static RemoteObject _ht = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _et = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _haserror = RemoteObject.createImmutable(false);
public static RemoteObject _xname = RemoteObject.createImmutable("");
public static RemoteObject _xmodel = RemoteObject.createImmutable("");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"Combo",_ref.getField(false, "_combo"),"ComboInt",_ref.getField(false, "_comboint"),"et",_ref.getField(false, "_et"),"hasError",_ref.getField(false, "_haserror"),"hasHelp",_ref.getField(false, "_hashelp"),"ht",_ref.getField(false, "_ht"),"ID",_ref.getField(false, "_id"),"lbl",_ref.getField(false, "_lbl"),"module",_ref.getField(false, "_module"),"vue",_ref.getField(false, "_vue"),"xmodel",_ref.getField(false, "_xmodel"),"xname",_ref.getField(false, "_xname")};
}
}