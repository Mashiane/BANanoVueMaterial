package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfqrcode extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfqrcode", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdfqrcode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfqrcode";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=56033280;
 //BA.debugLineNum = 56033280;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=56033281;
 //BA.debugLineNum = 56033281;BA.debugLine="If qr <> Null Then options.Put(\"qr\", qr)";
if (__ref._qr /*String*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("qr"),(Object)(__ref._qr /*String*/ ));};
RDebugUtils.currentLine=56033282;
 //BA.debugLineNum = 56033282;BA.debugLine="If foreground <> Null Then options.Put(\"foregroun";
if (__ref._foreground /*String*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("foreground"),(Object)(__ref._foreground /*String*/ ));};
RDebugUtils.currentLine=56033283;
 //BA.debugLineNum = 56033283;BA.debugLine="If background <> Null Then options.Put(\"backgroun";
if (__ref._background /*String*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("background"),(Object)(__ref._background /*String*/ ));};
RDebugUtils.currentLine=56033284;
 //BA.debugLineNum = 56033284;BA.debugLine="If pageOrientation <> Null Then options.Put(\"page";
if (__ref._pageorientation /*String*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageOrientation"),(Object)(__ref._pageorientation /*String*/ ));};
RDebugUtils.currentLine=56033285;
 //BA.debugLineNum = 56033285;BA.debugLine="If fit <> Null Then options.Put(\"fit\", fit)";
if (__ref._fit /*String*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("fit"),(Object)(__ref._fit /*String*/ ));};
RDebugUtils.currentLine=56033288;
 //BA.debugLineNum = 56033288;BA.debugLine="If modeNumeric Then options.Put(\"mode\", \"numeric\"";
if (__ref._modenumeric /*boolean*/ ) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("mode"),(Object)("numeric"));};
RDebugUtils.currentLine=56033289;
 //BA.debugLineNum = 56033289;BA.debugLine="If modeAlphanumeric Then options.Put(\"mode\", \"alp";
if (__ref._modealphanumeric /*boolean*/ ) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("mode"),(Object)("alphanumeric"));};
RDebugUtils.currentLine=56033290;
 //BA.debugLineNum = 56033290;BA.debugLine="If modeOctet Then options.Put(\"mode\", \"octet\")";
if (__ref._modeoctet /*boolean*/ ) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("mode"),(Object)("octet"));};
RDebugUtils.currentLine=56033291;
 //BA.debugLineNum = 56033291;BA.debugLine="If eccLevelL Then options.Put(\"eccLevel\", \"L\")";
if (__ref._ecclevell /*boolean*/ ) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("eccLevel"),(Object)("L"));};
RDebugUtils.currentLine=56033292;
 //BA.debugLineNum = 56033292;BA.debugLine="If eccLevelM Then options.Put(\"eccLevel\", \"M\")";
if (__ref._ecclevelm /*boolean*/ ) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("eccLevel"),(Object)("M"));};
RDebugUtils.currentLine=56033293;
 //BA.debugLineNum = 56033293;BA.debugLine="If eccLevelQ Then options.Put(\"eccLevel\", \"Q\")";
if (__ref._ecclevelq /*boolean*/ ) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("eccLevel"),(Object)("Q"));};
RDebugUtils.currentLine=56033294;
 //BA.debugLineNum = 56033294;BA.debugLine="If eccLevelH Then options.Put(\"eccLevel\", \"H\")";
if (__ref._ecclevelh /*boolean*/ ) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("eccLevel"),(Object)("H"));};
RDebugUtils.currentLine=56033295;
 //BA.debugLineNum = 56033295;BA.debugLine="Return options";
if (true) return __ref._options /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=56033296;
 //BA.debugLineNum = 56033296;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _initialize(b4j.example.pdfqrcode __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfqrcode";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdfqrcode) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=55705600;
 //BA.debugLineNum = 55705600;BA.debugLine="Public Sub Initialize As PDFQRCode";
RDebugUtils.currentLine=55705601;
 //BA.debugLineNum = 55705601;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=55705602;
 //BA.debugLineNum = 55705602;BA.debugLine="qr = Null";
__ref._qr /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=55705603;
 //BA.debugLineNum = 55705603;BA.debugLine="foreground = Null";
__ref._foreground /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=55705604;
 //BA.debugLineNum = 55705604;BA.debugLine="background = Null";
__ref._background /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=55705605;
 //BA.debugLineNum = 55705605;BA.debugLine="pageOrientation = Null";
__ref._pageorientation /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=55705606;
 //BA.debugLineNum = 55705606;BA.debugLine="fit = Null";
__ref._fit /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=55705608;
 //BA.debugLineNum = 55705608;BA.debugLine="modeNumeric = False";
__ref._modenumeric /*boolean*/  = __c.False;
RDebugUtils.currentLine=55705609;
 //BA.debugLineNum = 55705609;BA.debugLine="modeAlphanumeric = False";
__ref._modealphanumeric /*boolean*/  = __c.False;
RDebugUtils.currentLine=55705610;
 //BA.debugLineNum = 55705610;BA.debugLine="modeOctet = False";
__ref._modeoctet /*boolean*/  = __c.False;
RDebugUtils.currentLine=55705612;
 //BA.debugLineNum = 55705612;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
RDebugUtils.currentLine=55705613;
 //BA.debugLineNum = 55705613;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdfqrcode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfqrcode";
RDebugUtils.currentLine=55640064;
 //BA.debugLineNum = 55640064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=55640065;
 //BA.debugLineNum = 55640065;BA.debugLine="Dim options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=55640066;
 //BA.debugLineNum = 55640066;BA.debugLine="Public qr As String";
_qr = "";
RDebugUtils.currentLine=55640067;
 //BA.debugLineNum = 55640067;BA.debugLine="Public foreground As String";
_foreground = "";
RDebugUtils.currentLine=55640068;
 //BA.debugLineNum = 55640068;BA.debugLine="Public background As String";
_background = "";
RDebugUtils.currentLine=55640069;
 //BA.debugLineNum = 55640069;BA.debugLine="Public fit As String";
_fit = "";
RDebugUtils.currentLine=55640071;
 //BA.debugLineNum = 55640071;BA.debugLine="Public modeNumeric As Boolean";
_modenumeric = false;
RDebugUtils.currentLine=55640072;
 //BA.debugLineNum = 55640072;BA.debugLine="Public modeAlphanumeric As Boolean";
_modealphanumeric = false;
RDebugUtils.currentLine=55640073;
 //BA.debugLineNum = 55640073;BA.debugLine="Public modeOctet As Boolean";
_modeoctet = false;
RDebugUtils.currentLine=55640075;
 //BA.debugLineNum = 55640075;BA.debugLine="Public eccLevelL As Boolean";
_ecclevell = false;
RDebugUtils.currentLine=55640076;
 //BA.debugLineNum = 55640076;BA.debugLine="Public eccLevelM As Boolean";
_ecclevelm = false;
RDebugUtils.currentLine=55640077;
 //BA.debugLineNum = 55640077;BA.debugLine="Public eccLevelQ As Boolean";
_ecclevelq = false;
RDebugUtils.currentLine=55640078;
 //BA.debugLineNum = 55640078;BA.debugLine="Public eccLevelH As Boolean";
_ecclevelh = false;
RDebugUtils.currentLine=55640079;
 //BA.debugLineNum = 55640079;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
RDebugUtils.currentLine=55640080;
 //BA.debugLineNum = 55640080;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=55640081;
 //BA.debugLineNum = 55640081;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfqrcode  _setabsoluteposition(b4j.example.pdfqrcode __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfqrcode";
if (Debug.shouldDelegate(ba, "setabsoluteposition", true))
	 {return ((b4j.example.pdfqrcode) Debug.delegate(ba, "setabsoluteposition", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=55836672;
 //BA.debugLineNum = 55836672;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
RDebugUtils.currentLine=55836673;
 //BA.debugLineNum = 55836673;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=55836674;
 //BA.debugLineNum = 55836674;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=55836675;
 //BA.debugLineNum = 55836675;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=55836676;
 //BA.debugLineNum = 55836676;BA.debugLine="options.Put(\"absolutePosition\", opt)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
RDebugUtils.currentLine=55836677;
 //BA.debugLineNum = 55836677;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
RDebugUtils.currentLine=55836678;
 //BA.debugLineNum = 55836678;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setmargin(b4j.example.pdfqrcode __ref,int _l,int _t,int _r,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfqrcode";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.pdfqrcode) Debug.delegate(ba, "setmargin", new Object[] {_l,_t,_r,_b}));}
anywheresoftware.b4a.objects.collections.List _margin = null;
RDebugUtils.currentLine=56098816;
 //BA.debugLineNum = 56098816;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
RDebugUtils.currentLine=56098817;
 //BA.debugLineNum = 56098817;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_l = (int) (0);};
RDebugUtils.currentLine=56098818;
 //BA.debugLineNum = 56098818;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_t = (int) (0);};
RDebugUtils.currentLine=56098819;
 //BA.debugLineNum = 56098819;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_r = (int) (0);};
RDebugUtils.currentLine=56098820;
 //BA.debugLineNum = 56098820;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_b = (int) (0);};
RDebugUtils.currentLine=56098821;
 //BA.debugLineNum = 56098821;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=56098822;
 //BA.debugLineNum = 56098822;BA.debugLine="margin.Initialize";
_margin.Initialize();
RDebugUtils.currentLine=56098823;
 //BA.debugLineNum = 56098823;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
RDebugUtils.currentLine=56098824;
 //BA.debugLineNum = 56098824;BA.debugLine="options.Put(\"margin\", margin)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("margin"),(Object)(_margin.getObject()));
RDebugUtils.currentLine=56098825;
 //BA.debugLineNum = 56098825;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
RDebugUtils.currentLine=56098826;
 //BA.debugLineNum = 56098826;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setpagebreakafter(b4j.example.pdfqrcode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfqrcode";
if (Debug.shouldDelegate(ba, "setpagebreakafter", true))
	 {return ((b4j.example.pdfqrcode) Debug.delegate(ba, "setpagebreakafter", null));}
RDebugUtils.currentLine=55967744;
 //BA.debugLineNum = 55967744;BA.debugLine="Sub SetPageBreakAfter As PDFQRCode";
RDebugUtils.currentLine=55967745;
 //BA.debugLineNum = 55967745;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));
RDebugUtils.currentLine=55967746;
 //BA.debugLineNum = 55967746;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
RDebugUtils.currentLine=55967747;
 //BA.debugLineNum = 55967747;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setpagebreakbefore(b4j.example.pdfqrcode __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfqrcode";
if (Debug.shouldDelegate(ba, "setpagebreakbefore", true))
	 {return ((b4j.example.pdfqrcode) Debug.delegate(ba, "setpagebreakbefore", null));}
RDebugUtils.currentLine=55902208;
 //BA.debugLineNum = 55902208;BA.debugLine="Sub SetPageBreakBefore As PDFQRCode";
RDebugUtils.currentLine=55902209;
 //BA.debugLineNum = 55902209;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));
RDebugUtils.currentLine=55902210;
 //BA.debugLineNum = 55902210;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
RDebugUtils.currentLine=55902211;
 //BA.debugLineNum = 55902211;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfqrcode  _setpageorientation(b4j.example.pdfqrcode __ref,String _spageorientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfqrcode";
if (Debug.shouldDelegate(ba, "setpageorientation", true))
	 {return ((b4j.example.pdfqrcode) Debug.delegate(ba, "setpageorientation", new Object[] {_spageorientation}));}
RDebugUtils.currentLine=55771136;
 //BA.debugLineNum = 55771136;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
RDebugUtils.currentLine=55771137;
 //BA.debugLineNum = 55771137;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdfqrcode)(this);};
RDebugUtils.currentLine=55771138;
 //BA.debugLineNum = 55771138;BA.debugLine="pageOrientation = spageOrientation";
__ref._pageorientation /*String*/  = _spageorientation;
RDebugUtils.currentLine=55771139;
 //BA.debugLineNum = 55771139;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfqrcode)(this);
RDebugUtils.currentLine=55771140;
 //BA.debugLineNum = 55771140;BA.debugLine="End Sub";
return null;
}
}