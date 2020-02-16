package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdftext extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdftext", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
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
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdftext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
String _outcome = "";
RDebugUtils.currentLine=62652416;
 //BA.debugLineNum = 62652416;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=62652417;
 //BA.debugLineNum = 62652417;BA.debugLine="Dim outcome As String = textInt.tostring";
_outcome = __ref._textint /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .ToString();
RDebugUtils.currentLine=62652418;
 //BA.debugLineNum = 62652418;BA.debugLine="contentInt.Put(\"text\", outcome)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("text"),(Object)(_outcome));
RDebugUtils.currentLine=62652419;
 //BA.debugLineNum = 62652419;BA.debugLine="If counter <> Null Then contentInt.Put(\"counter\",";
if (__ref._counter /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("counter"),(Object)(__ref._counter /*int*/ ));};
RDebugUtils.currentLine=62652420;
 //BA.debugLineNum = 62652420;BA.debugLine="If linkToPage <> Null Then contentInt.Put(\"linkTo";
if (__ref._linktopage /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("linkToPage"),(Object)(__ref._linktopage /*int*/ ));};
RDebugUtils.currentLine=62652421;
 //BA.debugLineNum = 62652421;BA.debugLine="If link <> Null Then contentInt.Put(\"link\", link)";
if (__ref._link /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("link"),(Object)(__ref._link /*String*/ ));};
RDebugUtils.currentLine=62652422;
 //BA.debugLineNum = 62652422;BA.debugLine="If tocItem <> Null Then contentInt.Put(\"tocItem\",";
if (__ref._tocitem /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tocItem"),(Object)(__ref._tocitem /*boolean*/ ));};
RDebugUtils.currentLine=62652423;
 //BA.debugLineNum = 62652423;BA.debugLine="If pageOrientation <> Null Then contentInt.Put(\"p";
if (__ref._pageorientation /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageOrientation"),(Object)(__ref._pageorientation /*String*/ ));};
RDebugUtils.currentLine=62652424;
 //BA.debugLineNum = 62652424;BA.debugLine="If pageBreakBefore Then contentInt.Put(\"pageBreak";
if (__ref._pagebreakbefore /*boolean*/ ) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));};
RDebugUtils.currentLine=62652425;
 //BA.debugLineNum = 62652425;BA.debugLine="If pageBreakAfter Then contentInt.Put(\"pageBreak\"";
if (__ref._pagebreakafter /*boolean*/ ) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));};
RDebugUtils.currentLine=62652426;
 //BA.debugLineNum = 62652426;BA.debugLine="If colSpan <> Null Then contentInt.Put(\"colSpan\",";
if (__ref._colspan /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("colSpan"),(Object)(__ref._colspan /*int*/ ));};
RDebugUtils.currentLine=62652427;
 //BA.debugLineNum = 62652427;BA.debugLine="If rowSpan <> Null Then contentInt.Put(\"rowSpan\",";
if (__ref._rowspan /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("rowSpan"),(Object)(__ref._rowspan /*int*/ ));};
RDebugUtils.currentLine=62652428;
 //BA.debugLineNum = 62652428;BA.debugLine="If linkToDestination <> Null Then contentInt.Put(";
if (__ref._linktodestination /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("linkToDestination"),(Object)(__ref._linktodestination /*String*/ ));};
RDebugUtils.currentLine=62652429;
 //BA.debugLineNum = 62652429;BA.debugLine="If id <> Null Then contentInt.Put(\"id\", id)";
if (__ref._id /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("id"),(Object)(__ref._id /*String*/ ));};
RDebugUtils.currentLine=62652430;
 //BA.debugLineNum = 62652430;BA.debugLine="If listType <> Null Then contentInt.Put(\"listType";
if (__ref._listtype /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("listType"),(Object)(__ref._listtype /*String*/ ));};
RDebugUtils.currentLine=62652431;
 //BA.debugLineNum = 62652431;BA.debugLine="If pageReference <> Null Then contentInt.Put(\"pag";
if (__ref._pagereference /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageReference"),(Object)(__ref._pagereference /*String*/ ));};
RDebugUtils.currentLine=62652432;
 //BA.debugLineNum = 62652432;BA.debugLine="If textReference <> Null Then contentInt.Put(\"tex";
if (__ref._textreference /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("textReference"),(Object)(__ref._textreference /*String*/ ));};
RDebugUtils.currentLine=62652433;
 //BA.debugLineNum = 62652433;BA.debugLine="If preserveLeadingSpaces <> Null Then contentInt.";
if (__ref._preserveleadingspaces /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("preserveLeadingSpaces"),(Object)(__ref._preserveleadingspaces /*boolean*/ ));};
RDebugUtils.currentLine=62652434;
 //BA.debugLineNum = 62652434;BA.debugLine="If decoration <> Null Then contentInt.Put(\"decora";
if (__ref._decoration /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("decoration"),(Object)(__ref._decoration /*String*/ ));};
RDebugUtils.currentLine=62652435;
 //BA.debugLineNum = 62652435;BA.debugLine="If decorationStyle <> Null Then contentInt.Put(\"d";
if (__ref._decorationstyle /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("decorationStyle"),(Object)(__ref._decorationstyle /*String*/ ));};
RDebugUtils.currentLine=62652436;
 //BA.debugLineNum = 62652436;BA.debugLine="If decorationColor <> Null Then contentInt.Put(\"d";
if (__ref._decorationcolor /*String*/ != null) { 
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("decorationColor"),(Object)(__ref._decorationcolor /*String*/ ));};
RDebugUtils.currentLine=62652437;
 //BA.debugLineNum = 62652437;BA.debugLine="style.Include(contentInt)";
__ref._style /*b4j.example.pdfstyle*/ ._include /*String*/ (null,__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=62652438;
 //BA.debugLineNum = 62652438;BA.debugLine="Return contentInt";
if (true) return __ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=62652439;
 //BA.debugLineNum = 62652439;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _initialize(b4j.example.pdftext __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=60686336;
 //BA.debugLineNum = 60686336;BA.debugLine="Public Sub Initialize As PDFText";
RDebugUtils.currentLine=60686337;
 //BA.debugLineNum = 60686337;BA.debugLine="contentInt.Initialize";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=60686338;
 //BA.debugLineNum = 60686338;BA.debugLine="textInt.Initialize";
__ref._textint /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Initialize();
RDebugUtils.currentLine=60686339;
 //BA.debugLineNum = 60686339;BA.debugLine="style.Initialize";
__ref._style /*b4j.example.pdfstyle*/ ._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=60686340;
 //BA.debugLineNum = 60686340;BA.debugLine="counter = Null";
__ref._counter /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=60686341;
 //BA.debugLineNum = 60686341;BA.debugLine="link = Null";
__ref._link /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686342;
 //BA.debugLineNum = 60686342;BA.debugLine="listType = Null";
__ref._listtype /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686343;
 //BA.debugLineNum = 60686343;BA.debugLine="linkToPage = Null";
__ref._linktopage /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=60686344;
 //BA.debugLineNum = 60686344;BA.debugLine="tocItem = Null";
__ref._tocitem /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=60686345;
 //BA.debugLineNum = 60686345;BA.debugLine="pageBreakBefore = Null";
__ref._pagebreakbefore /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=60686346;
 //BA.debugLineNum = 60686346;BA.debugLine="pageBreakAfter = Null";
__ref._pagebreakafter /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=60686347;
 //BA.debugLineNum = 60686347;BA.debugLine="pageOrientation = Null";
__ref._pageorientation /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686348;
 //BA.debugLineNum = 60686348;BA.debugLine="colSpan = Null";
__ref._colspan /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=60686349;
 //BA.debugLineNum = 60686349;BA.debugLine="rowSpan = Null";
__ref._rowspan /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=60686350;
 //BA.debugLineNum = 60686350;BA.debugLine="linkToDestination = Null";
__ref._linktodestination /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686351;
 //BA.debugLineNum = 60686351;BA.debugLine="listType = Null";
__ref._listtype /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686352;
 //BA.debugLineNum = 60686352;BA.debugLine="id = Null";
__ref._id /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686353;
 //BA.debugLineNum = 60686353;BA.debugLine="pageReference = Null";
__ref._pagereference /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686354;
 //BA.debugLineNum = 60686354;BA.debugLine="textReference = Null";
__ref._textreference /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686355;
 //BA.debugLineNum = 60686355;BA.debugLine="preserveLeadingSpaces = Null";
__ref._preserveleadingspaces /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=60686356;
 //BA.debugLineNum = 60686356;BA.debugLine="tabindex = Null";
__ref._tabindex /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686357;
 //BA.debugLineNum = 60686357;BA.debugLine="decoration = Null";
__ref._decoration /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686358;
 //BA.debugLineNum = 60686358;BA.debugLine="decorationStyle = Null";
__ref._decorationstyle /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686359;
 //BA.debugLineNum = 60686359;BA.debugLine="decorationColor = Null";
__ref._decorationcolor /*String*/  = BA.ObjectToString(__c.Null);
RDebugUtils.currentLine=60686360;
 //BA.debugLineNum = 60686360;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60686361;
 //BA.debugLineNum = 60686361;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _append(b4j.example.pdftext __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "append", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "append", new Object[] {_txt}));}
RDebugUtils.currentLine=62390272;
 //BA.debugLineNum = 62390272;BA.debugLine="Sub Append(txt As String) As PDFText";
RDebugUtils.currentLine=62390273;
 //BA.debugLineNum = 62390273;BA.debugLine="textInt.Append(txt)";
__ref._textint /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_txt);
RDebugUtils.currentLine=62390274;
 //BA.debugLineNum = 62390274;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62390275;
 //BA.debugLineNum = 62390275;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _appendline(b4j.example.pdftext __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "appendline", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "appendline", new Object[] {_txt}));}
RDebugUtils.currentLine=62455808;
 //BA.debugLineNum = 62455808;BA.debugLine="Sub AppendLine(txt As String) As PDFText";
RDebugUtils.currentLine=62455809;
 //BA.debugLineNum = 62455809;BA.debugLine="textInt.Append(txt)";
__ref._textint /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(_txt);
RDebugUtils.currentLine=62455810;
 //BA.debugLineNum = 62455810;BA.debugLine="textInt.Append(CRLF)";
__ref._textint /*anywheresoftware.b4a.keywords.StringBuilderWrapper*/ .Append(__c.CRLF);
RDebugUtils.currentLine=62455811;
 //BA.debugLineNum = 62455811;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62455812;
 //BA.debugLineNum = 62455812;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdftext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
RDebugUtils.currentLine=60030976;
 //BA.debugLineNum = 60030976;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=60030977;
 //BA.debugLineNum = 60030977;BA.debugLine="Private contentInt As Map";
_contentint = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=60030978;
 //BA.debugLineNum = 60030978;BA.debugLine="Private textInt As StringBuilder";
_textint = new anywheresoftware.b4a.keywords.StringBuilderWrapper();
RDebugUtils.currentLine=60030979;
 //BA.debugLineNum = 60030979;BA.debugLine="Public link As String";
_link = "";
RDebugUtils.currentLine=60030980;
 //BA.debugLineNum = 60030980;BA.debugLine="Public linkToPage As Int";
_linktopage = 0;
RDebugUtils.currentLine=60030981;
 //BA.debugLineNum = 60030981;BA.debugLine="Public tocItem As Boolean";
_tocitem = false;
RDebugUtils.currentLine=60030982;
 //BA.debugLineNum = 60030982;BA.debugLine="Public pageOrientation As String";
_pageorientation = "";
RDebugUtils.currentLine=60030983;
 //BA.debugLineNum = 60030983;BA.debugLine="Public pageBreakBefore As Boolean";
_pagebreakbefore = false;
RDebugUtils.currentLine=60030984;
 //BA.debugLineNum = 60030984;BA.debugLine="Public pageBreakAfter As Boolean";
_pagebreakafter = false;
RDebugUtils.currentLine=60030985;
 //BA.debugLineNum = 60030985;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
RDebugUtils.currentLine=60030986;
 //BA.debugLineNum = 60030986;BA.debugLine="Public colSpan As Int";
_colspan = 0;
RDebugUtils.currentLine=60030987;
 //BA.debugLineNum = 60030987;BA.debugLine="Public rowSpan As Int";
_rowspan = 0;
RDebugUtils.currentLine=60030988;
 //BA.debugLineNum = 60030988;BA.debugLine="Public linkToDestination As String";
_linktodestination = "";
RDebugUtils.currentLine=60030989;
 //BA.debugLineNum = 60030989;BA.debugLine="Public id As String";
_id = "";
RDebugUtils.currentLine=60030990;
 //BA.debugLineNum = 60030990;BA.debugLine="Public listType As String";
_listtype = "";
RDebugUtils.currentLine=60030991;
 //BA.debugLineNum = 60030991;BA.debugLine="Public pageReference As String";
_pagereference = "";
RDebugUtils.currentLine=60030992;
 //BA.debugLineNum = 60030992;BA.debugLine="Public textReference As String";
_textreference = "";
RDebugUtils.currentLine=60030993;
 //BA.debugLineNum = 60030993;BA.debugLine="Public preserveLeadingSpaces As Boolean";
_preserveleadingspaces = false;
RDebugUtils.currentLine=60030994;
 //BA.debugLineNum = 60030994;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=60030995;
 //BA.debugLineNum = 60030995;BA.debugLine="Public tabindex As String";
_tabindex = "";
RDebugUtils.currentLine=60030996;
 //BA.debugLineNum = 60030996;BA.debugLine="Public decoration As String";
_decoration = "";
RDebugUtils.currentLine=60030997;
 //BA.debugLineNum = 60030997;BA.debugLine="Public decorationStyle As String";
_decorationstyle = "";
RDebugUtils.currentLine=60030998;
 //BA.debugLineNum = 60030998;BA.debugLine="Public decorationColor As String";
_decorationcolor = "";
RDebugUtils.currentLine=60030999;
 //BA.debugLineNum = 60030999;BA.debugLine="Public counter As Int";
_counter = 0;
RDebugUtils.currentLine=60031000;
 //BA.debugLineNum = 60031000;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdftext  _noborder(b4j.example.pdftext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "noborder", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "noborder", null));}
RDebugUtils.currentLine=61407232;
 //BA.debugLineNum = 61407232;BA.debugLine="Sub NoBorder As PDFText";
RDebugUtils.currentLine=61407233;
 //BA.debugLineNum = 61407233;BA.debugLine="style.noborder";
__ref._style /*b4j.example.pdfstyle*/ ._noborder /*b4j.example.pdfstyle*/ (null);
RDebugUtils.currentLine=61407234;
 //BA.debugLineNum = 61407234;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61407235;
 //BA.debugLineNum = 61407235;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setabsoluteposition(b4j.example.pdftext __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setabsoluteposition", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setabsoluteposition", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=61210624;
 //BA.debugLineNum = 61210624;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
RDebugUtils.currentLine=61210625;
 //BA.debugLineNum = 61210625;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=61210626;
 //BA.debugLineNum = 61210626;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=61210627;
 //BA.debugLineNum = 61210627;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=61210628;
 //BA.debugLineNum = 61210628;BA.debugLine="contentInt.Put(\"absolutePosition\", opt)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
RDebugUtils.currentLine=61210629;
 //BA.debugLineNum = 61210629;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61210630;
 //BA.debugLineNum = 61210630;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setalignmentcenter(b4j.example.pdftext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setalignmentcenter", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setalignmentcenter", null));}
RDebugUtils.currentLine=61603840;
 //BA.debugLineNum = 61603840;BA.debugLine="Sub SetAlignmentCenter As PDFText";
RDebugUtils.currentLine=61603841;
 //BA.debugLineNum = 61603841;BA.debugLine="style.alignmentCenter = True";
__ref._style /*b4j.example.pdfstyle*/ ._alignmentcenter /*boolean*/  = __c.True;
RDebugUtils.currentLine=61603842;
 //BA.debugLineNum = 61603842;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61603843;
 //BA.debugLineNum = 61603843;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setalignmentjustify(b4j.example.pdftext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setalignmentjustify", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setalignmentjustify", null));}
RDebugUtils.currentLine=61734912;
 //BA.debugLineNum = 61734912;BA.debugLine="Sub SetAlignmentJustify As PDFText";
RDebugUtils.currentLine=61734913;
 //BA.debugLineNum = 61734913;BA.debugLine="style.alignmentJustify = True";
__ref._style /*b4j.example.pdfstyle*/ ._alignmentjustify /*boolean*/  = __c.True;
RDebugUtils.currentLine=61734914;
 //BA.debugLineNum = 61734914;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61734915;
 //BA.debugLineNum = 61734915;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setalignmentright(b4j.example.pdftext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setalignmentright", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setalignmentright", null));}
RDebugUtils.currentLine=61669376;
 //BA.debugLineNum = 61669376;BA.debugLine="Sub SetAlignmentRight As PDFText";
RDebugUtils.currentLine=61669377;
 //BA.debugLineNum = 61669377;BA.debugLine="style.alignmentRight = True";
__ref._style /*b4j.example.pdfstyle*/ ._alignmentright /*boolean*/  = __c.True;
RDebugUtils.currentLine=61669378;
 //BA.debugLineNum = 61669378;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61669379;
 //BA.debugLineNum = 61669379;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setangle(b4j.example.pdftext __ref,double _dangle) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setangle", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setangle", new Object[] {_dangle}));}
RDebugUtils.currentLine=62783488;
 //BA.debugLineNum = 62783488;BA.debugLine="Sub SetAngle(dangle As Double) As PDFText";
RDebugUtils.currentLine=62783489;
 //BA.debugLineNum = 62783489;BA.debugLine="style.angle = dangle";
__ref._style /*b4j.example.pdfstyle*/ ._angle /*double*/  = _dangle;
RDebugUtils.currentLine=62783490;
 //BA.debugLineNum = 62783490;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62783491;
 //BA.debugLineNum = 62783491;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setbold(b4j.example.pdftext __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setbold", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setbold", new Object[] {_b}));}
RDebugUtils.currentLine=62128128;
 //BA.debugLineNum = 62128128;BA.debugLine="Sub SetBold(b As Boolean) As PDFText";
RDebugUtils.currentLine=62128129;
 //BA.debugLineNum = 62128129;BA.debugLine="style.bold = b";
__ref._style /*b4j.example.pdfstyle*/ ._bold /*boolean*/  = _b;
RDebugUtils.currentLine=62128130;
 //BA.debugLineNum = 62128130;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62128131;
 //BA.debugLineNum = 62128131;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setborder(b4j.example.pdftext __ref,boolean _l,boolean _t,boolean _r,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setborder", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setborder", new Object[] {_l,_t,_r,_b}));}
RDebugUtils.currentLine=61341696;
 //BA.debugLineNum = 61341696;BA.debugLine="Sub SetBorder(l As Boolean, t As Boolean, r As Boo";
RDebugUtils.currentLine=61341697;
 //BA.debugLineNum = 61341697;BA.debugLine="style.SetBorder(l,t,r,b)";
__ref._style /*b4j.example.pdfstyle*/ ._setborder /*b4j.example.pdfstyle*/ (null,_l,_t,_r,_b);
RDebugUtils.currentLine=61341698;
 //BA.debugLineNum = 61341698;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61341699;
 //BA.debugLineNum = 61341699;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setbordercolor(b4j.example.pdftext __ref,String _l,String _t,String _r,String _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setbordercolor", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setbordercolor", new Object[] {_l,_t,_r,_b}));}
anywheresoftware.b4a.objects.collections.List _margin = null;
RDebugUtils.currentLine=61276160;
 //BA.debugLineNum = 61276160;BA.debugLine="Sub SetBorderColor(l As String, t As String, r As";
RDebugUtils.currentLine=61276161;
 //BA.debugLineNum = 61276161;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61276162;
 //BA.debugLineNum = 61276162;BA.debugLine="margin.Initialize";
_margin.Initialize();
RDebugUtils.currentLine=61276163;
 //BA.debugLineNum = 61276163;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
RDebugUtils.currentLine=61276164;
 //BA.debugLineNum = 61276164;BA.debugLine="contentInt.Put(\"borderColor\", margin)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("borderColor"),(Object)(_margin.getObject()));
RDebugUtils.currentLine=61276165;
 //BA.debugLineNum = 61276165;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61276166;
 //BA.debugLineNum = 61276166;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setcolor(b4j.example.pdftext __ref,String _colour) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setcolor", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setcolor", new Object[] {_colour}));}
RDebugUtils.currentLine=62324736;
 //BA.debugLineNum = 62324736;BA.debugLine="Sub SetColor(colour As String) As PDFText";
RDebugUtils.currentLine=62324737;
 //BA.debugLineNum = 62324737;BA.debugLine="style.color = colour";
__ref._style /*b4j.example.pdfstyle*/ ._color /*String*/  = _colour;
RDebugUtils.currentLine=62324738;
 //BA.debugLineNum = 62324738;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62324739;
 //BA.debugLineNum = 62324739;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setcolspan(b4j.example.pdftext __ref,int _cs) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setcolspan", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setcolspan", new Object[] {_cs}));}
RDebugUtils.currentLine=61865984;
 //BA.debugLineNum = 61865984;BA.debugLine="Sub SetColSpan(cs As Int) As PDFText";
RDebugUtils.currentLine=61865985;
 //BA.debugLineNum = 61865985;BA.debugLine="If cs = 0 Then Return Me";
if (_cs==0) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=61865986;
 //BA.debugLineNum = 61865986;BA.debugLine="colSpan = cs";
__ref._colspan /*int*/  = _cs;
RDebugUtils.currentLine=61865987;
 //BA.debugLineNum = 61865987;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61865988;
 //BA.debugLineNum = 61865988;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setdecoration(b4j.example.pdftext __ref,String _dec) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setdecoration", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setdecoration", new Object[] {_dec}));}
RDebugUtils.currentLine=60751872;
 //BA.debugLineNum = 60751872;BA.debugLine="Sub SetDecoration(dec As String) As PDFText";
RDebugUtils.currentLine=60751873;
 //BA.debugLineNum = 60751873;BA.debugLine="If dec = \"\" Then Return Me";
if ((_dec).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60751874;
 //BA.debugLineNum = 60751874;BA.debugLine="decoration = dec";
__ref._decoration /*String*/  = _dec;
RDebugUtils.currentLine=60751875;
 //BA.debugLineNum = 60751875;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60751876;
 //BA.debugLineNum = 60751876;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setdecorationcolor(b4j.example.pdftext __ref,String _sdecorationcolor) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setdecorationcolor", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setdecorationcolor", new Object[] {_sdecorationcolor}));}
RDebugUtils.currentLine=60882944;
 //BA.debugLineNum = 60882944;BA.debugLine="Sub SetDecorationColor(sdecorationColor As String)";
RDebugUtils.currentLine=60882945;
 //BA.debugLineNum = 60882945;BA.debugLine="If sdecorationColor = \"\" Then Return Me";
if ((_sdecorationcolor).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60882946;
 //BA.debugLineNum = 60882946;BA.debugLine="decorationColor = sdecorationColor";
__ref._decorationcolor /*String*/  = _sdecorationcolor;
RDebugUtils.currentLine=60882947;
 //BA.debugLineNum = 60882947;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60882948;
 //BA.debugLineNum = 60882948;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setdecorationstyle(b4j.example.pdftext __ref,String _sdecorationstyle) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setdecorationstyle", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setdecorationstyle", new Object[] {_sdecorationstyle}));}
RDebugUtils.currentLine=60817408;
 //BA.debugLineNum = 60817408;BA.debugLine="Sub SetDecorationStyle(sdecorationStyle As String)";
RDebugUtils.currentLine=60817409;
 //BA.debugLineNum = 60817409;BA.debugLine="If sdecorationStyle = \"\" Then Return Me";
if ((_sdecorationstyle).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60817410;
 //BA.debugLineNum = 60817410;BA.debugLine="decorationStyle = sdecorationStyle";
__ref._decorationstyle /*String*/  = _sdecorationstyle;
RDebugUtils.currentLine=60817411;
 //BA.debugLineNum = 60817411;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60817412;
 //BA.debugLineNum = 60817412;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setfillcolor(b4j.example.pdftext __ref,Object _fc) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setfillcolor", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setfillcolor", new Object[] {_fc}));}
RDebugUtils.currentLine=61538304;
 //BA.debugLineNum = 61538304;BA.debugLine="Sub SetFillColor(fc As Object) As PDFText";
RDebugUtils.currentLine=61538305;
 //BA.debugLineNum = 61538305;BA.debugLine="style.fillColor = fc";
__ref._style /*b4j.example.pdfstyle*/ ._fillcolor /*String*/  = BA.ObjectToString(_fc);
RDebugUtils.currentLine=61538306;
 //BA.debugLineNum = 61538306;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61538307;
 //BA.debugLineNum = 61538307;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setfontsize(b4j.example.pdftext __ref,int _fs) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setfontsize", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setfontsize", new Object[] {_fs}));}
RDebugUtils.currentLine=62259200;
 //BA.debugLineNum = 62259200;BA.debugLine="Sub SetFontSize(fs As Int) As PDFText";
RDebugUtils.currentLine=62259201;
 //BA.debugLineNum = 62259201;BA.debugLine="style.fontSize = fs";
__ref._style /*b4j.example.pdfstyle*/ ._fontsize /*int*/  = _fs;
RDebugUtils.currentLine=62259202;
 //BA.debugLineNum = 62259202;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62259203;
 //BA.debugLineNum = 62259203;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setheight(b4j.example.pdftext __ref,String _sheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setheight", new Object[] {_sheight}));}
RDebugUtils.currentLine=62062592;
 //BA.debugLineNum = 62062592;BA.debugLine="Sub SetHeight(sHeight As String) As PDFText";
RDebugUtils.currentLine=62062593;
 //BA.debugLineNum = 62062593;BA.debugLine="style.height = sHeight";
__ref._style /*b4j.example.pdfstyle*/ ._height /*String*/  = _sheight;
RDebugUtils.currentLine=62062594;
 //BA.debugLineNum = 62062594;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62062595;
 //BA.debugLineNum = 62062595;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setid(b4j.example.pdftext __ref,String _sid) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setid", new Object[] {_sid}));}
RDebugUtils.currentLine=60162048;
 //BA.debugLineNum = 60162048;BA.debugLine="Sub SetID(sid As String) As PDFText";
RDebugUtils.currentLine=60162049;
 //BA.debugLineNum = 60162049;BA.debugLine="If sid = \"\" Then Return Me";
if ((_sid).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60162050;
 //BA.debugLineNum = 60162050;BA.debugLine="id = sid";
__ref._id /*String*/  = _sid;
RDebugUtils.currentLine=60162051;
 //BA.debugLineNum = 60162051;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60162052;
 //BA.debugLineNum = 60162052;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setitalics(b4j.example.pdftext __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setitalics", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setitalics", new Object[] {_b}));}
RDebugUtils.currentLine=62193664;
 //BA.debugLineNum = 62193664;BA.debugLine="Sub SetItalics(b As Boolean) As PDFText";
RDebugUtils.currentLine=62193665;
 //BA.debugLineNum = 62193665;BA.debugLine="style.italics = b";
__ref._style /*b4j.example.pdfstyle*/ ._italics /*boolean*/  = _b;
RDebugUtils.currentLine=62193666;
 //BA.debugLineNum = 62193666;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62193667;
 //BA.debugLineNum = 62193667;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setlink(b4j.example.pdftext __ref,String _slink) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setlink", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setlink", new Object[] {_slink}));}
RDebugUtils.currentLine=60489728;
 //BA.debugLineNum = 60489728;BA.debugLine="Sub SetLink(slink As String) As PDFText";
RDebugUtils.currentLine=60489729;
 //BA.debugLineNum = 60489729;BA.debugLine="If slink = \"\" Then Return Me";
if ((_slink).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60489730;
 //BA.debugLineNum = 60489730;BA.debugLine="link = slink";
__ref._link /*String*/  = _slink;
RDebugUtils.currentLine=60489731;
 //BA.debugLineNum = 60489731;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60489732;
 //BA.debugLineNum = 60489732;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setlinktodestination(b4j.example.pdftext __ref,String _slinktodestination) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setlinktodestination", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setlinktodestination", new Object[] {_slinktodestination}));}
RDebugUtils.currentLine=60358656;
 //BA.debugLineNum = 60358656;BA.debugLine="Sub SetLinkToDestination(slinkToDestination As Str";
RDebugUtils.currentLine=60358657;
 //BA.debugLineNum = 60358657;BA.debugLine="If slinkToDestination = \"\" Then Return Me";
if ((_slinktodestination).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60358658;
 //BA.debugLineNum = 60358658;BA.debugLine="linkToDestination = slinkToDestination";
__ref._linktodestination /*String*/  = _slinktodestination;
RDebugUtils.currentLine=60358659;
 //BA.debugLineNum = 60358659;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60358660;
 //BA.debugLineNum = 60358660;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setlinktopage(b4j.example.pdftext __ref,String _slinktopage) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setlinktopage", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setlinktopage", new Object[] {_slinktopage}));}
RDebugUtils.currentLine=60424192;
 //BA.debugLineNum = 60424192;BA.debugLine="Sub SetLinkToPage(slinkToPage As String) As PDFTex";
RDebugUtils.currentLine=60424193;
 //BA.debugLineNum = 60424193;BA.debugLine="If slinkToPage = \"\" Then Return Me";
if ((_slinktopage).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60424194;
 //BA.debugLineNum = 60424194;BA.debugLine="linkToPage = slinkToPage";
__ref._linktopage /*int*/  = (int)(Double.parseDouble(_slinktopage));
RDebugUtils.currentLine=60424195;
 //BA.debugLineNum = 60424195;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60424196;
 //BA.debugLineNum = 60424196;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setlisttype(b4j.example.pdftext __ref,String _slisttype) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setlisttype", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setlisttype", new Object[] {_slisttype}));}
RDebugUtils.currentLine=60555264;
 //BA.debugLineNum = 60555264;BA.debugLine="Sub SetListType(slisttype As String) As PDFText";
RDebugUtils.currentLine=60555265;
 //BA.debugLineNum = 60555265;BA.debugLine="If slisttype = \"\" Then Return Me";
if ((_slisttype).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60555266;
 //BA.debugLineNum = 60555266;BA.debugLine="listType = slisttype";
__ref._listtype /*String*/  = _slisttype;
RDebugUtils.currentLine=60555267;
 //BA.debugLineNum = 60555267;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60555268;
 //BA.debugLineNum = 60555268;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setmargin(b4j.example.pdftext __ref,int _l,int _t,int _r,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setmargin", new Object[] {_l,_t,_r,_b}));}
RDebugUtils.currentLine=62717952;
 //BA.debugLineNum = 62717952;BA.debugLine="Sub SetMargin(l As Int, t As Int, r As Int, b As I";
RDebugUtils.currentLine=62717953;
 //BA.debugLineNum = 62717953;BA.debugLine="style.SetMargin(l,t,r,b)";
__ref._style /*b4j.example.pdfstyle*/ ._setmargin /*b4j.example.pdfstyle*/ (null,_l,_t,_r,_b);
RDebugUtils.currentLine=62717954;
 //BA.debugLineNum = 62717954;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62717955;
 //BA.debugLineNum = 62717955;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setopacity(b4j.example.pdftext __ref,double _o) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setopacity", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setopacity", new Object[] {_o}));}
RDebugUtils.currentLine=62849024;
 //BA.debugLineNum = 62849024;BA.debugLine="Sub SetOpacity(o As Double) As PDFText";
RDebugUtils.currentLine=62849025;
 //BA.debugLineNum = 62849025;BA.debugLine="style.opacity = o";
__ref._style /*b4j.example.pdfstyle*/ ._opacity /*double*/  = _o;
RDebugUtils.currentLine=62849026;
 //BA.debugLineNum = 62849026;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62849027;
 //BA.debugLineNum = 62849027;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setpagebreakafter(b4j.example.pdftext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setpagebreakafter", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setpagebreakafter", null));}
RDebugUtils.currentLine=62586880;
 //BA.debugLineNum = 62586880;BA.debugLine="Sub SetPageBreakAfter As PDFText";
RDebugUtils.currentLine=62586881;
 //BA.debugLineNum = 62586881;BA.debugLine="contentInt.Put(\"pageBreak\", \"after\")";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));
RDebugUtils.currentLine=62586882;
 //BA.debugLineNum = 62586882;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62586883;
 //BA.debugLineNum = 62586883;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setpagebreakbefore(b4j.example.pdftext __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setpagebreakbefore", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setpagebreakbefore", null));}
RDebugUtils.currentLine=62521344;
 //BA.debugLineNum = 62521344;BA.debugLine="Sub SetPageBreakBefore As PDFText";
RDebugUtils.currentLine=62521345;
 //BA.debugLineNum = 62521345;BA.debugLine="contentInt.Put(\"pageBreak\", \"before\")";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));
RDebugUtils.currentLine=62521346;
 //BA.debugLineNum = 62521346;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=62521347;
 //BA.debugLineNum = 62521347;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setpageorientation(b4j.example.pdftext __ref,String _spageorientation) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setpageorientation", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setpageorientation", new Object[] {_spageorientation}));}
RDebugUtils.currentLine=60620800;
 //BA.debugLineNum = 60620800;BA.debugLine="Sub SetPageOrientation(spageOrientation As String)";
RDebugUtils.currentLine=60620801;
 //BA.debugLineNum = 60620801;BA.debugLine="If spageOrientation = \"\" Then Return Me";
if ((_spageorientation).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60620802;
 //BA.debugLineNum = 60620802;BA.debugLine="pageOrientation = spageOrientation";
__ref._pageorientation /*String*/  = _spageorientation;
RDebugUtils.currentLine=60620803;
 //BA.debugLineNum = 60620803;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60620804;
 //BA.debugLineNum = 60620804;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setpagereference(b4j.example.pdftext __ref,String _spagereference) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setpagereference", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setpagereference", new Object[] {_spagereference}));}
RDebugUtils.currentLine=60293120;
 //BA.debugLineNum = 60293120;BA.debugLine="Sub SetPageReference(spageReference As String) As";
RDebugUtils.currentLine=60293121;
 //BA.debugLineNum = 60293121;BA.debugLine="If spageReference = \"\" Then Return Me";
if ((_spagereference).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60293122;
 //BA.debugLineNum = 60293122;BA.debugLine="pageReference = spageReference";
__ref._pagereference /*String*/  = _spagereference;
RDebugUtils.currentLine=60293123;
 //BA.debugLineNum = 60293123;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60293124;
 //BA.debugLineNum = 60293124;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setrelativeposition(b4j.example.pdftext __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setrelativeposition", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setrelativeposition", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=61472768;
 //BA.debugLineNum = 61472768;BA.debugLine="Sub SetRelativePosition(x As Int, y As Int) As PDF";
RDebugUtils.currentLine=61472769;
 //BA.debugLineNum = 61472769;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=61472770;
 //BA.debugLineNum = 61472770;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=61472771;
 //BA.debugLineNum = 61472771;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=61472772;
 //BA.debugLineNum = 61472772;BA.debugLine="contentInt.Put(\"relativePosition\", opt)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("relativePosition"),(Object)(_opt.getObject()));
RDebugUtils.currentLine=61472773;
 //BA.debugLineNum = 61472773;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61472774;
 //BA.debugLineNum = 61472774;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setrowspan(b4j.example.pdftext __ref,int _rs) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setrowspan", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setrowspan", new Object[] {_rs}));}
RDebugUtils.currentLine=61800448;
 //BA.debugLineNum = 61800448;BA.debugLine="Sub SetRowSpan(rs As Int) As PDFText";
RDebugUtils.currentLine=61800449;
 //BA.debugLineNum = 61800449;BA.debugLine="If rs = 0 Then Return Me";
if (_rs==0) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=61800450;
 //BA.debugLineNum = 61800450;BA.debugLine="rowSpan = rs";
__ref._rowspan /*int*/  = _rs;
RDebugUtils.currentLine=61800451;
 //BA.debugLineNum = 61800451;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61800452;
 //BA.debugLineNum = 61800452;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setstyle(b4j.example.pdftext __ref,String _stylename) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setstyle", new Object[] {_stylename}));}
RDebugUtils.currentLine=61931520;
 //BA.debugLineNum = 61931520;BA.debugLine="Sub SetStyle(styleName As String) As PDFText";
RDebugUtils.currentLine=61931521;
 //BA.debugLineNum = 61931521;BA.debugLine="If styleName = \"\" Then Return Me";
if ((_stylename).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=61931522;
 //BA.debugLineNum = 61931522;BA.debugLine="style.AddStyle(styleName)";
__ref._style /*b4j.example.pdfstyle*/ ._addstyle /*b4j.example.pdfstyle*/ (null,_stylename);
RDebugUtils.currentLine=61931523;
 //BA.debugLineNum = 61931523;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61931524;
 //BA.debugLineNum = 61931524;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settabindex(b4j.example.pdftext __ref,String _stabindex) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "settabindex", new Object[] {_stabindex}));}
RDebugUtils.currentLine=60096512;
 //BA.debugLineNum = 60096512;BA.debugLine="Sub SetTabIndex(stabindex As String) As PDFText";
RDebugUtils.currentLine=60096513;
 //BA.debugLineNum = 60096513;BA.debugLine="If stabindex = \"\" Then Return Me";
if ((_stabindex).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60096514;
 //BA.debugLineNum = 60096514;BA.debugLine="tabindex = stabindex";
__ref._tabindex /*String*/  = _stabindex;
RDebugUtils.currentLine=60096515;
 //BA.debugLineNum = 60096515;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60096516;
 //BA.debugLineNum = 60096516;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settextreference(b4j.example.pdftext __ref,String _stextreference) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "settextreference", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "settextreference", new Object[] {_stextreference}));}
RDebugUtils.currentLine=60227584;
 //BA.debugLineNum = 60227584;BA.debugLine="Sub SetTextReference(stextReference As String) As";
RDebugUtils.currentLine=60227585;
 //BA.debugLineNum = 60227585;BA.debugLine="If stextReference = \"\" Then Return Me";
if ((_stextreference).equals("")) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=60227586;
 //BA.debugLineNum = 60227586;BA.debugLine="textReference = stextReference";
__ref._textreference /*String*/  = _stextreference;
RDebugUtils.currentLine=60227587;
 //BA.debugLineNum = 60227587;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60227588;
 //BA.debugLineNum = 60227588;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settocitem(b4j.example.pdftext __ref,boolean _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "settocitem", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "settocitem", new Object[] {_ti}));}
RDebugUtils.currentLine=61145088;
 //BA.debugLineNum = 61145088;BA.debugLine="Sub SetTocItem(ti As Boolean) As PDFText";
RDebugUtils.currentLine=61145089;
 //BA.debugLineNum = 61145089;BA.debugLine="If ti = False Then Return Me";
if (_ti==__c.False) { 
if (true) return (b4j.example.pdftext)(this);};
RDebugUtils.currentLine=61145090;
 //BA.debugLineNum = 61145090;BA.debugLine="tocItem = ti";
__ref._tocitem /*boolean*/  = _ti;
RDebugUtils.currentLine=61145091;
 //BA.debugLineNum = 61145091;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61145092;
 //BA.debugLineNum = 61145092;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settocmargin(b4j.example.pdftext __ref,int _l,int _t,int _r,int _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "settocmargin", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "settocmargin", new Object[] {_l,_t,_r,_b}));}
anywheresoftware.b4a.objects.collections.List _margin = null;
RDebugUtils.currentLine=61079552;
 //BA.debugLineNum = 61079552;BA.debugLine="Sub SetTocMargin(l As Int, t As Int, r As Int, b A";
RDebugUtils.currentLine=61079553;
 //BA.debugLineNum = 61079553;BA.debugLine="Dim margin As List";
_margin = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=61079554;
 //BA.debugLineNum = 61079554;BA.debugLine="margin.Initialize";
_margin.Initialize();
RDebugUtils.currentLine=61079555;
 //BA.debugLineNum = 61079555;BA.debugLine="margin.AddAll(Array(l,t,r,b))";
_margin.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_l),(Object)(_t),(Object)(_r),(Object)(_b)}));
RDebugUtils.currentLine=61079556;
 //BA.debugLineNum = 61079556;BA.debugLine="contentInt.Put(\"tocMargin\", margin)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tocMargin"),(Object)(_margin.getObject()));
RDebugUtils.currentLine=61079557;
 //BA.debugLineNum = 61079557;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61079558;
 //BA.debugLineNum = 61079558;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settocnumberstyle(b4j.example.pdftext __ref,b4j.example.pdfstyle _ts) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "settocnumberstyle", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "settocnumberstyle", new Object[] {_ts}));}
RDebugUtils.currentLine=60948480;
 //BA.debugLineNum = 60948480;BA.debugLine="Sub SetTocNumberStyle(ts As PDFStyle) As PDFText";
RDebugUtils.currentLine=60948481;
 //BA.debugLineNum = 60948481;BA.debugLine="contentInt.Put(\"tocNumberStyle\", ts)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tocNumberStyle"),(Object)(_ts));
RDebugUtils.currentLine=60948482;
 //BA.debugLineNum = 60948482;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=60948483;
 //BA.debugLineNum = 60948483;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _settocstyle(b4j.example.pdftext __ref,b4j.example.pdfstyle _ts) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "settocstyle", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "settocstyle", new Object[] {_ts}));}
RDebugUtils.currentLine=61014016;
 //BA.debugLineNum = 61014016;BA.debugLine="Sub SetTocStyle(ts As PDFStyle) As PDFText";
RDebugUtils.currentLine=61014017;
 //BA.debugLineNum = 61014017;BA.debugLine="contentInt.Put(\"tocStyle\", ts)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("tocStyle"),(Object)(_ts));
RDebugUtils.currentLine=61014018;
 //BA.debugLineNum = 61014018;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61014019;
 //BA.debugLineNum = 61014019;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftext  _setwidth(b4j.example.pdftext __ref,String _swidth) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftext";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.pdftext) Debug.delegate(ba, "setwidth", new Object[] {_swidth}));}
RDebugUtils.currentLine=61997056;
 //BA.debugLineNum = 61997056;BA.debugLine="Sub SetWidth(sWidth As String) As PDFText";
RDebugUtils.currentLine=61997057;
 //BA.debugLineNum = 61997057;BA.debugLine="style.width = sWidth";
__ref._style /*b4j.example.pdfstyle*/ ._width /*String*/  = _swidth;
RDebugUtils.currentLine=61997058;
 //BA.debugLineNum = 61997058;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftext)(this);
RDebugUtils.currentLine=61997059;
 //BA.debugLineNum = 61997059;BA.debugLine="End Sub";
return null;
}
}