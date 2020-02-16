
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmwaterball {
    public static RemoteObject myClass;
	public vmwaterball() {
	}
    public static PCBA staticBA = new PCBA(null, vmwaterball.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _waterball = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _isloading = RemoteObject.createImmutable(false);
public static RemoteObject _vnowrange = RemoteObject.createImmutable(0);
public static RemoteObject _vtargetrange = RemoteObject.createImmutable(0);
public static RemoteObject _range1 = RemoteObject.createImmutable(0);
public static RemoteObject _range2 = RemoteObject.createImmutable(0);
public static RemoteObject _range3 = RemoteObject.createImmutable(0);
public static RemoteObject _wwidth = RemoteObject.createImmutable(0);
public static RemoteObject _wheight = RemoteObject.createImmutable(0);
public static RemoteObject _jq = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"ID",_ref.getField(false, "_id"),"isLoading",_ref.getField(false, "_isloading"),"JQ",_ref.getField(false, "_jq"),"module",_ref.getField(false, "_module"),"range1",_ref.getField(false, "_range1"),"range2",_ref.getField(false, "_range2"),"range3",_ref.getField(false, "_range3"),"vnowRange",_ref.getField(false, "_vnowrange"),"vtargetRange",_ref.getField(false, "_vtargetrange"),"vue",_ref.getField(false, "_vue"),"WaterBall",_ref.getField(false, "_waterball"),"wHeight",_ref.getField(false, "_wheight"),"wWidth",_ref.getField(false, "_wwidth")};
}
}