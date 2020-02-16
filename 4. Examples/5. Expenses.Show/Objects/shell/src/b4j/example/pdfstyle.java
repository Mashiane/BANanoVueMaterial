
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class pdfstyle {
    public static RemoteObject myClass;
	public pdfstyle() {
	}
    public static PCBA staticBA = new PCBA(null, pdfstyle.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _fontsize = RemoteObject.createImmutable(0);
public static RemoteObject _bold = RemoteObject.createImmutable(false);
public static RemoteObject _italics = RemoteObject.createImmutable(false);
public static RemoteObject _alignmentright = RemoteObject.createImmutable(false);
public static RemoteObject _alignmentcenter = RemoteObject.createImmutable(false);
public static RemoteObject _alignmentjustify = RemoteObject.createImmutable(false);
public static RemoteObject _color = RemoteObject.createImmutable("");
public static RemoteObject _name = RemoteObject.createImmutable("");
public static RemoteObject _width = RemoteObject.createImmutable("");
public static RemoteObject _height = RemoteObject.createImmutable("");
public static RemoteObject _opacity = RemoteObject.createImmutable(0);
public static RemoteObject _angle = RemoteObject.createImmutable(0);
public static RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _styles = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _columngap = RemoteObject.createImmutable(0);
public static RemoteObject _fillcolor = RemoteObject.createImmutable("");
public static RemoteObject _background = RemoteObject.createImmutable("");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"alignmentCenter",_ref.getField(false, "_alignmentcenter"),"alignmentJustify",_ref.getField(false, "_alignmentjustify"),"alignmentRight",_ref.getField(false, "_alignmentright"),"angle",_ref.getField(false, "_angle"),"background",_ref.getField(false, "_background"),"BANano",_ref.getField(false, "_banano"),"bold",_ref.getField(false, "_bold"),"color",_ref.getField(false, "_color"),"columnGap",_ref.getField(false, "_columngap"),"fillColor",_ref.getField(false, "_fillcolor"),"fontSize",_ref.getField(false, "_fontsize"),"height",_ref.getField(false, "_height"),"italics",_ref.getField(false, "_italics"),"m",_ref.getField(false, "_m"),"name",_ref.getField(false, "_name"),"opacity",_ref.getField(false, "_opacity"),"styles",_ref.getField(false, "_styles"),"width",_ref.getField(false, "_width")};
}
}