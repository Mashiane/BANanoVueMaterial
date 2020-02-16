package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtextarea extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtextarea", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtextarea.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _textarea = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmfield _internal = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public boolean _haserror = false;
public b4j.example.vmelement _he = null;
public b4j.example.vmicon _icon1 = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmtextarea  _initialize(b4j.example.vmtextarea __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=213516288;
 //BA.debugLineNum = 213516288;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=213516289;
 //BA.debugLineNum = 213516289;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=213516290;
 //BA.debugLineNum = 213516290;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=213516291;
 //BA.debugLineNum = 213516291;BA.debugLine="TextArea.Initialize(v, ID)";
__ref._textarea /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=213516292;
 //BA.debugLineNum = 213516292;BA.debugLine="TextArea.SetTag(\"md-textarea\")";
__ref._textarea /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-textarea");
RDebugUtils.currentLine=213516293;
 //BA.debugLineNum = 213516293;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=213516294;
 //BA.debugLineNum = 213516294;BA.debugLine="Internal.Initialize(v,ID,$\"${ID}field\"$, module)";
__ref._internal /*b4j.example.vmfield*/ ._initialize /*b4j.example.vmfield*/ (null,ba,_v,__ref._id /*String*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"field"),__ref._module /*Object*/ );
RDebugUtils.currentLine=213516295;
 //BA.debugLineNum = 213516295;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
__ref._lbl /*b4j.example.vmlabel*/ ._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"label"));
RDebugUtils.currentLine=213516296;
 //BA.debugLineNum = 213516296;BA.debugLine="hasHelp = False";
__ref._hashelp /*boolean*/  = __c.False;
RDebugUtils.currentLine=213516297;
 //BA.debugLineNum = 213516297;BA.debugLine="hasError = False";
__ref._haserror /*boolean*/  = __c.False;
RDebugUtils.currentLine=213516298;
 //BA.debugLineNum = 213516298;BA.debugLine="icon1.Initialize(vue,$\"${ID}icon\"$)";
__ref._icon1 /*b4j.example.vmicon*/ ._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icon"));
RDebugUtils.currentLine=213516299;
 //BA.debugLineNum = 213516299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=213516300;
 //BA.debugLineNum = 213516300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setclearable(b4j.example.vmtextarea __ref,boolean _varclearable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setclearable", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setclearable", new Object[] {_varclearable}));}
RDebugUtils.currentLine=215547904;
 //BA.debugLineNum = 215547904;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMTex";
RDebugUtils.currentLine=215547905;
 //BA.debugLineNum = 215547905;BA.debugLine="If varClearable Then Internal.SetAttr(CreateMap(\"";
if (_varclearable) { 
__ref._internal /*b4j.example.vmfield*/ ._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-clearable"),(Object)(_varclearable)}));};
RDebugUtils.currentLine=215547906;
 //BA.debugLineNum = 215547906;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=215547907;
 //BA.debugLineNum = 215547907;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _seterrortext(b4j.example.vmtextarea __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "seterrortext", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "seterrortext", new Object[] {_t}));}
RDebugUtils.currentLine=214171648;
 //BA.debugLineNum = 214171648;BA.debugLine="Sub SetErrorText(t As String) As VMTextArea";
RDebugUtils.currentLine=214171649;
 //BA.debugLineNum = 214171649;BA.debugLine="hasError = True";
__ref._haserror /*boolean*/  = __c.True;
RDebugUtils.currentLine=214171650;
 //BA.debugLineNum = 214171650;BA.debugLine="he = TextArea.SetErrorText(t)";
__ref._he /*b4j.example.vmelement*/  = __ref._textarea /*b4j.example.vmelement*/ ._seterrortext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=214171651;
 //BA.debugLineNum = 214171651;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214171652;
 //BA.debugLineNum = 214171652;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setlabel(b4j.example.vmtextarea __ref,String _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setlabel", new Object[] {_l}));}
RDebugUtils.currentLine=213909504;
 //BA.debugLineNum = 213909504;BA.debugLine="Sub SetLabel(l As String) As VMTextArea";
RDebugUtils.currentLine=213909505;
 //BA.debugLineNum = 213909505;BA.debugLine="If l = \"\" Then Return Me";
if ((_l).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=213909506;
 //BA.debugLineNum = 213909506;BA.debugLine="lbl.SetText(l)";
__ref._lbl /*b4j.example.vmlabel*/ ._settext /*b4j.example.vmlabel*/ (null,_l);
RDebugUtils.currentLine=213909507;
 //BA.debugLineNum = 213909507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=213909508;
 //BA.debugLineNum = 213909508;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setreadonly(b4j.example.vmtextarea __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setreadonly", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setreadonly", new Object[] {_b}));}
RDebugUtils.currentLine=213843968;
 //BA.debugLineNum = 213843968;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMTextArea";
RDebugUtils.currentLine=213843969;
 //BA.debugLineNum = 213843969;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=213843970;
 //BA.debugLineNum = 213843970;BA.debugLine="TextArea.SetAttr(CreateMap(\":readonly\": b))";
__ref._textarea /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":readonly"),(Object)(_b)}));
RDebugUtils.currentLine=213843971;
 //BA.debugLineNum = 213843971;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=213843972;
 //BA.debugLineNum = 213843972;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setvmodel(b4j.example.vmtextarea __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=214040576;
 //BA.debugLineNum = 214040576;BA.debugLine="Sub SetVModel(k As String) As VMTextArea";
RDebugUtils.currentLine=214040577;
 //BA.debugLineNum = 214040577;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=214040578;
 //BA.debugLineNum = 214040578;BA.debugLine="TextArea.SetVModel(k)";
__ref._textarea /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=214040579;
 //BA.debugLineNum = 214040579;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214040580;
 //BA.debugLineNum = 214040580;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setvshow(b4j.example.vmtextarea __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=214302720;
 //BA.debugLineNum = 214302720;BA.debugLine="Sub SetVShow(vif As String) As VMTextArea";
RDebugUtils.currentLine=214302721;
 //BA.debugLineNum = 214302721;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=214302722;
 //BA.debugLineNum = 214302722;BA.debugLine="Internal.SetVShow(vif)";
__ref._internal /*b4j.example.vmfield*/ ._setvshow /*b4j.example.vmfield*/ (null,(Object)(_vif));
RDebugUtils.currentLine=214302723;
 //BA.debugLineNum = 214302723;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214302724;
 //BA.debugLineNum = 214302724;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setdisabled(b4j.example.vmtextarea __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=215220224;
 //BA.debugLineNum = 215220224;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTextArea";
RDebugUtils.currentLine=215220225;
 //BA.debugLineNum = 215220225;BA.debugLine="TextArea.SetDisabled(b)";
__ref._textarea /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=215220226;
 //BA.debugLineNum = 215220226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=215220227;
 //BA.debugLineNum = 215220227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setrequired(b4j.example.vmtextarea __ref,boolean _varrequired) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setrequired", new Object[] {_varrequired}));}
RDebugUtils.currentLine=215154688;
 //BA.debugLineNum = 215154688;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMTextA";
RDebugUtils.currentLine=215154689;
 //BA.debugLineNum = 215154689;BA.debugLine="TextArea.SetRequired(varRequired)";
__ref._textarea /*b4j.example.vmelement*/ ._setrequired /*b4j.example.vmelement*/ (null,_varrequired);
RDebugUtils.currentLine=215154690;
 //BA.debugLineNum = 215154690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=215154691;
 //BA.debugLineNum = 215154691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setname(b4j.example.vmtextarea __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=213712896;
 //BA.debugLineNum = 213712896;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=213712897;
 //BA.debugLineNum = 213712897;BA.debugLine="TextArea.SetName(varName, bind)";
__ref._textarea /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=213712898;
 //BA.debugLineNum = 213712898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=213712899;
 //BA.debugLineNum = 213712899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _settabindex(b4j.example.vmtextarea __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=213647360;
 //BA.debugLineNum = 213647360;BA.debugLine="Sub SetTabIndex(ti As String) As VMTextArea";
RDebugUtils.currentLine=213647361;
 //BA.debugLineNum = 213647361;BA.debugLine="TextArea.SetTabIndex(ti)";
__ref._textarea /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=213647362;
 //BA.debugLineNum = 213647362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=213647363;
 //BA.debugLineNum = 213647363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setmaxlength(b4j.example.vmtextarea __ref,String _varmaxlength) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setmaxlength", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setmaxlength", new Object[] {_varmaxlength}));}
RDebugUtils.currentLine=215285760;
 //BA.debugLineNum = 215285760;BA.debugLine="Sub SetMaxLength(varMaxlength As String) As VMText";
RDebugUtils.currentLine=215285761;
 //BA.debugLineNum = 215285761;BA.debugLine="If varMaxlength = \"\" Then Return Me";
if ((_varmaxlength).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=215285762;
 //BA.debugLineNum = 215285762;BA.debugLine="If varMaxlength = Null Then Return Me";
if (_varmaxlength== null) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=215285763;
 //BA.debugLineNum = 215285763;BA.debugLine="SetAttr(CreateMap(\"maxlength\": varMaxlength))";
__ref._setattr /*b4j.example.vmtextarea*/ (null,__c.createMap(new Object[] {(Object)("maxlength"),(Object)(_varmaxlength)}));
RDebugUtils.currentLine=215285764;
 //BA.debugLineNum = 215285764;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=215285765;
 //BA.debugLineNum = 215285765;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setplaceholder(b4j.example.vmtextarea __ref,Object _varplaceholder) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setplaceholder", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setplaceholder", new Object[] {_varplaceholder}));}
RDebugUtils.currentLine=215089152;
 //BA.debugLineNum = 215089152;BA.debugLine="Sub SetPlaceholder(varPlaceholder As Object) As VM";
RDebugUtils.currentLine=215089153;
 //BA.debugLineNum = 215089153;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
__ref._setattr /*b4j.example.vmtextarea*/ (null,__c.createMap(new Object[] {(Object)("placeholder"),_varplaceholder}));
RDebugUtils.currentLine=215089154;
 //BA.debugLineNum = 215089154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=215089155;
 //BA.debugLineNum = 215089155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _sethelpertext(b4j.example.vmtextarea __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "sethelpertext", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "sethelpertext", new Object[] {_t}));}
RDebugUtils.currentLine=214106112;
 //BA.debugLineNum = 214106112;BA.debugLine="Sub SetHelperText(t As String) As VMTextArea";
RDebugUtils.currentLine=214106113;
 //BA.debugLineNum = 214106113;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=214106114;
 //BA.debugLineNum = 214106114;BA.debugLine="hasHelp = True";
__ref._hashelp /*boolean*/  = __c.True;
RDebugUtils.currentLine=214106115;
 //BA.debugLineNum = 214106115;BA.debugLine="ht = TextArea.SetHelperText(t)";
__ref._ht /*b4j.example.vmelement*/  = __ref._textarea /*b4j.example.vmelement*/ ._sethelpertext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=214106116;
 //BA.debugLineNum = 214106116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214106117;
 //BA.debugLineNum = 214106117;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setautogrow(b4j.example.vmtextarea __ref,boolean _varautogrow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setautogrow", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setautogrow", new Object[] {_varautogrow}));}
RDebugUtils.currentLine=215416832;
 //BA.debugLineNum = 215416832;BA.debugLine="Sub SetAutogrow(varAutogrow As Boolean) As VMTextA";
RDebugUtils.currentLine=215416833;
 //BA.debugLineNum = 215416833;BA.debugLine="If varAutogrow = False Then Return Me";
if (_varautogrow==__c.False) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=215416834;
 //BA.debugLineNum = 215416834;BA.debugLine="SetAttr(CreateMap(\":md-autogrow\": varAutogrow))";
__ref._setattr /*b4j.example.vmtextarea*/ (null,__c.createMap(new Object[] {(Object)(":md-autogrow"),(Object)(_varautogrow)}));
RDebugUtils.currentLine=215416835;
 //BA.debugLineNum = 215416835;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=215416836;
 //BA.debugLineNum = 215416836;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _seticon(b4j.example.vmtextarea __ref,String _stricon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "seticon", new Object[] {_stricon}));}
RDebugUtils.currentLine=213778432;
 //BA.debugLineNum = 213778432;BA.debugLine="Sub SetIcon(strIcon As String) As VMTextArea";
RDebugUtils.currentLine=213778433;
 //BA.debugLineNum = 213778433;BA.debugLine="If strIcon <> \"\" Then icon1.SetText(strIcon)";
if ((_stricon).equals("") == false) { 
__ref._icon1 /*b4j.example.vmicon*/ ._settext /*b4j.example.vmicon*/ (null,_stricon);};
RDebugUtils.currentLine=213778434;
 //BA.debugLineNum = 213778434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=213778435;
 //BA.debugLineNum = 213778435;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmtextarea __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=213975040;
 //BA.debugLineNum = 213975040;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=213975041;
 //BA.debugLineNum = 213975041;BA.debugLine="lbl.Pop(Internal.Field)";
__ref._lbl /*b4j.example.vmlabel*/ ._pop /*String*/ (null,__ref._internal /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=213975042;
 //BA.debugLineNum = 213975042;BA.debugLine="TextArea.Pop(Internal.Field)";
__ref._textarea /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._internal /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=213975043;
 //BA.debugLineNum = 213975043;BA.debugLine="If hasHelp Then";
if (__ref._hashelp /*boolean*/ ) { 
RDebugUtils.currentLine=213975044;
 //BA.debugLineNum = 213975044;BA.debugLine="ht.Pop(Internal.Field)";
__ref._ht /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._internal /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=213975046;
 //BA.debugLineNum = 213975046;BA.debugLine="If hasError Then";
if (__ref._haserror /*boolean*/ ) { 
RDebugUtils.currentLine=213975047;
 //BA.debugLineNum = 213975047;BA.debugLine="he.Pop(Internal.field)";
__ref._he /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._internal /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=213975049;
 //BA.debugLineNum = 213975049;BA.debugLine="If icon1.hasContent Then";
if (__ref._icon1 /*b4j.example.vmicon*/ ._hascontent /*boolean*/ ) { 
RDebugUtils.currentLine=213975050;
 //BA.debugLineNum = 213975050;BA.debugLine="icon1.Pop(Internal.Field)";
__ref._icon1 /*b4j.example.vmicon*/ ._pop /*String*/ (null,__ref._internal /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=213975052;
 //BA.debugLineNum = 213975052;BA.debugLine="Return Internal.tostring";
if (true) return __ref._internal /*b4j.example.vmfield*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=213975053;
 //BA.debugLineNum = 213975053;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmtextarea __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=214695936;
 //BA.debugLineNum = 214695936;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=214695937;
 //BA.debugLineNum = 214695937;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=214695938;
 //BA.debugLineNum = 214695938;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextarea  _addchild(b4j.example.vmtextarea __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=214433792;
 //BA.debugLineNum = 214433792;BA.debugLine="Sub AddChild(child As VMElement) As VMTextArea";
RDebugUtils.currentLine=214433793;
 //BA.debugLineNum = 214433793;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=214433794;
 //BA.debugLineNum = 214433794;BA.debugLine="TextArea.SetText(childHTML)";
__ref._textarea /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=214433795;
 //BA.debugLineNum = 214433795;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214433796;
 //BA.debugLineNum = 214433796;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmtextarea __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=214958080;
 //BA.debugLineNum = 214958080;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=214958081;
 //BA.debugLineNum = 214958081;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=214958082;
 //BA.debugLineNum = 214958082;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmtextarea*/ (null,_childx);
 }
};
RDebugUtils.currentLine=214958084;
 //BA.debugLineNum = 214958084;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextarea  _addclass(b4j.example.vmtextarea __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=214761472;
 //BA.debugLineNum = 214761472;BA.debugLine="Sub AddClass(c As String) As VMTextArea";
RDebugUtils.currentLine=214761473;
 //BA.debugLineNum = 214761473;BA.debugLine="TextArea.AddClass(c)";
__ref._textarea /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=214761474;
 //BA.debugLineNum = 214761474;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214761475;
 //BA.debugLineNum = 214761475;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmtextarea __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=215613440;
 //BA.debugLineNum = 215613440;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=215613441;
 //BA.debugLineNum = 215613441;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=215613442;
 //BA.debugLineNum = 215613442;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmtextarea __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
RDebugUtils.currentLine=213450752;
 //BA.debugLineNum = 213450752;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=213450753;
 //BA.debugLineNum = 213450753;BA.debugLine="Public TextArea As VMElement";
_textarea = new b4j.example.vmelement();
RDebugUtils.currentLine=213450754;
 //BA.debugLineNum = 213450754;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=213450755;
 //BA.debugLineNum = 213450755;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=213450756;
 //BA.debugLineNum = 213450756;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=213450757;
 //BA.debugLineNum = 213450757;BA.debugLine="Private Internal As VMField";
_internal = new b4j.example.vmfield();
RDebugUtils.currentLine=213450758;
 //BA.debugLineNum = 213450758;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
RDebugUtils.currentLine=213450759;
 //BA.debugLineNum = 213450759;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
RDebugUtils.currentLine=213450760;
 //BA.debugLineNum = 213450760;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
RDebugUtils.currentLine=213450761;
 //BA.debugLineNum = 213450761;BA.debugLine="Private hasError As Boolean";
_haserror = false;
RDebugUtils.currentLine=213450762;
 //BA.debugLineNum = 213450762;BA.debugLine="Private he As VMElement";
_he = new b4j.example.vmelement();
RDebugUtils.currentLine=213450763;
 //BA.debugLineNum = 213450763;BA.debugLine="Private icon1 As VMIcon";
_icon1 = new b4j.example.vmicon();
RDebugUtils.currentLine=213450764;
 //BA.debugLineNum = 213450764;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=213450765;
 //BA.debugLineNum = 213450765;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmtextarea __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=214368256;
 //BA.debugLineNum = 214368256;BA.debugLine="Sub Render";
RDebugUtils.currentLine=214368257;
 //BA.debugLineNum = 214368257;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=214368258;
 //BA.debugLineNum = 214368258;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtextarea  _setaccent(b4j.example.vmtextarea __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=214630400;
 //BA.debugLineNum = 214630400;BA.debugLine="Sub SetAccent(b As Boolean) As VMTextArea";
RDebugUtils.currentLine=214630401;
 //BA.debugLineNum = 214630401;BA.debugLine="TextArea.SetAccent(True)";
__ref._textarea /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=214630402;
 //BA.debugLineNum = 214630402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214630403;
 //BA.debugLineNum = 214630403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setattr(b4j.example.vmtextarea __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=214827008;
 //BA.debugLineNum = 214827008;BA.debugLine="Sub SetAttr(attr As Map) As VMTextArea";
RDebugUtils.currentLine=214827009;
 //BA.debugLineNum = 214827009;BA.debugLine="TextArea.SetAttr(attr)";
__ref._textarea /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=214827010;
 //BA.debugLineNum = 214827010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214827011;
 //BA.debugLineNum = 214827011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setcounter(b4j.example.vmtextarea __ref,String _varcounter) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setcounter", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setcounter", new Object[] {_varcounter}));}
RDebugUtils.currentLine=215351296;
 //BA.debugLineNum = 215351296;BA.debugLine="Sub SetCounter(varCounter As String) As VMTextArea";
RDebugUtils.currentLine=215351297;
 //BA.debugLineNum = 215351297;BA.debugLine="If varCounter = \"\" Then Return Me";
if ((_varcounter).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=215351298;
 //BA.debugLineNum = 215351298;BA.debugLine="SetAttr(CreateMap(\":md-counter\": varCounter))";
__ref._setattr /*b4j.example.vmtextarea*/ (null,__c.createMap(new Object[] {(Object)(":md-counter"),(Object)(_varcounter)}));
RDebugUtils.currentLine=215351299;
 //BA.debugLineNum = 215351299;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=215351300;
 //BA.debugLineNum = 215351300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setcounterdisabled(b4j.example.vmtextarea __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setcounterdisabled", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setcounterdisabled", null));}
RDebugUtils.currentLine=213581824;
 //BA.debugLineNum = 213581824;BA.debugLine="Sub SetCounterDisabled As VMTextArea";
RDebugUtils.currentLine=213581825;
 //BA.debugLineNum = 213581825;BA.debugLine="Internal.SetAttr(CreateMap(\":md-counter\": False))";
__ref._internal /*b4j.example.vmfield*/ ._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-counter"),(Object)(__c.False)}));
RDebugUtils.currentLine=213581826;
 //BA.debugLineNum = 213581826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=213581827;
 //BA.debugLineNum = 213581827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setinline(b4j.example.vmtextarea __ref,boolean _varinline) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setinline", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setinline", new Object[] {_varinline}));}
RDebugUtils.currentLine=215482368;
 //BA.debugLineNum = 215482368;BA.debugLine="Sub SetInline(varInline As Boolean) As VMTextArea";
RDebugUtils.currentLine=215482369;
 //BA.debugLineNum = 215482369;BA.debugLine="If varInline = False Then Return Me";
if (_varinline==__c.False) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=215482370;
 //BA.debugLineNum = 215482370;BA.debugLine="Internal.SetAttr(CreateMap(\":md-inline\": varInlin";
__ref._internal /*b4j.example.vmfield*/ ._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-inline"),(Object)(_varinline)}));
RDebugUtils.currentLine=215482371;
 //BA.debugLineNum = 215482371;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=215482372;
 //BA.debugLineNum = 215482372;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setpadding(b4j.example.vmtextarea __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=215023616;
 //BA.debugLineNum = 215023616;BA.debugLine="Sub SetPadding(p As Object) As VMTextArea";
RDebugUtils.currentLine=215023617;
 //BA.debugLineNum = 215023617;BA.debugLine="TextArea.SetPaddingAll(p)";
__ref._textarea /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=215023618;
 //BA.debugLineNum = 215023618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=215023619;
 //BA.debugLineNum = 215023619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setprimary(b4j.example.vmtextarea __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=214564864;
 //BA.debugLineNum = 214564864;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTextArea";
RDebugUtils.currentLine=214564865;
 //BA.debugLineNum = 214564865;BA.debugLine="TextArea.SetPrimary(True)";
__ref._textarea /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=214564866;
 //BA.debugLineNum = 214564866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214564867;
 //BA.debugLineNum = 214564867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setstyle(b4j.example.vmtextarea __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=214892544;
 //BA.debugLineNum = 214892544;BA.debugLine="Sub SetStyle(sm As Map) As VMTextArea";
RDebugUtils.currentLine=214892545;
 //BA.debugLineNum = 214892545;BA.debugLine="TextArea.SetStyle(sm)";
__ref._textarea /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=214892546;
 //BA.debugLineNum = 214892546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214892547;
 //BA.debugLineNum = 214892547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _settext(b4j.example.vmtextarea __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=214499328;
 //BA.debugLineNum = 214499328;BA.debugLine="Sub SetText(t As Object) As VMTextArea";
RDebugUtils.currentLine=214499329;
 //BA.debugLineNum = 214499329;BA.debugLine="TextArea.SetText(t)";
__ref._textarea /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=214499330;
 //BA.debugLineNum = 214499330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214499331;
 //BA.debugLineNum = 214499331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtextarea  _setvif(b4j.example.vmtextarea __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtextarea";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmtextarea) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=214237184;
 //BA.debugLineNum = 214237184;BA.debugLine="Sub SetVIf(vif As String) As VMTextArea";
RDebugUtils.currentLine=214237185;
 //BA.debugLineNum = 214237185;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtextarea)(this);};
RDebugUtils.currentLine=214237186;
 //BA.debugLineNum = 214237186;BA.debugLine="Internal.SetVIf(vif)";
__ref._internal /*b4j.example.vmfield*/ ._setvif /*b4j.example.vmfield*/ (null,(Object)(_vif));
RDebugUtils.currentLine=214237187;
 //BA.debugLineNum = 214237187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtextarea)(this);
RDebugUtils.currentLine=214237188;
 //BA.debugLineNum = 214237188;BA.debugLine="End Sub";
return null;
}
}