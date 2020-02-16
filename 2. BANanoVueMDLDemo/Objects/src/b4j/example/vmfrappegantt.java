package b4j.example;


import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.B4AClass;

public class vmfrappegantt extends B4AClass.ImplB4AClass implements BA.SubDelegator{
    public static java.util.HashMap<String, java.lang.reflect.Method> htSubs;
    private void innerInitialize(BA _ba) throws Exception {
        if (ba == null) {
            ba = new  anywheresoftware.b4j.objects.FxBA("b4j.example", "b4j.example.vmfrappegantt", this);
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
public b4j.example.vmfrappegantt  _addclass(String _c) throws Exception{
 //BA.debugLineNum = 211;BA.debugLine="Sub AddClass(c As String) As VMFrappeGantt";
 //BA.debugLineNum = 212;BA.debugLine="FrappeGantt.AddClass(c)";
_frappegantt._addclass /*b4j.example.vmelement*/ (_c);
 //BA.debugLineNum = 213;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 214;BA.debugLine="End Sub";
return null;
}
public String  _addtask(String _taskid,String _taskname,String _taskstart,String _taskfinish,int _taskprogress,String _taskiddependencies,boolean _bmilestone) throws Exception{
anywheresoftware.b4a.objects.collections.Map _tsk = null;
String _tn = "";
 //BA.debugLineNum = 155;BA.debugLine="Sub AddTask(taskID As String, taskName As String,";
 //BA.debugLineNum = 156;BA.debugLine="Dim tsk As Map = CreateMap(\"id\": taskID, \"start\":";
_tsk = new anywheresoftware.b4a.objects.collections.Map();
_tsk = __c.createMap(new Object[] {(Object)("id"),(Object)(_taskid),(Object)("start"),(Object)(_taskstart),(Object)("end"),(Object)(_taskfinish),(Object)("progress"),(Object)(_taskprogress)});
 //BA.debugLineNum = 157;BA.debugLine="Dim tn As String = $\"${taskName} (${taskProgress}";
_tn = (""+__c.SmartStringFormatter("",(Object)(_taskname))+" ("+__c.SmartStringFormatter("",(Object)(_taskprogress))+"%)");
 //BA.debugLineNum = 158;BA.debugLine="tsk.Put(\"name\", tn)";
_tsk.Put((Object)("name"),(Object)(_tn));
 //BA.debugLineNum = 159;BA.debugLine="If taskIDDependencies <> \"\" Then";
if ((_taskiddependencies).equals("") == false) { 
 //BA.debugLineNum = 160;BA.debugLine="tsk.put(\"dependencies\", taskIDDependencies)";
_tsk.Put((Object)("dependencies"),(Object)(_taskiddependencies));
 };
 //BA.debugLineNum = 162;BA.debugLine="If bMileStone Then";
if (_bmilestone) { 
 //BA.debugLineNum = 163;BA.debugLine="tsk.Put(\"custom_class\", \"bar-milestone\")";
_tsk.Put((Object)("custom_class"),(Object)("bar-milestone"));
 };
 //BA.debugLineNum = 165;BA.debugLine="Tasks.Add(tsk)";
_tasks.Add((Object)(_tsk.getObject()));
 //BA.debugLineNum = 166;BA.debugLine="End Sub";
return "";
}
public String  _class_globals() throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private p As VMElement";
_p = new b4j.example.vmelement();
 //BA.debugLineNum = 4;BA.debugLine="Public FrappeGantt As VMElement";
_frappegantt = new b4j.example.vmelement();
 //BA.debugLineNum = 5;BA.debugLine="Public ID As String";
_id = "";
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
_vue = new b4j.example.bananovue();
 //BA.debugLineNum = 7;BA.debugLine="Type ViewType(QuarterDay As String,HalfDay As Str";
;
 //BA.debugLineNum = 8;BA.debugLine="Public EnumView As ViewType";
_enumview = new b4j.example.vmfrappegantt._viewtype();
 //BA.debugLineNum = 9;BA.debugLine="Public Tasks As List";
_tasks = new anywheresoftware.b4a.objects.collections.List();
 //BA.debugLineNum = 10;BA.debugLine="Private options As Map";
_options = new anywheresoftware.b4a.objects.collections.Map();
 //BA.debugLineNum = 11;BA.debugLine="Private BANano As BANano  'ignore";
_banano = new com.ab.banano.BANano();
 //BA.debugLineNum = 12;BA.debugLine="Private boFG As BANanoObject";
_bofg = new com.ab.banano.BANanoObject();
 //BA.debugLineNum = 13;BA.debugLine="Private module As Object";
_module = new Object();
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return "";
}
public String  _clear() throws Exception{
 //BA.debugLineNum = 169;BA.debugLine="Sub Clear";
 //BA.debugLineNum = 170;BA.debugLine="Tasks.Initialize";
_tasks.Initialize();
 //BA.debugLineNum = 171;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfrappegantt  _initialize(anywheresoftware.b4a.BA _ba,b4j.example.bananovue _v,String _sid,Object _eventhandler) throws Exception{
innerInitialize(_ba);
Object _task = null;
Object _start = null;
Object _finish = null;
Object _progress = null;
Object _mode = null;
 //BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
 //BA.debugLineNum = 22;BA.debugLine="BANano.DependsOnAsset(\"frappe-gantt.css\")";
_banano.DependsOnAsset("frappe-gantt.css");
 //BA.debugLineNum = 23;BA.debugLine="BANano.DependsOnAsset(\"frappe-gantt.js\")";
_banano.DependsOnAsset("frappe-gantt.js");
 //BA.debugLineNum = 24;BA.debugLine="ID = sid.ToLowerCase";
_id = _sid.toLowerCase();
 //BA.debugLineNum = 25;BA.debugLine="vue = v";
_vue = _v;
 //BA.debugLineNum = 26;BA.debugLine="module = eventHandler";
_module = _eventhandler;
 //BA.debugLineNum = 27;BA.debugLine="Tasks.Initialize";
_tasks.Initialize();
 //BA.debugLineNum = 28;BA.debugLine="FrappeGantt.Initialize(vue, ID).SetTag(\"div\")";
_frappegantt._initialize /*b4j.example.vmelement*/ (ba,_vue,_id)._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 29;BA.debugLine="p.Initialize(vue, $\"${ID}parent\"$).SetTag(\"div\")";
_p._initialize /*b4j.example.vmelement*/ (ba,_vue,(""+__c.SmartStringFormatter("",(Object)(_id))+"parent"))._settag /*b4j.example.vmelement*/ ("div");
 //BA.debugLineNum = 30;BA.debugLine="EnumView.Initialize";
_enumview.Initialize();
 //BA.debugLineNum = 31;BA.debugLine="EnumView.Day = \"Day\"";
_enumview.Day /*String*/  = "Day";
 //BA.debugLineNum = 32;BA.debugLine="EnumView.HalfDay = \"Half Day\"";
_enumview.HalfDay /*String*/  = "Half Day";
 //BA.debugLineNum = 33;BA.debugLine="EnumView.Month = \"Month\"";
_enumview.Month /*String*/  = "Month";
 //BA.debugLineNum = 34;BA.debugLine="EnumView.QuarterDay = \"Quarter Day\"";
_enumview.QuarterDay /*String*/  = "Quarter Day";
 //BA.debugLineNum = 35;BA.debugLine="EnumView.Week = \"Week\"";
_enumview.Week /*String*/  = "Week";
 //BA.debugLineNum = 36;BA.debugLine="options.Initialize";
_options.Initialize();
 //BA.debugLineNum = 37;BA.debugLine="options.put(\"view_modes\", Array(\"Quarter Day\", \"H";
_options.Put((Object)("view_modes"),(Object)(new Object[]{(Object)("Quarter Day"),(Object)("Half Day"),(Object)("Day"),(Object)("Week"),(Object)("Month")}));
 //BA.debugLineNum = 38;BA.debugLine="options.Put(\"custom_popup_html\", Null)";
_options.Put((Object)("custom_popup_html"),__c.Null);
 //BA.debugLineNum = 39;BA.debugLine="SetViewMode(\"Day\")";
_setviewmode("Day");
 //BA.debugLineNum = 40;BA.debugLine="SetDateFormat(\"YYYY-MM-DD\")";
_setdateformat("YYYY-MM-DD");
 //BA.debugLineNum = 41;BA.debugLine="SetLanguage(\"en\")";
_setlanguage("en");
 //BA.debugLineNum = 42;BA.debugLine="SetElevation(2)";
_setelevation((int) (2));
 //BA.debugLineNum = 43;BA.debugLine="Dim task As Object, start As Object, finish As Ob";
_task = new Object();
_start = new Object();
_finish = new Object();
 //BA.debugLineNum = 44;BA.debugLine="Dim progress As Object, mode As Object";
_progress = new Object();
_mode = new Object();
 //BA.debugLineNum = 45;BA.debugLine="SetOnClick(task)";
_setonclick(_task);
 //BA.debugLineNum = 46;BA.debugLine="SetOnDateChange(task, start, finish)";
_setondatechange(_task,_start,_finish);
 //BA.debugLineNum = 47;BA.debugLine="SetOnProgressChange(task, progress)";
_setonprogresschange(_task,_progress);
 //BA.debugLineNum = 48;BA.debugLine="SetOnViewChange(mode)";
_setonviewchange(_mode);
 //BA.debugLineNum = 49;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 50;BA.debugLine="End Sub";
return null;
}
public String  _pop(b4j.example.vmelement _px) throws Exception{
 //BA.debugLineNum = 259;BA.debugLine="Sub Pop(px As VMElement)";
 //BA.debugLineNum = 260;BA.debugLine="px.SetText(ToString)";
_px._settext /*b4j.example.vmelement*/ (_tostring());
 //BA.debugLineNum = 261;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfrappegantt  _refresh() throws Exception{
String _gkey = "";
 //BA.debugLineNum = 265;BA.debugLine="Sub Refresh As VMFrappeGantt";
 //BA.debugLineNum = 267;BA.debugLine="Dim gKey As String = $\"#${ID}\"$";
_gkey = ("#"+__c.SmartStringFormatter("",(Object)(_id))+"");
 //BA.debugLineNum = 268;BA.debugLine="boFG.Initialize2(\"Gantt\", Array(gKey, Tasks, opti";
_bofg.Initialize2("Gantt",(Object)(new Object[]{(Object)(_gkey),(Object)(_tasks.getObject()),(Object)(_options.getObject())}));
 //BA.debugLineNum = 269;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 270;BA.debugLine="End Sub";
return null;
}
public String  _render() throws Exception{
 //BA.debugLineNum = 255;BA.debugLine="Sub Render";
 //BA.debugLineNum = 256;BA.debugLine="vue.SetTemplate(ToString)";
_vue._settemplate /*String*/ (_tostring());
 //BA.debugLineNum = 257;BA.debugLine="End Sub";
return "";
}
public b4j.example.vmfrappegantt  _setarrowcurve(String _ac) throws Exception{
 //BA.debugLineNum = 131;BA.debugLine="Sub SetArrowCurve(ac As String) As VMFrappeGantt";
 //BA.debugLineNum = 132;BA.debugLine="options.Put(\"arrow_curve\", ac)";
_options.Put((Object)("arrow_curve"),(Object)(_ac));
 //BA.debugLineNum = 133;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 134;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setattr(anywheresoftware.b4a.objects.collections.Map _attr) throws Exception{
 //BA.debugLineNum = 217;BA.debugLine="Sub SetAttr(attr As Map) As VMFrappeGantt";
 //BA.debugLineNum = 218;BA.debugLine="FrappeGantt.SetAttr(attr)";
_frappegantt._setattr /*b4j.example.vmelement*/ (_attr);
 //BA.debugLineNum = 219;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 220;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setbarheight(String _bh) throws Exception{
 //BA.debugLineNum = 119;BA.debugLine="Sub SetBarHeight(bh As String) As VMFrappeGantt";
 //BA.debugLineNum = 120;BA.debugLine="options.Put(\"bar_height\", bh)";
_options.Put((Object)("bar_height"),(Object)(_bh));
 //BA.debugLineNum = 121;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 122;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setbordercornerradius(String _bcr) throws Exception{
 //BA.debugLineNum = 125;BA.debugLine="Sub SetBorderCornerRadius(bcr As String) As VMFrap";
 //BA.debugLineNum = 126;BA.debugLine="options.Put(\"bar_corner_radius\", bcr)";
_options.Put((Object)("bar_corner_radius"),(Object)(_bcr));
 //BA.debugLineNum = 127;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 128;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setcolumnwidth(String _cw) throws Exception{
 //BA.debugLineNum = 107;BA.debugLine="Sub SetColumnWidth(cw As String) As VMFrappeGantt";
 //BA.debugLineNum = 108;BA.debugLine="options.Put(\"column_width\", cw)";
_options.Put((Object)("column_width"),(Object)(_cw));
 //BA.debugLineNum = 109;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 110;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setdateformat(String _df) throws Exception{
 //BA.debugLineNum = 149;BA.debugLine="Sub SetDateFormat(df As String) As VMFrappeGantt";
 //BA.debugLineNum = 150;BA.debugLine="options.Put(\"date_format\", df)";
_options.Put((Object)("date_format"),(Object)(_df));
 //BA.debugLineNum = 151;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 152;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setelevation(int _e) throws Exception{
 //BA.debugLineNum = 52;BA.debugLine="Sub SetElevation(e As Int) As VMFrappeGantt";
 //BA.debugLineNum = 53;BA.debugLine="p.SetElevation(e)";
_p._setelevation /*b4j.example.vmelement*/ (_e);
 //BA.debugLineNum = 54;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 55;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setheaderheight(String _hh) throws Exception{
 //BA.debugLineNum = 101;BA.debugLine="Sub SetHeaderHeight(hh As String) As VMFrappeGantt";
 //BA.debugLineNum = 102;BA.debugLine="options.Put(\"header_height\", hh)";
_options.Put((Object)("header_height"),(Object)(_hh));
 //BA.debugLineNum = 103;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 104;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setheight(String _h) throws Exception{
 //BA.debugLineNum = 69;BA.debugLine="Sub SetHeight(h As String) As VMFrappeGantt";
 //BA.debugLineNum = 70;BA.debugLine="p.SetStyle(CreateMap(\"height\":h))";
_p._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("height"),(Object)(_h)}));
 //BA.debugLineNum = 71;BA.debugLine="p.SetHeight(h)";
_p._setheight /*b4j.example.vmelement*/ (_h);
 //BA.debugLineNum = 72;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 73;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setid(String _iid,boolean _bind) throws Exception{
 //BA.debugLineNum = 190;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMFra";
 //BA.debugLineNum = 191;BA.debugLine="FrappeGantt.SetID(iID,bind)";
_frappegantt._setid /*b4j.example.vmelement*/ (_iid,_bind);
 //BA.debugLineNum = 192;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 193;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setkey(String _k,boolean _bind) throws Exception{
 //BA.debugLineNum = 200;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMFrap";
 //BA.debugLineNum = 201;BA.debugLine="FrappeGantt.SetKey(k, bind)";
_frappegantt._setkey /*b4j.example.vmelement*/ ((Object)(_k),_bind);
 //BA.debugLineNum = 202;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 203;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setlanguage(String _lng) throws Exception{
 //BA.debugLineNum = 58;BA.debugLine="Sub SetLanguage(lng As String) As VMFrappeGantt";
 //BA.debugLineNum = 59;BA.debugLine="options.Put(\"language\", lng)";
_options.Put((Object)("language"),(Object)(_lng));
 //BA.debugLineNum = 60;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 61;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setname(String _nam,boolean _bind) throws Exception{
 //BA.debugLineNum = 195;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMF";
 //BA.debugLineNum = 196;BA.debugLine="FrappeGantt.SetName(nam, bind)";
_frappegantt._setname /*b4j.example.vmelement*/ (_nam,_bind);
 //BA.debugLineNum = 197;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 198;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setonclick(Object _task) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 223;BA.debugLine="private Sub SetOnClick(task As Object) As VMFrappe";
 //BA.debugLineNum = 224;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_click"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_task}))));
 //BA.debugLineNum = 225;BA.debugLine="options.Put(\"on_click\", cb)";
_options.Put((Object)("on_click"),(Object)(_cb.getObject()));
 //BA.debugLineNum = 226;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 227;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setondatechange(Object _task,Object _start,Object _finish) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 230;BA.debugLine="private Sub SetOnDateChange(task As Object, start";
 //BA.debugLineNum = 231;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_datechange"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_task,_start,_finish}))));
 //BA.debugLineNum = 232;BA.debugLine="options.Put(\"on_date_change\", cb)";
_options.Put((Object)("on_date_change"),(Object)(_cb.getObject()));
 //BA.debugLineNum = 233;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 234;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setonprogresschange(Object _task,Object _progress) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 237;BA.debugLine="private Sub SetOnProgressChange(task As Object, pr";
 //BA.debugLineNum = 238;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_progresschange"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_task,_progress}))));
 //BA.debugLineNum = 239;BA.debugLine="options.Put(\"on_date_change\", cb)";
_options.Put((Object)("on_date_change"),(Object)(_cb.getObject()));
 //BA.debugLineNum = 240;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 241;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setonviewchange(Object _mode) throws Exception{
com.ab.banano.BANanoObject _cb = null;
 //BA.debugLineNum = 244;BA.debugLine="private Sub SetOnViewChange(mode As Object) As VMF";
 //BA.debugLineNum = 245;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
_cb = new com.ab.banano.BANanoObject();
_cb.setObject((java.lang.Object)(_banano.CallBack(_module,(""+__c.SmartStringFormatter("",(Object)(_id))+"_viewchange"),anywheresoftware.b4a.keywords.Common.ArrayToList(new Object[]{_mode}))));
 //BA.debugLineNum = 246;BA.debugLine="options.Put(\"on_view_change\", cb)";
_options.Put((Object)("on_view_change"),(Object)(_cb.getObject()));
 //BA.debugLineNum = 247;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 248;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setpadding(String _px) throws Exception{
 //BA.debugLineNum = 137;BA.debugLine="Sub SetPadding(px As String) As VMFrappeGantt";
 //BA.debugLineNum = 138;BA.debugLine="options.Put(\"padding\", px)";
_options.Put((Object)("padding"),(Object)(_px));
 //BA.debugLineNum = 139;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 140;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setstep(String _si) throws Exception{
 //BA.debugLineNum = 113;BA.debugLine="Sub SetStep(si As String) As VMFrappeGantt";
 //BA.debugLineNum = 114;BA.debugLine="options.Put(\"step\", si)";
_options.Put((Object)("step"),(Object)(_si));
 //BA.debugLineNum = 115;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 116;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setstyle(anywheresoftware.b4a.objects.collections.Map _sm) throws Exception{
 //BA.debugLineNum = 180;BA.debugLine="Sub SetStyle(sm As Map) As VMFrappeGantt";
 //BA.debugLineNum = 181;BA.debugLine="FrappeGantt.SetStyle(sm)";
_frappegantt._setstyle /*b4j.example.vmelement*/ (_sm);
 //BA.debugLineNum = 182;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 183;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _settabindex(String _ti) throws Exception{
 //BA.debugLineNum = 173;BA.debugLine="Sub SetTabIndex(ti As String) As VMFrappeGantt";
 //BA.debugLineNum = 174;BA.debugLine="If ti = \"\" Then Return Me";
if ((_ti).equals("")) { 
if (true) return (b4j.example.vmfrappegantt)(this);};
 //BA.debugLineNum = 175;BA.debugLine="FrappeGantt.SetTabIndex(ti)";
_frappegantt._settabindex /*b4j.example.vmelement*/ (_ti);
 //BA.debugLineNum = 176;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 177;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewday() throws Exception{
 //BA.debugLineNum = 85;BA.debugLine="Sub SetViewDay As VMFrappeGantt";
 //BA.debugLineNum = 86;BA.debugLine="SetViewMode(\"Day\")";
_setviewmode("Day");
 //BA.debugLineNum = 87;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 88;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewhalfday() throws Exception{
 //BA.debugLineNum = 90;BA.debugLine="Sub SetViewHalfDay As VMFrappeGantt";
 //BA.debugLineNum = 91;BA.debugLine="SetViewMode(\"Half Day\")";
_setviewmode("Half Day");
 //BA.debugLineNum = 92;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 93;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewmode(String _vm) throws Exception{
 //BA.debugLineNum = 143;BA.debugLine="Sub SetViewMode(vm As String) As VMFrappeGantt";
 //BA.debugLineNum = 144;BA.debugLine="options.Put(\"view_mode\", vm)";
_options.Put((Object)("view_mode"),(Object)(_vm));
 //BA.debugLineNum = 145;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 146;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewmonth() throws Exception{
 //BA.debugLineNum = 75;BA.debugLine="Sub SetViewMonth As VMFrappeGantt";
 //BA.debugLineNum = 76;BA.debugLine="SetViewMode(\"Month\")";
_setviewmode("Month");
 //BA.debugLineNum = 77;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 78;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewquarterday() throws Exception{
 //BA.debugLineNum = 95;BA.debugLine="Sub SetViewQuarterDay As VMFrappeGantt";
 //BA.debugLineNum = 96;BA.debugLine="SetViewMode(\"Quarter Day\")";
_setviewmode("Quarter Day");
 //BA.debugLineNum = 97;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 98;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setviewweek() throws Exception{
 //BA.debugLineNum = 80;BA.debugLine="Sub SetViewWeek As VMFrappeGantt";
 //BA.debugLineNum = 81;BA.debugLine="SetViewMode(\"Week\")";
_setviewmode("Week");
 //BA.debugLineNum = 82;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 83;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setvif(String _vif) throws Exception{
 //BA.debugLineNum = 185;BA.debugLine="Sub SetVIf(vif As String) As VMFrappeGantt";
 //BA.debugLineNum = 186;BA.debugLine="FrappeGantt.SetVIf(vif)";
_frappegantt._setvif /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 187;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 188;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setvshow(String _vif) throws Exception{
 //BA.debugLineNum = 205;BA.debugLine="Sub SetVShow(vif As String) As VMFrappeGantt";
 //BA.debugLineNum = 206;BA.debugLine="FrappeGantt.SetVShow(vif)";
_frappegantt._setvshow /*b4j.example.vmelement*/ (_vif);
 //BA.debugLineNum = 207;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 208;BA.debugLine="End Sub";
return null;
}
public b4j.example.vmfrappegantt  _setwidth(String _w) throws Exception{
 //BA.debugLineNum = 63;BA.debugLine="Sub SetWidth(w As String) As VMFrappeGantt";
 //BA.debugLineNum = 64;BA.debugLine="p.SetStyle(CreateMap(\"width\":w))";
_p._setstyle /*b4j.example.vmelement*/ (__c.createMap(new Object[] {(Object)("width"),(Object)(_w)}));
 //BA.debugLineNum = 65;BA.debugLine="p.SetWidth(w)";
_p._setwidth /*b4j.example.vmelement*/ (_w);
 //BA.debugLineNum = 66;BA.debugLine="Return Me";
if (true) return (b4j.example.vmfrappegantt)(this);
 //BA.debugLineNum = 67;BA.debugLine="End Sub";
return null;
}
public String  _tostring() throws Exception{
 //BA.debugLineNum = 250;BA.debugLine="Sub ToString As String";
 //BA.debugLineNum = 251;BA.debugLine="FrappeGantt.Pop(p)";
_frappegantt._pop /*String*/ (_p);
 //BA.debugLineNum = 252;BA.debugLine="Return p.tostring";
if (true) return _p._tostring /*String*/ ();
 //BA.debugLineNum = 253;BA.debugLine="End Sub";
return "";
}
public Object callSub(String sub, Object sender, Object[] args) throws Exception {
BA.senderHolder.set(sender);
return BA.SubDelegator.SubNotFound;
}
}
