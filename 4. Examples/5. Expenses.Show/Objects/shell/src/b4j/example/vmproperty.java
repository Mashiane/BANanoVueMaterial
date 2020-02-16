
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmproperty {
    public static RemoteObject myClass;
	public vmproperty() {
	}
    public static PCBA staticBA = new PCBA(null, vmproperty.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _labels = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _bag = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _lst = RemoteObject.declareNull("b4j.example.vmlist");
public static RemoteObject _controls = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _eventhandler = RemoteObject.declareNull("Object");
public static RemoteObject _fields = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _booleans = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _strings = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _integers = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _doubles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _dates = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _defaults = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Bag",_ref.getField(false, "_bag"),"BANano",_ref.getField(false, "_banano"),"Booleans",_ref.getField(false, "_booleans"),"controls",_ref.getField(false, "_controls"),"Dates",_ref.getField(false, "_dates"),"defaults",_ref.getField(false, "_defaults"),"Doubles",_ref.getField(false, "_doubles"),"eventHandler",_ref.getField(false, "_eventhandler"),"fields",_ref.getField(false, "_fields"),"ID",_ref.getField(false, "_id"),"Integers",_ref.getField(false, "_integers"),"labels",_ref.getField(false, "_labels"),"Lst",_ref.getField(false, "_lst"),"Strings",_ref.getField(false, "_strings"),"vue",_ref.getField(false, "_vue")};
}
}