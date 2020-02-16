
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdfsecurity {
    public static RemoteObject myClass;
	public pdfsecurity() {
	}
    public static PCBA staticBA = new PCBA(null, pdfsecurity.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _userpassword = RemoteObject.createImmutable("");
public static RemoteObject _ownerpassword = RemoteObject.createImmutable("");
public static RemoteObject _printinghr = RemoteObject.createImmutable(false);
public static RemoteObject _printinglr = RemoteObject.createImmutable(false);
public static RemoteObject _modifying = RemoteObject.createImmutable(false);
public static RemoteObject _copying = RemoteObject.createImmutable(false);
public static RemoteObject _annotating = RemoteObject.createImmutable(false);
public static RemoteObject _fillingforms = RemoteObject.createImmutable(false);
public static RemoteObject _contentaccessibility = RemoteObject.createImmutable(false);
public static RemoteObject _documentassembly = RemoteObject.createImmutable(false);
public static RemoteObject _permissions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"annotating",_ref.getField(false, "_annotating"),"contentAccessibility",_ref.getField(false, "_contentaccessibility"),"copying",_ref.getField(false, "_copying"),"documentAssembly",_ref.getField(false, "_documentassembly"),"fillingForms",_ref.getField(false, "_fillingforms"),"modifying",_ref.getField(false, "_modifying"),"ownerPassword",_ref.getField(false, "_ownerpassword"),"permissions",_ref.getField(false, "_permissions"),"printingHR",_ref.getField(false, "_printinghr"),"printingLR",_ref.getField(false, "_printinglr"),"userPassword",_ref.getField(false, "_userpassword")};
}
}