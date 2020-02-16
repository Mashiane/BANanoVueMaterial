package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmprogress_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmprogress","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 120;BA.debugLine="Sub AddClass(c As String) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="Progress.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 122;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 123;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmprogress","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 143;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmprogress.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 145;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Progress As VMElement";
vmprogress._progress = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_progress",vmprogress._progress);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmprogress._id = RemoteObject.createImmutable("");__ref.setField("_id",vmprogress._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmprogress._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmprogress._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmprogress._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmprogress._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object   'ignore";
vmprogress._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmprogress._module);
 //BA.debugLineNum = 8;BA.debugLine="Private bindvalue As String";
vmprogress._bindvalue = RemoteObject.createImmutable("");__ref.setField("_bindvalue",vmprogress._bindvalue);
 //BA.debugLineNum = 9;BA.debugLine="Private buffervalue As String";
vmprogress._buffervalue = RemoteObject.createImmutable("");__ref.setField("_buffervalue",vmprogress._buffervalue);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmprogress","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 14;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 15;BA.debugLine="Progress.Initialize(vue, ID).SetTag(\"md-progress-";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-progress-bar")));
 BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 17;BA.debugLine="bindvalue = $\"${ID}value\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bindvalue" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmprogress.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("value"))));
 BA.debugLineNum = 18;BA.debugLine="buffervalue = $\"${ID}buffer\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_buffervalue" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmprogress.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("buffer"))));
 BA.debugLineNum = 19;BA.debugLine="SetValue(Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprogress.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, vmprogress.__c.getField(false,"Null"))));
 BA.debugLineNum = 20;BA.debugLine="SetBuffer(Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprogress.class, "_setbuffer" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, vmprogress.__c.getField(false,"Null"))));
 BA.debugLineNum = 21;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 22;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmprogress","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 139;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmprogress.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 141;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmprogress","render", __ref);}
 BA.debugLineNum = 135;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmprogress.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmprogress","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 96;BA.debugLine="Sub SetAccent(b As Boolean) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Progress.SetAccent(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmprogress","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 126;BA.debugLine="Sub SetAttr(attr As Map) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="Progress.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 128;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 129;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbuffer(RemoteObject __ref,RemoteObject _bvalue) throws Exception{
try {
		Debug.PushSubsStack("SetBuffer (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setbuffer")) { return __ref.runUserSub(false, "vmprogress","setbuffer", __ref, _bvalue);}
Debug.locals.put("bValue", _bvalue);
 BA.debugLineNum = 70;BA.debugLine="Sub SetBuffer(bValue As Int) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="vue.SetStateSingle(buffervalue, bValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_buffervalue" /*RemoteObject*/ )),(Object)((_bvalue)));
 BA.debugLineNum = 72;BA.debugLine="Progress.SetAttr1(\":md-buffer\", buffervalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-buffer")),(Object)((__ref.getField(true,"_buffervalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 73;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmprogress","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 114;BA.debugLine="Sub SetDisabled(b As Boolean) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="Progress.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 116;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 117;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmargin(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetMargin (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "vmprogress","setmargin", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 29;BA.debugLine="Sub SetMargin(p As String) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="Progress.SetStyle(CreateMap(\"margin\":p))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmprogress.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("margin")),(_p)}))));
 BA.debugLineNum = 31;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 32;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmode(RemoteObject __ref,RemoteObject _varmode) throws Exception{
try {
		Debug.PushSubsStack("SetMode (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setmode")) { return __ref.runUserSub(false, "vmprogress","setmode", __ref, _varmode);}
Debug.locals.put("varMode", _varmode);
 BA.debugLineNum = 40;BA.debugLine="Sub SetMode(varMode As String) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="Progress.SetAttr1(\"md-mode\", varMode)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-mode")),(Object)((_varmode)));
 BA.debugLineNum = 42;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmodebuffer(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetModeBuffer (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("setmodebuffer")) { return __ref.runUserSub(false, "vmprogress","setmodebuffer", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 64;BA.debugLine="Sub SetModeBuffer(b As Boolean) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmprogress.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 66;BA.debugLine="SetMode(\"buffer\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprogress.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("buffer")));
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
public static RemoteObject  _setmodedeterminate(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetModeDeterminate (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setmodedeterminate")) { return __ref.runUserSub(false, "vmprogress","setmodedeterminate", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 45;BA.debugLine="Sub SetModeDeterminate(b As Boolean) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmprogress.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 47;BA.debugLine="SetMode(\"determinate\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprogress.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("determinate")));
 BA.debugLineNum = 48;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmodeindeterminate(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetModeInDeterminate (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("setmodeindeterminate")) { return __ref.runUserSub(false, "vmprogress","setmodeindeterminate", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 51;BA.debugLine="Sub SetModeInDeterminate(b As Boolean) As VMProgre";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmprogress.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 53;BA.debugLine="SetMode(\"indeterminate\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprogress.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("indeterminate")));
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
public static RemoteObject  _setmodequery(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetModeQuery (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setmodequery")) { return __ref.runUserSub(false, "vmprogress","setmodequery", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 57;BA.debugLine="Sub SetModeQuery(b As Boolean) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmprogress.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 59;BA.debugLine="SetMode(\"query\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmprogress.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("query")));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmprogress","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 102;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="Progress.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmprogress","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 34;BA.debugLine="Sub SetPadding(p As String) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="Progress.SetStyle(CreateMap(\"padding\":p))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmprogress.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("padding")),(_p)}))));
 BA.debugLineNum = 36;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 37;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmprogress","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 91;BA.debugLine="Sub SetPrimary(b As Boolean) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="Progress.SetPrimary(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 93;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 94;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmprogress","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 24;BA.debugLine="Sub SetStyle(m As Map) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="Progress.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 26;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 27;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmprogress","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 76;BA.debugLine="Sub SetTabIndex(ti As String) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Progress.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
 BA.debugLineNum = 78;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _valueint) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmprogress","setvalue", __ref, _valueint);}
Debug.locals.put("valueInt", _valueint);
 BA.debugLineNum = 108;BA.debugLine="Sub SetValue(valueInt As Int) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Progress.SetAttr1(\":md-value\", bindvalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-value")),(Object)((__ref.getField(true,"_bindvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 110;BA.debugLine="vue.SetStateSingle(bindvalue, valueInt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_bindvalue" /*RemoteObject*/ )),(Object)((_valueint)));
 BA.debugLineNum = 111;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vshow) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmprogress","setvif", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 86;BA.debugLine="Sub SetVIf(vshow As String) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Progress.SetVif(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vshow));
 BA.debugLineNum = 88;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmprogress","setvshow", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 81;BA.debugLine="Sub SetVShow(vshow As String) As VMProgress";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="Progress.SetVShow(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vshow));
 BA.debugLineNum = 83;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 84;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmprogress) ","vmprogress",80,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmprogress","tostring", __ref);}
 BA.debugLineNum = 131;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="Return Progress.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_progress" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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