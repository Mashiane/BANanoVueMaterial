package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmcard_subs_0 {


public static RemoteObject  _addaction(RemoteObject __ref,RemoteObject _btnid,RemoteObject _btntext) throws Exception{
try {
		Debug.PushSubsStack("AddAction (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("addaction")) { return __ref.runUserSub(false, "vmcard","addaction", __ref, _btnid, _btntext);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("btnID", _btnid);
Debug.locals.put("btnText", _btntext);
 BA.debugLineNum = 87;BA.debugLine="Sub AddAction(btnID As String, btnText As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 89;BA.debugLine="btn.Initialize(vue,btnID, module).SetText(btnText";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_btnid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmbutton.class, "_settext" /*RemoteObject*/ ,(Object)(_btntext));
 BA.debugLineNum = 90;BA.debugLine="btn.Pop(Actions.CardActions)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_actions" /*RemoteObject*/ ).getField(false,"_cardactions" /*RemoteObject*/ )));
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
public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmcard","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 135;BA.debugLine="Sub AddChild(child As VMElement) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 137;BA.debugLine="Card.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmcard","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 171;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 172;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 173;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcard.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 175;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmcard","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 153;BA.debugLine="Sub AddClass(c As String) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="Card.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Card As VMElement";
vmcard._card = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_card",vmcard._card);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmcard._id = RemoteObject.createImmutable("");__ref.setField("_id",vmcard._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmcard._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmcard._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmcard._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmcard._banano);
 //BA.debugLineNum = 7;BA.debugLine="Public Header As VMElement";
vmcard._header = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_header",vmcard._header);
 //BA.debugLineNum = 8;BA.debugLine="Public Content As VMElement";
vmcard._content = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_content",vmcard._content);
 //BA.debugLineNum = 9;BA.debugLine="Public Actions As VMCardActions";
vmcard._actions = RemoteObject.createNew ("b4j.example.vmcardactions");__ref.setField("_actions",vmcard._actions);
 //BA.debugLineNum = 10;BA.debugLine="Private HeaderText As VMElement";
vmcard._headertext = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_headertext",vmcard._headertext);
 //BA.debugLineNum = 11;BA.debugLine="Private Media As VMCardMedia";
vmcard._media = RemoteObject.createNew ("b4j.example.vmcardmedia");__ref.setField("_media",vmcard._media);
 //BA.debugLineNum = 12;BA.debugLine="Private monside As Boolean";
vmcard._monside = RemoteObject.createImmutable(false);__ref.setField("_monside",vmcard._monside);
 //BA.debugLineNum = 13;BA.debugLine="Private Avatar As VMAvatar";
vmcard._avatar = RemoteObject.createNew ("b4j.example.vmavatar");__ref.setField("_avatar",vmcard._avatar);
 //BA.debugLineNum = 14;BA.debugLine="Private module As Object";
vmcard._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmcard._module);
 //BA.debugLineNum = 15;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmcard","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 18;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 20;BA.debugLine="Card.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 21;BA.debugLine="Card.SetTag(\"md-card\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-card")));
 BA.debugLineNum = 22;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 23;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 24;BA.debugLine="Header.Initialize(vue,$\"${ID}ch\"$).SetTag(\"md-car";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_header" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("ch"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-card-header")));
 BA.debugLineNum = 25;BA.debugLine="Content.Initialize(vue,$\"${ID}cc\"$).SetTag(\"md-ca";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("cc"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-card-content")));
 BA.debugLineNum = 26;BA.debugLine="Actions.Initialize(vue,$\"${ID}actions\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_actions" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcardactions.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("actions")))));
 BA.debugLineNum = 27;BA.debugLine="HeaderText.Initialize(vue,$\"${ID}cht\"$).SetTag(\"m";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_headertext" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("cht"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-card-header-text")));
 BA.debugLineNum = 28;BA.debugLine="Media.Initialize(vue,$\"${ID}media\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_media" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcardmedia.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("media")))));
 BA.debugLineNum = 29;BA.debugLine="monside = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_monside" /*RemoteObject*/ ,vmcard.__c.getField(true,"False"));
 BA.debugLineNum = 30;BA.debugLine="Avatar.Initialize(vue,$\"${ID}avatar\"$,module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmavatar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("avatar")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmcard","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 148;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcard.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 150;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmcard","render", __ref);}
 BA.debugLineNum = 130;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmcard.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmcard","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 50;BA.debugLine="Sub SetAccent(b As Boolean) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Card.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmcard.__c.getField(true,"True")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmcard","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 159;BA.debugLine="Sub SetAttr(attr As Map) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="Card.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setavatar(RemoteObject __ref,RemoteObject _imgurl,RemoteObject _imgalt) throws Exception{
try {
		Debug.PushSubsStack("SetAvatar (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setavatar")) { return __ref.runUserSub(false, "vmcard","setavatar", __ref, _imgurl, _imgalt);}
Debug.locals.put("imgURL", _imgurl);
Debug.locals.put("imgAlt", _imgalt);
 BA.debugLineNum = 34;BA.debugLine="Sub SetAvatar(imgURL As String, imgAlt As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="Avatar.SetValue(imgURL)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmavatar.class, "_setvalue" /*RemoteObject*/ ,(Object)(_imgurl));
 BA.debugLineNum = 36;BA.debugLine="Avatar.SetAlt(imgAlt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmavatar.class, "_setalt" /*RemoteObject*/ ,(Object)(_imgalt));
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
public static RemoteObject  _setcontent(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetContent (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("setcontent")) { return __ref.runUserSub(false, "vmcard","setcontent", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 94;BA.debugLine="Sub SetContent(c As String) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="Content.SetText(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _setimage(RemoteObject __ref,RemoteObject _imgurl,RemoteObject _alt) throws Exception{
try {
		Debug.PushSubsStack("SetImage (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setimage")) { return __ref.runUserSub(false, "vmcard","setimage", __ref, _imgurl, _alt);}
RemoteObject _img = RemoteObject.declareNull("b4j.example.vmimage");
Debug.locals.put("imgURL", _imgurl);
Debug.locals.put("alt", _alt);
 BA.debugLineNum = 72;BA.debugLine="Sub SetImage(imgURL As String, alt As String) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="Dim img As VMImage";
Debug.JustUpdateDeviceLine();
_img = RemoteObject.createNew ("b4j.example.vmimage");Debug.locals.put("img", _img);
 BA.debugLineNum = 74;BA.debugLine="img.Initialize(vue,$\"${ID}image\"$,module).SetValu";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("image")))),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmimage.class, "_setvalue" /*RemoteObject*/ ,(Object)(_imgurl),(Object)(vmcard.__c.getField(true,"True")));
 BA.debugLineNum = 75;BA.debugLine="img.SetAlt(alt)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_setalt" /*RemoteObject*/ ,(Object)(_alt));
 BA.debugLineNum = 76;BA.debugLine="img.Pop(Media.CardMedia)";
Debug.JustUpdateDeviceLine();
_img.runClassMethod (b4j.example.vmimage.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_media" /*RemoteObject*/ ).getField(false,"_cardmedia" /*RemoteObject*/ )));
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
public static RemoteObject  _setmediabig(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMediaBig (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setmediabig")) { return __ref.runUserSub(false, "vmcard","setmediabig", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 55;BA.debugLine="Sub SetMediaBig(b As Boolean) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Media.SetBig(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_media" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcardmedia.class, "_setbig" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setmediamedium(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMediaMedium (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("setmediamedium")) { return __ref.runUserSub(false, "vmcard","setmediamedium", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 60;BA.debugLine="Sub SetMediaMedium(b As Boolean) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="Media.SetMedium(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_media" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcardmedia.class, "_setmedium" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setmediaonside(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMediaOnSide (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setmediaonside")) { return __ref.runUserSub(false, "vmcard","setmediaonside", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 40;BA.debugLine="Sub SetMediaOnSide(b As Boolean) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="monside = b";
Debug.JustUpdateDeviceLine();
__ref.setField ("_monside" /*RemoteObject*/ ,_b);
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmcard","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 178;BA.debugLine="Sub SetPadding(p As Object) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 179;BA.debugLine="Card.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmcard","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 45;BA.debugLine="Sub SetPrimary(b As Boolean) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="Card.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmcard.__c.getField(true,"True")));
 BA.debugLineNum = 47;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 48;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmcard","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 165;BA.debugLine="Sub SetStyle(sm As Map) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 166;BA.debugLine="Card.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 167;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsubheading(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetSubHeading (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setsubheading")) { return __ref.runUserSub(false, "vmcard","setsubheading", __ref, _t);}
RemoteObject _title = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("t", _t);
 BA.debugLineNum = 80;BA.debugLine="Sub SetSubHeading(t As String) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="Dim title As VMElement";
Debug.JustUpdateDeviceLine();
_title = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("title", _title);
 BA.debugLineNum = 82;BA.debugLine="title.Initialize(vue,$\"${ID}subheading\"$).SetTag(";
Debug.JustUpdateDeviceLine();
_title.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("subheading"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_setsubhead" /*RemoteObject*/ ,(Object)(vmcard.__c.getField(true,"True"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 83;BA.debugLine="title.Pop(HeaderText)";
Debug.JustUpdateDeviceLine();
_title.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_headertext" /*RemoteObject*/ )));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmcard","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 142;BA.debugLine="Sub SetText(t As Object) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="Card.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _settheme(RemoteObject __ref,RemoteObject _vartheme) throws Exception{
try {
		Debug.PushSubsStack("SetTheme (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("settheme")) { return __ref.runUserSub(false, "vmcard","settheme", __ref, _vartheme);}
Debug.locals.put("varTheme", _vartheme);
 BA.debugLineNum = 190;BA.debugLine="Sub SetTheme(varTheme As Object) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="SetAttr(CreateMap(\"md-theme\": varTheme))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcard.class, "_setattr" /*RemoteObject*/ ,(Object)(vmcard.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-theme")),_vartheme}))));
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
public static RemoteObject  _setthemeaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetThemeAccent (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("setthemeaccent")) { return __ref.runUserSub(false, "vmcard","setthemeaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 202;BA.debugLine="Sub SetThemeAccent(b As Boolean) As VMCard    'ign";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="AddClass(\"md-accent\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcard.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-accent")));
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
public static RemoteObject  _setthemeprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetThemePrimary (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("setthemeprimary")) { return __ref.runUserSub(false, "vmcard","setthemeprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 196;BA.debugLine="Sub SetThemePrimary(b As Boolean) As VMCard    'ig";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="AddClass(\"md-primary\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcard.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-primary")));
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
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmcard","settitle", __ref, _t);}
RemoteObject _title = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("t", _t);
 BA.debugLineNum = 65;BA.debugLine="Sub SetTitle(t As String) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Dim title As VMElement";
Debug.JustUpdateDeviceLine();
_title = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("title", _title);
 BA.debugLineNum = 67;BA.debugLine="title.Initialize(vue,$\"${ID}title\"$).SetTag(\"div\"";
Debug.JustUpdateDeviceLine();
_title.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmcard.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("title"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_settitle" /*RemoteObject*/ ,(Object)(vmcard.__c.getField(true,"True"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 68;BA.debugLine="title.Pop(HeaderText)";
Debug.JustUpdateDeviceLine();
_title.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_headertext" /*RemoteObject*/ )));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmcard","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 119;BA.debugLine="Sub SetVIf(vif As Object) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="Card.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 121;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 122;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmcard","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 114;BA.debugLine="Sub SetVModel(k As String) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="Card.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmcard","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 124;BA.debugLine="Sub SetVShow(vif As Object) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="Card.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setwithhover(RemoteObject __ref,RemoteObject _varwith) throws Exception{
try {
		Debug.PushSubsStack("SetWithHover (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("setwithhover")) { return __ref.runUserSub(false, "vmcard","setwithhover", __ref, _varwith);}
Debug.locals.put("varWith", _varwith);
 BA.debugLineNum = 184;BA.debugLine="Sub SetWithHover(varWith As Boolean) As VMCard";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="SetAttr(CreateMap(\":md-with-hover\": varWith))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmcard.class, "_setattr" /*RemoteObject*/ ,(Object)(vmcard.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-with-hover")),(_varwith)}))));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmcard) ","vmcard",36,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmcard","tostring", __ref);}
 BA.debugLineNum = 100;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="HeaderText.Pop(Header)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_headertext" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_header" /*RemoteObject*/ )));
 BA.debugLineNum = 103;BA.debugLine="If monside Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_monside" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 104;BA.debugLine="Media.Pop(Header)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_media" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcardmedia.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_header" /*RemoteObject*/ )));
 }else {
 BA.debugLineNum = 106;BA.debugLine="Media.Pop(Card)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_media" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcardmedia.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_card" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 108;BA.debugLine="Header.Pop(Card)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_header" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_card" /*RemoteObject*/ )));
 BA.debugLineNum = 109;BA.debugLine="Content.Pop(Card)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_card" /*RemoteObject*/ )));
 BA.debugLineNum = 110;BA.debugLine="Actions.Pop(Card)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_actions" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcardactions.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_card" /*RemoteObject*/ )));
 BA.debugLineNum = 111;BA.debugLine="Return Card.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_card" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}