package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmfile extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmfile", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmfile.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _fileo = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public b4j.example.vmfield _fileint = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public boolean _haserror = false;
public b4j.example.vmelement _he = null;
public String _vmodel = "";
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmfile  _initialize(b4j.example.vmfile __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
Object _flist = null;
RDebugUtils.currentLine=123011072;
 //BA.debugLineNum = 123011072;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=123011073;
 //BA.debugLineNum = 123011073;BA.debugLine="ID = sid.tolowercase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=123011074;
 //BA.debugLineNum = 123011074;BA.debugLine="FileO.Initialize(v, ID)";
__ref._fileo /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,__ref._id /*String*/ );
RDebugUtils.currentLine=123011075;
 //BA.debugLineNum = 123011075;BA.debugLine="FileO.SetTag(\"md-file\")";
__ref._fileo /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"md-file");
RDebugUtils.currentLine=123011076;
 //BA.debugLineNum = 123011076;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=123011077;
 //BA.debugLineNum = 123011077;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=123011078;
 //BA.debugLineNum = 123011078;BA.debugLine="FileInt.Initialize(v, ID,  $\"${ID}field\"$, module";
__ref._fileint /*b4j.example.vmfield*/ ._initialize /*b4j.example.vmfield*/ (null,ba,_v,__ref._id /*String*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"field"),__ref._module /*Object*/ );
RDebugUtils.currentLine=123011079;
 //BA.debugLineNum = 123011079;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
__ref._lbl /*b4j.example.vmlabel*/ ._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"label"));
RDebugUtils.currentLine=123011080;
 //BA.debugLineNum = 123011080;BA.debugLine="hasHelp = False";
__ref._hashelp /*boolean*/  = __c.False;
RDebugUtils.currentLine=123011081;
 //BA.debugLineNum = 123011081;BA.debugLine="hasError = False";
__ref._haserror /*boolean*/  = __c.False;
RDebugUtils.currentLine=123011082;
 //BA.debugLineNum = 123011082;BA.debugLine="vmodel = \"\"";
__ref._vmodel /*String*/  = "";
RDebugUtils.currentLine=123011083;
 //BA.debugLineNum = 123011083;BA.debugLine="Dim fList As Object";
_flist = new Object();
RDebugUtils.currentLine=123011084;
 //BA.debugLineNum = 123011084;BA.debugLine="SetOnChange(fList)";
__ref._setonchange /*b4j.example.vmfile*/ (null,_flist);
RDebugUtils.currentLine=123011085;
 //BA.debugLineNum = 123011085;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123011086;
 //BA.debugLineNum = 123011086;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _seterrortext(b4j.example.vmfile __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "seterrortext", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "seterrortext", new Object[] {_t}));}
RDebugUtils.currentLine=123731968;
 //BA.debugLineNum = 123731968;BA.debugLine="Sub SetErrorText(t As String) As VMFile";
RDebugUtils.currentLine=123731969;
 //BA.debugLineNum = 123731969;BA.debugLine="hasError = True";
__ref._haserror /*boolean*/  = __c.True;
RDebugUtils.currentLine=123731970;
 //BA.debugLineNum = 123731970;BA.debugLine="he = FileO.SetErrorText(t)";
__ref._he /*b4j.example.vmelement*/  = __ref._fileo /*b4j.example.vmelement*/ ._seterrortext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=123731971;
 //BA.debugLineNum = 123731971;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123731972;
 //BA.debugLineNum = 123731972;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setlabel(b4j.example.vmfile __ref,Object _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setlabel", new Object[] {_l}));}
RDebugUtils.currentLine=123535360;
 //BA.debugLineNum = 123535360;BA.debugLine="Sub SetLabel(l As Object) As VMFile";
RDebugUtils.currentLine=123535361;
 //BA.debugLineNum = 123535361;BA.debugLine="lbl.SetText(l)";
__ref._lbl /*b4j.example.vmlabel*/ ._settext /*b4j.example.vmlabel*/ (null,BA.ObjectToString(_l));
RDebugUtils.currentLine=123535362;
 //BA.debugLineNum = 123535362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123535363;
 //BA.debugLineNum = 123535363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setvmodel(b4j.example.vmfile __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=123797504;
 //BA.debugLineNum = 123797504;BA.debugLine="Sub SetVModel(k As String) As VMFile";
RDebugUtils.currentLine=123797505;
 //BA.debugLineNum = 123797505;BA.debugLine="vmodel = k.tolowercase";
__ref._vmodel /*String*/  = _k.toLowerCase();
RDebugUtils.currentLine=123797506;
 //BA.debugLineNum = 123797506;BA.debugLine="vue.SetStateSingle(k,Null)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_k,__c.Null);
RDebugUtils.currentLine=123797507;
 //BA.debugLineNum = 123797507;BA.debugLine="FileO.SetVModel(k)";
__ref._fileo /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=123797508;
 //BA.debugLineNum = 123797508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123797509;
 //BA.debugLineNum = 123797509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setvshow(b4j.example.vmfile __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=123994112;
 //BA.debugLineNum = 123994112;BA.debugLine="Sub SetVShow(vif As Object) As VMFile";
RDebugUtils.currentLine=123994113;
 //BA.debugLineNum = 123994113;BA.debugLine="FileInt.SetVShow(vif)";
__ref._fileint /*b4j.example.vmfield*/ ._setvshow /*b4j.example.vmfield*/ (null,_vif);
RDebugUtils.currentLine=123994114;
 //BA.debugLineNum = 123994114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123994115;
 //BA.debugLineNum = 123994115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setdisabled(b4j.example.vmfile __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=124846080;
 //BA.debugLineNum = 124846080;BA.debugLine="Sub SetDisabled(b As Boolean) As VMFile";
RDebugUtils.currentLine=124846081;
 //BA.debugLineNum = 124846081;BA.debugLine="FileO.SetDisabled(b)";
__ref._fileo /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=124846082;
 //BA.debugLineNum = 124846082;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124846083;
 //BA.debugLineNum = 124846083;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setrequired(b4j.example.vmfile __ref,boolean _varrequired) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setrequired", new Object[] {_varrequired}));}
RDebugUtils.currentLine=124911616;
 //BA.debugLineNum = 124911616;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMFile";
RDebugUtils.currentLine=124911617;
 //BA.debugLineNum = 124911617;BA.debugLine="FileO.SetRequired(varRequired)";
__ref._fileo /*b4j.example.vmelement*/ ._setrequired /*b4j.example.vmelement*/ (null,_varrequired);
RDebugUtils.currentLine=124911618;
 //BA.debugLineNum = 124911618;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124911619;
 //BA.debugLineNum = 124911619;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setname(b4j.example.vmfile __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=123076608;
 //BA.debugLineNum = 123076608;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=123076609;
 //BA.debugLineNum = 123076609;BA.debugLine="FileO.SetName(varName, bind)";
__ref._fileo /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=123076610;
 //BA.debugLineNum = 123076610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123076611;
 //BA.debugLineNum = 123076611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _settabindex(b4j.example.vmfile __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=123142144;
 //BA.debugLineNum = 123142144;BA.debugLine="Sub SetTabIndex(ti As String) As VMFile";
RDebugUtils.currentLine=123142145;
 //BA.debugLineNum = 123142145;BA.debugLine="FileO.SetTabIndex(ti)";
__ref._fileo /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=123142146;
 //BA.debugLineNum = 123142146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123142147;
 //BA.debugLineNum = 123142147;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _sethelpertext(b4j.example.vmfile __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "sethelpertext", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "sethelpertext", new Object[] {_t}));}
RDebugUtils.currentLine=123666432;
 //BA.debugLineNum = 123666432;BA.debugLine="Sub SetHelperText(t As String) As VMFile";
RDebugUtils.currentLine=123666433;
 //BA.debugLineNum = 123666433;BA.debugLine="hasHelp = True";
__ref._hashelp /*boolean*/  = __c.True;
RDebugUtils.currentLine=123666434;
 //BA.debugLineNum = 123666434;BA.debugLine="ht = FileO.SetHelperText(t)";
__ref._ht /*b4j.example.vmelement*/  = __ref._fileo /*b4j.example.vmelement*/ ._sethelpertext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=123666435;
 //BA.debugLineNum = 123666435;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123666436;
 //BA.debugLineNum = 123666436;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setplaceholder(b4j.example.vmfile __ref,Object _varplaceholder) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setplaceholder", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setplaceholder", new Object[] {_varplaceholder}));}
RDebugUtils.currentLine=124780544;
 //BA.debugLineNum = 124780544;BA.debugLine="Sub SetPlaceholder(varPlaceholder As Object) As VM";
RDebugUtils.currentLine=124780545;
 //BA.debugLineNum = 124780545;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
__ref._setattr /*b4j.example.vmfile*/ (null,__c.createMap(new Object[] {(Object)("placeholder"),_varplaceholder}));
RDebugUtils.currentLine=124780546;
 //BA.debugLineNum = 124780546;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124780547;
 //BA.debugLineNum = 124780547;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmfile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=123600896;
 //BA.debugLineNum = 123600896;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=123600897;
 //BA.debugLineNum = 123600897;BA.debugLine="lbl.Pop(FileInt.Field)";
__ref._lbl /*b4j.example.vmlabel*/ ._pop /*String*/ (null,__ref._fileint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=123600898;
 //BA.debugLineNum = 123600898;BA.debugLine="FileO.Pop(FileInt.Field)";
__ref._fileo /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._fileint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=123600899;
 //BA.debugLineNum = 123600899;BA.debugLine="If hasHelp Then";
if (__ref._hashelp /*boolean*/ ) { 
RDebugUtils.currentLine=123600900;
 //BA.debugLineNum = 123600900;BA.debugLine="ht.Pop(FileInt.Field)";
__ref._ht /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._fileint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=123600902;
 //BA.debugLineNum = 123600902;BA.debugLine="If hasError Then";
if (__ref._haserror /*boolean*/ ) { 
RDebugUtils.currentLine=123600903;
 //BA.debugLineNum = 123600903;BA.debugLine="he.Pop(FileInt.Field)";
__ref._he /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._fileint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=123600905;
 //BA.debugLineNum = 123600905;BA.debugLine="Return FileInt.tostring";
if (true) return __ref._fileint /*b4j.example.vmfield*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=123600906;
 //BA.debugLineNum = 123600906;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfile  _addchild(b4j.example.vmfile __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=124125184;
 //BA.debugLineNum = 124125184;BA.debugLine="Sub AddChild(child As VMElement) As VMFile";
RDebugUtils.currentLine=124125185;
 //BA.debugLineNum = 124125185;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=124125186;
 //BA.debugLineNum = 124125186;BA.debugLine="FileO.SetText(childHTML)";
__ref._fileo /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=124125187;
 //BA.debugLineNum = 124125187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124125188;
 //BA.debugLineNum = 124125188;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmfile __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=124649472;
 //BA.debugLineNum = 124649472;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=124649473;
 //BA.debugLineNum = 124649473;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=124649474;
 //BA.debugLineNum = 124649474;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmfile*/ (null,_childx);
 }
};
RDebugUtils.currentLine=124649476;
 //BA.debugLineNum = 124649476;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfile  _addclass(b4j.example.vmfile __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=124452864;
 //BA.debugLineNum = 124452864;BA.debugLine="Sub AddClass(c As String) As VMFile";
RDebugUtils.currentLine=124452865;
 //BA.debugLineNum = 124452865;BA.debugLine="FileO.AddClass(c)";
__ref._fileo /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=124452866;
 //BA.debugLineNum = 124452866;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124452867;
 //BA.debugLineNum = 124452867;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmfile __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=125108224;
 //BA.debugLineNum = 125108224;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=125108225;
 //BA.debugLineNum = 125108225;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=125108226;
 //BA.debugLineNum = 125108226;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmfile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
RDebugUtils.currentLine=122945536;
 //BA.debugLineNum = 122945536;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=122945537;
 //BA.debugLineNum = 122945537;BA.debugLine="Public FileO As VMElement";
_fileo = new b4j.example.vmelement();
RDebugUtils.currentLine=122945538;
 //BA.debugLineNum = 122945538;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=122945539;
 //BA.debugLineNum = 122945539;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=122945540;
 //BA.debugLineNum = 122945540;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=122945541;
 //BA.debugLineNum = 122945541;BA.debugLine="Private FileInt As VMField";
_fileint = new b4j.example.vmfield();
RDebugUtils.currentLine=122945542;
 //BA.debugLineNum = 122945542;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
RDebugUtils.currentLine=122945543;
 //BA.debugLineNum = 122945543;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
RDebugUtils.currentLine=122945544;
 //BA.debugLineNum = 122945544;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
RDebugUtils.currentLine=122945545;
 //BA.debugLineNum = 122945545;BA.debugLine="Private hasError As Boolean";
_haserror = false;
RDebugUtils.currentLine=122945546;
 //BA.debugLineNum = 122945546;BA.debugLine="Private he As VMElement";
_he = new b4j.example.vmelement();
RDebugUtils.currentLine=122945547;
 //BA.debugLineNum = 122945547;BA.debugLine="Private vmodel As String";
_vmodel = "";
RDebugUtils.currentLine=122945548;
 //BA.debugLineNum = 122945548;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=122945549;
 //BA.debugLineNum = 122945549;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfile  _setonchange(b4j.example.vmfile __ref,Object _filelist) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setonchange", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setonchange", new Object[] {_filelist}));}
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=123273216;
 //BA.debugLineNum = 123273216;BA.debugLine="private Sub SetOnChange(fileList As Object) As VMF";
RDebugUtils.currentLine=123273217;
 //BA.debugLineNum = 123273217;BA.debugLine="Dim methodName As String = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_change");
RDebugUtils.currentLine=123273218;
 //BA.debugLineNum = 123273218;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmfile)(this);};
RDebugUtils.currentLine=123273219;
 //BA.debugLineNum = 123273219;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_filelist}))));
RDebugUtils.currentLine=123273220;
 //BA.debugLineNum = 123273220;BA.debugLine="SetAttr(CreateMap(\"v-on:md-change\": methodName))";
__ref._setattr /*b4j.example.vmfile*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-change"),(Object)(_methodname)}));
RDebugUtils.currentLine=123273222;
 //BA.debugLineNum = 123273222;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=123273223;
 //BA.debugLineNum = 123273223;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123273224;
 //BA.debugLineNum = 123273224;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmfile __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=124387328;
 //BA.debugLineNum = 124387328;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=124387329;
 //BA.debugLineNum = 124387329;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=124387330;
 //BA.debugLineNum = 124387330;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmfile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=124059648;
 //BA.debugLineNum = 124059648;BA.debugLine="Sub Render";
RDebugUtils.currentLine=124059649;
 //BA.debugLineNum = 124059649;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=124059650;
 //BA.debugLineNum = 124059650;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfile  _setaccent(b4j.example.vmfile __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=124321792;
 //BA.debugLineNum = 124321792;BA.debugLine="Sub SetAccent(b As Boolean) As VMFile";
RDebugUtils.currentLine=124321793;
 //BA.debugLineNum = 124321793;BA.debugLine="FileO.SetAccent(True)";
__ref._fileo /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=124321794;
 //BA.debugLineNum = 124321794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124321795;
 //BA.debugLineNum = 124321795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setaccept(b4j.example.vmfile __ref,Object _accept) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setaccept", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setaccept", new Object[] {_accept}));}
RDebugUtils.currentLine=123404288;
 //BA.debugLineNum = 123404288;BA.debugLine="Sub SetAccept(accept As Object) As VMFile";
RDebugUtils.currentLine=123404289;
 //BA.debugLineNum = 123404289;BA.debugLine="FileO.SetAttr(CreateMap(\"accept\": accept))";
__ref._fileo /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("accept"),_accept}));
RDebugUtils.currentLine=123404290;
 //BA.debugLineNum = 123404290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123404291;
 //BA.debugLineNum = 123404291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setacceptimages(b4j.example.vmfile __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setacceptimages", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setacceptimages", null));}
RDebugUtils.currentLine=123207680;
 //BA.debugLineNum = 123207680;BA.debugLine="Sub SetAcceptImages As VMFile";
RDebugUtils.currentLine=123207681;
 //BA.debugLineNum = 123207681;BA.debugLine="SetAttr(CreateMap(\"accept\":\"image/*\"))";
__ref._setattr /*b4j.example.vmfile*/ (null,__c.createMap(new Object[] {(Object)("accept"),(Object)("image/*")}));
RDebugUtils.currentLine=123207682;
 //BA.debugLineNum = 123207682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123207683;
 //BA.debugLineNum = 123207683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setattr(b4j.example.vmfile __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=124518400;
 //BA.debugLineNum = 124518400;BA.debugLine="Sub SetAttr(attr As Map) As VMFile";
RDebugUtils.currentLine=124518401;
 //BA.debugLineNum = 124518401;BA.debugLine="FileO.SetAttr(attr)";
__ref._fileo /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=124518402;
 //BA.debugLineNum = 124518402;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124518403;
 //BA.debugLineNum = 124518403;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setclearable(b4j.example.vmfile __ref,boolean _varclearable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setclearable", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setclearable", new Object[] {_varclearable}));}
RDebugUtils.currentLine=125042688;
 //BA.debugLineNum = 125042688;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMFil";
RDebugUtils.currentLine=125042689;
 //BA.debugLineNum = 125042689;BA.debugLine="FileInt.SetClearable(varClearable)";
__ref._fileint /*b4j.example.vmfield*/ ._setclearable /*b4j.example.vmfield*/ (null,_varclearable);
RDebugUtils.currentLine=125042690;
 //BA.debugLineNum = 125042690;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=125042691;
 //BA.debugLineNum = 125042691;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setinline(b4j.example.vmfile __ref,boolean _varinline) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setinline", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setinline", new Object[] {_varinline}));}
RDebugUtils.currentLine=124977152;
 //BA.debugLineNum = 124977152;BA.debugLine="Sub SetInline(varInline As Boolean) As VMFile";
RDebugUtils.currentLine=124977153;
 //BA.debugLineNum = 124977153;BA.debugLine="FileInt.SetInline(varInline)";
__ref._fileint /*b4j.example.vmfield*/ ._setinline /*b4j.example.vmfield*/ (null,_varinline);
RDebugUtils.currentLine=124977154;
 //BA.debugLineNum = 124977154;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124977155;
 //BA.debugLineNum = 124977155;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setmultiple(b4j.example.vmfile __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setmultiple", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setmultiple", new Object[] {_b}));}
RDebugUtils.currentLine=123338752;
 //BA.debugLineNum = 123338752;BA.debugLine="Sub SetMultiple(b As Boolean) As VMFile";
RDebugUtils.currentLine=123338753;
 //BA.debugLineNum = 123338753;BA.debugLine="FileO.SetAttr(CreateMap(\":multiple\": b))";
__ref._fileo /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":multiple"),(Object)(_b)}));
RDebugUtils.currentLine=123338754;
 //BA.debugLineNum = 123338754;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123338755;
 //BA.debugLineNum = 123338755;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setpadding(b4j.example.vmfile __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=124715008;
 //BA.debugLineNum = 124715008;BA.debugLine="Sub SetPadding(p As Object) As VMFile";
RDebugUtils.currentLine=124715009;
 //BA.debugLineNum = 124715009;BA.debugLine="FileO.SetPaddingAll(p)";
__ref._fileo /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=124715010;
 //BA.debugLineNum = 124715010;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124715011;
 //BA.debugLineNum = 124715011;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setprimary(b4j.example.vmfile __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=124256256;
 //BA.debugLineNum = 124256256;BA.debugLine="Sub SetPrimary(b As Boolean) As VMFile";
RDebugUtils.currentLine=124256257;
 //BA.debugLineNum = 124256257;BA.debugLine="FileO.SetPrimary(True)";
__ref._fileo /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=124256258;
 //BA.debugLineNum = 124256258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124256259;
 //BA.debugLineNum = 124256259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setreadonly(b4j.example.vmfile __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setreadonly", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setreadonly", new Object[] {_b}));}
RDebugUtils.currentLine=123469824;
 //BA.debugLineNum = 123469824;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMFile";
RDebugUtils.currentLine=123469825;
 //BA.debugLineNum = 123469825;BA.debugLine="FileO.SetAttr(CreateMap(\":readonly\": b))";
__ref._fileo /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":readonly"),(Object)(_b)}));
RDebugUtils.currentLine=123469826;
 //BA.debugLineNum = 123469826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123469827;
 //BA.debugLineNum = 123469827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setstyle(b4j.example.vmfile __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=124583936;
 //BA.debugLineNum = 124583936;BA.debugLine="Sub SetStyle(sm As Map) As VMFile";
RDebugUtils.currentLine=124583937;
 //BA.debugLineNum = 124583937;BA.debugLine="FileO.SetStyle(sm)";
__ref._fileo /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=124583938;
 //BA.debugLineNum = 124583938;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124583939;
 //BA.debugLineNum = 124583939;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _settext(b4j.example.vmfile __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=124190720;
 //BA.debugLineNum = 124190720;BA.debugLine="Sub SetText(t As Object) As VMFile";
RDebugUtils.currentLine=124190721;
 //BA.debugLineNum = 124190721;BA.debugLine="FileO.SetText(t)";
__ref._fileo /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=124190722;
 //BA.debugLineNum = 124190722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=124190723;
 //BA.debugLineNum = 124190723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setvalue(b4j.example.vmfile __ref,String _xval) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setvalue", new Object[] {_xval}));}
RDebugUtils.currentLine=123863040;
 //BA.debugLineNum = 123863040;BA.debugLine="Sub SetValue(xval As String) As VMFile";
RDebugUtils.currentLine=123863041;
 //BA.debugLineNum = 123863041;BA.debugLine="If vmodel = \"\" Then";
if ((__ref._vmodel /*String*/ ).equals("")) { 
RDebugUtils.currentLine=123863042;
 //BA.debugLineNum = 123863042;BA.debugLine="Log($\"VMFile.SetValue ${ID} - v-model has not be";
__c.Log(("VMFile.SetValue "+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+" - v-model has not been set!"));
 };
RDebugUtils.currentLine=123863044;
 //BA.debugLineNum = 123863044;BA.debugLine="vue.SetStateSingle(vmodel, xval)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._vmodel /*String*/ ,(Object)(_xval));
RDebugUtils.currentLine=123863045;
 //BA.debugLineNum = 123863045;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123863046;
 //BA.debugLineNum = 123863046;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfile  _setvif(b4j.example.vmfile __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfile";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmfile) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=123928576;
 //BA.debugLineNum = 123928576;BA.debugLine="Sub SetVIf(vif As Object) As VMFile";
RDebugUtils.currentLine=123928577;
 //BA.debugLineNum = 123928577;BA.debugLine="FileInt.SetVIf(vif)";
__ref._fileint /*b4j.example.vmfield*/ ._setvif /*b4j.example.vmfield*/ (null,_vif);
RDebugUtils.currentLine=123928578;
 //BA.debugLineNum = 123928578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfile)(this);
RDebugUtils.currentLine=123928579;
 //BA.debugLineNum = 123928579;BA.debugLine="End Sub";
return null;
}
}