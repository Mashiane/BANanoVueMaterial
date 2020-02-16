package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmstepitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmstepitem", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmstepitem.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _stepitem = null;
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
public b4j.example.vmstepitem  _initialize(b4j.example.vmstepitem __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=201129984;
 //BA.debugLineNum = 201129984;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=201129985;
 //BA.debugLineNum = 201129985;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=201129986;
 //BA.debugLineNum = 201129986;BA.debugLine="StepItem.Initialize(v, ID)";
__ref._stepitem /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=201129987;
 //BA.debugLineNum = 201129987;BA.debugLine="StepItem.SetTag(\"md-step\")";
__ref._stepitem /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-step");
RDebugUtils.currentLine=201129988;
 //BA.debugLineNum = 201129988;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=201129989;
 //BA.debugLineNum = 201129989;BA.debugLine="SetId(ID)";
__ref._setid /*b4j.example.vmstepitem*/ (null,(Object)(__ref._id /*String*/ ));
RDebugUtils.currentLine=201129990;
 //BA.debugLineNum = 201129990;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=201129991;
 //BA.debugLineNum = 201129991;BA.debugLine="SetDoneSync(False)";
__ref._setdonesync /*b4j.example.vmstepitem*/ (null,__c.False);
RDebugUtils.currentLine=201129992;
 //BA.debugLineNum = 201129992;BA.debugLine="SetError(Null)";
__ref._seterror /*b4j.example.vmstepitem*/ (null,BA.ObjectToString(__c.Null));
RDebugUtils.currentLine=201129993;
 //BA.debugLineNum = 201129993;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201129994;
 //BA.debugLineNum = 201129994;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _addchild(b4j.example.vmstepitem __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=201654272;
 //BA.debugLineNum = 201654272;BA.debugLine="Sub AddChild(child As VMElement) As VMStepItem";
RDebugUtils.currentLine=201654273;
 //BA.debugLineNum = 201654273;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=201654274;
 //BA.debugLineNum = 201654274;BA.debugLine="StepItem.SetText(childHTML)";
__ref._stepitem /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=201654275;
 //BA.debugLineNum = 201654275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201654276;
 //BA.debugLineNum = 201654276;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmstepitem __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=202113024;
 //BA.debugLineNum = 202113024;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=202113025;
 //BA.debugLineNum = 202113025;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=202113026;
 //BA.debugLineNum = 202113026;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmstepitem*/ (null,_childx);
 }
};
RDebugUtils.currentLine=202113028;
 //BA.debugLineNum = 202113028;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepitem  _addclass(b4j.example.vmstepitem __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=201916416;
 //BA.debugLineNum = 201916416;BA.debugLine="Sub AddClass(c As String) As VMStepItem";
RDebugUtils.currentLine=201916417;
 //BA.debugLineNum = 201916417;BA.debugLine="StepItem.AddClass(c)";
__ref._stepitem /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=201916418;
 //BA.debugLineNum = 201916418;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201916419;
 //BA.debugLineNum = 201916419;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmstepitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
RDebugUtils.currentLine=201064448;
 //BA.debugLineNum = 201064448;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=201064449;
 //BA.debugLineNum = 201064449;BA.debugLine="Public StepItem As VMElement";
_stepitem = new b4j.example.vmelement();
RDebugUtils.currentLine=201064450;
 //BA.debugLineNum = 201064450;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=201064451;
 //BA.debugLineNum = 201064451;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=201064452;
 //BA.debugLineNum = 201064452;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=201064453;
 //BA.debugLineNum = 201064453;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=201064454;
 //BA.debugLineNum = 201064454;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepitem  _setid(b4j.example.vmstepitem __ref,Object _varid) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setid", new Object[] {_varid}));}
RDebugUtils.currentLine=202244096;
 //BA.debugLineNum = 202244096;BA.debugLine="Sub SetId(varId As Object) As VMStepItem";
RDebugUtils.currentLine=202244097;
 //BA.debugLineNum = 202244097;BA.debugLine="SetAttr(CreateMap(\"id\": varId))";
__ref._setattr /*b4j.example.vmstepitem*/ (null,__c.createMap(new Object[] {(Object)("id"),_varid}));
RDebugUtils.currentLine=202244098;
 //BA.debugLineNum = 202244098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=202244099;
 //BA.debugLineNum = 202244099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setdonesync(b4j.example.vmstepitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setdonesync", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setdonesync", new Object[] {_b}));}
String _done = "";
RDebugUtils.currentLine=202440704;
 //BA.debugLineNum = 202440704;BA.debugLine="private Sub SetDoneSync(b As Boolean) As VMStepIte";
RDebugUtils.currentLine=202440705;
 //BA.debugLineNum = 202440705;BA.debugLine="Dim done As String = $\"${ID}done\"$";
_done = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"done");
RDebugUtils.currentLine=202440706;
 //BA.debugLineNum = 202440706;BA.debugLine="vue.SetStateSingle(done, b)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_done,(Object)(_b));
RDebugUtils.currentLine=202440707;
 //BA.debugLineNum = 202440707;BA.debugLine="SetAttr(CreateMap(\":md-done.sync\":done))";
__ref._setattr /*b4j.example.vmstepitem*/ (null,__c.createMap(new Object[] {(Object)(":md-done.sync"),(Object)(_done)}));
RDebugUtils.currentLine=202440708;
 //BA.debugLineNum = 202440708;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=202440709;
 //BA.debugLineNum = 202440709;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _seterror(b4j.example.vmstepitem __ref,String _varerror) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "seterror", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "seterror", new Object[] {_varerror}));}
String _dd = "";
RDebugUtils.currentLine=202571776;
 //BA.debugLineNum = 202571776;BA.debugLine="Sub SetError(varError As String) As VMStepItem";
RDebugUtils.currentLine=202571777;
 //BA.debugLineNum = 202571777;BA.debugLine="Dim dd As String = $\"${ID}error\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"error");
RDebugUtils.currentLine=202571778;
 //BA.debugLineNum = 202571778;BA.debugLine="vue.SetStateSingle(dd, varError)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_dd,(Object)(_varerror));
RDebugUtils.currentLine=202571779;
 //BA.debugLineNum = 202571779;BA.debugLine="SetAttr(CreateMap(\":md-error\": dd))";
__ref._setattr /*b4j.example.vmstepitem*/ (null,__c.createMap(new Object[] {(Object)(":md-error"),(Object)(_dd)}));
RDebugUtils.currentLine=202571780;
 //BA.debugLineNum = 202571780;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=202571781;
 //BA.debugLineNum = 202571781;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmstepitem __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=201850880;
 //BA.debugLineNum = 201850880;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=201850881;
 //BA.debugLineNum = 201850881;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=201850882;
 //BA.debugLineNum = 201850882;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmstepitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=201326592;
 //BA.debugLineNum = 201326592;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=201326593;
 //BA.debugLineNum = 201326593;BA.debugLine="Return StepItem.ToString";
if (true) return __ref._stepitem /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=201326594;
 //BA.debugLineNum = 201326594;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmstepitem __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=201588736;
 //BA.debugLineNum = 201588736;BA.debugLine="Sub Render";
RDebugUtils.currentLine=201588737;
 //BA.debugLineNum = 201588737;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=201588738;
 //BA.debugLineNum = 201588738;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepitem  _setaccent(b4j.example.vmstepitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=201785344;
 //BA.debugLineNum = 201785344;BA.debugLine="Sub SetAccent(b As Boolean) As VMStepItem";
RDebugUtils.currentLine=201785345;
 //BA.debugLineNum = 201785345;BA.debugLine="StepItem.SetAccent(True)";
__ref._stepitem /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=201785346;
 //BA.debugLineNum = 201785346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201785347;
 //BA.debugLineNum = 201785347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setattr(b4j.example.vmstepitem __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=201981952;
 //BA.debugLineNum = 201981952;BA.debugLine="Sub SetAttr(attr As Map) As VMStepItem";
RDebugUtils.currentLine=201981953;
 //BA.debugLineNum = 201981953;BA.debugLine="StepItem.SetAttr(attr)";
__ref._stepitem /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=201981954;
 //BA.debugLineNum = 201981954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201981955;
 //BA.debugLineNum = 201981955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setcontent(b4j.example.vmstepitem __ref,String _content) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setcontent", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setcontent", new Object[] {_content}));}
RDebugUtils.currentLine=201261056;
 //BA.debugLineNum = 201261056;BA.debugLine="Sub SetContent(content As String) As VMStepItem";
RDebugUtils.currentLine=201261057;
 //BA.debugLineNum = 201261057;BA.debugLine="StepItem.SetText(content)";
__ref._stepitem /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_content);
RDebugUtils.currentLine=201261058;
 //BA.debugLineNum = 201261058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201261059;
 //BA.debugLineNum = 201261059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setdescription(b4j.example.vmstepitem __ref,Object _vardescription) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setdescription", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setdescription", new Object[] {_vardescription}));}
String _dd = "";
RDebugUtils.currentLine=202506240;
 //BA.debugLineNum = 202506240;BA.debugLine="Sub SetDescription(varDescription As Object) As VM";
RDebugUtils.currentLine=202506241;
 //BA.debugLineNum = 202506241;BA.debugLine="Dim dd As String = $\"${ID}description\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"description");
RDebugUtils.currentLine=202506242;
 //BA.debugLineNum = 202506242;BA.debugLine="vue.SetStateSingle(dd, varDescription)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_dd,_vardescription);
RDebugUtils.currentLine=202506243;
 //BA.debugLineNum = 202506243;BA.debugLine="SetAttr(CreateMap(\":md-description\": dd))";
__ref._setattr /*b4j.example.vmstepitem*/ (null,__c.createMap(new Object[] {(Object)(":md-description"),(Object)(_dd)}));
RDebugUtils.currentLine=202506244;
 //BA.debugLineNum = 202506244;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=202506245;
 //BA.debugLineNum = 202506245;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _seteditable(b4j.example.vmstepitem __ref,boolean _vareditable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "seteditable", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "seteditable", new Object[] {_vareditable}));}
String _dd = "";
RDebugUtils.currentLine=202637312;
 //BA.debugLineNum = 202637312;BA.debugLine="Sub SetEditable(varEditable As Boolean) As VMStepI";
RDebugUtils.currentLine=202637313;
 //BA.debugLineNum = 202637313;BA.debugLine="Dim dd As String = $\"${ID}editable\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"editable");
RDebugUtils.currentLine=202637314;
 //BA.debugLineNum = 202637314;BA.debugLine="vue.SetStateSingle(dd, varEditable)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_dd,(Object)(_vareditable));
RDebugUtils.currentLine=202637315;
 //BA.debugLineNum = 202637315;BA.debugLine="SetAttr(CreateMap(\":md-editable\": dd))";
__ref._setattr /*b4j.example.vmstepitem*/ (null,__c.createMap(new Object[] {(Object)(":md-editable"),(Object)(_dd)}));
RDebugUtils.currentLine=202637316;
 //BA.debugLineNum = 202637316;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=202637317;
 //BA.debugLineNum = 202637317;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _sethref(b4j.example.vmstepitem __ref,Object _varhref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "sethref", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "sethref", new Object[] {_varhref}));}
RDebugUtils.currentLine=202309632;
 //BA.debugLineNum = 202309632;BA.debugLine="Sub SetHref(varHref As Object) As VMStepItem";
RDebugUtils.currentLine=202309633;
 //BA.debugLineNum = 202309633;BA.debugLine="SetAttr(CreateMap(\"href\": varHref))";
__ref._setattr /*b4j.example.vmstepitem*/ (null,__c.createMap(new Object[] {(Object)("href"),_varhref}));
RDebugUtils.currentLine=202309634;
 //BA.debugLineNum = 202309634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=202309635;
 //BA.debugLineNum = 202309635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setlabel(b4j.example.vmstepitem __ref,String _varlabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setlabel", new Object[] {_varlabel}));}
String _lblx = "";
RDebugUtils.currentLine=202375168;
 //BA.debugLineNum = 202375168;BA.debugLine="Sub SetLabel(varLabel As String) As VMStepItem";
RDebugUtils.currentLine=202375169;
 //BA.debugLineNum = 202375169;BA.debugLine="Dim lblx As String = $\"${ID}label\"$";
_lblx = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"label");
RDebugUtils.currentLine=202375170;
 //BA.debugLineNum = 202375170;BA.debugLine="vue.SetStateSingle(lblx, varLabel)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_lblx,(Object)(_varlabel));
RDebugUtils.currentLine=202375171;
 //BA.debugLineNum = 202375171;BA.debugLine="SetAttr(CreateMap(\"v-bind:md-label\": lblx))";
__ref._setattr /*b4j.example.vmstepitem*/ (null,__c.createMap(new Object[] {(Object)("v-bind:md-label"),(Object)(_lblx)}));
RDebugUtils.currentLine=202375172;
 //BA.debugLineNum = 202375172;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=202375173;
 //BA.debugLineNum = 202375173;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setpadding(b4j.example.vmstepitem __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=202178560;
 //BA.debugLineNum = 202178560;BA.debugLine="Sub SetPadding(p As Object) As VMStepItem";
RDebugUtils.currentLine=202178561;
 //BA.debugLineNum = 202178561;BA.debugLine="StepItem.SetPaddingAll(p)";
__ref._stepitem /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=202178562;
 //BA.debugLineNum = 202178562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=202178563;
 //BA.debugLineNum = 202178563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setprimary(b4j.example.vmstepitem __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=201719808;
 //BA.debugLineNum = 201719808;BA.debugLine="Sub SetPrimary(b As Boolean) As VMStepItem";
RDebugUtils.currentLine=201719809;
 //BA.debugLineNum = 201719809;BA.debugLine="StepItem.SetPrimary(True)";
__ref._stepitem /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=201719810;
 //BA.debugLineNum = 201719810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201719811;
 //BA.debugLineNum = 201719811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setstyle(b4j.example.vmstepitem __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=202047488;
 //BA.debugLineNum = 202047488;BA.debugLine="Sub SetStyle(sm As Map) As VMStepItem";
RDebugUtils.currentLine=202047489;
 //BA.debugLineNum = 202047489;BA.debugLine="StepItem.SetStyle(sm)";
__ref._stepitem /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=202047490;
 //BA.debugLineNum = 202047490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=202047491;
 //BA.debugLineNum = 202047491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _settabindex(b4j.example.vmstepitem __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=201195520;
 //BA.debugLineNum = 201195520;BA.debugLine="Sub SetTabIndex(ti As String) As VMStepItem";
RDebugUtils.currentLine=201195521;
 //BA.debugLineNum = 201195521;BA.debugLine="StepItem.SetTabIndex(ti)";
__ref._stepitem /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=201195522;
 //BA.debugLineNum = 201195522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201195523;
 //BA.debugLineNum = 201195523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setvif(b4j.example.vmstepitem __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=201457664;
 //BA.debugLineNum = 201457664;BA.debugLine="Sub SetVIf(vif As Object) As VMStepItem";
RDebugUtils.currentLine=201457665;
 //BA.debugLineNum = 201457665;BA.debugLine="StepItem.SetVIf(vif)";
__ref._stepitem /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=201457666;
 //BA.debugLineNum = 201457666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201457667;
 //BA.debugLineNum = 201457667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setvmodel(b4j.example.vmstepitem __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=201392128;
 //BA.debugLineNum = 201392128;BA.debugLine="Sub SetVModel(k As String) As VMStepItem";
RDebugUtils.currentLine=201392129;
 //BA.debugLineNum = 201392129;BA.debugLine="StepItem.SetVModel(k)";
__ref._stepitem /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=201392130;
 //BA.debugLineNum = 201392130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201392131;
 //BA.debugLineNum = 201392131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setvshow(b4j.example.vmstepitem __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmstepitem";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmstepitem) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=201523200;
 //BA.debugLineNum = 201523200;BA.debugLine="Sub SetVShow(vif As Object) As VMStepItem";
RDebugUtils.currentLine=201523201;
 //BA.debugLineNum = 201523201;BA.debugLine="StepItem.SetVShow(vif)";
__ref._stepitem /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=201523202;
 //BA.debugLineNum = 201523202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
RDebugUtils.currentLine=201523203;
 //BA.debugLineNum = 201523203;BA.debugLine="End Sub";
return null;
}
}