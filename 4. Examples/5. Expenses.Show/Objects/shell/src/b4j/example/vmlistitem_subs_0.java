package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmlistitem_subs_0 {


public static RemoteObject  _addbutton(RemoteObject __ref,RemoteObject _btnid,RemoteObject _btntext) throws Exception{
try {
		Debug.PushSubsStack("AddButton (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("addbutton")) { return __ref.runUserSub(false, "vmlistitem","addbutton", __ref, _btnid, _btntext);}
Debug.locals.put("btnID", _btnid);
Debug.locals.put("btnText", _btntext);
 BA.debugLineNum = 142;BA.debugLine="Sub AddButton(btnID As String, btnText As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
vmlistitem._btn = RemoteObject.createNew ("b4j.example.vmbutton");__ref.setField("_btn",vmlistitem._btn);
 BA.debugLineNum = 144;BA.debugLine="btn.Initialize(vue,btnID, eventHandler)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_btnid),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 145;BA.debugLine="btn.SetText(btnText)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_settext" /*RemoteObject*/ ,(Object)(_btntext));
 BA.debugLineNum = 146;BA.debugLine="btn.SetRaised(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setraised" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 BA.debugLineNum = 147;BA.debugLine="btn.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 BA.debugLineNum = 148;BA.debugLine="btn.SetAccent(False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setaccent" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"False")));
 BA.debugLineNum = 149;BA.debugLine="btn.SetDisabled(False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setdisabled" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"False")));
 BA.debugLineNum = 150;BA.debugLine="btn.SetStyle(CreateMap(\"width\":\"100%\",\"margin-lef";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmlistitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),RemoteObject.createImmutable(("100%")),RemoteObject.createImmutable(("margin-left")),RemoteObject.createImmutable(("0px")),RemoteObject.createImmutable(("margin-right")),(RemoteObject.createImmutable("0px"))}))));
 BA.debugLineNum = 151;BA.debugLine="btn.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 BA.debugLineNum = 152;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 153;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcheckbox(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _bvalue,RemoteObject _vtext,RemoteObject _bprimary) throws Exception{
try {
		Debug.PushSubsStack("AddCheckBox (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,285);
if (RapidSub.canDelegate("addcheckbox")) { return __ref.runUserSub(false, "vmlistitem","addcheckbox", __ref, _vmodel, _bvalue, _vtext, _bprimary);}
RemoteObject _cb = RemoteObject.declareNull("b4j.example.vmcheckbox");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("bValue", _bvalue);
Debug.locals.put("vText", _vtext);
Debug.locals.put("bPrimary", _bprimary);
 BA.debugLineNum = 285;BA.debugLine="Sub AddCheckBox(vmodel As String, bValue As Boolea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 286;BA.debugLine="vue.SetStateSingle(vmodel, bValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((_bvalue)));
 BA.debugLineNum = 287;BA.debugLine="Dim cb As VMCheckBox";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("b4j.example.vmcheckbox");Debug.locals.put("cb", _cb);
 BA.debugLineNum = 288;BA.debugLine="cb.Initialize(vue, $\"${vmodel}cb\"$,eventHandler).";
Debug.JustUpdateDeviceLine();
_cb.runClassMethod (b4j.example.vmcheckbox.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("cb")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmcheckbox.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel)).runClassMethod (b4j.example.vmcheckbox.class, "_setprimary" /*RemoteObject*/ ,(Object)(_bprimary));
 BA.debugLineNum = 289;BA.debugLine="cb.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_cb.runClassMethod (b4j.example.vmcheckbox.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 BA.debugLineNum = 290;BA.debugLine="SetText(vText)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_vtext));
 BA.debugLineNum = 291;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 292;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,119);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmlistitem","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 119;BA.debugLine="Sub AddClass(c As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 120;BA.debugLine="ListItem.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 121;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 122;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddatepicker(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddDatePicker (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,246);
if (RapidSub.canDelegate("adddatepicker")) { return __ref.runUserSub(false, "vmlistitem","adddatepicker", __ref, _vmodel, _vtext, _value);}
RemoteObject _datex = RemoteObject.declareNull("b4j.example.vmdatepicker");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("value", _value);
 BA.debugLineNum = 246;BA.debugLine="Sub AddDatePicker(vmodel As String, vText As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 247;BA.debugLine="vue.SetStateSingle(vmodel, value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((_value)));
 BA.debugLineNum = 248;BA.debugLine="Dim datex As VMDatePicker";
Debug.JustUpdateDeviceLine();
_datex = RemoteObject.createNew ("b4j.example.vmdatepicker");Debug.locals.put("datex", _datex);
 BA.debugLineNum = 249;BA.debugLine="datex.Initialize(vue,$\"${vmodel}dp\"$,eventHandler";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("dp")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 250;BA.debugLine="datex.SetVModel(vmodel)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 251;BA.debugLine="datex.SetLabel(vText)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_setlabel" /*RemoteObject*/ ,(Object)(_vtext));
 BA.debugLineNum = 252;BA.debugLine="datex.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_datex.runClassMethod (b4j.example.vmdatepicker.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
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
public static RemoteObject  _adddeletemenuitem(RemoteObject __ref,RemoteObject _sid,RemoteObject _caption) throws Exception{
try {
		Debug.PushSubsStack("AddDeleteMenuItem (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,41);
if (RapidSub.canDelegate("adddeletemenuitem")) { return __ref.runUserSub(false, "vmlistitem","adddeletemenuitem", __ref, _sid, _caption);}
Debug.locals.put("sid", _sid);
Debug.locals.put("caption", _caption);
 BA.debugLineNum = 41;BA.debugLine="Sub AddDeleteMenuItem(sid As String, caption As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 42;BA.debugLine="menu.AddIconText(sid, \"delete\", caption)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmmenu.class, "_addicontext" /*RemoteObject*/ ,(Object)(_sid),(Object)(BA.ObjectToString("delete")),(Object)(_caption));
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addeditmenuitem(RemoteObject __ref,RemoteObject _sid,RemoteObject _caption) throws Exception{
try {
		Debug.PushSubsStack("AddEditMenuItem (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,37);
if (RapidSub.canDelegate("addeditmenuitem")) { return __ref.runUserSub(false, "vmlistitem","addeditmenuitem", __ref, _sid, _caption);}
Debug.locals.put("sid", _sid);
Debug.locals.put("caption", _caption);
 BA.debugLineNum = 37;BA.debugLine="Sub AddEditMenuItem(sid As String, caption As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 38;BA.debugLine="menu.AddIconText(sid, \"edit\", caption)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmmenu.class, "_addicontext" /*RemoteObject*/ ,(Object)(_sid),(Object)(BA.ObjectToString("edit")),(Object)(_caption));
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
public static RemoteObject  _addiconbutton(RemoteObject __ref,RemoteObject _btnid,RemoteObject _btnicon) throws Exception{
try {
		Debug.PushSubsStack("AddIconButton (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("addiconbutton")) { return __ref.runUserSub(false, "vmlistitem","addiconbutton", __ref, _btnid, _btnicon);}
Debug.locals.put("btnID", _btnid);
Debug.locals.put("btnIcon", _btnicon);
 BA.debugLineNum = 155;BA.debugLine="Sub AddIconButton(btnID As String, btnIcon As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 156;BA.debugLine="Dim btn As VMButton";
Debug.JustUpdateDeviceLine();
vmlistitem._btn = RemoteObject.createNew ("b4j.example.vmbutton");__ref.setField("_btn",vmlistitem._btn);
 BA.debugLineNum = 157;BA.debugLine="btn.Initialize(vue,btnID,eventHandler).SetIconBut";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(_btnid),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True"))).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_btnicon));
 BA.debugLineNum = 158;BA.debugLine="btn.SetPrimary(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setprimary" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 BA.debugLineNum = 159;BA.debugLine="btn.SetDisabled(False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setdisabled" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"False")));
 BA.debugLineNum = 160;BA.debugLine="btn.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
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
public static RemoteObject  _addinput(RemoteObject __ref,RemoteObject _typeof,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vicon,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddInput (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,268);
if (RapidSub.canDelegate("addinput")) { return __ref.runUserSub(false, "vmlistitem","addinput", __ref, _typeof, _vmodel, _vtext, _vicon, _vvalue);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vminput");
Debug.locals.put("typeOf", _typeof);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vIcon", _vicon);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 268;BA.debugLine="Sub AddInput(typeOf As String, vModel As String, v";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 269;BA.debugLine="vue.SetStateSingle(vModel, vValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((_vvalue)));
 BA.debugLineNum = 270;BA.debugLine="Dim input As VMInput";
Debug.JustUpdateDeviceLine();
_input = RemoteObject.createNew ("b4j.example.vminput");Debug.locals.put("input", _input);
 BA.debugLineNum = 271;BA.debugLine="input.Initialize(vue,$\"${vModel}inp\"$,eventHandle";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("inp")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 272;BA.debugLine="input.SetType(typeOf)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_settype" /*RemoteObject*/ ,(Object)((_typeof)));
 BA.debugLineNum = 273;BA.debugLine="input.SetLabel(vText)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setlabel" /*RemoteObject*/ ,(Object)(_vtext));
 BA.debugLineNum = 274;BA.debugLine="input.SetVModel(vModel)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 275;BA.debugLine="input.SetName(vModel,False)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setname" /*RemoteObject*/ ,(Object)((_vmodel)),(Object)(vmlistitem.__c.getField(true,"False")));
 BA.debugLineNum = 276;BA.debugLine="input.SetAutoComplete(vModel)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setautocomplete" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 277;BA.debugLine="If vIcon <> \"\" Then input.SetIcon(vIcon)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_vicon,BA.ObjectToString(""))) { 
_input.runClassMethod (b4j.example.vminput.class, "_seticon" /*RemoteObject*/ ,(Object)(_vicon));};
 BA.debugLineNum = 278;BA.debugLine="If typeOf <> \"password\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_typeof,BA.ObjectToString("password"))) { 
 BA.debugLineNum = 279;BA.debugLine="input.SetClearable(True)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_setclearable" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 };
 BA.debugLineNum = 281;BA.debugLine="input.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vminput.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 BA.debugLineNum = 282;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 283;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlabel(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("AddLabel (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,239);
if (RapidSub.canDelegate("addlabel")) { return __ref.runUserSub(false, "vmlistitem","addlabel", __ref, _t);}
RemoteObject _el = RemoteObject.declareNull("b4j.example.vmlabel");
Debug.locals.put("t", _t);
 BA.debugLineNum = 239;BA.debugLine="Sub AddLabel(t As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 240;BA.debugLine="Dim el As VMLabel";
Debug.JustUpdateDeviceLine();
_el = RemoteObject.createNew ("b4j.example.vmlabel");Debug.locals.put("el", _el);
 BA.debugLineNum = 241;BA.debugLine="el.Initialize(vue,$\"${ID}lbl\"$).SetText(t)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlabel.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("lbl"))))).runClassMethod (b4j.example.vmlabel.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 242;BA.debugLine="el.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_el.runClassMethod (b4j.example.vmlabel.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
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
public static RemoteObject  _addmenuitem(RemoteObject __ref,RemoteObject _sid,RemoteObject _iconname,RemoteObject _caption) throws Exception{
try {
		Debug.PushSubsStack("AddMenuItem (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,33);
if (RapidSub.canDelegate("addmenuitem")) { return __ref.runUserSub(false, "vmlistitem","addmenuitem", __ref, _sid, _iconname, _caption);}
Debug.locals.put("sid", _sid);
Debug.locals.put("iconName", _iconname);
Debug.locals.put("Caption", _caption);
 BA.debugLineNum = 33;BA.debugLine="Sub AddMenuItem(sid As String, iconName As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 34;BA.debugLine="menu.addicontext(sid, iconName, Caption)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmmenu.class, "_addicontext" /*RemoteObject*/ ,(Object)(_sid),(Object)(_iconname),(Object)(_caption));
 BA.debugLineNum = 35;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddNumberInput (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,179);
if (RapidSub.canDelegate("addnumberinput")) { return __ref.runUserSub(false, "vmlistitem","addnumberinput", __ref, _vmodel, _label, _minvalue, _maxvalue, _value);}
RemoteObject _ni = RemoteObject.declareNull("b4j.example.vmnumberinput");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("Label", _label);
Debug.locals.put("minValue", _minvalue);
Debug.locals.put("maxValue", _maxvalue);
Debug.locals.put("value", _value);
 BA.debugLineNum = 179;BA.debugLine="Sub AddNumberInput(vmodel As String, Label As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 180;BA.debugLine="vue.SetStateSingle(vmodel, value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((_value)));
 BA.debugLineNum = 181;BA.debugLine="Dim ni As VMNumberInput";
Debug.JustUpdateDeviceLine();
_ni = RemoteObject.createNew ("b4j.example.vmnumberinput");Debug.locals.put("ni", _ni);
 BA.debugLineNum = 182;BA.debugLine="ni.initialize(vue,$\"${vmodel}ni\"$)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("ni")))));
 BA.debugLineNum = 183;BA.debugLine="ni.SetMin(minValue)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setmin" /*RemoteObject*/ ,(Object)(BA.NumberToString(_minvalue)));
 BA.debugLineNum = 184;BA.debugLine="ni.SetMax(maxValue)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setmax" /*RemoteObject*/ ,(Object)(BA.NumberToString(_maxvalue)));
 BA.debugLineNum = 185;BA.debugLine="ni.SetLabel(Label)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setlabel" /*RemoteObject*/ ,(Object)(_label));
 BA.debugLineNum = 186;BA.debugLine="ni.SetVModel(vmodel)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 187;BA.debugLine="ni.SetName(vmodel,False)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setname" /*RemoteObject*/ ,(Object)((_vmodel)),(Object)(vmlistitem.__c.getField(true,"False")));
 BA.debugLineNum = 188;BA.debugLine="ni.SetSizeSmall";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_setsizesmall" /*RemoteObject*/ );
 BA.debugLineNum = 189;BA.debugLine="ni.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_ni.runClassMethod (b4j.example.vmnumberinput.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
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
public static RemoteObject  _addradiogroup(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _options) throws Exception{
try {
		Debug.PushSubsStack("AddRadioGroup (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,204);
if (RapidSub.canDelegate("addradiogroup")) { return __ref.runUserSub(false, "vmlistitem","addradiogroup", __ref, _vmodel, _vtext, _options);}
RemoteObject _sel = RemoteObject.declareNull("b4j.example.vmradiogroup");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("options", _options);
 BA.debugLineNum = 204;BA.debugLine="Sub AddRadioGroup(vmodel As String, vText As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 205;BA.debugLine="Dim sel As VMRadioGroup";
Debug.JustUpdateDeviceLine();
_sel = RemoteObject.createNew ("b4j.example.vmradiogroup");Debug.locals.put("sel", _sel);
 BA.debugLineNum = 206;BA.debugLine="sel.Initialize(vue,$\"${vmodel}rg\"$,vText,eventHan";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmradiogroup.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("rg")))),(Object)(_vtext),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 207;BA.debugLine="sel.SetVModel(vmodel)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmradiogroup.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 208;BA.debugLine="sel.SetOPtions(options)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmradiogroup.class, "_setoptions" /*RemoteObject*/ ,(Object)(_options));
 BA.debugLineNum = 209;BA.debugLine="sel.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmradiogroup.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
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
public static RemoteObject  _addselect(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _sourcename,RemoteObject _options,RemoteObject _sourcefield,RemoteObject _displayfield) throws Exception{
try {
		Debug.PushSubsStack("AddSelect (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,193);
if (RapidSub.canDelegate("addselect")) { return __ref.runUserSub(false, "vmlistitem","addselect", __ref, _vmodel, _vtext, _sourcename, _options, _sourcefield, _displayfield);}
RemoteObject _sel = RemoteObject.declareNull("b4j.example.vmselect");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("sourceName", _sourcename);
Debug.locals.put("options", _options);
Debug.locals.put("sourcefield", _sourcefield);
Debug.locals.put("displayfield", _displayfield);
 BA.debugLineNum = 193;BA.debugLine="Sub AddSelect(vmodel As String, vText As String, s";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 194;BA.debugLine="Dim sel As VMSelect";
Debug.JustUpdateDeviceLine();
_sel = RemoteObject.createNew ("b4j.example.vmselect");Debug.locals.put("sel", _sel);
 BA.debugLineNum = 195;BA.debugLine="sel.Initialize(vue,$\"${vmodel}sel\"$,eventHandler)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("sel")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 196;BA.debugLine="sel.SetLabel(vText)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setlabel" /*RemoteObject*/ ,(Object)((_vtext)));
 BA.debugLineNum = 197;BA.debugLine="sel.SetVModel(vmodel)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 198;BA.debugLine="sel.SetOPtions(sourceName, options, sourcefield,";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setoptions" /*RemoteObject*/ ,(Object)(_sourcename),(Object)(_options),(Object)(_sourcefield),(Object)(_displayfield));
 BA.debugLineNum = 199;BA.debugLine="sel.SetDense(True)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_setdense" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 BA.debugLineNum = 200;BA.debugLine="sel.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_sel.runClassMethod (b4j.example.vmselect.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 BA.debugLineNum = 201;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 202;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addslider(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _label,RemoteObject _minvalue,RemoteObject _maxvalue,RemoteObject _value,RemoteObject _labelontop) throws Exception{
try {
		Debug.PushSubsStack("AddSlider (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,164);
if (RapidSub.canDelegate("addslider")) { return __ref.runUserSub(false, "vmlistitem","addslider", __ref, _vmodel, _label, _minvalue, _maxvalue, _value, _labelontop);}
RemoteObject _slid = RemoteObject.declareNull("b4j.example.vmslider");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("Label", _label);
Debug.locals.put("minValue", _minvalue);
Debug.locals.put("maxValue", _maxvalue);
Debug.locals.put("value", _value);
Debug.locals.put("labelOnTop", _labelontop);
 BA.debugLineNum = 164;BA.debugLine="Sub AddSlider(vmodel As String, Label As String, m";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 165;BA.debugLine="vue.SetStateSingle(vmodel, value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((_value)));
 BA.debugLineNum = 166;BA.debugLine="Dim slid As VMSlider";
Debug.JustUpdateDeviceLine();
_slid = RemoteObject.createNew ("b4j.example.vmslider");Debug.locals.put("slid", _slid);
 BA.debugLineNum = 167;BA.debugLine="slid.initialize(vue,$\"${vmodel}sld\"$, eventHandle";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("sld")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 168;BA.debugLine="slid.SetMin(minValue)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setmin" /*RemoteObject*/ ,(Object)(_minvalue));
 BA.debugLineNum = 169;BA.debugLine="slid.SetMax(maxValue)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setmax" /*RemoteObject*/ ,(Object)(_maxvalue));
 BA.debugLineNum = 170;BA.debugLine="slid.SetLabel(Label)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setlabel" /*RemoteObject*/ ,(Object)((_label)));
 BA.debugLineNum = 171;BA.debugLine="slid.SetThumbLabel(False)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setthumblabel" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"False")));
 BA.debugLineNum = 172;BA.debugLine="slid.SetVModel(vmodel)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 173;BA.debugLine="slid.SetName(vmodel,False)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setname" /*RemoteObject*/ ,(Object)((_vmodel)),(Object)(vmlistitem.__c.getField(true,"False")));
 BA.debugLineNum = 174;BA.debugLine="slid.SetLabelOnTop(labelOnTop)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_setlabelontop" /*RemoteObject*/ ,(Object)(_labelontop));
 BA.debugLineNum = 175;BA.debugLine="slid.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_slid.runClassMethod (b4j.example.vmslider.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
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
public static RemoteObject  _addtextarea(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddTextArea (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("addtextarea")) { return __ref.runUserSub(false, "vmlistitem","addtextarea", __ref, _vmodel, _vtext, _vvalue);}
RemoteObject _input = RemoteObject.declareNull("b4j.example.vmtextarea");
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 256;BA.debugLine="Sub AddTextArea(vModel As String, vText As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="vue.SetStateSingle(vModel, vValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((_vvalue)));
 BA.debugLineNum = 258;BA.debugLine="Dim input As VMTextArea";
Debug.JustUpdateDeviceLine();
_input = RemoteObject.createNew ("b4j.example.vmtextarea");Debug.locals.put("input", _input);
 BA.debugLineNum = 259;BA.debugLine="input.Initialize(vue,$\"${vModel}ta\"$, eventHandle";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vmtextarea.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("ta")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 260;BA.debugLine="input.SetLabel(vText)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vmtextarea.class, "_setlabel" /*RemoteObject*/ ,(Object)(_vtext));
 BA.debugLineNum = 261;BA.debugLine="input.SetVModel(vModel)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vmtextarea.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));
 BA.debugLineNum = 262;BA.debugLine="input.SetName(vModel,False)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vmtextarea.class, "_setname" /*RemoteObject*/ ,(Object)((_vmodel)),(Object)(vmlistitem.__c.getField(true,"False")));
 BA.debugLineNum = 263;BA.debugLine="input.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_input.runClassMethod (b4j.example.vmtextarea.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 BA.debugLineNum = 264;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 265;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public ListItem As VMElement";
vmlistitem._listitem = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_listitem",vmlistitem._listitem);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmlistitem._id = RemoteObject.createImmutable("");__ref.setField("_id",vmlistitem._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmlistitem._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmlistitem._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private txt As VMElement";
vmlistitem._txt = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_txt",vmlistitem._txt);
 //BA.debugLineNum = 7;BA.debugLine="Private hasText As Boolean";
vmlistitem._hastext = RemoteObject.createImmutable(false);__ref.setField("_hastext",vmlistitem._hastext);
 //BA.debugLineNum = 8;BA.debugLine="Private hasAction As Boolean";
vmlistitem._hasaction = RemoteObject.createImmutable(false);__ref.setField("_hasaction",vmlistitem._hasaction);
 //BA.debugLineNum = 9;BA.debugLine="Private btn As VMButton";
vmlistitem._btn = RemoteObject.createNew ("b4j.example.vmbutton");__ref.setField("_btn",vmlistitem._btn);
 //BA.debugLineNum = 10;BA.debugLine="Private hasIcon As Boolean";
vmlistitem._hasicon = RemoteObject.createImmutable(false);__ref.setField("_hasicon",vmlistitem._hasicon);
 //BA.debugLineNum = 11;BA.debugLine="Private icn As VMIcon";
vmlistitem._icn = RemoteObject.createNew ("b4j.example.vmicon");__ref.setField("_icn",vmlistitem._icn);
 //BA.debugLineNum = 12;BA.debugLine="Private hasAvatar As Boolean";
vmlistitem._hasavatar = RemoteObject.createImmutable(false);__ref.setField("_hasavatar",vmlistitem._hasavatar);
 //BA.debugLineNum = 13;BA.debugLine="Private avatar As VMAvatar";
vmlistitem._avatar = RemoteObject.createNew ("b4j.example.vmavatar");__ref.setField("_avatar",vmlistitem._avatar);
 //BA.debugLineNum = 14;BA.debugLine="Private hasSwitch As Boolean";
vmlistitem._hasswitch = RemoteObject.createImmutable(false);__ref.setField("_hasswitch",vmlistitem._hasswitch);
 //BA.debugLineNum = 15;BA.debugLine="Private switch As VMSwitch";
vmlistitem._switch = RemoteObject.createNew ("b4j.example.vmswitch");__ref.setField("_switch",vmlistitem._switch);
 //BA.debugLineNum = 16;BA.debugLine="Private hasBadge As Boolean";
vmlistitem._hasbadge = RemoteObject.createImmutable(false);__ref.setField("_hasbadge",vmlistitem._hasbadge);
 //BA.debugLineNum = 17;BA.debugLine="Private badge As VMBadge";
vmlistitem._badge = RemoteObject.createNew ("b4j.example.vmbadge");__ref.setField("_badge",vmlistitem._badge);
 //BA.debugLineNum = 18;BA.debugLine="Public childList As VMList";
vmlistitem._childlist = RemoteObject.createNew ("b4j.example.vmlist");__ref.setField("_childlist",vmlistitem._childlist);
 //BA.debugLineNum = 19;BA.debugLine="Private BANano As BANano  'ignore";
vmlistitem._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmlistitem._banano);
 //BA.debugLineNum = 20;BA.debugLine="Private span As VMElement";
vmlistitem._span = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_span",vmlistitem._span);
 //BA.debugLineNum = 21;BA.debugLine="Private data As List";
vmlistitem._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_data",vmlistitem._data);
 //BA.debugLineNum = 22;BA.debugLine="Private hasMenu As Boolean";
vmlistitem._hasmenu = RemoteObject.createImmutable(false);__ref.setField("_hasmenu",vmlistitem._hasmenu);
 //BA.debugLineNum = 23;BA.debugLine="Private menu As VMMenu";
vmlistitem._menu = RemoteObject.createNew ("b4j.example.vmmenu");__ref.setField("_menu",vmlistitem._menu);
 //BA.debugLineNum = 24;BA.debugLine="Private syncid As String";
vmlistitem._syncid = RemoteObject.createImmutable("");__ref.setField("_syncid",vmlistitem._syncid);
 //BA.debugLineNum = 25;BA.debugLine="Private eventHandler As Object";
vmlistitem._eventhandler = RemoteObject.createNew ("Object");__ref.setField("_eventhandler",vmlistitem._eventhandler);
 //BA.debugLineNum = 26;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid,RemoteObject _module) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,51);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmlistitem","initialize", __ref, _ba, _v, _sid, _module);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
Debug.locals.put("module", _module);
 BA.debugLineNum = 51;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 52;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 53;BA.debugLine="syncid = $\"${ID}sync\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_syncid" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("sync"))));
 BA.debugLineNum = 54;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 55;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 56;BA.debugLine="ListItem.Initialize(vue, ID).SetTag(\"md-list-item";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-list-item")));
 BA.debugLineNum = 57;BA.debugLine="hasText = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hastext" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"False"));
 BA.debugLineNum = 58;BA.debugLine="txt.Initialize(vue,$\"${ID}text\"$).SetTag(\"div\").A";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("text"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("div"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-list-item-text")));
 BA.debugLineNum = 59;BA.debugLine="hasAction = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasaction" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"False"));
 BA.debugLineNum = 60;BA.debugLine="btn.Initialize(vue,$\"${ID}button\"$,module).SetIco";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("button")))),(Object)(_module)).runClassMethod (b4j.example.vmbutton.class, "_seticonbutton" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True"))).runClassMethod (b4j.example.vmbutton.class, "_setlistaction" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 BA.debugLineNum = 61;BA.debugLine="hasMenu = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasmenu" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"False"));
 BA.debugLineNum = 62;BA.debugLine="menu.Initialize(vue,$\"${ID}menu\"$,module).AddClas";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmmenu.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("menu")))),(Object)(_module)).runClassMethod (b4j.example.vmmenu.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-list-action"))).runClassMethod (b4j.example.vmmenu.class, "_setcloseonclick" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True"))).runClassMethod (b4j.example.vmmenu.class, "_setcloseonselect" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 BA.debugLineNum = 63;BA.debugLine="menu.SetAlignTrigger(True).SetSizeAuto(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmmenu.class, "_setaligntrigger" /*RemoteObject*/ ,(Object)((vmlistitem.__c.getField(true,"True")))).runClassMethod (b4j.example.vmmenu.class, "_setsizeauto" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 BA.debugLineNum = 64;BA.debugLine="hasIcon = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasicon" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"False"));
 BA.debugLineNum = 65;BA.debugLine="icn.Initialize(vue, $\"${ID}icon\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("icon")))));
 BA.debugLineNum = 66;BA.debugLine="hasAvatar = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasavatar" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"False"));
 BA.debugLineNum = 67;BA.debugLine="avatar.Initialize(vue, $\"${ID}avatar\"$,module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmavatar.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("avatar")))),(Object)(_module));
 BA.debugLineNum = 68;BA.debugLine="hasSwitch = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasswitch" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"False"));
 BA.debugLineNum = 69;BA.debugLine="switch.Initialize(vue, $\"${ID}switch\"$,module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmswitch.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("switch")))),(Object)(_module));
 BA.debugLineNum = 70;BA.debugLine="hasBadge = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"False"));
 BA.debugLineNum = 71;BA.debugLine="badge.Initialize(vue, $\"${ID}badge\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("badge")))));
 BA.debugLineNum = 72;BA.debugLine="childList.Initialize(vue, $\"${ID}children\"$, even";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_childlist" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("children")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )));
 BA.debugLineNum = 73;BA.debugLine="span.Initialize(vue,$\"${ID}span\"$).SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_span" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("span"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 74;BA.debugLine="vue.SetStateSingle(syncid, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_syncid" /*RemoteObject*/ )),(Object)((vmlistitem.__c.getField(true,"False"))));
 BA.debugLineNum = 75;BA.debugLine="ListItem.SetOnClick(eventHandler, $\"${ID}_click\"$";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setonclick" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("_click")))));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,433);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmlistitem","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 433;BA.debugLine="Sub Pop(p As VMList)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 434;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmlist.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmlistitem.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 435;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactionicon(RemoteObject __ref,RemoteObject _icon) throws Exception{
try {
		Debug.PushSubsStack("SetActionIcon (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,343);
if (RapidSub.canDelegate("setactionicon")) { return __ref.runUserSub(false, "vmlistitem","setactionicon", __ref, _icon);}
Debug.locals.put("icon", _icon);
 BA.debugLineNum = 343;BA.debugLine="Sub SetActionIcon(icon As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 344;BA.debugLine="btn.SetIcon(icon)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_seticon" /*RemoteObject*/ ,(Object)(_icon));
 BA.debugLineNum = 345;BA.debugLine="hasAction = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasaction" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"True"));
 BA.debugLineNum = 346;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 347;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,130);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmlistitem","setattr", __ref, _attr);}
Debug.locals.put("attr", _attr);
 BA.debugLineNum = 130;BA.debugLine="Sub SetAttr(attr As Map) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 131;BA.debugLine="ListItem.SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setavatar(RemoteObject __ref,RemoteObject _img) throws Exception{
try {
		Debug.PushSubsStack("SetAvatar (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,135);
if (RapidSub.canDelegate("setavatar")) { return __ref.runUserSub(false, "vmlistitem","setavatar", __ref, _img);}
Debug.locals.put("img", _img);
 BA.debugLineNum = 135;BA.debugLine="Sub SetAvatar(img As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 136;BA.debugLine="avatar.SetID(ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmavatar.class, "_setid" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 137;BA.debugLine="avatar.SetValue(img)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmavatar.class, "_setvalue" /*RemoteObject*/ ,(Object)(_img));
 BA.debugLineNum = 138;BA.debugLine="hasAvatar = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasavatar" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"True"));
 BA.debugLineNum = 139;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 140;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbadge(RemoteObject __ref,RemoteObject _content,RemoteObject _bprimary,RemoteObject _position,RemoteObject _bdense,RemoteObject _bsquare) throws Exception{
try {
		Debug.PushSubsStack("SetBadge (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,303);
if (RapidSub.canDelegate("setbadge")) { return __ref.runUserSub(false, "vmlistitem","setbadge", __ref, _content, _bprimary, _position, _bdense, _bsquare);}
Debug.locals.put("content", _content);
Debug.locals.put("bPrimary", _bprimary);
Debug.locals.put("position", _position);
Debug.locals.put("bDense", _bdense);
Debug.locals.put("bSquare", _bsquare);
 BA.debugLineNum = 303;BA.debugLine="Sub SetBadge(content As Int, bPrimary As Boolean,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 304;BA.debugLine="badge.SetContent(content).SetPosition(position).S";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setcontent" /*RemoteObject*/ ,(Object)(_content)).runClassMethod (b4j.example.vmbadge.class, "_setposition" /*RemoteObject*/ ,(Object)((_position))).runClassMethod (b4j.example.vmbadge.class, "_setdense" /*RemoteObject*/ ,(Object)(_bdense)).runClassMethod (b4j.example.vmbadge.class, "_setsquare" /*RemoteObject*/ ,(Object)(_bsquare));
 BA.debugLineNum = 305;BA.debugLine="badge.SetPrimary(bPrimary)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_setprimary" /*RemoteObject*/ ,(Object)(_bprimary));
 BA.debugLineNum = 306;BA.debugLine="hasBadge = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasbadge" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"True"));
 BA.debugLineNum = 307;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 308;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdata(RemoteObject __ref,RemoteObject _recs) throws Exception{
try {
		Debug.PushSubsStack("SetData (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,79);
if (RapidSub.canDelegate("setdata")) { return __ref.runUserSub(false, "vmlistitem","setdata", __ref, _recs);}
Debug.locals.put("recs", _recs);
 BA.debugLineNum = 79;BA.debugLine="Sub SetData(recs As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 80;BA.debugLine="data = recs";
Debug.JustUpdateDeviceLine();
__ref.setField ("_data" /*RemoteObject*/ ,_recs);
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
public static RemoteObject  _setdescription(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetDescription (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,327);
if (RapidSub.canDelegate("setdescription")) { return __ref.runUserSub(false, "vmlistitem","setdescription", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 327;BA.debugLine="Sub SetDescription(t As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 328;BA.debugLine="Dim span As VMElement";
Debug.JustUpdateDeviceLine();
vmlistitem._span = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_span",vmlistitem._span);
 BA.debugLineNum = 329;BA.debugLine="span.Initialize(vue,$\"${ID}desc\"$).SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_span" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("desc"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 330;BA.debugLine="span.Pop(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_span" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txt" /*RemoteObject*/ )));
 BA.debugLineNum = 331;BA.debugLine="hasText = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hastext" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"True"));
 BA.debugLineNum = 332;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 333;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetElevation (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,28);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmlistitem","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 28;BA.debugLine="Sub SetElevation(e As Int) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 29;BA.debugLine="ListItem.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
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
public static RemoteObject  _setexpand(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetExpand (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,96);
if (RapidSub.canDelegate("setexpand")) { return __ref.runUserSub(false, "vmlistitem","setexpand", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 96;BA.debugLine="Sub SetExpand(b As Boolean) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 97;BA.debugLine="ListItem.SetAttr(CreateMap(\":md-expand\": b))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmlistitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-expand")),(_b)}))));
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
public static RemoteObject  _setexpanded(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetExpanded (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,101);
if (RapidSub.canDelegate("setexpanded")) { return __ref.runUserSub(false, "vmlistitem","setexpanded", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 101;BA.debugLine="Sub SetExpanded(b As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 102;BA.debugLine="b = b.tolowercase";
Debug.JustUpdateDeviceLine();
_b = _b.runMethod(true,"toLowerCase");Debug.locals.put("b", _b);
 BA.debugLineNum = 103;BA.debugLine="If vue.HasState(b) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_hasstate" /*RemoteObject*/ ,(Object)(_b)),vmlistitem.__c.getField(true,"False"))) { 
 BA.debugLineNum = 104;BA.debugLine="Log($\"VMListItem.SetExpanded: '${b}' default sta";
Debug.JustUpdateDeviceLine();
vmlistitem.__c.runVoidMethod ("Log",(Object)((RemoteObject.concat(RemoteObject.createImmutable("VMListItem.SetExpanded: '"),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_b))),RemoteObject.createImmutable("' default state should be set!")))));
 };
 BA.debugLineNum = 106;BA.debugLine="ListItem.SetAttr(CreateMap(\":md-expanded.sync\": b";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmlistitem.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":md-expanded.sync")),(_b)}))));
 BA.debugLineNum = 107;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 108;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethref(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHREF (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,354);
if (RapidSub.canDelegate("sethref")) { return __ref.runUserSub(false, "vmlistitem","sethref", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 354;BA.debugLine="Sub SetHREF(h As Object) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 355;BA.debugLine="ListItem.SetHREF(h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_sethref" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_h)));
 BA.debugLineNum = 356;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 357;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticon(RemoteObject __ref,RemoteObject _icon,RemoteObject _primary) throws Exception{
try {
		Debug.PushSubsStack("SetIcon (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,110);
if (RapidSub.canDelegate("seticon")) { return __ref.runUserSub(false, "vmlistitem","seticon", __ref, _icon, _primary);}
Debug.locals.put("icon", _icon);
Debug.locals.put("primary", _primary);
 BA.debugLineNum = 110;BA.debugLine="Sub SetIcon(icon As String, primary As Boolean) As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 111;BA.debugLine="If icon = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_icon,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 112;BA.debugLine="icn.SetText(icon)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_settext" /*RemoteObject*/ ,(Object)(_icon));
 BA.debugLineNum = 113;BA.debugLine="If primary Then icn.SetPrimary(primary)";
Debug.JustUpdateDeviceLine();
if (_primary.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_icn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_setprimary" /*RemoteObject*/ ,(Object)(_primary));};
 BA.debugLineNum = 114;BA.debugLine="hasIcon = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasicon" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"True"));
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
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,367);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmlistitem","setid", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 367;BA.debugLine="Sub SetID(k As String, bind As Boolean) As VMListI";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 368;BA.debugLine="ListItem.SetID(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_k),(Object)(_bind));
 BA.debugLineNum = 369;BA.debugLine="txt.SetID(k,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_k),(Object)(_bind));
 BA.debugLineNum = 370;BA.debugLine="span.SetID(k,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_span" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setid" /*RemoteObject*/ ,(Object)(_k),(Object)(_bind));
 BA.debugLineNum = 371;BA.debugLine="btn.setid(k,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setid" /*RemoteObject*/ ,(Object)(_k),(Object)(_bind));
 BA.debugLineNum = 372;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 373;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setinset(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetInset (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("setinset")) { return __ref.runUserSub(false, "vmlistitem","setinset", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 91;BA.debugLine="Sub SetInset(b As Boolean) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="If b Then AddClass(\"md-inset\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmlistitem.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-inset")));};
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
public static RemoteObject  _setkey(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetKey (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,375);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmlistitem","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 375;BA.debugLine="Sub SetKey(k As String, bind As Boolean) As VMList";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 376;BA.debugLine="ListItem.SetKey(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
 BA.debugLineNum = 377;BA.debugLine="txt.SetKey(k,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
 BA.debugLineNum = 378;BA.debugLine="span.SetKey(k,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_span" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((_k)),(Object)(_bind));
 BA.debugLineNum = 379;BA.debugLine="btn.setkey(k,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setkey" /*RemoteObject*/ ,(Object)(_k),(Object)(_bind));
 BA.debugLineNum = 380;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 381;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlist(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("SetList (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("setlist")) { return __ref.runUserSub(false, "vmlistitem","setlist", __ref, _lst);}
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 83;BA.debugLine="Sub SetList(lst As VMList) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="SetExpand(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmlistitem.class, "_setexpand" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 BA.debugLineNum = 85;BA.debugLine="SetExpanded(syncid)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmlistitem.class, "_setexpanded" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_syncid" /*RemoteObject*/ )));
 BA.debugLineNum = 86;BA.debugLine="lst.SetSlotExpand(True)";
Debug.JustUpdateDeviceLine();
_lst.runClassMethod (b4j.example.vmlist.class, "_setslotexpand" /*RemoteObject*/ ,(Object)(vmlistitem.__c.getField(true,"True")));
 BA.debugLineNum = 87;BA.debugLine="lst.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_lst.runClassMethod (b4j.example.vmlist.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 BA.debugLineNum = 88;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 89;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmenuicon(RemoteObject __ref,RemoteObject _menuicon) throws Exception{
try {
		Debug.PushSubsStack("SetMenuIcon (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("setmenuicon")) { return __ref.runUserSub(false, "vmlistitem","setmenuicon", __ref, _menuicon);}
Debug.locals.put("menuIcon", _menuicon);
 BA.debugLineNum = 45;BA.debugLine="Sub SetMenuIcon(menuIcon As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="hasMenu = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasmenu" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"True"));
 BA.debugLineNum = 47;BA.debugLine="menu.SetIcon(menuIcon)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmmenu.class, "_seticon" /*RemoteObject*/ ,(Object)(_menuicon));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _k,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,359);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmlistitem","setname", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 359;BA.debugLine="Sub SetName(k As Object, bind As Boolean) As VMLis";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 360;BA.debugLine="ListItem.SetName(k, bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_k)),(Object)(_bind));
 BA.debugLineNum = 361;BA.debugLine="txt.SetName(k,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_k)),(Object)(_bind));
 BA.debugLineNum = 362;BA.debugLine="span.SetName(k,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_span" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_k)),(Object)(_bind));
 BA.debugLineNum = 363;BA.debugLine="btn.setname(k,bind)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_setname" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_k)),(Object)(_bind));
 BA.debugLineNum = 364;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 365;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setradio(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _vvalue,RemoteObject _vtext,RemoteObject _bprimary,RemoteObject _bdesignmode) throws Exception{
try {
		Debug.PushSubsStack("SetRadio (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,294);
if (RapidSub.canDelegate("setradio")) { return __ref.runUserSub(false, "vmlistitem","setradio", __ref, _vmodel, _vvalue, _vtext, _bprimary, _bdesignmode);}
RemoteObject _cb = RemoteObject.declareNull("b4j.example.vmradio");
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vValue", _vvalue);
Debug.locals.put("vText", _vtext);
Debug.locals.put("bPrimary", _bprimary);
Debug.locals.put("bDesignMode", _bdesignmode);
 BA.debugLineNum = 294;BA.debugLine="Sub SetRadio(vmodel As String, vValue As String, v";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 295;BA.debugLine="Dim cb As VMRadio";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("b4j.example.vmradio");Debug.locals.put("cb", _cb);
 BA.debugLineNum = 296;BA.debugLine="cb.Initialize(vue, $\"${vmodel}rd\"$,eventHandler).";
Debug.JustUpdateDeviceLine();
_cb.runClassMethod (b4j.example.vmradio.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_vmodel))),RemoteObject.createImmutable("rd")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmradio.class, "_setvalue" /*RemoteObject*/ ,(Object)((_vvalue)),(Object)(vmlistitem.__c.getField(true,"False"))).runClassMethod (b4j.example.vmradio.class, "_setname" /*RemoteObject*/ ,(Object)((_vmodel)),(Object)(vmlistitem.__c.getField(true,"False"))).runClassMethod (b4j.example.vmradio.class, "_setprimary" /*RemoteObject*/ ,(Object)(_bprimary));
 BA.debugLineNum = 297;BA.debugLine="If bDesignMode = False Then cb.SetVModel(vmodel)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_bdesignmode,vmlistitem.__c.getField(true,"False"))) { 
_cb.runClassMethod (b4j.example.vmradio.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel));};
 BA.debugLineNum = 298;BA.debugLine="cb.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
_cb.runClassMethod (b4j.example.vmradio.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 BA.debugLineNum = 299;BA.debugLine="SetText(vText)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_vtext));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,124);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmlistitem","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 124;BA.debugLine="Sub SetStyle(m As Map) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 125;BA.debugLine="ListItem.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
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
public static RemoteObject  _setswitch(RemoteObject __ref,RemoteObject _vmodel,RemoteObject _text,RemoteObject _bprimary,RemoteObject _bvalue) throws Exception{
try {
		Debug.PushSubsStack("SetSwitch (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,311);
if (RapidSub.canDelegate("setswitch")) { return __ref.runUserSub(false, "vmlistitem","setswitch", __ref, _vmodel, _text, _bprimary, _bvalue);}
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("text", _text);
Debug.locals.put("bPrimary", _bprimary);
Debug.locals.put("bValue", _bvalue);
 BA.debugLineNum = 311;BA.debugLine="Sub SetSwitch(vmodel As String, text As String,bPr";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 312;BA.debugLine="vue.SetStateSingle(vmodel, bValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_vmodel),(Object)((_bvalue)));
 BA.debugLineNum = 313;BA.debugLine="SetText(text)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_text));
 BA.debugLineNum = 314;BA.debugLine="hasSwitch = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hasswitch" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"True"));
 BA.debugLineNum = 315;BA.debugLine="switch.SetVModel(vmodel).SetPrimary(bPrimary)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmswitch.class, "_setvmodel" /*RemoteObject*/ ,(Object)(_vmodel)).runClassMethod (b4j.example.vmswitch.class, "_setprimary" /*RemoteObject*/ ,(Object)(_bprimary));
 BA.debugLineNum = 316;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 317;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settargetblank(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTargetBlank (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,383);
if (RapidSub.canDelegate("settargetblank")) { return __ref.runUserSub(false, "vmlistitem","settargetblank", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 383;BA.debugLine="Sub SetTargetBlank(b As Boolean) As VMListItem   '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 384;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_blank\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattrtarget" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("_blank")));
 BA.debugLineNum = 385;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 386;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settargetparent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTargetParent (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("settargetparent")) { return __ref.runUserSub(false, "vmlistitem","settargetparent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 393;BA.debugLine="Sub SetTargetParent(b As Boolean) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 394;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_parent\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattrtarget" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("_parent")));
 BA.debugLineNum = 395;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 396;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settargetself(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTargetSelf (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,388);
if (RapidSub.canDelegate("settargetself")) { return __ref.runUserSub(false, "vmlistitem","settargetself", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 388;BA.debugLine="Sub SetTargetSelf(b As Boolean) As VMListItem    '";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 389;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_self\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattrtarget" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("_self")));
 BA.debugLineNum = 390;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 391;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settargettop(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTargetTop (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("settargettop")) { return __ref.runUserSub(false, "vmlistitem","settargettop", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 398;BA.debugLine="Sub SetTargetTop(b As Boolean) As VMListItem    'i";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 399;BA.debugLine="ListItem.Element.SetAttrTARGET(\"_top\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattrtarget" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("_top")));
 BA.debugLineNum = 400;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 401;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,319);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmlistitem","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 319;BA.debugLine="Sub SetText(t As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 320;BA.debugLine="span.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_span" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 321;BA.debugLine="span.Pop(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_span" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txt" /*RemoteObject*/ )));
 BA.debugLineNum = 322;BA.debugLine="hasText = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hastext" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"True"));
 BA.debugLineNum = 323;BA.debugLine="avatar.SetAlt(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmavatar.class, "_setalt" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 324;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 325;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setthirdline(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetThirdLine (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("setthirdline")) { return __ref.runUserSub(false, "vmlistitem","setthirdline", __ref, _t);}
RemoteObject _p = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("t", _t);
 BA.debugLineNum = 335;BA.debugLine="Sub SetThirdLine(t As String) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 336;BA.debugLine="Dim p As VMElement";
Debug.JustUpdateDeviceLine();
_p = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("p", _p);
 BA.debugLineNum = 337;BA.debugLine="p.Initialize(vue,$\"${ID}third\"$).SetTag(\"p\").SetT";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmlistitem.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("third"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("p"))).runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 338;BA.debugLine="p.Pop(txt)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_txt" /*RemoteObject*/ )));
 BA.debugLineNum = 339;BA.debugLine="hasText = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hastext" /*RemoteObject*/ ,vmlistitem.__c.getField(true,"True"));
 BA.debugLineNum = 340;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 341;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setto(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetTo (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,349);
if (RapidSub.canDelegate("setto")) { return __ref.runUserSub(false, "vmlistitem","setto", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 349;BA.debugLine="Sub SetTo(t As Object) As VMListItem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 350;BA.debugLine="ListItem.SetTo(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setto" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 351;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 352;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvfor(RemoteObject __ref,RemoteObject _item,RemoteObject _datasource) throws Exception{
try {
		Debug.PushSubsStack("SetVFor (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("setvfor")) { return __ref.runUserSub(false, "vmlistitem","setvfor", __ref, _item, _datasource);}
Debug.locals.put("item", _item);
Debug.locals.put("dataSource", _datasource);
 BA.debugLineNum = 403;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 404;BA.debugLine="ListItem.SetVFor(item, dataSource)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvfor" /*RemoteObject*/ ,(Object)(_item),(Object)(_datasource));
 BA.debugLineNum = 405;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 406;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vmlistitem) ","vmlistitem",71,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmlistitem","tostring", __ref);}
 BA.debugLineNum = 408;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 409;BA.debugLine="If hasIcon Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasicon" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 410;BA.debugLine="icn.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_icn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmicon.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 412;BA.debugLine="If hasAvatar Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasavatar" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 413;BA.debugLine="avatar.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_avatar" /*RemoteObject*/ ).runClassMethod (b4j.example.vmavatar.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 415;BA.debugLine="If hasText Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hastext" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 416;BA.debugLine="txt.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_txt" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 418;BA.debugLine="If hasAction Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasaction" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 419;BA.debugLine="btn.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_btn" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbutton.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 421;BA.debugLine="If hasMenu Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasmenu" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 422;BA.debugLine="menu.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_menu" /*RemoteObject*/ ).runClassMethod (b4j.example.vmmenu.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 424;BA.debugLine="If hasSwitch Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasswitch" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 425;BA.debugLine="switch.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_switch" /*RemoteObject*/ ).runClassMethod (b4j.example.vmswitch.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 427;BA.debugLine="If hasBadge Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(true,"_hasbadge" /*RemoteObject*/ ).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 428;BA.debugLine="badge.Pop(ListItem)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_badge" /*RemoteObject*/ ).runClassMethod (b4j.example.vmbadge.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_listitem" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 430;BA.debugLine="Return ListItem.ToString";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_listitem" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 431;BA.debugLine="End Sub";
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