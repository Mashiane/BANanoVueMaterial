package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmswitch", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmswitch.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _switch = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _xmodel = "";
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
public b4j.example.vmswitch  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 51;BA.debugLine="Sub AddClass(c As String) As VMSwitch";
 //BA.debugLineNum = 52;BA.debugLine="Switch.AddClass(c)";
_switch._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 53;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 54;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 117;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 118;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 119;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Switch As VMElement";
_switch = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private xmodel As String";
_xmodel = "";
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmswitch  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
String _sval = "";
 //BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 13;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 14;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 15;BA.debugLine="Switch.Initialize(vue, ID).SetTag(\"md-switch\")";
_switch._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-switch");
 //BA.debugLineNum = 16;BA.debugLine="xmodel = \"\"";
_xmodel = "";
 //BA.debugLineNum = 17;BA.debugLine="Dim sval As String";
_sval = "";
 //BA.debugLineNum = 18;BA.debugLine="SetOnChange(sval)";
_setonchange((Object)(_sval));
 //BA.debugLineNum = 19;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 113;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub Render";
 //BA.debugLineNum = 109;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmswitch  _setaccent(boolean _b) throws Exception{
 //BA.debugLineNum = 67;BA.debugLine="Sub SetAccent(b As Boolean) As VMSwitch";
 //BA.debugLineNum = 68;BA.debugLine="If b Then Switch.SetAccent(True)";
if (_b) { 
_switch._setaccent /*b4j.example.vmelement*/ (__c.True);};
 //BA.debugLineNum = 69;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 70;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 57;BA.debugLine="Sub SetAttr(attr As Map) As VMSwitch";
 //BA.debugLineNum = 58;BA.debugLine="Switch.SetAttr(attr)";
_switch._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 59;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 60;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 45;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSwitch";
 //BA.debugLineNum = 46;BA.debugLine="Switch.SetDisabled(b)";
_switch._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 47;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 48;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setid(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 40;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
 //BA.debugLineNum = 41;BA.debugLine="Switch.SetID(varName, bind)";
_switch._setid /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 42;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 43;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 34;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 35;BA.debugLine="Switch.SetName(varName, bind)";
_switch._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 36;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 37;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setonchange(Object _value) throws Exception{
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 73;BA.debugLine="private Sub SetOnChange(value As Object) As VMSwit";
 //BA.debugLineNum = 74;BA.debugLine="Private methodName As String = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_id))+"_change");
 //BA.debugLineNum = 75;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmswitch)(this);};
 //BA.debugLineNum = 76;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
 //BA.debugLineNum = 77;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:change"),(Object)(_methodname)}));
 //BA.debugLineNum = 79;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 80;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 81;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSwitch";
 //BA.debugLineNum = 63;BA.debugLine="If b Then Switch.SetPrimary(True)";
if (_b) { 
_switch._setprimary /*b4j.example.vmelement*/ (__c.True);};
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetTabIndex(ti As String) As VMSwitch";
 //BA.debugLineNum = 28;BA.debugLine="Switch.SetTabIndex(ti)";
_switch._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _settext(String _t) throws Exception{
 //BA.debugLineNum = 22;BA.debugLine="Sub SetText(t As String) As VMSwitch";
 //BA.debugLineNum = 23;BA.debugLine="Switch.SetText(t)";
_switch._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 24;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 25;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setvalue(Object _v) throws Exception{
 //BA.debugLineNum = 93;BA.debugLine="Sub SetValue(v As Object) As VMSwitch";
 //BA.debugLineNum = 94;BA.debugLine="SetAttr(CreateMap(\"value\": v))";
_setattr(__c.createMap(new Object[] {(Object)("value"),_v}));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 83;BA.debugLine="Sub SetVIf(vif As Object) As VMSwitch";
 //BA.debugLineNum = 84;BA.debugLine="Switch.SetVIf(vif)";
_switch._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 85;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 86;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 98;BA.debugLine="Sub SetVModel(k As String) As VMSwitch";
 //BA.debugLineNum = 99;BA.debugLine="Switch.SetVModel(k)";
_switch._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 100;BA.debugLine="xmodel = k.tolowercase";
_xmodel = _k.toLowerCase();
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 88;BA.debugLine="Sub SetVShow(vif As Object) As VMSwitch";
 //BA.debugLineNum = 89;BA.debugLine="Switch.SetVShow(vif)";
_switch._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 90;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
 //BA.debugLineNum = 91;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 104;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 105;BA.debugLine="Return Switch.tostring";
if (true) return _switch._tostring /*String*/ ();
 //BA.debugLineNum = 106;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
