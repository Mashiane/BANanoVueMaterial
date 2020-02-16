package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtooltip extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtooltip", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtooltip.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _tooltip = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _bactive = false;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmtooltip  _initialize(b4j.example.vmtooltip __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=222691328;
 //BA.debugLineNum = 222691328;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=222691329;
 //BA.debugLineNum = 222691329;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=222691330;
 //BA.debugLineNum = 222691330;BA.debugLine="Tooltip.Initialize(v, ID)";
__ref._tooltip /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=222691331;
 //BA.debugLineNum = 222691331;BA.debugLine="Tooltip.SetTag(\"md-tooltip\")";
__ref._tooltip /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-tooltip");
RDebugUtils.currentLine=222691332;
 //BA.debugLineNum = 222691332;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=222691333;
 //BA.debugLineNum = 222691333;BA.debugLine="bActive = False";
__ref._bactive /*boolean*/  = __c.False;
RDebugUtils.currentLine=222691334;
 //BA.debugLineNum = 222691334;BA.debugLine="If ID <> \"\" Then";
if ((__ref._id /*String*/ ).equals("") == false) { 
RDebugUtils.currentLine=222691335;
 //BA.debugLineNum = 222691335;BA.debugLine="SetActiveSync(ID)";
__ref._setactivesync /*b4j.example.vmtooltip*/ (null,__ref._id /*String*/ );
 };
RDebugUtils.currentLine=222691337;
 //BA.debugLineNum = 222691337;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=222691338;
 //BA.debugLineNum = 222691338;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _settext(b4j.example.vmtooltip __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=223215616;
 //BA.debugLineNum = 223215616;BA.debugLine="Sub SetText(t As Object) As VMTooltip";
RDebugUtils.currentLine=223215617;
 //BA.debugLineNum = 223215617;BA.debugLine="Tooltip.SetText(t)";
__ref._tooltip /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=223215618;
 //BA.debugLineNum = 223215618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223215619;
 //BA.debugLineNum = 223215619;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmtooltip __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=223412224;
 //BA.debugLineNum = 223412224;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=223412225;
 //BA.debugLineNum = 223412225;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=223412226;
 //BA.debugLineNum = 223412226;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _setdirectionbottom(b4j.example.vmtooltip __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setdirectionbottom", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setdirectionbottom", new Object[] {_b}));}
RDebugUtils.currentLine=224002048;
 //BA.debugLineNum = 224002048;BA.debugLine="Sub SetDirectionBottom(b As Boolean) As VMTooltip";
RDebugUtils.currentLine=224002049;
 //BA.debugLineNum = 224002049;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"bottom\"))";
__ref._setattr /*b4j.example.vmtooltip*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),(Object)("bottom")}));
RDebugUtils.currentLine=224002050;
 //BA.debugLineNum = 224002050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=224002051;
 //BA.debugLineNum = 224002051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdirectionleft(b4j.example.vmtooltip __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setdirectionleft", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setdirectionleft", new Object[] {_b}));}
RDebugUtils.currentLine=224067584;
 //BA.debugLineNum = 224067584;BA.debugLine="Sub SetDirectionLeft(b As Boolean) As VMTooltip";
RDebugUtils.currentLine=224067585;
 //BA.debugLineNum = 224067585;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"left\"))";
__ref._setattr /*b4j.example.vmtooltip*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),(Object)("left")}));
RDebugUtils.currentLine=224067586;
 //BA.debugLineNum = 224067586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=224067587;
 //BA.debugLineNum = 224067587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdirectionright(b4j.example.vmtooltip __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setdirectionright", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setdirectionright", new Object[] {_b}));}
RDebugUtils.currentLine=223936512;
 //BA.debugLineNum = 223936512;BA.debugLine="Sub SetDirectionRight(b As Boolean) As VMTooltip";
RDebugUtils.currentLine=223936513;
 //BA.debugLineNum = 223936513;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"right\"))";
__ref._setattr /*b4j.example.vmtooltip*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),(Object)("right")}));
RDebugUtils.currentLine=223936514;
 //BA.debugLineNum = 223936514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223936515;
 //BA.debugLineNum = 223936515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdirectiontop(b4j.example.vmtooltip __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setdirectiontop", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setdirectiontop", new Object[] {_b}));}
RDebugUtils.currentLine=223870976;
 //BA.debugLineNum = 223870976;BA.debugLine="Sub SetDirectionTop(b As Boolean) As VMTooltip";
RDebugUtils.currentLine=223870977;
 //BA.debugLineNum = 223870977;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"top\"))";
__ref._setattr /*b4j.example.vmtooltip*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),(Object)("top")}));
RDebugUtils.currentLine=223870978;
 //BA.debugLineNum = 223870978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223870979;
 //BA.debugLineNum = 223870979;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmtooltip __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=222822400;
 //BA.debugLineNum = 222822400;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=222822401;
 //BA.debugLineNum = 222822401;BA.debugLine="Return Tooltip.ToString";
if (true) return __ref._tooltip /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=222822402;
 //BA.debugLineNum = 222822402;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _addchild(b4j.example.vmtooltip __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=223150080;
 //BA.debugLineNum = 223150080;BA.debugLine="Sub AddChild(child As VMElement) As VMTooltip";
RDebugUtils.currentLine=223150081;
 //BA.debugLineNum = 223150081;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=223150082;
 //BA.debugLineNum = 223150082;BA.debugLine="Tooltip.SetText(childHTML)";
__ref._tooltip /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=223150083;
 //BA.debugLineNum = 223150083;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223150084;
 //BA.debugLineNum = 223150084;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmtooltip __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=223674368;
 //BA.debugLineNum = 223674368;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=223674369;
 //BA.debugLineNum = 223674369;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=223674370;
 //BA.debugLineNum = 223674370;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmtooltip*/ (null,_childx);
 }
};
RDebugUtils.currentLine=223674372;
 //BA.debugLineNum = 223674372;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _addclass(b4j.example.vmtooltip __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=223477760;
 //BA.debugLineNum = 223477760;BA.debugLine="Sub AddClass(c As String) As VMTooltip";
RDebugUtils.currentLine=223477761;
 //BA.debugLineNum = 223477761;BA.debugLine="Tooltip.AddClass(c)";
__ref._tooltip /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=223477762;
 //BA.debugLineNum = 223477762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223477763;
 //BA.debugLineNum = 223477763;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmtooltip __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
RDebugUtils.currentLine=222625792;
 //BA.debugLineNum = 222625792;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=222625793;
 //BA.debugLineNum = 222625793;BA.debugLine="Public Tooltip As VMElement";
_tooltip = new b4j.example.vmelement();
RDebugUtils.currentLine=222625794;
 //BA.debugLineNum = 222625794;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=222625795;
 //BA.debugLineNum = 222625795;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=222625796;
 //BA.debugLineNum = 222625796;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=222625797;
 //BA.debugLineNum = 222625797;BA.debugLine="Private bActive As Boolean";
_bactive = false;
RDebugUtils.currentLine=222625798;
 //BA.debugLineNum = 222625798;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _setactivesync(b4j.example.vmtooltip __ref,String _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setactivesync", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setactivesync", new Object[] {_v}));}
RDebugUtils.currentLine=222756864;
 //BA.debugLineNum = 222756864;BA.debugLine="private Sub SetActiveSync(v As String) As VMToolti";
RDebugUtils.currentLine=222756865;
 //BA.debugLineNum = 222756865;BA.debugLine="Tooltip.SetActiveSync(v)";
__ref._tooltip /*b4j.example.vmelement*/ ._setactivesync /*b4j.example.vmelement*/ (null,_v);
RDebugUtils.currentLine=222756866;
 //BA.debugLineNum = 222756866;BA.debugLine="bActive = True";
__ref._bactive /*boolean*/  = __c.True;
RDebugUtils.currentLine=222756867;
 //BA.debugLineNum = 222756867;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=222756868;
 //BA.debugLineNum = 222756868;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmtooltip __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=223084544;
 //BA.debugLineNum = 223084544;BA.debugLine="Sub Render";
RDebugUtils.currentLine=223084545;
 //BA.debugLineNum = 223084545;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=223084546;
 //BA.debugLineNum = 223084546;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtooltip  _setaccent(b4j.example.vmtooltip __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=223346688;
 //BA.debugLineNum = 223346688;BA.debugLine="Sub SetAccent(b As Boolean) As VMTooltip";
RDebugUtils.currentLine=223346689;
 //BA.debugLineNum = 223346689;BA.debugLine="Tooltip.SetAccent(True)";
__ref._tooltip /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=223346690;
 //BA.debugLineNum = 223346690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223346691;
 //BA.debugLineNum = 223346691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setactive(b4j.example.vmtooltip __ref,Object _varactive) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setactive", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setactive", new Object[] {_varactive}));}
RDebugUtils.currentLine=224198656;
 //BA.debugLineNum = 224198656;BA.debugLine="Sub SetActive(varActive As Object) As VMTooltip";
RDebugUtils.currentLine=224198657;
 //BA.debugLineNum = 224198657;BA.debugLine="SetAttr(CreateMap(\"md-active\": varActive))";
__ref._setattr /*b4j.example.vmtooltip*/ (null,__c.createMap(new Object[] {(Object)("md-active"),_varactive}));
RDebugUtils.currentLine=224198658;
 //BA.debugLineNum = 224198658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=224198659;
 //BA.debugLineNum = 224198659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setattr(b4j.example.vmtooltip __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=223543296;
 //BA.debugLineNum = 223543296;BA.debugLine="Sub SetAttr(attr As Map) As VMTooltip";
RDebugUtils.currentLine=223543297;
 //BA.debugLineNum = 223543297;BA.debugLine="Tooltip.SetAttr(attr)";
__ref._tooltip /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=223543298;
 //BA.debugLineNum = 223543298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223543299;
 //BA.debugLineNum = 223543299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdelay(b4j.example.vmtooltip __ref,Object _vardelay) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setdelay", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setdelay", new Object[] {_vardelay}));}
RDebugUtils.currentLine=224133120;
 //BA.debugLineNum = 224133120;BA.debugLine="Sub SetDelay(varDelay As Object) As VMTooltip";
RDebugUtils.currentLine=224133121;
 //BA.debugLineNum = 224133121;BA.debugLine="SetAttr(CreateMap(\"md-delay\": varDelay))";
__ref._setattr /*b4j.example.vmtooltip*/ (null,__c.createMap(new Object[] {(Object)("md-delay"),_vardelay}));
RDebugUtils.currentLine=224133122;
 //BA.debugLineNum = 224133122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=224133123;
 //BA.debugLineNum = 224133123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setdirection(b4j.example.vmtooltip __ref,Object _vardirection) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setdirection", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setdirection", new Object[] {_vardirection}));}
RDebugUtils.currentLine=223805440;
 //BA.debugLineNum = 223805440;BA.debugLine="Sub SetDirection(varDirection As Object) As VMTool";
RDebugUtils.currentLine=223805441;
 //BA.debugLineNum = 223805441;BA.debugLine="SetAttr(CreateMap(\"md-direction\": varDirection))";
__ref._setattr /*b4j.example.vmtooltip*/ (null,__c.createMap(new Object[] {(Object)("md-direction"),_vardirection}));
RDebugUtils.currentLine=223805442;
 //BA.debugLineNum = 223805442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223805443;
 //BA.debugLineNum = 223805443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setpadding(b4j.example.vmtooltip __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=223739904;
 //BA.debugLineNum = 223739904;BA.debugLine="Sub SetPadding(p As Object) As VMTooltip";
RDebugUtils.currentLine=223739905;
 //BA.debugLineNum = 223739905;BA.debugLine="Tooltip.SetPaddingAll(p)";
__ref._tooltip /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=223739906;
 //BA.debugLineNum = 223739906;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223739907;
 //BA.debugLineNum = 223739907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setprimary(b4j.example.vmtooltip __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=223281152;
 //BA.debugLineNum = 223281152;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTooltip";
RDebugUtils.currentLine=223281153;
 //BA.debugLineNum = 223281153;BA.debugLine="Tooltip.SetPrimary(True)";
__ref._tooltip /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=223281154;
 //BA.debugLineNum = 223281154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223281155;
 //BA.debugLineNum = 223281155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setstyle(b4j.example.vmtooltip __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=223608832;
 //BA.debugLineNum = 223608832;BA.debugLine="Sub SetStyle(sm As Map) As VMTooltip";
RDebugUtils.currentLine=223608833;
 //BA.debugLineNum = 223608833;BA.debugLine="Tooltip.SetStyle(sm)";
__ref._tooltip /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=223608834;
 //BA.debugLineNum = 223608834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223608835;
 //BA.debugLineNum = 223608835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvif(b4j.example.vmtooltip __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=222953472;
 //BA.debugLineNum = 222953472;BA.debugLine="Sub SetVIf(vif As Object) As VMTooltip";
RDebugUtils.currentLine=222953473;
 //BA.debugLineNum = 222953473;BA.debugLine="Tooltip.SetVIf(vif)";
__ref._tooltip /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=222953474;
 //BA.debugLineNum = 222953474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=222953475;
 //BA.debugLineNum = 222953475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvmodel(b4j.example.vmtooltip __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=222887936;
 //BA.debugLineNum = 222887936;BA.debugLine="Sub SetVModel(k As String) As VMTooltip";
RDebugUtils.currentLine=222887937;
 //BA.debugLineNum = 222887937;BA.debugLine="Tooltip.SetVModel(k)";
__ref._tooltip /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=222887938;
 //BA.debugLineNum = 222887938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=222887939;
 //BA.debugLineNum = 222887939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtooltip  _setvshow(b4j.example.vmtooltip __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtooltip";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtooltip) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=223019008;
 //BA.debugLineNum = 223019008;BA.debugLine="Sub SetVShow(vif As Object) As VMTooltip";
RDebugUtils.currentLine=223019009;
 //BA.debugLineNum = 223019009;BA.debugLine="Tooltip.SetVShow(vif)";
__ref._tooltip /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=223019010;
 //BA.debugLineNum = 223019010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtooltip)(this);
RDebugUtils.currentLine=223019011;
 //BA.debugLineNum = 223019011;BA.debugLine="End Sub";
return null;
}
}