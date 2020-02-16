package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfstack extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfstack", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfstack.class).invoke(this, new Object[] {null});
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
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdfstack __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstack";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=57540608;
 //BA.debugLineNum = 57540608;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=57540609;
 //BA.debugLineNum = 57540609;BA.debugLine="contentInt.Put(\"stack\", contents)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("stack"),(Object)(__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=57540610;
 //BA.debugLineNum = 57540610;BA.debugLine="style.Include(contentInt)";
__ref._style /*b4j.example.pdfstyle*/ ._include /*String*/ (null,__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=57540611;
 //BA.debugLineNum = 57540611;BA.debugLine="Return contentInt";
if (true) return __ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=57540612;
 //BA.debugLineNum = 57540612;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _initialize(b4j.example.pdfstack __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfstack";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdfstack) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=57081856;
 //BA.debugLineNum = 57081856;BA.debugLine="Public Sub Initialize As PDFStack";
RDebugUtils.currentLine=57081857;
 //BA.debugLineNum = 57081857;BA.debugLine="contentInt.Initialize";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=57081858;
 //BA.debugLineNum = 57081858;BA.debugLine="contents.Initialize";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=57081859;
 //BA.debugLineNum = 57081859;BA.debugLine="style.Initialize";
__ref._style /*b4j.example.pdfstyle*/ ._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=57081860;
 //BA.debugLineNum = 57081860;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
RDebugUtils.currentLine=57081861;
 //BA.debugLineNum = 57081861;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _addlist(b4j.example.pdfstack __ref,b4j.example.pdflist _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstack";
if (Debug.shouldDelegate(ba, "addlist", true))
	 {return ((b4j.example.pdfstack) Debug.delegate(ba, "addlist", new Object[] {_lst}));}
RDebugUtils.currentLine=57147392;
 //BA.debugLineNum = 57147392;BA.debugLine="Sub AddList(lst As PDFList) As PDFStack";
RDebugUtils.currentLine=57147393;
 //BA.debugLineNum = 57147393;BA.debugLine="contents.Add(lst.Content)";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_lst._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=57147394;
 //BA.debugLineNum = 57147394;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
RDebugUtils.currentLine=57147395;
 //BA.debugLineNum = 57147395;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _addstring(b4j.example.pdfstack __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstack";
if (Debug.shouldDelegate(ba, "addstring", true))
	 {return ((b4j.example.pdfstack) Debug.delegate(ba, "addstring", new Object[] {_txt}));}
RDebugUtils.currentLine=57475072;
 //BA.debugLineNum = 57475072;BA.debugLine="Sub AddString(txt As String) As PDFStack";
RDebugUtils.currentLine=57475073;
 //BA.debugLineNum = 57475073;BA.debugLine="contents.Add(txt)";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_txt));
RDebugUtils.currentLine=57475074;
 //BA.debugLineNum = 57475074;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
RDebugUtils.currentLine=57475075;
 //BA.debugLineNum = 57475075;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _addtext(b4j.example.pdfstack __ref,b4j.example.pdftext _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstack";
if (Debug.shouldDelegate(ba, "addtext", true))
	 {return ((b4j.example.pdfstack) Debug.delegate(ba, "addtext", new Object[] {_txt}));}
RDebugUtils.currentLine=57278464;
 //BA.debugLineNum = 57278464;BA.debugLine="Sub AddText(txt As PDFText) As PDFStack";
RDebugUtils.currentLine=57278465;
 //BA.debugLineNum = 57278465;BA.debugLine="contents.Add(txt.Content)";
__ref._contents /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_txt._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=57278466;
 //BA.debugLineNum = 57278466;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
RDebugUtils.currentLine=57278467;
 //BA.debugLineNum = 57278467;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.pdfstack __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstack";
RDebugUtils.currentLine=57016320;
 //BA.debugLineNum = 57016320;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=57016321;
 //BA.debugLineNum = 57016321;BA.debugLine="Private contentInt As Map";
_contentint = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=57016322;
 //BA.debugLineNum = 57016322;BA.debugLine="Private contents As List";
_contents = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=57016323;
 //BA.debugLineNum = 57016323;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
RDebugUtils.currentLine=57016324;
 //BA.debugLineNum = 57016324;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfstack  _setabsoluteposition(b4j.example.pdfstack __ref,int _x,int _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstack";
if (Debug.shouldDelegate(ba, "setabsoluteposition", true))
	 {return ((b4j.example.pdfstack) Debug.delegate(ba, "setabsoluteposition", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.Map _opt = null;
RDebugUtils.currentLine=57212928;
 //BA.debugLineNum = 57212928;BA.debugLine="Sub SetAbsolutePosition(x As Int, y As Int) As PDF";
RDebugUtils.currentLine=57212929;
 //BA.debugLineNum = 57212929;BA.debugLine="Dim opt As Map = CreateMap()";
_opt = new anywheresoftware.b4a.objects.collections.Map();
_opt = __c.createMap(new Object[] {});
RDebugUtils.currentLine=57212930;
 //BA.debugLineNum = 57212930;BA.debugLine="opt.Put(\"x\", x)";
_opt.Put((Object)("x"),(Object)(_x));
RDebugUtils.currentLine=57212931;
 //BA.debugLineNum = 57212931;BA.debugLine="opt.Put(\"y\", y)";
_opt.Put((Object)("y"),(Object)(_y));
RDebugUtils.currentLine=57212932;
 //BA.debugLineNum = 57212932;BA.debugLine="contentInt.Put(\"absolutePosition\", opt)";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("absolutePosition"),(Object)(_opt.getObject()));
RDebugUtils.currentLine=57212933;
 //BA.debugLineNum = 57212933;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
RDebugUtils.currentLine=57212934;
 //BA.debugLineNum = 57212934;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _setpagebreakafter(b4j.example.pdfstack __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstack";
if (Debug.shouldDelegate(ba, "setpagebreakafter", true))
	 {return ((b4j.example.pdfstack) Debug.delegate(ba, "setpagebreakafter", null));}
RDebugUtils.currentLine=57409536;
 //BA.debugLineNum = 57409536;BA.debugLine="Sub SetPageBreakAfter As PDFStack";
RDebugUtils.currentLine=57409537;
 //BA.debugLineNum = 57409537;BA.debugLine="contentInt.Put(\"pageBreak\", \"after\")";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("after"));
RDebugUtils.currentLine=57409538;
 //BA.debugLineNum = 57409538;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
RDebugUtils.currentLine=57409539;
 //BA.debugLineNum = 57409539;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfstack  _setpagebreakbefore(b4j.example.pdfstack __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfstack";
if (Debug.shouldDelegate(ba, "setpagebreakbefore", true))
	 {return ((b4j.example.pdfstack) Debug.delegate(ba, "setpagebreakbefore", null));}
RDebugUtils.currentLine=57344000;
 //BA.debugLineNum = 57344000;BA.debugLine="Sub SetPageBreakBefore As PDFStack";
RDebugUtils.currentLine=57344001;
 //BA.debugLineNum = 57344001;BA.debugLine="contentInt.Put(\"pageBreak\", \"before\")";
__ref._contentint /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("pageBreak"),(Object)("before"));
RDebugUtils.currentLine=57344002;
 //BA.debugLineNum = 57344002;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfstack)(this);
RDebugUtils.currentLine=57344003;
 //BA.debugLineNum = 57344003;BA.debugLine="End Sub";
return null;
}
}