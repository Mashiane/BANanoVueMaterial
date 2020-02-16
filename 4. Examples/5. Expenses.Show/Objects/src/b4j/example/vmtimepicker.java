package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmtimepicker extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmtimepicker", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmtimepicker.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _timepicker = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmfield _timepickerint = null;
public b4j.example.vmlabel _lbl = null;
public boolean _hashelp = false;
public b4j.example.vmelement _ht = null;
public b4j.example.vmelement _et = null;
public com.ab.banano.BANano _banano = null;
public boolean _haserror = false;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmtimepicker  _initialize(b4j.example.vmtimepicker __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
String _sval = "";
RDebugUtils.currentLine=216858624;
 //BA.debugLineNum = 216858624;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=216858625;
 //BA.debugLineNum = 216858625;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=216858626;
 //BA.debugLineNum = 216858626;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=216858627;
 //BA.debugLineNum = 216858627;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=216858628;
 //BA.debugLineNum = 216858628;BA.debugLine="TimePicker.Initialize(vue, ID).SetTag(\"md-select\"";
__ref._timepicker /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"md-select");
RDebugUtils.currentLine=216858629;
 //BA.debugLineNum = 216858629;BA.debugLine="TimePickerInt.Initialize(v,ID,$\"${ID}field\"$,modu";
__ref._timepickerint /*b4j.example.vmfield*/ ._initialize /*b4j.example.vmfield*/ (null,ba,_v,__ref._id /*String*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"field"),__ref._module /*Object*/ );
RDebugUtils.currentLine=216858630;
 //BA.debugLineNum = 216858630;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
__ref._lbl /*b4j.example.vmlabel*/ ._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"label"));
RDebugUtils.currentLine=216858631;
 //BA.debugLineNum = 216858631;BA.debugLine="hasHelp = False";
__ref._hashelp /*boolean*/  = __c.False;
RDebugUtils.currentLine=216858632;
 //BA.debugLineNum = 216858632;BA.debugLine="hasError = False";
__ref._haserror /*boolean*/  = __c.False;
RDebugUtils.currentLine=216858633;
 //BA.debugLineNum = 216858633;BA.debugLine="SetTimes";
__ref._settimes /*String*/ (null);
RDebugUtils.currentLine=216858634;
 //BA.debugLineNum = 216858634;BA.debugLine="Dim sval As String";
_sval = "";
RDebugUtils.currentLine=216858635;
 //BA.debugLineNum = 216858635;BA.debugLine="SetOnSelected(sval)";
__ref._setonselected /*b4j.example.vmtimepicker*/ (null,_sval);
RDebugUtils.currentLine=216858636;
 //BA.debugLineNum = 216858636;BA.debugLine="SetOnOpened";
__ref._setonopened /*b4j.example.vmtimepicker*/ (null);
RDebugUtils.currentLine=216858637;
 //BA.debugLineNum = 216858637;BA.debugLine="SetOnClosed";
__ref._setonclosed /*b4j.example.vmtimepicker*/ (null);
RDebugUtils.currentLine=216858638;
 //BA.debugLineNum = 216858638;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=216858639;
 //BA.debugLineNum = 216858639;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setlabel(b4j.example.vmtimepicker __ref,Object _l) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setlabel", new Object[] {_l}));}
RDebugUtils.currentLine=217251840;
 //BA.debugLineNum = 217251840;BA.debugLine="Sub SetLabel(l As Object) As VMTimePicker";
RDebugUtils.currentLine=217251841;
 //BA.debugLineNum = 217251841;BA.debugLine="lbl.SetText(l)";
__ref._lbl /*b4j.example.vmlabel*/ ._settext /*b4j.example.vmlabel*/ (null,BA.ObjectToString(_l));
RDebugUtils.currentLine=217251842;
 //BA.debugLineNum = 217251842;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217251843;
 //BA.debugLineNum = 217251843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setvmodel(b4j.example.vmtimepicker __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=217186304;
 //BA.debugLineNum = 217186304;BA.debugLine="Sub SetVModel(k As String) As VMTimePicker";
RDebugUtils.currentLine=217186305;
 //BA.debugLineNum = 217186305;BA.debugLine="TimePicker.SetVModel(k)";
__ref._timepicker /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=217186306;
 //BA.debugLineNum = 217186306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217186307;
 //BA.debugLineNum = 217186307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setvshow(b4j.example.vmtimepicker __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=217776128;
 //BA.debugLineNum = 217776128;BA.debugLine="Sub SetVShow(vif As String) As VMTimePicker";
RDebugUtils.currentLine=217776129;
 //BA.debugLineNum = 217776129;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=217776130;
 //BA.debugLineNum = 217776130;BA.debugLine="TimePickerInt.SetVShow(vif)";
__ref._timepickerint /*b4j.example.vmfield*/ ._setvshow /*b4j.example.vmfield*/ (null,(Object)(_vif));
RDebugUtils.currentLine=217776131;
 //BA.debugLineNum = 217776131;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217776132;
 //BA.debugLineNum = 217776132;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setdisabled(b4j.example.vmtimepicker __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=218562560;
 //BA.debugLineNum = 218562560;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTimePicker";
RDebugUtils.currentLine=218562561;
 //BA.debugLineNum = 218562561;BA.debugLine="TimePicker.setdisabled(b)";
__ref._timepicker /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=218562562;
 //BA.debugLineNum = 218562562;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218562563;
 //BA.debugLineNum = 218562563;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setrequired(b4j.example.vmtimepicker __ref,boolean _varrequired) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setrequired", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setrequired", new Object[] {_varrequired}));}
RDebugUtils.currentLine=218365952;
 //BA.debugLineNum = 218365952;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMTimeP";
RDebugUtils.currentLine=218365953;
 //BA.debugLineNum = 218365953;BA.debugLine="TimePicker.SetRequired(varRequired)";
__ref._timepicker /*b4j.example.vmelement*/ ._setrequired /*b4j.example.vmelement*/ (null,_varrequired);
RDebugUtils.currentLine=218365954;
 //BA.debugLineNum = 218365954;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218365955;
 //BA.debugLineNum = 218365955;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setname(b4j.example.vmtimepicker __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=218431488;
 //BA.debugLineNum = 218431488;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=218431489;
 //BA.debugLineNum = 218431489;BA.debugLine="TimePicker.SetName(varName, bind)";
__ref._timepicker /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=218431490;
 //BA.debugLineNum = 218431490;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218431491;
 //BA.debugLineNum = 218431491;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _settabindex(b4j.example.vmtimepicker __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=216989696;
 //BA.debugLineNum = 216989696;BA.debugLine="Sub SetTabIndex(ti As String) As VMTimePicker";
RDebugUtils.currentLine=216989697;
 //BA.debugLineNum = 216989697;BA.debugLine="TimePicker.SetTabIndex(ti)";
__ref._timepicker /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=216989698;
 //BA.debugLineNum = 216989698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=216989699;
 //BA.debugLineNum = 216989699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setplaceholder(b4j.example.vmtimepicker __ref,String _varplaceholder) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setplaceholder", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setplaceholder", new Object[] {_varplaceholder}));}
RDebugUtils.currentLine=218300416;
 //BA.debugLineNum = 218300416;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
RDebugUtils.currentLine=218300417;
 //BA.debugLineNum = 218300417;BA.debugLine="If varPlaceholder = \"\" Then Return Me";
if ((_varplaceholder).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=218300418;
 //BA.debugLineNum = 218300418;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
__ref._setattr /*b4j.example.vmtimepicker*/ (null,__c.createMap(new Object[] {(Object)("placeholder"),(Object)(_varplaceholder)}));
RDebugUtils.currentLine=218300419;
 //BA.debugLineNum = 218300419;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218300420;
 //BA.debugLineNum = 218300420;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _sethelpertext(b4j.example.vmtimepicker __ref,String _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "sethelpertext", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "sethelpertext", new Object[] {_t}));}
RDebugUtils.currentLine=217382912;
 //BA.debugLineNum = 217382912;BA.debugLine="Sub SetHelperText(t As String) As VMTimePicker";
RDebugUtils.currentLine=217382913;
 //BA.debugLineNum = 217382913;BA.debugLine="If t = \"\" Then Return Me";
if ((_t).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=217382914;
 //BA.debugLineNum = 217382914;BA.debugLine="hasHelp = True";
__ref._hashelp /*boolean*/  = __c.True;
RDebugUtils.currentLine=217382915;
 //BA.debugLineNum = 217382915;BA.debugLine="ht = TimePicker.SetHelperText(t)";
__ref._ht /*b4j.example.vmelement*/  = __ref._timepicker /*b4j.example.vmelement*/ ._sethelpertext /*b4j.example.vmelement*/ (null,_t);
RDebugUtils.currentLine=217382916;
 //BA.debugLineNum = 217382916;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217382917;
 //BA.debugLineNum = 217382917;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _seterrortext(b4j.example.vmtimepicker __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "seterrortext", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "seterrortext", new Object[] {_txt}));}
RDebugUtils.currentLine=217448448;
 //BA.debugLineNum = 217448448;BA.debugLine="Sub SetErrorText(txt As String) As VMTimePicker";
RDebugUtils.currentLine=217448449;
 //BA.debugLineNum = 217448449;BA.debugLine="If txt = \"\" Then Return Me";
if ((_txt).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=217448450;
 //BA.debugLineNum = 217448450;BA.debugLine="hasError = True";
__ref._haserror /*boolean*/  = __c.True;
RDebugUtils.currentLine=217448451;
 //BA.debugLineNum = 217448451;BA.debugLine="et = TimePicker.SetErrorText(txt)";
__ref._et /*b4j.example.vmelement*/  = __ref._timepicker /*b4j.example.vmelement*/ ._seterrortext /*b4j.example.vmelement*/ (null,_txt);
RDebugUtils.currentLine=217448452;
 //BA.debugLineNum = 217448452;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217448453;
 //BA.debugLineNum = 217448453;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmtimepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=217513984;
 //BA.debugLineNum = 217513984;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=217513985;
 //BA.debugLineNum = 217513985;BA.debugLine="lbl.Pop(TimePickerInt.Field)";
__ref._lbl /*b4j.example.vmlabel*/ ._pop /*String*/ (null,__ref._timepickerint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=217513986;
 //BA.debugLineNum = 217513986;BA.debugLine="TimePicker.Pop(TimePickerInt.Field)";
__ref._timepicker /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._timepickerint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=217513987;
 //BA.debugLineNum = 217513987;BA.debugLine="If hasHelp Then";
if (__ref._hashelp /*boolean*/ ) { 
RDebugUtils.currentLine=217513988;
 //BA.debugLineNum = 217513988;BA.debugLine="ht.Pop(TimePickerInt.Field)";
__ref._ht /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._timepickerint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=217513990;
 //BA.debugLineNum = 217513990;BA.debugLine="If hasError Then";
if (__ref._haserror /*boolean*/ ) { 
RDebugUtils.currentLine=217513991;
 //BA.debugLineNum = 217513991;BA.debugLine="et.Pop(TimePickerInt.Field)";
__ref._et /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._timepickerint /*b4j.example.vmfield*/ ._field /*b4j.example.vmelement*/ );
 };
RDebugUtils.currentLine=217513993;
 //BA.debugLineNum = 217513993;BA.debugLine="Return TimePickerInt.tostring";
if (true) return __ref._timepickerint /*b4j.example.vmfield*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=217513994;
 //BA.debugLineNum = 217513994;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _addchild(b4j.example.vmtimepicker __ref,b4j.example.vmelement _child) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "addchild", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "addchild", new Object[] {_child}));}
String _childhtml = "";
RDebugUtils.currentLine=217841664;
 //BA.debugLineNum = 217841664;BA.debugLine="Sub AddChild(child As VMElement) As VMTimePicker";
RDebugUtils.currentLine=217841665;
 //BA.debugLineNum = 217841665;BA.debugLine="Dim childHTML As String = child.ToString";
_childhtml = _child._tostring /*String*/ (null);
RDebugUtils.currentLine=217841666;
 //BA.debugLineNum = 217841666;BA.debugLine="TimePicker.SetText(childHTML)";
__ref._timepicker /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,_childhtml);
RDebugUtils.currentLine=217841667;
 //BA.debugLineNum = 217841667;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217841668;
 //BA.debugLineNum = 217841668;BA.debugLine="End Sub";
return null;
}
public String  _addchildren(b4j.example.vmtimepicker __ref,anywheresoftware.b4a.objects.collections.List _children) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "addchildren", true))
	 {return ((String) Debug.delegate(ba, "addchildren", new Object[] {_children}));}
b4j.example.vmelement _childx = null;
RDebugUtils.currentLine=218169344;
 //BA.debugLineNum = 218169344;BA.debugLine="Sub AddChildren(children As List)";
RDebugUtils.currentLine=218169345;
 //BA.debugLineNum = 218169345;BA.debugLine="For Each childx As VMElement In children";
{
final anywheresoftware.b4a.BA.IterableList group1 = _children;
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (b4j.example.vmelement)(group1.Get(index1));
RDebugUtils.currentLine=218169346;
 //BA.debugLineNum = 218169346;BA.debugLine="AddChild(childx)";
__ref._addchild /*b4j.example.vmtimepicker*/ (null,_childx);
 }
};
RDebugUtils.currentLine=218169348;
 //BA.debugLineNum = 218169348;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _addclass(b4j.example.vmtimepicker __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=217055232;
 //BA.debugLineNum = 217055232;BA.debugLine="Sub AddClass(c As String) As VMTimePicker";
RDebugUtils.currentLine=217055233;
 //BA.debugLineNum = 217055233;BA.debugLine="TimePicker.AddClass(c)";
__ref._timepicker /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=217055234;
 //BA.debugLineNum = 217055234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217055235;
 //BA.debugLineNum = 217055235;BA.debugLine="End Sub";
return null;
}
public String  _addtocontainer(b4j.example.vmtimepicker __ref,b4j.example.vmcontainer _pcont,int _rowpos,int _colpos) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "addtocontainer", true))
	 {return ((String) Debug.delegate(ba, "addtocontainer", new Object[] {_pcont,_rowpos,_colpos}));}
RDebugUtils.currentLine=218955776;
 //BA.debugLineNum = 218955776;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
RDebugUtils.currentLine=218955777;
 //BA.debugLineNum = 218955777;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
_pcont._addcomponent /*String*/ (null,_rowpos,_colpos,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=218955778;
 //BA.debugLineNum = 218955778;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmtimepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
RDebugUtils.currentLine=216793088;
 //BA.debugLineNum = 216793088;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=216793089;
 //BA.debugLineNum = 216793089;BA.debugLine="Private TimePicker As VMElement";
_timepicker = new b4j.example.vmelement();
RDebugUtils.currentLine=216793090;
 //BA.debugLineNum = 216793090;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=216793091;
 //BA.debugLineNum = 216793091;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=216793092;
 //BA.debugLineNum = 216793092;BA.debugLine="Private TimePickerInt As VMField";
_timepickerint = new b4j.example.vmfield();
RDebugUtils.currentLine=216793093;
 //BA.debugLineNum = 216793093;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
RDebugUtils.currentLine=216793094;
 //BA.debugLineNum = 216793094;BA.debugLine="Private hasHelp As Boolean";
_hashelp = false;
RDebugUtils.currentLine=216793095;
 //BA.debugLineNum = 216793095;BA.debugLine="Private ht As VMElement";
_ht = new b4j.example.vmelement();
RDebugUtils.currentLine=216793096;
 //BA.debugLineNum = 216793096;BA.debugLine="Private et As VMElement";
_et = new b4j.example.vmelement();
RDebugUtils.currentLine=216793097;
 //BA.debugLineNum = 216793097;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=216793098;
 //BA.debugLineNum = 216793098;BA.debugLine="Private hasError As Boolean";
_haserror = false;
RDebugUtils.currentLine=216793099;
 //BA.debugLineNum = 216793099;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=216793100;
 //BA.debugLineNum = 216793100;BA.debugLine="End Sub";
return "";
}
public String  _settimes(b4j.example.vmtimepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "settimes", true))
	 {return ((String) Debug.delegate(ba, "settimes", null));}
anywheresoftware.b4a.objects.collections.List _times = null;
RDebugUtils.currentLine=216924160;
 //BA.debugLineNum = 216924160;BA.debugLine="private Sub SetTimes";
RDebugUtils.currentLine=216924161;
 //BA.debugLineNum = 216924161;BA.debugLine="Dim times As List";
_times = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=216924162;
 //BA.debugLineNum = 216924162;BA.debugLine="times.Initialize";
_times.Initialize();
RDebugUtils.currentLine=216924163;
 //BA.debugLineNum = 216924163;BA.debugLine="times.AddAll(Array(\"12:00\",\"12:30\",\"01:00\",\"01:30";
_times.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("12:00"),(Object)("12:30"),(Object)("01:00"),(Object)("01:30"),(Object)("02:00"),(Object)("02:30"),(Object)("03:00"),(Object)("03:30"),(Object)("04:00"),(Object)("04:30"),(Object)("05:00"),(Object)("05:30"),(Object)("06:00")}));
RDebugUtils.currentLine=216924164;
 //BA.debugLineNum = 216924164;BA.debugLine="times.AddAll(Array(\"06:30\",\"07:00\",\"07:30\",\"08:00";
_times.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("06:30"),(Object)("07:00"),(Object)("07:30"),(Object)("08:00"),(Object)("08:30"),(Object)("09:00"),(Object)("09:30"),(Object)("10:00"),(Object)("10:30"),(Object)("11:00"),(Object)("11:30"),(Object)("13:00"),(Object)("13:30")}));
RDebugUtils.currentLine=216924165;
 //BA.debugLineNum = 216924165;BA.debugLine="times.AddAll(Array(\"14:00\",\"14:30\",\"15:00\",\"15:30";
_times.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("14:00"),(Object)("14:30"),(Object)("15:00"),(Object)("15:30"),(Object)("16:00"),(Object)("16:30"),(Object)("17:00"),(Object)("17:30"),(Object)("18:00"),(Object)("18:30"),(Object)("19:00"),(Object)("19:30"),(Object)("20:00")}));
RDebugUtils.currentLine=216924166;
 //BA.debugLineNum = 216924166;BA.debugLine="times.AddAll(Array(\"20:30\",\"21:00\",\"21:30\",\"22:00";
_times.AddAll(anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)("20:30"),(Object)("21:00"),(Object)("21:30"),(Object)("22:00"),(Object)("22:30"),(Object)("23:00"),(Object)("23:30"),(Object)("00:00"),(Object)("00:30"),(Object)("")}));
RDebugUtils.currentLine=216924167;
 //BA.debugLineNum = 216924167;BA.debugLine="times.Sort(True)";
_times.Sort(__c.True);
RDebugUtils.currentLine=216924168;
 //BA.debugLineNum = 216924168;BA.debugLine="SetOptions($\"${ID}_times\"$, times, \"id\", \"text\")";
__ref._setoptions /*String*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_times"),_times,"id","text");
RDebugUtils.currentLine=216924169;
 //BA.debugLineNum = 216924169;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _setonselected(b4j.example.vmtimepicker __ref,String _value) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setonselected", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setonselected", new Object[] {_value}));}
String _methodname = "";
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=218759168;
 //BA.debugLineNum = 218759168;BA.debugLine="private Sub SetOnSelected(value As String) As VMTi";
RDebugUtils.currentLine=218759169;
 //BA.debugLineNum = 218759169;BA.debugLine="Dim methodName As String = $\"${ID}_change\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_change");
RDebugUtils.currentLine=218759170;
 //BA.debugLineNum = 218759170;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=218759171;
 //BA.debugLineNum = 218759171;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{(Object)(_value)}))));
RDebugUtils.currentLine=218759172;
 //BA.debugLineNum = 218759172;BA.debugLine="SetAttr(CreateMap(\"v-on:md-selected\": methodName)";
__ref._setattr /*b4j.example.vmtimepicker*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-selected"),(Object)(_methodname)}));
RDebugUtils.currentLine=218759174;
 //BA.debugLineNum = 218759174;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=218759175;
 //BA.debugLineNum = 218759175;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218759176;
 //BA.debugLineNum = 218759176;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setonopened(b4j.example.vmtimepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setonopened", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setonopened", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=218824704;
 //BA.debugLineNum = 218824704;BA.debugLine="private Sub SetOnOpened As VMTimePicker";
RDebugUtils.currentLine=218824705;
 //BA.debugLineNum = 218824705;BA.debugLine="Dim methodName As String  = $\"${ID}_opened\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_opened");
RDebugUtils.currentLine=218824706;
 //BA.debugLineNum = 218824706;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=218824707;
 //BA.debugLineNum = 218824707;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=218824708;
 //BA.debugLineNum = 218824708;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=218824709;
 //BA.debugLineNum = 218824709;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
__ref._setattr /*b4j.example.vmtimepicker*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-opened"),(Object)(_methodname)}));
RDebugUtils.currentLine=218824711;
 //BA.debugLineNum = 218824711;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=218824712;
 //BA.debugLineNum = 218824712;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218824713;
 //BA.debugLineNum = 218824713;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setonclosed(b4j.example.vmtimepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setonclosed", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setonclosed", null));}
String _methodname = "";
com.ab.banano.BANanoEvent _e = null;
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=218890240;
 //BA.debugLineNum = 218890240;BA.debugLine="Sub SetOnClosed As VMTimePicker";
RDebugUtils.currentLine=218890241;
 //BA.debugLineNum = 218890241;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
_methodname = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_closed");
RDebugUtils.currentLine=218890242;
 //BA.debugLineNum = 218890242;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
if (__c.SubExists(ba,__ref._module /*Object*/ ,_methodname)==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=218890243;
 //BA.debugLineNum = 218890243;BA.debugLine="Dim e As BANanoEvent";
_e = new com.ab.banano.BANanoEvent();
RDebugUtils.currentLine=218890244;
 //BA.debugLineNum = 218890244;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,_methodname,(anywheresoftware.b4a.objects.collections.List) anywheresoftware.b4a.AbsObjectWrapper.ConvertToWrapper(new anywheresoftware.b4a.objects.collections.List(), (java.util.List)(_e)))));
RDebugUtils.currentLine=218890245;
 //BA.debugLineNum = 218890245;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
__ref._setattr /*b4j.example.vmtimepicker*/ (null,__c.createMap(new Object[] {(Object)("v-on:md-closed"),(Object)(_methodname)}));
RDebugUtils.currentLine=218890247;
 //BA.debugLineNum = 218890247;BA.debugLine="vue.SetCallBack(methodName, cb)";
__ref._vue /*b4j.example.bananovue*/ ._setcallback /*String*/ (null,_methodname,_cb);
RDebugUtils.currentLine=218890248;
 //BA.debugLineNum = 218890248;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218890249;
 //BA.debugLineNum = 218890249;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmtimepicker __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=217645056;
 //BA.debugLineNum = 217645056;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=217645057;
 //BA.debugLineNum = 217645057;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=217645058;
 //BA.debugLineNum = 217645058;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmtimepicker __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=217579520;
 //BA.debugLineNum = 217579520;BA.debugLine="Sub Render";
RDebugUtils.currentLine=217579521;
 //BA.debugLineNum = 217579521;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=217579522;
 //BA.debugLineNum = 217579522;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _setaccent(b4j.example.vmtimepicker __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setaccent", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setaccent", new Object[] {_b}));}
RDebugUtils.currentLine=218038272;
 //BA.debugLineNum = 218038272;BA.debugLine="Sub SetAccent(b As Boolean) As VMTimePicker";
RDebugUtils.currentLine=218038273;
 //BA.debugLineNum = 218038273;BA.debugLine="TimePicker.SetAccent(True)";
__ref._timepicker /*b4j.example.vmelement*/ ._setaccent /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=218038274;
 //BA.debugLineNum = 218038274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218038275;
 //BA.debugLineNum = 218038275;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setattr(b4j.example.vmtimepicker __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=217120768;
 //BA.debugLineNum = 217120768;BA.debugLine="Sub SetAttr(attr As Map) As VMTimePicker";
RDebugUtils.currentLine=217120769;
 //BA.debugLineNum = 217120769;BA.debugLine="TimePicker.SetAttr(attr)";
__ref._timepicker /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=217120770;
 //BA.debugLineNum = 217120770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217120771;
 //BA.debugLineNum = 217120771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setdense(b4j.example.vmtimepicker __ref,boolean _vardense) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setdense", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setdense", new Object[] {_vardense}));}
RDebugUtils.currentLine=218693632;
 //BA.debugLineNum = 218693632;BA.debugLine="Sub SetDense(varDense As Boolean) As VMTimePicker";
RDebugUtils.currentLine=218693633;
 //BA.debugLineNum = 218693633;BA.debugLine="If varDense = False Then Return Me";
if (_vardense==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=218693634;
 //BA.debugLineNum = 218693634;BA.debugLine="If varDense Then SetAttr(CreateMap(\":md-dense\": v";
if (_vardense) { 
__ref._setattr /*b4j.example.vmtimepicker*/ (null,__c.createMap(new Object[] {(Object)(":md-dense"),(Object)(_vardense)}));};
RDebugUtils.currentLine=218693635;
 //BA.debugLineNum = 218693635;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218693636;
 //BA.debugLineNum = 218693636;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setid(b4j.example.vmtimepicker __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setid", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=218497024;
 //BA.debugLineNum = 218497024;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
RDebugUtils.currentLine=218497025;
 //BA.debugLineNum = 218497025;BA.debugLine="TimePicker.SetID(varName, bind)";
__ref._timepicker /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=218497026;
 //BA.debugLineNum = 218497026;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218497027;
 //BA.debugLineNum = 218497027;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setmultiple(b4j.example.vmtimepicker __ref,boolean _varmultiple) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setmultiple", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setmultiple", new Object[] {_varmultiple}));}
RDebugUtils.currentLine=218628096;
 //BA.debugLineNum = 218628096;BA.debugLine="Sub SetMultiple(varMultiple As Boolean) As VMTimeP";
RDebugUtils.currentLine=218628097;
 //BA.debugLineNum = 218628097;BA.debugLine="If varMultiple = False Then Return Me";
if (_varmultiple==__c.False) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=218628098;
 //BA.debugLineNum = 218628098;BA.debugLine="SetAttr(CreateMap(\":multiple\": varMultiple))";
__ref._setattr /*b4j.example.vmtimepicker*/ (null,__c.createMap(new Object[] {(Object)(":multiple"),(Object)(_varmultiple)}));
RDebugUtils.currentLine=218628099;
 //BA.debugLineNum = 218628099;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218628100;
 //BA.debugLineNum = 218628100;BA.debugLine="End Sub";
return null;
}
public String  _setoptions(b4j.example.vmtimepicker __ref,String _sourcename,anywheresoftware.b4a.objects.collections.List _options,String _sourcefield,String _displayfield) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setoptions", true))
	 {return ((String) Debug.delegate(ba, "setoptions", new Object[] {_sourcename,_options,_sourcefield,_displayfield}));}
anywheresoftware.b4a.objects.collections.List _recs = null;
String _k = "";
anywheresoftware.b4a.objects.collections.Map _nrec = null;
String _krow = "";
String _drow = "";
b4j.example.vmelement _option = null;
RDebugUtils.currentLine=217317376;
 //BA.debugLineNum = 217317376;BA.debugLine="private Sub SetOptions(sourceName As String, optio";
RDebugUtils.currentLine=217317377;
 //BA.debugLineNum = 217317377;BA.debugLine="sourceName = sourceName.tolowercase";
_sourcename = _sourcename.toLowerCase();
RDebugUtils.currentLine=217317378;
 //BA.debugLineNum = 217317378;BA.debugLine="Dim recs As List";
_recs = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=217317379;
 //BA.debugLineNum = 217317379;BA.debugLine="recs.Initialize";
_recs.Initialize();
RDebugUtils.currentLine=217317380;
 //BA.debugLineNum = 217317380;BA.debugLine="For Each k As String In options";
{
final anywheresoftware.b4a.BA.IterableList group4 = _options;
final int groupLen4 = group4.getSize()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.Get(index4));
RDebugUtils.currentLine=217317381;
 //BA.debugLineNum = 217317381;BA.debugLine="Dim nrec As Map = CreateMap()";
_nrec = new anywheresoftware.b4a.objects.collections.Map();
_nrec = __c.createMap(new Object[] {});
RDebugUtils.currentLine=217317382;
 //BA.debugLineNum = 217317382;BA.debugLine="nrec.Put(sourcefield, k)";
_nrec.Put((Object)(_sourcefield),(Object)(_k));
RDebugUtils.currentLine=217317383;
 //BA.debugLineNum = 217317383;BA.debugLine="nrec.Put(displayfield, k)";
_nrec.Put((Object)(_displayfield),(Object)(_k));
RDebugUtils.currentLine=217317384;
 //BA.debugLineNum = 217317384;BA.debugLine="recs.Add(nrec)";
_recs.Add((Object)(_nrec.getObject()));
 }
};
RDebugUtils.currentLine=217317387;
 //BA.debugLineNum = 217317387;BA.debugLine="vue.SetStateSingle(sourceName, recs)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_sourcename,(Object)(_recs.getObject()));
RDebugUtils.currentLine=217317388;
 //BA.debugLineNum = 217317388;BA.debugLine="Dim kRow As String = $\"row.${sourcefield}\"$";
_krow = ("row."+__c.SmartStringFormatter("",(Object)(_sourcefield))+"");
RDebugUtils.currentLine=217317389;
 //BA.debugLineNum = 217317389;BA.debugLine="Dim dRow As String = $\"row.${displayfield}\"$";
_drow = ("row."+__c.SmartStringFormatter("",(Object)(_displayfield))+"");
RDebugUtils.currentLine=217317390;
 //BA.debugLineNum = 217317390;BA.debugLine="Dim option As VMElement";
_option = new b4j.example.vmelement();
RDebugUtils.currentLine=217317391;
 //BA.debugLineNum = 217317391;BA.debugLine="option.Initialize(vue,\"\")";
_option._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,"");
RDebugUtils.currentLine=217317392;
 //BA.debugLineNum = 217317392;BA.debugLine="option.SetTag(\"md-option\")";
_option._settag /*b4j.example.vmelement*/ (null,"md-option");
RDebugUtils.currentLine=217317393;
 //BA.debugLineNum = 217317393;BA.debugLine="option.SetVFor(\"row\", sourceName)";
_option._setvfor /*b4j.example.vmelement*/ (null,"row",_sourcename);
RDebugUtils.currentLine=217317394;
 //BA.debugLineNum = 217317394;BA.debugLine="option.SetID($\"${kRow}\"$,True)";
_option._setid /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=217317395;
 //BA.debugLineNum = 217317395;BA.debugLine="option.SetKey($\"${kRow}\"$,True)";
_option._setkey /*b4j.example.vmelement*/ (null,(Object)((""+__c.SmartStringFormatter("",(Object)(_krow))+"")),__c.True);
RDebugUtils.currentLine=217317396;
 //BA.debugLineNum = 217317396;BA.debugLine="option.SetValue($\"${kRow}\"$,True)";
_option._setvalue /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=217317397;
 //BA.debugLineNum = 217317397;BA.debugLine="option.SetName($\"${kRow}\"$,True)";
_option._setname /*b4j.example.vmelement*/ (null,(""+__c.SmartStringFormatter("",(Object)(_krow))+""),__c.True);
RDebugUtils.currentLine=217317398;
 //BA.debugLineNum = 217317398;BA.debugLine="option.SetText($\"{{ ${dRow} }}\"$)";
_option._settext /*b4j.example.vmelement*/ (null,("{{ "+__c.SmartStringFormatter("",(Object)(_drow))+" }}"));
RDebugUtils.currentLine=217317399;
 //BA.debugLineNum = 217317399;BA.debugLine="option.Pop(TimePicker)";
_option._pop /*String*/ (null,__ref._timepicker /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=217317400;
 //BA.debugLineNum = 217317400;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmtimepicker  _setpadding(b4j.example.vmtimepicker __ref,Object _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setpadding", new Object[] {_p}));}
RDebugUtils.currentLine=218234880;
 //BA.debugLineNum = 218234880;BA.debugLine="Sub SetPadding(p As Object) As VMTimePicker";
RDebugUtils.currentLine=218234881;
 //BA.debugLineNum = 218234881;BA.debugLine="TimePicker.SetPaddingAll(p)";
__ref._timepicker /*b4j.example.vmelement*/ ._setpaddingall /*b4j.example.vmelement*/ (null,_p);
RDebugUtils.currentLine=218234882;
 //BA.debugLineNum = 218234882;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218234883;
 //BA.debugLineNum = 218234883;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setprimary(b4j.example.vmtimepicker __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setprimary", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setprimary", new Object[] {_b}));}
RDebugUtils.currentLine=217972736;
 //BA.debugLineNum = 217972736;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTimePicker";
RDebugUtils.currentLine=217972737;
 //BA.debugLineNum = 217972737;BA.debugLine="TimePicker.SetPrimary(True)";
__ref._timepicker /*b4j.example.vmelement*/ ._setprimary /*b4j.example.vmelement*/ (null,__c.True);
RDebugUtils.currentLine=217972738;
 //BA.debugLineNum = 217972738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217972739;
 //BA.debugLineNum = 217972739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setstyle(b4j.example.vmtimepicker __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=218103808;
 //BA.debugLineNum = 218103808;BA.debugLine="Sub SetStyle(sm As Map) As VMTimePicker";
RDebugUtils.currentLine=218103809;
 //BA.debugLineNum = 218103809;BA.debugLine="TimePicker.SetStyle(sm)";
__ref._timepicker /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=218103810;
 //BA.debugLineNum = 218103810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=218103811;
 //BA.debugLineNum = 218103811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _settext(b4j.example.vmtimepicker __ref,Object _t) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "settext", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "settext", new Object[] {_t}));}
RDebugUtils.currentLine=217907200;
 //BA.debugLineNum = 217907200;BA.debugLine="Sub SetText(t As Object) As VMTimePicker";
RDebugUtils.currentLine=217907201;
 //BA.debugLineNum = 217907201;BA.debugLine="TimePicker.SetText(t)";
__ref._timepicker /*b4j.example.vmelement*/ ._settext /*b4j.example.vmelement*/ (null,BA.ObjectToString(_t));
RDebugUtils.currentLine=217907202;
 //BA.debugLineNum = 217907202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217907203;
 //BA.debugLineNum = 217907203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmtimepicker  _setvif(b4j.example.vmtimepicker __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmtimepicker";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmtimepicker) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=217710592;
 //BA.debugLineNum = 217710592;BA.debugLine="Sub SetVIf(vif As String) As VMTimePicker";
RDebugUtils.currentLine=217710593;
 //BA.debugLineNum = 217710593;BA.debugLine="If vif = \"\" Then Return Me";
if ((_vif).equals("")) { 
if (true) return (b4j.example.vmtimepicker)(this);};
RDebugUtils.currentLine=217710594;
 //BA.debugLineNum = 217710594;BA.debugLine="TimePickerInt.SetVIf(vif)";
__ref._timepickerint /*b4j.example.vmfield*/ ._setvif /*b4j.example.vmfield*/ (null,(Object)(_vif));
RDebugUtils.currentLine=217710595;
 //BA.debugLineNum = 217710595;BA.debugLine="Return Me";
if (true) return (b4j.example.vmtimepicker)(this);
RDebugUtils.currentLine=217710596;
 //BA.debugLineNum = 217710596;BA.debugLine="End Sub";
return null;
}
}