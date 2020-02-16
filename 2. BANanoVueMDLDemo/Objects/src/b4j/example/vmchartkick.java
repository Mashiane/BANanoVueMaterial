package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmchartkick extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmchartkick", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmchartkick.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _chartkick = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public com.ab.banano.BANano _banano = null;
public Object _module = null;
public anywheresoftware.b4a.objects.collections.Map _series = null;
public anywheresoftware.b4a.objects.collections.Map _data = null;
public anywheresoftware.b4a.objects.collections.List _colors = null;
public String _coptions = "";
public b4j.example.vmchartkick._xaxestype _xaxes = null;
public b4j.example.vmchartkick._xaxestype _yaxes = null;
public boolean _overwriteoptions = false;
public b4j.example.vmchartkick._titletype _title = null;
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
public static class _grdline{
public boolean IsInitialized;
public boolean display;
public boolean circular;
public int lineWidth;
public boolean drawBorder;
public boolean drawOnChartArea;
public boolean drawTicks;
public int tickMarkLength;
public int zeroLineWidth;
public boolean offsetGridLines;
public void Initialize() {
IsInitialized = true;
display = false;
circular = false;
lineWidth = 0;
drawBorder = false;
drawOnChartArea = false;
drawTicks = false;
tickMarkLength = 0;
zeroLineWidth = 0;
offsetGridLines = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _tickstype{
public boolean IsInitialized;
public boolean autoSkip;
public int maxRotation;
public int minRotation;
public int MinValue;
public int MaxValue;
public int stepSize;
public boolean beginAtZero;
public void Initialize() {
IsInitialized = true;
autoSkip = false;
maxRotation = 0;
minRotation = 0;
MinValue = 0;
MaxValue = 0;
stepSize = 0;
beginAtZero = false;
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _xaxestype{
public boolean IsInitialized;
public boolean display;
public b4j.example.vmchartkick._tickstype ticks;
public b4j.example.vmchartkick._grdline gridLines;
public void Initialize() {
IsInitialized = true;
display = false;
ticks = new b4j.example.vmchartkick._tickstype();
gridLines = new b4j.example.vmchartkick._grdline();
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public static class _titletype{
public boolean IsInitialized;
public boolean display;
public String text;
public String position;
public void Initialize() {
IsInitialized = true;
display = false;
text = "";
position = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public b4j.example.vmchartkick  _addbubble(String _x,String _y,String _size) throws Exception{
anywheresoftware.b4a.objects.collections.List _exdata = null;
anywheresoftware.b4a.objects.collections.List _cudata = null;
 //BA.debugLineNum = 230;BA.debugLine="Sub AddBubble(X As String, y As String, size As St";
 //BA.debugLineNum = 232;BA.debugLine="Dim exdata As List = data.Get(\"a\")";
_exdata = new anywheresoftware.b4a.objects.collections.List();
_exdata.setObject((java.util.List)(_data.Get((Object)("a"))));
 //BA.debugLineNum = 233;BA.debugLine="Dim cudata As List";
_cudata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 234;BA.debugLine="cudata.Initialize";
_cudata.Initialize();
 //BA.debugLineNum = 235;BA.debugLine="cudata.Add(X)";
_cudata.Add((Object)(_x));
 //BA.debugLineNum = 236;BA.debugLine="cudata.Add(y)";
_cudata.Add((Object)(_y));
 //BA.debugLineNum = 237;BA.debugLine="cudata.Add(size)";
_cudata.Add((Object)(_size));
 //BA.debugLineNum = 238;BA.debugLine="exdata.Add(cudata)";
_exdata.Add((Object)(_cudata.getObject()));
 //BA.debugLineNum = 239;BA.debugLine="data.Put(\"a\",exdata)";
_data.Put((Object)("a"),(Object)(_exdata.getObject()));
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 446;BA.debugLine="Sub AddClass(c As String) As VMChartKick";
 //BA.debugLineNum = 447;BA.debugLine="ChartKick.AddClass(c)";
_chartkick._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 448;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 449;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addseries(String _seriescaption,String _seriescolor,boolean _seriescurve,anywheresoftware.b4a.objects.collections.Map _seriesdata) throws Exception{
anywheresoftware.b4a.objects.collections.Map _obj = null;
String _xcolor = "";
 //BA.debugLineNum = 176;BA.debugLine="Sub AddSeries(seriesCaption As String, seriesColor";
 //BA.debugLineNum = 177;BA.debugLine="Dim obj As Map = CreateMap()";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj = __c.createMap(new Object[] {});
 //BA.debugLineNum = 178;BA.debugLine="obj.Put(\"name\", seriesCaption)";
_obj.Put((Object)("name"),(Object)(_seriescaption));
 //BA.debugLineNum = 179;BA.debugLine="obj.Put(\"data\", seriesData)";
_obj.Put((Object)("data"),(Object)(_seriesdata.getObject()));
 //BA.debugLineNum = 180;BA.debugLine="obj.Put(\"curve\", seriesCurve)";
_obj.Put((Object)("curve"),(Object)(_seriescurve));
 //BA.debugLineNum = 181;BA.debugLine="obj.Put(\"label\", seriesCaption)";
_obj.Put((Object)("label"),(Object)(_seriescaption));
 //BA.debugLineNum = 182;BA.debugLine="If seriesColor <> \"\" Then";
if ((_seriescolor).equals("") == false) { 
 //BA.debugLineNum = 183;BA.debugLine="Dim xColor As String = vue.GetColorHex(seriesCol";
_xcolor = _vue._getcolorhex /*String*/ (_seriescolor);
 //BA.debugLineNum = 184;BA.debugLine="obj.Put(\"color\", xColor)";
_obj.Put((Object)("color"),(Object)(_xcolor));
 };
 //BA.debugLineNum = 186;BA.debugLine="series.Put(seriesCaption, obj)";
_series.Put((Object)(_seriescaption),(Object)(_obj.getObject()));
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addxy(String _x,String _y) throws Exception{
anywheresoftware.b4a.objects.collections.List _exdata = null;
anywheresoftware.b4a.objects.collections.List _cudata = null;
 //BA.debugLineNum = 191;BA.debugLine="Sub AddXY(X As String, y As String) As VMChartKick";
 //BA.debugLineNum = 193;BA.debugLine="Dim exdata As List = data.Get(\"a\")";
_exdata = new anywheresoftware.b4a.objects.collections.List();
_exdata.setObject((java.util.List)(_data.Get((Object)("a"))));
 //BA.debugLineNum = 194;BA.debugLine="Dim cudata As List";
_cudata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 195;BA.debugLine="cudata.Initialize";
_cudata.Initialize();
 //BA.debugLineNum = 196;BA.debugLine="cudata.Add(X)";
_cudata.Add((Object)(_x));
 //BA.debugLineNum = 197;BA.debugLine="cudata.Add(y)";
_cudata.Add((Object)(_y));
 //BA.debugLineNum = 198;BA.debugLine="exdata.Add(cudata)";
_exdata.Add((Object)(_cudata.getObject()));
 //BA.debugLineNum = 199;BA.debugLine="data.Put(\"a\",exdata)";
_data.Put((Object)("a"),(Object)(_exdata.getObject()));
 //BA.debugLineNum = 200;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 201;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addxycolor(String _x,String _y,String _color) throws Exception{
anywheresoftware.b4a.objects.collections.List _exdata = null;
anywheresoftware.b4a.objects.collections.List _cudata = null;
String _xcolor = "";
 //BA.debugLineNum = 204;BA.debugLine="Sub AddXYColor(X As String, y As String, color As";
 //BA.debugLineNum = 206;BA.debugLine="Dim exdata As List = data.Get(\"a\")";
_exdata = new anywheresoftware.b4a.objects.collections.List();
_exdata.setObject((java.util.List)(_data.Get((Object)("a"))));
 //BA.debugLineNum = 207;BA.debugLine="Dim cudata As List";
_cudata = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 208;BA.debugLine="cudata.Initialize";
_cudata.Initialize();
 //BA.debugLineNum = 209;BA.debugLine="cudata.Add(X)";
_cudata.Add((Object)(_x));
 //BA.debugLineNum = 210;BA.debugLine="cudata.Add(y)";
_cudata.Add((Object)(_y));
 //BA.debugLineNum = 211;BA.debugLine="exdata.Add(cudata)";
_exdata.Add((Object)(_cudata.getObject()));
 //BA.debugLineNum = 212;BA.debugLine="data.Put(\"a\",exdata)";
_data.Put((Object)("a"),(Object)(_exdata.getObject()));
 //BA.debugLineNum = 213;BA.debugLine="If color <> \"\" Then";
if ((_color).equals("") == false) { 
 //BA.debugLineNum = 214;BA.debugLine="Dim xColor As String = vue.GetColorHex(color)";
_xcolor = _vue._getcolorhex /*String*/ (_color);
 //BA.debugLineNum = 215;BA.debugLine="colors.Add(xColor)";
_colors.Add((Object)(_xcolor));
 };
 //BA.debugLineNum = 217;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 218;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addxymap(anywheresoftware.b4a.objects.collections.Map _values) throws Exception{
String _strkey = "";
String _strval = "";
 //BA.debugLineNum = 221;BA.debugLine="Sub AddXYMap(values As Map) As VMChartKick";
 //BA.debugLineNum = 222;BA.debugLine="For Each strKey As String In values.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _values.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
 //BA.debugLineNum = 223;BA.debugLine="Dim strVal As String = values.Get(strKey)";
_strval = BA.ObjectToString(_values.Get((Object)(_strkey)));
 //BA.debugLineNum = 224;BA.debugLine="AddXY(strKey,strVal)";
_addxy(_strkey,_strval);
 }
};
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public String  _buildoptions() throws Exception{
anywheresoftware.b4a.objects.collections.Map _chartoptions = null;
anywheresoftware.b4a.objects.collections.Map _scales = null;
anywheresoftware.b4a.objects.collections.List _xlist = null;
anywheresoftware.b4a.objects.collections.Map _xticks = null;
anywheresoftware.b4a.objects.collections.Map _xsis = null;
anywheresoftware.b4a.objects.collections.Map _xgrid = null;
anywheresoftware.b4a.objects.collections.List _ylist = null;
anywheresoftware.b4a.objects.collections.Map _ysis = null;
anywheresoftware.b4a.objects.collections.Map _yticks = null;
anywheresoftware.b4a.objects.collections.Map _ygrid = null;
anywheresoftware.b4a.objects.collections.Map _titobj = null;
 //BA.debugLineNum = 100;BA.debugLine="private Sub BuildOptions";
 //BA.debugLineNum = 101;BA.debugLine="Dim chartOptions As Map = CreateMap()";
_chartoptions = new anywheresoftware.b4a.objects.collections.Map();
_chartoptions = __c.createMap(new Object[] {});
 //BA.debugLineNum = 102;BA.debugLine="Dim scales As Map = CreateMap()";
_scales = new anywheresoftware.b4a.objects.collections.Map();
_scales = __c.createMap(new Object[] {});
 //BA.debugLineNum = 104;BA.debugLine="Dim xList As List";
_xlist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 105;BA.debugLine="Dim xticks As Map = CreateMap()";
_xticks = new anywheresoftware.b4a.objects.collections.Map();
_xticks = __c.createMap(new Object[] {});
 //BA.debugLineNum = 106;BA.debugLine="Dim xsis As Map = CreateMap()";
_xsis = new anywheresoftware.b4a.objects.collections.Map();
_xsis = __c.createMap(new Object[] {});
 //BA.debugLineNum = 107;BA.debugLine="Dim xgrid As Map = CreateMap()";
_xgrid = new anywheresoftware.b4a.objects.collections.Map();
_xgrid = __c.createMap(new Object[] {});
 //BA.debugLineNum = 109;BA.debugLine="xList.Initialize";
_xlist.Initialize();
 //BA.debugLineNum = 110;BA.debugLine="If xAxes.ticks.autoSkip <> Null Then xticks.Put(\"";
if (_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
_xticks.Put((Object)("autoSkip"),(Object)(_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/ ));};
 //BA.debugLineNum = 111;BA.debugLine="If xAxes.ticks.maxRotation <> Null Then xticks.Pu";
if (_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("maxRotation"),(Object)(_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/ ));};
 //BA.debugLineNum = 112;BA.debugLine="If xAxes.ticks.minRotation <> Null Then xticks.Pu";
if (_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("minRotation"),(Object)(_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/ ));};
 //BA.debugLineNum = 113;BA.debugLine="If xAxes.ticks.MinValue <> Null Then xticks.Put(\"";
if (_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("min"),(Object)(_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/ ));};
 //BA.debugLineNum = 114;BA.debugLine="If xAxes.ticks.MaxValue <> Null Then xticks.Put(\"";
if (_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("max"),(Object)(_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/ ));};
 //BA.debugLineNum = 115;BA.debugLine="If xAxes.ticks.stepSize <> Null Then xticks.Put(\"";
if (_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("stepSize"),(Object)(_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/ ));};
 //BA.debugLineNum = 116;BA.debugLine="If xAxes.ticks.beginAtZero <> Null Then xticks.Pu";
if (_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
_xticks.Put((Object)("beginAtZero"),(Object)(_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/ ));};
 //BA.debugLineNum = 118;BA.debugLine="xgrid.Put(\"display\", xAxes.gridLines.display)";
_xgrid.Put((Object)("display"),(Object)(_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .display /*boolean*/ ));
 //BA.debugLineNum = 119;BA.debugLine="xgrid.Put(\"circular\",xAxes.gridLines.circular)";
_xgrid.Put((Object)("circular"),(Object)(_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .circular /*boolean*/ ));
 //BA.debugLineNum = 120;BA.debugLine="xgrid.Put(\"lineWidth\",xAxes.gridLines.lineWidth)";
_xgrid.Put((Object)("lineWidth"),(Object)(_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .lineWidth /*int*/ ));
 //BA.debugLineNum = 121;BA.debugLine="xgrid.Put(\"drawBorder\",xAxes.gridLines.drawBorder";
_xgrid.Put((Object)("drawBorder"),(Object)(_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawBorder /*boolean*/ ));
 //BA.debugLineNum = 122;BA.debugLine="xgrid.Put(\"drawOnChartArea\",xAxes.gridLines.drawO";
_xgrid.Put((Object)("drawOnChartArea"),(Object)(_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawOnChartArea /*boolean*/ ));
 //BA.debugLineNum = 123;BA.debugLine="xgrid.Put(\"drawTicks\",xAxes.gridLines.drawTicks)";
_xgrid.Put((Object)("drawTicks"),(Object)(_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawTicks /*boolean*/ ));
 //BA.debugLineNum = 124;BA.debugLine="xgrid.Put(\"tickMarkLength\",xAxes.gridLines.tickMa";
_xgrid.Put((Object)("tickMarkLength"),(Object)(_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .tickMarkLength /*int*/ ));
 //BA.debugLineNum = 125;BA.debugLine="xgrid.Put(\"zeroLineWidth\",xAxes.gridLines.zeroLin";
_xgrid.Put((Object)("zeroLineWidth"),(Object)(_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .zeroLineWidth /*int*/ ));
 //BA.debugLineNum = 126;BA.debugLine="xgrid.Put(\"offsetGridLines\",xAxes.gridLines.offse";
_xgrid.Put((Object)("offsetGridLines"),(Object)(_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .offsetGridLines /*boolean*/ ));
 //BA.debugLineNum = 129;BA.debugLine="xsis.Put(\"display\", xAxes.display)";
_xsis.Put((Object)("display"),(Object)(_xaxes.display /*boolean*/ ));
 //BA.debugLineNum = 130;BA.debugLine="If xticks.Size > 0 Then xsis.Put(\"ticks\", xticks)";
if (_xticks.getSize()>0) { 
_xsis.Put((Object)("ticks"),(Object)(_xticks.getObject()));};
 //BA.debugLineNum = 131;BA.debugLine="If xgrid.Size > 0 Then xsis.Put(\"gridLines\", xgri";
if (_xgrid.getSize()>0) { 
_xsis.Put((Object)("gridLines"),(Object)(_xgrid.getObject()));};
 //BA.debugLineNum = 132;BA.debugLine="xList.Add(xsis)";
_xlist.Add((Object)(_xsis.getObject()));
 //BA.debugLineNum = 133;BA.debugLine="scales.Put(\"xAxes\", xList)";
_scales.Put((Object)("xAxes"),(Object)(_xlist.getObject()));
 //BA.debugLineNum = 135;BA.debugLine="Dim yList As List";
_ylist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 136;BA.debugLine="Dim ysis As Map = CreateMap()";
_ysis = new anywheresoftware.b4a.objects.collections.Map();
_ysis = __c.createMap(new Object[] {});
 //BA.debugLineNum = 137;BA.debugLine="Dim yticks As Map = CreateMap()";
_yticks = new anywheresoftware.b4a.objects.collections.Map();
_yticks = __c.createMap(new Object[] {});
 //BA.debugLineNum = 138;BA.debugLine="Dim ygrid As Map = CreateMap()";
_ygrid = new anywheresoftware.b4a.objects.collections.Map();
_ygrid = __c.createMap(new Object[] {});
 //BA.debugLineNum = 140;BA.debugLine="yList.Initialize";
_ylist.Initialize();
 //BA.debugLineNum = 141;BA.debugLine="If yAxes.ticks.autoSkip <> Null Then yticks.Put(\"";
if (_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
_yticks.Put((Object)("autoSkip"),(Object)(_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/ ));};
 //BA.debugLineNum = 142;BA.debugLine="If yAxes.ticks.maxRotation <> Null Then yticks.Pu";
if (_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("maxRotation"),(Object)(_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/ ));};
 //BA.debugLineNum = 143;BA.debugLine="If yAxes.ticks.minRotation <> Null Then yticks.Pu";
if (_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("minRotation"),(Object)(_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/ ));};
 //BA.debugLineNum = 144;BA.debugLine="If yAxes.ticks.MinValue <> Null Then yticks.Put(\"";
if (_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("min"),(Object)(_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/ ));};
 //BA.debugLineNum = 145;BA.debugLine="If yAxes.ticks.MaxValue <> Null Then yticks.Put(\"";
if (_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("max"),(Object)(_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/ ));};
 //BA.debugLineNum = 146;BA.debugLine="If yAxes.ticks.stepSize <> Null Then yticks.Put(\"";
if (_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("stepSize"),(Object)(_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/ ));};
 //BA.debugLineNum = 147;BA.debugLine="If yAxes.ticks.beginAtZero <> Null Then yticks.Pu";
if (_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
_yticks.Put((Object)("beginAtZero"),(Object)(_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/ ));};
 //BA.debugLineNum = 149;BA.debugLine="ygrid.Put(\"display\", yAxes.gridLines.display)";
_ygrid.Put((Object)("display"),(Object)(_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .display /*boolean*/ ));
 //BA.debugLineNum = 150;BA.debugLine="ygrid.Put(\"circular\",yAxes.gridLines.circular)";
_ygrid.Put((Object)("circular"),(Object)(_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .circular /*boolean*/ ));
 //BA.debugLineNum = 151;BA.debugLine="ygrid.Put(\"lineWidth\",yAxes.gridLines.lineWidth)";
_ygrid.Put((Object)("lineWidth"),(Object)(_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .lineWidth /*int*/ ));
 //BA.debugLineNum = 152;BA.debugLine="ygrid.Put(\"drawBorder\",yAxes.gridLines.drawBorder";
_ygrid.Put((Object)("drawBorder"),(Object)(_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawBorder /*boolean*/ ));
 //BA.debugLineNum = 153;BA.debugLine="ygrid.Put(\"drawOnChartArea\",yAxes.gridLines.drawO";
_ygrid.Put((Object)("drawOnChartArea"),(Object)(_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawOnChartArea /*boolean*/ ));
 //BA.debugLineNum = 154;BA.debugLine="ygrid.Put(\"drawTicks\",yAxes.gridLines.drawTicks)";
_ygrid.Put((Object)("drawTicks"),(Object)(_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawTicks /*boolean*/ ));
 //BA.debugLineNum = 155;BA.debugLine="ygrid.Put(\"tickMarkLength\",yAxes.gridLines.tickMa";
_ygrid.Put((Object)("tickMarkLength"),(Object)(_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .tickMarkLength /*int*/ ));
 //BA.debugLineNum = 156;BA.debugLine="ygrid.Put(\"zeroLineWidth\",yAxes.gridLines.zeroLin";
_ygrid.Put((Object)("zeroLineWidth"),(Object)(_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .zeroLineWidth /*int*/ ));
 //BA.debugLineNum = 157;BA.debugLine="ygrid.Put(\"offsetGridLines\",yAxes.gridLines.offse";
_ygrid.Put((Object)("offsetGridLines"),(Object)(_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .offsetGridLines /*boolean*/ ));
 //BA.debugLineNum = 159;BA.debugLine="ysis.Put(\"display\", yAxes.display)";
_ysis.Put((Object)("display"),(Object)(_yaxes.display /*boolean*/ ));
 //BA.debugLineNum = 160;BA.debugLine="If yticks.Size > 0 Then ysis.Put(\"ticks\", yticks)";
if (_yticks.getSize()>0) { 
_ysis.Put((Object)("ticks"),(Object)(_yticks.getObject()));};
 //BA.debugLineNum = 161;BA.debugLine="If ygrid.Size > 0 Then ysis.Put(\"gridLines\", ygri";
if (_ygrid.getSize()>0) { 
_ysis.Put((Object)("gridLines"),(Object)(_ygrid.getObject()));};
 //BA.debugLineNum = 162;BA.debugLine="yList.Add(ysis)";
_ylist.Add((Object)(_ysis.getObject()));
 //BA.debugLineNum = 163;BA.debugLine="scales.Put(\"yAxes\", yList)";
_scales.Put((Object)("yAxes"),(Object)(_ylist.getObject()));
 //BA.debugLineNum = 165;BA.debugLine="chartOptions.Put(\"scales\", scales)";
_chartoptions.Put((Object)("scales"),(Object)(_scales.getObject()));
 //BA.debugLineNum = 167;BA.debugLine="Dim titObj As Map = CreateMap()";
_titobj = new anywheresoftware.b4a.objects.collections.Map();
_titobj = __c.createMap(new Object[] {});
 //BA.debugLineNum = 168;BA.debugLine="titObj.Put(\"display\", Title.display)";
_titobj.Put((Object)("display"),(Object)(_title.display /*boolean*/ ));
 //BA.debugLineNum = 169;BA.debugLine="titObj.Put(\"text\", Title.text)";
_titobj.Put((Object)("text"),(Object)(_title.text /*String*/ ));
 //BA.debugLineNum = 170;BA.debugLine="chartOptions.Put(\"title\", titObj)";
_chartoptions.Put((Object)("title"),(Object)(_titobj.getObject()));
 //BA.debugLineNum = 172;BA.debugLine="vue.SetStateSingle(coptions, chartOptions)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_coptions,(Object)(_chartoptions.getObject()));
 //BA.debugLineNum = 173;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public ChartKick As VMElement";
_chartkick = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 9;BA.debugLine="Private series As Map";
_series = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 10;BA.debugLine="Private data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private colors As List";
_colors = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 12;BA.debugLine="Private coptions As String";
_coptions = "";
 //BA.debugLineNum = 13;BA.debugLine="Type grdLine(display As Boolean, circular As Bool";
;
 //BA.debugLineNum = 15;BA.debugLine="Type ticksType(autoSkip As Boolean, maxRotation A";
;
 //BA.debugLineNum = 17;BA.debugLine="Type xAxesType(display As Boolean, ticks As ticks";
;
 //BA.debugLineNum = 18;BA.debugLine="Public xAxes As xAxesType";
_xaxes = new b4j.example.vmchartkick._xaxestype();
 //BA.debugLineNum = 19;BA.debugLine="Public yAxes As xAxesType";
_yaxes = new b4j.example.vmchartkick._xaxestype();
 //BA.debugLineNum = 20;BA.debugLine="Public OverwriteOptions As Boolean";
_overwriteoptions = false;
 //BA.debugLineNum = 21;BA.debugLine="Type titleType(display As Boolean, text As String";
;
 //BA.debugLineNum = 22;BA.debugLine="Public Title As titleType";
_title = new b4j.example.vmchartkick._titletype();
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchartkick  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
anywheresoftware.b4a.objects.collections.List _sl = null;
 //BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 26;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 27;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 28;BA.debugLine="ChartKick.Initialize(vue, ID)";
_chartkick._initialize /*b4j.example.vmelement*/ (ba,_vue,_id);
 //BA.debugLineNum = 29;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 30;BA.debugLine="series.Initialize";
_series.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="data.Initialize";
_data.Initialize();
 //BA.debugLineNum = 32;BA.debugLine="colors.Initialize";
_colors.Initialize();
 //BA.debugLineNum = 33;BA.debugLine="Dim sl As List";
_sl = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 34;BA.debugLine="sl.Initialize";
_sl.Initialize();
 //BA.debugLineNum = 35;BA.debugLine="data.Put(\"a\",sl)";
_data.Put((Object)("a"),(Object)(_sl.getObject()));
 //BA.debugLineNum = 36;BA.debugLine="SetStyleSingle(\"width\", \"100%\")";
_setstylesingle("width","100%");
 //BA.debugLineNum = 37;BA.debugLine="ChartKick.RemoveAttr(\":required\")";
_chartkick._removeattr /*b4j.example.vmelement*/ (":required");
 //BA.debugLineNum = 38;BA.debugLine="coptions = $\"${ID}options\"$";
_coptions = (""+__c.SmartStringFormatter("",(Object)(_id))+"options");
 //BA.debugLineNum = 39;BA.debugLine="SetDownload";
_setdownload();
 //BA.debugLineNum = 40;BA.debugLine="SetAttrSingle(\":library\", coptions)";
_setattrsingle(":library",(Object)(_coptions));
 //BA.debugLineNum = 42;BA.debugLine="xAxes.Initialize";
_xaxes.Initialize();
 //BA.debugLineNum = 43;BA.debugLine="xAxes.ticks.Initialize";
_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .Initialize();
 //BA.debugLineNum = 44;BA.debugLine="xAxes.gridLines.Initialize";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .Initialize();
 //BA.debugLineNum = 45;BA.debugLine="xAxes.display = True";
_xaxes.display /*boolean*/  = __c.True;
 //BA.debugLineNum = 46;BA.debugLine="xAxes.ticks.autoSkip = Null";
_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/  = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 47;BA.debugLine="xAxes.ticks.maxRotation = Null";
_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 48;BA.debugLine="xAxes.ticks.minRotation = Null";
_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 49;BA.debugLine="xAxes.ticks.MinValue = Null";
_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 50;BA.debugLine="xAxes.ticks.MaxValue = Null";
_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 51;BA.debugLine="xAxes.ticks.stepSize = Null";
_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 52;BA.debugLine="xAxes.ticks.beginAtZero = Null";
_xaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/  = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 54;BA.debugLine="xAxes.gridLines.display = True";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .display /*boolean*/  = __c.True;
 //BA.debugLineNum = 55;BA.debugLine="xAxes.gridLines.circular = False";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .circular /*boolean*/  = __c.False;
 //BA.debugLineNum = 56;BA.debugLine="xAxes.gridLines.lineWidth = 1";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .lineWidth /*int*/  = (int) (1);
 //BA.debugLineNum = 57;BA.debugLine="xAxes.gridLines.drawBorder = True";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawBorder /*boolean*/  = __c.True;
 //BA.debugLineNum = 58;BA.debugLine="xAxes.gridLines.drawOnChartArea = True";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawOnChartArea /*boolean*/  = __c.True;
 //BA.debugLineNum = 59;BA.debugLine="xAxes.gridLines.drawTicks = True";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawTicks /*boolean*/  = __c.True;
 //BA.debugLineNum = 60;BA.debugLine="xAxes.gridLines.tickMarkLength = 10";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .tickMarkLength /*int*/  = (int) (10);
 //BA.debugLineNum = 61;BA.debugLine="xAxes.gridLines.zeroLineWidth = 1";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .zeroLineWidth /*int*/  = (int) (1);
 //BA.debugLineNum = 62;BA.debugLine="xAxes.gridLines.offsetGridLines = False";
_xaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .offsetGridLines /*boolean*/  = __c.False;
 //BA.debugLineNum = 64;BA.debugLine="yAxes.Initialize";
_yaxes.Initialize();
 //BA.debugLineNum = 65;BA.debugLine="yAxes.ticks.Initialize";
_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .Initialize();
 //BA.debugLineNum = 66;BA.debugLine="yAxes.gridLines.Initialize";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .Initialize();
 //BA.debugLineNum = 67;BA.debugLine="yAxes.display = True";
_yaxes.display /*boolean*/  = __c.True;
 //BA.debugLineNum = 68;BA.debugLine="yAxes.ticks.autoSkip = Null";
_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/  = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 69;BA.debugLine="yAxes.ticks.maxRotation = Null";
_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 70;BA.debugLine="yAxes.ticks.minRotation = Null";
_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 71;BA.debugLine="yAxes.ticks.MinValue = Null";
_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 72;BA.debugLine="yAxes.ticks.MaxValue = Null";
_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 73;BA.debugLine="yAxes.ticks.stepSize = Null";
_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
 //BA.debugLineNum = 74;BA.debugLine="yAxes.ticks.beginAtZero = Null";
_yaxes.ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/  = BA.ObjectToBoolean(__c.Null);
 //BA.debugLineNum = 75;BA.debugLine="yAxes.gridLines.display = True";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .display /*boolean*/  = __c.True;
 //BA.debugLineNum = 76;BA.debugLine="yAxes.gridLines.circular = False";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .circular /*boolean*/  = __c.False;
 //BA.debugLineNum = 77;BA.debugLine="yAxes.gridLines.lineWidth = 1";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .lineWidth /*int*/  = (int) (1);
 //BA.debugLineNum = 78;BA.debugLine="yAxes.gridLines.drawBorder = True";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawBorder /*boolean*/  = __c.True;
 //BA.debugLineNum = 79;BA.debugLine="yAxes.gridLines.drawOnChartArea = True";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawOnChartArea /*boolean*/  = __c.True;
 //BA.debugLineNum = 80;BA.debugLine="yAxes.gridLines.drawTicks = True";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .drawTicks /*boolean*/  = __c.True;
 //BA.debugLineNum = 81;BA.debugLine="yAxes.gridLines.tickMarkLength = 10";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .tickMarkLength /*int*/  = (int) (10);
 //BA.debugLineNum = 82;BA.debugLine="yAxes.gridLines.zeroLineWidth = 1";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .zeroLineWidth /*int*/  = (int) (1);
 //BA.debugLineNum = 83;BA.debugLine="yAxes.gridLines.offsetGridLines = False";
_yaxes.gridLines /*b4j.example.vmchartkick._grdline*/ .offsetGridLines /*boolean*/  = __c.False;
 //BA.debugLineNum = 86;BA.debugLine="Title.Initialize";
_title.Initialize();
 //BA.debugLineNum = 87;BA.debugLine="Title.display = True";
_title.display /*boolean*/  = __c.True;
 //BA.debugLineNum = 88;BA.debugLine="Title.position = \"top\"";
_title.position /*String*/  = "top";
 //BA.debugLineNum = 89;BA.debugLine="Title.text = \"\"";
_title.text /*String*/  = "";
 //BA.debugLineNum = 91;BA.debugLine="OverwriteOptions = True";
_overwriteoptions = __c.True;
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _p) throws Exception{
 //BA.debugLineNum = 495;BA.debugLine="Sub Pop(p As VMElement)";
 //BA.debugLineNum = 496;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 497;BA.debugLine="End Sub";
return "";
}
public String  _render() throws Exception{
 //BA.debugLineNum = 491;BA.debugLine="Sub Render";
 //BA.debugLineNum = 492;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 493;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchartkick  _setareachart() throws Exception{
 //BA.debugLineNum = 425;BA.debugLine="Sub SetAreaChart As VMChartKick";
 //BA.debugLineNum = 426;BA.debugLine="ChartKick.SetTag(\"area-chart\")";
_chartkick._settag /*b4j.example.vmelement*/ ("area-chart");
 //BA.debugLineNum = 427;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 428;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 452;BA.debugLine="Sub SetAttr(attr As Map) As VMChartKick";
 //BA.debugLineNum = 453;BA.debugLine="ChartKick.SetAttr(attr)";
_chartkick._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 454;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 455;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setattrsingle(String _prop,Object _val) throws Exception{
anywheresoftware.b4a.objects.collections.Map _attr = null;
 //BA.debugLineNum = 457;BA.debugLine="Sub SetAttrSingle(prop As String, val As Object) A";
 //BA.debugLineNum = 458;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
 //BA.debugLineNum = 459;BA.debugLine="attr.Put(prop, val)";
_attr.Put((Object)(_prop),_val);
 //BA.debugLineNum = 460;BA.debugLine="SetAttr(attr)";
_setattr(_attr);
 //BA.debugLineNum = 461;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 462;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setbarchart() throws Exception{
 //BA.debugLineNum = 415;BA.debugLine="Sub SetBarChart As VMChartKick";
 //BA.debugLineNum = 416;BA.debugLine="ChartKick.SetTag(\"bar-chart\")";
_chartkick._settag /*b4j.example.vmelement*/ ("bar-chart");
 //BA.debugLineNum = 417;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 418;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setbytes() throws Exception{
 //BA.debugLineNum = 358;BA.debugLine="Sub SetBytes As VMChartKick";
 //BA.debugLineNum = 359;BA.debugLine="SetAttrSingle(\":bytes\", \"true\")";
_setattrsingle(":bytes",(Object)("true"));
 //BA.debugLineNum = 360;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 361;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setcolors(String _lcolors) throws Exception{
 //BA.debugLineNum = 286;BA.debugLine="private Sub SetColors(lcolors As String) As VMChar";
 //BA.debugLineNum = 287;BA.debugLine="SetAttrSingle(\":colors\", lcolors)";
_setattrsingle(":colors",(Object)(_lcolors));
 //BA.debugLineNum = 288;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 289;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setcolumnchart() throws Exception{
 //BA.debugLineNum = 420;BA.debugLine="Sub SetColumnChart As VMChartKick";
 //BA.debugLineNum = 421;BA.debugLine="ChartKick.SetTag(\"column-chart\")";
_chartkick._settag /*b4j.example.vmelement*/ ("column-chart");
 //BA.debugLineNum = 422;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 423;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setcurve() throws Exception{
 //BA.debugLineNum = 301;BA.debugLine="Sub SetCurve As VMChartKick";
 //BA.debugLineNum = 302;BA.debugLine="SetAttrSingle(\":curve\", \"true\")";
_setattrsingle(":curve",(Object)("true"));
 //BA.debugLineNum = 303;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 304;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdata(String _chartdata) throws Exception{
 //BA.debugLineNum = 256;BA.debugLine="private Sub SetData(chartData As String) As VMChar";
 //BA.debugLineNum = 257;BA.debugLine="SetAttrSingle(\":data\", chartData)";
_setattrsingle(":data",(Object)(_chartdata));
 //BA.debugLineNum = 258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdecimal(String _sdecimal) throws Exception{
 //BA.debugLineNum = 338;BA.debugLine="Sub SetDecimal(sdecimal As String) As VMChartKick";
 //BA.debugLineNum = 339;BA.debugLine="SetAttrSingle(\"decimal\", sdecimal)";
_setattrsingle("decimal",(Object)(_sdecimal));
 //BA.debugLineNum = 340;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 341;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdescrete() throws Exception{
 //BA.debugLineNum = 296;BA.debugLine="Sub SetDescrete As VMChartKick";
 //BA.debugLineNum = 297;BA.debugLine="SetAttrSingle(\":discrete\", \"true\")";
_setattrsingle(":discrete",(Object)("true"));
 //BA.debugLineNum = 298;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 299;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdisabled(boolean _b) throws Exception{
 //BA.debugLineNum = 440;BA.debugLine="Sub SetDisabled(b As Boolean) As VMChartKick";
 //BA.debugLineNum = 441;BA.debugLine="ChartKick.SetDisabled(b)";
_chartkick._setdisabled /*b4j.example.vmelement*/ (_b);
 //BA.debugLineNum = 442;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 443;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdonut() throws Exception{
 //BA.debugLineNum = 321;BA.debugLine="Sub SetDonut As VMChartKick";
 //BA.debugLineNum = 322;BA.debugLine="SetAttrSingle(\":donut\",\"true\")";
_setattrsingle(":donut",(Object)("true"));
 //BA.debugLineNum = 323;BA.debugLine="xAxes.display = False";
_xaxes.display /*boolean*/  = __c.False;
 //BA.debugLineNum = 324;BA.debugLine="yAxes.display = False";
_yaxes.display /*boolean*/  = __c.False;
 //BA.debugLineNum = 325;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 326;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdownload() throws Exception{
anywheresoftware.b4a.objects.collections.Map _obj = null;
String _objjson = "";
 //BA.debugLineNum = 368;BA.debugLine="Sub SetDownload As VMChartKick";
 //BA.debugLineNum = 369;BA.debugLine="Dim obj As Map = CreateMap()";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj = __c.createMap(new Object[] {});
 //BA.debugLineNum = 370;BA.debugLine="obj.Put(\"background\", \"#fff\")";
_obj.Put((Object)("background"),(Object)("#fff"));
 //BA.debugLineNum = 371;BA.debugLine="Dim objJSON As String = BANano.ToJson(obj)";
_objjson = BA.ObjectToString(_banano.ToJson((Object)(_obj.getObject())));
 //BA.debugLineNum = 372;BA.debugLine="objJSON = objJSON.Replace(QUOTE,\"'\")";
_objjson = _objjson.replace(__c.QUOTE,"'");
 //BA.debugLineNum = 373;BA.debugLine="SetAttrSingle(\":download\", objJSON)";
_setattrsingle(":download",(Object)(_objjson));
 //BA.debugLineNum = 374;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 375;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 387;BA.debugLine="Sub SetHeight(h As String) As VMChartKick";
 //BA.debugLineNum = 388;BA.debugLine="SetAttrSingle(\"height\", vue.MakePx(h))";
_setattrsingle("height",(Object)(_vue._makepx /*String*/ (_h)));
 //BA.debugLineNum = 389;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 390;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlabel(int _serieslabel) throws Exception{
 //BA.debugLineNum = 281;BA.debugLine="Sub SetLabel(seriesLabel As Int) As VMChartKick";
 //BA.debugLineNum = 282;BA.debugLine="SetAttrSingle(\"label\", seriesLabel)";
_setattrsingle("label",(Object)(_serieslabel));
 //BA.debugLineNum = 283;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 284;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlegendpositionbottom() throws Exception{
 //BA.debugLineNum = 306;BA.debugLine="Sub SetLegendPositionBottom As VMChartKick";
 //BA.debugLineNum = 307;BA.debugLine="SetAttrSingle(\"legend\", \"bottom\")";
_setattrsingle("legend",(Object)("bottom"));
 //BA.debugLineNum = 308;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 309;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlegendpositionright() throws Exception{
 //BA.debugLineNum = 316;BA.debugLine="Sub SetLegendPositionRight As VMChartKick";
 //BA.debugLineNum = 317;BA.debugLine="SetAttrSingle(\"legend\", \"right\")";
_setattrsingle("legend",(Object)("right"));
 //BA.debugLineNum = 318;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 319;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlegendpositiontop() throws Exception{
 //BA.debugLineNum = 311;BA.debugLine="Sub SetLegendPositionTop As VMChartKick";
 //BA.debugLineNum = 312;BA.debugLine="SetAttrSingle(\"legend\", \"top\")";
_setattrsingle("legend",(Object)("top"));
 //BA.debugLineNum = 313;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 314;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlinechart() throws Exception{
 //BA.debugLineNum = 403;BA.debugLine="Sub SetLineChart As VMChartKick";
 //BA.debugLineNum = 404;BA.debugLine="ChartKick.SetTag(\"line-chart\")";
_chartkick._settag /*b4j.example.vmelement*/ ("line-chart");
 //BA.debugLineNum = 405;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 406;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setmax(int _maxvalue) throws Exception{
 //BA.debugLineNum = 261;BA.debugLine="Sub SetMax(maxvalue As Int) As VMChartKick";
 //BA.debugLineNum = 262;BA.debugLine="SetAttrSingle(\":max\", maxvalue)";
_setattrsingle(":max",(Object)(_maxvalue));
 //BA.debugLineNum = 263;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 264;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setmin(int _minvalue) throws Exception{
 //BA.debugLineNum = 266;BA.debugLine="Sub SetMin(minvalue As Int) As VMChartKick";
 //BA.debugLineNum = 267;BA.debugLine="SetAttrSingle(\":min\", minvalue)";
_setattrsingle(":min",(Object)(_minvalue));
 //BA.debugLineNum = 268;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 269;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setpiechart() throws Exception{
 //BA.debugLineNum = 408;BA.debugLine="Sub SetPieChart As VMChartKick";
 //BA.debugLineNum = 409;BA.debugLine="ChartKick.settag(\"pie-chart\")";
_chartkick._settag /*b4j.example.vmelement*/ ("pie-chart");
 //BA.debugLineNum = 410;BA.debugLine="xAxes.display = False";
_xaxes.display /*boolean*/  = __c.False;
 //BA.debugLineNum = 411;BA.debugLine="yAxes.display = False";
_yaxes.display /*boolean*/  = __c.False;
 //BA.debugLineNum = 412;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 413;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setprecision(String _sprecision) throws Exception{
 //BA.debugLineNum = 343;BA.debugLine="Sub SetPrecision(sprecision As String) As VMChartK";
 //BA.debugLineNum = 344;BA.debugLine="SetAttrSingle(\":precision\", sprecision)";
_setattrsingle(":precision",(Object)(_sprecision));
 //BA.debugLineNum = 345;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 346;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setprefix(String _prefix) throws Exception{
 //BA.debugLineNum = 328;BA.debugLine="Sub SetPrefix(prefix As String) As VMChartKick";
 //BA.debugLineNum = 329;BA.debugLine="SetAttrSingle(\"prefix\", prefix)";
_setattrsingle("prefix",(Object)(_prefix));
 //BA.debugLineNum = 330;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 331;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setrefresh(int _refresh) throws Exception{
 //BA.debugLineNum = 363;BA.debugLine="Sub SetRefresh(refresh As Int) As VMChartKick";
 //BA.debugLineNum = 364;BA.debugLine="SetAttrSingle(\":refresh\", refresh)";
_setattrsingle(":refresh",(Object)(_refresh));
 //BA.debugLineNum = 365;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 366;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setround(String _sround) throws Exception{
 //BA.debugLineNum = 348;BA.debugLine="Sub SetRound(sround As String) As VMChartKick";
 //BA.debugLineNum = 349;BA.debugLine="SetAttrSingle(\":round\",sround)";
_setattrsingle(":round",(Object)(_sround));
 //BA.debugLineNum = 350;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 351;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setscatterchart() throws Exception{
 //BA.debugLineNum = 430;BA.debugLine="Sub SetScatterChart As VMChartKick";
 //BA.debugLineNum = 431;BA.debugLine="ChartKick.SetTag(\"scatter-chart\")";
_chartkick._settag /*b4j.example.vmelement*/ ("scatter-chart");
 //BA.debugLineNum = 432;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 433;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setstacked() throws Exception{
 //BA.debugLineNum = 291;BA.debugLine="Sub SetStacked As VMChartKick";
 //BA.debugLineNum = 292;BA.debugLine="SetAttrSingle(\"stacked\", \"true\")";
_setattrsingle("stacked",(Object)("true"));
 //BA.debugLineNum = 293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 244;BA.debugLine="Sub SetStyle(sm As Map) As VMChartKick";
 //BA.debugLineNum = 245;BA.debugLine="ChartKick.SetStyle(sm)";
_chartkick._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 246;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 247;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setstylesingle(String _prop,String _val) throws Exception{
anywheresoftware.b4a.objects.collections.Map _stylex = null;
 //BA.debugLineNum = 249;BA.debugLine="Sub SetStyleSingle(prop As String, val As String)";
 //BA.debugLineNum = 250;BA.debugLine="Dim stylex As Map = CreateMap()";
_stylex = new anywheresoftware.b4a.objects.collections.Map();
_stylex = __c.createMap(new Object[] {});
 //BA.debugLineNum = 251;BA.debugLine="stylex.Put(prop, val)";
_stylex.Put((Object)(_prop),(Object)(_val));
 //BA.debugLineNum = 252;BA.debugLine="SetStyle(stylex)";
_setstyle(_stylex);
 //BA.debugLineNum = 253;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 254;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setsuffix(String _suffix) throws Exception{
 //BA.debugLineNum = 377;BA.debugLine="Sub SetSuffix(suffix As String) As VMChartKick";
 //BA.debugLineNum = 378;BA.debugLine="SetAttrSingle(\"suffix\", suffix)";
_setattrsingle("suffix",(Object)(_suffix));
 //BA.debugLineNum = 379;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 380;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setthousands(String _sthousands) throws Exception{
 //BA.debugLineNum = 333;BA.debugLine="Sub SetThousands(sthousands As String) As VMChartK";
 //BA.debugLineNum = 334;BA.debugLine="SetAttrSingle(\"thousands\", sthousands)";
_setattrsingle("thousands",(Object)(_sthousands));
 //BA.debugLineNum = 335;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 336;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _settitle(String _txt) throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetTitle(txt As String) As VMChartKick";
 //BA.debugLineNum = 96;BA.debugLine="Title.text = txt";
_title.text /*String*/  = _txt;
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setvshow(String _vshow) throws Exception{
 //BA.debugLineNum = 435;BA.debugLine="Sub SetVShow(vshow As String) As VMChartKick";
 //BA.debugLineNum = 436;BA.debugLine="ChartKick.SetVShow(vshow)";
_chartkick._setvshow /*b4j.example.vmelement*/ (_vshow);
 //BA.debugLineNum = 437;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 438;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 382;BA.debugLine="Sub SetWidth(w As String) As VMChartKick";
 //BA.debugLineNum = 383;BA.debugLine="SetAttrSingle(\"width\", vue.makepx(w))";
_setattrsingle("width",(Object)(_vue._makepx /*String*/ (_w)));
 //BA.debugLineNum = 384;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 385;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setxmax(int _maxvalue) throws Exception{
 //BA.debugLineNum = 271;BA.debugLine="Sub SetXMax(maxvalue As Int) As VMChartKick";
 //BA.debugLineNum = 272;BA.debugLine="SetAttrSingle(\"xmax\", maxvalue)";
_setattrsingle("xmax",(Object)(_maxvalue));
 //BA.debugLineNum = 273;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 274;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setxmin(int _minvalue) throws Exception{
 //BA.debugLineNum = 276;BA.debugLine="Sub SetXMin(minvalue As Int) As VMChartKick";
 //BA.debugLineNum = 277;BA.debugLine="SetAttrSingle(\"xmin\", minvalue)";
_setattrsingle("xmin",(Object)(_minvalue));
 //BA.debugLineNum = 278;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 279;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setxtitle(String _xtitle) throws Exception{
 //BA.debugLineNum = 392;BA.debugLine="Sub SetXTitle(xtitle As String) As VMChartKick";
 //BA.debugLineNum = 393;BA.debugLine="SetAttrSingle(\"xtitle\", xtitle)";
_setattrsingle("xtitle",(Object)(_xtitle));
 //BA.debugLineNum = 394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setytitle(String _ytitle) throws Exception{
 //BA.debugLineNum = 397;BA.debugLine="Sub SetYTitle(ytitle As String) As VMChartKick";
 //BA.debugLineNum = 398;BA.debugLine="SetAttrSingle(\"ytitle\", ytitle)";
_setattrsingle("ytitle",(Object)(_ytitle));
 //BA.debugLineNum = 399;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 400;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setzeros() throws Exception{
 //BA.debugLineNum = 353;BA.debugLine="Sub SetZeros As VMChartKick";
 //BA.debugLineNum = 354;BA.debugLine="SetAttrSingle(\":zeros\", \"true\")";
_setattrsingle(":zeros",(Object)("true"));
 //BA.debugLineNum = 355;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
 //BA.debugLineNum = 356;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
String _plotjson = "";
anywheresoftware.b4a.objects.collections.List _serieslist = null;
String _serieskey = "";
String _k = "";
anywheresoftware.b4a.objects.collections.Map _obj = null;
anywheresoftware.b4a.objects.collections.List _plotlist = null;
String _colorjson = "";
 //BA.debugLineNum = 464;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 465;BA.debugLine="BuildOptions";
_buildoptions();
 //BA.debugLineNum = 466;BA.debugLine="Dim plotJSON As String = \"\"";
_plotjson = "";
 //BA.debugLineNum = 467;BA.debugLine="If series.Size > 0 Then";
if (_series.getSize()>0) { 
 //BA.debugLineNum = 468;BA.debugLine="Dim seriesList As List";
_serieslist = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 469;BA.debugLine="seriesList.Initialize";
_serieslist.Initialize();
 //BA.debugLineNum = 470;BA.debugLine="Dim seriesKey As String = $\"${ID}data\"$";
_serieskey = (""+__c.SmartStringFormatter("",(Object)(_id))+"data");
 //BA.debugLineNum = 471;BA.debugLine="For Each k As String In series.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = _series.Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.Get(index7));
 //BA.debugLineNum = 472;BA.debugLine="Dim obj As Map = series.Get(k)";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(_series.Get((Object)(_k))));
 //BA.debugLineNum = 473;BA.debugLine="seriesList.Add(obj)";
_serieslist.Add((Object)(_obj.getObject()));
 }
};
 //BA.debugLineNum = 475;BA.debugLine="vue.SetStateSingle(seriesKey, seriesList)";
_vue._setstatesingle /*b4j.example.bananovue*/ (_serieskey,(Object)(_serieslist.getObject()));
 //BA.debugLineNum = 476;BA.debugLine="SetData(seriesKey)";
_setdata(_serieskey);
 }else {
 //BA.debugLineNum = 478;BA.debugLine="Dim plotList As List = data.Get(\"a\")";
_plotlist = new anywheresoftware.b4a.objects.collections.List();
_plotlist.setObject((java.util.List)(_data.Get((Object)("a"))));
 //BA.debugLineNum = 479;BA.debugLine="plotJSON = BANano.ToJson(plotList)";
_plotjson = BA.ObjectToString(_banano.ToJson((Object)(_plotlist.getObject())));
 //BA.debugLineNum = 480;BA.debugLine="plotJSON = plotJSON.Replace(QUOTE,\"'\")";
_plotjson = _plotjson.replace(__c.QUOTE,"'");
 //BA.debugLineNum = 481;BA.debugLine="SetData(plotJSON)";
_setdata(_plotjson);
 };
 //BA.debugLineNum = 483;BA.debugLine="If colors.Size > 0 Then";
if (_colors.getSize()>0) { 
 //BA.debugLineNum = 484;BA.debugLine="Dim colorJSON As String = BANano.ToJson(colors)";
_colorjson = BA.ObjectToString(_banano.ToJson((Object)(_colors.getObject())));
 //BA.debugLineNum = 485;BA.debugLine="colorJSON = colorJSON.Replace(QUOTE,\"'\")";
_colorjson = _colorjson.replace(__c.QUOTE,"'");
 //BA.debugLineNum = 486;BA.debugLine="SetColors(colorJSON)";
_setcolors(_colorjson);
 };
 //BA.debugLineNum = 488;BA.debugLine="Return ChartKick.tostring";
if (true) return _chartkick._tostring /*String*/ ();
 //BA.debugLineNum = 489;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
