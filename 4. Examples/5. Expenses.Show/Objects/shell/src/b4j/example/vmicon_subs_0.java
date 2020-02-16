package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmicon_subs_0 {


public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmicon","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 38;BA.debugLine="Sub AddClass(c As String) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="Icon.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,17);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmicon","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 17;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 18;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmicon.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 19;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Icon As VMElement";
vmicon._icon = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_icon",vmicon._icon);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmicon._id = RemoteObject.createImmutable("");__ref.setField("_id",vmicon._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmicon._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmicon._vue);
 //BA.debugLineNum = 6;BA.debugLine="Public hasContent As Boolean";
vmicon._hascontent = RemoteObject.createImmutable(false);__ref.setField("_hascontent",vmicon._hascontent);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmicon","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 11;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 12;BA.debugLine="Icon.Initialize(vue, ID).SetTag(\"md-icon\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-icon")));
 BA.debugLineNum = 13;BA.debugLine="hasContent = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmicon.__c.getField(true,"False"));
 BA.debugLineNum = 14;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 15;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmicon","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 103;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmicon.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmicon","render", __ref);}
 BA.debugLineNum = 99;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmicon.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 101;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmicon","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 63;BA.debugLine="Sub SetAttr(attr As Map) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="Icon.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setbottombaricon(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBottomBarIcon (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,27);
if (RapidSub.canDelegate("setbottombaricon")) { return __ref.runUserSub(false, "vmicon","setbottombaricon", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 27;BA.debugLine="Sub SetBottomBarIcon(b As Boolean) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 28;BA.debugLine="Icon.AddClass(\"md-bottom-bar-icon\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-bottom-bar-icon")));
 BA.debugLineNum = 29;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 30;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfontawesome(RemoteObject __ref,RemoteObject _fa) throws Exception{
try {
		Debug.PushSubsStack("SetFontAwesome (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setfontawesome")) { return __ref.runUserSub(false, "vmicon","setfontawesome", __ref, _fa);}
Debug.locals.put("fa", _fa);
 BA.debugLineNum = 44;BA.debugLine="Sub SetFontAwesome(fa As String) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="AddClass(fa)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmicon.class, "_addclass" /*RemoteObject*/ ,(Object)(_fa));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _iid,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmicon","setid", __ref, _iid, _bind);}
Debug.locals.put("iID", _iid);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 80;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMIco";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="Icon.setid(iID, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_iid),(Object)(_bind));
 BA.debugLineNum = 82;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 83;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetKey (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmicon","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 90;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Icon.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _nam,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmicon","setname", __ref, _nam, _bind);}
Debug.locals.put("nam", _nam);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 85;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VMI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Icon.SetName(nam, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_nam),(Object)(_bind));
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
public static RemoteObject  _setonclick(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnClick (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vmicon","setonclick", __ref, _module, _methodname);}
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 22;BA.debugLine="Sub SetOnClick(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="Icon.SetOnClick(module, methodName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(_module),(Object)(_methodname));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmicon","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 69;BA.debugLine="Sub SetPrimary(b As Boolean) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="Icon.SetPrimary(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setsize2x(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSize2x (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setsize2x")) { return __ref.runUserSub(false, "vmicon","setsize2x", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 108;BA.debugLine="Sub SetSize2x(b As Boolean) As VMIcon    'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="AddClass(\"md-size-2x\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmicon.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-size-2x")));
 BA.debugLineNum = 110;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 111;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsize3x(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSize3x (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,114);
if (RapidSub.canDelegate("setsize3x")) { return __ref.runUserSub(false, "vmicon","setsize3x", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 114;BA.debugLine="Sub SetSize3x(b As Boolean) As VMIcon    'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 115;BA.debugLine="AddClass(\"md-size-3x\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmicon.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-size-3x")));
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
public static RemoteObject  _setsize4x(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSize4x (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,120);
if (RapidSub.canDelegate("setsize4x")) { return __ref.runUserSub(false, "vmicon","setsize4x", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 120;BA.debugLine="Sub SetSize4x(b As Boolean) As VMIcon    'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 121;BA.debugLine="AddClass(\"md-size-4x\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmicon.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-size-4x")));
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
public static RemoteObject  _setsize5x(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSize5x (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,126);
if (RapidSub.canDelegate("setsize5x")) { return __ref.runUserSub(false, "vmicon","setsize5x", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 126;BA.debugLine="Sub SetSize5x(b As Boolean) As VMIcon    'ignore";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 127;BA.debugLine="AddClass(\"md-size-5x\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmicon.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-size-5x")));
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
public static RemoteObject  _setsrc(RemoteObject __ref,RemoteObject _src) throws Exception{
try {
		Debug.PushSubsStack("SetSrc (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("setsrc")) { return __ref.runUserSub(false, "vmicon","setsrc", __ref, _src);}
Debug.locals.put("src", _src);
 BA.debugLineNum = 32;BA.debugLine="Sub SetSrc(src As String) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="SetAttr(CreateMap(\"md-src\": src))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmicon.class, "_setattr" /*RemoteObject*/ ,(Object)(vmicon.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-src")),(_src)}))));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmicon","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 74;BA.debugLine="Sub SetText(t As String) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="Icon.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 76;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmicon.__c.getField(true,"True"));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmicon","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 49;BA.debugLine="Sub SetVIf(vif As Object) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,RemoteObject.createImmutable(("")))) { 
if (true) return (__ref);};
 BA.debugLineNum = 51;BA.debugLine="Icon.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmicon","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 55;BA.debugLine="Sub SetVShow(vif As Object) As VMIcon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="If vif = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vif,RemoteObject.createImmutable(("")))) { 
if (true) return (__ref);};
 BA.debugLineNum = 57;BA.debugLine="Icon.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmicon) ","vmicon",63,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmicon","tostring", __ref);}
 BA.debugLineNum = 95;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Return Icon.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_icon" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
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
}