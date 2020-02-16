package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtabs extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtabs", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtabs.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _tabs = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _atkey = "";
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmtabs  _initialize(b4j.example.vmtabs __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=208207872;
 //BA.debugLineNum = 208207872;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=208207873;
 //BA.debugLineNum = 208207873;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=208207874;
 //BA.debugLineNum = 208207874;BA.debugLine="Tabs.Initialize(v, ID)";
__ref._tabs /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=208207875;
 //BA.debugLineNum = 208207875;BA.debugLine="Tabs.SetTag(\"md-tabs\")";
__ref._tabs /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-tabs");
RDebugUtils.currentLine=208207876;
 //BA.debugLineNum = 208207876;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=208207877;
 //BA.debugLineNum = 208207877;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=208207878;
 //BA.debugLineNum = 208207878;BA.debugLine="SetOnChanged";
__ref._setonchanged /*b4j.example.vmtabs*/ (null);
RDebugUtils.currentLine=208207879;
 //BA.debugLineNum = 208207879;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208207880;
 //BA.debugLineNum = 208207880;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _addchild(b4j.example.vmtabs __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=209059840;
 //BA.debugLineNum = 209059840;BA.debugLine="Sub AddChild(child As VMElement) As VMTabs";
RDebugUtils.currentLine=209059841;
 //BA.debugLineNum = 209059841;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=209059842;
 //BA.debugLineNum = 209059842;BA.debugLine="Tabs.SetText(childHTML)";
__ref._tabs /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=209059843;
 //BA.debugLineNum = 209059843;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209059844;
 //BA.debugLineNum = 209059844;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmtabs __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=209584128;
 //BA.debugLineNum = 209584128;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=209584129;
 //BA.debugLineNum = 209584129;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=209584130;
 //BA.debugLineNum = 209584130;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmtabs*/ (null,_childx);
 }
};
RDebugUtils.currentLine=209584132;
 //BA.debugLineNum = 209584132;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _addclass(b4j.example.vmtabs __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=209387520;
 //BA.debugLineNum = 209387520;BA.debugLine="Sub AddClass(c As String) As VMTabs";
RDebugUtils.currentLine=209387521;
 //BA.debugLineNum = 209387521;BA.debugLine="Tabs.AddClass(c)";
__ref._tabs /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=209387522;
 //BA.debugLineNum = 209387522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209387523;
 //BA.debugLineNum = 209387523;BA.debugLine="End Sub";
return null;
}
public String  _addtab(b4j.example.vmtabs __ref,String _tabid,String _tablabel,String _tabicon,String _tabcontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "addtab", true))
	 {return ((String) Debug.delegate(ba, "addtab", new Object[] {_tabid,_tablabel,_tabicon,_tabcontent}));}
b4j.example.vmtabsitem _ti = null;
RDebugUtils.currentLine=208666624;
 //BA.debugLineNum = 208666624;BA.debugLine="Sub AddTab(tabID As String, tabLabel As String, ta";
RDebugUtils.currentLine=208666625;
 //BA.debugLineNum = 208666625;BA.debugLine="tabID = tabID.tolowercase";
_tabid = _tabid.toLowerCase();
RDebugUtils.currentLine=208666626;
 //BA.debugLineNum = 208666626;BA.debugLine="Dim ti As VMTabsItem";
_ti = new b4j.example.vmtabsitem();
RDebugUtils.currentLine=208666627;
 //BA.debugLineNum = 208666627;BA.debugLine="ti.Initialize(vue,tabID,module)";
_ti._initialize /*b4j.example.vmtabsitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_tabid,__ref._module /*Object*/ );
RDebugUtils.currentLine=208666628;
 //BA.debugLineNum = 208666628;BA.debugLine="ti.SetLabel(tabLabel)";
_ti._setlabel /*b4j.example.vmtabsitem*/ (null,_tablabel);
RDebugUtils.currentLine=208666629;
 //BA.debugLineNum = 208666629;BA.debugLine="ti.SetIcon(tabIcon)";
_ti._seticon /*b4j.example.vmtabsitem*/ (null,_tabicon);
RDebugUtils.currentLine=208666631;
 //BA.debugLineNum = 208666631;BA.debugLine="If tabContent <> Null Then";
if (_tabcontent!= null) { 
RDebugUtils.currentLine=208666632;
 //BA.debugLineNum = 208666632;BA.debugLine="ti.SetText(tabContent)";
_ti._settext /*b4j.example.vmtabsitem*/ (null,_tabcontent);
 };
RDebugUtils.currentLine=208666634;
 //BA.debugLineNum = 208666634;BA.debugLine="ti.Pop(Tabs)";
_ti._pop /*String*/ (null,__ref._tabs /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=208666635;
 //BA.debugLineNum = 208666635;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmtabs __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=210698240;
 //BA.debugLineNum = 210698240;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=210698241;
 //BA.debugLineNum = 210698241;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=210698242;
 //BA.debugLineNum = 210698242;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmtabs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=208732160;
 //BA.debugLineNum = 208732160;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=208732161;
 //BA.debugLineNum = 208732161;BA.debugLine="Return Tabs.ToString";
if (true) return __ref._tabs /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=208732162;
 //BA.debugLineNum = 208732162;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmtabs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
RDebugUtils.currentLine=208142336;
 //BA.debugLineNum = 208142336;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=208142337;
 //BA.debugLineNum = 208142337;BA.debugLine="Public Tabs As VMElement";
_tabs = new b4j.example.vmelement();
RDebugUtils.currentLine=208142338;
 //BA.debugLineNum = 208142338;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=208142339;
 //BA.debugLineNum = 208142339;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=208142340;
 //BA.debugLineNum = 208142340;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=208142341;
 //BA.debugLineNum = 208142341;BA.debugLine="Private atKey As String = $\"${ID}active\"$";
_atkey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"active");
RDebugUtils.currentLine=208142342;
 //BA.debugLineNum = 208142342;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=208142343;
 //BA.debugLineNum = 208142343;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _hidetab(b4j.example.vmtabs __ref,String _stepid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "hidetab", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "hidetab", new Object[] {_stepid}));}
String _stepshow = "";
RDebugUtils.currentLine=208535552;
 //BA.debugLineNum = 208535552;BA.debugLine="Sub HideTab(stepID As String) As VMTabs";
RDebugUtils.currentLine=208535553;
 //BA.debugLineNum = 208535553;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=208535554;
 //BA.debugLineNum = 208535554;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"show");
RDebugUtils.currentLine=208535555;
 //BA.debugLineNum = 208535555;BA.debugLine="vue.SetStateSingle(stepShow, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(__c.False));
RDebugUtils.currentLine=208535556;
 //BA.debugLineNum = 208535556;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208535557;
 //BA.debugLineNum = 208535557;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setonchanged(b4j.example.vmtabs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setonchanged", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setonchanged", null));}
String _tabid = "";
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=210632704;
 //BA.debugLineNum = 210632704;BA.debugLine="private Sub SetOnChanged As VMTabs";
RDebugUtils.currentLine=210632705;
 //BA.debugLineNum = 210632705;BA.debugLine="Dim tabID As String";
_tabid = "";
RDebugUtils.currentLine=210632706;
 //BA.debugLineNum = 210632706;BA.debugLine="Dim methodName As String  = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_change");
RDebugUtils.currentLine=210632707;
 //BA.debugLineNum = 210632707;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtabs)(this);};
RDebugUtils.currentLine=210632708;
 //BA.debugLineNum = 210632708;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_tabid)}))));
RDebugUtils.currentLine=210632709;
 //BA.debugLineNum = 210632709;BA.debugLine="SetAttr(CreateMap(\"v-on:md-changed\": methodName))";
__ref._setattr /*b4j.example.vmtabs*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-changed"),(Object)(_methodname)}));
RDebugUtils.currentLine=210632711;
 //BA.debugLineNum = 210632711;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=210632712;
 //BA.debugLineNum = 210632712;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210632713;
 //BA.debugLineNum = 210632713;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmtabs __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=209321984;
 //BA.debugLineNum = 209321984;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=209321985;
 //BA.debugLineNum = 209321985;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=209321986;
 //BA.debugLineNum = 209321986;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmtabs __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=208994304;
 //BA.debugLineNum = 208994304;BA.debugLine="Sub Render";
RDebugUtils.currentLine=208994305;
 //BA.debugLineNum = 208994305;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=208994306;
 //BA.debugLineNum = 208994306;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtabs  _setaccent(b4j.example.vmtabs __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=209256448;
 //BA.debugLineNum = 209256448;BA.debugLine="Sub SetAccent(b As Boolean) As VMTabs";
RDebugUtils.currentLine=209256449;
 //BA.debugLineNum = 209256449;BA.debugLine="Tabs.SetAccent(True)";
__ref._tabs /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=209256450;
 //BA.debugLineNum = 209256450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209256451;
 //BA.debugLineNum = 209256451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignment(b4j.example.vmtabs __ref,String _varalignment) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setalignment", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setalignment", new Object[] {_varalignment}));}
String _pp = "";
RDebugUtils.currentLine=209911808;
 //BA.debugLineNum = 209911808;BA.debugLine="Sub SetAlignment(varAlignment As String) As VMTabs";
RDebugUtils.currentLine=209911809;
 //BA.debugLineNum = 209911809;BA.debugLine="Dim pp As String = $\"${ID}alignment\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"alignment");
RDebugUtils.currentLine=209911810;
 //BA.debugLineNum = 209911810;BA.debugLine="vue.SetStateSingle(pp, varAlignment)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_varalignment));
RDebugUtils.currentLine=209911811;
 //BA.debugLineNum = 209911811;BA.debugLine="SetAttr(CreateMap(\":md-alignment\": pp))";
__ref._setattr /*b4j.example.vmtabs*/ (null,__c.createMap(new Object[] {(Object)(":md-alignment"),(Object)(_pp)}));
RDebugUtils.currentLine=209911812;
 //BA.debugLineNum = 209911812;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209911813;
 //BA.debugLineNum = 209911813;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setattr(b4j.example.vmtabs __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=209453056;
 //BA.debugLineNum = 209453056;BA.debugLine="Sub SetAttr(attr As Map) As VMTabs";
RDebugUtils.currentLine=209453057;
 //BA.debugLineNum = 209453057;BA.debugLine="Tabs.SetAttr(attr)";
__ref._tabs /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=209453058;
 //BA.debugLineNum = 209453058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209453059;
 //BA.debugLineNum = 209453059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignmentcenter(b4j.example.vmtabs __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setalignmentcenter", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setalignmentcenter", new Object[] {_b}));}
RDebugUtils.currentLine=210042880;
 //BA.debugLineNum = 210042880;BA.debugLine="Sub SetAlignmentCenter(b As Boolean) As VMTabs";
RDebugUtils.currentLine=210042881;
 //BA.debugLineNum = 210042881;BA.debugLine="SetAlignment(\"centered\")";
__ref._setalignment /*b4j.example.vmtabs*/ (null,"centered");
RDebugUtils.currentLine=210042882;
 //BA.debugLineNum = 210042882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210042883;
 //BA.debugLineNum = 210042883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignmentfixed(b4j.example.vmtabs __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setalignmentfixed", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setalignmentfixed", new Object[] {_b}));}
RDebugUtils.currentLine=210173952;
 //BA.debugLineNum = 210173952;BA.debugLine="Sub SetAlignmentFixed(b As Boolean) As VMTabs    '";
RDebugUtils.currentLine=210173953;
 //BA.debugLineNum = 210173953;BA.debugLine="SetAlignment(\"fixed\")";
__ref._setalignment /*b4j.example.vmtabs*/ (null,"fixed");
RDebugUtils.currentLine=210173954;
 //BA.debugLineNum = 210173954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210173955;
 //BA.debugLineNum = 210173955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignmentleft(b4j.example.vmtabs __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setalignmentleft", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setalignmentleft", new Object[] {_b}));}
RDebugUtils.currentLine=209977344;
 //BA.debugLineNum = 209977344;BA.debugLine="Sub SetAlignmentLeft(b As Boolean) As VMTabs    'i";
RDebugUtils.currentLine=209977345;
 //BA.debugLineNum = 209977345;BA.debugLine="SetAlignment(\"left\")";
__ref._setalignment /*b4j.example.vmtabs*/ (null,"left");
RDebugUtils.currentLine=209977346;
 //BA.debugLineNum = 209977346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209977347;
 //BA.debugLineNum = 209977347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setalignmentright(b4j.example.vmtabs __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setalignmentright", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setalignmentright", new Object[] {_b}));}
RDebugUtils.currentLine=210108416;
 //BA.debugLineNum = 210108416;BA.debugLine="Sub SetAlignmentRight(b As Boolean) As VMTabs    '";
RDebugUtils.currentLine=210108417;
 //BA.debugLineNum = 210108417;BA.debugLine="SetAlignment(\"right\")";
__ref._setalignment /*b4j.example.vmtabs*/ (null,"right");
RDebugUtils.currentLine=210108418;
 //BA.debugLineNum = 210108418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210108419;
 //BA.debugLineNum = 210108419;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdisabled(b4j.example.vmtabs __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=208273408;
 //BA.debugLineNum = 208273408;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTabs";
RDebugUtils.currentLine=208273409;
 //BA.debugLineNum = 208273409;BA.debugLine="Tabs.SetDisabled(b)";
__ref._tabs /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=208273410;
 //BA.debugLineNum = 208273410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208273411;
 //BA.debugLineNum = 208273411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setdynamicheight(b4j.example.vmtabs __ref,boolean _vardynamicheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setdynamicheight", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setdynamicheight", new Object[] {_vardynamicheight}));}
String _pp = "";
RDebugUtils.currentLine=210239488;
 //BA.debugLineNum = 210239488;BA.debugLine="Sub SetDynamicHeight(varDynamicHeight As Boolean)";
RDebugUtils.currentLine=210239489;
 //BA.debugLineNum = 210239489;BA.debugLine="Dim pp As String = $\"${ID}dynamicheight\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"dynamicheight");
RDebugUtils.currentLine=210239490;
 //BA.debugLineNum = 210239490;BA.debugLine="vue.SetStateSingle(pp, varDynamicHeight)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_vardynamicheight));
RDebugUtils.currentLine=210239491;
 //BA.debugLineNum = 210239491;BA.debugLine="SetAttr(CreateMap(\":md-dynamic-height\": pp))";
__ref._setattr /*b4j.example.vmtabs*/ (null,__c.createMap(new Object[] {(Object)(":md-dynamic-height"),(Object)(_pp)}));
RDebugUtils.currentLine=210239492;
 //BA.debugLineNum = 210239492;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210239493;
 //BA.debugLineNum = 210239493;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setelevation(b4j.example.vmtabs __ref,int _varelevation) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setelevation", new Object[] {_varelevation}));}
RDebugUtils.currentLine=210370560;
 //BA.debugLineNum = 210370560;BA.debugLine="Sub SetElevation(varElevation As Int) As VMTabs";
RDebugUtils.currentLine=210370561;
 //BA.debugLineNum = 210370561;BA.debugLine="Tabs.SetElevation(varElevation)";
__ref._tabs /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_varelevation);
RDebugUtils.currentLine=210370562;
 //BA.debugLineNum = 210370562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210370563;
 //BA.debugLineNum = 210370563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setmargin(b4j.example.vmtabs __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setmargin", new Object[] {_p}));}
RDebugUtils.currentLine=210305024;
 //BA.debugLineNum = 210305024;BA.debugLine="Sub SetMargin(p As Object) As VMTabs";
RDebugUtils.currentLine=210305025;
 //BA.debugLineNum = 210305025;BA.debugLine="Tabs.SetMarginAll(p)";
__ref._tabs /*b4j.example.vmelement*/ ._setmarginall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=210305026;
 //BA.debugLineNum = 210305026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210305027;
 //BA.debugLineNum = 210305027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setpadding(b4j.example.vmtabs __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=209649664;
 //BA.debugLineNum = 209649664;BA.debugLine="Sub SetPadding(p As Object) As VMTabs";
RDebugUtils.currentLine=209649665;
 //BA.debugLineNum = 209649665;BA.debugLine="Tabs.SetPaddingAll(p)";
__ref._tabs /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=209649666;
 //BA.debugLineNum = 209649666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209649667;
 //BA.debugLineNum = 209649667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setprimary(b4j.example.vmtabs __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=209190912;
 //BA.debugLineNum = 209190912;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTabs";
RDebugUtils.currentLine=209190913;
 //BA.debugLineNum = 209190913;BA.debugLine="Tabs.SetPrimary(True)";
__ref._tabs /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=209190914;
 //BA.debugLineNum = 209190914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209190915;
 //BA.debugLineNum = 209190915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setstyle(b4j.example.vmtabs __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=209518592;
 //BA.debugLineNum = 209518592;BA.debugLine="Sub SetStyle(sm As Map) As VMTabs";
RDebugUtils.currentLine=209518593;
 //BA.debugLineNum = 209518593;BA.debugLine="Tabs.SetStyle(sm)";
__ref._tabs /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=209518594;
 //BA.debugLineNum = 209518594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209518595;
 //BA.debugLineNum = 209518595;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setswipeable(b4j.example.vmtabs __ref,boolean _varswipeable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setswipeable", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setswipeable", new Object[] {_varswipeable}));}
String _pp = "";
RDebugUtils.currentLine=209780736;
 //BA.debugLineNum = 209780736;BA.debugLine="Sub SetSwipeable(varSwipeable As Boolean) As VMTab";
RDebugUtils.currentLine=209780737;
 //BA.debugLineNum = 209780737;BA.debugLine="Dim pp As String = $\"${ID}swipeable\"$";
_pp = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"swipeable");
RDebugUtils.currentLine=209780738;
 //BA.debugLineNum = 209780738;BA.debugLine="vue.SetStateSingle(pp, varSwipeable)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_pp,(Object)(_varswipeable));
RDebugUtils.currentLine=209780739;
 //BA.debugLineNum = 209780739;BA.debugLine="SetAttr(CreateMap(\":md-swipeable\": pp))";
__ref._setattr /*b4j.example.vmtabs*/ (null,__c.createMap(new Object[] {(Object)(":md-swipeable"),(Object)(_pp)}));
RDebugUtils.currentLine=209780740;
 //BA.debugLineNum = 209780740;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209780741;
 //BA.debugLineNum = 209780741;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setswiperestraint(b4j.example.vmtabs __ref,Object _varswiperestraint) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setswiperestraint", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setswiperestraint", new Object[] {_varswiperestraint}));}
RDebugUtils.currentLine=210501632;
 //BA.debugLineNum = 210501632;BA.debugLine="Sub SetSwipeRestraint(varSwipeRestraint As Object)";
RDebugUtils.currentLine=210501633;
 //BA.debugLineNum = 210501633;BA.debugLine="SetAttr(CreateMap(\"md-swipe-restraint\": varSwipeR";
__ref._setattr /*b4j.example.vmtabs*/ (null,__c.createMap(new Object[] {(Object)("md-swipe-restraint"),_varswiperestraint}));
RDebugUtils.currentLine=210501634;
 //BA.debugLineNum = 210501634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210501635;
 //BA.debugLineNum = 210501635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setswipethreshold(b4j.example.vmtabs __ref,Object _varswipethreshold) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setswipethreshold", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setswipethreshold", new Object[] {_varswipethreshold}));}
RDebugUtils.currentLine=210436096;
 //BA.debugLineNum = 210436096;BA.debugLine="Sub SetSwipeThreshold(varSwipeThreshold As Object)";
RDebugUtils.currentLine=210436097;
 //BA.debugLineNum = 210436097;BA.debugLine="SetAttr(CreateMap(\"md-swipe-threshold\": varSwipeT";
__ref._setattr /*b4j.example.vmtabs*/ (null,__c.createMap(new Object[] {(Object)("md-swipe-threshold"),_varswipethreshold}));
RDebugUtils.currentLine=210436098;
 //BA.debugLineNum = 210436098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210436099;
 //BA.debugLineNum = 210436099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setswipetime(b4j.example.vmtabs __ref,Object _varswipetime) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setswipetime", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setswipetime", new Object[] {_varswipetime}));}
RDebugUtils.currentLine=210567168;
 //BA.debugLineNum = 210567168;BA.debugLine="Sub SetSwipeTime(varSwipeTime As Object) As VMTabs";
RDebugUtils.currentLine=210567169;
 //BA.debugLineNum = 210567169;BA.debugLine="SetAttr(CreateMap(\"md-swipe-time\": varSwipeTime))";
__ref._setattr /*b4j.example.vmtabs*/ (null,__c.createMap(new Object[] {(Object)("md-swipe-time"),_varswipetime}));
RDebugUtils.currentLine=210567170;
 //BA.debugLineNum = 210567170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=210567171;
 //BA.debugLineNum = 210567171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setsyncroute(b4j.example.vmtabs __ref,boolean _varsyncroute) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setsyncroute", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setsyncroute", new Object[] {_varsyncroute}));}
RDebugUtils.currentLine=209846272;
 //BA.debugLineNum = 209846272;BA.debugLine="Sub SetSyncRoute(varSyncRoute As Boolean) As VMTab";
RDebugUtils.currentLine=209846273;
 //BA.debugLineNum = 209846273;BA.debugLine="SetAttr(CreateMap(\":md-sync-route\": varSyncRoute)";
__ref._setattr /*b4j.example.vmtabs*/ (null,__c.createMap(new Object[] {(Object)(":md-sync-route"),(Object)(_varsyncroute)}));
RDebugUtils.currentLine=209846274;
 //BA.debugLineNum = 209846274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209846275;
 //BA.debugLineNum = 209846275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settabactive(b4j.example.vmtabs __ref,String _varactivetab) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "settabactive", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "settabactive", new Object[] {_varactivetab}));}
RDebugUtils.currentLine=209715200;
 //BA.debugLineNum = 209715200;BA.debugLine="Sub SetTabActive(varActiveTab As String) As VMTabs";
RDebugUtils.currentLine=209715201;
 //BA.debugLineNum = 209715201;BA.debugLine="If varActiveTab = Null Then Return Me";
if (_varactivetab== null) { 
if (true) return (b4j.example.vmtabs)(this);};
RDebugUtils.currentLine=209715202;
 //BA.debugLineNum = 209715202;BA.debugLine="varActiveTab = varActiveTab.tolowercase";
_varactivetab = _varactivetab.toLowerCase();
RDebugUtils.currentLine=209715203;
 //BA.debugLineNum = 209715203;BA.debugLine="vue.SetStateSingle(atKey, varActiveTab)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._atkey /*String*/ ,(Object)(_varactivetab));
RDebugUtils.currentLine=209715204;
 //BA.debugLineNum = 209715204;BA.debugLine="SetAttr(CreateMap(\":md-active-tab\": atKey))";
__ref._setattr /*b4j.example.vmtabs*/ (null,__c.createMap(new Object[] {(Object)(":md-active-tab"),(Object)(__ref._atkey /*String*/ )}));
RDebugUtils.currentLine=209715205;
 //BA.debugLineNum = 209715205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209715206;
 //BA.debugLineNum = 209715206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settabdisabled(b4j.example.vmtabs __ref,String _stepid,boolean _steplabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "settabdisabled", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "settabdisabled", new Object[] {_stepid,_steplabel}));}
String _stepshow = "";
RDebugUtils.currentLine=208470016;
 //BA.debugLineNum = 208470016;BA.debugLine="Sub SetTabDisabled(stepID As String, stepLabel As";
RDebugUtils.currentLine=208470017;
 //BA.debugLineNum = 208470017;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=208470018;
 //BA.debugLineNum = 208470018;BA.debugLine="Dim stepShow As String = $\"${stepID}disabled\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"disabled");
RDebugUtils.currentLine=208470019;
 //BA.debugLineNum = 208470019;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(_steplabel));
RDebugUtils.currentLine=208470020;
 //BA.debugLineNum = 208470020;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208470021;
 //BA.debugLineNum = 208470021;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settabicon(b4j.example.vmtabs __ref,String _stepid,String _steplabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "settabicon", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "settabicon", new Object[] {_stepid,_steplabel}));}
String _stepshow = "";
RDebugUtils.currentLine=208404480;
 //BA.debugLineNum = 208404480;BA.debugLine="Sub SetTabIcon(stepID As String, stepLabel As Stri";
RDebugUtils.currentLine=208404481;
 //BA.debugLineNum = 208404481;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=208404482;
 //BA.debugLineNum = 208404482;BA.debugLine="Dim stepShow As String = $\"${stepID}icon\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"icon");
RDebugUtils.currentLine=208404483;
 //BA.debugLineNum = 208404483;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(_steplabel));
RDebugUtils.currentLine=208404484;
 //BA.debugLineNum = 208404484;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208404485;
 //BA.debugLineNum = 208404485;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settablabel(b4j.example.vmtabs __ref,String _stepid,String _steplabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "settablabel", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "settablabel", new Object[] {_stepid,_steplabel}));}
String _stepshow = "";
RDebugUtils.currentLine=208338944;
 //BA.debugLineNum = 208338944;BA.debugLine="Sub SetTabLabel(stepID As String, stepLabel As Str";
RDebugUtils.currentLine=208338945;
 //BA.debugLineNum = 208338945;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=208338946;
 //BA.debugLineNum = 208338946;BA.debugLine="Dim stepShow As String = $\"${stepID}label\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"label");
RDebugUtils.currentLine=208338947;
 //BA.debugLineNum = 208338947;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(_steplabel));
RDebugUtils.currentLine=208338948;
 //BA.debugLineNum = 208338948;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208338949;
 //BA.debugLineNum = 208338949;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _settext(b4j.example.vmtabs __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=209125376;
 //BA.debugLineNum = 209125376;BA.debugLine="Sub SetText(t As Object) As VMTabs";
RDebugUtils.currentLine=209125377;
 //BA.debugLineNum = 209125377;BA.debugLine="Tabs.SetText(t)";
__ref._tabs /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=209125378;
 //BA.debugLineNum = 209125378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=209125379;
 //BA.debugLineNum = 209125379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvif(b4j.example.vmtabs __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=208863232;
 //BA.debugLineNum = 208863232;BA.debugLine="Sub SetVIf(vif As Object) As VMTabs";
RDebugUtils.currentLine=208863233;
 //BA.debugLineNum = 208863233;BA.debugLine="Tabs.SetVIf(vif)";
__ref._tabs /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=208863234;
 //BA.debugLineNum = 208863234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208863235;
 //BA.debugLineNum = 208863235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvmodel(b4j.example.vmtabs __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=208797696;
 //BA.debugLineNum = 208797696;BA.debugLine="Sub SetVModel(k As String) As VMTabs";
RDebugUtils.currentLine=208797697;
 //BA.debugLineNum = 208797697;BA.debugLine="Tabs.SetVModel(k)";
__ref._tabs /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=208797698;
 //BA.debugLineNum = 208797698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208797699;
 //BA.debugLineNum = 208797699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _setvshow(b4j.example.vmtabs __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=208928768;
 //BA.debugLineNum = 208928768;BA.debugLine="Sub SetVShow(vif As Object) As VMTabs";
RDebugUtils.currentLine=208928769;
 //BA.debugLineNum = 208928769;BA.debugLine="Tabs.SetVShow(vif)";
__ref._tabs /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=208928770;
 //BA.debugLineNum = 208928770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208928771;
 //BA.debugLineNum = 208928771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtabs  _showtab(b4j.example.vmtabs __ref,String _stepid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtabs";
if (Debug.shouldDelegate(ba, "showtab", true))
	 {return ((b4j.example.vmtabs) Debug.delegate(ba, "showtab", new Object[] {_stepid}));}
String _stepshow = "";
RDebugUtils.currentLine=208601088;
 //BA.debugLineNum = 208601088;BA.debugLine="Sub ShowTab(stepID As String) As VMTabs";
RDebugUtils.currentLine=208601089;
 //BA.debugLineNum = 208601089;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=208601090;
 //BA.debugLineNum = 208601090;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"show");
RDebugUtils.currentLine=208601091;
 //BA.debugLineNum = 208601091;BA.debugLine="vue.SetStateSingle(stepShow, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(__c.True));
RDebugUtils.currentLine=208601092;
 //BA.debugLineNum = 208601092;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtabs)(this);
RDebugUtils.currentLine=208601093;
 //BA.debugLineNum = 208601093;BA.debugLine="End Sub";
return null;
}
}