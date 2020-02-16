package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmbadge_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmbadge","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 101;BA.debugLine="Sub AddChild(child As VMElement) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 103;BA.debugLine="Badge.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmbadge","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 108;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 110;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbadge.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmbadge","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 83;BA.debugLine="Sub AddClass(c As String) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="Badge.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmbadge","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 156;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmbadge.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 158;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Badge As VMElement";
vmbadge._badge = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_badge",vmbadge._badge);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmbadge._id = RemoteObject.createImmutable("");__ref.setField("_id",vmbadge._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmbadge._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmbadge._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmbadge._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmbadge._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private badValue As String";
vmbadge._badvalue = RemoteObject.createImmutable("");__ref.setField("_badvalue",vmbadge._badvalue);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmbadge","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="Badge.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 14;BA.debugLine="Badge.SetTag(\"md-badge\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-badge")));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="badValue = $\"${ID}value\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_badvalue" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmbadge.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("value"))));
 BA.debugLineNum = 17;BA.debugLine="If ID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 18;BA.debugLine="vue.SetStateSingle(badValue,\"0\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_badvalue" /*RemoteObject*/ )),(Object)((RemoteObject.createImmutable("0"))));
 BA.debugLineNum = 19;BA.debugLine="SetAttr(CreateMap(\"v-bind:md-content\": badValue))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbadge.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbadge.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-bind:md-content")),(__ref.getField(true,"_badvalue" /*RemoteObject*/ ))}))));
 };
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
		Debug.PushSubsStack("Pop (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmbadge","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 78;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmbadge.class, "_tostring" /*RemoteObject*/ )));
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
		Debug.PushSubsStack("Render (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmbadge","render", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmbadge.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 69;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmbadge","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 55;BA.debugLine="Sub SetAccent(b As Boolean) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="If b Then Badge.SetAccent(True)";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmbadge.__c.getField(true,"True")));};
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmbadge","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 89;BA.debugLine="Sub SetAttr(attr As Map) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="Badge.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setavatar(RemoteObject __ref,RemoteObject _avtr) throws Exception{
try {
		Debug.PushSubsStack("SetAvatar (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setavatar")) { return __ref.runUserSub(false, "vmbadge","setavatar", __ref, _avtr);}
Debug.locals.put("avtr", _avtr);
 BA.debugLineNum = 40;BA.debugLine="Sub SetAvatar(avtr As VMAvatar) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="avtr.Pop(Badge)";
Debug.JustUpdateDeviceLine();
_avtr.runClassMethod (b4j.example.vmavatar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_badge" /*RemoteObject*/ )));
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
public static RemoteObject  _setbutton(RemoteObject __ref,RemoteObject _btn) throws Exception{
try {
		Debug.PushSubsStack("SetButton (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("setbutton")) { return __ref.runUserSub(false, "vmbadge","setbutton", __ref, _btn);}
Debug.locals.put("btn", _btn);
 BA.debugLineNum = 35;BA.debugLine="Sub SetButton(btn As VMButton) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="btn.Pop(Badge)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_badge" /*RemoteObject*/ )));
 BA.debugLineNum = 37;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcontent(RemoteObject __ref,RemoteObject _varcontent) throws Exception{
try {
		Debug.PushSubsStack("SetContent (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setcontent")) { return __ref.runUserSub(false, "vmbadge","setcontent", __ref, _varcontent);}
Debug.locals.put("varContent", _varcontent);
 BA.debugLineNum = 121;BA.debugLine="Sub SetContent(varContent As Int) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="vue.SetStateSingle(badValue,varContent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_badvalue" /*RemoteObject*/ )),(Object)((_varcontent)));
 BA.debugLineNum = 123;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 124;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdense(RemoteObject __ref,RemoteObject _vardense) throws Exception{
try {
		Debug.PushSubsStack("SetDense (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setdense")) { return __ref.runUserSub(false, "vmbadge","setdense", __ref, _vardense);}
Debug.locals.put("varDense", _vardense);
 BA.debugLineNum = 145;BA.debugLine="Sub SetDense(varDense As Boolean) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="If varDense Then SetAttr(CreateMap(\":md-dense\": v";
Debug.JustUpdateDeviceLine();
if (_vardense.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmbadge.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbadge.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-dense")),(_vardense)}))));};
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmbadge","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 24;BA.debugLine="Sub SetDisabled(b As Boolean) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="Badge.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmbadge","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 115;BA.debugLine="Sub SetPadding(p As Object) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="Badge.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 117;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setposition(RemoteObject __ref,RemoteObject _varposition) throws Exception{
try {
		Debug.PushSubsStack("SetPosition (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,127);
if (RapidSub.canDelegate("setposition")) { return __ref.runUserSub(false, "vmbadge","setposition", __ref, _varposition);}
Debug.locals.put("varPosition", _varposition);
 BA.debugLineNum = 127;BA.debugLine="Sub SetPosition(varPosition As Object) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 128;BA.debugLine="SetAttr(CreateMap(\"md-position\": varPosition))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbadge.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbadge.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-position")),_varposition}))));
 BA.debugLineNum = 129;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 130;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpositionbottom(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionBottom (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setpositionbottom")) { return __ref.runUserSub(false, "vmbadge","setpositionbottom", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 139;BA.debugLine="Sub SetPositionBottom(b As Boolean) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="SetAttr(CreateMap(\"md-position\": \"bottom\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbadge.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbadge.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-position")),(RemoteObject.createImmutable("bottom"))}))));
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
public static RemoteObject  _setpositiontop(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPositionTop (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("setpositiontop")) { return __ref.runUserSub(false, "vmbadge","setpositiontop", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 133;BA.debugLine="Sub SetPositionTop(b As Boolean) As VMBadge    'ig";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="SetAttr(CreateMap(\"md-position\": \"top\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbadge.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbadge.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-position")),(RemoteObject.createImmutable("top"))}))));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmbadge","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 50;BA.debugLine="Sub SetPrimary(b As Boolean) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="If b Then Badge.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmbadge.__c.getField(true,"True")));};
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
public static RemoteObject  _setsquare(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSquare (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("setsquare")) { return __ref.runUserSub(false, "vmbadge","setsquare", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 151;BA.debugLine="Sub SetSquare(b As Boolean) As VMBadge    'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="If b = True Then AddClass(\"md-square\")";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbadge.__c.getField(true,"True"))) { 
__ref.runClassMethod (b4j.example.vmbadge.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-square")));};
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmbadge","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 95;BA.debugLine="Sub SetStyle(sm As Map) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Badge.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
		Debug.PushSubsStack("SetText (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmbadge","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 72;BA.debugLine="Sub SetText(t As Object) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="Badge.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmbadge","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 61;BA.debugLine="Sub SetVModel(k As String) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="Badge.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmbadge","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 29;BA.debugLine="Sub SetVShow(vif As String) As VMBadge";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 31;BA.debugLine="Badge.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 32;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 33;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmbadge) ","vmbadge",32,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmbadge","tostring", __ref);}
 BA.debugLineNum = 46;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="Return Badge.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 48;BA.debugLine="End Sub";
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