
package b4j.example;

import anywheresoftware.b4a.pc.PCBA;
import anywheresoftware.b4a.pc.RemoteObject;

public class vmcss {
    public static RemoteObject myClass;
	public vmcss() {
	}
    public static PCBA staticBA = new PCBA(null, vmcss.class);

public static RemoteObject __c = RemoteObject.declareNull("anywheresoftware.b4a.keywords.Common");
public static RemoteObject _style = RemoteObject.declareNull("b4j.example.vmcss._styleobj");
public static RemoteObject _width = RemoteObject.declareNull("b4j.example.vmcss._csssize");
public static RemoteObject _height = RemoteObject.declareNull("b4j.example.vmcss._csssize");
public static RemoteObject _background = RemoteObject.declareNull("b4j.example.vmcss._cssbackground");
public static RemoteObject _border = RemoteObject.declareNull("b4j.example.vmcss._cssborder");
public static RemoteObject _margin = RemoteObject.declareNull("b4j.example.vmcss._csspositions");
public static RemoteObject _padding = RemoteObject.declareNull("b4j.example.vmcss._csspositions");
public static RemoteObject _outline = RemoteObject.declareNull("b4j.example.vmcss._cssoutline");
public static RemoteObject _text = RemoteObject.declareNull("b4j.example.vmcss._csstext");
public static RemoteObject _font = RemoteObject.declareNull("b4j.example.vmcss._cssfont");
public static RemoteObject _css = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
public static RemoteObject _liststyle = RemoteObject.declareNull("b4j.example.vmcss._cssliststyle");
public static RemoteObject _transform = RemoteObject.declareNull("b4j.example.vmcss._csstransform");
public static RemoteObject _transition = RemoteObject.declareNull("b4j.example.vmcss._csstransition");
public static RemoteObject _animation = RemoteObject.declareNull("b4j.example.vmcss._cssanimation");
public static RemoteObject _filter = RemoteObject.declareNull("b4j.example.vmcss._cssfilter");
public static RemoteObject _image = RemoteObject.declareNull("b4j.example.vmcss._cssimage");
public static RemoteObject _sortit = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
public static RemoteObject _banano = RemoteObject.declareNull("com.ab.banano.BANano");
public static b4j.example.main _main = null;
public static b4j.example.pgindex _pgindex = null;
public static b4j.example.moddashboard _moddashboard = null;
public static b4j.example.modexpenses _modexpenses = null;
public static b4j.example.modstats _modstats = null;
public static b4j.example.modexpensetypes _modexpensetypes = null;
public static b4j.example.modexpensecategories _modexpensecategories = null;
public static Object[] GetGlobals(RemoteObject _ref) throws Exception {
		return new Object[] {"Animation",_ref.getField(false, "_animation"),"BackGround",_ref.getField(false, "_background"),"BANano",_ref.getField(false, "_banano"),"Border",_ref.getField(false, "_border"),"css",_ref.getField(false, "_css"),"Filter",_ref.getField(false, "_filter"),"Font",_ref.getField(false, "_font"),"Height",_ref.getField(false, "_height"),"Image",_ref.getField(false, "_image"),"ListStyle",_ref.getField(false, "_liststyle"),"Margin",_ref.getField(false, "_margin"),"Outline",_ref.getField(false, "_outline"),"Padding",_ref.getField(false, "_padding"),"sortit",_ref.getField(false, "_sortit"),"Style",_ref.getField(false, "_style"),"Text",_ref.getField(false, "_text"),"Transform",_ref.getField(false, "_transform"),"Transition",_ref.getField(false, "_transition"),"Width",_ref.getField(false, "_width")};
}
}