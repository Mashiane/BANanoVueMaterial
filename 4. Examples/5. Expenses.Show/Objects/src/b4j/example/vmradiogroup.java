package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmradiogroup extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmradiogroup", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmradiogroup.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _radiogroup = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmlabel _lbl = null;
public com.ab.banano.BANano _banano = null;
public String _vmodel = "";
public Object _module = null;
public boolean _designmode = false;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmradiogroup  _initialize(b4j.example.vmradiogroup __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,String _caption,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_caption,_eventhandler}));}
RDebugUtils.currentLine=188416000;
 //BA.debugLineNum = 188416000;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=188416001;
 //BA.debugLineNum = 188416001;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=188416002;
 //BA.debugLineNum = 188416002;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=188416003;
 //BA.debugLineNum = 188416003;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=188416004;
 //BA.debugLineNum = 188416004;BA.debugLine="RadioGroup.Initialize(vue, ID).SetTag(\"div\")";
__ref._radiogroup /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=188416005;
 //BA.debugLineNum = 188416005;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$).SetText($\"${";
__ref._lbl /*b4j.example.vmlabel*/ ._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_sid))+"label"))._settext /*b4j.example.vmlabel*/ (null,(""+__c.SmartStringFormatter("",(Object)(_caption))+"<br/>"))._setcaption /*b4j.example.vmlabel*/ (null,__c.True);
RDebugUtils.currentLine=188416006;
 //BA.debugLineNum = 188416006;BA.debugLine="lbl.Pop(RadioGroup)";
__ref._lbl /*b4j.example.vmlabel*/ ._pop /*String*/ (null,__ref._radiogroup /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=188416007;
 //BA.debugLineNum = 188416007;BA.debugLine="designMode = False";
__ref._designmode /*boolean*/  = __c.False;
RDebugUtils.currentLine=188416008;
 //BA.debugLineNum = 188416008;BA.debugLine="vmodel = \"\"";
__ref._vmodel /*String*/  = "";
RDebugUtils.currentLine=188416009;
 //BA.debugLineNum = 188416009;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=188416010;
 //BA.debugLineNum = 188416010;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdesignmode(b4j.example.vmradiogroup __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "setdesignmode", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "setdesignmode", new Object[] {_b}));}
RDebugUtils.currentLine=188547072;
 //BA.debugLineNum = 188547072;BA.debugLine="Sub SetDesignMode(b As Boolean) As VMRadioGroup";
RDebugUtils.currentLine=188547073;
 //BA.debugLineNum = 188547073;BA.debugLine="designMode = b";
__ref._designmode /*boolean*/  = _b;
RDebugUtils.currentLine=188547074;
 //BA.debugLineNum = 188547074;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=188547075;
 //BA.debugLineNum = 188547075;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvshow(b4j.example.vmradiogroup __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=189333504;
 //BA.debugLineNum = 189333504;BA.debugLine="Sub SetVShow(vif As String) As VMRadioGroup";
RDebugUtils.currentLine=189333505;
 //BA.debugLineNum = 189333505;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
RDebugUtils.currentLine=189333506;
 //BA.debugLineNum = 189333506;BA.debugLine="RadioGroup.SetVShow(vif)";
__ref._radiogroup /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=189333507;
 //BA.debugLineNum = 189333507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=189333508;
 //BA.debugLineNum = 189333508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvmodel(b4j.example.vmradiogroup __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=188874752;
 //BA.debugLineNum = 188874752;BA.debugLine="Sub SetVModel(k As String) As VMRadioGroup";
RDebugUtils.currentLine=188874753;
 //BA.debugLineNum = 188874753;BA.debugLine="vmodel = k.tolowercase";
__ref._vmodel /*String*/  = _k.toLowerCase();
RDebugUtils.currentLine=188874754;
 //BA.debugLineNum = 188874754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=188874755;
 //BA.debugLineNum = 188874755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvalue(b4j.example.vmradiogroup __ref,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=188612608;
 //BA.debugLineNum = 188612608;BA.debugLine="Sub SetValue(v As Object) As VMRadioGroup";
RDebugUtils.currentLine=188612609;
 //BA.debugLineNum = 188612609;BA.debugLine="If vmodel = \"\" Then";
if ((__ref._vmodel /*String*/ ).equals("")) { 
RDebugUtils.currentLine=188612610;
 //BA.debugLineNum = 188612610;BA.debugLine="Log($\"VMRadioGroup.SetValue: '${ID}' - the vMode";
__c.Log(("VMRadioGroup.SetValue: '"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"' - the vModel has not been set!"));
 };
RDebugUtils.currentLine=188612612;
 //BA.debugLineNum = 188612612;BA.debugLine="vue.SetStateSingle(vmodel,v)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._vmodel /*String*/ ,_v);
RDebugUtils.currentLine=188612613;
 //BA.debugLineNum = 188612613;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=188612614;
 //BA.debugLineNum = 188612614;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _additems(b4j.example.vmradiogroup __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "additems", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "additems", new Object[] {_m}));}
String _k = "";
Object _v = null;
RDebugUtils.currentLine=188940288;
 //BA.debugLineNum = 188940288;BA.debugLine="Sub AddItems(m As Map) As VMRadioGroup";
RDebugUtils.currentLine=188940289;
 //BA.debugLineNum = 188940289;BA.debugLine="For Each k As String In m.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _m.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=188940290;
 //BA.debugLineNum = 188940290;BA.debugLine="Dim v As Object = m.Get(k)";
_v = _m.Get((Object)(_k));
RDebugUtils.currentLine=188940291;
 //BA.debugLineNum = 188940291;BA.debugLine="AddItem(k, v)";
__ref._additem /*b4j.example.vmradiogroup*/ (null,_k,BA.ObjectToString(_v));
 }
};
RDebugUtils.currentLine=188940293;
 //BA.debugLineNum = 188940293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=188940294;
 //BA.debugLineNum = 188940294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _settabindex(b4j.example.vmradiogroup __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=188678144;
 //BA.debugLineNum = 188678144;BA.debugLine="Sub SetTabIndex(ti As String) As VMRadioGroup";
RDebugUtils.currentLine=188678145;
 //BA.debugLineNum = 188678145;BA.debugLine="RadioGroup.SetTabIndex(ti)";
__ref._radiogroup /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=188678146;
 //BA.debugLineNum = 188678146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=188678147;
 //BA.debugLineNum = 188678147;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmradiogroup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=189071360;
 //BA.debugLineNum = 189071360;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=189071361;
 //BA.debugLineNum = 189071361;BA.debugLine="Return RadioGroup.tostring";
if (true) return __ref._radiogroup /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=189071362;
 //BA.debugLineNum = 189071362;BA.debugLine="End Sub";
return "";
}
public String  _setoptions(b4j.example.vmradiogroup __ref,anywheresoftware.b4a.objects.collections.Map _options) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((String) Debug.delegate(ba, "setoptions", new Object[] {_options}));}
String _k = "";
String _v = "";
RDebugUtils.currentLine=188481536;
 //BA.debugLineNum = 188481536;BA.debugLine="Sub SetOptions(options As Map)";
RDebugUtils.currentLine=188481537;
 //BA.debugLineNum = 188481537;BA.debugLine="For Each k As String In options.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _options.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=188481538;
 //BA.debugLineNum = 188481538;BA.debugLine="Dim v As String = options.Get(k)";
_v = BA.ObjectToString(_options.Get((Object)(_k)));
RDebugUtils.currentLine=188481539;
 //BA.debugLineNum = 188481539;BA.debugLine="AddItem(k, v)";
__ref._additem /*b4j.example.vmradiogroup*/ (null,_k,_v);
 }
};
RDebugUtils.currentLine=188481541;
 //BA.debugLineNum = 188481541;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmradiogroup __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=189202432;
 //BA.debugLineNum = 189202432;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=189202433;
 //BA.debugLineNum = 189202433;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=189202434;
 //BA.debugLineNum = 189202434;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _addchild(b4j.example.vmradiogroup __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=189399040;
 //BA.debugLineNum = 189399040;BA.debugLine="Sub AddChild(child As VMElement) As VMRadioGroup";
RDebugUtils.currentLine=189399041;
 //BA.debugLineNum = 189399041;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=189399042;
 //BA.debugLineNum = 189399042;BA.debugLine="RadioGroup.SetText(childHTML)";
__ref._radiogroup /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=189399043;
 //BA.debugLineNum = 189399043;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=189399044;
 //BA.debugLineNum = 189399044;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmradiogroup __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=189530112;
 //BA.debugLineNum = 189530112;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=189530113;
 //BA.debugLineNum = 189530113;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=189530114;
 //BA.debugLineNum = 189530114;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmradiogroup*/ (null,_childx);
 }
};
RDebugUtils.currentLine=189530116;
 //BA.debugLineNum = 189530116;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _addclass(b4j.example.vmradiogroup __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=188743680;
 //BA.debugLineNum = 188743680;BA.debugLine="Sub AddClass(c As String) As VMRadioGroup";
RDebugUtils.currentLine=188743681;
 //BA.debugLineNum = 188743681;BA.debugLine="RadioGroup.AddClass(c)";
__ref._radiogroup /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=188743682;
 //BA.debugLineNum = 188743682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=188743683;
 //BA.debugLineNum = 188743683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _additem(b4j.example.vmradiogroup __ref,String _k,String _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "additem", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "additem", new Object[] {_k,_v}));}
b4j.example.vmradio _el = null;
RDebugUtils.currentLine=189005824;
 //BA.debugLineNum = 189005824;BA.debugLine="Sub AddItem(k As String, v As String) As VMRadioGr";
RDebugUtils.currentLine=189005825;
 //BA.debugLineNum = 189005825;BA.debugLine="If vmodel = \"\" Then";
if ((__ref._vmodel /*String*/ ).equals("")) { 
RDebugUtils.currentLine=189005826;
 //BA.debugLineNum = 189005826;BA.debugLine="Log($\"VMRadioGroup.AddItem: '${ID}' - the vModel";
__c.Log(("VMRadioGroup.AddItem: '"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"' - the vModel has not been set!"));
 };
RDebugUtils.currentLine=189005828;
 //BA.debugLineNum = 189005828;BA.debugLine="Dim el As VMRadio";
_el = new b4j.example.vmradio();
RDebugUtils.currentLine=189005829;
 //BA.debugLineNum = 189005829;BA.debugLine="el.Initialize(vue, k, module)";
_el._initialize /*b4j.example.vmradio*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_k,__ref._module /*Object*/ );
RDebugUtils.currentLine=189005830;
 //BA.debugLineNum = 189005830;BA.debugLine="el.SetText(v)";
_el._settext /*b4j.example.vmradio*/ (null,_v);
RDebugUtils.currentLine=189005831;
 //BA.debugLineNum = 189005831;BA.debugLine="el.SetValue(k,False)";
_el._setvalue /*b4j.example.vmradio*/ (null,(Object)(_k),__c.False);
RDebugUtils.currentLine=189005832;
 //BA.debugLineNum = 189005832;BA.debugLine="el.SetPrimary(True)";
_el._setprimary /*b4j.example.vmradio*/ (null,__c.True);
RDebugUtils.currentLine=189005833;
 //BA.debugLineNum = 189005833;BA.debugLine="el.SetOnChange(ID)";
_el._setonchange /*b4j.example.vmradio*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=189005834;
 //BA.debugLineNum = 189005834;BA.debugLine="If designMode = False Then";
if (__ref._designmode /*boolean*/ ==__c.False) { 
RDebugUtils.currentLine=189005835;
 //BA.debugLineNum = 189005835;BA.debugLine="el.SetVModel(vmodel)";
_el._setvmodel /*b4j.example.vmradio*/ (null,__ref._vmodel /*String*/ );
 };
RDebugUtils.currentLine=189005837;
 //BA.debugLineNum = 189005837;BA.debugLine="el.Pop(RadioGroup)";
_el._pop /*String*/ (null,__ref._radiogroup /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=189005838;
 //BA.debugLineNum = 189005838;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=189005839;
 //BA.debugLineNum = 189005839;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmradiogroup __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=189661184;
 //BA.debugLineNum = 189661184;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=189661185;
 //BA.debugLineNum = 189661185;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=189661186;
 //BA.debugLineNum = 189661186;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmradiogroup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
RDebugUtils.currentLine=188350464;
 //BA.debugLineNum = 188350464;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=188350465;
 //BA.debugLineNum = 188350465;BA.debugLine="Private RadioGroup As VMElement";
_radiogroup = new b4j.example.vmelement();
RDebugUtils.currentLine=188350466;
 //BA.debugLineNum = 188350466;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=188350467;
 //BA.debugLineNum = 188350467;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=188350468;
 //BA.debugLineNum = 188350468;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
RDebugUtils.currentLine=188350469;
 //BA.debugLineNum = 188350469;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=188350470;
 //BA.debugLineNum = 188350470;BA.debugLine="Private vmodel As String";
_vmodel = "";
RDebugUtils.currentLine=188350471;
 //BA.debugLineNum = 188350471;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=188350472;
 //BA.debugLineNum = 188350472;BA.debugLine="Private designMode As Boolean";
_designmode = false;
RDebugUtils.currentLine=188350473;
 //BA.debugLineNum = 188350473;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=188350474;
 //BA.debugLineNum = 188350474;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmradiogroup __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=189136896;
 //BA.debugLineNum = 189136896;BA.debugLine="Sub Render";
RDebugUtils.currentLine=189136897;
 //BA.debugLineNum = 189136897;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=189136898;
 //BA.debugLineNum = 189136898;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradiogroup  _setattr(b4j.example.vmradiogroup __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=188809216;
 //BA.debugLineNum = 188809216;BA.debugLine="Sub SetAttr(attr As Map) As VMRadioGroup";
RDebugUtils.currentLine=188809217;
 //BA.debugLineNum = 188809217;BA.debugLine="RadioGroup.SetAttr(attr)";
__ref._radiogroup /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=188809218;
 //BA.debugLineNum = 188809218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=188809219;
 //BA.debugLineNum = 188809219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setdisabled(b4j.example.vmradiogroup __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=189595648;
 //BA.debugLineNum = 189595648;BA.debugLine="Sub SetDisabled(b As Boolean) As VMRadioGroup";
RDebugUtils.currentLine=189595649;
 //BA.debugLineNum = 189595649;BA.debugLine="RadioGroup.SetDisabled(b)";
__ref._radiogroup /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=189595650;
 //BA.debugLineNum = 189595650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=189595651;
 //BA.debugLineNum = 189595651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setstyle(b4j.example.vmradiogroup __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=189464576;
 //BA.debugLineNum = 189464576;BA.debugLine="Sub SetStyle(sm As Map) As VMRadioGroup";
RDebugUtils.currentLine=189464577;
 //BA.debugLineNum = 189464577;BA.debugLine="RadioGroup.SetStyle(sm)";
__ref._radiogroup /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=189464578;
 //BA.debugLineNum = 189464578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=189464579;
 //BA.debugLineNum = 189464579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradiogroup  _setvif(b4j.example.vmradiogroup __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradiogroup";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmradiogroup) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=189267968;
 //BA.debugLineNum = 189267968;BA.debugLine="Sub SetVIf(vif As String) As VMRadioGroup";
RDebugUtils.currentLine=189267969;
 //BA.debugLineNum = 189267969;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmradiogroup)(this);};
RDebugUtils.currentLine=189267970;
 //BA.debugLineNum = 189267970;BA.debugLine="RadioGroup.SetVIf(vif)";
__ref._radiogroup /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=189267971;
 //BA.debugLineNum = 189267971;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradiogroup)(this);
RDebugUtils.currentLine=189267972;
 //BA.debugLineNum = 189267972;BA.debugLine="End Sub";
return null;
}
}