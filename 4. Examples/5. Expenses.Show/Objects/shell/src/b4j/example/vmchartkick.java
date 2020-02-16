
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmchartkick {
    public static RemoteObject myClass;
	public vmchartkick() {
	}
    public static PCBA staticBA = new PCBA(null, vmchartkick.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _chartkick = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _id = RemoteObject.createImmutable("");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _module = RemoteObject.declareNull("Object");
public static RemoteObject _series = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _colors = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _coptions = RemoteObject.createImmutable("");
public static RemoteObject _xaxes = RemoteObject.declareNull("b4j.example.vmchartkick._xaxestype");
public static RemoteObject _yaxes = RemoteObject.declareNull("b4j.example.vmchartkick._xaxestype");
public static RemoteObject _overwriteoptions = RemoteObject.createImmutable(false);
public static RemoteObject _title = RemoteObject.declareNull("b4j.example.vmchartkick._titletype");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"ChartKick",_ref.getField(false, "_chartkick"),"colors",_ref.getField(false, "_colors"),"coptions",_ref.getField(false, "_coptions"),"data",_ref.getField(false, "_data"),"ID",_ref.getField(false, "_id"),"module",_ref.getField(false, "_module"),"OverwriteOptions",_ref.getField(false, "_overwriteoptions"),"series",_ref.getField(false, "_series"),"Title",_ref.getField(false, "_title"),"vue",_ref.getField(false, "_vue"),"xAxes",_ref.getField(false, "_xaxes"),"yAxes",_ref.getField(false, "_yaxes")};
}
}