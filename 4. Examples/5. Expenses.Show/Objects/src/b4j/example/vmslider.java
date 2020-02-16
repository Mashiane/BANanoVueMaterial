package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmslider", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmslider.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _slider = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmelement _inputint = null;
public b4j.example.vmlabel _lbl = null;
public String _labeltext = "";
public String _vmodeltext = "";
public boolean _labelontop = false;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmslider  _initialize(b4j.example.vmslider __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=194052096;
 //BA.debugLineNum = 194052096;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=194052097;
 //BA.debugLineNum = 194052097;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=194052098;
 //BA.debugLineNum = 194052098;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=194052099;
 //BA.debugLineNum = 194052099;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=194052100;
 //BA.debugLineNum = 194052100;BA.debugLine="Slider.Initialize(vue, ID).SetTag(\"vue-material-s";
__ref._slider /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"vue-material-slider");
RDebugUtils.currentLine=194052101;
 //BA.debugLineNum = 194052101;BA.debugLine="InputInt.Initialize(v,$\"${sid}parent\"$).SetTag(\"d";
__ref._inputint /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,_v,(""+__c.SmartStringFormatter("",(Object)(_sid))+"parent"))._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=194052102;
 //BA.debugLineNum = 194052102;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$)";
__ref._lbl /*b4j.example.vmlabel*/ ._initialize /*b4j.example.vmlabel*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(_sid))+"label"));
RDebugUtils.currentLine=194052103;
 //BA.debugLineNum = 194052103;BA.debugLine="labelText = \"\"";
__ref._labeltext /*String*/  = "";
RDebugUtils.currentLine=194052104;
 //BA.debugLineNum = 194052104;BA.debugLine="labelOnTop = False";
__ref._labelontop /*boolean*/  = __c.False;
RDebugUtils.currentLine=194052105;
 //BA.debugLineNum = 194052105;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194052106;
 //BA.debugLineNum = 194052106;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setmin(b4j.example.vmslider __ref,int _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setmin", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setmin", new Object[] {_m}));}
RDebugUtils.currentLine=194641920;
 //BA.debugLineNum = 194641920;BA.debugLine="Sub SetMin(m As Int) As VMSlider";
RDebugUtils.currentLine=194641921;
 //BA.debugLineNum = 194641921;BA.debugLine="SetAttr(CreateMap(\":min\": m))";
__ref._setattr /*b4j.example.vmslider*/ (null,__c.createMap(new Object[] {(Object)(":min"),(Object)(_m)}));
RDebugUtils.currentLine=194641922;
 //BA.debugLineNum = 194641922;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194641923;
 //BA.debugLineNum = 194641923;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setmax(b4j.example.vmslider __ref,int _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setmax", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setmax", new Object[] {_m}));}
RDebugUtils.currentLine=194707456;
 //BA.debugLineNum = 194707456;BA.debugLine="Sub SetMax(m As Int) As VMSlider";
RDebugUtils.currentLine=194707457;
 //BA.debugLineNum = 194707457;BA.debugLine="SetAttr(CreateMap(\":max\": m))";
__ref._setattr /*b4j.example.vmslider*/ (null,__c.createMap(new Object[] {(Object)(":max"),(Object)(_m)}));
RDebugUtils.currentLine=194707458;
 //BA.debugLineNum = 194707458;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194707459;
 //BA.debugLineNum = 194707459;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setlabel(b4j.example.vmslider __ref,Object _lbltext) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setlabel", new Object[] {_lbltext}));}
RDebugUtils.currentLine=194248704;
 //BA.debugLineNum = 194248704;BA.debugLine="Sub SetLabel(lblText As Object) As VMSlider";
RDebugUtils.currentLine=194248705;
 //BA.debugLineNum = 194248705;BA.debugLine="labelText = lblText";
__ref._labeltext /*String*/  = BA.ObjectToString(_lbltext);
RDebugUtils.currentLine=194248706;
 //BA.debugLineNum = 194248706;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194248707;
 //BA.debugLineNum = 194248707;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setthumblabel(b4j.example.vmslider __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setthumblabel", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setthumblabel", new Object[] {_b}));}
RDebugUtils.currentLine=194379776;
 //BA.debugLineNum = 194379776;BA.debugLine="Sub SetThumbLabel(b As Boolean) As VMSlider";
RDebugUtils.currentLine=194379777;
 //BA.debugLineNum = 194379777;BA.debugLine="SetAttr(CreateMap(\":thumbLabel\": b))";
__ref._setattr /*b4j.example.vmslider*/ (null,__c.createMap(new Object[] {(Object)(":thumbLabel"),(Object)(_b)}));
RDebugUtils.currentLine=194379778;
 //BA.debugLineNum = 194379778;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194379779;
 //BA.debugLineNum = 194379779;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvmodel(b4j.example.vmslider __ref,String _k) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setvmodel", new Object[] {_k}));}
RDebugUtils.currentLine=195035136;
 //BA.debugLineNum = 195035136;BA.debugLine="Sub SetVModel(k As String) As VMSlider";
RDebugUtils.currentLine=195035137;
 //BA.debugLineNum = 195035137;BA.debugLine="Slider.SetVModel(k)";
__ref._slider /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_k);
RDebugUtils.currentLine=195035138;
 //BA.debugLineNum = 195035138;BA.debugLine="vmodelText = k";
__ref._vmodeltext /*String*/  = _k;
RDebugUtils.currentLine=195035139;
 //BA.debugLineNum = 195035139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=195035140;
 //BA.debugLineNum = 195035140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvshow(b4j.example.vmslider __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=194904064;
 //BA.debugLineNum = 194904064;BA.debugLine="Sub SetVShow(vif As Object) As VMSlider";
RDebugUtils.currentLine=194904065;
 //BA.debugLineNum = 194904065;BA.debugLine="Slider.SetVShow(vif)";
__ref._slider /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=194904066;
 //BA.debugLineNum = 194904066;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194904067;
 //BA.debugLineNum = 194904067;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdisabled(b4j.example.vmslider __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=194772992;
 //BA.debugLineNum = 194772992;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSlider";
RDebugUtils.currentLine=194772993;
 //BA.debugLineNum = 194772993;BA.debugLine="Slider.SetDisabled(b)";
__ref._slider /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=194772994;
 //BA.debugLineNum = 194772994;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194772995;
 //BA.debugLineNum = 194772995;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setname(b4j.example.vmslider __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setname", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=194314240;
 //BA.debugLineNum = 194314240;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
RDebugUtils.currentLine=194314241;
 //BA.debugLineNum = 194314241;BA.debugLine="Slider.SetName(varName, bind)";
__ref._slider /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=194314242;
 //BA.debugLineNum = 194314242;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194314243;
 //BA.debugLineNum = 194314243;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _settabindex(b4j.example.vmslider __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=194117632;
 //BA.debugLineNum = 194117632;BA.debugLine="Sub SetTabIndex(ti As String) As VMSlider";
RDebugUtils.currentLine=194117633;
 //BA.debugLineNum = 194117633;BA.debugLine="Slider.SetTabIndex(ti)";
__ref._slider /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=194117634;
 //BA.debugLineNum = 194117634;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194117635;
 //BA.debugLineNum = 194117635;BA.debugLine="End Sub";
return null;
}
public String  _tostring(b4j.example.vmslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
String _mmodel = "";
RDebugUtils.currentLine=195297280;
 //BA.debugLineNum = 195297280;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=195297281;
 //BA.debugLineNum = 195297281;BA.debugLine="Dim mModel As String = $\"{{ ${vmodelText} }}\"$";
_mmodel = ("{{ "+__c.SmartStringFormatter("",(Object)(__ref._vmodeltext /*String*/ ))+" }}");
RDebugUtils.currentLine=195297282;
 //BA.debugLineNum = 195297282;BA.debugLine="lbl.SetText($\"${labelText}: ${mModel}\"$)";
__ref._lbl /*b4j.example.vmlabel*/ ._settext /*b4j.example.vmlabel*/ (null,(""+__c.SmartStringFormatter("",(Object)(__ref._labeltext /*String*/ ))+": "+__c.SmartStringFormatter("",(Object)(_mmodel))+""));
RDebugUtils.currentLine=195297283;
 //BA.debugLineNum = 195297283;BA.debugLine="If labelOnTop Then InputInt.AddClass(\"dontwrap\")";
if (__ref._labelontop /*boolean*/ ) { 
__ref._inputint /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,"dontwrap");};
RDebugUtils.currentLine=195297284;
 //BA.debugLineNum = 195297284;BA.debugLine="lbl.Pop(InputInt)";
__ref._lbl /*b4j.example.vmlabel*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=195297285;
 //BA.debugLineNum = 195297285;BA.debugLine="Slider.Pop(InputInt)";
__ref._slider /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._inputint /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=195297286;
 //BA.debugLineNum = 195297286;BA.debugLine="Return InputInt.tostring";
if (true) return __ref._inputint /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=195297287;
 //BA.debugLineNum = 195297287;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _setlabelontop(b4j.example.vmslider __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setlabelontop", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setlabelontop", new Object[] {_b}));}
RDebugUtils.currentLine=194183168;
 //BA.debugLineNum = 194183168;BA.debugLine="Sub SetLabelOnTop(b As Boolean) As VMSlider";
RDebugUtils.currentLine=194183169;
 //BA.debugLineNum = 194183169;BA.debugLine="labelOnTop = b";
__ref._labelontop /*boolean*/  = _b;
RDebugUtils.currentLine=194183170;
 //BA.debugLineNum = 194183170;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194183171;
 //BA.debugLineNum = 194183171;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmslider __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=195428352;
 //BA.debugLineNum = 195428352;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=195428353;
 //BA.debugLineNum = 195428353;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=195428354;
 //BA.debugLineNum = 195428354;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _addclass(b4j.example.vmslider __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=195100672;
 //BA.debugLineNum = 195100672;BA.debugLine="Sub AddClass(c As String) As VMSlider";
RDebugUtils.currentLine=195100673;
 //BA.debugLineNum = 195100673;BA.debugLine="Slider.AddClass(c)";
__ref._slider /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=195100674;
 //BA.debugLineNum = 195100674;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=195100675;
 //BA.debugLineNum = 195100675;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
RDebugUtils.currentLine=193986560;
 //BA.debugLineNum = 193986560;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=193986561;
 //BA.debugLineNum = 193986561;BA.debugLine="Public Slider As VMElement";
_slider = new b4j.example.vmelement();
RDebugUtils.currentLine=193986562;
 //BA.debugLineNum = 193986562;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=193986563;
 //BA.debugLineNum = 193986563;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=193986564;
 //BA.debugLineNum = 193986564;BA.debugLine="Private InputInt As VMElement";
_inputint = new b4j.example.vmelement();
RDebugUtils.currentLine=193986565;
 //BA.debugLineNum = 193986565;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
RDebugUtils.currentLine=193986566;
 //BA.debugLineNum = 193986566;BA.debugLine="Private labelText As String";
_labeltext = "";
RDebugUtils.currentLine=193986567;
 //BA.debugLineNum = 193986567;BA.debugLine="Private vmodelText As String";
_vmodeltext = "";
RDebugUtils.currentLine=193986568;
 //BA.debugLineNum = 193986568;BA.debugLine="Private labelOnTop As Boolean";
_labelontop = false;
RDebugUtils.currentLine=193986569;
 //BA.debugLineNum = 193986569;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=193986570;
 //BA.debugLineNum = 193986570;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmslider __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=195362816;
 //BA.debugLineNum = 195362816;BA.debugLine="Sub Render";
RDebugUtils.currentLine=195362817;
 //BA.debugLineNum = 195362817;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=195362818;
 //BA.debugLineNum = 195362818;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _setattr(b4j.example.vmslider __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=195231744;
 //BA.debugLineNum = 195231744;BA.debugLine="Sub SetAttr(attr As Map) As VMSlider";
RDebugUtils.currentLine=195231745;
 //BA.debugLineNum = 195231745;BA.debugLine="Slider.SetAttr(attr)";
__ref._slider /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=195231746;
 //BA.debugLineNum = 195231746;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=195231747;
 //BA.debugLineNum = 195231747;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setid(b4j.example.vmslider __ref,Object _varname,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setid", new Object[] {_varname,_bind}));}
RDebugUtils.currentLine=194576384;
 //BA.debugLineNum = 194576384;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
RDebugUtils.currentLine=194576385;
 //BA.debugLineNum = 194576385;BA.debugLine="Slider.SetID(varName, bind)";
__ref._slider /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,BA.ObjectToString(_varname),_bind);
RDebugUtils.currentLine=194576386;
 //BA.debugLineNum = 194576386;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194576387;
 //BA.debugLineNum = 194576387;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setinvert(b4j.example.vmslider __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setinvert", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setinvert", new Object[] {_b}));}
RDebugUtils.currentLine=194445312;
 //BA.debugLineNum = 194445312;BA.debugLine="Sub SetInvert(b As Boolean) As VMSlider";
RDebugUtils.currentLine=194445313;
 //BA.debugLineNum = 194445313;BA.debugLine="SetAttr(CreateMap(\":invert\": b))";
__ref._setattr /*b4j.example.vmslider*/ (null,__c.createMap(new Object[] {(Object)(":invert"),(Object)(_b)}));
RDebugUtils.currentLine=194445314;
 //BA.debugLineNum = 194445314;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194445315;
 //BA.debugLineNum = 194445315;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setstyle(b4j.example.vmslider __ref,anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setstyle", new Object[] {_m}));}
RDebugUtils.currentLine=195166208;
 //BA.debugLineNum = 195166208;BA.debugLine="Sub SetStyle(m As Map) As VMSlider";
RDebugUtils.currentLine=195166209;
 //BA.debugLineNum = 195166209;BA.debugLine="InputInt.SetStyle(m)";
__ref._inputint /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_m);
RDebugUtils.currentLine=195166210;
 //BA.debugLineNum = 195166210;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=195166211;
 //BA.debugLineNum = 195166211;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvalue(b4j.example.vmslider __ref,Object _v) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setvalue", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setvalue", new Object[] {_v}));}
RDebugUtils.currentLine=194969600;
 //BA.debugLineNum = 194969600;BA.debugLine="Sub SetValue(v As Object) As VMSlider";
RDebugUtils.currentLine=194969601;
 //BA.debugLineNum = 194969601;BA.debugLine="SetAttr(CreateMap(\"value\": v))";
__ref._setattr /*b4j.example.vmslider*/ (null,__c.createMap(new Object[] {(Object)("value"),_v}));
RDebugUtils.currentLine=194969602;
 //BA.debugLineNum = 194969602;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194969603;
 //BA.debugLineNum = 194969603;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvertical(b4j.example.vmslider __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setvertical", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setvertical", new Object[] {_b}));}
RDebugUtils.currentLine=194510848;
 //BA.debugLineNum = 194510848;BA.debugLine="Sub SetVertical(b As Boolean) As VMSlider";
RDebugUtils.currentLine=194510849;
 //BA.debugLineNum = 194510849;BA.debugLine="SetAttr(CreateMap(\":vertical\": b))";
__ref._setattr /*b4j.example.vmslider*/ (null,__c.createMap(new Object[] {(Object)(":vertical"),(Object)(_b)}));
RDebugUtils.currentLine=194510850;
 //BA.debugLineNum = 194510850;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194510851;
 //BA.debugLineNum = 194510851;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvif(b4j.example.vmslider __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmslider";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmslider) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=194838528;
 //BA.debugLineNum = 194838528;BA.debugLine="Sub SetVIf(vif As Object) As VMSlider";
RDebugUtils.currentLine=194838529;
 //BA.debugLineNum = 194838529;BA.debugLine="Slider.SetVIf(vif)";
__ref._slider /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=194838530;
 //BA.debugLineNum = 194838530;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
RDebugUtils.currentLine=194838531;
 //BA.debugLineNum = 194838531;BA.debugLine="End Sub";
return null;
}
}