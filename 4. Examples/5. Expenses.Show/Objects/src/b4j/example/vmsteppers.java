package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsteppers extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmsteppers", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmsteppers.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _steppers = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _actkey = "";
public Object _module = null;
public anywheresoftware.b4a.objects.collections.Map _steps = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmsteppers  _initialize(b4j.example.vmsteppers __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=202768384;
 //BA.debugLineNum = 202768384;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=202768385;
 //BA.debugLineNum = 202768385;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=202768386;
 //BA.debugLineNum = 202768386;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=202768387;
 //BA.debugLineNum = 202768387;BA.debugLine="Steppers.Initialize(v, ID)";
__ref._steppers /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=202768388;
 //BA.debugLineNum = 202768388;BA.debugLine="Steppers.SetTag(\"md-steppers\")";
__ref._steppers /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-steppers");
RDebugUtils.currentLine=202768389;
 //BA.debugLineNum = 202768389;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=202768390;
 //BA.debugLineNum = 202768390;BA.debugLine="actKey = $\"${ID}active\"$";
__ref._actkey /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"active");
RDebugUtils.currentLine=202768391;
 //BA.debugLineNum = 202768391;BA.debugLine="SetOnChanged";
__ref._setonchanged /*b4j.example.vmsteppers*/ (null);
RDebugUtils.currentLine=202768392;
 //BA.debugLineNum = 202768392;BA.debugLine="SetActiveStepSync";
__ref._setactivestepsync /*b4j.example.vmsteppers*/ (null);
RDebugUtils.currentLine=202768393;
 //BA.debugLineNum = 202768393;BA.debugLine="steps.initialize";
__ref._steps /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=202768394;
 //BA.debugLineNum = 202768394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=202768395;
 //BA.debugLineNum = 202768395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _addchild(b4j.example.vmsteppers __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=203685888;
 //BA.debugLineNum = 203685888;BA.debugLine="Sub AddChild(child As VMElement) As VMSteppers";
RDebugUtils.currentLine=203685889;
 //BA.debugLineNum = 203685889;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=203685890;
 //BA.debugLineNum = 203685890;BA.debugLine="Steppers.SetText(childHTML)";
__ref._steppers /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=203685891;
 //BA.debugLineNum = 203685891;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203685892;
 //BA.debugLineNum = 203685892;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmsteppers __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=204079104;
 //BA.debugLineNum = 204079104;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=204079105;
 //BA.debugLineNum = 204079105;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=204079106;
 //BA.debugLineNum = 204079106;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmsteppers*/ (null,_childx);
 }
};
RDebugUtils.currentLine=204079108;
 //BA.debugLineNum = 204079108;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppers  _addclass(b4j.example.vmsteppers __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=203882496;
 //BA.debugLineNum = 203882496;BA.debugLine="Sub AddClass(c As String) As VMSteppers";
RDebugUtils.currentLine=203882497;
 //BA.debugLineNum = 203882497;BA.debugLine="Steppers.AddClass(c)";
__ref._steppers /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=203882498;
 //BA.debugLineNum = 203882498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203882499;
 //BA.debugLineNum = 203882499;BA.debugLine="End Sub";
return null;
}
public String  _addstep(b4j.example.vmsteppers __ref,String _stepid,String _steplabel,String _stepdescription,boolean _stepeditable,String _stepcontent) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "addstep", true))
	 {return ((String) Debug.delegate(ba, "addstep", new Object[] {_stepid,_steplabel,_stepdescription,_stepeditable,_stepcontent}));}
b4j.example.vmstepitem _stepitem = null;
RDebugUtils.currentLine=202964992;
 //BA.debugLineNum = 202964992;BA.debugLine="Sub AddStep(stepID As String, stepLabel As String,";
RDebugUtils.currentLine=202964993;
 //BA.debugLineNum = 202964993;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=202964994;
 //BA.debugLineNum = 202964994;BA.debugLine="steps.put(stepID, stepID)";
__ref._steps /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_stepid),(Object)(_stepid));
RDebugUtils.currentLine=202964995;
 //BA.debugLineNum = 202964995;BA.debugLine="Dim stepitem As VMStepItem";
_stepitem = new b4j.example.vmstepitem();
RDebugUtils.currentLine=202964996;
 //BA.debugLineNum = 202964996;BA.debugLine="stepitem.Initialize(vue, stepID, module)";
_stepitem._initialize /*b4j.example.vmstepitem*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,_stepid,__ref._module /*Object*/ );
RDebugUtils.currentLine=202964997;
 //BA.debugLineNum = 202964997;BA.debugLine="stepitem.SetLabel(stepLabel)";
_stepitem._setlabel /*b4j.example.vmstepitem*/ (null,_steplabel);
RDebugUtils.currentLine=202964998;
 //BA.debugLineNum = 202964998;BA.debugLine="If stepContent <> Null Then";
if (_stepcontent!= null) { 
RDebugUtils.currentLine=202964999;
 //BA.debugLineNum = 202964999;BA.debugLine="stepitem.SetContent(stepContent)";
_stepitem._setcontent /*b4j.example.vmstepitem*/ (null,_stepcontent);
 };
RDebugUtils.currentLine=202965001;
 //BA.debugLineNum = 202965001;BA.debugLine="stepitem.SetDescription(stepDescription)";
_stepitem._setdescription /*b4j.example.vmstepitem*/ (null,(Object)(_stepdescription));
RDebugUtils.currentLine=202965002;
 //BA.debugLineNum = 202965002;BA.debugLine="stepitem.SetEditable(stepEditable)";
_stepitem._seteditable /*b4j.example.vmstepitem*/ (null,_stepeditable);
RDebugUtils.currentLine=202965003;
 //BA.debugLineNum = 202965003;BA.debugLine="stepitem.Pop(Steppers)";
_stepitem._pop /*String*/ (null,__ref._steppers /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=202965004;
 //BA.debugLineNum = 202965004;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmsteppers __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=204865536;
 //BA.debugLineNum = 204865536;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=204865537;
 //BA.debugLineNum = 204865537;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=204865538;
 //BA.debugLineNum = 204865538;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmsteppers __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=203423744;
 //BA.debugLineNum = 203423744;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=203423745;
 //BA.debugLineNum = 203423745;BA.debugLine="Return Steppers.ToString";
if (true) return __ref._steppers /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=203423746;
 //BA.debugLineNum = 203423746;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmsteppers __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
RDebugUtils.currentLine=202702848;
 //BA.debugLineNum = 202702848;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=202702849;
 //BA.debugLineNum = 202702849;BA.debugLine="Public Steppers As VMElement";
_steppers = new b4j.example.vmelement();
RDebugUtils.currentLine=202702850;
 //BA.debugLineNum = 202702850;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=202702851;
 //BA.debugLineNum = 202702851;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=202702852;
 //BA.debugLineNum = 202702852;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=202702853;
 //BA.debugLineNum = 202702853;BA.debugLine="Private actKey As String";
_actkey = "";
RDebugUtils.currentLine=202702854;
 //BA.debugLineNum = 202702854;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=202702855;
 //BA.debugLineNum = 202702855;BA.debugLine="Private steps As Map";
_steps = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=202702856;
 //BA.debugLineNum = 202702856;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppers  _hidestep(b4j.example.vmsteppers __ref,String _stepid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "hidestep", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "hidestep", new Object[] {_stepid}));}
String _stepshow = "";
RDebugUtils.currentLine=203292672;
 //BA.debugLineNum = 203292672;BA.debugLine="Sub HideStep(stepID As String) As VMSteppers";
RDebugUtils.currentLine=203292673;
 //BA.debugLineNum = 203292673;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=203292674;
 //BA.debugLineNum = 203292674;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"show");
RDebugUtils.currentLine=203292675;
 //BA.debugLineNum = 203292675;BA.debugLine="vue.SetStateSingle(stepShow, False)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(__c.False));
RDebugUtils.currentLine=203292676;
 //BA.debugLineNum = 203292676;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203292677;
 //BA.debugLineNum = 203292677;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setonchanged(b4j.example.vmsteppers __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setonchanged", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setonchanged", null));}
String _stepid = "";
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=204800000;
 //BA.debugLineNum = 204800000;BA.debugLine="private Sub SetOnChanged As VMSteppers";
RDebugUtils.currentLine=204800001;
 //BA.debugLineNum = 204800001;BA.debugLine="Dim stepID As String = \"\"";
_stepid = "";
RDebugUtils.currentLine=204800002;
 //BA.debugLineNum = 204800002;BA.debugLine="Dim methodName As String  = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_change");
RDebugUtils.currentLine=204800003;
 //BA.debugLineNum = 204800003;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmsteppers)(this);};
RDebugUtils.currentLine=204800004;
 //BA.debugLineNum = 204800004;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_stepid)}))));
RDebugUtils.currentLine=204800005;
 //BA.debugLineNum = 204800005;BA.debugLine="SetAttr(CreateMap(\"v-on:md-changed\": methodName))";
__ref._setattr /*b4j.example.vmsteppers*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-changed"),(Object)(_methodname)}));
RDebugUtils.currentLine=204800007;
 //BA.debugLineNum = 204800007;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=204800008;
 //BA.debugLineNum = 204800008;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204800009;
 //BA.debugLineNum = 204800009;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setactivestepsync(b4j.example.vmsteppers __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setactivestepsync", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setactivestepsync", null));}
RDebugUtils.currentLine=202899456;
 //BA.debugLineNum = 202899456;BA.debugLine="private Sub SetActiveStepSync As VMSteppers";
RDebugUtils.currentLine=202899457;
 //BA.debugLineNum = 202899457;BA.debugLine="vue.SetStateSingle(actKey, Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._actkey /*String*/ ,__c.Null);
RDebugUtils.currentLine=202899458;
 //BA.debugLineNum = 202899458;BA.debugLine="SetAttr(CreateMap(\":md-active-step.sync\": actKey)";
__ref._setattr /*b4j.example.vmsteppers*/ (null,__c.createMap(new Object[] {(Object)(":md-active-step.sync"),(Object)(__ref._actkey /*String*/ )}));
RDebugUtils.currentLine=202899459;
 //BA.debugLineNum = 202899459;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=202899460;
 //BA.debugLineNum = 202899460;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmsteppers __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=203816960;
 //BA.debugLineNum = 203816960;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=203816961;
 //BA.debugLineNum = 203816961;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=203816962;
 //BA.debugLineNum = 203816962;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmsteppers __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=203620352;
 //BA.debugLineNum = 203620352;BA.debugLine="Sub Render";
RDebugUtils.currentLine=203620353;
 //BA.debugLineNum = 203620353;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=203620354;
 //BA.debugLineNum = 203620354;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppers  _setattr(b4j.example.vmsteppers __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=203948032;
 //BA.debugLineNum = 203948032;BA.debugLine="Sub SetAttr(attr As Map) As VMSteppers";
RDebugUtils.currentLine=203948033;
 //BA.debugLineNum = 203948033;BA.debugLine="Steppers.SetAttr(attr)";
__ref._steppers /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=203948034;
 //BA.debugLineNum = 203948034;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203948035;
 //BA.debugLineNum = 203948035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setalternative(b4j.example.vmsteppers __ref,boolean _varalternative) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setalternative", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setalternative", new Object[] {_varalternative}));}
RDebugUtils.currentLine=204537856;
 //BA.debugLineNum = 204537856;BA.debugLine="Sub SetAlternative(varAlternative As Boolean) As V";
RDebugUtils.currentLine=204537857;
 //BA.debugLineNum = 204537857;BA.debugLine="SetAttr(CreateMap(\":md-alternative\": varAlternati";
__ref._setattr /*b4j.example.vmsteppers*/ (null,__c.createMap(new Object[] {(Object)(":md-alternative"),(Object)(_varalternative)}));
RDebugUtils.currentLine=204537858;
 //BA.debugLineNum = 204537858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204537859;
 //BA.debugLineNum = 204537859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setdynamicheight(b4j.example.vmsteppers __ref,boolean _vardynamicheight) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setdynamicheight", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setdynamicheight", new Object[] {_vardynamicheight}));}
RDebugUtils.currentLine=204734464;
 //BA.debugLineNum = 204734464;BA.debugLine="Sub SetDynamicHeight(varDynamicHeight As Boolean)";
RDebugUtils.currentLine=204734465;
 //BA.debugLineNum = 204734465;BA.debugLine="SetAttr(CreateMap(\":md-dynamic-height\": varDynami";
__ref._setattr /*b4j.example.vmsteppers*/ (null,__c.createMap(new Object[] {(Object)(":md-dynamic-height"),(Object)(_vardynamicheight)}));
RDebugUtils.currentLine=204734466;
 //BA.debugLineNum = 204734466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204734467;
 //BA.debugLineNum = 204734467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setelevation(b4j.example.vmsteppers __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=203030528;
 //BA.debugLineNum = 203030528;BA.debugLine="Sub SetElevation(e As Int) As VMSteppers";
RDebugUtils.currentLine=203030529;
 //BA.debugLineNum = 203030529;BA.debugLine="Steppers.SetElevation(e)";
__ref._steppers /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=203030530;
 //BA.debugLineNum = 203030530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203030531;
 //BA.debugLineNum = 203030531;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setkey(b4j.example.vmsteppers __ref,String _mdlname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setkey", new Object[] {_mdlname}));}
RDebugUtils.currentLine=202833920;
 //BA.debugLineNum = 202833920;BA.debugLine="Sub SetKey(mdlName As String) As VMSteppers";
RDebugUtils.currentLine=202833921;
 //BA.debugLineNum = 202833921;BA.debugLine="mdlName = mdlName.tolowercase";
_mdlname = _mdlname.toLowerCase();
RDebugUtils.currentLine=202833922;
 //BA.debugLineNum = 202833922;BA.debugLine="SetAttr(CreateMap(\":key\": mdlName))";
__ref._setattr /*b4j.example.vmsteppers*/ (null,__c.createMap(new Object[] {(Object)(":key"),(Object)(_mdlname)}));
RDebugUtils.currentLine=202833923;
 //BA.debugLineNum = 202833923;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=202833924;
 //BA.debugLineNum = 202833924;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setlinear(b4j.example.vmsteppers __ref,boolean _varlinear) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setlinear", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setlinear", new Object[] {_varlinear}));}
RDebugUtils.currentLine=204668928;
 //BA.debugLineNum = 204668928;BA.debugLine="Sub SetLinear(varLinear As Boolean) As VMSteppers";
RDebugUtils.currentLine=204668929;
 //BA.debugLineNum = 204668929;BA.debugLine="SetAttr(CreateMap(\":md-linear\": varLinear))";
__ref._setattr /*b4j.example.vmsteppers*/ (null,__c.createMap(new Object[] {(Object)(":md-linear"),(Object)(_varlinear)}));
RDebugUtils.currentLine=204668930;
 //BA.debugLineNum = 204668930;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204668931;
 //BA.debugLineNum = 204668931;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setmargin(b4j.example.vmsteppers __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setmargin", new Object[] {_p}));}
RDebugUtils.currentLine=204210176;
 //BA.debugLineNum = 204210176;BA.debugLine="Sub SetMargin(p As Object) As VMSteppers";
RDebugUtils.currentLine=204210177;
 //BA.debugLineNum = 204210177;BA.debugLine="Steppers.SetMarginAll(p)";
__ref._steppers /*b4j.example.vmelement*/ ._setmarginall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=204210178;
 //BA.debugLineNum = 204210178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204210179;
 //BA.debugLineNum = 204210179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setpadding(b4j.example.vmsteppers __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=204144640;
 //BA.debugLineNum = 204144640;BA.debugLine="Sub SetPadding(p As Object) As VMSteppers";
RDebugUtils.currentLine=204144641;
 //BA.debugLineNum = 204144641;BA.debugLine="Steppers.SetPaddingAll(p)";
__ref._steppers /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=204144642;
 //BA.debugLineNum = 204144642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204144643;
 //BA.debugLineNum = 204144643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstepactive(b4j.example.vmsteppers __ref,String _varactivestep) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setstepactive", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setstepactive", new Object[] {_varactivestep}));}
String _stepa = "";
RDebugUtils.currentLine=204406784;
 //BA.debugLineNum = 204406784;BA.debugLine="Sub SetStepActive(varActiveStep As String) As VMSt";
RDebugUtils.currentLine=204406785;
 //BA.debugLineNum = 204406785;BA.debugLine="varActiveStep = varActiveStep.tolowercase";
_varactivestep = _varactivestep.toLowerCase();
RDebugUtils.currentLine=204406786;
 //BA.debugLineNum = 204406786;BA.debugLine="vue.SetStateSingle(actKey, varActiveStep)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._actkey /*String*/ ,(Object)(_varactivestep));
RDebugUtils.currentLine=204406787;
 //BA.debugLineNum = 204406787;BA.debugLine="for each stepa as string in steps.keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = __ref._steps /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stepa = BA.ObjectToString(group3.Get(index3));
RDebugUtils.currentLine=204406788;
 //BA.debugLineNum = 204406788;BA.debugLine="if stepa = varactivestep then";
if ((_stepa).equals(_varactivestep)) { 
 }else {
RDebugUtils.currentLine=204406790;
 //BA.debugLineNum = 204406790;BA.debugLine="SetStepDone(stepa, false)";
__ref._setstepdone /*b4j.example.vmsteppers*/ (null,_stepa,__c.False);
 };
 }
};
RDebugUtils.currentLine=204406793;
 //BA.debugLineNum = 204406793;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204406794;
 //BA.debugLineNum = 204406794;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstepdone(b4j.example.vmsteppers __ref,String _stepdone,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setstepdone", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setstepdone", new Object[] {_stepdone,_b}));}
String _dd = "";
RDebugUtils.currentLine=204341248;
 //BA.debugLineNum = 204341248;BA.debugLine="Sub SetStepDone(stepDone As String, b As Boolean)";
RDebugUtils.currentLine=204341249;
 //BA.debugLineNum = 204341249;BA.debugLine="stepDone = stepDone.tolowercase";
_stepdone = _stepdone.toLowerCase();
RDebugUtils.currentLine=204341250;
 //BA.debugLineNum = 204341250;BA.debugLine="Dim dd As String = $\"${stepDone}done\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(_stepdone))+"done");
RDebugUtils.currentLine=204341251;
 //BA.debugLineNum = 204341251;BA.debugLine="vue.SetStateSingle(dd, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_dd,(Object)(_b));
RDebugUtils.currentLine=204341252;
 //BA.debugLineNum = 204341252;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204341253;
 //BA.debugLineNum = 204341253;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstepdescription(b4j.example.vmsteppers __ref,String _stepid,String _stepeditable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setstepdescription", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setstepdescription", new Object[] {_stepid,_stepeditable}));}
String _stepshow = "";
RDebugUtils.currentLine=203161600;
 //BA.debugLineNum = 203161600;BA.debugLine="Sub SetStepDescription(stepID As String, stepEdita";
RDebugUtils.currentLine=203161601;
 //BA.debugLineNum = 203161601;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=203161602;
 //BA.debugLineNum = 203161602;BA.debugLine="Dim stepShow As String = $\"${stepID}description\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"description");
RDebugUtils.currentLine=203161603;
 //BA.debugLineNum = 203161603;BA.debugLine="vue.SetStateSingle(stepShow, stepEditable)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(_stepeditable));
RDebugUtils.currentLine=203161604;
 //BA.debugLineNum = 203161604;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203161605;
 //BA.debugLineNum = 203161605;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstepeditable(b4j.example.vmsteppers __ref,String _stepid,boolean _stepeditable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setstepeditable", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setstepeditable", new Object[] {_stepid,_stepeditable}));}
String _stepshow = "";
RDebugUtils.currentLine=203096064;
 //BA.debugLineNum = 203096064;BA.debugLine="Sub SetStepEditable(stepID As String, stepEditable";
RDebugUtils.currentLine=203096065;
 //BA.debugLineNum = 203096065;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=203096066;
 //BA.debugLineNum = 203096066;BA.debugLine="Dim stepShow As String = $\"${stepID}editable\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"editable");
RDebugUtils.currentLine=203096067;
 //BA.debugLineNum = 203096067;BA.debugLine="vue.SetStateSingle(stepShow, stepEditable)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(_stepeditable));
RDebugUtils.currentLine=203096068;
 //BA.debugLineNum = 203096068;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203096069;
 //BA.debugLineNum = 203096069;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setsteperror(b4j.example.vmsteppers __ref,String _stepid,String _steperror) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setsteperror", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setsteperror", new Object[] {_stepid,_steperror}));}
String _dd = "";
RDebugUtils.currentLine=204275712;
 //BA.debugLineNum = 204275712;BA.debugLine="Sub SetStepError(stepID As String, stepError As St";
RDebugUtils.currentLine=204275713;
 //BA.debugLineNum = 204275713;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=204275714;
 //BA.debugLineNum = 204275714;BA.debugLine="Dim dd As String = $\"${stepID}error\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"error");
RDebugUtils.currentLine=204275715;
 //BA.debugLineNum = 204275715;BA.debugLine="vue.SetStateSingle(dd, stepError)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_dd,(Object)(_steperror));
RDebugUtils.currentLine=204275716;
 //BA.debugLineNum = 204275716;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204275717;
 //BA.debugLineNum = 204275717;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setsteplabel(b4j.example.vmsteppers __ref,String _stepid,String _steplabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setsteplabel", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setsteplabel", new Object[] {_stepid,_steplabel}));}
String _stepshow = "";
RDebugUtils.currentLine=203227136;
 //BA.debugLineNum = 203227136;BA.debugLine="Sub SetStepLabel(stepID As String, stepLabel As St";
RDebugUtils.currentLine=203227137;
 //BA.debugLineNum = 203227137;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=203227138;
 //BA.debugLineNum = 203227138;BA.debugLine="Dim stepShow As String = $\"${stepID}label\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"label");
RDebugUtils.currentLine=203227139;
 //BA.debugLineNum = 203227139;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(_steplabel));
RDebugUtils.currentLine=203227140;
 //BA.debugLineNum = 203227140;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203227141;
 //BA.debugLineNum = 203227141;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstyle(b4j.example.vmsteppers __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=204013568;
 //BA.debugLineNum = 204013568;BA.debugLine="Sub SetStyle(sm As Map) As VMSteppers";
RDebugUtils.currentLine=204013569;
 //BA.debugLineNum = 204013569;BA.debugLine="Steppers.SetStyle(sm)";
__ref._steppers /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=204013570;
 //BA.debugLineNum = 204013570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204013571;
 //BA.debugLineNum = 204013571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setsyncroute(b4j.example.vmsteppers __ref,boolean _varsyncroute) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setsyncroute", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setsyncroute", new Object[] {_varsyncroute}));}
RDebugUtils.currentLine=204472320;
 //BA.debugLineNum = 204472320;BA.debugLine="Sub SetSyncRoute(varSyncRoute As Boolean) As VMSte";
RDebugUtils.currentLine=204472321;
 //BA.debugLineNum = 204472321;BA.debugLine="SetAttr(CreateMap(\":md-sync-route\": varSyncRoute)";
__ref._setattr /*b4j.example.vmsteppers*/ (null,__c.createMap(new Object[] {(Object)(":md-sync-route"),(Object)(_varsyncroute)}));
RDebugUtils.currentLine=204472322;
 //BA.debugLineNum = 204472322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204472323;
 //BA.debugLineNum = 204472323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _settext(b4j.example.vmsteppers __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=203751424;
 //BA.debugLineNum = 203751424;BA.debugLine="Sub SetText(t As Object) As VMSteppers";
RDebugUtils.currentLine=203751425;
 //BA.debugLineNum = 203751425;BA.debugLine="Steppers.SetText(t)";
__ref._steppers /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=203751426;
 //BA.debugLineNum = 203751426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203751427;
 //BA.debugLineNum = 203751427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setvertical(b4j.example.vmsteppers __ref,boolean _varvertical) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setvertical", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setvertical", new Object[] {_varvertical}));}
RDebugUtils.currentLine=204603392;
 //BA.debugLineNum = 204603392;BA.debugLine="Sub SetVertical(varVertical As Boolean) As VMStepp";
RDebugUtils.currentLine=204603393;
 //BA.debugLineNum = 204603393;BA.debugLine="SetAttr(CreateMap(\":md-vertical\": varVertical))";
__ref._setattr /*b4j.example.vmsteppers*/ (null,__c.createMap(new Object[] {(Object)(":md-vertical"),(Object)(_varvertical)}));
RDebugUtils.currentLine=204603394;
 //BA.debugLineNum = 204603394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=204603395;
 //BA.debugLineNum = 204603395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setvif(b4j.example.vmsteppers __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=203489280;
 //BA.debugLineNum = 203489280;BA.debugLine="Sub SetVIf(vif As Object) As VMSteppers";
RDebugUtils.currentLine=203489281;
 //BA.debugLineNum = 203489281;BA.debugLine="Steppers.SetVIf(vif)";
__ref._steppers /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=203489282;
 //BA.debugLineNum = 203489282;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203489283;
 //BA.debugLineNum = 203489283;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setvshow(b4j.example.vmsteppers __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=203554816;
 //BA.debugLineNum = 203554816;BA.debugLine="Sub SetVShow(vif As Object) As VMSteppers";
RDebugUtils.currentLine=203554817;
 //BA.debugLineNum = 203554817;BA.debugLine="Steppers.SetVShow(vif)";
__ref._steppers /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=203554818;
 //BA.debugLineNum = 203554818;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203554819;
 //BA.debugLineNum = 203554819;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _showstep(b4j.example.vmsteppers __ref,String _stepid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmsteppers";
if (Debug.shouldDelegate(ba, "showstep", true))
	 {return ((b4j.example.vmsteppers) Debug.delegate(ba, "showstep", new Object[] {_stepid}));}
String _stepshow = "";
RDebugUtils.currentLine=203358208;
 //BA.debugLineNum = 203358208;BA.debugLine="Sub ShowStep(stepID As String) As VMSteppers";
RDebugUtils.currentLine=203358209;
 //BA.debugLineNum = 203358209;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
RDebugUtils.currentLine=203358210;
 //BA.debugLineNum = 203358210;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"show");
RDebugUtils.currentLine=203358211;
 //BA.debugLineNum = 203358211;BA.debugLine="vue.SetStateSingle(stepShow, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_stepshow,(Object)(__c.True));
RDebugUtils.currentLine=203358212;
 //BA.debugLineNum = 203358212;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
RDebugUtils.currentLine=203358213;
 //BA.debugLineNum = 203358213;BA.debugLine="End Sub";
return null;
}
}