package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vminput extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vminput", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vminput.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _input = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmfield _inputint = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public boolean _haserror = false;
public b4j.example.vmicon _icon1 = null;
public b4j.example.vmicon _icon2 = null;
public b4j.example.vmelement _suffix = null;
public b4j.example.vmelement _prefix = null;
public boolean _hassuffix = false;
public boolean _hasprefix = false;
public b4j.example.vmelement _he = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vminput  _settypeemail(b4j.example.vminput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "settypeemail", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "settypeemail", new Object[] {_b}));}
RDebugUtils.currentLine=148897792;
 //BA.debugLineNum = 148897792;BA.debugLine="Sub SetTypeEmail(b As Boolean) As VMInput    'igno";
RDebugUtils.currentLine=148897793;
 //BA.debugLineNum = 148897793;BA.debugLine="SetAttr(CreateMap(\"type\": \"email\"))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("type"),(Object)("email")}));
RDebugUtils.currentLine=148897794;
 //BA.debugLineNum = 148897794;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148897795;
 //BA.debugLineNum = 148897795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _initialize(b4j.example.vminput __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=147062784;
 //BA.debugLineNum = 147062784;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=147062785;
 //BA.debugLineNum = 147062785;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=147062786;
 //BA.debugLineNum = 147062786;BA.debugLine="Input.Initialize(v, ID)";
__ref._input /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=147062787;
 //BA.debugLineNum = 147062787;BA.debugLine="Input.SetTag(\"md-input\")";
__ref._input /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-input");
RDebugUtils.currentLine=147062788;
 //BA.debugLineNum = 147062788;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=147062789;
 //BA.debugLineNum = 147062789;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=147062790;
 //BA.debugLineNum = 147062790;BA.debugLine="InputInt.Initialize(v,ID, $\"${ID}field\"$,module)";
__ref._inputint /*b4j.example.vmfield*/ ._initialize /*b4j.example.vmfield*/ (null,ba,_v,__ref._id /*String*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"field"),__ref._module /*Object*/ );
RDebugUtils.currentLine=147062791;
 //BA.debugLineNum = 147062791;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
__ref._lbl /*b4j.example.vmlabel*/ ._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"label"));
RDebugUtils.currentLine=147062792;
 //BA.debugLineNum = 147062792;BA.debugLine="hasHelp = False";
__ref._hashelp /*boolean*/  = __c.False;
RDebugUtils.currentLine=147062793;
 //BA.debugLineNum = 147062793;BA.debugLine="hasError = False";
__ref._haserror /*boolean*/  = __c.False;
RDebugUtils.currentLine=147062794;
 //BA.debugLineNum = 147062794;BA.debugLine="icon1.Initialize(vue,$\"${ID}icon1\"$)";
__ref._icon1 /*b4j.example.vmicon*/ ._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icon1"));
RDebugUtils.currentLine=147062795;
 //BA.debugLineNum = 147062795;BA.debugLine="icon2.Initialize(vue,$\"${ID}icon2\"$)";
__ref._icon2 /*b4j.example.vmicon*/ ._initialize /*b4j.example.vmicon*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"icon2"));
RDebugUtils.currentLine=147062796;
 //BA.debugLineNum = 147062796;BA.debugLine="prefix.Initialize(vue,$\"${ID}prefix\"$).AddClass(\"";
__ref._prefix /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"prefix"))._addclass /*b4j.example.vmelement*/ (null,"md-prefix")._settag /*b4j.example.vmelement*/ (null,"span");
RDebugUtils.currentLine=147062797;
 //BA.debugLineNum = 147062797;BA.debugLine="suffix.Initialize(vue,$\"${ID}suffix\"$).AddClass(\"";
__ref._suffix /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"suffix"))._addclass /*b4j.example.vmelement*/ (null,"md-suffix")._settag /*b4j.example.vmelement*/ (null,"span");
RDebugUtils.currentLine=147062798;
 //BA.debugLineNum = 147062798;BA.debugLine="hasPrefix = False";
__ref._hasprefix /*boolean*/  = __c.False;
RDebugUtils.currentLine=147062799;
 //BA.debugLineNum = 147062799;BA.debugLine="hasSuffix = False";
__ref._hassuffix /*boolean*/  = __c.False;
RDebugUtils.currentLine=147062800;
 //BA.debugLineNum = 147062800;BA.debugLine="SetOnInput";
__ref._setoninput /*b4j.example.vminput*/ (null);
RDebugUtils.currentLine=147062801;
 //BA.debugLineNum = 147062801;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147062802;
 //BA.debugLineNum = 147062802;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settypenumber(b4j.example.vminput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "settypenumber", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "settypenumber", new Object[] {_b}));}
RDebugUtils.currentLine=149094400;
 //BA.debugLineNum = 149094400;BA.debugLine="Sub SetTypeNumber(b As Boolean) As VMInput    'ign";
RDebugUtils.currentLine=149094401;
 //BA.debugLineNum = 149094401;BA.debugLine="SetAttr(CreateMap(\"type\": \"number\"))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("type"),(Object)("number")}));
RDebugUtils.currentLine=149094402;
 //BA.debugLineNum = 149094402;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149094403;
 //BA.debugLineNum = 149094403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settypepassword(b4j.example.vminput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "settypepassword", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "settypepassword", new Object[] {_b}));}
RDebugUtils.currentLine=149028864;
 //BA.debugLineNum = 149028864;BA.debugLine="Sub SetTypePassword(b As Boolean) As VMInput    'i";
RDebugUtils.currentLine=149028865;
 //BA.debugLineNum = 149028865;BA.debugLine="SetAttr(CreateMap(\"type\": \"password\"))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("type"),(Object)("password")}));
RDebugUtils.currentLine=149028866;
 //BA.debugLineNum = 149028866;BA.debugLine="InputInt.SetAttr(CreateMap(\"md-has-password\":True";
__ref._inputint /*b4j.example.vmfield*/ ._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)("md-has-password"),(Object)(__c.True)}));
RDebugUtils.currentLine=149028867;
 //BA.debugLineNum = 149028867;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149028868;
 //BA.debugLineNum = 149028868;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settypetel(b4j.example.vminput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "settypetel", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "settypetel", new Object[] {_b}));}
RDebugUtils.currentLine=148963328;
 //BA.debugLineNum = 148963328;BA.debugLine="Sub SetTypeTel(b As Boolean) As VMInput    'ignore";
RDebugUtils.currentLine=148963329;
 //BA.debugLineNum = 148963329;BA.debugLine="SetAttr(CreateMap(\"type\": \"tel\"))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("type"),(Object)("tel")}));
RDebugUtils.currentLine=148963330;
 //BA.debugLineNum = 148963330;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148963331;
 //BA.debugLineNum = 148963331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _seterrortext(b4j.example.vminput __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "seterrortext", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "seterrortext", new Object[] {_t}));}
RDebugUtils.currentLine=147783680;
 //BA.debugLineNum = 147783680;BA.debugLine="Sub SetErrorText(t As String) As VMInput";
RDebugUtils.currentLine=147783681;
 //BA.debugLineNum = 147783681;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147783682;
 //BA.debugLineNum = 147783682;BA.debugLine="hasError = True";
__ref._haserror /*boolean*/  = __c.True;
RDebugUtils.currentLine=147783683;
 //BA.debugLineNum = 147783683;BA.debugLine="he = Input.SetErrorText(t)";
__ref._he /*b4j.example.vmelement*/  = __ref._input /*b4j.example.vmelement*/ ._seterrortext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=147783684;
 //BA.debugLineNum = 147783684;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147783685;
 //BA.debugLineNum = 147783685;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settype(b4j.example.vminput __ref,Object _vartype) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "settype", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "settype", new Object[] {_vartype}));}
RDebugUtils.currentLine=148766720;
 //BA.debugLineNum = 148766720;BA.debugLine="Sub SetType(varType As Object) As VMInput";
RDebugUtils.currentLine=148766721;
 //BA.debugLineNum = 148766721;BA.debugLine="SetAttr(CreateMap(\"type\": varType))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("type"),_vartype}));
RDebugUtils.currentLine=148766722;
 //BA.debugLineNum = 148766722;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148766723;
 //BA.debugLineNum = 148766723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setlabel(b4j.example.vminput __ref,String _lbltext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setlabel", new Object[] {_lbltext}));}
RDebugUtils.currentLine=147587072;
 //BA.debugLineNum = 147587072;BA.debugLine="Sub SetLabel(lblText As String) As VMInput";
RDebugUtils.currentLine=147587073;
 //BA.debugLineNum = 147587073;BA.debugLine="If lblText = \"\" Then Return Me";
if ((_lbltext).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147587074;
 //BA.debugLineNum = 147587074;BA.debugLine="lbl.SetText(lblText)";
__ref._lbl /*b4j.example.vmlabel*/ ._settext /*b4j.example.vmlabel*/ (null,_lbltext);
RDebugUtils.currentLine=147587075;
 //BA.debugLineNum = 147587075;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147587076;
 //BA.debugLineNum = 147587076;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setreadonly(b4j.example.vminput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setreadonly", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setreadonly", new Object[] {_b}));}
RDebugUtils.currentLine=147521536;
 //BA.debugLineNum = 147521536;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMInput";
RDebugUtils.currentLine=147521537;
 //BA.debugLineNum = 147521537;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147521538;
 //BA.debugLineNum = 147521538;BA.debugLine="Input.SetAttr(CreateMap(\":readonly\": b))";
__ref._input /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":readonly"),(Object)(_b)}));
RDebugUtils.currentLine=147521539;
 //BA.debugLineNum = 147521539;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147521540;
 //BA.debugLineNum = 147521540;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvmodel(b4j.example.vminput __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=147849216;
 //BA.debugLineNum = 147849216;BA.debugLine="Sub SetVModel(k As String) As VMInput";
RDebugUtils.currentLine=147849217;
 //BA.debugLineNum = 147849217;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147849218;
 //BA.debugLineNum = 147849218;BA.debugLine="Input.SetVModel(k)";
__ref._input /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=147849219;
 //BA.debugLineNum = 147849219;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147849220;
 //BA.debugLineNum = 147849220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvshow(b4j.example.vminput __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=147980288;
 //BA.debugLineNum = 147980288;BA.debugLine="Sub SetVShow(vif As Object) As VMInput";
RDebugUtils.currentLine=147980289;
 //BA.debugLineNum = 147980289;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals((Object)(""))) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147980290;
 //BA.debugLineNum = 147980290;BA.debugLine="InputInt.SetVShow(vif)";
__ref._inputint /*b4j.example.vmfield*/ ._setvshow /*b4j.example.vmfield*/ (null,_vif);
RDebugUtils.currentLine=147980291;
 //BA.debugLineNum = 147980291;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147980292;
 //BA.debugLineNum = 147980292;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setdisabled(b4j.example.vminput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=149422080;
 //BA.debugLineNum = 149422080;BA.debugLine="Sub SetDisabled(b As Boolean) As VMInput";
RDebugUtils.currentLine=149422081;
 //BA.debugLineNum = 149422081;BA.debugLine="Input.setdisabled(b)";
__ref._input /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=149422082;
 //BA.debugLineNum = 149422082;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149422083;
 //BA.debugLineNum = 149422083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setrequired(b4j.example.vminput __ref,boolean _varrequired) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setrequired", new Object[] {_varrequired}));}
RDebugUtils.currentLine=149225472;
 //BA.debugLineNum = 149225472;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMInput";
RDebugUtils.currentLine=149225473;
 //BA.debugLineNum = 149225473;BA.debugLine="Input.SetRequired(varRequired)";
__ref._input /*b4j.example.vmelement*/ ._setrequired /*b4j.example.vmelement*/ (null,_varrequired);
RDebugUtils.currentLine=149225474;
 //BA.debugLineNum = 149225474;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149225475;
 //BA.debugLineNum = 149225475;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setname(b4j.example.vminput __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=149291008;
 //BA.debugLineNum = 149291008;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=149291009;
 //BA.debugLineNum = 149291009;BA.debugLine="Input.SetName(varName, bind)";
__ref._input /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=149291010;
 //BA.debugLineNum = 149291010;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149291011;
 //BA.debugLineNum = 149291011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setautocomplete(b4j.example.vminput __ref,String _auto) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setautocomplete", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setautocomplete", new Object[] {_auto}));}
RDebugUtils.currentLine=147193856;
 //BA.debugLineNum = 147193856;BA.debugLine="Sub SetAutoComplete(auto As String) As VMInput";
RDebugUtils.currentLine=147193857;
 //BA.debugLineNum = 147193857;BA.debugLine="Input.SetAutoComplete(auto)";
__ref._input /*b4j.example.vmelement*/ ._setautocomplete /*b4j.example.vmelement*/ (null,_auto);
RDebugUtils.currentLine=147193858;
 //BA.debugLineNum = 147193858;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147193859;
 //BA.debugLineNum = 147193859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _seticon(b4j.example.vminput __ref,String _stricon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "seticon", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "seticon", new Object[] {_stricon}));}
RDebugUtils.currentLine=147390464;
 //BA.debugLineNum = 147390464;BA.debugLine="Sub SetIcon(strIcon As String) As VMInput";
RDebugUtils.currentLine=147390465;
 //BA.debugLineNum = 147390465;BA.debugLine="If strIcon = \"\" Then Return Me";
if ((_stricon).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147390466;
 //BA.debugLineNum = 147390466;BA.debugLine="icon1.SetText(strIcon)";
__ref._icon1 /*b4j.example.vmicon*/ ._settext /*b4j.example.vmicon*/ (null,_stricon);
RDebugUtils.currentLine=147390467;
 //BA.debugLineNum = 147390467;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147390468;
 //BA.debugLineNum = 147390468;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settabindex(b4j.example.vminput __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=149749760;
 //BA.debugLineNum = 149749760;BA.debugLine="Sub SetTabIndex(ti As String) As VMInput";
RDebugUtils.currentLine=149749761;
 //BA.debugLineNum = 149749761;BA.debugLine="Input.SetTabIndex(ti)";
__ref._input /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=149749762;
 //BA.debugLineNum = 149749762;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149749763;
 //BA.debugLineNum = 149749763;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setmaxlength(b4j.example.vminput __ref,int _varmaxlength) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setmaxlength", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setmaxlength", new Object[] {_varmaxlength}));}
RDebugUtils.currentLine=149487616;
 //BA.debugLineNum = 149487616;BA.debugLine="Sub SetMaxLength(varMaxlength As Int) As VMInput";
RDebugUtils.currentLine=149487617;
 //BA.debugLineNum = 149487617;BA.debugLine="If varMaxlength = Null Then Return Me";
if (_varmaxlength==(double)(BA.ObjectToNumber(__c.Null))) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=149487618;
 //BA.debugLineNum = 149487618;BA.debugLine="SetAttr(CreateMap(\"maxlength\": varMaxlength))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("maxlength"),(Object)(_varmaxlength)}));
RDebugUtils.currentLine=149487619;
 //BA.debugLineNum = 149487619;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149487620;
 //BA.debugLineNum = 149487620;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _sethelpertext(b4j.example.vminput __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "sethelpertext", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "sethelpertext", new Object[] {_t}));}
RDebugUtils.currentLine=147718144;
 //BA.debugLineNum = 147718144;BA.debugLine="Sub SetHelperText(t As String) As VMInput";
RDebugUtils.currentLine=147718145;
 //BA.debugLineNum = 147718145;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147718146;
 //BA.debugLineNum = 147718146;BA.debugLine="hasHelp = True";
__ref._hashelp /*boolean*/  = __c.True;
RDebugUtils.currentLine=147718147;
 //BA.debugLineNum = 147718147;BA.debugLine="ht = Input.SetHelperText(t)";
__ref._ht /*b4j.example.vmelement*/  = __ref._input /*b4j.example.vmelement*/ ._sethelpertext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=147718148;
 //BA.debugLineNum = 147718148;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147718149;
 //BA.debugLineNum = 147718149;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setplaceholder(b4j.example.vminput __ref,Object _varplaceholder) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setplaceholder", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setplaceholder", new Object[] {_varplaceholder}));}
RDebugUtils.currentLine=149159936;
 //BA.debugLineNum = 149159936;BA.debugLine="Sub SetPlaceholder(varPlaceholder As Object) As VM";
RDebugUtils.currentLine=149159937;
 //BA.debugLineNum = 149159937;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("placeholder"),_varplaceholder}));
RDebugUtils.currentLine=149159938;
 //BA.debugLineNum = 149159938;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149159939;
 //BA.debugLineNum = 149159939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setclearable(b4j.example.vminput __ref,boolean _varclearable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setclearable", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setclearable", new Object[] {_varclearable}));}
RDebugUtils.currentLine=149815296;
 //BA.debugLineNum = 149815296;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMInp";
RDebugUtils.currentLine=149815297;
 //BA.debugLineNum = 149815297;BA.debugLine="If varClearable = False Then Return Me";
if (_varclearable==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=149815298;
 //BA.debugLineNum = 149815298;BA.debugLine="If varClearable Then InputInt.SetAttr(CreateMap(\"";
if (_varclearable) { 
__ref._inputint /*b4j.example.vmfield*/ ._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-clearable"),(Object)(_varclearable)}));};
RDebugUtils.currentLine=149815299;
 //BA.debugLineNum = 149815299;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149815300;
 //BA.debugLineNum = 149815300;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settogglepassword(b4j.example.vminput __ref,boolean _vartogglepassword) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "settogglepassword", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "settogglepassword", new Object[] {_vartogglepassword}));}
RDebugUtils.currentLine=149880832;
 //BA.debugLineNum = 149880832;BA.debugLine="Sub SetTogglePassword(varTogglePassword As Boolean";
RDebugUtils.currentLine=149880833;
 //BA.debugLineNum = 149880833;BA.debugLine="If varTogglePassword = False Then Return Me";
if (_vartogglepassword==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=149880834;
 //BA.debugLineNum = 149880834;BA.debugLine="InputInt.SetAttr(CreateMap(\":md-toggle-password\":";
__ref._inputint /*b4j.example.vmfield*/ ._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-toggle-password"),(Object)(_vartogglepassword)}));
RDebugUtils.currentLine=149880835;
 //BA.debugLineNum = 149880835;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149880836;
 //BA.debugLineNum = 149880836;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vminput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=147652608;
 //BA.debugLineNum = 147652608;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=147652609;
 //BA.debugLineNum = 147652609;BA.debugLine="If icon1.hasContent Then";
if (__ref._icon1 /*b4j.example.vmicon*/ ._hascontent /*boolean*/ ) { 
RDebugUtils.currentLine=147652610;
 //BA.debugLineNum = 147652610;BA.debugLine="icon1.Pop(InputInt.Field)";
__ref._icon1 /*b4j.example.vmicon*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=147652612;
 //BA.debugLineNum = 147652612;BA.debugLine="lbl.Pop(InputInt.Field)";
__ref._lbl /*b4j.example.vmlabel*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=147652613;
 //BA.debugLineNum = 147652613;BA.debugLine="If hasPrefix Then";
if (__ref._hasprefix /*boolean*/ ) { 
RDebugUtils.currentLine=147652614;
 //BA.debugLineNum = 147652614;BA.debugLine="prefix.Pop(InputInt.Field)";
__ref._prefix /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=147652616;
 //BA.debugLineNum = 147652616;BA.debugLine="Input.Pop(InputInt.Field)";
__ref._input /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=147652617;
 //BA.debugLineNum = 147652617;BA.debugLine="If hasSuffix Then";
if (__ref._hassuffix /*boolean*/ ) { 
RDebugUtils.currentLine=147652618;
 //BA.debugLineNum = 147652618;BA.debugLine="suffix.Pop(InputInt.Field)";
__ref._suffix /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=147652620;
 //BA.debugLineNum = 147652620;BA.debugLine="If icon2.hasContent Then";
if (__ref._icon2 /*b4j.example.vmicon*/ ._hascontent /*boolean*/ ) { 
RDebugUtils.currentLine=147652621;
 //BA.debugLineNum = 147652621;BA.debugLine="icon2.Pop(InputInt.Field)";
__ref._icon2 /*b4j.example.vmicon*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=147652623;
 //BA.debugLineNum = 147652623;BA.debugLine="If hasHelp Then";
if (__ref._hashelp /*boolean*/ ) { 
RDebugUtils.currentLine=147652624;
 //BA.debugLineNum = 147652624;BA.debugLine="ht.Pop(InputInt.Field)";
__ref._ht /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=147652626;
 //BA.debugLineNum = 147652626;BA.debugLine="If hasError Then";
if (__ref._haserror /*boolean*/ ) { 
RDebugUtils.currentLine=147652627;
 //BA.debugLineNum = 147652627;BA.debugLine="he.Pop(InputInt.Field)";
__ref._he /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=147652629;
 //BA.debugLineNum = 147652629;BA.debugLine="Return InputInt.tostring";
if (true) return __ref._inputint /*b4j.example.vmfield*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=147652630;
 //BA.debugLineNum = 147652630;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _addchild(b4j.example.vminput __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=148111360;
 //BA.debugLineNum = 148111360;BA.debugLine="Sub AddChild(child As VMElement) As VMInput";
RDebugUtils.currentLine=148111361;
 //BA.debugLineNum = 148111361;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=148111362;
 //BA.debugLineNum = 148111362;BA.debugLine="Input.SetText(childHTML)";
__ref._input /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=148111363;
 //BA.debugLineNum = 148111363;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148111364;
 //BA.debugLineNum = 148111364;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vminput __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=148635648;
 //BA.debugLineNum = 148635648;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=148635649;
 //BA.debugLineNum = 148635649;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=148635650;
 //BA.debugLineNum = 148635650;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vminput*/ (null,_childx);
 }
};
RDebugUtils.currentLine=148635652;
 //BA.debugLineNum = 148635652;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _addclass(b4j.example.vminput __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=148439040;
 //BA.debugLineNum = 148439040;BA.debugLine="Sub AddClass(c As String) As VMInput";
RDebugUtils.currentLine=148439041;
 //BA.debugLineNum = 148439041;BA.debugLine="Input.AddClass(c)";
__ref._input /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=148439042;
 //BA.debugLineNum = 148439042;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148439043;
 //BA.debugLineNum = 148439043;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vminput __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=149946368;
 //BA.debugLineNum = 149946368;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=149946369;
 //BA.debugLineNum = 149946369;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=149946370;
 //BA.debugLineNum = 149946370;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vminput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
RDebugUtils.currentLine=146997248;
 //BA.debugLineNum = 146997248;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=146997249;
 //BA.debugLineNum = 146997249;BA.debugLine="Public Input As VMElement";
_input = new b4j.example.vmelement();
RDebugUtils.currentLine=146997250;
 //BA.debugLineNum = 146997250;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=146997251;
 //BA.debugLineNum = 146997251;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=146997252;
 //BA.debugLineNum = 146997252;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=146997253;
 //BA.debugLineNum = 146997253;BA.debugLine="Private InputInt As VMField";
_inputint = new b4j.example.vmfield();
RDebugUtils.currentLine=146997254;
 //BA.debugLineNum = 146997254;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
RDebugUtils.currentLine=146997255;
 //BA.debugLineNum = 146997255;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
RDebugUtils.currentLine=146997256;
 //BA.debugLineNum = 146997256;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
RDebugUtils.currentLine=146997257;
 //BA.debugLineNum = 146997257;BA.debugLine="Private hasError As Boolean";
_haserror = false;
RDebugUtils.currentLine=146997258;
 //BA.debugLineNum = 146997258;BA.debugLine="Private icon1 As VMIcon";
_icon1 = new b4j.example.vmicon();
RDebugUtils.currentLine=146997259;
 //BA.debugLineNum = 146997259;BA.debugLine="Private icon2 As VMIcon";
_icon2 = new b4j.example.vmicon();
RDebugUtils.currentLine=146997260;
 //BA.debugLineNum = 146997260;BA.debugLine="Private suffix As VMElement";
_suffix = new b4j.example.vmelement();
RDebugUtils.currentLine=146997261;
 //BA.debugLineNum = 146997261;BA.debugLine="Private prefix As VMElement";
_prefix = new b4j.example.vmelement();
RDebugUtils.currentLine=146997262;
 //BA.debugLineNum = 146997262;BA.debugLine="Private hasSuffix As Boolean";
_hassuffix = false;
RDebugUtils.currentLine=146997263;
 //BA.debugLineNum = 146997263;BA.debugLine="Private hasPrefix As Boolean";
_hasprefix = false;
RDebugUtils.currentLine=146997264;
 //BA.debugLineNum = 146997264;BA.debugLine="Private he As VMElement";
_he = new b4j.example.vmelement();
RDebugUtils.currentLine=146997265;
 //BA.debugLineNum = 146997265;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=146997266;
 //BA.debugLineNum = 146997266;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _setoninput(b4j.example.vminput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setoninput", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setoninput", null));}
String _oninput = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=147128320;
 //BA.debugLineNum = 147128320;BA.debugLine="private Sub SetOnInput As VMInput";
RDebugUtils.currentLine=147128321;
 //BA.debugLineNum = 147128321;BA.debugLine="Dim oninput As String = $\"${ID}_input\"$";
_oninput = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_input");
RDebugUtils.currentLine=147128322;
 //BA.debugLineNum = 147128322;BA.debugLine="If SubExists(module, oninput) = False Then Return";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_oninput)==__c.False) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147128323;
 //BA.debugLineNum = 147128323;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=147128324;
 //BA.debugLineNum = 147128324;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_oninput,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_e)}))));
RDebugUtils.currentLine=147128325;
 //BA.debugLineNum = 147128325;BA.debugLine="SetAttr(CreateMap(\"@input\":oninput))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("@input"),(Object)(_oninput)}));
RDebugUtils.currentLine=147128326;
 //BA.debugLineNum = 147128326;BA.debugLine="vue.SetCallBack(oninput, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_oninput,_cb);
RDebugUtils.currentLine=147128327;
 //BA.debugLineNum = 147128327;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147128328;
 //BA.debugLineNum = 147128328;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vminput __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=148373504;
 //BA.debugLineNum = 148373504;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=148373505;
 //BA.debugLineNum = 148373505;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=148373506;
 //BA.debugLineNum = 148373506;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vminput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=148045824;
 //BA.debugLineNum = 148045824;BA.debugLine="Sub Render";
RDebugUtils.currentLine=148045825;
 //BA.debugLineNum = 148045825;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=148045826;
 //BA.debugLineNum = 148045826;BA.debugLine="End Sub";
return "";
}
public b4j.example.vminput  _setaccent(b4j.example.vminput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=148307968;
 //BA.debugLineNum = 148307968;BA.debugLine="Sub SetAccent(b As Boolean) As VMInput";
RDebugUtils.currentLine=148307969;
 //BA.debugLineNum = 148307969;BA.debugLine="Input.SetAccent(True)";
__ref._input /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=148307970;
 //BA.debugLineNum = 148307970;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148307971;
 //BA.debugLineNum = 148307971;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setattr(b4j.example.vminput __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=148504576;
 //BA.debugLineNum = 148504576;BA.debugLine="Sub SetAttr(attr As Map) As VMInput";
RDebugUtils.currentLine=148504577;
 //BA.debugLineNum = 148504577;BA.debugLine="Input.SetAttr(attr)";
__ref._input /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=148504578;
 //BA.debugLineNum = 148504578;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148504579;
 //BA.debugLineNum = 148504579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setcounter(b4j.example.vminput __ref,String _varcounter) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setcounter", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setcounter", new Object[] {_varcounter}));}
RDebugUtils.currentLine=149618688;
 //BA.debugLineNum = 149618688;BA.debugLine="Sub SetCounter(varCounter As String) As VMInput";
RDebugUtils.currentLine=149618689;
 //BA.debugLineNum = 149618689;BA.debugLine="If varCounter = \"\" Then Return Me";
if ((_varcounter).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=149618690;
 //BA.debugLineNum = 149618690;BA.debugLine="SetAttr(CreateMap(\"md-counter\": varCounter))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("md-counter"),(Object)(_varcounter)}));
RDebugUtils.currentLine=149618691;
 //BA.debugLineNum = 149618691;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149618692;
 //BA.debugLineNum = 149618692;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setcounterdisabled(b4j.example.vminput __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setcounterdisabled", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setcounterdisabled", null));}
RDebugUtils.currentLine=149553152;
 //BA.debugLineNum = 149553152;BA.debugLine="Sub SetCounterDisabled As VMInput";
RDebugUtils.currentLine=149553153;
 //BA.debugLineNum = 149553153;BA.debugLine="InputInt.SetAttr(CreateMap(\":md-counter\": False))";
__ref._inputint /*b4j.example.vmfield*/ ._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-counter"),(Object)(__c.False)}));
RDebugUtils.currentLine=149553154;
 //BA.debugLineNum = 149553154;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149553155;
 //BA.debugLineNum = 149553155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _seticon1(b4j.example.vminput __ref,String _stricon) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "seticon1", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "seticon1", new Object[] {_stricon}));}
RDebugUtils.currentLine=147456000;
 //BA.debugLineNum = 147456000;BA.debugLine="Sub SetIcon1(strIcon As String) As VMInput";
RDebugUtils.currentLine=147456001;
 //BA.debugLineNum = 147456001;BA.debugLine="If strIcon = \"\" Then Return Me";
if ((_stricon).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147456002;
 //BA.debugLineNum = 147456002;BA.debugLine="icon2.SetText(strIcon)";
__ref._icon2 /*b4j.example.vmicon*/ ._settext /*b4j.example.vmicon*/ (null,_stricon);
RDebugUtils.currentLine=147456003;
 //BA.debugLineNum = 147456003;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147456004;
 //BA.debugLineNum = 147456004;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setid(b4j.example.vminput __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setid", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=149356544;
 //BA.debugLineNum = 149356544;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
RDebugUtils.currentLine=149356545;
 //BA.debugLineNum = 149356545;BA.debugLine="Input.SetID(varName, bind)";
__ref._input /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=149356546;
 //BA.debugLineNum = 149356546;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149356547;
 //BA.debugLineNum = 149356547;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setinline(b4j.example.vminput __ref,boolean _varinline) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setinline", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setinline", new Object[] {_varinline}));}
RDebugUtils.currentLine=149684224;
 //BA.debugLineNum = 149684224;BA.debugLine="Sub SetInline(varInline As Boolean) As VMInput";
RDebugUtils.currentLine=149684225;
 //BA.debugLineNum = 149684225;BA.debugLine="If varInline = True Then Return Me";
if (_varinline==__c.True) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=149684226;
 //BA.debugLineNum = 149684226;BA.debugLine="InputInt.SetAttr(CreateMap(\":md-inline\": varInlin";
__ref._inputint /*b4j.example.vmfield*/ ._setattr /*b4j.example.vmfield*/ (null,__c.createMap(new Object[] {(Object)(":md-inline"),(Object)(_varinline)}));
RDebugUtils.currentLine=149684227;
 //BA.debugLineNum = 149684227;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=149684228;
 //BA.debugLineNum = 149684228;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setpadding(b4j.example.vminput __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=148701184;
 //BA.debugLineNum = 148701184;BA.debugLine="Sub SetPadding(p As Object) As VMInput";
RDebugUtils.currentLine=148701185;
 //BA.debugLineNum = 148701185;BA.debugLine="Input.SetPaddingAll(p)";
__ref._input /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=148701186;
 //BA.debugLineNum = 148701186;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148701187;
 //BA.debugLineNum = 148701187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setprefix(b4j.example.vminput __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setprefix", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setprefix", new Object[] {_p}));}
RDebugUtils.currentLine=147259392;
 //BA.debugLineNum = 147259392;BA.debugLine="Sub SetPrefix(p As String) As VMInput";
RDebugUtils.currentLine=147259393;
 //BA.debugLineNum = 147259393;BA.debugLine="If p = \"\" Then Return Me";
if ((_p).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147259394;
 //BA.debugLineNum = 147259394;BA.debugLine="hasPrefix = True";
__ref._hasprefix /*boolean*/  = __c.True;
RDebugUtils.currentLine=147259395;
 //BA.debugLineNum = 147259395;BA.debugLine="prefix.SetText(p)";
__ref._prefix /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=147259396;
 //BA.debugLineNum = 147259396;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147259397;
 //BA.debugLineNum = 147259397;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setprimary(b4j.example.vminput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=148242432;
 //BA.debugLineNum = 148242432;BA.debugLine="Sub SetPrimary(b As Boolean) As VMInput";
RDebugUtils.currentLine=148242433;
 //BA.debugLineNum = 148242433;BA.debugLine="Input.SetPrimary(True)";
__ref._input /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=148242434;
 //BA.debugLineNum = 148242434;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148242435;
 //BA.debugLineNum = 148242435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setstyle(b4j.example.vminput __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=148570112;
 //BA.debugLineNum = 148570112;BA.debugLine="Sub SetStyle(sm As Map) As VMInput";
RDebugUtils.currentLine=148570113;
 //BA.debugLineNum = 148570113;BA.debugLine="Input.SetStyle(sm)";
__ref._input /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=148570114;
 //BA.debugLineNum = 148570114;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148570115;
 //BA.debugLineNum = 148570115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setsuffix(b4j.example.vminput __ref,String _s) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setsuffix", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setsuffix", new Object[] {_s}));}
RDebugUtils.currentLine=147324928;
 //BA.debugLineNum = 147324928;BA.debugLine="Sub SetSuffix(s As String) As VMInput";
RDebugUtils.currentLine=147324929;
 //BA.debugLineNum = 147324929;BA.debugLine="If s = \"\" Then Return Me";
if ((_s).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147324930;
 //BA.debugLineNum = 147324930;BA.debugLine="hasSuffix = True";
__ref._hassuffix /*boolean*/  = __c.True;
RDebugUtils.currentLine=147324931;
 //BA.debugLineNum = 147324931;BA.debugLine="suffix.SetText(s)";
__ref._suffix /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_s);
RDebugUtils.currentLine=147324932;
 //BA.debugLineNum = 147324932;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147324933;
 //BA.debugLineNum = 147324933;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settext(b4j.example.vminput __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=148176896;
 //BA.debugLineNum = 148176896;BA.debugLine="Sub SetText(t As String) As VMInput";
RDebugUtils.currentLine=148176897;
 //BA.debugLineNum = 148176897;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=148176898;
 //BA.debugLineNum = 148176898;BA.debugLine="Input.SetText(t)";
__ref._input /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=148176899;
 //BA.debugLineNum = 148176899;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148176900;
 //BA.debugLineNum = 148176900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _settypetext(b4j.example.vminput __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "settypetext", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "settypetext", new Object[] {_b}));}
RDebugUtils.currentLine=148832256;
 //BA.debugLineNum = 148832256;BA.debugLine="Sub SetTypeText(b As Boolean) As VMInput    'ignor";
RDebugUtils.currentLine=148832257;
 //BA.debugLineNum = 148832257;BA.debugLine="SetAttr(CreateMap(\"type\": \"text\"))";
__ref._setattr /*b4j.example.vminput*/ (null,__c.createMap(new Object[] {(Object)("type"),(Object)("text")}));
RDebugUtils.currentLine=148832258;
 //BA.debugLineNum = 148832258;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=148832259;
 //BA.debugLineNum = 148832259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vminput  _setvif(b4j.example.vminput __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vminput";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vminput) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=147914752;
 //BA.debugLineNum = 147914752;BA.debugLine="Sub SetVIf(vif As Object) As VMInput";
RDebugUtils.currentLine=147914753;
 //BA.debugLineNum = 147914753;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals((Object)(""))) { 
if (true) return (b4j.example.vminput)(this);};
RDebugUtils.currentLine=147914754;
 //BA.debugLineNum = 147914754;BA.debugLine="InputInt.SetVIf(vif)";
__ref._inputint /*b4j.example.vmfield*/ ._setvif /*b4j.example.vmfield*/ (null,_vif);
RDebugUtils.currentLine=147914755;
 //BA.debugLineNum = 147914755;BA.debugLine="Return Me";
if (true) return (b4j.example.vminput)(this);
RDebugUtils.currentLine=147914756;
 //BA.debugLineNum = 147914756;BA.debugLine="End Sub";
return null;
}
}