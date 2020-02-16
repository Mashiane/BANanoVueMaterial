
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdfmaker {
    public static RemoteObject myClass;
	public pdfmaker() {
	}
    public static PCBA staticBA = new PCBA(null, pdfmaker.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _styles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _docdefinition = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _content = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _defaultstyle = RemoteObject.declareNull("b4j.example.pdfstyle");
public static RemoteObject _pdf = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _pagesize = RemoteObject.createImmutable("");
public static RemoteObject _pageorientation = RemoteObject.createImmutable("");
public static RemoteObject _title = RemoteObject.createImmutable("");
public static RemoteObject _author = RemoteObject.createImmutable("");
public static RemoteObject _subject = RemoteObject.createImmutable("");
public static RemoteObject _keywords = RemoteObject.createImmutable("");
public static RemoteObject _creator = RemoteObject.createImmutable("");
public static RemoteObject _producer = RemoteObject.createImmutable("");
public static RemoteObject _info = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _compress = RemoteObject.createImmutable(false);
public static RemoteObject _security = RemoteObject.declareNull("b4j.example.pdfsecurity");
public static RemoteObject _parentid = RemoteObject.createImmutable("");
public static RemoteObject _fname = RemoteObject.createImmutable("");
public static RemoteObject _blobs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _numfiles = RemoteObject.createImmutable(0);
public static RemoteObject _files = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _images = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _filekeys = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _action = RemoteObject.createImmutable("");
public static RemoteObject _eventhandler = RemoteObject.declareNull("Object");
public static RemoteObject _eventmethod = RemoteObject.createImmutable("");
public static RemoteObject _mjson = RemoteObject.createImmutable("");
public static RemoteObject _mjsonpretty = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"action",_ref.getField(false, "_action"),"author",_ref.getField(false, "_author"),"BANano",_ref.getField(false, "_banano"),"Blobs",_ref.getField(false, "_blobs"),"compress",_ref.getField(false, "_compress"),"content",_ref.getField(false, "_content"),"creator",_ref.getField(false, "_creator"),"defaultStyle",_ref.getField(false, "_defaultstyle"),"docDefinition",_ref.getField(false, "_docdefinition"),"eventHandler",_ref.getField(false, "_eventhandler"),"eventMethod",_ref.getField(false, "_eventmethod"),"fileKeys",_ref.getField(false, "_filekeys"),"files",_ref.getField(false, "_files"),"fName",_ref.getField(false, "_fname"),"images",_ref.getField(false, "_images"),"info",_ref.getField(false, "_info"),"keywords",_ref.getField(false, "_keywords"),"mJSON",_ref.getField(false, "_mjson"),"mJSONPretty",_ref.getField(false, "_mjsonpretty"),"NumFiles",_ref.getField(false, "_numfiles"),"pageOrientation",_ref.getField(false, "_pageorientation"),"pageSize",_ref.getField(false, "_pagesize"),"parentID",_ref.getField(false, "_parentid"),"pdf",_ref.getField(false, "_pdf"),"producer",_ref.getField(false, "_producer"),"security",_ref.getField(false, "_security"),"styles",_ref.getField(false, "_styles"),"subject",_ref.getField(false, "_subject"),"title",_ref.getField(false, "_title")};
}
}