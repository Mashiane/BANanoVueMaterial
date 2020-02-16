package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmknob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmknob", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmknob.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _knob = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
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
public b4j.example.vmknob  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 142;BA.debugLine="Sub AddClass(c As String) As VMKnob";
 //BA.debugLineNum = 143;BA.debugLine="Knob.AddClass(c)";
_knob._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 144;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 145;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Knob As VMElement";
_knob = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmknob  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 11;BA.debugLine="BANano.DependsOnAsset(\"jquery.knob.min.js\")";
_banano.DependsOnAsset("jquery.knob.min.js");
 //BA.debugLineNum = 12;BA.debugLine="BANano.DependsOnAsset(\"tron-knob.js\")";
_banano.DependsOnAsset("tron-knob.js");
 //BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 15;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 17;BA.debugLine="Knob.Initialize(vue, ID).SetTag(\"input\").AddClass";
_knob._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("input")._addclass /*b4j.example.vmelement*/ ("knob")._settype /*b4j.example.vmelement*/ ("text");
 //BA.debugLineNum = 18;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 19;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 162;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 163;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 164;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 158;BA.debugLine="Sub Render";
 //BA.debugLineNum = 159;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 160;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmknob  _setanglearc(String _stepvalue) throws Exception{
 //BA.debugLineNum = 50;BA.debugLine="Sub SetAngleArc(stepvalue As String) As VMKnob";
 //BA.debugLineNum = 51;BA.debugLine="Knob.SetAttr(CreateMap(\"data-angleArc\": stepvalue";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-angleArc"),(Object)(_stepvalue)}));
 //BA.debugLineNum = 52;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 53;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setangleoffset(String _stepvalue) throws Exception{
 //BA.debugLineNum = 44;BA.debugLine="Sub SetAngleOffset(stepvalue As String) As VMKnob";
 //BA.debugLineNum = 45;BA.debugLine="Knob.SetAttr(CreateMap(\"data-angleOffset\": stepva";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-angleOffset"),(Object)(_stepvalue)}));
 //BA.debugLineNum = 46;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 47;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 148;BA.debugLine="Sub SetAttr(attr As Map) As VMKnob";
 //BA.debugLineNum = 149;BA.debugLine="Knob.SetAttr(attr)";
_knob._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 150;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 151;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 153;BA.debugLine="Sub SetDisabled(b As Boolean) As VMKnob";
 //BA.debugLineNum = 154;BA.debugLine="Knob.SetDisabled(b)";
_knob._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 155;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 156;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setfgcolor(String _stepvalue) throws Exception{
 //BA.debugLineNum = 74;BA.debugLine="Sub SetFgColor(stepvalue As String) As VMKnob";
 //BA.debugLineNum = 75;BA.debugLine="Knob.SetAttr(CreateMap(\"data-fgColor\": stepvalue)";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-fgColor"),(Object)(_stepvalue)}));
 //BA.debugLineNum = 76;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 77;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setheight(String _skin) throws Exception{
 //BA.debugLineNum = 105;BA.debugLine="Sub SetHeight(skin As String) As VMKnob";
 //BA.debugLineNum = 106;BA.debugLine="Knob.SetAttr(CreateMap(\"data-height\": skin))";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-height"),(Object)(_skin)}));
 //BA.debugLineNum = 107;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 108;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMKnob";
 //BA.debugLineNum = 132;BA.debugLine="Knob.SetKey(k, bind)";
_knob._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setmax(String _minvalue) throws Exception{
 //BA.debugLineNum = 111;BA.debugLine="Sub SetMax(minvalue As String) As VMKnob";
 //BA.debugLineNum = 112;BA.debugLine="Knob.SetAttr(CreateMap(\"data-max\": minvalue))";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-max"),(Object)(_minvalue)}));
 //BA.debugLineNum = 113;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setmin(String _minvalue) throws Exception{
 //BA.debugLineNum = 32;BA.debugLine="Sub SetMin(minvalue As String) As VMKnob";
 //BA.debugLineNum = 33;BA.debugLine="Knob.SetAttr(CreateMap(\"data-min\": minvalue))";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-min"),(Object)(_minvalue)}));
 //BA.debugLineNum = 34;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 35;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setname(String _name,boolean _bind) throws Exception{
 //BA.debugLineNum = 21;BA.debugLine="Sub SetName(name As String, bind As Boolean) As VM";
 //BA.debugLineNum = 22;BA.debugLine="Knob.SetName(name, bind)";
_knob._setname /*b4j.example.vmelement*/ (_name,_bind);
 //BA.debugLineNum = 23;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setreadonly(boolean _stepvalue) throws Exception{
 //BA.debugLineNum = 62;BA.debugLine="Sub SetReadOnly(stepvalue As Boolean) As VMKnob";
 //BA.debugLineNum = 63;BA.debugLine="Knob.SetAttr(CreateMap(\"data-readOnly\": stepvalue";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-readOnly"),(Object)(_stepvalue)}));
 //BA.debugLineNum = 64;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 65;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setrotation(String _stepvalue) throws Exception{
 //BA.debugLineNum = 68;BA.debugLine="Sub SetRotation(stepvalue As String) As VMKnob";
 //BA.debugLineNum = 69;BA.debugLine="Knob.SetAttr(CreateMap(\"data-rotation\": stepvalue";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-rotation"),(Object)(_stepvalue)}));
 //BA.debugLineNum = 70;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 71;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setroundedcorners(boolean _b) throws Exception{
 //BA.debugLineNum = 92;BA.debugLine="Sub SetRoundedCorners(b As Boolean) As VMKnob";
 //BA.debugLineNum = 93;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmknob)(this);};
 //BA.debugLineNum = 94;BA.debugLine="Knob.SetAttr(CreateMap(\"data-linecap\":\"round\"))";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-linecap"),(Object)("round")}));
 //BA.debugLineNum = 95;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 96;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setskin(String _skin) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetSkin(skin As String) As VMKnob";
 //BA.debugLineNum = 81;BA.debugLine="Knob.SetAttr(CreateMap(\"data-skin\": skin))";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-skin"),(Object)(_skin)}));
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setstep(String _stepvalue) throws Exception{
 //BA.debugLineNum = 38;BA.debugLine="Sub SetStep(stepvalue As String) As VMKnob";
 //BA.debugLineNum = 39;BA.debugLine="Knob.SetAttr(CreateMap(\"data-step\": stepvalue))";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-step"),(Object)(_stepvalue)}));
 //BA.debugLineNum = 40;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 41;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setstopper(String _stepvalue) throws Exception{
 //BA.debugLineNum = 56;BA.debugLine="Sub SetStopper(stepvalue As String) As VMKnob";
 //BA.debugLineNum = 57;BA.debugLine="Knob.SetAttr(CreateMap(\"data-stopper\": stepvalue)";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-stopper"),(Object)(_stepvalue)}));
 //BA.debugLineNum = 58;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 59;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 121;BA.debugLine="Sub SetStyle(sm As Map) As VMKnob";
 //BA.debugLineNum = 122;BA.debugLine="Knob.SetStyle(sm)";
_knob._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 123;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 124;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setthickness(double _thickness) throws Exception{
 //BA.debugLineNum = 86;BA.debugLine="Sub SetThickness(thickness As Double) As VMKnob";
 //BA.debugLineNum = 87;BA.debugLine="Knob.SetAttr(CreateMap(\"data-thickness\": thicknes";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-thickness"),(Object)(_thickness)}));
 //BA.debugLineNum = 88;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 89;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setvif(Object _vif) throws Exception{
 //BA.debugLineNum = 126;BA.debugLine="Sub SetVIf(vif As Object) As VMKnob";
 //BA.debugLineNum = 127;BA.debugLine="Knob.SetVIf(vif)";
_knob._setvif /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 128;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 129;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setvmodel(String _vmodel) throws Exception{
 //BA.debugLineNum = 26;BA.debugLine="Sub SetVModel(vmodel As String) As VMKnob";
 //BA.debugLineNum = 27;BA.debugLine="Knob.SetVModel(vmodel)";
_knob._setvmodel /*b4j.example.vmelement*/ (_vmodel);
 //BA.debugLineNum = 28;BA.debugLine="Knob.SetValue(vmodel, True)";
_knob._setvalue /*b4j.example.vmelement*/ (_vmodel,__c.True);
 //BA.debugLineNum = 29;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setvshow(Object _vif) throws Exception{
 //BA.debugLineNum = 136;BA.debugLine="Sub SetVShow(vif As Object) As VMKnob";
 //BA.debugLineNum = 137;BA.debugLine="Knob.SetVShow(vif)";
_knob._setvshow /*b4j.example.vmelement*/ (BA.ObjectToString(_vif));
 //BA.debugLineNum = 138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setwidth(String _skin) throws Exception{
 //BA.debugLineNum = 99;BA.debugLine="Sub SetWidth(skin As String) As VMKnob";
 //BA.debugLineNum = 100;BA.debugLine="Knob.SetAttr(CreateMap(\"data-width\": skin))";
_knob._setattr /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("data-width"),(Object)(_skin)}));
 //BA.debugLineNum = 101;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
 //BA.debugLineNum = 102;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 117;BA.debugLine="Return Knob.tostring";
if (true) return _knob._tostring /*String*/ ();
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
