package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmspinner_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmspinner","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 104;BA.debugLine="Sub AddClass(c As String) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="Spinner.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 106;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 107;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddToContainer (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmspinner","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 127;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmspinner.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 129;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Spinner As VMElement";
vmspinner._spinner = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_spinner",vmspinner._spinner);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmspinner._id = RemoteObject.createImmutable("");__ref.setField("_id",vmspinner._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmspinner._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmspinner._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmspinner._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmspinner._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object   'ignore";
vmspinner._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmspinner._module);
 //BA.debugLineNum = 8;BA.debugLine="Private bindvalue As String";
vmspinner._bindvalue = RemoteObject.createImmutable("");__ref.setField("_bindvalue",vmspinner._bindvalue);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmspinner","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 14;BA.debugLine="Spinner.Initialize(vue, ID).SetTag(\"md-progress-s";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-progress-spinner")));
 BA.debugLineNum = 15;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 16;BA.debugLine="bindvalue = $\"${ID}value\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bindvalue" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmspinner.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("value"))));
 BA.debugLineNum = 17;BA.debugLine="SetValue(Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspinner.class, "_setvalue" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, vmspinner.__c.getField(false,"Null"))));
 BA.debugLineNum = 18;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 19;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmspinner","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 123;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmspinner.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 125;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmspinner","render", __ref);}
 BA.debugLineNum = 119;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmspinner.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 121;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmspinner","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 92;BA.debugLine="Sub SetAccent(b As Boolean) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="Spinner.SetAccent(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 94;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmspinner","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 110;BA.debugLine="Sub SetAttr(attr As Map) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="Spinner.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 112;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 113;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdiameter(RemoteObject __ref,RemoteObject _bvalue) throws Exception{
try {
		Debug.PushSubsStack("SetDiameter (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setdiameter")) { return __ref.runUserSub(false, "vmspinner","setdiameter", __ref, _bvalue);}
Debug.locals.put("bValue", _bvalue);
 BA.debugLineNum = 66;BA.debugLine="Sub SetDiameter(bValue As Int) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="Spinner.SetAttr1(\":md-diameter\", bValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-diameter")),(Object)((_bvalue)));
 BA.debugLineNum = 68;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMargin (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "vmspinner","setmargin", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 33;BA.debugLine="Sub SetMargin(p As String) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="Spinner.SetStyle(CreateMap(\"margin\":p))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmspinner.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("margin")),(_p)}))));
 BA.debugLineNum = 35;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMode (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setmode")) { return __ref.runUserSub(false, "vmspinner","setmode", __ref, _varmode);}
Debug.locals.put("varMode", _varmode);
 BA.debugLineNum = 44;BA.debugLine="Sub SetMode(varMode As String) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Spinner.SetAttr1(\"md-mode\", varMode)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-mode")),(Object)((_varmode)));
 BA.debugLineNum = 46;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 47;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetModeDeterminate (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("setmodedeterminate")) { return __ref.runUserSub(false, "vmspinner","setmodedeterminate", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 49;BA.debugLine="Sub SetModeDeterminate(b As Boolean) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmspinner.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 51;BA.debugLine="SetMode(\"determinate\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspinner.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("determinate")));
 BA.debugLineNum = 52;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 53;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetModeInDeterminate (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setmodeindeterminate")) { return __ref.runUserSub(false, "vmspinner","setmodeindeterminate", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 55;BA.debugLine="Sub SetModeInDeterminate(b As Boolean) As VMSpinne";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmspinner.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 57;BA.debugLine="SetMode(\"indeterminate\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspinner.class, "_setmode" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("indeterminate")));
 BA.debugLineNum = 58;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 59;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetName (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmspinner","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 98;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="Spinner.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmspinner","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 38;BA.debugLine="Sub SetPadding(p As String) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="Spinner.SetStyle(CreateMap(\"padding\":p))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmspinner.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("padding")),(_p)}))));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmspinner","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 87;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="Spinner.SetPrimary(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 89;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstroke(RemoteObject __ref,RemoteObject _bvalue) throws Exception{
try {
		Debug.PushSubsStack("SetStroke (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setstroke")) { return __ref.runUserSub(false, "vmspinner","setstroke", __ref, _bvalue);}
Debug.locals.put("bValue", _bvalue);
 BA.debugLineNum = 61;BA.debugLine="Sub SetStroke(bValue As Int) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="Spinner.SetAttr1(\":md-stroke\", bValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-stroke")),(Object)((_bvalue)));
 BA.debugLineNum = 63;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmspinner","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 28;BA.debugLine="Sub SetStyle(m As Map) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="Spinner.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 30;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmspinner","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 72;BA.debugLine="Sub SetTabIndex(ti As String) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="Spinner.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
 BA.debugLineNum = 74;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetValue (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmspinner","setvalue", __ref, _valueint);}
Debug.locals.put("valueInt", _valueint);
 BA.debugLineNum = 22;BA.debugLine="Sub SetValue(valueInt As Int) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="Spinner.SetAttr1(\":md-value\", bindvalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr1" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-value")),(Object)((__ref.getField(true,"_bindvalue" /*RemoteObject*/ ))));
 BA.debugLineNum = 24;BA.debugLine="vue.SetStateSingle(bindvalue, valueInt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_bindvalue" /*RemoteObject*/ )),(Object)((_valueint)));
 BA.debugLineNum = 25;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 26;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmspinner","setvif", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 82;BA.debugLine="Sub SetVIf(vshow As String) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="Spinner.SetVif(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vshow));
 BA.debugLineNum = 84;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmspinner","setvshow", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 77;BA.debugLine="Sub SetVShow(vshow As String) As VMSpinner";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="Spinner.SetVShow(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vshow));
 BA.debugLineNum = 79;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmspinner) ","vmspinner",91,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmspinner","tostring", __ref);}
 BA.debugLineNum = 115;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Return Spinner.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_spinner" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 117;BA.debugLine="End Sub";
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