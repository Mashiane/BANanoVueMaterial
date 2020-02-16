
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmradiogroup {
    public static RemoteObject myClass;
	public vmradiogroup() {
	}
    public static PCBA staticBA = new PCBA(null, vmradiogroup.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _radiogroup = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _lbl = RemoteObject.declareNull("b4j.example.vmlabel");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _vmodel = RemoteObject.createImmutable("");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static RemoteObject _designmode = RemoteObject.createImmutable(false);
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"designMode",_ref.getField(false, "_designmode"),"ID",_ref.getField(false, "_id"),"lbl",_ref.getField(false, "_lbl"),"module",_ref.getField(false, "_module"),"RadioGroup",_ref.getField(false, "_radiogroup"),"vmodel",_ref.getField(false, "_vmodel"),"vue",_ref.getField(false, "_vue")};
}
}