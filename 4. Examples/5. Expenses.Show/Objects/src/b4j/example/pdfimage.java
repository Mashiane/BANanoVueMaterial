package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfimage extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfimage", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _class_globals(b4j.example.pdfimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
RDebugUtils.currentLine=49283072;
 //BA.debugLineNum = 49283072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=49283073;
 //BA.debugLineNum = 49283073;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49283074;
 //BA.debugLineNum = 49283074;BA.debugLine="Public image As String";
_image = "";
RDebugUtils.currentLine=49283075;
 //BA.debugLineNum = 49283075;BA.debugLine="Public width As Int";
_width = 0;
RDebugUtils.currentLine=49283076;
 //BA.debugLineNum = 49283076;BA.debugLine="Public height As Int";
_height = 0;
RDebugUtils.currentLine=49283077;
 //BA.debugLineNum = 49283077;BA.debugLine="Public pageBreakAfter As Boolean";
_pagebreakafter = false;
RDebugUtils.currentLine=49283078;
 //BA.debugLineNum = 49283078;BA.debugLine="Public pageBreakBefore As Boolean";
_pagebreakbefore = false;
RDebugUtils.currentLine=49283079;
 //BA.debugLineNum = 49283079;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
RDebugUtils.currentLine=49283080;
 //BA.debugLineNum = 49283080;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=49283081;
 //BA.debugLineNum = 49283081;BA.debugLine="Public link As String";
_link = "";
RDebugUtils.currentLine=49283082;
 //BA.debugLineNum = 49283082;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdfimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=50069504;
 //BA.debugLineNum = 50069504;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=50069505;
 //BA.debugLineNum = 50069505;BA.debugLine="If image <> Null Then options.Put(\"image\", image)";
if (__ref._image /*String*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("image"),(Object)(__ref._image /*String*/ ));};
RDebugUtils.currentLine=50069506;
 //BA.debugLineNum = 50069506;BA.debugLine="If width <> Null Then options.Put(\"width\", width)";
if (__ref._width /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("width"),(Object)(__ref._width /*int*/ ));};
RDebugUtils.currentLine=50069507;
 //BA.debugLineNum = 50069507;BA.debugLine="If height <> Null Then options.Put(\"height\", heig";
if (__ref._height /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("height"),(Object)(__ref._height /*int*/ ));};
RDebugUtils.currentLine=50069508;
 //BA.debugLineNum = 50069508;BA.debugLine="If pageBreakAfter <> Null Then options.Put(\"pageB";
if (__ref._pagebreakafter /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));};
RDebugUtils.currentLine=50069509;
 //BA.debugLineNum = 50069509;BA.debugLine="If pageBreakBefore <> Null Then options.Put(\"page";
if (__ref._pagebreakbefore /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));};
RDebugUtils.currentLine=50069510;
 //BA.debugLineNum = 50069510;BA.debugLine="If link <> Null Then options.Put(\"link\", link)";
if (__ref._link /*String*/ != null) { 
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("link"),(Object)(__ref._link /*String*/ ));};
RDebugUtils.currentLine=50069511;
 //BA.debugLineNum = 50069511;BA.debugLine="Return options";
if (true) return __ref._options /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=50069512;
 //BA.debugLineNum = 50069512;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _initialize(b4j.example.pdfimage __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=49348608;
 //BA.debugLineNum = 49348608;BA.debugLine="Public Sub Initialize As PDFImage";
RDebugUtils.currentLine=49348609;
 //BA.debugLineNum = 49348609;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=49348610;
 //BA.debugLineNum = 49348610;BA.debugLine="image = Null";
__ref._image /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=49348611;
 //BA.debugLineNum = 49348611;BA.debugLine="width = Null";
__ref._width /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=49348612;
 //BA.debugLineNum = 49348612;BA.debugLine="height = Null";
__ref._height /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=49348613;
 //BA.debugLineNum = 49348613;BA.debugLine="pageBreakAfter = Null";
__ref._pagebreakafter /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=49348614;
 //BA.debugLineNum = 49348614;BA.debugLine="pageBreakBefore = Null";
__ref._pagebreakbefore /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=49348615;
 //BA.debugLineNum = 49348615;BA.debugLine="pageOrientation = Null";
__ref._pageorientation /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=49348616;
 //BA.debugLineNum = 49348616;BA.debugLine="link = Null";
__ref._link /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=49348617;
 //BA.debugLineNum = 49348617;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49348618;
 //BA.debugLineNum = 49348618;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setabsoluteposition(b4j.example.pdfimage __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setabsoluteposition", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setabsoluteposition", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=49807360;
 //BA.debugLineNum = 49807360;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
RDebugUtils.currentLine=49807361;
 //BA.debugLineNum = 49807361;BA.debugLine="If x > 0 And y > 0 Then";
if (_x>0 && _y>0) { 
RDebugUtils.currentLine=49807362;
 //BA.debugLineNum = 49807362;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=49807363;
 //BA.debugLineNum = 49807363;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=49807364;
 //BA.debugLineNum = 49807364;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=49807365;
 //BA.debugLineNum = 49807365;BA.debugLine="options.Put(\"absolutePosition\", opt)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 };
RDebugUtils.currentLine=49807367;
 //BA.debugLineNum = 49807367;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49807368;
 //BA.debugLineNum = 49807368;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setfit(b4j.example.pdfimage __ref,int _w,int _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setfit", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setfit", new Object[] {_w,_h}));}
anywheresoftware.b4a.objects.collections.List _lst = null;
RDebugUtils.currentLine=49872896;
 //BA.debugLineNum = 49872896;BA.debugLine="Sub SetFit(w As Int, h As Int) As PDFImage";
RDebugUtils.currentLine=49872897;
 //BA.debugLineNum = 49872897;BA.debugLine="If w > 0 And h > 0 Then";
if (_w>0 && _h>0) { 
RDebugUtils.currentLine=49872898;
 //BA.debugLineNum = 49872898;BA.debugLine="Dim lst As List";
_lst = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49872899;
 //BA.debugLineNum = 49872899;BA.debugLine="lst.Initialize";
_lst.Initialize();
RDebugUtils.currentLine=49872900;
 //BA.debugLineNum = 49872900;BA.debugLine="lst.Add(w)";
_lst.Add((Object)(_w));
RDebugUtils.currentLine=49872901;
 //BA.debugLineNum = 49872901;BA.debugLine="lst.Add(h)";
_lst.Add((Object)(_h));
RDebugUtils.currentLine=49872902;
 //BA.debugLineNum = 49872902;BA.debugLine="options.Put(\"fit\", lst)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("fit"),(Object)(_lst.getObject()));
 };
RDebugUtils.currentLine=49872904;
 //BA.debugLineNum = 49872904;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49872905;
 //BA.debugLineNum = 49872905;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setheight(b4j.example.pdfimage __ref,int _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=49610752;
 //BA.debugLineNum = 49610752;BA.debugLine="Sub SetHeight(h As Int) As PDFImage";
RDebugUtils.currentLine=49610753;
 //BA.debugLineNum = 49610753;BA.debugLine="If h = 0 Then Return Me";
if (_h==0) { 
if (true) return (b4j.example.pdfimage)(this);};
RDebugUtils.currentLine=49610754;
 //BA.debugLineNum = 49610754;BA.debugLine="height = h";
__ref._height /*int*/  = _h;
RDebugUtils.currentLine=49610755;
 //BA.debugLineNum = 49610755;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49610756;
 //BA.debugLineNum = 49610756;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setimage(b4j.example.pdfimage __ref,String _imgkey) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setimage", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setimage", new Object[] {_imgkey}));}
RDebugUtils.currentLine=49676288;
 //BA.debugLineNum = 49676288;BA.debugLine="Sub SetImage(imgKey As String) As PDFImage";
RDebugUtils.currentLine=49676289;
 //BA.debugLineNum = 49676289;BA.debugLine="If imgKey = \"\" Then Return Me";
if ((_imgkey).equals("")) { 
if (true) return (b4j.example.pdfimage)(this);};
RDebugUtils.currentLine=49676290;
 //BA.debugLineNum = 49676290;BA.debugLine="image = imgKey";
__ref._image /*String*/  = _imgkey;
RDebugUtils.currentLine=49676291;
 //BA.debugLineNum = 49676291;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49676292;
 //BA.debugLineNum = 49676292;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setlink(b4j.example.pdfimage __ref,String _slink) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setlink", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setlink", new Object[] {_slink}));}
RDebugUtils.currentLine=49414144;
 //BA.debugLineNum = 49414144;BA.debugLine="Sub SetLink(slink As String) As PDFImage";
RDebugUtils.currentLine=49414145;
 //BA.debugLineNum = 49414145;BA.debugLine="If slink = \"\" Then Return Me";
if ((_slink).equals("")) { 
if (true) return (b4j.example.pdfimage)(this);};
RDebugUtils.currentLine=49414146;
 //BA.debugLineNum = 49414146;BA.debugLine="link = slink";
__ref._link /*String*/  = _slink;
RDebugUtils.currentLine=49414147;
 //BA.debugLineNum = 49414147;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49414148;
 //BA.debugLineNum = 49414148;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setmargin(b4j.example.pdfimage __ref,int _l,int _t,int _r,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setmargin", new Object[] {_l,_t,_r,_b}));}
anywheresoftware.b4a.objects.collections.List _margin = null;
RDebugUtils.currentLine=50135040;
 //BA.debugLineNum = 50135040;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
RDebugUtils.currentLine=50135041;
 //BA.debugLineNum = 50135041;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_l = (int) (0);};
RDebugUtils.currentLine=50135042;
 //BA.debugLineNum = 50135042;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_t = (int) (0);};
RDebugUtils.currentLine=50135043;
 //BA.debugLineNum = 50135043;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_r = (int) (0);};
RDebugUtils.currentLine=50135044;
 //BA.debugLineNum = 50135044;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_b = (int) (0);};
RDebugUtils.currentLine=50135045;
 //BA.debugLineNum = 50135045;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50135046;
 //BA.debugLineNum = 50135046;BA.debugLine="margin.Initialize";
_margin.Initialize();
RDebugUtils.currentLine=50135047;
 //BA.debugLineNum = 50135047;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
RDebugUtils.currentLine=50135048;
 //BA.debugLineNum = 50135048;BA.debugLine="options.Put(\"margin\", margin)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("margin"),(Object)(_margin.getObject()));
RDebugUtils.currentLine=50135049;
 //BA.debugLineNum = 50135049;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=50135050;
 //BA.debugLineNum = 50135050;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setopacity(b4j.example.pdfimage __ref,double _opacity) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setopacity", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setopacity", new Object[] {_opacity}));}
RDebugUtils.currentLine=49741824;
 //BA.debugLineNum = 49741824;BA.debugLine="Sub SetOpacity(opacity As Double) As PDFImage";
RDebugUtils.currentLine=49741825;
 //BA.debugLineNum = 49741825;BA.debugLine="If opacity > 0 Then Return Me";
if (_opacity>0) { 
if (true) return (b4j.example.pdfimage)(this);};
RDebugUtils.currentLine=49741826;
 //BA.debugLineNum = 49741826;BA.debugLine="options.Put(\"opacity\", opacity)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("opacity"),(Object)(_opacity));
RDebugUtils.currentLine=49741827;
 //BA.debugLineNum = 49741827;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49741828;
 //BA.debugLineNum = 49741828;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setpagebreakafter(b4j.example.pdfimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setpagebreakafter", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setpagebreakafter", null));}
RDebugUtils.currentLine=50003968;
 //BA.debugLineNum = 50003968;BA.debugLine="Sub SetPageBreakAfter As PDFImage";
RDebugUtils.currentLine=50003969;
 //BA.debugLineNum = 50003969;BA.debugLine="options.Put(\"pageBreak\", \"after\")";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));
RDebugUtils.currentLine=50003970;
 //BA.debugLineNum = 50003970;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=50003971;
 //BA.debugLineNum = 50003971;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setpagebreakbefore(b4j.example.pdfimage __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setpagebreakbefore", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setpagebreakbefore", null));}
RDebugUtils.currentLine=49938432;
 //BA.debugLineNum = 49938432;BA.debugLine="Sub SetPageBreakBefore As PDFImage";
RDebugUtils.currentLine=49938433;
 //BA.debugLineNum = 49938433;BA.debugLine="options.Put(\"pageBreak\", \"before\")";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));
RDebugUtils.currentLine=49938434;
 //BA.debugLineNum = 49938434;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49938435;
 //BA.debugLineNum = 49938435;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setpageorientation(b4j.example.pdfimage __ref,String _spageorientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setpageorientation", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setpageorientation", new Object[] {_spageorientation}));}
RDebugUtils.currentLine=49479680;
 //BA.debugLineNum = 49479680;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
RDebugUtils.currentLine=49479681;
 //BA.debugLineNum = 49479681;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdfimage)(this);};
RDebugUtils.currentLine=49479682;
 //BA.debugLineNum = 49479682;BA.debugLine="pageOrientation = spageOrientation";
__ref._pageorientation /*String*/  = _spageorientation;
RDebugUtils.currentLine=49479683;
 //BA.debugLineNum = 49479683;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49479684;
 //BA.debugLineNum = 49479684;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfimage  _setwidth(b4j.example.pdfimage __ref,int _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfimage";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.pdfimage) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=49545216;
 //BA.debugLineNum = 49545216;BA.debugLine="Sub SetWidth(w As Int) As PDFImage";
RDebugUtils.currentLine=49545217;
 //BA.debugLineNum = 49545217;BA.debugLine="If w = 0 Then Return Me";
if (_w==0) { 
if (true) return (b4j.example.pdfimage)(this);};
RDebugUtils.currentLine=49545218;
 //BA.debugLineNum = 49545218;BA.debugLine="width = w";
__ref._width /*int*/  = _w;
RDebugUtils.currentLine=49545219;
 //BA.debugLineNum = 49545219;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfimage)(this);
RDebugUtils.currentLine=49545220;
 //BA.debugLineNum = 49545220;BA.debugLine="End Sub";
return null;
}
}