package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmnumberinput_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmnumberinput","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 106;BA.debugLine="Sub AddClass(c As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="NumberInput.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_numberinput" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 108;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 109;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public NumberInput As VMElement";
vmnumberinput._numberinput = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_numberinput",vmnumberinput._numberinput);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmnumberinput._id = RemoteObject.createImmutable("");__ref.setField("_id",vmnumberinput._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmnumberinput._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmnumberinput._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano   'ignore";
vmnumberinput._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmnumberinput._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private div As VMElement";
vmnumberinput._div = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_div",vmnumberinput._div);
 //BA.debugLineNum = 8;BA.debugLine="Private lbl As VMElement";
vmnumberinput._lbl = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_lbl",vmnumberinput._lbl);
 //BA.debugLineNum = 9;BA.debugLine="Private mdl As String";
vmnumberinput._mdl = RemoteObject.createImmutable("");__ref.setField("_mdl",vmnumberinput._mdl);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmnumberinput","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 13;BA.debugLine="BANano.DependsOnAsset(\"vue-number-input.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("vue-number-input.js")));
 BA.debugLineNum = 15;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 16;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 17;BA.debugLine="div.Initialize(vue, $\"${ID}\"$).SetTag(\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_div" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmnumberinput.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 18;BA.debugLine="lbl.Initialize(vue,$\"${ID}lbl\"$).SetTag(\"label\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmnumberinput.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("lbl"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("label")));
 BA.debugLineNum = 19;BA.debugLine="lbl.SetStyle(CreateMap(\"pointer-events\": \"auto\",";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("pointer-events")),RemoteObject.createImmutable(("auto")),RemoteObject.createImmutable(("top")),RemoteObject.createImmutable(("0")),RemoteObject.createImmutable(("opacity")),RemoteObject.createImmutable(("1")),RemoteObject.createImmutable(("font-size")),(RemoteObject.createImmutable("12px"))}))));
 BA.debugLineNum = 20;BA.debugLine="NumberInput.Initialize(vue, ID).SetTag(\"number-in";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_numberinput" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("number-input")));
 BA.debugLineNum = 21;BA.debugLine="mdl = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdl" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 22;BA.debugLine="SetCenter(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setcenter" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.getField(true,"True")));
 BA.debugLineNum = 23;BA.debugLine="SetControls(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setcontrols" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.getField(true,"True")));
 BA.debugLineNum = 24;BA.debugLine="SetInputable(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setinputable" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.getField(true,"False")));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmnumberinput","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 172;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 173;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmnumberinput.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 174;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,168);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmnumberinput","render", __ref);}
 BA.debugLineNum = 168;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 169;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmnumberinput.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 170;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmnumberinput","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 112;BA.debugLine="Sub SetAttr(attr As Map) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="NumberInput.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_numberinput" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 114;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcenter(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCenter (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("setcenter")) { return __ref.runUserSub(false, "vmnumberinput","setcenter", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 35;BA.debugLine="Sub SetCenter(b As Boolean) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmnumberinput.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 37;BA.debugLine="SetAttr(CreateMap(\":center\":b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":center")),(_b)}))));
 BA.debugLineNum = 38;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcontrols(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetControls (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setcontrols")) { return __ref.runUserSub(false, "vmnumberinput","setcontrols", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 28;BA.debugLine="Sub SetControls(b As Boolean) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmnumberinput.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 30;BA.debugLine="SetAttr(CreateMap(\":controls\":b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":controls")),(_b)}))));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmnumberinput","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 99;BA.debugLine="Sub SetDisabled(b As Boolean) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="NumberInput.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_numberinput" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 101;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 102;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmnumberinput","setid", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 94;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="NumberInput.SetID(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_numberinput" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 96;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 97;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinline(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetInline (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setinline")) { return __ref.runUserSub(false, "vmnumberinput","setinline", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 41;BA.debugLine="Sub SetInline(b As Boolean) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmnumberinput.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 43;BA.debugLine="SetAttr(CreateMap(\":inline\":b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":inline")),(_b)}))));
 BA.debugLineNum = 44;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinputable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetInputable (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setinputable")) { return __ref.runUserSub(false, "vmnumberinput","setinputable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 53;BA.debugLine="Sub SetInputable(b As Boolean) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="If b = True Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmnumberinput.__c.getField(true,"True"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 55;BA.debugLine="SetAttr(CreateMap(\":inputtable\": b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":inputtable")),(_b)}))));
 BA.debugLineNum = 56;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 57;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmnumberinput","setlabel", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 75;BA.debugLine="Sub SetLabel(t As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 77;BA.debugLine="lbl.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
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
public static RemoteObject  _setmax(RemoteObject __ref,RemoteObject _mx) throws Exception{
try {
		Debug.PushSubsStack("SetMax (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("setmax")) { return __ref.runUserSub(false, "vmnumberinput","setmax", __ref, _mx);}
Debug.locals.put("mx", _mx);
 BA.debugLineNum = 129;BA.debugLine="Sub SetMax(mx As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="If mx = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_mx,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 131;BA.debugLine="SetAttr(CreateMap(\":max\": mx))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":max")),(_mx)}))));
 BA.debugLineNum = 132;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 133;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmin(RemoteObject __ref,RemoteObject _mn) throws Exception{
try {
		Debug.PushSubsStack("SetMin (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("setmin")) { return __ref.runUserSub(false, "vmnumberinput","setmin", __ref, _mn);}
Debug.locals.put("mn", _mn);
 BA.debugLineNum = 135;BA.debugLine="Sub SetMin(mn As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="If mn = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_mn,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 137;BA.debugLine="SetAttr(CreateMap(\":min\": mn))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":min")),(_mn)}))));
 BA.debugLineNum = 138;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetName (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmnumberinput","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 88;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="NumberInput.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_numberinput" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 90;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setreadonly(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetReadOnly (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("setreadonly")) { return __ref.runUserSub(false, "vmnumberinput","setreadonly", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 47;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="If b = True Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmnumberinput.__c.getField(true,"True"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 49;BA.debugLine="SetAttr(CreateMap(\":readonly\": b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":readonly")),(_b)}))));
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
public static RemoteObject  _setrounded(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRounded (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setrounded")) { return __ref.runUserSub(false, "vmnumberinput","setrounded", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 59;BA.debugLine="Sub SetRounded(b As Boolean) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmnumberinput.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 61;BA.debugLine="SetAttr(CreateMap(\"rounded\": b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("rounded")),(_b)}))));
 BA.debugLineNum = 62;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsizelarge(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetSizeLarge (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setsizelarge")) { return __ref.runUserSub(false, "vmnumberinput","setsizelarge", __ref);}
 BA.debugLineNum = 70;BA.debugLine="Sub SetSizeLarge As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="SetAttr(CreateMap(\"size\":\"large\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("size")),(RemoteObject.createImmutable("large"))}))));
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
public static RemoteObject  _setsizesmall(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetSizeSmall (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setsizesmall")) { return __ref.runUserSub(false, "vmnumberinput","setsizesmall", __ref);}
 BA.debugLineNum = 65;BA.debugLine="Sub SetSizeSmall As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="SetAttr(CreateMap(\"size\":\"small\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("size")),(RemoteObject.createImmutable("small"))}))));
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
public static RemoteObject  _setstep(RemoteObject __ref,RemoteObject _stp) throws Exception{
try {
		Debug.PushSubsStack("SetStep (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("setstep")) { return __ref.runUserSub(false, "vmnumberinput","setstep", __ref, _stp);}
Debug.locals.put("stp", _stp);
 BA.debugLineNum = 156;BA.debugLine="Sub SetStep(stp As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="If stp = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stp,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 158;BA.debugLine="SetAttr(CreateMap(\":step\":stp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmnumberinput.class, "_setattr" /*RemoteObject*/ ,(Object)(vmnumberinput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":step")),(_stp)}))));
 BA.debugLineNum = 159;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 160;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmnumberinput","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 81;BA.debugLine="Sub SetTabIndex(ti As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="If ti = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ti,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 83;BA.debugLine="NumberInput.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_numberinput" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _vl) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmnumberinput","setvalue", __ref, _vl);}
Debug.locals.put("vl", _vl);
 BA.debugLineNum = 148;BA.debugLine="Sub SetValue(vl As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="If mdl = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_mdl" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 150;BA.debugLine="Log(\"VMNumberInput: Set VModel first!\")";
Debug.JustUpdateDeviceLine();
vmnumberinput.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("VMNumberInput: Set VModel first!")));
 };
 BA.debugLineNum = 152;BA.debugLine="vue.SetStateSingle(mdl, vl)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_mdl" /*RemoteObject*/ )),(Object)((_vl)));
 BA.debugLineNum = 153;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 154;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmnumberinput","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 117;BA.debugLine="Sub SetVIf(vif As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 119;BA.debugLine="div.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_div" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 120;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmnumberinput","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 141;BA.debugLine="Sub SetVModel(k As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="If k = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_k,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 143;BA.debugLine="mdl = k.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mdl" /*RemoteObject*/ ,_k.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 144;BA.debugLine="NumberInput.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_numberinput" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmnumberinput","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 123;BA.debugLine="Sub SetVShow(vif As String) As VMNumberInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 125;BA.debugLine="div.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_div" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 126;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmnumberinput) ","vmnumberinput",77,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmnumberinput","tostring", __ref);}
 BA.debugLineNum = 162;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 163;BA.debugLine="lbl.Pop(div)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_div" /*RemoteObject*/ )));
 BA.debugLineNum = 164;BA.debugLine="NumberInput.Pop(div)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_numberinput" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_div" /*RemoteObject*/ )));
 BA.debugLineNum = 165;BA.debugLine="Return div.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_div" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}