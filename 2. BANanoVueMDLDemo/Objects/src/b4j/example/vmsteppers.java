package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmsteppers extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmsteppers", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _steppers = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _actkey = "";
public Object _module = null;
public anywheresoftware.b4a.objects.collections.Map _steps = null;
public b4j.example.main _main = null;
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
public b4j.example.vmsteppers  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 115;BA.debugLine="Sub AddChild(child As VMElement) As VMSteppers";
 //BA.debugLineNum = 116;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 117;BA.debugLine="Steppers.SetText(childHTML)";
_steppers._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 118;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 151;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 152;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 153;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 155;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppers  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 133;BA.debugLine="Sub AddClass(c As String) As VMSteppers";
 //BA.debugLineNum = 134;BA.debugLine="Steppers.AddClass(c)";
_steppers._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public String  _addstep(String _stepid,String _steplabel,String _stepdescription,boolean _stepeditable,String _stepcontent) throws Exception{
b4j.example.vmstepitem _stepitem = null;
 //BA.debugLineNum = 39;BA.debugLine="Sub AddStep(stepID As String, stepLabel As String,";
 //BA.debugLineNum = 40;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 41;BA.debugLine="steps.put(stepID, stepID)";
_steps.Put((Object)(_stepid),(Object)(_stepid));
 //BA.debugLineNum = 42;BA.debugLine="Dim stepitem As VMStepItem";
_stepitem = new b4j.example.vmstepitem();
 //BA.debugLineNum = 43;BA.debugLine="stepitem.Initialize(vue, stepID, module)";
_stepitem._initialize /*b4j.example.vmstepitem*/ (ba,_vue,_stepid,_module);
 //BA.debugLineNum = 44;BA.debugLine="stepitem.SetLabel(stepLabel)";
_stepitem._setlabel /*b4j.example.vmstepitem*/ (_steplabel);
 //BA.debugLineNum = 45;BA.debugLine="If stepContent <> Null Then";
if (_stepcontent!= null) { 
 //BA.debugLineNum = 46;BA.debugLine="stepitem.SetContent(stepContent)";
_stepitem._setcontent /*b4j.example.vmstepitem*/ (_stepcontent);
 };
 //BA.debugLineNum = 48;BA.debugLine="stepitem.SetDescription(stepDescription)";
_stepitem._setdescription /*b4j.example.vmstepitem*/ ((Object)(_stepdescription));
 //BA.debugLineNum = 49;BA.debugLine="stepitem.SetEditable(stepEditable)";
_stepitem._seteditable /*b4j.example.vmstepitem*/ (_stepeditable);
 //BA.debugLineNum = 50;BA.debugLine="stepitem.Pop(Steppers)";
_stepitem._pop /*String*/ (_steppers);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return "";
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 239;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 240;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Steppers As VMElement";
_steppers = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private actKey As String";
_actkey = "";
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private steps As Map";
_steps = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppers  _hidestep(String _stepid) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 80;BA.debugLine="Sub HideStep(stepID As String) As VMSteppers";
 //BA.debugLineNum = 81;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 82;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"show");
 //BA.debugLineNum = 83;BA.debugLine="vue.SetStateSingle(stepShow, False)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(__c.False));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 16;BA.debugLine="Steppers.Initialize(v, ID)";
_steppers._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 17;BA.debugLine="Steppers.SetTag(\"md-steppers\")";
_steppers._settag /*b4j.example.vmelement*/ ("md-steppers");
 //BA.debugLineNum = 18;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 19;BA.debugLine="actKey = $\"${ID}active\"$";
_actkey = (""+__c.SmartStringFormatter("",(Object)(_id))+"active");
 //BA.debugLineNum = 20;BA.debugLine="SetOnChanged";
_setonchanged();
 //BA.debugLineNum = 21;BA.debugLine="SetActiveStepSync";
_setactivestepsync();
 //BA.debugLineNum = 22;BA.debugLine="steps.initialize";
_steps.Initialize();
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 128;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 129;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 130;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 110;BA.debugLine="Sub Render";
 //BA.debugLineNum = 111;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 112;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmsteppers  _setactivestepsync() throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="private Sub SetActiveStepSync As VMSteppers";
 //BA.debugLineNum = 33;BA.debugLine="vue.SetStateSingle(actKey, Null)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_actkey,__c.Null);
 //BA.debugLineNum = 34;BA.debugLine="SetAttr(CreateMap(\":md-active-step.sync\": actKey)";
_setattr(__c.createMap(new Object[] {(Object)(":md-active-step.sync"),(Object)(_actkey)}));
 //BA.debugLineNum = 35;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setalternative(boolean _varalternative) throws Exception{
 //BA.debugLineNum = 203;BA.debugLine="Sub SetAlternative(varAlternative As Boolean) As V";
 //BA.debugLineNum = 204;BA.debugLine="SetAttr(CreateMap(\":md-alternative\": varAlternati";
_setattr(__c.createMap(new Object[] {(Object)(":md-alternative"),(Object)(_varalternative)}));
 //BA.debugLineNum = 205;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 206;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 139;BA.debugLine="Sub SetAttr(attr As Map) As VMSteppers";
 //BA.debugLineNum = 140;BA.debugLine="Steppers.SetAttr(attr)";
_steppers._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 141;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setdynamicheight(boolean _vardynamicheight) throws Exception{
 //BA.debugLineNum = 221;BA.debugLine="Sub SetDynamicHeight(varDynamicHeight As Boolean)";
 //BA.debugLineNum = 222;BA.debugLine="SetAttr(CreateMap(\":md-dynamic-height\": varDynami";
_setattr(__c.createMap(new Object[] {(Object)(":md-dynamic-height"),(Object)(_vardynamicheight)}));
 //BA.debugLineNum = 223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 224;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetElevation(e As Int) As VMSteppers";
 //BA.debugLineNum = 54;BA.debugLine="Steppers.SetElevation(e)";
_steppers._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setkey(String _mdlname) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetKey(mdlName As String) As VMSteppers";
 //BA.debugLineNum = 27;BA.debugLine="mdlName = mdlName.tolowercase";
_mdlname = _mdlname.toLowerCase();
 //BA.debugLineNum = 28;BA.debugLine="SetAttr(CreateMap(\":key\": mdlName))";
_setattr(__c.createMap(new Object[] {(Object)(":key"),(Object)(_mdlname)}));
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setlinear(boolean _varlinear) throws Exception{
 //BA.debugLineNum = 215;BA.debugLine="Sub SetLinear(varLinear As Boolean) As VMSteppers";
 //BA.debugLineNum = 216;BA.debugLine="SetAttr(CreateMap(\":md-linear\": varLinear))";
_setattr(__c.createMap(new Object[] {(Object)(":md-linear"),(Object)(_varlinear)}));
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setmargin(Object _p) throws Exception{
 //BA.debugLineNum = 164;BA.debugLine="Sub SetMargin(p As Object) As VMSteppers";
 //BA.debugLineNum = 165;BA.debugLine="Steppers.SetMarginAll(p)";
_steppers._setmarginall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 166;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 167;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setonchanged() throws Exception{
String _stepid = "";
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 227;BA.debugLine="private Sub SetOnChanged As VMSteppers";
 //BA.debugLineNum = 228;BA.debugLine="Dim stepID As String = \"\"";
_stepid = "";
 //BA.debugLineNum = 229;BA.debugLine="Dim methodName As String  = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 230;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmsteppers)(this);};
 //BA.debugLineNum = 231;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_stepid)}))));
 //BA.debugLineNum = 232;BA.debugLine="SetAttr(CreateMap(\"v-on:md-changed\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:md-changed"),(Object)(_methodname)}));
 //BA.debugLineNum = 234;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 235;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 236;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub SetPadding(p As Object) As VMSteppers";
 //BA.debugLineNum = 159;BA.debugLine="Steppers.SetPaddingAll(p)";
_steppers._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 160;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 161;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstepactive(String _varactivestep) throws Exception{
String _stepa = "";
 //BA.debugLineNum = 184;BA.debugLine="Sub SetStepActive(varActiveStep As String) As VMSt";
 //BA.debugLineNum = 185;BA.debugLine="varActiveStep = varActiveStep.tolowercase";
_varactivestep = _varactivestep.toLowerCase();
 //BA.debugLineNum = 186;BA.debugLine="vue.SetStateSingle(actKey, varActiveStep)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_actkey,(Object)(_varactivestep));
 //BA.debugLineNum = 187;BA.debugLine="for each stepa as string in steps.keys";
{
final anywheresoftware.b4a.BA.IterableList group3 = _steps.Keys();
final int groupLen3 = group3.getSize()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stepa = BA.ObjectToString(group3.Get(index3));
 //BA.debugLineNum = 188;BA.debugLine="if stepa = varactivestep then";
if ((_stepa).equals(_varactivestep)) { 
 }else {
 //BA.debugLineNum = 190;BA.debugLine="SetStepDone(stepa, false)";
_setstepdone(_stepa,__c.False);
 };
 }
};
 //BA.debugLineNum = 193;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 194;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstepdescription(String _stepid,String _stepeditable) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 66;BA.debugLine="Sub SetStepDescription(stepID As String, stepEdita";
 //BA.debugLineNum = 67;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 68;BA.debugLine="Dim stepShow As String = $\"${stepID}description\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"description");
 //BA.debugLineNum = 69;BA.debugLine="vue.SetStateSingle(stepShow, stepEditable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_stepeditable));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstepdone(String _stepdone,boolean _b) throws Exception{
String _dd = "";
 //BA.debugLineNum = 176;BA.debugLine="Sub SetStepDone(stepDone As String, b As Boolean)";
 //BA.debugLineNum = 177;BA.debugLine="stepDone = stepDone.tolowercase";
_stepdone = _stepdone.toLowerCase();
 //BA.debugLineNum = 178;BA.debugLine="Dim dd As String = $\"${stepDone}done\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(_stepdone))+"done");
 //BA.debugLineNum = 179;BA.debugLine="vue.SetStateSingle(dd, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_dd,(Object)(_b));
 //BA.debugLineNum = 180;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 181;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstepeditable(String _stepid,boolean _stepeditable) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 59;BA.debugLine="Sub SetStepEditable(stepID As String, stepEditable";
 //BA.debugLineNum = 60;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 61;BA.debugLine="Dim stepShow As String = $\"${stepID}editable\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"editable");
 //BA.debugLineNum = 62;BA.debugLine="vue.SetStateSingle(stepShow, stepEditable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_stepeditable));
 //BA.debugLineNum = 63;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 64;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setsteperror(String _stepid,String _steperror) throws Exception{
String _dd = "";
 //BA.debugLineNum = 169;BA.debugLine="Sub SetStepError(stepID As String, stepError As St";
 //BA.debugLineNum = 170;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 171;BA.debugLine="Dim dd As String = $\"${stepID}error\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"error");
 //BA.debugLineNum = 172;BA.debugLine="vue.SetStateSingle(dd, stepError)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_dd,(Object)(_steperror));
 //BA.debugLineNum = 173;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 174;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setsteplabel(String _stepid,String _steplabel) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 73;BA.debugLine="Sub SetStepLabel(stepID As String, stepLabel As St";
 //BA.debugLineNum = 74;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 75;BA.debugLine="Dim stepShow As String = $\"${stepID}label\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"label");
 //BA.debugLineNum = 76;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(_steplabel));
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 145;BA.debugLine="Sub SetStyle(sm As Map) As VMSteppers";
 //BA.debugLineNum = 146;BA.debugLine="Steppers.SetStyle(sm)";
_steppers._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 147;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 148;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setsyncroute(boolean _varsyncroute) throws Exception{
 //BA.debugLineNum = 197;BA.debugLine="Sub SetSyncRoute(varSyncRoute As Boolean) As VMSte";
 //BA.debugLineNum = 198;BA.debugLine="SetAttr(CreateMap(\":md-sync-route\": varSyncRoute)";
_setattr(__c.createMap(new Object[] {(Object)(":md-sync-route"),(Object)(_varsyncroute)}));
 //BA.debugLineNum = 199;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 200;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _settext(Object _t) throws Exception{
 //BA.debugLineNum = 122;BA.debugLine="Sub SetText(t As Object) As VMSteppers";
 //BA.debugLineNum = 123;BA.debugLine="Steppers.SetText(t)";
_steppers._settext /*b4j.example.vmelement*/ (BA.ObjectToString(_t));
 //BA.debugLineNum = 124;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 125;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setvertical(boolean _varvertical) throws Exception{
 //BA.debugLineNum = 209;BA.debugLine="Sub SetVertical(varVertical As Boolean) As VMStepp";
 //BA.debugLineNum = 210;BA.debugLine="SetAttr(CreateMap(\":md-vertical\": varVertical))";
_setattr(__c.createMap(new Object[] {(Object)(":md-vertical"),(Object)(_varvertical)}));
 //BA.debugLineNum = 211;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 212;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetVIf(vif As Object) As VMSteppers";
 //BA.debugLineNum = 100;BA.debugLine="Steppers.SetVIf(vif)";
_steppers._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub SetVShow(vif As Object) As VMSteppers";
 //BA.debugLineNum = 105;BA.debugLine="Steppers.SetVShow(vif)";
_steppers._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmsteppers  _showstep(String _stepid) throws Exception{
String _stepshow = "";
 //BA.debugLineNum = 87;BA.debugLine="Sub ShowStep(stepID As String) As VMSteppers";
 //BA.debugLineNum = 88;BA.debugLine="stepID = stepID.tolowercase";
_stepid = _stepid.toLowerCase();
 //BA.debugLineNum = 89;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
_stepshow = (""+__c.SmartStringFormatter("",(Object)(_stepid))+"show");
 //BA.debugLineNum = 90;BA.debugLine="vue.SetStateSingle(stepShow, True)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_stepshow,(Object)(__c.True));
 //BA.debugLineNum = 91;BA.debugLine="Return Me";
if (true) return (b4j.example.vmsteppers)(this);
 //BA.debugLineNum = 92;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 96;BA.debugLine="Return Steppers.ToString";
if (true) return _steppers._tostring /*String*/ ();
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
