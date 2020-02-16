package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdffooter extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdffooter", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdffooter.class).invoke(this, new Object[] {null});
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
public b4j.example.pdftext _leftpart = null;
public b4j.example.pdftext _rightpart = null;
public anywheresoftware.b4a.objects.collections.List _cols = null;
public anywheresoftware.b4a.objects.collections.Map _ftr = null;
public b4j.example.pdfstyle _style = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _class_globals(b4j.example.pdffooter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdffooter";
RDebugUtils.currentLine=49086464;
 //BA.debugLineNum = 49086464;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=49086465;
 //BA.debugLineNum = 49086465;BA.debugLine="Public LeftPart As PDFText";
_leftpart = new b4j.example.pdftext();
RDebugUtils.currentLine=49086466;
 //BA.debugLineNum = 49086466;BA.debugLine="Public RightPart As PDFText";
_rightpart = new b4j.example.pdftext();
RDebugUtils.currentLine=49086467;
 //BA.debugLineNum = 49086467;BA.debugLine="Private cols As List";
_cols = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=49086468;
 //BA.debugLineNum = 49086468;BA.debugLine="Dim ftr As Map";
_ftr = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=49086469;
 //BA.debugLineNum = 49086469;BA.debugLine="Public style As PDFStyle";
_style = new b4j.example.pdfstyle();
RDebugUtils.currentLine=49086470;
 //BA.debugLineNum = 49086470;BA.debugLine="End Sub";
return "";
}
public anywheresoftware.b4a.objects.collections.Map  _getcontent(b4j.example.pdffooter __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdffooter";
if (Debug.shouldDelegate(ba, "getcontent", true))
	 {return ((anywheresoftware.b4a.objects.collections.Map) Debug.delegate(ba, "getcontent", null));}
RDebugUtils.currentLine=49217536;
 //BA.debugLineNum = 49217536;BA.debugLine="Sub getContent As Map";
RDebugUtils.currentLine=49217537;
 //BA.debugLineNum = 49217537;BA.debugLine="cols.Add(LeftPart.Content)";
__ref._cols /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._leftpart /*b4j.example.pdftext*/ ._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=49217538;
 //BA.debugLineNum = 49217538;BA.debugLine="cols.Add(RightPart.Content)";
__ref._cols /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(__ref._rightpart /*b4j.example.pdftext*/ ._getcontent /*anywheresoftware.b4a.objects.collections.Map*/ (null).getObject()));
RDebugUtils.currentLine=49217539;
 //BA.debugLineNum = 49217539;BA.debugLine="ftr.Put(\"columns\", cols)";
__ref._ftr /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("columns"),(Object)(__ref._cols /*anywheresoftware.b4a.objects.collections.List*/ .getObject()));
RDebugUtils.currentLine=49217540;
 //BA.debugLineNum = 49217540;BA.debugLine="style.Include(ftr)";
__ref._style /*b4j.example.pdfstyle*/ ._include /*String*/ (null,__ref._ftr /*anywheresoftware.b4a.objects.collections.Map*/ );
RDebugUtils.currentLine=49217541;
 //BA.debugLineNum = 49217541;BA.debugLine="Return ftr";
if (true) return __ref._ftr /*anywheresoftware.b4a.objects.collections.Map*/ ;
RDebugUtils.currentLine=49217542;
 //BA.debugLineNum = 49217542;BA.debugLine="End Sub";
return null;
}
public String  _initialize(b4j.example.pdffooter __ref,anywheresoftware.b4a.BA _ba) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdffooter";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((String) Debug.delegate(ba, "initialize", new Object[] {_ba}));}
RDebugUtils.currentLine=49152000;
 //BA.debugLineNum = 49152000;BA.debugLine="Public Sub Initialize";
RDebugUtils.currentLine=49152001;
 //BA.debugLineNum = 49152001;BA.debugLine="cols.Initialize";
__ref._cols /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=49152002;
 //BA.debugLineNum = 49152002;BA.debugLine="LeftPart.Initialize";
__ref._leftpart /*b4j.example.pdftext*/ ._initialize /*b4j.example.pdftext*/ (null,ba);
RDebugUtils.currentLine=49152003;
 //BA.debugLineNum = 49152003;BA.debugLine="RightPart.Initialize";
__ref._rightpart /*b4j.example.pdftext*/ ._initialize /*b4j.example.pdftext*/ (null,ba);
RDebugUtils.currentLine=49152004;
 //BA.debugLineNum = 49152004;BA.debugLine="ftr.Initialize";
__ref._ftr /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=49152005;
 //BA.debugLineNum = 49152005;BA.debugLine="style.Initialize";
__ref._style /*b4j.example.pdfstyle*/ ._initialize /*b4j.example.pdfstyle*/ (null,ba);
RDebugUtils.currentLine=49152006;
 //BA.debugLineNum = 49152006;BA.debugLine="End Sub";
return "";
}
}