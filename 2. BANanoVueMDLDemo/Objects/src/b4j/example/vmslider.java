package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmslider extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmslider", this);
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
public b4j.example.modfile _modfile = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.modgmap _modgmap = null;
public b4j.example.modchartkick _modchartkick = null;
public b4j.example.modavatar _modavatar = null;
public b4j.example.modbadge _modbadge = null;
public b4j.example.modbottombar _modbottombar = null;
public b4j.example.modbuttons _modbuttons = null;
public b4j.example.modcheckbox _modcheckbox = null;
public b4j.example.modchips _modchips = null;
public b4j.example.moddatepicker _moddatepicker = null;
public b4j.example.moddialog _moddialog = null;
public b4j.example.modemptystate _modemptystate = null;
public b4j.example.modicon _modicon = null;
public b4j.example.modlist _modlist = null;
public b4j.example.modlistview _modlistview = null;
public b4j.example.modmenu _modmenu = null;
public b4j.example.modprogress _modprogress = null;
public b4j.example.modradio _modradio = null;
public b4j.example.modselect _modselect = null;
public b4j.example.modskeleton _modskeleton = null;
public b4j.example.modsnackbar _modsnackbar = null;
public b4j.example.modspeeddial _modspeeddial = null;
public b4j.example.modspinner _modspinner = null;
public b4j.example.modsteppers _modsteppers = null;
public b4j.example.modswitch _modswitch = null;
public b4j.example.modtable _modtable = null;
public b4j.example.modtabs _modtabs = null;
public b4j.example.modtextarea _modtextarea = null;
public b4j.example.modtextbox _modtextbox = null;
public b4j.example.modtimepicker _modtimepicker = null;
public b4j.example.modtoolbar _modtoolbar = null;
public b4j.example.modtypography _modtypography = null;
public b4j.example.vmslider  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 114;BA.debugLine="Sub AddClass(c As String) As VMSlider";
 //BA.debugLineNum = 115;BA.debugLine="Slider.AddClass(c)";
_slider._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 116;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 117;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Slider As VMElement";
_slider = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private InputInt As VMElement";
_inputint = new b4j.example.vmelement();
 //BA.debugLineNum = 7;BA.debugLine="Private lbl As VMLabel";
_lbl = new b4j.example.vmlabel();
 //BA.debugLineNum = 8;BA.debugLine="Private labelText As String";
_labeltext = "";
 //BA.debugLineNum = 9;BA.debugLine="Private vmodelText As String";
_vmodeltext = "";
 //BA.debugLineNum = 10;BA.debugLine="Private labelOnTop As Boolean";
_labelontop = false;
 //BA.debugLineNum = 11;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 21;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 22;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 23;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 24;BA.debugLine="Slider.Initialize(vue, ID).SetTag(\"vue-material-s";
_slider._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("vue-material-slider");
 //BA.debugLineNum = 25;BA.debugLine="InputInt.Initialize(v,$\"${sid}parent\"$).SetTag(\"d";
_inputint._initialize /*b4j.example.vmelement*/ (ba,_v,(""+__c.SmartStringFormatter("",(Object)(_sid))+"parent"))._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 26;BA.debugLine="lbl.Initialize(vue, $\"${sid}label\"$)";
_lbl._initialize /*b4j.example.vmlabel*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_sid))+"label"));
 //BA.debugLineNum = 27;BA.debugLine="labelText = \"\"";
_labeltext = "";
 //BA.debugLineNum = 28;BA.debugLine="labelOnTop = False";
_labelontop = __c.False;
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 144;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 145;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 140;BA.debugLine="Sub Render";
 //BA.debugLineNum = 141;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 142;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmslider  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetAttr(attr As Map) As VMSlider";
 //BA.debugLineNum = 127;BA.debugLine="Slider.SetAttr(attr)";
_slider._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 87;BA.debugLine="Sub SetDisabled(b As Boolean) As VMSlider";
 //BA.debugLineNum = 88;BA.debugLine="Slider.SetDisabled(b)";
_slider._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 89;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 90;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setid(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 71;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
 //BA.debugLineNum = 72;BA.debugLine="Slider.SetID(varName, bind)";
_slider._setid /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 73;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 74;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setinvert(boolean _b) throws Exception{
 //BA.debugLineNum = 59;BA.debugLine="Sub SetInvert(b As Boolean) As VMSlider";
 //BA.debugLineNum = 60;BA.debugLine="SetAttr(CreateMap(\":invert\": b))";
_setattr(__c.createMap(new Object[] {(Object)(":invert"),(Object)(_b)}));
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setlabel(Object _lbltext) throws Exception{
 //BA.debugLineNum = 43;BA.debugLine="Sub SetLabel(lblText As Object) As VMSlider";
 //BA.debugLineNum = 44;BA.debugLine="labelText = lblText";
_labeltext = BA.ObjectToString(_lbltext);
 //BA.debugLineNum = 45;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 46;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setlabelontop(boolean _b) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetLabelOnTop(b As Boolean) As VMSlider";
 //BA.debugLineNum = 39;BA.debugLine="labelOnTop = b";
_labelontop = _b;
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setmax(int _m) throws Exception{
 //BA.debugLineNum = 82;BA.debugLine="Sub SetMax(m As Int) As VMSlider";
 //BA.debugLineNum = 83;BA.debugLine="SetAttr(CreateMap(\":max\": m))";
_setattr(__c.createMap(new Object[] {(Object)(":max"),(Object)(_m)}));
 //BA.debugLineNum = 84;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 85;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setmin(int _m) throws Exception{
 //BA.debugLineNum = 76;BA.debugLine="Sub SetMin(m As Int) As VMSlider";
 //BA.debugLineNum = 77;BA.debugLine="SetAttr(CreateMap(\":min\": m))";
_setattr(__c.createMap(new Object[] {(Object)(":min"),(Object)(_m)}));
 //BA.debugLineNum = 78;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 79;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setname(Object _varname,boolean _bind) throws Exception{
 //BA.debugLineNum = 49;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
 //BA.debugLineNum = 50;BA.debugLine="Slider.SetName(varName, bind)";
_slider._setname /*b4j.example.vmelement*/ (BA.ObjectToString(_varname),_bind);
 //BA.debugLineNum = 51;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 52;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setstyle(anywheresoftware.b4a.objects.collections.Map _m) throws Exception{
 //BA.debugLineNum = 120;BA.debugLine="Sub SetStyle(m As Map) As VMSlider";
 //BA.debugLineNum = 121;BA.debugLine="InputInt.SetStyle(m)";
_inputint._setstyle /*b4j.example.vmelement*/ (_m);
 //BA.debugLineNum = 122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetTabIndex(ti As String) As VMSlider";
 //BA.debugLineNum = 33;BA.debugLine="Slider.SetTabIndex(ti)";
_slider._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setthumblabel(boolean _b) throws Exception{
 //BA.debugLineNum = 54;BA.debugLine="Sub SetThumbLabel(b As Boolean) As VMSlider";
 //BA.debugLineNum = 55;BA.debugLine="SetAttr(CreateMap(\":thumbLabel\": b))";
_setattr(__c.createMap(new Object[] {(Object)(":thumbLabel"),(Object)(_b)}));
 //BA.debugLineNum = 56;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 57;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvalue(Object _v) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetValue(v As Object) As VMSlider";
 //BA.debugLineNum = 103;BA.debugLine="SetAttr(CreateMap(\"value\": v))";
_setattr(__c.createMap(new Object[] {(Object)("value"),_v}));
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvertical(boolean _b) throws Exception{
 //BA.debugLineNum = 64;BA.debugLine="Sub SetVertical(b As Boolean) As VMSlider";
 //BA.debugLineNum = 65;BA.debugLine="SetAttr(CreateMap(\":vertical\": b))";
_setattr(__c.createMap(new Object[] {(Object)(":vertical"),(Object)(_b)}));
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetVIf(vif As Object) As VMSlider";
 //BA.debugLineNum = 93;BA.debugLine="Slider.SetVIf(vif)";
_slider._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 94;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 95;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvmodel(String _k) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetVModel(k As String) As VMSlider";
 //BA.debugLineNum = 108;BA.debugLine="Slider.SetVModel(k)";
_slider._setvmodel /*b4j.example.vmelement*/ (_k);
 //BA.debugLineNum = 109;BA.debugLine="vmodelText = k";
_vmodeltext = _k;
 //BA.debugLineNum = 110;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 111;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmslider  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 97;BA.debugLine="Sub SetVShow(vif As Object) As VMSlider";
 //BA.debugLineNum = 98;BA.debugLine="Slider.SetVShow(vif)";
_slider._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 99;BA.debugLine="Return Me";
if (true) return (b4j.example.vmslider)(this);
 //BA.debugLineNum = 100;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _mmodel = "";
 //BA.debugLineNum = 131;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 132;BA.debugLine="Dim mModel As String = $\"{{ ${vmodelText} }}\"$";
_mmodel = ("{{ "+__c.SmartStringFormatter("",(Object)(_vmodeltext))+" }}");
 //BA.debugLineNum = 133;BA.debugLine="lbl.SetText($\"${labelText}: ${mModel}\"$)";
_lbl._settext /*b4j.example.vmlabel*/ ((""+__c.SmartStringFormatter("",(Object)(_labeltext))+": "+__c.SmartStringFormatter("",(Object)(_mmodel))+""));
 //BA.debugLineNum = 134;BA.debugLine="If labelOnTop Then InputInt.AddClass(\"dontwrap\")";
if (_labelontop) { 
_inputint._addclass /*b4j.example.vmelement*/ ("dontwrap");};
 //BA.debugLineNum = 135;BA.debugLine="lbl.Pop(InputInt)";
_lbl._pop /*String*/ (_inputint);
 //BA.debugLineNum = 136;BA.debugLine="Slider.Pop(InputInt)";
_slider._pop /*String*/ (_inputint);
 //BA.debugLineNum = 137;BA.debugLine="Return InputInt.tostring";
if (true) return _inputint._tostring /*String*/ ();
 //BA.debugLineNum = 138;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
