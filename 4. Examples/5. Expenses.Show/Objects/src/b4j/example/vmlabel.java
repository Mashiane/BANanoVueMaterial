package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmlabel extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmlabel", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmlabel.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _label = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmlabel  _initialize(b4j.example.vmlabel __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=161087488;
 //BA.debugLineNum = 161087488;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=161087489;
 //BA.debugLineNum = 161087489;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=161087490;
 //BA.debugLineNum = 161087490;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=161087491;
 //BA.debugLineNum = 161087491;BA.debugLine="Label.Initialize(vue, ID).SetTag(\"label\")";
__ref._label /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"label");
RDebugUtils.currentLine=161087492;
 //BA.debugLineNum = 161087492;BA.debugLine="Label.RemoveAttr(\":required\")";
__ref._label /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=161087493;
 //BA.debugLineNum = 161087493;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161087494;
 //BA.debugLineNum = 161087494;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settext(b4j.example.vmlabel __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=162136064;
 //BA.debugLineNum = 162136064;BA.debugLine="Sub SetText(t As String) As VMLabel";
RDebugUtils.currentLine=162136065;
 //BA.debugLineNum = 162136065;BA.debugLine="Label.SetText(t)";
__ref._label /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=162136066;
 //BA.debugLineNum = 162136066;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162136067;
 //BA.debugLineNum = 162136067;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setcaption(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setcaption", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setcaption", new Object[] {_b}));}
RDebugUtils.currentLine=161873920;
 //BA.debugLineNum = 161873920;BA.debugLine="Sub SetCaption(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161873921;
 //BA.debugLineNum = 161873921;BA.debugLine="Label.SetCaption(b)";
__ref._label /*b4j.example.vmelement*/ ._setcaption /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161873922;
 //BA.debugLineNum = 161873922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161873923;
 //BA.debugLineNum = 161873923;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmlabel __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=163250176;
 //BA.debugLineNum = 163250176;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=163250177;
 //BA.debugLineNum = 163250177;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=163250178;
 //BA.debugLineNum = 163250178;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _settag(b4j.example.vmlabel __ref,String _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "settag", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "settag", new Object[] {_size}));}
RDebugUtils.currentLine=162332672;
 //BA.debugLineNum = 162332672;BA.debugLine="Sub SetTag(size As String) As VMLabel";
RDebugUtils.currentLine=162332673;
 //BA.debugLineNum = 162332673;BA.debugLine="Label.SetTag(size)";
__ref._label /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,_size);
RDebugUtils.currentLine=162332674;
 //BA.debugLineNum = 162332674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162332675;
 //BA.debugLineNum = 162332675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setvshow(b4j.example.vmlabel __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=162004992;
 //BA.debugLineNum = 162004992;BA.debugLine="Sub SetVShow(vif As String) As VMLabel";
RDebugUtils.currentLine=162004993;
 //BA.debugLineNum = 162004993;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmlabel)(this);};
RDebugUtils.currentLine=162004994;
 //BA.debugLineNum = 162004994;BA.debugLine="Label.SetVShow(vif)";
__ref._label /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=162004995;
 //BA.debugLineNum = 162004995;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162004996;
 //BA.debugLineNum = 162004996;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=163119104;
 //BA.debugLineNum = 163119104;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=163119105;
 //BA.debugLineNum = 163119105;BA.debugLine="Return Label.tostring";
if (true) return __ref._label /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=163119106;
 //BA.debugLineNum = 163119106;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _addchild(b4j.example.vmlabel __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=162922496;
 //BA.debugLineNum = 162922496;BA.debugLine="Sub AddChild(child As VMElement) As VMLabel";
RDebugUtils.currentLine=162922497;
 //BA.debugLineNum = 162922497;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=162922498;
 //BA.debugLineNum = 162922498;BA.debugLine="Label.SetText(childHTML)";
__ref._label /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=162922499;
 //BA.debugLineNum = 162922499;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162922500;
 //BA.debugLineNum = 162922500;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmlabel __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=162988032;
 //BA.debugLineNum = 162988032;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=162988033;
 //BA.debugLineNum = 162988033;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=162988034;
 //BA.debugLineNum = 162988034;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmlabel*/ (null,_childx);
 }
};
RDebugUtils.currentLine=162988036;
 //BA.debugLineNum = 162988036;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _addclass(b4j.example.vmlabel __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=162856960;
 //BA.debugLineNum = 162856960;BA.debugLine="Sub AddClass(c As String) As VMLabel";
RDebugUtils.currentLine=162856961;
 //BA.debugLineNum = 162856961;BA.debugLine="Label.AddClass(c)";
__ref._label /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=162856962;
 //BA.debugLineNum = 162856962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162856963;
 //BA.debugLineNum = 162856963;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmlabel __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=163315712;
 //BA.debugLineNum = 163315712;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=163315713;
 //BA.debugLineNum = 163315713;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=163315714;
 //BA.debugLineNum = 163315714;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
RDebugUtils.currentLine=161021952;
 //BA.debugLineNum = 161021952;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=161021953;
 //BA.debugLineNum = 161021953;BA.debugLine="Public Label As VMElement";
_label = new b4j.example.vmelement();
RDebugUtils.currentLine=161021954;
 //BA.debugLineNum = 161021954;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=161021955;
 //BA.debugLineNum = 161021955;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=161021956;
 //BA.debugLineNum = 161021956;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=163184640;
 //BA.debugLineNum = 163184640;BA.debugLine="Sub Render";
RDebugUtils.currentLine=163184641;
 //BA.debugLineNum = 163184641;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=163184642;
 //BA.debugLineNum = 163184642;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmlabel  _setattr(b4j.example.vmlabel __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=163053568;
 //BA.debugLineNum = 163053568;BA.debugLine="Sub SetAttr(attr As Map) As VMLabel";
RDebugUtils.currentLine=163053569;
 //BA.debugLineNum = 163053569;BA.debugLine="Label.SetAttr(attr)";
__ref._label /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=163053570;
 //BA.debugLineNum = 163053570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=163053571;
 //BA.debugLineNum = 163053571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setbody1(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setbody1", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setbody1", new Object[] {_b}));}
RDebugUtils.currentLine=161808384;
 //BA.debugLineNum = 161808384;BA.debugLine="Sub SetBody1(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161808385;
 //BA.debugLineNum = 161808385;BA.debugLine="Label.SetBody1(b)";
__ref._label /*b4j.example.vmelement*/ ._setbody1 /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161808386;
 //BA.debugLineNum = 161808386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161808387;
 //BA.debugLineNum = 161808387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setbody2(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setbody2", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setbody2", new Object[] {_b}));}
RDebugUtils.currentLine=161742848;
 //BA.debugLineNum = 161742848;BA.debugLine="Sub SetBody2(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161742849;
 //BA.debugLineNum = 161742849;BA.debugLine="Label.SetBody2(b)";
__ref._label /*b4j.example.vmelement*/ ._setbody2 /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161742850;
 //BA.debugLineNum = 161742850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161742851;
 //BA.debugLineNum = 161742851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisabled(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=161939456;
 //BA.debugLineNum = 161939456;BA.debugLine="Sub SetDisabled(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161939457;
 //BA.debugLineNum = 161939457;BA.debugLine="Label.SetDisabled(b)";
__ref._label /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161939458;
 //BA.debugLineNum = 161939458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161939459;
 //BA.debugLineNum = 161939459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay1(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setdisplay1", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setdisplay1", new Object[] {_b}));}
RDebugUtils.currentLine=161349632;
 //BA.debugLineNum = 161349632;BA.debugLine="Sub SetDisplay1(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161349633;
 //BA.debugLineNum = 161349633;BA.debugLine="Label.SetDisplay1(b)";
__ref._label /*b4j.example.vmelement*/ ._setdisplay1 /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161349634;
 //BA.debugLineNum = 161349634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161349635;
 //BA.debugLineNum = 161349635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay2(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setdisplay2", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setdisplay2", new Object[] {_b}));}
RDebugUtils.currentLine=161284096;
 //BA.debugLineNum = 161284096;BA.debugLine="Sub SetDisplay2(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161284097;
 //BA.debugLineNum = 161284097;BA.debugLine="Label.SetDisplay2(b)";
__ref._label /*b4j.example.vmelement*/ ._setdisplay2 /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161284098;
 //BA.debugLineNum = 161284098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161284099;
 //BA.debugLineNum = 161284099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay3(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setdisplay3", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setdisplay3", new Object[] {_b}));}
RDebugUtils.currentLine=161218560;
 //BA.debugLineNum = 161218560;BA.debugLine="Sub SetDisplay3(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161218561;
 //BA.debugLineNum = 161218561;BA.debugLine="Label.SetDisplay3(b)";
__ref._label /*b4j.example.vmelement*/ ._setdisplay3 /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161218562;
 //BA.debugLineNum = 161218562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161218563;
 //BA.debugLineNum = 161218563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setdisplay4(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setdisplay4", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setdisplay4", new Object[] {_b}));}
RDebugUtils.currentLine=161153024;
 //BA.debugLineNum = 161153024;BA.debugLine="Sub SetDisplay4(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161153025;
 //BA.debugLineNum = 161153025;BA.debugLine="Label.SetDisplay4(b)";
__ref._label /*b4j.example.vmelement*/ ._setdisplay4 /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161153026;
 //BA.debugLineNum = 161153026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161153027;
 //BA.debugLineNum = 161153027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setelevation(b4j.example.vmlabel __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=162791424;
 //BA.debugLineNum = 162791424;BA.debugLine="Sub SetElevation(e As Int) As VMLabel";
RDebugUtils.currentLine=162791425;
 //BA.debugLineNum = 162791425;BA.debugLine="Label.SetElevation(e)";
__ref._label /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=162791426;
 //BA.debugLineNum = 162791426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162791427;
 //BA.debugLineNum = 162791427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth1(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "seth1", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "seth1", null));}
RDebugUtils.currentLine=162267136;
 //BA.debugLineNum = 162267136;BA.debugLine="Sub SetH1 As VMLabel";
RDebugUtils.currentLine=162267137;
 //BA.debugLineNum = 162267137;BA.debugLine="Label.SetTag(\"h1\")";
__ref._label /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"h1");
RDebugUtils.currentLine=162267138;
 //BA.debugLineNum = 162267138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162267139;
 //BA.debugLineNum = 162267139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth2(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "seth2", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "seth2", null));}
RDebugUtils.currentLine=162398208;
 //BA.debugLineNum = 162398208;BA.debugLine="Sub SetH2 As VMLabel";
RDebugUtils.currentLine=162398209;
 //BA.debugLineNum = 162398209;BA.debugLine="Label.SetTag(\"h2\")";
__ref._label /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"h2");
RDebugUtils.currentLine=162398210;
 //BA.debugLineNum = 162398210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162398211;
 //BA.debugLineNum = 162398211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth3(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "seth3", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "seth3", null));}
RDebugUtils.currentLine=162463744;
 //BA.debugLineNum = 162463744;BA.debugLine="Sub SetH3 As VMLabel";
RDebugUtils.currentLine=162463745;
 //BA.debugLineNum = 162463745;BA.debugLine="Label.SetTag(\"h3\")";
__ref._label /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"h3");
RDebugUtils.currentLine=162463746;
 //BA.debugLineNum = 162463746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162463747;
 //BA.debugLineNum = 162463747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth4(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "seth4", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "seth4", null));}
RDebugUtils.currentLine=162529280;
 //BA.debugLineNum = 162529280;BA.debugLine="Sub SetH4 As VMLabel";
RDebugUtils.currentLine=162529281;
 //BA.debugLineNum = 162529281;BA.debugLine="Label.SetTag(\"h4\")";
__ref._label /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"h4");
RDebugUtils.currentLine=162529282;
 //BA.debugLineNum = 162529282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162529283;
 //BA.debugLineNum = 162529283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth5(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "seth5", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "seth5", null));}
RDebugUtils.currentLine=162660352;
 //BA.debugLineNum = 162660352;BA.debugLine="Sub SetH5 As VMLabel";
RDebugUtils.currentLine=162660353;
 //BA.debugLineNum = 162660353;BA.debugLine="Label.SetTag(\"h5\")";
__ref._label /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"h5");
RDebugUtils.currentLine=162660354;
 //BA.debugLineNum = 162660354;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162660355;
 //BA.debugLineNum = 162660355;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _seth6(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "seth6", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "seth6", null));}
RDebugUtils.currentLine=162725888;
 //BA.debugLineNum = 162725888;BA.debugLine="Sub SetH6 As VMLabel";
RDebugUtils.currentLine=162725889;
 //BA.debugLineNum = 162725889;BA.debugLine="Label.SetTag(\"h6\")";
__ref._label /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"h6");
RDebugUtils.currentLine=162725890;
 //BA.debugLineNum = 162725890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162725891;
 //BA.debugLineNum = 162725891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setheadline(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setheadline", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setheadline", new Object[] {_b}));}
RDebugUtils.currentLine=161415168;
 //BA.debugLineNum = 161415168;BA.debugLine="Sub SetHeadline(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161415169;
 //BA.debugLineNum = 161415169;BA.debugLine="Label.SetHeadline(b)";
__ref._label /*b4j.example.vmelement*/ ._setheadline /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161415170;
 //BA.debugLineNum = 161415170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161415171;
 //BA.debugLineNum = 161415171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setparagraph(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setparagraph", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setparagraph", null));}
RDebugUtils.currentLine=162201600;
 //BA.debugLineNum = 162201600;BA.debugLine="Sub SetParagraph As VMLabel";
RDebugUtils.currentLine=162201601;
 //BA.debugLineNum = 162201601;BA.debugLine="Label.SetTag(\"p\")";
__ref._label /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"p");
RDebugUtils.currentLine=162201602;
 //BA.debugLineNum = 162201602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162201603;
 //BA.debugLineNum = 162201603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setspan(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setspan", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setspan", null));}
RDebugUtils.currentLine=162594816;
 //BA.debugLineNum = 162594816;BA.debugLine="Sub SetSpan As VMLabel";
RDebugUtils.currentLine=162594817;
 //BA.debugLineNum = 162594817;BA.debugLine="Label.SetTag(\"span\")";
__ref._label /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"span");
RDebugUtils.currentLine=162594818;
 //BA.debugLineNum = 162594818;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162594819;
 //BA.debugLineNum = 162594819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setstyle(b4j.example.vmlabel __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=162070528;
 //BA.debugLineNum = 162070528;BA.debugLine="Sub SetStyle(sm As Map) As VMLabel";
RDebugUtils.currentLine=162070529;
 //BA.debugLineNum = 162070529;BA.debugLine="Label.SetStyle(sm)";
__ref._label /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=162070530;
 //BA.debugLineNum = 162070530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=162070531;
 //BA.debugLineNum = 162070531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setsubheading(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setsubheading", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setsubheading", new Object[] {_b}));}
RDebugUtils.currentLine=161677312;
 //BA.debugLineNum = 161677312;BA.debugLine="Sub SetSubHeading(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161677313;
 //BA.debugLineNum = 161677313;BA.debugLine="Label.SetSubHeading(b)";
__ref._label /*b4j.example.vmelement*/ ._setsubheading /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161677314;
 //BA.debugLineNum = 161677314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161677315;
 //BA.debugLineNum = 161677315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settitle(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "settitle", new Object[] {_b}));}
RDebugUtils.currentLine=161480704;
 //BA.debugLineNum = 161480704;BA.debugLine="Sub SetTitle(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161480705;
 //BA.debugLineNum = 161480705;BA.debugLine="Label.SetTitle(b)";
__ref._label /*b4j.example.vmelement*/ ._settitle /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161480706;
 //BA.debugLineNum = 161480706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161480707;
 //BA.debugLineNum = 161480707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _settransparent(b4j.example.vmlabel __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "settransparent", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "settransparent", new Object[] {_b}));}
RDebugUtils.currentLine=161546240;
 //BA.debugLineNum = 161546240;BA.debugLine="Sub SetTransparent(b As Boolean) As VMLabel";
RDebugUtils.currentLine=161546241;
 //BA.debugLineNum = 161546241;BA.debugLine="Label.SetTransparent(b)";
__ref._label /*b4j.example.vmelement*/ ._settransparent /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=161546242;
 //BA.debugLineNum = 161546242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161546243;
 //BA.debugLineNum = 161546243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmlabel  _setverticalalignmiddle(b4j.example.vmlabel __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmlabel";
if (Debug.shouldDelegate(ba, "setverticalalignmiddle", true))
	 {return ((b4j.example.vmlabel) Debug.delegate(ba, "setverticalalignmiddle", null));}
RDebugUtils.currentLine=161611776;
 //BA.debugLineNum = 161611776;BA.debugLine="Sub SetVerticalAlignMiddle As VMLabel";
RDebugUtils.currentLine=161611777;
 //BA.debugLineNum = 161611777;BA.debugLine="Label.SetVerticalAlignMiddle";
__ref._label /*b4j.example.vmelement*/ ._setverticalalignmiddle /*b4j.example.vmelement*/ (null);
RDebugUtils.currentLine=161611778;
 //BA.debugLineNum = 161611778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmlabel)(this);
RDebugUtils.currentLine=161611779;
 //BA.debugLineNum = 161611779;BA.debugLine="End Sub";
return null;
}
}