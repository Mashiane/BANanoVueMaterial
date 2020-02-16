package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vminput_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vminput","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 163;BA.debugLine="Sub AddChild(child As VMElement) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 165;BA.debugLine="Input.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 166;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 167;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vminput","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 210;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 212;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 214;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vminput","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 192;BA.debugLine="Sub AddClass(c As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="Input.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 194;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 195;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddToContainer (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vminput","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 335;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 336;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vminput.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 337;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Input As VMElement";
vminput._input = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_input",vminput._input);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vminput._id = RemoteObject.createImmutable("");__ref.setField("_id",vminput._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vminput._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vminput._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vminput._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vminput._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private InputInt As VMField";
vminput._inputint = RemoteObject.createNew ("b4j.example.vmfield");__ref.setField("_inputint",vminput._inputint);
 //BA.debugLineNum = 8;BA.debugLine="Private lbl As VMLabel";
vminput._lbl = RemoteObject.createNew ("b4j.example.vmlabel");__ref.setField("_lbl",vminput._lbl);
 //BA.debugLineNum = 9;BA.debugLine="Private hasHelp As Boolean";
vminput._hashelp = RemoteObject.createImmutable(false);__ref.setField("_hashelp",vminput._hashelp);
 //BA.debugLineNum = 10;BA.debugLine="Private ht As VMElement";
vminput._ht = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_ht",vminput._ht);
 //BA.debugLineNum = 11;BA.debugLine="Private hasError As Boolean";
vminput._haserror = RemoteObject.createImmutable(false);__ref.setField("_haserror",vminput._haserror);
 //BA.debugLineNum = 12;BA.debugLine="Private icon1 As VMIcon";
vminput._icon1 = RemoteObject.createNew ("b4j.example.vmicon");__ref.setField("_icon1",vminput._icon1);
 //BA.debugLineNum = 13;BA.debugLine="Private icon2 As VMIcon";
vminput._icon2 = RemoteObject.createNew ("b4j.example.vmicon");__ref.setField("_icon2",vminput._icon2);
 //BA.debugLineNum = 14;BA.debugLine="Private suffix As VMElement";
vminput._suffix = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_suffix",vminput._suffix);
 //BA.debugLineNum = 15;BA.debugLine="Private prefix As VMElement";
vminput._prefix = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_prefix",vminput._prefix);
 //BA.debugLineNum = 16;BA.debugLine="Private hasSuffix As Boolean";
vminput._hassuffix = RemoteObject.createImmutable(false);__ref.setField("_hassuffix",vminput._hassuffix);
 //BA.debugLineNum = 17;BA.debugLine="Private hasPrefix As Boolean";
vminput._hasprefix = RemoteObject.createImmutable(false);__ref.setField("_hasprefix",vminput._hasprefix);
 //BA.debugLineNum = 18;BA.debugLine="Private he As VMElement";
vminput._he = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_he",vminput._he);
 //BA.debugLineNum = 19;BA.debugLine="Private module As Object";
vminput._module = RemoteObject.createNew ("Object");__ref.setField("_module",vminput._module);
 //BA.debugLineNum = 20;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vminput","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 23;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 25;BA.debugLine="Input.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 26;BA.debugLine="Input.SetTag(\"md-input\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-input")));
 BA.debugLineNum = 27;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 28;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 29;BA.debugLine="InputInt.Initialize(v,ID, $\"${ID}field\"$,module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminput.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("field")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 30;BA.debugLine="lbl.Initialize(vue, $\"${ID}label\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminput.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("label")))));
 BA.debugLineNum = 31;BA.debugLine="hasHelp = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vminput.__c.getField(true,"False"));
 BA.debugLineNum = 32;BA.debugLine="hasError = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vminput.__c.getField(true,"False"));
 BA.debugLineNum = 33;BA.debugLine="icon1.Initialize(vue,$\"${ID}icon1\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon1" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminput.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icon1")))));
 BA.debugLineNum = 34;BA.debugLine="icon2.Initialize(vue,$\"${ID}icon2\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon2" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminput.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icon2")))));
 BA.debugLineNum = 35;BA.debugLine="prefix.Initialize(vue,$\"${ID}prefix\"$).AddClass(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefix" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminput.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("prefix"))))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-prefix"))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 36;BA.debugLine="suffix.Initialize(vue,$\"${ID}suffix\"$).AddClass(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_suffix" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminput.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("suffix"))))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-suffix"))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 37;BA.debugLine="hasPrefix = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasprefix" /*RemoteObject*/ ,vminput.__c.getField(true,"False"));
 BA.debugLineNum = 38;BA.debugLine="hasSuffix = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hassuffix" /*RemoteObject*/ ,vminput.__c.getField(true,"False"));
 BA.debugLineNum = 39;BA.debugLine="SetOnInput";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setoninput" /*RemoteObject*/ );
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,187);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vminput","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 187;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 188;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vminput.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 189;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vminput","render", __ref);}
 BA.debugLineNum = 158;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vminput.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 160;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vminput","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 181;BA.debugLine="Sub SetAccent(b As Boolean) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 182;BA.debugLine="Input.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vminput.__c.getField(true,"True")));
 BA.debugLineNum = 183;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 184;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vminput","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 198;BA.debugLine="Sub SetAttr(attr As Map) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 199;BA.debugLine="Input.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setautocomplete(RemoteObject __ref,RemoteObject _auto) throws Exception{
try {
		Debug.PushSubsStack("SetAutoComplete (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setautocomplete")) { return __ref.runUserSub(false, "vminput","setautocomplete", __ref, _auto);}
Debug.locals.put("auto", _auto);
 BA.debugLineNum = 53;BA.debugLine="Sub SetAutoComplete(auto As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Input.SetAutoComplete(auto)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setautocomplete" /*RemoteObject*/ ,(Object)(_auto));
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
public static RemoteObject  _setclearable(RemoteObject __ref,RemoteObject _varclearable) throws Exception{
try {
		Debug.PushSubsStack("SetClearable (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,321);
if (RapidSub.canDelegate("setclearable")) { return __ref.runUserSub(false, "vminput","setclearable", __ref, _varclearable);}
Debug.locals.put("varClearable", _varclearable);
 BA.debugLineNum = 321;BA.debugLine="Sub SetClearable(varClearable As Boolean) As VMInp";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 322;BA.debugLine="If varClearable = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varclearable,vminput.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 323;BA.debugLine="If varClearable Then InputInt.SetAttr(CreateMap(\"";
Debug.JustUpdateDeviceLine();
if (_varclearable.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-clearable")),(_varclearable)}))));};
 BA.debugLineNum = 324;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcounter(RemoteObject __ref,RemoteObject _varcounter) throws Exception{
try {
		Debug.PushSubsStack("SetCounter (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,302);
if (RapidSub.canDelegate("setcounter")) { return __ref.runUserSub(false, "vminput","setcounter", __ref, _varcounter);}
Debug.locals.put("varCounter", _varcounter);
 BA.debugLineNum = 302;BA.debugLine="Sub SetCounter(varCounter As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 303;BA.debugLine="If varCounter = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varcounter,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 304;BA.debugLine="SetAttr(CreateMap(\"md-counter\": varCounter))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-counter")),(_varcounter)}))));
 BA.debugLineNum = 305;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 306;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcounterdisabled(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetCounterDisabled (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("setcounterdisabled")) { return __ref.runUserSub(false, "vminput","setcounterdisabled", __ref);}
 BA.debugLineNum = 296;BA.debugLine="Sub SetCounterDisabled As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 297;BA.debugLine="InputInt.SetAttr(CreateMap(\":md-counter\": False))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-counter")),(vminput.__c.getField(true,"False"))}))));
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
		Debug.PushSubsStack("SetDisabled (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vminput","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 283;BA.debugLine="Sub SetDisabled(b As Boolean) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="Input.setdisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 285;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 286;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetErrorText (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("seterrortext")) { return __ref.runUserSub(false, "vminput","seterrortext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 131;BA.debugLine="Sub SetErrorText(t As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 133;BA.debugLine="hasError = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_haserror" /*RemoteObject*/ ,vminput.__c.getField(true,"True"));
 BA.debugLineNum = 134;BA.debugLine="he = Input.SetErrorText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_he" /*RemoteObject*/ ,__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_seterrortext" /*RemoteObject*/ ,(Object)(_t)));
 BA.debugLineNum = 135;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 136;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetHelperText (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("sethelpertext")) { return __ref.runUserSub(false, "vminput","sethelpertext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 124;BA.debugLine="Sub SetHelperText(t As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 126;BA.debugLine="hasHelp = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hashelp" /*RemoteObject*/ ,vminput.__c.getField(true,"True"));
 BA.debugLineNum = 127;BA.debugLine="ht = Input.SetHelperText(t)";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ht" /*RemoteObject*/ ,__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethelpertext" /*RemoteObject*/ ,(Object)(_t)));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _stricon) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vminput","seticon", __ref, _stricon);}
Debug.locals.put("strIcon", _stricon);
 BA.debugLineNum = 73;BA.debugLine="Sub SetIcon(strIcon As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="If strIcon = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stricon,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 75;BA.debugLine="icon1.SetText(strIcon)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon1" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_stricon));
 BA.debugLineNum = 76;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticon1(RemoteObject __ref,RemoteObject _stricon) throws Exception{
try {
		Debug.PushSubsStack("SetIcon1 (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("seticon1")) { return __ref.runUserSub(false, "vminput","seticon1", __ref, _stricon);}
Debug.locals.put("strIcon", _stricon);
 BA.debugLineNum = 80;BA.debugLine="Sub SetIcon1(strIcon As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="If strIcon = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stricon,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 82;BA.debugLine="icon2.SetText(strIcon)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon2" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_stricon));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _varname,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,278);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vminput","setid", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 278;BA.debugLine="Sub SetID(varName As Object, bind As Boolean) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 279;BA.debugLine="Input.SetID(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 280;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 281;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinline(RemoteObject __ref,RemoteObject _varinline) throws Exception{
try {
		Debug.PushSubsStack("SetInline (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,309);
if (RapidSub.canDelegate("setinline")) { return __ref.runUserSub(false, "vminput","setinline", __ref, _varinline);}
Debug.locals.put("varInline", _varinline);
 BA.debugLineNum = 309;BA.debugLine="Sub SetInline(varInline As Boolean) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 310;BA.debugLine="If varInline = True Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varinline,vminput.__c.getField(true,"True"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 311;BA.debugLine="InputInt.SetAttr(CreateMap(\":md-inline\": varInlin";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-inline")),(_varinline)}))));
 BA.debugLineNum = 312;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 313;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _lbltext) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vminput","setlabel", __ref, _lbltext);}
Debug.locals.put("lblText", _lbltext);
 BA.debugLineNum = 93;BA.debugLine="Sub SetLabel(lblText As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="If lblText = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_lbltext,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 95;BA.debugLine="lbl.SetText(lblText)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)(_lbltext));
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
public static RemoteObject  _setmaxlength(RemoteObject __ref,RemoteObject _varmaxlength) throws Exception{
try {
		Debug.PushSubsStack("SetMaxLength (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,289);
if (RapidSub.canDelegate("setmaxlength")) { return __ref.runUserSub(false, "vminput","setmaxlength", __ref, _varmaxlength);}
Debug.locals.put("varMaxlength", _varmaxlength);
 BA.debugLineNum = 289;BA.debugLine="Sub SetMaxLength(varMaxlength As Int) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 290;BA.debugLine="If varMaxlength = Null Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varmaxlength,BA.numberCast(double.class, vminput.__c.getField(false,"Null")))) { 
if (true) return (__ref);};
 BA.debugLineNum = 291;BA.debugLine="SetAttr(CreateMap(\"maxlength\": varMaxlength))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("maxlength")),(_varmaxlength)}))));
 BA.debugLineNum = 292;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 293;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetName (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vminput","setname", __ref, _varname, _bind);}
Debug.locals.put("varName", _varname);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 272;BA.debugLine="Sub SetName(varName As Object, bind As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 273;BA.debugLine="Input.SetName(varName, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_varname)),(Object)(_bind));
 BA.debugLineNum = 274;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoninput(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnInput (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setoninput")) { return __ref.runUserSub(false, "vminput","setoninput", __ref);}
RemoteObject _oninput = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 43;BA.debugLine="private Sub SetOnInput As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="Dim oninput As String = $\"${ID}_input\"$";
Debug.JustUpdateDeviceLine();
_oninput = (RemoteObject.concat(RemoteObject.createImmutable(""),vminput.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_input")));Debug.locals.put("oninput", _oninput);Debug.locals.put("oninput", _oninput);
 BA.debugLineNum = 45;BA.debugLine="If SubExists(module, oninput) = False Then Return";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vminput.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_oninput)),vminput.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 46;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 47;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_oninput),(Object)(vminput.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_e)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 48;BA.debugLine="SetAttr(CreateMap(\"@input\":oninput))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("@input")),(_oninput)}))));
 BA.debugLineNum = 49;BA.debugLine="vue.SetCallBack(oninput, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_oninput),(Object)(_cb));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vminput","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 217;BA.debugLine="Sub SetPadding(p As Object) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 218;BA.debugLine="Input.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setplaceholder(RemoteObject __ref,RemoteObject _varplaceholder) throws Exception{
try {
		Debug.PushSubsStack("SetPlaceholder (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("setplaceholder")) { return __ref.runUserSub(false, "vminput","setplaceholder", __ref, _varplaceholder);}
Debug.locals.put("varPlaceholder", _varplaceholder);
 BA.debugLineNum = 260;BA.debugLine="Sub SetPlaceholder(varPlaceholder As Object) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 261;BA.debugLine="SetAttr(CreateMap(\"placeholder\": varPlaceholder))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("placeholder")),_varplaceholder}))));
 BA.debugLineNum = 262;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setprefix(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPrefix (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,58);
if (RapidSub.canDelegate("setprefix")) { return __ref.runUserSub(false, "vminput","setprefix", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 58;BA.debugLine="Sub SetPrefix(p As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 59;BA.debugLine="If p = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_p,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 60;BA.debugLine="hasPrefix = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasprefix" /*RemoteObject*/ ,vminput.__c.getField(true,"True"));
 BA.debugLineNum = 61;BA.debugLine="prefix.SetText(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefix" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vminput","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 176;BA.debugLine="Sub SetPrimary(b As Boolean) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="Input.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vminput.__c.getField(true,"True")));
 BA.debugLineNum = 178;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 179;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetReadOnly (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setreadonly")) { return __ref.runUserSub(false, "vminput","setreadonly", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 87;BA.debugLine="Sub SetReadOnly(b As Boolean) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vminput.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 89;BA.debugLine="Input.SetAttr(CreateMap(\":readonly\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":readonly")),(_b)}))));
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
public static RemoteObject  _setrequired(RemoteObject __ref,RemoteObject _varrequired) throws Exception{
try {
		Debug.PushSubsStack("SetRequired (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("setrequired")) { return __ref.runUserSub(false, "vminput","setrequired", __ref, _varrequired);}
Debug.locals.put("varRequired", _varrequired);
 BA.debugLineNum = 266;BA.debugLine="Sub SetRequired(varRequired As Boolean) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="Input.SetRequired(varRequired)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setrequired" /*RemoteObject*/ ,(Object)(_varrequired));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vminput","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 204;BA.debugLine="Sub SetStyle(sm As Map) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 205;BA.debugLine="Input.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 206;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsuffix(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("SetSuffix (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setsuffix")) { return __ref.runUserSub(false, "vminput","setsuffix", __ref, _s);}
Debug.locals.put("s", _s);
 BA.debugLineNum = 65;BA.debugLine="Sub SetSuffix(s As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="If s = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_s,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 67;BA.debugLine="hasSuffix = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hassuffix" /*RemoteObject*/ ,vminput.__c.getField(true,"True"));
 BA.debugLineNum = 68;BA.debugLine="suffix.SetText(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_suffix" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_s));
 BA.debugLineNum = 69;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vminput","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 315;BA.debugLine="Sub SetTabIndex(ti As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 316;BA.debugLine="Input.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
 BA.debugLineNum = 317;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vminput","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 170;BA.debugLine="Sub SetText(t As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 171;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 172;BA.debugLine="Input.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 173;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settogglepassword(RemoteObject __ref,RemoteObject _vartogglepassword) throws Exception{
try {
		Debug.PushSubsStack("SetTogglePassword (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("settogglepassword")) { return __ref.runUserSub(false, "vminput","settogglepassword", __ref, _vartogglepassword);}
Debug.locals.put("varTogglePassword", _vartogglepassword);
 BA.debugLineNum = 328;BA.debugLine="Sub SetTogglePassword(varTogglePassword As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="If varTogglePassword = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vartogglepassword,vminput.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 330;BA.debugLine="InputInt.SetAttr(CreateMap(\":md-toggle-password\":";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-toggle-password")),(_vartogglepassword)}))));
 BA.debugLineNum = 331;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settype(RemoteObject __ref,RemoteObject _vartype) throws Exception{
try {
		Debug.PushSubsStack("SetType (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("settype")) { return __ref.runUserSub(false, "vminput","settype", __ref, _vartype);}
Debug.locals.put("varType", _vartype);
 BA.debugLineNum = 223;BA.debugLine="Sub SetType(varType As Object) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="SetAttr(CreateMap(\"type\": varType))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),_vartype}))));
 BA.debugLineNum = 225;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 226;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypeemail(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypeEmail (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,235);
if (RapidSub.canDelegate("settypeemail")) { return __ref.runUserSub(false, "vminput","settypeemail", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 235;BA.debugLine="Sub SetTypeEmail(b As Boolean) As VMInput    'igno";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 236;BA.debugLine="SetAttr(CreateMap(\"type\": \"email\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),(RemoteObject.createImmutable("email"))}))));
 BA.debugLineNum = 237;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 238;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypenumber(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypeNumber (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,254);
if (RapidSub.canDelegate("settypenumber")) { return __ref.runUserSub(false, "vminput","settypenumber", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 254;BA.debugLine="Sub SetTypeNumber(b As Boolean) As VMInput    'ign";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 255;BA.debugLine="SetAttr(CreateMap(\"type\": \"number\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),(RemoteObject.createImmutable("number"))}))));
 BA.debugLineNum = 256;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypepassword(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypePassword (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,247);
if (RapidSub.canDelegate("settypepassword")) { return __ref.runUserSub(false, "vminput","settypepassword", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 247;BA.debugLine="Sub SetTypePassword(b As Boolean) As VMInput    'i";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 248;BA.debugLine="SetAttr(CreateMap(\"type\": \"password\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),(RemoteObject.createImmutable("password"))}))));
 BA.debugLineNum = 249;BA.debugLine="InputInt.SetAttr(CreateMap(\"md-has-password\":True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-has-password")),(vminput.__c.getField(true,"True"))}))));
 BA.debugLineNum = 250;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 251;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypetel(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypeTel (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("settypetel")) { return __ref.runUserSub(false, "vminput","settypetel", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 241;BA.debugLine="Sub SetTypeTel(b As Boolean) As VMInput    'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 242;BA.debugLine="SetAttr(CreateMap(\"type\": \"tel\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),(RemoteObject.createImmutable("tel"))}))));
 BA.debugLineNum = 243;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 244;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settypetext(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypeText (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("settypetext")) { return __ref.runUserSub(false, "vminput","settypetext", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 229;BA.debugLine="Sub SetTypeText(b As Boolean) As VMInput    'ignor";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 230;BA.debugLine="SetAttr(CreateMap(\"type\": \"text\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vminput.class, "_setattr" /*RemoteObject*/ ,(Object)(vminput.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("type")),(RemoteObject.createImmutable("text"))}))));
 BA.debugLineNum = 231;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 232;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vminput","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 145;BA.debugLine="Sub SetVIf(vif As Object) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,RemoteObject.createImmutable(("")))) { 
if (true) return (__ref);};
 BA.debugLineNum = 147;BA.debugLine="InputInt.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 148;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 149;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vminput","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 139;BA.debugLine="Sub SetVModel(k As String) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="If k = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_k,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 141;BA.debugLine="Input.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vminput","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 151;BA.debugLine="Sub SetVShow(vif As Object) As VMInput";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,RemoteObject.createImmutable(("")))) { 
if (true) return (__ref);};
 BA.debugLineNum = 153;BA.debugLine="InputInt.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 154;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 155;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vminput) ","vminput",66,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vminput","tostring", __ref);}
 BA.debugLineNum = 100;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="If icon1.hasContent Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_icon1" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 102;BA.debugLine="icon1.Pop(InputInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon1" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 104;BA.debugLine="lbl.Pop(InputInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lbl" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 105;BA.debugLine="If hasPrefix Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasprefix" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 106;BA.debugLine="prefix.Pop(InputInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_prefix" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 108;BA.debugLine="Input.Pop(InputInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_input" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="If hasSuffix Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hassuffix" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 110;BA.debugLine="suffix.Pop(InputInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_suffix" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 112;BA.debugLine="If icon2.hasContent Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_icon2" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 113;BA.debugLine="icon2.Pop(InputInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon2" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 115;BA.debugLine="If hasHelp Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hashelp" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 116;BA.debugLine="ht.Pop(InputInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_ht" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 118;BA.debugLine="If hasError Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_haserror" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 119;BA.debugLine="he.Pop(InputInt.Field)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_he" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_inputint" /*RemoteObject*/ ).getField(false,"_field" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 121;BA.debugLine="Return InputInt.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_inputint" /*RemoteObject*/ ).runClassMethod (b4j.example.vmfield.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 122;BA.debugLine="End Sub";
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