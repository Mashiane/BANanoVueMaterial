package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmbottombar_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmbottombar","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 78;BA.debugLine="Sub AddChild(child As VMElement) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 80;BA.debugLine="BottomBar.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmbottombar","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 124;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 126;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombar.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmbottombar","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 106;BA.debugLine="Sub AddClass(c As String) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="BottomBar.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _additem(RemoteObject __ref,RemoteObject _iid,RemoteObject _ilabel,RemoteObject _iicon,RemoteObject _badge) throws Exception{
try {
		Debug.PushSubsStack("AddItem (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("additem")) { return __ref.runUserSub(false, "vmbottombar","additem", __ref, _iid, _ilabel, _iicon, _badge);}
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmbottombaritem");
Debug.locals.put("iID", _iid);
Debug.locals.put("iLabel", _ilabel);
Debug.locals.put("iIcon", _iicon);
Debug.locals.put("badge", _badge);
 BA.debugLineNum = 28;BA.debugLine="Sub AddItem(iID As String, iLabel As String, iIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="Dim item As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
_item = RemoteObject.createNew ("b4j.example.vmbottombaritem");Debug.locals.put("item", _item);
 BA.debugLineNum = 30;BA.debugLine="item.Initialize(vue, iID, module)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmbottombaritem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_iid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="If badge = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_badge,BA.ObjectToString(""))) { 
 BA.debugLineNum = 32;BA.debugLine="item.SetLabel(iLabel)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmbottombaritem.class, "_setlabel" /*RemoteObject*/ ,(Object)(_ilabel));
 BA.debugLineNum = 33;BA.debugLine="item.SetIcon(iIcon)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmbottombaritem.class, "_seticon" /*RemoteObject*/ ,(Object)((_iicon)));
 }else {
 BA.debugLineNum = 35;BA.debugLine="item.SetIcon1(iIcon)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmbottombaritem.class, "_seticon1" /*RemoteObject*/ ,(Object)(_iicon));
 BA.debugLineNum = 36;BA.debugLine="item.SetLabel1(iLabel)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmbottombaritem.class, "_setlabel1" /*RemoteObject*/ ,(Object)(_ilabel));
 BA.debugLineNum = 37;BA.debugLine="item.SetBadge(badge)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmbottombaritem.class, "_setbadge" /*RemoteObject*/ ,(Object)(_badge));
 };
 BA.debugLineNum = 39;BA.debugLine="item.Pop(BottomBar)";
Debug.JustUpdateDeviceLine();
_item.runClassMethod (b4j.example.vmbottombaritem.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_bottombar" /*RemoteObject*/ )));
 BA.debugLineNum = 40;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddToContainer (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmbottombar","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 171;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 172;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmbottombar.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public BottomBar As VMElement";
vmbottombar._bottombar = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_bottombar",vmbottombar._bottombar);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmbottombar._id = RemoteObject.createImmutable("");__ref.setField("_id",vmbottombar._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmbottombar._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmbottombar._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmbottombar._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmbottombar._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmbottombar._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmbottombar._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createitem(RemoteObject __ref,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "vmbottombar","createitem", __ref, _sid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmbottombaritem");
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 22;BA.debugLine="Sub CreateItem(sid As String) As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="Dim el As VMBottomBarItem";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmbottombaritem");Debug.locals.put("el", _el);
 BA.debugLineNum = 24;BA.debugLine="el.Initialize(vue, sid, module)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmbottombaritem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_sid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 25;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 26;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmbottombar","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _sval = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("EventHandler", _eventhandler);
 BA.debugLineNum = 11;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 12;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 13;BA.debugLine="BottomBar.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 14;BA.debugLine="BottomBar.SetTag(\"md-bottom-bar\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-bottom-bar")));
 BA.debugLineNum = 15;BA.debugLine="module = EventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 16;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 17;BA.debugLine="Dim sval As String";
Debug.JustUpdateDeviceLine();
_sval = RemoteObject.createImmutable("");Debug.locals.put("sval", _sval);
 BA.debugLineNum = 18;BA.debugLine="SetOnChanged(sval)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombar.class, "_setonchanged" /*RemoteObject*/ ,(Object)(_sval));
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
		Debug.PushSubsStack("Pop (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmbottombar","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 101;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmbottombar.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmbottombar","render", __ref);}
 BA.debugLineNum = 73;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmbottombar.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 75;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmbottombar","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 95;BA.debugLine="Sub SetAccent(b As Boolean) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="BottomBar.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmbottombar.__c.getField(true,"True")));
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
public static RemoteObject  _setactiveitem(RemoteObject __ref,RemoteObject _varactiveitem) throws Exception{
try {
		Debug.PushSubsStack("SetActiveItem (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("setactiveitem")) { return __ref.runUserSub(false, "vmbottombar","setactiveitem", __ref, _varactiveitem);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varActiveItem", _varactiveitem);
 BA.debugLineNum = 157;BA.debugLine="Sub SetActiveItem(varActiveItem As Object) As VMBo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="Dim pp As String = $\"${ID}activeitem\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("activeitem")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 159;BA.debugLine="vue.SetStateSingle(pp, varActiveItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)(_varactiveitem));
 BA.debugLineNum = 160;BA.debugLine="SetAttr(CreateMap(\":md-active-item\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombar.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbottombar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-active-item")),(_pp)}))));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmbottombar","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 112;BA.debugLine="Sub SetAttr(attr As Map) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="BottomBar.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setonchanged(RemoteObject __ref,RemoteObject _activeitem) throws Exception{
try {
		Debug.PushSubsStack("SetOnChanged (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("setonchanged")) { return __ref.runUserSub(false, "vmbottombar","setonchanged", __ref, _activeitem);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("activeItem", _activeitem);
 BA.debugLineNum = 42;BA.debugLine="private Sub SetOnChanged(activeItem As String) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="Dim MethodName As String = $\"${ID}_changed\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_changed")));Debug.locals.put("MethodName", _methodname);Debug.locals.put("MethodName", _methodname);
 BA.debugLineNum = 44;BA.debugLine="If SubExists(module, MethodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmbottombar.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmbottombar.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 45;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmbottombar.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_activeitem)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 46;BA.debugLine="SetAttr(CreateMap(\"@md-changed\": MethodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombar.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbottombar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("@md-changed")),(_methodname)}))));
 BA.debugLineNum = 48;BA.debugLine="vue.SetCallBack(MethodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 49;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,131);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmbottombar","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 131;BA.debugLine="Sub SetPadding(p As Object) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 132;BA.debugLine="BottomBar.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmbottombar","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 90;BA.debugLine="Sub SetPrimary(b As Boolean) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="BottomBar.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmbottombar.__c.getField(true,"True")));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmbottombar","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 118;BA.debugLine="Sub SetStyle(sm As Map) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="BottomBar.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _setsyncroute(RemoteObject __ref,RemoteObject _varsyncroute) throws Exception{
try {
		Debug.PushSubsStack("SetSyncRoute (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("setsyncroute")) { return __ref.runUserSub(false, "vmbottombar","setsyncroute", __ref, _varsyncroute);}
Debug.locals.put("varSyncRoute", _varsyncroute);
 BA.debugLineNum = 165;BA.debugLine="Sub SetSyncRoute(varSyncRoute As Boolean) As VMBot";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 166;BA.debugLine="SetAttr(CreateMap(\":md-sync-route\": varSyncRoute)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombar.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbottombar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-sync-route")),(_varsyncroute)}))));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmbottombar","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 85;BA.debugLine="Sub SetText(t As Object) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="BottomBar.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _settype(RemoteObject __ref,RemoteObject _vartype) throws Exception{
try {
		Debug.PushSubsStack("SetType (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,137);
if (RapidSub.canDelegate("settype")) { return __ref.runUserSub(false, "vmbottombar","settype", __ref, _vartype);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varType", _vartype);
 BA.debugLineNum = 137;BA.debugLine="Sub SetType(varType As Object) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 138;BA.debugLine="Dim pp As String = $\"${ID}type\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmbottombar.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("type")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 139;BA.debugLine="vue.SetStateSingle(pp, varType)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)(_vartype));
 BA.debugLineNum = 140;BA.debugLine="SetAttr(CreateMap(\":md-type\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombar.class, "_setattr" /*RemoteObject*/ ,(Object)(vmbottombar.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-type")),(_pp)}))));
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
public static RemoteObject  _settypefixed(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypeFixed (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("settypefixed")) { return __ref.runUserSub(false, "vmbottombar","settypefixed", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 145;BA.debugLine="Sub SetTypeFixed(b As Boolean) As VMBottomBar    '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="SetType(\"fixed\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombar.class, "_settype" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("fixed"))));
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
public static RemoteObject  _settypeshift(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTypeShift (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("settypeshift")) { return __ref.runUserSub(false, "vmbottombar","settypeshift", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 151;BA.debugLine="Sub SetTypeShift(b As Boolean) As VMBottomBar    '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="SetType(\"shift\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmbottombar.class, "_settype" /*RemoteObject*/ ,(Object)((RemoteObject.createImmutable("shift"))));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmbottombar","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 62;BA.debugLine="Sub SetVIf(vif As Object) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="BottomBar.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmbottombar","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 57;BA.debugLine="Sub SetVModel(k As String) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="BottomBar.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmbottombar","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 67;BA.debugLine="Sub SetVShow(vif As Object) As VMBottomBar";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="BottomBar.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmbottombar) ","vmbottombar",33,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmbottombar","tostring", __ref);}
 BA.debugLineNum = 53;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Return BottomBar.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_bottombar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 55;BA.debugLine="End Sub";
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