package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmmenu_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmmenu","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 117;BA.debugLine="Sub AddChild(child As VMElement) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 119;BA.debugLine="Menu.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmmenu","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 163;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 165;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 167;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmmenu","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 145;BA.debugLine="Sub AddClass(c As String) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Menu.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addicontext(RemoteObject __ref,RemoteObject _itemid,RemoteObject _iconname,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("AddIconText (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("addicontext")) { return __ref.runUserSub(false, "vmmenu","addicontext", __ref, _itemid, _iconname, _text);}
RemoteObject _mi = RemoteObject.declareNull("b4j.example.vmmenuitem");
RemoteObject _icn = RemoteObject.declareNull("b4j.example.vmicon");
RemoteObject _span = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("itemID", _itemid);
Debug.locals.put("iconName", _iconname);
Debug.locals.put("Text", _text);
 BA.debugLineNum = 66;BA.debugLine="Sub AddIconText(itemID As String, iconName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="Dim mi As VMMenuItem";
Debug.JustUpdateDeviceLine();
_mi = RemoteObject.createNew ("b4j.example.vmmenuitem");Debug.locals.put("mi", _mi);
 BA.debugLineNum = 68;BA.debugLine="mi.Initialize(vue,itemID, eventHandler)";
Debug.JustUpdateDeviceLine();
_mi.runClassMethod (b4j.example.vmmenuitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_itemid),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 70;BA.debugLine="If iconName <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_iconname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 71;BA.debugLine="Dim icn As VMIcon";
Debug.JustUpdateDeviceLine();
_icn = RemoteObject.createNew ("b4j.example.vmicon");Debug.locals.put("icn", _icn);
 BA.debugLineNum = 72;BA.debugLine="icn.Initialize(vue, $\"${itemID}icon\"$).SetText(i";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmmenu.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemid))),RemoteObject.createImmutable("icon"))))).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_iconname));
 BA.debugLineNum = 73;BA.debugLine="icn.Pop(mi.MenuItem)";
Debug.JustUpdateDeviceLine();
_icn.runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(_mi.getField(false,"_menuitem" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 76;BA.debugLine="Dim span As VMElement";
Debug.JustUpdateDeviceLine();
_span = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("span", _span);
 BA.debugLineNum = 77;BA.debugLine="span.Initialize(vue,$\"${itemID}text\"$).SetTag(\"sp";
Debug.JustUpdateDeviceLine();
_span.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmmenu.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_itemid))),RemoteObject.createImmutable("text"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 78;BA.debugLine="span.Pop(mi.MenuItem)";
Debug.JustUpdateDeviceLine();
_span.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(_mi.getField(false,"_menuitem" /*RemoteObject*/ )));
 BA.debugLineNum = 79;BA.debugLine="mi.Pop(MenuContent)";
Debug.JustUpdateDeviceLine();
_mi.runClassMethod (b4j.example.vmmenuitem.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_menucontent" /*RemoteObject*/ )));
 BA.debugLineNum = 80;BA.debugLine="MenuContent.hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menucontent" /*RemoteObject*/ ).setField ("_hascontent" /*RemoteObject*/ ,vmmenu.__c.getField(true,"True"));
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addmenuitem(RemoteObject __ref,RemoteObject _itemid,RemoteObject _iconname,RemoteObject _itemtext) throws Exception{
try {
		Debug.PushSubsStack("AddMenuItem (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("addmenuitem")) { return __ref.runUserSub(false, "vmmenu","addmenuitem", __ref, _itemid, _iconname, _itemtext);}
Debug.locals.put("itemID", _itemid);
Debug.locals.put("iconName", _iconname);
Debug.locals.put("itemText", _itemtext);
 BA.debugLineNum = 61;BA.debugLine="Sub AddMenuItem(itemID As String, iconName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="AddIconText(itemID, iconName, itemText)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_addicontext" /*RemoteObject*/ ,(Object)(_itemid),(Object)(_iconname),(Object)(_itemtext));
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddToContainer (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmmenu","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 279;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 280;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmmenu.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 281;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Menu As VMElement";
vmmenu._menu = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_menu",vmmenu._menu);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmmenu._id = RemoteObject.createImmutable("");__ref.setField("_id",vmmenu._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmmenu._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmmenu._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmmenu._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmmenu._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private MenuContent As VMElement";
vmmenu._menucontent = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_menucontent",vmmenu._menucontent);
 //BA.debugLineNum = 8;BA.debugLine="Private bActive As Boolean";
vmmenu._bactive = RemoteObject.createImmutable(false);__ref.setField("_bactive",vmmenu._bactive);
 //BA.debugLineNum = 9;BA.debugLine="Private eventHandler As Object";
vmmenu._eventhandler = RemoteObject.createNew ("Object");__ref.setField("_eventhandler",vmmenu._eventhandler);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmmenu","initialize", __ref, _ba, _v, _sid, _module);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 15;BA.debugLine="Menu.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 16;BA.debugLine="Menu.SetTag(\"md-menu\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-menu")));
 BA.debugLineNum = 17;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 18;BA.debugLine="MenuContent.Initialize(vue,$\"${ID}content\"$).SetT";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menucontent" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmmenu.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("content"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-menu-content")));
 BA.debugLineNum = 19;BA.debugLine="bActive = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmmenu.__c.getField(true,"False"));
 BA.debugLineNum = 20;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
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
		Debug.PushSubsStack("Pop (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmmenu","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 140;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmmenu.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 142;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,112);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmmenu","render", __ref);}
 BA.debugLineNum = 112;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 113;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmmenu.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 114;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmmenu","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 134;BA.debugLine="Sub SetAccent(b As Boolean) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="Menu.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmmenu.__c.getField(true,"True")));
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
public static RemoteObject  _setactive(RemoteObject __ref,RemoteObject _varactive) throws Exception{
try {
		Debug.PushSubsStack("SetActive (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("setactive")) { return __ref.runUserSub(false, "vmmenu","setactive", __ref, _varactive);}
Debug.locals.put("varActive", _varactive);
 BA.debugLineNum = 176;BA.debugLine="Sub SetActive(varActive As Object) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="SetAttr(CreateMap(\"md-active\": varActive))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-active")),_varactive}))));
 BA.debugLineNum = 178;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 179;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetActiveSync (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("setactivesync")) { return __ref.runUserSub(false, "vmmenu","setactivesync", __ref, _v);}
Debug.locals.put("v", _v);
 BA.debugLineNum = 105;BA.debugLine="Sub SetActiveSync(v As String) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="Menu.SetActiveSync(v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setactivesync" /*RemoteObject*/ ,(Object)(_v));
 BA.debugLineNum = 107;BA.debugLine="bActive = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_bactive" /*RemoteObject*/ ,vmmenu.__c.getField(true,"True"));
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
public static RemoteObject  _setaligntrigger(RemoteObject __ref,RemoteObject _varaligntrigger) throws Exception{
try {
		Debug.PushSubsStack("SetAlignTrigger (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("setaligntrigger")) { return __ref.runUserSub(false, "vmmenu","setaligntrigger", __ref, _varaligntrigger);}
Debug.locals.put("varAlignTrigger", _varaligntrigger);
 BA.debugLineNum = 224;BA.debugLine="Sub SetAlignTrigger(varAlignTrigger As Object) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 225;BA.debugLine="SetAttr(CreateMap(\"md-align-trigger\": varAlignTri";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-align-trigger")),_varaligntrigger}))));
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
		Debug.PushSubsStack("SetAttr (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,151);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmmenu","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 151;BA.debugLine="Sub SetAttr(attr As Map) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 152;BA.debugLine="Menu.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setbutton(RemoteObject __ref,RemoteObject _iconname,RemoteObject _text) throws Exception{
try {
		Debug.PushSubsStack("SetButton (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("setbutton")) { return __ref.runUserSub(false, "vmmenu","setbutton", __ref, _iconname, _text);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("iconName", _iconname);
Debug.locals.put("text", _text);
 BA.debugLineNum = 48;BA.debugLine="Sub SetButton(iconName As String, text As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="If text = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_text,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 50;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 51;BA.debugLine="btn.Initialize(vue, $\"${ID}button\"$,eventHandler)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmmenu.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("button")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmbutton.class, "_setmenutrigger" /*RemoteObject*/ ,(Object)(vmmenu.__c.getField(true,"True")));
 BA.debugLineNum = 52;BA.debugLine="If iconName <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_iconname,BA.ObjectToString(""))) { 
 BA.debugLineNum = 53;BA.debugLine="btn.SetIcon(iconName)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_iconname));
 };
 BA.debugLineNum = 55;BA.debugLine="btn.SetText(text)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 56;BA.debugLine="btn.Pop(Menu)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_menu" /*RemoteObject*/ )));
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
public static RemoteObject  _setcloseonclick(RemoteObject __ref,RemoteObject _varcloseonclick) throws Exception{
try {
		Debug.PushSubsStack("SetCloseOnClick (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("setcloseonclick")) { return __ref.runUserSub(false, "vmmenu","setcloseonclick", __ref, _varcloseonclick);}
Debug.locals.put("varCloseOnClick", _varcloseonclick);
 BA.debugLineNum = 182;BA.debugLine="Sub SetCloseOnClick(varCloseOnClick As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="SetAttr(CreateMap(\":md-close-on-click\": varCloseO";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-close-on-click")),(_varcloseonclick)}))));
 BA.debugLineNum = 184;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 185;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcloseonselect(RemoteObject __ref,RemoteObject _varcloseonselect) throws Exception{
try {
		Debug.PushSubsStack("SetCloseOnSelect (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("setcloseonselect")) { return __ref.runUserSub(false, "vmmenu","setcloseonselect", __ref, _varcloseonselect);}
Debug.locals.put("varCloseOnSelect", _varcloseonselect);
 BA.debugLineNum = 188;BA.debugLine="Sub SetCloseOnSelect(varCloseOnSelect As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="SetAttr(CreateMap(\":md-close-on-select\": varClose";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-close-on-select")),(_varcloseonselect)}))));
 BA.debugLineNum = 190;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 191;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdirection(RemoteObject __ref,RemoteObject _vardirection) throws Exception{
try {
		Debug.PushSubsStack("SetDirection (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("setdirection")) { return __ref.runUserSub(false, "vmmenu","setdirection", __ref, _vardirection);}
Debug.locals.put("varDirection", _vardirection);
 BA.debugLineNum = 194;BA.debugLine="Sub SetDirection(varDirection As Object) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 195;BA.debugLine="SetAttr(CreateMap(\"md-direction\": varDirection))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),_vardirection}))));
 BA.debugLineNum = 196;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdirectionbottomend(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDirectionBottomEnd (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("setdirectionbottomend")) { return __ref.runUserSub(false, "vmmenu","setdirectionbottomend", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 206;BA.debugLine="Sub SetDirectionBottomEnd(b As Boolean) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"bottom-end\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),(RemoteObject.createImmutable("bottom-end"))}))));
 BA.debugLineNum = 208;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 209;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdirectionbottomstart(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDirectionBottomStart (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("setdirectionbottomstart")) { return __ref.runUserSub(false, "vmmenu","setdirectionbottomstart", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 200;BA.debugLine="Sub SetDirectionBottomStart(b As Boolean) As VMMen";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 201;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"bottom-start\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),(RemoteObject.createImmutable("bottom-start"))}))));
 BA.debugLineNum = 202;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 203;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdirectiontopend(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDirectionTopEnd (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,218);
if (RapidSub.canDelegate("setdirectiontopend")) { return __ref.runUserSub(false, "vmmenu","setdirectiontopend", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 218;BA.debugLine="Sub SetDirectionTopEnd(b As Boolean) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 219;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"top-end\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),(RemoteObject.createImmutable("top-end"))}))));
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
public static RemoteObject  _setdirectiontopstart(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDirectionTopStart (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,212);
if (RapidSub.canDelegate("setdirectiontopstart")) { return __ref.runUserSub(false, "vmmenu","setdirectiontopstart", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 212;BA.debugLine="Sub SetDirectionTopStart(b As Boolean) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 213;BA.debugLine="SetAttr(CreateMap(\"md-direction\": \"top-start\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-direction")),(RemoteObject.createImmutable("top-start"))}))));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmmenu","seticon", __ref, _icon);}
RemoteObject _btn = RemoteObject.declareNull("b4j.example.vmbutton");
Debug.locals.put("icon", _icon);
 BA.debugLineNum = 25;BA.debugLine="Sub SetIcon(icon As String) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="If icon = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_icon,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 27;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
_btn = RemoteObject.createNew ("b4j.example.vmbutton");Debug.locals.put("btn", _btn);
 BA.debugLineNum = 28;BA.debugLine="btn.Initialize(vue, $\"${ID}icon\"$, eventHandler).";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmmenu.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icon")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmbutton.class, "_setmenutrigger" /*RemoteObject*/ ,(Object)(vmmenu.__c.getField(true,"True")));
 BA.debugLineNum = 29;BA.debugLine="btn.SetIcon(icon).SetIconButton(True)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_icon)).runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(vmmenu.__c.getField(true,"True")));
 BA.debugLineNum = 30;BA.debugLine="btn.Pop(Menu)";
Debug.JustUpdateDeviceLine();
_btn.runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_menu" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="SetDirectionBottomEnd(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setdirectionbottomend" /*RemoteObject*/ ,(Object)(vmmenu.__c.getField(true,"True")));
 BA.debugLineNum = 32;BA.debugLine="SetAlignTrigger(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setaligntrigger" /*RemoteObject*/ ,(Object)((vmmenu.__c.getField(true,"True"))));
 BA.debugLineNum = 33;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 34;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setimage(RemoteObject __ref,RemoteObject _imgurl,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("SetImage (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("setimage")) { return __ref.runUserSub(false, "vmmenu","setimage", __ref, _imgurl, _txt);}
RemoteObject _avt = RemoteObject.declareNull("b4j.example.vmavatar");
Debug.locals.put("imgURL", _imgurl);
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 37;BA.debugLine="Sub SetImage(imgURL As String, txt As String) As V";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="Dim avt As VMAvatar";
Debug.JustUpdateDeviceLine();
_avt = RemoteObject.createNew ("b4j.example.vmavatar");Debug.locals.put("avt", _avt);
 BA.debugLineNum = 39;BA.debugLine="avt.Initialize(vue, $\"${ID}image\"$,eventHandler).";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmmenu.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("image")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmavatar.class, "_setalt" /*RemoteObject*/ ,(Object)(_txt)).runClassMethod (b4j.example.vmavatar.class, "_setmenutrigger" /*RemoteObject*/ ,(Object)(vmmenu.__c.getField(true,"True")));
 BA.debugLineNum = 40;BA.debugLine="avt.SetValue(imgURL)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_setvalue" /*RemoteObject*/ ,(Object)(_imgurl));
 BA.debugLineNum = 41;BA.debugLine="avt.Pop(Menu)";
Debug.JustUpdateDeviceLine();
_avt.runClassMethod (b4j.example.vmavatar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_menu" /*RemoteObject*/ )));
 BA.debugLineNum = 42;BA.debugLine="SetDirectionBottomEnd(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setdirectionbottomend" /*RemoteObject*/ ,(Object)(vmmenu.__c.getField(true,"True")));
 BA.debugLineNum = 43;BA.debugLine="SetAlignTrigger(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setaligntrigger" /*RemoteObject*/ ,(Object)((vmmenu.__c.getField(true,"True"))));
 BA.debugLineNum = 44;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 45;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoffsetx(RemoteObject __ref,RemoteObject _varoffsetx) throws Exception{
try {
		Debug.PushSubsStack("SetOffsetX (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,230);
if (RapidSub.canDelegate("setoffsetx")) { return __ref.runUserSub(false, "vmmenu","setoffsetx", __ref, _varoffsetx);}
Debug.locals.put("varOffsetX", _varoffsetx);
 BA.debugLineNum = 230;BA.debugLine="Sub SetOffsetX(varOffsetX As Object) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 231;BA.debugLine="SetAttr(CreateMap(\"md-offset-x\": varOffsetX))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-offset-x")),_varoffsetx}))));
 BA.debugLineNum = 232;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 233;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoffsety(RemoteObject __ref,RemoteObject _varoffsety) throws Exception{
try {
		Debug.PushSubsStack("SetOffsetY (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,236);
if (RapidSub.canDelegate("setoffsety")) { return __ref.runUserSub(false, "vmmenu","setoffsety", __ref, _varoffsety);}
Debug.locals.put("varOffsetY", _varoffsety);
 BA.debugLineNum = 236;BA.debugLine="Sub SetOffsetY(varOffsetY As Object) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 237;BA.debugLine="SetAttr(CreateMap(\"md-offset-y\": varOffsetY))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-offset-y")),_varoffsety}))));
 BA.debugLineNum = 238;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 239;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmmenu","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 170;BA.debugLine="Sub SetPadding(p As Object) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 171;BA.debugLine="Menu.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmmenu","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 129;BA.debugLine="Sub SetPrimary(b As Boolean) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="Menu.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmmenu.__c.getField(true,"True")));
 BA.debugLineNum = 131;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 132;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsize(RemoteObject __ref,RemoteObject _varsize) throws Exception{
try {
		Debug.PushSubsStack("SetSize (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,242);
if (RapidSub.canDelegate("setsize")) { return __ref.runUserSub(false, "vmmenu","setsize", __ref, _varsize);}
Debug.locals.put("varSize", _varsize);
 BA.debugLineNum = 242;BA.debugLine="Sub SetSize(varSize As Object) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 243;BA.debugLine="SetAttr(CreateMap(\"md-size\": varSize))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-size")),_varsize}))));
 BA.debugLineNum = 244;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsizeauto(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSizeAuto (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("setsizeauto")) { return __ref.runUserSub(false, "vmmenu","setsizeauto", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 272;BA.debugLine="Sub SetSizeAuto(b As Boolean) As VMMenu    'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 273;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"auto\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-size")),(RemoteObject.createImmutable("auto"))}))));
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
public static RemoteObject  _setsizebig(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSizeBig (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,260);
if (RapidSub.canDelegate("setsizebig")) { return __ref.runUserSub(false, "vmmenu","setsizebig", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 260;BA.debugLine="Sub SetSizeBig(b As Boolean) As VMMenu    'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 261;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"big\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-size")),(RemoteObject.createImmutable("big"))}))));
 BA.debugLineNum = 262;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 263;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsizehuge(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSizeHuge (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("setsizehuge")) { return __ref.runUserSub(false, "vmmenu","setsizehuge", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 266;BA.debugLine="Sub SetSizeHuge(b As Boolean) As VMMenu    'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"huge\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-size")),(RemoteObject.createImmutable("huge"))}))));
 BA.debugLineNum = 268;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 269;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsizemedium(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSizeMedium (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,254);
if (RapidSub.canDelegate("setsizemedium")) { return __ref.runUserSub(false, "vmmenu","setsizemedium", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 254;BA.debugLine="Sub SetSizeMedium(b As Boolean) As VMMenu    'igno";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 255;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"medium\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-size")),(RemoteObject.createImmutable("medium"))}))));
 BA.debugLineNum = 256;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 257;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsizesmall(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSizeSmall (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("setsizesmall")) { return __ref.runUserSub(false, "vmmenu","setsizesmall", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 248;BA.debugLine="Sub SetSizeSmall(b As Boolean) As VMMenu    'ignor";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 249;BA.debugLine="SetAttr(CreateMap(\"md-size\": \"small\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenu.class, "_setattr" /*RemoteObject*/ ,(Object)(vmmenu.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-size")),(RemoteObject.createImmutable("small"))}))));
 BA.debugLineNum = 250;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 251;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmmenu","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 157;BA.debugLine="Sub SetStyle(sm As Map) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="Menu.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmmenu","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 124;BA.debugLine="Sub SetText(t As Object) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="Menu.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmmenu","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 95;BA.debugLine="Sub SetVIf(vif As Object) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Menu.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmmenu","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 90;BA.debugLine="Sub SetVModel(k As String) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Menu.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,100);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmmenu","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 100;BA.debugLine="Sub SetVShow(vif As Object) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 101;BA.debugLine="Menu.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 102;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 103;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmmenu) ","vmmenu",75,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmmenu","tostring", __ref);}
 BA.debugLineNum = 85;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="If MenuContent.hasContent Then MenuContent.Pop(Me";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_menucontent" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
__ref.getField(false,"_menucontent" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_menu" /*RemoteObject*/ )));};
 BA.debugLineNum = 87;BA.debugLine="Return Menu.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}