package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfimage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdfimage", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfimage.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public String _image = "";
public int _width = 0;
public int _height = 0;
public boolean _pagebreakafter = false;
public boolean _pagebreakbefore = false;
public String _pageorientation = "";
public com.ab.banano.BANano _banano = null;
public String _link = "";
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
 //BA.debugLineNum = 3;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Public image As String";
_image = "";
 //BA.debugLineNum = 5;BA.debugLine="Public width As Int";
_width = 0;
 //BA.debugLineNum = 6;BA.debugLine="Public height As Int";
_height = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public pageBreakAfter As Boolean";
_pagebreakafter = false;
 //BA.debugLineNum = 8;BA.debugLine="Public pageBreakBefore As Boolean";
_pagebreakbefore = false;
 //BA.debugLineNum = 9;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
 //BA.debugLineNum = 10;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 11;BA.debugLine="Public link As String";
_link = "";
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 103;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 104;BA.debugLine="If image <> Null Then options.Put(\"image\", image)";
if (_image!= null) { 
_options.Put((Object)("image"),(Object)(_image));};
 //BA.debugLineNum = 105;BA.debugLine="If width <> Null Then options.Put(\"width\", width)";
if (_width!=(double)(BA.ObjectToNumber(__c.Null))) { 
_options.Put((Object)("width"),(Object)(_width));};
 //BA.debugLineNum = 106;BA.debugLine="If height <> Null Then options.Put(\"height\", heig";
if (_height!=(double)(BA.ObjectToNumber(__c.Null))) { 
_options.Put((Object)("height"),(Object)(_height));};
 //BA.debugLineNum = 107;BA.debugLine="If pageBreakAfter <> Null Then options.Put(\"pageB";
if (_pagebreakafter!=BA.ObjectToBoolean(__c.Null)) { 
_options.Put((Object)("pageBreak"),(Object)("after"));};
 //BA.debugLineNum = 108;BA.debugLine="If pageBreakBefore <> Null Then options.Put(\"page";
if (_pagebreakbefore!=BA.ObjectToBoolean(__c.Null)) { 
_options.Put((Object)("pageBreak"),(Object)("before"));};
 //BA.debugLineNum = 109;BA.debugLine="If link <> Null Then options.Put(\"link\", link)";
if (_link!= null) { 
_options.Put((Object)("link"),(Object)(_link));};
 //BA.debugLineNum = 110;BA.debugLine="Return options";
if (true) return _options;
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize As PDFImage";
 //BA.debugLineNum = 16;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 17;BA.debugLine="image = Null";
_image = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 18;BA.debugLine="width = Null";
_width = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 19;BA.debugLine="height = Null";
_height = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 20;BA.debugLine="pageBreakAfter = Null";
_pagebreakafter = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 21;BA.debugLine="pageBreakBefore = Null";
_pagebreakbefore = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 22;BA.debugLine="pageOrientation = Null";
_pageorientation = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 23;BA.debugLine="link = Null";
_link = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 68;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 69;BA.debugLine="If x > 0 And y > 0 Then";
if (_x>0 && _y>0) { 
 //BA.debugLineNum = 70;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 71;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 72;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 73;BA.debugLine="options.Put(\"absolutePosition\", opt)";
_options.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 };
 //BA.debugLineNum = 75;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 76;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setfit(int _w,int _h) throws Exception{
anywheresoftware.b4a.objects.collections.List _lst = null;
 //BA.debugLineNum = 79;BA.debugLine="Sub SetFit(w As Int, h As Int) As PDFImage";
 //BA.debugLineNum = 80;BA.debugLine="If w > 0 And h > 0 Then";
if (_w>0 && _h>0) { 
 //BA.debugLineNum = 81;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 82;BA.debugLine="lst.Initialize";
_lst.Initialize();
 //BA.debugLineNum = 83;BA.debugLine="lst.Add(w)";
_lst.Add((Object)(_w));
 //BA.debugLineNum = 84;BA.debugLine="lst.Add(h)";
_lst.Add((Object)(_h));
 //BA.debugLineNum = 85;BA.debugLine="options.Put(\"fit\", lst)";
_options.Put((Object)("fit"),(Object)(_lst.getObject()));
 };
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setheight(int _h) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetHeight(h As Int) As PDFImage";
 //BA.debugLineNum = 48;BA.debugLine="If h = 0 Then Return Me";
if (_h==0) { 
if (true) return (b4j.example.pdfimage)(this);};
 //BA.debugLineNum = 49;BA.debugLine="height = h";
_height = _h;
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setimage(String _imgkey) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetImage(imgKey As String) As PDFImage";
 //BA.debugLineNum = 55;BA.debugLine="If imgKey = \"\" Then Return Me";
if ((_imgkey).equals("")) { 
if (true) return (b4j.example.pdfimage)(this);};
 //BA.debugLineNum = 56;BA.debugLine="image = imgKey";
_image = _imgkey;
 //BA.debugLineNum = 57;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 58;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setlink(String _slink) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetLink(slink As String) As PDFImage";
 //BA.debugLineNum = 28;BA.debugLine="If slink = \"\" Then Return Me";
if ((_slink).equals("")) { 
if (true) return (b4j.example.pdfimage)(this);};
 //BA.debugLineNum = 29;BA.debugLine="link = slink";
_link = _slink;
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setmargin(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 115;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
 //BA.debugLineNum = 116;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_l = (int) (0);};
 //BA.debugLineNum = 117;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_t = (int) (0);};
 //BA.debugLineNum = 118;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_r = (int) (0);};
 //BA.debugLineNum = 119;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_b = (int) (0);};
 //BA.debugLineNum = 120;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 121;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 122;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 123;BA.debugLine="options.Put(\"margin\", margin)";
_options.Put((Object)("margin"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setopacity(double _opacity) throws Exception{
 //BA.debugLineNum = 61;BA.debugLine="Sub SetOpacity(opacity As Double) As PDFImage";
 //BA.debugLineNum = 62;BA.debugLine="If opacity > 0 Then Return Me";
if (_opacity>0) { 
if (true) return (b4j.example.pdfimage)(this);};
 //BA.debugLineNum = 63;BA.debugLine="options.Put(\"opacity\", opacity)";
_options.Put((Object)("opacity"),(Object)(_opacity));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setpagebreakafter() throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetPageBreakAfter As PDFImage";
 //BA.debugLineNum = 98;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
_options.Put((Object)("pageBreak"),(Object)("after"));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setpagebreakbefore() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub SetPageBreakBefore As PDFImage";
 //BA.debugLineNum = 92;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
_options.Put((Object)("pageBreak"),(Object)("before"));
 //BA.debugLineNum = 93;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 94;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setpageorientation(String _spageorientation) throws Exception{
 //BA.debugLineNum = 33;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
 //BA.debugLineNum = 34;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdfimage)(this);};
 //BA.debugLineNum = 35;BA.debugLine="pageOrientation = spageOrientation";
_pageorientation = _spageorientation;
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setwidth(int _w) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetWidth(w As Int) As PDFImage";
 //BA.debugLineNum = 41;BA.debugLine="If w = 0 Then Return Me";
if (_w==0) { 
if (true) return (b4j.example.pdfimage)(this);};
 //BA.debugLineNum = 42;BA.debugLine="width = w";
_width = _w;
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
