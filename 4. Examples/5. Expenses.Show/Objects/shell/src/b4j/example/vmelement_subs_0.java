package b4j.example;

import anywheresoftware.b4a.BA;
import anywheresoftware.b4a.pc.*;

public class vmelement_subs_0 {


public static RemoteObject  _addbr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddBR (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,382);
if (RapidSub.canDelegate("addbr")) { return __ref.runUserSub(false, "vmelement","addbr", __ref);}
 BA.debugLineNum = 382;BA.debugLine="Sub AddBR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 383;BA.debugLine="SetText(\"<br>\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("<br>")));
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
public static RemoteObject  _addchild(RemoteObject __ref,RemoteObject _child) throws Exception{
try {
		Debug.PushSubsStack("AddChild (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,419);
if (RapidSub.canDelegate("addchild")) { return __ref.runUserSub(false, "vmelement","addchild", __ref, _child);}
RemoteObject _childhtml = RemoteObject.createImmutable("");
Debug.locals.put("child", _child);
 BA.debugLineNum = 419;BA.debugLine="Sub AddChild(child As VMElement) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 420;BA.debugLine="Dim childHTML As String = child.ToString";
Debug.JustUpdateDeviceLine();
_childhtml = _child.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ );Debug.locals.put("childHTML", _childhtml);Debug.locals.put("childHTML", _childhtml);
 BA.debugLineNum = 421;BA.debugLine="Element.SetText(childHTML)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_childhtml));
 BA.debugLineNum = 422;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmelement.__c.getField(true,"True"));
 BA.debugLineNum = 423;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 424;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddChildren (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,427);
if (RapidSub.canDelegate("addchildren")) { return __ref.runUserSub(false, "vmelement","addchildren", __ref, _children);}
RemoteObject _childx = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("children", _children);
 BA.debugLineNum = 427;BA.debugLine="Sub AddChildren(children As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 428;BA.debugLine="For Each childx As VMElement In children";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _children;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_childx = (group1.runMethod(false,"Get",index1));Debug.locals.put("childx", _childx);
Debug.locals.put("childx", _childx);
 BA.debugLineNum = 429;BA.debugLine="AddChild(childx)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_addchild" /*RemoteObject*/ ,(Object)(_childx));
 }
}Debug.locals.put("childx", _childx);
;
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
public static RemoteObject  _addclass(RemoteObject __ref,RemoteObject _c) throws Exception{
try {
		Debug.PushSubsStack("AddClass (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,392);
if (RapidSub.canDelegate("addclass")) { return __ref.runUserSub(false, "vmelement","addclass", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 392;BA.debugLine="Sub AddClass(c As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 393;BA.debugLine="Element.AddClass(c)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_c));
 BA.debugLineNum = 394;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 395;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("AddElement (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,852);
if (RapidSub.canDelegate("addelement")) { return __ref.runUserSub(false, "vmelement","addelement", __ref, _el);}
Debug.locals.put("el", _el);
 BA.debugLineNum = 852;BA.debugLine="Sub AddElement(el As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 853;BA.debugLine="SetText(el.ToString)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_el.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 854;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addelements(RemoteObject __ref,RemoteObject _lst) throws Exception{
try {
		Debug.PushSubsStack("AddElements (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,846);
if (RapidSub.canDelegate("addelements")) { return __ref.runUserSub(false, "vmelement","addelements", __ref, _lst);}
RemoteObject _li = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("lst", _lst);
 BA.debugLineNum = 846;BA.debugLine="Sub AddElements(lst As List)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 847;BA.debugLine="For Each li As VMElement In lst";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _lst;
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_li = (group1.runMethod(false,"Get",index1));Debug.locals.put("li", _li);
Debug.locals.put("li", _li);
 BA.debugLineNum = 848;BA.debugLine="SetText(li.tostring)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_li.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ )));
 }
}Debug.locals.put("li", _li);
;
 BA.debugLineNum = 850;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addhr(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("AddHR (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,387);
if (RapidSub.canDelegate("addhr")) { return __ref.runUserSub(false, "vmelement","addhr", __ref);}
 BA.debugLineNum = 387;BA.debugLine="Sub AddHR";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 388;BA.debugLine="SetText(\"<hr>\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("<hr>")));
 BA.debugLineNum = 389;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _addstyle(RemoteObject __ref,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("AddStyle (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,1072);
if (RapidSub.canDelegate("addstyle")) { return __ref.runUserSub(false, "vmelement","addstyle", __ref, _prop, _val);}
RemoteObject _m = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 1072;BA.debugLine="Sub AddStyle(prop As String, val As Object) As VME";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1073;BA.debugLine="If val = Null Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("n",_val)) { 
if (true) return (__ref);};
 BA.debugLineNum = 1074;BA.debugLine="Dim m As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_m = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_m = vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("m", _m);Debug.locals.put("m", _m);
 BA.debugLineNum = 1075;BA.debugLine="m.Put(prop, val)";
Debug.JustUpdateDeviceLine();
_m.runVoidMethod ("Put",(Object)((_prop)),(Object)(_val));
 BA.debugLineNum = 1076;BA.debugLine="SetStyle(m)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 1077;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1078;BA.debugLine="End Sub";
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
 //BA.debugLineNum = 3;BA.debugLine="Public Element As VueHTML";
vmelement._element = RemoteObject.createNew ("b4j.example.vuehtml");__ref.setField("_element",vmelement._element);
 //BA.debugLineNum = 4;BA.debugLine="Public ID As String";
vmelement._id = RemoteObject.createImmutable("");__ref.setField("_id",vmelement._id);
 //BA.debugLineNum = 5;BA.debugLine="Private vue As BANanoVue";
vmelement._vue = RemoteObject.createNew ("b4j.example.bananovue");__ref.setField("_vue",vmelement._vue);
 //BA.debugLineNum = 6;BA.debugLine="Private BANano As BANano  'ignore";
vmelement._banano = RemoteObject.createNew ("com.ab.banano.BANano");__ref.setField("_banano",vmelement._banano);
 //BA.debugLineNum = 7;BA.debugLine="Public hasContent As Boolean";
vmelement._hascontent = RemoteObject.createImmutable(false);__ref.setField("_hascontent",vmelement._hascontent);
 //BA.debugLineNum = 8;BA.debugLine="Private rowClass As String = \"row\"";
vmelement._rowclass = BA.ObjectToString("row");__ref.setField("_rowclass",vmelement._rowclass);
 //BA.debugLineNum = 9;BA.debugLine="Private cellClass As String = \"col\"";
vmelement._cellclass = BA.ObjectToString("col");__ref.setField("_cellclass",vmelement._cellclass);
 //BA.debugLineNum = 11;BA.debugLine="Private offClass As Map = CreateMap(\"s\":\"offset-s";
vmelement._offclass = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vmelement._offclass = vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("s")),RemoteObject.createImmutable(("offset-sm-")),RemoteObject.createImmutable(("m")),RemoteObject.createImmutable(("offset-md-")),RemoteObject.createImmutable(("l")),RemoteObject.createImmutable(("offset-lg-")),RemoteObject.createImmutable(("xl")),(RemoteObject.createImmutable("offset-xl-"))}));__ref.setField("_offclass",vmelement._offclass);
 //BA.debugLineNum = 13;BA.debugLine="Private colClass As Map = CreateMap(\"s\": \"col-sm-";
vmelement._colclass = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
vmelement._colclass = vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("s")),RemoteObject.createImmutable(("col-sm-")),RemoteObject.createImmutable(("m")),RemoteObject.createImmutable(("col-md-")),RemoteObject.createImmutable(("l")),RemoteObject.createImmutable(("col-lg-")),RemoteObject.createImmutable(("xl")),(RemoteObject.createImmutable("col-xl-"))}));__ref.setField("_colclass",vmelement._colclass);
 //BA.debugLineNum = 14;BA.debugLine="Private showKey As String";
vmelement._showkey = RemoteObject.createImmutable("");__ref.setField("_showkey",vmelement._showkey);
 //BA.debugLineNum = 15;BA.debugLine="Private disKey As String";
vmelement._diskey = RemoteObject.createImmutable("");__ref.setField("_diskey",vmelement._diskey);
 //BA.debugLineNum = 16;BA.debugLine="Private reqKey As String";
vmelement._reqkey = RemoteObject.createImmutable("");__ref.setField("_reqkey",vmelement._reqkey);
 //BA.debugLineNum = 17;BA.debugLine="Private errKey As String";
vmelement._errkey = RemoteObject.createImmutable("");__ref.setField("_errkey",vmelement._errkey);
 //BA.debugLineNum = 18;BA.debugLine="End Sub";
return RemoteObject.createImmutable("");
}
public static RemoteObject  _clear(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Clear (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,171);
if (RapidSub.canDelegate("clear")) { return __ref.runUserSub(false, "vmelement","clear", __ref);}
 BA.debugLineNum = 171;BA.debugLine="Sub Clear As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 172;BA.debugLine="Element.clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 173;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 174;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _enable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("Enable (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,61);
if (RapidSub.canDelegate("enable")) { return __ref.runUserSub(false, "vmelement","enable", __ref, _b);}
RemoteObject _n = RemoteObject.createImmutable(false);
Debug.locals.put("b", _b);
 BA.debugLineNum = 61;BA.debugLine="Sub Enable(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 62;BA.debugLine="Dim n As Boolean = Not(b)";
Debug.JustUpdateDeviceLine();
_n = vmelement.__c.runMethod(true,"Not",(Object)(_b));Debug.locals.put("n", _n);Debug.locals.put("n", _n);
 BA.debugLineNum = 63;BA.debugLine="vue.SetStateSingle(disKey, n)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_diskey" /*RemoteObject*/ )),(Object)((_n)));
 BA.debugLineNum = 64;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 65;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _hide(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Hide (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,72);
if (RapidSub.canDelegate("hide")) { return __ref.runUserSub(false, "vmelement","hide", __ref);}
 BA.debugLineNum = 72;BA.debugLine="Sub Hide As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 73;BA.debugLine="vue.SetStateSingle(showKey, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_showkey" /*RemoteObject*/ )),(Object)((vmelement.__c.getField(true,"False"))));
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
public static RemoteObject  _initialize(RemoteObject __ref,RemoteObject _ba,RemoteObject _v,RemoteObject _sid) throws Exception{
try {
		Debug.PushSubsStack("Initialize (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,20);
if (RapidSub.canDelegate("initialize")) { return __ref.runUserSub(false, "vmelement","initialize", __ref, _ba, _v, _sid);}
__ref.runVoidMethodAndSync("innerInitializeHelper", _ba);
Debug.locals.put("ba", _ba);
Debug.locals.put("v", _v);
Debug.locals.put("sid", _sid);
 BA.debugLineNum = 20;BA.debugLine="Public Sub Initialize(v As BANanoVue, sid As Strin";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 21;BA.debugLine="ID = sid.ToLowerCase";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,_sid.runMethod(true,"toLowerCase"));
 BA.debugLineNum = 22;BA.debugLine="ID = ID.trim";
Debug.JustUpdateDeviceLine();
__ref.setField ("_id" /*RemoteObject*/ ,__ref.getField(true,"_id" /*RemoteObject*/ ).runMethod(true,"trim"));
 BA.debugLineNum = 23;BA.debugLine="Element.Initialize(ID,\"div\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )),(Object)(RemoteObject.createImmutable("div")));
 BA.debugLineNum = 24;BA.debugLine="vue = v";
Debug.JustUpdateDeviceLine();
__ref.setField ("_vue" /*RemoteObject*/ ,_v);
 BA.debugLineNum = 25;BA.debugLine="hasContent = False";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmelement.__c.getField(true,"False"));
 BA.debugLineNum = 26;BA.debugLine="SetRef(ID)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setref" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_id" /*RemoteObject*/ )));
 BA.debugLineNum = 27;BA.debugLine="showKey = $\"${ID}show\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_showkey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("show"))));
 BA.debugLineNum = 28;BA.debugLine="disKey = $\"${ID}disabled\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_diskey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("disabled"))));
 BA.debugLineNum = 29;BA.debugLine="reqKey = $\"${ID}required\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_reqkey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("required"))));
 BA.debugLineNum = 30;BA.debugLine="errKey = $\"${ID}error\"$";
Debug.JustUpdateDeviceLine();
__ref.setField ("_errkey" /*RemoteObject*/ ,(RemoteObject.concat(RemoteObject.createImmutable(""),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("error"))));
 BA.debugLineNum = 31;BA.debugLine="vue.SetStateSingle(showKey, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_showkey" /*RemoteObject*/ )),(Object)((vmelement.__c.getField(true,"True"))));
 BA.debugLineNum = 32;BA.debugLine="vue.SetStateSingle(disKey, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_diskey" /*RemoteObject*/ )),(Object)((vmelement.__c.getField(true,"False"))));
 BA.debugLineNum = 33;BA.debugLine="vue.SetStateSingle(reqKey, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_reqkey" /*RemoteObject*/ )),(Object)((vmelement.__c.getField(true,"False"))));
 BA.debugLineNum = 34;BA.debugLine="vue.SetStateSingle(errKey, False)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_errkey" /*RemoteObject*/ )),(Object)((vmelement.__c.getField(true,"False"))));
 BA.debugLineNum = 36;BA.debugLine="SetRequired(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setrequired" /*RemoteObject*/ ,(Object)(vmelement.__c.getField(true,"False")));
 BA.debugLineNum = 37;BA.debugLine="SetVShow(showKey)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setvshow" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_showkey" /*RemoteObject*/ )));
 BA.debugLineNum = 38;BA.debugLine="SetDisabled(False)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setdisabled" /*RemoteObject*/ ,(Object)(vmelement.__c.getField(true,"False")));
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
public static RemoteObject  _makepx(RemoteObject __ref,RemoteObject _svalue) throws Exception{
try {
		Debug.PushSubsStack("MakePx (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,94);
if (RapidSub.canDelegate("makepx")) { return __ref.runUserSub(false, "vmelement","makepx", __ref, _svalue);}
Debug.locals.put("sValue", _svalue);
 BA.debugLineNum = 94;BA.debugLine="Sub MakePx(sValue As String) As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 95;BA.debugLine="Return Element.MakePx(sValue)";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_makepx" /*RemoteObject*/ ,(Object)(_svalue));
 BA.debugLineNum = 96;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,879);
if (RapidSub.canDelegate("pop")) { return __ref.runUserSub(false, "vmelement","pop", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 879;BA.debugLine="Sub Pop(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 880;BA.debugLine="p.Element.AddElement(Element)";
Debug.JustUpdateDeviceLine();
_p.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addelement" /*RemoteObject*/ ,(Object)(__ref.getField(false,"_element" /*RemoteObject*/ )));
 BA.debugLineNum = 881;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmelement.__c.getField(true,"True"));
 BA.debugLineNum = 882;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _pop1(RemoteObject __ref,RemoteObject _p) throws Exception{
try {
		Debug.PushSubsStack("Pop1 (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,403);
if (RapidSub.canDelegate("pop1")) { return __ref.runUserSub(false, "vmelement","pop1", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 403;BA.debugLine="Sub Pop1(p As VMElement)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 404;BA.debugLine="p.AddChild(Me)";
Debug.JustUpdateDeviceLine();
_p.runClassMethod (b4j.example.vmelement.class, "_addchild" /*RemoteObject*/ ,(Object)((__ref)));
 BA.debugLineNum = 405;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeattr(RemoteObject __ref,RemoteObject _sname) throws Exception{
try {
		Debug.PushSubsStack("RemoveAttr (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,350);
if (RapidSub.canDelegate("removeattr")) { return __ref.runUserSub(false, "vmelement","removeattr", __ref, _sname);}
Debug.locals.put("sName", _sname);
 BA.debugLineNum = 350;BA.debugLine="public Sub RemoveAttr(sName As String) As VMElemen";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 351;BA.debugLine="Element.RemoveAttr(sName)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_removeattr" /*RemoteObject*/ ,(Object)(_sname));
 BA.debugLineNum = 352;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 353;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _removeclass(RemoteObject __ref,RemoteObject _classname) throws Exception{
try {
		Debug.PushSubsStack("RemoveClass (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,196);
if (RapidSub.canDelegate("removeclass")) { return __ref.runUserSub(false, "vmelement","removeclass", __ref, _classname);}
Debug.locals.put("className", _classname);
 BA.debugLineNum = 196;BA.debugLine="Sub RemoveClass(className As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 197;BA.debugLine="Element.removeClass(className)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_removeclass" /*RemoteObject*/ ,(Object)(_classname));
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
public static RemoteObject  _render(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Render (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,889);
if (RapidSub.canDelegate("render")) { return __ref.runUserSub(false, "vmelement","render", __ref);}
 BA.debugLineNum = 889;BA.debugLine="Sub Render";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 890;BA.debugLine="vue.SetTemplate(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_settemplate" /*RemoteObject*/ ,(Object)(__ref.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 891;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _render1(RemoteObject __ref,RemoteObject _parent) throws Exception{
try {
		Debug.PushSubsStack("Render1 (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,398);
if (RapidSub.canDelegate("render1")) { return __ref.runUserSub(false, "vmelement","render1", __ref, _parent);}
Debug.locals.put("parent", _parent);
 BA.debugLineNum = 398;BA.debugLine="Sub Render1(parent As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 399;BA.debugLine="BANano.GetElement(parent).Append(ToString)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"GetElement",(Object)(_parent)).runVoidMethod ("Append",(Object)(__ref.runClassMethod (b4j.example.vmelement.class, "_tostring" /*RemoteObject*/ )));
 BA.debugLineNum = 400;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable("");
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _required(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("Required (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,56);
if (RapidSub.canDelegate("required")) { return __ref.runUserSub(false, "vmelement","required", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 56;BA.debugLine="Sub Required(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 57;BA.debugLine="vue.SetStateSingle(reqKey, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_reqkey" /*RemoteObject*/ )),(Object)((_b)));
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
public static RemoteObject  _setaccent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAccent (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,522);
if (RapidSub.canDelegate("setaccent")) { return __ref.runUserSub(false, "vmelement","setaccent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 522;BA.debugLine="Sub SetAccent(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 523;BA.debugLine="Element.AddClass(\"md-accent\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-accent")));
 BA.debugLineNum = 524;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 525;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setactivesync(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("SetActiveSync (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,486);
if (RapidSub.canDelegate("setactivesync")) { return __ref.runUserSub(false, "vmelement","setactivesync", __ref, _a);}
RemoteObject _state = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("a", _a);
 BA.debugLineNum = 486;BA.debugLine="Sub SetActiveSync(a As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 487;BA.debugLine="a = a.tolowercase";
Debug.JustUpdateDeviceLine();
_a = _a.runMethod(true,"toLowerCase");Debug.locals.put("a", _a);
 BA.debugLineNum = 488;BA.debugLine="Element.SetAttr(\":md-active.sync\", a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-active.sync")),(Object)(_a));
 BA.debugLineNum = 489;BA.debugLine="Dim state As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_state = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_state = vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("state", _state);Debug.locals.put("state", _state);
 BA.debugLineNum = 490;BA.debugLine="state.Put(a, False)";
Debug.JustUpdateDeviceLine();
_state.runVoidMethod ("Put",(Object)((_a)),(Object)((vmelement.__c.getField(true,"False"))));
 BA.debugLineNum = 491;BA.debugLine="vue.SetState(state)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_state));
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
public static RemoteObject  _setalt(RemoteObject __ref,RemoteObject _a) throws Exception{
try {
		Debug.PushSubsStack("SetAlt (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,623);
if (RapidSub.canDelegate("setalt")) { return __ref.runUserSub(false, "vmelement","setalt", __ref, _a);}
Debug.locals.put("a", _a);
 BA.debugLineNum = 623;BA.debugLine="Sub SetAlt(a As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 624;BA.debugLine="Element.SetAlt(a)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setalt" /*RemoteObject*/ ,(Object)(_a));
 BA.debugLineNum = 625;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 626;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setappcontent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetAppContent (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,604);
if (RapidSub.canDelegate("setappcontent")) { return __ref.runUserSub(false, "vmelement","setappcontent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 604;BA.debugLine="Sub SetAppContent(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 605;BA.debugLine="Element.SetTag(\"md-app-content\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-app-content")));
 BA.debugLineNum = 606;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 607;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetAttr (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,548);
if (RapidSub.canDelegate("setattr")) { return __ref.runUserSub(false, "vmelement","setattr", __ref, _m);}
RemoteObject _k = RemoteObject.createImmutable("");
RemoteObject _v = RemoteObject.declareNull("Object");
Debug.locals.put("m", _m);
 BA.debugLineNum = 548;BA.debugLine="Sub SetAttr(m As Map) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 549;BA.debugLine="For Each k As String In m.Keys";
Debug.JustUpdateDeviceLine();
{
final RemoteObject group1 = _m.runMethod(false,"Keys");
final int groupLen1 = group1.runMethod(true,"getSize").<Integer>get()
;int index1 = 0;
;
for (; index1 < groupLen1;index1++){
_k = BA.ObjectToString(group1.runMethod(false,"Get",index1));Debug.locals.put("k", _k);
Debug.locals.put("k", _k);
 BA.debugLineNum = 550;BA.debugLine="Dim v As Object = m.Get(k)";
Debug.JustUpdateDeviceLine();
_v = _m.runMethod(false,"Get",(Object)((_k)));Debug.locals.put("v", _v);Debug.locals.put("v", _v);
 BA.debugLineNum = 551;BA.debugLine="Element.SetAttr(k, v)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(_k),(Object)(BA.ObjectToString(_v)));
 }
}Debug.locals.put("k", _k);
;
 BA.debugLineNum = 553;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 554;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattr1(RemoteObject __ref,RemoteObject _attr,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetAttr1 (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,87);
if (RapidSub.canDelegate("setattr1")) { return __ref.runUserSub(false, "vmelement","setattr1", __ref, _attr, _val);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("attr", _attr);
Debug.locals.put("val", _val);
 BA.debugLineNum = 87;BA.debugLine="Sub SetAttr1(attr As String, val As Object) As VME";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 88;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 89;BA.debugLine="opt.Put(attr, val)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((_attr)),(Object)(_val));
 BA.debugLineNum = 90;BA.debugLine="SetAttr(opt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_opt));
 BA.debugLineNum = 91;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 92;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setattrsingle(RemoteObject __ref,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetAttrSingle (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,49);
if (RapidSub.canDelegate("setattrsingle")) { return __ref.runUserSub(false, "vmelement","setattrsingle", __ref, _prop, _val);}
RemoteObject _attr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 49;BA.debugLine="Sub SetAttrSingle(prop As String, val As Object) A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 50;BA.debugLine="Dim attr As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_attr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_attr = vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("attr", _attr);Debug.locals.put("attr", _attr);
 BA.debugLineNum = 51;BA.debugLine="attr.Put(prop, val)";
Debug.JustUpdateDeviceLine();
_attr.runVoidMethod ("Put",(Object)((_prop)),(Object)(_val));
 BA.debugLineNum = 52;BA.debugLine="SetAttr(attr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(_attr));
 BA.debugLineNum = 53;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 54;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setautocomplete(RemoteObject __ref,RemoteObject _auto) throws Exception{
try {
		Debug.PushSubsStack("SetAutoComplete (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,327);
if (RapidSub.canDelegate("setautocomplete")) { return __ref.runUserSub(false, "vmelement","setautocomplete", __ref, _auto);}
Debug.locals.put("auto", _auto);
 BA.debugLineNum = 327;BA.debugLine="Sub SetAutoComplete(auto As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 328;BA.debugLine="SetAttr(CreateMap(\"autocomplete\": auto))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("autocomplete")),(_auto)}))));
 BA.debugLineNum = 329;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 330;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBackgroundColor (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,434);
if (RapidSub.canDelegate("setbackgroundcolor")) { return __ref.runUserSub(false, "vmelement","setbackgroundcolor", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 434;BA.debugLine="Sub SetBackgroundColor(p As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 435;BA.debugLine="SetStyle(CreateMap(\"background-color\":p))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("background-color")),_p}))));
 BA.debugLineNum = 436;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 437;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbackgroundimage(RemoteObject __ref,RemoteObject _url) throws Exception{
try {
		Debug.PushSubsStack("SetBackgroundImage (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,561);
if (RapidSub.canDelegate("setbackgroundimage")) { return __ref.runUserSub(false, "vmelement","setbackgroundimage", __ref, _url);}
Debug.locals.put("url", _url);
 BA.debugLineNum = 561;BA.debugLine="Sub SetBackgroundImage(url As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 562;BA.debugLine="Element.SetStyle(\"background-image\", $\"url('${url";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-image")),(Object)((RemoteObject.concat(RemoteObject.createImmutable("url('"),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_url))),RemoteObject.createImmutable("')")))));
 BA.debugLineNum = 563;BA.debugLine="Element.SetStyle(\"background-size\", \"100% 100%\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("background-size")),(Object)(RemoteObject.createImmutable("100% 100%")));
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
public static RemoteObject  _setbody1(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBody1 (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,710);
if (RapidSub.canDelegate("setbody1")) { return __ref.runUserSub(false, "vmelement","setbody1", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 710;BA.debugLine="Sub SetBody1(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 711;BA.debugLine="Element.AddClass(\"md-body-1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-body-1")));
 BA.debugLineNum = 712;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 713;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setbody2(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetBody2 (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,703);
if (RapidSub.canDelegate("setbody2")) { return __ref.runUserSub(false, "vmelement","setbody2", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 703;BA.debugLine="Sub SetBody2(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 704;BA.debugLine="Element.AddClass(\"md-body-2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-body-2")));
 BA.debugLineNum = 705;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 706;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetBorder (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,145);
if (RapidSub.canDelegate("setborder")) { return __ref.runUserSub(false, "vmelement","setborder", __ref, _width, _color, _bstyle);}
RemoteObject _b = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("width", _width);
Debug.locals.put("color", _color);
Debug.locals.put("bstyle", _bstyle);
 BA.debugLineNum = 145;BA.debugLine="Sub SetBorder(width As String, color As String, bs";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 146;BA.debugLine="Dim b As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_b = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_b = vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("b", _b);Debug.locals.put("b", _b);
 BA.debugLineNum = 147;BA.debugLine="b.Put(\"border-style\", bstyle)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border-style"))),(Object)((_bstyle)));
 BA.debugLineNum = 148;BA.debugLine="b.Put(\"border-width\", width)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border-width"))),(Object)((_width)));
 BA.debugLineNum = 149;BA.debugLine="b.Put(\"border-color\", color)";
Debug.JustUpdateDeviceLine();
_b.runVoidMethod ("Put",(Object)(RemoteObject.createImmutable(("border-color"))),(Object)((_color)));
 BA.debugLineNum = 150;BA.debugLine="SetStyle(b)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_b));
 BA.debugLineNum = 151;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 152;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcaption(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetCaption (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,717);
if (RapidSub.canDelegate("setcaption")) { return __ref.runUserSub(false, "vmelement","setcaption", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 717;BA.debugLine="Sub SetCaption(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 718;BA.debugLine="Element.AddClass(\"md-caption\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-caption")));
 BA.debugLineNum = 719;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 720;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetColor (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,408);
if (RapidSub.canDelegate("setcolor")) { return __ref.runUserSub(false, "vmelement","setcolor", __ref, _c);}
Debug.locals.put("c", _c);
 BA.debugLineNum = 408;BA.debugLine="Sub SetColor(c As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 409;BA.debugLine="SetStyle(CreateMap(\"color\": c))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("color")),_c}))));
 BA.debugLineNum = 410;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 411;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetCursorMove (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,155);
if (RapidSub.canDelegate("setcursormove")) { return __ref.runUserSub(false, "vmelement","setcursormove", __ref);}
 BA.debugLineNum = 155;BA.debugLine="Sub SetCursorMove As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 156;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"move\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("cursor")),(RemoteObject.createImmutable("move"))}))));
 BA.debugLineNum = 157;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 158;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setcursorpointer(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetCursorPointer (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,160);
if (RapidSub.canDelegate("setcursorpointer")) { return __ref.runUserSub(false, "vmelement","setcursorpointer", __ref);}
 BA.debugLineNum = 160;BA.debugLine="Sub SetCursorPointer As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 161;BA.debugLine="SetStyle(CreateMap(\"cursor\": \"pointer\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("cursor")),(RemoteObject.createImmutable("pointer"))}))));
 BA.debugLineNum = 162;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 163;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDense (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,500);
if (RapidSub.canDelegate("setdense")) { return __ref.runUserSub(false, "vmelement","setdense", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 500;BA.debugLine="Sub SetDense(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 501;BA.debugLine="Element.AddClass(\"md-dense\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dense")));
 BA.debugLineNum = 502;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 503;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDisabled (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,510);
if (RapidSub.canDelegate("setdisabled")) { return __ref.runUserSub(false, "vmelement","setdisabled", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 510;BA.debugLine="Sub SetDisabled(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 511;BA.debugLine="vue.SetStatesingle(disKey, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_diskey" /*RemoteObject*/ )),(Object)((_b)));
 BA.debugLineNum = 512;BA.debugLine="Element.SetAttr(\":disabled\", disKey)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":disabled")),(Object)(__ref.getField(true,"_diskey" /*RemoteObject*/ )));
 BA.debugLineNum = 513;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 514;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisplay1(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisplay1 (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,587);
if (RapidSub.canDelegate("setdisplay1")) { return __ref.runUserSub(false, "vmelement","setdisplay1", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 587;BA.debugLine="Sub SetDisplay1(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 588;BA.debugLine="Element.AddClass(\"md-display-1\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-display-1")));
 BA.debugLineNum = 589;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 590;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisplay2(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisplay2 (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,582);
if (RapidSub.canDelegate("setdisplay2")) { return __ref.runUserSub(false, "vmelement","setdisplay2", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 582;BA.debugLine="Sub SetDisplay2(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 583;BA.debugLine="Element.AddClass(\"md-display-2\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-display-2")));
 BA.debugLineNum = 584;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 585;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisplay3(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisplay3 (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,577);
if (RapidSub.canDelegate("setdisplay3")) { return __ref.runUserSub(false, "vmelement","setdisplay3", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 577;BA.debugLine="Sub SetDisplay3(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 578;BA.debugLine="Element.AddClass(\"md-display-3\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-display-3")));
 BA.debugLineNum = 579;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 580;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdisplay4(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDisplay4 (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,572);
if (RapidSub.canDelegate("setdisplay4")) { return __ref.runUserSub(false, "vmelement","setdisplay4", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 572;BA.debugLine="Sub SetDisplay4(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 573;BA.debugLine="Element.AddClass(\"md-display-4\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-display-4")));
 BA.debugLineNum = 574;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 575;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetDoubleLine (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,455);
if (RapidSub.canDelegate("setdoubleline")) { return __ref.runUserSub(false, "vmelement","setdoubleline", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 455;BA.debugLine="Sub SetDoubleLine(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 456;BA.debugLine="Element.AddClass(\"md-double-line\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-double-line")));
 BA.debugLineNum = 457;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 458;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setdraggable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDraggable (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,123);
if (RapidSub.canDelegate("setdraggable")) { return __ref.runUserSub(false, "vmelement","setdraggable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 123;BA.debugLine="Sub SetDraggable(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 124;BA.debugLine="SetAttr(CreateMap(\":draggable\":b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":draggable")),(_b)}))));
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
public static RemoteObject  _setdroppable(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetDroppable (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,128);
if (RapidSub.canDelegate("setdroppable")) { return __ref.runUserSub(false, "vmelement","setdroppable", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 128;BA.debugLine="Sub SetDroppable(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 129;BA.debugLine="SetAttr(CreateMap(\":droppable\":b))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":droppable")),(_b)}))));
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
public static RemoteObject  _setelevation(RemoteObject __ref,RemoteObject _e) throws Exception{
try {
		Debug.PushSubsStack("SetElevation (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,673);
if (RapidSub.canDelegate("setelevation")) { return __ref.runUserSub(false, "vmelement","setelevation", __ref, _e);}
Debug.locals.put("e", _e);
 BA.debugLineNum = 673;BA.debugLine="Sub SetElevation(e As Int) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 674;BA.debugLine="Element.addclass($\"md-elevation-${e}\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("md-elevation-"),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_e))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 675;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 676;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seterrortext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetErrorText (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,814);
if (RapidSub.canDelegate("seterrortext")) { return __ref.runUserSub(false, "vmelement","seterrortext", __ref, _t);}
RemoteObject _errorshow = RemoteObject.createImmutable("");
RemoteObject _he = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("t", _t);
 BA.debugLineNum = 814;BA.debugLine="Sub SetErrorText(t As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 815;BA.debugLine="Dim errorShow As String = $\"${ID}error\"$";
Debug.JustUpdateDeviceLine();
_errorshow = (RemoteObject.concat(RemoteObject.createImmutable(""),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("error")));Debug.locals.put("errorShow", _errorshow);Debug.locals.put("errorShow", _errorshow);
 BA.debugLineNum = 816;BA.debugLine="Dim he As VMElement";
Debug.JustUpdateDeviceLine();
_he = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("he", _he);
 BA.debugLineNum = 817;BA.debugLine="he.Initialize(vue,$\"${ID}err\"$).SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
_he.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("err"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 818;BA.debugLine="he.AddClass(\"md-error\")";
Debug.JustUpdateDeviceLine();
_he.runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-error")));
 BA.debugLineNum = 819;BA.debugLine="he.SetText(t)";
Debug.JustUpdateDeviceLine();
_he.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 820;BA.debugLine="Return he";
Debug.JustUpdateDeviceLine();
if (true) return _he;
 BA.debugLineNum = 821;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setexact(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetExact (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,201);
if (RapidSub.canDelegate("setexact")) { return __ref.runUserSub(false, "vmelement","setexact", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 201;BA.debugLine="Sub SetExact(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 202;BA.debugLine="If b Then SetAttr(CreateMap(\"exact\": b))";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("exact")),(_b)}))));};
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
public static RemoteObject  _setfor(RemoteObject __ref,RemoteObject _f) throws Exception{
try {
		Debug.PushSubsStack("SetFor (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,98);
if (RapidSub.canDelegate("setfor")) { return __ref.runUserSub(false, "vmelement","setfor", __ref, _f);}
Debug.locals.put("f", _f);
 BA.debugLineNum = 98;BA.debugLine="Sub SetFor(f As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 99;BA.debugLine="Element.SetAttr(\"for\", f)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("for")),(Object)(_f));
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
public static RemoteObject  _setgutter(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetGutter (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,862);
if (RapidSub.canDelegate("setgutter")) { return __ref.runUserSub(false, "vmelement","setgutter", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 862;BA.debugLine="Sub SetGutter(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 863;BA.debugLine="Element.AddClass(\"md-gutter\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-gutter")));
 BA.debugLineNum = 864;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 865;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setheadline(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetHeadline (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,593);
if (RapidSub.canDelegate("setheadline")) { return __ref.runUserSub(false, "vmelement","setheadline", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 593;BA.debugLine="Sub SetHeadline(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 594;BA.debugLine="Element.AddClass(\"md-headline\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-headline")));
 BA.debugLineNum = 595;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 596;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetHeight (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,139);
if (RapidSub.canDelegate("setheight")) { return __ref.runUserSub(false, "vmelement","setheight", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 139;BA.debugLine="Sub SetHeight(h As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 140;BA.debugLine="SetStyle(CreateMap(\"height\":h))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("height")),(_h)}))));
 BA.debugLineNum = 141;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 142;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethelpertext(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetHelperText (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,806);
if (RapidSub.canDelegate("sethelpertext")) { return __ref.runUserSub(false, "vmelement","sethelpertext", __ref, _t);}
RemoteObject _ht = RemoteObject.declareNull("b4j.example.vmelement");
Debug.locals.put("t", _t);
 BA.debugLineNum = 806;BA.debugLine="Sub SetHelperText(t As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 807;BA.debugLine="Dim ht As VMElement";
Debug.JustUpdateDeviceLine();
_ht = RemoteObject.createNew ("b4j.example.vmelement");Debug.locals.put("ht", _ht);
 BA.debugLineNum = 808;BA.debugLine="ht.Initialize(vue,$\"${ID}hlp\"$).SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
_ht.runClassMethod (b4j.example.vmelement.class, "_initialize" /*RemoteObject*/ ,__ref.getField(false, "ba"),(Object)(__ref.getField(false,"_vue" /*RemoteObject*/ )),(Object)((RemoteObject.concat(RemoteObject.createImmutable(""),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((__ref.getField(true,"_id" /*RemoteObject*/ )))),RemoteObject.createImmutable("hlp"))))).runClassMethod (b4j.example.vmelement.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 809;BA.debugLine="ht.AddClass(\"md-helper-text\")";
Debug.JustUpdateDeviceLine();
_ht.runClassMethod (b4j.example.vmelement.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-helper-text")));
 BA.debugLineNum = 810;BA.debugLine="ht.SetText(t)";
Debug.JustUpdateDeviceLine();
_ht.runClassMethod (b4j.example.vmelement.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 811;BA.debugLine="Return ht";
Debug.JustUpdateDeviceLine();
if (true) return _ht;
 BA.debugLineNum = 812;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _sethidden(RemoteObject __ref,RemoteObject _xsmall,RemoteObject _small,RemoteObject _medium,RemoteObject _large,RemoteObject _xlarge) throws Exception{
try {
		Debug.PushSubsStack("SetHidden (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,723);
if (RapidSub.canDelegate("sethidden")) { return __ref.runUserSub(false, "vmelement","sethidden", __ref, _xsmall, _small, _medium, _large, _xlarge);}
RemoteObject _sizes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _strsizes = RemoteObject.createImmutable("");
Debug.locals.put("xsmall", _xsmall);
Debug.locals.put("small", _small);
Debug.locals.put("medium", _medium);
Debug.locals.put("large", _large);
Debug.locals.put("xlarge", _xlarge);
 BA.debugLineNum = 723;BA.debugLine="Sub SetHidden(xsmall As Boolean, small As Boolean,";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 724;BA.debugLine="Dim sizes As List";
Debug.JustUpdateDeviceLine();
_sizes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sizes", _sizes);
 BA.debugLineNum = 725;BA.debugLine="sizes.Initialize";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Initialize");
 BA.debugLineNum = 727;BA.debugLine="If xsmall Then";
Debug.JustUpdateDeviceLine();
if (_xsmall.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 728;BA.debugLine="sizes.Add($\"md-xsmall-hide\"$)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)(((RemoteObject.createImmutable("md-xsmall-hide")))));
 };
 BA.debugLineNum = 731;BA.debugLine="If small Then";
Debug.JustUpdateDeviceLine();
if (_small.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 732;BA.debugLine="sizes.Add($\"md-small-hide\"$)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)(((RemoteObject.createImmutable("md-small-hide")))));
 };
 BA.debugLineNum = 735;BA.debugLine="If medium Then";
Debug.JustUpdateDeviceLine();
if (_medium.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 736;BA.debugLine="sizes.Add($\"md-medium-hide\"$)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)(((RemoteObject.createImmutable("md-medium-hide")))));
 };
 BA.debugLineNum = 739;BA.debugLine="If large Then";
Debug.JustUpdateDeviceLine();
if (_large.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 740;BA.debugLine="sizes.Add($\"md-large-hide\"$)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)(((RemoteObject.createImmutable("md-large-hide")))));
 };
 BA.debugLineNum = 743;BA.debugLine="If xlarge Then";
Debug.JustUpdateDeviceLine();
if (_xlarge.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 744;BA.debugLine="sizes.Add($\"md-xlarge-hide\"$)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)(((RemoteObject.createImmutable("md-xlarge-hide")))));
 };
 BA.debugLineNum = 747;BA.debugLine="Dim strSizes As String = Element.join(\" \", sizes)";
Debug.JustUpdateDeviceLine();
_strsizes = __ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_join" /*RemoteObject*/ ,(Object)(BA.ObjectToString(" ")),(Object)(_sizes));Debug.locals.put("strSizes", _strsizes);Debug.locals.put("strSizes", _strsizes);
 BA.debugLineNum = 748;BA.debugLine="Element.AddClass(strSizes)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_strsizes));
 BA.debugLineNum = 749;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 750;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetHREF (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,505);
if (RapidSub.canDelegate("sethref")) { return __ref.runUserSub(false, "vmelement","sethref", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 505;BA.debugLine="Sub SetHREF(h As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 506;BA.debugLine="Element.SetAttrHREF(h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattrhref" /*RemoteObject*/ ,(Object)(_h));
 BA.debugLineNum = 507;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 508;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _seticonbutton(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetIconButton (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,643);
if (RapidSub.canDelegate("seticonbutton")) { return __ref.runUserSub(false, "vmelement","seticonbutton", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 643;BA.debugLine="Sub SetIconButton(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 644;BA.debugLine="Element.AddClass(\"md-icon-button\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-icon-button")));
 BA.debugLineNum = 645;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 646;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setid(RemoteObject __ref,RemoteObject _n,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetID (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,355);
if (RapidSub.canDelegate("setid")) { return __ref.runUserSub(false, "vmelement","setid", __ref, _n, _bind);}
Debug.locals.put("n", _n);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 355;BA.debugLine="Sub SetID(n As String, bind As Boolean) As VMEleme";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 356;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 357;BA.debugLine="RemoveAttr(\"id\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("id")));
 BA.debugLineNum = 358;BA.debugLine="SetAttr(CreateMap(\":id\": n))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":id")),(_n)}))));
 }else {
 BA.debugLineNum = 360;BA.debugLine="RemoveAttr(\":id\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":id")));
 BA.debugLineNum = 361;BA.debugLine="SetAttr(CreateMap(\"id\": n))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("id")),(_n)}))));
 };
 BA.debugLineNum = 363;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 364;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetInset (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,461);
if (RapidSub.canDelegate("setinset")) { return __ref.runUserSub(false, "vmelement","setinset", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 461;BA.debugLine="Sub SetInset(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 462;BA.debugLine="If b Then Element.AddClass(\"md-inset\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-inset")));};
 BA.debugLineNum = 463;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 464;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetIs (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,237);
if (RapidSub.canDelegate("setis")) { return __ref.runUserSub(false, "vmelement","setis", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 237;BA.debugLine="Sub SetIs(t As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 238;BA.debugLine="t = t.tolowercase";
Debug.JustUpdateDeviceLine();
_t = _t.runMethod(true,"toLowerCase");Debug.locals.put("t", _t);
 BA.debugLineNum = 239;BA.debugLine="SetAttr(CreateMap(\":is\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":is")),(_t)}))));
 BA.debugLineNum = 240;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 241;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetKey (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,226);
if (RapidSub.canDelegate("setkey")) { return __ref.runUserSub(false, "vmelement","setkey", __ref, _k, _bind);}
Debug.locals.put("k", _k);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 226;BA.debugLine="Sub SetKey(k As Object, bind As Boolean) As VMElem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 227;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 228;BA.debugLine="RemoveAttr(\"key\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("key")));
 BA.debugLineNum = 229;BA.debugLine="Element.SetAttr(\":key\", k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":key")),(Object)(BA.ObjectToString(_k)));
 }else {
 BA.debugLineNum = 231;BA.debugLine="RemoveAttr(\":key\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":key")));
 BA.debugLineNum = 232;BA.debugLine="Element.SetAttr(\"key\", k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("key")),(Object)(BA.ObjectToString(_k)));
 };
 BA.debugLineNum = 234;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 235;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlarge(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetLarge (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,537);
if (RapidSub.canDelegate("setlarge")) { return __ref.runUserSub(false, "vmelement","setlarge", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 537;BA.debugLine="Sub SetLarge(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 538;BA.debugLine="Element.AddClass(\"md-large\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-large")));
 BA.debugLineNum = 539;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 540;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlayout(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetLayout (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,867);
if (RapidSub.canDelegate("setlayout")) { return __ref.runUserSub(false, "vmelement","setlayout", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 867;BA.debugLine="Sub SetLayout(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 868;BA.debugLine="Element.AddClass(\"md-layout\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-layout")));
 BA.debugLineNum = 869;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 870;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlayoutcolumn(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetLayoutColumn (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,449);
if (RapidSub.canDelegate("setlayoutcolumn")) { return __ref.runUserSub(false, "vmelement","setlayoutcolumn", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 449;BA.debugLine="Sub SetLayoutColumn(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 450;BA.debugLine="Element.AddClass(\"md-layout-column\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-layout-column")));
 BA.debugLineNum = 451;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 452;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlayoutitem(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetLayoutItem (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,873);
if (RapidSub.canDelegate("setlayoutitem")) { return __ref.runUserSub(false, "vmelement","setlayoutitem", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 873;BA.debugLine="Sub SetLayoutItem(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 874;BA.debugLine="Element.AddClass(\"md-layout-item\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-layout-item")));
 BA.debugLineNum = 875;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 876;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetLineHeight (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,633);
if (RapidSub.canDelegate("setlineheight")) { return __ref.runUserSub(false, "vmelement","setlineheight", __ref, _lh);}
Debug.locals.put("lh", _lh);
 BA.debugLineNum = 633;BA.debugLine="Sub SetLineHeight(lh As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 634;BA.debugLine="SetStyle(CreateMap(\"line-height\": lh))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("line-height")),_lh}))));
 BA.debugLineNum = 635;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 636;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlistaction(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetListAction (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,648);
if (RapidSub.canDelegate("setlistaction")) { return __ref.runUserSub(false, "vmelement","setlistaction", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 648;BA.debugLine="Sub SetListAction(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 649;BA.debugLine="Element.AddClass(\"md-list-action\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-list-action")));
 BA.debugLineNum = 650;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 651;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setlistitemtext(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetListItemText (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,668);
if (RapidSub.canDelegate("setlistitemtext")) { return __ref.runUserSub(false, "vmelement","setlistitemtext", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 668;BA.debugLine="Sub SetListItemText(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 669;BA.debugLine="Element.AddClass(\"md-list-item-text\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-list-item-text")));
 BA.debugLineNum = 670;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 671;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMarginAll (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,439);
if (RapidSub.canDelegate("setmarginall")) { return __ref.runUserSub(false, "vmelement","setmarginall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 439;BA.debugLine="Sub SetMarginAll(p As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 440;BA.debugLine="SetStyle(CreateMap(\"margin\":p))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("margin")),_p}))));
 BA.debugLineNum = 441;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 442;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMargins (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,1063);
if (RapidSub.canDelegate("setmargins")) { return __ref.runUserSub(false, "vmelement","setmargins", __ref, _mt, _mb, _ml, _mr);}
Debug.locals.put("mt", _mt);
Debug.locals.put("mb", _mb);
Debug.locals.put("ml", _ml);
Debug.locals.put("mr", _mr);
 BA.debugLineNum = 1063;BA.debugLine="Sub SetMargins(mt As Object, mb As Object, ml As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1064;BA.debugLine="AddStyle(\"margin-top\", mt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-top")),(Object)(_mt));
 BA.debugLineNum = 1065;BA.debugLine="AddStyle(\"margin-bottom\", mb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-bottom")),(Object)(_mb));
 BA.debugLineNum = 1066;BA.debugLine="AddStyle(\"margin-left\", ml)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-left")),(Object)(_ml));
 BA.debugLineNum = 1067;BA.debugLine="AddStyle(\"margin-right\", mr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("margin-right")),(Object)(_mr));
 BA.debugLineNum = 1068;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1069;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmaxheight(RemoteObject __ref,RemoteObject _mw) throws Exception{
try {
		Debug.PushSubsStack("SetMaxHeight (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,476);
if (RapidSub.canDelegate("setmaxheight")) { return __ref.runUserSub(false, "vmelement","setmaxheight", __ref, _mw);}
Debug.locals.put("mw", _mw);
 BA.debugLineNum = 476;BA.debugLine="Sub SetMaxHeight(mw As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 477;BA.debugLine="Element.SetStyle(\"max-height\",mw)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("max-height")),(Object)(_mw));
 BA.debugLineNum = 478;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 479;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetMaxWidth (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,471);
if (RapidSub.canDelegate("setmaxwidth")) { return __ref.runUserSub(false, "vmelement","setmaxwidth", __ref, _mw);}
Debug.locals.put("mw", _mw);
 BA.debugLineNum = 471;BA.debugLine="Sub SetMaxWidth(mw As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 472;BA.debugLine="Element.SetStyle(\"max-width\",mw)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("max-width")),(Object)(_mw));
 BA.debugLineNum = 473;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 474;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmedium(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetMedium (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,532);
if (RapidSub.canDelegate("setmedium")) { return __ref.runUserSub(false, "vmelement","setmedium", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 532;BA.debugLine="Sub SetMedium(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 533;BA.debugLine="If b Then Element.AddClass(\"md-medium\")";
Debug.JustUpdateDeviceLine();
if (_b.<Boolean>get().booleanValue()) { 
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-medium")));};
 BA.debugLineNum = 534;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 535;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setmethodpost(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetMethodPost (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,118);
if (RapidSub.canDelegate("setmethodpost")) { return __ref.runUserSub(false, "vmelement","setmethodpost", __ref);}
 BA.debugLineNum = 118;BA.debugLine="Sub SetMethodPost As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 119;BA.debugLine="SetAttr(CreateMap(\"method\":\"POST\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("method")),(RemoteObject.createImmutable("POST"))}))));
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
public static RemoteObject  _setname(RemoteObject __ref,RemoteObject _n,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetName (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,339);
if (RapidSub.canDelegate("setname")) { return __ref.runUserSub(false, "vmelement","setname", __ref, _n, _bind);}
Debug.locals.put("n", _n);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 339;BA.debugLine="Sub SetName(n As String, bind As Boolean) As VMEle";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 340;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 341;BA.debugLine="RemoveAttr(\"name\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("name")));
 BA.debugLineNum = 342;BA.debugLine="SetAttr(CreateMap(\":name\": n))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":name")),(_n)}))));
 }else {
 BA.debugLineNum = 344;BA.debugLine="RemoveAttr(\":name\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":name")));
 BA.debugLineNum = 345;BA.debugLine="SetAttr(CreateMap(\"name\": n))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("name")),(_n)}))));
 };
 BA.debugLineNum = 347;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 348;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setnotselectible(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("SetNotSelectible (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,108);
if (RapidSub.canDelegate("setnotselectible")) { return __ref.runUserSub(false, "vmelement","setnotselectible", __ref);}
 BA.debugLineNum = 108;BA.debugLine="Sub SetNotSelectible As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 109;BA.debugLine="Element.AddClass(\"gj-unselectable\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("gj-unselectable")));
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
public static RemoteObject  _setnowrap(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetNoWrap (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,824);
if (RapidSub.canDelegate("setnowrap")) { return __ref.runUserSub(false, "vmelement","setnowrap", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 824;BA.debugLine="Sub SetNoWrap(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 825;BA.debugLine="Element.AddClass(\"md-layout-nowrap\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-layout-nowrap")));
 BA.debugLineNum = 826;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 827;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonblur(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnBlur (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,952);
if (RapidSub.canDelegate("setonblur")) { return __ref.runUserSub(false, "vmelement","setonblur", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 952;BA.debugLine="Sub SetOnBlur(module As Object, methodName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 953;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 954;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 955;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 956;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 957;BA.debugLine="SetAttr(CreateMap(\"v-on:blur\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:blur")),(_methodname)}))));
 BA.debugLineNum = 959;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 960;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 961;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoncancel(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnCancel (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,893);
if (RapidSub.canDelegate("setoncancel")) { return __ref.runUserSub(false, "vmelement","setoncancel", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 893;BA.debugLine="Sub SetOnCancel(module As Object, methodName As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 894;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 895;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 896;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 897;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 898;BA.debugLine="SetAttr(CreateMap(\"@md-cancel\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("@md-cancel")),(_methodname)}))));
 BA.debugLineNum = 900;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 901;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 902;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonchange(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnChange (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,983);
if (RapidSub.canDelegate("setonchange")) { return __ref.runUserSub(false, "vmelement","setonchange", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 983;BA.debugLine="Sub SetOnChange(module As Object, methodName As St";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 984;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 985;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 986;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 987;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 988;BA.debugLine="SetAttr(CreateMap(\"v-on:change\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:change")),(_methodname)}))));
 BA.debugLineNum = 990;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 991;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 992;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonclear(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnClear (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,940);
if (RapidSub.canDelegate("setonclear")) { return __ref.runUserSub(false, "vmelement","setonclear", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 940;BA.debugLine="Sub SetOnClear(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 941;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 942;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 943;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 944;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 945;BA.debugLine="SetAttr(CreateMap(\"v-on:md-clear\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:md-clear")),(_methodname)}))));
 BA.debugLineNum = 947;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 948;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 949;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetOnClick (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,970);
if (RapidSub.canDelegate("setonclick")) { return __ref.runUserSub(false, "vmelement","setonclick", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 970;BA.debugLine="Sub SetOnClick(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 971;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 972;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 973;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 974;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 975;BA.debugLine="SetAttr(CreateMap(\"v-on:click\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:click")),(_methodname)}))));
 BA.debugLineNum = 977;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 978;BA.debugLine="SetPointer(True)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setpointer" /*RemoteObject*/ ,(Object)(vmelement.__c.getField(true,"True")));
 BA.debugLineNum = 979;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 980;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonconfirm(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnConfirm (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,904);
if (RapidSub.canDelegate("setonconfirm")) { return __ref.runUserSub(false, "vmelement","setonconfirm", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 904;BA.debugLine="Sub SetOnConfirm(module As Object, methodName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 905;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 906;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 907;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 908;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 909;BA.debugLine="SetAttr(CreateMap(\"@md-confirm\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("@md-confirm")),(_methodname)}))));
 BA.debugLineNum = 911;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setondragend(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragEnd (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,1029);
if (RapidSub.canDelegate("setondragend")) { return __ref.runUserSub(false, "vmelement","setondragend", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1029;BA.debugLine="Sub SetOnDragEnd(module As Object, methodName As S";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1030;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1031;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 1032;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 1033;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 1034;BA.debugLine="SetAttr(CreateMap(\"v-on:dragend\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:dragend")),(_methodname)}))));
 BA.debugLineNum = 1036;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 1037;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1038;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondragenter(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragEnter (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,1040);
if (RapidSub.canDelegate("setondragenter")) { return __ref.runUserSub(false, "vmelement","setondragenter", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1040;BA.debugLine="Sub SetOnDragEnter(module As Object, methodName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1041;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1042;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 1043;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 1044;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 1045;BA.debugLine="SetAttr(CreateMap(\"v-on:dragenter\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:dragenter")),(_methodname)}))));
 BA.debugLineNum = 1047;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 1048;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1049;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondragover(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragOver (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,1007);
if (RapidSub.canDelegate("setondragover")) { return __ref.runUserSub(false, "vmelement","setondragover", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1007;BA.debugLine="Sub SetOnDragOver(module As Object, methodName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1008;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1009;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 1010;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 1011;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 1012;BA.debugLine="SetAttr(CreateMap(\"v-on:dragover\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:dragover")),(_methodname)}))));
 BA.debugLineNum = 1014;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 1015;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1016;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondragstart(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDragStart (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,1018);
if (RapidSub.canDelegate("setondragstart")) { return __ref.runUserSub(false, "vmelement","setondragstart", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1018;BA.debugLine="Sub SetOnDragStart(module As Object, methodName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1019;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1020;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 1021;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 1022;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 1023;BA.debugLine="SetAttr(CreateMap(\"v-on:dragstart\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:dragstart")),(_methodname)}))));
 BA.debugLineNum = 1025;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 1026;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1027;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setondrop(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnDrop (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,1051);
if (RapidSub.canDelegate("setondrop")) { return __ref.runUserSub(false, "vmelement","setondrop", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1051;BA.debugLine="Sub SetOnDrop(module As Object, methodName As Stri";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1052;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 1053;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 1054;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 1055;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 1056;BA.debugLine="SetAttr(CreateMap(\"v-on:drop\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:drop")),(_methodname)}))));
 BA.debugLineNum = 1058;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 1059;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1060;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setonfocus(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnFocus (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,929);
if (RapidSub.canDelegate("setonfocus")) { return __ref.runUserSub(false, "vmelement","setonfocus", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 929;BA.debugLine="Sub SetOnFocus(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 930;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 931;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 932;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 933;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 934;BA.debugLine="SetAttr(CreateMap(\"v-on:focus\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:focus")),(_methodname)}))));
 BA.debugLineNum = 936;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 937;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 938;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setoninput(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnInput (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,917);
if (RapidSub.canDelegate("setoninput")) { return __ref.runUserSub(false, "vmelement","setoninput", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 917;BA.debugLine="Sub SetOnInput(module As Object, methodName As Str";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 918;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 919;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 920;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 921;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 922;BA.debugLine="SetAttr(CreateMap(\"v-on:input\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:input")),(_methodname)}))));
 BA.debugLineNum = 924;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setonmouseout(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnMouseOut (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,206);
if (RapidSub.canDelegate("setonmouseout")) { return __ref.runUserSub(false, "vmelement","setonmouseout", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 206;BA.debugLine="Sub SetOnMouseOut(module As Object, methodName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 207;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 208;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 209;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseout\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:mouseout")),(_methodname)}))));
 BA.debugLineNum = 210;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 211;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 212;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
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
public static RemoteObject  _setonmouseover(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnMouseOver (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,216);
if (RapidSub.canDelegate("setonmouseover")) { return __ref.runUserSub(false, "vmelement","setonmouseover", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 216;BA.debugLine="Sub SetOnMouseOver(module As Object, methodName As";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 217;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 218;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 219;BA.debugLine="SetAttr(CreateMap(\"v-on:mouseover\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:mouseover")),(_methodname)}))));
 BA.debugLineNum = 220;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 221;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 222;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 223;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 224;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setontouchstart(RemoteObject __ref,RemoteObject _module,RemoteObject _methodname) throws Exception{
try {
		Debug.PushSubsStack("SetOnTouchStart (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,996);
if (RapidSub.canDelegate("setontouchstart")) { return __ref.runUserSub(false, "vmelement","setontouchstart", __ref, _module, _methodname);}
RemoteObject _e = RemoteObject.declareNull("com.ab.banano.BANanoEvent");
RemoteObject _cb = RemoteObject.declareNull("com.ab.banano.BANanoObject");
Debug.locals.put("module", _module);
Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 996;BA.debugLine="Sub SetOnTouchStart(module As Object, methodName A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 997;BA.debugLine="methodName = methodName.tolowercase";
Debug.JustUpdateDeviceLine();
_methodname = _methodname.runMethod(true,"toLowerCase");Debug.locals.put("methodName", _methodname);
 BA.debugLineNum = 998;BA.debugLine="If SubExists(module, methodName) = False Then Ret";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",vmelement.__c.runMethod(true,"SubExists",__ref.getField(false, "ba"),(Object)(_module),(Object)(_methodname)),vmelement.__c.getField(true,"False"))) { 
if (true) return (__ref);};
 BA.debugLineNum = 999;BA.debugLine="Dim e As BANanoEvent";
Debug.JustUpdateDeviceLine();
_e = RemoteObject.createNew ("com.ab.banano.BANanoEvent");Debug.locals.put("e", _e);
 BA.debugLineNum = 1000;BA.debugLine="Dim cb As BANanoObject = BANano.CallBack(module,";
Debug.JustUpdateDeviceLine();
_cb = RemoteObject.createNew ("com.ab.banano.BANanoObject");
_cb.setObject(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(false,"CallBack",(Object)(_module),(Object)(_methodname),RemoteObject.declareNull("anywheresoftware.b4a.AbsObjectWrapper").runMethod(false, "ConvertToWrapper", RemoteObject.createNew("anywheresoftware.b4a.objects.collections.List"), _e)));Debug.locals.put("cb", _cb);
 BA.debugLineNum = 1001;BA.debugLine="SetAttr(CreateMap(\"v-on:touchstart\": methodName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on:touchstart")),(_methodname)}))));
 BA.debugLineNum = 1003;BA.debugLine="vue.SetCallBack(methodName, cb)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setcallback" /*RemoteObject*/ ,(Object)(_methodname),(Object)(_cb));
 BA.debugLineNum = 1004;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1005;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPadding (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,1080);
if (RapidSub.canDelegate("setpadding")) { return __ref.runUserSub(false, "vmelement","setpadding", __ref, _pt, _pb, _pl, _pr);}
Debug.locals.put("pt", _pt);
Debug.locals.put("pb", _pb);
Debug.locals.put("pl", _pl);
Debug.locals.put("pr", _pr);
 BA.debugLineNum = 1080;BA.debugLine="Sub SetPadding(pt As Object, pb As Object, pl As O";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 1081;BA.debugLine="AddStyle(\"padding-top\", pt)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-top")),(Object)(_pt));
 BA.debugLineNum = 1082;BA.debugLine="AddStyle(\"padding-bottom\", pb)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-bottom")),(Object)(_pb));
 BA.debugLineNum = 1083;BA.debugLine="AddStyle(\"padding-left\", pl)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-left")),(Object)(_pl));
 BA.debugLineNum = 1084;BA.debugLine="AddStyle(\"padding-right\", pr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_addstyle" /*RemoteObject*/ ,(Object)(BA.ObjectToString("padding-right")),(Object)(_pr));
 BA.debugLineNum = 1085;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 1086;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPaddingAll (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,444);
if (RapidSub.canDelegate("setpaddingall")) { return __ref.runUserSub(false, "vmelement","setpaddingall", __ref, _p);}
Debug.locals.put("p", _p);
 BA.debugLineNum = 444;BA.debugLine="Sub SetPaddingAll(p As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 445;BA.debugLine="SetStyle(CreateMap(\"padding\":p))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("padding")),_p}))));
 BA.debugLineNum = 446;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 447;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setpermanentfull(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetPermanentFull (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,638);
if (RapidSub.canDelegate("setpermanentfull")) { return __ref.runUserSub(false, "vmelement","setpermanentfull", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 638;BA.debugLine="Sub SetPermanentFull(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 639;BA.debugLine="Element.SetAttr(\"md-permanent\",\"full\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("md-permanent")),(Object)(RemoteObject.createImmutable("full")));
 BA.debugLineNum = 640;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 641;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setplaceholder(RemoteObject __ref,RemoteObject _varplaceholder) throws Exception{
try {
		Debug.PushSubsStack("SetPlaceholder (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,82);
if (RapidSub.canDelegate("setplaceholder")) { return __ref.runUserSub(false, "vmelement","setplaceholder", __ref, _varplaceholder);}
Debug.locals.put("varPlaceholder", _varplaceholder);
 BA.debugLineNum = 82;BA.debugLine="Sub SetPlaceholder(varPlaceholder As String) As VM";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 83;BA.debugLine="Element.SetAttrPlaceHolder(varPlaceholder)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattrplaceholder" /*RemoteObject*/ ,(Object)(_varplaceholder));
 BA.debugLineNum = 84;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 85;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPointer (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,964);
if (RapidSub.canDelegate("setpointer")) { return __ref.runUserSub(false, "vmelement","setpointer", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 964;BA.debugLine="Sub SetPointer(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 965;BA.debugLine="Element.SetPointer(True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setpointer" /*RemoteObject*/ ,(Object)(vmelement.__c.getField(true,"True")));
 BA.debugLineNum = 966;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 967;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetPrimary (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,678);
if (RapidSub.canDelegate("setprimary")) { return __ref.runUserSub(false, "vmelement","setprimary", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 678;BA.debugLine="Sub SetPrimary(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 679;BA.debugLine="Element.AddClass(\"md-primary\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-primary")));
 BA.debugLineNum = 680;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 681;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetRef (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,244);
if (RapidSub.canDelegate("setref")) { return __ref.runUserSub(false, "vmelement","setref", __ref, _varref);}
Debug.locals.put("varRef", _varref);
 BA.debugLineNum = 244;BA.debugLine="Sub SetRef(varRef As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 245;BA.debugLine="If varRef <> \"\" Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("!",_varref,BA.ObjectToString(""))) { 
 BA.debugLineNum = 246;BA.debugLine="SetAttr(CreateMap(\"ref\": varRef))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("ref")),(_varref)}))));
 };
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
public static RemoteObject  _setrequired(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRequired (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,516);
if (RapidSub.canDelegate("setrequired")) { return __ref.runUserSub(false, "vmelement","setrequired", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 516;BA.debugLine="Sub SetRequired(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 517;BA.debugLine="vue.SetStateSingle(reqKey, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_reqkey" /*RemoteObject*/ )),(Object)((_b)));
 BA.debugLineNum = 518;BA.debugLine="Element.SetAttr(\":required\", reqKey)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":required")),(Object)(__ref.getField(true,"_reqkey" /*RemoteObject*/ )));
 BA.debugLineNum = 519;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 520;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setripple(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetRipple (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,527);
if (RapidSub.canDelegate("setripple")) { return __ref.runUserSub(false, "vmelement","setripple", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 527;BA.debugLine="Sub SetRipple(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 528;BA.debugLine="Element.SetAttr(\":md-ripple\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-ripple")),(Object)(BA.ObjectToString(_b)));
 BA.debugLineNum = 529;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 530;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setscrollbar(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetScrollBar (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,556);
if (RapidSub.canDelegate("setscrollbar")) { return __ref.runUserSub(false, "vmelement","setscrollbar", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 556;BA.debugLine="Sub SetScrollBar(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 557;BA.debugLine="Element.AddClass(\"md-scrollbar\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-scrollbar")));
 BA.debugLineNum = 558;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 559;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsize(RemoteObject __ref,RemoteObject _s) throws Exception{
try {
		Debug.PushSubsStack("SetSize (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,798);
if (RapidSub.canDelegate("setsize")) { return __ref.runUserSub(false, "vmelement","setsize", __ref, _s);}
RemoteObject _eachcell = RemoteObject.createImmutable(0);
RemoteObject _actsize = RemoteObject.createImmutable(0);
Debug.locals.put("s", _s);
 BA.debugLineNum = 798;BA.debugLine="Sub SetSize(s As Int) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 799;BA.debugLine="Dim eachCell As Double = 8.33";
Debug.JustUpdateDeviceLine();
_eachcell = BA.numberCast(double.class, 8.33);Debug.locals.put("eachCell", _eachcell);Debug.locals.put("eachCell", _eachcell);
 BA.debugLineNum = 800;BA.debugLine="Dim actSize As Double = s * BANano.parseFloat(eac";
Debug.JustUpdateDeviceLine();
_actsize = RemoteObject.solve(new RemoteObject[] {_s,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_eachcell)))}, "*",0, 0);Debug.locals.put("actSize", _actsize);Debug.locals.put("actSize", _actsize);
 BA.debugLineNum = 801;BA.debugLine="actSize = Round(BANano.parseFloat(actSize))";
Debug.JustUpdateDeviceLine();
_actsize = BA.numberCast(double.class, vmelement.__c.runMethod(true,"Round",(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_actsize))))));Debug.locals.put("actSize", _actsize);
 BA.debugLineNum = 802;BA.debugLine="Element.AddClass($\"md-size-${actSize}\"$)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)((RemoteObject.concat(RemoteObject.createImmutable("md-size-"),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_actsize))),RemoteObject.createImmutable("")))));
 BA.debugLineNum = 803;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 804;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsizes(RemoteObject __ref,RemoteObject _xsmall,RemoteObject _small,RemoteObject _medium,RemoteObject _large,RemoteObject _xlarge) throws Exception{
try {
		Debug.PushSubsStack("SetSizes (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,752);
if (RapidSub.canDelegate("setsizes")) { return __ref.runUserSub(false, "vmelement","setsizes", __ref, _xsmall, _small, _medium, _large, _xlarge);}
RemoteObject _sizes = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.List");
RemoteObject _eachcell = RemoteObject.createImmutable(0);
RemoteObject _eachsize = RemoteObject.createImmutable("");
RemoteObject _xsmalld = RemoteObject.createImmutable(0);
RemoteObject _smalld = RemoteObject.createImmutable(0);
RemoteObject _mediumd = RemoteObject.createImmutable(0);
RemoteObject _larged = RemoteObject.createImmutable(0);
RemoteObject _xlarged = RemoteObject.createImmutable(0);
RemoteObject _strsizes = RemoteObject.createImmutable("");
Debug.locals.put("xsmall", _xsmall);
Debug.locals.put("small", _small);
Debug.locals.put("medium", _medium);
Debug.locals.put("large", _large);
Debug.locals.put("xlarge", _xlarge);
 BA.debugLineNum = 752;BA.debugLine="Sub SetSizes(xsmall As Int, small As Int, medium A";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 753;BA.debugLine="Dim sizes As List";
Debug.JustUpdateDeviceLine();
_sizes = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.List");Debug.locals.put("sizes", _sizes);
 BA.debugLineNum = 754;BA.debugLine="sizes.Initialize";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Initialize");
 BA.debugLineNum = 755;BA.debugLine="Dim eachCell As Double = 8.33";
Debug.JustUpdateDeviceLine();
_eachcell = BA.numberCast(double.class, 8.33);Debug.locals.put("eachCell", _eachcell);Debug.locals.put("eachCell", _eachcell);
 BA.debugLineNum = 756;BA.debugLine="Dim eachSize As String";
Debug.JustUpdateDeviceLine();
_eachsize = RemoteObject.createImmutable("");Debug.locals.put("eachSize", _eachsize);
 BA.debugLineNum = 758;BA.debugLine="If xsmall > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_xsmall,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 759;BA.debugLine="Dim xsmallD As Double = xsmall * BANano.parseFlo";
Debug.JustUpdateDeviceLine();
_xsmalld = RemoteObject.solve(new RemoteObject[] {_xsmall,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_eachcell)))}, "*",0, 0);Debug.locals.put("xsmallD", _xsmalld);Debug.locals.put("xsmallD", _xsmalld);
 BA.debugLineNum = 760;BA.debugLine="xsmallD = Round(BANano.parseFloat(xsmallD))";
Debug.JustUpdateDeviceLine();
_xsmalld = BA.numberCast(double.class, vmelement.__c.runMethod(true,"Round",(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_xsmalld))))));Debug.locals.put("xsmallD", _xsmalld);
 BA.debugLineNum = 761;BA.debugLine="eachSize = 	$\"md-xsmall-size-${xsmallD}\"$";
Debug.JustUpdateDeviceLine();
_eachsize = (RemoteObject.concat(RemoteObject.createImmutable("md-xsmall-size-"),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_xsmalld))),RemoteObject.createImmutable("")));Debug.locals.put("eachSize", _eachsize);
 BA.debugLineNum = 762;BA.debugLine="sizes.Add(eachSize)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)((_eachsize)));
 };
 BA.debugLineNum = 765;BA.debugLine="If small > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_small,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 766;BA.debugLine="Dim smallD As Double = small * BANano.parseFloat";
Debug.JustUpdateDeviceLine();
_smalld = RemoteObject.solve(new RemoteObject[] {_small,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_eachcell)))}, "*",0, 0);Debug.locals.put("smallD", _smalld);Debug.locals.put("smallD", _smalld);
 BA.debugLineNum = 767;BA.debugLine="smallD = Round(BANano.parseFloat(smallD))";
Debug.JustUpdateDeviceLine();
_smalld = BA.numberCast(double.class, vmelement.__c.runMethod(true,"Round",(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_smalld))))));Debug.locals.put("smallD", _smalld);
 BA.debugLineNum = 768;BA.debugLine="eachSize = 	$\"md-small-size-${smallD}\"$";
Debug.JustUpdateDeviceLine();
_eachsize = (RemoteObject.concat(RemoteObject.createImmutable("md-small-size-"),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_smalld))),RemoteObject.createImmutable("")));Debug.locals.put("eachSize", _eachsize);
 BA.debugLineNum = 769;BA.debugLine="sizes.Add(eachSize)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)((_eachsize)));
 };
 BA.debugLineNum = 772;BA.debugLine="If medium > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_medium,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 773;BA.debugLine="Dim mediumD As Double = medium * BANano.parseFlo";
Debug.JustUpdateDeviceLine();
_mediumd = RemoteObject.solve(new RemoteObject[] {_medium,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_eachcell)))}, "*",0, 0);Debug.locals.put("mediumD", _mediumd);Debug.locals.put("mediumD", _mediumd);
 BA.debugLineNum = 774;BA.debugLine="mediumD = Round(BANano.parseFloat(mediumD))";
Debug.JustUpdateDeviceLine();
_mediumd = BA.numberCast(double.class, vmelement.__c.runMethod(true,"Round",(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_mediumd))))));Debug.locals.put("mediumD", _mediumd);
 BA.debugLineNum = 775;BA.debugLine="eachSize = 	$\"md-medium-size-${mediumD}\"$";
Debug.JustUpdateDeviceLine();
_eachsize = (RemoteObject.concat(RemoteObject.createImmutable("md-medium-size-"),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_mediumd))),RemoteObject.createImmutable("")));Debug.locals.put("eachSize", _eachsize);
 BA.debugLineNum = 776;BA.debugLine="sizes.Add(eachSize)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)((_eachsize)));
 };
 BA.debugLineNum = 779;BA.debugLine="If large > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_large,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 780;BA.debugLine="Dim largeD As Double = large * BANano.parseFloat";
Debug.JustUpdateDeviceLine();
_larged = RemoteObject.solve(new RemoteObject[] {_large,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_eachcell)))}, "*",0, 0);Debug.locals.put("largeD", _larged);Debug.locals.put("largeD", _larged);
 BA.debugLineNum = 781;BA.debugLine="largeD = Round(BANano.parseFloat(largeD))";
Debug.JustUpdateDeviceLine();
_larged = BA.numberCast(double.class, vmelement.__c.runMethod(true,"Round",(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_larged))))));Debug.locals.put("largeD", _larged);
 BA.debugLineNum = 782;BA.debugLine="eachSize = 	$\"md-large-size-${largeD}\"$";
Debug.JustUpdateDeviceLine();
_eachsize = (RemoteObject.concat(RemoteObject.createImmutable("md-large-size-"),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_larged))),RemoteObject.createImmutable("")));Debug.locals.put("eachSize", _eachsize);
 BA.debugLineNum = 783;BA.debugLine="sizes.Add(eachSize)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)((_eachsize)));
 };
 BA.debugLineNum = 786;BA.debugLine="If xlarge > 0 Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean(">",_xlarge,BA.numberCast(double.class, 0))) { 
 BA.debugLineNum = 787;BA.debugLine="Dim xlargeD As Double = xlarge * BANano.parseFlo";
Debug.JustUpdateDeviceLine();
_xlarged = RemoteObject.solve(new RemoteObject[] {_xlarge,__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_eachcell)))}, "*",0, 0);Debug.locals.put("xlargeD", _xlarged);Debug.locals.put("xlargeD", _xlarged);
 BA.debugLineNum = 788;BA.debugLine="xlargeD = Round(BANano.parseFloat(xlargeD))";
Debug.JustUpdateDeviceLine();
_xlarged = BA.numberCast(double.class, vmelement.__c.runMethod(true,"Round",(Object)(__ref.getField(false,"_banano" /*RemoteObject*/ ).runMethod(true,"parseFloat",(Object)((_xlarged))))));Debug.locals.put("xlargeD", _xlarged);
 BA.debugLineNum = 789;BA.debugLine="eachSize = 	$\"md-xlarge-size-${xlargeD}\"$";
Debug.JustUpdateDeviceLine();
_eachsize = (RemoteObject.concat(RemoteObject.createImmutable("md-xlarge-size-"),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_xlarged))),RemoteObject.createImmutable("")));Debug.locals.put("eachSize", _eachsize);
 BA.debugLineNum = 790;BA.debugLine="sizes.Add(eachSize)";
Debug.JustUpdateDeviceLine();
_sizes.runVoidMethod ("Add",(Object)((_eachsize)));
 };
 BA.debugLineNum = 793;BA.debugLine="Dim strSizes As String = Element.join(\" \", sizes)";
Debug.JustUpdateDeviceLine();
_strsizes = __ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_join" /*RemoteObject*/ ,(Object)(BA.ObjectToString(" ")),(Object)(_sizes));Debug.locals.put("strSizes", _strsizes);Debug.locals.put("strSizes", _strsizes);
 BA.debugLineNum = 794;BA.debugLine="Element.AddClass(strSizes)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(_strsizes));
 BA.debugLineNum = 795;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 796;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setslot(RemoteObject __ref,RemoteObject _sltvalue) throws Exception{
try {
		Debug.PushSubsStack("SetSlot (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,176);
if (RapidSub.canDelegate("setslot")) { return __ref.runUserSub(false, "vmelement","setslot", __ref, _sltvalue);}
Debug.locals.put("sltValue", _sltvalue);
 BA.debugLineNum = 176;BA.debugLine="Sub SetSlot(sltValue As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 177;BA.debugLine="Element.SetAttr(\"slot\", sltValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("slot")),(Object)(_sltvalue));
 BA.debugLineNum = 178;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 179;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setslotscope(RemoteObject __ref,RemoteObject _sltvalue) throws Exception{
try {
		Debug.PushSubsStack("SetSlotScope (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,186);
if (RapidSub.canDelegate("setslotscope")) { return __ref.runUserSub(false, "vmelement","setslotscope", __ref, _sltvalue);}
Debug.locals.put("sltValue", _sltvalue);
 BA.debugLineNum = 186;BA.debugLine="Sub SetSlotScope(sltValue As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 187;BA.debugLine="Element.SetAttr(\"slot-scope\", sltValue)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("slot-scope")),(Object)(_sltvalue));
 BA.debugLineNum = 188;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 189;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsrc(RemoteObject __ref,RemoteObject _s,RemoteObject _bind) throws Exception{
try {
		Debug.PushSubsStack("SetSRC (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,614);
if (RapidSub.canDelegate("setsrc")) { return __ref.runUserSub(false, "vmelement","setsrc", __ref, _s, _bind);}
Debug.locals.put("s", _s);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 614;BA.debugLine="Sub SetSRC(s As String, bind As Boolean) As VMElem";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 615;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 616;BA.debugLine="SetAttr(CreateMap(\":src\":s))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":src")),(_s)}))));
 }else {
 BA.debugLineNum = 618;BA.debugLine="SetAttr(CreateMap(\"src\":s))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("src")),(_s)}))));
 };
 BA.debugLineNum = 620;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 621;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetStyle (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,413);
if (RapidSub.canDelegate("setstyle")) { return __ref.runUserSub(false, "vmelement","setstyle", __ref, _m);}
Debug.locals.put("m", _m);
 BA.debugLineNum = 413;BA.debugLine="Sub SetStyle(m As Map) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 414;BA.debugLine="Element.SetStyles(m)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setstyles" /*RemoteObject*/ ,(Object)(_m));
 BA.debugLineNum = 415;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 416;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setstylesingle(RemoteObject __ref,RemoteObject _prop,RemoteObject _val) throws Exception{
try {
		Debug.PushSubsStack("SetStyleSingle (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,42);
if (RapidSub.canDelegate("setstylesingle")) { return __ref.runUserSub(false, "vmelement","setstylesingle", __ref, _prop, _val);}
RemoteObject _attr = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("prop", _prop);
Debug.locals.put("val", _val);
 BA.debugLineNum = 42;BA.debugLine="Sub SetStyleSingle(prop As String, val As Object)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 43;BA.debugLine="Dim attr As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_attr = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_attr = vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("attr", _attr);Debug.locals.put("attr", _attr);
 BA.debugLineNum = 44;BA.debugLine="attr.Put(prop, val)";
Debug.JustUpdateDeviceLine();
_attr.runVoidMethod ("Put",(Object)((_prop)),(Object)(_val));
 BA.debugLineNum = 45;BA.debugLine="SetStyle(attr)";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(_attr));
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
public static RemoteObject  _setsubhead(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSubHead (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,690);
if (RapidSub.canDelegate("setsubhead")) { return __ref.runUserSub(false, "vmelement","setsubhead", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 690;BA.debugLine="Sub SetSubHead(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 691;BA.debugLine="Element.AddClass(\"md-subhead\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-subhead")));
 BA.debugLineNum = 692;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 693;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setsubheading(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetSubHeading (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,684);
if (RapidSub.canDelegate("setsubheading")) { return __ref.runUserSub(false, "vmelement","setsubheading", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 684;BA.debugLine="Sub SetSubHeading(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 685;BA.debugLine="Element.AddClass(\"md-subheading\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-subheading")));
 BA.debugLineNum = 686;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 687;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTabIndex (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,113);
if (RapidSub.canDelegate("settabindex")) { return __ref.runUserSub(false, "vmelement","settabindex", __ref, _ti);}
Debug.locals.put("ti", _ti);
 BA.debugLineNum = 113;BA.debugLine="Sub SetTabIndex(ti As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 114;BA.debugLine="Element.SetTabIndex(ti)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settabindex" /*RemoteObject*/ ,(Object)(_ti));
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
public static RemoteObject  _settag(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetTag (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,841);
if (RapidSub.canDelegate("settag")) { return __ref.runUserSub(false, "vmelement","settag", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 841;BA.debugLine="Sub SetTag(t As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 842;BA.debugLine="Element.SetTag(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 843;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 844;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settagappcontent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTagAppContent (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,567);
if (RapidSub.canDelegate("settagappcontent")) { return __ref.runUserSub(false, "vmelement","settagappcontent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 567;BA.debugLine="Sub SetTagAppContent(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 568;BA.debugLine="Element.SetTag(\"md-app-content\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-app-content")));
 BA.debugLineNum = 569;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 570;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settagdialogactions(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTagDialogActions (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,466);
if (RapidSub.canDelegate("settagdialogactions")) { return __ref.runUserSub(false, "vmelement","settagdialogactions", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 466;BA.debugLine="Sub SetTagDialogActions(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 467;BA.debugLine="Element.SetTag(\"md-dialog-actions\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dialog-actions")));
 BA.debugLineNum = 468;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 469;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settagdialogtitle(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTagDialogTitle (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,481);
if (RapidSub.canDelegate("settagdialogtitle")) { return __ref.runUserSub(false, "vmelement","settagdialogtitle", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 481;BA.debugLine="Sub SetTagDialogTitle(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 482;BA.debugLine="Element.SetTag(\"md-dialog-title\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-dialog-title")));
 BA.debugLineNum = 483;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 484;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settagicon(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTagIcon (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,653);
if (RapidSub.canDelegate("settagicon")) { return __ref.runUserSub(false, "vmelement","settagicon", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 653;BA.debugLine="Sub SetTagIcon(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 654;BA.debugLine="Element.SetTag(\"md-icon\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-icon")));
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
public static RemoteObject  _settaglistitem(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTagListItem (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,658);
if (RapidSub.canDelegate("settaglistitem")) { return __ref.runUserSub(false, "vmelement","settaglistitem", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 658;BA.debugLine="Sub SetTagListItem(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 659;BA.debugLine="Element.settag(\"md-list-item\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-list-item")));
 BA.debugLineNum = 660;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 661;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settagspan(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTagSpan (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,663);
if (RapidSub.canDelegate("settagspan")) { return __ref.runUserSub(false, "vmelement","settagspan", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 663;BA.debugLine="Sub SetTagSpan(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 664;BA.debugLine="Element.SetTag(\"span\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("span")));
 BA.debugLineNum = 665;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 666;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settagsubheader(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTagSubHeader (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,697);
if (RapidSub.canDelegate("settagsubheader")) { return __ref.runUserSub(false, "vmelement","settagsubheader", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 697;BA.debugLine="Sub SetTagSubHeader(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 698;BA.debugLine="Element.SetTag(\"md-subheader\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settag" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-subheader")));
 BA.debugLineNum = 699;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 700;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTemplate (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,314);
if (RapidSub.canDelegate("settemplate")) { return __ref.runUserSub(false, "vmelement","settemplate", __ref, _tmp);}
Debug.locals.put("tmp", _tmp);
 BA.debugLineNum = 314;BA.debugLine="Sub SetTemplate(tmp As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 315;BA.debugLine="Element.Clear";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_clear" /*RemoteObject*/ );
 BA.debugLineNum = 316;BA.debugLine="Element.SetText(tmp)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(BA.ObjectToString(_tmp)));
 BA.debugLineNum = 317;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 318;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setterm(RemoteObject __ref,RemoteObject _term) throws Exception{
try {
		Debug.PushSubsStack("SetTerm (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,181);
if (RapidSub.canDelegate("setterm")) { return __ref.runUserSub(false, "vmelement","setterm", __ref, _term);}
Debug.locals.put("term", _term);
 BA.debugLineNum = 181;BA.debugLine="Sub SetTerm(term As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 182;BA.debugLine="Element.SetAttr(\":md-term\", term)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-term")),(Object)(_term));
 BA.debugLineNum = 183;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 184;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetText (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,856);
if (RapidSub.canDelegate("settext")) { return __ref.runUserSub(false, "vmelement","settext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 856;BA.debugLine="Sub SetText(t As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 857;BA.debugLine="Element.SetText(t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_settext" /*RemoteObject*/ ,(Object)(_t));
 BA.debugLineNum = 858;BA.debugLine="hasContent = True";
Debug.JustUpdateDeviceLine();
__ref.setField ("_hascontent" /*RemoteObject*/ ,vmelement.__c.getField(true,"True"));
 BA.debugLineNum = 859;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 860;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTextAlignCenter (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,165);
if (RapidSub.canDelegate("settextaligncenter")) { return __ref.runUserSub(false, "vmelement","settextaligncenter", __ref);}
 BA.debugLineNum = 165;BA.debugLine="Sub SetTextAlignCenter As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 166;BA.debugLine="SetStyle(CreateMap(\"text-align\": \"center\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("text-align")),(RemoteObject.createImmutable("center"))}))));
 BA.debugLineNum = 167;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 168;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settitle(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTitle (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,599);
if (RapidSub.canDelegate("settitle")) { return __ref.runUserSub(false, "vmelement","settitle", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 599;BA.debugLine="Sub SetTitle(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 600;BA.debugLine="Element.AddClass(\"md-title\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-title")));
 BA.debugLineNum = 601;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 602;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetTo (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,495);
if (RapidSub.canDelegate("setto")) { return __ref.runUserSub(false, "vmelement","setto", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 495;BA.debugLine="Sub SetTo(t As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 496;BA.debugLine="Element.SetAttr(\"to\", t)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("to")),(Object)(BA.ObjectToString(_t)));
 BA.debugLineNum = 497;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 498;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _settransparent(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetTransparent (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,609);
if (RapidSub.canDelegate("settransparent")) { return __ref.runUserSub(false, "vmelement","settransparent", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 609;BA.debugLine="Sub SetTransparent(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 610;BA.debugLine="Element.AddClass(\"md-transparent\")";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_addclass" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("md-transparent")));
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
public static RemoteObject  _settype(RemoteObject __ref,RemoteObject _typeof) throws Exception{
try {
		Debug.PushSubsStack("SetType (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,191);
if (RapidSub.canDelegate("settype")) { return __ref.runUserSub(false, "vmelement","settype", __ref, _typeof);}
Debug.locals.put("typeof", _typeof);
 BA.debugLineNum = 191;BA.debugLine="Sub SetType(typeof As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 192;BA.debugLine="Element.SetAttr(\"type\", typeof)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("type")),(Object)(_typeof));
 BA.debugLineNum = 193;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 194;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetValue (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,301);
if (RapidSub.canDelegate("setvalue")) { return __ref.runUserSub(false, "vmelement","setvalue", __ref, _valuename, _bind);}
Debug.locals.put("valueName", _valuename);
Debug.locals.put("bind", _bind);
 BA.debugLineNum = 301;BA.debugLine="Sub SetValue(valueName As String, bind As Boolean)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 302;BA.debugLine="If bind Then";
Debug.JustUpdateDeviceLine();
if (_bind.<Boolean>get().booleanValue()) { 
 BA.debugLineNum = 303;BA.debugLine="RemoveAttr(\"value\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("value")));
 BA.debugLineNum = 304;BA.debugLine="valueName = valueName.tolowercase";
Debug.JustUpdateDeviceLine();
_valuename = _valuename.runMethod(true,"toLowerCase");Debug.locals.put("valueName", _valuename);
 BA.debugLineNum = 305;BA.debugLine="SetAttr(CreateMap(\":value\":valueName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable((":value")),(_valuename)}))));
 }else {
 BA.debugLineNum = 307;BA.debugLine="RemoveAttr(\":value\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable(":value")));
 BA.debugLineNum = 308;BA.debugLine="SetAttr(CreateMap(\"value\":valueName))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("value")),(_valuename)}))));
 };
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
public static RemoteObject  _setvbind(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVBind (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,271);
if (RapidSub.canDelegate("setvbind")) { return __ref.runUserSub(false, "vmelement","setvbind", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 271;BA.debugLine="Sub SetVBind(t As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 272;BA.debugLine="t = t.tolowercase";
Debug.JustUpdateDeviceLine();
_t = _t.runMethod(true,"toLowerCase");Debug.locals.put("t", _t);
 BA.debugLineNum = 273;BA.debugLine="SetAttr(CreateMap(\"v-bind\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-bind")),(_t)}))));
 BA.debugLineNum = 274;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 275;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvbindis(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVBindIs (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,277);
if (RapidSub.canDelegate("setvbindis")) { return __ref.runUserSub(false, "vmelement","setvbindis", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 277;BA.debugLine="Sub SetVBindIs(t As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 278;BA.debugLine="t = t.tolowercase";
Debug.JustUpdateDeviceLine();
_t = _t.runMethod(true,"toLowerCase");Debug.locals.put("t", _t);
 BA.debugLineNum = 279;BA.debugLine="SetAttr(CreateMap(\"v-bind:is\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-bind:is")),(_t)}))));
 BA.debugLineNum = 280;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 281;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVCloak (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,103);
if (RapidSub.canDelegate("setvcloak")) { return __ref.runUserSub(false, "vmelement","setvcloak", __ref);}
 BA.debugLineNum = 103;BA.debugLine="Sub SetVCloak As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 104;BA.debugLine="Element.setvcloak";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setvcloak" /*RemoteObject*/ );
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
public static RemoteObject  _setvelse(RemoteObject __ref,RemoteObject _t) throws Exception{
try {
		Debug.PushSubsStack("SetVElse (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,256);
if (RapidSub.canDelegate("setvelse")) { return __ref.runUserSub(false, "vmelement","setvelse", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 256;BA.debugLine="Sub SetVElse(t As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 257;BA.debugLine="SetAttr(CreateMap(\"v-else\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-else")),_t}))));
 BA.debugLineNum = 258;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 259;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVElseIf (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,261);
if (RapidSub.canDelegate("setvelseif")) { return __ref.runUserSub(false, "vmelement","setvelseif", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 261;BA.debugLine="Sub SetVElseIf(t As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 262;BA.debugLine="SetAttr(CreateMap(\"v-else-if\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-else-if")),_t}))));
 BA.debugLineNum = 263;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 264;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVerticalAlignMiddle (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,628);
if (RapidSub.canDelegate("setverticalalignmiddle")) { return __ref.runUserSub(false, "vmelement","setverticalalignmiddle", __ref);}
 BA.debugLineNum = 628;BA.debugLine="Sub SetVerticalAlignMiddle As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 629;BA.debugLine="SetStyle(CreateMap(\"vertical-align\": \"middle\"))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("vertical-align")),(RemoteObject.createImmutable("middle"))}))));
 BA.debugLineNum = 630;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 631;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVFor (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,290);
if (RapidSub.canDelegate("setvfor")) { return __ref.runUserSub(false, "vmelement","setvfor", __ref, _item, _datasource);}
RemoteObject _sline = RemoteObject.createImmutable("");
Debug.locals.put("item", _item);
Debug.locals.put("dataSource", _datasource);
 BA.debugLineNum = 290;BA.debugLine="Sub SetVFor(item As String, dataSource As String)";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 291;BA.debugLine="dataSource = dataSource.tolowercase";
Debug.JustUpdateDeviceLine();
_datasource = _datasource.runMethod(true,"toLowerCase");Debug.locals.put("dataSource", _datasource);
 BA.debugLineNum = 292;BA.debugLine="item = item.tolowercase";
Debug.JustUpdateDeviceLine();
_item = _item.runMethod(true,"toLowerCase");Debug.locals.put("item", _item);
 BA.debugLineNum = 293;BA.debugLine="If vue.StateExists(dataSource) = False Then vue.S";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_stateexists" /*RemoteObject*/ ,(Object)(_datasource)),vmelement.__c.getField(true,"False"))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(_datasource),(Object)((RemoteObject.createNewArray("Object",new int[] {0},new Object[] {}))));};
 BA.debugLineNum = 294;BA.debugLine="Dim sline As String = $\"${item} in ${dataSource}\"";
Debug.JustUpdateDeviceLine();
_sline = (RemoteObject.concat(RemoteObject.createImmutable(""),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_item))),RemoteObject.createImmutable(" in "),vmelement.__c.runMethod(true,"SmartStringFormatter",(Object)(BA.ObjectToString("")),(Object)((_datasource))),RemoteObject.createImmutable("")));Debug.locals.put("sline", _sline);Debug.locals.put("sline", _sline);
 BA.debugLineNum = 295;BA.debugLine="SetAttr(CreateMap(\"v-for\": sline))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-for")),(_sline)}))));
 BA.debugLineNum = 296;BA.debugLine="RemoveAttr(\"ref\")";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_removeattr" /*RemoteObject*/ ,(Object)(RemoteObject.createImmutable("ref")));
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
public static RemoteObject  _setvhtml(RemoteObject __ref,RemoteObject _h) throws Exception{
try {
		Debug.PushSubsStack("SetVHtml (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,320);
if (RapidSub.canDelegate("setvhtml")) { return __ref.runUserSub(false, "vmelement","setvhtml", __ref, _h);}
Debug.locals.put("h", _h);
 BA.debugLineNum = 320;BA.debugLine="Sub SetVHtml(h As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 321;BA.debugLine="If h = \"\" Then Return Me";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",_h,BA.ObjectToString(""))) { 
if (true) return (__ref);};
 BA.debugLineNum = 322;BA.debugLine="h = h.tolowercase";
Debug.JustUpdateDeviceLine();
_h = _h.runMethod(true,"toLowerCase");Debug.locals.put("h", _h);
 BA.debugLineNum = 323;BA.debugLine="Element.SetAttr(\"v-html\", h)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-html")),(Object)(_h));
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
public static RemoteObject  _setvif(RemoteObject __ref,RemoteObject _vif) throws Exception{
try {
		Debug.PushSubsStack("SetVIf (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,366);
if (RapidSub.canDelegate("setvif")) { return __ref.runUserSub(false, "vmelement","setvif", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 366;BA.debugLine="Sub SetVIf(vif As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 367;BA.debugLine="vif = vif.ToLowerCase";
Debug.JustUpdateDeviceLine();
_vif = _vif.runMethod(true,"toLowerCase");Debug.locals.put("vif", _vif);
 BA.debugLineNum = 368;BA.debugLine="If vue.HasState(vif) = False Then vue.SetStateFal";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_hasstate" /*RemoteObject*/ ,(Object)(_vif)),vmelement.__c.getField(true,"False"))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatefalse" /*RemoteObject*/ ,(Object)(_vif));};
 BA.debugLineNum = 369;BA.debugLine="Element.SetVIf(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setvif" /*RemoteObject*/ ,(Object)((_vif)));
 BA.debugLineNum = 370;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 371;BA.debugLine="End Sub";
Debug.JustUpdateDeviceLine();
return RemoteObject.createImmutable(null);
}
catch (Exception e) {
			throw Debug.ErrorCaught(e);
		} 
finally {
			Debug.PopSubsStack();
		}}
public static RemoteObject  _setvisible(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetVisible (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,77);
if (RapidSub.canDelegate("setvisible")) { return __ref.runUserSub(false, "vmelement","setvisible", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 77;BA.debugLine="Sub SetVisible(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 78;BA.debugLine="vue.SetStateSingle(showKey, b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_showkey" /*RemoteObject*/ )),(Object)((_b)));
 BA.debugLineNum = 79;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 80;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVModel (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,829);
if (RapidSub.canDelegate("setvmodel")) { return __ref.runUserSub(false, "vmelement","setvmodel", __ref, _k);}
RemoteObject _opt = RemoteObject.declareNull("anywheresoftware.b4a.objects.collections.Map");
Debug.locals.put("k", _k);
 BA.debugLineNum = 829;BA.debugLine="Sub SetVModel(k As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 830;BA.debugLine="k = k.tolowercase";
Debug.JustUpdateDeviceLine();
_k = _k.runMethod(true,"toLowerCase");Debug.locals.put("k", _k);
 BA.debugLineNum = 831;BA.debugLine="If vue.HasState(k) = False Then";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_hasstate" /*RemoteObject*/ ,(Object)(_k)),vmelement.__c.getField(true,"False"))) { 
 BA.debugLineNum = 832;BA.debugLine="Dim opt As Map = CreateMap()";
Debug.JustUpdateDeviceLine();
_opt = RemoteObject.createNew ("anywheresoftware.b4a.objects.collections.Map");
_opt = vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {}));Debug.locals.put("opt", _opt);Debug.locals.put("opt", _opt);
 BA.debugLineNum = 833;BA.debugLine="opt.Put(k, Null)";
Debug.JustUpdateDeviceLine();
_opt.runVoidMethod ("Put",(Object)((_k)),(Object)(vmelement.__c.getField(false,"Null")));
 BA.debugLineNum = 834;BA.debugLine="vue.SetState(opt)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstate" /*RemoteObject*/ ,(Object)(_opt));
 };
 BA.debugLineNum = 836;BA.debugLine="Element.SetAttr(\"v-model\", k)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString("v-model")),(Object)(_k));
 BA.debugLineNum = 837;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 838;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVOn (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,266);
if (RapidSub.canDelegate("setvon")) { return __ref.runUserSub(false, "vmelement","setvon", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 266;BA.debugLine="Sub SetVOn(t As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 267;BA.debugLine="SetAttr(CreateMap(\"v-on\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-on")),_t}))));
 BA.debugLineNum = 268;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 269;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVOnce (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,283);
if (RapidSub.canDelegate("setvonce")) { return __ref.runUserSub(false, "vmelement","setvonce", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 283;BA.debugLine="Sub SetVOnce(t As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 284;BA.debugLine="SetAttr(CreateMap(\"v-once\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-once")),_t}))));
 BA.debugLineNum = 285;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 286;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVShow (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,373);
if (RapidSub.canDelegate("setvshow")) { return __ref.runUserSub(false, "vmelement","setvshow", __ref, _vif);}
Debug.locals.put("vif", _vif);
 BA.debugLineNum = 373;BA.debugLine="Sub SetVShow(vif As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 374;BA.debugLine="vif = vif.ToLowerCase";
Debug.JustUpdateDeviceLine();
_vif = _vif.runMethod(true,"toLowerCase");Debug.locals.put("vif", _vif);
 BA.debugLineNum = 375;BA.debugLine="If vue.HasState(vif) = False Then vue.SetStateFal";
Debug.JustUpdateDeviceLine();
if (RemoteObject.solveBoolean("=",__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_hasstate" /*RemoteObject*/ ,(Object)(_vif)),vmelement.__c.getField(true,"False"))) { 
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatefalse" /*RemoteObject*/ ,(Object)(_vif));};
 BA.debugLineNum = 376;BA.debugLine="Element.SetVShow(vif)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setvshow" /*RemoteObject*/ ,(Object)((_vif)));
 BA.debugLineNum = 377;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 378;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetVText (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,251);
if (RapidSub.canDelegate("setvtext")) { return __ref.runUserSub(false, "vmelement","setvtext", __ref, _t);}
Debug.locals.put("t", _t);
 BA.debugLineNum = 251;BA.debugLine="Sub SetVText(t As Object) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 252;BA.debugLine="SetAttr(CreateMap(\"v-text\": t))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setattr" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("v-text")),_t}))));
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
public static RemoteObject  _setwaterfall(RemoteObject __ref,RemoteObject _b) throws Exception{
try {
		Debug.PushSubsStack("SetWaterfall (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,543);
if (RapidSub.canDelegate("setwaterfall")) { return __ref.runUserSub(false, "vmelement","setwaterfall", __ref, _b);}
Debug.locals.put("b", _b);
 BA.debugLineNum = 543;BA.debugLine="Sub SetWaterfall(b As Boolean) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 544;BA.debugLine="Element.SetAttr(\":md-waterfall\", b)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_setattr" /*RemoteObject*/ ,(Object)(BA.ObjectToString(":md-waterfall")),(Object)(BA.ObjectToString(_b)));
 BA.debugLineNum = 545;BA.debugLine="Return Me";
Debug.JustUpdateDeviceLine();
if (true) return (__ref);
 BA.debugLineNum = 546;BA.debugLine="End Sub";
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
		Debug.PushSubsStack("SetWidth (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,134);
if (RapidSub.canDelegate("setwidth")) { return __ref.runUserSub(false, "vmelement","setwidth", __ref, _w);}
Debug.locals.put("w", _w);
 BA.debugLineNum = 134;BA.debugLine="Sub SetWidth(w As String) As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 135;BA.debugLine="SetStyle(CreateMap(\"width\":w))";
Debug.JustUpdateDeviceLine();
__ref.runClassMethod (b4j.example.vmelement.class, "_setstyle" /*RemoteObject*/ ,(Object)(vmelement.__c.runMethod(false, "createMap", (Object)(new RemoteObject[] {RemoteObject.createImmutable(("width")),(_w)}))));
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
public static RemoteObject  _show(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("Show (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,67);
if (RapidSub.canDelegate("show")) { return __ref.runUserSub(false, "vmelement","show", __ref);}
 BA.debugLineNum = 67;BA.debugLine="Sub Show As VMElement";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 68;BA.debugLine="vue.SetStateSingle(showKey, True)";
Debug.JustUpdateDeviceLine();
__ref.getField(false,"_vue" /*RemoteObject*/ ).runClassMethod (b4j.example.bananovue.class, "_setstatesingle" /*RemoteObject*/ ,(Object)(__ref.getField(true,"_showkey" /*RemoteObject*/ )),(Object)((vmelement.__c.getField(true,"True"))));
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
public static RemoteObject  _tostring(RemoteObject __ref) throws Exception{
try {
		Debug.PushSubsStack("ToString (vmelement) ","vmelement",53,__ref.getField(false, "ba"),__ref,884);
if (RapidSub.canDelegate("tostring")) { return __ref.runUserSub(false, "vmelement","tostring", __ref);}
 BA.debugLineNum = 884;BA.debugLine="Sub ToString As String";
Debug.JustUpdateDeviceLine();
 BA.debugLineNum = 885;BA.debugLine="Return Element.tostring";
Debug.JustUpdateDeviceLine();
if (true) return __ref.getField(false,"_element" /*RemoteObject*/ ).runClassMethod (b4j.example.vuehtml.class, "_tostring" /*RemoteObject*/ );
 BA.debugLineNum = 886;BA.debugLine="End Sub";
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