package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmknob extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmknob", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _knob = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmknob  _initialize(b4j.example.vmknob __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
RDebugUtils.currentLine=159252480;
 //BA.debugLineNum = 159252480;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=159252481;
 //BA.debugLineNum = 159252481;BA.debugLine="BANano.DependsOnAsset(\"jquery.knob.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("jquery.knob.min.js");
RDebugUtils.currentLine=159252482;
 //BA.debugLineNum = 159252482;BA.debugLine="BANano.DependsOnAsset(\"tron-knob.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("tron-knob.js");
RDebugUtils.currentLine=159252484;
 //BA.debugLineNum = 159252484;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=159252485;
 //BA.debugLineNum = 159252485;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=159252486;
 //BA.debugLineNum = 159252486;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=159252487;
 //BA.debugLineNum = 159252487;BA.debugLine="Knob.Initialize(vue, ID).SetTag(\"input\").AddClass";
__ref._knob /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"input")._addclass /*b4j.example.vmelement*/ (null,"knob")._settype /*b4j.example.vmelement*/ (null,"text");
RDebugUtils.currentLine=159252488;
 //BA.debugLineNum = 159252488;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159252489;
 //BA.debugLineNum = 159252489;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _addclass(b4j.example.vmknob __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=160694272;
 //BA.debugLineNum = 160694272;BA.debugLine="Sub AddClass(c As String) As VMKnob";
RDebugUtils.currentLine=160694273;
 //BA.debugLineNum = 160694273;BA.debugLine="Knob.AddClass(c)";
__ref._knob /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=160694274;
 //BA.debugLineNum = 160694274;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160694275;
 //BA.debugLineNum = 160694275;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmknob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
RDebugUtils.currentLine=159186944;
 //BA.debugLineNum = 159186944;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=159186945;
 //BA.debugLineNum = 159186945;BA.debugLine="Public Knob As VMElement";
_knob = new b4j.example.vmelement();
RDebugUtils.currentLine=159186946;
 //BA.debugLineNum = 159186946;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=159186947;
 //BA.debugLineNum = 159186947;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=159186948;
 //BA.debugLineNum = 159186948;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=159186949;
 //BA.debugLineNum = 159186949;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=159186950;
 //BA.debugLineNum = 159186950;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmknob __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=160956416;
 //BA.debugLineNum = 160956416;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=160956417;
 //BA.debugLineNum = 160956417;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=160956418;
 //BA.debugLineNum = 160956418;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmknob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=160366592;
 //BA.debugLineNum = 160366592;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=160366593;
 //BA.debugLineNum = 160366593;BA.debugLine="Return Knob.tostring";
if (true) return __ref._knob /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=160366594;
 //BA.debugLineNum = 160366594;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmknob __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=160890880;
 //BA.debugLineNum = 160890880;BA.debugLine="Sub Render";
RDebugUtils.currentLine=160890881;
 //BA.debugLineNum = 160890881;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=160890882;
 //BA.debugLineNum = 160890882;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmknob  _setanglearc(b4j.example.vmknob __ref,String _stepvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setanglearc", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setanglearc", new Object[] {_stepvalue}));}
RDebugUtils.currentLine=159645696;
 //BA.debugLineNum = 159645696;BA.debugLine="Sub SetAngleArc(stepvalue As String) As VMKnob";
RDebugUtils.currentLine=159645697;
 //BA.debugLineNum = 159645697;BA.debugLine="Knob.SetAttr(CreateMap(\"data-angleArc\": stepvalue";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-angleArc"),(Object)(_stepvalue)}));
RDebugUtils.currentLine=159645698;
 //BA.debugLineNum = 159645698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159645699;
 //BA.debugLineNum = 159645699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setangleoffset(b4j.example.vmknob __ref,String _stepvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setangleoffset", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setangleoffset", new Object[] {_stepvalue}));}
RDebugUtils.currentLine=159580160;
 //BA.debugLineNum = 159580160;BA.debugLine="Sub SetAngleOffset(stepvalue As String) As VMKnob";
RDebugUtils.currentLine=159580161;
 //BA.debugLineNum = 159580161;BA.debugLine="Knob.SetAttr(CreateMap(\"data-angleOffset\": stepva";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-angleOffset"),(Object)(_stepvalue)}));
RDebugUtils.currentLine=159580162;
 //BA.debugLineNum = 159580162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159580163;
 //BA.debugLineNum = 159580163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setattr(b4j.example.vmknob __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=160759808;
 //BA.debugLineNum = 160759808;BA.debugLine="Sub SetAttr(attr As Map) As VMKnob";
RDebugUtils.currentLine=160759809;
 //BA.debugLineNum = 160759809;BA.debugLine="Knob.SetAttr(attr)";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=160759810;
 //BA.debugLineNum = 160759810;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160759811;
 //BA.debugLineNum = 160759811;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setdisabled(b4j.example.vmknob __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=160825344;
 //BA.debugLineNum = 160825344;BA.debugLine="Sub SetDisabled(b As Boolean) As VMKnob";
RDebugUtils.currentLine=160825345;
 //BA.debugLineNum = 160825345;BA.debugLine="Knob.SetDisabled(b)";
__ref._knob /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=160825346;
 //BA.debugLineNum = 160825346;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160825347;
 //BA.debugLineNum = 160825347;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setfgcolor(b4j.example.vmknob __ref,String _stepvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setfgcolor", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setfgcolor", new Object[] {_stepvalue}));}
RDebugUtils.currentLine=159907840;
 //BA.debugLineNum = 159907840;BA.debugLine="Sub SetFgColor(stepvalue As String) As VMKnob";
RDebugUtils.currentLine=159907841;
 //BA.debugLineNum = 159907841;BA.debugLine="Knob.SetAttr(CreateMap(\"data-fgColor\": stepvalue)";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-fgColor"),(Object)(_stepvalue)}));
RDebugUtils.currentLine=159907842;
 //BA.debugLineNum = 159907842;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159907843;
 //BA.debugLineNum = 159907843;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setheight(b4j.example.vmknob __ref,String _skin) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setheight", new Object[] {_skin}));}
RDebugUtils.currentLine=160235520;
 //BA.debugLineNum = 160235520;BA.debugLine="Sub SetHeight(skin As String) As VMKnob";
RDebugUtils.currentLine=160235521;
 //BA.debugLineNum = 160235521;BA.debugLine="Knob.SetAttr(CreateMap(\"data-height\": skin))";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-height"),(Object)(_skin)}));
RDebugUtils.currentLine=160235522;
 //BA.debugLineNum = 160235522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160235523;
 //BA.debugLineNum = 160235523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setkey(b4j.example.vmknob __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=160563200;
 //BA.debugLineNum = 160563200;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMKnob";
RDebugUtils.currentLine=160563201;
 //BA.debugLineNum = 160563201;BA.debugLine="Knob.SetKey(k, bind)";
__ref._knob /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=160563202;
 //BA.debugLineNum = 160563202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160563203;
 //BA.debugLineNum = 160563203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setmax(b4j.example.vmknob __ref,String _minvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setmax", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setmax", new Object[] {_minvalue}));}
RDebugUtils.currentLine=160301056;
 //BA.debugLineNum = 160301056;BA.debugLine="Sub SetMax(minvalue As String) As VMKnob";
RDebugUtils.currentLine=160301057;
 //BA.debugLineNum = 160301057;BA.debugLine="Knob.SetAttr(CreateMap(\"data-max\": minvalue))";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-max"),(Object)(_minvalue)}));
RDebugUtils.currentLine=160301058;
 //BA.debugLineNum = 160301058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160301059;
 //BA.debugLineNum = 160301059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setmin(b4j.example.vmknob __ref,String _minvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setmin", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setmin", new Object[] {_minvalue}));}
RDebugUtils.currentLine=159449088;
 //BA.debugLineNum = 159449088;BA.debugLine="Sub SetMin(minvalue As String) As VMKnob";
RDebugUtils.currentLine=159449089;
 //BA.debugLineNum = 159449089;BA.debugLine="Knob.SetAttr(CreateMap(\"data-min\": minvalue))";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-min"),(Object)(_minvalue)}));
RDebugUtils.currentLine=159449090;
 //BA.debugLineNum = 159449090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159449091;
 //BA.debugLineNum = 159449091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setname(b4j.example.vmknob __ref,String _name,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setname", new Object[] {_name,_bind}));}
RDebugUtils.currentLine=159318016;
 //BA.debugLineNum = 159318016;BA.debugLine="Sub SetName(name As String, bind As Boolean) As VM";
RDebugUtils.currentLine=159318017;
 //BA.debugLineNum = 159318017;BA.debugLine="Knob.SetName(name, bind)";
__ref._knob /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,_name,_bind);
RDebugUtils.currentLine=159318018;
 //BA.debugLineNum = 159318018;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159318019;
 //BA.debugLineNum = 159318019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setreadonly(b4j.example.vmknob __ref,boolean _stepvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setreadonly", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setreadonly", new Object[] {_stepvalue}));}
RDebugUtils.currentLine=159776768;
 //BA.debugLineNum = 159776768;BA.debugLine="Sub SetReadOnly(stepvalue As Boolean) As VMKnob";
RDebugUtils.currentLine=159776769;
 //BA.debugLineNum = 159776769;BA.debugLine="Knob.SetAttr(CreateMap(\"data-readOnly\": stepvalue";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-readOnly"),(Object)(_stepvalue)}));
RDebugUtils.currentLine=159776770;
 //BA.debugLineNum = 159776770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159776771;
 //BA.debugLineNum = 159776771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setrotation(b4j.example.vmknob __ref,String _stepvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setrotation", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setrotation", new Object[] {_stepvalue}));}
RDebugUtils.currentLine=159842304;
 //BA.debugLineNum = 159842304;BA.debugLine="Sub SetRotation(stepvalue As String) As VMKnob";
RDebugUtils.currentLine=159842305;
 //BA.debugLineNum = 159842305;BA.debugLine="Knob.SetAttr(CreateMap(\"data-rotation\": stepvalue";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-rotation"),(Object)(_stepvalue)}));
RDebugUtils.currentLine=159842306;
 //BA.debugLineNum = 159842306;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159842307;
 //BA.debugLineNum = 159842307;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setroundedcorners(b4j.example.vmknob __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setroundedcorners", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setroundedcorners", new Object[] {_b}));}
RDebugUtils.currentLine=160104448;
 //BA.debugLineNum = 160104448;BA.debugLine="Sub SetRoundedCorners(b As Boolean) As VMKnob";
RDebugUtils.currentLine=160104449;
 //BA.debugLineNum = 160104449;BA.debugLine="If b = False Then Return Me";
if (_b==__c.False) { 
if (true) return (b4j.example.vmknob)(this);};
RDebugUtils.currentLine=160104450;
 //BA.debugLineNum = 160104450;BA.debugLine="Knob.SetAttr(CreateMap(\"data-linecap\":\"round\"))";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-linecap"),(Object)("round")}));
RDebugUtils.currentLine=160104451;
 //BA.debugLineNum = 160104451;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160104452;
 //BA.debugLineNum = 160104452;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setskin(b4j.example.vmknob __ref,String _skin) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setskin", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setskin", new Object[] {_skin}));}
RDebugUtils.currentLine=159973376;
 //BA.debugLineNum = 159973376;BA.debugLine="Sub SetSkin(skin As String) As VMKnob";
RDebugUtils.currentLine=159973377;
 //BA.debugLineNum = 159973377;BA.debugLine="Knob.SetAttr(CreateMap(\"data-skin\": skin))";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-skin"),(Object)(_skin)}));
RDebugUtils.currentLine=159973378;
 //BA.debugLineNum = 159973378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159973379;
 //BA.debugLineNum = 159973379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setstep(b4j.example.vmknob __ref,String _stepvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setstep", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setstep", new Object[] {_stepvalue}));}
RDebugUtils.currentLine=159514624;
 //BA.debugLineNum = 159514624;BA.debugLine="Sub SetStep(stepvalue As String) As VMKnob";
RDebugUtils.currentLine=159514625;
 //BA.debugLineNum = 159514625;BA.debugLine="Knob.SetAttr(CreateMap(\"data-step\": stepvalue))";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-step"),(Object)(_stepvalue)}));
RDebugUtils.currentLine=159514626;
 //BA.debugLineNum = 159514626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159514627;
 //BA.debugLineNum = 159514627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setstopper(b4j.example.vmknob __ref,String _stepvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setstopper", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setstopper", new Object[] {_stepvalue}));}
RDebugUtils.currentLine=159711232;
 //BA.debugLineNum = 159711232;BA.debugLine="Sub SetStopper(stepvalue As String) As VMKnob";
RDebugUtils.currentLine=159711233;
 //BA.debugLineNum = 159711233;BA.debugLine="Knob.SetAttr(CreateMap(\"data-stopper\": stepvalue)";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-stopper"),(Object)(_stepvalue)}));
RDebugUtils.currentLine=159711234;
 //BA.debugLineNum = 159711234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159711235;
 //BA.debugLineNum = 159711235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setstyle(b4j.example.vmknob __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=160432128;
 //BA.debugLineNum = 160432128;BA.debugLine="Sub SetStyle(sm As Map) As VMKnob";
RDebugUtils.currentLine=160432129;
 //BA.debugLineNum = 160432129;BA.debugLine="Knob.SetStyle(sm)";
__ref._knob /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=160432130;
 //BA.debugLineNum = 160432130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160432131;
 //BA.debugLineNum = 160432131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setthickness(b4j.example.vmknob __ref,double _thickness) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setthickness", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setthickness", new Object[] {_thickness}));}
RDebugUtils.currentLine=160038912;
 //BA.debugLineNum = 160038912;BA.debugLine="Sub SetThickness(thickness As Double) As VMKnob";
RDebugUtils.currentLine=160038913;
 //BA.debugLineNum = 160038913;BA.debugLine="Knob.SetAttr(CreateMap(\"data-thickness\": thicknes";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-thickness"),(Object)(_thickness)}));
RDebugUtils.currentLine=160038914;
 //BA.debugLineNum = 160038914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160038915;
 //BA.debugLineNum = 160038915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setvif(b4j.example.vmknob __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=160497664;
 //BA.debugLineNum = 160497664;BA.debugLine="Sub SetVIf(vif As Object) As VMKnob";
RDebugUtils.currentLine=160497665;
 //BA.debugLineNum = 160497665;BA.debugLine="Knob.SetVIf(vif)";
__ref._knob /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=160497666;
 //BA.debugLineNum = 160497666;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160497667;
 //BA.debugLineNum = 160497667;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setvmodel(b4j.example.vmknob __ref,String _vmodel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setvmodel", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setvmodel", new Object[] {_vmodel}));}
RDebugUtils.currentLine=159383552;
 //BA.debugLineNum = 159383552;BA.debugLine="Sub SetVModel(vmodel As String) As VMKnob";
RDebugUtils.currentLine=159383553;
 //BA.debugLineNum = 159383553;BA.debugLine="Knob.SetVModel(vmodel)";
__ref._knob /*b4j.example.vmelement*/ ._setvmodel /*b4j.example.vmelement*/ (null,_vmodel);
RDebugUtils.currentLine=159383554;
 //BA.debugLineNum = 159383554;BA.debugLine="Knob.SetValue(vmodel, True)";
__ref._knob /*b4j.example.vmelement*/ ._setvalue /*b4j.example.vmelement*/ (null,_vmodel,__c.True);
RDebugUtils.currentLine=159383555;
 //BA.debugLineNum = 159383555;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=159383556;
 //BA.debugLineNum = 159383556;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setvshow(b4j.example.vmknob __ref,Object _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=160628736;
 //BA.debugLineNum = 160628736;BA.debugLine="Sub SetVShow(vif As Object) As VMKnob";
RDebugUtils.currentLine=160628737;
 //BA.debugLineNum = 160628737;BA.debugLine="Knob.SetVShow(vif)";
__ref._knob /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,BA.ObjectToString(_vif));
RDebugUtils.currentLine=160628738;
 //BA.debugLineNum = 160628738;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160628739;
 //BA.debugLineNum = 160628739;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmknob  _setwidth(b4j.example.vmknob __ref,String _skin) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmknob";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmknob) Debug.delegate(ba, "setwidth", new Object[] {_skin}));}
RDebugUtils.currentLine=160169984;
 //BA.debugLineNum = 160169984;BA.debugLine="Sub SetWidth(skin As String) As VMKnob";
RDebugUtils.currentLine=160169985;
 //BA.debugLineNum = 160169985;BA.debugLine="Knob.SetAttr(CreateMap(\"data-width\": skin))";
__ref._knob /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("data-width"),(Object)(_skin)}));
RDebugUtils.currentLine=160169986;
 //BA.debugLineNum = 160169986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmknob)(this);
RDebugUtils.currentLine=160169987;
 //BA.debugLineNum = 160169987;BA.debugLine="End Sub";
return null;
}
}