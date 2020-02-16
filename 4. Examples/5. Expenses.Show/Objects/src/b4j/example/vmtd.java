package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtd extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtd", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtd.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _td = null;
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
public b4j.example.vmtd  _initialize(b4j.example.vmtd __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=212140032;
 //BA.debugLineNum = 212140032;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=212140033;
 //BA.debugLineNum = 212140033;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=212140034;
 //BA.debugLineNum = 212140034;BA.debugLine="TD.Initialize(v, ID)";
__ref._td /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=212140035;
 //BA.debugLineNum = 212140035;BA.debugLine="TD.SetTag(\"md-table-cell\")";
__ref._td /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-table-cell");
RDebugUtils.currentLine=212140036;
 //BA.debugLineNum = 212140036;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=212140037;
 //BA.debugLineNum = 212140037;BA.debugLine="TD.RemoveAttr(\":required\")";
__ref._td /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=212140038;
 //BA.debugLineNum = 212140038;BA.debugLine="TD.RemoveAttr(\":disabled\")";
__ref._td /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":disabled");
RDebugUtils.currentLine=212140039;
 //BA.debugLineNum = 212140039;BA.debugLine="TD.RemoveAttr(\"v-show\")";
__ref._td /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"v-show");
RDebugUtils.currentLine=212140040;
 //BA.debugLineNum = 212140040;BA.debugLine="TD.RemoveAttr(\"ref\")";
__ref._td /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"ref");
RDebugUtils.currentLine=212140041;
 //BA.debugLineNum = 212140041;BA.debugLine="TD.RemoveAttr(\"id\")";
__ref._td /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"id");
RDebugUtils.currentLine=212140042;
 //BA.debugLineNum = 212140042;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212140043;
 //BA.debugLineNum = 212140043;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setlabel(b4j.example.vmtd __ref,String _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setlabel", new Object[] {_l}));}
RDebugUtils.currentLine=212467712;
 //BA.debugLineNum = 212467712;BA.debugLine="Sub SetLabel(l As String) As VMTD";
RDebugUtils.currentLine=212467713;
 //BA.debugLineNum = 212467713;BA.debugLine="SetAttr(CreateMap(\"md-label\":l))";
__ref._setattr /*b4j.example.vmtd*/ (null,__c.createMap(new Object[] {(Object)("md-label"),(Object)(_l)}));
RDebugUtils.currentLine=212467714;
 //BA.debugLineNum = 212467714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212467715;
 //BA.debugLineNum = 212467715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setsortby(b4j.example.vmtd __ref,String _i) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setsortby", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setsortby", new Object[] {_i}));}
RDebugUtils.currentLine=212402176;
 //BA.debugLineNum = 212402176;BA.debugLine="Sub SetSortBy(i As String) As VMTD";
RDebugUtils.currentLine=212402177;
 //BA.debugLineNum = 212402177;BA.debugLine="SetAttr(CreateMap(\"md-sort-by\":i))";
__ref._setattr /*b4j.example.vmtd*/ (null,__c.createMap(new Object[] {(Object)("md-sort-by"),(Object)(_i)}));
RDebugUtils.currentLine=212402178;
 //BA.debugLineNum = 212402178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212402179;
 //BA.debugLineNum = 212402179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setnumeric(b4j.example.vmtd __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setnumeric", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setnumeric", new Object[] {_b}));}
RDebugUtils.currentLine=212336640;
 //BA.debugLineNum = 212336640;BA.debugLine="Sub SetNumeric(b As Boolean) As VMTD";
RDebugUtils.currentLine=212336641;
 //BA.debugLineNum = 212336641;BA.debugLine="If b Then";
if (_b) { 
RDebugUtils.currentLine=212336642;
 //BA.debugLineNum = 212336642;BA.debugLine="SetAttr(CreateMap(\"md-numeric\":\"true\"))";
__ref._setattr /*b4j.example.vmtd*/ (null,__c.createMap(new Object[] {(Object)("md-numeric"),(Object)("true")}));
 };
RDebugUtils.currentLine=212336644;
 //BA.debugLineNum = 212336644;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212336645;
 //BA.debugLineNum = 212336645;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _settext(b4j.example.vmtd __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=212860928;
 //BA.debugLineNum = 212860928;BA.debugLine="Sub SetText(t As Object) As VMTD";
RDebugUtils.currentLine=212860929;
 //BA.debugLineNum = 212860929;BA.debugLine="TD.SetText(t)";
__ref._td /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=212860930;
 //BA.debugLineNum = 212860930;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212860931;
 //BA.debugLineNum = 212860931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setvshow(b4j.example.vmtd __ref,boolean _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
String _colshow = "";
RDebugUtils.currentLine=212664320;
 //BA.debugLineNum = 212664320;BA.debugLine="Sub SetVShow(vif As Boolean) As VMTD";
RDebugUtils.currentLine=212664321;
 //BA.debugLineNum = 212664321;BA.debugLine="Dim colShow As String = $\"${ID}show\"$";
_colshow = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"show");
RDebugUtils.currentLine=212664322;
 //BA.debugLineNum = 212664322;BA.debugLine="vue.SetStateSingle(colShow, vif)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_colshow,(Object)(_vif));
RDebugUtils.currentLine=212664323;
 //BA.debugLineNum = 212664323;BA.debugLine="TD.SetVShow(colShow)";
__ref._td /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_colshow);
RDebugUtils.currentLine=212664324;
 //BA.debugLineNum = 212664324;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212664325;
 //BA.debugLineNum = 212664325;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmtd __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=213057536;
 //BA.debugLineNum = 213057536;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=213057537;
 //BA.debugLineNum = 213057537;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=213057538;
 //BA.debugLineNum = 213057538;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtd  _addchild(b4j.example.vmtd __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=212795392;
 //BA.debugLineNum = 212795392;BA.debugLine="Sub AddChild(child As VMElement) As VMTD";
RDebugUtils.currentLine=212795393;
 //BA.debugLineNum = 212795393;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=212795394;
 //BA.debugLineNum = 212795394;BA.debugLine="TD.SetText(childHTML)";
__ref._td /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=212795395;
 //BA.debugLineNum = 212795395;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212795396;
 //BA.debugLineNum = 212795396;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmtd __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=213319680;
 //BA.debugLineNum = 213319680;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=213319681;
 //BA.debugLineNum = 213319681;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=213319682;
 //BA.debugLineNum = 213319682;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmtd*/ (null,_childx);
 }
};
RDebugUtils.currentLine=213319684;
 //BA.debugLineNum = 213319684;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtd  _addclass(b4j.example.vmtd __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=213123072;
 //BA.debugLineNum = 213123072;BA.debugLine="Sub AddClass(c As String) As VMTD";
RDebugUtils.currentLine=213123073;
 //BA.debugLineNum = 213123073;BA.debugLine="TD.AddClass(c)";
__ref._td /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=213123074;
 //BA.debugLineNum = 213123074;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=213123075;
 //BA.debugLineNum = 213123075;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmtd __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
RDebugUtils.currentLine=212074496;
 //BA.debugLineNum = 212074496;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=212074497;
 //BA.debugLineNum = 212074497;BA.debugLine="Public TD As VMElement";
_td = new b4j.example.vmelement();
RDebugUtils.currentLine=212074498;
 //BA.debugLineNum = 212074498;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=212074499;
 //BA.debugLineNum = 212074499;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=212074500;
 //BA.debugLineNum = 212074500;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=212074501;
 //BA.debugLineNum = 212074501;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmtd __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=212205568;
 //BA.debugLineNum = 212205568;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=212205569;
 //BA.debugLineNum = 212205569;BA.debugLine="TD.RemoveAttr(\"v-show\")";
__ref._td /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,"v-show");
RDebugUtils.currentLine=212205570;
 //BA.debugLineNum = 212205570;BA.debugLine="Return TD.ToString";
if (true) return __ref._td /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=212205571;
 //BA.debugLineNum = 212205571;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmtd __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=212729856;
 //BA.debugLineNum = 212729856;BA.debugLine="Sub Render";
RDebugUtils.currentLine=212729857;
 //BA.debugLineNum = 212729857;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=212729858;
 //BA.debugLineNum = 212729858;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtd  _setaccent(b4j.example.vmtd __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=212992000;
 //BA.debugLineNum = 212992000;BA.debugLine="Sub SetAccent(b As Boolean) As VMTD";
RDebugUtils.currentLine=212992001;
 //BA.debugLineNum = 212992001;BA.debugLine="TD.SetAccent(True)";
__ref._td /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=212992002;
 //BA.debugLineNum = 212992002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212992003;
 //BA.debugLineNum = 212992003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setattr(b4j.example.vmtd __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=213188608;
 //BA.debugLineNum = 213188608;BA.debugLine="Sub SetAttr(attr As Map) As VMTD";
RDebugUtils.currentLine=213188609;
 //BA.debugLineNum = 213188609;BA.debugLine="TD.SetAttr(attr)";
__ref._td /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=213188610;
 //BA.debugLineNum = 213188610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=213188611;
 //BA.debugLineNum = 213188611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setpadding(b4j.example.vmtd __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=213385216;
 //BA.debugLineNum = 213385216;BA.debugLine="Sub SetPadding(p As Object) As VMTD";
RDebugUtils.currentLine=213385217;
 //BA.debugLineNum = 213385217;BA.debugLine="TD.SetPaddingAll(p)";
__ref._td /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=213385218;
 //BA.debugLineNum = 213385218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=213385219;
 //BA.debugLineNum = 213385219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setprimary(b4j.example.vmtd __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=212926464;
 //BA.debugLineNum = 212926464;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTD";
RDebugUtils.currentLine=212926465;
 //BA.debugLineNum = 212926465;BA.debugLine="TD.SetPrimary(True)";
__ref._td /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=212926466;
 //BA.debugLineNum = 212926466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212926467;
 //BA.debugLineNum = 212926467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setstyle(b4j.example.vmtd __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=213254144;
 //BA.debugLineNum = 213254144;BA.debugLine="Sub SetStyle(sm As Map) As VMTD";
RDebugUtils.currentLine=213254145;
 //BA.debugLineNum = 213254145;BA.debugLine="TD.SetStyle(sm)";
__ref._td /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=213254146;
 //BA.debugLineNum = 213254146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=213254147;
 //BA.debugLineNum = 213254147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setvif(b4j.example.vmtd __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=212598784;
 //BA.debugLineNum = 212598784;BA.debugLine="Sub SetVIf(vif As Object) As VMTD";
RDebugUtils.currentLine=212598785;
 //BA.debugLineNum = 212598785;BA.debugLine="TD.SetVIf(vif)";
__ref._td /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=212598786;
 //BA.debugLineNum = 212598786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212598787;
 //BA.debugLineNum = 212598787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setvisible(b4j.example.vmtd __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setvisible", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setvisible", new Object[] {_b}));}
RDebugUtils.currentLine=212271104;
 //BA.debugLineNum = 212271104;BA.debugLine="Sub SetVisible(b As Boolean) As VMTD";
RDebugUtils.currentLine=212271105;
 //BA.debugLineNum = 212271105;BA.debugLine="TD.SetVisible(b)";
__ref._td /*b4j.example.vmelement*/ ._setvisible /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=212271106;
 //BA.debugLineNum = 212271106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212271107;
 //BA.debugLineNum = 212271107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtd  _setvmodel(b4j.example.vmtd __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtd";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmtd) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=212533248;
 //BA.debugLineNum = 212533248;BA.debugLine="Sub SetVModel(k As String) As VMTD";
RDebugUtils.currentLine=212533249;
 //BA.debugLineNum = 212533249;BA.debugLine="TD.SetVModel(k)";
__ref._td /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=212533250;
 //BA.debugLineNum = 212533250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtd)(this);
RDebugUtils.currentLine=212533251;
 //BA.debugLineNum = 212533251;BA.debugLine="End Sub";
return null;
}
}