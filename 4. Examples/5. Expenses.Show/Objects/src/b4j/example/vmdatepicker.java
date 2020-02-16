package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmdatepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmdatepicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmdatepicker.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _datepicker = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmlabel _lbl = null;
public b4j.example.vmelement _ht = null;
public boolean _hashelp = false;
public b4j.example.vmelement _dateint = null;
public com.ab.banano.BANano _banano = null;
public boolean _haserror = false;
public b4j.example.vmelement _he = null;
public String _xmodel = "";
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmdatepicker  _initialize(b4j.example.vmdatepicker __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=102563840;
 //BA.debugLineNum = 102563840;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=102563841;
 //BA.debugLineNum = 102563841;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=102563842;
 //BA.debugLineNum = 102563842;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=102563843;
 //BA.debugLineNum = 102563843;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=102563844;
 //BA.debugLineNum = 102563844;BA.debugLine="DatePicker.Initialize(vue, ID).SetTag(\"md-datepic";
__ref._datepicker /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-datepicker");
RDebugUtils.currentLine=102563845;
 //BA.debugLineNum = 102563845;BA.debugLine="lbl.Initialize(vue,$\"${ID}lbl\"$)";
__ref._lbl /*b4j.example.vmlabel*/ ._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"lbl"));
RDebugUtils.currentLine=102563846;
 //BA.debugLineNum = 102563846;BA.debugLine="hasHelp = False";
__ref._hashelp /*boolean*/  = __c.False;
RDebugUtils.currentLine=102563847;
 //BA.debugLineNum = 102563847;BA.debugLine="hasError = False";
__ref._haserror /*boolean*/  = __c.False;
RDebugUtils.currentLine=102563848;
 //BA.debugLineNum = 102563848;BA.debugLine="DateInt.Initialize(v,$\"${sid}parent\"$).SetTag(\"di";
__ref._dateint /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,(""+__c.SmartStringFormatter("",(Object)(_sid))+"parent"))._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=102563849;
 //BA.debugLineNum = 102563849;BA.debugLine="SetOnOpened";
__ref._setonopened /*b4j.example.vmdatepicker*/ (null);
RDebugUtils.currentLine=102563850;
 //BA.debugLineNum = 102563850;BA.debugLine="SetOnClosed";
__ref._setonclosed /*b4j.example.vmdatepicker*/ (null);
RDebugUtils.currentLine=102563851;
 //BA.debugLineNum = 102563851;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=102563852;
 //BA.debugLineNum = 102563852;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setvmodel(b4j.example.vmdatepicker __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=103677952;
 //BA.debugLineNum = 103677952;BA.debugLine="Sub SetVModel(k As String) As VMDatePicker";
RDebugUtils.currentLine=103677953;
 //BA.debugLineNum = 103677953;BA.debugLine="If k = \"\" Then Return Me";
if ((_k).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=103677954;
 //BA.debugLineNum = 103677954;BA.debugLine="DatePicker.SetVModel(k)";
__ref._datepicker /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=103677955;
 //BA.debugLineNum = 103677955;BA.debugLine="xmodel = k";
__ref._xmodel /*String*/  = _k;
RDebugUtils.currentLine=103677956;
 //BA.debugLineNum = 103677956;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103677957;
 //BA.debugLineNum = 103677957;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setvshow(b4j.example.vmdatepicker __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=102957056;
 //BA.debugLineNum = 102957056;BA.debugLine="Sub SetVShow(vif As String) As VMDatePicker";
RDebugUtils.currentLine=102957057;
 //BA.debugLineNum = 102957057;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=102957058;
 //BA.debugLineNum = 102957058;BA.debugLine="DatePicker.SetVShow(vif)";
__ref._datepicker /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=102957059;
 //BA.debugLineNum = 102957059;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=102957060;
 //BA.debugLineNum = 102957060;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setdisabled(b4j.example.vmdatepicker __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=102694912;
 //BA.debugLineNum = 102694912;BA.debugLine="Sub SetDisabled(b As Boolean) As VMDatePicker";
RDebugUtils.currentLine=102694913;
 //BA.debugLineNum = 102694913;BA.debugLine="DatePicker.SetDisabled(b)";
__ref._datepicker /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=102694914;
 //BA.debugLineNum = 102694914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=102694915;
 //BA.debugLineNum = 102694915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setrequired(b4j.example.vmdatepicker __ref,boolean _varrequired) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setrequired", new Object[] {_varrequired}));}
RDebugUtils.currentLine=102629376;
 //BA.debugLineNum = 102629376;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMDateP";
RDebugUtils.currentLine=102629377;
 //BA.debugLineNum = 102629377;BA.debugLine="DatePicker.SetRequired(varRequired)";
__ref._datepicker /*b4j.example.vmelement*/ ._setrequired /*b4j.example.vmelement*/ (null,_varrequired);
RDebugUtils.currentLine=102629378;
 //BA.debugLineNum = 102629378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=102629379;
 //BA.debugLineNum = 102629379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setlabel(b4j.example.vmdatepicker __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setlabel", new Object[] {_t}));}
RDebugUtils.currentLine=103743488;
 //BA.debugLineNum = 103743488;BA.debugLine="Sub SetLabel(t As String) As VMDatePicker";
RDebugUtils.currentLine=103743489;
 //BA.debugLineNum = 103743489;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=103743490;
 //BA.debugLineNum = 103743490;BA.debugLine="lbl.SetText(t)";
__ref._lbl /*b4j.example.vmlabel*/ ._settext /*b4j.example.vmlabel*/ (null,_t);
RDebugUtils.currentLine=103743491;
 //BA.debugLineNum = 103743491;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103743492;
 //BA.debugLineNum = 103743492;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setimmediately(b4j.example.vmdatepicker __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setimmediately", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setimmediately", new Object[] {_b}));}
RDebugUtils.currentLine=103415808;
 //BA.debugLineNum = 103415808;BA.debugLine="Sub SetImmediately(b As Boolean) As VMDatePicker";
RDebugUtils.currentLine=103415809;
 //BA.debugLineNum = 103415809;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=103415810;
 //BA.debugLineNum = 103415810;BA.debugLine="DatePicker.SetAttr(CreateMap(\":md-immediately\": b";
__ref._datepicker /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-immediately"),(Object)(_b)}));
RDebugUtils.currentLine=103415811;
 //BA.debugLineNum = 103415811;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103415812;
 //BA.debugLineNum = 103415812;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setopenonfocus(b4j.example.vmdatepicker __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setopenonfocus", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setopenonfocus", new Object[] {_b}));}
RDebugUtils.currentLine=103481344;
 //BA.debugLineNum = 103481344;BA.debugLine="Sub SetOpenOnFocus(b As Boolean) As VMDatePicker";
RDebugUtils.currentLine=103481345;
 //BA.debugLineNum = 103481345;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=103481346;
 //BA.debugLineNum = 103481346;BA.debugLine="DatePicker.SetAttr(CreateMap(\":md-open-on-focus\":";
__ref._datepicker /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-open-on-focus"),(Object)(_b)}));
RDebugUtils.currentLine=103481347;
 //BA.debugLineNum = 103481347;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103481348;
 //BA.debugLineNum = 103481348;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setclearable(b4j.example.vmdatepicker __ref,boolean _varclearable) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setclearable", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setclearable", new Object[] {_varclearable}));}
RDebugUtils.currentLine=103088128;
 //BA.debugLineNum = 103088128;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMDat";
RDebugUtils.currentLine=103088129;
 //BA.debugLineNum = 103088129;BA.debugLine="If varClearable Then DatePicker.SetAttr(CreateMap";
if (_varclearable) { 
__ref._datepicker /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-clearable"),(Object)(_varclearable)}));};
RDebugUtils.currentLine=103088130;
 //BA.debugLineNum = 103088130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103088131;
 //BA.debugLineNum = 103088131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _settabindex(b4j.example.vmdatepicker __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=102891520;
 //BA.debugLineNum = 102891520;BA.debugLine="Sub SetTabIndex(ti As String) As VMDatePicker";
RDebugUtils.currentLine=102891521;
 //BA.debugLineNum = 102891521;BA.debugLine="DatePicker.SetTabIndex(ti)";
__ref._datepicker /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=102891522;
 //BA.debugLineNum = 102891522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=102891523;
 //BA.debugLineNum = 102891523;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=103874560;
 //BA.debugLineNum = 103874560;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=103874561;
 //BA.debugLineNum = 103874561;BA.debugLine="lbl.Pop(DatePicker)";
__ref._lbl /*b4j.example.vmlabel*/ ._pop /*String*/ (null,__ref._datepicker /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=103874562;
 //BA.debugLineNum = 103874562;BA.debugLine="DatePicker.Pop(DateInt)";
__ref._datepicker /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._dateint /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=103874569;
 //BA.debugLineNum = 103874569;BA.debugLine="Return DateInt.tostring";
if (true) return __ref._dateint /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=103874570;
 //BA.debugLineNum = 103874570;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatepicker  _addclass(b4j.example.vmdatepicker __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=103153664;
 //BA.debugLineNum = 103153664;BA.debugLine="Sub AddClass(c As String) As VMDatePicker";
RDebugUtils.currentLine=103153665;
 //BA.debugLineNum = 103153665;BA.debugLine="DatePicker.AddClass(c)";
__ref._datepicker /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=103153666;
 //BA.debugLineNum = 103153666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103153667;
 //BA.debugLineNum = 103153667;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmdatepicker __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=104071168;
 //BA.debugLineNum = 104071168;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=104071169;
 //BA.debugLineNum = 104071169;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=104071170;
 //BA.debugLineNum = 104071170;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
RDebugUtils.currentLine=102498304;
 //BA.debugLineNum = 102498304;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=102498305;
 //BA.debugLineNum = 102498305;BA.debugLine="Public DatePicker As VMElement";
_datepicker = new b4j.example.vmelement();
RDebugUtils.currentLine=102498306;
 //BA.debugLineNum = 102498306;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=102498307;
 //BA.debugLineNum = 102498307;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=102498308;
 //BA.debugLineNum = 102498308;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
RDebugUtils.currentLine=102498309;
 //BA.debugLineNum = 102498309;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
RDebugUtils.currentLine=102498310;
 //BA.debugLineNum = 102498310;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
RDebugUtils.currentLine=102498311;
 //BA.debugLineNum = 102498311;BA.debugLine="Private DateInt As VMElement";
_dateint = new b4j.example.vmelement();
RDebugUtils.currentLine=102498312;
 //BA.debugLineNum = 102498312;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=102498313;
 //BA.debugLineNum = 102498313;BA.debugLine="Private hasError As Boolean";
_haserror = false;
RDebugUtils.currentLine=102498314;
 //BA.debugLineNum = 102498314;BA.debugLine="Private he As VMElement";
_he = new b4j.example.vmelement();
RDebugUtils.currentLine=102498315;
 //BA.debugLineNum = 102498315;BA.debugLine="Private xmodel As String";
_xmodel = "";
RDebugUtils.currentLine=102498316;
 //BA.debugLineNum = 102498316;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=102498317;
 //BA.debugLineNum = 102498317;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatepicker  _setonopened(b4j.example.vmdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setonopened", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setonopened", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=102760448;
 //BA.debugLineNum = 102760448;BA.debugLine="private Sub SetOnOpened As VMDatePicker";
RDebugUtils.currentLine=102760449;
 //BA.debugLineNum = 102760449;BA.debugLine="Dim methodName As String  = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_opened");
RDebugUtils.currentLine=102760450;
 //BA.debugLineNum = 102760450;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=102760451;
 //BA.debugLineNum = 102760451;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=102760452;
 //BA.debugLineNum = 102760452;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=102760453;
 //BA.debugLineNum = 102760453;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
__ref._setattr /*b4j.example.vmdatepicker*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
RDebugUtils.currentLine=102760456;
 //BA.debugLineNum = 102760456;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=102760457;
 //BA.debugLineNum = 102760457;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=102760458;
 //BA.debugLineNum = 102760458;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setonclosed(b4j.example.vmdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setonclosed", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setonclosed", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=102825984;
 //BA.debugLineNum = 102825984;BA.debugLine="private Sub SetOnClosed As VMDatePicker";
RDebugUtils.currentLine=102825985;
 //BA.debugLineNum = 102825985;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_closed");
RDebugUtils.currentLine=102825986;
 //BA.debugLineNum = 102825986;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=102825987;
 //BA.debugLineNum = 102825987;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=102825988;
 //BA.debugLineNum = 102825988;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=102825989;
 //BA.debugLineNum = 102825989;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
__ref._setattr /*b4j.example.vmdatepicker*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
RDebugUtils.currentLine=102825992;
 //BA.debugLineNum = 102825992;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=102825993;
 //BA.debugLineNum = 102825993;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=102825994;
 //BA.debugLineNum = 102825994;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmdatepicker __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=104005632;
 //BA.debugLineNum = 104005632;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=104005633;
 //BA.debugLineNum = 104005633;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=104005634;
 //BA.debugLineNum = 104005634;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmdatepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=103940096;
 //BA.debugLineNum = 103940096;BA.debugLine="Sub Render";
RDebugUtils.currentLine=103940097;
 //BA.debugLineNum = 103940097;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=103940098;
 //BA.debugLineNum = 103940098;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmdatepicker  _setattr(b4j.example.vmdatepicker __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=103219200;
 //BA.debugLineNum = 103219200;BA.debugLine="Sub SetAttr(attr As Map) As VMDatePicker";
RDebugUtils.currentLine=103219201;
 //BA.debugLineNum = 103219201;BA.debugLine="DatePicker.SetAttr(attr)";
__ref._datepicker /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=103219202;
 //BA.debugLineNum = 103219202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103219203;
 //BA.debugLineNum = 103219203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setdebounce(b4j.example.vmdatepicker __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setdebounce", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setdebounce", new Object[] {_b}));}
RDebugUtils.currentLine=103612416;
 //BA.debugLineNum = 103612416;BA.debugLine="Sub SetDebounce(b As Boolean) As VMDatePicker";
RDebugUtils.currentLine=103612417;
 //BA.debugLineNum = 103612417;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=103612418;
 //BA.debugLineNum = 103612418;BA.debugLine="DatePicker.SetAttr(CreateMap(\"md-debounce\": b))";
__ref._datepicker /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("md-debounce"),(Object)(_b)}));
RDebugUtils.currentLine=103612419;
 //BA.debugLineNum = 103612419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103612420;
 //BA.debugLineNum = 103612420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _seterrortext(b4j.example.vmdatepicker __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "seterrortext", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "seterrortext", new Object[] {_t}));}
RDebugUtils.currentLine=103350272;
 //BA.debugLineNum = 103350272;BA.debugLine="Sub SetErrorText(t As String) As VMDatePicker";
RDebugUtils.currentLine=103350273;
 //BA.debugLineNum = 103350273;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=103350274;
 //BA.debugLineNum = 103350274;BA.debugLine="hasError = True";
__ref._haserror /*boolean*/  = __c.True;
RDebugUtils.currentLine=103350275;
 //BA.debugLineNum = 103350275;BA.debugLine="he = DatePicker.SetErrorText(t)";
__ref._he /*b4j.example.vmelement*/  = __ref._datepicker /*b4j.example.vmelement*/ ._seterrortext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=103350276;
 //BA.debugLineNum = 103350276;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103350277;
 //BA.debugLineNum = 103350277;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _sethelpertext(b4j.example.vmdatepicker __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "sethelpertext", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "sethelpertext", new Object[] {_t}));}
RDebugUtils.currentLine=103284736;
 //BA.debugLineNum = 103284736;BA.debugLine="Sub SetHelperText(t As String) As VMDatePicker";
RDebugUtils.currentLine=103284737;
 //BA.debugLineNum = 103284737;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=103284738;
 //BA.debugLineNum = 103284738;BA.debugLine="hasHelp = True";
__ref._hashelp /*boolean*/  = __c.True;
RDebugUtils.currentLine=103284739;
 //BA.debugLineNum = 103284739;BA.debugLine="ht = DatePicker.SetHelperText(t)";
__ref._ht /*b4j.example.vmelement*/  = __ref._datepicker /*b4j.example.vmelement*/ ._sethelpertext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=103284740;
 //BA.debugLineNum = 103284740;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103284741;
 //BA.debugLineNum = 103284741;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setname(b4j.example.vmdatepicker __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=103809024;
 //BA.debugLineNum = 103809024;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=103809025;
 //BA.debugLineNum = 103809025;BA.debugLine="DatePicker.SetName(varName, bind)";
__ref._datepicker /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=103809026;
 //BA.debugLineNum = 103809026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103809027;
 //BA.debugLineNum = 103809027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setoverridenative(b4j.example.vmdatepicker __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setoverridenative", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setoverridenative", new Object[] {_b}));}
RDebugUtils.currentLine=103546880;
 //BA.debugLineNum = 103546880;BA.debugLine="Sub SetOverrideNative(b As Boolean) As VMDatePicke";
RDebugUtils.currentLine=103546881;
 //BA.debugLineNum = 103546881;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=103546882;
 //BA.debugLineNum = 103546882;BA.debugLine="DatePicker.SetAttr(CreateMap(\":md-override-native";
__ref._datepicker /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)(":md-override-native"),(Object)(_b)}));
RDebugUtils.currentLine=103546883;
 //BA.debugLineNum = 103546883;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103546884;
 //BA.debugLineNum = 103546884;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmdatepicker  _setvif(b4j.example.vmdatepicker __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmdatepicker";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmdatepicker) Debug.delegate(ba, "setvif", new Object[] {_vshow}));}
RDebugUtils.currentLine=103022592;
 //BA.debugLineNum = 103022592;BA.debugLine="Sub SetVIf(vshow As String) As VMDatePicker";
RDebugUtils.currentLine=103022593;
 //BA.debugLineNum = 103022593;BA.debugLine="If vshow = \"\" Then Return Me";
if ((_vshow).equals("")) { 
if (true) return (b4j.example.vmdatepicker)(this);};
RDebugUtils.currentLine=103022594;
 //BA.debugLineNum = 103022594;BA.debugLine="DatePicker.SetVif(vshow)";
__ref._datepicker /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=103022595;
 //BA.debugLineNum = 103022595;BA.debugLine="Return Me";
if (true) return (b4j.example.vmdatepicker)(this);
RDebugUtils.currentLine=103022596;
 //BA.debugLineNum = 103022596;BA.debugLine="End Sub";
return null;
}
}