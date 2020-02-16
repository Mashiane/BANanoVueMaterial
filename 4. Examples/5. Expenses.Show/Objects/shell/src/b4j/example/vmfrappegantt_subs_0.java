package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmfrappegantt_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmfrappegantt","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 211;BA.debugLine="Sub AddClass(c As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 212;BA.debugLine="FrappeGantt.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 213;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtask(RemoteObject __ref,RemoteObject _taskid,RemoteObject _taskname,RemoteObject _taskstart,RemoteObject _taskfinish,RemoteObject _taskprogress,RemoteObject _taskiddependencies,RemoteObject _bmilestone) throws Exception{
try {
		Debug.PushSubsStack("AddTask (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("addtask")) { return __ref.runUserSub(false, "vmfrappegantt","addtask", __ref, _taskid, _taskname, _taskstart, _taskfinish, _taskprogress, _taskiddependencies, _bmilestone);}
RemoteObject _tsk = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _tn = RemoteObject.createImmutable("");
Debug.locals.put("taskID", _taskid);
Debug.locals.put("taskName", _taskname);
Debug.locals.put("taskStart", _taskstart);
Debug.locals.put("taskFinish", _taskfinish);
Debug.locals.put("taskProgress", _taskprogress);
Debug.locals.put("taskIDDependencies", _taskiddependencies);
Debug.locals.put("bMileStone", _bmilestone);
 BA.debugLineNum = 155;BA.debugLine="Sub AddTask(taskID As String, taskName As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 156;BA.debugLine="Dim tsk As Map = CreateMap(\"id\": taskID, \"start\":";
Debug.JustUpdateDeviceLine();
_tsk = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_tsk = vmfrappegantt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_taskid),RemoteObject.createImmutable(("start")),(_taskstart),RemoteObject.createImmutable(("end")),(_taskfinish),RemoteObject.createImmutable(("progress")),(_taskprogress)}));Debug.locals.put("tsk", _tsk);Debug.locals.put("tsk", _tsk);
 BA.debugLineNum = 157;BA.debugLine="Dim tn As String = $\"${taskName} (${taskProgress}";
Debug.JustUpdateDeviceLine();
_tn = (RemoteObject.concat(RemoteObject.createImmutable(""),vmfrappegantt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_taskname))),RemoteObject.createImmutable(" ("),vmfrappegantt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_taskprogress))),RemoteObject.createImmutable("%)")));Debug.locals.put("tn", _tn);Debug.locals.put("tn", _tn);
 BA.debugLineNum = 158;BA.debugLine="tsk.Put(\"name\", tn)";
Debug.JustUpdateDeviceLine();
_tsk.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_tn)));
 BA.debugLineNum = 159;BA.debugLine="If taskIDDependencies <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_taskiddependencies,BA.ObjectToString(""))) { 
 BA.debugLineNum = 160;BA.debugLine="tsk.put(\"dependencies\", taskIDDependencies)";
Debug.JustUpdateDeviceLine();
_tsk.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("dependencies"))),(Object)((_taskiddependencies)));
 };
 BA.debugLineNum = 162;BA.debugLine="If bMileStone Then";
Debug.JustUpdateDeviceLine();
if (_bmilestone.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 163;BA.debugLine="tsk.Put(\"custom_class\", \"bar-milestone\")";
Debug.JustUpdateDeviceLine();
_tsk.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("custom_class"))),(Object)((RemoteObject.createImmutable("bar-milestone"))));
 };
 BA.debugLineNum = 165;BA.debugLine="Tasks.Add(tsk)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tasks" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_tsk.getObject())));
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Private p As VMElement";
vmfrappegantt._p = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_p",vmfrappegantt._p);
 //BA.debugLineNum = 4;BA.debugLine="Public FrappeGantt As VMElement";
vmfrappegantt._frappegantt = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_frappegantt",vmfrappegantt._frappegantt);
 //BA.debugLineNum = 5;BA.debugLine="Public ID As String";
vmfrappegantt._id = RemoteObject.createImmutable("");__ref.setField("_id",vmfrappegantt._id);
 //BA.debugLineNum = 6;BA.debugLine="Private vue As BANanoVue";
vmfrappegantt._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmfrappegantt._vue);
 //BA.debugLineNum = 7;BA.debugLine="Type ViewType(QuarterDay As String,HalfDay As Str";
;
 //BA.debugLineNum = 8;BA.debugLine="Public EnumView As ViewType";
vmfrappegantt._enumview = RemoteObject.createNew ("b4j.example.vmfrappegantt._viewtype");__ref.setField("_enumview",vmfrappegantt._enumview);
 //BA.debugLineNum = 9;BA.debugLine="Public Tasks As List";
vmfrappegantt._tasks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_tasks",vmfrappegantt._tasks);
 //BA.debugLineNum = 10;BA.debugLine="Private options As Map";
vmfrappegantt._options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_options",vmfrappegantt._options);
 //BA.debugLineNum = 11;BA.debugLine="Private BANano As BANano  'ignore";
vmfrappegantt._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmfrappegantt._banano);
 //BA.debugLineNum = 12;BA.debugLine="Private boFG As BANanoObject";
vmfrappegantt._bofg = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_bofg",vmfrappegantt._bofg);
 //BA.debugLineNum = 13;BA.debugLine="Private module As Object";
vmfrappegantt._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmfrappegantt._module);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "vmfrappegantt","clear", __ref);}
 BA.debugLineNum = 169;BA.debugLine="Sub Clear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="Tasks.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tasks" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 171;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmfrappegantt","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _task = RemoteObject.declareNull("Object");
RemoteObject _start = RemoteObject.declareNull("Object");
RemoteObject _finish = RemoteObject.declareNull("Object");
RemoteObject _progress = RemoteObject.declareNull("Object");
RemoteObject _mode = RemoteObject.declareNull("Object");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 21;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="BANano.DependsOnAsset(\"frappe-gantt.css\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("frappe-gantt.css")));
 BA.debugLineNum = 23;BA.debugLine="BANano.DependsOnAsset(\"frappe-gantt.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("frappe-gantt.js")));
 BA.debugLineNum = 24;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 25;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 26;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 27;BA.debugLine="Tasks.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tasks" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 28;BA.debugLine="FrappeGantt.Initialize(vue, ID).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 29;BA.debugLine="p.Initialize(vue, $\"${ID}parent\"$).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_p" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmfrappegantt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("parent"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 30;BA.debugLine="EnumView.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enumview" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="EnumView.Day = \"Day\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enumview" /*RemoteObject*/ ).setField ("Day" /*RemoteObject*/ ,BA.ObjectToString("Day"));
 BA.debugLineNum = 32;BA.debugLine="EnumView.HalfDay = \"Half Day\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enumview" /*RemoteObject*/ ).setField ("HalfDay" /*RemoteObject*/ ,BA.ObjectToString("Half Day"));
 BA.debugLineNum = 33;BA.debugLine="EnumView.Month = \"Month\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enumview" /*RemoteObject*/ ).setField ("Month" /*RemoteObject*/ ,BA.ObjectToString("Month"));
 BA.debugLineNum = 34;BA.debugLine="EnumView.QuarterDay = \"Quarter Day\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enumview" /*RemoteObject*/ ).setField ("QuarterDay" /*RemoteObject*/ ,BA.ObjectToString("Quarter Day"));
 BA.debugLineNum = 35;BA.debugLine="EnumView.Week = \"Week\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_enumview" /*RemoteObject*/ ).setField ("Week" /*RemoteObject*/ ,BA.ObjectToString("Week"));
 BA.debugLineNum = 36;BA.debugLine="options.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 37;BA.debugLine="options.put(\"view_modes\", Array(\"Quarter Day\", \"H";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("view_modes"))),(Object)((RemoteObject.createNewArray("Object",new int[] {5},new Object[] {RemoteObject.createImmutable(("Quarter Day")),RemoteObject.createImmutable(("Half Day")),RemoteObject.createImmutable(("Day")),RemoteObject.createImmutable(("Week")),(RemoteObject.createImmutable("Month"))}))));
 BA.debugLineNum = 38;BA.debugLine="options.Put(\"custom_popup_html\", Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("custom_popup_html"))),(Object)(vmfrappegantt.__c.getField(false,"Null")));
 BA.debugLineNum = 39;BA.debugLine="SetViewMode(\"Day\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setviewmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Day")));
 BA.debugLineNum = 40;BA.debugLine="SetDateFormat(\"YYYY-MM-DD\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setdateformat" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("YYYY-MM-DD")));
 BA.debugLineNum = 41;BA.debugLine="SetLanguage(\"en\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setlanguage" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("en")));
 BA.debugLineNum = 42;BA.debugLine="SetElevation(2)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setelevation" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 2)));
 BA.debugLineNum = 43;BA.debugLine="Dim task As Object, start As Object, finish As Ob";
Debug.JustUpdateDeviceLine();
_task = RemoteObject.createNew ("Object");Debug.locals.put("task", _task);
_start = RemoteObject.createNew ("Object");Debug.locals.put("start", _start);
_finish = RemoteObject.createNew ("Object");Debug.locals.put("finish", _finish);
 BA.debugLineNum = 44;BA.debugLine="Dim progress As Object, mode As Object";
Debug.JustUpdateDeviceLine();
_progress = RemoteObject.createNew ("Object");Debug.locals.put("progress", _progress);
_mode = RemoteObject.createNew ("Object");Debug.locals.put("mode", _mode);
 BA.debugLineNum = 45;BA.debugLine="SetOnClick(task)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setonclick" /*RemoteObject*/ ,(Object)(_task));
 BA.debugLineNum = 46;BA.debugLine="SetOnDateChange(task, start, finish)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setondatechange" /*RemoteObject*/ ,(Object)(_task),(Object)(_start),(Object)(_finish));
 BA.debugLineNum = 47;BA.debugLine="SetOnProgressChange(task, progress)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setonprogresschange" /*RemoteObject*/ ,(Object)(_task),(Object)(_progress));
 BA.debugLineNum = 48;BA.debugLine="SetOnViewChange(mode)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setonviewchange" /*RemoteObject*/ ,(Object)(_mode));
 BA.debugLineNum = 49;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _px) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,259);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmfrappegantt","pop", __ref, _px);}
Debug.locals.put("px", _px);
 BA.debugLineNum = 259;BA.debugLine="Sub Pop(px As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 260;BA.debugLine="px.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_px.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _refresh(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Refresh (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,265);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "vmfrappegantt","refresh", __ref);}
RemoteObject _gkey = RemoteObject.createImmutable("");
 BA.debugLineNum = 265;BA.debugLine="Sub Refresh As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="Dim gKey As String = $\"#${ID}\"$";
Debug.JustUpdateDeviceLine();
_gkey = (RemoteObject.concat(RemoteObject.createImmutable("#"),vmfrappegantt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("")));Debug.locals.put("gKey", _gkey);Debug.locals.put("gKey", _gkey);
 BA.debugLineNum = 268;BA.debugLine="boFG.Initialize2(\"Gantt\", Array(gKey, Tasks, opti";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bofg" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Gantt")),(Object)((RemoteObject.createNewArray("Object",new int[] {3},new Object[] {(_gkey),(__ref.getField(false,"_tasks" /*RemoteObject*/ ).getObject()),(__ref.getField(false,"_options" /*RemoteObject*/ ).getObject())}))));
 BA.debugLineNum = 269;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 270;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmfrappegantt","render", __ref);}
 BA.debugLineNum = 255;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 256;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setarrowcurve(RemoteObject __ref,RemoteObject _ac) throws Exception{
try {
		Debug.PushSubsStack("SetArrowCurve (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("setarrowcurve")) { return __ref.runUserSub(false, "vmfrappegantt","setarrowcurve", __ref, _ac);}
Debug.locals.put("ac", _ac);
 BA.debugLineNum = 131;BA.debugLine="Sub SetArrowCurve(ac As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="options.Put(\"arrow_curve\", ac)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("arrow_curve"))),(Object)((_ac)));
 BA.debugLineNum = 133;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 134;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmfrappegantt","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 217;BA.debugLine="Sub SetAttr(attr As Map) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 218;BA.debugLine="FrappeGantt.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 219;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 220;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbarheight(RemoteObject __ref,RemoteObject _bh) throws Exception{
try {
		Debug.PushSubsStack("SetBarHeight (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("setbarheight")) { return __ref.runUserSub(false, "vmfrappegantt","setbarheight", __ref, _bh);}
Debug.locals.put("bh", _bh);
 BA.debugLineNum = 119;BA.debugLine="Sub SetBarHeight(bh As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="options.Put(\"bar_height\", bh)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bar_height"))),(Object)((_bh)));
 BA.debugLineNum = 121;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbordercornerradius(RemoteObject __ref,RemoteObject _bcr) throws Exception{
try {
		Debug.PushSubsStack("SetBorderCornerRadius (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("setbordercornerradius")) { return __ref.runUserSub(false, "vmfrappegantt","setbordercornerradius", __ref, _bcr);}
Debug.locals.put("bcr", _bcr);
 BA.debugLineNum = 125;BA.debugLine="Sub SetBorderCornerRadius(bcr As String) As VMFrap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="options.Put(\"bar_corner_radius\", bcr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("bar_corner_radius"))),(Object)((_bcr)));
 BA.debugLineNum = 127;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 128;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnwidth(RemoteObject __ref,RemoteObject _cw) throws Exception{
try {
		Debug.PushSubsStack("SetColumnWidth (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("setcolumnwidth")) { return __ref.runUserSub(false, "vmfrappegantt","setcolumnwidth", __ref, _cw);}
Debug.locals.put("cw", _cw);
 BA.debugLineNum = 107;BA.debugLine="Sub SetColumnWidth(cw As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="options.Put(\"column_width\", cw)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("column_width"))),(Object)((_cw)));
 BA.debugLineNum = 109;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdateformat(RemoteObject __ref,RemoteObject _df) throws Exception{
try {
		Debug.PushSubsStack("SetDateFormat (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,149);
if (RapidSub.canDelegate("setdateformat")) { return __ref.runUserSub(false, "vmfrappegantt","setdateformat", __ref, _df);}
Debug.locals.put("df", _df);
 BA.debugLineNum = 149;BA.debugLine="Sub SetDateFormat(df As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 150;BA.debugLine="options.Put(\"date_format\", df)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("date_format"))),(Object)((_df)));
 BA.debugLineNum = 151;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmfrappegantt","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 52;BA.debugLine="Sub SetElevation(e As Int) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="p.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_p" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 54;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheaderheight(RemoteObject __ref,RemoteObject _hh) throws Exception{
try {
		Debug.PushSubsStack("SetHeaderHeight (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setheaderheight")) { return __ref.runUserSub(false, "vmfrappegantt","setheaderheight", __ref, _hh);}
Debug.locals.put("hh", _hh);
 BA.debugLineNum = 101;BA.debugLine="Sub SetHeaderHeight(hh As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="options.Put(\"header_height\", hh)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("header_height"))),(Object)((_hh)));
 BA.debugLineNum = 103;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vmfrappegantt","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 69;BA.debugLine="Sub SetHeight(h As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="p.SetStyle(CreateMap(\"height\":h))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_p" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmfrappegantt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),(_h)}))));
 BA.debugLineNum = 71;BA.debugLine="p.SetHeight(h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_p" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setheight" /*RemoteObject*/ ,(Object)(_h));
 BA.debugLineNum = 72;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 73;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _iid,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmfrappegantt","setid", __ref, _iid, _bind);}
Debug.locals.put("iID", _iid);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 190;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMFra";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="FrappeGantt.SetID(iID,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_iid),(Object)(_bind));
 BA.debugLineNum = 192;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmfrappegantt","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 200;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMFrap";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 201;BA.debugLine="FrappeGantt.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
 BA.debugLineNum = 202;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlanguage(RemoteObject __ref,RemoteObject _lng) throws Exception{
try {
		Debug.PushSubsStack("SetLanguage (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setlanguage")) { return __ref.runUserSub(false, "vmfrappegantt","setlanguage", __ref, _lng);}
Debug.locals.put("lng", _lng);
 BA.debugLineNum = 58;BA.debugLine="Sub SetLanguage(lng As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="options.Put(\"language\", lng)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("language"))),(Object)((_lng)));
 BA.debugLineNum = 60;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _nam,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,195);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmfrappegantt","setname", __ref, _nam, _bind);}
Debug.locals.put("nam", _nam);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 195;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 196;BA.debugLine="FrappeGantt.SetName(nam, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_nam),(Object)(_bind));
 BA.debugLineNum = 197;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclick(RemoteObject __ref,RemoteObject _task) throws Exception{
try {
		Debug.PushSubsStack("SetOnClick (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vmfrappegantt","setonclick", __ref, _task);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("task", _task);
 BA.debugLineNum = 223;BA.debugLine="private Sub SetOnClick(task As Object) As VMFrappe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmfrappegantt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))),(Object)(vmfrappegantt.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_task}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 225;BA.debugLine="options.Put(\"on_click\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("on_click"))),(Object)((_cb.getObject())));
 BA.debugLineNum = 226;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 227;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondatechange(RemoteObject __ref,RemoteObject _task,RemoteObject _start,RemoteObject _finish) throws Exception{
try {
		Debug.PushSubsStack("SetOnDateChange (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("setondatechange")) { return __ref.runUserSub(false, "vmfrappegantt","setondatechange", __ref, _task, _start, _finish);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("task", _task);
Debug.locals.put("start", _start);
Debug.locals.put("finish", _finish);
 BA.debugLineNum = 230;BA.debugLine="private Sub SetOnDateChange(task As Object, start";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmfrappegantt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_datechange")))),(Object)(vmfrappegantt.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {3},new Object[] {_task,_start,_finish}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 232;BA.debugLine="options.Put(\"on_date_change\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("on_date_change"))),(Object)((_cb.getObject())));
 BA.debugLineNum = 233;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 234;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonprogresschange(RemoteObject __ref,RemoteObject _task,RemoteObject _progress) throws Exception{
try {
		Debug.PushSubsStack("SetOnProgressChange (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("setonprogresschange")) { return __ref.runUserSub(false, "vmfrappegantt","setonprogresschange", __ref, _task, _progress);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("task", _task);
Debug.locals.put("progress", _progress);
 BA.debugLineNum = 237;BA.debugLine="private Sub SetOnProgressChange(task As Object, pr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmfrappegantt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_progresschange")))),(Object)(vmfrappegantt.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {2},new Object[] {_task,_progress}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 239;BA.debugLine="options.Put(\"on_date_change\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("on_date_change"))),(Object)((_cb.getObject())));
 BA.debugLineNum = 240;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 241;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonviewchange(RemoteObject __ref,RemoteObject _mode) throws Exception{
try {
		Debug.PushSubsStack("SetOnViewChange (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("setonviewchange")) { return __ref.runUserSub(false, "vmfrappegantt","setonviewchange", __ref, _mode);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("mode", _mode);
 BA.debugLineNum = 244;BA.debugLine="private Sub SetOnViewChange(mode As Object) As VMF";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmfrappegantt.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_viewchange")))),(Object)(vmfrappegantt.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_mode}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 246;BA.debugLine="options.Put(\"on_view_change\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("on_view_change"))),(Object)((_cb.getObject())));
 BA.debugLineNum = 247;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 248;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _px) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmfrappegantt","setpadding", __ref, _px);}
Debug.locals.put("px", _px);
 BA.debugLineNum = 137;BA.debugLine="Sub SetPadding(px As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="options.Put(\"padding\", px)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("padding"))),(Object)((_px)));
 BA.debugLineNum = 139;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstep(RemoteObject __ref,RemoteObject _si) throws Exception{
try {
		Debug.PushSubsStack("SetStep (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("setstep")) { return __ref.runUserSub(false, "vmfrappegantt","setstep", __ref, _si);}
Debug.locals.put("si", _si);
 BA.debugLineNum = 113;BA.debugLine="Sub SetStep(si As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="options.Put(\"step\", si)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("step"))),(Object)((_si)));
 BA.debugLineNum = 115;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmfrappegantt","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 180;BA.debugLine="Sub SetStyle(sm As Map) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="FrappeGantt.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 182;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,173);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmfrappegantt","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 173;BA.debugLine="Sub SetTabIndex(ti As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 174;BA.debugLine="If ti = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ti,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 175;BA.debugLine="FrappeGantt.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
 BA.debugLineNum = 176;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviewday(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetViewDay (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("setviewday")) { return __ref.runUserSub(false, "vmfrappegantt","setviewday", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Sub SetViewDay As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="SetViewMode(\"Day\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setviewmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Day")));
 BA.debugLineNum = 87;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviewhalfday(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetViewHalfDay (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setviewhalfday")) { return __ref.runUserSub(false, "vmfrappegantt","setviewhalfday", __ref);}
 BA.debugLineNum = 90;BA.debugLine="Sub SetViewHalfDay As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="SetViewMode(\"Half Day\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setviewmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Half Day")));
 BA.debugLineNum = 92;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviewmode(RemoteObject __ref,RemoteObject _vm) throws Exception{
try {
		Debug.PushSubsStack("SetViewMode (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("setviewmode")) { return __ref.runUserSub(false, "vmfrappegantt","setviewmode", __ref, _vm);}
Debug.locals.put("vm", _vm);
 BA.debugLineNum = 143;BA.debugLine="Sub SetViewMode(vm As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="options.Put(\"view_mode\", vm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_options" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("view_mode"))),(Object)((_vm)));
 BA.debugLineNum = 145;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviewmonth(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetViewMonth (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setviewmonth")) { return __ref.runUserSub(false, "vmfrappegantt","setviewmonth", __ref);}
 BA.debugLineNum = 75;BA.debugLine="Sub SetViewMonth As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="SetViewMode(\"Month\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setviewmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Month")));
 BA.debugLineNum = 77;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 78;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviewquarterday(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetViewQuarterDay (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setviewquarterday")) { return __ref.runUserSub(false, "vmfrappegantt","setviewquarterday", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Sub SetViewQuarterDay As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="SetViewMode(\"Quarter Day\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setviewmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Quarter Day")));
 BA.debugLineNum = 97;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 98;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setviewweek(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetViewWeek (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setviewweek")) { return __ref.runUserSub(false, "vmfrappegantt","setviewweek", __ref);}
 BA.debugLineNum = 80;BA.debugLine="Sub SetViewWeek As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="SetViewMode(\"Week\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmfrappegantt.class, "_setviewmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("Week")));
 BA.debugLineNum = 82;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmfrappegantt","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 185;BA.debugLine="Sub SetVIf(vif As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 186;BA.debugLine="FrappeGantt.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 187;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 188;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,205);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmfrappegantt","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 205;BA.debugLine="Sub SetVShow(vif As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 206;BA.debugLine="FrappeGantt.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 207;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 208;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmfrappegantt","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 63;BA.debugLine="Sub SetWidth(w As String) As VMFrappeGantt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="p.SetStyle(CreateMap(\"width\":w))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_p" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmfrappegantt.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),(_w)}))));
 BA.debugLineNum = 65;BA.debugLine="p.SetWidth(w)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_p" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setwidth" /*RemoteObject*/ ,(Object)(_w));
 BA.debugLineNum = 66;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmfrappegantt) ","vmfrappegantt",59,__ref.getField(false, "ba"),__ref,250);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmfrappegantt","tostring", __ref);}
 BA.debugLineNum = 250;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 251;BA.debugLine="FrappeGantt.Pop(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_frappegantt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_p" /*RemoteObject*/ )));
 BA.debugLineNum = 252;BA.debugLine="Return p.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_p" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
}