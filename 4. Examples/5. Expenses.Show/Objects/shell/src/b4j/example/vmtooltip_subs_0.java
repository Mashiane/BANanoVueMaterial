package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtooltip_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmtooltip","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 55;BA.debugLine="Sub AddChild(child As VMElement) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 57;BA.debugLine="Tooltip.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmtooltip","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 101;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 103;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtooltip.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 105;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtooltip","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 83;BA.debugLine="Sub AddClass(c As String) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="Tooltip.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 85;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 86;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Tooltip As VMElement";
vmtooltip._tooltip = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_tooltip",vmtooltip._tooltip);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtooltip._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtooltip._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtooltip._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtooltip._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmtooltip._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmtooltip._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private bActive As Boolean";
vmtooltip._bactive = RemoteObject.createImmutable(false);__ref.setField("_bactive",vmtooltip._bactive);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtooltip","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="Tooltip.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 14;BA.debugLine="Tooltip.SetTag(\"md-tooltip\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-tooltip")));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="bActive = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmtooltip.__c.getField(true,"False"));
 BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 18;BA.debugLine="SetActiveSync(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtooltip.class, "_setactivesync" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 20;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtooltip","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 78;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtooltip.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtooltip","render", __ref);}
 BA.debugLineNum = 50;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtooltip.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 52;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmtooltip","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 72;BA.debugLine="Sub SetAccent(b As Boolean) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="Tooltip.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmtooltip.__c.getField(true,"True")));
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
public static RemoteObject  _setactive(RemoteObject __ref,RemoteObject _varactive) throws Exception{
try {
		Debug.PushSubsStack("SetActive (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("setactive")) { return __ref.runUserSub(false, "vmtooltip","setactive", __ref, _varactive);}
Debug.locals.put("varActive", _varactive);
 BA.debugLineNum = 150;BA.debugLine="Sub SetActive(varActive As Object) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 151;BA.debugLine="SetAttr(CreateMap(\"md-active\": varActive))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtooltip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtooltip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-active")),_varactive}))));
 BA.debugLineNum = 152;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivesync(RemoteObject __ref,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetActiveSync (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("setactivesync")) { return __ref.runUserSub(false, "vmtooltip","setactivesync", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 23;BA.debugLine="private Sub SetActiveSync(v As String) As VMToolti";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="Tooltip.SetActiveSync(v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setactivesync" /*RemoteObject*/ ,(Object)(_v));
 BA.debugLineNum = 25;BA.debugLine="bActive = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmtooltip.__c.getField(true,"True"));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtooltip","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 89;BA.debugLine="Sub SetAttr(attr As Map) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="Tooltip.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setdelay(RemoteObject __ref,RemoteObject _vardelay) throws Exception{
try {
		Debug.PushSubsStack("SetDelay (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("setdelay")) { return __ref.runUserSub(false, "vmtooltip","setdelay", __ref, _vardelay);}
Debug.locals.put("varDelay", _vardelay);
 BA.debugLineNum = 144;BA.debugLine="Sub SetDelay(varDelay As Object) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="SetAttr(CreateMap(\"md-delay\": varDelay))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtooltip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtooltip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-delay")),_vardelay}))));
 BA.debugLineNum = 146;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 147;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdirection(RemoteObject __ref,RemoteObject _vardirection) throws Exception{
try {
		Debug.PushSubsStack("SetDirection (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setdirection")) { return __ref.runUserSub(false, "vmtooltip","setdirection", __ref, _vardirection);}
Debug.locals.put("varDirection", _vardirection);
 BA.debugLineNum = 114;BA.debugLine="Sub SetDirection(varDirection As Object) As VMTool";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="SetAttr(CreateMap(\"md-direction\": varDirection))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtooltip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtooltip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),_vardirection}))));
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
public static RemoteObject  _setdirectionbottom(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDirectionBottom (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("setdirectionbottom")) { return __ref.runUserSub(false, "vmtooltip","setdirectionbottom", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 132;BA.debugLine="Sub SetDirectionBottom(b As Boolean) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"bottom\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtooltip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtooltip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),(RemoteObject.createImmutable("bottom"))}))));
 BA.debugLineNum = 134;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 135;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdirectionleft(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDirectionLeft (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("setdirectionleft")) { return __ref.runUserSub(false, "vmtooltip","setdirectionleft", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 138;BA.debugLine="Sub SetDirectionLeft(b As Boolean) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 139;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"left\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtooltip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtooltip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),(RemoteObject.createImmutable("left"))}))));
 BA.debugLineNum = 140;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 141;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdirectionright(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDirectionRight (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setdirectionright")) { return __ref.runUserSub(false, "vmtooltip","setdirectionright", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 126;BA.debugLine="Sub SetDirectionRight(b As Boolean) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"right\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtooltip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtooltip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),(RemoteObject.createImmutable("right"))}))));
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
public static RemoteObject  _setdirectiontop(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDirectionTop (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("setdirectiontop")) { return __ref.runUserSub(false, "vmtooltip","setdirectiontop", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 120;BA.debugLine="Sub SetDirectionTop(b As Boolean) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"top\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtooltip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtooltip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),(RemoteObject.createImmutable("top"))}))));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmtooltip","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 108;BA.debugLine="Sub SetPadding(p As Object) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Tooltip.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmtooltip","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 67;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="Tooltip.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmtooltip.__c.getField(true,"True")));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmtooltip","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 95;BA.debugLine="Sub SetStyle(sm As Map) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Tooltip.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtooltip","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 62;BA.debugLine="Sub SetText(t As Object) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="Tooltip.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 64;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmtooltip","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 39;BA.debugLine="Sub SetVIf(vif As Object) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="Tooltip.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 41;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 42;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmtooltip","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 34;BA.debugLine="Sub SetVModel(k As String) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="Tooltip.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtooltip","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 44;BA.debugLine="Sub SetVShow(vif As Object) As VMTooltip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Tooltip.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmtooltip) ","vmtooltip",103,__ref.getField(false, "ba"),__ref,30);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtooltip","tostring", __ref);}
 BA.debugLineNum = 30;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 31;BA.debugLine="Return Tooltip.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tooltip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="End Sub";
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