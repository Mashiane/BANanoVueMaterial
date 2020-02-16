package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmchartkick extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmchartkick", this);
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

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
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
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmchartkick  _initialize(b4j.example.vmchartkick __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
anywheresoftware.b4a.objects.collections.List _sl = null;
RDebugUtils.currentLine=80281600;
 //BA.debugLineNum = 80281600;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=80281601;
 //BA.debugLineNum = 80281601;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=80281602;
 //BA.debugLineNum = 80281602;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=80281603;
 //BA.debugLineNum = 80281603;BA.debugLine="ChartKick.Initialize(vue, ID)";
__ref._chartkick /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ );
RDebugUtils.currentLine=80281604;
 //BA.debugLineNum = 80281604;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=80281605;
 //BA.debugLineNum = 80281605;BA.debugLine="series.Initialize";
__ref._series /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=80281606;
 //BA.debugLineNum = 80281606;BA.debugLine="data.Initialize";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=80281607;
 //BA.debugLineNum = 80281607;BA.debugLine="colors.Initialize";
__ref._colors /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=80281608;
 //BA.debugLineNum = 80281608;BA.debugLine="Dim sl As List";
_sl = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=80281609;
 //BA.debugLineNum = 80281609;BA.debugLine="sl.Initialize";
_sl.Initialize();
RDebugUtils.currentLine=80281610;
 //BA.debugLineNum = 80281610;BA.debugLine="data.Put(\"a\",sl)";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("a"),(Object)(_sl.getObject()));
RDebugUtils.currentLine=80281611;
 //BA.debugLineNum = 80281611;BA.debugLine="SetStyleSingle(\"width\", \"100%\")";
__ref._setstylesingle /*b4j.example.vmchartkick*/ (null,"width","100%");
RDebugUtils.currentLine=80281612;
 //BA.debugLineNum = 80281612;BA.debugLine="ChartKick.RemoveAttr(\":required\")";
__ref._chartkick /*b4j.example.vmelement*/ ._removeattr /*b4j.example.vmelement*/ (null,":required");
RDebugUtils.currentLine=80281613;
 //BA.debugLineNum = 80281613;BA.debugLine="coptions = $\"${ID}options\"$";
__ref._coptions /*String*/  = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"options");
RDebugUtils.currentLine=80281614;
 //BA.debugLineNum = 80281614;BA.debugLine="SetDownload";
__ref._setdownload /*b4j.example.vmchartkick*/ (null);
RDebugUtils.currentLine=80281615;
 //BA.debugLineNum = 80281615;BA.debugLine="SetAttrSingle(\":library\", coptions)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":library",(Object)(__ref._coptions /*String*/ ));
RDebugUtils.currentLine=80281617;
 //BA.debugLineNum = 80281617;BA.debugLine="xAxes.Initialize";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .Initialize();
RDebugUtils.currentLine=80281618;
 //BA.debugLineNum = 80281618;BA.debugLine="xAxes.ticks.Initialize";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .Initialize();
RDebugUtils.currentLine=80281619;
 //BA.debugLineNum = 80281619;BA.debugLine="xAxes.gridLines.Initialize";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .Initialize();
RDebugUtils.currentLine=80281620;
 //BA.debugLineNum = 80281620;BA.debugLine="xAxes.display = True";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .display /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281621;
 //BA.debugLineNum = 80281621;BA.debugLine="xAxes.ticks.autoSkip = Null";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=80281622;
 //BA.debugLineNum = 80281622;BA.debugLine="xAxes.ticks.maxRotation = Null";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281623;
 //BA.debugLineNum = 80281623;BA.debugLine="xAxes.ticks.minRotation = Null";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281624;
 //BA.debugLineNum = 80281624;BA.debugLine="xAxes.ticks.MinValue = Null";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281625;
 //BA.debugLineNum = 80281625;BA.debugLine="xAxes.ticks.MaxValue = Null";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281626;
 //BA.debugLineNum = 80281626;BA.debugLine="xAxes.ticks.stepSize = Null";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281627;
 //BA.debugLineNum = 80281627;BA.debugLine="xAxes.ticks.beginAtZero = Null";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=80281629;
 //BA.debugLineNum = 80281629;BA.debugLine="xAxes.gridLines.display = True";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .display /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281630;
 //BA.debugLineNum = 80281630;BA.debugLine="xAxes.gridLines.circular = False";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .circular /*boolean*/  = __c.False;
RDebugUtils.currentLine=80281631;
 //BA.debugLineNum = 80281631;BA.debugLine="xAxes.gridLines.lineWidth = 1";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .lineWidth /*int*/  = (int) (1);
RDebugUtils.currentLine=80281632;
 //BA.debugLineNum = 80281632;BA.debugLine="xAxes.gridLines.drawBorder = True";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawBorder /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281633;
 //BA.debugLineNum = 80281633;BA.debugLine="xAxes.gridLines.drawOnChartArea = True";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawOnChartArea /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281634;
 //BA.debugLineNum = 80281634;BA.debugLine="xAxes.gridLines.drawTicks = True";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawTicks /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281635;
 //BA.debugLineNum = 80281635;BA.debugLine="xAxes.gridLines.tickMarkLength = 10";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .tickMarkLength /*int*/  = (int) (10);
RDebugUtils.currentLine=80281636;
 //BA.debugLineNum = 80281636;BA.debugLine="xAxes.gridLines.zeroLineWidth = 1";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .zeroLineWidth /*int*/  = (int) (1);
RDebugUtils.currentLine=80281637;
 //BA.debugLineNum = 80281637;BA.debugLine="xAxes.gridLines.offsetGridLines = False";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .offsetGridLines /*boolean*/  = __c.False;
RDebugUtils.currentLine=80281639;
 //BA.debugLineNum = 80281639;BA.debugLine="yAxes.Initialize";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .Initialize();
RDebugUtils.currentLine=80281640;
 //BA.debugLineNum = 80281640;BA.debugLine="yAxes.ticks.Initialize";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .Initialize();
RDebugUtils.currentLine=80281641;
 //BA.debugLineNum = 80281641;BA.debugLine="yAxes.gridLines.Initialize";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .Initialize();
RDebugUtils.currentLine=80281642;
 //BA.debugLineNum = 80281642;BA.debugLine="yAxes.display = True";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .display /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281643;
 //BA.debugLineNum = 80281643;BA.debugLine="yAxes.ticks.autoSkip = Null";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=80281644;
 //BA.debugLineNum = 80281644;BA.debugLine="yAxes.ticks.maxRotation = Null";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281645;
 //BA.debugLineNum = 80281645;BA.debugLine="yAxes.ticks.minRotation = Null";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281646;
 //BA.debugLineNum = 80281646;BA.debugLine="yAxes.ticks.MinValue = Null";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281647;
 //BA.debugLineNum = 80281647;BA.debugLine="yAxes.ticks.MaxValue = Null";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281648;
 //BA.debugLineNum = 80281648;BA.debugLine="yAxes.ticks.stepSize = Null";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/  = (int)(BA.ObjectToNumber(__c.Null));
RDebugUtils.currentLine=80281649;
 //BA.debugLineNum = 80281649;BA.debugLine="yAxes.ticks.beginAtZero = Null";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/  = BA.ObjectToBoolean(__c.Null);
RDebugUtils.currentLine=80281650;
 //BA.debugLineNum = 80281650;BA.debugLine="yAxes.gridLines.display = True";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .display /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281651;
 //BA.debugLineNum = 80281651;BA.debugLine="yAxes.gridLines.circular = False";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .circular /*boolean*/  = __c.False;
RDebugUtils.currentLine=80281652;
 //BA.debugLineNum = 80281652;BA.debugLine="yAxes.gridLines.lineWidth = 1";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .lineWidth /*int*/  = (int) (1);
RDebugUtils.currentLine=80281653;
 //BA.debugLineNum = 80281653;BA.debugLine="yAxes.gridLines.drawBorder = True";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawBorder /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281654;
 //BA.debugLineNum = 80281654;BA.debugLine="yAxes.gridLines.drawOnChartArea = True";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawOnChartArea /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281655;
 //BA.debugLineNum = 80281655;BA.debugLine="yAxes.gridLines.drawTicks = True";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawTicks /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281656;
 //BA.debugLineNum = 80281656;BA.debugLine="yAxes.gridLines.tickMarkLength = 10";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .tickMarkLength /*int*/  = (int) (10);
RDebugUtils.currentLine=80281657;
 //BA.debugLineNum = 80281657;BA.debugLine="yAxes.gridLines.zeroLineWidth = 1";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .zeroLineWidth /*int*/  = (int) (1);
RDebugUtils.currentLine=80281658;
 //BA.debugLineNum = 80281658;BA.debugLine="yAxes.gridLines.offsetGridLines = False";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .offsetGridLines /*boolean*/  = __c.False;
RDebugUtils.currentLine=80281661;
 //BA.debugLineNum = 80281661;BA.debugLine="Title.Initialize";
__ref._title /*b4j.example.vmchartkick._titletype*/ .Initialize();
RDebugUtils.currentLine=80281662;
 //BA.debugLineNum = 80281662;BA.debugLine="Title.display = True";
__ref._title /*b4j.example.vmchartkick._titletype*/ .display /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281663;
 //BA.debugLineNum = 80281663;BA.debugLine="Title.position = \"top\"";
__ref._title /*b4j.example.vmchartkick._titletype*/ .position /*String*/  = "top";
RDebugUtils.currentLine=80281664;
 //BA.debugLineNum = 80281664;BA.debugLine="Title.text = \"\"";
__ref._title /*b4j.example.vmchartkick._titletype*/ .text /*String*/  = "";
RDebugUtils.currentLine=80281666;
 //BA.debugLineNum = 80281666;BA.debugLine="OverwriteOptions = True";
__ref._overwriteoptions /*boolean*/  = __c.True;
RDebugUtils.currentLine=80281667;
 //BA.debugLineNum = 80281667;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80281668;
 //BA.debugLineNum = 80281668;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addbubble(b4j.example.vmchartkick __ref,String _x,String _y,String _size) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "addbubble", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "addbubble", new Object[] {_x,_y,_size}));}
anywheresoftware.b4a.objects.collections.List _exdata = null;
anywheresoftware.b4a.objects.collections.List _cudata = null;
RDebugUtils.currentLine=80740352;
 //BA.debugLineNum = 80740352;BA.debugLine="Sub AddBubble(X As String, y As String, size As St";
RDebugUtils.currentLine=80740354;
 //BA.debugLineNum = 80740354;BA.debugLine="Dim exdata As List = data.Get(\"a\")";
_exdata = new anywheresoftware.b4a.objects.collections.List();
_exdata.setObject((java.util.List)(__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("a"))));
RDebugUtils.currentLine=80740355;
 //BA.debugLineNum = 80740355;BA.debugLine="Dim cudata As List";
_cudata = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=80740356;
 //BA.debugLineNum = 80740356;BA.debugLine="cudata.Initialize";
_cudata.Initialize();
RDebugUtils.currentLine=80740357;
 //BA.debugLineNum = 80740357;BA.debugLine="cudata.Add(X)";
_cudata.Add((Object)(_x));
RDebugUtils.currentLine=80740358;
 //BA.debugLineNum = 80740358;BA.debugLine="cudata.Add(y)";
_cudata.Add((Object)(_y));
RDebugUtils.currentLine=80740359;
 //BA.debugLineNum = 80740359;BA.debugLine="cudata.Add(size)";
_cudata.Add((Object)(_size));
RDebugUtils.currentLine=80740360;
 //BA.debugLineNum = 80740360;BA.debugLine="exdata.Add(cudata)";
_exdata.Add((Object)(_cudata.getObject()));
RDebugUtils.currentLine=80740361;
 //BA.debugLineNum = 80740361;BA.debugLine="data.Put(\"a\",exdata)";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("a"),(Object)(_exdata.getObject()));
RDebugUtils.currentLine=80740362;
 //BA.debugLineNum = 80740362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80740363;
 //BA.debugLineNum = 80740363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addclass(b4j.example.vmchartkick __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=83296256;
 //BA.debugLineNum = 83296256;BA.debugLine="Sub AddClass(c As String) As VMChartKick";
RDebugUtils.currentLine=83296257;
 //BA.debugLineNum = 83296257;BA.debugLine="ChartKick.AddClass(c)";
__ref._chartkick /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=83296258;
 //BA.debugLineNum = 83296258;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=83296259;
 //BA.debugLineNum = 83296259;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addseries(b4j.example.vmchartkick __ref,String _seriescaption,String _seriescolor,boolean _seriescurve,anywheresoftware.b4a.objects.collections.Map _seriesdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "addseries", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "addseries", new Object[] {_seriescaption,_seriescolor,_seriescurve,_seriesdata}));}
anywheresoftware.b4a.objects.collections.Map _obj = null;
String _xcolor = "";
RDebugUtils.currentLine=80478208;
 //BA.debugLineNum = 80478208;BA.debugLine="Sub AddSeries(seriesCaption As String, seriesColor";
RDebugUtils.currentLine=80478209;
 //BA.debugLineNum = 80478209;BA.debugLine="Dim obj As Map = CreateMap()";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80478210;
 //BA.debugLineNum = 80478210;BA.debugLine="obj.Put(\"name\", seriesCaption)";
_obj.Put((Object)("name"),(Object)(_seriescaption));
RDebugUtils.currentLine=80478211;
 //BA.debugLineNum = 80478211;BA.debugLine="obj.Put(\"data\", seriesData)";
_obj.Put((Object)("data"),(Object)(_seriesdata.getObject()));
RDebugUtils.currentLine=80478212;
 //BA.debugLineNum = 80478212;BA.debugLine="obj.Put(\"curve\", seriesCurve)";
_obj.Put((Object)("curve"),(Object)(_seriescurve));
RDebugUtils.currentLine=80478213;
 //BA.debugLineNum = 80478213;BA.debugLine="obj.Put(\"label\", seriesCaption)";
_obj.Put((Object)("label"),(Object)(_seriescaption));
RDebugUtils.currentLine=80478214;
 //BA.debugLineNum = 80478214;BA.debugLine="If seriesColor <> \"\" Then";
if ((_seriescolor).equals("") == false) { 
RDebugUtils.currentLine=80478215;
 //BA.debugLineNum = 80478215;BA.debugLine="Dim xColor As String = vue.GetColorHex(seriesCol";
_xcolor = __ref._vue /*b4j.example.bananovue*/ ._getcolorhex /*String*/ (null,_seriescolor);
RDebugUtils.currentLine=80478216;
 //BA.debugLineNum = 80478216;BA.debugLine="obj.Put(\"color\", xColor)";
_obj.Put((Object)("color"),(Object)(_xcolor));
 };
RDebugUtils.currentLine=80478218;
 //BA.debugLineNum = 80478218;BA.debugLine="series.Put(seriesCaption, obj)";
__ref._series /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)(_seriescaption),(Object)(_obj.getObject()));
RDebugUtils.currentLine=80478219;
 //BA.debugLineNum = 80478219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80478220;
 //BA.debugLineNum = 80478220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addxy(b4j.example.vmchartkick __ref,String _x,String _y) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "addxy", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "addxy", new Object[] {_x,_y}));}
anywheresoftware.b4a.objects.collections.List _exdata = null;
anywheresoftware.b4a.objects.collections.List _cudata = null;
RDebugUtils.currentLine=80543744;
 //BA.debugLineNum = 80543744;BA.debugLine="Sub AddXY(X As String, y As String) As VMChartKick";
RDebugUtils.currentLine=80543746;
 //BA.debugLineNum = 80543746;BA.debugLine="Dim exdata As List = data.Get(\"a\")";
_exdata = new anywheresoftware.b4a.objects.collections.List();
_exdata.setObject((java.util.List)(__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("a"))));
RDebugUtils.currentLine=80543747;
 //BA.debugLineNum = 80543747;BA.debugLine="Dim cudata As List";
_cudata = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=80543748;
 //BA.debugLineNum = 80543748;BA.debugLine="cudata.Initialize";
_cudata.Initialize();
RDebugUtils.currentLine=80543749;
 //BA.debugLineNum = 80543749;BA.debugLine="cudata.Add(X)";
_cudata.Add((Object)(_x));
RDebugUtils.currentLine=80543750;
 //BA.debugLineNum = 80543750;BA.debugLine="cudata.Add(y)";
_cudata.Add((Object)(_y));
RDebugUtils.currentLine=80543751;
 //BA.debugLineNum = 80543751;BA.debugLine="exdata.Add(cudata)";
_exdata.Add((Object)(_cudata.getObject()));
RDebugUtils.currentLine=80543752;
 //BA.debugLineNum = 80543752;BA.debugLine="data.Put(\"a\",exdata)";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("a"),(Object)(_exdata.getObject()));
RDebugUtils.currentLine=80543753;
 //BA.debugLineNum = 80543753;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80543754;
 //BA.debugLineNum = 80543754;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addxycolor(b4j.example.vmchartkick __ref,String _x,String _y,String _color) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "addxycolor", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "addxycolor", new Object[] {_x,_y,_color}));}
anywheresoftware.b4a.objects.collections.List _exdata = null;
anywheresoftware.b4a.objects.collections.List _cudata = null;
String _xcolor = "";
RDebugUtils.currentLine=80609280;
 //BA.debugLineNum = 80609280;BA.debugLine="Sub AddXYColor(X As String, y As String, color As";
RDebugUtils.currentLine=80609282;
 //BA.debugLineNum = 80609282;BA.debugLine="Dim exdata As List = data.Get(\"a\")";
_exdata = new anywheresoftware.b4a.objects.collections.List();
_exdata.setObject((java.util.List)(__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("a"))));
RDebugUtils.currentLine=80609283;
 //BA.debugLineNum = 80609283;BA.debugLine="Dim cudata As List";
_cudata = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=80609284;
 //BA.debugLineNum = 80609284;BA.debugLine="cudata.Initialize";
_cudata.Initialize();
RDebugUtils.currentLine=80609285;
 //BA.debugLineNum = 80609285;BA.debugLine="cudata.Add(X)";
_cudata.Add((Object)(_x));
RDebugUtils.currentLine=80609286;
 //BA.debugLineNum = 80609286;BA.debugLine="cudata.Add(y)";
_cudata.Add((Object)(_y));
RDebugUtils.currentLine=80609287;
 //BA.debugLineNum = 80609287;BA.debugLine="exdata.Add(cudata)";
_exdata.Add((Object)(_cudata.getObject()));
RDebugUtils.currentLine=80609288;
 //BA.debugLineNum = 80609288;BA.debugLine="data.Put(\"a\",exdata)";
__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("a"),(Object)(_exdata.getObject()));
RDebugUtils.currentLine=80609289;
 //BA.debugLineNum = 80609289;BA.debugLine="If color <> \"\" Then";
if ((_color).equals("") == false) { 
RDebugUtils.currentLine=80609290;
 //BA.debugLineNum = 80609290;BA.debugLine="Dim xColor As String = vue.GetColorHex(color)";
_xcolor = __ref._vue /*b4j.example.bananovue*/ ._getcolorhex /*String*/ (null,_color);
RDebugUtils.currentLine=80609291;
 //BA.debugLineNum = 80609291;BA.debugLine="colors.Add(xColor)";
__ref._colors /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_xcolor));
 };
RDebugUtils.currentLine=80609293;
 //BA.debugLineNum = 80609293;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80609294;
 //BA.debugLineNum = 80609294;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _addxymap(b4j.example.vmchartkick __ref,anywheresoftware.b4a.objects.collections.Map _values) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "addxymap", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "addxymap", new Object[] {_values}));}
String _strkey = "";
String _strval = "";
RDebugUtils.currentLine=80674816;
 //BA.debugLineNum = 80674816;BA.debugLine="Sub AddXYMap(values As Map) As VMChartKick";
RDebugUtils.currentLine=80674817;
 //BA.debugLineNum = 80674817;BA.debugLine="For Each strKey As String In values.Keys";
{
final anywheresoftware.b4a.BA.IterableList group1 = _values.Keys();
final int groupLen1 = group1.getSize()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.Get(index1));
RDebugUtils.currentLine=80674818;
 //BA.debugLineNum = 80674818;BA.debugLine="Dim strVal As String = values.Get(strKey)";
_strval = BA.ObjectToString(_values.Get((Object)(_strkey)));
RDebugUtils.currentLine=80674819;
 //BA.debugLineNum = 80674819;BA.debugLine="AddXY(strKey,strVal)";
__ref._addxy /*b4j.example.vmchartkick*/ (null,_strkey,_strval);
 }
};
RDebugUtils.currentLine=80674821;
 //BA.debugLineNum = 80674821;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80674822;
 //BA.debugLineNum = 80674822;BA.debugLine="End Sub";
return null;
}
public String  _buildoptions(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "buildoptions", true))
	 {return ((String) Debug.delegate(ba, "buildoptions", null));}
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
RDebugUtils.currentLine=80412672;
 //BA.debugLineNum = 80412672;BA.debugLine="private Sub BuildOptions";
RDebugUtils.currentLine=80412673;
 //BA.debugLineNum = 80412673;BA.debugLine="Dim chartOptions As Map = CreateMap()";
_chartoptions = new anywheresoftware.b4a.objects.collections.Map();
_chartoptions = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80412674;
 //BA.debugLineNum = 80412674;BA.debugLine="Dim scales As Map = CreateMap()";
_scales = new anywheresoftware.b4a.objects.collections.Map();
_scales = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80412676;
 //BA.debugLineNum = 80412676;BA.debugLine="Dim xList As List";
_xlist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=80412677;
 //BA.debugLineNum = 80412677;BA.debugLine="Dim xticks As Map = CreateMap()";
_xticks = new anywheresoftware.b4a.objects.collections.Map();
_xticks = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80412678;
 //BA.debugLineNum = 80412678;BA.debugLine="Dim xsis As Map = CreateMap()";
_xsis = new anywheresoftware.b4a.objects.collections.Map();
_xsis = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80412679;
 //BA.debugLineNum = 80412679;BA.debugLine="Dim xgrid As Map = CreateMap()";
_xgrid = new anywheresoftware.b4a.objects.collections.Map();
_xgrid = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80412681;
 //BA.debugLineNum = 80412681;BA.debugLine="xList.Initialize";
_xlist.Initialize();
RDebugUtils.currentLine=80412682;
 //BA.debugLineNum = 80412682;BA.debugLine="If xAxes.ticks.autoSkip <> Null Then xticks.Put(\"";
if (__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
_xticks.Put((Object)("autoSkip"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/ ));};
RDebugUtils.currentLine=80412683;
 //BA.debugLineNum = 80412683;BA.debugLine="If xAxes.ticks.maxRotation <> Null Then xticks.Pu";
if (__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("maxRotation"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/ ));};
RDebugUtils.currentLine=80412684;
 //BA.debugLineNum = 80412684;BA.debugLine="If xAxes.ticks.minRotation <> Null Then xticks.Pu";
if (__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("minRotation"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/ ));};
RDebugUtils.currentLine=80412685;
 //BA.debugLineNum = 80412685;BA.debugLine="If xAxes.ticks.MinValue <> Null Then xticks.Put(\"";
if (__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("min"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/ ));};
RDebugUtils.currentLine=80412686;
 //BA.debugLineNum = 80412686;BA.debugLine="If xAxes.ticks.MaxValue <> Null Then xticks.Put(\"";
if (__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("max"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/ ));};
RDebugUtils.currentLine=80412687;
 //BA.debugLineNum = 80412687;BA.debugLine="If xAxes.ticks.stepSize <> Null Then xticks.Put(\"";
if (__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_xticks.Put((Object)("stepSize"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/ ));};
RDebugUtils.currentLine=80412688;
 //BA.debugLineNum = 80412688;BA.debugLine="If xAxes.ticks.beginAtZero <> Null Then xticks.Pu";
if (__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
_xticks.Put((Object)("beginAtZero"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/ ));};
RDebugUtils.currentLine=80412690;
 //BA.debugLineNum = 80412690;BA.debugLine="xgrid.Put(\"display\", xAxes.gridLines.display)";
_xgrid.Put((Object)("display"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .display /*boolean*/ ));
RDebugUtils.currentLine=80412691;
 //BA.debugLineNum = 80412691;BA.debugLine="xgrid.Put(\"circular\",xAxes.gridLines.circular)";
_xgrid.Put((Object)("circular"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .circular /*boolean*/ ));
RDebugUtils.currentLine=80412692;
 //BA.debugLineNum = 80412692;BA.debugLine="xgrid.Put(\"lineWidth\",xAxes.gridLines.lineWidth)";
_xgrid.Put((Object)("lineWidth"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .lineWidth /*int*/ ));
RDebugUtils.currentLine=80412693;
 //BA.debugLineNum = 80412693;BA.debugLine="xgrid.Put(\"drawBorder\",xAxes.gridLines.drawBorder";
_xgrid.Put((Object)("drawBorder"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawBorder /*boolean*/ ));
RDebugUtils.currentLine=80412694;
 //BA.debugLineNum = 80412694;BA.debugLine="xgrid.Put(\"drawOnChartArea\",xAxes.gridLines.drawO";
_xgrid.Put((Object)("drawOnChartArea"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawOnChartArea /*boolean*/ ));
RDebugUtils.currentLine=80412695;
 //BA.debugLineNum = 80412695;BA.debugLine="xgrid.Put(\"drawTicks\",xAxes.gridLines.drawTicks)";
_xgrid.Put((Object)("drawTicks"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawTicks /*boolean*/ ));
RDebugUtils.currentLine=80412696;
 //BA.debugLineNum = 80412696;BA.debugLine="xgrid.Put(\"tickMarkLength\",xAxes.gridLines.tickMa";
_xgrid.Put((Object)("tickMarkLength"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .tickMarkLength /*int*/ ));
RDebugUtils.currentLine=80412697;
 //BA.debugLineNum = 80412697;BA.debugLine="xgrid.Put(\"zeroLineWidth\",xAxes.gridLines.zeroLin";
_xgrid.Put((Object)("zeroLineWidth"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .zeroLineWidth /*int*/ ));
RDebugUtils.currentLine=80412698;
 //BA.debugLineNum = 80412698;BA.debugLine="xgrid.Put(\"offsetGridLines\",xAxes.gridLines.offse";
_xgrid.Put((Object)("offsetGridLines"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .offsetGridLines /*boolean*/ ));
RDebugUtils.currentLine=80412701;
 //BA.debugLineNum = 80412701;BA.debugLine="xsis.Put(\"display\", xAxes.display)";
_xsis.Put((Object)("display"),(Object)(__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .display /*boolean*/ ));
RDebugUtils.currentLine=80412702;
 //BA.debugLineNum = 80412702;BA.debugLine="If xticks.Size > 0 Then xsis.Put(\"ticks\", xticks)";
if (_xticks.getSize()>0) { 
_xsis.Put((Object)("ticks"),(Object)(_xticks.getObject()));};
RDebugUtils.currentLine=80412703;
 //BA.debugLineNum = 80412703;BA.debugLine="If xgrid.Size > 0 Then xsis.Put(\"gridLines\", xgri";
if (_xgrid.getSize()>0) { 
_xsis.Put((Object)("gridLines"),(Object)(_xgrid.getObject()));};
RDebugUtils.currentLine=80412704;
 //BA.debugLineNum = 80412704;BA.debugLine="xList.Add(xsis)";
_xlist.Add((Object)(_xsis.getObject()));
RDebugUtils.currentLine=80412705;
 //BA.debugLineNum = 80412705;BA.debugLine="scales.Put(\"xAxes\", xList)";
_scales.Put((Object)("xAxes"),(Object)(_xlist.getObject()));
RDebugUtils.currentLine=80412707;
 //BA.debugLineNum = 80412707;BA.debugLine="Dim yList As List";
_ylist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=80412708;
 //BA.debugLineNum = 80412708;BA.debugLine="Dim ysis As Map = CreateMap()";
_ysis = new anywheresoftware.b4a.objects.collections.Map();
_ysis = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80412709;
 //BA.debugLineNum = 80412709;BA.debugLine="Dim yticks As Map = CreateMap()";
_yticks = new anywheresoftware.b4a.objects.collections.Map();
_yticks = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80412710;
 //BA.debugLineNum = 80412710;BA.debugLine="Dim ygrid As Map = CreateMap()";
_ygrid = new anywheresoftware.b4a.objects.collections.Map();
_ygrid = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80412712;
 //BA.debugLineNum = 80412712;BA.debugLine="yList.Initialize";
_ylist.Initialize();
RDebugUtils.currentLine=80412713;
 //BA.debugLineNum = 80412713;BA.debugLine="If yAxes.ticks.autoSkip <> Null Then yticks.Put(\"";
if (__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
_yticks.Put((Object)("autoSkip"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .autoSkip /*boolean*/ ));};
RDebugUtils.currentLine=80412714;
 //BA.debugLineNum = 80412714;BA.debugLine="If yAxes.ticks.maxRotation <> Null Then yticks.Pu";
if (__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("maxRotation"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .maxRotation /*int*/ ));};
RDebugUtils.currentLine=80412715;
 //BA.debugLineNum = 80412715;BA.debugLine="If yAxes.ticks.minRotation <> Null Then yticks.Pu";
if (__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("minRotation"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .minRotation /*int*/ ));};
RDebugUtils.currentLine=80412716;
 //BA.debugLineNum = 80412716;BA.debugLine="If yAxes.ticks.MinValue <> Null Then yticks.Put(\"";
if (__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("min"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MinValue /*int*/ ));};
RDebugUtils.currentLine=80412717;
 //BA.debugLineNum = 80412717;BA.debugLine="If yAxes.ticks.MaxValue <> Null Then yticks.Put(\"";
if (__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("max"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .MaxValue /*int*/ ));};
RDebugUtils.currentLine=80412718;
 //BA.debugLineNum = 80412718;BA.debugLine="If yAxes.ticks.stepSize <> Null Then yticks.Put(\"";
if (__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/ !=(double)(BA.ObjectToNumber(__c.Null))) { 
_yticks.Put((Object)("stepSize"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .stepSize /*int*/ ));};
RDebugUtils.currentLine=80412719;
 //BA.debugLineNum = 80412719;BA.debugLine="If yAxes.ticks.beginAtZero <> Null Then yticks.Pu";
if (__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/ !=BA.ObjectToBoolean(__c.Null)) { 
_yticks.Put((Object)("beginAtZero"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .ticks /*b4j.example.vmchartkick._tickstype*/ .beginAtZero /*boolean*/ ));};
RDebugUtils.currentLine=80412721;
 //BA.debugLineNum = 80412721;BA.debugLine="ygrid.Put(\"display\", yAxes.gridLines.display)";
_ygrid.Put((Object)("display"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .display /*boolean*/ ));
RDebugUtils.currentLine=80412722;
 //BA.debugLineNum = 80412722;BA.debugLine="ygrid.Put(\"circular\",yAxes.gridLines.circular)";
_ygrid.Put((Object)("circular"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .circular /*boolean*/ ));
RDebugUtils.currentLine=80412723;
 //BA.debugLineNum = 80412723;BA.debugLine="ygrid.Put(\"lineWidth\",yAxes.gridLines.lineWidth)";
_ygrid.Put((Object)("lineWidth"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .lineWidth /*int*/ ));
RDebugUtils.currentLine=80412724;
 //BA.debugLineNum = 80412724;BA.debugLine="ygrid.Put(\"drawBorder\",yAxes.gridLines.drawBorder";
_ygrid.Put((Object)("drawBorder"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawBorder /*boolean*/ ));
RDebugUtils.currentLine=80412725;
 //BA.debugLineNum = 80412725;BA.debugLine="ygrid.Put(\"drawOnChartArea\",yAxes.gridLines.drawO";
_ygrid.Put((Object)("drawOnChartArea"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawOnChartArea /*boolean*/ ));
RDebugUtils.currentLine=80412726;
 //BA.debugLineNum = 80412726;BA.debugLine="ygrid.Put(\"drawTicks\",yAxes.gridLines.drawTicks)";
_ygrid.Put((Object)("drawTicks"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .drawTicks /*boolean*/ ));
RDebugUtils.currentLine=80412727;
 //BA.debugLineNum = 80412727;BA.debugLine="ygrid.Put(\"tickMarkLength\",yAxes.gridLines.tickMa";
_ygrid.Put((Object)("tickMarkLength"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .tickMarkLength /*int*/ ));
RDebugUtils.currentLine=80412728;
 //BA.debugLineNum = 80412728;BA.debugLine="ygrid.Put(\"zeroLineWidth\",yAxes.gridLines.zeroLin";
_ygrid.Put((Object)("zeroLineWidth"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .zeroLineWidth /*int*/ ));
RDebugUtils.currentLine=80412729;
 //BA.debugLineNum = 80412729;BA.debugLine="ygrid.Put(\"offsetGridLines\",yAxes.gridLines.offse";
_ygrid.Put((Object)("offsetGridLines"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .gridLines /*b4j.example.vmchartkick._grdline*/ .offsetGridLines /*boolean*/ ));
RDebugUtils.currentLine=80412731;
 //BA.debugLineNum = 80412731;BA.debugLine="ysis.Put(\"display\", yAxes.display)";
_ysis.Put((Object)("display"),(Object)(__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .display /*boolean*/ ));
RDebugUtils.currentLine=80412732;
 //BA.debugLineNum = 80412732;BA.debugLine="If yticks.Size > 0 Then ysis.Put(\"ticks\", yticks)";
if (_yticks.getSize()>0) { 
_ysis.Put((Object)("ticks"),(Object)(_yticks.getObject()));};
RDebugUtils.currentLine=80412733;
 //BA.debugLineNum = 80412733;BA.debugLine="If ygrid.Size > 0 Then ysis.Put(\"gridLines\", ygri";
if (_ygrid.getSize()>0) { 
_ysis.Put((Object)("gridLines"),(Object)(_ygrid.getObject()));};
RDebugUtils.currentLine=80412734;
 //BA.debugLineNum = 80412734;BA.debugLine="yList.Add(ysis)";
_ylist.Add((Object)(_ysis.getObject()));
RDebugUtils.currentLine=80412735;
 //BA.debugLineNum = 80412735;BA.debugLine="scales.Put(\"yAxes\", yList)";
_scales.Put((Object)("yAxes"),(Object)(_ylist.getObject()));
RDebugUtils.currentLine=80412737;
 //BA.debugLineNum = 80412737;BA.debugLine="chartOptions.Put(\"scales\", scales)";
_chartoptions.Put((Object)("scales"),(Object)(_scales.getObject()));
RDebugUtils.currentLine=80412739;
 //BA.debugLineNum = 80412739;BA.debugLine="Dim titObj As Map = CreateMap()";
_titobj = new anywheresoftware.b4a.objects.collections.Map();
_titobj = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80412740;
 //BA.debugLineNum = 80412740;BA.debugLine="titObj.Put(\"display\", Title.display)";
_titobj.Put((Object)("display"),(Object)(__ref._title /*b4j.example.vmchartkick._titletype*/ .display /*boolean*/ ));
RDebugUtils.currentLine=80412741;
 //BA.debugLineNum = 80412741;BA.debugLine="titObj.Put(\"text\", Title.text)";
_titobj.Put((Object)("text"),(Object)(__ref._title /*b4j.example.vmchartkick._titletype*/ .text /*String*/ ));
RDebugUtils.currentLine=80412742;
 //BA.debugLineNum = 80412742;BA.debugLine="chartOptions.Put(\"title\", titObj)";
_chartoptions.Put((Object)("title"),(Object)(_titobj.getObject()));
RDebugUtils.currentLine=80412744;
 //BA.debugLineNum = 80412744;BA.debugLine="vue.SetStateSingle(coptions, chartOptions)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,__ref._coptions /*String*/ ,(Object)(_chartoptions.getObject()));
RDebugUtils.currentLine=80412745;
 //BA.debugLineNum = 80412745;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
RDebugUtils.currentLine=80216064;
 //BA.debugLineNum = 80216064;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=80216065;
 //BA.debugLineNum = 80216065;BA.debugLine="Public ChartKick As VMElement";
_chartkick = new b4j.example.vmelement();
RDebugUtils.currentLine=80216066;
 //BA.debugLineNum = 80216066;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=80216067;
 //BA.debugLineNum = 80216067;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=80216068;
 //BA.debugLineNum = 80216068;BA.debugLine="Private BANano As BANano   'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=80216069;
 //BA.debugLineNum = 80216069;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=80216071;
 //BA.debugLineNum = 80216071;BA.debugLine="Private series As Map";
_series = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=80216072;
 //BA.debugLineNum = 80216072;BA.debugLine="Private data As Map";
_data = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=80216073;
 //BA.debugLineNum = 80216073;BA.debugLine="Private colors As List";
_colors = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=80216074;
 //BA.debugLineNum = 80216074;BA.debugLine="Private coptions As String";
_coptions = "";
RDebugUtils.currentLine=80216075;
 //BA.debugLineNum = 80216075;BA.debugLine="Type grdLine(display As Boolean, circular As Bool";
;
RDebugUtils.currentLine=80216077;
 //BA.debugLineNum = 80216077;BA.debugLine="Type ticksType(autoSkip As Boolean, maxRotation A";
;
RDebugUtils.currentLine=80216079;
 //BA.debugLineNum = 80216079;BA.debugLine="Type xAxesType(display As Boolean, ticks As ticks";
;
RDebugUtils.currentLine=80216080;
 //BA.debugLineNum = 80216080;BA.debugLine="Public xAxes As xAxesType";
_xaxes = new b4j.example.vmchartkick._xaxestype();
RDebugUtils.currentLine=80216081;
 //BA.debugLineNum = 80216081;BA.debugLine="Public yAxes As xAxesType";
_yaxes = new b4j.example.vmchartkick._xaxestype();
RDebugUtils.currentLine=80216082;
 //BA.debugLineNum = 80216082;BA.debugLine="Public OverwriteOptions As Boolean";
_overwriteoptions = false;
RDebugUtils.currentLine=80216083;
 //BA.debugLineNum = 80216083;BA.debugLine="Type titleType(display As Boolean, text As String";
;
RDebugUtils.currentLine=80216084;
 //BA.debugLineNum = 80216084;BA.debugLine="Public Title As titleType";
_title = new b4j.example.vmchartkick._titletype();
RDebugUtils.currentLine=80216085;
 //BA.debugLineNum = 80216085;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchartkick  _setstylesingle(b4j.example.vmchartkick __ref,String _prop,String _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setstylesingle", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setstylesingle", new Object[] {_prop,_val}));}
anywheresoftware.b4a.objects.collections.Map _stylex = null;
RDebugUtils.currentLine=80871424;
 //BA.debugLineNum = 80871424;BA.debugLine="Sub SetStyleSingle(prop As String, val As String)";
RDebugUtils.currentLine=80871425;
 //BA.debugLineNum = 80871425;BA.debugLine="Dim stylex As Map = CreateMap()";
_stylex = new anywheresoftware.b4a.objects.collections.Map();
_stylex = __c.createMap(new Object[] {});
RDebugUtils.currentLine=80871426;
 //BA.debugLineNum = 80871426;BA.debugLine="stylex.Put(prop, val)";
_stylex.Put((Object)(_prop),(Object)(_val));
RDebugUtils.currentLine=80871427;
 //BA.debugLineNum = 80871427;BA.debugLine="SetStyle(stylex)";
__ref._setstyle /*b4j.example.vmchartkick*/ (null,_stylex);
RDebugUtils.currentLine=80871428;
 //BA.debugLineNum = 80871428;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80871429;
 //BA.debugLineNum = 80871429;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdownload(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setdownload", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setdownload", null));}
anywheresoftware.b4a.objects.collections.Map _obj = null;
String _objjson = "";
RDebugUtils.currentLine=82378752;
 //BA.debugLineNum = 82378752;BA.debugLine="Sub SetDownload As VMChartKick";
RDebugUtils.currentLine=82378753;
 //BA.debugLineNum = 82378753;BA.debugLine="Dim obj As Map = CreateMap()";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj = __c.createMap(new Object[] {});
RDebugUtils.currentLine=82378754;
 //BA.debugLineNum = 82378754;BA.debugLine="obj.Put(\"background\", \"#fff\")";
_obj.Put((Object)("background"),(Object)("#fff"));
RDebugUtils.currentLine=82378755;
 //BA.debugLineNum = 82378755;BA.debugLine="Dim objJSON As String = BANano.ToJson(obj)";
_objjson = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(_obj.getObject())));
RDebugUtils.currentLine=82378756;
 //BA.debugLineNum = 82378756;BA.debugLine="objJSON = objJSON.Replace(QUOTE,\"'\")";
_objjson = _objjson.replace(__c.QUOTE,"'");
RDebugUtils.currentLine=82378757;
 //BA.debugLineNum = 82378757;BA.debugLine="SetAttrSingle(\":download\", objJSON)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":download",(Object)(_objjson));
RDebugUtils.currentLine=82378758;
 //BA.debugLineNum = 82378758;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82378759;
 //BA.debugLineNum = 82378759;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setattrsingle(b4j.example.vmchartkick __ref,String _prop,Object _val) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setattrsingle", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setattrsingle", new Object[] {_prop,_val}));}
anywheresoftware.b4a.objects.collections.Map _attr = null;
RDebugUtils.currentLine=83427328;
 //BA.debugLineNum = 83427328;BA.debugLine="Sub SetAttrSingle(prop As String, val As Object) A";
RDebugUtils.currentLine=83427329;
 //BA.debugLineNum = 83427329;BA.debugLine="Dim attr As Map = CreateMap()";
_attr = new anywheresoftware.b4a.objects.collections.Map();
_attr = __c.createMap(new Object[] {});
RDebugUtils.currentLine=83427330;
 //BA.debugLineNum = 83427330;BA.debugLine="attr.Put(prop, val)";
_attr.Put((Object)(_prop),_val);
RDebugUtils.currentLine=83427331;
 //BA.debugLineNum = 83427331;BA.debugLine="SetAttr(attr)";
__ref._setattr /*b4j.example.vmchartkick*/ (null,_attr);
RDebugUtils.currentLine=83427332;
 //BA.debugLineNum = 83427332;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=83427333;
 //BA.debugLineNum = 83427333;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmchartkick __ref,b4j.example.vmelement _p) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_p}));}
RDebugUtils.currentLine=83623936;
 //BA.debugLineNum = 83623936;BA.debugLine="Sub Pop(p As VMElement)";
RDebugUtils.currentLine=83623937;
 //BA.debugLineNum = 83623937;BA.debugLine="p.SetText(ToString)";
_p._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=83623938;
 //BA.debugLineNum = 83623938;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
String _plotjson = "";
anywheresoftware.b4a.objects.collections.List _serieslist = null;
String _serieskey = "";
String _k = "";
anywheresoftware.b4a.objects.collections.Map _obj = null;
anywheresoftware.b4a.objects.collections.List _plotlist = null;
String _colorjson = "";
RDebugUtils.currentLine=83492864;
 //BA.debugLineNum = 83492864;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=83492865;
 //BA.debugLineNum = 83492865;BA.debugLine="BuildOptions";
__ref._buildoptions /*String*/ (null);
RDebugUtils.currentLine=83492866;
 //BA.debugLineNum = 83492866;BA.debugLine="Dim plotJSON As String = \"\"";
_plotjson = "";
RDebugUtils.currentLine=83492867;
 //BA.debugLineNum = 83492867;BA.debugLine="If series.Size > 0 Then";
if (__ref._series /*anywheresoftware.b4a.objects.collections.Map*/ .getSize()>0) { 
RDebugUtils.currentLine=83492868;
 //BA.debugLineNum = 83492868;BA.debugLine="Dim seriesList As List";
_serieslist = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=83492869;
 //BA.debugLineNum = 83492869;BA.debugLine="seriesList.Initialize";
_serieslist.Initialize();
RDebugUtils.currentLine=83492870;
 //BA.debugLineNum = 83492870;BA.debugLine="Dim seriesKey As String = $\"${ID}data\"$";
_serieskey = (""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"data");
RDebugUtils.currentLine=83492871;
 //BA.debugLineNum = 83492871;BA.debugLine="For Each k As String In series.Keys";
{
final anywheresoftware.b4a.BA.IterableList group7 = __ref._series /*anywheresoftware.b4a.objects.collections.Map*/ .Keys();
final int groupLen7 = group7.getSize()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.Get(index7));
RDebugUtils.currentLine=83492872;
 //BA.debugLineNum = 83492872;BA.debugLine="Dim obj As Map = series.Get(k)";
_obj = new anywheresoftware.b4a.objects.collections.Map();
_obj.setObject((anywheresoftware.b4a.objects.collections.Map.MyMap)(__ref._series /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)(_k))));
RDebugUtils.currentLine=83492873;
 //BA.debugLineNum = 83492873;BA.debugLine="seriesList.Add(obj)";
_serieslist.Add((Object)(_obj.getObject()));
 }
};
RDebugUtils.currentLine=83492875;
 //BA.debugLineNum = 83492875;BA.debugLine="vue.SetStateSingle(seriesKey, seriesList)";
__ref._vue /*b4j.example.bananovue*/ ._setstatesingle /*b4j.example.bananovue*/ (null,_serieskey,(Object)(_serieslist.getObject()));
RDebugUtils.currentLine=83492876;
 //BA.debugLineNum = 83492876;BA.debugLine="SetData(seriesKey)";
__ref._setdata /*b4j.example.vmchartkick*/ (null,_serieskey);
 }else {
RDebugUtils.currentLine=83492878;
 //BA.debugLineNum = 83492878;BA.debugLine="Dim plotList As List = data.Get(\"a\")";
_plotlist = new anywheresoftware.b4a.objects.collections.List();
_plotlist.setObject((java.util.List)(__ref._data /*anywheresoftware.b4a.objects.collections.Map*/ .Get((Object)("a"))));
RDebugUtils.currentLine=83492879;
 //BA.debugLineNum = 83492879;BA.debugLine="plotJSON = BANano.ToJson(plotList)";
_plotjson = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(_plotlist.getObject())));
RDebugUtils.currentLine=83492880;
 //BA.debugLineNum = 83492880;BA.debugLine="plotJSON = plotJSON.Replace(QUOTE,\"'\")";
_plotjson = _plotjson.replace(__c.QUOTE,"'");
RDebugUtils.currentLine=83492881;
 //BA.debugLineNum = 83492881;BA.debugLine="SetData(plotJSON)";
__ref._setdata /*b4j.example.vmchartkick*/ (null,_plotjson);
 };
RDebugUtils.currentLine=83492883;
 //BA.debugLineNum = 83492883;BA.debugLine="If colors.Size > 0 Then";
if (__ref._colors /*anywheresoftware.b4a.objects.collections.List*/ .getSize()>0) { 
RDebugUtils.currentLine=83492884;
 //BA.debugLineNum = 83492884;BA.debugLine="Dim colorJSON As String = BANano.ToJson(colors)";
_colorjson = BA.ObjectToString(__ref._banano /*com.ab.banano.BANano*/ .ToJson((Object)(__ref._colors /*anywheresoftware.b4a.objects.collections.List*/ .getObject())));
RDebugUtils.currentLine=83492885;
 //BA.debugLineNum = 83492885;BA.debugLine="colorJSON = colorJSON.Replace(QUOTE,\"'\")";
_colorjson = _colorjson.replace(__c.QUOTE,"'");
RDebugUtils.currentLine=83492886;
 //BA.debugLineNum = 83492886;BA.debugLine="SetColors(colorJSON)";
__ref._setcolors /*b4j.example.vmchartkick*/ (null,_colorjson);
 };
RDebugUtils.currentLine=83492888;
 //BA.debugLineNum = 83492888;BA.debugLine="Return ChartKick.tostring";
if (true) return __ref._chartkick /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=83492889;
 //BA.debugLineNum = 83492889;BA.debugLine="End Sub";
return "";
}
public String  _render(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=83558400;
 //BA.debugLineNum = 83558400;BA.debugLine="Sub Render";
RDebugUtils.currentLine=83558401;
 //BA.debugLineNum = 83558401;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=83558402;
 //BA.debugLineNum = 83558402;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmchartkick  _setareachart(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setareachart", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setareachart", null));}
RDebugUtils.currentLine=83034112;
 //BA.debugLineNum = 83034112;BA.debugLine="Sub SetAreaChart As VMChartKick";
RDebugUtils.currentLine=83034113;
 //BA.debugLineNum = 83034113;BA.debugLine="ChartKick.SetTag(\"area-chart\")";
__ref._chartkick /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"area-chart");
RDebugUtils.currentLine=83034114;
 //BA.debugLineNum = 83034114;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=83034115;
 //BA.debugLineNum = 83034115;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setattr(b4j.example.vmchartkick __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=83361792;
 //BA.debugLineNum = 83361792;BA.debugLine="Sub SetAttr(attr As Map) As VMChartKick";
RDebugUtils.currentLine=83361793;
 //BA.debugLineNum = 83361793;BA.debugLine="ChartKick.SetAttr(attr)";
__ref._chartkick /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=83361794;
 //BA.debugLineNum = 83361794;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=83361795;
 //BA.debugLineNum = 83361795;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setbarchart(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setbarchart", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setbarchart", null));}
RDebugUtils.currentLine=82903040;
 //BA.debugLineNum = 82903040;BA.debugLine="Sub SetBarChart As VMChartKick";
RDebugUtils.currentLine=82903041;
 //BA.debugLineNum = 82903041;BA.debugLine="ChartKick.SetTag(\"bar-chart\")";
__ref._chartkick /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"bar-chart");
RDebugUtils.currentLine=82903042;
 //BA.debugLineNum = 82903042;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82903043;
 //BA.debugLineNum = 82903043;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setbytes(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setbytes", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setbytes", null));}
RDebugUtils.currentLine=82247680;
 //BA.debugLineNum = 82247680;BA.debugLine="Sub SetBytes As VMChartKick";
RDebugUtils.currentLine=82247681;
 //BA.debugLineNum = 82247681;BA.debugLine="SetAttrSingle(\":bytes\", \"true\")";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":bytes",(Object)("true"));
RDebugUtils.currentLine=82247682;
 //BA.debugLineNum = 82247682;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82247683;
 //BA.debugLineNum = 82247683;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setcolors(b4j.example.vmchartkick __ref,String _lcolors) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setcolors", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setcolors", new Object[] {_lcolors}));}
RDebugUtils.currentLine=81330176;
 //BA.debugLineNum = 81330176;BA.debugLine="private Sub SetColors(lcolors As String) As VMChar";
RDebugUtils.currentLine=81330177;
 //BA.debugLineNum = 81330177;BA.debugLine="SetAttrSingle(\":colors\", lcolors)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":colors",(Object)(_lcolors));
RDebugUtils.currentLine=81330178;
 //BA.debugLineNum = 81330178;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81330179;
 //BA.debugLineNum = 81330179;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setcolumnchart(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setcolumnchart", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setcolumnchart", null));}
RDebugUtils.currentLine=82968576;
 //BA.debugLineNum = 82968576;BA.debugLine="Sub SetColumnChart As VMChartKick";
RDebugUtils.currentLine=82968577;
 //BA.debugLineNum = 82968577;BA.debugLine="ChartKick.SetTag(\"column-chart\")";
__ref._chartkick /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"column-chart");
RDebugUtils.currentLine=82968578;
 //BA.debugLineNum = 82968578;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82968579;
 //BA.debugLineNum = 82968579;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setcurve(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setcurve", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setcurve", null));}
RDebugUtils.currentLine=81526784;
 //BA.debugLineNum = 81526784;BA.debugLine="Sub SetCurve As VMChartKick";
RDebugUtils.currentLine=81526785;
 //BA.debugLineNum = 81526785;BA.debugLine="SetAttrSingle(\":curve\", \"true\")";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":curve",(Object)("true"));
RDebugUtils.currentLine=81526786;
 //BA.debugLineNum = 81526786;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81526787;
 //BA.debugLineNum = 81526787;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdata(b4j.example.vmchartkick __ref,String _chartdata) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setdata", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setdata", new Object[] {_chartdata}));}
RDebugUtils.currentLine=80936960;
 //BA.debugLineNum = 80936960;BA.debugLine="private Sub SetData(chartData As String) As VMChar";
RDebugUtils.currentLine=80936961;
 //BA.debugLineNum = 80936961;BA.debugLine="SetAttrSingle(\":data\", chartData)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":data",(Object)(_chartdata));
RDebugUtils.currentLine=80936962;
 //BA.debugLineNum = 80936962;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80936963;
 //BA.debugLineNum = 80936963;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdecimal(b4j.example.vmchartkick __ref,String _sdecimal) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setdecimal", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setdecimal", new Object[] {_sdecimal}));}
RDebugUtils.currentLine=81985536;
 //BA.debugLineNum = 81985536;BA.debugLine="Sub SetDecimal(sdecimal As String) As VMChartKick";
RDebugUtils.currentLine=81985537;
 //BA.debugLineNum = 81985537;BA.debugLine="SetAttrSingle(\"decimal\", sdecimal)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"decimal",(Object)(_sdecimal));
RDebugUtils.currentLine=81985538;
 //BA.debugLineNum = 81985538;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81985539;
 //BA.debugLineNum = 81985539;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdescrete(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setdescrete", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setdescrete", null));}
RDebugUtils.currentLine=81461248;
 //BA.debugLineNum = 81461248;BA.debugLine="Sub SetDescrete As VMChartKick";
RDebugUtils.currentLine=81461249;
 //BA.debugLineNum = 81461249;BA.debugLine="SetAttrSingle(\":discrete\", \"true\")";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":discrete",(Object)("true"));
RDebugUtils.currentLine=81461250;
 //BA.debugLineNum = 81461250;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81461251;
 //BA.debugLineNum = 81461251;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdisabled(b4j.example.vmchartkick __ref,boolean _b) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setdisabled", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setdisabled", new Object[] {_b}));}
RDebugUtils.currentLine=83230720;
 //BA.debugLineNum = 83230720;BA.debugLine="Sub SetDisabled(b As Boolean) As VMChartKick";
RDebugUtils.currentLine=83230721;
 //BA.debugLineNum = 83230721;BA.debugLine="ChartKick.SetDisabled(b)";
__ref._chartkick /*b4j.example.vmelement*/ ._setdisabled /*b4j.example.vmelement*/ (null,_b);
RDebugUtils.currentLine=83230722;
 //BA.debugLineNum = 83230722;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=83230723;
 //BA.debugLineNum = 83230723;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setdonut(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setdonut", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setdonut", null));}
RDebugUtils.currentLine=81788928;
 //BA.debugLineNum = 81788928;BA.debugLine="Sub SetDonut As VMChartKick";
RDebugUtils.currentLine=81788929;
 //BA.debugLineNum = 81788929;BA.debugLine="SetAttrSingle(\":donut\",\"true\")";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":donut",(Object)("true"));
RDebugUtils.currentLine=81788930;
 //BA.debugLineNum = 81788930;BA.debugLine="xAxes.display = False";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .display /*boolean*/  = __c.False;
RDebugUtils.currentLine=81788931;
 //BA.debugLineNum = 81788931;BA.debugLine="yAxes.display = False";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .display /*boolean*/  = __c.False;
RDebugUtils.currentLine=81788932;
 //BA.debugLineNum = 81788932;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81788933;
 //BA.debugLineNum = 81788933;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setheight(b4j.example.vmchartkick __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=82575360;
 //BA.debugLineNum = 82575360;BA.debugLine="Sub SetHeight(h As String) As VMChartKick";
RDebugUtils.currentLine=82575361;
 //BA.debugLineNum = 82575361;BA.debugLine="SetAttrSingle(\"height\", vue.MakePx(h))";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"height",(Object)(__ref._vue /*b4j.example.bananovue*/ ._makepx /*String*/ (null,_h)));
RDebugUtils.currentLine=82575362;
 //BA.debugLineNum = 82575362;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82575363;
 //BA.debugLineNum = 82575363;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlabel(b4j.example.vmchartkick __ref,int _serieslabel) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setlabel", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setlabel", new Object[] {_serieslabel}));}
RDebugUtils.currentLine=81264640;
 //BA.debugLineNum = 81264640;BA.debugLine="Sub SetLabel(seriesLabel As Int) As VMChartKick";
RDebugUtils.currentLine=81264641;
 //BA.debugLineNum = 81264641;BA.debugLine="SetAttrSingle(\"label\", seriesLabel)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"label",(Object)(_serieslabel));
RDebugUtils.currentLine=81264642;
 //BA.debugLineNum = 81264642;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81264643;
 //BA.debugLineNum = 81264643;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlegendpositionbottom(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setlegendpositionbottom", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setlegendpositionbottom", null));}
RDebugUtils.currentLine=81592320;
 //BA.debugLineNum = 81592320;BA.debugLine="Sub SetLegendPositionBottom As VMChartKick";
RDebugUtils.currentLine=81592321;
 //BA.debugLineNum = 81592321;BA.debugLine="SetAttrSingle(\"legend\", \"bottom\")";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"legend",(Object)("bottom"));
RDebugUtils.currentLine=81592322;
 //BA.debugLineNum = 81592322;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81592323;
 //BA.debugLineNum = 81592323;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlegendpositionright(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setlegendpositionright", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setlegendpositionright", null));}
RDebugUtils.currentLine=81723392;
 //BA.debugLineNum = 81723392;BA.debugLine="Sub SetLegendPositionRight As VMChartKick";
RDebugUtils.currentLine=81723393;
 //BA.debugLineNum = 81723393;BA.debugLine="SetAttrSingle(\"legend\", \"right\")";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"legend",(Object)("right"));
RDebugUtils.currentLine=81723394;
 //BA.debugLineNum = 81723394;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81723395;
 //BA.debugLineNum = 81723395;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlegendpositiontop(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setlegendpositiontop", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setlegendpositiontop", null));}
RDebugUtils.currentLine=81657856;
 //BA.debugLineNum = 81657856;BA.debugLine="Sub SetLegendPositionTop As VMChartKick";
RDebugUtils.currentLine=81657857;
 //BA.debugLineNum = 81657857;BA.debugLine="SetAttrSingle(\"legend\", \"top\")";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"legend",(Object)("top"));
RDebugUtils.currentLine=81657858;
 //BA.debugLineNum = 81657858;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81657859;
 //BA.debugLineNum = 81657859;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setlinechart(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setlinechart", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setlinechart", null));}
RDebugUtils.currentLine=82771968;
 //BA.debugLineNum = 82771968;BA.debugLine="Sub SetLineChart As VMChartKick";
RDebugUtils.currentLine=82771969;
 //BA.debugLineNum = 82771969;BA.debugLine="ChartKick.SetTag(\"line-chart\")";
__ref._chartkick /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"line-chart");
RDebugUtils.currentLine=82771970;
 //BA.debugLineNum = 82771970;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82771971;
 //BA.debugLineNum = 82771971;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setmax(b4j.example.vmchartkick __ref,int _maxvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setmax", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setmax", new Object[] {_maxvalue}));}
RDebugUtils.currentLine=81002496;
 //BA.debugLineNum = 81002496;BA.debugLine="Sub SetMax(maxvalue As Int) As VMChartKick";
RDebugUtils.currentLine=81002497;
 //BA.debugLineNum = 81002497;BA.debugLine="SetAttrSingle(\":max\", maxvalue)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":max",(Object)(_maxvalue));
RDebugUtils.currentLine=81002498;
 //BA.debugLineNum = 81002498;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81002499;
 //BA.debugLineNum = 81002499;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setmin(b4j.example.vmchartkick __ref,int _minvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setmin", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setmin", new Object[] {_minvalue}));}
RDebugUtils.currentLine=81068032;
 //BA.debugLineNum = 81068032;BA.debugLine="Sub SetMin(minvalue As Int) As VMChartKick";
RDebugUtils.currentLine=81068033;
 //BA.debugLineNum = 81068033;BA.debugLine="SetAttrSingle(\":min\", minvalue)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":min",(Object)(_minvalue));
RDebugUtils.currentLine=81068034;
 //BA.debugLineNum = 81068034;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81068035;
 //BA.debugLineNum = 81068035;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setpiechart(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setpiechart", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setpiechart", null));}
RDebugUtils.currentLine=82837504;
 //BA.debugLineNum = 82837504;BA.debugLine="Sub SetPieChart As VMChartKick";
RDebugUtils.currentLine=82837505;
 //BA.debugLineNum = 82837505;BA.debugLine="ChartKick.settag(\"pie-chart\")";
__ref._chartkick /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"pie-chart");
RDebugUtils.currentLine=82837506;
 //BA.debugLineNum = 82837506;BA.debugLine="xAxes.display = False";
__ref._xaxes /*b4j.example.vmchartkick._xaxestype*/ .display /*boolean*/  = __c.False;
RDebugUtils.currentLine=82837507;
 //BA.debugLineNum = 82837507;BA.debugLine="yAxes.display = False";
__ref._yaxes /*b4j.example.vmchartkick._xaxestype*/ .display /*boolean*/  = __c.False;
RDebugUtils.currentLine=82837508;
 //BA.debugLineNum = 82837508;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82837509;
 //BA.debugLineNum = 82837509;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setprecision(b4j.example.vmchartkick __ref,String _sprecision) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setprecision", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setprecision", new Object[] {_sprecision}));}
RDebugUtils.currentLine=82051072;
 //BA.debugLineNum = 82051072;BA.debugLine="Sub SetPrecision(sprecision As String) As VMChartK";
RDebugUtils.currentLine=82051073;
 //BA.debugLineNum = 82051073;BA.debugLine="SetAttrSingle(\":precision\", sprecision)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":precision",(Object)(_sprecision));
RDebugUtils.currentLine=82051074;
 //BA.debugLineNum = 82051074;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82051075;
 //BA.debugLineNum = 82051075;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setprefix(b4j.example.vmchartkick __ref,String _prefix) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setprefix", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setprefix", new Object[] {_prefix}));}
RDebugUtils.currentLine=81854464;
 //BA.debugLineNum = 81854464;BA.debugLine="Sub SetPrefix(prefix As String) As VMChartKick";
RDebugUtils.currentLine=81854465;
 //BA.debugLineNum = 81854465;BA.debugLine="SetAttrSingle(\"prefix\", prefix)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"prefix",(Object)(_prefix));
RDebugUtils.currentLine=81854466;
 //BA.debugLineNum = 81854466;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81854467;
 //BA.debugLineNum = 81854467;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setrefresh(b4j.example.vmchartkick __ref,int _refresh) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setrefresh", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setrefresh", new Object[] {_refresh}));}
RDebugUtils.currentLine=82313216;
 //BA.debugLineNum = 82313216;BA.debugLine="Sub SetRefresh(refresh As Int) As VMChartKick";
RDebugUtils.currentLine=82313217;
 //BA.debugLineNum = 82313217;BA.debugLine="SetAttrSingle(\":refresh\", refresh)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":refresh",(Object)(_refresh));
RDebugUtils.currentLine=82313218;
 //BA.debugLineNum = 82313218;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82313219;
 //BA.debugLineNum = 82313219;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setround(b4j.example.vmchartkick __ref,String _sround) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setround", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setround", new Object[] {_sround}));}
RDebugUtils.currentLine=82116608;
 //BA.debugLineNum = 82116608;BA.debugLine="Sub SetRound(sround As String) As VMChartKick";
RDebugUtils.currentLine=82116609;
 //BA.debugLineNum = 82116609;BA.debugLine="SetAttrSingle(\":round\",sround)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":round",(Object)(_sround));
RDebugUtils.currentLine=82116610;
 //BA.debugLineNum = 82116610;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82116611;
 //BA.debugLineNum = 82116611;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setscatterchart(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setscatterchart", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setscatterchart", null));}
RDebugUtils.currentLine=83099648;
 //BA.debugLineNum = 83099648;BA.debugLine="Sub SetScatterChart As VMChartKick";
RDebugUtils.currentLine=83099649;
 //BA.debugLineNum = 83099649;BA.debugLine="ChartKick.SetTag(\"scatter-chart\")";
__ref._chartkick /*b4j.example.vmelement*/ ._settag /*b4j.example.vmelement*/ (null,"scatter-chart");
RDebugUtils.currentLine=83099650;
 //BA.debugLineNum = 83099650;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=83099651;
 //BA.debugLineNum = 83099651;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setstacked(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setstacked", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setstacked", null));}
RDebugUtils.currentLine=81395712;
 //BA.debugLineNum = 81395712;BA.debugLine="Sub SetStacked As VMChartKick";
RDebugUtils.currentLine=81395713;
 //BA.debugLineNum = 81395713;BA.debugLine="SetAttrSingle(\"stacked\", \"true\")";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"stacked",(Object)("true"));
RDebugUtils.currentLine=81395714;
 //BA.debugLineNum = 81395714;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81395715;
 //BA.debugLineNum = 81395715;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setstyle(b4j.example.vmchartkick __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=80805888;
 //BA.debugLineNum = 80805888;BA.debugLine="Sub SetStyle(sm As Map) As VMChartKick";
RDebugUtils.currentLine=80805889;
 //BA.debugLineNum = 80805889;BA.debugLine="ChartKick.SetStyle(sm)";
__ref._chartkick /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=80805890;
 //BA.debugLineNum = 80805890;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80805891;
 //BA.debugLineNum = 80805891;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setsuffix(b4j.example.vmchartkick __ref,String _suffix) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setsuffix", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setsuffix", new Object[] {_suffix}));}
RDebugUtils.currentLine=82444288;
 //BA.debugLineNum = 82444288;BA.debugLine="Sub SetSuffix(suffix As String) As VMChartKick";
RDebugUtils.currentLine=82444289;
 //BA.debugLineNum = 82444289;BA.debugLine="SetAttrSingle(\"suffix\", suffix)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"suffix",(Object)(_suffix));
RDebugUtils.currentLine=82444290;
 //BA.debugLineNum = 82444290;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82444291;
 //BA.debugLineNum = 82444291;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setthousands(b4j.example.vmchartkick __ref,String _sthousands) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setthousands", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setthousands", new Object[] {_sthousands}));}
RDebugUtils.currentLine=81920000;
 //BA.debugLineNum = 81920000;BA.debugLine="Sub SetThousands(sthousands As String) As VMChartK";
RDebugUtils.currentLine=81920001;
 //BA.debugLineNum = 81920001;BA.debugLine="SetAttrSingle(\"thousands\", sthousands)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"thousands",(Object)(_sthousands));
RDebugUtils.currentLine=81920002;
 //BA.debugLineNum = 81920002;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81920003;
 //BA.debugLineNum = 81920003;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _settitle(b4j.example.vmchartkick __ref,String _txt) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "settitle", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "settitle", new Object[] {_txt}));}
RDebugUtils.currentLine=80347136;
 //BA.debugLineNum = 80347136;BA.debugLine="Sub SetTitle(txt As String) As VMChartKick";
RDebugUtils.currentLine=80347137;
 //BA.debugLineNum = 80347137;BA.debugLine="Title.text = txt";
__ref._title /*b4j.example.vmchartkick._titletype*/ .text /*String*/  = _txt;
RDebugUtils.currentLine=80347138;
 //BA.debugLineNum = 80347138;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=80347139;
 //BA.debugLineNum = 80347139;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setvshow(b4j.example.vmchartkick __ref,String _vshow) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setvshow", new Object[] {_vshow}));}
RDebugUtils.currentLine=83165184;
 //BA.debugLineNum = 83165184;BA.debugLine="Sub SetVShow(vshow As String) As VMChartKick";
RDebugUtils.currentLine=83165185;
 //BA.debugLineNum = 83165185;BA.debugLine="ChartKick.SetVShow(vshow)";
__ref._chartkick /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vshow);
RDebugUtils.currentLine=83165186;
 //BA.debugLineNum = 83165186;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=83165187;
 //BA.debugLineNum = 83165187;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setwidth(b4j.example.vmchartkick __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=82509824;
 //BA.debugLineNum = 82509824;BA.debugLine="Sub SetWidth(w As String) As VMChartKick";
RDebugUtils.currentLine=82509825;
 //BA.debugLineNum = 82509825;BA.debugLine="SetAttrSingle(\"width\", vue.makepx(w))";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"width",(Object)(__ref._vue /*b4j.example.bananovue*/ ._makepx /*String*/ (null,_w)));
RDebugUtils.currentLine=82509826;
 //BA.debugLineNum = 82509826;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82509827;
 //BA.debugLineNum = 82509827;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setxmax(b4j.example.vmchartkick __ref,int _maxvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setxmax", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setxmax", new Object[] {_maxvalue}));}
RDebugUtils.currentLine=81133568;
 //BA.debugLineNum = 81133568;BA.debugLine="Sub SetXMax(maxvalue As Int) As VMChartKick";
RDebugUtils.currentLine=81133569;
 //BA.debugLineNum = 81133569;BA.debugLine="SetAttrSingle(\"xmax\", maxvalue)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"xmax",(Object)(_maxvalue));
RDebugUtils.currentLine=81133570;
 //BA.debugLineNum = 81133570;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81133571;
 //BA.debugLineNum = 81133571;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setxmin(b4j.example.vmchartkick __ref,int _minvalue) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setxmin", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setxmin", new Object[] {_minvalue}));}
RDebugUtils.currentLine=81199104;
 //BA.debugLineNum = 81199104;BA.debugLine="Sub SetXMin(minvalue As Int) As VMChartKick";
RDebugUtils.currentLine=81199105;
 //BA.debugLineNum = 81199105;BA.debugLine="SetAttrSingle(\"xmin\", minvalue)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"xmin",(Object)(_minvalue));
RDebugUtils.currentLine=81199106;
 //BA.debugLineNum = 81199106;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=81199107;
 //BA.debugLineNum = 81199107;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setxtitle(b4j.example.vmchartkick __ref,String _xtitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setxtitle", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setxtitle", new Object[] {_xtitle}));}
RDebugUtils.currentLine=82640896;
 //BA.debugLineNum = 82640896;BA.debugLine="Sub SetXTitle(xtitle As String) As VMChartKick";
RDebugUtils.currentLine=82640897;
 //BA.debugLineNum = 82640897;BA.debugLine="SetAttrSingle(\"xtitle\", xtitle)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"xtitle",(Object)(_xtitle));
RDebugUtils.currentLine=82640898;
 //BA.debugLineNum = 82640898;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82640899;
 //BA.debugLineNum = 82640899;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setytitle(b4j.example.vmchartkick __ref,String _ytitle) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setytitle", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setytitle", new Object[] {_ytitle}));}
RDebugUtils.currentLine=82706432;
 //BA.debugLineNum = 82706432;BA.debugLine="Sub SetYTitle(ytitle As String) As VMChartKick";
RDebugUtils.currentLine=82706433;
 //BA.debugLineNum = 82706433;BA.debugLine="SetAttrSingle(\"ytitle\", ytitle)";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,"ytitle",(Object)(_ytitle));
RDebugUtils.currentLine=82706434;
 //BA.debugLineNum = 82706434;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82706435;
 //BA.debugLineNum = 82706435;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmchartkick  _setzeros(b4j.example.vmchartkick __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmchartkick";
if (Debug.shouldDelegate(ba, "setzeros", true))
	 {return ((b4j.example.vmchartkick) Debug.delegate(ba, "setzeros", null));}
RDebugUtils.currentLine=82182144;
 //BA.debugLineNum = 82182144;BA.debugLine="Sub SetZeros As VMChartKick";
RDebugUtils.currentLine=82182145;
 //BA.debugLineNum = 82182145;BA.debugLine="SetAttrSingle(\":zeros\", \"true\")";
__ref._setattrsingle /*b4j.example.vmchartkick*/ (null,":zeros",(Object)("true"));
RDebugUtils.currentLine=82182146;
 //BA.debugLineNum = 82182146;BA.debugLine="Return Me";
if (true) return (b4j.example.vmchartkick)(this);
RDebugUtils.currentLine=82182147;
 //BA.debugLineNum = 82182147;BA.debugLine="End Sub";
return null;
}
}