package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmrow extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmrow", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmrow.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _row = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmrow  _initialize(b4j.example.vmrow __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=189792256;
 //BA.debugLineNum = 189792256;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=189792257;
 //BA.debugLineNum = 189792257;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=189792258;
 //BA.debugLineNum = 189792258;BA.debugLine="Row.Initialize(v, ID)";
__ref._row /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=189792259;
 //BA.debugLineNum = 189792259;BA.debugLine="Row.SetTag(\"div\").AddClass(\"md-layout\")";
__ref._row /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"div")._addclass /*b4j.example.vmelement*/ (null,"md-layout");
RDebugUtils.currentLine=189792260;
 //BA.debugLineNum = 189792260;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=189792261;
 //BA.debugLineNum = 189792261;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=189792262;
 //BA.debugLineNum = 189792262;BA.debugLine="End Sub";
return null;
}
public String  _addbr(b4j.example.vmrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "addbr", true))
	 {return ((String) Debug.delegate(ba, "addbr", null));}
RDebugUtils.currentLine=189857792;
 //BA.debugLineNum = 189857792;BA.debugLine="Sub AddBR";
RDebugUtils.currentLine=189857793;
 //BA.debugLineNum = 189857793;BA.debugLine="SetText(\"<br>\")";
__ref._settext /*b4j.example.vmrow*/ (null,(Object)("<br>"));
RDebugUtils.currentLine=189857794;
 //BA.debugLineNum = 189857794;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _settext(b4j.example.vmrow __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=190775296;
 //BA.debugLineNum = 190775296;BA.debugLine="Sub SetText(t As Object) As VMRow";
RDebugUtils.currentLine=190775297;
 //BA.debugLineNum = 190775297;BA.debugLine="Row.SetText(t)";
__ref._row /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=190775298;
 //BA.debugLineNum = 190775298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190775299;
 //BA.debugLineNum = 190775299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _addchild(b4j.example.vmrow __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=190709760;
 //BA.debugLineNum = 190709760;BA.debugLine="Sub AddChild(child As VMElement) As VMRow";
RDebugUtils.currentLine=190709761;
 //BA.debugLineNum = 190709761;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=190709762;
 //BA.debugLineNum = 190709762;BA.debugLine="Row.SetText(childHTML)";
__ref._row /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=190709763;
 //BA.debugLineNum = 190709763;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190709764;
 //BA.debugLineNum = 190709764;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmrow __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=191365120;
 //BA.debugLineNum = 191365120;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=191365121;
 //BA.debugLineNum = 191365121;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=191365122;
 //BA.debugLineNum = 191365122;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmrow*/ (null,_childx);
 }
};
RDebugUtils.currentLine=191365124;
 //BA.debugLineNum = 191365124;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _addclass(b4j.example.vmrow __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=191037440;
 //BA.debugLineNum = 191037440;BA.debugLine="Sub AddClass(c As String) As VMRow";
RDebugUtils.currentLine=191037441;
 //BA.debugLineNum = 191037441;BA.debugLine="Row.AddClass(c)";
__ref._row /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=191037442;
 //BA.debugLineNum = 191037442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=191037443;
 //BA.debugLineNum = 191037443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _addelements(b4j.example.vmrow __ref,anywheresoftware.b4a.objects.collections.List _lst) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "addelements", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "addelements", new Object[] {_lst}));}
RDebugUtils.currentLine=189988864;
 //BA.debugLineNum = 189988864;BA.debugLine="Sub AddElements(lst As List) As VMRow";
RDebugUtils.currentLine=189988865;
 //BA.debugLineNum = 189988865;BA.debugLine="Row.AddElements(lst)";
__ref._row /*b4j.example.vmelement*/ ._addelements /*String*/ (null,_lst);
RDebugUtils.currentLine=189988866;
 //BA.debugLineNum = 189988866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=189988867;
 //BA.debugLineNum = 189988867;BA.debugLine="End Sub";
return null;
}
public String  _addhr(b4j.example.vmrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "addhr", true))
	 {return ((String) Debug.delegate(ba, "addhr", null));}
RDebugUtils.currentLine=189923328;
 //BA.debugLineNum = 189923328;BA.debugLine="Sub AddHR";
RDebugUtils.currentLine=189923329;
 //BA.debugLineNum = 189923329;BA.debugLine="SetText(\"<hr>\")";
__ref._settext /*b4j.example.vmrow*/ (null,(Object)("<hr>"));
RDebugUtils.currentLine=189923330;
 //BA.debugLineNum = 189923330;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
RDebugUtils.currentLine=189726720;
 //BA.debugLineNum = 189726720;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=189726721;
 //BA.debugLineNum = 189726721;BA.debugLine="Public Row As VMElement";
_row = new b4j.example.vmelement();
RDebugUtils.currentLine=189726722;
 //BA.debugLineNum = 189726722;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=189726723;
 //BA.debugLineNum = 189726723;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=189726724;
 //BA.debugLineNum = 189726724;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=189726725;
 //BA.debugLineNum = 189726725;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmrow __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=190971904;
 //BA.debugLineNum = 190971904;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=190971905;
 //BA.debugLineNum = 190971905;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=190971906;
 //BA.debugLineNum = 190971906;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=190382080;
 //BA.debugLineNum = 190382080;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=190382081;
 //BA.debugLineNum = 190382081;BA.debugLine="Return Row.ToString";
if (true) return __ref._row /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=190382082;
 //BA.debugLineNum = 190382082;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmrow __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=190644224;
 //BA.debugLineNum = 190644224;BA.debugLine="Sub Render";
RDebugUtils.currentLine=190644225;
 //BA.debugLineNum = 190644225;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=190644226;
 //BA.debugLineNum = 190644226;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmrow  _setaccent(b4j.example.vmrow __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=190906368;
 //BA.debugLineNum = 190906368;BA.debugLine="Sub SetAccent(b As Boolean) As VMRow";
RDebugUtils.currentLine=190906369;
 //BA.debugLineNum = 190906369;BA.debugLine="Row.SetAccent(True)";
__ref._row /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=190906370;
 //BA.debugLineNum = 190906370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190906371;
 //BA.debugLineNum = 190906371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignment(b4j.example.vmrow __ref,String _a) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setalignment", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setalignment", new Object[] {_a}));}
RDebugUtils.currentLine=190185472;
 //BA.debugLineNum = 190185472;BA.debugLine="Sub SetAlignment(a As String) As VMRow";
RDebugUtils.currentLine=190185473;
 //BA.debugLineNum = 190185473;BA.debugLine="Row.AddClass(a)";
__ref._row /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_a);
RDebugUtils.currentLine=190185474;
 //BA.debugLineNum = 190185474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190185475;
 //BA.debugLineNum = 190185475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignmenttopcenter(b4j.example.vmrow __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setalignmenttopcenter", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setalignmenttopcenter", new Object[] {_b}));}
RDebugUtils.currentLine=190251008;
 //BA.debugLineNum = 190251008;BA.debugLine="Sub SetAlignmentTopCenter(b As Boolean) As VMRow";
RDebugUtils.currentLine=190251009;
 //BA.debugLineNum = 190251009;BA.debugLine="SetAlignment(\"md-alignment-top-center\")";
__ref._setalignment /*b4j.example.vmrow*/ (null,"md-alignment-top-center");
RDebugUtils.currentLine=190251010;
 //BA.debugLineNum = 190251010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190251011;
 //BA.debugLineNum = 190251011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setalignmenttopleft(b4j.example.vmrow __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setalignmenttopleft", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setalignmenttopleft", new Object[] {_b}));}
RDebugUtils.currentLine=190316544;
 //BA.debugLineNum = 190316544;BA.debugLine="Sub SetAlignmentTopLeft(b As Boolean) As VMRow";
RDebugUtils.currentLine=190316545;
 //BA.debugLineNum = 190316545;BA.debugLine="SetAlignment(\"md-alignment-top-left\")";
__ref._setalignment /*b4j.example.vmrow*/ (null,"md-alignment-top-left");
RDebugUtils.currentLine=190316546;
 //BA.debugLineNum = 190316546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190316547;
 //BA.debugLineNum = 190316547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setattr(b4j.example.vmrow __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=191102976;
 //BA.debugLineNum = 191102976;BA.debugLine="Sub SetAttr(attr As Map) As VMRow";
RDebugUtils.currentLine=191102977;
 //BA.debugLineNum = 191102977;BA.debugLine="Row.SetAttr(attr)";
__ref._row /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=191102978;
 //BA.debugLineNum = 191102978;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=191102979;
 //BA.debugLineNum = 191102979;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setgutter(b4j.example.vmrow __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setgutter", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setgutter", new Object[] {_b}));}
RDebugUtils.currentLine=190054400;
 //BA.debugLineNum = 190054400;BA.debugLine="Sub SetGutter(b As Boolean) As VMRow";
RDebugUtils.currentLine=190054401;
 //BA.debugLineNum = 190054401;BA.debugLine="Row.SetGutter(True)";
__ref._row /*b4j.example.vmelement*/ ._setgutter /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=190054402;
 //BA.debugLineNum = 190054402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190054403;
 //BA.debugLineNum = 190054403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _sethidden(b4j.example.vmrow __ref,boolean _xsmall,boolean _small,boolean _medium,boolean _large,boolean _xlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "sethidden", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "sethidden", new Object[] {_xsmall,_small,_medium,_large,_xlarge}));}
RDebugUtils.currentLine=191234048;
 //BA.debugLineNum = 191234048;BA.debugLine="Sub SetHidden(xsmall As Boolean, small As Boolean,";
RDebugUtils.currentLine=191234049;
 //BA.debugLineNum = 191234049;BA.debugLine="Row.SetHidden(xsmall, small, medium, large, xlarg";
__ref._row /*b4j.example.vmelement*/ ._sethidden /*b4j.example.vmelement*/ (null,_xsmall,_small,_medium,_large,_xlarge);
RDebugUtils.currentLine=191234050;
 //BA.debugLineNum = 191234050;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=191234051;
 //BA.debugLineNum = 191234051;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setnowrap(b4j.example.vmrow __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setnowrap", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setnowrap", new Object[] {_b}));}
RDebugUtils.currentLine=190119936;
 //BA.debugLineNum = 190119936;BA.debugLine="Sub SetNoWrap(b As Boolean) As VMRow";
RDebugUtils.currentLine=190119937;
 //BA.debugLineNum = 190119937;BA.debugLine="If b Then Row.AddClass(\"md-layout-nowrap\")";
if (_b) { 
__ref._row /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"md-layout-nowrap");};
RDebugUtils.currentLine=190119938;
 //BA.debugLineNum = 190119938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190119939;
 //BA.debugLineNum = 190119939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setpadding(b4j.example.vmrow __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=191430656;
 //BA.debugLineNum = 191430656;BA.debugLine="Sub SetPadding(p As Object) As VMRow";
RDebugUtils.currentLine=191430657;
 //BA.debugLineNum = 191430657;BA.debugLine="Row.SetPaddingAll(p)";
__ref._row /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=191430658;
 //BA.debugLineNum = 191430658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=191430659;
 //BA.debugLineNum = 191430659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setprimary(b4j.example.vmrow __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=190840832;
 //BA.debugLineNum = 190840832;BA.debugLine="Sub SetPrimary(b As Boolean) As VMRow";
RDebugUtils.currentLine=190840833;
 //BA.debugLineNum = 190840833;BA.debugLine="Row.SetPrimary(True)";
__ref._row /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=190840834;
 //BA.debugLineNum = 190840834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190840835;
 //BA.debugLineNum = 190840835;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setsizes(b4j.example.vmrow __ref,int _xsmall,int _small,int _medium,int _large,int _xlarge) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setsizes", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setsizes", new Object[] {_xsmall,_small,_medium,_large,_xlarge}));}
RDebugUtils.currentLine=191299584;
 //BA.debugLineNum = 191299584;BA.debugLine="Sub SetSizes(xsmall As Int, small As Int, medium A";
RDebugUtils.currentLine=191299585;
 //BA.debugLineNum = 191299585;BA.debugLine="Row.SetSizes(xsmall, small, medium, large, xlarge";
__ref._row /*b4j.example.vmelement*/ ._setsizes /*b4j.example.vmelement*/ (null,_xsmall,_small,_medium,_large,_xlarge);
RDebugUtils.currentLine=191299586;
 //BA.debugLineNum = 191299586;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=191299587;
 //BA.debugLineNum = 191299587;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setstyle(b4j.example.vmrow __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=191168512;
 //BA.debugLineNum = 191168512;BA.debugLine="Sub SetStyle(sm As Map) As VMRow";
RDebugUtils.currentLine=191168513;
 //BA.debugLineNum = 191168513;BA.debugLine="Row.SetStyle(sm)";
__ref._row /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=191168514;
 //BA.debugLineNum = 191168514;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=191168515;
 //BA.debugLineNum = 191168515;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvif(b4j.example.vmrow __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=190513152;
 //BA.debugLineNum = 190513152;BA.debugLine="Sub SetVIf(vif As Object) As VMRow";
RDebugUtils.currentLine=190513153;
 //BA.debugLineNum = 190513153;BA.debugLine="Row.SetVIf(vif)";
__ref._row /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=190513154;
 //BA.debugLineNum = 190513154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190513155;
 //BA.debugLineNum = 190513155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvmodel(b4j.example.vmrow __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=190447616;
 //BA.debugLineNum = 190447616;BA.debugLine="Sub SetVModel(k As String) As VMRow";
RDebugUtils.currentLine=190447617;
 //BA.debugLineNum = 190447617;BA.debugLine="Row.SetVModel(k)";
__ref._row /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=190447618;
 //BA.debugLineNum = 190447618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190447619;
 //BA.debugLineNum = 190447619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmrow  _setvshow(b4j.example.vmrow __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmrow";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmrow) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=190578688;
 //BA.debugLineNum = 190578688;BA.debugLine="Sub SetVShow(vif As Object) As VMRow";
RDebugUtils.currentLine=190578689;
 //BA.debugLineNum = 190578689;BA.debugLine="Row.SetVShow(vif)";
__ref._row /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=190578690;
 //BA.debugLineNum = 190578690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmrow)(this);
RDebugUtils.currentLine=190578691;
 //BA.debugLineNum = 190578691;BA.debugLine="End Sub";
return null;
}
}