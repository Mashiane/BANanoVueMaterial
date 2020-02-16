package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdivider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmdivider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdivider.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _divider = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmdivider  _initialize(b4j.example.vmdivider __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmdivider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmdivider) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=106364928;
 //BA.debugLineNum = 106364928;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=106364929;
 //BA.debugLineNum = 106364929;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=106364930;
 //BA.debugLineNum = 106364930;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=106364931;
 //BA.debugLineNum = 106364931;BA.debugLine="Divider.Initialize(vue, ID).SetTag(\"md-divider\")";
__ref._divider /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-divider");
RDebugUtils.currentLine=106364932;
 //BA.debugLineNum = 106364932;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
RDebugUtils.currentLine=106364933;
 //BA.debugLineNum = 106364933;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmdivider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdivider";
RDebugUtils.currentLine=106299392;
 //BA.debugLineNum = 106299392;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=106299393;
 //BA.debugLineNum = 106299393;BA.debugLine="Public Divider As VMElement";
_divider = new b4j.example.vmelement();
RDebugUtils.currentLine=106299394;
 //BA.debugLineNum = 106299394;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=106299395;
 //BA.debugLineNum = 106299395;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=106299396;
 //BA.debugLineNum = 106299396;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmdivider __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdivider";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=106627072;
 //BA.debugLineNum = 106627072;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=106627073;
 //BA.debugLineNum = 106627073;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=106627074;
 //BA.debugLineNum = 106627074;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmdivider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdivider";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=106496000;
 //BA.debugLineNum = 106496000;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=106496001;
 //BA.debugLineNum = 106496001;BA.debugLine="Return Divider.tostring";
if (true) return __ref._divider /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=106496002;
 //BA.debugLineNum = 106496002;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmdivider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdivider";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=106561536;
 //BA.debugLineNum = 106561536;BA.debugLine="Sub Render";
RDebugUtils.currentLine=106561537;
 //BA.debugLineNum = 106561537;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=106561538;
 //BA.debugLineNum = 106561538;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdivider  _setinset(b4j.example.vmdivider __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdivider";
if (Debug.shouldDelegate(ba, "setinset", true))
	 {return ((b4j.example.vmdivider) Debug.delegate(ba, "setinset", new Object[] {_b}));}
RDebugUtils.currentLine=106430464;
 //BA.debugLineNum = 106430464;BA.debugLine="Sub SetInset(b As Boolean) As VMDivider";
RDebugUtils.currentLine=106430465;
 //BA.debugLineNum = 106430465;BA.debugLine="If b Then Divider.addclass(\"md-inset\")";
if (_b) { 
__ref._divider /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-inset");};
RDebugUtils.currentLine=106430466;
 //BA.debugLineNum = 106430466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdivider)(this);
RDebugUtils.currentLine=106430467;
 //BA.debugLineNum = 106430467;BA.debugLine="End Sub";
return null;
}
}