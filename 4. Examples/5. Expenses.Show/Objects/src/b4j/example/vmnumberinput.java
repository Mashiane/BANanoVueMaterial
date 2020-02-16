package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmnumberinput extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmnumberinput", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmnumberinput.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _numberinput = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmelement _div = null;
public b4j.example.vmelement _lbl = null;
public String _mdl = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmnumberinput  _initialize(b4j.example.vmnumberinput __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid}));}
RDebugUtils.currentLine=176947200;
 //BA.debugLineNum = 176947200;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=176947201;
 //BA.debugLineNum = 176947201;BA.debugLine="BANano.DependsOnAsset(\"vue-number-input.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("vue-number-input.js");
RDebugUtils.currentLine=176947203;
 //BA.debugLineNum = 176947203;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=176947204;
 //BA.debugLineNum = 176947204;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=176947205;
 //BA.debugLineNum = 176947205;BA.debugLine="div.Initialize(vue, $\"${ID}\"$).SetTag(\"div\")";
__ref._div /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+""))._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=176947206;
 //BA.debugLineNum = 176947206;BA.debugLine="lbl.Initialize(vue,$\"${ID}lbl\"$).SetTag(\"label\")";
__ref._lbl /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"lbl"))._settag /*b4j.example.vmelement*/ (null,"label");
RDebugUtils.currentLine=176947207;
 //BA.debugLineNum = 176947207;BA.debugLine="lbl.SetStyle(CreateMap(\"pointer-events\": \"auto\",";
__ref._lbl /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("pointer-events"),(Object)("auto"),(Object)("top"),(Object)("0"),(Object)("opacity"),(Object)("1"),(Object)("font-size"),(Object)("12px")}));
RDebugUtils.currentLine=176947208;
 //BA.debugLineNum = 176947208;BA.debugLine="NumberInput.Initialize(vue, ID).SetTag(\"number-in";
__ref._numberinput /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"number-input");
RDebugUtils.currentLine=176947209;
 //BA.debugLineNum = 176947209;BA.debugLine="mdl = \"\"";
__ref._mdl /*String*/  = "";
RDebugUtils.currentLine=176947210;
 //BA.debugLineNum = 176947210;BA.debugLine="SetCenter(True)";
__ref._setcenter /*b4j.example.vmnumberinput*/ (null,__c.True);
RDebugUtils.currentLine=176947211;
 //BA.debugLineNum = 176947211;BA.debugLine="SetControls(True)";
__ref._setcontrols /*b4j.example.vmnumberinput*/ (null,__c.True);
RDebugUtils.currentLine=176947212;
 //BA.debugLineNum = 176947212;BA.debugLine="SetInputable(False)";
__ref._setinputable /*b4j.example.vmnumberinput*/ (null,__c.False);
RDebugUtils.currentLine=176947213;
 //BA.debugLineNum = 176947213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=176947214;
 //BA.debugLineNum = 176947214;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setmin(b4j.example.vmnumberinput __ref,String _mn) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setmin", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setmin", new Object[] {_mn}));}
RDebugUtils.currentLine=178192384;
 //BA.debugLineNum = 178192384;BA.debugLine="Sub SetMin(mn As String) As VMNumberInput";
RDebugUtils.currentLine=178192385;
 //BA.debugLineNum = 178192385;BA.debugLine="If mn = \"\" Then Return Me";
if ((_mn).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=178192386;
 //BA.debugLineNum = 178192386;BA.debugLine="SetAttr(CreateMap(\":min\": mn))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)(":min"),(Object)(_mn)}));
RDebugUtils.currentLine=178192387;
 //BA.debugLineNum = 178192387;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=178192388;
 //BA.debugLineNum = 178192388;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setmax(b4j.example.vmnumberinput __ref,String _mx) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setmax", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setmax", new Object[] {_mx}));}
RDebugUtils.currentLine=178126848;
 //BA.debugLineNum = 178126848;BA.debugLine="Sub SetMax(mx As String) As VMNumberInput";
RDebugUtils.currentLine=178126849;
 //BA.debugLineNum = 178126849;BA.debugLine="If mx = \"\" Then Return Me";
if ((_mx).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=178126850;
 //BA.debugLineNum = 178126850;BA.debugLine="SetAttr(CreateMap(\":max\": mx))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)(":max"),(Object)(_mx)}));
RDebugUtils.currentLine=178126851;
 //BA.debugLineNum = 178126851;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=178126852;
 //BA.debugLineNum = 178126852;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setlabel(b4j.example.vmnumberinput __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setlabel", new Object[] {_t}));}
RDebugUtils.currentLine=177537024;
 //BA.debugLineNum = 177537024;BA.debugLine="Sub SetLabel(t As String) As VMNumberInput";
RDebugUtils.currentLine=177537025;
 //BA.debugLineNum = 177537025;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=177537026;
 //BA.debugLineNum = 177537026;BA.debugLine="lbl.SetText(t)";
__ref._lbl /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=177537027;
 //BA.debugLineNum = 177537027;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177537028;
 //BA.debugLineNum = 177537028;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setreadonly(b4j.example.vmnumberinput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setreadonly", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setreadonly", new Object[] {_b}));}
RDebugUtils.currentLine=177209344;
 //BA.debugLineNum = 177209344;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMNumberInput";
RDebugUtils.currentLine=177209345;
 //BA.debugLineNum = 177209345;BA.debugLine="If b = True Then Return Me";
if (_b==__c.True) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=177209346;
 //BA.debugLineNum = 177209346;BA.debugLine="SetAttr(CreateMap(\":readonly\": b))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)(":readonly"),(Object)(_b)}));
RDebugUtils.currentLine=177209347;
 //BA.debugLineNum = 177209347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177209348;
 //BA.debugLineNum = 177209348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setvmodel(b4j.example.vmnumberinput __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=178257920;
 //BA.debugLineNum = 178257920;BA.debugLine="Sub SetVModel(k As String) As VMNumberInput";
RDebugUtils.currentLine=178257921;
 //BA.debugLineNum = 178257921;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=178257922;
 //BA.debugLineNum = 178257922;BA.debugLine="mdl = k.tolowercase";
__ref._mdl /*String*/  = _k.toLowerCase();
RDebugUtils.currentLine=178257923;
 //BA.debugLineNum = 178257923;BA.debugLine="NumberInput.SetVModel(k)";
__ref._numberinput /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=178257924;
 //BA.debugLineNum = 178257924;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=178257925;
 //BA.debugLineNum = 178257925;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setvshow(b4j.example.vmnumberinput __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=178061312;
 //BA.debugLineNum = 178061312;BA.debugLine="Sub SetVShow(vif As String) As VMNumberInput";
RDebugUtils.currentLine=178061313;
 //BA.debugLineNum = 178061313;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=178061314;
 //BA.debugLineNum = 178061314;BA.debugLine="div.SetVShow(vif)";
__ref._div /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=178061315;
 //BA.debugLineNum = 178061315;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=178061316;
 //BA.debugLineNum = 178061316;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setdisabled(b4j.example.vmnumberinput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=177799168;
 //BA.debugLineNum = 177799168;BA.debugLine="Sub SetDisabled(b As Boolean) As VMNumberInput";
RDebugUtils.currentLine=177799169;
 //BA.debugLineNum = 177799169;BA.debugLine="NumberInput.SetDisabled(b)";
__ref._numberinput /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=177799170;
 //BA.debugLineNum = 177799170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177799171;
 //BA.debugLineNum = 177799171;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setname(b4j.example.vmnumberinput __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=177668096;
 //BA.debugLineNum = 177668096;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=177668097;
 //BA.debugLineNum = 177668097;BA.debugLine="NumberInput.SetName(varName, bind)";
__ref._numberinput /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=177668098;
 //BA.debugLineNum = 177668098;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177668099;
 //BA.debugLineNum = 177668099;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _settabindex(b4j.example.vmnumberinput __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=177602560;
 //BA.debugLineNum = 177602560;BA.debugLine="Sub SetTabIndex(ti As String) As VMNumberInput";
RDebugUtils.currentLine=177602561;
 //BA.debugLineNum = 177602561;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=177602562;
 //BA.debugLineNum = 177602562;BA.debugLine="NumberInput.SetTabIndex(ti)";
__ref._numberinput /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=177602563;
 //BA.debugLineNum = 177602563;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177602564;
 //BA.debugLineNum = 177602564;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmnumberinput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=178454528;
 //BA.debugLineNum = 178454528;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=178454529;
 //BA.debugLineNum = 178454529;BA.debugLine="lbl.Pop(div)";
__ref._lbl /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._div /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=178454530;
 //BA.debugLineNum = 178454530;BA.debugLine="NumberInput.Pop(div)";
__ref._numberinput /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._div /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=178454531;
 //BA.debugLineNum = 178454531;BA.debugLine="Return div.tostring";
if (true) return __ref._div /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=178454532;
 //BA.debugLineNum = 178454532;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnumberinput  _setsizesmall(b4j.example.vmnumberinput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setsizesmall", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setsizesmall", null));}
RDebugUtils.currentLine=177405952;
 //BA.debugLineNum = 177405952;BA.debugLine="Sub SetSizeSmall As VMNumberInput";
RDebugUtils.currentLine=177405953;
 //BA.debugLineNum = 177405953;BA.debugLine="SetAttr(CreateMap(\"size\":\"small\"))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)("size"),(Object)("small")}));
RDebugUtils.currentLine=177405954;
 //BA.debugLineNum = 177405954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177405955;
 //BA.debugLineNum = 177405955;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmnumberinput __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=178585600;
 //BA.debugLineNum = 178585600;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=178585601;
 //BA.debugLineNum = 178585601;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=178585602;
 //BA.debugLineNum = 178585602;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnumberinput  _addclass(b4j.example.vmnumberinput __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=177864704;
 //BA.debugLineNum = 177864704;BA.debugLine="Sub AddClass(c As String) As VMNumberInput";
RDebugUtils.currentLine=177864705;
 //BA.debugLineNum = 177864705;BA.debugLine="NumberInput.AddClass(c)";
__ref._numberinput /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=177864706;
 //BA.debugLineNum = 177864706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177864707;
 //BA.debugLineNum = 177864707;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmnumberinput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
RDebugUtils.currentLine=176881664;
 //BA.debugLineNum = 176881664;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=176881665;
 //BA.debugLineNum = 176881665;BA.debugLine="Public NumberInput As VMElement";
_numberinput = new b4j.example.vmelement();
RDebugUtils.currentLine=176881666;
 //BA.debugLineNum = 176881666;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=176881667;
 //BA.debugLineNum = 176881667;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=176881668;
 //BA.debugLineNum = 176881668;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=176881669;
 //BA.debugLineNum = 176881669;BA.debugLine="Private div As VMElement";
_div = new b4j.example.vmelement();
RDebugUtils.currentLine=176881670;
 //BA.debugLineNum = 176881670;BA.debugLine="Private lbl As VMElement";
_lbl = new b4j.example.vmelement();
RDebugUtils.currentLine=176881671;
 //BA.debugLineNum = 176881671;BA.debugLine="Private mdl As String";
_mdl = "";
RDebugUtils.currentLine=176881672;
 //BA.debugLineNum = 176881672;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnumberinput  _setcenter(b4j.example.vmnumberinput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setcenter", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setcenter", new Object[] {_b}));}
RDebugUtils.currentLine=177078272;
 //BA.debugLineNum = 177078272;BA.debugLine="Sub SetCenter(b As Boolean) As VMNumberInput";
RDebugUtils.currentLine=177078273;
 //BA.debugLineNum = 177078273;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=177078274;
 //BA.debugLineNum = 177078274;BA.debugLine="SetAttr(CreateMap(\":center\":b))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)(":center"),(Object)(_b)}));
RDebugUtils.currentLine=177078275;
 //BA.debugLineNum = 177078275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177078276;
 //BA.debugLineNum = 177078276;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setcontrols(b4j.example.vmnumberinput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setcontrols", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setcontrols", new Object[] {_b}));}
RDebugUtils.currentLine=177012736;
 //BA.debugLineNum = 177012736;BA.debugLine="Sub SetControls(b As Boolean) As VMNumberInput";
RDebugUtils.currentLine=177012737;
 //BA.debugLineNum = 177012737;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=177012738;
 //BA.debugLineNum = 177012738;BA.debugLine="SetAttr(CreateMap(\":controls\":b))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)(":controls"),(Object)(_b)}));
RDebugUtils.currentLine=177012739;
 //BA.debugLineNum = 177012739;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177012740;
 //BA.debugLineNum = 177012740;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setinputable(b4j.example.vmnumberinput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setinputable", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setinputable", new Object[] {_b}));}
RDebugUtils.currentLine=177274880;
 //BA.debugLineNum = 177274880;BA.debugLine="Sub SetInputable(b As Boolean) As VMNumberInput";
RDebugUtils.currentLine=177274881;
 //BA.debugLineNum = 177274881;BA.debugLine="If b = True Then Return Me";
if (_b==__c.True) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=177274882;
 //BA.debugLineNum = 177274882;BA.debugLine="SetAttr(CreateMap(\":inputtable\": b))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)(":inputtable"),(Object)(_b)}));
RDebugUtils.currentLine=177274883;
 //BA.debugLineNum = 177274883;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177274884;
 //BA.debugLineNum = 177274884;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmnumberinput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=178520064;
 //BA.debugLineNum = 178520064;BA.debugLine="Sub Render";
RDebugUtils.currentLine=178520065;
 //BA.debugLineNum = 178520065;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=178520066;
 //BA.debugLineNum = 178520066;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmnumberinput  _setattr(b4j.example.vmnumberinput __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=177930240;
 //BA.debugLineNum = 177930240;BA.debugLine="Sub SetAttr(attr As Map) As VMNumberInput";
RDebugUtils.currentLine=177930241;
 //BA.debugLineNum = 177930241;BA.debugLine="NumberInput.SetAttr(attr)";
__ref._numberinput /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=177930242;
 //BA.debugLineNum = 177930242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177930243;
 //BA.debugLineNum = 177930243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setid(b4j.example.vmnumberinput __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setid", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=177733632;
 //BA.debugLineNum = 177733632;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
RDebugUtils.currentLine=177733633;
 //BA.debugLineNum = 177733633;BA.debugLine="NumberInput.SetID(varName, bind)";
__ref._numberinput /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=177733634;
 //BA.debugLineNum = 177733634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177733635;
 //BA.debugLineNum = 177733635;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setinline(b4j.example.vmnumberinput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setinline", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setinline", new Object[] {_b}));}
RDebugUtils.currentLine=177143808;
 //BA.debugLineNum = 177143808;BA.debugLine="Sub SetInline(b As Boolean) As VMNumberInput";
RDebugUtils.currentLine=177143809;
 //BA.debugLineNum = 177143809;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=177143810;
 //BA.debugLineNum = 177143810;BA.debugLine="SetAttr(CreateMap(\":inline\":b))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)(":inline"),(Object)(_b)}));
RDebugUtils.currentLine=177143811;
 //BA.debugLineNum = 177143811;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177143812;
 //BA.debugLineNum = 177143812;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setrounded(b4j.example.vmnumberinput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setrounded", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setrounded", new Object[] {_b}));}
RDebugUtils.currentLine=177340416;
 //BA.debugLineNum = 177340416;BA.debugLine="Sub SetRounded(b As Boolean) As VMNumberInput";
RDebugUtils.currentLine=177340417;
 //BA.debugLineNum = 177340417;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=177340418;
 //BA.debugLineNum = 177340418;BA.debugLine="SetAttr(CreateMap(\"rounded\": b))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)("rounded"),(Object)(_b)}));
RDebugUtils.currentLine=177340419;
 //BA.debugLineNum = 177340419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177340420;
 //BA.debugLineNum = 177340420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setsizelarge(b4j.example.vmnumberinput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setsizelarge", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setsizelarge", null));}
RDebugUtils.currentLine=177471488;
 //BA.debugLineNum = 177471488;BA.debugLine="Sub SetSizeLarge As VMNumberInput";
RDebugUtils.currentLine=177471489;
 //BA.debugLineNum = 177471489;BA.debugLine="SetAttr(CreateMap(\"size\":\"large\"))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)("size"),(Object)("large")}));
RDebugUtils.currentLine=177471490;
 //BA.debugLineNum = 177471490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177471491;
 //BA.debugLineNum = 177471491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setstep(b4j.example.vmnumberinput __ref,String _stp) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setstep", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setstep", new Object[] {_stp}));}
RDebugUtils.currentLine=178388992;
 //BA.debugLineNum = 178388992;BA.debugLine="Sub SetStep(stp As String) As VMNumberInput";
RDebugUtils.currentLine=178388993;
 //BA.debugLineNum = 178388993;BA.debugLine="If stp = \"\" Then Return Me";
if ((_stp).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=178388994;
 //BA.debugLineNum = 178388994;BA.debugLine="SetAttr(CreateMap(\":step\":stp))";
__ref._setattr /*b4j.example.vmnumberinput*/ (null,__c.createMap(new Object[] {(Object)(":step"),(Object)(_stp)}));
RDebugUtils.currentLine=178388995;
 //BA.debugLineNum = 178388995;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=178388996;
 //BA.debugLineNum = 178388996;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setvalue(b4j.example.vmnumberinput __ref,String _vl) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setvalue", new Object[] {_vl}));}
RDebugUtils.currentLine=178323456;
 //BA.debugLineNum = 178323456;BA.debugLine="Sub SetValue(vl As String) As VMNumberInput";
RDebugUtils.currentLine=178323457;
 //BA.debugLineNum = 178323457;BA.debugLine="If mdl = \"\" Then";
if ((__ref._mdl /*String*/ ).equals("")) { 
RDebugUtils.currentLine=178323458;
 //BA.debugLineNum = 178323458;BA.debugLine="Log(\"VMNumberInput: Set VModel first!\")";
__c.Log("VMNumberInput: Set VModel first!");
 };
RDebugUtils.currentLine=178323460;
 //BA.debugLineNum = 178323460;BA.debugLine="vue.SetStateSingle(mdl, vl)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._mdl /*String*/ ,(Object)(_vl));
RDebugUtils.currentLine=178323461;
 //BA.debugLineNum = 178323461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=178323462;
 //BA.debugLineNum = 178323462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmnumberinput  _setvif(b4j.example.vmnumberinput __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmnumberinput";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmnumberinput) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=177995776;
 //BA.debugLineNum = 177995776;BA.debugLine="Sub SetVIf(vif As String) As VMNumberInput";
RDebugUtils.currentLine=177995777;
 //BA.debugLineNum = 177995777;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmnumberinput)(this);};
RDebugUtils.currentLine=177995778;
 //BA.debugLineNum = 177995778;BA.debugLine="div.SetVIf(vif)";
__ref._div /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=177995779;
 //BA.debugLineNum = 177995779;BA.debugLine="Return Me";
if (true) return (b4j.example.vmnumberinput)(this);
RDebugUtils.currentLine=177995780;
 //BA.debugLineNum = 177995780;BA.debugLine="End Sub";
return null;
}
}