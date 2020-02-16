package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmradio extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmradio", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmradio.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _radio = null;
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
public b4j.example.vmradio  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub AddClass(c As String) As VMRadio";
 //BA.debugLineNum = 54;BA.debugLine="Radio.AddClass(c)";
_radio._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
 //BA.debugLineNum = 100;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (_rowpos,_colpos,_tostring());
 //BA.debugLineNum = 101;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Radio As VMElement";
_radio = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 16;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 17;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 18;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 19;BA.debugLine="Radio.Initialize(vue, ID).SetTag(\"md-radio\")";
_radio._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("md-radio");
 //BA.debugLineNum = 20;BA.debugLine="SetOnChange(ID)";
_setonchange(_id);
 //BA.debugLineNum = 21;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 22;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 96;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 97;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 91;BA.debugLine="Sub Render";
 //BA.debugLineNum = 92;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetAttr(attr As Map) As VMRadio";
 //BA.debugLineNum = 60;BA.debugLine="Radio.SetAttr(attr)";
_radio._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetDisabled(b As Boolean) As VMRadio";
 //BA.debugLineNum = 65;BA.debugLine="Radio.SetDisabled(b)";
_radio._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 41;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 42;BA.debugLine="Radio.SetName(varName, bind)";
_radio._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 43;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 44;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setonchange(String _source) throws Exception{
String _methodname = "";
String _sval = "";
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 70;BA.debugLine="Sub SetOnChange(source As String) As VMRadio";
 //BA.debugLineNum = 71;BA.debugLine="source = source.tolowercase";
_source = _source.toLowerCase();
 //BA.debugLineNum = 72;BA.debugLine="Dim methodName As String  = $\"${source}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_source))+"_change");
 //BA.debugLineNum = 73;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,_module,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradio)(this);};
 //BA.debugLineNum = 74;BA.debugLine="Dim sval As String";
_sval = "";
 //BA.debugLineNum = 75;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sval)}))));
 //BA.debugLineNum = 76;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
_setattr(__c.createMap(new Object[] {(Object)("v-on:change"),(Object)(_methodname)}));
 //BA.debugLineNum = 78;BA.debugLine="vue.SetCallBack(methodName, cb)";
_vue._setcallback /*String*/ (_methodname,_cb);
 //BA.debugLineNum = 79;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 80;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setprimary(boolean _b) throws Exception{
 //BA.debugLineNum = 35;BA.debugLine="Sub SetPrimary(b As Boolean) As VMRadio";
 //BA.debugLineNum = 36;BA.debugLine="Radio.SetPrimary(b)";
_radio._setprimary /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 37;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 38;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 10;BA.debugLine="Sub SetTabIndex(ti As String) As VMRadio";
 //BA.debugLineNum = 11;BA.debugLine="Radio.SetTabIndex(ti)";
_radio._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 12;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 13;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _settext(String _t) throws Exception{
 //BA.debugLineNum = 30;BA.debugLine="Sub SetText(t As String) As VMRadio";
 //BA.debugLineNum = 31;BA.debugLine="Radio.SetText(t)";
_radio._settext /*b4j.example.vmelement*/ (_t);
 //BA.debugLineNum = 32;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 33;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvalue(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 47;BA.debugLine="Sub SetValue(varName As Object, bind As Boolean) A";
 //BA.debugLineNum = 48;BA.debugLine="Radio.SetValue(varName, bind)";
_radio._setvalue /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetVModel(k As String) As VMRadio";
 //BA.debugLineNum = 83;BA.debugLine="Radio.SetVModel(k)";
_radio._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 24;BA.debugLine="Sub SetVShow(vif As String) As VMRadio";
 //BA.debugLineNum = 25;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmradio)(this);};
 //BA.debugLineNum = 26;BA.debugLine="Radio.SetVShow(vif)";
_radio._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 27;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
 //BA.debugLineNum = 28;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 88;BA.debugLine="Return Radio.tostring";
if (true) return _radio._tostring /*String*/ ();
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
