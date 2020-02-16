package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmtabsitem_subs_0 {


public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmtabsitem","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 42;BA.debugLine="Sub AddChild(child As VMElement) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 44;BA.debugLine="TabItem.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 45;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 46;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmtabsitem","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 78;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 80;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabsitem.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmtabsitem","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 60;BA.debugLine="Sub AddClass(c As String) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="TabItem.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 62;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 63;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public TabItem As VMElement";
vmtabsitem._tabitem = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_tabitem",vmtabsitem._tabitem);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmtabsitem._id = RemoteObject.createImmutable("");__ref.setField("_id",vmtabsitem._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmtabsitem._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmtabsitem._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmtabsitem._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmtabsitem._banano);
 //BA.debugLineNum = 7;BA.debugLine="Private module As Object";
vmtabsitem._module = RemoteObject.createNew ("Object");__ref.setField("_module",vmtabsitem._module);
 //BA.debugLineNum = 8;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,11);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmtabsitem","initialize", __ref, _ba, _v, _sid, _eventhandler);}
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
 BA.debugLineNum = 13;BA.debugLine="TabItem.Initialize(v, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(_v),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 14;BA.debugLine="TabItem.SetTag(\"md-tab\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-tab")));
 BA.debugLineNum = 15;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 16;BA.debugLine="SetId(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabsitem.class, "_setid" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 17;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
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
		Debug.PushSubsStack("Pop (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,55);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmtabsitem","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 55;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 56;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtabsitem.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmtabsitem","render", __ref);}
 BA.debugLineNum = 37;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmtabsitem.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 39;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,66);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmtabsitem","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 66;BA.debugLine="Sub SetAttr(attr As Map) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 67;BA.debugLine="TabItem.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 68;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 69;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _vardisabled) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,121);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmtabsitem","setdisabled", __ref, _vardisabled);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varDisabled", _vardisabled);
 BA.debugLineNum = 121;BA.debugLine="Sub SetDisabled(varDisabled As Boolean) As VMTabsI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 122;BA.debugLine="Dim pp As String = $\"${ID}disabled\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabsitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("disabled")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 123;BA.debugLine="vue.SetStateSingle(pp, varDisabled)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_vardisabled)));
 BA.debugLineNum = 124;BA.debugLine="SetAttr(CreateMap(\":md-disabled\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabsitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabsitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-disabled")),(_pp)}))));
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
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _varicon) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmtabsitem","seticon", __ref, _varicon);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varIcon", _varicon);
 BA.debugLineNum = 113;BA.debugLine="Sub SetIcon(varIcon As String) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="Dim pp As String = $\"${ID}icon\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabsitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icon")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 115;BA.debugLine="vue.SetStateSingle(pp, varIcon)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_varicon)));
 BA.debugLineNum = 116;BA.debugLine="SetAttr(CreateMap(\":md-icon\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabsitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabsitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-icon")),(_pp)}))));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _varid) throws Exception{
try {
		Debug.PushSubsStack("SetId (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmtabsitem","setid", __ref, _varid);}
Debug.locals.put("varId", _varid);
 BA.debugLineNum = 91;BA.debugLine="Sub SetId(varId As String) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="If varId = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varid,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 93;BA.debugLine="SetAttr(CreateMap(\"id\": varId))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabsitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabsitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_varid)}))));
 BA.debugLineNum = 94;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 95;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlabel(RemoteObject __ref,RemoteObject _varlabel) throws Exception{
try {
		Debug.PushSubsStack("SetLabel (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("setlabel")) { return __ref.runUserSub(false, "vmtabsitem","setlabel", __ref, _varlabel);}
RemoteObject _pp = RemoteObject.createImmutable("");
Debug.locals.put("varLabel", _varlabel);
 BA.debugLineNum = 105;BA.debugLine="Sub SetLabel(varLabel As String) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="Dim pp As String = $\"${ID}label\"$";
Debug.JustUpdateDeviceLine();
_pp = (RemoteObject.concat(RemoteObject.createImmutable(""),vmtabsitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("label")));Debug.locals.put("pp", _pp);Debug.locals.put("pp", _pp);
 BA.debugLineNum = 107;BA.debugLine="vue.SetStateSingle(pp, varLabel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_pp),(Object)((_varlabel)));
 BA.debugLineNum = 108;BA.debugLine="SetAttr(CreateMap(\":md-label\": pp))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabsitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabsitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-label")),(_pp)}))));
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
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,85);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmtabsitem","setpadding", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 85;BA.debugLine="Sub SetPadding(p As Object) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 86;BA.debugLine="TabItem.SetPaddingAll(p)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setpaddingall" /*RemoteObject*/ ,(Object)(_p));
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
public static RemoteObject  _setref(RemoteObject __ref,RemoteObject _varref) throws Exception{
try {
		Debug.PushSubsStack("SetRef (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setref")) { return __ref.runUserSub(false, "vmtabsitem","setref", __ref, _varref);}
Debug.locals.put("varRef", _varref);
 BA.debugLineNum = 98;BA.debugLine="Sub SetRef(varRef As String) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="If varRef = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_varref,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 100;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabsitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabsitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("ref")),(_varref)}))));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _sm) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmtabsitem","setstyle", __ref, _sm);}
Debug.locals.put("sm", _sm);
 BA.debugLineNum = 72;BA.debugLine="Sub SetStyle(sm As Map) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="TabItem.SetStyle(sm)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_sm));
 BA.debugLineNum = 74;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 75;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settemplatedata(RemoteObject __ref,RemoteObject _vartemplatedata) throws Exception{
try {
		Debug.PushSubsStack("SetTemplateData (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,129);
if (RapidSub.canDelegate("settemplatedata")) { return __ref.runUserSub(false, "vmtabsitem","settemplatedata", __ref, _vartemplatedata);}
Debug.locals.put("varTemplateData", _vartemplatedata);
 BA.debugLineNum = 129;BA.debugLine="Sub SetTemplateData(varTemplateData As Object) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 130;BA.debugLine="SetAttr(CreateMap(\"md-template-data\": varTemplate";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmtabsitem.class, "_setattr" /*RemoteObject*/ ,(Object)(vmtabsitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("md-template-data")),_vartemplatedata}))));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmtabsitem","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 49;BA.debugLine="Sub SetText(t As String) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="TabItem.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 51;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 52;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,26);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmtabsitem","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 26;BA.debugLine="Sub SetVIf(vif As String) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 27;BA.debugLine="TabItem.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmtabsitem","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 31;BA.debugLine="Sub SetVShow(vif As String) As VMTabsItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="TabItem.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmtabsitem) ","vmtabsitem",97,__ref.getField(false, "ba"),__ref,22);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmtabsitem","tostring", __ref);}
 BA.debugLineNum = 22;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 23;BA.debugLine="Return TabItem.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_tabitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 24;BA.debugLine="End Sub";
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