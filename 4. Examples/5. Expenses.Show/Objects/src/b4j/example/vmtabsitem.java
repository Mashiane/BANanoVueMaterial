package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtabsitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtabsitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtabsitem.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _tabitem = null;
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
public b4j.example.vmtabsitem  _initialize(b4j.example.vmtabsitem __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=210829312;
 //BA.debugLineNum = 210829312;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=210829313;
 //BA.debugLineNum = 210829313;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=210829314;
 //BA.debugLineNum = 210829314;BA.debugLine="TabItem.Initialize(v, ID)";
__ref._tabitem /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=210829315;
 //BA.debugLineNum = 210829315;BA.debugLine="TabItem.SetTag(\"md-tab\")";
__ref._tabitem /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-tab");
RDebugUtils.currentLine=210829316;
 //BA.debugLineNum = 210829316;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=210829317;
 //BA.debugLineNum = 210829317;BA.debugLine="SetId(ID)";
__ref._setid /*b4j.example.vmtabsitem*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=210829318;
 //BA.debugLineNum = 210829318;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=210829319;
 //BA.debugLineNum = 210829319;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=210829320;
 //BA.debugLineNum = 210829320;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setlabel(b4j.example.vmtabsitem __ref,String _varlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "setlabel", new Object[] {_varlabel}));}
String _pp = "";
RDebugUtils.currentLine=211812352;
 //BA.debugLineNum = 211812352;BA.debugLine="Sub SetLabel(varLabel As String) As VMTabsItem";
RDebugUtils.currentLine=211812353;
 //BA.debugLineNum = 211812353;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"label");
RDebugUtils.currentLine=211812354;
 //BA.debugLineNum = 211812354;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_varlabel));
RDebugUtils.currentLine=211812355;
 //BA.debugLineNum = 211812355;BA.debugLine="SetAttr(CreateMap(\":md-label\": pp))";
__ref._setattr /*b4j.example.vmtabsitem*/ (null,__c.createMap(new Object[] {(Object)(":md-label"),(Object)(_pp)}));
RDebugUtils.currentLine=211812356;
 //BA.debugLineNum = 211812356;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211812357;
 //BA.debugLineNum = 211812357;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _seticon(b4j.example.vmtabsitem __ref,String _varicon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "seticon", new Object[] {_varicon}));}
String _pp = "";
RDebugUtils.currentLine=211877888;
 //BA.debugLineNum = 211877888;BA.debugLine="Sub SetIcon(varIcon As String) As VMTabsItem";
RDebugUtils.currentLine=211877889;
 //BA.debugLineNum = 211877889;BA.debugLine="Dim pp As String = $\"${ID}icon\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icon");
RDebugUtils.currentLine=211877890;
 //BA.debugLineNum = 211877890;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_varicon));
RDebugUtils.currentLine=211877891;
 //BA.debugLineNum = 211877891;BA.debugLine="SetAttr(CreateMap(\":md-icon\": pp))";
__ref._setattr /*b4j.example.vmtabsitem*/ (null,__c.createMap(new Object[] {(Object)(":md-icon"),(Object)(_pp)}));
RDebugUtils.currentLine=211877892;
 //BA.debugLineNum = 211877892;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211877893;
 //BA.debugLineNum = 211877893;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _settext(b4j.example.vmtabsitem __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=211222528;
 //BA.debugLineNum = 211222528;BA.debugLine="Sub SetText(t As String) As VMTabsItem";
RDebugUtils.currentLine=211222529;
 //BA.debugLineNum = 211222529;BA.debugLine="TabItem.SetText(t)";
__ref._tabitem /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=211222530;
 //BA.debugLineNum = 211222530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211222531;
 //BA.debugLineNum = 211222531;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmtabsitem __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=211288064;
 //BA.debugLineNum = 211288064;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=211288065;
 //BA.debugLineNum = 211288065;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=211288066;
 //BA.debugLineNum = 211288066;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsitem  _addchild(b4j.example.vmtabsitem __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=211156992;
 //BA.debugLineNum = 211156992;BA.debugLine="Sub AddChild(child As VMElement) As VMTabsItem";
RDebugUtils.currentLine=211156993;
 //BA.debugLineNum = 211156993;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=211156994;
 //BA.debugLineNum = 211156994;BA.debugLine="TabItem.SetText(childHTML)";
__ref._tabitem /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=211156995;
 //BA.debugLineNum = 211156995;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211156996;
 //BA.debugLineNum = 211156996;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmtabsitem __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=211550208;
 //BA.debugLineNum = 211550208;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=211550209;
 //BA.debugLineNum = 211550209;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=211550210;
 //BA.debugLineNum = 211550210;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmtabsitem*/ (null,_childx);
 }
};
RDebugUtils.currentLine=211550212;
 //BA.debugLineNum = 211550212;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsitem  _addclass(b4j.example.vmtabsitem __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=211353600;
 //BA.debugLineNum = 211353600;BA.debugLine="Sub AddClass(c As String) As VMTabsItem";
RDebugUtils.currentLine=211353601;
 //BA.debugLineNum = 211353601;BA.debugLine="TabItem.AddClass(c)";
__ref._tabitem /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=211353602;
 //BA.debugLineNum = 211353602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211353603;
 //BA.debugLineNum = 211353603;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmtabsitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
RDebugUtils.currentLine=210763776;
 //BA.debugLineNum = 210763776;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=210763777;
 //BA.debugLineNum = 210763777;BA.debugLine="Public TabItem As VMElement";
_tabitem = new b4j.example.vmelement();
RDebugUtils.currentLine=210763778;
 //BA.debugLineNum = 210763778;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=210763779;
 //BA.debugLineNum = 210763779;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=210763780;
 //BA.debugLineNum = 210763780;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=210763781;
 //BA.debugLineNum = 210763781;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=210763782;
 //BA.debugLineNum = 210763782;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsitem  _setid(b4j.example.vmtabsitem __ref,String _varid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "setid", new Object[] {_varid}));}
RDebugUtils.currentLine=211681280;
 //BA.debugLineNum = 211681280;BA.debugLine="Sub SetId(varId As String) As VMTabsItem";
RDebugUtils.currentLine=211681281;
 //BA.debugLineNum = 211681281;BA.debugLine="If varId = \"\" Then Return Me";
if ((_varid).equals("")) { 
if (true) return (b4j.example.vmtabsitem)(this);};
RDebugUtils.currentLine=211681282;
 //BA.debugLineNum = 211681282;BA.debugLine="SetAttr(CreateMap(\"id\": varId))";
__ref._setattr /*b4j.example.vmtabsitem*/ (null,__c.createMap(new Object[] {(Object)("id"),(Object)(_varid)}));
RDebugUtils.currentLine=211681283;
 //BA.debugLineNum = 211681283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211681284;
 //BA.debugLineNum = 211681284;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmtabsitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=210894848;
 //BA.debugLineNum = 210894848;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=210894849;
 //BA.debugLineNum = 210894849;BA.debugLine="Return TabItem.ToString";
if (true) return __ref._tabitem /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=210894850;
 //BA.debugLineNum = 210894850;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmtabsitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=211091456;
 //BA.debugLineNum = 211091456;BA.debugLine="Sub Render";
RDebugUtils.currentLine=211091457;
 //BA.debugLineNum = 211091457;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=211091458;
 //BA.debugLineNum = 211091458;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabsitem  _setattr(b4j.example.vmtabsitem __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=211419136;
 //BA.debugLineNum = 211419136;BA.debugLine="Sub SetAttr(attr As Map) As VMTabsItem";
RDebugUtils.currentLine=211419137;
 //BA.debugLineNum = 211419137;BA.debugLine="TabItem.SetAttr(attr)";
__ref._tabitem /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=211419138;
 //BA.debugLineNum = 211419138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211419139;
 //BA.debugLineNum = 211419139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setdisabled(b4j.example.vmtabsitem __ref,boolean _vardisabled) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "setdisabled", new Object[] {_vardisabled}));}
String _pp = "";
RDebugUtils.currentLine=211943424;
 //BA.debugLineNum = 211943424;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMTabsI";
RDebugUtils.currentLine=211943425;
 //BA.debugLineNum = 211943425;BA.debugLine="Dim pp As String = $\"${ID}disabled\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"disabled");
RDebugUtils.currentLine=211943426;
 //BA.debugLineNum = 211943426;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_vardisabled));
RDebugUtils.currentLine=211943427;
 //BA.debugLineNum = 211943427;BA.debugLine="SetAttr(CreateMap(\":md-disabled\": pp))";
__ref._setattr /*b4j.example.vmtabsitem*/ (null,__c.createMap(new Object[] {(Object)(":md-disabled"),(Object)(_pp)}));
RDebugUtils.currentLine=211943428;
 //BA.debugLineNum = 211943428;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211943429;
 //BA.debugLineNum = 211943429;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setpadding(b4j.example.vmtabsitem __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=211615744;
 //BA.debugLineNum = 211615744;BA.debugLine="Sub SetPadding(p As Object) As VMTabsItem";
RDebugUtils.currentLine=211615745;
 //BA.debugLineNum = 211615745;BA.debugLine="TabItem.SetPaddingAll(p)";
__ref._tabitem /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=211615746;
 //BA.debugLineNum = 211615746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211615747;
 //BA.debugLineNum = 211615747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setref(b4j.example.vmtabsitem __ref,String _varref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "setref", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "setref", new Object[] {_varref}));}
RDebugUtils.currentLine=211746816;
 //BA.debugLineNum = 211746816;BA.debugLine="Sub SetRef(varRef As String) As VMTabsItem";
RDebugUtils.currentLine=211746817;
 //BA.debugLineNum = 211746817;BA.debugLine="If varRef = \"\" Then Return Me";
if ((_varref).equals("")) { 
if (true) return (b4j.example.vmtabsitem)(this);};
RDebugUtils.currentLine=211746818;
 //BA.debugLineNum = 211746818;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
__ref._setattr /*b4j.example.vmtabsitem*/ (null,__c.createMap(new Object[] {(Object)("ref"),(Object)(_varref)}));
RDebugUtils.currentLine=211746819;
 //BA.debugLineNum = 211746819;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211746820;
 //BA.debugLineNum = 211746820;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setstyle(b4j.example.vmtabsitem __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=211484672;
 //BA.debugLineNum = 211484672;BA.debugLine="Sub SetStyle(sm As Map) As VMTabsItem";
RDebugUtils.currentLine=211484673;
 //BA.debugLineNum = 211484673;BA.debugLine="TabItem.SetStyle(sm)";
__ref._tabitem /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=211484674;
 //BA.debugLineNum = 211484674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211484675;
 //BA.debugLineNum = 211484675;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _settemplatedata(b4j.example.vmtabsitem __ref,Object _vartemplatedata) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "settemplatedata", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "settemplatedata", new Object[] {_vartemplatedata}));}
RDebugUtils.currentLine=212008960;
 //BA.debugLineNum = 212008960;BA.debugLine="Sub SetTemplateData(varTemplateData As Object) As";
RDebugUtils.currentLine=212008961;
 //BA.debugLineNum = 212008961;BA.debugLine="SetAttr(CreateMap(\"md-template-data\": varTemplate";
__ref._setattr /*b4j.example.vmtabsitem*/ (null,__c.createMap(new Object[] {(Object)("md-template-data"),_vartemplatedata}));
RDebugUtils.currentLine=212008962;
 //BA.debugLineNum = 212008962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=212008963;
 //BA.debugLineNum = 212008963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setvif(b4j.example.vmtabsitem __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=210960384;
 //BA.debugLineNum = 210960384;BA.debugLine="Sub SetVIf(vif As String) As VMTabsItem";
RDebugUtils.currentLine=210960385;
 //BA.debugLineNum = 210960385;BA.debugLine="TabItem.SetVIf(vif)";
__ref._tabitem /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=210960386;
 //BA.debugLineNum = 210960386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=210960387;
 //BA.debugLineNum = 210960387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabsitem  _setvshow(b4j.example.vmtabsitem __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabsitem";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtabsitem) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=211025920;
 //BA.debugLineNum = 211025920;BA.debugLine="Sub SetVShow(vif As String) As VMTabsItem";
RDebugUtils.currentLine=211025921;
 //BA.debugLineNum = 211025921;BA.debugLine="TabItem.SetVShow(vif)";
__ref._tabitem /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=211025922;
 //BA.debugLineNum = 211025922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabsitem)(this);
RDebugUtils.currentLine=211025923;
 //BA.debugLineNum = 211025923;BA.debugLine="End Sub";
return null;
}
}