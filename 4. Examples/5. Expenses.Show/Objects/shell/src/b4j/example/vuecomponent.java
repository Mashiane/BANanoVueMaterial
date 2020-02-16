
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vuecomponent {
    public static RemoteObject myClass;
	public vuecomponent() {
	}
    public static PCBA staticBA = new PCBA(null, vuecomponent.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _methods = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _template = RemoteObject.declareNull("b4j.example.vuehtml");
public static RemoteObject _computed = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _watches = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _created = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _mounted = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _beforecreate = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _destroyed = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _beforemount = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _updated = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _beforedestroy = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _activated = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _deactivated = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _beforeupdate = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _url = RemoteObject.createImmutable("");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _hascontent = RemoteObject.createImmutable(false);
public static RemoteObject _refs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _props = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _propfrom = RemoteObject.createImmutable("");
public static RemoteObject _bovue = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _showkey = RemoteObject.createImmutable("");
public static RemoteObject _diskey = RemoteObject.createImmutable("");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"activated",_ref.getField(false, "_activated"),"BANano",_ref.getField(false, "_banano"),"beforeCreate",_ref.getField(false, "_beforecreate"),"beforeDestroy",_ref.getField(false, "_beforedestroy"),"beforeMount",_ref.getField(false, "_beforemount"),"beforeUpdate",_ref.getField(false, "_beforeupdate"),"boVUE",_ref.getField(false, "_bovue"),"computed",_ref.getField(false, "_computed"),"created",_ref.getField(false, "_created"),"data",_ref.getField(false, "_data"),"deactivated",_ref.getField(false, "_deactivated"),"destroyed",_ref.getField(false, "_destroyed"),"disKey",_ref.getField(false, "_diskey"),"hasContent",_ref.getField(false, "_hascontent"),"ID",_ref.getField(false, "_id"),"methods",_ref.getField(false, "_methods"),"module",_ref.getField(false, "_module"),"mounted",_ref.getField(false, "_mounted"),"name",_ref.getField(false, "_name"),"opt",_ref.getField(false, "_opt"),"propFrom",_ref.getField(false, "_propfrom"),"props",_ref.getField(false, "_props"),"refs",_ref.getField(false, "_refs"),"showKey",_ref.getField(false, "_showkey"),"Template",_ref.getField(false, "_template"),"updated",_ref.getField(false, "_updated"),"URL",_ref.getField(false, "_url"),"watches",_ref.getField(false, "_watches")};
}
}