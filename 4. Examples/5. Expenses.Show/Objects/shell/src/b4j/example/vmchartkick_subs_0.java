package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmchartkick_subs_0 {


public static RemoteObject  _addbubble(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("AddBubble (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("addbubble")) { return __ref.runUserSub(false, "vmchartkick","addbubble", __ref, _x, _y, _size);}
RemoteObject _exdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cudata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("X", _x);
Debug.locals.put("y", _y);
Debug.locals.put("size", _size);
 BA.debugLineNum = 230;BA.debugLine="Sub AddBubble(X As String, y As String, size As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 232;BA.debugLine="Dim exdata As List = data.Get(\"a\")";
Debug.JustUpdateDeviceLine();
_exdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_exdata.setObject(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("a")))));Debug.locals.put("exdata", _exdata);
 BA.debugLineNum = 233;BA.debugLine="Dim cudata As List";
Debug.JustUpdateDeviceLine();
_cudata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cudata", _cudata);
 BA.debugLineNum = 234;BA.debugLine="cudata.Initialize";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Initialize");
 BA.debugLineNum = 235;BA.debugLine="cudata.Add(X)";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Add",(Object)((_x)));
 BA.debugLineNum = 236;BA.debugLine="cudata.Add(y)";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Add",(Object)((_y)));
 BA.debugLineNum = 237;BA.debugLine="cudata.Add(size)";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Add",(Object)((_size)));
 BA.debugLineNum = 238;BA.debugLine="exdata.Add(cudata)";
Debug.JustUpdateDeviceLine();
_exdata.runVoidMethod ("Add",(Object)((_cudata.getObject())));
 BA.debugLineNum = 239;BA.debugLine="data.Put(\"a\",exdata)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("a"))),(Object)((_exdata.getObject())));
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,446);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmchartkick","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 446;BA.debugLine="Sub AddClass(c As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 447;BA.debugLine="ChartKick.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 448;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 449;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addseries(RemoteObject __ref,RemoteObject _seriescaption,RemoteObject _seriescolor,RemoteObject _seriescurve,RemoteObject _seriesdata) throws Exception{
try {
		Debug.PushSubsStack("AddSeries (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("addseries")) { return __ref.runUserSub(false, "vmchartkick","addseries", __ref, _seriescaption, _seriescolor, _seriescurve, _seriesdata);}
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _xcolor = RemoteObject.createImmutable("");
Debug.locals.put("seriesCaption", _seriescaption);
Debug.locals.put("seriesColor", _seriescolor);
Debug.locals.put("seriesCurve", _seriescurve);
Debug.locals.put("seriesData", _seriesdata);
 BA.debugLineNum = 176;BA.debugLine="Sub AddSeries(seriesCaption As String, seriesColor";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="Dim obj As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_obj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_obj = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("obj", _obj);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 178;BA.debugLine="obj.Put(\"name\", seriesCaption)";
Debug.JustUpdateDeviceLine();
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("name"))),(Object)((_seriescaption)));
 BA.debugLineNum = 179;BA.debugLine="obj.Put(\"data\", seriesData)";
Debug.JustUpdateDeviceLine();
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_seriesdata.getObject())));
 BA.debugLineNum = 180;BA.debugLine="obj.Put(\"curve\", seriesCurve)";
Debug.JustUpdateDeviceLine();
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("curve"))),(Object)((_seriescurve)));
 BA.debugLineNum = 181;BA.debugLine="obj.Put(\"label\", seriesCaption)";
Debug.JustUpdateDeviceLine();
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("label"))),(Object)((_seriescaption)));
 BA.debugLineNum = 182;BA.debugLine="If seriesColor <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_seriescolor,BA.ObjectToString(""))) { 
 BA.debugLineNum = 183;BA.debugLine="Dim xColor As String = vue.GetColorHex(seriesCol";
Debug.JustUpdateDeviceLine();
_xcolor = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getcolorhex" /*RemoteObject*/ ,(Object)(_seriescolor));Debug.locals.put("xColor", _xcolor);Debug.locals.put("xColor", _xcolor);
 BA.debugLineNum = 184;BA.debugLine="obj.Put(\"color\", xColor)";
Debug.JustUpdateDeviceLine();
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("color"))),(Object)((_xcolor)));
 };
 BA.debugLineNum = 186;BA.debugLine="series.Put(seriesCaption, obj)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_series" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_seriescaption)),(Object)((_obj.getObject())));
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
public static RemoteObject  _addxy(RemoteObject __ref,RemoteObject _x,RemoteObject _y) throws Exception{
try {
		Debug.PushSubsStack("AddXY (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("addxy")) { return __ref.runUserSub(false, "vmchartkick","addxy", __ref, _x, _y);}
RemoteObject _exdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cudata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("X", _x);
Debug.locals.put("y", _y);
 BA.debugLineNum = 191;BA.debugLine="Sub AddXY(X As String, y As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="Dim exdata As List = data.Get(\"a\")";
Debug.JustUpdateDeviceLine();
_exdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_exdata.setObject(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("a")))));Debug.locals.put("exdata", _exdata);
 BA.debugLineNum = 194;BA.debugLine="Dim cudata As List";
Debug.JustUpdateDeviceLine();
_cudata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cudata", _cudata);
 BA.debugLineNum = 195;BA.debugLine="cudata.Initialize";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Initialize");
 BA.debugLineNum = 196;BA.debugLine="cudata.Add(X)";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Add",(Object)((_x)));
 BA.debugLineNum = 197;BA.debugLine="cudata.Add(y)";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Add",(Object)((_y)));
 BA.debugLineNum = 198;BA.debugLine="exdata.Add(cudata)";
Debug.JustUpdateDeviceLine();
_exdata.runVoidMethod ("Add",(Object)((_cudata.getObject())));
 BA.debugLineNum = 199;BA.debugLine="data.Put(\"a\",exdata)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("a"))),(Object)((_exdata.getObject())));
 BA.debugLineNum = 200;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addxycolor(RemoteObject __ref,RemoteObject _x,RemoteObject _y,RemoteObject _color) throws Exception{
try {
		Debug.PushSubsStack("AddXYColor (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("addxycolor")) { return __ref.runUserSub(false, "vmchartkick","addxycolor", __ref, _x, _y, _color);}
RemoteObject _exdata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cudata = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _xcolor = RemoteObject.createImmutable("");
Debug.locals.put("X", _x);
Debug.locals.put("y", _y);
Debug.locals.put("color", _color);
 BA.debugLineNum = 204;BA.debugLine="Sub AddXYColor(X As String, y As String, color As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 206;BA.debugLine="Dim exdata As List = data.Get(\"a\")";
Debug.JustUpdateDeviceLine();
_exdata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_exdata.setObject(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("a")))));Debug.locals.put("exdata", _exdata);
 BA.debugLineNum = 207;BA.debugLine="Dim cudata As List";
Debug.JustUpdateDeviceLine();
_cudata = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("cudata", _cudata);
 BA.debugLineNum = 208;BA.debugLine="cudata.Initialize";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Initialize");
 BA.debugLineNum = 209;BA.debugLine="cudata.Add(X)";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Add",(Object)((_x)));
 BA.debugLineNum = 210;BA.debugLine="cudata.Add(y)";
Debug.JustUpdateDeviceLine();
_cudata.runVoidMethod ("Add",(Object)((_y)));
 BA.debugLineNum = 211;BA.debugLine="exdata.Add(cudata)";
Debug.JustUpdateDeviceLine();
_exdata.runVoidMethod ("Add",(Object)((_cudata.getObject())));
 BA.debugLineNum = 212;BA.debugLine="data.Put(\"a\",exdata)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("a"))),(Object)((_exdata.getObject())));
 BA.debugLineNum = 213;BA.debugLine="If color <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_color,BA.ObjectToString(""))) { 
 BA.debugLineNum = 214;BA.debugLine="Dim xColor As String = vue.GetColorHex(color)";
Debug.JustUpdateDeviceLine();
_xcolor = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getcolorhex" /*RemoteObject*/ ,(Object)(_color));Debug.locals.put("xColor", _xcolor);Debug.locals.put("xColor", _xcolor);
 BA.debugLineNum = 215;BA.debugLine="colors.Add(xColor)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_xcolor)));
 };
 BA.debugLineNum = 217;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 218;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addxymap(RemoteObject __ref,RemoteObject _values) throws Exception{
try {
		Debug.PushSubsStack("AddXYMap (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("addxymap")) { return __ref.runUserSub(false, "vmchartkick","addxymap", __ref, _values);}
RemoteObject _strkey = RemoteObject.createImmutable("");
RemoteObject _strval = RemoteObject.createImmutable("");
Debug.locals.put("values", _values);
 BA.debugLineNum = 221;BA.debugLine="Sub AddXYMap(values As Map) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 222;BA.debugLine="For Each strKey As String In values.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _values.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strkey = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strKey", _strkey);
Debug.locals.put("strKey", _strkey);
 BA.debugLineNum = 223;BA.debugLine="Dim strVal As String = values.Get(strKey)";
Debug.JustUpdateDeviceLine();
_strval = BA.ObjectToString(_values.runMethod(false,"Get",(Object)((_strkey))));Debug.locals.put("strVal", _strval);Debug.locals.put("strVal", _strval);
 BA.debugLineNum = 224;BA.debugLine="AddXY(strKey,strVal)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_addxy" /*RemoteObject*/ ,(Object)(_strkey),(Object)(_strval));
 }
}Debug.locals.put("strKey", _strkey);
;
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
public static RemoteObject  _buildoptions(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("BuildOptions (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("buildoptions")) { return __ref.runUserSub(false, "vmchartkick","buildoptions", __ref);}
RemoteObject _chartoptions = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _scales = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _xlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _xticks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _xsis = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _xgrid = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ylist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _ysis = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _yticks = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _ygrid = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _titobj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 100;BA.debugLine="private Sub BuildOptions";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="Dim chartOptions As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_chartoptions = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_chartoptions = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("chartOptions", _chartoptions);Debug.locals.put("chartOptions", _chartoptions);
 BA.debugLineNum = 102;BA.debugLine="Dim scales As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_scales = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_scales = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("scales", _scales);Debug.locals.put("scales", _scales);
 BA.debugLineNum = 104;BA.debugLine="Dim xList As List";
Debug.JustUpdateDeviceLine();
_xlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("xList", _xlist);
 BA.debugLineNum = 105;BA.debugLine="Dim xticks As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_xticks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_xticks = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("xticks", _xticks);Debug.locals.put("xticks", _xticks);
 BA.debugLineNum = 106;BA.debugLine="Dim xsis As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_xsis = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_xsis = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("xsis", _xsis);Debug.locals.put("xsis", _xsis);
 BA.debugLineNum = 107;BA.debugLine="Dim xgrid As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_xgrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_xgrid = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("xgrid", _xgrid);Debug.locals.put("xgrid", _xgrid);
 BA.debugLineNum = 109;BA.debugLine="xList.Initialize";
Debug.JustUpdateDeviceLine();
_xlist.runVoidMethod ("Initialize");
 BA.debugLineNum = 110;BA.debugLine="If xAxes.ticks.autoSkip <> Null Then xticks.Put(\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"autoSkip" /*RemoteObject*/ ),BA.ObjectToBoolean(vmchartkick.__c.getField(false,"Null")))) { 
_xticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("autoSkip"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"autoSkip" /*RemoteObject*/ ))));};
 BA.debugLineNum = 111;BA.debugLine="If xAxes.ticks.maxRotation <> Null Then xticks.Pu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"maxRotation" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_xticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("maxRotation"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"maxRotation" /*RemoteObject*/ ))));};
 BA.debugLineNum = 112;BA.debugLine="If xAxes.ticks.minRotation <> Null Then xticks.Pu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"minRotation" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_xticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("minRotation"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"minRotation" /*RemoteObject*/ ))));};
 BA.debugLineNum = 113;BA.debugLine="If xAxes.ticks.MinValue <> Null Then xticks.Put(\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_xticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("min"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ ))));};
 BA.debugLineNum = 114;BA.debugLine="If xAxes.ticks.MaxValue <> Null Then xticks.Put(\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_xticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("max"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ ))));};
 BA.debugLineNum = 115;BA.debugLine="If xAxes.ticks.stepSize <> Null Then xticks.Put(\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"stepSize" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_xticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stepSize"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"stepSize" /*RemoteObject*/ ))));};
 BA.debugLineNum = 116;BA.debugLine="If xAxes.ticks.beginAtZero <> Null Then xticks.Pu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"beginAtZero" /*RemoteObject*/ ),BA.ObjectToBoolean(vmchartkick.__c.getField(false,"Null")))) { 
_xticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beginAtZero"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"beginAtZero" /*RemoteObject*/ ))));};
 BA.debugLineNum = 118;BA.debugLine="xgrid.Put(\"display\", xAxes.gridLines.display)";
Debug.JustUpdateDeviceLine();
_xgrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("display"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"display" /*RemoteObject*/ ))));
 BA.debugLineNum = 119;BA.debugLine="xgrid.Put(\"circular\",xAxes.gridLines.circular)";
Debug.JustUpdateDeviceLine();
_xgrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("circular"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"circular" /*RemoteObject*/ ))));
 BA.debugLineNum = 120;BA.debugLine="xgrid.Put(\"lineWidth\",xAxes.gridLines.lineWidth)";
Debug.JustUpdateDeviceLine();
_xgrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lineWidth"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"lineWidth" /*RemoteObject*/ ))));
 BA.debugLineNum = 121;BA.debugLine="xgrid.Put(\"drawBorder\",xAxes.gridLines.drawBorder";
Debug.JustUpdateDeviceLine();
_xgrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("drawBorder"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"drawBorder" /*RemoteObject*/ ))));
 BA.debugLineNum = 122;BA.debugLine="xgrid.Put(\"drawOnChartArea\",xAxes.gridLines.drawO";
Debug.JustUpdateDeviceLine();
_xgrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("drawOnChartArea"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"drawOnChartArea" /*RemoteObject*/ ))));
 BA.debugLineNum = 123;BA.debugLine="xgrid.Put(\"drawTicks\",xAxes.gridLines.drawTicks)";
Debug.JustUpdateDeviceLine();
_xgrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("drawTicks"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"drawTicks" /*RemoteObject*/ ))));
 BA.debugLineNum = 124;BA.debugLine="xgrid.Put(\"tickMarkLength\",xAxes.gridLines.tickMa";
Debug.JustUpdateDeviceLine();
_xgrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tickMarkLength"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"tickMarkLength" /*RemoteObject*/ ))));
 BA.debugLineNum = 125;BA.debugLine="xgrid.Put(\"zeroLineWidth\",xAxes.gridLines.zeroLin";
Debug.JustUpdateDeviceLine();
_xgrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("zeroLineWidth"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"zeroLineWidth" /*RemoteObject*/ ))));
 BA.debugLineNum = 126;BA.debugLine="xgrid.Put(\"offsetGridLines\",xAxes.gridLines.offse";
Debug.JustUpdateDeviceLine();
_xgrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("offsetGridLines"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"offsetGridLines" /*RemoteObject*/ ))));
 BA.debugLineNum = 129;BA.debugLine="xsis.Put(\"display\", xAxes.display)";
Debug.JustUpdateDeviceLine();
_xsis.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("display"))),(Object)((__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(true,"display" /*RemoteObject*/ ))));
 BA.debugLineNum = 130;BA.debugLine="If xticks.Size > 0 Then xsis.Put(\"ticks\", xticks)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_xticks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_xsis.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ticks"))),(Object)((_xticks.getObject())));};
 BA.debugLineNum = 131;BA.debugLine="If xgrid.Size > 0 Then xsis.Put(\"gridLines\", xgri";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_xgrid.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_xsis.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gridLines"))),(Object)((_xgrid.getObject())));};
 BA.debugLineNum = 132;BA.debugLine="xList.Add(xsis)";
Debug.JustUpdateDeviceLine();
_xlist.runVoidMethod ("Add",(Object)((_xsis.getObject())));
 BA.debugLineNum = 133;BA.debugLine="scales.Put(\"xAxes\", xList)";
Debug.JustUpdateDeviceLine();
_scales.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("xAxes"))),(Object)((_xlist.getObject())));
 BA.debugLineNum = 135;BA.debugLine="Dim yList As List";
Debug.JustUpdateDeviceLine();
_ylist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("yList", _ylist);
 BA.debugLineNum = 136;BA.debugLine="Dim ysis As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_ysis = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ysis = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("ysis", _ysis);Debug.locals.put("ysis", _ysis);
 BA.debugLineNum = 137;BA.debugLine="Dim yticks As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_yticks = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_yticks = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("yticks", _yticks);Debug.locals.put("yticks", _yticks);
 BA.debugLineNum = 138;BA.debugLine="Dim ygrid As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_ygrid = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_ygrid = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("ygrid", _ygrid);Debug.locals.put("ygrid", _ygrid);
 BA.debugLineNum = 140;BA.debugLine="yList.Initialize";
Debug.JustUpdateDeviceLine();
_ylist.runVoidMethod ("Initialize");
 BA.debugLineNum = 141;BA.debugLine="If yAxes.ticks.autoSkip <> Null Then yticks.Put(\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"autoSkip" /*RemoteObject*/ ),BA.ObjectToBoolean(vmchartkick.__c.getField(false,"Null")))) { 
_yticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("autoSkip"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"autoSkip" /*RemoteObject*/ ))));};
 BA.debugLineNum = 142;BA.debugLine="If yAxes.ticks.maxRotation <> Null Then yticks.Pu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"maxRotation" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_yticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("maxRotation"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"maxRotation" /*RemoteObject*/ ))));};
 BA.debugLineNum = 143;BA.debugLine="If yAxes.ticks.minRotation <> Null Then yticks.Pu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"minRotation" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_yticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("minRotation"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"minRotation" /*RemoteObject*/ ))));};
 BA.debugLineNum = 144;BA.debugLine="If yAxes.ticks.MinValue <> Null Then yticks.Put(\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_yticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("min"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"MinValue" /*RemoteObject*/ ))));};
 BA.debugLineNum = 145;BA.debugLine="If yAxes.ticks.MaxValue <> Null Then yticks.Put(\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_yticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("max"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"MaxValue" /*RemoteObject*/ ))));};
 BA.debugLineNum = 146;BA.debugLine="If yAxes.ticks.stepSize <> Null Then yticks.Put(\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"stepSize" /*RemoteObject*/ ),BA.numberCast(double.class, vmchartkick.__c.getField(false,"Null")))) { 
_yticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("stepSize"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"stepSize" /*RemoteObject*/ ))));};
 BA.debugLineNum = 147;BA.debugLine="If yAxes.ticks.beginAtZero <> Null Then yticks.Pu";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"beginAtZero" /*RemoteObject*/ ),BA.ObjectToBoolean(vmchartkick.__c.getField(false,"Null")))) { 
_yticks.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beginAtZero"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).getField(true,"beginAtZero" /*RemoteObject*/ ))));};
 BA.debugLineNum = 149;BA.debugLine="ygrid.Put(\"display\", yAxes.gridLines.display)";
Debug.JustUpdateDeviceLine();
_ygrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("display"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"display" /*RemoteObject*/ ))));
 BA.debugLineNum = 150;BA.debugLine="ygrid.Put(\"circular\",yAxes.gridLines.circular)";
Debug.JustUpdateDeviceLine();
_ygrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("circular"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"circular" /*RemoteObject*/ ))));
 BA.debugLineNum = 151;BA.debugLine="ygrid.Put(\"lineWidth\",yAxes.gridLines.lineWidth)";
Debug.JustUpdateDeviceLine();
_ygrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lineWidth"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"lineWidth" /*RemoteObject*/ ))));
 BA.debugLineNum = 152;BA.debugLine="ygrid.Put(\"drawBorder\",yAxes.gridLines.drawBorder";
Debug.JustUpdateDeviceLine();
_ygrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("drawBorder"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"drawBorder" /*RemoteObject*/ ))));
 BA.debugLineNum = 153;BA.debugLine="ygrid.Put(\"drawOnChartArea\",yAxes.gridLines.drawO";
Debug.JustUpdateDeviceLine();
_ygrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("drawOnChartArea"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"drawOnChartArea" /*RemoteObject*/ ))));
 BA.debugLineNum = 154;BA.debugLine="ygrid.Put(\"drawTicks\",yAxes.gridLines.drawTicks)";
Debug.JustUpdateDeviceLine();
_ygrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("drawTicks"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"drawTicks" /*RemoteObject*/ ))));
 BA.debugLineNum = 155;BA.debugLine="ygrid.Put(\"tickMarkLength\",yAxes.gridLines.tickMa";
Debug.JustUpdateDeviceLine();
_ygrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("tickMarkLength"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"tickMarkLength" /*RemoteObject*/ ))));
 BA.debugLineNum = 156;BA.debugLine="ygrid.Put(\"zeroLineWidth\",yAxes.gridLines.zeroLin";
Debug.JustUpdateDeviceLine();
_ygrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("zeroLineWidth"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"zeroLineWidth" /*RemoteObject*/ ))));
 BA.debugLineNum = 157;BA.debugLine="ygrid.Put(\"offsetGridLines\",yAxes.gridLines.offse";
Debug.JustUpdateDeviceLine();
_ygrid.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("offsetGridLines"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).getField(true,"offsetGridLines" /*RemoteObject*/ ))));
 BA.debugLineNum = 159;BA.debugLine="ysis.Put(\"display\", yAxes.display)";
Debug.JustUpdateDeviceLine();
_ysis.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("display"))),(Object)((__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(true,"display" /*RemoteObject*/ ))));
 BA.debugLineNum = 160;BA.debugLine="If yticks.Size > 0 Then ysis.Put(\"ticks\", yticks)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_yticks.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_ysis.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("ticks"))),(Object)((_yticks.getObject())));};
 BA.debugLineNum = 161;BA.debugLine="If ygrid.Size > 0 Then ysis.Put(\"gridLines\", ygri";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_ygrid.runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
_ysis.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("gridLines"))),(Object)((_ygrid.getObject())));};
 BA.debugLineNum = 162;BA.debugLine="yList.Add(ysis)";
Debug.JustUpdateDeviceLine();
_ylist.runVoidMethod ("Add",(Object)((_ysis.getObject())));
 BA.debugLineNum = 163;BA.debugLine="scales.Put(\"yAxes\", yList)";
Debug.JustUpdateDeviceLine();
_scales.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("yAxes"))),(Object)((_ylist.getObject())));
 BA.debugLineNum = 165;BA.debugLine="chartOptions.Put(\"scales\", scales)";
Debug.JustUpdateDeviceLine();
_chartoptions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("scales"))),(Object)((_scales.getObject())));
 BA.debugLineNum = 167;BA.debugLine="Dim titObj As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_titobj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_titobj = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("titObj", _titobj);Debug.locals.put("titObj", _titobj);
 BA.debugLineNum = 168;BA.debugLine="titObj.Put(\"display\", Title.display)";
Debug.JustUpdateDeviceLine();
_titobj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("display"))),(Object)((__ref.getField(false,"_title" /*RemoteObject*/ ).getField(true,"display" /*RemoteObject*/ ))));
 BA.debugLineNum = 169;BA.debugLine="titObj.Put(\"text\", Title.text)";
Debug.JustUpdateDeviceLine();
_titobj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("text"))),(Object)((__ref.getField(false,"_title" /*RemoteObject*/ ).getField(true,"text" /*RemoteObject*/ ))));
 BA.debugLineNum = 170;BA.debugLine="chartOptions.Put(\"title\", titObj)";
Debug.JustUpdateDeviceLine();
_chartoptions.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("title"))),(Object)((_titobj.getObject())));
 BA.debugLineNum = 172;BA.debugLine="vue.SetStateSingle(coptions, chartOptions)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_coptions" /*RemoteObject*/ )),(Object)((_chartoptions.getObject())));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public ChartKick As VMElement";
vmchartkick._chartkick = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_chartkick",vmchartkick._chartkick);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmchartkick._id = RemoteObject.createImmutable("");__ref.setField("_id",vmchartkick._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmchartkick._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmchartkick._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmchartkick._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmchartkick._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmchartkick._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmchartkick._module);
 //BA.debugLineNum = 9;BA.debugLine="Private series As Map";
vmchartkick._series = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_series",vmchartkick._series);
 //BA.debugLineNum = 10;BA.debugLine="Private data As Map";
vmchartkick._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_data",vmchartkick._data);
 //BA.debugLineNum = 11;BA.debugLine="Private colors As List";
vmchartkick._colors = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_colors",vmchartkick._colors);
 //BA.debugLineNum = 12;BA.debugLine="Private coptions As String";
vmchartkick._coptions = RemoteObject.createImmutable("");__ref.setField("_coptions",vmchartkick._coptions);
 //BA.debugLineNum = 13;BA.debugLine="Type grdLine(display As Boolean, circular As Bool";
;
 //BA.debugLineNum = 15;BA.debugLine="Type ticksType(autoSkip As Boolean, maxRotation A";
;
 //BA.debugLineNum = 17;BA.debugLine="Type xAxesType(display As Boolean, ticks As ticks";
;
 //BA.debugLineNum = 18;BA.debugLine="Public xAxes As xAxesType";
vmchartkick._xaxes = RemoteObject.createNew ("b4j.example.vmchartkick._xaxestype");__ref.setField("_xaxes",vmchartkick._xaxes);
 //BA.debugLineNum = 19;BA.debugLine="Public yAxes As xAxesType";
vmchartkick._yaxes = RemoteObject.createNew ("b4j.example.vmchartkick._xaxestype");__ref.setField("_yaxes",vmchartkick._yaxes);
 //BA.debugLineNum = 20;BA.debugLine="Public OverwriteOptions As Boolean";
vmchartkick._overwriteoptions = RemoteObject.createImmutable(false);__ref.setField("_overwriteoptions",vmchartkick._overwriteoptions);
 //BA.debugLineNum = 21;BA.debugLine="Type titleType(display As Boolean, text As String";
;
 //BA.debugLineNum = 22;BA.debugLine="Public Title As titleType";
vmchartkick._title = RemoteObject.createNew ("b4j.example.vmchartkick._titletype");__ref.setField("_title",vmchartkick._title);
 //BA.debugLineNum = 23;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmchartkick","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sl = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 25;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 27;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 28;BA.debugLine="ChartKick.Initialize(vue, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 29;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 30;BA.debugLine="series.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_series" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 31;BA.debugLine="data.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 32;BA.debugLine="colors.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_colors" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 33;BA.debugLine="Dim sl As List";
Debug.JustUpdateDeviceLine();
_sl = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sl", _sl);
 BA.debugLineNum = 34;BA.debugLine="sl.Initialize";
Debug.JustUpdateDeviceLine();
_sl.runVoidMethod ("Initialize");
 BA.debugLineNum = 35;BA.debugLine="data.Put(\"a\",sl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("a"))),(Object)((_sl.getObject())));
 BA.debugLineNum = 36;BA.debugLine="SetStyleSingle(\"width\", \"100%\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setstylesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("width")),(Object)(RemoteObject.createImmutable("100%")));
 BA.debugLineNum = 37;BA.debugLine="ChartKick.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 38;BA.debugLine="coptions = $\"${ID}options\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_coptions" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmchartkick.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("options"))));
 BA.debugLineNum = 39;BA.debugLine="SetDownload";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setdownload" /*RemoteObject*/ );
 BA.debugLineNum = 40;BA.debugLine="SetAttrSingle(\":library\", coptions)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":library")),(Object)((__ref.getField(true,"_coptions" /*RemoteObject*/ ))));
 BA.debugLineNum = 42;BA.debugLine="xAxes.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 43;BA.debugLine="xAxes.ticks.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="xAxes.gridLines.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="xAxes.display = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).setField ("display" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 46;BA.debugLine="xAxes.ticks.autoSkip = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("autoSkip" /*RemoteObject*/ ,BA.ObjectToBoolean(vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 47;BA.debugLine="xAxes.ticks.maxRotation = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("maxRotation" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 48;BA.debugLine="xAxes.ticks.minRotation = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("minRotation" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 49;BA.debugLine="xAxes.ticks.MinValue = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("MinValue" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 50;BA.debugLine="xAxes.ticks.MaxValue = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("MaxValue" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 51;BA.debugLine="xAxes.ticks.stepSize = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("stepSize" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 52;BA.debugLine="xAxes.ticks.beginAtZero = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("beginAtZero" /*RemoteObject*/ ,BA.ObjectToBoolean(vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 54;BA.debugLine="xAxes.gridLines.display = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("display" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 55;BA.debugLine="xAxes.gridLines.circular = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("circular" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"False"));
 BA.debugLineNum = 56;BA.debugLine="xAxes.gridLines.lineWidth = 1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("lineWidth" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 57;BA.debugLine="xAxes.gridLines.drawBorder = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("drawBorder" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 58;BA.debugLine="xAxes.gridLines.drawOnChartArea = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("drawOnChartArea" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 59;BA.debugLine="xAxes.gridLines.drawTicks = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("drawTicks" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 60;BA.debugLine="xAxes.gridLines.tickMarkLength = 10";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("tickMarkLength" /*RemoteObject*/ ,BA.numberCast(int.class, 10));
 BA.debugLineNum = 61;BA.debugLine="xAxes.gridLines.zeroLineWidth = 1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("zeroLineWidth" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 62;BA.debugLine="xAxes.gridLines.offsetGridLines = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("offsetGridLines" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"False"));
 BA.debugLineNum = 64;BA.debugLine="yAxes.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 65;BA.debugLine="yAxes.ticks.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 66;BA.debugLine="yAxes.gridLines.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 67;BA.debugLine="yAxes.display = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).setField ("display" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 68;BA.debugLine="yAxes.ticks.autoSkip = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("autoSkip" /*RemoteObject*/ ,BA.ObjectToBoolean(vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 69;BA.debugLine="yAxes.ticks.maxRotation = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("maxRotation" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 70;BA.debugLine="yAxes.ticks.minRotation = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("minRotation" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 71;BA.debugLine="yAxes.ticks.MinValue = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("MinValue" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 72;BA.debugLine="yAxes.ticks.MaxValue = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("MaxValue" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 73;BA.debugLine="yAxes.ticks.stepSize = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("stepSize" /*RemoteObject*/ ,BA.numberCast(int.class, vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 74;BA.debugLine="yAxes.ticks.beginAtZero = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"ticks" /*RemoteObject*/ ).setField ("beginAtZero" /*RemoteObject*/ ,BA.ObjectToBoolean(vmchartkick.__c.getField(false,"Null")));
 BA.debugLineNum = 75;BA.debugLine="yAxes.gridLines.display = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("display" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 76;BA.debugLine="yAxes.gridLines.circular = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("circular" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"False"));
 BA.debugLineNum = 77;BA.debugLine="yAxes.gridLines.lineWidth = 1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("lineWidth" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 78;BA.debugLine="yAxes.gridLines.drawBorder = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("drawBorder" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="yAxes.gridLines.drawOnChartArea = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("drawOnChartArea" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 80;BA.debugLine="yAxes.gridLines.drawTicks = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("drawTicks" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="yAxes.gridLines.tickMarkLength = 10";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("tickMarkLength" /*RemoteObject*/ ,BA.numberCast(int.class, 10));
 BA.debugLineNum = 82;BA.debugLine="yAxes.gridLines.zeroLineWidth = 1";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("zeroLineWidth" /*RemoteObject*/ ,BA.numberCast(int.class, 1));
 BA.debugLineNum = 83;BA.debugLine="yAxes.gridLines.offsetGridLines = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).getField(false,"gridLines" /*RemoteObject*/ ).setField ("offsetGridLines" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"False"));
 BA.debugLineNum = 86;BA.debugLine="Title.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_title" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 87;BA.debugLine="Title.display = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_title" /*RemoteObject*/ ).setField ("display" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
 BA.debugLineNum = 88;BA.debugLine="Title.position = \"top\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_title" /*RemoteObject*/ ).setField ("position" /*RemoteObject*/ ,BA.ObjectToString("top"));
 BA.debugLineNum = 89;BA.debugLine="Title.text = \"\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_title" /*RemoteObject*/ ).setField ("text" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 91;BA.debugLine="OverwriteOptions = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_overwriteoptions" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"True"));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmchartkick","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 495;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 496;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmchartkick.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 497;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,491);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmchartkick","render", __ref);}
 BA.debugLineNum = 491;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 492;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmchartkick.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setareachart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetAreaChart (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,425);
if (RapidSub.canDelegate("setareachart")) { return __ref.runUserSub(false, "vmchartkick","setareachart", __ref);}
 BA.debugLineNum = 425;BA.debugLine="Sub SetAreaChart As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 426;BA.debugLine="ChartKick.SetTag(\"area-chart\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("area-chart")));
 BA.debugLineNum = 427;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 428;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,452);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmchartkick","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 452;BA.debugLine="Sub SetAttr(attr As Map) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 453;BA.debugLine="ChartKick.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 454;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 455;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrsingle(RemoteObject __ref,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetAttrSingle (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,457);
if (RapidSub.canDelegate("setattrsingle")) { return __ref.runUserSub(false, "vmchartkick","setattrsingle", __ref, _prop, _val);}
RemoteObject _attr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 457;BA.debugLine="Sub SetAttrSingle(prop As String, val As Object) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 458;BA.debugLine="Dim attr As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_attr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_attr = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("attr", _attr);Debug.locals.put("attr", _attr);
 BA.debugLineNum = 459;BA.debugLine="attr.Put(prop, val)";
Debug.JustUpdateDeviceLine();
_attr.runVoidMethod ("Put",(Object)((_prop)),(Object)(_val));
 BA.debugLineNum = 460;BA.debugLine="SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 461;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 462;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbarchart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBarChart (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,415);
if (RapidSub.canDelegate("setbarchart")) { return __ref.runUserSub(false, "vmchartkick","setbarchart", __ref);}
 BA.debugLineNum = 415;BA.debugLine="Sub SetBarChart As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 416;BA.debugLine="ChartKick.SetTag(\"bar-chart\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("bar-chart")));
 BA.debugLineNum = 417;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 418;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbytes(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBytes (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,358);
if (RapidSub.canDelegate("setbytes")) { return __ref.runUserSub(false, "vmchartkick","setbytes", __ref);}
 BA.debugLineNum = 358;BA.debugLine="Sub SetBytes As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 359;BA.debugLine="SetAttrSingle(\":bytes\", \"true\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":bytes")),(Object)((RemoteObject.createImmutable("true"))));
 BA.debugLineNum = 360;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 361;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolors(RemoteObject __ref,RemoteObject _lcolors) throws Exception{
try {
		Debug.PushSubsStack("SetColors (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,286);
if (RapidSub.canDelegate("setcolors")) { return __ref.runUserSub(false, "vmchartkick","setcolors", __ref, _lcolors);}
Debug.locals.put("lcolors", _lcolors);
 BA.debugLineNum = 286;BA.debugLine="private Sub SetColors(lcolors As String) As VMChar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 287;BA.debugLine="SetAttrSingle(\":colors\", lcolors)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":colors")),(Object)((_lcolors)));
 BA.debugLineNum = 288;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolumnchart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetColumnChart (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,420);
if (RapidSub.canDelegate("setcolumnchart")) { return __ref.runUserSub(false, "vmchartkick","setcolumnchart", __ref);}
 BA.debugLineNum = 420;BA.debugLine="Sub SetColumnChart As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 421;BA.debugLine="ChartKick.SetTag(\"column-chart\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("column-chart")));
 BA.debugLineNum = 422;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 423;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcurve(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetCurve (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("setcurve")) { return __ref.runUserSub(false, "vmchartkick","setcurve", __ref);}
 BA.debugLineNum = 301;BA.debugLine="Sub SetCurve As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="SetAttrSingle(\":curve\", \"true\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":curve")),(Object)((RemoteObject.createImmutable("true"))));
 BA.debugLineNum = 303;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 304;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdata(RemoteObject __ref,RemoteObject _chartdata) throws Exception{
try {
		Debug.PushSubsStack("SetData (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("setdata")) { return __ref.runUserSub(false, "vmchartkick","setdata", __ref, _chartdata);}
Debug.locals.put("chartData", _chartdata);
 BA.debugLineNum = 256;BA.debugLine="private Sub SetData(chartData As String) As VMChar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="SetAttrSingle(\":data\", chartData)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":data")),(Object)((_chartdata)));
 BA.debugLineNum = 258;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 259;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdecimal(RemoteObject __ref,RemoteObject _sdecimal) throws Exception{
try {
		Debug.PushSubsStack("SetDecimal (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,338);
if (RapidSub.canDelegate("setdecimal")) { return __ref.runUserSub(false, "vmchartkick","setdecimal", __ref, _sdecimal);}
Debug.locals.put("sdecimal", _sdecimal);
 BA.debugLineNum = 338;BA.debugLine="Sub SetDecimal(sdecimal As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 339;BA.debugLine="SetAttrSingle(\"decimal\", sdecimal)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("decimal")),(Object)((_sdecimal)));
 BA.debugLineNum = 340;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdescrete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDescrete (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("setdescrete")) { return __ref.runUserSub(false, "vmchartkick","setdescrete", __ref);}
 BA.debugLineNum = 296;BA.debugLine="Sub SetDescrete As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 297;BA.debugLine="SetAttrSingle(\":discrete\", \"true\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":discrete")),(Object)((RemoteObject.createImmutable("true"))));
 BA.debugLineNum = 298;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 299;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,440);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmchartkick","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 440;BA.debugLine="Sub SetDisabled(b As Boolean) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 441;BA.debugLine="ChartKick.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 442;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 443;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdonut(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDonut (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,321);
if (RapidSub.canDelegate("setdonut")) { return __ref.runUserSub(false, "vmchartkick","setdonut", __ref);}
 BA.debugLineNum = 321;BA.debugLine="Sub SetDonut As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 322;BA.debugLine="SetAttrSingle(\":donut\",\"true\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":donut")),(Object)((RemoteObject.createImmutable("true"))));
 BA.debugLineNum = 323;BA.debugLine="xAxes.display = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).setField ("display" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"False"));
 BA.debugLineNum = 324;BA.debugLine="yAxes.display = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).setField ("display" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"False"));
 BA.debugLineNum = 325;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 326;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdownload(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDownload (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,368);
if (RapidSub.canDelegate("setdownload")) { return __ref.runUserSub(false, "vmchartkick","setdownload", __ref);}
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _objjson = RemoteObject.createImmutable("");
 BA.debugLineNum = 368;BA.debugLine="Sub SetDownload As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 369;BA.debugLine="Dim obj As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_obj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_obj = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("obj", _obj);Debug.locals.put("obj", _obj);
 BA.debugLineNum = 370;BA.debugLine="obj.Put(\"background\", \"#fff\")";
Debug.JustUpdateDeviceLine();
_obj.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("background"))),(Object)((RemoteObject.createImmutable("#fff"))));
 BA.debugLineNum = 371;BA.debugLine="Dim objJSON As String = BANano.ToJson(obj)";
Debug.JustUpdateDeviceLine();
_objjson = BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((_obj.getObject()))));Debug.locals.put("objJSON", _objjson);Debug.locals.put("objJSON", _objjson);
 BA.debugLineNum = 372;BA.debugLine="objJSON = objJSON.Replace(QUOTE,\"'\")";
Debug.JustUpdateDeviceLine();
_objjson = _objjson.runMethod(true,"replace",(Object)(vmchartkick.__c.getField(true,"QUOTE")),(Object)(RemoteObject.createImmutable("'")));Debug.locals.put("objJSON", _objjson);
 BA.debugLineNum = 373;BA.debugLine="SetAttrSingle(\":download\", objJSON)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":download")),(Object)((_objjson)));
 BA.debugLineNum = 374;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 375;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetHeight (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vmchartkick","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 387;BA.debugLine="Sub SetHeight(h As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 388;BA.debugLine="SetAttrSingle(\"height\", vue.MakePx(h))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("height")),(Object)((__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makepx" /*RemoteObject*/ ,(Object)(_h)))));
 BA.debugLineNum = 389;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _serieslabel) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,281);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmchartkick","setlabel", __ref, _serieslabel);}
Debug.locals.put("seriesLabel", _serieslabel);
 BA.debugLineNum = 281;BA.debugLine="Sub SetLabel(seriesLabel As Int) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 282;BA.debugLine="SetAttrSingle(\"label\", seriesLabel)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("label")),(Object)((_serieslabel)));
 BA.debugLineNum = 283;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlegendpositionbottom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetLegendPositionBottom (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,306);
if (RapidSub.canDelegate("setlegendpositionbottom")) { return __ref.runUserSub(false, "vmchartkick","setlegendpositionbottom", __ref);}
 BA.debugLineNum = 306;BA.debugLine="Sub SetLegendPositionBottom As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 307;BA.debugLine="SetAttrSingle(\"legend\", \"bottom\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("legend")),(Object)((RemoteObject.createImmutable("bottom"))));
 BA.debugLineNum = 308;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlegendpositionright(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetLegendPositionRight (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,316);
if (RapidSub.canDelegate("setlegendpositionright")) { return __ref.runUserSub(false, "vmchartkick","setlegendpositionright", __ref);}
 BA.debugLineNum = 316;BA.debugLine="Sub SetLegendPositionRight As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 317;BA.debugLine="SetAttrSingle(\"legend\", \"right\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("legend")),(Object)((RemoteObject.createImmutable("right"))));
 BA.debugLineNum = 318;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 319;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlegendpositiontop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetLegendPositionTop (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("setlegendpositiontop")) { return __ref.runUserSub(false, "vmchartkick","setlegendpositiontop", __ref);}
 BA.debugLineNum = 311;BA.debugLine="Sub SetLegendPositionTop As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 312;BA.debugLine="SetAttrSingle(\"legend\", \"top\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("legend")),(Object)((RemoteObject.createImmutable("top"))));
 BA.debugLineNum = 313;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 314;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlinechart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetLineChart (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("setlinechart")) { return __ref.runUserSub(false, "vmchartkick","setlinechart", __ref);}
 BA.debugLineNum = 403;BA.debugLine="Sub SetLineChart As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 404;BA.debugLine="ChartKick.SetTag(\"line-chart\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("line-chart")));
 BA.debugLineNum = 405;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 406;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmax(RemoteObject __ref,RemoteObject _maxvalue) throws Exception{
try {
		Debug.PushSubsStack("SetMax (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("setmax")) { return __ref.runUserSub(false, "vmchartkick","setmax", __ref, _maxvalue);}
Debug.locals.put("maxvalue", _maxvalue);
 BA.debugLineNum = 261;BA.debugLine="Sub SetMax(maxvalue As Int) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 262;BA.debugLine="SetAttrSingle(\":max\", maxvalue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":max")),(Object)((_maxvalue)));
 BA.debugLineNum = 263;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 264;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmin(RemoteObject __ref,RemoteObject _minvalue) throws Exception{
try {
		Debug.PushSubsStack("SetMin (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("setmin")) { return __ref.runUserSub(false, "vmchartkick","setmin", __ref, _minvalue);}
Debug.locals.put("minvalue", _minvalue);
 BA.debugLineNum = 266;BA.debugLine="Sub SetMin(minvalue As Int) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="SetAttrSingle(\":min\", minvalue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":min")),(Object)((_minvalue)));
 BA.debugLineNum = 268;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpiechart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetPieChart (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("setpiechart")) { return __ref.runUserSub(false, "vmchartkick","setpiechart", __ref);}
 BA.debugLineNum = 408;BA.debugLine="Sub SetPieChart As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 409;BA.debugLine="ChartKick.settag(\"pie-chart\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("pie-chart")));
 BA.debugLineNum = 410;BA.debugLine="xAxes.display = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_xaxes" /*RemoteObject*/ ).setField ("display" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"False"));
 BA.debugLineNum = 411;BA.debugLine="yAxes.display = False";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_yaxes" /*RemoteObject*/ ).setField ("display" /*RemoteObject*/ ,vmchartkick.__c.getField(true,"False"));
 BA.debugLineNum = 412;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 413;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprecision(RemoteObject __ref,RemoteObject _sprecision) throws Exception{
try {
		Debug.PushSubsStack("SetPrecision (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("setprecision")) { return __ref.runUserSub(false, "vmchartkick","setprecision", __ref, _sprecision);}
Debug.locals.put("sprecision", _sprecision);
 BA.debugLineNum = 343;BA.debugLine="Sub SetPrecision(sprecision As String) As VMChartK";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 344;BA.debugLine="SetAttrSingle(\":precision\", sprecision)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":precision")),(Object)((_sprecision)));
 BA.debugLineNum = 345;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 346;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprefix(RemoteObject __ref,RemoteObject _prefix) throws Exception{
try {
		Debug.PushSubsStack("SetPrefix (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("setprefix")) { return __ref.runUserSub(false, "vmchartkick","setprefix", __ref, _prefix);}
Debug.locals.put("prefix", _prefix);
 BA.debugLineNum = 328;BA.debugLine="Sub SetPrefix(prefix As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="SetAttrSingle(\"prefix\", prefix)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("prefix")),(Object)((_prefix)));
 BA.debugLineNum = 330;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 331;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrefresh(RemoteObject __ref,RemoteObject _refresh) throws Exception{
try {
		Debug.PushSubsStack("SetRefresh (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,363);
if (RapidSub.canDelegate("setrefresh")) { return __ref.runUserSub(false, "vmchartkick","setrefresh", __ref, _refresh);}
Debug.locals.put("refresh", _refresh);
 BA.debugLineNum = 363;BA.debugLine="Sub SetRefresh(refresh As Int) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 364;BA.debugLine="SetAttrSingle(\":refresh\", refresh)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":refresh")),(Object)((_refresh)));
 BA.debugLineNum = 365;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 366;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setround(RemoteObject __ref,RemoteObject _sround) throws Exception{
try {
		Debug.PushSubsStack("SetRound (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,348);
if (RapidSub.canDelegate("setround")) { return __ref.runUserSub(false, "vmchartkick","setround", __ref, _sround);}
Debug.locals.put("sround", _sround);
 BA.debugLineNum = 348;BA.debugLine="Sub SetRound(sround As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 349;BA.debugLine="SetAttrSingle(\":round\",sround)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":round")),(Object)((_sround)));
 BA.debugLineNum = 350;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 351;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscatterchart(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetScatterChart (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,430);
if (RapidSub.canDelegate("setscatterchart")) { return __ref.runUserSub(false, "vmchartkick","setscatterchart", __ref);}
 BA.debugLineNum = 430;BA.debugLine="Sub SetScatterChart As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 431;BA.debugLine="ChartKick.SetTag(\"scatter-chart\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("scatter-chart")));
 BA.debugLineNum = 432;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 433;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstacked(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetStacked (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("setstacked")) { return __ref.runUserSub(false, "vmchartkick","setstacked", __ref);}
 BA.debugLineNum = 291;BA.debugLine="Sub SetStacked As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 292;BA.debugLine="SetAttrSingle(\"stacked\", \"true\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("stacked")),(Object)((RemoteObject.createImmutable("true"))));
 BA.debugLineNum = 293;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 294;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmchartkick","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 244;BA.debugLine="Sub SetStyle(sm As Map) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="ChartKick.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 246;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 247;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylesingle(RemoteObject __ref,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetStyleSingle (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,249);
if (RapidSub.canDelegate("setstylesingle")) { return __ref.runUserSub(false, "vmchartkick","setstylesingle", __ref, _prop, _val);}
RemoteObject _stylex = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 249;BA.debugLine="Sub SetStyleSingle(prop As String, val As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 250;BA.debugLine="Dim stylex As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_stylex = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_stylex = vmchartkick.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("stylex", _stylex);Debug.locals.put("stylex", _stylex);
 BA.debugLineNum = 251;BA.debugLine="stylex.Put(prop, val)";
Debug.JustUpdateDeviceLine();
_stylex.runVoidMethod ("Put",(Object)((_prop)),(Object)((_val)));
 BA.debugLineNum = 252;BA.debugLine="SetStyle(stylex)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setstyle" /*RemoteObject*/ ,(Object)(_stylex));
 BA.debugLineNum = 253;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsuffix(RemoteObject __ref,RemoteObject _suffix) throws Exception{
try {
		Debug.PushSubsStack("SetSuffix (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,377);
if (RapidSub.canDelegate("setsuffix")) { return __ref.runUserSub(false, "vmchartkick","setsuffix", __ref, _suffix);}
Debug.locals.put("suffix", _suffix);
 BA.debugLineNum = 377;BA.debugLine="Sub SetSuffix(suffix As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 378;BA.debugLine="SetAttrSingle(\"suffix\", suffix)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("suffix")),(Object)((_suffix)));
 BA.debugLineNum = 379;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 380;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setthousands(RemoteObject __ref,RemoteObject _sthousands) throws Exception{
try {
		Debug.PushSubsStack("SetThousands (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,333);
if (RapidSub.canDelegate("setthousands")) { return __ref.runUserSub(false, "vmchartkick","setthousands", __ref, _sthousands);}
Debug.locals.put("sthousands", _sthousands);
 BA.debugLineNum = 333;BA.debugLine="Sub SetThousands(sthousands As String) As VMChartK";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 334;BA.debugLine="SetAttrSingle(\"thousands\", sthousands)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("thousands")),(Object)((_sthousands)));
 BA.debugLineNum = 335;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 336;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmchartkick","settitle", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 95;BA.debugLine="Sub SetTitle(txt As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Title.text = txt";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_title" /*RemoteObject*/ ).setField ("text" /*RemoteObject*/ ,_txt);
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vshow) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmchartkick","setvshow", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 435;BA.debugLine="Sub SetVShow(vshow As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 436;BA.debugLine="ChartKick.SetVShow(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vshow));
 BA.debugLineNum = 437;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 438;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetWidth (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmchartkick","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 382;BA.debugLine="Sub SetWidth(w As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 383;BA.debugLine="SetAttrSingle(\"width\", vue.makepx(w))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("width")),(Object)((__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makepx" /*RemoteObject*/ ,(Object)(_w)))));
 BA.debugLineNum = 384;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 385;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setxmax(RemoteObject __ref,RemoteObject _maxvalue) throws Exception{
try {
		Debug.PushSubsStack("SetXMax (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("setxmax")) { return __ref.runUserSub(false, "vmchartkick","setxmax", __ref, _maxvalue);}
Debug.locals.put("maxvalue", _maxvalue);
 BA.debugLineNum = 271;BA.debugLine="Sub SetXMax(maxvalue As Int) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 272;BA.debugLine="SetAttrSingle(\"xmax\", maxvalue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("xmax")),(Object)((_maxvalue)));
 BA.debugLineNum = 273;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setxmin(RemoteObject __ref,RemoteObject _minvalue) throws Exception{
try {
		Debug.PushSubsStack("SetXMin (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("setxmin")) { return __ref.runUserSub(false, "vmchartkick","setxmin", __ref, _minvalue);}
Debug.locals.put("minvalue", _minvalue);
 BA.debugLineNum = 276;BA.debugLine="Sub SetXMin(minvalue As Int) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 277;BA.debugLine="SetAttrSingle(\"xmin\", minvalue)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("xmin")),(Object)((_minvalue)));
 BA.debugLineNum = 278;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 279;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setxtitle(RemoteObject __ref,RemoteObject _xtitle) throws Exception{
try {
		Debug.PushSubsStack("SetXTitle (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,392);
if (RapidSub.canDelegate("setxtitle")) { return __ref.runUserSub(false, "vmchartkick","setxtitle", __ref, _xtitle);}
Debug.locals.put("xtitle", _xtitle);
 BA.debugLineNum = 392;BA.debugLine="Sub SetXTitle(xtitle As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 393;BA.debugLine="SetAttrSingle(\"xtitle\", xtitle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("xtitle")),(Object)((_xtitle)));
 BA.debugLineNum = 394;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 395;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setytitle(RemoteObject __ref,RemoteObject _ytitle) throws Exception{
try {
		Debug.PushSubsStack("SetYTitle (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,397);
if (RapidSub.canDelegate("setytitle")) { return __ref.runUserSub(false, "vmchartkick","setytitle", __ref, _ytitle);}
Debug.locals.put("ytitle", _ytitle);
 BA.debugLineNum = 397;BA.debugLine="Sub SetYTitle(ytitle As String) As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 398;BA.debugLine="SetAttrSingle(\"ytitle\", ytitle)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("ytitle")),(Object)((_ytitle)));
 BA.debugLineNum = 399;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setzeros(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetZeros (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,353);
if (RapidSub.canDelegate("setzeros")) { return __ref.runUserSub(false, "vmchartkick","setzeros", __ref);}
 BA.debugLineNum = 353;BA.debugLine="Sub SetZeros As VMChartKick";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 354;BA.debugLine="SetAttrSingle(\":zeros\", \"true\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setattrsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":zeros")),(Object)((RemoteObject.createImmutable("true"))));
 BA.debugLineNum = 355;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 356;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmchartkick) ","vmchartkick",40,__ref.getField(false, "ba"),__ref,464);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmchartkick","tostring", __ref);}
RemoteObject _plotjson = RemoteObject.createImmutable("");
RemoteObject _serieslist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _serieskey = RemoteObject.createImmutable("");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _obj = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _plotlist = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _colorjson = RemoteObject.createImmutable("");
 BA.debugLineNum = 464;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 465;BA.debugLine="BuildOptions";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_buildoptions" /*RemoteObject*/ );
 BA.debugLineNum = 466;BA.debugLine="Dim plotJSON As String = \"\"";
Debug.JustUpdateDeviceLine();
_plotjson = BA.ObjectToString("");Debug.locals.put("plotJSON", _plotjson);Debug.locals.put("plotJSON", _plotjson);
 BA.debugLineNum = 467;BA.debugLine="If series.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_series" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 468;BA.debugLine="Dim seriesList As List";
Debug.JustUpdateDeviceLine();
_serieslist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("seriesList", _serieslist);
 BA.debugLineNum = 469;BA.debugLine="seriesList.Initialize";
Debug.JustUpdateDeviceLine();
_serieslist.runVoidMethod ("Initialize");
 BA.debugLineNum = 470;BA.debugLine="Dim seriesKey As String = $\"${ID}data\"$";
Debug.JustUpdateDeviceLine();
_serieskey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmchartkick.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("data")));Debug.locals.put("seriesKey", _serieskey);Debug.locals.put("seriesKey", _serieskey);
 BA.debugLineNum = 471;BA.debugLine="For Each k As String In series.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group7 = __ref.getField(false,"_series" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen7 = group7.runMethod(true,"getSize").<Integer>get()
;int index7 = 0;
;
for (; index7 < groupLen7;index7++){
_k = BA.ObjectToString(group7.runMethod(false,"Get",index7));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 472;BA.debugLine="Dim obj As Map = series.Get(k)";
Debug.JustUpdateDeviceLine();
_obj = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_obj.setObject(__ref.getField(false,"_series" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k))));Debug.locals.put("obj", _obj);
 BA.debugLineNum = 473;BA.debugLine="seriesList.Add(obj)";
Debug.JustUpdateDeviceLine();
_serieslist.runVoidMethod ("Add",(Object)((_obj.getObject())));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 475;BA.debugLine="vue.SetStateSingle(seriesKey, seriesList)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_serieskey),(Object)((_serieslist.getObject())));
 BA.debugLineNum = 476;BA.debugLine="SetData(seriesKey)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setdata" /*RemoteObject*/ ,(Object)(_serieskey));
 }else {
 BA.debugLineNum = 478;BA.debugLine="Dim plotList As List = data.Get(\"a\")";
Debug.JustUpdateDeviceLine();
_plotlist = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_plotlist.setObject(__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((RemoteObject.createImmutable("a")))));Debug.locals.put("plotList", _plotlist);
 BA.debugLineNum = 479;BA.debugLine="plotJSON = BANano.ToJson(plotList)";
Debug.JustUpdateDeviceLine();
_plotjson = BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((_plotlist.getObject()))));Debug.locals.put("plotJSON", _plotjson);
 BA.debugLineNum = 480;BA.debugLine="plotJSON = plotJSON.Replace(QUOTE,\"'\")";
Debug.JustUpdateDeviceLine();
_plotjson = _plotjson.runMethod(true,"replace",(Object)(vmchartkick.__c.getField(true,"QUOTE")),(Object)(RemoteObject.createImmutable("'")));Debug.locals.put("plotJSON", _plotjson);
 BA.debugLineNum = 481;BA.debugLine="SetData(plotJSON)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setdata" /*RemoteObject*/ ,(Object)(_plotjson));
 };
 BA.debugLineNum = 483;BA.debugLine="If colors.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_colors" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 484;BA.debugLine="Dim colorJSON As String = BANano.ToJson(colors)";
Debug.JustUpdateDeviceLine();
_colorjson = BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((__ref.getField(false,"_colors" /*RemoteObject*/ ).getObject()))));Debug.locals.put("colorJSON", _colorjson);Debug.locals.put("colorJSON", _colorjson);
 BA.debugLineNum = 485;BA.debugLine="colorJSON = colorJSON.Replace(QUOTE,\"'\")";
Debug.JustUpdateDeviceLine();
_colorjson = _colorjson.runMethod(true,"replace",(Object)(vmchartkick.__c.getField(true,"QUOTE")),(Object)(RemoteObject.createImmutable("'")));Debug.locals.put("colorJSON", _colorjson);
 BA.debugLineNum = 486;BA.debugLine="SetColors(colorJSON)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchartkick.class, "_setcolors" /*RemoteObject*/ ,(Object)(_colorjson));
 };
 BA.debugLineNum = 488;BA.debugLine="Return ChartKick.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_chartkick" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 489;BA.debugLine="End Sub";
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