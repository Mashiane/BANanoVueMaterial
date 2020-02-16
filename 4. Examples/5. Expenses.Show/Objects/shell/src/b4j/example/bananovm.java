
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class bananovm {
    public static RemoteObject myClass;
	public bananovm() {
	}
    public static PCBA staticBA = new PCBA(null, bananovm.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static RemoteObject _overlay = RemoteObject.declareNull("b4j.example.vmloader");
public static RemoteObject _themes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _refs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _data = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _prompt = RemoteObject.declareNull("b4j.example.vmprompt");
public static RemoteObject _material = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _vueloading = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _vuecal = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _vuebo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _jquery = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _vm = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _vue = RemoteObject.declareNull("b4j.example.bananovue");
public static RemoteObject _vmdef = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _content = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _navbar = RemoteObject.declareNull("b4j.example.vmtoolbar");
public static RemoteObject _drawer = RemoteObject.declareNull("b4j.example.vmdrawer");
public static RemoteObject _app = RemoteObject.declareNull("b4j.example.vmelement");
public static RemoteObject _alert = RemoteObject.declareNull("b4j.example.vmalert");
public static RemoteObject _confirm = RemoteObject.declareNull("b4j.example.vmconfirm");
public static RemoteObject _snack = RemoteObject.declareNull("b4j.example.vmsnackbar");
public static RemoteObject _coloroptions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _borderoptions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _intensityoptions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _hasknob = RemoteObject.createImmutable(false);
public static RemoteObject _hasinfobox = RemoteObject.createImmutable(false);
public static RemoteObject _elevation = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _container = RemoteObject.declareNull("b4j.example.vmcontainer");
public static RemoteObject _gettemplate = RemoteObject.createImmutable("");
public static RemoteObject _pages = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _chartkick = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _chart = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static RemoteObject _vuegooglemaps = RemoteObject.declareNull("com.ab.banano.BANanoObject");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Alert",_ref.getField(false, "_alert"),"App",_ref.getField(false, "_app"),"BANano",_ref.getField(false, "_banano"),"BorderOptions",_ref.getField(false, "_borderoptions"),"Chart",_ref.getField(false, "_chart"),"Chartkick",_ref.getField(false, "_chartkick"),"ColorOptions",_ref.getField(false, "_coloroptions"),"Confirm",_ref.getField(false, "_confirm"),"Container",_ref.getField(false, "_container"),"Content",_ref.getField(false, "_content"),"data",_ref.getField(false, "_data"),"Drawer",_ref.getField(false, "_drawer"),"Elevation",_ref.getField(false, "_elevation"),"GetTemplate",_ref.getField(false, "_gettemplate"),"HasInfoBox",_ref.getField(false, "_hasinfobox"),"HasKnob",_ref.getField(false, "_hasknob"),"IntensityOptions",_ref.getField(false, "_intensityoptions"),"JQuery",_ref.getField(false, "_jquery"),"material",_ref.getField(false, "_material"),"NavBar",_ref.getField(false, "_navbar"),"Overlay",_ref.getField(false, "_overlay"),"Pages",_ref.getField(false, "_pages"),"Prompt",_ref.getField(false, "_prompt"),"refs",_ref.getField(false, "_refs"),"Snack",_ref.getField(false, "_snack"),"Themes",_ref.getField(false, "_themes"),"VM",_ref.getField(false, "_vm"),"VMDef",_ref.getField(false, "_vmdef"),"Vue",_ref.getField(false, "_vue"),"VueBO",_ref.getField(false, "_vuebo"),"VueCal",_ref.getField(false, "_vuecal"),"VueGoogleMaps",_ref.getField(false, "_vuegooglemaps"),"VueLoading",_ref.getField(false, "_vueloading")};
}
}