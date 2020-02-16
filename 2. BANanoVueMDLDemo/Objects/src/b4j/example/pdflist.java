package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdflist extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdflist", this);
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
public String  _additems(anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
Object _item = null;
 //BA.debugLineNum = 60;BA.debugLine="Sub AddItems(lst As List)";
 //BA.debugLineNum = 61;BA.debugLine="For Each item As Object In lst";
{
final anywheresoftware.b4a.BA.IterableList group1 = _lst;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = group1.Get(index1);
 //BA.debugLineNum = 62;BA.debugLine="items.Add(item)";
_items.Add(_item);
 }
};
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdflist  _addstring(String _str) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub AddString(str As String) As PDFList";
 //BA.debugLineNum = 55;BA.debugLine="items.Add(str)";
_items.Add((Object)(_str));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _addtext(b4j.example.pdftext _txt) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub AddText(txt As PDFText) As PDFList";
 //BA.debugLineNum = 50;BA.debugLine="items.Add(txt.Content)";
_items.Add((Object)(_txt._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ ().getObject()));
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private items As List";
_items = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 4;BA.debugLine="Private listX As Map";
_listx = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 5;BA.debugLine="Private lType As String";
_ltype = "";
 //BA.debugLineNum = 6;BA.debugLine="Public reversed As Boolean";
_reversed = false;
 //BA.debugLineNum = 7;BA.debugLine="Public start As Int";
_start = 0;
 //BA.debugLineNum = 8;BA.debugLine="Public color As String";
_color = "";
 //BA.debugLineNum = 9;BA.debugLine="Public markerColor As String";
_markercolor = "";
 //BA.debugLineNum = 10;BA.debugLine="Public separator As String";
_separator = "";
 //BA.debugLineNum = 11;BA.debugLine="Type ListStyleObj(circle As String, square As Str";
;
 //BA.debugLineNum = 13;BA.debugLine="Public ListStyle As ListStyleObj";
_liststyle = new b4j.example.pdflist._liststyleobj();
 //BA.debugLineNum = 14;BA.debugLine="Public Style As String";
_style = "";
 //BA.debugLineNum = 15;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
 //BA.debugLineNum = 16;BA.debugLine="Public BANano As BANano";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 81;BA.debugLine="If reversed <> Null Then listX.Put(\"reversed\", re";
if (_reversed!=BA.ObjectToBoolean(__c.Null)) { 
_listx.Put((Object)("reversed"),(Object)(_reversed));};
 //BA.debugLineNum = 82;BA.debugLine="If start <> Null Then listX.Put(\"start\", start)";
if (_start!=(double)(BA.ObjectToNumber(__c.Null))) { 
_listx.Put((Object)("start"),(Object)(_start));};
 //BA.debugLineNum = 83;BA.debugLine="If Style <> Null Then listX.Put(\"type\", Style)";
if (_style!= null) { 
_listx.Put((Object)("type"),(Object)(_style));};
 //BA.debugLineNum = 84;BA.debugLine="If color <> Null Then listX.Put(\"color\", color)";
if (_color!= null) { 
_listx.Put((Object)("color"),(Object)(_color));};
 //BA.debugLineNum = 85;BA.debugLine="If markerColor <> Null Then listX.Put(\"markerColo";
if (_markercolor!= null) { 
_listx.Put((Object)("markerColor"),(Object)(_markercolor));};
 //BA.debugLineNum = 86;BA.debugLine="If separator <> Null Then listX.Put(\"separator\",";
if (_separator!= null) { 
_listx.Put((Object)("separator"),(Object)(_separator));};
 //BA.debugLineNum = 87;BA.debugLine="listX.Put(lType, items)";
_listx.Put((Object)(_ltype),(Object)(_items.getObject()));
 //BA.debugLineNum = 88;BA.debugLine="Return listX";
if (true) return _listx;
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _initialize(anywheresoftware.b4a.BA _ba,String _listtype) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(listType As String) As PDFLi";
 //BA.debugLineNum = 21;BA.debugLine="items.Initialize";
_items.Initialize();
 //BA.debugLineNum = 22;BA.debugLine="listX.Initialize";
_listx.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="lType = listType";
_ltype = _listtype;
 //BA.debugLineNum = 24;BA.debugLine="reversed = Null";
_reversed = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 25;BA.debugLine="start = Null";
_start = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 26;BA.debugLine="color = Null";
_color = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 27;BA.debugLine="markerColor = Null";
_markercolor = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 28;BA.debugLine="separator = Null";
_separator = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 29;BA.debugLine="ListStyle.Initialize";
_liststyle.Initialize();
 //BA.debugLineNum = 30;BA.debugLine="ListStyle.square = \"square\"";
_liststyle.square /*String*/  = "square";
 //BA.debugLineNum = 31;BA.debugLine="ListStyle.circle = \"circle\"";
_liststyle.circle /*String*/  = "circle";
 //BA.debugLineNum = 32;BA.debugLine="ListStyle.lowerAlpha = \"lower-alpha\"";
_liststyle.lowerAlpha /*String*/  = "lower-alpha";
 //BA.debugLineNum = 33;BA.debugLine="ListStyle.upperAlpha = \"upper-alpha\"";
_liststyle.upperAlpha /*String*/  = "upper-alpha";
 //BA.debugLineNum = 34;BA.debugLine="ListStyle.upperRoman = \"upper-roman\"";
_liststyle.upperRoman /*String*/  = "upper-roman";
 //BA.debugLineNum = 35;BA.debugLine="ListStyle.lowerRoman = \"lower-roman\"";
_liststyle.lowerRoman /*String*/  = "lower-roman";
 //BA.debugLineNum = 36;BA.debugLine="ListStyle.none = \"none\"";
_liststyle.none /*String*/  = "none";
 //BA.debugLineNum = 37;BA.debugLine="pageOrientation = Null";
_pageorientation = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 38;BA.debugLine="Style = Null";
_style = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 39;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 40;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 100;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 101;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 102;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 103;BA.debugLine="listX.Put(\"absolutePosition\", opt)";
_listx.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setmargin(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 109;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
 //BA.debugLineNum = 110;BA.debugLine="If l = BANano.UNDEFINED Then l = 0";
if (_l==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_l = (int) (0);};
 //BA.debugLineNum = 111;BA.debugLine="If t = BANano.UNDEFINED Then t = 0";
if (_t==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_t = (int) (0);};
 //BA.debugLineNum = 112;BA.debugLine="If r = BANano.UNDEFINED Then r = 0";
if (_r==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_r = (int) (0);};
 //BA.debugLineNum = 113;BA.debugLine="If b = BANano.UNDEFINED Then b = 0";
if (_b==(double)(BA.ObjectToNumber(_banano.UNDEFINED()))) { 
_b = (int) (0);};
 //BA.debugLineNum = 114;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 115;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 116;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 117;BA.debugLine="listX.Put(\"margin\", margin)";
_listx.Put((Object)("margin"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setpagebreakafter() throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetPageBreakAfter As PDFList";
 //BA.debugLineNum = 75;BA.debugLine="listX.Put(\"pageBreak\", \"after\")";
_listx.Put((Object)("pageBreak"),(Object)("after"));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setpagebreakbefore() throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetPageBreakBefore As PDFList";
 //BA.debugLineNum = 69;BA.debugLine="listX.Put(\"pageBreak\", \"before\")";
_listx.Put((Object)("pageBreak"),(Object)("before"));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _setpageorientation(String _spageorientation) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
 //BA.debugLineNum = 93;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdflist)(this);};
 //BA.debugLineNum = 94;BA.debugLine="pageOrientation = spageOrientation";
_pageorientation = _spageorientation;
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdflist  _settype(String _typeoflist) throws Exception{
 //BA.debugLineNum = 42;BA.debugLine="Sub SetType(typeOfList As String) As PDFList";
 //BA.debugLineNum = 43;BA.debugLine="If typeOfList = \"\" Then Return Me";
if ((_typeoflist).equals("")) { 
if (true) return (b4j.example.pdflist)(this);};
 //BA.debugLineNum = 44;BA.debugLine="Style = typeOfList";
_style = _typeoflist;
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.pdflist)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
