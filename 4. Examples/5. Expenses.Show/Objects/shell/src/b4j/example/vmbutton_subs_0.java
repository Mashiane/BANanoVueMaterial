package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmbutton_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmbutton","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 178;BA.debugLine="Sub AddClass(c As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 179;BA.debugLine="Button.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,310);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmbutton","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 310;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 311;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmbutton.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Button As VMElement";
vmbutton._button = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_button",vmbutton._button);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmbutton._id = RemoteObject.createImmutable("");__ref.setField("_id",vmbutton._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmbutton._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmbutton._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private hasBadge As Boolean";
vmbutton._hasbadge = RemoteObject.createImmutable(false);__ref.setField("_hasbadge",vmbutton._hasbadge);
 //BA.debugLineNum = 7;BA.debugLine="Private badge As VMBadge";
vmbutton._badge = RemoteObject.createNew ("b4j.example.vmbadge");__ref.setField("_badge",vmbutton._badge);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmbutton","hide", __ref);}
 BA.debugLineNum = 27;BA.debugLine="Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="Button.hide";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_hide" /*RemoteObject*/ );
 BA.debugLineNum = 29;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,10);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmbutton","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 10;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 11;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 12;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 13;BA.debugLine="Button.Initialize(vue, ID).SetTag(\"md-button\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-button")));
 BA.debugLineNum = 14;BA.debugLine="If ID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 15;BA.debugLine="hasBadge = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmbutton.__c.getField(true,"False"));
 BA.debugLineNum = 16;BA.debugLine="badge.Initialize(vue, $\"${ID}badge\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbutton.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("badge")))));
 };
 BA.debugLineNum = 18;BA.debugLine="Button.SetOnClick(eventHandler, $\"${ID}_click\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(_eventhandler),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbutton.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))));
 BA.debugLineNum = 19;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 20;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,305);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmbutton","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 305;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 306;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmbutton.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 307;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeattr(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("RemoveAttr (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("removeattr")) { return __ref.runUserSub(false, "vmbutton","removeattr", __ref, _sname);}
Debug.locals.put("sName", _sname);
 BA.debugLineNum = 22;BA.debugLine="public Sub RemoveAttr(sName As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="Button.RemoveAttr(sName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(_sname));
 BA.debugLineNum = 24;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 25;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmbutton","render", __ref);}
 BA.debugLineNum = 301;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmbutton.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 303;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,223);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmbutton","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 223;BA.debugLine="Sub SetAccent(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 224;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 225;BA.debugLine="Button.SetAccent(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 226;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 227;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmbutton","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 184;BA.debugLine="Sub SetAttr(attr As Map) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="Button.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setbadgeaccent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeAccent (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("setbadgeaccent")) { return __ref.runUserSub(false, "vmbutton","setbadgeaccent", __ref);}
 BA.debugLineNum = 102;BA.debugLine="Sub SetBadgeAccent As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="badge.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmbutton.__c.getField(true,"True")));
 BA.debugLineNum = 104;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmbutton.__c.getField(true,"True"));
 BA.debugLineNum = 105;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbadgecontent(RemoteObject __ref,RemoteObject _counted) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeContent (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setbadgecontent")) { return __ref.runUserSub(false, "vmbutton","setbadgecontent", __ref, _counted);}
Debug.locals.put("counted", _counted);
 BA.debugLineNum = 90;BA.debugLine="Sub SetBadgeContent(counted As Int) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="badge.SetContent(counted)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setcontent" /*RemoteObject*/ ,(Object)(_counted));
 BA.debugLineNum = 92;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmbutton.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgedense(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeDense (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("setbadgedense")) { return __ref.runUserSub(false, "vmbutton","setbadgedense", __ref);}
 BA.debugLineNum = 120;BA.debugLine="Sub SetBadgeDense As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="badge.SetDense(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setdense" /*RemoteObject*/ ,(Object)(vmbutton.__c.getField(true,"True")));
 BA.debugLineNum = 122;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmbutton.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgeonbottom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeOnBottom (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setbadgeonbottom")) { return __ref.runUserSub(false, "vmbutton","setbadgeonbottom", __ref);}
 BA.debugLineNum = 114;BA.debugLine="Sub SetBadgeOnBottom As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="badge.SetPositionBottom(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setpositionbottom" /*RemoteObject*/ ,(Object)(vmbutton.__c.getField(true,"True")));
 BA.debugLineNum = 116;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmbutton.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgeontop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeOnTop (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setbadgeontop")) { return __ref.runUserSub(false, "vmbutton","setbadgeontop", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Sub SetBadgeOnTop As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="badge.SetPositionTop(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setpositiontop" /*RemoteObject*/ ,(Object)(vmbutton.__c.getField(true,"True")));
 BA.debugLineNum = 110;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmbutton.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgeprimary(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgePrimary (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setbadgeprimary")) { return __ref.runUserSub(false, "vmbutton","setbadgeprimary", __ref);}
 BA.debugLineNum = 96;BA.debugLine="Sub SetBadgePrimary As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="badge.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmbutton.__c.getField(true,"True")));
 BA.debugLineNum = 98;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmbutton.__c.getField(true,"True"));
 BA.debugLineNum = 99;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 100;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbadgesquare(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeSquare (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setbadgesquare")) { return __ref.runUserSub(false, "vmbutton","setbadgesquare", __ref);}
 BA.debugLineNum = 126;BA.debugLine="Sub SetBadgeSquare As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="badge.SetSquare(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setsquare" /*RemoteObject*/ ,(Object)(vmbutton.__c.getField(true,"True")));
 BA.debugLineNum = 128;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmbutton.__c.getField(true,"True"));
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
public static RemoteObject  _setdense(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDense (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("setdense")) { return __ref.runUserSub(false, "vmbutton","setdense", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 200;BA.debugLine="Sub SetDense(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 201;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 202;BA.debugLine="Button.SetDense(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdense" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 203;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 204;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmbutton","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 189;BA.debugLine="Sub SetDisabled(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 190;BA.debugLine="Button.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 191;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfab(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetFab (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("setfab")) { return __ref.runUserSub(false, "vmbutton","setfab", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 42;BA.debugLine="Sub SetFab(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 44;BA.debugLine="Button.AddClass(\"md-fab\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-fab")));
 BA.debugLineNum = 45;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfabfixed(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetFabFixed (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("setfabfixed")) { return __ref.runUserSub(false, "vmbutton","setfabfixed", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 36;BA.debugLine="Sub SetFabFixed(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 38;BA.debugLine="Button.AddClass(\"md-fixed\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-fixed")));
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
public static RemoteObject  _setfabposition(RemoteObject __ref,RemoteObject _pos) throws Exception{
try {
		Debug.PushSubsStack("SetFabPosition (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setfabposition")) { return __ref.runUserSub(false, "vmbutton","setfabposition", __ref, _pos);}
Debug.locals.put("pos", _pos);
 BA.debugLineNum = 48;BA.debugLine="Sub SetFabPosition(pos As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="If pos = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_pos,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 50;BA.debugLine="Button.AddClass(pos)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_pos));
 BA.debugLineNum = 51;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfabpositionbottomcenter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetFabPositionBottomCenter (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setfabpositionbottomcenter")) { return __ref.runUserSub(false, "vmbutton","setfabpositionbottomcenter", __ref);}
 BA.debugLineNum = 74;BA.debugLine="Sub SetFabPositionBottomCenter As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="SetFabPosition(\"md-fab-bottom-center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbutton.class, "_setfabposition" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-fab-bottom-center")));
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
public static RemoteObject  _setfabpositionbottomleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetFabPositionBottomLeft (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("setfabpositionbottomleft")) { return __ref.runUserSub(false, "vmbutton","setfabpositionbottomleft", __ref);}
 BA.debugLineNum = 79;BA.debugLine="Sub SetFabPositionBottomLeft As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="SetFabPosition(\"md-fab-bottom-left\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbutton.class, "_setfabposition" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-fab-bottom-left")));
 BA.debugLineNum = 81;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfabpositionbottomright(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetFabPositionBottomRight (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("setfabpositionbottomright")) { return __ref.runUserSub(false, "vmbutton","setfabpositionbottomright", __ref);}
 BA.debugLineNum = 69;BA.debugLine="Sub SetFabPositionBottomRight As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="SetFabPosition(\"md-fab-bottom-right\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbutton.class, "_setfabposition" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-fab-bottom-right")));
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
public static RemoteObject  _setfabpositiontopcenter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetFabPositionTopCenter (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setfabpositiontopcenter")) { return __ref.runUserSub(false, "vmbutton","setfabpositiontopcenter", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Sub SetFabPositionTopCenter As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="SetFabPosition(\"md-fab-top-center\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbutton.class, "_setfabposition" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-fab-top-center")));
 BA.debugLineNum = 61;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfabpositiontopleft(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetFabPositionTopLeft (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("setfabpositiontopleft")) { return __ref.runUserSub(false, "vmbutton","setfabpositiontopleft", __ref);}
 BA.debugLineNum = 64;BA.debugLine="Sub SetFabPositionTopLeft As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="SetFabPosition(\"md-fab-top-left\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbutton.class, "_setfabposition" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-fab-top-left")));
 BA.debugLineNum = 66;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 67;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfabpositiontopright(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetFabPositionTopRight (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setfabpositiontopright")) { return __ref.runUserSub(false, "vmbutton","setfabpositiontopright", __ref);}
 BA.debugLineNum = 54;BA.debugLine="Sub SetFabPositionTopRight As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="SetFabPosition(\"md-fab-top-right\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbutton.class, "_setfabposition" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-fab-top-right")));
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
public static RemoteObject  _sethref(RemoteObject __ref,RemoteObject _h,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetHREF (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("sethref")) { return __ref.runUserSub(false, "vmbutton","sethref", __ref, _h, _bind);}
Debug.locals.put("h", _h);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 240;BA.debugLine="Sub SetHREF(h As String, bind As Boolean) As VMBut";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 241;BA.debugLine="If h = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_h,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 242;BA.debugLine="If bind = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bind,vmbutton.__c.getField(true,"True"))) { 
 BA.debugLineNum = 243;BA.debugLine="h = h.tolowercase";
Debug.JustUpdateDeviceLine();
_h = _h.runMethod(true,"toLowerCase");Debug.locals.put("h", _h);
 BA.debugLineNum = 244;BA.debugLine="SetAttr(CreateMap(\":href\":h))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbutton.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbutton.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":href")),(_h)}))));
 }else {
 BA.debugLineNum = 246;BA.debugLine="Button.sethref(h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethref" /*RemoteObject*/ ,(Object)(_h));
 };
 BA.debugLineNum = 248;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 249;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _icn) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,269);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmbutton","seticon", __ref, _icn);}
RemoteObject _icon = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("icn", _icn);
 BA.debugLineNum = 269;BA.debugLine="Sub SetIcon(icn As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 270;BA.debugLine="If icn = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_icn,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 271;BA.debugLine="Dim icon As VMElement";
Debug.JustUpdateDeviceLine();
_icon = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("icon", _icon);
 BA.debugLineNum = 272;BA.debugLine="icon.Initialize(vue,$\"${ID}icn\"$).SetTagIcon(True";
Debug.JustUpdateDeviceLine();
_icon.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbutton.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icn"))))).runClassMethod (b4j.example.vmelement.class, "_settagicon" /*RemoteObject*/ ,(Object)(vmbutton.__c.getField(true,"True"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_icn));
 BA.debugLineNum = 273;BA.debugLine="icon.Pop(Button)";
Debug.JustUpdateDeviceLine();
_icon.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_button" /*RemoteObject*/ )));
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
public static RemoteObject  _seticonbutton(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetIconButton (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("seticonbutton")) { return __ref.runUserSub(false, "vmbutton","seticonbutton", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 251;BA.debugLine="Sub SetIconButton(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 253;BA.debugLine="Button.AddClass(\"md-icon-button\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-icon-button")));
 BA.debugLineNum = 254;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 255;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _iid,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmbutton","setid", __ref, _iid, _bind);}
Debug.locals.put("iID", _iid);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 150;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMBut";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 151;BA.debugLine="Button.SetID(iID,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_iid),(Object)(_bind));
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
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmbutton","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 160;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMButt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="Button.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
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
public static RemoteObject  _setlistaction(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetListAction (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("setlistaction")) { return __ref.runUserSub(false, "vmbutton","setlistaction", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 194;BA.debugLine="Sub SetListAction(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 195;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 196;BA.debugLine="Button.SetListAction(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setlistaction" /*RemoteObject*/ ,(Object)(vmbutton.__c.getField(true,"True")));
 BA.debugLineNum = 197;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 198;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmenutrigger(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMenuTrigger (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("setmenutrigger")) { return __ref.runUserSub(false, "vmbutton","setmenutrigger", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 166;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 167;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 168;BA.debugLine="Button.SetAttr(CreateMap(\"md-menu-trigger\": True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbutton.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-menu-trigger")),(vmbutton.__c.getField(true,"True"))}))));
 BA.debugLineNum = 169;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 170;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmini(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMini (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("setmini")) { return __ref.runUserSub(false, "vmbutton","setmini", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 257;BA.debugLine="Sub SetMini(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 259;BA.debugLine="Button.AddClass(\"md-mini\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-mini")));
 BA.debugLineNum = 260;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 261;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _nam,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmbutton","setname", __ref, _nam, _bind);}
Debug.locals.put("nam", _nam);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 155;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMB";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 156;BA.debugLine="Button.SetName(nam, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_nam),(Object)(_bind));
 BA.debugLineNum = 157;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclick(RemoteObject __ref,RemoteObject _targetmodule) throws Exception{
try {
		Debug.PushSubsStack("SetOnClick (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vmbutton","setonclick", __ref, _targetmodule);}
Debug.locals.put("targetModule", _targetmodule);
 BA.debugLineNum = 85;BA.debugLine="Sub SetOnClick(targetModule As Object) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Button.SetOnClick(targetModule, $\"${ID}_click\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(_targetmodule),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbutton.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))));
 BA.debugLineNum = 87;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setplain(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPlain (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("setplain")) { return __ref.runUserSub(false, "vmbutton","setplain", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 263;BA.debugLine="Sub SetPlain(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 264;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 265;BA.debugLine="Button.AddClass(\"md-plain\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-plain")));
 BA.debugLineNum = 266;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 267;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,217);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmbutton","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 217;BA.debugLine="Sub SetPrimary(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 218;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 219;BA.debugLine="Button.SetPrimary(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 220;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 221;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setraised(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRaised (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("setraised")) { return __ref.runUserSub(false, "vmbutton","setraised", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 206;BA.debugLine="Sub SetRaised(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmbutton.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 208;BA.debugLine="Button.AddClass(\"md-raised\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-raised")));
 BA.debugLineNum = 209;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 210;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setripple(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRipple (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("setripple")) { return __ref.runUserSub(false, "vmbutton","setripple", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 212;BA.debugLine="Sub SetRipple(b As Boolean) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 213;BA.debugLine="Button.SetRipple(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setripple" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 214;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 215;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmbutton","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 140;BA.debugLine="Sub SetStyle(sm As Map) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="Button.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,133);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmbutton","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 133;BA.debugLine="Sub SetTabIndex(ti As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 134;BA.debugLine="If ti = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_ti,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 135;BA.debugLine="Button.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,285);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmbutton","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 285;BA.debugLine="Sub SetText(t As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 286;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 287;BA.debugLine="Button.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 288;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setto(RemoteObject __ref,RemoteObject _t,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetTo (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("setto")) { return __ref.runUserSub(false, "vmbutton","setto", __ref, _t, _bind);}
Debug.locals.put("t", _t);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 229;BA.debugLine="Sub SetTo(t As String, bind As Boolean) As VMButto";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 230;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 231;BA.debugLine="If bind = True Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bind,vmbutton.__c.getField(true,"True"))) { 
 BA.debugLineNum = 232;BA.debugLine="t= t.tolowercase";
Debug.JustUpdateDeviceLine();
_t = _t.runMethod(true,"toLowerCase");Debug.locals.put("t", _t);
 BA.debugLineNum = 233;BA.debugLine="SetAttr(CreateMap(\":to\":t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbutton.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbutton.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":to")),(_t)}))));
 }else {
 BA.debugLineNum = 235;BA.debugLine="Button.SetTo(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setto" /*RemoteObject*/ ,(Object)((_t)));
 };
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
public static RemoteObject  _settooltip(RemoteObject __ref,RemoteObject _tt) throws Exception{
try {
		Debug.PushSubsStack("SetToolTip (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("settooltip")) { return __ref.runUserSub(false, "vmbutton","settooltip", __ref, _tt);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtooltip");
Debug.locals.put("tt", _tt);
 BA.debugLineNum = 277;BA.debugLine="Sub SetToolTip(tt As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 278;BA.debugLine="If tt = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tt,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 279;BA.debugLine="Dim el As VMTooltip";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtooltip");Debug.locals.put("el", _el);
 BA.debugLineNum = 280;BA.debugLine="el.Initialize(vue,$\"${ID}tlt\"$).SetText(tt)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtooltip.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmbutton.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("tlt"))))).runClassMethod (b4j.example.vmtooltip.class, "_settext" /*RemoteObject*/ ,(Object)((_tt)));
 BA.debugLineNum = 281;BA.debugLine="el.Pop(Button)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtooltip.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_button" /*RemoteObject*/ )));
 BA.debugLineNum = 282;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 283;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmbutton","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 145;BA.debugLine="Sub SetVIf(vif As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Button.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmbutton","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 172;BA.debugLine="Sub SetVShow(vif As String) As VMButton";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 173;BA.debugLine="Button.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmbutton","show", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="Button.show";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_show" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmbutton) ","vmbutton",35,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmbutton","tostring", __ref);}
RemoteObject _strbtn = RemoteObject.createImmutable("");
 BA.debugLineNum = 291;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 292;BA.debugLine="If hasBadge Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasbadge" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 293;BA.debugLine="Dim strBTN As String = Button.ToString";
Debug.JustUpdateDeviceLine();
_strbtn = __ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("strBTN", _strbtn);Debug.locals.put("strBTN", _strbtn);
 BA.debugLineNum = 294;BA.debugLine="badge.SetText(strBTN)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_settext" /*RemoteObject*/ ,(Object)((_strbtn)));
 BA.debugLineNum = 295;BA.debugLine="Return badge.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_tostring" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 297;BA.debugLine="Return Button.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_button" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 };
 BA.debugLineNum = 299;BA.debugLine="End Sub";
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