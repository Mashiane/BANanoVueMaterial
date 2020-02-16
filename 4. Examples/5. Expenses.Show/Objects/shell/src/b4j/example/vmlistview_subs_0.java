package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmlistview_subs_0 {


public static RemoteObject  _addavatar(RemoteObject __ref,RemoteObject _key,RemoteObject _imgurl,RemoteObject _text,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("AddAvatar (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("addavatar")) { return __ref.runUserSub(false, "vmlistview","addavatar", __ref, _key, _imgurl, _text, _badge);}
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("key", _key);
Debug.locals.put("imgURL", _imgurl);
Debug.locals.put("text", _text);
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 28;BA.debugLine="Sub AddAvatar(key As String, imgURL As String, tex";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="key = key.tolowercase";
Debug.JustUpdateDeviceLine();
_key = _key.runMethod(true,"toLowerCase");Debug.locals.put("key", _key);
 BA.debugLineNum = 30;BA.debugLine="Dim item As VMListItem";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 31;BA.debugLine="item.Initialize(vue, key,eventHandler)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 32;BA.debugLine="item.SetAvatar(imgURL)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_setavatar" /*RemoteObject*/ ,(Object)(_imgurl));
 BA.debugLineNum = 33;BA.debugLine="item.SetText(text)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 34;BA.debugLine="If badge <> Null Then item.SetBadge(badge,True,\"t";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_badge)) { 
_item.runClassMethod (b4j.example.vmlistitem.class, "_setbadge" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _badge)),(Object)(vmlistview.__c.getField(true,"True")),(Object)(BA.ObjectToString("top")),(Object)(vmlistview.__c.getField(true,"True")),(Object)(vmlistview.__c.getField(true,"False")));};
 BA.debugLineNum = 35;BA.debugLine="items.Put(key, item)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_item)));
 BA.debugLineNum = 36;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmlistview","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 115;BA.debugLine="Sub AddClass(c As String) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="ListView.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _additem(RemoteObject __ref,RemoteObject _key,RemoteObject _icon,RemoteObject _text,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("AddItem (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("additem")) { return __ref.runUserSub(false, "vmlistview","additem", __ref, _key, _icon, _text, _badge);}
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("key", _key);
Debug.locals.put("icon", _icon);
Debug.locals.put("text", _text);
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 50;BA.debugLine="Sub AddItem(key As String, icon As String, text As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Dim item As VMListItem";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 52;BA.debugLine="item.Initialize(vue, key,eventHandler)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 53;BA.debugLine="item.SetIcon(icon, False)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_seticon" /*RemoteObject*/ ,(Object)(_icon),(Object)(vmlistview.__c.getField(true,"False")));
 BA.debugLineNum = 54;BA.debugLine="item.SetText(text)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 55;BA.debugLine="If badge <> Null Then item.SetBadge(badge,True,\"t";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_badge)) { 
_item.runClassMethod (b4j.example.vmlistitem.class, "_setbadge" /*RemoteObject*/ ,(Object)(BA.numberCast(int.class, _badge)),(Object)(vmlistview.__c.getField(true,"True")),(Object)(BA.ObjectToString("top")),(Object)(vmlistview.__c.getField(true,"True")),(Object)(vmlistview.__c.getField(true,"False")));};
 BA.debugLineNum = 56;BA.debugLine="items.Put(key, item)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_key)),(Object)((_item)));
 BA.debugLineNum = 57;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddSubAvatar (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("addsubavatar")) { return __ref.runUserSub(false, "vmlistview","addsubavatar", __ref, _parent, _key, _imgurl, _text);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
RemoteObject _pl = RemoteObject.declareNull("b4j.example.vmlist");
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("parent", _parent);
Debug.locals.put("key", _key);
Debug.locals.put("imgURL", _imgurl);
Debug.locals.put("text", _text);
 BA.debugLineNum = 38;BA.debugLine="Sub AddSubAvatar(parent As String, key As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="If items.ContainsKey(parent) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_parent))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 40;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
Debug.JustUpdateDeviceLine();
_li = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));Debug.locals.put("li", _li);Debug.locals.put("li", _li);
 BA.debugLineNum = 41;BA.debugLine="Dim pl As VMList = li.childList";
Debug.JustUpdateDeviceLine();
_pl = _li.getField(false,"_childlist" /*RemoteObject*/ );Debug.locals.put("pl", _pl);Debug.locals.put("pl", _pl);
 BA.debugLineNum = 42;BA.debugLine="Dim item As VMListItem";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 43;BA.debugLine="item.Initialize(vue, key,eventHandler)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 44;BA.debugLine="item.SetAvatar(imgURL)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_setavatar" /*RemoteObject*/ ,(Object)(_imgurl));
 BA.debugLineNum = 45;BA.debugLine="item.SetText(text)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 46;BA.debugLine="item.Pop(pl)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)(_pl));
 };
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
public static RemoteObject  _addsubitem(RemoteObject __ref,RemoteObject _parent,RemoteObject _key,RemoteObject _icon,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddSubItem (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("addsubitem")) { return __ref.runUserSub(false, "vmlistview","addsubitem", __ref, _parent, _key, _icon, _text);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
RemoteObject _pl = RemoteObject.declareNull("b4j.example.vmlist");
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("parent", _parent);
Debug.locals.put("key", _key);
Debug.locals.put("icon", _icon);
Debug.locals.put("text", _text);
 BA.debugLineNum = 59;BA.debugLine="Sub AddSubItem(parent As String, key As String, ic";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="If items.ContainsKey(parent) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_parent))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 61;BA.debugLine="Dim li As VMListItem = items.Get(parent)";
Debug.JustUpdateDeviceLine();
_li = (__ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));Debug.locals.put("li", _li);Debug.locals.put("li", _li);
 BA.debugLineNum = 62;BA.debugLine="Dim pl As VMList = li.childList";
Debug.JustUpdateDeviceLine();
_pl = _li.getField(false,"_childlist" /*RemoteObject*/ );Debug.locals.put("pl", _pl);Debug.locals.put("pl", _pl);
 BA.debugLineNum = 63;BA.debugLine="Dim item As VMListItem";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("item", _item);
 BA.debugLineNum = 64;BA.debugLine="item.Initialize(vue, key, eventHandler)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_key),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 65;BA.debugLine="item.SetIcon(icon, False)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_seticon" /*RemoteObject*/ ,(Object)(_icon),(Object)(vmlistview.__c.getField(true,"False")));
 BA.debugLineNum = 66;BA.debugLine="item.SetText(text)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 67;BA.debugLine="item.SetInset(True)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_setinset" /*RemoteObject*/ ,(Object)(vmlistview.__c.getField(true,"True")));
 BA.debugLineNum = 68;BA.debugLine="item.Pop(pl)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)(_pl));
 };
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,150);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmlistview","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 150;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 151;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmlistview.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 152;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public ListView As VMList";
vmlistview._listview = RemoteObject.createNew ("b4j.example.vmlist");__ref.setField("_listview",vmlistview._listview);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmlistview._id = RemoteObject.createImmutable("");__ref.setField("_id",vmlistview._id);
 //BA.debugLineNum = 5;BA.debugLine="Public vue As BANanoVue";
vmlistview._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmlistview._vue);
 //BA.debugLineNum = 6;BA.debugLine="Public HasContent As Boolean";
vmlistview._hascontent = RemoteObject.createImmutable(false);__ref.setField("_hascontent",vmlistview._hascontent);
 //BA.debugLineNum = 7;BA.debugLine="Private eventHandler As Object";
vmlistview._eventhandler = RemoteObject.createNew ("Object");__ref.setField("_eventhandler",vmlistview._eventhandler);
 //BA.debugLineNum = 8;BA.debugLine="Private items As Map";
vmlistview._items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_items",vmlistview._items);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _expanditem(RemoteObject __ref,RemoteObject _sid,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("ExpandItem (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("expanditem")) { return __ref.runUserSub(false, "vmlistview","expanditem", __ref, _sid, _b);}
RemoteObject _syncid = RemoteObject.createImmutable("");
Debug.locals.put("sid", _sid);
Debug.locals.put("b", _b);
 BA.debugLineNum = 73;BA.debugLine="Sub ExpandItem(sid As String, b As Boolean) As VML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="Dim syncid As String = $\"${ID}sync\"$";
Debug.JustUpdateDeviceLine();
_syncid = (RemoteObject.concat(RemoteObject.createImmutable(""),vmlistview.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("sync")));Debug.locals.put("syncid", _syncid);Debug.locals.put("syncid", _syncid);
 BA.debugLineNum = 75;BA.debugLine="vue.SetStateSingle(syncid, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_syncid),(Object)((_b)));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmlistview","initialize", __ref, _ba, _v, _sid, _module);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 14;BA.debugLine="ListView.Initialize(vue, ID,module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)(_module));
 BA.debugLineNum = 15;BA.debugLine="items.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_items" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 16;BA.debugLine="HasContent = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlistview.__c.getField(true,"False"));
 BA.debugLineNum = 17;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
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
		Debug.PushSubsStack("Pop (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmlistview","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 145;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmlistview.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 147;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmlistview","render", __ref);}
 BA.debugLineNum = 141;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmlistview.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmlistview","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 121;BA.debugLine="Sub SetAttr(attr As Map) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="ListView.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vmlistview","setborder", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 104;BA.debugLine="Sub SetBorder(b As Boolean) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="If b Then SetStyle(CreateMap(\"border\": \"1px solid";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmlistview.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlistview.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("border")),(RemoteObject.createImmutable("1px solid rgba(#000, .12)"))}))));};
 BA.debugLineNum = 106;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 107;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDense (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,89);
if (RapidSub.canDelegate("setdense")) { return __ref.runUserSub(false, "vmlistview","setdense", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 89;BA.debugLine="Sub SetDense(b As Boolean) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 90;BA.debugLine="If b Then AddClass(\"md-dense\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmlistview.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dense")));};
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmlistview","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 22;BA.debugLine="Sub SetDisabled(b As Boolean) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="ListView.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmlistview","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 109;BA.debugLine="Sub SetElevation(e As Int) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="ListView.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmlistview","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 99;BA.debugLine="Sub SetStyle(m As Map) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="ListView.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
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
public static RemoteObject  _settabindex(RemoteObject __ref,RemoteObject _ti) throws Exception{
try {
		Debug.PushSubsStack("SetTabIndex (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmlistview","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 79;BA.debugLine="Sub SetTabIndex(ti As String) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="ListView.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmlistview","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 126;BA.debugLine="Sub SetText(t As String) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="ListView.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 128;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlistview.__c.getField(true,"True"));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmlistview","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 94;BA.debugLine="Sub SetVIf(vif As Object) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="ListView.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmlistview","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 84;BA.debugLine="Sub SetVShow(vif As Object) As VMListView";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="ListView.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmlistview) ","vmlistview",72,__ref.getField(false, "ba"),__ref,132);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmlistview","tostring", __ref);}
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmlistitem");
RemoteObject _cl = RemoteObject.declareNull("b4j.example.vmlist");
 BA.debugLineNum = 132;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 133;BA.debugLine="For Each item As VMListItem In items.Values";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_items" /*RemoteObject*/ ).runMethod(false,"Values");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_item = (group1.runMethod(false,"Get",index1));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 134;BA.debugLine="Dim cl As VMList = item.childList";
Debug.JustUpdateDeviceLine();
_cl = _item.getField(false,"_childlist" /*RemoteObject*/ );Debug.locals.put("cl", _cl);Debug.locals.put("cl", _cl);
 BA.debugLineNum = 135;BA.debugLine="If cl.HasContent Then item.SetList(cl)";
Debug.JustUpdateDeviceLine();
if (_cl.getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
_item.runClassMethod (b4j.example.vmlistitem.class, "_setlist" /*RemoteObject*/ ,(Object)(_cl));};
 BA.debugLineNum = 136;BA.debugLine="item.Pop(ListView)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listview" /*RemoteObject*/ )));
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 138;BA.debugLine="Return ListView.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_listview" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 139;BA.debugLine="End Sub";
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