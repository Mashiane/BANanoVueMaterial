package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmspeeddial_subs_0 {


public static RemoteObject  _addbutton(RemoteObject __ref,RemoteObject _btnid,RemoteObject _btnicon) throws Exception{
try {
		Debug.PushSubsStack("AddButton (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("addbutton")) { return __ref.runUserSub(false, "vmspeeddial","addbutton", __ref, _btnid, _btnicon);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("btnID", _btnid);
Debug.locals.put("btnIcon", _btnicon);
 BA.debugLineNum = 60;BA.debugLine="Sub AddButton(btnID As String, btnIcon As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 62;BA.debugLine="btn.Initialize(vue,btnID,module).SetIcon(btnIcon)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_btnid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_btnicon)).runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(vmspeeddial.__c.getField(true,"True")));
 BA.debugLineNum = 63;BA.debugLine="btn.Pop(content)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 64;BA.debugLine="hasButtons = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbuttons" /*RemoteObject*/ ,vmspeeddial.__c.getField(true,"True"));
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
public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmspeeddial","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 86;BA.debugLine="Sub AddChild(child As VMElement) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 88;BA.debugLine="SpeedDial.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmspeeddial","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 123;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 125;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspeeddial.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmspeeddial","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 105;BA.debugLine="Sub AddClass(c As String) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="SpeedDial.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 107;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddToContainer (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmspeeddial","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 237;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmspeeddial.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 239;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public SpeedDial As VMElement";
vmspeeddial._speeddial = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_speeddial",vmspeeddial._speeddial);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmspeeddial._id = RemoteObject.createImmutable("");__ref.setField("_id",vmspeeddial._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmspeeddial._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmspeeddial._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmspeeddial._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmspeeddial._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private target As VMElement";
vmspeeddial._target = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_target",vmspeeddial._target);
 //BA.debugLineNum = 8;BA.debugLine="Private content As VMElement";
vmspeeddial._content = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_content",vmspeeddial._content);
 //BA.debugLineNum = 9;BA.debugLine="Private hasButtons As Boolean";
vmspeeddial._hasbuttons = RemoteObject.createImmutable(false);__ref.setField("_hasbuttons",vmspeeddial._hasbuttons);
 //BA.debugLineNum = 10;BA.debugLine="Private module As Object";
vmspeeddial._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmspeeddial._module);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmspeeddial","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 17;BA.debugLine="SpeedDial.Initialize(v, ID).SetTag(\"md-speed-dial";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-speed-dial")));
 BA.debugLineNum = 18;BA.debugLine="target.Initialize(v,\"\").SetTag(\"md-speed-dial-tar";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_target" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-speed-dial-target"))).runClassMethod (b4j.example.vmelement.class, "_setripple" /*RemoteObject*/ ,(Object)(vmspeeddial.__c.getField(true,"True")));
 BA.debugLineNum = 19;BA.debugLine="content.Initialize(v,\"\").SetTag(\"md-speed-dial-co";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-speed-dial-content")));
 BA.debugLineNum = 20;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 21;BA.debugLine="hasButtons = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbuttons" /*RemoteObject*/ ,vmspeeddial.__c.getField(true,"False"));
 BA.debugLineNum = 22;BA.debugLine="SpeedDial.SetOnClick(eventHandler, $\"${ID}_click\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(_eventhandler),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmspeeddial.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))));
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
		Debug.PushSubsStack("Pop (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmspeeddial","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 99;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmspeeddial.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmspeeddial","render", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmspeeddial.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmspeeddial","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 39;BA.debugLine="Sub SetAccent(b As Boolean) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="target.AddClass(\"md-accent\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_target" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-accent")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmspeeddial","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 111;BA.debugLine="Sub SetAttr(attr As Map) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="SpeedDial.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 113;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 114;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDirection (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("setdirection")) { return __ref.runUserSub(false, "vmspeeddial","setdirection", __ref, _vardirection);}
Debug.locals.put("varDirection", _vardirection);
 BA.debugLineNum = 136;BA.debugLine="Sub SetDirection(varDirection As Object) As VMSpee";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="SpeedDial.Element.SetAttr(\"md-direction\", varDire";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-direction")),(Object)(BA.ObjectToString(_vardirection)));
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
public static RemoteObject  _setdirectionbottom(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDirectionBottom (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setdirectionbottom")) { return __ref.runUserSub(false, "vmspeeddial","setdirectionbottom", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 148;BA.debugLine="Sub SetDirectionBottom(b As Boolean) As VMSpeedDia";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="SpeedDial.Element.SetAttr(\"md-direction\", \"bottom";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-direction")),(Object)(RemoteObject.createImmutable("bottom")));
 BA.debugLineNum = 150;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 151;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDirectionTop (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("setdirectiontop")) { return __ref.runUserSub(false, "vmspeeddial","setdirectiontop", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 142;BA.debugLine="Sub SetDirectionTop(b As Boolean) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="SpeedDial.Element.SetAttr(\"md-direction\", \"top\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-direction")),(Object)(RemoteObject.createImmutable("top")));
 BA.debugLineNum = 144;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 145;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteffect(RemoteObject __ref,RemoteObject _vareffect) throws Exception{
try {
		Debug.PushSubsStack("SetEffect (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,154);
if (RapidSub.canDelegate("seteffect")) { return __ref.runUserSub(false, "vmspeeddial","seteffect", __ref, _vareffect);}
Debug.locals.put("varEffect", _vareffect);
 BA.debugLineNum = 154;BA.debugLine="Sub SetEffect(varEffect As Object) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 155;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", varEffect)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-effect")),(Object)(BA.ObjectToString(_vareffect)));
 BA.debugLineNum = 156;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteffectfling(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetEffectFling (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("seteffectfling")) { return __ref.runUserSub(false, "vmspeeddial","seteffectfling", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 160;BA.debugLine="Sub SetEffectFling(b As Boolean) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", \"fling\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-effect")),(Object)(RemoteObject.createImmutable("fling")));
 BA.debugLineNum = 162;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 163;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteffectopacity(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetEffectOpacity (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("seteffectopacity")) { return __ref.runUserSub(false, "vmspeeddial","seteffectopacity", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 172;BA.debugLine="Sub SetEffectOpacity(b As Boolean) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 173;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", \"opacity\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-effect")),(Object)(RemoteObject.createImmutable("opacity")));
 BA.debugLineNum = 174;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 175;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteffectscale(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetEffectScale (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("seteffectscale")) { return __ref.runUserSub(false, "vmspeeddial","seteffectscale", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 166;BA.debugLine="Sub SetEffectScale(b As Boolean) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 167;BA.debugLine="SpeedDial.Element.SetAttr(\"md-effect\", \"scale\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-effect")),(Object)(RemoteObject.createImmutable("scale")));
 BA.debugLineNum = 168;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 169;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setevent(RemoteObject __ref,RemoteObject _varevent) throws Exception{
try {
		Debug.PushSubsStack("SetEvent (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("setevent")) { return __ref.runUserSub(false, "vmspeeddial","setevent", __ref, _varevent);}
Debug.locals.put("varEvent", _varevent);
 BA.debugLineNum = 178;BA.debugLine="Sub SetEvent(varEvent As Object) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 179;BA.debugLine="SpeedDial.Element.SetAttr(\"md-event\", varEvent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-event")),(Object)(BA.ObjectToString(_varevent)));
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
public static RemoteObject  _seteventclick(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetEventClick (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("seteventclick")) { return __ref.runUserSub(false, "vmspeeddial","seteventclick", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 190;BA.debugLine="Sub SetEventClick(b As Boolean) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="SpeedDial.Element.SetAttr(\"md-event\", \"click\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-event")),(Object)(RemoteObject.createImmutable("click")));
 BA.debugLineNum = 192;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 193;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seteventhover(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetEventHover (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("seteventhover")) { return __ref.runUserSub(false, "vmspeeddial","seteventhover", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 184;BA.debugLine="Sub SetEventHover(b As Boolean) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="SpeedDial.Element.SetAttr(\"md-event\", \"hover\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-event")),(Object)(RemoteObject.createImmutable("hover")));
 BA.debugLineNum = 186;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfinalicon(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("SetFinalIcon (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setfinalicon")) { return __ref.runUserSub(false, "vmspeeddial","setfinalicon", __ref, _i);}
RemoteObject _icn = RemoteObject.declareNull("b4j.example.vmicon");
Debug.locals.put("i", _i);
 BA.debugLineNum = 44;BA.debugLine="Sub SetFinalIcon(i As String) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Dim icn As VMIcon";
Debug.JustUpdateDeviceLine();
_icn = RemoteObject.createNew ("b4j.example.vmicon");Debug.locals.put("icn", _icn);
 BA.debugLineNum = 46;BA.debugLine="icn.Initialize(vue,$\"${ID}finalicon\"$).SetText(i)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmspeeddial.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("finalicon"))))).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_i)).runClassMethod (b4j.example.vmicon.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-morph-final")));
 BA.debugLineNum = 47;BA.debugLine="icn.Pop(target)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmspeeddial","seticon", __ref, _i);}
RemoteObject _icn = RemoteObject.declareNull("b4j.example.vmicon");
Debug.locals.put("i", _i);
 BA.debugLineNum = 52;BA.debugLine="Sub SetIcon(i As String) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="If i = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_i,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 54;BA.debugLine="Dim icn As VMIcon";
Debug.JustUpdateDeviceLine();
_icn = RemoteObject.createNew ("b4j.example.vmicon");Debug.locals.put("icn", _icn);
 BA.debugLineNum = 55;BA.debugLine="icn.Initialize(vue,$\"${ID}icon\"$).SetText(i)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmspeeddial.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icon"))))).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_i));
 BA.debugLineNum = 56;BA.debugLine="icn.Pop(target)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )));
 BA.debugLineNum = 57;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinitialicon(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("SetInitialIcon (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("setinitialicon")) { return __ref.runUserSub(false, "vmspeeddial","setinitialicon", __ref, _i);}
RemoteObject _icn = RemoteObject.declareNull("b4j.example.vmicon");
Debug.locals.put("i", _i);
 BA.debugLineNum = 27;BA.debugLine="Sub SetInitialIcon(i As String) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="Dim icn As VMIcon";
Debug.JustUpdateDeviceLine();
_icn = RemoteObject.createNew ("b4j.example.vmicon");Debug.locals.put("icn", _icn);
 BA.debugLineNum = 29;BA.debugLine="icn.Initialize(vue,$\"${ID}initicon\"$).SetText(i).";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmspeeddial.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("initicon"))))).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_i)).runClassMethod (b4j.example.vmicon.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-morph-initial")));
 BA.debugLineNum = 30;BA.debugLine="icn.Pop(target)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_target" /*RemoteObject*/ )));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmspeeddial","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 130;BA.debugLine="Sub SetPadding(p As Object) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="SpeedDial.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setpositionbottomcenter(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionBottomCenter (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("setpositionbottomcenter")) { return __ref.runUserSub(false, "vmspeeddial","setpositionbottomcenter", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 220;BA.debugLine="Sub SetPositionBottomCenter(b As Boolean) As VMSpe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 221;BA.debugLine="AddClass(\"md-bottom-center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspeeddial.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-bottom-center")));
 BA.debugLineNum = 222;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpositionbottomleft(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionBottomLeft (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("setpositionbottomleft")) { return __ref.runUserSub(false, "vmspeeddial","setpositionbottomleft", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 226;BA.debugLine="Sub SetPositionBottomLeft(b As Boolean) As VMSpeed";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="AddClass(\"md-bottom-left\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspeeddial.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-bottom-left")));
 BA.debugLineNum = 228;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 229;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpositionbottomright(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionBottomRight (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("setpositionbottomright")) { return __ref.runUserSub(false, "vmspeeddial","setpositionbottomright", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 214;BA.debugLine="Sub SetPositionBottomRight(b As Boolean) As VMSpee";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 215;BA.debugLine="AddClass(\"md-bottom-right\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspeeddial.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-bottom-right")));
 BA.debugLineNum = 216;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 217;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpositionfixed(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionFixed (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,232);
if (RapidSub.canDelegate("setpositionfixed")) { return __ref.runUserSub(false, "vmspeeddial","setpositionfixed", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 232;BA.debugLine="Sub SetPositionFixed(b As Boolean) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 233;BA.debugLine="AddClass(\"md-fixed\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspeeddial.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-fixed")));
 BA.debugLineNum = 234;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpositiontopcenter(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionTopCenter (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("setpositiontopcenter")) { return __ref.runUserSub(false, "vmspeeddial","setpositiontopcenter", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 202;BA.debugLine="Sub SetPositionTopCenter(b As Boolean) As VMSpeedD";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="AddClass(\"md-top-center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspeeddial.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-top-center")));
 BA.debugLineNum = 204;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 205;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpositiontopleft(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionTopLeft (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("setpositiontopleft")) { return __ref.runUserSub(false, "vmspeeddial","setpositiontopleft", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 208;BA.debugLine="Sub SetPositionTopLeft(b As Boolean) As VMSpeedDia";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 209;BA.debugLine="AddClass(\"md-top-left\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspeeddial.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-top-left")));
 BA.debugLineNum = 210;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 211;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpositiontopright(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionTopRight (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("setpositiontopright")) { return __ref.runUserSub(false, "vmspeeddial","setpositiontopright", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 196;BA.debugLine="Sub SetPositionTopRight(b As Boolean) As VMSpeedDi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="AddClass(\"md-top-right\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmspeeddial.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-top-right")));
 BA.debugLineNum = 198;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 199;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmspeeddial","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 34;BA.debugLine="Sub SetPrimary(b As Boolean) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="target.AddClass(\"md-primary\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_target" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-primary")));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmspeeddial","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 117;BA.debugLine="Sub SetStyle(sm As Map) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="SpeedDial.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 119;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 120;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmspeeddial","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 93;BA.debugLine="Sub SetText(t As Object) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="SpeedDial.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmspeeddial","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 75;BA.debugLine="Sub SetVModel(k As String) As VMSpeedDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="SpeedDial.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
		Debug.PushSubsStack("ToString (vmspeeddial) ","vmspeeddial",90,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmspeeddial","tostring", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="target.Pop(SpeedDial)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_target" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_speeddial" /*RemoteObject*/ )));
 BA.debugLineNum = 71;BA.debugLine="If hasButtons Then content.Pop(SpeedDial)";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasbuttons" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_speeddial" /*RemoteObject*/ )));};
 BA.debugLineNum = 72;BA.debugLine="Return SpeedDial.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_speeddial" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 73;BA.debugLine="End Sub";
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