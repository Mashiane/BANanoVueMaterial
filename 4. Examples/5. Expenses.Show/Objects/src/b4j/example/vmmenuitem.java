package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmmenuitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmmenuitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmmenuitem.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _menuitem = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmmenuitem  _initialize(b4j.example.vmmenuitem __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=175702016;
 //BA.debugLineNum = 175702016;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=175702017;
 //BA.debugLineNum = 175702017;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=175702018;
 //BA.debugLineNum = 175702018;BA.debugLine="MenuItem.Initialize(v, ID)";
__ref._menuitem /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=175702019;
 //BA.debugLineNum = 175702019;BA.debugLine="MenuItem.SetTag(\"md-menu-item\")";
__ref._menuitem /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-menu-item");
RDebugUtils.currentLine=175702020;
 //BA.debugLineNum = 175702020;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=175702021;
 //BA.debugLineNum = 175702021;BA.debugLine="MenuItem.SetOnClick(module, $\"${ID}_click\"$)";
__ref._menuitem /*b4j.example.vmelement*/ ._setonclick /*b4j.example.vmelement*/ (null,__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"));
RDebugUtils.currentLine=175702022;
 //BA.debugLineNum = 175702022;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=175702023;
 //BA.debugLineNum = 175702023;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=175702024;
 //BA.debugLineNum = 175702024;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmmenuitem __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=176488448;
 //BA.debugLineNum = 176488448;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=176488449;
 //BA.debugLineNum = 176488449;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=176488450;
 //BA.debugLineNum = 176488450;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenuitem  _addchild(b4j.example.vmmenuitem __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=176226304;
 //BA.debugLineNum = 176226304;BA.debugLine="Sub AddChild(child As VMElement) As VMMenuItem";
RDebugUtils.currentLine=176226305;
 //BA.debugLineNum = 176226305;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=176226306;
 //BA.debugLineNum = 176226306;BA.debugLine="MenuItem.SetText(childHTML)";
__ref._menuitem /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=176226307;
 //BA.debugLineNum = 176226307;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176226308;
 //BA.debugLineNum = 176226308;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmmenuitem __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=176750592;
 //BA.debugLineNum = 176750592;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=176750593;
 //BA.debugLineNum = 176750593;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=176750594;
 //BA.debugLineNum = 176750594;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmmenuitem*/ (null,_childx);
 }
};
RDebugUtils.currentLine=176750596;
 //BA.debugLineNum = 176750596;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenuitem  _addclass(b4j.example.vmmenuitem __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=176553984;
 //BA.debugLineNum = 176553984;BA.debugLine="Sub AddClass(c As String) As VMMenuItem";
RDebugUtils.currentLine=176553985;
 //BA.debugLineNum = 176553985;BA.debugLine="MenuItem.AddClass(c)";
__ref._menuitem /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=176553986;
 //BA.debugLineNum = 176553986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176553987;
 //BA.debugLineNum = 176553987;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmmenuitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
RDebugUtils.currentLine=175636480;
 //BA.debugLineNum = 175636480;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=175636481;
 //BA.debugLineNum = 175636481;BA.debugLine="Public MenuItem As VMElement";
_menuitem = new b4j.example.vmelement();
RDebugUtils.currentLine=175636482;
 //BA.debugLineNum = 175636482;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=175636483;
 //BA.debugLineNum = 175636483;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=175636484;
 //BA.debugLineNum = 175636484;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=175636485;
 //BA.debugLineNum = 175636485;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=175636486;
 //BA.debugLineNum = 175636486;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmmenuitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=175898624;
 //BA.debugLineNum = 175898624;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=175898625;
 //BA.debugLineNum = 175898625;BA.debugLine="Return MenuItem.ToString";
if (true) return __ref._menuitem /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=175898626;
 //BA.debugLineNum = 175898626;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmmenuitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=176160768;
 //BA.debugLineNum = 176160768;BA.debugLine="Sub Render";
RDebugUtils.currentLine=176160769;
 //BA.debugLineNum = 176160769;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=176160770;
 //BA.debugLineNum = 176160770;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmmenuitem  _setaccent(b4j.example.vmmenuitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=176422912;
 //BA.debugLineNum = 176422912;BA.debugLine="Sub SetAccent(b As Boolean) As VMMenuItem";
RDebugUtils.currentLine=176422913;
 //BA.debugLineNum = 176422913;BA.debugLine="MenuItem.SetAccent(True)";
__ref._menuitem /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=176422914;
 //BA.debugLineNum = 176422914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176422915;
 //BA.debugLineNum = 176422915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _setattr(b4j.example.vmmenuitem __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=176619520;
 //BA.debugLineNum = 176619520;BA.debugLine="Sub SetAttr(attr As Map) As VMMenuItem";
RDebugUtils.currentLine=176619521;
 //BA.debugLineNum = 176619521;BA.debugLine="MenuItem.SetAttr(attr)";
__ref._menuitem /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=176619522;
 //BA.debugLineNum = 176619522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176619523;
 //BA.debugLineNum = 176619523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _setid(b4j.example.vmmenuitem __ref,String _n,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setid", new Object[] {_n,_bind}));}
RDebugUtils.currentLine=175833088;
 //BA.debugLineNum = 175833088;BA.debugLine="Sub SetID(n As String, bind As Boolean) As VMMenuI";
RDebugUtils.currentLine=175833089;
 //BA.debugLineNum = 175833089;BA.debugLine="MenuItem.SetID(n, bind)";
__ref._menuitem /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_n,_bind);
RDebugUtils.currentLine=175833090;
 //BA.debugLineNum = 175833090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=175833091;
 //BA.debugLineNum = 175833091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _setkey(b4j.example.vmmenuitem __ref,Object _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=175767552;
 //BA.debugLineNum = 175767552;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VMMenu";
RDebugUtils.currentLine=175767553;
 //BA.debugLineNum = 175767553;BA.debugLine="MenuItem.SetKey(k, bind)";
__ref._menuitem /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,_k,_bind);
RDebugUtils.currentLine=175767554;
 //BA.debugLineNum = 175767554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=175767555;
 //BA.debugLineNum = 175767555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _setpadding(b4j.example.vmmenuitem __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=176816128;
 //BA.debugLineNum = 176816128;BA.debugLine="Sub SetPadding(p As Object) As VMMenuItem";
RDebugUtils.currentLine=176816129;
 //BA.debugLineNum = 176816129;BA.debugLine="MenuItem.SetPaddingAll(p)";
__ref._menuitem /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=176816130;
 //BA.debugLineNum = 176816130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176816131;
 //BA.debugLineNum = 176816131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _setprimary(b4j.example.vmmenuitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=176357376;
 //BA.debugLineNum = 176357376;BA.debugLine="Sub SetPrimary(b As Boolean) As VMMenuItem";
RDebugUtils.currentLine=176357377;
 //BA.debugLineNum = 176357377;BA.debugLine="MenuItem.SetPrimary(True)";
__ref._menuitem /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=176357378;
 //BA.debugLineNum = 176357378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176357379;
 //BA.debugLineNum = 176357379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _setstyle(b4j.example.vmmenuitem __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=176685056;
 //BA.debugLineNum = 176685056;BA.debugLine="Sub SetStyle(sm As Map) As VMMenuItem";
RDebugUtils.currentLine=176685057;
 //BA.debugLineNum = 176685057;BA.debugLine="MenuItem.SetStyle(sm)";
__ref._menuitem /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=176685058;
 //BA.debugLineNum = 176685058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176685059;
 //BA.debugLineNum = 176685059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _settext(b4j.example.vmmenuitem __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=176291840;
 //BA.debugLineNum = 176291840;BA.debugLine="Sub SetText(t As Object) As VMMenuItem";
RDebugUtils.currentLine=176291841;
 //BA.debugLineNum = 176291841;BA.debugLine="MenuItem.SetText(t)";
__ref._menuitem /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=176291842;
 //BA.debugLineNum = 176291842;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176291843;
 //BA.debugLineNum = 176291843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _setvif(b4j.example.vmmenuitem __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=176029696;
 //BA.debugLineNum = 176029696;BA.debugLine="Sub SetVIf(vif As Object) As VMMenuItem";
RDebugUtils.currentLine=176029697;
 //BA.debugLineNum = 176029697;BA.debugLine="MenuItem.SetVIf(vif)";
__ref._menuitem /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=176029698;
 //BA.debugLineNum = 176029698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176029699;
 //BA.debugLineNum = 176029699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _setvmodel(b4j.example.vmmenuitem __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=175964160;
 //BA.debugLineNum = 175964160;BA.debugLine="Sub SetVModel(k As String) As VMMenuItem";
RDebugUtils.currentLine=175964161;
 //BA.debugLineNum = 175964161;BA.debugLine="MenuItem.SetVModel(k)";
__ref._menuitem /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=175964162;
 //BA.debugLineNum = 175964162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=175964163;
 //BA.debugLineNum = 175964163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmmenuitem  _setvshow(b4j.example.vmmenuitem __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmmenuitem";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmmenuitem) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=176095232;
 //BA.debugLineNum = 176095232;BA.debugLine="Sub SetVShow(vif As Object) As VMMenuItem";
RDebugUtils.currentLine=176095233;
 //BA.debugLineNum = 176095233;BA.debugLine="MenuItem.SetVShow(vif)";
__ref._menuitem /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=176095234;
 //BA.debugLineNum = 176095234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmmenuitem)(this);
RDebugUtils.currentLine=176095235;
 //BA.debugLineNum = 176095235;BA.debugLine="End Sub";
return null;
}
}