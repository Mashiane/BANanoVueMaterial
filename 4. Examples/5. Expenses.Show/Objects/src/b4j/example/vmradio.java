package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmradio extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmradio", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _radio = null;
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
public b4j.example.vmradio  _initialize(b4j.example.vmradio __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=187367424;
 //BA.debugLineNum = 187367424;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=187367425;
 //BA.debugLineNum = 187367425;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=187367426;
 //BA.debugLineNum = 187367426;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=187367427;
 //BA.debugLineNum = 187367427;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=187367428;
 //BA.debugLineNum = 187367428;BA.debugLine="Radio.Initialize(vue, ID).SetTag(\"md-radio\")";
__ref._radio /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-radio");
RDebugUtils.currentLine=187367429;
 //BA.debugLineNum = 187367429;BA.debugLine="SetOnChange(ID)";
__ref._setonchange /*b4j.example.vmradio*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=187367430;
 //BA.debugLineNum = 187367430;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187367431;
 //BA.debugLineNum = 187367431;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvalue(b4j.example.vmradio __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "setvalue", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=187695104;
 //BA.debugLineNum = 187695104;BA.debugLine="Sub SetValue(varName As Object, bind As Boolean) A";
RDebugUtils.currentLine=187695105;
 //BA.debugLineNum = 187695105;BA.debugLine="Radio.SetValue(varName, bind)";
__ref._radio /*b4j.example.vmelement*/ ._setvalue /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=187695106;
 //BA.debugLineNum = 187695106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187695107;
 //BA.debugLineNum = 187695107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setname(b4j.example.vmradio __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=187629568;
 //BA.debugLineNum = 187629568;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=187629569;
 //BA.debugLineNum = 187629569;BA.debugLine="Radio.SetName(varName, bind)";
__ref._radio /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=187629570;
 //BA.debugLineNum = 187629570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187629571;
 //BA.debugLineNum = 187629571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setprimary(b4j.example.vmradio __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=187564032;
 //BA.debugLineNum = 187564032;BA.debugLine="Sub SetPrimary(b As Boolean) As VMRadio";
RDebugUtils.currentLine=187564033;
 //BA.debugLineNum = 187564033;BA.debugLine="Radio.SetPrimary(b)";
__ref._radio /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=187564034;
 //BA.debugLineNum = 187564034;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187564035;
 //BA.debugLineNum = 187564035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvmodel(b4j.example.vmradio __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=188022784;
 //BA.debugLineNum = 188022784;BA.debugLine="Sub SetVModel(k As String) As VMRadio";
RDebugUtils.currentLine=188022785;
 //BA.debugLineNum = 188022785;BA.debugLine="Radio.SetVModel(k)";
__ref._radio /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=188022786;
 //BA.debugLineNum = 188022786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=188022787;
 //BA.debugLineNum = 188022787;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmradio __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=188219392;
 //BA.debugLineNum = 188219392;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=188219393;
 //BA.debugLineNum = 188219393;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=188219394;
 //BA.debugLineNum = 188219394;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _addclass(b4j.example.vmradio __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=187760640;
 //BA.debugLineNum = 187760640;BA.debugLine="Sub AddClass(c As String) As VMRadio";
RDebugUtils.currentLine=187760641;
 //BA.debugLineNum = 187760641;BA.debugLine="Radio.AddClass(c)";
__ref._radio /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=187760642;
 //BA.debugLineNum = 187760642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187760643;
 //BA.debugLineNum = 187760643;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmradio __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=188284928;
 //BA.debugLineNum = 188284928;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=188284929;
 //BA.debugLineNum = 188284929;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=188284930;
 //BA.debugLineNum = 188284930;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmradio __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=188088320;
 //BA.debugLineNum = 188088320;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=188088321;
 //BA.debugLineNum = 188088321;BA.debugLine="Return Radio.tostring";
if (true) return __ref._radio /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=188088322;
 //BA.debugLineNum = 188088322;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmradio __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
RDebugUtils.currentLine=187236352;
 //BA.debugLineNum = 187236352;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=187236353;
 //BA.debugLineNum = 187236353;BA.debugLine="Public Radio As VMElement";
_radio = new b4j.example.vmelement();
RDebugUtils.currentLine=187236354;
 //BA.debugLineNum = 187236354;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=187236355;
 //BA.debugLineNum = 187236355;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=187236356;
 //BA.debugLineNum = 187236356;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=187236357;
 //BA.debugLineNum = 187236357;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=187236358;
 //BA.debugLineNum = 187236358;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _setonchange(b4j.example.vmradio __ref,String _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "setonchange", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "setonchange", new Object[] {_source}));}
String _methodname = "";
String _sval = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=187957248;
 //BA.debugLineNum = 187957248;BA.debugLine="Sub SetOnChange(source As String) As VMRadio";
RDebugUtils.currentLine=187957249;
 //BA.debugLineNum = 187957249;BA.debugLine="source = source.tolowercase";
_source = _source.toLowerCase();
RDebugUtils.currentLine=187957250;
 //BA.debugLineNum = 187957250;BA.debugLine="Dim methodName As String  = $\"${source}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_source))+"_change");
RDebugUtils.currentLine=187957251;
 //BA.debugLineNum = 187957251;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmradio)(this);};
RDebugUtils.currentLine=187957252;
 //BA.debugLineNum = 187957252;BA.debugLine="Dim sval As String";
_sval = "";
RDebugUtils.currentLine=187957253;
 //BA.debugLineNum = 187957253;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sval)}))));
RDebugUtils.currentLine=187957254;
 //BA.debugLineNum = 187957254;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
__ref._setattr /*b4j.example.vmradio*/ (null,__c.createMap(new Object[] {(Object)("v-on:change"),(Object)(_methodname)}));
RDebugUtils.currentLine=187957256;
 //BA.debugLineNum = 187957256;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=187957257;
 //BA.debugLineNum = 187957257;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187957258;
 //BA.debugLineNum = 187957258;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmradio __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=188153856;
 //BA.debugLineNum = 188153856;BA.debugLine="Sub Render";
RDebugUtils.currentLine=188153857;
 //BA.debugLineNum = 188153857;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=188153858;
 //BA.debugLineNum = 188153858;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmradio  _setattr(b4j.example.vmradio __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=187826176;
 //BA.debugLineNum = 187826176;BA.debugLine="Sub SetAttr(attr As Map) As VMRadio";
RDebugUtils.currentLine=187826177;
 //BA.debugLineNum = 187826177;BA.debugLine="Radio.SetAttr(attr)";
__ref._radio /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=187826178;
 //BA.debugLineNum = 187826178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187826179;
 //BA.debugLineNum = 187826179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setdisabled(b4j.example.vmradio __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=187891712;
 //BA.debugLineNum = 187891712;BA.debugLine="Sub SetDisabled(b As Boolean) As VMRadio";
RDebugUtils.currentLine=187891713;
 //BA.debugLineNum = 187891713;BA.debugLine="Radio.SetDisabled(b)";
__ref._radio /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=187891714;
 //BA.debugLineNum = 187891714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187891715;
 //BA.debugLineNum = 187891715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _settabindex(b4j.example.vmradio __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=187301888;
 //BA.debugLineNum = 187301888;BA.debugLine="Sub SetTabIndex(ti As String) As VMRadio";
RDebugUtils.currentLine=187301889;
 //BA.debugLineNum = 187301889;BA.debugLine="Radio.SetTabIndex(ti)";
__ref._radio /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=187301890;
 //BA.debugLineNum = 187301890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187301891;
 //BA.debugLineNum = 187301891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _settext(b4j.example.vmradio __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=187498496;
 //BA.debugLineNum = 187498496;BA.debugLine="Sub SetText(t As String) As VMRadio";
RDebugUtils.currentLine=187498497;
 //BA.debugLineNum = 187498497;BA.debugLine="Radio.SetText(t)";
__ref._radio /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=187498498;
 //BA.debugLineNum = 187498498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187498499;
 //BA.debugLineNum = 187498499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmradio  _setvshow(b4j.example.vmradio __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmradio";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmradio) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=187432960;
 //BA.debugLineNum = 187432960;BA.debugLine="Sub SetVShow(vif As String) As VMRadio";
RDebugUtils.currentLine=187432961;
 //BA.debugLineNum = 187432961;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmradio)(this);};
RDebugUtils.currentLine=187432962;
 //BA.debugLineNum = 187432962;BA.debugLine="Radio.SetVShow(vif)";
__ref._radio /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=187432963;
 //BA.debugLineNum = 187432963;BA.debugLine="Return Me";
if (true) return (b4j.example.vmradio)(this);
RDebugUtils.currentLine=187432964;
 //BA.debugLineNum = 187432964;BA.debugLine="End Sub";
return null;
}
}