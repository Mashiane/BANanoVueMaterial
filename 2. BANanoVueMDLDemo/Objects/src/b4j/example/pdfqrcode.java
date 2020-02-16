package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfqrcode extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfqrcode", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfqrcode.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public String _qr = "";
public String _foreground = "";
public String _background = "";
public String _fit = "";
public boolean _modenumeric = false;
public boolean _modealphanumeric = false;
public boolean _modeoctet = false;
public boolean _ecclevell = false;
public boolean _ecclevelm = false;
public boolean _ecclevelq = false;
public boolean _ecclevelh = false;
public String _pageorientation = "";
public com.ab.banano.BANano _banano = null;
public b4j.example.main _main = null;
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Dim options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Public qr As String";
_qr = "";
 //BA.debugLineNum = 5;BA.debugLine="Public foreground As String";
_foreground = "";
 //BA.debugLineNum = 6;BA.debugLine="Public background As String";
_background = "";
 //BA.debugLineNum = 7;BA.debugLine="Public fit As String";
_fit = "";
 //BA.debugLineNum = 9;BA.debugLine="Public modeNumeric As Boolean";
_modenumeric = false;
 //BA.debugLineNum = 10;BA.debugLine="Public modeAlphanumeric As Boolean";
_modealphanumeric = false;
 //BA.debugLineNum = 11;BA.debugLine="Public modeOctet As Boolean";
_modeoctet = false;
 //BA.debugLineNum = 13;BA.debugLine="Public eccLevelL As Boolean";
_ecclevell = false;
 //BA.debugLineNum = 14;BA.debugLine="Public eccLevelM As Boolean";
_ecclevelm = false;
 //BA.debugLineNum = 15;BA.debugLine="Public eccLevelQ As Boolean";
_ecclevelq = false;
 //BA.debugLineNum = 16;BA.debugLine="Public eccLevelH As Boolean";
_ecclevelh = false;
 //BA.debugLineNum = 17;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
 //BA.debugLineNum = 18;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 68;BA.debugLine="If qr <> Null Then options.Put(\"qr\", qr)";
if (_qr!= null) { 
_options.Put((Object)("qr"),(Object)(_qr));};
 //BA.debugLineNum = 69;BA.debugLine="If foreground <> Null Then options.Put(\"foregroun";
if (_foreground!= null) { 
_options.Put((Object)("foreground"),(Object)(_foreground));};
 //BA.debugLineNum = 70;BA.debugLine="If background <> Null Then options.Put(\"backgroun";
if (_background!= null) { 
_options.Put((Object)("background"),(Object)(_background));};
 //BA.debugLineNum = 71;BA.debugLine="If pageOrientation <> Null Then options.Put(\"page";
if (_pageorientation!= null) { 
_options.Put((Object)("pageOrientation"),(Object)(_pageorientation));};
 //BA.debugLineNum = 72;BA.debugLine="If fit <> Null Then options.Put(\"fit\", fit)";
if (_fit!= null) { 
_options.Put((Object)("fit"),(Object)(_fit));};
 //BA.debugLineNum = 75;BA.debugLine="If modeNumeric Then options.Put(\"mode\", \"numeric\"";
if (_modenumeric) { 
_options.Put((Object)("mode"),(Object)("numeric"));};
 //BA.debugLineNum = 76;BA.debugLine="If modeAlphanumeric Then options.Put(\"mode\", \"alp";
if (_modealphanumeric) { 
_options.Put((Object)("mode"),(Object)("alphanumeric"));};
 //BA.debugLineNum = 77;BA.debugLine="If modeOctet Then options.Put(\"mode\", \"octet\")";
if (_modeoctet) { 
_options.Put((Object)("mode"),(Object)("octet"));};
 //BA.debugLineNum = 78;BA.debugLine="If eccLevelL Then options.Put(\"eccLevel\", \"L\")";
if (_ecclevell) { 
_options.Put((Object)("eccLevel"),(Object)("L"));};
 //BA.debugLineNum = 79;BA.debugLine="If eccLevelM Then options.Put(\"eccLevel\", \"M\")";
if (_ecclevelm) { 
_options.Put((Object)("eccLevel"),(Object)("M"));};
 //BA.debugLineNum = 80;BA.debugLine="If eccLevelQ Then options.Put(\"eccLevel\", \"Q\")";
if (_ecclevelq) { 
_options.Put((Object)("eccLevel"),(Object)("Q"));};
 //BA.debugLineNum = 81;BA.debugLine="If eccLevelH Then options.Put(\"eccLevel\", \"H\")";
if (_ecclevelh) { 
_options.Put((Object)("eccLevel"),(Object)("H"));};
 //BA.debugLineNum = 82;BA.debugLine="Return options";
if (true) return _options;
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 22;BA.debugLine="Public Sub Initialize As PDFQRCode";
 //BA.debugLineNum = 23;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 24;BA.debugLine="qr = Null";
_qr = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 25;BA.debugLine="foreground = Null";
_foreground = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 26;BA.debugLine="background = Null";
_background = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 27;BA.debugLine="pageOrientation = Null";
_pageorientation = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 28;BA.debugLine="fit = Null";
_fit = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 30;BA.debugLine="modeNumeric = False";
_modenumeric = __c.False;
 //BA.debugLineNum = 31;BA.debugLine="modeAlphanumeric = False";
_modealphanumeric = __c.False;
 //BA.debugLineNum = 32;BA.debugLine="modeOctet = False";
_modeoctet = __c.False;
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 45;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 46;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 47;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 48;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 49;BA.debugLine="options.Put(\"absolutePosition\", opt)";
_options.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setmargin(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 86;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
 //BA.debugLineNum = 87;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_l = (int) (0);};
 //BA.debugLineNum = 88;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_t = (int) (0);};
 //BA.debugLineNum = 89;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_r = (int) (0);};
 //BA.debugLineNum = 90;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_b = (int) (0);};
 //BA.debugLineNum = 91;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 92;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 93;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 94;BA.debugLine="options.Put(\"margin\", margin)";
_options.Put((Object)("margin"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setpagebreakafter() throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetPageBreakAfter As PDFQRCode";
 //BA.debugLineNum = 62;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
_options.Put((Object)("pageBreak"),(Object)("after"));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setpagebreakbefore() throws Exception{
 //BA.debugLineNum = 55;BA.debugLine="Sub SetPageBreakBefore As PDFQRCode";
 //BA.debugLineNum = 56;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
_options.Put((Object)("pageBreak"),(Object)("before"));
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setpageorientation(String _spageorientation) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
 //BA.debugLineNum = 39;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdfqrcode)(this);};
 //BA.debugLineNum = 40;BA.debugLine="pageOrientation = spageOrientation";
_pageorientation = _spageorientation;
 //BA.debugLineNum = 41;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
 //BA.debugLineNum = 42;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
