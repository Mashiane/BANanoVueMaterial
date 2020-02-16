package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdftoc extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdftoc", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdftoc.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map _toc = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdftoc __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftoc";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=63176704;
 //BA.debugLineNum = 63176704;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=63176705;
 //BA.debugLineNum = 63176705;BA.debugLine="toc.Put(\"toc\", options)";
__ref._toc /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("toc"),(Object)(__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=63176706;
 //BA.debugLineNum = 63176706;BA.debugLine="Return toc";
if (true) return __ref._toc /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=63176707;
 //BA.debugLineNum = 63176707;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftoc  _initialize(b4j.example.pdftoc __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdftoc";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdftoc) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=62980096;
 //BA.debugLineNum = 62980096;BA.debugLine="Public Sub Initialize As PDFToC";
RDebugUtils.currentLine=62980097;
 //BA.debugLineNum = 62980097;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=62980098;
 //BA.debugLineNum = 62980098;BA.debugLine="toc.Initialize";
__ref._toc /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=62980099;
 //BA.debugLineNum = 62980099;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftoc)(this);
RDebugUtils.currentLine=62980100;
 //BA.debugLineNum = 62980100;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdftoc __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftoc";
RDebugUtils.currentLine=62914560;
 //BA.debugLineNum = 62914560;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=62914561;
 //BA.debugLineNum = 62914561;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=62914562;
 //BA.debugLineNum = 62914562;BA.debugLine="Private toc As Map";
_toc = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=62914563;
 //BA.debugLineNum = 62914563;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdftoc  _setnumberstyle(b4j.example.pdftoc __ref,b4j.example.pdfstyle _style) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftoc";
if (Debug.shouldDelegate(ba, "setnumberstyle", true))
	 {return ((b4j.example.pdftoc) Debug.delegate(ba, "setnumberstyle", new Object[] {_style}));}
RDebugUtils.currentLine=63111168;
 //BA.debugLineNum = 63111168;BA.debugLine="Sub SetNumberStyle(style As PDFStyle) As PDFToC";
RDebugUtils.currentLine=63111169;
 //BA.debugLineNum = 63111169;BA.debugLine="options.Put(\"numberStyle\", style.Content)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("numberStyle"),(Object)(_style._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=63111170;
 //BA.debugLineNum = 63111170;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftoc)(this);
RDebugUtils.currentLine=63111171;
 //BA.debugLineNum = 63111171;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdftoc  _settitle(b4j.example.pdftoc __ref,b4j.example.pdftext _text) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdftoc";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.pdftoc) Debug.delegate(ba, "settitle", new Object[] {_text}));}
RDebugUtils.currentLine=63045632;
 //BA.debugLineNum = 63045632;BA.debugLine="Sub SetTitle(text As PDFText) As PDFToC";
RDebugUtils.currentLine=63045633;
 //BA.debugLineNum = 63045633;BA.debugLine="options.Put(\"title\", text.Content)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("title"),(Object)(_text._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=63045634;
 //BA.debugLineNum = 63045634;BA.debugLine="Return Me";
if (true) return (b4j.example.pdftoc)(this);
RDebugUtils.currentLine=63045635;
 //BA.debugLineNum = 63045635;BA.debugLine="End Sub";
return null;
}
}