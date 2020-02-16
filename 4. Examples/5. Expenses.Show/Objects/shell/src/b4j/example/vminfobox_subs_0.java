package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vminfobox_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vminfobox","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 164;BA.debugLine="Sub AddClass(c As String) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="InfoBox.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public InfoBox As VMElement";
vminfobox._infobox = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_infobox",vminfobox._infobox);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vminfobox._id = RemoteObject.createImmutable("");__ref.setField("_id",vminfobox._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vminfobox._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vminfobox._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private Icon As VMElement";
vminfobox._icon = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_icon",vminfobox._icon);
 //BA.debugLineNum = 7;BA.debugLine="Private Content As VMElement";
vminfobox._content = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_content",vminfobox._content);
 //BA.debugLineNum = 8;BA.debugLine="Private Text As VMElement";
vminfobox._text = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_text",vminfobox._text);
 //BA.debugLineNum = 9;BA.debugLine="Private CountIt As VMElement";
vminfobox._countit = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_countit",vminfobox._countit);
 //BA.debugLineNum = 10;BA.debugLine="Private i As VMElement";
vminfobox._i = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_i",vminfobox._i);
 //BA.debugLineNum = 11;BA.debugLine="Private hasIcon As Boolean";
vminfobox._hasicon = RemoteObject.createImmutable(false);__ref.setField("_hasicon",vminfobox._hasicon);
 //BA.debugLineNum = 12;BA.debugLine="Private banano As BANano   'ignore";
vminfobox._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vminfobox._banano);
 //BA.debugLineNum = 13;BA.debugLine="Private module As Object";
vminfobox._module = RemoteObject.createNew ("Object");__ref.setField("_module",vminfobox._module);
 //BA.debugLineNum = 14;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,16);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vminfobox","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 16;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 17;BA.debugLine="banano.DependsOnAsset(\"jquery-3.4.1.min.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("jquery-3.4.1.min.js")));
 BA.debugLineNum = 18;BA.debugLine="banano.DependsOnAsset(\"info-box.css\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("info-box.css")));
 BA.debugLineNum = 19;BA.debugLine="banano.DependsOnAsset(\"jquery.countTo.js\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runVoidMethod ("DependsOnAsset",(Object)(RemoteObject.createImmutable("jquery.countTo.js")));
 BA.debugLineNum = 20;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 21;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 22;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 23;BA.debugLine="InfoBox.Initialize(vue, ID).SetTag(\"div\").AddClas";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("info-box")));
 BA.debugLineNum = 24;BA.debugLine="Icon.Initialize(vue, $\"${ID}icn\"$).SetTag(\"div\").";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icn"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("icon")));
 BA.debugLineNum = 25;BA.debugLine="Content.Initialize(vue,$\"${ID}content\"$).SetTag(\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("content"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("content")));
 BA.debugLineNum = 26;BA.debugLine="Text.Initialize(vue,$\"${ID}text\"$).SetTag(\"div\").";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_text" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("text"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("text")));
 BA.debugLineNum = 27;BA.debugLine="CountIt.Initialize(vue,$\"${ID}number\"$).SetTag(\"d";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("number"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("number")));
 BA.debugLineNum = 28;BA.debugLine="i.Initialize(vue,$\"${ID}i\"$).SetTag(\"i\").AddClass";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_i" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("i"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("i"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("material-icons")));
 BA.debugLineNum = 29;BA.debugLine="hasIcon = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasicon" /*RemoteObject*/ ,vminfobox.__c.getField(true,"False"));
 BA.debugLineNum = 30;BA.debugLine="InfoBox.SetOnClick(module, $\"${ID}_click\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))));
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
		Debug.PushSubsStack("Pop (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vminfobox","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 184;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vminfobox.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 186;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vminfobox","render", __ref);}
 BA.debugLineNum = 180;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vminfobox.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 182;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vminfobox","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 170;BA.debugLine="Sub SetAttr(attr As Map) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 171;BA.debugLine="InfoBox.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 172;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundcolor(RemoteObject __ref,RemoteObject _background) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundColor (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "vminfobox","setbackgroundcolor", __ref, _background);}
RemoteObject _bg = RemoteObject.createImmutable("");
Debug.locals.put("background", _background);
 BA.debugLineNum = 56;BA.debugLine="Sub SetBackgroundColor(background As String) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="If background = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_background,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 58;BA.debugLine="Dim bg As String = $\"bg-${background}\"$";
Debug.JustUpdateDeviceLine();
_bg = (RemoteObject.concat(RemoteObject.createImmutable("bg-"),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_background))),RemoteObject.createImmutable("")));Debug.locals.put("bg", _bg);Debug.locals.put("bg", _bg);
 BA.debugLineNum = 59;BA.debugLine="InfoBox.AddClass(bg)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_bg));
 BA.debugLineNum = 60;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 61;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _forecolor) throws Exception{
try {
		Debug.PushSubsStack("SetColor (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "vminfobox","setcolor", __ref, _forecolor);}
RemoteObject _bg = RemoteObject.createImmutable("");
Debug.locals.put("foreColor", _forecolor);
 BA.debugLineNum = 70;BA.debugLine="Sub SetColor(foreColor As String) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="Dim bg As String = $\"col-${foreColor}\"$";
Debug.JustUpdateDeviceLine();
_bg = (RemoteObject.concat(RemoteObject.createImmutable("col-"),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_forecolor))),RemoteObject.createImmutable("")));Debug.locals.put("bg", _bg);Debug.locals.put("bg", _bg);
 BA.debugLineNum = 72;BA.debugLine="InfoBox.AddClass(bg)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_bg));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vminfobox","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 175;BA.debugLine="Sub SetDisabled(b As Boolean) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="InfoBox.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 177;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 178;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfrom(RemoteObject __ref,RemoteObject _startfrom) throws Exception{
try {
		Debug.PushSubsStack("SetFrom (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("setfrom")) { return __ref.runUserSub(false, "vminfobox","setfrom", __ref, _startfrom);}
Debug.locals.put("startFrom", _startfrom);
 BA.debugLineNum = 81;BA.debugLine="Sub SetFrom(startFrom As String) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="If startFrom = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_startfrom,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 83;BA.debugLine="CountIt.AddClass(\"count-to\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("count-to")));
 BA.debugLineNum = 84;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-from\": startFrom)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vminfobox.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-from")),(_startfrom)}))));
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
public static RemoteObject  _sethoverexpandeffect(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHoverExpandEffect (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("sethoverexpandeffect")) { return __ref.runUserSub(false, "vminfobox","sethoverexpandeffect", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 136;BA.debugLine="Sub SetHoverExpandEffect(b As Boolean) As VMInfoBo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vminfobox.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 138;BA.debugLine="InfoBox.AddClass(\"hover-expand-effect\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("hover-expand-effect")));
 BA.debugLineNum = 139;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethoverzoomeffect(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHoverZoomEffect (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("sethoverzoomeffect")) { return __ref.runUserSub(false, "vminfobox","sethoverzoomeffect", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 130;BA.debugLine="Sub SetHoverZoomEffect(b As Boolean) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vminfobox.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 132;BA.debugLine="InfoBox.AddClass(\"hover-zoom-effect\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("hover-zoom-effect")));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _maticon) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vminfobox","seticon", __ref, _maticon);}
Debug.locals.put("matIcon", _maticon);
 BA.debugLineNum = 114;BA.debugLine="Sub SetIcon(matIcon As String) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="If matIcon = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_maticon,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 116;BA.debugLine="hasIcon = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasicon" /*RemoteObject*/ ,vminfobox.__c.getField(true,"True"));
 BA.debugLineNum = 117;BA.debugLine="i.SetText(matIcon)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_i" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_maticon));
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
public static RemoteObject  _seticonbackgroundcolor(RemoteObject __ref,RemoteObject _background) throws Exception{
try {
		Debug.PushSubsStack("SetIconBackgroundColor (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("seticonbackgroundcolor")) { return __ref.runUserSub(false, "vminfobox","seticonbackgroundcolor", __ref, _background);}
RemoteObject _bg = RemoteObject.createImmutable("");
Debug.locals.put("background", _background);
 BA.debugLineNum = 49;BA.debugLine="Sub SetIconBackgroundColor(background As String) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="If background = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_background,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 51;BA.debugLine="Dim bg As String = $\"bg-${background}\"$";
Debug.JustUpdateDeviceLine();
_bg = (RemoteObject.concat(RemoteObject.createImmutable("bg-"),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_background))),RemoteObject.createImmutable("")));Debug.locals.put("bg", _bg);Debug.locals.put("bg", _bg);
 BA.debugLineNum = 52;BA.debugLine="Icon.AddClass(bg)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_bg));
 BA.debugLineNum = 53;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticoncolor(RemoteObject __ref,RemoteObject _forecolor) throws Exception{
try {
		Debug.PushSubsStack("SetIconColor (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("seticoncolor")) { return __ref.runUserSub(false, "vminfobox","seticoncolor", __ref, _forecolor);}
RemoteObject _bg = RemoteObject.createImmutable("");
Debug.locals.put("foreColor", _forecolor);
 BA.debugLineNum = 63;BA.debugLine="Sub SetIconColor(foreColor As String) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="If foreColor = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_forecolor,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 65;BA.debugLine="Dim bg As String = $\"col-${foreColor}\"$";
Debug.JustUpdateDeviceLine();
_bg = (RemoteObject.concat(RemoteObject.createImmutable("col-"),vminfobox.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_forecolor))),RemoteObject.createImmutable("")));Debug.locals.put("bg", _bg);Debug.locals.put("bg", _bg);
 BA.debugLineNum = 66;BA.debugLine="I.AddClass(bg)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_i" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_bg));
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
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,153);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vminfobox","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 153;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMInfo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 154;BA.debugLine="InfoBox.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
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
public static RemoteObject  _setnumber(RemoteObject __ref,RemoteObject _numo) throws Exception{
try {
		Debug.PushSubsStack("SetNumber (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setnumber")) { return __ref.runUserSub(false, "vminfobox","setnumber", __ref, _numo);}
Debug.locals.put("numo", _numo);
 BA.debugLineNum = 95;BA.debugLine="Sub SetNumber(numo As String) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="CountIt.SetText(numo)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_numo));
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
public static RemoteObject  _setrefreshinterval(RemoteObject __ref,RemoteObject _interval) throws Exception{
try {
		Debug.PushSubsStack("SetRefreshInterval (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("setrefreshinterval")) { return __ref.runUserSub(false, "vminfobox","setrefreshinterval", __ref, _interval);}
Debug.locals.put("interval", _interval);
 BA.debugLineNum = 107;BA.debugLine="Sub SetRefreshInterval(interval As String) As VMIn";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="If interval = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_interval,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 109;BA.debugLine="CountIt.AddClass(\"count-to\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("count-to")));
 BA.debugLineNum = 110;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-fresh-interval\":i";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vminfobox.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-fresh-interval")),(_interval)}))));
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
public static RemoteObject  _setspeed(RemoteObject __ref,RemoteObject _speed) throws Exception{
try {
		Debug.PushSubsStack("SetSpeed (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("setspeed")) { return __ref.runUserSub(false, "vminfobox","setspeed", __ref, _speed);}
Debug.locals.put("speed", _speed);
 BA.debugLineNum = 100;BA.debugLine="Sub SetSpeed(speed As String) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="If speed = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_speed,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 102;BA.debugLine="CountIt.AddClass(\"count-to\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("count-to")));
 BA.debugLineNum = 103;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-speed\":speed))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vminfobox.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-speed")),(_speed)}))));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vminfobox","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 143;BA.debugLine="Sub SetStyle(sm As Map) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="InfoBox.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 145;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 146;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstyle2(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyle2 (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("setstyle2")) { return __ref.runUserSub(false, "vminfobox","setstyle2", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 34;BA.debugLine="Sub SetStyle2(b As Boolean) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="InfoBox.removeclass(\"info-box\").addclass(\"info-bo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("info-box"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("info-box-2")));
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
public static RemoteObject  _setstyle3(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyle3 (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("setstyle3")) { return __ref.runUserSub(false, "vminfobox","setstyle3", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 39;BA.debugLine="Sub SetStyle3(b As Boolean) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="InfoBox.removeclass(\"info-box\").addclass(\"info-bo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("info-box"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("info-box-3")));
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
public static RemoteObject  _setstyle4(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetStyle4 (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setstyle4")) { return __ref.runUserSub(false, "vminfobox","setstyle4", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 44;BA.debugLine="Sub SetStyle4(b As Boolean) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="InfoBox.removeclass(\"info-box\").addclass(\"info-bo";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("info-box"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("info-box-4")));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("SetText (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,76);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vminfobox","settext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 76;BA.debugLine="Sub SetText(txt As String) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 77;BA.debugLine="Text.SetText(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_text" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_txt));
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
public static RemoteObject  _setto(RemoteObject __ref,RemoteObject _endto) throws Exception{
try {
		Debug.PushSubsStack("SetTo (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setto")) { return __ref.runUserSub(false, "vminfobox","setto", __ref, _endto);}
Debug.locals.put("endTo", _endto);
 BA.debugLineNum = 88;BA.debugLine="Sub SetTo(endTo As String) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="If endTo = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_endto,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 90;BA.debugLine="CountIt.AddClass(\"count-to\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("count-to")));
 BA.debugLineNum = 91;BA.debugLine="CountIt.SetAttr(CreateMap(\"data-to\": endTo))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vminfobox.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("data-to")),(_endto)}))));
 BA.debugLineNum = 92;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 93;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vminfobox","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 148;BA.debugLine="Sub SetVIf(vif As Object) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="InfoBox.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vminfobox","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 158;BA.debugLine="Sub SetVShow(vif As Object) As VMInfoBox";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="InfoBox.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vminfobox) ","vminfobox",65,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vminfobox","tostring", __ref);}
 BA.debugLineNum = 121;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="If hasIcon Then i.Pop(Icon)";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasicon" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_i" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_icon" /*RemoteObject*/ )));};
 BA.debugLineNum = 123;BA.debugLine="Icon.Pop(InfoBox)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_infobox" /*RemoteObject*/ )));
 BA.debugLineNum = 124;BA.debugLine="Text.Pop(Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_text" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 125;BA.debugLine="CountIt.Pop(Content)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_countit" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_content" /*RemoteObject*/ )));
 BA.debugLineNum = 126;BA.debugLine="Content.Pop(InfoBox)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_content" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_infobox" /*RemoteObject*/ )));
 BA.debugLineNum = 127;BA.debugLine="Return InfoBox.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_infobox" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 128;BA.debugLine="End Sub";
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