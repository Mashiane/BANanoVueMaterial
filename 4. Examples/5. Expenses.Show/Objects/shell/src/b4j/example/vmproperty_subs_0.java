package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmproperty_subs_0 {


public static RemoteObject  _addbooleans(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("AddBooleans (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("addbooleans")) { return __ref.runUserSub(false, "vmproperty","addbooleans", __ref, _i);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("i", _i);
 BA.debugLineNum = 77;BA.debugLine="Sub AddBooleans(i As List) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="For Each s As String In i";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _i;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 79;BA.debugLine="Booleans.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_booleans" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 81;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 82;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addbutton(RemoteObject __ref,RemoteObject _parent,RemoteObject _btnid,RemoteObject _btntext,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("AddButton (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("addbutton")) { return __ref.runUserSub(false, "vmproperty","addbutton", __ref, _parent, _btnid, _btntext, _methodname);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("btnID", _btnid);
Debug.locals.put("btnText", _btntext);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 237;BA.debugLine="Sub AddButton(parent As String, btnID As String, b";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 239;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 240;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 241;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 243;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 244;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 245;BA.debugLine="nc.vmodel = \"\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 246;BA.debugLine="nc.text = btnText";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_btntext);
 BA.debugLineNum = 247;BA.debugLine="nc.value = btnID";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,_btnid);
 BA.debugLineNum = 248;BA.debugLine="nc.typeOf = \"btn\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("btn"));
 BA.debugLineNum = 249;BA.debugLine="nc.module = eventHandler";
Debug.JustUpdateDeviceLine();
_nc.setField ("module" /*RemoteObject*/ ,__ref.getField(false,"_eventhandler" /*RemoteObject*/ ));
 BA.debugLineNum = 250;BA.debugLine="nc.methodName = methodName";
Debug.JustUpdateDeviceLine();
_nc.setField ("methodName" /*RemoteObject*/ ,_methodname);
 BA.debugLineNum = 251;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 252;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 253;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addcheck(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _text,RemoteObject _bvalue) throws Exception{
try {
		Debug.PushSubsStack("AddCheck (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,409);
if (RapidSub.canDelegate("addcheck")) { return __ref.runUserSub(false, "vmproperty","addcheck", __ref, _parent, _vmodel, _text, _bvalue);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("text", _text);
Debug.locals.put("bvalue", _bvalue);
 BA.debugLineNum = 409;BA.debugLine="Sub AddCheck(parent As String, vModel As String, t";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 410;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 411;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 412;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 413;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 415;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 416;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 417;BA.debugLine="nc.vmodel = vModel";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,_vmodel);
 BA.debugLineNum = 418;BA.debugLine="nc.text = text";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 419;BA.debugLine="nc.value = bvalue";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,BA.ObjectToString(_bvalue));
 BA.debugLineNum = 420;BA.debugLine="nc.typeOf = \"chk\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("chk"));
 BA.debugLineNum = 421;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 422;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 423;BA.debugLine="fields.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 424;BA.debugLine="Booleans.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_booleans" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 425;BA.debugLine="defaults.Put(vModel,bvalue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vmodel)),(Object)((_bvalue)));
 BA.debugLineNum = 427;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddatepicker(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _text,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddDatePicker (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,429);
if (RapidSub.canDelegate("adddatepicker")) { return __ref.runUserSub(false, "vmproperty","adddatepicker", __ref, _parent, _vmodel, _text, _vvalue);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("text", _text);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 429;BA.debugLine="Sub AddDatePicker(parent As String, vModel As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 430;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 431;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 432;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 433;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 435;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 436;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 437;BA.debugLine="nc.vmodel = vModel";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,_vmodel);
 BA.debugLineNum = 438;BA.debugLine="nc.text = text";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 439;BA.debugLine="nc.value = vValue";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,_vvalue);
 BA.debugLineNum = 440;BA.debugLine="nc.typeOf = \"dp\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("dp"));
 BA.debugLineNum = 441;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 442;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 443;BA.debugLine="fields.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 444;BA.debugLine="Strings.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 445;BA.debugLine="defaults.Put(vModel,vValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vmodel)),(Object)((_vvalue)));
 BA.debugLineNum = 446;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _adddates(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("AddDates (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,91);
if (RapidSub.canDelegate("adddates")) { return __ref.runUserSub(false, "vmproperty","adddates", __ref, _i);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("i", _i);
 BA.debugLineNum = 91;BA.debugLine="Sub AddDates(i As List) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 92;BA.debugLine="For Each s As String In i";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _i;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 93;BA.debugLine="Dates.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dates" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
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
public static RemoteObject  _adddoubles(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("AddDoubles (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,84);
if (RapidSub.canDelegate("adddoubles")) { return __ref.runUserSub(false, "vmproperty","adddoubles", __ref, _i);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("i", _i);
 BA.debugLineNum = 84;BA.debugLine="Sub AddDoubles(i As List) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 85;BA.debugLine="For Each s As String In i";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _i;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 86;BA.debugLine="Doubles.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_doubles" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
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
public static RemoteObject  _addemail(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vicon,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddEmail (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,381);
if (RapidSub.canDelegate("addemail")) { return __ref.runUserSub(false, "vmproperty","addemail", __ref, _parent, _vmodel, _vtext, _vicon, _vvalue);}
Debug.locals.put("parent", _parent);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vIcon", _vicon);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 381;BA.debugLine="Sub AddEmail(parent As String, vModel As String, v";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 382;BA.debugLine="AddInput(parent, \"email\", vModel, vText, vIcon, v";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmproperty.class, "_addinput" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.ObjectToString("email")),(Object)(_vmodel),(Object)(_vtext),(Object)(_vicon),(Object)(_vvalue));
 BA.debugLineNum = 383;BA.debugLine="Strings.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 384;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addheading(RemoteObject __ref,RemoteObject _sectname,RemoteObject _sectheading) throws Exception{
try {
		Debug.PushSubsStack("AddHeading (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,315);
if (RapidSub.canDelegate("addheading")) { return __ref.runUserSub(false, "vmproperty","addheading", __ref, _sectname, _sectheading);}
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
Debug.locals.put("sectName", _sectname);
Debug.locals.put("sectHeading", _sectheading);
 BA.debugLineNum = 315;BA.debugLine="Sub AddHeading(sectName As String, sectHeading As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 316;BA.debugLine="sectName = sectName.tolowercase";
Debug.JustUpdateDeviceLine();
_sectname = _sectname.runMethod(true,"toLowerCase");Debug.locals.put("sectName", _sectname);
 BA.debugLineNum = 317;BA.debugLine="labels.Put(sectName, sectHeading)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labels" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_sectname)),(Object)((_sectheading)));
 BA.debugLineNum = 319;BA.debugLine="Dim items As List";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("items", _items);
 BA.debugLineNum = 320;BA.debugLine="items.Initialize";
Debug.JustUpdateDeviceLine();
_items.runVoidMethod ("Initialize");
 BA.debugLineNum = 321;BA.debugLine="controls.Put(sectName, items)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_sectname)),(Object)((_items.getObject())));
 BA.debugLineNum = 322;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 323;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addiconbutton(RemoteObject __ref,RemoteObject _parent,RemoteObject _btnid,RemoteObject _btnicon,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("AddIconButton (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,344);
if (RapidSub.canDelegate("addiconbutton")) { return __ref.runUserSub(false, "vmproperty","addiconbutton", __ref, _parent, _btnid, _btnicon, _methodname);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("btnID", _btnid);
Debug.locals.put("btnIcon", _btnicon);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 344;BA.debugLine="Sub AddIconButton(parent As String, btnID As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 345;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 346;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 347;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 348;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 350;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 351;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 352;BA.debugLine="nc.iconName = btnIcon";
Debug.JustUpdateDeviceLine();
_nc.setField ("iconName" /*RemoteObject*/ ,_btnicon);
 BA.debugLineNum = 353;BA.debugLine="nc.value = btnID";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,_btnid);
 BA.debugLineNum = 354;BA.debugLine="nc.typeOf = \"btnicon\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("btnicon"));
 BA.debugLineNum = 355;BA.debugLine="nc.module = eventHandler";
Debug.JustUpdateDeviceLine();
_nc.setField ("module" /*RemoteObject*/ ,__ref.getField(false,"_eventhandler" /*RemoteObject*/ ));
 BA.debugLineNum = 356;BA.debugLine="nc.methodName = methodName";
Debug.JustUpdateDeviceLine();
_nc.setField ("methodName" /*RemoteObject*/ ,_methodname);
 BA.debugLineNum = 357;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 358;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 359;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addinput(RemoteObject __ref,RemoteObject _parent,RemoteObject _typeof,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vicon,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddInput (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,386);
if (RapidSub.canDelegate("addinput")) { return __ref.runUserSub(false, "vmproperty","addinput", __ref, _parent, _typeof, _vmodel, _vtext, _vicon, _vvalue);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("typeOf", _typeof);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vIcon", _vicon);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 386;BA.debugLine="private Sub AddInput(parent As String, typeOf As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 387;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 388;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 389;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 390;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 392;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 393;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 394;BA.debugLine="nc.vmodel = vModel";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,_vmodel);
 BA.debugLineNum = 395;BA.debugLine="nc.text = vText";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_vtext);
 BA.debugLineNum = 396;BA.debugLine="nc.value = vValue";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,_vvalue);
 BA.debugLineNum = 397;BA.debugLine="nc.typeOf = typeOf";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,_typeof);
 BA.debugLineNum = 398;BA.debugLine="nc.iconName = vIcon";
Debug.JustUpdateDeviceLine();
_nc.setField ("iconName" /*RemoteObject*/ ,_vicon);
 BA.debugLineNum = 399;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 400;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 401;BA.debugLine="fields.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 402;BA.debugLine="defaults.Put(vModel,vValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vmodel)),(Object)((_vvalue)));
 BA.debugLineNum = 403;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addintegers(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("AddIntegers (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,63);
if (RapidSub.canDelegate("addintegers")) { return __ref.runUserSub(false, "vmproperty","addintegers", __ref, _i);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("i", _i);
 BA.debugLineNum = 63;BA.debugLine="Sub AddIntegers(i As List) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 64;BA.debugLine="For Each s As String In i";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _i;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 65;BA.debugLine="Integers.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_integers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
 BA.debugLineNum = 67;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 68;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addlabel(RemoteObject __ref,RemoteObject _parent,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("AddLabel (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,298);
if (RapidSub.canDelegate("addlabel")) { return __ref.runUserSub(false, "vmproperty","addlabel", __ref, _parent, _txt);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 298;BA.debugLine="Sub AddLabel(parent As String, txt As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 299;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 300;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 301;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 302;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 304;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 305;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 306;BA.debugLine="nc.vmodel = \"\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 307;BA.debugLine="nc.text = txt";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_txt);
 BA.debugLineNum = 308;BA.debugLine="nc.value = \"\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 309;BA.debugLine="nc.typeOf = \"lbl\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("lbl"));
 BA.debugLineNum = 310;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 311;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 312;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addnumber(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vicon,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddNumber (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,376);
if (RapidSub.canDelegate("addnumber")) { return __ref.runUserSub(false, "vmproperty","addnumber", __ref, _parent, _vmodel, _vtext, _vicon, _vvalue);}
Debug.locals.put("parent", _parent);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vIcon", _vicon);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 376;BA.debugLine="Sub AddNumber(parent As String, vModel As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 377;BA.debugLine="AddInput(parent, \"number\", vModel, vText, vIcon,";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmproperty.class, "_addinput" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.ObjectToString("number")),(Object)(_vmodel),(Object)(_vtext),(Object)(_vicon),(Object)(_vvalue));
 BA.debugLineNum = 378;BA.debugLine="Integers.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_integers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 379;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addnumberinput(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _label,RemoteObject _minvalue,RemoteObject _maxvalue,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddNumberInput (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,276);
if (RapidSub.canDelegate("addnumberinput")) { return __ref.runUserSub(false, "vmproperty","addnumberinput", __ref, _parent, _vmodel, _label, _minvalue, _maxvalue, _value);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("Label", _label);
Debug.locals.put("minValue", _minvalue);
Debug.locals.put("maxValue", _maxvalue);
Debug.locals.put("value", _value);
 BA.debugLineNum = 276;BA.debugLine="Sub AddNumberInput(parent As String, vmodel As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 277;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 278;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 279;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 280;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 282;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 283;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 284;BA.debugLine="nc.vmodel = vmodel";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,_vmodel);
 BA.debugLineNum = 285;BA.debugLine="nc.text = Label";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_label);
 BA.debugLineNum = 286;BA.debugLine="nc.value = value";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,BA.NumberToString(_value));
 BA.debugLineNum = 287;BA.debugLine="nc.typeOf = \"numberinput\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("numberinput"));
 BA.debugLineNum = 288;BA.debugLine="nc.MinValue = minValue";
Debug.JustUpdateDeviceLine();
_nc.setField ("MinValue" /*RemoteObject*/ ,_minvalue);
 BA.debugLineNum = 289;BA.debugLine="nc.MaxValue = maxValue";
Debug.JustUpdateDeviceLine();
_nc.setField ("MaxValue" /*RemoteObject*/ ,_maxvalue);
 BA.debugLineNum = 290;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 291;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 292;BA.debugLine="fields.Add(vmodel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 293;BA.debugLine="Integers.Add(vmodel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_integers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 294;BA.debugLine="defaults.Put(vmodel,value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vmodel)),(Object)((_value)));
 BA.debugLineNum = 295;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addpassword(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddPassword (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,361);
if (RapidSub.canDelegate("addpassword")) { return __ref.runUserSub(false, "vmproperty","addpassword", __ref, _parent, _vmodel, _vtext, _vvalue);}
Debug.locals.put("parent", _parent);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 361;BA.debugLine="Sub AddPassword(parent As String, vModel As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 362;BA.debugLine="AddInput(parent, \"password\", vModel, vText, \"\", v";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmproperty.class, "_addinput" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.ObjectToString("password")),(Object)(_vmodel),(Object)(_vtext),(Object)(BA.ObjectToString("")),(Object)(_vvalue));
 BA.debugLineNum = 363;BA.debugLine="Strings.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 364;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addradiogroup(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _sourcename,RemoteObject _options,RemoteObject _sourcefield,RemoteObject _displayfield) throws Exception{
try {
		Debug.PushSubsStack("AddRadioGroup (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,477);
if (RapidSub.canDelegate("addradiogroup")) { return __ref.runUserSub(false, "vmproperty","addradiogroup", __ref, _parent, _vmodel, _vtext, _sourcename, _options, _sourcefield, _displayfield);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("sourceName", _sourcename);
Debug.locals.put("options", _options);
Debug.locals.put("sourcefield", _sourcefield);
Debug.locals.put("displayfield", _displayfield);
 BA.debugLineNum = 477;BA.debugLine="Sub AddRadioGroup(parent As String, vmodel As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 478;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 479;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 480;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 481;BA.debugLine="If controls.ContainsKey(parent) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_parent))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 482;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 }else {
 BA.debugLineNum = 484;BA.debugLine="existing.Initialize";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 487;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 488;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 489;BA.debugLine="nc.vmodel = vmodel";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,_vmodel);
 BA.debugLineNum = 490;BA.debugLine="nc.text = vText";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_vtext);
 BA.debugLineNum = 491;BA.debugLine="nc.value = \"\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 492;BA.debugLine="nc.typeOf = \"radiogroup\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("radiogroup"));
 BA.debugLineNum = 493;BA.debugLine="nc.sourceName = sourceName";
Debug.JustUpdateDeviceLine();
_nc.setField ("sourceName" /*RemoteObject*/ ,_sourcename);
 BA.debugLineNum = 494;BA.debugLine="nc.options = options";
Debug.JustUpdateDeviceLine();
_nc.setField ("options" /*RemoteObject*/ ,_options);
 BA.debugLineNum = 495;BA.debugLine="nc.sourcefield = sourcefield";
Debug.JustUpdateDeviceLine();
_nc.setField ("sourcefield" /*RemoteObject*/ ,_sourcefield);
 BA.debugLineNum = 496;BA.debugLine="nc.displayfield = displayfield";
Debug.JustUpdateDeviceLine();
_nc.setField ("displayfield" /*RemoteObject*/ ,_displayfield);
 BA.debugLineNum = 497;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 498;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 499;BA.debugLine="fields.Add(vmodel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 500;BA.debugLine="Strings.Add(vmodel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 501;BA.debugLine="defaults.Put(vmodel,\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vmodel)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 502;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addselect(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _sourcename,RemoteObject _options,RemoteObject _sourcefield,RemoteObject _displayfield) throws Exception{
try {
		Debug.PushSubsStack("AddSelect (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("addselect")) { return __ref.runUserSub(false, "vmproperty","addselect", __ref, _parent, _vmodel, _vtext, _sourcename, _options, _sourcefield, _displayfield);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("sourceName", _sourcename);
Debug.locals.put("options", _options);
Debug.locals.put("sourcefield", _sourcefield);
Debug.locals.put("displayfield", _displayfield);
 BA.debugLineNum = 118;BA.debugLine="Sub AddSelect(parent As String, vmodel As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 120;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 121;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 122;BA.debugLine="If controls.ContainsKey(parent) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_parent))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 123;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 }else {
 BA.debugLineNum = 125;BA.debugLine="existing.Initialize";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Initialize");
 };
 BA.debugLineNum = 128;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 129;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 130;BA.debugLine="nc.vmodel = vmodel";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,_vmodel);
 BA.debugLineNum = 131;BA.debugLine="nc.text = vText";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_vtext);
 BA.debugLineNum = 132;BA.debugLine="nc.value = \"\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,BA.ObjectToString(""));
 BA.debugLineNum = 133;BA.debugLine="nc.typeOf = \"select\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("select"));
 BA.debugLineNum = 134;BA.debugLine="nc.sourceName = sourceName";
Debug.JustUpdateDeviceLine();
_nc.setField ("sourceName" /*RemoteObject*/ ,_sourcename);
 BA.debugLineNum = 135;BA.debugLine="nc.options = options";
Debug.JustUpdateDeviceLine();
_nc.setField ("options" /*RemoteObject*/ ,_options);
 BA.debugLineNum = 136;BA.debugLine="nc.sourcefield = sourcefield";
Debug.JustUpdateDeviceLine();
_nc.setField ("sourcefield" /*RemoteObject*/ ,_sourcefield);
 BA.debugLineNum = 137;BA.debugLine="nc.displayfield = displayfield";
Debug.JustUpdateDeviceLine();
_nc.setField ("displayfield" /*RemoteObject*/ ,_displayfield);
 BA.debugLineNum = 138;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 139;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 140;BA.debugLine="fields.Add(vmodel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 141;BA.debugLine="Strings.Add(vmodel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 142;BA.debugLine="defaults.Put(vmodel,\"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vmodel)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 143;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addslider(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _label,RemoteObject _minvalue,RemoteObject _maxvalue,RemoteObject _value) throws Exception{
try {
		Debug.PushSubsStack("AddSlider (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,255);
if (RapidSub.canDelegate("addslider")) { return __ref.runUserSub(false, "vmproperty","addslider", __ref, _parent, _vmodel, _label, _minvalue, _maxvalue, _value);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("vmodel", _vmodel);
Debug.locals.put("Label", _label);
Debug.locals.put("minValue", _minvalue);
Debug.locals.put("maxValue", _maxvalue);
Debug.locals.put("value", _value);
 BA.debugLineNum = 255;BA.debugLine="Sub AddSlider(parent As String, vmodel As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 256;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 257;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 258;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 259;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 261;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 262;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 263;BA.debugLine="nc.vmodel = vmodel";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,_vmodel);
 BA.debugLineNum = 264;BA.debugLine="nc.text = Label";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_label);
 BA.debugLineNum = 265;BA.debugLine="nc.value = value";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,BA.NumberToString(_value));
 BA.debugLineNum = 266;BA.debugLine="nc.typeOf = \"slider\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("slider"));
 BA.debugLineNum = 267;BA.debugLine="nc.MinValue = minValue";
Debug.JustUpdateDeviceLine();
_nc.setField ("MinValue" /*RemoteObject*/ ,_minvalue);
 BA.debugLineNum = 268;BA.debugLine="nc.MaxValue = maxValue";
Debug.JustUpdateDeviceLine();
_nc.setField ("MaxValue" /*RemoteObject*/ ,_maxvalue);
 BA.debugLineNum = 269;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 270;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 271;BA.debugLine="fields.Add(vmodel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 272;BA.debugLine="Integers.Add(vmodel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_integers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 273;BA.debugLine="defaults.Put(vmodel,value)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vmodel)),(Object)((_value)));
 BA.debugLineNum = 274;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstrings(RemoteObject __ref,RemoteObject _i) throws Exception{
try {
		Debug.PushSubsStack("AddStrings (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,70);
if (RapidSub.canDelegate("addstrings")) { return __ref.runUserSub(false, "vmproperty","addstrings", __ref, _i);}
RemoteObject _s = RemoteObject.createImmutable("");
Debug.locals.put("i", _i);
 BA.debugLineNum = 70;BA.debugLine="Sub AddStrings(i As List) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 71;BA.debugLine="For Each s As String In i";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _i;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_s = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("s", _s);
Debug.locals.put("s", _s);
 BA.debugLineNum = 72;BA.debugLine="Strings.Add(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_s)));
 }
}Debug.locals.put("s", _s);
;
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
public static RemoteObject  _addswitch(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _text,RemoteObject _bvalue) throws Exception{
try {
		Debug.PushSubsStack("AddSwitch (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,325);
if (RapidSub.canDelegate("addswitch")) { return __ref.runUserSub(false, "vmproperty","addswitch", __ref, _parent, _vmodel, _text, _bvalue);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("text", _text);
Debug.locals.put("bValue", _bvalue);
 BA.debugLineNum = 325;BA.debugLine="Sub AddSwitch(parent As String, vModel As String,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 326;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 327;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 328;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 329;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 331;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 332;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 333;BA.debugLine="nc.vmodel = vModel";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,_vmodel);
 BA.debugLineNum = 334;BA.debugLine="nc.text = text";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 335;BA.debugLine="nc.value = bValue";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,BA.ObjectToString(_bvalue));
 BA.debugLineNum = 336;BA.debugLine="nc.typeOf = \"swt\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("swt"));
 BA.debugLineNum = 337;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 338;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 339;BA.debugLine="fields.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 340;BA.debugLine="Booleans.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_booleans" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 341;BA.debugLine="defaults.Put(vModel,bValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vmodel)),(Object)((_bvalue)));
 BA.debugLineNum = 342;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtel(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vicon,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddTel (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,371);
if (RapidSub.canDelegate("addtel")) { return __ref.runUserSub(false, "vmproperty","addtel", __ref, _parent, _vmodel, _vtext, _vicon, _vvalue);}
Debug.locals.put("parent", _parent);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vIcon", _vicon);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 371;BA.debugLine="Sub AddTel(parent As String, vModel As String, vTe";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 372;BA.debugLine="AddInput(parent, \"tel\", vModel, vText, vIcon, vVa";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmproperty.class, "_addinput" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.ObjectToString("tel")),(Object)(_vmodel),(Object)(_vtext),(Object)(_vicon),(Object)(_vvalue));
 BA.debugLineNum = 373;BA.debugLine="Integers.add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_integers" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 374;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtext(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _vtext,RemoteObject _vicon,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddText (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,366);
if (RapidSub.canDelegate("addtext")) { return __ref.runUserSub(false, "vmproperty","addtext", __ref, _parent, _vmodel, _vtext, _vicon, _vvalue);}
Debug.locals.put("parent", _parent);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("vText", _vtext);
Debug.locals.put("vIcon", _vicon);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 366;BA.debugLine="Sub AddText(parent As String, vModel As String, vT";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 367;BA.debugLine="AddInput(parent, \"text\", vModel, vText, vIcon, vV";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmproperty.class, "_addinput" /*RemoteObject*/ ,(Object)(_parent),(Object)(BA.ObjectToString("text")),(Object)(_vmodel),(Object)(_vtext),(Object)(_vicon),(Object)(_vvalue));
 BA.debugLineNum = 368;BA.debugLine="Strings.add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 369;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addtextarea(RemoteObject __ref,RemoteObject _parent,RemoteObject _vmodel,RemoteObject _text,RemoteObject _vvalue) throws Exception{
try {
		Debug.PushSubsStack("AddTextArea (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,448);
if (RapidSub.canDelegate("addtextarea")) { return __ref.runUserSub(false, "vmproperty","addtextarea", __ref, _parent, _vmodel, _text, _vvalue);}
RemoteObject _existing = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _nc = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
Debug.locals.put("parent", _parent);
Debug.locals.put("vModel", _vmodel);
Debug.locals.put("text", _text);
Debug.locals.put("vValue", _vvalue);
 BA.debugLineNum = 448;BA.debugLine="Sub AddTextArea(parent As String, vModel As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 449;BA.debugLine="parent = parent.tolowercase";
Debug.JustUpdateDeviceLine();
_parent = _parent.runMethod(true,"toLowerCase");Debug.locals.put("parent", _parent);
 BA.debugLineNum = 450;BA.debugLine="If parent = \"\" Then parent = \"main\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_parent,BA.ObjectToString(""))) { 
_parent = BA.ObjectToString("main");Debug.locals.put("parent", _parent);};
 BA.debugLineNum = 451;BA.debugLine="Dim existing As List";
Debug.JustUpdateDeviceLine();
_existing = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("existing", _existing);
 BA.debugLineNum = 452;BA.debugLine="existing = controls.Get(parent)";
Debug.JustUpdateDeviceLine();
_existing.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_parent))));
 BA.debugLineNum = 454;BA.debugLine="Dim nc As PropControls";
Debug.JustUpdateDeviceLine();
_nc = RemoteObject.createNew ("b4j.example.vmproperty._propcontrols");Debug.locals.put("nc", _nc);
 BA.debugLineNum = 455;BA.debugLine="nc.Initialize";
Debug.JustUpdateDeviceLine();
_nc.runVoidMethod ("Initialize");
 BA.debugLineNum = 456;BA.debugLine="nc.vmodel = vModel";
Debug.JustUpdateDeviceLine();
_nc.setField ("vmodel" /*RemoteObject*/ ,_vmodel);
 BA.debugLineNum = 457;BA.debugLine="nc.text = text";
Debug.JustUpdateDeviceLine();
_nc.setField ("text" /*RemoteObject*/ ,_text);
 BA.debugLineNum = 458;BA.debugLine="nc.value = vValue";
Debug.JustUpdateDeviceLine();
_nc.setField ("value" /*RemoteObject*/ ,_vvalue);
 BA.debugLineNum = 459;BA.debugLine="nc.typeOf = \"textarea\"";
Debug.JustUpdateDeviceLine();
_nc.setField ("typeOf" /*RemoteObject*/ ,BA.ObjectToString("textarea"));
 BA.debugLineNum = 460;BA.debugLine="existing.Add(nc)";
Debug.JustUpdateDeviceLine();
_existing.runVoidMethod ("Add",(Object)((_nc)));
 BA.debugLineNum = 461;BA.debugLine="controls.Put(parent, existing)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_parent)),(Object)((_existing.getObject())));
 BA.debugLineNum = 462;BA.debugLine="fields.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 463;BA.debugLine="Strings.Add(vModel)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_vmodel)));
 BA.debugLineNum = 464;BA.debugLine="defaults.Put(vModel,vValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vmodel)),(Object)((_vvalue)));
 BA.debugLineNum = 466;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
vmproperty._id = RemoteObject.createImmutable("");__ref.setField("_id",vmproperty._id);
 //BA.debugLineNum = 4;BA.debugLine="Public vue As BANanoVue";
vmproperty._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmproperty._vue);
 //BA.debugLineNum = 5;BA.debugLine="Private labels As Map";
vmproperty._labels = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_labels",vmproperty._labels);
 //BA.debugLineNum = 6;BA.debugLine="Private Bag As VMElement";
vmproperty._bag = RemoteObject.createNew ("b4j.example.vmelement");__ref.setField("_bag",vmproperty._bag);
 //BA.debugLineNum = 7;BA.debugLine="Private Lst As VMList";
vmproperty._lst = RemoteObject.createNew ("b4j.example.vmlist");__ref.setField("_lst",vmproperty._lst);
 //BA.debugLineNum = 8;BA.debugLine="Type PropControls(vmodel As String, value As Stri";
;
 //BA.debugLineNum = 11;BA.debugLine="Dim controls As Map";
vmproperty._controls = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_controls",vmproperty._controls);
 //BA.debugLineNum = 12;BA.debugLine="Private eventHandler As Object";
vmproperty._eventhandler = RemoteObject.createNew ("Object");__ref.setField("_eventhandler",vmproperty._eventhandler);
 //BA.debugLineNum = 13;BA.debugLine="Private fields As List";
vmproperty._fields = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_fields",vmproperty._fields);
 //BA.debugLineNum = 14;BA.debugLine="Private BANano As BANano 'ignore";
vmproperty._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmproperty._banano);
 //BA.debugLineNum = 15;BA.debugLine="Private Booleans As List";
vmproperty._booleans = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_booleans",vmproperty._booleans);
 //BA.debugLineNum = 16;BA.debugLine="Private Strings As List";
vmproperty._strings = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_strings",vmproperty._strings);
 //BA.debugLineNum = 17;BA.debugLine="Private Integers As List";
vmproperty._integers = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_integers",vmproperty._integers);
 //BA.debugLineNum = 18;BA.debugLine="Private Doubles As List";
vmproperty._doubles = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_doubles",vmproperty._doubles);
 //BA.debugLineNum = 19;BA.debugLine="Private Dates As List";
vmproperty._dates = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_dates",vmproperty._dates);
 //BA.debugLineNum = 20;BA.debugLine="Private defaults As Map";
vmproperty._defaults = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_defaults",vmproperty._defaults);
 //BA.debugLineNum = 21;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,224);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "vmproperty","clear", __ref);}
RemoteObject _k = RemoteObject.createImmutable("");
 BA.debugLineNum = 224;BA.debugLine="Sub Clear";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 225;BA.debugLine="For Each k As String In fields";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_fields" /*RemoteObject*/ );
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 226;BA.debugLine="vue.SetStateSingle(k, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)(vmproperty.__c.getField(false,"Null")));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _expanditem(RemoteObject __ref,RemoteObject _sid,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("ExpandItem (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,52);
if (RapidSub.canDelegate("expanditem")) { return __ref.runUserSub(false, "vmproperty","expanditem", __ref, _sid, _b);}
Debug.locals.put("sid", _sid);
Debug.locals.put("b", _b);
 BA.debugLineNum = 52;BA.debugLine="Sub ExpandItem(sid As String, b As Boolean) As VMP";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 53;BA.debugLine="Lst.ExpandItem(sid, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_expanditem" /*RemoteObject*/ ,(Object)(_sid),(Object)(_b));
 BA.debugLineNum = 54;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 55;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getcode(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("GetCode (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,616);
if (RapidSub.canDelegate("getcode")) { return __ref.runUserSub(false, "vmproperty","getcode", __ref);}
RemoteObject _sb = RemoteObject.declareNull("anywheresoftware.b4a.keywords.StringBuilderWrapper");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
 BA.debugLineNum = 616;BA.debugLine="Sub GetCode As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 617;BA.debugLine="Dim sb As StringBuilder";
Debug.JustUpdateDeviceLine();
_sb = RemoteObject.createNew ("anywheresoftware.b4a.keywords.StringBuilderWrapper");Debug.locals.put("sb", _sb);
 BA.debugLineNum = 618;BA.debugLine="sb.Initialize";
Debug.JustUpdateDeviceLine();
_sb.runVoidMethod ("Initialize");
 BA.debugLineNum = 620;BA.debugLine="For Each k As String In controls.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group3 = __ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen3 = group3.runMethod(true,"getSize").<Integer>get()
;int index3 = 0;
;
for (; index3 < groupLen3;index3++){
_k = BA.ObjectToString(group3.runMethod(false,"Get",index3));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 621;BA.debugLine="Dim items As List = controls.Get(k)";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k))));Debug.locals.put("items", _items);
 BA.debugLineNum = 622;BA.debugLine="For Each item As PropControls In items";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group5 = _items;
final int groupLen5 = group5.runMethod(true,"getSize").<Integer>get()
;int index5 = 0;
;
for (; index5 < groupLen5;index5++){
_item = (group5.runMethod(false,"Get",index5));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 623;BA.debugLine="Select Case item.typeOf";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_item.getField(true,"typeOf" /*RemoteObject*/ ),BA.ObjectToString("number"),BA.ObjectToString("text"),BA.ObjectToString("email"),BA.ObjectToString("password"),BA.ObjectToString("dp"),BA.ObjectToString("textarea"),BA.ObjectToString("chk"),BA.ObjectToString("swt"),BA.ObjectToString("rad"),BA.ObjectToString("slider"),BA.ObjectToString("tel"),BA.ObjectToString("select"),BA.ObjectToString("autocomplete"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: 
case 5: {
 BA.debugLineNum = 625;BA.debugLine="sb.Append($\"Dim s${item.vmodel} As String = r";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dim s"),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable(" As String = rec.Get(\""),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable("\")"))))).runVoidMethod ("Append",(Object)(vmproperty.__c.getField(true,"CRLF")));
 break; }
case 6: 
case 7: {
 BA.debugLineNum = 627;BA.debugLine="sb.Append($\"Dim b${item.vmodel} As Boolean =";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dim b"),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable(" As Boolean = rec.Get(\""),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable("\")"))))).runVoidMethod ("Append",(Object)(vmproperty.__c.getField(true,"CRLF")));
 break; }
case 8: {
 BA.debugLineNum = 629;BA.debugLine="sb.Append($\"Dim s${item.vmodel} As String = r";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dim s"),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable(" As String = rec.Get(\""),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable("\")"))))).runVoidMethod ("Append",(Object)(vmproperty.__c.getField(true,"CRLF")));
 break; }
case 9: 
case 10: {
 BA.debugLineNum = 631;BA.debugLine="sb.Append($\"Dim i${item.vmodel} As Int = rec.";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dim i"),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable(" As Int = rec.Get(\""),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable("\")"))))).runVoidMethod ("Append",(Object)(vmproperty.__c.getField(true,"CRLF")));
 break; }
case 11: 
case 12: {
 BA.debugLineNum = 633;BA.debugLine="sb.Append($\"Dim s${item.vmodel} As String = r";
Debug.JustUpdateDeviceLine();
_sb.runMethod(false,"Append",(Object)((RemoteObject.concat(RemoteObject.createImmutable("Dim s"),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable(" As String = rec.Get(\""),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item.getField(true,"vmodel" /*RemoteObject*/ )))),RemoteObject.createImmutable("\")"))))).runVoidMethod ("Append",(Object)(vmproperty.__c.getField(true,"CRLF")));
 break; }
}
;
 }
}Debug.locals.put("item", _item);
;
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 637;BA.debugLine="Return sb.tostring";
Debug.JustUpdateDeviceLine();
if (true) return _sb.runMethod(true,"ToString");
 BA.debugLineNum = 638;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getjson(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getJSON (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("getjson")) { return __ref.runUserSub(false, "vmproperty","getjson", __ref);}
RemoteObject _them = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _sjson = RemoteObject.createImmutable("");
 BA.debugLineNum = 231;BA.debugLine="Sub getJSON As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 232;BA.debugLine="Dim them As Map = getProperties";
Debug.JustUpdateDeviceLine();
_them = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_them = __ref.runClassMethod (b4j.example.vmproperty.class, "_getproperties" /*RemoteObject*/ );Debug.locals.put("them", _them);Debug.locals.put("them", _them);
 BA.debugLineNum = 233;BA.debugLine="Dim sjson As String = BANano.ToJson(them)";
Debug.JustUpdateDeviceLine();
_sjson = BA.ObjectToString(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"ToJson",(Object)((_them.getObject()))));Debug.locals.put("sjson", _sjson);Debug.locals.put("sjson", _sjson);
 BA.debugLineNum = 234;BA.debugLine="Return sjson";
Debug.JustUpdateDeviceLine();
if (true) return _sjson;
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getproperties(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("getProperties (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,209);
if (RapidSub.canDelegate("getproperties")) { return __ref.runUserSub(false, "vmproperty","getproperties", __ref);}
RemoteObject _rec = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
 BA.debugLineNum = 209;BA.debugLine="Sub getProperties As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 210;BA.debugLine="Dim rec As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_rec = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_rec = vmproperty.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("rec", _rec);Debug.locals.put("rec", _rec);
 BA.debugLineNum = 211;BA.debugLine="For Each k As String In fields";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = __ref.getField(false,"_fields" /*RemoteObject*/ );
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_k = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 212;BA.debugLine="Dim v As Object = vue.GetState(k, \"\")";
Debug.JustUpdateDeviceLine();
_v = __ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_getstate" /*RemoteObject*/ ,(Object)(_k),(Object)((RemoteObject.createImmutable(""))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 213;BA.debugLine="If v = BANano.UNDEFINED Then v = \"\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_v,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"UNDEFINED"))) { 
_v = RemoteObject.createImmutable((""));Debug.locals.put("v", _v);};
 BA.debugLineNum = 214;BA.debugLine="rec.Put(k, v)";
Debug.JustUpdateDeviceLine();
_rec.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 216;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(rec, Bo";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_booleans" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makeboolean" /*RemoteObject*/ ,(Object)(_rec),(Object)(__ref.getField(false,"_booleans" /*RemoteObject*/ )));};
 BA.debugLineNum = 217;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(rec, Doub";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_doubles" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makedouble" /*RemoteObject*/ ,(Object)(_rec),(Object)(__ref.getField(false,"_doubles" /*RemoteObject*/ )));};
 BA.debugLineNum = 218;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(rec, In";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_integers" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makeinteger" /*RemoteObject*/ ,(Object)(_rec),(Object)(__ref.getField(false,"_integers" /*RemoteObject*/ )));};
 BA.debugLineNum = 219;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(rec, String";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_strings" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_maketrim" /*RemoteObject*/ ,(Object)(_rec),(Object)(__ref.getField(false,"_strings" /*RemoteObject*/ )));};
 BA.debugLineNum = 220;BA.debugLine="Return rec";
Debug.JustUpdateDeviceLine();
if (true) return _rec;
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _module,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,24);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmproperty","initialize", __ref, _ba, _v, _module, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("module", _module);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 24;BA.debugLine="Public Sub Initialize(v As BANanoVue, module As Ob";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 25;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 26;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 27;BA.debugLine="vue.SetStateSingle(\"expandProp\", True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("expandProp")),(Object)((vmproperty.__c.getField(true,"True"))));
 BA.debugLineNum = 28;BA.debugLine="eventHandler = module";
Debug.JustUpdateDeviceLine();
__ref.setField ("_eventhandler" /*RemoteObject*/ ,_module);
 BA.debugLineNum = 29;BA.debugLine="fields.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_fields" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 30;BA.debugLine="Bag.Initialize(vue, ID)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bag" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 31;BA.debugLine="Bag.SetKey(ID,False).AddClass(\"propertybag\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bag" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setkey" /*RemoteObject*/ ,(Object)((__ref.getField(true,"_id" /*RemoteObject*/ ))),(Object)(vmproperty.__c.getField(true,"False"))).runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("propertybag")));
 BA.debugLineNum = 32;BA.debugLine="Lst.Initialize(vue, $\"${ID}list\"$,module)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("list")))),(Object)(_module));
 BA.debugLineNum = 33;BA.debugLine="Lst.SetStyle(CreateMap(\"width\": \"100%\", \"height\":";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmproperty.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),RemoteObject.createImmutable(("100%")),RemoteObject.createImmutable(("height")),(RemoteObject.createImmutable("100%"))}))));
 BA.debugLineNum = 34;BA.debugLine="Lst.SetStyle(CreateMap(\"font-size\":\"14px\"))";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmproperty.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("font-size")),(RemoteObject.createImmutable("14px"))}))));
 BA.debugLineNum = 38;BA.debugLine="Lst.isPropertyBag = True";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).setField ("_ispropertybag" /*RemoteObject*/ ,vmproperty.__c.getField(true,"True"));
 BA.debugLineNum = 39;BA.debugLine="Lst.SetExpandSingle(\"expandProp\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setexpandsingle" /*RemoteObject*/ ,(Object)(BA.ObjectToBoolean(RemoteObject.createImmutable("expandProp"))));
 BA.debugLineNum = 40;BA.debugLine="labels.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_labels" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 41;BA.debugLine="controls.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_controls" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 42;BA.debugLine="AddHeading(\"main\", \"Main\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmproperty.class, "_addheading" /*RemoteObject*/ ,(Object)(BA.ObjectToString("main")),(Object)(RemoteObject.createImmutable("Main")));
 BA.debugLineNum = 43;BA.debugLine="Booleans.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_booleans" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 44;BA.debugLine="Strings.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_strings" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 45;BA.debugLine="Integers.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_integers" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 46;BA.debugLine="Doubles.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_doubles" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 47;BA.debugLine="defaults.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_defaults" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 48;BA.debugLine="Dates.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_dates" /*RemoteObject*/ ).runVoidMethod ("Initialize");
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,644);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmproperty","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 644;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 645;BA.debugLine="p.SetText(ToString)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmproperty.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 646;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("Render (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,640);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmproperty","render", __ref);}
 BA.debugLineNum = 640;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 641;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmproperty.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 642;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,198);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vmproperty","setborder", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 198;BA.debugLine="Sub SetBorder(b As Boolean) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 199;BA.debugLine="Lst.SetBorder(b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_setborder" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 200;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 201;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdefaults(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetDefaults (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,405);
if (RapidSub.canDelegate("setdefaults")) { return __ref.runUserSub(false, "vmproperty","setdefaults", __ref);}
 BA.debugLineNum = 405;BA.debugLine="Sub SetDefaults";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 406;BA.debugLine="vue.SetState(defaults)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_defaults" /*RemoteObject*/ )));
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,57);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmproperty","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 57;BA.debugLine="Sub SetElevation(e As Int) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 58;BA.debugLine="Bag.SetElevation(e)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bag" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setelevation" /*RemoteObject*/ ,(Object)(_e));
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
public static RemoteObject  _setproperties(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("setProperties (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,99);
if (RapidSub.canDelegate("setproperties")) { return __ref.runUserSub(false, "vmproperty","setproperties", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 99;BA.debugLine="Sub setProperties(m As Map)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 100;BA.debugLine="If Doubles.Size > 0 Then vue.MakeDouble(m, Double";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_doubles" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makedouble" /*RemoteObject*/ ,(Object)(_m),(Object)(__ref.getField(false,"_doubles" /*RemoteObject*/ )));};
 BA.debugLineNum = 101;BA.debugLine="If Integers.Size > 0 Then vue.MakeInteger(m, Inte";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_integers" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makeinteger" /*RemoteObject*/ ,(Object)(_m),(Object)(__ref.getField(false,"_integers" /*RemoteObject*/ )));};
 BA.debugLineNum = 102;BA.debugLine="If Strings.Size > 0 Then vue.MakeTrim(m, Strings)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_strings" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_maketrim" /*RemoteObject*/ ,(Object)(_m),(Object)(__ref.getField(false,"_strings" /*RemoteObject*/ )));};
 BA.debugLineNum = 103;BA.debugLine="If Dates.Size > 0 Then vue.MakeDate(m, Dates)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_dates" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makedate" /*RemoteObject*/ ,(Object)(_m),(Object)(__ref.getField(false,"_dates" /*RemoteObject*/ )));};
 BA.debugLineNum = 104;BA.debugLine="If Booleans.Size > 0 Then vue.MakeBoolean(m, Bool";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_booleans" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_makeboolean" /*RemoteObject*/ ,(Object)(_m),(Object)(__ref.getField(false,"_booleans" /*RemoteObject*/ )));};
 BA.debugLineNum = 105;BA.debugLine="vue.SetState(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_m));
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
public static RemoteObject  _setstyle(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetStyle (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,203);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmproperty","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 203;BA.debugLine="Sub SetStyle(m As Map) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 204;BA.debugLine="Bag.SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bag" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 205;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 206;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmproperty","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 108;BA.debugLine="Sub SetVIf(vif As Object) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Bag.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bag" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvif" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _setvshow(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVShow (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmproperty","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 113;BA.debugLine="Sub SetVShow(vif As Object) As VMProperty";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="Bag.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bag" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_vif)));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmproperty) ","vmproperty",83,__ref.getField(false, "ba"),__ref,522);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmproperty","tostring", __ref);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.createImmutable("");
RemoteObject _items = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _item = RemoteObject.declareNull("b4j.example.vmproperty._propcontrols");
RemoteObject _lix = RemoteObject.declareNull("b4j.example.vmlistitem");
RemoteObject _childlist = RemoteObject.declareNull("b4j.example.vmlist");
 BA.debugLineNum = 522;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 524;BA.debugLine="For Each k As String In labels.keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = __ref.getField(false,"_labels" /*RemoteObject*/ ).runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 525;BA.debugLine="Dim v As String = labels.Get(k)";
Debug.JustUpdateDeviceLine();
_v = BA.ObjectToString(__ref.getField(false,"_labels" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k))));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 526;BA.debugLine="Dim items As List = controls.Get(k)";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k))));Debug.locals.put("items", _items);
 BA.debugLineNum = 527;BA.debugLine="Select Case k";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_k,BA.ObjectToString("main"))) {
case 0: {
 BA.debugLineNum = 529;BA.debugLine="For Each item As PropControls In items";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group6 = _items;
final int groupLen6 = group6.runMethod(true,"getSize").<Integer>get()
;int index6 = 0;
;
for (; index6 < groupLen6;index6++){
_item = (group6.runMethod(false,"Get",index6));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 530;BA.debugLine="Select Case item.typeOf";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_item.getField(true,"typeOf" /*RemoteObject*/ ),BA.ObjectToString("number"),BA.ObjectToString("text"),BA.ObjectToString("tel"),BA.ObjectToString("email"),BA.ObjectToString("password"),BA.ObjectToString("chk"),BA.ObjectToString("swt"),BA.ObjectToString("rad"),BA.ObjectToString("dp"),BA.ObjectToString("btn"),BA.ObjectToString("btnicon"),BA.ObjectToString("textarea"),BA.ObjectToString("slider"),BA.ObjectToString("numberinput"),BA.ObjectToString("select"),BA.ObjectToString("autocomplete"),BA.ObjectToString("lbl"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 BA.debugLineNum = 532;BA.debugLine="Lst.AddInput(item.typeOf, item.vmodel, item.t";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addinput" /*RemoteObject*/ ,(Object)(_item.getField(true,"typeOf" /*RemoteObject*/ )),(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"iconName" /*RemoteObject*/ )),(Object)(_item.getField(true,"value" /*RemoteObject*/ )));
 break; }
case 5: {
 BA.debugLineNum = 534;BA.debugLine="Lst.AddCheckBox(item.vmodel, item.value, item";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addcheckbox" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(BA.ObjectToBoolean(_item.getField(true,"value" /*RemoteObject*/ ))),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(vmproperty.__c.getField(true,"True")));
 break; }
case 6: {
 BA.debugLineNum = 536;BA.debugLine="Lst.addswitch(item.vmodel, item.text, True, i";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addswitch" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(vmproperty.__c.getField(true,"True")),(Object)(BA.ObjectToBoolean(_item.getField(true,"value" /*RemoteObject*/ ))));
 break; }
case 7: {
 BA.debugLineNum = 538;BA.debugLine="Lst.AddRadio(item.vmodel, item.value, item.te";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addradio" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"value" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(vmproperty.__c.getField(true,"True")),(Object)(vmproperty.__c.getField(true,"False")));
 break; }
case 8: {
 BA.debugLineNum = 540;BA.debugLine="Lst.AddDatePicker(item.vmodel, item.text, ite";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_adddatepicker" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"value" /*RemoteObject*/ )));
 break; }
case 9: {
 BA.debugLineNum = 542;BA.debugLine="Lst.AddButton(item.value, item.text)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addbutton" /*RemoteObject*/ ,(Object)(_item.getField(true,"value" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )));
 break; }
case 10: {
 BA.debugLineNum = 544;BA.debugLine="Lst.AddIconButton(item.value, item.iconName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addiconbutton" /*RemoteObject*/ ,(Object)(_item.getField(true,"value" /*RemoteObject*/ )),(Object)(_item.getField(true,"iconName" /*RemoteObject*/ )));
 break; }
case 11: {
 BA.debugLineNum = 546;BA.debugLine="Lst.AddTextArea(item.vmodel, item.text, item.";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addtextarea" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"value" /*RemoteObject*/ )));
 break; }
case 12: {
 BA.debugLineNum = 548;BA.debugLine="Lst.AddSlider(item.vmodel, item.text, item.Mi";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addslider" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"MinValue" /*RemoteObject*/ )),(Object)(_item.getField(true,"MaxValue" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _item.getField(true,"value" /*RemoteObject*/ ))),(Object)(vmproperty.__c.getField(true,"True")));
 break; }
case 13: {
 BA.debugLineNum = 550;BA.debugLine="Lst.AddNumberInput(item.vmodel, item.text, it";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addnumberinput" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"MinValue" /*RemoteObject*/ )),(Object)(_item.getField(true,"MaxValue" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _item.getField(true,"value" /*RemoteObject*/ ))));
 break; }
case 14: {
 BA.debugLineNum = 552;BA.debugLine="Lst.addselect(item.vmodel, item.text, item.so";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addselect" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"sourceName" /*RemoteObject*/ )),(Object)(_item.getField(false,"options" /*RemoteObject*/ )),(Object)(_item.getField(true,"sourcefield" /*RemoteObject*/ )),(Object)(_item.getField(true,"displayfield" /*RemoteObject*/ )));
 break; }
case 15: {
 break; }
case 16: {
 BA.debugLineNum = 557;BA.debugLine="Lst.AddLabel(item.text)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_addlabel" /*RemoteObject*/ ,(Object)(_item.getField(true,"text" /*RemoteObject*/ )));
 break; }
}
;
 }
}Debug.locals.put("item", _item);
;
 break; }
default: {
 BA.debugLineNum = 561;BA.debugLine="Dim lix As VMListItem = Lst.CreateItem(k)";
Debug.JustUpdateDeviceLine();
_lix = __ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_createitem" /*RemoteObject*/ ,(Object)(_k));Debug.locals.put("lix", _lix);Debug.locals.put("lix", _lix);
 BA.debugLineNum = 562;BA.debugLine="lix.SetText(v)";
Debug.JustUpdateDeviceLine();
_lix.runClassMethod (b4j.example.vmlistitem.class, "_settext" /*RemoteObject*/ ,(Object)(_v));
 BA.debugLineNum = 563;BA.debugLine="lix.SetStyle(CreateMap(\"padding-top\": \"5px !imp";
Debug.JustUpdateDeviceLine();
_lix.runClassMethod (b4j.example.vmlistitem.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmproperty.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("padding-top")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("padding-bottom")),RemoteObject.createImmutable(("5px !important")),RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("10px !important"))}))));
 BA.debugLineNum = 565;BA.debugLine="Dim items As List = controls.Get(k)";
Debug.JustUpdateDeviceLine();
_items = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");
_items.setObject(__ref.getField(false,"_controls" /*RemoteObject*/ ).runMethod(false,"Get",(Object)((_k))));Debug.locals.put("items", _items);
 BA.debugLineNum = 566;BA.debugLine="Dim childList As VMList";
Debug.JustUpdateDeviceLine();
_childlist = RemoteObject.createNew ("b4j.example.vmlist");Debug.locals.put("childList", _childlist);
 BA.debugLineNum = 567;BA.debugLine="childList.Initialize(vue,$\"${k}children\"$,event";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmproperty.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("children")))),(Object)(__ref.getField(false,"_eventhandler" /*RemoteObject*/ ))).runClassMethod (b4j.example.vmlist.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("propertybag")));
 BA.debugLineNum = 568;BA.debugLine="childList.isPropertyBag = True";
Debug.JustUpdateDeviceLine();
_childlist.setField ("_ispropertybag" /*RemoteObject*/ ,vmproperty.__c.getField(true,"True"));
 BA.debugLineNum = 569;BA.debugLine="childList.SetStyle(CreateMap(\"width\": \"100%\", \"";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmproperty.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),RemoteObject.createImmutable(("100%")),RemoteObject.createImmutable(("height")),(RemoteObject.createImmutable("100%"))}))));
 BA.debugLineNum = 570;BA.debugLine="childList.SetStyle(CreateMap(\"font-size\":\"14px\"";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmproperty.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("font-size")),(RemoteObject.createImmutable("14px"))}))));
 BA.debugLineNum = 571;BA.debugLine="childList.SetStyle(CreateMap(\"margin-bottom\":\"5";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmproperty.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("margin-bottom")),(RemoteObject.createImmutable("5px !important"))}))));
 BA.debugLineNum = 576;BA.debugLine="For Each item As PropControls In items";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group46 = _items;
final int groupLen46 = group46.runMethod(true,"getSize").<Integer>get()
;int index46 = 0;
;
for (; index46 < groupLen46;index46++){
_item = (group46.runMethod(false,"Get",index46));Debug.locals.put("item", _item);
Debug.locals.put("item", _item);
 BA.debugLineNum = 577;BA.debugLine="Select Case item.typeOf";
Debug.JustUpdateDeviceLine();
switch (BA.switchObjectToInt(_item.getField(true,"typeOf" /*RemoteObject*/ ),BA.ObjectToString("number"),BA.ObjectToString("text"),BA.ObjectToString("tel"),BA.ObjectToString("email"),BA.ObjectToString("password"),BA.ObjectToString("chk"),BA.ObjectToString("swt"),BA.ObjectToString("rad"),BA.ObjectToString("dp"),BA.ObjectToString("btn"),BA.ObjectToString("btnicon"),BA.ObjectToString("textarea"),BA.ObjectToString("slider"),BA.ObjectToString("numberinput"),BA.ObjectToString("select"),BA.ObjectToString("autocomplete"),BA.ObjectToString("lbl"))) {
case 0: 
case 1: 
case 2: 
case 3: 
case 4: {
 BA.debugLineNum = 579;BA.debugLine="childList.AddInput(item.typeOf, item.vmodel,";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addinput" /*RemoteObject*/ ,(Object)(_item.getField(true,"typeOf" /*RemoteObject*/ )),(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"iconName" /*RemoteObject*/ )),(Object)(_item.getField(true,"value" /*RemoteObject*/ )));
 break; }
case 5: {
 BA.debugLineNum = 581;BA.debugLine="childList.AddCheckBox(item.vmodel, item.value";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addcheckbox" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(BA.ObjectToBoolean(_item.getField(true,"value" /*RemoteObject*/ ))),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(vmproperty.__c.getField(true,"True")));
 break; }
case 6: {
 BA.debugLineNum = 583;BA.debugLine="childList.addswitch(item.vmodel, item.text, T";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addswitch" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(vmproperty.__c.getField(true,"True")),(Object)(BA.ObjectToBoolean(_item.getField(true,"value" /*RemoteObject*/ ))));
 break; }
case 7: {
 BA.debugLineNum = 585;BA.debugLine="childList.AddRadio(item.vmodel, item.value, i";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addradio" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"value" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(vmproperty.__c.getField(true,"True")),(Object)(vmproperty.__c.getField(true,"False")));
 break; }
case 8: {
 BA.debugLineNum = 587;BA.debugLine="childList.AddDatePicker(item.vmodel, item.tex";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_adddatepicker" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"value" /*RemoteObject*/ )));
 break; }
case 9: {
 BA.debugLineNum = 589;BA.debugLine="childList.AddButton(item.value, item.text)";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addbutton" /*RemoteObject*/ ,(Object)(_item.getField(true,"value" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )));
 break; }
case 10: {
 BA.debugLineNum = 591;BA.debugLine="childList.AddIconButton(item.value, item.icon";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addiconbutton" /*RemoteObject*/ ,(Object)(_item.getField(true,"value" /*RemoteObject*/ )),(Object)(_item.getField(true,"iconName" /*RemoteObject*/ )));
 break; }
case 11: {
 BA.debugLineNum = 593;BA.debugLine="childList.AddTextArea(item.vmodel, item.text,";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addtextarea" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"value" /*RemoteObject*/ )));
 break; }
case 12: {
 BA.debugLineNum = 595;BA.debugLine="childList.AddSlider(item.vmodel, item.text, i";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addslider" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"MinValue" /*RemoteObject*/ )),(Object)(_item.getField(true,"MaxValue" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _item.getField(true,"value" /*RemoteObject*/ ))),(Object)(vmproperty.__c.getField(true,"True")));
 break; }
case 13: {
 BA.debugLineNum = 597;BA.debugLine="childList.AddNumberInput(item.vmodel, item.te";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addnumberinput" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"MinValue" /*RemoteObject*/ )),(Object)(_item.getField(true,"MaxValue" /*RemoteObject*/ )),(Object)(BA.numberCast(int.class, _item.getField(true,"value" /*RemoteObject*/ ))));
 break; }
case 14: {
 BA.debugLineNum = 599;BA.debugLine="childList.addselect(item.vmodel, item.text, i";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addselect" /*RemoteObject*/ ,(Object)(_item.getField(true,"vmodel" /*RemoteObject*/ )),(Object)(_item.getField(true,"text" /*RemoteObject*/ )),(Object)(_item.getField(true,"sourceName" /*RemoteObject*/ )),(Object)(_item.getField(false,"options" /*RemoteObject*/ )),(Object)(_item.getField(true,"sourcefield" /*RemoteObject*/ )),(Object)(_item.getField(true,"displayfield" /*RemoteObject*/ )));
 break; }
case 15: {
 break; }
case 16: {
 BA.debugLineNum = 604;BA.debugLine="childList.AddLabel(item.text)";
Debug.JustUpdateDeviceLine();
_childlist.runClassMethod (b4j.example.vmlist.class, "_addlabel" /*RemoteObject*/ ,(Object)(_item.getField(true,"text" /*RemoteObject*/ )));
 break; }
}
;
 }
}Debug.locals.put("item", _item);
;
 BA.debugLineNum = 607;BA.debugLine="lix.SetList(childList)";
Debug.JustUpdateDeviceLine();
_lix.runClassMethod (b4j.example.vmlistitem.class, "_setlist" /*RemoteObject*/ ,(Object)(_childlist));
 BA.debugLineNum = 608;BA.debugLine="lix.SetExpand(True)";
Debug.JustUpdateDeviceLine();
_lix.runClassMethod (b4j.example.vmlistitem.class, "_setexpand" /*RemoteObject*/ ,(Object)(vmproperty.__c.getField(true,"True")));
 BA.debugLineNum = 609;BA.debugLine="lix.Pop(Lst)";
Debug.JustUpdateDeviceLine();
_lix.runClassMethod (b4j.example.vmlistitem.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_lst" /*RemoteObject*/ )));
 break; }
}
;
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 612;BA.debugLine="Lst.Pop(Bag)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_lst" /*RemoteObject*/ ).runClassMethod (b4j.example.vmlist.class, "_pop" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_bag" /*RemoteObject*/ )));
 BA.debugLineNum = 613;BA.debugLine="Return Bag.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_bag" /*RemoteObject*/ ).runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 614;BA.debugLine="End Sub";
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