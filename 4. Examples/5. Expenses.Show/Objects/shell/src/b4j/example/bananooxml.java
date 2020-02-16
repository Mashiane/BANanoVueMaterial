
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bananooxml {
    public static RemoteObject myClass;
	public bananooxml() {
	}
    public static PCBA staticBA = new PCBA(null, bananooxml.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _workbook = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _oxml = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _fname = RemoteObject.createImmutable("");
public static RemoteObject _borderthick = RemoteObject.createImmutable("");
public static RemoteObject _bordernone = RemoteObject.createImmutable("");
public static RemoteObject _borderthin = RemoteObject.createImmutable("");
public static RemoteObject _bordermedium = RemoteObject.createImmutable("");
public static RemoteObject _borderdashed = RemoteObject.createImmutable("");
public static RemoteObject _borderdotted = RemoteObject.createImmutable("");
public static RemoteObject _borderdouble = RemoteObject.createImmutable("");
public static RemoteObject _borderhair = RemoteObject.createImmutable("");
public static RemoteObject _bordermediumdashed = RemoteObject.createImmutable("");
public static RemoteObject _borderdashdot = RemoteObject.createImmutable("");
public static RemoteObject _bordermediumdashdot = RemoteObject.createImmutable("");
public static RemoteObject _borderdashdotdot = RemoteObject.createImmutable("");
public static RemoteObject _bordermediumdashdotdot = RemoteObject.createImmutable("");
public static RemoteObject _borderslantdashdot = RemoteObject.createImmutable("");
public static RemoteObject _colors_red = RemoteObject.createImmutable("");
public static RemoteObject _colors_pink = RemoteObject.createImmutable("");
public static RemoteObject _colors_purple = RemoteObject.createImmutable("");
public static RemoteObject _colors_deeppurple = RemoteObject.createImmutable("");
public static RemoteObject _colors_indigo = RemoteObject.createImmutable("");
public static RemoteObject _colors_blue = RemoteObject.createImmutable("");
public static RemoteObject _colors_lightblue = RemoteObject.createImmutable("");
public static RemoteObject _colors_cyan = RemoteObject.createImmutable("");
public static RemoteObject _colors_teal = RemoteObject.createImmutable("");
public static RemoteObject _colors_green = RemoteObject.createImmutable("");
public static RemoteObject _colors_lightgreen = RemoteObject.createImmutable("");
public static RemoteObject _colors_lime = RemoteObject.createImmutable("");
public static RemoteObject _colors_yellow = RemoteObject.createImmutable("");
public static RemoteObject _colors_amber = RemoteObject.createImmutable("");
public static RemoteObject _colors_orange = RemoteObject.createImmutable("");
public static RemoteObject _colors_deeporange = RemoteObject.createImmutable("");
public static RemoteObject _colors_brown = RemoteObject.createImmutable("");
public static RemoteObject _colors_grey = RemoteObject.createImmutable("");
public static RemoteObject _colors_bluegrey = RemoteObject.createImmutable("");
public static RemoteObject _colors_black = RemoteObject.createImmutable("");
public static RemoteObject _colors_white = RemoteObject.createImmutable("");
public static RemoteObject _colors_transparent = RemoteObject.createImmutable("");
public static RemoteObject _pattern_darkdown = RemoteObject.createImmutable("");
public static RemoteObject _pattern_darkgray = RemoteObject.createImmutable("");
public static RemoteObject _pattern_darkgrid = RemoteObject.createImmutable("");
public static RemoteObject _pattern_darkhorizontal = RemoteObject.createImmutable("");
public static RemoteObject _pattern_darktrellis = RemoteObject.createImmutable("");
public static RemoteObject _pattern_darkup = RemoteObject.createImmutable("");
public static RemoteObject _pattern_darkvertical = RemoteObject.createImmutable("");
public static RemoteObject _pattern_gray0625 = RemoteObject.createImmutable("");
public static RemoteObject _pattern_gray125 = RemoteObject.createImmutable("");
public static RemoteObject _pattern_lightdown = RemoteObject.createImmutable("");
public static RemoteObject _pattern_lightgray = RemoteObject.createImmutable("");
public static RemoteObject _pattern_lightgrid = RemoteObject.createImmutable("");
public static RemoteObject _pattern_lighthorizontal = RemoteObject.createImmutable("");
public static RemoteObject _pattern_lighttrellis = RemoteObject.createImmutable("");
public static RemoteObject _pattern_lightup = RemoteObject.createImmutable("");
public static RemoteObject _pattern_lightvertical = RemoteObject.createImmutable("");
public static RemoteObject _pattern_mediumgray = RemoteObject.createImmutable("");
public static RemoteObject _pattern_none = RemoteObject.createImmutable("");
public static RemoteObject _pattern_solid = RemoteObject.createImmutable("");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"BANano",_ref.getField(false, "_banano"),"BorderDashDot",_ref.getField(false, "_borderdashdot"),"BorderDashDotDot",_ref.getField(false, "_borderdashdotdot"),"BorderDashed",_ref.getField(false, "_borderdashed"),"BorderDotted",_ref.getField(false, "_borderdotted"),"BorderDouble",_ref.getField(false, "_borderdouble"),"BorderHair",_ref.getField(false, "_borderhair"),"BorderMedium",_ref.getField(false, "_bordermedium"),"BorderMediumDashDot",_ref.getField(false, "_bordermediumdashdot"),"BorderMediumDashDotDot",_ref.getField(false, "_bordermediumdashdotdot"),"BorderMediumDashed",_ref.getField(false, "_bordermediumdashed"),"BorderNone",_ref.getField(false, "_bordernone"),"BorderSlantDashDot",_ref.getField(false, "_borderslantdashdot"),"BorderThick",_ref.getField(false, "_borderthick"),"BorderThin",_ref.getField(false, "_borderthin"),"colors_amber",_ref.getField(false, "_colors_amber"),"colors_black",_ref.getField(false, "_colors_black"),"colors_blue",_ref.getField(false, "_colors_blue"),"colors_blueGrey",_ref.getField(false, "_colors_bluegrey"),"colors_brown",_ref.getField(false, "_colors_brown"),"colors_cyan",_ref.getField(false, "_colors_cyan"),"colors_deepOrange",_ref.getField(false, "_colors_deeporange"),"colors_deepPurple",_ref.getField(false, "_colors_deeppurple"),"colors_green",_ref.getField(false, "_colors_green"),"colors_grey",_ref.getField(false, "_colors_grey"),"colors_indigo",_ref.getField(false, "_colors_indigo"),"colors_lightBlue",_ref.getField(false, "_colors_lightblue"),"colors_lightGreen",_ref.getField(false, "_colors_lightgreen"),"colors_lime",_ref.getField(false, "_colors_lime"),"colors_orange",_ref.getField(false, "_colors_orange"),"colors_pink",_ref.getField(false, "_colors_pink"),"colors_purple",_ref.getField(false, "_colors_purple"),"colors_red",_ref.getField(false, "_colors_red"),"colors_teal",_ref.getField(false, "_colors_teal"),"colors_transparent",_ref.getField(false, "_colors_transparent"),"colors_white",_ref.getField(false, "_colors_white"),"colors_yellow",_ref.getField(false, "_colors_yellow"),"fName",_ref.getField(false, "_fname"),"oxml",_ref.getField(false, "_oxml"),"Pattern_darkDown",_ref.getField(false, "_pattern_darkdown"),"Pattern_darkGray",_ref.getField(false, "_pattern_darkgray"),"Pattern_darkGrid",_ref.getField(false, "_pattern_darkgrid"),"Pattern_darkHorizontal",_ref.getField(false, "_pattern_darkhorizontal"),"Pattern_darkTrellis",_ref.getField(false, "_pattern_darktrellis"),"Pattern_darkUp",_ref.getField(false, "_pattern_darkup"),"Pattern_darkVertical",_ref.getField(false, "_pattern_darkvertical"),"Pattern_gray0625",_ref.getField(false, "_pattern_gray0625"),"Pattern_gray125",_ref.getField(false, "_pattern_gray125"),"Pattern_lightDown",_ref.getField(false, "_pattern_lightdown"),"Pattern_lightGray",_ref.getField(false, "_pattern_lightgray"),"Pattern_lightGrid",_ref.getField(false, "_pattern_lightgrid"),"Pattern_lightHorizontal",_ref.getField(false, "_pattern_lighthorizontal"),"Pattern_lightTrellis",_ref.getField(false, "_pattern_lighttrellis"),"Pattern_lightUp",_ref.getField(false, "_pattern_lightup"),"Pattern_lightVertical",_ref.getField(false, "_pattern_lightvertical"),"Pattern_mediumGray",_ref.getField(false, "_pattern_mediumgray"),"Pattern_none",_ref.getField(false, "_pattern_none"),"Pattern_solid",_ref.getField(false, "_pattern_solid"),"WorkBook",_ref.getField(false, "_workbook")};
}
}