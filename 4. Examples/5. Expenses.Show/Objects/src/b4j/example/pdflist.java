package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdflist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdflist", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdflist.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _liststyleobj{
public boolean IsInitialized;
public String circle;
public String square;
public String lowerAlpha;
public String upperAlpha;
public String upperRoman;
public String lowerRoman;
public String none;
public void Initialize() {
IsInitialized = true;
circle = "";
square = "";
lowerAlpha = "";
upperAlpha = "";
upperRoman = "";
lowerRoman = "";
none = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.List _items = null;
public anywheresoftware.b4a.objects.collections.Map _listx = null;
public String _ltype = "";
public boolean _reversed = false;
public int _start = 0;
public String _color = "";
public String _markercolor = "";
public String _separator = "";
public b4j.example.pdflist._liststyleobj _liststyle = null;
public String _style = "";
public String _pageorientation = "";
public com.ab.banano.BANano _banano = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdflist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=50724864;
 //BA.debugLineNum = 50724864;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=50724865;
 //BA.debugLineNum = 50724865;BA.debugLine="If reversed <> Null Then listX.Put(\"reversed\", re";
if (__ref._reversed /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("reversed"),(Object)(__ref._reversed /*boolean*/ ));};
RDebugUtils.currentLine=50724866;
 //BA.debugLineNum = 50724866;BA.debugLine="If start <> Null Then listX.Put(\"start\", start)";
if (__ref._start /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("start"),(Object)(__ref._start /*int*/ ));};
RDebugUtils.currentLine=50724867;
 //BA.debugLineNum = 50724867;BA.debugLine="If Style <> Null Then listX.Put(\"type\", Style)";
if (__ref._style /*String*/ != null) { 
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("type"),(Object)(__ref._style /*String*/ ));};
RDebugUtils.currentLine=50724868;
 //BA.debugLineNum = 50724868;BA.debugLine="If color <> Null Then listX.Put(\"color\", color)";
if (__ref._color /*String*/ != null) { 
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("color"),(Object)(__ref._color /*String*/ ));};
RDebugUtils.currentLine=50724869;
 //BA.debugLineNum = 50724869;BA.debugLine="If markerColor <> Null Then listX.Put(\"markerColo";
if (__ref._markercolor /*String*/ != null) { 
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("markerColor"),(Object)(__ref._markercolor /*String*/ ));};
RDebugUtils.currentLine=50724870;
 //BA.debugLineNum = 50724870;BA.debugLine="If separator <> Null Then listX.Put(\"separator\",";
if (__ref._separator /*String*/ != null) { 
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("separator"),(Object)(__ref._separator /*String*/ ));};
RDebugUtils.currentLine=50724871;
 //BA.debugLineNum = 50724871;BA.debugLine="listX.Put(lType, items)";
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(__ref._ltype /*String*/ ),(Object)(__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=50724872;
 //BA.debugLineNum = 50724872;BA.debugLine="Return listX";
if (true) return __ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=50724873;
 //BA.debugLineNum = 50724873;BA.debugLine="End Sub";
return null;
}
public String  _additems(b4j.example.pdflist __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "additems", true))
	 {return ((String) Debug.delegate(ba, "additems", new Object[] {_lst}));}
Object _item = null;
RDebugUtils.currentLine=50528256;
 //BA.debugLineNum = 50528256;BA.debugLine="Sub AddItems(lst As List)";
RDebugUtils.currentLine=50528257;
 //BA.debugLineNum = 50528257;BA.debugLine="For Each item As Object In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = group1.Get(index1);
RDebugUtils.currentLine=50528258;
 //BA.debugLineNum = 50528258;BA.debugLine="items.Add(item)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Add(_item);
 }
};
RDebugUtils.currentLine=50528260;
 //BA.debugLineNum = 50528260;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdflist  _addstring(b4j.example.pdflist __ref,String _str) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "addstring", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "addstring", new Object[] {_str}));}
RDebugUtils.currentLine=50462720;
 //BA.debugLineNum = 50462720;BA.debugLine="Sub AddString(str As String) As PDFList";
RDebugUtils.currentLine=50462721;
 //BA.debugLineNum = 50462721;BA.debugLine="items.Add(str)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_str));
RDebugUtils.currentLine=50462722;
 //BA.debugLineNum = 50462722;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
RDebugUtils.currentLine=50462723;
 //BA.debugLineNum = 50462723;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _addtext(b4j.example.pdflist __ref,b4j.example.pdftext _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "addtext", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "addtext", new Object[] {_txt}));}
RDebugUtils.currentLine=50397184;
 //BA.debugLineNum = 50397184;BA.debugLine="Sub AddText(txt As PDFText) As PDFList";
RDebugUtils.currentLine=50397185;
 //BA.debugLineNum = 50397185;BA.debugLine="items.Add(txt.Content)";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_txt._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=50397186;
 //BA.debugLineNum = 50397186;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
RDebugUtils.currentLine=50397187;
 //BA.debugLineNum = 50397187;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdflist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
RDebugUtils.currentLine=50200576;
 //BA.debugLineNum = 50200576;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=50200577;
 //BA.debugLineNum = 50200577;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50200578;
 //BA.debugLineNum = 50200578;BA.debugLine="Private listX As Map";
_listx = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=50200579;
 //BA.debugLineNum = 50200579;BA.debugLine="Private lType As String";
_ltype = "";
RDebugUtils.currentLine=50200580;
 //BA.debugLineNum = 50200580;BA.debugLine="Public reversed As Boolean";
_reversed = false;
RDebugUtils.currentLine=50200581;
 //BA.debugLineNum = 50200581;BA.debugLine="Public start As Int";
_start = 0;
RDebugUtils.currentLine=50200582;
 //BA.debugLineNum = 50200582;BA.debugLine="Public color As String";
_color = "";
RDebugUtils.currentLine=50200583;
 //BA.debugLineNum = 50200583;BA.debugLine="Public markerColor As String";
_markercolor = "";
RDebugUtils.currentLine=50200584;
 //BA.debugLineNum = 50200584;BA.debugLine="Public separator As String";
_separator = "";
RDebugUtils.currentLine=50200585;
 //BA.debugLineNum = 50200585;BA.debugLine="Type ListStyleObj(circle As String, square As Str";
;
RDebugUtils.currentLine=50200587;
 //BA.debugLineNum = 50200587;BA.debugLine="Public ListStyle As ListStyleObj";
_liststyle = new b4j.example.pdflist._liststyleobj();
RDebugUtils.currentLine=50200588;
 //BA.debugLineNum = 50200588;BA.debugLine="Public Style As String";
_style = "";
RDebugUtils.currentLine=50200589;
 //BA.debugLineNum = 50200589;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
RDebugUtils.currentLine=50200590;
 //BA.debugLineNum = 50200590;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=50200591;
 //BA.debugLineNum = 50200591;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdflist  _initialize(b4j.example.pdflist __ref,anywheresoftware.b4a.BA _ba,String _listtype) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "initialize", new Object[] {_ba,_listtype}));}
RDebugUtils.currentLine=50266112;
 //BA.debugLineNum = 50266112;BA.debugLine="Public Sub Initialize(listType As String) As PDFLi";
RDebugUtils.currentLine=50266113;
 //BA.debugLineNum = 50266113;BA.debugLine="items.Initialize";
__ref._items /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=50266114;
 //BA.debugLineNum = 50266114;BA.debugLine="listX.Initialize";
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=50266115;
 //BA.debugLineNum = 50266115;BA.debugLine="lType = listType";
__ref._ltype /*String*/  = _listtype;
RDebugUtils.currentLine=50266116;
 //BA.debugLineNum = 50266116;BA.debugLine="reversed = Null";
__ref._reversed /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=50266117;
 //BA.debugLineNum = 50266117;BA.debugLine="start = Null";
__ref._start /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=50266118;
 //BA.debugLineNum = 50266118;BA.debugLine="color = Null";
__ref._color /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=50266119;
 //BA.debugLineNum = 50266119;BA.debugLine="markerColor = Null";
__ref._markercolor /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=50266120;
 //BA.debugLineNum = 50266120;BA.debugLine="separator = Null";
__ref._separator /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=50266121;
 //BA.debugLineNum = 50266121;BA.debugLine="ListStyle.Initialize";
__ref._liststyle /*b4j.example.pdflist._liststyleobj*/ .Initialize();
RDebugUtils.currentLine=50266122;
 //BA.debugLineNum = 50266122;BA.debugLine="ListStyle.square = \"square\"";
__ref._liststyle /*b4j.example.pdflist._liststyleobj*/ .square /*String*/  = "square";
RDebugUtils.currentLine=50266123;
 //BA.debugLineNum = 50266123;BA.debugLine="ListStyle.circle = \"circle\"";
__ref._liststyle /*b4j.example.pdflist._liststyleobj*/ .circle /*String*/  = "circle";
RDebugUtils.currentLine=50266124;
 //BA.debugLineNum = 50266124;BA.debugLine="ListStyle.lowerAlpha = \"lower-alpha\"";
__ref._liststyle /*b4j.example.pdflist._liststyleobj*/ .lowerAlpha /*String*/  = "lower-alpha";
RDebugUtils.currentLine=50266125;
 //BA.debugLineNum = 50266125;BA.debugLine="ListStyle.upperAlpha = \"upper-alpha\"";
__ref._liststyle /*b4j.example.pdflist._liststyleobj*/ .upperAlpha /*String*/  = "upper-alpha";
RDebugUtils.currentLine=50266126;
 //BA.debugLineNum = 50266126;BA.debugLine="ListStyle.upperRoman = \"upper-roman\"";
__ref._liststyle /*b4j.example.pdflist._liststyleobj*/ .upperRoman /*String*/  = "upper-roman";
RDebugUtils.currentLine=50266127;
 //BA.debugLineNum = 50266127;BA.debugLine="ListStyle.lowerRoman = \"lower-roman\"";
__ref._liststyle /*b4j.example.pdflist._liststyleobj*/ .lowerRoman /*String*/  = "lower-roman";
RDebugUtils.currentLine=50266128;
 //BA.debugLineNum = 50266128;BA.debugLine="ListStyle.none = \"none\"";
__ref._liststyle /*b4j.example.pdflist._liststyleobj*/ .none /*String*/  = "none";
RDebugUtils.currentLine=50266129;
 //BA.debugLineNum = 50266129;BA.debugLine="pageOrientation = Null";
__ref._pageorientation /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=50266130;
 //BA.debugLineNum = 50266130;BA.debugLine="Style = Null";
__ref._style /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=50266131;
 //BA.debugLineNum = 50266131;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
RDebugUtils.currentLine=50266132;
 //BA.debugLineNum = 50266132;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setabsoluteposition(b4j.example.pdflist __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "setabsoluteposition", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "setabsoluteposition", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=50855936;
 //BA.debugLineNum = 50855936;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
RDebugUtils.currentLine=50855937;
 //BA.debugLineNum = 50855937;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=50855938;
 //BA.debugLineNum = 50855938;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=50855939;
 //BA.debugLineNum = 50855939;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=50855940;
 //BA.debugLineNum = 50855940;BA.debugLine="listX.Put(\"absolutePosition\", opt)";
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
RDebugUtils.currentLine=50855941;
 //BA.debugLineNum = 50855941;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
RDebugUtils.currentLine=50855942;
 //BA.debugLineNum = 50855942;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setmargin(b4j.example.pdflist __ref,int _l,int _t,int _r,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "setmargin", new Object[] {_l,_t,_r,_b}));}
anywheresoftware.b4a.objects.collections.List _margin = null;
RDebugUtils.currentLine=50921472;
 //BA.debugLineNum = 50921472;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
RDebugUtils.currentLine=50921473;
 //BA.debugLineNum = 50921473;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_l = (int) (0);};
RDebugUtils.currentLine=50921474;
 //BA.debugLineNum = 50921474;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_t = (int) (0);};
RDebugUtils.currentLine=50921475;
 //BA.debugLineNum = 50921475;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_r = (int) (0);};
RDebugUtils.currentLine=50921476;
 //BA.debugLineNum = 50921476;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==(double)(BA.ObjectToNumber(__ref._banano /*com.ab.banano.BANano*/ .UNDEFINED()))) { 
_b = (int) (0);};
RDebugUtils.currentLine=50921477;
 //BA.debugLineNum = 50921477;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=50921478;
 //BA.debugLineNum = 50921478;BA.debugLine="margin.Initialize";
_margin.Initialize();
RDebugUtils.currentLine=50921479;
 //BA.debugLineNum = 50921479;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
RDebugUtils.currentLine=50921480;
 //BA.debugLineNum = 50921480;BA.debugLine="listX.Put(\"margin\", margin)";
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("margin"),(Object)(_margin.getObject()));
RDebugUtils.currentLine=50921481;
 //BA.debugLineNum = 50921481;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
RDebugUtils.currentLine=50921482;
 //BA.debugLineNum = 50921482;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setpagebreakafter(b4j.example.pdflist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "setpagebreakafter", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "setpagebreakafter", null));}
RDebugUtils.currentLine=50659328;
 //BA.debugLineNum = 50659328;BA.debugLine="Sub SetPageBreakAfter As PDFList";
RDebugUtils.currentLine=50659329;
 //BA.debugLineNum = 50659329;BA.debugLine="listX.Put(\"pageBreak\", \"after\")";
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));
RDebugUtils.currentLine=50659330;
 //BA.debugLineNum = 50659330;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
RDebugUtils.currentLine=50659331;
 //BA.debugLineNum = 50659331;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setpagebreakbefore(b4j.example.pdflist __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "setpagebreakbefore", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "setpagebreakbefore", null));}
RDebugUtils.currentLine=50593792;
 //BA.debugLineNum = 50593792;BA.debugLine="Sub SetPageBreakBefore As PDFList";
RDebugUtils.currentLine=50593793;
 //BA.debugLineNum = 50593793;BA.debugLine="listX.Put(\"pageBreak\", \"before\")";
__ref._listx /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));
RDebugUtils.currentLine=50593794;
 //BA.debugLineNum = 50593794;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
RDebugUtils.currentLine=50593795;
 //BA.debugLineNum = 50593795;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setpageorientation(b4j.example.pdflist __ref,String _spageorientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "setpageorientation", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "setpageorientation", new Object[] {_spageorientation}));}
RDebugUtils.currentLine=50790400;
 //BA.debugLineNum = 50790400;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
RDebugUtils.currentLine=50790401;
 //BA.debugLineNum = 50790401;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdflist)(this);};
RDebugUtils.currentLine=50790402;
 //BA.debugLineNum = 50790402;BA.debugLine="pageOrientation = spageOrientation";
__ref._pageorientation /*String*/  = _spageorientation;
RDebugUtils.currentLine=50790403;
 //BA.debugLineNum = 50790403;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
RDebugUtils.currentLine=50790404;
 //BA.debugLineNum = 50790404;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _settype(b4j.example.pdflist __ref,String _typeoflist) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdflist";
if (Debug.shouldDelegate(ba, "settype", true))
	 {return ((b4j.example.pdflist) Debug.delegate(ba, "settype", new Object[] {_typeoflist}));}
RDebugUtils.currentLine=50331648;
 //BA.debugLineNum = 50331648;BA.debugLine="Sub SetType(typeOfList As String) As PDFList";
RDebugUtils.currentLine=50331649;
 //BA.debugLineNum = 50331649;BA.debugLine="If typeOfList = \"\" Then Return Me";
if ((_typeoflist).equals("")) { 
if (true) return (b4j.example.pdflist)(this);};
RDebugUtils.currentLine=50331650;
 //BA.debugLineNum = 50331650;BA.debugLine="Style = typeOfList";
__ref._style /*String*/  = _typeoflist;
RDebugUtils.currentLine=50331651;
 //BA.debugLineNum = 50331651;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
RDebugUtils.currentLine=50331652;
 //BA.debugLineNum = 50331652;BA.debugLine="End Sub";
return null;
}
}