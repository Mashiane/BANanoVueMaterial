package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vuecomponent_subs_0 {


public static RemoteObject  _addbr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddBR (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,676);
if (RapidSub.canDelegate("addbr")) { return __ref.runUserSub(false, "vuecomponent","addbr", __ref);}
 BA.debugLineNum = 676;BA.debugLine="Sub AddBR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 677;BA.debugLine="Template.SetText(\"<br>\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("<br>")));
 BA.debugLineNum = 678;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,74);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vuecomponent","addchild", __ref, _child);}
Debug.locals.put("child", _child);
 BA.debugLineNum = 74;BA.debugLine="Sub AddChild(child As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 75;BA.debugLine="SetText(child)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_settext" /*RemoteObject*/ ,(Object)(_child));
 BA.debugLineNum = 76;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addchildren(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddChildren (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,102);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vuecomponent","addchildren", __ref, _lst);}
RemoteObject _strline = RemoteObject.createImmutable("");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 102;BA.debugLine="Sub AddChildren(lst As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 103;BA.debugLine="For Each strLine As String In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _lst;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_strline = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("strLine", _strline);
Debug.locals.put("strLine", _strline);
 BA.debugLineNum = 104;BA.debugLine="SetText(strLine)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_settext" /*RemoteObject*/ ,(Object)(_strline));
 }
}Debug.locals.put("strLine", _strline);
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
		Debug.PushSubsStack("AddClass (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,686);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vuecomponent","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 686;BA.debugLine="Sub AddClass(c As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 687;BA.debugLine="Template.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 688;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 689;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addelement(RemoteObject __ref,RemoteObject _el) throws Exception{
try {
		Debug.PushSubsStack("AddElement (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,78);
if (RapidSub.canDelegate("addelement")) { return __ref.runUserSub(false, "vuecomponent","addelement", __ref, _el);}
Debug.locals.put("el", _el);
 BA.debugLineNum = 78;BA.debugLine="Sub AddElement(el As VMElement) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 79;BA.debugLine="AddChild(el.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addchild" /*RemoteObject*/ ,(Object)(_el.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ )));
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
public static RemoteObject  _addhr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddHR (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,681);
if (RapidSub.canDelegate("addhr")) { return __ref.runUserSub(false, "vuecomponent","addhr", __ref);}
 BA.debugLineNum = 681;BA.debugLine="Sub AddHR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 682;BA.debugLine="Template.SetText(\"<hr>\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("<hr>")));
 BA.debugLineNum = 683;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addprop(RemoteObject __ref,RemoteObject _propname) throws Exception{
try {
		Debug.PushSubsStack("AddProp (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,938);
if (RapidSub.canDelegate("addprop")) { return __ref.runUserSub(false, "vuecomponent","addprop", __ref, _propname);}
Debug.locals.put("propName", _propname);
 BA.debugLineNum = 938;BA.debugLine="Sub AddProp(propName As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 939;BA.debugLine="props.Add(propName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_props" /*RemoteObject*/ ).runVoidMethod ("Add",(Object)((_propname)));
 BA.debugLineNum = 940;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 941;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addprops(RemoteObject __ref,RemoteObject _propslist) throws Exception{
try {
		Debug.PushSubsStack("AddProps (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,943);
if (RapidSub.canDelegate("addprops")) { return __ref.runUserSub(false, "vuecomponent","addprops", __ref, _propslist);}
RemoteObject _k = RemoteObject.createImmutable("");
Debug.locals.put("propsList", _propslist);
 BA.debugLineNum = 943;BA.debugLine="Sub AddProps(propsList As List) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 944;BA.debugLine="For Each k As String In propsList";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _propslist;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 945;BA.debugLine="AddProp(k)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addprop" /*RemoteObject*/ ,(Object)(_k));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 947;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 948;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstyle(RemoteObject __ref,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("AddStyle (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,951);
if (RapidSub.canDelegate("addstyle")) { return __ref.runUserSub(false, "vuecomponent","addstyle", __ref, _prop, _val);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 951;BA.debugLine="Sub AddStyle(prop As String, val As Object) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 952;BA.debugLine="If val = Null Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_val)) { 
if (true) return (__ref);};
 BA.debugLineNum = 953;BA.debugLine="Dim m As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 954;BA.debugLine="m.Put(prop, val)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_prop)),(Object)(_val));
 BA.debugLineNum = 955;BA.debugLine="SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 956;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 957;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public ID As String";
vuecomponent._id = RemoteObject.createImmutable("");__ref.setField("_id",vuecomponent._id);
 //BA.debugLineNum = 4;BA.debugLine="Private BANano As BANano  'ignore";
vuecomponent._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vuecomponent._banano);
 //BA.debugLineNum = 5;BA.debugLine="Private methods As Map";
vuecomponent._methods = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_methods",vuecomponent._methods);
 //BA.debugLineNum = 6;BA.debugLine="Private data As Map";
vuecomponent._data = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_data",vuecomponent._data);
 //BA.debugLineNum = 7;BA.debugLine="Private Template As VueHTML";
vuecomponent._template = RemoteObject.createNew ("b4j.example.vuehtml");__ref.setField("_template",vuecomponent._template);
 //BA.debugLineNum = 8;BA.debugLine="Private computed As Map";
vuecomponent._computed = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_computed",vuecomponent._computed);
 //BA.debugLineNum = 9;BA.debugLine="Private watches As Map";
vuecomponent._watches = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_watches",vuecomponent._watches);
 //BA.debugLineNum = 10;BA.debugLine="Private created As BANanoObject";
vuecomponent._created = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_created",vuecomponent._created);
 //BA.debugLineNum = 11;BA.debugLine="Private mounted As BANanoObject";
vuecomponent._mounted = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_mounted",vuecomponent._mounted);
 //BA.debugLineNum = 12;BA.debugLine="Private beforeCreate As BANanoObject";
vuecomponent._beforecreate = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_beforecreate",vuecomponent._beforecreate);
 //BA.debugLineNum = 13;BA.debugLine="Private destroyed As BANanoObject";
vuecomponent._destroyed = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_destroyed",vuecomponent._destroyed);
 //BA.debugLineNum = 14;BA.debugLine="Private beforeMount As BANanoObject";
vuecomponent._beforemount = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_beforemount",vuecomponent._beforemount);
 //BA.debugLineNum = 15;BA.debugLine="Private updated As BANanoObject";
vuecomponent._updated = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_updated",vuecomponent._updated);
 //BA.debugLineNum = 16;BA.debugLine="Private beforeDestroy As BANanoObject";
vuecomponent._beforedestroy = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_beforedestroy",vuecomponent._beforedestroy);
 //BA.debugLineNum = 17;BA.debugLine="Private activated As BANanoObject";
vuecomponent._activated = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_activated",vuecomponent._activated);
 //BA.debugLineNum = 18;BA.debugLine="Private deactivated As BANanoObject";
vuecomponent._deactivated = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_deactivated",vuecomponent._deactivated);
 //BA.debugLineNum = 19;BA.debugLine="Private beforeUpdate As BANanoObject";
vuecomponent._beforeupdate = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_beforeupdate",vuecomponent._beforeupdate);
 //BA.debugLineNum = 20;BA.debugLine="Private opt As Map";
vuecomponent._opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_opt",vuecomponent._opt);
 //BA.debugLineNum = 21;BA.debugLine="Public URL As String";
vuecomponent._url = RemoteObject.createImmutable("");__ref.setField("_url",vuecomponent._url);
 //BA.debugLineNum = 22;BA.debugLine="Public name As String";
vuecomponent._name = RemoteObject.createImmutable("");__ref.setField("_name",vuecomponent._name);
 //BA.debugLineNum = 23;BA.debugLine="Public hasContent As Boolean";
vuecomponent._hascontent = RemoteObject.createImmutable(false);__ref.setField("_hascontent",vuecomponent._hascontent);
 //BA.debugLineNum = 24;BA.debugLine="Private refs As Map";
vuecomponent._refs = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");__ref.setField("_refs",vuecomponent._refs);
 //BA.debugLineNum = 25;BA.debugLine="Private props As List";
vuecomponent._props = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");__ref.setField("_props",vuecomponent._props);
 //BA.debugLineNum = 26;BA.debugLine="Private propFrom As String";
vuecomponent._propfrom = RemoteObject.createImmutable("");__ref.setField("_propfrom",vuecomponent._propfrom);
 //BA.debugLineNum = 27;BA.debugLine="Private boVUE As BANanoObject";
vuecomponent._bovue = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_bovue",vuecomponent._bovue);
 //BA.debugLineNum = 28;BA.debugLine="Private showKey As String";
vuecomponent._showkey = RemoteObject.createImmutable("");__ref.setField("_showkey",vuecomponent._showkey);
 //BA.debugLineNum = 29;BA.debugLine="Private disKey As String";
vuecomponent._diskey = RemoteObject.createImmutable("");__ref.setField("_diskey",vuecomponent._diskey);
 //BA.debugLineNum = 30;BA.debugLine="Private module As Object";
vuecomponent._module = RemoteObject.createNew ("Object");__ref.setField("_module",vuecomponent._module);
 //BA.debugLineNum = 31;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("Clear (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,701);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "vuecomponent","clear", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 701;BA.debugLine="Sub Clear(b As Boolean) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 702;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vuecomponent.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 703;BA.debugLine="Template.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 704;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 705;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _compile(RemoteObject __ref,RemoteObject _html) throws Exception{
try {
		Debug.PushSubsStack("Compile (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,35);
if (RapidSub.canDelegate("compile")) { return __ref.runUserSub(false, "vuecomponent","compile", __ref, _html);}
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("html", _html);
 BA.debugLineNum = 35;BA.debugLine="Sub Compile(html As String) As BANanoObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 36;BA.debugLine="Dim bo As BANanoObject = boVUE.RunMethod(\"compile";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo = __ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"RunMethod",(Object)(BA.ObjectToString("compile")),(Object)((RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_html)}))));Debug.locals.put("bo", _bo);Debug.locals.put("bo", _bo);
 BA.debugLineNum = 37;BA.debugLine="Return bo";
Debug.JustUpdateDeviceLine();
if (true) return _bo;
 BA.debugLineNum = 38;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _component(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Component (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("component")) { return __ref.runUserSub(false, "vuecomponent","component", __ref);}
RemoteObject _tmp = RemoteObject.createImmutable("");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 206;BA.debugLine="Sub Component() As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="Dim tmp As String = Template.tostring";
Debug.JustUpdateDeviceLine();
_tmp = __ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("tmp", _tmp);Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 208;BA.debugLine="If data.Size > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 209;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"re";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref),(Object)(BA.ObjectToString("returnData")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 210;BA.debugLine="opt.Put(\"data\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("data"))),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 212;BA.debugLine="If methods.Size > 0 Then opt.Put(\"methods\", metho";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_methods" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("methods"))),(Object)((__ref.getField(false,"_methods" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 213;BA.debugLine="If computed.Size > 0 Then opt.Put(\"computed\", com";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_computed" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("computed"))),(Object)((__ref.getField(false,"_computed" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 214;BA.debugLine="If watches.Size > 0 Then opt.Put(\"watch\", watches";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",__ref.getField(false,"_watches" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("watch"))),(Object)((__ref.getField(false,"_watches" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 215;BA.debugLine="If props.Size <> 0 Then opt.Put(\"props\", props)";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",__ref.getField(false,"_props" /*RemoteObject*/ ).runMethod(true,"getSize"),BA.numberCast(double.class, 0))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("props"))),(Object)((__ref.getField(false,"_props" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 216;BA.debugLine="If updated <> Null Then opt.Put(\"updated\", update";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_updated" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("updated"))),(Object)((__ref.getField(false,"_updated" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 217;BA.debugLine="If destroyed <> Null Then opt.Put(\"destroyed\", de";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_destroyed" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("destroyed"))),(Object)((__ref.getField(false,"_destroyed" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 218;BA.debugLine="If mounted <> Null Then	opt.Put(\"mounted\", mounte";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_mounted" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("mounted"))),(Object)((__ref.getField(false,"_mounted" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 219;BA.debugLine="If beforeCreate <> Null Then opt.Put(\"beforeCreat";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_beforecreate" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beforeCreate"))),(Object)((__ref.getField(false,"_beforecreate" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 220;BA.debugLine="If created <> Null Then opt.Put(\"created\", create";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_created" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("created"))),(Object)((__ref.getField(false,"_created" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 221;BA.debugLine="If beforeMount <> Null Then opt.Put(\"beforeMount\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_beforemount" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beforeMount"))),(Object)((__ref.getField(false,"_beforemount" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 222;BA.debugLine="If beforeUpdate <> Null Then opt.Put(\"beforeUpdat";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_beforeupdate" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beforeUpdate"))),(Object)((__ref.getField(false,"_beforeupdate" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 223;BA.debugLine="If activated <> Null Then opt.Put(\"activated\", ac";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_activated" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("activated"))),(Object)((__ref.getField(false,"_activated" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 224;BA.debugLine="If deactivated <> Null Then opt.Put(\"deactivated\"";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_deactivated" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deactivated"))),(Object)((__ref.getField(false,"_deactivated" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 225;BA.debugLine="If beforeDestroy <> Null Then opt.Put(\"beforeDest";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("N",__ref.getField(false,"_beforedestroy" /*RemoteObject*/ ))) { 
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("beforeDestroy"))),(Object)((__ref.getField(false,"_beforedestroy" /*RemoteObject*/ ).getObject())));};
 BA.debugLineNum = 226;BA.debugLine="opt.Put(\"template\", tmp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("template"))),(Object)((_tmp)));
 BA.debugLineNum = 227;BA.debugLine="Return opt";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_opt" /*RemoteObject*/ );
 BA.debugLineNum = 228;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstate(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("GetState (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,435);
if (RapidSub.canDelegate("getstate")) { return __ref.runUserSub(false, "vuecomponent","getstate", __ref, _k, _v);}
RemoteObject _out = RemoteObject.declareNull("Object");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 435;BA.debugLine="Sub GetState(k As String, v As Object) As Object";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 436;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 437;BA.debugLine="If data.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 438;BA.debugLine="Dim out As Object = data.GetDefault(k,v)";
Debug.JustUpdateDeviceLine();
_out = __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(false,"GetDefault",(Object)((_k)),(Object)(_v));Debug.locals.put("out", _out);Debug.locals.put("out", _out);
 BA.debugLineNum = 439;BA.debugLine="Return out";
Debug.JustUpdateDeviceLine();
if (true) return _out;
 }else {
 BA.debugLineNum = 441;BA.debugLine="Log(\"GetState: First set the v-model for \" & k)";
Debug.JustUpdateDeviceLine();
vuecomponent.__c.runVoidMethod ("Log",(Object)(RemoteObject.concat(RemoteObject.createImmutable("GetState: First set the v-model for "),_k)));
 BA.debugLineNum = 442;BA.debugLine="Return \"\"";
Debug.JustUpdateDeviceLine();
if (true) return RemoteObject.createImmutable((""));
 };
 BA.debugLineNum = 444;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _getstates(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("GetStates (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,424);
if (RapidSub.canDelegate("getstates")) { return __ref.runUserSub(false, "vuecomponent","getstates", __ref, _lst);}
RemoteObject _sm = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _lstrec = RemoteObject.createImmutable("");
RemoteObject _state = RemoteObject.declareNull("Object");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 424;BA.debugLine="Sub GetStates(lst As List) As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 425;BA.debugLine="Dim sm As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_sm = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_sm = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("sm", _sm);Debug.locals.put("sm", _sm);
 BA.debugLineNum = 426;BA.debugLine="For Each lstrec As String In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group2 = _lst;
final int groupLen2 = group2.runMethod(true,"getSize").<Integer>get()
;int index2 = 0;
;
for (; index2 < groupLen2;index2++){
_lstrec = BA.ObjectToString(group2.runMethod(false,"Get",index2));Debug.locals.put("lstrec", _lstrec);
Debug.locals.put("lstrec", _lstrec);
 BA.debugLineNum = 427;BA.debugLine="lstrec = lstrec.tolowercase";
Debug.JustUpdateDeviceLine();
_lstrec = _lstrec.runMethod(true,"toLowerCase");Debug.locals.put("lstrec", _lstrec);
 BA.debugLineNum = 428;BA.debugLine="Dim state As Object = GetState(lstrec, Null)";
Debug.JustUpdateDeviceLine();
_state = __ref.runClassMethod (b4j.example.vuecomponent.class, "_getstate" /*RemoteObject*/ ,(Object)(_lstrec),(Object)(vuecomponent.__c.getField(false,"Null")));Debug.locals.put("state", _state);Debug.locals.put("state", _state);
 BA.debugLineNum = 429;BA.debugLine="sm.Put(lstrec, state)";
Debug.JustUpdateDeviceLine();
_sm.runVoidMethod ("Put",(Object)((_lstrec)),(Object)(_state));
 }
}Debug.locals.put("lstrec", _lstrec);
;
 BA.debugLineNum = 431;BA.debugLine="Return sm";
Debug.JustUpdateDeviceLine();
if (true) return _sm;
 BA.debugLineNum = 432;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hasstate(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("HasState (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,420);
if (RapidSub.canDelegate("hasstate")) { return __ref.runUserSub(false, "vuecomponent","hasstate", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 420;BA.debugLine="Sub HasState(k As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 421;BA.debugLine="Return data.ContainsKey(k)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_k)));
 BA.debugLineNum = 422;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _sid,RemoteObject _tag,RemoteObject _eventhandler) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vuecomponent","initialize", __ref, _ba, _sid, _tag, _eventhandler);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("sid", _sid);
Debug.locals.put("tag", _tag);
Debug.locals.put("eventHandler", _eventhandler);
 BA.debugLineNum = 108;BA.debugLine="Public Sub Initialize(sid As String, tag As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="ID = sid.tolowercase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 110;BA.debugLine="ID = ID.trim";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,__ref.getField(true,"_id" /*RemoteObject*/ ).runMethod(true,"trim"));
 BA.debugLineNum = 111;BA.debugLine="name = sid";
Debug.JustUpdateDeviceLine();
__ref.setField ("_name" /*RemoteObject*/ ,_sid);
 BA.debugLineNum = 112;BA.debugLine="module = eventHandler";
Debug.JustUpdateDeviceLine();
__ref.setField ("_module" /*RemoteObject*/ ,_eventhandler);
 BA.debugLineNum = 113;BA.debugLine="props.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_props" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 114;BA.debugLine="Template.Initialize(ID,tag)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)(_tag));
 BA.debugLineNum = 115;BA.debugLine="methods.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 116;BA.debugLine="data.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 117;BA.debugLine="computed.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_computed" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 118;BA.debugLine="watches.Initialize";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_watches" /*RemoteObject*/ ).runVoidMethod ("Initialize");
 BA.debugLineNum = 119;BA.debugLine="beforeMount = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforemount" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 120;BA.debugLine="beforeUpdate = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforeupdate" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 121;BA.debugLine="created = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_created" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 122;BA.debugLine="mounted = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mounted" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 123;BA.debugLine="destroyed = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_destroyed" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 124;BA.debugLine="updated = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_updated" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 125;BA.debugLine="beforeCreate = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforecreate" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 126;BA.debugLine="activated = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_activated" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 127;BA.debugLine="deactivated = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_deactivated" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 128;BA.debugLine="beforeDestroy = Null";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforedestroy" /*RemoteObject*/ ).setObject (vuecomponent.__c.getField(false,"Null"));
 BA.debugLineNum = 129;BA.debugLine="opt = CreateMap()";
Debug.JustUpdateDeviceLine();
__ref.setField ("_opt" /*RemoteObject*/ ,vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {})));
 BA.debugLineNum = 130;BA.debugLine="URL = $\"/${ID}\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_url" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable("/"),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable(""))));
 BA.debugLineNum = 131;BA.debugLine="hasContent = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuecomponent.__c.getField(true,"False"));
 BA.debugLineNum = 132;BA.debugLine="boVUE.Initialize(\"Vue\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bovue" /*RemoteObject*/ ).runVoidMethod ("Initialize",(Object)((RemoteObject.createImmutable("Vue"))));
 BA.debugLineNum = 133;BA.debugLine="showKey = $\"${ID}show\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_showkey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("show"))));
 BA.debugLineNum = 134;BA.debugLine="disKey = $\"${ID}disabled\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_diskey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("disabled"))));
 BA.debugLineNum = 135;BA.debugLine="SetStateSingle(showKey, True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_showkey" /*RemoteObject*/ )),(Object)((vuecomponent.__c.getField(true,"True"))));
 BA.debugLineNum = 136;BA.debugLine="SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setvshow" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_showkey" /*RemoteObject*/ )));
 BA.debugLineNum = 137;BA.debugLine="SetStateSingle(disKey, False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_diskey" /*RemoteObject*/ )),(Object)((vuecomponent.__c.getField(true,"False"))));
 BA.debugLineNum = 138;BA.debugLine="SetDisabled(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setdisabled" /*RemoteObject*/ ,(Object)(vuecomponent.__c.getField(true,"False")));
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
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,69);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vuecomponent","pop", __ref, _p);}
RemoteObject _sout = RemoteObject.createImmutable("");
Debug.locals.put("p", _p);
 BA.debugLineNum = 69;BA.debugLine="Sub Pop(p As VueComponent)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 70;BA.debugLine="Dim sout As String = ToString";
Debug.JustUpdateDeviceLine();
_sout = __ref.runClassMethod (b4j.example.vuecomponent.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("sout", _sout);Debug.locals.put("sout", _sout);
 BA.debugLineNum = 71;BA.debugLine="p.SetText(sout)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vuecomponent.class, "_settext" /*RemoteObject*/ ,(Object)(_sout));
 BA.debugLineNum = 72;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeclass(RemoteObject __ref,RemoteObject _classname) throws Exception{
try {
		Debug.PushSubsStack("RemoveClass (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,696);
if (RapidSub.canDelegate("removeclass")) { return __ref.runUserSub(false, "vuecomponent","removeclass", __ref, _classname);}
Debug.locals.put("className", _classname);
 BA.debugLineNum = 696;BA.debugLine="Sub RemoveClass(className As String) As VueCompone";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 697;BA.debugLine="RemoveClass(className)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_removeclass" /*RemoteObject*/ ,(Object)(_classname));
 BA.debugLineNum = 698;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 699;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _renderit(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("RenderIt (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,53);
if (RapidSub.canDelegate("renderit")) { return __ref.runUserSub(false, "vuecomponent","renderit", __ref);}
RemoteObject _option = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
RemoteObject _bo = RemoteObject.declareNull("com.ab.banano.BANanoObject");
 BA.debugLineNum = 53;BA.debugLine="Sub RenderIt As BANanoObject";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 54;BA.debugLine="Dim option As Map = CreateMap(\"template\" : $\"{{ $";
Debug.JustUpdateDeviceLine();
_option = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_option = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("template")),((RemoteObject.concat(RemoteObject.createImmutable("{{ "),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_propfrom" /*RemoteObject*/ )))),RemoteObject.createImmutable(" }}"))))}));Debug.locals.put("option", _option);Debug.locals.put("option", _option);
 BA.debugLineNum = 55;BA.debugLine="Dim bo As BANanoObject = BANano.RunJavascriptMeth";
Debug.JustUpdateDeviceLine();
_bo = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_bo.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"RunJavascriptMethod",(Object)(BA.ObjectToString("createElement")),(Object)(vuecomponent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_option.getObject())}))))));Debug.locals.put("bo", _bo);
 BA.debugLineNum = 56;BA.debugLine="Return bo";
Debug.JustUpdateDeviceLine();
if (true) return _bo;
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
public static RemoteObject  _renderto(RemoteObject __ref,RemoteObject _elid) throws Exception{
try {
		Debug.PushSubsStack("RenderTo (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,231);
if (RapidSub.canDelegate("renderto")) { return __ref.runUserSub(false, "vuecomponent","renderto", __ref, _elid);}
RemoteObject _dkey = RemoteObject.createImmutable("");
RemoteObject _rkey = RemoteObject.createImmutable("");
Debug.locals.put("elID", _elid);
 BA.debugLineNum = 231;BA.debugLine="Sub RenderTo(elID As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 232;BA.debugLine="elID = elID.tolowercase";
Debug.JustUpdateDeviceLine();
_elid = _elid.runMethod(true,"toLowerCase");Debug.locals.put("elID", _elid);
 BA.debugLineNum = 233;BA.debugLine="BANano.GetElement($\"#${elID}\"$).empty";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)((RemoteObject.concat(RemoteObject.createImmutable("#"),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable(""))))).runVoidMethod ("Empty");
 BA.debugLineNum = 235;BA.debugLine="Dim boVUE As BANanoObject";
Debug.JustUpdateDeviceLine();
vuecomponent._bovue = RemoteObject.createNew ("com.ab.banano.BANanoObject");__ref.setField("_bovue",vuecomponent._bovue);
 BA.debugLineNum = 236;BA.debugLine="opt.Put(\"el\", $\"#${elID}\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("el"))),(Object)(((RemoteObject.concat(RemoteObject.createImmutable("#"),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_elid))),RemoteObject.createImmutable(""))))));
 BA.debugLineNum = 237;BA.debugLine="Component";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_component" /*RemoteObject*/ );
 BA.debugLineNum = 238;BA.debugLine="boVUE.Initialize2(\"Vue\", opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_bovue" /*RemoteObject*/ ).runVoidMethod ("Initialize2",(Object)(BA.ObjectToString("Vue")),(Object)((__ref.getField(false,"_opt" /*RemoteObject*/ ).getObject())));
 BA.debugLineNum = 240;BA.debugLine="Dim dKey As String = \"$data\"";
Debug.JustUpdateDeviceLine();
_dkey = BA.ObjectToString("$data");Debug.locals.put("dKey", _dkey);Debug.locals.put("dKey", _dkey);
 BA.debugLineNum = 241;BA.debugLine="data = boVUE.GetField(dKey).Result";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).setObject (__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_dkey)).runMethod(false,"Result"));
 BA.debugLineNum = 243;BA.debugLine="Dim rKey As String = \"$refs\"";
Debug.JustUpdateDeviceLine();
_rkey = BA.ObjectToString("$refs");Debug.locals.put("rKey", _rkey);Debug.locals.put("rKey", _rkey);
 BA.debugLineNum = 244;BA.debugLine="refs = boVUE.GetField(rKey).result";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_refs" /*RemoteObject*/ ).setObject (__ref.getField(false,"_bovue" /*RemoteObject*/ ).runMethod(false,"GetField",(Object)(_rkey)).runMethod(false,"Result"));
 BA.debugLineNum = 245;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _returndata(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ReturnData (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,345);
if (RapidSub.canDelegate("returndata")) { return __ref.runUserSub(false, "vuecomponent","returndata", __ref);}
 BA.debugLineNum = 345;BA.debugLine="private Sub ReturnData As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 346;BA.debugLine="Return data";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_data" /*RemoteObject*/ );
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
public static RemoteObject  _setactivated(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetActivated (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,264);
if (RapidSub.canDelegate("setactivated")) { return __ref.runUserSub(false, "vuecomponent","setactivated", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 264;BA.debugLine="Sub SetActivated(methodName As String) As VueCompo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 265;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 266;BA.debugLine="activated = BANano.CallBack(module, methodName, N";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_activated" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
 BA.debugLineNum = 267;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 268;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setalt(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("SetAlt (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,603);
if (RapidSub.canDelegate("setalt")) { return __ref.runUserSub(false, "vuecomponent","setalt", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 603;BA.debugLine="Sub SetAlt(a As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 604;BA.debugLine="Template.SetAlt(a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setalt" /*RemoteObject*/ ,(Object)(_a));
 BA.debugLineNum = 605;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 606;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetAttr (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,639);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vuecomponent","setattr", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 639;BA.debugLine="Sub SetAttr(m As Map) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 640;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 641;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 642;BA.debugLine="Template.SetAttr(k, v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(_k),(Object)(BA.ObjectToString(_v)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 644;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 645;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setautocomplete(RemoteObject __ref,RemoteObject _auto,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetAutoComplete (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,802);
if (RapidSub.canDelegate("setautocomplete")) { return __ref.runUserSub(false, "vuecomponent","setautocomplete", __ref, _auto, _bind);}
Debug.locals.put("auto", _auto);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 802;BA.debugLine="Sub SetAutoComplete(auto As String, bind As Boolea";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 803;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 804;BA.debugLine="SetAttr(CreateMap(\":autocomplete\": auto))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":autocomplete")),(_auto)}))));
 }else {
 BA.debugLineNum = 806;BA.debugLine="SetAttr(CreateMap(\"autocomplete\": auto))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("autocomplete")),(_auto)}))));
 };
 BA.debugLineNum = 808;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 809;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundcolor(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundColor (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,460);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "vuecomponent","setbackgroundcolor", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 460;BA.debugLine="Sub SetBackgroundColor(p As Object) As VueComponen";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 461;BA.debugLine="SetStyle(CreateMap(\"background-color\":p))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("background-color")),_p}))));
 BA.debugLineNum = 462;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 463;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbeforecreate(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetBeforeCreate (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("setbeforecreate")) { return __ref.runUserSub(false, "vuecomponent","setbeforecreate", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 320;BA.debugLine="Sub SetBeforeCreate(methodName As String) As VueCo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 322;BA.debugLine="beforeCreate = BANano.CallBack(module, methodName";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforecreate" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
 BA.debugLineNum = 323;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 324;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbeforedestroy(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetBeforeDestroy (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("setbeforedestroy")) { return __ref.runUserSub(false, "vuecomponent","setbeforedestroy", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 301;BA.debugLine="Sub SetBeforeDestroy(methodName As String) As VueC";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 303;BA.debugLine="beforeDestroy = BANano.CallBack(module, methodNam";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforedestroy" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
 BA.debugLineNum = 304;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 305;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbeforemount(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetBeforeMount (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,287);
if (RapidSub.canDelegate("setbeforemount")) { return __ref.runUserSub(false, "vuecomponent","setbeforemount", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 287;BA.debugLine="Sub SetBeforeMount(methodName As String) As VueCom";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 288;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 289;BA.debugLine="beforeMount = BANano.CallBack(module, methodName,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforemount" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
 BA.debugLineNum = 290;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 291;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbeforeupdate(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetBeforeUpdate (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,294);
if (RapidSub.canDelegate("setbeforeupdate")) { return __ref.runUserSub(false, "vuecomponent","setbeforeupdate", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 294;BA.debugLine="Sub SetBeforeUpdate(methodName As String) As VueCo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 295;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 296;BA.debugLine="beforeMount = BANano.CallBack(module, methodName,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_beforemount" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
 BA.debugLineNum = 297;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 298;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setborder(RemoteObject __ref,RemoteObject _width,RemoteObject _color,RemoteObject _bstyle) throws Exception{
try {
		Debug.PushSubsStack("SetBorder (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,812);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vuecomponent","setborder", __ref, _width, _color, _bstyle);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("width", _width);
Debug.locals.put("color", _color);
Debug.locals.put("bstyle", _bstyle);
 BA.debugLineNum = 812;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 813;BA.debugLine="Dim b As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_b = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 814;BA.debugLine="b.Put(\"border-style\", bstyle)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border-style"))),(Object)((_bstyle)));
 BA.debugLineNum = 815;BA.debugLine="b.Put(\"border-width\", width)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border-width"))),(Object)((_width)));
 BA.debugLineNum = 816;BA.debugLine="b.Put(\"border-color\", color)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border-color"))),(Object)((_color)));
 BA.debugLineNum = 817;BA.debugLine="SetStyle(b)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 818;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 819;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcallback(RemoteObject __ref,RemoteObject _methodname,RemoteObject _cb) throws Exception{
try {
		Debug.PushSubsStack("SetCallBack (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,858);
if (RapidSub.canDelegate("setcallback")) { return __ref.runUserSub(false, "vuecomponent","setcallback", __ref, _methodname, _cb);}
Debug.locals.put("methodName", _methodname);
Debug.locals.put("cb", _cb);
 BA.debugLineNum = 858;BA.debugLine="Sub SetCallBack(methodName As String, cb As BANano";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 859;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 860;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 BA.debugLineNum = 861;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setchecked(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetChecked (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,691);
if (RapidSub.canDelegate("setchecked")) { return __ref.runUserSub(false, "vuecomponent","setchecked", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 691;BA.debugLine="Sub SetChecked(b As Boolean) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 692;BA.debugLine="SetAttr(CreateMap(\":checked\":b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":checked")),(_b)}))));
 BA.debugLineNum = 693;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 694;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcolor(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("SetColor (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,448);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "vuecomponent","setcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 448;BA.debugLine="Sub SetColor(c As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 449;BA.debugLine="SetStyle(CreateMap(\"color\": c))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("color")),_c}))));
 BA.debugLineNum = 450;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 451;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcomputed(RemoteObject __ref,RemoteObject _k,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetComputed (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("setcomputed")) { return __ref.runUserSub(false, "vuecomponent","setcomputed", __ref, _k, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("k", _k);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 350;BA.debugLine="Sub SetComputed(k As String, methodName As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 351;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 352;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 353;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 354;BA.debugLine="If data.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 355;BA.debugLine="SetStateSingle(k, Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)(vuecomponent.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 357;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 358;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vuecomponent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_e)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 359;BA.debugLine="computed.Put(k, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_computed" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 361;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 362;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcreated(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetCreated (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,328);
if (RapidSub.canDelegate("setcreated")) { return __ref.runUserSub(false, "vuecomponent","setcreated", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 328;BA.debugLine="Sub SetCreated(methodName As String) As VueCompone";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 329;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 330;BA.debugLine="created = BANano.CallBack(module, methodName, Nul";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_created" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
 BA.debugLineNum = 331;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 332;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcursormove(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetCursorMove (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,822);
if (RapidSub.canDelegate("setcursormove")) { return __ref.runUserSub(false, "vuecomponent","setcursormove", __ref);}
 BA.debugLineNum = 822;BA.debugLine="Sub SetCursorMove As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 823;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"move\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("cursor")),(RemoteObject.createImmutable("move"))}))));
 BA.debugLineNum = 824;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 825;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdeactivated(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetDeActivated (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,272);
if (RapidSub.canDelegate("setdeactivated")) { return __ref.runUserSub(false, "vuecomponent","setdeactivated", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 272;BA.debugLine="Sub SetDeActivated(methodName As String) As VueCom";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 273;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 274;BA.debugLine="deactivated = BANano.CallBack(module, methodName,";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_deactivated" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
 BA.debugLineNum = 275;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 276;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdestroyed(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetDestroyed (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("setdestroyed")) { return __ref.runUserSub(false, "vuecomponent","setdestroyed", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 256;BA.debugLine="Sub SetDestroyed(methodName As String) As VueCompo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 258;BA.debugLine="destroyed = BANano.CallBack(module, methodName, N";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_destroyed" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
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
public static RemoteObject  _setdisabled(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisabled (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,624);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vuecomponent","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 624;BA.debugLine="Sub SetDisabled(b As Boolean) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 625;BA.debugLine="Template.SetAttr(\":disabled\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":disabled")),(Object)(BA.ObjectToString(_b)));
 BA.debugLineNum = 626;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 627;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisabledstate(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetDisabledState (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,194);
if (RapidSub.canDelegate("setdisabledstate")) { return __ref.runUserSub(false, "vuecomponent","setdisabledstate", __ref, _k, _v);}
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 194;BA.debugLine="Sub SetDisabledState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 195;BA.debugLine="Dim disKey As String = $\"${k}disabled\"$";
Debug.JustUpdateDeviceLine();
vuecomponent._diskey = (RemoteObject.concat(RemoteObject.createImmutable(""),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("disabled")));__ref.setField("_diskey",vuecomponent._diskey);
 BA.debugLineNum = 196;BA.debugLine="SetStateSingle(disKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_diskey" /*RemoteObject*/ )),(Object)((_v)));
 BA.debugLineNum = 197;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdraggable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDraggable (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,834);
if (RapidSub.canDelegate("setdraggable")) { return __ref.runUserSub(false, "vuecomponent","setdraggable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 834;BA.debugLine="Sub SetDraggable(b As Boolean) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 835;BA.debugLine="SetAttr(CreateMap(\":draggable\":b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":draggable")),(_b)}))));
 BA.debugLineNum = 836;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 837;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdroppable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDroppable (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,840);
if (RapidSub.canDelegate("setdroppable")) { return __ref.runUserSub(false, "vuecomponent","setdroppable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 840;BA.debugLine="Sub SetDroppable(b As Boolean) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 841;BA.debugLine="SetAttr(CreateMap(\":droppable\":b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":droppable")),(_b)}))));
 BA.debugLineNum = 842;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 843;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setfunctional(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetFunctional (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,40);
if (RapidSub.canDelegate("setfunctional")) { return __ref.runUserSub(false, "vuecomponent","setfunctional", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 40;BA.debugLine="Sub SetFunctional(b As Boolean) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 41;BA.debugLine="opt.Put(\"functional\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("functional"))),(Object)((_b)));
 BA.debugLineNum = 42;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 43;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheight(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetHeight (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,852);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vuecomponent","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 852;BA.debugLine="Sub SetHeight(h As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 853;BA.debugLine="SetStyle(CreateMap(\"height\":h))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),(_h)}))));
 BA.debugLineNum = 854;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 855;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetHREF (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,619);
if (RapidSub.canDelegate("sethref")) { return __ref.runUserSub(false, "vuecomponent","sethref", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 619;BA.debugLine="Sub SetHREF(h As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 620;BA.debugLine="Template.SetAttrHREF(h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattrhref" /*RemoteObject*/ ,(Object)(_h));
 BA.debugLineNum = 621;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 622;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _sid,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,83);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vuecomponent","setid", __ref, _sid, _bind);}
Debug.locals.put("sid", _sid);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 83;BA.debugLine="Sub SetID(sid As String, bind As Boolean) As VueCo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 84;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 85;BA.debugLine="SetAttr(CreateMap(\":id\":sid))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":id")),(_sid)}))));
 }else {
 BA.debugLineNum = 87;BA.debugLine="SetAttr(CreateMap(\"id\":sid))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_sid)}))));
 };
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
public static RemoteObject  _setis(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetIs (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,760);
if (RapidSub.canDelegate("setis")) { return __ref.runUserSub(false, "vuecomponent","setis", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 760;BA.debugLine="Sub SetIs(t As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 761;BA.debugLine="t = t.tolowercase";
Debug.JustUpdateDeviceLine();
_t = _t.runMethod(true,"toLowerCase");Debug.locals.put("t", _t);
 BA.debugLineNum = 762;BA.debugLine="SetAttr(CreateMap(\":is\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":is")),(_t)}))));
 BA.debugLineNum = 763;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 764;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setishidden(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetIsHidden (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,707);
if (RapidSub.canDelegate("setishidden")) { return __ref.runUserSub(false, "vuecomponent","setishidden", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 707;BA.debugLine="Sub SetIsHidden(b As Boolean) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 708;BA.debugLine="If b = False Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_b,vuecomponent.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 709;BA.debugLine="AddClass(\"is-hidden\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("is-hidden")));
 BA.debugLineNum = 710;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 711;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetKey (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,718);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vuecomponent","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 718;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VueCom";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 719;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 720;BA.debugLine="SetAttr(CreateMap(\":key\": k))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":key")),_k}))));
 }else {
 BA.debugLineNum = 722;BA.debugLine="SetAttr(CreateMap(\"key\": k))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("key")),_k}))));
 };
 BA.debugLineNum = 724;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 725;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlineheight(RemoteObject __ref,RemoteObject _lh) throws Exception{
try {
		Debug.PushSubsStack("SetLineHeight (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,634);
if (RapidSub.canDelegate("setlineheight")) { return __ref.runUserSub(false, "vuecomponent","setlineheight", __ref, _lh);}
Debug.locals.put("lh", _lh);
 BA.debugLineNum = 634;BA.debugLine="Sub SetLineHeight(lh As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 635;BA.debugLine="SetStyle(CreateMap(\"line-height\": lh))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("line-height")),_lh}))));
 BA.debugLineNum = 636;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 637;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmarginall(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetMarginAll (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,578);
if (RapidSub.canDelegate("setmarginall")) { return __ref.runUserSub(false, "vuecomponent","setmarginall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 578;BA.debugLine="Sub SetMarginAll(p As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 579;BA.debugLine="SetStyle(CreateMap(\"margin\":p))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("margin")),_p}))));
 BA.debugLineNum = 580;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 581;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmargins(RemoteObject __ref,RemoteObject _mt,RemoteObject _mb,RemoteObject _ml,RemoteObject _mr) throws Exception{
try {
		Debug.PushSubsStack("SetMargins (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,929);
if (RapidSub.canDelegate("setmargins")) { return __ref.runUserSub(false, "vuecomponent","setmargins", __ref, _mt, _mb, _ml, _mr);}
Debug.locals.put("mt", _mt);
Debug.locals.put("mb", _mb);
Debug.locals.put("ml", _ml);
Debug.locals.put("mr", _mr);
 BA.debugLineNum = 929;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 930;BA.debugLine="AddStyle(\"margin-top\", mt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-top")),(Object)(_mt));
 BA.debugLineNum = 931;BA.debugLine="AddStyle(\"margin-bottom\", mb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-bottom")),(Object)(_mb));
 BA.debugLineNum = 932;BA.debugLine="AddStyle(\"margin-left\", ml)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-left")),(Object)(_ml));
 BA.debugLineNum = 933;BA.debugLine="AddStyle(\"margin-right\", mr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-right")),(Object)(_mr));
 BA.debugLineNum = 934;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 935;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmaxwidth(RemoteObject __ref,RemoteObject _mw) throws Exception{
try {
		Debug.PushSubsStack("SetMaxWidth (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,609);
if (RapidSub.canDelegate("setmaxwidth")) { return __ref.runUserSub(false, "vuecomponent","setmaxwidth", __ref, _mw);}
Debug.locals.put("mw", _mw);
 BA.debugLineNum = 609;BA.debugLine="Sub SetMaxWidth(mw As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 610;BA.debugLine="Template.SetStyle(\"max-width\",mw)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("max-width")),(Object)(_mw));
 BA.debugLineNum = 611;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 612;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmethod(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetMethod (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,335);
if (RapidSub.canDelegate("setmethod")) { return __ref.runUserSub(false, "vuecomponent","setmethod", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 335;BA.debugLine="Sub SetMethod(methodName As String) As VueComponen";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 336;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 337;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 338;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 339;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vuecomponent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {(_e)}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 340;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 342;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 343;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmounted(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetMounted (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,248);
if (RapidSub.canDelegate("setmounted")) { return __ref.runUserSub(false, "vuecomponent","setmounted", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 248;BA.debugLine="Sub SetMounted(methodName As String) As VueCompone";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 249;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 250;BA.debugLine="mounted = BANano.CallBack(module, methodName, Nul";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_mounted" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
 BA.debugLineNum = 251;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 252;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _sid,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,92);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vuecomponent","setname", __ref, _sid, _bind);}
Debug.locals.put("sid", _sid);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 92;BA.debugLine="Sub SetName(sid As String, bind As Boolean) As Vue";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 93;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 94;BA.debugLine="SetAttr(CreateMap(\":name\":sid))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":name")),(_sid)}))));
 }else {
 BA.debugLineNum = 96;BA.debugLine="SetAttr(CreateMap(\"name\":sid))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),(_sid)}))));
 };
 BA.debugLineNum = 98;BA.debugLine="name = sid";
Debug.JustUpdateDeviceLine();
__ref.setField ("_name" /*RemoteObject*/ ,_sid);
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
public static RemoteObject  _setonblur(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnBlur (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,496);
if (RapidSub.canDelegate("setonblur")) { return __ref.runUserSub(false, "vuecomponent","setonblur", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 496;BA.debugLine="Sub SetOnBlur(methodName As String) As VueComponen";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 497;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 498;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 499;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 500;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 501;BA.debugLine="SetAttr(CreateMap(\"v-on:blur\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:blur")),(_methodname)}))));
 BA.debugLineNum = 503;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 505;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 506;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonchange(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnChange (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,529);
if (RapidSub.canDelegate("setonchange")) { return __ref.runUserSub(false, "vuecomponent","setonchange", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 529;BA.debugLine="Sub SetOnChange(methodName As String) As VueCompon";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 530;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 531;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 532;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 533;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 534;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:change")),(_methodname)}))));
 BA.debugLineNum = 536;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 538;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 539;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclick(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnClick (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,515);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vuecomponent","setonclick", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 515;BA.debugLine="Sub SetOnClick(methodName As String) As VueCompone";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 516;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 517;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 518;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 519;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 520;BA.debugLine="SetAttr(CreateMap(\"v-on:click\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:click")),(_methodname)}))));
 BA.debugLineNum = 522;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 BA.debugLineNum = 523;BA.debugLine="SetPointer(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setpointer" /*RemoteObject*/ ,(Object)(vuecomponent.__c.getField(true,"True")));
 };
 BA.debugLineNum = 525;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 526;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondragend(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragEnd (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,890);
if (RapidSub.canDelegate("setondragend")) { return __ref.runUserSub(false, "vuecomponent","setondragend", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 890;BA.debugLine="Sub SetOnDragEnd(methodName As String) As VueCompo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 891;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 892;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 893;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 894;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 895;BA.debugLine="SetAttr(CreateMap(\"v-on:dragend\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:dragend")),(_methodname)}))));
 BA.debugLineNum = 897;BA.debugLine="SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 };
 BA.debugLineNum = 899;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 900;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondragenter(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragEnter (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,903);
if (RapidSub.canDelegate("setondragenter")) { return __ref.runUserSub(false, "vuecomponent","setondragenter", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 903;BA.debugLine="Sub SetOnDragEnter(methodName As String) As VueCom";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 904;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 905;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 906;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 907;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 908;BA.debugLine="SetAttr(CreateMap(\"v-on:dragenter\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:dragenter")),(_methodname)}))));
 BA.debugLineNum = 910;BA.debugLine="SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 };
 BA.debugLineNum = 912;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 913;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondragover(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragOver (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,864);
if (RapidSub.canDelegate("setondragover")) { return __ref.runUserSub(false, "vuecomponent","setondragover", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 864;BA.debugLine="Sub SetOnDragOver(methodName As String) As VueComp";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 865;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 866;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 867;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 868;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 869;BA.debugLine="SetAttr(CreateMap(\"v-on:dragover\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:dragover")),(_methodname)}))));
 BA.debugLineNum = 871;BA.debugLine="SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 };
 BA.debugLineNum = 873;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 874;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondragstart(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragStart (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,877);
if (RapidSub.canDelegate("setondragstart")) { return __ref.runUserSub(false, "vuecomponent","setondragstart", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 877;BA.debugLine="Sub SetOnDragStart(methodName As String) As VueCom";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 878;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 879;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 880;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 881;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 882;BA.debugLine="SetAttr(CreateMap(\"v-on:dragstart\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:dragstart")),(_methodname)}))));
 BA.debugLineNum = 884;BA.debugLine="SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 };
 BA.debugLineNum = 886;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 887;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondrop(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDrop (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,916);
if (RapidSub.canDelegate("setondrop")) { return __ref.runUserSub(false, "vuecomponent","setondrop", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 916;BA.debugLine="Sub SetOnDrop(methodName As String) As VueComponen";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 917;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 918;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 919;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 920;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 921;BA.debugLine="SetAttr(CreateMap(\"v-on:drop\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:drop")),(_methodname)}))));
 BA.debugLineNum = 923;BA.debugLine="SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 };
 BA.debugLineNum = 925;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 926;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonfocus(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnFocus (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,483);
if (RapidSub.canDelegate("setonfocus")) { return __ref.runUserSub(false, "vuecomponent","setonfocus", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 483;BA.debugLine="Sub SetOnFocus(methodName As String) As VueCompone";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 484;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 485;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 486;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 487;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 488;BA.debugLine="SetAttr(CreateMap(\"v-on:focus\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:focus")),(_methodname)}))));
 BA.debugLineNum = 490;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 492;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 493;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoninput(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnInput (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,470);
if (RapidSub.canDelegate("setoninput")) { return __ref.runUserSub(false, "vuecomponent","setoninput", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 470;BA.debugLine="Sub SetOnInput(methodName As String) As VueCompone";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 471;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 472;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 473;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 474;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 475;BA.debugLine="SetAttr(CreateMap(\"v-on:input\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:input")),(_methodname)}))));
 BA.debugLineNum = 477;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 479;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 480;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonmouseout(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnMouseOut (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,307);
if (RapidSub.canDelegate("setonmouseout")) { return __ref.runUserSub(false, "vuecomponent","setonmouseout", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 307;BA.debugLine="Sub SetOnMouseOut(methodName As String) As VueComp";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 308;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 309;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseout\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:mouseout")),(_methodname)}))));
 BA.debugLineNum = 310;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 311;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonmouseover(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnMouseOver (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,313);
if (RapidSub.canDelegate("setonmouseover")) { return __ref.runUserSub(false, "vuecomponent","setonmouseover", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 313;BA.debugLine="Sub SetOnMouseOver(methodName As String) As VueCom";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 314;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 315;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseover\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:mouseover")),(_methodname)}))));
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
public static RemoteObject  _setonselected(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnSelected (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,542);
if (RapidSub.canDelegate("setonselected")) { return __ref.runUserSub(false, "vuecomponent","setonselected", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 542;BA.debugLine="Sub SetOnSelected(methodName As String) As VueComp";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 543;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 544;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 545;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 546;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 547;BA.debugLine="SetAttr(CreateMap(\"v-on:selected\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:selected")),(_methodname)}))));
 BA.debugLineNum = 549;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 551;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 552;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setontouchstart(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnTouchStart (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,555);
if (RapidSub.canDelegate("setontouchstart")) { return __ref.runUserSub(false, "vuecomponent","setontouchstart", __ref, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 555;BA.debugLine="Sub SetOnTouchStart(methodName As String) As VueCo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 556;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 557;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 558;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 559;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 560;BA.debugLine="SetAttr(CreateMap(\"v-on:touchstart\": methodName)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:touchstart")),(_methodname)}))));
 BA.debugLineNum = 562;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 564;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 565;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpadding(RemoteObject __ref,RemoteObject _pt,RemoteObject _pb,RemoteObject _pl,RemoteObject _pr) throws Exception{
try {
		Debug.PushSubsStack("SetPadding (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,960);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vuecomponent","setpadding", __ref, _pt, _pb, _pl, _pr);}
Debug.locals.put("pt", _pt);
Debug.locals.put("pb", _pb);
Debug.locals.put("pl", _pl);
Debug.locals.put("pr", _pr);
 BA.debugLineNum = 960;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 961;BA.debugLine="AddStyle(\"padding-top\", pt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-top")),(Object)(_pt));
 BA.debugLineNum = 962;BA.debugLine="AddStyle(\"padding-bottom\", pb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-bottom")),(Object)(_pb));
 BA.debugLineNum = 963;BA.debugLine="AddStyle(\"padding-left\", pl)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-left")),(Object)(_pl));
 BA.debugLineNum = 964;BA.debugLine="AddStyle(\"padding-right\", pr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-right")),(Object)(_pr));
 BA.debugLineNum = 965;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 966;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpaddingall(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("SetPaddingAll (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,589);
if (RapidSub.canDelegate("setpaddingall")) { return __ref.runUserSub(false, "vuecomponent","setpaddingall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 589;BA.debugLine="Sub SetPaddingAll(p As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 590;BA.debugLine="SetStyle(CreateMap(\"padding\":p))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("padding")),_p}))));
 BA.debugLineNum = 591;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 592;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpointer(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPointer (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,509);
if (RapidSub.canDelegate("setpointer")) { return __ref.runUserSub(false, "vuecomponent","setpointer", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 509;BA.debugLine="Sub SetPointer(b As Boolean) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 510;BA.debugLine="Template.SetPointer(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setpointer" /*RemoteObject*/ ,(Object)(vuecomponent.__c.getField(true,"True")));
 BA.debugLineNum = 511;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 512;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetRef (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,727);
if (RapidSub.canDelegate("setref")) { return __ref.runUserSub(false, "vuecomponent","setref", __ref, _varref);}
Debug.locals.put("varRef", _varref);
 BA.debugLineNum = 727;BA.debugLine="Sub SetRef(varRef As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 728;BA.debugLine="If varRef <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_varref,BA.ObjectToString(""))) { 
 BA.debugLineNum = 729;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("ref")),(_varref)}))));
 };
 BA.debugLineNum = 731;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 732;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setshowstate(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetShowState (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,189);
if (RapidSub.canDelegate("setshowstate")) { return __ref.runUserSub(false, "vuecomponent","setshowstate", __ref, _k, _v);}
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 189;BA.debugLine="Sub SetShowState(k As String, v As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 190;BA.debugLine="Dim showKey As String = $\"${k}show\"$";
Debug.JustUpdateDeviceLine();
vuecomponent._showkey = (RemoteObject.concat(RemoteObject.createImmutable(""),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_k))),RemoteObject.createImmutable("show")));__ref.setField("_showkey",vuecomponent._showkey);
 BA.debugLineNum = 191;BA.debugLine="SetStateSingle(showKey, v)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_showkey" /*RemoteObject*/ )),(Object)((_v)));
 BA.debugLineNum = 192;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsrc(RemoteObject __ref,RemoteObject _s,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetSRC (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,594);
if (RapidSub.canDelegate("setsrc")) { return __ref.runUserSub(false, "vuecomponent","setsrc", __ref, _s, _bind);}
Debug.locals.put("s", _s);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 594;BA.debugLine="Sub SetSRC(s As String, bind As Boolean) As VueCom";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 595;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 596;BA.debugLine="SetAttr(CreateMap(\":src\":s))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":src")),(_s)}))));
 }else {
 BA.debugLineNum = 598;BA.debugLine="Template.SetSrc(s)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setsrc" /*RemoteObject*/ ,(Object)(_s));
 };
 BA.debugLineNum = 600;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 601;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstate(RemoteObject __ref,RemoteObject _m) throws Exception{
try {
		Debug.PushSubsStack("SetState (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,410);
if (RapidSub.canDelegate("setstate")) { return __ref.runUserSub(false, "vuecomponent","setstate", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 410;BA.debugLine="Sub SetState(m As Map) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 411;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 412;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 413;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 414;BA.debugLine="data.Put(k, v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_data" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 416;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 417;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatedecrement(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetStateDecrement (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,159);
if (RapidSub.canDelegate("setstatedecrement")) { return __ref.runUserSub(false, "vuecomponent","setstatedecrement", __ref, _k);}
RemoteObject _oldv = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 159;BA.debugLine="Sub SetStateDecrement(k As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 160;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
Debug.JustUpdateDeviceLine();
_oldv = BA.ObjectToString(__ref.runClassMethod (b4j.example.vuecomponent.class, "_getstate" /*RemoteObject*/ ,(Object)(_k),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("oldV", _oldv);Debug.locals.put("oldV", _oldv);
 BA.debugLineNum = 161;BA.debugLine="oldV = BANano.parseInt(oldV) - 1";
Debug.JustUpdateDeviceLine();
_oldv = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_oldv))),RemoteObject.createImmutable(1)}, "-",1, 1));Debug.locals.put("oldV", _oldv);
 BA.debugLineNum = 162;BA.debugLine="SetStateSingle(k, oldV)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)((_oldv)));
 BA.debugLineNum = 163;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 164;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatefalse(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetStateFalse (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,147);
if (RapidSub.canDelegate("setstatefalse")) { return __ref.runUserSub(false, "vuecomponent","setstatefalse", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 147;BA.debugLine="Sub SetStateFalse(k As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 148;BA.debugLine="SetStateSingle(k,False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)((vuecomponent.__c.getField(true,"False"))));
 BA.debugLineNum = 149;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 150;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstateincrement(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetStateIncrement (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,152);
if (RapidSub.canDelegate("setstateincrement")) { return __ref.runUserSub(false, "vuecomponent","setstateincrement", __ref, _k);}
RemoteObject _oldv = RemoteObject.createImmutable("");
Debug.locals.put("k", _k);
 BA.debugLineNum = 152;BA.debugLine="Sub SetStateIncrement(k As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 153;BA.debugLine="Dim oldV As String = GetState(k, \"0\")";
Debug.JustUpdateDeviceLine();
_oldv = BA.ObjectToString(__ref.runClassMethod (b4j.example.vuecomponent.class, "_getstate" /*RemoteObject*/ ,(Object)(_k),(Object)((RemoteObject.createImmutable("0")))));Debug.locals.put("oldV", _oldv);Debug.locals.put("oldV", _oldv);
 BA.debugLineNum = 154;BA.debugLine="oldV = BANano.parseInt(oldV) + 1";
Debug.JustUpdateDeviceLine();
_oldv = BA.NumberToString(RemoteObject.solve(new RemoteObject[] {__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseInt",(Object)((_oldv))),RemoteObject.createImmutable(1)}, "+",1, 1));Debug.locals.put("oldV", _oldv);
 BA.debugLineNum = 155;BA.debugLine="SetStateSingle(k, oldV)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)((_oldv)));
 BA.debugLineNum = 156;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 157;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatelist(RemoteObject __ref,RemoteObject _mapkey,RemoteObject _mapvalues) throws Exception{
try {
		Debug.PushSubsStack("SetStateList (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,393);
if (RapidSub.canDelegate("setstatelist")) { return __ref.runUserSub(false, "vuecomponent","setstatelist", __ref, _mapkey, _mapvalues);}
Debug.locals.put("mapKey", _mapkey);
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 393;BA.debugLine="Sub SetStateList(mapKey As String, mapValues As Li";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 394;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
vuecomponent._opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vuecomponent._opt = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));__ref.setField("_opt",vuecomponent._opt);
 BA.debugLineNum = 395;BA.debugLine="opt.Put(mapKey, mapValues)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_mapkey)),(Object)((_mapvalues.getObject())));
 BA.debugLineNum = 396;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_opt" /*RemoteObject*/ )));
 BA.debugLineNum = 397;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 398;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatelistvalues(RemoteObject __ref,RemoteObject _mapvalues) throws Exception{
try {
		Debug.PushSubsStack("SetStateListValues (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,400);
if (RapidSub.canDelegate("setstatelistvalues")) { return __ref.runUserSub(false, "vuecomponent","setstatelistvalues", __ref, _mapvalues);}
RemoteObject _lstvalue = RemoteObject.createImmutable("");
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 400;BA.debugLine="Sub SetStateListValues(mapValues As List) As VueCo";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 401;BA.debugLine="For Each lstValue As String In mapValues";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _mapvalues;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_lstvalue = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("lstValue", _lstvalue);
Debug.locals.put("lstValue", _lstvalue);
 BA.debugLineNum = 402;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
vuecomponent._opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vuecomponent._opt = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));__ref.setField("_opt",vuecomponent._opt);
 BA.debugLineNum = 403;BA.debugLine="opt.Put(lstValue, \"\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_lstvalue)),(Object)((RemoteObject.createImmutable(""))));
 BA.debugLineNum = 404;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_opt" /*RemoteObject*/ )));
 }
}Debug.locals.put("lstValue", _lstvalue);
;
 BA.debugLineNum = 406;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 407;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatemap(RemoteObject __ref,RemoteObject _mapkey,RemoteObject _mapvalues) throws Exception{
try {
		Debug.PushSubsStack("SetStateMap (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,385);
if (RapidSub.canDelegate("setstatemap")) { return __ref.runUserSub(false, "vuecomponent","setstatemap", __ref, _mapkey, _mapvalues);}
Debug.locals.put("mapKey", _mapkey);
Debug.locals.put("mapValues", _mapvalues);
 BA.debugLineNum = 385;BA.debugLine="Sub SetStateMap(mapKey As String, mapValues As Map";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 386;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
vuecomponent._opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vuecomponent._opt = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));__ref.setField("_opt",vuecomponent._opt);
 BA.debugLineNum = 387;BA.debugLine="opt.Put(mapKey, mapValues)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_mapkey)),(Object)((_mapvalues.getObject())));
 BA.debugLineNum = 388;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_opt" /*RemoteObject*/ )));
 BA.debugLineNum = 389;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 390;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstatesingle(RemoteObject __ref,RemoteObject _k,RemoteObject _v) throws Exception{
try {
		Debug.PushSubsStack("SetStateSingle (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,167);
if (RapidSub.canDelegate("setstatesingle")) { return __ref.runUserSub(false, "vuecomponent","setstatesingle", __ref, _k, _v);}
RemoteObject _optx = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("k", _k);
Debug.locals.put("v", _v);
 BA.debugLineNum = 167;BA.debugLine="Sub SetStateSingle(k As String, v As Object) As Vu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 168;BA.debugLine="Dim optx As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_optx = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_optx = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("optx", _optx);Debug.locals.put("optx", _optx);
 BA.debugLineNum = 169;BA.debugLine="optx.Put(k, v)";
Debug.JustUpdateDeviceLine();
_optx.runVoidMethod ("Put",(Object)((_k)),(Object)(_v));
 BA.debugLineNum = 170;BA.debugLine="SetState(optx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstate" /*RemoteObject*/ ,(Object)(_optx));
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
public static RemoteObject  _setstatetrue(RemoteObject __ref,RemoteObject _k) throws Exception{
try {
		Debug.PushSubsStack("SetStateTrue (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,142);
if (RapidSub.canDelegate("setstatetrue")) { return __ref.runUserSub(false, "vuecomponent","setstatetrue", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 142;BA.debugLine="Sub SetStateTrue(k As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 143;BA.debugLine="SetStateSingle(k,True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)((vuecomponent.__c.getField(true,"True"))));
 BA.debugLineNum = 144;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 145;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,453);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vuecomponent","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 453;BA.debugLine="Sub SetStyle(m As Map) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 454;BA.debugLine="Template.SetStyles(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setstyles" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 455;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 456;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,64);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vuecomponent","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 64;BA.debugLine="Sub SetTabIndex(ti As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 65;BA.debugLine="Template.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settag(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetTag (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,583);
if (RapidSub.canDelegate("settag")) { return __ref.runUserSub(false, "vuecomponent","settag", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 583;BA.debugLine="Sub SetTag(t As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 584;BA.debugLine="Template.SetTag(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 585;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 586;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settemplate(RemoteObject __ref,RemoteObject _tmp) throws Exception{
try {
		Debug.PushSubsStack("SetTemplate (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,200);
if (RapidSub.canDelegate("settemplate")) { return __ref.runUserSub(false, "vuecomponent","settemplate", __ref, _tmp);}
Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 200;BA.debugLine="Sub SetTemplate(tmp As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 201;BA.debugLine="Template.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 202;BA.debugLine="Template.SetText(tmp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_tmp));
 BA.debugLineNum = 203;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 204;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settext(RemoteObject __ref,RemoteObject _txt) throws Exception{
try {
		Debug.PushSubsStack("SetText (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,669);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vuecomponent","settext", __ref, _txt);}
Debug.locals.put("txt", _txt);
 BA.debugLineNum = 669;BA.debugLine="Sub SetText(txt As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 670;BA.debugLine="Template.settext(txt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_txt));
 BA.debugLineNum = 671;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vuecomponent.__c.getField(true,"True"));
 BA.debugLineNum = 672;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 673;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settextaligncenter(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetTextAlignCenter (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,828);
if (RapidSub.canDelegate("settextaligncenter")) { return __ref.runUserSub(false, "vuecomponent","settextaligncenter", __ref);}
 BA.debugLineNum = 828;BA.debugLine="Sub SetTextAlignCenter As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 829;BA.debugLine="SetStyle(CreateMap(\"text-align\": \"center\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("text-align")),(RemoteObject.createImmutable("center"))}))));
 BA.debugLineNum = 830;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 831;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTo (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,614);
if (RapidSub.canDelegate("setto")) { return __ref.runUserSub(false, "vuecomponent","setto", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 614;BA.debugLine="Sub SetTo(t As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 615;BA.debugLine="Template.SetAttr(\"to\", t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("to")),(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 616;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 617;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settype(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetType (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,713);
if (RapidSub.canDelegate("settype")) { return __ref.runUserSub(false, "vuecomponent","settype", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 713;BA.debugLine="Sub SetType(t As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 714;BA.debugLine="Template.SetType(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settype" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 715;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 716;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setupdated(RemoteObject __ref,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetUpdated (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,280);
if (RapidSub.canDelegate("setupdated")) { return __ref.runUserSub(false, "vuecomponent","setupdated", __ref, _methodname);}
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 280;BA.debugLine="Sub SetUpdated(methodName As String) As VueCompone";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 281;BA.debugLine="methodName = methodName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 282;BA.debugLine="updated = BANano.CallBack(module, methodName, Nul";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_updated" /*RemoteObject*/ ).setObject (__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));
 BA.debugLineNum = 283;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 284;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvalue(RemoteObject __ref,RemoteObject _valuename,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetValue (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,785);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vuecomponent","setvalue", __ref, _valuename, _bind);}
Debug.locals.put("valueName", _valuename);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 785;BA.debugLine="Sub SetValue(valueName As String, bind As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 786;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 787;BA.debugLine="valueName = valueName.tolowercase";
Debug.JustUpdateDeviceLine();
_valuename = _valuename.runMethod(true,"toLowerCase");Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 788;BA.debugLine="SetAttr(CreateMap(\":value\":valueName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":value")),(_valuename)}))));
 }else {
 BA.debugLineNum = 790;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("value")),(_valuename)}))));
 };
 BA.debugLineNum = 792;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 793;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvbind(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVBind (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,754);
if (RapidSub.canDelegate("setvbind")) { return __ref.runUserSub(false, "vuecomponent","setvbind", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 754;BA.debugLine="Sub SetVBind(t As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 755;BA.debugLine="t = t.tolowercase";
Debug.JustUpdateDeviceLine();
_t = _t.runMethod(true,"toLowerCase");Debug.locals.put("t", _t);
 BA.debugLineNum = 756;BA.debugLine="SetAttr(CreateMap(\"v-bind\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-bind")),(_t)}))));
 BA.debugLineNum = 757;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 758;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvcloak(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetVCloak (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,59);
if (RapidSub.canDelegate("setvcloak")) { return __ref.runUserSub(false, "vuecomponent","setvcloak", __ref);}
 BA.debugLineNum = 59;BA.debugLine="Sub SetVCloak As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 60;BA.debugLine="Template.setvcloak";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setvcloak" /*RemoteObject*/ );
 BA.debugLineNum = 61;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 62;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvelse(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVElse (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,739);
if (RapidSub.canDelegate("setvelse")) { return __ref.runUserSub(false, "vuecomponent","setvelse", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 739;BA.debugLine="Sub SetVElse(t As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 740;BA.debugLine="SetAttr(CreateMap(\"v-else\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-else")),_t}))));
 BA.debugLineNum = 741;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 742;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvelseif(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVElseIf (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,744);
if (RapidSub.canDelegate("setvelseif")) { return __ref.runUserSub(false, "vuecomponent","setvelseif", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 744;BA.debugLine="Sub SetVElseIf(t As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 745;BA.debugLine="SetAttr(CreateMap(\"v-else-if\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-else-if")),_t}))));
 BA.debugLineNum = 746;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 747;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setverticalalignmiddle(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetVerticalAlignMiddle (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,629);
if (RapidSub.canDelegate("setverticalalignmiddle")) { return __ref.runUserSub(false, "vuecomponent","setverticalalignmiddle", __ref);}
 BA.debugLineNum = 629;BA.debugLine="Sub SetVerticalAlignMiddle As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 630;BA.debugLine="SetStyle(CreateMap(\"vertical-align\": \"middle\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("vertical-align")),(RemoteObject.createImmutable("middle"))}))));
 BA.debugLineNum = 631;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 632;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVFor (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,773);
if (RapidSub.canDelegate("setvfor")) { return __ref.runUserSub(false, "vuecomponent","setvfor", __ref, _item, _datasource);}
RemoteObject _sline = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
Debug.locals.put("dataSource", _datasource);
 BA.debugLineNum = 773;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 774;BA.debugLine="dataSource = dataSource.tolowercase";
Debug.JustUpdateDeviceLine();
_datasource = _datasource.runMethod(true,"toLowerCase");Debug.locals.put("dataSource", _datasource);
 BA.debugLineNum = 775;BA.debugLine="item = item.tolowercase";
Debug.JustUpdateDeviceLine();
_item = _item.runMethod(true,"toLowerCase");Debug.locals.put("item", _item);
 BA.debugLineNum = 776;BA.debugLine="If StateExists(dataSource) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.vuecomponent.class, "_stateexists" /*RemoteObject*/ ,(Object)(_datasource)),vuecomponent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 777;BA.debugLine="Log(\"VueComponent.SetVFor: The data source state";
Debug.JustUpdateDeviceLine();
vuecomponent.__c.runVoidMethod ("Log",(Object)(RemoteObject.createImmutable("VueComponent.SetVFor: The data source state has not been registered, register it first!")));
 };
 BA.debugLineNum = 779;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
Debug.JustUpdateDeviceLine();
_sline = (RemoteObject.concat(RemoteObject.createImmutable(""),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item))),RemoteObject.createImmutable(" in "),vuecomponent.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datasource))),RemoteObject.createImmutable("")));Debug.locals.put("sline", _sline);Debug.locals.put("sline", _sline);
 BA.debugLineNum = 780;BA.debugLine="SetAttr(CreateMap(\"v-for\": sline))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-for")),(_sline)}))));
 BA.debugLineNum = 781;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 782;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvhtml(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetVHtml (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,795);
if (RapidSub.canDelegate("setvhtml")) { return __ref.runUserSub(false, "vuecomponent","setvhtml", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 795;BA.debugLine="Sub SetVHtml(h As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 796;BA.debugLine="If h = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_h,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 797;BA.debugLine="h = h.tolowercase";
Debug.JustUpdateDeviceLine();
_h = _h.runMethod(true,"toLowerCase");Debug.locals.put("h", _h);
 BA.debugLineNum = 798;BA.debugLine="SetAttr(CreateMap(\"v-html\": h))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-html")),(_h)}))));
 BA.debugLineNum = 799;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 800;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVIf (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,647);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vuecomponent","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 647;BA.debugLine="Sub SetVIf(vif As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 648;BA.debugLine="vif = vif.ToLowerCase";
Debug.JustUpdateDeviceLine();
_vif = _vif.runMethod(true,"toLowerCase");Debug.locals.put("vif", _vif);
 BA.debugLineNum = 649;BA.debugLine="If HasState(vif) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.vuecomponent.class, "_hasstate" /*RemoteObject*/ ,(Object)(_vif)),vuecomponent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 650;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
vuecomponent._opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vuecomponent._opt = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));__ref.setField("_opt",vuecomponent._opt);
 BA.debugLineNum = 651;BA.debugLine="opt.Put(vif, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vif)),(Object)((vuecomponent.__c.getField(true,"False"))));
 BA.debugLineNum = 652;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_opt" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 654;BA.debugLine="SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setvif" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 655;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 656;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,567);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vuecomponent","setvmodel", __ref, _k);}
Debug.locals.put("k", _k);
 BA.debugLineNum = 567;BA.debugLine="Sub SetVModel(k As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 568;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 569;BA.debugLine="If HasState(k) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.vuecomponent.class, "_hasstate" /*RemoteObject*/ ,(Object)(_k)),vuecomponent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 570;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
vuecomponent._opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vuecomponent._opt = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));__ref.setField("_opt",vuecomponent._opt);
 BA.debugLineNum = 571;BA.debugLine="opt.Put(k, Null)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)(vuecomponent.__c.getField(false,"Null")));
 BA.debugLineNum = 572;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_opt" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 574;BA.debugLine="Template.SetAttr(\"v-model\", k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-model")),(Object)(_k));
 BA.debugLineNum = 575;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 576;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvon(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVOn (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,749);
if (RapidSub.canDelegate("setvon")) { return __ref.runUserSub(false, "vuecomponent","setvon", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 749;BA.debugLine="Sub SetVOn(t As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 750;BA.debugLine="SetAttr(CreateMap(\"v-on\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on")),_t}))));
 BA.debugLineNum = 751;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 752;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvonce(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVOnce (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,767);
if (RapidSub.canDelegate("setvonce")) { return __ref.runUserSub(false, "vuecomponent","setvonce", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 767;BA.debugLine="Sub SetVOnce(t As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 768;BA.debugLine="SetAttr(CreateMap(\"v-once\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-once")),_t}))));
 BA.debugLineNum = 769;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 770;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,658);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vuecomponent","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 658;BA.debugLine="Sub SetVShow(vif As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 659;BA.debugLine="vif = vif.ToLowerCase";
Debug.JustUpdateDeviceLine();
_vif = _vif.runMethod(true,"toLowerCase");Debug.locals.put("vif", _vif);
 BA.debugLineNum = 660;BA.debugLine="If HasState(vif) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.runClassMethod (b4j.example.vuecomponent.class, "_hasstate" /*RemoteObject*/ ,(Object)(_vif)),vuecomponent.__c.getField(true,"False"))) { 
 BA.debugLineNum = 661;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
vuecomponent._opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vuecomponent._opt = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));__ref.setField("_opt",vuecomponent._opt);
 BA.debugLineNum = 662;BA.debugLine="opt.Put(vif, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_vif)),(Object)((vuecomponent.__c.getField(true,"False"))));
 BA.debugLineNum = 663;BA.debugLine="SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstate" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_opt" /*RemoteObject*/ )));
 };
 BA.debugLineNum = 665;BA.debugLine="SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setvshow" /*RemoteObject*/ ,(Object)(_vif));
 BA.debugLineNum = 666;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 667;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvtext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVText (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,734);
if (RapidSub.canDelegate("setvtext")) { return __ref.runUserSub(false, "vuecomponent","setvtext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 734;BA.debugLine="Sub SetVText(t As Object) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 735;BA.debugLine="SetAttr(CreateMap(\"v-text\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setattr" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-text")),_t}))));
 BA.debugLineNum = 736;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 737;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwatch(RemoteObject __ref,RemoteObject _k,RemoteObject _bimmediate,RemoteObject _bdeep,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetWatch (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,365);
if (RapidSub.canDelegate("setwatch")) { return __ref.runUserSub(false, "vuecomponent","setwatch", __ref, _k, _bimmediate, _bdeep, _methodname);}
RemoteObject _newval = RemoteObject.declareNull("Object");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
RemoteObject _deepit = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("k", _k);
Debug.locals.put("bImmediate", _bimmediate);
Debug.locals.put("bDeep", _bdeep);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 365;BA.debugLine="Sub SetWatch(k As String, bImmediate As Boolean, b";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 366;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 367;BA.debugLine="If SubExists(module, methodName) Then";
Debug.JustUpdateDeviceLine();
if (vuecomponent.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname)).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 368;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 369;BA.debugLine="If data.ContainsKey(k) Then";
Debug.JustUpdateDeviceLine();
if (__ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_k))).<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 370;BA.debugLine="SetStateSingle(k, Null)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_k),(Object)(vuecomponent.__c.getField(false,"Null")));
 };
 BA.debugLineNum = 372;BA.debugLine="Dim newVal As Object";
Debug.JustUpdateDeviceLine();
_newval = RemoteObject.createNew ("Object");Debug.locals.put("newVal", _newval);
 BA.debugLineNum = 373;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref.getField(false,"_module" /*RemoteObject*/ )),(Object)(_methodname),(Object)(vuecomponent.__c.runMethod(false, "ArrayToList", (Object)(RemoteObject.createNewArray("Object",new int[] {1},new Object[] {_newval}))))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 374;BA.debugLine="Dim deepit As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_deepit = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_deepit = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("deepit", _deepit);Debug.locals.put("deepit", _deepit);
 BA.debugLineNum = 375;BA.debugLine="deepit.Put(\"handler\", methodName)";
Debug.JustUpdateDeviceLine();
_deepit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("handler"))),(Object)((_methodname)));
 BA.debugLineNum = 376;BA.debugLine="deepit.Put(\"deep\", bDeep)";
Debug.JustUpdateDeviceLine();
_deepit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("deep"))),(Object)((_bdeep)));
 BA.debugLineNum = 377;BA.debugLine="deepit.Put(\"immediate\", bImmediate)";
Debug.JustUpdateDeviceLine();
_deepit.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("immediate"))),(Object)((_bimmediate)));
 BA.debugLineNum = 378;BA.debugLine="watches.Put(k, deepit)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_watches" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_k)),(Object)((_deepit.getObject())));
 BA.debugLineNum = 379;BA.debugLine="methods.Put(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_methods" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)((_methodname)),(Object)((_cb.getObject())));
 };
 BA.debugLineNum = 381;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 382;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setwidth(RemoteObject __ref,RemoteObject _w) throws Exception{
try {
		Debug.PushSubsStack("SetWidth (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,846);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vuecomponent","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 846;BA.debugLine="Sub SetWidth(w As String) As VueComponent";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 847;BA.debugLine="SetStyle(CreateMap(\"width\":w))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstyle" /*RemoteObject*/ ,(Object)(vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),(_w)}))));
 BA.debugLineNum = 848;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 849;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _stateexists(RemoteObject __ref,RemoteObject _statename) throws Exception{
try {
		Debug.PushSubsStack("StateExists (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,184);
if (RapidSub.canDelegate("stateexists")) { return __ref.runUserSub(false, "vuecomponent","stateexists", __ref, _statename);}
Debug.locals.put("stateName", _statename);
 BA.debugLineNum = 184;BA.debugLine="Sub StateExists(stateName As String) As Boolean";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 185;BA.debugLine="stateName = stateName.tolowercase";
Debug.JustUpdateDeviceLine();
_statename = _statename.runMethod(true,"toLowerCase");Debug.locals.put("stateName", _statename);
 BA.debugLineNum = 186;BA.debugLine="Return data.ContainsKey(stateName)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_data" /*RemoteObject*/ ).runMethod(true,"ContainsKey",(Object)((_statename)));
 BA.debugLineNum = 187;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(false);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _templatefromproperty(RemoteObject __ref,RemoteObject _propname) throws Exception{
try {
		Debug.PushSubsStack("TemplateFromProperty (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,45);
if (RapidSub.canDelegate("templatefromproperty")) { return __ref.runUserSub(false, "vuecomponent","templatefromproperty", __ref, _propname);}
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("propName", _propname);
 BA.debugLineNum = 45;BA.debugLine="Sub TemplateFromProperty(propName As String) As Vu";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 46;BA.debugLine="propName = propName.ToLowerCase";
Debug.JustUpdateDeviceLine();
_propname = _propname.runMethod(true,"toLowerCase");Debug.locals.put("propName", _propname);
 BA.debugLineNum = 47;BA.debugLine="propFrom = propName";
Debug.JustUpdateDeviceLine();
__ref.setField ("_propfrom" /*RemoteObject*/ ,_propname);
 BA.debugLineNum = 48;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(Me, \"Ren";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(__ref),(Object)(BA.ObjectToString("RenderIt")),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), vuecomponent.__c.getField(false,"Null"))));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 49;BA.debugLine="opt.Put(\"render\", cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_opt" /*RemoteObject*/ ).runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("render"))),(Object)((_cb.getObject())));
 BA.debugLineNum = 50;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 51;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _togglestate(RemoteObject __ref,RemoteObject _statename) throws Exception{
try {
		Debug.PushSubsStack("ToggleState (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,174);
if (RapidSub.canDelegate("togglestate")) { return __ref.runUserSub(false, "vuecomponent","togglestate", __ref, _statename);}
RemoteObject _bcurrent = RemoteObject.createImmutable(false);
RemoteObject _optx = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("stateName", _statename);
 BA.debugLineNum = 174;BA.debugLine="Sub ToggleState(stateName As String) As VueCompone";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 175;BA.debugLine="Dim bcurrent As Boolean = GetState(stateName,\"\")";
Debug.JustUpdateDeviceLine();
_bcurrent = BA.ObjectToBoolean(__ref.runClassMethod (b4j.example.vuecomponent.class, "_getstate" /*RemoteObject*/ ,(Object)(_statename),(Object)((RemoteObject.createImmutable("")))));Debug.locals.put("bcurrent", _bcurrent);Debug.locals.put("bcurrent", _bcurrent);
 BA.debugLineNum = 176;BA.debugLine="bcurrent = Not(bcurrent)";
Debug.JustUpdateDeviceLine();
_bcurrent = vuecomponent.__c.runMethod(true,"Not",(Object)(_bcurrent));Debug.locals.put("bcurrent", _bcurrent);
 BA.debugLineNum = 177;BA.debugLine="Dim optx As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_optx = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_optx = vuecomponent.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("optx", _optx);Debug.locals.put("optx", _optx);
 BA.debugLineNum = 178;BA.debugLine="optx.Put(stateName, bcurrent)";
Debug.JustUpdateDeviceLine();
_optx.runVoidMethod ("Put",(Object)((_statename)),(Object)((_bcurrent)));
 BA.debugLineNum = 179;BA.debugLine="SetState(optx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vuecomponent.class, "_setstate" /*RemoteObject*/ ,(Object)(_optx));
 BA.debugLineNum = 180;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 181;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("ToString (vuecomponent) ","vuecomponent",108,__ref.getField(false, "ba"),__ref,465);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vuecomponent","tostring", __ref);}
 BA.debugLineNum = 465;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 466;BA.debugLine="Return Template.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_template" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 467;BA.debugLine="End Sub";
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