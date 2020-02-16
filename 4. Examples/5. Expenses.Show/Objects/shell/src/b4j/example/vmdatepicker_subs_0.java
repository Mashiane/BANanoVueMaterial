package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmdatepicker_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmdatepicker","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 94;BA.debugLine="Sub AddClass(c As String) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="DatePicker.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,185);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmdatepicker","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 185;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 186;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmdatepicker.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public DatePicker As VMElement";
vmdatepicker._datepicker = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_datepicker",vmdatepicker._datepicker);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmdatepicker._id = RemoteObject.createImmutable("");__ref.setField("_id",vmdatepicker._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmdatepicker._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmdatepicker._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private lbl As VMLabel";
vmdatepicker._lbl = RemoteObject.createNew ("b4j.example.vmlabel");__ref.setField("_lbl",vmdatepicker._lbl);
 //BA.debugLineNum = 7;BA.debugLine="Private ht As VMElement";
vmdatepicker._ht = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_ht",vmdatepicker._ht);
 //BA.debugLineNum = 8;BA.debugLine="Private hasHelp As Boolean";
vmdatepicker._hashelp = RemoteObject.createImmutable(false);__ref.setField("_hashelp",vmdatepicker._hashelp);
 //BA.debugLineNum = 9;BA.debugLine="Private DateInt As VMElement";
vmdatepicker._dateint = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_dateint",vmdatepicker._dateint);
 //BA.debugLineNum = 10;BA.debugLine="Private BANano As BANano  'ignore";
vmdatepicker._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmdatepicker._banano);
 //BA.debugLineNum = 11;BA.debugLine="Private hasError As Boolean";
vmdatepicker._haserror = RemoteObject.createImmutable(false);__ref.setField("_haserror",vmdatepicker._haserror);
 //BA.debugLineNum = 12;BA.debugLine="Private he As VMElement";
vmdatepicker._he = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_he",vmdatepicker._he);
 //BA.debugLineNum = 13;BA.debugLine="Private xmodel As String";
vmdatepicker._xmodel = RemoteObject.createImmutable("");__ref.setField("_xmodel",vmdatepicker._xmodel);
 //BA.debugLineNum = 14;BA.debugLine="Private module As Object";
vmdatepicker._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmdatepicker._module);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmdatepicker","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 17;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 19;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 21;BA.debugLine="DatePicker.Initialize(vue, ID).SetTag(\"md-datepic";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-datepicker")));
 BA.debugLineNum = 22;BA.debugLine="lbl.Initialize(vue,$\"${ID}lbl\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmdatepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("lbl")))));
 BA.debugLineNum = 23;BA.debugLine="hasHelp = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 24;BA.debugLine="hasError = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmdatepicker.__c.getField(true,"False"));
 BA.debugLineNum = 25;BA.debugLine="DateInt.Initialize(v,$\"${sid}parent\"$).SetTag(\"di";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dateint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmdatepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sid))),RemoteObject.createImmutable("parent"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 26;BA.debugLine="SetOnOpened";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdatepicker.class, "_setonopened" /*RemoteObject*/ );
 BA.debugLineNum = 27;BA.debugLine="SetOnClosed";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdatepicker.class, "_setonclosed" /*RemoteObject*/ );
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmdatepicker","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 180;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmdatepicker.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmdatepicker","render", __ref);}
 BA.debugLineNum = 176;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmdatepicker.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmdatepicker","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 100;BA.debugLine="Sub SetAttr(attr As Map) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="DatePicker.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 102;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 103;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclearable(RemoteObject __ref,RemoteObject _varclearable) throws Exception{
try {
		Debug.PushSubsStack("SetClearable (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setclearable")) { return __ref.runUserSub(false, "vmdatepicker","setclearable", __ref, _varclearable);}
Debug.locals.put("varClearable", _varclearable);
 BA.debugLineNum = 88;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMDat";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="If varClearable Then DatePicker.SetAttr(CreateMap";
Debug.JustUpdateDeviceLine();
if (_varclearable.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdatepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-clearable")),(_varclearable)}))));};
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
public static RemoteObject  _setdebounce(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDebounce (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setdebounce")) { return __ref.runUserSub(false, "vmdatepicker","setdebounce", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 139;BA.debugLine="Sub SetDebounce(b As Boolean) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmdatepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 141;BA.debugLine="DatePicker.SetAttr(CreateMap(\"md-debounce\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdatepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-debounce")),(_b)}))));
 BA.debugLineNum = 142;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 143;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmdatepicker","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 37;BA.debugLine="Sub SetDisabled(b As Boolean) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="DatePicker.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 39;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seterrortext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetErrorText (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("seterrortext")) { return __ref.runUserSub(false, "vmdatepicker","seterrortext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 114;BA.debugLine="Sub SetErrorText(t As String) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 116;BA.debugLine="hasError = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vmdatepicker.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="he = DatePicker.SetErrorText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_he" /*RemoteObject*/ ,__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_t)));
 BA.debugLineNum = 118;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 119;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethelpertext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetHelperText (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("sethelpertext")) { return __ref.runUserSub(false, "vmdatepicker","sethelpertext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 106;BA.debugLine="Sub SetHelperText(t As String) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 108;BA.debugLine="hasHelp = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vmdatepicker.__c.getField(true,"True"));
 BA.debugLineNum = 109;BA.debugLine="ht = DatePicker.SetHelperText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ht" /*RemoteObject*/ ,__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_t)));
 BA.debugLineNum = 110;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setimmediately(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetImmediately (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setimmediately")) { return __ref.runUserSub(false, "vmdatepicker","setimmediately", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 121;BA.debugLine="Sub SetImmediately(b As Boolean) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmdatepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 123;BA.debugLine="DatePicker.SetAttr(CreateMap(\":md-immediately\": b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdatepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-immediately")),(_b)}))));
 BA.debugLineNum = 124;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 125;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetLabel (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmdatepicker","setlabel", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 152;BA.debugLine="Sub SetLabel(t As String) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 154;BA.debugLine="lbl.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 155;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 156;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetName (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmdatepicker","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 159;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="DatePicker.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 161;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclosed(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnClosed (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setonclosed")) { return __ref.runUserSub(false, "vmdatepicker","setonclosed", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 56;BA.debugLine="private Sub SetOnClosed As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmdatepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_closed")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 58;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmdatepicker.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmdatepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 59;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 60;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 61;BA.debugLine="SetAttr(CreateMap(\"v-on:md-closed\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdatepicker.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdatepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-closed")),(_methodname)}))));
 BA.debugLineNum = 64;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setonopened(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnOpened (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setonopened")) { return __ref.runUserSub(false, "vmdatepicker","setonopened", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 43;BA.debugLine="private Sub SetOnOpened As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Dim methodName As String  = $\"${ID}_opened\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmdatepicker.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_opened")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 45;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmdatepicker.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmdatepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 46;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 47;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 48;BA.debugLine="SetAttr(CreateMap(\"v-on:md-opened\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdatepicker.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdatepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-opened")),(_methodname)}))));
 BA.debugLineNum = 51;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setopenonfocus(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetOpenOnFocus (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("setopenonfocus")) { return __ref.runUserSub(false, "vmdatepicker","setopenonfocus", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 127;BA.debugLine="Sub SetOpenOnFocus(b As Boolean) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmdatepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 129;BA.debugLine="DatePicker.SetAttr(CreateMap(\":md-open-on-focus\":";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdatepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-open-on-focus")),(_b)}))));
 BA.debugLineNum = 130;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoverridenative(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetOverrideNative (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("setoverridenative")) { return __ref.runUserSub(false, "vmdatepicker","setoverridenative", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 133;BA.debugLine="Sub SetOverrideNative(b As Boolean) As VMDatePicke";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmdatepicker.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 135;BA.debugLine="DatePicker.SetAttr(CreateMap(\":md-override-native";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdatepicker.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-override-native")),(_b)}))));
 BA.debugLineNum = 136;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 137;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrequired(RemoteObject __ref,RemoteObject _varrequired) throws Exception{
try {
		Debug.PushSubsStack("SetRequired (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("setrequired")) { return __ref.runUserSub(false, "vmdatepicker","setrequired", __ref, _varrequired);}
Debug.locals.put("varRequired", _varrequired);
 BA.debugLineNum = 32;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMDateP";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="DatePicker.SetRequired(varRequired)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setrequired" /*RemoteObject*/ ,(Object)(_varrequired));
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
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmdatepicker","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 69;BA.debugLine="Sub SetTabIndex(ti As String) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="DatePicker.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vshow) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmdatepicker","setvif", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 80;BA.debugLine="Sub SetVIf(vshow As String) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="If vshow = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vshow,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 82;BA.debugLine="DatePicker.SetVif(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vshow));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmdatepicker","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 145;BA.debugLine="Sub SetVModel(k As String) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="If k = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_k,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 147;BA.debugLine="DatePicker.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 148;BA.debugLine="xmodel = k";
Debug.JustUpdateDeviceLine();
__ref.setField ("_xmodel" /*RemoteObject*/ ,_k);
 BA.debugLineNum = 149;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmdatepicker","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 74;BA.debugLine="Sub SetVShow(vif As String) As VMDatePicker";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 76;BA.debugLine="DatePicker.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmdatepicker) ","vmdatepicker",49,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmdatepicker","tostring", __ref);}
 BA.debugLineNum = 164;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="lbl.Pop(DatePicker)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_datepicker" /*RemoteObject*/ )));
 BA.debugLineNum = 166;BA.debugLine="DatePicker.Pop(DateInt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_datepicker" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dateint" /*RemoteObject*/ )));
 BA.debugLineNum = 173;BA.debugLine="Return DateInt.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_dateint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}