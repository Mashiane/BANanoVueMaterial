package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmwaterball_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmwaterball","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 96;BA.debugLine="Sub AddClass(c As String) As VMWaterBall";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="WaterBall.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 98;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public WaterBall As VMElement";
vmwaterball._waterball = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_waterball",vmwaterball._waterball);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmwaterball._id = RemoteObject.createImmutable("");__ref.setField("_id",vmwaterball._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmwaterball._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmwaterball._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmwaterball._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmwaterball._banano);
 //BA.debugLineNum = 7;BA.debugLine="Public isLoading As Boolean";
vmwaterball._isloading = RemoteObject.createImmutable(false);__ref.setField("_isloading",vmwaterball._isloading);
 //BA.debugLineNum = 8;BA.debugLine="Private vnowRange As Int ' the value now";
vmwaterball._vnowrange = RemoteObject.createImmutable(0);__ref.setField("_vnowrange",vmwaterball._vnowrange);
 //BA.debugLineNum = 9;BA.debugLine="Private vtargetRange As Int ' the target value to";
vmwaterball._vtargetrange = RemoteObject.createImmutable(0);__ref.setField("_vtargetrange",vmwaterball._vtargetrange);
 //BA.debugLineNum = 10;BA.debugLine="Private range1 As Int";
vmwaterball._range1 = RemoteObject.createImmutable(0);__ref.setField("_range1",vmwaterball._range1);
 //BA.debugLineNum = 11;BA.debugLine="Private range2 As Int";
vmwaterball._range2 = RemoteObject.createImmutable(0);__ref.setField("_range2",vmwaterball._range2);
 //BA.debugLineNum = 12;BA.debugLine="Private range3 As Int";
vmwaterball._range3 = RemoteObject.createImmutable(0);__ref.setField("_range3",vmwaterball._range3);
 //BA.debugLineNum = 13;BA.debugLine="Private wWidth As Double";
vmwaterball._wwidth = RemoteObject.createImmutable(0);__ref.setField("_wwidth",vmwaterball._wwidth);
 //BA.debugLineNum = 14;BA.debugLine="Private wHeight As Int";
vmwaterball._wheight = RemoteObject.createImmutable(0);__ref.setField("_wheight",vmwaterball._wheight);
 //BA.debugLineNum = 15;BA.debugLine="Private JQ As BANanoObject";
vmwaterball._jq = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_jq",vmwaterball._jq);
 //BA.debugLineNum = 16;BA.debugLine="Private module As Object";
vmwaterball._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmwaterball._module);
 //BA.debugLineNum = 17;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmwaterball","initialize", __ref, _ba, _v, _sid, _eventhandler, _width, _height);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 32;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="BANano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("jquery-3.4.1.min.js")));
 BA.debugLineNum = 34;BA.debugLine="BANano.DependsOnAsset(\"createWaterBall-jquery.js\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("createWaterBall-jquery.js")));
 BA.debugLineNum = 35;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 36;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 37;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 38;BA.debugLine="JQ = vue.jquery";
Debug.JustUpdateDeviceLine();
__ref.setField ("_jq" /*RemoteObject*/ ,__ref.getField(false,"_vue" /*RemoteObject*/ ).getField(false,"_jquery" /*RemoteObject*/ ));
 BA.debugLineNum = 39;BA.debugLine="WaterBall.Initialize(vue, ID).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 40;BA.debugLine="range1 = 50";
Debug.JustUpdateDeviceLine();
__ref.setField ("_range1" /*RemoteObject*/ ,BA.numberCast(int.class, 50));
 BA.debugLineNum = 41;BA.debugLine="range2 = 80";
Debug.JustUpdateDeviceLine();
__ref.setField ("_range2" /*RemoteObject*/ ,BA.numberCast(int.class, 80));
 BA.debugLineNum = 42;BA.debugLine="range3 = 100";
Debug.JustUpdateDeviceLine();
__ref.setField ("_range3" /*RemoteObject*/ ,BA.numberCast(int.class, 100));
 BA.debugLineNum = 43;BA.debugLine="wWidth = 0.02";
Debug.JustUpdateDeviceLine();
__ref.setField ("_wwidth" /*RemoteObject*/ ,BA.numberCast(double.class, 0.02));
 BA.debugLineNum = 44;BA.debugLine="wHeight = 5";
Debug.JustUpdateDeviceLine();
__ref.setField ("_wheight" /*RemoteObject*/ ,BA.numberCast(int.class, 5));
 BA.debugLineNum = 45;BA.debugLine="WaterBall.AddClass(ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="Width = WaterBall.MakePx(Width)";
Debug.JustUpdateDeviceLine();
_width = __ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_makepx" /*RemoteObject*/ ,(Object)(_width));Debug.locals.put("Width", _width);
 BA.debugLineNum = 47;BA.debugLine="Height = WaterBall.MakePx(Height)";
Debug.JustUpdateDeviceLine();
_height = __ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_makepx" /*RemoteObject*/ ,(Object)(_height));Debug.locals.put("Height", _height);
 BA.debugLineNum = 48;BA.debugLine="WaterBall.SetWidth(Width).SetHeight(Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setwidth" /*RemoteObject*/ ,(Object)(_width)).runClassMethod (b4j.example.vmelement.class, "_setheight" /*RemoteObject*/ ,(Object)(_height));
 BA.debugLineNum = 49;BA.debugLine="isLoading = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_isloading" /*RemoteObject*/ ,vmwaterball.__c.getField(true,"False"));
 BA.debugLineNum = 50;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmwaterball","pop", __ref, _px);}
Debug.locals.put("px", _px);
 BA.debugLineNum = 116;BA.debugLine="Sub Pop(px As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="px.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_px.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmwaterball.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 118;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Refresh (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "vmwaterball","refresh", __ref);}
RemoteObject _options = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _loadingele = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _loading_width = RemoteObject.createImmutable(0);
RemoteObject _loading_height = RemoteObject.createImmutable(0);
RemoteObject _data_range = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _cvs_config = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _wave_config = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 121;BA.debugLine="Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 123;BA.debugLine="Dim options As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_options = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_options = vmwaterball.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("options", _options);Debug.locals.put("options", _options);
 BA.debugLineNum = 124;BA.debugLine="Dim loadingEle As BANanoObject = JQ.Selector($\"#$";
Debug.JustUpdateDeviceLine();
_loadingele = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_loadingele = __ref.getField(false,"_jq" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)(((RemoteObject.concat(RemoteObject.createImmutable("#"),vmwaterball.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))))));Debug.locals.put("loadingEle", _loadingele);Debug.locals.put("loadingEle", _loadingele);
 BA.debugLineNum = 125;BA.debugLine="Dim loading_width As Int = loadingEle.RunMethod(\"";
Debug.JustUpdateDeviceLine();
_loading_width = BA.numberCast(int.class, _loadingele.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("width")),(Object)(vmwaterball.__c.getField(false,"Null"))).runMethod(false,"Result"));Debug.locals.put("loading_width", _loading_width);Debug.locals.put("loading_width", _loading_width);
 BA.debugLineNum = 126;BA.debugLine="Dim loading_height As Int = loadingEle.RunMethod(";
Debug.JustUpdateDeviceLine();
_loading_height = BA.numberCast(int.class, _loadingele.runMethod(false,"RunMethod",(Object)(BA.ObjectToString("height")),(Object)(vmwaterball.__c.getField(false,"Null"))).runMethod(false,"Result"));Debug.locals.put("loading_height", _loading_height);Debug.locals.put("loading_height", _loading_height);
 BA.debugLineNum = 127;BA.debugLine="Dim data_range As List";
Debug.JustUpdateDeviceLine();
_data_range = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("data_range", _data_range);
 BA.debugLineNum = 128;BA.debugLine="data_range.Initialize";
Debug.JustUpdateDeviceLine();
_data_range.runVoidMethod ("Initialize");
 BA.debugLineNum = 129;BA.debugLine="data_range.Add(range1)";
Debug.JustUpdateDeviceLine();
_data_range.runVoidMethod ("Add",(Object)((__ref.getField(true,"_range1" /*RemoteObject*/ ))));
 BA.debugLineNum = 130;BA.debugLine="data_range.Add(range2)";
Debug.JustUpdateDeviceLine();
_data_range.runVoidMethod ("Add",(Object)((__ref.getField(true,"_range2" /*RemoteObject*/ ))));
 BA.debugLineNum = 131;BA.debugLine="data_range.Add(range3)";
Debug.JustUpdateDeviceLine();
_data_range.runVoidMethod ("Add",(Object)((__ref.getField(true,"_range3" /*RemoteObject*/ ))));
 BA.debugLineNum = 133;BA.debugLine="Dim cvs_config As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_cvs_config = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_cvs_config = vmwaterball.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("cvs_config", _cvs_config);Debug.locals.put("cvs_config", _cvs_config);
 BA.debugLineNum = 134;BA.debugLine="cvs_config.Put(\"width\", loading_width)";
Debug.JustUpdateDeviceLine();
_cvs_config.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("width"))),(Object)((_loading_width)));
 BA.debugLineNum = 135;BA.debugLine="cvs_config.Put(\"height\", loading_height)";
Debug.JustUpdateDeviceLine();
_cvs_config.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("height"))),(Object)((_loading_height)));
 BA.debugLineNum = 137;BA.debugLine="Dim wave_config As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_wave_config = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_wave_config = vmwaterball.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("wave_config", _wave_config);Debug.locals.put("wave_config", _wave_config);
 BA.debugLineNum = 138;BA.debugLine="wave_config.Put(\"waveWidth\", wWidth)";
Debug.JustUpdateDeviceLine();
_wave_config.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("waveWidth"))),(Object)((__ref.getField(true,"_wwidth" /*RemoteObject*/ ))));
 BA.debugLineNum = 139;BA.debugLine="wave_config.Put(\"waveHeight\", wHeight)";
Debug.JustUpdateDeviceLine();
_wave_config.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("waveHeight"))),(Object)((__ref.getField(true,"_wheight" /*RemoteObject*/ ))));
 BA.debugLineNum = 141;BA.debugLine="options.Put(\"cvs_config\", cvs_config)";
Debug.JustUpdateDeviceLine();
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("cvs_config"))),(Object)((_cvs_config.getObject())));
 BA.debugLineNum = 142;BA.debugLine="options.Put(\"wave_config\", wave_config)";
Debug.JustUpdateDeviceLine();
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("wave_config"))),(Object)((_wave_config.getObject())));
 BA.debugLineNum = 143;BA.debugLine="options.Put(\"data_range\", data_range)";
Debug.JustUpdateDeviceLine();
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data_range"))),(Object)((_data_range.getObject())));
 BA.debugLineNum = 144;BA.debugLine="options.Put(\"isLoading\", isLoading)";
Debug.JustUpdateDeviceLine();
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("isLoading"))),(Object)((__ref.getField(true,"_isloading" /*RemoteObject*/ ))));
 BA.debugLineNum = 145;BA.debugLine="options.Put(\"nowRange\", vnowRange)";
Debug.JustUpdateDeviceLine();
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("nowRange"))),(Object)((__ref.getField(true,"_vnowrange" /*RemoteObject*/ ))));
 BA.debugLineNum = 146;BA.debugLine="options.Put(\"targetRange\", vtargetRange)";
Debug.JustUpdateDeviceLine();
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("targetRange"))),(Object)((__ref.getField(true,"_vtargetrange" /*RemoteObject*/ ))));
 BA.debugLineNum = 147;BA.debugLine="options.Put(\"lineWidth\", 2)";
Debug.JustUpdateDeviceLine();
_options.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("lineWidth"))),(Object)(RemoteObject.createImmutable((2))));
 BA.debugLineNum = 149;BA.debugLine="loadingEle.RunMethod(\"createWaterBall\", options)";
Debug.JustUpdateDeviceLine();
_loadingele.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("createWaterBall")),(Object)((_options.getObject())));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmwaterball","render", __ref);}
 BA.debugLineNum = 112;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmwaterball.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmwaterball","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 102;BA.debugLine="Sub SetAttr(attr As Map) As VMWaterBall";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="WaterBall.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 104;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 105;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmwaterball","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 53;BA.debugLine="Sub SetDisabled(b As Boolean) As VMWaterBall";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="WaterBall.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 55;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 56;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetID (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmwaterball","setid", __ref, _iid, _bind);}
Debug.locals.put("iID", _iid);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 75;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMWat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="WaterBall.SetID(iID,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_iid),(Object)(_bind));
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
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmwaterball","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 85;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMWate";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="WaterBall.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _nam,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmwaterball","setname", __ref, _nam, _bind);}
Debug.locals.put("nam", _nam);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 80;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMW";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="WaterBall.SetName(nam, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_nam),(Object)(_bind));
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
public static RemoteObject  _setranges(RemoteObject __ref,RemoteObject _red,RemoteObject _orange,RemoteObject _green) throws Exception{
try {
		Debug.PushSubsStack("SetRanges (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("setranges")) { return __ref.runUserSub(false, "vmwaterball","setranges", __ref, _red, _orange, _green);}
Debug.locals.put("red", _red);
Debug.locals.put("orange", _orange);
Debug.locals.put("green", _green);
 BA.debugLineNum = 20;BA.debugLine="Sub SetRanges(red As Int, orange As Int, green As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="range1 = red";
Debug.JustUpdateDeviceLine();
__ref.setField ("_range1" /*RemoteObject*/ ,_red);
 BA.debugLineNum = 22;BA.debugLine="range2 = orange";
Debug.JustUpdateDeviceLine();
__ref.setField ("_range2" /*RemoteObject*/ ,_orange);
 BA.debugLineNum = 23;BA.debugLine="range3 = green";
Debug.JustUpdateDeviceLine();
__ref.setField ("_range3" /*RemoteObject*/ ,_green);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmwaterball","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 65;BA.debugLine="Sub SetStyle(sm As Map) As VMWaterBall";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="WaterBall.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 67;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmwaterball","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 58;BA.debugLine="Sub SetTabIndex(ti As String) As VMWaterBall";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="If ti = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ti,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 60;BA.debugLine="WaterBall.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
 BA.debugLineNum = 61;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalues(RemoteObject __ref,RemoteObject _nowrange,RemoteObject _targetrange) throws Exception{
try {
		Debug.PushSubsStack("SetValues (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("setvalues")) { return __ref.runUserSub(false, "vmwaterball","setvalues", __ref, _nowrange, _targetrange);}
Debug.locals.put("nowRange", _nowrange);
Debug.locals.put("targetRange", _targetrange);
 BA.debugLineNum = 27;BA.debugLine="Sub SetValues(nowRange As Int, targetRange As Int)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="vnowRange = nowRange";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vnowrange" /*RemoteObject*/ ,_nowrange);
 BA.debugLineNum = 29;BA.debugLine="vtargetRange = targetRange";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vtargetrange" /*RemoteObject*/ ,_targetrange);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmwaterball","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 70;BA.debugLine="Sub SetVIf(vif As String) As VMWaterBall";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="WaterBall.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmwaterball","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 90;BA.debugLine="Sub SetVShow(vif As String) As VMWaterBall";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="WaterBall.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmwaterball) ","vmwaterball",107,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmwaterball","tostring", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Return WaterBall.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_waterball" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 110;BA.debugLine="End Sub";
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