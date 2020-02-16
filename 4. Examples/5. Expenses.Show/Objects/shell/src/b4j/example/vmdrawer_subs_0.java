package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmdrawer_subs_0 {


public static RemoteObject  _addavatar(RemoteObject __ref,RemoteObject _key,RemoteObject _imgurl,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddAvatar (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("addavatar")) { return __ref.runUserSub(false, "vmdrawer","addavatar", __ref, _key, _imgurl, _text);}
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("key", _key);
Debug.locals.put("imgURL", _imgurl);
Debug.locals.put("text", _text);
 BA.debugLineNum = 79;BA.debugLine="Sub AddAvatar(key As String, imgURL As String, tex";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="Dim item As VMListItem";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 81;BA.debugLine="item.Initialize(vue, key, module)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 82;BA.debugLine="item.SetAvatar(imgURL)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_setavatar" /*RemoteObject*/ ,(Object)(_imgurl));
 BA.debugLineNum = 83;BA.debugLine="item.SetText(text)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 84;BA.debugLine="items.Put(key, item)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_item)));
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmdrawer","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 126;BA.debugLine="Sub AddClass(c As String) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="Drawer.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _additem(RemoteObject __ref,RemoteObject _key,RemoteObject _icon,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddItem (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("additem")) { return __ref.runUserSub(false, "vmdrawer","additem", __ref, _key, _icon, _text);}
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("key", _key);
Debug.locals.put("icon", _icon);
Debug.locals.put("text", _text);
 BA.debugLineNum = 99;BA.debugLine="Sub AddItem(key As String, icon As String, text As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="Dim item As VMListItem";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 101;BA.debugLine="item.Initialize(vue, key, module)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 102;BA.debugLine="item.SetIcon(icon, False)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_seticon" /*RemoteObject*/ ,(Object)(_icon),(Object)(vmdrawer.__c.getField(true,"False")));
 BA.debugLineNum = 103;BA.debugLine="item.SetText(text)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 104;BA.debugLine="items.Put(key, item)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_item)));
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
public static RemoteObject  _addsubavatar(RemoteObject __ref,RemoteObject _parent,RemoteObject _key,RemoteObject _imgurl,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddSubAvatar (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("addsubavatar")) { return __ref.runUserSub(false, "vmdrawer","addsubavatar", __ref, _parent, _key, _imgurl, _text);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
RemoteObject _pl = RemoteObject.declareNull("b4j.example.vmlist");
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("parent", _parent);
Debug.locals.put("key", _key);
Debug.locals.put("imgURL", _imgurl);
Debug.locals.put("text", _text);
 BA.debugLineNum = 87;BA.debugLine="Sub AddSubAvatar(parent As String, key As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="If items.ContainsKey(parent) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_parent))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 89;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
Debug.JustUpdateDeviceLine();
_li = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));Debug.locals.put("li", _li);Debug.locals.put("li", _li);
 BA.debugLineNum = 90;BA.debugLine="Dim pl As VMList = li.childList";
Debug.JustUpdateDeviceLine();
_pl = _li.getField(false,"_childlist" /*RemoteObject*/ );Debug.locals.put("pl", _pl);Debug.locals.put("pl", _pl);
 BA.debugLineNum = 91;BA.debugLine="Dim item As VMListItem";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 92;BA.debugLine="item.Initialize(vue, key, module)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 93;BA.debugLine="item.SetAvatar(imgURL)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_setavatar" /*RemoteObject*/ ,(Object)(_imgurl));
 BA.debugLineNum = 94;BA.debugLine="item.SetText(text)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 95;BA.debugLine="item.Pop(pl)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)(_pl));
 };
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
public static RemoteObject  _addsubitem(RemoteObject __ref,RemoteObject _parent,RemoteObject _key,RemoteObject _icon,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddSubItem (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,107);
if (RapidSub.canDelegate("addsubitem")) { return __ref.runUserSub(false, "vmdrawer","addsubitem", __ref, _parent, _key, _icon, _text);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
RemoteObject _pl = RemoteObject.declareNull("b4j.example.vmlist");
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("parent", _parent);
Debug.locals.put("key", _key);
Debug.locals.put("icon", _icon);
Debug.locals.put("text", _text);
 BA.debugLineNum = 107;BA.debugLine="Sub AddSubItem(parent As String, key As String, ic";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 108;BA.debugLine="If items.ContainsKey(parent) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_parent))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 109;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
Debug.JustUpdateDeviceLine();
_li = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));Debug.locals.put("li", _li);Debug.locals.put("li", _li);
 BA.debugLineNum = 110;BA.debugLine="Dim pl As VMList = li.childList";
Debug.JustUpdateDeviceLine();
_pl = _li.getField(false,"_childlist" /*RemoteObject*/ );Debug.locals.put("pl", _pl);Debug.locals.put("pl", _pl);
 BA.debugLineNum = 111;BA.debugLine="Dim item As VMListItem";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 112;BA.debugLine="item.Initialize(vue, key, module)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 113;BA.debugLine="item.SetIcon(icon, False)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_seticon" /*RemoteObject*/ ,(Object)(_icon),(Object)(vmdrawer.__c.getField(true,"False")));
 BA.debugLineNum = 114;BA.debugLine="item.SetText(text)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 115;BA.debugLine="item.SetInset(True)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_setinset" /*RemoteObject*/ ,(Object)(vmdrawer.__c.getField(true,"True")));
 BA.debugLineNum = 116;BA.debugLine="item.Pop(pl)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)(_pl));
 };
 BA.debugLineNum = 118;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _back1_click(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("back1_click (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("back1_click")) { return __ref.runUserSub(false, "vmdrawer","back1_click", __ref, _e);}
RemoteObject _bdrawer = RemoteObject.createImmutable(false);
Debug.locals.put("e", _e);
 BA.debugLineNum = 164;BA.debugLine="Sub back1_click(e As BANanoEvent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="Toggle";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_toggle" /*RemoteObject*/ );
 BA.debugLineNum = 166;BA.debugLine="Dim bDrawer As Boolean = vue.GetState(\"drawer\",Fa";
Debug.JustUpdateDeviceLine();
_bdrawer = BA.ObjectToBoolean(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(BA.ObjectToString("drawer")),(Object)((vmdrawer.__c.getField(true,"False")))));Debug.locals.put("bDrawer", _bdrawer);Debug.locals.put("bDrawer", _bdrawer);
 BA.debugLineNum = 167;BA.debugLine="bDrawer = Not(bDrawer)";
Debug.JustUpdateDeviceLine();
_bdrawer = vmdrawer.__c.runMethod(true,"Not",(Object)(_bdrawer));Debug.locals.put("bDrawer", _bdrawer);
 BA.debugLineNum = 168;BA.debugLine="vue.SetStateSingle(\"menushow\", bDrawer)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("menushow")),(Object)((_bdrawer)));
 BA.debugLineNum = 169;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Drawer As VMElement";
vmdrawer._drawer = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_drawer",vmdrawer._drawer);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmdrawer._id = RemoteObject.createImmutable("");__ref.setField("_id",vmdrawer._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmdrawer._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmdrawer._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private bActive As Boolean";
vmdrawer._bactive = RemoteObject.createImmutable(false);__ref.setField("_bactive",vmdrawer._bactive);
 //BA.debugLineNum = 7;BA.debugLine="Private DrawerList As VMList";
vmdrawer._drawerlist = RemoteObject.createNew ("b4j.example.vmlist");__ref.setField("_drawerlist",vmdrawer._drawerlist);
 //BA.debugLineNum = 8;BA.debugLine="Private items As Map";
vmdrawer._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_items",vmdrawer._items);
 //BA.debugLineNum = 9;BA.debugLine="Private mshow As String";
vmdrawer._mshow = RemoteObject.createImmutable("");__ref.setField("_mshow",vmdrawer._mshow);
 //BA.debugLineNum = 10;BA.debugLine="Public ToolBar As VMToolBar";
vmdrawer._toolbar = RemoteObject.createNew ("b4j.example.vmtoolbar");__ref.setField("_toolbar",vmdrawer._toolbar);
 //BA.debugLineNum = 11;BA.debugLine="Private module As Object";
vmdrawer._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmdrawer._module);
 //BA.debugLineNum = 12;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmdrawer","hide", __ref);}
 BA.debugLineNum = 57;BA.debugLine="Sub Hide";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="vue.SetStateSingle(ID, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)((vmdrawer.__c.getField(true,"False"))));
 BA.debugLineNum = 60;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Initialize (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,14);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmdrawer","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 14;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 15;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 16;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 17;BA.debugLine="Drawer.Initialize(vue, ID).SetTag(\"md-app-drawer\"";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-app-drawer")));
 BA.debugLineNum = 18;BA.debugLine="bActive = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmdrawer.__c.getField(true,"False"));
 BA.debugLineNum = 19;BA.debugLine="If ID <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(true,"_id" /*RemoteObject*/ ),BA.ObjectToString(""))) { 
 BA.debugLineNum = 20;BA.debugLine="SetActiveSync(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setactivesync" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 22;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 23;BA.debugLine="DrawerList.Initialize(vue,$\"${ID}list\"$, eventHan";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawerlist" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmdrawer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("list")))),(Object)(_eventhandler));
 BA.debugLineNum = 24;BA.debugLine="DrawerList.SetExpandSingle(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawerlist" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setexpandsingle" /*RemoteObject*/ ,(Object)(vmdrawer.__c.getField(true,"True")));
 BA.debugLineNum = 25;BA.debugLine="items.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 26;BA.debugLine="mshow = \"\"";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshow" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 27;BA.debugLine="ToolBar.Initialize(vue,$\"${ID}tblbar\"$, eventHand";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmdrawer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("tblbar")))),(Object)(_eventhandler));
 BA.debugLineNum = 28;BA.debugLine="ToolBar.SetTransparent(True).SetElevation(0)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_settransparent" /*RemoteObject*/ ,(Object)(vmdrawer.__c.getField(true,"True"))).runClassMethod (b4j.example.vmtoolbar.class, "_setelevation" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, 0)));
 BA.debugLineNum = 29;BA.debugLine="ToolBar.SetTitle(\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_settitle" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 30;BA.debugLine="Drawer.RemoveAttr(\"v-show\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("v-show")));
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
		Debug.PushSubsStack("Pop (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmdrawer","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 175;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmdrawer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 177;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmdrawer","render", __ref);}
 BA.debugLineNum = 171;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 172;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmdrawer.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 173;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactive(RemoteObject __ref,RemoteObject _varactive) throws Exception{
try {
		Debug.PushSubsStack("SetActive (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("setactive")) { return __ref.runUserSub(false, "vmdrawer","setactive", __ref, _varactive);}
Debug.locals.put("varActive", _varactive);
 BA.debugLineNum = 180;BA.debugLine="Sub SetActive(varActive As Object) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="SetAttr(CreateMap(\"md-active\": varActive))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-active")),_varactive}))));
 BA.debugLineNum = 182;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 183;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetActiveSync (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("setactivesync")) { return __ref.runUserSub(false, "vmdrawer","setactivesync", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 137;BA.debugLine="private Sub SetActiveSync(v As String) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="Drawer.SetActiveSync(v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setactivesync" /*RemoteObject*/ ,(Object)(_v));
 BA.debugLineNum = 139;BA.debugLine="bActive = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmdrawer.__c.getField(true,"True"));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmdrawer","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 132;BA.debugLine="Sub SetAttr(attr As Map) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="Drawer.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmdrawer","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 120;BA.debugLine="Sub SetElevation(e As Int) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="Drawer.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
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
public static RemoteObject  _setfixed(RemoteObject __ref,RemoteObject _varfixed) throws Exception{
try {
		Debug.PushSubsStack("SetFixed (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,192);
if (RapidSub.canDelegate("setfixed")) { return __ref.runUserSub(false, "vmdrawer","setfixed", __ref, _varfixed);}
Debug.locals.put("varFixed", _varfixed);
 BA.debugLineNum = 192;BA.debugLine="Sub SetFixed(varFixed As Boolean) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 193;BA.debugLine="SetAttr(CreateMap(\":md-fixed\": varFixed))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-fixed")),(_varfixed)}))));
 BA.debugLineNum = 194;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 195;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpermanent(RemoteObject __ref,RemoteObject _varpermanent) throws Exception{
try {
		Debug.PushSubsStack("SetPermanent (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("setpermanent")) { return __ref.runUserSub(false, "vmdrawer","setpermanent", __ref, _varpermanent);}
Debug.locals.put("varPermanent", _varpermanent);
 BA.debugLineNum = 204;BA.debugLine="Sub SetPermanent(varPermanent As Object) As VMDraw";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 205;BA.debugLine="SetAttr(CreateMap(\"md-permanent\": varPermanent))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-permanent")),_varpermanent}))));
 BA.debugLineNum = 206;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 207;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpermanentcard(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPermanentCard (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("setpermanentcard")) { return __ref.runUserSub(false, "vmdrawer","setpermanentcard", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 216;BA.debugLine="Sub SetPermanentCard(b As Boolean) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="SetAttr(CreateMap(\"md-permanent\": \"card\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-permanent")),(RemoteObject.createImmutable("card"))}))));
 BA.debugLineNum = 218;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 219;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpermanentclipped(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPermanentClipped (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,210);
if (RapidSub.canDelegate("setpermanentclipped")) { return __ref.runUserSub(false, "vmdrawer","setpermanentclipped", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 210;BA.debugLine="Sub SetPermanentClipped(b As Boolean) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 211;BA.debugLine="SetAttr(CreateMap(\"md-permanent\": \"clipped\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-permanent")),(RemoteObject.createImmutable("clipped"))}))));
 BA.debugLineNum = 212;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 213;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpermanentfull(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPermanentFull (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,143);
if (RapidSub.canDelegate("setpermanentfull")) { return __ref.runUserSub(false, "vmdrawer","setpermanentfull", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 143;BA.debugLine="Sub SetPermanentFull(b As Boolean) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 144;BA.debugLine="Drawer.SetPermanentFull(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpermanentfull" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setpersistent(RemoteObject __ref,RemoteObject _varpersistent) throws Exception{
try {
		Debug.PushSubsStack("SetPersistent (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,222);
if (RapidSub.canDelegate("setpersistent")) { return __ref.runUserSub(false, "vmdrawer","setpersistent", __ref, _varpersistent);}
Debug.locals.put("varPersistent", _varpersistent);
 BA.debugLineNum = 222;BA.debugLine="Sub SetPersistent(varPersistent As Object) As VMDr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 223;BA.debugLine="SetAttr(CreateMap(\"md-persistent\": varPersistent)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-persistent")),_varpersistent}))));
 BA.debugLineNum = 224;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 225;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpersistentfull(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPersistentFull (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,228);
if (RapidSub.canDelegate("setpersistentfull")) { return __ref.runUserSub(false, "vmdrawer","setpersistentfull", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 228;BA.debugLine="Sub SetPersistentFull(b As Boolean) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 229;BA.debugLine="SetAttr(CreateMap(\"md-persistent\": \"full\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-persistent")),(RemoteObject.createImmutable("full"))}))));
 BA.debugLineNum = 230;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 231;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpersistentmini(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPersistentMini (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("setpersistentmini")) { return __ref.runUserSub(false, "vmdrawer","setpersistentmini", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 234;BA.debugLine="Sub SetPersistentMini(b As Boolean) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="SetAttr(CreateMap(\"md-persistent\": \"mini\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-persistent")),(RemoteObject.createImmutable("mini"))}))));
 BA.debugLineNum = 236;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 237;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setright(RemoteObject __ref,RemoteObject _varright) throws Exception{
try {
		Debug.PushSubsStack("SetRight (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("setright")) { return __ref.runUserSub(false, "vmdrawer","setright", __ref, _varright);}
Debug.locals.put("varRight", _varright);
 BA.debugLineNum = 198;BA.debugLine="Sub SetRight(varRight As Boolean) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 199;BA.debugLine="SetAttr(CreateMap(\":md-right\": varRight))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-right")),(_varright)}))));
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
public static RemoteObject  _setswipeable(RemoteObject __ref,RemoteObject _varswipeable) throws Exception{
try {
		Debug.PushSubsStack("SetSwipeable (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("setswipeable")) { return __ref.runUserSub(false, "vmdrawer","setswipeable", __ref, _varswipeable);}
Debug.locals.put("varSwipeable", _varswipeable);
 BA.debugLineNum = 186;BA.debugLine="Sub SetSwipeable(varSwipeable As Boolean) As VMDra";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="SetAttr(CreateMap(\":md-swipeable\": varSwipeable))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-swipeable")),(_varswipeable)}))));
 BA.debugLineNum = 188;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setswiperestraint(RemoteObject __ref,RemoteObject _varswipe) throws Exception{
try {
		Debug.PushSubsStack("SetSwipeRestraint (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("setswiperestraint")) { return __ref.runUserSub(false, "vmdrawer","setswiperestraint", __ref, _varswipe);}
Debug.locals.put("varSwipe", _varswipe);
 BA.debugLineNum = 246;BA.debugLine="Sub SetSwipeRestraint(varSwipe As Object) As VMDra";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 247;BA.debugLine="SetAttr(CreateMap(\"md-swipe-restraint\": varSwipe)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-swipe-restraint")),_varswipe}))));
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
public static RemoteObject  _setswipethreshold(RemoteObject __ref,RemoteObject _varswipe) throws Exception{
try {
		Debug.PushSubsStack("SetSwipeThreshold (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("setswipethreshold")) { return __ref.runUserSub(false, "vmdrawer","setswipethreshold", __ref, _varswipe);}
Debug.locals.put("varSwipe", _varswipe);
 BA.debugLineNum = 240;BA.debugLine="Sub SetSwipeThreshold(varSwipe As Object) As VMDra";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 241;BA.debugLine="SetAttr(CreateMap(\"md-swipe-threshold\": varSwipe)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-swipe-threshold")),_varswipe}))));
 BA.debugLineNum = 242;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 243;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setswipetime(RemoteObject __ref,RemoteObject _varswipe) throws Exception{
try {
		Debug.PushSubsStack("SetSwipeTime (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("setswipetime")) { return __ref.runUserSub(false, "vmdrawer","setswipetime", __ref, _varswipe);}
Debug.locals.put("varSwipe", _varswipe);
 BA.debugLineNum = 252;BA.debugLine="Sub SetSwipeTime(varSwipe As Object) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 253;BA.debugLine="SetAttr(CreateMap(\"md-swipe-time\": varSwipe))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmdrawer.class, "_setattr" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-swipe-time")),_varswipe}))));
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
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _newtitle) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,34);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmdrawer","settitle", __ref, _newtitle);}
Debug.locals.put("newTitle", _newtitle);
 BA.debugLineNum = 34;BA.debugLine="Sub SetTitle(newTitle As String) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 35;BA.debugLine="vue.SetState(CreateMap(\"drawertblbartitle\":newTit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("drawertblbartitle")),(_newtitle)}))));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vshow) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmdrawer","setvif", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 68;BA.debugLine="Sub SetVIf(vshow As String) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="Drawer.SetVif(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vshow));
 BA.debugLineNum = 70;BA.debugLine="mshow = vshow";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshow" /*RemoteObject*/ ,_vshow);
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vshow) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmdrawer","setvshow", __ref, _vshow);}
Debug.locals.put("vshow", _vshow);
 BA.debugLineNum = 62;BA.debugLine="Sub SetVShow(vshow As String) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="Drawer.SetVShow(vshow)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vshow));
 BA.debugLineNum = 64;BA.debugLine="mshow = vshow";
Debug.JustUpdateDeviceLine();
__ref.setField ("_mshow" /*RemoteObject*/ ,_vshow);
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
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _width) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,75);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmdrawer","setwidth", __ref, _width);}
Debug.locals.put("width", _width);
 BA.debugLineNum = 75;BA.debugLine="Sub SetWidth(width As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 76;BA.debugLine="vue.SetStyle(\".md-drawer\", \"width\", width)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString(".md-drawer")),(Object)(BA.ObjectToString("width")),(Object)(_width));
 BA.debugLineNum = 77;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmdrawer","show", __ref);}
 BA.debugLineNum = 51;BA.debugLine="Sub Show";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="vue.SetStateSingle(ID,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)((vmdrawer.__c.getField(true,"True"))));
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _toggle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Toggle (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("toggle")) { return __ref.runUserSub(false, "vmdrawer","toggle", __ref);}
RemoteObject _bstate = RemoteObject.createImmutable(false);
 BA.debugLineNum = 44;BA.debugLine="Sub Toggle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="vue.ToggleState(ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_togglestate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 46;BA.debugLine="Dim bstate As Boolean = vue.GetState(ID,True)";
Debug.JustUpdateDeviceLine();
_bstate = BA.ObjectToBoolean(__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)((vmdrawer.__c.getField(true,"True")))));Debug.locals.put("bstate", _bstate);Debug.locals.put("bstate", _bstate);
 BA.debugLineNum = 47;BA.debugLine="vue.SetStateSingle(\"back1show\", bstate)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("back1show")),(Object)((_bstate)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,148);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmdrawer","tostring", __ref);}
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
RemoteObject _cl = RemoteObject.declareNull("b4j.example.vmlist");
 BA.debugLineNum = 148;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 149;BA.debugLine="ToolBar.CreateButton(\"back1\").SetOnClick(Me).SetD";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_createbutton" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("back1"))).runClassMethod (b4j.example.vmbutton.class, "_setonclick" /*RemoteObject*/ ,(Object)(__ref)).runClassMethod (b4j.example.vmbutton.class, "_setdense" /*RemoteObject*/ ,(Object)(vmdrawer.__c.getField(true,"True"))).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("keyboard_arrow_left"))).runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(vmdrawer.__c.getField(true,"True"))).runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_toolbar" /*RemoteObject*/ ).getField(false,"_endsection" /*RemoteObject*/ )));
 BA.debugLineNum = 150;BA.debugLine="ToolBar.Pop(Drawer)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_drawer" /*RemoteObject*/ )));
 BA.debugLineNum = 152;BA.debugLine="For Each item As VMListItem In items.Values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_item = (group3.runMethod(false,"Get",index3));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 153;BA.debugLine="Dim cl As VMList = item.childList";
Debug.JustUpdateDeviceLine();
_cl = _item.getField(false,"_childlist" /*RemoteObject*/ );Debug.locals.put("cl", _cl);Debug.locals.put("cl", _cl);
 BA.debugLineNum = 154;BA.debugLine="If cl.HasContent Then item.SetList(cl)";
Debug.JustUpdateDeviceLine();
if (_cl.getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_item.runClassMethod (b4j.example.vmlistitem.class, "_setlist" /*RemoteObject*/ ,(Object)(_cl));};
 BA.debugLineNum = 155;BA.debugLine="item.Pop(DrawerList)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_drawerlist" /*RemoteObject*/ )));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 157;BA.debugLine="If DrawerList.HasContent Then DrawerList.Pop(Draw";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_drawerlist" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_drawerlist" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_drawer" /*RemoteObject*/ )));};
 BA.debugLineNum = 158;BA.debugLine="If bActive = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(true,"_bactive" /*RemoteObject*/ ),vmdrawer.__c.getField(true,"False"))) { 
 BA.debugLineNum = 159;BA.debugLine="Log($\"VMDrawer.SetActiveSync: '${ID}' has not be";
Debug.JustUpdateDeviceLine();
vmdrawer.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMDrawer.SetActiveSync: '"),vmdrawer.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("' has not been activated!")))));
 };
 BA.debugLineNum = 161;BA.debugLine="Return Drawer.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_drawer" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _updatetitle(RemoteObject __ref,RemoteObject _newtitle) throws Exception{
try {
		Debug.PushSubsStack("UpdateTitle (vmdrawer) ","vmdrawer",52,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("updatetitle")) { return __ref.runUserSub(false, "vmdrawer","updatetitle", __ref, _newtitle);}
Debug.locals.put("newTitle", _newtitle);
 BA.debugLineNum = 39;BA.debugLine="Sub UpdateTitle(newTitle As String) As VMDrawer";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="vue.SetState(CreateMap(\"drawertblbartitle\":newTit";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(vmdrawer.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("drawertblbartitle")),(_newtitle)}))));
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
}