package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class pdfview extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.pdfview", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.pdfview.class).invoke(this, new Object[] {null});
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
public com.ab.banano.BANanoObject _jq = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public String _href = "";
public String _id = "";
public com.ab.banano.BANano _banano = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public String  _class_globals(b4j.example.pdfview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfview";
RDebugUtils.currentLine=63242240;
 //BA.debugLineNum = 63242240;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=63242241;
 //BA.debugLineNum = 63242241;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=63242242;
 //BA.debugLineNum = 63242242;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=63242243;
 //BA.debugLineNum = 63242243;BA.debugLine="Private href As String";
_href = "";
RDebugUtils.currentLine=63242244;
 //BA.debugLineNum = 63242244;BA.debugLine="Private id As String";
_id = "";
RDebugUtils.currentLine=63242245;
 //BA.debugLineNum = 63242245;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=63242246;
 //BA.debugLineNum = 63242246;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfview  _initialize(b4j.example.pdfview __ref,anywheresoftware.b4a.BA _ba,String _elementid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="pdfview";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.pdfview) Debug.delegate(ba, "initialize", new Object[] {_ba,_elementid}));}
RDebugUtils.currentLine=63307776;
 //BA.debugLineNum = 63307776;BA.debugLine="Public Sub Initialize(elementID As String) As PDFV";
RDebugUtils.currentLine=63307778;
 //BA.debugLineNum = 63307778;BA.debugLine="JQ.Initialize(\"$\")";
__ref._jq /*com.ab.banano.BANanoObject*/ .Initialize((Object)("$"));
RDebugUtils.currentLine=63307779;
 //BA.debugLineNum = 63307779;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=63307780;
 //BA.debugLineNum = 63307780;BA.debugLine="href = \"\"";
__ref._href /*String*/  = "";
RDebugUtils.currentLine=63307781;
 //BA.debugLineNum = 63307781;BA.debugLine="id = elementID.tolowercase";
__ref._id /*String*/  = _elementid.toLowerCase();
RDebugUtils.currentLine=63307782;
 //BA.debugLineNum = 63307782;BA.debugLine="SetWidth(\"100%\")";
__ref._setwidth /*b4j.example.pdfview*/ (null,"100%");
RDebugUtils.currentLine=63307783;
 //BA.debugLineNum = 63307783;BA.debugLine="SetHeight(\"80vh\")";
__ref._setheight /*b4j.example.pdfview*/ (null,"80vh");
RDebugUtils.currentLine=63307784;
 //BA.debugLineNum = 63307784;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfview)(this);
RDebugUtils.currentLine=63307785;
 //BA.debugLineNum = 63307785;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfview  _setwidth(b4j.example.pdfview __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfview";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.pdfview) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=63373312;
 //BA.debugLineNum = 63373312;BA.debugLine="Sub SetWidth(w As String) As PDFView";
RDebugUtils.currentLine=63373313;
 //BA.debugLineNum = 63373313;BA.debugLine="options.Put(\"width\", w)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("width"),(Object)(_w));
RDebugUtils.currentLine=63373314;
 //BA.debugLineNum = 63373314;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfview)(this);
RDebugUtils.currentLine=63373315;
 //BA.debugLineNum = 63373315;BA.debugLine="End Sub";
return null;
}
public b4j.example.pdfview  _setheight(b4j.example.pdfview __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfview";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.pdfview) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=63438848;
 //BA.debugLineNum = 63438848;BA.debugLine="Sub SetHeight(h As String) As PDFView";
RDebugUtils.currentLine=63438849;
 //BA.debugLineNum = 63438849;BA.debugLine="options.Put(\"height\", h)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("height"),(Object)(_h));
RDebugUtils.currentLine=63438850;
 //BA.debugLineNum = 63438850;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfview)(this);
RDebugUtils.currentLine=63438851;
 //BA.debugLineNum = 63438851;BA.debugLine="End Sub";
return null;
}
public String  _refresh(b4j.example.pdfview __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfview";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
String _ikey = "";
RDebugUtils.currentLine=63569920;
 //BA.debugLineNum = 63569920;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=63569921;
 //BA.debugLineNum = 63569921;BA.debugLine="Dim iKey As String = $\"#${id}\"$";
_ikey = ("#"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"");
RDebugUtils.currentLine=63569922;
 //BA.debugLineNum = 63569922;BA.debugLine="BANano.GetElement(iKey).SetAttr(\"href\", href).Add";
__ref._banano /*com.ab.banano.BANano*/ .GetElement(_ikey).SetAttr("href",__ref._href /*String*/ ).AddClass("media");
RDebugUtils.currentLine=63569923;
 //BA.debugLineNum = 63569923;BA.debugLine="JQ.Selector(iKey).RunMethod(\"media\", options)";
__ref._jq /*com.ab.banano.BANanoObject*/ .Selector((Object)(_ikey)).RunMethod("media",(Object)(__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .getObject()));
RDebugUtils.currentLine=63569924;
 //BA.debugLineNum = 63569924;BA.debugLine="End Sub";
return "";
}
public b4j.example.pdfview  _sethref(b4j.example.pdfview __ref,String _shref) throws Exception{
__ref = this;
RDebugUtils.currentModule="pdfview";
if (Debug.shouldDelegate(ba, "sethref", true))
	 {return ((b4j.example.pdfview) Debug.delegate(ba, "sethref", new Object[] {_shref}));}
RDebugUtils.currentLine=63504384;
 //BA.debugLineNum = 63504384;BA.debugLine="Sub SetHREF(shref As String) As PDFView";
RDebugUtils.currentLine=63504385;
 //BA.debugLineNum = 63504385;BA.debugLine="href = shref";
__ref._href /*String*/  = _shref;
RDebugUtils.currentLine=63504386;
 //BA.debugLineNum = 63504386;BA.debugLine="Return Me";
if (true) return (b4j.example.pdfview)(this);
RDebugUtils.currentLine=63504387;
 //BA.debugLineNum = 63504387;BA.debugLine="End Sub";
return null;
}
}