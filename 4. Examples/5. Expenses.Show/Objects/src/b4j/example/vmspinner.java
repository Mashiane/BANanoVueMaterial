package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmspinner extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmspinner", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmspinner.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _spinner = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public String _bindvalue = "";
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmspinner  _initialize(b4j.example.vmspinner __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=199622656;
 //BA.debugLineNum = 199622656;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=199622657;
 //BA.debugLineNum = 199622657;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=199622658;
 //BA.debugLineNum = 199622658;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=199622659;
 //BA.debugLineNum = 199622659;BA.debugLine="Spinner.Initialize(vue, ID).SetTag(\"md-progress-s";
__ref._spinner /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-progress-spinner");
RDebugUtils.currentLine=199622660;
 //BA.debugLineNum = 199622660;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=199622661;
 //BA.debugLineNum = 199622661;BA.debugLine="bindvalue = $\"${ID}value\"$";
__ref._bindvalue /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"value");
RDebugUtils.currentLine=199622662;
 //BA.debugLineNum = 199622662;BA.debugLine="SetValue(Null)";
__ref._setvalue /*b4j.example.vmspinner*/ (null,(int)(BA.ObjectToNumber(__c.Null)));
RDebugUtils.currentLine=199622663;
 //BA.debugLineNum = 199622663;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=199622664;
 //BA.debugLineNum = 199622664;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _addclass(b4j.example.vmspinner __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=200671232;
 //BA.debugLineNum = 200671232;BA.debugLine="Sub AddClass(c As String) As VMSpinner";
RDebugUtils.currentLine=200671233;
 //BA.debugLineNum = 200671233;BA.debugLine="Spinner.AddClass(c)";
__ref._spinner /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=200671234;
 //BA.debugLineNum = 200671234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200671235;
 //BA.debugLineNum = 200671235;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmspinner __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=200998912;
 //BA.debugLineNum = 200998912;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=200998913;
 //BA.debugLineNum = 200998913;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=200998914;
 //BA.debugLineNum = 200998914;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmspinner __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=200802304;
 //BA.debugLineNum = 200802304;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=200802305;
 //BA.debugLineNum = 200802305;BA.debugLine="Return Spinner.tostring";
if (true) return __ref._spinner /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=200802306;
 //BA.debugLineNum = 200802306;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmspinner __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
RDebugUtils.currentLine=199557120;
 //BA.debugLineNum = 199557120;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=199557121;
 //BA.debugLineNum = 199557121;BA.debugLine="Public Spinner As VMElement";
_spinner = new b4j.example.vmelement();
RDebugUtils.currentLine=199557122;
 //BA.debugLineNum = 199557122;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=199557123;
 //BA.debugLineNum = 199557123;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=199557124;
 //BA.debugLineNum = 199557124;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=199557125;
 //BA.debugLineNum = 199557125;BA.debugLine="Private module As Object   'ignore";
_module = new Object();
RDebugUtils.currentLine=199557126;
 //BA.debugLineNum = 199557126;BA.debugLine="Private bindvalue As String";
_bindvalue = "";
RDebugUtils.currentLine=199557127;
 //BA.debugLineNum = 199557127;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspinner  _setvalue(b4j.example.vmspinner __ref,int _valueint) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setvalue", new Object[] {_valueint}));}
RDebugUtils.currentLine=199688192;
 //BA.debugLineNum = 199688192;BA.debugLine="Sub SetValue(valueInt As Int) As VMSpinner";
RDebugUtils.currentLine=199688193;
 //BA.debugLineNum = 199688193;BA.debugLine="Spinner.SetAttr1(\":md-value\", bindvalue)";
__ref._spinner /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":md-value",(Object)(__ref._bindvalue /*String*/ ));
RDebugUtils.currentLine=199688194;
 //BA.debugLineNum = 199688194;BA.debugLine="vue.SetStateSingle(bindvalue, valueInt)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._bindvalue /*String*/ ,(Object)(_valueint));
RDebugUtils.currentLine=199688195;
 //BA.debugLineNum = 199688195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=199688196;
 //BA.debugLineNum = 199688196;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmspinner __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=200933376;
 //BA.debugLineNum = 200933376;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=200933377;
 //BA.debugLineNum = 200933377;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=200933378;
 //BA.debugLineNum = 200933378;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmspinner __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=200867840;
 //BA.debugLineNum = 200867840;BA.debugLine="Sub Render";
RDebugUtils.currentLine=200867841;
 //BA.debugLineNum = 200867841;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=200867842;
 //BA.debugLineNum = 200867842;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmspinner  _setaccent(b4j.example.vmspinner __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=200540160;
 //BA.debugLineNum = 200540160;BA.debugLine="Sub SetAccent(b As Boolean) As VMSpinner";
RDebugUtils.currentLine=200540161;
 //BA.debugLineNum = 200540161;BA.debugLine="Spinner.SetAccent(b)";
__ref._spinner /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=200540162;
 //BA.debugLineNum = 200540162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200540163;
 //BA.debugLineNum = 200540163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setattr(b4j.example.vmspinner __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=200736768;
 //BA.debugLineNum = 200736768;BA.debugLine="Sub SetAttr(attr As Map) As VMSpinner";
RDebugUtils.currentLine=200736769;
 //BA.debugLineNum = 200736769;BA.debugLine="Spinner.SetAttr(attr)";
__ref._spinner /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=200736770;
 //BA.debugLineNum = 200736770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200736771;
 //BA.debugLineNum = 200736771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setdiameter(b4j.example.vmspinner __ref,int _bvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setdiameter", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setdiameter", new Object[] {_bvalue}));}
RDebugUtils.currentLine=200212480;
 //BA.debugLineNum = 200212480;BA.debugLine="Sub SetDiameter(bValue As Int) As VMSpinner";
RDebugUtils.currentLine=200212481;
 //BA.debugLineNum = 200212481;BA.debugLine="Spinner.SetAttr1(\":md-diameter\", bValue)";
__ref._spinner /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":md-diameter",(Object)(_bvalue));
RDebugUtils.currentLine=200212482;
 //BA.debugLineNum = 200212482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200212483;
 //BA.debugLineNum = 200212483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setmargin(b4j.example.vmspinner __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setmargin", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setmargin", new Object[] {_p}));}
RDebugUtils.currentLine=199819264;
 //BA.debugLineNum = 199819264;BA.debugLine="Sub SetMargin(p As String) As VMSpinner";
RDebugUtils.currentLine=199819265;
 //BA.debugLineNum = 199819265;BA.debugLine="Spinner.SetStyle(CreateMap(\"margin\":p))";
__ref._spinner /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("margin"),(Object)(_p)}));
RDebugUtils.currentLine=199819266;
 //BA.debugLineNum = 199819266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=199819267;
 //BA.debugLineNum = 199819267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setmode(b4j.example.vmspinner __ref,String _varmode) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setmode", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setmode", new Object[] {_varmode}));}
RDebugUtils.currentLine=199950336;
 //BA.debugLineNum = 199950336;BA.debugLine="Sub SetMode(varMode As String) As VMSpinner";
RDebugUtils.currentLine=199950337;
 //BA.debugLineNum = 199950337;BA.debugLine="Spinner.SetAttr1(\"md-mode\", varMode)";
__ref._spinner /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,"md-mode",(Object)(_varmode));
RDebugUtils.currentLine=199950338;
 //BA.debugLineNum = 199950338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=199950339;
 //BA.debugLineNum = 199950339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setmodedeterminate(b4j.example.vmspinner __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setmodedeterminate", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setmodedeterminate", new Object[] {_b}));}
RDebugUtils.currentLine=200015872;
 //BA.debugLineNum = 200015872;BA.debugLine="Sub SetModeDeterminate(b As Boolean) As VMSpinner";
RDebugUtils.currentLine=200015873;
 //BA.debugLineNum = 200015873;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmspinner)(this);};
RDebugUtils.currentLine=200015874;
 //BA.debugLineNum = 200015874;BA.debugLine="SetMode(\"determinate\")";
__ref._setmode /*b4j.example.vmspinner*/ (null,"determinate");
RDebugUtils.currentLine=200015875;
 //BA.debugLineNum = 200015875;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200015876;
 //BA.debugLineNum = 200015876;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setmodeindeterminate(b4j.example.vmspinner __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setmodeindeterminate", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setmodeindeterminate", new Object[] {_b}));}
RDebugUtils.currentLine=200081408;
 //BA.debugLineNum = 200081408;BA.debugLine="Sub SetModeInDeterminate(b As Boolean) As VMSpinne";
RDebugUtils.currentLine=200081409;
 //BA.debugLineNum = 200081409;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmspinner)(this);};
RDebugUtils.currentLine=200081410;
 //BA.debugLineNum = 200081410;BA.debugLine="SetMode(\"indeterminate\")";
__ref._setmode /*b4j.example.vmspinner*/ (null,"indeterminate");
RDebugUtils.currentLine=200081411;
 //BA.debugLineNum = 200081411;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200081412;
 //BA.debugLineNum = 200081412;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setname(b4j.example.vmspinner __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=200605696;
 //BA.debugLineNum = 200605696;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=200605697;
 //BA.debugLineNum = 200605697;BA.debugLine="Spinner.SetName(varName, bind)";
__ref._spinner /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=200605698;
 //BA.debugLineNum = 200605698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200605699;
 //BA.debugLineNum = 200605699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setpadding(b4j.example.vmspinner __ref,String _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=199884800;
 //BA.debugLineNum = 199884800;BA.debugLine="Sub SetPadding(p As String) As VMSpinner";
RDebugUtils.currentLine=199884801;
 //BA.debugLineNum = 199884801;BA.debugLine="Spinner.SetStyle(CreateMap(\"padding\":p))";
__ref._spinner /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("padding"),(Object)(_p)}));
RDebugUtils.currentLine=199884802;
 //BA.debugLineNum = 199884802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=199884803;
 //BA.debugLineNum = 199884803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setprimary(b4j.example.vmspinner __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=200474624;
 //BA.debugLineNum = 200474624;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSpinner";
RDebugUtils.currentLine=200474625;
 //BA.debugLineNum = 200474625;BA.debugLine="Spinner.SetPrimary(b)";
__ref._spinner /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=200474626;
 //BA.debugLineNum = 200474626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200474627;
 //BA.debugLineNum = 200474627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setstroke(b4j.example.vmspinner __ref,int _bvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setstroke", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setstroke", new Object[] {_bvalue}));}
RDebugUtils.currentLine=200146944;
 //BA.debugLineNum = 200146944;BA.debugLine="Sub SetStroke(bValue As Int) As VMSpinner";
RDebugUtils.currentLine=200146945;
 //BA.debugLineNum = 200146945;BA.debugLine="Spinner.SetAttr1(\":md-stroke\", bValue)";
__ref._spinner /*b4j.example.vmelement*/ ._setattr1 /*b4j.example.vmelement*/ (null,":md-stroke",(Object)(_bvalue));
RDebugUtils.currentLine=200146946;
 //BA.debugLineNum = 200146946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200146947;
 //BA.debugLineNum = 200146947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setstyle(b4j.example.vmspinner __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=199753728;
 //BA.debugLineNum = 199753728;BA.debugLine="Sub SetStyle(m As Map) As VMSpinner";
RDebugUtils.currentLine=199753729;
 //BA.debugLineNum = 199753729;BA.debugLine="Spinner.SetStyle(m)";
__ref._spinner /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=199753730;
 //BA.debugLineNum = 199753730;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=199753731;
 //BA.debugLineNum = 199753731;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _settabindex(b4j.example.vmspinner __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=200278016;
 //BA.debugLineNum = 200278016;BA.debugLine="Sub SetTabIndex(ti As String) As VMSpinner";
RDebugUtils.currentLine=200278017;
 //BA.debugLineNum = 200278017;BA.debugLine="Spinner.SetTabIndex(ti)";
__ref._spinner /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=200278018;
 //BA.debugLineNum = 200278018;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200278019;
 //BA.debugLineNum = 200278019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setvif(b4j.example.vmspinner __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setvif", new Object[] {_vshow}));}
RDebugUtils.currentLine=200409088;
 //BA.debugLineNum = 200409088;BA.debugLine="Sub SetVIf(vshow As String) As VMSpinner";
RDebugUtils.currentLine=200409089;
 //BA.debugLineNum = 200409089;BA.debugLine="Spinner.SetVif(vshow)";
__ref._spinner /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=200409090;
 //BA.debugLineNum = 200409090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200409091;
 //BA.debugLineNum = 200409091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmspinner  _setvshow(b4j.example.vmspinner __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmspinner";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmspinner) Debug.delegate(ba, "setvshow", new Object[] {_vshow}));}
RDebugUtils.currentLine=200343552;
 //BA.debugLineNum = 200343552;BA.debugLine="Sub SetVShow(vshow As String) As VMSpinner";
RDebugUtils.currentLine=200343553;
 //BA.debugLineNum = 200343553;BA.debugLine="Spinner.SetVShow(vshow)";
__ref._spinner /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=200343554;
 //BA.debugLineNum = 200343554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmspinner)(this);
RDebugUtils.currentLine=200343555;
 //BA.debugLineNum = 200343555;BA.debugLine="End Sub";
return null;
}
}