package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmlist_subs_0 {


public static RemoteObject  _addbutton(RemoteObject __ref,RemoteObject _btnid,RemoteObject _btntext) throws Exception{
try {
		Debug.PushSubsStack("AddButton (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("addbutton")) { return __ref.runUserSub(false, "vmlist","addbutton", __ref, _btnid, _btntext);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("btnID", _btnid);
Debug.locals.put("btnText", _btntext);
 BA.debugLineNum = 82;BA.debugLine="Sub AddButton(btnID As String, btnText As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 84;BA.debugLine="li.Initialize(vue, $\"${btnID}li\"$, eventHandler).";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_btnid))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_addbutton" /*RemoteObject*/ ,(Object)(_btnid),(Object)(_btntext));
 BA.debugLineNum = 85;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 86;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("48px !important")),RemoteObject.createImmutable(("padding-top")),(RemoteObject.createImmutable("10px !important"))}))));
 };
 BA.debugLineNum = 88;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 89;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 90;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcheckbox(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vvalue,RemoteObject _vtext,RemoteObject _bprimary) throws Exception{
try {
		Debug.PushSubsStack("AddCheckBox (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,93);
if (RapidSub.canDelegate("addcheckbox")) { return __ref.runUserSub(false, "vmlist","addcheckbox", __ref, _vmodel, _vvalue, _vtext, _bprimary);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vValue", _vvalue);
Debug.locals.put("vText", _vtext);
Debug.locals.put("bPrimary", _bprimary);
 BA.debugLineNum = 93;BA.debugLine="Sub AddCheckBox(vmodel As String, vValue As Boolea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 94;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 95;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_addcheckbox" /*RemoteObject*/ ,(Object)(_vmodel),(Object)(_vvalue),(Object)(_vtext),(Object)(_bprimary));
 BA.debugLineNum = 96;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 97;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"32px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("32px !important")),RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("margin-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("5px !important"))}))));
 };
 BA.debugLineNum = 101;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 102;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,257);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmlist","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 257;BA.debugLine="Sub AddClass(c As String) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 258;BA.debugLine="List.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 259;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 260;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddatepicker(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddDatePicker (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,105);
if (RapidSub.canDelegate("adddatepicker")) { return __ref.runUserSub(false, "vmlist","adddatepicker", __ref, _vmodel, _vtext, _vvalue);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 105;BA.debugLine="Sub AddDatePicker(vmodel As String, vText As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 106;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 107;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_adddatepicker" /*RemoteObject*/ ,(Object)(_vmodel),(Object)(_vtext),(Object)(_vvalue));
 BA.debugLineNum = 108;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 109;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("48px !important")),RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("margin-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("5px !important"))}))));
 };
 BA.debugLineNum = 113;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 114;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 115;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddivider(RemoteObject __ref,RemoteObject _binset) throws Exception{
try {
		Debug.PushSubsStack("AddDivider (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("adddivider")) { return __ref.runUserSub(false, "vmlist","adddivider", __ref, _binset);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmdivider");
Debug.locals.put("bInset", _binset);
 BA.debugLineNum = 303;BA.debugLine="Sub AddDivider(bInset As Boolean) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 304;BA.debugLine="Dim el As VMDivider";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmdivider");Debug.locals.put("el", _el);
 BA.debugLineNum = 305;BA.debugLine="el.Initialize(vue, \"\").SetInset(bInset)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmdivider.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vmdivider.class, "_setinset" /*RemoteObject*/ ,(Object)(_binset));
 BA.debugLineNum = 306;BA.debugLine="el.Pop(List)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmdivider.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_list" /*RemoteObject*/ )));
 BA.debugLineNum = 307;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 308;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 309;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addiconbutton(RemoteObject __ref,RemoteObject _btnid,RemoteObject _btnicon) throws Exception{
try {
		Debug.PushSubsStack("AddIconButton (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,60);
if (RapidSub.canDelegate("addiconbutton")) { return __ref.runUserSub(false, "vmlist","addiconbutton", __ref, _btnid, _btnicon);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("btnID", _btnid);
Debug.locals.put("btnIcon", _btnicon);
 BA.debugLineNum = 60;BA.debugLine="Sub AddIconButton(btnID As String, btnIcon As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 61;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 62;BA.debugLine="li.Initialize(vue, $\"${btnID}li\"$, eventHandler).";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_btnid))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_addiconbutton" /*RemoteObject*/ ,(Object)(_btnid),(Object)(_btnicon));
 BA.debugLineNum = 63;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 64;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("48px !important")),RemoteObject.createImmutable(("padding-top")),(RemoteObject.createImmutable("10px !important"))}))));
 };
 BA.debugLineNum = 66;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 67;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addinput(RemoteObject __ref,RemoteObject _typeof,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vicon,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddInput (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("addinput")) { return __ref.runUserSub(false, "vmlist","addinput", __ref, _typeof, _vmodel, _vtext, _vicon, _vvalue);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("typeOf", _typeof);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vIcon", _vicon);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 70;BA.debugLine="Sub AddInput(typeOf As String, vModel As String, v";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 72;BA.debugLine="li.Initialize(vue, $\"${vModel}li\"$, eventHandler)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_addinput" /*RemoteObject*/ ,(Object)(_typeof),(Object)(_vmodel),(Object)(_vtext),(Object)(_vicon),(Object)(_vvalue));
 BA.debugLineNum = 73;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 74;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("48px !important")),RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("margin-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("10px !important"))}))));
 };
 BA.debugLineNum = 78;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 79;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 80;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlabel(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AddLabel (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,47);
if (RapidSub.canDelegate("addlabel")) { return __ref.runUserSub(false, "vmlist","addlabel", __ref, _txt);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 47;BA.debugLine="Sub AddLabel(txt As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 48;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 49;BA.debugLine="li.Initialize(vue, \"\",eventHandler).AddLabel(txt)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(BA.ObjectToString("")),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_addlabel" /*RemoteObject*/ ,(Object)(_txt));
 BA.debugLineNum = 50;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 51;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"32px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("32px !important")),RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("margin-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("5px !important"))}))));
 };
 BA.debugLineNum = 56;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 57;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 58;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addnumberinput(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _label,RemoteObject _minvalue,RemoteObject _maxvalue,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddNumberInput (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,158);
if (RapidSub.canDelegate("addnumberinput")) { return __ref.runUserSub(false, "vmlist","addnumberinput", __ref, _vmodel, _label, _minvalue, _maxvalue, _value);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("Label", _label);
Debug.locals.put("minValue", _minvalue);
Debug.locals.put("maxValue", _maxvalue);
Debug.locals.put("value", _value);
 BA.debugLineNum = 158;BA.debugLine="Sub AddNumberInput(vmodel As String, Label As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 159;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 160;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_addnumberinput" /*RemoteObject*/ ,(Object)(_vmodel),(Object)(_label),(Object)(_minvalue),(Object)(_maxvalue),(Object)(_value));
 BA.debugLineNum = 161;BA.debugLine="li.AddClass(\"numberinput\")";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("numberinput")));
 BA.debugLineNum = 162;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 163;BA.debugLine="li.SetStyle(CreateMap(\"padding-top\": \"10px !impo";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("margin-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("5px !important"))}))));
 };
 BA.debugLineNum = 166;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 167;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addradio(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vvalue,RemoteObject _vtext,RemoteObject _bprimary,RemoteObject _bdesignmode) throws Exception{
try {
		Debug.PushSubsStack("AddRadio (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("addradio")) { return __ref.runUserSub(false, "vmlist","addradio", __ref, _vmodel, _vvalue, _vtext, _bprimary, _bdesignmode);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vValue", _vvalue);
Debug.locals.put("vText", _vtext);
Debug.locals.put("bPrimary", _bprimary);
Debug.locals.put("bDesignMode", _bdesignmode);
 BA.debugLineNum = 193;BA.debugLine="Sub AddRadio(vmodel As String, vValue As String, v";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 194;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 195;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_setradio" /*RemoteObject*/ ,(Object)(_vmodel),(Object)(_vvalue),(Object)(_vtext),(Object)(_bprimary),(Object)(_bdesignmode));
 BA.debugLineNum = 196;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 197;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"32px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("32px !important")),RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("margin-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("5px !important"))}))));
 };
 BA.debugLineNum = 202;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 203;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addselect(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _sourcename,RemoteObject _options,RemoteObject _sourcefield,RemoteObject _displayfield) throws Exception{
try {
		Debug.PushSubsStack("AddSelect (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,117);
if (RapidSub.canDelegate("addselect")) { return __ref.runUserSub(false, "vmlist","addselect", __ref, _vmodel, _vtext, _sourcename, _options, _sourcefield, _displayfield);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("sourceName", _sourcename);
Debug.locals.put("options", _options);
Debug.locals.put("sourcefield", _sourcefield);
Debug.locals.put("displayfield", _displayfield);
 BA.debugLineNum = 117;BA.debugLine="Sub AddSelect(vmodel As String, vText As String, s";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 118;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 119;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_addselect" /*RemoteObject*/ ,(Object)(_vmodel),(Object)(_vtext),(Object)(_sourcename),(Object)(_options),(Object)(_sourcefield),(Object)(_displayfield));
 BA.debugLineNum = 120;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 121;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("48px !important")),RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("margin-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("5px !important"))}))));
 };
 BA.debugLineNum = 125;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 126;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
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
public static RemoteObject  _addslider(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _label,RemoteObject _minvalue,RemoteObject _maxvalue,RemoteObject _value,RemoteObject _labelontop) throws Exception{
try {
		Debug.PushSubsStack("AddSlider (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,144);
if (RapidSub.canDelegate("addslider")) { return __ref.runUserSub(false, "vmlist","addslider", __ref, _vmodel, _label, _minvalue, _maxvalue, _value, _labelontop);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("Label", _label);
Debug.locals.put("minValue", _minvalue);
Debug.locals.put("maxValue", _maxvalue);
Debug.locals.put("value", _value);
Debug.locals.put("labelOnTop", _labelontop);
 BA.debugLineNum = 144;BA.debugLine="Sub AddSlider(vmodel As String, Label As String, m";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 145;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 146;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_addslider" /*RemoteObject*/ ,(Object)(_vmodel),(Object)(_label),(Object)(_minvalue),(Object)(_maxvalue),(Object)(_value),(Object)(_labelontop));
 BA.debugLineNum = 147;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 148;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("48px !important")),RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("margin-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("5px !important"))}))));
 };
 BA.debugLineNum = 153;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 154;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 155;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addsubheader(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("AddSubHeader (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,296);
if (RapidSub.canDelegate("addsubheader")) { return __ref.runUserSub(false, "vmlist","addsubheader", __ref, _t);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("t", _t);
 BA.debugLineNum = 296;BA.debugLine="Sub AddSubHeader(t As Object) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 297;BA.debugLine="Dim el As VMElement";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("el", _el);
 BA.debugLineNum = 298;BA.debugLine="el.Initialize(vue, \"\").SetTagSubHeader(True).SetT";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable(""))).runClassMethod (b4j.example.vmelement.class, "_settagsubheader" /*RemoteObject*/ ,(Object)(vmlist.__c.getField(true,"True"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_t))).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_list" /*RemoteObject*/ )));
 BA.debugLineNum = 299;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 300;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 301;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addswitch(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _bprimary,RemoteObject _bvalue) throws Exception{
try {
		Debug.PushSubsStack("AddSwitch (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,180);
if (RapidSub.canDelegate("addswitch")) { return __ref.runUserSub(false, "vmlist","addswitch", __ref, _vmodel, _vtext, _bprimary, _bvalue);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("bPrimary", _bprimary);
Debug.locals.put("bValue", _bvalue);
 BA.debugLineNum = 180;BA.debugLine="Sub AddSwitch(vmodel As String, vText As String, b";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 181;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 182;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_setswitch" /*RemoteObject*/ ,(Object)(_vmodel),(Object)(_vtext),(Object)(_bprimary),(Object)(_bvalue));
 BA.debugLineNum = 183;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 184;BA.debugLine="li.SetStyle(CreateMap(\"height\": \"48px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("48px !important")),RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("10px !important")),RemoteObject.createImmutable(("margin-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("5px !important"))}))));
 };
 BA.debugLineNum = 188;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 189;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
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
public static RemoteObject  _addtextarea(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddTextArea (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,170);
if (RapidSub.canDelegate("addtextarea")) { return __ref.runUserSub(false, "vmlist","addtextarea", __ref, _vmodel, _vtext, _vvalue);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 170;BA.debugLine="Sub AddTextArea(vmodel As String, vText As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 171;BA.debugLine="Dim li As VMListItem";
Debug.JustUpdateDeviceLine();
_li = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("li", _li);
 BA.debugLineNum = 172;BA.debugLine="li.Initialize(vue, $\"${vmodel}li\"$, eventHandler)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("li")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlistitem.class, "_addtextarea" /*RemoteObject*/ ,(Object)(_vmodel),(Object)(_vtext),(Object)(_vvalue));
 BA.debugLineNum = 173;BA.debugLine="If isPropertyBag Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_ispropertybag" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 174;BA.debugLine="li.SetStyle(CreateMap(\"height\":\"130px !important";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),RemoteObject.createImmutable(("130px !important")),RemoteObject.createImmutable(("padding-top")),(RemoteObject.createImmutable("10px !important"))}))));
 };
 BA.debugLineNum = 176;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 177;BA.debugLine="li.Pop(Me)";
Debug.JustUpdateDeviceLine();
_li.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 178;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddToContainer (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("addtocontainer")) { return __ref.runUserSub(false, "vmlist","addtocontainer", __ref, _pcont, _rowpos, _colpos);}
Debug.locals.put("pCont", _pcont);
Debug.locals.put("rowPos", _rowpos);
Debug.locals.put("colPos", _colpos);
 BA.debugLineNum = 325;BA.debugLine="Sub AddToContainer(pCont As VMContainer, rowPos As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 326;BA.debugLine="pCont.AddComponent(rowPos, colPos, ToString)";
Debug.JustUpdateDeviceLine();
_pcont.runClassMethod (b4j.example.vmcontainer.class, "_addcomponent" /*RemoteObject*/ ,(Object)(_rowpos),(Object)(_colpos),(Object)(__ref.runClassMethod (b4j.example.vmlist.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 327;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public List As VMElement";
vmlist._list = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_list",vmlist._list);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmlist._id = RemoteObject.createImmutable("");__ref.setField("_id",vmlist._id);
 //BA.debugLineNum = 5;BA.debugLine="Public vue As BANanoVue";
vmlist._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmlist._vue);
 //BA.debugLineNum = 6;BA.debugLine="Public HasContent As Boolean";
vmlist._hascontent = RemoteObject.createImmutable(false);__ref.setField("_hascontent",vmlist._hascontent);
 //BA.debugLineNum = 7;BA.debugLine="Private eventHandler As Object";
vmlist._eventhandler = RemoteObject.createNew ("Object");__ref.setField("_eventhandler",vmlist._eventhandler);
 //BA.debugLineNum = 8;BA.debugLine="Public isPropertyBag As Boolean";
vmlist._ispropertybag = RemoteObject.createImmutable(false);__ref.setField("_ispropertybag",vmlist._ispropertybag);
 //BA.debugLineNum = 9;BA.debugLine="Private expandS As String";
vmlist._expands = RemoteObject.createImmutable("");__ref.setField("_expands",vmlist._expands);
 //BA.debugLineNum = 10;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _createdivider(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("CreateDivider (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,234);
if (RapidSub.canDelegate("createdivider")) { return __ref.runUserSub(false, "vmlist","createdivider", __ref, _b);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmdivider");
Debug.locals.put("b", _b);
 BA.debugLineNum = 234;BA.debugLine="Sub CreateDivider(b As Boolean) As VMDivider";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 235;BA.debugLine="Dim el As VMDivider";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmdivider");Debug.locals.put("el", _el);
 BA.debugLineNum = 236;BA.debugLine="el.Initialize(vue, \"\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmdivider.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("")));
 BA.debugLineNum = 237;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 238;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
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
public static RemoteObject  _createitem(RemoteObject __ref,RemoteObject _itemid) throws Exception{
try {
		Debug.PushSubsStack("CreateItem (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("createitem")) { return __ref.runUserSub(false, "vmlist","createitem", __ref, _itemid);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmlistitem");
Debug.locals.put("itemID", _itemid);
 BA.debugLineNum = 216;BA.debugLine="Sub CreateItem(itemID As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="Dim el As VMListItem";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmlistitem");Debug.locals.put("el", _el);
 BA.debugLineNum = 218;BA.debugLine="el.Initialize(vue, itemID, eventHandler)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlistitem.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_itemid),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 219;BA.debugLine="If itemID = \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_itemid,BA.ObjectToString(""))) { 
 BA.debugLineNum = 220;BA.debugLine="Log(\"VMList.CreateItem - please specify an item";
Debug.JustUpdateDeviceLine();
vmlist.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("VMList.CreateItem - please specify an item id!")));
 BA.debugLineNum = 221;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 };
 BA.debugLineNum = 223;BA.debugLine="itemID = itemID.tolowercase";
Debug.JustUpdateDeviceLine();
_itemid = _itemid.runMethod(true,"toLowerCase");Debug.locals.put("itemID", _itemid);
 BA.debugLineNum = 224;BA.debugLine="If vue.HasState(itemID) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_hasstate" /*RemoteObject*/ ,(Object)(_itemid)),vmlist.__c.getField(true,"False"))) { 
 BA.debugLineNum = 225;BA.debugLine="vue.SetStateSingle(itemID, itemID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_itemid),(Object)((_itemid)));
 };
 BA.debugLineNum = 227;BA.debugLine="el.SetID(itemID,True)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlistitem.class, "_setid" /*RemoteObject*/ ,(Object)(_itemid),(Object)(vmlist.__c.getField(true,"True")));
 BA.debugLineNum = 228;BA.debugLine="el.SetKey(itemID,True)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlistitem.class, "_setkey" /*RemoteObject*/ ,(Object)(_itemid),(Object)(vmlist.__c.getField(true,"True")));
 BA.debugLineNum = 229;BA.debugLine="el.SetActionIcon(\"chevron_right\")";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlistitem.class, "_setactionicon" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("chevron_right")));
 BA.debugLineNum = 230;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 231;BA.debugLine="Return el";
Debug.JustUpdateDeviceLine();
if (true) return _el;
 BA.debugLineNum = 232;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expanditem(RemoteObject __ref,RemoteObject _sid,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("ExpandItem (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,31);
if (RapidSub.canDelegate("expanditem")) { return __ref.runUserSub(false, "vmlist","expanditem", __ref, _sid, _b);}
RemoteObject _syncid = RemoteObject.createImmutable("");
Debug.locals.put("sid", _sid);
Debug.locals.put("b", _b);
 BA.debugLineNum = 31;BA.debugLine="Sub ExpandItem(sid As String, b As Boolean) As VML";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 32;BA.debugLine="Dim syncid As String = $\"${sid}sync\"$";
Debug.JustUpdateDeviceLine();
_syncid = (RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_sid))),RemoteObject.createImmutable("sync")));Debug.locals.put("syncid", _syncid);Debug.locals.put("syncid", _syncid);
 BA.debugLineNum = 33;BA.debugLine="vue.SetStateSingle(syncid, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_syncid),(Object)((_b)));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,12);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmlist","initialize", __ref, _ba, _v, _sid, _module);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 12;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 13;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 14;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 15;BA.debugLine="List.Initialize(vue, ID).SetTag(\"md-list\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-list")));
 BA.debugLineNum = 16;BA.debugLine="HasContent = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"False"));
 BA.debugLineNum = 17;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 18;BA.debugLine="isPropertyBag = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_ispropertybag" /*RemoteObject*/ ,vmlist.__c.getField(true,"False"));
 BA.debugLineNum = 19;BA.debugLine="expandS = $\"${ID}expandsingle\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expands" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("expandsingle"))));
 BA.debugLineNum = 20;BA.debugLine="vue.SetStateFalse(expandS)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatefalse" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_expands" /*RemoteObject*/ )));
 BA.debugLineNum = 21;BA.debugLine="SetExpandSingle(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmlist.class, "_setexpandsingle" /*RemoteObject*/ ,(Object)(vmlist.__c.getField(true,"False")));
 BA.debugLineNum = 22;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 23;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Pop (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmlist","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 319;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 320;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmlist.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 321;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmlist","render", __ref);}
 BA.debugLineNum = 315;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 316;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmlist.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 317;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,263);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmlist","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 263;BA.debugLine="Sub SetAttr(attr As Map) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 264;BA.debugLine="List.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 265;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 266;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBorder (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vmlist","setborder", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 246;BA.debugLine="Sub SetBorder(b As Boolean) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 247;BA.debugLine="If b Then SetStyle(CreateMap(\"border\": \"1px solid";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmlist.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("border")),(RemoteObject.createImmutable("1px solid rgba(#000, .12)"))}))));};
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
public static RemoteObject  _setdense(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDense (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("setdense")) { return __ref.runUserSub(false, "vmlist","setdense", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 206;BA.debugLine="Sub SetDense(b As Boolean) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="If b Then AddClass(\"md-dense\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmlist.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dense")));};
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,25);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmlist","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 25;BA.debugLine="Sub SetDisabled(b As Boolean) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 26;BA.debugLine="List.SetDisabled(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 27;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 28;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdoubleline(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDoubleLine (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,279);
if (RapidSub.canDelegate("setdoubleline")) { return __ref.runUserSub(false, "vmlist","setdoubleline", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 279;BA.debugLine="Sub SetDoubleLine(b As Boolean) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 280;BA.debugLine="If b Then List.SetDoubleLine(True)";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setdoubleline" /*RemoteObject*/ ,(Object)(vmlist.__c.getField(true,"True")));};
 BA.debugLineNum = 281;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 282;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetElevation (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmlist","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 251;BA.debugLine="Sub SetElevation(e As Int) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="List.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
 BA.debugLineNum = 253;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 254;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setexpandsingle(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetExpandSingle (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,284);
if (RapidSub.canDelegate("setexpandsingle")) { return __ref.runUserSub(false, "vmlist","setexpandsingle", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 284;BA.debugLine="Sub SetExpandSingle(b As Boolean) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 285;BA.debugLine="expandS = $\"${ID}expandsingle\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_expands" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmlist.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("expandsingle"))));
 BA.debugLineNum = 286;BA.debugLine="vue.SetStateSingle(expandS, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_expands" /*RemoteObject*/ )),(Object)((_b)));
 BA.debugLineNum = 287;BA.debugLine="List.SetAttr(CreateMap(\":md-expand-single\": expan";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-expand-single")),(__ref.getField(true,"_expands" /*RemoteObject*/ ))}))));
 BA.debugLineNum = 288;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 289;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setslotexpand(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSlotExpand (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,274);
if (RapidSub.canDelegate("setslotexpand")) { return __ref.runUserSub(false, "vmlist","setslotexpand", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 274;BA.debugLine="Sub SetSlotExpand(b As Boolean) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 275;BA.debugLine="If b Then List.SetAttr(CreateMap(\"slot\":\"md-expan";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmlist.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("slot")),(RemoteObject.createImmutable("md-expand"))}))));};
 BA.debugLineNum = 276;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 277;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,241);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmlist","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 241;BA.debugLine="Sub SetStyle(m As Map) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 242;BA.debugLine="List.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 243;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 244;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmlist","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 37;BA.debugLine="Sub SetTabIndex(ti As String) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="List.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetText (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmlist","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 268;BA.debugLine="Sub SetText(t As String) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 269;BA.debugLine="List.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 270;BA.debugLine="HasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmlist.__c.getField(true,"True"));
 BA.debugLineNum = 271;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 272;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settripleline(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTripleLine (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,291);
if (RapidSub.canDelegate("settripleline")) { return __ref.runUserSub(false, "vmlist","settripleline", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 291;BA.debugLine="Sub SetTripleLine(b As Boolean) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 292;BA.debugLine="If b Then AddClass(\"md-triple-line\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmlist.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-triple-line")));};
 BA.debugLineNum = 293;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 294;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,211);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmlist","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 211;BA.debugLine="Sub SetVIf(vif As Object) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 212;BA.debugLine="List.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
 BA.debugLineNum = 213;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 214;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmlist","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 42;BA.debugLine="Sub SetVShow(vif As Object) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="List.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
		Debug.PushSubsStack("ToString (vmlist) ","vmlist",70,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmlist","tostring", __ref);}
 BA.debugLineNum = 311;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 312;BA.debugLine="Return List.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_list" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 313;BA.debugLine="End Sub";
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