package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmsteppers_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmsteppers","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 115;BA.debugLine="Sub AddChild(child As VMElement) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 117;BA.debugLine="Steppers.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmsteppers","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 151;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 153;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 155;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmsteppers","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 133;BA.debugLine="Sub AddClass(c As String) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="Steppers.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addstep(RemoteObject __ref,RemoteObject _stepid,RemoteObject _steplabel,RemoteObject _stepdescription,RemoteObject _stepeditable,RemoteObject _stepcontent) throws Exception{
try {
		Debug.PushSubsStack("AddStep (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("addstep")) { return __ref.runUserSub(false, "vmsteppers","addstep", __ref, _stepid, _steplabel, _stepdescription, _stepeditable, _stepcontent);}
RemoteObject _stepitem = RemoteObject.declareNull("b4j.example.vmstepitem");
Debug.locals.put("stepID", _stepid);
Debug.locals.put("stepLabel", _steplabel);
Debug.locals.put("stepDescription", _stepdescription);
Debug.locals.put("stepEditable", _stepeditable);
Debug.locals.put("stepContent", _stepcontent);
 BA.debugLineNum = 39;BA.debugLine="Sub AddStep(stepID As String, stepLabel As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 41;BA.debugLine="steps.put(stepID, stepID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steps" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_stepid)),(Object)((_stepid)));
 BA.debugLineNum = 42;BA.debugLine="Dim stepitem As VMStepItem";
Debug.JustUpdateDeviceLine();
_stepitem = RemoteObject.createNew ("b4j.example.vmstepitem");Debug.locals.put("stepitem", _stepitem);
 BA.debugLineNum = 43;BA.debugLine="stepitem.Initialize(vue, stepID, module)";
Debug.JustUpdateDeviceLine();
_stepitem.runClassMethod (b4j.example.vmstepitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_stepid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="stepitem.SetLabel(stepLabel)";
Debug.JustUpdateDeviceLine();
_stepitem.runClassMethod (b4j.example.vmstepitem.class, "_setlabel" /*RemoteObject*/ ,(Object)(_steplabel));
 BA.debugLineNum = 45;BA.debugLine="If stepContent <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_stepcontent)) { 
 BA.debugLineNum = 46;BA.debugLine="stepitem.SetContent(stepContent)";
Debug.JustUpdateDeviceLine();
_stepitem.runClassMethod (b4j.example.vmstepitem.class, "_setcontent" /*RemoteObject*/ ,(Object)(_stepcontent));
 };
 BA.debugLineNum = 48;BA.debugLine="stepitem.SetDescription(stepDescription)";
Debug.JustUpdateDeviceLine();
_stepitem.runClassMethod (b4j.example.vmstepitem.class, "_setdescription" /*RemoteObject*/ ,(Object)((_stepdescription)));
 BA.debugLineNum = 49;BA.debugLine="stepitem.SetEditable(stepEditable)";
Debug.JustUpdateDeviceLine();
_stepitem.runClassMethod (b4j.example.vmstepitem.class, "_seteditable" /*RemoteObject*/ ,(Object)(_stepeditable));
 BA.debugLineNum = 50;BA.debugLine="stepitem.Pop(Steppers)";
Debug.JustUpdateDeviceLine();
_stepitem.runClassMethod (b4j.example.vmstepitem.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_steppers" /*RemoteObject*/ )));
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmsteppers","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 239;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 240;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmsteppers.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 241;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Steppers As VMElement";
vmsteppers._steppers = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_steppers",vmsteppers._steppers);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmsteppers._id = RemoteObject.createImmutable("");__ref.setField("_id",vmsteppers._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmsteppers._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmsteppers._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmsteppers._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmsteppers._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private actKey As String";
vmsteppers._actkey = RemoteObject.createImmutable("");__ref.setField("_actkey",vmsteppers._actkey);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmsteppers._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmsteppers._module);
 //BA.debugLineNum = 9;BA.debugLine="Private steps As Map";
vmsteppers._steps = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_steps",vmsteppers._steps);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hidestep(RemoteObject __ref,RemoteObject _stepid) throws Exception{
try {
		Debug.PushSubsStack("HideStep (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("hidestep")) { return __ref.runUserSub(false, "vmsteppers","hidestep", __ref, _stepid);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 80;BA.debugLine="Sub HideStep(stepID As String) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 82;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsteppers.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("show")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 83;BA.debugLine="vue.SetStateSingle(stepShow, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((vmsteppers.__c.getField(true,"False"))));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmsteppers","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 15;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 16;BA.debugLine="Steppers.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 17;BA.debugLine="Steppers.SetTag(\"md-steppers\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-steppers")));
 BA.debugLineNum = 18;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 19;BA.debugLine="actKey = $\"${ID}active\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_actkey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmsteppers.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("active"))));
 BA.debugLineNum = 20;BA.debugLine="SetOnChanged";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setonchanged" /*RemoteObject*/ );
 BA.debugLineNum = 21;BA.debugLine="SetActiveStepSync";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setactivestepsync" /*RemoteObject*/ );
 BA.debugLineNum = 22;BA.debugLine="steps.initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steps" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 23;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 24;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmsteppers","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 128;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmsteppers.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 130;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmsteppers","render", __ref);}
 BA.debugLineNum = 110;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmsteppers.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 112;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivestepsync(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetActiveStepSync (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("setactivestepsync")) { return __ref.runUserSub(false, "vmsteppers","setactivestepsync", __ref);}
 BA.debugLineNum = 32;BA.debugLine="private Sub SetActiveStepSync As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="vue.SetStateSingle(actKey, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_actkey" /*RemoteObject*/ )),(Object)(vmsteppers.__c.getField(false,"Null")));
 BA.debugLineNum = 34;BA.debugLine="SetAttr(CreateMap(\":md-active-step.sync\": actKey)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsteppers.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-active-step.sync")),(__ref.getField(true,"_actkey" /*RemoteObject*/ ))}))));
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
public static RemoteObject  _setalternative(RemoteObject __ref,RemoteObject _varalternative) throws Exception{
try {
		Debug.PushSubsStack("SetAlternative (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("setalternative")) { return __ref.runUserSub(false, "vmsteppers","setalternative", __ref, _varalternative);}
Debug.locals.put("varAlternative", _varalternative);
 BA.debugLineNum = 203;BA.debugLine="Sub SetAlternative(varAlternative As Boolean) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 204;BA.debugLine="SetAttr(CreateMap(\":md-alternative\": varAlternati";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsteppers.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-alternative")),(_varalternative)}))));
 BA.debugLineNum = 205;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 206;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmsteppers","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 139;BA.debugLine="Sub SetAttr(attr As Map) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="Steppers.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 141;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdynamicheight(RemoteObject __ref,RemoteObject _vardynamicheight) throws Exception{
try {
		Debug.PushSubsStack("SetDynamicHeight (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,221);
if (RapidSub.canDelegate("setdynamicheight")) { return __ref.runUserSub(false, "vmsteppers","setdynamicheight", __ref, _vardynamicheight);}
Debug.locals.put("varDynamicHeight", _vardynamicheight);
 BA.debugLineNum = 221;BA.debugLine="Sub SetDynamicHeight(varDynamicHeight As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 222;BA.debugLine="SetAttr(CreateMap(\":md-dynamic-height\": varDynami";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsteppers.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-dynamic-height")),(_vardynamicheight)}))));
 BA.debugLineNum = 223;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 224;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetElevation (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmsteppers","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 53;BA.debugLine="Sub SetElevation(e As Int) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Steppers.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
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
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _mdlname) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmsteppers","setkey", __ref, _mdlname);}
Debug.locals.put("mdlName", _mdlname);
 BA.debugLineNum = 26;BA.debugLine="Sub SetKey(mdlName As String) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="mdlName = mdlName.tolowercase";
Debug.JustUpdateDeviceLine();
_mdlname = _mdlname.runMethod(true,"toLowerCase");Debug.locals.put("mdlName", _mdlname);
 BA.debugLineNum = 28;BA.debugLine="SetAttr(CreateMap(\":key\": mdlName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsteppers.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":key")),(_mdlname)}))));
 BA.debugLineNum = 29;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlinear(RemoteObject __ref,RemoteObject _varlinear) throws Exception{
try {
		Debug.PushSubsStack("SetLinear (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,215);
if (RapidSub.canDelegate("setlinear")) { return __ref.runUserSub(false, "vmsteppers","setlinear", __ref, _varlinear);}
Debug.locals.put("varLinear", _varlinear);
 BA.debugLineNum = 215;BA.debugLine="Sub SetLinear(varLinear As Boolean) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 216;BA.debugLine="SetAttr(CreateMap(\":md-linear\": varLinear))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsteppers.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-linear")),(_varlinear)}))));
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
public static RemoteObject  _setmargin(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetMargin (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "vmsteppers","setmargin", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 164;BA.debugLine="Sub SetMargin(p As Object) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="Steppers.SetMarginAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmarginall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setonchanged(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnChanged (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,227);
if (RapidSub.canDelegate("setonchanged")) { return __ref.runUserSub(false, "vmsteppers","setonchanged", __ref);}
RemoteObject _stepid = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 227;BA.debugLine="private Sub SetOnChanged As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 228;BA.debugLine="Dim stepID As String = \"\"";
Debug.JustUpdateDeviceLine();
_stepid = BA.ObjectToString("");Debug.locals.put("stepID", _stepid);Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 229;BA.debugLine="Dim methodName As String  = $\"${ID}_change\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsteppers.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_change")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 230;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmsteppers.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmsteppers.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 231;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmsteppers.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_stepid)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 232;BA.debugLine="SetAttr(CreateMap(\"v-on:md-changed\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsteppers.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-changed")),(_methodname)}))));
 BA.debugLineNum = 234;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 235;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 236;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmsteppers","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 158;BA.debugLine="Sub SetPadding(p As Object) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="Steppers.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 160;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 161;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstepactive(RemoteObject __ref,RemoteObject _varactivestep) throws Exception{
try {
		Debug.PushSubsStack("SetStepActive (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("setstepactive")) { return __ref.runUserSub(false, "vmsteppers","setstepactive", __ref, _varactivestep);}
RemoteObject _stepa = RemoteObject.createImmutable("");
Debug.locals.put("varActiveStep", _varactivestep);
 BA.debugLineNum = 184;BA.debugLine="Sub SetStepActive(varActiveStep As String) As VMSt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="varActiveStep = varActiveStep.tolowercase";
Debug.JustUpdateDeviceLine();
_varactivestep = _varactivestep.runMethod(true,"toLowerCase");Debug.locals.put("varActiveStep", _varactivestep);
 BA.debugLineNum = 186;BA.debugLine="vue.SetStateSingle(actKey, varActiveStep)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_actkey" /*RemoteObject*/ )),(Object)((_varactivestep)));
 BA.debugLineNum = 187;BA.debugLine="for each stepa as string in steps.keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = __ref.getField(false,"_steps" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_stepa = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("stepa", _stepa);
Debug.locals.put("stepa", _stepa);
 BA.debugLineNum = 188;BA.debugLine="if stepa = varactivestep then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_stepa,_varactivestep)) { 
 }else {
 BA.debugLineNum = 190;BA.debugLine="SetStepDone(stepa, false)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setstepdone" /*RemoteObject*/ ,(Object)(_stepa),(Object)(vmsteppers.__c.getField(true,"False")));
 };
 }
}Debug.locals.put("stepa", _stepa);
;
 BA.debugLineNum = 193;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 194;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstepdescription(RemoteObject __ref,RemoteObject _stepid,RemoteObject _stepeditable) throws Exception{
try {
		Debug.PushSubsStack("SetStepDescription (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setstepdescription")) { return __ref.runUserSub(false, "vmsteppers","setstepdescription", __ref, _stepid, _stepeditable);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
Debug.locals.put("stepEditable", _stepeditable);
 BA.debugLineNum = 66;BA.debugLine="Sub SetStepDescription(stepID As String, stepEdita";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 68;BA.debugLine="Dim stepShow As String = $\"${stepID}description\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsteppers.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("description")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 69;BA.debugLine="vue.SetStateSingle(stepShow, stepEditable)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((_stepeditable)));
 BA.debugLineNum = 70;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 71;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstepdone(RemoteObject __ref,RemoteObject _stepdone,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStepDone (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("setstepdone")) { return __ref.runUserSub(false, "vmsteppers","setstepdone", __ref, _stepdone, _b);}
RemoteObject _dd = RemoteObject.createImmutable("");
Debug.locals.put("stepDone", _stepdone);
Debug.locals.put("b", _b);
 BA.debugLineNum = 176;BA.debugLine="Sub SetStepDone(stepDone As String, b As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="stepDone = stepDone.tolowercase";
Debug.JustUpdateDeviceLine();
_stepdone = _stepdone.runMethod(true,"toLowerCase");Debug.locals.put("stepDone", _stepdone);
 BA.debugLineNum = 178;BA.debugLine="Dim dd As String = $\"${stepDone}done\"$";
Debug.JustUpdateDeviceLine();
_dd = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsteppers.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepdone))),RemoteObject.createImmutable("done")));Debug.locals.put("dd", _dd);Debug.locals.put("dd", _dd);
 BA.debugLineNum = 179;BA.debugLine="vue.SetStateSingle(dd, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_dd),(Object)((_b)));
 BA.debugLineNum = 180;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 181;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstepeditable(RemoteObject __ref,RemoteObject _stepid,RemoteObject _stepeditable) throws Exception{
try {
		Debug.PushSubsStack("SetStepEditable (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setstepeditable")) { return __ref.runUserSub(false, "vmsteppers","setstepeditable", __ref, _stepid, _stepeditable);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
Debug.locals.put("stepEditable", _stepeditable);
 BA.debugLineNum = 59;BA.debugLine="Sub SetStepEditable(stepID As String, stepEditable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 61;BA.debugLine="Dim stepShow As String = $\"${stepID}editable\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsteppers.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("editable")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 62;BA.debugLine="vue.SetStateSingle(stepShow, stepEditable)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((_stepeditable)));
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
public static RemoteObject  _setsteperror(RemoteObject __ref,RemoteObject _stepid,RemoteObject _steperror) throws Exception{
try {
		Debug.PushSubsStack("SetStepError (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("setsteperror")) { return __ref.runUserSub(false, "vmsteppers","setsteperror", __ref, _stepid, _steperror);}
RemoteObject _dd = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
Debug.locals.put("stepError", _steperror);
 BA.debugLineNum = 169;BA.debugLine="Sub SetStepError(stepID As String, stepError As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 171;BA.debugLine="Dim dd As String = $\"${stepID}error\"$";
Debug.JustUpdateDeviceLine();
_dd = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsteppers.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("error")));Debug.locals.put("dd", _dd);Debug.locals.put("dd", _dd);
 BA.debugLineNum = 172;BA.debugLine="vue.SetStateSingle(dd, stepError)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_dd),(Object)((_steperror)));
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
public static RemoteObject  _setsteplabel(RemoteObject __ref,RemoteObject _stepid,RemoteObject _steplabel) throws Exception{
try {
		Debug.PushSubsStack("SetStepLabel (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setsteplabel")) { return __ref.runUserSub(false, "vmsteppers","setsteplabel", __ref, _stepid, _steplabel);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
Debug.locals.put("stepLabel", _steplabel);
 BA.debugLineNum = 73;BA.debugLine="Sub SetStepLabel(stepID As String, stepLabel As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 75;BA.debugLine="Dim stepShow As String = $\"${stepID}label\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsteppers.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("label")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 76;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((_steplabel)));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmsteppers","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 145;BA.debugLine="Sub SetStyle(sm As Map) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Steppers.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 147;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 148;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsyncroute(RemoteObject __ref,RemoteObject _varsyncroute) throws Exception{
try {
		Debug.PushSubsStack("SetSyncRoute (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("setsyncroute")) { return __ref.runUserSub(false, "vmsteppers","setsyncroute", __ref, _varsyncroute);}
Debug.locals.put("varSyncRoute", _varsyncroute);
 BA.debugLineNum = 197;BA.debugLine="Sub SetSyncRoute(varSyncRoute As Boolean) As VMSte";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="SetAttr(CreateMap(\":md-sync-route\": varSyncRoute)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsteppers.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-sync-route")),(_varsyncroute)}))));
 BA.debugLineNum = 199;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 200;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmsteppers","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 122;BA.debugLine="Sub SetText(t As Object) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 123;BA.debugLine="Steppers.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _setvertical(RemoteObject __ref,RemoteObject _varvertical) throws Exception{
try {
		Debug.PushSubsStack("SetVertical (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("setvertical")) { return __ref.runUserSub(false, "vmsteppers","setvertical", __ref, _varvertical);}
Debug.locals.put("varVertical", _varvertical);
 BA.debugLineNum = 209;BA.debugLine="Sub SetVertical(varVertical As Boolean) As VMStepp";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 210;BA.debugLine="SetAttr(CreateMap(\":md-vertical\": varVertical))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmsteppers.class, "_setattr" /*RemoteObject*/ ,(Object)(vmsteppers.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-vertical")),(_varvertical)}))));
 BA.debugLineNum = 211;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 212;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmsteppers","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 99;BA.debugLine="Sub SetVIf(vif As Object) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="Steppers.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmsteppers","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 104;BA.debugLine="Sub SetVShow(vif As Object) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="Steppers.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _showstep(RemoteObject __ref,RemoteObject _stepid) throws Exception{
try {
		Debug.PushSubsStack("ShowStep (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("showstep")) { return __ref.runUserSub(false, "vmsteppers","showstep", __ref, _stepid);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 87;BA.debugLine="Sub ShowStep(stepID As String) As VMSteppers";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 89;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmsteppers.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("show")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 90;BA.debugLine="vue.SetStateSingle(stepShow, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((vmsteppers.__c.getField(true,"True"))));
 BA.debugLineNum = 91;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmsteppers) ","vmsteppers",93,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmsteppers","tostring", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Return Steppers.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_steppers" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 97;BA.debugLine="End Sub";
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