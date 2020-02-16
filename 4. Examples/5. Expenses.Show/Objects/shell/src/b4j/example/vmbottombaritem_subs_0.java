package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmbottombaritem_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmbottombaritem","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 88;BA.debugLine="Sub AddChild(child As VMElement) As VMBottomBarIte";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 90;BA.debugLine="BottomBarItem.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmbottombaritem","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 128;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 130;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombaritem.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 132;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmbottombaritem","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 110;BA.debugLine="Sub AddClass(c As String) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="BottomBarItem.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BottomBarItem As VMElement";
vmbottombaritem._bottombaritem = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_bottombaritem",vmbottombaritem._bottombaritem);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmbottombaritem._id = RemoteObject.createImmutable("");__ref.setField("_id",vmbottombaritem._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmbottombaritem._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmbottombaritem._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmbottombaritem._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmbottombaritem._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmbottombaritem._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmbottombaritem._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmbottombaritem","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="BottomBarItem.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 14;BA.debugLine="BottomBarItem.SetTag(\"md-bottom-bar-item\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-bottom-bar-item")));
 BA.debugLineNum = 15;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 16;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 17;BA.debugLine="BottomBarItem.SetOnClick(module, $\"${ID}_click\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))));
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
		Debug.PushSubsStack("Pop (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmbottombaritem","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 105;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmbottombaritem.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 107;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmbottombaritem","render", __ref);}
 BA.debugLineNum = 83;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmbottombaritem.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 85;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmbottombaritem","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 99;BA.debugLine="Sub SetAccent(b As Boolean) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="BottomBarItem.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmbottombaritem.__c.getField(true,"True")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmbottombaritem","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 116;BA.debugLine="Sub SetAttr(attr As Map) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="BottomBarItem.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setbadge(RemoteObject __ref,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("SetBadge (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("setbadge")) { return __ref.runUserSub(false, "vmbottombaritem","setbadge", __ref, _badge);}
RemoteObject _badgecontent = RemoteObject.createImmutable("");
RemoteObject _i = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 53;BA.debugLine="Sub SetBadge(badge As String) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Dim badgeContent As String = $\"${ID}badgevalue\"$";
Debug.JustUpdateDeviceLine();
_badgecontent = (RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("badgevalue")));Debug.locals.put("badgeContent", _badgecontent);Debug.locals.put("badgeContent", _badgecontent);
 BA.debugLineNum = 55;BA.debugLine="vue.SetStateSingle(badgeContent, badge)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_badgecontent),(Object)((_badge)));
 BA.debugLineNum = 56;BA.debugLine="Dim i As VMElement";
Debug.JustUpdateDeviceLine();
_i = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("i", _i);
 BA.debugLineNum = 57;BA.debugLine="i.Initialize(vue,$\"${ID}badge\"$).SetTag(\"i\").AddC";
Debug.JustUpdateDeviceLine();
_i.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("badge"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("i"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("bottomitembadge"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_badgecontent))),RemoteObject.createImmutable(" }}")))));
 BA.debugLineNum = 58;BA.debugLine="i.Pop(BottomBarItem)";
Debug.JustUpdateDeviceLine();
_i.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_bottombaritem" /*RemoteObject*/ )));
 BA.debugLineNum = 59;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 60;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _vardisabled) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmbottombaritem","setdisabled", __ref, _vardisabled);}
Debug.locals.put("varDisabled", _vardisabled);
 BA.debugLineNum = 163;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMBotto";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="BottomBarItem.SetDisabled(varDisabled)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_vardisabled));
 BA.debugLineNum = 165;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setexact(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetExact (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("setexact")) { return __ref.runUserSub(false, "vmbottombaritem","setexact", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 21;BA.debugLine="Sub SetExact(b As Boolean) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="BottomBarItem.SetExact(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setexact" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _varicon) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmbottombaritem","seticon", __ref, _varicon);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varIcon", _varicon);
 BA.debugLineNum = 155;BA.debugLine="Sub SetIcon(varIcon As Object) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 156;BA.debugLine="Dim pp As String = $\"${ID}icon\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icon")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 157;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)(_varicon));
 BA.debugLineNum = 158;BA.debugLine="SetAttr(CreateMap(\":md-icon\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombaritem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbottombaritem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-icon")),(_pp)}))));
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
public static RemoteObject  _seticon1(RemoteObject __ref,RemoteObject _icn) throws Exception{
try {
		Debug.PushSubsStack("SetIcon1 (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("seticon1")) { return __ref.runUserSub(false, "vmbottombaritem","seticon1", __ref, _icn);}
RemoteObject _icon = RemoteObject.declareNull("b4j.example.vmicon");
Debug.locals.put("icn", _icn);
 BA.debugLineNum = 35;BA.debugLine="Sub SetIcon1(icn As String) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="If icn = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_icn,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 37;BA.debugLine="Dim icon As VMIcon";
Debug.JustUpdateDeviceLine();
_icon = RemoteObject.createNew ("b4j.example.vmicon");Debug.locals.put("icon", _icon);
 BA.debugLineNum = 38;BA.debugLine="icon.Initialize(vue, $\"${ID}icon\"$).SetBottomBarI";
Debug.JustUpdateDeviceLine();
_icon.runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icon"))))).runClassMethod (b4j.example.vmicon.class, "_setbottombaricon" /*RemoteObject*/ ,(Object)(vmbottombaritem.__c.getField(true,"True"))).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_icn));
 BA.debugLineNum = 39;BA.debugLine="icon.Pop(BottomBarItem)";
Debug.JustUpdateDeviceLine();
_icon.runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_bottombaritem" /*RemoteObject*/ )));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _varid) throws Exception{
try {
		Debug.PushSubsStack("SetId (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmbottombaritem","setid", __ref, _varid);}
Debug.locals.put("varId", _varid);
 BA.debugLineNum = 141;BA.debugLine="Sub SetId(varId As Object) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="SetAttr(CreateMap(\"id\": varId))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombaritem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbottombaritem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),_varid}))));
 BA.debugLineNum = 143;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _varlabel) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmbottombaritem","setlabel", __ref, _varlabel);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varLabel", _varlabel);
 BA.debugLineNum = 147;BA.debugLine="Sub SetLabel(varLabel As String) As VMBottomBarIte";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 148;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("label")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 149;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_varlabel)));
 BA.debugLineNum = 150;BA.debugLine="SetAttr(CreateMap(\":md-label\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombaritem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbottombaritem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-label")),(_pp)}))));
 BA.debugLineNum = 151;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabel1(RemoteObject __ref,RemoteObject _label) throws Exception{
try {
		Debug.PushSubsStack("SetLabel1 (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setlabel1")) { return __ref.runUserSub(false, "vmbottombaritem","setlabel1", __ref, _label);}
RemoteObject _pp = RemoteObject.createImmutable("");
RemoteObject _span = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("label", _label);
 BA.debugLineNum = 44;BA.debugLine="Sub SetLabel1(label As String) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("label")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 46;BA.debugLine="vue.SetStateSingle(pp, label)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_label)));
 BA.debugLineNum = 47;BA.debugLine="Dim span As VMElement";
Debug.JustUpdateDeviceLine();
_span = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("span", _span);
 BA.debugLineNum = 48;BA.debugLine="span.Initialize(vue, $\"${ID}label\"$).SetTag(\"span";
Debug.JustUpdateDeviceLine();
_span.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("label"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-bottom-bar-label"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pp))),RemoteObject.createImmutable(" }}")))));
 BA.debugLineNum = 49;BA.debugLine="span.Pop(BottomBarItem)";
Debug.JustUpdateDeviceLine();
_span.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_bottombaritem" /*RemoteObject*/ )));
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
		Debug.PushSubsStack("SetPadding (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmbottombaritem","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 135;BA.debugLine="Sub SetPadding(p As Object) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="BottomBarItem.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
 BA.debugLineNum = 137;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 138;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmbottombaritem","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 94;BA.debugLine="Sub SetPrimary(b As Boolean) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="BottomBarItem.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmbottombaritem.__c.getField(true,"True")));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmbottombaritem","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 122;BA.debugLine="Sub SetStyle(sm As Map) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 123;BA.debugLine="BottomBarItem.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _setsvg(RemoteObject __ref,RemoteObject _src) throws Exception{
try {
		Debug.PushSubsStack("SetSVG (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("setsvg")) { return __ref.runUserSub(false, "vmbottombaritem","setsvg", __ref, _src);}
RemoteObject _icon = RemoteObject.declareNull("b4j.example.vmicon");
Debug.locals.put("src", _src);
 BA.debugLineNum = 27;BA.debugLine="Sub SetSVG(src As String) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="Dim icon As VMIcon";
Debug.JustUpdateDeviceLine();
_icon = RemoteObject.createNew ("b4j.example.vmicon");Debug.locals.put("icon", _icon);
 BA.debugLineNum = 29;BA.debugLine="icon.Initialize(vue, $\"${ID}svg\"$).SetBottomBarIc";
Debug.JustUpdateDeviceLine();
_icon.runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombaritem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("svg"))))).runClassMethod (b4j.example.vmicon.class, "_setbottombaricon" /*RemoteObject*/ ,(Object)(vmbottombaritem.__c.getField(true,"True"))).runClassMethod (b4j.example.vmicon.class, "_setsrc" /*RemoteObject*/ ,(Object)(_src));
 BA.debugLineNum = 30;BA.debugLine="icon.Pop(BottomBarItem)";
Debug.JustUpdateDeviceLine();
_icon.runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_bottombaritem" /*RemoteObject*/ )));
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
public static RemoteObject  _setto(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetTo (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setto")) { return __ref.runUserSub(false, "vmbottombaritem","setto", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 62;BA.debugLine="Sub SetTo(t As String) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="BottomBarItem.SetTo(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setto" /*RemoteObject*/ ,(Object)((_t)));
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
		Debug.PushSubsStack("SetVIf (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmbottombaritem","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 72;BA.debugLine="Sub SetVIf(vif As Object) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="BottomBarItem.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmbottombaritem","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 77;BA.debugLine="Sub SetVShow(vif As Object) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="BottomBarItem.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
		Debug.PushSubsStack("ToString (vmbottombaritem) ","vmbottombaritem",34,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmbottombaritem","tostring", __ref);}
 BA.debugLineNum = 68;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="Return BottomBarItem.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_bottombaritem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 70;BA.debugLine="End Sub";
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