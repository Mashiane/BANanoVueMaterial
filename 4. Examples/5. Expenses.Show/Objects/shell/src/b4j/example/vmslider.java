
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmslider {
    public static RemoteObject myClass;
	public vmslider() {
	}
    public static PCBA staticBA = new PCBA(null, vmslider.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _slider = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _inputint = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _lbl = RemoteObject.declareNull("b4j.example.vmlabel");
public static RemoteObject _labeltext = RemoteObject.createImmutable("");
public static RemoteObject _vmodeltext = RemoteObject.createImmutable("");
public static RemoteObject _labelontop = RemoteObject.createImmutable(false);
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"ID",_ref.getField(false, "_id"),"InputInt",_ref.getField(false, "_inputint"),"labelOnTop",_ref.getField(false, "_labelontop"),"labelText",_ref.getField(false, "_labeltext"),"lbl",_ref.getField(false, "_lbl"),"module",_ref.getField(false, "_module"),"Slider",_ref.getField(false, "_slider"),"vmodelText",_ref.getField(false, "_vmodeltext"),"vue",_ref.getField(false, "_vue")};
}
}