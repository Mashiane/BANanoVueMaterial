package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdftext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.pdftext", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdftext.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public anywheresoftware.b4a.objects.collections.Map _contentint = null;
public anywheresoftware.b4a.keywords.StringBuilderWrapper _textint = null;
public String _link = "";
public int _linktopage = 0;
public boolean _tocitem = false;
public String _pageorientation = "";
public boolean _pagebreakbefore = false;
public boolean _pagebreakafter = false;
public b4j.example.pdfstyle _style = null;
public int _colspan = 0;
public int _rowspan = 0;
public String _linktodestination = "";
public String _id = "";
public String _listtype = "";
public String _pagereference = "";
public String _textreference = "";
public boolean _preserveleadingspaces = false;
public com.ab.banano.BANano _banano = null;
public String _tabindex = "";
public String _decoration = "";
public String _decorationstyle = "";
public String _decorationcolor = "";
public int _counter = 0;
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
public b4j.example.pdftext  _append(String _txt) throws Exception{
 //BA.debugLineNum = 277;BA.debugLine="Sub Append(txt As String) As PDFText";
 //BA.debugLineNum = 278;BA.debugLine="textInt.Append(txt)";
_textint.Append(_txt);
 //BA.debugLineNum = 279;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 280;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _appendline(String _txt) throws Exception{
 //BA.debugLineNum = 283;BA.debugLine="Sub AppendLine(txt As String) As PDFText";
 //BA.debugLineNum = 284;BA.debugLine="textInt.Append(txt)";
_textint.Append(_txt);
 //BA.debugLineNum = 285;BA.debugLine="textInt.Append(CRLF)";
_textint.Append(__c.CRLF);
 //BA.debugLineNum = 286;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 287;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private contentInt As Map";
_contentint = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 4;BA.debugLine="Private textInt As StringBuilder";
_textint = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
 //BA.debugLineNum = 5;BA.debugLine="Public link As String";
_link = "";
 //BA.debugLineNum = 6;BA.debugLine="Public linkToPage As Int";
_linktopage = 0;
 //BA.debugLineNum = 7;BA.debugLine="Public tocItem As Boolean";
_tocitem = false;
 //BA.debugLineNum = 8;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
 //BA.debugLineNum = 9;BA.debugLine="Public pageBreakBefore As Boolean";
_pagebreakbefore = false;
 //BA.debugLineNum = 10;BA.debugLine="Public pageBreakAfter As Boolean";
_pagebreakafter = false;
 //BA.debugLineNum = 11;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
 //BA.debugLineNum = 12;BA.debugLine="Public colSpan As Int";
_colspan = 0;
 //BA.debugLineNum = 13;BA.debugLine="Public rowSpan As Int";
_rowspan = 0;
 //BA.debugLineNum = 14;BA.debugLine="Public linkToDestination As String";
_linktodestination = "";
 //BA.debugLineNum = 15;BA.debugLine="Public id As String";
_id = "";
 //BA.debugLineNum = 16;BA.debugLine="Public listType As String";
_listtype = "";
 //BA.debugLineNum = 17;BA.debugLine="Public pageReference As String";
_pagereference = "";
 //BA.debugLineNum = 18;BA.debugLine="Public textReference As String";
_textreference = "";
 //BA.debugLineNum = 19;BA.debugLine="Public preserveLeadingSpaces As Boolean";
_preserveleadingspaces = false;
 //BA.debugLineNum = 20;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 21;BA.debugLine="Public tabindex As String";
_tabindex = "";
 //BA.debugLineNum = 22;BA.debugLine="Public decoration As String";
_decoration = "";
 //BA.debugLineNum = 23;BA.debugLine="Public decorationStyle As String";
_decorationstyle = "";
 //BA.debugLineNum = 24;BA.debugLine="Public decorationColor As String";
_decorationcolor = "";
 //BA.debugLineNum = 25;BA.debugLine="Public counter As Int";
_counter = 0;
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent() throws Exception{
String _outcome = "";
 //BA.debugLineNum = 302;BA.debugLine="Sub getContent As Map";
 //BA.debugLineNum = 303;BA.debugLine="Dim outcome As String = textInt.tostring";
_outcome = _textint.ToString();
 //BA.debugLineNum = 304;BA.debugLine="contentInt.Put(\"text\", outcome)";
_contentint.Put((Object)("text"),(Object)(_outcome));
 //BA.debugLineNum = 305;BA.debugLine="If counter <> Null Then contentInt.Put(\"counter\",";
if (_counter!=(double)(BA.ObjectToNumber(__c.Null))) { 
_contentint.Put((Object)("counter"),(Object)(_counter));};
 //BA.debugLineNum = 306;BA.debugLine="If linkToPage <> Null Then contentInt.Put(\"linkTo";
if (_linktopage!=(double)(BA.ObjectToNumber(__c.Null))) { 
_contentint.Put((Object)("linkToPage"),(Object)(_linktopage));};
 //BA.debugLineNum = 307;BA.debugLine="If link <> Null Then contentInt.Put(\"link\", link)";
if (_link!= null) { 
_contentint.Put((Object)("link"),(Object)(_link));};
 //BA.debugLineNum = 308;BA.debugLine="If tocItem <> Null Then contentInt.Put(\"tocItem\",";
if (_tocitem!=BA.ObjectToBoolean(__c.Null)) { 
_contentint.Put((Object)("tocItem"),(Object)(_tocitem));};
 //BA.debugLineNum = 309;BA.debugLine="If pageOrientation <> Null Then contentInt.Put(\"p";
if (_pageorientation!= null) { 
_contentint.Put((Object)("pageOrientation"),(Object)(_pageorientation));};
 //BA.debugLineNum = 310;BA.debugLine="If pageBreakBefore Then contentInt.Put(\"pageBreak";
if (_pagebreakbefore) { 
_contentint.Put((Object)("pageBreak"),(Object)("before"));};
 //BA.debugLineNum = 311;BA.debugLine="If pageBreakAfter Then contentInt.Put(\"pageBreak\"";
if (_pagebreakafter) { 
_contentint.Put((Object)("pageBreak"),(Object)("after"));};
 //BA.debugLineNum = 312;BA.debugLine="If colSpan <> Null Then contentInt.Put(\"colSpan\",";
if (_colspan!=(double)(BA.ObjectToNumber(__c.Null))) { 
_contentint.Put((Object)("colSpan"),(Object)(_colspan));};
 //BA.debugLineNum = 313;BA.debugLine="If rowSpan <> Null Then contentInt.Put(\"rowSpan\",";
if (_rowspan!=(double)(BA.ObjectToNumber(__c.Null))) { 
_contentint.Put((Object)("rowSpan"),(Object)(_rowspan));};
 //BA.debugLineNum = 314;BA.debugLine="If linkToDestination <> Null Then contentInt.Put(";
if (_linktodestination!= null) { 
_contentint.Put((Object)("linkToDestination"),(Object)(_linktodestination));};
 //BA.debugLineNum = 315;BA.debugLine="If id <> Null Then contentInt.Put(\"id\", id)";
if (_id!= null) { 
_contentint.Put((Object)("id"),(Object)(_id));};
 //BA.debugLineNum = 316;BA.debugLine="If listType <> Null Then contentInt.Put(\"listType";
if (_listtype!= null) { 
_contentint.Put((Object)("listType"),(Object)(_listtype));};
 //BA.debugLineNum = 317;BA.debugLine="If pageReference <> Null Then contentInt.Put(\"pag";
if (_pagereference!= null) { 
_contentint.Put((Object)("pageReference"),(Object)(_pagereference));};
 //BA.debugLineNum = 318;BA.debugLine="If textReference <> Null Then contentInt.Put(\"tex";
if (_textreference!= null) { 
_contentint.Put((Object)("textReference"),(Object)(_textreference));};
 //BA.debugLineNum = 319;BA.debugLine="If preserveLeadingSpaces <> Null Then contentInt.";
if (_preserveleadingspaces!=BA.ObjectToBoolean(__c.Null)) { 
_contentint.Put((Object)("preserveLeadingSpaces"),(Object)(_preserveleadingspaces));};
 //BA.debugLineNum = 320;BA.debugLine="If decoration <> Null Then contentInt.Put(\"decora";
if (_decoration!= null) { 
_contentint.Put((Object)("decoration"),(Object)(_decoration));};
 //BA.debugLineNum = 321;BA.debugLine="If decorationStyle <> Null Then contentInt.Put(\"d";
if (_decorationstyle!= null) { 
_contentint.Put((Object)("decorationStyle"),(Object)(_decorationstyle));};
 //BA.debugLineNum = 322;BA.debugLine="If decorationColor <> Null Then contentInt.Put(\"d";
if (_decorationcolor!= null) { 
_contentint.Put((Object)("decorationColor"),(Object)(_decorationcolor));};
 //BA.debugLineNum = 323;BA.debugLine="style.Include(contentInt)";
_style._include /*String*/ (_contentint);
 //BA.debugLineNum = 324;BA.debugLine="Return contentInt";
if (true) return _contentint;
 //BA.debugLineNum = 325;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _initialize(anywheresoftware.b4a.BA _ba) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 83;BA.debugLine="Public Sub Initialize As PDFText";
 //BA.debugLineNum = 84;BA.debugLine="contentInt.Initialize";
_contentint.Initialize();
 //BA.debugLineNum = 85;BA.debugLine="textInt.Initialize";
_textint.Initialize();
 //BA.debugLineNum = 86;BA.debugLine="style.Initialize";
_style._initialize /*b4j.example.pdfstyle*/ (ba);
 //BA.debugLineNum = 87;BA.debugLine="counter = Null";
_counter = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 88;BA.debugLine="link = Null";
_link = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 89;BA.debugLine="listType = Null";
_listtype = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 90;BA.debugLine="linkToPage = Null";
_linktopage = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 91;BA.debugLine="tocItem = Null";
_tocitem = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 92;BA.debugLine="pageBreakBefore = Null";
_pagebreakbefore = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 93;BA.debugLine="pageBreakAfter = Null";
_pagebreakafter = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 94;BA.debugLine="pageOrientation = Null";
_pageorientation = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 95;BA.debugLine="colSpan = Null";
_colspan = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 96;BA.debugLine="rowSpan = Null";
_rowspan = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 97;BA.debugLine="linkToDestination = Null";
_linktodestination = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 98;BA.debugLine="listType = Null";
_listtype = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 99;BA.debugLine="id = Null";
_id = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 100;BA.debugLine="pageReference = Null";
_pagereference = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 101;BA.debugLine="textReference = Null";
_textreference = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 102;BA.debugLine="preserveLeadingSpaces = Null";
_preserveleadingspaces = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 103;BA.debugLine="tabindex = Null";
_tabindex = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 104;BA.debugLine="decoration = Null";
_decoration = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 105;BA.debugLine="decorationStyle = Null";
_decorationstyle = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 106;BA.debugLine="decorationColor = Null";
_decorationcolor = BA.ObjectToString(__c.Null);
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _noborder() throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub NoBorder As PDFText";
 //BA.debugLineNum = 186;BA.debugLine="style.noborder";
_style._noborder /*b4j.example.pdfstyle*/ ();
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setabsoluteposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 161;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 162;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 163;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 164;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 165;BA.debugLine="contentInt.Put(\"absolutePosition\", opt)";
_contentint.Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setalignmentcenter() throws Exception{
 //BA.debugLineNum = 206;BA.debugLine="Sub SetAlignmentCenter As PDFText";
 //BA.debugLineNum = 207;BA.debugLine="style.alignmentCenter = True";
_style._alignmentcenter /*boolean*/  = __c.True;
 //BA.debugLineNum = 208;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 209;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setalignmentjustify() throws Exception{
 //BA.debugLineNum = 218;BA.debugLine="Sub SetAlignmentJustify As PDFText";
 //BA.debugLineNum = 219;BA.debugLine="style.alignmentJustify = True";
_style._alignmentjustify /*boolean*/  = __c.True;
 //BA.debugLineNum = 220;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 221;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setalignmentright() throws Exception{
 //BA.debugLineNum = 212;BA.debugLine="Sub SetAlignmentRight As PDFText";
 //BA.debugLineNum = 213;BA.debugLine="style.alignmentRight = True";
_style._alignmentright /*boolean*/  = __c.True;
 //BA.debugLineNum = 214;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 215;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setangle(double _dangle) throws Exception{
 //BA.debugLineNum = 334;BA.debugLine="Sub SetAngle(dangle As Double) As PDFText";
 //BA.debugLineNum = 335;BA.debugLine="style.angle = dangle";
_style._angle /*double*/  = _dangle;
 //BA.debugLineNum = 336;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 337;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setbold(boolean _b) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="Sub SetBold(b As Boolean) As PDFText";
 //BA.debugLineNum = 257;BA.debugLine="style.bold = b";
_style._bold /*boolean*/  = _b;
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setborder(boolean _l,boolean _t,boolean _r,boolean _b) throws Exception{
 //BA.debugLineNum = 179;BA.debugLine="Sub SetBorder(l As Boolean, t As Boolean, r As Boo";
 //BA.debugLineNum = 180;BA.debugLine="style.SetBorder(l,t,r,b)";
_style._setborder /*b4j.example.pdfstyle*/ (_l,_t,_r,_b);
 //BA.debugLineNum = 181;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 182;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setbordercolor(String _l,String _t,String _r,String _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 170;BA.debugLine="Sub SetBorderColor(l As String, t As String, r As";
 //BA.debugLineNum = 171;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 172;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 173;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 174;BA.debugLine="contentInt.Put(\"borderColor\", margin)";
_contentint.Put((Object)("borderColor"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 175;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 176;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setcolor(String _colour) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetColor(colour As String) As PDFText";
 //BA.debugLineNum = 272;BA.debugLine="style.color = colour";
_style._color /*String*/  = _colour;
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setcolspan(int _cs) throws Exception{
 //BA.debugLineNum = 231;BA.debugLine="Sub SetColSpan(cs As Int) As PDFText";
 //BA.debugLineNum = 232;BA.debugLine="If cs = 0 Then Return Me";
if (_cs==0) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 233;BA.debugLine="colSpan = cs";
_colspan = _cs;
 //BA.debugLineNum = 234;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 235;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setdecoration(String _dec) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetDecoration(dec As String) As PDFText";
 //BA.debugLineNum = 113;BA.debugLine="If dec = \"\" Then Return Me";
if ((_dec).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 114;BA.debugLine="decoration = dec";
_decoration = _dec;
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setdecorationcolor(String _sdecorationcolor) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetDecorationColor(sdecorationColor As String)";
 //BA.debugLineNum = 127;BA.debugLine="If sdecorationColor = \"\" Then Return Me";
if ((_sdecorationcolor).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 128;BA.debugLine="decorationColor = sdecorationColor";
_decorationcolor = _sdecorationcolor;
 //BA.debugLineNum = 129;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setdecorationstyle(String _sdecorationstyle) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetDecorationStyle(sdecorationStyle As String)";
 //BA.debugLineNum = 121;BA.debugLine="If sdecorationStyle = \"\" Then Return Me";
if ((_sdecorationstyle).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 122;BA.debugLine="decorationStyle = sdecorationStyle";
_decorationstyle = _sdecorationstyle;
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setfillcolor(Object _fc) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetFillColor(fc As Object) As PDFText";
 //BA.debugLineNum = 201;BA.debugLine="style.fillColor = fc";
_style._fillcolor /*String*/  = BA.ObjectToString(_fc);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setfontsize(int _fs) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetFontSize(fs As Int) As PDFText";
 //BA.debugLineNum = 267;BA.debugLine="style.fontSize = fs";
_style._fontsize /*int*/  = _fs;
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setheight(String _sheight) throws Exception{
 //BA.debugLineNum = 251;BA.debugLine="Sub SetHeight(sHeight As String) As PDFText";
 //BA.debugLineNum = 252;BA.debugLine="style.height = sHeight";
_style._height /*String*/  = _sheight;
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setid(String _sid) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetID(sid As String) As PDFText";
 //BA.debugLineNum = 35;BA.debugLine="If sid = \"\" Then Return Me";
if ((_sid).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 36;BA.debugLine="id = sid";
_id = _sid;
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setitalics(boolean _b) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetItalics(b As Boolean) As PDFText";
 //BA.debugLineNum = 262;BA.debugLine="style.italics = b";
_style._italics /*boolean*/  = _b;
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setlink(String _slink) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetLink(slink As String) As PDFText";
 //BA.debugLineNum = 65;BA.debugLine="If slink = \"\" Then Return Me";
if ((_slink).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 66;BA.debugLine="link = slink";
_link = _slink;
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setlinktodestination(String _slinktodestination) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetLinkToDestination(slinkToDestination As Str";
 //BA.debugLineNum = 53;BA.debugLine="If slinkToDestination = \"\" Then Return Me";
if ((_slinktodestination).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 54;BA.debugLine="linkToDestination = slinkToDestination";
_linktodestination = _slinktodestination;
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setlinktopage(String _slinktopage) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetLinkToPage(slinkToPage As String) As PDFTex";
 //BA.debugLineNum = 59;BA.debugLine="If slinkToPage = \"\" Then Return Me";
if ((_slinktopage).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 60;BA.debugLine="linkToPage = slinkToPage";
_linktopage = (int)(Double.parseDouble(_slinktopage));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setlisttype(String _slisttype) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetListType(slisttype As String) As PDFText";
 //BA.debugLineNum = 71;BA.debugLine="If slisttype = \"\" Then Return Me";
if ((_slisttype).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 72;BA.debugLine="listType = slisttype";
_listtype = _slisttype;
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setmargin(int _l,int _t,int _r,int _b) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
 //BA.debugLineNum = 329;BA.debugLine="style.SetMargin(l,t,r,b)";
_style._setmargin /*b4j.example.pdfstyle*/ (_l,_t,_r,_b);
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setopacity(double _o) throws Exception{
 //BA.debugLineNum = 340;BA.debugLine="Sub SetOpacity(o As Double) As PDFText";
 //BA.debugLineNum = 341;BA.debugLine="style.opacity = o";
_style._opacity /*double*/  = _o;
 //BA.debugLineNum = 342;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 343;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setpagebreakafter() throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetPageBreakAfter As PDFText";
 //BA.debugLineNum = 297;BA.debugLine="contentInt.Put(\"pageBreak\", \"after\")";
_contentint.Put((Object)("pageBreak"),(Object)("after"));
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setpagebreakbefore() throws Exception{
 //BA.debugLineNum = 290;BA.debugLine="Sub SetPageBreakBefore As PDFText";
 //BA.debugLineNum = 291;BA.debugLine="contentInt.Put(\"pageBreak\", \"before\")";
_contentint.Put((Object)("pageBreak"),(Object)("before"));
 //BA.debugLineNum = 292;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 293;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setpageorientation(String _spageorientation) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
 //BA.debugLineNum = 77;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 78;BA.debugLine="pageOrientation = spageOrientation";
_pageorientation = _spageorientation;
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setpagereference(String _spagereference) throws Exception{
 //BA.debugLineNum = 46;BA.debugLine="Sub SetPageReference(spageReference As String) As";
 //BA.debugLineNum = 47;BA.debugLine="If spageReference = \"\" Then Return Me";
if ((_spagereference).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 48;BA.debugLine="pageReference = spageReference";
_pagereference = _spagereference;
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setrelativeposition(int _x,int _y) throws Exception{
anywheresoftware.b4a.objects.collections.Map _opt = null;
 //BA.debugLineNum = 191;BA.debugLine="Sub SetRelativePosition(x As Int, y As Int) As PDF";
 //BA.debugLineNum = 192;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
 //BA.debugLineNum = 193;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
 //BA.debugLineNum = 194;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
 //BA.debugLineNum = 195;BA.debugLine="contentInt.Put(\"relativePosition\", opt)";
_contentint.Put((Object)("relativePosition"),(Object)(_opt.getObject()));
 //BA.debugLineNum = 196;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 197;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setrowspan(int _rs) throws Exception{
 //BA.debugLineNum = 224;BA.debugLine="Sub SetRowSpan(rs As Int) As PDFText";
 //BA.debugLineNum = 225;BA.debugLine="If rs = 0 Then Return Me";
if (_rs==0) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 226;BA.debugLine="rowSpan = rs";
_rowspan = _rs;
 //BA.debugLineNum = 227;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 228;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setstyle(String _stylename) throws Exception{
 //BA.debugLineNum = 238;BA.debugLine="Sub SetStyle(styleName As String) As PDFText";
 //BA.debugLineNum = 239;BA.debugLine="If styleName = \"\" Then Return Me";
if ((_stylename).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 240;BA.debugLine="style.AddStyle(styleName)";
_style._addstyle /*b4j.example.pdfstyle*/ (_stylename);
 //BA.debugLineNum = 241;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 242;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settabindex(String _stabindex) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetTabIndex(stabindex As String) As PDFText";
 //BA.debugLineNum = 29;BA.debugLine="If stabindex = \"\" Then Return Me";
if ((_stabindex).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 30;BA.debugLine="tabindex = stabindex";
_tabindex = _stabindex;
 //BA.debugLineNum = 31;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 32;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settextreference(String _stextreference) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetTextReference(stextReference As String) As";
 //BA.debugLineNum = 41;BA.debugLine="If stextReference = \"\" Then Return Me";
if ((_stextreference).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 42;BA.debugLine="textReference = stextReference";
_textreference = _stextreference;
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settocitem(boolean _ti) throws Exception{
 //BA.debugLineNum = 154;BA.debugLine="Sub SetTocItem(ti As Boolean) As PDFText";
 //BA.debugLineNum = 155;BA.debugLine="If ti = False Then Return Me";
if (_ti==__c.False) { 
if (true) return (b4j.example.pdftext)(this);};
 //BA.debugLineNum = 156;BA.debugLine="tocItem = ti";
_tocitem = _ti;
 //BA.debugLineNum = 157;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 158;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settocmargin(int _l,int _t,int _r,int _b) throws Exception{
anywheresoftware.b4a.objects.collections.List _margin = null;
 //BA.debugLineNum = 145;BA.debugLine="Sub SetTocMargin(l As Int, t As Int, r As Int, b A";
 //BA.debugLineNum = 146;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 147;BA.debugLine="margin.Initialize";
_margin.Initialize();
 //BA.debugLineNum = 148;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
 //BA.debugLineNum = 149;BA.debugLine="contentInt.Put(\"tocMargin\", margin)";
_contentint.Put((Object)("tocMargin"),(Object)(_margin.getObject()));
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settocnumberstyle(b4j.example.pdfstyle _ts) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub SetTocNumberStyle(ts As PDFStyle) As PDFText";
 //BA.debugLineNum = 134;BA.debugLine="contentInt.Put(\"tocNumberStyle\", ts)";
_contentint.Put((Object)("tocNumberStyle"),(Object)(_ts));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settocstyle(b4j.example.pdfstyle _ts) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetTocStyle(ts As PDFStyle) As PDFText";
 //BA.debugLineNum = 140;BA.debugLine="contentInt.Put(\"tocStyle\", ts)";
_contentint.Put((Object)("tocStyle"),(Object)(_ts));
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setwidth(String _swidth) throws Exception{
 //BA.debugLineNum = 245;BA.debugLine="Sub SetWidth(sWidth As String) As PDFText";
 //BA.debugLineNum = 246;BA.debugLine="style.width = sWidth";
_style._width /*String*/  = _swidth;
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
