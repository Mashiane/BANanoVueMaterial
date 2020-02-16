package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmswitch extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmswitch", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _switch = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public String _xmodel = "";
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmswitch  _initialize(b4j.example.vmswitch __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
String _sval = "";
RDebugUtils.currentLine=204996608;
 //BA.debugLineNum = 204996608;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=204996609;
 //BA.debugLineNum = 204996609;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=204996610;
 //BA.debugLineNum = 204996610;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=204996611;
 //BA.debugLineNum = 204996611;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=204996612;
 //BA.debugLineNum = 204996612;BA.debugLine="Switch.Initialize(vue, ID).SetTag(\"md-switch\")";
__ref._switch /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-switch");
RDebugUtils.currentLine=204996613;
 //BA.debugLineNum = 204996613;BA.debugLine="xmodel = \"\"";
__ref._xmodel /*String*/  = "";
RDebugUtils.currentLine=204996614;
 //BA.debugLineNum = 204996614;BA.debugLine="Dim sval As String";
_sval = "";
RDebugUtils.currentLine=204996615;
 //BA.debugLineNum = 204996615;BA.debugLine="SetOnChange(sval)";
__ref._setonchange /*b4j.example.vmswitch*/ (null,(Object)(_sval));
RDebugUtils.currentLine=204996616;
 //BA.debugLineNum = 204996616;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=204996617;
 //BA.debugLineNum = 204996617;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _settext(b4j.example.vmswitch __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=205062144;
 //BA.debugLineNum = 205062144;BA.debugLine="Sub SetText(t As String) As VMSwitch";
RDebugUtils.currentLine=205062145;
 //BA.debugLineNum = 205062145;BA.debugLine="Switch.SetText(t)";
__ref._switch /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=205062146;
 //BA.debugLineNum = 205062146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205062147;
 //BA.debugLineNum = 205062147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setvalue(b4j.example.vmswitch __ref,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=205848576;
 //BA.debugLineNum = 205848576;BA.debugLine="Sub SetValue(v As Object) As VMSwitch";
RDebugUtils.currentLine=205848577;
 //BA.debugLineNum = 205848577;BA.debugLine="SetAttr(CreateMap(\"value\": v))";
__ref._setattr /*b4j.example.vmswitch*/ (null,__c.createMap(new Object[] {(Object)("value"),_v}));
RDebugUtils.currentLine=205848578;
 //BA.debugLineNum = 205848578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205848579;
 //BA.debugLineNum = 205848579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setvshow(b4j.example.vmswitch __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=205783040;
 //BA.debugLineNum = 205783040;BA.debugLine="Sub SetVShow(vif As Object) As VMSwitch";
RDebugUtils.currentLine=205783041;
 //BA.debugLineNum = 205783041;BA.debugLine="Switch.SetVShow(vif)";
__ref._switch /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=205783042;
 //BA.debugLineNum = 205783042;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205783043;
 //BA.debugLineNum = 205783043;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setvmodel(b4j.example.vmswitch __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=205914112;
 //BA.debugLineNum = 205914112;BA.debugLine="Sub SetVModel(k As String) As VMSwitch";
RDebugUtils.currentLine=205914113;
 //BA.debugLineNum = 205914113;BA.debugLine="Switch.SetVModel(k)";
__ref._switch /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=205914114;
 //BA.debugLineNum = 205914114;BA.debugLine="xmodel = k.tolowercase";
__ref._xmodel /*String*/  = _k.toLowerCase();
RDebugUtils.currentLine=205914115;
 //BA.debugLineNum = 205914115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205914116;
 //BA.debugLineNum = 205914116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setdisabled(b4j.example.vmswitch __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=205324288;
 //BA.debugLineNum = 205324288;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSwitch";
RDebugUtils.currentLine=205324289;
 //BA.debugLineNum = 205324289;BA.debugLine="Switch.SetDisabled(b)";
__ref._switch /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=205324290;
 //BA.debugLineNum = 205324290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205324291;
 //BA.debugLineNum = 205324291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setname(b4j.example.vmswitch __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=205193216;
 //BA.debugLineNum = 205193216;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=205193217;
 //BA.debugLineNum = 205193217;BA.debugLine="Switch.SetName(varName, bind)";
__ref._switch /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=205193218;
 //BA.debugLineNum = 205193218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205193219;
 //BA.debugLineNum = 205193219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setprimary(b4j.example.vmswitch __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=205520896;
 //BA.debugLineNum = 205520896;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSwitch";
RDebugUtils.currentLine=205520897;
 //BA.debugLineNum = 205520897;BA.debugLine="If b Then Switch.SetPrimary(True)";
if (_b) { 
__ref._switch /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);};
RDebugUtils.currentLine=205520898;
 //BA.debugLineNum = 205520898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205520899;
 //BA.debugLineNum = 205520899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _settabindex(b4j.example.vmswitch __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=205127680;
 //BA.debugLineNum = 205127680;BA.debugLine="Sub SetTabIndex(ti As String) As VMSwitch";
RDebugUtils.currentLine=205127681;
 //BA.debugLineNum = 205127681;BA.debugLine="Switch.SetTabIndex(ti)";
__ref._switch /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=205127682;
 //BA.debugLineNum = 205127682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205127683;
 //BA.debugLineNum = 205127683;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=205979648;
 //BA.debugLineNum = 205979648;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=205979649;
 //BA.debugLineNum = 205979649;BA.debugLine="Return Switch.tostring";
if (true) return __ref._switch /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=205979650;
 //BA.debugLineNum = 205979650;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmswitch __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=206110720;
 //BA.debugLineNum = 206110720;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=206110721;
 //BA.debugLineNum = 206110721;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=206110722;
 //BA.debugLineNum = 206110722;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmswitch  _addclass(b4j.example.vmswitch __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=205389824;
 //BA.debugLineNum = 205389824;BA.debugLine="Sub AddClass(c As String) As VMSwitch";
RDebugUtils.currentLine=205389825;
 //BA.debugLineNum = 205389825;BA.debugLine="Switch.AddClass(c)";
__ref._switch /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=205389826;
 //BA.debugLineNum = 205389826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205389827;
 //BA.debugLineNum = 205389827;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmswitch __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=206176256;
 //BA.debugLineNum = 206176256;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=206176257;
 //BA.debugLineNum = 206176257;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=206176258;
 //BA.debugLineNum = 206176258;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
RDebugUtils.currentLine=204931072;
 //BA.debugLineNum = 204931072;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=204931073;
 //BA.debugLineNum = 204931073;BA.debugLine="Public Switch As VMElement";
_switch = new b4j.example.vmelement();
RDebugUtils.currentLine=204931074;
 //BA.debugLineNum = 204931074;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=204931075;
 //BA.debugLineNum = 204931075;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=204931076;
 //BA.debugLineNum = 204931076;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=204931077;
 //BA.debugLineNum = 204931077;BA.debugLine="Private xmodel As String";
_xmodel = "";
RDebugUtils.currentLine=204931078;
 //BA.debugLineNum = 204931078;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=204931079;
 //BA.debugLineNum = 204931079;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmswitch  _setonchange(b4j.example.vmswitch __ref,Object _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setonchange", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setonchange", new Object[] {_value}));}
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=205651968;
 //BA.debugLineNum = 205651968;BA.debugLine="private Sub SetOnChange(value As Object) As VMSwit";
RDebugUtils.currentLine=205651969;
 //BA.debugLineNum = 205651969;BA.debugLine="Private methodName As String = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_change");
RDebugUtils.currentLine=205651970;
 //BA.debugLineNum = 205651970;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmswitch)(this);};
RDebugUtils.currentLine=205651971;
 //BA.debugLineNum = 205651971;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_value}))));
RDebugUtils.currentLine=205651972;
 //BA.debugLineNum = 205651972;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
__ref._setattr /*b4j.example.vmswitch*/ (null,__c.createMap(new Object[] {(Object)("v-on:change"),(Object)(_methodname)}));
RDebugUtils.currentLine=205651974;
 //BA.debugLineNum = 205651974;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=205651975;
 //BA.debugLineNum = 205651975;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205651976;
 //BA.debugLineNum = 205651976;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmswitch __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=206045184;
 //BA.debugLineNum = 206045184;BA.debugLine="Sub Render";
RDebugUtils.currentLine=206045185;
 //BA.debugLineNum = 206045185;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=206045186;
 //BA.debugLineNum = 206045186;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmswitch  _setaccent(b4j.example.vmswitch __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=205586432;
 //BA.debugLineNum = 205586432;BA.debugLine="Sub SetAccent(b As Boolean) As VMSwitch";
RDebugUtils.currentLine=205586433;
 //BA.debugLineNum = 205586433;BA.debugLine="If b Then Switch.SetAccent(True)";
if (_b) { 
__ref._switch /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);};
RDebugUtils.currentLine=205586434;
 //BA.debugLineNum = 205586434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205586435;
 //BA.debugLineNum = 205586435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setattr(b4j.example.vmswitch __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=205455360;
 //BA.debugLineNum = 205455360;BA.debugLine="Sub SetAttr(attr As Map) As VMSwitch";
RDebugUtils.currentLine=205455361;
 //BA.debugLineNum = 205455361;BA.debugLine="Switch.SetAttr(attr)";
__ref._switch /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=205455362;
 //BA.debugLineNum = 205455362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205455363;
 //BA.debugLineNum = 205455363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setid(b4j.example.vmswitch __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setid", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=205258752;
 //BA.debugLineNum = 205258752;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
RDebugUtils.currentLine=205258753;
 //BA.debugLineNum = 205258753;BA.debugLine="Switch.SetID(varName, bind)";
__ref._switch /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=205258754;
 //BA.debugLineNum = 205258754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205258755;
 //BA.debugLineNum = 205258755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmswitch  _setvif(b4j.example.vmswitch __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmswitch";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmswitch) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=205717504;
 //BA.debugLineNum = 205717504;BA.debugLine="Sub SetVIf(vif As Object) As VMSwitch";
RDebugUtils.currentLine=205717505;
 //BA.debugLineNum = 205717505;BA.debugLine="Switch.SetVIf(vif)";
__ref._switch /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=205717506;
 //BA.debugLineNum = 205717506;BA.debugLine="Return Me";
if (true) return (b4j.example.vmswitch)(this);
RDebugUtils.currentLine=205717507;
 //BA.debugLineNum = 205717507;BA.debugLine="End Sub";
return null;
}
}