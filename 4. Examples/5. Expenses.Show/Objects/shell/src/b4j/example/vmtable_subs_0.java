package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtable_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmtable","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 129;BA.debugLine="Sub AddChild(child As VMElement) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 131;BA.debugLine="Table.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 132;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 133;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmtable","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 175;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 177;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtable.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 179;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,157);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtable","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 157;BA.debugLine="Sub AddClass(c As String) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 158;BA.debugLine="Table.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addcolumn(RemoteObject __ref,RemoteObject _colid,RemoteObject _collabel,RemoteObject _colnumeric,RemoteObject _colvisible) throws Exception{
try {
		Debug.PushSubsStack("AddColumn (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("addcolumn")) { return __ref.runUserSub(false, "vmtable","addcolumn", __ref, _colid, _collabel, _colnumeric, _colvisible);}
RemoteObject _tc = RemoteObject.declareNull("b4j.example.vmtd");
Debug.locals.put("colID", _colid);
Debug.locals.put("colLabel", _collabel);
Debug.locals.put("colNumeric", _colnumeric);
Debug.locals.put("colVisible", _colvisible);
 BA.debugLineNum = 55;BA.debugLine="Sub AddColumn(colID As String, colLabel As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="Dim tc As VMTD";
Debug.JustUpdateDeviceLine();
_tc = RemoteObject.createNew ("b4j.example.vmtd");Debug.locals.put("tc", _tc);
 BA.debugLineNum = 57;BA.debugLine="tc.Initialize(vue, colID).SetLabel(colLabel).SetS";
Debug.JustUpdateDeviceLine();
_tc.runClassMethod (b4j.example.vmtd.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_colid)).runClassMethod (b4j.example.vmtd.class, "_setlabel" /*RemoteObject*/ ,(Object)(_collabel)).runClassMethod (b4j.example.vmtd.class, "_setsortby" /*RemoteObject*/ ,(Object)(_colid)).runClassMethod (b4j.example.vmtd.class, "_setnumeric" /*RemoteObject*/ ,(Object)(_colnumeric)).runClassMethod (b4j.example.vmtd.class, "_settext" /*RemoteObject*/ ,(Object)(((RemoteObject.concat(RemoteObject.createImmutable("{{ item."),vmtable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_colid))),RemoteObject.createImmutable(" }}"))))));
 BA.debugLineNum = 58;BA.debugLine="tc.SetVShow(colVisible)";
Debug.JustUpdateDeviceLine();
_tc.runClassMethod (b4j.example.vmtd.class, "_setvshow" /*RemoteObject*/ ,(Object)(_colvisible));
 BA.debugLineNum = 59;BA.debugLine="tc.Pop(tblRow.TR)";
Debug.JustUpdateDeviceLine();
_tc.runClassMethod (b4j.example.vmtd.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_tblrow" /*RemoteObject*/ ).getField(false,"_tr" /*RemoteObject*/ )));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,188);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmtable","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 188;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 189;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmtable.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 190;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Table As VMElement";
vmtable._table = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_table",vmtable._table);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtable._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtable._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtable._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtable._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmtable._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmtable._banano);
 //BA.debugLineNum = 7;BA.debugLine="Public ToolBar As VMToolBar";
vmtable._toolbar = RemoteObject.createNew ("b4j.example.vmtoolbar");__ref.setField("_toolbar",vmtable._toolbar);
 //BA.debugLineNum = 8;BA.debugLine="Private module As Object";
vmtable._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmtable._module);
 //BA.debugLineNum = 9;BA.debugLine="Private tblRow As VMTR";
vmtable._tblrow = RemoteObject.createNew ("b4j.example.vmtr");__ref.setField("_tblrow",vmtable._tblrow);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,13);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtable","initialize", __ref, _ba, _v, _sid, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 13;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 14;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 15;BA.debugLine="Table.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 16;BA.debugLine="Table.SetTag(\"md-table\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-table")));
 BA.debugLineNum = 17;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 18;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 19;BA.debugLine="SetOnSelected";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtable.class, "_setonselected" /*RemoteObject*/ );
 BA.debugLineNum = 21;BA.debugLine="ToolBar.Initialize(vue, $\"${ID}table\"$, eventHand";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("table")))),(Object)(_eventhandler)).runClassMethod (b4j.example.vmtoolbar.class, "_settabletoolbar" /*RemoteObject*/ ,(Object)(vmtable.__c.getField(true,"True")));
 BA.debugLineNum = 22;BA.debugLine="tblRow.Initialize(vue, $\"${ID}row\"$, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tblrow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtr.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmtable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("row")))),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 23;BA.debugLine="Table.RemoveAttr(\":required\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":required")));
 BA.debugLineNum = 24;BA.debugLine="Table.RemoveAttr(\":disabled\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":disabled")));
 BA.debugLineNum = 25;BA.debugLine="Table.RemoveAttr(\"id\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 26;BA.debugLine="Table.RemoveAttr(\"ref\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ref")));
 BA.debugLineNum = 27;BA.debugLine="Dim pp As String = $\"${ID}selection\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("selection")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 28;BA.debugLine="vue.SetStateSingle(pp, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)(vmtable.__c.getField(false,"Null")));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtable","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 152;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtable.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 154;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtable","render", __ref);}
 BA.debugLineNum = 124;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtable.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 126;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmtable","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 146;BA.debugLine="Sub SetAccent(b As Boolean) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 147;BA.debugLine="If b Then Table.SetAccent(True)";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmtable.__c.getField(true,"True")));};
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,163);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtable","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 163;BA.debugLine="Sub SetAttr(attr As Map) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 164;BA.debugLine="Table.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 165;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 166;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setautoselect(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAutoSelect (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,44);
if (RapidSub.canDelegate("setautoselect")) { return __ref.runUserSub(false, "vmtable","setautoselect", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 44;BA.debugLine="Sub SetAutoSelect(b As Boolean) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 45;BA.debugLine="tblRow.SetAutoSelect(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tblrow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtr.class, "_setautoselect" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setcard(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCard (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("setcard")) { return __ref.runUserSub(false, "vmtable","setcard", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 83;BA.debugLine="Sub SetCard(b As Boolean) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="If b Then SetAttr(CreateMap(\"md-card\": True))";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmtable.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-card")),(vmtable.__c.getField(true,"True"))}))));};
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
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,50);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmtable","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 50;BA.debugLine="Sub SetElevation(e As Int) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 51;BA.debugLine="Table.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
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
public static RemoteObject  _setfixedheaders(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetFixedHeaders (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,73);
if (RapidSub.canDelegate("setfixedheaders")) { return __ref.runUserSub(false, "vmtable","setfixedheaders", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 73;BA.debugLine="Sub SetFixedHeaders(b As Boolean) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 74;BA.debugLine="If b Then SetAttr(CreateMap(\"md-fixed-header\":\"tr";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmtable.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-fixed-header")),(RemoteObject.createImmutable("true"))}))));};
 BA.debugLineNum = 75;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonselected(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnSelected (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setonselected")) { return __ref.runUserSub(false, "vmtable","setonselected", __ref);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 108;BA.debugLine="private Sub SetOnSelected As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Dim items As List";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 110;BA.debugLine="Dim methodName As String = $\"${ID}_select\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtable.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_select")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 111;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vmtable.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_items.getObject())}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 112;BA.debugLine="SetAttr(CreateMap(\"@md-selected\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtable.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("@md-selected")),(_methodname)}))));
 BA.debugLineNum = 114;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,182);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmtable","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 182;BA.debugLine="Sub SetPadding(p As Object) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 183;BA.debugLine="Table.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,141);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmtable","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 141;BA.debugLine="Sub SetPrimary(b As Boolean) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 142;BA.debugLine="If b Then Table.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmtable.__c.getField(true,"True")));};
 BA.debugLineNum = 143;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 144;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setselectablemultiple(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSelectableMultiple (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,39);
if (RapidSub.canDelegate("setselectablemultiple")) { return __ref.runUserSub(false, "vmtable","setselectablemultiple", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 39;BA.debugLine="Sub SetSelectableMultiple(b As Boolean) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 40;BA.debugLine="tblRow.SetSelectableMultiple(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tblrow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtr.class, "_setselectablemultiple" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setselectablesingle(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSelectableSingle (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("setselectablesingle")) { return __ref.runUserSub(false, "vmtable","setselectablesingle", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 33;BA.debugLine="Sub SetSelectableSingle(b As Boolean) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="tblRow.SetSelectableSingle(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tblrow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtr.class, "_setselectablesingle" /*RemoteObject*/ ,(Object)(_b));
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
public static RemoteObject  _setsort(RemoteObject __ref,RemoteObject _columnname) throws Exception{
try {
		Debug.PushSubsStack("SetSort (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("setsort")) { return __ref.runUserSub(false, "vmtable","setsort", __ref, _columnname);}
Debug.locals.put("columnName", _columnname);
 BA.debugLineNum = 78;BA.debugLine="Sub SetSort(columnName As String) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="SetAttr(CreateMap(\"md-sort\":columnName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtable.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-sort")),(_columnname)}))));
 BA.debugLineNum = 80;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 81;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsortorderasc(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSortOrderAsc (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setsortorderasc")) { return __ref.runUserSub(false, "vmtable","setsortorderasc", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 98;BA.debugLine="Sub SetSortOrderAsc(b As Boolean) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="If b Then SetAttr(CreateMap(\"md-sort-order\":\"asc\"";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmtable.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-sort-order")),(RemoteObject.createImmutable("asc"))}))));};
 BA.debugLineNum = 100;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 101;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsortorderdesc(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSortOrderDesc (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("setsortorderdesc")) { return __ref.runUserSub(false, "vmtable","setsortorderdesc", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 103;BA.debugLine="Sub SetSortOrderDesc(b As Boolean) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="If b Then SetAttr(CreateMap(\"md-sort-order\":\"desc";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmtable.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtable.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-sort-order")),(RemoteObject.createImmutable("desc"))}))));};
 BA.debugLineNum = 105;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 106;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmtable","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 169;BA.debugLine="Sub SetStyle(sm As Map) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="Table.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 171;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 172;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,136);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtable","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 136;BA.debugLine="Sub SetText(t As Object) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 137;BA.debugLine="Table.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 138;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 139;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmtable","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 93;BA.debugLine="Sub SetVIf(vif As Object) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="Table.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvmodel(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetVModel (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,88);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmtable","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 88;BA.debugLine="Sub SetVModel(k As String) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 89;BA.debugLine="Table.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
 BA.debugLineNum = 90;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 91;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtable","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 118;BA.debugLine="Sub SetVShow(vif As Object) As VMTable";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="Table.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmtable) ","vmtable",95,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtable","tostring", __ref);}
 BA.debugLineNum = 63;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="If ToolBar.HasContent Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_toolbar" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 65;BA.debugLine="ToolBar.Pop(Table)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_toolbar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtoolbar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_table" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 67;BA.debugLine="If tblRow.hascontent Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_tblrow" /*RemoteObject*/ ).getField(true,"_hascontent" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 68;BA.debugLine="tblRow.Pop(Table)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tblrow" /*RemoteObject*/ ).runClassMethod (b4j.example.vmtr.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_table" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 70;BA.debugLine="Return Table.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_table" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 71;BA.debugLine="End Sub";
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