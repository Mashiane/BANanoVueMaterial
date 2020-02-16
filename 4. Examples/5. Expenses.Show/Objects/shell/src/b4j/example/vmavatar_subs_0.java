package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmavatar_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmavatar","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 126;BA.debugLine="Sub AddClass(c As String) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="Avatar.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,197);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmavatar","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 197;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 198;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmavatar.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 199;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Avatar As VMElement";
vmavatar._avatar = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_avatar",vmavatar._avatar);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmavatar._id = RemoteObject.createImmutable("");__ref.setField("_id",vmavatar._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmavatar._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmavatar._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private img As VMElement";
vmavatar._img = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_img",vmavatar._img);
 //BA.debugLineNum = 7;BA.debugLine="Private hasImage As Boolean";
vmavatar._hasimage = RemoteObject.createImmutable(false);__ref.setField("_hasimage",vmavatar._hasimage);
 //BA.debugLineNum = 8;BA.debugLine="Private hasBadge As Boolean";
vmavatar._hasbadge = RemoteObject.createImmutable(false);__ref.setField("_hasbadge",vmavatar._hasbadge);
 //BA.debugLineNum = 9;BA.debugLine="Private badge As VMBadge";
vmavatar._badge = RemoteObject.createNew ("b4j.example.vmbadge");__ref.setField("_badge",vmavatar._badge);
 //BA.debugLineNum = 10;BA.debugLine="Private module As Object";
vmavatar._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmavatar._module);
 //BA.debugLineNum = 11;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmavatar","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 17;BA.debugLine="Avatar.Initialize(vue, ID).SetTag(\"md-avatar\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-avatar")));
 BA.debugLineNum = 18;BA.debugLine="img.Initialize(vue,$\"${ID}img\"$).SetTag(\"img\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_img" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmavatar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("img"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("img")));
 BA.debugLineNum = 19;BA.debugLine="hasImage = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasimage" /*RemoteObject*/ ,vmavatar.__c.getField(true,"False"));
 BA.debugLineNum = 20;BA.debugLine="hasBadge = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmavatar.__c.getField(true,"False"));
 BA.debugLineNum = 21;BA.debugLine="badge.Initialize(vue, $\"${ID}badge\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmavatar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("badge")))));
 BA.debugLineNum = 22;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmavatar","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 193;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 194;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmavatar.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 195;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmavatar","render", __ref);}
 BA.debugLineNum = 189;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 190;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmavatar.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 191;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmavatar","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 101;BA.debugLine="Sub SetAccent(b As Boolean) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="If b Then Avatar.AddClass(\"md-accent\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-accent")));};
 BA.debugLineNum = 103;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 104;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalt(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("SetAlt (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,161);
if (RapidSub.canDelegate("setalt")) { return __ref.runUserSub(false, "vmavatar","setalt", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 161;BA.debugLine="Sub SetAlt(a As String) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 162;BA.debugLine="img.SetAlt(a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_img" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setalt" /*RemoteObject*/ ,(Object)(_a));
 BA.debugLineNum = 163;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 164;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,156);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmavatar","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 156;BA.debugLine="Sub SetAttr(attr As Map) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 157;BA.debugLine="Avatar.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 158;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 159;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setavataricon(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAvatarIcon (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setavataricon")) { return __ref.runUserSub(false, "vmavatar","setavataricon", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 145;BA.debugLine="Sub SetAvatarIcon(b As Boolean) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="If b Then Avatar.AddClass(\"md-avatar-icon\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-avatar-icon")));};
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
public static RemoteObject  _setbadgeaccent(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeAccent (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("setbadgeaccent")) { return __ref.runUserSub(false, "vmavatar","setbadgeaccent", __ref);}
 BA.debugLineNum = 37;BA.debugLine="Sub SetBadgeAccent As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="badge.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmavatar.__c.getField(true,"True")));
 BA.debugLineNum = 39;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmavatar.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgecontent(RemoteObject __ref,RemoteObject _counted) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeContent (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("setbadgecontent")) { return __ref.runUserSub(false, "vmavatar","setbadgecontent", __ref, _counted);}
Debug.locals.put("counted", _counted);
 BA.debugLineNum = 25;BA.debugLine="Sub SetBadgeContent(counted As Int) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="badge.SetContent(counted)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setcontent" /*RemoteObject*/ ,(Object)(_counted));
 BA.debugLineNum = 27;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmavatar.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgedense(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeDense (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setbadgedense")) { return __ref.runUserSub(false, "vmavatar","setbadgedense", __ref);}
 BA.debugLineNum = 55;BA.debugLine="Sub SetBadgeDense As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="badge.SetDense(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setdense" /*RemoteObject*/ ,(Object)(vmavatar.__c.getField(true,"True")));
 BA.debugLineNum = 57;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmavatar.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgeonbottom(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeOnBottom (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("setbadgeonbottom")) { return __ref.runUserSub(false, "vmavatar","setbadgeonbottom", __ref);}
 BA.debugLineNum = 49;BA.debugLine="Sub SetBadgeOnBottom As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="badge.SetPositionBottom(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setpositionbottom" /*RemoteObject*/ ,(Object)(vmavatar.__c.getField(true,"True")));
 BA.debugLineNum = 51;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmavatar.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgeontop(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeOnTop (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,43);
if (RapidSub.canDelegate("setbadgeontop")) { return __ref.runUserSub(false, "vmavatar","setbadgeontop", __ref);}
 BA.debugLineNum = 43;BA.debugLine="Sub SetBadgeOnTop As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 44;BA.debugLine="badge.SetPositionTop(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setpositiontop" /*RemoteObject*/ ,(Object)(vmavatar.__c.getField(true,"True")));
 BA.debugLineNum = 45;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmavatar.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgeprimary(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgePrimary (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("setbadgeprimary")) { return __ref.runUserSub(false, "vmavatar","setbadgeprimary", __ref);}
 BA.debugLineNum = 31;BA.debugLine="Sub SetBadgePrimary As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="badge.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmavatar.__c.getField(true,"True")));
 BA.debugLineNum = 33;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmavatar.__c.getField(true,"True"));
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
public static RemoteObject  _setbadgesquare(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetBadgeSquare (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("setbadgesquare")) { return __ref.runUserSub(false, "vmavatar","setbadgesquare", __ref);}
 BA.debugLineNum = 61;BA.debugLine="Sub SetBadgeSquare As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="badge.SetSquare(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setsquare" /*RemoteObject*/ ,(Object)(vmavatar.__c.getField(true,"True")));
 BA.debugLineNum = 63;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmavatar.__c.getField(true,"True"));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmavatar","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 67;BA.debugLine="Sub SetDisabled(b As Boolean) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="Avatar.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,111);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmavatar","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 111;BA.debugLine="Sub SetElevation(e As Int) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 112;BA.debugLine="Avatar.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _icn) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmavatar","seticon", __ref, _icn);}
RemoteObject _icon = RemoteObject.declareNull("b4j.example.vmicon");
Debug.locals.put("icn", _icn);
 BA.debugLineNum = 136;BA.debugLine="Sub SetIcon(icn As String) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="If icn = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_icn,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 138;BA.debugLine="SetAvatarIcon(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmavatar.class, "_setavataricon" /*RemoteObject*/ ,(Object)(vmavatar.__c.getField(true,"True")));
 BA.debugLineNum = 139;BA.debugLine="Dim icon As VMIcon";
Debug.JustUpdateDeviceLine();
_icon = RemoteObject.createNew ("b4j.example.vmicon");Debug.locals.put("icon", _icon);
 BA.debugLineNum = 140;BA.debugLine="icon.Initialize(vue,$\"${ID}icn\"$).SetText(icn)";
Debug.JustUpdateDeviceLine();
_icon.runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmavatar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icn"))))).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_icn));
 BA.debugLineNum = 141;BA.debugLine="icon.pop(Avatar)";
Debug.JustUpdateDeviceLine();
_icon.runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_avatar" /*RemoteObject*/ )));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmavatar","setid", __ref, _sid);}
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 106;BA.debugLine="Sub SetID(sid As String) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
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
public static RemoteObject  _setlarge(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetLarge (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("setlarge")) { return __ref.runUserSub(false, "vmavatar","setlarge", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 150;BA.debugLine="Sub SetLarge(b As Boolean) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 151;BA.debugLine="If b Then Avatar.AddClass(\"md-large\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-large")));};
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
public static RemoteObject  _setmenutrigger(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMenuTrigger (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("setmenutrigger")) { return __ref.runUserSub(false, "vmavatar","setmenutrigger", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 78;BA.debugLine="Sub SetMenuTrigger(b As Boolean) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="Avatar.SetAttr(CreateMap(\":md-menu-trigger\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmavatar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-menu-trigger")),(_b)}))));
 BA.debugLineNum = 80;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmavatar","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 96;BA.debugLine="Sub SetPrimary(b As Boolean) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="If b Then Avatar.AddClass(\"md-primary\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-primary")));};
 BA.debugLineNum = 98;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsmall(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSmall (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("setsmall")) { return __ref.runUserSub(false, "vmavatar","setsmall", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 131;BA.debugLine="Sub SetSmall(b As Boolean) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="If b Then Avatar.AddClass(\"md-small\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-small")));};
 BA.debugLineNum = 133;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 134;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmavatar","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 84;BA.debugLine="Sub SetText(t As String) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="Avatar.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 86;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 87;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextripple(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetTextRipple (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("settextripple")) { return __ref.runUserSub(false, "vmavatar","settextripple", __ref, _t);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("t", _t);
 BA.debugLineNum = 89;BA.debugLine="Sub SetTextRipple(t As String) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 91;BA.debugLine="el.Initialize(vue,$\"${ID}txt\"$).SetTag(\"md-ripple";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmavatar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("txt"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-ripple"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 92;BA.debugLine="el.Pop(Avatar)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_avatar" /*RemoteObject*/ )));
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
public static RemoteObject  _settooltip(RemoteObject __ref,RemoteObject _tt) throws Exception{
try {
		Debug.PushSubsStack("SetToolTip (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("settooltip")) { return __ref.runUserSub(false, "vmavatar","settooltip", __ref, _tt);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmtooltip");
Debug.locals.put("tt", _tt);
 BA.debugLineNum = 117;BA.debugLine="Sub SetToolTip(tt As String) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="If tt = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_tt,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 119;BA.debugLine="Dim el As VMTooltip";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmtooltip");Debug.locals.put("el", _el);
 BA.debugLineNum = 120;BA.debugLine="el.Initialize(vue,$\"${ID}tlt\"$).SetText(tt)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtooltip.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmavatar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("tlt"))))).runClassMethod (b4j.example.vmtooltip.class, "_settext" /*RemoteObject*/ ,(Object)((_tt)));
 BA.debugLineNum = 121;BA.debugLine="el.Pop(Avatar)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmtooltip.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_avatar" /*RemoteObject*/ )));
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
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _imgurl) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,166);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmavatar","setvalue", __ref, _imgurl);}
RemoteObject _lkey = RemoteObject.createImmutable("");
Debug.locals.put("imgURL", _imgurl);
 BA.debugLineNum = 166;BA.debugLine="Sub SetValue(imgURL As String) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 167;BA.debugLine="If ID = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 168;BA.debugLine="Log(\"VMAvatar.SetValue: You need to set the ID o";
Debug.JustUpdateDeviceLine();
vmavatar.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("VMAvatar.SetValue: You need to set the ID of the image.")));
 };
 BA.debugLineNum = 170;BA.debugLine="Dim lkey As String = $\"${ID}url\"$";
Debug.JustUpdateDeviceLine();
_lkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmavatar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("url")));Debug.locals.put("lkey", _lkey);Debug.locals.put("lkey", _lkey);
 BA.debugLineNum = 171;BA.debugLine="img.SetSRC(lkey,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_img" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setsrc" /*RemoteObject*/ ,(Object)(_lkey),(Object)(vmavatar.__c.getField(true,"True")));
 BA.debugLineNum = 172;BA.debugLine="vue.SetStateSingle(lkey, imgURL)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_lkey),(Object)((_imgurl)));
 BA.debugLineNum = 173;BA.debugLine="hasImage = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasimage" /*RemoteObject*/ ,vmavatar.__c.getField(true,"True"));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmavatar","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 72;BA.debugLine="Sub SetVShow(vif As String) As VMAvatar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 74;BA.debugLine="Avatar.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 75;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmavatar) ","vmavatar",31,__ref.getField(false, "ba"),__ref,177);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmavatar","tostring", __ref);}
RemoteObject _strbtn = RemoteObject.createImmutable("");
 BA.debugLineNum = 177;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 178;BA.debugLine="If hasImage Then img.Pop(Avatar)";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasimage" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_img" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_avatar" /*RemoteObject*/ )));};
 BA.debugLineNum = 180;BA.debugLine="If hasBadge Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasbadge" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 181;BA.debugLine="Dim strBTN As String = Avatar.ToString";
Debug.JustUpdateDeviceLine();
_strbtn = __ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("strBTN", _strbtn);Debug.locals.put("strBTN", _strbtn);
 BA.debugLineNum = 182;BA.debugLine="badge.SetText(strBTN)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_settext" /*RemoteObject*/ ,(Object)((_strbtn)));
 BA.debugLineNum = 183;BA.debugLine="Return badge.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_tostring" /*RemoteObject*/ );
 }else {
 BA.debugLineNum = 185;BA.debugLine="Return Avatar.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 };
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
}