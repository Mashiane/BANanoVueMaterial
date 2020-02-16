package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmprogresscircle_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmprogresscircle","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 69;BA.debugLine="Sub AddClass(c As String) As VMProgressCircle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="ProgressCircle.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 71;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 72;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public ProgressCircle As VMElement";
vmprogresscircle._progresscircle = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_progresscircle",vmprogresscircle._progresscircle);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmprogresscircle._id = RemoteObject.createImmutable("");__ref.setField("_id",vmprogresscircle._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmprogresscircle._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmprogresscircle._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmprogresscircle._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmprogresscircle._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private JQ As BANanoObject";
vmprogresscircle._jq = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_jq",vmprogresscircle._jq);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _width,RemoteObject _height) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmprogresscircle","initialize", __ref, _ba, _v, _sid, _width, _height);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("Width", _width);
Debug.locals.put("Height", _height);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="BANano.DependsOnAsset(\"progresscircle.css\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("progresscircle.css")));
 BA.debugLineNum = 12;BA.debugLine="BANano.DependsOnAsset(\"progresscircle.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("progresscircle.js")));
 BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="JQ = vue.jquery";
Debug.JustUpdateDeviceLine();
__ref.setField ("_jq" /*RemoteObject*/ ,__ref.getField(false,"_vue" /*RemoteObject*/ ).getField(false,"_jquery" /*RemoteObject*/ ));
 BA.debugLineNum = 17;BA.debugLine="ProgressCircle.Initialize(vue, ID).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 18;BA.debugLine="ProgressCircle.AddClass(ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 19;BA.debugLine="Width = ProgressCircle.MakePx(Width)";
Debug.JustUpdateDeviceLine();
_width = __ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_makepx" /*RemoteObject*/ ,(Object)(_width));Debug.locals.put("Width", _width);
 BA.debugLineNum = 20;BA.debugLine="Height = ProgressCircle.MakePx(Height)";
Debug.JustUpdateDeviceLine();
_height = __ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_makepx" /*RemoteObject*/ ,(Object)(_height));Debug.locals.put("Height", _height);
 BA.debugLineNum = 21;BA.debugLine="ProgressCircle.SetWidth(Width).SetHeight(Height)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setwidth" /*RemoteObject*/ ,(Object)(_width)).runClassMethod (b4j.example.vmelement.class, "_setheight" /*RemoteObject*/ ,(Object)(_height));
 BA.debugLineNum = 22;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmprogresscircle","pop", __ref, _px);}
Debug.locals.put("px", _px);
 BA.debugLineNum = 89;BA.debugLine="Sub Pop(px As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="px.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_px.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmprogresscircle.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 91;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Refresh (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("refresh")) { return __ref.runUserSub(false, "vmprogresscircle","refresh", __ref);}
RemoteObject _loadingele = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 104;BA.debugLine="Sub Refresh";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="Dim loadingEle As BANanoObject = JQ.Selector($\"#$";
Debug.JustUpdateDeviceLine();
_loadingele = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_loadingele = __ref.getField(false,"_jq" /*RemoteObject*/ ).runMethod(false,"Selector",(Object)(((RemoteObject.concat(RemoteObject.createImmutable("#"),vmprogresscircle.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))))));Debug.locals.put("loadingEle", _loadingele);Debug.locals.put("loadingEle", _loadingele);
 BA.debugLineNum = 107;BA.debugLine="loadingEle.RunMethod(\"circlechart\", Null)";
Debug.JustUpdateDeviceLine();
_loadingele.runVoidMethod ("RunMethod",(Object)(BA.ObjectToString("circlechart")),(Object)(vmprogresscircle.__c.getField(false,"Null")));
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmprogresscircle","render", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmprogresscircle.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 87;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmprogresscircle","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 75;BA.debugLine="Sub SetAttr(attr As Map) As VMProgressCircle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="ProgressCircle.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmprogresscircle","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 26;BA.debugLine="Sub SetDisabled(b As Boolean) As VMProgressCircle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="ProgressCircle.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 28;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 29;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetID (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmprogresscircle","setid", __ref, _iid, _bind);}
Debug.locals.put("iID", _iid);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 48;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMPro";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="ProgressCircle.SetID(iID,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_iid),(Object)(_bind));
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
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmprogresscircle","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 58;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMProg";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="ProgressCircle.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
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
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _lbl) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmprogresscircle","setlabel", __ref, _lbl);}
Debug.locals.put("lbl", _lbl);
 BA.debugLineNum = 98;BA.debugLine="Sub SetLabel(lbl As String) As VMProgressCircle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="ProgressCircle.SetText(lbl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_lbl));
 BA.debugLineNum = 100;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetName (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmprogresscircle","setname", __ref, _nam, _bind);}
Debug.locals.put("nam", _nam);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 53;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMP";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="ProgressCircle.SetName(nam, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_nam),(Object)(_bind));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmprogresscircle","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 38;BA.debugLine="Sub SetStyle(sm As Map) As VMProgressCircle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="ProgressCircle.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 40;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 41;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmprogresscircle","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 31;BA.debugLine="Sub SetTabIndex(ti As String) As VMProgressCircle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="If ti = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ti,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 33;BA.debugLine="ProgressCircle.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
 BA.debugLineNum = 34;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 35;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _vl) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmprogresscircle","setvalue", __ref, _vl);}
Debug.locals.put("vl", _vl);
 BA.debugLineNum = 93;BA.debugLine="Sub SetValue(vl As Int) As VMProgressCircle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="ProgressCircle.SetAttr(CreateMap(\"data-percentage";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmprogresscircle.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-percentage")),(_vl)}))));
 BA.debugLineNum = 95;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 96;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmprogresscircle","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 43;BA.debugLine="Sub SetVIf(vif As String) As VMProgressCircle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="ProgressCircle.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 45;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmprogresscircle","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 63;BA.debugLine="Sub SetVShow(vif As String) As VMProgressCircle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="ProgressCircle.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 65;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 66;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmprogresscircle) ","vmprogresscircle",81,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmprogresscircle","tostring", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="Return ProgressCircle.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_progresscircle" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="End Sub";
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