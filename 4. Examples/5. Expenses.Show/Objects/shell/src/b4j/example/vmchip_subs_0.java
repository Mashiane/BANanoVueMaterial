package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmchip_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmchip","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 53;BA.debugLine="Sub AddChild(child As VMElement) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 55;BA.debugLine="Chip.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
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
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _children) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmchip","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 102;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 104;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchip.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
 BA.debugLineNum = 106;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddClass (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmchip","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 84;BA.debugLine="Sub AddClass(c As String) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="Chip.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
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
public static RemoteObject  _addtocontainer(RemoteObject __ref,RemoteObject _pcont,RemoteObject _rowpos,RemoteObject _colpos) throws Exception{
try {
		Debug.PushSubsStack("AddToContainer (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,199);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmchip","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 199;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 200;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmchip.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 201;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Chip As VMElement";
vmchip._chip = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_chip",vmchip._chip);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmchip._id = RemoteObject.createImmutable("");__ref.setField("_id",vmchip._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmchip._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmchip._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmchip._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmchip._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmchip._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmchip._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmchip","initialize", __ref, _ba, _v, _sid, _eventhandler);}
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
 BA.debugLineNum = 13;BA.debugLine="Chip.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 14;BA.debugLine="Chip.SetTag(\"md-chip\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-chip")));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 17;BA.debugLine="Chip.SetOnClick(module, $\"${ID}_click\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))));
 BA.debugLineNum = 18;BA.debugLine="SetOnDelete";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchip.class, "_setondelete" /*RemoteObject*/ );
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
		Debug.PushSubsStack("Pop (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmchip","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 79;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmchip.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,48);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmchip","render", __ref);}
 BA.debugLineNum = 48;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 49;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmchip.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 50;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAccent (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmchip","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 72;BA.debugLine="Sub SetAccent(b As Boolean) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmchip.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 74;BA.debugLine="Chip.SetAccent(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmchip.__c.getField(true,"True")));
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
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _attr) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,90);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmchip","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 90;BA.debugLine="Sub SetAttr(attr As Map) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 91;BA.debugLine="Chip.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setclickable(RemoteObject __ref,RemoteObject _varclickable) throws Exception{
try {
		Debug.PushSubsStack("SetClickable (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,115);
if (RapidSub.canDelegate("setclickable")) { return __ref.runUserSub(false, "vmchip","setclickable", __ref, _varclickable);}
Debug.locals.put("varClickable", _varclickable);
 BA.debugLineNum = 115;BA.debugLine="Sub SetClickable(varClickable As Boolean) As VMChi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 116;BA.debugLine="If varClickable = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varclickable,vmchip.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 117;BA.debugLine="SetAttr(CreateMap(\":md-clickable\": varClickable))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-clickable")),(_varclickable)}))));
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
public static RemoteObject  _setdatasource(RemoteObject __ref,RemoteObject _sourcetable,RemoteObject _sourcefield,RemoteObject _displayfield) throws Exception{
try {
		Debug.PushSubsStack("SetDataSource (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,175);
if (RapidSub.canDelegate("setdatasource")) { return __ref.runUserSub(false, "vmchip","setdatasource", __ref, _sourcetable, _sourcefield, _displayfield);}
RemoteObject _intsel = RemoteObject.createImmutable(0);
RemoteObject _krow = RemoteObject.createImmutable("");
RemoteObject _drow = RemoteObject.createImmutable("");
Debug.locals.put("sourceTable", _sourcetable);
Debug.locals.put("sourceField", _sourcefield);
Debug.locals.put("displayField", _displayfield);
 BA.debugLineNum = 175;BA.debugLine="Sub SetDataSource(sourceTable As String, sourceFie";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 176;BA.debugLine="sourceTable = sourceTable.ToLowerCase";
Debug.JustUpdateDeviceLine();
_sourcetable = _sourcetable.runMethod(true,"toLowerCase");Debug.locals.put("sourceTable", _sourcetable);
 BA.debugLineNum = 177;BA.debugLine="sourceField = sourceField.ToLowerCase";
Debug.JustUpdateDeviceLine();
_sourcefield = _sourcefield.runMethod(true,"toLowerCase");Debug.locals.put("sourceField", _sourcefield);
 BA.debugLineNum = 178;BA.debugLine="displayField = displayField.tolowercase";
Debug.JustUpdateDeviceLine();
_displayfield = _displayfield.runMethod(true,"toLowerCase");Debug.locals.put("displayField", _displayfield);
 BA.debugLineNum = 180;BA.debugLine="Dim intSel As Int = 0";
Debug.JustUpdateDeviceLine();
_intsel = BA.numberCast(int.class, 0);Debug.locals.put("intSel", _intsel);Debug.locals.put("intSel", _intsel);
 BA.debugLineNum = 181;BA.debugLine="If sourceTable <> \"\" Then intSel = BANano.parseIn";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_sourcetable,BA.ObjectToString(""))) { 
_intsel = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_intsel))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("intSel", _intsel);};
 BA.debugLineNum = 182;BA.debugLine="If sourceField <> \"\" Then intSel = BANano.parseIn";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_sourcefield,BA.ObjectToString(""))) { 
_intsel = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_intsel))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("intSel", _intsel);};
 BA.debugLineNum = 183;BA.debugLine="If displayField <> \"\" Then intSel = BANano.parseI";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_displayfield,BA.ObjectToString(""))) { 
_intsel = RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_intsel))),RemoteObject.createImmutable(1)}, "+",1, 1);Debug.locals.put("intSel", _intsel);};
 BA.debugLineNum = 185;BA.debugLine="If intSel = 3 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_intsel,BA.numberCast(double.class, 3))) { 
 BA.debugLineNum = 186;BA.debugLine="Dim kRow As String = $\"row.${sourceField}\"$";
Debug.JustUpdateDeviceLine();
_krow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sourcefield))),RemoteObject.createImmutable("")));Debug.locals.put("kRow", _krow);Debug.locals.put("kRow", _krow);
 BA.debugLineNum = 187;BA.debugLine="Dim dRow As String = $\"row.${displayField}\"$";
Debug.JustUpdateDeviceLine();
_drow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_displayfield))),RemoteObject.createImmutable("")));Debug.locals.put("dRow", _drow);Debug.locals.put("dRow", _drow);
 BA.debugLineNum = 188;BA.debugLine="Chip.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="Chip.SetVFor(\"row\", sourceTable)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvfor" /*RemoteObject*/ ,(Object)(BA.ObjectToString("row")),(Object)(_sourcetable));
 BA.debugLineNum = 190;BA.debugLine="Chip.SetID($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmchip.__c.getField(true,"True")));
 BA.debugLineNum = 191;BA.debugLine="Chip.SetKey($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable(""))))),(Object)(vmchip.__c.getField(true,"True")));
 BA.debugLineNum = 192;BA.debugLine="Chip.SetText($\"{{ ${dRow} }}\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_drow))),RemoteObject.createImmutable(" }}")))));
 };
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
public static RemoteObject  _setdeletable(RemoteObject __ref,RemoteObject _vardeletable) throws Exception{
try {
		Debug.PushSubsStack("SetDeletable (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,122);
if (RapidSub.canDelegate("setdeletable")) { return __ref.runUserSub(false, "vmchip","setdeletable", __ref, _vardeletable);}
Debug.locals.put("varDeletable", _vardeletable);
 BA.debugLineNum = 122;BA.debugLine="Sub SetDeletable(varDeletable As Boolean) As VMChi";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 123;BA.debugLine="If varDeletable = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_vardeletable,vmchip.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 124;BA.debugLine="SetAttr(CreateMap(\":md-deletable\": varDeletable))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-deletable")),(_vardeletable)}))));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmchip","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 128;BA.debugLine="Sub SetDisabled(b As Boolean) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="Chip.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 130;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 131;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,169);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmchip","setkey", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 169;BA.debugLine="Sub SetKey(k As String) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 170;BA.debugLine="Chip.SetKey(k, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(vmchip.__c.getField(true,"False")));
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
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _labeltext) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmchip","setlabel", __ref, _labeltext);}
Debug.locals.put("labelText", _labeltext);
 BA.debugLineNum = 22;BA.debugLine="Sub SetLabel(labelText As String) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="If labelText = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_labeltext,BA.ObjectToString(""))) { 
if (true) return (__ref);};
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
public static RemoteObject  _setondelete(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetOnDelete (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("setondelete")) { return __ref.runUserSub(false, "vmchip","setondelete", __ref);}
RemoteObject _methodname = RemoteObject.createImmutable("");
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 135;BA.debugLine="private Sub SetOnDelete As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="Dim methodName As String  = $\"${ID}_delete\"$";
Debug.JustUpdateDeviceLine();
_methodname = (RemoteObject.concat(RemoteObject.createImmutable(""),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_delete")));Debug.locals.put("methodName", _methodname);Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 137;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmchip.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)),vmchip.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 138;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 139;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 140;BA.debugLine="SetAttr(CreateMap(\"v-on:md-delete\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmchip.class, "_setattr" /*RemoteObject*/ ,(Object)(vmchip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-delete")),(_methodname)}))));
 BA.debugLineNum = 142;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setoptions(RemoteObject __ref,RemoteObject _sourcename,RemoteObject _options,RemoteObject _sourcefield,RemoteObject _displayfield) throws Exception{
try {
		Debug.PushSubsStack("SetOptions (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,146);
if (RapidSub.canDelegate("setoptions")) { return __ref.runUserSub(false, "vmchip","setoptions", __ref, _sourcename, _options, _sourcefield, _displayfield);}
RemoteObject _recs = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _nrec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _krow = RemoteObject.createImmutable("");
RemoteObject _drow = RemoteObject.createImmutable("");
Debug.locals.put("sourceName", _sourcename);
Debug.locals.put("options", _options);
Debug.locals.put("sourcefield", _sourcefield);
Debug.locals.put("displayfield", _displayfield);
 BA.debugLineNum = 146;BA.debugLine="Sub SetOptions(sourceName As String, options As Ma";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 147;BA.debugLine="sourceName = sourceName.tolowercase";
Debug.JustUpdateDeviceLine();
_sourcename = _sourcename.runMethod(true,"toLowerCase");Debug.locals.put("sourceName", _sourcename);
 BA.debugLineNum = 148;BA.debugLine="Dim recs As List";
Debug.JustUpdateDeviceLine();
_recs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("recs", _recs);
 BA.debugLineNum = 149;BA.debugLine="recs.Initialize";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Initialize");
 BA.debugLineNum = 150;BA.debugLine="For Each k As String In options.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group4 = _options.runMethod(false,"Keys");
final int groupLen4 = group4.runMethod(true,"getSize").<Integer>get()
;int index4 = 0;
;
for (; index4 < groupLen4;index4++){
_k = BA.ObjectToString(group4.runMethod(false,"Get",index4));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 151;BA.debugLine="Dim v As String = options.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(_options.runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 152;BA.debugLine="Dim nrec As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_nrec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_nrec = vmchip.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("nrec", _nrec);Debug.locals.put("nrec", _nrec);
 BA.debugLineNum = 153;BA.debugLine="nrec.Put(sourcefield, k)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_sourcefield)),(Object)((_k)));
 BA.debugLineNum = 154;BA.debugLine="nrec.Put(displayfield, v)";
Debug.JustUpdateDeviceLine();
_nrec.runVoidMethod ("Put",(Object)((_displayfield)),(Object)((_v)));
 BA.debugLineNum = 155;BA.debugLine="recs.Add(nrec)";
Debug.JustUpdateDeviceLine();
_recs.runVoidMethod ("Add",(Object)((_nrec.getObject())));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 158;BA.debugLine="vue.SetStateSingle(sourceName, recs)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_sourcename),(Object)((_recs.getObject())));
 BA.debugLineNum = 159;BA.debugLine="Dim kRow As String = $\"row.${sourcefield}\"$";
Debug.JustUpdateDeviceLine();
_krow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sourcefield))),RemoteObject.createImmutable("")));Debug.locals.put("kRow", _krow);Debug.locals.put("kRow", _krow);
 BA.debugLineNum = 160;BA.debugLine="Dim dRow As String = $\"row.${displayfield}\"$";
Debug.JustUpdateDeviceLine();
_drow = (RemoteObject.concat(RemoteObject.createImmutable("row."),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_displayfield))),RemoteObject.createImmutable("")));Debug.locals.put("dRow", _drow);Debug.locals.put("dRow", _drow);
 BA.debugLineNum = 161;BA.debugLine="Chip.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 162;BA.debugLine="Chip.SetVFor(\"row\", sourceName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvfor" /*RemoteObject*/ ,(Object)(BA.ObjectToString("row")),(Object)(_sourcename));
 BA.debugLineNum = 163;BA.debugLine="Chip.SetID($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable("")))),(Object)(vmchip.__c.getField(true,"True")));
 BA.debugLineNum = 164;BA.debugLine="Chip.SetKey($\"${kRow}\"$,True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)(((RemoteObject.concat(RemoteObject.createImmutable(""),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_krow))),RemoteObject.createImmutable(""))))),(Object)(vmchip.__c.getField(true,"True")));
 BA.debugLineNum = 165;BA.debugLine="Chip.SetText($\"{{ ${dRow} }}\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vmchip.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_drow))),RemoteObject.createImmutable(" }}")))));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,109);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmchip","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 109;BA.debugLine="Sub SetPadding(p As Object) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 110;BA.debugLine="Chip.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setprimary(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPrimary (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmchip","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 66;BA.debugLine="Sub SetPrimary(b As Boolean) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vmchip.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 68;BA.debugLine="Chip.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmchip.__c.getField(true,"True")));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmchip","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 96;BA.debugLine="Sub SetStyle(sm As Map) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="Chip.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 98;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 99;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmchip","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 60;BA.debugLine="Sub SetText(t As String) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="If t = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_t,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 62;BA.debugLine="Chip.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmchip","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 37;BA.debugLine="Sub SetVIf(vif As Object) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="Chip.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 39;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 40;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,32);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmchip","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 32;BA.debugLine="Sub SetVModel(k As String) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 33;BA.debugLine="Chip.SetVModel(k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_k));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmchip","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 42;BA.debugLine="Sub SetVShow(vif As Object) As VMChip";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="Chip.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmchip) ","vmchip",43,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmchip","tostring", __ref);}
 BA.debugLineNum = 28;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="Return Chip.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_chip" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 30;BA.debugLine="End Sub";
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