package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmmenuitem_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmmenuitem","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 57;BA.debugLine="Sub AddChild(child As VMElement) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 59;BA.debugLine="MenuItem.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmmenuitem","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 103;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 105;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmmenuitem.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmmenuitem","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 85;BA.debugLine="Sub AddClass(c As String) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="MenuItem.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _class_globals(RemoteObject __ref) throws Exception{
 //BA.debugLineNum = 2;BA.debugLine="Sub Class_Globals";
 //BA.debugLineNum = 3;BA.debugLine="Public MenuItem As VMElement";
vmmenuitem._menuitem = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_menuitem",vmmenuitem._menuitem);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmmenuitem._id = RemoteObject.createImmutable("");__ref.setField("_id",vmmenuitem._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmmenuitem._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmmenuitem._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmmenuitem._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmmenuitem._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmmenuitem._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmmenuitem._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmmenuitem","initialize", __ref, _ba, _v, _sid, _eventhandler);}
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
 BA.debugLineNum = 13;BA.debugLine="MenuItem.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 14;BA.debugLine="MenuItem.SetTag(\"md-menu-item\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-menu-item")));
 BA.debugLineNum = 15;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 16;BA.debugLine="MenuItem.SetOnClick(module, $\"${ID}_click\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmmenuitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))));
 BA.debugLineNum = 17;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
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
		Debug.PushSubsStack("Pop (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmmenuitem","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 80;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmmenuitem.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 82;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmmenuitem","render", __ref);}
 BA.debugLineNum = 52;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmmenuitem.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmmenuitem","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 74;BA.debugLine="Sub SetAccent(b As Boolean) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="MenuItem.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmmenuitem.__c.getField(true,"True")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmmenuitem","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 91;BA.debugLine="Sub SetAttr(attr As Map) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="MenuItem.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _n,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmmenuitem","setid", __ref, _n, _bind);}
Debug.locals.put("n", _n);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 26;BA.debugLine="Sub SetID(n As String, bind As Boolean) As VMMenuI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="MenuItem.SetID(n, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_n),(Object)(_bind));
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
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,21);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmmenuitem","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 21;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VMMenu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 22;BA.debugLine="MenuItem.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)(_k),(Object)(_bind));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmmenuitem","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 110;BA.debugLine="Sub SetPadding(p As Object) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="MenuItem.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmmenuitem","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 69;BA.debugLine="Sub SetPrimary(b As Boolean) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="MenuItem.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmmenuitem.__c.getField(true,"True")));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,97);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmmenuitem","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 97;BA.debugLine="Sub SetStyle(sm As Map) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 98;BA.debugLine="MenuItem.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmmenuitem","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 64;BA.debugLine="Sub SetText(t As Object) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="MenuItem.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmmenuitem","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 41;BA.debugLine="Sub SetVIf(vif As Object) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="MenuItem.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 43;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 44;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,36);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmmenuitem","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 36;BA.debugLine="Sub SetVModel(k As String) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 37;BA.debugLine="MenuItem.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 38;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,46);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmmenuitem","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 46;BA.debugLine="Sub SetVShow(vif As Object) As VMMenuItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 47;BA.debugLine="MenuItem.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 48;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 49;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmmenuitem) ","vmmenuitem",76,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmmenuitem","tostring", __ref);}
 BA.debugLineNum = 32;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="Return MenuItem.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_menuitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 34;BA.debugLine="End Sub";
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