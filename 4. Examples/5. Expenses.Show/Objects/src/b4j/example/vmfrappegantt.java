package b4j.example;

import anywheresoftware.b4a.debug.*;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmfrappegantt extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4a.shell.ShellBA("b4j.example", "b4j.example.vmfrappegantt", this);
            if (htSubs == null) {
                ba.loadHtSubs(this.getClass());
                htSubs = ba.htSubs;
            }
            ba.htSubs = htSubs;
             
        }
        if (BA.isShellModeRuntimeCheck(ba))
                this.getClass().getMethod("_class_globals", b4j.example.vmfrappegantt.class).invoke(this, new Object[] {null});
        else
            ba.raiseEvent2(null, true, "class_globals", false);
    }

 
    public void  innerInitializeHelper(anywheresoftware.b4a.BA _ba) throws Exception{
        innerInitialize(_ba);
    }
    public Object callSub(String sub, Object sender, Object[] args) throws Exception {
        return BA.SubDelegator.SubNotFound;
    }
public static class _viewtype{
public boolean IsInitialized;
public String QuarterDay;
public String HalfDay;
public String Day;
public String Week;
public String Month;
public void Initialize() {
IsInitialized = true;
QuarterDay = "";
HalfDay = "";
Day = "";
Week = "";
Month = "";
}
@Override
		public String toString() {
			return BA.TypeToString(this, false);
		}}
public anywheresoftware.b4a.keywords.Common __c = null;
public b4j.example.vmelement _p = null;
public b4j.example.vmelement _frappegantt = null;
public String _id = "";
public b4j.example.bananovue _vue = null;
public b4j.example.vmfrappegantt._viewtype _enumview = null;
public anywheresoftware.b4a.objects.collections.List _tasks = null;
public anywheresoftware.b4a.objects.collections.Map _options = null;
public com.ab.banano.BANano _banano = null;
public com.ab.banano.BANanoObject _bofg = null;
public Object _module = null;
public b4j.example.main _main = null;
public b4j.example.pgindex _pgindex = null;
public b4j.example.moddashboard _moddashboard = null;
public b4j.example.modexpenses _modexpenses = null;
public b4j.example.modstats _modstats = null;
public b4j.example.modexpensetypes _modexpensetypes = null;
public b4j.example.modexpensecategories _modexpensecategories = null;
public b4j.example.vmfrappegantt  _initialize(b4j.example.vmfrappegantt __ref,anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
__ref = this;
innerInitialize(_ba);
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "initialize", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "initialize", new Object[] {_ba,_v,_sid,_eventhandler}));}
Object _task = null;
Object _start = null;
Object _finish = null;
Object _progress = null;
Object _mode = null;
RDebugUtils.currentLine=125763584;
 //BA.debugLineNum = 125763584;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
RDebugUtils.currentLine=125763585;
 //BA.debugLineNum = 125763585;BA.debugLine="BANano.DependsOnAsset(\"frappe-gantt.css\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("frappe-gantt.css");
RDebugUtils.currentLine=125763586;
 //BA.debugLineNum = 125763586;BA.debugLine="BANano.DependsOnAsset(\"frappe-gantt.js\")";
__ref._banano /*com.ab.banano.BANano*/ .DependsOnAsset("frappe-gantt.js");
RDebugUtils.currentLine=125763587;
 //BA.debugLineNum = 125763587;BA.debugLine="ID = sid.ToLowerCase";
__ref._id /*String*/  = _sid.toLowerCase();
RDebugUtils.currentLine=125763588;
 //BA.debugLineNum = 125763588;BA.debugLine="vue = v";
__ref._vue /*b4j.example.bananovue*/  = _v;
RDebugUtils.currentLine=125763589;
 //BA.debugLineNum = 125763589;BA.debugLine="module = eventHandler";
__ref._module /*Object*/  = _eventhandler;
RDebugUtils.currentLine=125763590;
 //BA.debugLineNum = 125763590;BA.debugLine="Tasks.Initialize";
__ref._tasks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=125763591;
 //BA.debugLineNum = 125763591;BA.debugLine="FrappeGantt.Initialize(vue, ID).SetTag(\"div\")";
__ref._frappegantt /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,__ref._id /*String*/ )._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=125763592;
 //BA.debugLineNum = 125763592;BA.debugLine="p.Initialize(vue, $\"${ID}parent\"$).SetTag(\"div\")";
__ref._p /*b4j.example.vmelement*/ ._initialize /*b4j.example.vmelement*/ (null,ba,__ref._vue /*b4j.example.bananovue*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"parent"))._settag /*b4j.example.vmelement*/ (null,"div");
RDebugUtils.currentLine=125763593;
 //BA.debugLineNum = 125763593;BA.debugLine="EnumView.Initialize";
__ref._enumview /*b4j.example.vmfrappegantt._viewtype*/ .Initialize();
RDebugUtils.currentLine=125763594;
 //BA.debugLineNum = 125763594;BA.debugLine="EnumView.Day = \"Day\"";
__ref._enumview /*b4j.example.vmfrappegantt._viewtype*/ .Day /*String*/  = "Day";
RDebugUtils.currentLine=125763595;
 //BA.debugLineNum = 125763595;BA.debugLine="EnumView.HalfDay = \"Half Day\"";
__ref._enumview /*b4j.example.vmfrappegantt._viewtype*/ .HalfDay /*String*/  = "Half Day";
RDebugUtils.currentLine=125763596;
 //BA.debugLineNum = 125763596;BA.debugLine="EnumView.Month = \"Month\"";
__ref._enumview /*b4j.example.vmfrappegantt._viewtype*/ .Month /*String*/  = "Month";
RDebugUtils.currentLine=125763597;
 //BA.debugLineNum = 125763597;BA.debugLine="EnumView.QuarterDay = \"Quarter Day\"";
__ref._enumview /*b4j.example.vmfrappegantt._viewtype*/ .QuarterDay /*String*/  = "Quarter Day";
RDebugUtils.currentLine=125763598;
 //BA.debugLineNum = 125763598;BA.debugLine="EnumView.Week = \"Week\"";
__ref._enumview /*b4j.example.vmfrappegantt._viewtype*/ .Week /*String*/  = "Week";
RDebugUtils.currentLine=125763599;
 //BA.debugLineNum = 125763599;BA.debugLine="options.Initialize";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Initialize();
RDebugUtils.currentLine=125763600;
 //BA.debugLineNum = 125763600;BA.debugLine="options.put(\"view_modes\", Array(\"Quarter Day\", \"H";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("view_modes"),(Object)(new Object[]{(Object)("Quarter Day"),(Object)("Half Day"),(Object)("Day"),(Object)("Week"),(Object)("Month")}));
RDebugUtils.currentLine=125763601;
 //BA.debugLineNum = 125763601;BA.debugLine="options.Put(\"custom_popup_html\", Null)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("custom_popup_html"),__c.Null);
RDebugUtils.currentLine=125763602;
 //BA.debugLineNum = 125763602;BA.debugLine="SetViewMode(\"Day\")";
__ref._setviewmode /*b4j.example.vmfrappegantt*/ (null,"Day");
RDebugUtils.currentLine=125763603;
 //BA.debugLineNum = 125763603;BA.debugLine="SetDateFormat(\"YYYY-MM-DD\")";
__ref._setdateformat /*b4j.example.vmfrappegantt*/ (null,"YYYY-MM-DD");
RDebugUtils.currentLine=125763604;
 //BA.debugLineNum = 125763604;BA.debugLine="SetLanguage(\"en\")";
__ref._setlanguage /*b4j.example.vmfrappegantt*/ (null,"en");
RDebugUtils.currentLine=125763605;
 //BA.debugLineNum = 125763605;BA.debugLine="SetElevation(2)";
__ref._setelevation /*b4j.example.vmfrappegantt*/ (null,(int) (2));
RDebugUtils.currentLine=125763606;
 //BA.debugLineNum = 125763606;BA.debugLine="Dim task As Object, start As Object, finish As Ob";
_task = new Object();
_start = new Object();
_finish = new Object();
RDebugUtils.currentLine=125763607;
 //BA.debugLineNum = 125763607;BA.debugLine="Dim progress As Object, mode As Object";
_progress = new Object();
_mode = new Object();
RDebugUtils.currentLine=125763608;
 //BA.debugLineNum = 125763608;BA.debugLine="SetOnClick(task)";
__ref._setonclick /*b4j.example.vmfrappegantt*/ (null,_task);
RDebugUtils.currentLine=125763609;
 //BA.debugLineNum = 125763609;BA.debugLine="SetOnDateChange(task, start, finish)";
__ref._setondatechange /*b4j.example.vmfrappegantt*/ (null,_task,_start,_finish);
RDebugUtils.currentLine=125763610;
 //BA.debugLineNum = 125763610;BA.debugLine="SetOnProgressChange(task, progress)";
__ref._setonprogresschange /*b4j.example.vmfrappegantt*/ (null,_task,_progress);
RDebugUtils.currentLine=125763611;
 //BA.debugLineNum = 125763611;BA.debugLine="SetOnViewChange(mode)";
__ref._setonviewchange /*b4j.example.vmfrappegantt*/ (null,_mode);
RDebugUtils.currentLine=125763612;
 //BA.debugLineNum = 125763612;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=125763613;
 //BA.debugLineNum = 125763613;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _addclass(b4j.example.vmfrappegantt __ref,String _c) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "addclass", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "addclass", new Object[] {_c}));}
RDebugUtils.currentLine=127598592;
 //BA.debugLineNum = 127598592;BA.debugLine="Sub AddClass(c As String) As VMFrappeGantt";
RDebugUtils.currentLine=127598593;
 //BA.debugLineNum = 127598593;BA.debugLine="FrappeGantt.AddClass(c)";
__ref._frappegantt /*b4j.example.vmelement*/ ._addclass /*b4j.example.vmelement*/ (null,_c);
RDebugUtils.currentLine=127598594;
 //BA.debugLineNum = 127598594;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127598595;
 //BA.debugLineNum = 127598595;BA.debugLine="End Sub";
return null;
}
public String  _addtask(b4j.example.vmfrappegantt __ref,String _taskid,String _taskname,String _taskstart,String _taskfinish,int _taskprogress,String _taskiddependencies,boolean _bmilestone) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "addtask", true))
	 {return ((String) Debug.delegate(ba, "addtask", new Object[] {_taskid,_taskname,_taskstart,_taskfinish,_taskprogress,_taskiddependencies,_bmilestone}));}
anywheresoftware.b4a.objects.collections.Map _tsk = null;
String _tn = "";
RDebugUtils.currentLine=127008768;
 //BA.debugLineNum = 127008768;BA.debugLine="Sub AddTask(taskID As String, taskName As String,";
RDebugUtils.currentLine=127008769;
 //BA.debugLineNum = 127008769;BA.debugLine="Dim tsk As Map = CreateMap(\"id\": taskID, \"start\":";
_tsk = new anywheresoftware.b4a.objects.collections.Map();
_tsk = __c.createMap(new Object[] {(Object)("id"),(Object)(_taskid),(Object)("start"),(Object)(_taskstart),(Object)("end"),(Object)(_taskfinish),(Object)("progress"),(Object)(_taskprogress)});
RDebugUtils.currentLine=127008770;
 //BA.debugLineNum = 127008770;BA.debugLine="Dim tn As String = $\"${taskName} (${taskProgress}";
_tn = (""+__c.SmartStringFormatter("",(Object)(_taskname))+" ("+__c.SmartStringFormatter("",(Object)(_taskprogress))+"%)");
RDebugUtils.currentLine=127008771;
 //BA.debugLineNum = 127008771;BA.debugLine="tsk.Put(\"name\", tn)";
_tsk.Put((Object)("name"),(Object)(_tn));
RDebugUtils.currentLine=127008772;
 //BA.debugLineNum = 127008772;BA.debugLine="If taskIDDependencies <> \"\" Then";
if ((_taskiddependencies).equals("") == false) { 
RDebugUtils.currentLine=127008773;
 //BA.debugLineNum = 127008773;BA.debugLine="tsk.put(\"dependencies\", taskIDDependencies)";
_tsk.Put((Object)("dependencies"),(Object)(_taskiddependencies));
 };
RDebugUtils.currentLine=127008775;
 //BA.debugLineNum = 127008775;BA.debugLine="If bMileStone Then";
if (_bmilestone) { 
RDebugUtils.currentLine=127008776;
 //BA.debugLineNum = 127008776;BA.debugLine="tsk.Put(\"custom_class\", \"bar-milestone\")";
_tsk.Put((Object)("custom_class"),(Object)("bar-milestone"));
 };
RDebugUtils.currentLine=127008778;
 //BA.debugLineNum = 127008778;BA.debugLine="Tasks.Add(tsk)";
__ref._tasks /*anywheresoftware.b4a.objects.collections.List*/ .Add((Object)(_tsk.getObject()));
RDebugUtils.currentLine=127008779;
 //BA.debugLineNum = 127008779;BA.debugLine="End Sub";
return "";
}
public String  _class_globals(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
RDebugUtils.currentLine=125698048;
 //BA.debugLineNum = 125698048;BA.debugLine="Sub Class_Globals";
RDebugUtils.currentLine=125698049;
 //BA.debugLineNum = 125698049;BA.debugLine="Private p As VMElement";
_p = new b4j.example.vmelement();
RDebugUtils.currentLine=125698050;
 //BA.debugLineNum = 125698050;BA.debugLine="Public FrappeGantt As VMElement";
_frappegantt = new b4j.example.vmelement();
RDebugUtils.currentLine=125698051;
 //BA.debugLineNum = 125698051;BA.debugLine="Public ID As String";
_id = "";
RDebugUtils.currentLine=125698052;
 //BA.debugLineNum = 125698052;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
RDebugUtils.currentLine=125698053;
 //BA.debugLineNum = 125698053;BA.debugLine="Type ViewType(QuarterDay As String,HalfDay As Str";
;
RDebugUtils.currentLine=125698054;
 //BA.debugLineNum = 125698054;BA.debugLine="Public EnumView As ViewType";
_enumview = new b4j.example.vmfrappegantt._viewtype();
RDebugUtils.currentLine=125698055;
 //BA.debugLineNum = 125698055;BA.debugLine="Public Tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
RDebugUtils.currentLine=125698056;
 //BA.debugLineNum = 125698056;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
RDebugUtils.currentLine=125698057;
 //BA.debugLineNum = 125698057;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
RDebugUtils.currentLine=125698058;
 //BA.debugLineNum = 125698058;BA.debugLine="Private boFG As BANanoObject";
_bofg = new com.ab.banano.BANanoObject();
RDebugUtils.currentLine=125698059;
 //BA.debugLineNum = 125698059;BA.debugLine="Private module As Object";
_module = new Object();
RDebugUtils.currentLine=125698060;
 //BA.debugLineNum = 125698060;BA.debugLine="End Sub";
return "";
}
public String  _clear(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "clear", true))
	 {return ((String) Debug.delegate(ba, "clear", null));}
RDebugUtils.currentLine=127074304;
 //BA.debugLineNum = 127074304;BA.debugLine="Sub Clear";
RDebugUtils.currentLine=127074305;
 //BA.debugLineNum = 127074305;BA.debugLine="Tasks.Initialize";
__ref._tasks /*anywheresoftware.b4a.objects.collections.List*/ .Initialize();
RDebugUtils.currentLine=127074306;
 //BA.debugLineNum = 127074306;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfrappegantt  _setviewmode(b4j.example.vmfrappegantt __ref,String _vm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setviewmode", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setviewmode", new Object[] {_vm}));}
RDebugUtils.currentLine=126877696;
 //BA.debugLineNum = 126877696;BA.debugLine="Sub SetViewMode(vm As String) As VMFrappeGantt";
RDebugUtils.currentLine=126877697;
 //BA.debugLineNum = 126877697;BA.debugLine="options.Put(\"view_mode\", vm)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("view_mode"),(Object)(_vm));
RDebugUtils.currentLine=126877698;
 //BA.debugLineNum = 126877698;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126877699;
 //BA.debugLineNum = 126877699;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setdateformat(b4j.example.vmfrappegantt __ref,String _df) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setdateformat", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setdateformat", new Object[] {_df}));}
RDebugUtils.currentLine=126943232;
 //BA.debugLineNum = 126943232;BA.debugLine="Sub SetDateFormat(df As String) As VMFrappeGantt";
RDebugUtils.currentLine=126943233;
 //BA.debugLineNum = 126943233;BA.debugLine="options.Put(\"date_format\", df)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("date_format"),(Object)(_df));
RDebugUtils.currentLine=126943234;
 //BA.debugLineNum = 126943234;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126943235;
 //BA.debugLineNum = 126943235;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setlanguage(b4j.example.vmfrappegantt __ref,String _lng) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setlanguage", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setlanguage", new Object[] {_lng}));}
RDebugUtils.currentLine=125894656;
 //BA.debugLineNum = 125894656;BA.debugLine="Sub SetLanguage(lng As String) As VMFrappeGantt";
RDebugUtils.currentLine=125894657;
 //BA.debugLineNum = 125894657;BA.debugLine="options.Put(\"language\", lng)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("language"),(Object)(_lng));
RDebugUtils.currentLine=125894658;
 //BA.debugLineNum = 125894658;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=125894659;
 //BA.debugLineNum = 125894659;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setelevation(b4j.example.vmfrappegantt __ref,int _e) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setelevation", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setelevation", new Object[] {_e}));}
RDebugUtils.currentLine=125829120;
 //BA.debugLineNum = 125829120;BA.debugLine="Sub SetElevation(e As Int) As VMFrappeGantt";
RDebugUtils.currentLine=125829121;
 //BA.debugLineNum = 125829121;BA.debugLine="p.SetElevation(e)";
__ref._p /*b4j.example.vmelement*/ ._setelevation /*b4j.example.vmelement*/ (null,_e);
RDebugUtils.currentLine=125829122;
 //BA.debugLineNum = 125829122;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=125829123;
 //BA.debugLineNum = 125829123;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setonclick(b4j.example.vmfrappegantt __ref,Object _task) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setonclick", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setonclick", new Object[] {_task}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=127729664;
 //BA.debugLineNum = 127729664;BA.debugLine="private Sub SetOnClick(task As Object) As VMFrappe";
RDebugUtils.currentLine=127729665;
 //BA.debugLineNum = 127729665;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_click"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_task}))));
RDebugUtils.currentLine=127729666;
 //BA.debugLineNum = 127729666;BA.debugLine="options.Put(\"on_click\", cb)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("on_click"),(Object)(_cb.getObject()));
RDebugUtils.currentLine=127729667;
 //BA.debugLineNum = 127729667;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127729668;
 //BA.debugLineNum = 127729668;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setondatechange(b4j.example.vmfrappegantt __ref,Object _task,Object _start,Object _finish) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setondatechange", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setondatechange", new Object[] {_task,_start,_finish}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=127795200;
 //BA.debugLineNum = 127795200;BA.debugLine="private Sub SetOnDateChange(task As Object, start";
RDebugUtils.currentLine=127795201;
 //BA.debugLineNum = 127795201;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_datechange"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_task,_start,_finish}))));
RDebugUtils.currentLine=127795202;
 //BA.debugLineNum = 127795202;BA.debugLine="options.Put(\"on_date_change\", cb)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("on_date_change"),(Object)(_cb.getObject()));
RDebugUtils.currentLine=127795203;
 //BA.debugLineNum = 127795203;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127795204;
 //BA.debugLineNum = 127795204;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setonprogresschange(b4j.example.vmfrappegantt __ref,Object _task,Object _progress) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setonprogresschange", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setonprogresschange", new Object[] {_task,_progress}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=127860736;
 //BA.debugLineNum = 127860736;BA.debugLine="private Sub SetOnProgressChange(task As Object, pr";
RDebugUtils.currentLine=127860737;
 //BA.debugLineNum = 127860737;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_progresschange"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_task,_progress}))));
RDebugUtils.currentLine=127860738;
 //BA.debugLineNum = 127860738;BA.debugLine="options.Put(\"on_date_change\", cb)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("on_date_change"),(Object)(_cb.getObject()));
RDebugUtils.currentLine=127860739;
 //BA.debugLineNum = 127860739;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127860740;
 //BA.debugLineNum = 127860740;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setonviewchange(b4j.example.vmfrappegantt __ref,Object _mode) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setonviewchange", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setonviewchange", new Object[] {_mode}));}
com.ab.banano.BANanoObject _cb = null;
RDebugUtils.currentLine=127926272;
 //BA.debugLineNum = 127926272;BA.debugLine="private Sub SetOnViewChange(mode As Object) As VMF";
RDebugUtils.currentLine=127926273;
 //BA.debugLineNum = 127926273;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(__ref._banano /*com.ab.banano.BANano*/ .CallBack(__ref._module /*Object*/ ,(""+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"_viewchange"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_mode}))));
RDebugUtils.currentLine=127926274;
 //BA.debugLineNum = 127926274;BA.debugLine="options.Put(\"on_view_change\", cb)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("on_view_change"),(Object)(_cb.getObject()));
RDebugUtils.currentLine=127926275;
 //BA.debugLineNum = 127926275;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127926276;
 //BA.debugLineNum = 127926276;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmfrappegantt __ref,b4j.example.vmelement _px) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "pop", true))
	 {return ((String) Debug.delegate(ba, "pop", new Object[] {_px}));}
RDebugUtils.currentLine=128122880;
 //BA.debugLineNum = 128122880;BA.debugLine="Sub Pop(px As VMElement)";
RDebugUtils.currentLine=128122881;
 //BA.debugLineNum = 128122881;BA.debugLine="px.SetText(ToString)";
_px._settext /*b4j.example.vmelement*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=128122882;
 //BA.debugLineNum = 128122882;BA.debugLine="End Sub";
return "";
}
public String  _tostring(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "tostring", true))
	 {return ((String) Debug.delegate(ba, "tostring", null));}
RDebugUtils.currentLine=127991808;
 //BA.debugLineNum = 127991808;BA.debugLine="Sub ToString As String";
RDebugUtils.currentLine=127991809;
 //BA.debugLineNum = 127991809;BA.debugLine="FrappeGantt.Pop(p)";
__ref._frappegantt /*b4j.example.vmelement*/ ._pop /*String*/ (null,__ref._p /*b4j.example.vmelement*/ );
RDebugUtils.currentLine=127991810;
 //BA.debugLineNum = 127991810;BA.debugLine="Return p.tostring";
if (true) return __ref._p /*b4j.example.vmelement*/ ._tostring /*String*/ (null);
RDebugUtils.currentLine=127991811;
 //BA.debugLineNum = 127991811;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfrappegantt  _refresh(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "refresh", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "refresh", null));}
String _gkey = "";
RDebugUtils.currentLine=128188416;
 //BA.debugLineNum = 128188416;BA.debugLine="Sub Refresh As VMFrappeGantt";
RDebugUtils.currentLine=128188418;
 //BA.debugLineNum = 128188418;BA.debugLine="Dim gKey As String = $\"#${ID}\"$";
_gkey = ("#"+__c.SmartStringFormatter("",(Object)(__ref._id /*String*/ ))+"");
RDebugUtils.currentLine=128188419;
 //BA.debugLineNum = 128188419;BA.debugLine="boFG.Initialize2(\"Gantt\", Array(gKey, Tasks, opti";
__ref._bofg /*com.ab.banano.BANanoObject*/ .Initialize2("Gantt",(Object)(new Object[]{(Object)(_gkey),(Object)(__ref._tasks /*anywheresoftware.b4a.objects.collections.List*/ .getObject()),(Object)(__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .getObject())}));
RDebugUtils.currentLine=128188420;
 //BA.debugLineNum = 128188420;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=128188421;
 //BA.debugLineNum = 128188421;BA.debugLine="End Sub";
return null;
}
public String  _render(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "render", true))
	 {return ((String) Debug.delegate(ba, "render", null));}
RDebugUtils.currentLine=128057344;
 //BA.debugLineNum = 128057344;BA.debugLine="Sub Render";
RDebugUtils.currentLine=128057345;
 //BA.debugLineNum = 128057345;BA.debugLine="vue.SetTemplate(ToString)";
__ref._vue /*b4j.example.bananovue*/ ._settemplate /*String*/ (null,__ref._tostring /*String*/ (null));
RDebugUtils.currentLine=128057346;
 //BA.debugLineNum = 128057346;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfrappegantt  _setarrowcurve(b4j.example.vmfrappegantt __ref,String _ac) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setarrowcurve", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setarrowcurve", new Object[] {_ac}));}
RDebugUtils.currentLine=126746624;
 //BA.debugLineNum = 126746624;BA.debugLine="Sub SetArrowCurve(ac As String) As VMFrappeGantt";
RDebugUtils.currentLine=126746625;
 //BA.debugLineNum = 126746625;BA.debugLine="options.Put(\"arrow_curve\", ac)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("arrow_curve"),(Object)(_ac));
RDebugUtils.currentLine=126746626;
 //BA.debugLineNum = 126746626;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126746627;
 //BA.debugLineNum = 126746627;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setattr(b4j.example.vmfrappegantt __ref,anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setattr", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setattr", new Object[] {_attr}));}
RDebugUtils.currentLine=127664128;
 //BA.debugLineNum = 127664128;BA.debugLine="Sub SetAttr(attr As Map) As VMFrappeGantt";
RDebugUtils.currentLine=127664129;
 //BA.debugLineNum = 127664129;BA.debugLine="FrappeGantt.SetAttr(attr)";
__ref._frappegantt /*b4j.example.vmelement*/ ._setattr /*b4j.example.vmelement*/ (null,_attr);
RDebugUtils.currentLine=127664130;
 //BA.debugLineNum = 127664130;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127664131;
 //BA.debugLineNum = 127664131;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setbarheight(b4j.example.vmfrappegantt __ref,String _bh) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setbarheight", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setbarheight", new Object[] {_bh}));}
RDebugUtils.currentLine=126615552;
 //BA.debugLineNum = 126615552;BA.debugLine="Sub SetBarHeight(bh As String) As VMFrappeGantt";
RDebugUtils.currentLine=126615553;
 //BA.debugLineNum = 126615553;BA.debugLine="options.Put(\"bar_height\", bh)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("bar_height"),(Object)(_bh));
RDebugUtils.currentLine=126615554;
 //BA.debugLineNum = 126615554;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126615555;
 //BA.debugLineNum = 126615555;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setbordercornerradius(b4j.example.vmfrappegantt __ref,String _bcr) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setbordercornerradius", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setbordercornerradius", new Object[] {_bcr}));}
RDebugUtils.currentLine=126681088;
 //BA.debugLineNum = 126681088;BA.debugLine="Sub SetBorderCornerRadius(bcr As String) As VMFrap";
RDebugUtils.currentLine=126681089;
 //BA.debugLineNum = 126681089;BA.debugLine="options.Put(\"bar_corner_radius\", bcr)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("bar_corner_radius"),(Object)(_bcr));
RDebugUtils.currentLine=126681090;
 //BA.debugLineNum = 126681090;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126681091;
 //BA.debugLineNum = 126681091;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setcolumnwidth(b4j.example.vmfrappegantt __ref,String _cw) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setcolumnwidth", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setcolumnwidth", new Object[] {_cw}));}
RDebugUtils.currentLine=126484480;
 //BA.debugLineNum = 126484480;BA.debugLine="Sub SetColumnWidth(cw As String) As VMFrappeGantt";
RDebugUtils.currentLine=126484481;
 //BA.debugLineNum = 126484481;BA.debugLine="options.Put(\"column_width\", cw)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("column_width"),(Object)(_cw));
RDebugUtils.currentLine=126484482;
 //BA.debugLineNum = 126484482;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126484483;
 //BA.debugLineNum = 126484483;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setheaderheight(b4j.example.vmfrappegantt __ref,String _hh) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setheaderheight", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setheaderheight", new Object[] {_hh}));}
RDebugUtils.currentLine=126418944;
 //BA.debugLineNum = 126418944;BA.debugLine="Sub SetHeaderHeight(hh As String) As VMFrappeGantt";
RDebugUtils.currentLine=126418945;
 //BA.debugLineNum = 126418945;BA.debugLine="options.Put(\"header_height\", hh)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("header_height"),(Object)(_hh));
RDebugUtils.currentLine=126418946;
 //BA.debugLineNum = 126418946;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126418947;
 //BA.debugLineNum = 126418947;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setheight(b4j.example.vmfrappegantt __ref,String _h) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setheight", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setheight", new Object[] {_h}));}
RDebugUtils.currentLine=126025728;
 //BA.debugLineNum = 126025728;BA.debugLine="Sub SetHeight(h As String) As VMFrappeGantt";
RDebugUtils.currentLine=126025729;
 //BA.debugLineNum = 126025729;BA.debugLine="p.SetStyle(CreateMap(\"height\":h))";
__ref._p /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("height"),(Object)(_h)}));
RDebugUtils.currentLine=126025730;
 //BA.debugLineNum = 126025730;BA.debugLine="p.SetHeight(h)";
__ref._p /*b4j.example.vmelement*/ ._setheight /*b4j.example.vmelement*/ (null,_h);
RDebugUtils.currentLine=126025731;
 //BA.debugLineNum = 126025731;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126025732;
 //BA.debugLineNum = 126025732;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setid(b4j.example.vmfrappegantt __ref,String _iid,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setid", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setid", new Object[] {_iid,_bind}));}
RDebugUtils.currentLine=127336448;
 //BA.debugLineNum = 127336448;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMFra";
RDebugUtils.currentLine=127336449;
 //BA.debugLineNum = 127336449;BA.debugLine="FrappeGantt.SetID(iID,bind)";
__ref._frappegantt /*b4j.example.vmelement*/ ._setid /*b4j.example.vmelement*/ (null,_iid,_bind);
RDebugUtils.currentLine=127336450;
 //BA.debugLineNum = 127336450;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127336451;
 //BA.debugLineNum = 127336451;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setkey(b4j.example.vmfrappegantt __ref,String _k,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setkey", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setkey", new Object[] {_k,_bind}));}
RDebugUtils.currentLine=127467520;
 //BA.debugLineNum = 127467520;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMFrap";
RDebugUtils.currentLine=127467521;
 //BA.debugLineNum = 127467521;BA.debugLine="FrappeGantt.SetKey(k, bind)";
__ref._frappegantt /*b4j.example.vmelement*/ ._setkey /*b4j.example.vmelement*/ (null,(Object)(_k),_bind);
RDebugUtils.currentLine=127467522;
 //BA.debugLineNum = 127467522;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127467523;
 //BA.debugLineNum = 127467523;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setname(b4j.example.vmfrappegantt __ref,String _nam,boolean _bind) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setname", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setname", new Object[] {_nam,_bind}));}
RDebugUtils.currentLine=127401984;
 //BA.debugLineNum = 127401984;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMF";
RDebugUtils.currentLine=127401985;
 //BA.debugLineNum = 127401985;BA.debugLine="FrappeGantt.SetName(nam, bind)";
__ref._frappegantt /*b4j.example.vmelement*/ ._setname /*b4j.example.vmelement*/ (null,_nam,_bind);
RDebugUtils.currentLine=127401986;
 //BA.debugLineNum = 127401986;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127401987;
 //BA.debugLineNum = 127401987;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setpadding(b4j.example.vmfrappegantt __ref,String _px) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setpadding", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setpadding", new Object[] {_px}));}
RDebugUtils.currentLine=126812160;
 //BA.debugLineNum = 126812160;BA.debugLine="Sub SetPadding(px As String) As VMFrappeGantt";
RDebugUtils.currentLine=126812161;
 //BA.debugLineNum = 126812161;BA.debugLine="options.Put(\"padding\", px)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("padding"),(Object)(_px));
RDebugUtils.currentLine=126812162;
 //BA.debugLineNum = 126812162;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126812163;
 //BA.debugLineNum = 126812163;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setstep(b4j.example.vmfrappegantt __ref,String _si) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setstep", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setstep", new Object[] {_si}));}
RDebugUtils.currentLine=126550016;
 //BA.debugLineNum = 126550016;BA.debugLine="Sub SetStep(si As String) As VMFrappeGantt";
RDebugUtils.currentLine=126550017;
 //BA.debugLineNum = 126550017;BA.debugLine="options.Put(\"step\", si)";
__ref._options /*anywheresoftware.b4a.objects.collections.Map*/ .Put((Object)("step"),(Object)(_si));
RDebugUtils.currentLine=126550018;
 //BA.debugLineNum = 126550018;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126550019;
 //BA.debugLineNum = 126550019;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setstyle(b4j.example.vmfrappegantt __ref,anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setstyle", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setstyle", new Object[] {_sm}));}
RDebugUtils.currentLine=127205376;
 //BA.debugLineNum = 127205376;BA.debugLine="Sub SetStyle(sm As Map) As VMFrappeGantt";
RDebugUtils.currentLine=127205377;
 //BA.debugLineNum = 127205377;BA.debugLine="FrappeGantt.SetStyle(sm)";
__ref._frappegantt /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,_sm);
RDebugUtils.currentLine=127205378;
 //BA.debugLineNum = 127205378;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127205379;
 //BA.debugLineNum = 127205379;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _settabindex(b4j.example.vmfrappegantt __ref,String _ti) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "settabindex", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "settabindex", new Object[] {_ti}));}
RDebugUtils.currentLine=127139840;
 //BA.debugLineNum = 127139840;BA.debugLine="Sub SetTabIndex(ti As String) As VMFrappeGantt";
RDebugUtils.currentLine=127139841;
 //BA.debugLineNum = 127139841;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmfrappegantt)(this);};
RDebugUtils.currentLine=127139842;
 //BA.debugLineNum = 127139842;BA.debugLine="FrappeGantt.SetTabIndex(ti)";
__ref._frappegantt /*b4j.example.vmelement*/ ._settabindex /*b4j.example.vmelement*/ (null,_ti);
RDebugUtils.currentLine=127139843;
 //BA.debugLineNum = 127139843;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127139844;
 //BA.debugLineNum = 127139844;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewday(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setviewday", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setviewday", null));}
RDebugUtils.currentLine=126222336;
 //BA.debugLineNum = 126222336;BA.debugLine="Sub SetViewDay As VMFrappeGantt";
RDebugUtils.currentLine=126222337;
 //BA.debugLineNum = 126222337;BA.debugLine="SetViewMode(\"Day\")";
__ref._setviewmode /*b4j.example.vmfrappegantt*/ (null,"Day");
RDebugUtils.currentLine=126222338;
 //BA.debugLineNum = 126222338;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126222339;
 //BA.debugLineNum = 126222339;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewhalfday(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setviewhalfday", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setviewhalfday", null));}
RDebugUtils.currentLine=126287872;
 //BA.debugLineNum = 126287872;BA.debugLine="Sub SetViewHalfDay As VMFrappeGantt";
RDebugUtils.currentLine=126287873;
 //BA.debugLineNum = 126287873;BA.debugLine="SetViewMode(\"Half Day\")";
__ref._setviewmode /*b4j.example.vmfrappegantt*/ (null,"Half Day");
RDebugUtils.currentLine=126287874;
 //BA.debugLineNum = 126287874;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126287875;
 //BA.debugLineNum = 126287875;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewmonth(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setviewmonth", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setviewmonth", null));}
RDebugUtils.currentLine=126091264;
 //BA.debugLineNum = 126091264;BA.debugLine="Sub SetViewMonth As VMFrappeGantt";
RDebugUtils.currentLine=126091265;
 //BA.debugLineNum = 126091265;BA.debugLine="SetViewMode(\"Month\")";
__ref._setviewmode /*b4j.example.vmfrappegantt*/ (null,"Month");
RDebugUtils.currentLine=126091266;
 //BA.debugLineNum = 126091266;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126091267;
 //BA.debugLineNum = 126091267;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewquarterday(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setviewquarterday", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setviewquarterday", null));}
RDebugUtils.currentLine=126353408;
 //BA.debugLineNum = 126353408;BA.debugLine="Sub SetViewQuarterDay As VMFrappeGantt";
RDebugUtils.currentLine=126353409;
 //BA.debugLineNum = 126353409;BA.debugLine="SetViewMode(\"Quarter Day\")";
__ref._setviewmode /*b4j.example.vmfrappegantt*/ (null,"Quarter Day");
RDebugUtils.currentLine=126353410;
 //BA.debugLineNum = 126353410;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126353411;
 //BA.debugLineNum = 126353411;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewweek(b4j.example.vmfrappegantt __ref) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setviewweek", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setviewweek", null));}
RDebugUtils.currentLine=126156800;
 //BA.debugLineNum = 126156800;BA.debugLine="Sub SetViewWeek As VMFrappeGantt";
RDebugUtils.currentLine=126156801;
 //BA.debugLineNum = 126156801;BA.debugLine="SetViewMode(\"Week\")";
__ref._setviewmode /*b4j.example.vmfrappegantt*/ (null,"Week");
RDebugUtils.currentLine=126156802;
 //BA.debugLineNum = 126156802;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=126156803;
 //BA.debugLineNum = 126156803;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setvif(b4j.example.vmfrappegantt __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setvif", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setvif", new Object[] {_vif}));}
RDebugUtils.currentLine=127270912;
 //BA.debugLineNum = 127270912;BA.debugLine="Sub SetVIf(vif As String) As VMFrappeGantt";
RDebugUtils.currentLine=127270913;
 //BA.debugLineNum = 127270913;BA.debugLine="FrappeGantt.SetVIf(vif)";
__ref._frappegantt /*b4j.example.vmelement*/ ._setvif /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=127270914;
 //BA.debugLineNum = 127270914;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127270915;
 //BA.debugLineNum = 127270915;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setvshow(b4j.example.vmfrappegantt __ref,String _vif) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setvshow", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setvshow", new Object[] {_vif}));}
RDebugUtils.currentLine=127533056;
 //BA.debugLineNum = 127533056;BA.debugLine="Sub SetVShow(vif As String) As VMFrappeGantt";
RDebugUtils.currentLine=127533057;
 //BA.debugLineNum = 127533057;BA.debugLine="FrappeGantt.SetVShow(vif)";
__ref._frappegantt /*b4j.example.vmelement*/ ._setvshow /*b4j.example.vmelement*/ (null,_vif);
RDebugUtils.currentLine=127533058;
 //BA.debugLineNum = 127533058;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=127533059;
 //BA.debugLineNum = 127533059;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setwidth(b4j.example.vmfrappegantt __ref,String _w) throws Exception{
__ref = this;
RDebugUtils.currentModule="vmfrappegantt";
if (Debug.shouldDelegate(ba, "setwidth", true))
	 {return ((b4j.example.vmfrappegantt) Debug.delegate(ba, "setwidth", new Object[] {_w}));}
RDebugUtils.currentLine=125960192;
 //BA.debugLineNum = 125960192;BA.debugLine="Sub SetWidth(w As String) As VMFrappeGantt";
RDebugUtils.currentLine=125960193;
 //BA.debugLineNum = 125960193;BA.debugLine="p.SetStyle(CreateMap(\"width\":w))";
__ref._p /*b4j.example.vmelement*/ ._setstyle /*b4j.example.vmelement*/ (null,__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
RDebugUtils.currentLine=125960194;
 //BA.debugLineNum = 125960194;BA.debugLine="p.SetWidth(w)";
__ref._p /*b4j.example.vmelement*/ ._setwidth /*b4j.example.vmelement*/ (null,_w);
RDebugUtils.currentLine=125960195;
 //BA.debugLineNum = 125960195;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
RDebugUtils.currentLine=125960196;
 //BA.debugLineNum = 125960196;BA.debugLine="End Sub";
return null;
}
}