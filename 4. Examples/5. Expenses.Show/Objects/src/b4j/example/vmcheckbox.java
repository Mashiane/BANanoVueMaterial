package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmcheckbox extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmcheckbox", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmcheckbox.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _checkbox = null;
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
public b4j.example.vmcheckbox  _initialize(b4j.example.vmcheckbox __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=83755008;
 //BA.debugLineNum = 83755008;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=83755009;
 //BA.debugLineNum = 83755009;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=83755010;
 //BA.debugLineNum = 83755010;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=83755011;
 //BA.debugLineNum = 83755011;BA.debugLine="CheckBox.Initialize(vue, ID).SetTag(\"md-checkbox\"";
__ref._checkbox /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-checkbox");
RDebugUtils.currentLine=83755012;
 //BA.debugLineNum = 83755012;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=83755013;
 //BA.debugLineNum = 83755013;BA.debugLine="SetOnChange(ID)";
__ref._setonchange /*b4j.example.vmcheckbox*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=83755014;
 //BA.debugLineNum = 83755014;BA.debugLine="xmodel = \"\"";
__ref._xmodel /*String*/  = "";
RDebugUtils.currentLine=83755015;
 //BA.debugLineNum = 83755015;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=83755016;
 //BA.debugLineNum = 83755016;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _addclass(b4j.example.vmcheckbox __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=84344832;
 //BA.debugLineNum = 84344832;BA.debugLine="Sub AddClass(c As String) As VMCheckBox";
RDebugUtils.currentLine=84344833;
 //BA.debugLineNum = 84344833;BA.debugLine="CheckBox.AddClass(c)";
__ref._checkbox /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=84344834;
 //BA.debugLineNum = 84344834;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=84344835;
 //BA.debugLineNum = 84344835;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmcheckbox __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=84803584;
 //BA.debugLineNum = 84803584;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=84803585;
 //BA.debugLineNum = 84803585;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=84803586;
 //BA.debugLineNum = 84803586;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=84606976;
 //BA.debugLineNum = 84606976;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=84606977;
 //BA.debugLineNum = 84606977;BA.debugLine="Return CheckBox.tostring";
if (true) return __ref._checkbox /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=84606978;
 //BA.debugLineNum = 84606978;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
RDebugUtils.currentLine=83689472;
 //BA.debugLineNum = 83689472;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=83689473;
 //BA.debugLineNum = 83689473;BA.debugLine="Public CheckBox As VMElement";
_checkbox = new b4j.example.vmelement();
RDebugUtils.currentLine=83689474;
 //BA.debugLineNum = 83689474;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=83689475;
 //BA.debugLineNum = 83689475;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=83689476;
 //BA.debugLineNum = 83689476;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=83689477;
 //BA.debugLineNum = 83689477;BA.debugLine="Private xmodel As String";
_xmodel = "";
RDebugUtils.currentLine=83689478;
 //BA.debugLineNum = 83689478;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=83689479;
 //BA.debugLineNum = 83689479;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _setonchange(b4j.example.vmcheckbox __ref,String _source) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "setonchange", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "setonchange", new Object[] {_source}));}
String _methodname = "";
String _sval = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=84475904;
 //BA.debugLineNum = 84475904;BA.debugLine="Sub SetOnChange(source As String) As VMCheckBox";
RDebugUtils.currentLine=84475905;
 //BA.debugLineNum = 84475905;BA.debugLine="source = source.tolowercase";
_source = _source.toLowerCase();
RDebugUtils.currentLine=84475906;
 //BA.debugLineNum = 84475906;BA.debugLine="Dim methodName As String = $\"${source}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(_source))+"_change");
RDebugUtils.currentLine=84475907;
 //BA.debugLineNum = 84475907;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmcheckbox)(this);};
RDebugUtils.currentLine=84475908;
 //BA.debugLineNum = 84475908;BA.debugLine="Dim sval As String";
_sval = "";
RDebugUtils.currentLine=84475909;
 //BA.debugLineNum = 84475909;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_sval)}))));
RDebugUtils.currentLine=84475910;
 //BA.debugLineNum = 84475910;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
__ref._setattr /*b4j.example.vmcheckbox*/ (null,__c.createMap(new Object[] {(Object)("v-on:change"),(Object)(_methodname)}));
RDebugUtils.currentLine=84475912;
 //BA.debugLineNum = 84475912;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=84475913;
 //BA.debugLineNum = 84475913;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=84475914;
 //BA.debugLineNum = 84475914;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmcheckbox __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=84738048;
 //BA.debugLineNum = 84738048;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=84738049;
 //BA.debugLineNum = 84738049;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=84738050;
 //BA.debugLineNum = 84738050;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=84672512;
 //BA.debugLineNum = 84672512;BA.debugLine="Sub Render";
RDebugUtils.currentLine=84672513;
 //BA.debugLineNum = 84672513;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=84672514;
 //BA.debugLineNum = 84672514;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmcheckbox  _setattr(b4j.example.vmcheckbox __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=84410368;
 //BA.debugLineNum = 84410368;BA.debugLine="Sub SetAttr(attr As Map) As VMCheckBox";
RDebugUtils.currentLine=84410369;
 //BA.debugLineNum = 84410369;BA.debugLine="CheckBox.SetAttr(attr)";
__ref._checkbox /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=84410370;
 //BA.debugLineNum = 84410370;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=84410371;
 //BA.debugLineNum = 84410371;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setdisabled(b4j.example.vmcheckbox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=84279296;
 //BA.debugLineNum = 84279296;BA.debugLine="Sub SetDisabled(b As Boolean) As VMCheckBox";
RDebugUtils.currentLine=84279297;
 //BA.debugLineNum = 84279297;BA.debugLine="CheckBox.SetDisabled(b)";
__ref._checkbox /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=84279298;
 //BA.debugLineNum = 84279298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=84279299;
 //BA.debugLineNum = 84279299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setindeterminate(b4j.example.vmcheckbox __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "setindeterminate", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "setindeterminate", null));}
RDebugUtils.currentLine=84082688;
 //BA.debugLineNum = 84082688;BA.debugLine="Sub SetIndeterminate As VMCheckBox";
RDebugUtils.currentLine=84082689;
 //BA.debugLineNum = 84082689;BA.debugLine="If xmodel = \"\" Then";
if ((__ref._xmodel /*String*/ ).equals("")) { 
RDebugUtils.currentLine=84082690;
 //BA.debugLineNum = 84082690;BA.debugLine="Log($\"VMCheckBox.${ID} - you need to set the v-m";
__c.Log(("VMCheckBox."+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+" - you need to set the v-model first!"));
 };
RDebugUtils.currentLine=84082692;
 //BA.debugLineNum = 84082692;BA.debugLine="vue.SetStateSingle(xmodel, True)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._xmodel /*String*/ ,(Object)(__c.True));
RDebugUtils.currentLine=84082693;
 //BA.debugLineNum = 84082693;BA.debugLine="CheckBox.SetAttr(CreateMap(\"indeterminate\":True))";
__ref._checkbox /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("indeterminate"),(Object)(__c.True)}));
RDebugUtils.currentLine=84082694;
 //BA.debugLineNum = 84082694;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=84082695;
 //BA.debugLineNum = 84082695;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setname(b4j.example.vmcheckbox __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=84148224;
 //BA.debugLineNum = 84148224;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=84148225;
 //BA.debugLineNum = 84148225;BA.debugLine="CheckBox.SetName(varName, bind)";
__ref._checkbox /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=84148226;
 //BA.debugLineNum = 84148226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=84148227;
 //BA.debugLineNum = 84148227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setprimary(b4j.example.vmcheckbox __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=84017152;
 //BA.debugLineNum = 84017152;BA.debugLine="Sub SetPrimary(b As Boolean) As VMCheckBox";
RDebugUtils.currentLine=84017153;
 //BA.debugLineNum = 84017153;BA.debugLine="CheckBox.SetPrimary(b)";
__ref._checkbox /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=84017154;
 //BA.debugLineNum = 84017154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=84017155;
 //BA.debugLineNum = 84017155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _settabindex(b4j.example.vmcheckbox __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=83820544;
 //BA.debugLineNum = 83820544;BA.debugLine="Sub SetTabIndex(ti As String) As VMCheckBox";
RDebugUtils.currentLine=83820545;
 //BA.debugLineNum = 83820545;BA.debugLine="CheckBox.SetTabIndex(ti)";
__ref._checkbox /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=83820546;
 //BA.debugLineNum = 83820546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=83820547;
 //BA.debugLineNum = 83820547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _settext(b4j.example.vmcheckbox __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=83886080;
 //BA.debugLineNum = 83886080;BA.debugLine="Sub SetText(t As String) As VMCheckBox";
RDebugUtils.currentLine=83886081;
 //BA.debugLineNum = 83886081;BA.debugLine="CheckBox.SetText(t)";
__ref._checkbox /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=83886082;
 //BA.debugLineNum = 83886082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=83886083;
 //BA.debugLineNum = 83886083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvalue(b4j.example.vmcheckbox __ref,Object _varname) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "setvalue", new Object[] {_varname}));}
RDebugUtils.currentLine=84213760;
 //BA.debugLineNum = 84213760;BA.debugLine="Sub SetValue(varName As Object) As VMCheckBox";
RDebugUtils.currentLine=84213761;
 //BA.debugLineNum = 84213761;BA.debugLine="CheckBox.SetValue(varName, False)";
__ref._checkbox /*b4j.example.vmelement*/ ._setvalue /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),__c.False);
RDebugUtils.currentLine=84213762;
 //BA.debugLineNum = 84213762;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=84213763;
 //BA.debugLineNum = 84213763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvmodel(b4j.example.vmcheckbox __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=84541440;
 //BA.debugLineNum = 84541440;BA.debugLine="Sub SetVModel(k As String) As VMCheckBox";
RDebugUtils.currentLine=84541441;
 //BA.debugLineNum = 84541441;BA.debugLine="xmodel = k";
__ref._xmodel /*String*/  = _k;
RDebugUtils.currentLine=84541442;
 //BA.debugLineNum = 84541442;BA.debugLine="CheckBox.SetVModel(k)";
__ref._checkbox /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=84541443;
 //BA.debugLineNum = 84541443;BA.debugLine="vue.SetStateSingle(xmodel, Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._xmodel /*String*/ ,__c.Null);
RDebugUtils.currentLine=84541444;
 //BA.debugLineNum = 84541444;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=84541445;
 //BA.debugLineNum = 84541445;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmcheckbox  _setvshow(b4j.example.vmcheckbox __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmcheckbox";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmcheckbox) Debug.delegate(ba, "setvshow", new Object[] {_vshow}));}
RDebugUtils.currentLine=83951616;
 //BA.debugLineNum = 83951616;BA.debugLine="Sub SetVShow(vshow As String) As VMCheckBox";
RDebugUtils.currentLine=83951617;
 //BA.debugLineNum = 83951617;BA.debugLine="CheckBox.SetVShow(vshow)";
__ref._checkbox /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=83951618;
 //BA.debugLineNum = 83951618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmcheckbox)(this);
RDebugUtils.currentLine=83951619;
 //BA.debugLineNum = 83951619;BA.debugLine="End Sub";
return null;
}
}