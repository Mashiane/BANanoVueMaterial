package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfparagraphs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfparagraphs", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfparagraphs.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.List _contents = null;
public b4j.example.pdfstyle _style = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdfparagraphs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfparagraphs";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=55574528;
 //BA.debugLineNum = 55574528;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=55574529;
 //BA.debugLineNum = 55574529;BA.debugLine="contentInt.Put(\"text\", contents)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("text"),(Object)(__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=55574530;
 //BA.debugLineNum = 55574530;BA.debugLine="style.Include(contentInt)";
__ref._style /*b4j.example.pdfstyle*/ ._include /*String*/ (null,__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=55574531;
 //BA.debugLineNum = 55574531;BA.debugLine="Return contentInt";
if (true) return __ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=55574532;
 //BA.debugLineNum = 55574532;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfparagraphs  _initialize(b4j.example.pdfparagraphs __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfparagraphs";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdfparagraphs) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=55181312;
 //BA.debugLineNum = 55181312;BA.debugLine="Public Sub Initialize As PDFParagraphs";
RDebugUtils.currentLine=55181313;
 //BA.debugLineNum = 55181313;BA.debugLine="contentInt.Initialize";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=55181314;
 //BA.debugLineNum = 55181314;BA.debugLine="contents.Initialize";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=55181315;
 //BA.debugLineNum = 55181315;BA.debugLine="style.Initialize";
__ref._style /*b4j.example.pdfstyle*/ ._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=55181316;
 //BA.debugLineNum = 55181316;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfparagraphs)(this);
RDebugUtils.currentLine=55181317;
 //BA.debugLineNum = 55181317;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfparagraphs  _addstring(b4j.example.pdfparagraphs __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfparagraphs";
if (Debug.shouldDelegate(ba, "addstring", true))
	 {return ((b4j.example.pdfparagraphs) Debug.delegate(ba, "addstring", new Object[] {_txt}));}
RDebugUtils.currentLine=55377920;
 //BA.debugLineNum = 55377920;BA.debugLine="Sub AddString(txt As String) As PDFParagraphs";
RDebugUtils.currentLine=55377921;
 //BA.debugLineNum = 55377921;BA.debugLine="contents.Add(txt)";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_txt));
RDebugUtils.currentLine=55377922;
 //BA.debugLineNum = 55377922;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfparagraphs)(this);
RDebugUtils.currentLine=55377923;
 //BA.debugLineNum = 55377923;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfparagraphs  _addtext(b4j.example.pdfparagraphs __ref,b4j.example.pdftext _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfparagraphs";
if (Debug.shouldDelegate(ba, "addtext", true))
	 {return ((b4j.example.pdfparagraphs) Debug.delegate(ba, "addtext", new Object[] {_txt}));}
RDebugUtils.currentLine=55312384;
 //BA.debugLineNum = 55312384;BA.debugLine="Sub AddText(txt As PDFText) As PDFParagraphs";
RDebugUtils.currentLine=55312385;
 //BA.debugLineNum = 55312385;BA.debugLine="contents.Add(txt.Content)";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_txt._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=55312386;
 //BA.debugLineNum = 55312386;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfparagraphs)(this);
RDebugUtils.currentLine=55312387;
 //BA.debugLineNum = 55312387;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdfparagraphs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfparagraphs";
RDebugUtils.currentLine=55115776;
 //BA.debugLineNum = 55115776;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=55115777;
 //BA.debugLineNum = 55115777;BA.debugLine="Private contentInt As Map";
_contentint = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=55115778;
 //BA.debugLineNum = 55115778;BA.debugLine="Private contents As List";
_contents = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=55115779;
 //BA.debugLineNum = 55115779;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
RDebugUtils.currentLine=55115780;
 //BA.debugLineNum = 55115780;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfparagraphs  _setabsoluteposition(b4j.example.pdfparagraphs __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfparagraphs";
if (Debug.shouldDelegate(ba, "setabsoluteposition", true))
	 {return ((b4j.example.pdfparagraphs) Debug.delegate(ba, "setabsoluteposition", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=55246848;
 //BA.debugLineNum = 55246848;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
RDebugUtils.currentLine=55246849;
 //BA.debugLineNum = 55246849;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=55246850;
 //BA.debugLineNum = 55246850;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=55246851;
 //BA.debugLineNum = 55246851;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=55246852;
 //BA.debugLineNum = 55246852;BA.debugLine="contentInt.Put(\"absolutePosition\", opt)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
RDebugUtils.currentLine=55246853;
 //BA.debugLineNum = 55246853;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfparagraphs)(this);
RDebugUtils.currentLine=55246854;
 //BA.debugLineNum = 55246854;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfparagraphs  _setpagebreakafter(b4j.example.pdfparagraphs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfparagraphs";
if (Debug.shouldDelegate(ba, "setpagebreakafter", true))
	 {return ((b4j.example.pdfparagraphs) Debug.delegate(ba, "setpagebreakafter", null));}
RDebugUtils.currentLine=55508992;
 //BA.debugLineNum = 55508992;BA.debugLine="Sub SetPageBreakAfter As PDFParagraphs";
RDebugUtils.currentLine=55508993;
 //BA.debugLineNum = 55508993;BA.debugLine="contentInt.Put(\"pageBreak\", \"after\")";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));
RDebugUtils.currentLine=55508994;
 //BA.debugLineNum = 55508994;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfparagraphs)(this);
RDebugUtils.currentLine=55508995;
 //BA.debugLineNum = 55508995;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfparagraphs  _setpagebreakbefore(b4j.example.pdfparagraphs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfparagraphs";
if (Debug.shouldDelegate(ba, "setpagebreakbefore", true))
	 {return ((b4j.example.pdfparagraphs) Debug.delegate(ba, "setpagebreakbefore", null));}
RDebugUtils.currentLine=55443456;
 //BA.debugLineNum = 55443456;BA.debugLine="Sub SetPageBreakBefore As PDFParagraphs";
RDebugUtils.currentLine=55443457;
 //BA.debugLineNum = 55443457;BA.debugLine="contentInt.Put(\"pageBreak\", \"before\")";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));
RDebugUtils.currentLine=55443458;
 //BA.debugLineNum = 55443458;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfparagraphs)(this);
RDebugUtils.currentLine=55443459;
 //BA.debugLineNum = 55443459;BA.debugLine="End Sub";
return null;
}
}