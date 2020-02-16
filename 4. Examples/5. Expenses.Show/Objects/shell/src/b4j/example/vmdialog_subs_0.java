package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmdialog_subs_0 {


public static RemoteObject  _addaction(RemoteObject __ref,RemoteObject _btn) throws Exception{
try {
		Debug.PushSubsStack("AddAction (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,138);
if (RapidSub.canDelegate("addaction")) { return __ref.runUserSub(false, "vmdialog","addaction", __ref, _btn);}
Debug.locals.put("btn", _btn);
 BA.debugLineNum = 138;BA.debugLine="Sub AddAction(btn As VMButton) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 139;BA.debugLine="btn.Pop(actions)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_actions" /*RemoteObject*/ )));
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
public static RemoteObject  _addcancel(RemoteObject __ref,RemoteObject _btnid,RemoteObject _caption) throws Exception{
try {
		Debug.PushSubsStack("AddCancel (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("addcancel")) { return __ref.runUserSub(false, "vmdialog","addcancel", __ref, _btnid, _caption);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("btnID", _btnid);
Debug.locals.put("Caption", _caption);
 BA.debugLineNum = 152;BA.debugLine="Sub AddCancel(btnID As String, Caption As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 154;BA.debugLine="btn.Initialize(vue, btnID, module)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_btnid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 155;BA.debugLine="btn.SetText(Caption).SetAccent(True)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_settext" /*RemoteObject*/ ,(Object)(_caption)).runClassMethod (b4j.example.vmbutton.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmdialog.__c.getField(true,"True")));
 BA.debugLineNum = 156;BA.debugLine="btn.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 157;BA.debugLine="AddAction(btn)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdialog.class, "_addaction" /*RemoteObject*/ ,(Object)(_btn));
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmdialog","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 112;BA.debugLine="Sub AddClass(c As String) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="Dialog.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 114;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcontent(RemoteObject __ref,RemoteObject _cnttext) throws Exception{
try {
		Debug.PushSubsStack("AddContent (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("addcontent")) { return __ref.runUserSub(false, "vmdialog","addcontent", __ref, _cnttext);}
Debug.locals.put("cntText", _cnttext);
 BA.debugLineNum = 81;BA.debugLine="Sub AddContent(cntText As VMElement) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="cntText.Pop(Content)";
Debug.JustUpdateDeviceLine();
_cnttext.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
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
public static RemoteObject  _addform(RemoteObject __ref,RemoteObject _frm) throws Exception{
try {
		Debug.PushSubsStack("AddForm (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("addform")) { return __ref.runUserSub(false, "vmdialog","addform", __ref, _frm);}
Debug.locals.put("frm", _frm);
 BA.debugLineNum = 86;BA.debugLine="Sub AddForm(frm As VMForm)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="AddHTML(frm.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdialog.class, "_addhtml" /*RemoteObject*/ ,(Object)(_frm.runClassMethod (b4j.example.vmform.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 88;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addhtml(RemoteObject __ref,RemoteObject _htmlcontent) throws Exception{
try {
		Debug.PushSubsStack("AddHTML (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("addhtml")) { return __ref.runUserSub(false, "vmdialog","addhtml", __ref, _htmlcontent);}
Debug.locals.put("htmlContent", _htmlcontent);
 BA.debugLineNum = 90;BA.debugLine="Sub AddHTML(htmlContent As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Content.SetText(htmlContent)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_htmlcontent));
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addok(RemoteObject __ref,RemoteObject _btnid,RemoteObject _caption) throws Exception{
try {
		Debug.PushSubsStack("AddOK (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("addok")) { return __ref.runUserSub(false, "vmdialog","addok", __ref, _btnid, _caption);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("btnID", _btnid);
Debug.locals.put("Caption", _caption);
 BA.debugLineNum = 143;BA.debugLine="Sub AddOK(btnID As String, Caption As String) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 145;BA.debugLine="btn.Initialize(vue, btnID, module)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_btnid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 146;BA.debugLine="btn.SetText(Caption).SetPrimary(True)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_settext" /*RemoteObject*/ ,(Object)(_caption)).runClassMethod (b4j.example.vmbutton.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmdialog.__c.getField(true,"True")));
 BA.debugLineNum = 147;BA.debugLine="btn.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 148;BA.debugLine="AddAction(btn)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdialog.class, "_addaction" /*RemoteObject*/ ,(Object)(_btn));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public Dialog As VMElement";
vmdialog._dialog = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_dialog",vmdialog._dialog);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmdialog._id = RemoteObject.createImmutable("");__ref.setField("_id",vmdialog._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmdialog._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmdialog._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private actions As VMElement";
vmdialog._actions = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_actions",vmdialog._actions);
 //BA.debugLineNum = 7;BA.debugLine="Private BANano As BANano   'ignore";
vmdialog._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmdialog._banano);
 //BA.debugLineNum = 8;BA.debugLine="Private bActive As Boolean";
vmdialog._bactive = RemoteObject.createImmutable(false);__ref.setField("_bactive",vmdialog._bactive);
 //BA.debugLineNum = 9;BA.debugLine="Private Content As VMElement";
vmdialog._content = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_content",vmdialog._content);
 //BA.debugLineNum = 10;BA.debugLine="Private module As Object";
vmdialog._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmdialog._module);
 //BA.debugLineNum = 11;BA.debugLine="Public Container As VMContainer";
vmdialog._container = RemoteObject.createNew ("b4j.example.vmcontainer");__ref.setField("_container",vmdialog._container);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _getdata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetData (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("getdata")) { return __ref.runUserSub(false, "vmdialog","getdata", __ref);}
 BA.debugLineNum = 45;BA.debugLine="Sub GetData As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="Return Container.GetData";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_getdata" /*RemoteObject*/ );
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
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmdialog","hide", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 94;BA.debugLine="Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 96;BA.debugLine="opt.Put(ID, False)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmdialog.__c.getField(true,"False"))));
 BA.debugLineNum = 97;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 98;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,15);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmdialog","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 15;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 16;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 17;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 18;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 19;BA.debugLine="Dialog.Initialize(vue, $\"${ID}dialog\"$).SetTag(\"m";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("dialog"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dialog")));
 BA.debugLineNum = 20;BA.debugLine="actions.Initialize(vue,$\"${ID}actions\"$).SetTag(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_actions" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("actions"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dialog-actions")));
 BA.debugLineNum = 21;BA.debugLine="actions.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_actions" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 22;BA.debugLine="actions.RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_actions" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show")));
 BA.debugLineNum = 23;BA.debugLine="bActive = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmdialog.__c.getField(true,"False"));
 BA.debugLineNum = 24;BA.debugLine="If ID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 25;BA.debugLine="SetActiveSync(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdialog.class, "_setactivesync" /*RemoteObject*/ ,(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))));
 };
 BA.debugLineNum = 27;BA.debugLine="Content.Initialize(vue,$\"${ID}content\"$).SetTag(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("content"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dialog-content")));
 BA.debugLineNum = 28;BA.debugLine="Content.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 29;BA.debugLine="Container.Initialize(vue, sid & \"grid\", eventHand";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.concat(_sid,RemoteObject.createImmutable("grid"))),(Object)(_eventhandler));
 BA.debugLineNum = 30;BA.debugLine="Container.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 31;BA.debugLine="SetOnOpened";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdialog.class, "_setonopened" /*RemoteObject*/ );
 BA.debugLineNum = 32;BA.debugLine="SetOnClosed";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdialog.class, "_setonclosed" /*RemoteObject*/ );
 BA.debugLineNum = 33;BA.debugLine="SetOnClickedOutside";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdialog.class, "_setonclickedoutside" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="Dialog.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 35;BA.debugLine="Dialog.RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show")));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmdialog","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 194;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 195;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmdialog.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 196;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,190);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmdialog","render", __ref);}
 BA.debugLineNum = 190;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 191;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmdialog.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _required(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Required (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("required")) { return __ref.runUserSub(false, "vmdialog","required", __ref);}
 BA.debugLineNum = 50;BA.debugLine="Sub Required As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Return Container.required";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_container" /*RemoteObject*/ ).getField(false,"_required" /*RemoteObject*/ );
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
public static RemoteObject  _setactivesync(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("SetActiveSync (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,172);
if (RapidSub.canDelegate("setactivesync")) { return __ref.runUserSub(false, "vmdialog","setactivesync", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 172;BA.debugLine="private Sub SetActiveSync(a As Object) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 173;BA.debugLine="Dialog.SetActiveSync(a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setactivesync" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_a)));
 BA.debugLineNum = 174;BA.debugLine="bActive = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmdialog.__c.getField(true,"True"));
 BA.debugLineNum = 175;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 176;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmdialog","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 118;BA.debugLine="Sub SetAttr(attr As Map) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Dialog.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 120;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 121;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackdrop(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBackdrop (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,213);
if (RapidSub.canDelegate("setbackdrop")) { return __ref.runUserSub(false, "vmdialog","setbackdrop", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 213;BA.debugLine="Sub SetBackdrop(b As Boolean) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 214;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-backdrop\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-backdrop")),(_b)}))));
 BA.debugLineNum = 215;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 216;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setclickoutsidetoclose(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetClickOutsideToClose (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("setclickoutsidetoclose")) { return __ref.runUserSub(false, "vmdialog","setclickoutsidetoclose", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 203;BA.debugLine="Sub SetClickOutsideToClose(b As Boolean) As VMDial";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 204;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-click-outside-to-cl";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-click-outside-to-close")),(_b)}))));
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
public static RemoteObject  _setcloseonesc(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCloseOnEsc (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("setcloseonesc")) { return __ref.runUserSub(false, "vmdialog","setcloseonesc", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 208;BA.debugLine="Sub SetCloseOnEsc(b As Boolean) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 209;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-close-on-esc\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-close-on-esc")),(_b)}))));
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
public static RemoteObject  _setcontent(RemoteObject __ref,RemoteObject _cnttext) throws Exception{
try {
		Debug.PushSubsStack("SetContent (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("setcontent")) { return __ref.runUserSub(false, "vmdialog","setcontent", __ref, _cnttext);}
Debug.locals.put("cntText", _cnttext);
 BA.debugLineNum = 123;BA.debugLine="Sub SetContent(cntText As String) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="Dialog.SetText(cntText)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_cnttext));
 BA.debugLineNum = 125;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 126;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaults(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDefaults (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setdefaults")) { return __ref.runUserSub(false, "vmdialog","setdefaults", __ref);}
 BA.debugLineNum = 40;BA.debugLine="Sub SetDefaults";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="Container.SetDefaults";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_setdefaults" /*RemoteObject*/ );
 BA.debugLineNum = 42;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmdialog","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 106;BA.debugLine="Sub SetElevation(e As Int) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="Dialog.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
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
public static RemoteObject  _setfullscreen(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetFullScreen (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("setfullscreen")) { return __ref.runUserSub(false, "vmdialog","setfullscreen", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 198;BA.debugLine="Sub SetFullScreen(b As Boolean) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 199;BA.debugLine="Dialog.SetAttr(CreateMap(\":md-fullscreen\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-fullscreen")),(_b)}))));
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
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vmdialog","setheight", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 76;BA.debugLine="Sub SetHeight(w As String) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Dialog.SetStyle(CreateMap(\"width\":w))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),(_w)}))));
 BA.debugLineNum = 78;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 79;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,54);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmdialog","setkey", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 54;BA.debugLine="Sub SetKey(k As String) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 55;BA.debugLine="Dialog.SetKey(k,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(vmdialog.__c.getField(true,"True")));
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
public static RemoteObject  _setmaxheight(RemoteObject __ref,RemoteObject _mw) throws Exception{
try {
		Debug.PushSubsStack("SetMaxHeight (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("setmaxheight")) { return __ref.runUserSub(false, "vmdialog","setmaxheight", __ref, _mw);}
Debug.locals.put("mw", _mw);
 BA.debugLineNum = 167;BA.debugLine="Sub SetMaxHeight(mw As String) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 168;BA.debugLine="Dialog.SetMaxHeight(mw)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmaxheight" /*RemoteObject*/ ,(Object)(_mw));
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
public static RemoteObject  _setmaxwidth(RemoteObject __ref,RemoteObject _mw) throws Exception{
try {
		Debug.PushSubsStack("SetMaxWidth (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,162);
if (RapidSub.canDelegate("setmaxwidth")) { return __ref.runUserSub(false, "vmdialog","setmaxwidth", __ref, _mw);}
Debug.locals.put("mw", _mw);
 BA.debugLineNum = 162;BA.debugLine="Sub SetMaxWidth(mw As String) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 163;BA.debugLine="Dialog.SetMaxWidth(mw)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmaxwidth" /*RemoteObject*/ ,(Object)(_mw));
 BA.debugLineNum = 164;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 165;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclickedoutside(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnClickedOutside (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("setonclickedoutside")) { return __ref.runUserSub(false, "vmdialog","setonclickedoutside", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 240;BA.debugLine="private Sub SetOnClickedOutside As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 241;BA.debugLine="Dim methodName As String = $\"${ID}_outside\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_outside")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 242;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 243;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 244;BA.debugLine="Dialog.SetAttr(CreateMap(\"v-on:md-clicked-outside";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-clicked-outside")),(_methodname)}))));
 BA.debugLineNum = 246;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 247;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 248;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnClosed (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,229);
if (RapidSub.canDelegate("setonclosed")) { return __ref.runUserSub(false, "vmdialog","setonclosed", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 229;BA.debugLine="private Sub SetOnClosed As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 230;BA.debugLine="Dim methodName As String = $\"${ID}_closed\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_closed")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 231;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmdialog.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmdialog.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 232;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 233;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 234;BA.debugLine="Dialog.SetAttr(CreateMap(\"v-on:md-closed\": method";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-closed")),(_methodname)}))));
 BA.debugLineNum = 236;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setonopened(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnOpened (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("setonopened")) { return __ref.runUserSub(false, "vmdialog","setonopened", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 218;BA.debugLine="private Sub SetOnOpened As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 219;BA.debugLine="Dim methodName As String = $\"${ID}_opened\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_opened")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 220;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmdialog.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmdialog.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 221;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 222;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 223;BA.debugLine="Dialog.SetAttr(CreateMap(\"v-on:md-opened\": method";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-opened")),(_methodname)}))));
 BA.debugLineNum = 225;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setscrollbar(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetScrollBar (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setscrollbar")) { return __ref.runUserSub(false, "vmdialog","setscrollbar", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 59;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Content.SetScrollBar(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setscrollbar" /*RemoteObject*/ ,(Object)(vmdialog.__c.getField(true,"True")));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,65);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmdialog","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 65;BA.debugLine="Sub SetStyle(m As Map) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 66;BA.debugLine="Dialog.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 67;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTitle (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmdialog","settitle", __ref, _t);}
RemoteObject _pp = RemoteObject.createImmutable("");
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("t", _t);
 BA.debugLineNum = 128;BA.debugLine="Sub SetTitle(t As String) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="Dim pp As String = $\"${ID}title\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("title")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 130;BA.debugLine="vue.SetStateSingle(pp, t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_t)));
 BA.debugLineNum = 131;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 132;BA.debugLine="el.Initialize(vue,$\"${ID}title\"$).SetTagDialogTit";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("title"))))).runClassMethod (b4j.example.vmelement.class, "_settagdialogtitle" /*RemoteObject*/ ,(Object)(vmdialog.__c.getField(true,"True")));
 BA.debugLineNum = 133;BA.debugLine="el.SetText($\"{{ ${pp} }}\"$)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_pp))),RemoteObject.createImmutable(" }}")))));
 BA.debugLineNum = 134;BA.debugLine="el.Pop(Dialog)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
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
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,71);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmdialog","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 71;BA.debugLine="Sub SetWidth(w As String) As VMDialog";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 72;BA.debugLine="Dialog.SetStyle(CreateMap(\"width\":w))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),(_w)}))));
 BA.debugLineNum = 73;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 74;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Show (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmdialog","show", __ref);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
 BA.debugLineNum = 100;BA.debugLine="Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmdialog.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 102;BA.debugLine="opt.Put(ID, True)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)((vmdialog.__c.getField(true,"True"))));
 BA.debugLineNum = 103;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 104;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmdialog) ","vmdialog",50,__ref.getField(false, "ba"),__ref,178);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmdialog","tostring", __ref);}
 BA.debugLineNum = 178;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 179;BA.debugLine="AddHTML(Container.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdialog.class, "_addhtml" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_container" /*RemoteObject*/ ).runClassMethod (b4j.example.vmcontainer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 180;BA.debugLine="Content.Pop(Dialog)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 BA.debugLineNum = 181;BA.debugLine="If bActive = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_bactive" /*RemoteObject*/ ),vmdialog.__c.getField(true,"False"))) { 
 BA.debugLineNum = 182;BA.debugLine="Log($\"VMDialog.SetActiveSync: '${ID}' has not be";
Debug.JustUpdateDeviceLine();
vmdialog.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMDialog.SetActiveSync: '"),vmdialog.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("' has not been activated!")))));
 };
 BA.debugLineNum = 184;BA.debugLine="If actions.hasContent Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_actions" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 185;BA.debugLine="actions.Pop(Dialog)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_actions" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_dialog" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 187;BA.debugLine="Return Dialog.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_dialog" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 188;BA.debugLine="End Sub";
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