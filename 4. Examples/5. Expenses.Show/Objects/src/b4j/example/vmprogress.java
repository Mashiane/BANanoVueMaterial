package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmprogress extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmprogress", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmprogress.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _progress = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public String _bindvalue = "";
public String _buffervalue = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmprogress  _initialize(b4j.example.vmprogress __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=180551680;
 //BA.debugLineNum = 180551680;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=180551681;
 //BA.debugLineNum = 180551681;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=180551682;
 //BA.debugLineNum = 180551682;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=180551683;
 //BA.debugLineNum = 180551683;BA.debugLine="Progress.Initialize(vue, ID).SetTag(\"md-progress-";
__ref._progress /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-progress-bar");
RDebugUtils.currentLine=180551684;
 //BA.debugLineNum = 180551684;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=180551685;
 //BA.debugLineNum = 180551685;BA.debugLine="bindvalue = $\"${ID}value\"$";
__ref._bindvalue /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"value");
RDebugUtils.currentLine=180551686;
 //BA.debugLineNum = 180551686;BA.debugLine="buffervalue = $\"${ID}buffer\"$";
__ref._buffervalue /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"buffer");
RDebugUtils.currentLine=180551687;
 //BA.debugLineNum = 180551687;BA.debugLine="SetValue(Null)";
__ref._setvalue /*b4j.example.vmprogress*/ (null,(int)(BA.ObjectToNumber(__c.Null)));
RDebugUtils.currentLine=180551688;
 //BA.debugLineNum = 180551688;BA.debugLine="SetBuffer(Null)";
__ref._setbuffer /*b4j.example.vmprogress*/ (null,(int)(BA.ObjectToNumber(__c.Null)));
RDebugUtils.currentLine=180551689;
 //BA.debugLineNum = 180551689;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=180551690;
 //BA.debugLineNum = 180551690;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _addclass(b4j.example.vmprogress __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=181731328;
 //BA.debugLineNum = 181731328;BA.debugLine="Sub AddClass(c As String) As VMProgress";
RDebugUtils.currentLine=181731329;
 //BA.debugLineNum = 181731329;BA.debugLine="Progress.AddClass(c)";
__ref._progress /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=181731330;
 //BA.debugLineNum = 181731330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181731331;
 //BA.debugLineNum = 181731331;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmprogress __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=182059008;
 //BA.debugLineNum = 182059008;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=182059009;
 //BA.debugLineNum = 182059009;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=182059010;
 //BA.debugLineNum = 182059010;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmprogress __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=181862400;
 //BA.debugLineNum = 181862400;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=181862401;
 //BA.debugLineNum = 181862401;BA.debugLine="Return Progress.tostring";
if (true) return __ref._progress /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=181862402;
 //BA.debugLineNum = 181862402;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmprogress __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
RDebugUtils.currentLine=180486144;
 //BA.debugLineNum = 180486144;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=180486145;
 //BA.debugLineNum = 180486145;BA.debugLine="Public Progress As VMElement";
_progress = new b4j.example.vmelement();
RDebugUtils.currentLine=180486146;
 //BA.debugLineNum = 180486146;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=180486147;
 //BA.debugLineNum = 180486147;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=180486148;
 //BA.debugLineNum = 180486148;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=180486149;
 //BA.debugLineNum = 180486149;BA.debugLine="Private module As Object   'ignore";
_module = new Object();
RDebugUtils.currentLine=180486150;
 //BA.debugLineNum = 180486150;BA.debugLine="Private bindvalue As String";
_bindvalue = "";
RDebugUtils.currentLine=180486151;
 //BA.debugLineNum = 180486151;BA.debugLine="Private buffervalue As String";
_buffervalue = "";
RDebugUtils.currentLine=180486152;
 //BA.debugLineNum = 180486152;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogress  _setvalue(b4j.example.vmprogress __ref,int _valueint) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setvalue", new Object[] {_valueint}));}
RDebugUtils.currentLine=181600256;
 //BA.debugLineNum = 181600256;BA.debugLine="Sub SetValue(valueInt As Int) As VMProgress";
RDebugUtils.currentLine=181600257;
 //BA.debugLineNum = 181600257;BA.debugLine="Progress.SetAttr1(\":md-value\", bindvalue)";
__ref._progress /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":md-value",(Object)(__ref._bindvalue /*String*/ ));
RDebugUtils.currentLine=181600258;
 //BA.debugLineNum = 181600258;BA.debugLine="vue.SetStateSingle(bindvalue, valueInt)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._bindvalue /*String*/ ,(Object)(_valueint));
RDebugUtils.currentLine=181600259;
 //BA.debugLineNum = 181600259;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181600260;
 //BA.debugLineNum = 181600260;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setbuffer(b4j.example.vmprogress __ref,int _bvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setbuffer", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setbuffer", new Object[] {_bvalue}));}
RDebugUtils.currentLine=181141504;
 //BA.debugLineNum = 181141504;BA.debugLine="Sub SetBuffer(bValue As Int) As VMProgress";
RDebugUtils.currentLine=181141505;
 //BA.debugLineNum = 181141505;BA.debugLine="vue.SetStateSingle(buffervalue, bValue)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._buffervalue /*String*/ ,(Object)(_bvalue));
RDebugUtils.currentLine=181141506;
 //BA.debugLineNum = 181141506;BA.debugLine="Progress.SetAttr1(\":md-buffer\", buffervalue)";
__ref._progress /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":md-buffer",(Object)(__ref._buffervalue /*String*/ ));
RDebugUtils.currentLine=181141507;
 //BA.debugLineNum = 181141507;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181141508;
 //BA.debugLineNum = 181141508;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmprogress __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=181993472;
 //BA.debugLineNum = 181993472;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=181993473;
 //BA.debugLineNum = 181993473;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=181993474;
 //BA.debugLineNum = 181993474;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmprogress __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=181927936;
 //BA.debugLineNum = 181927936;BA.debugLine="Sub Render";
RDebugUtils.currentLine=181927937;
 //BA.debugLineNum = 181927937;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=181927938;
 //BA.debugLineNum = 181927938;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmprogress  _setaccent(b4j.example.vmprogress __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=181469184;
 //BA.debugLineNum = 181469184;BA.debugLine="Sub SetAccent(b As Boolean) As VMProgress";
RDebugUtils.currentLine=181469185;
 //BA.debugLineNum = 181469185;BA.debugLine="Progress.SetAccent(b)";
__ref._progress /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=181469186;
 //BA.debugLineNum = 181469186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181469187;
 //BA.debugLineNum = 181469187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setattr(b4j.example.vmprogress __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=181796864;
 //BA.debugLineNum = 181796864;BA.debugLine="Sub SetAttr(attr As Map) As VMProgress";
RDebugUtils.currentLine=181796865;
 //BA.debugLineNum = 181796865;BA.debugLine="Progress.SetAttr(attr)";
__ref._progress /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=181796866;
 //BA.debugLineNum = 181796866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181796867;
 //BA.debugLineNum = 181796867;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setdisabled(b4j.example.vmprogress __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=181665792;
 //BA.debugLineNum = 181665792;BA.debugLine="Sub SetDisabled(b As Boolean) As VMProgress";
RDebugUtils.currentLine=181665793;
 //BA.debugLineNum = 181665793;BA.debugLine="Progress.SetDisabled(b)";
__ref._progress /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=181665794;
 //BA.debugLineNum = 181665794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181665795;
 //BA.debugLineNum = 181665795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmargin(b4j.example.vmprogress __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setmargin", new Object[] {_p}));}
RDebugUtils.currentLine=180682752;
 //BA.debugLineNum = 180682752;BA.debugLine="Sub SetMargin(p As String) As VMProgress";
RDebugUtils.currentLine=180682753;
 //BA.debugLineNum = 180682753;BA.debugLine="Progress.SetStyle(CreateMap(\"margin\":p))";
__ref._progress /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("margin"),(Object)(_p)}));
RDebugUtils.currentLine=180682754;
 //BA.debugLineNum = 180682754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=180682755;
 //BA.debugLineNum = 180682755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmode(b4j.example.vmprogress __ref,String _varmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setmode", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setmode", new Object[] {_varmode}));}
RDebugUtils.currentLine=180813824;
 //BA.debugLineNum = 180813824;BA.debugLine="Sub SetMode(varMode As String) As VMProgress";
RDebugUtils.currentLine=180813825;
 //BA.debugLineNum = 180813825;BA.debugLine="Progress.SetAttr1(\"md-mode\", varMode)";
__ref._progress /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"md-mode",(Object)(_varmode));
RDebugUtils.currentLine=180813826;
 //BA.debugLineNum = 180813826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=180813827;
 //BA.debugLineNum = 180813827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmodebuffer(b4j.example.vmprogress __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setmodebuffer", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setmodebuffer", new Object[] {_b}));}
RDebugUtils.currentLine=181075968;
 //BA.debugLineNum = 181075968;BA.debugLine="Sub SetModeBuffer(b As Boolean) As VMProgress";
RDebugUtils.currentLine=181075969;
 //BA.debugLineNum = 181075969;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmprogress)(this);};
RDebugUtils.currentLine=181075970;
 //BA.debugLineNum = 181075970;BA.debugLine="SetMode(\"buffer\")";
__ref._setmode /*b4j.example.vmprogress*/ (null,"buffer");
RDebugUtils.currentLine=181075971;
 //BA.debugLineNum = 181075971;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181075972;
 //BA.debugLineNum = 181075972;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmodedeterminate(b4j.example.vmprogress __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setmodedeterminate", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setmodedeterminate", new Object[] {_b}));}
RDebugUtils.currentLine=180879360;
 //BA.debugLineNum = 180879360;BA.debugLine="Sub SetModeDeterminate(b As Boolean) As VMProgress";
RDebugUtils.currentLine=180879361;
 //BA.debugLineNum = 180879361;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmprogress)(this);};
RDebugUtils.currentLine=180879362;
 //BA.debugLineNum = 180879362;BA.debugLine="SetMode(\"determinate\")";
__ref._setmode /*b4j.example.vmprogress*/ (null,"determinate");
RDebugUtils.currentLine=180879363;
 //BA.debugLineNum = 180879363;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=180879364;
 //BA.debugLineNum = 180879364;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmodeindeterminate(b4j.example.vmprogress __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setmodeindeterminate", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setmodeindeterminate", new Object[] {_b}));}
RDebugUtils.currentLine=180944896;
 //BA.debugLineNum = 180944896;BA.debugLine="Sub SetModeInDeterminate(b As Boolean) As VMProgre";
RDebugUtils.currentLine=180944897;
 //BA.debugLineNum = 180944897;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmprogress)(this);};
RDebugUtils.currentLine=180944898;
 //BA.debugLineNum = 180944898;BA.debugLine="SetMode(\"indeterminate\")";
__ref._setmode /*b4j.example.vmprogress*/ (null,"indeterminate");
RDebugUtils.currentLine=180944899;
 //BA.debugLineNum = 180944899;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=180944900;
 //BA.debugLineNum = 180944900;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setmodequery(b4j.example.vmprogress __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setmodequery", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setmodequery", new Object[] {_b}));}
RDebugUtils.currentLine=181010432;
 //BA.debugLineNum = 181010432;BA.debugLine="Sub SetModeQuery(b As Boolean) As VMProgress";
RDebugUtils.currentLine=181010433;
 //BA.debugLineNum = 181010433;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmprogress)(this);};
RDebugUtils.currentLine=181010434;
 //BA.debugLineNum = 181010434;BA.debugLine="SetMode(\"query\")";
__ref._setmode /*b4j.example.vmprogress*/ (null,"query");
RDebugUtils.currentLine=181010435;
 //BA.debugLineNum = 181010435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181010436;
 //BA.debugLineNum = 181010436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setname(b4j.example.vmprogress __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=181534720;
 //BA.debugLineNum = 181534720;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=181534721;
 //BA.debugLineNum = 181534721;BA.debugLine="Progress.SetName(varName, bind)";
__ref._progress /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=181534722;
 //BA.debugLineNum = 181534722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181534723;
 //BA.debugLineNum = 181534723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setpadding(b4j.example.vmprogress __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=180748288;
 //BA.debugLineNum = 180748288;BA.debugLine="Sub SetPadding(p As String) As VMProgress";
RDebugUtils.currentLine=180748289;
 //BA.debugLineNum = 180748289;BA.debugLine="Progress.SetStyle(CreateMap(\"padding\":p))";
__ref._progress /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("padding"),(Object)(_p)}));
RDebugUtils.currentLine=180748290;
 //BA.debugLineNum = 180748290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=180748291;
 //BA.debugLineNum = 180748291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setprimary(b4j.example.vmprogress __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=181403648;
 //BA.debugLineNum = 181403648;BA.debugLine="Sub SetPrimary(b As Boolean) As VMProgress";
RDebugUtils.currentLine=181403649;
 //BA.debugLineNum = 181403649;BA.debugLine="Progress.SetPrimary(b)";
__ref._progress /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=181403650;
 //BA.debugLineNum = 181403650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181403651;
 //BA.debugLineNum = 181403651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setstyle(b4j.example.vmprogress __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=180617216;
 //BA.debugLineNum = 180617216;BA.debugLine="Sub SetStyle(m As Map) As VMProgress";
RDebugUtils.currentLine=180617217;
 //BA.debugLineNum = 180617217;BA.debugLine="Progress.SetStyle(m)";
__ref._progress /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=180617218;
 //BA.debugLineNum = 180617218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=180617219;
 //BA.debugLineNum = 180617219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _settabindex(b4j.example.vmprogress __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=181207040;
 //BA.debugLineNum = 181207040;BA.debugLine="Sub SetTabIndex(ti As String) As VMProgress";
RDebugUtils.currentLine=181207041;
 //BA.debugLineNum = 181207041;BA.debugLine="Progress.SetTabIndex(ti)";
__ref._progress /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=181207042;
 //BA.debugLineNum = 181207042;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181207043;
 //BA.debugLineNum = 181207043;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setvif(b4j.example.vmprogress __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setvif", new Object[] {_vshow}));}
RDebugUtils.currentLine=181338112;
 //BA.debugLineNum = 181338112;BA.debugLine="Sub SetVIf(vshow As String) As VMProgress";
RDebugUtils.currentLine=181338113;
 //BA.debugLineNum = 181338113;BA.debugLine="Progress.SetVif(vshow)";
__ref._progress /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=181338114;
 //BA.debugLineNum = 181338114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181338115;
 //BA.debugLineNum = 181338115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmprogress  _setvshow(b4j.example.vmprogress __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmprogress";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmprogress) Debug.delegate(ba, "setvshow", new Object[] {_vshow}));}
RDebugUtils.currentLine=181272576;
 //BA.debugLineNum = 181272576;BA.debugLine="Sub SetVShow(vshow As String) As VMProgress";
RDebugUtils.currentLine=181272577;
 //BA.debugLineNum = 181272577;BA.debugLine="Progress.SetVShow(vshow)";
__ref._progress /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=181272578;
 //BA.debugLineNum = 181272578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmprogress)(this);
RDebugUtils.currentLine=181272579;
 //BA.debugLineNum = 181272579;BA.debugLine="End Sub";
return null;
}
}