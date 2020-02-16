package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfstyle extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfstyle", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfstyle.class).invoke(this, new Object[] {null});
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
public int _fontsize = 0;
public boolean _bold = false;
public boolean _italics = false;
public boolean _alignmentright = false;
public boolean _alignmentcenter = false;
public boolean _alignmentjustify = false;
public String _color = "";
public String _name = "";
public String _width = "";
public String _height = "";
public double _opacity = 0;
public double _angle = 0;
public anywheresoftware.b4a.objects.collections.Map _m = null;
public anywheresoftware.b4a.objects.collections.List _styles = null;
public int _columngap = 0;
public String _fillcolor = "";
public String _background = "";
public com.ab.banano.BANano _banano = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _include(b4j.example.pdfstyle __ref,anywheresoftware.b4a.objects.collections.Map _target) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "include", true))
	 {return ((String) Debug.delegate(ba, "include", new Object[] {_target}));}
anywheresoftware.b4a.objects.collections.Map _source = null;
String _k = "";
Object _v = null;
RDebugUtils.currentLine=58916864;
 //BA.debugLineNum = 58916864;BA.debugLine="Sub Include(target As Map)";
RDebugUtils.currentLine=58916865;
 //BA.debugLineNum = 58916865;BA.debugLine="Dim source As Map = getContent";
_source = new anywheresoftware.b4a.objects.collections.Map();
_source = __ref._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null);
RDebugUtils.currentLine=58916866;
 //BA.debugLineNum = 58916866;BA.debugLine="For Each k As String In source.Keys";
{
final anywheresoftware.b4a.BA.IterableList group2 = _source.Keys();
final int groupLen2 = group2.getSize()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.Get(index2));
RDebugUtils.currentLine=58916867;
 //BA.debugLineNum = 58916867;BA.debugLine="Dim v As Object = source.Get(k)";
_v = _source.Get((Object)(_k));
RDebugUtils.currentLine=58916868;
 //BA.debugLineNum = 58916868;BA.debugLine="target.Put(k, v)";
_target.Put((Object)(_k),_v);
 }
};
RDebugUtils.currentLine=58916870;
 //BA.debugLineNum = 58916870;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfstyle  _initialize(b4j.example.pdfstyle __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=57671680;
 //BA.debugLineNum = 57671680;BA.debugLine="Public Sub Initialize As PDFStyle";
RDebugUtils.currentLine=57671681;
 //BA.debugLineNum = 57671681;BA.debugLine="m.Initialize";
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=57671682;
 //BA.debugLineNum = 57671682;BA.debugLine="name = Null";
__ref._name /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=57671683;
 //BA.debugLineNum = 57671683;BA.debugLine="fillColor = Null";
__ref._fillcolor /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=57671684;
 //BA.debugLineNum = 57671684;BA.debugLine="background = Null";
__ref._background /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=57671685;
 //BA.debugLineNum = 57671685;BA.debugLine="fontSize = Null";
__ref._fontsize /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=57671686;
 //BA.debugLineNum = 57671686;BA.debugLine="bold = Null";
__ref._bold /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=57671687;
 //BA.debugLineNum = 57671687;BA.debugLine="italics = Null";
__ref._italics /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=57671688;
 //BA.debugLineNum = 57671688;BA.debugLine="alignmentRight = Null";
__ref._alignmentright /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=57671689;
 //BA.debugLineNum = 57671689;BA.debugLine="alignmentCenter = Null";
__ref._alignmentcenter /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=57671690;
 //BA.debugLineNum = 57671690;BA.debugLine="alignmentJustify = Null";
__ref._alignmentjustify /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=57671691;
 //BA.debugLineNum = 57671691;BA.debugLine="color = Null";
__ref._color /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=57671692;
 //BA.debugLineNum = 57671692;BA.debugLine="width = Null";
__ref._width /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=57671693;
 //BA.debugLineNum = 57671693;BA.debugLine="opacity = Null";
__ref._opacity /*double*/  = (double)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=57671694;
 //BA.debugLineNum = 57671694;BA.debugLine="angle = Null";
__ref._angle /*double*/  = (double)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=57671695;
 //BA.debugLineNum = 57671695;BA.debugLine="styles.Initialize";
__ref._styles /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=57671696;
 //BA.debugLineNum = 57671696;BA.debugLine="columnGap = Null";
__ref._columngap /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=57671697;
 //BA.debugLineNum = 57671697;BA.debugLine="height = Null";
__ref._height /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=57671698;
 //BA.debugLineNum = 57671698;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=57671699;
 //BA.debugLineNum = 57671699;BA.debugLine="End Sub";
return null;
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdfstyle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=58851328;
 //BA.debugLineNum = 58851328;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=58851329;
 //BA.debugLineNum = 58851329;BA.debugLine="If fontSize <> Null Then m.put(\"fontSize\", fontSi";
if (__ref._fontsize /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("fontSize"),(Object)(__ref._fontsize /*int*/ ));};
RDebugUtils.currentLine=58851330;
 //BA.debugLineNum = 58851330;BA.debugLine="If bold <> Null Then m.Put(\"bold\", bold)";
if (__ref._bold /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("bold"),(Object)(__ref._bold /*boolean*/ ));};
RDebugUtils.currentLine=58851331;
 //BA.debugLineNum = 58851331;BA.debugLine="If italics <> Null Then m.Put(\"italics\", italics)";
if (__ref._italics /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("italics"),(Object)(__ref._italics /*boolean*/ ));};
RDebugUtils.currentLine=58851332;
 //BA.debugLineNum = 58851332;BA.debugLine="If alignmentRight <> Null Then m.Put(\"alignment\",";
if (__ref._alignmentright /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("alignment"),(Object)("right"));};
RDebugUtils.currentLine=58851333;
 //BA.debugLineNum = 58851333;BA.debugLine="If alignmentCenter <> Null Then m.Put(\"alignment\"";
if (__ref._alignmentcenter /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("alignment"),(Object)("center"));};
RDebugUtils.currentLine=58851334;
 //BA.debugLineNum = 58851334;BA.debugLine="If alignmentJustify <> Null Then m.Put(\"alignment";
if (__ref._alignmentjustify /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("alignment"),(Object)("justify"));};
RDebugUtils.currentLine=58851335;
 //BA.debugLineNum = 58851335;BA.debugLine="If color <> Null Then m.Put(\"color\", color)";
if (__ref._color /*String*/ != null) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("color"),(Object)(__ref._color /*String*/ ));};
RDebugUtils.currentLine=58851336;
 //BA.debugLineNum = 58851336;BA.debugLine="If opacity <> Null Then m.Put(\"opacity\", opacity)";
if (__ref._opacity /*double*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("opacity"),(Object)(__ref._opacity /*double*/ ));};
RDebugUtils.currentLine=58851337;
 //BA.debugLineNum = 58851337;BA.debugLine="If angle <> Null Then m.Put(\"angle\", angle)";
if (__ref._angle /*double*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("angle"),(Object)(__ref._angle /*double*/ ));};
RDebugUtils.currentLine=58851338;
 //BA.debugLineNum = 58851338;BA.debugLine="If width <> Null Then m.Put(\"width\", width)";
if (__ref._width /*String*/ != null) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("width"),(Object)(__ref._width /*String*/ ));};
RDebugUtils.currentLine=58851339;
 //BA.debugLineNum = 58851339;BA.debugLine="If height <> Null Then m.Put(\"height\", height)";
if (__ref._height /*String*/ != null) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("height"),(Object)(__ref._height /*String*/ ));};
RDebugUtils.currentLine=58851340;
 //BA.debugLineNum = 58851340;BA.debugLine="If columnGap <> Null Then m.Put(\"columnGap\", colu";
if (__ref._columngap /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("columnGap"),(Object)(__ref._columngap /*int*/ ));};
RDebugUtils.currentLine=58851341;
 //BA.debugLineNum = 58851341;BA.debugLine="If fillColor <> Null Then m.Put(\"fillColor\", fill";
if (__ref._fillcolor /*String*/ != null) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("fillColor"),(Object)(__ref._fillcolor /*String*/ ));};
RDebugUtils.currentLine=58851342;
 //BA.debugLineNum = 58851342;BA.debugLine="If background <> Null Then m.Put(\"background\", ba";
if (__ref._background /*String*/ != null) { 
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("background"),(Object)(__ref._background /*String*/ ));};
RDebugUtils.currentLine=58851343;
 //BA.debugLineNum = 58851343;BA.debugLine="If styles.Size > 0 Then";
if (__ref._styles /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=58851344;
 //BA.debugLineNum = 58851344;BA.debugLine="m.Put(\"style\", styles)";
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("style"),(Object)(__ref._styles /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
 };
RDebugUtils.currentLine=58851346;
 //BA.debugLineNum = 58851346;BA.debugLine="Return m";
if (true) return __ref._m /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=58851347;
 //BA.debugLineNum = 58851347;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setname(b4j.example.pdfstyle __ref,String _sname) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setname", new Object[] {_sname}));}
RDebugUtils.currentLine=58261504;
 //BA.debugLineNum = 58261504;BA.debugLine="Sub SetName(sname As String) As PDFStyle";
RDebugUtils.currentLine=58261505;
 //BA.debugLineNum = 58261505;BA.debugLine="If sname = \"\" Then Return Me";
if ((_sname).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=58261506;
 //BA.debugLineNum = 58261506;BA.debugLine="name = sname";
__ref._name /*String*/  = _sname;
RDebugUtils.currentLine=58261507;
 //BA.debugLineNum = 58261507;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58261508;
 //BA.debugLineNum = 58261508;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setbold(b4j.example.pdfstyle __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setbold", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setbold", new Object[] {_b}));}
RDebugUtils.currentLine=58392576;
 //BA.debugLineNum = 58392576;BA.debugLine="Sub SetBold(b As Boolean) As PDFStyle";
RDebugUtils.currentLine=58392577;
 //BA.debugLineNum = 58392577;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=58392578;
 //BA.debugLineNum = 58392578;BA.debugLine="bold = b";
__ref._bold /*boolean*/  = _b;
RDebugUtils.currentLine=58392579;
 //BA.debugLineNum = 58392579;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58392580;
 //BA.debugLineNum = 58392580;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setitalics(b4j.example.pdfstyle __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setitalics", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setitalics", new Object[] {_b}));}
RDebugUtils.currentLine=58327040;
 //BA.debugLineNum = 58327040;BA.debugLine="Sub SetItalics(b As Boolean) As PDFStyle";
RDebugUtils.currentLine=58327041;
 //BA.debugLineNum = 58327041;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=58327042;
 //BA.debugLineNum = 58327042;BA.debugLine="italics = b";
__ref._italics /*boolean*/  = _b;
RDebugUtils.currentLine=58327043;
 //BA.debugLineNum = 58327043;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58327044;
 //BA.debugLineNum = 58327044;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setfontsize(b4j.example.pdfstyle __ref,int _ifontsize) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setfontsize", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setfontsize", new Object[] {_ifontsize}));}
RDebugUtils.currentLine=58458112;
 //BA.debugLineNum = 58458112;BA.debugLine="Sub SetFontSize(ifontSize As Int) As PDFStyle";
RDebugUtils.currentLine=58458113;
 //BA.debugLineNum = 58458113;BA.debugLine="If ifontSize = 0 Then Return Me";
if (_ifontsize==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=58458114;
 //BA.debugLineNum = 58458114;BA.debugLine="fontSize = ifontSize";
__ref._fontsize /*int*/  = _ifontsize;
RDebugUtils.currentLine=58458115;
 //BA.debugLineNum = 58458115;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58458116;
 //BA.debugLineNum = 58458116;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setmargin(b4j.example.pdfstyle __ref,int _l,int _t,int _r,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setmargin", new Object[] {_l,_t,_r,_b}));}
anywheresoftware.b4a.objects.collections.List _margin = null;
RDebugUtils.currentLine=58589184;
 //BA.debugLineNum = 58589184;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
RDebugUtils.currentLine=58589185;
 //BA.debugLineNum = 58589185;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_l = (int) (0);};
RDebugUtils.currentLine=58589186;
 //BA.debugLineNum = 58589186;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_t = (int) (0);};
RDebugUtils.currentLine=58589187;
 //BA.debugLineNum = 58589187;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_r = (int) (0);};
RDebugUtils.currentLine=58589188;
 //BA.debugLineNum = 58589188;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_b = (int) (0);};
RDebugUtils.currentLine=58589189;
 //BA.debugLineNum = 58589189;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58589190;
 //BA.debugLineNum = 58589190;BA.debugLine="margin.Initialize";
_margin.Initialize();
RDebugUtils.currentLine=58589191;
 //BA.debugLineNum = 58589191;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
RDebugUtils.currentLine=58589192;
 //BA.debugLineNum = 58589192;BA.debugLine="m.Put(\"margin\", margin)";
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("margin"),(Object)(_margin.getObject()));
RDebugUtils.currentLine=58589193;
 //BA.debugLineNum = 58589193;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58589194;
 //BA.debugLineNum = 58589194;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _noborder(b4j.example.pdfstyle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "noborder", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "noborder", null));}
RDebugUtils.currentLine=58654720;
 //BA.debugLineNum = 58654720;BA.debugLine="Sub NoBorder As PDFStyle";
RDebugUtils.currentLine=58654721;
 //BA.debugLineNum = 58654721;BA.debugLine="m.Put(\"border\", BANano.UNDEFINED)";
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("border"),__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED());
RDebugUtils.currentLine=58654722;
 //BA.debugLineNum = 58654722;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58654723;
 //BA.debugLineNum = 58654723;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setborder(b4j.example.pdfstyle __ref,boolean _l,boolean _t,boolean _r,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setborder", new Object[] {_l,_t,_r,_b}));}
anywheresoftware.b4a.objects.collections.List _margin = null;
RDebugUtils.currentLine=58720256;
 //BA.debugLineNum = 58720256;BA.debugLine="Sub SetBorder(l As Boolean, t As Boolean, r As Boo";
RDebugUtils.currentLine=58720257;
 //BA.debugLineNum = 58720257;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==BA.ObjectToBoolean(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED())) { 
_l = BA.ObjectToBoolean(0);};
RDebugUtils.currentLine=58720258;
 //BA.debugLineNum = 58720258;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==BA.ObjectToBoolean(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED())) { 
_t = BA.ObjectToBoolean(0);};
RDebugUtils.currentLine=58720259;
 //BA.debugLineNum = 58720259;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==BA.ObjectToBoolean(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED())) { 
_r = BA.ObjectToBoolean(0);};
RDebugUtils.currentLine=58720260;
 //BA.debugLineNum = 58720260;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==BA.ObjectToBoolean(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED())) { 
_b = BA.ObjectToBoolean(0);};
RDebugUtils.currentLine=58720261;
 //BA.debugLineNum = 58720261;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=58720262;
 //BA.debugLineNum = 58720262;BA.debugLine="margin.Initialize";
_margin.Initialize();
RDebugUtils.currentLine=58720263;
 //BA.debugLineNum = 58720263;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
RDebugUtils.currentLine=58720264;
 //BA.debugLineNum = 58720264;BA.debugLine="m.Put(\"border\", margin)";
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("border"),(Object)(_margin.getObject()));
RDebugUtils.currentLine=58720265;
 //BA.debugLineNum = 58720265;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58720266;
 //BA.debugLineNum = 58720266;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setwidth(b4j.example.pdfstyle __ref,int _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=57933824;
 //BA.debugLineNum = 57933824;BA.debugLine="Sub SetWidth(w As Int) As PDFStyle";
RDebugUtils.currentLine=57933825;
 //BA.debugLineNum = 57933825;BA.debugLine="If w = 0 Then Return Me";
if (_w==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=57933826;
 //BA.debugLineNum = 57933826;BA.debugLine="width = w";
__ref._width /*String*/  = BA.NumberToString(_w);
RDebugUtils.currentLine=57933827;
 //BA.debugLineNum = 57933827;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=57933828;
 //BA.debugLineNum = 57933828;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setheight(b4j.example.pdfstyle __ref,int _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=57999360;
 //BA.debugLineNum = 57999360;BA.debugLine="Sub SetHeight(h As Int) As PDFStyle";
RDebugUtils.currentLine=57999361;
 //BA.debugLineNum = 57999361;BA.debugLine="If h = 0 Then Return Me";
if (_h==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=57999362;
 //BA.debugLineNum = 57999362;BA.debugLine="height = h";
__ref._height /*String*/  = BA.NumberToString(_h);
RDebugUtils.currentLine=57999363;
 //BA.debugLineNum = 57999363;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=57999364;
 //BA.debugLineNum = 57999364;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setcolor(b4j.example.pdfstyle __ref,String _scolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setcolor", new Object[] {_scolor}));}
RDebugUtils.currentLine=58064896;
 //BA.debugLineNum = 58064896;BA.debugLine="Sub SetColor(scolor As String) As PDFStyle";
RDebugUtils.currentLine=58064897;
 //BA.debugLineNum = 58064897;BA.debugLine="If scolor = \"\" Then Return Me";
if ((_scolor).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=58064898;
 //BA.debugLineNum = 58064898;BA.debugLine="color = scolor";
__ref._color /*String*/  = _scolor;
RDebugUtils.currentLine=58064899;
 //BA.debugLineNum = 58064899;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58064900;
 //BA.debugLineNum = 58064900;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setfillcolor(b4j.example.pdfstyle __ref,String _fc) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setfillcolor", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setfillcolor", new Object[] {_fc}));}
RDebugUtils.currentLine=58785792;
 //BA.debugLineNum = 58785792;BA.debugLine="Sub SetFillColor(fc As String) As PDFStyle";
RDebugUtils.currentLine=58785793;
 //BA.debugLineNum = 58785793;BA.debugLine="If fc = \"\" Then Return Me";
if ((_fc).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=58785794;
 //BA.debugLineNum = 58785794;BA.debugLine="fillColor = fc";
__ref._fillcolor /*String*/  = _fc;
RDebugUtils.currentLine=58785795;
 //BA.debugLineNum = 58785795;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58785796;
 //BA.debugLineNum = 58785796;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setbackground(b4j.example.pdfstyle __ref,String _sbackground) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setbackground", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setbackground", new Object[] {_sbackground}));}
RDebugUtils.currentLine=58130432;
 //BA.debugLineNum = 58130432;BA.debugLine="Sub SetBackground(sbackground As String) As PDFSty";
RDebugUtils.currentLine=58130433;
 //BA.debugLineNum = 58130433;BA.debugLine="If sbackground = \"\" Then Return Me";
if ((_sbackground).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=58130434;
 //BA.debugLineNum = 58130434;BA.debugLine="background = sbackground";
__ref._background /*String*/  = _sbackground;
RDebugUtils.currentLine=58130435;
 //BA.debugLineNum = 58130435;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58130436;
 //BA.debugLineNum = 58130436;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setopacity(b4j.example.pdfstyle __ref,double _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setopacity", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setopacity", new Object[] {_o}));}
RDebugUtils.currentLine=57868288;
 //BA.debugLineNum = 57868288;BA.debugLine="Sub SetOpacity(o As Double) As PDFStyle";
RDebugUtils.currentLine=57868289;
 //BA.debugLineNum = 57868289;BA.debugLine="If o = 0 Then Return Me";
if (_o==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=57868290;
 //BA.debugLineNum = 57868290;BA.debugLine="opacity = o";
__ref._opacity /*double*/  = _o;
RDebugUtils.currentLine=57868291;
 //BA.debugLineNum = 57868291;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=57868292;
 //BA.debugLineNum = 57868292;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setangle(b4j.example.pdfstyle __ref,double _dangle) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setangle", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setangle", new Object[] {_dangle}));}
RDebugUtils.currentLine=57802752;
 //BA.debugLineNum = 57802752;BA.debugLine="Sub SetAngle(dangle As Double) As PDFStyle";
RDebugUtils.currentLine=57802753;
 //BA.debugLineNum = 57802753;BA.debugLine="If dangle = 0 Then Return Me";
if (_dangle==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=57802754;
 //BA.debugLineNum = 57802754;BA.debugLine="angle = dangle";
__ref._angle /*double*/  = _dangle;
RDebugUtils.currentLine=57802755;
 //BA.debugLineNum = 57802755;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=57802756;
 //BA.debugLineNum = 57802756;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _setcolumngap(b4j.example.pdfstyle __ref,int _icolumngap) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setcolumngap", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setcolumngap", new Object[] {_icolumngap}));}
RDebugUtils.currentLine=57737216;
 //BA.debugLineNum = 57737216;BA.debugLine="Sub SetColumnGap(icolumnGap As Int) As PDFStyle";
RDebugUtils.currentLine=57737217;
 //BA.debugLineNum = 57737217;BA.debugLine="If icolumnGap = 0 Then Return Me";
if (_icolumngap==0) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=57737218;
 //BA.debugLineNum = 57737218;BA.debugLine="columnGap = icolumnGap";
__ref._columngap /*int*/  = _icolumngap;
RDebugUtils.currentLine=57737219;
 //BA.debugLineNum = 57737219;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=57737220;
 //BA.debugLineNum = 57737220;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstyle  _addstyle(b4j.example.pdfstyle __ref,String _stylename) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "addstyle", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "addstyle", new Object[] {_stylename}));}
RDebugUtils.currentLine=58523648;
 //BA.debugLineNum = 58523648;BA.debugLine="Sub AddStyle(styleName As String) As PDFStyle";
RDebugUtils.currentLine=58523649;
 //BA.debugLineNum = 58523649;BA.debugLine="styles.Add(styleName)";
__ref._styles /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_stylename));
RDebugUtils.currentLine=58523650;
 //BA.debugLineNum = 58523650;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58523651;
 //BA.debugLineNum = 58523651;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdfstyle __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
RDebugUtils.currentLine=57606144;
 //BA.debugLineNum = 57606144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=57606145;
 //BA.debugLineNum = 57606145;BA.debugLine="Public fontSize As Int";
_fontsize = 0;
RDebugUtils.currentLine=57606146;
 //BA.debugLineNum = 57606146;BA.debugLine="Public bold As Boolean";
_bold = false;
RDebugUtils.currentLine=57606147;
 //BA.debugLineNum = 57606147;BA.debugLine="Public italics As Boolean";
_italics = false;
RDebugUtils.currentLine=57606148;
 //BA.debugLineNum = 57606148;BA.debugLine="Public alignmentRight As Boolean";
_alignmentright = false;
RDebugUtils.currentLine=57606149;
 //BA.debugLineNum = 57606149;BA.debugLine="Public alignmentCenter As Boolean";
_alignmentcenter = false;
RDebugUtils.currentLine=57606150;
 //BA.debugLineNum = 57606150;BA.debugLine="Public alignmentJustify As Boolean";
_alignmentjustify = false;
RDebugUtils.currentLine=57606151;
 //BA.debugLineNum = 57606151;BA.debugLine="Public color As String";
_color = "";
RDebugUtils.currentLine=57606152;
 //BA.debugLineNum = 57606152;BA.debugLine="Public name As String";
_name = "";
RDebugUtils.currentLine=57606153;
 //BA.debugLineNum = 57606153;BA.debugLine="Public width As String";
_width = "";
RDebugUtils.currentLine=57606154;
 //BA.debugLineNum = 57606154;BA.debugLine="Public height As String";
_height = "";
RDebugUtils.currentLine=57606155;
 //BA.debugLineNum = 57606155;BA.debugLine="Public opacity As Double";
_opacity = 0;
RDebugUtils.currentLine=57606156;
 //BA.debugLineNum = 57606156;BA.debugLine="Public angle As Double";
_angle = 0;
RDebugUtils.currentLine=57606157;
 //BA.debugLineNum = 57606157;BA.debugLine="Private m As Map";
_m = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57606158;
 //BA.debugLineNum = 57606158;BA.debugLine="Private styles As List";
_styles = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57606159;
 //BA.debugLineNum = 57606159;BA.debugLine="Public columnGap As Int";
_columngap = 0;
RDebugUtils.currentLine=57606160;
 //BA.debugLineNum = 57606160;BA.debugLine="Public fillColor As String";
_fillcolor = "";
RDebugUtils.currentLine=57606161;
 //BA.debugLineNum = 57606161;BA.debugLine="Public background As String";
_background = "";
RDebugUtils.currentLine=57606162;
 //BA.debugLineNum = 57606162;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=57606163;
 //BA.debugLineNum = 57606163;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfstyle  _setalignment(b4j.example.pdfstyle __ref,String _alignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstyle";
if (Debug.shouldDelegate(ba, "setalignment", true))
	 {return ((b4j.example.pdfstyle) Debug.delegate(ba, "setalignment", new Object[] {_alignment}));}
RDebugUtils.currentLine=58195968;
 //BA.debugLineNum = 58195968;BA.debugLine="Sub SetAlignment(alignment As String) As PDFStyle";
RDebugUtils.currentLine=58195969;
 //BA.debugLineNum = 58195969;BA.debugLine="If alignment = \"\" Then Return Me";
if ((_alignment).equals("")) { 
if (true) return (b4j.example.pdfstyle)(this);};
RDebugUtils.currentLine=58195970;
 //BA.debugLineNum = 58195970;BA.debugLine="m.Put(\"alignment\", alignment)";
__ref._m /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("alignment"),(Object)(_alignment));
RDebugUtils.currentLine=58195971;
 //BA.debugLineNum = 58195971;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstyle)(this);
RDebugUtils.currentLine=58195972;
 //BA.debugLineNum = 58195972;BA.debugLine="End Sub";
return null;
}
}