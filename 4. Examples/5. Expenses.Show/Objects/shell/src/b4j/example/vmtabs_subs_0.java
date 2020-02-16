package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtabs_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,106);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmtabs","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 106;BA.debugLine="Sub AddChild(child As VMElement) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 107;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 108;BA.debugLine="Tabs.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 109;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 110;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmtabs","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 152;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 154;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 156;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtabs","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 134;BA.debugLine="Sub AddClass(c As String) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="Tabs.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtab(RemoteObject __ref,RemoteObject _tabid,RemoteObject _tablabel,RemoteObject _tabicon,RemoteObject _tabcontent) throws Exception{
try {
		Debug.PushSubsStack("AddTab (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("addtab")) { return __ref.runUserSub(false, "vmtabs","addtab", __ref, _tabid, _tablabel, _tabicon, _tabcontent);}
RemoteObject _ti = RemoteObject.declareNull("b4j.example.vmtabsitem");
Debug.locals.put("tabID", _tabid);
Debug.locals.put("tabLabel", _tablabel);
Debug.locals.put("tabIcon", _tabicon);
Debug.locals.put("tabContent", _tabcontent);
 BA.debugLineNum = 67;BA.debugLine="Sub AddTab(tabID As String, tabLabel As String, ta";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="tabID = tabID.tolowercase";
Debug.JustUpdateDeviceLine();
_tabid = _tabid.runMethod(true,"toLowerCase");Debug.locals.put("tabID", _tabid);
 BA.debugLineNum = 69;BA.debugLine="Dim ti As VMTabsItem";
Debug.JustUpdateDeviceLine();
_ti = RemoteObject.createNew ("b4j.example.vmtabsitem");Debug.locals.put("ti", _ti);
 BA.debugLineNum = 70;BA.debugLine="ti.Initialize(vue,tabID,module)";
Debug.JustUpdateDeviceLine();
_ti.runClassMethod (b4j.example.vmtabsitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_tabid),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )));
 BA.debugLineNum = 71;BA.debugLine="ti.SetLabel(tabLabel)";
Debug.JustUpdateDeviceLine();
_ti.runClassMethod (b4j.example.vmtabsitem.class, "_setlabel" /*RemoteObject*/ ,(Object)(_tablabel));
 BA.debugLineNum = 72;BA.debugLine="ti.SetIcon(tabIcon)";
Debug.JustUpdateDeviceLine();
_ti.runClassMethod (b4j.example.vmtabsitem.class, "_seticon" /*RemoteObject*/ ,(Object)(_tabicon));
 BA.debugLineNum = 74;BA.debugLine="If tabContent <> Null Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",_tabcontent)) { 
 BA.debugLineNum = 75;BA.debugLine="ti.SetText(tabContent)";
Debug.JustUpdateDeviceLine();
_ti.runClassMethod (b4j.example.vmtabsitem.class, "_settext" /*RemoteObject*/ ,(Object)(_tabcontent));
 };
 BA.debugLineNum = 77;BA.debugLine="ti.Pop(Tabs)";
Debug.JustUpdateDeviceLine();
_ti.runClassMethod (b4j.example.vmtabsitem.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tabs" /*RemoteObject*/ )));
 BA.debugLineNum = 78;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddToContainer (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmtabs","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 276;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 277;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmtabs.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 278;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Tabs As VMElement";
vmtabs._tabs = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_tabs",vmtabs._tabs);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtabs._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtabs._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtabs._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtabs._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmtabs._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmtabs._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private atKey As String = $\"${ID}active\"$";
vmtabs._atkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("active")));__ref.setField("_atkey",vmtabs._atkey);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmtabs._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmtabs._module);
 //BA.debugLineNum = 9;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _hidetab(RemoteObject __ref,RemoteObject _stepid) throws Exception{
try {
		Debug.PushSubsStack("HideTab (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("hidetab")) { return __ref.runUserSub(false, "vmtabs","hidetab", __ref, _stepid);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 52;BA.debugLine="Sub HideTab(stepID As String) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 54;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("show")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 55;BA.debugLine="vue.SetStateSingle(stepShow, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((vmtabs.__c.getField(true,"False"))));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtabs","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 13;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 14;BA.debugLine="Tabs.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 15;BA.debugLine="Tabs.SetTag(\"md-tabs\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-tabs")));
 BA.debugLineNum = 16;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 18;BA.debugLine="SetOnChanged";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setonchanged" /*RemoteObject*/ );
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
		Debug.PushSubsStack("Pop (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtabs","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 129;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtabs.class, "_tostring" /*RemoteObject*/ )));
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
		Debug.PushSubsStack("Render (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtabs","render", __ref);}
 BA.debugLineNum = 101;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtabs.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmtabs","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 123;BA.debugLine="Sub SetAccent(b As Boolean) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="Tabs.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmtabs.__c.getField(true,"True")));
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
public static RemoteObject  _setalignment(RemoteObject __ref,RemoteObject _varalignment) throws Exception{
try {
		Debug.PushSubsStack("SetAlignment (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("setalignment")) { return __ref.runUserSub(false, "vmtabs","setalignment", __ref, _varalignment);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varAlignment", _varalignment);
 BA.debugLineNum = 194;BA.debugLine="Sub SetAlignment(varAlignment As String) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 195;BA.debugLine="Dim pp As String = $\"${ID}alignment\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("alignment")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 196;BA.debugLine="vue.SetStateSingle(pp, varAlignment)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_varalignment)));
 BA.debugLineNum = 197;BA.debugLine="SetAttr(CreateMap(\":md-alignment\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-alignment")),(_pp)}))));
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
public static RemoteObject  _setalignmentcenter(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAlignmentCenter (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,208);
if (RapidSub.canDelegate("setalignmentcenter")) { return __ref.runUserSub(false, "vmtabs","setalignmentcenter", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 208;BA.debugLine="Sub SetAlignmentCenter(b As Boolean) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 209;BA.debugLine="SetAlignment(\"centered\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setalignment" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("centered")));
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
public static RemoteObject  _setalignmentfixed(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAlignmentFixed (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,220);
if (RapidSub.canDelegate("setalignmentfixed")) { return __ref.runUserSub(false, "vmtabs","setalignmentfixed", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 220;BA.debugLine="Sub SetAlignmentFixed(b As Boolean) As VMTabs    '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 221;BA.debugLine="SetAlignment(\"fixed\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setalignment" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("fixed")));
 BA.debugLineNum = 222;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 223;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalignmentleft(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAlignmentLeft (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,202);
if (RapidSub.canDelegate("setalignmentleft")) { return __ref.runUserSub(false, "vmtabs","setalignmentleft", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 202;BA.debugLine="Sub SetAlignmentLeft(b As Boolean) As VMTabs    'i";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 203;BA.debugLine="SetAlignment(\"left\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setalignment" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("left")));
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
public static RemoteObject  _setalignmentright(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAlignmentRight (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,214);
if (RapidSub.canDelegate("setalignmentright")) { return __ref.runUserSub(false, "vmtabs","setalignmentright", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 214;BA.debugLine="Sub SetAlignmentRight(b As Boolean) As VMTabs    '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 215;BA.debugLine="SetAlignment(\"right\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setalignment" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("right")));
 BA.debugLineNum = 216;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 217;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,140);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtabs","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 140;BA.debugLine="Sub SetAttr(attr As Map) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 141;BA.debugLine="Tabs.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 142;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 143;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,23);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmtabs","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 23;BA.debugLine="Sub SetDisabled(b As Boolean) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 24;BA.debugLine="Tabs.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setdynamicheight(RemoteObject __ref,RemoteObject _vardynamicheight) throws Exception{
try {
		Debug.PushSubsStack("SetDynamicHeight (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("setdynamicheight")) { return __ref.runUserSub(false, "vmtabs","setdynamicheight", __ref, _vardynamicheight);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varDynamicHeight", _vardynamicheight);
 BA.debugLineNum = 226;BA.debugLine="Sub SetDynamicHeight(varDynamicHeight As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="Dim pp As String = $\"${ID}dynamicheight\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("dynamicheight")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 228;BA.debugLine="vue.SetStateSingle(pp, varDynamicHeight)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_vardynamicheight)));
 BA.debugLineNum = 229;BA.debugLine="SetAttr(CreateMap(\":md-dynamic-height\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-dynamic-height")),(_pp)}))));
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
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _varelevation) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,240);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmtabs","setelevation", __ref, _varelevation);}
Debug.locals.put("varElevation", _varelevation);
 BA.debugLineNum = 240;BA.debugLine="Sub SetElevation(varElevation As Int) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 241;BA.debugLine="Tabs.SetElevation(varElevation)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_varelevation));
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
public static RemoteObject  _setmargin(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetMargin (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("setmargin")) { return __ref.runUserSub(false, "vmtabs","setmargin", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 234;BA.debugLine="Sub SetMargin(p As Object) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Tabs.SetMarginAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setmarginall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setonchanged(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnChanged (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("setonchanged")) { return __ref.runUserSub(false, "vmtabs","setonchanged", __ref);}
RemoteObject _tabid = RemoteObject.createImmutable("");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 264;BA.debugLine="private Sub SetOnChanged As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 265;BA.debugLine="Dim tabID As String";
Debug.JustUpdateDeviceLine();
_tabid = RemoteObject.createImmutable("");Debug.locals.put("tabID", _tabid);
 BA.debugLineNum = 266;BA.debugLine="Dim methodName As String  = $\"${ID}_change\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_change")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 267;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmtabs.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmtabs.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 268;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmtabs.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_tabid)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 269;BA.debugLine="SetAttr(CreateMap(\"v-on:md-changed\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-changed")),(_methodname)}))));
 BA.debugLineNum = 271;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 272;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 273;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmtabs","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 159;BA.debugLine="Sub SetPadding(p As Object) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="Tabs.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmtabs","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 118;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Tabs.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmtabs.__c.getField(true,"True")));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmtabs","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 146;BA.debugLine="Sub SetStyle(sm As Map) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 147;BA.debugLine="Tabs.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 148;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 149;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetSwipeable (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("setswipeable")) { return __ref.runUserSub(false, "vmtabs","setswipeable", __ref, _varswipeable);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varSwipeable", _varswipeable);
 BA.debugLineNum = 180;BA.debugLine="Sub SetSwipeable(varSwipeable As Boolean) As VMTab";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="Dim pp As String = $\"${ID}swipeable\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("swipeable")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 182;BA.debugLine="vue.SetStateSingle(pp, varSwipeable)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_varswipeable)));
 BA.debugLineNum = 183;BA.debugLine="SetAttr(CreateMap(\":md-swipeable\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-swipeable")),(_pp)}))));
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
public static RemoteObject  _setswiperestraint(RemoteObject __ref,RemoteObject _varswiperestraint) throws Exception{
try {
		Debug.PushSubsStack("SetSwipeRestraint (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,252);
if (RapidSub.canDelegate("setswiperestraint")) { return __ref.runUserSub(false, "vmtabs","setswiperestraint", __ref, _varswiperestraint);}
Debug.locals.put("varSwipeRestraint", _varswiperestraint);
 BA.debugLineNum = 252;BA.debugLine="Sub SetSwipeRestraint(varSwipeRestraint As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 253;BA.debugLine="SetAttr(CreateMap(\"md-swipe-restraint\": varSwipeR";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-swipe-restraint")),_varswiperestraint}))));
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
public static RemoteObject  _setswipethreshold(RemoteObject __ref,RemoteObject _varswipethreshold) throws Exception{
try {
		Debug.PushSubsStack("SetSwipeThreshold (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("setswipethreshold")) { return __ref.runUserSub(false, "vmtabs","setswipethreshold", __ref, _varswipethreshold);}
Debug.locals.put("varSwipeThreshold", _varswipethreshold);
 BA.debugLineNum = 246;BA.debugLine="Sub SetSwipeThreshold(varSwipeThreshold As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 247;BA.debugLine="SetAttr(CreateMap(\"md-swipe-threshold\": varSwipeT";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-swipe-threshold")),_varswipethreshold}))));
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
public static RemoteObject  _setswipetime(RemoteObject __ref,RemoteObject _varswipetime) throws Exception{
try {
		Debug.PushSubsStack("SetSwipeTime (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,258);
if (RapidSub.canDelegate("setswipetime")) { return __ref.runUserSub(false, "vmtabs","setswipetime", __ref, _varswipetime);}
Debug.locals.put("varSwipeTime", _varswipetime);
 BA.debugLineNum = 258;BA.debugLine="Sub SetSwipeTime(varSwipeTime As Object) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 259;BA.debugLine="SetAttr(CreateMap(\"md-swipe-time\": varSwipeTime))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-swipe-time")),_varswipetime}))));
 BA.debugLineNum = 260;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 261;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetSyncRoute (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("setsyncroute")) { return __ref.runUserSub(false, "vmtabs","setsyncroute", __ref, _varsyncroute);}
Debug.locals.put("varSyncRoute", _varsyncroute);
 BA.debugLineNum = 188;BA.debugLine="Sub SetSyncRoute(varSyncRoute As Boolean) As VMTab";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="SetAttr(CreateMap(\":md-sync-route\": varSyncRoute)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-sync-route")),(_varsyncroute)}))));
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
public static RemoteObject  _settabactive(RemoteObject __ref,RemoteObject _varactivetab) throws Exception{
try {
		Debug.PushSubsStack("SetTabActive (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("settabactive")) { return __ref.runUserSub(false, "vmtabs","settabactive", __ref, _varactivetab);}
Debug.locals.put("varActiveTab", _varactivetab);
 BA.debugLineNum = 171;BA.debugLine="Sub SetTabActive(varActiveTab As String) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 172;BA.debugLine="If varActiveTab = Null Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_varactivetab)) { 
if (true) return (__ref);};
 BA.debugLineNum = 173;BA.debugLine="varActiveTab = varActiveTab.tolowercase";
Debug.JustUpdateDeviceLine();
_varactivetab = _varactivetab.runMethod(true,"toLowerCase");Debug.locals.put("varActiveTab", _varactivetab);
 BA.debugLineNum = 174;BA.debugLine="vue.SetStateSingle(atKey, varActiveTab)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_atkey" /*RemoteObject*/ )),(Object)((_varactivetab)));
 BA.debugLineNum = 175;BA.debugLine="SetAttr(CreateMap(\":md-active-tab\": atKey))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabs.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabs.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-active-tab")),(__ref.getField(true,"_atkey" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 176;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 177;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settabdisabled(RemoteObject __ref,RemoteObject _stepid,RemoteObject _steplabel) throws Exception{
try {
		Debug.PushSubsStack("SetTabDisabled (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("settabdisabled")) { return __ref.runUserSub(false, "vmtabs","settabdisabled", __ref, _stepid, _steplabel);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
Debug.locals.put("stepLabel", _steplabel);
 BA.debugLineNum = 45;BA.debugLine="Sub SetTabDisabled(stepID As String, stepLabel As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 47;BA.debugLine="Dim stepShow As String = $\"${stepID}disabled\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("disabled")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 48;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((_steplabel)));
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
public static RemoteObject  _settabicon(RemoteObject __ref,RemoteObject _stepid,RemoteObject _steplabel) throws Exception{
try {
		Debug.PushSubsStack("SetTabIcon (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("settabicon")) { return __ref.runUserSub(false, "vmtabs","settabicon", __ref, _stepid, _steplabel);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
Debug.locals.put("stepLabel", _steplabel);
 BA.debugLineNum = 37;BA.debugLine="Sub SetTabIcon(stepID As String, stepLabel As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 39;BA.debugLine="Dim stepShow As String = $\"${stepID}icon\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("icon")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 40;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((_steplabel)));
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
public static RemoteObject  _settablabel(RemoteObject __ref,RemoteObject _stepid,RemoteObject _steplabel) throws Exception{
try {
		Debug.PushSubsStack("SetTabLabel (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,29);
if (RapidSub.canDelegate("settablabel")) { return __ref.runUserSub(false, "vmtabs","settablabel", __ref, _stepid, _steplabel);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
Debug.locals.put("stepLabel", _steplabel);
 BA.debugLineNum = 29;BA.debugLine="Sub SetTabLabel(stepID As String, stepLabel As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 30;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 31;BA.debugLine="Dim stepShow As String = $\"${stepID}label\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("label")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 32;BA.debugLine="vue.SetStateSingle(stepShow, stepLabel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((_steplabel)));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtabs","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 113;BA.debugLine="Sub SetText(t As Object) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="Tabs.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 115;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 116;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmtabs","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 90;BA.debugLine="Sub SetVIf(vif As Object) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Tabs.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmtabs","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 85;BA.debugLine="Sub SetVModel(k As String) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="Tabs.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,95);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtabs","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 95;BA.debugLine="Sub SetVShow(vif As Object) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 96;BA.debugLine="Tabs.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _showtab(RemoteObject __ref,RemoteObject _stepid) throws Exception{
try {
		Debug.PushSubsStack("ShowTab (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("showtab")) { return __ref.runUserSub(false, "vmtabs","showtab", __ref, _stepid);}
RemoteObject _stepshow = RemoteObject.createImmutable("");
Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 59;BA.debugLine="Sub ShowTab(stepID As String) As VMTabs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="stepID = stepID.tolowercase";
Debug.JustUpdateDeviceLine();
_stepid = _stepid.runMethod(true,"toLowerCase");Debug.locals.put("stepID", _stepid);
 BA.debugLineNum = 61;BA.debugLine="Dim stepShow As String = $\"${stepID}show\"$";
Debug.JustUpdateDeviceLine();
_stepshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabs.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_stepid))),RemoteObject.createImmutable("show")));Debug.locals.put("stepShow", _stepshow);Debug.locals.put("stepShow", _stepshow);
 BA.debugLineNum = 62;BA.debugLine="vue.SetStateSingle(stepShow, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_stepshow),(Object)((vmtabs.__c.getField(true,"True"))));
 BA.debugLineNum = 63;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 64;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmtabs) ","vmtabs",96,__ref.getField(false, "ba"),__ref,81);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtabs","tostring", __ref);}
 BA.debugLineNum = 81;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 82;BA.debugLine="Return Tabs.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tabs" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 83;BA.debugLine="End Sub";
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