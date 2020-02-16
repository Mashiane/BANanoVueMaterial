package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmwaterball extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmwaterball", this);
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
public b4j.example.vmwaterball  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 96;BA.debugLine="Sub AddClass(c As String) As VMWaterBall";
 //BA.debugLineNum = 97;BA.debugLine="WaterBall.AddClass(c)";
_waterball._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 98;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 99;BA.debugLine="End Sub";
return null;
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public WaterBall As VMElement";
_waterball = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Public isLoading As Boolean";
_isloading = false;
 //BA.debugLineNum = 8;BA.debugLine="Private vnowRange As Int ' the value now";
_vnowrange = 0;
 //BA.debugLineNum = 9;BA.debugLine="Private vtargetRange As Int ' the target value to";
_vtargetrange = 0;
 //BA.debugLineNum = 10;BA.debugLine="Private range1 As Int";
_range1 = 0;
 //BA.debugLineNum = 11;BA.debugLine="Private range2 As Int";
_range2 = 0;
 //BA.debugLineNum = 12;BA.debugLine="Private range3 As Int";
_range3 = 0;
 //BA.debugLineNum = 13;BA.debugLine="Private wWidth As Double";
_wwidth = 0;
 //BA.debugLineNum = 14;BA.debugLine="Private wHeight As Int";
_wheight = 0;
 //BA.debugLineNum = 15;BA.debugLine="Private JQ As BANanoObject";
_jq = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 16;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwaterball  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler,String _width,String _height) throws Exception{
innerInitialize(_ba);
 //BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 33;BA.debugLine="BANano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
_banano.DependsOnAsset("jquery-3.4.1.min.js");
 //BA.debugLineNum = 34;BA.debugLine="BANano.DependsOnAsset(\"createWaterBall-jquery.js\"";
_banano.DependsOnAsset("createWaterBall-jquery.js");
 //BA.debugLineNum = 35;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 36;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 37;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 38;BA.debugLine="JQ = vue.jquery";
_jq = _vue._jquery /*com.ab.banano.BANanoObject*/ ;
 //BA.debugLineNum = 39;BA.debugLine="WaterBall.Initialize(vue, ID).SetTag(\"div\")";
_waterball._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 40;BA.debugLine="range1 = 50";
_range1 = (int) (50);
 //BA.debugLineNum = 41;BA.debugLine="range2 = 80";
_range2 = (int) (80);
 //BA.debugLineNum = 42;BA.debugLine="range3 = 100";
_range3 = (int) (100);
 //BA.debugLineNum = 43;BA.debugLine="wWidth = 0.02";
_wwidth = 0.02;
 //BA.debugLineNum = 44;BA.debugLine="wHeight = 5";
_wheight = (int) (5);
 //BA.debugLineNum = 45;BA.debugLine="WaterBall.AddClass(ID)";
_waterball._addclass /*b4j.example.vmelement*/ (_id);
 //BA.debugLineNum = 46;BA.debugLine="Width = WaterBall.MakePx(Width)";
_width = _waterball._makepx /*String*/ (_width);
 //BA.debugLineNum = 47;BA.debugLine="Height = WaterBall.MakePx(Height)";
_height = _waterball._makepx /*String*/ (_height);
 //BA.debugLineNum = 48;BA.debugLine="WaterBall.SetWidth(Width).SetHeight(Height)";
_waterball._setwidth /*b4j.example.vmelement*/ (_width)._setheight /*b4j.example.vmelement*/ (_height);
 //BA.debugLineNum = 49;BA.debugLine="isLoading = False";
_isloading = __c.False;
 //BA.debugLineNum = 50;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 51;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _px) throws Exception{
 //BA.debugLineNum = 116;BA.debugLine="Sub Pop(px As VMElement)";
 //BA.debugLineNum = 117;BA.debugLine="px.SetText(ToString)";
_px._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 118;BA.debugLine="End Sub";
return "";
}
public String  _refresh() throws Exception{
anywheresoftware.b4a.objects.collections.Map _options = null;
com.ab.banano.BANanoObject _loadingele = null;
int _loading_width = 0;
int _loading_height = 0;
anywheresoftware.b4a.objects.collections.List _data_range = null;
anywheresoftware.b4a.objects.collections.Map _cvs_config = null;
anywheresoftware.b4a.objects.collections.Map _wave_config = null;
 //BA.debugLineNum = 121;BA.debugLine="Sub Refresh";
 //BA.debugLineNum = 123;BA.debugLine="Dim options As Map = CreateMap()";
_options = new anywheresoftware.b4a.objects.collections.Map();
_options = __c.createMap(new Object[] {});
 //BA.debugLineNum = 124;BA.debugLine="Dim loadingEle As BANanoObject = JQ.Selector($\"#$";
_loadingele = new com.ab.banano.BANanoObject();
_loadingele = _jq.Selector((Object)(("#"+__c.SmartStringFormatter("",(Object)(_id))+"")));
 //BA.debugLineNum = 125;BA.debugLine="Dim loading_width As Int = loadingEle.RunMethod(\"";
_loading_width = (int)(BA.ObjectToNumber(_loadingele.RunMethod("width",__c.Null).Result()));
 //BA.debugLineNum = 126;BA.debugLine="Dim loading_height As Int = loadingEle.RunMethod(";
_loading_height = (int)(BA.ObjectToNumber(_loadingele.RunMethod("height",__c.Null).Result()));
 //BA.debugLineNum = 127;BA.debugLine="Dim data_range As List";
_data_range = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 128;BA.debugLine="data_range.Initialize";
_data_range.Initialize();
 //BA.debugLineNum = 129;BA.debugLine="data_range.Add(range1)";
_data_range.Add((Object)(_range1));
 //BA.debugLineNum = 130;BA.debugLine="data_range.Add(range2)";
_data_range.Add((Object)(_range2));
 //BA.debugLineNum = 131;BA.debugLine="data_range.Add(range3)";
_data_range.Add((Object)(_range3));
 //BA.debugLineNum = 133;BA.debugLine="Dim cvs_config As Map = CreateMap()";
_cvs_config = new anywheresoftware.b4a.objects.collections.Map();
_cvs_config = __c.createMap(new Object[] {});
 //BA.debugLineNum = 134;BA.debugLine="cvs_config.Put(\"width\", loading_width)";
_cvs_config.Put((Object)("width"),(Object)(_loading_width));
 //BA.debugLineNum = 135;BA.debugLine="cvs_config.Put(\"height\", loading_height)";
_cvs_config.Put((Object)("height"),(Object)(_loading_height));
 //BA.debugLineNum = 137;BA.debugLine="Dim wave_config As Map = CreateMap()";
_wave_config = new anywheresoftware.b4a.objects.collections.Map();
_wave_config = __c.createMap(new Object[] {});
 //BA.debugLineNum = 138;BA.debugLine="wave_config.Put(\"waveWidth\", wWidth)";
_wave_config.Put((Object)("waveWidth"),(Object)(_wwidth));
 //BA.debugLineNum = 139;BA.debugLine="wave_config.Put(\"waveHeight\", wHeight)";
_wave_config.Put((Object)("waveHeight"),(Object)(_wheight));
 //BA.debugLineNum = 141;BA.debugLine="options.Put(\"cvs_config\", cvs_config)";
_options.Put((Object)("cvs_config"),(Object)(_cvs_config.getObject()));
 //BA.debugLineNum = 142;BA.debugLine="options.Put(\"wave_config\", wave_config)";
_options.Put((Object)("wave_config"),(Object)(_wave_config.getObject()));
 //BA.debugLineNum = 143;BA.debugLine="options.Put(\"data_range\", data_range)";
_options.Put((Object)("data_range"),(Object)(_data_range.getObject()));
 //BA.debugLineNum = 144;BA.debugLine="options.Put(\"isLoading\", isLoading)";
_options.Put((Object)("isLoading"),(Object)(_isloading));
 //BA.debugLineNum = 145;BA.debugLine="options.Put(\"nowRange\", vnowRange)";
_options.Put((Object)("nowRange"),(Object)(_vnowrange));
 //BA.debugLineNum = 146;BA.debugLine="options.Put(\"targetRange\", vtargetRange)";
_options.Put((Object)("targetRange"),(Object)(_vtargetrange));
 //BA.debugLineNum = 147;BA.debugLine="options.Put(\"lineWidth\", 2)";
_options.Put((Object)("lineWidth"),(Object)(2));
 //BA.debugLineNum = 149;BA.debugLine="loadingEle.RunMethod(\"createWaterBall\", options)";
_loadingele.RunMethod("createWaterBall",(Object)(_options.getObject()));
 //BA.debugLineNum = 150;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 112;BA.debugLine="Sub Render";
 //BA.debugLineNum = 113;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 114;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwaterball  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 102;BA.debugLine="Sub SetAttr(attr As Map) As VMWaterBall";
 //BA.debugLineNum = 103;BA.debugLine="WaterBall.SetAttr(attr)";
_waterball._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 104;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 105;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 53;BA.debugLine="Sub SetDisabled(b As Boolean) As VMWaterBall";
 //BA.debugLineNum = 54;BA.debugLine="WaterBall.SetDisabled(b)";
_waterball._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 55;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 56;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setid(String _iid,boolean _bind) throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMWat";
 //BA.debugLineNum = 76;BA.debugLine="WaterBall.SetID(iID,bind)";
_waterball._setid /*b4j.example.vmelement*/ (_iid,_bind);
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMWate";
 //BA.debugLineNum = 86;BA.debugLine="WaterBall.SetKey(k, bind)";
_waterball._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setname(String _nam,boolean _bind) throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMW";
 //BA.debugLineNum = 81;BA.debugLine="WaterBall.SetName(nam, bind)";
_waterball._setname /*b4j.example.vmelement*/ (_nam,_bind);
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public String  _setranges(int _red,int _orange,int _green) throws Exception{
 //BA.debugLineNum = 20;BA.debugLine="Sub SetRanges(red As Int, orange As Int, green As";
 //BA.debugLineNum = 21;BA.debugLine="range1 = red";
_range1 = _red;
 //BA.debugLineNum = 22;BA.debugLine="range2 = orange";
_range2 = _orange;
 //BA.debugLineNum = 23;BA.debugLine="range3 = green";
_range3 = _green;
 //BA.debugLineNum = 24;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwaterball  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 65;BA.debugLine="Sub SetStyle(sm As Map) As VMWaterBall";
 //BA.debugLineNum = 66;BA.debugLine="WaterBall.SetStyle(sm)";
_waterball._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 67;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 68;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetTabIndex(ti As String) As VMWaterBall";
 //BA.debugLineNum = 59;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmwaterball)(this);};
 //BA.debugLineNum = 60;BA.debugLine="WaterBall.SetTabIndex(ti)";
_waterball._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 61;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 62;BA.debugLine="End Sub";
return null;
}
public String  _setvalues(int _nowrange,int _targetrange) throws Exception{
 //BA.debugLineNum = 27;BA.debugLine="Sub SetValues(nowRange As Int, targetRange As Int)";
 //BA.debugLineNum = 28;BA.debugLine="vnowRange = nowRange";
_vnowrange = _nowrange;
 //BA.debugLineNum = 29;BA.debugLine="vtargetRange = targetRange";
_vtargetrange = _targetrange;
 //BA.debugLineNum = 30;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmwaterball  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 70;BA.debugLine="Sub SetVIf(vif As String) As VMWaterBall";
 //BA.debugLineNum = 71;BA.debugLine="WaterBall.SetVIf(vif)";
_waterball._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmwaterball  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetVShow(vif As String) As VMWaterBall";
 //BA.debugLineNum = 91;BA.debugLine="WaterBall.SetVShow(vif)";
_waterball._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmwaterball)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 108;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 109;BA.debugLine="Return WaterBall.tostring";
if (true) return _waterball._tostring /*String*/ ();
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
