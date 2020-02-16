package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmstepitem extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmstepitem", this);
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

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _stepitem = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
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
public b4j.example.vmstepitem  _addchild(b4j.example.vmelement _child) throws Exception{
String _childhtml = "";
 //BA.debugLineNum = 59;BA.debugLine="Sub AddChild(child As VMElement) As VMStepItem";
 //BA.debugLineNum = 60;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ ();
 //BA.debugLineNum = 61;BA.debugLine="StepItem.SetText(childHTML)";
_stepitem._settext /*b4j.example.vmelement*/ (_childhtml);
 //BA.debugLineNum = 62;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 63;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(anywheresoftware.b4a.objects.collections.List _children) throws Exception{
b4j.example.vmelement _childx = null;
 //BA.debugLineNum = 99;BA.debugLine="Sub AddChildren(children As List)";
 //BA.debugLineNum = 100;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
 //BA.debugLineNum = 101;BA.debugLine="AddChild(childx)";
_addchild(_childx);
 }
};
 //BA.debugLineNum = 103;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepitem  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 81;BA.debugLine="Sub AddClass(c As String) As VMStepItem";
 //BA.debugLineNum = 82;BA.debugLine="StepItem.AddClass(c)";
_stepitem._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 83;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 84;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public StepItem As VMElement";
_stepitem = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepitem  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="StepItem.Initialize(v, ID)";
_stepitem._initialize /*b4j.example.vmelement*/ (ba,_v,_id);
 //BA.debugLineNum = 14;BA.debugLine="StepItem.SetTag(\"md-step\")";
_stepitem._settag /*b4j.example.vmelement*/ ("md-step");
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="SetId(ID)";
_setid((Object)(_id));
 //BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 18;BA.debugLine="SetDoneSync(False)";
_setdonesync(__c.False);
 //BA.debugLineNum = 19;BA.debugLine="SetError(Null)";
_seterror(BA.ObjectToString(__c.Null));
 //BA.debugLineNum = 20;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 77;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub Render";
 //BA.debugLineNum = 55;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmstepitem  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetAccent(b As Boolean) As VMStepItem";
 //BA.debugLineNum = 71;BA.debugLine="StepItem.SetAccent(True)";
_stepitem._setaccent /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetAttr(attr As Map) As VMStepItem";
 //BA.debugLineNum = 88;BA.debugLine="StepItem.SetAttr(attr)";
_stepitem._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setcontent(String _content) throws Exception{
 //BA.debugLineNum = 28;BA.debugLine="Sub SetContent(content As String) As VMStepItem";
 //BA.debugLineNum = 29;BA.debugLine="StepItem.SetText(content)";
_stepitem._settext /*b4j.example.vmelement*/ (_content);
 //BA.debugLineNum = 30;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setdescription(Object _vardescription) throws Exception{
String _dd = "";
 //BA.debugLineNum = 139;BA.debugLine="Sub SetDescription(varDescription As Object) As VM";
 //BA.debugLineNum = 140;BA.debugLine="Dim dd As String = $\"${ID}description\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(_id))+"description");
 //BA.debugLineNum = 141;BA.debugLine="vue.SetStateSingle(dd, varDescription)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_dd,_vardescription);
 //BA.debugLineNum = 142;BA.debugLine="SetAttr(CreateMap(\":md-description\": dd))";
_setattr(__c.createMap(new Object[] {(Object)(":md-description"),(Object)(_dd)}));
 //BA.debugLineNum = 143;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 144;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setdonesync(boolean _b) throws Exception{
String _done = "";
 //BA.debugLineNum = 131;BA.debugLine="private Sub SetDoneSync(b As Boolean) As VMStepIte";
 //BA.debugLineNum = 132;BA.debugLine="Dim done As String = $\"${ID}done\"$";
_done = (""+__c.SmartStringFormatter("",(Object)(_id))+"done");
 //BA.debugLineNum = 133;BA.debugLine="vue.SetStateSingle(done, b)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_done,(Object)(_b));
 //BA.debugLineNum = 134;BA.debugLine="SetAttr(CreateMap(\":md-done.sync\":done))";
_setattr(__c.createMap(new Object[] {(Object)(":md-done.sync"),(Object)(_done)}));
 //BA.debugLineNum = 135;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 136;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _seteditable(boolean _vareditable) throws Exception{
String _dd = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub SetEditable(varEditable As Boolean) As VMStepI";
 //BA.debugLineNum = 156;BA.debugLine="Dim dd As String = $\"${ID}editable\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(_id))+"editable");
 //BA.debugLineNum = 157;BA.debugLine="vue.SetStateSingle(dd, varEditable)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_dd,(Object)(_vareditable));
 //BA.debugLineNum = 158;BA.debugLine="SetAttr(CreateMap(\":md-editable\": dd))";
_setattr(__c.createMap(new Object[] {(Object)(":md-editable"),(Object)(_dd)}));
 //BA.debugLineNum = 159;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _seterror(String _varerror) throws Exception{
String _dd = "";
 //BA.debugLineNum = 147;BA.debugLine="Sub SetError(varError As String) As VMStepItem";
 //BA.debugLineNum = 148;BA.debugLine="Dim dd As String = $\"${ID}error\"$";
_dd = (""+__c.SmartStringFormatter("",(Object)(_id))+"error");
 //BA.debugLineNum = 149;BA.debugLine="vue.SetStateSingle(dd, varError)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_dd,(Object)(_varerror));
 //BA.debugLineNum = 150;BA.debugLine="SetAttr(CreateMap(\":md-error\": dd))";
_setattr(__c.createMap(new Object[] {(Object)(":md-error"),(Object)(_dd)}));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _sethref(Object _varhref) throws Exception{
 //BA.debugLineNum = 118;BA.debugLine="Sub SetHref(varHref As Object) As VMStepItem";
 //BA.debugLineNum = 119;BA.debugLine="SetAttr(CreateMap(\"href\": varHref))";
_setattr(__c.createMap(new Object[] {(Object)("href"),_varhref}));
 //BA.debugLineNum = 120;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 121;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setid(Object _varid) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub SetId(varId As Object) As VMStepItem";
 //BA.debugLineNum = 113;BA.debugLine="SetAttr(CreateMap(\"id\": varId))";
_setattr(__c.createMap(new Object[] {(Object)("id"),_varid}));
 //BA.debugLineNum = 114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setlabel(String _varlabel) throws Exception{
String _lblx = "";
 //BA.debugLineNum = 124;BA.debugLine="Sub SetLabel(varLabel As String) As VMStepItem";
 //BA.debugLineNum = 125;BA.debugLine="Dim lblx As String = $\"${ID}label\"$";
_lblx = (""+__c.SmartStringFormatter("",(Object)(_id))+"label");
 //BA.debugLineNum = 126;BA.debugLine="vue.SetStateSingle(lblx, varLabel)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_lblx,(Object)(_varlabel));
 //BA.debugLineNum = 127;BA.debugLine="SetAttr(CreateMap(\"v-bind:md-label\": lblx))";
_setattr(__c.createMap(new Object[] {(Object)("v-bind:md-label"),(Object)(_lblx)}));
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setpadding(Object _p) throws Exception{
 //BA.debugLineNum = 106;BA.debugLine="Sub SetPadding(p As Object) As VMStepItem";
 //BA.debugLineNum = 107;BA.debugLine="StepItem.SetPaddingAll(p)";
_stepitem._setpaddingall /*b4j.example.vmelement*/ (_p);
 //BA.debugLineNum = 108;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 109;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetPrimary(b As Boolean) As VMStepItem";
 //BA.debugLineNum = 66;BA.debugLine="StepItem.SetPrimary(True)";
_stepitem._setprimary /*b4j.example.vmelement*/ (__c.True);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetStyle(sm As Map) As VMStepItem";
 //BA.debugLineNum = 94;BA.debugLine="StepItem.SetStyle(sm)";
_stepitem._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 23;BA.debugLine="Sub SetTabIndex(ti As String) As VMStepItem";
 //BA.debugLineNum = 24;BA.debugLine="StepItem.SetTabIndex(ti)";
_stepitem._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 25;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetVIf(vif As Object) As VMStepItem";
 //BA.debugLineNum = 44;BA.debugLine="StepItem.SetVIf(vif)";
_stepitem._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetVModel(k As String) As VMStepItem";
 //BA.debugLineNum = 39;BA.debugLine="StepItem.SetVModel(k)";
_stepitem._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmstepitem  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 48;BA.debugLine="Sub SetVShow(vif As Object) As VMStepItem";
 //BA.debugLineNum = 49;BA.debugLine="StepItem.SetVShow(vif)";
_stepitem._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmstepitem)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 35;BA.debugLine="Return StepItem.ToString";
if (true) return _stepitem._tostring /*String*/ ();
 //BA.debugLineNum = 36;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
