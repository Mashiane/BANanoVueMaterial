package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmwaterball extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmwaterball", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmwaterball.class).invoke(this, new Object[] {null});
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
public b4j.example.vmelement _waterball = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public boolean _isloading = false;
public int _vnowrange = 0;
public int _vtargetrange = 0;
public int _range1 = 0;
public int _range2 = 0;
public int _range3 = 0;
public double _wwidth = 0;
public int _wheight = 0;
public com.ab.banano.BANanoObject _jq = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmwaterball  _initialize(b4j.example.vmwaterball __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler,String _width,String _height) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler,_width,_height}));}
RDebugUtils.currentLine=232849408;
 //BA.debugLineNum = 232849408;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=232849409;
 //BA.debugLineNum = 232849409;BA.debugLine="BANano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("jquery-3.4.1.min.js");
RDebugUtils.currentLine=232849410;
 //BA.debugLineNum = 232849410;BA.debugLine="BANano.DependsOnAsset(\"createWaterBall-jquery.js\"";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("createWaterBall-jquery.js");
RDebugUtils.currentLine=232849411;
 //BA.debugLineNum = 232849411;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=232849412;
 //BA.debugLineNum = 232849412;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=232849413;
 //BA.debugLineNum = 232849413;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=232849414;
 //BA.debugLineNum = 232849414;BA.debugLine="JQ = vue.jquery";
__ref._jq /*com.ab.banano.BANanoObject*/  = __ref._vue /*b4j.example.bananovue*/ ._jquery /*com.ab.banano.BANanoObject*/ ;
RDebugUtils.currentLine=232849415;
 //BA.debugLineNum = 232849415;BA.debugLine="WaterBall.Initialize(vue, ID).SetTag(\"div\")";
__ref._waterball /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=232849416;
 //BA.debugLineNum = 232849416;BA.debugLine="range1 = 50";
__ref._range1 /*int*/  = (int) (50);
RDebugUtils.currentLine=232849417;
 //BA.debugLineNum = 232849417;BA.debugLine="range2 = 80";
__ref._range2 /*int*/  = (int) (80);
RDebugUtils.currentLine=232849418;
 //BA.debugLineNum = 232849418;BA.debugLine="range3 = 100";
__ref._range3 /*int*/  = (int) (100);
RDebugUtils.currentLine=232849419;
 //BA.debugLineNum = 232849419;BA.debugLine="wWidth = 0.02";
__ref._wwidth /*double*/  = 0.02;
RDebugUtils.currentLine=232849420;
 //BA.debugLineNum = 232849420;BA.debugLine="wHeight = 5";
__ref._wheight /*int*/  = (int) (5);
RDebugUtils.currentLine=232849421;
 //BA.debugLineNum = 232849421;BA.debugLine="WaterBall.AddClass(ID)";
__ref._waterball /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,__ref._id /*String*/ );
RDebugUtils.currentLine=232849422;
 //BA.debugLineNum = 232849422;BA.debugLine="Width = WaterBall.MakePx(Width)";
_width = __ref._waterball /*b4j.example.vmelement*/ ._makepx /*String*/ (null,_width);
RDebugUtils.currentLine=232849423;
 //BA.debugLineNum = 232849423;BA.debugLine="Height = WaterBall.MakePx(Height)";
_height = __ref._waterball /*b4j.example.vmelement*/ ._makepx /*String*/ (null,_height);
RDebugUtils.currentLine=232849424;
 //BA.debugLineNum = 232849424;BA.debugLine="WaterBall.SetWidth(Width).SetHeight(Height)";
__ref._waterball /*b4j.example.vmelement*/ ._setwidth /*b4j.example.vmelement*/ (null,_width)._setheight /*b4j.example.vmelement*/ (null,_height);
RDebugUtils.currentLine=232849425;
 //BA.debugLineNum = 232849425;BA.debugLine="isLoading = False";
__ref._isloading /*boolean*/  = __c.False;
RDebugUtils.currentLine=232849426;
 //BA.debugLineNum = 232849426;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=232849427;
 //BA.debugLineNum = 232849427;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _addclass(b4j.example.vmwaterball __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=233439232;
 //BA.debugLineNum = 233439232;BA.debugLine="Sub AddClass(c As String) As VMWaterBall";
RDebugUtils.currentLine=233439233;
 //BA.debugLineNum = 233439233;BA.debugLine="WaterBall.AddClass(c)";
__ref._waterball /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=233439234;
 //BA.debugLineNum = 233439234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=233439235;
 //BA.debugLineNum = 233439235;BA.debugLine="End Sub";
return null;
}
public String  _class_globals(b4j.example.vmwaterball __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
RDebugUtils.currentLine=232652800;
 //BA.debugLineNum = 232652800;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=232652801;
 //BA.debugLineNum = 232652801;BA.debugLine="Public WaterBall As VMElement";
_waterball = new b4j.example.vmelement();
RDebugUtils.currentLine=232652802;
 //BA.debugLineNum = 232652802;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=232652803;
 //BA.debugLineNum = 232652803;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=232652804;
 //BA.debugLineNum = 232652804;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=232652805;
 //BA.debugLineNum = 232652805;BA.debugLine="Public isLoading As Boolean";
_isloading = false;
RDebugUtils.currentLine=232652806;
 //BA.debugLineNum = 232652806;BA.debugLine="Private vnowRange As Int ' the value now";
_vnowrange = 0;
RDebugUtils.currentLine=232652807;
 //BA.debugLineNum = 232652807;BA.debugLine="Private vtargetRange As Int ' the target value to";
_vtargetrange = 0;
RDebugUtils.currentLine=232652808;
 //BA.debugLineNum = 232652808;BA.debugLine="Private range1 As Int";
_range1 = 0;
RDebugUtils.currentLine=232652809;
 //BA.debugLineNum = 232652809;BA.debugLine="Private range2 As Int";
_range2 = 0;
RDebugUtils.currentLine=232652810;
 //BA.debugLineNum = 232652810;BA.debugLine="Private range3 As Int";
_range3 = 0;
RDebugUtils.currentLine=232652811;
 //BA.debugLineNum = 232652811;BA.debugLine="Private wWidth As Double";
_wwidth = 0;
RDebugUtils.currentLine=232652812;
 //BA.debugLineNum = 232652812;BA.debugLine="Private wHeight As Int";
_wheight = 0;
RDebugUtils.currentLine=232652813;
 //BA.debugLineNum = 232652813;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=232652814;
 //BA.debugLineNum = 232652814;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=232652815;
 //BA.debugLineNum = 232652815;BA.debugLine="End Sub";
return "";
}
public String  _pop(b4j.example.vmwaterball __ref,b4j.example.vmelement _px) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_px}));}
RDebugUtils.currentLine=233701376;
 //BA.debugLineNum = 233701376;BA.debugLine="Sub Pop(px As VMElement)";
RDebugUtils.currentLine=233701377;
 //BA.debugLineNum = 233701377;BA.debugLine="px.SetText(ToString)";
_px._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=233701378;
 //BA.debugLineNum = 233701378;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmwaterball __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=233570304;
 //BA.debugLineNum = 233570304;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=233570305;
 //BA.debugLineNum = 233570305;BA.debugLine="Return WaterBall.tostring";
if (true) return __ref._waterball /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=233570306;
 //BA.debugLineNum = 233570306;BA.debugLine="End Sub";
return "";
}
public String  _refresh(b4j.example.vmwaterball __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((String) Debug.delegate(ba, "refresh", null));}
anywheresoftware.b4a.objects.collections.Map _options = null;
com.ab.banano.BANanoObject _loadingele = null;
int _loading_width = 0;
int _loading_height = 0;
anywheresoftware.b4a.objects.collections.List _data_range = null;
anywheresoftware.b4a.objects.collections.Map _cvs_config = null;
anywheresoftware.b4a.objects.collections.Map _wave_config = null;
RDebugUtils.currentLine=233766912;
 //BA.debugLineNum = 233766912;BA.debugLine="Sub Refresh";
RDebugUtils.currentLine=233766914;
 //BA.debugLineNum = 233766914;BA.debugLine="Dim options As Map = CreateMap()";
_options = new anywheresoftware.b4a.objects.collections.Map();
_options = __c.createMap(new Object[] {});
RDebugUtils.currentLine=233766915;
 //BA.debugLineNum = 233766915;BA.debugLine="Dim loadingEle As BANanoObject = JQ.Selector($\"#$";
_loadingele = new com.ab.banano.BANanoObject();
_loadingele = __ref._jq /*com.ab.banano.BANanoObject*/ .Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"")));
RDebugUtils.currentLine=233766916;
 //BA.debugLineNum = 233766916;BA.debugLine="Dim loading_width As Int = loadingEle.RunMethod(\"";
_loading_width = (int)(BA.ObjectToNumber(_loadingele.RunMethod("width",__c.Null).Result()));
RDebugUtils.currentLine=233766917;
 //BA.debugLineNum = 233766917;BA.debugLine="Dim loading_height As Int = loadingEle.RunMethod(";
_loading_height = (int)(BA.ObjectToNumber(_loadingele.RunMethod("height",__c.Null).Result()));
RDebugUtils.currentLine=233766918;
 //BA.debugLineNum = 233766918;BA.debugLine="Dim data_range As List";
_data_range = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=233766919;
 //BA.debugLineNum = 233766919;BA.debugLine="data_range.Initialize";
_data_range.Initialize();
RDebugUtils.currentLine=233766920;
 //BA.debugLineNum = 233766920;BA.debugLine="data_range.Add(range1)";
_data_range.Add((Object)(__ref._range1 /*int*/ ));
RDebugUtils.currentLine=233766921;
 //BA.debugLineNum = 233766921;BA.debugLine="data_range.Add(range2)";
_data_range.Add((Object)(__ref._range2 /*int*/ ));
RDebugUtils.currentLine=233766922;
 //BA.debugLineNum = 233766922;BA.debugLine="data_range.Add(range3)";
_data_range.Add((Object)(__ref._range3 /*int*/ ));
RDebugUtils.currentLine=233766924;
 //BA.debugLineNum = 233766924;BA.debugLine="Dim cvs_config As Map = CreateMap()";
_cvs_config = new anywheresoftware.b4a.objects.collections.Map();
_cvs_config = __c.createMap(new Object[] {});
RDebugUtils.currentLine=233766925;
 //BA.debugLineNum = 233766925;BA.debugLine="cvs_config.Put(\"width\", loading_width)";
_cvs_config.Put((Object)("width"),(Object)(_loading_width));
RDebugUtils.currentLine=233766926;
 //BA.debugLineNum = 233766926;BA.debugLine="cvs_config.Put(\"height\", loading_height)";
_cvs_config.Put((Object)("height"),(Object)(_loading_height));
RDebugUtils.currentLine=233766928;
 //BA.debugLineNum = 233766928;BA.debugLine="Dim wave_config As Map = CreateMap()";
_wave_config = new anywheresoftware.b4a.objects.collections.Map();
_wave_config = __c.createMap(new Object[] {});
RDebugUtils.currentLine=233766929;
 //BA.debugLineNum = 233766929;BA.debugLine="wave_config.Put(\"waveWidth\", wWidth)";
_wave_config.Put((Object)("waveWidth"),(Object)(__ref._wwidth /*double*/ ));
RDebugUtils.currentLine=233766930;
 //BA.debugLineNum = 233766930;BA.debugLine="wave_config.Put(\"waveHeight\", wHeight)";
_wave_config.Put((Object)("waveHeight"),(Object)(__ref._wheight /*int*/ ));
RDebugUtils.currentLine=233766932;
 //BA.debugLineNum = 233766932;BA.debugLine="options.Put(\"cvs_config\", cvs_config)";
_options.Put((Object)("cvs_config"),(Object)(_cvs_config.getObject()));
RDebugUtils.currentLine=233766933;
 //BA.debugLineNum = 233766933;BA.debugLine="options.Put(\"wave_config\", wave_config)";
_options.Put((Object)("wave_config"),(Object)(_wave_config.getObject()));
RDebugUtils.currentLine=233766934;
 //BA.debugLineNum = 233766934;BA.debugLine="options.Put(\"data_range\", data_range)";
_options.Put((Object)("data_range"),(Object)(_data_range.getObject()));
RDebugUtils.currentLine=233766935;
 //BA.debugLineNum = 233766935;BA.debugLine="options.Put(\"isLoading\", isLoading)";
_options.Put((Object)("isLoading"),(Object)(__ref._isloading /*boolean*/ ));
RDebugUtils.currentLine=233766936;
 //BA.debugLineNum = 233766936;BA.debugLine="options.Put(\"nowRange\", vnowRange)";
_options.Put((Object)("nowRange"),(Object)(__ref._vnowrange /*int*/ ));
RDebugUtils.currentLine=233766937;
 //BA.debugLineNum = 233766937;BA.debugLine="options.Put(\"targetRange\", vtargetRange)";
_options.Put((Object)("targetRange"),(Object)(__ref._vtargetrange /*int*/ ));
RDebugUtils.currentLine=233766938;
 //BA.debugLineNum = 233766938;BA.debugLine="options.Put(\"lineWidth\", 2)";
_options.Put((Object)("lineWidth"),(Object)(2));
RDebugUtils.currentLine=233766940;
 //BA.debugLineNum = 233766940;BA.debugLine="loadingEle.RunMethod(\"createWaterBall\", options)";
_loadingele.RunMethod("createWaterBall",(Object)(_options.getObject()));
RDebugUtils.currentLine=233766941;
 //BA.debugLineNum = 233766941;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmwaterball __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=233635840;
 //BA.debugLineNum = 233635840;BA.debugLine="Sub Render";
RDebugUtils.currentLine=233635841;
 //BA.debugLineNum = 233635841;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=233635842;
 //BA.debugLineNum = 233635842;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwaterball  _setattr(b4j.example.vmwaterball __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=233504768;
 //BA.debugLineNum = 233504768;BA.debugLine="Sub SetAttr(attr As Map) As VMWaterBall";
RDebugUtils.currentLine=233504769;
 //BA.debugLineNum = 233504769;BA.debugLine="WaterBall.SetAttr(attr)";
__ref._waterball /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=233504770;
 //BA.debugLineNum = 233504770;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=233504771;
 //BA.debugLineNum = 233504771;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setdisabled(b4j.example.vmwaterball __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=232914944;
 //BA.debugLineNum = 232914944;BA.debugLine="Sub SetDisabled(b As Boolean) As VMWaterBall";
RDebugUtils.currentLine=232914945;
 //BA.debugLineNum = 232914945;BA.debugLine="WaterBall.SetDisabled(b)";
__ref._waterball /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=232914946;
 //BA.debugLineNum = 232914946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=232914947;
 //BA.debugLineNum = 232914947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setid(b4j.example.vmwaterball __ref,String _iid,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "setid", new Object[] {_iid,_bind}));}
RDebugUtils.currentLine=233177088;
 //BA.debugLineNum = 233177088;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMWat";
RDebugUtils.currentLine=233177089;
 //BA.debugLineNum = 233177089;BA.debugLine="WaterBall.SetID(iID,bind)";
__ref._waterball /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_iid,_bind);
RDebugUtils.currentLine=233177090;
 //BA.debugLineNum = 233177090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=233177091;
 //BA.debugLineNum = 233177091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setkey(b4j.example.vmwaterball __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=233308160;
 //BA.debugLineNum = 233308160;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMWate";
RDebugUtils.currentLine=233308161;
 //BA.debugLineNum = 233308161;BA.debugLine="WaterBall.SetKey(k, bind)";
__ref._waterball /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=233308162;
 //BA.debugLineNum = 233308162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=233308163;
 //BA.debugLineNum = 233308163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setname(b4j.example.vmwaterball __ref,String _nam,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "setname", new Object[] {_nam,_bind}));}
RDebugUtils.currentLine=233242624;
 //BA.debugLineNum = 233242624;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMW";
RDebugUtils.currentLine=233242625;
 //BA.debugLineNum = 233242625;BA.debugLine="WaterBall.SetName(nam, bind)";
__ref._waterball /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,_nam,_bind);
RDebugUtils.currentLine=233242626;
 //BA.debugLineNum = 233242626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=233242627;
 //BA.debugLineNum = 233242627;BA.debugLine="End Sub";
return null;
}
public String  _setranges(b4j.example.vmwaterball __ref,int _red,int _orange,int _green) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setranges", true))
	 {return ((String) Debug.delegate(ba, "setranges", new Object[] {_red,_orange,_green}));}
RDebugUtils.currentLine=232718336;
 //BA.debugLineNum = 232718336;BA.debugLine="Sub SetRanges(red As Int, orange As Int, green As";
RDebugUtils.currentLine=232718337;
 //BA.debugLineNum = 232718337;BA.debugLine="range1 = red";
__ref._range1 /*int*/  = _red;
RDebugUtils.currentLine=232718338;
 //BA.debugLineNum = 232718338;BA.debugLine="range2 = orange";
__ref._range2 /*int*/  = _orange;
RDebugUtils.currentLine=232718339;
 //BA.debugLineNum = 232718339;BA.debugLine="range3 = green";
__ref._range3 /*int*/  = _green;
RDebugUtils.currentLine=232718340;
 //BA.debugLineNum = 232718340;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwaterball  _setstyle(b4j.example.vmwaterball __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=233046016;
 //BA.debugLineNum = 233046016;BA.debugLine="Sub SetStyle(sm As Map) As VMWaterBall";
RDebugUtils.currentLine=233046017;
 //BA.debugLineNum = 233046017;BA.debugLine="WaterBall.SetStyle(sm)";
__ref._waterball /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=233046018;
 //BA.debugLineNum = 233046018;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=233046019;
 //BA.debugLineNum = 233046019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _settabindex(b4j.example.vmwaterball __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=232980480;
 //BA.debugLineNum = 232980480;BA.debugLine="Sub SetTabIndex(ti As String) As VMWaterBall";
RDebugUtils.currentLine=232980481;
 //BA.debugLineNum = 232980481;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmwaterball)(this);};
RDebugUtils.currentLine=232980482;
 //BA.debugLineNum = 232980482;BA.debugLine="WaterBall.SetTabIndex(ti)";
__ref._waterball /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=232980483;
 //BA.debugLineNum = 232980483;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=232980484;
 //BA.debugLineNum = 232980484;BA.debugLine="End Sub";
return null;
}
public String  _setvalues(b4j.example.vmwaterball __ref,int _nowrange,int _targetrange) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setvalues", true))
	 {return ((String) Debug.delegate(ba, "setvalues", new Object[] {_nowrange,_targetrange}));}
RDebugUtils.currentLine=232783872;
 //BA.debugLineNum = 232783872;BA.debugLine="Sub SetValues(nowRange As Int, targetRange As Int)";
RDebugUtils.currentLine=232783873;
 //BA.debugLineNum = 232783873;BA.debugLine="vnowRange = nowRange";
__ref._vnowrange /*int*/  = _nowrange;
RDebugUtils.currentLine=232783874;
 //BA.debugLineNum = 232783874;BA.debugLine="vtargetRange = targetRange";
__ref._vtargetrange /*int*/  = _targetrange;
RDebugUtils.currentLine=232783875;
 //BA.debugLineNum = 232783875;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwaterball  _setvif(b4j.example.vmwaterball __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=233111552;
 //BA.debugLineNum = 233111552;BA.debugLine="Sub SetVIf(vif As String) As VMWaterBall";
RDebugUtils.currentLine=233111553;
 //BA.debugLineNum = 233111553;BA.debugLine="WaterBall.SetVIf(vif)";
__ref._waterball /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=233111554;
 //BA.debugLineNum = 233111554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=233111555;
 //BA.debugLineNum = 233111555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setvshow(b4j.example.vmwaterball __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmwaterball";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmwaterball) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=233373696;
 //BA.debugLineNum = 233373696;BA.debugLine="Sub SetVShow(vif As String) As VMWaterBall";
RDebugUtils.currentLine=233373697;
 //BA.debugLineNum = 233373697;BA.debugLine="WaterBall.SetVShow(vif)";
__ref._waterball /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=233373698;
 //BA.debugLineNum = 233373698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
RDebugUtils.currentLine=233373699;
 //BA.debugLineNum = 233373699;BA.debugLine="End Sub";
return null;
}
}