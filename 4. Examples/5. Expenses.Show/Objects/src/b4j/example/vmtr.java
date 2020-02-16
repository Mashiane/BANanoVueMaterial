package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtr extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtr", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtr.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _tr = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _hascontent = false;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmtr  _initialize(b4j.example.vmtr __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _parentid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_parentid}));}
RDebugUtils.currentLine=224329728;
 //BA.debugLineNum = 224329728;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=224329729;
 //BA.debugLineNum = 224329729;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=224329730;
 //BA.debugLineNum = 224329730;BA.debugLine="TR.Initialize(v, ID)";
__ref._tr /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=224329731;
 //BA.debugLineNum = 224329731;BA.debugLine="TR.SetTag(\"md-table-row\")";
__ref._tr /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-table-row");
RDebugUtils.currentLine=224329732;
 //BA.debugLineNum = 224329732;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=224329733;
 //BA.debugLineNum = 224329733;BA.debugLine="HasContent = False";
__ref._hascontent /*boolean*/  = __c.False;
RDebugUtils.currentLine=224329734;
 //BA.debugLineNum = 224329734;BA.debugLine="SetSlot(\"md-table-row\")";
__ref._setslot /*b4j.example.vmtr*/ (null,"md-table-row");
RDebugUtils.currentLine=224329735;
 //BA.debugLineNum = 224329735;BA.debugLine="SetSlotScope(\"{ item }\")";
__ref._setslotscope /*b4j.example.vmtr*/ (null,"{ item }");
RDebugUtils.currentLine=224329736;
 //BA.debugLineNum = 224329736;BA.debugLine="TR.RemoveAttr(\":required\")";
__ref._tr /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=224329737;
 //BA.debugLineNum = 224329737;BA.debugLine="TR.RemoveAttr(\":disabled\")";
__ref._tr /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=224329738;
 //BA.debugLineNum = 224329738;BA.debugLine="TR.RemoveAttr(\"v-show\")";
__ref._tr /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"v-show");
RDebugUtils.currentLine=224329739;
 //BA.debugLineNum = 224329739;BA.debugLine="TR.RemoveAttr(\"ref\")";
__ref._tr /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"ref");
RDebugUtils.currentLine=224329740;
 //BA.debugLineNum = 224329740;BA.debugLine="TR.RemoveAttr(\"id\")";
__ref._tr /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"id");
RDebugUtils.currentLine=224329741;
 //BA.debugLineNum = 224329741;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224329742;
 //BA.debugLineNum = 224329742;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setautoselect(b4j.example.vmtr __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setautoselect", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setautoselect", new Object[] {_b}));}
String _pp = "";
RDebugUtils.currentLine=224591872;
 //BA.debugLineNum = 224591872;BA.debugLine="Sub SetAutoSelect(b As Boolean) As VMTR";
RDebugUtils.currentLine=224591873;
 //BA.debugLineNum = 224591873;BA.debugLine="Dim pp As String = $\"${ID}autoselect\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"autoselect");
RDebugUtils.currentLine=224591874;
 //BA.debugLineNum = 224591874;BA.debugLine="vue.SetStateSingle(pp, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_b));
RDebugUtils.currentLine=224591875;
 //BA.debugLineNum = 224591875;BA.debugLine="If b Then SetAttr(CreateMap(\":md-auto-select\":pp)";
if (_b) { 
__ref._setattr /*b4j.example.vmtr*/ (null,__c.createMap(new Object[] {(Object)(":md-auto-select"),(Object)(_pp)}));};
RDebugUtils.currentLine=224591876;
 //BA.debugLineNum = 224591876;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224591877;
 //BA.debugLineNum = 224591877;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setselectablemultiple(b4j.example.vmtr __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setselectablemultiple", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setselectablemultiple", new Object[] {_b}));}
RDebugUtils.currentLine=224526336;
 //BA.debugLineNum = 224526336;BA.debugLine="Sub SetSelectableMultiple(b As Boolean) As VMTR";
RDebugUtils.currentLine=224526337;
 //BA.debugLineNum = 224526337;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtr)(this);};
RDebugUtils.currentLine=224526338;
 //BA.debugLineNum = 224526338;BA.debugLine="SetSelectable(\"multiple\")";
__ref._setselectable /*b4j.example.vmtr*/ (null,"multiple");
RDebugUtils.currentLine=224526339;
 //BA.debugLineNum = 224526339;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224526340;
 //BA.debugLineNum = 224526340;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setselectablesingle(b4j.example.vmtr __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setselectablesingle", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setselectablesingle", new Object[] {_b}));}
RDebugUtils.currentLine=224460800;
 //BA.debugLineNum = 224460800;BA.debugLine="Sub SetSelectableSingle(b As Boolean) As VMTR";
RDebugUtils.currentLine=224460801;
 //BA.debugLineNum = 224460801;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtr)(this);};
RDebugUtils.currentLine=224460802;
 //BA.debugLineNum = 224460802;BA.debugLine="SetSelectable(\"single\")";
__ref._setselectable /*b4j.example.vmtr*/ (null,"single");
RDebugUtils.currentLine=224460803;
 //BA.debugLineNum = 224460803;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224460804;
 //BA.debugLineNum = 224460804;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmtr __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=225443840;
 //BA.debugLineNum = 225443840;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=225443841;
 //BA.debugLineNum = 225443841;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=225443842;
 //BA.debugLineNum = 225443842;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtr  _addchild(b4j.example.vmtr __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=225181696;
 //BA.debugLineNum = 225181696;BA.debugLine="Sub AddChild(child As VMElement) As VMTR";
RDebugUtils.currentLine=225181697;
 //BA.debugLineNum = 225181697;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=225181698;
 //BA.debugLineNum = 225181698;BA.debugLine="TR.SetText(childHTML)";
__ref._tr /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=225181699;
 //BA.debugLineNum = 225181699;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=225181700;
 //BA.debugLineNum = 225181700;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=225181701;
 //BA.debugLineNum = 225181701;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmtr __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=225705984;
 //BA.debugLineNum = 225705984;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=225705985;
 //BA.debugLineNum = 225705985;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=225705986;
 //BA.debugLineNum = 225705986;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmtr*/ (null,_childx);
 }
};
RDebugUtils.currentLine=225705988;
 //BA.debugLineNum = 225705988;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=225705989;
 //BA.debugLineNum = 225705989;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtr  _addclass(b4j.example.vmtr __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=225509376;
 //BA.debugLineNum = 225509376;BA.debugLine="Sub AddClass(c As String) As VMTR";
RDebugUtils.currentLine=225509377;
 //BA.debugLineNum = 225509377;BA.debugLine="TR.AddClass(c)";
__ref._tr /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=225509378;
 //BA.debugLineNum = 225509378;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=225509379;
 //BA.debugLineNum = 225509379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=225509380;
 //BA.debugLineNum = 225509380;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmtr __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
RDebugUtils.currentLine=224264192;
 //BA.debugLineNum = 224264192;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=224264193;
 //BA.debugLineNum = 224264193;BA.debugLine="Public TR As VMElement";
_tr = new b4j.example.vmelement();
RDebugUtils.currentLine=224264194;
 //BA.debugLineNum = 224264194;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=224264195;
 //BA.debugLineNum = 224264195;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=224264196;
 //BA.debugLineNum = 224264196;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=224264197;
 //BA.debugLineNum = 224264197;BA.debugLine="Public HasContent As Boolean";
_hascontent = false;
RDebugUtils.currentLine=224264198;
 //BA.debugLineNum = 224264198;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtr  _setslot(b4j.example.vmtr __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setslot", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setslot", new Object[] {_s}));}
RDebugUtils.currentLine=224657408;
 //BA.debugLineNum = 224657408;BA.debugLine="Sub SetSlot(s As String) As VMTR";
RDebugUtils.currentLine=224657409;
 //BA.debugLineNum = 224657409;BA.debugLine="SetAttr(CreateMap(\"slot\":s))";
__ref._setattr /*b4j.example.vmtr*/ (null,__c.createMap(new Object[] {(Object)("slot"),(Object)(_s)}));
RDebugUtils.currentLine=224657410;
 //BA.debugLineNum = 224657410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224657411;
 //BA.debugLineNum = 224657411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setslotscope(b4j.example.vmtr __ref,String _sc) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setslotscope", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setslotscope", new Object[] {_sc}));}
RDebugUtils.currentLine=224788480;
 //BA.debugLineNum = 224788480;BA.debugLine="Sub SetSlotScope(sc As String) As VMTR";
RDebugUtils.currentLine=224788481;
 //BA.debugLineNum = 224788481;BA.debugLine="SetAttr(CreateMap(\"slot-scope\": sc))";
__ref._setattr /*b4j.example.vmtr*/ (null,__c.createMap(new Object[] {(Object)("slot-scope"),(Object)(_sc)}));
RDebugUtils.currentLine=224788482;
 //BA.debugLineNum = 224788482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224788483;
 //BA.debugLineNum = 224788483;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmtr __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=224854016;
 //BA.debugLineNum = 224854016;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=224854017;
 //BA.debugLineNum = 224854017;BA.debugLine="TR.RemoveAttr(\"v-show\")";
__ref._tr /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"v-show");
RDebugUtils.currentLine=224854018;
 //BA.debugLineNum = 224854018;BA.debugLine="Return TR.ToString";
if (true) return __ref._tr /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=224854019;
 //BA.debugLineNum = 224854019;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmtr __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=225116160;
 //BA.debugLineNum = 225116160;BA.debugLine="Sub Render";
RDebugUtils.currentLine=225116161;
 //BA.debugLineNum = 225116161;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=225116162;
 //BA.debugLineNum = 225116162;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtr  _setaccent(b4j.example.vmtr __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=225378304;
 //BA.debugLineNum = 225378304;BA.debugLine="Sub SetAccent(b As Boolean) As VMTR";
RDebugUtils.currentLine=225378305;
 //BA.debugLineNum = 225378305;BA.debugLine="TR.SetAccent(True)";
__ref._tr /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=225378306;
 //BA.debugLineNum = 225378306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=225378307;
 //BA.debugLineNum = 225378307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setattr(b4j.example.vmtr __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=225574912;
 //BA.debugLineNum = 225574912;BA.debugLine="Sub SetAttr(attr As Map) As VMTR";
RDebugUtils.currentLine=225574913;
 //BA.debugLineNum = 225574913;BA.debugLine="TR.SetAttr(attr)";
__ref._tr /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=225574914;
 //BA.debugLineNum = 225574914;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=225574915;
 //BA.debugLineNum = 225574915;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=225574916;
 //BA.debugLineNum = 225574916;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setpadding(b4j.example.vmtr __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=225771520;
 //BA.debugLineNum = 225771520;BA.debugLine="Sub SetPadding(p As Object) As VMTR";
RDebugUtils.currentLine=225771521;
 //BA.debugLineNum = 225771521;BA.debugLine="TR.SetPaddingAll(p)";
__ref._tr /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=225771522;
 //BA.debugLineNum = 225771522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=225771523;
 //BA.debugLineNum = 225771523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setprimary(b4j.example.vmtr __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=225312768;
 //BA.debugLineNum = 225312768;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTR";
RDebugUtils.currentLine=225312769;
 //BA.debugLineNum = 225312769;BA.debugLine="TR.SetPrimary(True)";
__ref._tr /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=225312770;
 //BA.debugLineNum = 225312770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=225312771;
 //BA.debugLineNum = 225312771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setselectable(b4j.example.vmtr __ref,String _sel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setselectable", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setselectable", new Object[] {_sel}));}
String _pp = "";
RDebugUtils.currentLine=224395264;
 //BA.debugLineNum = 224395264;BA.debugLine="Sub SetSelectable(sel As String) As VMTR";
RDebugUtils.currentLine=224395265;
 //BA.debugLineNum = 224395265;BA.debugLine="Dim pp As String = $\"${ID}selectable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"selectable");
RDebugUtils.currentLine=224395266;
 //BA.debugLineNum = 224395266;BA.debugLine="vue.SetStateSingle(pp, sel)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_sel));
RDebugUtils.currentLine=224395267;
 //BA.debugLineNum = 224395267;BA.debugLine="SetAttr(CreateMap(\":md-selectable\":pp))";
__ref._setattr /*b4j.example.vmtr*/ (null,__c.createMap(new Object[] {(Object)(":md-selectable"),(Object)(_pp)}));
RDebugUtils.currentLine=224395268;
 //BA.debugLineNum = 224395268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224395269;
 //BA.debugLineNum = 224395269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setslottablerow(b4j.example.vmtr __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setslottablerow", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setslottablerow", new Object[] {_b}));}
RDebugUtils.currentLine=224722944;
 //BA.debugLineNum = 224722944;BA.debugLine="Sub SetSlotTableRow(b As Boolean) As VMTR";
RDebugUtils.currentLine=224722945;
 //BA.debugLineNum = 224722945;BA.debugLine="If b Then SetSlot(\"md-table-row\")";
if (_b) { 
__ref._setslot /*b4j.example.vmtr*/ (null,"md-table-row");};
RDebugUtils.currentLine=224722946;
 //BA.debugLineNum = 224722946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224722947;
 //BA.debugLineNum = 224722947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setstyle(b4j.example.vmtr __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=225640448;
 //BA.debugLineNum = 225640448;BA.debugLine="Sub SetStyle(sm As Map) As VMTR";
RDebugUtils.currentLine=225640449;
 //BA.debugLineNum = 225640449;BA.debugLine="TR.SetStyle(sm)";
__ref._tr /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=225640450;
 //BA.debugLineNum = 225640450;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=225640451;
 //BA.debugLineNum = 225640451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=225640452;
 //BA.debugLineNum = 225640452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _settext(b4j.example.vmtr __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=225247232;
 //BA.debugLineNum = 225247232;BA.debugLine="Sub SetText(t As Object) As VMTR";
RDebugUtils.currentLine=225247233;
 //BA.debugLineNum = 225247233;BA.debugLine="TR.SetText(t)";
__ref._tr /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=225247234;
 //BA.debugLineNum = 225247234;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=225247235;
 //BA.debugLineNum = 225247235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=225247236;
 //BA.debugLineNum = 225247236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setvif(b4j.example.vmtr __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=224985088;
 //BA.debugLineNum = 224985088;BA.debugLine="Sub SetVIf(vif As Object) As VMTR";
RDebugUtils.currentLine=224985089;
 //BA.debugLineNum = 224985089;BA.debugLine="TR.SetVIf(vif)";
__ref._tr /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=224985090;
 //BA.debugLineNum = 224985090;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=224985091;
 //BA.debugLineNum = 224985091;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224985092;
 //BA.debugLineNum = 224985092;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setvmodel(b4j.example.vmtr __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=224919552;
 //BA.debugLineNum = 224919552;BA.debugLine="Sub SetVModel(k As String) As VMTR";
RDebugUtils.currentLine=224919553;
 //BA.debugLineNum = 224919553;BA.debugLine="TR.SetVModel(k)";
__ref._tr /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=224919554;
 //BA.debugLineNum = 224919554;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=224919555;
 //BA.debugLineNum = 224919555;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=224919556;
 //BA.debugLineNum = 224919556;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtr  _setvshow(b4j.example.vmtr __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtr";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtr) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=225050624;
 //BA.debugLineNum = 225050624;BA.debugLine="Sub SetVShow(vif As Object) As VMTR";
RDebugUtils.currentLine=225050625;
 //BA.debugLineNum = 225050625;BA.debugLine="TR.SetVShow(vif)";
__ref._tr /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=225050626;
 //BA.debugLineNum = 225050626;BA.debugLine="HasContent = True";
__ref._hascontent /*boolean*/  = __c.True;
RDebugUtils.currentLine=225050627;
 //BA.debugLineNum = 225050627;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtr)(this);
RDebugUtils.currentLine=225050628;
 //BA.debugLineNum = 225050628;BA.debugLine="End Sub";
return null;
}
}