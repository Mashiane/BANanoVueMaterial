package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmemptystate_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmemptystate","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 44;BA.debugLine="Sub AddChild(child As VMElement) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 46;BA.debugLine="EmptyState.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmemptystate","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 51;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 53;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmemptystate.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmemptystate","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 110;BA.debugLine="Sub AddClass(c As String) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="EmptyState.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addhtml(RemoteObject __ref,RemoteObject _html) throws Exception{
try {
		Debug.PushSubsStack("AddHTML (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,38);
if (RapidSub.canDelegate("addhtml")) { return __ref.runUserSub(false, "vmemptystate","addhtml", __ref, _html);}
Debug.locals.put("html", _html);
 BA.debugLineNum = 38;BA.debugLine="Sub AddHTML(html As String) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 39;BA.debugLine="EmptyState.SetText(html)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_html));
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
		Debug.PushSubsStack("AddToContainer (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmemptystate","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 134;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmemptystate.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 136;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public EmptyState As VMElement";
vmemptystate._emptystate = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_emptystate",vmemptystate._emptystate);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmemptystate._id = RemoteObject.createImmutable("");__ref.setField("_id",vmemptystate._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmemptystate._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmemptystate._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private module As Object";
vmemptystate._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmemptystate._module);
 //BA.debugLineNum = 7;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,9);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmemptystate","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 9;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 10;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 11;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 12;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 13;BA.debugLine="EmptyState.Initialize(vue, ID).SetTag(\"md-empty-s";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-empty-state")));
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
		Debug.PushSubsStack("Pop (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmemptystate","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 129;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmemptystate.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 131;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,125);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmemptystate","render", __ref);}
 BA.debugLineNum = 125;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 126;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmemptystate.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 127;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmemptystate","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 98;BA.debugLine="Sub SetAccent(b As Boolean) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmemptystate.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 100;BA.debugLine="EmptyState.AddClass(\"md-accent\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-accent")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,116);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmemptystate","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 116;BA.debugLine="Sub SetAttr(attr As Map) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 117;BA.debugLine="EmptyState.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setdescription(RemoteObject __ref,RemoteObject _labelx) throws Exception{
try {
		Debug.PushSubsStack("SetDescription (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("setdescription")) { return __ref.runUserSub(false, "vmemptystate","setdescription", __ref, _labelx);}
Debug.locals.put("labelx", _labelx);
 BA.debugLineNum = 74;BA.debugLine="Sub SetDescription(labelx As String) As VMEmptySta";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="If labelx = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_labelx,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 76;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-description\": la";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmemptystate.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-description")),(_labelx)}))));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,62);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmemptystate","seticon", __ref, _icon);}
Debug.locals.put("icon", _icon);
 BA.debugLineNum = 62;BA.debugLine="Sub SetIcon(icon As String) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 63;BA.debugLine="If icon = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_icon,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 64;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-icon\": icon))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmemptystate.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-icon")),(_icon)}))));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _iid,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmemptystate","setid", __ref, _iid, _bind);}
Debug.locals.put("iID", _iid);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 28;BA.debugLine="Sub SetID(iID As String, bind As Boolean) As VMEmp";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="EmptyState.SetID(iID,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_iid),(Object)(_bind));
 BA.debugLineNum = 30;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 31;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetKey (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmemptystate","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 57;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMEmpt";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="EmptyState.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
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
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _labelx) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,68);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmemptystate","setlabel", __ref, _labelx);}
Debug.locals.put("labelx", _labelx);
 BA.debugLineNum = 68;BA.debugLine="Sub SetLabel(labelx As String) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 69;BA.debugLine="If labelx = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_labelx,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 70;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-label\": labelx))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmemptystate.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-label")),(_labelx)}))));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _nam,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmemptystate","setname", __ref, _nam, _bind);}
Debug.locals.put("nam", _nam);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 33;BA.debugLine="Sub SetName(nam As String, bind As Boolean) As VME";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="EmptyState.SetName(nam, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(_nam),(Object)(_bind));
 BA.debugLineNum = 35;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 36;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmemptystate","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 92;BA.debugLine="Sub SetPrimary(b As Boolean) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmemptystate.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 94;BA.debugLine="EmptyState.AddClass(\"md-primary\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-primary")));
 BA.debugLineNum = 95;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setrounded(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRounded (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,80);
if (RapidSub.canDelegate("setrounded")) { return __ref.runUserSub(false, "vmemptystate","setrounded", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 80;BA.debugLine="Sub SetRounded(b As Boolean) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 81;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmemptystate.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 82;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-rounded\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmemptystate.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-rounded")),(_b)}))));
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
public static RemoteObject  _setsize(RemoteObject __ref,RemoteObject _size) throws Exception{
try {
		Debug.PushSubsStack("SetSize (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,86);
if (RapidSub.canDelegate("setsize")) { return __ref.runUserSub(false, "vmemptystate","setsize", __ref, _size);}
Debug.locals.put("size", _size);
 BA.debugLineNum = 86;BA.debugLine="Sub SetSize(size As String) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 87;BA.debugLine="If size = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_size,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 88;BA.debugLine="EmptyState.SetAttr(CreateMap(\"md-size\": size))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmemptystate.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-size")),(_size)}))));
 BA.debugLineNum = 89;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 90;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,18);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmemptystate","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 18;BA.debugLine="Sub SetStyle(sm As Map) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 19;BA.debugLine="EmptyState.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 20;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 21;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmemptystate","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 23;BA.debugLine="Sub SetVIf(vif As String) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="EmptyState.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 25;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,104);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmemptystate","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 104;BA.debugLine="Sub SetVShow(vif As String) As VMEmptyState";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 105;BA.debugLine="EmptyState.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmemptystate) ","vmemptystate",54,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmemptystate","tostring", __ref);}
 BA.debugLineNum = 121;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="Return EmptyState.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_emptystate" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 123;BA.debugLine="End Sub";
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